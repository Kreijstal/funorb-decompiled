/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj {
    static String field_d;
    private eb field_a;
    static int[] field_l;
    boolean field_e;
    db field_h;
    static boolean field_g;
    int field_i;
    int field_b;
    cd field_f;
    static String[] field_c;
    String field_k;
    static int[] field_j;

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var6 = qg.field_b;
            var1 = var6;
            var2 = 0;
            var4 = -47 / ((param0 - 44) / 52);
            var3 = var6.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var6[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "oj.C(" + param0 + ')');
        }
    }

    final static sh a(boolean param0, int param1) {
        if (param0) {
            oj.a(false, 68);
        }
        return il.a(true, 12317, false, param1, false, 1);
    }

    final void a(fc param0, int param1, char[] param2) {
        try {
            this.field_a.a(param2, param0.field_I, true, 256);
            if (param1 != 0) {
                field_j = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "oj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int[] param0, boolean param1, char[] param2) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var19 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param2.length;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= var4_int) {
                if (!param1) {
                  var16 = new int[var4_int];
                  var14 = var16;
                  var5 = var14;
                  var6 = 0;
                  L2: while (true) {
                    if (var4_int <= var6) {
                      dd.a(var16, -23588);
                      var19 = var5;
                      var7 = 0;
                      L3: while (true) {
                        if (var7 >= var19.length) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L4: {
                            var8 = var19[var7];
                            var9 = (short)var8;
                            if (-1 <= (param0[var9] ^ -1)) {
                              break L4;
                            } else {
                              var10 = -(var8 >> -1246102960);
                              var11 = 1 + var9;
                              L5: while (true) {
                                if (var10 + var9 <= var11) {
                                  var13 = 0;
                                  var11 = var13;
                                  L6: while (true) {
                                    if (var9 <= var13) {
                                      break L4;
                                    } else {
                                      L7: {
                                        if (var9 >= param0[var13] + var13) {
                                          break L7;
                                        } else {
                                          param0[var13] = 0;
                                          break L7;
                                        }
                                      }
                                      var13++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  param0[var11] = 0;
                                  var11++;
                                  continue L5;
                                }
                              }
                            }
                          }
                          var7++;
                          continue L3;
                        }
                      }
                    } else {
                      var5[var6] = (-param0[var6] << 108662480) - -var6;
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                param0[var5_int] = this.field_a.a(param2, (byte) 106, var5_int);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("oj.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -26) {
            oj.a(false, -114);
        }
        field_d = null;
        field_l = null;
        field_j = null;
    }

    final ng a(char[][] param0, int param1) {
        ng stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5_int = 0;
        char[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        int[] var10 = null;
        ng var11 = null;
        int var12 = 0;
        int[] var13 = null;
        char[] var15 = null;
        int[] var16 = null;
        char[] var18 = null;
        int[] var20 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var11 = new ng();
            var3 = var11;
            var16 = new int[param0[0].length];
            var13 = var16;
            var10 = var13;
            var4 = var10;
            var5_int = 0;
            L1: while (true) {
              if (param0.length <= var5_int) {
                var20 = new int[param0.length];
                var18 = new char[param0.length];
                var15 = var18;
                var5 = var15;
                var6 = 0;
                L2: while (true) {
                  if (param0[0].length <= var6) {
                    L3: {
                      if (param1 == 17161) {
                        break L3;
                      } else {
                        var9 = (char[]) null;
                        this.a((int[]) null, true, (char[]) null);
                        break L3;
                      }
                    }
                    stackIn_24_0 = (ng) (var3);
                    break L0;
                  } else {
                    var7 = 0;
                    L4: while (true) {
                      if (param0.length <= var7) {
                        this.a(var20, false, var18);
                        var12 = 0;
                        var7 = var12;
                        L5: while (true) {
                          if (var12 >= var18.length) {
                            var6++;
                            continue L2;
                          } else {
                            L6: {
                              if (0 == var20[var12]) {
                                break L6;
                              } else {
                                var3.b(param1 + -17053, pc.a(-var12 + param0.length + -1, 1, (byte) 14, var6, var20[var12]));
                                break L6;
                              }
                            }
                            var12++;
                            continue L5;
                          }
                        }
                      } else {
                        var5[var7] = param0[param0.length - 1 + -var7][var6];
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                this.a(var16, false, param0[var5_int]);
                var6 = 0;
                L7: while (true) {
                  if (var16.length <= var6) {
                    var5_int++;
                    continue L1;
                  } else {
                    L8: {
                      if (var16[var6] != 0) {
                        var11.b(121, pc.a(var5_int, var16[var6], (byte) 14, var6, 1));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var6++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3_ref);

            stackIn_27_1 = new StringBuilder().append("oj.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    oj(sh param0, sh param1, eb param2) {
        int stackIn_11_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        cd stackIn_21_1 = null;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        NumberFormatException var9 = null;
        String var10 = null;
        String var12 = null;
        CharSequence var13 = null;
        try {
          L0: {
            this.field_a = param2;
            this.field_i = param2.field_g;
            var4_int = 0;
            var5 = null;
            var6 = null;
            var7 = null;
            var8 = 0;
            L1: while (true) {
              if (var8 >= param2.field_c.length) {
                L2: {
                  stackIn_17_0 = this;

                  if (var4_int == 0) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = 0;
                    break L2;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((oj) (this)).field_e = stackIn_18_1 != 0;
                  this.field_k = (String) (var5);
                  var13 = (CharSequence) ((Object) ("flag_" + (String) (var5)));
                  this.field_h = df.a("", ef.a(var13, (byte) -14), param0, (byte) -92);
                  stackIn_20_0 = this;

                  if (var6 == null) {
                    stackIn_21_0 = this;
                    stackIn_21_1 = bi.field_a;
                    break L3;
                  } else {
                    stackIn_21_0 = this;
                    stackIn_21_1 = hb.a(param1, 246, "", ef.a((CharSequence) (var6), (byte) -82), param0);
                    break L3;
                  }
                }
                L4: {
                  ((oj) (this)).field_f = stackIn_21_1;
                  var8 = -1;
                  if (var7 != null) {
                    try {
                      L5: {
                        var8 = si.a((byte) 115, (CharSequence) (var7));
                        break L5;
                      }
                    } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        var9 = (NumberFormatException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  stackIn_28_0 = this;

                  if (-1 == var8) {
                    stackIn_30_0 = this;

                    if (var6 != null) {
                      stackIn_31_0 = this;
                      stackIn_31_1 = this.field_f.field_E;
                      break L7;
                    } else {
                      stackIn_31_0 = this;
                      stackIn_31_1 = pa.field_d;
                      break L7;
                    }
                  } else {
                    stackIn_31_0 = this;
                    stackIn_31_1 = var8;
                    break L7;
                  }
                }
                ((oj) (this)).field_b = stackIn_31_1;
                break L0;
              } else {
                L8: {
                  var12 = param2.field_c[var8][0];
                  var10 = param2.field_c[var8][1];
                  if ("lang".equals(var12)) {
                    var5 = var10;
                    break L8;
                  } else {
                    if ("font".equals(var12)) {
                      var6 = var10;
                      break L8;
                    } else {
                      if (!"fhei".equals(var12)) {
                        if (!"disabled".equals(var12)) {
                          break L8;
                        } else {
                          L9: {
                            if (!var10.equals("true")) {
                              stackIn_11_0 = 0;
                              break L9;
                            } else {
                              stackIn_11_0 = 1;
                              break L9;
                            }
                          }
                          var4_int = stackIn_11_0;
                          break L8;
                        }
                      } else {
                        var7 = var10;
                        break L8;
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var4);

            stackIn_35_1 = new StringBuilder().append("oj.<init>(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L12;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_36_0), stackIn_42_2 + ')');
        }
    }

    static {
        field_c = new String[]{"Use the \"Next\" box to plan ahead.", "In \"Standard\" mode the speed at which blocks rotate and move horizontally increases, up until level 4.", "In \"Delicate\" mode the speed increases until level 8, making control of the blocks more difficult – but enabling you to react faster.", "Note that the only way to clear tiles is to make words with them."};
        field_d = "You have 1 unread message!";
    }
}
