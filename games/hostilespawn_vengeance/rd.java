/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    private gb field_f;
    static bd field_a;
    static boolean field_d;
    private gb field_c;
    static String field_g;
    static int field_h;
    private jm field_b;
    private jm field_e;

    private final jb a(int[] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jb var8 = null;
        qf var9 = null;
        jb stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        jb stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        jb stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb var8Lifetime1;
        try {
          var5_int = param2 ^ (param1 >>> 12 | (-1610608641 & param1) << 4);
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (jb) (this.field_e.a(false, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param0 != null &&
            0 >= param0[0]) {
            return null;
          }
          var9 = (qf) (this.field_b.a(false, var6));
          if (var9 == null) {
            var9 = qf.a(this.field_c, param1, param2);
            if (var9 == null) {
              stackIn_11_0 = null;
              return (jb) (stackIn_11_0);
            }
            this.field_b.a(-122, var6, var9);
          }
          var8Lifetime1 = var9.a(param0);
          if (param3 != 97) {
            stackIn_15_0 = (jb) null;
            return stackIn_15_0;
          }
          if (var8Lifetime1 == null) {
            stackIn_18_0 = null;
            return (jb) (stackIn_18_0);
          }
          var9.b(126);
          this.field_e.a(param3 ^ -21, var6, var8Lifetime1);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("rd.G(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final jb a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jb var8 = null;
        va var9 = null;
        int var10 = 0;
        jb var11 = null;
        jb stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        jb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb var8Lifetime1;
        try {
          var5_int = param3 ^ ((-1879044097 & param1) << 4 | param1 >>> 12);
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int;
          var8 = (jb) (this.field_e.a(false, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_6_0 = null;
            return (jb) (stackIn_6_0);
          }
          var9 = va.a(this.field_f, param1, param3);
          if (var9 == null) {
            return null;
          }
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.field_e.a(-107, var6, var8Lifetime1);
          if (param2 != null) {
            param2[0] = param2[0] - var11.field_k.length;
          }
          var10 = -41 % ((param0 + 60) / 44);
          stackIn_14_0 = var8Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rd.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final jb a(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        jb stackIn_2_0 = null;
        jb stackIn_6_0 = null;
        jb stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -22) {
            stackIn_2_0 = (jb) null;
            return stackIn_2_0;
          }
          if (1 == this.field_c.f(-120)) {
            stackIn_6_0 = this.a(param1, 0, param2, (byte) 97);
            return stackIn_6_0;
          }
          if (1 != this.field_c.c(0, param2)) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(param1, param2, 0, (byte) 97);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final jb a(int[] param0, int param1, int param2) {
        jb discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        jb stackIn_3_0 = null;
        jb stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f.f(-114) == 1) {
            stackIn_3_0 = this.a(-117, 0, param0, param2);
            return stackIn_3_0;
          }
          if (param1 != 128) {
            var5 = (int[]) null;
            discarded$1 = this.a(44, 65, (int[]) null, 71);
          }
          if (this.field_f.c(0, param2) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(param1 - 76, param2, param0, 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("rd.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
          return;
        }
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0) {
        int var20 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_117_0;
        int stackIn_117_1;
        int stackIn_117_2;
        int stackIn_117_3;
        int stackIn_117_4;
        int stackIn_118_5 = 0;
        int stackIn_120_0;
        int stackIn_120_1;
        int stackIn_120_2;
        int stackIn_120_3;
        int stackIn_120_4;
        int stackIn_121_5 = 0;
        int stackIn_123_0;
        int stackIn_123_1;
        int stackIn_123_2;
        int stackIn_123_3;
        int stackIn_123_4;
        int stackIn_124_5;
        int stackIn_140_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6_ref_oc = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oc var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean[] var16 = null;
        boolean[] var17 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        boolean[] var29 = null;
        boolean[] var34 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        boolean[] var42 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var24 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0) {
            field_h = -14;
          }
          pf.field_I = null;
          if ((5 & el.field_m) == 0) {
            ri.field_h = -1;
          }
          var1_int = ln.field_a.field_d;
          var2 = ln.field_a.field_n;
          var3 = uj.field_p.field_e;
          var4 = uj.field_p.field_g;
          if (1 == ln.field_a.field_m) {
            si.d();
          } else {
            uf.field_i[4].c(-24 + -var3 / 16, -var4 / 16 - 24);
          }
          stackIn_11_0 = qa.field_b;
          if (80 > qa.field_b) {
            stackIn_12_1 = 0;
          } else {
            stackIn_12_1 = -80 + qa.field_b;
          }
          stackIn_14_2 = 640 - qa.field_b;
          if (qa.field_b < 80) {
            stackIn_15_3 = 480;
          } else {
            stackIn_15_3 = 80 + (-qa.field_b + 480);
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          si.d(stackIn_11_0, stackIn_12_1, stackIn_14_2, stackIn_15_3);
          var5 = mm.field_m[0];
          if (hg.field_e == 1) {
            var6_ref_oc = new oc();
            ln.field_a.a(-2, 1);
            var10 = var5.field_j;
            if (jf.field_c == 0) {
              var11 = var10.field_e;
              var12 = var10.field_g;
              if (ha.field_t != 5) {
                if (ha.field_t == 6 &&
                  var11 >= nh.field_E.field_e &&
                  nh.field_E.field_g <= var12 &&
                  nh.field_E.field_e + 2 >= var11 &&
                  var12 <= 2 + nh.field_E.field_g) {
                  kd.a(9, 1);
                } else {
                  if ((ha.field_t == 0 &&
                    var11 >= nh.field_E.field_e &&
                    var12 >= nh.field_E.field_g &&
                    nh.field_E.field_e + 2 >= var11 &&
                    var12 <= 2 + nh.field_E.field_g ||
                    ha.field_t == 14 &&
                    !(nh.field_E.field_e > var11) &&
                    !(var12 < -3 + nh.field_E.field_g) &&
                    !(var11 > nh.field_E.field_e + 4) &&
                    !(var12 > 4 + nh.field_E.field_g)) && bm.field_c == 0) {
                    if (rl.field_c == 0 &&
                      !bj.field_a) {
                      bj.field_a = true;
                    } else {
                      if (rl.field_c == 1 &&
                        !tg.field_a) {
                        tg.field_a = true;
                      } else {
                        if (rl.field_c == 9) {
                          mf.a(false, 3);
                          ti.a(253, (byte) -122, 2);
                        } else {
                          if (2 == rl.field_c) {
                            mf.a(false, 2);
                            ti.a(255, (byte) -112, 0);
                          } else {
                            mf.a(false, 2);
                            if (6 == rl.field_c) {
                              ti.a(254, (byte) -10, 1);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var13 = var11 - nh.field_E.field_e;
                if (0 > var13) {
                  var13 = -var13;
                }
                var14 = var12 - nh.field_E.field_g;
                if (var14 < 0) {
                  var14 = -var14;
                }
                if (var13 < 10 &&
                  var14 < 10) {
                  kd.a(6, 1);
                }
              }
              if (eh.field_g <= 0) {
                if (4 > mc.field_I) {
                  eh.field_c.a(fg.field_b[17], 100, 2 * uh.field_i);
                }
                mf.a(false, 4);
              }
            }
            var11Lifetime1 = var3 / 24;
            var12Lifetime1 = -1 + var4 / 24;
            var14Lifetime1 = 20 + var12Lifetime1 + 1;
            var13Lifetime1 = 2 + var11Lifetime1 + 26;
            if (var12Lifetime1 <= 0) {
              var12Lifetime1 = 1;
            }
            if (var1_int - 1 <= var14Lifetime1) {
              var14Lifetime1 = var1_int - 2;
            }
            if (var13Lifetime1 >= -1 + var1_int) {
              var13Lifetime1 = -2 + var1_int;
            }
            if (var11Lifetime1 <= 0) {
              var11Lifetime1 = 1;
            }
            var40 = ln.field_a.field_y;
            var34 = ln.field_a.field_B;
            var29 = var34;
            var16 = var29;
            var17 = ln.field_a.field_r;
            var39 = ln.field_a.field_o;
            var42 = ln.field_a.field_e;
            for (var20 = var12Lifetime1; var20 <= var14Lifetime1; var20++) {
              var9 = -var4 + var20 * 24;
              var7 = var1_int * var20 + var11Lifetime1;
              for (var21 = var11Lifetime1; var21 <= var13Lifetime1; var21++) {
                var7++;
                var22 = var39[var7];
                if ((var22 >> 8 != 4 ||
                  bm.field_c != 0 ||
                  rl.field_c != 2 ||
                  ha.field_t == 14) && (-1 == var39[var7] ||
                  !(0 >= ak.field_b[var22].field_a)) && (!pa.field_d ||
                  var16[var7] ||
                  !var17[var7]) && pk.field_d[var40[var7]] != null) {
                  var8 = -var3 + 24 * var21;
                  pk.field_d[var40[var7]].e(var8, var9);
                }
              }
            }
            var9Lifetime1 = 0;
            var8Lifetime1 = 0;
            var41 = ln.field_a.field_u;
            var6_ref_oc.field_g = var12Lifetime1;
            while (var14Lifetime1 >= var6_ref_oc.field_g) {
              var6_ref_oc.field_e = var11Lifetime1;
              while (var13Lifetime1 >= var6_ref_oc.field_e) {
                var7Lifetime2 = var6_ref_oc.b(-4);
                vf.a(-63, var7Lifetime2);
                if (18 <= var40[var7Lifetime2] &&
                  21 >= var40[var7Lifetime2] &&
                  16 > var41[var7Lifetime2]) {
                  var41[var7Lifetime2] = 16;
                }
                var6_ref_oc.field_e = var6_ref_oc.field_e + 1;
              }
              var6_ref_oc.field_g = var6_ref_oc.field_g + 1;
            }
            lg.a(var4, 0, 0, var3);
            bi.a(var4, -457, var41, var3);
            gn.a(var4, var8Lifetime1, var3, 101, var9Lifetime1, var42, var34);
            if (14 == ul.field_L ||
              tg.field_a &&
              of.field_d != dn.field_i) {
              var21Lifetime1 = 688 - var3;
              var22Lifetime1 = 560 - var4;
              stackIn_117_0 = var21Lifetime1;
              stackIn_117_1 = var22Lifetime1;
              stackIn_117_2 = 64;
              stackIn_117_3 = 64;
              stackIn_117_4 = 16776960;
              if (ca.field_c >= 256) {
                stackIn_118_5 = 512 - ca.field_c;
              } else {
                stackIn_118_5 = ca.field_c;
              }
              si.e(stackIn_117_0, stackIn_117_1, stackIn_117_2, stackIn_117_3, stackIn_117_4, stackIn_118_5 >> 1);
              var23 = 511 & ca.field_c + 64;
              stackIn_120_0 = 4 + var21Lifetime1;
              stackIn_120_1 = 4 + var22Lifetime1;
              stackIn_120_2 = 56;
              stackIn_120_3 = 56;
              stackIn_120_4 = 16776960;
              if (var23 < 256) {
                stackIn_121_5 = var23;
              } else {
                stackIn_121_5 = 512 - var23;
              }
              si.e(stackIn_120_0, stackIn_120_1, stackIn_120_2, stackIn_120_3, stackIn_120_4, stackIn_121_5 >> 1);
              var23 = var23 + 64 & 511;
              stackIn_123_0 = var21Lifetime1 + 8;
              stackIn_123_1 = 8 + var22Lifetime1;
              stackIn_123_2 = 48;
              stackIn_123_3 = 48;
              stackIn_123_4 = 16776960;
              if (var23 < 256) {
                stackIn_124_5 = var23;
              } else {
                stackIn_124_5 = -var23 + 512;
              }
              si.e(stackIn_123_0, stackIn_123_1, stackIn_123_2, stackIn_123_3, stackIn_123_4, stackIn_124_5 >> 1);
            }
            if (vj.field_g != 1) {
              if (vj.field_g == 2) {
                ad.a((byte) -118);
              }
            } else {
              lf.a((byte) -122);
            }
            vf.a(var1_int, var2, var11Lifetime1, 28, var12Lifetime1, var14Lifetime1, var13Lifetime1);
            lg.a(var4, 0, 1, var3);
            ih.a(-15587, var1_int);
            nj.a(11178);
            nm.a(var1_int, 3);
            hi.b(false);
            qa.a(var11Lifetime1, 18, var12Lifetime1, var13Lifetime1, var14Lifetime1, var1_int, var2);
            ei.d(-114);
            if (null != pf.field_I) {
              id.field_A.b(pf.field_I, lh.field_a, -8 + aj.field_d, 16772608, 0);
            }
            dd.g(-125);
            decompiledFrameRemainder0 = (null == q.field_g ||
              q.field_g.b(96));
            if (decompiledFrameRemainder0) {
              if (ul.field_L <= 1) {
                stackIn_140_0 = (ul.field_L == -1) ? 1 : 0;
              } else {
                stackIn_140_0 = 1;
              }
              var21Lifetime2 = stackIn_140_0;
              if (bm.field_c == 0 &&
                rl.field_c == 0 &&
                of.field_d == dn.field_i) {
                var21Lifetime2 = 0;
              }
              if (0 == bm.field_c &&
                1 == rl.field_c &&
                dn.field_i == of.field_d) {
                var21Lifetime2 = 0;
              }
              if (bm.field_c == 0 &&
                8 == rl.field_c &&
                3 == ha.field_t &&
                pm.field_a) {
                var21Lifetime2 = 0;
              }
              if (var21Lifetime2 != 0) {
                nh.field_P.a((byte) -46);
                decompiledFrameRemainder0 = false;
              }
              else {
                var6 = 0;
                if (mc.field_I == 5) {
                  var6 = 16777215;
                }
                if (0 < jf.field_c &&
                  128 > jf.field_c) {
                  si.a(0, 0, 640, 480, var6, jf.field_c * 2);
                }
                if (128 <= jf.field_c &&
                  jf.field_c < 256) {
                  si.a(0, 0, 640, 480, var6, 512 - 2 * jf.field_c);
                }
                cb.a(631, var5);
                if (!(0 >= lg.field_f)) {
                  for (var7Lifetime3 = 0; 20 > var7Lifetime3; var7Lifetime3++) {
                    si.e(0 + var7Lifetime3, 0 + var7Lifetime3, -(var7Lifetime3 * 2) + 640, -(var7Lifetime3 * 2) + 480, 16711680, lg.field_f * (20 - var7Lifetime3) / 4);
                  }
                }
                decompiledFrameRemainder1 = false;
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            uf.field_i[4].c(-(uf.field_i[4].field_z / 2) + 320, 240 - uf.field_i[4].field_A / 2);
          }
          if (decompiledFrameRemainder1) {
            var6Lifetime1 = 0;
            if (mc.field_I == 5) {
              var6Lifetime1 = 16777215;
            }
            if (0 < jf.field_c &&
              128 > jf.field_c) {
              si.a(0, 0, 640, 480, var6Lifetime1, jf.field_c * 2);
            }
            if (128 <= jf.field_c &&
              jf.field_c < 256) {
              si.a(0, 0, 640, 480, var6Lifetime1, 512 - 2 * jf.field_c);
            }
            cb.a(631, var5);
            if (0 < lg.field_f) {
              for (var7Lifetime1 = 0; 20 > var7Lifetime1; var7Lifetime1++) {
                si.e(0 + var7Lifetime1, 0 + var7Lifetime1, -(var7Lifetime1 * 2) + 640, -(var7Lifetime1 * 2) + 480, 16711680, lg.field_f * (20 - var7Lifetime1) / 4);
              }
            }
          }
          if (li.field_q < 2) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "rd.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
          if (param0 != -6) {
            rd.a(false);
          }
          if (null != q.field_b) {
            try {
              q.field_b.a(0L, (byte) 109);
              q.field_b.a(24, sc.field_g.field_i, sc.field_g.field_n, (byte) 60);
            } catch (Exception exception) {
            }
          }
          sc.field_g.field_i = sc.field_g.field_i + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    rd(gb param0, gb param1) {
        this.field_b = new jm(256);
        this.field_e = new jm(256);
        try {
          this.field_f = param0;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Waiting for music";
        field_h = 10;
        field_d = false;
    }
}
