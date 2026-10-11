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
          var3 = (rf) (param0);
          this.field_I.b(var3, false);
          var3.field_T = true;
          var3.a(34, (lm) (this));
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ji.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = DungeonAssault.field_K;
        if (this.field_o != null) {
          this.field_o.a((byte) 34, (lm) (this), param1, param3, true);
        }
        dj var5 = new dj(this.field_I);
        if (param2 != 0) {
          this.field_I = (md) null;
        }
        lm var6 = (lm) (var5.b(-1225818257));
        while (var6 != null) {
          var6.a(param0, param1 + this.field_q, 0, param3 + this.field_v);
          var6 = (lm) (var5.d(1834857157));
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
          return 48;
        }
        return uj.a(ld.field_f, 37, 1 - param2 + param0) + param2;
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          if (param1 > -30) {
            field_G = (cn) null;
          }
          try {
            if (!qg.field_n.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param0.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("ji.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(boolean param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_I);
        if (!param0) {
          ji.a(-59, true, -77);
        }
        rf var3 = (rf) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.f((byte) -90)) {
            var3.a(false);
          }
          var3 = (rf) (var2.c(17756));
        }
        this.field_D = (lm) ((Object) this.i(32));
    }

    public ji() {
        super(0, 0, hn.field_t, vf.field_x, (ca) null, (pg) null);
        this.field_I = new md();
    }

    final void j(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_I);
        if (param0 != -33) {
          ji.a(-41, true, -105);
        }
        rf var3 = (rf) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.i(462)) {
            var3.a(false);
          }
          var3 = (rf) (var2.c(17756));
        }
    }

    final lm g(int param0) {
        dj var2;
        rf var3;
        int var4;
        lm var5;
        var4 = DungeonAssault.field_K;
        if (param0 != 1) {
          var5 = (lm) null;
          this.a((lm) null, 10);
        }
        var2 = new dj(this.field_I);
        var3 = (rf) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.field_T) {
            return var3.g(param0 - 20312);
          }
          var3 = (rf) (var2.c(param0 + 17755));
        }
        return null;
    }

    final void h(int param0) {
        int var4 = DungeonAssault.field_K;
        if (param0 != 1) {
          field_F = (int[]) null;
        }
        dj var2 = new dj(this.field_I);
        rf var3 = (rf) (var2.a(-479592473));
        while (var3 != null) {
          var3.field_T = false;
          var3 = (rf) (var2.c(param0 ^ 17757));
        }
        this.field_D = null;
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
        dj var2;
        rf var3;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param0 != 32) {
          return (rf) null;
        }
        var2 = new dj(this.field_I);
        var3 = (rf) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.field_T) {
            return var3;
          }
          var3 = (rf) (var2.c(17756));
        }
        return null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_F = new int[32];
        for (var0 = 0; var0 < 32; var0++) {
          var1 = var0 * 1 + 32;
          field_F[var0] = 65793 * var1;
        }
        field_H = "You have collected <%0> consecutive bounties";
    }
}
