·       User should able to add/edit the data in the fields.·       User should able to access the sub functionalities like edit, view and download.·       Username should not be empty and should be unique.·       Publisher field should not be empty.·       User should able to download the branches as format of .csv file.·       User should able to view the results in Excel format.·       User should able to filter the data using the drop down menu.

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.test.model.Publications;

public interface PublicationsRepository extends JpaRepository<Publications, Long> {
    
    List<Publications> findByName(String name);
    
    List<Publications> findByDays(String days);
    
    List<Publications> findByPublisher(String publisher);
    
    List<Publications> findByActive(boolean active);
    
    List<Publications> findByNameAndDaysAndPublisherAndActive(String name, String days, String publisher, boolean active);
    
    void saveAndFlush(Publications publications);
    
    void deleteByName(String name);
    
    void deleteByDays(String days);
    
    void deleteByPublisher(String publisher);
    
    void deleteByActive(boolean active);
    
    void deleteByNameAndDaysAndPublisherAndActive(String name, String days, String publisher, boolean active);

}