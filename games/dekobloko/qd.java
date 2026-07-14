/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends w {
    w field_Tb;
    static boolean field_Qb;
    static int field_Ob;
    static String[][] field_Pb;
    static int field_Rb;
    static boolean field_Nb;
    private w field_Sb;

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 == 9328) {
          L0: {
            var4 = -param0;
            if (null == ((qd) this).field_Sb) {
              break L0;
            } else {
              var4 = ((qd) this).field_Sb.a(true);
              break L0;
            }
          }
          L1: {
            var5 = -param0;
            if (null != ((qd) this).field_Tb) {
              var5 = ((qd) this).field_Tb.a((byte) 84, -var4 + -param2 + ((qd) this).field_mb - (param0 + param2));
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var6 = param2 + (var5 + param0) + (param2 - -var4);
            if (var6 <= ((qd) this).field_mb) {
              break L2;
            } else {
              var5 = var5 + (((qd) this).field_mb + -var6);
              var6 = ((qd) this).field_mb;
              break L2;
            }
          }
          L3: {
            if (-2 == (((qd) this).field_X ^ -1)) {
              param2 = param2 + (-var6 + ((qd) this).field_mb) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((qd) this).field_X != 2) {
              break L4;
            } else {
              param2 = param2 + (-var6 + ((qd) this).field_mb);
              break L4;
            }
          }
          L5: {
            if (((qd) this).field_Sb != null) {
              ((qd) this).field_Sb.a(var4, 0, 0, ((qd) this).field_N, param2);
              ((qd) this).field_Sb.field_W = ((qd) this).field_W;
              break L5;
            } else {
              break L5;
            }
          }
          if (null != ((qd) this).field_Tb) {
            ((qd) this).field_Tb.a(var5, 0, 0, ((qd) this).field_N, param2 - (-var4 - param0));
            if (((qd) this).field_Sb != null) {
              ((qd) this).field_Tb.field_X = 0;
              ((qd) this).field_Tb.field_W = ((qd) this).field_W;
              return;
            } else {
              ((qd) this).field_Tb.field_X = ((qd) this).field_X;
              ((qd) this).field_Tb.field_W = ((qd) this).field_W;
              return;
            }
          } else {
            return;
          }
        } else {
          L6: {
            field_Pb = null;
            var4 = -param0;
            if (null == ((qd) this).field_Sb) {
              break L6;
            } else {
              var4 = ((qd) this).field_Sb.a(true);
              break L6;
            }
          }
          L7: {
            var5 = -param0;
            if (null != ((qd) this).field_Tb) {
              var5 = ((qd) this).field_Tb.a((byte) 84, -var4 + -param2 + ((qd) this).field_mb - (param0 + param2));
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var6 = param2 + (var5 + param0) + (param2 - -var4);
            if (var6 <= ((qd) this).field_mb) {
              break L8;
            } else {
              var5 = var5 + (((qd) this).field_mb + -var6);
              var6 = ((qd) this).field_mb;
              break L8;
            }
          }
          L9: {
            if (-2 == (((qd) this).field_X ^ -1)) {
              param2 = param2 + (-var6 + ((qd) this).field_mb) / 2;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (((qd) this).field_X != 2) {
              break L10;
            } else {
              param2 = param2 + (-var6 + ((qd) this).field_mb);
              break L10;
            }
          }
          L11: {
            if (((qd) this).field_Sb != null) {
              ((qd) this).field_Sb.a(var4, 0, 0, ((qd) this).field_N, param2);
              ((qd) this).field_Sb.field_W = ((qd) this).field_W;
              break L11;
            } else {
              break L11;
            }
          }
          if (null != ((qd) this).field_Tb) {
            ((qd) this).field_Tb.a(var5, 0, 0, ((qd) this).field_N, param2 - (-var4 - param0));
            if (((qd) this).field_Sb != null) {
              ((qd) this).field_Tb.field_X = 0;
              ((qd) this).field_Tb.field_W = ((qd) this).field_W;
              return;
            } else {
              ((qd) this).field_Tb.field_X = ((qd) this).field_X;
              ((qd) this).field_Tb.field_W = ((qd) this).field_W;
              return;
            }
          } else {
            return;
          }
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var4 = -param1;
        if (param2 != 1940) {
          L0: {
            var6 = null;
            qd.a((String) null, -28);
            var5 = -param1;
            if (((qd) this).field_Sb == null) {
              break L0;
            } else {
              var4 = ((qd) this).field_Sb.a(true);
              break L0;
            }
          }
          L1: {
            if (((qd) this).field_Tb == null) {
              break L1;
            } else {
              var5 = ((qd) this).field_Tb.a(true);
              break L1;
            }
          }
          return param0 + var4 + param0 - -param1 - -var5;
        } else {
          L2: {
            var5 = -param1;
            if (((qd) this).field_Sb == null) {
              break L2;
            } else {
              var4 = ((qd) this).field_Sb.a(true);
              break L2;
            }
          }
          L3: {
            if (((qd) this).field_Tb == null) {
              break L3;
            } else {
              var5 = ((qd) this).field_Tb.a(true);
              break L3;
            }
          }
          return param0 + var4 + param0 - -param1 - -var5;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((qd) this).a(param4, 0, param3, param0, param2);
        this.a(param5, 9328, param1);
        if (param6 != 500) {
            boolean discarded$0 = qd.e(84);
        }
    }

    public static void f(int param0) {
        field_Pb = null;
        if (param0 < 67) {
            boolean discarded$0 = qd.e(-21);
        }
    }

    final static void a(String param0, int param1) {
        int var2 = bh.field_g;
        int var3 = pm.field_f;
        int var4 = ua.field_H.field_J.a(param0, 500);
        int var5 = ua.field_H.field_J.b(param0, 500) + 6;
        int var6 = kf.field_O * var4 - -2;
        int var7 = vh.a(12, -18265, var5, var2);
        int var8 = o.a(20, param1 + 2, var6, var3);
        hk.f(var7, var8, var5, var6, 0);
        hk.a(1 + var7, var8 - -1, var5 - 2, var6 + param1, 16777088);
        int discarded$0 = ua.field_H.field_J.a(param0, 3 + var7, -ua.field_H.field_J.field_R + (wg.field_e + (var8 - -1)), 500, 1000, 0, -1, 0, 0, kf.field_O);
    }

    final static boolean e(int param0) {
        int var1 = 63 % ((79 - param0) / 37);
        return null != vh.field_h ? true : false;
    }

    qd(long param0, w param1, w param2, w param3, ck param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((qd) this).field_Sb = new w(0L, param2);
            ((qd) this).field_Sb.field_I = param4;
            ((qd) this).a(((qd) this).field_Sb, -16834);
        }
        if (param5 != null) {
            ((qd) this).field_Tb = new w(0L, param3, param5);
            ((qd) this).a(((qd) this).field_Tb, -16834);
        }
        ((qd) this).d(-65);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = 4;
        field_Rb = 0;
        field_Pb = new String[][]{new String[2], new String[5], new String[5], new String[5], new String[3]};
    }
}
