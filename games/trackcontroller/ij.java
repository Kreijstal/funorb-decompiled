/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements t {
    private int field_f;
    private int field_n;
    private oh field_i;
    private int field_a;
    private int field_k;
    private int field_b;
    private int field_c;
    private int field_h;
    static ba field_j;
    private int field_l;
    private int field_e;
    private int field_m;
    private int field_g;
    static wg field_d;

    final static void a(byte param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_26_0 = 0;
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
        var14 = TrackController.field_F ? 1 : 0;
        try {
          if (param6 >= param2) {
            return;
          }
          if (1 + param6 >= param4) {
            return;
          }
          if (param6 + 5 < param4 &&
            param1 != param3) {
            var7_int = (param1 >> 1) + (param3 >> 1) + (param1 & param3 & 1);
            if (param0 <= 98) {
              return;
            }
            var8 = param6;
            var9 = param3;
            var10 = param1;
            for (var11 = param6; param4 > var11; var11++) {
              var12 = lf.field_Y[var11];
              if (param5) {
                stackIn_26_0 = g.field_u[var12];
              } else {
                stackIn_26_0 = va.field_e[var12];
              }
              var13 = stackIn_26_0;
              if (var13 <= var7_int) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                lf.field_Y[var11] = lf.field_Y[var8];
                incrementValue$0 = var8;
                var8++;
                lf.field_Y[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              }
            }
            ij.a((byte) 125, var9, param2, param3, var8, param5, param6);
            ij.a((byte) 116, param1, param2, var10, param4, param5, var8);
            return;
          }
          for (var7_intLifetime1 = param4 - 1; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = lf.field_Y[var8Lifetime1];
              var10Lifetime1 = lf.field_Y[1 + var8Lifetime1];
              if (rk.a(var9Lifetime1, (byte) 86, var10Lifetime1, param5)) {
                lf.field_Y[var8Lifetime1] = var10Lifetime1;
                lf.field_Y[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var7), "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != 13809) {
          field_j = (ba) null;
        }
        if (hd.field_p != null) {
          var1 = hd.field_p;
          synchronized (var1) {
            hd.field_p = null;
          }
        }
    }

    final static void a(dh param0, int param1, int param2) {
        try {
          pa.field_c.a((byte) -115, param0);
          if (param2 > -120) {
            ij.b(63);
          }
          me.a(param0, 0, param1);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ij.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != 1) {
          field_j = (ba) null;
          return true;
        }
        return true;
    }

    public static void c(int param0) {
        field_j = null;
        field_d = null;
        if (param0 != -18515) {
          field_d = (wg) null;
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        al stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ed var11 = null;
        try {
          if (param1 instanceof ed) {
            stackIn_3_0 = (al) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (ed) (stackIn_3_0);
          if (var11 != null) {
            param3 = param3 & var11.field_B;
          }
          if (param0 != -24969) {
            return;
          }
          var7 = 5592405;
          ll.c(param1.field_p + param4, param2 + param1.field_m, param1.field_x, param1.field_u, this.field_a);
          if (param3) {
            var7 = 16777215;
          }
          var8 = param1.field_p + param4 + this.field_c;
          var9 = this.field_e + (param2 + param1.field_m);
          ll.a(var8, var9, this.field_l, this.field_m, 5592405);
          ll.c(var8, var9, this.field_l, this.field_m, var7);
          if (var11.field_G) {
            ll.e(var8, var9, var8 + this.field_l, var9 + this.field_m, 1);
            ll.e(var8 + this.field_l, var9, var8, var9 + this.field_m, 1);
          }
          if (this.field_i != null) {
            var10 = this.field_b + (this.field_l + this.field_c);
            this.field_i.a(param1.field_s, var10 + (param1.field_p + param4), this.field_f + (param2 + param1.field_m), param1.field_x + (-this.field_b - var10), param1.field_u - (this.field_b << 1), this.field_n, this.field_k, this.field_h, this.field_g, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("ij.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (param0 > -83) {
          field_j = (ba) null;
        }
        if (224 > kc.field_b) {
          var1 = kc.field_b % 32;
          qd.a(false, 32 + kc.field_b - var1);
        } else {
          qd.a(false, 256);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String stackIn_33_2 = null;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_39_2 = null;
        boolean stackIn_88_0 = false;
        int stackIn_110_0 = 0;
        int stackIn_111_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          di.field_h = param1;
          mh.field_i = true;
          if (di.field_h == 0) {
            var3_int = h.a((byte) -8, r.field_k, sc.field_f, s.field_a, ok.field_C);
            var4 = var3_int + 3;
            sa.field_I = new String[var4];
            mj.field_b = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              mj.field_b[var5] = -1;
            }
            ac.field_c = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              sa.field_I[var5] = ok.field_C[var5];
            }
            sa.field_I[var4 - 3] = "";
            sa.field_I[-2 + var4] = ma.field_a;
            mj.field_b[-2 + var4] = 0;
            ac.field_c[0] = 4;
            sa.field_I[-1 + var4] = me.field_k;
            mj.field_b[-1 + var4] = 1;
            ac.field_c[1] = 5;
          } else if (di.field_h == 1) {
            var3_int = h.a((byte) -8, r.field_k, sc.field_f, s.field_a, ok.field_C);
            var4 = var3_int + 2;
            sa.field_I = new String[var4];
            mj.field_b = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              mj.field_b[var5] = -1;
            }
            ac.field_c = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              sa.field_I[var5] = ok.field_C[var5];
            }
            sa.field_I[-2 + var4] = "";
            sa.field_I[var4 - 1] = me.field_k;
            mj.field_b[-1 + var4] = 0;
            ac.field_c[0] = 5;
          } else if (di.field_h != 2) {
            if (di.field_h == 3) {
              if (!rg.field_c.field_l) {
                var3_int = h.a((byte) -8, r.field_k, sc.field_f, bf.field_c, ok.field_C);
              } else {
                var3_int = h.a((byte) -8, r.field_k, sc.field_f, lj.field_b, ok.field_C);
              }
              var4 = var3_int + 2;
              mj.field_b = new int[var4];
              sa.field_I = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                mj.field_b[var5] = -1;
              }
              ac.field_c = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                sa.field_I[var5] = ok.field_C[var5];
              }
              sa.field_I[-2 + var4] = "";
              sa.field_I[-1 + var4] = me.field_k;
              mj.field_b[var4 - 1] = 0;
              ac.field_c[0] = 5;
            } else if (di.field_h == 4) {
              var3_int = h.a((byte) -8, r.field_k, sc.field_f, fj.field_O, ok.field_C);
              var4 = 2 + var3_int;
              sa.field_I = new String[var4];
              mj.field_b = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                mj.field_b[var5] = -1;
              }
              ac.field_c = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                sa.field_I[var5] = ok.field_C[var5];
              }
              sa.field_I[-2 + var4] = "";
              sa.field_I[-1 + var4] = me.field_k;
              mj.field_b[-1 + var4] = 0;
              ac.field_c[0] = 5;
            } else {
              if (di.field_h != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = h.a((byte) -8, r.field_k, sc.field_f, cg.field_e, ok.field_C);
              var4 = var3_int + 3;
              sa.field_I = new String[var4];
              mj.field_b = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                mj.field_b[var5] = -1;
              }
              ac.field_c = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                sa.field_I[var5] = ok.field_C[var5];
              }
              sa.field_I[-3 + var4] = "";
              sa.field_I[-2 + var4] = vk.field_i;
              mj.field_b[-2 + var4] = 0;
              ac.field_c[0] = 3;
              sa.field_I[-1 + var4] = me.field_k;
              mj.field_b[var4 - 1] = 1;
              ac.field_c[1] = 5;
            }
          } else {
            var3_int = h.a((byte) -8, r.field_k, sc.field_f, dh.a((byte) -64, new String[]{"<br><%0><br>"}, mc.field_J), ok.field_C);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ok.field_C[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            el.field_O = new String[var4];
            pd.a(ok.field_C, 0, el.field_O, 0, var4);
            bk.field_J = new String[-1 + var3_int - var4];
            pd.a(ok.field_C, var4 + 1, bk.field_J, 0, var3_int - var4 - 1);
            var3_int = h.a((byte) -8, r.field_k, sc.field_f, dh.a((byte) -61, new String[]{"<br><%0><br>"}, le.field_a), ok.field_C);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ok.field_C[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            jf.field_i = new String[var4];
            pd.a(ok.field_C, 0, jf.field_i, 0, var4);
            ue.field_c = new String[-var4 + var3_int - 1];
            pd.a(ok.field_C, 1 + var4, ue.field_c, 0, -1 + (var3_int - var4));
            if (jf.field_i.length > el.field_O.length) {
              stackIn_22_0 = jf.field_i.length;
            } else {
              stackIn_22_0 = el.field_O.length;
            }
            var5 = stackIn_22_0;
            if (ue.field_c.length <= bk.field_J.length) {
              stackIn_25_0 = bk.field_J.length;
            } else {
              stackIn_25_0 = ue.field_c.length;
            }
            var6 = stackIn_25_0;
            var7 = var6 + var5 + 7;
            mj.field_b = new int[var7];
            sa.field_I = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              mj.field_b[var8] = -1;
            }
            sa.field_I[1] = lf.field_U;
            ac.field_c = new int[2];
            sa.field_I[0] = lg.field_c;
            mj.field_b[1] = 0;
            ac.field_c[1] = 2;
            mj.field_b[3] = 1;
            sa.field_I[2] = ji.field_d;
            sa.field_I[4] = uh.field_d;
            sa.field_I[3] = uk.field_e;
            sa.field_I[5] = "";
            ac.field_c[0] = 5;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_32_0 = sa.field_I;
              stackIn_32_1 = var8Lifetime2 + 6;
              if (jf.field_i.length + (var8Lifetime2 - var5) >= 0) {
                stackIn_33_2 = jf.field_i[var8Lifetime2 + jf.field_i.length - var5];
              } else {
                stackIn_33_2 = "";
              }
              stackIn_32_0[stackIn_32_1] = stackIn_33_2;
            }
            sa.field_I[var5 + 6] = null;
            mj.field_b[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_38_0 = sa.field_I;
              stackIn_38_1 = var8Lifetime3 + (var5 + 7);
              if (ue.field_c.length <= var8Lifetime3) {
                stackIn_39_2 = "";
              } else {
                stackIn_39_2 = ue.field_c[var8Lifetime3];
              }
              stackIn_38_0[stackIn_38_1] = stackIn_39_2;
            }
            fe.field_N = qg.a(false);
          }
          vi.field_f.field_i = ac.field_c.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < sa.field_I.length; var4Lifetime1++) {
            stackIn_88_0 = !(mj.field_b[var4Lifetime1] < 0);
            var5Lifetime1 = ib.a(stackIn_88_0, 10, sa.field_I[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == di.field_h) {
            var10 = el.field_O;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = ib.a(false, 10, var11);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = bk.field_J;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = ib.a(false, 10, var12);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          cd.field_b = var3_intLifetime1 + (sf.field_F - (var3_intLifetime1 >> 1));
          bk.field_D = -(var3_intLifetime1 >> 1) + sf.field_F;
          oi.field_b = vi.field_f.field_i * (na.field_e + of.field_f << 1);
          for (var4Lifetime2 = 0; var4Lifetime2 < sa.field_I.length; var4Lifetime2++) {
            stackIn_110_0 = oi.field_b;
            if (mj.field_b[var4Lifetime2] < 0) {
              stackIn_111_1 = dh.field_l;
            } else {
              stackIn_111_1 = pc.field_m;
            }
            oi.field_b = stackIn_110_0 + stackIn_111_1;
          }
          if (param0 < 48) {
            field_j = (ba) null;
          }
          me.field_q = gf.field_q - (oi.field_b >> 1);
          ud.field_a = new int[sa.field_I.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = me.field_q;
          while (sa.field_I.length > var4Lifetime3) {
            var6Lifetime1 = mj.field_b[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + dh.field_l;
            } else {
              var7Lifetime2 = ib.a(true, 10, sa.field_I[var4Lifetime3]);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + sf.field_F;
              var5Lifetime3 = var5Lifetime3 + na.field_e;
              ud.field_a[var4Lifetime3] = new int[4];
              ud.field_a[var4Lifetime3][0] = -mb.field_c + var8Lifetime1;
              ud.field_a[var4Lifetime3][1] = var5Lifetime3;
              ud.field_a[var4Lifetime3][2] = (mb.field_c << 1) + var7Lifetime2;
              ud.field_a[var4Lifetime3][3] = pc.field_m + (of.field_f << 1);
              var5Lifetime3 = var5Lifetime3 + (na.field_e + ((of.field_f << 1) + pc.field_m));
            }
            var4Lifetime3++;
          }
          if (di.field_h == 2) {
            vi.field_f.a(-1, -1, param2, 113);
          } else {
            vi.field_f.a(0, mg.b(fg.field_a, 0, kf.field_b), param2, 106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var3), "ij.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ij(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_h = 1;
        this.field_g = 1;
        try {
          this.field_a = param9;
          this.field_n = param3;
          this.field_e = param6;
          this.field_i = param0;
          this.field_b = param1;
          this.field_l = param8;
          this.field_m = param7;
          this.field_k = param4;
          this.field_f = param2;
          this.field_c = param5;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_j = new ba();
    }
}
