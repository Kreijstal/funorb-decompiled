/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class loa {
    qea field_a;

    final void a(int param0, byte param1, hj param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param2.a((param4 + param0) / 2, 0, 0, (param5 + param3) / 2);
              param2.a(param0, 0, 0, param3);
              param2.a(param4, 0, param1 + 42, param5);
              if (param1 == -42) {
                break L1;
              } else {
                ((loa) this).field_a = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("loa.G(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        L0: {
          if (param0 != 0) {
            break L0;
          } else {
            if (k.field_A != param3) {
              k.field_A = param3;
              ce.field_B = true;
              wga.a(true, param1);
              break L0;
            } else {
              if (param0 == 1) {
                L1: {
                  if (param3 != nba.field_b) {
                    ce.field_B = true;
                    nba.field_b = param3;
                    wga.a(true, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param0 == 2) {
                  if (caa.field_i != param3) {
                    ce.field_B = true;
                    caa.field_i = param3;
                    wga.a(true, param1);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (param0 == 2) {
                  if (caa.field_i == param3) {
                    return;
                  } else {
                    ce.field_B = true;
                    caa.field_i = param3;
                    wga.a(true, param1);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        L2: {
          if (param0 != 1) {
            break L2;
          } else {
            if (param3 != nba.field_b) {
              ce.field_B = true;
              nba.field_b = param3;
              wga.a(true, param1);
              break L2;
            } else {
              if (param0 == 2) {
                if (caa.field_i == param3) {
                  return;
                } else {
                  ce.field_B = true;
                  caa.field_i = param3;
                  wga.a(true, param1);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (param0 == 2) {
          if (caa.field_i == param3) {
            return;
          } else {
            ce.field_B = true;
            caa.field_i = param3;
            wga.a(true, param1);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, float[] param1, float param2, int param3, int param4, int param5, float[] param6, float param7, int param8, int param9, int param10, int param11) {
        RuntimeException var12 = null;
        float var12_float = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param10 = param10 - param11;
              param4 = param4 - param8;
              param3 = param3 - param9;
              var12_float = (float)param4 * param6[1] + (float)param10 * param6[0] + param6[2] * (float)param3;
              var13 = (float)param4 * param6[4] + param6[3] * (float)param10 + param6[5] * (float)param3;
              var14 = param6[6] * (float)param10 + param6[7] * (float)param4 + (float)param3 * param6[8];
              var16 = 113 / ((param5 - -19) / 48);
              var15 = (float)Math.atan2((double)var12_float, (double)var14) / 6.2831854820251465f + 0.5f;
              if (1.0f == param2) {
                break L1;
              } else {
                var15 = var15 * param2;
                break L1;
              }
            }
            L2: {
              var17 = var13 + 0.5f + param7;
              if (param0 == 1) {
                var18 = var15;
                var15 = -var17;
                var17 = var18;
                break L2;
              } else {
                if (param0 != 2) {
                  if (param0 != 3) {
                    break L2;
                  } else {
                    var18 = var15;
                    var15 = var17;
                    var17 = -var18;
                    break L2;
                  }
                } else {
                  var17 = -var17;
                  var15 = -var15;
                  break L2;
                }
              }
            }
            param1[0] = var15;
            param1[1] = var17;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var12 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var12;
            stackOut_11_1 = new StringBuilder().append("loa.E(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param6 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 41);
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var11 = new int[param0];
        var9 = var11;
        var8 = var9;
        var12 = var8;
        var10 = var12;
        var3 = var10;
        var11[0] = 0;
        if (param1 != -2352) {
          ((loa) this).field_a = null;
          var4 = 1;
          L0: while (true) {
            if (param0 <= var4) {
              return var3;
            } else {
              var5 = ((loa) this).field_a.a(var4 + 1, param1 + 2352);
              var6 = var4;
              L1: while (true) {
                if (var5 >= var6) {
                  var12[var5] = var4;
                  var4++;
                  continue L0;
                } else {
                  var3[var6] = var3[var6 - 1];
                  var6--;
                  continue L1;
                }
              }
            }
          }
        } else {
          var4 = 1;
          L2: while (true) {
            if (param0 <= var4) {
              return var3;
            } else {
              var5 = ((loa) this).field_a.a(var4 + 1, param1 + 2352);
              var6 = var4;
              L3: while (true) {
                if (var5 >= var6) {
                  var12[var5] = var4;
                  var4++;
                  continue L2;
                } else {
                  var3[var6] = var3[var6 - 1];
                  var6--;
                  continue L3;
                }
              }
            }
          }
        }
    }

    abstract void a(int param0, int param1, hj param2, int param3);

    final static void a(byte param0) {
        mga.field_g = null;
        mq.field_b = null;
        ak.field_p = null;
        iga.field_m = null;
        int var1 = 85 % ((57 - param0) / 49);
        ck.field_c = null;
        pg.field_C = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        ss.field_c = param0;
        hc.field_h = param4;
        gca.field_d = 0;
        pka.field_b = 0;
    }

    loa(qea param0) {
        try {
            ((loa) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "loa.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final hj a(int param0, int param1, int param2, int param3, int param4) {
        param0 = -1 + 2 * ((param0 - -1) / 2);
        param2 = (param2 + 1) / 2 * 2 - 1;
        hj var6 = new hj(param2, param0, 1);
        int var7 = 108 % ((-62 - param3) / 34);
        param4 = -1 + (1 + param4) / 2 * 2;
        param1 = -1 + (1 + param1) / 2 * 2;
        ((loa) this).a(param4, 86, var6, param1);
        return var6;
    }

    static {
    }
}
