/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ifa extends ci {
    private int field_o;
    private static long[] field_p;
    private int field_m;
    private int field_t;
    static String field_r;
    static ht field_n;
    static jpa field_q;
    static String field_s;

    final void b(byte param0) {
        if (param0 != 116) {
            return;
        }
        tka.b((byte) 122);
    }

    public ifa() {
        super(0, true);
        this.field_m = 0;
        this.field_o = 0;
        this.field_t = 1;
    }

    final static void a(int param0, int param1, int param2, int param3, float[] param4, float param5, int param6, int param7, float[] param8, byte param9, int param10) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var11_float = 0.0f;
        RuntimeException var11 = null;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param10 = param10 - param2;
            param1 = param1 - param7;
            param0 = param0 - param3;
            if (param9 == -44) {
              L1: {
                L2: {
                  var11_float = (float)param0 * param8[2] + ((float)param10 * param8[1] + (float)param1 * param8[0]);
                  var12 = param8[4] * (float)param10 + param8[3] * (float)param1 + (float)param0 * param8[5];
                  var13 = (float)param1 * param8[6] + (float)param10 * param8[7] + param8[8] * (float)param0;
                  var14 = (float)Math.sqrt((double)(var13 * var13 + (var12 * var12 + var11_float * var11_float)));
                  var15 = 0.5f + (float)Math.atan2((double)var11_float, (double)var13) / 6.2831854820251465f;
                  var16 = param5 + (0.5f + (float)Math.asin((double)(var12 / var14)) / 3.1415927410125732f);
                  if (param6 != 1) {
                    if (2 == param6) {
                      var16 = -var16;
                      var15 = -var15;
                      break L2;
                    } else {
                      if ((param6 ^ -1) == -4) {
                        var17 = var15;
                        var15 = var16;
                        var16 = -var17;
                        break L2;
                      } else {
                        param4[1] = var16;
                        param4[0] = var15;
                        break L1;
                      }
                    }
                  } else {
                    var17 = var15;
                    var15 = -var16;
                    var16 = var17;
                    break L2;
                  }
                }
                param4[1] = var16;
                param4[0] = var15;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var11 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var11);

            stackIn_14_1 = new StringBuilder().append("ifa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void d(byte param0) {
        field_n = null;
        int var1 = 25 % ((param0 - -28) / 51);
        field_r = null;
        field_p = null;
        field_s = null;
        field_q = null;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                var4_int = param2;
                if (var4_int == 0) {
                  this.field_o = param1.h(255);
                  break L1;
                } else {
                  if (var4_int != 1) {
                    if (3 == var4_int) {
                      this.field_t = param1.h(255);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_m = param1.h(255);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ifa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        float[] var12;
        int[] var13;
        int[] var14;
        int[] var15;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var15 = this.field_i.a((byte) -114, param1);
          var14 = var15;
          var13 = var14;
          var3 = var13;
          if (param0 == 1) {
            break L0;
          } else {
            var12 = (float[]) null;
            ifa.a(30, 114, 96, 47, (float[]) null, 0.4474947452545166f, -17, -103, (float[]) null, (byte) 32, -65);
            break L0;
          }
        }
        L1: {
          if (this.field_i.field_d) {
            var4 = sj.field_b[param1];
            var5 = var4 - 2048 >> 2030681601;
            var6 = 0;
            L2: while (true) {
              if (var6 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  var8 = ht.field_Fb[var6];
                  var9 = var8 - 2048 >> -1320237439;
                  if (0 != this.field_o) {
                    var10 = var5 * var5 + var9 * var9 >> 1190924620;
                    var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0f)) * 4096.0);
                    var7 = (int)((double)(var7 * this.field_t) * 3.141592653589793);
                    break L3;
                  } else {
                    var7 = (-var4 + var8) * this.field_t;
                    break L3;
                  }
                }
                L4: {
                  var7 = var7 - (var7 & -4096);
                  if (-1 != (this.field_m ^ -1)) {
                    if (this.field_m == 2) {
                      L5: {
                        var15 = var14;
                        var7 -= 2048;
                        if (-1 >= (var7 ^ -1)) {
                          break L5;
                        } else {
                          var7 = -var7;
                          break L5;
                        }
                      }
                      var15 = var14;
                      var7 = 2048 - var7 << -1751985759;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var7 = 4096 + ou.field_e[(var7 & 4088) >> 132274564] >> 216772257;
                    break L4;
                  }
                }
                var15 = var14;
                var15[var6] = var7;
                var6++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var13;
    }

    final static void a(String[] args, int param1, String param2, byte param3) {
        int var5 = 0;
        String[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              wt.field_d = mua.field_a;
              if (255 != param1) {
                L2: {
                  if ((param1 ^ -1) > -101) {
                    break L2;
                  } else {
                    if (param1 <= 105) {
                      var4 = args;
                      ow.a((byte) -109, var4);
                      oo.field_t = pla.a(90, args);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                oo.field_t = doa.a(param2, param1, (byte) 114);
                break L1;
              } else {
                L3: {
                  stackIn_4_0 = 97;

                  if (-14 >= (wua.field_n ^ -1)) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = 0;
                    break L3;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = 1;
                    break L3;
                  }
                }
                oo.field_t = es.a((byte) stackIn_5_0, stackIn_5_1 != 0);
                var6 = (String[]) null;
                ow.a((byte) -101, (String[]) null);
                break L1;
              }
            }
            var4_int = -13 % ((param3 - -59) / 56);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("ifa.E(");

            if (args == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final static void d(int param0, int param1) {
        k.field_A = param0 >> 1126681028 & param1;
        if ((k.field_A ^ -1) < -3) {
            k.field_A = 2;
        }
        nba.field_b = 3 & param0 >> 42192226;
        if (2 < nba.field_b) {
            nba.field_b = 2;
        }
        caa.field_i = 3 & param0;
        if ((caa.field_i ^ -1) < -3) {
            caa.field_i = 2;
        }
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_p = new long[256];
            var2 = 0;
            L0: while (true) {
              if (-257 >= (var2 ^ -1)) {
                field_r = "You must play <%1> more rated games before playing with the current options.";
                field_s = "No";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= 8) {
                    field_p[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (-2L == (1L & var0 ^ -1L)) {
                      var0 = -3932672073523589310L ^ var0 >>> 1912067585;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
