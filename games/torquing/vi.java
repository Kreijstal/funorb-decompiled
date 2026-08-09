/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int[] field_a;

    final static void a(int param0, sm param1, int param2, int param3, int[] param4) {
        int var12 = 0;
        if (param0 >= param4.length) {
            param1.a(param2, param3);
            return;
        }
        int var5 = param4[param0];
        if (var5 == 0) {
            return;
        }
        param2 = param2 + param1.field_a;
        param3 = param3 + param1.field_g;
        int var6 = param2 + param3 * ph.field_j;
        int var7 = 0;
        int var8 = param1.field_d;
        int var9 = param1.field_c;
        int var10 = ph.field_j - var9;
        int var11 = 0;
        if (param3 < ph.field_c) {
            var12 = ph.field_c - param3;
            var8 = var8 - var12;
            param3 = ph.field_c;
            var7 = var7 + var12 * var9;
            var6 = var6 + var12 * ph.field_j;
        }
        if (param3 + var8 > ph.field_h) {
            var8 = var8 - (param3 + var8 - ph.field_h);
        }
        if (param2 < ph.field_k) {
            var12 = ph.field_k - param2;
            var9 = var9 - var12;
            param2 = ph.field_k;
            var7 = var7 + var12;
            var6 = var6 + var12;
            var11 = var11 + var12;
            var10 = var10 + var12;
        }
        if (param2 + var9 > ph.field_a) {
            var12 = param2 + var9 - ph.field_a;
            var9 = var9 - var12;
            var11 = var11 + var12;
            var10 = var10 + var12;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        var12 = param3 - 1 << 2;
        int var13 = param2;
        vi.a(ph.field_e, param1.field_l, param1.field_k, 0, var7, var6, var5, var12, var13, var9, var8, var10, var11);
    }

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, t param1, int param2, int param3, int[] param4) {
        int var12 = 0;
        if (param0 >= param4.length) {
            param1.b(param2, param3);
            return;
        }
        int var5 = param4[param0];
        if (var5 == 0) {
            return;
        }
        param2 = param2 + param1.field_v;
        param3 = param3 + param1.field_r;
        int var6 = param2 + param3 * ph.field_j;
        int var7 = 0;
        int var8 = param1.field_t;
        int var9 = param1.field_s;
        int var10 = ph.field_j - var9;
        int var11 = 0;
        if (param3 < ph.field_c) {
            var12 = ph.field_c - param3;
            var8 = var8 - var12;
            param3 = ph.field_c;
            var7 = var7 + var12 * var9;
            var6 = var6 + var12 * ph.field_j;
        }
        if (param3 + var8 > ph.field_h) {
            var8 = var8 - (param3 + var8 - ph.field_h);
        }
        if (param2 < ph.field_k) {
            var12 = ph.field_k - param2;
            var9 = var9 - var12;
            param2 = ph.field_k;
            var7 = var7 + var12;
            var6 = var6 + var12;
            var11 = var11 + var12;
            var10 = var10 + var12;
        }
        if (param2 + var9 > ph.field_a) {
            var12 = param2 + var9 - ph.field_a;
            var9 = var9 - var12;
            var11 = var11 + var12;
            var10 = var10 + var12;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        var12 = param3 - 1 << 2;
        int var13 = param2;
        vi.a(ph.field_e, param1.field_y, var7, var6, var5, var12, var13, var9, var8, var10, var11);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var11;
        int var12;
        var11 = -param8;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            param5 = param5 + 4 & 12;
            if ((param4 >> param5 & 15) != 0) {
              var12 = param3 + param7 - 3;
              L1: while (true) {
                if (param3 >= var12) {
                  var12 += 3;
                  L2: while (true) {
                    if (param3 >= var12) {
                      param3 = param3 + param9;
                      param2 = param2 + param10;
                      param6 = param6 - param7;
                      var11++;
                      continue L0;
                    } else {
                      if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                        param3++;
                        param2++;
                        param6++;
                        continue L2;
                      } else {
                        incrementValue$0 = param3;
                        param3++;
                        incrementValue$1 = param2;
                        param2++;
                        param0[incrementValue$0] = param1[incrementValue$1];
                        param6++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L3: {
                    if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                      param3++;
                      param2++;
                      break L3;
                    } else {
                      incrementValue$2 = param3;
                      param3++;
                      incrementValue$3 = param2;
                      param2++;
                      param0[incrementValue$2] = param1[incrementValue$3];
                      break L3;
                    }
                  }
                  L4: {
                    param6++;
                    if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                      param3++;
                      param2++;
                      break L4;
                    } else {
                      incrementValue$4 = param3;
                      param3++;
                      incrementValue$5 = param2;
                      param2++;
                      param0[incrementValue$4] = param1[incrementValue$5];
                      break L4;
                    }
                  }
                  L5: {
                    param6++;
                    if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                      param3++;
                      param2++;
                      break L5;
                    } else {
                      incrementValue$6 = param3;
                      param3++;
                      incrementValue$7 = param2;
                      param2++;
                      param0[incrementValue$6] = param1[incrementValue$7];
                      break L5;
                    }
                  }
                  param6++;
                  if ((param4 & 1 << (param5 | param6 & 3)) == 0) {
                    param3++;
                    param2++;
                    param6++;
                    continue L1;
                  } else {
                    incrementValue$8 = param3;
                    param3++;
                    incrementValue$9 = param2;
                    param2++;
                    param0[incrementValue$8] = param1[incrementValue$9];
                    param6++;
                    continue L1;
                  }
                }
              }
            } else {
              param3 = param3 + (param9 + param7);
              param2 = param2 + (param10 + param7);
              var11++;
              continue L0;
            }
          }
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int var13;
        int var14;
        int var15;
        var13 = -(param9 >> 2);
        param9 = -(param9 & 3);
        var14 = -param10;
        L0: while (true) {
          if (var14 >= 0) {
            return;
          } else {
            param7 = param7 + 4 & 12;
            if ((param6 >> param7 & 15) != 0) {
              var15 = var13;
              L1: while (true) {
                if (var15 >= 0) {
                  var15 = param9;
                  L2: while (true) {
                    if (var15 >= 0) {
                      param5 = param5 + param11;
                      param4 = param4 + param12;
                      param8 = param8 + (param9 + (var13 << 2));
                      var14++;
                      continue L0;
                    } else {
                      if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                        param5++;
                        param4++;
                        param8++;
                        var15++;
                        continue L2;
                      } else {
                        incrementValue$0 = param5;
                        param5++;
                        incrementValue$1 = param4;
                        param4++;
                        param0[incrementValue$0] = param2[param1[incrementValue$1] & 255];
                        param8++;
                        var15++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L3: {
                    if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                      param5++;
                      param4++;
                      break L3;
                    } else {
                      incrementValue$2 = param5;
                      param5++;
                      incrementValue$3 = param4;
                      param4++;
                      param0[incrementValue$2] = param2[param1[incrementValue$3] & 255];
                      break L3;
                    }
                  }
                  L4: {
                    param8++;
                    if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                      param5++;
                      param4++;
                      break L4;
                    } else {
                      incrementValue$4 = param5;
                      param5++;
                      incrementValue$5 = param4;
                      param4++;
                      param0[incrementValue$4] = param2[param1[incrementValue$5] & 255];
                      break L4;
                    }
                  }
                  L5: {
                    param8++;
                    if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                      param5++;
                      param4++;
                      break L5;
                    } else {
                      incrementValue$6 = param5;
                      param5++;
                      incrementValue$7 = param4;
                      param4++;
                      param0[incrementValue$6] = param2[param1[incrementValue$7] & 255];
                      break L5;
                    }
                  }
                  param8++;
                  if ((param6 & 1 << (param7 | param8 & 3)) == 0) {
                    param5++;
                    param4++;
                    param8++;
                    var15++;
                    continue L1;
                  } else {
                    incrementValue$8 = param5;
                    param5++;
                    incrementValue$9 = param4;
                    param4++;
                    param0[incrementValue$8] = param2[param1[incrementValue$9] & 255];
                    param8++;
                    var15++;
                    continue L1;
                  }
                }
              }
            } else {
              param5 = param5 + (param11 - param9 - (var13 << 2));
              param4 = param4 + (param12 - param9 - (var13 << 2));
              var14++;
              continue L0;
            }
          }
        }
    }

    static {
        field_a = new int[]{0, 32800, 41120, 41380, 42405, 46565, 62965, 65015};
    }
}
