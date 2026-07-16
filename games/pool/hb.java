/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements Iterator {
    private ma field_i;
    private int field_o;
    private ma field_m;
    private uk field_h;
    static long[] field_f;
    static ko field_j;
    static String field_c;
    static String field_n;
    static String field_q;
    static String field_b;
    static int field_l;
    static String field_g;
    static String field_d;
    static dd field_k;
    static int field_s;
    static String field_r;
    static int field_a;
    static String field_p;
    static int field_e;

    final static dd[] a(int param0, dd param1) {
        dd[] var3 = new dd[9];
        dd[] var2 = var3;
        var3[4] = param1;
        if (param0 != -32344) {
            field_l = -30;
        }
        return var2;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_q = null;
        }
        field_p = null;
        field_n = null;
        field_q = null;
        field_k = null;
        field_g = null;
        field_f = null;
        field_r = null;
        field_d = null;
        field_j = null;
        field_c = null;
    }

    public final Object next() {
        ma var1 = null;
        int var2 = Pool.field_O;
        if (((hb) this).field_h.field_k[-1 + ((hb) this).field_o] != ((hb) this).field_m) {
            var1 = ((hb) this).field_m;
            ((hb) this).field_i = var1;
            ((hb) this).field_m = var1.field_d;
            return (Object) (Object) var1;
        }
        do {
            if (((hb) this).field_h.field_h <= ((hb) this).field_o) {
                return null;
            }
            int fieldTemp$0 = ((hb) this).field_o;
            ((hb) this).field_o = ((hb) this).field_o + 1;
            var1 = ((hb) this).field_h.field_k[fieldTemp$0].field_d;
        } while (((hb) this).field_h.field_k[((hb) this).field_o - 1] == var1);
        ((hb) this).field_m = var1.field_d;
        ((hb) this).field_i = var1;
        return (Object) (Object) var1;
    }

    final static void a(int param0, vh param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kn var11 = null;
        dd var12 = null;
        String var13 = null;
        kn var14 = null;
        dd var15 = null;
        String var16 = null;
        kn var17 = null;
        dd var18 = null;
        String var19 = null;
        kn var20 = null;
        dd var21 = null;
        String var22 = null;
        kn var23 = null;
        dd var24 = null;
        String var25 = null;
        kn var26 = null;
        dd var27 = null;
        String var28 = null;
        kn var29 = null;
        dd var30 = null;
        String var31 = null;
        kn var32 = null;
        dd var33 = null;
        String var34 = null;
        kn var35 = null;
        dd var36 = null;
        String var37 = null;
        kn var38 = null;
        L0: {
          dr.a((String) null, param2, 0L, -1, (of) null, (String) null, 32540, param1, (int[]) null);
          if (0 == param2) {
            var11 = vl.field_m;
            var12 = sg.field_M[0];
            var30 = var12;
            var30 = var12;
            var13 = ko.field_d;
            var11.field_n.a(11, (byte) 108, var12, var13);
            var14 = vl.field_m;
            var15 = sg.field_M[1];
            var30 = var15;
            var30 = var15;
            var16 = sa.field_j;
            var14.field_n.a(12, (byte) -77, var15, var16);
            var17 = vl.field_m;
            var18 = sg.field_M[2];
            var30 = var18;
            var30 = var18;
            var19 = Pool.field_K;
            var17.field_n.a(13, (byte) -75, var18, var19);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-2 != (param2 ^ -1)) {
            break L1;
          } else {
            var20 = vl.field_m;
            var21 = sg.field_M[0];
            var30 = var21;
            var30 = var21;
            var22 = ra.field_c;
            var20.field_n.a(11, (byte) -87, var21, var22);
            var23 = vl.field_m;
            var24 = sg.field_M[1];
            var30 = var24;
            var30 = var24;
            var25 = md.field_e;
            var23.field_n.a(12, (byte) -119, var24, var25);
            var26 = vl.field_m;
            var27 = sg.field_M[2];
            var30 = var27;
            var30 = var27;
            var28 = op.field_c;
            var26.field_n.a(13, (byte) 82, var27, var28);
            break L1;
          }
        }
        L2: {
          if (param2 == 2) {
            var29 = vl.field_m;
            var30 = sg.field_M[0];
            var31 = kp.field_c;
            var29.field_n.a(11, (byte) -122, var30, var31);
            var32 = vl.field_m;
            var33 = sg.field_M[1];
            var34 = rm.field_a;
            var32.field_n.a(12, (byte) 122, var33, var34);
            var35 = vl.field_m;
            var36 = sg.field_M[2];
            var37 = me.field_v;
            var35.field_n.a(13, (byte) 90, var36, var37);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var38 = vl.field_m;
          var4 = param1.field_sb;
          var5 = param1.field_ib;
          var6 = param1.field_gb;
          var7 = param1.field_Db;
          var38.field_n.c(var6, var7, var4, 0, var5);
          if (param0 == 27937) {
            break L3;
          } else {
            field_n = null;
            break L3;
          }
        }
    }

    public final void remove() {
        if (null == ((hb) this).field_i) {
            throw new IllegalStateException();
        }
        ((hb) this).field_i.a((byte) -117);
        ((hb) this).field_i = null;
    }

    private final void a(byte param0) {
        ((hb) this).field_i = null;
        if (param0 != 43) {
            return;
        }
        ((hb) this).field_m = ((hb) this).field_h.field_k[0].field_d;
        ((hb) this).field_o = 1;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Pool.field_O;
        if (((hb) this).field_h.field_k[-1 + ((hb) this).field_o] == ((hb) this).field_m) {
          L0: while (true) {
            if (((hb) this).field_o >= ((hb) this).field_h.field_h) {
              return false;
            } else {
              int fieldTemp$8 = ((hb) this).field_o;
              ((hb) this).field_o = ((hb) this).field_o + 1;
              if (((hb) this).field_h.field_k[fieldTemp$8].field_d != ((hb) this).field_h.field_k[((hb) this).field_o - 1]) {
                ((hb) this).field_m = ((hb) this).field_h.field_k[-1 + ((hb) this).field_o].field_d;
                return true;
              } else {
                ((hb) this).field_m = ((hb) this).field_h.field_k[((hb) this).field_o - 1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    hb(uk param0) {
        ((hb) this).field_i = null;
        ((hb) this).field_h = param0;
        this.a((byte) 43);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_f = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_n = "Accept unrated rematch";
            field_q = "Mouse Y-axis: Inverted";
            field_b = "Unfortunately you are not eligible to create an account.";
            field_g = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
            field_c = "Reload game";
            field_j = new ko();
            field_d = "Email is valid";
            field_r = "Password is valid";
            field_s = -1;
            field_p = "Instructions";
            field_e = -1;
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                field_f[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = -3932672073523589310L ^ var0 >>> -2002318591;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
