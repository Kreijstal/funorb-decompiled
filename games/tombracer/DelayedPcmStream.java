/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPcmStream extends PcmStream {
    private PcmStream field_j;
    private int field_l;
    static int field_k;

    final void skip(int param0) {
        if (this.field_l > param0) {
          this.field_l = this.field_l - param0;
          return;
        }
        param0 = param0 - this.field_l;
        this.field_j.next = this.next;
        this.field_l = 0;
        this.field_j.previous = this.previous;
        this.previous.next = (IntrusiveNode) ((Object) this.field_j);
        this.next.previous = (IntrusiveNode) ((Object) this.field_j);
        this.previous = null;
        this.next = null;
        if (param0 <= 0) {
          return;
        }
        this.field_j.skip(param0);
    }

    final void fill(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < this.field_l) {
            this.field_l = this.field_l - param2;
            return;
          }
          param2 = param2 - this.field_l;
          param1 = param1 + this.field_l;
          this.field_l = 0;
          this.field_j.next = this.next;
          this.field_j.previous = this.previous;
          this.previous.next = (IntrusiveNode) ((Object) this.field_j);
          this.next.previous = (IntrusiveNode) ((Object) this.field_j);
          this.next = null;
          this.previous = null;
          if (param2 <= 0) {
            return;
          }
          this.field_j.fill(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("sc.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final int getLevel() {
        return this.field_j.getLevel();
    }

    final int activity() {
        return 0;
    }

    DelayedPcmStream(PcmStream param0, int param1) {
        try {
          this.field_j = param0;
          this.field_l = param1;
          this.field_i = this.field_j.field_i;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final PcmStream nextSubStream() {
        return null;
    }

    static {
    }
}
