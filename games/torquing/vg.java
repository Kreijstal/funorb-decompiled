/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends eh {
    static fj field_k;
    static int field_j;
    private boolean field_m;
    static int field_o;
    private double[] field_n;
    static volatile int field_l;

    final static byte[] a(CharSequence param0, byte param1) {
        int var5 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          var2_int = param0.length();
          var4 = -97 % ((-62 - param1) / 48);
          var3 = new byte[var2_int];
          for (var5 = 0; var5 < var2_int; var5++) {
            {
              var6 = param0.charAt(var5);
              if ((var6 <= 0 ||
                var6 >= 128) && (var6 < 160 ||
                255 < var6)) {
                switch (var6) {
                  case 8364:
                    var3[var5] = (byte)-128;
                    break;
                  case 8218:
                    var3[var5] = (byte)-126;
                    break;
                  case 402:
                    var3[var5] = (byte)-125;
                    break;
                  case 8222:
                    var3[var5] = (byte)-124;
                    break;
                  case 8230:
                    var3[var5] = (byte)-123;
                    break;
                  case 8224:
                    var3[var5] = (byte)-122;
                    break;
                  case 8225:
                    var3[var5] = (byte)-121;
                    break;
                  case 710:
                    var3[var5] = (byte)-120;
                    break;
                  case 8240:
                    var3[var5] = (byte)-119;
                    break;
                  case 352:
                    var3[var5] = (byte)-118;
                    break;
                  case 8249:
                    var3[var5] = (byte)-117;
                    break;
                  case 338:
                    var3[var5] = (byte)-116;
                    break;
                  case 381:
                    var3[var5] = (byte)-114;
                    break;
                  case 8216:
                    var3[var5] = (byte)-111;
                    break;
                  case 8217:
                    var3[var5] = (byte)-110;
                    break;
                  case 8220:
                    var3[var5] = (byte)-109;
                    break;
                  case 8221:
                    var3[var5] = (byte)-108;
                    break;
                  case 8226:
                    var3[var5] = (byte)-107;
                    break;
                  case 8211:
                    var3[var5] = (byte)-106;
                    break;
                  case 8212:
                    var3[var5] = (byte)-105;
                    break;
                  case 732:
                    var3[var5] = (byte)-104;
                    break;
                  case 8482:
                    var3[var5] = (byte)-103;
                    break;
                  case 353:
                    var3[var5] = (byte)-102;
                    break;
                  case 8250:
                    var3[var5] = (byte)-101;
                    break;
                  case 339:
                    var3[var5] = (byte)-100;
                    break;
                  case 382:
                    var3[var5] = (byte)-98;
                    break;
                  case 376:
                    var3[var5] = (byte)-97;
                    break;
                  default:
                    var3[var5] = (byte)63;
                    break;
                }
              } else {
                var3[var5] = (byte)var6;
              }
            }
          }
          stackIn_67_0 = var3;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_70_0 = var2;
          stackIn_70_1 = new StringBuilder().append("vg.A(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(int param0) {
        this.field_m = true;
        this.b(0, this.field_h.field_g[this.field_c]);
        if (param0 <= 43) {
          this.field_n = (double[]) null;
        }
    }

    final static sm a(sm[] param0, int param1) {
        int var7_int = 0;
        int var8 = 0;
        sm stackIn_3_0 = null;
        sm stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sm[] var6 = null;
        sm[] var7 = null;
        sm var8_ref_sm = null;
        sm var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        sm[] var17 = null;
        sm var18 = null;
        sm var19 = null;
        var16 = Torquing.field_u;
        try {
          var2_int = 2147483647;
          var3 = -2147483648;
          var4 = 2147483647;
          var5 = -2147483648;
          if (param1 < 11) {
            stackIn_3_0 = (sm) null;
            return stackIn_3_0;
          }
          var17 = param0;
          var6 = var17;
          for (var7_int = 0; var17.length > var7_int; var7_int++) {
            var8_ref_sm = var17[var7_int];
            if (var8_ref_sm.field_g + var8_ref_sm.field_d > var5) {
              var5 = var8_ref_sm.field_g + var8_ref_sm.field_d;
            }
            if (var3 < var8_ref_sm.field_a + var8_ref_sm.field_c) {
              var3 = var8_ref_sm.field_a + var8_ref_sm.field_c;
            }
            if (var4 > var8_ref_sm.field_g) {
              var4 = var8_ref_sm.field_g;
            }
            if (var8_ref_sm.field_a < var2_int) {
              var2_int = var8_ref_sm.field_a;
            }
          }
          var18 = new sm(var3 - var2_int, -var4 + var5, 0);
          var19 = var18;
          var18.field_k = param0[0].field_k;
          var19.field_g = var4;
          var19.field_a = var2_int;
          var7 = param0;
          for (var8 = 0; var8 < var7.length; var8++) {
            var9 = var7[var8];
            var10 = 0;
            var11 = 0;
            var12 = 0;
            var13 = 0;
            var14 = 640;
            var12 = var12 - var19.field_a;
            var15 = 480;
            var13 = var13 - var19.field_g;
            var11 = var11 - var9.field_g;
            var10 = var10 - var9.field_a;
            if (var11 < 0) {
              var15 = var15 + var11;
              var13 = var13 - var11;
              var11 = 0;
            }
            if (var10 < 0) {
              var12 = var12 - var10;
              var14 = var14 + var10;
              var10 = 0;
            }
            if (var13 < 0) {
              var11 = var11 - var13;
              var15 = var15 + var13;
              var13 = 0;
            }
            if (var12 < 0) {
              var14 = var14 + var12;
              var10 = var10 - var12;
              var12 = 0;
            }
            if (-var10 + var9.field_c < var14) {
              var14 = -var10 + var9.field_c;
            }
            if (var15 > -var11 + var9.field_d) {
              var15 = var9.field_d - var11;
            }
            if (var14 > var19.field_c - var12) {
              var14 = -var12 + var19.field_c;
            }
            if (-var13 + var19.field_d < var15) {
              var15 = -var13 + var19.field_d;
            }
            if (var14 > 0 &&
              var15 > 0) {
              oc.a((byte) 0, 0, var12 + var19.field_c * var13, var19.field_l, var15, -var14 + var9.field_c, -var14 + var19.field_c, var14, var11 * var9.field_c + var10, var9.field_l);
            }
          }
          stackIn_52_0 = var19;
          return stackIn_52_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("vg.C(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(double param0, double param1, int param2, double param3) {
        double var8 = -param3 + this.field_g[0];
        double var10 = -param0 + this.field_g[param2];
        double var12 = this.field_g[2] - param1;
        double var14 = 5120.0 / Math.sqrt(var12 * var12 + (var8 * var8 + var10 * var10));
        this.field_n[1] = this.field_n[1] + var10 * var14;
        this.field_n[0] = this.field_n[0] + var14 * var8;
        this.field_n[2] = this.field_n[2] + var14 * var12;
    }

    final sg a(int param0, hc param1) {
        int var4_int = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        sg stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        kh var4 = null;
        int var5 = 0;
        int var7 = 0;
        tl[] var8 = null;
        tl[] var9 = null;
        int var5Lifetime1;
        var7 = Torquing.field_u;
        try {
          var8 = param1.field_q;
          var9 = var8;
          param1.d(-18916);
          for (var4_int = 0; var4_int < var8.length; var4_int++) {
            var8[var4_int].d(-2).field_q.field_r = 0;
          }
          var4 = param1.a(-100, true);
          this.field_h = new sg(3 + var9.length);
          this.field_h.a(0, var4);
          this.field_h.a(1, tp.field_a);
          if (param0 >= -52) {
            this.e(19);
          }
          this.field_c = 1;
          this.field_h.a(var9.length + 2, param1.c(-20561));
          for (var5 = 0; var5 < var9.length; var5++) {
            this.field_h.a(2 + var5, var9[var5].d(-2));
            var9[var5].field_c = var5 + 2;
          }
          if (param1.field_k != null) {
            this.field_h.a(0, param1.field_k);
          }
          if (0 < var9.length) {
            stackIn_17_0 = (null == var9[0].field_d) ? 1 : 0;
          } else {
            stackIn_17_0 = 0;
          }
          var5Lifetime1 = stackIn_17_0;
          this.field_a = param1;
          for (var6 = 0; var9.length > var6; var6++) {
            var9[var6].field_a = param1;
            var9[var6].field_h = this.field_h;
            var9[var6].e((byte) -91);
          }
          this.a(param1.f(50), 18910);
          this.b(1);
          if (var5Lifetime1 != 0) {
            param1.field_k = this.field_h.a(0);
          }
          stackIn_24_0 = this.field_h;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("vg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static boolean d(int param0) {
        if (param0 != 0) {
          field_l = 85;
        }
        return ff.field_a;
    }

    final void a(boolean param0, int[] param1) {
        try {
          param1[2] = this.field_f[2];
          param1[0] = this.field_f[0];
          if (!param0) {
            field_l = -37;
          }
          param1[1] = this.field_f[1];
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "vg.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, kh param1) {
        try {
          if (param0 != 0) {
            field_k = (fj) null;
          }
          if (this.field_m) {
            param1 = this.a(-1, param1);
          }
          this.field_h.a(this.field_c, param1);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "vg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final double a(double[] param0, boolean param1, double param2, boolean param3, int param4, boolean param5) {
        RuntimeException var8 = null;
        Object stackIn_2_0;
        double stackIn_2_1;
        double[] stackIn_2_2;
        boolean stackIn_2_3;
        int stackIn_2_4;
        boolean stackIn_2_5;
        boolean stackIn_2_6;
        double stackIn_2_7;
        Object stackIn_3_0;
        double stackIn_3_8;
        double stackIn_4_0 = 0.0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = this;
          stackIn_2_1 = param2;
          stackIn_2_2 = (double[]) (param0);
          stackIn_2_3 = param3;
          stackIn_2_4 = -6076;
          stackIn_2_5 = param1;
          stackIn_2_6 = param5;
          stackIn_2_7 = 30.0;
          if (this.field_m) {
            stackIn_3_0 = this;
            stackIn_3_8 = 1.0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_8 = 0.0;
          }
          this.field_g = hl.a(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_2_4, stackIn_2_5, stackIn_2_6, stackIn_2_7, stackIn_3_8, this.field_a, this.field_g, this.field_n);
          this.field_n[param4] = 0.0;
          this.field_n[1] = 0.0;
          this.field_n[2] = 0.0;
          this.c(param4 ^ 0);
          this.field_h.a(this.field_h.field_g[this.field_c], this.field_f);
          stackIn_4_0 = ap.a(this.field_g, 0, re.field_d, 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("vg.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final kh a(int param0, kh param1) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        kh stackIn_2_0 = null;
        kh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            stackIn_2_0 = (kh) null;
            return stackIn_2_0;
          }
          var3 = new kh(new rm(new rm[]{param1.field_l, gb.field_c.field_l}, 2));
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("vg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 >= -75) {
          return;
        }
        field_k = null;
    }

    final static la a(int param0, int param1) {
        if (param0 != -27646) {
          return (la) null;
        }
        return hc.a(false, true, param1, 8505, false, 1);
    }

    private final void a(double[] param0, int param1) {
        double[] var5 = null;
        double[] var4 = null;
        try {
          this.field_m = false;
          dk.a(param0, 0, this.field_g, 0, this.field_g.length);
          var5 = this.field_n;
          double[] var3 = var5;
          var4 = this.field_n;
          this.field_n[2] = 0.0;
          var4[1] = 0.0;
          var5[0] = 0.0;
          he.a(this.field_a, 0.08, this.field_g, 16777215, 30.0);
          this.c(param1 ^ param1);
          this.field_h.a(tp.field_a, this.field_f);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "vg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final lm a(byte param0) {
        if (param0 > -24) {
          vg.d((byte) -59);
        }
        return (lm) ((Object) new ej(this.field_g[0], this.field_g[1], this.field_g[2], 30.0));
    }

    vg() {
        this.field_n = new double[3];
    }

    static {
        field_l = 0;
    }
}
