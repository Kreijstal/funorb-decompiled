/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_a;
    static String field_c;
    static int field_e;
    static String field_d;
    static int field_b;

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!qh.c(55)) {
            L1: {
              ua.field_i.a(eb.a(eb.field_a, ni.field_e, -94), eb.a(oc.field_e, di.field_b, -119), -1);
              if (ua.field_i.c(-62)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = 0;
                if (var1 == 0) {
                  break L3;
                } else {
                  if (-1 >= (ua.field_i.field_f ^ -1)) {
                    L4: {
                      var3 = pk.field_j[ua.field_i.field_f];
                      if (var3 == -3) {
                        break L4;
                      } else {
                        if (var3 == -6) {
                          break L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                    wl.l(-12128);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var2 == 0) {
                break L2;
              } else {
                if (2 == rb.field_s) {
                  break L2;
                } else {
                  wl.l(-12128);
                  break L2;
                }
              }
            }
            L5: {
              if (-1 != var3) {
                break L5;
              } else {
                if (-3 != rb.field_s) {
                  break L5;
                } else {
                  var4 = ih.a((byte) -98) - jj.field_p;
                  var6 = (int)((-var4 + 10999L) / 1000L);
                  if (0 >= var6) {
                    qc.a(5, true, 0);
                    var3 = 2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (param0 < -59) {
                break L6;
              } else {
                field_b = -43;
                break L6;
              }
            }
            return var3;
          } else {
            L7: {
              ua.field_i.a(0);
              if (ua.field_i.c(-107)) {
                var1 = 1;
                break L7;
              } else {
                break L7;
              }
            }
            if (gi.field_f != 13) {
              continue L0;
            } else {
              var2 = 1;
              continue L0;
            }
          }
        }
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 != -128) {
            int discarded$0 = vd.a((byte) 99);
        }
        int var2 = param1 & 255;
        if (!(var2 != 0)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (-129 >= (var2 ^ -1)) {
            if (!((var2 ^ -1) <= -161)) {
                var3 = wf.field_a[var2 + -128];
                if (!(var3 != 0)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    final static void a(nj param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            L1: {
              if (param1 == -128) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (gi.field_g <= var2) {
                cg.field_d[param0.a((byte) 90)] = cg.field_d[param0.a((byte) 90)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= gi.field_g) {
                    gi.field_g = var2;
                    gi.field_g = gi.field_g + 1;
                    ai.field_d[gi.field_g] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_p == ai.field_d[var3].field_p) {
                        var4 = ai.field_d[var3].a((byte) 105);
                        if (pd.field_q >= cg.field_d[var4]) {
                          break L4;
                        } else {
                          cg.field_d[var4] = cg.field_d[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    ai.field_d[var2] = ai.field_d[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (ai.field_d[var2].field_p == param0.field_p) {
                  cg.field_d[ai.field_d[var2].a((byte) 95)] = cg.field_d[ai.field_d[var2].a((byte) 95)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            cg.field_d[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 <= 73) {
            field_c = null;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Age:";
        field_a = "OVER <%0>";
        field_e = 0;
    }
}
