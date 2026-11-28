/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private ResourceArchive field_f;
    static boolean field_b;
    private vb field_a;
    static String[] field_c;
    private ResourceArchive field_e;
    private vb field_d;

    private final PcmSample a(byte param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        uj var9 = null;
        PcmSample var10 = null;
        PcmSample stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        PcmSample stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | 65520 & param3 << 4);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (PcmSample) (this.field_d.a(false, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            stackIn_7_0 = null;
            return (PcmSample) (stackIn_7_0);
          }
          if (param0 < 100) {
            da.clearStaticReferences(60);
          }
          var9 = uj.a(this.field_f, param3, param2);
          if (var9 == null) {
            return null;
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_d.a(var6, (byte) 44, var8Lifetime1);
          if (param1 != null) {
            param1[0] = param1[0] - var10.field_h.length;
          }
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("da.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final PcmSample a(int param0, int param1, int param2) {
        if (param1 == -1703274388) {
          return this.a((byte) 113, (int[]) null, param0, param2);
        }
        this.b(-108, 0, 54);
        return this.a((byte) 113, (int[]) null, param0, param2);
    }

    public static void clearStaticReferences(int param0) {
        field_c = null;
        if (param0 != -1703274388) {
          da.clearStaticReferences(-86);
        }
    }

    final PcmSample b(int param0, int param1, int param2) {
        if (param2 == -14888) {
          return this.a(0, (int[]) null, param1, param0);
        }
        int[] var5 = (int[]) null;
        PcmSample discarded$0 = this.a((byte) 18, (int[]) null, -97, 96);
        return this.a(0, (int[]) null, param1, param0);
    }

    private final PcmSample a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        VorbisSample var9 = null;
        PcmSample stackIn_3_0 = null;
        Object stackIn_13_0 = null;
        PcmSample stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = param2 ^ (param3 >>> 12 | (param3 & -1610608641) << 4);
          var5_int = var5_int | param3 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (PcmSample) (this.field_d.a(false, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = (VorbisSample) (this.field_a.a(false, var6));
          if (param0 != 0) {
            field_b = true;
          }
          if (var9 == null) {
            var9 = VorbisSample.load(this.field_e, param3, param2);
            if (var9 == null) {
              stackIn_13_0 = null;
              return (PcmSample) (stackIn_13_0);
            }
            this.field_a.a(var6, (byte) 124, var9);
          }
          var8Lifetime1 = var9.decodeToPcm(param1);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.unlink(104);
          this.field_d.a(var6, (byte) 118, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("da.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    da(ResourceArchive param0, ResourceArchive param1) {
        this.field_a = new vb(256);
        this.field_d = new vb(256);
        try {
          this.field_e = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = true;
    }
}
