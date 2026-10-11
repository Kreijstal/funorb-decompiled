/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi implements Runnable {
    volatile boolean field_e;
    volatile md[] field_c;
    jk field_b;
    volatile boolean field_f;
    static int field_d;
    static String field_a;

    final static boolean a(int param0) {
        if (param0 != -3) {
          vi.a(68);
          return ad.field_b;
        }
        return ad.field_b;
    }

    final static boolean a(um param0, int param1, um param2, um param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 44) {
            field_d = -26;
          }
          if (param0.c((byte) 127) &&
            param0.b("commonui", 100)) {
            if (!param2.c((byte) 121)) {
              return false;
            }
            if (!param2.b("commonui", 100)) {
              return false;
            }
            if (param3.c((byte) 126) &&
              param3.b("button.gif", 100)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("vi.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 5 % ((param0 - 65) / 51);
    }

    public final void run() {
        int var1_int = 0;
        md var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = Chess.field_G;
        this.field_e = true;
        try {
          try {
            while (!this.field_f) {
              for (var1_int = 0; var1_int < 2; var1_int++) {
                var2 = this.field_c[var1_int];
                if (var2 != null) {
                  var2.b();
                }
              }
              bc.a(10L, (byte) -121);
              var5 = (Object) null;
              ak.a(this.field_b, (byte) -37, (Object) null);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var6 = (String) null;
            fg.a((Throwable) ((Object) var1), (byte) -77, (String) null);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_e = false;
          throw vi.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_e = false;
    }

    vi() {
        this.field_c = new md[2];
        this.field_f = false;
        this.field_e = false;
    }

    static {
        field_a = "Reload game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
