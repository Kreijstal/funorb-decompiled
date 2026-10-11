/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends li {
    int field_t;
    static int[] field_w;
    static int[] field_v;
    pk field_n;
    int field_p;
    int field_u;
    int field_q;
    int field_s;
    static int field_o;
    static String field_r;

    public static void f(int param0) {
        field_w = null;
        if (param0 != -8105) {
          return;
        }
        field_r = null;
        field_v = null;
    }

    final static cr e(int param0) {
        if (param0 != 2) {
          return (cr) null;
        }
        return vd.field_d.field_Nb;
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (param0 == -14) {
          return param2 >= param3 ? param2 > param1 ? param1 : param2 : param3;
        }
        field_v = (int[]) null;
        return param2 >= param3 ? param2 > param1 ? param1 : param2 : param3;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          ch.field_e.a(qj.field_c, true, (byte) -71, qe.field_Z);
          if (param0 != 1) {
            stackIn_3_0 = 16;
            return stackIn_3_0;
          }
          ch.field_e.l(0);
          while (gf.a(false)) {
            ch.field_e.a(param0 - 93, de.field_f, ji.field_r);
          }
          if (nm.field_F != -1) {
            var1_int = nm.field_F;
            rh.b(-14, -1);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (ed.field_t) {
            stackIn_12_0 = 3;
            return stackIn_12_0;
          }
          if (bf.field_b == um.field_F) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!cl.field_c.a((byte) -79)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (bf.field_b != un.field_Hb) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "pk.A(" + param0 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        gg var3 = null;
        int var4 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        gg var3Lifetime1;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = -36 % ((-24 - param0) / 47);
          tg.field_e = param1;
          var3 = (gg) (fm.field_b.a((byte) 100));
          while (var3 != null) {
            if (!var3.field_q.b(99)) {
              var3.c(2);
            } else {
              var3.field_r.g(128 + var3.field_p * tg.field_e >> 8);
            }
            var3 = (gg) (fm.field_b.b(117));
          }
          if (ro.field_b != null) {
            var3Lifetime1 = (gg) (ro.field_b.a((byte) 100));
            while (var3Lifetime1 != null) {
              stackIn_12_0 = var3Lifetime1.field_q.b(114);
              if (!stackIn_12_0) {
                var3Lifetime1.c(2);
              } else {
                var3Lifetime1.field_r.g(128 + tg.field_e * var3Lifetime1.field_p >> 8);
              }
              var3Lifetime1 = (gg) (ro.field_b.b(41));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "pk.B(" + param0 + ',' + param1 + ')');
        }
    }

    pk(int param0, int param1, int param2, int param3, int param4) {
        this.field_p = param2;
        this.field_t = param3;
        this.field_u = param0;
        this.field_q = param4;
        this.field_s = param1;
    }

    static {
        field_w = new int[8192];
        field_v = new int[8192];
        field_r = "Create a free Account";
    }
}
