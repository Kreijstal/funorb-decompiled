/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPcmStream extends PcmStream {
    private PcmStream field_o;
    private int field_k;
    static int field_m;
    static ci field_n;
    static int[] field_l;

    public static void e(int param0) {
        field_n = null;
        field_l = null;
        if (param0 != 0) {
          DelayedPcmStream.e(-80);
        }
    }

    final void mixInto(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k > param2) {
            this.field_k = this.field_k - param2;
            return;
          }
          param1 = param1 + this.field_k;
          param2 = param2 - this.field_k;
          this.field_o.next = this.next;
          this.field_o.previous = this.previous;
          this.field_k = 0;
          this.previous.next = (IntrusiveNode) ((Object) this.field_o);
          this.next.previous = (IntrusiveNode) ((Object) this.field_o);
          this.previous = null;
          this.next = null;
          if (0 >= param2) {
            return;
          }
          this.field_o.mixInto(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("nd.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int getSchedulingPriority() {
        return this.field_o.getSchedulingPriority();
    }

    final int getSchedulingCost() {
        return 0;
    }

    final PcmStream firstChildStream() {
        return null;
    }

    final void skipFrames(int param0) {
        if (this.field_k <= param0) {
          param0 = param0 - this.field_k;
          this.field_k = 0;
          this.field_o.previous = this.previous;
          this.field_o.next = this.next;
          this.previous.next = (IntrusiveNode) ((Object) this.field_o);
          this.next.previous = (IntrusiveNode) ((Object) this.field_o);
          this.next = null;
          this.previous = null;
          if (param0 > 0) {
            this.field_o.skipFrames(param0);
          }
          return;
        }
        this.field_k = this.field_k - param0;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -106) {
          return true;
        }
        return param1 == (-param1 & param1) ? true : false;
    }

    final PcmStream nextChildStream() {
        return null;
    }

    DelayedPcmStream(PcmStream param0, int param1) {
        try {
          this.field_o = param0;
          this.field_g = this.field_o.field_g;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_m = 9;
        field_l = new int[8192];
    }
}
