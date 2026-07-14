/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wc implements Iterator {
    static String field_g;
    private ug field_i;
    private int field_c;
    static le[] field_e;
    static le field_h;
    static ad field_d;
    private dc field_b;
    static String field_a;
    private ug field_f;

    private final void a(boolean param0) {
        ((wc) this).field_f = ((wc) this).field_b.field_f[0].field_d;
        if (!param0) {
          return;
        } else {
          ((wc) this).field_i = null;
          ((wc) this).field_c = 1;
          return;
        }
    }

    public final void remove() {
        if (!(null != ((wc) this).field_i)) {
            throw new IllegalStateException();
        }
        ((wc) this).field_i.c(-19822);
        ((wc) this).field_i = null;
    }

    final static aj a(byte param0) {
        String var1 = null;
        L0: {
          var1 = lb.d((byte) -56);
          if (var1 == null) {
            break L0;
          } else {
            if (0 > var1.indexOf('@')) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 <= 90) {
          field_g = null;
          return new aj(lb.d((byte) -56), uk.f(20));
        } else {
          return new aj(lb.d((byte) -56), uk.f(20));
        }
    }

    final static void a(String param0, boolean param1) {
        hf.field_b = param0;
        qh.a(12, true);
        if (!param1) {
            return;
        }
        field_e = null;
    }

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_g = null;
        if (param0 != 67) {
            return;
        }
        field_a = null;
        field_h = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((wc) this).field_b.field_f[-1 + ((wc) this).field_c] == ((wc) this).field_f) {
          L0: while (true) {
            if (((wc) this).field_c < ((wc) this).field_b.field_d) {
              ((wc) this).field_c = ((wc) this).field_c + 1;
              if (((wc) this).field_b.field_f[((wc) this).field_c].field_d == ((wc) this).field_b.field_f[-1 + ((wc) this).field_c]) {
                ((wc) this).field_f = ((wc) this).field_b.field_f[-1 + ((wc) this).field_c];
                continue L0;
              } else {
                ((wc) this).field_f = ((wc) this).field_b.field_f[-1 + ((wc) this).field_c].field_d;
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

    public final Object next() {
        int var2 = 0;
        ug var3 = null;
        ug var4 = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((wc) this).field_f == ((wc) this).field_b.field_f[((wc) this).field_c + -1]) {
          L0: while (true) {
            if (((wc) this).field_c < ((wc) this).field_b.field_d) {
              ((wc) this).field_c = ((wc) this).field_c + 1;
              var3 = ((wc) this).field_b.field_f[((wc) this).field_c].field_d;
              if (var3 == ((wc) this).field_b.field_f[-1 + ((wc) this).field_c]) {
                continue L0;
              } else {
                ((wc) this).field_f = var3.field_d;
                ((wc) this).field_i = var3;
                return (Object) (Object) var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((wc) this).field_f;
          ((wc) this).field_i = var4;
          ((wc) this).field_f = var4.field_d;
          return (Object) (Object) var4;
        }
    }

    final static void a(int param0) {
        if (224 <= re.field_e) {
          qb.a(256, 256);
          if (param0 == -17076) {
            return;
          } else {
            aj discarded$4 = wc.a((byte) -100);
            return;
          }
        } else {
          qb.a(param0 + 17332, re.field_e + 32);
          if (param0 == -17076) {
            return;
          } else {
            aj discarded$5 = wc.a((byte) -100);
            return;
          }
        }
    }

    wc(dc param0) {
        ((wc) this).field_i = null;
        ((wc) this).field_b = param0;
        this.a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Reload game";
        field_a = "Waiting for music";
    }
}
