/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_e;
    static sa field_c;
    static pi field_b;
    static boolean field_a;
    static int field_d;

    final static void a(byte param0) {
        sf.a(4, 11649);
        if (param0 != 75) {
            field_c = (sa) null;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
            Object var2 = (Object) null;
            oh.a((bl) null, -112, (Object) null);
        }
        return gf.field_G;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 26500) {
            oh.a(true);
        }
        gl.field_c = param2;
        oc.field_B = param1;
    }

    final static void a(bl param0, int param1, Object param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                field_a = false;
                break L1;
              }
            }
            if (param0.field_x == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L2: while (true) {
                L3: {
                  if ((var3_int ^ -1) <= -51) {
                    break L3;
                  } else {
                    if (param0.field_x.peekEvent() == null) {
                      break L3;
                    } else {
                      kk.a(1L, true);
                      var3_int++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (param2 == null) {
                        break L5;
                      } else {
                        param0.field_x.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("oh.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_c = null;
    }

    static {
        field_e = -1;
        field_c = new sa(0, 2, 2, 1);
    }
}
