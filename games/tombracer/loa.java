/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class loa {
    qea field_a;

    final void a(int param0, byte param1, hj param2, int param3, int param4, int param5) {
        try {
            param2.a((param4 + param0) / 2, 0, 0, (param5 + param3) / 2);
            param2.a(param0, 0, 0, param3);
            param2.a(param4, 0, param1 + 42, param5);
            if (param1 != -42) {
                this.field_a = (qea) null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "loa.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
              if ((param0 ^ -1) == -2) {
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
                  if (caa.field_i == param3) {
                    if (param2 != 108) {
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ce.field_B = true;
                    caa.field_i = param3;
                    wga.a(true, param1);
                    if (param2 != 108) {
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param2 != 108) {
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 == 2) {
                  if (caa.field_i != param3) {
                    ce.field_B = true;
                    caa.field_i = param3;
                    wga.a(true, param1);
                    if (param2 != 108) {
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param2 != 108) {
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param2 != 108) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
        L2: {
          if ((param0 ^ -1) != -2) {
            break L2;
          } else {
            if (param3 != nba.field_b) {
              ce.field_B = true;
              nba.field_b = param3;
              wga.a(true, param1);
              break L2;
            } else {
              if (param0 == 2) {
                if (caa.field_i != param3) {
                  ce.field_B = true;
                  caa.field_i = param3;
                  wga.a(true, param1);
                  if (param2 == 108) {
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param2 != 108) {
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param2 != 108) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param0 == 2) {
          if (caa.field_i != param3) {
            ce.field_B = true;
            caa.field_i = param3;
            wga.a(true, param1);
            if (param2 == 108) {
              return;
            } else {
              return;
            }
          } else {
            if (param2 == 108) {
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 == 108) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, float[] param1, float param2, int param3, int param4, int param5, float[] param6, float param7, int param8, int param9, int param10, int param11) {
        float var12_float = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var12 = null;
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
                if ((param0 ^ -1) != -3) {
                  if ((param0 ^ -1) != -4) {
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
            stackIn_13_0 = (RuntimeException) (var12);

            stackIn_13_1 = new StringBuilder().append("loa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = new int[param0];
        var3 = var8;
        var8[0] = 0;
        if (param1 != -2352) {
          this.field_a = (qea) null;
          var4 = 1;
          L0: while (true) {
            if (param0 <= var4) {
              return var3;
            } else {
              var5 = this.field_a.a(var4 + 1, param1 + 2352);
              var6 = var4;
              L1: while (true) {
                if (var5 >= var6) {
                  var3[var5] = var4;
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
              var5 = this.field_a.a(var4 + 1, param1 + 2352);
              var6 = var4;
              L3: while (true) {
                if (var5 >= var6) {
                  var3[var5] = var4;
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
        ck.field_c = (byte[][]) null;
        pg.field_C = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        ss.field_c = param0;
        hc.field_h = param4;
        if (param1) {
            return;
        }
        gca.field_d = param2;
        pka.field_b = param3;
    }

    loa(qea param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "loa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final hj a(int param0, int param1, int param2, int param3, int param4) {
        param0 = -1 + 2 * ((param0 - -1) / 2);
        param2 = (param2 + 1) / 2 * 2 - 1;
        hj var6 = new hj(param2, param0, 1);
        int var7 = 108 % ((-62 - param3) / 34);
        param4 = -1 + (1 + param4) / 2 * 2;
        param1 = -1 + (1 + param1) / 2 * 2;
        this.a(param4, 86, var6, param1);
        return var6;
    }

    static {
    }
}
