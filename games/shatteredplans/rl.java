/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static String field_e;
    static bi field_c;
    static boolean[] field_b;
    static String field_d;
    private oq field_a;
    static bc field_f;
    private rl field_g;

    final void a(String param0, int param1, String param2) {
        oq var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = this.field_a;
          while (true) {
            if (var4 == null) {
              if (param1 != 27275) {
                rl.a(45, true, 103, -126, true);
              }
              this.field_a = new oq(param2, param0, this.field_a);
              return;
            }
            if (!param2.equals(var4.field_d)) {
              var4 = var4.field_f;
              continue;
            }
            break;
          }
          var4.field_h = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("rl.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$6 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        StringBuilder var10 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var10 = new StringBuilder(param1.length());
          var4 = 0;
          if (param0 != 5607) {
            field_e = (String) null;
          }
          var5 = param1.length();
          while (var4 < var5) {
            var6 = param1.indexOf("<%", var4);
            if (var6 < 0) {
              discarded$4 = var10.append(param1.substring(var4, var5));
            } else {
              discarded$5 = var10.append(param1.substring(var4, var6));
              var4 = var6;
              var6 = param1.indexOf(">", var4 + 2);
              if (var6 >= 0) {
                var7 = param1.substring(var4 + 2, var6);
                var8 = this.b(88, var7);
                if (var8 != null) {
                  discarded$7 = var10.append(var8);
                }
                var4 = 1 + var6;
                continue;
              }
              discarded$6 = var10.append(param1.substring(var4, var5));
            }
            break;
          }
          stackIn_15_0 = var10.toString();
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("rl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 == 0) {
          field_f = null;
          field_c = null;
          field_e = null;
          return;
        }
        field_d = (String) null;
        field_f = null;
        field_c = null;
        field_e = null;
    }

    final static bc a(int param0, boolean param1, int param2, int param3, boolean param4) {
        if (param0 != -1) {
          return (bc) null;
        }
        return cc.a(param2, false, param3, param0 + 12001, param1, param4);
    }

    private final String b(int param0, String param1) {
        oq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = this.field_a;
          var4 = 27 % ((param0 + 76) / 35);
          while (var3 != null) {
            if (param1.equals(var3.field_d)) {
              stackIn_6_0 = var3.field_h;
              return stackIn_6_0;
            }
            var3 = var3.field_f;
          }
          if (null == this.field_g) {
            return null;
          }
          stackIn_11_0 = this.field_g.b(-112, param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("rl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public rl() {
    }

    rl(rl param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Quit";
        field_e = "you lost <%0> fleets in the attack";
    }
}
