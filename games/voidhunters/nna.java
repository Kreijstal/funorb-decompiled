/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nna extends dqa implements oo {
    static String field_F;
    private int[] field_E;
    static String field_D;
    private os field_B;
    static int field_w;
    static llb field_v;
    static djb field_C;
    private no field_H;
    private String field_x;
    static ae field_z;
    private int field_A;
    private htb[] field_y;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 11) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  if (this.field_A <= var6_int) {
                    break L2;
                  } else {
                    if (this.field_y[var6_int] != param3) {
                      var6_int++;
                      continue L1;
                    } else {
                      var7 = this.field_E[var6_int];
                      if (0 != (var7 ^ -1)) {
                        cea.a(127, this.field_E[var6_int]);
                        break L2;
                      } else {
                        this.field_B.l((byte) -106);
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("nna.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_A;
            this.a(-4349, var4_int - -1);
            if (param0 > -113) {
                field_D = (String) null;
            }
            this.field_y[var4_int] = this.a((byte) 62, param1, (sba) (this));
            this.field_E[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "nna.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final htb a(byte param0, String param1, sba param2) {
        htb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        htb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        htb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 59) {
                break L1;
              } else {
                this.b(78, -29, 18, 90);
                break L1;
              }
            }
            var4 = new htb(param1, param2);
            var4.field_q = (wwa) ((Object) new vva());
            var5 = -2 + this.field_f;
            this.a(0, this.field_h, this.field_f - -34, 1, 0);
            var4.a(7, this.field_h - 14, 30, 1, var5);
            this.b(-18756, var4);
            stackOut_2_0 = (htb) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("nna.H(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(boolean param0) {
        field_F = null;
        field_v = null;
        field_z = null;
        field_C = null;
        if (!param0) {
            nna.c(true);
        }
        field_D = null;
    }

    nna(os param0, no param1, String param2) {
        super(0, 0, 288, 0, (wwa) null);
        int var4_int = 0;
        this.field_A = 0;
        try {
            this.field_x = param2;
            this.field_B = param0;
            this.field_H = param1;
            var4_int = null != this.field_x ? this.field_H.b(this.field_x, 260, this.field_H.field_k) : 0;
            this.a(0, 288, var4_int + 22, 1, 0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "nna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        htb discarded$0 = null;
        if (param2 < 47) {
            sba var6 = (sba) null;
            discarded$0 = this.a((byte) -58, (String) null, (sba) null);
        }
        super.b(param0, param1, 61, param3);
        int discarded$1 = this.field_H.a(this.field_x, param0 - -this.field_g - -14, 10 + (param3 + this.field_r), this.field_h + -28, this.field_f, 16777215, -1, 0, 0, this.field_H.field_k);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!(param1 > this.field_A)) {
            return;
        }
        htb[] var7 = new htb[param1];
        htb[] var3 = var7;
        if (param0 != -4349) {
            return;
        }
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.field_A; var5++) {
            var7[var5] = this.field_y[var5];
            var4[var5] = this.field_E[var5];
        }
        this.field_y = var3;
        this.field_A = param1;
        this.field_E = var4;
    }

    static {
        field_F = "This option cannot be combined with the current settings for:  ";
        field_D = "Return to game";
    }
}
