/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fi {
    static String field_a;
    static int field_d;
    static bf field_e;
    static boolean field_b;
    static rk field_c;
    static hl[] field_g;
    static boolean field_h;
    static ue field_f;

    abstract int a(byte param0, long param1);

    final static void c(byte param0) {
        hl var1 = null;
        hl var2 = null;
        int var3 = 0;
        int var4 = StarCannon.field_A;
        try {
          if (param0 != -96) {
            field_g = (hl[]) null;
          }
          var1 = new hl(540, 140);
          bc.a(var1, 26095);
          gl.b();
          ki.b();
          qb.field_h = 0;
          nc.a(-1196777214);
          var2 = var1.c();
          for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            ki.a(4, 4, 0, 0, 540, 140);
          }
          ak.field_f.e();
          var1.a(0, 0);
          wf.a(-71);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fi.K(" + param0 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, String param5, byte param6) {
        ma var7 = null;
        RuntimeException var7_ref = null;
        ma var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new ma(param2);
          var8 = new ma(param5);
          if (param6 == -3) {
            stackIn_4_0 = bf.a(param4, param0, param3, (byte) 6, var8, var7, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 63;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("fi.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 != 0) {
          fi.c((byte) -66);
        }
        field_g = null;
        field_f = null;
        field_c = null;
    }

    final int a(long param0, int param1) {
        int var4 = 55 / ((param1 + 30) / 48);
        long var5 = this.a((byte) -51);
        if (0L < var5) {
          uc.a(-104, var5);
        }
        return this.a((byte) 109, param0);
    }

    abstract void b(byte param0);

    abstract long a(byte param0);

    static {
        field_d = 0;
        field_a = "Collect power orbs to upgrade the Nova Ray's systems.";
        field_b = false;
        field_c = new rk();
    }
}
