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
            param1.removeMouseListener(wna.field_n);
            param1.removeMouseMotionListener(wna.field_n);
            param1.removeFocusListener(wna.field_n);
            tka.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tia.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -91) {
            field_d = (kea) null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == -29543) {
          if (param1 == 0) {
            if (0 != param0) {
              if (param0 >= 0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          } else {
            if ((param1 ^ -1) <= -1) {
              if (-1 != (param0 ^ -1)) {
                if (-1 < (param0 ^ -1)) {
                  return -ska.a(-50, -param0, param1);
                } else {
                  return ska.a(123, param0, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (-1 == (param0 ^ -1)) {
                return 4096;
              } else {
                if (-1 >= (param0 ^ -1)) {
                  return -ska.a(-29, param0, -param1) + 4096;
                } else {
                  return ska.a(120, -param0, -param1) - 4096;
                }
              }
            }
          }
        } else {
          field_b = (String) null;
          if (param1 == 0) {
            if (0 != param0) {
              if (param0 >= 0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          } else {
            if ((param1 ^ -1) <= -1) {
              if (-1 != (param0 ^ -1)) {
                if (-1 < (param0 ^ -1)) {
                  return -ska.a(-50, -param0, param1);
                } else {
                  return ska.a(123, param0, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (-1 == (param0 ^ -1)) {
                return 4096;
              } else {
                if (-1 >= (param0 ^ -1)) {
                  return -ska.a(-29, param0, -param1) + 4096;
                } else {
                  return ska.a(120, -param0, -param1) - 4096;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param5) {
              incrementValue$4 = param1;
              param1++;
              nra.a((byte) -55, param3, param2, vaa.field_a[incrementValue$4], param4);
              incrementValue$5 = param0;
              param0--;
              nra.a((byte) -55, param3, param2, vaa.field_a[incrementValue$5], param4);
              var6_int = param1;
              L1: while (true) {
                if (param0 < var6_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = vaa.field_a[var6_int];
                  var7[param2] = param3;
                  var7[param4] = param3;
                  var6_int++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "tia.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param1 != -23403) {
            return false;
        }
        return qp.a(param2, (byte) 121, param0) & mm.a(-112, param2, param0);
    }

    static {
        field_c = new String[]{"<%0> took a tumble", "<%0> slipped and fell", "<%0> fought with gravity and lost", "<%0> fought with Newton's law and the law won", "<%0>'s attempt was pitiful", "<%0> became the fall-guy", "<%0>'s velocity was definitely terminal", "<%0> has fallen and cannot get up"};
        field_d = new kea();
    }
}
