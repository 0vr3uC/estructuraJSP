package nsc.jpa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUsuario is a Querydsl query type for Usuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsuario extends EntityPathBase<Usuario> {

    private static final long serialVersionUID = 1812308299L;

    public static final QUsuario usuario = new QUsuario("usuario");

    public final StringPath contraseña = createString("contraseña");

    public final StringPath correo = createString("correo");

    public final NumberPath<Integer> idUsuario = createNumber("idUsuario", Integer.class);

    public final StringPath nombre = createString("nombre");

    public QUsuario(String variable) {
        super(Usuario.class, forVariable(variable));
    }

    public QUsuario(Path<? extends Usuario> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsuario(PathMetadata metadata) {
        super(Usuario.class, metadata);
    }

}

