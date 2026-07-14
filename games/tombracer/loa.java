/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class loa {
    qea field_a;

    final void a(int param0, byte param1, hj param2, int param3, int param4, int param5) {
        param2.a((param4 + param0) / 2, 0, 0, (param5 + param3) / 2);
        param2.a(param0, 0, 0, param3);
        param2.a(param4, 0, param1 + 42, param5);
        if (param1 != -42) {
            ((loa) this).field_a = null;
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
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          param10 = param10 - param11;
          param4 = param4 - param8;
          param3 = param3 - param9;
          var12 = (float)param4 * param6[1] + (float)param10 * param6[0] + param6[2] * (float)param3;
          var13 = (float)param4 * param6[4] + param6[3] * (float)param10 + param6[5] * (float)param3;
          var14 = param6[6] * (float)param10 + param6[7] * (float)param4 + (float)param3 * param6[8];
          var16 = 113 / ((param5 - -19) / 48);
          var15 = (float)Math.atan2((double)var12, (double)var14) / 6.2831854820251465f + 0.5f;
          if (1.0f == param2) {
            break L0;
          } else {
            var15 = var15 * param2;
            break L0;
          }
        }
        var17 = var13 + 0.5f + param7;
        if (param0 != 1) {
          if ((param0 ^ -1) != -3) {
            if ((param0 ^ -1) == -4) {
              var18 = var15;
              var15 = var17;
              var17 = -var18;
              param1[0] = var15;
              param1[1] = var17;
              return;
            } else {
              param1[0] = var15;
              param1[1] = var17;
              return;
            }
          } else {
            var17 = -var17;
            var15 = -var15;
            param1[0] = var15;
            param1[1] = var17;
            return;
          }
        } else {
          var18 = var15;
          var15 = -var17;
          var17 = var18;
          param1[0] = var15;
          param1[1] = var17;
          return;
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
        if (param1) {
            return;
        }
        gca.field_d = param2;
        pka.field_b = param3;
    }

    loa(qea param0) {
        ((loa) this).field_a = param0;
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
