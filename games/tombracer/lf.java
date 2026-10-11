/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf implements bo {
    private int field_b;
    static String field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 == 128) {
          return (2048 & param1) != 0 ? true : false;
        }
        field_a = (String) null;
        return (2048 & param1) != 0 ? true : false;
    }

    final void a(qh param0, int param1, v param2) {
        try {
          if (param1 != 0) {
            kh var5 = (kh) null;
            this.a(61, (kh) null);
          }
          param0.i(this.field_b, 110);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 118);
        if (param1 != -19) {
          return;
        }
        try {
          this.field_b = param0.b((byte) 44, 4) - 2;
          param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, kh param1) {
        try {
          if (param0 != 200) {
            lf.a(-117, 42);
          }
          param1.i(8);
          param1.a((byte) 105, 2 + this.field_b, 4);
          param1.k(-1826190686);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 82) {
          field_a = (String) null;
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var11Lifetime1;
        stackIn_3_0 = ((1 & param0) == 0) ? 0 : 1;
        var2 = stackIn_3_0;
        stackIn_6_0 = ((param0 & 2) == 0) ? 0 : 1;
        var3 = stackIn_6_0;
        stackIn_9_0 = ((param0 & param1) == 0) ? 0 : 1;
        var4 = stackIn_9_0;
        stackIn_12_0 = ((8 & param0) == 0) ? 0 : 1;
        var5 = stackIn_12_0;
        stackIn_15_0 = (0 == (16 & param0)) ? 0 : 1;
        var6 = stackIn_15_0;
        stackIn_18_0 = ((param0 & 32) == 0) ? 0 : 1;
        var7 = stackIn_18_0;
        stackIn_21_0 = (0 == (param0 & 128)) ? 0 : 1;
        var8 = stackIn_21_0;
        stackIn_24_0 = (0 == (param0 & 256)) ? 0 : 1;
        var9 = stackIn_24_0;
        stackIn_27_0 = (0 == (param0 & 64)) ? 0 : 1;
        var10 = stackIn_27_0;
        if (var8 != 0) {
          var6 = 0;
          var4 = 0;
          var5 = 0;
          var2 = 0;
          var7 = 0;
          var3 = 0;
        } else {
          if (var9 != 0) {
            var6 = 0;
            var4 = 0;
            var5 = 0;
            var2 = 0;
            var7 = 0;
            var3 = 0;
          } else {
            if (var2 != 0) {
              if (var3 == 0) {
                if (var4 != 0 &&
                  var5 != 0) {
                  var4 = 0;
                  var5 = 0;
                }
                var11 = 0;
                if (var2 != 0) {
                  var11 = var11 | 1;
                }
                if (var3 != 0) {
                  var11 = var11 | 2;
                }
                if (var4 != 0) {
                  var11 = var11 | 4;
                }
                if (var5 != 0) {
                  var11 = var11 | 8;
                }
                if (var6 != 0) {
                  var11 = var11 | 16;
                }
                if (var7 != 0) {
                  var11 = var11 | 32;
                }
                if (var10 != 0) {
                  var11 = var11 | 64;
                }
                return var11;
              }
              var2 = 0;
              var3 = 0;
            }
            if (var4 != 0 &&
              var5 != 0) {
              var4 = 0;
              var5 = 0;
            }
          }
        }
        var11Lifetime1 = 0;
        if (var2 != 0) {
          var11Lifetime1 = var11Lifetime1 | 1;
        }
        if (var3 != 0) {
          var11Lifetime1 = var11Lifetime1 | 2;
        }
        if (var4 != 0) {
          var11Lifetime1 = var11Lifetime1 | 4;
        }
        if (var5 != 0) {
          var11Lifetime1 = var11Lifetime1 | 8;
        }
        if (var6 != 0) {
          var11Lifetime1 = var11Lifetime1 | 16;
        }
        if (var7 != 0) {
          var11Lifetime1 = var11Lifetime1 | 32;
        }
        if (var8 != 0) {
          var11Lifetime1 = var11Lifetime1 | 128;
        }
        if (var9 != 0) {
          var11Lifetime1 = var11Lifetime1 | 256;
        }
        if (var10 != 0) {
          var11Lifetime1 = var11Lifetime1 | 64;
        }
        return var11Lifetime1;
    }

    static {
        field_a = "Kick <%0> from this game";
    }
}
