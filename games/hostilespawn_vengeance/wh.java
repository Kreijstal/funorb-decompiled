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

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        if (param0 != 0) {
            field_a = null;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        int var1 = lm.e(0);
        int var2 = ti.a((byte) -1);
        ne.field_j.a(var1 + (ac.field_a << -1009418719), s.field_g + -ac.field_g, var2 - -(ac.field_g << 1269285729), hg.field_f + -ac.field_a, 5);
        rh.d((byte) -93);
        if (param0 <= 99) {
            field_e = null;
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        L0: {
          L1: {
            var3 = HostileSpawn.field_I ? 1 : 0;
            if ((ln.field_a.field_c[param1] ^ -1) == -3) {
              break L1;
            } else {
              if (ln.field_a.field_c[param1] != 4) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ln.field_a.field_c[param1] = 0;
          break L0;
        }
        L2: {
          if (0 <= ln.field_a.field_o[param1]) {
            L3: {
              if (!ck.a(-62, -ln.field_a.field_d + param1)) {
                break L3;
              } else {
                ln.field_a.field_o[param1 + -ln.field_a.field_d] = 664;
                break L3;
              }
            }
            L4: {
              if (!ck.a(-74, param1 - 1)) {
                break L4;
              } else {
                ln.field_a.field_o[-1 + param1] = 679;
                break L4;
              }
            }
            L5: {
              if (!ck.a(119, 1 + param1)) {
                break L5;
              } else {
                ln.field_a.field_o[1 + param1] = 681;
                break L5;
              }
            }
            L6: {
              if (!ck.a(-87, ln.field_a.field_d + param1)) {
                break L6;
              } else {
                ln.field_a.field_o[param1 - -ln.field_a.field_d] = 696;
                break L6;
              }
            }
            ln.field_a.field_o[param1] = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L7: {
          if ((ln.field_a.field_c[param1] ^ -1) != -4) {
            break L7;
          } else {
            var2 = 0;
            L8: while (true) {
              if (var2 >= el.field_j) {
                break L7;
              } else {
                if (mm.field_m[var2] != null) {
                  if (!mm.field_m[var2].field_b) {
                    if (mm.field_m[var2].field_i != 0) {
                      if ((mm.field_m[var2].field_i ^ -1) != -232) {
                        if (param1 == mm.field_m[var2].field_j.b(-4)) {
                          mm.field_m[var2].field_I = 0;
                          ln.field_a.field_c[param1] = 0;
                          break L7;
                        } else {
                          var2++;
                          continue L8;
                        }
                      } else {
                        var2++;
                        continue L8;
                      }
                    } else {
                      var2++;
                      continue L8;
                    }
                  } else {
                    var2++;
                    continue L8;
                  }
                } else {
                  var2++;
                  continue L8;
                }
              }
            }
          }
        }
        L9: {
          if (ln.field_a.field_f[param1] != 0) {
            break L9;
          } else {
            ln.field_a.field_f[param1] = 1;
            break L9;
          }
        }
        L10: {
          if (148 == ln.field_a.field_y[param1]) {
            L11: {
              if (param0) {
                stackOut_36_0 = 0;
                stackIn_37_0 = stackOut_36_0;
                break L11;
              } else {
                stackOut_35_0 = 1;
                stackIn_37_0 = stackOut_35_0;
                break L11;
              }
            }
            mf.a(stackIn_37_0 != 0, 4);
            break L10;
          } else {
            break L10;
          }
        }
        if (param0) {
          L12: {
            L13: {
              if ((ln.field_a.field_y[param1] ^ -1) > -481) {
                break L13;
              } else {
                if (ln.field_a.field_y[param1] <= 583) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            ln.field_a.field_y[param1] = 513;
            break L12;
          }
          return;
        } else {
          return;
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
