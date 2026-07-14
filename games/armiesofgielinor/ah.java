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
          ir.a(field_a.field_a, (byte) 100, (vh) (Object) vl.field_n, field_a.field_b);
          return;
        } else {
          vl.field_n.h(32161, 71);
          ir.a(field_a.field_a, (byte) 100, (vh) (Object) vl.field_n, field_a.field_b);
          return;
        }
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        if (param0.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (param1 == 90) {
            if (!param0.equals((Object) (Object) "I")) {
              if (param0.equals((Object) (Object) "S")) {
                return Short.TYPE;
              } else {
                if (!param0.equals((Object) (Object) "J")) {
                  if (!param0.equals((Object) (Object) "Z")) {
                    if (param0.equals((Object) (Object) "F")) {
                      return Float.TYPE;
                    } else {
                      if (param0.equals((Object) (Object) "D")) {
                        return Double.TYPE;
                      } else {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    }
                  } else {
                    return Boolean.TYPE;
                  }
                } else {
                  return Long.TYPE;
                }
              }
            } else {
              return Integer.TYPE;
            }
          } else {
            field_a = null;
            if (!param0.equals((Object) (Object) "I")) {
              if (param0.equals((Object) (Object) "S")) {
                return Short.TYPE;
              } else {
                if (!param0.equals((Object) (Object) "J")) {
                  if (!param0.equals((Object) (Object) "Z")) {
                    if (param0.equals((Object) (Object) "F")) {
                      return Float.TYPE;
                    } else {
                      if (param0.equals((Object) (Object) "D")) {
                        return Double.TYPE;
                      } else {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    }
                  } else {
                    return Boolean.TYPE;
                  }
                } else {
                  return Long.TYPE;
                }
              }
            } else {
              return Integer.TYPE;
            }
          }
        }
    }

    final static String a(int param0, byte param1, int param2) {
        if (param1 != 22) {
            return null;
        }
        return p.a(param2, 0, (byte) -123, param0);
    }

    final static void a(byte param0, int param1) {
        tc var2 = null;
        int var3 = 0;
        iw var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = (iw) (Object) cg.field_c.e((byte) 107);
        L0: while (true) {
          if (var4 == null) {
            var2 = ta.field_O.e((byte) 116);
            L1: while (true) {
              if (var2 == null) {
                if (param0 == 33) {
                  return;
                } else {
                  ah.b((byte) -34);
                  return;
                }
              } else {
                a.a(param1, (byte) -32);
                var2 = ta.field_O.a((byte) 123);
                continue L1;
              }
            }
          } else {
            ot.a((byte) 112, param1, var4);
            var4 = (iw) (Object) cg.field_c.a((byte) 123);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "Flying units cannot carry additional melee weapons.";
        field_a = new ln();
    }
}
