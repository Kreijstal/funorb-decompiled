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
        this.field_V = new ck(qp.field_c, (pg) null);
        this.field_Z = new ck(pp.field_I, (pg) null);
        this.field_T = new ck(kd.field_b, (pg) null);
        na var1 = new na();
        this.field_V.field_o = (ca) ((Object) var1);
        this.field_Z.field_o = (ca) ((Object) var1);
        this.field_T.field_o = (ca) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1800621951;
        this.field_Z.b(0, var4, -var2 + (-48 + this.field_s), -var3 + this.field_x >> 1808344065, 30);
        this.field_T.b(0, var4, -48 + (this.field_s + -var2), (this.field_x + -var3 >> 932698401) - (-var4 + -var2), 30);
        this.field_V.b(0, var3, this.field_s - 78 + -(2 * var2), this.field_x + -var3 >> 907477761, 30);
        this.field_Z.field_n = (pg) (this);
        this.field_V.field_n = (pg) (this);
        this.field_T.field_n = (pg) (this);
        this.field_V.field_i = hj.field_U;
        this.field_T.field_i = oh.field_n;
        this.b((byte) -69, this.field_Z);
        this.b((byte) -75, this.field_V);
        this.b((byte) -120, this.field_T);
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        lm var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1 == 98) {
                break L1;
              } else {
                var8 = (lm) null;
                this.a((lm) null, 'ﾀ', -77, (byte) 92);
                break L1;
              }
            }
            if (this.field_Z != param0) {
              if (this.field_V != param0) {
                if (param0 == this.field_T) {
                  kd.a(param1 ^ 102);
                  break L0;
                } else {
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("ia.FA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param1 + this.field_q;
        int var6 = param3 + this.field_v;
        lp.field_C.a(he.field_q, var5 + 20, 20 + var6, this.field_x + -40, this.field_s + -50, 16777215, -1, 1, 0, lp.field_C.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static cn a(String param0, int param1, String param2, int param3, int param4, String param5, nh param6) {
        byte[] var7 = null;
        RuntimeException var7_ref = null;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        cn stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param3 == 2316) {
                break L1;
              } else {
                field_M = -95;
                break L1;
              }
            }
            var11 = pi.a(param2, param3 + -2316, param5, param0, param4, param1, param6);
            var7 = var11;
            if (var11 != null) {
              var8 = new cn(var11, (java.awt.Component) ((Object) fi.d(false)));
              var9 = 0;
              L2: while (true) {
                if (var8.field_B.length <= var9) {
                  stackIn_10_0 = (cn) (var8);
                  break L0;
                } else {
                  var8.field_B[var9] = nb.a(var8.field_B[var9], 16777215);
                  var9++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var7_ref);

            stackIn_13_1 = new StringBuilder().append("ia.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_23_2 + ')');
        }
        return stackIn_10_0;
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
        RuntimeException var4_ref = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 < param1.b(param2)) {
              if (param3 == 0) {
                var4 = "...";
                L1: while (true) {
                  param2 = param2.substring(0, -1 + param2.length());
                  if (param0 < param1.b(param2 + var4)) {
                    continue L1;
                  } else {
                    stackIn_10_0 = param2 + var4;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("ia.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 126)) {
              if (98 == param2) {
                stackIn_6_0 = this.a(param0, (byte) 71);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param3 >= 55) {
                    break L1;
                  } else {
                    field_U = (nh) null;
                    break L1;
                  }
                }
                if (-100 != (param2 ^ -1)) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = this.a((byte) -5, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("ia.W(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    static {
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
