/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends oh {
    private int field_m;
    private int field_q;
    private int field_s;
    private String field_l;
    private boolean field_n;
    static bi field_r;
    static ds field_p;
    static qh field_k;
    static java.awt.Canvas field_i;
    static int field_h;
    static String field_j;
    static String field_o;
    static qr field_t;

    public static void d(int param0) {
        short[] discarded$0 = null;
        field_j = null;
        if (param0 != -30032) {
            short[] var2 = (short[]) null;
            discarded$0 = tm.a((byte) -113, (sl) null, 17, (short[]) null);
        }
        field_k = null;
        field_t = null;
        field_r = null;
        field_p = null;
        field_i = null;
        field_o = null;
    }

    final void a(int param0) {
        int var2 = 0;
        if (this.field_n) {
            this.field_q = 256;
            return;
        }
        if (param0 != 256) {
            this.field_l = (String) null;
        }
        if ((this.field_m ^ -1) <= -601) {
            this.field_q = 0;
            return;
        }
        this.field_m = this.field_m + 1;
        if (-501 <= (this.field_m ^ -1)) {
        } else {
            var2 = 100 + (-this.field_m + 500);
            if ((var2 ^ -1) > -1) {
                this.field_q = 0;
            } else {
                this.field_q = (var2 << -208410008) / 100;
            }
        }
    }

    final void a(int param0, int param1) {
        if (-1 == (this.field_q ^ -1)) {
            return;
        }
        gf.a(88, 1 + param1, this.field_s, 17, 6, 0, this.field_q);
        if (param0 != -208410008) {
            field_r = (bi) null;
        }
        if (-257 != (this.field_q ^ -1)) {
            ss.field_b.d(this.field_l, 100, param1 + 14, 16777215, -1, this.field_q);
        } else {
            ss.field_b.d(this.field_l, 100, 14 + param1, 16777215, -1);
        }
    }

    tm(String param0, boolean param1) {
        int var3_int = 0;
        try {
            this.field_n = param1 ? true : false;
            this.field_q = 256;
            this.field_l = param0;
            this.field_m = !this.field_n ? 0 : 500;
            var3_int = 20 + ss.field_b.c(this.field_l);
            this.field_s = Math.max(400, var3_int);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static short[] a(byte param0, sl param1, int param2, short[] param3) {
        short[] discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] var9 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 39) {
                break L1;
              } else {
                var9 = (short[]) null;
                discarded$2 = tm.a((byte) -7, (sl) null, 123, (short[]) null);
                break L1;
              }
            }
            var4_int = param1.b((byte) 101, param2);
            if (-1 != (var4_int ^ -1)) {
              L2: {
                L3: {
                  if (param3 == null) {
                    break L3;
                  } else {
                    if (param3.length == var4_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param3 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param1.b((byte) 99, 4);
                var6 = (short)param1.b((byte) 86, 16);
                if (var5 > 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (short)(param1.b((byte) 93, var5) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_17_0 = (short[]) (param3);
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    static {
        field_j = "Invalid name";
        field_h = 0;
        field_o = "Return to lobby";
        field_p = new ds(0);
    }
}
