/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    static boolean field_b;
    static boolean field_a;
    private static String field_z;

    final static int a(byte param0, int param1) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          gb.field_i = 0;
          oj.field_Gb = null;
          js.field_a = null;
          if (param0 == -94) {
            break L0;
          } else {
            discarded$1 = is.a((byte) -54, 83);
            break L0;
          }
        }
        var2 = hn.field_i;
        hn.field_i = cf.field_D;
        if ((param1 ^ -1) != -52) {
          if (50 != param1) {
            vp.field_o.field_p = 1;
            cf.field_D = var2;
            vp.field_o.field_a = vp.field_o.field_a + 1;
            if (vp.field_o.field_a >= 2) {
              if (param1 != 51) {
                L1: {
                  if (2 > vp.field_o.field_a) {
                    break L1;
                  } else {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      break L1;
                    }
                  }
                }
                if ((vp.field_o.field_a ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                return 2;
              }
            } else {
              L2: {
                if (2 > vp.field_o.field_a) {
                  break L2;
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    break L2;
                  }
                }
              }
              if ((vp.field_o.field_a ^ -1) > -5) {
                return -1;
              } else {
                return 1;
              }
            }
          } else {
            vp.field_o.field_p = 5;
            cf.field_D = var2;
            vp.field_o.field_a = vp.field_o.field_a + 1;
            if (vp.field_o.field_a >= 2) {
              if (param1 != 51) {
                L3: {
                  if (2 > vp.field_o.field_a) {
                    break L3;
                  } else {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      break L3;
                    }
                  }
                }
                if ((vp.field_o.field_a ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                return 2;
              }
            } else {
              L4: {
                if (2 > vp.field_o.field_a) {
                  break L4;
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    break L4;
                  }
                }
              }
              if ((vp.field_o.field_a ^ -1) <= -5) {
                return 1;
              } else {
                return -1;
              }
            }
          }
        } else {
          vp.field_o.field_p = 2;
          cf.field_D = var2;
          vp.field_o.field_a = vp.field_o.field_a + 1;
          if (vp.field_o.field_a >= 2) {
            if (param1 != 51) {
              L5: {
                if (2 > vp.field_o.field_a) {
                  break L5;
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    break L5;
                  }
                }
              }
              if ((vp.field_o.field_a ^ -1) <= -5) {
                return 1;
              } else {
                return -1;
              }
            } else {
              return 2;
            }
          } else {
            L6: {
              if (2 > vp.field_o.field_a) {
                break L6;
              } else {
                if (-51 == (param1 ^ -1)) {
                  return 5;
                } else {
                  break L6;
                }
              }
            }
            if ((vp.field_o.field_a ^ -1) <= -5) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    static {
        field_z = "is.A(";
    }
}
