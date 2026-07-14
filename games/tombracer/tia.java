/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tia {
    static kea field_d;
    static int field_a;
    static String[] field_c;
    static String field_b;

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) wna.field_n);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wna.field_n);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) wna.field_n);
        tka.field_n = param0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -91) {
            field_d = null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 == -29543) {
          if (param1 == -1) {
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
            if (param1 <= -1) {
              if (-1 != param0) {
                if (-1 > param0) {
                  return -ska.a(-50, -param0, param1);
                } else {
                  return ska.a(123, param0, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (-1 == param0) {
                return 4096;
              } else {
                if (-1 <= param0) {
                  return -ska.a(-29, param0, -param1) + 4096;
                } else {
                  return ska.a(120, -param0, -param1) - 4096;
                }
              }
            }
          }
        } else {
          field_b = null;
          if (param1 == -1) {
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
            if (param1 <= -1) {
              if (-1 != param0) {
                if (-1 > param0) {
                  return -ska.a(-50, -param0, param1);
                } else {
                  return ska.a(123, param0, param1);
                }
              } else {
                return 0;
              }
            } else {
              if (-1 == param0) {
                return 4096;
              } else {
                if (-1 <= param0) {
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
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param5) {
          return;
        } else {
          param1++;
          nra.a((byte) -55, param3, param2, vaa.field_a[param1], param4);
          param0--;
          nra.a((byte) -55, param3, param2, vaa.field_a[param0], param4);
          var6 = param1;
          L0: while (true) {
            if (param0 < var6) {
              return;
            } else {
              var7 = vaa.field_a[var6];
              var7[param2] = param3;
              var7[param4] = param3;
              var6++;
              continue L0;
            }
          }
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param1 != -23403) {
            return false;
        }
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
