/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sc {
    sd[] field_c;
    static bi[] field_h;
    static int[] field_i;
    static rf field_a;
    static String field_e;
    static int[] field_d;
    static int field_f;
    static String[] field_g;
    static String field_j;
    static String field_b;

    final static String a(String param0, char param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var12 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        var12 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = -1 + var5;
              var8 = 30 % ((-18 - param3) / 49);
              if (0 == var7) {
                break L1;
              } else {
                var9_int = 0;
                L2: while (true) {
                  var9_int = param0.indexOf((int) param1, var9_int);
                  if (var9_int >= 0) {
                    var6 = var6 + var7;
                    var9_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var9 = new StringBuilder(var6);
            var10 = 0;
            L3: while (true) {
              var11 = param0.indexOf((int) param1, var10);
              if (0 > var11) {
                discarded$0 = var9.append(param0.substring(var10));
                stackIn_10_0 = var9.toString();
                break L0;
              } else {
                discarded$1 = var9.append(param0.substring(var10, var11));
                discarded$2 = var9.append(param2);
                var10 = var11 - -1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("sc.I(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        sd var4 = null;
        int var5 = Confined.field_J ? 1 : 0;
        for (var3 = 0; var3 < this.field_c.length; var3++) {
            var4 = this.field_c[var3];
            if (param1 < var4.field_e.length) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_e.length);
        }
        if (param0 > -68) {
            field_g = (String[]) null;
        }
        return this.field_c.length;
    }

    final int a(boolean param0) {
        int var2;
        sd[] var3;
        int var4;
        sd var5;
        int var7;
        int var6;
        var7 = Confined.field_J ? 1 : 0;
        var2 = -1;
        if (param0) {
          L0: {
            if (this.field_c == null) {
              break L0;
            } else {
              var3 = this.field_c;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.b(61);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var2;
        } else {
          return 51;
        }
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 23791) {
          L0: {
            L1: {
              if (null == this.field_c) {
                break L1;
              } else {
                if (this.field_c.length <= 0) {
                  break L1;
                } else {
                  stackIn_6_0 = this.field_c[-1 + this.field_c.length].field_a - this.field_c[0].field_d;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return -87;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_i = null;
        field_j = null;
        if (param0 != -30048) {
            sc.a(-29);
        }
    }

    final int a(int param0, int param1) {
        sd var5 = null;
        int var6 = Confined.field_J ? 1 : 0;
        sd[] var7 = this.field_c;
        sd[] var3 = var7;
        int var4 = 0;
        if (param1 >= -88) {
            return 46;
        }
        while (var7.length > var4) {
            var5 = var7[var4];
            if (var5.field_e.length > param0) {
                return var5.field_e[param0];
            }
            param0 = param0 - (var5.field_e.length - 1);
            var4++;
        }
        return 0;
    }

    final int a(int param0, byte param1, int param2) {
        sd var6 = null;
        int var7 = 0;
        int var8 = Confined.field_J ? 1 : 0;
        if (this.field_c == null || this.field_c.length == 0 || this.field_c[0].field_d > param0) {
            return -1;
        }
        if (param0 > this.field_c[-1 + this.field_c.length].field_a) {
            return -1;
        }
        if (1 == this.field_c.length) {
            return this.field_c[0].a((byte) 85, param2);
        }
        int var4 = 0;
        int var5 = 0;
        if (param1 >= -123) {
            this.a(-123, 16);
        }
        while (var5 < this.field_c.length) {
            var6 = this.field_c[var5];
            if (var6.field_d <= param0) {
                if (!(var6.field_a < param0)) {
                    var7 = var6.a((byte) 85, param2);
                    if (var7 == -1) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (var6.field_e.length + -1);
            var5++;
        }
        return -1;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param3.length();
            if (param2 == 28438) {
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if ((var5_int ^ -1) < -1) {
                    stackIn_21_0 = (param1 - param0 << -242620312) / var5_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_23_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L2: {
                    var9 = param3.charAt(var8);
                    if (-61 == (var9 ^ -1)) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (62 == var9) {
                        var6 = 0;
                        break L2;
                      } else {
                        if (var6 == 0) {
                          if (32 == var9) {
                            var5_int++;
                            break L2;
                          } else {
                            var8++;
                            continue L1;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -83;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("sc.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            return stackIn_23_0;
          }
        }
    }

    static {
        field_h = new bi[4];
        field_i = new int[8192];
        field_a = new rf();
        field_e = "Charge#cannon#This weapon is difficult to control,#since it takes time to charge and#will fire as soon as it is ready.";
        field_f = 0;
        field_d = new int[10];
        field_b = "Password: ";
        field_j = "You already have 20 homing missiles";
    }
}
