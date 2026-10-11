/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends id {
    private db[] field_x;
    static int field_r;
    static int field_p;
    static int field_v;
    static int field_w;
    static java.applet.Applet field_u;
    private db field_t;
    static int[] field_s;
    static String field_q;

    final static String c(int param0) {
        if (dj.field_a == o.field_l) {
          return lc.field_p;
        }
        if (dj.field_a == el.field_E) {
          return gk.field_c;
        }
        if (param0 != -5) {
          field_p = -104;
        }
        if (!al.field_f.a(true)) {
          return gk.field_c;
        }
        return va.field_a;
    }

    final db a(byte param0, int param1) {
        int var3 = -43 % ((param0 - 73) / 41);
        db dupTemp$0 = new db();
        this.field_x[param1] = dupTemp$0;
        return dupTemp$0;
    }

    final static void a(kl param0, int param1, boolean param2) {
        try {
          nl.field_e.b(-104, param0);
          if (param2) {
            field_u = (java.applet.Applet) null;
          }
          ca.a(param1, param0, (byte) 71);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    tc(tc param0, boolean param1) {
        this();
        try {
          param0.a(param1, -59, this);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 > -52) {
          return;
        }
        field_s = null;
        field_u = null;
        field_q = null;
    }

    final void a(int param0, pb[] param1) {
        int var4 = 0;
        db[] var3 = null;
        db var5 = null;
        int var6 = 0;
        db[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = stellarshard.field_B;
        try {
          var7 = this.field_x;
          var3 = var7;
          if (param0 >= -64) {
            this.field_t = (db) null;
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_d = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tc.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void d(int param0) {
        if (param0 != 1) {
          field_p = 121;
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        var3 = stellarshard.field_B;
        if (param1 < 124) {
          field_q = (String) null;
        }
        kc.field_b = 0;
        k.field_b = null;
        dl.field_A = null;
        var2 = ll.field_b;
        ll.field_b = l.field_b;
        od.field_v.field_i = od.field_v.field_i + 1;
        if (param0 == 51) {
          od.field_v.field_g = 2;
        } else {
          if (param0 != 50) {
            od.field_v.field_g = 1;
          } else {
            od.field_v.field_g = 5;
          }
        }
        l.field_b = var2;
        if (od.field_v.field_i >= 2 &&
          51 == param0) {
          return 2;
        }
        if (2 <= od.field_v.field_i &&
          param0 == 50) {
          return 5;
        }
        if (od.field_v.field_i >= 4) {
          return 1;
        }
        return -1;
    }

    public tc() {
        this.field_x = new db[6];
        this.field_t = new db();
        db dupTemp$0 = new db();
        this.field_x[0] = dupTemp$0;
        db var1 = dupTemp$0;
        var1.a((byte) 62);
    }

    final void a(int param0, int param1, pb[] param2) {
        int var4_int = 0;
        int var4_intLifetime1;
        try {
          var4_int = param0;
          if (this.field_x[var4_int] == null) {
            this.field_x[var4_int] = new db();
          }
          this.field_x[param0].field_d = param2;
          var4_intLifetime1 = -105 % ((param1 - 56) / 32);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tc.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, pb param1) {
        int var4 = 0;
        db[] var3 = null;
        db var5 = null;
        int var6 = 0;
        db[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = stellarshard.field_B;
        try {
          var7 = this.field_x;
          var3 = var7;
          if (!param0) {
            return;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("tc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        rj stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        db var7 = null;
        db var9 = null;
        ig var10 = null;
        db var11 = null;
        db var12 = null;
        db var13 = null;
        db var14 = null;
        try {
          if (param3 instanceof ig) {
            stackIn_3_0 = (rj) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (ig) (stackIn_3_0);
          if (param4 != 4549) {
            tc.c(22);
          }
          gg.a(126, param3.field_p + (param1 + param3.field_w), param3.field_k + param2, param2 + param3.field_k + param3.field_t, param1 + param3.field_w);
          if (var10 != null) {
            param0 = param0 & var10.field_E;
          }
          var7 = this.field_x[0];
          this.field_t.a((byte) 76);
          var7.a(this, this.field_t, param4 ^ 4584, param2, param3, param1);
          if (var10 != null) {
            if (var10.field_z) {
              var11 = this.field_x[1];
              if (var11 != null) {
                var11.a(this, this.field_t, 94, param2, param3, param1);
              }
            }
            if (var10.field_q) {
              var12 = this.field_x[3];
              if (var10.field_o != 0 &&
                var12 != null) {
                var12.a(this, this.field_t, 126, param2, param3, param1);
              } else {
                var9 = this.field_x[2];
                if (var9 != null) {
                  var9.a(this, this.field_t, param4 ^ -4525, param2, param3, param1);
                }
              }
            }
          }
          if (param3.e(0)) {
            var13 = this.field_x[5];
            if (var13 != null) {
              var13.a(this, this.field_t, 99, param2, param3, param1);
            }
          }
          if (!param0) {
            var14 = this.field_x[4];
            if (var14 != null) {
              var14.a(this, this.field_t, -122, param2, param3, param1);
            }
          }
          this.field_t.a(param2, this, param3, param4 - 4547, param1);
          id.b((byte) -58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("tc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, tc param2) {
        int var5 = 0;
        db dupTemp$0 = null;
        db stackIn_8_0 = null;
        db stackIn_9_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        db var6 = null;
        db var7 = null;
        int var8 = 0;
        var8 = stellarshard.field_B;
        try {
          var4_int = -94 % ((6 - param1) / 63);
          super.a(param2, (byte) -34);
          if (param0) {
            for (var5 = 0; var5 < 6; var5++) {
              var6 = this.field_x[var5];
              if (var6 != null) {
                var7 = param2.field_x[var5];
                stackIn_8_0 = var6;
                if (var7 == null) {
                  dupTemp$0 = new db();
                  param2.field_x[var5] = dupTemp$0;
                  stackIn_9_1 = dupTemp$0;
                } else {
                  stackIn_9_1 = var7;
                }
                ((db) (Object) stackIn_8_0).a(stackIn_9_1, true);
              } else {
                param2.field_x[var5] = null;
              }
            }
            return;
          }
          ri.a(this.field_x, 0, param2.field_x, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("tc.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_v = 0;
        field_q = "Continue";
    }
}
