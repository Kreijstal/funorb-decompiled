/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static oh[] field_b;
    static String field_d;
    static hl field_g;
    static ah field_i;
    static ho field_a;
    static boolean field_f;
    static String field_e;
    int field_j;
    static String field_h;
    static String field_c;

    final static void a(int param0) {
        lf.field_b = null;
        if (param0 != 1731) {
            field_a = null;
        }
    }

    final static boolean a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          if (vd.field_a >= 20) {
            if (ac.a(-19403)) {
              if ((pg.field_a ^ -1) < -1) {
                if (wm.b(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var2 = null;
          rm.a(48, (hl) null, 6);
          if (vd.field_a >= 20) {
            if (ac.a(-19403)) {
              if ((pg.field_a ^ -1) < -1) {
                if (wm.b(0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        field_i = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_h = null;
        int var1 = -58 / ((-82 - param0) / 37);
    }

    final static void a(int param0, hl param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pf var8 = null;
        oh var9 = null;
        String var10 = null;
        pf var11 = null;
        oh var12 = null;
        String var13 = null;
        pf var14 = null;
        oh var15 = null;
        String var16 = null;
        pf var17 = null;
        oh var18 = null;
        String var19 = null;
        pf var20 = null;
        oh var21 = null;
        String var22 = null;
        pf var23 = null;
        oh var24 = null;
        String var25 = null;
        pf var26 = null;
        oh var27 = null;
        String var28 = null;
        pf var29 = null;
        oh var30 = null;
        String var31 = null;
        pf var32 = null;
        oh var33 = null;
        String var34 = null;
        pf var35 = null;
        L0: {
          gd.a((String) null, 255, (String) null, param0, (rb) null, (int[]) null, (long)param2, param1, -1);
          if (param0 != 0) {
            break L0;
          } else {
            var8 = hd.field_s;
            var9 = ec.field_n[0];
            var27 = var9;
            var27 = var9;
            var10 = nd.field_Qb;
            var8.field_j.a(11, var9, 0, var10);
            var11 = hd.field_s;
            var12 = ec.field_n[1];
            var27 = var12;
            var27 = var12;
            var13 = uh.field_d;
            var11.field_j.a(12, var12, param2 ^ 0, var13);
            var14 = hd.field_s;
            var15 = ec.field_n[2];
            var27 = var15;
            var27 = var15;
            var16 = df.field_b;
            var14.field_j.a(13, var15, 0, var16);
            break L0;
          }
        }
        L1: {
          if ((param0 ^ -1) != -2) {
            break L1;
          } else {
            var17 = hd.field_s;
            var18 = ec.field_n[0];
            var27 = var18;
            var27 = var18;
            var19 = ji.field_Ob;
            var17.field_j.a(11, var18, param2 + 0, var19);
            var20 = hd.field_s;
            var21 = ec.field_n[1];
            var27 = var21;
            var27 = var21;
            var22 = fj.field_t;
            var20.field_j.a(12, var21, param2 ^ 0, var22);
            var23 = hd.field_s;
            var24 = ec.field_n[2];
            var27 = var24;
            var27 = var24;
            var25 = md.field_H;
            var23.field_j.a(13, var24, 0, var25);
            break L1;
          }
        }
        L2: {
          if ((param0 ^ -1) == -3) {
            var26 = hd.field_s;
            var27 = ec.field_n[0];
            var28 = mb.field_A;
            var26.field_j.a(11, var27, 0, var28);
            var29 = hd.field_s;
            var30 = ec.field_n[1];
            var31 = dk.field_a;
            var29.field_j.a(12, var30, param2 ^ 0, var31);
            var32 = hd.field_s;
            var33 = ec.field_n[2];
            var34 = mc.field_a;
            var32.field_j.a(13, var33, param2 + 0, var34);
            break L2;
          } else {
            break L2;
          }
        }
        var35 = hd.field_s;
        var4 = param1.field_eb;
        var5 = param1.field_z;
        var6 = param1.field_Hb;
        var7 = param1.field_R;
        var35.field_j.a(var6, var5, -127, var7, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Kick";
        field_f = true;
        field_d = "Please log in as a subscribing member to access this feature.";
        field_h = "start using this feature.";
        field_c = "Email (Login):";
    }
}
