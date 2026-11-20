/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dnb extends IntrusiveNode {
    int field_d;
    byte[] field_e;

    final static tja c(byte param0) {
        bk.field_w.position = 0;
        if (param0 != -39) {
          return (tja) null;
        }
        bk.field_w.beginBitRead(-23497);
        tja var1 = (tja) (gva.field_a.a((byte) 69));
        if (!(var1 instanceof CompactGameState)) {
          var1.readState(bk.field_w, false);
          bk.field_w.endBitRead((byte) -92);
          return var1;
        }
        ((CompactGameState) ((Object) var1)).readCompactState(bk.field_w, 32);
        bk.field_w.endBitRead((byte) -92);
        return var1;
    }

    dnb(byte[] param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dnb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
