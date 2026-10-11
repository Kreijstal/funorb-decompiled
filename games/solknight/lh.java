/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ej {
    static boolean field_l;
    static int field_p;
    private mf field_n;
    static int field_q;
    nc field_m;
    static da field_o;
    e field_r;
    static int field_s;

    final ej a() {
        hg var1 = (hg) (this.field_m.a((byte) 51));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_w) {
          return (ej) ((Object) var1.field_w);
        }
        return this.b();
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = 42 % ((param1 - 47) / 54);
          var3 = param0.charAt(0);
          var4 = 1;
          while (true) {
            if (param0.length() <= var4) {
              return true;
            }
            if (var3 == param0.charAt(var4)) {
              var4++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("lh.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hg var6 = null;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          this.field_r.a(param0, param1, param2);
          var6 = (hg) (this.field_m.a((byte) 51));
          while (var6 != null) {
            if (!this.field_n.b(var6, -1642423728)) {
              var5 = param2;
              var4_int = param1;
              do {
                if (var5 <= var6.field_t) {
                  this.a(param0, var5 + var4_int, var6, var4_int, var5, (byte) -117);
                  var6.field_t = var6.field_t - var5;
                  break;
                }
                this.a(param0, var5 + var4_int, var6, var4_int, var6.field_t, (byte) -117);
                var5 = var5 - var6.field_t;
                var4_int = var4_int + var6.field_t;
              } while (!this.field_n.a(var4_int, param0, var5, 100, var6));
            }
            var6 = (hg) (this.field_m.b(-51));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("lh.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int d() {
        return 0;
    }

    public static void d(int param0) {
        if (param0 > -67) {
          return;
        }
        field_o = null;
    }

    private final void a(byte param0, hg param1, int param2) {
        mf stackIn_8_0 = null;
        hg stackIn_8_1 = null;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (0 != (this.field_n.field_U[param1.field_z] & 4) &&
            param1.field_k < 0) {
            var4_int = this.field_n.field_J[param1.field_z] / gj.field_s;
            var5 = (-param1.field_C + var4_int + 1048575) / var4_int;
            param1.field_C = var4_int * param2 + param1.field_C & 1048575;
            if (param2 >= var5) {
              if (this.field_n.field_z[param1.field_z] == 0) {
                param1.field_w = qi.a(param1.field_u, param1.field_w.j(), param1.field_w.e(), param1.field_w.f());
              } else {
                param1.field_w = qi.a(param1.field_u, param1.field_w.j(), 0, param1.field_w.f());
                stackIn_8_0 = this.field_n;
                stackIn_8_1 = (hg) (param1);
                stackIn_9_2 = !(param1.field_p.field_s[param1.field_o] >= 0);
                ((mf) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2, false);
              }
              if (param1.field_p.field_s[param1.field_o] < 0) {
                param1.field_w.d(-1);
              }
              param2 = param1.field_C / var4_int;
            }
          }
          param1.field_w.a(param2);
          if (param0 < -43) {
            return;
          }
          field_q = 96;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("lh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int[] param0, int param1, hg param2, int param3, int param4, byte param5) {
        mf stackIn_12_0 = null;
        hg stackIn_12_1 = null;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qi var11 = null;
        int var12 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          if ((4 & this.field_n.field_U[param2.field_z]) != 0 &&
            0 > param2.field_k) {
            var7_int = this.field_n.field_J[param2.field_z] / gj.field_s;
            while (true) {
              var8 = (1048575 + (var7_int - param2.field_C)) / var7_int;
              if (param4 < var8) {
                param2.field_C = param2.field_C + var7_int * param4;
                break;
              }
              param2.field_w.a(param0, param3, var8);
              param3 = param3 + var8;
              param4 = param4 - var8;
              param2.field_C = param2.field_C + (var8 * var7_int - 1048576);
              var9 = gj.field_s / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param2.field_w;
              if (0 != this.field_n.field_z[param2.field_z]) {
                param2.field_w = qi.a(param2.field_u, var11.j(), 0, var11.f());
                stackIn_12_0 = this.field_n;
                stackIn_12_1 = (hg) (param2);
                stackIn_13_2 = !(param2.field_p.field_s[param2.field_o] >= 0);
                ((mf) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2, false);
                param2.field_w.e(var9, var11.e());
              } else {
                param2.field_w = qi.a(param2.field_u, var11.j(), var11.e(), var11.f());
              }
              if (param2.field_p.field_s[param2.field_o] < 0) {
                param2.field_w.d(-1);
              }
              var11.e(var9);
              var11.a(param0, param3, -param3 + param1);
              if (!var11.h()) {
                continue;
              }
              this.field_r.a(var11);
            }
          }
          param2.field_w.a(param0, param3, param4);
          if (param5 == -117) {
            return;
          }
          this.field_m = (nc) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("lh.B(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final ej b() {
        hg var1;
        int var2;
        var2 = SolKnight.field_L ? 1 : 0;
        while (true) {
          var1 = (hg) (this.field_m.b(-60));
          if (var1 == null) {
            return null;
          }
          if (var1.field_w != null) {
            return (ej) ((Object) var1.field_w);
          }
        }
    }

    final void a(int param0) {
        int var2;
        hg var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = SolKnight.field_L ? 1 : 0;
        this.field_r.a(param0);
        var3 = (hg) (this.field_m.a((byte) 51));
        while (var3 != null) {
          stackIn_4_0 = this.field_n.b(var3, -1642423728);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var2 > var3.field_t) {
              this.a((byte) -126, var3, var3.field_t);
              var2 = var2 - var3.field_t;
              if (this.field_n.a(0, (int[]) null, var2, 100, var3)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a((byte) -107, var3, var2);
              var3.field_t = var3.field_t - var2;
            }
          }
          var3 = (hg) (this.field_m.b(-126));
        }
    }

    lh(mf param0) {
        this.field_m = new nc();
        this.field_r = new e();
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = true;
    }
}
