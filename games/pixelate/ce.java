/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static boolean field_a;
    static int field_f;
    static int field_b;
    static String field_e;
    static int field_d;
    static int field_c;
    static int field_g;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        sc.field_d = null;
        if (param0 == -124) {
          rb.field_q = 0;
          se.field_o = null;
          var2 = kj.field_s;
          kj.field_s = pd.field_Eb;
          pm.field_h.field_h = pm.field_h.field_h + 1;
          pd.field_Eb = var2;
          if (param1 == 51) {
            pm.field_h.field_m = 2;
            if (2 > pm.field_h.field_h) {
              L0: {
                if (pm.field_h.field_h < 2) {
                  break L0;
                } else {
                  if (50 != param1) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (pm.field_h.field_h < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param1 == 51) {
                return 2;
              } else {
                L1: {
                  if (pm.field_h.field_h < 2) {
                    break L1;
                  } else {
                    if (50 != param1) {
                      break L1;
                    } else {
                      return 5;
                    }
                  }
                }
                if (pm.field_h.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (50 == param1) {
              pm.field_h.field_m = 5;
              if (2 > pm.field_h.field_h) {
                L2: {
                  if (pm.field_h.field_h < 2) {
                    break L2;
                  } else {
                    if (50 != param1) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                if (pm.field_h.field_h < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 != 51) {
                  if (pm.field_h.field_h >= 2) {
                    if (50 == param1) {
                      return 5;
                    } else {
                      if (pm.field_h.field_h < 4) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  } else {
                    if (pm.field_h.field_h >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  return 2;
                }
              }
            } else {
              pm.field_h.field_m = 1;
              if (2 <= pm.field_h.field_h) {
                if (param1 == 51) {
                  return 2;
                } else {
                  if (pm.field_h.field_h >= 2) {
                    if (50 != param1) {
                      if (pm.field_h.field_h >= 4) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (pm.field_h.field_h >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                if (pm.field_h.field_h >= 2) {
                  if (50 != param1) {
                    if (pm.field_h.field_h >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (pm.field_h.field_h >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            }
          }
        } else {
          return 3;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 256;
        field_e = "Let's Go Fly a Kite";
        field_d = 0;
    }
}
