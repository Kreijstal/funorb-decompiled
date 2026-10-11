/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw extends kna {
    final boolean z(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("gw.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        mfa var5 = null;
        int var7_int = 0;
        int var8 = 0;
        fsa var9 = null;
        fsa stackIn_15_0 = null;
        fsa stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        ki var7 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var9 = new fsa(param2, param0);
          var9.b((byte) -11, this.field_k, this.field_l);
          var9.a((byte) -3, 0);
          var9.b((byte) 17, true);
          var5 = rm.field_a;
          var7_int = this.r(12);
          switch (var7_int) {
            case 39:
              var6 = 0;
              break;
            case 40:
              var6 = 2;
              break;
            case 41:
              var6 = 3;
              break;
            case 38:
            default:
              var6 = 1;
              break;
          }
          if (param1 != 3) {
            stackIn_15_0 = (fsa) null;
            return stackIn_15_0;
          }
          var7 = (ki) (var5.a(14, 82));
          var7.a(true, var6);
          var9.a((gr) null, (byte) 124, var7);
          stackIn_17_0 = var9;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("gw.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          gw.A(-113);
          return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, float[] param4, int param5, int param6) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (param5 > 0 &&
            !cla.a(9181, param5)) {
            throw new IllegalArgumentException("");
          }
          if (param6 > 0 &&
            !cla.a(9181, param6)) {
            throw new IllegalArgumentException("");
          }
          var7_int = jj.a(param0, (byte) -119);
          var8 = 0;
          stackIn_11_0 = (param6 > param5) ? param5 : param6;
          var9 = stackIn_11_0;
          if (param1 <= 81) {
            return;
          }
          var10 = param5 >> 1;
          var11 = param6 >> 1;
          var12 = param4;
          var13 = new float[var11 * var10 * var7_int];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(param2, var8, param3, param5, param6, 0, param0, 5126, var12, 0);
            if (1 >= var9) {
              return;
            }
            var16 = param5 * var7_int;
            for (var17 = 0; var17 < var7_int; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var19 + var16;
              for (var21 = 0; var21 < var11; var21++) {
                for (var22 = 0; var10 > var22; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var15 = var15 + var12[var20];
                  var19 = var19 + var7_int;
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var13[var18] = var15 * 0.25f;
                  var20 = var20 + var7_int;
                  var18 = var18 + var7_int;
                }
                var19 = var19 + var16;
                var20 = var20 + var16;
              }
            }
            var14 = var13;
            var13 = var12;
            param5 = var10;
            var12 = var14;
            param6 = var11;
            var9 = var9 >> 1;
            var8++;
            var11 = var11 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("gw.UB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void q(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        super.q(param0);
        var4 = this.r(12);
        if (38 != var4 &&
          var4 != 39) {
          if (40 != var4 &&
            var4 != 41) {
          }
          var2 = 1;
          var3 = 1;
        } else {
          var3 = 2;
          var2 = 2;
        }
        this.b(param0 + 243, var2 * 2097152, 2097152 * var3);
    }

    final int t(int param0) {
        if (param0 != 8) {
          return -83;
        }
        return 7;
    }

    final static int A(int param0) {
        if (param0 != -1) {
          gw.A(33);
        }
        if (lca.a(false) &&
          wu.field_a.a((byte) 70) != null) {
          return wu.field_a.a((byte) 101).field_n;
        }
        return -1;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          return true;
        }
        return false;
    }

    final static void b(int param0, int param1) {
        vg var2 = null;
        int var3 = 0;
        int var4 = 0;
        sda var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = (sda) (qd.field_a.f(-80));
          while (var5 != null) {
            oia.a(param1, var5, 127);
            var5 = (sda) (qd.field_a.e(111));
          }
          var3 = 22 / ((param0 + 35) / 63);
          var2 = wma.field_n.f(-80);
          while (var2 != null) {
            dr.a(param1, -75);
            var2 = wma.field_n.e(116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "gw.TB(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          return false;
        }
        return true;
    }

    gw(la param0, int param1) {
        super(param0, param1);
    }

    gw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
    }
}
