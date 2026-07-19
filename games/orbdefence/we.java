/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends ta implements ai {
    static String field_F;
    static String field_A;
    static boolean field_B;
    private String[] field_D;
    private bf field_E;
    private s[] field_C;

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        s stackIn_4_0 = null;
        s stackIn_4_1 = null;
        s stackIn_6_0 = null;
        s stackIn_6_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        s stackOut_3_0 = null;
        s stackOut_3_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6_int >= this.field_D.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = (s) (param3);
                    stackOut_3_1 = this.field_C[var6_int];
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_6_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var7 != 0) {
                      if (stackIn_6_0 == stackIn_6_1) {
                        break L2;
                      } else {
                        return;
                      }
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          break L4;
                        } else {
                          this.field_E.a(120, this.field_D[var6_int]);
                          break L4;
                        }
                      }
                      var6_int++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6_int = 2 % ((-3 - param0) / 62);
                if (this.field_C[this.field_D.length] == param3) {
                  break L2;
                } else {
                  return;
                }
              }
              this.field_E.a((byte) -8);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("we.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param1 ^ -1)) {
                if (-100 == (param1 ^ -1)) {
                  stackOut_9_0 = this.b(param2, false);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = this.a(param2, false);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("we.I(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    we(bf param0) {
        super(0, 0, 0, 0, (td) null);
        try {
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        kc var5 = null;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          var5 = lm.field_f;
          if (null != this.field_D) {
            discarded$2 = var5.a(pe.field_c, this.field_s + param3, this.field_n + param0, this.field_m, 20, 16777215, -1, 0, 0, var5.field_B + var5.field_H);
            return;
          } else {
            return;
          }
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        qc var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_x.a(false);
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length == 0) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_D = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    L3: {
                      if (var3_int <= var4_int) {
                        break L3;
                      } else {
                        this.field_D[var4_int] = g.a((CharSequence) ((Object) param0[var4_int]), (byte) -119).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 = new qc(lm.field_f, 0, 1);
                    this.field_C = new s[1 + var3_int];
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          L6: {
                            if (param1 == -34) {
                              break L6;
                            } else {
                              this.a(95, -43, 80, 127);
                              break L6;
                            }
                          }
                          this.field_C[var3_int] = new s(mm.field_B, (ag) (this));
                          this.field_C[var3_int].field_j = (td) ((Object) var4);
                          this.field_C[var3_int].a(0, 20 + (var3_int + 1) * 16, 15, (byte) -90, 100);
                          this.a(this.field_C[var3_int], (byte) 74);
                          break L5;
                        } else {
                          this.field_C[var5] = new s(this.field_D[var5], (ag) (this));
                          this.field_C[var5].field_j = (td) ((Object) var4);
                          this.field_C[var5].field_i = oa.field_f;
                          this.field_C[var5].a(0, var5 * 16 + 20, 15, (byte) -90, 80);
                          this.a(this.field_C[var5], (byte) 74);
                          var5++;
                          if (var6 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            this.field_D = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("we.N(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        boolean discarded$1 = false;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        int stackIn_10_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 87) {
                break L1;
              } else {
                var12 = (CharSequence) null;
                discarded$1 = we.a(24, 92, (CharSequence) null, true);
                break L1;
              }
            }
            L2: {
              if (2 > param0) {
                break L2;
              } else {
                if (-37 <= (param0 ^ -1)) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L3: while (true) {
                    L4: {
                      if (var8 >= var7) {
                        stackOut_42_0 = var5;
                        stackIn_43_0 = stackOut_42_0;
                        break L4;
                      } else {
                        var9 = param2.charAt(var8);
                        stackOut_9_0 = -1;
                        stackIn_43_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_10_0 != (var8 ^ -1)) {
                                break L6;
                              } else {
                                L7: {
                                  if (var9 != 45) {
                                    break L7;
                                  } else {
                                    var4_int = 1;
                                    if (var11 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                if (var9 != 43) {
                                  break L6;
                                } else {
                                  if (param3) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L8: {
                              L9: {
                                if (var9 < 48) {
                                  break L9;
                                } else {
                                  if (57 < var9) {
                                    break L9;
                                  } else {
                                    var9 -= 48;
                                    break L8;
                                  }
                                }
                              }
                              L10: {
                                if (var9 < 65) {
                                  break L10;
                                } else {
                                  if (90 < var9) {
                                    break L10;
                                  } else {
                                    var9 -= 55;
                                    if (var11 == 0) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              if (97 > var9) {
                                stackOut_27_0 = 0;
                                stackIn_28_0 = stackOut_27_0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                if (var9 <= 122) {
                                  var9 -= 87;
                                  if (var11 == 0) {
                                    break L8;
                                  } else {
                                    var9 -= 48;
                                    break L8;
                                  }
                                } else {
                                  return false;
                                }
                              }
                            }
                            if (param0 <= var9) {
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              L11: {
                                if (var4_int == 0) {
                                  break L11;
                                } else {
                                  var9 = -var9;
                                  break L11;
                                }
                              }
                              var10 = var6 * param0 - -var9;
                              if (var10 / param0 == var6) {
                                var6 = var10;
                                var5 = 1;
                                break L5;
                              } else {
                                stackOut_38_0 = 0;
                                stackIn_39_0 = stackOut_38_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var4);
            stackOut_44_1 = new StringBuilder().append("we.K(").append(param0).append(',').append(param1).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L12;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_43_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_39_0 != 0;
            }
          }
        }
    }

    public static void k(int param0) {
        field_A = null;
        if (param0 != 29858) {
            return;
        }
        field_F = null;
    }

    static {
        field_F = "Score";
        field_A = "TOUGHO";
        field_B = false;
    }
}
