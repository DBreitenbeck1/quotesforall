package co.noblecobra.QuotesForAll.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import co.noblecobra.QuotesForAll.Entity.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

}
