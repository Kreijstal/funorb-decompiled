/*
 * Decompiled by CFR-JS 0.4.0.
 */
class f extends kc {
    private String field_k;
    private long field_h;
    static na field_g;
    static int[] field_j;
    static String field_f;
    static String field_e;
    static lk field_i;

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0 * 16 / 50;
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -301) {
                L2: {
                  ge.b();
                  if (param1 > 69) {
                    break L2;
                  } else {
                    var7 = (String) null;
                    f.a(-43, (String) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (var2_int > sc.field_h[var3]) {
                    var4 = var3 / 20;
                    var5 = 32 * (var3 - var4 * 20);
                    var4 = var4 * 32;
                    ge.h(var5, var4, var5 + 32, var4 + 32);
                    ke.field_i.a(0, 0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "f.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
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
              if (param0 == -15189) {
                break L1;
              } else {
                var3 = (String) null;
                f.a(-28, (String) null);
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param1);
            stackIn_3_0 = uj.field_f.equals(pl.a((byte) 104, var4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("f.J(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    fk a(boolean param0) {
        if (param0) {
            f.a(57, -11);
        }
        return sj.field_g;
    }

    public static void b(byte param0) {
        field_e = null;
        field_j = null;
        field_g = null;
        field_f = null;
        if (param0 != -77) {
            String var2 = (String) null;
            f.a(-123, (String) null);
        }
        field_i = null;
    }

    final static void a(int param0, int param1) {
        hb var2 = gf.field_c;
        var2.b(true, param0);
        if (param1 != 22492) {
            field_i = (lk) null;
        }
        var2.b(1, param1 + -71644);
        var2.b(2, param1 + -71644);
    }

    f(long param0, String param1) {
        try {
            this.field_h = param0;
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "f.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, gk param1) {
        try {
            param1.a(this.field_h, (byte) 117);
            int var3_int = 37 / ((-34 - param0) / 53);
            param1.a(this.field_k, (byte) 90);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "f.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new na();
        field_j = new int[]{5, 5, 3, 1, 2, 3, 3, 1, 2, 3};
        field_e = "Quit";
        field_f = "You are not currently logged in to the<nbsp>game.";
        field_i = new lk();
    }
}
