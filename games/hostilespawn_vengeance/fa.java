/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    private String field_b;
    static int field_a;
    static bd field_e;
    static int field_c;
    static bd[] field_d;

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var4 = (String) null;
            this.a(87, (String) null);
          }
          stackIn_3_0 = this.field_b.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(String[] args, int param1, int param2, vm param3, String param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param2 <= 48) {
            field_e = (bd) null;
          }
          var5_int = param3.a(param4);
          if (param1 >= var5_int &&
            -1 == param4.indexOf("<br>")) {
            args[0] = param4;
            stackIn_6_0 = 1;
            return stackIn_6_0;
          }
          var6 = (-1 + (var5_int + param1)) / param1;
          param1 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param4.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param4.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param4.substring(var7, var9 + 1).trim();
              var12 = param3.a(var11);
              if (var12 >= param1) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = var11;
              }
            }
            if (62 == var10 &&
              param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              args[incrementValue$2] = param4.substring(var7, var9 - 3).trim();
              var7 = 1 + var9;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$0] = param4.substring(var7, var8).trim();
          }
          stackIn_29_0 = var6Lifetime1;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("fa.D(");
          if (args == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param4 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final void a(byte param0, java.applet.Applet param1) {
        try {
          if (param0 > -94) {
            field_e = (bd) null;
          }
          pc.a(this.field_b, "jagex-last-login-method", true, 31536000L, param1);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "fa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    fa(String param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_c = 65;
        }
        field_d = null;
        field_e = null;
    }

    final static void a(int param0) {
        String var2 = (String) null;
        ak.a(false, (String) null, "");
        if (param0 != 5109) {
          field_e = (bd) null;
        }
    }

    static {
    }
}
