/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rf extends u implements pi {
    static hj field_ab;
    private rm field_Z;
    static int field_X;
    static String field_bb;
    static String[] field_Y;

    private final rm a(tb param0, String param1, int param2) {
        rm var4 = null;
        int var5 = 0;
        if (param2 != 25105) {
          field_X = -88;
          var4 = new rm(param1, param0);
          var4.field_l = (dh) (Object) new mo();
          var5 = ((rf) this).field_u - 6;
          ((rf) this).field_u = ((rf) this).field_u + 38;
          var4.a(15, (byte) 122, var5, 30, -16 + (((rf) this).field_x + -14));
          ((rf) this).a(true, (n) (Object) var4);
          ((rf) this).g(113);
          return var4;
        } else {
          var4 = new rm(param1, param0);
          var4.field_l = (dh) (Object) new mo();
          var5 = ((rf) this).field_u - 6;
          ((rf) this).field_u = ((rf) this).field_u + 38;
          var4.a(15, (byte) 122, var5, 30, -16 + (((rf) this).field_x + -14));
          ((rf) this).a(true, (n) (Object) var4);
          ((rf) this).g(113);
          return var4;
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        Object var7 = null;
        if (param2 == -4) {
          if (param1 == ((rf) this).field_Z) {
            this.h((byte) 49);
            return;
          } else {
            return;
          }
        } else {
          var7 = null;
          ((rf) this).a(1, (rm) null, 85, -26, -88);
          if (param1 != ((rf) this).field_Z) {
            return;
          } else {
            this.h((byte) 49);
            return;
          }
        }
    }

    rf(qj param0, h param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        n var6 = null;
        String var7 = null;
        n var8 = null;
        String var9 = null;
        n var10 = null;
        n var11 = null;
        var3 = null;
        if (pk.field_N != param1) {
          if (sk.field_a != param1) {
            L0: {
              if (si.field_nb != param1) {
                break L0;
              } else {
                var3 = hc.field_c;
                ((rf) this).field_u = ((rf) this).field_u + 30;
                break L0;
              }
            }
            var11 = new n(var3, (tb) null);
            var11.field_o = 50;
            var11.field_x = ((rf) this).field_x;
            var11.field_u = 80;
            var11.field_k = 0;
            var11.field_l = (dh) (Object) new dk(mo.field_w, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((rf) this).a(true, var11);
            ((rf) this).field_Z = this.a((tb) this, h.field_f, 25105);
          } else {
            var7 = dk.field_m;
            var3 = var7;
            var3 = var7;
            ((rf) this).field_u = ((rf) this).field_u + 10;
            if (vg.b(true)) {
              var9 = dm.field_c;
              var3 = var9;
              var3 = var9;
              ((rf) this).field_u = ((rf) this).field_u + 20;
              var10 = new n(var9, (tb) null);
              var10.field_o = 50;
              var10.field_x = ((rf) this).field_x;
              var10.field_u = 80;
              var10.field_k = 0;
              var10.field_l = (dh) (Object) new dk(mo.field_w, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((rf) this).a(true, var10);
              ((rf) this).field_Z = this.a((tb) this, h.field_f, 25105);
            } else {
              var8 = new n(var7, (tb) null);
              var8.field_o = 50;
              var8.field_x = ((rf) this).field_x;
              var8.field_u = 80;
              var8.field_k = 0;
              var8.field_l = (dh) (Object) new dk(mo.field_w, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((rf) this).a(true, var8);
              ((rf) this).field_Z = this.a((tb) this, h.field_f, 25105);
            }
          }
        } else {
          var5 = ek.field_w;
          var6 = new n(var5, (tb) null);
          var6.field_o = 50;
          var6.field_x = ((rf) this).field_x;
          var6.field_u = 80;
          var6.field_k = 0;
          var6.field_l = (dh) (Object) new dk(mo.field_w, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((rf) this).a(true, var6);
          ((rf) this).field_Z = this.a((tb) this, h.field_f, 25105);
        }
    }

    public static void m(int param0) {
        field_bb = null;
        if (param0 >= -25) {
            return;
        }
        field_Y = null;
        field_ab = null;
    }

    private final void h(byte param0) {
        if (param0 < 39) {
            return;
        }
        if (!((rf) this).field_F) {
            return;
        }
        ((rf) this).field_F = false;
    }

    final static int a(int param0, Random param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        if ((param0 ^ -1) >= param2) {
            throw new IllegalArgumentException();
        }
        if (!(!bg.a(param2 ^ -6, param0))) {
            return (int)((long)param0 * (4294967295L & (long)param1.nextInt()) >> 1942349152);
        }
        int var3 = -(int)(4294967296L % (long)param0) + -2147483648;
        do {
            var4 = param1.nextInt();
        } while (var4 >= var3);
        return oa.a(param0, var4, param2 + -3247);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = 0;
        field_bb = "Login: ";
        field_Y = new String[]{"1st", "2nd", "3rd", "4th"};
    }
}
