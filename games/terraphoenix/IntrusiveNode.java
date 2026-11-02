/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static int field_e;
    static int field_b;
    static Sprite field_f;
    static int field_c;
    long key;
    IntrusiveNode next;
    IntrusiveNode previous;

    public static void b(int param0) {
        field_f = null;
        if (param0 == 71) {
          return;
        }
        IntrusiveNode.b(75);
    }

    final boolean a(byte param0) {
        if (param0 <= -21) {
          return null != this.next ? true : false;
        }
        IntrusiveNode.a(55, -98);
        if (null == this.next) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        eg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Terraphoenix.field_V;
        try {
          var4 = (eg) (ic.field_s.beginBackward(param0 - 11568));
          while (var4 != null) {
            qc.a(param1, var4, (byte) -110);
            var4 = (eg) (ic.field_s.nextBackward((byte) -119));
          }
          var2 = vc.field_g.beginBackward(param0 ^ 30032);
          if (param0 != 20840) {
            field_f = (Sprite) null;
          }
          while (var2 != null) {
            eb.a(param1, (byte) 125);
            var2 = vc.field_g.nextBackward((byte) -119);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.wrapException((Throwable) ((Object) var2_ref), "uf.JB(" + param0 + ',' + param1 + ')');
        }
    }

    final void unlink(byte obfuscationGuard) {
        if (this.next == null) {
          return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        if (obfuscationGuard == 12) {
          this.previous = null;
          this.next = null;
          return;
        }
    }

    static {
        field_b = 71;
    }
}
