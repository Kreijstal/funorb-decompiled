/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends nb implements nf, jk {
    private kf field_E;
    static long field_M;
    private String field_F;
    private rl field_G;
    static db[] field_I;
    private rl field_B;
    private kf field_H;
    private boolean field_K;
    private boolean field_J;
    static eg field_L;
    private boolean field_D;
    private kf field_N;
    static String field_C;

    private final void g(int param0) {
        int discarded$2 = 0;
        CharSequence var3 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = (CharSequence) null;
            discarded$2 = ti.a(-118, (CharSequence) null, -52, true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (sg.a(false)) {
              break L2;
            } else {
              if (0 >= this.field_G.field_u.length()) {
                break L1;
              } else {
                if (0 >= this.field_B.field_u.length()) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          ha.a(this.field_G.field_u, this.field_B.field_u, param0 ^ -111);
          break L1;
        }
    }

    public final void a(byte param0, rl param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                field_M = 116L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ti.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 107)) {
              var5_int = -37 % ((-13 - param3) / 55);
              if (-99 == (param1 ^ -1)) {
                stackOut_5_0 = this.a(0, param2);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param1 ^ -1) != -100) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = this.c((byte) 119, param2);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("ti.P(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final void a(int param0, String param1) {
        rl var3 = null;
        String var4 = null;
        try {
            if (param0 != 3) {
                this.field_G = (rl) null;
            }
            var3 = this.field_G;
            var4 = param1;
            var3.a(var4, param0 + -4, false);
            this.field_B.j(0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ti.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rl param0, boolean param1) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_G == param0) {
                discarded$2 = this.field_B.a((byte) 44, (w) (this));
                break L1;
              } else {
                break L1;
              }
            }
            if (param1) {
              L2: {
                if (this.field_B != param0) {
                  break L2;
                } else {
                  this.g(0);
                  break L2;
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("ti.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -3) {
                break L1;
              } else {
                if ((param0 ^ -1) < -37) {
                  break L1;
                } else {
                  var4_int = 30 % ((-72 - param2) / 54);
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = param1.length();
                  var9 = 0;
                  L2: while (true) {
                    L3: {
                      if (var9 >= var8) {
                        stackOut_37_0 = var6;
                        stackIn_38_0 = stackOut_37_0;
                        break L3;
                      } else {
                        var10 = param1.charAt(var9);
                        stackOut_7_0 = var9 ^ -1;
                        stackIn_38_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var12 != 0) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              if (stackIn_8_0 != -1) {
                                break L5;
                              } else {
                                L6: {
                                  if (var10 != 45) {
                                    break L6;
                                  } else {
                                    var5 = 1;
                                    if (var12 == 0) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (var10 != 43) {
                                  break L5;
                                } else {
                                  if (param3) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            L7: {
                              L8: {
                                if (var10 < 48) {
                                  break L8;
                                } else {
                                  if (var10 > 57) {
                                    break L8;
                                  } else {
                                    var10 -= 48;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (var10 < 65) {
                                  break L9;
                                } else {
                                  if (var10 > 90) {
                                    break L9;
                                  } else {
                                    var10 -= 55;
                                    break L7;
                                  }
                                }
                              }
                              L10: {
                                if (var10 < 97) {
                                  break L10;
                                } else {
                                  if (var10 <= 122) {
                                    var10 -= 87;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      var10 -= 55;
                                      break L7;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              throw new NumberFormatException();
                            }
                            if (var10 >= param0) {
                              throw new NumberFormatException();
                            } else {
                              L11: {
                                if (var5 == 0) {
                                  break L11;
                                } else {
                                  var10 = -var10;
                                  break L11;
                                }
                              }
                              var11 = var10 + param0 * var7;
                              if (var11 / param0 == var7) {
                                var6 = 1;
                                var7 = var11;
                                break L4;
                              } else {
                                throw new NumberFormatException();
                              }
                            }
                          }
                          var9++;
                          continue L2;
                        }
                      }
                    }
                    if (stackIn_38_0 == 0) {
                      throw new NumberFormatException();
                    } else {
                      stackOut_41_0 = var7;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var4);
            stackOut_43_1 = new StringBuilder().append("ti.F(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_42_0;
    }

    final static jb[] a(byte param0) {
        jb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        var1 = new jb[th.field_t];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (th.field_t <= var2) {
                break L2;
              } else {
                var1[var2] = new jb(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], be.field_f[var2], ci.field_b);
                var2++;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (param0 > 103) {
                break L3;
              } else {
                field_M = -84L;
                break L3;
              }
            }
            gk.a(12428);
            break L1;
          }
          return var1;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 != this.field_N) {
                L2: {
                  if (param4 == this.field_H) {
                    break L2;
                  } else {
                    if (this.field_E == param4) {
                      L3: {
                        if (!this.field_J) {
                          break L3;
                        } else {
                          vi.a((byte) 115);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (this.field_D) {
                          break L4;
                        } else {
                          ld.i(param2 ^ -215531225);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ga.b(0);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                bg.a(false);
                if (var7 == 0) {
                  break L1;
                } else {
                  this.g(0);
                  break L1;
                }
              } else {
                this.g(0);
                break L1;
              }
            }
            L5: {
              if (param2 == 215535458) {
                break L5;
              } else {
                field_L = (eg) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("ti.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final String e(byte param0) {
        int var2 = -19 % ((-3 - param0) / 60);
        if (this.field_G.field_u == null) {
            return "";
        }
        return this.field_G.field_u;
    }

    ti(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (rd) null);
        jf dupTemp$2 = null;
        jf dupTemp$3 = null;
        RuntimeException var6 = null;
        v var6_ref = null;
        le var7 = null;
        String var8 = null;
        m var9 = null;
        int var11 = 0;
        jf var12 = null;
        jf var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        kf stackIn_16_1 = null;
        kf stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        kf stackIn_17_1 = null;
        kf stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        kf stackIn_18_1 = null;
        kf stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
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
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        kf stackOut_15_1 = null;
        kf stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        kf stackOut_17_1 = null;
        kf stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        kf stackOut_16_1 = null;
        kf stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_F = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
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
              ((ti) (this)).field_D = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
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
            L3: {
              ((ti) (this)).field_K = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param2) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ti) (this)).field_J = stackIn_10_1 != 0;
              if (!this.field_J) {
                break L4;
              } else {
                L5: {
                  if (this.field_K) {
                    break L5;
                  } else {
                    if (!this.field_D) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              L7: {
                this.field_G = (rl) ((Object) new cl(param0, (vd) (this), 100));
                this.field_B = (rl) ((Object) new cl("", (vd) (this), 20));
                if (this.field_J) {
                  break L7;
                } else {
                  L8: {
                    this.field_N = new kf(be.field_i, (vd) null);
                    stackOut_15_0 = this;
                    stackOut_15_1 = null;
                    stackOut_15_2 = null;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    if (this.field_D) {
                      stackOut_17_0 = this;
                      stackOut_17_1 = null;
                      stackOut_17_2 = null;
                      stackOut_17_3 = a.field_f;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      stackIn_18_3 = stackOut_17_3;
                      break L8;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = null;
                      stackOut_16_2 = null;
                      stackOut_16_3 = a.field_e;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_18_2 = stackOut_16_2;
                      stackIn_18_3 = stackOut_16_3;
                      break L8;
                    }
                  }
                  ((ti) (this)).field_E = new kf(stackIn_18_3, (vd) null);
                  if (!this.field_K) {
                    break L6;
                  } else {
                    this.field_H = new kf(ri.field_d, (vd) (this));
                    if (var11 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_N = new kf(og.field_j, (vd) null);
              this.field_E = new kf(jd.field_d, (vd) null);
              this.field_G.field_D = false;
              break L6;
            }
            L9: {
              this.field_G.field_i = (rd) ((Object) new id(10000536));
              this.field_B.field_i = (rd) ((Object) new di(10000536));
              var6_ref = new v();
              this.field_N.field_i = (rd) ((Object) var6_ref);
              if (this.field_E == null) {
                break L9;
              } else {
                this.field_E.field_i = (rd) ((Object) var6_ref);
                break L9;
              }
            }
            L10: {
              this.field_G.field_q = ib.field_i;
              if (this.field_H == null) {
                break L10;
              } else {
                this.field_H.field_i = (rd) ((Object) var6_ref);
                break L10;
              }
            }
            L11: {
              if (null == this.field_H) {
                break L11;
              } else {
                this.field_H.field_q = hi.field_a;
                break L11;
              }
            }
            L12: {
              L13: {
                if (!this.field_J) {
                  break L13;
                } else {
                  this.field_E.field_q = ig.field_d;
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (!this.field_D) {
                  break L14;
                } else {
                  this.field_E.field_q = il.field_a;
                  this.field_E.field_i = (rd) ((Object) new uj());
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              this.field_E.field_i = (rd) ((Object) new uj());
              break L12;
            }
            L15: {
              this.field_o = 15;
              var7 = ql.field_Q;
              if (null == this.field_F) {
                break L15;
              } else {
                this.field_o = this.field_o + (5 + var7.a(this.field_F, this.field_j + -40, var7.field_E));
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = nb.field_y;
                var9 = kb.a((byte) -31, kk.c(-14047));
                if (var9 == bb.field_J) {
                  break L17;
                } else {
                  if (var9 != mh.field_B) {
                    break L16;
                  } else {
                    var8 = ah.field_a;
                    if (var11 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              var8 = fg.field_d;
              break L16;
            }
            L18: {
              dupTemp$2 = new jf(10, this.field_o, this.field_j - 20, 25, this.field_G, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.b((byte) 125, dupTemp$2);
              this.field_o = this.field_o + (5 + ((w) ((Object) var12)).field_v);
              dupTemp$3 = new jf(10, this.field_o, -20 + this.field_j, 25, this.field_B, false, 80, 3, var7, 16777215, p.field_b);
              var13 = dupTemp$3;
              this.b((byte) -100, dupTemp$3);
              this.field_N.field_r = (vd) (this);
              this.field_o = this.field_o + (((w) ((Object) var13)).field_v + 5);
              if (null == this.field_H) {
                break L18;
              } else {
                this.field_H.field_r = (vd) (this);
                break L18;
              }
            }
            L19: {
              if (null == this.field_E) {
                break L19;
              } else {
                this.field_E.field_r = (vd) (this);
                break L19;
              }
            }
            L20: {
              L21: {
                if (this.field_H == null) {
                  break L21;
                } else {
                  this.field_N.a(30, -95 + this.field_j, true, this.field_o, 85);
                  this.field_o = this.field_o + 60;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_N.a(30, -6 + this.field_j + -10, true, this.field_o, 8);
              this.field_o = this.field_o + 35;
              break L20;
            }
            L22: {
              if (null == this.field_H) {
                break L22;
              } else {
                this.field_H.a(30, -10 + (-6 + this.field_j), true, this.field_o, 8);
                this.field_o = this.field_o + 35;
                break L22;
              }
            }
            L23: {
              if (this.field_E == null) {
                break L23;
              } else {
                L24: {
                  L25: {
                    if (this.field_J) {
                      break L25;
                    } else {
                      if (!this.field_D) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  this.field_E.a(30, -16 + this.field_j, true, this.field_o, 8);
                  this.field_o = this.field_o + 35;
                  if (var11 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
                this.field_E.a(20, 40, true, this.field_o, 8);
                this.field_o = this.field_o + 25;
                break L23;
              }
            }
            L26: {
              this.a(3 + this.field_o, this.field_j, true, 0, 0);
              this.b((byte) 67, this.field_N);
              if (this.field_H == null) {
                break L26;
              } else {
                this.b((byte) -77, this.field_H);
                break L26;
              }
            }
            L27: {
              if (this.field_E == null) {
                break L27;
              } else {
                this.b((byte) -112, this.field_E);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("ti.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L28;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L28;
            }
          }
          L29: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L29;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L29;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(byte param0) {
        int discarded$0 = 0;
        this.field_G.j(0);
        this.field_B.j(0);
        if (param0 > -59) {
            CharSequence var3 = (CharSequence) null;
            discarded$0 = ti.a(-96, (CharSequence) null, 81, true);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        if (null != this.field_F) {
            discarded$0 = ql.field_Q.a(this.field_F, 20 + (this.field_t + param2), 15 + (param1 + this.field_o), this.field_j - 40, this.field_v, 16777215, -1, 1, 0, ql.field_Q.field_E);
        }
        if (this.field_H != null) {
            lf.a(param2 + 10, param1 + 134, this.field_j - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void e(boolean param0) {
        field_I = null;
        field_C = null;
        field_L = null;
        if (param0) {
            field_L = (eg) null;
        }
    }

    static {
        field_C = "Confirm Email:";
    }
}
