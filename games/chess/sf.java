/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends hl {
    private int field_t;
    private int field_w;
    private int field_s;
    private static long[] field_u;
    private km[] field_x;
    static boolean[] field_v;

    public static void c(int param0) {
        field_u = null;
        if (param0 < 99) {
          return;
        }
        field_v = null;
    }

    final static void a(int param0, String param1) {
        try {
          rm.a((byte) -122, param1);
          qd.a(-1845, ii.field_T, false);
          if (param0 >= -120) {
            field_u = (long[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "sf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        ef var6 = (ef) (hd.field_l.g(-18110));
        ef var1 = var6;
        if (param0 != 16777215) {
          return;
        }
        if (var1 == null) {
        } else {
          var3 = fb.field_K;
          if (var3 >= 115) {
            var2 = -var3 + 230;
          } else {
            var2 = var3;
          }
          var2 -= 32;
          var2 = var2 > 8 ? 8 : var2;
          var4 = v.field_j.b(da.field_m[var6.field_k]);
          wb.a();
          var5 = 40;
          wb.a(4, var2 - 4, 8 + var4 + 56, var5, 8, 1, 128);
          wb.a(4, -4 + var2, 8 + (56 + var4), var5, 8, 16777215);
          me.field_c[var6.field_k].c(12, var2);
          v.field_j.a(da.field_m[var6.field_k], 56, v.field_j.field_H / 2 + (var2 + 16), 16777215, 0);
        }
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param0 < 58) {
            sf.c(95);
          }
          if (!param4.field_w) {
            stackIn_8_0 = (param4.d((byte) -67)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param4 instanceof fb) {
            param3 = param3 & ((fb) (param4)).field_H;
          }
          if (!param3) {
            stackIn_16_0 = this.field_w;
          } else {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_t;
            } else {
              stackIn_16_0 = this.field_s;
            }
          }
          var7 = stackIn_16_0;
          ab.a(var7, param4.field_y, param1 + param4.field_u, (param4.field_C - this.field_x[0].field_u >> 1) + param4.field_r + param2, -104, this.field_x);
          stackIn_19_0 = (param3) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          this.field_e.a(param4.field_v, param1 + param4.field_u, param2 - (-param4.field_r + 2), param4.field_y, param4.field_C, var8, -1, 1, 1, this.field_e.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("sf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public sf() {
        this(2188450, 2591221, 9543);
    }

    private sf(int param0, int param1, int param2) {
        this.field_x = bj.field_db;
        this.field_t = param1;
        this.field_e = tk.field_a;
        this.field_w = param2;
        this.field_s = param0;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_u = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if (1L == (1L & var0)) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_u[var2] = var0;
        }
    }
}
