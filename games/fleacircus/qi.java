/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static fh field_b;
    static String field_d;
    static String field_e;
    static dd field_c;
    static int field_f;
    static String field_a;

    final static void a(java.math.BigInteger param0, int param1, int param2, byte[] param3, ni param4, java.math.BigInteger param5, byte param6) {
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
          var10 = fleas.field_A ? 1 : 0;
          var7 = pf.a(param6 ^ 104, param1);
          if (null == vk.field_N) {
            vk.field_N = new java.security.SecureRandom();
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
        if (param6 == -60) {
          var9 = 0;
          L1: while (true) {
            if ((var9 ^ -1) <= -5) {
              L2: {
                L3: {
                  if (null == ri.field_x) {
                    break L3;
                  } else {
                    if (var7 <= ri.field_x.field_k.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ri.field_x = new ni(var7);
                break L2;
              }
              L4: {
                L5: {
                  ri.field_x.field_i = 0;
                  ri.field_x.a(param3, param1, param2, 0);
                  ri.field_x.d(var7, 0);
                  ri.field_x.a(0, var15);
                  if (fleas.field_B == null) {
                    break L5;
                  } else {
                    if (100 > fleas.field_B.field_k.length) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                fleas.field_B = new ni(100);
                break L4;
              }
              fleas.field_B.field_i = 0;
              fleas.field_B.a(param6 + 49, 10);
              var11 = 0;
              var9 = var11;
              L6: while (true) {
                if ((var11 ^ -1) <= -5) {
                  fleas.field_B.b((byte) -49, param1);
                  fleas.field_B.a(param0, param5, 127);
                  param4.a(fleas.field_B.field_k, fleas.field_B.field_i, 0, 0);
                  param4.a(ri.field_x.field_k, ri.field_x.field_i, 0, param6 + 60);
                  return;
                } else {
                  fleas.field_B.a(var15[var11], (byte) -15);
                  var11++;
                  continue L6;
                }
              }
            } else {
              var8[var9] = vk.field_N.nextInt();
              var9++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -105) {
            return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        ni var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param1 == -22518) {
            break L0;
          } else {
            var9 = null;
            byte[] discarded$4 = qi.a((byte[]) null, -34);
            break L0;
          }
        }
        L1: {
          var10 = new ni(param0);
          var3 = var10.e(false);
          var4 = var10.c((byte) 123);
          if (0 > var4) {
            break L1;
          } else {
            L2: {
              if (0 == lj.field_b) {
                break L2;
              } else {
                if (var4 > lj.field_b) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (-1 == (var3 ^ -1)) {
              var18 = new byte[var4];
              var16 = var18;
              var14 = var16;
              var12 = var14;
              var5 = var12;
              var10.b(var18, 0, -126, var4);
              return var5;
            } else {
              L3: {
                var5_int = var10.c((byte) 126);
                if (0 > var5_int) {
                  break L3;
                } else {
                  L4: {
                    if (lj.field_b == 0) {
                      break L4;
                    } else {
                      if (lj.field_b >= var5_int) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    var17 = new byte[var5_int];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (var3 == 1) {
                      int discarded$5 = fe.a(var17, var5_int, param0, var4, 9);
                      break L5;
                    } else {
                      var7 = (Object) (Object) se.field_c;
                      synchronized (var7) {
                        L6: {
                          se.field_c.a((byte) -126, var17, var10);
                          break L6;
                        }
                      }
                      break L5;
                    }
                  }
                  return var6;
                }
              }
              throw new RuntimeException();
            }
          }
        }
        throw new RuntimeException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Service unavailable";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_b = new fh(8, 0, 4, 1);
    }
}
