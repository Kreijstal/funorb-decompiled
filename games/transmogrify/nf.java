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
            this.a(89, '');
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0 == -1) {
                break L1;
              } else {
                field_l = (hj) null;
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
                  stackIn_10_0 = this.field_f.a((byte) 109, var4);
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
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("nf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final void a(byte param0, char[] param1) {
        int dupTemp$1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 92) {
                break L1;
              } else {
                this.field_f = (ad) null;
                break L1;
              }
            }
            L2: while (true) {
              this.field_f.a(param1, o.field_o, false, 3670);
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
                        if (-1 >= this.field_d.indexOf(var5)) {
                          break L5;
                        } else {
                          var3_int = 1;
                          break L5;
                        }
                      }
                      dupTemp$1 = ic.field_c[var5] + 1;
                      ic.field_c[var5] = dupTemp$1;
                      if ((dupTemp$1 ^ -1) == -5) {
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
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("nf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    nf(ci param0, ci param1, ad param2) {
        int stackIn_39_0 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        mi stackIn_54_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        int var12_int = 0;
        NumberFormatException var12 = null;
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
        var25 = null;
        var26 = null;
        this.field_p = new int[512];
        try {
          L0: {
            this.field_f = param2;
            this.field_o = param2.field_d;
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
                  stackIn_46_0 = this;

                  if (var4_int == 0) {
                    stackIn_47_0 = this;
                    stackIn_47_1 = 0;
                    break L2;
                  } else {
                    stackIn_47_0 = this;
                    stackIn_47_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((nf) (this)).field_g = stackIn_47_1 != 0;
                  if (var8 != null) {
                    this.field_d = ((String) (var8)).toUpperCase();
                    break L3;
                  } else {
                    this.field_d = "AEIOU";
                    if (2 > va.field_j) {
                      break L3;
                    } else {
                      System.out.println("Forced to use default vowels for " + (String) (var5));
                      break L3;
                    }
                  }
                }
                L4: {
                  this.field_n = (String) (var10);
                  this.field_b = (String) (var9);
                  this.field_h = (String) (var11);
                  this.field_j = (String) (var5);
                  var28 = (CharSequence) ((Object) ("flag_" + (String) (var5)));
                  this.field_a = pc.a("", dj.a(var28, (byte) -123), param0, -124);
                  stackIn_53_0 = this;

                  if (var6 != null) {
                    stackIn_54_0 = this;
                    stackIn_54_1 = am.a(dj.a((CharSequence) (var6), (byte) -121), param0, (byte) 72, param1, "");
                    break L4;
                  } else {
                    stackIn_54_0 = this;
                    stackIn_54_1 = wf.field_d;
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    ((nf) (this)).field_c = stackIn_54_1;
                    if (var7 == null) {
                      break L6;
                    } else {
                      try {
                        L7: {
                          aa.a(89, (CharSequence) (var7));
                          decompiledRegionSelector0 = 0;
                          break L7;
                        }
                      } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L8: {
                          var12 = (NumberFormatException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L8;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  break L5;
                }
                break L0;
              } else {
                L9: {
                  var13 = param2.field_c[var12_int][0];
                  var14 = param2.field_c[var12_int][1];
                  if (!var13.startsWith("val")) {
                    if (!"lang".equals(var13)) {
                      if ("font".equals(var13)) {
                        var6 = var14;
                        break L9;
                      } else {
                        if ("fhei".equals(var13)) {
                          var7 = var14;
                          break L9;
                        } else {
                          if (!"vowels".equals(var13)) {
                            if (!"tut1".equals(var13)) {
                              if ("tut2".equals(var13)) {
                                var10 = var14.toUpperCase();
                                break L9;
                              } else {
                                if (!"hint1".equals(var13)) {
                                  if ("disabled".equals(var13)) {
                                    L10: {
                                      if (!var14.equals("true")) {
                                        stackIn_39_0 = 0;
                                        break L10;
                                      } else {
                                        stackIn_39_0 = 1;
                                        break L10;
                                      }
                                    }
                                    var4_int = stackIn_39_0;
                                    break L9;
                                  } else {
                                    if (-3 < (va.field_j ^ -1)) {
                                      break L9;
                                    } else {
                                      System.out.println("Unrecognised config option: " + var13);
                                      break L9;
                                    }
                                  }
                                } else {
                                  var11 = var14;
                                  break L9;
                                }
                              }
                            } else {
                              var9 = var14.toUpperCase();
                              break L9;
                            }
                          } else {
                            var8 = var14;
                            break L9;
                          }
                        }
                      }
                    } else {
                      var5 = var14;
                      break L9;
                    }
                  } else {
                    var16 = 0;
                    try {
                      L11: {
                        L12: {
                          var27 = (CharSequence) ((Object) var13.substring(3));
                          var15 = aa.a(-104, var27);
                          if (-1 <= (var15 ^ -1)) {
                            var16 = 1;
                            break L12;
                          } else {
                            var24 = var14.toCharArray();
                            var18 = 0;
                            L13: while (true) {
                              if (var24.length <= var18) {
                                break L12;
                              } else {
                                L14: {
                                  var19 = var24[var18];
                                  if (2 > va.field_j) {
                                    break L14;
                                  } else {
                                    if (0 == this.field_p[var19]) {
                                      break L14;
                                    } else {
                                      System.out.println("Multiple letter values found for" + (char) var19);
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  this.field_p[var19] = var15;
                                  var20 = this.a(0, (char) var19);
                                  if (-3 < (va.field_j ^ -1)) {
                                    break L15;
                                  } else {
                                    if (var20 == var19) {
                                      break L15;
                                    } else {
                                      if (this.field_p[var20] == 0) {
                                        break L15;
                                      } else {
                                        System.out.println("Multiple letter values found for " + (char) var20);
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                this.field_p[var20] = var15;
                                var18++;
                                continue L13;
                              }
                            }
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.NumberFormatException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L16: {
                        var17 = (NumberFormatException) (Object) decompiledCaughtException;
                        var16 = 1;
                        break L16;
                      }
                    }
                    if ((va.field_j ^ -1) > -3) {
                      break L9;
                    } else {
                      if (var16 == 0) {
                        break L9;
                      } else {
                        System.out.println("Unrecognised config option: " + var13);
                        break L9;
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
          L17: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var4);

            stackIn_61_1 = new StringBuilder().append("nf.<init>(");

            if (param0 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L17;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_64_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');

            if (param1 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L18;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

            if (param2 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L19;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L19;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_62_0), stackIn_68_2 + ')');
        }
    }

    static {
        field_q = "Player";
        field_m = new tf(0, 2, 2, 1);
        field_k = -1;
    }
}
