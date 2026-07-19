/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends ao implements ai {
    private int field_Q;
    private boolean field_K;
    private int field_C;
    private boolean field_A;
    private wp field_F;
    private wp field_M;
    private wp field_N;
    private int field_R;
    private jh field_H;
    static int field_I;
    private wp field_J;
    int field_G;
    private int field_O;
    private wp field_P;
    private boolean field_B;
    private int field_L;
    int field_D;
    int field_E;

    final void a(int param0, int param1) {
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 0) {
          if (-1 >= (param1 ^ -1)) {
            if (-65537 > (param1 ^ -1)) {
              this.field_D = 65536;
              if (var4 != 0) {
                this.field_D = 0;
                this.f(-1840);
                return;
              } else {
                this.f(-1840);
                return;
              }
            } else {
              this.field_D = param1;
              if (var4 != 0) {
                this.field_D = 65536;
                if (var4 == 0) {
                  this.f(-1840);
                  return;
                } else {
                  this.field_D = 0;
                  this.f(-1840);
                  return;
                }
              } else {
                this.f(-1840);
                return;
              }
            }
          } else {
            this.field_D = 0;
            this.f(-1840);
            return;
          }
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        var3 = 106 / ((-25 - param0) / 52);
        this.b(param1, (byte) 122);
        if (!(this.field_o instanceof nc)) {
          return;
        } else {
          ((nc) ((Object) this.field_o)).a((vo) (this), -6772, this.field_D, this.field_G);
          return;
        }
    }

    final static long a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        long stackIn_28_0 = 0L;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        long stackOut_27_0 = 0L;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var5 >= var4) {
                      break L4;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      var9 = var6 ^ -1;
                      var8 = -66;
                      if (var7 != 0) {
                        if (var8 == var9) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          L6: {
                            if (var8 < var9) {
                              break L6;
                            } else {
                              if (90 < var6) {
                                break L6;
                              } else {
                                var2_long = var2_long + (long)(var6 + -64);
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if (var6 < 97) {
                              break L7;
                            } else {
                              if (var6 > 122) {
                                break L7;
                              } else {
                                var2_long = var2_long + (long)(1 + (var6 - 97));
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var6 < 48) {
                            break L5;
                          } else {
                            if (var6 > 57) {
                              break L5;
                            } else {
                              var2_long = var2_long + (long)(-48 + (27 + var6));
                              break L5;
                            }
                          }
                        }
                        if (var2_long >= 177917621779460413L) {
                          break L4;
                        } else {
                          var5++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var2_long % 37L != 0L) {
                          break L10;
                        } else {
                          stackOut_21_0 = (var2_long < 0L ? -1 : (var2_long == 0L ? 0 : 1));
                          stackIn_25_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var7 != 0) {
                            break L9;
                          } else {
                            if (stackIn_22_0 == 0) {
                              break L10;
                            } else {
                              var2_long = var2_long / 37L;
                              if (var7 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      stackOut_24_0 = param1;
                      stackIn_25_0 = stackOut_24_0;
                      break L9;
                    }
                    if (stackIn_25_0 == 7441) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                field_I = -23;
                break L2;
              }
              stackOut_27_0 = var2_long;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("vo.AA(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    final static bo a(boolean param0, byte[] param1) {
        bo var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        Object stackIn_2_0 = null;
        bo stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bo stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var3 = (CharSequence) null;
                  break L1;
                }
              }
              var2 = new bo(param1, er.field_h, av.field_C, vg.field_k, we.field_B, iv.field_l, ag.field_d);
              tl.a((byte) -60);
              stackOut_5_0 = (bo) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("vo.CA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bo) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    private final void b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = -36 / ((param1 - 50) / 41);
        if (0 <= param0) {
          if ((param0 ^ -1) >= -65537) {
            this.field_G = param0;
            if (var4 != 0) {
              this.field_G = 65536;
              this.e((byte) 100);
              return;
            } else {
              this.e((byte) 100);
              return;
            }
          } else {
            this.field_G = 65536;
            this.e((byte) 100);
            return;
          }
        } else {
          this.field_G = 0;
          if (var4 != 0) {
            if ((param0 ^ -1) >= -65537) {
              this.field_G = param0;
              if (var4 != 0) {
                this.field_G = 65536;
                this.e((byte) 100);
                return;
              } else {
                this.e((byte) 100);
                return;
              }
            } else {
              this.field_G = 65536;
              this.e((byte) 100);
              return;
            }
          } else {
            this.e((byte) 100);
            return;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (param0 != -121) {
          L0: {
            this.a(100, false);
            if (this.field_N != null) {
              stackOut_13_0 = this.field_N.field_r - -this.field_N.field_q;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_12_0 = this.field_P.field_r;
              stackIn_14_0 = stackOut_12_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_14_0;
            if (null == this.field_J) {
              stackOut_16_0 = this.field_P.field_q + this.field_P.field_r - this.field_H.field_q;
              stackIn_17_0 = stackOut_16_0;
              break L1;
            } else {
              stackOut_15_0 = this.field_J.field_r - this.field_H.field_q;
              stackIn_17_0 = stackOut_15_0;
              break L1;
            }
          }
          L2: {
            var3 = stackIn_17_0;
            stackOut_17_0 = this;
            stackIn_19_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (var3 <= var2) {
              stackOut_19_0 = this;
              stackOut_19_1 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L2;
            } else {
              stackOut_18_0 = this;
              stackOut_18_1 = (this.field_H.field_r + -var2 << 1984602960) / (var3 + -var2);
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L2;
            }
          }
          this.b(stackIn_20_1, (byte) -6);
          return;
        } else {
          L3: {
            if (this.field_N != null) {
              stackOut_3_0 = this.field_N.field_r - -this.field_N.field_q;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = this.field_P.field_r;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            var2 = stackIn_4_0;
            if (null == this.field_J) {
              stackOut_6_0 = this.field_P.field_q + this.field_P.field_r - this.field_H.field_q;
              stackIn_7_0 = stackOut_6_0;
              break L4;
            } else {
              stackOut_5_0 = this.field_J.field_r - this.field_H.field_q;
              stackIn_7_0 = stackOut_5_0;
              break L4;
            }
          }
          L5: {
            var3 = stackIn_7_0;
            stackOut_7_0 = this;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (var3 <= var2) {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L5;
            } else {
              stackOut_8_0 = this;
              stackOut_8_1 = (this.field_H.field_r + -var2 << 1984602960) / (var3 + -var2);
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L5;
            }
          }
          this.b(stackIn_10_1, (byte) -6);
          return;
        }
    }

    final static ki b(int param0, int param1) {
        ki stackIn_5_0 = null;
        ki stackOut_3_0 = null;
        if (param1 == -1) {
          if (ha.field_g == null) {
            if (param0 == -1) {
              return ha.field_g;
            } else {
              return ng.a(1, -117, true, param0, false, true);
            }
          } else {
            stackOut_3_0 = ha.field_g;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0;
          }
        } else {
          return (ki) null;
        }
    }

    private final void a(int param0, byte param1) {
        this.a(0, param0);
        if (param1 == -125) {
          if (!(this.field_o instanceof nc)) {
            return;
          } else {
            ((nc) ((Object) this.field_o)).a((vo) (this), -6772, this.field_D, this.field_D);
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 < -1) {
              L1: {
                L2: {
                  if (param1 <= 0) {
                    break L2;
                  } else {
                    if (128 > param1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1 < 160) {
                    break L3;
                  } else {
                    if (255 >= param1) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (param1 != 0) {
                  var6 = uk.field_lb;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var6.length <= var3) {
                          break L6;
                        } else {
                          var4 = var6[var3];
                          stackOut_16_0 = param1 ^ -1;
                          stackIn_23_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var5 != 0) {
                            break L5;
                          } else {
                            if (stackIn_17_0 == (var4 ^ -1)) {
                              stackOut_19_0 = 1;
                              stackIn_20_0 = stackOut_19_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var3++;
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      break L5;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  return false;
                }
              }
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "vo.V(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    final boolean a(pk param0, byte param1) {
        jh var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
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
              if (param1 == 61) {
                break L1;
              } else {
                this.b(-73, (byte) 11);
                break L1;
              }
            }
            var3 = this.field_H;
            if (var3 == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (((pk) ((Object) var3)).a(param0, (byte) 61)) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("vo.Q(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        bo discarded$1 = null;
        RuntimeException var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                var8 = (byte[]) null;
                discarded$1 = vo.a(true, (byte[]) null);
                break L1;
              }
            }
            L2: {
              if (-2 != (param0 ^ -1)) {
                break L2;
              } else {
                if (this.field_B) {
                  L3: {
                    if (!this.field_K) {
                      break L3;
                    } else {
                      if (this.field_F != param2) {
                        break L3;
                      } else {
                        this.a(-this.field_E + this.field_D, (byte) -125);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (!this.field_K) {
                      break L4;
                    } else {
                      if (param2 != this.field_M) {
                        break L4;
                      } else {
                        this.a(this.field_E + this.field_D, (byte) -125);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (!this.field_A) {
                        break L6;
                      } else {
                        if (param2 == this.field_N) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (!this.field_A) {
                      break L2;
                    } else {
                      if (this.field_J != param2) {
                        break L2;
                      } else {
                        this.a((byte) 48, this.field_Q + this.field_G);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  this.a((byte) -78, this.field_G + -this.field_Q);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6);
            stackOut_23_1 = new StringBuilder().append("vo.C(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        L0: {
          if (this.field_F == null) {
            stackOut_2_0 = this.field_P.field_v;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_F.field_v - -this.field_F.field_p;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (null == this.field_M) {
            stackOut_5_0 = -this.field_H.field_p + this.field_P.field_v + this.field_P.field_p;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = this.field_M.field_v + -this.field_H.field_p;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          stackOut_6_0 = this;
          stackOut_6_1 = 0;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (var3 > var2) {
            stackOut_8_0 = this;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = (this.field_H.field_v + -var2 << -2066408880) / (-var2 + var3);
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 0;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        this.a(stackIn_9_1, stackIn_9_2);
        if (param0 == -2066408880) {
          return;
        } else {
          this.field_H = (jh) null;
          return;
        }
    }

    private final void a(boolean param0, int param1) {
        wp stackIn_1_0 = null;
        wp stackIn_2_0 = null;
        wp stackIn_4_0 = null;
        wp stackIn_8_0 = null;
        wp stackIn_9_0 = null;
        wp stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wp stackIn_14_0 = null;
        wp stackIn_15_0 = null;
        wp stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        wp stackIn_18_0 = null;
        wp stackIn_19_0 = null;
        wp stackIn_20_0 = null;
        wp stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        wp stackIn_25_0 = null;
        wp stackIn_26_0 = null;
        wp stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        wp stackIn_31_0 = null;
        wp stackIn_32_0 = null;
        wp stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        wp stackIn_39_0 = null;
        wp stackIn_40_0 = null;
        wp stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        wp stackIn_44_0 = null;
        wp stackIn_45_0 = null;
        wp stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        wp stackIn_49_0 = null;
        wp stackIn_50_0 = null;
        wp stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        wp stackIn_54_0 = null;
        wp stackIn_55_0 = null;
        wp stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        wp stackIn_58_0 = null;
        wp stackIn_59_0 = null;
        wp stackIn_62_0 = null;
        wp stackIn_63_0 = null;
        wp stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        wp stackIn_68_0 = null;
        wp stackIn_69_0 = null;
        wp stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        wp stackIn_76_0 = null;
        wp stackIn_77_0 = null;
        wp stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        wp stackIn_81_0 = null;
        wp stackIn_82_0 = null;
        wp stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        wp stackIn_86_0 = null;
        wp stackIn_87_0 = null;
        wp stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        wp stackIn_91_0 = null;
        wp stackIn_92_0 = null;
        wp stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        wp stackIn_99_0 = null;
        wp stackIn_100_0 = null;
        wp stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        wp stackIn_104_0 = null;
        wp stackIn_105_0 = null;
        wp stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        wp stackIn_109_0 = null;
        wp stackIn_110_0 = null;
        wp stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        wp stackIn_118_0 = null;
        wp stackIn_119_0 = null;
        wp stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        wp stackIn_123_0 = null;
        wp stackIn_124_0 = null;
        wp stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        wp stackIn_128_0 = null;
        wp stackIn_129_0 = null;
        wp stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        wp stackOut_0_0 = null;
        wp stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        wp stackOut_1_0 = null;
        wp stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        wp stackOut_3_0 = null;
        wp stackOut_18_0 = null;
        wp stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        wp stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        wp stackOut_7_0 = null;
        wp stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        wp stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        wp stackOut_13_0 = null;
        wp stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        wp stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        wp stackOut_43_0 = null;
        wp stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        wp stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        wp stackOut_48_0 = null;
        wp stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        wp stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        wp stackOut_38_0 = null;
        wp stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        wp stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        wp stackOut_24_0 = null;
        wp stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        wp stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        wp stackOut_30_0 = null;
        wp stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        wp stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        wp stackOut_57_0 = null;
        wp stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        wp stackOut_58_0 = null;
        wp stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        wp stackOut_80_0 = null;
        wp stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        wp stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        wp stackOut_85_0 = null;
        wp stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        wp stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        wp stackOut_75_0 = null;
        wp stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        wp stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        wp stackOut_61_0 = null;
        wp stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        wp stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        wp stackOut_67_0 = null;
        wp stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        wp stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        wp stackOut_122_0 = null;
        wp stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        wp stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        wp stackOut_127_0 = null;
        wp stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        wp stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        wp stackOut_117_0 = null;
        wp stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        wp stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        wp stackOut_103_0 = null;
        wp stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        wp stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        wp stackOut_108_0 = null;
        wp stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        wp stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        wp stackOut_98_0 = null;
        wp stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        wp stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        L0: {
          stackOut_0_0 = this.field_P;
          stackIn_54_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0) {
            stackOut_54_0 = (wp) ((Object) stackIn_54_0);
            stackOut_54_1 = 1;
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            break L0;
          } else {
            stackOut_1_0 = (wp) ((Object) stackIn_1_0);
            stackIn_55_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!this.field_K) {
              stackOut_55_0 = (wp) ((Object) stackIn_55_0);
              stackOut_55_1 = 0;
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              break L0;
            } else {
              L1: {
                stackIn_2_0.field_x = true;
                if (!(this.field_H.field_y instanceof wp)) {
                  break L1;
                } else {
                  stackOut_3_0 = (wp) ((Object) this.field_H.field_y);
                  stackIn_18_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!param0) {
                    L2: {
                      stackOut_18_0 = (wp) ((Object) stackIn_18_0);
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (!this.field_K) {
                        stackOut_20_0 = (wp) ((Object) stackIn_20_0);
                        stackOut_20_1 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L2;
                      } else {
                        stackOut_19_0 = (wp) ((Object) stackIn_19_0);
                        stackOut_19_1 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        break L2;
                      }
                    }
                    stackIn_21_0.field_x = stackIn_21_1 != 0;
                    break L1;
                  } else {
                    L3: {
                      stackIn_4_0.field_x = true;
                      if (param1 <= -126) {
                        break L3;
                      } else {
                        this.field_O = -95;
                        break L3;
                      }
                    }
                    L4: {
                      if (this.field_N == null) {
                        break L4;
                      } else {
                        L5: {
                          stackOut_7_0 = this.field_N;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (!param0) {
                            stackOut_9_0 = (wp) ((Object) stackIn_9_0);
                            stackOut_9_1 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            break L5;
                          } else {
                            stackOut_8_0 = (wp) ((Object) stackIn_8_0);
                            stackOut_8_1 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            break L5;
                          }
                        }
                        stackIn_10_0.field_x = stackIn_10_1 != 0;
                        break L4;
                      }
                    }
                    L6: {
                      if (null != this.field_J) {
                        L7: {
                          stackOut_13_0 = this.field_J;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (!param0) {
                            stackOut_15_0 = (wp) ((Object) stackIn_15_0);
                            stackOut_15_1 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L7;
                          } else {
                            stackOut_14_0 = (wp) ((Object) stackIn_14_0);
                            stackOut_14_1 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            break L7;
                          }
                        }
                        stackIn_16_0.field_x = stackIn_16_1 != 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    return;
                  }
                }
              }
              if (param1 > -126) {
                this.field_O = -95;
                if (this.field_N != null) {
                  L8: {
                    stackOut_43_0 = this.field_N;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (!param0) {
                      stackOut_45_0 = (wp) ((Object) stackIn_45_0);
                      stackOut_45_1 = 0;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      break L8;
                    } else {
                      stackOut_44_0 = (wp) ((Object) stackIn_44_0);
                      stackOut_44_1 = 1;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      break L8;
                    }
                  }
                  L9: {
                    stackIn_46_0.field_x = stackIn_46_1 != 0;
                    if (null != this.field_J) {
                      L10: {
                        stackOut_48_0 = this.field_J;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (!param0) {
                          stackOut_50_0 = (wp) ((Object) stackIn_50_0);
                          stackOut_50_1 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L10;
                        } else {
                          stackOut_49_0 = (wp) ((Object) stackIn_49_0);
                          stackOut_49_1 = 1;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_51_1 = stackOut_49_1;
                          break L10;
                        }
                      }
                      stackIn_51_0.field_x = stackIn_51_1 != 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                } else {
                  L11: {
                    if (null != this.field_J) {
                      L12: {
                        stackOut_38_0 = this.field_J;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_39_0 = stackOut_38_0;
                        if (!param0) {
                          stackOut_40_0 = (wp) ((Object) stackIn_40_0);
                          stackOut_40_1 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          break L12;
                        } else {
                          stackOut_39_0 = (wp) ((Object) stackIn_39_0);
                          stackOut_39_1 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          break L12;
                        }
                      }
                      stackIn_41_0.field_x = stackIn_41_1 != 0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if (this.field_N == null) {
                    break L13;
                  } else {
                    L14: {
                      stackOut_24_0 = this.field_N;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if (!param0) {
                        stackOut_26_0 = (wp) ((Object) stackIn_26_0);
                        stackOut_26_1 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L14;
                      } else {
                        stackOut_25_0 = (wp) ((Object) stackIn_25_0);
                        stackOut_25_1 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        stackIn_27_1 = stackOut_25_1;
                        break L14;
                      }
                    }
                    stackIn_27_0.field_x = stackIn_27_1 != 0;
                    break L13;
                  }
                }
                L15: {
                  if (null != this.field_J) {
                    L16: {
                      stackOut_30_0 = this.field_J;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (!param0) {
                        stackOut_32_0 = (wp) ((Object) stackIn_32_0);
                        stackOut_32_1 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        break L16;
                      } else {
                        stackOut_31_0 = (wp) ((Object) stackIn_31_0);
                        stackOut_31_1 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        break L16;
                      }
                    }
                    stackIn_33_0.field_x = stackIn_33_1 != 0;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              }
            }
          }
        }
        L17: {
          stackIn_56_0.field_x = stackIn_56_1 != 0;
          if (!(this.field_H.field_y instanceof wp)) {
            break L17;
          } else {
            L18: {
              stackOut_57_0 = (wp) ((Object) this.field_H.field_y);
              stackIn_91_0 = stackOut_57_0;
              stackIn_58_0 = stackOut_57_0;
              if (param0) {
                stackOut_91_0 = (wp) ((Object) stackIn_91_0);
                stackOut_91_1 = 1;
                stackIn_93_0 = stackOut_91_0;
                stackIn_93_1 = stackOut_91_1;
                break L18;
              } else {
                stackOut_58_0 = (wp) ((Object) stackIn_58_0);
                stackIn_92_0 = stackOut_58_0;
                stackIn_59_0 = stackOut_58_0;
                if (!this.field_K) {
                  stackOut_92_0 = (wp) ((Object) stackIn_92_0);
                  stackOut_92_1 = 0;
                  stackIn_93_0 = stackOut_92_0;
                  stackIn_93_1 = stackOut_92_1;
                  break L18;
                } else {
                  stackIn_59_0.field_x = true;
                  if (param1 <= -126) {
                    if (this.field_N != null) {
                      L19: {
                        stackOut_80_0 = this.field_N;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_81_0 = stackOut_80_0;
                        if (!param0) {
                          stackOut_82_0 = (wp) ((Object) stackIn_82_0);
                          stackOut_82_1 = 0;
                          stackIn_83_0 = stackOut_82_0;
                          stackIn_83_1 = stackOut_82_1;
                          break L19;
                        } else {
                          stackOut_81_0 = (wp) ((Object) stackIn_81_0);
                          stackOut_81_1 = 1;
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_83_1 = stackOut_81_1;
                          break L19;
                        }
                      }
                      L20: {
                        stackIn_83_0.field_x = stackIn_83_1 != 0;
                        if (null != this.field_J) {
                          L21: {
                            stackOut_85_0 = this.field_J;
                            stackIn_87_0 = stackOut_85_0;
                            stackIn_86_0 = stackOut_85_0;
                            if (!param0) {
                              stackOut_87_0 = (wp) ((Object) stackIn_87_0);
                              stackOut_87_1 = 0;
                              stackIn_88_0 = stackOut_87_0;
                              stackIn_88_1 = stackOut_87_1;
                              break L21;
                            } else {
                              stackOut_86_0 = (wp) ((Object) stackIn_86_0);
                              stackOut_86_1 = 1;
                              stackIn_88_0 = stackOut_86_0;
                              stackIn_88_1 = stackOut_86_1;
                              break L21;
                            }
                          }
                          stackIn_88_0.field_x = stackIn_88_1 != 0;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      return;
                    } else {
                      L22: {
                        if (null != this.field_J) {
                          L23: {
                            stackOut_75_0 = this.field_J;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_76_0 = stackOut_75_0;
                            if (!param0) {
                              stackOut_77_0 = (wp) ((Object) stackIn_77_0);
                              stackOut_77_1 = 0;
                              stackIn_78_0 = stackOut_77_0;
                              stackIn_78_1 = stackOut_77_1;
                              break L23;
                            } else {
                              stackOut_76_0 = (wp) ((Object) stackIn_76_0);
                              stackOut_76_1 = 1;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_78_1 = stackOut_76_1;
                              break L23;
                            }
                          }
                          stackIn_78_0.field_x = stackIn_78_1 != 0;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      return;
                    }
                  } else {
                    L24: {
                      this.field_O = -95;
                      if (this.field_N == null) {
                        break L24;
                      } else {
                        L25: {
                          stackOut_61_0 = this.field_N;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_62_0 = stackOut_61_0;
                          if (!param0) {
                            stackOut_63_0 = (wp) ((Object) stackIn_63_0);
                            stackOut_63_1 = 0;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            break L25;
                          } else {
                            stackOut_62_0 = (wp) ((Object) stackIn_62_0);
                            stackOut_62_1 = 1;
                            stackIn_64_0 = stackOut_62_0;
                            stackIn_64_1 = stackOut_62_1;
                            break L25;
                          }
                        }
                        stackIn_64_0.field_x = stackIn_64_1 != 0;
                        break L24;
                      }
                    }
                    L26: {
                      if (null != this.field_J) {
                        L27: {
                          stackOut_67_0 = this.field_J;
                          stackIn_69_0 = stackOut_67_0;
                          stackIn_68_0 = stackOut_67_0;
                          if (!param0) {
                            stackOut_69_0 = (wp) ((Object) stackIn_69_0);
                            stackOut_69_1 = 0;
                            stackIn_70_0 = stackOut_69_0;
                            stackIn_70_1 = stackOut_69_1;
                            break L27;
                          } else {
                            stackOut_68_0 = (wp) ((Object) stackIn_68_0);
                            stackOut_68_1 = 1;
                            stackIn_70_0 = stackOut_68_0;
                            stackIn_70_1 = stackOut_68_1;
                            break L27;
                          }
                        }
                        stackIn_70_0.field_x = stackIn_70_1 != 0;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    return;
                  }
                }
              }
            }
            stackIn_93_0.field_x = stackIn_93_1 != 0;
            break L17;
          }
        }
        if (param1 <= -126) {
          if (this.field_N != null) {
            L28: {
              stackOut_122_0 = this.field_N;
              stackIn_124_0 = stackOut_122_0;
              stackIn_123_0 = stackOut_122_0;
              if (!param0) {
                stackOut_124_0 = (wp) ((Object) stackIn_124_0);
                stackOut_124_1 = 0;
                stackIn_125_0 = stackOut_124_0;
                stackIn_125_1 = stackOut_124_1;
                break L28;
              } else {
                stackOut_123_0 = (wp) ((Object) stackIn_123_0);
                stackOut_123_1 = 1;
                stackIn_125_0 = stackOut_123_0;
                stackIn_125_1 = stackOut_123_1;
                break L28;
              }
            }
            L29: {
              stackIn_125_0.field_x = stackIn_125_1 != 0;
              if (null != this.field_J) {
                L30: {
                  stackOut_127_0 = this.field_J;
                  stackIn_129_0 = stackOut_127_0;
                  stackIn_128_0 = stackOut_127_0;
                  if (!param0) {
                    stackOut_129_0 = (wp) ((Object) stackIn_129_0);
                    stackOut_129_1 = 0;
                    stackIn_130_0 = stackOut_129_0;
                    stackIn_130_1 = stackOut_129_1;
                    break L30;
                  } else {
                    stackOut_128_0 = (wp) ((Object) stackIn_128_0);
                    stackOut_128_1 = 1;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_130_1 = stackOut_128_1;
                    break L30;
                  }
                }
                stackIn_130_0.field_x = stackIn_130_1 != 0;
                break L29;
              } else {
                break L29;
              }
            }
            return;
          } else {
            L31: {
              if (null != this.field_J) {
                L32: {
                  stackOut_117_0 = this.field_J;
                  stackIn_119_0 = stackOut_117_0;
                  stackIn_118_0 = stackOut_117_0;
                  if (!param0) {
                    stackOut_119_0 = (wp) ((Object) stackIn_119_0);
                    stackOut_119_1 = 0;
                    stackIn_120_0 = stackOut_119_0;
                    stackIn_120_1 = stackOut_119_1;
                    break L32;
                  } else {
                    stackOut_118_0 = (wp) ((Object) stackIn_118_0);
                    stackOut_118_1 = 1;
                    stackIn_120_0 = stackOut_118_0;
                    stackIn_120_1 = stackOut_118_1;
                    break L32;
                  }
                }
                stackIn_120_0.field_x = stackIn_120_1 != 0;
                break L31;
              } else {
                break L31;
              }
            }
            return;
          }
        } else {
          this.field_O = -95;
          if (this.field_N != null) {
            L33: {
              stackOut_103_0 = this.field_N;
              stackIn_105_0 = stackOut_103_0;
              stackIn_104_0 = stackOut_103_0;
              if (!param0) {
                stackOut_105_0 = (wp) ((Object) stackIn_105_0);
                stackOut_105_1 = 0;
                stackIn_106_0 = stackOut_105_0;
                stackIn_106_1 = stackOut_105_1;
                break L33;
              } else {
                stackOut_104_0 = (wp) ((Object) stackIn_104_0);
                stackOut_104_1 = 1;
                stackIn_106_0 = stackOut_104_0;
                stackIn_106_1 = stackOut_104_1;
                break L33;
              }
            }
            L34: {
              stackIn_106_0.field_x = stackIn_106_1 != 0;
              if (null != this.field_J) {
                L35: {
                  stackOut_108_0 = this.field_J;
                  stackIn_110_0 = stackOut_108_0;
                  stackIn_109_0 = stackOut_108_0;
                  if (!param0) {
                    stackOut_110_0 = (wp) ((Object) stackIn_110_0);
                    stackOut_110_1 = 0;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    break L35;
                  } else {
                    stackOut_109_0 = (wp) ((Object) stackIn_109_0);
                    stackOut_109_1 = 1;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_111_1 = stackOut_109_1;
                    break L35;
                  }
                }
                stackIn_111_0.field_x = stackIn_111_1 != 0;
                break L34;
              } else {
                break L34;
              }
            }
            return;
          } else {
            L36: {
              if (null != this.field_J) {
                L37: {
                  stackOut_98_0 = this.field_J;
                  stackIn_100_0 = stackOut_98_0;
                  stackIn_99_0 = stackOut_98_0;
                  if (!param0) {
                    stackOut_100_0 = (wp) ((Object) stackIn_100_0);
                    stackOut_100_1 = 0;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    break L37;
                  } else {
                    stackOut_99_0 = (wp) ((Object) stackIn_99_0);
                    stackOut_99_1 = 1;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    break L37;
                  }
                }
                stackIn_101_0.field_x = stackIn_101_1 != 0;
                break L36;
              } else {
                break L36;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, -123, param2, param3);
                var5_int = 4 / ((param1 - -25) / 45);
                if (!(this.field_H.field_y instanceof wp)) {
                  break L2;
                } else {
                  if (!((wp) ((Object) this.field_H.field_y)).field_x) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-2 == (this.field_H.field_l ^ -1)) {
                L3: {
                  L4: {
                    if (!this.field_A) {
                      break L4;
                    } else {
                      L5: {
                        var6 = this.field_G;
                        this.a((byte) -121);
                        if (var6 == this.field_G) {
                          break L5;
                        } else {
                          if (!(this.field_o instanceof nc)) {
                            break L5;
                          } else {
                            ((nc) ((Object) this.field_o)).a(this.field_G, this.field_G, (vo) (this), false);
                            break L5;
                          }
                        }
                      }
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.e((byte) 110);
                  break L3;
                }
                L6: {
                  if (!this.field_K) {
                    break L6;
                  } else {
                    L7: {
                      var6 = this.field_D;
                      this.g(-2066408880);
                      if (this.field_D == var6) {
                        break L7;
                      } else {
                        if (!(this.field_o instanceof nc)) {
                          break L7;
                        } else {
                          ((nc) ((Object) this.field_o)).a(this.field_D, this.field_G, (vo) (this), false);
                          break L7;
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L6;
                    }
                  }
                }
                this.f(-1840);
                break L1;
              } else {
                break L1;
              }
            }
            L8: {
              if (!this.field_P.field_x) {
                break L8;
              } else {
                if (this.field_P.field_B == 1) {
                  L9: {
                    if (this.field_K) {
                      break L9;
                    } else {
                      if (this.field_A) {
                        L10: {
                          if (ko.field_p <= this.field_H.field_r + param0 - -(this.field_H.field_q >> -9263039)) {
                            break L10;
                          } else {
                            this.a((byte) -79, this.field_G - -this.field_C);
                            if (var8 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.a((byte) 116, this.field_G + -this.field_C);
                        if (var8 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (!this.field_A) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          var6 = -(this.field_H.field_q >> 990352385) + (-this.field_H.field_r + -this.field_r + -param0 + ko.field_p);
                          var7 = -param3 + (pi.field_e - this.field_v) - (this.field_H.field_v - -(this.field_H.field_p >> 1781112321));
                          if (Math.abs(var7) > Math.abs(var6)) {
                            break L13;
                          } else {
                            L14: {
                              if (var6 <= 0) {
                                break L14;
                              } else {
                                this.a((byte) 27, this.field_C + this.field_G);
                                if (var8 == 0) {
                                  break L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            this.a((byte) -109, -this.field_C + this.field_G);
                            if (var8 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L15: {
                          if (-1 > (var7 ^ -1)) {
                            break L15;
                          } else {
                            this.a(this.field_D + -this.field_O, (byte) -125);
                            if (var8 == 0) {
                              break L12;
                            } else {
                              break L15;
                            }
                          }
                        }
                        this.a(this.field_O + this.field_D, (byte) -125);
                        break L12;
                      }
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L16: {
                    if ((this.field_H.field_p >> 751265217) + param3 - -this.field_H.field_v < pi.field_e) {
                      break L16;
                    } else {
                      this.a(this.field_D + -this.field_O, (byte) -125);
                      if (var8 == 0) {
                        break L8;
                      } else {
                        break L16;
                      }
                    }
                  }
                  this.a(this.field_O + this.field_D, (byte) -125);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var5);
            stackOut_46_1 = new StringBuilder().append("vo.U(").append(param0).append(',').append(param1).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L17;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L17;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param3 + ')');
        }
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (null != this.field_N) {
            stackOut_2_0 = this.field_N.field_r + this.field_N.field_q;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_P.field_r;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0 <= 89) {
          return;
        } else {
          L1: {
            if (null != this.field_J) {
              stackOut_6_0 = this.field_J.field_r + -this.field_H.field_q;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = this.field_P.field_r - -this.field_P.field_q + -this.field_H.field_q;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          this.field_H.field_r = ((-var2 + var3) * this.field_G >> 1769537168) + var2;
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 34 % ((59 - param2) / 45);
        if (param0 >= param1) {
          this.field_H.a(91, this.field_H.field_r, this.field_H.field_v, this.field_H.field_p, this.field_P.field_q);
          this.a(false, -127);
          if (Sumoblitz.field_L) {
            L0: {
              var5 = param0 * this.field_P.field_q / param1;
              if (var5 < this.field_L) {
                var5 = this.field_L;
                break L0;
              } else {
                break L0;
              }
            }
            this.field_H.a(106, this.field_H.field_r, this.field_H.field_v, this.field_H.field_p, var5);
            this.a(true, -127);
            this.e((byte) 100);
            return;
          } else {
            this.e((byte) 100);
            return;
          }
        } else {
          L1: {
            var5 = param0 * this.field_P.field_q / param1;
            if (var5 < this.field_L) {
              var5 = this.field_L;
              break L1;
            } else {
              break L1;
            }
          }
          this.field_H.a(106, this.field_H.field_r, this.field_H.field_v, this.field_H.field_p, var5);
          this.a(true, -127);
          this.e((byte) 100);
          return;
        }
    }

    private final void a(int param0, boolean param1) {
        wp stackIn_1_0 = null;
        wp stackIn_2_0 = null;
        wp stackIn_7_0 = null;
        wp stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wp stackIn_13_0 = null;
        wp stackIn_14_0 = null;
        wp stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        wp stackIn_17_0 = null;
        wp stackIn_18_0 = null;
        wp stackIn_19_0 = null;
        wp stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        wp stackIn_24_0 = null;
        wp stackIn_25_0 = null;
        wp stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        wp stackIn_29_0 = null;
        wp stackIn_30_0 = null;
        wp stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        wp stackIn_34_0 = null;
        wp stackIn_35_0 = null;
        wp stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        wp stackIn_38_0 = null;
        wp stackIn_39_0 = null;
        wp stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        wp stackIn_45_0 = null;
        wp stackIn_46_0 = null;
        wp stackIn_48_0 = null;
        wp stackIn_49_0 = null;
        wp stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        wp stackIn_52_0 = null;
        wp stackIn_53_0 = null;
        wp stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        wp stackIn_59_0 = null;
        wp stackIn_60_0 = null;
        wp stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        wp stackIn_63_0 = null;
        wp stackIn_64_0 = null;
        wp stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        wp stackIn_68_0 = null;
        wp stackIn_69_0 = null;
        wp stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        wp stackIn_73_0 = null;
        wp stackIn_74_0 = null;
        wp stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        wp stackIn_80_0 = null;
        wp stackIn_81_0 = null;
        wp stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        wp stackOut_0_0 = null;
        wp stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        wp stackOut_1_0 = null;
        wp stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        wp stackOut_6_0 = null;
        wp stackOut_17_0 = null;
        wp stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        wp stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        wp stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        wp stackOut_12_0 = null;
        wp stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        wp stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        wp stackOut_28_0 = null;
        wp stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        wp stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        wp stackOut_33_0 = null;
        wp stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        wp stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        wp stackOut_23_0 = null;
        wp stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        wp stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        wp stackOut_44_0 = null;
        wp stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        wp stackOut_45_0 = null;
        wp stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        wp stackOut_58_0 = null;
        wp stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        wp stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        wp stackOut_47_0 = null;
        wp stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        wp stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        wp stackOut_51_0 = null;
        wp stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        wp stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        wp stackOut_79_0 = null;
        wp stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        wp stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        wp stackOut_67_0 = null;
        wp stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        wp stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        wp stackOut_72_0 = null;
        wp stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        wp stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        L0: {
          stackOut_0_0 = this.field_P;
          stackIn_38_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1) {
            stackOut_38_0 = (wp) ((Object) stackIn_38_0);
            stackOut_38_1 = 1;
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            break L0;
          } else {
            stackOut_1_0 = (wp) ((Object) stackIn_1_0);
            stackIn_39_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!this.field_A) {
              stackOut_39_0 = (wp) ((Object) stackIn_39_0);
              stackOut_39_1 = 0;
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              break L0;
            } else {
              stackIn_2_0.field_x = true;
              if (param0 == 8206) {
                L1: {
                  if (this.field_H.field_y instanceof wp) {
                    stackOut_6_0 = (wp) ((Object) this.field_H.field_y);
                    stackIn_17_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (!param1) {
                      L2: {
                        stackOut_17_0 = (wp) ((Object) stackIn_17_0);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (!this.field_A) {
                          stackOut_19_0 = (wp) ((Object) stackIn_19_0);
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L2;
                        } else {
                          stackOut_18_0 = (wp) ((Object) stackIn_18_0);
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L2;
                        }
                      }
                      stackIn_20_0.field_x = stackIn_20_1 != 0;
                      break L1;
                    } else {
                      L3: {
                        stackIn_7_0.field_x = true;
                        if (null == this.field_F) {
                          break L3;
                        } else {
                          stackOut_8_0 = this.field_F;
                          stackOut_8_1 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_0.field_x = stackIn_10_1 != 0;
                          break L3;
                        }
                      }
                      L4: {
                        if (null == this.field_M) {
                          break L4;
                        } else {
                          L5: {
                            stackOut_12_0 = this.field_M;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (!param1) {
                              stackOut_14_0 = (wp) ((Object) stackIn_14_0);
                              stackOut_14_1 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              stackIn_15_1 = stackOut_14_1;
                              break L5;
                            } else {
                              stackOut_13_0 = (wp) ((Object) stackIn_13_0);
                              stackOut_13_1 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              stackIn_15_1 = stackOut_13_1;
                              break L5;
                            }
                          }
                          stackIn_15_0.field_x = stackIn_15_1 != 0;
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
                if (null != this.field_F) {
                  L6: {
                    stackOut_28_0 = this.field_F;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (!param1) {
                      stackOut_30_0 = (wp) ((Object) stackIn_30_0);
                      stackOut_30_1 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L6;
                    } else {
                      stackOut_29_0 = (wp) ((Object) stackIn_29_0);
                      stackOut_29_1 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      break L6;
                    }
                  }
                  stackIn_31_0.field_x = stackIn_31_1 != 0;
                  if (null != this.field_M) {
                    L7: {
                      stackOut_33_0 = this.field_M;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (!param1) {
                        stackOut_35_0 = (wp) ((Object) stackIn_35_0);
                        stackOut_35_1 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        break L7;
                      } else {
                        stackOut_34_0 = (wp) ((Object) stackIn_34_0);
                        stackOut_34_1 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        break L7;
                      }
                    }
                    stackIn_36_0.field_x = stackIn_36_1 != 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L8: {
                    if (null == this.field_M) {
                      break L8;
                    } else {
                      L9: {
                        stackOut_23_0 = this.field_M;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_24_0 = stackOut_23_0;
                        if (!param1) {
                          stackOut_25_0 = (wp) ((Object) stackIn_25_0);
                          stackOut_25_1 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          break L9;
                        } else {
                          stackOut_24_0 = (wp) ((Object) stackIn_24_0);
                          stackOut_24_1 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          break L9;
                        }
                      }
                      stackIn_26_0.field_x = stackIn_26_1 != 0;
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        stackIn_40_0.field_x = stackIn_40_1 != 0;
        if (param0 == 8206) {
          L10: {
            if (this.field_H.field_y instanceof wp) {
              L11: {
                stackOut_44_0 = (wp) ((Object) this.field_H.field_y);
                stackIn_63_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (param1) {
                  stackOut_63_0 = (wp) ((Object) stackIn_63_0);
                  stackOut_63_1 = 1;
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_65_1 = stackOut_63_1;
                  break L11;
                } else {
                  stackOut_45_0 = (wp) ((Object) stackIn_45_0);
                  stackIn_64_0 = stackOut_45_0;
                  stackIn_46_0 = stackOut_45_0;
                  if (!this.field_A) {
                    stackOut_64_0 = (wp) ((Object) stackIn_64_0);
                    stackOut_64_1 = 0;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    break L11;
                  } else {
                    stackIn_46_0.field_x = true;
                    if (null == this.field_F) {
                      if (null != this.field_M) {
                        L12: {
                          stackOut_58_0 = this.field_M;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_59_0 = stackOut_58_0;
                          if (!param1) {
                            stackOut_60_0 = (wp) ((Object) stackIn_60_0);
                            stackOut_60_1 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            break L12;
                          } else {
                            stackOut_59_0 = (wp) ((Object) stackIn_59_0);
                            stackOut_59_1 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            break L12;
                          }
                        }
                        stackIn_61_0.field_x = stackIn_61_1 != 0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L13: {
                        stackOut_47_0 = this.field_F;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_48_0 = stackOut_47_0;
                        if (!param1) {
                          stackOut_49_0 = (wp) ((Object) stackIn_49_0);
                          stackOut_49_1 = 0;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          break L13;
                        } else {
                          stackOut_48_0 = (wp) ((Object) stackIn_48_0);
                          stackOut_48_1 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          break L13;
                        }
                      }
                      L14: {
                        stackIn_50_0.field_x = stackIn_50_1 != 0;
                        if (null == this.field_M) {
                          break L14;
                        } else {
                          L15: {
                            stackOut_51_0 = this.field_M;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_52_0 = stackOut_51_0;
                            if (!param1) {
                              stackOut_53_0 = (wp) ((Object) stackIn_53_0);
                              stackOut_53_1 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              stackIn_54_1 = stackOut_53_1;
                              break L15;
                            } else {
                              stackOut_52_0 = (wp) ((Object) stackIn_52_0);
                              stackOut_52_1 = 1;
                              stackIn_54_0 = stackOut_52_0;
                              stackIn_54_1 = stackOut_52_1;
                              break L15;
                            }
                          }
                          stackIn_54_0.field_x = stackIn_54_1 != 0;
                          break L14;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              stackIn_65_0.field_x = stackIn_65_1 != 0;
              break L10;
            } else {
              break L10;
            }
          }
          if (null == this.field_F) {
            if (null != this.field_M) {
              L16: {
                stackOut_79_0 = this.field_M;
                stackIn_81_0 = stackOut_79_0;
                stackIn_80_0 = stackOut_79_0;
                if (!param1) {
                  stackOut_81_0 = (wp) ((Object) stackIn_81_0);
                  stackOut_81_1 = 0;
                  stackIn_82_0 = stackOut_81_0;
                  stackIn_82_1 = stackOut_81_1;
                  break L16;
                } else {
                  stackOut_80_0 = (wp) ((Object) stackIn_80_0);
                  stackOut_80_1 = 1;
                  stackIn_82_0 = stackOut_80_0;
                  stackIn_82_1 = stackOut_80_1;
                  break L16;
                }
              }
              stackIn_82_0.field_x = stackIn_82_1 != 0;
              return;
            } else {
              return;
            }
          } else {
            L17: {
              stackOut_67_0 = this.field_F;
              stackIn_69_0 = stackOut_67_0;
              stackIn_68_0 = stackOut_67_0;
              if (!param1) {
                stackOut_69_0 = (wp) ((Object) stackIn_69_0);
                stackOut_69_1 = 0;
                stackIn_70_0 = stackOut_69_0;
                stackIn_70_1 = stackOut_69_1;
                break L17;
              } else {
                stackOut_68_0 = (wp) ((Object) stackIn_68_0);
                stackOut_68_1 = 1;
                stackIn_70_0 = stackOut_68_0;
                stackIn_70_1 = stackOut_68_1;
                break L17;
              }
            }
            stackIn_70_0.field_x = stackIn_70_1 != 0;
            if (null != this.field_M) {
              L18: {
                stackOut_72_0 = this.field_M;
                stackIn_74_0 = stackOut_72_0;
                stackIn_73_0 = stackOut_72_0;
                if (!param1) {
                  stackOut_74_0 = (wp) ((Object) stackIn_74_0);
                  stackOut_74_1 = 0;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  break L18;
                } else {
                  stackOut_73_0 = (wp) ((Object) stackIn_73_0);
                  stackOut_73_1 = 1;
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  break L18;
                }
              }
              stackIn_75_0.field_x = stackIn_75_1 != 0;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (null != this.field_F) {
            stackOut_2_0 = this.field_F.field_v + this.field_F.field_p;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_P.field_v;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (this.field_M == null) {
            stackOut_5_0 = -this.field_H.field_p + (this.field_P.field_p + this.field_P.field_v);
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = -this.field_H.field_p + this.field_M.field_v;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        this.field_H.field_v = ((-var2 + var3) * this.field_D >> 1413961040) + var2;
        if (param0 == -1840) {
          return;
        } else {
          this.field_P = (wp) null;
          return;
        }
    }

    final void e(boolean param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = Sumoblitz.field_L ? 1 : 0;
            if (this.field_N != null) {
              break L1;
            } else {
              this.field_P.field_r = 0;
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_N.field_v = -this.field_N.field_p + this.field_p >> -1835926495;
          this.field_N.field_r = 0;
          this.field_P.field_r = this.field_N.field_q + this.field_N.field_r;
          break L0;
        }
        if (null == this.field_J) {
          L2: {
            L3: {
              this.field_P.field_q = this.field_q - this.field_P.field_r;
              this.e((byte) 125);
              if (this.field_F != null) {
                break L3;
              } else {
                this.field_P.field_v = 0;
                if (var3 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            this.field_F.field_v = 0;
            this.field_F.field_r = -this.field_F.field_q + this.field_q >> -2087720351;
            this.field_P.field_v = this.field_F.field_p + this.field_F.field_v;
            break L2;
          }
          if (this.field_M != null) {
            this.field_M.field_v = -this.field_M.field_p + this.field_p;
            this.field_M.field_r = -this.field_M.field_q + this.field_q >> -495632863;
            this.field_P.field_p = -this.field_M.field_p + (-this.field_P.field_v + this.field_p);
            if (var3 != 0) {
              L4: {
                this.field_P.field_p = -this.field_P.field_v + this.field_p;
                this.f(-1840);
                if (!this.field_K) {
                  this.field_H.field_v = 0;
                  this.field_H.field_p = this.field_P.field_p;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (this.field_A) {
                this.field_H.c(param0);
                return;
              } else {
                this.field_H.field_r = 0;
                this.field_H.field_q = this.field_P.field_q;
                this.field_H.c(param0);
                return;
              }
            } else {
              L5: {
                this.f(-1840);
                if (!this.field_K) {
                  this.field_H.field_v = 0;
                  this.field_H.field_p = this.field_P.field_p;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (this.field_A) {
                this.field_H.c(param0);
                return;
              } else {
                this.field_H.field_r = 0;
                this.field_H.field_q = this.field_P.field_q;
                this.field_H.c(param0);
                return;
              }
            }
          } else {
            L6: {
              this.field_P.field_p = -this.field_P.field_v + this.field_p;
              this.f(-1840);
              if (!this.field_K) {
                this.field_H.field_v = 0;
                this.field_H.field_p = this.field_P.field_p;
                break L6;
              } else {
                break L6;
              }
            }
            if (this.field_A) {
              this.field_H.c(param0);
              return;
            } else {
              this.field_H.field_r = 0;
              this.field_H.field_q = this.field_P.field_q;
              this.field_H.c(param0);
              return;
            }
          }
        } else {
          this.field_J.field_r = this.field_q + -this.field_J.field_q;
          this.field_J.field_v = this.field_p - this.field_J.field_p >> -286223071;
          this.field_P.field_q = this.field_q + (-this.field_P.field_r + -this.field_J.field_q);
          if (var3 == 0) {
            this.e((byte) 125);
            if (this.field_F != null) {
              this.field_F.field_v = 0;
              this.field_F.field_r = -this.field_F.field_q + this.field_q >> -2087720351;
              this.field_P.field_v = this.field_F.field_p + this.field_F.field_v;
              if (this.field_M == null) {
                L7: {
                  this.field_P.field_p = -this.field_P.field_v + this.field_p;
                  this.f(-1840);
                  if (!this.field_K) {
                    this.field_H.field_v = 0;
                    this.field_H.field_p = this.field_P.field_p;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (this.field_A) {
                  this.field_H.c(param0);
                  return;
                } else {
                  this.field_H.field_r = 0;
                  this.field_H.field_q = this.field_P.field_q;
                  this.field_H.c(param0);
                  return;
                }
              } else {
                this.field_M.field_v = -this.field_M.field_p + this.field_p;
                this.field_M.field_r = -this.field_M.field_q + this.field_q >> -495632863;
                this.field_P.field_p = -this.field_M.field_p + (-this.field_P.field_v + this.field_p);
                if (var3 == 0) {
                  L8: {
                    this.f(-1840);
                    if (!this.field_K) {
                      this.field_H.field_v = 0;
                      this.field_H.field_p = this.field_P.field_p;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (this.field_A) {
                    this.field_H.c(param0);
                    return;
                  } else {
                    this.field_H.field_r = 0;
                    this.field_H.field_q = this.field_P.field_q;
                    this.field_H.c(param0);
                    return;
                  }
                } else {
                  L9: {
                    this.field_P.field_p = -this.field_P.field_v + this.field_p;
                    this.f(-1840);
                    if (!this.field_K) {
                      this.field_H.field_v = 0;
                      this.field_H.field_p = this.field_P.field_p;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (this.field_A) {
                    this.field_H.c(param0);
                    return;
                  } else {
                    this.field_H.field_r = 0;
                    this.field_H.field_q = this.field_P.field_q;
                    this.field_H.c(param0);
                    return;
                  }
                }
              }
            } else {
              this.field_P.field_v = 0;
              if (var3 == 0) {
                if (this.field_M == null) {
                  L10: {
                    this.field_P.field_p = -this.field_P.field_v + this.field_p;
                    this.f(-1840);
                    if (!this.field_K) {
                      this.field_H.field_v = 0;
                      this.field_H.field_p = this.field_P.field_p;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if (this.field_A) {
                    this.field_H.c(param0);
                    return;
                  } else {
                    this.field_H.field_r = 0;
                    this.field_H.field_q = this.field_P.field_q;
                    this.field_H.c(param0);
                    return;
                  }
                } else {
                  this.field_M.field_v = -this.field_M.field_p + this.field_p;
                  this.field_M.field_r = -this.field_M.field_q + this.field_q >> -495632863;
                  this.field_P.field_p = -this.field_M.field_p + (-this.field_P.field_v + this.field_p);
                  if (var3 == 0) {
                    L11: {
                      this.f(-1840);
                      if (!this.field_K) {
                        this.field_H.field_v = 0;
                        this.field_H.field_p = this.field_P.field_p;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (this.field_A) {
                      this.field_H.c(param0);
                      return;
                    } else {
                      this.field_H.field_r = 0;
                      this.field_H.field_q = this.field_P.field_q;
                      this.field_H.c(param0);
                      return;
                    }
                  } else {
                    L12: {
                      this.field_P.field_p = -this.field_P.field_v + this.field_p;
                      this.f(-1840);
                      if (!this.field_K) {
                        this.field_H.field_v = 0;
                        this.field_H.field_p = this.field_P.field_p;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    if (this.field_A) {
                      this.field_H.c(param0);
                      return;
                    } else {
                      this.field_H.field_r = 0;
                      this.field_H.field_q = this.field_P.field_q;
                      this.field_H.c(param0);
                      return;
                    }
                  }
                }
              } else {
                this.field_F.field_v = 0;
                this.field_F.field_r = -this.field_F.field_q + this.field_q >> -2087720351;
                this.field_P.field_v = this.field_F.field_p + this.field_F.field_v;
                if (this.field_M == null) {
                  L13: {
                    this.field_P.field_p = -this.field_P.field_v + this.field_p;
                    this.f(-1840);
                    if (!this.field_K) {
                      this.field_H.field_v = 0;
                      this.field_H.field_p = this.field_P.field_p;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  if (this.field_A) {
                    this.field_H.c(param0);
                    return;
                  } else {
                    this.field_H.field_r = 0;
                    this.field_H.field_q = this.field_P.field_q;
                    this.field_H.c(param0);
                    return;
                  }
                } else {
                  L14: {
                    this.field_M.field_v = -this.field_M.field_p + this.field_p;
                    this.field_M.field_r = -this.field_M.field_q + this.field_q >> -495632863;
                    this.field_P.field_p = -this.field_M.field_p + (-this.field_P.field_v + this.field_p);
                    this.field_P.field_p = -this.field_P.field_v + this.field_p;
                    this.f(-1840);
                    if (!this.field_K) {
                      this.field_H.field_v = 0;
                      this.field_H.field_p = this.field_P.field_p;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (this.field_A) {
                    this.field_H.c(param0);
                    return;
                  } else {
                    this.field_H.field_r = 0;
                    this.field_H.field_q = this.field_P.field_q;
                    this.field_H.c(param0);
                    return;
                  }
                }
              }
            }
          } else {
            L15: {
              this.field_P.field_q = this.field_q - this.field_P.field_r;
              this.e((byte) 125);
              if (this.field_F != null) {
                break L15;
              } else {
                this.field_P.field_v = 0;
                break L15;
              }
            }
            this.field_F.field_v = 0;
            this.field_F.field_r = -this.field_F.field_q + this.field_q >> -2087720351;
            this.field_P.field_v = this.field_F.field_p + this.field_F.field_v;
            L16: {
              L17: {
                if (this.field_M == null) {
                  break L17;
                } else {
                  this.field_M.field_v = -this.field_M.field_p + this.field_p;
                  this.field_M.field_r = -this.field_M.field_q + this.field_q >> -495632863;
                  this.field_P.field_p = -this.field_M.field_p + (-this.field_P.field_v + this.field_p);
                  if (var3 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              this.field_P.field_p = -this.field_P.field_v + this.field_p;
              break L16;
            }
            L18: {
              this.f(-1840);
              if (!this.field_K) {
                this.field_H.field_v = 0;
                this.field_H.field_p = this.field_P.field_p;
                break L18;
              } else {
                break L18;
              }
            }
            if (this.field_A) {
              this.field_H.c(param0);
              return;
            } else {
              this.field_H.field_r = 0;
              this.field_H.field_q = this.field_P.field_q;
              this.field_H.c(param0);
              return;
            }
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          if (param2 >= param1) {
            break L0;
          } else {
            L1: {
              var4 = param2 * this.field_P.field_p / param1;
              if (var4 < this.field_R) {
                var4 = this.field_R;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_H.a(-95, this.field_H.field_r, this.field_H.field_v, var4, this.field_H.field_q);
            this.a(8206, true);
            if (!Sumoblitz.field_L) {
              this.f(-1840);
              if (param0 >= 2) {
                return;
              } else {
                this.e((byte) 53);
                return;
              }
            } else {
              break L0;
            }
          }
        }
        this.field_H.a(-49, this.field_H.field_r, this.field_H.field_v, this.field_P.field_p, this.field_H.field_q);
        this.a(8206, false);
        this.f(-1840);
        if (param0 >= 2) {
          return;
        } else {
          this.e((byte) 53);
          return;
        }
    }

    vo(int param0, int param1, int param2, int param3, mh param4, mh param5, mh param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        jh dupTemp$2 = null;
        wp dupTemp$3 = null;
        RuntimeException var16 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        this.field_Q = 1024;
        this.field_R = 0;
        this.field_O = 8192;
        this.field_L = 0;
        this.field_B = true;
        this.field_E = 1024;
        this.field_D = 32768;
        this.field_C = 8192;
        this.field_G = 32768;
        try {
          L0: {
            L1: {
              this.field_x = new pk[6];
              dupTemp$2 = new jh(param0, param1, param7, param8, (mh) null, (qm) null, new wp(0, 0, param7, param8, param6, (qm) null), false, false);
              this.field_H = dupTemp$2;
              this.field_x[0] = (pk) ((Object) dupTemp$2);
              dupTemp$3 = new wp(param0, param1, param7, param8, param5, (qm) null);
              this.field_P = dupTemp$3;
              this.field_x[1] = (pk) ((Object) dupTemp$3);
              this.field_L = param9;
              this.field_R = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param12) {
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
            L2: {
              ((vo) (this)).field_K = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param11) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((vo) (this)).field_A = stackIn_7_1 != 0;
            this.b(param13, (byte) 7);
            this.a(0, param14);
            this.a(96, param0, param1, param3, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var16);
            stackOut_9_1 = new StringBuilder().append("vo.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    private final int h(int param0) {
        int var2 = 57 % ((param0 - -47) / 43);
        return (this.field_H.field_p << -897472048) / this.field_P.field_p;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_46_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 27, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!this.field_B) {
                  break L1;
                } else {
                  if (this.field_H.d(-1)) {
                    if (-99 == (param3 ^ -1)) {
                      this.a(this.field_D - this.field_E, (byte) -125);
                      stackOut_42_0 = 1;
                      stackIn_43_0 = stackOut_42_0;
                      decompiledRegionSelector0 = 10;
                      break L0;
                    } else {
                      if ((param3 ^ -1) == -100) {
                        this.a(this.field_E + this.field_D, (byte) -125);
                        stackOut_40_0 = 1;
                        stackIn_41_0 = stackOut_40_0;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if (-97 != (param3 ^ -1)) {
                          if (param3 != 97) {
                            if (-105 == (param3 ^ -1)) {
                              this.a(this.field_D + -this.h(123), (byte) -125);
                              stackOut_38_0 = 1;
                              stackIn_39_0 = stackOut_38_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((param3 ^ -1) != -106) {
                                if ((param3 ^ -1) == -103) {
                                  L2: {
                                    if (!this.field_K) {
                                      break L2;
                                    } else {
                                      if (hw.field_b[82]) {
                                        this.a(0, (byte) -125);
                                        stackOut_36_0 = 1;
                                        stackIn_37_0 = stackOut_36_0;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                  if (this.field_A) {
                                    this.a((byte) 123, 0);
                                    stackOut_34_0 = 1;
                                    stackIn_35_0 = stackOut_34_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (103 != param3) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!this.field_K) {
                                        break L3;
                                      } else {
                                        if (!hw.field_b[82]) {
                                          break L3;
                                        } else {
                                          this.a(65536, (byte) -125);
                                          stackOut_23_0 = 1;
                                          stackIn_24_0 = stackOut_23_0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    if (this.field_A) {
                                      this.a((byte) 123, 65536);
                                      stackOut_27_0 = 1;
                                      stackIn_28_0 = stackOut_27_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                this.a(this.field_D + this.h(-111), (byte) -125);
                                stackOut_17_0 = 1;
                                stackIn_18_0 = stackOut_17_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          } else {
                            this.a((byte) -122, this.field_G - -this.field_Q);
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          this.a((byte) -124, -this.field_Q + this.field_G);
                          stackOut_10_0 = 1;
                          stackIn_11_0 = stackOut_10_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L4: {
                if (param2 > 9) {
                  break L4;
                } else {
                  this.a(true, 89);
                  break L4;
                }
              }
              stackOut_46_0 = 0;
              stackIn_47_0 = stackOut_46_0;
              decompiledRegionSelector0 = 11;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var5);
            stackOut_48_1 = new StringBuilder().append("vo.KA(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L5;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_37_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_39_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_41_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_43_0 != 0;
                            } else {
                              return stackIn_47_0 != 0;
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

    static {
        field_I = -1;
    }
}
