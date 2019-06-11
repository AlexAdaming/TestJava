package com.inti.formation.imetier;
import java.util.List;

public interface IGenericMetier<P,I> {

	public P add(P p);
	public P update(P p);
	public void delete (I id);
	public P findOne(I id);
	public List<P> findAll();

}