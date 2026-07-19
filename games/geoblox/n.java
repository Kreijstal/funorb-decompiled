/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends q {
    private dj field_i;
    static vd[] field_k;
    static tf field_l;
    static int field_j;

    n(dj param0, dj param1) {
        super(param0);
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 0) {
            n.c((byte) 89);
        }
    }

    final static dm[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        dm[] var10 = null;
        dm[] var11_ref_dm__ = null;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_44_0 = 0;
        byte stackOut_52_0 = 0;
        var15 = Geoblox.field_C;
        var9 = param1 + param7 + param8;
        var10 = new dm[]{new dm(var9, var9), new dm(param3, var9), new dm(var9, var9), new dm(var9, param3), new dm(64, 64), new dm(var9, param3), new dm(var9, var9), new dm(param3, var9), new dm(var9, var9)};
        var11_ref_dm__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_dm__.length) {
                break L2;
              } else {
                var13 = var11_ref_dm__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var13.field_v.length <= var14) {
                          break L5;
                        } else {
                          var13.field_v[var14] = param5;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (var11 >= param8) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var9 <= var12) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_v[var12 + (var9 - var11 + -1) * var9] = param6;
                        var10[8].field_v[var12 + (-1 + -var11 + var9) * var9] = param6;
                        var10[2].field_v[var12 * var9 + -var11 + var9 + -1] = param6;
                        var10[8].field_v[-var11 - 1 - (-var9 - var9 * var12)] = param6;
                        var12++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          continue L8;
                        }
                      }
                    }
                    continue L6;
                  }
                }
              }
            }
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = var11;
              stackOut_23_1 = param8;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 >= stackIn_24_1) {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var9 <= var12) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_v[var12 - -(var11 * var9)] = param2;
                        var10[0].field_v[var11 + var12 * var9] = param2;
                        stackOut_27_0 = -var11 + var9 ^ -1;
                        stackOut_27_1 = var12 ^ -1;
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                var11 = stackIn_31_0;
                L13: while (true) {
                  L14: {
                    if (var11 >= param3) {
                      stackOut_41_0 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      break L14;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_42_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var15 != 0) {
                        break L14;
                      } else {
                        var12 = stackIn_34_0;
                        L15: while (true) {
                          L16: {
                            if (param8 <= var12) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_v[param3 * (var9 - var12 - 1) + var11] = param6;
                              var10[5].field_v[-1 + (var9 - var12 + var11 * var9)] = param6;
                              var10[1].field_v[param3 * var12 - -var11] = param2;
                              var10[3].field_v[var12 + var9 * var11] = param2;
                              var12++;
                              if (var15 != 0) {
                                break L16;
                              } else {
                                continue L15;
                              }
                            }
                          }
                          continue L13;
                        }
                      }
                    }
                  }
                  var11 = stackIn_42_0;
                  L17: while (true) {
                    L18: {
                      L19: {
                        if (var11 >= param3 >> 362369793) {
                          break L19;
                        } else {
                          stackOut_44_0 = 0;
                          stackIn_53_0 = stackOut_44_0;
                          stackIn_45_0 = stackOut_44_0;
                          if (var15 != 0) {
                            break L18;
                          } else {
                            var12 = stackIn_45_0;
                            L20: while (true) {
                              L21: {
                                if (param1 <= var12) {
                                  var11++;
                                  break L21;
                                } else {
                                  var10[1].field_v[param3 * (-1 + (-var12 + var9)) - -var11] = param0;
                                  var10[3].field_v[-1 - -var9 + (-var12 + var9 * var11)] = param0;
                                  var10[7].field_v[var11 + param3 * var12] = param0;
                                  var10[5].field_v[var9 * var11 - -var12] = param0;
                                  var12++;
                                  if (var15 != 0) {
                                    break L21;
                                  } else {
                                    continue L20;
                                  }
                                }
                              }
                              if (var15 == 0) {
                                continue L17;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      stackOut_52_0 = param4;
                      stackIn_53_0 = stackOut_52_0;
                      break L18;
                    }
                    L22: {
                      if (stackIn_53_0 == 1) {
                        break L22;
                      } else {
                        n.g(5);
                        break L22;
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        if (!(Geoblox.field_y == null)) {
            Geoblox.field_y.h((byte) -104);
        }
        vk.field_d = new hi();
        int var1 = 32 / ((param0 - 43) / 47);
        hk.field_C.b(vk.field_d, -106);
    }

    final lh a(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        lh stackIn_2_0 = null;
        lh stackIn_9_0 = null;
        lh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_8_0 = null;
        lh stackOut_12_0 = null;
        lh stackOut_11_0 = null;
        lh stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == -257) {
              L1: {
                if (this.field_i instanceof nl) {
                  var3 = ((nl) ((Object) this.field_i)).a((byte) -106);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.a((byte) -105) != kk.field_w) {
                      stackOut_8_0 = si.field_m;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param1.equals(this.field_i.field_s)) {
                  stackOut_12_0 = si.field_m;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = kk.field_w;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackOut_1_0 = (lh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("n.D(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final String b(int param0, String param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 422) {
                break L1;
              } else {
                field_l = (tf) null;
                break L1;
              }
            }
            L2: {
              if (!(this.field_i instanceof nl)) {
                break L2;
              } else {
                var3 = ((nl) ((Object) this.field_i)).a((byte) -118);
                if (var3 == null) {
                  break L2;
                } else {
                  L3: {
                    if (var3.a((byte) -105) != kk.field_w) {
                      break L3;
                    } else {
                      if (!param1.equals(this.field_i.field_s)) {
                        stackOut_7_0 = sj.field_b;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_9_0 = var3.c(-21666);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            if (!param1.equals(this.field_i.field_s)) {
              stackOut_13_0 = sj.field_b;
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("n.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static sl d(byte param0) {
        int var1 = 0;
        if (uf.field_l == kd.field_b) {
          throw new IllegalStateException();
        } else {
          var1 = 28 % ((-79 - param0) / 44);
          if (va.field_e != kd.field_b) {
            return null;
          } else {
            kd.field_b = uf.field_l;
            return dl.field_a;
          }
        }
    }

    static {
        field_l = new tf();
    }
}
