/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf {
    static int field_e;
    static int field_b;
    static ci field_f;
    static int field_c;
    long field_g;
    uf field_a;
    uf field_d;

    public static void b(int param0) {
        field_f = null;
        if (param0 == 71) {
          return;
        }
        uf.b(75);
    }

    final boolean a(byte param0) {
        if (param0 <= -21) {
          return null != this.field_a ? true : false;
        }
        uf.a(55, -98);
        if (null == this.field_a) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1) {
        uf var2 = null;
        int var3 = 0;
        eg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Terraphoenix.field_V;
        try {
          var4 = (eg) (ic.field_s.d(param0 - 11568));
          while (var4 != null) {
            qc.a(param1, var4, (byte) -110);
            var4 = (eg) (ic.field_s.e((byte) -119));
          }
          var2 = vc.field_g.d(param0 ^ 30032);
          if (param0 != 20840) {
            field_f = (ci) null;
          }
          while (var2 != null) {
            eb.a(param1, (byte) 125);
            var2 = vc.field_g.e((byte) -119);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2_ref), "uf.JB(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0) {
        if (this.field_a == null) {
          return;
        }
        this.field_a.field_d = this.field_d;
        this.field_d.field_a = this.field_a;
        if (param0 == 12) {
          this.field_d = null;
          this.field_a = null;
          return;
        }
    }

    static {
        field_b = 71;
    }
}
