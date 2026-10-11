/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static int[] field_a;
    static int field_b;
    static byte[] field_c;

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 4) {
          field_c = (byte[]) null;
        }
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pc var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hf var12 = null;
        pc var13 = null;
        int[] var14 = null;
        mc var15 = null;
        Object var16 = null;
        mc var16_ref = null;
        int[] var17 = null;
        var16 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var13 = vi.field_o;
          if (param0 < 120) {
            field_a = (int[]) null;
          }
          var2 = var13.f(255);
          if (var2 == 0) {
            var11 = bf.a(false);
            var17 = var11;
            var14 = var17;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((we) ((Object) var5)).f(255);
            for (var7 = 0; var6 > var7; var7++) {
              var10[var7] = ((we) ((Object) var5)).k(0);
            }
            var15 = (mc) (tj.field_z.c(1504642273));
            if (var15 == null) {
              na.a(true);
              return;
            }
            var15.field_p = true;
            var15.field_s = var17[0];
            var15.field_l = var3;
            var15.c(2779);
            return;
          }
          if (var2 != 1) {
            if (var2 != 2) {
              jo.a(1, "A1: " + jm.b(-79), (Throwable) null);
              na.a(true);
            } else {
              var16_ref = (mc) (tj.field_z.c(1504642273));
              if (var16_ref == null) {
                na.a(true);
                return;
              }
              var16_ref.field_l = bf.a(false);
              var16_ref.field_p = true;
              var16_ref.field_s = var16_ref.field_l[0];
              var16_ref.c(2779);
            }
          } else {
            var12 = (hf) (dh.field_a.c(1504642273));
            if (var12 == null) {
              na.a(true);
              return;
            }
            var12.c(2779);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "la.I(" + param0 + ')');
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 != 10) {
            field_a = (int[]) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + var5 - 65);
            } else if ((var5 < 97 ||
              122 < var5) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("la.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          try {
            if (!cb.field_p.startsWith("win")) {
              return false;
            }
            if (param1 != -31451) {
              field_c = (byte[]) null;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("la.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ak b(byte param0) {
        if (param0 > -84) {
          la.a((byte) -93);
        }
        return aj.field_k.field_Fb;
    }

    final static void a(int param0, int param1, gp param2, int param3, boolean param4) {
        int var27_int = 0;
        gp stackIn_45_0 = null;
        boolean stackIn_45_1 = false;
        boolean stackIn_46_2 = false;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        ak stackIn_97_0;
        int stackIn_97_1;
        int stackIn_97_2;
        int stackIn_97_3;
        int stackIn_97_4;
        int stackIn_98_5 = 0;
        RuntimeException stackIn_223_0 = null;
        StringBuilder stackIn_223_1 = null;
        String stackIn_224_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        bb var10 = null;
        int var11_int = 0;
        Object var11 = null;
        uj var12 = null;
        int var13 = 0;
        ak var14 = null;
        ak var15 = null;
        ak var16 = null;
        ak var17 = null;
        ak var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null != io.field_c && (null != jm.field_r ||
            null != w.field_z ||
            null != pa.field_a ||
            oo.field_e != null)) {
            for (var9 = 0; fj.field_b > var9; var9++) {
              var10_int = io.field_c.field_Eb[var9] & 255;
              if (jm.field_r != null &&
                jm.field_r[var9] != null &&
                jm.field_r[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != w.field_z &&
                null != w.field_z[var9]) {
                var11_int = w.field_z[var9][var10_int];
                if (0 != var11_int &&
                  !fe.field_a) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              if (oo.field_e != null &&
                oo.field_e[var9] != null) {
                var8 = var8 | oo.field_e[var9][var10_int];
              }
              if (pa.field_a != null &&
                pa.field_a[var9] != null) {
                var11_intLifetime1 = pa.field_a[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !fe.field_a) {
                  var5_int = 1;
                }
              }
            }
          }
          stackIn_45_0 = (gp) (param2);
          stackIn_45_1 = param4;
          stackIn_46_2 = (bj.field_d == param2);
          stackIn_49_0 = (!((gp) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_46_2, 2, (fq.field_q * 4 + 8) * param3, 0, 2 * fq.field_q + 4)) ? 0 : 1;
          var9Lifetime1 = stackIn_49_0;
          var10 = param2.field_Fb.field_L;
          var11 = null;
          var12 = (uj) (var10.c(1504642273));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_L == null) {
              var12.field_Hb = new ak(0L, ak.field_T);
              var12.a(var12.field_Hb, (byte) 26);
              var12.field_Gb = new ak(0L, of.field_i);
              if (f.field_n) {
                var12.a(var12.field_Gb, (byte) 26);
              }
              var12.field_Gb.field_Bb = 2;
              var12.field_Sb = new ak(0L, mg.field_h);
              var12.a(var12.field_Sb, (byte) 26);
              var12.h(-257);
              var12.field_Zb = new ak(0L, ul.field_p);
              var12.a(var12.field_Zb, (byte) 26);
              var12.field_Mb = new ak(0L, ge.field_h);
              var12.a(var12.field_Mb, (byte) 26);
              var13 = 1;
            }
            var12.field_Hb.field_cb = null;
            var14 = var12.field_Hb;
            var12.field_Hb.field_nb = 0;
            var14.field_K = 0;
            var12.field_Gb.field_cb = null;
            var15 = var12.field_Gb;
            var12.field_Gb.field_nb = 0;
            var15.field_K = 0;
            var12.field_Zb.field_cb = null;
            var12.field_Zb.field_nb = 0;
            var16 = var12.field_Zb;
            var12.field_Mb.field_cb = null;
            var16.field_K = 0;
            var12.field_Mb.field_nb = 0;
            var17 = var12.field_Mb;
            var17.field_K = 0;
            var12.field_Sb.field_cb = null;
            var12.field_Sb.field_nb = 0;
            var18 = var12.field_Sb;
            var18.field_K = 0;
            var12.field_K = param2.field_Fb.field_K;
            var19 = 0;
            var32 = var12.field_Fb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (jm.field_b == param2) {
              var21 += 42;
            }
            var33 = jl.a(var12.field_Hb.field_Db, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_61_0 = (var33.equals(var12.field_Fb)) ? 0 : 1;
            var22 = stackIn_61_0;
            if (4 <= var12.field_Qb) {
              var20 = "<img=" + (-4 + var12.field_Qb + kk.field_s) + ">" + var33;
            } else {
              if (var12.field_Qb > 0) {
                var20 = "<img=" + (var12.field_Qb - 1) + ">" + var33;
              }
            }
            var12.field_Hb.field_cb = var20;
            if (!var12.b((byte) -114)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Xb ||
                (!(var6 <= var12.field_Rb) ||
                !(var12.field_Yb >= var7) ||
                !((~var12.field_Ib & var8) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_Zb.field_N = var23_int;
              var12.field_Gb.field_N = var23_int;
              var12.field_Hb.field_N = var23_int;
              var12.field_Hb.field_Cb = var24_int;
              var12.field_Hb.field_pb = var24_int;
              var12.field_Hb.field_y = var24_int;
              var12.field_Gb.field_Cb = var24_int;
              var12.field_Gb.field_pb = var24_int;
              var12.field_Gb.field_y = var24_int;
              var12.field_Zb.field_Cb = var24_int;
              var12.field_Zb.field_pb = var24_int;
              var12.field_Zb.field_y = var24_int;
              if (param2 == ae.field_c) {
                if (!io.field_c.field_dc) {
                  var12.field_Mb.field_cb = pf.field_m;
                }
              } else {
                if (var12.field_Vb) {
                  var12.field_Hb.field_cb = sd.a(gf.field_e, 111, new String[]{var20});
                  var12.field_Mb.field_cb = fa.field_f;
                } else {
                  if (var12.field_Jb) {
                    var12.field_Hb.field_cb = sd.a(ud.field_O, 58, new String[]{var20});
                    var12.field_Zb.field_cb = fh.field_M;
                    var12.field_Mb.field_cb = u.field_e;
                  } else {
                    var12.field_Zb.field_cb = ih.field_b;
                  }
                }
              }
              var25_int = 0;
              if (io.field_c != null &&
                pl.m(99) &&
                hn.field_f != var12.field_Nb) {
                if (null != var12.field_Zb.field_cb) {
                  var26 = var12.field_Zb.g(0) + v.field_c * 2;
                  var12.field_Zb.a(var19, fq.field_q, var25_int, 256, var26);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Mb.field_cb) {
                  if (param2 == ae.field_c) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Mb.g(0) + 2 * v.field_c;
                  }
                  var12.field_Mb.a(var19, fq.field_q, var25_int, 256, var26Lifetime2);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_97_0 = var12.field_Hb;
              stackIn_97_1 = var19;
              stackIn_97_2 = fq.field_q;
              stackIn_97_3 = var25_int;
              stackIn_97_4 = 256;
              if (!f.field_n) {
                stackIn_98_5 = 0;
              } else {
                stackIn_98_5 = 42;
              }
              ((ak) (Object) stackIn_97_0).a(stackIn_97_1, stackIn_97_2, stackIn_97_3, stackIn_97_4, -stackIn_98_5 + var12.field_K - var25_int);
              var12.field_Gb.field_cb = Integer.toString(var12.field_Rb);
              var12.field_Gb.a(var19, fq.field_q, var12.field_K - 40, 256, 40);
              if (var12.field_Hb.field_W &&
                var22 != 0) {
                up.field_o = var12.field_Fb;
                if (gi.field_d != null &&
                  gi.field_d[var12.field_Qb] != null) {
                  up.field_o = up.field_o + " - " + gi.field_d[var12.field_Qb];
                }
              } else {
                if (var12.field_Hb.field_W &&
                  null != gi.field_d &&
                  gi.field_d[var12.field_Qb] != null) {
                  up.field_o = gi.field_d[var12.field_Qb];
                }
              }
              var19 = var19 + fq.field_q;
            }
            var23 = on.a(var12.field_Eb, var20, -17279);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Sb.field_Db.b(var23, -v.field_c + (var12.field_K - v.field_c));
              var12.field_Sb.field_cb = var23;
              var12.field_Sb.field_yb = var12.field_Tb * 256 / mh.field_b;
              var12.field_Sb.a(var19, fq.field_q * var24_intLifetime1, v.field_c, 256, var12.field_K - v.field_c * 2);
              var19 = var19 + var24_intLifetime1 * fq.field_q;
            }
            if (var9Lifetime1 == 0) {
              var12.field_Z = -var12.field_nb + var19;
            }
            if (var13 != 0) {
              param2.field_Fb.a(var12, 2, -1, (ak) (var11));
            }
            if (var12.field_P != 0 &&
              !var12.b((byte) -89)) {
              if (var12.field_Zb.field_P == 0) {
                if (0 == var12.field_Mb.field_P) {
                  oi.a(uo.field_a, 0, ji.field_c, (byte) -110, var12, 0, param2);
                } else {
                  pe.a(7, param1, var12.field_Nb);
                }
              } else {
                bg.a(var12.field_Nb, param1, -26231);
              }
            }
            var11 = var12;
            if (var12.field_R &&
              !var12.b((byte) -110)) {
              var24Lifetime2 = null;
              if (~hn.field_f != ~var12.field_Nb) {
                if (var5_int != 0 &&
                  !var12.field_Xb) {
                  var24Lifetime2 = sd.a(rh.field_w, 46, new String[]{var20});
                } else {
                  if (var7 <= var12.field_Yb) {
                    if (var6 <= var12.field_Rb) {
                      if ((var8 & ~var12.field_Ib) != 0) {
                        var25_int = cl.a((byte) -101, var8 & ~var12.field_Ib);
                        var24Lifetime2 = sd.a(hg.field_i, 27, new String[]{var20});
                        if (var25_int > 0 &&
                          null != lc.field_l &&
                          var25_int <= lc.field_l.length &&
                          lc.field_l[var25_int - 1] != null) {
                          var24Lifetime2 = sd.a(lc.field_l[var25_int - 1][2], 62, new String[]{var20});
                          var30Lifetime1 = var24Lifetime2;
                          var25 = var30Lifetime1;
                          var24Lifetime2 = var25;
                          var30Lifetime1Lifetime1 = var24Lifetime2;
                          var25 = var30Lifetime1Lifetime1;
                        }
                      }
                    } else {
                      var24Lifetime2 = sd.a(jj.field_e, 40, new String[]{var20, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.field_Yb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = sd.a(jm.field_k, 22, new String[]{var20});
                    }
                    var24Lifetime2 = sd.a(tg.field_l, 62, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Xb) {
                  var24Lifetime2 = ll.field_g;
                } else {
                  if (var7 > var12.field_Yb) {
                    var25_int = -var12.field_Yb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = oe.field_Mb;
                    }
                    var24Lifetime2 = sd.a(ll.field_f, 95, new String[]{null, Integer.toString(var25_int)});
                  } else {
                    if (var6 <= var12.field_Rb) {
                      if (0 != (var8 & ~var12.field_Ib)) {
                        var25_int = cl.a((byte) -100, var8 & ~var12.field_Ib);
                        var24Lifetime2 = jp.field_d;
                        if (var25_int > 0 &&
                          null != lc.field_l &&
                          lc.field_l.length >= var25_int &&
                          lc.field_l[var25_int - 1] != null) {
                          var24Lifetime2 = lc.field_l[-1 + var25_int][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = sd.a(jn.field_m, 63, new String[]{null, Integer.toString(var6)});
                    }
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var34 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var34;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; fj.field_b > var27_int; var27_int++) {
                  var28 = 255 & io.field_c.field_Eb[var27_int];
                  var29 = 0;
                  if (jm.field_r != null &&
                    null != jm.field_r[var27_int] &&
                    jm.field_r[var27_int][var28] &&
                    !var12.field_Xb) {
                    var29 = 1;
                  }
                  if (w.field_z != null &&
                    null != w.field_z[var27_int]) {
                    var30_int = w.field_z[var27_int][var28];
                    if (var30_int != 0 &&
                      !fe.field_a &&
                      !var12.field_Xb) {
                      var29 = 1;
                    }
                    if (var12.field_Rb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (pa.field_a != null &&
                    null != pa.field_a[var27_int]) {
                    var30_intLifetime1 = pa.field_a[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !fe.field_a &&
                      !var12.field_Xb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Yb) {
                      var29 = 1;
                    }
                  }
                  if (oo.field_e != null &&
                    null != oo.field_e[var27_int] &&
                    0 != (oo.field_e[var27_int][var28] & ~var12.field_Ib)) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + jk.field_e[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                      var26Lifetime1 = 1;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (param2 == ae.field_c &&
                  pl.m(99)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + sd.a(tk.field_q, 96, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + le.field_i + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + sd.a(we.field_l, 102, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + bh.field_i + (String) (var25);
                  }
                }
                if (param2 == ae.field_c &&
                  !pl.m(99)) {
                  var27 = io.field_c.field_pc;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + sd.a(ff.field_c, 93, new String[]{var27});
                }
                up.field_o = (String) (var24Lifetime2);
              }
            }
            var12 = (uj) (var10.f(1504642273));
          }
          if (param0 < 19) {
            field_a = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_223_0 = var5;
          stackIn_223_1 = new StringBuilder().append("la.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_224_2 = "null";
          } else {
            stackIn_224_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_223_0), ((StringBuilder) (Object) stackIn_223_1).append(stackIn_224_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        ec.field_t = 0;
        nc.field_a = param0;
        ti.field_t = param1;
        if (ti.field_t == -4 ||
          ti.field_t == -2 ||
          ti.field_t == -5 ||
          ti.field_t == 0 ||
          ti.field_t == 12 ||
          ti.field_t == 17) {
          dg.a(0, (byte) -91);
        }
        if (tk.a((byte) -104, ti.field_t)) {
          var4 = 0;
          if (ti.field_t == 12) {
            var4 = -1;
          }
          wo.b(-92, ti.field_t).a(2, var4, param2);
          if (ti.field_t == 12) {
            id.a(param2, (byte) 110);
          }
        }
        if (param3 != -25528) {
          field_c = (byte[]) null;
        }
    }

    final static int a(byte param0) {
        if (param0 != -59) {
          field_a = (int[]) null;
        }
        return ib.field_g - ko.field_cb;
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        we var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new we(param0);
          var3 = var9.f(param1 ^ 255);
          var4 = var9.k(0);
          if (var4 >= param1 && (up.field_j == 0 ||
            !(up.field_j < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(var13, 0, -80, var4);
              stackIn_21_0 = var5;
              return stackIn_21_0;
            }
            var5_int = var9.k(0);
            if (0 <= var5_int && (up.field_j == 0 ||
              !(var5_int > up.field_j))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (1 == var3) {
                q.a(var12, var5_int, param0, var4, 9);
              } else {
                var7 = fd.field_b;
                synchronized (var7) {
                  fd.field_b.a(param1 ^ -8, var12, var9);
                }
              }
              stackIn_19_0 = var6;
              return stackIn_19_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("la.F(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new int[]{10, 20, 32, 50};
        field_c = new byte[]{(byte) 1, (byte) 1};
    }
}
