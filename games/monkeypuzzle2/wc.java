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
        this.field_f = this.field_b.field_f[0].field_d;
        if (!param0) {
          return;
        } else {
          this.field_i = null;
          this.field_c = 1;
          return;
        }
    }

    public final void remove() {
        if (!(null != this.field_i)) {
            throw new IllegalStateException();
        }
        this.field_i.c(-19822);
        this.field_i = null;
    }

    final static aj a(byte param0) {
        String var1;
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
          field_g = (String) null;
          return new aj(lb.d((byte) -56), uk.f(20));
        } else {
          return new aj(lb.d((byte) -56), uk.f(20));
        }
    }

    final static void a(String param0, boolean param1) {
        try {
            hf.field_b = param0;
            qh.a(12, true);
            if (param1) {
                field_e = (le[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "wc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
        int fieldTemp$1 = 0;
        int var2;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_b.field_f[-1 + this.field_c] == this.field_f) {
          L0: while (true) {
            if (this.field_c < this.field_b.field_d) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              if (this.field_b.field_f[fieldTemp$1].field_d == this.field_b.field_f[-1 + this.field_c]) {
                this.field_f = this.field_b.field_f[-1 + this.field_c];
                continue L0;
              } else {
                this.field_f = this.field_b.field_f[-1 + this.field_c].field_d;
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
        int fieldTemp$1 = 0;
        int var2;
        Object var3;
        ug var3_ref;
        ug var4;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_f == this.field_b.field_f[this.field_c + -1]) {
          L0: while (true) {
            if (this.field_c < this.field_b.field_d) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              var3_ref = this.field_b.field_f[fieldTemp$1].field_d;
              if (var3_ref == this.field_b.field_f[-1 + this.field_c]) {
                continue L0;
              } else {
                this.field_f = var3_ref.field_d;
                this.field_i = var3_ref;
                return var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_f;
          this.field_i = var4;
          this.field_f = var4.field_d;
          return var4;
        }
    }

    final static void a(int param0) {
        if (224 <= re.field_e) {
          qb.a(256, 256);
          if (param0 == -17076) {
            return;
          } else {
            wc.a((byte) -100);
            return;
          }
        } else {
          qb.a(param0 + 17332, re.field_e + 32);
          if (param0 == -17076) {
            return;
          } else {
            wc.a((byte) -100);
            return;
          }
        }
    }

    wc(dc param0) {
        this.field_i = null;
        try {
            this.field_b = param0;
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Reload game";
        field_a = "Waiting for music";
    }
}
