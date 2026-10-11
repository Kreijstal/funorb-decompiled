/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq implements iq {
    static String field_c;
    static int[] field_j;
    static int field_i;
    static int field_e;
    static qr field_b;
    private nq field_f;
    static bc field_g;
    static String field_h;
    private int field_a;
    private int field_d;

    public static void b(int param0) {
        field_c = null;
        if (param0 >= -47) {
          return;
        }
        try {
          field_h = null;
          field_g = null;
          field_j = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "rq.B(" + param0 + ')');
        }
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param0.field_k &&
            !param0.f(1)) {
            stackIn_8_0 = 2188450;
          } else {
            stackIn_8_0 = 3249872;
          }
          var6_int = stackIn_8_0;
          this.field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_s + "</u>", param1 + param0.field_m, param3 + param0.field_q, param0.field_x, param0.field_n, var6_int, -1, this.field_a, this.field_d, this.field_f.field_q + this.field_f.field_J);
          if (param0.f(1)) {
            var7 = this.field_f.c(param0.field_s);
            var8 = this.field_f.field_J + this.field_f.field_q;
            var9 = param0.field_m + param1;
            boolean decompiledSharedTail0 = (this.field_a != 2);
            if (!decompiledSharedTail0) {
              var9 = var9 + (-var7 + param0.field_x);
              decompiledSharedTail0 = (var11 != 0);
            }
            if ((decompiledSharedTail0) &&
              (this.field_a == 1)) {
              var9 = var9 + (-var7 + param0.field_x >> 1);
            }
            var10 = param0.field_q + param3;
            if (this.field_d != 2) {
              if (this.field_d == 1) {
                var10 = var10 + (-var8 + param0.field_n >> 1);
                if (var11 != 0) {
                  var10 = var10 + (param0.field_n - var8);
                }
              }
            } else {
              var10 = var10 + (param0.field_n - var8);
            }
            dd.a(var8, 1, var7 + 4, -2 + var9, var10 + 2);
          }
          if (param4 != 12) {
            rq.a(true, -120, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("rq.E(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static bi[] a(int param0) {
        bi[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        bi[] stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1 = new bi[en.field_c];
          var2 = 0;
          L0: while (true) {
            if (var2 < en.field_c) {
              var3 = mc.field_s[var2] * cm.field_g[var2];
              var4 = hd.field_q[var2];
              var5 = new int[var3];
              stackIn_13_0 = 0;
              if (var7 != 0) {
                break L0;
              }
              var6 = stackIn_13_0;
              while (var6 < var3) {
                var5[var6] = eo.field_fb[we.a(255, (int) var4[var6])];
                var6++;
              }
              var1[var2] = new bi(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], var5);
              var2++;
              continue L0;
            }
            stackIn_13_0 = param0 + param0;
            break;
          }
          pd.a(stackIn_13_0);
          stackIn_14_0 = var1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "rq.C(" + param0 + ')');
        }
    }

    final static ve a(boolean param0, int param1, boolean param2) {
        ub stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_5_3 = false;
        qr stackIn_46_0 = null;
        String stackIn_47_1 = null;
        qr stackIn_50_0 = null;
        String stackIn_51_1 = null;
        int stackIn_55_0 = 0;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        pf var4 = null;
        Object var5 = null;
        Object var6 = null;
        ve var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        fc var17 = null;
        String var18 = null;
        int var19 = 0;
        fc var17Lifetime1;
        String var18Lifetime1;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          stackIn_4_0 = d.field_a.field_Db;
          stackIn_4_1 = param1 * ((cr.field_c + 2) * 3);
          stackIn_4_2 = cr.field_c + 2;
          stackIn_5_3 = (hp.field_l == d.field_a.field_Db);
          var3_int = ((ub) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_5_3, -103, param2, 2) ? 1 : 0;
          var4 = d.field_a.field_Eb.field_M;
          if (!param0) {
            field_e = 100;
          }
          boolean decompiledFrameRemainder0 = true;
          var5 = null;
          if (2 != po.field_b) {
            cg.field_A.field_s = false;
            rj.field_p.field_z = ea.field_d;
            if (po.field_b == 1) {
              d.field_a.field_Db.field_zb.field_z = km.field_X;
              if (var19 != 0) {
                d.field_a.field_Db.field_zb.field_z = tb.field_c;
              }
            } else {
              d.field_a.field_Db.field_zb.field_z = tb.field_c;
            }
            fj.a(!param0, d.field_a.field_Eb);
            decompiledFrameRemainder0 = (var19 != 0);
          }
          if (decompiledFrameRemainder0) {
            cg.field_A.field_s = true;
            rj.field_p.field_z = re.a(af.field_b, 4371, new String[]{jo.field_d});
            d.field_a.field_Db.field_zb.field_z = null;
            var6 = null;
            var7 = (ve) (var4.d(0));
            while (true) {
              if (var7 != null) {
                var8 = 0;
                if (var19 == 0) {
                  if (null == var7.field_M) {
                    var7.field_Cb = new qr(0L, ek.field_E);
                    var7.a(4, var7.field_Cb);
                    var7.field_Fb = new qr(0L, oj.field_zb);
                    var7.a(4, var7.field_Fb);
                    var7.field_Db = new qr(0L, ek.field_E);
                    var7.a(4, var7.field_Db);
                    var7.field_Fb.field_y = 2;
                    var8 = 1;
                    var7.e((byte) -125);
                  }
                  var7.field_K = d.field_a.field_Eb.field_K;
                  var9 = 0;
                  if (var7.field_xb == null) {
                    var10 = 13369344;
                    var11 = 16737894;
                  } else if (jo.field_d == var7.field_xb) {
                    var11 = 6750054;
                    var10 = 52224;
                  } else {
                    var10 = 13421568;
                    var11 = 16777062;
                  }
                  var12 = 0;
                  if (var7.field_Bb != null &&
                    !var7.field_Bb.equals("")) {
                    var7.field_Db.field_pb = ke.field_i;
                    var7.field_Db.field_jb = var11;
                    var7.field_Db.a(ke.field_i.field_o + 3, cr.field_c, (byte) 88, var9, 0);
                    var12 = 1;
                  }
                  var7.field_Fb.field_x = var10;
                  var7.field_Cb.field_x = var10;
                  var7.field_Fb.field_jb = var11;
                  var7.field_Cb.field_jb = var11;
                  var7.field_Fb.field_qb = var11;
                  var7.field_Cb.field_qb = var11;
                  var7.field_Fb.field_ab = var11;
                  var7.field_Cb.field_ab = var11;
                  var13 = 0;
                  var14 = -2 + var7.field_K - 80;
                  if (var12 != 0) {
                    var13 = 3 + ke.field_i.field_o;
                    var14 = var14 - var13;
                  }
                  stackIn_46_0 = var7.field_Cb;
                  if (var14 > 0) {
                    stackIn_47_1 = nq.a(var7.field_Cb.field_nb, var7.field_Ab, var14);
                  } else {
                    stackIn_47_1 = var7.field_Ab;
                  }
                  stackIn_46_0.field_z = stackIn_47_1;
                  var7.field_Cb.a(var14, cr.field_c, (byte) 110, var9, var13);
                  stackIn_50_0 = var7.field_Fb;
                  if (null != var7.field_xb) {
                    stackIn_51_1 = var7.field_xb;
                  } else {
                    stackIn_51_1 = jj.field_p;
                  }
                  stackIn_50_0.field_z = stackIn_51_1;
                  var7.field_Fb.a(80, cr.field_c, (byte) 109, var9, -80 + var7.field_K);
                  stackIn_55_0 = (var7.field_Cb.field_z.equals(var7.field_Ab)) ? 0 : 1;
                  var15 = stackIn_55_0;
                  var9 = var9 + cr.field_c;
                  if (var3_int == 0) {
                    var7.field_gb = -var7.field_mb + var9;
                  }
                  if (var8 != 0) {
                    d.field_a.field_Eb.a(2, (qr) (var6), var7, (byte) 98);
                  }
                  if (var7.field_Db == null ||
                    !var7.field_Db.field_L) {
                    if (var7.field_rb != 0) {
                      var16 = var7.field_Ab;
                      tp.a((int[]) null, 0L, (String) null, var16, 293, d.field_a.field_Db, var7, -1, -1);
                      if (null != var7.field_xb &&
                        !fs.a(62, hp.field_m.field_k) &&
                        !bg.field_g) {
                        if (!ae.field_b) {
                          var17 = hp.field_m;
                          var18 = re.a(tk.field_B, 4371, new String[]{var16});
                          var17.field_j.a(1, 8, var18);
                        }
                        var17Lifetime1 = hp.field_m;
                        var18Lifetime1 = re.a(se.field_e, 4371, new String[]{var16});
                        var17Lifetime1.field_j.a(1, 18, var18Lifetime1);
                      }
                      var5 = var7;
                    } else if (var7.field_Cb.field_L &&
                      var15 != 0) {
                      dn.field_k = var7.field_Ab;
                    }
                  } else {
                    dn.field_k = var7.field_Bb;
                  }
                  var6 = var7;
                  var7 = (ve) (var4.a((byte) -71));
                  continue;
                }
              } else {
                if (d.field_a.field_Fb.field_rb != 0) {
                  lg.field_e = new jp(d.field_a.field_Fb.field_B, d.field_a.field_Fb.field_N, d.field_a.field_Fb.field_K, d.field_a.field_Fb.field_mb, km.field_A, h.field_v, ii.field_u, ii.field_u);
                  ia.field_b = 0;
                }
              }
              if (0 == d.field_a.field_yb.field_rb) {
                break;
              }
              lg.field_e = new jp(d.field_a.field_yb.field_B, d.field_a.field_yb.field_N, d.field_a.field_yb.field_K, d.field_a.field_yb.field_mb, on.field_f, h.field_v, ii.field_u, ii.field_u);
              ia.field_b = 1;
              break;
            }
          }
          stackIn_102_0 = var5;
          return (ve) (stackIn_102_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "rq.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public rq() {
        try {
          this.field_f = gn.field_u;
          this.field_a = 1;
          this.field_d = 1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "rq.<init>()");
        }
    }

    rq(nq param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param0;
          this.field_a = param1;
          this.field_d = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rq.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          mg.field_C = false;
          var1_int = -1 / ((-28 - param0) / 57);
          tl.field_z = null;
          if (el.field_b) {
            ji.field_G.p(-7011);
            if (var3 == 0) {
              return;
            }
          }
          var2 = tf.field_n;
          if (var2 > 0) {
            if (1 != var2) {
              tl.field_z = re.a(ia.field_M, 4371, new String[]{Integer.toString(var2)});
            }
            if (1 == var2 ||
              var3 != 0) {
              tl.field_z = kf.field_h;
            }
            tl.field_z = lr.a(88, new CharSequence[]{(CharSequence) ((Object) tl.field_z), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) pr.field_b)});
          }
          ji.field_G.i((byte) -104);
          ig.a(7655);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "rq.A(" + param0 + ')');
        }
    }

    static {
        field_i = 0;
        field_e = 0;
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_h = "Waiting for fonts";
        field_c = "Fleets lost";
    }
}
