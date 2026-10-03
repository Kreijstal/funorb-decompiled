/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelayedPcmStream extends PcmStream {
    private PcmStream field_l;
    private int field_j;
    static String field_k;

    final static int a(CharSequence param0, boolean param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          if (!param1) {
            DelayedPcmStream.b(false);
          }
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (param0.charAt(var5) == param2) {
              var3_int++;
            }
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cg.K(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int d() {
        return 0;
    }

    final static boolean b(boolean param0) {
        TextWidgetRenderer.field_k = param0 ? true : false;
        DisplayNamePanel.field_G = 15000L + oa.a(-12520);
        return SpriteConstructionSupport.clientScreenStage == 11 ? true : false;
    }

    final void b(int param0) {
        if (param0 < this.field_j) {
            this.field_j = this.field_j - param0;
            return;
        }
        param0 = param0 - this.field_j;
        this.field_j = 0;
        this.field_l.previousNode = this.previousNode;
        this.field_l.nextNode = this.nextNode;
        this.previousNode.nextNode = (IntrusiveNode) ((Object) this.field_l);
        this.nextNode.previousNode = (IntrusiveNode) ((Object) this.field_l);
        this.previousNode = null;
        this.nextNode = null;
        if (!(0 >= param0)) {
            this.field_l.b(param0);
        }
    }

    final PcmStream b() {
        return null;
    }

    final int a() {
        return this.field_l.a();
    }

    public static void c(byte param0) {
        if (param0 > -107) {
            DelayedPcmStream.c((byte) -13);
        }
        field_k = null;
    }

    final PcmStream c() {
        return null;
    }

    final static boolean a(byte param0) {
        if (param0 <= 18) {
            return false;
        }
        return CachedArchiveSource.field_s;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_j > param2) {
            this.field_j = this.field_j - param2;
            return;
          }
          param1 = param1 + this.field_j;
          param2 = param2 - this.field_j;
          this.field_j = 0;
          this.field_l.nextNode = this.nextNode;
          this.field_l.previousNode = this.previousNode;
          this.previousNode.nextNode = (IntrusiveNode) ((Object) this.field_l);
          this.nextNode.previousNode = (IntrusiveNode) ((Object) this.field_l);
          this.previousNode = null;
          this.nextNode = null;
          if (param2 > 0) {
            this.field_l.a(param0, param1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("cg.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    DelayedPcmStream(PcmStream param0, int param1) {
        try {
            this.field_l = param0;
            this.field_g = this.field_l.field_g;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
