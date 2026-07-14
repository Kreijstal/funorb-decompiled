/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    static int field_e;
    static int[][] field_g;
    private boolean field_h;
    private static int[] field_l;
    private static int[] field_a;
    private mg field_f;
    private int field_c;
    private String field_b;
    static float[] field_j;
    static boolean field_n;
    private static int[] field_d;
    private static int[] field_i;
    private boolean field_m;
    static ma field_k;

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 >= 61) {
            break L0;
          } else {
            go.a(91, -85);
            break L0;
          }
        }
        L1: {
          L2: {
            if (pj.b((byte) 114)) {
              break L2;
            } else {
              L3: {
                if (!ll.field_a) {
                  break L3;
                } else {
                  if (!ik.field_f) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean b(byte param0) {
        if (param0 != 58) {
            ((go) this).field_h = false;
        }
        return ((go) this).field_f != null ? true : false;
    }

    final static void b(int param0) {
        int var4 = HoldTheLine.field_D;
        if (param0 > -69) {
            field_g = null;
        }
        int[] var5 = pk.field_I;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
            field_n = false;
        }
        v.field_B = param1;
    }

    final static void a(int param0, int param1, String[] param2, java.applet.Applet param3, int param4, int param5) {
        int var7 = 0;
        int var8 = HoldTheLine.field_D;
        ec.field_z = param3.getParameter("overxgames");
        if (!(ec.field_z != null)) {
            ec.field_z = "0";
        }
        jk.field_r = param3.getParameter("overxachievements");
        if (null == jk.field_r) {
            jk.field_r = "0";
        }
        String var6 = param3.getParameter("currency");
        if (var6 == null) {
            le.field_r = 2;
        } else {
            if (!ik.a((CharSequence) (Object) var6, true)) {
                le.field_r = 2;
            } else {
                le.field_r = mo.a((CharSequence) (Object) var6, (byte) -116);
            }
        }
        ol.field_g = param0;
        t.field_n = param1;
        qe.field_b = param4;
        lf.field_a = new hj[param2.length];
        for (var7 = param5; var7 < param2.length; var7++) {
            lf.field_a[var7] = new hj(317, 34);
        }
        qh.field_b = param2;
    }

    final mg c(byte param0) {
        if (null != ((go) this).field_f) {
            return ((go) this).field_f;
        }
        int var3 = 8 / ((param0 - -58) / 47);
        hj var2 = wd.b(((go) this).field_b, (byte) -63);
        if (var2 != null) {
            ((go) this).field_f = new mg(var2, ((go) this).field_c, ((go) this).field_h, ((go) this).field_m);
        }
        return ((go) this).field_f;
    }

    public static void a(byte param0) {
        field_g = null;
        field_l = null;
        if (param0 > -90) {
            field_e = -50;
        }
        field_a = null;
        field_k = null;
        field_d = null;
        field_i = null;
        field_j = null;
    }

    go(String param0) {
        ((go) this).field_m = false;
        ((go) this).field_b = param0;
        ((go) this).field_c = 4096;
        ((go) this).field_h = false;
        ((go) this).field_f = null;
    }

    go(String param0, int param1, boolean param2, boolean param3) {
        ((go) this).field_b = param0;
        ((go) this).field_m = param3 ? true : false;
        ((go) this).field_h = param2 ? true : false;
        ((go) this).field_f = null;
        ((go) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new float[]{1.0f, 10.0f, 10.0f, 10.0f};
        field_a = new int[]{6, 7};
        field_d = new int[]{3, 2};
        field_i = new int[]{0, 1};
        field_l = new int[]{4, 5};
        field_g = new int[][]{field_i, field_d, field_l, field_a};
    }
}
