/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class am extends vf {
    static kv[] field_M;
    private int field_L;
    private int field_I;
    static long field_K;
    private int field_N;
    static boolean field_O;
    static int[] field_Q;
    private int field_J;
    static int[] field_R;
    private int field_H;
    private int field_P;

    public static void c() {
        field_Q = null;
        field_R = null;
        field_M = null;
    }

    void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = BachelorFridge.field_y;
        dg.b(param2 - -6, param0 - -35, -12 + ((am) this).field_p, -40 + ((am) this).field_q, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (~var4 >= ~var7) {
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var9 = 83;
            var7 = 0;
            var8 = 35 + param0;
            L1: while (true) {
              if (var4 <= var7) {
                gt.field_s.e(-90 + (param2 + ((am) this).field_p), 10 + param0);
                ao.a(param2 - -5, oea.field_s, ((am) this).field_p - 10, (byte) -128, param0 - -35);
                ao.a(param2, jw.field_v, ((am) this).field_p, (byte) -128, ((am) this).field_q + (param0 - 22));
                var5 = 169;
                var4 = ((am) this).field_q + -79;
                var6 = 127;
                var7 = 0;
                var8 = param0 + 57;
                L2: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 - -(var7 * (-var5 + var6) / var4);
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    dg.e(param2, var8, 6, var9);
                    dg.e(((am) this).field_p + (param2 + -6), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var10 = var7 * (var6 + -var5) / var4 + var5;
                var10 = var10 | (var10 << 16 | var10 << 8);
                dg.e(param2, var8, 6, var10);
                dg.e(-6 + param2 - -((am) this).field_p, var8, 6, var10);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            L3: {
              if (dg.field_j > var8) {
                break L3;
              } else {
                if (~var8 > ~dg.field_k) {
                  L4: {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var10 = 0;
                    var11 = ((am) this).field_p;
                    if (20 < var7) {
                      break L4;
                    } else {
                      L5: while (true) {
                        if (var10 > 20) {
                          break L4;
                        } else {
                          L6: {
                            var12 = (20 - var10) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                            if (var12 <= 462) {
                              if (var12 < 420) {
                                break L4;
                              } else {
                                var13 = (462 - var12) * var9 / 42;
                                var13 = var13 | (var13 << 8 | var13 << 16);
                                dg.field_e[var8 * dg.field_i + param2 + var10] = var13;
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                  L7: {
                    if (20 < var7) {
                      break L7;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L8: while (true) {
                        L9: {
                          if (var13 > 20) {
                            break L9;
                          } else {
                            var14 = var13 * var13 + (-var7 + 20) * (20 - var7);
                            if (var14 > 462) {
                              break L9;
                            } else {
                              L10: {
                                if (var14 < 420) {
                                  var12 = var11 + 1;
                                  break L10;
                                } else {
                                  var15 = (-var14 + 462) * var9 / 42;
                                  var15 = var15 | (var15 << 8 | var15 << 16);
                                  dg.field_e[param2 + (dg.field_i * var8 + var11)] = var15;
                                  break L10;
                                }
                              }
                              var11++;
                              var13++;
                              continue L8;
                            }
                          }
                        }
                        var11 = var12;
                        break L7;
                      }
                    }
                  }
                  var9 = var9 | (var9 << 8 | var9 << 16);
                  dg.e(param2 + var10, var8, var11 - var10, var9);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            var8++;
            var7++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param0 > 0)) {
            ((am) this).b(-79, param2, param3);
            return;
        }
        ((am) this).field_H = param2;
        ((am) this).field_J = param0;
        if (param1 != 26012) {
            return;
        }
        ((am) this).field_I = ((am) this).field_p;
        ((am) this).field_N = ((am) this).field_q;
        ((am) this).field_L = 0;
        ((am) this).field_P = param3;
    }

    void b(boolean param0) {
        if (param0) {
            ((am) this).m(-15);
        }
    }

    am(rp param0, int param1, int param2) {
        super(param0, param1, param2);
        ((am) this).field_J = 0;
        ((am) this).field_L = 0;
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (((am) this).field_J > 0) {
            var2 = ((am) this).field_P;
            var3 = ((am) this).field_H;
            int fieldTemp$0 = ((am) this).field_L + 1;
            ((am) this).field_L = ((am) this).field_L + 1;
            if (((am) this).field_J > fieldTemp$0) {
                var4 = (2 * ((am) this).field_J + -((am) this).field_L) * ((am) this).field_L;
                var5 = ((am) this).field_J * ((am) this).field_J;
                var2 = (((am) this).field_P + -((am) this).field_I) * var4 / var5 + ((am) this).field_I;
                var3 = ((am) this).field_N + (-((am) this).field_N + ((am) this).field_H) * var4 / var5;
            } else {
                ((am) this).field_J = 0;
                ((am) this).b(false);
            }
            ((am) this).b(-123, var3, var2);
        }
        return super.a(-116);
    }

    boolean k(int param0) {
        ((am) this).m(17310);
        return super.k(-81);
    }

    void m(int param0) {
        if (((am) this).field_J <= 0) {
            return;
        }
        ((am) this).b(-35, ((am) this).field_H, ((am) this).field_P);
        if (param0 != 17310) {
            return;
        }
        ((am) this).field_J = 0;
        ((am) this).b(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 0L;
        field_Q = new int[]{23, 23, 24, 26, 28};
    }
}
