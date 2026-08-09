/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class il implements Iterator {
    private int field_b;
    private ed field_g;
    private qb field_d;
    static sg field_e;
    private qb field_c;
    static mg[] field_a;
    static char[] field_f;

    final static nk a(int param0, boolean param1) {
        nk var2;
        nk stackIn_2_0 = null;
        nk stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var2 = new nk(true);
          stackIn_2_0 = (nk) (var2);

          if (!param1) {
            stackIn_3_0 = (nk) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (nk) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_e = stackIn_3_1 != 0;
        if (param0 != -1) {
          il.b((byte) 34);
          return var2;
        } else {
          return var2;
        }
    }

    private final void a(byte param0) {
        if (param0 != 64) {
          il.a(-8, false);
          this.field_b = 1;
          this.field_c = this.field_g.field_b[0].field_d;
          this.field_d = null;
          return;
        } else {
          this.field_b = 1;
          this.field_c = this.field_g.field_b[0].field_d;
          this.field_d = null;
          return;
        }
    }

    final static uh a(int param0, int param1, int param2, int param3, int param4) {
        uh var5;
        int var6;
        uh var7;
        var6 = Main.field_T;
        var5 = (uh) ((Object) tl.field_a.a((byte) 74));
        L0: while (true) {
          if (var5 == null) {
            var7 = new uh();
            var5 = var7;
            var7.field_g = param3;
            var7.field_h = param4;
            var7.field_k = param0;
            if (param2 != 25404) {
              field_f = (char[]) null;
              tl.field_a.a(var5, 27362);
              ei.a(-91, var5, param1);
              return var5;
            } else {
              tl.field_a.a(var5, 27362);
              ei.a(-91, var5, param1);
              return var5;
            }
          } else {
            if (var5.field_g != param3) {
              var5 = (uh) ((Object) tl.field_a.b((byte) -123));
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    public final boolean hasNext() {
        qb[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2;
        var2 = Main.field_T;
        if (this.field_g.field_b[this.field_b - 1] == this.field_c) {
          L0: while (true) {
            if (this.field_b < this.field_g.field_a) {
              fieldTemp$2 = this.field_g.field_b;
              fieldTemp$3 = this.field_b;
              this.field_b = this.field_b + 1;
              if (fieldTemp$2[fieldTemp$3].field_d == this.field_g.field_b[this.field_b - 1]) {
                this.field_c = this.field_g.field_b[-1 + this.field_b];
                continue L0;
              } else {
                this.field_c = this.field_g.field_b[-1 + this.field_b].field_d;
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
        qb[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2;
        Object var3;
        qb var3_ref;
        qb var4;
        var2 = Main.field_T;
        if (this.field_g.field_b[-1 + this.field_b] == this.field_c) {
          L0: while (true) {
            if (this.field_g.field_a > this.field_b) {
              fieldTemp$2 = this.field_g.field_b;
              fieldTemp$3 = this.field_b;
              this.field_b = this.field_b + 1;
              var3_ref = fieldTemp$2[fieldTemp$3].field_d;
              if (this.field_g.field_b[this.field_b + -1] == var3_ref) {
                continue L0;
              } else {
                this.field_d = var3_ref;
                this.field_c = var3_ref.field_d;
                return var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_c;
          this.field_d = var4;
          this.field_c = var4.field_d;
          return var4;
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 == 38) {
            return;
        }
        il.a(103, 62, -72, -123, -10);
    }

    public final void remove() {
        if (this.field_d == null) {
            throw new IllegalStateException();
        }
        this.field_d.c(121);
        this.field_d = null;
    }

    il(ed param0) {
        this.field_d = null;
        try {
            this.field_g = param0;
            this.a((byte) 64);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new sg();
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
