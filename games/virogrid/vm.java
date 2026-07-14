/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static double[] field_d;
    static int field_c;
    static un field_b;
    static String field_a;
    static boolean field_e;

    final static void a(byte param0, boolean param1) {
        if (0 < kh.field_d) {
          if (ao.field_Gb) {
            df.g(0, 0, df.field_e, we.field_c.field_J);
            jj.field_a.a(param1, 24960);
            if (param0 >= 16) {
              L0: {
                if (0 < hn.field_h) {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  if (-1 <= (th.field_z ^ -1)) {
                    break L0;
                  } else {
                    L1: {
                      if (ad.field_h) {
                        df.g(0, 0, df.field_e, we.field_c.field_J);
                        pm.field_n.a(param1, 24960);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  }
                }
              }
              return;
            } else {
              L2: {
                field_b = null;
                if (0 < hn.field_h) {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L2;
                  } else {
                    return;
                  }
                } else {
                  if (-1 <= (th.field_z ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (ad.field_h) {
                        df.g(0, 0, df.field_e, we.field_c.field_J);
                        pm.field_n.a(param1, 24960);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (param0 >= 16) {
              if (0 < hn.field_h) {
                if (ad.field_h) {
                  df.g(0, 0, df.field_e, we.field_c.field_J);
                  pm.field_n.a(param1, 24960);
                  return;
                } else {
                  return;
                }
              } else {
                if (-1 > (th.field_z ^ -1)) {
                  L4: {
                    if (ad.field_h) {
                      df.g(0, 0, df.field_e, we.field_c.field_J);
                      pm.field_n.a(param1, 24960);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              field_b = null;
              if (0 < hn.field_h) {
                if (!ad.field_h) {
                  return;
                } else {
                  df.g(0, 0, df.field_e, we.field_c.field_J);
                  pm.field_n.a(param1, 24960);
                  return;
                }
              } else {
                if (-1 > (th.field_z ^ -1)) {
                  L5: {
                    if (ad.field_h) {
                      df.g(0, 0, df.field_e, we.field_c.field_J);
                      pm.field_n.a(param1, 24960);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0 >= 16) {
            if (0 < hn.field_h) {
              if (!ad.field_h) {
                return;
              } else {
                df.g(0, 0, df.field_e, we.field_c.field_J);
                pm.field_n.a(param1, 24960);
                return;
              }
            } else {
              if (-1 > (th.field_z ^ -1)) {
                L6: {
                  if (ad.field_h) {
                    df.g(0, 0, df.field_e, we.field_c.field_J);
                    pm.field_n.a(param1, 24960);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            field_b = null;
            if (0 < hn.field_h) {
              if (!ad.field_h) {
                return;
              } else {
                df.g(0, 0, df.field_e, we.field_c.field_J);
                pm.field_n.a(param1, 24960);
                return;
              }
            } else {
              if (-1 > (th.field_z ^ -1)) {
                if (!ad.field_h) {
                  return;
                } else {
                  df.g(0, 0, df.field_e, we.field_c.field_J);
                  pm.field_n.a(param1, 24960);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static rc a(eh param0, byte param1, int param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param0.b(param2, 27034);
        var3 = var4;
        if (var4 != null) {
          if (param1 <= 41) {
            field_d = null;
            return new rc(var4);
          } else {
            return new rc(var4);
          }
        } else {
          return null;
        }
    }

    final static pe a(byte param0, ml param1) {
        if (param0 != 30) {
            return null;
        }
        return tm.a(jh.a(param1, 100, 96), param0 ^ 65);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -105) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> resigned";
    }
}
