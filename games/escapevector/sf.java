/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private int field_q;
    private int field_r;
    private int field_h;
    private int field_g;
    private int field_l;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    static hf field_d;
    private int field_p;
    static int[] field_m;
    static String field_n;
    static int field_c;
    private int field_k;
    static ed[] field_b;
    private int field_o;
    static hh[] field_e;

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$1 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_29_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!fd.a(true, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!fd.a(true, param1.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (12 >= var4) {
                      L5: {
                        var5 = new StringBuilder(var4);
                        if (param0 <= -65) {
                          break L5;
                        } else {
                          sf.a(true);
                          break L5;
                        }
                      }
                      var6 = var2_int;
                      L6: while (true) {
                        if (var6 >= var3) {
                          if (var5.length() != 0) {
                            stackOut_29_0 = var5.toString();
                            stackIn_30_0 = stackOut_29_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            stackOut_27_0 = null;
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          L7: {
                            var7 = param1.charAt(var6);
                            if (d.a((char) var7, -11217)) {
                              var8 = eo.a(227, (char) var7);
                              if (0 == var8) {
                                break L7;
                              } else {
                                discarded$1 = var5.append((char) var8);
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("sf.B(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_28_0);
          } else {
            return stackIn_30_0;
          }
        }
    }

    final void b(int param0, int param1) {
        this.field_a = this.field_a + param1;
        this.field_j = this.field_j + param1;
        this.field_l = this.field_l + param1;
        this.field_h = this.field_h + param1;
        this.field_f = this.field_f + param1;
        this.field_r = this.field_r + param1;
        if (param0 != -1) {
            field_d = (hf) null;
        }
        this.field_o = this.field_o + param1;
        this.field_j = this.field_j + param1;
    }

    private final void c(int param0, int param1) {
        if (param0 != 136) {
            this.d(42, -12);
            return;
        }
    }

    final void a(int param0, int param1) {
        if (param1 != 3748) {
            return;
        }
        this.field_q = this.field_q | 1 << param0;
    }

    final int[] c(int param0) {
        if (param0 != 0) {
            this.a((byte) -83);
        }
        this.c(136, this.b(param0 ^ -1));
        return new int[]{this.field_j, this.field_l, this.field_q, this.field_o};
    }

    final void d(int param0, int param1) {
        if (param1 != 136) {
            this.a((byte) 23);
        }
        this.field_r = this.field_r + param0;
    }

    final int[] d(int param0) {
        int[] discarded$0 = null;
        if (param0 != 31304) {
            discarded$0 = this.c(97);
        }
        this.c(param0 + -31168, this.b(-1));
        return new int[]{this.field_j, this.field_l, 0, this.field_o};
    }

    private final int b(int param0) {
        oe var2 = ma.field_a;
        if (var2 == null) {
            return 0;
        }
        int var3 = var2.field_ob;
        int var4 = var2.field_fc;
        var3 = tj.a(var4, (byte) 126, var3);
        if (param0 != -1) {
            this.b(90, -103);
        }
        return var3;
    }

    final void a(byte param0) {
        int var2 = -78 / ((param0 - -73) / 35);
        this.field_f = this.field_f + this.field_p;
        this.field_h = this.field_h + this.field_i;
        this.field_j = this.field_j + this.field_g;
        this.field_r = this.field_r + this.field_p;
        this.field_l = this.field_l + this.field_g;
        this.field_a = this.field_a + this.field_i;
        this.field_j = this.field_j + this.field_k;
        this.field_o = this.field_o + this.field_k;
    }

    final static tk a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        tk stackIn_4_0 = null;
        tk stackIn_8_0 = null;
        tk stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        tk stackIn_27_0 = null;
        tk stackIn_33_0 = null;
        tk stackIn_44_0 = null;
        tk stackIn_49_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_3_0 = null;
        tk stackOut_7_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        tk stackOut_26_0 = null;
        tk stackOut_12_0 = null;
        tk stackOut_43_0 = null;
        tk stackOut_48_0 = null;
        tk stackOut_32_0 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackOut_3_0 = mf.field_d;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackOut_7_0 = d.field_c;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (34 == param0.charAt(0)) {
                  if (param0.charAt(var2_int - 1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (var4 < var2_int - 1) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L3: {
                              if (var3 != 0) {
                                stackOut_21_0 = 0;
                                stackIn_22_0 = stackOut_21_0;
                                break L3;
                              } else {
                                stackOut_20_0 = 1;
                                stackIn_22_0 = stackOut_20_0;
                                break L3;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L2;
                          } else {
                            L4: {
                              if (34 != var5) {
                                break L4;
                              } else {
                                if (var3 == 0) {
                                  stackOut_26_0 = wh.field_p;
                                  stackIn_27_0 = stackOut_26_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_12_0 = wh.field_p;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if (param1 == 119) {
                    var3 = 0;
                    var4 = 0;
                    L5: while (true) {
                      if (var4 < var2_int) {
                        L6: {
                          var5 = param0.charAt(var4);
                          if (var5 == 46) {
                            L7: {
                              if (var4 == 0) {
                                break L7;
                              } else {
                                if (var2_int + -1 == var4) {
                                  break L7;
                                } else {
                                  if (var3 == 0) {
                                    var3 = 1;
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            stackOut_43_0 = wh.field_p;
                            stackIn_44_0 = stackOut_43_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (en.field_g.indexOf(var5) == -1) {
                              stackOut_48_0 = wh.field_p;
                              stackIn_49_0 = stackOut_48_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var3 = 0;
                              break L6;
                            }
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_32_0 = (tk) null;
                    stackIn_33_0 = stackOut_32_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) (var2);
            stackOut_53_1 = new StringBuilder().append("sf.C(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L8;
            } else {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_27_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_44_0;
                  } else {
                    return stackIn_49_0;
                  }
                }
              }
            }
          }
        }
    }

    final int[] a(int param0) {
        this.c(136, this.b(-1));
        int var2 = 0 / ((1 - param0) / 35);
        return new int[]{this.field_r, this.field_h, this.field_f, this.field_a};
    }

    public static void a(boolean param0) {
        String discarded$0 = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = sf.a(27, (CharSequence) null);
        }
        field_n = null;
        field_m = null;
    }

    sf(int param0) {
        this.field_h = 136;
        this.field_g = 203;
        this.field_a = 10;
        this.field_f = 30589;
        this.field_l = 247;
        this.field_j = 201;
        this.field_i = 50;
        this.field_q = 0;
        this.field_p = 65;
        this.field_o = 10325;
        this.field_k = 7;
        this.field_r = 138;
        this.b(-1, param0);
        this.a((byte) -19);
        this.c(136, this.b(-1));
    }

    static {
        field_d = new hf();
        field_n = "Legend";
        field_c = 0;
        field_m = new int[4];
        field_e = new hh[17];
    }
}
