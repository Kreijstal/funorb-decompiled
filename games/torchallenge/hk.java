/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int[][][][] field_a;
    static boolean field_b;
    static int[] field_c;
    static int field_e;
    static boolean field_d;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        fe var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = -1;
        if (sh.field_r != -1) {
          db.g(-56);
          var5 = 0;
          L0: while (true) {
            if (-3 <= var5) {
              if (param0 <= 93) {
                hk.a(-56);
                return;
              } else {
                return;
              }
            } else {
              L1: {
                if (-1 <= (fk.field_u[var5] ^ -1)) {
                  break L1;
                } else {
                  fk.field_u[var5] = fk.field_u[var5] - 1;
                  break L1;
                }
              }
              if (0 >= fh.field_h[var5]) {
                L2: {
                  if (tg.field_r[var5] == null) {
                    break L2;
                  } else {
                    if (!wh.field_d[var5]) {
                      break L2;
                    } else {
                      je.a((byte) 15, tg.field_r[var5]);
                      break L2;
                    }
                  }
                }
                wh.field_d[var5] = false;
                var5++;
                continue L0;
              } else {
                var2 = fj.field_p[var5];
                if (ea.field_g != null) {
                  if (var2 <= -1) {
                    if (ea.field_g.length > var2) {
                      L3: {
                        var1 = fh.field_h[var5];
                        if (tg.field_r[var5] == null) {
                          L4: {
                            if (-1 != var5) {
                              break L4;
                            } else {
                              var4 = 11;
                              break L4;
                            }
                          }
                          L5: {
                            if (var5 != 1) {
                              break L5;
                            } else {
                              var4 = 12;
                              break L5;
                            }
                          }
                          if (var4 >= 0) {
                            var3 = cj.field_h[var4];
                            tg.field_r[var5] = nc.a(var3, 100, var1);
                            tg.field_r[var5].e(-1);
                            tg.field_r[var5].e(0, var3.field_k.length);
                            da.field_g[var5] = we.a(tg.field_r[var5], 6222);
                            wh.field_d[var5] = true;
                            fk.field_u[var5] = 25;
                            break L3;
                          } else {
                            var5++;
                            continue L0;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if (!wh.field_d[var5]) {
                          tg.field_r[var5].h(var1);
                          da.field_g[var5] = we.a(tg.field_r[var5], 6222);
                          wh.field_d[var5] = true;
                          fk.field_u[var5] = 25;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (wh.field_d[var5]) {
                        if (-1 == (fk.field_u[var5] ^ -1)) {
                          tg.field_r[var5].f(25, var1);
                          fk.field_u[var5] = 25;
                          var5++;
                          continue L0;
                        } else {
                          var5++;
                          continue L0;
                        }
                      } else {
                        var5++;
                        continue L0;
                      }
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var5++;
                    var5++;
                    continue L0;
                  }
                } else {
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[3];
        field_a = new int[][][][]{new int[7][][], new int[7][][], new int[7][][]};
        field_b = false;
    }
}
