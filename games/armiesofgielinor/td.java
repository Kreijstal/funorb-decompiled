/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements kh {
    static je field_g;
    private ka field_b;
    private int field_e;
    static String field_h;
    static sn[][] field_d;
    private int field_c;
    static dg field_f;
    static String field_a;

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_g = null;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param2 <= -79) {
              L1: {
                L2: {
                  if (param0.field_t) {
                    break L2;
                  } else {
                    if (param0.a(false)) {
                      break L2;
                    } else {
                      stackOut_5_0 = 2188450;
                      stackIn_7_0 = stackOut_5_0;
                      break L1;
                    }
                  }
                }
                stackOut_6_0 = 3249872;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              }
              L3: {
                var6_int = stackIn_7_0;
                int discarded$1 = ((td) this).field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_v + "</u>", param0.field_B + param1, param0.field_p + param4, param0.field_l, param0.field_w, var6_int, -1, ((td) this).field_e, ((td) this).field_c, ((td) this).field_b.field_H - -((td) this).field_b.field_L);
                if (!param0.a(false)) {
                  break L3;
                } else {
                  L4: {
                    var7 = ((td) this).field_b.a(param0.field_v);
                    var8 = ((td) this).field_b.field_H + ((td) this).field_b.field_L;
                    var9 = param1 - -param0.field_B;
                    if (((td) this).field_e == 2) {
                      var9 = var9 + (-var7 + param0.field_l);
                      break L4;
                    } else {
                      if (((td) this).field_e == 1) {
                        var9 = var9 + (param0.field_l - var7 >> 1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var10 = param4 + param0.field_p;
                    if (((td) this).field_c == 2) {
                      var10 = var10 + (param0.field_w + -var8);
                      break L5;
                    } else {
                      if (((td) this).field_c != 1) {
                        break L5;
                      } else {
                        var10 = var10 + (param0.field_w - var8 >> 1);
                        break L5;
                      }
                    }
                  }
                  na.c(4 + var7, -2 + var9, -70, var8, 2 + var10);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("td.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0;
        if (var2 != -60) {
          if (-54 != var2) {
            if (var2 != 43) {
              if (var2 != 63) {
                if (var2 != 58) {
                  if (param1 > -40) {
                    return -5;
                  } else {
                    return -1;
                  }
                } else {
                  return 1;
                }
              } else {
                return 0;
              }
            } else {
              return 4;
            }
          } else {
            return 3;
          }
        } else {
          return 2;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        rn.a(3, (String) null, param0, param1);
        if (param2 <= 4) {
            int discarded$0 = td.a(46, (byte) -104);
        }
    }

    public td() {
        ((td) this).field_b = ArmiesOfGielinor.field_J;
        ((td) this).field_e = 1;
        ((td) this).field_c = 1;
    }

    td(ka param0, int param1, int param2) {
        try {
            ((td) this).field_b = param0;
            ((td) this).field_c = param2;
            ((td) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "td.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This unit has ingested a cloning catalyst and will leave behind a perfect replica when it next moves.";
        field_a = "<%0>-<%1>";
    }
}
