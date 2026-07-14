/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class fe {
    static bd field_c;
    String field_a;
    int field_b;

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(boolean param0) {
        L0: {
          if (jj.field_d != null) {
            jj.field_d.g((byte) -42);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          fe.a((byte) -109);
          te.field_M = new ij();
          ke.field_s.b((ag) (Object) te.field_M, (byte) 110);
          return;
        } else {
          te.field_M = new ij();
          ke.field_s.b((ag) (Object) te.field_M, (byte) 110);
          return;
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 < 80) {
            return null;
        }
        return new java.net.Socket(((fe) this).field_a, ((fe) this).field_b);
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -112) {
            fe.a((byte) 80);
        }
    }

    static {
    }
}
