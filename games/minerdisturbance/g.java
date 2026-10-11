/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static boolean field_o;
    byte[][] field_l;
    da[] field_n;
    int field_c;
    int[] field_d;
    static int field_k;
    private byte[] field_a;
    int[] field_f;
    int[] field_q;
    da field_s;
    int field_b;
    int[][] field_p;
    int field_r;
    int[] field_h;
    static String field_e;
    private int[] field_m;
    private int field_g;
    int[] field_t;
    private int[][] field_i;
    static ea[] field_j;

    final static void a(int param0, int param1) {
        ud.field_e = param0 >> 4 & 3;
        if (!(2 >= ud.field_e)) {
          ud.field_e = 2;
        }
        ra.field_b = (param0 & 13) >> 2;
        if (ra.field_b > param1) {
          ra.field_b = 2;
        }
        wi.field_t = param0 & 3;
        if (!(wi.field_t <= 2)) {
          wi.field_t = 2;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = -2 % ((46 - param1) / 51);
        if (param0) {
          eh.b(0, 0, eh.field_g, eh.field_c, 0, 192);
        } else {
          eh.d();
        }
        pf.a(0, param0);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              if (param1 <= 34) {
                field_k = 6;
              }
              param0.getAppletContext().showDocument(nn.a(121, param0, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("g.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        mj var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          if (param0 != -69) {
            field_o = true;
          }
          var4 = (mj) (nh.field_a.b(75));
          while (var4 != null) {
            vd.a(param1, -3450, var4);
            var4 = (mj) (nh.field_a.b((byte) 56));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "g.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, ea[] param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        java.applet.Applet var23 = null;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = MinerDisturbance.field_ab;
        try {
          if (param5 == null) {
            return;
          }
          if (0 < param3 &&
            0 < param1) {
            if (null != param5[3]) {
              stackIn_9_0 = param5[3].field_x;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (param5[5] != null) {
              stackIn_12_0 = param5[5].field_x;
            } else {
              stackIn_12_0 = 0;
            }
            var7 = stackIn_12_0;
            if (param5[1] != null) {
              stackIn_15_0 = param5[1].field_A;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (null != param5[7]) {
              stackIn_18_0 = param5[7].field_A;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param3 + param2;
            var11 = param1 + param0;
            var12 = param2 + var6_int;
            var13 = -var7 + var10;
            var14 = param0 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param2 + param3 * var6_int / (var7 + var6_int);
              var16 = param2 + param3 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            if (param4 <= 13) {
              var23 = (java.applet.Applet) null;
              g.a((java.applet.Applet) null, 77);
            }
            if (var18 > var19) {
              var19 = param1 * var8 / (var9 + var8) + param0;
              var18 = param1 * var8 / (var9 + var8) + param0;
            }
            eh.b(fm.field_N);
            if (param5[0] != null) {
              eh.f(param2, param0, var16, var18);
              param5[0].f(param2, param0);
              eh.a(fm.field_N);
            }
            if (param5[2] != null) {
              eh.f(var17, param0, var10, var18);
              param5[2].f(var13, param0);
              eh.a(fm.field_N);
            }
            if (param5[6] != null) {
              eh.f(param2, var19, var16, var11);
              param5[6].f(param2, var15);
              eh.a(fm.field_N);
            }
            if (param5[8] != null) {
              eh.f(var17, var19, var10, var11);
              param5[8].f(var13, var15);
              eh.a(fm.field_N);
            }
            if (param5[1] != null &&
              0 != param5[1].field_x) {
              eh.f(var16, param0, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param5[1].field_x) {
                param5[1].f(var20, param0);
              }
              eh.a(fm.field_N);
            }
            if (null != param5[7] &&
              param5[7].field_x != 0) {
              eh.f(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param5[7].field_x) {
                param5[7].f(var20Lifetime1, var15);
              }
              eh.a(fm.field_N);
            }
            if (param5[3] != null &&
              param5[3].field_A != 0) {
              eh.f(param2, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param5[3].field_A) {
                param5[3].f(param2, var20Lifetime2);
              }
              eh.a(fm.field_N);
            }
            if (param5[5] != null &&
              param5[5].field_A != 0) {
              eh.f(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param5[5].field_A) {
                param5[5].f(var13, var20Lifetime3);
              }
              eh.a(fm.field_N);
            }
            if (null != param5[4] &&
              param5[4].field_x != 0) {
              if (param5[4].field_A == 0) {
                return;
              }
              eh.f(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param5[4].field_A) {
                for (var21 = var12; var13 > var21; var21 = var21 + param5[4].field_x) {
                  param5[4].f(var21, var20Lifetime4);
                }
              }
              eh.a(fm.field_N);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("g.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    private final void a(int param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        sb var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = MinerDisturbance.field_ab;
        try {
          var17 = new sb(in.a(param1, param0 - 2));
          var4 = var17.d((byte) -54);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_r = var17.b((byte) 91);
            } else {
              this.field_r = 0;
            }
            var5 = var17.d((byte) -54);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (7 > var4) {
              this.field_g = var17.e(param0 ^ -108);
            } else {
              this.field_g = var17.a((byte) -120);
            }
            stackIn_17_0 = ((var5 & param0) == 0) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.field_t = new int[this.field_g];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; this.field_g > var10; var10++) {
                dupTemp$0 = var8 + var17.a((byte) -117);
                var8 = dupTemp$0;
                this.field_t[var10] = dupTemp$0;
                if (var9 < this.field_t[var10]) {
                  var9 = this.field_t[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_g; var10++) {
                dupTemp$1 = var8 + var17.e(-68);
                var8 = dupTemp$1;
                this.field_t[var10] = dupTemp$1;
                if (this.field_t[var10] > var9) {
                  var9 = this.field_t[var10];
                }
              }
            }
            this.field_c = 1 + var9;
            this.field_f = new int[this.field_c];
            if (var7 != 0) {
              this.field_l = new byte[this.field_c][];
            }
            this.field_d = new int[this.field_c];
            this.field_h = new int[this.field_c];
            this.field_q = new int[this.field_c];
            this.field_p = new int[this.field_c][];
            if (var6 != 0) {
              this.field_m = new int[this.field_c];
              for (var10Lifetime1 = 0; this.field_c > var10Lifetime1; var10Lifetime1++) {
                this.field_m[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_g; var10Lifetime1Lifetime1++) {
                this.field_m[this.field_t[var10Lifetime1Lifetime1]] = var17.b((byte) 119);
              }
              this.field_s = new da(this.field_m);
            }
            for (var10Lifetime2 = 0; this.field_g > var10Lifetime2; var10Lifetime2++) {
              this.field_h[this.field_t[var10Lifetime2]] = var17.b((byte) 49);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; this.field_g > var10Lifetime3; var10Lifetime3++) {
                this.field_q[this.field_t[var10Lifetime3]] = var17.b((byte) 84);
              }
            } else {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_g; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(var21, (byte) -120, 0, 64);
                this.field_l[this.field_t[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; this.field_g > var10Lifetime3; var10Lifetime3++) {
                this.field_q[this.field_t[var10Lifetime3]] = var17.b((byte) 84);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; this.field_g > var10Lifetime4; var10Lifetime4++) {
                this.field_d[this.field_t[var10Lifetime4]] = var17.a((byte) -124);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_g; var10Lifetime4++) {
                var11 = this.field_t[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_d[var11];
                array$2 = new int[var12];
                this.field_p[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.a((byte) -119);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_p[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_f[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_p[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_g; var10Lifetime4++) {
                this.field_d[this.field_t[var10Lifetime4]] = var17.e(-10);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_g; var10Lifetime4++) {
                var11 = this.field_t[var10Lifetime4];
                var12 = this.field_d[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$5 = new int[var12];
                this.field_p[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.e(eg.a(param0, -71));
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_p[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_f[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_p[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_n = new da[var9 + 1];
              this.field_i = new int[var9 + 1][];
              for (var10Lifetime5 = 0; this.field_g > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.field_t[var10Lifetime5];
                var12Lifetime1 = this.field_d[var11Lifetime1];
                array$8 = new int[this.field_f[var11Lifetime1]];
                this.field_i[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_f[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_i[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_p[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_p[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_i[var11Lifetime1][var14Lifetime1] = var17.b((byte) 100);
                }
                this.field_n[var11Lifetime1] = new da(this.field_i[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_102_0 = var3;
          stackIn_102_1 = new StringBuilder().append("g.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        if (param0 != 16704) {
          g.a(121);
        }
    }

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ea[] var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          if (param0 != -36) {
            var3 = (ea[]) null;
            g.a(25, -9, -119, -32, (byte) 41, (ea[]) null);
          }
          for (var1_int = 0; var1_int < 35; var1_int++) {
            if (th.field_b[var1_int][cm.field_o] &&
              d.a(var1_int, cm.field_o, (byte) 68)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "g.E(" + param0 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        java.applet.Applet var3;
        boolean stackIn_6_0 = false;
        if (param1 != -68) {
          var3 = (java.applet.Applet) null;
          g.a((java.applet.Applet) null, -49);
        }
        stackIn_6_0 = (param0 >= 48) && (param0 <= 57);
        return stackIn_6_0;
    }

    final static boolean a(byte param0) {
        tn.field_M = true;
        if (param0 > -125) {
          return true;
        }
        j.field_f = 15000L + sf.a((byte) -19);
        return fh.field_b == 11 ? true : false;
    }

    g(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_b = gn.a(param0.length, param0, true);
          if (param1 != this.field_b) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_a = wb.a(param0.length, 0, param0, 18738);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_a[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(2, param0);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Woolly jumper: Protects against cold water.";
    }
}
