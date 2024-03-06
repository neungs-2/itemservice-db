package hello.itemservice.repository.v2;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepositoryV2 extends JpaRepository<Item, Long> {
    List<Item> findAll(ItemSearchCond cond);
}
