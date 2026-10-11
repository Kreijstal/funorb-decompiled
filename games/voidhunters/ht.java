/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ht extends f {
    static String field_h;
    ij field_k;
    private hbb field_i;
    qkb field_j;

    final f a() {
        fkb var1;
        while (true) {
          var1 = (fkb) (this.field_k.a((byte) 30));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_j) {
            return (f) ((Object) var1.field_j);
          }
        }
    }

    final static float[] a(int param0, int param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new float[param0];
          var3 = var4;
          cua.a(param2, 0, var4, param1, param0);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("ht.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final f c() {
        fkb var1 = (fkb) (this.field_k.d(0));
        if (var1 == null) {
          return null;
        }
        if (var1.field_j != null) {
          return (f) ((Object) var1.field_j);
        }
        return this.a();
    }

    final int d() {
        return 0;
    }

    private final void a(fkb param0, int param1, int param2) {
        hbb stackIn_7_0 = null;
        fkb stackIn_7_1 = null;
        boolean stackIn_8_2 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((4 & this.field_i.field_v[param0.field_o]) != 0 &&
            param0.field_v < 0) {
            var4_int = this.field_i.field_l[param0.field_o] / vka.field_s;
            var5 = (-param0.field_p + var4_int + 1048575) / var4_int;
            param0.field_p = 1048575 & param0.field_p + param2 * var4_int;
            if (param2 >= var5) {
              if (this.field_i.field_j[param0.field_o] == 0) {
                param0.field_j = fga.b(param0.field_y, param0.field_j.k(), param0.field_j.f(), param0.field_j.h());
              } else {
                param0.field_j = fga.b(param0.field_y, param0.field_j.k(), 0, param0.field_j.h());
                stackIn_7_0 = this.field_i;
                stackIn_7_1 = (fkb) (param0);
                stackIn_8_2 = !(param0.field_n.field_e[param0.field_x] >= 0);
                ((hbb) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_8_2, true);
              }
              if (param0.field_n.field_e[param0.field_x] < 0) {
                param0.field_j.d(-1);
              }
              param2 = param0.field_p / var4_int;
            }
          }
          param0.field_j.a(param2);
          if (param1 == -1) {
            return;
          }
          field_h = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ht.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        fkb var6 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          this.field_j.a(param0, param1, param2);
          var6 = (fkb) (this.field_k.d(0));
          while (var6 != null) {
            stackIn_4_0 = this.field_i.a(var6, 0);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_k) {
                this.a(var4_int, var5 + var4_int, var6, param0, var6.field_k, (byte) 26);
                var5 = var5 - var6.field_k;
                var4_int = var4_int + var6.field_k;
                if (this.field_i.a(var4_int, param0, var5, var6, (byte) -12)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var4_int, var5 + var4_int, var6, param0, var5, (byte) 12);
                var6.field_k = var6.field_k - var5;
              }
            }
            var6 = (fkb) (this.field_k.a((byte) 103));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ht.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, fkb param2, int[] param3, int param4, byte param5) {
        hbb stackIn_12_0 = null;
        fkb stackIn_12_1 = null;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fga var11 = null;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (0 != (this.field_i.field_v[param2.field_o] & 4) &&
            param2.field_v < 0) {
            var7_int = this.field_i.field_l[param2.field_o] / vka.field_s;
            while (true) {
              var8 = (1048575 + (var7_int - param2.field_p)) / var7_int;
              if (param4 < var8) {
                param2.field_p = param2.field_p + param4 * var7_int;
                break;
              }
              param2.field_j.a(param3, param0, var8);
              param2.field_p = param2.field_p + (var7_int * var8 - 1048576);
              param0 = param0 + var8;
              param4 = param4 - var8;
              var9 = vka.field_s / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param2.field_j;
              if (this.field_i.field_j[param2.field_o] == 0) {
                param2.field_j = fga.b(param2.field_y, var11.k(), var11.f(), var11.h());
              } else {
                param2.field_j = fga.b(param2.field_y, var11.k(), 0, var11.h());
                stackIn_12_0 = this.field_i;
                stackIn_12_1 = (fkb) (param2);
                stackIn_13_2 = !(0 <= param2.field_n.field_e[param2.field_x]);
                ((hbb) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2, true);
                param2.field_j.d(var9, var11.f());
              }
              if (param2.field_n.field_e[param2.field_x] < 0) {
                param2.field_j.d(-1);
              }
              var11.f(var9);
              var11.a(param3, param0, param1 - param0);
              if (!var11.g()) {
                continue;
              }
              this.field_j.b(var11);
            }
          }
          param2.field_j.a(param3, param0, param4);
          if (param5 >= 11) {
            return;
          }
          this.field_j = (qkb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("ht.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
          return;
        }
        float[] var2 = (float[]) null;
        ht.a(-65, -20, (float[]) null);
    }

    final void a(int param0) {
        int var2;
        fkb var3;
        int var4;
        var4 = VoidHunters.field_G;
        this.field_j.a(param0);
        var3 = (fkb) (this.field_k.d(0));
        while (var3 != null) {
          if (!this.field_i.a(var3, 0)) {
            var2 = param0;
            do {
              if (var3.field_k >= var2) {
                this.a(var3, -1, var2);
                var3.field_k = var3.field_k - var2;
                break;
              }
              this.a(var3, -1, var3.field_k);
              var2 = var2 - var3.field_k;
            } while (!this.field_i.a(0, (int[]) null, var2, var3, (byte) -68));
          }
          var3 = (fkb) (this.field_k.a((byte) 99));
        }
    }

    ht(hbb param0) {
        this.field_k = new ij();
        this.field_j = new qkb();
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ht.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
