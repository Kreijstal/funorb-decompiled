/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_e;
    static String field_b;
    static int field_a;
    static dg field_c;
    static boolean field_d;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -31455) {
          return;
        }
        field_e = null;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (si.field_l < 0) {
          return;
        }
        var3 = -135 + param0;
        var4 = param1 - 35;
        var5 = 256;
        if (75 > si.field_l) {
          var5 = (si.field_l << 8) / 75;
        }
        if (200 < si.field_l) {
          var5 = (-si.field_l + 250 << 8) / 50;
        }
        oj.a(ug.field_f, 256);
        if (param2 != 116) {
          ub.a(-11);
          ka.c();
          sb.c();
          f.a((byte) 16);
          if (256 > var5) {
            sb.c(0, 0, sb.field_c, sb.field_g, 0, 256 - var5);
          }
          fi.c(true);
          if (150 > si.field_l) {
            ug.field_f.d(var3, var4);
          } else {
            ch.field_c.e(var3 + 15, var4 + 10, var5);
          }
          var6 = si.field_l - 125;
          if (var6 > 0 &&
            var6 < 50) {
            if (20 <= var6) {
              if (var6 >= 30) {
                var7 = 256 * (50 - var6) / 20;
                ac.field_m.c(var3, var4, var7);
              } else {
                ac.field_m.c(var3, var4, 256);
              }
            } else {
              var7 = var6 * 256 / 20;
              ac.field_m.c(var3, var4, var7);
            }
          }
        } else {
          ka.c();
          sb.c();
          f.a((byte) 16);
          if (256 > var5) {
            sb.c(0, 0, sb.field_c, sb.field_g, 0, 256 - var5);
            fi.c(true);
            if (150 > si.field_l) {
              ug.field_f.d(var3, var4);
            } else {
              ch.field_c.e(var3 + 15, var4 + 10, var5);
            }
          } else {
            fi.c(true);
            if (150 > si.field_l) {
              ug.field_f.d(var3, var4);
              var6 = si.field_l - 125;
              if (var6 <= 0) {
                var6 = -140 + si.field_l;
                if (var6 > 0) {
                  var7 = 256;
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                  }
                  tb.field_e.e(15 + var3, var4 + 10, var7 * var5 >> 8);
                }
              } else {
                if (var6 >= 50) {
                  var6 = -140 + si.field_l;
                  if (var6 > 0) {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = var6 * 256 / 20;
                    }
                    tb.field_e.e(15 + var3, var4 + 10, var7 * var5 >> 8);
                  }
                } else {
                  if (20 > var6) {
                    var7 = var6 * 256 / 20;
                    ac.field_m.c(var3, var4, var7);
                    var6 = -140 + si.field_l;
                    if (var6 > 0) {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = var6 * 256 / 20;
                      }
                      tb.field_e.e(15 + var3, var4 + 10, var7 * var5 >> 8);
                    }
                  } else {
                    if (var6 < 30) {
                      ac.field_m.c(var3, var4, 256);
                      var6 = -140 + si.field_l;
                      if (var6 > 0) {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = var6 * 256 / 20;
                        }
                        tb.field_e.e(15 + var3, var4 + 10, var7 * var5 >> 8);
                      }
                    } else {
                      var7 = 256 * (50 - var6) / 20;
                      ac.field_m.c(var3, var4, var7);
                      var6 = -140 + si.field_l;
                      if (var6 > 0) {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = var6 * 256 / 20;
                        }
                        tb.field_e.e(15 + var3, var4 + 10, var7 * var5 >> 8);
                      }
                    }
                  }
                }
              }
              return;
            }
            ch.field_c.e(var3 + 15, var4 + 10, var5);
          }
          var6 = si.field_l - 125;
          if (var6 > 0 &&
            var6 < 50) {
            if (20 > var6) {
              var7 = var6 * 256 / 20;
              ac.field_m.c(var3, var4, var7);
            } else {
              if (var6 < 30) {
                ac.field_m.c(var3, var4, 256);
              } else {
                var7 = 256 * (50 - var6) / 20;
                ac.field_m.c(var3, var4, var7);
              }
            }
          }
        }
        var6Lifetime1 = -140 + si.field_l;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          tb.field_e.e(15 + var3, var4 + 10, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    final static StringBuilder a(StringBuilder param0, int param1, char param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          var4_int = param0.length();
          if (param1 <= 114) {
            ub.a(-10, 88, (byte) -53);
          }
          param0.setLength(param3);
          for (var5 = var4_int; param3 > var5; var5++) {
            param0.setCharAt(var5, param2);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ub.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = "Time bonus:";
        field_a = 0;
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_d = true;
    }
}
