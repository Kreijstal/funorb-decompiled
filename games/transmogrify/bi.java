/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi extends mk {
    static volatile boolean field_M;
    private int field_N;
    private int field_F;
    static int field_J;
    private int field_K;
    static int field_L;
    private int field_I;
    static String field_O;
    private int field_H;
    private int field_G;

    void p(int param0) {
        if (!(((bi) this).field_G > 0)) {
            return;
        }
        ((bi) this).a(((bi) this).field_H, ((bi) this).field_N, false);
        ((bi) this).field_G = 0;
        if (param0 != 27830) {
            return;
        }
        ((bi) this).d((byte) -2);
    }

    boolean m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= ((bi) this).field_G) {
        } else {
            var2 = ((bi) this).field_H;
            var3 = ((bi) this).field_N;
            int fieldTemp$0 = ((bi) this).field_F + 1;
            ((bi) this).field_F = ((bi) this).field_F + 1;
            if (fieldTemp$0 >= ((bi) this).field_G) {
                ((bi) this).field_G = 0;
                ((bi) this).d((byte) -2);
            } else {
                var4 = ((bi) this).field_F * (((bi) this).field_G * 2 - ((bi) this).field_F);
                var5 = ((bi) this).field_G * ((bi) this).field_G;
                var3 = ((bi) this).field_I - -((((bi) this).field_N + -((bi) this).field_I) * var4 / var5);
                var2 = var4 * (((bi) this).field_H - ((bi) this).field_K) / var5 + ((bi) this).field_K;
            }
            ((bi) this).a(var2, var3, false);
        }
        return super.m(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 > param0)) {
            ((bi) this).a(param1, param2, false);
            return;
        }
        ((bi) this).field_I = ((bi) this).field_h;
        ((bi) this).field_K = ((bi) this).field_l;
        ((bi) this).field_G = param3;
        ((bi) this).field_H = param1;
        ((bi) this).field_F = 0;
        ((bi) this).field_N = param2;
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
        var16 = Transmogrify.field_A ? 1 : 0;
        sb.d(param2 - -6, 35 + param0, -12 + ((bi) this).field_l, ((bi) this).field_h + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (var7 >= var4) {
            var4 = 22;
            var6 = 169;
            var5 = 194;
            var7 = 0;
            var8 = 35 + param0;
            L1: while (true) {
              if (var4 <= var7) {
                vf.field_a.c(-90 + (((bi) this).field_l + param2), 10 + param0);
                k.a(35 + param0, true, 5 + param2, ua.field_f, -10 + ((bi) this).field_l);
                k.a(-22 + (((bi) this).field_h + param0), true, param2, rh.field_l, ((bi) this).field_l);
                var5 = 169;
                var6 = 127;
                var4 = -79 + ((bi) this).field_h;
                var7 = 0;
                var8 = param0 - -57;
                L2: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 + (var6 - var5) * var7 / var4;
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    sb.d(param2, var8, 6, var9);
                    sb.d(-6 + ((bi) this).field_l + param2, var8, 6, var9);
                    var8++;
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 8 | var9 << 16);
                sb.d(param2, var8, 6, var9);
                sb.d(((bi) this).field_l + (param2 - 6), var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            if (var8 >= sb.field_e) {
              if (sb.field_f > var8) {
                L3: {
                  var9 = var5 + var7 * (var6 - var5) / var4;
                  var10 = 0;
                  var11 = ((bi) this).field_l;
                  if (20 < var7) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (var10 > 20) {
                        break L3;
                      } else {
                        var12 = (-var7 + 20) * (-var7 + 20) + (20 + -var10) * (20 + -var10);
                        if (-463 <= var12) {
                          if (-421 > var12) {
                            break L3;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 8 | var13 << 16);
                            sb.field_h[var8 * sb.field_c - -param2 - -var10] = var13;
                            var10++;
                            continue L4;
                          }
                        } else {
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L6: while (true) {
                      L7: {
                        if (var13 > 20) {
                          break L7;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                          if (462 >= var14) {
                            if (var14 >= 420) {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
                              sb.field_h[var11 + sb.field_c * var8 + param2] = var15;
                              var11++;
                              var13++;
                              continue L6;
                            } else {
                              var12 = var11 - -1;
                              var11++;
                              var13++;
                              continue L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = var12;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var9 = var9 | (var9 << 16 | var9 << 8);
                sb.d(var10 - -param2, var8, -var10 + var11, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    bi(da param0, int param1, int param2) {
        super(param0, param1, param2);
        ((bi) this).field_F = 0;
        ((bi) this).field_G = 0;
    }

    void d(byte param0) {
        if (param0 != -2) {
            bi.o(-106);
        }
    }

    boolean a(byte param0) {
        ((bi) this).p(27830);
        return super.a((byte) -97);
    }

    public static void o(int param0) {
        field_O = null;
        int var1 = 38 % ((29 - param0) / 45);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = true;
        field_O = "Player Name: ";
    }
}
