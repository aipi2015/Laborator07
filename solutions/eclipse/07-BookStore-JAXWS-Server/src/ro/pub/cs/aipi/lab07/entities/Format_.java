package ro.pub.cs.aipi.lab07.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Format.class)
public class Format_ {
	public static volatile SingularAttribute<Format, Long> id;
	public static volatile SingularAttribute<Format, String> value;
	public static volatile SingularAttribute<Format, String> description;
}
