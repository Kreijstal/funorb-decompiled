/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji extends da {
    static int[] field_F;
    static cn field_G;
    static String field_H;
    private md field_I;

    final void a(lm param0, int param1) {
        rf var3 = null;
        if (!(param0 instanceof rf)) {
            throw new IllegalArgumentException();
        }
        if (param1 != -1) {
            return;
        }
        try {
            var3 = (rf) (Object) param0;
            ((ji) this).field_I.b((ne) (Object) var3, false);
            var3.field_T = true;
            boolean discarded$0 = var3.a(34, (lm) this);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ji.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = DungeonAssault.field_K;
        if (!(((ji) this).field_o == null)) {
            ((ji) this).field_o.a((byte) 34, (lm) this, param1, param3, true);
        }
        dj var5 = new dj(((ji) this).field_I);
        if (param2 != 0) {
            ((ji) this).field_I = null;
        }
        lm var6 = (lm) (Object) var5.b(-1225818257);
        while (var6 != null) {
            var6.a(param0, param1 + ((ji) this).field_q, 0, param3 - -((ji) this).field_v);
            var6 = (lm) (Object) var5.d(1834857157);
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
            return 48;
        }
        return uj.a(ld.field_f, 37, 1 + -param2 + param0) + param2;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          try {
            if (qg.field_n.startsWith("win")) {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (param0.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                } else {
                  if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref2;
            stackOut_21_1 = new StringBuilder().append("ji.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + -38 + ')');
        }
    }

    final void b(boolean param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(((ji) this).field_I);
        if (!param0) {
            int discarded$0 = ji.a(-59, true, -77);
        }
        rf var3 = (rf) (Object) var2.a(-479592473);
        while (var3 != null) {
            if (!(!var3.f((byte) -90))) {
                var3.a(false);
            }
            var3 = (rf) (Object) var2.c(17756);
        }
        ((ji) this).field_D = (lm) (Object) ((ji) this).i(32);
    }

    public ji() {
        super(0, 0, hn.field_t, vf.field_x, (ca) null, (pg) null);
        ((ji) this).field_I = new md();
    }

    final void j(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(((ji) this).field_I);
        if (param0 != -33) {
            int discarded$0 = ji.a(-41, true, -105);
        }
        rf var3 = (rf) (Object) var2.a(-479592473);
        while (var3 != null) {
            if (var3.i(462)) {
                var3.a(false);
            }
            var3 = (rf) (Object) var2.c(17756);
        }
    }

    final lm g(int param0) {
        dj var2 = null;
        rf var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 == 1) {
            break L0;
          } else {
            var5 = null;
            ((ji) this).a((lm) null, 10);
            break L0;
          }
        }
        var2 = new dj(((ji) this).field_I);
        var3 = (rf) (Object) var2.a(-479592473);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_T) {
              var3 = (rf) (Object) var2.c(param0 + 17755);
              continue L1;
            } else {
              return var3.g(param0 + -20312);
            }
          } else {
            return null;
          }
        }
    }

    final void h(int param0) {
        int var4 = DungeonAssault.field_K;
        if (param0 != 1) {
            field_F = null;
        }
        dj var2 = new dj(((ji) this).field_I);
        rf var3 = (rf) (Object) var2.a(-479592473);
        while (var3 != null) {
            var3.field_T = false;
            var3 = (rf) (Object) var2.c(param0 ^ 17757);
        }
        ((ji) this).field_D = null;
    }

    public static void f(byte param0) {
        field_H = null;
        field_G = null;
        if (param0 != -98) {
            ji.f((byte) -89);
        }
        field_F = null;
    }

    final rf i(int param0) {
        dj var2 = null;
        rf var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param0 == 32) {
          var2 = new dj(((ji) this).field_I);
          var3 = (rf) (Object) var2.a(-479592473);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_T) {
                var3 = (rf) (Object) var2.c(17756);
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_F = new int[32];
        for (var0 = 0; var0 < 32; var0++) {
            var1 = var0 + 32;
            field_F[var0] = 65793 * var1;
        }
        field_H = "You have collected <%0> consecutive bounties";
    }
}
