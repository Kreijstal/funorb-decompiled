/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ts {
    private la field_c;
    static int field_b;
    private fsa[] field_d;
    private boolean field_a;
    private fsa[] field_e;
    private fsa[] field_f;
    static String field_g;

    final void c(boolean param0) {
        boolean stackIn_17_1 = false;
        int stackIn_20_1 = 0;
        dt stackIn_20_2 = null;
        boolean stackIn_21_3 = false;
        boolean stackIn_24_1 = false;
        int var3;
        dt var4;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          return;
        }
        var4 = this.a((byte) -115);
        if (null == this.field_e &&
          var4.f(4, 10915)) {
          this.a(1, 3, (byte) -127, 2);
        } else {
          if (null != this.field_e &&
            !var4.f(4, 10915)) {
            this.a(-83);
          }
        }
        if (this.field_f == null &&
          var4.f(5, 10915)) {
          stackIn_20_1 = -1;
          stackIn_20_2 = var4;
          stackIn_21_3 = !(param0);
          stackIn_24_1 = (stackIn_20_1 == ~((dt) (Object) stackIn_20_2).b(stackIn_21_3, 5));
          this.a(stackIn_24_1, (byte) 25);
        } else {
          if (this.field_f != null &&
            !var4.f(5, 10915)) {
            stackIn_17_1 = !(param0);
            this.b(stackIn_17_1);
          }
        }
        if (null == this.field_d &&
          var4.f(6, 10915)) {
          this.a((byte) 82, 5);
        } else {
          if (null != this.field_d &&
            !var4.f(6, 10915)) {
            this.a(false);
          }
        }
        if (!this.field_a &&
          var4.f(7, 10915)) {
          this.c((byte) 96);
        } else {
          if (this.field_a &&
            !var4.f(7, 10915)) {
            this.c((byte) 54);
          }
        }
    }

    final void b(byte param0) {
        int var2 = 49 / ((46 - param0) / 38);
        this.field_e = null;
        this.field_f = null;
        this.field_a = false;
        this.field_d = null;
    }

    private final void a(boolean param0) {
        int var3 = 0;
        fsa[] var2;
        fsa var4;
        int var5;
        fsa[] var6;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_d) {
          return;
        }
        if (param0) {
          return;
        }
        var6 = this.field_d;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            this.field_c.a(var4, 2);
          }
        }
        this.field_d = null;
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, da param5, int param6) {
        try {
          if (param1 >= -11) {
            field_b = -58;
          }
          param5.a(param2, false, param3, param4, fm.a(false, param6), fm.a(false, param0));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ts.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, String param1, boolean param2) {
        if (param0 != -63) {
          return;
        }
        try {
          ub.field_c = nla.field_a;
          dd.field_a = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ts.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final dt a(byte param0) {
        if (param0 != -115) {
          return (dt) null;
        }
        return this.field_c.a(-1553494544);
    }

    private final void a(boolean param0, byte param1) {
        if (this.field_f != null) {
          this.b(false);
        }
        int var3 = this.field_c.m((byte) -86) >> 16;
        int var4 = this.field_c.s(param1 ^ -107) >> 16;
        this.field_f = new fsa[1];
        this.field_f[0] = new fsa(this.field_c, var3 / 2, var4 / 2, var3 + 32, var4 + 32, 0, true);
        ana var5 = new ana(this.field_c, true);
        if (param1 != 25) {
          this.c(false);
        }
        this.field_f[0].a((byte) 83, (nv) (var5));
        this.field_f[0].c(437453352, false);
        this.field_c.a(this.field_f[0], (byte) 32);
        if (param0) {
          var5.e(false);
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        la stackIn_14_0;
        Object stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        int stackIn_15_5 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_3;
        la stackIn_34_0;
        Object stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        int stackIn_34_4;
        int stackIn_34_5;
        int stackIn_35_6 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        th var14;
        int var15;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var15 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_e) {
          this.a(-93);
        }
        var5 = this.field_c.m((byte) -86);
        var6 = this.field_c.s(param2 ^ -29);
        if (param2 != -127) {
          this.field_d = (fsa[]) null;
        }
        if (param3 != 0 &&
          param3 != 2) {
          var10 = 32;
          this.field_e = new fsa[(var6 >> 16) / 32];
          var9 = var5 >> 16;
          var7 = var9 / 2;
          var8 = 16;
          var11 = 0;
          var12 = 0;
          while (var12 == 0) {
            for (var13 = 0; var13 < this.field_e.length; var13++) {
              stackIn_34_0 = this.field_c;
              stackIn_34_1 = null;
              stackIn_34_2 = 2097152;
              stackIn_34_3 = 2;
              stackIn_34_4 = 4;
              stackIn_34_5 = var13 * 32 + 16 << 16;
              if (param3 != 3) {
                stackIn_35_6 = 16 + var11 * 32;
              } else {
                stackIn_35_6 = -(32 * var11) + (var9 - 16);
              }
              if (((la) (Object) stackIn_34_0).a((ffa) (stackIn_34_1), stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_35_6 << 16, false, (gma) null, 2097152)) {
                continue;
              }
              var12 = 1;
              break;
            }
            if (var12 != 0) {
              continue;
            }
            var11++;
            if (var11 >= 0 &&
              var11 <= var9 / 32) {
              continue;
            }
            var12 = 1;
            var11 = 0;
          }
          var9 = var9 - var11 * 32;
          stackIn_47_0 = var7;
          if (param3 != 3) {
            stackIn_48_1 = 1;
          } else {
            stackIn_48_1 = -1;
          }
          var7 = stackIn_47_0 + stackIn_48_1 * 16 * var11;
        } else {
          var9 = 32;
          var10 = var6 >> 16;
          var7 = 16;
          this.field_e = new fsa[(var5 >> 16) / 32];
          var8 = var10 / 2;
          var11 = 0;
          var12 = 0;
          while (var12 == 0) {
            for (var13 = 0; var13 < this.field_e.length; var13++) {
              stackIn_14_0 = this.field_c;
              stackIn_14_1 = null;
              stackIn_14_2 = 2097152;
              stackIn_14_3 = param2 + 129;
              stackIn_14_4 = 4;
              if (param3 == 0) {
                stackIn_15_5 = -(32 * var11) - 16 + var10;
              } else {
                stackIn_15_5 = var11 * 32 + 16;
              }
              if (((la) (Object) stackIn_14_0).a((ffa) (stackIn_14_1), stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_15_5 << 16, 16 + 32 * var13 << 16, false, (gma) null, 2097152)) {
                continue;
              }
              var12 = 1;
              break;
            }
            if (var12 != 0) {
              continue;
            }
            var11++;
            if (var11 >= 0 &&
              var10 / 32 >= var11) {
              continue;
            }
            var12 = 1;
            var11 = 0;
          }
          var10 = var10 - 32 * var11;
          stackIn_26_0 = var8;
          stackIn_26_1 = var11;
          stackIn_26_2 = 16;
          if (param3 != 0) {
            stackIn_27_3 = 1;
          } else {
            stackIn_27_3 = -1;
          }
          var8 = stackIn_26_0 + stackIn_26_1 * (stackIn_26_2 * stackIn_27_3);
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < this.field_e.length; var11Lifetime1++) {
          if (param3 != 0 &&
            param3 != 2) {
            var12Lifetime1 = var7;
            var13Lifetime1 = var8 + 32 * var11Lifetime1;
          } else {
            var13Lifetime1 = var8;
            var12Lifetime1 = var11Lifetime1 * 32 + var7;
          }
          this.field_e[var11Lifetime1] = new fsa(this.field_c, var12Lifetime1, var13Lifetime1, var9, var10, 0, true);
          var14 = new th(this.field_c, true);
          var14.b(param2 ^ 5, param3);
          var14.a(param0, param1, 19072);
          this.field_e[var11Lifetime1].a((byte) 83, (nv) (var14));
          this.field_c.a(this.field_e[var11Lifetime1], (byte) 32);
        }
    }

    private final void c(byte param0) {
        if (param0 < 9) {
          this.a(-57, -122, (byte) 28, -22);
        }
        this.field_a = !this.field_a ? true : false;
        this.field_c.b(7, true);
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != 32) {
          ts.b(67);
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        fsa var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (this.field_e == null) {
          return;
        }
        if (param0 > -72) {
          this.c(true);
        }
        fsa[] var6 = this.field_e;
        fsa[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          this.field_c.a(var4, 2);
        }
        this.field_e = null;
    }

    private final void a(byte param0, int param1) {
        int var10 = 0;
        int stackIn_17_0 = 0;
        int var3;
        int var4;
        csa var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_d) {
          this.a(false);
        }
        var3 = this.field_c.m((byte) -86);
        var4 = this.field_c.s(125);
        this.field_d = new fsa[param1];
        var5 = vha.field_c.a(this.field_c, (byte) 118);
        var6 = var5.c(-41);
        var7 = var5.a((byte) 55);
        var8 = 0;
        if (param0 != 82) {
          return;
        }
        var9 = 50;
        for (var10 = 0; param1 > var10; var10++) {
          var11 = 1;
          while (var11 != 0) {
            if (var9 > var8) {
              var8++;
              var12 = var6 / 2 + this.field_c.q(param0 - 41).a(var3 - var6, 0);
              var13 = this.field_c.q(param0 - 195).a(var4 - var7, 0) + var7 / 2;
              var14 = -var12 + this.field_c.u(-53).d(3) >> 16;
              var15 = -var13 + this.field_c.u(-79).e(param0 ^ 9698) >> 16;
              if (4096 > var15 * var15 + var14 * var14) {
                continue;
              }
              stackIn_17_0 = (!this.field_c.a((ffa) null, var7, 2, 1, var13, var12, false, (gma) null, var6)) ? 0 : 1;
              var11 = stackIn_17_0;
              if (var11 != 0) {
                continue;
              }
              var5.a(1434528720, var13, var12);
              var5.a(true, true, this.field_c, 0, 0, -1, (fsa) null);
              this.field_d[var10] = (fsa) (var5.u(kha.b((int) param0, -24)));
              continue;
            }
            break;
          }
        }
        return;
    }

    private final void b(boolean param0) {
        dt discarded$0 = null;
        int var3 = 0;
        fsa var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_f) {
          return;
        }
        fsa[] var6 = this.field_f;
        fsa[] var2 = var6;
        if (param0) {
          discarded$0 = this.a((byte) 106);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          this.field_c.a(var4, 2);
        }
        this.field_f = null;
    }

    final static void a(byte param0, byte[] param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        String var24 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 < param3 &&
            !cla.a(9181, param3)) {
            throw new IllegalArgumentException("");
          }
          if (param4 > 0 &&
            !cla.a(9181, param4)) {
            throw new IllegalArgumentException("");
          }
          var7_int = jj.a(param5, (byte) -104);
          var8 = 0;
          if (param0 <= 51) {
            var24 = (String) null;
            ts.a((byte) -93, (String) null, false);
          }
          stackIn_12_0 = (param4 > param3) ? param3 : param4;
          var9 = stackIn_12_0;
          var10 = param3 >> 1;
          var11 = param4 >> 1;
          var12 = param1;
          var13 = new byte[var7_int * var11 * var10];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(param2, var8, param6, param3, param4, 0, param5, 5121, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = param3 * var7_int;
            for (var17 = 0; var17 < var7_int; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var16 + var19;
              for (var21 = 0; var21 < var11; var21++) {
                for (var22 = 0; var22 < var10; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var20];
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var20 = var20 + var7_int;
                  var13[var18] = (byte)(var15 >> 2);
                  var18 = var18 + var7_int;
                }
                var20 = var20 + var16;
                var19 = var19 + var16;
              }
            }
            var14 = var13;
            var13 = var12;
            var12 = var14;
            param4 = var11;
            param3 = var10;
            var8++;
            var9 = var9 >> 1;
            var11 = var11 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("ts.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ts(la param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ts.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 3;
    }
}
