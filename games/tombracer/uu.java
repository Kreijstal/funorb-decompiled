/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu implements bo {
    static ht field_a;
    static int field_c;
    private int field_b;

    final static boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
          field_c = 33;
          return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
        } else {
          return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
        }
    }

    final static void a(int param0, byte param1, byte[] param2, java.math.BigInteger param3, uia param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = mt.a(param0, 0);
              if (pb.field_n != null) {
                break L1;
              } else {
                pb.field_n = new java.security.SecureRandom();
                break L1;
              }
            }
            L2: {
              var13 = new int[4];
              var12 = var13;
              var8 = var12;
              if (param1 == -81) {
                break L2;
              } else {
                uu.a(25);
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L4: {
                  L5: {
                    if (null == hf.field_d) {
                      break L5;
                    } else {
                      if (hf.field_d.field_g.length >= var7_int) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  hf.field_d = new uia(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    hf.field_d.field_h = 0;
                    hf.field_d.a(param6, param2, param0, 61);
                    hf.field_d.b(716148936, var7_int);
                    hf.field_d.a((byte) -48, var13);
                    if (ola.field_Bb == null) {
                      break L7;
                    } else {
                      if (100 <= ola.field_Bb.field_g.length) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ola.field_Bb = new uia(100);
                  break L6;
                }
                ola.field_Bb.field_h = 0;
                ola.field_Bb.i(10, param1 + 81);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (-5 >= (var11 ^ -1)) {
                    ola.field_Bb.f(-1477662136, param0);
                    ola.field_Bb.a(102, param3, param5);
                    param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                    param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                    break L0;
                  } else {
                    ola.field_Bb.a(var13[var11], (byte) 78);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = pb.field_n.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("uu.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param5 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ',' + param6 + ')');
        }
    }

    public final void a(kh param0, byte param1) {
        try {
            param0.h((byte) 122);
            if (param1 != -19) {
                this.field_b = 121;
            }
            this.field_b = param0.b((byte) 44, 2);
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uu.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 <= 2) {
            return;
        }
        this.field_b = param1;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 >= -56) {
            return false;
        }
        return pca.b(param1, 113, param0) & ag.b(-1, param0, param1);
    }

    final static void b(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            if (param0 == 12475) {
              try {
                L0: {
                  lb.a(-96, "resizing", di.a(111), new Object[]{new Integer(param1)});
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = decompiledCaughtException;
                  break L1;
                }
              }
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

    public final void a(int param0, kh param1) {
        try {
            if (param0 != 200) {
                kh var4 = (kh) null;
                this.a((kh) null, (byte) 46);
            }
            param1.i(8);
            param1.a((byte) -125, this.field_b, 2);
            param1.k(param0 ^ -1826190742);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "uu.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2507) {
                break L1;
              } else {
                field_c = -64;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (c.field_g.length <= var5_int) {
                break L0;
              } else {
                param3 = c.field_g[var5_int];
                var6 = var5_int << -1185002268;
                L3: while (true) {
                  incrementValue$5 = param3;
                  param3--;
                  if (incrementValue$5 == 0) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param0 = aia.field_t[incrementValue$6];
                    dupTemp$7 = param2[param0];
                    dupTemp$8 = param4[dupTemp$7];
                    param4[dupTemp$7] = dupTemp$8 + 1;
                    aia.field_t[dupTemp$8] = param0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("uu.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    static {
    }
}
