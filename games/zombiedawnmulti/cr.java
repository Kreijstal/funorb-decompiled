/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends br {
    byte[] field_f;
    static cj field_i;
    boolean field_h;
    static int field_j;
    static String field_g;

    public static void b(boolean param0) {
        if (!param0) {
            field_g = (String) null;
            field_i = null;
            field_g = null;
            return;
        }
        field_i = null;
        field_g = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = qc.b((byte) -32, param0);
              if (param2 != param1.indexOf(param0)) {
                break L1;
              } else {
                if (param1.indexOf(var3) != -1) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param1.startsWith(param0)) {
                        break L3;
                      } else {
                        if (param1.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param1.endsWith(param0)) {
                            break L3;
                          } else {
                            if (!param1.endsWith(var3)) {
                              stackIn_12_0 = 0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackIn_12_0 = 1;
                    break L2;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("cr.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static int a(int param0, int param1) {
        if (param1 >= -80) {
            return 109;
        }
        return em.field_W[param0];
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    cr() {
    }

    final static boolean a(byte param0) {
        int var1;
        int stackIn_7_0 = 0;
        var1 = 35 / ((-63 - param0) / 49);
        if (null == pk.field_b) {
          if (!oe.a(123)) {
            if (null == bk.field_i) {
              if (nc.a((byte) 68)) {
                return true;
              } else {
                return false;
              }
            } else {
              stackIn_7_0 = 1;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        field_i = new cj();
        field_g = "Zombies are your thing if you have this trait equipped. You'll gain more Research Points from any zombies that return through your portal.";
    }
}
