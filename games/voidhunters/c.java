/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends ksa {
    long field_e;
    byte[] field_f;
    int field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (!li.field_i) {
          dma.a(param2, param3, param1, param0, param5);
          if (param4 != -16777216) {
            return;
          } else {
            return;
          }
        } else {
          rnb.a(-16777216 | param5, (byte) 103, param3, param2, param0, param1);
          if (param4 != -16777216) {
            return;
          } else {
            return;
          }
        }
    }

    c(long param0, int param1, byte[] param2) {
        try {
            ((c) this).field_d = param1;
            ((c) this).field_e = param0;
            ((c) this).field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "c.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
