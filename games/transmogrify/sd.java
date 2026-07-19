/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends bi {
    static String field_V;
    private String field_U;
    static String field_Q;
    private String field_P;
    private boolean field_T;
    private boolean field_S;
    private qe field_R;

    final void a(int param0, byte param1, int param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        super.a(param0, (byte) -127, param2);
        rh.field_q.c(this.field_P, (this.field_l >> 214208577) + param2, 103 + param0, 16777215, -1);
        if (param1 <= -79) {
          if (null != this.field_U) {
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            discarded$2 = rh.field_q.a(this.field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
          } else {
            return;
          }
        } else {
          this.field_T = false;
          if (null == this.field_U) {
            return;
          } else {
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            discarded$3 = rh.field_q.a(this.field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
          }
        }
    }

    final void r(int param0) {
        int var2 = -126 / ((param0 - 54) / 62);
        this.field_R.field_w = false;
        this.field_T = true;
    }

    sd(da param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_U = param1;
            if (this.field_U != null) {
                var3_int = rh.field_q.a(this.field_U, 260, rh.field_q.field_y);
                this.a(300, var3_int + 150, false);
            }
            this.field_R = new qe(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_R.field_w = true;
            this.field_T = false;
            this.field_S = false;
            this.a((qg) (this.field_R), (byte) -120);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void q(int param0) {
        if (param0 != 274) {
            field_V = (String) null;
        }
    }

    final void a(boolean param0, String param1, byte param2, float param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (this.field_S) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_6_0 == stackIn_6_1) {
                break L3;
              } else {
                L4: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (!param0) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L4;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L4;
                  }
                }
                ((sd) (this)).field_S = stackIn_10_1 != 0;
                if (this.field_S) {
                  this.field_R.a(true, 4210752, 8405024);
                  this.field_R.field_w = true;
                  break L3;
                } else {
                  this.field_R.a(true, 4210752, 2113632);
                  if (!this.field_T) {
                    break L3;
                  } else {
                    this.field_R.field_w = false;
                    if (!Transmogrify.field_A) {
                      break L3;
                    } else {
                      this.field_R.a(true, 4210752, 8405024);
                      this.field_R.field_w = true;
                      break L3;
                    }
                  }
                }
              }
            }
            L5: {
              if (param2 == -27) {
                break L5;
              } else {
                sd.e((byte) 2);
                break L5;
              }
            }
            this.field_R.field_J = (int)(65536.0f * (param3 / 100.0f));
            this.field_P = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("sd.W(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(ci param0, boolean param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ci var8 = null;
        hj var9 = null;
        hj var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = new hj(param0.a("", (byte) 124, "logo.fo3d"));
              var10 = var9;
              var3 = var10.d((byte) 121);
              var10.h((byte) 106);
              if (param1) {
                break L1;
              } else {
                var8 = (ci) null;
                sd.a((ci) null, true);
                break L1;
              }
            }
            rg.field_L = u.a(var10, (byte) 26);
            ae.field_a = new int[var3][];
            rf.field_eb = new e[var3];
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var3 <= var4) {
                  var10.n(0);
                  break L3;
                } else {
                  rf.field_eb[var4] = nb.a(param1, var9);
                  var4++;
                  if (var7 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                if (var4 >= var3) {
                  break L0;
                } else {
                  var5 = rf.field_eb[var4];
                  var5.a(1, -22861, 6, 6, 6);
                  var5.a(22856);
                  var6 = new int[]{var5.field_t + var5.field_P >> -517201119, var5.field_u + var5.field_O >> 522960001, var5.field_k + var5.field_i >> 1678425313};
                  ae.field_a[var4] = var6;
                  var5.a(-var6[2], -var6[0], -var6[1], (byte) -127);
                  var4++;
                  if (var7 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("sd.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    public static void e(byte param0) {
        field_V = null;
        field_Q = null;
        int var1 = 81 / ((47 - param0) / 43);
    }

    static {
        field_Q = "You are not currently logged in to the<nbsp>game.";
        field_V = "Type your email address again to make sure it's correct";
    }
}
