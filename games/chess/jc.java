/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    o field_a;
    static String field_e;
    static km[] field_d;
    static String field_b;
    static String field_c;
    static boolean[][] field_g;
    static int field_f;
    private o field_h;

    final o g(int param0) {
        o var2 = this.field_a.field_h;
        if (param0 != -18110) {
          o var3 = (o) null;
          this.b((o) null, (byte) -57);
        }
        if (var2 == this.field_a) {
          this.field_h = null;
          return null;
        }
        this.field_h = var2.field_h;
        return var2;
    }

    final o a(boolean param0) {
        if (!param0) {
          jc.d(73);
        }
        o var2 = this.field_h;
        if (this.field_a == var2) {
          this.field_h = null;
          return null;
        }
        this.field_h = var2.field_c;
        return var2;
    }

    final static void a(int param0) {
        String var3 = null;
        if (null != i.field_c) {
          var3 = i.field_c;
          String var1 = var3;
          nj.a((byte) -101, oc.a(vh.field_a, new String[]{var3}, (byte) -121));
          i.field_c = null;
        }
        if (param0 != -26285) {
          String var2 = (String) null;
          jc.a(-114, (String) null, (byte) -108);
        }
    }

    final o f(int param0) {
        o var2 = this.field_a.field_h;
        if (param0 != 1184188328) {
          this.field_h = (o) null;
        }
        if (this.field_a == var2) {
          return null;
        }
        var2.c(-2193);
        return var2;
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        km[] var10;
        km[] var11_ref_km__;
        int var11;
        int var12;
        km var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = Chess.field_G;
        var9 = param6 - (-param1 - param4);
        var10 = new km[]{new km(var9, var9), new km(param0, var9), new km(var9, var9), new km(var9, param0), new km(64, 64), new km(var9, param0), new km(var9, var9), new km(param0, var9), new km(var9, var9)};
        var11_ref_km__ = var10;
        for (var12 = param8; var11_ref_km__.length > var12; var12++) {
          var13 = var11_ref_km__[var12];
          for (var14 = 0; var14 < var13.field_x.length; var14++) {
            var13.field_x[var14] = param3;
          }
        }
        for (var11 = 0; var11 < param6; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_x[var9 * (var9 - var11 - 1) + var12Lifetime1] = param2;
            var10[8].field_x[var12Lifetime1 + var9 * (-1 + (var9 - var11))] = param2;
            var10[2].field_x[var9 * var12Lifetime1 - (var11 + (1 - var9))] = param2;
            var10[8].field_x[-var11 + (-1 + var9 + var9 * var12Lifetime1)] = param2;
          }
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < param6; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var9 > var12Lifetime2; var12Lifetime2++) {
            var10[0].field_x[var12Lifetime2 + var9 * var11Lifetime1] = param5;
            var10[0].field_x[var11Lifetime1 + var9 * var12Lifetime2] = param5;
            if (-var11Lifetime1 + var9 > var12Lifetime2) {
              var10[2].field_x[var12Lifetime2 + var11Lifetime1 * var9] = param5;
              var10[6].field_x[var12Lifetime2 * var9 + var11Lifetime1] = param5;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param0; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param6; var12Lifetime3++) {
            var10[7].field_x[var11Lifetime2 + (-var12Lifetime3 + (var9 - 1)) * param0] = param2;
            var10[5].field_x[var11Lifetime2 * var9 + var9 - 1 - var12Lifetime3] = param2;
            var10[1].field_x[var11Lifetime2 + var12Lifetime3 * param0] = param5;
            var10[3].field_x[var12Lifetime3 + var9 * var11Lifetime2] = param5;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param0 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; param4 > var12Lifetime4; var12Lifetime4++) {
            var10[1].field_x[(-1 + (-var12Lifetime4 + var9)) * param0 + var11Lifetime3] = param7;
            var10[3].field_x[var11Lifetime3 * var9 - (1 + (-var9 + var12Lifetime4))] = param7;
            var10[7].field_x[var11Lifetime3 + var12Lifetime4 * param0] = param7;
            var10[5].field_x[var12Lifetime4 + var9 * var11Lifetime3] = param7;
          }
        }
        return var10;
    }

    final boolean h(int param0) {
        int var2 = -86 / ((65 - param0) / 48);
        return this.field_a.field_h == this.field_a ? true : false;
    }

    final static void a(int param0, String param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -95 % ((param2 - 19) / 49);
          cf.field_Nb = false;
          bc.field_d = false;
          if (null != ua.field_d) {
            if (!ua.field_d.field_P) {
              return;
            }
            var4 = 1;
            if (param0 == 8) {
              param0 = 2;
              if (dk.field_g) {
                param1 = td.field_r;
              } else {
                param1 = s.field_R;
              }
              um.field_b.a(pi.field_a, 20);
            }
            if (param0 == 10) {
              var4 = 0;
              oj.a(124);
            }
            if (var4 != 0) {
              if (bc.field_d) {
                param1 = oc.a(aj.field_b, new String[]{param1}, (byte) -92);
              }
              if (ag.field_e) {
                param1 = rd.field_a;
              }
              ua.field_d.a(param0, param1, (byte) 33);
            }
            if (param0 != 256) {
              if (param0 == 10) {
                return;
              }
              if (!dk.field_g) {
                um.field_b.g((byte) -14);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("jc.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != -31) {
          return;
        }
        field_c = null;
        field_e = null;
        field_g = (boolean[][]) null;
        field_d = null;
        field_b = null;
    }

    final o b(o param0, byte param1) {
        o var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        o stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_a.field_h;
          }
          if (var3 == this.field_a) {
            this.field_h = null;
            stackIn_6_0 = null;
            return (o) (stackIn_6_0);
          }
          var4 = 23 / ((param1 + 78) / 35);
          this.field_h = var3.field_h;
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("jc.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Chess.field_G;
        if (sl.field_a < 0) {
          return;
        }
        if (param1 != -117) {
          field_c = (String) null;
        }
        var3 = -135 + param2;
        var4 = -35 + param0;
        var5 = 256;
        if (sl.field_a < 75) {
          var5 = (sl.field_a << 8) / 75;
        }
        if (sl.field_a > 200) {
          var5 = (-sl.field_a + 250 << 8) / 50;
        }
        tl.a((byte) -67, gf.field_f);
        nh.a();
        wb.b();
        di.k(9);
        if (var5 < 256) {
          wb.b(0, 0, wb.field_h, wb.field_c, 0, -var5 + 256);
        }
        fd.a(28773);
        if (sl.field_a >= 150) {
          v.field_i.b(15 + var3, var4 + 10, var5);
        } else {
          gf.field_f.c(var3, var4);
        }
        var6 = sl.field_a - 125;
        if (var6 > 0 &&
          50 > var6) {
          if (var6 >= 20) {
            if (var6 >= 30) {
              var7 = (50 - var6) * 256 / 20;
              tg.field_u.d(var3, var4, var7);
            } else {
              tg.field_u.d(var3, var4, 256);
            }
          } else {
            var7 = 256 * var6 / 20;
            tg.field_u.d(var3, var4, var7);
          }
        }
        var6Lifetime1 = -140 + sl.field_a;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          re.field_u.b(var3 + 15, var4 + 10, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    final void a(o param0, int param1) {
        try {
          if (param1 < 68) {
            field_g = (boolean[][]) null;
          }
          if (param0.field_c != null) {
            param0.c(-2193);
          }
          param0.field_h = this.field_a.field_h;
          param0.field_c = this.field_a;
          param0.field_c.field_h = param0;
          param0.field_h.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "jc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final o a(byte param0) {
        o var2 = this.field_h;
        if (this.field_a == var2) {
          this.field_h = null;
          return null;
        }
        if (param0 >= -90) {
          jc.d(9);
        }
        this.field_h = var2.field_h;
        return var2;
    }

    final o c(int param0) {
        o var2 = this.field_a.field_c;
        if (var2 == this.field_a) {
          return null;
        }
        var2.c(-2193);
        if (param0 < 42) {
          return (o) null;
        }
        return var2;
    }

    final void a(o param0, byte param1) {
        try {
          if (param0.field_c != null) {
            param0.c(-2193);
          }
          param0.field_h = this.field_a;
          int var3_int = 69 % ((param1 - 28) / 56);
          param0.field_c = this.field_a.field_c;
          param0.field_c.field_h = param0;
          param0.field_h.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "jc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final o b(int param0) {
        o var2 = this.field_a.field_c;
        if (this.field_a == var2) {
          this.field_h = null;
          return null;
        }
        if (param0 != 28937) {
          return (o) null;
        }
        this.field_h = var2.field_c;
        return var2;
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != kb.field_O) {
            kb.field_O.field_Y.a(param1, -1);
          }
          if (param0 < 88) {
            field_b = (String) null;
          }
          if (hn.field_u != null) {
            hn.field_u.field_Q.a(param1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("jc.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void e(int param0) {
        o var2;
        int var3;
        var3 = Chess.field_G;
        while (true) {
          var2 = this.field_a.field_h;
          if (var2 != this.field_a) {
            var2.c(param0 + 28830);
            continue;
          }
          break;
        }
        if (param0 != -31023) {
          return;
        }
        this.field_h = null;
        return;
    }

    public jc() {
        this.field_a = new o();
        this.field_a.field_h = this.field_a;
        this.field_a.field_c = this.field_a;
    }

    static {
        field_e = "Rating";
        field_c = "Set up new unrated game";
        field_b = "<%0> has not yet unlocked this option for use.";
    }
}
