/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class of {
    static rl field_c;
    static ka field_b;
    static boolean[][][] field_a;
    static int field_d;
    static int field_f;
    static int field_e;

    abstract void a(int param0, byte[] param1);

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        of var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param2 instanceof byte[]) {
            var3 = (byte[]) (param2);
            if (param1) {
              stackIn_9_0 = ek.a(var3, -43);
              return stackIn_9_0;
            }
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          if (!(param2 instanceof of)) {
            var3_int = -55 / ((65 - param0) / 60);
            throw new IllegalArgumentException();
          }
          var4 = (of) (param2);
          stackIn_13_0 = var4.c(2);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("of.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static dk b(int param0) {
        if (pf.field_f == null) {
          pf.field_f = new dk();
          pf.field_f.a(oe.field_g, -22373);
          pf.field_f.field_e = 7697781;
          pf.field_f.field_r = 5;
          pf.field_f.field_o = 4;
          pf.field_f.field_h = 0;
          pf.field_f.field_t = ug.field_f;
          pf.field_f.field_k = 6;
          pf.field_f.field_n = 14;
          pf.field_f.field_p = 2763306;
        }
        int var1 = 24 % ((52 - param0) / 61);
        return pf.field_f;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = (boolean[][][]) null;
        if (param0 != 8727) {
          of.a(85, -111, (byte) -85, true, -34);
        }
    }

    final static void a(int param0, int param1, byte param2, boolean param3, int param4) {
        int stackIn_17_0 = 0;
        int[][] stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        boolean stackIn_83_4;
        int[][] stackIn_101_0;
        int stackIn_101_1;
        int stackIn_101_2;
        int stackIn_101_3;
        boolean stackIn_102_4;
        int[][] stackIn_118_0;
        int stackIn_118_1;
        int stackIn_118_2;
        int stackIn_118_3;
        boolean stackIn_119_4;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        qe var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        String var29 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var12Lifetime5;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var18Lifetime1;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var13Lifetime4;
        int var21Lifetime3;
        int var22Lifetime3;
        int var24Lifetime2;
        int var24Lifetime3;
        int var10Lifetime3Lifetime1;
        int var11Lifetime3Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime3Lifetime1;
        int var20Lifetime1Lifetime1;
        int var20Lifetime2Lifetime1;
        int var21Lifetime2Lifetime1;
        int var22Lifetime1Lifetime1;
        int var22Lifetime2Lifetime1;
        var28 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = gh.field_x ? 1 : 0;
          var6 = bc.field_o;
          var7 = bb.field_h;
          if (var5_int != 0) {
            if (-1 != var6) {
              if (var6 != 13) {
                if (var6 == 1 &&
                  var7 == -1) {
                  stackIn_17_0 = 1;
                } else {
                  if (var6 == 1) {
                    stackIn_17_0 = (var7 == 13) ? 1 : 0;
                  } else {
                    stackIn_17_0 = 0;
                  }
                }
              } else {
                stackIn_17_0 = 1;
              }
            } else {
              stackIn_17_0 = 1;
            }
          } else {
            stackIn_17_0 = 0;
          }
          var8 = stackIn_17_0;
          if (var8 != 0) {
            qg.a(sh.field_w);
            qg.a(0, 0, 320, 240);
          }
          od.a(param0, param1, 1, 7, 6, lj.field_o[0]);
          if (var8 != 0) {
            qg.b(sh.field_w);
          }
          od.a(param0, param1 + (479 - lj.field_o[1].field_v), 1, 7, 6, lj.field_o[1]);
          uk.field_N.g(param0, param1);
          if (param2 < 32) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          var10 = 5 + nh.field_db[0];
          var11 = nh.field_db[1] + 5;
          var12 = (-8 + nh.field_db[2]) / 5;
          var14 = 0;
          var15 = 0;
          var16 = -1;
          var17 = 0;
          var18 = 24;
          if (param3 && (param4 == 0 ||
            param4 == 2)) {
            for (var20 = 0; var20 < 5; var20++) {
              if (0 < (1 << var20 & vi.field_a)) {
                var19 = ea.field_g[mh.field_d[var20]];
                if (!wa.field_pb[-(ea.field_e * 5) + var19.field_V] &&
                  var15 == 0) {
                  var17 = var19.field_D;
                  var16 = var20;
                  var15 = 1;
                }
                var14++;
              }
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            if (!param3) {
              var14 = ef.field_k % 300;
              var14 = var14 / 50;
              var17 = ef.field_k % 50;
              var15 = 1;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 && (param4 == 0 ||
            param4 == 2)) {
            for (var20Lifetime1 = 0; var20Lifetime1 < 5; var20Lifetime1++) {
              if ((vi.field_a & 1 << var20Lifetime1) > 0) {
                if (var15 != 0 &&
                  var16 == var20Lifetime1) {
                  dl.field_j.a(var10 + param0, param1 + var11, -(5 * var17) + 255, 16777215);
                } else {
                  dl.field_j.g(param0 + var10, param1 + var11);
                }
              }
              var10 = var10 + var12;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (!param3) {
              for (var20Lifetime1Lifetime1 = 0; var20Lifetime1Lifetime1 < var14 - 1; var20Lifetime1Lifetime1++) {
                dl.field_j.g(var10 + param0, var11 + param1);
                var10 = var10 + var12;
              }
              if (var15 != 0 &&
                0 < var14) {
                dl.field_j.a(var10 + param0, var11 + param1, 255 - 5 * var17, 16777215);
              } else {
                if (var14 > 0) {
                  dl.field_j.g(param0 + var10, param1 + var11);
                }
              }
            }
          }
          if (0 == param4 ||
            param4 == 1) {
            var20Lifetime2 = 0;
            var21 = 0;
            var22 = 0;
            var23 = -1;
            if (param3) {
              var21Lifetime3 = wb.field_p.field_d;
              var20Lifetime2Lifetime1 = wb.field_p.field_db;
              var22Lifetime3 = jj.a(255);
              if (ii.field_i > 0) {
                var23 = 255 * ii.field_i / 50;
              }
            } else {
              var21Lifetime3 = 5;
              var20Lifetime2Lifetime1 = ef.field_k % 250 / 50;
              var22Lifetime3 = ef.field_k % 300 / 50;
              var20Lifetime2Lifetime1 = var21Lifetime3 - var20Lifetime2Lifetime1;
            }
            var10Lifetime1 = 10 + ob.field_b[0];
            var11Lifetime1 = 10 + ob.field_b[1];
            var12Lifetime1 = (-8 + ob.field_b[2] - 20) / 9;
            var10Lifetime1 = var10Lifetime1 + (-(9 * var12Lifetime1) + (-28 + ob.field_b[2])) / 2;
            var13 = ob.field_b[3] - 20;
            for (var24 = 0; var24 < var20Lifetime2Lifetime1; var24++) {
              if (ad.field_b.length > var24) {
                if (0 < var23 &&
                  var24 >= be.field_d) {
                  mb.field_d[0].a(var10Lifetime1 + param0, param1 + var11Lifetime1, var23, 16777215);
                } else {
                  mb.field_d[0].g(var10Lifetime1 + param0, var11Lifetime1 + param1);
                }
                stackIn_82_0 = ad.field_b[var24];
                stackIn_82_1 = var11Lifetime1 + param1;
                stackIn_82_2 = mb.field_d[0].field_v;
                stackIn_82_3 = 4;
                stackIn_83_4 = (0 == de.field_d % 8);
                rd.a(stackIn_82_0, stackIn_82_1, stackIn_82_2, stackIn_82_3, stackIn_83_4, 4, -1012815519, mb.field_d[0].field_q, param0 + var10Lifetime1, 2);
                var10Lifetime1 = var10Lifetime1 + (1 + var12Lifetime1);
                continue;
              }
              break;
            }
            for (var24Lifetime2 = var20Lifetime2Lifetime1; var21Lifetime3 > var24Lifetime2; var24Lifetime2++) {
              if (ad.field_b.length > var24Lifetime2) {
                mb.field_d[2].g(param0 + var10Lifetime1, param1 + var11Lifetime1);
                var10Lifetime1 = var10Lifetime1 + (1 + var12Lifetime1);
                continue;
              }
              break;
            }
            var24Lifetime3 = 5 - var22Lifetime3 % 5;
            var13Lifetime4 = mb.field_d[0].field_v;
            var12Lifetime1Lifetime1 = mb.field_d[0].field_q;
            if (var22Lifetime3 % 5 > 0) {
              mb.field_d[0].c(-var12Lifetime1Lifetime1 + (-10 + ob.field_b[2] + (ob.field_b[0] - (-param0 - var24Lifetime3))), var24Lifetime3 + (var11Lifetime1 + param1), -(2 * var24Lifetime3) + var12Lifetime1Lifetime1, -(var24Lifetime3 * 2) + var13Lifetime4);
            }
          }
          if (param4 == 2 &&
            o.field_l > 0) {
            var11Lifetime2 = ed.field_i[1] + 4 - (ec.field_a[1].field_q >> 2);
            var12Lifetime2 = ed.field_i[2];
            var10Lifetime2 = -(ec.field_a[1].field_q >> 2) + ed.field_i[0] + 1;
            for (var20Lifetime3 = 0; 10 > var20Lifetime3; var20Lifetime3++) {
              if (db.field_B <= var20Lifetime3) {
                ec.field_a[2].g(var10Lifetime2, var11Lifetime2);
              } else {
                ec.field_a[1].g(var10Lifetime2, var11Lifetime2);
                stackIn_101_0 = p.field_f[var20Lifetime3];
                stackIn_101_1 = (ec.field_a[1].field_q >> 2) + var11Lifetime2;
                stackIn_101_2 = ec.field_a[1].field_v >> 1;
                stackIn_101_3 = 4;
                stackIn_102_4 = (0 == de.field_d % 8);
                rd.a(stackIn_101_0, stackIn_101_1, stackIn_101_2, stackIn_101_3, stackIn_102_4, 4, -1012815519, ec.field_a[1].field_q >> 1, var10Lifetime2 + (ec.field_a[1].field_q >> 2), 2);
              }
              var10Lifetime2 = var10Lifetime2 + (ec.field_a[1].field_u + 1);
            }
          }
          if (1 == param4) {
            var11Lifetime3 = 6 + oa.field_a[1];
            var20Lifetime4 = 8;
            var10Lifetime3 = oa.field_a[0] + 7;
            if (null != cj.field_f) {
              rl.field_h[fh.field_e].g(var10Lifetime3, var11Lifetime3);
            }
            var11Lifetime3Lifetime1 = oa.field_a[1] + (oa.field_a[3] - mb.field_d[1].field_v >> 1);
            var10Lifetime3Lifetime1 = oa.field_a[0] - (-10 - rl.field_h[fh.field_e].field_q);
            var13Lifetime1 = oa.field_a[3];
            var12Lifetime3 = -rl.field_h[fh.field_e].field_q + (oa.field_a[2] - 20 - var20Lifetime4 + 1);
            var21Lifetime1 = var12Lifetime3 / var20Lifetime4;
            var22Lifetime1 = (-(var21Lifetime1 * var20Lifetime4) + var12Lifetime3) / 2 + var10Lifetime3Lifetime1;
            var12Lifetime3Lifetime1 = var21Lifetime1 * var20Lifetime4;
            var23Lifetime1 = 0;
            var24Lifetime1 = 0;
            if (cj.field_f != null) {
              var23Lifetime1 = cj.field_f.field_db;
              var24Lifetime1 = cj.field_f.field_d;
              if (var23Lifetime1 <= 0) {
                var23Lifetime1 = 0;
              }
            }
            var25 = var10Lifetime3Lifetime1;
            qg.a(sh.field_w);
            var26 = var22Lifetime1 + (var20Lifetime4 - 1 + var12Lifetime3Lifetime1) * var23Lifetime1 / var24Lifetime1;
            qg.a(var25, var11Lifetime3Lifetime1, var26, var11Lifetime3Lifetime1 + var13Lifetime1);
            for (var27 = 0; var27 < var20Lifetime4; var27++) {
              mb.field_d[1].g(var22Lifetime1, var11Lifetime3Lifetime1);
              stackIn_118_0 = ad.field_b[var27];
              stackIn_118_1 = var11Lifetime3Lifetime1;
              stackIn_118_2 = mb.field_d[1].field_v;
              stackIn_118_3 = 4;
              stackIn_119_4 = (de.field_d % 8 == 0);
              rd.a(stackIn_118_0, stackIn_118_1, stackIn_118_2, stackIn_118_3, stackIn_119_4, 4, -1012815519, mb.field_d[1].field_q, var22Lifetime1, 2);
              var22Lifetime1 = var22Lifetime1 + (1 + var21Lifetime1);
            }
            var25Lifetime1 = var26;
            qg.b(sh.field_w);
            var26Lifetime1 = var20Lifetime4 - 1 + (var12Lifetime3Lifetime1 + var22Lifetime1);
            qg.a(sh.field_w);
            qg.a(var25Lifetime1, var11Lifetime3Lifetime1, var26Lifetime1, var13Lifetime1 + var11Lifetime3Lifetime1);
            var22Lifetime1Lifetime1 = var10Lifetime3Lifetime1 + 1;
            for (var27Lifetime1 = 0; var27Lifetime1 < var20Lifetime4; var27Lifetime1++) {
              mb.field_d[2].g(var22Lifetime1Lifetime1, var11Lifetime3Lifetime1);
              var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 + (var21Lifetime1 + 1);
            }
            qg.b(sh.field_w);
          }
          var12Lifetime4 = oj.field_e[2];
          var11Lifetime4 = oj.field_e[1];
          var10Lifetime4 = oj.field_e[0];
          var13Lifetime2 = oj.field_e[3];
          var10Lifetime4 = 2 + (var10Lifetime4 + (var12Lifetime4 >> 1) + 12);
          var18Lifetime1 = 24;
          var20Lifetime5 = 0;
          if (!param3) {
            var20Lifetime6 = ef.field_k % 300;
            var20Lifetime6 = var20Lifetime6 / 100;
            var20Lifetime6 = 3 - var20Lifetime6;
          } else {
            var20Lifetime6 = gl.field_k;
          }
          tf.field_x.a(Integer.toString(var20Lifetime6), var10Lifetime4 + param0, param1 + var11Lifetime4 + ((var13Lifetime2 - var18Lifetime1 >> 1) + 18), 0, -1);
          if (param4 != 0 &&
            param4 != 1) {
            if (param4 == 2) {
              var11Lifetime5 = af.field_f[1];
              var12Lifetime5 = af.field_f[2];
              var9 = w.field_j + (o.field_l / 50 + 1);
              var10Lifetime5 = af.field_f[0];
              var13Lifetime3 = af.field_f[3];
              tf.field_x.c(var9, 13 + var10Lifetime5, (var13Lifetime3 - var18Lifetime1 >> 1) + (var11Lifetime5 + 18), 0, -1);
            }
          } else {
            var21Lifetime2 = 0;
            var22Lifetime2 = 0;
            if (!param3) {
              var21Lifetime2Lifetime1 = 100 * (ef.field_k % 1000);
              var22Lifetime2Lifetime1 = ef.field_k % 500 / 200;
            } else {
              var21Lifetime2Lifetime1 = tf.field_o;
              var22Lifetime2Lifetime1 = ab.field_d;
            }
            var10Lifetime5 = af.field_f[0];
            var9 = oi.field_h + var21Lifetime2Lifetime1;
            var11Lifetime5 = af.field_f[1];
            var13Lifetime3 = af.field_f[3];
            var12Lifetime5 = af.field_f[2];
            tf.field_x.c(var9, 13 + var10Lifetime5 + param0, param1 + var11Lifetime5 + (var13Lifetime3 - var18Lifetime1 >> 1) + 18, 0, -1);
            if (1 < var22Lifetime2Lifetime1) {
              var11Lifetime5 = ag.field_e.field_x + ((var13Lifetime3 - ag.field_e.field_K - ag.field_e.field_x >> 1) + var11Lifetime5);
              var29 = vj.field_b + var22Lifetime2Lifetime1;
              var10Lifetime5 = var12Lifetime5 + var10Lifetime5;
              ag.field_e.b(var29, var10Lifetime5 + (param0 - 13), param1 + var11Lifetime5, 0, -1);
            }
          }
          if ((0 == param4 ||
            param4 == 2) &&
            param3) {
            TorChallenge.field_E = be.a(mj.field_b, dk.field_a, vj.field_c, param1 + rf.field_eb[vj.field_c][1], rf.field_eb[vj.field_c][0] + param0, 25, TorChallenge.field_E, hf.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "of.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract byte[] c(int param0);

    static {
        field_b = new ka(160, 160);
        field_a = new boolean[][][]{new boolean[][]{new boolean[]{false, false, false, false, false, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false, false, false, true}, new boolean[]{false, false, false, false, true}, new boolean[]{false, false, false, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false, true}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false, false, false, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, true}, new boolean[]{false}, new boolean[]{false, false, false, false, false, true}}};
        field_d = 65;
    }
}
