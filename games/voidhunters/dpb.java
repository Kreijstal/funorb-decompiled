/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dpb {
    final static String a(boolean param0, pgb param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        Object stackIn_3_0 = null;
        String stackIn_35_0 = null;
        Object stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        Object stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_34_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        Object stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (param0) {
              L1: {
                var2 = null;
                if (param1.field_e != null) {
                  L2: {
                    var5 = param1.field_e;
                    var3 = var5;
                    var3 = var5;
                    if (1 == param1.field_c) {
                      var2 = (Object) (Object) ("<img=0>" + var5);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param1.field_c == 2) {
                    var2 = (Object) (Object) ("<img=1>" + var2);
                    var3 = (String) var2;
                    var3 = (String) var2;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var3 = "";
                if (param1.field_a != 2) {
                  L4: {
                    if (0 != param1.field_a) {
                      break L4;
                    } else {
                      if (cqb.field_e) {
                        var3 = "[" + bib.field_e + "] ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1.field_a != 1) {
                      break L5;
                    } else {
                      var3 = "[" + isa.a(wt.field_b, new String[1], 107) + "] ";
                      break L5;
                    }
                  }
                  L6: {
                    if (param1.field_a != 4) {
                      break L6;
                    } else {
                      if (null == vla.field_E) {
                        break L6;
                      } else {
                        var3 = "[" + vla.field_E + "] ";
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (3 != param1.field_a) {
                      break L7;
                    } else {
                      var3 = "[#" + param1.field_o + "] ";
                      break L7;
                    }
                  }
                  if (!param1.field_k) {
                    var3 = var3 + var2 + ": ";
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (!param1.field_k) {
                    L8: {
                      if (0 != param1.field_f) {
                        break L8;
                      } else {
                        if (param1.field_h == 0) {
                          var3 = isa.a(tia.field_G, new String[1], 119);
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3 = isa.a(ejb.field_o, new String[1], 123);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_34_0 = (String) var3;
              stackIn_35_0 = stackOut_34_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_36_0 = var2;
            stackOut_36_1 = new StringBuilder().append("dpb.A(").append(param0).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_37_0 = stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
        return stackIn_35_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
