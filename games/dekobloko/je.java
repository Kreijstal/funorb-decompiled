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
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        byte[] stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (null == this.field_a) {
                    break L3;
                  } else {
                    var3_int = (int)((long)this.field_e * (long)param1.length / (long)this.field_d) + 14;
                    var15 = new int[var3_int];
                    var13 = var15;
                    var4 = var13;
                    var5 = 0;
                    var6 = 0;
                    var7 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var7 >= param1.length) {
                            break L6;
                          } else {
                            var8 = param1[var7];
                            var17 = this.field_a[var6];
                            stackOut_4_0 = 0;
                            stackIn_13_0 = stackOut_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            if (var11 != 0) {
                              break L5;
                            } else {
                              var10 = stackIn_5_0;
                              L7: while (true) {
                                L8: {
                                  L9: {
                                    if (14 <= var10) {
                                      break L9;
                                    } else {
                                      var4[var10 + var5] = var4[var10 + var5] + var8 * var17[var10];
                                      var10++;
                                      if (var11 != 0) {
                                        break L8;
                                      } else {
                                        if (var11 == 0) {
                                          continue L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  var6 = var6 + this.field_e;
                                  var10 = var6 / this.field_d;
                                  var5 = var5 + var10;
                                  var6 = var6 - var10 * this.field_d;
                                  var7++;
                                  break L8;
                                }
                                if (var11 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        param1 = new byte[var3_int];
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L5;
                      }
                      var7 = stackIn_13_0;
                      L10: while (true) {
                        if (var7 >= var3_int) {
                          break L3;
                        } else {
                          var8 = var15[var7] - -32768 >> -1922369712;
                          var19 = -128;
                          var18 = var8;
                          if (var11 != 0) {
                            if (var18 == var19) {
                              break L1;
                            } else {
                              break L2;
                            }
                          } else {
                            L11: {
                              L12: {
                                if (var18 >= var19) {
                                  break L12;
                                } else {
                                  param1[var7] = (byte)-128;
                                  if (var11 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (-128 > (var8 ^ -1)) {
                                  break L13;
                                } else {
                                  param1[var7] = (byte)var8;
                                  if (var11 == 0) {
                                    break L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              param1[var7] = (byte)127;
                              break L11;
                            }
                            var7++;
                            if (var11 == 0) {
                              continue L10;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (param0 == 14) {
                  break L1;
                } else {
                  break L2;
                }
              }
              field_f = (ak) null;
              break L1;
            }
            stackOut_29_0 = (byte[]) (param1);
            stackIn_30_0 = stackOut_29_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("je.G(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L14;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L14;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        return stackIn_30_0;
    }

    final static cd a(int param0) {
        cd discarded$2 = null;
        if (sh.field_d == uc.field_c) {
          throw new IllegalStateException();
        } else {
          if (kl.field_z != sh.field_d) {
            if (param0 == 13) {
              return null;
            } else {
              discarded$2 = je.a(-1);
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
        String discarded$1 = null;
        RuntimeException var3 = null;
        String var4 = null;
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
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        String stackOut_28_0 = null;
        String stackOut_38_0 = null;
        String stackOut_34_0 = null;
        String stackOut_31_0 = null;
        String stackOut_24_0 = null;
        String stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            if (1 != param1) {
              if (2 == param1) {
                stackOut_5_0 = cm.a((byte) 121, hf.field_c, new String[]{param0});
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == -128) {
                    break L1;
                  } else {
                    var4 = (String) null;
                    discarded$1 = je.a((String) null, 71, (byte) -56);
                    break L1;
                  }
                }
                if (3 == param1) {
                  stackOut_11_0 = cm.a((byte) 83, bg.field_a, new String[]{param0});
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-5 == (param1 ^ -1)) {
                    stackOut_15_0 = cm.a((byte) 106, aj.field_b, new String[]{param0});
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1 != 5) {
                      if (param1 != 6) {
                        if (param1 != 7) {
                          if (-9 == (param1 ^ -1)) {
                            stackOut_28_0 = cm.a((byte) 83, gf.field_d, new String[]{param0});
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (-12 != (param1 ^ -1)) {
                              if (param1 != 12) {
                                if (13 == param1) {
                                  stackOut_38_0 = cm.a((byte) 127, sh.field_b, new String[]{param0});
                                  stackIn_39_0 = stackOut_38_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackOut_34_0 = cm.a((byte) 100, md.field_S, new String[]{param0});
                                stackIn_35_0 = stackOut_34_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackOut_31_0 = cm.a((byte) 123, em.field_b, new String[]{param0});
                              stackIn_32_0 = stackOut_31_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackOut_24_0 = cm.a((byte) 123, f.field_x, new String[]{param0});
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_21_0 = cm.a((byte) 121, bj.field_b, new String[]{param0});
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_18_0 = cm.a((byte) 96, ln.field_b, new String[]{param0});
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = cm.a((byte) 121, wk.field_g, new String[]{param0});
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var3);
            stackOut_41_1 = new StringBuilder().append("je.B(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L2;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
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
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        var16 = client.field_A ? 1 : 0;
        if (param1 != param0) {
          var3 = n.a(43, param0, param1);
          param1 = param1 / var3;
          param0 = param0 / var3;
          this.field_d = param0;
          this.field_e = param1;
          this.field_a = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            stackOut_3_0 = var4 ^ -1;
            stackIn_4_0 = stackOut_3_0;
            L1: while (true) {
              if (stackIn_4_0 <= (param0 ^ -1)) {
                return;
              } else {
                var5 = this.field_a[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                if (var16 == 0) {
                  L2: {
                    if (0 <= var8) {
                      break L2;
                    } else {
                      var8 = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var9 = (int)Math.ceil(var6 + 7.0);
                    if (var9 <= 14) {
                      break L3;
                    } else {
                      var9 = 14;
                      break L3;
                    }
                  }
                  var10 = (double)param1 / (double)param0;
                  L4: while (true) {
                    if (var9 <= var8) {
                      var4++;
                      continue L0;
                    } else {
                      var12 = 3.141592653589793 * ((double)var8 - var6);
                      var14 = var10;
                      stackOut_13_0 = (-0.0001 < var12 ? -1 : (-0.0001 == var12 ? 0 : 1));
                      stackIn_4_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (var16 != 0) {
                        continue L1;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_14_0 > 0) {
                              break L6;
                            } else {
                              if (var12 <= 0.0001) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var14 = var14 * (Math.sin(var12) / var12);
                          break L5;
                        }
                        var14 = var14 * (Math.cos(((double)var8 - var6) * 0.2243994752564138) * 0.46 + 0.54);
                        var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                        var8++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
    }
}
