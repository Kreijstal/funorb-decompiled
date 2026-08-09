/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_c;
    static ak field_f;
    static cd field_b;
    private int field_d;
    private int field_e;
    private int[][] field_a;

    final static qm a(int param0, int param1) {
        int var5 = client.field_A ? 1 : 0;
        int var3 = -128 / ((param0 - -53) / 58);
        qm[] var6 = vj.e(-23521);
        qm[] var2 = var6;
        int var4 = 0;
        do {
            if (var4 >= var6.length) {
                return null;
            }
            if (!(var6[var4].field_d != param1)) {
                return var6[var4];
            }
            var4++;
        } while (var5 == 0);
        return null;
    }

    final byte[] a(int param0, byte[] param1) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        byte[] stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == this.field_a) {
                            statePc = 27;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3_int = (int)((long)this.field_e * (long)param1.length / (long)this.field_d) + 14;
                        var15 = new int[var3_int];
                        var13 = var15;
                        var4 = var13;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var7 >= param1.length) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = param1[var7];
                        var17 = this.field_a[var6];
                        stackIn_13_0 = 0;
                        stackIn_5_0 = stackIn_13_0;
                        if (var11 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (14 <= var10) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var17[var10];
                        var10++;
                        if (var11 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = var6 + this.field_e;
                        var10 = var6 / this.field_d;
                        var5 = var5 + var10;
                        var6 = var6 - var10 * this.field_d;
                        var7++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param1 = new byte[var3_int];
                        stackIn_13_0 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = stackIn_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var7 >= var3_int) {
                            statePc = 27;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = var15[var7] - -32768 >> -1922369712;
                        var19 = -128;
                        var18 = var8;
                        if (var11 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var18 >= var19) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var18 == var19) {
                            statePc = 29;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param1[var7] = (byte)-128;
                        if (var11 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-128 > (var8 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param1[var7] = (byte)var8;
                        if (var11 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        param1[var7] = (byte)127;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7++;
                        if (var11 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (param0 == 14) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        field_f = (ak) null;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = (byte[]) (param1);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0;
                }
                case 31: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_33_0 = (RuntimeException) (var3);
                    stackIn_32_0 = stackIn_33_0;
                    stackIn_33_1 = new StringBuilder().append("je.G(").append(param0).append(',');
                    stackIn_32_1 = stackIn_33_1;
                    if (param1 == null) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_34_2 = "{...}";
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_34_2 = "null";
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static cd a(int param0) {
        if (sh.field_d == uc.field_c) {
          throw new IllegalStateException();
        } else {
          if (kl.field_z != sh.field_d) {
            if (param0 == 13) {
              return null;
            } else {
              je.a(-1);
              return null;
            }
          } else {
            sh.field_d = uc.field_c;
            return ea.field_x;
          }
        }
    }

    final int b(int param0, int param1) {
        if (param1 < 17) {
          L0: {
            this.field_e = 12;
            if (this.field_a == null) {
              break L0;
            } else {
              param0 = 6 - -(int)((long)this.field_e * (long)param0 / (long)this.field_d);
              break L0;
            }
          }
          return param0;
        } else {
          L1: {
            if (this.field_a == null) {
              break L1;
            } else {
              param0 = 6 - -(int)((long)this.field_e * (long)param0 / (long)this.field_d);
              break L1;
            }
          }
          return param0;
        }
    }

    final static String a(String param0, int param1, byte param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_35_0 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          L0: {
            if (1 != param1) {
              if (2 == param1) {
                stackIn_6_0 = cm.a((byte) 121, hf.field_c, new String[]{param0});
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == -128) {
                    break L1;
                  } else {
                    var4 = (String) null;
                    je.a((String) null, 71, (byte) -56);
                    break L1;
                  }
                }
                if (3 == param1) {
                  stackIn_12_0 = cm.a((byte) 83, bg.field_a, new String[]{param0});
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-5 == (param1 ^ -1)) {
                    stackIn_16_0 = cm.a((byte) 106, aj.field_b, new String[]{param0});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1 != 5) {
                      if (param1 != 6) {
                        if (param1 != 7) {
                          if (-9 == (param1 ^ -1)) {
                            stackIn_29_0 = cm.a((byte) 83, gf.field_d, new String[]{param0});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (-12 != (param1 ^ -1)) {
                              if (param1 != 12) {
                                if (13 == param1) {
                                  stackIn_39_0 = cm.a((byte) 127, sh.field_b, new String[]{param0});
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackIn_35_0 = cm.a((byte) 100, md.field_S, new String[]{param0});
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_32_0 = cm.a((byte) 123, em.field_b, new String[]{param0});
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_25_0 = cm.a((byte) 123, f.field_x, new String[]{param0});
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_22_0 = cm.a((byte) 121, bj.field_b, new String[]{param0});
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_19_0 = cm.a((byte) 96, ln.field_b, new String[]{param0});
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = cm.a((byte) 121, wk.field_g, new String[]{param0});
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3);

            stackIn_43_1 = new StringBuilder().append("je.B(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L2;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_35_0;
                          } else {
                            return stackIn_39_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        if (param0 != 23369) {
            field_b = (cd) null;
        }
    }

    final int a(boolean param0, int param1) {
        if (param0) {
          return -86;
        } else {
          L0: {
            if (this.field_a != null) {
              param1 = (int)((long)this.field_e * (long)param1 / (long)this.field_d);
              break L0;
            } else {
              break L0;
            }
          }
          return param1;
        }
    }

    je(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = client.field_A ? 1 : 0;
                    if (param1 != param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var3 = n.a(43, param0, param1);
                    param1 = param1 / var3;
                    param0 = param0 / var3;
                    this.field_d = param0;
                    this.field_e = param1;
                    this.field_a = new int[param0][14];
                    var4 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = var4 ^ -1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 <= (param0 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = this.field_a[var4];
                    var6 = (double)var4 / (double)param0 + 6.0;
                    var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                    if (var16 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (0 <= var8) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var9 = (int)Math.ceil(var6 + 7.0);
                    if (var9 <= 14) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var9 = 14;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var10 = (double)param1 / (double)param0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var9 <= var8) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var12 = 3.141592653589793 * ((double)var8 - var6);
                    var14 = var10;
                    stackIn_4_0 = (-0.0001 < var12 ? -1 : (-0.0001 == var12 ? 0 : 1));
                    stackIn_14_0 = stackIn_4_0;
                    if (var16 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 > 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var12 <= 0.0001) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var14 = var14 * (Math.sin(var12) / var12);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var14 = var14 * (Math.cos(((double)var8 - var6) * 0.2243994752564138) * 0.46 + 0.54);
                    var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                    var8++;
                    if (var16 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var4++;
                    if (var16 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
