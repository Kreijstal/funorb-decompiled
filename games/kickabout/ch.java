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

    final static void a(ut param0, ot param1, ot param2, int param3) {
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
            var4_int = 88 / ((param3 - -76) / 44);
            param0.b(0, 0, 32, 32);
            ta.e(123);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ch.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(iw param0, byte param1) {
        try {
            this.field_s = param0.h((byte) -109);
            this.field_k = param0.h((byte) -113);
            this.field_g = param0.h((byte) -122);
            this.field_f = param0.h((byte) -114);
            this.field_q = param0.a((byte) 81);
            this.field_r = param0.a((byte) 81);
            int var3_int = -82 / ((-7 - param1) / 53);
            this.field_t = param0.h((byte) -127);
            this.field_i = param0.h((byte) -110);
            this.field_n = -2 == (param0.h((byte) -123) ^ -1) ? true : false;
            this.field_h = param0.h((byte) -105);
            this.field_j = param0.h((byte) -120);
            this.field_m = param0.a((byte) 81);
            this.field_p = param0.a((byte) 81);
            this.field_e = param0.h((byte) -118);
            this.field_l = param0.a((byte) 81);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ch.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder var1;
        int var2;
        StringBuilder var3;
        L0: {
          var2 = Kickabout.field_G;
          var3 = new StringBuilder();
          var1 = var3;
          discarded$0 = var3.append(" p=(" + this.field_q + "," + this.field_r + ")/" + this.field_k + "/" + this.field_g + "/" + this.field_f);
          discarded$1 = var3.append(" b=(" + this.field_h + "," + this.field_j + ")");
          if (-1 == (this.field_t ^ -1)) {
            discarded$2 = var3.append(" !!null!!");
            break L0;
          } else {
            if (2 == this.field_t) {
              discarded$3 = var3.append(" cross");
              break L0;
            } else {
              if ((this.field_t ^ -1) != -4) {
                if (-2 != (this.field_t ^ -1)) {
                  discarded$4 = var3.append(" invalid_goaltype/" + this.field_t);
                  break L0;
                } else {
                  discarded$5 = var3.append(" kick/" + this.field_i + "/" + this.field_n);
                  break L0;
                }
              } else {
                discarded$6 = var3.append(" header");
                break L0;
              }
            }
          }
        }
        StringBuilder discarded$7 = var3.append(" g=(" + this.field_m + "," + this.field_p + ")/" + this.field_e);
        StringBuilder discarded$8 = var3.append(" time=" + this.field_l);
        return "LoggedGoal{" + var3 + "}";
    }

    public static void a(byte param0) {
        field_o = null;
        int var1 = -25 / ((28 - param0) / 44);
    }

    final void a(nu param0, int param1, int param2, int param3, nl param4, int param5, nl param6, int param7, int param8) {
        try {
            this.a(param7, param2, param3, 1, param5, param0, param1 + 87, param8);
            if (param1 != 32) {
                this.field_j = -65;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ch.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(int param0, ch param1) {
        try {
            this.field_n = param1.field_n;
            this.field_i = param1.field_i;
            this.field_e = param1.field_e;
            this.field_l = param1.field_l;
            this.field_m = param1.field_m;
            this.field_p = param1.field_p;
            this.field_t = param1.field_t;
            this.field_r = param1.field_r;
            this.field_k = param1.field_k;
            this.field_q = param1.field_q;
            this.field_h = param1.field_h;
            this.field_g = param1.field_g;
            this.field_s = param1.field_s;
            this.field_j = param1.field_j;
            if (param0 != -4) {
                sj var4 = (sj) null;
                ch.a(-13, (sj) null);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ch.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, nu param5, int param6, int param7) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        nl var10 = null;
        int var11 = 0;
        nl var12 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            var12 = param5.field_P[param2][param7];
            if (param6 >= 109) {
              L1: {
                var10 = param5.field_P[1 - param2][0];
                this.field_s = param0;
                this.field_k = param2;
                this.field_g = param7;
                this.field_q = var12.f(-124);
                this.field_r = var12.a(true);
                if (param3 == 2) {
                  this.field_j = var12.field_m;
                  this.field_t = 2;
                  this.field_n = false;
                  this.field_i = 0;
                  this.field_h = var12.field_k;
                  break L1;
                } else {
                  if (3 != param3) {
                    this.field_i = param4;
                    this.field_h = var12.field_x;
                    this.field_t = 1;
                    this.field_n = var12.field_O;
                    this.field_j = var12.field_P;
                    break L1;
                  } else {
                    this.field_t = 3;
                    this.field_i = 0;
                    this.field_h = var12.field_k;
                    this.field_n = false;
                    this.field_j = var12.field_m;
                    break L1;
                  }
                }
              }
              this.field_m = var10.f(-93);
              this.field_p = var10.a(true);
              this.field_l = param1;
              this.field_e = var10.field_o;
              L2: while (true) {
                L3: {
                  if (127 < Math.abs(this.field_h)) {
                    break L3;
                  } else {
                    if (-128 <= (Math.abs(this.field_j) ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                this.field_h = this.field_h / 2;
                this.field_j = this.field_j / 2;
                continue L2;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var9);

            stackIn_15_1 = new StringBuilder().append("ch.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, nl param2, int param3, int param4, int param5, int param6, nu param7, nl param8) {
        if (param0 != 35) {
            return;
        }
        try {
            this.a(param1, param4, param6, param5, 0, param7, param0 ^ 91, param3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ch.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, sj param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                field_o = (ut) null;
                break L1;
              }
            }
            stackIn_3_0 = param1.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ch.F(").append(param0).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public ch() {
        this.field_t = 0;
    }

    static {
    }
}
