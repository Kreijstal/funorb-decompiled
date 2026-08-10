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
        int var3;
        rk var4;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 28296) {
          L0: while (true) {
            if (this.field_a <= this.field_c) {
              return true;
            } else {
              var4 = this.field_d[this.field_c];
              if (!var4.field_e.a(-72)) {
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
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
                    if (var8 >= var7) {
                      L3: {
                        if (param0 == 65) {
                          break L3;
                        } else {
                          field_f = (int[]) null;
                          break L3;
                        }
                      }
                      stackIn_41_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if ((var8 ^ -1) != -1) {
                            break L5;
                          } else {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param3) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          if (var9 < 97) {
                            stackIn_25_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L6;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param2 > var9) {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = var9 + param2 * var6;
                          if (var10 / param2 != var6) {
                            stackIn_35_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        } else {
                          stackIn_29_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                      var8++;
                      continue L2;
                    }
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
          L10: {
            var4 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var4);

            stackIn_44_1 = new StringBuilder().append("pd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L10;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              return stackIn_41_0 != 0;
            }
          }
        }
    }

    final static void a(boolean param0) {
        if (!(qb.field_b)) {
            return;
        }
        if ((ck.field_b ^ -1) > -1) {
            return;
        }
        int var1 = jk.field_u * th.field_o[ck.field_b] / 30;
        if (var1 > th.field_o[ck.field_b]) {
            var1 = th.field_o[ck.field_b];
        }
        if (!param0) {
            return;
        }
        vh.field_E[ck.field_b].b(sl.field_k[ck.field_b], -((var1 + -th.field_o[ck.field_b]) / 2) + si.field_v[ck.field_b], m.field_e[ck.field_b], var1);
    }

    private final void a(int param0, int param1, rk param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_float = (float)param1 / 100.0f + (float)(param0 + this.field_c);
              this.field_b = var4_float * (float)this.field_i / (float)(1 + this.field_a);
              if (0 == param1) {
                this.field_g = param2.field_f;
                break L1;
              } else {
                this.field_g = param2.field_b + " - " + param1 + "%";
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("pd.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
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
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        eg[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        eg[] var10 = null;
        ic var11 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.a(2)) {
              L1: {
                if (param4 == param0) {
                  var10 = eg.a(param2, true);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (var10[var8].field_a == param3) {
                          if (var10[var8].field_b == param5) {
                            L3: {
                              L4: {
                                if (-1 == (param1 ^ -1)) {
                                  break L4;
                                } else {
                                  if (param1 == var10[var8].field_g) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_e > param4) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              var7_int = 1;
                              param4 = var10[var8].field_e;
                              break L3;
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
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
              L6: while (true) {
                if (-1 != (var11.field_g ^ -1)) {
                  var7 = (java.awt.Frame) (var11.field_b);
                  if (var7 != null) {
                    if ((var11.field_g ^ -1) != -3) {
                      stackIn_37_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      rk.a(param2, var7, false);
                      stackIn_35_0 = null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  em.a(10L, false);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var6_ref);

            stackIn_40_1 = new StringBuilder().append("pd.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_35_0);
        } else {
          return stackIn_37_0;
        }
    }

    static {
        field_h = "If you do nothing the game will revert to normal view in <%0> second.";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
