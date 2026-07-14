/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static String field_f;
    private cn field_c;
    static int[] field_b;
    static String field_d;
    private cn field_e;
    static String[] field_a;

    final cn d(int param0) {
        if (param0 > -96) {
            wb.a(79);
        }
        cn var2 = ((wb) this).field_e;
        if (!(var2 != ((wb) this).field_c)) {
            ((wb) this).field_e = null;
            return null;
        }
        ((wb) this).field_e = var2.field_x;
        return var2;
    }

    final void a(byte param0) {
        cn var2 = null;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        L0: while (true) {
          var2 = ((wb) this).field_c.field_x;
          if (((wb) this).field_c != var2) {
            var2.f((byte) -62);
            continue L0;
          } else {
            L1: {
              ((wb) this).field_e = null;
              if (param0 == 112) {
                break L1;
              } else {
                ((wb) this).a((byte) 101);
                break L1;
              }
            }
            return;
          }
        }
    }

    final int c(int param0) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        cn var3 = ((wb) this).field_c.field_x;
        while (((wb) this).field_c != var3) {
            var3 = var3.field_x;
            var2++;
        }
        if (param0 != -7432) {
            int discarded$0 = ((wb) this).c(107);
        }
        return var2;
    }

    final static int[][] a(ln[] param0, int param1) {
        int var2 = 0;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var5_ref_ln__ = null;
        int var6 = 0;
        ln var7_ref_ln = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param0.length;
        var13 = new int[var2][var2];
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var3 = var10;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            var4 = param1;
            L1: while (true) {
              if (var2 <= var4) {
                return var3;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var2) {
                    var4++;
                    continue L1;
                  } else {
                    var9 = 0;
                    var6 = var9;
                    L3: while (true) {
                      if (var9 >= var2) {
                        var5++;
                        continue L2;
                      } else {
                        if (-1 != var13[var5][var4]) {
                          if (-1 != var13[var4][var9]) {
                            L4: {
                              var7 = var13[var4][var9] + var13[var5][var4];
                              if (var13[var5][var9] == -1) {
                                break L4;
                              } else {
                                if (var7 < var13[var5][var9]) {
                                  break L4;
                                } else {
                                  var9++;
                                  continue L3;
                                }
                              }
                            }
                            var13[var5][var9] = var7;
                            var9++;
                            continue L3;
                          } else {
                            var9++;
                            continue L3;
                          }
                        } else {
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L5: while (true) {
              if (var5 >= var2) {
                var13[var4][var4] = 0;
                var5_ref_ln__ = param0[var4].field_D;
                var6 = 0;
                L6: while (true) {
                  if (var5_ref_ln__.length <= var6) {
                    var4++;
                    continue L0;
                  } else {
                    var7_ref_ln = var5_ref_ln__[var6];
                    if (var7_ref_ln.field_R == param0[var4].field_R) {
                      var13[var4][var7_ref_ln.field_p] = 1;
                      var6++;
                      continue L6;
                    } else {
                      var6++;
                      continue L6;
                    }
                  }
                }
              } else {
                var13[var4][var5] = -1;
                var5++;
                continue L5;
              }
            }
          }
        }
    }

    final void a(byte param0, cn param1) {
        if (param0 != 9) {
            return;
        }
        if (!(null == param1.field_u)) {
            param1.f((byte) -62);
        }
        param1.field_x = ((wb) this).field_c;
        param1.field_u = ((wb) this).field_c.field_u;
        param1.field_u.field_x = param1;
        param1.field_x.field_u = param1;
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 >= -72) {
            field_a = null;
        }
    }

    public wb() {
        ((wb) this).field_c = new cn();
        ((wb) this).field_c.field_u = ((wb) this).field_c;
        ((wb) this).field_c.field_x = ((wb) this).field_c;
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 79) {
            break L0;
          } else {
            wb.a(25);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < gm.field_i) {
              break L2;
            } else {
              if (-14 > ma.field_p) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final cn e(int param0) {
        cn var2 = ((wb) this).field_c.field_x;
        if (!(((wb) this).field_c != var2)) {
            ((wb) this).field_e = null;
            return null;
        }
        if (param0 != -31364) {
            field_d = null;
        }
        ((wb) this).field_e = var2.field_x;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You cannot add yourself!";
        field_d = "Error connecting to server. Please try using a different server.";
        field_a = new String[255];
    }
}
