/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_c;
    static int field_b;
    static String field_d;
    static ln field_a;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 == 32) {
            return;
        }
        field_b = 97;
    }

    final static void b(byte param0) {
        if (param0 != 90) {
          ah.a((byte) 9, -104);
          vl.field_n.h(32161, 71);
          ir.a(field_a.field_a, (byte) 100, vl.field_n, field_a.field_b);
          return;
        } else {
          vl.field_n.h(32161, 71);
          ir.a(field_a.field_a, (byte) 100, vl.field_n, field_a.field_b);
          return;
        }
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.equals("B")) {
              stackIn_3_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 90) {
                  break L1;
                } else {
                  field_a = (ln) null;
                  break L1;
                }
              }
              if (!param0.equals("I")) {
                if (param0.equals("S")) {
                  stackIn_12_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!param0.equals("J")) {
                    if (!param0.equals("Z")) {
                      if (param0.equals("F")) {
                        stackIn_22_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0.equals("D")) {
                          stackIn_26_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param0.equals("C")) {
                            stackIn_31_0 = Class.forName(param0);
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_29_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_18_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_15_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_8_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("ah.D(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static String a(int param0, byte param1, int param2) {
        if (param1 != 22) {
            return (String) null;
        }
        return p.a(param2, 0, (byte) -123, param0);
    }

    final static void a(byte param0, int param1) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        iw var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (iw) ((Object) cg.field_c.e((byte) 107));
            L1: while (true) {
              if (var4 == null) {
                var2 = ta.field_O.e((byte) 116);
                L2: while (true) {
                  if (var2 == null) {
                    if (param0 == 33) {
                      break L0;
                    } else {
                      ah.b((byte) -34);
                      return;
                    }
                  } else {
                    a.a(param1, (byte) -32);
                    var2 = ta.field_O.a((byte) 123);
                    continue L2;
                  }
                }
              } else {
                ot.a((byte) 112, param1, var4);
                var4 = (iw) ((Object) cg.field_c.a((byte) 123));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "ah.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = 0;
        field_c = "Flying units cannot carry additional melee weapons.";
        field_a = new ln();
    }
}
