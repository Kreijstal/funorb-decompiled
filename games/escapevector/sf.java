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
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        Object stackIn_35_0 = null;
        String stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        String stackOut_36_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
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
                stackOut_9_0 = var3;
                stackIn_12_0 = stackOut_9_0;
                L3: while (true) {
                  L4: {
                    if (stackIn_12_0 <= var2_int) {
                      break L4;
                    } else {
                      if (!fd.a(true, param1.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        stackOut_11_0 = var3;
                        stackIn_12_0 = stackOut_11_0;
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
                            stackOut_36_0 = var5.toString();
                            stackIn_37_0 = stackOut_36_0;
                            break L0;
                          } else {
                            stackOut_34_0 = null;
                            stackIn_35_0 = stackOut_34_0;
                            return (String) (Object) stackIn_35_0;
                          }
                        } else {
                          var7 = param1.charAt(var6);
                          int discarded$1 = -11217;
                          if (d.a((char) var7)) {
                            L7: {
                              var8 = eo.a(227, (char) var7);
                              if (0 == var8) {
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var6++;
                            continue L6;
                          } else {
                            var6++;
                            continue L6;
                          }
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
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("sf.B(").append(param0).append(44);
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
        }
        return stackIn_37_0;
    }

    final void b(int param0, int param1) {
        ((sf) this).field_a = ((sf) this).field_a + param1;
        ((sf) this).field_j = ((sf) this).field_j + param1;
        ((sf) this).field_l = ((sf) this).field_l + param1;
        ((sf) this).field_h = ((sf) this).field_h + param1;
        ((sf) this).field_f = ((sf) this).field_f + param1;
        ((sf) this).field_r = ((sf) this).field_r + param1;
        if (param0 != -1) {
            field_d = null;
        }
        ((sf) this).field_o = ((sf) this).field_o + param1;
        ((sf) this).field_j = ((sf) this).field_j + param1;
    }

    private final void c(int param0, int param1) {
        if (param0 != 136) {
            ((sf) this).d(42, -12);
            return;
        }
    }

    final void a(int param0, int param1) {
        if (param1 != 3748) {
            return;
        }
        ((sf) this).field_q = ((sf) this).field_q | 1 << param0;
    }

    final int[] c(int param0) {
        if (param0 != 0) {
            ((sf) this).a((byte) -83);
        }
        this.c(136, this.b(~param0));
        return new int[]{((sf) this).field_j, ((sf) this).field_l, ((sf) this).field_q, ((sf) this).field_o};
    }

    final void d(int param0, int param1) {
        if (param1 != 136) {
            ((sf) this).a((byte) 23);
        }
        ((sf) this).field_r = ((sf) this).field_r + param0;
    }

    final int[] d(int param0) {
        if (param0 != 31304) {
            int[] discarded$0 = ((sf) this).c(97);
        }
        this.c(param0 + -31168, this.b(-1));
        return new int[]{((sf) this).field_j, ((sf) this).field_l, 0, ((sf) this).field_o};
    }

    private final int b(int param0) {
        oe var2 = ma.field_a;
        if (null == var2) {
            return 0;
        }
        int var3 = var2.field_ob;
        int var4 = var2.field_fc;
        var3 = tj.a(var4, (byte) 126, var3);
        if (param0 != -1) {
            ((sf) this).b(90, -103);
        }
        return var3;
    }

    final void a(byte param0) {
        int var2 = -78 / ((param0 - -73) / 35);
        ((sf) this).field_f = ((sf) this).field_f + ((sf) this).field_p;
        ((sf) this).field_h = ((sf) this).field_h + ((sf) this).field_i;
        ((sf) this).field_j = ((sf) this).field_j + ((sf) this).field_g;
        ((sf) this).field_r = ((sf) this).field_r + ((sf) this).field_p;
        ((sf) this).field_l = ((sf) this).field_l + ((sf) this).field_g;
        ((sf) this).field_a = ((sf) this).field_a + ((sf) this).field_i;
        ((sf) this).field_j = ((sf) this).field_j + ((sf) this).field_k;
        ((sf) this).field_o = ((sf) this).field_o + ((sf) this).field_k;
    }

    final static tk a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        tk stackIn_5_0 = null;
        tk stackIn_10_0 = null;
        tk stackIn_16_0 = null;
        int stackIn_27_0 = 0;
        tk stackIn_35_0 = null;
        tk stackIn_57_0 = null;
        tk stackIn_63_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_4_0 = null;
        tk stackOut_9_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        tk stackOut_34_0 = null;
        tk stackOut_15_0 = null;
        tk stackOut_56_0 = null;
        tk stackOut_62_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var6 = EscapeVector.field_A;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_4_0 = mf.field_d;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          } else {
            if (var2_int > 64) {
              stackOut_9_0 = d.field_c;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              if (34 == param0.charAt(0)) {
                if (param0.charAt(var2_int - 1) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (var4 < var2_int - 1) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_26_0 = 0;
                              stackIn_27_0 = stackOut_26_0;
                              break L2;
                            } else {
                              stackOut_24_0 = 1;
                              stackIn_27_0 = stackOut_24_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_27_0;
                          break L1;
                        } else {
                          L3: {
                            if (34 != var5) {
                              break L3;
                            } else {
                              if (var3 == 0) {
                                stackOut_34_0 = wh.field_p;
                                stackIn_35_0 = stackOut_34_0;
                                return stackIn_35_0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_15_0 = wh.field_p;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                }
              } else {
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (var4 < var2_int) {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 == 46) {
                        L6: {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            if (~(var2_int + -1) == ~var4) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_56_0 = wh.field_p;
                        stackIn_57_0 = stackOut_56_0;
                        return stackIn_57_0;
                      } else {
                        if (en.field_g.indexOf(var5) == -1) {
                          stackOut_62_0 = wh.field_p;
                          stackIn_63_0 = stackOut_62_0;
                          return stackIn_63_0;
                        } else {
                          var3 = 0;
                          break L5;
                        }
                      }
                    }
                    var4++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("sf.C(");
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L7;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + 119 + 41);
        }
    }

    final int[] a(int param0) {
        this.c(136, this.b(-1));
        int var2 = 0 / ((1 - param0) / 35);
        return new int[]{((sf) this).field_r, ((sf) this).field_h, ((sf) this).field_f, ((sf) this).field_a};
    }

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0) {
            Object var2 = null;
            String discarded$0 = sf.a(27, (CharSequence) null);
        }
        field_n = null;
        field_m = null;
    }

    sf(int param0) {
        ((sf) this).field_h = 136;
        ((sf) this).field_g = 203;
        ((sf) this).field_a = 10;
        ((sf) this).field_f = 30589;
        ((sf) this).field_l = 247;
        ((sf) this).field_j = 201;
        ((sf) this).field_i = 50;
        ((sf) this).field_q = 0;
        ((sf) this).field_p = 65;
        ((sf) this).field_o = 10325;
        ((sf) this).field_k = 7;
        ((sf) this).field_r = 138;
        ((sf) this).b(-1, param0);
        ((sf) this).a((byte) -19);
        this.c(136, this.b(-1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hf();
        field_n = "Legend";
        field_c = 0;
        field_m = new int[4];
        field_e = new hh[17];
    }
}
