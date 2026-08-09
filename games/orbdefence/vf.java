/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static int[] field_a;
    static String[] field_b;
    static byte[][] field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1) {
            return;
        }
        field_c = (byte[][]) null;
        field_a = null;
    }

    final static hj[] a(int param0, int param1, int param2, byte param3) {
        if (param3 >= -44) {
          vf.a(45);
          return kd.a(1, param2, 119, param0, param1);
        } else {
          return kd.a(1, param2, 119, param0, param1);
        }
    }

    final static void a(Object param0, int param1, be param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var3_ref = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param2.field_t == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param2.field_t.peekEvent()) {
                      break L2;
                    } else {
                      hb.a(1L, 97);
                      var3_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param0 != null) {
                        param2.field_t.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                if (param1 == 50) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  vf.a(9, -82, 8, (byte) 43);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("vf.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            if (param0 <= 84) {
                vf.a(-58, 69, -47, (byte) 17);
            }
            pc.a(-1, param2, param1, false);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "vf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[1024];
        field_b = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = new byte[50][];
    }
}
