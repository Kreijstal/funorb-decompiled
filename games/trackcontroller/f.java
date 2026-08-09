/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static re field_c;
    static String field_d;
    static byte[][] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_b = (byte[][]) null;
        field_d = null;
        if (param0 <= 37) {
            field_a = 13;
        }
    }

    final static void a(Object param0, byte param1, uf param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (null != param2.field_i) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (-51 >= (var3_int ^ -1)) {
                    break L2;
                  } else {
                    if (param2.field_i.peekEvent() == null) {
                      break L2;
                    } else {
                      wl.a(1L, false);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    if (param1 == -127) {
                      if (param0 == null) {
                        decompiledRegionSelector0 = 1;
                        break L3;
                      } else {
                        param2.field_i.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
                        return;
                      }
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L3;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("f.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_d = "Please wait...";
        field_b = new byte[1000][];
        field_a = 4;
        field_c = null;
    }
}
