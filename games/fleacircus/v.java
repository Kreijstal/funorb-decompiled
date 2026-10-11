/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends ja {
    private int field_T;
    static String[] field_R;
    private dd field_Q;
    private jb field_S;
    private String field_V;
    static byte[][] field_U;

    final String g(int param0) {
        if (param0 == 4) {
          return null;
        }
        this.field_Q = (dd) null;
        return null;
    }

    v(jb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, wi.a(17641));
        try {
          this.field_V = param1;
          this.field_S = param0;
          this.a(param2, param4, param3, param5, 80);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, qa param2, byte param3) {
        try {
          this.field_T = this.field_T + 1;
          super.a(param0, param1, param2, (byte) -112);
          if (param3 >= -85) {
            this.field_S = (jb) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "v.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        wd var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        dd var19;
        dd var20;
        Object var22;
        Object var26;
        Object var36;
        eg var40;
        String var5;
        int var11;
        int var12;
        dd var16;
        dd var21;
        dd var23;
        dd var24;
        dd var25;
        dd var27;
        dd var28;
        dd var29;
        dd var30;
        dd var37;
        dd var38;
        dd var39;
        eg var41;
        eg var42;
        eg var43;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var9Lifetime3;
        int var10Lifetime3;
        int var11Lifetime4;
        int var12Lifetime4;
        wd var6Lifetime1;
        wd var6Lifetime2;
        var18 = null;
        var22 = null;
        var26 = null;
        var36 = null;
        var13 = fleas.field_A ? 1 : 0;
        var6 = this.field_S.a(false);
        if (ea.field_b == var6) {
          var17 = bg.field_b;
          if (!var17.equals(this.field_i)) {
            this.field_i = var17;
            this.i(424);
            super.b(param0, param1, true, param3);
            var6 = this.field_S.a(false);
            var40 = (eg) ((Object) this.field_p);
            var9 = param1 + this.field_y;
            var10 = var40.a(param0, (qa) (this), (byte) -59) + (var40.a((qa) (this), (byte) -35).a(param2) >> 1);
            if (ea.field_b != var6 &&
              var6 != w.field_e) {
              if (var6 == ml.field_K) {
                var19 = t.field_h[2];
                var19.a(var9, var10 - (var19.field_t >> 1), 256);
                return;
              }
              if (hm.field_b != var6) {
                return;
              }
              var20 = t.field_h[1];
              var20.a(var9, -(var20.field_t >> 1) + var10, 256);
              return;
            }
            var21 = t.field_h[0];
            var11 = var21.field_x << 1;
            var12 = var21.field_r << 1;
            if (this.field_Q != null &&
              var11 <= this.field_Q.field_w &&
              this.field_Q.field_t >= var12) {
              r.a(this.field_Q, 45);
              gb.c();
            } else {
              this.field_Q = new dd(var11, var12);
              r.a(this.field_Q, 45);
            }
            var21.a(112, 144, var21.field_x << 4, var21.field_r << 4, -this.field_T << 10, 4096);
            ia.a(-66);
            this.field_Q.a(var9 - (var21.field_x >> 1), -var21.field_r + var10, 256);
            return;
          }
          super.b(param0, param1, true, param3);
          var6 = this.field_S.a(false);
          var41 = (eg) ((Object) this.field_p);
          var9Lifetime3 = param1 + this.field_y;
          var10Lifetime3 = var41.a(param0, (qa) (this), (byte) -59) + (var41.a((qa) (this), (byte) -35).a(param2) >> 1);
          if (ea.field_b != var6 &&
            var6 != w.field_e) {
            if (var6 == ml.field_K) {
              var23 = t.field_h[2];
              var23.a(var9Lifetime3, var10Lifetime3 - (var23.field_t >> 1), 256);
              return;
            }
            if (hm.field_b != var6) {
              return;
            }
            var24 = t.field_h[1];
            var24.a(var9Lifetime3, -(var24.field_t >> 1) + var10Lifetime3, 256);
            return;
          }
          var25 = t.field_h[0];
          var11Lifetime4 = var25.field_x << 1;
          var12Lifetime4 = var25.field_r << 1;
          if (this.field_Q == null) {
            this.field_Q = new dd(var11Lifetime4, var12Lifetime4);
            r.a(this.field_Q, 45);
          } else {
            if (var11Lifetime4 > this.field_Q.field_w) {
              this.field_Q = new dd(var11Lifetime4, var12Lifetime4);
              r.a(this.field_Q, 45);
            } else {
              if (this.field_Q.field_t >= var12Lifetime4) {
                r.a(this.field_Q, 45);
                gb.c();
              } else {
                this.field_Q = new dd(var11Lifetime4, var12Lifetime4);
                r.a(this.field_Q, 45);
              }
            }
          }
          var25.a(112, 144, var25.field_x << 4, var25.field_r << 4, -this.field_T << 10, 4096);
          ia.a(-66);
          this.field_Q.a(var9Lifetime3 - (var25.field_x >> 1), -var25.field_r + var10Lifetime3, 256);
          return;
        }
        if (var6 != w.field_e) {
          var5 = this.field_S.b(-19);
          if (var5 == null) {
            var5 = this.field_V;
          }
        } else {
          var5 = bg.field_b;
        }
        if (var5.equals(this.field_i)) {
          super.b(param0, param1, true, param3);
          var6Lifetime1 = this.field_S.a(false);
          var43 = (eg) ((Object) this.field_p);
          var9Lifetime1 = param1 + this.field_y;
          var10Lifetime1 = var43.a(param0, (qa) (this), (byte) -59) + (var43.a((qa) (this), (byte) -35).a(param2) >> 1);
          if (ea.field_b != var6Lifetime1 &&
            var6Lifetime1 != w.field_e) {
            if (var6Lifetime1 == ml.field_K) {
              var37 = t.field_h[2];
              var37.a(var9Lifetime1, var10Lifetime1 - (var37.field_t >> 1), 256);
              return;
            }
            if (hm.field_b != var6Lifetime1) {
              return;
            }
            var38 = t.field_h[1];
            var38.a(var9Lifetime1, -(var38.field_t >> 1) + var10Lifetime1, 256);
            return;
          }
          var39 = t.field_h[0];
          var11Lifetime1 = var39.field_x << 1;
          var12Lifetime1 = var39.field_r << 1;
          if (this.field_Q == null) {
            this.field_Q = new dd(var11Lifetime1, var12Lifetime1);
            r.a(this.field_Q, 45);
          } else {
            if (var11Lifetime1 > this.field_Q.field_w) {
              this.field_Q = new dd(var11Lifetime1, var12Lifetime1);
              r.a(this.field_Q, 45);
            } else {
              if (this.field_Q.field_t < var12Lifetime1) {
                this.field_Q = new dd(var11Lifetime1, var12Lifetime1);
                r.a(this.field_Q, 45);
              } else {
                r.a(this.field_Q, 45);
                gb.c();
              }
            }
          }
          var39.a(112, 144, var39.field_x << 4, var39.field_r << 4, -this.field_T << 10, 4096);
          ia.a(-66);
          this.field_Q.a(var9Lifetime1 - (var39.field_x >> 1), -var39.field_r + var10Lifetime1, 256);
          return;
        }
        this.field_i = var5;
        this.i(424);
        super.b(param0, param1, true, param3);
        var6Lifetime2 = this.field_S.a(false);
        var42 = (eg) ((Object) this.field_p);
        var9Lifetime2 = param1 + this.field_y;
        var10Lifetime2 = var42.a(param0, (qa) (this), (byte) -59) + (var42.a((qa) (this), (byte) -35).a(param2) >> 1);
        if (ea.field_b == var6Lifetime2) {
          var27 = t.field_h[0];
          var11Lifetime2 = var27.field_x << 1;
          var12Lifetime2 = var27.field_r << 1;
          if (this.field_Q != null &&
            var11Lifetime2 <= this.field_Q.field_w &&
            this.field_Q.field_t >= var12Lifetime2) {
            r.a(this.field_Q, 45);
            gb.c();
          } else {
            this.field_Q = new dd(var11Lifetime2, var12Lifetime2);
            r.a(this.field_Q, 45);
          }
          var27.a(112, 144, var27.field_x << 4, var27.field_r << 4, -this.field_T << 10, 4096);
          ia.a(-66);
          this.field_Q.a(var9Lifetime2 - (var27.field_x >> 1), -var27.field_r + var10Lifetime2, 256);
          return;
        }
        if (var6Lifetime2 != w.field_e) {
          if (var6Lifetime2 == ml.field_K) {
            var28 = t.field_h[2];
            var28.a(var9Lifetime2, var10Lifetime2 - (var28.field_t >> 1), 256);
            return;
          }
          if (hm.field_b != var6Lifetime2) {
            return;
          }
          var29 = t.field_h[1];
          var29.a(var9Lifetime2, -(var29.field_t >> 1) + var10Lifetime2, 256);
          return;
        }
        var30 = t.field_h[0];
        var16 = var30;
        var11Lifetime3 = var30.field_x << 1;
        var12Lifetime3 = var30.field_r << 1;
        if (this.field_Q == null) {
          this.field_Q = new dd(var11Lifetime3, var12Lifetime3);
          r.a(this.field_Q, 45);
        } else {
          if (var11Lifetime3 > this.field_Q.field_w) {
            this.field_Q = new dd(var11Lifetime3, var12Lifetime3);
            r.a(this.field_Q, 45);
          } else {
            if (this.field_Q.field_t >= var12Lifetime3) {
              r.a(this.field_Q, 45);
              gb.c();
            } else {
              this.field_Q = new dd(var11Lifetime3, var12Lifetime3);
              r.a(this.field_Q, 45);
            }
          }
        }
        var30.a(112, 144, var30.field_x << 4, var30.field_r << 4, -this.field_T << 10, 4096);
        ia.a(-66);
        this.field_Q.a(var9Lifetime2 - (var30.field_x >> 1), -var30.field_r + var10Lifetime2, 256);
        return;
    }

    final boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -26) {
            return false;
          }
          field_R = (String[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("v.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_U = (byte[][]) null;
        field_R = null;
        if (param0 != -8011) {
          field_U = (byte[][]) null;
        }
    }

    static {
        field_U = new byte[250][];
    }
}
