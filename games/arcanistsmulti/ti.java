/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends df implements vb {
    private int field_K;
    mb field_P;
    String field_D;
    static String field_F;
    private ag field_O;
    static int field_N;
    dj field_Q;
    private ag field_E;
    static String field_C;
    boolean field_G;
    private int field_R;
    static ll[] field_I;
    static String field_M;
    sl field_H;
    private boolean field_J;

    ti(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (pf) null);
        ((ti) this).field_D = "";
        ((ti) this).field_Q = ia.field_c;
        try {
            ((ti) this).field_P = new mb((ti) this, ((ti) this).field_Q, param0, param1);
            ((ti) this).field_G = false;
            ((ti) this).field_P.field_o = (wc) this;
            ((ti) this).field_R = param2;
            ((ti) this).field_O = new ag("", (pf) (Object) new j((ti) this), (wc) this);
            ((ti) this).field_E = new ag();
            ((ti) this).field_E.field_r = (pf) (Object) new va();
            ((ti) this).field_E.field_o = (wc) this;
            ((ti) this).c(-83, (qm) (Object) ((ti) this).field_O);
            ((ti) this).c(-74, (qm) (Object) ((ti) this).field_E);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ti.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -2116) {
            break L0;
          } else {
            this.g(69);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ti) this).field_J) {
              break L2;
            } else {
              if (!super.d(-2116)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void i(int param0) {
        if (!((ti) this).j(2)) {
          return;
        } else {
          this.b(((ti) this).field_n, ((ti) this).field_v, ((ti) this).field_K, ((ti) this).field_j, 65);
          ((ti) this).field_G = false;
          ((ti) this).field_H.a(true);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
            ((ti) this).field_E = null;
        }
        ((ti) this).field_K = param0;
        this.b(param3, param2, param0, param1, 107);
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_58_0 = false;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_55_0 = 0;
        boolean stackOut_57_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (((ti) this).d(-2116)) {
              L1: {
                if (null != ((ti) this).field_P.field_W) {
                  L2: {
                    var5_int = ((ti) this).field_P.field_W.length;
                    if (param3 == 99) {
                      break L2;
                    } else {
                      if (98 != param3) {
                        L3: {
                          if (param3 == 105) {
                            break L3;
                          } else {
                            if (param3 != 104) {
                              if (param3 != 84) {
                                if (param3 == 85) {
                                  var6_int = ((ti) this).field_D.length();
                                  if (var6_int > 0) {
                                    ((ti) this).field_D = ((ti) this).field_D.substring(0, var6_int + -1);
                                    stackOut_45_0 = 1;
                                    stackIn_46_0 = stackOut_45_0;
                                    return stackIn_46_0 != 0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  if (param2 < 32) {
                                    break L1;
                                  } else {
                                    if (param2 >= 128) {
                                      break L1;
                                    } else {
                                      var6 = ((ti) this).field_D + param2;
                                      this.a(var6, -86);
                                      stackOut_49_0 = 1;
                                      stackIn_50_0 = stackOut_49_0;
                                      return stackIn_50_0 != 0;
                                    }
                                  }
                                }
                              } else {
                                L4: {
                                  if (!((ti) this).field_G) {
                                    this.g(-83);
                                    break L4;
                                  } else {
                                    this.i(0);
                                    break L4;
                                  }
                                }
                                stackOut_39_0 = 1;
                                stackIn_40_0 = stackOut_39_0;
                                return stackIn_40_0 != 0;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          if (((ti) this).j(2)) {
                            break L5;
                          } else {
                            this.g(-62);
                            break L5;
                          }
                        }
                        L6: {
                          var6_int = ((ti) this).field_H.field_P.field_k / ((ti) this).field_P.field_T;
                          if (param3 != 105) {
                            ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y - var6_int;
                            break L6;
                          } else {
                            ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y + var6_int;
                            break L6;
                          }
                        }
                        L7: {
                          if (((ti) this).field_P.field_Y >= 0) {
                            break L7;
                          } else {
                            ((ti) this).field_P.field_Y = 0;
                            break L7;
                          }
                        }
                        L8: {
                          if (var5_int > ((ti) this).field_P.field_Y) {
                            break L8;
                          } else {
                            ((ti) this).field_P.field_Y = -1 + var5_int;
                            break L8;
                          }
                        }
                        this.h(11149);
                        stackOut_33_0 = 1;
                        stackIn_34_0 = stackOut_33_0;
                        return stackIn_34_0 != 0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L9: {
                    if (((ti) this).j(2)) {
                      break L9;
                    } else {
                      this.g(-114);
                      break L9;
                    }
                  }
                  L10: {
                    if (param3 == 99) {
                      ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y + 1;
                      break L10;
                    } else {
                      ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y - 1;
                      break L10;
                    }
                  }
                  L11: {
                    if (0 <= ((ti) this).field_P.field_Y) {
                      break L11;
                    } else {
                      ((ti) this).field_P.field_Y = 0;
                      break L11;
                    }
                  }
                  L12: {
                    if (var5_int <= ((ti) this).field_P.field_Y) {
                      ((ti) this).field_P.field_Y = -1 + var5_int;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  this.h(11149);
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                } else {
                  break L1;
                }
              }
              L13: {
                if (param1 <= -120) {
                  break L13;
                } else {
                  boolean discarded$1 = ((ti) this).d(59);
                  break L13;
                }
              }
              if (param3 == 80) {
                this.i(0);
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                return stackIn_56_0 != 0;
              } else {
                stackOut_57_0 = super.a(param0, (byte) -125, param2, param3);
                stackIn_58_0 = stackOut_57_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5;
            stackOut_59_1 = new StringBuilder().append("ti.N(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L14;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L14;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_58_0;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var7 = null;
                boolean discarded$2 = ((ti) this).a(-2, (qm) null);
                break L1;
              }
            }
            L2: {
              if (!((ti) this).j(2)) {
                this.g(-107);
                break L2;
              } else {
                this.i(0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ti.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static boolean a(int param0, int param1, boolean param2, qb param3, ll param4, nf param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var30 = null;
        byte[] var31 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            param6 = param6 + param3.field_x;
            param0 = param0 + param3.field_o;
            param1 = param1 + param3.field_o;
            var7_int = param3.field_q;
            var8 = param3.field_y;
            if (param6 >= param5.field_y) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (~param6 < ~-var7_int) {
                if (!param2) {
                  L1: {
                    if (param0 >= param5.field_H) {
                      break L1;
                    } else {
                      if (~param0 >= ~-var8) {
                        break L1;
                      } else {
                        L2: {
                          if (0 < param6) {
                            stackOut_16_0 = param6;
                            stackIn_17_0 = stackOut_16_0;
                            break L2;
                          } else {
                            stackOut_15_0 = 0;
                            stackIn_17_0 = stackOut_15_0;
                            break L2;
                          }
                        }
                        L3: {
                          var9 = stackIn_17_0;
                          var10 = param6 - -var7_int;
                          if (~param5.field_y <= ~var10) {
                            break L3;
                          } else {
                            var10 = param5.field_y;
                            break L3;
                          }
                        }
                        L4: {
                          if (param0 <= 0) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            break L4;
                          } else {
                            stackOut_20_0 = param0;
                            stackIn_22_0 = stackOut_20_0;
                            break L4;
                          }
                        }
                        L5: {
                          var11 = stackIn_22_0;
                          var12 = param0 - -var8;
                          var10 = var10 - var9;
                          if (~var12 >= ~param5.field_y) {
                            break L5;
                          } else {
                            var12 = param5.field_y;
                            break L5;
                          }
                        }
                        L6: {
                          var12 = var12 - var11;
                          if ((1 & var10) <= 0) {
                            break L6;
                          } else {
                            var10--;
                            break L6;
                          }
                        }
                        L7: {
                          if ((1 & var12) <= 0) {
                            break L7;
                          } else {
                            var12--;
                            break L7;
                          }
                        }
                        var13 = param5.field_hb * (var11 >> 1) + (var9 >> 1);
                        var14 = param5.field_hb - (var10 >> 1);
                        var15 = (var11 + -param0) * param3.field_q - (-var9 - -param6);
                        var16 = var7_int + -var10;
                        var17 = var9 - (param6 - (-param1 + var11) * param3.field_q);
                        var16 = var16 + var7_int;
                        var31 = param4.field_m;
                        var30 = param3.field_A;
                        var28 = var30;
                        var26 = var28;
                        var24 = var26;
                        var19 = var24;
                        var20 = var30.length;
                        var21 = var12;
                        L8: while (true) {
                          if (var21 <= 0) {
                            stackOut_60_0 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            break L0;
                          } else {
                            var22 = var10;
                            L9: while (true) {
                              if (var22 <= 0) {
                                var17 = var17 + var16;
                                var13 = var13 + var14;
                                var15 = var15 + var16;
                                if (~param4.field_m.length >= ~var13) {
                                  stackOut_57_0 = 0;
                                  stackIn_58_0 = stackOut_57_0;
                                  return stackIn_58_0 != 0;
                                } else {
                                  var21 -= 2;
                                  continue L8;
                                }
                              } else {
                                L10: {
                                  if (var31[var13] == 0) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (1 + var7_int + (var17 + var7_int) >= var20) {
                                        break L11;
                                      } else {
                                        if (0 != var19[var7_int + var17]) {
                                          break L10;
                                        } else {
                                          if (var19[1 + (var7_int + var17)] != 0) {
                                            break L10;
                                          } else {
                                            if (var19[var17 - -var7_int + var7_int] != 0) {
                                              break L10;
                                            } else {
                                              if (var19[var17 - (-var7_int - var7_int) + 1] == 0) {
                                                break L11;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var30[var15] != 0) {
                                      stackOut_41_0 = 1;
                                      stackIn_42_0 = stackOut_41_0;
                                      return stackIn_42_0 != 0;
                                    } else {
                                      if (var19[1 + var15] != 0) {
                                        stackOut_45_0 = 1;
                                        stackIn_46_0 = stackOut_45_0;
                                        return stackIn_46_0 != 0;
                                      } else {
                                        if (var19[var7_int + var15] != 0) {
                                          stackOut_49_0 = 1;
                                          stackIn_50_0 = stackOut_49_0;
                                          return stackIn_50_0 != 0;
                                        } else {
                                          if (var19[var7_int + var15 - -1] == 0) {
                                            break L10;
                                          } else {
                                            stackOut_52_0 = 1;
                                            stackIn_53_0 = stackOut_52_0;
                                            return stackIn_53_0 != 0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var13++;
                                var15 += 2;
                                var17 += 2;
                                var22 -= 2;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var7;
            stackOut_62_1 = new StringBuilder().append("ti.O(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param3 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L12;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L12;
            }
          }
          L13: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param4 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L13;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L13;
            }
          }
          L14: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param5 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L14;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L14;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param6 + 41);
        }
        return stackIn_61_0 != 0;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ti.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(String param0, int param1) {
        if (((ti) this).field_P.field_W == null) {
            return;
        }
        int var3_int = this.a((byte) 78, param0.toLowerCase());
        if (!(var3_int != -1)) {
            return;
        }
        try {
            ((ti) this).field_P.field_Y = var3_int;
            this.h(11149);
            ((ti) this).field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ti.P(" + (param0 != null ? "{...}" : "null") + 44 + -86 + 41);
        }
    }

    final static void a(byte param0) {
        if (!(ce.field_g == null)) {
            return;
        }
        ce.field_g = new String[31];
        ce.field_g[14] = jk.field_j;
        ce.field_g[0] = nj.field_g;
        ce.field_g[23] = ArcanistsMulti.field_H;
        ce.field_g[19] = tm.field_f;
        ce.field_g[21] = th.field_i;
        ce.field_g[6] = mb.field_Z;
        ce.field_g[20] = sd.field_g;
        ce.field_g[18] = mj.field_y;
        ce.field_g[2] = r.field_e;
        ce.field_g[26] = mn.field_w;
        ce.field_g[17] = ui.field_q;
        ce.field_g[28] = ji.field_l;
        ce.field_g[9] = ed.field_xb;
        ce.field_g[7] = se.field_J;
        ce.field_g[4] = da.field_a;
        ce.field_g[5] = he.field_b;
        ce.field_g[11] = eg.field_d;
        ce.field_g[1] = ol.field_a;
        ce.field_g[30] = mo.field_d;
        ce.field_g[29] = me.field_Q;
        ce.field_g[8] = null;
        ce.field_g[27] = ie.field_Lb;
        ce.field_g[22] = he.field_g;
        ce.field_g[15] = be.field_i;
        ce.field_g[24] = lh.field_a;
        ce.field_g[13] = gb.field_a;
        ce.field_g[25] = ab.field_q;
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!((ti) this).j(2)) {
            break L0;
          } else {
            if (((ti) this).field_P.field_Y == -1) {
              break L0;
            } else {
              if (((ti) this).field_P.field_W == null) {
                break L0;
              } else {
                if (null == ((ti) this).field_H.field_O) {
                  break L0;
                } else {
                  var2 = ((ti) this).field_H.field_P.field_k;
                  var3 = ((ti) this).field_P.field_T;
                  var4 = ((ti) this).field_P.field_k - var2;
                  if (0 >= var4) {
                    return;
                  } else {
                    L1: {
                      var5 = var3 * ((ti) this).field_P.field_Y;
                      var6 = ((ti) this).field_H.field_P.field_B.field_j + var5;
                      var7 = var2 >> 2;
                      if (var7 <= var6) {
                        break L1;
                      } else {
                        L2: {
                          var8 = -(-var5 + var7 << 16) / var4;
                          if (var8 >= 0) {
                            break L2;
                          } else {
                            var8 = 0;
                            break L2;
                          }
                        }
                        ((ti) this).field_H.field_O.field_L = var8;
                        break L1;
                      }
                    }
                    L3: {
                      var7 = (var2 * 3 >> 2) - var3;
                      if (var7 >= var6) {
                        break L3;
                      } else {
                        L4: {
                          var8 = -(var7 + -var5 << 16) / var4;
                          if (var8 <= 65536) {
                            break L4;
                          } else {
                            var8 = 65536;
                            break L4;
                          }
                        }
                        ((ti) this).field_H.field_O.field_L = var8;
                        break L3;
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
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
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((ti) this).field_Q = null;
                break L1;
              }
            }
            L2: {
              param1.d((byte) 29);
              ((ti) this).field_D = "";
              ((ti) this).field_J = true;
              if (null == ((ti) this).field_o) {
                break L2;
              } else {
                if (!(((ti) this).field_o instanceof wb)) {
                  break L2;
                } else {
                  ((wb) (Object) ((ti) this).field_o).a(false, ((ti) this).field_J, (qm) this);
                  break L2;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ti.A(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0) {
        if (param0 != 0) {
            ((ti) this).field_P = null;
        }
        if (((ti) this).field_o instanceof ak) {
            ((ak) (Object) ((ti) this).field_o).a((ti) this, -6509);
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        super.a(param2, param3, param1, param0, -76);
        ((ti) this).field_O.a(((ti) this).field_K, 0, param1 - 20, 0, -89);
        ((ti) this).field_E.a(((ti) this).field_K, 0, 20, param1 + -20, -73);
        if (!(!((ti) this).field_G)) {
            ((ti) this).field_H.a(-((ti) this).field_K + param2, ((ti) this).field_K, param1, 0, -110);
        }
        if (param4 < 27) {
            String discarded$0 = ((ti) this).b(false);
        }
    }

    final static fk a(byte param0, int param1, wf param2) {
        RuntimeException var3 = null;
        fk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fk stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -30) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            stackOut_2_0 = sc.a(kd.a(param2, 100, param1), (byte) 68);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ti.G(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final String b(boolean param0) {
        if (!((ti) this).field_w) {
            return null;
        }
        if (param0) {
            Object var3 = null;
            int discarded$0 = this.a((byte) -128, (String) null);
        }
        if (((ti) this).j(2)) {
            if (((ti) this).field_H.field_w) {
                if (-1 != ((ti) this).field_P.field_Q) {
                    return ((ti) this).field_P.field_W[((ti) this).field_P.field_Q].toString();
                }
            }
        }
        if (!(((ti) this).field_P.g(126) == null)) {
            return ((ti) this).field_P.g(127).toString();
        }
        return super.b(false);
    }

    private final void g(int param0) {
        int var2 = ((ti) this).field_P.f(27825);
        int var3 = var2;
        int var4 = 0;
        if (!(var3 <= ((ti) this).field_R)) {
            var4 = 1;
            var3 = ((ti) this).field_R;
        }
        this.b(((ti) this).field_n, ((ti) this).field_v, var3 + ((ti) this).field_K, ((ti) this).field_j, 55);
        ((ti) this).field_P.a(var2, 0, ((ti) this).field_v, 0, -50);
        ((ti) this).field_H = new sl(0, 0, 0, 0, (pf) (Object) new eb(), (qm) (Object) ((ti) this).field_P, (pf) null);
        if (!(var4 == 0)) {
            ((ti) this).field_H.a(true, 1, rd.b(-15438));
        }
        ((ti) this).field_H.a(((ti) this).field_k - ((ti) this).field_K, ((ti) this).field_K, ((ti) this).field_v, 0, -114);
        ((ti) this).field_G = true;
        ((ti) this).c(-90, (qm) (Object) ((ti) this).field_H);
        this.h(11149);
        if (param0 >= -38) {
            ((ti) this).field_D = null;
        }
    }

    private final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            param1 = param1.toLowerCase();
            var3_int = 0;
            L1: while (true) {
              if (((ti) this).field_P.field_W.length <= var3_int) {
                L2: {
                  if (param0 >= 35) {
                    break L2;
                  } else {
                    boolean discarded$2 = ((ti) this).j(5);
                    break L2;
                  }
                }
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = ((ti) this).field_P.field_W[var3_int].toString().toLowerCase();
                if (!var4.startsWith(param1)) {
                  var3_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = var3_int;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ti.Q(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final void d(byte param0) {
        ((ti) this).field_J = false;
        super.d(param0);
    }

    final int g(byte param0) {
        if (param0 != 37) {
            ((ti) this).field_O = null;
        }
        return ((ti) this).field_P.field_Y;
    }

    final boolean j(int param0) {
        if (param0 != 2) {
            Object var3 = null;
            int discarded$0 = this.a((byte) -123, (String) null);
        }
        return ((ti) this).field_G;
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var8_int = -94 / ((-42 - param4) / 35);
            stackOut_0_0 = super.a(param0, param1, param2, param3, -105, param5, param6);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("ti.DA(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_1_0;
    }

    public static void k(int param0) {
        field_F = null;
        field_M = null;
        field_I = null;
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "You have earned as many wands as you are currently able to, and can now trade in all of your spells to purchase a prestige hat, which will appear within the game.<br>Be warned that, with every prestige hat you acquire, it will become increasingly harder to earn wands.";
        field_C = "Private";
        field_M = "Return to Main Menu";
    }
}
