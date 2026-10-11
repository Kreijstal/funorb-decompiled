/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private int field_d;
    static String field_b;
    private ai field_a;
    private bg field_f;
    static String[] field_e;
    private int field_c;

    final static boolean a(char param0, byte param1) {
        int var3 = 0;
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          if (param0 > 0 &&
            param0 < 128) {
            return true;
          }
          if (param0 >= 160 &&
            255 >= param0) {
            return true;
          }
          if (param0 != 0) {
            var6 = wf.field_a;
            var2 = var6;
            for (var3 = 0; var6.length > var3; var3++) {
              var4 = var6[var3];
              if (param0 == var4) {
                return true;
              }
            }
          }
          var2_int = -80 / ((77 - param1) / 45);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "wa.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        return ae.field_N.e((byte) 91);
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != 0) {
          wa.a('\n', (byte) 2);
        }
    }

    final void a(Object param0, long param1, int param2) {
        try {
          if (param2 != -22424) {
            field_b = (String) null;
          }
          this.a(-123, 1, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        gj var6 = null;
        ld var6_ref = null;
        int var7 = stellarshard.field_B;
        try {
          if (param1 > this.field_c) {
            throw new IllegalStateException();
          }
          if (param0 >= -113) {
            this.a(-81L, (byte) 23);
          }
          this.a(param2, (byte) 110);
          this.field_d = this.field_d - param1;
          while (0 > this.field_d) {
            var6 = (gj) (this.field_f.b((byte) 103));
            this.a(var6, (byte) 124);
          }
          var6_ref = new ld(param3, param1);
          this.field_a.a((byte) 30, var6_ref, param2);
          this.field_f.a(true, var6_ref);
          ((gj) ((Object) var6_ref)).field_o = 0L;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wa.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final Object b(long param0, byte param1) {
        ld var6 = null;
        gj var7 = (gj) (this.field_a.a(param0, -1));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.e(-118);
        if (var5 == null) {
          var7.c(20);
          var7.c((byte) 36);
          this.field_d = this.field_d + var7.field_u;
          return null;
        }
        if (var7.f(0)) {
          var6 = new ld(var5, var7.field_u);
          this.field_a.a((byte) 81, var6, var7.field_j);
          this.field_f.a(true, var6);
          ((gj) ((Object) var6)).field_o = 0L;
          var7.c(20);
          var7.c((byte) 36);
          if (param1 != 58) {
            this.field_a = (ai) null;
            return var5;
          }
          return var5;
        }
        this.field_f.a(true, var7);
        var7.field_o = 0L;
        if (param1 != 58) {
          this.field_a = (ai) null;
          return var5;
        }
        return var5;
    }

    private final void a(gj param0, byte param1) {
        if (param1 < 116) {
          return;
        }
        try {
          if (param0 != null) {
            param0.c(20);
            param0.c((byte) 36);
            this.field_d = this.field_d + param0.field_u;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(long param0, byte param1) {
        gj var4 = (gj) (this.field_a.a(param0, -1));
        if (param1 > 106) {
          this.a(var4, (byte) 118);
          return;
        }
        wa.b(-119);
        this.a(var4, (byte) 118);
    }

    private wa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Email address is unavailable";
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
