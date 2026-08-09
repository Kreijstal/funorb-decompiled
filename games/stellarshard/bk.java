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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("bk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
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
        hk var5;
        int var6;
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
            if ((var5.field_t ^ -1) != (param4 ^ -1)) {
              var5 = (hk) ((Object) id.field_g.b((byte) 102));
              continue L0;
            } else {
              return var5;
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
