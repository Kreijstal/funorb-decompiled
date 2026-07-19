/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends wda {
    private boolean field_o;
    private int field_p;
    private int field_q;
    private int field_s;
    static ko field_r;

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 75, param1, this.field_p);
        if (param0 != 0) {
          return -7;
        } else {
          param1 = fs.a((byte) 117, param1, this.field_q);
          param1 = fs.a((byte) 121, param1, this.field_s);
          return param1;
        }
    }

    final static cn a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        if (param4 > -75) {
            return (cn) null;
        }
        return nt.a(param1, param3, 5200, param2, false, param0);
    }

    final static eua a(jea param0, jea param1, jea param2, int[] param3, boolean param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        eua[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        wua var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        eua stackIn_3_0 = null;
        Object stackIn_12_0 = null;
        eua stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        eua stackOut_13_0 = null;
        eua stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = param3.length;
            var6 = new String[var5_int];
            var14 = new char[var5_int];
            var13 = var14;
            var7 = var13;
            if (!param4) {
              var8 = new eua[var5_int];
              var9 = 49;
              try {
                L1: {
                  var10_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var10_int >= var5_int) {
                        break L3;
                      } else {
                        var11 = qu.field_a.a(false, param3[var10_int]);
                        var6[var10_int] = var11.b((byte) -5);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        if (var12 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    break L1;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10 = (Exception) (Object) decompiledCaughtException;
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (eua) ((Object) stackIn_12_0);
              }
              stackOut_13_0 = new eua(0L, param2, param0, param1, var8, param3, var6, var14);
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (eua) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("sa.M(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            return 68;
        }
        return 10;
    }

    final static void a(boolean param0, byte param1) {
        eua discarded$2 = null;
        eua discarded$3 = null;
        int[] var3 = null;
        L0: {
          if (-1 <= (mla.field_a ^ -1)) {
            break L0;
          } else {
            if (uv.field_o) {
              bea.d(0, 0, bea.field_g, era.field_e.field_A);
              wo.field_k.b(108, param0);
              break L0;
            } else {
              if (param1 <= 6) {
                var3 = (int[]) null;
                discarded$2 = sa.a((jea) null, (jea) null, (jea) null, (int[]) null, true);
                if ((gt.field_a ^ -1) >= -1) {
                  if (-1 <= (fp.field_e ^ -1)) {
                    return;
                  } else {
                    L1: {
                      if (tla.field_e) {
                        bea.d(0, 0, bea.field_g, era.field_e.field_A);
                        hf.field_a.b(85, param0);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  }
                } else {
                  L2: {
                    if (tla.field_e) {
                      bea.d(0, 0, bea.field_g, era.field_e.field_A);
                      hf.field_a.b(85, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                if ((gt.field_a ^ -1) >= -1) {
                  if (-1 > (fp.field_e ^ -1)) {
                    L3: {
                      if (tla.field_e) {
                        bea.d(0, 0, bea.field_g, era.field_e.field_A);
                        hf.field_a.b(85, param0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    if (tla.field_e) {
                      bea.d(0, 0, bea.field_g, era.field_e.field_A);
                      hf.field_a.b(85, param0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
        if (param1 > 6) {
          if ((gt.field_a ^ -1) >= -1) {
            if (-1 > (fp.field_e ^ -1)) {
              L5: {
                if (tla.field_e) {
                  bea.d(0, 0, bea.field_g, era.field_e.field_A);
                  hf.field_a.b(85, param0);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L6: {
              if (tla.field_e) {
                bea.d(0, 0, bea.field_g, era.field_e.field_A);
                hf.field_a.b(85, param0);
                break L6;
              } else {
                break L6;
              }
            }
            return;
          }
        } else {
          var3 = (int[]) null;
          discarded$3 = sa.a((jea) null, (jea) null, (jea) null, (int[]) null, true);
          if ((gt.field_a ^ -1) >= -1) {
            if (-1 > (fp.field_e ^ -1)) {
              L7: {
                if (tla.field_e) {
                  bea.d(0, 0, bea.field_g, era.field_e.field_A);
                  hf.field_a.b(85, param0);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L8: {
              if (tla.field_e) {
                bea.d(0, 0, bea.field_g, era.field_e.field_A);
                hf.field_a.b(85, param0);
                break L8;
              } else {
                break L8;
              }
            }
            return;
          }
        }
    }

    final void a(kh param0, byte param1) {
        super.a(param0, (byte) -85);
        param0.a((byte) 2, dqa.a(true, this.field_p >> -1314422288, 12), 12);
        param0.a((byte) -126, dqa.a(true, this.field_q >> -422712784, 12), 12);
        if (param1 > -78) {
            return;
        }
        try {
            param0.a((byte) 79, this.field_o ? 1 : 0, 1);
            param0.a((byte) 56, dqa.a(true, this.field_s, 12), 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        if (param0 == 1) {
            return;
        }
        field_r = (ko) null;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          L1: {
            var9 = TombRacer.field_G ? 1 : 0;
            var2 = this.field_n.s(25745) + -this.d((byte) -57);
            var5 = -32 / ((-69 - param0) / 42);
            var3 = this.field_n.e(false) + -this.a(false);
            if (this.field_o) {
              break L1;
            } else {
              var6 = this.field_q - var3 >> 632890442;
              var4 = this.field_p + -var2 >> -750115894;
              if (var9 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var6 = -this.field_q + var3 >> -1113489110;
          var4 = -this.field_p + var2 >> 1187368682;
          break L0;
        }
        var7 = tia.a(var6, var4, -29543) - tia.a(-256, 0, -29543);
        var7 = var7 * -1;
        L2: while (true) {
          if ((var7 ^ -1) <= -1) {
            var8 = var7 - this.field_n.g(-25787);
            if (0 < this.field_s) {
              L3: while (true) {
                if ((var8 ^ -1) <= 4095) {
                  L4: while (true) {
                    if (var8 > 4096) {
                      var8 -= 8192;
                      if (var9 != 0) {
                        var8 = this.field_s;
                        this.field_n.c(false, var8);
                        return;
                      } else {
                        continue L4;
                      }
                    } else {
                      L5: {
                        if (this.field_s < var8) {
                          break L5;
                        } else {
                          if (var8 < -this.field_s) {
                            var8 = -this.field_s;
                            if (var9 == 0) {
                              this.field_n.c(false, var8);
                              return;
                            } else {
                              break L5;
                            }
                          } else {
                            this.field_n.c(false, var8);
                            return;
                          }
                        }
                      }
                      var8 = this.field_s;
                      this.field_n.c(false, var8);
                      return;
                    }
                  }
                } else {
                  var8 += 8192;
                  if (var9 == 0) {
                    continue L3;
                  } else {
                    L6: {
                      if (this.field_s < var8) {
                        break L6;
                      } else {
                        if (var8 < -this.field_s) {
                          var8 = -this.field_s;
                          if (var9 == 0) {
                            this.field_n.c(false, var8);
                            return;
                          } else {
                            break L6;
                          }
                        } else {
                          this.field_n.c(false, var8);
                          return;
                        }
                      }
                    }
                    var8 = this.field_s;
                    this.field_n.c(false, var8);
                    return;
                  }
                }
              }
            } else {
              this.field_n.c(false, var8);
              return;
            }
          } else {
            var7 += 8192;
            continue L2;
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        if (param0 < -43) {
            return;
        }
        field_r = (ko) null;
    }

    final void a(int param0, fsa param1) {
        cn discarded$0 = null;
        try {
            if (param0 <= 35) {
                discarded$0 = sa.a(true, 47, true, -59, (byte) -121);
            }
            super.a(110, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        this.field_o = true;
        try {
          L0: {
            L1: {
              this.field_p = bla.a(true, 12, param1.b((byte) 44, 12)) << -986938096;
              this.field_q = bla.a(true, 12, param1.b((byte) 44, 12)) << 525027408;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((sa) (this)).field_o = stackIn_4_1 != 0;
            if (-4 < (this.c(true).field_E ^ -1)) {
              this.field_s = 0;
              return;
            } else {
              this.field_s = bla.a(true, 12, param1.b((byte) 44, 12));
              if (!TombRacer.field_G) {
                break L0;
              } else {
                this.field_s = 0;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("sa.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    static {
        field_r = new ko(1);
    }
}
