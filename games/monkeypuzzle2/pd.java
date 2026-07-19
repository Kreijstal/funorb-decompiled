/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    private rk[] field_d;
    private int field_a;
    String field_g;
    float field_b;
    private int field_c;
    static String field_h;
    static int[] field_f;
    private int field_i;
    static String field_e;

    final boolean a(int param0) {
        int var3 = 0;
        rk var4 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackOut_4_0 = false;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 28296) {
          L0: while (true) {
            if (this.field_a > this.field_c) {
              var4 = this.field_d[this.field_c];
              stackOut_4_0 = var4.field_e.a(-72);
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var3 == 0) {
                if (!stackIn_6_0) {
                  this.a(1, 0, var4);
                  return false;
                } else {
                  L1: {
                    if (-1 < (var4.field_c ^ -1)) {
                      break L1;
                    } else {
                      if (var4.field_e.a(false, var4.field_c)) {
                        break L1;
                      } else {
                        this.a(1, var4.field_e.b(var4.field_c, 11619), var4);
                        return false;
                      }
                    }
                  }
                  L2: {
                    if (var4.field_i == null) {
                      break L2;
                    } else {
                      if (var4.field_e.a(0, var4.field_i)) {
                        break L2;
                      } else {
                        this.a(1, var4.field_e.a(var4.field_i, (byte) -81), var4);
                        return false;
                      }
                    }
                  }
                  L3: {
                    if ((var4.field_c ^ -1) <= -1) {
                      break L3;
                    } else {
                      if (var4.field_i != null) {
                        break L3;
                      } else {
                        if (null == var4.field_b) {
                          break L3;
                        } else {
                          if (var4.field_e.b(0)) {
                            break L3;
                          } else {
                            this.a(1, var4.field_e.b(true), var4);
                            return false;
                          }
                        }
                      }
                    }
                  }
                  this.field_c = this.field_c + 1;
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    return true;
                  }
                }
              } else {
                return stackIn_5_0;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
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
        int var13 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_45_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) > -3) {
                break L1;
              } else {
                if (param2 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          if (var8 >= var7) {
                            break L5;
                          } else {
                            var9 = param1.charAt(var8);
                            var13 = -1;
                            var12 = var8 ^ -1;
                            if (var11 != 0) {
                              if (var12 == var13) {
                                break L3;
                              } else {
                                break L4;
                              }
                            } else {
                              L6: {
                                L7: {
                                  if (var12 != var13) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (45 != var9) {
                                        break L8;
                                      } else {
                                        var4_int = 1;
                                        if (var11 == 0) {
                                          break L6;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    if (var9 != 43) {
                                      break L7;
                                    } else {
                                      if (!param3) {
                                        break L7;
                                      } else {
                                        if (var11 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                                L9: {
                                  L10: {
                                    if (var9 < 48) {
                                      break L10;
                                    } else {
                                      if (var9 > 57) {
                                        break L10;
                                      } else {
                                        var9 -= 48;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var9 < 65) {
                                      break L11;
                                    } else {
                                      if (var9 > 90) {
                                        break L11;
                                      } else {
                                        var9 -= 55;
                                        if (var11 == 0) {
                                          break L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  if (var9 < 97) {
                                    stackOut_29_0 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    decompiledRegionSelector0 = 0;
                                    break L0;
                                  } else {
                                    if (var9 <= 122) {
                                      var9 -= 87;
                                      break L9;
                                    } else {
                                      return false;
                                    }
                                  }
                                }
                                if (param2 > var9) {
                                  L12: {
                                    if (var4_int == 0) {
                                      break L12;
                                    } else {
                                      var9 = -var9;
                                      break L12;
                                    }
                                  }
                                  var10 = var9 + param2 * var6;
                                  if (var10 / param2 != var6) {
                                    stackOut_39_0 = 0;
                                    stackIn_40_0 = stackOut_39_0;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    var5 = 1;
                                    var6 = var10;
                                    break L6;
                                  }
                                } else {
                                  stackOut_33_0 = 0;
                                  stackIn_34_0 = stackOut_33_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                              var8++;
                              if (var11 == 0) {
                                continue L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (param0 == 65) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      field_f = (int[]) null;
                      break L3;
                    }
                    stackOut_45_0 = var5;
                    stackIn_46_0 = stackOut_45_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var4);
            stackOut_47_1 = new StringBuilder().append("pd.A(").append(param0).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L13;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L13;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_30_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_34_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_40_0 != 0;
            } else {
              return stackIn_46_0 != 0;
            }
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (!qb.field_b) {
          return;
        } else {
          if ((ck.field_b ^ -1) <= -1) {
            L0: {
              var1 = jk.field_u * th.field_o[ck.field_b] / 30;
              if (var1 <= th.field_o[ck.field_b]) {
                break L0;
              } else {
                var1 = th.field_o[ck.field_b];
                break L0;
              }
            }
            if (!param0) {
              return;
            } else {
              vh.field_E[ck.field_b].b(sl.field_k[ck.field_b], -((var1 + -th.field_o[ck.field_b]) / 2) + si.field_v[ck.field_b], m.field_e[ck.field_b], var1);
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, rk param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
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
            var4_float = (float)param1 / 100.0f + (float)(param0 + this.field_c);
            this.field_b = var4_float * (float)this.field_i / (float)(1 + this.field_a);
            if (0 == param1) {
              this.field_g = param2.field_f;
              return;
            } else {
              this.field_g = param2.field_b + " - " + param1 + "%";
              if (!MonkeyPuzzle2.field_F) {
                break L0;
              } else {
                this.field_g = param2.field_f;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("pd.D(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = null;
        int var1 = 71 % ((38 - param0) / 62);
        field_e = null;
    }

    private pd() throws Throwable {
        throw new Error();
    }

    final static java.awt.Frame a(int param0, int param1, md param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        eg[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        eg[] var10 = null;
        ic var11 = null;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_22_0 = 0;
        java.awt.Frame stackOut_35_0 = null;
        Object stackOut_33_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.a(2)) {
              L1: {
                if (param4 == param0) {
                  var10 = eg.a(param2, true);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var10.length <= var8) {
                            break L4;
                          } else {
                            stackOut_11_0 = var10[var8].field_a;
                            stackIn_23_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_12_0 != param3) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_b != param5) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (-1 == (param1 ^ -1)) {
                                        break L6;
                                      } else {
                                        if (param1 == var10[var8].field_g) {
                                          break L6;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (var10[var8].field_e <= param4) {
                                          break L5;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var7_int = 1;
                                    param4 = var10[var8].field_e;
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_22_0 = var7_int;
                        stackIn_23_0 = stackOut_22_0;
                        break L3;
                      }
                      if (stackIn_23_0 != 0) {
                        break L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param2.a(param3, param5, false, param1, param4);
              L8: while (true) {
                L9: {
                  if (-1 != (var11.field_g ^ -1)) {
                    break L9;
                  } else {
                    em.a(10L, false);
                    if (var9 == 0) {
                      continue L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var7 = (java.awt.Frame) (var11.field_b);
                if (var7 != null) {
                  if ((var11.field_g ^ -1) != -3) {
                    stackOut_35_0 = (java.awt.Frame) (var7);
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    rk.a(param2, var7, false);
                    stackOut_33_0 = null;
                    stackIn_34_0 = stackOut_33_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("pd.F(").append(param0).append(',').append(param1).append(',');
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
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_34_0);
        } else {
          return stackIn_36_0;
        }
    }

    static {
        field_h = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
