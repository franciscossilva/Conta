package ContaBancariaRepository;

import Model.ContaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;

interface ContaBancariaRepository extends JpaRepository<ContaBancaria, Long> {
}
