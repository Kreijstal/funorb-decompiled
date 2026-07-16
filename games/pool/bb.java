/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb {
    int field_g;
    int field_f;
    int field_e;
    int field_b;
    int field_d;
    static vh field_c;
    int field_h;
    static String field_a;

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (param3 == -28361) {
          param7 = param7 - param1[2];
          param5 = param5 - param1[0];
          param8 = param8 - param1[2];
          param2 = param2 - param1[0];
          param0 = param0 - param1[1];
          param6 = param6 - param1[1];
          var9 = param7 * param1[11] + (param1[9] * param2 + param1[10] * param6) >> 1239012016;
          if (var9 <= 0) {
            return;
          } else {
            var10 = param1[10] * param0 + param5 * param1[9] + param1[11] * param8 >> 1606936624;
            if (-1 > (var10 ^ -1)) {
              var11 = param1[3] * param2 - (-(param6 * param1[4]) + -(param1[5] * param7)) >> 457666119;
              var12 = param7 * param1[8] + param6 * param1[7] + param1[6] * param2 >> -767190489;
              var13 = param0 * param1[4] + param1[3] * param5 - -(param8 * param1[5]) >> -595812473;
              var13 = qh.field_b - (-fb.field_q - var13 / var10);
              var12 = var12 / var9 + (qh.field_c + fb.field_d);
              var11 = var11 / var9 + qh.field_b + fb.field_q;
              var14 = param8 * param1[8] + param1[6] * param5 + param0 * param1[7] >> 1753129159;
              var14 = qh.field_c - (-fb.field_d + -(var14 / var10));
              qh.d(var11, var12, var13, var14, param4);
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = Pool.field_O;
        if (param4 <= param2) {
          return;
        } else {
          if (param1 <= param2 + 1) {
            return;
          } else {
            L0: {
              if (param2 + 5 >= param1) {
                break L0;
              } else {
                if (param3 != param0) {
                  var7 = (param3 & param0 & 1) + ((param0 >> 1909151201) - -(param3 >> 1079278113));
                  var8 = param2;
                  var9 = param3;
                  var10 = param0;
                  if (param5 <= -34) {
                    var11 = param2;
                    L1: while (true) {
                      if (var11 >= param1) {
                        bb.a(var9, var8, param2, param3, param4, (byte) -95, param6);
                        bb.a(param0, param1, var8, var10, param4, (byte) -99, param6);
                        return;
                      } else {
                        L2: {
                          var12 = ep.field_H[var11];
                          if (param6) {
                            stackOut_24_0 = kb.field_g[var12];
                            stackIn_25_0 = stackOut_24_0;
                            break L2;
                          } else {
                            stackOut_23_0 = ah.field_c[var12];
                            stackIn_25_0 = stackOut_23_0;
                            break L2;
                          }
                        }
                        var13 = stackIn_25_0;
                        if (var13 <= var7) {
                          if (var13 > var10) {
                            var10 = var13;
                            var11++;
                            continue L1;
                          } else {
                            var11++;
                            continue L1;
                          }
                        } else {
                          ep.field_H[var11] = ep.field_H[var8];
                          int incrementValue$1 = var8;
                          var8++;
                          ep.field_H[incrementValue$1] = var12;
                          if (var9 > var13) {
                            var9 = var13;
                            var11++;
                            continue L1;
                          } else {
                            var11++;
                            continue L1;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = param1 - 1;
            L3: while (true) {
              if (var7 <= param2) {
                return;
              } else {
                var8 = param2;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = ep.field_H[var8];
                    var10 = ep.field_H[var8 - -1];
                    if (he.a(var9, param6, var10, 0)) {
                      ep.field_H[var8] = var10;
                      ep.field_H[var8 + 1] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static double a(byte param0, int param1, long param2) {
        int var4 = -8 % ((param0 - -43) / 55);
        return (double)param2 / (double)(1 << param1);
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void a(byte param0) {
        if (param0 >= -43) {
            bb.a((byte) 122);
        }
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 != 99) {
        }
        return (qh.field_b - -fb.field_q << -985335230) + (param1 << 776491) / param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Year";
    }
}
