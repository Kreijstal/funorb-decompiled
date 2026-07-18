/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends ph {
    static String field_K;
    private bg field_I;
    private int field_M;
    static int field_O;
    static String field_G;
    static ub field_N;
    static pf[] field_J;
    static bd field_L;
    static jj field_H;

    final String e(int param0) {
        if (!(!((wj) this).field_u)) {
            return ((wj) this).field_I.a(-41);
        }
        if (param0 == 34) {
            return null;
        }
        wj.a((byte) 60);
        return null;
    }

    final static void b(String param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -10603) {
                break L1;
              } else {
                wm discarded$2 = wj.e((byte) -71);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wj.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        bm var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bd var12 = null;
        bd var13 = null;
        bd var14 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        super.a(param0, param1, (byte) 69, param3);
        if (param3 != 0) {
          return;
        } else {
          L0: {
            var5 = ((wj) this).field_v + (param1 - -(((wj) this).field_s >> 1));
            if (param2 > 42) {
              break L0;
            } else {
              field_K = null;
              break L0;
            }
          }
          L1: {
            L2: {
              var6 = (((wj) this).field_x >> 1) + (((wj) this).field_m + param0);
              var8 = ((wj) this).field_I.b(-95);
              if (var8 == wl.field_c) {
                break L2;
              } else {
                if (m.field_n == var8) {
                  break L2;
                } else {
                  if (var8 != bi.field_d) {
                    if (var8 == nd.field_d) {
                      var13 = cf.field_u[1];
                      var13.c(-(var13.field_z >> 1) + var5, -(var13.field_A >> 1) + var6, 256);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var12 = cf.field_u[2];
                    var12.c(var5 + -(var12.field_z >> 1), -(var12.field_A >> 1) + var6, 256);
                    break L1;
                  }
                }
              }
            }
            L3: {
              L4: {
                var14 = cf.field_u[0];
                var9 = var14.field_u << 1;
                var10 = var14.field_r << 1;
                if (null == ng.field_s) {
                  break L4;
                } else {
                  if (var9 > ng.field_s.field_z) {
                    break L4;
                  } else {
                    if (var10 > ng.field_s.field_A) {
                      break L4;
                    } else {
                      sb.a(ng.field_s, -127);
                      si.d();
                      break L3;
                    }
                  }
                }
              }
              ng.field_s = new bd(var9, var10);
              sb.a(ng.field_s, -121);
              break L3;
            }
            var14.b(112, 144, var14.field_u << 4, var14.field_r << 4, -((wj) this).field_M << 10, 4096);
            int discarded$1 = 0;
            eh.b();
            ng.field_s.c(-var14.field_u + var5, var6 - var14.field_r, 256);
            break L1;
          }
          return;
        }
    }

    final static wm e(byte param0) {
        if (param0 >= -59) {
            wm discarded$0 = wj.e((byte) 105);
        }
        return oa.field_b;
    }

    final boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 < 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wj.LA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; var4 < param0; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    public static void j() {
        field_L = null;
        field_G = null;
        field_N = null;
        field_K = null;
        field_J = null;
        field_H = null;
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            ((wj) this).field_M = ((wj) this).field_M + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "wj.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        float var1_float = 0.0f;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        oc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        og var10 = null;
        int var10_int = 0;
        boolean[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        double var13 = 0.0;
        int var13_int = 0;
        oc var13_ref_oc = null;
        int var14 = 0;
        double var15 = 0.0;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        boolean[] var22 = null;
        int[] var23 = null;
        boolean[] var24 = null;
        int[] var25 = null;
        boolean[] var26 = null;
        int[] var27 = null;
        boolean[] var28 = null;
        ql stackIn_62_0 = null;
        int stackIn_66_0 = 0;
        kd stackIn_67_0 = null;
        kd stackIn_68_0 = null;
        kd stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        wm stackIn_129_0 = null;
        jb[] stackIn_129_1 = null;
        wm stackIn_130_0 = null;
        jb[] stackIn_130_1 = null;
        wm stackIn_131_0 = null;
        jb[] stackIn_131_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_178_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_193_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int[][] stackIn_237_0 = null;
        int stackIn_237_1 = 0;
        int[][] stackIn_238_0 = null;
        int stackIn_238_1 = 0;
        int[][] stackIn_239_0 = null;
        int stackIn_239_1 = 0;
        int[] stackIn_239_2 = null;
        re stackIn_240_0 = null;
        re stackIn_240_1 = null;
        re stackIn_241_0 = null;
        re stackIn_241_1 = null;
        re stackIn_242_0 = null;
        re stackIn_242_1 = null;
        re stackIn_243_0 = null;
        re stackIn_243_1 = null;
        int stackIn_243_2 = 0;
        re stackIn_244_0 = null;
        re stackIn_244_1 = null;
        int stackIn_244_2 = 0;
        re stackIn_245_0 = null;
        re stackIn_245_1 = null;
        int stackIn_245_2 = 0;
        re stackIn_246_0 = null;
        re stackIn_246_1 = null;
        int stackIn_246_2 = 0;
        int stackIn_246_3 = 0;
        re stackIn_247_0 = null;
        re stackIn_247_1 = null;
        re stackIn_248_0 = null;
        re stackIn_248_1 = null;
        re stackIn_249_0 = null;
        re stackIn_249_1 = null;
        int stackIn_249_2 = 0;
        int[][] stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        int[][] stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        int[][] stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        int[] stackIn_272_2 = null;
        re stackIn_273_0 = null;
        re stackIn_273_1 = null;
        re stackIn_274_0 = null;
        re stackIn_274_1 = null;
        re stackIn_275_0 = null;
        re stackIn_275_1 = null;
        re stackIn_276_0 = null;
        re stackIn_276_1 = null;
        int stackIn_276_2 = 0;
        re stackIn_277_0 = null;
        re stackIn_277_1 = null;
        int stackIn_277_2 = 0;
        re stackIn_278_0 = null;
        re stackIn_278_1 = null;
        int stackIn_278_2 = 0;
        re stackIn_279_0 = null;
        re stackIn_279_1 = null;
        int stackIn_279_2 = 0;
        int stackIn_279_3 = 0;
        re stackIn_280_0 = null;
        re stackIn_280_1 = null;
        re stackIn_281_0 = null;
        re stackIn_281_1 = null;
        re stackIn_282_0 = null;
        re stackIn_282_1 = null;
        int stackIn_282_2 = 0;
        ql stackOut_61_0 = null;
        ql stackOut_60_0 = null;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        kd stackOut_66_0 = null;
        kd stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        kd stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        wm stackOut_128_0 = null;
        jb[] stackOut_128_1 = null;
        wm stackOut_130_0 = null;
        jb[] stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        wm stackOut_129_0 = null;
        jb[] stackOut_129_1 = null;
        int stackOut_129_2 = 0;
        int[][] stackOut_236_0 = null;
        int stackOut_236_1 = 0;
        int[][] stackOut_238_0 = null;
        int stackOut_238_1 = 0;
        int[] stackOut_238_2 = null;
        int[][] stackOut_237_0 = null;
        int stackOut_237_1 = 0;
        int[] stackOut_237_2 = null;
        re stackOut_239_0 = null;
        re stackOut_239_1 = null;
        re stackOut_240_0 = null;
        re stackOut_240_1 = null;
        re stackOut_242_0 = null;
        re stackOut_242_1 = null;
        int stackOut_242_2 = 0;
        re stackOut_241_0 = null;
        re stackOut_241_1 = null;
        int stackOut_241_2 = 0;
        re stackOut_243_0 = null;
        re stackOut_243_1 = null;
        int stackOut_243_2 = 0;
        re stackOut_245_0 = null;
        re stackOut_245_1 = null;
        int stackOut_245_2 = 0;
        int stackOut_245_3 = 0;
        re stackOut_244_0 = null;
        re stackOut_244_1 = null;
        int stackOut_244_2 = 0;
        int stackOut_244_3 = 0;
        re stackOut_246_0 = null;
        re stackOut_246_1 = null;
        re stackOut_248_0 = null;
        re stackOut_248_1 = null;
        int stackOut_248_2 = 0;
        re stackOut_247_0 = null;
        re stackOut_247_1 = null;
        int stackOut_247_2 = 0;
        int[][] stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        int[][] stackOut_271_0 = null;
        int stackOut_271_1 = 0;
        int[] stackOut_271_2 = null;
        int[][] stackOut_270_0 = null;
        int stackOut_270_1 = 0;
        int[] stackOut_270_2 = null;
        re stackOut_272_0 = null;
        re stackOut_272_1 = null;
        re stackOut_273_0 = null;
        re stackOut_273_1 = null;
        re stackOut_275_0 = null;
        re stackOut_275_1 = null;
        int stackOut_275_2 = 0;
        re stackOut_274_0 = null;
        re stackOut_274_1 = null;
        int stackOut_274_2 = 0;
        re stackOut_276_0 = null;
        re stackOut_276_1 = null;
        int stackOut_276_2 = 0;
        re stackOut_278_0 = null;
        re stackOut_278_1 = null;
        int stackOut_278_2 = 0;
        int stackOut_278_3 = 0;
        re stackOut_277_0 = null;
        re stackOut_277_1 = null;
        int stackOut_277_2 = 0;
        int stackOut_277_3 = 0;
        re stackOut_279_0 = null;
        re stackOut_279_1 = null;
        re stackOut_280_0 = null;
        re stackOut_280_1 = null;
        int stackOut_280_2 = 0;
        re stackOut_281_0 = null;
        re stackOut_281_1 = null;
        int stackOut_281_2 = 0;
        int stackOut_177_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_179_1 = 0;
        int stackOut_178_0 = 0;
        int stackOut_178_1 = 0;
        int stackOut_192_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_194_1 = 0;
        int stackOut_193_0 = 0;
        int stackOut_193_1 = 0;
        L0: {
          var20 = HostileSpawn.field_I ? 1 : 0;
          if (e.field_z > 0) {
            e.field_z = e.field_z - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0 >= of.field_a) {
            break L1;
          } else {
            of.field_a = of.field_a - 1;
            break L1;
          }
        }
        L2: {
          if (0 >= al.field_Q) {
            break L2;
          } else {
            al.field_Q = al.field_Q - 1;
            break L2;
          }
        }
        L3: {
          if (0 >= qh.field_u) {
            break L3;
          } else {
            qh.field_u = qh.field_u - 1;
            break L3;
          }
        }
        L4: {
          if (lg.field_f > 0) {
            lg.field_f = lg.field_f - 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (le.field_gb > 0) {
            le.field_gb = le.field_gb - 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (0 < te.field_K) {
            te.field_K = te.field_K - 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var1_float = kd.field_v.j();
          if (var1_float != vc.field_a) {
            kd.field_v.d(ua.a((byte) -10, vc.field_a, var1_float, 0.07000000029802322f));
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var1_float = kd.field_v.h();
          if (var1_float != qm.field_O) {
            kd.field_v.f(ua.a((byte) -96, qm.field_O, var1_float, 0.07000000029802322f));
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var1_float = kd.field_v.f();
          if (var1_float == ea.field_d) {
            break L9;
          } else {
            kd.field_v.b(ua.a((byte) -73, ea.field_d, var1_float, 0.009999999776482582f));
            break L9;
          }
        }
        L10: {
          var1_float = kd.field_v.g();
          if (var1_float != ag.field_w) {
            kd.field_v.e(ua.a((byte) -46, ag.field_w, var1_float, 1.0f));
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var1_float = kd.field_v.k();
          if (an.field_n == var1_float) {
            break L11;
          } else {
            kd.field_v.c(ua.a((byte) -112, an.field_n, var1_float, 0.009999999776482582f));
            break L11;
          }
        }
        L12: {
          var1_float = kd.field_v.e();
          if (var1_float != vb.field_Jb) {
            kd.field_v.a(ua.a((byte) -56, vb.field_Jb, var1_float, 0.009999999776482582f));
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          L14: {
            eb.field_e.a((tj) (Object) kd.field_v);
            ik.field_b = false;
            var2 = ln.field_a.field_d;
            var3 = ln.field_a.field_a;
            var4 = ln.field_a.field_n;
            if (cm.field_c == null) {
              break L14;
            } else {
              if (cm.field_c.length == var4) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          cm.field_c = new int[var4];
          break L13;
        }
        L15: {
          if (wa.a(false)) {
            wb.field_R = wb.field_R - 1;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (0 >= nl.field_d) {
            break L16;
          } else {
            nl.field_d = nl.field_d - 1;
            break L16;
          }
        }
        L17: {
          if (0 <= pj.field_v) {
            ik.field_c = ik.field_c + 1;
            if (ik.field_c <= 2) {
              break L17;
            } else {
              L18: {
                ik.field_c = 0;
                pj.field_v = pj.field_v + 1;
                if (pj.field_v != 4) {
                  break L18;
                } else {
                  pj.field_v = -1;
                  break L18;
                }
              }
              if (pj.field_v == 8) {
                pj.field_v = -1;
                break L17;
              } else {
                break L17;
              }
            }
          } else {
            break L17;
          }
        }
        L19: {
          if (0 < bh.field_d) {
            bh.field_d = bh.field_d - 1;
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          if (rf.field_f <= 0) {
            break L20;
          } else {
            rf.field_f = rf.field_f - 1;
            break L20;
          }
        }
        if (param0 < -22) {
          L21: {
            var5 = mm.field_m[0];
            var6 = var5.field_j;
            var7 = var6.field_e;
            var8 = var6.field_g;
            var9 = var6.b(-4);
            if ((15 & ng.field_u) != 0) {
              break L21;
            } else {
              L22: {
                if (null != q.field_g) {
                  stackOut_61_0 = q.field_g;
                  stackIn_62_0 = stackOut_61_0;
                  break L22;
                } else {
                  stackOut_60_0 = ue.field_a;
                  stackIn_62_0 = stackOut_60_0;
                  break L22;
                }
              }
              L23: {
                var10_int = ((ql) (Object) stackIn_62_0).a(var6, ni.field_e, (byte) 109) ? 1 : 0;
                if ((ni.field_e ? 1 : 0) == var10_int) {
                  break L23;
                } else {
                  L24: {
                    if (var10_int == 0) {
                      stackOut_65_0 = 0;
                      stackIn_66_0 = stackOut_65_0;
                      break L24;
                    } else {
                      stackOut_64_0 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      break L24;
                    }
                  }
                  L25: {
                    ni.field_e = stackIn_66_0 != 0;
                    stackOut_66_0 = ha.field_w;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_67_0 = stackOut_66_0;
                    if (ni.field_e) {
                      stackOut_68_0 = (kd) (Object) stackIn_68_0;
                      stackOut_68_1 = -4;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      break L25;
                    } else {
                      stackOut_67_0 = (kd) (Object) stackIn_67_0;
                      stackOut_67_1 = 4;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      break L25;
                    }
                  }
                  stackIn_69_0.field_w = stackIn_69_1;
                  break L23;
                }
              }
              L26: {
                if (ni.field_e) {
                  break L26;
                } else {
                  if (ii.b((byte) 30)) {
                    qm.field_O = 0.5f;
                    vc.field_a = 1.0f;
                    ea.field_d = 0.6000000238418579f;
                    vb.field_Jb = 0.800000011920929f;
                    ag.field_w = 10.0f;
                    an.field_n = 0.30000001192092896f;
                    break L21;
                  } else {
                    break L26;
                  }
                }
              }
              ea.field_d = 0.5f;
              ag.field_w = 30.0f;
              vb.field_Jb = 0.8999999761581421f;
              an.field_n = 0.20000000298023224f;
              vc.field_a = 0.30000001192092896f;
              qm.field_O = 0.5f;
              break L21;
            }
          }
          L27: {
            var10 = var5.field_l;
            if (5 != ha.field_t) {
              break L27;
            } else {
              L28: {
                var11_int = -var7 + nh.field_E.field_e;
                if (var11_int < 0) {
                  var11_int = -var11_int;
                  break L28;
                } else {
                  break L28;
                }
              }
              L29: {
                var12_int = nh.field_E.field_g - var8;
                if (var12_int >= 0) {
                  break L29;
                } else {
                  var12_int = -var12_int;
                  break L29;
                }
              }
              var13_int = var11_int - -var12_int;
              if (var13_int < 10) {
                kd.a(6, 1);
                break L27;
              } else {
                break L27;
              }
            }
          }
          L30: {
            var28 = ln.field_a.field_e;
            var26 = var28;
            var24 = var26;
            var22 = var24;
            var11 = var22;
            var27 = ln.field_a.field_i;
            var25 = var27;
            var23 = var25;
            var21 = var23;
            var12 = var21;
            if (0 != jf.field_c) {
              break L30;
            } else {
              if (hg.field_e == 0) {
                break L30;
              } else {
                if (jf.field_d >= 50) {
                  L31: {
                    if (le.field_D <= 0) {
                      break L31;
                    } else {
                      if (j.field_c != -1) {
                        L32: {
                          le.field_D = le.field_D - 1;
                          if (512.0 * Math.random() <= (double)le.field_D) {
                            break L32;
                          } else {
                            var13_ref_oc = new oc(var6);
                            var13_ref_oc.field_e = var13_ref_oc.field_e + (int)(-25.0 + 50.0 * Math.random());
                            var13_ref_oc.field_g = var13_ref_oc.field_g + (int)(-25.0 + Math.random() * 50.0);
                            var14 = 0;
                            L33: while (true) {
                              if (10 <= var14) {
                                L34: {
                                  var14 = -1;
                                  var15_int = (int)(3.0 * Math.random());
                                  if (var15_int == 0) {
                                    var14 = 0;
                                    break L34;
                                  } else {
                                    if (var15_int == 1) {
                                      var14 = 1;
                                      break L34;
                                    } else {
                                      if (2 == var15_int) {
                                        var14 = 10;
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                if (uj.field_l != 1) {
                                  break L32;
                                } else {
                                  if (ej.d((byte) 116)) {
                                    eh.field_c.a(em.field_a[var14], 100, uh.field_i * (128 - le.field_D / 4) / 128);
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                              } else {
                                jn.field_F[ib.field_c].field_c = Math.random() * 255.0;
                                jn.field_F[ib.field_c].field_j.a((byte) 46, var13_ref_oc);
                                jn.field_F[ib.field_c].field_l.a(var10, -28860);
                                jn.field_F[ib.field_c].field_e = 0;
                                jn.field_F[ib.field_c].field_h = 0;
                                jn.field_F[ib.field_c].field_i = 8;
                                ib.field_c = ib.field_c + 1;
                                var14++;
                                continue L33;
                              }
                            }
                          }
                        }
                        var13_int = 0;
                        L35: while (true) {
                          if (var13_int >= 5) {
                            break L31;
                          } else {
                            L36: {
                              if (Math.random() * 512.0 > (double)le.field_D) {
                                jn.field_F[ib.field_c].field_c = Math.random() * 255.0;
                                jn.field_F[ib.field_c].field_j.a((byte) 46, var6);
                                jn.field_F[ib.field_c].field_j.field_e = jn.field_F[ib.field_c].field_j.field_e + (int)(50.0 * Math.random() - 25.0);
                                jn.field_F[ib.field_c].field_j.field_g = jn.field_F[ib.field_c].field_j.field_g + (int)(-25.0 + Math.random() * 50.0);
                                jn.field_F[ib.field_c].field_l.a(var10, -28860);
                                jn.field_F[ib.field_c].field_e = 0;
                                jn.field_F[ib.field_c].field_h = 0;
                                jn.field_F[ib.field_c].field_i = 8;
                                ib.field_c = ib.field_c + 1;
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                            var13_int++;
                            continue L35;
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (le.field_D == 1) {
                    L37: {
                      if (uj.field_l != 1) {
                        break L37;
                      } else {
                        if (!ej.d((byte) 57)) {
                          break L37;
                        } else {
                          eh.field_c.a(lm.field_A[8], 100, uh.field_i);
                          break L37;
                        }
                      }
                    }
                    mf.a(false, 5);
                    break L30;
                  } else {
                    break L30;
                  }
                } else {
                  L38: {
                    int discarded$4 = 2;
                    pc.a();
                    var13_int = -25 + var8;
                    var14 = var8 + 25;
                    var15_int = -30 + var7;
                    if (var15_int >= 0) {
                      break L38;
                    } else {
                      var15_int = 0;
                      break L38;
                    }
                  }
                  L39: {
                    if (var3 <= var14) {
                      var14 = -1 + var3;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  L40: {
                    if (var13_int < 0) {
                      var13_int = 0;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    var16 = var7 + 30;
                    if (~var16 > ~var2) {
                      break L41;
                    } else {
                      var16 = var2 - 1;
                      break L41;
                    }
                  }
                  var18 = var13_int;
                  L42: while (true) {
                    if (var14 <= var18) {
                      L43: {
                        jf.field_d = jf.field_d + 1;
                        if (jf.field_d != 1) {
                          break L43;
                        } else {
                          L44: {
                            var18 = 0;
                            var19 = 1;
                            if (bm.field_c != 0) {
                              L45: {
                                if (4 >= rl.field_c) {
                                  var18 = 1;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              L46: {
                                if (rl.field_c != 0) {
                                  break L46;
                                } else {
                                  var19 = 0;
                                  break L46;
                                }
                              }
                              L47: {
                                if (rl.field_c == 8) {
                                  var19 = 0;
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                              if (rl.field_c == 9) {
                                var19 = 0;
                                break L44;
                              } else {
                                break L44;
                              }
                            } else {
                              L48: {
                                if (1 != rl.field_c) {
                                  break L48;
                                } else {
                                  var18 = 1;
                                  break L48;
                                }
                              }
                              if (rl.field_c != 0) {
                                break L44;
                              } else {
                                var19 = 0;
                                break L44;
                              }
                            }
                          }
                          if (var19 == 0) {
                            break L43;
                          } else {
                            if (uj.field_l != 1) {
                              break L43;
                            } else {
                              L49: {
                                stackOut_128_0 = eh.field_c;
                                stackOut_128_1 = lm.field_A;
                                stackIn_130_0 = stackOut_128_0;
                                stackIn_130_1 = stackOut_128_1;
                                stackIn_129_0 = stackOut_128_0;
                                stackIn_129_1 = stackOut_128_1;
                                if (var18 != 0) {
                                  stackOut_130_0 = (wm) (Object) stackIn_130_0;
                                  stackOut_130_1 = (jb[]) (Object) stackIn_130_1;
                                  stackOut_130_2 = 21;
                                  stackIn_131_0 = stackOut_130_0;
                                  stackIn_131_1 = stackOut_130_1;
                                  stackIn_131_2 = stackOut_130_2;
                                  break L49;
                                } else {
                                  stackOut_129_0 = (wm) (Object) stackIn_129_0;
                                  stackOut_129_1 = (jb[]) (Object) stackIn_129_1;
                                  stackOut_129_2 = 22;
                                  stackIn_131_0 = stackOut_129_0;
                                  stackIn_131_1 = stackOut_129_1;
                                  stackIn_131_2 = stackOut_129_2;
                                  break L49;
                                }
                              }
                              ((wm) (Object) stackIn_131_0).a(stackIn_131_1[stackIn_131_2], 90, uh.field_i);
                              break L43;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      var17 = var15_int + var18 * var2;
                      var19 = var15_int;
                      L50: while (true) {
                        if (~var19 <= ~var16) {
                          var18++;
                          continue L42;
                        } else {
                          L51: {
                            if (var11[var17]) {
                              if (var27[var17] >= 26) {
                                break L51;
                              } else {
                                var12[var17] = var12[var17] + 1;
                                break L51;
                              }
                            } else {
                              if (10 < var27[var17]) {
                                var12[var17] = var12[var17] - 1;
                                break L51;
                              } else {
                                break L51;
                              }
                            }
                          }
                          var17++;
                          var19++;
                          continue L50;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L52: {
            if (le.field_D != 1) {
              break L52;
            } else {
              if (1 == uj.field_l) {
                if (!ej.d((byte) 102)) {
                  break L52;
                } else {
                  eh.field_c.a(em.field_a[0], 100, uh.field_i * 3 / 2);
                  break L52;
                }
              } else {
                break L52;
              }
            }
          }
          var13 = var10.field_f;
          var15 = var10.field_a;
          L53: while (true) {
            if (!jn.e((byte) -105)) {
              L54: {
                L55: {
                  if (jf.field_c == 0) {
                    break L55;
                  } else {
                    if (mc.field_I < 4) {
                      break L54;
                    } else {
                      break L55;
                    }
                  }
                }
                L56: {
                  if (~w.field_r < ~cf.field_s) {
                    cf.field_s = cf.field_s + 1;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                L57: {
                  if (-10 + w.field_r <= cf.field_s) {
                    break L57;
                  } else {
                    cf.field_s = cf.field_s + 1;
                    break L57;
                  }
                }
                L58: {
                  if (~cf.field_s > ~(-50 + w.field_r)) {
                    cf.field_s = cf.field_s + 1;
                    break L58;
                  } else {
                    break L58;
                  }
                }
                if (hg.field_e == 1) {
                  L59: {
                    var17 = 0;
                    if (j.field_c != -1) {
                      break L59;
                    } else {
                      if (rb.field_m != -1) {
                        break L59;
                      } else {
                        if (rc.field_e != 0) {
                          break L54;
                        } else {
                          break L59;
                        }
                      }
                    }
                  }
                  if (var17 != 0) {
                    break L54;
                  } else {
                    bc.a(var5, var2, var4, var7, (byte) 15, var9, var8, var28, var15, var13, var27, var3);
                    break L54;
                  }
                } else {
                  L60: {
                    if (0 == hg.field_e) {
                      rl.field_c = -1;
                      break L60;
                    } else {
                      break L60;
                    }
                  }
                  if (pf.field_o != 1) {
                    break L54;
                  } else {
                    if (-1 != rl.field_c) {
                      mc.field_I = 1;
                      jf.field_c = 1;
                      break L54;
                    } else {
                      break L54;
                    }
                  }
                }
              }
              L61: {
                if (jf.field_c != 0) {
                  L62: {
                    jf.field_c = jf.field_c + 1;
                    if (4 > mc.field_I) {
                      jf.field_c = jf.field_c + 6;
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    if (le.field_D == 1) {
                      jf.field_c = jf.field_c + 6;
                      break L63;
                    } else {
                      break L63;
                    }
                  }
                  L64: {
                    if (jf.field_c == 128) {
                      L65: {
                        if (mc.field_I != 1) {
                          break L65;
                        } else {
                          L66: {
                            if (hg.field_e >= 0) {
                              break L66;
                            } else {
                              hg.field_e = -1;
                              break L66;
                            }
                          }
                          hg.field_e = hg.field_e + 1;
                          if (hg.field_e != 0) {
                            if (hg.field_e == 1) {
                              le.field_D = 0;
                              ta.a((byte) -95, rl.field_c);
                              of.field_h = new re(8);
                              return;
                            } else {
                              break L65;
                            }
                          } else {
                            L67: {
                              stackOut_236_0 = dd.field_o;
                              stackOut_236_1 = 10;
                              stackIn_238_0 = stackOut_236_0;
                              stackIn_238_1 = stackOut_236_1;
                              stackIn_237_0 = stackOut_236_0;
                              stackIn_237_1 = stackOut_236_1;
                              if (om.field_b) {
                                stackOut_238_0 = (int[][]) (Object) stackIn_238_0;
                                stackOut_238_1 = stackIn_238_1;
                                stackOut_238_2 = nm.field_c;
                                stackIn_239_0 = stackOut_238_0;
                                stackIn_239_1 = stackOut_238_1;
                                stackIn_239_2 = stackOut_238_2;
                                break L67;
                              } else {
                                stackOut_237_0 = (int[][]) (Object) stackIn_237_0;
                                stackOut_237_1 = stackIn_237_1;
                                stackOut_237_2 = ja.field_h;
                                stackIn_239_0 = stackOut_237_0;
                                stackIn_239_1 = stackOut_237_1;
                                stackIn_239_2 = stackOut_237_2;
                                break L67;
                              }
                            }
                            L68: {
                              L69: {
                                stackIn_239_0[stackIn_239_1] = stackIn_239_2;
                                stackOut_239_0 = null;
                                stackOut_239_1 = null;
                                stackIn_247_0 = stackOut_239_0;
                                stackIn_247_1 = stackOut_239_1;
                                stackIn_240_0 = stackOut_239_0;
                                stackIn_240_1 = stackOut_239_1;
                                if (!ta.p(3)) {
                                  break L69;
                                } else {
                                  L70: {
                                    stackOut_240_0 = null;
                                    stackOut_240_1 = null;
                                    stackIn_242_0 = stackOut_240_0;
                                    stackIn_242_1 = stackOut_240_1;
                                    stackIn_241_0 = stackOut_240_0;
                                    stackIn_241_1 = stackOut_240_1;
                                    if (w.field_r == 0) {
                                      stackOut_242_0 = null;
                                      stackOut_242_1 = null;
                                      stackOut_242_2 = 0;
                                      stackIn_243_0 = stackOut_242_0;
                                      stackIn_243_1 = stackOut_242_1;
                                      stackIn_243_2 = stackOut_242_2;
                                      break L70;
                                    } else {
                                      stackOut_241_0 = null;
                                      stackOut_241_1 = null;
                                      stackOut_241_2 = 1;
                                      stackIn_243_0 = stackOut_241_0;
                                      stackIn_243_1 = stackOut_241_1;
                                      stackIn_243_2 = stackOut_241_2;
                                      break L70;
                                    }
                                  }
                                  L71: {
                                    stackOut_243_0 = null;
                                    stackOut_243_1 = null;
                                    stackOut_243_2 = stackIn_243_2;
                                    stackIn_245_0 = stackOut_243_0;
                                    stackIn_245_1 = stackOut_243_1;
                                    stackIn_245_2 = stackOut_243_2;
                                    stackIn_244_0 = stackOut_243_0;
                                    stackIn_244_1 = stackOut_243_1;
                                    stackIn_244_2 = stackOut_243_2;
                                    if (ei.field_q.e(-20049)) {
                                      stackOut_245_0 = null;
                                      stackOut_245_1 = null;
                                      stackOut_245_2 = stackIn_245_2;
                                      stackOut_245_3 = 0;
                                      stackIn_246_0 = stackOut_245_0;
                                      stackIn_246_1 = stackOut_245_1;
                                      stackIn_246_2 = stackOut_245_2;
                                      stackIn_246_3 = stackOut_245_3;
                                      break L71;
                                    } else {
                                      stackOut_244_0 = null;
                                      stackOut_244_1 = null;
                                      stackOut_244_2 = stackIn_244_2;
                                      stackOut_244_3 = 1;
                                      stackIn_246_0 = stackOut_244_0;
                                      stackIn_246_1 = stackOut_244_1;
                                      stackIn_246_2 = stackOut_244_2;
                                      stackIn_246_3 = stackOut_244_3;
                                      break L71;
                                    }
                                  }
                                  stackOut_246_0 = null;
                                  stackOut_246_1 = null;
                                  stackIn_248_0 = stackOut_246_0;
                                  stackIn_248_1 = stackOut_246_1;
                                  stackIn_247_0 = stackOut_246_0;
                                  stackIn_247_1 = stackOut_246_1;
                                  if (wb.a(stackIn_246_2 != 0, stackIn_246_3 != 0, false, rg.a((byte) -54)) != null) {
                                    stackOut_248_0 = null;
                                    stackOut_248_1 = null;
                                    stackOut_248_2 = 9;
                                    stackIn_249_0 = stackOut_248_0;
                                    stackIn_249_1 = stackOut_248_1;
                                    stackIn_249_2 = stackOut_248_2;
                                    break L68;
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                              stackOut_247_0 = null;
                              stackOut_247_1 = null;
                              stackOut_247_2 = 10;
                              stackIn_249_0 = stackOut_247_0;
                              stackIn_249_1 = stackOut_247_1;
                              stackIn_249_2 = stackOut_247_2;
                              break L68;
                            }
                            of.field_h = new re(stackIn_249_2);
                            u.field_f[26] = jh.field_bb;
                            return;
                          }
                        }
                      }
                      if (mc.field_I == 2) {
                        cm.a(bm.field_c, 0, rl.field_c);
                        le.field_D = 0;
                        ta.a((byte) 127, rl.field_c + 1);
                        n.b(false, (byte) -97);
                        of.field_h = new re(11);
                        return;
                      } else {
                        if (mc.field_I != 3) {
                          if (mc.field_I >= 4) {
                            L72: {
                              le.field_D = 0;
                              hg.field_e = 0;
                              if (jh.field_ab != 1) {
                                break L72;
                              } else {
                                int discarded$5 = 1;
                                ja.a((byte) -127, pe.field_ab);
                                break L72;
                              }
                            }
                            L73: {
                              stackOut_269_0 = dd.field_o;
                              stackOut_269_1 = 10;
                              stackIn_271_0 = stackOut_269_0;
                              stackIn_271_1 = stackOut_269_1;
                              stackIn_270_0 = stackOut_269_0;
                              stackIn_270_1 = stackOut_269_1;
                              if (om.field_b) {
                                stackOut_271_0 = (int[][]) (Object) stackIn_271_0;
                                stackOut_271_1 = stackIn_271_1;
                                stackOut_271_2 = nm.field_c;
                                stackIn_272_0 = stackOut_271_0;
                                stackIn_272_1 = stackOut_271_1;
                                stackIn_272_2 = stackOut_271_2;
                                break L73;
                              } else {
                                stackOut_270_0 = (int[][]) (Object) stackIn_270_0;
                                stackOut_270_1 = stackIn_270_1;
                                stackOut_270_2 = ja.field_h;
                                stackIn_272_0 = stackOut_270_0;
                                stackIn_272_1 = stackOut_270_1;
                                stackIn_272_2 = stackOut_270_2;
                                break L73;
                              }
                            }
                            L74: {
                              L75: {
                                stackIn_272_0[stackIn_272_1] = stackIn_272_2;
                                stackOut_272_0 = null;
                                stackOut_272_1 = null;
                                stackIn_281_0 = stackOut_272_0;
                                stackIn_281_1 = stackOut_272_1;
                                stackIn_273_0 = stackOut_272_0;
                                stackIn_273_1 = stackOut_272_1;
                                if (!ta.p(3)) {
                                  break L75;
                                } else {
                                  L76: {
                                    stackOut_273_0 = null;
                                    stackOut_273_1 = null;
                                    stackIn_275_0 = stackOut_273_0;
                                    stackIn_275_1 = stackOut_273_1;
                                    stackIn_274_0 = stackOut_273_0;
                                    stackIn_274_1 = stackOut_273_1;
                                    if (w.field_r == 0) {
                                      stackOut_275_0 = null;
                                      stackOut_275_1 = null;
                                      stackOut_275_2 = 0;
                                      stackIn_276_0 = stackOut_275_0;
                                      stackIn_276_1 = stackOut_275_1;
                                      stackIn_276_2 = stackOut_275_2;
                                      break L76;
                                    } else {
                                      stackOut_274_0 = null;
                                      stackOut_274_1 = null;
                                      stackOut_274_2 = 1;
                                      stackIn_276_0 = stackOut_274_0;
                                      stackIn_276_1 = stackOut_274_1;
                                      stackIn_276_2 = stackOut_274_2;
                                      break L76;
                                    }
                                  }
                                  L77: {
                                    stackOut_276_0 = null;
                                    stackOut_276_1 = null;
                                    stackOut_276_2 = stackIn_276_2;
                                    stackIn_278_0 = stackOut_276_0;
                                    stackIn_278_1 = stackOut_276_1;
                                    stackIn_278_2 = stackOut_276_2;
                                    stackIn_277_0 = stackOut_276_0;
                                    stackIn_277_1 = stackOut_276_1;
                                    stackIn_277_2 = stackOut_276_2;
                                    if (ei.field_q.e(-20049)) {
                                      stackOut_278_0 = null;
                                      stackOut_278_1 = null;
                                      stackOut_278_2 = stackIn_278_2;
                                      stackOut_278_3 = 0;
                                      stackIn_279_0 = stackOut_278_0;
                                      stackIn_279_1 = stackOut_278_1;
                                      stackIn_279_2 = stackOut_278_2;
                                      stackIn_279_3 = stackOut_278_3;
                                      break L77;
                                    } else {
                                      stackOut_277_0 = null;
                                      stackOut_277_1 = null;
                                      stackOut_277_2 = stackIn_277_2;
                                      stackOut_277_3 = 1;
                                      stackIn_279_0 = stackOut_277_0;
                                      stackIn_279_1 = stackOut_277_1;
                                      stackIn_279_2 = stackOut_277_2;
                                      stackIn_279_3 = stackOut_277_3;
                                      break L77;
                                    }
                                  }
                                  stackOut_279_0 = null;
                                  stackOut_279_1 = null;
                                  stackIn_281_0 = stackOut_279_0;
                                  stackIn_281_1 = stackOut_279_1;
                                  stackIn_280_0 = stackOut_279_0;
                                  stackIn_280_1 = stackOut_279_1;
                                  if (wb.a(stackIn_279_2 != 0, stackIn_279_3 != 0, false, rg.a((byte) 124)) == null) {
                                    break L75;
                                  } else {
                                    stackOut_280_0 = null;
                                    stackOut_280_1 = null;
                                    stackOut_280_2 = 9;
                                    stackIn_282_0 = stackOut_280_0;
                                    stackIn_282_1 = stackOut_280_1;
                                    stackIn_282_2 = stackOut_280_2;
                                    break L74;
                                  }
                                }
                              }
                              stackOut_281_0 = null;
                              stackOut_281_1 = null;
                              stackOut_281_2 = 10;
                              stackIn_282_0 = stackOut_281_0;
                              stackIn_282_1 = stackOut_281_1;
                              stackIn_282_2 = stackOut_281_2;
                              break L74;
                            }
                            of.field_h = new re(stackIn_282_2);
                            return;
                          } else {
                            break L64;
                          }
                        } else {
                          L78: {
                            cm.a(bm.field_c, 0, 9);
                            u.field_f[26] = jf.field_e;
                            if (1 != bm.field_c) {
                              break L78;
                            } else {
                              if (rl.field_c > 9) {
                                rl.field_c = 0;
                                jf.field_d = 50;
                                le.field_D = 0;
                                n.b(true, (byte) -89);
                                of.field_h = new re(13);
                                uk.field_e = 0;
                                return;
                              } else {
                                break L78;
                              }
                            }
                          }
                          L79: {
                            if (bm.field_c != 0) {
                              break L79;
                            } else {
                              if (rl.field_c > 2) {
                                break L79;
                              } else {
                                jf.field_d = 50;
                                le.field_D = 0;
                                ta.a((byte) -100, 3);
                                of.field_h = new re(12);
                                uk.field_e = 0;
                                n.b(false, (byte) -114);
                                return;
                              }
                            }
                          }
                          jf.field_d = 50;
                          le.field_D = 0;
                          rl.field_c = 0;
                          n.b(true, (byte) -93);
                          uk.field_e = 0;
                          of.field_h = new re(13);
                          return;
                        }
                      }
                    } else {
                      break L64;
                    }
                  }
                  L80: {
                    jf.field_c = jf.field_c + 1;
                    if (256 >= jf.field_c) {
                      break L80;
                    } else {
                      jf.field_c = 0;
                      break L80;
                    }
                  }
                  break L61;
                } else {
                  break L61;
                }
              }
              return;
            } else {
              L81: {
                L82: {
                  var17 = pj.field_e - 16;
                  if (var17 < 0) {
                    break L82;
                  } else {
                    if (8 > var17) {
                      L83: {
                        stackOut_177_0 = -127;
                        stackIn_179_0 = stackOut_177_0;
                        stackIn_178_0 = stackOut_177_0;
                        if (qh.field_m[82]) {
                          stackOut_179_0 = stackIn_179_0;
                          stackOut_179_1 = 1;
                          stackIn_180_0 = stackOut_179_0;
                          stackIn_180_1 = stackOut_179_1;
                          break L83;
                        } else {
                          stackOut_178_0 = stackIn_178_0;
                          stackOut_178_1 = 0;
                          stackIn_180_0 = stackOut_178_0;
                          stackIn_180_1 = stackOut_178_1;
                          break L83;
                        }
                      }
                      boolean discarded$6 = t.a(stackIn_180_0, stackIn_180_1, var17);
                      break L81;
                    } else {
                      break L82;
                    }
                  }
                }
                var17 = -1 + pj.field_e;
                if (var17 < 0) {
                  break L81;
                } else {
                  if (var17 < 8) {
                    boolean discarded$7 = t.a(38, 1, var17);
                    break L81;
                  } else {
                    break L81;
                  }
                }
              }
              L84: {
                if (pj.field_e != 13) {
                  break L84;
                } else {
                  if (hg.field_e != 1) {
                    break L84;
                  } else {
                    if (0 != jf.field_c) {
                      break L84;
                    } else {
                      of.field_h = new re(true);
                      return;
                    }
                  }
                }
              }
              L85: {
                if (pj.field_e != 84) {
                  break L85;
                } else {
                  if (!qh.field_m[86]) {
                    break L85;
                  } else {
                    if (ta.p(3)) {
                      break L85;
                    } else {
                      if (wb.field_S > 0) {
                        nh.a(false, (byte) -107);
                        break L85;
                      } else {
                        break L85;
                      }
                    }
                  }
                }
              }
              L86: {
                if (pj.field_e != 80) {
                  break L86;
                } else {
                  L87: {
                    stackOut_192_0 = -123;
                    stackIn_194_0 = stackOut_192_0;
                    stackIn_193_0 = stackOut_192_0;
                    if (hk.field_q) {
                      stackOut_194_0 = stackIn_194_0;
                      stackOut_194_1 = 0;
                      stackIn_195_0 = stackOut_194_0;
                      stackIn_195_1 = stackOut_194_1;
                      break L87;
                    } else {
                      stackOut_193_0 = stackIn_193_0;
                      stackOut_193_1 = 1;
                      stackIn_195_0 = stackOut_193_0;
                      stackIn_195_1 = stackOut_193_1;
                      break L87;
                    }
                  }
                  ec.a((byte) stackIn_195_0, stackIn_195_1 != 0);
                  break L86;
                }
              }
              continue L53;
            }
          }
        } else {
          return;
        }
    }

    wj(bg param0) {
        try {
            ((wj) this).field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Confirm Email:";
        field_O = 256;
        field_G = "These doors cannot be opened. Find a different route.";
        field_N = new ub();
    }
}
