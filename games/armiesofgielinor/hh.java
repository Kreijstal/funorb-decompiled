/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static String field_a;
    private em field_k;
    private int field_h;
    int field_b;
    static wk field_d;
    static String field_j;
    static nc field_i;
    static int field_c;
    static int[] field_e;
    private int field_g;
    static wk field_f;

    public static void b(int param0) {
        field_d = null;
        field_i = null;
        field_j = null;
        field_f = null;
        field_e = null;
        if (param0 != 16) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        vs.a(256, wn.field_jb);
        if (param0 < 113) {
            field_d = (wk) null;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 == -66) {
          if (this.field_k == null) {
            this.field_g = 127;
            return;
          } else {
            L0: {
              if (!this.field_k.c(param0 ^ 65)) {
                break L0;
              } else {
                this.field_k.b(17);
                break L0;
              }
            }
            L1: {
              var2 = this.field_k.field_a;
              var3 = this.field_k.field_f;
              var3 = var3 >> -1953891327;
              if (var2 > var3) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_10_0;
              if (var4 == 0) {
                stackOut_12_0 = -var3 + var2;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = var2;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_13_0;
              if (var4 != 0) {
                stackOut_15_0 = this.field_h;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = this.field_b;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_16_0;
              if (var4 != 0) {
                stackOut_18_0 = this.field_b;
                stackIn_19_0 = stackOut_18_0;
                break L4;
              } else {
                stackOut_17_0 = this.field_h;
                stackIn_19_0 = stackOut_17_0;
                break L4;
              }
            }
            var6 = stackIn_19_0;
            this.field_g = var5 - -(var2 * (-var5 + var6) / var3);
            if (this.field_g >= this.field_h) {
              if (this.field_b < this.field_g) {
                this.field_g = this.field_b;
                return;
              } else {
                return;
              }
            } else {
              this.field_g = this.field_h;
              if (this.field_b >= this.field_g) {
                return;
              } else {
                this.field_g = this.field_b;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, um param2, boolean param3) {
        if (param0 != -16147) {
            return;
        }
        try {
            lk.field_e.a(256, !param3 ? true : false, param2, -1, param1, 1000000);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "hh.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param3 >= 0) {
            break L0;
          } else {
            param3 = 100;
            break L0;
          }
        }
        L1: {
          if (-1 < (param0 ^ -1)) {
            param0 = 32;
            break L1;
          } else {
            if ((param0 ^ -1) >= -256) {
              break L1;
            } else {
              param0 = 32;
              this.field_k = new em(param3);
              if (param1 >= 117) {
                this.field_h = param0;
                if (param2 >= 0) {
                  if ((param2 ^ -1) < -256) {
                    param2 = 224;
                    this.field_b = param2;
                    this.field_g = this.field_b + this.field_h >> 1097606465;
                    return;
                  } else {
                    L2: {
                      if (param2 < param0) {
                        param2 = 224;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    this.field_b = param2;
                    this.field_g = this.field_b + this.field_h >> 1097606465;
                    return;
                  }
                } else {
                  param2 = 224;
                  this.field_b = param2;
                  this.field_g = this.field_b + this.field_h >> 1097606465;
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        this.field_k = new em(param3);
        if (param1 >= 117) {
          this.field_h = param0;
          if (param2 >= 0) {
            if ((param2 ^ -1) < -256) {
              param2 = 224;
              this.field_b = param2;
              this.field_g = this.field_b + this.field_h >> 1097606465;
              return;
            } else {
              L3: {
                if (param2 < param0) {
                  param2 = 224;
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_b = param2;
              this.field_g = this.field_b + this.field_h >> 1097606465;
              return;
            }
          } else {
            param2 = 224;
            this.field_b = param2;
            this.field_g = this.field_b + this.field_h >> 1097606465;
            return;
          }
        } else {
          return;
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        StringBuilder discarded$73 = null;
        StringBuilder discarded$74 = null;
        StringBuilder discarded$75 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_25_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (0 != param2) {
              if (-2 == (param2 ^ -1)) {
                var10 = param0[param3];
                var4 = var10;
                if (var4 == null) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              } else {
                var4_int = param3 + param2;
                var5 = param1;
                var6_int = param3;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param3;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_25_0 = var6.toString();
                        stackIn_26_0 = stackOut_25_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            discarded$73 = var6.append("null");
                            break L3;
                          } else {
                            discarded$74 = var6.append(var8);
                            if (var9 == 0) {
                              break L3;
                            } else {
                              discarded$75 = var6.append("null");
                              break L3;
                            }
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      L5: {
                        var7_ref_CharSequence = param0[var6_int];
                        if (var7_ref_CharSequence != null) {
                          break L5;
                        } else {
                          var5 += 4;
                          if (var9 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var5 = var5 + var7_ref_CharSequence.length();
                      break L4;
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4_ref);
            stackOut_27_1 = new StringBuilder().append("hh.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_26_0;
          }
        }
    }

    final static void a(au param0, boolean param1, vh param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        au stackIn_4_0 = null;
        au stackIn_5_0 = null;
        au stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        au stackIn_7_0 = null;
        au stackIn_8_0 = null;
        au stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        au stackIn_10_0 = null;
        au stackIn_11_0 = null;
        au stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        au stackIn_13_0 = null;
        au stackIn_14_0 = null;
        au stackIn_15_0 = null;
        au stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        au stackIn_17_0 = null;
        au stackIn_18_0 = null;
        au stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        au stackIn_20_0 = null;
        au stackIn_21_0 = null;
        au stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        au stackOut_3_0 = null;
        au stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        au stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        au stackOut_6_0 = null;
        au stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        au stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        au stackOut_9_0 = null;
        au stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        au stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        au stackOut_12_0 = null;
        au stackOut_13_0 = null;
        au stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        au stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        au stackOut_16_0 = null;
        au stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        au stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        au stackOut_19_0 = null;
        au stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        au stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                param0.field_Ub = param2.k(0);
                break L1;
              }
            }
            L2: {
              param0.field_nc = param2.k(0);
              param0.field_Tb = param2.k(0);
              var4_int = param2.k(0);
              stackOut_3_0 = (au) (param0);
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (0 == (128 & var4_int)) {
                stackOut_5_0 = (au) ((Object) stackIn_5_0);
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = (au) ((Object) stackIn_4_0);
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              stackIn_6_0.field_uc = stackIn_6_1 != 0;
              stackOut_6_0 = (au) (param0);
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (-1 == (var4_int & 64 ^ -1)) {
                stackOut_8_0 = (au) ((Object) stackIn_8_0);
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = (au) ((Object) stackIn_7_0);
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              stackIn_9_0.field_kc = stackIn_9_1 != 0;
              stackOut_9_0 = (au) (param0);
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if ((16 & var4_int) != 0) {
                stackOut_11_0 = (au) ((Object) stackIn_11_0);
                stackOut_11_1 = 2;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L4;
              } else {
                stackOut_10_0 = (au) ((Object) stackIn_10_0);
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L4;
              }
            }
            L5: {
              L6: {
                stackIn_12_0.field_ac = stackIn_12_1;
                stackOut_12_0 = (au) (param0);
                stackIn_15_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (!param0.field_uc) {
                  break L6;
                } else {
                  stackOut_13_0 = (au) ((Object) stackIn_13_0);
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (param0.field_Ub >= param0.field_nc) {
                    break L6;
                  } else {
                    stackOut_14_0 = (au) ((Object) stackIn_14_0);
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L5;
                  }
                }
              }
              stackOut_15_0 = (au) ((Object) stackIn_15_0);
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L5;
            }
            L7: {
              stackIn_16_0.field_Sb = stackIn_16_1 != 0;
              stackOut_16_0 = (au) (param0);
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (0 == (8 & var4_int)) {
                stackOut_18_0 = (au) ((Object) stackIn_18_0);
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = (au) ((Object) stackIn_17_0);
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            L8: {
              stackIn_19_0.field_tc = stackIn_19_1 != 0;
              stackOut_19_0 = (au) (param0);
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (-1 == (32 & var4_int ^ -1)) {
                stackOut_21_0 = (au) ((Object) stackIn_21_0);
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L8;
              } else {
                stackOut_20_0 = (au) ((Object) stackIn_20_0);
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_vc = stackIn_22_1 != 0;
              if (0 == (var4_int & 4)) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L9;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_25_0;
              if ((var4_int & 2) == 0) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L10;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_28_0;
              param2.a(0, param0.field_pc.length, 0, param0.field_pc);
              param0.field_qc = param2.e((byte) -104);
              param0.field_Mb = vi.b(39) - (long)param2.i(1);
              if (var5 == 0) {
                param0.field_bc = -1;
                break L11;
              } else {
                param0.field_bc = param2.i(1);
                if (var9 == 0) {
                  break L11;
                } else {
                  param0.field_bc = -1;
                  break L11;
                }
              }
            }
            param0.field_dc = param2.j((byte) -2);
            var7 = param2.field_q;
            if (param3 >= 73) {
              L12: {
                L13: {
                  param0.field_rc = param2.g(1);
                  if (var6 != 0) {
                    break L13;
                  } else {
                    param0.field_jc = null;
                    if (var9 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                param0.field_jc = new String[param0.field_Ub];
                param2.field_q = var7;
                var8 = 0;
                L14: while (true) {
                  if (var8 >= param0.field_Ub) {
                    break L12;
                  } else {
                    param0.field_jc[var8] = param2.g(1);
                    var8++;
                    if (var9 == 0) {
                      continue L14;
                    } else {
                      return;
                    }
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
          L15: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var4);
            stackOut_45_1 = new StringBuilder().append("hh.E(");
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
              break L15;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L15;
            }
          }
          L16: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L16;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int discarded$10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -121) {
          L0: {
            discarded$10 = this.c(103);
            if (this.field_k.field_a > this.field_k.field_f >> -586726463) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_k.field_a > this.field_k.field_f >> -586726463) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int c(int param0) {
        if (param0 == -1953891327) {
          if (this.field_g >= 0) {
            if (-256 > (this.field_g ^ -1)) {
              return 127;
            } else {
              return this.field_g;
            }
          } else {
            return 127;
          }
        } else {
          return 4;
        }
    }

    hh(int param0, int param1, int param2) {
        this.a(param0, (byte) 127, param1, param2);
    }

    static {
        field_a = "You have 1 unread message!";
        field_j = "Confirm Email:";
        field_e = new int[]{0, 1, 2, 4, 8, 31, 16, 0, 0};
        field_c = 0;
    }
}
