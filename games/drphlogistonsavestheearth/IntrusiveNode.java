/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static he[] field_d;
    static int field_f;
    static byte[][][] field_a;
    static int field_c;
    IntrusiveNode next;
    long key;
    IntrusiveNode previous;

    final boolean isLinked(int obfuscationGuard) {
        if (obfuscationGuard == -1387) {
          return this.previous != null ? true : false;
        }
        field_f = 76;
        if (this.previous == null) {
          return false;
        }
        return true;
    }

    final static void a(PcmSampleStream param0, int param1) {
        try {
          if (param1 != 3408) {
            PcmSampleStream var3 = (PcmSampleStream) null;
            IntrusiveNode.a((PcmSampleStream) null, -47);
          }
          ej.field_a.b(param0);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "gi.TB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_a = (byte[][][]) null;
        field_d = null;
        if (param0 != 10589) {
          field_d = (he[]) null;
        }
    }

    final void unlink(int obfuscationGuard) {
        if (null == this.previous) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        if (obfuscationGuard == -16175) {
          this.previous = null;
          this.next = null;
          return;
        }
        IntrusiveNode.b(21);
        this.previous = null;
        this.next = null;
    }

    static {
    }
}
