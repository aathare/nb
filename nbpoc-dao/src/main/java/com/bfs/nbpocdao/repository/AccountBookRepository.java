package com.bfs.nbpocdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bfs.nbpocdao.entity.AccountBook;


public interface AccountBookRepository extends JpaRepository<AccountBook, Long> {

/*	@Query("from acbk where acmastcode=:glcode and ac_no=:acno  ")
	List<AccountBook>  findByacno(@Param("glcode") Integer glcode, @Param("acno") Integer acno);
*/
}
