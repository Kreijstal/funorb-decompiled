/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static sj field_g;
    static String[] field_a;
    static String field_f;
    static dl field_b;
    static int[] field_c;
    static int field_d;
    static ai field_e;

    final static boolean a(int param0) {
        if (param0 != 100) {
            return false;
        }
        if (null == ne.field_f) {
            return false;
        }
        if (!ne.field_f.b(true)) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_c = null;
        field_g = null;
        field_a = null;
        if (param0 >= -70) {
            jl.a(110);
        }
    }

    final static void a(int param0, ng param1, byte[] param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, int param6) {
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
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var7_int = eb.a((byte) -113, param4);
              if (null == sl.field_s) {
                sl.field_s = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[param6];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (null == ek.field_e) {
                      break L4;
                    } else {
                      if (ek.field_e.field_h.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ek.field_e = new ng(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    ek.field_e.field_f = 0;
                    ek.field_e.a(param0, param4, 97, param2);
                    ek.field_e.b((byte) 105, var7_int);
                    ek.field_e.a(-268435456, var13);
                    if (ek.field_g == null) {
                      break L6;
                    } else {
                      if (ek.field_g.field_h.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ek.field_g = new ng(100);
                  break L5;
                }
                ek.field_g.field_f = 0;
                ek.field_g.a(true, 10);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (-5 >= (var11 ^ -1)) {
                    ek.field_g.c(-161478600, param4);
                    ek.field_g.a(param5, param6 + -4, param3);
                    param1.a(0, ek.field_g.field_f, 90, ek.field_g.field_h);
                    param1.a(0, ek.field_e.field_f, 112, ek.field_e.field_h);
                    break L0;
                  } else {
                    ek.field_g.a(var13[var11], -16384);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = sl.field_s.nextInt();
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

            stackIn_22_1 = new StringBuilder().append("jl.C(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_23_0), stackIn_32_2 + ',' + param6 + ')');
        }
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (fp.field_e == null) {
                break L0;
              } else {
                try {
                  L1: {
                    fp.field_e.a(0L, -1);
                    fp.field_e.a(126, kd.field_n.field_h, kd.field_n.field_f, 24);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  L3: {
                    kd.field_n.field_f = kd.field_n.field_f + 24;
                    if (param0 > 26) {
                      break L3;
                    } else {
                      field_b = (dl) null;
                      break L3;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
            kd.field_n.field_f = kd.field_n.field_f + 24;
            if (param0 <= 26) {
              field_b = (dl) null;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_g = new sj(6, 0, 4, 2);
        field_f = "Waiting for music";
        field_c = new int[]{5, 70, 12, 5, 25};
    }
}
