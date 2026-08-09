/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static am field_a;

    final static mb a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mb[] var3 = null;
        int var4 = 0;
        mb var5 = null;
        int var6 = 0;
        mb stackIn_3_0 = null;
        mb stackIn_6_0 = null;
        mb stackIn_11_0 = null;
        mb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var2 = ah.a(true, param1, "jagex-last-login-method");
            if (var2 != null) {
              if (param0 == -11662) {
                var3 = vm.a((byte) 120);
                var4 = 0;
                L1: while (true) {
                  if (var4 >= var3.length) {
                    stackIn_14_0 = je.field_b;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (!var5.a(1, var2)) {
                      var4++;
                      continue L1;
                    } else {
                      stackIn_11_0 = (mb) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_6_0 = (mb) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = je.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("ua.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = (am) null;
        }
    }

    static {
    }
}
