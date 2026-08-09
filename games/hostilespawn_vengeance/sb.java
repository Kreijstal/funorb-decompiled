/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static double field_a;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        bd var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var1 = nj.field_c;
            synchronized (var1) {
              L1: {
                L2: {
                  ae.field_s = ae.field_s + 1;
                  ee.field_e = nm.field_j;
                  if (-1 >= (uc.field_b ^ -1)) {
                    L3: while (true) {
                      if (uc.field_b == md.field_o) {
                        break L2;
                      } else {
                        var2 = al.field_W[md.field_o];
                        md.field_o = 127 & md.field_o - -1;
                        if (var2 < 0) {
                          qh.field_m[var2 ^ -1] = false;
                          continue L3;
                        } else {
                          qh.field_m[var2] = true;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -113) {
                        uc.field_b = md.field_o;
                        break L2;
                      } else {
                        qh.field_m[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                nm.field_j = oa.field_a;
                break L1;
              }
            }
            L5: {
              if (param0 == -113) {
                break L5;
              } else {
                var5 = (bd) null;
                sb.a((bd) null, -98);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "sb.A(" + param0 + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9) {
        int var16 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        if (param9 == 3) {
          param3--;
          L0: while (true) {
            if (param3 < 0) {
              return;
            } else {
              try {
                L1: {
                  var17 = param0;
                  var10 = var17;
                  var11 = param2;
                  var12 = param1;
                  var13 = param4;
                  var14 = param8;
                  var15 = (var17[var11] & 16711422) >> 1000842241;
                  var10[var11] = var15 + ua.a(65280, var13 >> 353783049) + (ua.a(var12 >> 1714770401, 16711680) - -ua.a(255, var14 >> -747462351));
                  param8 = param8 + param5;
                  param1 = param1 + param6;
                  param2++;
                  param4 = param4 + param7;
                  break L1;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var10_ref = decompiledCaughtException;
                  stackIn_10_0 = (RuntimeException) (var10_ref);

                  stackIn_10_1 = new StringBuilder().append("sb.D(");

                  if (param0 == null) {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    break L2;
                  } else {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "{...}";
                    break L2;
                  }
                }
                throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
              }
              param3--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        nj var5 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var4 = (Object) null;
                sb.a(true, (Object) null, false);
                break L1;
              }
            }
            if (param1 != null) {
              if (!(param1 instanceof byte[])) {
                if (!(param1 instanceof nj)) {
                  throw new IllegalArgumentException();
                } else {
                  var5 = (nj) (param1);
                  stackIn_13_0 = var5.a((byte) -26);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var3 = (byte[]) (param1);
                if (!param2) {
                  stackIn_10_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = dc.a(97, var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("sb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void a(bd param0, int param1) {
        if (param1 > -109) {
            return;
        }
        try {
            pf.b(511);
            si.a(param0.field_D, param0.field_u, param0.field_r);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "sb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = 0.0;
    }
}
