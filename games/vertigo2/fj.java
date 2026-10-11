/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fj extends rl implements ij {
    static int[] field_lb;
    private boolean field_jb;
    private boolean field_kb;
    private boolean field_gb;
    private we field_fb;
    private cc field_mb;
    static String field_hb;
    private boolean field_ib;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param5 >= param2) {
            return;
          }
          if (param0 <= 1 + param5) {
            return;
          }
          if (param0 > param5 + 5 &&
            param4 != param3) {
            var7_int = (param4 >> 1) + (param3 >> 1) + (param3 & param4 & 1);
            var8 = param5;
            var9 = param4;
            var10 = param3;
            for (var11 = param5; var11 < param0; var11++) {
              var12 = ac.field_I[var11];
              if (param6) {
                stackIn_24_0 = on.field_e[var12];
              } else {
                stackIn_24_0 = hm.field_A[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int < var13) {
                ac.field_I[var11] = ac.field_I[var8];
                incrementValue$0 = var8;
                var8++;
                ac.field_I[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            fj.a(var8, param1 + 0, param2, var9, param4, param5, param6);
            fj.a(param0, param1, param2, param3, var10, var8, param6);
            return;
          }
          for (var7_intLifetime1 = param0 - 1; param5 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = ac.field_I[var8Lifetime1];
              var10Lifetime1 = ac.field_I[1 + var8Lifetime1];
              if (eg.a(param6, var9Lifetime1, (byte) 98, var10Lifetime1)) {
                ac.field_I[var8Lifetime1] = var10Lifetime1;
                ac.field_I[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "fj.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    fj(sd param0, cc param1, String param2, boolean param3, boolean param4) {
        super(param0, new rh((fj) null, param1, param2), 77, 10, 10);
        try {
          this.field_kb = false;
          this.field_jb = param4 ? true : false;
          this.field_mb = param1;
          this.field_gb = false;
          this.field_ib = param3 ? true : false;
          this.field_fb = new we(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_fb.field_F = true;
          this.c((byte) -14, this.field_fb);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != param1) {
            stackIn_4_0 = super.a(param0, 13, param2, param3);
            return stackIn_4_0;
          }
          this.h((byte) 85);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("fj.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static aa a(cr param0, cr param1, ud param2, int param3, cr param4) {
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        aa stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        aa[] var11 = null;
        int var12 = 0;
        ud var13_ref_ud = null;
        int var13 = 0;
        int var15 = 0;
        q var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2 == null) {
            return null;
          }
          if (param2.field_C == null) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = param2.field_C.length;
          }
          var5_int = stackIn_7_0;
          if (null != param2.field_z) {
            stackIn_10_0 = param2.field_z.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var6 + var5_int;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new aa[var7];
          if (null != param2.field_C) {
            for (var12 = 0; var12 < param2.field_C.length; var12++) {
              var13_ref_ud = ni.field_d.a(param2.field_C[var12], true);
              var8[var12] = var13_ref_ud.field_D;
              var9[var12] = param2.field_v[var12];
              var11[var12] = fj.a(param0, param1, var13_ref_ud, 10, param4);
            }
          }
          if (param3 != 10) {
            fj.a(118, 81, -122, 27, -116, -20, false);
          }
          if (null != param2.field_z) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param2.field_z.length > var14; var14++) {
              var15 = param2.field_z[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = br.field_W;
                var9[var12Lifetime1 + var14] = param2.field_u[var14];
                var10[var12Lifetime1 + var14] = param2.field_z[var14];
              } else {
                var16 = wm.field_k.a(1, var15);
                var8[var14 + var12Lifetime1] = var16.h(tk.a(param3, 43));
                var9[var12Lifetime1 + var14] = param2.field_u[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param2.field_z[var14];
              }
            }
          }
          stackIn_27_0 = new aa(0L, param0, param4, param1, var11, var20, var8, var21);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("fj.TA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final void h(byte param0) {
        if (param0 < 55) {
          fj.g((byte) 127);
        }
        if (!this.field_I) {
          return;
        }
        this.field_I = false;
        if (this.field_ib) {
          sm.k(-14284);
        } else {
          if (this.field_jb) {
            sg.a(3);
          }
        }
    }

    final void m(int param0) {
        this.field_fb.b(param0, -113, 4210752);
        rh var2 = new rh(this, this.field_mb, qk.field_H);
        var2.a(gb.field_a, 15, -102);
        this.a(false, var2);
    }

    public void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          var6_int = 0 % ((param2 + 63) / 51);
          if (!this.field_kb) {
            gg.a("tochangedisplayname.ws", true, ob.e((byte) 77));
          } else {
            rh.b(-14, 3);
            this.h((byte) 93);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("fj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void n(int param0) {
        int var1 = 106 / ((param0 + 20) / 39);
        field_lb = null;
        field_hb = null;
    }

    final void a(int param0, boolean param1, String param2) {
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        rh stackIn_15_0 = null;
        String stackIn_16_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rh var6 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_gb) {
            return;
          }
          stackIn_6_1 = (param1);
          this.field_gb = stackIn_6_1;
          stackIn_9_1 = (param0 == 256);
          this.field_kb = stackIn_9_1;
          this.field_fb.b(8405024, -117, 4210752);
          var6 = new rh(this, this.field_mb, param2);
          var4 = var6;
          if (5 != param0) {
            if (256 != param0) {
              stackIn_15_0 = var6;
              if (this.field_ib) {
                stackIn_16_1 = bk.field_d;
              } else {
                stackIn_16_1 = ap.field_f;
              }
              ((rh) (Object) stackIn_15_0).a(stackIn_16_1, -1, -60);
            } else {
              var6.a(bk.field_d, (uf) (this), -109);
            }
          } else {
            var6.a(jb.field_A, 11, -66);
            var6.a(jd.field_b, 17, -60);
          }
          if (3 != param0) {
            if (param0 != 4) {
              if (6 == param0) {
                var6.a(hm.field_H, 9, -90);
              } else {
                if (param0 == 9) {
                  var6.a(s.field_v, (uf) (this), -126);
                }
              }
            } else {
              var6.a(so.field_z, 8, -58);
            }
          } else {
            var6.a(hb.field_o, 7, -82);
          }
          this.a(false, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("fj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void g(byte param0) {
        km.a(af.field_H, true, true, mk.field_S);
        int var1 = 68 % ((-79 - param0) / 44);
        bf.field_a = true;
    }

    static {
        field_hb = "Mouse over an icon for details";
    }
}
