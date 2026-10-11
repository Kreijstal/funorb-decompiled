/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends pi {
    int[] field_r;
    static boolean field_q;
    int field_n;
    static int[] field_o;
    static int field_p;

    final static boolean a(boolean param0, byte param1, boolean param2, int param3, boolean param4) {
        int var25 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25_ref = null;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var33 = null;
        int var9Lifetime1;
        int var10Lifetime1;
        int var18Lifetime1;
        var26 = MinerDisturbance.field_ab;
        try {
          param3 = 640 + (-param3 - 640);
          ol.field_c.f(param3 + (320 - (ol.field_c.field_x >> 1)), 15);
          var6 = -33 % ((-13 - param1) / 33);
          if (!param0) {
            stackIn_4_0 = sj.field_d;
          } else {
            stackIn_4_0 = di.field_x;
          }
          var30 = stackIn_4_0;
          var28 = var30;
          var27 = var28;
          var33 = var27;
          var7 = 420;
          if (var27 == null) {
            g.a(80, 326, param3 + (640 - var7) / 2, var7, (byte) 121, hd.field_d);
            return false;
          }
          var8 = 0;
          for (var9 = 33; var9 >= 0; var9--) {
            stackIn_12_0 = (!nm.a(var9, var30, -827843803)) ? 0 : 1;
            var10 = stackIn_12_0;
            if (var10 != 0 ||
              !param0 &&
              !pi.field_k[var9] &&
              (!pi.field_e[var9] ||
              !(pj.field_a <= 0))) {
              var8++;
            }
          }
          var9Lifetime1 = (-1 + var8) / 9;
          var10Lifetime1 = 20 * (var9Lifetime1 * 9 + (-var8 + 9));
          var11 = 32 * (1 - var9Lifetime1 + 3);
          var12 = 145 + param3;
          var13 = 126;
          var14 = 0;
          var15 = -1;
          if (kb.field_c == 3) {
            var7 = 480;
          }
          g.a(80, 262 + 32 * var9Lifetime1, param3 + (640 - var7) / 2, var7, (byte) 16, hd.field_d);
          if (param0 &&
            !mh.a(var30, -1)) {
            pk.field_b.a(cn.field_K, 110 + param3 + 60, 166, 16610816, -1);
            return false;
          }
          stackIn_33_0 = (cm.field_o != 1) ? 0 : 1;
          var16 = stackIn_33_0;
          var17 = 0;
          for (var18 = 0; ld.field_A.length > var18; var18++) {
            boolean decompiledFrameRemainder0 = true;
            if (nm.a(var18, var33, -827843803)) {
              nj.field_c[var18].c(var12, var13);
            } else {
              decompiledFrameRemainder0 = !(param0);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = !(pi.field_k[var18]))) {
                if (pj.field_a <= 0) {
                  decompiledFrameRemainder0 = !(pi.field_e[var18]);
                  if (decompiledFrameRemainder0) {
                    ha.field_c.c(var12, var13);
                  }
                } else {
                  ha.field_c.c(var12, var13);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (nk.field_w >= var12 &&
                var12 + 32 >= nk.field_w &&
                var13 <= gb.field_e &&
                gb.field_e <= 32 + var13) {
                if (qh.field_c < 0) {
                  te.field_d[0].f(var12 - 16, -8 + var13);
                  if (qh.field_c < 10) {
                    te.field_d[ph.field_c / 4 % 5].f(-16 + var12, -8 + var13);
                  }
                }
                var15 = var18;
              }
              if (ah.field_e == var18) {
                if (qh.field_c >= 0) {
                  if (qh.field_c >= 5) {
                    te.field_d[qh.field_c].f(var12 - 16, -8 + var13);
                  } else {
                    te.field_d[0].f(-16 + var12, var13 - 8);
                    te.field_d[qh.field_c].f(var12 - 16, -8 + var13);
                  }
                } else {
                  mb.field_d[4].f(var12 - 1, -4 + var13);
                }
              }
              var14++;
              if (var14 != 9) {
                var12 += 40;
              } else {
                var13 += 32;
                var12 = 145 + param3;
                var17++;
                if (var9Lifetime1 == var17) {
                  var12 = var12 + var10Lifetime1;
                }
                var14 = 0;
                if (!param2) {
                  var13 += 5;
                }
              }
            }
          }
          var18Lifetime1 = -var11 + 314;
          if (ah.field_e >= 0) {
            var15 = ah.field_e;
          }
          var19 = 105 + param3;
          if (var15 != -1) {
            ce.field_d.b(ld.field_A[var15], param3 + 320, var18Lifetime1, 0, -1);
            var20 = ce.field_d.field_G + 3;
            var21 = 30 + (278 - var11);
            var22 = nm.a(var15, var33, -827843803) ? 1 : 0;
            if (var22 == 0) {
              ha.field_c.f(30 + var19, var21 + 7);
              var21 += 30;
              mm.field_a.a(mc.field_e, 150 + var19, var21, 33023, -1);
            } else {
              nj.field_c[var15].f(var19 + 30, 7 + var21);
              var21 += 30;
              mm.field_a.a(dl.field_f, 50 + (var19 + 150), var21, 33023, -1);
            }
            var21 += 23;
            var23 = 440 - var11;
            var24 = 30 - var11 + 380;
            if (pi.field_j[var15] &&
              var22 == 0) {
              ce.field_d.a(ge.field_b, 290 + param3, var21 - var20, 215, 480, 1, -1, 0, 0, var20);
            } else {
              var21 = var21 + ce.field_d.field_N * ce.field_d.a(fb.field_g[var15], 290 + param3, var21 - var20, 215, 480, 1, -1, 0, 0, var20);
              if (param4 &&
                en.field_a[var15] != null) {
                var21 += 10;
                var25_ref = null;
                if (var16 == 0 && (var15 == 3 ||
                  var15 == 1 ||
                  var15 == 0 ||
                  var15 == 2)) {
                  var25_ref = oa.a((byte) -118, en.field_a[var15], new String[]{ab.a(0, kb.field_c, true, (long)a.field_c, true)});
                }
                if (var16 != 0 && (var15 == 14 ||
                  var15 == 15 ||
                  16 == var15 ||
                  var15 == 17 ||
                  25 == var15)) {
                  var25_ref = oa.a((byte) -119, en.field_a[var15], new String[]{ab.a(0, kb.field_c, true, (long)a.field_c, true)});
                }
                if (var15 == 4) {
                  var25_ref = oa.a((byte) -73, en.field_a[var15], new String[]{"" + nm.field_g[0]});
                }
                if (5 == var15) {
                  var25_ref = oa.a((byte) -95, en.field_a[var15], new String[]{"" + nm.field_g[1]});
                }
                if (var15 == 6) {
                  var25_ref = oa.a((byte) -84, en.field_a[var15], new String[]{"" + nm.field_g[2]});
                }
                if (var15 == 7) {
                  var25_ref = oa.a((byte) -77, en.field_a[var15], new String[]{"" + nm.field_g[3]});
                }
                if (8 == var15 ||
                  13 == var15) {
                  var25_ref = oa.a((byte) -121, en.field_a[var15], new String[]{"" + nm.field_g[4]});
                }
                if (var16 != 0 &&
                  var15 == 18) {
                  var25_ref = oa.a((byte) -113, en.field_a[var15], new String[]{"" + nm.field_g[5]});
                }
                if (var15 == 9) {
                  var25_ref = oa.a((byte) -113, en.field_a[var15], new String[]{"" + qf.field_p});
                }
                if (var15 == 11) {
                  var25_ref = oa.a((byte) -127, en.field_a[var15], new String[]{"" + vi.field_q});
                }
                if (var15 == 12) {
                  var25_ref = oa.a((byte) -81, en.field_a[var15], new String[]{"" + jc.field_H});
                }
                if (var16 != 0 &&
                  var15 == 19) {
                  var25_ref = oa.a((byte) -124, en.field_a[var15], new String[]{"" + eb.field_b});
                }
                if (var16 != 0 &&
                  var15 == 21) {
                  var25_ref = oa.a((byte) -73, en.field_a[var15], new String[]{"" + eb.field_e});
                }
                if (var16 != 0 &&
                  24 == var15) {
                  var25_ref = oa.a((byte) -107, en.field_a[var15], new String[]{"" + lb.field_r});
                }
                if (var16 != 0 &&
                  28 == var15) {
                  var25_ref = oa.a((byte) -124, en.field_a[var15], new String[]{"" + re.field_d});
                }
                if (var16 != 0 &&
                  var15 == 27) {
                  var25_ref = oa.a((byte) -75, en.field_a[var15], new String[]{"" + am.c((byte) -50), "35"});
                }
                if (var16 != 0 &&
                  var15 == 31) {
                  var25_ref = oa.a((byte) -92, en.field_a[var15], new String[]{"" + me.field_h / 50});
                }
                if (var16 != 0 &&
                  var15 == 26) {
                  var25_ref = oa.a((byte) -83, en.field_a[var15], new String[]{"" + pi.field_a * 100 / 2800});
                }
                if (33 == var15) {
                  var25_ref = oa.a((byte) -121, en.field_a[var15], new String[]{ri.a((byte) 115)});
                }
                if (var25_ref != null) {
                  ce.field_d.a((String) (var25_ref), 290 + param3, -var20 + var24, 215, 480, 8947848, -1, 0, 0, var20);
                }
              }
            }
            for (var25 = 0; pi.field_m[var15] > var25; var25++) {
              cb.field_e.c(var25 * 10 + 165 + var19, var24);
            }
            ce.field_d.c(fn.field_q, -130 + (var19 + 505), var23 + (-ce.field_d.field_I - ce.field_d.field_E), 1, -1);
            ce.field_d.b(Integer.toString(pi.field_i[var15]), -31 + (-130 + var19) + 505, var23, 1, -1);
          } else {
            ce.field_d.b(i.field_d, param3 + 320, var18Lifetime1, 0, -1);
          }
          return !(0 > var15);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5), "jb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private jb() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        if (param0 != 110) {
          return;
        }
        field_o = null;
    }

    static {
        field_o = new int[]{128, 180};
        field_p = 500;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static boolean $cfr$intArgs$a$3cff09437531(boolean param0, int param1, boolean param2, int param3, boolean param4) {
        int var25 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25_ref = null;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var33 = null;
        int var9Lifetime1;
        int var10Lifetime1;
        int var18Lifetime1;
        var26 = MinerDisturbance.field_ab;
        try {
          param3 = 640 + (-param3 - 640);
          ol.field_c.f(param3 + (320 - (ol.field_c.field_x >> 1)), 15);
          var6 = -33 % ((-13 - param1) / 33);
          if (!param0) {
            stackIn_4_0 = sj.field_d;
          } else {
            stackIn_4_0 = di.field_x;
          }
          var30 = stackIn_4_0;
          var28 = var30;
          var27 = var28;
          var33 = var27;
          var7 = 420;
          if (var27 == null) {
            g.a(80, 326, param3 + (640 - var7) / 2, var7, (byte) 121, hd.field_d);
            return false;
          }
          var8 = 0;
          for (var9 = 33; var9 >= 0; var9--) {
            stackIn_12_0 = (!nm.a(var9, var30, -827843803)) ? 0 : 1;
            var10 = stackIn_12_0;
            if (var10 != 0 ||
              !param0 &&
              !pi.field_k[var9] &&
              (!pi.field_e[var9] ||
              !(pj.field_a <= 0))) {
              var8++;
            }
          }
          var9Lifetime1 = (-1 + var8) / 9;
          var10Lifetime1 = 20 * (var9Lifetime1 * 9 + (-var8 + 9));
          var11 = 32 * (1 - var9Lifetime1 + 3);
          var12 = 145 + param3;
          var13 = 126;
          var14 = 0;
          var15 = -1;
          if (kb.field_c == 3) {
            var7 = 480;
          }
          g.a(80, 262 + 32 * var9Lifetime1, param3 + (640 - var7) / 2, var7, (byte) 16, hd.field_d);
          if (param0 &&
            !mh.a(var30, -1)) {
            pk.field_b.a(cn.field_K, 110 + param3 + 60, 166, 16610816, -1);
            return false;
          }
          stackIn_33_0 = (cm.field_o != 1) ? 0 : 1;
          var16 = stackIn_33_0;
          var17 = 0;
          for (var18 = 0; ld.field_A.length > var18; var18++) {
            boolean decompiledFrameRemainder0 = true;
            if (nm.a(var18, var33, -827843803)) {
              nj.field_c[var18].c(var12, var13);
            } else {
              decompiledFrameRemainder0 = !(param0);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = !(pi.field_k[var18]))) {
                if (pj.field_a <= 0) {
                  decompiledFrameRemainder0 = !(pi.field_e[var18]);
                  if (decompiledFrameRemainder0) {
                    ha.field_c.c(var12, var13);
                  }
                } else {
                  ha.field_c.c(var12, var13);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (nk.field_w >= var12 &&
                var12 + 32 >= nk.field_w &&
                var13 <= gb.field_e &&
                gb.field_e <= 32 + var13) {
                if (qh.field_c < 0) {
                  te.field_d[0].f(var12 - 16, -8 + var13);
                  if (qh.field_c < 10) {
                    te.field_d[ph.field_c / 4 % 5].f(-16 + var12, -8 + var13);
                  }
                }
                var15 = var18;
              }
              if (ah.field_e == var18) {
                if (qh.field_c >= 0) {
                  if (qh.field_c >= 5) {
                    te.field_d[qh.field_c].f(var12 - 16, -8 + var13);
                  } else {
                    te.field_d[0].f(-16 + var12, var13 - 8);
                    te.field_d[qh.field_c].f(var12 - 16, -8 + var13);
                  }
                } else {
                  mb.field_d[4].f(var12 - 1, -4 + var13);
                }
              }
              var14++;
              if (var14 != 9) {
                var12 += 40;
              } else {
                var13 += 32;
                var12 = 145 + param3;
                var17++;
                if (var9Lifetime1 == var17) {
                  var12 = var12 + var10Lifetime1;
                }
                var14 = 0;
                if (!param2) {
                  var13 += 5;
                }
              }
            }
          }
          var18Lifetime1 = -var11 + 314;
          if (ah.field_e >= 0) {
            var15 = ah.field_e;
          }
          var19 = 105 + param3;
          if (var15 != -1) {
            ce.field_d.b(ld.field_A[var15], param3 + 320, var18Lifetime1, 0, -1);
            var20 = ce.field_d.field_G + 3;
            var21 = 30 + (278 - var11);
            var22 = nm.a(var15, var33, -827843803) ? 1 : 0;
            if (var22 == 0) {
              ha.field_c.f(30 + var19, var21 + 7);
              var21 += 30;
              mm.field_a.a(mc.field_e, 150 + var19, var21, 33023, -1);
            } else {
              nj.field_c[var15].f(var19 + 30, 7 + var21);
              var21 += 30;
              mm.field_a.a(dl.field_f, 50 + (var19 + 150), var21, 33023, -1);
            }
            var21 += 23;
            var23 = 440 - var11;
            var24 = 30 - var11 + 380;
            if (pi.field_j[var15] &&
              var22 == 0) {
              ce.field_d.a(ge.field_b, 290 + param3, var21 - var20, 215, 480, 1, -1, 0, 0, var20);
            } else {
              var21 = var21 + ce.field_d.field_N * ce.field_d.a(fb.field_g[var15], 290 + param3, var21 - var20, 215, 480, 1, -1, 0, 0, var20);
              if (param4 &&
                en.field_a[var15] != null) {
                var21 += 10;
                var25_ref = null;
                if (var16 == 0 && (var15 == 3 ||
                  var15 == 1 ||
                  var15 == 0 ||
                  var15 == 2)) {
                  var25_ref = oa.a((byte) -118, en.field_a[var15], new String[]{ab.a(0, kb.field_c, true, (long)a.field_c, true)});
                }
                if (var16 != 0 && (var15 == 14 ||
                  var15 == 15 ||
                  16 == var15 ||
                  var15 == 17 ||
                  25 == var15)) {
                  var25_ref = oa.a((byte) -119, en.field_a[var15], new String[]{ab.a(0, kb.field_c, true, (long)a.field_c, true)});
                }
                if (var15 == 4) {
                  var25_ref = oa.a((byte) -73, en.field_a[var15], new String[]{"" + nm.field_g[0]});
                }
                if (5 == var15) {
                  var25_ref = oa.a((byte) -95, en.field_a[var15], new String[]{"" + nm.field_g[1]});
                }
                if (var15 == 6) {
                  var25_ref = oa.a((byte) -84, en.field_a[var15], new String[]{"" + nm.field_g[2]});
                }
                if (var15 == 7) {
                  var25_ref = oa.a((byte) -77, en.field_a[var15], new String[]{"" + nm.field_g[3]});
                }
                if (8 == var15 ||
                  13 == var15) {
                  var25_ref = oa.a((byte) -121, en.field_a[var15], new String[]{"" + nm.field_g[4]});
                }
                if (var16 != 0 &&
                  var15 == 18) {
                  var25_ref = oa.a((byte) -113, en.field_a[var15], new String[]{"" + nm.field_g[5]});
                }
                if (var15 == 9) {
                  var25_ref = oa.a((byte) -113, en.field_a[var15], new String[]{"" + qf.field_p});
                }
                if (var15 == 11) {
                  var25_ref = oa.a((byte) -127, en.field_a[var15], new String[]{"" + vi.field_q});
                }
                if (var15 == 12) {
                  var25_ref = oa.a((byte) -81, en.field_a[var15], new String[]{"" + jc.field_H});
                }
                if (var16 != 0 &&
                  var15 == 19) {
                  var25_ref = oa.a((byte) -124, en.field_a[var15], new String[]{"" + eb.field_b});
                }
                if (var16 != 0 &&
                  var15 == 21) {
                  var25_ref = oa.a((byte) -73, en.field_a[var15], new String[]{"" + eb.field_e});
                }
                if (var16 != 0 &&
                  24 == var15) {
                  var25_ref = oa.a((byte) -107, en.field_a[var15], new String[]{"" + lb.field_r});
                }
                if (var16 != 0 &&
                  28 == var15) {
                  var25_ref = oa.a((byte) -124, en.field_a[var15], new String[]{"" + re.field_d});
                }
                if (var16 != 0 &&
                  var15 == 27) {
                  var25_ref = oa.a((byte) -75, en.field_a[var15], new String[]{"" + am.c((byte) -50), "35"});
                }
                if (var16 != 0 &&
                  var15 == 31) {
                  var25_ref = oa.a((byte) -92, en.field_a[var15], new String[]{"" + me.field_h / 50});
                }
                if (var16 != 0 &&
                  var15 == 26) {
                  var25_ref = oa.a((byte) -83, en.field_a[var15], new String[]{"" + pi.field_a * 100 / 2800});
                }
                if (33 == var15) {
                  var25_ref = oa.a((byte) -121, en.field_a[var15], new String[]{ri.a((byte) 115)});
                }
                if (var25_ref != null) {
                  ce.field_d.a((String) (var25_ref), 290 + param3, -var20 + var24, 215, 480, 8947848, -1, 0, 0, var20);
                }
              }
            }
            for (var25 = 0; pi.field_m[var15] > var25; var25++) {
              cb.field_e.c(var25 * 10 + 165 + var19, var24);
            }
            ce.field_d.c(fn.field_q, -130 + (var19 + 505), var23 + (-ce.field_d.field_I - ce.field_d.field_E), 1, -1);
            ce.field_d.b(Integer.toString(pi.field_i[var15]), -31 + (-130 + var19) + 505, var23, 1, -1);
          } else {
            ce.field_d.b(i.field_d, param3 + 320, var18Lifetime1, 0, -1);
          }
          return !(0 > var15);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5), "jb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }
}
