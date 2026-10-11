/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends ff {
    static java.security.SecureRandom field_N;
    static String field_Q;
    private o field_R;
    static ok field_S;
    private int field_U;
    private String field_L;
    static o field_M;
    static String field_K;
    static String[] field_O;
    private dk field_T;
    static int field_P;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param3) {
          var4 += 4;
        }
        if (param1 != -3567) {
          field_O = (String[]) null;
        }
        if (param0) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return sk.field_y[var4];
    }

    final static kl a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != -1784753947) {
          field_M = (o) null;
        }
        return sc.a(param0, 12000, param3, false, param2, param4);
    }

    public static void a(byte param0) {
        if (param0 <= 59) {
          l.a(-35, -95, true, 66, true);
        }
        field_M = null;
        field_S = null;
        field_K = null;
        field_Q = null;
        field_O = null;
        field_N = null;
    }

    l(dk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, ml.a((byte) -87));
        try {
          this.field_L = param1;
          this.field_T = param0;
          this.a(125, param3, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = wizardrun.field_H;
        try {
          if (ed.field_c > param3) {
            param4 = param4 - (-param3 + ed.field_c);
            param3 = ed.field_c;
          }
          if (param3 + param4 > ed.field_l) {
            param4 = -param3 + ed.field_l;
          }
          if (ed.field_i > param2) {
            param0 = param0 - (ed.field_i - param2);
            param2 = ed.field_i;
          }
          if (param1 != -105) {
            l.a((byte) -126);
          }
          if (ed.field_b < param2 + param0) {
            param0 = -param2 + ed.field_b;
          }
          if (0 < param4 &&
            param0 > 0) {
            var6_int = param3 + ed.field_h * param2;
            var7 = -param4 + ed.field_h;
            for (param2 = -param0; 0 > param2; param2++) {
              for (param3 = -param4; param3 < 0; param3++) {
                var8 = ed.field_k[var6_int];
                if (((var8 & 65280) >> 8) > param5 &&
                  (255 & var8 >> 8) >= (16711680 & var8) >> 16) {
                  var9 = -60 + (510 & var8 >> 15);
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = (var10 >> 1) - (var10 >> 5) & 65280;
                  var11 = 31 & var8 >> 3;
                  ed.field_k[var6_int] = sd.a(var11, sd.a(var10, var9 << 16));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var6), "l.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String c(boolean param0) {
        if (!param0) {
          return null;
        }
        l.a(23, (byte) -128, -52, 32, 59, 33);
        return null;
    }

    final void a(int param0, int param1, int param2, ub param3) {
        try {
          this.field_U = this.field_U + 1;
          if (param0 != 10000536) {
            field_S = (ok) null;
          }
          super.a(param0 + 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "l.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        ok var6;
        qe var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        o var14;
        o var15;
        o var16;
        ok var6Lifetime1;
        var13 = wizardrun.field_H;
        var6 = this.field_T.a(true);
        if (var6 != nf.field_c &&
          var6 != field_S) {
          var5 = this.field_T.a(-2864);
          if (var5 == null) {
            var5 = this.field_L;
          }
        } else {
          var5 = ke.field_v;
        }
        if (!var5.equals(this.field_k)) {
          this.field_k = var5;
          this.e(param1 + 0);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime1 = this.field_T.a(true);
        var8 = (qe) ((Object) this.field_w);
        var9 = param0 + this.field_o;
        var10 = var8.a(true, param3, (ub) (this)) + (var8.a((ub) (this), (byte) 96).b(126) >> 1);
        if (var6Lifetime1 != nf.field_c &&
          field_S != var6Lifetime1) {
          if (var6Lifetime1 == hg.field_c) {
            var14 = te.field_k[2];
            var14.a(var9, var10 - (var14.field_p >> 1), 256);
          } else if (gf.field_V == var6Lifetime1) {
            var15 = te.field_k[1];
            var15.a(var9, -(var15.field_p >> 1) + var10, 256);
          }
        } else {
          var16 = te.field_k[0];
          var11 = var16.field_x << 1;
          var12 = var16.field_s << 1;
          if (this.field_R != null &&
            this.field_R.field_z >= var11 &&
            var12 <= this.field_R.field_p) {
            ud.a(this.field_R, false);
            ed.d();
          } else {
            this.field_R = new o(var11, var12);
            ud.a(this.field_R, false);
          }
          var16.b(112, 144, var16.field_x << 4, var16.field_s << 4, -this.field_U << 10, 4096);
          bb.b(4);
          this.field_R.a(-(var16.field_x >> 1) + var9, -var16.field_s + var10, 256);
        }
    }

    final boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("l.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_Q = "Tutorial";
        field_S = new ok();
        field_O = new String[]{"Four new worlds to battle though", "Meet fearsome enemies", "Travel to the icy mountains", "Save your master"};
        field_P = -1;
    }
}
