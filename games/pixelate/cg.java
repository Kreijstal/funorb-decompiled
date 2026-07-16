/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gn {
    static int field_F;
    rn field_G;
    int field_C;
    byte[] field_D;
    static boolean field_I;
    static pb field_H;

    final static String b(boolean param0) {
        if (param0) {
            field_F = -79;
            if (null == kn.field_J) {
                return "";
            }
            return kn.field_J;
        }
        if (null == kn.field_J) {
            return "";
        }
        return kn.field_J;
    }

    public static void i(int param0) {
        if (param0 != 100) {
            return;
        }
        field_H = null;
    }

    final int g(int param0) {
        if (((cg) this).field_v) {
            return 0;
        }
        if (param0 >= -92) {
            ((cg) this).field_C = -114;
            return 100;
        }
        return 100;
    }

    final static void a(byte param0, ak param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wi var11 = null;
        tf var12 = null;
        String var13 = null;
        wi var14 = null;
        tf var15 = null;
        String var16 = null;
        wi var17 = null;
        tf var18 = null;
        String var19 = null;
        wi var20 = null;
        tf var21 = null;
        String var22 = null;
        wi var23 = null;
        tf var24 = null;
        String var25 = null;
        wi var26 = null;
        tf var27 = null;
        String var28 = null;
        wi var29 = null;
        tf var30 = null;
        String var31 = null;
        wi var32 = null;
        tf var33 = null;
        String var34 = null;
        wi var35 = null;
        tf var36 = null;
        String var37 = null;
        wi var38 = null;
        L0: {
          em.a((String) null, 0L, (String) null, -1, param1, -163, (gp) null, (int[]) null, param2);
          if (0 == param2) {
            var11 = eg.field_n;
            var12 = h.field_V[0];
            var30 = var12;
            var30 = var12;
            var13 = dg.field_e;
            var11.field_b.a(0, 11, var12, var13);
            var14 = eg.field_n;
            var15 = h.field_V[1];
            var30 = var15;
            var30 = var15;
            var16 = ap.field_b;
            var14.field_b.a(param0 + 13, 12, var15, var16);
            var17 = eg.field_n;
            var18 = h.field_V[2];
            var30 = var18;
            var30 = var18;
            var19 = uo.field_d;
            var17.field_b.a(0, 13, var18, var19);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (1 != param2) {
            break L1;
          } else {
            var20 = eg.field_n;
            var21 = h.field_V[0];
            var22 = bm.field_m;
            var20.field_b.a(param0 + 13, 11, var21, var22);
            var23 = eg.field_n;
            var24 = h.field_V[1];
            var25 = cl.field_i;
            var23.field_b.a(param0 ^ -13, 12, var24, var25);
            var26 = eg.field_n;
            var27 = h.field_V[2];
            var28 = ec.field_n;
            var26.field_b.a(0, 13, var27, var28);
            break L1;
          }
        }
        L2: {
          if ((param2 ^ -1) != -3) {
            break L2;
          } else {
            var29 = eg.field_n;
            var30 = h.field_V[0];
            var31 = vd.field_b;
            var29.field_b.a(0, 11, var30, var31);
            var32 = eg.field_n;
            var33 = h.field_V[1];
            var34 = ge.field_e;
            var32.field_b.a(0, 12, var33, var34);
            var35 = eg.field_n;
            var36 = h.field_V[2];
            var37 = sf.field_a;
            var35.field_b.a(0, 13, var36, var37);
            break L2;
          }
        }
        var38 = eg.field_n;
        var4 = param1.field_tb;
        var5 = param1.field_gb;
        var6 = param1.field_K;
        var7 = param1.field_nb;
        if (param0 == -13) {
          var38.field_b.b(var7, var4, 91, var5, var6);
          return;
        } else {
          field_H = null;
          var38.field_b.b(var7, var4, 91, var5, var6);
          return;
        }
    }

    final byte[] h(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          if (((cg) this).field_v) {
            throw new RuntimeException();
          } else {
            return ((cg) this).field_D;
          }
        } else {
          var3 = null;
          cg.a((byte) 66, (ak) null, -96);
          if (((cg) this).field_v) {
            throw new RuntimeException();
          } else {
            return ((cg) this).field_D;
          }
        }
    }

    cg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 48;
    }
}
