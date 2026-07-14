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
                    try {
                      ch.field_c.a(he.field_e.field_g, 0, (byte) 122, he.field_e.field_j);
                      fo.field_d = qj.b(-26572);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    var2 = (IOException) (Object) decompiledCaughtException;
                    ka.b(false);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                he.field_e.field_g = 0;
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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == -3) {
            break L0;
          } else {
            boolean discarded$1 = we.a((byte) -29);
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (!ib.b(false)) {
            L2: {
              wl.field_S.a(ao.a(param0 + 31131, an.field_g, me.field_I), ao.a(param0 ^ -31131, pb.field_h, ja.field_s), -97);
              if (wl.field_S.b(true)) {
                var1 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            var2 = 0;
            if (var1 != 0) {
              if (0 <= wl.field_S.field_h) {
                L3: {
                  var2 = cf.field_c[wl.field_S.field_h];
                  if (-3 == var2) {
                    vk.c(false);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var2;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          } else {
            wl.field_S.a((byte) -76);
            if (wl.field_S.b(true)) {
              var1 = 1;
              continue L1;
            } else {
              continue L1;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -80) {
          if (null == pm.field_b) {
            if (oj.field_i) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          we.c(84);
          if (null != pm.field_b) {
            return true;
          } else {
            L0: {
              if (!oj.field_i) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, wk param3, int param4, java.math.BigInteger param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = ArcanistsMulti.field_G ? 1 : 0;
          var7 = gd.a(param1 ^ 29389, param6);
          if (null == c.field_b) {
            c.field_b = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            L2: {
              L3: {
                if (ue.field_c == null) {
                  break L3;
                } else {
                  if (var7 > ue.field_c.field_j.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              ue.field_c = new wk(var7);
              break L2;
            }
            L4: {
              L5: {
                ue.field_c.field_g = 0;
                ue.field_c.a(param2, param4, (byte) -86, param6);
                ue.field_c.e(var7, (byte) 83);
                ue.field_c.a(param1 ^ 127, var15);
                if (ji.field_b == null) {
                  break L5;
                } else {
                  if (-101 >= (ji.field_b.field_j.length ^ -1)) {
                    ji.field_b.field_g = 0;
                    ji.field_b.f(10, (byte) -33);
                    var11 = 0;
                    var9 = var11;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              ji.field_b = new wk(100);
              ji.field_b.field_g = 0;
              ji.field_b.f(10, (byte) -33);
              var11 = 0;
              var9 = var11;
              break L4;
            }
            L6: while (true) {
              if (4 <= var11) {
                ji.field_b.c(param6, (byte) -60);
                ji.field_b.a(param0, (byte) 95, param5);
                param3.a(ji.field_b.field_j, 0, (byte) -86, ji.field_b.field_g);
                param3.a(ue.field_c.field_j, param1, (byte) -86, ue.field_c.field_g);
                return;
              } else {
                ji.field_b.a(var15[var11], (byte) -101);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = c.field_b.nextInt();
            var9++;
            continue L1;
          }
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
