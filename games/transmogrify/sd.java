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
        super.a(param0, (byte) -127, param2);
        rh.field_q.c(this.field_P, (this.field_l >> 214208577) + param2, 103 + param0, 16777215, -1);
        if (param1 > -79) {
            this.field_T = false;
            if (null == this.field_U) {
                return;
            }
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            rh.field_q.a(this.field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
        }
        if (null != this.field_U) {
            sb.d(param2 + 20, -7 + (param0 - -120), 260, 8421504);
            rh.field_q.a(this.field_U, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, rh.field_q.field_y);
            return;
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
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (this.field_S) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              if (stackIn_3_0 == stackIn_6_1) {
                break L3;
              } else {
                L4: {
                  stackIn_9_0 = this;

                  if (!param0) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L4;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
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
                    break L3;
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
            runtimeException = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (runtimeException);

            stackIn_20_1 = new StringBuilder().append("sd.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(ci param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ci var8 = null;
        hj var9 = null;
        int var10 = 0;
        hj var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = new hj(param0.a("", (byte) 124, "logo.fo3d"));
              var11 = var9;
              var3 = var11.d((byte) 121);
              var11.h((byte) 106);
              if (param1) {
                break L1;
              } else {
                var8 = (ci) null;
                sd.a((ci) null, true);
                break L1;
              }
            }
            rg.field_L = u.a(var11, (byte) 26);
            ae.field_a = new int[var3][];
            rf.field_eb = new e[var3];
            var4 = 0;
            L2: while (true) {
              if (var3 <= var4) {
                var11.n(0);
                var10 = 0;
                var4 = var10;
                L3: while (true) {
                  if (var10 >= var3) {
                    break L0;
                  } else {
                    var5 = rf.field_eb[var10];
                    var5.a(1, -22861, 6, 6, 6);
                    var5.a(22856);
                    var6 = new int[]{var5.field_t + var5.field_P >> -517201119, var5.field_u + var5.field_O >> 522960001, var5.field_k + var5.field_i >> 1678425313};
                    ae.field_a[var10] = var6;
                    var5.a(-var6[2], -var6[0], -var6[1], (byte) -127);
                    var10++;
                    continue L3;
                  }
                }
              } else {
                rf.field_eb[var4] = nb.a(param1, var9);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("sd.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
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
