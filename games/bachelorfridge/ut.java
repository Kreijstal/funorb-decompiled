/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ut extends tia {
    private int field_k;
    static int field_o;
    private dha field_i;
    private gw field_j;
    static kv[] field_r;
    static sna field_q;
    private eaa field_n;
    static int field_l;
    static n field_m;
    private int field_p;

    final static void d(int param0) {
        int var1 = 117 / ((param0 - -74) / 48);
    }

    ut(gj param0, ad param1, int param2, int param3) {
        super(param0, param1);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        dha var8 = null;
        dha var9 = null;
        dha var10 = null;
        dha var11 = null;
        try {
          L0: {
            L1: {
              this.field_k = param2;
              this.field_p = 1 + param3;
              this.field_n = new eaa();
              var5_int = 128 * this.field_p >> -950527423;
              var6 = this.field_p * 64 >> -1540290015;
              var7 = 20 * this.field_p;
              if (this.field_k != 1) {
                if (-4 == (this.field_k ^ -1)) {
                  var5_int = var5_int * -1;
                  break L1;
                } else {
                  if (this.field_k != 2) {
                    break L1;
                  } else {
                    var6 = var6 * -1;
                    var5_int = var5_int * -1;
                    break L1;
                  }
                }
              } else {
                var6 = var6 * -1;
                break L1;
              }
            }
            var8 = new dha(0, 0);
            var9 = new dha(var5_int, var6);
            var10 = new dha(0, -var7);
            var11 = new dha(var5_int, var6 + -var7);
            this.field_j = new gw(var8, var10, var11, var9, 65793);
            this.field_g = 64;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ut.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 != -8696) {
            field_o = -3;
        }
        field_r = null;
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        qq.a(this.field_n, param2, param0, param1 ^ -28638);
        if (param1 != 25415) {
            po var5 = (po) null;
            ut.a((String[]) null, 124, (String) null, (po) null, 98);
        }
    }

    final static int a(String[] args, int param1, String param2, po param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var5_int = param3.a(param2);
              var6 = -36 / ((param4 - 69) / 55);
              if (param1 < var5_int) {
                break L1;
              } else {
                if ((param2.indexOf("<br>") ^ -1) == 0) {
                  args[0] = param2;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var7 = (param1 + (var5_int + -1)) / param1;
            param1 = var5_int / var7;
            var7 = 0;
            var8 = 0;
            var9 = param2.length();
            var10 = 0;
            L2: while (true) {
              if (var9 <= var10) {
                L3: {
                  if (var8 < var9) {
                    incrementValue$0 = var7;
                    var7++;
                    args[incrementValue$0] = param2.substring(var8, var9).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_25_0 = var7;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param2.charAt(var10);
                    if (-33 == (var11 ^ -1)) {
                      break L5;
                    } else {
                      if (var11 != 45) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var12 = param2.substring(var8, var10 + 1).trim();
                  var13 = param3.a(var12);
                  if (param1 > var13) {
                    break L4;
                  } else {
                    incrementValue$1 = var7;
                    var7++;
                    args[incrementValue$1] = var12;
                    var8 = 1 + var10;
                    break L4;
                  }
                }
                if (62 == var11) {
                  L6: {
                    if (param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
                      incrementValue$2 = var7;
                      var7++;
                      args[incrementValue$2] = param2.substring(var8, -3 + var10).trim();
                      var8 = var10 + 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("ut.A(");

            if (args == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), stackIn_35_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_25_0;
        }
    }

    final boolean a(int param0) {
        int stackIn_13_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        lh var6;
        int var7;
        L0: {
          var7 = BachelorFridge.field_y;
          this.field_g = this.field_g - 1;
          if ((this.field_g ^ -1) >= -1) {
            break L0;
          } else {
            if ((this.field_g ^ -1) > -65) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= (120 + -this.field_g) / 32) {
                  break L0;
                } else {
                  this.field_i = this.field_j.a((double)(64 - this.field_g) / 64.0, 68);
                  var3 = -15 + (this.field_i.field_c << -481924636) + kla.a(30, this.field_f, -2147483648);
                  var4 = -15 + (this.field_i.field_a << 1051321636) + kla.a(30, this.field_f, -2147483648);
                  var5 = 0;
                  var6 = new lh(var3, var5, var4);
                  kla.a(100, this.field_f, -2147483648);
                  var6.field_p = 16 + -kla.a(32, this.field_f, -2147483648);
                  var6.field_k = 16 + -kla.a(32, this.field_f, -2147483648);
                  var6.field_g = -kla.a(32, this.field_f, -2147483648) + 16;
                  var6.field_m = -1;
                  var6.field_o = 32;
                  var6.field_l = 0;
                  this.field_n.a(var6, true);
                  var2++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        oma.a(this.field_g, this.field_f, this.field_n, this.field_j, -72, this.field_i);
        if (param0 < 0) {
          L2: {
            L3: {
              if (this.field_g >= 0) {
                break L3;
              } else {
                if (this.field_n.e(12917)) {
                  stackIn_13_0 = 0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            stackIn_13_0 = 1;
            break L2;
          }
          return stackIn_13_0 != 0;
        } else {
          return false;
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            eu.field_b = new js(8);
            var1_int = 0;
            L1: while (true) {
              if (ra.field_k.length <= var1_int) {
                L2: {
                  if (param0 == -22021) {
                    break L2;
                  } else {
                    ut.b(11);
                    break L2;
                  }
                }
                break L0;
              } else {
                eu.field_b.a((long)ra.field_k[var1_int].toLowerCase().hashCode(), (byte) -81, new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ut.E(" + param0 + ')');
        }
    }

    static {
    }
}
