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
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
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
                    field_d = (String) null;
                    break L2;
                  }
                }
                L3: {
                  if (he.field_e.field_g > 0) {
                    try {
                      L4: {
                        ch.field_c.a(he.field_e.field_g, 0, (byte) 122, he.field_e.field_j);
                        fo.field_d = qj.b(-26572);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2 = (IOException) (Object) decompiledCaughtException;
                        ka.b(false);
                        break L5;
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

    public static void c(int param0) {
        field_d = null;
        int var1 = -7 % ((param0 - -28) / 61);
        field_e = null;
        field_a = null;
    }

    final static int b(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                we.a((byte) -29);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (!ib.b(false)) {
                L3: {
                  wl.field_S.a(ao.a(param0 + 31131, an.field_g, me.field_I), ao.a(param0 ^ -31131, pb.field_h, ja.field_s), -97);
                  if (wl.field_S.b(true)) {
                    var1_int = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L4;
                  } else {
                    if (0 > wl.field_S.field_h) {
                      break L4;
                    } else {
                      var2 = cf.field_c[wl.field_S.field_h];
                      if (-3 == (var2 ^ -1)) {
                        vk.c(false);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_17_0 = var2;
                break L0;
              } else {
                wl.field_S.a((byte) -76);
                if (wl.field_S.b(true)) {
                  var1_int = 1;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "we.F(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final static boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == -80) {
          if (null == pm.field_b) {
            if (oj.field_i) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          we.c(84);
          if (null != pm.field_b) {
            return true;
          } else {
            L0: {
              if (!oj.field_i) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, wk param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = gd.a(param1 ^ 29389, param6);
              if (null == c.field_b) {
                c.field_b = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
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
                    ue.field_c.a(param2, param4, (byte) -86, param6);
                    ue.field_c.e(var7_int, (byte) 83);
                    ue.field_c.a(param1 ^ 127, var13);
                    if (ji.field_b == null) {
                      break L6;
                    } else {
                      if (-101 >= (ji.field_b.field_j.length ^ -1)) {
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
                    param3.a(ue.field_c.field_j, param1, (byte) -86, ue.field_c.field_g);
                    break L0;
                  } else {
                    ji.field_b.a(var13[var11], (byte) -101);
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
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("we.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_32_2 + ',' + param6 + ')');
        }
    }

    private we() throws Throwable {
        throw new Error();
    }

    final long a(int param0) {
        if (param0 != 0) {
            field_a = (String) null;
            return qj.b(-26572);
        }
        return qj.b(-26572);
    }

    static {
        field_e = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_b = 0;
        field_d = "to return to the normal view.";
        field_a = "Down below you will see your spellbook. Currently, it only contains the Fire Ball spell, but, as you complete your training, your selection of spells will increase. Click on the Fire Ball spell to continue.";
    }
}
