/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rb {
    static String field_c;
    static String field_d;
    va[] field_b;
    static sd field_a;

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param1);
            stackIn_3_0 = dd.field_p.equals(r.a(var3, -11133));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rb.I(").append(param0).append(',');

            if (param1 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(byte param0, int param1) {
        va[] var3;
        int var4;
        va var5;
        int var6;
        va[] var7;
        var6 = TrackController.field_F ? 1 : 0;
        var7 = this.field_b;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            if (param0 == 111) {
              return 0;
            } else {
              return 56;
            }
          } else {
            var5 = var7[var4];
            if ((param1 ^ -1) > (var5.field_b.length ^ -1)) {
              return var5.field_b[param1];
            } else {
              param1 = param1 - (var5.field_b.length - 1);
              var4++;
              continue L0;
            }
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == 22479) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[-var4 + var2_int - 1] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("rb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static String a(long param0, byte param1) {
        ki.field_e.setTime(new Date(param0));
        int var3 = ki.field_e.get(7);
        if (param1 > -95) {
            field_a = (sd) null;
        }
        int var4 = ki.field_e.get(5);
        int var5 = ki.field_e.get(2);
        int var6 = ki.field_e.get(1);
        int var7 = ki.field_e.get(11);
        int var8 = ki.field_e.get(12);
        int var9 = ki.field_e.get(13);
        return fg.field_b[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ej.field_f[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            if (param2 == 5) {
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  if (var5_int <= 0) {
                    stackIn_21_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_18_0 = param3 - param0 << 1730737448;
                    stackIn_18_1 = var5_int;
                    stackIn_19_0 = stackIn_18_0 / stackIn_18_1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L2: {
                    var9 = param1.charAt(var8);
                    if ((var9 ^ -1) == -61) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (var9 != 62) {
                        if (var6 == 0) {
                          if (var9 == 32) {
                            var5_int++;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 14;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("rb.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0;
          } else {
            return stackIn_21_0;
          }
        }
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 12323) {
            break L0;
          } else {
            field_a = (sd) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_b == null) {
              break L2;
            } else {
              if (this.field_b.length <= 0) {
                break L2;
              } else {
                stackIn_6_0 = -this.field_b[0].field_c + this.field_b[-1 + this.field_b.length].field_f;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, boolean param1, int param2) {
        int var5 = 0;
        va var6 = null;
        int var7 = 0;
        int var8 = TrackController.field_F ? 1 : 0;
        if (null == this.field_b || this.field_b.length == 0 || this.field_b[0].field_c > param2) {
            return -1;
        }
        if (this.field_b[-1 + this.field_b.length].field_f < param2) {
            return -1;
        }
        if (-2 == (this.field_b.length ^ -1)) {
            return this.field_b[0].b(param0, (byte) -85);
        }
        if (param1) {
            return -1;
        }
        int var4 = 0;
        for (var5 = 0; this.field_b.length > var5; var5++) {
            var6 = this.field_b[var5];
            if (param2 >= var6.field_c) {
                if (!(var6.field_f < param2)) {
                    var7 = var6.b(param0, (byte) -85);
                    if (!(var7 != -1)) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (-1 + var6.field_b.length);
        }
        return -1;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -2857) {
            field_d = (String) null;
        }
        field_d = null;
        field_c = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        va var4 = null;
        int var5 = TrackController.field_F ? 1 : 0;
        if (param1 != -36) {
            this.c(65);
        }
        for (var3 = 0; this.field_b.length > var3; var3++) {
            var4 = this.field_b[var3];
            if (var4.field_b.length > param0) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_b.length);
        }
        return this.field_b.length;
    }

    final int c(int param0) {
        int var2;
        va[] var3;
        int var4;
        va var5;
        int var7;
        int var6;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          var2 = param0;
          if (this.field_b != null) {
            var3 = this.field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(0);
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
          } else {
            break L0;
          }
        }
        return var2;
    }

    static {
        field_c = "This entry doesn't match";
        field_d = "Names cannot contain consecutive spaces";
    }
}
