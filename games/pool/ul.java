/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends tm {
    static cg field_m;
    static String field_l;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -5) {
          return;
        }
        field_l = null;
    }

    final static void i(int param0) {
        if (param0 != 3) {
          return;
        }
        ea.field_z = false;
        hr.field_y = 0 == kn.field_e.g(-83) ? true : false;
    }

    final int a(int param0, boolean param1) {
        if (0 == param0) {
          return 16777215;
        }
        if (param0 == 8) {
          return 3355443;
        }
        if (!param1) {
          this.a((byte) -72, -37);
        }
        return 7824981;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        char[] var5 = null;
        char[] var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (td.a(param0, (byte) 123)) {
            return true;
          }
          var5 = pd.field_d;
          var2 = var5;
          var3 = 0;
          while (var3 < var5.length) {
            var4 = var5[var3];
            if (param0 != var4) {
              var3++;
              continue;
            }
            return true;
          }
          var6 = g.field_o;
          var2Lifetime1 = var6;
          var7 = 0;
          var3Lifetime1 = var7;
          while (var7 < var6.length) {
            var4Lifetime1 = var6[var7];
            if (param0 == var4Lifetime1) {
              return true;
            }
            var7++;
          }
          if (param1 > 123) {
            return false;
          }
          ul.a('￉', (byte) 82);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "ul.F(" + param0 + ',' + param1 + ')');
        }
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
          return (String) null;
        }
        return ae.field_b;
    }

    final void a(int param0, byte param1, pq[] param2) {
        int var4_int = 0;
        int var5 = 0;
        eg var6 = null;
        eg stackIn_7_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != -37) {
            ul.a((byte) 26);
          }
          for (var4_int = 0; var4_int < 14; var4_int++) {
            var5 = 1 - (-var4_int - var4_int / 7);
            if (param0 == var5) {
              stackIn_7_0 = sf.field_E;
            } else {
              stackIn_7_0 = jp.field_P;
            }
            var6 = stackIn_7_0;
            if (this.field_a[var5] != var6) {
              this.field_a[var5] = var6;
              this.a(false, param2[var5].field_G, var5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ul.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(byte param0, String param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        eo var7 = null;
        eo var8 = null;
        oq var9 = null;
        CharSequence var10 = null;
        try {
          var10 = (CharSequence) ((Object) param1);
          if (!gj.a(-25908, var10)) {
            stackIn_3_0 = p.field_g;
            return stackIn_3_0;
          }
          if (2 != th.field_a) {
            stackIn_6_0 = qe.field_K;
            return stackIn_6_0;
          }
          var8 = gf.a(-83, param1);
          if (var8 == null) {
            stackIn_10_0 = nr.a(new String[]{param1}, -1, aa.field_f);
            return stackIn_10_0;
          }
          cf.field_k.a(var8, 0);
          while (true) {
            var7 = (eo) (cf.field_k.f((byte) -5));
            if (var7 != null) {
              var7.field_Mb = var7.field_Mb - 1;
              continue;
            }
            break;
          }
          var8.a((byte) -117);
          var8.a(false);
          nr.field_S = nr.field_S - 1;
          var9 = ej.field_j;
          var9.b(false, param2);
          var9.field_v = var9.field_v + 1;
          var6 = -10 % ((param0 - 20) / 53);
          var5 = var9.field_v;
          var9.a(1, false);
          var9.a(-9946, param1);
          var9.b(var9.field_v - var5, true);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ul.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 != 2) {
          return true;
        }
        return false;
    }

    final void a(int param0, di param1) {
        try {
          if (param0 != 198123656) {
            field_l = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ul.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(di param0, byte param1) {
        if (param1 != 117) {
          pq[] var4 = (pq[]) null;
          this.a(-110, (byte) 38, (pq[]) null);
        }
        if (this.field_a != null) {
          return;
        }
        try {
          jp.field_P = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween");
          sf.field_E = eg.a(param0, "", "balls/TIKI/tiki_ball_halloween_lit");
          jp.field_P.a(8, 8, 8, 8);
          sf.field_E.a(8, 8, 8, 8);
          this.field_a = new eg[16];
          this.field_a[0] = al.field_B[2].field_a[0];
          this.field_a[15] = jp.field_P;
          this.field_a[14] = jp.field_P;
          this.field_a[13] = jp.field_P;
          this.field_a[12] = jp.field_P;
          this.field_a[11] = jp.field_P;
          this.field_a[10] = jp.field_P;
          this.field_a[9] = jp.field_P;
          this.field_a[7] = jp.field_P;
          this.field_a[6] = jp.field_P;
          this.field_a[5] = jp.field_P;
          this.field_a[4] = jp.field_P;
          this.field_a[3] = jp.field_P;
          this.field_a[2] = jp.field_P;
          this.field_a[1] = jp.field_P;
          this.field_a[8] = al.field_B[2].field_a[8];
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ul.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ul() {
        this.field_g = false;
    }

    static {
        field_l = "FULL ACCESS";
    }
}
