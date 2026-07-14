/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_c;
    static int[] field_d;
    static volatile boolean field_e;
    private int[] field_b;
    static bd field_a;

    final static boolean a(byte param0) {
        int var1 = -58 % ((param0 - 55) / 62);
        return uk.a(bm.field_b, 0);
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -109) {
            break L0;
          } else {
            field_e = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static pg b(int param0) {
        pg var1 = new pg(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], ja.field_e[param0], bf.field_d);
        uj.d(param0 ^ -43);
        return var1;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 1) {
            field_a = null;
        }
        field_a = null;
    }

    final static void c(int param0) {
        int var2 = 0;
        qj var3 = null;
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
        en var14 = null;
        int[][] var18 = null;
        L0: {
          var12 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            boolean discarded$1 = rg.a((byte) -86);
            break L0;
          }
        }
        var14 = sc.field_g;
        var2 = var14.l(32270);
        var3 = (qj) (Object) rj.field_G.g(-83);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var3.field_i != var2) {
                var3 = (qj) (Object) rj.field_G.a(param0 + 12683);
                continue L1;
              } else {
                break L2;
              }
            }
          }
          if (var3 != null) {
            L3: {
              var4 = var14.l(32270);
              if (0 == var4) {
                break L3;
              } else {
                var5 = var3.field_j;
                al.field_M[0] = qg.field_r;
                var6_int = 1;
                L4: while (true) {
                  if (var4 <= var6_int) {
                    qh.a(var4, var5, param0 + 95);
                    var6_int = 0;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        ve.a((byte) -125, var5);
                        var6 = new String[2][var5];
                        var18 = new int[2][var5 * 4];
                        var8 = fc.field_z;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var9 >= var8) {
                            var9 = 0;
                            var13 = 0;
                            var10 = var13;
                            L7: while (true) {
                              if (var9 >= var8) {
                                break L3;
                              } else {
                                var11 = db.field_s[var5 - -var9];
                                var6[1][var13] = al.field_M[var11];
                                var18[1][var13 * 4] = qa.field_d[var11];
                                var18[1][var13 * 4 - -1] = ta.field_mb[var11];
                                var18[1][2 + var13 * 4] = og.field_b[var11];
                                var18[1][var13 * 4 + 3] = db.field_t[var11];
                                if (pc.a(14088, al.field_M[var11])) {
                                  if (ta.field_mb[var11] + og.field_b[var11] - -db.field_t[var11] == 0) {
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
                            var11 = db.field_s[var9];
                            var6[0][var10] = al.field_M[var11];
                            var18[0][4 * var10] = qa.field_d[var11];
                            var18[0][4 * var10 + 1] = ta.field_mb[var11];
                            var18[0][4 * var10 - -2] = og.field_b[var11];
                            var18[0][3 + 4 * var10] = db.field_t[var11];
                            if (pc.a(14088, al.field_M[var11])) {
                              if (0 == db.field_t[var11] + (og.field_b[var11] + ta.field_mb[var11])) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        qj.a((vi) (Object) var14, (byte) -12);
                        if (-1 != (var6_int ^ -1)) {
                          pm.a(var6_int, s.field_e, 75, sm.field_g, jn.field_J, hf.field_a);
                          var6_int++;
                          continue L5;
                        } else {
                          pm.a(var6_int, s.field_e, 80, sm.field_g, jn.field_J, hf.field_a);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    al.field_M[var6_int] = var14.o(32);
                    var6_int++;
                    continue L4;
                  }
                }
              }
            }
            var3.b(param0 ^ 109);
            return;
          } else {
            le.c((byte) 41);
            return;
          }
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = -1 + (((rg) this).field_b.length >> 2012803233);
        if (param0) {
          var4 = var3 & param1;
          L0: while (true) {
            var5 = ((rg) this).field_b[1 + (var4 - -var4)];
            if (var5 == -1) {
              return -1;
            } else {
              if (((rg) this).field_b[var4 - -var4] == param1) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            }
          }
        } else {
          return -37;
        }
    }

    rg(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (param0.length - -(param0.length >> 1639691585) >= var2) {
            var2 = var2 << 1;
        }
        ((rg) this).field_b = new int[var2 - -var2];
        for (var3 = 0; var3 < var2 + var2; var3++) {
            ((rg) this).field_b[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & var2 - 1;
            while (((rg) this).field_b[var4 + (var4 + 1)] != -1) {
                var4 = -1 + var2 & 1 + var4;
            }
            ((rg) this).field_b[var4 + var4] = param0[var3];
            ((rg) this).field_b[var4 + var4 - -1] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Destroy all the spawn eggs in this area, then exit via the lift.";
        field_e = false;
    }
}
