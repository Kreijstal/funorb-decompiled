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
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0 * 16 / 50;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 300) {
                L2: {
                  ge.b();
                  if (param1 > 69) {
                    break L2;
                  } else {
                    var7 = null;
                    boolean discarded$2 = f.a(-43, (String) null);
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
          throw la.a((Throwable) (Object) var2, "f.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -15189) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = f.a(-28, (String) null);
                break L1;
              }
            }
            var4 = (CharSequence) (Object) param1;
            stackOut_2_0 = uj.field_f.equals((Object) (Object) pl.a((byte) 104, var4));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("f.J(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    fk a(boolean param0) {
        if (param0) {
            f.a(57, -11);
        }
        return sj.field_g;
    }

    public static void b() {
        field_e = null;
        field_j = null;
        field_g = null;
        field_f = null;
        field_i = null;
    }

    final static void a(int param0, int param1) {
        hb var2 = gf.field_c;
        var2.b(true, param0);
        if (param1 != 22492) {
            field_i = null;
        }
        var2.b(1, param1 + -71644);
        var2.b(2, param1 + -71644);
    }

    f(long param0, String param1) {
        try {
            ((f) this).field_h = param0;
            ((f) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "f.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, gk param1) {
        try {
            param1.a(((f) this).field_h, (byte) 117);
            int var3_int = 37 / ((-34 - param0) / 53);
            param1.a(((f) this).field_k, (byte) 90);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "f.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new na();
        field_j = new int[]{5, 5, 3, 1, 2, 3, 3, 1, 2, 3};
        field_e = "Quit";
        field_f = "You are not currently logged in to the<nbsp>game.";
        field_i = new lk();
    }
}
