/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class et extends cg {
    vna field_l;
    private l field_k;
    en field_m;
    static long field_j;

    final cg c() {
        rta var1_ref = null;
        do {
          var1_ref = (rta) (this.field_l.e(112));
          if (var1_ref == null) {
            return null;
          }
        } while (var1_ref.field_x == null);
        return (cg) ((Object) var1_ref.field_x);
    }

    final void a(int param0) {
        int var2;
        rta var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_m.a(param0);
        var3 = (rta) (this.field_l.f(-80));
        while (var3 != null) {
          if (!this.field_k.c(15, var3)) {
            var2 = param0;
            do {
              if (var3.field_B >= var2) {
                this.a(943, var2, var3);
                var3.field_B = var3.field_B - var2;
                break;
              }
              this.a(943, var3.field_B, var3);
              var2 = var2 - var3.field_B;
            } while (!this.field_k.a(var3, (int[]) null, 0, (byte) 6, var2));
          }
          var3 = (rta) (this.field_l.e(125));
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 4 % ((param2 - 51) / 37);
        if (param1 < param0) {
          return param1;
        }
        return param0;
    }

    final static void a(boolean param0) {
        oga.a(!param0 ? true : false);
        jf.field_r = param0 ? true : false;
        gj.field_r = true;
        ej.field_a.e(true);
        vn.a(86, mj.field_M, false);
    }

    final static void a(byte param0, String param1, java.awt.Color param2, int param3, boolean param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = nma.field_l.getGraphics();
            if (laa.field_y == null) {
              laa.field_y = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param4) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, mma.field_a, qf.field_i);
            }
            if (param2 == null) {
              param2 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (np.field_x == null) {
                np.field_x = nma.field_l.createImage(304, 34);
              }
              var10 = np.field_x.getGraphics();
              var10.setColor(param2);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, param3 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param3 * 3 + 2, 2, -(param3 * 3) + 300, 30);
              var10.setFont(laa.field_y);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param1, (-(6 * param1.length()) + 304) / 2, 22);
              var9.drawImage(np.field_x, -152 + mma.field_a / 2, qf.field_i / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + mma.field_a / 2;
              var8 = -18 + qf.field_i / 2;
              var9.setColor(param2);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param3 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(var7 + (2 + param3 * 3), var8 + 2, 300 - 3 * param3, 30);
              var9.setFont(laa.field_y);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param1, (304 - param1.length() * 6) / 2 + var7, var8 + 22);
            }
            if (hma.field_e != null) {
              var9.setFont(laa.field_y);
              var9.setColor(java.awt.Color.white);
              var9.drawString(hma.field_e, mma.field_a / 2 - 6 * hma.field_e.length() / 2, qf.field_i / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            nma.field_l.repaint();
          }
          if (param0 >= 0) {
            return;
          }
          et.b(-92, 42, -49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("et.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, int param1, rta param2) {
        l stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        rta stackIn_8_2 = null;
        boolean stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((4 & this.field_k.field_M[param2.field_k]) != 0 &&
            0 > param2.field_t) {
            var4_int = this.field_k.field_u[param2.field_k] / kta.field_d;
            var5 = (1048575 + (var4_int - param2.field_r)) / var4_int;
            param2.field_r = 1048575 & var4_int * param1 + param2.field_r;
            if (var5 <= param1) {
              if (this.field_k.field_q[param2.field_k] != 0) {
                param2.field_x = qia.a(param2.field_n, param2.field_x.j(), 0, param2.field_x.f());
                stackIn_8_0 = this.field_k;
                stackIn_8_1 = -111;
                stackIn_8_2 = (rta) (param2);
                stackIn_9_3 = !(0 <= param2.field_y.field_g[param2.field_m]);
                ((l) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, stackIn_9_3);
              } else {
                param2.field_x = qia.a(param2.field_n, param2.field_x.j(), param2.field_x.l(), param2.field_x.f());
              }
              if (param2.field_y.field_g[param2.field_m] < 0) {
                param2.field_x.b(-1);
              }
              param1 = param2.field_r / var4_int;
            }
          }
          if (param0 != 943) {
            field_j = 126L;
          }
          param2.field_x.a(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("et.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int[] param2, rta param3, int param4, boolean param5) {
        l stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        rta stackIn_12_2 = null;
        boolean stackIn_13_3;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qia var11 = null;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          if ((4 & this.field_k.field_M[param3.field_k]) != 0 &&
            param3.field_t < 0) {
            var7_int = this.field_k.field_u[param3.field_k] / kta.field_d;
            while (true) {
              var8 = (var7_int + (1048575 - param3.field_r)) / var7_int;
              if (param4 < var8) {
                param3.field_r = param3.field_r + var7_int * param4;
                break;
              }
              param3.field_x.b(param2, param1, var8);
              param4 = param4 - var8;
              param3.field_r = param3.field_r + (var8 * var7_int - 1048576);
              param1 = param1 + var8;
              var9 = kta.field_d / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param3.field_x;
              if (this.field_k.field_q[param3.field_k] != 0) {
                param3.field_x = qia.a(param3.field_n, var11.j(), 0, var11.f());
                stackIn_12_0 = this.field_k;
                stackIn_12_1 = -35;
                stackIn_12_2 = (rta) (param3);
                stackIn_13_3 = !(param3.field_y.field_g[param3.field_m] >= 0);
                ((l) (Object) stackIn_12_0).a((byte) stackIn_12_1, stackIn_12_2, stackIn_13_3);
                param3.field_x.b(var9, var11.l());
              } else {
                param3.field_x = qia.a(param3.field_n, var11.j(), var11.l(), var11.f());
              }
              if (param3.field_y.field_g[param3.field_m] < 0) {
                param3.field_x.b(-1);
              }
              var11.d(var9);
              var11.b(param2, param1, param0 - param1);
              if (!var11.m()) {
                continue;
              }
              this.field_m.a(var11);
            }
          }
          if (param5) {
            this.field_m = (en) null;
          }
          param3.field_x.b(param2, param1, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("et.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rta var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_m.b(param0, param1, param2);
          var6 = (rta) (this.field_l.f(-80));
          while (var6 != null) {
            if (!this.field_k.c(15, var6)) {
              var4_int = param1;
              var5 = param2;
              do {
                if (var5 <= var6.field_B) {
                  this.a(var4_int + var5, var4_int, param0, var6, var5, false);
                  var6.field_B = var6.field_B - var5;
                  break;
                }
                this.a(var4_int + var5, var4_int, param0, var6, var6.field_B, false);
                var4_int = var4_int + var6.field_B;
                var5 = var5 - var6.field_B;
              } while (!this.field_k.a(var6, param0, var4_int, (byte) 6, var5));
            }
            var6 = (rta) (this.field_l.e(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("et.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        kh var3 = ql.field_k;
        var3.k(param0, -2988);
        var3.i(3, 0);
        var3.i(9, param1 ^ param1);
        var3.f(param1 ^ -1477662122, param2);
    }

    et(l param0) {
        this.field_l = new vna();
        this.field_m = new en();
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "et.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int a() {
        return 0;
    }

    final cg b() {
        rta var1 = (rta) (this.field_l.f(-80));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_x) {
          return (cg) ((Object) var1.field_x);
        }
        return this.c();
    }

    static {
        field_j = 17219L;
    }
}
