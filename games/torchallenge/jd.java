/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends RuntimeException {
    String field_c;
    static lj field_e;
    static String field_d;
    static hd field_b;
    Throwable field_a;
    static String field_f;
    static int[] field_g;
    private static String field_z;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        if (param0 != 640) {
            return;
        }
        field_f = null;
        field_b = null;
    }

    jd(Throwable param0, String param1) {
        ((jd) this).field_c = param1;
        ((jd) this).field_a = param0;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TorChallenge.field_F ? 1 : 0;
          var1 = rf.field_ib;
          var4 = 0;
          var5 = 0;
          var6 = 50;
          if (rf.field_ib != -1) {
            break L0;
          } else {
            if (-101 > nd.field_e) {
              var6 = 100;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (nd.field_e >= var6) {
            if (nd.field_e > gh.field_n[rf.field_ib] - var6) {
              var4 = 1;
              var5 = (-nd.field_e + gh.field_n[rf.field_ib]) * 256 / var6;
              break L1;
            } else {
              break L1;
            }
          } else {
            var4 = 1;
            var5 = 256 * nd.field_e / var6;
            break L1;
          }
        }
        L2: {
          if (5 != rf.field_ib) {
            break L2;
          } else {
            var4 = 1;
            var5 = 0;
            break L2;
          }
        }
        L3: {
          if (5 > rf.field_ib) {
            bh.d((byte) -128);
            break L3;
          } else {
            var1 = 4;
            break L3;
          }
        }
        L4: {
          qg.f(0, 0, 640, 60, 1);
          qg.f(0, 419, 640, 60, 1);
          qg.a(pf.field_g);
          qg.a(0, 59, 640, 419);
          if (param0 == 68) {
            break L4;
          } else {
            field_g = null;
            break L4;
          }
        }
        var8 = 0;
        L5: while (true) {
          if (s.field_l[var1] <= var8) {
            L6: {
              qg.b(pf.field_g);
              if (var4 != 0) {
                dg.a(var5, true);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((rf.field_ib ^ -1) > -6) {
                var8 = -1;
                var9 = -1;
                var10 = 0;
                L8: while (true) {
                  if (var10 >= dg.field_bb[rf.field_ib].length) {
                    break L7;
                  } else {
                    var8 = v.field_X[0][rf.field_ib][var10][0];
                    var9 = v.field_X[1][rf.field_ib][var10][1];
                    if (nd.field_e >= var8) {
                      if (var9 >= nd.field_e) {
                        L9: {
                          var7 = lc.a(var10, 1);
                          if (0 > var7) {
                            int discarded$2 = tf.field_x.a(dg.field_bb[rf.field_ib][var10], 0, 420, 640, 60, 0, -1, 1, 1, 0);
                            break L9;
                          } else {
                            int discarded$3 = tf.field_x.a(dg.field_bb[rf.field_ib][var10], 0, 420, 640, 60, 0, -1, var7, 1, 1, 0);
                            break L9;
                          }
                        }
                        return;
                      } else {
                        var10++;
                        continue L8;
                      }
                    } else {
                      var10++;
                      continue L8;
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            return;
          } else {
            var2 = -cg.field_e[0] + (gh.field_k[var1][var8][0] << -1558422428);
            var3 = -cg.field_e[1] + (gh.field_k[var1][var8][1] + 59 << 1495987556);
            ef.field_h[var1][var8].b(0, 0, var2, var3, 0, 4096);
            var8++;
            continue L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "jd.B(";
        field_d = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = new hd();
        field_f = "From only <%0>/month";
        field_g = new int[]{10, 10, 5};
    }
}
