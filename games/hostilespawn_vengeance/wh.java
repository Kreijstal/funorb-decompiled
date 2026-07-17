/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static String field_a;
    static bd field_e;
    static p[] field_b;
    static boolean field_f;
    static fa field_c;
    static nc field_d;

    public static void a() {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        int var1 = lm.e(0);
        int discarded$0 = -1;
        int var2 = ti.a();
        ne.field_j.a(var1 + (ac.field_a << 1), s.field_g + -ac.field_g, var2 - -(ac.field_g << 1), hg.field_f + -ac.field_a, 5);
        int discarded$25 = -93;
        rh.d();
        if (param0 <= 99) {
            field_e = null;
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (ln.field_a.field_c[param1] == 2) {
                  break L2;
                } else {
                  if (ln.field_a.field_c[param1] != 4) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ln.field_a.field_c[param1] = 0;
              break L1;
            }
            L3: {
              if (0 <= ln.field_a.field_o[param1]) {
                L4: {
                  if (!ck.a(-62, -ln.field_a.field_d + param1)) {
                    break L4;
                  } else {
                    ln.field_a.field_o[param1 + -ln.field_a.field_d] = 664;
                    break L4;
                  }
                }
                L5: {
                  if (!ck.a(-74, param1 - 1)) {
                    break L5;
                  } else {
                    ln.field_a.field_o[-1 + param1] = 679;
                    break L5;
                  }
                }
                L6: {
                  if (!ck.a(119, 1 + param1)) {
                    break L6;
                  } else {
                    ln.field_a.field_o[1 + param1] = 681;
                    break L6;
                  }
                }
                L7: {
                  if (!ck.a(-87, ln.field_a.field_d + param1)) {
                    break L7;
                  } else {
                    ln.field_a.field_o[param1 - -ln.field_a.field_d] = 696;
                    break L7;
                  }
                }
                ln.field_a.field_o[param1] = -1;
                break L3;
              } else {
                break L3;
              }
            }
            L8: {
              if (ln.field_a.field_c[param1] != 3) {
                break L8;
              } else {
                var2_int = 0;
                L9: while (true) {
                  if (var2_int >= el.field_j) {
                    break L8;
                  } else {
                    L10: {
                      if (mm.field_m[var2_int] == null) {
                        break L10;
                      } else {
                        if (mm.field_m[var2_int].field_b) {
                          break L10;
                        } else {
                          if (mm.field_m[var2_int].field_i == 0) {
                            break L10;
                          } else {
                            if (mm.field_m[var2_int].field_i == 231) {
                              break L10;
                            } else {
                              if (param1 != mm.field_m[var2_int].field_j.b(-4)) {
                                break L10;
                              } else {
                                mm.field_m[var2_int].field_I = 0;
                                ln.field_a.field_c[param1] = 0;
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L9;
                  }
                }
              }
            }
            L11: {
              if (ln.field_a.field_f[param1] != 0) {
                break L11;
              } else {
                ln.field_a.field_f[param1] = 1;
                break L11;
              }
            }
            L12: {
              if (148 == ln.field_a.field_y[param1]) {
                mf.a(true, 4);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              L14: {
                if (ln.field_a.field_y[param1] < 480) {
                  break L14;
                } else {
                  if (ln.field_a.field_y[param1] <= 583) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              ln.field_a.field_y[param1] = 513;
              break L13;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "wh.A(" + 1 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking music";
        field_c = new fa("usename");
    }
}
