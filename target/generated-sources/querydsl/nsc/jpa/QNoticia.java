package nsc.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticia is a Querydsl query type for Noticia
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNoticia extends EntityPathBase<Noticia> {

    private static final long serialVersionUID = -220466398L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticia noticia = new QNoticia("noticia");

    public final DateTimePath<java.util.Date> fechaCreacion = createDateTime("fechaCreacion", java.util.Date.class);

    public final QGenero idGenero;

    public final NumberPath<Integer> idNoticia = createNumber("idNoticia", Integer.class);

    public final StringPath texto = createString("texto");

    public final StringPath titulo = createString("titulo");

    public QNoticia(String variable) {
        this(Noticia.class, forVariable(variable), INITS);
    }

    public QNoticia(Path<? extends Noticia> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticia(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticia(PathMetadata metadata, PathInits inits) {
        this(Noticia.class, metadata, inits);
    }

    public QNoticia(Class<? extends Noticia> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.idGenero = inits.isInitialized("idGenero") ? new QGenero(forProperty("idGenero")) : null;
    }

}

