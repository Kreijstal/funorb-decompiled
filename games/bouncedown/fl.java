/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8192) {
            field_b = (int[]) null;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            if (param0 != 8192) {
                field_b = (int[]) null;
            }
            ph.a("", param1, (byte) 43);
            lg.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "fl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static fb a(byte param0, String param1) {
        String var2 = null;
        fb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        fb stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            if (tk.field_b != null) {
              L1: {
                if (param0 <= -124) {
                  break L1;
                } else {
                  field_b = (int[]) null;
                  break L1;
                }
              }
              L2: {
                var6 = (CharSequence) ((Object) param1);
                var2 = ce.a(var6, 0);
                if (var2 != null) {
                  break L2;
                } else {
                  var2 = param1;
                  break L2;
                }
              }
              var3 = (fb) ((Object) tk.field_b.a((long)var2.hashCode(), 0));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_ob);
                    var4 = ce.a(var7, 0);
                    if (var4 != null) {
                      break L4;
                    } else {
                      var4 = var3.field_ob;
                      break L4;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackIn_16_0 = (fb) (var3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = (fb) ((Object) tk.field_b.b(0));
                    continue L3;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("fl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fb) ((Object) stackIn_3_0);
        } else {
          return stackIn_16_0;
        }
    }

    final static tg[] a(int param0, int param1, gk param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 19 / ((65 - param0) / 57);
          if (c.a(param2, false, param1, param3)) {
            return kc.a(true);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("fl.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = new int[8192];
        field_a = 500;
    }
}
