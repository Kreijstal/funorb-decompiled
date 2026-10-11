/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_g;
    static String field_b;
    private int field_h;
    String field_f;
    private int field_d;
    private sa[] field_a;
    private int field_e;
    float field_c;

    final static db[] a(String param0, String param1, sh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        db[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 22306) {
            var6 = (int[]) null;
            td.a((int[]) null, false);
          }
          var4_int = param2.c(param0, (byte) -89);
          var5 = param2.a(param1, -27964, var4_int);
          stackIn_3_0 = ij.a(var5, (byte) -117, param2, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("td.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int[] param0, boolean param1) {
        int var5_int = 0;
        int var6 = 0;
        ng stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        c var4_ref_c = null;
        int var4 = 0;
        c var5 = null;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          if (gg.field_b != uf.field_m) {
            return false;
          }
          if (param1) {
            return true;
          }
          var2_long = rf.c(0);
          if (0 != sc.field_f &&
            0 > kk.field_r) {
            stackIn_12_0 = eb.field_f;
            stackIn_13_1 = !(param1);
            var4_ref_c = (c) (((ng) (Object) stackIn_12_0).a(stackIn_13_1));
            if (var4_ref_c != null &&
              var2_long > var4_ref_c.field_l) {
              var4_ref_c.b((byte) -119);
              a.field_c = var4_ref_c.field_h.length;
              ig.field_a.field_h = 0;
              for (var5_int = 0; a.field_c > var5_int; var5_int++) {
                ig.field_a.field_j[var5_int] = var4_ref_c.field_h[var5_int];
              }
              vh.field_b = df.field_a;
              df.field_a = wl.field_i;
              wl.field_i = pg.field_d;
              pg.field_d = var4_ref_c.field_k;
              return true;
            }
          }
          while (true) {
            if (kk.field_r < 0) {
              ig.field_a.field_h = 0;
              if (!a.b(1, 10343)) {
                return false;
              }
              kk.field_r = ig.field_a.i((byte) -76);
              ig.field_a.field_h = 0;
              a.field_c = param0[kk.field_r];
            }
            if (!dc.d(2)) {
              return false;
            }
            if (sc.field_f == 0) {
              vh.field_b = df.field_a;
              df.field_a = wl.field_i;
              wl.field_i = pg.field_d;
              pg.field_d = kk.field_r;
              kk.field_r = -1;
              return true;
            }
            var4 = sc.field_f;
            if (0.0 != ug.field_u) {
              var4 = (int)((double)var4 + q.field_a.nextGaussian() * ug.field_u);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new c((long)var4 + var2_long, kk.field_r, new byte[a.field_c]);
            for (var6 = 0; a.field_c > var6; var6++) {
              var5.field_h[var6] = ig.field_a.field_j[var6];
            }
            eb.field_f.b(125, var5);
            kk.field_r = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("td.E(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int[] param1, int param2, byte[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = param0;
          while (true) {
            if (qg.field_b.length <= var5_int) {
              return;
            }
            param2 = qg.field_b[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param2;
              param2--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param4 = bf.field_a[incrementValue$1];
              dupTemp$2 = param3[param4];
              dupTemp$3 = param1[dupTemp$2];
              param1[dupTemp$2] = dupTemp$3 + 1;
              bf.field_a[dupTemp$3] = param4;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("td.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(byte param0, sa param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 37) {
            return;
          }
          var4_float = (float)param2 / 100.0f + (float)(1 + this.field_h);
          this.field_c = var4_float * (float)this.field_d / (float)(this.field_e + 1);
          if (0 == param2) {
            this.field_f = param1.field_b;
            return;
          }
          this.field_f = param1.field_e + " - " + param2 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("td.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        sa var2;
        int var3;
        sa var4;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 > -38) {
          this.field_e = -36;
        }
        while (this.field_e > this.field_h) {
          var4 = this.field_a[this.field_h];
          var2 = var4;
          if (!var4.field_d.c(88)) {
            this.a((byte) 37, var4, 0);
            return false;
          }
          if (var4.field_i >= 0 &&
            !var4.field_d.c(5, var4.field_i)) {
            this.a((byte) 37, var2, var4.field_d.b((byte) -91, var4.field_i));
            return false;
          }
          if (var4.field_f != null &&
            !var4.field_d.a(var4.field_f, 10762)) {
            this.a((byte) 37, var2, var4.field_d.b(var4.field_f, (byte) 121));
            return false;
          }
          if (var4.field_i < 0 &&
            var4.field_f == null &&
            var4.field_e != null &&
            !var4.field_d.a((byte) -126)) {
            this.a((byte) 37, var2, var4.field_d.a(false));
            return false;
          }
          this.field_h = this.field_h + 1;
        }
        return true;
    }

    private td() throws Throwable {
        throw new Error();
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        if (param0 == 0) {
          return;
        }
        field_b = (String) null;
    }

    static {
        field_b = "This password contains repeated characters, and would be easy to guess";
        field_g = "TUTORIAL";
    }
}
