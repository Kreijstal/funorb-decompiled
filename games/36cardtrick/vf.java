/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vf {
    static cc field_a;
    static int field_b;

    abstract void a(byte[] param0, byte param1);

    abstract byte[] a(byte param0);

    public static void b(int param0) {
        field_a = null;
        if (param0 >= -88) {
            field_a = null;
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var5 = Main.field_T;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        int var4 = 0;
        if (param0 != 4) {
            return null;
        }
        while (var4 < param1) {
            var6[var4] = param2;
            var4++;
        }
        return new String(var6);
    }

    final static int b(byte param0) {
        int var1 = 0;
        int var2 = Main.field_T;
        boolean discarded$8 = sd.field_c.a((byte) -116, lg.field_E, te.field_a, true);
        sd.field_c.l(-2054);
        while (ge.b((byte) -114)) {
            boolean discarded$9 = sd.field_c.a(fd.field_n, 34, tb.field_d);
        }
        if (!(0 == (ml.field_a ^ -1))) {
            var1 = ml.field_a;
            gh.a(-1, 31888);
            return var1;
        }
        if (param0 < 63) {
            return 44;
        }
        if (!(!r.field_p)) {
            return 3;
        }
        if (!(ei.field_d != hh.field_g)) {
            return 1;
        }
        if (!wh.field_a.a(640)) {
            return 1;
        }
        if (hh.field_g == jc.field_P) {
            return 2;
        }
        return -1;
    }

    final static void a(int param0) {
        int var2 = 0;
        mf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        w var14 = null;
        int[][] var18 = null;
        L0: {
          var12 = Main.field_T;
          var14 = rd.field_j;
          if (param0 == -28037) {
            break L0;
          } else {
            vf.a(-72);
            break L0;
          }
        }
        var2 = var14.f(param0 ^ 28154);
        var3 = (mf) (Object) wg.field_b.a((byte) 74);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var3.field_k != var2) {
                var3 = (mf) (Object) wg.field_b.b((byte) -115);
                continue L1;
              } else {
                break L2;
              }
            }
          }
          if (var3 != null) {
            L3: {
              var4 = var14.f(64);
              if (0 != var4) {
                ad.field_i[0] = ri.field_c;
                var5 = var3.field_h;
                var6_int = 1;
                L4: while (true) {
                  if (var4 <= var6_int) {
                    wd.a((byte) 36, var5, var4);
                    var6_int = 0;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        rf.a(-23243, var5);
                        var6 = new String[2][var5];
                        var18 = new int[2][var5 * 4];
                        var8 = ei.field_f;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var9 >= var8) {
                            var9 = 0;
                            var13 = 0;
                            var10 = var13;
                            L7: while (true) {
                              if (var8 <= var9) {
                                break L3;
                              } else {
                                var11 = re.field_c[var5 - -var9];
                                var6[1][var13] = ad.field_i[var11];
                                var18[1][var13 * 4] = p.field_n[var11];
                                var18[1][1 + 4 * var13] = q.field_h[var11];
                                var18[1][2 + 4 * var13] = mj.field_b[var11];
                                var18[1][4 * var13 + 3] = ij.field_c[var11];
                                if (rc.a(true, ad.field_i[var11])) {
                                  if (q.field_h[var11] - (-mj.field_b[var11] + -ij.field_c[var11]) == 0) {
                                    var6[1][var13] = null;
                                    var13--;
                                    var9++;
                                    var13++;
                                    continue L7;
                                  } else {
                                    var9++;
                                    var13++;
                                    continue L7;
                                  }
                                } else {
                                  var9++;
                                  var13++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = re.field_c[var9];
                            var6[0][var10] = ad.field_i[var11];
                            var18[0][4 * var10] = p.field_n[var11];
                            var18[0][1 + var10 * 4] = q.field_h[var11];
                            var18[0][2 + 4 * var10] = mj.field_b[var11];
                            var18[0][var10 * 4 + 3] = ij.field_c[var11];
                            if (rc.a(true, ad.field_i[var11])) {
                              if (ij.field_c[var11] + q.field_h[var11] + mj.field_b[var11] == 0) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L6;
                              } else {
                                var9++;
                                var10++;
                                continue L6;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        bc.a(false, (pb) (Object) var14);
                        if (var6_int == 0) {
                          a.a(sa.field_a, nl.field_b, cg.field_h, -23576, var6_int, pc.field_c);
                          var6_int++;
                          continue L5;
                        } else {
                          a.a(sa.field_a, nl.field_b, cg.field_h, param0 ^ 12691, var6_int, pc.field_c);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    ad.field_i[var6_int] = var14.c(false);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.c(95);
            return;
          } else {
            mc.a((byte) -125);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new cc();
        field_b = -2014707693;
    }
}
