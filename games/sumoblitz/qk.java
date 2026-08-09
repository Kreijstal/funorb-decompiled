/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends hf implements ai {
    static int field_T;
    private wp field_P;
    private long field_W;
    private wp field_Q;
    private pk field_S;
    static dt field_O;
    static String field_R;
    static int field_U;
    static ri[] field_V;

    final void a(int param0, int param1, pk param2, int param3) {
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
              super.a(param0, 74, param2, param3);
              if (!sl.field_d) {
                break L1;
              } else {
                param2.c((byte) 116);
                break L1;
              }
            }
            L2: {
              var7 = -26 / ((param1 - -25) / 45);
              var5_long = -this.field_W + wq.a(-118);
              var8 = (int)((10999L - var5_long) / 1000L);
              if (var8 > 0) {
                this.field_S.field_m = "" + var8;
                break L2;
              } else {
                ib.d(1);
                this.e(true);
                this.field_E.a((byte) 121, new u(this.field_E, ta.field_f));
                break L2;
              }
            }
            L3: {
              if (!this.field_D) {
                break L3;
              } else {
                if (null == gk.field_o) {
                  this.e(true);
                  this.field_E.a((byte) 97, new u(this.field_E, am.field_e));
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null == gk.field_o) {
                break L4;
              } else {
                if (gk.field_o.field_a) {
                  this.e(true);
                  this.field_E.a((byte) 122, new u(this.field_E, am.field_e));
                  break L4;
                } else {
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

            stackIn_16_1 = new StringBuilder().append("qk.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param3;
            if (-100 == (var5_int ^ -1)) {
              this.field_Q.a((pk) (this), (byte) 61);
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (var5_int ^ -1)) {
                this.field_P.a((pk) (this), (byte) 61);
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 > 9) {
                    break L1;
                  } else {
                    this.field_W = 89L;
                    break L1;
                  }
                }
                stackIn_10_0 = super.a(param0, param1, (byte) 13, param3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("qk.KA(");

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
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    qk(dg param0) {
        super(param0, 200, 200);
        pk var3 = null;
        try {
            this.field_W = wq.a(-97);
            var3 = new pk(ha.field_d, (qm) null);
            var3.field_p = 100;
            var3.field_v = 50;
            var3.field_q = this.field_q;
            var3.field_r = 0;
            var3.field_w = (mh) ((Object) new gm(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var3, 89);
            this.field_S = new pk(ha.field_d, (qm) null);
            this.field_S.field_v = var3.field_p + (var3.field_v + 20);
            this.field_S.field_q = this.field_q;
            this.field_S.field_r = 0;
            this.field_S.field_p = 80;
            this.field_S.field_w = (mh) ((Object) new gm(tq.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(this.field_S, 117);
            this.field_P = this.a((qm) (this), 20556, km.field_m);
            this.field_Q = this.a((qm) (this), 20556, up.field_b);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final wp a(qm param0, int param1, String param2) {
        wp var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new wp(param2, param0);
            var4.field_w = (mh) ((Object) new ue());
            var5 = this.field_p + -6;
            this.field_p = this.field_p + 38;
            var4.a(114, 15, var5, 30, -16 + this.field_q - 14);
            this.a(var4, param1 + -20458);
            if (param1 == 20556) {
              this.c(false);
              stackIn_4_0 = (wp) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("qk.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void e(boolean param0) {
        if (param0) {
          if (!this.field_D) {
            return;
          } else {
            this.field_D = false;
            return;
          }
        } else {
          this.field_W = -123L;
          if (!this.field_D) {
            return;
          } else {
            this.field_D = false;
            return;
          }
        }
    }

    public static void g(byte param0) {
        field_R = null;
        if (param0 != -43) {
            qk.g((byte) -2);
            field_V = null;
            field_O = null;
            return;
        }
        field_V = null;
        field_O = null;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_P == param2) {
                this.e(true);
                break L1;
              } else {
                if (param2 != this.field_Q) {
                  break L1;
                } else {
                  ib.d(param1 ^ 711);
                  this.e(true);
                  break L1;
                }
              }
            }
            if (param1 == 710) {
              break L0;
            } else {
              field_U = 24;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("qk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_T = 0;
        field_R = "Unfortunately we are unable to create an account for you at this time.";
    }
}
