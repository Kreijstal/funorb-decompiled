/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends tfa implements gf {
    static String field_m;
    private int field_l;
    static cn field_n;
    private int field_k;

    public final float a(float param0, byte param1) {
        if (param1 != -33) {
          return -0.828248143196106f;
        }
        return param0 / (float)this.field_k;
    }

    hm(kda param0, ft param1, una param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        try {
          this.field_k = param3;
          this.field_l = param4;
          this.field_j.a(true, (iva) (this));
          jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.d(108), param3, param4, 0, waa.a(this.field_f, 1383), lr.a(this.field_a, 5126), (byte[]) null, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, float[] param1, int param2, int param3, int param4, int param5, int param6, ft param7, boolean param8) {
        try {
          this.field_j.a(param8, (iva) (this));
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexSubImage2Df(this.field_i, 0, param0, param2, param3, param4, waa.a(param7, 1383), 5121, param1, param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hm.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    public static void g(byte param0) {
        field_n = null;
        if (param0 != 4) {
          return;
        }
        field_m = null;
    }

    public final void b(byte param0) {
        super.b((byte) 66);
        if (param0 < 32) {
          field_m = (String) null;
        }
    }

    public final int a(byte param0) {
        if (param0 < 0) {
          return this.field_l;
        }
        ft var3 = (ft) null;
        this.a(-26, (byte) -121, -51, (byte[]) null, 52, 85, (ft) null, -93, 99);
        return this.field_l;
    }

    hm(kda param0, ft param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, una.field_g, param3 * param2, param4);
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.field_l = param3;
          this.field_k = param2;
          this.field_j.a(true, (iva) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (param4 &&
            param7 == 0 &&
            0 == param6) {
            this.a(this.field_i, param2, param5, -118, param3);
          } else {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Dub(this.field_i, 0, this.d(110), param2, param3, 0, waa.a(this.field_f, 1383), 5121, param5, param6);
            jaggl.OpenGL.glPixelStorei(3314, 0);
          }
          jaggl.OpenGL.glPixelStorei(3317, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_10_0 = var9;
          stackIn_10_1 = new StringBuilder().append("hm.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
          return true;
        }
        return true;
    }

    final static void h(byte param0) {
        gg.field_f = null;
        uda.field_r = null;
        uua.field_a = null;
        nm.field_l = null;
        ep.field_n = null;
        int var1 = 60 / ((-20 - param0) / 45);
        mc.field_r = null;
        cb.field_i = null;
        dp.field_d = null;
        tv.field_wb = null;
        sta.field_y = null;
        bm.field_f = null;
        vna.field_c = null;
        wh.field_y = null;
        la.field_j = null;
        lm.field_m = null;
        po.field_l = null;
        pq.field_a = null;
        ik.field_h = null;
        bd.field_i = null;
        uta.field_d = null;
        ng.field_b = null;
        em.field_h = null;
        qf.field_k = null;
        la.field_p = (nh[][]) null;
        dn.field_d = null;
        ng.field_k = null;
        ega.field_e = null;
        vua.field_A = null;
        dr.field_a = null;
        ij.field_X = null;
        fa.field_a = null;
        ufa.field_r = null;
        lva.field_m = null;
        tp.field_K = null;
        aq.field_a = null;
        je.field_E = null;
        haa.field_z = null;
        eca.field_c = null;
        fra.field_q = null;
        lh.field_b = null;
        kq.field_a = null;
        eu.field_a = null;
        tka.field_p = null;
        gca.field_a = null;
        bsa.field_i = null;
        nc.field_e = null;
        System.gc();
    }

    hm(kda param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, gpa.field_a, una.field_g, param1 * param2, param3);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          this.field_k = param1;
          this.field_l = param2;
          this.field_j.a(true, (iva) (this));
          if (param3 &&
            param6 == 0 &&
            param5 == 0) {
            this.a((byte) 99, this.field_i, param2, param4, param1);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Di(this.field_i, 0, 6408, this.field_k, this.field_l, 0, 32993, this.field_j.field_od, param4, param5 * 4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("hm.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        this.field_j.a(true, (iva) (this));
        jaggl.OpenGL.glTexParameteri(this.field_i, 10242, !param1 ? 33071 : 10497);
        jaggl.OpenGL.glTexParameteri(this.field_i, 10243, !param2 ? 33071 : 10497);
        if (param0 <= -60) {
          return;
        }
        ft var5 = (ft) null;
        this.a(-2, (byte) 55, 95, (byte[]) null, -118, 102, (ft) null, -23, 82);
    }

    hm(kda param0, ft param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, una.field_h, param2 * param3, param4);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.field_l = param3;
          this.field_k = param2;
          this.field_j.a(true, (iva) (this));
          if (!param4 &&
            param7 == 0 &&
            0 == param6) {
            this.a(-1, param5, param3, this.field_i, param2);
            return;
          }
          jaggl.OpenGL.glPixelStorei(3314, param7);
          jaggl.OpenGL.glTexImage2Df(this.field_i, 0, this.d(44), param2, param3, 0, waa.a(this.field_f, 1383), 5126, param5, param6 * 4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("hm.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var10Lifetime6;
        int var10Lifetime7;
        int var10Lifetime8;
        int var10Lifetime9;
        int var10Lifetime10;
        int var10Lifetime11;
        int var10Lifetime12;
        int var10Lifetime13;
        int var10Lifetime14;
        int var11Lifetime4;
        int var11Lifetime5;
        int var11Lifetime6;
        int var11Lifetime7;
        int var11Lifetime8;
        int var11Lifetime9;
        int var11Lifetime10;
        int var12Lifetime4;
        int var12Lifetime5;
        int var12Lifetime6;
        int var12Lifetime7;
        int var12Lifetime8;
        int var12Lifetime9;
        int var12Lifetime10;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        int var10Lifetime1Lifetime3;
        int var10Lifetime1Lifetime4;
        int var10Lifetime1Lifetime5;
        int var10Lifetime1Lifetime6;
        int var10Lifetime1Lifetime7;
        int var10Lifetime1Lifetime8;
        int var10Lifetime1Lifetime9;
        int var10Lifetime2Lifetime1;
        int var10Lifetime2Lifetime2;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var11Lifetime1Lifetime3;
        int var11Lifetime1Lifetime4;
        int var11Lifetime1Lifetime5;
        int var11Lifetime1Lifetime6;
        int var11Lifetime1Lifetime7;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var12Lifetime1Lifetime3;
        int var12Lifetime1Lifetime4;
        int var12Lifetime1Lifetime5;
        int var12Lifetime1Lifetime6;
        int var12Lifetime1Lifetime7;
        int var10Lifetime15;
        int var10Lifetime16;
        int var10Lifetime1Lifetime10;
        int var10Lifetime1Lifetime11;
        int var10Lifetime6Lifetime1;
        int var10Lifetime6Lifetime2;
        int var10Lifetime7Lifetime1;
        int var10Lifetime7Lifetime2;
        int var10Lifetime8Lifetime1;
        int var10Lifetime8Lifetime2;
        int var10Lifetime9Lifetime1;
        int var10Lifetime9Lifetime2;
        int var10Lifetime10Lifetime1;
        int var10Lifetime10Lifetime2;
        int var10Lifetime11Lifetime1;
        int var10Lifetime11Lifetime2;
        int var10Lifetime1Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1Lifetime2;
        int var10Lifetime1Lifetime2Lifetime1;
        int var10Lifetime1Lifetime2Lifetime2;
        int var10Lifetime1Lifetime3Lifetime1;
        int var10Lifetime1Lifetime3Lifetime2;
        int var10Lifetime1Lifetime4Lifetime1;
        int var10Lifetime1Lifetime4Lifetime2;
        int var10Lifetime1Lifetime5Lifetime1;
        int var10Lifetime1Lifetime5Lifetime2;
        int var10Lifetime1Lifetime6Lifetime1;
        int var10Lifetime1Lifetime6Lifetime2;
        if (param8 < param2) {
          if (param6 < param2) {
            return -1;
          }
          if ((param7 >= param9 ||
            param0 >= param9) &&
            (param8 <= param3 ||
            param3 >= param6) &&
            (param7 <= param4 ||
            param0 <= param4)) {
            if (param8 < param2) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10) {
                param8 = param8 >> var10;
                param6 = param6 >> var10;
                param3 = param3 >> var10;
              }
              var10Lifetime15 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime15 > 0) {
                param7 = param7 >> var10Lifetime15;
                param0 = param0 >> var10Lifetime15;
                param4 = param4 >> var10Lifetime15;
              }
              var10Lifetime16 = param0 - param7;
              var11 = -param8 + param6;
              var12 = -1;
              if (var11 != 0) {
                var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10Lifetime16, var11, param4);
              }
              if (var10Lifetime16 != 0) {
                var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10Lifetime16, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11 != 0) {
                var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10Lifetime16, var11, 0);
              }
              if (0 != var10Lifetime16) {
                var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10Lifetime16, 0);
              }
              return var12;
            }
            if (param8 > param3) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime6 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime6) {
                param8 = param8 >> var10Lifetime6;
                param6 = param6 >> var10Lifetime6;
                param3 = param3 >> var10Lifetime6;
              }
              var10Lifetime6Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime6Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime6Lifetime1;
                param0 = param0 >> var10Lifetime6Lifetime1;
                param4 = param4 >> var10Lifetime6Lifetime1;
              }
              var10Lifetime6Lifetime2 = param0 - param7;
              var11Lifetime4 = -param8 + param6;
              var12Lifetime4 = -1;
              if (var11Lifetime4 != 0) {
                var12Lifetime4 = gv.a(0, param5, param8, param0, var12Lifetime4, param1 ^ -15, param7, var10Lifetime6Lifetime2, var11Lifetime4, param4);
              }
              if (var10Lifetime6Lifetime2 != 0) {
                var12Lifetime4 = gv.a(0, param5, param7, param6, var12Lifetime4, 0, param8, var11Lifetime4, var10Lifetime6Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime4 != 0) {
                var12Lifetime4 = gv.a(-param4, param5, param8, param0, var12Lifetime4, 0, param7, var10Lifetime6Lifetime2, var11Lifetime4, 0);
              }
              if (0 != var10Lifetime6Lifetime2) {
                var12Lifetime4 = gv.a(-param3, param5, param7, param6, var12Lifetime4, 0, param8, var11Lifetime4, var10Lifetime6Lifetime2, 0);
              }
              return var12Lifetime4;
            }
            if (param9 > param7) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime7 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime7) {
                param8 = param8 >> var10Lifetime7;
                param6 = param6 >> var10Lifetime7;
                param3 = param3 >> var10Lifetime7;
              }
              var10Lifetime7Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime7Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime7Lifetime1;
                param0 = param0 >> var10Lifetime7Lifetime1;
                param4 = param4 >> var10Lifetime7Lifetime1;
              }
              var10Lifetime7Lifetime2 = param0 - param7;
              var11Lifetime5 = -param8 + param6;
              var12Lifetime5 = -1;
              if (var11Lifetime5 != 0) {
                var12Lifetime5 = gv.a(0, param5, param8, param0, var12Lifetime5, param1 ^ -15, param7, var10Lifetime7Lifetime2, var11Lifetime5, param4);
              }
              if (var10Lifetime7Lifetime2 != 0) {
                var12Lifetime5 = gv.a(0, param5, param7, param6, var12Lifetime5, 0, param8, var11Lifetime5, var10Lifetime7Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime5 != 0) {
                var12Lifetime5 = gv.a(-param4, param5, param8, param0, var12Lifetime5, 0, param7, var10Lifetime7Lifetime2, var11Lifetime5, 0);
              }
              if (0 != var10Lifetime7Lifetime2) {
                var12Lifetime5 = gv.a(-param3, param5, param7, param6, var12Lifetime5, 0, param8, var11Lifetime5, var10Lifetime7Lifetime2, 0);
              }
              return var12Lifetime5;
            }
            if (param4 < param7) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime8 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime8) {
                param8 = param8 >> var10Lifetime8;
                param6 = param6 >> var10Lifetime8;
                param3 = param3 >> var10Lifetime8;
              }
              var10Lifetime8Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime8Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime8Lifetime1;
                param0 = param0 >> var10Lifetime8Lifetime1;
                param4 = param4 >> var10Lifetime8Lifetime1;
              }
              var10Lifetime8Lifetime2 = param0 - param7;
              var11Lifetime6 = -param8 + param6;
              var12Lifetime6 = -1;
              if (var11Lifetime6 != 0) {
                var12Lifetime6 = gv.a(0, param5, param8, param0, var12Lifetime6, param1 ^ -15, param7, var10Lifetime8Lifetime2, var11Lifetime6, param4);
              }
              if (var10Lifetime8Lifetime2 != 0) {
                var12Lifetime6 = gv.a(0, param5, param7, param6, var12Lifetime6, 0, param8, var11Lifetime6, var10Lifetime8Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime6 != 0) {
                var12Lifetime6 = gv.a(-param4, param5, param8, param0, var12Lifetime6, 0, param7, var10Lifetime8Lifetime2, var11Lifetime6, 0);
              }
              if (0 != var10Lifetime8Lifetime2) {
                var12Lifetime6 = gv.a(-param3, param5, param7, param6, var12Lifetime6, 0, param8, var11Lifetime6, var10Lifetime8Lifetime2, 0);
              }
              return var12Lifetime6;
            }
            if (param6 < param2) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime9 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime9) {
                param8 = param8 >> var10Lifetime9;
                param6 = param6 >> var10Lifetime9;
                param3 = param3 >> var10Lifetime9;
              }
              var10Lifetime9Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime9Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime9Lifetime1;
                param0 = param0 >> var10Lifetime9Lifetime1;
                param4 = param4 >> var10Lifetime9Lifetime1;
              }
              var10Lifetime9Lifetime2 = param0 - param7;
              var11Lifetime7 = -param8 + param6;
              var12Lifetime7 = -1;
              if (var11Lifetime7 != 0) {
                var12Lifetime7 = gv.a(0, param5, param8, param0, var12Lifetime7, param1 ^ -15, param7, var10Lifetime9Lifetime2, var11Lifetime7, param4);
              }
              if (var10Lifetime9Lifetime2 != 0) {
                var12Lifetime7 = gv.a(0, param5, param7, param6, var12Lifetime7, 0, param8, var11Lifetime7, var10Lifetime9Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime7 != 0) {
                var12Lifetime7 = gv.a(-param4, param5, param8, param0, var12Lifetime7, 0, param7, var10Lifetime9Lifetime2, var11Lifetime7, 0);
              }
              if (0 != var10Lifetime9Lifetime2) {
                var12Lifetime7 = gv.a(-param3, param5, param7, param6, var12Lifetime7, 0, param8, var11Lifetime7, var10Lifetime9Lifetime2, 0);
              }
              return var12Lifetime7;
            }
            if (param6 > param3) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime10) {
                param8 = param8 >> var10Lifetime10;
                param6 = param6 >> var10Lifetime10;
                param3 = param3 >> var10Lifetime10;
              }
              var10Lifetime10Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime10Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime10Lifetime1;
                param0 = param0 >> var10Lifetime10Lifetime1;
                param4 = param4 >> var10Lifetime10Lifetime1;
              }
              var10Lifetime10Lifetime2 = param0 - param7;
              var11Lifetime8 = -param8 + param6;
              var12Lifetime8 = -1;
              if (var11Lifetime8 != 0) {
                var12Lifetime8 = gv.a(0, param5, param8, param0, var12Lifetime8, param1 ^ -15, param7, var10Lifetime10Lifetime2, var11Lifetime8, param4);
              }
              if (var10Lifetime10Lifetime2 != 0) {
                var12Lifetime8 = gv.a(0, param5, param7, param6, var12Lifetime8, 0, param8, var11Lifetime8, var10Lifetime10Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime8 != 0) {
                var12Lifetime8 = gv.a(-param4, param5, param8, param0, var12Lifetime8, 0, param7, var10Lifetime10Lifetime2, var11Lifetime8, 0);
              }
              if (0 != var10Lifetime10Lifetime2) {
                var12Lifetime8 = gv.a(-param3, param5, param7, param6, var12Lifetime8, 0, param8, var11Lifetime8, var10Lifetime10Lifetime2, 0);
              }
              return var12Lifetime8;
            }
            if (param9 > param0) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime11 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime11) {
                param8 = param8 >> var10Lifetime11;
                param6 = param6 >> var10Lifetime11;
                param3 = param3 >> var10Lifetime11;
              }
              var10Lifetime11Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime11Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime11Lifetime1;
                param0 = param0 >> var10Lifetime11Lifetime1;
                param4 = param4 >> var10Lifetime11Lifetime1;
              }
              var10Lifetime11Lifetime2 = param0 - param7;
              var11Lifetime9 = -param8 + param6;
              var12Lifetime9 = -1;
              if (var11Lifetime9 != 0) {
                var12Lifetime9 = gv.a(0, param5, param8, param0, var12Lifetime9, param1 ^ -15, param7, var10Lifetime11Lifetime2, var11Lifetime9, param4);
              }
              if (var10Lifetime11Lifetime2 != 0) {
                var12Lifetime9 = gv.a(0, param5, param7, param6, var12Lifetime9, 0, param8, var11Lifetime9, var10Lifetime11Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime9 != 0) {
                var12Lifetime9 = gv.a(-param4, param5, param8, param0, var12Lifetime9, 0, param7, var10Lifetime11Lifetime2, var11Lifetime9, 0);
              }
              if (0 != var10Lifetime11Lifetime2) {
                var12Lifetime9 = gv.a(-param3, param5, param7, param6, var12Lifetime9, 0, param8, var11Lifetime9, var10Lifetime11Lifetime2, 0);
              }
              return var12Lifetime9;
            }
            if (param4 >= param0) {
              return 1 + (1 << param5);
            }
            param8 = param8 - param2;
            param3 = param3 - param2;
            param6 = param6 - param2;
            param0 = param0 - param9;
            param4 = param4 - param9;
            param7 = param7 - param9;
            var10Lifetime12 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
            if (0 < var10Lifetime12) {
              param8 = param8 >> var10Lifetime12;
              param6 = param6 >> var10Lifetime12;
              param3 = param3 >> var10Lifetime12;
            }
            var10Lifetime13 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
            if (var10Lifetime13 > 0) {
              param7 = param7 >> var10Lifetime13;
              param0 = param0 >> var10Lifetime13;
              param4 = param4 >> var10Lifetime13;
            }
            var10Lifetime14 = param0 - param7;
            var11Lifetime10 = -param8 + param6;
            var12Lifetime10 = -1;
            if (var11Lifetime10 != 0) {
              var12Lifetime10 = gv.a(0, param5, param8, param0, var12Lifetime10, param1 ^ -15, param7, var10Lifetime14, var11Lifetime10, param4);
            }
            if (var10Lifetime14 != 0) {
              var12Lifetime10 = gv.a(0, param5, param7, param6, var12Lifetime10, 0, param8, var11Lifetime10, var10Lifetime14, param3);
            }
            param0 = param0 - param4;
            param8 = param8 - param3;
            param7 = param7 - param4;
            if (param1 != -15) {
              hm.g((byte) 96);
            }
            param6 = param6 - param3;
            if (var11Lifetime10 != 0) {
              var12Lifetime10 = gv.a(-param4, param5, param8, param0, var12Lifetime10, 0, param7, var10Lifetime14, var11Lifetime10, 0);
            }
            if (0 != var10Lifetime14) {
              var12Lifetime10 = gv.a(-param3, param5, param7, param6, var12Lifetime10, 0, param8, var11Lifetime10, var10Lifetime14, 0);
            }
            return var12Lifetime10;
          }
          return -1;
        }
        if (param7 < param9) {
          if (param0 < param9) {
            return -1;
          }
          if ((param8 <= param3 ||
            param3 >= param6) &&
            (param7 <= param4 ||
            param0 <= param4)) {
            if (param8 < param2) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime1 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime1) {
                param8 = param8 >> var10Lifetime1;
                param6 = param6 >> var10Lifetime1;
                param3 = param3 >> var10Lifetime1;
              }
              var10Lifetime1Lifetime10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime1Lifetime10 > 0) {
                param7 = param7 >> var10Lifetime1Lifetime10;
                param0 = param0 >> var10Lifetime1Lifetime10;
                param4 = param4 >> var10Lifetime1Lifetime10;
              }
              var10Lifetime1Lifetime11 = param0 - param7;
              var11Lifetime1 = -param8 + param6;
              var12Lifetime1 = -1;
              if (var11Lifetime1 != 0) {
                var12Lifetime1 = gv.a(0, param5, param8, param0, var12Lifetime1, param1 ^ -15, param7, var10Lifetime1Lifetime11, var11Lifetime1, param4);
              }
              if (var10Lifetime1Lifetime11 != 0) {
                var12Lifetime1 = gv.a(0, param5, param7, param6, var12Lifetime1, 0, param8, var11Lifetime1, var10Lifetime1Lifetime11, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime1 != 0) {
                var12Lifetime1 = gv.a(-param4, param5, param8, param0, var12Lifetime1, 0, param7, var10Lifetime1Lifetime11, var11Lifetime1, 0);
              }
              if (0 != var10Lifetime1Lifetime11) {
                var12Lifetime1 = gv.a(-param3, param5, param7, param6, var12Lifetime1, 0, param8, var11Lifetime1, var10Lifetime1Lifetime11, 0);
              }
              return var12Lifetime1;
            }
            if (param8 > param3) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime1Lifetime1 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime1Lifetime1) {
                param8 = param8 >> var10Lifetime1Lifetime1;
                param6 = param6 >> var10Lifetime1Lifetime1;
                param3 = param3 >> var10Lifetime1Lifetime1;
              }
              var10Lifetime1Lifetime1Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime1Lifetime1Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime1Lifetime1Lifetime1;
                param0 = param0 >> var10Lifetime1Lifetime1Lifetime1;
                param4 = param4 >> var10Lifetime1Lifetime1Lifetime1;
              }
              var10Lifetime1Lifetime1Lifetime2 = param0 - param7;
              var11Lifetime1Lifetime1 = -param8 + param6;
              var12Lifetime1Lifetime1 = -1;
              if (var11Lifetime1Lifetime1 != 0) {
                var12Lifetime1Lifetime1 = gv.a(0, param5, param8, param0, var12Lifetime1Lifetime1, param1 ^ -15, param7, var10Lifetime1Lifetime1Lifetime2, var11Lifetime1Lifetime1, param4);
              }
              if (var10Lifetime1Lifetime1Lifetime2 != 0) {
                var12Lifetime1Lifetime1 = gv.a(0, param5, param7, param6, var12Lifetime1Lifetime1, 0, param8, var11Lifetime1Lifetime1, var10Lifetime1Lifetime1Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime1Lifetime1 != 0) {
                var12Lifetime1Lifetime1 = gv.a(-param4, param5, param8, param0, var12Lifetime1Lifetime1, 0, param7, var10Lifetime1Lifetime1Lifetime2, var11Lifetime1Lifetime1, 0);
              }
              if (0 != var10Lifetime1Lifetime1Lifetime2) {
                var12Lifetime1Lifetime1 = gv.a(-param3, param5, param7, param6, var12Lifetime1Lifetime1, 0, param8, var11Lifetime1Lifetime1, var10Lifetime1Lifetime1Lifetime2, 0);
              }
              return var12Lifetime1Lifetime1;
            }
            if (param9 > param7) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime1Lifetime2 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime1Lifetime2) {
                param8 = param8 >> var10Lifetime1Lifetime2;
                param6 = param6 >> var10Lifetime1Lifetime2;
                param3 = param3 >> var10Lifetime1Lifetime2;
              }
              var10Lifetime1Lifetime2Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime1Lifetime2Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime1Lifetime2Lifetime1;
                param0 = param0 >> var10Lifetime1Lifetime2Lifetime1;
                param4 = param4 >> var10Lifetime1Lifetime2Lifetime1;
              }
              var10Lifetime1Lifetime2Lifetime2 = param0 - param7;
              var11Lifetime1Lifetime2 = -param8 + param6;
              var12Lifetime1Lifetime2 = -1;
              if (var11Lifetime1Lifetime2 != 0) {
                var12Lifetime1Lifetime2 = gv.a(0, param5, param8, param0, var12Lifetime1Lifetime2, param1 ^ -15, param7, var10Lifetime1Lifetime2Lifetime2, var11Lifetime1Lifetime2, param4);
              }
              if (var10Lifetime1Lifetime2Lifetime2 != 0) {
                var12Lifetime1Lifetime2 = gv.a(0, param5, param7, param6, var12Lifetime1Lifetime2, 0, param8, var11Lifetime1Lifetime2, var10Lifetime1Lifetime2Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime1Lifetime2 != 0) {
                var12Lifetime1Lifetime2 = gv.a(-param4, param5, param8, param0, var12Lifetime1Lifetime2, 0, param7, var10Lifetime1Lifetime2Lifetime2, var11Lifetime1Lifetime2, 0);
              }
              if (0 != var10Lifetime1Lifetime2Lifetime2) {
                var12Lifetime1Lifetime2 = gv.a(-param3, param5, param7, param6, var12Lifetime1Lifetime2, 0, param8, var11Lifetime1Lifetime2, var10Lifetime1Lifetime2Lifetime2, 0);
              }
              return var12Lifetime1Lifetime2;
            }
            if (param4 < param7) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime1Lifetime3 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime1Lifetime3) {
                param8 = param8 >> var10Lifetime1Lifetime3;
                param6 = param6 >> var10Lifetime1Lifetime3;
                param3 = param3 >> var10Lifetime1Lifetime3;
              }
              var10Lifetime1Lifetime3Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime1Lifetime3Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime1Lifetime3Lifetime1;
                param0 = param0 >> var10Lifetime1Lifetime3Lifetime1;
                param4 = param4 >> var10Lifetime1Lifetime3Lifetime1;
              }
              var10Lifetime1Lifetime3Lifetime2 = param0 - param7;
              var11Lifetime1Lifetime3 = -param8 + param6;
              var12Lifetime1Lifetime3 = -1;
              if (var11Lifetime1Lifetime3 != 0) {
                var12Lifetime1Lifetime3 = gv.a(0, param5, param8, param0, var12Lifetime1Lifetime3, param1 ^ -15, param7, var10Lifetime1Lifetime3Lifetime2, var11Lifetime1Lifetime3, param4);
              }
              if (var10Lifetime1Lifetime3Lifetime2 != 0) {
                var12Lifetime1Lifetime3 = gv.a(0, param5, param7, param6, var12Lifetime1Lifetime3, 0, param8, var11Lifetime1Lifetime3, var10Lifetime1Lifetime3Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime1Lifetime3 != 0) {
                var12Lifetime1Lifetime3 = gv.a(-param4, param5, param8, param0, var12Lifetime1Lifetime3, 0, param7, var10Lifetime1Lifetime3Lifetime2, var11Lifetime1Lifetime3, 0);
              }
              if (0 != var10Lifetime1Lifetime3Lifetime2) {
                var12Lifetime1Lifetime3 = gv.a(-param3, param5, param7, param6, var12Lifetime1Lifetime3, 0, param8, var11Lifetime1Lifetime3, var10Lifetime1Lifetime3Lifetime2, 0);
              }
              return var12Lifetime1Lifetime3;
            }
            if (param6 < param2) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime1Lifetime4 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime1Lifetime4) {
                param8 = param8 >> var10Lifetime1Lifetime4;
                param6 = param6 >> var10Lifetime1Lifetime4;
                param3 = param3 >> var10Lifetime1Lifetime4;
              }
              var10Lifetime1Lifetime4Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime1Lifetime4Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime1Lifetime4Lifetime1;
                param0 = param0 >> var10Lifetime1Lifetime4Lifetime1;
                param4 = param4 >> var10Lifetime1Lifetime4Lifetime1;
              }
              var10Lifetime1Lifetime4Lifetime2 = param0 - param7;
              var11Lifetime1Lifetime4 = -param8 + param6;
              var12Lifetime1Lifetime4 = -1;
              if (var11Lifetime1Lifetime4 != 0) {
                var12Lifetime1Lifetime4 = gv.a(0, param5, param8, param0, var12Lifetime1Lifetime4, param1 ^ -15, param7, var10Lifetime1Lifetime4Lifetime2, var11Lifetime1Lifetime4, param4);
              }
              if (var10Lifetime1Lifetime4Lifetime2 != 0) {
                var12Lifetime1Lifetime4 = gv.a(0, param5, param7, param6, var12Lifetime1Lifetime4, 0, param8, var11Lifetime1Lifetime4, var10Lifetime1Lifetime4Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime1Lifetime4 != 0) {
                var12Lifetime1Lifetime4 = gv.a(-param4, param5, param8, param0, var12Lifetime1Lifetime4, 0, param7, var10Lifetime1Lifetime4Lifetime2, var11Lifetime1Lifetime4, 0);
              }
              if (0 != var10Lifetime1Lifetime4Lifetime2) {
                var12Lifetime1Lifetime4 = gv.a(-param3, param5, param7, param6, var12Lifetime1Lifetime4, 0, param8, var11Lifetime1Lifetime4, var10Lifetime1Lifetime4Lifetime2, 0);
              }
              return var12Lifetime1Lifetime4;
            }
            if (param6 > param3) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime1Lifetime5 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime1Lifetime5) {
                param8 = param8 >> var10Lifetime1Lifetime5;
                param6 = param6 >> var10Lifetime1Lifetime5;
                param3 = param3 >> var10Lifetime1Lifetime5;
              }
              var10Lifetime1Lifetime5Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime1Lifetime5Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime1Lifetime5Lifetime1;
                param0 = param0 >> var10Lifetime1Lifetime5Lifetime1;
                param4 = param4 >> var10Lifetime1Lifetime5Lifetime1;
              }
              var10Lifetime1Lifetime5Lifetime2 = param0 - param7;
              var11Lifetime1Lifetime5 = -param8 + param6;
              var12Lifetime1Lifetime5 = -1;
              if (var11Lifetime1Lifetime5 != 0) {
                var12Lifetime1Lifetime5 = gv.a(0, param5, param8, param0, var12Lifetime1Lifetime5, param1 ^ -15, param7, var10Lifetime1Lifetime5Lifetime2, var11Lifetime1Lifetime5, param4);
              }
              if (var10Lifetime1Lifetime5Lifetime2 != 0) {
                var12Lifetime1Lifetime5 = gv.a(0, param5, param7, param6, var12Lifetime1Lifetime5, 0, param8, var11Lifetime1Lifetime5, var10Lifetime1Lifetime5Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime1Lifetime5 != 0) {
                var12Lifetime1Lifetime5 = gv.a(-param4, param5, param8, param0, var12Lifetime1Lifetime5, 0, param7, var10Lifetime1Lifetime5Lifetime2, var11Lifetime1Lifetime5, 0);
              }
              if (0 != var10Lifetime1Lifetime5Lifetime2) {
                var12Lifetime1Lifetime5 = gv.a(-param3, param5, param7, param6, var12Lifetime1Lifetime5, 0, param8, var11Lifetime1Lifetime5, var10Lifetime1Lifetime5Lifetime2, 0);
              }
              return var12Lifetime1Lifetime5;
            }
            if (param9 > param0) {
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime1Lifetime6 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime1Lifetime6) {
                param8 = param8 >> var10Lifetime1Lifetime6;
                param6 = param6 >> var10Lifetime1Lifetime6;
                param3 = param3 >> var10Lifetime1Lifetime6;
              }
              var10Lifetime1Lifetime6Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime1Lifetime6Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime1Lifetime6Lifetime1;
                param0 = param0 >> var10Lifetime1Lifetime6Lifetime1;
                param4 = param4 >> var10Lifetime1Lifetime6Lifetime1;
              }
              var10Lifetime1Lifetime6Lifetime2 = param0 - param7;
              var11Lifetime1Lifetime6 = -param8 + param6;
              var12Lifetime1Lifetime6 = -1;
              if (var11Lifetime1Lifetime6 != 0) {
                var12Lifetime1Lifetime6 = gv.a(0, param5, param8, param0, var12Lifetime1Lifetime6, param1 ^ -15, param7, var10Lifetime1Lifetime6Lifetime2, var11Lifetime1Lifetime6, param4);
              }
              if (var10Lifetime1Lifetime6Lifetime2 != 0) {
                var12Lifetime1Lifetime6 = gv.a(0, param5, param7, param6, var12Lifetime1Lifetime6, 0, param8, var11Lifetime1Lifetime6, var10Lifetime1Lifetime6Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime1Lifetime6 != 0) {
                var12Lifetime1Lifetime6 = gv.a(-param4, param5, param8, param0, var12Lifetime1Lifetime6, 0, param7, var10Lifetime1Lifetime6Lifetime2, var11Lifetime1Lifetime6, 0);
              }
              if (0 != var10Lifetime1Lifetime6Lifetime2) {
                var12Lifetime1Lifetime6 = gv.a(-param3, param5, param7, param6, var12Lifetime1Lifetime6, 0, param8, var11Lifetime1Lifetime6, var10Lifetime1Lifetime6Lifetime2, 0);
              }
              return var12Lifetime1Lifetime6;
            }
            if (param4 >= param0) {
              return 1 + (1 << param5);
            }
            param8 = param8 - param2;
            param3 = param3 - param2;
            param6 = param6 - param2;
            param0 = param0 - param9;
            param4 = param4 - param9;
            param7 = param7 - param9;
            var10Lifetime1Lifetime7 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
            if (0 < var10Lifetime1Lifetime7) {
              param8 = param8 >> var10Lifetime1Lifetime7;
              param6 = param6 >> var10Lifetime1Lifetime7;
              param3 = param3 >> var10Lifetime1Lifetime7;
            }
            var10Lifetime1Lifetime8 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
            if (var10Lifetime1Lifetime8 > 0) {
              param7 = param7 >> var10Lifetime1Lifetime8;
              param0 = param0 >> var10Lifetime1Lifetime8;
              param4 = param4 >> var10Lifetime1Lifetime8;
            }
            var10Lifetime1Lifetime9 = param0 - param7;
            var11Lifetime1Lifetime7 = -param8 + param6;
            var12Lifetime1Lifetime7 = -1;
            if (var11Lifetime1Lifetime7 != 0) {
              var12Lifetime1Lifetime7 = gv.a(0, param5, param8, param0, var12Lifetime1Lifetime7, param1 ^ -15, param7, var10Lifetime1Lifetime9, var11Lifetime1Lifetime7, param4);
            }
            if (var10Lifetime1Lifetime9 != 0) {
              var12Lifetime1Lifetime7 = gv.a(0, param5, param7, param6, var12Lifetime1Lifetime7, 0, param8, var11Lifetime1Lifetime7, var10Lifetime1Lifetime9, param3);
            }
            param0 = param0 - param4;
            param8 = param8 - param3;
            param7 = param7 - param4;
            if (param1 != -15) {
              hm.g((byte) 96);
            }
            param6 = param6 - param3;
            if (var11Lifetime1Lifetime7 != 0) {
              var12Lifetime1Lifetime7 = gv.a(-param4, param5, param8, param0, var12Lifetime1Lifetime7, 0, param7, var10Lifetime1Lifetime9, var11Lifetime1Lifetime7, 0);
            }
            if (0 != var10Lifetime1Lifetime9) {
              var12Lifetime1Lifetime7 = gv.a(-param3, param5, param7, param6, var12Lifetime1Lifetime7, 0, param8, var11Lifetime1Lifetime7, var10Lifetime1Lifetime9, 0);
            }
            return var12Lifetime1Lifetime7;
          }
          return -1;
        }
        if (param8 <= param3) {
          if (param7 > param4) {
            if (param0 > param4) {
              return -1;
            }
            if (param8 >= param2 &&
              param8 <= param3 &&
              param9 <= param7 &&
              param4 >= param7 &&
              param6 >= param2 &&
              param6 <= param3 &&
              param9 <= param0 &&
              param4 >= param0) {
              return 1 + (1 << param5);
            }
          } else {
            if (param8 >= param2 &&
              param8 <= param3 &&
              param9 <= param7 &&
              param4 >= param7 &&
              param6 >= param2 &&
              param6 <= param3 &&
              param9 <= param0) {
              if (param4 >= param0) {
                return 1 + (1 << param5);
              }
              param8 = param8 - param2;
              param3 = param3 - param2;
              param6 = param6 - param2;
              param0 = param0 - param9;
              param4 = param4 - param9;
              param7 = param7 - param9;
              var10Lifetime2 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
              if (0 < var10Lifetime2) {
                param8 = param8 >> var10Lifetime2;
                param6 = param6 >> var10Lifetime2;
                param3 = param3 >> var10Lifetime2;
              }
              var10Lifetime2Lifetime1 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
              if (var10Lifetime2Lifetime1 > 0) {
                param7 = param7 >> var10Lifetime2Lifetime1;
                param0 = param0 >> var10Lifetime2Lifetime1;
                param4 = param4 >> var10Lifetime2Lifetime1;
              }
              var10Lifetime2Lifetime2 = param0 - param7;
              var11Lifetime2 = -param8 + param6;
              var12Lifetime2 = -1;
              if (var11Lifetime2 != 0) {
                var12Lifetime2 = gv.a(0, param5, param8, param0, var12Lifetime2, param1 ^ -15, param7, var10Lifetime2Lifetime2, var11Lifetime2, param4);
              }
              if (var10Lifetime2Lifetime2 != 0) {
                var12Lifetime2 = gv.a(0, param5, param7, param6, var12Lifetime2, 0, param8, var11Lifetime2, var10Lifetime2Lifetime2, param3);
              }
              param0 = param0 - param4;
              param8 = param8 - param3;
              param7 = param7 - param4;
              if (param1 != -15) {
                hm.g((byte) 96);
              }
              param6 = param6 - param3;
              if (var11Lifetime2 != 0) {
                var12Lifetime2 = gv.a(-param4, param5, param8, param0, var12Lifetime2, 0, param7, var10Lifetime2Lifetime2, var11Lifetime2, 0);
              }
              if (0 != var10Lifetime2Lifetime2) {
                var12Lifetime2 = gv.a(-param3, param5, param7, param6, var12Lifetime2, 0, param8, var11Lifetime2, var10Lifetime2Lifetime2, 0);
              }
              return var12Lifetime2;
            }
          }
        } else {
          if (param3 < param6) {
            return -1;
          }
          if (param7 > param4 &&
            param0 > param4) {
            return -1;
          }
          if (param8 >= param2 &&
            param8 <= param3 &&
            param9 <= param7 &&
            param4 >= param7 &&
            param6 >= param2 &&
            param6 <= param3 &&
            param9 <= param0 &&
            param4 >= param0) {
            return 1 + (1 << param5);
          }
        }
        param8 = param8 - param2;
        param3 = param3 - param2;
        param6 = param6 - param2;
        param0 = param0 - param9;
        param4 = param4 - param9;
        param7 = param7 - param9;
        var10Lifetime3 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
        if (0 < var10Lifetime3) {
          param8 = param8 >> var10Lifetime3;
          param6 = param6 >> var10Lifetime3;
          param3 = param3 >> var10Lifetime3;
        }
        var10Lifetime4 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
        if (var10Lifetime4 > 0) {
          param7 = param7 >> var10Lifetime4;
          param0 = param0 >> var10Lifetime4;
          param4 = param4 >> var10Lifetime4;
        }
        var10Lifetime5 = param0 - param7;
        var11Lifetime3 = -param8 + param6;
        var12Lifetime3 = -1;
        if (var11Lifetime3 != 0) {
          var12Lifetime3 = gv.a(0, param5, param8, param0, var12Lifetime3, param1 ^ -15, param7, var10Lifetime5, var11Lifetime3, param4);
        }
        if (var10Lifetime5 != 0) {
          var12Lifetime3 = gv.a(0, param5, param7, param6, var12Lifetime3, 0, param8, var11Lifetime3, var10Lifetime5, param3);
        }
        param0 = param0 - param4;
        param8 = param8 - param3;
        param7 = param7 - param4;
        if (param1 != -15) {
          hm.g((byte) 96);
        }
        param6 = param6 - param3;
        if (var11Lifetime3 != 0) {
          var12Lifetime3 = gv.a(-param4, param5, param8, param0, var12Lifetime3, 0, param7, var10Lifetime5, var11Lifetime3, 0);
        }
        if (0 != var10Lifetime5) {
          var12Lifetime3 = gv.a(-param3, param5, param7, param6, var12Lifetime3, 0, param8, var11Lifetime3, var10Lifetime5, 0);
        }
        return var12Lifetime3;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        try {
          this.field_j.a(true, (iva) (this));
          if (param3 < 101) {
            field_n = (cn) null;
          }
          jaggl.OpenGL.glPixelStorei(3314, param2);
          jaggl.OpenGL.glTexSubImage2Di(this.field_i, 0, param7, param4, param6, param1, 32993, this.field_j.field_od, param5, param0);
          jaggl.OpenGL.glPixelStorei(3314, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hm.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
          hm.g((byte) -22);
          return param1 / (float)this.field_l;
        }
        return param1 / (float)this.field_l;
    }

    final void a(int param0, byte param1, int param2, byte[] param3, int param4, int param5, ft param6, int param7, int param8) {
        try {
          this.field_j.a(true, (iva) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glPixelStorei(3314, param4);
          jaggl.OpenGL.glTexSubImage2Dub(this.field_i, 0, param0, param8, param7, param2, waa.a(param6, 1383), 5121, param3, param5);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          int var10_int = -48 % ((-62 - param1) / 60);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hm.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public final void a(int param0, hs param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int b(int param0) {
        if (param0 == -7070) {
          return this.field_k;
        }
        int[] var3 = (int[]) null;
        this.a(-114, 19, 79, 107, -106, (int[]) null, -103, 40);
        return this.field_k;
    }

    static {
        field_m = "Off";
    }
}
