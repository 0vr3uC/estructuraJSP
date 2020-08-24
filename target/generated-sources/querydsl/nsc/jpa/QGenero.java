package nsc.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGenero is a Querydsl query type for Genero
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGenero extends EntityPathBase<Genero> {

    private static final long serialVersionUID = 1307087445L;

    public static final QGenero genero1 = new QGenero("genero1");

    public final StringPath genero = createString("genero");

    public final NumberPath<Integer> idGenero = createNumber("idGenero", Integer.class);

    public QGenero(String variable) {
        super(Genero.class, forVariable(variable));
    }

    public QGenero(Path<? extends Genero> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGenero(PathMetadata metadata) {
        super(Genero.class, metadata);
    }

}

