package recipe.server.recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipe.server.recipes.dto.RecipesDto;
import recipe.server.recipes.entity.Recipes;

import java.util.List;
import java.util.Optional;

public interface RecipesRepository extends JpaRepository<Recipes, Long> {

    Optional<List<Recipes>> findByRecipesTitleContaining(String recipeTitle);
    Optional<List<Recipes>> findAllByOrderByCreatedAtDesc();
}
