/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static int field_e;
    static int field_c;
    static int field_a;
    static int field_d;
    static int[] field_b;

    abstract byte[] getBytes(int param0);

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 < 10) {
            field_d = 21;
          }
          ji.a(lh.field_s, 0, DelayedPcmStream.field_p, (byte) 44, true, param0, og.field_b);
          for (var2_int = 0; var2_int < DelayedPcmStream.field_p; var2_int++) {
            jk.field_c[param0 + var2_int] = var2_int;
          }
          ji.a(mh.field_j, param0, param0 + DelayedPcmStream.field_p, (byte) 121, false, param0 + param0, t.field_u);
          if (param0 < DelayedPcmStream.field_p) {
            DelayedPcmStream.field_p = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.wrapClientException((Throwable) ((Object) var2), "kk.A(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void setBytes(int param0, byte[] param1);

    final static boolean b(byte param0) {
        int var1 = -38 / ((param0 + 9) / 44);
        return sk.field_b;
    }

    final static Boolean c(byte param0) {
        Boolean var1 = oj.field_g;
        int var2 = -38 % ((param0 - 14) / 60);
        oj.field_g = null;
        return var1;
    }

    public static void resetStaticState(byte param0) {
        field_b = null;
        if (param0 <= 32) {
          field_e = 69;
        }
    }

    final static void a(Sprite param0, int param1, String param2) {
        ba.field_c = param0;
        if (param1 > -54) {
          return;
        }
        try {
          ArchiveRequest.field_q = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "kk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        ne.a(50, 89);
    }
}
