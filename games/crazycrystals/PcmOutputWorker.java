/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmOutputWorker implements Runnable {
    volatile AudioOutput[] field_c;
    PlatformTaskDispatcher field_e;
    volatile boolean field_b;
    static String field_a;
    volatile boolean field_d;

    final static sj[] a(int param0) {
        int var1 = -121 % ((param0 + 40) / 41);
        return new sj[]{mn.field_j, DequeWidgetContainer.field_x, cc.field_c, lm.field_e, jl.field_g, Bzip2State.field_g, ValidationStatusIcon.field_E, cm.field_a, tn.field_q, CipherPacketBuffer.field_u, vg.field_a, qj.field_a, cn.field_b, SectorCacheStore.field_f};
    }

    PcmOutputWorker() {
        this.field_c = new AudioOutput[2];
        this.field_d = false;
        this.field_b = false;
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 2) {
          return;
        }
        field_a = null;
    }

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = CrazyCrystals.field_B;
        this.field_b = true;
        try {
          while (!this.field_d) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_c[var1_int];
              if (var2 == null) {
              } else {
                var2.serviceOutput();
              }
            }
            fh.sleepMillis(true, 10L);
            so.a((Object) null, this.field_e, true);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          wp.a((Throwable) ((Object) exception), (String) null, 21862);
        } finally {
          this.field_b = false;
        }
    }

    static {
        field_a = "Achievements This Game";
    }
}
