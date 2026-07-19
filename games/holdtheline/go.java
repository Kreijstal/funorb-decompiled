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
            this.field_h = false;
        }
        return this.field_f != null ? true : false;
    }

    final static void b(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 <= -69) {
                break L1;
              } else {
                field_g = (int[][]) null;
                break L1;
              }
            }
            var5 = pk.field_I;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "go.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
            field_n = false;
        }
        v.field_B = param1;
    }

    final static void a(int param0, int param1, String[] param2, java.applet.Applet param3, int param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              ec.field_z = param3.getParameter("overxgames");
              if (ec.field_z == null) {
                ec.field_z = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jk.field_r = param3.getParameter("overxachievements");
              if (null != jk.field_r) {
                break L2;
              } else {
                jk.field_r = "0";
                break L2;
              }
            }
            L3: {
              var6 = param3.getParameter("currency");
              if (var6 == null) {
                le.field_r = 2;
                break L3;
              } else {
                if (!ik.a((CharSequence) ((Object) var6), true)) {
                  le.field_r = 2;
                  break L3;
                } else {
                  le.field_r = mo.a((CharSequence) ((Object) var6), (byte) -116);
                  break L3;
                }
              }
            }
            ol.field_g = param0;
            t.field_n = param1;
            qe.field_b = param4;
            lf.field_a = new hj[param2.length];
            var7 = param5;
            L4: while (true) {
              if (var7 >= param2.length) {
                qh.field_b = param2;
                break L0;
              } else {
                lf.field_a[var7] = new hj(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6_ref);
            stackOut_16_1 = new StringBuilder().append("go.G(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final mg c(byte param0) {
        if (null != this.field_f) {
            return this.field_f;
        }
        int var3 = 8 / ((param0 - -58) / 47);
        hj var2 = wd.b(this.field_b, (byte) -63);
        if (var2 != null) {
            this.field_f = new mg(var2, this.field_c, this.field_h, this.field_m);
        }
        return this.field_f;
    }

    public static void a(byte param0) {
        field_g = (int[][]) null;
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
        try {
            this.field_m = false;
            this.field_b = param0;
            this.field_c = 4096;
            this.field_h = false;
            this.field_f = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    go(String param0, int param1, boolean param2, boolean param3) {
        try {
            this.field_b = param0;
            this.field_m = param3 ? true : false;
            this.field_h = param2 ? true : false;
            this.field_f = null;
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_j = new float[]{1.0f, 10.0f, 10.0f, 10.0f};
        field_a = new int[]{6, 7};
        field_d = new int[]{3, 2};
        field_i = new int[]{0, 1};
        field_l = new int[]{4, 5};
        field_g = new int[][]{field_i, field_d, field_l, field_a};
    }
}
