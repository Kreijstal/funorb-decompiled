/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg extends IntrusiveNode {
    static int field_j;
    int field_i;
    int field_h;

    final static void a(int param0) {
        hn var1 = null;
        int var2 = ZombieDawn.field_J;
        hn var1Lifetime1;
        try {
          ExceptionWrapper.field_d.serviceOutput();
          cf.field_fb.serviceOutput();
          if (param0 > -30) {
            field_j = 75;
          }
          d.field_b = d.field_b - 1;
          if (d.field_b == 0) {
            d.field_b = 200;
            var1 = (hn) (fj.field_i.last((byte) 26));
            while (var1 != null) {
              if (!var1.field_k.isLinked((byte) 73)) {
                var1.unlink(-27598);
              }
              var1 = (hn) (fj.field_i.previous(false));
            }
            if (BufferedFile.field_n != null) {
              var1Lifetime1 = (hn) (BufferedFile.field_n.last((byte) 26));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_k.isLinked((byte) 73)) {
                  var1Lifetime1.unlink(-27598);
                }
                var1Lifetime1 = (hn) (BufferedFile.field_n.previous(false));
              }
            }
          }
          if (uh.field_o != null &&
            !uh.field_o.isReady((byte) -34)) {
            te.field_kb = null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        ProxySocketConnector.field_j = oj.b(0);
        wo.field_xb = new dn();
        if (param0) {
          return;
        }
        ad.openScreenSizeDialog((byte) 122);
    }

    private mg() throws Throwable {
        throw new Error();
    }

    static {
        field_j = 64;
    }
}
