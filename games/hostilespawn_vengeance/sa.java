/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static ub field_c;
    static String field_b;
    static String field_d;
    static cn field_a;
    static String field_e;

    final static void a(int param0) {
        el.field_h[0] = cm.a(128, 5, 0, 1);
        el.field_h[1] = cm.a(128, 5, 1, 1);
        nh.field_L = cj.a(6, param0);
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -24) {
            return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    final static int a(byte param0, int param1) {
        int stackIn_21_0 = 0;
        int stackIn_37_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        Exception var2 = null;
        try {
          L0: {
            L1: {
              var2_int = ln.field_a.field_u[param1];
              if (!ln.field_a.field_r[param1]) {
                break L1;
              } else {
                if (!pa.field_d) {
                  break L1;
                } else {
                  if (-3 != (ln.field_a.field_c[param1] ^ -1)) {
                    break L1;
                  } else {
                    var2_int = 0;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (ln.field_a.field_i[param1] >= var2_int) {
                break L2;
              } else {
                if (r.field_a > 0) {
                  var2_int = ln.field_a.field_i[param1];
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (25 >= var2_int) {
                break L3;
              } else {
                var2_int = 25;
                break L3;
              }
            }
            L4: {
              if (-1 == (ln.field_a.field_f[param1] ^ -1)) {
                var2_int = 0;
                break L4;
              } else {
                if (-1 != (bm.field_c ^ -1)) {
                  break L4;
                } else {
                  if ((rl.field_c ^ -1) != -3) {
                    break L4;
                  } else {
                    if (ha.field_t == 14) {
                      break L4;
                    } else {
                      L5: {
                        if ((ln.field_a.field_y[param1] ^ -1) <= -481) {
                          break L5;
                        } else {
                          if ((ln.field_a.field_o[param1] >> 1285574216 ^ -1) != -5) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int = 0;
                      break L4;
                    }
                  }
                }
              }
            }
            if (param0 <= -103) {
              L6: {
                if (-1 > (ln.field_a.field_o[param1] ^ -1)) {
                  if (0 != ak.field_b[ln.field_a.field_o[param1]].field_a) {
                    break L6;
                  } else {
                    var2_int = 25;
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              if ((cj.field_I & 2) != 0) {
                L7: {
                  if (0 == (ln.field_a.field_o[param1] ^ -1)) {
                    break L7;
                  } else {
                    if ((ln.field_a.field_o[param1] & 255) == 0) {
                      break L7;
                    } else {
                      if (0 >= ak.field_b[ln.field_a.field_o[param1]].field_a) {
                        break L7;
                      } else {
                        var2_int = 25;
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (0 <= var2_int) {
                    break L8;
                  } else {
                    var2_int = 0;
                    break L8;
                  }
                }
                stackIn_37_0 = var2_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L9: {
                  if (0 <= var2_int) {
                    break L9;
                  } else {
                    var2_int = 0;
                    break L9;
                  }
                }
                return var2_int;
              }
            } else {
              stackIn_21_0 = 34;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
          return 0;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_37_0;
        }
    }

    static {
        field_b = "So many eggs. I should be careful.";
        field_c = new ub();
        field_d = "Main Menu";
        field_e = "This rocket launcher should help clear the way.";
    }
}
