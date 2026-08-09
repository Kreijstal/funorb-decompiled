/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends pn implements hh {
    private long field_V;
    private an field_T;
    static String field_X;
    private an field_W;
    private ga field_U;

    nj(dn param0) {
        super(param0, 200, 200);
        ga var3 = null;
        try {
            this.field_V = pd.a(-22826);
            var3 = new ga(ag.field_c, (sk) null);
            var3.field_i = this.field_i;
            var3.field_n = 100;
            var3.field_j = 50;
            var3.field_k = 0;
            var3.field_h = (io) ((Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var3, 10);
            this.field_U = new ga(ag.field_c, (sk) null);
            this.field_U.field_k = 0;
            this.field_U.field_j = 20 + var3.field_n + var3.field_j;
            this.field_U.field_i = this.field_i;
            this.field_U.field_n = 80;
            this.field_U.field_h = (io) ((Object) new vf(rk.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(this.field_U, 10);
            this.field_T = this.a((byte) 32, (sk) (this), ap.field_s);
            this.field_W = this.a((byte) 32, (sk) (this), ki.field_bb);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "nj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            var5_int = -59 % ((-83 - param0) / 32);
            var6 = param1;
            if ((var6 ^ -1) != -100) {
              if (-99 == (var6 ^ -1)) {
                this.field_T.a((byte) 116, (ga) (this));
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_9_0 = super.a(-127, param1, param2, param3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_W.a((byte) 115, (ga) (this));
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("nj.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) 90, param2, param3);
              if (ll.field_a) {
                param0.c((byte) 57);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5_long = pd.a(-22826) - this.field_V;
              var7 = (int)((10999L - var5_long) / 1000L);
              if (0 >= var7) {
                re.a((byte) -71);
                this.g((byte) 35);
                this.field_F.a(new i(this.field_F, rc.field_h), true);
                break L2;
              } else {
                this.field_U.field_o = "" + var7;
                break L2;
              }
            }
            L3: {
              var8 = -48 % ((param1 - 46) / 42);
              if (!this.field_H) {
                break L3;
              } else {
                if (null == cn.field_b) {
                  this.g((byte) -108);
                  this.field_F.a(new i(this.field_F, gf.field_b), true);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == cn.field_b) {
                break L4;
              } else {
                if (!cn.field_b.field_a) {
                  break L4;
                } else {
                  this.g((byte) -121);
                  this.field_F.a(new i(this.field_F, gf.field_b), true);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("nj.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final an a(byte param0, sk param1, String param2) {
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        an stackIn_3_0 = null;
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
              var4 = new an(param2, param1);
              var4.field_h = (io) ((Object) new vm());
              if (param0 == 32) {
                break L1;
              } else {
                this.field_T = (an) null;
                break L1;
              }
            }
            var5 = -6 + this.field_n;
            this.field_n = this.field_n + 38;
            var4.a(-88, var5, 15, this.field_i - 30, 30);
            this.a(var4, 10);
            this.a(true);
            stackIn_3_0 = (an) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("nj.J(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        field_X = null;
        if (param0) {
            nj.b(false);
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -6) {
              if (param2 == this.field_T) {
                this.g((byte) -126);
                return;
              } else {
                if (param2 == this.field_W) {
                  re.a((byte) -71);
                  this.g((byte) 85);
                  return;
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("nj.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void g(byte param0) {
        int var2 = -75 % ((param0 - -62) / 46);
        if (!this.field_H) {
            return;
        }
        this.field_H = false;
    }

    static {
    }
}
