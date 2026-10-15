/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_f;
    static String field_a;
    static tj field_e;
    static int field_g;
    private kg field_d;
    private boolean field_h;
    private double field_b;
    private double field_i;
    private int field_c;

    final void b(byte param0) {
        if (this.field_h) {
          tb.field_d.a(this.field_d);
          this.field_h = false;
        }
        int var2 = -40 % ((param0 - 4) / 56);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        double stackIn_27_0 = 0.0;
        int stackIn_28_1 = 0;
        int var8;
        int var9;
        int var10;
        double var11;
        int var13_int;
        double var13;
        int var15;
        var15 = CrazyCrystals.field_B;
        if (param0 == 60) {
          param0 = 72;
        }
        if (param0 == 60) {
          param0 = 72;
        }
        var8 = param1 - param2;
        var9 = param4 - param6;
        var10 = (int)Math.sqrt((double)(var9 * var9 + var8 * var8));
        var11 = (double)(param3 * param3);
        if (var10 > 12) {
          var11 = 12.0 * var11 / (double)var10;
          if (var9 < var8 &&
            -var9 < var8) {
            var13_int = var8;
          } else if (var8 < var9 &&
            var8 < -var9) {
            var13_int = -var8;
          } else {
            if (var9 > 0) {
              var13_int = var9;
            } else {
              var13_int = -var9;
            }
          }
          if (var13_int >= 60) {
            if (param0 == 0) {
              if (var13_int > 72) {
                var13_int = 72;
              }
              var11 = (double)(76 - var13_int) * var11 / 16.0;
            } else {
              if (var13_int >= 72) {
                return;
              }
              var11 = var11 * (double)(72 - var13_int) / 12.0;
            }
          }
        }
        this.field_b = this.field_b + var11;
        if (param5 >= -123) {
          this.field_c = 33;
        }
        stackIn_27_0 = (double)var8;
        if (var10 >= 48) {
          stackIn_28_1 = var10;
        } else {
          stackIn_28_1 = 48;
        }
        var13 = stackIn_27_0 / (double)stackIn_28_1;
        this.field_i = this.field_i + var11 * (1.0 + var13) * 0.5;
    }

    final void a(byte param0) {
        double var2;
        int var4;
        int var5;
        int var6;
        int stackIn_5_0 = 0;
        var6 = CrazyCrystals.field_B;
        if (param0 >= -13) {
          return;
        }
        var2 = Math.sqrt(this.field_b) * 64.0;
        if ((double)(64 * this.field_c) <= var2) {
          stackIn_5_0 = 64 * this.field_c;
        } else {
          stackIn_5_0 = (int)var2;
        }
        var4 = stackIn_5_0;
        if (var4 <= 0) {
          if (this.field_h) {
            tb.field_d.a(this.field_d);
            this.field_h = false;
          }
        } else {
          var5 = (int)(0.5 + 16384.0 * this.field_i / this.field_b);
          if (var5 < 0) {
            var5 = 0;
          } else {
            if (var5 > 16384) {
              var5 = 16384;
            }
          }
          this.field_d.c(var4 * gi.field_m >> 6, var5);
          if (!this.field_h) {
            this.field_h = true;
            tb.field_d.b(this.field_d);
          }
        }
        this.field_c = 0;
        this.field_i = 0.0;
        this.field_b = 0.0;
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_9_0 = false;
        if (param1 < 18) {
          field_a = (String) null;
        }
        stackIn_9_0 = (param0 == 160) || (param0 == 32) || (param0 == 95) || (param0 == 45);
        return stackIn_9_0;
    }

    final static void a(db param0, db param1, int param2) {
        int var5_int = 0;
        int[] stackIn_29_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          ge.field_d = wl.a("menuback", param0, 10, "");
          ee.field_m = wl.a("menulogo", param0, 10, "");
          me.field_b = ee.field_m.field_n / 2 - ee.field_m.field_v;
          kf.field_c = ee.field_m.field_n / 2 - ee.field_m.field_v;
          var3_int = -30 + ee.field_m.field_o;
          var4 = ee.field_m.field_o;
          if (ul.field_g != 0) {
            if (o.field_h.equals("top")) {
              var3_int = 0;
              var4 = 30;
            } else {
              if (!o.field_h.equals("bottom")) {
                throw new IllegalStateException();
              }
            }
          }
          for (var5_int = var3_int; var5_int < var4; var5_int++) {
            if (ee.field_m.field_t <= var5_int &&
              ee.field_m.field_u + ee.field_m.field_t > var5_int) {
              var6 = ee.field_m.field_l * (-ee.field_m.field_t + var5_int);
              for (var7 = 0; kf.field_c > var7; var7++) {
                if (ee.field_m.field_w[var7 + var6] == 0) {
                  continue;
                }
                kf.field_c = var7;
                break;
              }
              for (var7 = -1 + ee.field_m.field_l; var7 > me.field_b; var7--) {
                if (0 != ee.field_m.field_w[var7 + var6]) {
                  me.field_b = var7;
                  break;
                }
              }
            }
          }
          kf.field_c = kf.field_c + ee.field_m.field_v;
          me.field_b = me.field_b + ee.field_m.field_v;
          var5 = new ng(param1.b(0, 0, 0));
          mi.field_A = new int[480];
          var6 = 0;
          var7 = 0;
          if (param2 >= -69) {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("am.E(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
        stackIn_29_0 = mi.field_A;
        try {
          while (stackIn_29_0.length > var7) {
            var6 = var6 + var5.f(0);
            mi.field_A[var7] = var6;
            var7++;
            stackIn_29_0 = mi.field_A;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("am.E(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(tj param0, int param1, db param2, int param3) {
        try {
          lc.field_a = param3 * sm.d((byte) -104) / 1000;
          nl.a(param2, 640);
          lk.a(param2, (byte) 65);
          de.a((byte) -67, param2);
          fh.a(true);
          on.a(-85);
          sn.field_c = param1 - lc.field_a;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "am.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        if (param0 <= 113) {
          return;
        }
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        double var6;
        int var6_int;
        int var7;
        int var8;
        int var9;
        fq var9_ref_fq;
        int var10;
        int var11;
        int var12;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        var12 = CrazyCrystals.field_B;
        if (param0 > this.field_c) {
          this.field_c = param0;
        }
        if (nj.field_k <= 0) {
          var6_int = 0;
          for (var7 = 0; var7 < 3; var7++) {
            if (oe.field_a[var7] != null) {
              var8 = 12 * oe.field_a[var7].field_A + oe.field_a[var7].field_o * oe.field_a[var7].field_m;
              var9 = oe.field_a[var7].field_t * 12 + oe.field_a[var7].field_s * oe.field_a[var7].field_m;
              this.a(param3, param1, var8, param0, param2, -128, var9);
              var6_int = 1;
            }
          }
          var7Lifetime1 = qh.field_o.size();
          for (var8Lifetime1 = 0; var7Lifetime1 > var8Lifetime1; var8Lifetime1++) {
            var9_ref_fq = (fq) (qh.field_o.elementAt(var8Lifetime1));
            var10 = 12 * var9_ref_fq.field_A + var9_ref_fq.field_o * var9_ref_fq.field_m;
            var11 = var9_ref_fq.field_m * var9_ref_fq.field_s + 12 * var9_ref_fq.field_t;
            this.a(param3, param1, var10, param0, param2, param4 ^ 17, var11);
            var6_int = 1;
          }
          if (var6_int == 0) {
            var8Lifetime2 = (int)(bq.field_i[0] / bq.field_i[2] * 6.0 - 5.5);
            var9Lifetime1 = (int)(6.0 * (bq.field_i[1] / bq.field_i[2]) - 5.5);
            this.a(param3, param1, var8Lifetime2, param0, param2, -125, var9Lifetime1);
          }
        } else {
          var6 = (double)(param0 * param0) * 0.03125;
          this.field_i = this.field_i + 0.08333333333333333 / (double)nj.field_k * ((double)(6 + param1) * var6);
          this.field_b = this.field_b + var6;
        }
        if (param4 != -111) {
          this.field_h = true;
        }
    }

    am(kg param0) {
        this.field_b = 0.0;
        this.field_h = false;
        this.field_i = 0.0;
        this.field_c = 0;
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Press M to have a look at the map. Which wall is this ball following? Think how to negotiate this section before you enter.";
        field_a = "Connection lost. <%0>";
    }
}
