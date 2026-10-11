/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends rw {
    static float[] field_v;
    static mi field_y;
    int field_x;
    fs field_w;
    byte field_z;

    public static void d(byte param0) {
        field_y = null;
        field_v = null;
        if (param0 != 62) {
          ki var2 = (ki) null;
          fv.a(-52, (ki) null, (ki) null);
        }
    }

    final int a(int param0) {
        if (this.field_w == null) {
          return 0;
        }
        if (param0 == -1) {
          return 100 * this.field_w.field_p / (-this.field_z + this.field_w.field_n.length);
        }
        return 50;
    }

    final static void a(int param0, ki param1, ki param2) {
        try {
          if (param0 != 7966) {
            fv.d((byte) 80);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fv.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(byte param0) {
        int var1_int = 0;
        dj var2 = null;
        int var3 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        dj var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          wd.field_f.b();
          var1_int = -111 % ((param0 + 34) / 35);
          iv.field_a.b();
          vf.field_b = vf.field_b - 1;
          if (vf.field_b == 0) {
            vf.field_b = 200;
            var2 = (dj) (jf.field_c.b(107));
            while (var2 != null) {
              if (!var2.field_k.a(false)) {
                var2.b(false);
              }
              var2 = (dj) (jf.field_c.d((byte) 18));
            }
            if (s.field_u != null) {
              var2Lifetime1 = (dj) (s.field_u.b(-105));
              while (var2Lifetime1 != null) {
                if (!var2Lifetime1.field_k.a(false)) {
                  var2Lifetime1.b(false);
                }
                var2Lifetime1 = (dj) (s.field_u.d((byte) 18));
              }
            }
          }
          if (qc.field_e != null) {
            stackIn_18_0 = qc.field_e.c(-8192);
            if (!stackIn_18_0) {
              nd.field_B = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "fv.G(" + param0 + ')');
        }
    }

    final byte[] d(boolean param0) {
        if (param0) {
          return (byte[]) null;
        }
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (-this.field_z + this.field_w.field_n.length <= this.field_w.field_p) {
          return this.field_w.field_n;
        }
        throw new RuntimeException();
    }

    fv() {
    }

    static {
        field_v = new float[4];
        field_y = new mi();
        nn.b(50, -120);
    }
}
