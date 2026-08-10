/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends si {
    wf field_x;
    static db[] field_z;
    int field_w;
    byte field_A;
    static String field_y;

    final byte[] d(byte param0) {
        int var2;
        L0: {
          if (this.field_v) {
            break L0;
          } else {
            if (this.field_x.field_h < -this.field_A + this.field_x.field_j.length) {
              break L0;
            } else {
              var2 = 37 % ((2 - param0) / 38);
              return this.field_x.field_j;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void c(int param0) {
        if (param0 != 255) {
            return;
        }
        String var2 = (String) null;
        cl.a((byte) 41, (String) null, "");
    }

    final static boolean d(int param0) {
        if (a.field_c == -1) {
            if (!(a.b(1, 10343))) {
                return false;
            }
            a.field_c = ig.field_a.d(true);
            ig.field_a.field_h = 0;
        }
        if (param0 != 2) {
            return false;
        }
        if (1 == (a.field_c ^ -1)) {
            if (!(a.b(2, 10343))) {
                return false;
            }
            a.field_c = ig.field_a.b(-1698573656);
            ig.field_a.field_h = 0;
        }
        return a.b(a.field_c, 10343);
    }

    dc() {
    }

    final static String[] a(String param0, char param1, byte param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = (CharSequence) ((Object) param0);
              var3_int = wd.a((byte) -72, param1, var10);
              var4 = new String[1 + var3_int];
              var5 = 0;
              var6 = 0;
              if (param2 == -125) {
                break L1;
              } else {
                field_y = (String) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param0.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param1 == param0.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param0.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("dc.T(");

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
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    public static void f(byte param0) {
        field_y = null;
        int var1 = -27 % ((param0 - 19) / 53);
        field_z = null;
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var12 = new char[param0];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= param0) {
                L2: {
                  if (param2 == 16) {
                    break L2;
                  } else {
                    dc.d(-88);
                    break L2;
                  }
                }
                stackIn_17_0 = new String(var12, 0, var5);
                break L0;
              } else {
                var7 = param1[param3 + var6] & 255;
                if (0 != var7) {
                  L3: {
                    if ((var7 ^ -1) > -129) {
                      break L3;
                    } else {
                      if (160 > var7) {
                        L4: {
                          var8 = ne.field_d[var7 - 128];
                          if (var8 == 0) {
                            var8 = 63;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var7 = var8;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  incrementValue$0 = var5;
                  var5++;
                  var10[incrementValue$0] = (char)var7;
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("dc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final int c(byte param0) {
        if (param0 != 16) {
            return 68;
        }
        if (!(this.field_x != null)) {
            return 0;
        }
        return 100 * this.field_x.field_h / (this.field_x.field_j.length - this.field_A);
    }

    static {
        field_y = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
