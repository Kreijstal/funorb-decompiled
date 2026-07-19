/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    private boolean field_d;
    private String field_a;
    static String field_e;
    static pb field_b;
    private boolean field_c;

    public static void a(int param0) {
        field_b = null;
        int var1 = 126 / ((-80 - param0) / 46);
        field_e = null;
    }

    final static void a(int param0, String param1, boolean param2, String param3) {
        RuntimeException runtimeException = null;
        String var5 = null;
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
        try {
          L0: {
            L1: {
              va.field_a = param3;
              wb.field_c = param1;
              we.a(param2, 12757, ul.field_H);
              if (param0 == 12) {
                break L1;
              } else {
                var5 = (String) null;
                bk.a(20, (String) null, true, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bk.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, ka param3, int param4) {
        try {
            param3.a(param1, 12);
            param3.c(17, -117);
            param3.c(param0, -123);
            param3.c(param2, -117);
            param3.a(false, param4);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bk.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_d = param0 ? true : false;
        this.field_c = param1 ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 17) {
            this.field_c = true;
            return this.field_d;
        }
        return this.field_d;
    }

    final String c(int param0) {
        if (param0 >= -106) {
            return (String) null;
        }
        return this.field_a;
    }

    final static hk a(int param0, int param1, int param2, int param3, int param4) {
        hk var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var5 = (hk) ((Object) id.field_g.b(param3 + -133));
        L0: while (true) {
          if (var5 == null) {
            if (param3 != 17) {
              return (hk) null;
            } else {
              var5 = new hk();
              var5.field_r = param2;
              var5.field_q = param1;
              var5.field_t = param4;
              id.field_g.b(param3 ^ -69, var5);
              pd.a(param0, var5, 31);
              return var5;
            }
          } else {
            if (var5.field_t == param4) {
              return var5;
            } else {
              var5 = (hk) ((Object) id.field_g.b((byte) 102));
              continue L0;
            }
          }
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return this.field_c;
    }

    bk(String param0) {
        this.field_d = false;
        this.field_c = false;
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Back";
    }
}
