/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static boolean field_a;

    final static SoundPlayback a(int param0, PcmSampleStream param1) {
        String stackIn_7_2 = null;
        try {
          SoundPlayback var2 = new SoundPlayback(param1, param1);
          di.activeSoundPlaybacks.addLast(param0 ^ -23077, var2);
          if (param0 != -23159) {
            PcmSampleStream var3 = (PcmSampleStream) null;
            w.a(117, (PcmSampleStream) null);
          }
          qn.pcmMixer.addSubstream(param1);
          SoundPlayback stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("w.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
