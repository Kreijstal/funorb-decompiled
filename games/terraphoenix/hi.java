/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ei implements n {
    private eb field_X;
    static int field_ab;
    static String field_Y;
    static String field_Z;
    static bg[] field_W;

    private final void k(int param0) {
        int var2 = 93 % ((68 - param0) / 58);
        if (!(this.field_J)) {
            return;
        }
        this.field_J = false;
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
        var11 = Terraphoenix.field_V;
        if (0L < param0) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if ((param0 % 37L ^ -1L) != -1L) {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (-1L == (var4 ^ -1L)) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if ((param0 ^ -1L) == -1L) {
                      var6.reverse();
                      if (param1 != -12382) {
                        return (String) null;
                      } else {
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      }
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = ed.field_a[(int)(var7 + -(37L * param0))];
                        if (-96 != (var9 ^ -1)) {
                          break L2;
                        } else {
                          var10 = var6.length() - 1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        }
                      }
                      discarded$0 = var6.append((char) var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        try {
            if (this.field_X == param0) {
                this.k(126);
            }
            int var6_int = 102 % ((-5 - param4) / 57);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "hi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final eb a(boolean param0, String param1, sc param2) {
        eb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        eb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new eb(param1, param2);
              if (!param0) {
                break L1;
              } else {
                field_W = (bg[]) null;
                break L1;
              }
            }
            var4.field_l = (cj) ((Object) new ic());
            var5 = -6 + this.field_n;
            this.field_n = this.field_n + 38;
            var4.a(var5, (byte) 80, -16 + (-14 + this.field_p), 15, 30);
            this.b((byte) 95, var4);
            this.c(0);
            stackIn_3_0 = (eb) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("hi.G(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    hi(d param0, qf param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        gl var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (u.field_d == param1) {
                var3 = ra.field_h;
                break L1;
              } else {
                if (ql.field_e != param1) {
                  if (param1 != gi.field_r) {
                    break L1;
                  } else {
                    this.field_n = this.field_n + 30;
                    var3 = va.field_a;
                    break L1;
                  }
                } else {
                  var3 = tb.field_i;
                  this.field_n = this.field_n + 10;
                  if (!ea.a(-20512)) {
                    break L1;
                  } else {
                    var3 = nf.field_a;
                    this.field_n = this.field_n + 20;
                    break L1;
                  }
                }
              }
            }
            var4 = new gl((String) (var3), (sc) null);
            var4.field_n = 80;
            var4.field_u = 50;
            var4.field_p = this.field_p;
            var4.field_w = 0;
            var4.field_l = (cj) ((Object) new fd(ra.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b((byte) 95, var4);
            this.field_X = this.a(false, te.field_e, (sc) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("hi.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public static void l(int param0) {
        field_Z = null;
        if (param0 != 0) {
            hi.a(-21L, -41);
            field_Y = null;
            field_W = null;
            return;
        }
        field_Y = null;
        field_W = null;
    }

    static {
        field_Y = " cost: 14tus";
        field_Z = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
