/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static String field_b;
    static int field_a;

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (go.field_l.startsWith("win")) {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param1.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_7_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    if (param0 == 9805) {
                      break L3;
                    } else {
                      field_b = (String) null;
                      break L3;
                    }
                  }
                  var3 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (param1.length() <= var3) {
                          break L6;
                        } else {
                          stackIn_18_0 = var2.indexOf((int) param1.charAt(var3));

                          if (var4 != 0) {
                            break L5;
                          } else {
                            if (stackIn_18_0 != -1) {
                              var3++;
                              if (var4 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            } else {
                              stackIn_15_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L1;
                            }
                          }
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackIn_18_0 = 1;
                      break L5;
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_20_0 = 0;
              return stackIn_20_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref2);

            stackIn_23_1 = new StringBuilder().append("va.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != 62) {
          field_b = (String) null;
          kn.a(-1431, true, am.field_a, mc.field_g);
          bl.field_h = true;
          return;
        } else {
          kn.a(-1431, true, am.field_a, mc.field_g);
          bl.field_h = true;
          return;
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 != -59) {
            va.a((byte) -88);
            return jm.a(param1, -23936, param2, param3);
        }
        return jm.a(param1, -23936, param2, param3);
    }

    public static void a(int param0) {
        if (param0 < 100) {
            va.a((byte) 9, -56, 96, -45);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Powerups with this modifier will kill ANYTHING! Try it on Fireball for a show.";
        field_a = 0;
    }
}
