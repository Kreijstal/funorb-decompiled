/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    private int field_c;
    static double[] field_e;
    private int field_b;
    float field_l;
    private rp[] field_f;
    static String field_m;
    String field_h;
    private int field_k;
    static la field_a;
    static t[] field_i;
    static String field_g;
    static int field_d;
    static int[][] field_j;

    final static up a(String param0, int param1) {
        RuntimeException var2 = null;
        up stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qk.field_q.c(param1 + 484) &&
            !param0.equals(qk.field_q.a((byte) -127))) {
            qk.field_q = ci.a(param1 ^ -120, param0);
          }
          if (param1 != 0) {
            vf.a(-21);
          }
          stackIn_10_0 = qk.field_q;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("vf.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        field_g = null;
        field_i = null;
        if (param0 < 26) {
          return;
        }
        try {
          field_j = (int[][]) null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "vf.F(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        boolean stackIn_3_0 = false;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0;
        rp var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Torquing.field_u;
        try {
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_k >= this.field_c))) {
            var2 = this.field_f[this.field_k];
            stackOut_2_0 = var2.field_a.a(-12749);
            stackIn_38_0 = stackOut_2_0 ? 1 : 0;
            stackIn_3_0 = stackOut_2_0;
            if (var3 == 0) {
              if (!stackIn_3_0) {
                this.a(var2, 0, param0 - 28);
                return false;
              }
              if (var2.field_g >= 0 &&
                !var2.field_a.a((byte) 101, var2.field_g)) {
                this.a(var2, var2.field_a.a(true, var2.field_g), -20);
                return false;
              }
              if (var2.field_c != null &&
                !var2.field_a.a(true, var2.field_c)) {
                this.a(var2, var2.field_a.a((byte) 97, var2.field_c), -93);
                return false;
              }
              if (0 > var2.field_g &&
                null == var2.field_c &&
                var2.field_f != null &&
                !var2.field_a.c(param0 - 19375)) {
                this.a(var2, var2.field_a.a((byte) -32), -100);
                return false;
              }
              this.field_k = this.field_k + 1;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_38_0 = param0;
          }
          if (stackIn_38_0 != 0) {
            this.b(-7);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "vf.E(" + param0 + ')');
        }
    }

    final static void a(of param0, int param1, int param2, boolean param3, byte param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_47_0Lifetime1;
        int stackIn_47_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Torquing.field_u;
        try {
          var5_int = ke.a(3 * (param2 - param1), (byte) -121);
          var6 = param1 * 3;
          var7 = -10 + var5_int;
          wi.a(0);
          if (param0.field_M > 0 &&
            null != param0.field_i) {
            io.b((byte) 78);
          }
          ui.field_k = 0;
          var8 = 0;
          if (param4 <= 110) {
            field_j = (int[][]) null;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.field_R > var8)))) {
            var9 = param0.field_G[var8];
            var10 = param0.field_r[var8];
            var11 = param0.field_I[var8];
            stackOut_12_0 = param3;
            stackIn_56_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = kh.field_m[var9];
                var13 = u.field_w[var9];
                var14 = -var12 + kh.field_m[var10];
                var15 = -var12 + kh.field_m[var11];
                var16 = u.field_w[var10] - var13;
                var17 = -var13 + u.field_w[var11];
              }
              if (!stackIn_13_0 ||
                !(var17 * var14 - var16 * var15 >= 0)) {
                var12Lifetime1 = hl.field_b[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = hl.field_b[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = hl.field_b[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + var12Lifetime1 - (-var13Lifetime1 + var6);
                      if (var7 < 0) {
                        stackIn_36_0 = var15 << -var7;
                      } else {
                        stackIn_36_0 = var15 >> var7;
                      }
                      var16 = -stackIn_36_0 - 1 + u.field_v.length;
                      var17 = u.field_v[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_47_0 = -1;
                          stackIn_47_1 = ~var16;
                          if (stackIn_47_0 < stackIn_47_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = u.field_v[var16];
                          continue;
                        }
                        stackIn_47_0Lifetime1 = var16 << 4;
                        stackIn_47_1Lifetime1 = -var17;
                        var18 = stackIn_47_0Lifetime1 - stackIn_47_1Lifetime1;
                        mn.field_bb[var18] = var8;
                        u.field_v[var16] = 1 + var17;
                        if (param0.field_M > 0 &&
                          param0.field_i != null) {
                          dupTemp$0 = param0.field_i[var8];
                          a.field_f[dupTemp$0] = a.field_f[dupTemp$0] + 1;
                        }
                        ui.field_k = ui.field_k + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_56_0 = 0;
          }
          if (stackIn_56_0 < param0.field_M &&
            param0.field_i != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(a.field_f.length <= var9Lifetime1)) {
              var10Lifetime1 = a.field_f[var9Lifetime1];
              a.field_f[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_72_0 = var5;
          stackIn_72_1 = new StringBuilder().append("vf.C(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(rp param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        float var4_float = 0.0f;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param1 / 100.0f + (float)(this.field_k + 1);
          this.field_l = var4_float * (float)this.field_b / (float)(this.field_c + 1);
          if (param2 >= -18) {
            vf.a((of) null, 80, -3, false, (byte) 99);
          }
          if (param1 == 0) {
            this.field_h = param0.field_e;
            if (Torquing.field_u == 0) {
              return;
            }
          }
          this.field_h = param0.field_f + " - " + param1 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("vf.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private vf() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "vf.<init>()");
        }
    }

    final static boolean a(ki param0, String param1, int param2, boolean param3, int param4, String param5, String param6) {
        nm var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tp.field_h != bh.field_a) {
            return false;
          }
          if (param4 != 7013) {
            return false;
          }
          var7 = new nm(dc.field_a, param0);
          dc.field_a.a(var7, (byte) 91);
          boolean decompiledSharedTail0 = !(mc.b(120));
          if (!decompiledSharedTail0) {
            var7.o(11);
            decompiledSharedTail0 = (Torquing.field_u != 0);
          }
          if (decompiledSharedTail0) {
            bh.field_a = mg.field_b;
            bn.field_i = param3;
            rf.field_u = param6;
            ol.field_a = param5;
            oh.field_d = param2;
            on.field_d = param1;
            ua.field_b = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_17_0 = var7_ref;
          stackIn_17_1 = new StringBuilder().append("vf.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
        field_e = new double[9];
        field_m = "Congratulations! You've completed the free game!";
        field_g = "Waiting for models";
        field_j = new int[][]{new int[]{-63, 4, -1147}, new int[]{120, 79, -994}};
    }
}
