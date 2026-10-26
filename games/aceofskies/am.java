/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    private tl field_b;
    static int nextScoreSubmissionId;

    final static SoundPlayback a(PcmSample param0, boolean param1) {
        String stackIn_7_2 = null;
        try {
          if (param1) {
            nextScoreSubmissionId = -84;
          }
          SoundPlayback stackIn_3_0 = w.a(-23159, PcmSampleStream.a(param0, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("am.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          this.field_b = (tl) null;
          if (this.field_b != null) {
            this.field_b.a(4665);
            return;
          }
          return;
        }
        if (this.field_b == null) {
          return;
        }
        this.field_b.a(4665);
    }

    am(boolean param0) {
    }

    static {
    }
}
