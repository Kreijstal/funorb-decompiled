/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends ok {
    static String field_Jb;
    static wh field_Ib;
    static r field_Gb;
    static String[] field_Kb;
    static String field_Hb;
    static boolean field_Lb;

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                L2: {
                  param0 = tg.a('_', param0, 3, "");
                  var3 = sh.a((byte) -124, param2);
                  if ((param0.indexOf(param2) ^ -1) != 0) {
                    break L2;
                  } else {
                    if (param0.indexOf(var3) == -1) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("gl.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void c(byte param0) {
        field_Jb = null;
        field_Ib = null;
        field_Gb = null;
        if (param0 != -105) {
            return;
        }
        field_Hb = null;
        field_Kb = null;
    }

    private gl() throws Throwable {
        super(0L, (ok) null);
        throw new Error();
    }

    static {
        field_Jb = "Continue";
        field_Lb = false;
        field_Hb = "Incapacitated";
        field_Kb = new String[]{"Glamour", "Monster <%attack> and <%defence> halved in the next room. (Single use)"};
        field_Gb = new r();
    }
}
