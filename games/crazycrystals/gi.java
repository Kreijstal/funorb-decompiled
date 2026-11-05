/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends pn implements Cloneable {
    static dl field_n;
    static int field_m;
    private int field_o;
    private int field_p;

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 26009) {
            stackIn_4_0 = pf.a(0, param1, param0, -1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 94;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gi.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          nj var5 = (nj) null;
          this.a(-70, (nj) null);
        }
        return (f) (this);
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            this.b(-112, 33, -8, true, -15, -44);
          }
          stackIn_3_0 = ng.a(e.field_a, param1, new gi(this.field_p, new kp(-1)), (byte) -83, qd.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gi.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          return -86;
        }
        return 12;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -21) {
            return true;
          }
          this.a(true, false);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("gi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        if (param1 == 24 &&
          param2 == 24) {
          fl.field_i[this.field_o >> 1].c(param4, -param2 + param5, f.field_g[this.field_p]);
        } else {
          fl.field_i[this.field_o >> 1].b(param4, -param2 + param5, param1 * 2, param2 * 3, f.field_g[this.field_p]);
        }
        var7 = 101 % ((74 - param0) / 41);
    }

    gi(int param0, f param1) {
        super(param1);
        this.field_o = 0;
        try {
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
          return;
        }
        this.field_p = param0;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
          if (param0 < 92) {
            this.field_p = 78;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "gi.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        byte[] var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_o = this.field_o + 1;
          if (param1 != 0) {
            var6 = (byte[]) null;
            gi.a(103, (byte[]) null, -64);
          }
          if (fl.field_i.length * 2 <= this.field_o) {
            this.field_o = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("gi.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          gi.b(false);
        }
        field_n = null;
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        int var11_int = 0;
        vh dupTemp$0 = null;
        int fieldTemp$1 = 0;
        f stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        vh var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        fq var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        var14 = CrazyCrystals.field_B;
        try {
          var15 = (fq) (param1);
          var9 = 0;
          for (var10 = 1; -1 + param6.length > var10; var10++) {
            for (var11_int = 1; var11_int < -1 + param6[0].length; var11_int++) {
              var9 = var9 + param6[var10][var11_int].a(-9352, var11_int, var10, var15, this.field_p);
            }
          }
          if (param4 >= -87) {
            field_n = (dl) null;
          }
          var10Lifetime1 = this.field_p;
          if (var9 <= 0) {
            so.field_g.a(128, 12 * (param5 + param2), (param0 + param3) * 12, 0, (byte) -111);
          } else {
            pm.field_b.a(128, 12 * (param2 + param5), (param3 + param0) * 12, 0, (byte) -111);
            var10Lifetime1 += 4;
          }
          if (ab.field_D == null) {
            var11 = q.field_a[var15.field_u];
            dupTemp$0 = q.field_a[var15.field_u];
            fieldTemp$1 = dupTemp$0.field_m;
            dupTemp$0.field_m = dupTemp$0.field_m + 1;
            var12 = fieldTemp$1;
            if (var12 >= var11.field_c.length) {
              var17 = new int[4 + var12];
              var16 = var17;
              var13 = var16;
              eg.a(var11.field_c, 0, var17, 0, var12);
              var11.field_c = var13;
            }
            var11.field_c[var12] = var10Lifetime1;
            if (var9 <= 0) {
              mb.field_g = mb.field_g + 300;
              fn.field_j = fn.field_j + 350;
              we.field_h = we.field_h + 20;
              b.field_a = b.field_a + 10;
              je.field_j = je.field_j + 10;
              fp.field_a = fp.field_a + 20;
              mb.field_g = mb.field_g + 10;
              fn.field_j = fn.field_j + 10;
            } else {
              fn.field_j = fn.field_j + 500;
              mb.field_g = mb.field_g + 400;
              fn.field_j = fn.field_j + 20;
              mb.field_g = mb.field_g + 20;
              fn.field_j = fn.field_j - wd.field_j;
              ob.field_l = ob.field_l + 1;
              ob.field_l = ob.field_l - 1;
              fn.field_j = fn.field_j + wd.field_j;
              we.field_h = we.field_h + 40;
              fp.field_a = fp.field_a + 40;
              b.field_a = b.field_a + 20;
              je.field_j = je.field_j + 20;
            }
          }
          this.field_l.a(1 << var15.field_u, true, tm.field_e);
          stackIn_20_0 = this.field_l.a(param0, param1, param2, param3, (byte) -93, param5, param6);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("gi.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_n = new dl(256, 25);
        field_m = 64;
    }
}
