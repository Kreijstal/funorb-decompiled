/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class we {
    static String field_e;
    String[] field_c;
    static int field_b;
    static String field_d;
    static String field_a;

    final static void a(int param0, byte param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == ch.field_c) {
                break L0;
              } else {
                L1: {
                  if (0 <= param0) {
                    if (qc.field_c != ob.field_eb) {
                      break L0;
                    } else {
                      if (he.field_e.field_g != 0) {
                        break L1;
                      } else {
                        if (qj.b(-26572) <= 10000L + fo.field_d) {
                          break L1;
                        } else {
                          he.field_e.b((byte) -50, param0);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (he.field_e.field_g != 0) {
                      break L1;
                    } else {
                      if (qj.b(-26572) <= 10000L + fo.field_d) {
                        break L1;
                      } else {
                        he.field_e.b((byte) -50, param0);
                        break L1;
                      }
                    }
                  }
                }
                L2: {
                  if (param1 >= 73) {
                    break L2;
                  } else {
                    field_d = null;
                    break L2;
                  }
                }
                L3: {
                  if (he.field_e.field_g > 0) {
                    {
                      L4: {
                        ch.field_c.a(he.field_e.field_g, 0, (byte) 122, he.field_e.field_j);
                        fo.field_d = qj.b(-26572);
                        break L4;
                      }
                    }
                    he.field_e.field_g = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            he.field_e.field_g = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c() {
        field_d = null;
        int var1 = -1;
        field_e = null;
        field_a = null;
    }

    final static int b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!ib.b(false)) {
                L2: {
                  wl.field_S.a(ao.a(31128, an.field_g, me.field_I), ao.a(31128, pb.field_h, ja.field_s), -97);
                  if (wl.field_S.b(true)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (0 > wl.field_S.field_h) {
                      break L3;
                    } else {
                      var2 = cf.field_c[wl.field_S.field_h];
                      if (var2 == 2) {
                        int discarded$1 = 0;
                        vk.c();
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_14_0 = var2;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                wl.field_S.a((byte) -76);
                if (wl.field_S.b(true)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "we.F(" + -3 + 41);
        }
        return stackIn_15_0;
    }

    final static boolean a() {
        return null != pm.field_b || oj.field_i;
    }

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, wk param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = gd.a(29389, param6);
              if (null == c.field_b) {
                c.field_b = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (ue.field_c == null) {
                      break L4;
                    } else {
                      if (var7_int > ue.field_c.field_j.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ue.field_c = new wk(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    ue.field_c.field_g = 0;
                    ue.field_c.a(param2, 0, (byte) -86, param6);
                    ue.field_c.e(var7_int, (byte) 83);
                    ue.field_c.a(127, var15);
                    if (ji.field_b == null) {
                      break L6;
                    } else {
                      if (ji.field_b.field_j.length >= 100) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ji.field_b = new wk(100);
                  break L5;
                }
                ji.field_b.field_g = 0;
                ji.field_b.f(10, (byte) -33);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (4 <= var11) {
                    ji.field_b.c(param6, (byte) -60);
                    ji.field_b.a(param0, (byte) 95, param5);
                    param3.a(ji.field_b.field_j, 0, (byte) -86, ji.field_b.field_g);
                    param3.a(ue.field_c.field_j, 0, (byte) -86, ue.field_c.field_g);
                    break L0;
                  } else {
                    ji.field_b.a(var15[var11], (byte) -101);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = c.field_b.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var7;
            stackOut_20_1 = new StringBuilder().append("we.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param5 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param6 + 41);
        }
    }

    private we() throws Throwable {
        throw new Error();
    }

    final long a(int param0) {
        if (param0 != 0) {
            field_a = null;
            return qj.b(-26572);
        }
        return qj.b(-26572);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_b = 0;
        field_d = "to return to the normal view.";
        field_a = "Down below you will see your spellbook. Currently, it only contains the Fire Ball spell, but, as you complete your training, your selection of spells will increase. Click on the Fire Ball spell to continue.";
    }
}
