/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nf {
    private ad field_f;
    String field_d;
    String field_h;
    static String field_q;
    mi field_c;
    boolean field_g;
    int[] field_p;
    static java.awt.Frame field_e;
    ti field_a;
    static tf field_m;
    static String field_i;
    String field_j;
    String field_n;
    int field_o;
    static hj field_l;
    String field_b;
    static int field_k;

    final char a(int param0, char param1) {
        if (param0 != 0) {
            char discarded$0 = ((nf) this).a(89, '');
        }
        return Character.toUpperCase(param1);
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_q = null;
        field_l = null;
        field_m = null;
        if (param0 != -41) {
            nf.a((byte) -93);
        }
    }

    final boolean a(int param0, sj[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0 == -1) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (param1.length <= var3_int) {
                  break L3;
                } else {
                  if (null == param1[var3_int]) {
                    break L3;
                  } else {
                    var3_int++;
                    continue L2;
                  }
                }
              }
              var4 = new char[var3_int];
              var5 = 0;
              L4: while (true) {
                if (var3_int <= var5) {
                  stackOut_9_0 = ((nf) this).field_f.a((byte) 109, var4);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  var4[var5] = param1[var5].field_i;
                  var5++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("nf.D(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final void a(byte param0, char[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 92) {
                break L1;
              } else {
                ((nf) this).field_f = null;
                break L1;
              }
            }
            L2: while (true) {
              ((nf) this).field_f.a(param1, o.field_o, false, 3670);
              var3_int = 0;
              var4 = 0;
              L3: while (true) {
                if (256 <= var4) {
                  var7 = 0;
                  var4 = var7;
                  L4: while (true) {
                    if (var7 >= param1.length) {
                      if (var3_int != 0) {
                        break L0;
                      } else {
                        continue L2;
                      }
                    } else {
                      L5: {
                        var5 = param1[var7] & 255;
                        if (-1 >= ((nf) this).field_d.indexOf(var5)) {
                          break L5;
                        } else {
                          var3_int = 1;
                          break L5;
                        }
                      }
                      ic.field_c[var5] = ic.field_c[var5] + 1;
                      if (ic.field_c[var5] + 1 == 4) {
                        continue L2;
                      } else {
                        var7++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  ic.field_c[var4] = 0;
                  var4++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("nf.A(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    nf(ci param0, ci param1, ad param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        NumberFormatException var12 = null;
        int var12_int = 0;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        NumberFormatException var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        char[] var24 = null;
        Object var25 = null;
        Object var26 = null;
        CharSequence var27 = null;
        CharSequence var28 = null;
        int stackIn_39_0 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        mi stackIn_54_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
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
        Throwable decompiledCaughtException = null;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        mi stackOut_53_1 = null;
        Object stackOut_52_0 = null;
        mi stackOut_52_1 = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
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
        var25 = null;
        var26 = null;
        ((nf) this).field_p = new int[512];
        try {
          L0: {
            ((nf) this).field_f = param2;
            ((nf) this).field_o = param2.field_d;
            var4_int = 0;
            var5 = null;
            var6 = null;
            var7 = null;
            var8 = null;
            var9 = null;
            var10 = null;
            var11 = null;
            var12_int = 0;
            L1: while (true) {
              if (param2.field_c.length <= var12_int) {
                L2: {
                  stackOut_44_0 = this;
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_45_0 = stackOut_44_0;
                  if (var4_int == 0) {
                    stackOut_46_0 = this;
                    stackOut_46_1 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    break L2;
                  } else {
                    stackOut_45_0 = this;
                    stackOut_45_1 = 1;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = stackOut_45_1;
                    break L2;
                  }
                }
                L3: {
                  ((nf) this).field_g = stackIn_47_1 != 0;
                  if (var8 != null) {
                    ((nf) this).field_d = ((String) var8).toUpperCase();
                    break L3;
                  } else {
                    ((nf) this).field_d = "AEIOU";
                    if (2 > va.field_j) {
                      break L3;
                    } else {
                      System.out.println("Forced to use default vowels for " + (String) var5);
                      break L3;
                    }
                  }
                }
                L4: {
                  ((nf) this).field_n = (String) var10;
                  ((nf) this).field_b = (String) var9;
                  ((nf) this).field_h = (String) var11;
                  ((nf) this).field_j = (String) var5;
                  var28 = (CharSequence) (Object) ("flag_" + (String) var5);
                  ((nf) this).field_a = pc.a("", dj.a(var28, (byte) -123), param0, -124);
                  stackOut_51_0 = this;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_52_0 = stackOut_51_0;
                  if (var6 != null) {
                    stackOut_53_0 = this;
                    stackOut_53_1 = am.a(dj.a((CharSequence) var6, (byte) -121), param0, (byte) 72, param1, "");
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    break L4;
                  } else {
                    stackOut_52_0 = this;
                    stackOut_52_1 = wf.field_d;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    break L4;
                  }
                }
                L5: {
                  ((nf) this).field_c = stackIn_54_1;
                  if (var7 == null) {
                    break L5;
                  } else {
                    try {
                      L6: {
                        int discarded$1 = aa.a(89, (CharSequence) var7);
                        break L6;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L7: {
                        var12 = (NumberFormatException) (Object) decompiledCaughtException;
                        break L7;
                      }
                    }
                    break L5;
                  }
                }
                break L0;
              } else {
                L8: {
                  var13 = param2.field_c[var12_int][0];
                  var14 = param2.field_c[var12_int][1];
                  if (!var13.startsWith("val")) {
                    if (!"lang".equals((Object) (Object) var13)) {
                      if ("font".equals((Object) (Object) var13)) {
                        var6 = (Object) (Object) var14;
                        break L8;
                      } else {
                        if ("fhei".equals((Object) (Object) var13)) {
                          var7 = (Object) (Object) var14;
                          break L8;
                        } else {
                          if (!"vowels".equals((Object) (Object) var13)) {
                            if (!"tut1".equals((Object) (Object) var13)) {
                              if ("tut2".equals((Object) (Object) var13)) {
                                var10 = (Object) (Object) var14.toUpperCase();
                                break L8;
                              } else {
                                if (!"hint1".equals((Object) (Object) var13)) {
                                  if ("disabled".equals((Object) (Object) var13)) {
                                    L9: {
                                      if (!var14.equals((Object) (Object) "true")) {
                                        stackOut_38_0 = 0;
                                        stackIn_39_0 = stackOut_38_0;
                                        break L9;
                                      } else {
                                        stackOut_37_0 = 1;
                                        stackIn_39_0 = stackOut_37_0;
                                        break L9;
                                      }
                                    }
                                    var4_int = stackIn_39_0;
                                    break L8;
                                  } else {
                                    if (va.field_j < 2) {
                                      break L8;
                                    } else {
                                      System.out.println("Unrecognised config option: " + var13);
                                      break L8;
                                    }
                                  }
                                } else {
                                  var11 = (Object) (Object) var14;
                                  break L8;
                                }
                              }
                            } else {
                              var9 = (Object) (Object) var14.toUpperCase();
                              break L8;
                            }
                          } else {
                            var8 = (Object) (Object) var14;
                            break L8;
                          }
                        }
                      }
                    } else {
                      var5 = (Object) (Object) var14;
                      break L8;
                    }
                  } else {
                    var16 = 0;
                    try {
                      L10: {
                        L11: {
                          var27 = (CharSequence) (Object) var13.substring(3);
                          var15 = aa.a(-104, var27);
                          if (var15 <= 0) {
                            var16 = 1;
                            break L11;
                          } else {
                            var24 = var14.toCharArray();
                            var18 = 0;
                            L12: while (true) {
                              if (var24.length <= var18) {
                                break L11;
                              } else {
                                L13: {
                                  var19 = var24[var18];
                                  if (2 > va.field_j) {
                                    break L13;
                                  } else {
                                    if (0 == ((nf) this).field_p[var19]) {
                                      break L13;
                                    } else {
                                      System.out.println("Multiple letter values found for" + (char) var19);
                                      break L13;
                                    }
                                  }
                                }
                                L14: {
                                  ((nf) this).field_p[var19] = var15;
                                  var20 = ((nf) this).a(0, (char) var19);
                                  if (va.field_j < 2) {
                                    break L14;
                                  } else {
                                    if (var20 == var19) {
                                      break L14;
                                    } else {
                                      if (((nf) this).field_p[var20] == 0) {
                                        break L14;
                                      } else {
                                        System.out.println("Multiple letter values found for " + (char) var20);
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                ((nf) this).field_p[var20] = var15;
                                var18++;
                                continue L12;
                              }
                            }
                          }
                        }
                        break L10;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L15: {
                        var17 = (NumberFormatException) (Object) decompiledCaughtException;
                        var16 = 1;
                        break L15;
                      }
                    }
                    if (va.field_j < 2) {
                      break L8;
                    } else {
                      if (var16 == 0) {
                        break L8;
                      } else {
                        System.out.println("Unrecognised config option: " + var13);
                        break L8;
                      }
                    }
                  }
                }
                var12_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L16: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var4;
            stackOut_59_1 = new StringBuilder().append("nf.<init>(");
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
              break L16;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L16;
            }
          }
          L17: {
            stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L17;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L17;
            }
          }
          L18: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L18;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L18;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Player";
        field_m = new tf(0, 2, 2, 1);
        field_k = -1;
    }
}
