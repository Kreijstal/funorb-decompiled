/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nd extends jl {
    static int field_s;
    static String field_u;
    int field_t;

    public static void c(int param0) {
        field_u = null;
        if (param0 != 30661) {
          field_u = (String) null;
        }
    }

    abstract boolean f(byte param0);

    final static boolean a(char param0, byte param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          if (param1 != -18) {
            nd.c(-35);
          }
          if ((param0 <= 0 ||
            param0 >= 128) &&
            (param0 < 160 ||
            param0 > 255)) {
            if (param0 == 0) {
              return false;
            }
            var6 = cd.field_m;
            var2 = var6;
            for (var3 = 0; var3 < var6.length; var3++) {
              var4 = var6[var3];
              if (var4 == param0) {
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "nd.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void e(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        od[] dupTemp$0 = null;
        od dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        od var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 18) {
            return;
          }
          for (var1_int = 1; var1_int < 3; var1_int++) {
            for (var2 = 0; 4 > var2; var2++) {
              dupTemp$0 = bf.field_R[var1_int];
              dupTemp$1 = new od(bf.field_R[-1 + var1_int][var2], false, true, true, true);
              dupTemp$0[var2] = dupTemp$1;
              var3 = dupTemp$1;
              var3.a(80, 80, 80);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "nd.A(" + param0 + ')');
        }
    }

    abstract Object d(int param0);

    nd(int param0) {
        this.field_t = param0;
    }

    static {
        field_u = "<col=FFFFFF>Wing pods:</col> pilotless ships that surround your ship, back up some of your weapons with extra power, collect power-ups for you, and occasionally take enemy attacks for you. You can have up to five.";
    }
}
