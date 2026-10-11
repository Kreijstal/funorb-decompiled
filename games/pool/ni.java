/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends vc {
    private jg field_W;
    private so field_bb;
    private nb field_ab;
    private jg field_Q;
    static he field_eb;
    private jg field_fb;
    private jg field_Y;
    private so field_gb;
    private so field_jb;
    private so field_R;
    private boolean[] field_kb;
    static an field_Z;
    private jg field_cb;
    static kq field_ib;
    private jg field_X;
    private nb field_hb;
    static String field_S;
    private so field_U;
    private jg field_db;
    private jg field_V;

    final void a(int param0, uf param1) {
        nb dupTemp$0 = null;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_40_2 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var7Lifetime1Lifetime1;
        var8 = Pool.field_O;
        try {
          super.a(param0, param1);
          if (this.field_hb != null &&
            this.field_hb.i()) {
            this.field_hb = null;
          }
          if (null != this.field_ab &&
            this.field_ab.i() &&
            this.field_hb == null) {
            dupTemp$0 = nb.a(this.field_db, 100, this.field_ab.l(), this.field_ab.n());
            this.field_hb = dupTemp$0;
            mn.a(-24296, dupTemp$0);
            this.field_ab = null;
          }
          ei.field_u = ei.field_u + 1;
          if (ne.field_s == 1) {
            if (mp.field_V <= 0) {
              return;
            }
            var3_int = 0;
            var4 = 128 + param1.field_eb.b(-128);
            if (var4 > 0) {
              var5 = -this.field_B.field_A + var4 + 111;
              if (ua.field_o > var5 &&
                68 + var5 > ua.field_o) {
                var6 = (int)(-param1.field_eb.a(true) * (double)this.field_B.field_z / 2.0 / 3.141592653589793);
                var7 = -this.field_B.field_z + var6 + 1289;
                if (var7 < lq.field_W &&
                  54 + var7 > lq.field_W) {
                  var3_int = 1;
                } else {
                  if (-qh.field_l + this.field_B.field_z > var6) {
                    var7 = 1289 + var6;
                    if (lq.field_W > var7 &&
                      54 + var7 > lq.field_W) {
                      var3_int = 1;
                    }
                  }
                }
              }
            }
            if (var3_int != 0) {
              e.field_c[la.field_b % e.field_c.length] = ei.field_u;
              la.field_b = la.field_b + 1;
              if (la.field_b < 5) {
                return;
              }
              var5Lifetime1 = e.field_c[0];
              var6Lifetime1 = e.field_c[0];
              for (var7Lifetime1 = 1; var7Lifetime1 < e.field_c.length; var7Lifetime1++) {
                if (e.field_c[var7Lifetime1] > var6Lifetime1) {
                  var6Lifetime1 = e.field_c[var7Lifetime1];
                }
                if (e.field_c[var7Lifetime1] < var5Lifetime1) {
                  var5Lifetime1 = e.field_c[var7Lifetime1];
                }
              }
              var7Lifetime1Lifetime1 = -var5Lifetime1 + var6Lifetime1;
              if (0 < var7Lifetime1Lifetime1 &&
                var7Lifetime1Lifetime1 < 50) {
                stackIn_39_0 = -3405;
                stackIn_39_1 = 22;
                if (mg.a(true)) {
                  stackIn_40_2 = 21;
                } else {
                  stackIn_40_2 = 0;
                }
                fq.a(stackIn_39_0, stackIn_39_1, stackIn_40_2, false);
                lg.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -113)));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("ni.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final void a(byte param0, uf param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_15_4 = 0;
        boolean stackIn_18_2 = false;
        Object stackIn_136_0;
        int[] stackIn_136_1;
        int stackIn_136_2;
        boolean stackIn_136_3;
        pq[] stackIn_136_4;
        Object stackIn_137_0;
        boolean stackIn_137_5;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        String stackIn_148_2 = null;
        RuntimeException decompiledCaughtException = null;
        pq[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        di var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        pq[] var20 = null;
        so var21 = null;
        int[] var23 = null;
        so var24 = null;
        so var27 = null;
        so var29 = null;
        so var32 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var38 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        boolean[] var59 = null;
        int[] var60 = null;
        boolean[] var61 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        var14 = Pool.field_O;
        try {
          var20 = param1.field_I.field_l;
          var3 = var20;
          var36 = f.a((byte) -56, param1.field_ab);
          var19 = var36;
          var4 = var19;
          var35 = var4;
          var18 = var35;
          var16 = var18;
          var5_ref_int__ = var16;
          oh.field_d[0] = var35[0] - sb.a(288.0f, true) >> 2;
          oh.field_d[1] = var35[1] - sb.a(144.0f, true) >> 2;
          oh.field_d[2] = var35[2] >> 2;
          if (var5_ref_int__ != oh.field_d) {
            oh.field_d[11] = var35[11];
            oh.field_d[9] = var35[9];
            oh.field_d[5] = var35[5];
            oh.field_d[6] = var35[6];
            oh.field_d[8] = var35[8];
            oh.field_d[4] = var35[4];
            oh.field_d[3] = var35[3];
            oh.field_d[7] = var35[7];
            oh.field_d[10] = var35[10];
          }
          var4[1] = rb.b(var36[1], -4);
          var4[2] = rb.b(var36[2], -4);
          var4[0] = rb.b(var36[0], -4);
          this.e(true);
          this.a(false, var36, var20);
          kf.a(ag.field_c, (byte) -104, pa.field_L, ph.field_g, lk.field_m);
          kf.a(ol.field_a, (byte) -104, pa.field_L, ph.field_g, w.field_h);
          kf.a(bf.field_k, (byte) -104, pa.field_L, ph.field_g, hb.field_l);
          var21 = this.field_bb;
          var54 = oh.field_d;
          var21.b((byte) -123, 0, var21.field_j.length, var54);
          for (var5 = 0; var5 < this.field_kb.length; var5++) {
            var38 = this.field_bb.field_c[var5];
            var23 = var38;
            var17 = var23;
            var6_ref_int__ = var17;
            var7 = 576;
            var8 = 288;
            stackIn_7_0 = this.field_kb;
            stackIn_7_1 = var5;
            stackIn_7_2 = var38[1] - oh.field_d[1];
            if (var38[1] >= -var8) {
              if (var8 < var38[1]) {
                stackIn_10_3 = -1;
              } else {
                stackIn_10_3 = 0;
              }
            } else {
              stackIn_10_3 = 1;
            }
            stackIn_14_2 = stackIn_7_2 * stackIn_10_3;
            stackIn_14_3 = var38[0] - oh.field_d[0];
            if (var38[0] < -var7) {
              stackIn_15_4 = 1;
            } else {
              if (var7 < var38[0]) {
                stackIn_15_4 = -1;
              } else {
                stackIn_15_4 = 0;
              }
            }
            stackIn_18_2 = !(stackIn_14_2 + stackIn_14_3 * stackIn_15_4 <= 0);
            stackIn_7_0[stackIn_7_1] = stackIn_18_2;
          }
          var24 = this.field_R;
          var55 = oh.field_d;
          var24.b((byte) -113, 0, var24.field_j.length, var55);
          en.b(param0 + 55);
          this.a(false, param1);
          var56 = new int[3];
          hr.a(th.field_l[vf.field_lb].field_l[0], var56, oh.field_d, th.field_l[vf.field_lb].field_l[1], th.field_l[vf.field_lb].field_l[2], (byte) 9);
          dupTemp$0 = var56[1];
          var9 = dupTemp$0;
          var8Lifetime1 = dupTemp$0;
          dupTemp$1 = var56[0];
          var7Lifetime1 = dupTemp$1;
          var6 = dupTemp$1;
          for (var5Lifetime1 = ma.field_g - 1; var5Lifetime1 >= vf.field_lb; var5Lifetime1--) {
            th.field_l[var5Lifetime1].c(6710886, oh.field_d);
            hr.a((int) th.field_l[var5Lifetime1].field_h, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_a, (int) th.field_l[var5Lifetime1].field_o, (byte) 9);
            if (var6 <= var56[0]) {
              if (var7Lifetime1 < var56[0]) {
                var7Lifetime1 = var56[0];
              }
            } else {
              var6 = var56[0];
            }
            if (var8Lifetime1 <= var56[1]) {
              if (var9 < var56[1]) {
                var9 = var56[1];
              }
            } else {
              var8Lifetime1 = var56[1];
            }
            hr.a((int) th.field_l[var5Lifetime1].field_p, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_a, (int) th.field_l[var5Lifetime1].field_o, (byte) 9);
            if (var56[0] >= var6) {
              if (var7Lifetime1 < var56[0]) {
                var7Lifetime1 = var56[0];
              }
            } else {
              var6 = var56[0];
            }
            if (var56[1] >= var8Lifetime1) {
              if (var9 < var56[1]) {
                var9 = var56[1];
              }
            } else {
              var8Lifetime1 = var56[1];
            }
            hr.a((int) th.field_l[var5Lifetime1].field_h, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_m, (int) th.field_l[var5Lifetime1].field_o, (byte) 9);
            if (var6 > var56[0]) {
              var6 = var56[0];
            } else {
              if (var56[0] > var7Lifetime1) {
                var7Lifetime1 = var56[0];
              }
            }
            if (var56[1] < var8Lifetime1) {
              var8Lifetime1 = var56[1];
            } else {
              if (var9 < var56[1]) {
                var9 = var56[1];
              }
            }
            hr.a((int) th.field_l[var5Lifetime1].field_p, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_m, (int) th.field_l[var5Lifetime1].field_o, (byte) 9);
            if (var8Lifetime1 <= var56[1]) {
              if (var9 < var56[1]) {
                var9 = var56[1];
              }
            } else {
              var8Lifetime1 = var56[1];
            }
            if (var56[0] < var6) {
              var6 = var56[0];
            } else {
              if (var56[0] > var7Lifetime1) {
                var7Lifetime1 = var56[0];
              }
            }
            hr.a((int) th.field_l[var5Lifetime1].field_h, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_a, (int) th.field_l[var5Lifetime1].field_f, (byte) 9);
            if (var8Lifetime1 <= var56[1]) {
              if (var9 < var56[1]) {
                var9 = var56[1];
              }
            } else {
              var8Lifetime1 = var56[1];
            }
            if (var56[0] < var6) {
              var6 = var56[0];
            } else {
              if (var56[0] > var7Lifetime1) {
                var7Lifetime1 = var56[0];
              }
            }
            hr.a((int) th.field_l[var5Lifetime1].field_p, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_a, (int) th.field_l[var5Lifetime1].field_f, (byte) 9);
            if (var6 > var56[0]) {
              var6 = var56[0];
            } else {
              if (var56[0] > var7Lifetime1) {
                var7Lifetime1 = var56[0];
              }
            }
            if (var8Lifetime1 > var56[1]) {
              var8Lifetime1 = var56[1];
            } else {
              if (var56[1] > var9) {
                var9 = var56[1];
              }
            }
            hr.a((int) th.field_l[var5Lifetime1].field_h, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_m, (int) th.field_l[var5Lifetime1].field_f, (byte) 9);
            if (var6 <= var56[0]) {
              if (var56[0] > var7Lifetime1) {
                var7Lifetime1 = var56[0];
              }
            } else {
              var6 = var56[0];
            }
            if (var8Lifetime1 <= var56[1]) {
              if (var9 < var56[1]) {
                var9 = var56[1];
              }
            } else {
              var8Lifetime1 = var56[1];
            }
            hr.a((int) th.field_l[var5Lifetime1].field_p, var56, oh.field_d, (int) th.field_l[var5Lifetime1].field_m, (int) th.field_l[var5Lifetime1].field_f, (byte) 9);
            if (var56[1] >= var8Lifetime1) {
              if (var9 < var56[1]) {
                var9 = var56[1];
              }
            } else {
              var8Lifetime1 = var56[1];
            }
            if (var6 > var56[0]) {
              var6 = var56[0];
            } else {
              if (var56[0] > var7Lifetime1) {
                var7Lifetime1 = var56[0];
              }
            }
          }
          if (qh.field_b > var6) {
            var6 = qh.field_b;
          }
          if (qh.field_c > var8Lifetime1) {
            var8Lifetime1 = qh.field_c;
          }
          if (qh.field_g < var9) {
            var9 = qh.field_g;
          }
          if (qh.field_j < var7Lifetime1) {
            var7Lifetime1 = qh.field_j;
          }
          for (var5Lifetime2 = -1 + eo.field_Qb; sb.field_d <= var5Lifetime2; var5Lifetime2--) {
            th.field_l[var5Lifetime2].c(6710886, oh.field_d);
          }
          var11 = lk.field_m;
          var12 = ag.field_c;
          for (var13 = var12 - 1; var11 <= var13; var13--) {
            th.field_l[ph.field_g[var13]].c(6710886, oh.field_d);
          }
          var27 = this.field_R;
          if (param0 != -55) {
            var15 = (di) null;
            this.c(92, (di) null);
          }
          var57 = oh.field_d;
          var27.a((byte) -112, 0, var27.field_j.length, var57);
          var11Lifetime1 = w.field_h;
          var12Lifetime1 = ol.field_a;
          for (var13Lifetime1 = -1 + var12Lifetime1; var11Lifetime1 <= var13Lifetime1; var13Lifetime1--) {
            th.field_l[ph.field_g[var13Lifetime1]].c(param0 + 6710941, oh.field_d);
          }
          if ((1073741824L & pd.field_i) == 0L) {
            this.a(var36, (byte) 65, false, var20, false);
          }
          var11Lifetime2 = hb.field_l;
          var12Lifetime2 = bf.field_k;
          for (var13Lifetime2 = var12Lifetime2 - 1; var13Lifetime2 >= var11Lifetime2; var13Lifetime2--) {
            th.field_l[ph.field_g[var13Lifetime2]].c(param0 ^ -6710865, oh.field_d);
          }
          if ((1073741824L & pd.field_i) == 0L) {
            param1.z((byte) 1);
          }
          if ((1073741824L & pd.field_i) == 0L) {
            for (var11Lifetime3 = 0; var20.length > var11Lifetime3; var11Lifetime3++) {
              if (var20[var11Lifetime3].field_s) {
                this.a(var36, var20[var11Lifetime3]);
              }
            }
          }
          var29 = this.field_bb;
          var58 = oh.field_d;
          var59 = this.field_kb;
          var29.a(false, 0, var29.field_j.length, (byte) -65, var58, var59);
          if ((1073741824L & pd.field_i) == 0L) {
            stackIn_136_0 = this;
            stackIn_136_1 = var4;
            stackIn_136_2 = 115;
            stackIn_136_3 = true;
            stackIn_136_4 = var3;
            if (param1.field_I.j(param0 ^ -45).field_q != 0) {
              stackIn_137_0 = this;
              stackIn_137_5 = false;
            } else {
              stackIn_137_0 = this;
              stackIn_137_5 = true;
            }
            this.a(stackIn_136_1, (byte) stackIn_136_2, stackIn_136_3, stackIn_136_4, stackIn_137_5);
          }
          var32 = this.field_bb;
          var60 = oh.field_d;
          var61 = this.field_kb;
          var32.a(true, 0, var32.field_j.length, (byte) 111, var60, var61);
          if ((pd.field_i & 1073741824L) == 0L) {
            param1.q(-1);
            param1.D(-126);
          }
          if ((pd.field_i & 256L) != 0L) {
            this.field_R.a(oh.field_d, 0);
            this.field_bb.a(oh.field_d, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_147_0 = var3_ref;
          stackIn_147_1 = new StringBuilder().append("ni.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_148_2 = "null";
          } else {
            stackIn_148_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_147_0), ((StringBuilder) (Object) stackIn_147_1).append(stackIn_148_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        nb dupTemp$0 = null;
        int var5;
        int var6;
        int var7;
        var7 = Pool.field_O;
        var5 = -40 % ((param2 + 44) / 56);
        var6 = param0;
        if (var6 != 5) {
          if (2 == var6) {
            kp.a(100, this.field_X, param3, param1);
          } else {
            if (var6 != 3) {
              if (0 == var6) {
                kp.a(100, this.field_fb, param3, param1);
              } else {
                if (var6 != 1) {
                  if (var6 == 4) {
                    dupTemp$0 = nb.a(this.field_Y, 100, param1, param3);
                    this.field_ab = dupTemp$0;
                    mn.a(-24296, dupTemp$0);
                  } else {
                    if (var6 != 6) {
                      super.a(param0, param1, (byte) -104, param3);
                    } else {
                      kp.a(100, this.field_cb, param3, param1);
                    }
                  }
                } else {
                  kp.a(100, this.field_W, param3, param1);
                }
              }
            } else {
              kp.a(100, this.field_Q, param3, param1);
            }
          }
        } else {
          kp.a(100, this.field_V, param3, param1);
        }
    }

    final void c(boolean param0) {
        int incrementValue$10 = 0;
        int incrementValue$9 = 0;
        so dupTemp$0 = null;
        so dupTemp$1 = null;
        so dupTemp$2 = null;
        so dupTemp$3 = null;
        so dupTemp$4 = null;
        eg[] dupTemp$5 = null;
        eg dupTemp$6 = null;
        eg[] dupTemp$7 = null;
        eg dupTemp$8 = null;
        Object stackIn_34_0;
        p[] stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        Object stackIn_35_0;
        boolean stackIn_35_4;
        so stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        int var2;
        int var3;
        eg[][] var4;
        int[][][] var5;
        int var6;
        int var7;
        eg[][] var8;
        int[][][] var9;
        int var10;
        int var11;
        so var12;
        int var12_int;
        so var13;
        p[] var13_array;
        eg[][] var14;
        int var14_int;
        int var15;
        eg var15_ref_eg;
        int var16;
        int var18;
        int var19;
        int var20;
        int[][][] var21;
        int[][][] var22;
        eg[] var23;
        int[][] var24;
        eg[] var25;
        int[][] var26;
        p[] var27;
        eg var28;
        so[] var29;
        eg var31;
        so[] var32;
        eg var34;
        so[] var35;
        so[] var37;
        int[][][] var38;
        int[][][] var39;
        int[] var46;
        int[] var47;
        int[] var48;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime8;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var12_intLifetime3;
        int var12_intLifetime4;
        int var12_intLifetime5;
        int var14_intLifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        var20 = Pool.field_O;
        var3 = -kj.field_b + eh.field_t;
        var4 = new eg[var3][];
        var38 = new int[var3][][];
        var21 = var38;
        var5 = var21;
        var6 = this.a(kj.field_b, var4, var38, -57, eh.field_t);
        var7 = -tj.field_fb + nd.field_m;
        var8 = new eg[var7][];
        var39 = new int[var7][][];
        var22 = var39;
        var9 = var22;
        var10 = this.a(tj.field_fb, var8, var39, -58, nd.field_m);
        for (var11 = 0; var11 < var4.length; var11++) {
          for (var12_int = 0; var12_int < var4[var11].length; var12_int++) {
            nd.a(var4[var11][var12_int], (byte) -37);
          }
        }
        for (var11Lifetime1 = 0; var8.length > var11Lifetime1; var11Lifetime1++) {
          for (var12_intLifetime1 = 0; var12_intLifetime1 < var8[var11Lifetime1].length; var12_intLifetime1++) {
            nd.a(var8[var11Lifetime1][var12_intLifetime1], (byte) -37);
          }
        }
        th.field_l = new p[-1 * (-ch.field_G + af.field_e) + -1 * (pf.field_k - fc.field_c) + (oo.field_I - uk.field_l) * 3 + (dp.field_l - qr.field_d) * 3 + (-var3 + (var6 + this.field_O.length + var10 + (-var7 + -1 * (-rb.field_a + rg.field_u))))];
        var11Lifetime2 = 0;
        vf.field_lb = var11Lifetime2;
        for (var2 = kj.field_b; var2 < eh.field_t; var2++) {
          var12_intLifetime2 = var11Lifetime2;
          var23 = var4[var2 - kj.field_b];
          var24 = var5[var2 - kj.field_b];
          for (var15 = 0; var15 < var23.length; var15++) {
            incrementValue$10 = var12_intLifetime2;
            var12_intLifetime2++;
            th.field_l[incrementValue$10] = new p((nc) (this.a(108, var23[var15])), new int[]{var24[var15][0], var24[var15][1], var24[var15][2]});
          }
          var11Lifetime2 = var11Lifetime2 + var4[-kj.field_b + var2].length;
        }
        sb.field_d = var11Lifetime2;
        ma.field_g = var11Lifetime2;
        for (var2Lifetime1 = tj.field_fb; nd.field_m > var2Lifetime1; var2Lifetime1++) {
          var12_intLifetime3 = var11Lifetime2;
          var25 = var8[var2Lifetime1 - tj.field_fb];
          var26 = var9[-tj.field_fb + var2Lifetime1];
          for (var15 = 0; var15 < var25.length; var15++) {
            incrementValue$9 = var12_intLifetime3;
            var12_intLifetime3++;
            th.field_l[incrementValue$9] = new p((nc) (this.a(0, var25[var15])), new int[]{var26[var15][0], var26[var15][1], var26[var15][2]});
          }
          var11Lifetime2 = var11Lifetime2 + var8[-tj.field_fb + var2Lifetime1].length;
        }
        if (!param0) {
          return;
        }
        eo.field_Qb = var11Lifetime2;
        lk.field_m = var11Lifetime2;
        for (var2Lifetime2 = qr.field_d; dp.field_l > var2Lifetime2; var2Lifetime2++) {
          var12_intLifetime4 = var2Lifetime2;
          var27 = th.field_l;
          var14_int = var11Lifetime2;
          this.a(var27, 0, 0, false, this.field_O[var12_intLifetime4], var14_int, this.field_M[var12_intLifetime4], 0);
          var11Lifetime2 += 4;
        }
        ag.field_c = var11Lifetime2;
        hb.field_l = var11Lifetime2;
        for (var2Lifetime3 = uk.field_l; oo.field_I > var2Lifetime3; var2Lifetime3++) {
          var12_intLifetime5 = var2Lifetime3;
          var13_array = th.field_l;
          var14_intLifetime1 = var11Lifetime2;
          stackIn_34_0 = this;
          stackIn_34_1 = var13_array;
          stackIn_34_2 = 0;
          stackIn_34_3 = 0;
          if (param0) {
            stackIn_35_0 = this;
            stackIn_35_4 = false;
          } else {
            stackIn_35_0 = this;
            stackIn_35_4 = true;
          }
          this.a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_35_4, this.field_O[var12_intLifetime5], var14_intLifetime1, this.field_M[var12_intLifetime5], 0);
          var11Lifetime2 += 4;
        }
        bf.field_k = var11Lifetime2;
        dupTemp$0 = new so(4 * (af.field_e - ch.field_G));
        this.field_jb = dupTemp$0;
        dupTemp$1 = new so(new so[]{dupTemp$0});
        this.field_bb = dupTemp$1;
        dupTemp$2 = new so(4 * (af.field_e - ch.field_G));
        this.field_U = dupTemp$2;
        dupTemp$3 = new so(4 * (-fc.field_c + pf.field_k) + (rg.field_u - rb.field_a) * 2);
        this.field_gb = dupTemp$3;
        dupTemp$4 = new so(new so[]{dupTemp$2, dupTemp$3});
        this.field_R = dupTemp$4;
        var12 = new so(new so[]{dupTemp$1, dupTemp$4});
        var13 = new so(new so[]{this.field_jb, this.field_U});
        var14 = new eg[af.field_e - ch.field_G][2];
        for (var2Lifetime4 = ch.field_G; var2Lifetime4 < af.field_e; var2Lifetime4++) {
          dupTemp$5 = var14[var2Lifetime4 - ch.field_G];
          dupTemp$6 = hq.b((byte) 125);
          dupTemp$5[0] = dupTemp$6;
          var15_ref_eg = dupTemp$6;
          dupTemp$7 = var14[-ch.field_G + var2Lifetime4];
          dupTemp$8 = hq.b((byte) 127);
          dupTemp$7[1] = dupTemp$8;
          var28 = dupTemp$8;
          ej.a(0, var15_ref_eg, 0, false, -this.field_M[var2Lifetime4][2], 0, 0, 1, var28, this.field_O[var2Lifetime4]);
        }
        var15 = 0;
        for (var2Lifetime5 = ch.field_G; af.field_e > var2Lifetime5; var2Lifetime5++) {
          var31 = var14[var2Lifetime5 - ch.field_G][1];
          var46 = this.field_M[var2Lifetime5];
          var29 = this.field_U.field_b;
          var19 = var15;
          bh.a(var29, false, var46[1] - 0, var46[2] + 0, var31, 0 + var46[0], var19);
          var15 += 4;
        }
        var15 = 0;
        for (var2Lifetime6 = ch.field_G; var2Lifetime6 < af.field_e; var2Lifetime6++) {
          var34 = var14[var2Lifetime6 - ch.field_G][0];
          var47 = this.field_M[var2Lifetime6];
          var32 = this.field_jb.field_b;
          var19Lifetime1 = var15;
          bh.a(var32, false, 0 + var47[1], var47[2] - 0, var34, 0 + var47[0], var19Lifetime1);
          var15 += 4;
        }
        var15 = 0;
        for (var2Lifetime7 = fc.field_c; var2Lifetime7 < pf.field_k; var2Lifetime7++) {
          var16 = var2Lifetime7;
          var35 = this.field_gb.field_b;
          var18 = var15;
          var48 = this.field_M[var16];
          bh.a(var35, false, var48[1], var48[2], this.field_O[var16], var48[0], var18);
          var15 += 4;
        }
        for (var2Lifetime8 = rb.field_a; rg.field_u > var2Lifetime8; var2Lifetime8++) {
          var16Lifetime1 = var2Lifetime8;
          var37 = this.field_gb.field_b;
          var18Lifetime1 = var15;
          be.a(var18Lifetime1, this.field_M[var16Lifetime1][1], this.field_M[var16Lifetime1][2], 1, var37, this.field_M[var16Lifetime1][0], this.field_O[var16Lifetime1]);
          var15 += 2;
        }
        var12.a(0);
        stackIn_53_0 = var13;
        stackIn_54_1 = (param0) ? false : true;
        ((so) (Object) stackIn_53_0).a(stackIn_54_1);
        var12.a(this.field_q, this.field_e, this.field_F, (byte) -122, this.field_u, this.field_C);
        this.field_bb.d(104);
        this.field_kb = new boolean[this.field_bb.field_j.length];
        this.field_R.d(116);
        w.field_h = var11Lifetime2;
        ol.field_a = var11Lifetime2;
        return;
    }

    final void i(int param0) {
        super.i(param0);
        this.field_v = 5609813;
    }

    final void c(int param0, di param1) {
        try {
          if (param0 != -23569) {
            this.field_U = (so) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ni.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_Z = null;
        field_S = null;
        if (param0 != 71) {
          field_S = (String) null;
        }
        field_eb = null;
    }

    final void a(int param0, di param1) {
        try {
          this.field_b = cg.a(param1, "", "pool_modern");
          this.field_n = cg.a(param1, "", "lose_jingle");
          this.field_i = cg.a(param1, "", "win_jingle");
          if (param0 != 1) {
            this.a(108, 33, (byte) 117, 21);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ni.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, di param1) {
        try {
          this.field_B = new dd(param1.a(false, "modern-sky.jpg", ""), (java.awt.Component) ((Object) pa.field_K));
          if (param0 != 5) {
            uf var4 = (uf) null;
            this.a(false, (uf) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ni.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, uf param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        mm stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 128 + param1.field_eb.b(-127);
          if (param0) {
            this.c(true);
          }
          if (var3_int > 0) {
            stackIn_6_0 = param1.field_eb;
            stackIn_7_1 = !(param0);
            var4 = (int)(-((mm) (Object) stackIn_6_0).a(stackIn_7_1) * (double)this.field_B.field_z / 2.0 / 3.141592653589793);
            var5 = -this.field_B.field_A + var3_int;
            this.field_B.a(-this.field_B.field_z + var4, var5);
            if (var4 < this.field_B.field_z - 640) {
              this.field_B.a(var4, var5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ni.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(di param0, int param1) {
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var22 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        eg[] var14 = null;
        int var15 = 0;
        eg[] var16 = null;
        eg[] var19 = null;
        int[] var20 = null;
        eg var23 = null;
        eg[] var25 = null;
        int[] var26 = null;
        eg var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        eg[] var31 = null;
        eg var32 = null;
        eg[] var34 = null;
        int[] var35 = null;
        eg var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        eg[] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var53 = null;
        int[] var54 = null;
        eg[] var14Lifetime1;
        eg[] var16Lifetime1;
        eg[] var19Lifetime1;
        int[] var20Lifetime1;
        int[] var20Lifetime2;
        int[] var20Lifetime3;
        int[] var20Lifetime4;
        int[] var20Lifetime1Lifetime1;
        int[] var20Lifetime1Lifetime2;
        int[] var20Lifetime1Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var15Lifetime1;
        var22 = Pool.field_O;
        try {
          this.field_O = new eg[11];
          var3_int = 0;
          kj.field_b = var3_int;
          incrementValue$11 = var3_int;
          var3_int++;
          this.field_O[incrementValue$11] = eg.a(param0, "", "new_classic_table/floor_texture");
          eh.field_t = var3_int;
          tj.field_fb = var3_int;
          incrementValue$12 = var3_int;
          var3_int++;
          this.field_O[incrementValue$12] = eg.a(param0, "", "new_classic_table/floor_shadow");
          nd.field_m = var3_int;
          qr.field_d = var3_int;
          incrementValue$13 = var3_int;
          var3_int++;
          this.field_O[incrementValue$13] = eg.a(param0, "", "new_classic_table/class_leg");
          fc.field_c = var3_int;
          dp.field_l = var3_int;
          incrementValue$14 = var3_int;
          var3_int++;
          this.field_O[incrementValue$14] = eg.a(param0, "", "new_classic_table/class_hole_a");
          pf.field_k = var3_int;
          rb.field_a = var3_int;
          incrementValue$15 = var3_int;
          var3_int++;
          this.field_O[incrementValue$15] = eg.a(param0, "", "new_classic_table/class_hole_b");
          ch.field_G = var3_int;
          rg.field_u = var3_int;
          incrementValue$16 = var3_int;
          var3_int++;
          this.field_O[incrementValue$16] = eg.a(param0, "", "new_classic_table/class_corner");
          incrementValue$17 = var3_int;
          var3_int++;
          this.field_O[incrementValue$17] = eg.a(param0, "", "new_classic_table/class_side_a");
          incrementValue$18 = var3_int;
          var3_int++;
          this.field_O[incrementValue$18] = eg.a(param0, "", "new_classic_table/class_side_b");
          if (param1 >= -43) {
            return;
          }
          incrementValue$19 = var3_int;
          var3_int++;
          this.field_O[incrementValue$19] = eg.a(param0, "", "new_classic_table/class_side_c");
          af.field_e = var3_int;
          uk.field_l = var3_int;
          incrementValue$20 = var3_int;
          var3_int++;
          this.field_O[incrementValue$20] = eg.a(param0, "", "new_classic_table/classic_top_a");
          incrementValue$21 = var3_int;
          var3_int++;
          this.field_O[incrementValue$21] = eg.a(param0, "", "new_classic_table/classic_top_b");
          oo.field_I = var3_int;
          this.field_A = new jk();
          this.field_A.a(eg.a(param0, "", "cues/classic_cue"), (byte) -121);
          for (var4 = 0; var4 < this.field_O.length; var4++) {
            db.a(0, this.field_O[var4]);
          }
          var5 = 2147483647;
          var6 = -2147483648;
          var7 = 2147483647;
          var8 = -2147483648;
          var9 = 2147483647;
          var10 = -2147483648;
          for (var4Lifetime1 = uk.field_l; var4Lifetime1 < oo.field_I; var4Lifetime1++) {
            d.a(this.field_O[var4Lifetime1], -23109);
            if (var5 > this.field_O[var4Lifetime1].field_D) {
              var5 = this.field_O[var4Lifetime1].field_D;
            }
            if (this.field_O[var4Lifetime1].field_w > var6) {
              var6 = this.field_O[var4Lifetime1].field_w;
            }
            if (this.field_O[var4Lifetime1].field_y < var7) {
              var7 = this.field_O[var4Lifetime1].field_y;
            }
            if (this.field_O[var4Lifetime1].field_x > var10) {
              var10 = this.field_O[var4Lifetime1].field_x;
            }
            if (this.field_O[var4Lifetime1].field_S > var8) {
              var8 = this.field_O[var4Lifetime1].field_S;
            }
            if (this.field_O[var4Lifetime1].field_V < var9) {
              var9 = this.field_O[var4Lifetime1].field_V;
            }
          }
          var7 = -var8 + var7 * 2;
          var5 = -var6 + var5 * 2;
          var11 = (var6 + var5) / 2;
          var12 = (var8 + var7) / 2;
          var13 = var10;
          for (var4Lifetime2 = 0; this.field_O.length > var4Lifetime2; var4Lifetime2++) {
            cq.a(var11, 59, var13, this.field_O[var4Lifetime2], var12);
          }
          this.field_M = new int[this.field_O.length][3];
          for (var4Lifetime3 = 0; this.field_O.length > var4Lifetime3; var4Lifetime3++) {
            ln.a(this.field_M[var4Lifetime3], 0, this.field_O[var4Lifetime3]);
          }
          for (var4Lifetime4 = kj.field_b; var4Lifetime4 < eh.field_t; var4Lifetime4++) {
            var31 = new eg[4];
            var14 = var31;
            var15 = var4Lifetime4;
            var16 = var14;
            var23 = this.field_O[var15];
            var53 = this.field_M[var15];
            var25 = var16;
            var19 = var25;
            var27 = a.a(true, new eg(var23, false, false, false, false));
            var42 = mj.a(-31121);
            var26 = var42;
            var20 = var26;
            var20[1] = var53[1] + 0;
            var20[2] = var53[2] - 0;
            var20[0] = var53[0] + 0;
            var19[0] = new eg(var23, false, false, false, false);
            var25[0].a(var42);
            var43 = mj.a(-31121);
            var28 = var43;
            var20Lifetime2 = var28;
            var20Lifetime2[1] = -(0 + var53[1]);
            var20Lifetime2[0] = 0 + var53[0];
            var20Lifetime2[2] = var53[2] + 0;
            var19[1] = new eg(var27, false, false, false, false);
            var25[1].a(var43);
            var44 = mj.a(-31121);
            var29 = var44;
            var20Lifetime3 = var29;
            var20Lifetime3[1] = 0 + var53[1];
            var20Lifetime3[0] = var53[0] - 0;
            var20Lifetime3[2] = var53[2] - 0;
            dq.a((byte) 45, var44);
            var19[2] = new eg(var23, false, false, false, false);
            var25[2].a(var44);
            var45 = mj.a(-31121);
            var30 = var45;
            var20Lifetime4 = var30;
            var20Lifetime4[2] = 0 + var53[2];
            var20Lifetime4[1] = -(var53[1] + 0);
            var20Lifetime4[0] = var53[0] + 0;
            dq.a((byte) 75, var45);
            var19[3] = new eg(var27, false, false, false, false);
            var25[3].a(var45);
            this.field_O[var4Lifetime4] = new eg(var31, 4);
          }
          for (var4Lifetime5 = tj.field_fb; nd.field_m > var4Lifetime5; var4Lifetime5++) {
            var40 = new eg[4];
            var14Lifetime1 = var40;
            var15Lifetime1 = var4Lifetime5;
            var16Lifetime1 = var14Lifetime1;
            var32 = this.field_O[var15Lifetime1];
            var54 = this.field_M[var15Lifetime1];
            var34 = var16Lifetime1;
            var19Lifetime1 = var34;
            var36 = a.a(true, new eg(var32, false, false, false, false));
            var47 = mj.a(-31121);
            var35 = var47;
            var20Lifetime1 = var35;
            var20Lifetime1[1] = 0 + var54[1];
            var20Lifetime1[0] = 0 + var54[0];
            var20Lifetime1[2] = var54[2] + 0;
            var19Lifetime1[0] = new eg(var32, false, false, false, false);
            var34[0].a(var47);
            var48 = mj.a(-31121);
            var37 = var48;
            var20Lifetime1Lifetime1 = var37;
            var20Lifetime1Lifetime1[1] = -(var54[1] - 0);
            var20Lifetime1Lifetime1[2] = 0 + var54[2];
            var20Lifetime1Lifetime1[0] = 0 + var54[0];
            var19Lifetime1[1] = new eg(var36, false, false, false, false);
            var34[1].a(var48);
            var49 = mj.a(-31121);
            var38 = var49;
            var20Lifetime1Lifetime2 = var38;
            var20Lifetime1Lifetime2[2] = 0 + var54[2];
            var20Lifetime1Lifetime2[1] = 0 + var54[1];
            var20Lifetime1Lifetime2[0] = var54[0] + 0;
            dq.a((byte) -123, var49);
            var19Lifetime1[2] = new eg(var32, false, false, false, false);
            var34[2].a(var49);
            var50 = mj.a(-31121);
            var39 = var50;
            var20Lifetime1Lifetime3 = var39;
            var20Lifetime1Lifetime3[0] = var54[0] - 0;
            var20Lifetime1Lifetime3[1] = -(var54[1] + 0);
            var20Lifetime1Lifetime3[2] = 0 + var54[2];
            dq.a((byte) -122, var50);
            var19Lifetime1[3] = new eg(var36, false, false, false, false);
            var34[3].a(var50);
            this.field_O[var4Lifetime5] = new eg(var40, 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("ni.KA(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(cf param0, int param1) {
        try {
          this.field_X = param0.a("ball_hard", true, "");
          this.field_Q = param0.a("ball_soft", true, "");
          this.field_fb = param0.a("cue_hard", true, "");
          int var3_int = 84 / ((param1 - 39) / 38);
          this.field_W = param0.a("cue_soft", true, "");
          this.field_Y = param0.a("pot_ball_pocket", true, "");
          this.field_db = param0.a("pot_ball_mechanism", true, "");
          this.field_cb = param0.a("respot_the_white", true, "");
          this.field_V = param0.a("cushion", true, "");
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ni.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void f(byte param0) {
        int var2 = Pool.field_O;
        if (param0 != -119) {
          field_eb = (he) null;
        }
        if ((ba.field_ub.field_I.field_b & 1 << ba.field_ub.field_db) != 0) {
          nk.field_f[12] = ba.field_ub.field_r ? w.field_l : df.field_m;
        } else {
          if (ba.field_ub.field_I.field_b != 0) {
            nk.field_f[12] = ba.field_ub.field_r ? hb.field_n : er.field_N;
          } else {
            if (-1 + (1 << ba.field_ub.field_I.field_n) == (ba.field_ub.field_cb | 1 << ba.field_ub.field_db)) {
              nk.field_f[12] = ba.field_ub.field_r ? e.field_b : fq.field_Bb;
            } else {
              nk.field_f[12] = !ba.field_ub.field_r ? ia.field_j : og.field_H;
            }
          }
        }
        if (ne.field_w >= 0) {
          s.field_c[ne.field_w].c((byte) -126);
        }
    }

    ni() {
        this.field_E = 1508.0;
        this.field_p = 1.5707963705062866;
        this.field_d = 64;
        this.field_x = 85;
        this.field_C = 64;
        this.field_j = 1.7627825736999512;
        this.field_m = 85;
        this.b(126);
    }

    static {
        field_eb = new he();
        field_ib = null;
        field_S = "No highscores";
    }
}
