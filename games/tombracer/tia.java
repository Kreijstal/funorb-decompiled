/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tia {
    static kea field_d;
    static int field_a;
    static String[] field_c;
    static String field_b;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeMouseListener((java.awt.event.MouseListener) (Object) wna.field_n);
            param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wna.field_n);
            param1.removeFocusListener((java.awt.event.FocusListener) (Object) wna.field_n);
            tka.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tia.A(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == -29543) {
          if (param1 == 0) {
            if (0 == param0) {
              return 0;
            } else {
              if (param0 < 0) {
                return -2048;
              } else {
                return 2048;
              }
            }
          } else {
            if (param1 >= 0) {
              if (param0 != 0) {
                if (param0 >= 0) {
                  return ska.a(123, param0, param1);
                } else {
                  return -ska.a(-50, -param0, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (param0 == 0) {
                return 4096;
              } else {
                if (param0 < 0) {
                  return ska.a(120, -param0, -param1) - 4096;
                } else {
                  return -ska.a(-29, param0, -param1) + 4096;
                }
              }
            }
          }
        } else {
          field_b = null;
          if (param1 == 0) {
            if (0 == param0) {
              return 0;
            } else {
              if (param0 < 0) {
                return -2048;
              } else {
                return 2048;
              }
            }
          } else {
            if (param1 >= 0) {
              if (param0 != 0) {
                if (param0 >= 0) {
                  return ska.a(123, param0, param1);
                } else {
                  return -ska.a(-50, -param0, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (param0 == 0) {
                return 4096;
              } else {
                if (param0 < 0) {
                  return ska.a(120, -param0, -param1) - 4096;
                } else {
                  return -ska.a(-29, param0, -param1) + 4096;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            int incrementValue$4 = param1;
            param1++;
            nra.a((byte) -55, param3, param2, vaa.field_a[incrementValue$4], param4);
            int incrementValue$5 = param0;
            param0--;
            nra.a((byte) -55, param3, param2, vaa.field_a[incrementValue$5], param4);
            var6_int = param1;
            L1: while (true) {
              if (param0 < var6_int) {
                break L0;
              } else {
                var7 = vaa.field_a[var6_int];
                var7[param2] = param3;
                var7[param4] = param3;
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "tia.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 0 + 41);
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        return qp.a(param2, (byte) 121, param0) & mm.a(-112, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"<%0> took a tumble", "<%0> slipped and fell", "<%0> fought with gravity and lost", "<%0> fought with Newton's law and the law won", "<%0>'s attempt was pitiful", "<%0> became the fall-guy", "<%0>'s velocity was definitely terminal", "<%0> has fallen and cannot get up"};
        field_d = new kea();
    }
}
