/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends le {
    private int field_i;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (0 == var4_int) {
                this.field_i = param2.e((byte) -91);
                break L1;
              } else {
                if ((var4_int ^ -1) == -2) {
                  L2: {
                    stackIn_6_0 = this;

                    if (-2 != (param2.e((byte) -109) ^ -1)) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  ((cj) (this)).field_g = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param1 < -60) {
                break L3;
              } else {
                this.field_i = 37;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("cj.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var8;
        int var9;
        ds var10;
        int[] var11;
        int[] var18;
        int[] var19;
        L0: {
          var9 = VoidHunters.field_G;
          var11 = this.field_f.a((byte) 118, param0);
          var3 = var11;
          if (this.field_f.field_e) {
            var19 = this.a(0, param0, 255);
            var18 = this.a(1, param0, 255);
            var8 = this.field_i;
            if (1 != var8) {
              if (var8 != 2) {
                if (-4 != (var8 ^ -1)) {
                  if (4 != var8) {
                    if (var8 == 5) {
                      var8 = 0;
                      L1: while (true) {
                        if (var8 >= hob.field_d) {
                          break L0;
                        } else {
                          var3[var8] = -((4096 - var19[var8]) * (4096 + -var18[var8]) >> -2015870228) + 4096;
                          var8++;
                          continue L1;
                        }
                      }
                    } else {
                      if (var8 == 6) {
                        var8 = 0;
                        L2: while (true) {
                          if (hob.field_d <= var8) {
                            break L0;
                          } else {
                            L3: {
                              var5 = var18[var8];
                              stackIn_42_0 = (int[]) (var3);

                              stackIn_42_1 = var8;

                              if (-2049 >= (var5 ^ -1)) {
                                stackIn_43_0 = (int[]) ((Object) stackIn_42_0);
                                stackIn_43_1 = stackIn_42_1;
                                stackIn_43_2 = 4096 - ((-var19[var8] + 4096) * (4096 - var5) >> 1272168139);
                                break L3;
                              } else {
                                stackIn_43_0 = (int[]) ((Object) stackIn_42_0);
                                stackIn_43_1 = stackIn_42_1;
                                stackIn_43_2 = var5 * var19[var8] >> -420351093;
                                break L3;
                              }
                            }
                            stackIn_43_0[stackIn_43_1] = stackIn_43_2;
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        if ((var8 ^ -1) == -8) {
                          var8 = 0;
                          L4: while (true) {
                            if (hob.field_d <= var8) {
                              break L0;
                            } else {
                              L5: {
                                var4 = var19[var8];
                                stackIn_48_0 = (int[]) (var3);

                                stackIn_48_1 = var8;

                                if (-4097 == (var4 ^ -1)) {
                                  stackIn_49_0 = (int[]) ((Object) stackIn_48_0);
                                  stackIn_49_1 = stackIn_48_1;
                                  stackIn_49_2 = 4096;
                                  break L5;
                                } else {
                                  stackIn_49_0 = (int[]) ((Object) stackIn_48_0);
                                  stackIn_49_1 = stackIn_48_1;
                                  stackIn_49_2 = (var18[var8] << -1474943636) / (-var4 + 4096);
                                  break L5;
                                }
                              }
                              stackIn_49_0[stackIn_49_1] = stackIn_49_2;
                              var8++;
                              continue L4;
                            }
                          }
                        } else {
                          if (8 != var8) {
                            if (9 == var8) {
                              var8 = 0;
                              L6: while (true) {
                                if (hob.field_d <= var8) {
                                  break L0;
                                } else {
                                  L7: {
                                    var4 = var19[var8];
                                    var5 = var18[var8];
                                    stackIn_60_0 = (int[]) (var3);

                                    stackIn_60_1 = var8;

                                    if (var4 >= var5) {
                                      stackIn_61_0 = (int[]) ((Object) stackIn_60_0);
                                      stackIn_61_1 = stackIn_60_1;
                                      stackIn_61_2 = var5;
                                      break L7;
                                    } else {
                                      stackIn_61_0 = (int[]) ((Object) stackIn_60_0);
                                      stackIn_61_1 = stackIn_60_1;
                                      stackIn_61_2 = var4;
                                      break L7;
                                    }
                                  }
                                  stackIn_61_0[stackIn_61_1] = stackIn_61_2;
                                  var8++;
                                  continue L6;
                                }
                              }
                            } else {
                              if ((var8 ^ -1) == -11) {
                                var8 = 0;
                                L8: while (true) {
                                  if (hob.field_d <= var8) {
                                    break L0;
                                  } else {
                                    L9: {
                                      var4 = var19[var8];
                                      var5 = var18[var8];
                                      stackIn_66_0 = (int[]) (var3);

                                      stackIn_66_1 = var8;

                                      if (var4 > var5) {
                                        stackIn_67_0 = (int[]) ((Object) stackIn_66_0);
                                        stackIn_67_1 = stackIn_66_1;
                                        stackIn_67_2 = var4;
                                        break L9;
                                      } else {
                                        stackIn_67_0 = (int[]) ((Object) stackIn_66_0);
                                        stackIn_67_1 = stackIn_66_1;
                                        stackIn_67_2 = var5;
                                        break L9;
                                      }
                                    }
                                    stackIn_67_0[stackIn_67_1] = stackIn_67_2;
                                    var8++;
                                    continue L8;
                                  }
                                }
                              } else {
                                if (11 == var8) {
                                  var8 = 0;
                                  L10: while (true) {
                                    if (var8 >= hob.field_d) {
                                      break L0;
                                    } else {
                                      L11: {
                                        var5 = var18[var8];
                                        var4 = var19[var8];
                                        stackIn_72_0 = (int[]) (var3);

                                        stackIn_72_1 = var8;

                                        if (var4 > var5) {
                                          stackIn_73_0 = (int[]) ((Object) stackIn_72_0);
                                          stackIn_73_1 = stackIn_72_1;
                                          stackIn_73_2 = var4 + -var5;
                                          break L11;
                                        } else {
                                          stackIn_73_0 = (int[]) ((Object) stackIn_72_0);
                                          stackIn_73_1 = stackIn_72_1;
                                          stackIn_73_2 = var5 + -var4;
                                          break L11;
                                        }
                                      }
                                      stackIn_73_0[stackIn_73_1] = stackIn_73_2;
                                      var8++;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  if (12 == var8) {
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var8 >= hob.field_d) {
                                        break L0;
                                      } else {
                                        var4 = var19[var8];
                                        var5 = var18[var8];
                                        var3[var8] = -(var5 * var4 >> 1388742827) + var5 + var4;
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            }
                          } else {
                            var8 = 0;
                            L13: while (true) {
                              if (hob.field_d <= var8) {
                                break L0;
                              } else {
                                L14: {
                                  var4 = var19[var8];
                                  stackIn_54_0 = (int[]) (var3);

                                  stackIn_54_1 = var8;

                                  if (var4 != 0) {
                                    stackIn_55_0 = (int[]) ((Object) stackIn_54_0);
                                    stackIn_55_1 = stackIn_54_1;
                                    stackIn_55_2 = -((-var18[var8] + 4096 << 646271564) / var4) + 4096;
                                    break L14;
                                  } else {
                                    stackIn_55_0 = (int[]) ((Object) stackIn_54_0);
                                    stackIn_55_1 = stackIn_54_1;
                                    stackIn_55_2 = 0;
                                    break L14;
                                  }
                                }
                                stackIn_55_0[stackIn_55_1] = stackIn_55_2;
                                var8++;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var8 = 0;
                    L15: while (true) {
                      if (var8 >= hob.field_d) {
                        break L0;
                      } else {
                        L16: {
                          var5 = var18[var8];
                          stackIn_33_0 = (int[]) (var3);

                          stackIn_33_1 = var8;

                          if (-1 != (var5 ^ -1)) {
                            stackIn_34_0 = (int[]) ((Object) stackIn_33_0);
                            stackIn_34_1 = stackIn_33_1;
                            stackIn_34_2 = (var19[var8] << 1167135948) / var5;
                            break L16;
                          } else {
                            stackIn_34_0 = (int[]) ((Object) stackIn_33_0);
                            stackIn_34_1 = stackIn_33_1;
                            stackIn_34_2 = 4096;
                            break L16;
                          }
                        }
                        stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                        var8++;
                        continue L15;
                      }
                    }
                  }
                } else {
                  var8 = 0;
                  L17: while (true) {
                    if (var8 >= hob.field_d) {
                      break L0;
                    } else {
                      var3[var8] = var18[var8] * var19[var8] >> -129632852;
                      var8++;
                      continue L17;
                    }
                  }
                }
              } else {
                var8 = 0;
                L18: while (true) {
                  if (var8 >= hob.field_d) {
                    break L0;
                  } else {
                    var3[var8] = -var18[var8] + var19[var8];
                    var8++;
                    continue L18;
                  }
                }
              }
            } else {
              var11 = var3;
              var8 = 0;
              L19: while (true) {
                if (var8 >= hob.field_d) {
                  break L0;
                } else {
                  var11[var8] = var18[var8] + var19[var8];
                  var8++;
                  continue L19;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L20: {
          if (param1) {
            break L20;
          } else {
            var10 = (ds) null;
            this.a(-107, 21, (ds) null);
            break L20;
          }
        }
        return var3;
    }

    public cj() {
        super(2, false);
        this.field_i = 6;
    }

    final int[][] a(int param0, int param1) {
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int[] stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int[] stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int[] stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int[] stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int[] stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int[] stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        int[] stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int[] stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int[] stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int[] stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int[][] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var12;
        int[] var13;
        int[] var14;
        int var21;
        int var22;
        int[][] var23;
        int[][] var24;
        int[][] var33;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        L0: {
          var22 = VoidHunters.field_G;
          var33 = this.field_d.a(param1, (byte) -112);
          var24 = var33;
          var23 = var24;
          var3 = var23;
          if (!this.field_d.field_g) {
            break L0;
          } else {
            var50 = this.a((byte) 59, 0, param1);
            var51 = this.a((byte) 110, 1, param1);
            var12 = var33[0];
            var13 = var33[1];
            var14 = var33[2];
            var52 = var50[0];
            var55 = var50[1];
            var57 = var50[2];
            var53 = var51[0];
            var54 = var51[1];
            var56 = var51[2];
            var21 = this.field_i;
            if (-2 != (var21 ^ -1)) {
              if (var21 != 2) {
                if ((var21 ^ -1) == -4) {
                  var12 = var33[0];
                  var13 = var33[1];
                  var14 = var33[2];
                  var52 = var50[0];
                  var53 = var51[0];
                  var54 = var51[1];
                  var55 = var50[1];
                  var56 = var51[2];
                  var57 = var50[2];
                  var21 = 0;
                  L1: while (true) {
                    if (hob.field_d <= var21) {
                      break L0;
                    } else {
                      var12[var21] = var52[var21] * var53[var21] >> -987528564;
                      var13[var21] = var55[var21] * var54[var21] >> -1185622740;
                      var14[var21] = var57[var21] * var56[var21] >> 1702744684;
                      var21++;
                      continue L1;
                    }
                  }
                } else {
                  if (-5 == (var21 ^ -1)) {
                    var12 = var33[0];
                    var13 = var33[1];
                    var14 = var33[2];
                    var52 = var50[0];
                    var53 = var51[0];
                    var54 = var51[1];
                    var55 = var50[1];
                    var56 = var51[2];
                    var57 = var50[2];
                    var21 = 0;
                    L2: while (true) {
                      if (var21 >= hob.field_d) {
                        break L0;
                      } else {
                        L3: {
                          var9 = var56[var21];
                          var8 = var54[var21];
                          var7 = var53[var21];
                          stackIn_33_0 = (int[]) (var12);

                          stackIn_33_1 = var21;

                          if (-1 != (var7 ^ -1)) {
                            stackIn_34_0 = (int[]) ((Object) stackIn_33_0);
                            stackIn_34_1 = stackIn_33_1;
                            stackIn_34_2 = (var52[var21] << -1561913556) / var7;
                            break L3;
                          } else {
                            stackIn_34_0 = (int[]) ((Object) stackIn_33_0);
                            stackIn_34_1 = stackIn_33_1;
                            stackIn_34_2 = 4096;
                            break L3;
                          }
                        }
                        L4: {
                          stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                          stackIn_36_0 = (int[]) (var13);

                          stackIn_36_1 = var21;

                          if (var8 == 0) {
                            stackIn_37_0 = (int[]) ((Object) stackIn_36_0);
                            stackIn_37_1 = stackIn_36_1;
                            stackIn_37_2 = 4096;
                            break L4;
                          } else {
                            stackIn_37_0 = (int[]) ((Object) stackIn_36_0);
                            stackIn_37_1 = stackIn_36_1;
                            stackIn_37_2 = (var55[var21] << -748729812) / var8;
                            break L4;
                          }
                        }
                        L5: {
                          stackIn_37_0[stackIn_37_1] = stackIn_37_2;
                          stackIn_39_0 = (int[]) (var14);

                          stackIn_39_1 = var21;

                          if (0 == var9) {
                            stackIn_40_0 = (int[]) ((Object) stackIn_39_0);
                            stackIn_40_1 = stackIn_39_1;
                            stackIn_40_2 = 4096;
                            break L5;
                          } else {
                            stackIn_40_0 = (int[]) ((Object) stackIn_39_0);
                            stackIn_40_1 = stackIn_39_1;
                            stackIn_40_2 = (var57[var21] << -1226796372) / var9;
                            break L5;
                          }
                        }
                        stackIn_40_0[stackIn_40_1] = stackIn_40_2;
                        var21++;
                        continue L2;
                      }
                    }
                  } else {
                    if (-6 != (var21 ^ -1)) {
                      if (-7 == (var21 ^ -1)) {
                        var12 = var33[0];
                        var13 = var33[1];
                        var14 = var33[2];
                        var52 = var50[0];
                        var53 = var51[0];
                        var54 = var51[1];
                        var55 = var50[1];
                        var56 = var51[2];
                        var57 = var50[2];
                        var21 = 0;
                        L6: while (true) {
                          if (var21 >= hob.field_d) {
                            break L0;
                          } else {
                            L7: {
                              var7 = var53[var21];
                              var8 = var54[var21];
                              var9 = var56[var21];
                              stackIn_48_0 = (int[]) (var12);

                              stackIn_48_1 = var21;

                              if ((var7 ^ -1) > -2049) {
                                stackIn_49_0 = (int[]) ((Object) stackIn_48_0);
                                stackIn_49_1 = stackIn_48_1;
                                stackIn_49_2 = var7 * var52[var21] >> -163917333;
                                break L7;
                              } else {
                                stackIn_49_0 = (int[]) ((Object) stackIn_48_0);
                                stackIn_49_1 = stackIn_48_1;
                                stackIn_49_2 = -((-var7 + 4096) * (-var52[var21] + 4096) >> 900764651) + 4096;
                                break L7;
                              }
                            }
                            L8: {
                              stackIn_49_0[stackIn_49_1] = stackIn_49_2;
                              stackIn_51_0 = (int[]) (var13);

                              stackIn_51_1 = var21;

                              if (var8 >= 2048) {
                                stackIn_52_0 = (int[]) ((Object) stackIn_51_0);
                                stackIn_52_1 = stackIn_51_1;
                                stackIn_52_2 = 4096 - ((-var55[var21] + 4096) * (-var8 + 4096) >> -1212995317);
                                break L8;
                              } else {
                                stackIn_52_0 = (int[]) ((Object) stackIn_51_0);
                                stackIn_52_1 = stackIn_51_1;
                                stackIn_52_2 = var55[var21] * var8 >> -2044512565;
                                break L8;
                              }
                            }
                            L9: {
                              stackIn_52_0[stackIn_52_1] = stackIn_52_2;
                              stackIn_54_0 = (int[]) (var14);

                              stackIn_54_1 = var21;

                              if (var9 < 2048) {
                                stackIn_55_0 = (int[]) ((Object) stackIn_54_0);
                                stackIn_55_1 = stackIn_54_1;
                                stackIn_55_2 = var57[var21] * var9 >> 86099691;
                                break L9;
                              } else {
                                stackIn_55_0 = (int[]) ((Object) stackIn_54_0);
                                stackIn_55_1 = stackIn_54_1;
                                stackIn_55_2 = 4096 + -((4096 + -var57[var21]) * (-var9 + 4096) >> -891572405);
                                break L9;
                              }
                            }
                            stackIn_55_0[stackIn_55_1] = stackIn_55_2;
                            var21++;
                            continue L6;
                          }
                        }
                      } else {
                        if ((var21 ^ -1) != -8) {
                          if (-9 == (var21 ^ -1)) {
                            var12 = var33[0];
                            var13 = var33[1];
                            var14 = var33[2];
                            var52 = var50[0];
                            var53 = var51[0];
                            var54 = var51[1];
                            var55 = var50[1];
                            var56 = var51[2];
                            var57 = var50[2];
                            var21 = 0;
                            L10: while (true) {
                              if (hob.field_d <= var21) {
                                break L0;
                              } else {
                                L11: {
                                  var6 = var57[var21];
                                  var5 = var55[var21];
                                  var4 = var52[var21];
                                  stackIn_72_0 = (int[]) (var12);

                                  stackIn_72_1 = var21;

                                  if (var4 == 0) {
                                    stackIn_73_0 = (int[]) ((Object) stackIn_72_0);
                                    stackIn_73_1 = stackIn_72_1;
                                    stackIn_73_2 = 0;
                                    break L11;
                                  } else {
                                    stackIn_73_0 = (int[]) ((Object) stackIn_72_0);
                                    stackIn_73_1 = stackIn_72_1;
                                    stackIn_73_2 = -((4096 - var53[var21] << -204124724) / var4) + 4096;
                                    break L11;
                                  }
                                }
                                L12: {
                                  stackIn_73_0[stackIn_73_1] = stackIn_73_2;
                                  stackIn_75_0 = (int[]) (var13);

                                  stackIn_75_1 = var21;

                                  if (var5 != 0) {
                                    stackIn_76_0 = (int[]) ((Object) stackIn_75_0);
                                    stackIn_76_1 = stackIn_75_1;
                                    stackIn_76_2 = 4096 + -((4096 + -var54[var21] << -72745524) / var5);
                                    break L12;
                                  } else {
                                    stackIn_76_0 = (int[]) ((Object) stackIn_75_0);
                                    stackIn_76_1 = stackIn_75_1;
                                    stackIn_76_2 = 0;
                                    break L12;
                                  }
                                }
                                L13: {
                                  stackIn_76_0[stackIn_76_1] = stackIn_76_2;
                                  stackIn_78_0 = (int[]) (var14);

                                  stackIn_78_1 = var21;

                                  if (var6 == 0) {
                                    stackIn_79_0 = (int[]) ((Object) stackIn_78_0);
                                    stackIn_79_1 = stackIn_78_1;
                                    stackIn_79_2 = 0;
                                    break L13;
                                  } else {
                                    stackIn_79_0 = (int[]) ((Object) stackIn_78_0);
                                    stackIn_79_1 = stackIn_78_1;
                                    stackIn_79_2 = 4096 - (-var56[var21] + 4096 << 1182498316) / var6;
                                    break L13;
                                  }
                                }
                                stackIn_79_0[stackIn_79_1] = stackIn_79_2;
                                var21++;
                                continue L10;
                              }
                            }
                          } else {
                            if (9 != var21) {
                              if ((var21 ^ -1) != -11) {
                                if (-12 == (var21 ^ -1)) {
                                  var12 = var33[0];
                                  var13 = var33[1];
                                  var14 = var33[2];
                                  var52 = var50[0];
                                  var53 = var51[0];
                                  var54 = var51[1];
                                  var55 = var50[1];
                                  var56 = var51[2];
                                  var57 = var50[2];
                                  var21 = 0;
                                  L14: while (true) {
                                    if (var21 >= hob.field_d) {
                                      break L0;
                                    } else {
                                      L15: {
                                        var8 = var54[var21];
                                        var5 = var55[var21];
                                        var9 = var56[var21];
                                        var6 = var57[var21];
                                        var7 = var53[var21];
                                        var4 = var52[var21];
                                        stackIn_108_0 = (int[]) (var12);

                                        stackIn_108_1 = var21;

                                        if (var4 > var7) {
                                          stackIn_109_0 = (int[]) ((Object) stackIn_108_0);
                                          stackIn_109_1 = stackIn_108_1;
                                          stackIn_109_2 = -var7 + var4;
                                          break L15;
                                        } else {
                                          stackIn_109_0 = (int[]) ((Object) stackIn_108_0);
                                          stackIn_109_1 = stackIn_108_1;
                                          stackIn_109_2 = -var4 + var7;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        stackIn_109_0[stackIn_109_1] = stackIn_109_2;
                                        stackIn_111_0 = (int[]) (var13);

                                        stackIn_111_1 = var21;

                                        if (var5 <= var8) {
                                          stackIn_112_0 = (int[]) ((Object) stackIn_111_0);
                                          stackIn_112_1 = stackIn_111_1;
                                          stackIn_112_2 = -var5 + var8;
                                          break L16;
                                        } else {
                                          stackIn_112_0 = (int[]) ((Object) stackIn_111_0);
                                          stackIn_112_1 = stackIn_111_1;
                                          stackIn_112_2 = -var8 + var5;
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        stackIn_112_0[stackIn_112_1] = stackIn_112_2;
                                        stackIn_114_0 = (int[]) (var14);

                                        stackIn_114_1 = var21;

                                        if (var6 <= var9) {
                                          stackIn_115_0 = (int[]) ((Object) stackIn_114_0);
                                          stackIn_115_1 = stackIn_114_1;
                                          stackIn_115_2 = var9 - var6;
                                          break L17;
                                        } else {
                                          stackIn_115_0 = (int[]) ((Object) stackIn_114_0);
                                          stackIn_115_1 = stackIn_114_1;
                                          stackIn_115_2 = -var9 + var6;
                                          break L17;
                                        }
                                      }
                                      stackIn_115_0[stackIn_115_1] = stackIn_115_2;
                                      var21++;
                                      continue L14;
                                    }
                                  }
                                } else {
                                  if ((var21 ^ -1) == -13) {
                                    var12 = var33[0];
                                    var13 = var33[1];
                                    var14 = var33[2];
                                    var52 = var50[0];
                                    var53 = var51[0];
                                    var54 = var51[1];
                                    var55 = var50[1];
                                    var56 = var51[2];
                                    var57 = var50[2];
                                    var21 = 0;
                                    L18: while (true) {
                                      if (var21 >= hob.field_d) {
                                        break L0;
                                      } else {
                                        var4 = var52[var21];
                                        var7 = var53[var21];
                                        var8 = var54[var21];
                                        var9 = var56[var21];
                                        var6 = var57[var21];
                                        var5 = var55[var21];
                                        var12[var21] = var7 + (var4 - (var4 * var7 >> 1892005707));
                                        var13[var21] = var5 - -var8 - (var5 * var8 >> 1055695755);
                                        var14[var21] = -(var9 * var6 >> 331509963) + (var6 - -var9);
                                        var21++;
                                        continue L18;
                                      }
                                    }
                                  } else {
                                    break L0;
                                  }
                                }
                              } else {
                                var12 = var33[0];
                                var13 = var33[1];
                                var14 = var33[2];
                                var52 = var50[0];
                                var53 = var51[0];
                                var54 = var51[1];
                                var55 = var50[1];
                                var56 = var51[2];
                                var57 = var50[2];
                                var21 = 0;
                                L19: while (true) {
                                  if (hob.field_d <= var21) {
                                    break L0;
                                  } else {
                                    L20: {
                                      var7 = var53[var21];
                                      var4 = var52[var21];
                                      var9 = var56[var21];
                                      var5 = var55[var21];
                                      var8 = var54[var21];
                                      var6 = var57[var21];
                                      stackIn_96_0 = (int[]) (var12);

                                      stackIn_96_1 = var21;

                                      if (var7 < var4) {
                                        stackIn_97_0 = (int[]) ((Object) stackIn_96_0);
                                        stackIn_97_1 = stackIn_96_1;
                                        stackIn_97_2 = var4;
                                        break L20;
                                      } else {
                                        stackIn_97_0 = (int[]) ((Object) stackIn_96_0);
                                        stackIn_97_1 = stackIn_96_1;
                                        stackIn_97_2 = var7;
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      stackIn_97_0[stackIn_97_1] = stackIn_97_2;
                                      stackIn_99_0 = (int[]) (var13);

                                      stackIn_99_1 = var21;

                                      if (var8 < var5) {
                                        stackIn_100_0 = (int[]) ((Object) stackIn_99_0);
                                        stackIn_100_1 = stackIn_99_1;
                                        stackIn_100_2 = var5;
                                        break L21;
                                      } else {
                                        stackIn_100_0 = (int[]) ((Object) stackIn_99_0);
                                        stackIn_100_1 = stackIn_99_1;
                                        stackIn_100_2 = var8;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      stackIn_100_0[stackIn_100_1] = stackIn_100_2;
                                      stackIn_102_0 = (int[]) (var14);

                                      stackIn_102_1 = var21;

                                      if (var6 <= var9) {
                                        stackIn_103_0 = (int[]) ((Object) stackIn_102_0);
                                        stackIn_103_1 = stackIn_102_1;
                                        stackIn_103_2 = var9;
                                        break L22;
                                      } else {
                                        stackIn_103_0 = (int[]) ((Object) stackIn_102_0);
                                        stackIn_103_1 = stackIn_102_1;
                                        stackIn_103_2 = var6;
                                        break L22;
                                      }
                                    }
                                    stackIn_103_0[stackIn_103_1] = stackIn_103_2;
                                    var21++;
                                    continue L19;
                                  }
                                }
                              }
                            } else {
                              var12 = var33[0];
                              var13 = var33[1];
                              var14 = var33[2];
                              var52 = var50[0];
                              var53 = var51[0];
                              var54 = var51[1];
                              var55 = var50[1];
                              var56 = var51[2];
                              var57 = var50[2];
                              var21 = 0;
                              L23: while (true) {
                                if (hob.field_d <= var21) {
                                  break L0;
                                } else {
                                  L24: {
                                    var8 = var54[var21];
                                    var6 = var57[var21];
                                    var7 = var53[var21];
                                    var9 = var56[var21];
                                    var4 = var52[var21];
                                    var5 = var55[var21];
                                    stackIn_84_0 = (int[]) (var12);

                                    stackIn_84_1 = var21;

                                    if (var4 < var7) {
                                      stackIn_85_0 = (int[]) ((Object) stackIn_84_0);
                                      stackIn_85_1 = stackIn_84_1;
                                      stackIn_85_2 = var4;
                                      break L24;
                                    } else {
                                      stackIn_85_0 = (int[]) ((Object) stackIn_84_0);
                                      stackIn_85_1 = stackIn_84_1;
                                      stackIn_85_2 = var7;
                                      break L24;
                                    }
                                  }
                                  L25: {
                                    stackIn_85_0[stackIn_85_1] = stackIn_85_2;
                                    stackIn_87_0 = (int[]) (var13);

                                    stackIn_87_1 = var21;

                                    if (var5 >= var8) {
                                      stackIn_88_0 = (int[]) ((Object) stackIn_87_0);
                                      stackIn_88_1 = stackIn_87_1;
                                      stackIn_88_2 = var8;
                                      break L25;
                                    } else {
                                      stackIn_88_0 = (int[]) ((Object) stackIn_87_0);
                                      stackIn_88_1 = stackIn_87_1;
                                      stackIn_88_2 = var5;
                                      break L25;
                                    }
                                  }
                                  L26: {
                                    stackIn_88_0[stackIn_88_1] = stackIn_88_2;
                                    stackIn_90_0 = (int[]) (var14);

                                    stackIn_90_1 = var21;

                                    if (var9 <= var6) {
                                      stackIn_91_0 = (int[]) ((Object) stackIn_90_0);
                                      stackIn_91_1 = stackIn_90_1;
                                      stackIn_91_2 = var9;
                                      break L26;
                                    } else {
                                      stackIn_91_0 = (int[]) ((Object) stackIn_90_0);
                                      stackIn_91_1 = stackIn_90_1;
                                      stackIn_91_2 = var6;
                                      break L26;
                                    }
                                  }
                                  stackIn_91_0[stackIn_91_1] = stackIn_91_2;
                                  var21++;
                                  continue L23;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = var33[0];
                          var13 = var33[1];
                          var14 = var33[2];
                          var52 = var50[0];
                          var53 = var51[0];
                          var54 = var51[1];
                          var55 = var50[1];
                          var56 = var51[2];
                          var57 = var50[2];
                          var21 = 0;
                          L27: while (true) {
                            if (hob.field_d <= var21) {
                              break L0;
                            } else {
                              L28: {
                                var4 = var52[var21];
                                var6 = var57[var21];
                                var5 = var55[var21];
                                stackIn_60_0 = (int[]) (var12);

                                stackIn_60_1 = var21;

                                if ((var4 ^ -1) == -4097) {
                                  stackIn_61_0 = (int[]) ((Object) stackIn_60_0);
                                  stackIn_61_1 = stackIn_60_1;
                                  stackIn_61_2 = 4096;
                                  break L28;
                                } else {
                                  stackIn_61_0 = (int[]) ((Object) stackIn_60_0);
                                  stackIn_61_1 = stackIn_60_1;
                                  stackIn_61_2 = (var53[var21] << -1588175316) / (4096 + -var4);
                                  break L28;
                                }
                              }
                              L29: {
                                stackIn_61_0[stackIn_61_1] = stackIn_61_2;
                                stackIn_63_0 = (int[]) (var13);

                                stackIn_63_1 = var21;

                                if (-4097 == (var5 ^ -1)) {
                                  stackIn_64_0 = (int[]) ((Object) stackIn_63_0);
                                  stackIn_64_1 = stackIn_63_1;
                                  stackIn_64_2 = 4096;
                                  break L29;
                                } else {
                                  stackIn_64_0 = (int[]) ((Object) stackIn_63_0);
                                  stackIn_64_1 = stackIn_63_1;
                                  stackIn_64_2 = (var54[var21] << 1057702700) / (-var5 + 4096);
                                  break L29;
                                }
                              }
                              L30: {
                                stackIn_64_0[stackIn_64_1] = stackIn_64_2;
                                stackIn_66_0 = (int[]) (var14);

                                stackIn_66_1 = var21;

                                if (4096 == var6) {
                                  stackIn_67_0 = (int[]) ((Object) stackIn_66_0);
                                  stackIn_67_1 = stackIn_66_1;
                                  stackIn_67_2 = 4096;
                                  break L30;
                                } else {
                                  stackIn_67_0 = (int[]) ((Object) stackIn_66_0);
                                  stackIn_67_1 = stackIn_66_1;
                                  stackIn_67_2 = (var56[var21] << -1311322324) / (4096 + -var6);
                                  break L30;
                                }
                              }
                              stackIn_67_0[stackIn_67_1] = stackIn_67_2;
                              var21++;
                              continue L27;
                            }
                          }
                        }
                      }
                    } else {
                      var12 = var33[0];
                      var13 = var33[1];
                      var14 = var33[2];
                      var52 = var50[0];
                      var53 = var51[0];
                      var54 = var51[1];
                      var55 = var50[1];
                      var56 = var51[2];
                      var57 = var50[2];
                      var21 = 0;
                      L31: while (true) {
                        if (var21 >= hob.field_d) {
                          break L0;
                        } else {
                          var12[var21] = -((4096 + -var53[var21]) * (4096 + -var52[var21]) >> -1680948596) + 4096;
                          var13[var21] = -((-var54[var21] + 4096) * (4096 - var55[var21]) >> 482569004) + 4096;
                          var14[var21] = -((-var56[var21] + 4096) * (4096 + -var57[var21]) >> 1903422444) + 4096;
                          var21++;
                          continue L31;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = var33[0];
                var13 = var33[1];
                var14 = var33[2];
                var52 = var50[0];
                var53 = var51[0];
                var54 = var51[1];
                var55 = var50[1];
                var56 = var51[2];
                var57 = var50[2];
                var21 = 0;
                L32: while (true) {
                  if (hob.field_d <= var21) {
                    break L0;
                  } else {
                    var12[var21] = var52[var21] + -var53[var21];
                    var13[var21] = -var54[var21] + var55[var21];
                    var14[var21] = -var56[var21] + var57[var21];
                    var21++;
                    continue L32;
                  }
                }
              }
            } else {
              var12 = var33[0];
              var13 = var33[1];
              var14 = var33[2];
              var52 = var50[0];
              var53 = var51[0];
              var54 = var51[1];
              var55 = var50[1];
              var56 = var51[2];
              var57 = var50[2];
              var21 = 0;
              L33: while (true) {
                if (hob.field_d <= var21) {
                  break L0;
                } else {
                  var12[var21] = var52[var21] - -var53[var21];
                  var13[var21] = var54[var21] + var55[var21];
                  var14[var21] = var56[var21] + var57[var21];
                  var21++;
                  continue L33;
                }
              }
            }
          }
        }
        L34: {
          if (param0 == 255) {
            break L34;
          } else {
            this.field_i = 79;
            break L34;
          }
        }
        return var3;
    }

    static {
    }
}
