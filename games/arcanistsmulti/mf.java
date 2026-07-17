/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_g;
    static int[] field_b;
    static kc field_d;
    static int field_c;
    static String field_f;
    static String field_e;
    static int field_a;
    static String field_h;

    final static wa a(int param0, String param1) {
        Object var2 = null;
        wa var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        wa stackIn_17_0 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        wa stackOut_16_0 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (uc.field_c != null) {
            L0: {
              var7 = (CharSequence) (Object) param1;
              var2 = (Object) (Object) gk.a(var7, -13);
              if (var2 != null) {
                break L0;
              } else {
                var2 = (Object) (Object) var7;
                break L0;
              }
            }
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6 = null;
                wa discarded$2 = mf.a(-34, (String) null);
                break L1;
              }
            }
            var3 = (wa) (Object) uc.field_c.a((long)((String) var2).hashCode(), (byte) -64);
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var8 = (CharSequence) (Object) var3.field_Cb;
                  var4 = gk.a(var8, param0 + -12);
                  if (var4 == null) {
                    var4 = var3.field_Cb;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_16_0 = (wa) var3;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  var3 = (wa) (Object) uc.field_c.d(param0 ^ 82);
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_20_0 = var2;
            stackOut_20_1 = new StringBuilder().append("mf.C(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static void a(int param0, int param1) {
        fk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            si.field_l = param0;
            var2 = (fk) (Object) qn.field_mb.b(12623);
            L1: while (true) {
              if (var2 == null) {
                if (null != he.field_f) {
                  var2 = (fk) (Object) he.field_f.b(12623);
                  L2: while (true) {
                    if (var2 == null) {
                      break L0;
                    } else {
                      L3: {
                        if (!var2.field_n.b((byte) -36)) {
                          var2.a(true);
                          break L3;
                        } else {
                          var2.field_m.c(var2.field_l * si.field_l - -128 >> 8);
                          break L3;
                        }
                      }
                      var2 = (fk) (Object) he.field_f.a(0);
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L4: {
                  if (var2.field_n.b((byte) -119)) {
                    var2.field_m.c(si.field_l * var2.field_l - -128 >> 8);
                    break L4;
                  } else {
                    var2.a(true);
                    break L4;
                  }
                }
                var2 = (fk) (Object) qn.field_mb.a(0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2_ref, "mf.B(" + param0 + 44 + 21298 + 41);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = null;
        if (param0 != -1) {
          mf.a(25);
          field_b = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_e = "Increases your allocated movement time each turn";
        field_f = "You have declined the invitation.";
        field_h = "Inviting <%0>";
        field_c = 480;
        field_a = -1;
    }
}
