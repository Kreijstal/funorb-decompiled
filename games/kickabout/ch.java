/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends gn {
    private int field_e;
    private int field_m;
    private int field_i;
    private int field_p;
    int field_t;
    static ut field_o;
    int field_k;
    private int field_r;
    private int field_q;
    int field_s;
    int field_l;
    private int field_j;
    private boolean field_n;
    private int field_h;
    int field_f;
    private int field_g;

    final static void a(ut param0, ot param1, ot param2) {
        int var4_int = 0;
        int var5 = Kickabout.field_G;
        try {
            ra.field_L = param1;
            pn.field_w = param2;
            qe.field_i = new ot[73];
            for (var4_int = 0; var4_int < qe.field_i.length; var4_int++) {
                qe.field_i[var4_int] = param2;
            }
            qs.field_R = new ut(32, 32);
            iw.a(-49, qs.field_R);
            var4_int = -88;
            param0.b(0, 0, 32, 32);
            ta.e(123);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ch.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + -123 + ')');
        }
    }

    final void a(iw param0, byte param1) {
        try {
            ((ch) this).field_s = param0.h((byte) -109);
            ((ch) this).field_k = param0.h((byte) -113);
            ((ch) this).field_g = param0.h((byte) -122);
            ((ch) this).field_f = param0.h((byte) -114);
            ((ch) this).field_q = param0.a((byte) 81);
            ((ch) this).field_r = param0.a((byte) 81);
            int var3_int = -82 / ((-7 - param1) / 53);
            ((ch) this).field_t = param0.h((byte) -127);
            ((ch) this).field_i = param0.h((byte) -110);
            ((ch) this).field_n = param0.h((byte) -123) == 1 ? true : false;
            ((ch) this).field_h = param0.h((byte) -105);
            ((ch) this).field_j = param0.h((byte) -120);
            ((ch) this).field_m = param0.a((byte) 81);
            ((ch) this).field_p = param0.a((byte) 81);
            ((ch) this).field_e = param0.h((byte) -118);
            ((ch) this).field_l = param0.a((byte) 81);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ch.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        StringBuilder var1 = null;
        int var2 = 0;
        StringBuilder var3 = null;
        L0: {
          var2 = Kickabout.field_G;
          var3 = new StringBuilder();
          var1 = var3;
          StringBuilder discarded$9 = var3.append(" p=(" + ((ch) this).field_q + "," + ((ch) this).field_r + ")/" + ((ch) this).field_k + "/" + ((ch) this).field_g + "/" + ((ch) this).field_f);
          StringBuilder discarded$10 = var3.append(" b=(" + ((ch) this).field_h + "," + ((ch) this).field_j + ")");
          if (((ch) this).field_t == 0) {
            StringBuilder discarded$11 = var3.append(" !!null!!");
            break L0;
          } else {
            if (2 == ((ch) this).field_t) {
              StringBuilder discarded$12 = var3.append(" cross");
              break L0;
            } else {
              if (((ch) this).field_t != 3) {
                if (((ch) this).field_t != 1) {
                  StringBuilder discarded$13 = var3.append(" invalid_goaltype/" + ((ch) this).field_t);
                  break L0;
                } else {
                  StringBuilder discarded$14 = var3.append(" kick/" + ((ch) this).field_i + "/" + ((ch) this).field_n);
                  break L0;
                }
              } else {
                StringBuilder discarded$15 = var3.append(" header");
                break L0;
              }
            }
          }
        }
        StringBuilder discarded$16 = var3.append(" g=(" + ((ch) this).field_m + "," + ((ch) this).field_p + ")/" + ((ch) this).field_e);
        StringBuilder discarded$17 = var3.append(" time=" + ((ch) this).field_l);
        return "LoggedGoal{" + (Object) (Object) var3 + "}";
    }

    public static void a() {
        field_o = null;
        int var1 = 12;
    }

    final void a(nu param0, int param1, int param2, int param3, nl param4, int param5, nl param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.a(param7, param2, param3, 1, param5, param0, param1 + 87, param8);
              if (param1 == 32) {
                break L1;
              } else {
                ((ch) this).field_j = -65;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ch.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param5).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, ch param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ch) this).field_n = param1.field_n;
              ((ch) this).field_i = param1.field_i;
              ((ch) this).field_e = param1.field_e;
              ((ch) this).field_l = param1.field_l;
              ((ch) this).field_m = param1.field_m;
              ((ch) this).field_p = param1.field_p;
              ((ch) this).field_t = param1.field_t;
              ((ch) this).field_r = param1.field_r;
              ((ch) this).field_k = param1.field_k;
              ((ch) this).field_q = param1.field_q;
              ((ch) this).field_h = param1.field_h;
              ((ch) this).field_g = param1.field_g;
              ((ch) this).field_s = param1.field_s;
              ((ch) this).field_j = param1.field_j;
              if (param0 == -4) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ch.a(-13, (sj) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ch.H(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, nu param5, int param6, int param7) {
        RuntimeException var9 = null;
        nl var10 = null;
        int var11 = 0;
        nl var12 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            var12 = param5.field_P[param2][param7];
            if (param6 >= 109) {
              L1: {
                var10 = param5.field_P[1 - param2][0];
                ((ch) this).field_s = param0;
                ((ch) this).field_k = param2;
                ((ch) this).field_g = param7;
                ((ch) this).field_q = var12.f(-124);
                ((ch) this).field_r = var12.a(true);
                if (param3 == 2) {
                  ((ch) this).field_j = var12.field_m;
                  ((ch) this).field_t = 2;
                  ((ch) this).field_n = false;
                  ((ch) this).field_i = 0;
                  ((ch) this).field_h = var12.field_k;
                  break L1;
                } else {
                  if (3 != param3) {
                    ((ch) this).field_i = param4;
                    ((ch) this).field_h = var12.field_x;
                    ((ch) this).field_t = 1;
                    ((ch) this).field_n = var12.field_O;
                    ((ch) this).field_j = var12.field_P;
                    break L1;
                  } else {
                    ((ch) this).field_t = 3;
                    ((ch) this).field_i = 0;
                    ((ch) this).field_h = var12.field_k;
                    ((ch) this).field_n = false;
                    ((ch) this).field_j = var12.field_m;
                    break L1;
                  }
                }
              }
              ((ch) this).field_m = var10.f(-93);
              ((ch) this).field_p = var10.a(true);
              ((ch) this).field_l = param1;
              ((ch) this).field_e = var10.field_o;
              L2: while (true) {
                L3: {
                  if (127 < Math.abs(((ch) this).field_h)) {
                    break L3;
                  } else {
                    if (Math.abs(((ch) this).field_j) <= 127) {
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                ((ch) this).field_h = ((ch) this).field_h / 2;
                ((ch) this).field_j = ((ch) this).field_j / 2;
                continue L2;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("ch.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(byte param0, int param1, nl param2, int param3, int param4, int param5, int param6, nu param7, nl param8) {
        if (param0 != 35) {
            return;
        }
        try {
            this.a(param1, param4, param6, param5, 0, param7, param0 ^ 91, param3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ch.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, sj param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = param1.a(false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ch.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public ch() {
        ((ch) this).field_t = 0;
    }

    static {
    }
}
