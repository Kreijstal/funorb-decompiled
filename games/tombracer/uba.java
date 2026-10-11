/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends kma implements cd, eaa {
    static int field_f;
    paa field_i;
    static String[] field_g;
    static String field_h;

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_i.a(param0 - 1780);
          var3 = this.field_i.d(param0 + 20939);
          var4 = this.field_i.j((byte) 110);
          var5 = cn.a((byte) 60);
          if (var4 >= param0 &&
            -3 + var5 >= var4) {
            if (fa.a(var3, var2_int, true, var4)) {
              stackIn_7_0 = null;
              return (String) (stackIn_7_0);
            }
          } else {
            stackIn_4_0 = gl.$cfr$intArgs$a$53ce4ab4c593(91, era.field_b, new String[]{"1890", Integer.toString(var5 - 3)});
            return stackIn_4_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return nia.field_m;
    }

    public final boolean a(boolean param0) {
        if (!param0) {
          this.field_i = (paa) null;
          return this.field_i.i((byte) 64);
        }
        return this.field_i.i((byte) 64);
    }

    public static void b(byte param0) {
        field_g = null;
        field_h = null;
        if (param0 != -128) {
          uba.b((byte) -33);
        }
    }

    public final void a(tra param0, int param1) {
        try {
          this.c(-65);
          if (param1 != -10) {
            tra var4 = (tra) null;
            this.a((tra) null, -90);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uba.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final it d(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        it stackIn_3_0 = null;
        it stackIn_6_0 = null;
        it stackIn_10_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_i.a(111);
          var3 = this.field_i.d(22829);
          var4 = this.field_i.j((byte) 110);
          var5 = cn.a((byte) 125);
          if (~var4 > param0) {
            stackIn_3_0 = fp.field_c;
            return stackIn_3_0;
          }
          if (var4 > -3 + var5) {
            stackIn_6_0 = fp.field_c;
            return stackIn_6_0;
          }
          if (!fa.a(var3, var2_int, true, var4)) {
            stackIn_10_0 = fp.field_c;
            return stackIn_10_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return fp.field_c;
        }
        return uh.field_k;
    }

    public final void a(int param0, rla param1) {
        if (param0 != -3) {
          return;
        }
        try {
          this.c(-81);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uba.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public uba() {
    }

    public final void a(int param0, tra param1) {
        try {
          if (param0 != -6038) {
            field_f = -61;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uba.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new String[]{"Building tombs", "Setting traps", "Scattering bones", "Poking snakes", "Carving statues", "Drawing maps", "Lighting torches", "Inviting archaeologists", "Rolling boulders", "Looking for Tom Bracer...", "Twiddling Thumbs"};
        field_h = "You are on <%0>";
    }
}
