/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static String invitingX;
    static String field_j;
    static int field_g;
    IntrusiveNode next;
    static WireframeQuad[][][] field_b;
    long key;
    static UiComponent field_e;
    static int[] field_h;
    static PcmSample field_a;
    static IntrusiveDeque field_i;
    IntrusiveNode previous;

    public static void releaseStatics(byte param0) {
        invitingX = null;
        if (param0 >= 56) {
          field_b = (WireframeQuad[][][]) null;
          field_a = null;
          field_h = null;
          field_j = null;
          field_i = null;
          field_e = null;
          return;
        }
        IntrusiveNode.releaseStatics((byte) -106);
        field_b = (WireframeQuad[][][]) null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_i = null;
        field_e = null;
    }

    final void unlink(byte obfuscationGuard) {
        if (this.next == null) {
          return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        if (obfuscationGuard == -117) {
          this.next = null;
          return;
        }
        int[] var3 = (int[]) null;
        IntrusiveNode.a(97, (int[]) null, (int[]) null);
        this.next = null;
    }

    final static void a(int param0, int[] param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -param2[0] + param1[0];
          var4 = param1[1] - param2[1];
          var5 = param1[2] - param2[param0];
          var6 = var5 * param2[5] + param2[4] * var4 + var3_int * param2[3] >> 16;
          var7 = var4 * param2[7] + var3_int * param2[6] + param2[8] * var5 >> 16;
          var8 = var5 * param2[11] + var3_int * param2[9] + param2[10] * var4 >> 16;
          var9 = AccountDisplayNameSupport.inverseSquareRoot(var7 * var7 + var8 * var8 >> 16, -125);
          if (var9 < 0) {
            var9 = -var9;
          }
          LoginRequiredScreen.field_I = 128 + (ResizableDialog.c(var9, var6, param0 ^ 4098) >> 4);
          var10 = IterableNodeHashTable.a(-112, (long)var7 * (long)var7 + ((long)var6 * (long)var6 + (long)var8 * (long)var8) >> 16);
          if (var10 > (long)LoginPayload.field_a) {
            DualLinkDequeIterator.field_g = (int)((long)(256 * StartupInterfaceSupport.field_e) / ((long)StartupInterfaceSupport.field_e + ((long)QuickChatPhraseDefinition.field_G * (var10 - (long)LoginPayload.field_a) >> 8)));
            return;
          }
          DualLinkDequeIterator.field_g = 256;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ma.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 > -106) {
          this.key = -125L;
          if (this.next != null) {
            return true;
          }
          return false;
        }
        if (this.next != null) {
          return true;
        }
        return false;
    }

    static {
        invitingX = "Inviting <%0>";
    }
}
