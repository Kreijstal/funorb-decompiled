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
        nk var2 = null;
        nk stackIn_1_0 = null;
        nk stackIn_2_0 = null;
        nk stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        nk stackOut_0_0 = null;
        nk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        nk stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = new nk(true);
          stackOut_0_0 = (nk) var2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (nk) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (nk) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((nk) (Object) stackIn_3_0).field_e = stackIn_3_1 != 0;
        if (param0 != -1) {
          il.b((byte) 34);
          return var2;
        } else {
          return var2;
        }
    }

    private final void a(byte param0) {
        if (param0 != 64) {
          nk discarded$2 = il.a(-8, false);
          ((il) this).field_b = 1;
          ((il) this).field_c = ((il) this).field_g.field_b[0].field_d;
          ((il) this).field_d = null;
          return;
        } else {
          ((il) this).field_b = 1;
          ((il) this).field_c = ((il) this).field_g.field_b[0].field_d;
          ((il) this).field_d = null;
          return;
        }
    }

    final static uh a(int param0, int param1, int param2, int param3, int param4) {
        uh var5 = null;
        uh var5_ref = null;
        int var6 = 0;
        uh var7 = null;
        var6 = Main.field_T;
        var5 = (uh) tl.field_a.a((byte) 74);
        L0: while (true) {
          if (var5 == null) {
            var7 = new uh();
            var5_ref = var7;
            var7.field_g = param3;
            var7.field_h = param4;
            var7.field_k = param0;
            if (param2 != 25404) {
              field_f = (char[]) null;
              tl.field_a.a((qb) (Object) var5_ref, 27362);
              ei.a(-91, var5_ref, param1);
              return var5_ref;
            } else {
              tl.field_a.a((qb) (Object) var5_ref, 27362);
              ei.a(-91, var5_ref, param1);
              return var5_ref;
            }
          } else {
            if (((uh) var5).field_g == param3) {
              return var5;
            } else {
              var5 = (uh) tl.field_a.b((byte) -123);
              continue L0;
            }
          }
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Main.field_T;
        if (((il) this).field_g.field_b[((il) this).field_b - 1] == ((il) this).field_c) {
          L0: while (true) {
            if (((il) this).field_b < ((il) this).field_g.field_a) {
              ((il) this).field_b = ((il) this).field_b + 1;
              if (((il) this).field_g.field_b[((il) this).field_b].field_d == ((il) this).field_g.field_b[((il) this).field_b - 1]) {
                ((il) this).field_c = ((il) this).field_g.field_b[-1 + ((il) this).field_b];
                continue L0;
              } else {
                ((il) this).field_c = ((il) this).field_g.field_b[-1 + ((il) this).field_b].field_d;
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
        qb var3 = null;
        qb var4 = null;
        var2 = Main.field_T;
        if (((il) this).field_g.field_b[-1 + ((il) this).field_b] == ((il) this).field_c) {
          L0: while (true) {
            if (((il) this).field_g.field_a > ((il) this).field_b) {
              ((il) this).field_b = ((il) this).field_b + 1;
              var3 = ((il) this).field_g.field_b[((il) this).field_b].field_d;
              if (((il) this).field_g.field_b[((il) this).field_b + -1] == var3) {
                continue L0;
              } else {
                ((il) this).field_d = var3;
                ((il) this).field_c = ((qb) var3).field_d;
                return (Object) (Object) var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((il) this).field_c;
          ((il) this).field_d = var4;
          ((il) this).field_c = ((qb) var4).field_d;
          return (Object) (Object) var4;
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 == 38) {
            return;
        }
        uh discarded$0 = il.a(103, 62, -72, -123, -10);
    }

    public final void remove() {
        if (((il) this).field_d == null) {
            throw new IllegalStateException();
        }
        ((il) this).field_d.c(121);
        ((il) this).field_d = null;
    }

    il(ed param0) {
        ((il) this).field_d = null;
        ((il) this).field_g = param0;
        this.a((byte) 64);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new sg();
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
