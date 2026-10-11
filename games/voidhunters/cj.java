/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends le {
    private int field_i;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param0;
          if (0 == var4_int) {
            this.field_i = param2.e((byte) -91);
          } else {
            if (var4_int == 1) {
              stackIn_7_1 = (param2.e((byte) -109) == 1);
              this.field_g = stackIn_7_1;
            }
          }
          if (param1 >= -60) {
            this.field_i = 37;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("cj.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_34_2 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_43_2 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_49_2 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_55_2 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_61_2 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_67_2 = 0;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
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
        int[] var11Lifetime1;
        var9 = VoidHunters.field_G;
        var11 = this.field_f.a((byte) 118, param0);
        var3 = var11;
        if (this.field_f.field_e) {
          var19 = this.a(0, param0, 255);
          var18 = this.a(1, param0, 255);
          var8 = this.field_i;
          if (1 == var8) {
            var11Lifetime1 = var3;
            for (var8 = 0; var8 < hob.field_d; var8++) {
              var11Lifetime1[var8] = var18[var8] + var19[var8];
            }
          } else {
            if (var8 == 2) {
              for (var8 = 0; var8 < hob.field_d; var8++) {
                var3[var8] = -var18[var8] + var19[var8];
              }
            } else {
              if (var8 == 3) {
                for (var8 = 0; var8 < hob.field_d; var8++) {
                  var3[var8] = var18[var8] * var19[var8] >> 12;
                }
              } else {
                if (4 == var8) {
                  for (var8 = 0; var8 < hob.field_d; var8++) {
                    var5 = var18[var8];
                    stackIn_33_0 = var3;
                    stackIn_33_1 = var8;
                    if (var5 != 0) {
                      stackIn_34_2 = (var19[var8] << 12) / var5;
                    } else {
                      stackIn_34_2 = 4096;
                    }
                    stackIn_33_0[stackIn_33_1] = stackIn_34_2;
                  }
                } else {
                  if (var8 == 5) {
                    for (var8 = 0; var8 < hob.field_d; var8++) {
                      var3[var8] = -((4096 - var19[var8]) * (4096 - var18[var8]) >> 12) + 4096;
                    }
                  } else {
                    if (var8 == 6) {
                      for (var8 = 0; hob.field_d > var8; var8++) {
                        var5 = var18[var8];
                        stackIn_42_0 = var3;
                        stackIn_42_1 = var8;
                        if (var5 >= 2048) {
                          stackIn_43_2 = 4096 - ((-var19[var8] + 4096) * (4096 - var5) >> 11);
                        } else {
                          stackIn_43_2 = var5 * var19[var8] >> 11;
                        }
                        stackIn_42_0[stackIn_42_1] = stackIn_43_2;
                      }
                    } else {
                      if (var8 == 7) {
                        for (var8 = 0; hob.field_d > var8; var8++) {
                          var4 = var19[var8];
                          stackIn_48_0 = var3;
                          stackIn_48_1 = var8;
                          if (var4 == 4096) {
                            stackIn_49_2 = 4096;
                          } else {
                            stackIn_49_2 = (var18[var8] << 12) / (-var4 + 4096);
                          }
                          stackIn_48_0[stackIn_48_1] = stackIn_49_2;
                        }
                      } else {
                        if (8 == var8) {
                          for (var8 = 0; hob.field_d > var8; var8++) {
                            var4 = var19[var8];
                            stackIn_54_0 = var3;
                            stackIn_54_1 = var8;
                            if (var4 != 0) {
                              stackIn_55_2 = -((-var18[var8] + 4096 << 12) / var4) + 4096;
                            } else {
                              stackIn_55_2 = 0;
                            }
                            stackIn_54_0[stackIn_54_1] = stackIn_55_2;
                          }
                        } else {
                          if (9 == var8) {
                            for (var8 = 0; hob.field_d > var8; var8++) {
                              var4 = var19[var8];
                              var5 = var18[var8];
                              stackIn_60_0 = var3;
                              stackIn_60_1 = var8;
                              if (var4 >= var5) {
                                stackIn_61_2 = var5;
                              } else {
                                stackIn_61_2 = var4;
                              }
                              stackIn_60_0[stackIn_60_1] = stackIn_61_2;
                            }
                          } else {
                            if (var8 == 10) {
                              for (var8 = 0; hob.field_d > var8; var8++) {
                                var4 = var19[var8];
                                var5 = var18[var8];
                                stackIn_66_0 = var3;
                                stackIn_66_1 = var8;
                                if (var4 > var5) {
                                  stackIn_67_2 = var4;
                                } else {
                                  stackIn_67_2 = var5;
                                }
                                stackIn_66_0[stackIn_66_1] = stackIn_67_2;
                              }
                            } else {
                              if (11 == var8) {
                                for (var8 = 0; var8 < hob.field_d; var8++) {
                                  var5 = var18[var8];
                                  var4 = var19[var8];
                                  stackIn_72_0 = var3;
                                  stackIn_72_1 = var8;
                                  if (var4 > var5) {
                                    stackIn_73_2 = var4 - var5;
                                  } else {
                                    stackIn_73_2 = var5 - var4;
                                  }
                                  stackIn_72_0[stackIn_72_1] = stackIn_73_2;
                                }
                              } else {
                                if (12 == var8) {
                                  for (var8 = 0; var8 < hob.field_d; var8++) {
                                    var4 = var19[var8];
                                    var5 = var18[var8];
                                    var3[var8] = -(var5 * var4 >> 11) + var5 + var4;
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
        }
        if (!param1) {
          var10 = (ds) null;
          this.a(-107, 21, (ds) null);
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
        int stackIn_34_2 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_37_2 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_40_2 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_49_2 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_52_2 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_55_2 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_61_2 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_64_2 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_67_2 = 0;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_73_2 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_76_2 = 0;
        int[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_79_2 = 0;
        int[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_85_2 = 0;
        int[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_88_2 = 0;
        int[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_91_2 = 0;
        int[] stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_97_2 = 0;
        int[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_100_2 = 0;
        int[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_103_2 = 0;
        int[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_109_2 = 0;
        int[] stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_112_2 = 0;
        int[] stackIn_114_0 = null;
        int stackIn_114_1 = 0;
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
        int[] var12Lifetime1;
        int[] var13Lifetime1;
        int[] var14Lifetime1;
        int[] var52Lifetime1;
        int[] var53Lifetime1;
        int[] var54Lifetime1;
        int[] var55Lifetime1;
        int[] var56Lifetime1;
        int[] var57Lifetime1;
        var22 = VoidHunters.field_G;
        var33 = this.field_d.a(param1, (byte) -112);
        var24 = var33;
        var23 = var24;
        var3 = var23;
        if (this.field_d.field_g) {
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
          if (var21 == 1) {
            var12Lifetime1 = var33[0];
            var13Lifetime1 = var33[1];
            var14Lifetime1 = var33[2];
            var52Lifetime1 = var50[0];
            var53Lifetime1 = var51[0];
            var54Lifetime1 = var51[1];
            var55Lifetime1 = var50[1];
            var56Lifetime1 = var51[2];
            var57Lifetime1 = var50[2];
            for (var21 = 0; hob.field_d > var21; var21++) {
              var12Lifetime1[var21] = var52Lifetime1[var21] + var53Lifetime1[var21];
              var13Lifetime1[var21] = var54Lifetime1[var21] + var55Lifetime1[var21];
              var14Lifetime1[var21] = var56Lifetime1[var21] + var57Lifetime1[var21];
            }
          } else {
            if (var21 == 2) {
              var12Lifetime1 = var33[0];
              var13Lifetime1 = var33[1];
              var14Lifetime1 = var33[2];
              var52Lifetime1 = var50[0];
              var53Lifetime1 = var51[0];
              var54Lifetime1 = var51[1];
              var55Lifetime1 = var50[1];
              var56Lifetime1 = var51[2];
              var57Lifetime1 = var50[2];
              for (var21 = 0; hob.field_d > var21; var21++) {
                var12Lifetime1[var21] = var52Lifetime1[var21] - var53Lifetime1[var21];
                var13Lifetime1[var21] = -var54Lifetime1[var21] + var55Lifetime1[var21];
                var14Lifetime1[var21] = -var56Lifetime1[var21] + var57Lifetime1[var21];
              }
            } else {
              if (var21 == 3) {
                var12Lifetime1 = var33[0];
                var13Lifetime1 = var33[1];
                var14Lifetime1 = var33[2];
                var52Lifetime1 = var50[0];
                var53Lifetime1 = var51[0];
                var54Lifetime1 = var51[1];
                var55Lifetime1 = var50[1];
                var56Lifetime1 = var51[2];
                var57Lifetime1 = var50[2];
                for (var21 = 0; hob.field_d > var21; var21++) {
                  var12Lifetime1[var21] = var52Lifetime1[var21] * var53Lifetime1[var21] >> 12;
                  var13Lifetime1[var21] = var55Lifetime1[var21] * var54Lifetime1[var21] >> 12;
                  var14Lifetime1[var21] = var57Lifetime1[var21] * var56Lifetime1[var21] >> 12;
                }
              } else {
                if (var21 == 4) {
                  var12Lifetime1 = var33[0];
                  var13Lifetime1 = var33[1];
                  var14Lifetime1 = var33[2];
                  var52Lifetime1 = var50[0];
                  var53Lifetime1 = var51[0];
                  var54Lifetime1 = var51[1];
                  var55Lifetime1 = var50[1];
                  var56Lifetime1 = var51[2];
                  var57Lifetime1 = var50[2];
                  for (var21 = 0; var21 < hob.field_d; var21++) {
                    var9 = var56Lifetime1[var21];
                    var8 = var54Lifetime1[var21];
                    var7 = var53Lifetime1[var21];
                    stackIn_33_0 = var12Lifetime1;
                    stackIn_33_1 = var21;
                    if (var7 != 0) {
                      stackIn_34_2 = (var52Lifetime1[var21] << 12) / var7;
                    } else {
                      stackIn_34_2 = 4096;
                    }
                    stackIn_33_0[stackIn_33_1] = stackIn_34_2;
                    stackIn_36_0 = var13Lifetime1;
                    stackIn_36_1 = var21;
                    if (var8 == 0) {
                      stackIn_37_2 = 4096;
                    } else {
                      stackIn_37_2 = (var55Lifetime1[var21] << 12) / var8;
                    }
                    stackIn_36_0[stackIn_36_1] = stackIn_37_2;
                    stackIn_39_0 = var14Lifetime1;
                    stackIn_39_1 = var21;
                    if (0 == var9) {
                      stackIn_40_2 = 4096;
                    } else {
                      stackIn_40_2 = (var57Lifetime1[var21] << 12) / var9;
                    }
                    stackIn_39_0[stackIn_39_1] = stackIn_40_2;
                  }
                } else {
                  if (var21 == 5) {
                    var12Lifetime1 = var33[0];
                    var13Lifetime1 = var33[1];
                    var14Lifetime1 = var33[2];
                    var52Lifetime1 = var50[0];
                    var53Lifetime1 = var51[0];
                    var54Lifetime1 = var51[1];
                    var55Lifetime1 = var50[1];
                    var56Lifetime1 = var51[2];
                    var57Lifetime1 = var50[2];
                    for (var21 = 0; var21 < hob.field_d; var21++) {
                      var12Lifetime1[var21] = -((4096 - var53Lifetime1[var21]) * (4096 - var52Lifetime1[var21]) >> 12) + 4096;
                      var13Lifetime1[var21] = -((-var54Lifetime1[var21] + 4096) * (4096 - var55Lifetime1[var21]) >> 12) + 4096;
                      var14Lifetime1[var21] = -((-var56Lifetime1[var21] + 4096) * (4096 - var57Lifetime1[var21]) >> 12) + 4096;
                    }
                  } else {
                    if (var21 == 6) {
                      var12Lifetime1 = var33[0];
                      var13Lifetime1 = var33[1];
                      var14Lifetime1 = var33[2];
                      var52Lifetime1 = var50[0];
                      var53Lifetime1 = var51[0];
                      var54Lifetime1 = var51[1];
                      var55Lifetime1 = var50[1];
                      var56Lifetime1 = var51[2];
                      var57Lifetime1 = var50[2];
                      for (var21 = 0; var21 < hob.field_d; var21++) {
                        var7 = var53Lifetime1[var21];
                        var8 = var54Lifetime1[var21];
                        var9 = var56Lifetime1[var21];
                        stackIn_48_0 = var12Lifetime1;
                        stackIn_48_1 = var21;
                        if (var7 < 2048) {
                          stackIn_49_2 = var7 * var52Lifetime1[var21] >> 11;
                        } else {
                          stackIn_49_2 = -((-var7 + 4096) * (-var52Lifetime1[var21] + 4096) >> 11) + 4096;
                        }
                        stackIn_48_0[stackIn_48_1] = stackIn_49_2;
                        stackIn_51_0 = var13Lifetime1;
                        stackIn_51_1 = var21;
                        if (var8 >= 2048) {
                          stackIn_52_2 = 4096 - ((-var55Lifetime1[var21] + 4096) * (-var8 + 4096) >> 11);
                        } else {
                          stackIn_52_2 = var55Lifetime1[var21] * var8 >> 11;
                        }
                        stackIn_51_0[stackIn_51_1] = stackIn_52_2;
                        stackIn_54_0 = var14Lifetime1;
                        stackIn_54_1 = var21;
                        if (var9 < 2048) {
                          stackIn_55_2 = var57Lifetime1[var21] * var9 >> 11;
                        } else {
                          stackIn_55_2 = 4096 - ((4096 - var57Lifetime1[var21]) * (-var9 + 4096) >> 11);
                        }
                        stackIn_54_0[stackIn_54_1] = stackIn_55_2;
                      }
                    } else {
                      if (var21 == 7) {
                        var12Lifetime1 = var33[0];
                        var13Lifetime1 = var33[1];
                        var14Lifetime1 = var33[2];
                        var52Lifetime1 = var50[0];
                        var53Lifetime1 = var51[0];
                        var54Lifetime1 = var51[1];
                        var55Lifetime1 = var50[1];
                        var56Lifetime1 = var51[2];
                        var57Lifetime1 = var50[2];
                        for (var21 = 0; hob.field_d > var21; var21++) {
                          var4 = var52Lifetime1[var21];
                          var6 = var57Lifetime1[var21];
                          var5 = var55Lifetime1[var21];
                          stackIn_60_0 = var12Lifetime1;
                          stackIn_60_1 = var21;
                          if (var4 == 4096) {
                            stackIn_61_2 = 4096;
                          } else {
                            stackIn_61_2 = (var53Lifetime1[var21] << 12) / (4096 - var4);
                          }
                          stackIn_60_0[stackIn_60_1] = stackIn_61_2;
                          stackIn_63_0 = var13Lifetime1;
                          stackIn_63_1 = var21;
                          if (var5 == 4096) {
                            stackIn_64_2 = 4096;
                          } else {
                            stackIn_64_2 = (var54Lifetime1[var21] << 12) / (-var5 + 4096);
                          }
                          stackIn_63_0[stackIn_63_1] = stackIn_64_2;
                          stackIn_66_0 = var14Lifetime1;
                          stackIn_66_1 = var21;
                          if (4096 == var6) {
                            stackIn_67_2 = 4096;
                          } else {
                            stackIn_67_2 = (var56Lifetime1[var21] << 12) / (4096 - var6);
                          }
                          stackIn_66_0[stackIn_66_1] = stackIn_67_2;
                        }
                      } else {
                        if (var21 == 8) {
                          var12Lifetime1 = var33[0];
                          var13Lifetime1 = var33[1];
                          var14Lifetime1 = var33[2];
                          var52Lifetime1 = var50[0];
                          var53Lifetime1 = var51[0];
                          var54Lifetime1 = var51[1];
                          var55Lifetime1 = var50[1];
                          var56Lifetime1 = var51[2];
                          var57Lifetime1 = var50[2];
                          for (var21 = 0; hob.field_d > var21; var21++) {
                            var6 = var57Lifetime1[var21];
                            var5 = var55Lifetime1[var21];
                            var4 = var52Lifetime1[var21];
                            stackIn_72_0 = var12Lifetime1;
                            stackIn_72_1 = var21;
                            if (var4 == 0) {
                              stackIn_73_2 = 0;
                            } else {
                              stackIn_73_2 = -((4096 - var53Lifetime1[var21] << 12) / var4) + 4096;
                            }
                            stackIn_72_0[stackIn_72_1] = stackIn_73_2;
                            stackIn_75_0 = var13Lifetime1;
                            stackIn_75_1 = var21;
                            if (var5 != 0) {
                              stackIn_76_2 = 4096 - (4096 - var54Lifetime1[var21] << 12) / var5;
                            } else {
                              stackIn_76_2 = 0;
                            }
                            stackIn_75_0[stackIn_75_1] = stackIn_76_2;
                            stackIn_78_0 = var14Lifetime1;
                            stackIn_78_1 = var21;
                            if (var6 == 0) {
                              stackIn_79_2 = 0;
                            } else {
                              stackIn_79_2 = 4096 - (-var56Lifetime1[var21] + 4096 << 12) / var6;
                            }
                            stackIn_78_0[stackIn_78_1] = stackIn_79_2;
                          }
                        } else {
                          if (9 == var21) {
                            var12Lifetime1 = var33[0];
                            var13Lifetime1 = var33[1];
                            var14Lifetime1 = var33[2];
                            var52Lifetime1 = var50[0];
                            var53Lifetime1 = var51[0];
                            var54Lifetime1 = var51[1];
                            var55Lifetime1 = var50[1];
                            var56Lifetime1 = var51[2];
                            var57Lifetime1 = var50[2];
                            for (var21 = 0; hob.field_d > var21; var21++) {
                              var8 = var54Lifetime1[var21];
                              var6 = var57Lifetime1[var21];
                              var7 = var53Lifetime1[var21];
                              var9 = var56Lifetime1[var21];
                              var4 = var52Lifetime1[var21];
                              var5 = var55Lifetime1[var21];
                              stackIn_84_0 = var12Lifetime1;
                              stackIn_84_1 = var21;
                              if (var4 < var7) {
                                stackIn_85_2 = var4;
                              } else {
                                stackIn_85_2 = var7;
                              }
                              stackIn_84_0[stackIn_84_1] = stackIn_85_2;
                              stackIn_87_0 = var13Lifetime1;
                              stackIn_87_1 = var21;
                              if (var5 >= var8) {
                                stackIn_88_2 = var8;
                              } else {
                                stackIn_88_2 = var5;
                              }
                              stackIn_87_0[stackIn_87_1] = stackIn_88_2;
                              stackIn_90_0 = var14Lifetime1;
                              stackIn_90_1 = var21;
                              if (var9 <= var6) {
                                stackIn_91_2 = var9;
                              } else {
                                stackIn_91_2 = var6;
                              }
                              stackIn_90_0[stackIn_90_1] = stackIn_91_2;
                            }
                          } else {
                            if (var21 == 10) {
                              var12Lifetime1 = var33[0];
                              var13Lifetime1 = var33[1];
                              var14Lifetime1 = var33[2];
                              var52Lifetime1 = var50[0];
                              var53Lifetime1 = var51[0];
                              var54Lifetime1 = var51[1];
                              var55Lifetime1 = var50[1];
                              var56Lifetime1 = var51[2];
                              var57Lifetime1 = var50[2];
                              for (var21 = 0; hob.field_d > var21; var21++) {
                                var7 = var53Lifetime1[var21];
                                var4 = var52Lifetime1[var21];
                                var9 = var56Lifetime1[var21];
                                var5 = var55Lifetime1[var21];
                                var8 = var54Lifetime1[var21];
                                var6 = var57Lifetime1[var21];
                                stackIn_96_0 = var12Lifetime1;
                                stackIn_96_1 = var21;
                                if (var7 < var4) {
                                  stackIn_97_2 = var4;
                                } else {
                                  stackIn_97_2 = var7;
                                }
                                stackIn_96_0[stackIn_96_1] = stackIn_97_2;
                                stackIn_99_0 = var13Lifetime1;
                                stackIn_99_1 = var21;
                                if (var8 < var5) {
                                  stackIn_100_2 = var5;
                                } else {
                                  stackIn_100_2 = var8;
                                }
                                stackIn_99_0[stackIn_99_1] = stackIn_100_2;
                                stackIn_102_0 = var14Lifetime1;
                                stackIn_102_1 = var21;
                                if (var6 <= var9) {
                                  stackIn_103_2 = var9;
                                } else {
                                  stackIn_103_2 = var6;
                                }
                                stackIn_102_0[stackIn_102_1] = stackIn_103_2;
                              }
                            } else {
                              if (var21 == 11) {
                                var12Lifetime1 = var33[0];
                                var13Lifetime1 = var33[1];
                                var14Lifetime1 = var33[2];
                                var52Lifetime1 = var50[0];
                                var53Lifetime1 = var51[0];
                                var54Lifetime1 = var51[1];
                                var55Lifetime1 = var50[1];
                                var56Lifetime1 = var51[2];
                                var57Lifetime1 = var50[2];
                                for (var21 = 0; var21 < hob.field_d; var21++) {
                                  var8 = var54Lifetime1[var21];
                                  var5 = var55Lifetime1[var21];
                                  var9 = var56Lifetime1[var21];
                                  var6 = var57Lifetime1[var21];
                                  var7 = var53Lifetime1[var21];
                                  var4 = var52Lifetime1[var21];
                                  stackIn_108_0 = var12Lifetime1;
                                  stackIn_108_1 = var21;
                                  if (var4 > var7) {
                                    stackIn_109_2 = -var7 + var4;
                                  } else {
                                    stackIn_109_2 = -var4 + var7;
                                  }
                                  stackIn_108_0[stackIn_108_1] = stackIn_109_2;
                                  stackIn_111_0 = var13Lifetime1;
                                  stackIn_111_1 = var21;
                                  if (var5 <= var8) {
                                    stackIn_112_2 = -var5 + var8;
                                  } else {
                                    stackIn_112_2 = -var8 + var5;
                                  }
                                  stackIn_111_0[stackIn_111_1] = stackIn_112_2;
                                  stackIn_114_0 = var14Lifetime1;
                                  stackIn_114_1 = var21;
                                  if (var6 <= var9) {
                                    stackIn_115_2 = var9 - var6;
                                  } else {
                                    stackIn_115_2 = -var9 + var6;
                                  }
                                  stackIn_114_0[stackIn_114_1] = stackIn_115_2;
                                }
                              } else {
                                if (var21 == 12) {
                                  var12Lifetime1 = var33[0];
                                  var13Lifetime1 = var33[1];
                                  var14Lifetime1 = var33[2];
                                  var52Lifetime1 = var50[0];
                                  var53Lifetime1 = var51[0];
                                  var54Lifetime1 = var51[1];
                                  var55Lifetime1 = var50[1];
                                  var56Lifetime1 = var51[2];
                                  var57Lifetime1 = var50[2];
                                  for (var21 = 0; var21 < hob.field_d; var21++) {
                                    var4 = var52Lifetime1[var21];
                                    var7 = var53Lifetime1[var21];
                                    var8 = var54Lifetime1[var21];
                                    var9 = var56Lifetime1[var21];
                                    var6 = var57Lifetime1[var21];
                                    var5 = var55Lifetime1[var21];
                                    var12Lifetime1[var21] = var7 + (var4 - (var4 * var7 >> 11));
                                    var13Lifetime1[var21] = var5 + var8 - (var5 * var8 >> 11);
                                    var14Lifetime1[var21] = -(var9 * var6 >> 11) + (var6 + var9);
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
        }
        if (param0 != 255) {
          this.field_i = 79;
        }
        return var3;
    }

    static {
    }
}
