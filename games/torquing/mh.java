/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    private int field_b;
    db field_a;
    private int field_h;
    static sm[] field_d;
    static int[] field_k;
    static String[] field_f;
    private Torquing field_c;
    static boolean field_g;
    int field_i;
    private int field_j;
    private int field_e;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ph.c(param1, param7, param5, param4, 7, param0);
        ph.e(param1, param7, param5, param4, 7, param6);
        int var10 = 121 % ((-55 - param3) / 58);
        int[] var13 = new int[4];
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var9 = var11;
        ph.b(var13);
        ph.f(param1, param7, param5 + param1, param7 + 3);
        ph.e(param1, param7, param5, param4, 7, param2);
        ph.a(var13);
        ph.f(param1, param7, param1 + 3, param7 + param4);
        ph.e(param1, param7, param5, param4, 7, param2);
        ph.a(var13);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        pk stackIn_29_0;
        String stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        int stackIn_30_4;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        pk stackIn_65_0;
        String stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        int stackIn_66_4;
        pk stackIn_85_0;
        String stackIn_85_1;
        int stackIn_85_2;
        int stackIn_85_3;
        int stackIn_86_4 = 0;
        int stackIn_88_5;
        int stackIn_89_6 = 0;
        int stackIn_97_0 = 0;
        int stackIn_105_0 = 0;
        t stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        int stackIn_131_3 = 0;
        int stackIn_135_0 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        t var14_ref_t = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        t var17_ref_t = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        String var24 = null;
        var22 = Torquing.field_u;
        var5 = this.b(param2, 1);
        var6 = var5 + this.a((byte) -125, param2) >> 1;
        var7 = de.field_c[this.field_h];
        var8 = rf.field_q[this.field_h][param2];
        var23 = hb.field_u[var8];
        var9 = var23;
        var9 = var23;
        var24 = var23;
        var9 = var24;
        var9 = var24;
        var9 = var24;
        var10 = i.field_Q.a(hb.field_u[2]);
        var11 = i.field_Q.a(hb.field_u[13]);
        stackIn_3_0 = (var11 < var10) ? var10 : var11;
        var12 = stackIn_3_0;
        if (param3 != 0) {
          this.field_j = 99;
        }
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var13 = var8;
        if ((var13 != 2 &&
          var13 != 13) &&
          (decompiledFrameRemainder0 = (var13 != 10)) &&
          (decompiledFrameRemainder1 = (var13 != 18 ||
          var22 != 0))) {
          if (var13 == 19 &&
            var22 == 0) {
            var13 = wi.field_a[rn.field_j];
            stackIn_54_0 = (param0) ? 9 : 1;
            var14 = stackIn_54_0;
            stackIn_57_0 = (param0) ? 10 : 8;
            var15 = stackIn_57_0;
            if (~wi.field_a.length == ~nh.field_k) {
              stackIn_60_0 = wi.field_a[-1 + nh.field_k] + 1;
            } else {
              stackIn_60_0 = wi.field_a[nh.field_k];
            }
            var16 = stackIn_60_0;
            var17 = qc.field_ab[var13];
            var18 = hg.field_d[rn.field_j];
            if (var16 > var13) {
              stackIn_63_0 = var17;
            } else {
              stackIn_63_0 = hg.field_d[nh.field_k];
            }
            var19 = stackIn_63_0;
            param1 = 157;
            stackIn_65_0 = i.field_Q;
            stackIn_65_1 = lj.field_b;
            stackIn_65_2 = 104;
            stackIn_65_3 = 24 + param1;
            if (param0) {
              stackIn_66_4 = 9;
            } else {
              stackIn_66_4 = 1;
            }
            ((pk) (Object) stackIn_65_0).c(stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_66_4, -1);
            var20 = 168;
            var21 = 0;
            while (true) {
              if (var21 >= var17) {
                return;
              }
              if (~var18 != ~var21) {
                if (this.field_a.field_k &&
                  var21 != var18 &&
                  var21 <= var19 &&
                  n.field_t >= -3 + var20 &&
                  k.field_e >= (-2 + param1) &&
                  n.field_t < (i.field_N.a((char)(49 + var21)) + (var20 + 3)) &&
                  k.field_e < (24 + i.field_N.field_t + (param1 + 6))) {
                  this.a(15000804, -3 + var20, 11184810, 82, 8 + (i.field_N.field_t + 24), 6 + i.field_N.a((char)(var21 + 49)), 1052688, param1 - 2);
                } else if (~var21 != ~var18 &&
                  var21 <= var19) {
                  this.a(14211288, -3 + var20, 8947848, 7, i.field_N.field_t + 24 + 8, 6 + i.field_N.a((char)(49 + var21)), 8947848, -2 + param1);
                }
              } else {
                this.a(10526880, var20 - 3, 1052688, -121, 8 + (24 + i.field_N.field_t), i.field_N.a((char)(49 + var21)) + 6, 11184810, -2 + param1);
              }
              i.field_Q.field_O[8][1] = 16776960;
              stackIn_85_0 = i.field_Q;
              stackIn_85_1 = Integer.toString(var21 + 1);
              stackIn_85_2 = var20;
              stackIn_85_3 = 24 + param1;
              if (var21 != var18) {
                stackIn_86_4 = var14;
              } else {
                stackIn_86_4 = var15;
              }
              stackIn_88_5 = -1;
              if (var21 <= var19) {
                stackIn_89_6 = 256;
              } else {
                stackIn_89_6 = 64;
              }
              ((pk) (Object) stackIn_85_0).a(stackIn_85_1, stackIn_85_2, stackIn_85_3, stackIn_86_4, stackIn_88_5, stackIn_89_6);
              var20 += 40;
              var21++;
            }
          }
          decompiledFrameRemainder2 = (var13 == 20);
          if (decompiledFrameRemainder2) {
            if (this.field_h == 3) {
              param1 = 307;
            }
            var13 = 320 - (um.field_m.a(var24) >> 1);
            stackIn_97_0 = (40 < var7) ? 40 : var7;
            var14 = stackIn_97_0;
            var15 = 0;
            do {
              if (hq.field_d.length <= var15) {
                return;
              }
              var16 = 1;
              if (~var15 == ~ld.field_k) {
                if (!this.field_a.field_k &&
                  param0) {
                  stackIn_105_0 = 9;
                } else {
                  stackIn_105_0 = 6;
                }
                var16 = stackIn_105_0;
              }
              if (this.field_a.field_k &&
                param0 &&
                n.field_t >= var13 &&
                param1 <= k.field_e &&
                k.field_e < (var14 + param1) &&
                n.field_t < (um.field_m.a(hq.field_d[var15]) + var13)) {
                var16 = 9;
              }
              var17 = um.field_m.a(hq.field_d[var15]);
              i.field_Q.c(hq.field_d[var15], var13 + (var17 >> 1), param1 + um.field_m.field_x, var16, -1);
              var13 = var13 + var17;
              if (2 != var15) {
                var17 = um.field_m.a(" / ");
                i.field_Q.c(" / ", (var17 >> 1) + var13, um.field_m.field_x + param1, 0, -1);
                var13 = var13 + var17;
              }
              var15++;
            } while (var22 == 0);
            return;
          }
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          var13 = -(var12 + 160 >> 1) + var6 + var12;
          if (var8 != 2) {
            stackIn_19_0 = of.field_m;
          } else {
            stackIn_19_0 = on.field_c;
          }
          var14 = stackIn_19_0;
          pp.a(var13 + 3, (byte) -128, 14145495, 5 + param1, 14145495);
          wf.a(param1 + 5, 14145495, 126, var13 + 3 + var14, 14145495);
          pp.a(var13 + 2, (byte) -126, 8947848, 4 + param1, 8947848);
          wf.a(param1 + 4, 8947848, 126, var14 + 2 + var13, 8947848);
          pp.a(var13 + 1, (byte) -128, 6710886, 3 + param1, 6710886);
          wf.a(3 + param1, 6710886, param3 ^ 36, var13 + 1 + var14, 6710886);
          if (!param0) {
            stackIn_22_0 = i.field_Q.field_O[1][1];
          } else {
            stackIn_22_0 = i.field_Q.field_O[9][1];
          }
          var15 = stackIn_22_0;
          pp.a(var13, (byte) -125, var15, param1 + 2, 0);
          wf.a(2 + param1, var15, 126, var13 + var14, 0);
          decompiledFrameRemainder2 = (var22 != 0);
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1)) {
          var9 = var23 + po.field_t[sg.field_f];
          decompiledFrameRemainder2 = (var22 != 0);
        }
        if (decompiledFrameRemainder2) {
          var13 = wi.field_a[rn.field_j];
          if (~nh.field_k != ~wi.field_a.length) {
            stackIn_27_0 = wi.field_a[nh.field_k];
          } else {
            stackIn_27_0 = 1 + wi.field_a[-1 + nh.field_k];
          }
          var14 = stackIn_27_0;
          stackIn_29_0 = i.field_Q;
          stackIn_29_1 = wa.field_c;
          stackIn_29_2 = 104;
          stackIn_29_3 = 108;
          if (param0) {
            stackIn_30_4 = 9;
          } else {
            stackIn_30_4 = 1;
          }
          ((pk) (Object) stackIn_29_0).c(stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_30_4, -1);
          var15 = 168;
          param1 = 72;
          var16 = 0;
          while (var16 < 8) {
            var17_ref_t = rp.field_b[var16];
            if (var22 != 0) {
              return;
            }
            if (var13 != var16) {
              if (!this.field_a.field_k ||
                var14 < var16 ||
                !(n.field_t >= (var15 - 3)) ||
                !((-3 + param1) <= k.field_e) ||
                !(n.field_t < (var15 + var17_ref_t.field_s + 3)) ||
                !(3 + (var17_ref_t.field_u + param1) > k.field_e)) {
                if (var14 >= var16) {
                  this.a(14211288, var15 - 3, 8947848, 111, var17_ref_t.field_u + 6, 6 + var17_ref_t.field_s, 8947848, -3 + param1);
                  rp.field_b[var16 + 8].d(var15, param1);
                } else {
                  var17_ref_t.e(var15, param1, 96);
                }
              } else {
                this.a(15000804, -3 + var15, 11184810, param3 + 72, var17_ref_t.field_u + 6, 6 + var17_ref_t.field_s, 1052688, -3 + param1);
                rp.field_b[var16 + 16].d(var15, param1);
              }
            } else {
              this.a(10526880, var15 - 3, 1052688, -123, 6 + var17_ref_t.field_u, var17_ref_t.field_s + 6, 11184810, -3 + param1);
              rp.field_b[24 + var16].d(var15, param1);
            }
            var15 = var15 + (var17_ref_t.field_s + 10);
            var16++;
          }
          i.field_Q.c(jp.field_n[var13], 314, 123 + um.field_m.field_x, 0, -1);
          return;
        }
        if (this.field_h == 9) {
          param1 = param1 - (var7 << 1);
        }
        var13 = var5;
        if (3 == this.field_h &&
          var8 == 14) {
          param1 = 205;
          var6 = 320;
          var13 = 156;
        }
        if (2 == var8 ||
          var8 == 13) {
          var6 = var6 - (160 + var12 >> 1);
          var6 = var6 + (var12 >> 1);
        }
        boolean decompiledSharedTail0 = (var9 != null);
        if (!decompiledSharedTail0) {
          var14_ref_t = dj.field_a[kh.field_p[var8]];
          stackIn_130_0 = var14_ref_t;
          stackIn_130_1 = var13;
          stackIn_130_2 = param1;
          if (!param0) {
            stackIn_131_3 = i.field_Q.field_O[1][1];
          } else {
            stackIn_131_3 = i.field_Q.field_O[9][1];
          }
          ((t) (Object) stackIn_130_0).d(stackIn_130_1, stackIn_130_2, stackIn_131_3);
          decompiledSharedTail0 = (var22 != 0);
        }
        if (decompiledSharedTail0) {
          stackIn_135_0 = (param0) ? 9 : 1;
          var14 = stackIn_135_0;
          i.field_Q.c(var9, var6, param1 + 24, var14, -1);
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 23) {
          field_f = (String[]) null;
        }
        if (rf.field_x[this.field_h]) {
          return bp.field_b[this.field_h];
        }
        return ok.field_C[this.field_h] + de.field_c[this.field_h] * param1;
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_104_0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        t var13 = null;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        String var17 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13_intLifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var8Lifetime1Lifetime1;
        var15 = Torquing.field_u;
        if (param1 <= 77) {
          this.field_j = -33;
        }
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        var4 = bp.field_b[this.field_h];
        var5 = up.field_e[this.field_h];
        var6 = ok.field_C[this.field_h];
        var7 = de.field_c[this.field_h];
        if (this.field_h != 2) {
          if (this.field_h == 3 &&
            116 <= param0 &&
            param0 < 525) {
            if ((je.a((byte) 102)) &&
              (decompiledFrameRemainder0 = !(param2 < 205)) &&
              (decompiledFrameRemainder0 = !(param2 >= 245))) {
              return 2;
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(param2 < 307)) &&
              (decompiledFrameRemainder0 = !(param2 >= 347))) {
              return 2;
            }
          }
          if (decompiledFrameRemainder0) {
            if ((9 != this.field_h) &&
              (decompiledFrameRemainder0 = (this.field_h == 6 ||
              this.field_h == 8 ||
              7 == this.field_h ||
              10 == this.field_h))) {
              if (param2 < var6) {
                return -1;
              }
              var8 = (param2 - var6) / var7;
              if (this.field_a.field_i <= var8) {
                return -1;
              }
              if (40 < var7 &&
                var7 * var8 + var6 + 40 < param2) {
                return -1;
              }
              var9 = var5 + var4 >> 1;
              var10 = rf.field_q[this.field_h][var8];
              var11 = um.field_m.a(hb.field_u[var10]);
              if ((var9 - (var11 >> 1)) <= param0 &&
                param0 < (var9 + (var11 >> 1))) {
                return var8;
              }
              return -1;
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted2 = true;
              if (69 <= param2 &&
                param2 < 3 + (72 + rp.field_b[0].field_u)) {
                var8Lifetime2 = 165;
                var9Lifetime2 = 6 + var8Lifetime2;
                var10Lifetime2 = 0;
                while (8 > var10Lifetime2) {
                  var9Lifetime2 = var9Lifetime2 + (10 + rp.field_b[var10Lifetime2].field_s);
                  var10Lifetime2++;
                  if (var15 != 0) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                }
                if ((decompiledFrameCompleted2) &&
                  (var8Lifetime2 <= param0 &&
                  var9Lifetime2 > param0)) {
                  return 0;
                }
              }
              if (155 <= param2 &&
                6 + (i.field_N.field_t + 181) > param2) {
                var8Lifetime3 = wi.field_a[rn.field_j];
                var9Lifetime3 = qc.field_ab[var8Lifetime3];
                var10Lifetime3 = 165;
                var11Lifetime1 = 6 + i.field_N.a((char)(var9Lifetime3 + 48)) + ((-1 + var9Lifetime3) * 40 + var10Lifetime3);
                if (param0 >= var10Lifetime3 &&
                  param0 < var11Lifetime1) {
                  return 1;
                }
              }
              var8Lifetime4 = var6;
              var9Lifetime4 = 2;
              while (rf.field_q[this.field_h].length > var9Lifetime4) {
                var10Lifetime4 = rf.field_q[this.field_h][var9Lifetime4];
                var16 = hb.field_u[var10Lifetime4];
                var12 = i.field_N.a(var16);
                var13_int = param0 - (-(var12 >> 1) + 164) - (var4 - 2);
                var14 = -var8Lifetime4 - (-2 - param2);
                stackIn_104_0 = ~var13_int;
                if (var15 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_104_0 <= -1 &&
                  var14 >= 0 &&
                  var13_int < var12 + 6 &&
                  24 + (i.field_N.field_t + 8) > var14) {
                  return var9Lifetime4;
                }
                var8Lifetime4 = var8Lifetime4 + var7;
                var9Lifetime4++;
              }
              if (decompiledFrameCompleted1) {
                return -1;
              }
            }
          }
        }
        if ((decompiledFrameRemainder0) && (decompiledFrameCompleted1) && (param2 > -8 + lp.field_c &&
          param2 < um.field_m.field_x + lp.field_c + 8)) {
          if ((ea.field_v - 8) < param0 &&
            ea.field_v + i.field_N.a('<') > param0) {
            return -1;
          }
          if (param0 > (vd.field_f - 8) &&
            vd.field_f + i.field_N.a('>') > param0) {
            return -1;
          }
        }
        if (decompiledFrameCompleted1) {
          if (!rf.field_x[this.field_h]) {
            if (param0 >= var4 &&
              param0 < var5) {
              if (param2 < var6) {
                return -1;
              }
              var8Lifetime1 = (-var6 + param2) / var7;
              if (this.field_a.field_i <= var8Lifetime1) {
                return -1;
              }
              if (var7 > 40 &&
                param2 > 40 + (var7 * var8Lifetime1 + var6)) {
                var8Lifetime1 = -1;
              }
              return var8Lifetime1;
            }
            return -1;
          }
          if (var4 <= param2 &&
            param2 < var5) {
            var8Lifetime1Lifetime1 = var6;
            var9Lifetime1 = 0;
            while (var9Lifetime1 < this.field_a.field_i) {
              var10Lifetime1 = rf.field_q[this.field_h][var9Lifetime1];
              stackIn_104_0 = 3;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_104_0 != this.field_h ||
                var10Lifetime1 != 14 ||
                var15 != 0) {
                var17 = hb.field_u[var10Lifetime1];
                if (this.c(4, var9Lifetime1)) {
                  if (var17 != null) {
                    var12Lifetime1 = var8Lifetime1Lifetime1 + (var7 >> 1);
                    var13_intLifetime1 = um.field_m.a(var17);
                    if ((-(var13_intLifetime1 >> 1) + var12Lifetime1) <= param0 &&
                      (var13_intLifetime1 >> 1) + var12Lifetime1 > param0) {
                      return var9Lifetime1;
                    }
                  } else {
                    var12Lifetime1 = kh.field_p[rf.field_q[this.field_h][var9Lifetime1]];
                    var13 = dj.field_a[var12Lifetime1];
                    if (param0 < (var8Lifetime1Lifetime1 + var13.field_v)) {
                      return -1;
                    }
                    if ((var13.field_v + var8Lifetime1Lifetime1 + var13.field_s) >= param0) {
                      return var9Lifetime1;
                    }
                  }
                }
                var8Lifetime1Lifetime1 = var8Lifetime1Lifetime1 + var7;
              }
              var9Lifetime1++;
            }
            if (decompiledFrameCompleted0) {
              return -1;
            }
          }
          if (decompiledFrameCompleted0) {
            return -1;
          }
        }
        return stackIn_104_0;
    }

    final static of a(int param0, df param1) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        of stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        of var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          var2_int = param1.e(8, 62);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = df.a(param1, -47) ? 1 : 0;
          var4 = df.a(param1, -44) ? 1 : 0;
          var5 = new of();
          var5.field_f = (short)param1.e(16, param0 ^ -191);
          var5.field_B = fh.a(param1, 0, var5.field_B, 16);
          var5.field_j = fh.a(param1, 0, var5.field_j, 16);
          var5.field_d = fh.a(param1, 0, var5.field_d, 16);
          var5.field_R = (short)param1.e(16, -85);
          var5.field_G = fh.a(param1, 0, var5.field_G, 16);
          var5.field_r = fh.a(param1, param0 ^ param0, var5.field_r, 16);
          var5.field_I = fh.a(param1, 0, var5.field_I, 16);
          if (var3 != 0) {
            var5.field_C = (short)param1.e(16, -105);
            var5.field_q = fh.a(param1, 0, var5.field_q, 16);
            var5.field_P = fh.a(param1, 0, var5.field_P, 16);
            var5.field_a = fh.a(param1, param0 - 255, var5.field_a, 16);
            var5.field_O = fh.a(param1, param0 - 255, var5.field_O, 16);
            var5.field_J = fh.a(param1, 0, var5.field_J, 16);
            var5.field_F = fh.a(param1, 0, var5.field_F, 16);
          }
          if (var4 != 0) {
            param1.e(16, 72);
            var5.field_t = fh.a(param1, 0, var5.field_t, 16);
            var5.field_s = fh.a(param1, 0, var5.field_s, 16);
            var5.field_z = fh.a(param1, 0, var5.field_z, 16);
            var5.field_E = fh.a(param1, 0, var5.field_E, 16);
            var5.field_b = fh.a(param1, param0 ^ 255, var5.field_b, 16);
          }
          if (df.a(param1, -76)) {
            var5.field_c = fh.a(param1, 0, var5.field_c, 16);
          }
          if (df.a(param1, -95)) {
            var5.field_i = pe.a(112, 16, var5.field_i, param1);
            var6 = 0;
            var7 = 0;
            while (true) {
              if (var7 < var5.field_i.length) {
                stackIn_19_0 = ~var6;
                stackIn_19_1 = ~(255 & var5.field_i[var7]);
                if (var8 == 0) {
                  if (stackIn_19_0 > stackIn_19_1) {
                    var6 = var5.field_i[var7] & 255;
                  }
                  var7++;
                  continue;
                }
              } else {
                stackIn_19_0 = ~var6;
                stackIn_19_1 = -1;
              }
              if (stackIn_19_0 != stackIn_19_1) {
                var5.field_M = (byte)(var6 + 1);
                if (var8 == 0) {
                  break;
                }
              }
              var5.field_i = null;
              break;
            }
          }
          stackIn_24_0 = var5;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("mh.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final int b(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 1) {
          discarded$0 = this.a((byte) -37, -11);
        }
        if (rf.field_x[this.field_h]) {
          return ok.field_C[this.field_h] + de.field_c[this.field_h] * param0;
        }
        return bp.field_b[this.field_h];
    }

    final void a(byte param0, boolean param1) {
        if (param0 <= 80) {
          this.field_j = -80;
        }
        int var3 = 0;
        if (this.field_h == 0 &&
          -1 != this.field_a.field_g) {
          var3 = this.field_a.field_g;
        }
        if (this.field_h == 1 &&
          this.field_a.field_g != -1 &&
          fn.field_c != -1) {
          var3 = this.field_a.field_g;
        }
        if (this.field_h == 4) {
          var3 = 2;
        }
        if (this.field_h != 11) {
          this.field_a.a(this.a(n.field_t, 126, k.field_e), (byte) 83, param1, var3);
        }
        this.field_i = 0;
        this.field_e = -1;
    }

    private final void a(int param0, byte param1, boolean param2) {
        this.a(rf.field_q[this.field_h][param0], param2, -73, false);
        if (param1 < 77) {
          this.a(-36, 41, 69, 35, -99, 97, 24, 76);
        }
    }

    private final t e(int param0, int param1) {
        t var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        t var6 = null;
        hc var7 = null;
        sg var8 = null;
        kh[] var9_ref_kh__ = null;
        int var9 = 0;
        int var10 = 0;
        kh var11_ref_kh = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        tl var15 = null;
        int var16 = 0;
        int[] var17 = null;
        ti[] var18 = null;
        ti var19 = null;
        tl[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        var16 = Torquing.field_u;
        var3 = (t) (wk.field_a.b(0));
        while (var3 != null) {
          if (~(-var3.field_t + var3.field_u) == ~param1) {
            var3.f(0);
            wk.field_a.b((byte) 68, var3);
            return var3;
          }
          var3 = (t) (wk.field_a.f(-24059));
          if (var16 == 0) {
            continue;
          }
          break;
        }
        var22 = ph.field_e;
        var21 = var22;
        var17 = var21;
        var3_array = var17;
        var4 = ph.field_j;
        var5 = ph.field_d;
        var6 = new t(160, 120);
        var6.e();
        var7 = ol.field_f[param1];
        var8 = im.field_L.a(-58, var7);
        var9_ref_kh__ = vc.field_c;
        var10 = 0;
        while (var10 < var9_ref_kh__.length) {
          var11_ref_kh = var9_ref_kh__[var10];
          if (var11_ref_kh != null) {
            var8.a(var11_ref_kh, ub.field_D);
          }
          var10++;
          if (var16 == 0) {
            continue;
          }
          break;
        }
        var9 = 0;
        do {
          if (!(var8.field_y > var9)) {
            h.field_j = var7.a(false);
            ap.a(ne.field_a, il.field_m[h.field_j]);
            im.field_L.a(true, ne.field_a);
            var9 = vf.field_j[h.field_j][0];
            var10 = vf.field_j[h.field_j][1];
            break;
          }
          var8.a(var9, 80, 1365, -1, -12, 12);
          var9++;
        } while (var16 == 0);
        var11 = vf.field_j[h.field_j][2];
        ne.field_a[1] = ne.field_a[1] + (ne.field_a[10] * var11 + (ne.field_a[7] * var10 + var9 * ne.field_a[4]) >> 16);
        ne.field_a[0] = ne.field_a[0] + (ne.field_a[9] * var11 + ne.field_a[3] * var9 + ne.field_a[6] * var10 >> 16);
        ne.field_a[2] = ne.field_a[2] + (ne.field_a[11] * var11 + (var10 * ne.field_a[8] + var9 * ne.field_a[5]) >> 16);
        ne.field_a[10] = ne.field_a[10] << 2;
        ne.field_a[11] = ne.field_a[11] << 2;
        ne.field_a[9] = ne.field_a[9] << 2;
        im.field_L.b(1);
        ph.g(0, 0, 160, 120);
        var12 = wi.field_a[param1];
        if (var7.a(false) != 1 ||
          hi.field_h[var12] == null) {
          gm.field_r[var12].a(0, 0, 160, 120);
          if (var16 != 0) {
            hi.field_h[var12].a(0, 0, 160, 120);
          }
        } else {
          hi.field_h[var12].a(0, 0, 160, 120);
        }
        be.a(0, 0, 160, 120);
        var8.a(ne.field_a);
        if (var7.field_k != null) {
          var18 = var7.field_k;
          var14 = 0;
          while (var18.length > var14) {
            var19 = var18[var14];
            if (var19 != null) {
              var19.b((byte) 62);
            }
            var14++;
            if (var16 == 0) {
              continue;
            }
            break;
          }
        }
        var20 = var7.field_q;
        var14 = 0;
        do {
          if (var20.length <= var14) {
            if (wk.field_a.a(false) > 2) {
              wk.field_a.b((byte) 108);
            }
            var6.field_u = param1 + var6.field_t;
            wk.field_a.b((byte) 68, var6);
            ph.a(var22, var4, var5);
            ph.a();
            be.a(0, 0, param0, 480);
            break;
          }
          var15 = var20[var14];
          var15.field_c = -1;
          var15.field_h = null;
          var14++;
        } while (var16 == 0);
        return var6;
    }

    private final void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        var9 = Torquing.field_u;
        if ((this.field_h == 2 ||
          this.field_h == 3) &&
          (decompiledFrameRemainder0 = (1 == ta.field_o)) &&
          (decompiledFrameRemainder0 = !(re.field_c <= -8 + lp.field_c)) &&
          (decompiledFrameRemainder0 = !((8 + (um.field_m.field_x + lp.field_c)) <= re.field_c))) {
          if ((!((-8 + ea.field_v) < wh.field_s) ||
            !(wh.field_s < (ea.field_v + i.field_N.a('<')))) &&
            (decompiledFrameRemainder0 = !(-8 + vd.field_f >= wh.field_s)) &&
            (decompiledFrameRemainder0 = !(wh.field_s >= (vd.field_f + i.field_N.a('>'))))) {
            fieldTemp$0 = ld.field_k + 1;
            ld.field_k = ld.field_k + 1;
            if (fieldTemp$0 == 3) {
              ld.field_k = 0;
            }
            th.a(100, th.field_F[23]);
            decompiledFrameRemainder0 = (var9 != 0);
          }
          if (decompiledFrameRemainder0) {
            fieldTemp$1 = ld.field_k - 1;
            ld.field_k = ld.field_k - 1;
            if (fieldTemp$1 < 0) {
              ld.field_k = 2;
            }
            th.a(100, th.field_F[23]);
            decompiledFrameRemainder0 = (var9 != 0);
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_h == 9 &&
          0 != ta.field_o)) {
          if (nh.field_k != wi.field_a.length) {
            stackIn_27_0 = wi.field_a[nh.field_k];
          } else {
            stackIn_27_0 = wi.field_a[-1 + nh.field_k];
          }
          boolean decompiledFrameCompleted1 = true;
          var2 = stackIn_27_0;
          var3 = 72;
          if (re.field_c >= var3 &&
            re.field_c < (var3 + rp.field_b[0].field_u)) {
            var4 = 168;
            var5 = 0;
            while (var2 >= var5) {
              stackIn_39_0 = ~wh.field_s;
              stackIn_39_1 = ~var4;
              if (var9 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_39_0 <= stackIn_39_1 &&
                wh.field_s < (rp.field_b[var5].field_s + var4) &&
                var5 != wi.field_a[rn.field_j]) {
                rn.field_j = mk.field_c[var5];
                break;
              }
              var4 = var4 + (rp.field_b[var5].field_s + 10);
              var5++;
            }
          }
          if (decompiledFrameCompleted1) {
            var4Lifetime1 = wi.field_a[rn.field_j];
            var5 = qc.field_ab[var4Lifetime1];
            stackIn_39_0 = var2;
            stackIn_39_1 = var4Lifetime1;
          }
          if (stackIn_39_0 <= stackIn_39_1 &&
            nh.field_k != wi.field_a.length) {
            stackIn_43_0 = hg.field_d[nh.field_k];
          } else {
            stackIn_43_0 = var5;
          }
          var6 = stackIn_43_0;
          var3Lifetime1 = 157;
          if (re.field_c >= var3Lifetime1 &&
            re.field_c < i.field_N.field_t + var3Lifetime1 + i.field_N.field_x + 6) {
            var7 = 168;
            var8 = 0;
            while (var8 <= var6) {
              stackIn_55_0 = wh.field_s;
              stackIn_55_1 = var7 - 3;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_55_0 >= stackIn_55_1 &&
                wh.field_s < var7 + i.field_N.a((char)(var8 + 49)) + 3) {
                rn.field_j = rn.field_j + (-hg.field_d[rn.field_j] + var8);
                break;
              }
              var7 += 40;
              var8++;
            }
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_55_0 = 0;
          stackIn_55_1 = ta.field_o;
        }
        if (stackIn_55_0 != stackIn_55_1) {
          this.field_j = wh.field_s;
          this.field_b = re.field_c;
        }
        this.field_a.a(true, this.a(n.field_t, 88, k.field_e), this.a(wh.field_s, 126, re.field_c));
        if (param0 != 60) {
          return;
        }
        if (this.field_a.field_g != -1) {
          this.a(this.d(118, this.field_a.field_g), (byte) 96, true);
        }
    }

    final void a(boolean param0, int param1) {
        Torquing stackIn_38_0;
        boolean stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        boolean stackIn_39_4 = false;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        t var6_ref_t = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        if (this.field_h != 1 &&
          this.field_h != 5) {
          if (this.field_h == 0) {
            kf.field_F = 0;
            if (var8 != 0) {
              kf.field_F = -1 + ie.field_b.field_q;
            }
          }
        } else {
          kf.field_F = -1 + ie.field_b.field_q;
        }
        ed.a(param1 ^ param1);
        if (11 == this.field_h) {
          var3 = mo.b(-457010900, param0);
          switch (var3) {
            default:
              break;
            case 2:
              this.a(1, true, -54, true);
              if (var8 == 0) {
                break;
              }
            case 1:
              this.a(1, false, param1 + 22924, true);
              if (var8 == 0) {
                break;
              }
            case 3:
              this.a(24, true, 95, true);
              break;
          }
        }
        if (cm.field_m >= 0) {
          if (!(cm.field_m <= 0)) {
            cm.field_m = cm.field_m - 5;
            if (!(0 <= cm.field_m)) {
              cm.field_m = 0;
              if (var8 != 0) {
                cm.field_m = cm.field_m + 5;
                if (cm.field_m > 0) {
                  cm.field_m = 0;
                }
              }
            }
          }
        } else {
          cm.field_m = cm.field_m + 5;
          if (cm.field_m > 0) {
            cm.field_m = 0;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (5 != this.field_h) {
          if (this.field_i == 0 && (3 == this.field_h ||
            this.field_h == 2)) {
            vd.field_f = -2147483648;
            ea.field_v = -2147483648;
            lp.field_c = -2147483648;
            decompiledFrameRemainder0 = (var8 == 0);
          }
          if (decompiledFrameRemainder0) {
            boolean decompiledFrameCompleted2 = true;
            if (this.field_h != 11) {
              while (np.a((byte) -13)) {
                stackIn_59_0 = 13;
                stackIn_59_1 = e.field_f;
                if (var8 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if (stackIn_59_0 == stackIn_59_1) {
                  if (this.field_h == 1) {
                    this.a(4, false, 71, true);
                    continue;
                  }
                  if (3 != this.field_h) {
                    if (0 == this.field_h) {
                      continue;
                    }
                    if (this.field_h == 5) {
                      continue;
                    }
                    if (this.field_h == 7) {
                      continue;
                    }
                    if (this.field_h == 11) {
                      continue;
                    }
                    this.a(12, false, -126, true);
                    continue;
                  }
                  this.a(8, false, -84, true);
                  continue;
                }
                this.a((byte) 79);
              }
              if (decompiledFrameCompleted2) {
                this.a(60);
              }
            }
            if (decompiledFrameCompleted2) {
              stackIn_59_0 = ~this.field_h;
              stackIn_59_1 = -10;
            }
            if (stackIn_59_0 == stackIn_59_1 &&
              this.field_a.field_k) {
              boolean decompiledFrameCompleted1 = true;
              var3 = -1;
              if (69 <= k.field_e &&
                (rp.field_b[0].field_u + 75) > k.field_e) {
                var4 = 168;
                var5 = 0;
                while (var5 < 8) {
                  var6_ref_t = rp.field_b[var5];
                  stackIn_71_0 = var4 - 3;
                  stackIn_71_1 = n.field_t;
                  if (var8 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_71_0 <= stackIn_71_1 &&
                    n.field_t < 3 + var6_ref_t.field_s + var4) {
                    var3 = var5;
                  }
                  var4 = var4 + (10 + var6_ref_t.field_s);
                  var5++;
                }
              }
              if (decompiledFrameCompleted1) {
                stackIn_71_0 = -156;
                stackIn_71_1 = ~k.field_e;
              }
              boolean decompiledFrameCompleted0 = true;
              if (stackIn_71_0 >= stackIn_71_1 &&
                6 + (i.field_N.field_t + 157 + i.field_N.field_x) > k.field_e) {
                var4 = wi.field_a[rn.field_j];
                var5 = qc.field_ab[var4];
                var6 = 168;
                var7 = 0;
                while (var5 > var7) {
                  stackIn_81_0 = ~n.field_t;
                  stackIn_81_1 = ~(var6 - 3);
                  if (var8 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_81_0 <= stackIn_81_1 &&
                    n.field_t < var6 + (i.field_N.a((char)(var7 + 49)) + 3)) {
                    var3 = var7 + 10;
                  }
                  var6 += 40;
                  var7++;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_81_0 = -1;
                stackIn_81_1 = var3;
              }
              qj.a(stackIn_81_0, stackIn_81_1);
            }
            return;
          }
        }
        if (150 > this.field_i &&
          ul.field_d == 0 &&
          !i.field_P[13] &&
          !i.field_P[84] &&
          !i.field_P[83]) {
          return;
        }
        stackIn_38_0 = this.field_c;
        stackIn_38_1 = true;
        stackIn_38_2 = 3;
        stackIn_38_3 = 1;
        stackIn_39_4 = (ul.field_d == 0) ? false : true;
        ((Torquing) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_39_4);
    }

    private final void a(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_16_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_56_0 = 0;
        int stackIn_68_0 = 0;
        pk stackIn_70_0 = null;
        String stackIn_71_1 = null;
        int stackIn_83_0 = 0;
        boolean stackOut_7_0;
        boolean stackOut_23_0;
        int var3 = 0;
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
        String var15 = null;
        int var16 = 0;
        String var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var3Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Torquing.field_u;
        var4 = 85;
        if (param1 >= -117) {
          this.a(false, 21, -18, 62);
        }
        if (!param0) {
          stackIn_5_0 = fa.field_b;
        } else {
          stackIn_5_0 = ao.field_f;
        }
        var5 = stackIn_5_0;
        var6 = 0;
        var7 = -1;
        var8 = k.field_b.length;
        var9 = 0;
        var10 = 0;
        boolean decompiledNaturalLoopExit1 = false;
        while (!(decompiledNaturalLoopExit1 = (var8 <= var10))) {
          stackOut_7_0 = param0;
          stackIn_16_0 = stackOut_7_0 ? 1 : 0;
          stackIn_8_0 = stackOut_7_0;
          if (var19 == 0) {
            if ((!stackIn_8_0 ||
              (var5 & 1 << var10) != 0) &&
              wc.a(false, var10)) {
              var9++;
            }
            var10++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit1) {
          var10 = 1;
          stackIn_16_0 = var9;
        }
        var11 = stackIn_16_0;
        if (var9 > 7) {
          var10 = 2;
          var11 = var9 >> 1;
        }
        if (var10 == 1) {
          var4 += 20;
        }
        var3 = 4 + (320 - (40 * var11 >> 1));
        var12 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(var12 < k.field_b.length)))) {
          var13 = m.field_q[var12];
          stackOut_23_0 = wc.a(false, var13);
          stackIn_56_0 = stackOut_23_0 ? 1 : 0;
          stackIn_24_0 = stackOut_23_0;
          if (var19 == 0) {
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_24_0) {
              if (0 != (1 << var13 & var5)) {
                tj.field_n[var13].e(var3, var4);
              } else {
                decompiledFrameRemainder0 = !(param0);
                if (decompiledFrameRemainder0) {
                  if (wp.field_w <= 0 &&
                    m.field_y[var13]) {
                    pe.field_J.e(var3, var4);
                  } else {
                    kk.field_o.e(var3, var4);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                if (var3 <= n.field_t &&
                  n.field_t <= (var3 + 32) &&
                  k.field_e >= var4 &&
                  k.field_e <= 32 + var4) {
                  ph.e(-2 + var3, var4 - 2, 36, 36, 6, 8421504);
                  var7 = var13;
                }
                if (-1 != this.field_j &&
                  this.field_j >= var3 &&
                  var3 + 32 >= this.field_j &&
                  var4 <= this.field_b &&
                  this.field_b <= var4 + 32) {
                  this.field_j = -1;
                  if (var13 != this.field_e) {
                    this.field_e = var13;
                  } else {
                    this.field_e = -1;
                  }
                }
                if (var13 == this.field_e) {
                  ph.e(-2 + var3, -2 + var4, 36, 36, 6, 1579032);
                }
                var6++;
                if (~var11 != ~var6) {
                  var3 += 40;
                } else {
                  var6 = 0;
                  var11 = -var11 + var9;
                  var4 += 40;
                  var3 = -(40 * var11 >> 1) + 324;
                }
              }
            }
            var12++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_56_0 = 0;
        }
        if (stackIn_56_0 > ~this.field_e) {
          var7 = this.field_e;
        }
        if (var7 == -1) {
          if (je.a((byte) 59)) {
            i.field_Q.c(nh.field_p, 320, 230, 0, -1);
            i.field_Q.a(ti.field_m, 47, 270, 534, 1000, 0, -1, 1, 0, 3 * um.field_m.field_x / 2);
            if (var19 == 0) {
              return;
            }
          }
          i.field_Q.c(nh.field_p, 320, 275, 0, -1);
          if (var19 == 0) {
            return;
          }
        }
        i.field_Q.c(k.field_b[var7], 320, 202, 0, -1);
        stackIn_68_0 = ((var5 & 1 << var7) == 0) ? 0 : 1;
        var12Lifetime1 = stackIn_68_0;
        var13Lifetime1 = 3 * dd.field_c.field_x / 2;
        var14 = 208;
        stackIn_70_0 = qh.field_c;
        if (var12Lifetime1 != 0) {
          stackIn_71_1 = qh.field_d;
        } else {
          stackIn_71_1 = uf.field_t;
        }
        ((pk) (Object) stackIn_70_0).c(stackIn_71_1, 321, 1 + var14 + dd.field_c.field_x, 1, -1);
        if (var12Lifetime1 != 0) {
          tj.field_n[var7].d(256, 30 + var14);
          if (var19 != 0) {
            if (wp.field_w <= 0 &&
              m.field_y[var7]) {
              pe.field_J.d(256, 30 + var14);
              kk.field_o.d(256, 30 + var14);
            } else {
              kk.field_o.d(256, 30 + var14);
            }
          }
        } else {
          if (wp.field_w <= 0 &&
            m.field_y[var7]) {
            pe.field_J.d(256, 30 + var14);
            if (var19 != 0) {
              kk.field_o.d(256, 30 + var14);
            }
          } else {
            kk.field_o.d(256, 30 + var14);
          }
        }
        var14 = var14 + (i.field_N.field_x + 46);
        var15 = cn.field_a[var7];
        if (var7 == 14 &&
          (1 << var7 & var5) == 0) {
          stackIn_83_0 = 1;
        } else {
          stackIn_83_0 = 0;
        }
        var16 = stackIn_83_0;
        if (var16 != 0) {
          var15 = al.field_f;
        }
        qh.field_c.a(var15, 65, var14 - 3, 184, 1000, 0, -1, 0, 0, (3 + dd.field_c.field_x * 3) / 2);
        var17 = Integer.toString(100 * ef.field_d[var7]);
        if (var16 != 0) {
          var17 = af.field_b;
        }
        qh.field_c.b(tl.field_s + var17, 401, var14 - 3 + qh.field_c.field_q, 0, -1);
        var14 = var14 + var13Lifetime1;
        var3Lifetime1 = 401;
        qh.field_c.b(am.field_j, var3Lifetime1, var14 + (-3 + qh.field_c.field_x), 0, -1);
        var3Lifetime1 = var3Lifetime1 + qh.field_c.a(am.field_j);
        if (var16 != 0) {
          kh.field_r.d(var3Lifetime1, var14 + 1);
          qh.field_c.b(nl.field_u, var3Lifetime1 + kh.field_r.field_s, qh.field_c.field_x + (-3 + var14), 0, -1);
          if (var19 == 0) {
            return;
          }
        }
        var18 = 0;
        while (!(ef.field_d[var7] <= var18)) {
          kh.field_r.d(var3Lifetime1, var14 + 1);
          var3Lifetime1 = var3Lifetime1 + kh.field_r.field_s / 3;
          var18++;
          if (var19 != 0) {
            return;
          }
        }
        return;
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -78) {
            stackIn_2_0 = -24;
            return stackIn_2_0;
          }
          if (param0) {
            stackIn_7_0 = sp.field_Q.a(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = bo.field_e.a(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mh.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean c(int param0, int param1) {
        if (this.field_h == param0) {
          if (param1 == 0 &&
            a.field_e == 0) {
            return false;
          }
          if (2 == param1) {
            if (hg.field_b.length - 1 != a.field_e) {
              return true;
            }
            return false;
          }
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        var25 = Torquing.field_u;
        try {
          pl.b(param2, 88);
          var7_int = 0;
          var8 = -param0 + param2;
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = param2;
          var10 = -param2;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          var14 = -1;
          var35 = qd.field_a[param4];
          if (param5 != 15783) {
            return;
          }
          var16 = param1 - var8;
          di.a(-param2 + param1, (byte) 77, param3, var35, var16);
          var17 = var8 + param1;
          di.a(var16, (byte) 105, param6, var35, var17);
          di.a(var17, (byte) 107, param3, var35, param2 + param1);
          while (var9 > var7_int) {
            var14 += 2;
            var13 += 2;
            var10 = var10 + var13;
            var12 = var12 + var14;
            if (var25 != 0) {
              return;
            }
            if (var12 >= 0 &&
              var11 >= 1) {
              vc.field_a[var11] = var7_int;
              var11--;
              var12 = var12 - (var11 << 1);
            }
            var7_int++;
            if (var10 >= 0) {
              var9--;
              if (var8 > var9) {
                var27 = qd.field_a[var9 + param4];
                var28 = qd.field_a[param4 - var9];
                var20 = vc.field_a[var9];
                var21 = param1 + var7_int;
                var22 = -var7_int + param1;
                var23 = param1 + var20;
                var24 = param1 - var20;
                di.a(var22, (byte) 84, param3, var27, var24);
                di.a(var24, (byte) -120, param6, var27, var23);
                di.a(var23, (byte) 33, param3, var27, var21);
                di.a(var22, (byte) -109, param3, var28, var24);
                di.a(var24, (byte) 25, param6, var28, var23);
                di.a(var23, (byte) -122, param3, var28, var21);
              } else {
                var29 = qd.field_a[param4 + var9];
                var30 = qd.field_a[-var9 + param4];
                var20 = param1 + var7_int;
                var21 = -var7_int + param1;
                di.a(var21, (byte) -97, param3, var29, var20);
                di.a(var21, (byte) 14, param3, var30, var20);
              }
              var10 = var10 - (var9 << 1);
            }
            var31 = qd.field_a[param4 + var7_int];
            var32 = qd.field_a[-var7_int + param4];
            var20Lifetime1 = param1 + var9;
            var21Lifetime1 = -var9 + param1;
            if (var8 > var7_int) {
              if (var7_int <= var11) {
                stackIn_21_0 = var11;
              } else {
                stackIn_21_0 = vc.field_a[var7_int];
              }
              var22Lifetime1 = stackIn_21_0;
              var23Lifetime1 = var22Lifetime1 + param1;
              var24Lifetime1 = param1 - var22Lifetime1;
              di.a(var21Lifetime1, (byte) 109, param3, var31, var24Lifetime1);
              di.a(var24Lifetime1, (byte) -121, param6, var31, var23Lifetime1);
              di.a(var23Lifetime1, (byte) 89, param3, var31, var20Lifetime1);
              di.a(var21Lifetime1, (byte) 87, param3, var32, var24Lifetime1);
              di.a(var24Lifetime1, (byte) -97, param6, var32, var23Lifetime1);
              di.a(var23Lifetime1, (byte) 115, param3, var32, var20Lifetime1);
            } else {
              di.a(var21Lifetime1, (byte) 62, param3, var31, var20Lifetime1);
              di.a(var21Lifetime1, (byte) 94, param3, var32, var20Lifetime1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "mh.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_70_0 = 0;
        Torquing stackIn_78_0 = null;
        boolean stackIn_78_1 = false;
        int stackIn_79_2 = 0;
        Torquing stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        int stackIn_97_2 = 0;
        int stackIn_104_0 = 0;
        Torquing stackIn_106_0 = null;
        boolean stackIn_106_1 = false;
        int stackIn_107_2 = 0;
        int stackIn_114_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_171_0 = 0;
        int var5;
        int var6;
        int var7_int;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var7_intLifetime2;
        int var8Lifetime2;
        int var7_intLifetime3;
        L0: {
          L1: {
            boolean decompiledFrameCompleted0 = true;
            var11 = Torquing.field_u;
            var5 = -86 % ((12 - param2) / 41);
            if (ko.field_c[param0] == -1) {
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder12 = true;
              boolean decompiledFrameRemainder11 = true;
              boolean decompiledFrameRemainder10 = true;
              boolean decompiledFrameRemainder9 = true;
              boolean decompiledFrameRemainder8 = true;
              boolean decompiledFrameRemainder7 = true;
              boolean decompiledFrameRemainder6 = true;
              boolean decompiledFrameRemainder5 = true;
              boolean decompiledFrameRemainder4 = true;
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              L15: {
                L16: {
                  L17: {
                    L18: {
                      L19: {
                        L20: {
                          L21: {
                            boolean decompiledFrameRemainder0 = true;
                            var7_int = param0;
                            if ((var7_int != 0) &&
                              (decompiledFrameRemainder0 = (var7_int != 17 ||
                              var11 != 0))) {
                              if (4 == var7_int) {
                                break L21;
                              }
                              if (12 == var7_int) {
                                break L20;
                              }
                              if (var7_int == 11) {
                                break L19;
                              }
                              if (9 == var7_int &&
                                var11 == 0) {
                                break L18;
                              }
                              if (var7_int == 18) {
                                break L17;
                              }
                              if (19 == var7_int &&
                                var11 == 0) {
                                break L16;
                              }
                              if (var7_int == 14 &&
                                var11 == 0) {
                                break L15;
                              }
                              decompiledFrameRemainder2 = (var7_int != 15 ||
                                var11 != 0);
                              if ((decompiledFrameRemainder2) &&
                                (decompiledFrameRemainder3 = (var7_int != 10 ||
                                var11 != 0)) &&
                                (decompiledFrameRemainder4 = (var7_int != 6)) &&
                                (decompiledFrameRemainder5 = (var7_int != 5 ||
                                var11 != 0)) &&
                                (decompiledFrameRemainder6 = (21 != var7_int ||
                                var11 != 0)) &&
                                (decompiledFrameRemainder7 = (var7_int != 8 ||
                                var11 != 0)) &&
                                (decompiledFrameRemainder8 = (var7_int != 23 ||
                                var11 != 0)) &&
                                (decompiledFrameRemainder9 = (22 != var7_int ||
                                var11 != 0)) &&
                                (decompiledFrameRemainder10 = (var7_int != 24)) &&
                                (decompiledFrameRemainder11 = (2 != var7_int ||
                                var11 != 0)) &&
                                (decompiledFrameRemainder12 = (var7_int != 13 ||
                                var11 != 0))) {
                                if (var7_int != 20) {
                                  break L0;
                                }
                                decompiledFrameRemainder1 = (var11 != 0);
                              }
                            }
                            if ((decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2) &&
                              (decompiledFrameRemainder1) &&
                              (decompiledFrameRemainder0)) {
                              if (!this.field_a.c(-97) &&
                                !param3) {
                                break L0;
                              }
                              th.a(100, th.field_F[23]);
                              this.field_c.a(true, 9, 1, param1);
                              ta.field_n = 0;
                              if (var11 == 0) {
                                break L1;
                              }
                            }
                            if ((decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2) &&
                              (decompiledFrameRemainder1)) {
                              if (!this.field_a.c(-97) &&
                                !param3) {
                                break L1;
                              }
                              th.a(100, th.field_F[23]);
                              if (this.field_h == 9) {
                                stackIn_60_0 = rn.field_j;
                              } else {
                                stackIn_60_0 = 0;
                              }
                              var7_int = stackIn_60_0;
                              ie.field_b = new bi(this.field_c, var7_int);
                              this.field_c.a(true, wi.field_a[var7_int], 3, param1);
                              stackIn_63_0 = (wp.field_w <= 0) ? 11 : 0;
                              ta.field_n = stackIn_63_0;
                              if (var11 == 0) {
                                break L1;
                              }
                            }
                          }
                          if ((decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder3) &&
                            (decompiledFrameRemainder2) &&
                            (decompiledFrameRemainder1)) {
                            if (!this.field_a.c(-97) &&
                              !param3) {
                              break L0;
                            }
                            this.field_c.a(true, -1, 10, param1);
                            th.a(100, th.field_F[23]);
                            stackIn_70_0 = (0 < wp.field_w) ? 0 : 11;
                            ta.field_n = stackIn_70_0;
                            if (var11 == 0) {
                              break L1;
                            }
                          }
                        }
                        if ((decompiledFrameRemainder12) &&
                          (decompiledFrameRemainder11) &&
                          (decompiledFrameRemainder10) &&
                          (decompiledFrameRemainder9) &&
                          (decompiledFrameRemainder8) &&
                          (decompiledFrameRemainder7) &&
                          (decompiledFrameRemainder6) &&
                          (decompiledFrameRemainder5) &&
                          (decompiledFrameRemainder4) &&
                          (decompiledFrameRemainder3) &&
                          (decompiledFrameRemainder2) &&
                          (decompiledFrameRemainder1)) {
                          if (!this.field_a.c(-97) &&
                            !param3) {
                            break L1;
                          }
                          if (this.field_h == 10 &&
                            !je.a((byte) 41)) {
                            stackIn_78_0 = this.field_c;
                            stackIn_78_1 = true;
                            if (ao.field_f != 0) {
                              stackIn_79_2 = 8;
                            } else {
                              stackIn_79_2 = 2;
                            }
                            ((Torquing) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_79_2, 1, param1);
                            if (var11 != 0) {
                              if (ta.field_n == 11 &&
                                0 < wp.field_w) {
                                ta.field_n = 0;
                              }
                              this.field_c.a(true, ta.field_n, 1, param1);
                            }
                          } else {
                            if (ta.field_n == 11 &&
                              0 < wp.field_w) {
                              ta.field_n = 0;
                            }
                            this.field_c.a(true, ta.field_n, 1, param1);
                          }
                          th.a(100, th.field_F[23]);
                          if (var11 == 0) {
                            break L1;
                          }
                        }
                      }
                      if ((decompiledFrameRemainder12) &&
                        (decompiledFrameRemainder11) &&
                        (decompiledFrameRemainder10) &&
                        (decompiledFrameRemainder9) &&
                        (decompiledFrameRemainder8) &&
                        (decompiledFrameRemainder7) &&
                        (decompiledFrameRemainder6) &&
                        (decompiledFrameRemainder5) &&
                        (decompiledFrameRemainder4) &&
                        (decompiledFrameRemainder3) &&
                        (decompiledFrameRemainder2) &&
                        (decompiledFrameRemainder1)) {
                        if (!this.field_a.c(-97) &&
                          !param3) {
                          break L1;
                        }
                        this.field_c.a(true, 4, 1, param1);
                        cm.field_m = 0;
                        a.field_e = 0;
                        th.a(100, th.field_F[23]);
                        ta.field_n = this.field_h;
                        if (var11 == 0) {
                          break L1;
                        }
                      }
                    }
                    if ((decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1)) {
                      if (!this.field_a.c(-97) &&
                        !param3) {
                        break L1;
                      }
                      if (!je.a((byte) 100)) {
                        stackIn_96_0 = this.field_c;
                        stackIn_96_1 = true;
                        if (ao.field_f != 0) {
                          stackIn_97_2 = 8;
                        } else {
                          stackIn_97_2 = 0;
                        }
                        ((Torquing) (Object) stackIn_96_0).a(stackIn_96_1, stackIn_97_2, 1, param1);
                        if (var11 != 0) {
                          if (0 == ie.field_b.field_s &&
                            ao.field_f == 0 &&
                            0 == ie.field_b.field_L) {
                            stackIn_104_0 = 0;
                          } else {
                            stackIn_104_0 = 1;
                          }
                          var7_int = stackIn_104_0;
                          stackIn_106_0 = this.field_c;
                          stackIn_106_1 = true;
                          if (var7_int != 0) {
                            stackIn_107_2 = 7;
                          } else {
                            stackIn_107_2 = 0;
                          }
                          ((Torquing) (Object) stackIn_106_0).a(stackIn_106_1, stackIn_107_2, 1, param1);
                        }
                      } else {
                        if (0 == ie.field_b.field_s &&
                          ao.field_f == 0 &&
                          0 == ie.field_b.field_L) {
                          stackIn_104_0 = 0;
                        } else {
                          stackIn_104_0 = 1;
                        }
                        var7_int = stackIn_104_0;
                        stackIn_106_0 = this.field_c;
                        stackIn_106_1 = true;
                        if (var7_int != 0) {
                          stackIn_107_2 = 7;
                        } else {
                          stackIn_107_2 = 0;
                        }
                        ((Torquing) (Object) stackIn_106_0).a(stackIn_106_1, stackIn_107_2, 1, param1);
                      }
                      th.a(100, th.field_F[23]);
                      if (var11 == 0) {
                        break L1;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder6) &&
                    (decompiledFrameRemainder5) &&
                    (decompiledFrameRemainder4) &&
                    (decompiledFrameRemainder3) &&
                    (decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1)) {
                    if (this.field_a.e(7632)) {
                      var7_int = wi.field_a[rn.field_j];
                      if (wi.field_a.length == nh.field_k) {
                        stackIn_114_0 = wi.field_a[nh.field_k - 1];
                      } else {
                        stackIn_114_0 = wi.field_a[nh.field_k];
                      }
                      var8 = stackIn_114_0;
                      if (var8 > var7_int) {
                        rn.field_j = mk.field_c[var7_int + 1];
                      }
                    }
                    if (!this.field_a.c((byte) 76)) {
                      break L1;
                    }
                    var7_int = wi.field_a[rn.field_j];
                    if (var7_int > 0) {
                      rn.field_j = mk.field_c[-1 + var7_int];
                    }
                    if (var11 == 0) {
                      break L1;
                    }
                  }
                }
                if ((decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  if (this.field_a.e(7632)) {
                    var7_int = wi.field_a[rn.field_j];
                    if (wi.field_a.length == nh.field_k) {
                      stackIn_125_0 = wi.field_a[-1 + nh.field_k];
                    } else {
                      stackIn_125_0 = wi.field_a[nh.field_k];
                    }
                    var8Lifetime2 = stackIn_125_0;
                    var9 = hg.field_d[rn.field_j];
                    if (var8Lifetime2 <= var7_int &&
                      wi.field_a.length != nh.field_k) {
                      stackIn_129_0 = hg.field_d[nh.field_k];
                    } else {
                      stackIn_129_0 = -1 + qc.field_ab[var7_int];
                    }
                    var10 = stackIn_129_0;
                    if (var10 > var9) {
                      rn.field_j = rn.field_j + 1;
                    }
                  }
                  if (!this.field_a.c((byte) 68)) {
                    break L0;
                  }
                  var7_int = hg.field_d[rn.field_j];
                  if (var7_int > 0) {
                    rn.field_j = rn.field_j - 1;
                  }
                  if (var11 == 0) {
                    break L1;
                  }
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder8) &&
                (decompiledFrameRemainder7) &&
                (decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L1;
                }
                if (this.field_h != 6) {
                  if (this.field_h != 9) {
                    if (this.field_h != 2) {
                      var7_int = 0;
                      if (var11 != 0) {
                        var7_int = 1;
                        var7_int = 3;
                        var7_int = 2;
                      }
                    } else {
                      var7_int = 1;
                      if (var11 != 0) {
                        var7_int = 3;
                        var7_int = 2;
                      }
                    }
                  } else {
                    var7_int = 3;
                    if (var11 != 0) {
                      var7_int = 2;
                    }
                  }
                } else {
                  var7_int = 2;
                }
                pb.field_e = var7_int;
                oo.field_b = 0;
                th.a(100, th.field_F[23]);
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder8) &&
                (decompiledFrameRemainder7) &&
                (decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L0;
                }
                this.field_c.a(true, 11, 1, param1);
                th.a(100, th.field_F[23]);
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder8) &&
                (decompiledFrameRemainder7) &&
                (decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder1)) {
                if (this.field_a.b(97)) {
                  sg.field_f = (sg.field_f + 1) % 3;
                  th.a(100, th.field_F[23]);
                }
                if (!this.field_a.b((byte) -108)) {
                  break L1;
                }
                sg.field_f = (2 + sg.field_f) % 3;
                th.a(100, th.field_F[23]);
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder8) &&
                (decompiledFrameRemainder7) &&
                (decompiledFrameRemainder6) &&
                (decompiledFrameRemainder5) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L0;
                }
                if (null == dg.field_i) {
                  var7_intLifetime3 = param1 ? 1 : 0;
                  hm.a(var7_intLifetime3 != 0, um.field_m.field_x, (t[]) null, 0, i.field_Q, 0, (t[]) null, 3, 320, 0, 3 * um.field_m.field_x / 2, 240);
                  if (var11 == 0) {
                    break L1;
                  }
                }
                th.a(100, th.field_F[23]);
                ug.a(-105);
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder8) &&
                (decompiledFrameRemainder7) &&
                (decompiledFrameRemainder6) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L0;
                }
                ie.field_b.b((byte) -103);
                th.a(100, th.field_F[23]);
                stackIn_171_0 = (0 >= wp.field_w) ? 11 : 0;
                ta.field_n = stackIn_171_0;
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder8) &&
                (decompiledFrameRemainder7) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L0;
                }
                th.a(100, th.field_F[23]);
                if (dg.field_i != null) {
                  ug.a(-124);
                }
                to.a(ip.a(9), -46);
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder8) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L0;
                }
                ie.field_b.f(1000);
                this.field_c.a(true, -1, 10, param1);
                th.a(100, th.field_F[23]);
                jh.a(la.field_k[ie.field_b.field_q], 0);
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder9) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L1;
                }
                if (hg.field_b.length <= a.field_e + 1) {
                  break L0;
                }
                a.field_e = a.field_e + 1;
                cm.field_m = cm.field_m - 298;
                th.a(100, th.field_F[23]);
                if (~(-1 + hg.field_b.length) != ~a.field_e) {
                  break L1;
                }
                if (param1) {
                  break L1;
                }
                this.field_a.field_g = 1;
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder10) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L0;
                }
                if (a.field_e <= 0) {
                  break L0;
                }
                cm.field_m = cm.field_m + 298;
                a.field_e = a.field_e - 1;
                th.a(100, th.field_F[23]);
                if (0 != a.field_e) {
                  break L1;
                }
                if (param1) {
                  break L1;
                }
                this.field_a.field_g = 2;
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder11) &&
                (decompiledFrameRemainder1)) {
                if (!this.field_a.c(-97) &&
                  !param3) {
                  break L0;
                }
                cq.a(true, ip.a(9));
                if (var11 == 0) {
                  break L1;
                }
              }
              if ((decompiledFrameRemainder12) &&
                (decompiledFrameRemainder1)) {
                var6 = on.field_c;
                if (this.field_a.e((byte) 110)) {
                  bd.a(false, 0);
                }
                if (this.field_a.d((byte) 106)) {
                  bd.a(false, 160);
                }
                if (this.field_a.a((byte) -116)) {
                  var7_intLifetime2 = n.field_t + (-152 - bp.field_b[this.field_h]);
                  if (var7_intLifetime2 > 0) {
                    if (var7_intLifetime2 >= 160) {
                      bd.a(false, 160);
                      if (var11 != 0) {
                        bd.a(false, var7_intLifetime2);
                        bd.a(false, 0);
                      }
                    } else {
                      bd.a(false, var7_intLifetime2);
                      if (var11 != 0) {
                        bd.a(false, 0);
                      }
                    }
                  } else {
                    bd.a(false, 0);
                  }
                }
                if (this.field_a.c((byte) 123)) {
                  b.b(69);
                }
                if (this.field_a.e(7632)) {
                  wj.a(123);
                }
                if (var6 == on.field_c) {
                  break L1;
                }
                if (ig.field_r[25] == null) {
                  ig.field_r[25] = nj.a(th.field_F[25], 100, 96);
                }
                if (ig.field_r[25].e(17)) {
                  break L0;
                }
                ig.field_r[25].c(0);
                ni.a(ig.field_r[25], true);
                if (var11 == 0) {
                  break L1;
                }
              }
              if (decompiledFrameRemainder1) {
                if (this.field_a.e((byte) -116)) {
                  ea.b(-47, 0);
                }
                if (this.field_a.d((byte) 106)) {
                  ea.b(-82, 160);
                }
                if (this.field_a.a((byte) -116)) {
                  var7_intLifetime1 = n.field_t - 152 - bp.field_b[this.field_h];
                  if (0 < var7_intLifetime1) {
                    if (var7_intLifetime1 >= 160) {
                      ea.b(-94, 160);
                      if (var11 != 0) {
                        ea.b(-17, var7_intLifetime1);
                        ea.b(-116, 0);
                      }
                    } else {
                      ea.b(-17, var7_intLifetime1);
                      if (var11 != 0) {
                        ea.b(-116, 0);
                      }
                    }
                  } else {
                    ea.b(-116, 0);
                  }
                }
                if (this.field_a.c((byte) 41)) {
                  bd.b(115);
                }
                if (!this.field_a.e(7632)) {
                  break L1;
                }
                ia.d(117);
                if (var11 == 0) {
                  break L1;
                }
              }
              if (this.field_a.e(7632)) {
                fieldTemp$0 = ld.field_k + 1;
                ld.field_k = ld.field_k + 1;
                if (fieldTemp$0 == 3) {
                  ld.field_k = 0;
                }
                th.a(100, th.field_F[23]);
              }
              if (this.field_a.c((byte) 67)) {
                fieldTemp$1 = ld.field_k - 1;
                ld.field_k = ld.field_k - 1;
                if (0 > fieldTemp$1) {
                  ld.field_k = 2;
                }
                th.a(100, th.field_F[23]);
              }
              if (!this.field_a.a((byte) -116)) {
                break L1;
              }
              if (!this.field_a.f((byte) -60)) {
                break L1;
              }
              var7 = hb.field_u[20];
              var8Lifetime1 = n.field_t;
              var9Lifetime1 = -(um.field_m.a(var7) >> 1) + 320;
              var10Lifetime1 = 0;
              while (var10Lifetime1 < hq.field_d.length) {
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (var9Lifetime1 <= var8Lifetime1 &&
                  var8Lifetime1 < um.field_m.a(hq.field_d[var10Lifetime1]) + var9Lifetime1) {
                  ld.field_k = var10Lifetime1;
                }
                var9Lifetime1 = var9Lifetime1 + (um.field_m.a(hq.field_d[var10Lifetime1]) + um.field_m.a(" / "));
                var10Lifetime1++;
              }
              if ((decompiledFrameCompleted0) &&
                (var11 == 0)) {
                break L1;
              }
            }
            if ((decompiledFrameCompleted0) && (this.field_a.c(-97) ||
              param3)) {
              this.field_c.a(true, ko.field_c[param0], 1, param1);
              th.a(100, th.field_F[23]);
              if (0 == this.field_h) {
                if (tm.field_c != 6 &&
                  tm.field_c != 2) {
                  break L0;
                }
                ta.field_n = this.field_h;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 32) {
          return;
        }
        field_f = null;
        field_d = null;
    }

    private final int a(byte param0, int param1) {
        if (rf.field_x[this.field_h]) {
          return ok.field_C[this.field_h] + de.field_c[this.field_h] * (1 + param1);
        }
        if (param0 >= -118) {
          this.field_h = -8;
        }
        return up.field_e[this.field_h];
    }

    final void c(int param0) {
        uf dupTemp$0 = null;
        int stackIn_26_0 = 0;
        pk stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        int stackIn_38_2 = 0;
        boolean stackIn_39_3 = false;
        boolean stackIn_42_4;
        int stackIn_43_0 = 0;
        pk stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        int stackIn_61_2 = 0;
        boolean stackIn_62_3 = false;
        boolean stackIn_65_4 = false;
        pk stackIn_67_0 = null;
        boolean stackIn_68_1 = false;
        boolean stackIn_71_2 = false;
        int stackIn_73_3;
        boolean stackIn_74_4 = false;
        pk stackIn_76_0 = null;
        boolean stackIn_77_1 = false;
        int stackIn_79_2 = 0;
        boolean stackIn_80_3 = false;
        boolean stackIn_83_4 = false;
        int stackIn_96_0 = 0;
        boolean stackIn_104_0 = false;
        boolean stackIn_108_1 = false;
        int stackIn_111_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        boolean stackOut_103_0;
        af[] var2_ref_af__ = null;
        int var2 = 0;
        int var3 = 0;
        af var4_ref_af = null;
        int var4 = 0;
        uf var5_ref_uf = null;
        int var5 = 0;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        af[] var9 = null;
        uf var10 = null;
        String var11 = null;
        String var12 = null;
        uf var13 = null;
        hc var14 = null;
        String var15 = null;
        String var16 = null;
        int stackIn_43_0Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var2Lifetime3;
        int var4Lifetime2;
        int var4Lifetime3;
        var8 = Torquing.field_u;
        if (this.field_h != 1 &&
          5 != this.field_h) {
          if (this.field_h == 0) {
            kf.field_F = 0;
            if (var8 != 0) {
              kf.field_F = -1 + ie.field_b.field_q;
            }
          }
        } else {
          kf.field_F = -1 + ie.field_b.field_q;
        }
        if (ia.a(-22426, 0)) {
          kf.field_F = 6;
        }
        k.a(kf.field_F, 1);
        nc.a(kf.field_F, true);
        var9 = nn.field_a[this.field_h];
        var2_ref_af__ = var9;
        var3 = 0;
        do {
          if (var9.length <= var3) {
            ph.c(0, 0, 640, 480, 16777215);
            break;
          }
          var4_ref_af = var9[var3];
          var4_ref_af.b(6);
          var3++;
        } while (var8 == 0);
        if (param0 != 93) {
          this.field_i = 4;
        }
        L7: {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_h == 2) {
            this.a(120, (byte) 92);
            if (var8 == 0) {
              break L7;
            }
          }
          if (this.field_h == 3) {
            if (!je.a((byte) 95)) {
              this.a(27, (byte) 107);
              if (var8 == 0) {
                break L7;
              }
            }
            var11 = om.field_e;
            qh.field_c.b(var11, 148, um.field_m.field_x + 34, 2, -1);
            var12 = Integer.toString(ie.field_b.field_s);
            qh.field_c.a(var12, 517, 34 + um.field_m.field_x, 2, -1);
            var4 = 135;
            var5 = re.a(252645135, ao.field_f);
            if (-48 + var5 * 48 < 338) {
              stackIn_26_0 = 48;
            } else {
              stackIn_26_0 = 338 / (-1 + var5);
            }
            var6_int = stackIn_26_0;
            var7 = 0;
            while (true) {
              if (!(var7 < k.field_b.length)) {
                stackIn_35_0 = qh.field_c;
                stackIn_36_1 = (0 != ie.field_b.field_s);
                stackIn_38_2 = 100;
                stackIn_39_3 = (ie.field_b.field_L != 0);
                stackIn_42_4 = (fa.field_b != 0);
                stackIn_43_0 = ((pk) (Object) stackIn_35_0).a(ko.$cfr$intArgs$a$feb7e63b59d8(stackIn_36_1, stackIn_38_2, stackIn_39_3, stackIn_42_4), 135, 169 - i.field_N.field_x, 370, 1000, 0, -1, 1, 0, i.field_N.field_x);
                break;
              }
              stackIn_43_0Lifetime1 = -1;
              if (var8 == 0) {
                if (stackIn_43_0Lifetime1 != ~(1 << var7 & ao.field_f)) {
                  tj.field_n[var7].e(var4, 93);
                  var4 = var4 + var6_int;
                }
                var7++;
                continue;
              }
              break;
            }
            break L7;
          }
          if (this.field_h == 4) {
            var2 = cm.field_m + 298 * a.field_e;
            ph.g(47, 120, 583, 418);
            var3 = 120 - var2;
            var4Lifetime2 = 0;
            while (var4Lifetime2 < hg.field_b.length) {
              var5_ref_uf = hg.field_b[var4Lifetime2];
              var5_ref_uf.b(47, -116, var3);
              dd.field_c.a(var4Lifetime2 + 1 + "/" + hg.field_b.length, 573, var3 + (var5_ref_uf.field_k - 3), 8421504, -1);
              var3 = var3 + var5_ref_uf.field_k;
              var4Lifetime2++;
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              ph.a();
              break L7;
            }
          }
          if (decompiledFrameCompleted0) {
            if (this.field_h == 5) {
              bj.field_L[eq.field_b].a(115, 111);
              ph.g(0, 150, 640, 480);
              qd.field_c[eq.field_b].a(0, 0);
              ph.a();
            } else {
              if (this.field_h == 9) {
                var14 = ol.field_f[rn.field_j];
                if (ti.field_l == null) {
                  ti.field_l = new uf[hg.field_d.length];
                }
                dupTemp$0 = new uf(qh.field_c, 0, 359, 166, (sm) null, 0, 0);
                ti.field_l[rn.field_j] = dupTemp$0;
                var10 = dupTemp$0;
                var13 = var10;
                var13.a((byte) 85, 30);
                this.field_c.a(0, var14, var13);
                var13.a((byte) -109, 30);
                var10.c(0);
                ti.field_l[rn.field_j].b(51, -116, 195);
                this.e(param0 ^ 733, rn.field_j).b(414, 216);
                ph.c(414, 216, 160, 120, 16777215);
                ph.c(413, 215, 162, 122, 0);
                var3 = 195;
                ph.b(37, var3, 554, 3355443);
                ph.b(35, var3 + 1, 558, 15116313);
                ph.b(37, 2 + var3, 554, 3355443);
                var4Lifetime3 = 350;
                ph.b(37, var4Lifetime3, 554, 3355443);
                ph.b(35, var4Lifetime3 + 1, 558, 15116313);
                ph.b(37, 2 + var4Lifetime3, 554, 3355443);
              } else {
                if (this.field_h != 6 &&
                  this.field_h != 8) {
                  if (7 == this.field_h) {
                    qh.field_c.c(mf.field_s, 321, 1 + (dd.field_c.field_x + 167), 0, -1);
                    stackIn_58_0 = qh.field_c;
                    stackIn_59_1 = (0 != ie.field_b.field_s);
                    stackIn_61_2 = 0;
                    stackIn_62_3 = (ie.field_b.field_L != 0);
                    stackIn_65_4 = (fa.field_b != 0);
                    ((pk) (Object) stackIn_58_0).c(tf.a(stackIn_59_1, stackIn_61_2, stackIn_62_3, stackIn_65_4), 321, 190 + dd.field_c.field_x + 1, 0, -1);
                    stackIn_67_0 = qh.field_c;
                    stackIn_68_1 = (ie.field_b.field_s != 0);
                    stackIn_71_2 = (fa.field_b != 0);
                    stackIn_73_3 = param0 ^ 95;
                    stackIn_74_4 = (ie.field_b.field_L != 0);
                    ((pk) (Object) stackIn_67_0).c(pp.a(stackIn_68_1, stackIn_71_2, stackIn_73_3, stackIn_74_4), 321, 280 + dd.field_c.field_x + 1, 0, -1);
                    stackIn_76_0 = qh.field_c;
                    stackIn_77_1 = (0 != ie.field_b.field_s);
                    stackIn_79_2 = 2;
                    stackIn_80_3 = (ie.field_b.field_L != 0);
                    stackIn_83_4 = (fa.field_b != 0);
                    ((pk) (Object) stackIn_76_0).c(qn.a(stackIn_77_1, stackIn_79_2, stackIn_80_3, stackIn_83_4), 321, 329 + dd.field_c.field_x, 0, -1);
                    if (var8 == 0) {
                      break L7;
                    }
                  }
                  if (10 == this.field_h) {
                    i.field_Q.a(vf.field_m, 62, 250 + um.field_m.field_x, 315, 1000, 0, -1, 0, 0, 3 * um.field_m.field_x / 2);
                    if (var8 == 0) {
                      break L7;
                    }
                  }
                  if (this.field_h != 11) {
                    break L7;
                  }
                  wb.b(-1);
                  gd.field_a[da.field_a].b(245, 199);
                  if (mf.field_t < vi.field_a.length << 2) {
                    vi.a(-(mf.field_t >> 2) + vi.field_a.length, gd.field_a[gf.field_h], 245, 199, vi.field_a);
                  }
                  ph.c(243, 197, gd.field_a[0].field_j + 4, 4 + gd.field_a[0].field_e, 1);
                  return;
                }
                stackIn_96_0 = (this.field_h == 6) ? 0 : 1;
                var2Lifetime3 = stackIn_96_0;
                this.a(var2Lifetime3 != 0, (byte) -128);
                var3 = 168;
                ph.b(33, var3, 573, 3355443);
                ph.b(31, 1 + var3, 577, 15116313);
                ph.b(33, 2 + var3, 573, 3355443);
                var4Lifetime3 = 373;
                ph.b(33, var4Lifetime3, 573, 3355443);
                ph.b(31, 1 + var4Lifetime3, 577, 15116313);
                ph.b(33, var4Lifetime3 + 2, 573, 3355443);
              }
            }
          }
        }
        var2Lifetime1 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(var2Lifetime1 < this.field_a.field_i)))) {
          stackOut_103_0 = this.c(4, var2Lifetime1);
          stackIn_111_0 = stackOut_103_0 ? 1 : 0;
          stackIn_104_0 = stackOut_103_0;
          if (var8 == 0) {
            if (stackIn_104_0) {
              stackIn_108_1 = (~var2Lifetime1 == ~this.field_a.field_g);
              this.a(stackIn_108_1, this.a(23, var2Lifetime1), var2Lifetime1, 0);
            }
            var2Lifetime1++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_111_0 = ~this.field_h;
        }
        if (stackIn_111_0 == -10) {
          var2Lifetime2 = jd.a(param0 ^ 93);
          if (~wi.field_a.length == ~nh.field_k) {
            stackIn_115_0 = 1 + wi.field_a[nh.field_k - 1];
          } else {
            stackIn_115_0 = wi.field_a[nh.field_k];
          }
          var3 = stackIn_115_0;
          var4Lifetime1 = wi.field_a[rn.field_j];
          if (var4Lifetime1 < var3) {
            stackIn_118_0 = qc.field_ab[var4Lifetime1];
          } else {
            stackIn_118_0 = hg.field_d[nh.field_k];
          }
          var5Lifetime1 = stackIn_118_0;
          var6 = null;
          if (10 > var2Lifetime2 &&
            var3 < var2Lifetime2) {
            var15 = ol.field_d;
            var6 = var15;
            if (je.a((byte) 46)) {
              var6 = var15 + " " + gn.field_i;
            }
            if (2 > var2Lifetime2 ||
              !(wp.field_w <= 0)) {
              var16 = bl.field_g;
              var6 = var16;
              if (je.a((byte) 81)) {
                var6 = var16 + " " + gn.field_i;
              }
            }
          }
          if (var2Lifetime2 > (var5Lifetime1 + 10)) {
            var6 = dd.field_b;
            if (je.a((byte) 115)) {
              var6 = v.field_j;
            }
          }
          if (var6 != null) {
            ji.a(false, nl.field_s, 0, (String) (var6), 250, 16777120);
          }
        }
        return;
    }

    private final void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var2Lifetime1;
        var4 = Torquing.field_u;
        if (e.field_f == 70) {
          ti.field_k = ti.field_k ^ true;
          return;
        }
        try {
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          if (ri.field_E >= 2 && (9 == this.field_h ||
            0 == this.field_h) && (48 == e.field_f &&
            i.field_P[82])) {
            nh.field_k = wi.field_a.length;
            decompiledFrameRemainder1 = !(!je.field_c);
            if (decompiledFrameRemainder1) {
              wp.field_w = 1;
              ee.field_s = false;
              lp.field_f = false;
              decompiledFrameRemainder1 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder1) {
            if ((4 == this.field_h) &&
              (decompiledFrameRemainder1 = !(this.field_a.a((byte) -116)))) {
              if ((104 == e.field_f) &&
                (decompiledFrameRemainder1 = !(a.field_e <= 0))) {
                a.field_e = a.field_e - 1;
                cm.field_m = cm.field_m + 298;
                decompiledFrameRemainder1 = (0 == a.field_e);
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (this.field_a.field_g == 0))) {
                  this.field_a.field_g = 2;
                  decompiledFrameRemainder1 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                if ((e.field_f == 105) &&
                  (decompiledFrameRemainder1 = !(hg.field_b.length <= (a.field_e + 1)))) {
                  cm.field_m = cm.field_m - 298;
                  a.field_e = a.field_e + 1;
                  decompiledFrameRemainder1 = (hg.field_b.length - 1 == a.field_e);
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder1 = (this.field_a.field_g == 2))) {
                    this.field_a.field_g = 1;
                    decompiledFrameRemainder1 = (var4 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if ((102 != e.field_f) &&
                    (decompiledFrameRemainder1 = (103 == e.field_f))) {
                    var2 = -a.field_e + (-1 + hg.field_b.length);
                    a.field_e = a.field_e + var2;
                    cm.field_m = cm.field_m - var2 * 298;
                    if (this.field_a.field_g == 2) {
                      this.field_a.field_g = 1;
                    }
                    decompiledFrameRemainder1 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    cm.field_m = cm.field_m + 298 * a.field_e;
                    a.field_e = 0;
                    decompiledFrameRemainder1 = (this.field_a.field_g == 0);
                    if (decompiledFrameRemainder1) {
                      this.field_a.field_g = 2;
                      decompiledFrameRemainder1 = (var4 != 0);
                    }
                  }
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (this.field_h == 3)) {
              if (e.field_f != 98 &&
                e.field_f != 99) {
                if (e.field_f == 96) {
                  if (this.field_a.field_g != -1) {
                    if (!(2 <= this.field_a.field_g)) {
                      this.field_a.a(-this.field_a.field_g + 1, -1);
                      if (var4 != 0) {
                        this.field_a.a(1, -1);
                      }
                    }
                  } else {
                    this.field_a.a(1, -1);
                  }
                  this.field_a.b(true);
                  decompiledRegionSelector0 = 1;
                  decompiledFrameRemainder2 = false;
                }
                else {
                  decompiledFrameRemainder1 = (e.field_f == 97);
                  if (decompiledFrameRemainder1) {
                    if (-1 != this.field_a.field_g) {
                      if (!(2 <= this.field_a.field_g)) {
                        this.field_a.a(-this.field_a.field_g + 1, -1);
                        if (var4 != 0) {
                          this.field_a.a(0, -1);
                        }
                      }
                    } else {
                      this.field_a.a(0, -1);
                    }
                    this.field_a.b(true);
                    decompiledRegionSelector0 = 2;
                    decompiledFrameRemainder2 = false;
                  }
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_a.field_g == 2) {
                  this.field_a.a(mj.field_k, -1);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_a.field_g == -1) {
                    if (99 != e.field_f) {
                      this.field_a.a(mj.field_k, -1);
                      if (var4 != 0) {
                        this.field_a.a(2, -1);
                        mj.field_k = this.field_a.field_g;
                        this.field_a.a(2, -1);
                      }
                    } else {
                      this.field_a.a(2, -1);
                      if (var4 != 0) {
                        mj.field_k = this.field_a.field_g;
                        this.field_a.a(2, -1);
                      }
                    }
                  } else {
                    mj.field_k = this.field_a.field_g;
                    this.field_a.a(2, -1);
                  }
                }
                this.field_a.b(true);
                decompiledRegionSelector0 = 0;
                decompiledFrameRemainder2 = false;
              }
            }
          }
          if (decompiledFrameRemainder2) {
            if (param0 < 65) {
              this.a(-115, (byte) 99);
            }
            var2Lifetime1 = this.field_a.field_g;
            if (!rf.field_x[this.field_h]) {
              this.field_a.a(0);
              if (var4 != 0) {
                this.field_a.a(false);
              }
            } else {
              this.field_a.a(false);
            }
            if (~var2Lifetime1 != ~this.field_a.field_g &&
              !this.c(4, this.field_a.field_g)) {
              if (!rf.field_x[this.field_h]) {
                this.field_a.a(0);
                if (var4 != 0) {
                  this.field_a.a(false);
                }
              } else {
                this.field_a.a(false);
              }
            }
            decompiledRegionSelector0 = 3;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          if (this.field_a.field_g != -1) {
            this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
          }
          throw mh.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        if (decompiledRegionSelector0 != 0 &&
          decompiledRegionSelector0 != 1 &&
          decompiledRegionSelector0 != 2) {
          if (this.field_a.field_g != -1) {
            this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
          }
          return;
        }
        if (this.field_a.field_g == -1) {
          return;
        }
        this.a(this.d(-76, this.field_a.field_g), (byte) 109, false);
    }

    private final int d(int param0, int param1) {
        int var3 = -21 % ((8 - param0) / 51);
        if (this.field_h != 11) {
          return param1;
        }
        if (param1 == -1) {
          return -1;
        }
        return -param1 + 1;
    }

    private final void a(int param0, byte param1) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        int var18 = 0;
        bm var19 = null;
        bm var20 = null;
        long[] var27 = null;
        int[] var28 = null;
        int var5Lifetime1;
        var18 = Torquing.field_u;
        if (je.a((byte) 107)) {
          var3 = 90 + param0;
          qh.field_c.c(rd.field_v, 320, var3 + qh.field_c.field_x, 0, -1);
          var3 = var3 + qh.field_c.field_x * 3;
          qh.field_c.a(ti.field_m, 130, var3, 380, 1000, 0, -1, 1, 0, qh.field_c.field_x * 3 / 2);
          return;
        }
        if (null == vl.field_c) {
          vl.field_c = bn.a(11, 3, 1, (byte) 44, 10);
        }
        if (param1 < 45) {
          this.a(-7, 127, -114, -69, 82, 6, 92, -22);
        }
        L2: {
          boolean decompiledFrameRemainder0 = true;
          var19 = vl.field_c;
          var20 = var19;
          if (!var20.field_k) {
            var4 = pm.field_p;
            decompiledFrameRemainder0 = (var18 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null != var20.field_p) {
              var4 = rd.field_v;
              var5 = ld.field_k;
              var6 = var19.field_p[var5];
              var27 = var19.field_m[var5];
              var28 = var19.field_n[var5];
              var9 = 0;
              var10 = 7 + param0;
              var11 = 0;
              L7: while (true) {
                if (10 >= var11) {
                  stackIn_34_0 = ~var11;
                  stackIn_34_1 = -11;
                  if (var18 != 0) {
                    break L2;
                  }
                  boolean decompiledFrameRemainder1 = true;
                  if (stackIn_34_0 != stackIn_34_1) {
                    if (null == var6[var11]) {
                      var10 += 20;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var12 = 0;
                      if (bn.a(var6[var11], -17310) &&
                        var9 == 0 &&
                        null != gn.field_l &&
                        ~var27[var11] == ~gn.field_l.field_l &&
                        ~var28[var11] == ~ie.field_b.field_s) {
                        var12 = 2;
                        var9 = 1;
                      }
                      var15 = var11 + 1 + ". ";
                      var13 = var28[var11];
                      var4 = "";
                      var14 = var6[var11];
                    }
                  } else {
                    if (ie.field_b == null) {
                      break L7;
                    }
                    if (var9 != 0) {
                      break L7;
                    }
                    var12 = 2;
                    var14 = re.field_e;
                    var13 = ie.field_b.field_s;
                    var15 = "";
                  }
                  if (decompiledFrameRemainder1) {
                    qh.field_c.a(var15, 148, var10 + qh.field_c.field_x, var12, -1);
                    var16 = var14;
                    qh.field_c.b(var16, 148, qh.field_c.field_x + var10, var12, -1);
                    var17 = Integer.toString(var13);
                    qh.field_c.a(var17, 517, var10 + qh.field_c.field_x, var12, -1);
                    var10 += 20;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              if (var18 != 0) {
                var4 = qp.field_o;
              }
            } else {
              var4 = qp.field_o;
            }
          }
          qh.field_c.a(n.field_r, 130, 13 + param0 + 220, 380, 1000, 0, -1, 1, 0, qh.field_c.field_x * 3 / 2);
          stackIn_34_0 = param0;
          stackIn_34_1 = 90;
        }
        var5Lifetime1 = stackIn_34_0 + stackIn_34_1;
        i.field_Q.c(var4, 320, var5Lifetime1 + um.field_m.field_x, 4, -1);
    }

    mh(Torquing param0, int param1) {
        this.field_b = -1;
        this.field_j = -1;
        this.field_e = -1;
        try {
          this.field_c = param0;
          this.field_h = param1;
          this.field_a = new db(rf.field_q[param1].length);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
