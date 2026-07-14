/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int field_a;
    static int field_f;
    static java.lang.reflect.Method field_e;
    static String field_c;
    static bd[] field_d;
    static bd field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (0 == param1) {
          return 0;
        } else {
          if (0 < param1) {
            L0: {
              var2 = 1;
              if (65535 >= param1) {
                break L0;
              } else {
                param1 = param1 >> 16;
                var2 += 16;
                break L0;
              }
            }
            L1: {
              if (-256 > (param1 ^ -1)) {
                param1 = param1 >> 8;
                var2 += 8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < -16) {
                var2 += 4;
                param1 = param1 >> 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-4 >= param1) {
                break L3;
              } else {
                param1 = param1 >> 2;
                var2 += 2;
                break L3;
              }
            }
            L4: {
              if (param1 < -2) {
                param1 = param1 >> 1;
                var2++;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            if (param0 != 4) {
              return 63;
            } else {
              L5: {
                var2 = 2;
                if (65535 <= param1) {
                  break L5;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L5;
                }
              }
              L6: {
                if (param1 < -256) {
                  param1 = param1 >> 8;
                  var2 += 8;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if ((param1 ^ -1) > 15) {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param1 < -4) {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param1 >= -2) {
                  break L9;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L9;
                }
              }
              return var2;
            }
          }
        }
    }

    final static boolean a(char param0, byte param1) {
        if (!Character.isISOControl(param0)) {
          if (rf.a(true, param0)) {
            return true;
          } else {
            if (param1 == 108) {
              if (45 != param0) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              int discarded$6 = aa.a(94, -75);
              if (45 != param0) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        if (param0 != -104) {
            return;
        }
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        qj.a("", param0, (byte) 51);
        if (param1 != 2429) {
            field_e = null;
            o.a((byte) -61, param0);
            return;
        }
        o.a((byte) -61, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Reach the lift and proceed to the next level.";
    }
}
