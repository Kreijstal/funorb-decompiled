/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kva extends dg {
    private uh field_u;
    private oia[][] field_q;
    static en field_n;
    static String field_r;
    private dpa[][] field_m;
    static jea[] field_p;
    static kea field_s;
    private int field_t;
    private int field_v;
    private int field_o;

    kva(int param0) {
        super(param0);
    }

    final void a(uw param0, int param1) {
        ev var3 = null;
        RuntimeException var3_ref = null;
        sva var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 82) {
                break L1;
              } else {
                this.field_t = 34;
                break L1;
              }
            }
            L2: {
              super.a(param0, 87);
              this.field_q = (oia[][]) null;
              this.field_m = (dpa[][]) null;
              if (null != this.field_u) {
                L3: {
                  var3 = param0.a((byte) 59);
                  if (var3 instanceof sva) {
                    var4 = (sva) ((Object) var3);
                    var4.b((byte) -105, this.field_u);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_u = null;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("kva.RA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final ka a(int param0, dpa param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        kh var5 = null;
        ka stackIn_20_0 = null;
        ka stackIn_22_0 = null;
        ka stackIn_24_0 = null;
        ka stackIn_34_0 = null;
        ka stackIn_36_0 = null;
        ka stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_35_0 = null;
        ka stackOut_37_0 = null;
        ka stackOut_33_0 = null;
        ka stackOut_21_0 = null;
        ka stackOut_23_0 = null;
        ka stackOut_19_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 90) {
                break L1;
              } else {
                var5 = (kh) null;
                this.a((byte) -47, (kh) null);
                break L1;
              }
            }
            L2: {
              var3_int = this.field_v;
              if (var3_int == 0) {
                break L2;
              } else {
                if (var3_int != 1) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    L3: {
                      L4: {
                        var3_int = param1.field_j;
                        if (0 != var3_int) {
                          break L4;
                        } else {
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (-2 == (var3_int ^ -1)) {
                        stackOut_35_0 = df.field_J[91];
                        stackIn_36_0 = stackOut_35_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if ((var3_int ^ -1) == -3) {
                          stackOut_37_0 = df.field_J[92];
                          stackIn_38_0 = stackOut_37_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (-4 != (var3_int ^ -1)) {
                            break L3;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                    stackOut_33_0 = df.field_J[90];
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L5: {
              L6: {
                var3_int = param1.field_j;
                if (var3_int != 0) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if ((var3_int ^ -1) != -2) {
                  break L7;
                } else {
                  if (var4 == 0) {
                    stackOut_21_0 = df.field_J[72];
                    stackIn_22_0 = stackOut_21_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if ((var3_int ^ -1) != -3) {
                  break L8;
                } else {
                  if (var4 == 0) {
                    stackOut_23_0 = df.field_J[73];
                    stackIn_24_0 = stackOut_23_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L8;
                  }
                }
              }
              if (var3_int != 3) {
                break L5;
              } else {
                if (var4 != 0) {
                  break L5;
                } else {
                  return null;
                }
              }
            }
            stackOut_19_0 = df.field_J[71];
            stackIn_20_0 = stackOut_19_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var3);
            stackOut_40_1 = new StringBuilder().append("kva.PA(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_24_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_34_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0;
                } else {
                  return stackIn_38_0;
                }
              }
            }
          }
        }
    }

    final ka a(dpa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        kh var4 = null;
        ka stackIn_11_0 = null;
        ka stackIn_13_0 = null;
        ka stackIn_16_0 = null;
        ka stackIn_19_0 = null;
        ka stackIn_22_0 = null;
        ka stackIn_25_0 = null;
        ka stackIn_28_0 = null;
        ka stackIn_31_0 = null;
        ka stackIn_34_0 = null;
        ka stackIn_37_0 = null;
        ka stackIn_39_0 = null;
        ka stackIn_41_0 = null;
        ka stackIn_43_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_40_0 = null;
        ka stackOut_42_0 = null;
        ka stackOut_38_0 = null;
        ka stackOut_36_0 = null;
        ka stackOut_33_0 = null;
        ka stackOut_30_0 = null;
        ka stackOut_27_0 = null;
        ka stackOut_24_0 = null;
        ka stackOut_21_0 = null;
        ka stackOut_18_0 = null;
        ka stackOut_15_0 = null;
        ka stackOut_12_0 = null;
        ka stackOut_10_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 44) {
                break L1;
              } else {
                var4 = (kh) null;
                this.a((byte) -87, (kh) null);
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_j;
              if (-1 == (var3_int ^ -1)) {
                break L2;
              } else {
                if (1 == var3_int) {
                  stackOut_40_0 = df.field_J[29];
                  stackIn_41_0 = stackOut_40_0;
                  decompiledRegionSelector0 = 11;
                  break L0;
                } else {
                  if (-3 == (var3_int ^ -1)) {
                    stackOut_42_0 = df.field_J[30];
                    stackIn_43_0 = stackOut_42_0;
                    decompiledRegionSelector0 = 12;
                    break L0;
                  } else {
                    if ((var3_int ^ -1) != -4) {
                      break L2;
                    } else {
                      if (TombRacer.field_G) {
                        break L2;
                      } else {
                        return null;
                      }
                    }
                  }
                }
              }
            }
            if (!param0.field_g) {
              if ((param0.field_d ^ -1) <= -12) {
                if (param0.field_d >= 22) {
                  if (33 <= param0.field_d) {
                    if (param0.field_d >= 44) {
                      if (55 <= param0.field_d) {
                        if (-67 >= (param0.field_d ^ -1)) {
                          if (-78 >= (param0.field_d ^ -1)) {
                            if ((param0.field_d ^ -1) <= -89) {
                              stackOut_38_0 = df.field_J[39];
                              stackIn_39_0 = stackOut_38_0;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            } else {
                              stackOut_36_0 = df.field_J[38];
                              stackIn_37_0 = stackOut_36_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            }
                          } else {
                            stackOut_33_0 = df.field_J[37];
                            stackIn_34_0 = stackOut_33_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        } else {
                          stackOut_30_0 = df.field_J[36];
                          stackIn_31_0 = stackOut_30_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        stackOut_27_0 = df.field_J[35];
                        stackIn_28_0 = stackOut_27_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackOut_24_0 = df.field_J[34];
                      stackIn_25_0 = stackOut_24_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackOut_21_0 = df.field_J[33];
                    stackIn_22_0 = stackOut_21_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackOut_18_0 = df.field_J[32];
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackOut_15_0 = df.field_J[31];
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              if ((param0.field_d ^ -1) <= -51) {
                stackOut_12_0 = df.field_J[114];
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_10_0 = df.field_J[113];
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var3);
            stackOut_45_1 = new StringBuilder().append("kva.TA(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L3;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_31_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_34_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_37_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_39_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_41_0;
                              } else {
                                return stackIn_43_0;
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
        }
    }

    kva(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    private final void n(byte param0) {
        ka discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dpa var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        dpa var27 = null;
        dpa var28 = null;
        la var29 = null;
        dpa var30 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          var29 = this.a(113);
          var3 = var29.m((byte) -86);
          var4 = var29.s(85);
          var5 = this.field_h.d(3);
          var6 = this.field_h.e(param0 + 9758);
          this.field_o = this.field_h.c(-128) / 2097152;
          this.field_t = this.field_h.a((byte) 55) / 2097152;
          this.field_m = new dpa[this.field_o][this.field_t];
          var7 = -(this.field_h.a((byte) 55) / 2) + (var6 + 1048576);
          if (param0 == -110) {
            break L0;
          } else {
            var27 = (dpa) null;
            discarded$1 = this.a(-101, (dpa) null);
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          L2: {
            if (var8 >= this.field_t) {
              break L2;
            } else {
              var9 = -(this.field_h.c(-53) / 2) + var5 + 1048576;
              if (var26 != 0) {
                break L2;
              } else {
                var10 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var10 >= this.field_o) {
                        break L5;
                      } else {
                        var28 = new dpa();
                        var30 = var28;
                        var11 = var30;
                        this.field_m[var10][var8] = var28;
                        stackOut_7_0 = 0;
                        stackOut_7_1 = var10;
                        stackIn_168_0 = stackOut_7_0;
                        stackIn_168_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var26 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (stackIn_8_0 >= stackIn_8_1) {
                              stackOut_10_0 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              break L6;
                            } else {
                              stackOut_9_0 = 1;
                              stackIn_11_0 = stackOut_9_0;
                              break L6;
                            }
                          }
                          L7: {
                            var12 = stackIn_11_0;
                            if (-1 + this.field_o <= var10) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L7;
                            } else {
                              stackOut_12_0 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              break L7;
                            }
                          }
                          L8: {
                            var13 = stackIn_14_0;
                            if ((var8 ^ -1) >= -1) {
                              stackOut_16_0 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              break L8;
                            } else {
                              stackOut_15_0 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              break L8;
                            }
                          }
                          L9: {
                            var14 = stackIn_17_0;
                            if (-1 + this.field_t <= var8) {
                              stackOut_19_0 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              break L9;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L9;
                            }
                          }
                          L10: {
                            var15 = stackIn_20_0;
                            if (var12 == 0) {
                              if (2097152 <= var9) {
                                if (var29.a(var9 + -2097152, 2097152, var7, 2097152, true, 1, (byte) -101)) {
                                  stackOut_26_0 = 1;
                                  stackIn_28_0 = stackOut_26_0;
                                  break L10;
                                } else {
                                  stackOut_25_0 = 0;
                                  stackIn_28_0 = stackOut_25_0;
                                  break L10;
                                }
                              } else {
                                stackOut_23_0 = 1;
                                stackIn_28_0 = stackOut_23_0;
                                break L10;
                              }
                            } else {
                              stackOut_21_0 = 1;
                              stackIn_28_0 = stackOut_21_0;
                              break L10;
                            }
                          }
                          L11: {
                            var16 = stackIn_28_0;
                            if (var13 == 0) {
                              if (var9 <= var3 + -2097152) {
                                if (var29.a(2097152 + var9, 2097152, var7, 2097152, true, 1, (byte) -86)) {
                                  stackOut_34_0 = 1;
                                  stackIn_36_0 = stackOut_34_0;
                                  break L11;
                                } else {
                                  stackOut_33_0 = 0;
                                  stackIn_36_0 = stackOut_33_0;
                                  break L11;
                                }
                              } else {
                                stackOut_31_0 = 1;
                                stackIn_36_0 = stackOut_31_0;
                                break L11;
                              }
                            } else {
                              stackOut_29_0 = 1;
                              stackIn_36_0 = stackOut_29_0;
                              break L11;
                            }
                          }
                          L12: {
                            var17 = stackIn_36_0;
                            if (var14 == 0) {
                              if (var7 >= 2097152) {
                                if (var29.a(var9, 2097152, -2097152 + var7, 2097152, true, 1, (byte) -44)) {
                                  stackOut_42_0 = 1;
                                  stackIn_44_0 = stackOut_42_0;
                                  break L12;
                                } else {
                                  stackOut_41_0 = 0;
                                  stackIn_44_0 = stackOut_41_0;
                                  break L12;
                                }
                              } else {
                                stackOut_39_0 = 1;
                                stackIn_44_0 = stackOut_39_0;
                                break L12;
                              }
                            } else {
                              stackOut_37_0 = 1;
                              stackIn_44_0 = stackOut_37_0;
                              break L12;
                            }
                          }
                          L13: {
                            var18 = stackIn_44_0;
                            if (var15 == 0) {
                              if (var7 <= -2097152 + var4) {
                                if (var29.a(var9, 2097152, 2097152 + var7, 2097152, true, 1, (byte) 92)) {
                                  stackOut_50_0 = 1;
                                  stackIn_52_0 = stackOut_50_0;
                                  break L13;
                                } else {
                                  stackOut_49_0 = 0;
                                  stackIn_52_0 = stackOut_49_0;
                                  break L13;
                                }
                              } else {
                                stackOut_47_0 = 1;
                                stackIn_52_0 = stackOut_47_0;
                                break L13;
                              }
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_52_0 = stackOut_45_0;
                              break L13;
                            }
                          }
                          L14: {
                            var19 = stackIn_52_0;
                            var20 = 0;
                            if (var16 == 0) {
                              break L14;
                            } else {
                              var20++;
                              break L14;
                            }
                          }
                          L15: {
                            if (var17 == 0) {
                              break L15;
                            } else {
                              var20++;
                              break L15;
                            }
                          }
                          L16: {
                            if (var18 == 0) {
                              break L16;
                            } else {
                              var20++;
                              break L16;
                            }
                          }
                          L17: {
                            if (var19 != 0) {
                              var20++;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            L19: {
                              var21 = 0;
                              if (var20 == 4) {
                                break L19;
                              } else {
                                L20: {
                                  if ((var20 ^ -1) == -4) {
                                    break L20;
                                  } else {
                                    L21: {
                                      if (-3 == (var20 ^ -1)) {
                                        break L21;
                                      } else {
                                        var30.field_j = 3;
                                        if (var26 == 0) {
                                          break L18;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    L22: {
                                      L23: {
                                        if (var18 != 0) {
                                          break L23;
                                        } else {
                                          if (var19 == 0) {
                                            break L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      L24: {
                                        if (var16 != 0) {
                                          break L24;
                                        } else {
                                          if (var17 != 0) {
                                            break L24;
                                          } else {
                                            var30.field_j = 3;
                                            if (var26 == 0) {
                                              break L18;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                      }
                                      L25: {
                                        L26: {
                                          L27: {
                                            var30.field_f = var30.field_f - 512;
                                            if (var16 != 0) {
                                              break L27;
                                            } else {
                                              if (var18 == 0) {
                                                break L26;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                          L28: {
                                            L29: {
                                              if (var16 != 0) {
                                                break L29;
                                              } else {
                                                if (var19 == 0) {
                                                  break L28;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                            L30: {
                                              L31: {
                                                if (var17 != 0) {
                                                  break L31;
                                                } else {
                                                  if (var18 == 0) {
                                                    break L30;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                              }
                                              if (var17 != 0) {
                                                break L25;
                                              } else {
                                                if (var19 != 0) {
                                                  break L25;
                                                } else {
                                                  var21 = -512;
                                                  if (var26 == 0) {
                                                    break L25;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                            }
                                            var21 = 1024;
                                            if (var26 == 0) {
                                              break L25;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var21 = 0;
                                          if (var26 == 0) {
                                            break L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        var21 = 512;
                                        break L25;
                                      }
                                      var30.field_j = 1;
                                      if (var26 == 0) {
                                        break L18;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var30.field_j = 3;
                                    if (var26 == 0) {
                                      break L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L32: {
                                  var30.field_j = 0;
                                  if (var18 != 0) {
                                    break L32;
                                  } else {
                                    var30.field_g = var29.a(var9, 2097152, -2097152 + var7, 2097152, true, 0, (byte) -20);
                                    var21 = 1024;
                                    if (var26 == 0) {
                                      break L18;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                L33: {
                                  if (var19 != 0) {
                                    break L33;
                                  } else {
                                    var21 = 0;
                                    var30.field_g = var29.a(var9, 2097152, 2097152 + var7, 2097152, true, 0, (byte) -52);
                                    if (var26 == 0) {
                                      break L18;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                L34: {
                                  if (var17 == 0) {
                                    break L34;
                                  } else {
                                    var30.field_g = var29.a(var9 - 2097152, 2097152, var7, 2097152, true, 0, (byte) 108);
                                    var21 = 512;
                                    if (var26 == 0) {
                                      break L18;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var30.field_g = var29.a(2097152 + var9, 2097152, var7, 2097152, true, 0, (byte) -88);
                                var21 = -512;
                                if (var26 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            L35: {
                              L36: {
                                if (var12 == 0) {
                                  break L36;
                                } else {
                                  if (var14 != 0) {
                                    stackOut_108_0 = 1;
                                    stackIn_110_0 = stackOut_108_0;
                                    break L35;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              if (-2097153 >= (var9 ^ -1)) {
                                if (var7 >= 2097152) {
                                  if (var29.a(-2097152 + var9, 2097152, var7 + -2097152, 2097152, true, 1, (byte) -103)) {
                                    stackOut_107_0 = 1;
                                    stackIn_110_0 = stackOut_107_0;
                                    break L35;
                                  } else {
                                    stackOut_106_0 = 0;
                                    stackIn_110_0 = stackOut_106_0;
                                    break L35;
                                  }
                                } else {
                                  stackOut_104_0 = 1;
                                  stackIn_110_0 = stackOut_104_0;
                                  break L35;
                                }
                              } else {
                                stackOut_102_0 = 1;
                                stackIn_110_0 = stackOut_102_0;
                                break L35;
                              }
                            }
                            L37: {
                              L38: {
                                var22 = stackIn_110_0;
                                if (var13 == 0) {
                                  break L38;
                                } else {
                                  if (var14 != 0) {
                                    stackOut_120_0 = 1;
                                    stackIn_122_0 = stackOut_120_0;
                                    break L37;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              if (var9 <= -2097152 + var3) {
                                if ((var7 ^ -1) <= -2097153) {
                                  if (var29.a(2097152 + var9, 2097152, var7 - 2097152, 2097152, true, 1, (byte) 114)) {
                                    stackOut_119_0 = 1;
                                    stackIn_122_0 = stackOut_119_0;
                                    break L37;
                                  } else {
                                    stackOut_118_0 = 0;
                                    stackIn_122_0 = stackOut_118_0;
                                    break L37;
                                  }
                                } else {
                                  stackOut_116_0 = 1;
                                  stackIn_122_0 = stackOut_116_0;
                                  break L37;
                                }
                              } else {
                                stackOut_114_0 = 1;
                                stackIn_122_0 = stackOut_114_0;
                                break L37;
                              }
                            }
                            L39: {
                              L40: {
                                var23 = stackIn_122_0;
                                if (var12 == 0) {
                                  break L40;
                                } else {
                                  if (var15 == 0) {
                                    break L40;
                                  } else {
                                    stackOut_124_0 = 1;
                                    stackIn_134_0 = stackOut_124_0;
                                    break L39;
                                  }
                                }
                              }
                              if (-2097153 >= (var9 ^ -1)) {
                                if (var7 <= -2097152 + var4) {
                                  if (var29.a(var9 + -2097152, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 126)) {
                                    stackOut_132_0 = 1;
                                    stackIn_134_0 = stackOut_132_0;
                                    break L39;
                                  } else {
                                    stackOut_131_0 = 0;
                                    stackIn_134_0 = stackOut_131_0;
                                    break L39;
                                  }
                                } else {
                                  stackOut_129_0 = 1;
                                  stackIn_134_0 = stackOut_129_0;
                                  break L39;
                                }
                              } else {
                                stackOut_127_0 = 1;
                                stackIn_134_0 = stackOut_127_0;
                                break L39;
                              }
                            }
                            L41: {
                              L42: {
                                var24 = stackIn_134_0;
                                if (var13 == 0) {
                                  break L42;
                                } else {
                                  if (var15 == 0) {
                                    break L42;
                                  } else {
                                    stackOut_136_0 = 1;
                                    stackIn_146_0 = stackOut_136_0;
                                    break L41;
                                  }
                                }
                              }
                              if (var9 <= var3 + -2097152) {
                                if (var7 <= -2097152 + var4) {
                                  if (var29.a(2097152 + var9, 2097152, var7 + 2097152, 2097152, true, 1, (byte) 77)) {
                                    stackOut_144_0 = 1;
                                    stackIn_146_0 = stackOut_144_0;
                                    break L41;
                                  } else {
                                    stackOut_143_0 = 0;
                                    stackIn_146_0 = stackOut_143_0;
                                    break L41;
                                  }
                                } else {
                                  stackOut_141_0 = 1;
                                  stackIn_146_0 = stackOut_141_0;
                                  break L41;
                                }
                              } else {
                                stackOut_139_0 = 1;
                                stackIn_146_0 = stackOut_139_0;
                                break L41;
                              }
                            }
                            L43: {
                              var25 = stackIn_146_0;
                              if (var22 == 0) {
                                break L43;
                              } else {
                                if (var23 == 0) {
                                  break L43;
                                } else {
                                  if (var24 == 0) {
                                    break L43;
                                  } else {
                                    if (var25 == 0) {
                                      break L43;
                                    } else {
                                      var30.field_j = 3;
                                      if (var26 == 0) {
                                        break L18;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L44: {
                              L45: {
                                if (var22 != 0) {
                                  break L45;
                                } else {
                                  var21 = 512;
                                  if (var26 == 0) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              L46: {
                                if (var24 == 0) {
                                  break L46;
                                } else {
                                  L47: {
                                    if (var23 != 0) {
                                      break L47;
                                    } else {
                                      var21 = 1024;
                                      if (var26 == 0) {
                                        break L44;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                  var21 = -512;
                                  if (var26 == 0) {
                                    break L44;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              var21 = 0;
                              break L44;
                            }
                            var30.field_j = 2;
                            break L18;
                          }
                          var30.field_d = var29.e(true).a(100, param0 + 110);
                          var28.field_f = dfa.a(var21 + ku.field_j[var28.field_j], 2048, param0 ^ -57);
                          var30.field_a = -var6 + var7;
                          var30.field_i = -var5 + var9;
                          var30.field_e = (kva) (this);
                          var22 = 0;
                          var23 = 80;
                          var24 = 80;
                          L48: while (true) {
                            L49: {
                              if (var23 <= var22) {
                                var9 = var9 + 2097152;
                                var10++;
                                break L49;
                              } else {
                                var22 = var22 + var24;
                                var11.field_b = var11.b(53);
                                var11.field_b.field_h = var22;
                                var11 = var11.field_b;
                                if (var26 != 0) {
                                  break L49;
                                } else {
                                  continue L48;
                                }
                              }
                            }
                            if (var26 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    stackOut_167_0 = var7;
                    stackOut_167_1 = 2097152;
                    stackIn_168_0 = stackOut_167_0;
                    stackIn_168_1 = stackOut_167_1;
                    break L4;
                  }
                  var7 = stackIn_168_0 + stackIn_168_1;
                  var8++;
                  if (var26 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final int m(byte param0) {
        if (param0 >= -63) {
            return -93;
        }
        return 0;
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = -114 % ((param0 - -8) / 40);
            super.a((byte) -68, param1);
            param1.a((byte) -127, this.field_v, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kva.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        dpa var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (param0 >= 0) {
            break L0;
          } else {
            this.field_o = 122;
            break L0;
          }
        }
        super.h(70);
        if (null == this.field_m) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            L2: {
              if (this.field_o <= var2) {
                break L2;
              } else {
                if (var6 != 0) {
                  break L2;
                } else {
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var3 >= this.field_t) {
                          break L5;
                        } else {
                          var4 = this.field_m[var2][var3];
                          var5 = ku.field_j[var4.field_j];
                          var4.field_f = dfa.a(-var4.field_f + var5, 2048, 93);
                          var4.field_i = -var4.field_i;
                          var3++;
                          if (var6 != 0) {
                            break L4;
                          } else {
                            if (var6 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2++;
                      break L4;
                    }
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    final int k(byte param0) {
        if (param0 != -99) {
            field_r = (String) null;
        }
        return 2;
    }

    final void a(int param0, uw param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        dpa var8 = null;
        int stackIn_6_0 = 0;
        Object stackIn_9_0 = null;
        int stackIn_23_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        Object stackOut_8_0 = null;
        int stackOut_22_0 = 0;
        Object stackOut_24_0 = null;
        int stackOut_26_0 = 0;
        Object stackOut_28_0 = null;
        byte stackOut_31_0 = 0;
        Object stackOut_33_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (this.field_m != null) {
                          var4_int = 0;
                          L7: while (true) {
                            if (this.field_o <= var4_int) {
                              break L6;
                            } else {
                              stackOut_5_0 = 0;
                              stackIn_23_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                var5 = stackIn_6_0;
                                L8: while (true) {
                                  L9: {
                                    if (var5 >= this.field_t) {
                                      break L9;
                                    } else {
                                      var8 = this.field_m[var4_int][var5];
                                      var6 = var8;
                                      stackOut_8_0 = null;
                                      stackIn_34_0 = stackOut_8_0;
                                      stackIn_9_0 = stackOut_8_0;
                                      if (var7 != 0) {
                                        break L2;
                                      } else {
                                        L10: {
                                          L11: {
                                            if (stackIn_9_0 == var8) {
                                              break L11;
                                            } else {
                                              L12: {
                                                if (var8.field_j != 3) {
                                                  break L12;
                                                } else {
                                                  if (var7 == 0) {
                                                    break L11;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                              L13: while (true) {
                                                if (var6 == null) {
                                                  break L11;
                                                } else {
                                                  param1.a(param0, var6, (byte) -33);
                                                  var6 = var6.field_b;
                                                  if (var7 != 0) {
                                                    break L10;
                                                  } else {
                                                    if (var7 == 0) {
                                                      continue L13;
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var5++;
                                          break L10;
                                        }
                                        if (var7 == 0) {
                                          continue L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  var4_int++;
                                  if (var7 == 0) {
                                    continue L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      if (this.field_q != null) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                    var4_int = stackIn_23_0;
                    L14: while (true) {
                      stackOut_24_0 = this;
                      stackIn_25_0 = stackOut_24_0;
                      L15: while (true) {
                        if (((kva) (this)).field_o <= var4_int) {
                          break L4;
                        } else {
                          stackOut_26_0 = 0;
                          stackIn_32_0 = stackOut_26_0;
                          stackIn_27_0 = stackOut_26_0;
                          if (var7 != 0) {
                            break L3;
                          } else {
                            var5 = stackIn_27_0;
                            if (var5 >= this.field_t) {
                              var4_int++;
                              if (var7 == 0) {
                                continue L14;
                              } else {
                                break L4;
                              }
                            } else {
                              stackOut_28_0 = this;
                              stackIn_25_0 = stackOut_28_0;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_31_0 = param2;
                  stackIn_32_0 = stackOut_31_0;
                  break L3;
                }
                if (stackIn_32_0 > 40) {
                  break L1;
                } else {
                  stackOut_33_0 = null;
                  stackIn_34_0 = stackOut_33_0;
                  break L2;
                }
              }
              field_s = (kea) ((Object) stackIn_34_0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var4);
            stackOut_36_1 = new StringBuilder().append("kva.FA(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L16;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L16;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
    }

    final int f(byte param0) {
        int var2 = 89 / ((param0 - 15) / 45);
        return 1;
    }

    public static void i(int param0) {
        field_n = null;
        int var1 = -43 / ((param0 - -84) / 37);
        field_s = null;
        field_p = null;
        field_r = null;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        try {
            int var6_int = -76 / ((param4 - -38) / 47);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kva.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final ka a(byte param0, oia param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_6_0 = null;
        ka stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3_int = 102 / ((param0 - -68) / 49);
            var7 = this.field_v;
            if (-1 != (var7 ^ -1)) {
              if (1 == var7) {
                if (!TombRacer.field_G) {
                  var4 = param1.b((byte) 111) / 2097152 % 3;
                  var5 = param1.c((byte) 102) / 2097152 % 3;
                  var6 = 3 * var5 + (80 + var4);
                  stackOut_7_0 = df.field_J[var6];
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_5_0 = null;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("kva.SA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ka) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final void a(int param0, la param1, kh param2) {
        int discarded$3 = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 119) {
                break L1;
              } else {
                discarded$3 = this.f((byte) -126);
                break L1;
              }
            }
            L2: {
              super.a(122, param1, param2);
              if (param1.field_E >= 19) {
                this.field_v = param2.b((byte) 44, 2);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("kva.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oia var8 = null;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_h.d(3);
        var3 = this.field_h.e(param0 + -211);
        if (param0 != 9859) {
          return;
        } else {
          this.field_q = new oia[this.field_o][this.field_t];
          var4 = -(this.field_h.a((byte) 55) / 2) + var3 - -1048576;
          var5 = 0;
          L0: while (true) {
            L1: {
              if (this.field_t <= var5) {
                break L1;
              } else {
                var6 = 1048576 + (var2 - this.field_h.c(-100) / 2);
                if (var9 != 0) {
                  break L1;
                } else {
                  var7 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var7 >= this.field_o) {
                          break L4;
                        } else {
                          var8 = new oia();
                          this.field_q[var7][var5] = var8;
                          var8.field_c = (kva) (this);
                          var8.field_b = var4 - var3;
                          var8.field_a = var6 + -var2;
                          var6 = var6 + 2097152;
                          var7++;
                          if (var9 != 0) {
                            break L3;
                          } else {
                            if (var9 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var4 = var4 + 2097152;
                      var5++;
                      break L3;
                    }
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    final void a(byte param0, int param1, uw param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dpa var6 = null;
        int var7 = 0;
        dpa var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_22_0 = 0;
        byte stackOut_33_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_m) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    if (this.field_o <= var4_int) {
                      break L2;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_34_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        var5 = stackIn_5_0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var5 >= this.field_t) {
                                break L6;
                              } else {
                                var8 = this.field_m[var4_int][var5];
                                var6 = var8;
                                if (var7 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    L8: {
                                      if (var8 == null) {
                                        break L8;
                                      } else {
                                        if ((var8.field_j ^ -1) == -4) {
                                          break L8;
                                        } else {
                                          L9: while (true) {
                                            if (var6 == null) {
                                              break L8;
                                            } else {
                                              param2.a((byte) -5, param1, var6);
                                              var6 = var6.field_b;
                                              if (var7 != 0) {
                                                break L7;
                                              } else {
                                                if (var7 == 0) {
                                                  continue L9;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var5++;
                                    break L7;
                                  }
                                  if (var7 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var4_int++;
                            break L5;
                          }
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L10: {
                if (null == this.field_q) {
                  break L10;
                } else {
                  var4_int = 0;
                  L11: while (true) {
                    if (var4_int >= this.field_o) {
                      break L10;
                    } else {
                      stackOut_22_0 = 0;
                      stackIn_34_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (var7 != 0) {
                        break L1;
                      } else {
                        var5 = stackIn_23_0;
                        L12: while (true) {
                          L13: {
                            L14: {
                              if (this.field_t <= var5) {
                                break L14;
                              } else {
                                if (var7 != 0) {
                                  break L13;
                                } else {
                                  L15: {
                                    L16: {
                                      if (null != this.field_q[var4_int][var5]) {
                                        break L16;
                                      } else {
                                        if (var7 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    param2.a((byte) 17, 0, this.field_q[var4_int][var5]);
                                    break L15;
                                  }
                                  var5++;
                                  if (var7 == 0) {
                                    continue L12;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                            var4_int++;
                            break L13;
                          }
                          if (var7 == 0) {
                            continue L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_33_0 = param0;
              stackIn_34_0 = stackOut_33_0;
              break L1;
            }
            L17: {
              if (stackIn_34_0 >= 50) {
                break L17;
              } else {
                discarded$1 = this.k((byte) 96);
                break L17;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var4);
            stackOut_37_1 = new StringBuilder().append("kva.V(").append(param0).append(',').append(param1).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L18;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L18;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
    }

    final void b(int param0, uw param1) {
        aga var6 = null;
        ev var4 = null;
        sva var5 = null;
        try {
            if (!(null != this.field_m)) {
                this.n((byte) -110);
            }
            if (this.field_q == null) {
                this.j(9859);
            }
            if (!((this.field_v ^ -1) != -2)) {
                var6 = new aga(tga.field_a, 0, 0, 0, 0, 16720418, 200, 8);
                this.field_u = new uh(var6);
                this.field_u.a(-17825792 + this.e((byte) -118) + 4194304, (byte) 95, this.c((byte) 108), this.b((byte) 84));
                var4 = param1.a((byte) 59);
                if (!(!(var4 instanceof sva))) {
                    var5 = (sva) ((Object) var4);
                    var5.a((byte) 45, this.field_u);
                }
            }
            super.b(param0 + param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kva.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_v = param1;
        if (param0 != 2097152) {
            this.field_u = (uh) null;
        }
    }

    static {
        field_r = "Wandering walls";
        field_s = new kea();
    }
}
