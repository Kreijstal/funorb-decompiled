/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    private int field_f;
    private int field_b;
    private uf[] field_j;
    static bl field_d;
    static vj field_g;
    float field_a;
    static vj field_i;
    private int field_e;
    String field_h;
    private static long[] field_c;

    final static boolean b(int param0) {
        if (param0 != -11) {
          return false;
        }
        if (af.field_b < 10) {
          return false;
        }
        if (!gf.field_G) {
          return !n.a(param0 + 75) ? true : false;
        }
        return false;
    }

    final boolean a(int param0) {
        uf var2;
        int var3;
        uf var4;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -11255) {
          return true;
        }
        while (this.field_e < this.field_f) {
          var4 = this.field_j[this.field_e];
          var2 = var4;
          if (!var4.field_b.a(0)) {
            this.a(var4, 0, (byte) 52);
            return false;
          }
          if (var4.field_l >= 0 &&
            !var4.field_b.c(var4.field_l, 29691)) {
            this.a(var2, var4.field_b.a(24, var4.field_l), (byte) 52);
            return false;
          }
          if (var4.field_h != null &&
            !var4.field_b.a(255, var4.field_h)) {
            this.a(var2, var4.field_b.b(10461, var4.field_h), (byte) 52);
            return false;
          }
          if (0 > var4.field_l &&
            var4.field_h == null &&
            null != var4.field_g &&
            !var4.field_b.c((byte) 66)) {
            this.a(var2, var4.field_b.d((byte) 95), (byte) 52);
            return false;
          }
          this.field_e = this.field_e + 1;
        }
        return true;
    }

    private final void a(uf param0, int param1, byte param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)(1 + this.field_e) + (float)param1 / 100.0f;
          if (0 == param1) {
            this.field_h = param0.field_e;
          } else {
            this.field_h = param0.field_g + " - " + param1 + "%";
          }
          this.field_a = var4_float * (float)this.field_b / (float)(1 + this.field_f);
          if (param2 == 52) {
            return;
          }
          field_i = (vj) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("sb.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 == 33) {
          field_g = null;
          field_i = null;
          field_c = null;
          return;
        }
        sb.b(-116);
        field_g = null;
        field_i = null;
        field_c = null;
    }

    private sb() throws Throwable {
        throw new Error();
    }

    final static void b(byte param0) {
        af.b(6);
        if (n.field_g != null) {
          hb.a(param0 ^ -72, n.field_g);
          oe.b(-19495);
          de.e(-86);
          oi.b((byte) -120);
          if (param0 != 67) {
            field_d = (bl) null;
            if (DrPhlogistonSavesTheEarth.t(18137)) {
              nj.field_p.d(1, param0 - 18459);
              qj.a(0, param0 + 14589);
            }
            eg.a((byte) 126);
            return;
          }
          if (DrPhlogistonSavesTheEarth.t(18137)) {
            nj.field_p.d(1, param0 - 18459);
            qj.a(0, param0 + 14589);
          }
          eg.a((byte) 126);
          return;
        }
        oe.b(-19495);
        de.e(-86);
        oi.b((byte) -120);
        if (param0 == 67) {
          if (DrPhlogistonSavesTheEarth.t(18137)) {
            nj.field_p.d(1, param0 - 18459);
            qj.a(0, param0 + 14589);
          }
          eg.a((byte) 126);
          return;
        }
        field_d = (bl) null;
        if (DrPhlogistonSavesTheEarth.t(18137)) {
          nj.field_p.d(1, param0 - 18459);
          qj.a(0, param0 + 14589);
        }
        eg.a((byte) 126);
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_c = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if (1L == (1L & var0)) {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_c[var2] = var0;
        }
    }
}
