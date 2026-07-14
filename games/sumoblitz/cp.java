/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    mh field_i;
    int field_l;
    int field_m;
    static String field_k;
    mh field_f;
    int field_u;
    int field_d;
    private int field_t;
    mh field_h;
    int field_s;
    mh field_j;
    int field_g;
    vn field_v;
    static int[] field_c;
    mh field_e;
    int field_a;
    mh field_p;
    int field_b;
    private boolean field_o;
    mh field_n;
    int field_r;
    int field_q;

    final static dk a(int param0, String param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        int var2 = param1.length();
        int var3 = -62 / ((-57 - param0) / 48);
        for (var4 = 0; var4 < var2; var4++) {
            var5 = param1.charAt(var4);
            if (var5 < 48) {
                return null;
            }
            if (var5 > 57) {
                return null;
            }
        }
        return gs.field_a;
    }

    final void a(int param0, int param1, int param2, String param3) {
        if (param1 != 13421772) {
            ((cp) this).a(104, 13, -85, (byte) 98, -17);
        }
        if (((cp) this).field_o) {
            this.b(param2, param3, -84, param0);
        } else {
            this.a(param0, param3, param2, -22699);
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        kw.a(param0, param2, 1, param1, param4);
        if (param3 > -57) {
            Object var7 = null;
            ((cp) this).a(-116, 1, -84, (String) null);
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
        if (param3 != -22699) {
            ((cp) this).field_a = 76;
        }
        int var5 = ((cp) this).field_v.a(param1);
        int var6 = ((cp) this).field_v.field_y + ((cp) this).field_v.field_I;
        int var7 = param2;
        if (var7 - -var5 - -6 > lk.field_b) {
            var7 = lk.field_b - (var5 + 6);
        }
        int var8 = 32 + -((cp) this).field_v.field_y + param0;
        if (lk.field_c < 6 + (var8 - -var6)) {
            var8 = -6 + lk.field_c + -var6;
        }
        lk.b(var7, var8, var5 - -6, 6 + var6, ((cp) this).field_t);
        lk.d(var7 + 1, var8 - -1, var5 + 4, 4 + var6, ((cp) this).field_d);
        ((cp) this).field_v.b(param1, var7 - -3, var8 - -3 - -((cp) this).field_v.field_y, ((cp) this).field_t, -1);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        lk.e(param3, param5, param1, param4, param0);
        if (param2) {
            ((cp) this).field_f = null;
        }
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        la.a(param0, param1, var3, 0, var2);
        return var3;
    }

    private final void b(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = Sumoblitz.field_L ? 1 : 0;
          var5 = ((cp) this).field_l + ((cp) this).field_q;
          var6 = ((cp) this).field_s + ((cp) this).field_m;
          var7 = ((cp) this).field_u;
          if (0 != (var7 ^ -1)) {
            break L0;
          } else {
            var7 = ((cp) this).field_v.field_I + ((cp) this).field_v.field_s;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = lk.field_b >> -1186570878;
            var9 = ((cp) this).field_v.a(param1);
            var10 = ((cp) this).field_v.field_s - -((cp) this).field_v.field_I;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (0 != (param1.indexOf("<br>") ^ -1)) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (var8 < var9) {
              var13 = var9 / var8;
              var12 = var8 - -((var9 % var8 + var13 - 1) / var13 * 2);
              break L3;
            } else {
              var12 = var8;
              break L3;
            }
          }
          L4: {
            if (null == qn.field_b) {
              qn.field_b = new String[16];
              break L4;
            } else {
              break L4;
            }
          }
          var11 = ((cp) this).field_v.a(param1, new int[1], qn.field_b);
          var9 = 0;
          var10 = var10 + var7 * (var11 - 1);
          var13 = 0;
          L5: while (true) {
            if (var13 >= var11) {
              break L1;
            } else {
              var14 = ((cp) this).field_v.a(qn.field_b[var13]);
              if (var9 < var14) {
                var9 = var14;
                var13++;
                continue L5;
              } else {
                var13++;
                continue L5;
              }
            }
          }
        }
        L6: {
          var12 = param0;
          var13 = 70 / ((74 - param2) / 40);
          if (lk.field_b >= var5 + var12 - -var9) {
            break L6;
          } else {
            var12 = -var5 + lk.field_b - var9;
            break L6;
          }
        }
        L7: {
          var14 = 32 + (-((cp) this).field_v.field_y + param3);
          if (lk.field_c < var6 + var14 + var10) {
            var14 = -var10 + param3 - var6;
            break L7;
          } else {
            break L7;
          }
        }
        lk.b(var12, var14, var9 + var5, var10 - -var6, ((cp) this).field_r);
        lk.d(var12 - -1, 1 + var14, var5 + var9 - 2, var6 + var10 + -2, ((cp) this).field_d);
        int discarded$1 = ((cp) this).field_v.a(param1, var12 - -((cp) this).field_l, var14 - -((cp) this).field_s, var9, var10, ((cp) this).field_t, -1, 0, 0, var7);
    }

    final void a(vn param0, byte param1) {
        int var7_int = 0;
        int var15 = Sumoblitz.field_L ? 1 : 0;
        gm var17 = new gm(param0, 2, 2, 2236962, 1, 1, 1, param0.field_I + (param0.field_s + 2));
        ((cp) this).field_e = (mh) (Object) var17;
        var17.field_d = 16777215;
        fl var4 = new fl();
        var17.a((gm) (Object) var4, -102);
        ((cp) this).field_s = 3;
        ((cp) this).field_m = 3;
        ((cp) this).field_l = 3;
        ((cp) this).field_d = 5592405;
        ((cp) this).field_v = param0;
        var4.field_b = 15658734;
        ((cp) this).field_r = 15658734;
        ((cp) this).field_q = 3;
        ((cp) this).field_t = 15658734;
        ((cp) this).field_u = -1;
        var4.field_l = 11711154;
        sm discarded$0 = var4.a(false, 0).c(15658734, 17818).a(ta.a(8947848, 92, 10066329, 7829367), 2147483647);
        sm discarded$1 = var4.a(false, 1).a(ta.a(11184810, 126, 10066329, 13421772), 2147483647);
        sm discarded$2 = var4.a(false, 3).a(ta.a(8947848, 97, 7829367, 10066329), 2147483647).a(1, -1).b(1, 1);
        wb[] var5 = new wb[9];
        mg var16 = new mg(32, 32);
        mg var18 = var16;
        for (var7_int = 0; var18.field_C.length > var7_int; var7_int++) {
            var16.field_C[var7_int] = 1077952576;
        }
        if (param1 >= -37) {
            ((cp) this).field_i = null;
        }
        var5[4] = (wb) (Object) var18;
        sm discarded$3 = var4.a(false, 4).a(true, true).a(var5, 2147483647);
        sm discarded$4 = var4.a(false, 5).a(ks.a((byte) -71, 0, 65793, 0, 0), 2147483647).a(true, true).c(-1, 17818);
        ((cp) this).field_h = (mh) (Object) var4;
        fl var6 = new fl(var4, true);
        var6.field_f = 0;
        fl var7 = new fl(var4, true);
        var7.field_f = 0;
        var7.a(ua.a(8947848, -115), 28715);
        sm discarded$5 = var7.a(false, 1).a(ua.a(11184810, -125), 2147483647).c(2236962, 17818);
        ((cp) this).field_i = (mh) (Object) new vg(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        va discarded$6 = new va(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        iu discarded$7 = new iu(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        fl var8 = new fl();
        var17.a((gm) (Object) var8, 107);
        sm discarded$8 = var8.a(false, 0).a(ta.a(15658734, 102, 7829367, 10066329), 2147483647).c(1118481, 17818).d(-1, 30149);
        sm discarded$9 = var8.a(false, 4).a(true, true).a(var5, 2147483647);
        ((cp) this).field_j = (mh) (Object) var8;
        wb[] var9 = new wb[9];
        var9[4] = new wb(2, 1);
        wb[] var10 = new wb[9];
        var10[4] = new wb(1, 2);
        var9[4].field_C = new int[]{6710886, 7829367};
        var10[4].field_C = new int[]{6710886, 7829367};
        fl var11 = new fl();
        fl var12 = new fl();
        var11.a((byte) 116, var9, 0);
        var12.a((byte) 115, var10, 0);
        ((cp) this).field_f = (mh) (Object) var12;
        ((cp) this).field_p = (mh) (Object) var4;
        wb var13 = new wb(7, 4);
        ((cp) this).field_g = 10;
        var13.field_C = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        fl var14 = new fl(var4, true);
        var14.a(-84, var13.b());
        var13.c();
        var14 = new fl(var4, true);
        var14.a(30, var13.b());
        var13.c();
        var14 = new fl(var4, true);
        var14.a(111, var13.b());
        var13.c();
        fl var19 = new fl(var4, true);
        var19.a(-29, var13);
    }

    public static void a(byte param0) {
        if (param0 <= 111) {
            return;
        }
        field_c = null;
        field_k = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        lk.b(param4, param6, param5, param2, param3, param0);
        if (param1 != 3) {
            Object var9 = null;
            byte[] discarded$0 = cp.a((byte[]) null, -45);
        }
    }

    final void b(byte param0) {
        su.a((byte) -59);
        if (param0 >= -63) {
            Object var3 = null;
            byte[] discarded$0 = cp.a((byte[]) null, 126);
        }
    }

    public cp() {
        ((cp) this).field_o = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[128];
        field_k = "Instructions";
    }
}
