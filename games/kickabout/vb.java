/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static boolean field_k;
    static String field_e;
    static int field_b;
    static int field_d;
    static ut[] field_a;
    static String field_i;
    static int field_j;
    static double field_c;
    static String field_f;
    static int field_h;
    static byte[][] field_g;
    static ut field_l;

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var6 = 0;
        long stackIn_5_0 = 0L;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          var2_int = param1.length();
          var3 = 0L;
          for (var5 = param0; var2_int > var5; var5++) {
            var3 = -var3 + ((var3 << 5) + (long)param1.charAt(var5));
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("vb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_g = (byte[][]) null;
        field_a = null;
        if (param0 != 0) {
          field_c = 0.39487605170744977;
        }
    }

    final static boolean b(int param0) {
        if (param0 < 117) {
          return false;
        }
        return null != jl.field_f ? true : false;
    }

    final static void a(boolean param0) {
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = Kickabout.field_G;
        try {
          if (rm.field_C == 0) {
            bv.field_l = null;
          } else {
            if (!vi.field_n) {
              bv.field_l = null;
            } else {
              if (rm.field_C == 1) {
                bv.field_l = new rk[30];
                for (var1_int = 0; var1_int < bv.field_l.length; var1_int++) {
                  stackIn_11_0 = (ih.field_c != 2) ? -60 : -120;
                  var2 = stackIn_11_0;
                  var2 = el.a(29430, 15, var2);
                  var3 = 20 + var1_int * 45;
                  var4 = 6;
                  if (0 == p.a((byte) -24, 2)) {
                    var4 = 2;
                    var2 = 896 - var2;
                  }
                  bv.field_l[var1_int] = new rk(var2, var3, var4);
                }
              } else {
                if (rm.field_C == 2) {
                  bv.field_l = new rk[34];
                  var1_int = 0;
                  for (var2 = 0; var2 < 17; var2++) {
                    stackIn_21_0 = ~p.a((byte) -24, 3);
                    stackIn_21_1 = -1;
                    if (stackIn_21_0 != stackIn_21_1) {
                      var3 = -170;
                      var4 = p.a((byte) -24, 5);
                      var5 = p.a((byte) -24, 100);
                      bv.field_l[var2] = new rk(var4 + var1_int, var5 + var3, 0);
                    }
                    var1_int += 54;
                  }
                  var1_int = 0;
                  for (var2 = 17; var2 < 34; var2++) {
                    if (p.a((byte) -24, 3) != 0) {
                      var3 = 1424;
                      var4 = p.a((byte) -24, 5);
                      var5Lifetime1 = p.a((byte) -24, 100);
                      bv.field_l[var2] = new rk(var1_int + var4, var3 + var5Lifetime1, 4);
                    }
                    var1_int += 54;
                  }
                } else {
                  if (rm.field_C == 3) {
                    bv.field_l = null;
                  }
                }
              }
            }
          }
          if (!param0) {
            vb.b(-46);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "vb.B(" + param0 + ')');
        }
    }

    static {
        field_e = "Go Back";
        field_b = 0;
        field_i = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_f = "Camera unlocked. Press 'Shift' + 'Enter' to attach.";
        field_c = Math.atan2(1.0, 0.0);
        field_g = new byte[1000][];
    }
}
