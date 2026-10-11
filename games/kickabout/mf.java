/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends hd {
    static String field_Ab;
    int field_Fb;
    private int field_zb;
    private gr field_Hb;
    static int field_Gb;
    private hn field_Bb;
    static volatile boolean field_Ib;
    static ut field_Cb;
    static String field_Db;
    static String field_yb;
    kq[] field_Eb;

    final static void a(ut[] param0, boolean param1) {
        int var2_int = 0;
        int var3 = Kickabout.field_G;
        try {
          gk.field_a = param0;
          sq.field_F = new ut[2];
          for (var2_int = 0; 2 > var2_int; var2_int++) {
            sq.field_F[var2_int] = gk.field_a[var2_int].b();
            nh.a(sq.field_F[var2_int], 0.0, 0.0, 1.0);
          }
          if (!param1) {
            field_Ib = true;
          }
          vb.field_l = gk.field_a[2];
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "mf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        kq stackIn_77_0 = null;
        boolean stackIn_78_1 = false;
        int stackIn_84_0 = 0;
        kq stackIn_87_0 = null;
        boolean stackIn_88_1 = false;
        kq stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        int var2;
        int var3;
        kq var3_ref_kq;
        kq var4;
        int var4_int;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var2Lifetime1;
        int var3Lifetime1;
        int var5Lifetime1;
        var10 = Kickabout.field_G;
        if (this.field_zb > 0) {
          this.field_zb = this.field_zb - 1;
        }
        if (param0 != 48) {
          this.a(-10);
        }
        for (var2 = 0; var2 < 9; var2++) {
          var3_ref_kq = this.field_Eb[var2];
          var4_int = this.field_Hb.field_q[var2];
          var3_ref_kq.a(this.field_Hb.field_R, this.field_Hb.field_w, (byte) 127, this.field_Hb.field_k, this.field_Hb.field_i[var4_int]);
          var3_ref_kq.a((byte) 25, this.field_Hb, var4_int);
          if (!var3_ref_kq.field_Eb.c(-2) &&
            var3_ref_kq.field_qb != 0) {
            var3_ref_kq.field_s = -var3_ref_kq.field_bb + (-this.field_F + wt.field_x);
            var3_ref_kq.field_J = -var3_ref_kq.field_M - this.field_T + us.field_j;
            var5 = 10 + (this.field_q - var3_ref_kq.field_q);
            var6 = 10 - var3_ref_kq.field_mb + this.field_mb;
            if (var5 < var3_ref_kq.field_s) {
              var3_ref_kq.field_s = var5;
            }
            if (var3_ref_kq.field_s < -10) {
              var3_ref_kq.field_s = -10;
            }
            if (-10 > var3_ref_kq.field_J) {
              var3_ref_kq.field_J = -10;
            }
            if (var6 < var3_ref_kq.field_J) {
              var3_ref_kq.field_J = var6;
            }
            var3_ref_kq.field_F = this.field_F + var3_ref_kq.field_s;
            var3_ref_kq.field_T = var3_ref_kq.field_J + this.field_T;
            var7 = (var3_ref_kq.field_bb + var3_ref_kq.field_s) / 52;
            var8 = (var3_ref_kq.field_M + var3_ref_kq.field_J) / 75;
            if (var7 >= 0 &&
              var8 >= 0 &&
              var7 < 3 &&
              var8 < 3) {
              var9 = var7 + var8 * 3;
              if (var3_ref_kq != this.field_Eb[var9]) {
                if (!(cq.field_h instanceof ta)) {
                  this.field_Bb = this.field_Hb.a(var9, -123, var2);
                  this.field_Hb.a(this.field_Bb, cq.e(15137), 0);
                } else {
                  di.a(var2, true, var9);
                }
                this.field_Eb[var2] = this.field_Eb[var9];
                this.field_Eb[var9] = var3_ref_kq;
                if (this.field_zb == 0) {
                  sp.c(54, -108);
                  this.field_zb = 5;
                }
              }
            }
          } else {
            var5 = this.a((byte) -53, var2);
            var6 = this.b(var2, -96);
            if (var3_ref_kq.field_s != var5) {
              var7 = -var3_ref_kq.field_s + (3 * var3_ref_kq.field_s + var5 >> 2);
              if (var7 == 0) {
                stackIn_48_0 = (var3_ref_kq.field_s >= var5) ? -1 : 1;
                var7 = stackIn_48_0;
              }
              var3_ref_kq.field_s = var3_ref_kq.field_s + var7;
            }
            if (var6 != var3_ref_kq.field_J) {
              var7 = -var3_ref_kq.field_J + (3 * var3_ref_kq.field_J + var6 >> 2);
              if (var7 == 0) {
                stackIn_57_0 = (var3_ref_kq.field_J >= var6) ? -1 : 1;
                var7 = stackIn_57_0;
              }
              var3_ref_kq.field_J = var3_ref_kq.field_J + var7;
            }
          }
        }
        var2Lifetime1 = -1;
        for (var3 = 0; 9 > var3; var3++) {
          if (this.field_Eb[var3].field_sb != 0 &&
            !this.field_Eb[var3].field_Eb.c(-2)) {
            kj.a((byte) -123);
          }
          if (this.field_Eb[var3].field_qb != 0) {
            var2Lifetime1 = var3;
          }
        }
        if (-1 == var2Lifetime1) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 9; var3Lifetime1++) {
            var4 = this.field_Eb[var3Lifetime1];
            stackIn_84_0 = (!var4.field_Eb.c(param0 ^ -50)) ? 0 : 1;
            var5Lifetime1 = stackIn_84_0;
            stackIn_87_0 = var4;
            stackIn_88_1 = (var5Lifetime1 == 0) && (var4.field_Q);
            stackIn_87_0.field_zb = stackIn_88_1;
            stackIn_91_0 = var4;
            stackIn_92_1 = (var5Lifetime1 == 0) && (this.field_Fb == var3Lifetime1);
            stackIn_91_0.field_Kb = stackIn_92_1;
          }
        } else if (!this.field_Eb[var2Lifetime1].field_Eb.c(-2)) {
          this.field_Fb = var2Lifetime1;
          for (var3Lifetime1 = 0; 9 > var3Lifetime1; var3Lifetime1++) {
            this.field_Eb[var3Lifetime1].field_Kb = false;
            stackIn_77_0 = this.field_Eb[var3Lifetime1];
            stackIn_78_1 = (var2Lifetime1 == var3Lifetime1);
            stackIn_77_0.field_zb = stackIn_78_1;
          }
        } else {
          this.field_Fb = -1;
        }
    }

    final static void a(byte param0, ml param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bc[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        bc var14 = null;
        bc var15 = null;
        int var8Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var3_int = un.field_e.i(-107);
          var4 = un.field_e.h((byte) -121);
          var5 = un.field_e.h((byte) -118);
          stackIn_4_0 = (je.field_k == var5) ? 0 : 1;
          var6 = stackIn_4_0;
          var7 = new bc[var4];
          for (var8 = 0; var4 > var8; var8++) {
            var7[var8] = lh.a(un.field_e, param0 + 18758);
          }
          bf.field_y.a(param0 ^ -107, var7, nj.a(param0 + 186));
          if (!param2 &&
            var6 != 0) {
            uv.field_f = false;
            return;
          }
          je.field_k = var5;
          pu.field_Db[je.field_k] = var3_int;
          jh.field_Hb.field_Db.a(true, 317, jh.field_Hb.field_Db.field_s, jh.field_Hb.field_Db.field_J, var3_int * 18 + 6);
          if (var6 != 0) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = jh.field_Hb.field_Db.field_J;
          }
          var8Lifetime1 = stackIn_14_0;
          if (param0 != -105) {
            return;
          }
          jh.field_Hb.a(15, 20, 2, (byte) -114, 230, 344, 170);
          jh.field_Hb.field_Db.field_J = var8Lifetime1;
          if (param2) {
            var9 = -1;
            var10 = 0;
            while (true) {
              if (var10 < var7.length) {
                var14 = var7[var10];
                if (var14.field_a &&
                  !hm.a((byte) 121, var14.field_f)) {
                  var9 = var14.field_g;
                } else {
                  var10++;
                  continue;
                }
              }
              if (-1 == var9) {
                wh.field_w = 150;
                var13 = 0;
                var10 = var13;
                while (var7.length > var13) {
                  var15 = var7[var13];
                  if (hm.a((byte) 45, var15.field_f)) {
                    var9 = var15.field_g;
                    break;
                  }
                  var13++;
                }
              }
              if (var9 == -1) {
                break;
              }
              if (var9 <= 4) {
                jh.field_Hb.field_Db.field_J = 0;
              } else {
                if (var3_int - 5 < var9) {
                  jh.field_Hb.field_Db.field_J = -(18 * (var3_int - 10));
                } else {
                  jh.field_Hb.field_Db.field_J = -(18 * (var9 - 4));
                }
              }
              field_Gb = vc.a(18, -(jh.field_Hb.field_Db.field_J + 5), (byte) -72);
              break;
            }
          }
          qh.a(94);
          uv.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 != -53) {
          return 81;
        }
        return 52 * (param1 % 3);
    }

    final void c(boolean param0) {
        int var2;
        if (!la.a(100) &&
          null != this.field_Bb) {
          or.field_d.b(81, (byte) 84);
          or.field_d.field_n = or.field_d.field_n + 2;
          var2 = or.field_d.field_n;
          or.field_d.a(106, 1);
          this.field_Bb.a(1, or.field_d);
          or.field_d.d(-var2 + or.field_d.field_n, 62);
          if (!param0) {
            field_Gb = 97;
          }
          return;
        }
    }

    final kq j(byte param0) {
        if (param0 != 21) {
          return (kq) null;
        }
        return this.field_Fb == -1 ? null : this.field_Eb[this.field_Fb];
    }

    private final int b(int param0, int param1) {
        int var3 = -49 / ((-53 - param1) / 38);
        return 75 * (param0 / 3);
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var8 = 0;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        var10 = Kickabout.field_G;
        try {
          if (0 == param0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param0 == 1) {
            var11 = param1[param3];
            var4 = var11;
            if (var4 != null) {
              return var11.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param0 + param3;
          var5 = 0;
          for (var6_int = param3; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          var8 = 108 / ((param2 - 28) / 43);
          for (var7 = param3; var7 < var4_int; var7++) {
            var9 = param1[var7];
            if (var9 != null) {
              discarded$0 = var6.append(var9);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_23_0 = var6.toString();
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("mf.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_Db = null;
        field_Ab = null;
        field_Cb = null;
        int var1 = -70 / ((-51 - param0) / 44);
        field_yb = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          pt.a(640, -22914, 0, 480, 390);
          var1_int = -e.field_j + 480;
          if (param0 > -99) {
            return;
          }
          for (var2 = 0; var2 < bk.field_c.length; var2++) {
            if (null != bk.field_c[var2]) {
              bk.field_c[var2].a(-65, var1_int);
              var1_int -= 18;
              continue;
            }
            break;
          }
          ta.e(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) runtimeException), "mf.K(" + param0 + ')');
        }
    }

    mf(gr param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_Fb = -1;
        try {
          this.field_Eb = new kq[9];
          this.field_zb = 0;
          this.field_q = 156;
          this.field_Hb = param0;
          this.field_mb = 225;
          for (var2_int = 0; var2_int < 9; var2_int++) {
            this.field_Eb[var2_int] = new kq();
            this.field_Eb[var2_int].a(true, 52, this.a((byte) -53, var2_int), this.b(var2_int, -96), 75);
            this.a((byte) -117, (hd) (this.field_Eb[var2_int]));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("mf.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        {
          var3 = Kickabout.field_G;
          if ((0 >= param0 ||
            param0 >= 128) && (param0 < 160 ||
            param0 > 255)) {
            if (param0 == 8364) {
              var2 = -128;
            } else if (param0 == 8218) {
              var2 = -126;
            } else if (param0 == 402) {
              var2 = -125;
            } else if (param0 == 8222) {
              var2 = -124;
            } else if (8230 == param0) {
              var2 = -123;
            } else if (8224 == param0) {
              var2 = -122;
            } else if (param0 == 8225) {
              var2 = -121;
            } else if (param0 == 710) {
              var2 = -120;
            } else if (8240 == param0) {
              var2 = -119;
            } else if (param0 == 352) {
              var2 = -118;
            } else if (param0 == 8249) {
              var2 = -117;
            } else if (param0 == 338) {
              var2 = -116;
            } else if (param0 == 381) {
              var2 = -114;
            } else if (param0 == 8216) {
              var2 = -111;
            } else if (param0 == 8217) {
              var2 = -110;
            } else if (param0 == 8220) {
              var2 = -109;
            } else if (param0 == 8221) {
              var2 = -108;
            } else if (param0 == 8226) {
              var2 = -107;
            } else if (param0 == 8211) {
              var2 = -106;
            } else if (8212 == param0) {
              var2 = -105;
            } else if (param0 == 732) {
              var2 = -104;
            } else if (param0 == 8482) {
              var2 = -103;
            } else if (param0 == 353) {
              var2 = -102;
            } else if (param0 == 8250) {
              var2 = -101;
            } else if (339 == param0) {
              var2 = -100;
            } else if (param0 == 382) {
              var2 = -98;
            } else if (param0 == 376) {
              var2 = -97;
            } else {
              var2 = 63;
            }
          } else {
            var2 = (byte)param0;
          }
        }
        if (param1 == -104) {
          return (byte) var2;
        }
        return (byte) 17;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        wd var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          if (param1 >= -70) {
            field_yb = (String) null;
          }
          var4 = (wd) (ak.field_i.g(24009));
          while (var4 != null) {
            vg.a(true, var4, param0);
            var4 = (wd) (ak.field_i.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "mf.L(" + param0 + ',' + param1 + ')');
        }
    }

    final void k(byte param0) {
        int var4_int = 0;
        int var6 = 0;
        int var2;
        int var3;
        int var7;
        Object var4;
        int var5;
        var7 = Kickabout.field_G;
        var2 = -1;
        var3 = -1;
        for (var4_int = 0; 9 > var4_int; var4_int++) {
          if (!this.field_Eb[var4_int].field_Kb) {
            if (this.field_Eb[var4_int].field_zb) {
              var2 = var4_int;
            }
          } else {
            var3 = var4_int;
          }
        }
        gd.a(var3, this.field_T, this.field_F, (byte) -96, var2);
        var5 = -84 % ((param0 + 35) / 60);
        var4 = null;
        pt.a(this.field_F + this.field_q, -22914, this.field_F, this.field_mb + this.field_T, this.field_T);
        for (var6 = 0; var6 < 9; var6++) {
          if (0 != this.field_Eb[var6].field_qb) {
            var4 = this.field_Eb[var6];
          } else {
            this.field_Eb[var6].h((byte) -125);
          }
        }
        if (var4 != null) {
          ((kq) (var4)).h((byte) -118);
        }
        ta.e(121);
    }

    final static wn a(boolean param0, int param1) {
        wn var2 = new wn(true);
        var2.field_c = param0 ? true : false;
        if (param1 <= 29) {
          return (wn) null;
        }
        return var2;
    }

    final static void h(byte param0) {
        if (null != ge.field_o) {
          return;
        }
        df.field_F = new String[8];
        df.field_F[7] = kr.field_c;
        fs.field_a = new String[]{s.field_F, ku.field_a};
        rd.field_e = new String[]{gm.field_Q};
        df.field_F[1] = uq.field_f;
        df.field_F[4] = kr.field_d;
        df.field_F[6] = pq.field_M;
        df.field_F[0] = qs.field_H;
        ge.field_o = new String[57];
        pd.field_M = new String[]{mc.field_g, ku.field_a};
        ow.field_d = new String[]{fb.field_C, iv.field_n, ku.field_a};
        si.field_q = new String[]{s.field_F, lh.field_F};
        df.field_F[3] = rl.field_t;
        vq.field_i = new String[]{s.field_F, mc.field_g};
        fp.field_u = new String[]{s.field_F};
        df.field_F[2] = m.field_i;
        df.field_F[5] = fc.field_e;
        nn.field_I = new String[]{ob.field_H, in.field_a, ku.field_a};
        ge.field_o[10] = nj.field_b;
        ge.field_o[12] = ns.field_b;
        ge.field_o[3] = sl.field_zb;
        ge.field_o[4] = pe.field_b;
        ge.field_o[2] = ta.field_E;
        ge.field_o[25] = tk.field_Bb;
        ge.field_o[28] = pr.field_b;
        ge.field_o[55] = jo.field_B;
        ge.field_o[8] = om.field_Eb;
        ge.field_o[27] = lg.field_c;
        ge.field_o[9] = fb.field_N;
        ge.field_o[0] = bo.field_zb;
        ge.field_o[6] = dw.field_a;
        ge.field_o[5] = io.field_i;
        ge.field_o[1] = h.field_c;
        ge.field_o[7] = at.field_Fb;
        ge.field_o[15] = hn.field_e;
        ge.field_o[24] = ah.field_f;
        ge.field_o[18] = o.field_b;
        ge.field_o[23] = nb.field_h;
        ge.field_o[40] = ms.field_a;
        ge.field_o[14] = wh.field_h;
        ge.field_o[43] = at.field_Fb;
        ge.field_o[45] = us.field_g;
        ge.field_o[39] = wq.field_f;
        ge.field_o[41] = lk.field_i;
        ge.field_o[19] = io.field_c;
        ge.field_o[38] = sl.field_Ab;
        ge.field_o[47] = ni.field_e;
        ge.field_o[36] = di.field_a;
        ge.field_o[11] = nj.field_c;
        ge.field_o[22] = dn.field_Db;
        ge.field_o[33] = hh.field_a;
        ge.field_o[26] = kj.field_c;
        ge.field_o[16] = ea.field_b;
        ge.field_o[29] = ge.field_o[4];
        ge.field_o[35] = lj.field_m;
        ge.field_o[42] = at.field_Fb;
        ge.field_o[21] = ei.field_f;
        ge.field_o[44] = o.field_b;
        ge.field_o[13] = cu.field_f[0];
        ge.field_o[20] = ol.field_n;
        ge.field_o[17] = kd.field_A;
        ge.field_o[34] = lo.field_m;
        ge.field_o[48] = oc.field_b.toUpperCase();
        ge.field_o[30] = "";
        ge.field_o[50] = lw.field_h;
        ge.field_o[46] = ii.field_h;
        ge.field_o[52] = ia.field_h;
        ge.field_o[32] = "";
        ge.field_o[56] = ia.field_h;
        ge.field_o[54] = ow.field_a;
        ge.field_o[53] = ul.field_b;
        ge.field_o[51] = vp.field_d;
        ge.field_o[49] = aw.field_K;
        ge.field_o[37] = "";
        oc.field_b = oc.field_b.toLowerCase();
        da.field_i = da.field_i.toLowerCase();
        fa.field_g = new String[57];
        if (param0 != -19) {
          return;
        }
        fa.field_g[28] = rd.field_b;
        fa.field_g[26] = pn.field_C;
        fa.field_g[46] = iq.field_b;
        rv.field_d = new String[24];
        fa.field_g[48] = ep.field_a;
        fa.field_g[45] = nd.field_a;
        rv.field_d[18] = ef.field_s;
        rv.field_d[1] = jo.field_C;
        rv.field_d[4] = cp.field_a;
        rv.field_d[7] = rr.field_a;
        kp.field_g = new String[4];
        rv.field_d[22] = ni.field_n;
        rv.field_d[0] = rv.field_a;
        rv.field_d[5] = rq.field_B;
        rv.field_d[10] = hm.field_C;
        rv.field_d[17] = gt.field_r;
        rv.field_d[20] = gt.field_m;
        rv.field_d[21] = pf.field_a;
        rv.field_d[15] = dr.field_f;
        rv.field_d[16] = qk.field_F;
        rv.field_d[23] = aj.field_d;
        rv.field_d[6] = i.field_w;
        rv.field_d[9] = cg.field_L;
        rv.field_d[12] = md.field_g;
        rv.field_d[19] = np.field_yb;
        rv.field_d[3] = nr.field_l;
        rv.field_d[14] = mc.field_c;
        rv.field_d[2] = mt.field_c;
        rv.field_d[8] = jk.field_o;
        rv.field_d[13] = ld.field_d;
        rv.field_d[11] = bw.field_c;
        kp.field_g[0] = lt.field_b;
        kp.field_g[2] = ij.field_n;
        kp.field_g[3] = qp.field_C;
        kp.field_g[1] = qk.field_G;
        qb.field_Qb = new String[4];
        eb.field_g = new String[4];
        qb.field_Qb[0] = at.field_Bb;
        qb.field_Qb[3] = op.field_u;
        qb.field_Qb[1] = wr.field_g;
        qb.field_Qb[2] = mo.field_a;
        eb.field_g[1] = qa.field_F;
        eb.field_g[3] = bv.field_n;
        eb.field_g[0] = av.field_d;
        eb.field_g[2] = bb.field_Db;
    }

    final static ki a(int param0, int param1, byte param2) {
        if (param2 != 0) {
          mf.i((byte) 81);
        }
        return new ki(3, param1, param0, (byte) 0, (byte) 0);
    }

    static {
        field_Ab = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_Gb = 0;
        field_Ib = false;
        field_yb = "The account name you use to access RuneScape and other Jagex.com games";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$fbddc791f0bf(int param0, ml param1, boolean param2) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bc[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        bc var14 = null;
        bc var15 = null;
        int var8Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var3_int = un.field_e.i(-107);
          var4 = un.field_e.h((byte) -121);
          var5 = un.field_e.h((byte) -118);
          stackIn_4_0 = (je.field_k == var5) ? 0 : 1;
          var6 = stackIn_4_0;
          var7 = new bc[var4];
          for (var8 = 0; var4 > var8; var8++) {
            var7[var8] = lh.a(un.field_e, param0 + 18758);
          }
          bf.field_y.a(param0 ^ -107, var7, nj.a(param0 + 186));
          if (!param2 &&
            var6 != 0) {
            uv.field_f = false;
            return;
          }
          je.field_k = var5;
          pu.field_Db[je.field_k] = var3_int;
          jh.field_Hb.field_Db.a(true, 317, jh.field_Hb.field_Db.field_s, jh.field_Hb.field_Db.field_J, var3_int * 18 + 6);
          if (var6 != 0) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = jh.field_Hb.field_Db.field_J;
          }
          var8Lifetime1 = stackIn_14_0;
          if (param0 != -105) {
            return;
          }
          jh.field_Hb.a(15, 20, 2, (byte) -114, 230, 344, 170);
          jh.field_Hb.field_Db.field_J = var8Lifetime1;
          if (param2) {
            var9 = -1;
            var10 = 0;
            while (true) {
              if (var10 < var7.length) {
                var14 = var7[var10];
                if (var14.field_a &&
                  !hm.a((byte) 121, var14.field_f)) {
                  var9 = var14.field_g;
                } else {
                  var10++;
                  continue;
                }
              }
              if (-1 == var9) {
                wh.field_w = 150;
                var13 = 0;
                var10 = var13;
                while (var7.length > var13) {
                  var15 = var7[var13];
                  if (hm.a((byte) 45, var15.field_f)) {
                    var9 = var15.field_g;
                    break;
                  }
                  var13++;
                }
              }
              if (var9 == -1) {
                break;
              }
              if (var9 <= 4) {
                jh.field_Hb.field_Db.field_J = 0;
              } else {
                if (var3_int - 5 < var9) {
                  jh.field_Hb.field_Db.field_J = -(18 * (var3_int - 10));
                } else {
                  jh.field_Hb.field_Db.field_J = -(18 * (var9 - 4));
                }
              }
              field_Gb = vc.a(18, -(jh.field_Hb.field_Db.field_J + 5), (byte) -72);
              break;
            }
          }
          qh.a(94);
          uv.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }
}
