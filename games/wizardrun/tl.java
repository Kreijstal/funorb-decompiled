/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static boolean field_e;
    static ae field_d;
    static String field_b;
    static vi field_a;
    static qj field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 >= -47) {
            tl.a((byte) -113);
        }
    }

    final static boolean a(aa param0, aa param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        aa var5 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                var5 = (aa) null;
                tl.a((aa) null, (aa) null, 6);
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_ob - param1.field_ob;
              if (me.field_d != param0.field_jb) {
                if (null == param0.field_jb) {
                  var3_int += 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (me.field_d != param1.field_jb) {
                if (param1.field_jb == null) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (-1 <= (var3_int ^ -1)) {
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("tl.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    static {
        field_e = true;
        field_d = new ae();
        field_b = "Username: ";
    }
}
