/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static int field_a;
    static int field_e;
    static int field_c;
    static rc field_b;
    static String field_d;

    final static void a(String param0, java.applet.Applet param1, boolean param2, int param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param3 == -20517) {
                  L1: {
                    if (ec.field_n.startsWith("win")) {
                      if (kj.a(param0, 27994)) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
                      break L2;
                    }
                  } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    ae.a((Throwable) null, param3 ^ -30848, "MGR1: " + param0);
                    return;
                  }
                  return;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var4_ref);

                stackIn_13_1 = new StringBuilder().append("wi.B(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L3;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L4;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L4;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 61) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        mg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            var4 = (mg) ((Object) bg.field_i.b((byte) 26));
            L1: while (true) {
              if (var4 == null) {
                if (param0 == 0) {
                  break L0;
                } else {
                  field_e = -110;
                  return;
                }
              } else {
                oe.a(param1, -19004, var4);
                var4 = (mg) ((Object) bg.field_i.a(false));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "wi.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "You are not currently logged in to the<nbsp>game.";
        field_b = null;
    }
}
