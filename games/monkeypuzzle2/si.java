/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends fb {
    byte[] field_p;
    gf field_t;
    static am field_s;
    static int[] field_u;
    int field_q;
    static int[] field_v;
    static kj field_o;
    static int field_r;

    final byte[] e(int param0) {
        if (this.field_j) {
          throw new RuntimeException();
        }
        int var2 = -15 / ((25 - param0) / 41);
        return this.field_p;
    }

    final static hl a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        hb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hb var8 = null;
        pi var9 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var8 = MonkeyPuzzle2.field_D;
        var2 = var8;
        var3 = var8.a((byte) 114);
        stackIn_3_0 = ((128 & var3) != 0);
        eg.field_j = stackIn_3_0;
        lf.field_c = var3 & 127;
        if (param1 != 0) {
          si.f(78);
        }
        o.field_c = var8.a((byte) 114);
        bi.field_z = var8.i(66);
        if (2 == lf.field_c) {
          sd.field_b = var8.j(param1 + 17277);
          c.field_b = var8.c((byte) 115);
        } else {
          sd.field_b = 0;
          c.field_b = 0;
        }
        stackIn_11_0 = (var8.a((byte) 114) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        lc.field_h = var8.f(-1);
        if (var4 != 0) {
          i.field_h = var8.f(-1);
        } else {
          i.field_h = lc.field_h;
        }
        if (lf.field_c == 1) {
          var8.j(17277);
          var8.f(-1);
        } else {
          if (lf.field_c == 4) {
            var8.j(17277);
            var8.f(-1);
          }
        }
        if (!param0) {
          ba.field_h = ea.a((byte) 90, var8, 80);
          wh.field_e = null;
          return new hl(param0);
        }
        var5 = var8.j(17277);
        try {
          var9 = hi.field_a.a(var5, param1 ^ -32769);
          ba.field_h = var9.b((byte) -54);
          if (!i.field_h.equals(cl.field_e)) {
            stackIn_25_0 = var9.field_q;
          } else {
            stackIn_25_0 = null;
          }
          wh.field_e = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          kk.a("CC1", (byte) 123, (Throwable) ((Object) var6));
          ba.field_h = null;
          wh.field_e = null;
          return new hl(param0);
        }
        return new hl(param0);
    }

    final static cd[] f(int param0) {
        if (param0 == 0) {
          return new cd[]{oe.field_l, dh.field_d, jf.field_k};
        }
        field_v = (int[]) null;
        return new cd[]{oe.field_l, dh.field_d, jf.field_k};
    }

    public static void b(byte param0) {
        if (param0 == 20) {
          field_v = null;
          field_s = null;
          field_o = null;
          field_u = null;
          return;
        }
        si.f(-27);
        field_v = null;
        field_s = null;
        field_o = null;
        field_u = null;
    }

    final int a(boolean param0) {
        if (!param0) {
          si.f(-82);
          if (!this.field_j) {
            return 100;
          }
          return 0;
        }
        if (!this.field_j) {
          return 100;
        }
        return 0;
    }

    si() {
    }

    static {
        field_u = new int[4];
        field_v = new int[5];
        field_s = new am();
        field_r = 0;
    }
}
