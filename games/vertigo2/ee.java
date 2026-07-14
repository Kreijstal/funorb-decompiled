/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String field_a;
    static int field_c;
    static cr field_b;
    static String field_d;

    final static void a(int param0, int param1, int param2) {
        if (param1 > -25) {
            return;
        }
        gg discarded$0 = e.a(on.field_b[param2][param0], false);
    }

    final static void a(int param0, r param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 9) {
            var2 = 9;
            L1: while (true) {
              if (50 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (-10 >= (var2 ^ -1)) {
                    var2 = 9;
                    L3: while (true) {
                      if (var2 >= 30) {
                        var2 = 0;
                        L4: while (true) {
                          if (var2 >= 9) {
                            if (param0 == 11579) {
                              var2 = 9;
                              L5: while (true) {
                                if (40 <= var2) {
                                  var2 = 0;
                                  L6: while (true) {
                                    if (-10 >= (var2 ^ -1)) {
                                      var2 = 9;
                                      L7: while (true) {
                                        if (var2 >= 50) {
                                          return;
                                        } else {
                                          kn.field_h[3][var2] = kn.field_h[0][var2];
                                          var2++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      kn.field_h[3][var2] = kn.field_h[0][var2];
                                      var2++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  kn.field_h[2][var2] = new ed(param1.a("", "level" + (1 + var2) + ".cmp", tk.a(param0, 11579)));
                                  var2++;
                                  continue L5;
                                }
                              }
                            } else {
                              return;
                            }
                          } else {
                            kn.field_h[2][var2] = new ed(param1.a("", "level0" + (var2 + 1) + ".cmp", 0));
                            var2++;
                            continue L4;
                          }
                        }
                      } else {
                        kn.field_h[1][var2] = new ed(param1.a("", "level" + (1 + var2) + ".2pl", tk.a(param0, 11579)));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    kn.field_h[1][var2] = new ed(param1.a("", "level0" + (1 + var2) + ".2pl", param0 + -11579));
                    var2++;
                    continue L2;
                  }
                }
              } else {
                kn.field_h[0][var2] = new ed(param1.a("", "level" + (var2 + 1) + ".map", 0));
                var2++;
                continue L1;
              }
            }
          } else {
            kn.field_h[0][var2] = new ed(param1.a("", "level0" + (var2 - -1) + ".map", 0));
            var2++;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 0) {
            ee.a(111);
        }
        field_a = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Vertigo2.field_L ? 1 : 0;
          var1 = 0;
          if (param0 == -11747) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var1 >= rr.field_B.length) {
            return;
          } else {
            if (rr.field_z[var1]) {
              eg.a(88, rr.field_B[var1]);
              rr.field_z[var1] = false;
              var1++;
              continue L1;
            } else {
              var1++;
              continue L1;
            }
          }
        }
    }

    final static short[] a(mi param0, int param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        var4 = param0.c((byte) -120, param2);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          var5 = param0.c((byte) -118, 4);
          var6 = (short)param0.c((byte) -94, 16);
          if (param1 < -24) {
            L2: {
              if (var5 <= 0) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (short)var6;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (short)(var6 + param0.c((byte) -96, var5));
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param3;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (!((param0 ^ -1) >= -1)) {
            var2 = 1;
            if (!(param0 <= 65535)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (!(255 >= param0)) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (-16 > (param0 ^ -1)) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!(param0 <= 3)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(-256 <= param0)) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!(-16 <= param0)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (param1 < 38) {
            field_d = null;
        }
        if (!(-4 <= param0)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (1 < (param0 ^ -1)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 8) {
            Object var3 = null;
            ee.a(77, (r) null);
        }
        if (!(!tf.a((byte) 112))) {
            param1 = false;
        }
        kf.a(-7393, param1);
        if (bg.field_c) {
            bi.d(el.field_e.field_b.field_wb, el.field_e.field_b.field_N, el.field_e.field_b.field_Fb, el.field_e.field_b.field_db);
            el.field_e.field_b.b(param1, param0 ^ 8);
        }
        ma.a(param1, 78);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) as.field_b);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) as.field_b);
        if (param1 < 31) {
            field_d = null;
        }
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) as.field_b);
        cl.field_f = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for textures";
        field_a = "<%0> has dropped out.";
    }
}
