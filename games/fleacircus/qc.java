/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static int field_b;
    private RgbSprite[] field_a;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        og.a(param4, this.field_a, 96, param0, param3, param2);
        if (param1 != 0) {
          field_b = 91;
        }
    }

    final static void a(int param0) {
        if (!PcmResampler.field_f) {
          throw new IllegalStateException();
        }
        tb.field_c = true;
        AccountRequestState.a(true, (byte) 119);
        if (param0 == 500) {
          bh.field_t = 0;
          return;
        }
        field_b = 26;
        bh.field_t = 0;
    }

    qc(RgbSprite[] param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "qc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 500;
    }
}
