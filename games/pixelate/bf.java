/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends fa {
    static String[][] field_q;
    static String field_t;
    private int field_n;
    static float field_o;
    private tf field_l;
    static ak field_k;
    private boolean[] field_p;
    static long field_m;
    static int[] field_r;
    private int field_s;

    final static tc a(int param0, fm param1, String param2, fm param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tc stackIn_2_0 = null;
        tc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            stackIn_2_0 = (tc) null;
            return stackIn_2_0;
          }
          var5_int = param3.a(param0 ^ 122, param4);
          var6 = param3.a((byte) -111, param2, var5_int);
          stackIn_4_0 = um.a(param3, param1, var5_int, 121, var6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("bf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_t = null;
        field_k = null;
        field_r = null;
        if (param0 > -72) {
          String var2 = (String) null;
          bf.a(-17, (String) null, (String) null);
        }
        field_q = (String[][]) null;
    }

    final static int[] a(boolean param0) {
        if (param0) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static tf[] a(int param0, String param1, String param2) {
        tf[] var3 = null;
        RuntimeException var3_ref = null;
        tf[] var4 = null;
        tf[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = eh.a(param2, param1, (byte) 47, pf.field_d);
          var3 = var4;
          var4[1].field_A = var4[1].field_F;
          var4[3].field_B = var4[3].field_E;
          var4[7].field_A = var4[7].field_F;
          var4[param0].field_B = var4[5].field_E;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("bf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        if (param0 >= -50) {
          bf.a(true);
        }
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param1) {
          var4++;
        }
        return v.field_a[var4];
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 <= 0 &&
          param2 <= 0) {
          return;
        }
        if (param0 != 0) {
          this.b(116, 75, (byte) -124);
        }
        if (param4 >= 256 &&
          param2 >= 256) {
          this.a(param3, param1, (byte) 98);
        } else {
          t.a(a.field_N);
          this.field_l.c();
          t.d();
          this.a(0, 0, (byte) 98);
          qa.field_f.a(19692);
          t.b(a.field_N);
          fi.a(this.field_l, param1, param3, param4, param2);
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        tf[] stackIn_12_0 = null;
        int stackIn_13_1 = 0;
        tf[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        tf[] stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        tf[] stackIn_26_0 = null;
        int stackIn_27_1 = 0;
        int var4;
        int var5;
        int var6;
        int var9;
        var9 = Pixelate.field_H ? 1 : 0;
        var4 = param1;
        var5 = param0;
        if (param2 != 98) {
          return;
        }
        if (null != fq.field_o) {
          stackIn_5_0 = fo.field_t;
        } else {
          stackIn_5_0 = 0;
        }
        var6 = stackIn_5_0;
        for (var7 = 0; var7 < this.field_s; var7++) {
          for (var8 = 0; var8 < this.field_n; var8++) {
            if (var6 != 0) {
              if (var6 != 256) {
                stackIn_23_0 = rg.field_e.field_a;
                if (this.field_p[var8 + var7 * this.field_n]) {
                  stackIn_24_1 = 1;
                } else {
                  stackIn_24_1 = 0;
                }
                ((tf) (Object) stackIn_23_0[stackIn_24_1]).f(var4, var5);
                stackIn_26_0 = fq.field_o.field_a;
                if (this.field_p[var7 * this.field_n + var8]) {
                  stackIn_27_1 = 1;
                } else {
                  stackIn_27_1 = 0;
                }
                ((tf) (Object) stackIn_26_0[stackIn_27_1]).a(var4, var5, var6);
              } else {
                stackIn_18_0 = fq.field_o.field_a;
                if (this.field_p[var8 + var7 * this.field_n]) {
                  stackIn_19_1 = 1;
                } else {
                  stackIn_19_1 = 0;
                }
                ((tf) (Object) stackIn_18_0[stackIn_19_1]).f(var4, var5);
              }
            } else {
              stackIn_12_0 = rg.field_e.field_a;
              if (!this.field_p[this.field_n * var7 + var8]) {
                stackIn_13_1 = 0;
              } else {
                stackIn_13_1 = 1;
              }
              ((tf) (Object) stackIn_12_0[stackIn_13_1]).f(var4, var5);
            }
            var4 += 16;
          }
          var4 = param1;
          var5 += 16;
        }
        return;
    }

    final void b(int param0, int param1, byte param2) {
        this.a(param1, param0, (byte) 98);
        int var4 = 21 / ((param2 + 66) / 35);
    }

    bf(hh param0) {
        try {
          this.field_p = ad.a(param0, 21922);
          this.field_n = param0.field_f;
          this.field_s = param0.field_a;
          this.field_l = new tf(16 * this.field_n, 16 * this.field_s);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 0L;
        field_t = "Not yet achieved";
        field_r = new int[4];
    }
}
