/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static int field_e;
    static ge field_f;
    static String field_b;
    static int field_d;
    static int field_c;
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = 255 & param0;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (param1 != 63) {
          cc.a(0);
        }
        if (var2 >= 128 &&
          var2 < 160) {
          var3 = se.field_K[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Main.field_T;
        try {
          var1_int = mb.field_c[0];
          for (var2 = 1; var2 < mb.field_c.length; var2++) {
            var3 = mb.field_c[var2];
            og.a(lf.field_a, var2 << 4, lf.field_a, var1_int, var3);
            var1_int = var1_int + var3;
          }
          if (param0 <= 34) {
            field_a = 35;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "cc.B(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          field_b = (String) null;
        }
        stackIn_8_0 = (this == rk.field_eb) || (vg.field_a == this) || (ad.field_q == this);
        return stackIn_8_0;
    }

    final static boolean a(int param0) {
        int var1 = 100 % ((param0 + 57) / 42);
        return ei.field_e;
    }

    public static void a(byte param0) {
        if (param0 <= 98) {
          field_e = -118;
        }
        field_f = null;
        field_b = null;
    }

    static {
        field_f = new ge();
        field_b = "Type your age in years";
        field_a = 0;
    }
}
