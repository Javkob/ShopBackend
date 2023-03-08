package pl.javkob.shop.admin.category.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.javkob.shop.admin.category.model.AdminCategory;
import pl.javkob.shop.admin.category.repository.AdminCategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminCategoryService {

    private final AdminCategoryRepository adminCategoryRepository;

    public List<AdminCategory> getCategories() {
        return adminCategoryRepository.findAll();
    }

    public AdminCategory getCategory(Long id) {
        return adminCategoryRepository.findById(id).orElseThrow();
    }

    public AdminCategory createCategory(AdminCategory AdminCategory) {
        return adminCategoryRepository.save(AdminCategory);
    }

    public AdminCategory updateCategory(AdminCategory AdminCategory) {
        return adminCategoryRepository.save(AdminCategory);
    }

    public void deleteCategory(Long id) {
        adminCategoryRepository.deleteById(id);
    }
}
