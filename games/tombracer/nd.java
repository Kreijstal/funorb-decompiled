/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nd implements Iterator {
    private int field_b;
    private vg field_d;
    private vg field_a;
    private sk field_c;

    final static boolean b(byte param0) {
        if (param0 > -88) {
            return true;
        }
        return !gva.field_b.b(52) ? true : false;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (((nd) this).field_c.field_e[-1 + ((nd) this).field_b] == ((nd) this).field_a) {
          L0: while (true) {
            if (((nd) this).field_c.field_g > ((nd) this).field_b) {
              ((nd) this).field_b = ((nd) this).field_b + 1;
              if (((nd) this).field_c.field_e[((nd) this).field_b].field_a == ((nd) this).field_c.field_e[((nd) this).field_b - 1]) {
                ((nd) this).field_a = ((nd) this).field_c.field_e[-1 + ((nd) this).field_b];
                continue L0;
              } else {
                ((nd) this).field_a = ((nd) this).field_c.field_e[-1 + ((nd) this).field_b].field_a;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(boolean param0) {
        ((nd) this).field_d = null;
        if (!param0) {
          ((nd) this).field_b = -88;
          ((nd) this).field_a = ((nd) this).field_c.field_e[0].field_a;
          ((nd) this).field_b = 1;
          return;
        } else {
          ((nd) this).field_a = ((nd) this).field_c.field_e[0].field_a;
          ((nd) this).field_b = 1;
          return;
        }
    }

    final static void a(byte param0) {
        if (param0 != 55) {
            nd.a((byte) -67);
            gt.a((byte) 46);
            return;
        }
        gt.a((byte) 46);
    }

    final static void a(String param0, int param1) {
        if (param1 != -1) {
            return;
        }
    }

    public final void remove() {
        if (!(((nd) this).field_d != null)) {
            throw new IllegalStateException();
        }
        ((nd) this).field_d.p(105);
        ((nd) this).field_d = null;
    }

    final static void a(int param0, boolean param1) {
        qha.a(0, param1);
        jo.a(true, param1);
        if (param0 != -1) {
            return;
        }
    }

    public final Object next() {
        int var2 = 0;
        vg var3 = null;
        vg var4 = null;
        var2 = TombRacer.field_G ? 1 : 0;
        if (((nd) this).field_a == ((nd) this).field_c.field_e[((nd) this).field_b - 1]) {
          L0: while (true) {
            if (((nd) this).field_b < ((nd) this).field_c.field_g) {
              ((nd) this).field_b = ((nd) this).field_b + 1;
              var3 = ((nd) this).field_c.field_e[((nd) this).field_b].field_a;
              if (var3 != ((nd) this).field_c.field_e[-1 + ((nd) this).field_b]) {
                ((nd) this).field_a = var3.field_a;
                ((nd) this).field_d = var3;
                return (Object) (Object) var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((nd) this).field_a;
          ((nd) this).field_d = var4;
          ((nd) this).field_a = var4.field_a;
          return (Object) (Object) var4;
        }
    }

    nd(sk param0) {
        ((nd) this).field_d = null;
        ((nd) this).field_c = param0;
        this.a(true);
    }

    static {
    }
}
