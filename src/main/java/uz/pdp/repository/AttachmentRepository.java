package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
