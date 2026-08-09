/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends sp implements ai {
    private wp[] field_H;
    private int field_F;
    private vn field_C;
    private int[] field_D;
    private String field_B;
    static boolean field_A;
    private gt field_G;

    final static void a(byte param0, boolean param1, boolean param2, int param3, int param4, tv param5) {
        Object var6 = null;
        RuntimeException var6_ref = null;
        Throwable var7 = null;
        tv var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var6 = wd.field_f;
          synchronized (var6) {
            L0: {
              if (param5 == nd.field_B) {
                return;
              } else {
                L1: {
                  nd.field_B = param5;
                  if (nd.field_B != null) {
                    qc.field_e.a(param2, param3, 7094, param4, nd.field_B, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 >= 98) {
                    break L2;
                  } else {
                    var8 = (tv) null;
                    lc.a((byte) -110, true, true, 90, -86, (tv) null);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6_ref);

            stackIn_17_1 = new StringBuilder().append("lc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    lc(gt param0, vn param1, String param2) {
        super(0, 0, 288, 0, (mh) null);
        int var4_int = 0;
        this.field_F = 0;
        try {
            this.field_B = param2;
            this.field_G = param0;
            this.field_C = param1;
            var4_int = this.field_B != null ? this.field_C.a(this.field_B, 260, this.field_C.field_s) : 0;
            this.a(-127, 0, 0, 22 - -var4_int, 288);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (null == hu.a(param1, (byte) 109)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("lc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var6;
        super.a(param0, param1, (byte) -118, param3);
        if (param2 >= -35) {
          var6 = (String) null;
          lc.a(false, (String) null);
          this.field_C.a(this.field_B, 14 + this.field_r + param0, this.field_v + (param1 - -10), -28 + this.field_q, this.field_p, 16777215, -1, 0, 0, this.field_C.field_s);
          return;
        } else {
          this.field_C.a(this.field_B, 14 + this.field_r + param0, this.field_v + (param1 - -10), -28 + this.field_q, this.field_p, 16777215, -1, 0, 0, this.field_C.field_s);
          return;
        }
    }

    private final void a(byte param0, int param1) {
        wp[] var3;
        int[] var4;
        int var5;
        int var6;
        wp var7;
        wp[] var8;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param1 <= this.field_F) {
          return;
        } else {
          var8 = new wp[param1];
          var3 = var8;
          if (param0 == -124) {
            var4 = new int[param1];
            var5 = 0;
            L0: while (true) {
              if (this.field_F <= var5) {
                this.field_H = var3;
                this.field_F = param1;
                this.field_D = var4;
                return;
              } else {
                var8[var5] = this.field_H[var5];
                var4[var5] = this.field_D[var5];
                var5++;
                continue L0;
              }
            }
          } else {
            var7 = (wp) null;
            this.a(-17, -108, (wp) null, 120, -53);
            var4 = new int[param1];
            var5 = 0;
            L1: while (true) {
              if (this.field_F <= var5) {
                this.field_H = var3;
                this.field_F = param1;
                this.field_D = var4;
                return;
              } else {
                var8[var5] = this.field_H[var5];
                var4[var5] = this.field_D[var5];
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int var4_int = 0;
        try {
            if (!param2) {
                this.field_B = (String) null;
            }
            var4_int = this.field_F;
            this.a((byte) -124, var4_int - -1);
            this.field_H[var4_int] = this.a(param0, (byte) -123, (qm) (this));
            this.field_D[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "lc.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final wp a(String param0, byte param1, qm param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -123) {
                break L1;
              } else {
                this.a((byte) 29, -68);
                break L1;
              }
            }
            var4 = new wp(param0, param2);
            var4.field_w = (mh) ((Object) new ue());
            var5 = -2 + this.field_p;
            this.a(param1 ^ 62, 0, 0, 34 + this.field_p, this.field_q);
            var4.a(-57, 7, var5, 30, this.field_q + -14);
            this.a(var4, param1 + 241);
            stackIn_3_0 = (wp) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("lc.H(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                var9 = (String) null;
                this.a((String) null, -37, false);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (this.field_F <= var6_int) {
                break L0;
              } else {
                if (this.field_H[var6_int] == param2) {
                  var7 = this.field_D[var6_int];
                  if (-1 == var7) {
                    this.field_G.n(-7);
                    return;
                  } else {
                    rd.a(this.field_D[var6_int], -59);
                    return;
                  }
                } else {
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_A = false;
    }
}
