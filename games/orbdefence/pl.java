/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pl implements Iterator {
    static String field_a;
    static String field_i;
    static String field_h;
    private ca field_c;
    static int field_d;
    private ca field_g;
    private ek field_e;
    private int field_b;
    static String field_f;

    public final boolean hasNext() {
        int var2 = 0;
        var2 = OrbDefence.field_D ? 1 : 0;
        if (((pl) this).field_c == ((pl) this).field_e.field_b[-1 + ((pl) this).field_b]) {
          L0: while (true) {
            if (((pl) this).field_e.field_d > ((pl) this).field_b) {
              ca[] fieldTemp$2 = ((pl) this).field_e.field_b;
              int fieldTemp$3 = ((pl) this).field_b;
              ((pl) this).field_b = ((pl) this).field_b + 1;
              if (fieldTemp$2[fieldTemp$3].field_e != ((pl) this).field_e.field_b[-1 + ((pl) this).field_b]) {
                ((pl) this).field_c = ((pl) this).field_e.field_b[((pl) this).field_b + -1].field_e;
                return true;
              } else {
                ((pl) this).field_c = ((pl) this).field_e.field_b[-1 + ((pl) this).field_b];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        int var2 = 0;
        ca var3 = null;
        ca var4 = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        if (((pl) this).field_e.field_b[((pl) this).field_b - 1] == ((pl) this).field_c) {
          L0: while (true) {
            if (((pl) this).field_b < ((pl) this).field_e.field_d) {
              ca[] fieldTemp$4 = ((pl) this).field_e.field_b;
              int fieldTemp$5 = ((pl) this).field_b;
              ((pl) this).field_b = ((pl) this).field_b + 1;
              var3 = fieldTemp$4[fieldTemp$5].field_e;
              if (((pl) this).field_e.field_b[-1 + ((pl) this).field_b] != var3) {
                ((pl) this).field_c = var3.field_e;
                ((pl) this).field_g = var3;
                return (Object) (Object) var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((pl) this).field_c;
          ((pl) this).field_c = var4.field_e;
          ((pl) this).field_g = var4;
          return (Object) (Object) var4;
        }
    }

    private final void a(byte param0) {
        ((pl) this).field_b = 1;
        ((pl) this).field_c = ((pl) this).field_e.field_b[0].field_e;
        ((pl) this).field_g = null;
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        if (param0 != -1) {
          pl.a(-5);
          field_a = null;
          field_h = null;
          return;
        } else {
          field_a = null;
          field_h = null;
          return;
        }
    }

    pl(ek param0) {
        ((pl) this).field_g = null;
        try {
            ((pl) this).field_e = param0;
            this.a((byte) 103);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "pl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (!(((pl) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((pl) this).field_g.b(57);
        ((pl) this).field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unable to connect to the data server. Please check any firewall you are using.";
        field_i = "Names can only contain letters, numbers, spaces and underscores";
        field_f = "This password contains your email address, and would be easy to guess";
    }
}
