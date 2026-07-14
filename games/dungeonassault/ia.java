/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends ii implements vg {
    private ck field_T;
    static boolean field_O;
    static int[] field_S;
    static int field_X;
    static String field_N;
    static nh field_U;
    static cn field_R;
    static nh field_W;
    private ck field_Z;
    static tk field_K;
    static String field_Y;
    static cn field_Q;
    static int field_M;
    static int[] field_P;
    private ck field_V;

    public ia() {
        super(0, 0, 476, 225, (ca) null);
        ((ia) this).field_V = new ck(qp.field_c, (pg) null);
        ((ia) this).field_Z = new ck(pp.field_I, (pg) null);
        ((ia) this).field_T = new ck(kd.field_b, (pg) null);
        na var1 = new na();
        ((ia) this).field_V.field_o = (ca) (Object) var1;
        ((ia) this).field_Z.field_o = (ca) (Object) var1;
        ((ia) this).field_T.field_o = (ca) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1800621951;
        ((ia) this).field_Z.b(0, var4, -var2 + (-48 + ((ia) this).field_s), -var3 + ((ia) this).field_x >> 1808344065, 30);
        ((ia) this).field_T.b(0, var4, -48 + (((ia) this).field_s + -var2), (((ia) this).field_x + -var3 >> 932698401) - (-var4 + -var2), 30);
        ((ia) this).field_V.b(0, var3, ((ia) this).field_s - 78 + -(2 * var2), ((ia) this).field_x + -var3 >> 907477761, 30);
        ((ia) this).field_Z.field_n = (pg) this;
        ((ia) this).field_V.field_n = (pg) this;
        ((ia) this).field_T.field_n = (pg) this;
        ((ia) this).field_V.field_i = hj.field_U;
        ((ia) this).field_T.field_i = oh.field_n;
        ((ia) this).b((byte) -69, (lm) (Object) ((ia) this).field_Z);
        ((ia) this).b((byte) -75, (lm) (Object) ((ia) this).field_V);
        ((ia) this).b((byte) -120, (lm) (Object) ((ia) this).field_T);
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var7 = 0;
        Object var8 = null;
        var7 = DungeonAssault.field_K;
        if (param1 == 98) {
          if (((ia) this).field_Z != param0) {
            if (((ia) this).field_V != param0) {
              if (param0 != ((ia) this).field_T) {
                return;
              } else {
                kd.a(param1 ^ 102);
                return;
              }
            } else {
              nh.c(true);
              return;
            }
          } else {
            rc.b(112);
            return;
          }
        } else {
          var8 = null;
          boolean discarded$7 = ((ia) this).a((lm) null, 'ﾀ', -77, (byte) 92);
          if (((ia) this).field_Z != param0) {
            if (((ia) this).field_V != param0) {
              if (param0 != ((ia) this).field_T) {
                return;
              } else {
                kd.a(param1 ^ 102);
                return;
              }
            } else {
              nh.c(true);
              return;
            }
          } else {
            rc.b(112);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param1 + ((ia) this).field_q;
        int var6 = param3 + ((ia) this).field_v;
        int discarded$0 = lp.field_C.a(he.field_q, var5 + 20, 20 + var6, ((ia) this).field_x + -40, ((ia) this).field_s + -50, 16777215, -1, 1, 0, lp.field_C.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static cn a(String param0, int param1, String param2, int param3, int param4, String param5, nh param6) {
        byte[] var7 = null;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        var10 = DungeonAssault.field_K;
        if (param3 == 2316) {
          var11 = pi.a(param2, param3 + -2316, param5, param0, param4, param1, param6);
          var7 = var11;
          if (var11 == null) {
            return null;
          } else {
            var8 = new cn(var11, (java.awt.Component) (Object) fi.d(false));
            var9 = 0;
            L0: while (true) {
              if (var8.field_B.length <= var9) {
                return var8;
              } else {
                var8.field_B[var9] = nb.a(var8.field_B[var9], 16777215);
                var9++;
                continue L0;
              }
            }
          }
        } else {
          field_M = -95;
          var11 = pi.a(param2, param3 + -2316, param5, param0, param4, param1, param6);
          var7 = var11;
          if (var11 == null) {
            return null;
          } else {
            var8 = new cn(var11, (java.awt.Component) (Object) fi.d(false));
            var9 = 0;
            L1: while (true) {
              if (var8.field_B.length <= var9) {
                return var8;
              } else {
                var8.field_B[var9] = nb.a(var8.field_B[var9], 16777215);
                var9++;
                continue L1;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_Y = null;
        field_W = null;
        if (!param0) {
          field_O = true;
          field_K = null;
          field_N = null;
          field_S = null;
          field_U = null;
          field_Q = null;
          field_P = null;
          field_R = null;
          return;
        } else {
          field_K = null;
          field_N = null;
          field_S = null;
          field_U = null;
          field_Q = null;
          field_P = null;
          field_R = null;
          return;
        }
    }

    final static String a(int param0, se param1, String param2, int param3) {
        String var4 = null;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param0 < param1.b(param2)) {
          if (param3 != 0) {
            return null;
          } else {
            var4 = "...";
            L0: while (true) {
              param2 = param2.substring(0, -1 + param2.length());
              if (param0 < param1.b(param2 + var4)) {
                continue L0;
              } else {
                return param2 + var4;
              }
            }
          }
        } else {
          return param2;
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        if (!super.a(param0, param1, param2, (byte) 126)) {
          if (98 == param2) {
            return ((ia) this).a(param0, (byte) 71);
          } else {
            if (param3 >= 55) {
              if (-100 == param2) {
                return ((ia) this).a((byte) -5, param0);
              } else {
                return false;
              }
            } else {
              field_U = null;
              if (-100 == param2) {
                return ((ia) this).a((byte) -5, param0);
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new int[4];
        field_Y = "RAID";
        field_O = false;
        field_N = "The <%0> lets loose his first attack with ferocious rage!";
        field_M = 0;
        field_X = 0;
        field_P = wa.b(-1);
        int[] var1 = field_P;
        var1[0] = mp.a(var1[0], 131072);
        int[] var2 = field_P;
        var2[1] = mp.a(var2[1], 8);
    }
}
