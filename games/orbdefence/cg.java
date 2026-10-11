/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    j[] field_g;
    static hj field_d;
    int field_e;
    static fa[] field_c;
    int field_a;
    static String field_h;
    private static long[] field_b;
    static java.applet.Applet field_f;

    public static void d(int param0) {
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 0) {
          cg.d(51);
        }
        field_h = null;
    }

    final j a(int param0) {
        int fieldTemp$2 = 0;
        j dupTemp$3 = null;
        j var2;
        j var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = OrbDefence.field_D ? 1 : 0;
        if (this.field_e == 0) {
          return null;
        }
        var2 = this.field_g[0];
        if (param0 != -2) {
          this.field_a = -105;
        }
        fieldTemp$2 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        dupTemp$3 = this.field_g[fieldTemp$2];
        this.field_g[0] = dupTemp$3;
        var3 = dupTemp$3;
        var4 = 0;
        var9 = this.field_g[0].field_d;
        while (true) {
          var5 = 1 + 2 * var4;
          if (var5 < this.field_e) {
            var6 = var4 * 2 + 2;
            var7 = this.field_g[var5].field_d;
            if (this.field_e > var6) {
              var8 = this.field_g[var6].field_d;
              if (var7 > var8) {
                var7 = var8;
                var5++;
              }
            }
            if (var9 >= var7) {
              this.field_g[var4] = this.field_g[var5];
              this.field_g[var5] = var3;
              var4 = var5;
              continue;
            }
          }
          break;
        }
        return var2;
    }

    final void a(j param0, byte param1) {
        int fieldTemp$3 = 0;
        j dupTemp$4 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        j var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_e >= this.field_a) {
            this.c(-1);
          }
          fieldTemp$3 = this.field_e;
          this.field_e = this.field_e + 1;
          var3_int = fieldTemp$3;
          this.field_g[var3_int] = param0;
          var5 = param0.field_d;
          if (param1 != -83) {
            field_b = (long[]) null;
          }
          while (var3_int > 0) {
            var4 = -1 + var3_int >> 1;
            dupTemp$4 = this.field_g[var4];
            var6 = dupTemp$4;
            if (dupTemp$4.field_d > var5) {
              this.field_g[var4] = param0;
              this.field_g[var3_int] = var6;
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cg.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          return true;
        }
        return this.field_e == 0 ? true : false;
    }

    final static void a(mg param0, java.math.BigInteger param1, int param2, java.math.BigInteger param3, mg param4) {
        try {
          jc.a(param0, 53, param2, param4.field_j, param4.field_i, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "cg.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        this.field_a = this.field_a << 1;
        j[] var5 = new j[this.field_a];
        j[] var2 = var5;
        for (var3 = 0; var3 < this.field_e; var3++) {
          var5[var3] = this.field_g[var3];
        }
        this.field_g = var2;
        if (param0 != -1) {
          field_b = (long[]) null;
        }
    }

    cg(int param0) {
        if (param0 <= 0) {
          param0 = 16;
        }
        this.field_a = param0;
        this.field_g = new j[this.field_a];
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_d = new hj(640, 480);
        field_h = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = new long[256];
        for (var2 = 0; 256 > var2; var2++) {
          var0 = (long)var2;
          for (var3 = 0; 8 > var3; var3++) {
            if ((1L & var0) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_b[var2] = var0;
        }
    }
}
