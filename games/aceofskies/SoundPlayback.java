/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundPlayback extends IntrusiveNode {
    PcmSampleStream field_g;
    static qo field_e;
    IntrusiveNode field_i;
    int field_h;
    static IntrusiveDeque field_f;

    public static void clearStaticReferences(int param0) {
        field_e = null;
        field_f = null;
        if (param0 != 32081) {
          field_e = (qo) null;
        }
    }

    final void b(int param0, int param1) {
        if (param0 != -2580) {
          this.b(108, -13);
          this.field_g.setSampleStepMagnitude(param1);
          return;
        }
        this.field_g.setSampleStepMagnitude(param1);
    }

    final void a(int param0, int param1) {
        param1 = param1 << 6;
        this.field_h = param1;
        if (param0 == -128) {
          this.field_g.setVolume(128 + param1 * gn.field_a >> 8);
          return;
        }
        SoundPlayback.clearStaticReferences(-71);
        this.field_g.setVolume(128 + param1 * gn.field_a >> 8);
    }

    SoundPlayback(PcmSampleStream param0, IntrusiveNode param1) {
        try {
          this.field_g = param0;
          this.field_h = param0.getTargetVolume();
          this.field_i = param1;
          this.field_g.setVolume(this.field_h * gn.field_a + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new qo();
    }
}
