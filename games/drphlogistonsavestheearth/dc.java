/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc implements qi {
    static String field_b;
    private long field_d;
    static int field_e;
    static String field_f;
    static volatile long field_c;
    static nh field_a;
    static String field_g;

    final static void a(bl param0, int param1, boolean param2, ug param3, byte param4, java.awt.Component param5) {
        try {
          if (param4 > -91) {
            field_b = (String) null;
          }
          id.a(param1, param2, 10);
          el.field_sb = id.a(param0, param5, 0, 22050);
          k.field_J = id.a(param0, param5, 1, 1024);
          ej.field_a = new ec();
          k.field_J.a(ej.field_a);
          s.field_a = param3;
          param3.a(oa.field_b * 128 / 80, (byte) -13);
          el.field_sb.a(param3);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "dc.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    abstract vh c(byte param0);

    public final vh a(int param0) {
        if (this.a(false)) {
          return pi.field_P;
        }
        if (param0 != -12317) {
          field_e = -119;
          if (!(this.field_d + 350L <= la.a(false))) {
            return ai.field_A;
          }
          return this.c((byte) -98);
        }
        if (!(this.field_d + 350L <= la.a(false))) {
          return ai.field_A;
        }
        return this.c((byte) -98);
    }

    public final String b(int param0) {
        if (this.a(false)) {
          return null;
        }
        if (param0 != -16034) {
          this.a(8);
          if (this.field_d + 350L <= la.a(false)) {
            return this.b((byte) -66);
          }
          return null;
        }
        if (this.field_d + 350L <= la.a(false)) {
          return this.b((byte) -66);
        }
        return null;
    }

    abstract String b(byte param0);

    final static void a(boolean param0, int param1, String param2, rf param3, mi param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        mi var10 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          if (param0) {
            var10 = (mi) null;
            dc.a(false, 13, (String) null, (rf) null, (mi) null);
          }
          for (var7 = 1; param2.length() > var7; var7++) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = param4.field_a[0] + ((var5_int >> 8) + param3.b(param2.substring(0, var7)));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param4.field_a[var7] = param4.field_a[0] + (var5_int >> 8) - (-param3.b(param2.substring(0, 1 + var7)) + param3.a((char) var8));
            } else {
              param4.field_a[var7] = var6;
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("dc.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0 <= 5) {
          mi var2 = (mi) null;
          dc.a(false, 91, (String) null, (rf) null, (mi) null);
        }
    }

    public final void a(byte param0) {
        this.field_d = la.a(false);
        if (param0 != 87) {
          mi var3 = (mi) null;
          dc.a(true, 28, (String) null, (rf) null, (mi) null);
        }
    }

    static {
        field_b = "OK";
        field_c = 0L;
        field_g = "Updates will sent to the email address you've given";
    }
}
