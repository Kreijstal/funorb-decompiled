/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_d;
    static int field_c;
    static RawPcmStream[] field_a;
    static int[][] field_b;

    final static AccountServiceResult pollAccountCreationResult(byte param0) {
        if (ic.field_l == mc.field_t) {
          throw new IllegalStateException();
        }
        if (param0 >= -19) {
          return (AccountServiceResult) null;
        }
        if (kd.field_p == ic.field_l) {
          ic.field_l = mc.field_t;
          return vk.field_g;
        }
        return null;
    }

    public static void clearStaticReferences(int param0) {
        field_b = (int[][]) null;
        if (param0 != 3) {
          return;
        }
        field_a = null;
    }

    final static void a(boolean param0, String param1, float param2) {
        try {
          ResourceArchive.field_c = param1;
          MouseWheelInput.field_d = param2;
          if (!param0) {
            String var4 = (String) null;
            pa.a(false, (String) null, -0.23309962451457977f);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "pa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static long bitwiseOr(long param0, long param1) {
        return param0 | param1;
    }

    static {
        field_a = new RawPcmStream[3];
    }
}
