/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends gg {
    static int field_i;
    int[] field_h;
    static String field_j;
    int field_k;

    public static void a(int param0) {
        field_j = null;
        if (param0 != -13) {
            field_j = (String) null;
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        hd var9 = null;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            ab.field_s[param5] = param1;
            var8 = 116 / ((-78 - param3) / 48);
            var7_int = 0;
            var9 = ad.field_b;
            var10_ref_int__ = param1;
            var11 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var10_ref_int__.length <= var11) {
                    break L3;
                  } else {
                    stackOut_3_0 = var10_ref_int__[var11];
                    stackIn_18_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      L4: {
                        var12 = stackIn_4_0;
                        var13 = te.field_I[var12];
                        if (var13 != null) {
                          break L4;
                        } else {
                          var13 = "ERROR: missing text";
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          L7: {
                            if (-13 == (var12 ^ -1)) {
                              break L7;
                            } else {
                              if (var12 != 13) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var14 = 9 + (wb.field_a + 64);
                            if (var7_int < var14) {
                              var7_int = var14;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          if (var15 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        var14 = var9.b(var13);
                        if (var14 > var7_int) {
                          var7_int = var14;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11++;
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_17_0 = var7_int + 20 >> 1654837889;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              L9: {
                var10 = stackIn_18_0;
                jb.field_a[param5] = 320 - var10;
                bb.field_P[param5] = 320 + var10;
                ah.field_i[param5] = param4;
                si.field_F[param5] = param0;
                if (param5 != 2) {
                  break L9;
                } else {
                  L10: {
                    if (!il.b(507)) {
                      break L10;
                    } else {
                      ah.field_i[param5] = 399;
                      if (var15 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  jb.field_a[param5] = 30;
                  bb.field_P[param5] = bb.field_P[param5] + 580;
                  ah.field_i[param5] = 399;
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var7);
            stackOut_24_1 = new StringBuilder().append("fj.C(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        if (k.field_b) {
          L0: {
            if (null != ah.field_e) {
              ah.field_e.f(true);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = s.o(-74);
          if (param0 < 26) {
            return;
          } else {
            ve.field_a = new bb(var1, (String) null, true, false, false);
            u.field_b.b(gf.field_cb, 125);
            gf.field_cb.c(-3399, ve.field_a);
            gf.field_cb.e(true);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        field_j = "Asteroids Approaching <%0><br>Level <%1><br>Get Ready!";
    }
}
