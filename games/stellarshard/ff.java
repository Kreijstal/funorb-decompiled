/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends nh {
    static int field_k;

    final ua a(int param0) {
        if (param0 != 160) {
          field_k = -55;
          return rg.field_J;
        }
        return rg.field_J;
    }

    final static void a(int param0, int param1) {
        ha var2 = pg.field_fb;
        var2.f(param1, 950);
        var2.a(false, param0);
        var2.a(false, 0);
    }

    ff(long param0, String param1) {
        super(param0, param1);
    }

    final static nj a(boolean param0, byte param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        ha var9 = null;
        od var10 = null;
        var8 = stellarshard.field_B;
        var9 = ae.field_N;
        var3 = var9.f(4);
        ii.field_J = var3 & 127;
        stackIn_3_0 = ((var3 & 128) != 0);
        eh.field_d = stackIn_3_0;
        ha.field_t = var9.f(4);
        k.field_d = var9.d(0);
        if (ii.field_J != 2) {
          il.field_w = 0;
          mg.field_y = 0;
        } else {
          mg.field_y = var9.c((byte) 79);
          il.field_w = var9.c(true);
        }
        stackIn_9_0 = (var9.f(4) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        ld.field_z = var9.e((byte) 122);
        var5 = -101 % ((param1 - 46) / 36);
        if (var4 == 0) {
          oe.field_d = ld.field_z;
        } else {
          oe.field_d = var9.e((byte) 110);
        }
        if (ii.field_J == 1) {
          var9.c((byte) 105);
          var9.e((byte) 106);
        } else {
          if (ii.field_J == 4) {
            var9.c((byte) 105);
            var9.e((byte) 106);
          }
        }
        if (!param0) {
          ug.field_b = ni.a(false, 80, var9);
          rc.field_k = null;
          return new nj(param0);
        }
        var6 = var9.c((byte) 62);
        try {
          var10 = qh.field_e.a(32767, var6);
          ug.field_b = var10.e(0);
          if (!oe.field_d.equals(wf.field_b)) {
            stackIn_23_0 = var10.field_y;
          } else {
            stackIn_23_0 = null;
          }
          rc.field_k = stackIn_23_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (Exception) (Object) decompiledCaughtException;
          qe.a(-105, "CC1", (Throwable) ((Object) var7));
          rc.field_k = null;
          ug.field_b = null;
          return new nj(param0);
        }
        return new nj(param0);
    }

    static {
    }
}
