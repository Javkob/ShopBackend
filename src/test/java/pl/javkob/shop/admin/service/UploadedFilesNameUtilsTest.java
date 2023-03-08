package pl.javkob.shop.admin.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.javkob.shop.admin.product.service.UploadedFilesNameUtils;

import static org.junit.jupiter.api.Assertions.*;

class UploadedFilesNameUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "test test.png, test-test.png",
            "ąęśćżźńłó.png, aesczznlo.png",
            "Produkt 1.png, produkt-1.png"
    })
    void shouldSlugifyFileNAme(String in, String out) {
        String fileName = UploadedFilesNameUtils.slugifyFileName(in);
        assertEquals(fileName, out);
    }

}