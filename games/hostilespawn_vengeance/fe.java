/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class fe {
    static RgbSprite field_c;
    String field_a;
    int field_b;

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(boolean param0) {
        if (AccountServiceResult.field_d != null) {
          AccountServiceResult.field_d.g((byte) -42);
        }
        if (param0) {
          te.field_M = new ij();
          ke.field_s.b(te.field_M, (byte) 110);
          return;
        }
        fe.clearStaticReferences((byte) -109);
        te.field_M = new ij();
        ke.field_s.b(te.field_M, (byte) 110);
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 < 80) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_a, this.field_b);
    }

    public static void clearStaticReferences(byte param0) {
        field_c = null;
        if (param0 != -112) {
          fe.clearStaticReferences((byte) 80);
        }
    }

    static {
    }
}
