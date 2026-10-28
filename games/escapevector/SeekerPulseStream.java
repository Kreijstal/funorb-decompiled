/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SeekerPulseStream extends PcmStream {
    static int field_l;
    PcmSampleStream field_k;
    volatile int field_r;
    volatile int field_s;
    private int field_m;
    volatile int field_n;
    private boolean field_o;
    PcmSampleStream field_q;
    volatile int field_p;
    static String[] field_t;

    final int activity() {
        return 0;
    }

    final PcmStream firstSubstream() {
        this.field_o = true;
        return (PcmStream) ((Object) this.field_k);
    }

    final PcmStream nextSubstream() {
        if (this.field_o) {
          this.field_o = false;
          return (PcmStream) ((Object) this.field_q);
        }
        return null;
    }

    final void mixInto(int[] samples, int offset, int length) {
        int var5 = EscapeVector.obfuscationControl;
        try {
          while (length > this.field_m) {
            this.field_k.process(samples, offset, this.field_m);
            this.field_q.process(samples, offset, this.field_m);
            offset = offset + this.field_m;
            length = length - this.field_m;
            this.e(117);
          }
          this.field_k.process(samples, offset, length);
          this.field_q.process(samples, offset, length);
          this.field_m = this.field_m - length;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "tl.C(" + (samples != null ? "{...}" : "null") + ',' + offset + ',' + length + ')');
        }
    }

    private final void e(int param0) {
        int var2 = this.field_p;
        if (0 != var2) {
          this.field_r = this.field_r - var2;
          int var3 = (this.field_r & 65536) != 0 ? this.field_s : 0;
          int var4 = this.field_n;
          this.field_k.rampVolumeAndPanQ6(AudioOutput.sampleRate / 200, var3, var4);
          this.field_q.rampVolumeAndPanQ6(AudioOutput.sampleRate / 200, var3 >> 2, var4);
          if (param0 >= 96) {
            this.field_m = AudioOutput.sampleRate / 100;
            return;
          }
          return;
        }
        this.field_r = 0;
        int var3Lifetime1 = (this.field_r & 65536) != 0 ? this.field_s : 0;
        int var4Lifetime1 = this.field_n;
        this.field_k.rampVolumeAndPanQ6(AudioOutput.sampleRate / 200, var3Lifetime1, var4Lifetime1);
        this.field_q.rampVolumeAndPanQ6(AudioOutput.sampleRate / 200, var3Lifetime1 >> 2, var4Lifetime1);
        if (param0 >= 96) {
          this.field_m = AudioOutput.sampleRate / 100;
          return;
        }
    }

    public static void releaseStatics(byte guard) {
        field_t = null;
        if (guard != -43) {
          SeekerPulseStream.releaseStatics((byte) -61);
        }
    }

    final void skip(int length) {
        int var3 = EscapeVector.obfuscationControl;
        while (length > this.field_m) {
          this.field_k.skip(this.field_m);
          this.field_q.skip(this.field_m);
          length = length - this.field_m;
          this.e(122);
        }
        this.field_k.skip(length);
        this.field_q.skip(length);
        this.field_m = this.field_m - length;
    }

    SeekerPulseStream() {
    }

    static {
        field_t = new String[]{"Outstanding work, commander. You have proved yourself marvellously skilled, able to infiltrate the most heavily guarded caves, quick-thinking in moments of peril... Truly admirable.", "Now it is time to visit the aliens' home world. This is a planet, so gravity will be higher. We have no idea what to expect, but stay alert."};
    }
}
