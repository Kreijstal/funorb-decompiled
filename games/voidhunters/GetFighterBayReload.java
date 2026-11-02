/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetFighterBayReload extends ConsoleCommand {
    static float[] field_r;
    static llb field_p;
    static float[] field_o;
    static dja field_q;

    public static void a(int param0) {
        field_o = null;
        if (param0 == 16086) {
          field_q = null;
          field_p = null;
          field_r = null;
          return;
        }
        GetFighterBayReload.a(-66);
        field_q = null;
        field_p = null;
        field_r = null;
    }

    GetFighterBayReload(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetFighterBayReload.a(-101);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(115, 100));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kn.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(byte param0, int[] param1, long[] param2) {
        try {
          kc.a(-14677, param2, 0, param1, param2.length - 1);
          if (param0 != -24) {
            dja var4 = (dja) null;
            GetFighterBayReload.a((Object[]) null, (Object) null, false, (dja) null, 32);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static Object[] a(Object[] param0, Object param1, boolean param2, dja param3, int param4) {
        RuntimeException var5 = null;
        Object[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -73) {
            GetFighterBayReload.a(64);
          }
          stackIn_3_0 = qlb.a(param0, param1, param3, param2, false, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kn.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        field_r = new float[16384];
        field_o = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; 16384 > var2; var2++) {
          field_r[var2] = (float)Math.sin(var0 * (double)var2);
          field_o[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_q = (dja) ((Object) new qaa());
    }
}
