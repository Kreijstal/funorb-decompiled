/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class client extends bd {
    static byte[] field_D;
    static ud field_F;
    static String field_E;
    static String field_y;
    static ck[] field_x;
    static ck[] field_C;
    static String field_B;
    public static boolean field_A;

    private final void o(int param0) {
        jc discarded$1 = null;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != wk.field_q) {
                sh.a(false, wk.field_q);
                wk.field_q = null;
                vj.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              tm.b((byte) -81);
              cl.field_y = vg.a(3, 21);
              vb.field_S = vg.a(4, 44);
              ii.field_t = vg.a(6, 39);
              eg.field_e = vg.a(11, 102);
              ph.field_Db = vg.a(7, 50);
              jj.field_c = vg.a(8, 113);
              ah.field_d = vg.a(9, param0 ^ 24867);
              wg.field_h = vg.a(10, param0 ^ 24938);
              sh.field_g = new cb(65);
              sh.field_g.a("basic", ah.field_i, bn.field_d, (byte) 95, ng.field_l);
              sh.field_g.a("arial13", ah.field_i, un.field_a, (byte) 112, ne.field_d);
              sh.field_g.a("arial13", qc.field_vb, un.field_a, (byte) 106, ne.field_d);
              sh.field_g.a("arialbold14", ah.field_i, un.field_a, (byte) -97, ne.field_d);
              sh.field_g.a("arialbold14", qc.field_vb, un.field_a, (byte) 94, ne.field_d);
              sh.field_g.a("lobby", ah.field_i, bn.field_d, (byte) -21, ng.field_l);
              sh.field_g.a("lobby", qc.field_vb, un.field_a, (byte) 87, ne.field_d);
              sh.field_g.a(sc.field_k, (byte) 122, jj.field_c, he.field_fb);
              sh.field_g.a(sc.field_k, (byte) -109, ah.field_d, he.field_fb);
              if (param0 == 24903) {
                break L2;
              } else {
                discarded$1 = client.a((String) null, -14);
                break L2;
              }
            }
            sh.field_g.a(tm.field_g, (byte) 51, wg.field_h, kd.field_q);
            sh.field_g.a("", ii.field_t, bn.field_d, (byte) 102, ng.field_l);
            sh.field_g.a("", ph.field_Db, un.field_a, (byte) -107, ne.field_d);
            sh.field_g.a(qa.field_w, (byte) -121, eg.field_e, ga.field_b);
            sh.field_g.a(bk.field_Ob, (byte) 114, cl.field_y, bg.field_c);
            sh.field_g.a(bk.field_Ob, (byte) -45, vb.field_S, bg.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.V(" + param0 + ')');
        }
    }

    final static jc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        jc var5 = null;
        jc stackIn_5_0 = null;
        jc stackIn_10_0 = null;
        jc stackIn_13_0 = null;
        jc stackIn_18_0 = null;
        jc stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jc stackOut_9_0 = null;
        jc stackOut_17_0 = null;
        jc stackOut_19_0 = null;
        jc stackOut_12_0 = null;
        jc stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_9_0 = hm.field_a;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    if (param1 == -12828) {
                      var5 = ng.a(param1 + 12827, var3);
                      if (null != var5) {
                        stackOut_17_0 = (jc) (var5);
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackOut_19_0 = da.a(var4, -2734);
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackOut_12_0 = (jc) null;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = eh.field_b;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("client.R(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    private final void i(byte param0) {
        int discarded$5 = 0;
        boolean discarded$6 = false;
        rf discarded$7 = null;
        boolean discarded$8 = false;
        jc discarded$9 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        Object var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object var4_ref = null;
        uf var5_ref_uf = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        lk var5_ref_lk = null;
        rf var5_ref_rf = null;
        int var6_int = 0;
        lk var6 = null;
        vm var6_ref = null;
        int var7 = 0;
        uf var7_ref_uf = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        rf var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var16 = null;
        int var17 = 0;
        qc var18 = null;
        int var19 = 0;
        int var20 = 0;
        ui[] var21 = null;
        int var22 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_106_0 = null;
        Object stackIn_108_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        boolean stackIn_166_0 = false;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        boolean stackIn_225_0 = false;
        int stackIn_250_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_285_0 = 0;
        int stackIn_285_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        Object stackIn_338_0 = null;
        Object stackIn_338_1 = null;
        lk stackIn_344_0 = null;
        lk stackIn_346_0 = null;
        lk stackIn_347_0 = null;
        int stackIn_347_1 = 0;
        int stackIn_364_0 = 0;
        int stackIn_371_0 = 0;
        int stackIn_391_0 = 0;
        int stackIn_391_1 = 0;
        int stackIn_398_0 = 0;
        int stackIn_398_1 = 0;
        int stackIn_400_0 = 0;
        int stackIn_409_0 = 0;
        Object stackIn_470_0 = null;
        Object stackIn_470_1 = null;
        int stackIn_512_0 = 0;
        int stackIn_512_1 = 0;
        int stackIn_522_0 = 0;
        Throwable caughtException = null;
        Object stackOut_59_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_105_0 = null;
        Object stackOut_106_0 = null;
        Object stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        boolean stackOut_165_0 = false;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        boolean stackOut_224_0 = false;
        int stackOut_247_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_255_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_284_1 = 0;
        int stackOut_291_0 = 0;
        int stackOut_291_1 = 0;
        Object stackOut_337_0 = null;
        Object stackOut_337_1 = null;
        lk stackOut_343_0 = null;
        lk stackOut_344_0 = null;
        int stackOut_344_1 = 0;
        lk stackOut_346_0 = null;
        int stackOut_346_1 = 0;
        int stackOut_363_0 = 0;
        int stackOut_370_0 = 0;
        int stackOut_390_0 = 0;
        int stackOut_390_1 = 0;
        int stackOut_397_0 = 0;
        int stackOut_397_1 = 0;
        int stackOut_399_0 = 0;
        int stackOut_408_0 = 0;
        Object stackOut_469_0 = null;
        Object stackOut_469_1 = null;
        byte stackOut_511_0 = 0;
        int stackOut_511_1 = 0;
        int stackOut_519_0 = 0;
        int stackOut_521_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var2_int = 0;
                    if (kf.field_I == null) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((kf.field_I.field_g.field_i ^ -1) > -4) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2_int = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (null == ce.field_C) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-4 >= (ce.field_C.field_g.field_i ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2_int = 1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var2_int == 0) {
                        statePc = 44;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (of.field_e > 0) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    of.field_e = of.field_e - 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (of.field_e != 0) {
                        statePc = 46;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((kd.field_u ^ -1) <= -16) {
                        statePc = 33;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if ((jf.field_c ^ -1) <= -16) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (8 > ak.field_d) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ak.field_d = ak.field_d + 1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (15 >= kd.field_u) {
                        statePc = 43;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if ((jf.field_c ^ -1) >= -16) {
                        statePc = 43;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (-2 > (ak.field_d ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ak.field_d = ak.field_d - 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    of.field_e = 50;
                    kd.field_u = jf.field_c;
                    if (var22 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ak.field_d = 1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    discarded$5 = fl.a((byte) -108);
                    pm.field_g = ne.b((byte) -40);
                    if (!sa.field_x) {
                        statePc = 53;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (null != wj.field_Ob) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    wj.field_Ob.a(a.field_g * 50 / 128);
                    sa.field_x = false;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (cl.field_v == null) {
                        statePc = 59;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (!cl.field_v.field_e) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    sn.a(false);
                    nm.e(54);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = this;
                    stackIn_62_0 = stackOut_59_0;
                    stackIn_60_0 = stackOut_59_0;
                    if (null == cl.field_v) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackOut_60_0 = this;
                    stackOut_60_1 = 1;
                    stackIn_63_0 = stackOut_60_0;
                    stackIn_63_1 = stackOut_60_1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = this;
                    stackOut_62_1 = 0;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    this.b(stackIn_63_1 != 0, -11);
                    if (!of.field_c) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.o(24903);
                    of.field_c = false;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    uf.field_A = uf.field_A + 1;
                    if (ta.a((byte) -104)) {
                        statePc = 69;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.g(10);
                    if (ta.a((byte) -93)) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    return;
                }
                case 73: {
                    if (sh.field_j) {
                        statePc = 80;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    ql.a(jk.field_c, (byte) -115);
                    if (!this.n(0)) {
                        statePc = 149;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    sh.field_j = true;
                    if (var22 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (!se.i(-1)) {
                        statePc = 147;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (ai.f((byte) -127)) {
                        statePc = 125;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (pk.d(65)) {
                        statePc = 105;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (!cn.f((byte) 123)) {
                        statePc = 102;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (gb.field_Vb == gb.field_Ob) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    this.b(30661, false);
                    if (var22 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var3 = we.a(false);
                    if ((var3 ^ -1) != -2) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    og.a(im.field_f, fe.field_b, true);
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    this.b(30661, true);
                    if (var22 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    this.b(30661, false);
                    if (var22 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackOut_105_0 = this;
                    stackIn_110_0 = stackOut_105_0;
                    stackIn_106_0 = stackOut_105_0;
                    if (null == cl.field_v) {
                        statePc = 110;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackOut_106_0 = this;
                    stackIn_108_0 = stackOut_106_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = this;
                    stackOut_108_1 = 1;
                    stackIn_111_0 = stackOut_108_0;
                    stackIn_111_1 = stackOut_108_1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 110: {
                    stackOut_110_0 = this;
                    stackOut_110_1 = 0;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var3 = this.a(stackIn_111_1 != 0, (byte) 102);
                    if (1 == var3) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (2 != var3) {
                        statePc = 124;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (cl.field_v != null) {
                        statePc = 120;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 120: {
                    sn.a(false);
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if ((var3 ^ -1) != -3) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    pk.a((byte) -17, se.h(25144));
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    this.b(30661, true);
                    if (var22 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if ((gb.field_Vb ^ -1) == (gb.field_Ob ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    this.b(30661, false);
                    if (var22 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var3 = tm.a((byte) -117);
                    if (-3 != (var3 ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    sn.a(false);
                    if (var22 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if ((var3 ^ -1) == -4) {
                        statePc = 144;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if ((var3 ^ -1) != -5) {
                        statePc = 146;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    og.a(true, 3, true);
                    if (var22 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    jk.a(2, true);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    this.b(30661, true);
                    if (var22 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    dc.a(-60);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (!ph.n(-30146)) {
                        statePc = 152;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var3_ref = (ki) ((Object) si.field_e.a(4));
                    if (var3_ref == null) {
                        statePc = 157;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    ce.a(4, (ki) (var3_ref), -697);
                    if (var22 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var22 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var3_ref = (ff) ((Object) jm.field_r.a(4));
                    if (var3_ref != null) {
                        statePc = 162;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (var22 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    wk.a(3, 5, (ff) (var3_ref));
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (var22 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    stackOut_165_0 = vi.a(mk.field_c, 0);
                    stackIn_166_0 = stackOut_165_0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (!stackIn_166_0) {
                        statePc = 511;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    stackOut_167_0 = bh.field_k ^ -1;
                    stackOut_167_1 = -10;
                    stackIn_512_0 = stackOut_167_0;
                    stackIn_512_1 = stackOut_167_1;
                    stackIn_168_0 = stackOut_167_0;
                    stackIn_168_1 = stackOut_167_1;
                    if (var22 != 0) {
                        statePc = 512;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (stackIn_168_0 != stackIn_168_1) {
                        statePc = 172;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    mn.field_c = false;
                    var3_ref = de.field_V.c((byte) -38);
                    wj.a(1, -86, false, 0, true, (String) (var3_ref));
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (77 != bh.field_k) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    mn.field_c = false;
                    pn.a(true, false, true);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (-15 == (bh.field_k ^ -1)) {
                        statePc = 179;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 179: {
                    we.a((byte) 66);
                    cd.a(true);
                    nk.a(id.g(8192), rd.b(-95), 0, 5, oe.b(-10498, 2000), qi.e((byte) 117), vl.field_A, 150, oe.b(-10498, 8), 1024);
                    dg.a(21014, tc.g((byte) 98), l.a(-126));
                    gk.field_Ib = true;
                    uh.field_b = true;
                    mn.field_c = false;
                    var3_ref = j.field_d;
                    var4 = 0;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    ((int[]) (var3_ref))[var4] = 0;
                    var4++;
                    if (var22 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (var22 == 0) {
                        statePc = 180;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if ((bh.field_k ^ -1) != -16) {
                        statePc = 192;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (uh.field_b) {
                        statePc = 190;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 190: {
                    bb.b(true);
                    kh.a(true);
                    kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                    dc.a(false, 126);
                    un.a((byte) -124);
                    fm.field_b = false;
                    fa.field_n = false;
                    gd.field_f = true;
                    uh.field_b = false;
                    jg.a(-48);
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    mn.field_c = false;
                    wk.field_i = false;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if ((bh.field_k ^ -1) != -11) {
                        statePc = 199;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (uh.field_b) {
                        statePc = 198;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 198: {
                    ke.a((byte) 113);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (-76 == (bh.field_k ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var3_ref = b.h(-123);
                    var4_ref = var3_ref;
                    var5_ref_uf = de.field_V;
                    var6_int = ((wl) ((Object) var5_ref_uf)).d((byte) -45);
                    var7 = 0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if ((var7 ^ -1) <= (var6_int ^ -1)) {
                        statePc = 208;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    ((int[]) (var4_ref))[var7] = ((wl) ((Object) var5_ref_uf)).i(7553);
                    var7++;
                    if (var22 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (var22 == 0) {
                        statePc = 203;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (nm.field_Qb) {
                        statePc = 211;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var4_ref = var3_ref;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var5_ref_int__ = o.field_g;
                    var6_int = 0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (-9 >= (var6_int ^ -1)) {
                        statePc = 218;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    ((int[]) (var4_ref))[var6_int] = lb.a(((int[]) (var4_ref))[var6_int], var5_ref_int__[var6_int] ^ -1);
                    var6_int++;
                    if (var22 != 0) {
                        statePc = 230;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (var22 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (null == kf.field_I) {
                        statePc = 229;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (kf.field_I.field_g.field_p[kf.field_I.field_P] == null) {
                        statePc = 229;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var4 = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if ((var4 ^ -1) <= -32) {
                        statePc = 229;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    stackOut_224_0 = rb.a(-18, var4, (int[]) (var3_ref));
                    stackIn_166_0 = stackOut_224_0;
                    stackIn_225_0 = stackOut_224_0;
                    if (var22 != 0) {
                        statePc = 166;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (!stackIn_225_0) {
                        statePc = 228;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    kf.field_I.field_g.field_p[kf.field_I.field_P].field_cb.a(new vd(var4), 2777);
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    var4++;
                    if (var22 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var4_ref = j.field_d;
                    var5_ref_int__ = (int[]) (var3_ref);
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    var6_int = 0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if ((var6_int ^ -1) <= -9) {
                        statePc = 236;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    ((int[]) (var4_ref))[var6_int] = de.b(((int[]) (var4_ref))[var6_int], var5_ref_int__[var6_int]);
                    var6_int++;
                    if (var22 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (var22 == 0) {
                        statePc = 231;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var4_ref = o.field_g;
                    var5_ref_int__ = (int[]) (var3_ref);
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    var6_int = 0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (-9 >= (var6_int ^ -1)) {
                        statePc = 241;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    ((int[]) (var4_ref))[var6_int] = de.b(((int[]) (var4_ref))[var6_int], var5_ref_int__[var6_int]);
                    var6_int++;
                    if (var22 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (var22 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (58 == bh.field_k) {
                        statePc = 246;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (bh.field_k != 59) {
                        statePc = 322;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var3 = de.field_V.e(3);
                    var4 = var3 & 15;
                    var5 = 3 & var3 >> 1315490500;
                    var6_int = var3 >> -1189014074 & 7;
                    var7 = (var3 & 3812) >> -1446042807;
                    if ((var3 & 4096 ^ -1) == -1) {
                        statePc = 249;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    stackOut_247_0 = 1;
                    stackIn_250_0 = stackOut_247_0;
                    statePc = 250;
                    continue stateLoop;
                }
                case 249: {
                    stackOut_249_0 = 0;
                    stackIn_250_0 = stackOut_249_0;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    var8 = stackIn_250_0;
                    if ((8192 & var3) == 0) {
                        statePc = 253;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    stackOut_251_0 = 1;
                    stackIn_254_0 = stackOut_251_0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 253: {
                    stackOut_253_0 = 0;
                    stackIn_254_0 = stackOut_253_0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    var9 = stackIn_254_0;
                    if ((var3 & 16384) == 0) {
                        statePc = 257;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    stackOut_255_0 = 1;
                    stackIn_258_0 = stackOut_255_0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 257: {
                    stackOut_257_0 = 0;
                    stackIn_258_0 = stackOut_257_0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    var10_int = stackIn_258_0;
                    if (-1 == (var3 & 32768 ^ -1)) {
                        statePc = 261;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    stackOut_259_0 = 1;
                    stackIn_262_0 = stackOut_259_0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 261: {
                    stackOut_261_0 = 0;
                    stackIn_262_0 = stackOut_261_0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    var11 = stackIn_262_0;
                    var12 = de.field_V.e(3);
                    var13 = de.field_V.d((byte) -92);
                    var14 = de.field_V.d((byte) -116);
                    var15 = de.field_V.g((byte) -100);
                    if ((var15 ^ -1) > -1) {
                        statePc = 265;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var15 = -2;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    var16 = new String[var14];
                    var17 = 0;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if (var17 >= var14) {
                        statePc = 272;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var16[var17] = de.field_V.b(true);
                    var17++;
                    if (var22 != 0) {
                        statePc = 273;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (var22 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var17 = de.field_V.d((byte) -27);
                    gh.field_e = null;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    var18 = new qc(true, var13, var8 != 0, var4, var5, var6_int, var7, var16, var15, var9 != 0, false, false);
                    var18.field_R = var12;
                    var18.field_r = var10_int != 0;
                    if (var10_int != 0) {
                        statePc = 280;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (var11 != 0) {
                        statePc = 279;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var18.field_p.a(new in(cf.field_e, 10, true), 2777);
                    if (var22 == 0) {
                        statePc = 282;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var18.field_p.a(new in(bn.field_c, 8, true), 2777);
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    var19 = 0;
                    var20 = 0;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (var20 >= var18.field_g.field_b) {
                        statePc = 291;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    stackOut_284_0 = -1;
                    stackOut_284_1 = var17 & 1 << var20 ^ -1;
                    stackIn_292_0 = stackOut_284_0;
                    stackIn_292_1 = stackOut_284_1;
                    stackIn_285_0 = stackOut_284_0;
                    stackIn_285_1 = stackOut_284_1;
                    if (var22 != 0) {
                        statePc = 292;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (stackIn_285_0 == stackIn_285_1) {
                        statePc = 290;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var18.field_V[var20] = 200;
                    var19++;
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    var20++;
                    if (var22 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = -3;
                    stackOut_291_1 = var19 ^ -1;
                    stackIn_292_0 = stackOut_291_0;
                    stackIn_292_1 = stackOut_291_1;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    if (stackIn_292_0 > stackIn_292_1) {
                        statePc = 294;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var18.field_Ab = 100;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    var20 = var18.field_P;
                    if (-1 < (var20 ^ -1)) {
                        statePc = 298;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var20 = 0;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (200 == var18.field_V[var20]) {
                        statePc = 304;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var20++;
                    if (var22 != 0) {
                        statePc = 312;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    if (var22 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (2 != var19) {
                        statePc = 311;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var20 = (var20 + 1) % var18.field_g.field_b;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (var18.field_V[var20] == 200) {
                        statePc = 311;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var20 = (var20 - -1) % var18.field_g.field_b;
                    if (var22 != 0) {
                        statePc = 312;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (var22 == 0) {
                        statePc = 306;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var18.field_i = var20;
                    var18.field_D = var20;
                    var18.field_lb = var20;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    if (-59 == (bh.field_k ^ -1)) {
                        statePc = 316;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    ce.field_C = var18;
                    fa.field_n = true;
                    if (var22 == 0) {
                        statePc = 318;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    kf.field_I = var18;
                    fm.field_b = true;
                    eb.a(58);
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    wk.field_i = false;
                    am.field_c = true;
                    if (var4 == 10) {
                        statePc = 320;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var21 = sb.field_u[var13];
                    if (var22 == 0) {
                        statePc = 321;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var21 = ee.field_a;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    nn.a(var18.b(true), var21[0], true);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (bh.field_k == 60) {
                        statePc = 325;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (fm.field_b) {
                        statePc = 331;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if (fa.field_n) {
                        statePc = 331;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 331: {
                    fm.field_b = false;
                    am.field_c = false;
                    fa.field_n = false;
                    cd.a(true);
                    un.a((byte) -125);
                    jg.a(-111);
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    wk.field_i = false;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    var3_ref = null;
                    if (!fm.field_b) {
                        statePc = 335;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    var3_ref = kf.field_I;
                    statePc = 337;
                    continue stateLoop;
                }
                case 335: {
                    if (!fa.field_n) {
                        statePc = 337;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var3_ref = ce.field_C;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    stackOut_337_0 = null;
                    stackOut_337_1 = var3_ref;
                    stackIn_338_0 = stackOut_337_0;
                    stackIn_338_1 = stackOut_337_1;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (stackIn_338_0 != stackIn_338_1) {
                        statePc = 340;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if (61 == bh.field_k) {
                        statePc = 343;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var4 = de.field_V.d((byte) -92);
                    var5_ref_lk = ((qc) (var3_ref)).field_g.field_p[var4];
                    stackOut_343_0 = (lk) (var5_ref_lk);
                    stackIn_346_0 = stackOut_343_0;
                    stackIn_344_0 = stackOut_343_0;
                    if ((var4 ^ -1) != (((qc) (var3_ref)).field_P ^ -1)) {
                        statePc = 346;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    stackOut_344_0 = (lk) ((Object) stackIn_344_0);
                    stackOut_344_1 = 1;
                    stackIn_347_0 = stackOut_344_0;
                    stackIn_347_1 = stackOut_344_1;
                    statePc = 347;
                    continue stateLoop;
                }
                case 346: {
                    stackOut_346_0 = (lk) ((Object) stackIn_346_0);
                    stackOut_346_1 = 0;
                    stackIn_347_0 = stackOut_346_0;
                    stackIn_347_1 = stackOut_346_1;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    ((lk) (Object) stackIn_347_0).a(stackIn_347_1 != 0, de.field_V, (byte) 118);
                    ((qc) (var3_ref)).a(true, var5_ref_lk, 600, 200, var5_ref_lk.field_jb, var4, false);
                    if (((qc) (var3_ref)).field_P == var4) {
                        statePc = 350;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 350: {
                    we.field_b.f(59, -4);
                    we.field_b.a(true, var5_ref_lk.field_U);
                    ((qc) (var3_ref)).field_E = 7 * var5_ref_lk.field_yb - 4;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    if (bh.field_k == 62) {
                        statePc = 354;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 354: {
                    var4 = de.field_V.d((byte) -124);
                    var5 = de.field_V.d((byte) -116);
                    if ((((qc) (var3_ref)).field_g.field_b ^ -1) >= (var4 ^ -1)) {
                        statePc = 360;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (((qc) (var3_ref)).field_g.field_p[var4] == null) {
                        statePc = 360;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 360: {
                    qb.a((Throwable) null, 16408, "T4: " + var4);
                    si.a(85);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var6 = ((qc) (var3_ref)).field_g.field_p[var4];
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    if ((var6.field_fb ^ -1) <= (var6.field_gb ^ -1)) {
                        statePc = 370;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var7 = ((qc) (var3_ref)).b(-117, var4) ? 1 : 0;
                    stackOut_363_0 = var7;
                    stackIn_371_0 = stackOut_363_0;
                    stackIn_364_0 = stackOut_363_0;
                    if (var22 != 0) {
                        statePc = 371;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    if (stackIn_364_0 == 0) {
                        statePc = 368;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 368: {
                    qb.a((Throwable) null, 16408, "T6");
                    si.a(79);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (var22 == 0) {
                        statePc = 362;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    ((qc) (var3_ref)).a(18, var6, var4);
                    ((qc) (var3_ref)).field_g.field_p[var4] = null;
                    ((qc) (var3_ref)).field_g.field_d = ((qc) (var3_ref)).field_g.field_d & (1 << var4 ^ -1);
                    ((qc) (var3_ref)).field_g.field_i = ((qc) (var3_ref)).field_g.field_i - 1;
                    stackOut_370_0 = ((qc) (var3_ref)).field_P;
                    stackIn_371_0 = stackOut_370_0;
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    if (stackIn_371_0 == var4) {
                        statePc = 374;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 374: {
                    cd.a(true);
                    ob.field_k = true;
                    ((qc) (var3_ref)).a(rm.field_b, 0);
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    ((qc) (var3_ref)).field_r = false;
                    ca.field_kb = 1;
                    jb.field_a = false;
                    rb.field_e = 0;
                    ak.field_d = 1;
                    ((qc) (var3_ref)).field_T = var5;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (-64 == (bh.field_k ^ -1)) {
                        statePc = 379;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var4 = de.field_V.d((byte) -53);
                    var5 = de.field_V.d((byte) -118);
                    var6_int = sm.field_e + -de.field_V.field_n;
                    if (0 <= var6_int) {
                        statePc = 383;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    qb.a((Throwable) null, 16408, "T8: " + var4 + " " + var5 + " " + var6_int);
                    si.a(65);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    var7_ref_uf = new uf(var6_int + 1);
                    var7_ref_uf.a(true, var5);
                    var7_ref_uf.a(false, var6_int, de.field_V.field_r, de.field_V.field_n);
                    var7_ref_uf.field_n = 0;
                    ((qc) (var3_ref)).field_v[var4].field_g.a(var7_ref_uf, 2777);
                    ((qc) (var3_ref)).field_v[var4].field_e = ((qc) (var3_ref)).field_v[var4].field_e + var5;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (-65 != (bh.field_k ^ -1)) {
                        statePc = 419;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    var4 = de.field_V.d((byte) -127);
                    var5_ref_lk = ((qc) (var3_ref)).field_g.field_p[var4];
                    var6_ref = new vm();
                    var6_ref.field_y = de.field_V.g((byte) -88);
                    var6_ref.field_n = de.field_V.g((byte) -118);
                    var6_ref.field_v = de.field_V.d((byte) -93);
                    var6_ref.field_o = de.field_V.d((byte) -83);
                    var6_ref.field_q = ((qc) (var3_ref)).field_db.a(true, true, de.field_V);
                    var6_ref.field_t = de.field_V.d((byte) -64);
                    ((qc) (var3_ref)).field_v[var4].field_g.a(var6_ref, 2777);
                    var7 = de.field_V.a(117);
                    var8 = de.field_V.a(127) + var7;
                    if ((var8 ^ -1) < (var7 ^ -1)) {
                        statePc = 388;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 388: {
                    var9 = var7;
                    statePc = 389;
                    continue stateLoop;
                }
                case 389: {
                    if (var8 <= var9) {
                        statePc = 397;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var10 = new rf(var9);
                    stackOut_390_0 = var4 ^ -1;
                    stackOut_390_1 = ((qc) (var3_ref)).field_P ^ -1;
                    stackIn_398_0 = stackOut_390_0;
                    stackIn_398_1 = stackOut_390_1;
                    stackIn_391_0 = stackOut_390_0;
                    stackIn_391_1 = stackOut_390_1;
                    if (var22 != 0) {
                        statePc = 398;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (stackIn_391_0 == stackIn_391_1) {
                        statePc = 395;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 395: {
                    var10.field_m = -var7 + var9;
                    statePc = 396;
                    continue stateLoop;
                }
                case 396: {
                    ((qc) (var3_ref)).field_db.a(var10, 0);
                    var9++;
                    if (var22 == 0) {
                        statePc = 389;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    stackOut_397_0 = var5_ref_lk.field_fb ^ -1;
                    stackOut_397_1 = var5_ref_lk.field_gb ^ -1;
                    stackIn_398_0 = stackOut_397_0;
                    stackIn_398_1 = stackOut_397_1;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if (stackIn_398_0 <= stackIn_398_1) {
                        statePc = 407;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var9 = ((qc) (var3_ref)).b(-126, var4) ? 1 : 0;
                    stackOut_399_0 = var9;
                    stackIn_409_0 = stackOut_399_0;
                    stackIn_400_0 = stackOut_399_0;
                    if (var22 != 0) {
                        statePc = 409;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    if (stackIn_400_0 != 0) {
                        statePc = 406;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    qb.a((Throwable) null, 16408, "T7");
                    si.a(97);
                    if (var22 == 0) {
                        statePc = 397;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (var22 == 0) {
                        statePc = 397;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 407: {
                    var5_ref_lk.field_gb = var8;
                    var5_ref_lk.field_fb = var7;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    stackOut_408_0 = ((qc) (var3_ref)).field_P;
                    stackIn_409_0 = stackOut_408_0;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (stackIn_409_0 == var4) {
                        statePc = 412;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (!var6_ref.a((byte) 58)) {
                        statePc = 417;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    discarded$6 = ((qc) (var3_ref)).b(-118, var4);
                    if (var22 != 0) {
                        statePc = 418;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    if (var22 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    we.field_b.f(59, -4);
                    we.field_b.a(true, ((qc) (var3_ref)).field_g.field_p[var4].field_U);
                    ((qc) (var3_ref)).field_w = 0;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    if (-66 == (bh.field_k ^ -1)) {
                        statePc = 422;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 422: {
                    var4 = de.field_V.d((byte) -60);
                    var5_ref_lk = ((qc) (var3_ref)).field_g.field_p[var4];
                    statePc = 423;
                    continue stateLoop;
                }
                case 423: {
                    var6_int = ((qc) (var3_ref)).b(-116, var4) ? 1 : 0;
                    if (var6_int != 0) {
                        statePc = 425;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    if (var22 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    if (var22 == 0) {
                        statePc = 423;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    if ((((qc) (var3_ref)).field_P ^ -1) == (var4 ^ -1)) {
                        statePc = 431;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 431: {
                    var6_int = 0;
                    statePc = 432;
                    continue stateLoop;
                }
                case 432: {
                    if ((var5_ref_lk.field_jb ^ -1) >= (var6_int ^ -1)) {
                        statePc = 437;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 433: {
                    fh.field_h = fh.field_h + 30000;
                    rk.field_cb = rk.field_cb + 30000;
                    var6_int++;
                    if (var22 != 0) {
                        statePc = 438;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    if (var22 == 0) {
                        statePc = 432;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    var5_ref_lk.field_jb = 0;
                    var5_ref_lk.k(-9897);
                    ((qc) (var3_ref)).field_w = 0;
                    statePc = 438;
                    continue stateLoop;
                }
                case 438: {
                    if ((var4 ^ -1) == (((qc) (var3_ref)).field_P ^ -1)) {
                        statePc = 441;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 441: {
                    ((qc) (var3_ref)).field_p.a(new in(cb.field_i, 13, true), 2777);
                    ((qc) (var3_ref)).field_ob = true;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 442: {
                    if ((bh.field_k ^ -1) == -67) {
                        statePc = 445;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 445: {
                    var4 = de.field_V.d((byte) -22);
                    var5 = de.field_V.d((byte) -76);
                    var6 = ((qc) (var3_ref)).field_g.field_p[var4];
                    var7 = 0;
                    statePc = 446;
                    continue stateLoop;
                }
                case 446: {
                    if (var7 >= var5) {
                        statePc = 449;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    discarded$7 = var6.b(-19939);
                    var7++;
                    if (var22 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (var22 == 0) {
                        statePc = 446;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 449: {
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    if (67 == bh.field_k) {
                        statePc = 453;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 453: {
                    var4 = de.field_V.d((byte) -50);
                    var5_ref_rf = ((qc) (var3_ref)).field_db.a(true, true, de.field_V);
                    ((qc) (var3_ref)).field_g.field_p[var4].a(var5_ref_rf, (byte) -121);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    if ((bh.field_k ^ -1) != -69) {
                        statePc = 458;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    ((qc) (var3_ref)).field_T = de.field_V.d((byte) -35);
                    ((qc) (var3_ref)).field_p.a(new in(eb.field_c, 12, false), 2777);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    if (bh.field_k == 69) {
                        statePc = 461;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 461: {
                    ((qc) (var3_ref)).field_T = de.field_V.d((byte) -78);
                    ((qc) (var3_ref)).field_r = true;
                    ((qc) (var3_ref)).field_p.a(new in(bn.field_c, 8, false), 2777);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    if ((bh.field_k ^ -1) == -77) {
                        statePc = 465;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 465: {
                    ((qc) (var3_ref)).field_g.field_f[((qc) (var3_ref)).field_g.field_o] = de.field_V.g((byte) -89);
                    ((qc) (var3_ref)).field_g.field_o = ((qc) (var3_ref)).field_g.field_o + 1;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    if (70 != bh.field_k) {
                        statePc = 494;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    var4 = de.field_V.g((byte) -104);
                    var5 = 0;
                    statePc = 468;
                    continue stateLoop;
                }
                case 468: {
                    if ((var5 ^ -1) <= (((qc) (var3_ref)).field_g.field_b ^ -1)) {
                        statePc = 480;
                    } else {
                        statePc = 469;
                    }
                    continue stateLoop;
                }
                case 469: {
                    stackOut_469_0 = null;
                    stackOut_469_1 = var3_ref;
                    stackIn_338_0 = stackOut_469_0;
                    stackIn_338_1 = stackOut_469_1;
                    stackIn_470_0 = stackOut_469_0;
                    stackIn_470_1 = stackOut_469_1;
                    if (var22 != 0) {
                        statePc = 338;
                    } else {
                        statePc = 470;
                    }
                    continue stateLoop;
                }
                case 470: {
                    if (stackIn_470_0 == ((qc) ((Object) stackIn_470_1)).field_g.field_p[var5]) {
                        statePc = 478;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    if (((qc) (var3_ref)).field_v[var5].field_g.b(-24)) {
                        statePc = 478;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    discarded$8 = ((qc) (var3_ref)).b(39, var5);
                    if (var22 != 0) {
                        statePc = 479;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    if (var22 == 0) {
                        statePc = 471;
                    } else {
                        statePc = 478;
                    }
                    continue stateLoop;
                }
                case 478: {
                    var5++;
                    statePc = 479;
                    continue stateLoop;
                }
                case 479: {
                    if (var22 == 0) {
                        statePc = 468;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    ((qc) (var3_ref)).field_g.a(var4, (byte) -70);
                    ((qc) (var3_ref)).a(100);
                    if (((qc) (var3_ref)).field_P >= 0) {
                        statePc = 483;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 483: {
                    cd.a(true);
                    statePc = 484;
                    continue stateLoop;
                }
                case 484: {
                    if (-1 < (var4 ^ -1)) {
                        statePc = 488;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 485: {
                    if (!((qc) (var3_ref)).field_ob) {
                        statePc = 491;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 488: {
                    ((qc) (var3_ref)).a(rm.field_b, 0);
                    if (var22 == 0) {
                        statePc = 493;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 491: {
                    ((qc) (var3_ref)).a(hb.field_Ub, 0);
                    statePc = 493;
                    continue stateLoop;
                }
                case 493: {
                    ob.field_k = true;
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    if (71 == bh.field_k) {
                        statePc = 497;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 497: {
                    ((qc) (var3_ref)).field_g.field_d = de.field_V.d((byte) -45);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    if (bh.field_k != 72) {
                        statePc = 502;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 499: {
                    ((qc) (var3_ref)).field_g.field_h = de.field_V.d((byte) -19);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 502: {
                    if (bh.field_k == 73) {
                        statePc = 505;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 505: {
                    ((qc) (var3_ref)).field_g.field_a = de.field_V.d((byte) -77);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 506: {
                    if ((bh.field_k ^ -1) != -75) {
                        statePc = 510;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    ((qc) (var3_ref)).field_yb = de.field_V.d((byte) -31);
                    ((qc) (var3_ref)).field_g.field_d = ((qc) (var3_ref)).field_g.field_d & (((qc) (var3_ref)).field_yb ^ -1);
                    ((qc) (var3_ref)).field_g.field_a = ((qc) (var3_ref)).field_g.field_a & (((qc) (var3_ref)).field_yb ^ -1);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    this.f((byte) 126);
                    if (var22 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 511;
                    }
                    continue stateLoop;
                }
                case 511: {
                    wj.c(4792, 0);
                    stackOut_511_0 = param0;
                    stackOut_511_1 = 49;
                    stackIn_512_0 = stackOut_511_0;
                    stackIn_512_1 = stackOut_511_1;
                    statePc = 512;
                    continue stateLoop;
                }
                case 512: {
                    if (stackIn_512_0 >= stackIn_512_1) {
                        statePc = 515;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    discarded$9 = client.a((String) null, 33);
                    statePc = 515;
                    continue stateLoop;
                }
                case 515: {
                    if (null == hh.field_a) {
                        statePc = 519;
                    } else {
                        statePc = 516;
                    }
                    continue stateLoop;
                }
                case 516: {
                    if ((ef.field_N ^ -1) >= -1) {
                        statePc = 521;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    stackOut_519_0 = 1;
                    stackIn_522_0 = stackOut_519_0;
                    statePc = 522;
                    continue stateLoop;
                }
                case 521: {
                    stackOut_521_0 = 0;
                    stackIn_522_0 = stackOut_521_0;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    var3 = stackIn_522_0;
                    if (fm.field_b) {
                        statePc = 525;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 525: {
                    var3 = nk.field_i ? 1 : 0;
                    statePc = 526;
                    continue stateLoop;
                }
                case 526: {
                    if (fa.field_n) {
                        statePc = 529;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 529: {
                    var3 = og.field_ib ? 1 : 0;
                    statePc = 530;
                    continue stateLoop;
                }
                case 530: {
                    if (var3 == 0) {
                        statePc = 533;
                    } else {
                        statePc = 531;
                    }
                    continue stateLoop;
                }
                case 531: {
                    bg.field_b = 0;
                    statePc = 533;
                    continue stateLoop;
                }
                case 533: {
                    if (!ea.c((byte) -60)) {
                        statePc = 571;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    var4 = this.g((byte) 125);
                    if ((var4 ^ -1) == -1) {
                        statePc = 540;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    if (var4 == 1) {
                        statePc = 540;
                    } else {
                        statePc = 554;
                    }
                    continue stateLoop;
                }
                case 540: {
                    if (1 == var4) {
                        statePc = 552;
                    } else {
                        statePc = 541;
                    }
                    continue stateLoop;
                }
                case 541: {
                    if (!uh.field_b) {
                        statePc = 551;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    un.a((byte) -123);
                    gd.field_f = true;
                    if (fm.field_b) {
                        statePc = 549;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 549: {
                    wj.a(1, -99, false, 0, true, af.field_a);
                    statePc = 550;
                    continue stateLoop;
                }
                case 550: {
                    kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                    dc.a(false, 96);
                    uh.field_b = false;
                    fm.field_b = false;
                    fa.field_n = false;
                    jg.a(-100);
                    am.field_c = false;
                    statePc = 551;
                    continue stateLoop;
                }
                case 551: {
                    wk.field_i = false;
                    mn.field_c = false;
                    if (var22 == 0) {
                        statePc = 554;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    wk.field_i = true;
                    mn.field_c = true;
                    statePc = 554;
                    continue stateLoop;
                }
                case 554: {
                    var5 = 0;
                    if ((var4 ^ -1) != -3) {
                        statePc = 556;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 555: {
                    var5 = 1;
                    statePc = 556;
                    continue stateLoop;
                }
                case 556: {
                    if (uh.field_b) {
                        statePc = 565;
                    } else {
                        statePc = 557;
                    }
                    continue stateLoop;
                }
                case 557: {
                    if (mn.field_c) {
                        statePc = 565;
                    } else {
                        statePc = 560;
                    }
                    continue stateLoop;
                }
                case 560: {
                    if (wk.field_i) {
                        statePc = 565;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 565: {
                    var5 = 1;
                    statePc = 566;
                    continue stateLoop;
                }
                case 566: {
                    if (ea.c((byte) -88)) {
                        statePc = 568;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 567: {
                    var5 = 0;
                    statePc = 568;
                    continue stateLoop;
                }
                case 568: {
                    if (var5 == 0) {
                        statePc = 571;
                    } else {
                        statePc = 569;
                    }
                    continue stateLoop;
                }
                case 569: {
                    gh.a(false);
                    statePc = 571;
                    continue stateLoop;
                }
                case 571: {
                    of.a(0);
                    if (!sh.field_j) {
                        statePc = 583;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    if (am.field_c) {
                        statePc = 583;
                    } else {
                        statePc = 575;
                    }
                    continue stateLoop;
                }
                case 575: {
                    if (jg.field_a != rc.field_d) {
                        statePc = 580;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 580: {
                    nn.a(256, jg.field_a, true);
                    statePc = 583;
                    continue stateLoop;
                }
                case 583: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void j(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_y = null;
              field_D = null;
              field_E = null;
              field_F = null;
              field_C = null;
              if (param0 == -56) {
                break L1;
              } else {
                field_C = (ck[]) null;
                break L1;
              }
            }
            field_x = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "client.U(" + param0 + ')');
        }
    }

    public client() {
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (km.field_z == null) {
                break L1;
              } else {
                km.field_z.e();
                break L1;
              }
            }
            if (param0 == 0) {
              L2: {
                if (null != cj.field_b) {
                  cj.field_b.e();
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (null == cl.field_v) {
                  break L3;
                } else {
                  sn.a(false);
                  break L3;
                }
              }
              s.h((byte) 88);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, boolean param1) {
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        boolean discarded$11 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ke stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        ke stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        ke stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        ke stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_157_0 = 0;
        boolean stackIn_161_0 = false;
        boolean stackIn_171_0 = false;
        int stackIn_208_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_298_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ke stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        ke stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        ke stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        ke stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_154_0 = 0;
        int stackOut_156_0 = 0;
        boolean stackOut_160_0 = false;
        boolean stackOut_170_0 = false;
        int stackOut_207_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_252_0 = 0;
        int stackOut_297_0 = 0;
        int stackOut_295_0 = 0;
        var9 = field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 30661) {
              L1: {
                L2: {
                  if (gb.field_Vb == gb.field_Ob) {
                    break L2;
                  } else {
                    L3: {
                      if (ve.field_nc != gb.field_Ob) {
                        break L3;
                      } else {
                        rf.field_f = rf.field_f + 1;
                        if (rf.field_f == 16) {
                          L4: {
                            L5: {
                              if (im.field_f) {
                                break L5;
                              } else {
                                ed.a(param0 + -30553);
                                if (var9 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            gf.a((byte) -126);
                            break L4;
                          }
                          gb.field_Ob = g.field_L;
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    L6: {
                      if ((gb.field_Ob ^ -1) == (g.field_L ^ -1)) {
                        break L6;
                      } else {
                        rf.field_f = rf.field_f - 1;
                        if (-1 != (rf.field_f ^ -1)) {
                          break L1;
                        } else {
                          gb.field_Ob = gb.field_Vb;
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (!ph.n(-30146)) {
                        L8: {
                          if (null != gh.field_e) {
                            qb.a(3, (byte) 85, gh.field_e);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          ek.g(param0 + -31870);
                          if (1 == fe.field_b) {
                            break L9;
                          } else {
                            L10: {
                              if (2 == fe.field_b) {
                                break L10;
                              } else {
                                L11: {
                                  if (fe.field_b == 3) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (fe.field_b != 4) {
                                        break L12;
                                      } else {
                                        dc.a(false, param0 + -30547);
                                        if (var9 == 0) {
                                          break L7;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (-6 == (fe.field_b ^ -1)) {
                                        break L13;
                                      } else {
                                        L14: {
                                          if (-7 != (fe.field_b ^ -1)) {
                                            break L14;
                                          } else {
                                            cl.field_B = qj.a(-44, false);
                                            if (var9 == 0) {
                                              break L7;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (fe.field_b == 8) {
                                            break L15;
                                          } else {
                                            if (7 == fe.field_b) {
                                              ca.field_wb = oj.a(false, 415);
                                              if (var9 == 0) {
                                                break L7;
                                              } else {
                                                break L15;
                                              }
                                            } else {
                                              throw new IllegalStateException(Integer.toString(fe.field_b));
                                            }
                                          }
                                        }
                                        am.field_a = ib.a((byte) 82, false);
                                        if (var9 == 0) {
                                          break L7;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    h.field_d = uh.a(o.field_g, false, 0, -111);
                                    if (var9 == 0) {
                                      break L7;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                jk.a(2, true);
                                if (var9 == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            jm.a(0, true);
                            if (var9 == 0) {
                              break L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                        vk.a(true, (byte) -53);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    gb.field_Ob = lk.field_I;
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L16: {
                  L17: {
                    var3_int = 0;
                    var4 = 0;
                    if (!param1) {
                      L18: {
                        if (null == kf.field_G) {
                          break L18;
                        } else {
                          L19: {
                            if (!ba.field_c) {
                              break L19;
                            } else {
                              pd.field_d.g((byte) -96);
                              if (var9 == 0) {
                                break L17;
                              } else {
                                break L19;
                              }
                            }
                          }
                          L20: {
                            if (lk.field_F) {
                              break L20;
                            } else {
                              L21: {
                                if (mg.field_Zb) {
                                  break L21;
                                } else {
                                  L22: {
                                    if (fm.field_e) {
                                      break L22;
                                    } else {
                                      L23: {
                                        if (ve.field_Hc) {
                                          break L23;
                                        } else {
                                          L24: {
                                            if (!nk.field_k) {
                                              break L24;
                                            } else {
                                              f.field_s.g(2824);
                                              if (var9 == 0) {
                                                break L17;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                          L25: {
                                            if (gi.field_b) {
                                              break L25;
                                            } else {
                                              kf.field_G.k(128);
                                              if (var9 == 0) {
                                                break L17;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                          L26: {
                                            L27: {
                                              h.a((ke) null, (byte) 95);
                                              discarded$6 = wf.a(false);
                                              var5 = lg.a(0, true);
                                              if (1 == var5) {
                                                break L27;
                                              } else {
                                                if ((var5 ^ -1) != -3) {
                                                  break L26;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                            L28: {
                                              gi.field_b = false;
                                              stackOut_121_0 = kf.field_G;
                                              stackOut_121_1 = param0 ^ -30662;
                                              stackIn_126_0 = stackOut_121_0;
                                              stackIn_126_1 = stackOut_121_1;
                                              stackIn_122_0 = stackOut_121_0;
                                              stackIn_122_1 = stackOut_121_1;
                                              if (var5 != 2) {
                                                stackOut_126_0 = (ke) ((Object) stackIn_126_0);
                                                stackOut_126_1 = stackIn_126_1;
                                                stackOut_126_2 = 0;
                                                stackIn_127_0 = stackOut_126_0;
                                                stackIn_127_1 = stackOut_126_1;
                                                stackIn_127_2 = stackOut_126_2;
                                                break L28;
                                              } else {
                                                stackOut_122_0 = (ke) ((Object) stackIn_122_0);
                                                stackOut_122_1 = stackIn_122_1;
                                                stackIn_124_0 = stackOut_122_0;
                                                stackIn_124_1 = stackOut_122_1;
                                                stackOut_124_0 = (ke) ((Object) stackIn_124_0);
                                                stackOut_124_1 = stackIn_124_1;
                                                stackOut_124_2 = 1;
                                                stackIn_127_0 = stackOut_124_0;
                                                stackIn_127_1 = stackOut_124_1;
                                                stackIn_127_2 = stackOut_124_2;
                                                break L28;
                                              }
                                            }
                                            ((ke) (Object) stackIn_127_0).c(stackIn_127_1, stackIn_127_2 != 0);
                                            break L26;
                                          }
                                          L29: {
                                            if (3 != var5) {
                                              break L29;
                                            } else {
                                              sm.a((byte) -65, se.h(25144));
                                              break L29;
                                            }
                                          }
                                          if (var9 == 0) {
                                            break L17;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      ca.field_wb.d(-8622);
                                      if (var9 == 0) {
                                        break L17;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                  am.field_a.l((byte) 101);
                                  if (var9 == 0) {
                                    break L17;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              cl.field_B.f((byte) -63);
                              if (var9 == 0) {
                                break L17;
                              } else {
                                break L20;
                              }
                            }
                          }
                          h.field_d.j(-114);
                          if (var9 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L30: {
                        if (!am.field_c) {
                          break L30;
                        } else {
                          L31: {
                            if (!uh.field_b) {
                              break L31;
                            } else {
                              L32: {
                                L33: {
                                  var3_int = 1;
                                  if (kf.field_G != null) {
                                    break L33;
                                  } else {
                                    if (ea.d((byte) 92)) {
                                      break L33;
                                    } else {
                                      stackOut_154_0 = 1;
                                      stackIn_157_0 = stackOut_154_0;
                                      break L32;
                                    }
                                  }
                                }
                                stackOut_156_0 = 0;
                                stackIn_157_0 = stackOut_156_0;
                                break L32;
                              }
                              var4 = stackIn_157_0;
                              if (var9 == 0) {
                                break L17;
                              } else {
                                break L31;
                              }
                            }
                          }
                          var5 = kf.field_I.b(2, true) ? 1 : 0;
                          L34: while (true) {
                            L35: {
                              if (var5 != 0) {
                                break L35;
                              } else {
                                stackOut_160_0 = ab.c((byte) 50);
                                stackIn_171_0 = stackOut_160_0;
                                stackIn_161_0 = stackOut_160_0;
                                if (var9 != 0) {
                                  break L16;
                                } else {
                                  if (!stackIn_161_0) {
                                    break L35;
                                  } else {
                                    var5 = kf.field_I.e(false) ? 1 : 0;
                                    if (var9 == 0) {
                                      continue L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                            }
                            if (var9 == 0) {
                              break L17;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      if (!uh.field_b) {
                        break L17;
                      } else {
                        var3_int = 1;
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  stackOut_170_0 = uh.field_b;
                  stackIn_171_0 = stackOut_170_0;
                  break L16;
                }
                L36: {
                  L37: {
                    L38: {
                      if (!stackIn_171_0) {
                        break L38;
                      } else {
                        if (mn.field_c) {
                          break L38;
                        } else {
                          if (!wk.field_i) {
                            L39: {
                              if (!fm.field_b) {
                                break L39;
                              } else {
                                if (!jg.field_i) {
                                  break L39;
                                } else {
                                  var3_int = 0;
                                  break L39;
                                }
                              }
                            }
                            L40: {
                              ka.a(var3_int != 0, -3051);
                              if (fa.field_n) {
                                discarded$7 = ce.field_C.b(2, var4 != 0);
                                break L40;
                              } else {
                                break L40;
                              }
                            }
                            L41: {
                              if (fm.field_b) {
                                L42: {
                                  ph.a(180, 320, false, var4 != 0);
                                  if (jg.field_i) {
                                    var4 = 0;
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                                discarded$8 = kf.field_I.b(2, var4 != 0);
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                            L43: while (true) {
                              if (!ab.c((byte) -123)) {
                                break L38;
                              } else {
                                if (var9 != 0) {
                                  break L37;
                                } else {
                                  L44: {
                                    L45: {
                                      if (null == hh.field_a) {
                                        break L45;
                                      } else {
                                        if (-1 <= (ef.field_N ^ -1)) {
                                          stackOut_207_0 = 0;
                                          stackIn_208_0 = stackOut_207_0;
                                          break L44;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                    stackOut_205_0 = 1;
                                    stackIn_208_0 = stackOut_205_0;
                                    break L44;
                                  }
                                  L46: {
                                    var5 = stackIn_208_0;
                                    if (fm.field_b) {
                                      var5 = nk.field_i ? 1 : 0;
                                      break L46;
                                    } else {
                                      break L46;
                                    }
                                  }
                                  L47: {
                                    if (!fa.field_n) {
                                      break L47;
                                    } else {
                                      var5 = og.field_ib ? 1 : 0;
                                      break L47;
                                    }
                                  }
                                  L48: {
                                    if (param1) {
                                      break L48;
                                    } else {
                                      L49: {
                                        if (!fm.field_b) {
                                          break L49;
                                        } else {
                                          if (!gd.a(13, 12, 15, (byte) -83)) {
                                            break L48;
                                          } else {
                                            if (var9 == 0) {
                                              continue L43;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                      }
                                      if (var5 == 0) {
                                        break L48;
                                      } else {
                                        discarded$9 = ig.a(12, 15, 13, (byte) 69);
                                        break L48;
                                      }
                                    }
                                  }
                                  L50: {
                                    if (!fa.field_n) {
                                      break L50;
                                    } else {
                                      if (var4 == 0) {
                                        break L50;
                                      } else {
                                        discarded$10 = ce.field_C.e(false);
                                        break L50;
                                      }
                                    }
                                  }
                                  L51: {
                                    if (!fm.field_b) {
                                      break L51;
                                    } else {
                                      if (var4 == 0) {
                                        break L51;
                                      } else {
                                        discarded$11 = kf.field_I.e(false);
                                        break L51;
                                      }
                                    }
                                  }
                                  if (var9 == 0) {
                                    continue L43;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                            }
                          } else {
                            break L38;
                          }
                        }
                      }
                    }
                    if (!uh.field_b) {
                      gn.b(-29550);
                      break L37;
                    } else {
                      break L36;
                    }
                  }
                  if (ab.e(param0 + -58860) == 0) {
                    we.a((byte) 68);
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L52: {
                  L53: {
                    if (hh.field_a == null) {
                      break L53;
                    } else {
                      if (-1 <= (ef.field_N ^ -1)) {
                        stackOut_254_0 = 0;
                        stackIn_255_0 = stackOut_254_0;
                        break L52;
                      } else {
                        break L53;
                      }
                    }
                  }
                  stackOut_252_0 = 1;
                  stackIn_255_0 = stackOut_252_0;
                  break L52;
                }
                L54: {
                  var5 = stackIn_255_0;
                  if (!fm.field_b) {
                    break L54;
                  } else {
                    var5 = nk.field_i ? 1 : 0;
                    break L54;
                  }
                }
                L55: {
                  if (fa.field_n) {
                    var5 = og.field_ib ? 1 : 0;
                    break L55;
                  } else {
                    break L55;
                  }
                }
                L56: {
                  L57: {
                    if (var5 != 0) {
                      break L57;
                    } else {
                      if (-1 > (ef.field_N ^ -1)) {
                        ef.field_N = ef.field_N - 1;
                        if (var9 == 0) {
                          break L56;
                        } else {
                          break L57;
                        }
                      } else {
                        break L56;
                      }
                    }
                  }
                  if ((ef.field_N ^ -1) > (dl.field_M ^ -1)) {
                    ef.field_N = ef.field_N + 1;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                L58: {
                  var6 = dl.field_M * dl.field_M;
                  var7 = -(ef.field_N * ef.field_N) + var6;
                  var8 = ea.field_p + 120 * var7 / var6;
                  ij.a(var8, -32);
                  if (ue.field_b != hh.field_a) {
                    break L58;
                  } else {
                    if (ab.e(param0 + -58860) != 0) {
                      break L58;
                    } else {
                      L59: {
                        if (!am.field_c) {
                          break L59;
                        } else {
                          L60: {
                            db.field_d = false;
                            if (kf.field_I == null) {
                              break L60;
                            } else {
                              if (-39 < (kf.field_I.field_hb ^ -1)) {
                                ue.field_b = dn.field_p[kf.field_I.field_g.field_l];
                                break L60;
                              } else {
                                break L60;
                              }
                            }
                          }
                          L61: {
                            if (fa.field_n) {
                              ue.field_b = dn.field_p[ce.field_C.field_g.field_l];
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                          L62: {
                            if (uh.field_b) {
                              stackOut_297_0 = 0;
                              stackIn_298_0 = stackOut_297_0;
                              break L62;
                            } else {
                              stackOut_295_0 = 1;
                              stackIn_298_0 = stackOut_295_0;
                              break L62;
                            }
                          }
                          wg.field_f = stackIn_298_0 != 0;
                          if (var9 == 0) {
                            break L58;
                          } else {
                            break L59;
                          }
                        }
                      }
                      L63: {
                        if (!uh.field_b) {
                          break L63;
                        } else {
                          db.field_d = false;
                          wg.field_f = false;
                          ue.field_b = null;
                          if (var9 == 0) {
                            break L58;
                          } else {
                            break L63;
                          }
                        }
                      }
                      db.field_d = true;
                      ue.field_b = tc.field_Tb;
                      wg.field_f = true;
                      break L58;
                    }
                  }
                }
                if (ue.field_b != hh.field_a) {
                  vf.field_b = vf.field_b + 1;
                  if (30 > vf.field_b) {
                    break L1;
                  } else {
                    vf.field_b = 0;
                    hh.field_a = ue.field_b;
                    qd.field_Nb = wg.field_f;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "client.O(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            client.j((byte) -56);
            vd.c((byte) 101);
            vj.b((byte) 79);
            bj.a(112);
            km.c(710);
            n.b(128);
            ml.a((byte) -33);
            wh.a(true);
            jb.a((byte) -9);
            hn.b(6);
            oh.b(false);
            wg.a(true);
            hm.b(64);
            hk.a();
            ji.a(127);
            th.a(122);
            bb.a(-117);
            wl.d(8);
            ik.b(78);
            jh.a(false);
            fe.a((byte) -108);
            ge.a(true);
            dm.a(121);
            hc.a((byte) 82);
            o.a(false);
            l.b(126);
            u.a(23358);
            hl.a(-21128);
            pc.a((byte) -46);
            sh.a((byte) -105);
            lj.a(89);
            jf.a(-114);
            ie.a((byte) -120);
            eh.a(24744);
            cb.b(12623);
            ql.b(-100);
            ri.a((byte) -91);
            dd.b((byte) 115);
            im.a(0);
            ne.a((byte) 0);
            nh.a((byte) -73);
            qk.c(-11657);
            pl.b(113);
            en.f();
            ui.b(31158);
            ia.f();
            ke.l(126);
            qc.a(false);
            ah.a(8);
            gn.a(0);
            ul.b((byte) -75);
            lk.g(36);
            bh.b(25189);
            wa.a(18);
            ch.a(78);
            d.a(36);
            rc.a(-120);
            tm.a(103);
            j.a(true);
            w.f((byte) 77);
            ve.h((byte) 116);
            nk.a(-121);
            tj.e(-18263);
            gg.c(0);
            be.a(-106);
            vh.a(true);
            p.a(110);
            ed.b(-96);
            rg.a(-114);
            ka.h((byte) 102);
            wj.s(0);
            qn.n((byte) 89);
            ph.m((byte) 24);
            gk.p(15);
            tf.b(true);
            lg.f((byte) 1);
            he.i(0);
            cn.j(3);
            jg.b((byte) 101);
            c.a(23302);
            mc.a(0);
            ng.a(-61);
            je.b(23369);
            oa.b(-1);
            ad.a((byte) -67);
            lf.a(-13495);
            of.a((byte) 91);
            am.a(119);
            lc.a(-27983);
            mm.a();
            ub.b((byte) -32);
            nd.a(3);
            pd.a((byte) -120);
            h.b((byte) -128);
            uc.a(true);
            rn.a(-117);
            ll.a(108);
            qd.f(77);
            nm.g(48);
            ha.f(3);
            jd.e(32);
            gb.e(-2);
            s.i((byte) -94);
            pf.a((byte) -103);
            mg.f(256);
            ak.a((byte) -112);
            ec.a((byte) 102);
            sk.e(-28610);
            vk.a((byte) -93);
            ic.a(-18551);
            vf.a(27067);
            om.a(false);
            kb.a(-109);
            jk.a((byte) -91);
            hh.a(-9724);
            cc.a((byte) -94);
            e.a(-22811);
            pe.a(-1);
            fh.b(0);
            eb.b(92);
            oi.a(2);
            sa.c((byte) -82);
            uk.c(127);
            sl.a((byte) 110);
            uf.h((byte) 120);
            nn.a(14925);
            gf.a(2);
            v.a(-66);
            gh.a(98);
            fm.a(true);
            ee.a((byte) -78);
            hg.a((byte) 126);
            rf.a(false);
            in.a(123);
            vm.a(121);
            eg.a(10140);
            pm.a(62);
            mf.i(-17690);
            gd.a((byte) -118);
            ok.d();
            aj.b(0);
            bk.e(15338);
            qb.d(112);
            ab.d(1);
            pj.h((byte) 106);
            kh.b(-1643605936);
            el.b(true);
            le.b(true);
            hf.b(12741);
            ci.a(-27513);
            sf.f((byte) -126);
            pg.a((byte) 126);
            ib.m(-30);
            a.a(-1);
            qg.a();
            va.c();
            oj.a(3805);
            dh.a((byte) -68);
            vg.a((byte) 91);
            rm.a(2);
            fc.a(38);
            aa.a(true);
            li.a(101);
            dk.b(16057);
            un.b((byte) 86);
            oc.a(true);
            mk.a(false);
            if (param0 >= 75) {
              td.a();
              vl.a(true);
              kl.a(true);
              uj.a((byte) 111);
              mn.a(-117);
              kk.a((byte) -117);
              bc.b((byte) -102);
              al.a((byte) -100);
              qj.b((byte) 126);
              cf.a((byte) 126);
              ce.c(54);
              ma.e((byte) -79);
              t.l((byte) 94);
              bl.i(2);
              kf.h(116);
              rd.b((byte) -119);
              k.a(-5161);
              ih.b();
              ue.a((byte) -128);
              fl.a(29047);
              ga.a((byte) -52);
              cj.a(-48);
              ig.g((byte) 34);
              em.a((byte) 82);
              sm.a(30553);
              ac.g((byte) -17);
              me.c(0);
              la.a((byte) 92);
              fb.a((byte) 117);
              jj.a(false);
              we.b((byte) -37);
              db.a((byte) 91);
              dn.d(72);
              wf.f(-119);
              gi.a(79);
              dc.a(true);
              qe.a(-20007);
              kj.a();
              fj.a(25988);
              cg.a(124);
              bn.a((byte) 92);
              wd.a(1);
              de.g(-121);
              og.i((byte) 109);
              rk.j(81);
              ca.l(104);
              df.a(1);
              qi.f((byte) 117);
              g.a(-99);
              pa.h((byte) 47);
              dl.b(false);
              wm.c(18966);
              bg.a((byte) 22);
              md.f((byte) 106);
              ai.a(-59);
              b.a(-109);
              tc.h((byte) 105);
              hb.e(-102);
              da.a((byte) -121);
              rb.a(573767765);
              qf.c(119);
              pn.l(33);
              oe.b(true);
              vb.j(-20);
              ea.b((byte) -37);
              fn.b(0);
              mb.a(false);
              se.g(11344);
              id.c(true);
              si.e(0);
              uh.b((byte) 73);
              vi.f((byte) 46);
              qm.a(2);
              ua.e(8);
              sc.b(false);
              hj.a();
              wi.a(0);
              cm.a(1714134600);
              dg.a(8);
              kc.a(93);
              kn.a(-1);
              sg.a(3);
              ug.a(-21771);
              fk.c(8);
              on.a((byte) 6);
              di.c(87);
              gm.d(38);
              tg.a(false);
              ef.g(0);
              wb.e(-78);
              cl.c((byte) -39);
              pb.a((byte) 78);
              lb.a(-19893);
              f.c(30061);
              ki.c((byte) 22);
              sb.a(13820388);
              ff.a(-45);
              ta.a(false);
              um.a(0);
              bf.a(-73);
              af.a((byte) -47);
              cd.a((byte) 121);
              dj.b(true);
              wc.a(2);
              ij.a(-85);
              wk.c(7751);
              qa.e(-30349);
              ob.a((byte) 121);
              ln.a((byte) -89);
              hd.a(22771);
              fa.c((byte) -74);
              sn.a((byte) 86);
              nf.a(-120);
              jm.e(62);
              te.e(0);
              ii.e(9369);
              tl.g((byte) -68);
              kd.e(127);
              re.g((byte) -112);
              i.b(28180);
              pk.c(-59);
              tb.a(20908);
              ba.d((byte) 127);
              jc.a(true);
              this.field_m = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        int var3 = 0;
        ck var4_ref_ck = null;
        int var4 = 0;
        int var5_int = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int stackIn_27_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_144_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_147_0 = 0;
        boolean stackOut_147_1 = false;
        var9 = field_A ? 1 : 0;
        try {
          L0: {
            var2_ref = ne.d(-86);
            if (!ta.a((byte) -56)) {
              if (!sh.field_j) {
                cn.a(true, var2_ref);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!se.i(-1)) {
                  qi.a(100.0f, -81, bg.field_c);
                  cn.a(true, var2_ref);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    L2: {
                      qn.a(kd.field_t, qm.field_c, (byte) -109);
                      if (kf.field_G != null) {
                        break L2;
                      } else {
                        if (ea.d((byte) 111)) {
                          break L2;
                        } else {
                          L3: {
                            if (!fm.field_b) {
                              break L3;
                            } else {
                              if (jg.field_i) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_24_0 = 1;
                          stackIn_27_0 = stackOut_24_0;
                          break L1;
                        }
                      }
                    }
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    break L1;
                  }
                  L4: {
                    var3 = stackIn_27_0;
                    if (0 == rb.field_e) {
                      ca.field_kb = ak.field_d;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (-2 > (ca.field_kb ^ -1)) {
                        break L6;
                      } else {
                        jb.field_a = false;
                        if (var9 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    sg.field_b.a();
                    break L5;
                  }
                  L7: while (true) {
                    L8: {
                      if ((rb.field_e ^ -1) == -1) {
                        ai.e((byte) 84);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (kf.field_I == null) {
                        break L9;
                      } else {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        break L9;
                      }
                    }
                    L10: {
                      if (null != ce.field_C) {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 < ca.field_kb) {
                        rb.field_e = rb.field_e + 1;
                        if (jb.field_a) {
                          break L11;
                        } else {
                          if ((ca.field_kb ^ -1) < (rb.field_e ^ -1)) {
                            continue L7;
                          } else {
                            break L11;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (1 >= ca.field_kb) {
                        break L12;
                      } else {
                        L13: {
                          if (rb.field_e < ca.field_kb) {
                            break L13;
                          } else {
                            var4_ref_ck = pa.field_U;
                            pa.field_U = sg.field_b;
                            jb.field_a = true;
                            rb.field_e = 0;
                            sg.field_b = var4_ref_ck;
                            break L13;
                          }
                        }
                        le.field_m.a((byte) -113);
                        pa.field_U.e(0, 0);
                        break L12;
                      }
                    }
                    L14: {
                      if (null != kf.field_I) {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (ce.field_C != null) {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (am.field_c) {
                        break L16;
                      } else {
                        if (!uh.field_b) {
                          L17: {
                            kf.field_G.a(false);
                            var4 = 0;
                            if (null != pd.field_d) {
                              var4 = 1;
                              pd.field_d.c((byte) -75);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (h.field_d == null) {
                              break L18;
                            } else {
                              var4 = 1;
                              h.field_d.h((byte) 99);
                              break L18;
                            }
                          }
                          L19: {
                            if (null == cl.field_B) {
                              break L19;
                            } else {
                              cl.field_B.b((byte) -48);
                              var4 = 1;
                              break L19;
                            }
                          }
                          L20: {
                            if (null == am.field_a) {
                              break L20;
                            } else {
                              am.field_a.i(123);
                              var4 = 1;
                              break L20;
                            }
                          }
                          L21: {
                            if (null == ca.field_wb) {
                              break L21;
                            } else {
                              ca.field_wb.d((byte) 45);
                              var4 = 1;
                              break L21;
                            }
                          }
                          L22: {
                            if (f.field_s != null) {
                              f.field_s.c(2);
                              var4 = 1;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          if (!gi.field_b) {
                            break L16;
                          } else {
                            if (hh.field_a != ue.field_b) {
                              break L16;
                            } else {
                              if (var4 != 0) {
                                break L16;
                              } else {
                                pb.a(390);
                                break L16;
                              }
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L23: {
                      L24: {
                        if (!fm.field_b) {
                          break L24;
                        } else {
                          if (!jg.field_i) {
                            break L24;
                          } else {
                            stackOut_104_0 = 1;
                            stackIn_107_0 = stackOut_104_0;
                            break L23;
                          }
                        }
                      }
                      stackOut_106_0 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      break L23;
                    }
                    L25: {
                      L26: {
                        var4 = stackIn_107_0;
                        stackOut_107_0 = 88;
                        stackIn_116_0 = stackOut_107_0;
                        stackIn_108_0 = stackOut_107_0;
                        if (var4 != 0) {
                          break L26;
                        } else {
                          stackOut_108_0 = stackIn_108_0;
                          stackIn_116_0 = stackOut_108_0;
                          stackIn_109_0 = stackOut_108_0;
                          if (kf.field_G != null) {
                            break L26;
                          } else {
                            stackOut_109_0 = stackIn_109_0;
                            stackIn_111_0 = stackOut_109_0;
                            stackOut_111_0 = stackIn_111_0;
                            stackIn_116_0 = stackOut_111_0;
                            stackIn_112_0 = stackOut_111_0;
                            if (!cb.a((byte) -128)) {
                              break L26;
                            } else {
                              stackOut_112_0 = stackIn_112_0;
                              stackIn_114_0 = stackOut_112_0;
                              stackOut_114_0 = stackIn_114_0;
                              stackOut_114_1 = 1;
                              stackIn_117_0 = stackOut_114_0;
                              stackIn_117_1 = stackOut_114_1;
                              break L25;
                            }
                          }
                        }
                      }
                      stackOut_116_0 = stackIn_116_0;
                      stackOut_116_1 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      break L25;
                    }
                    L27: {
                      tf.a((byte) stackIn_117_0, stackIn_117_1 != 0);
                      if (var4 != 0) {
                        da.a(false, cb.a((byte) -128));
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (param0 == 320) {
                        break L28;
                      } else {
                        field_B = (String) null;
                        break L28;
                      }
                    }
                    L29: {
                      L30: {
                        if (am.field_c) {
                          break L30;
                        } else {
                          if (!uh.field_b) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      if (kf.field_G != null) {
                        hk.d(0, 0, 640, 480);
                        kf.field_G.f(-26325);
                        if (f.field_s == null) {
                          break L29;
                        } else {
                          f.field_s.c(2);
                          break L29;
                        }
                      } else {
                        break L29;
                      }
                    }
                    L31: {
                      if (cn.f((byte) 99)) {
                        hk.a(320 + -(wk.b(3) / 2) - 34, -(pj.d(20) / 2) + 240 - 24, wk.b(3) + 68, pj.d(126) - -48, 0, 200);
                        vk.a(pj.d(param0 + -356) - -60, (byte) 50, a.field_n, wk.b(3) + 80, 240 - pj.d(-5) / 2 + -30, 320 - wk.b(3) / 2 - 40);
                        uh.b(32659);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      L33: {
                        if (ai.f((byte) 94)) {
                          break L33;
                        } else {
                          if (!pk.d(67)) {
                            break L32;
                          } else {
                            L34: {
                              stackOut_144_0 = 112;
                              stackIn_149_0 = stackOut_144_0;
                              stackIn_145_0 = stackOut_144_0;
                              if (cl.field_v != null) {
                                stackOut_149_0 = stackIn_149_0;
                                stackOut_149_1 = 1;
                                stackIn_150_0 = stackOut_149_0;
                                stackIn_150_1 = stackOut_149_1;
                                break L34;
                              } else {
                                stackOut_145_0 = stackIn_145_0;
                                stackIn_147_0 = stackOut_145_0;
                                stackOut_147_0 = stackIn_147_0;
                                stackOut_147_1 = qc.field_N;
                                stackIn_150_0 = stackOut_147_0;
                                stackIn_150_1 = stackOut_147_1 ? 1 : 0;
                                break L34;
                              }
                            }
                            t.a(stackIn_150_0, stackIn_150_1 != 0);
                            if (var9 == 0) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      hk.a(-34 + -(vd.a(480) / 2) + 320, -24 + (-(dj.a(110) / 2) + 240), 68 + vd.a(480), 48 + dj.a(110), 0, 200);
                      vk.a(dj.a(113) - -60, (byte) 50, a.field_n, 80 + vd.a(480), 210 + -(dj.a(108) / 2), 320 - (vd.a(param0 ^ 160) / 2 - -40));
                      cl.a(true);
                      break L32;
                    }
                    L35: {
                      if (gb.field_Ob != gb.field_Vb) {
                        var5_int = 256 * rf.field_f / 16;
                        if (-1 > (var5_int ^ -1)) {
                          hk.a(0, 0, hk.field_j, hk.field_i, 0, var5_int);
                          break L35;
                        } else {
                          break L35;
                        }
                      } else {
                        break L35;
                      }
                    }
                    L36: {
                      if (2 <= te.field_p) {
                        var5 = Runtime.getRuntime().totalMemory() / 1024L;
                        var7 = -(Runtime.getRuntime().freeMemory() / 1024L) + var5;
                        se.field_S.a("FPS: " + jf.field_c, 12, 38, 16777215, 1);
                        se.field_S.a(var7 + "/" + var5 + " kB", 12, 52, 16777215, 1);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    mf.a(1, 0, 0, var2_ref);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              jf.a(var2_ref, cd.a(param0 ^ 8512), -6351);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (8 <= var2_int) {
                    break L3;
                  } else {
                    pg.field_a[var2_int] = false;
                    ah.field_b[var2_int] = false;
                    kd.field_s[0][var2_int] = 9 * kd.field_s[0][var2_int] / 10;
                    kd.field_s[1][var2_int] = 9 * kd.field_s[1][var2_int] / 10;
                    var2_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.i((byte) 51);
                var2_int = 0;
                break L2;
              }
              if (param0 == 11978) {
                L4: while (true) {
                  L5: {
                    L6: {
                      if (8 <= var2_int) {
                        break L6;
                      } else {
                        if (var4 != 0) {
                          break L5;
                        } else {
                          L7: {
                            if (pg.field_a[var2_int]) {
                              break L7;
                            } else {
                              if (wf.field_l[var2_int] != null) {
                                wf.field_l[var2_int].f(0);
                                if (wf.field_l[var2_int].a((byte) 78)) {
                                  break L7;
                                } else {
                                  wf.field_l[var2_int] = null;
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (ah.field_b[var2_int]) {
                              break L8;
                            } else {
                              if (null == ik.field_c[var2_int]) {
                                break L8;
                              } else {
                                ik.field_c[var2_int].g(en.field_o / 50);
                                ik.field_c[var2_int] = null;
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (sk.field_a[0][var2_int] == null) {
                              break L9;
                            } else {
                              L10: {
                                var3 = kd.field_s[0][var2_int];
                                if (0 != var3) {
                                  break L10;
                                } else {
                                  sk.field_a[0][var2_int].g(en.field_o / 50);
                                  sk.field_a[0][var2_int] = null;
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              sk.field_a[0][var2_int].e(en.field_o / 50, pb.field_d * var3);
                              break L9;
                            }
                          }
                          L11: {
                            if (null != sk.field_a[1][var2_int]) {
                              L12: {
                                var3 = kd.field_s[1][var2_int];
                                if (0 != var3) {
                                  break L12;
                                } else {
                                  sk.field_a[1][var2_int].g(en.field_o / 50);
                                  sk.field_a[1][var2_int] = null;
                                  if (var4 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              sk.field_a[1][var2_int].e(en.field_o / 50, var3 * pb.field_d);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    break L5;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(5, 94, 31, 0, 1, 12, 2, param0);
            en.a(22050, true, 10);
            km.field_z = en.a(lf.field_e, (java.awt.Component) ((Object) jh.field_b), 0, 22050);
            cj.field_b = en.a(lf.field_e, (java.awt.Component) ((Object) jh.field_b), 1, 1024);
            dg.field_c = new mi();
            cj.field_b.b(dg.field_c);
            sh.field_a = new mi();
            km.field_z.b(sh.field_a);
            this.a(false, true, true, false, true, true, false);
            mk.field_c[66] = 2;
            mk.field_c[74] = 1;
            mk.field_c[64] = -2;
            mk.field_c[68] = 1;
            mk.field_c[10] = -1;
            mk.field_c[70] = 1;
            mk.field_c[73] = 1;
            mk.field_c[58] = -2;
            mk.field_c[9] = -1;
            mk.field_c[62] = 2;
            mk.field_c[72] = 1;
            bc.field_D = hm.field_e;
            mk.field_c[71] = 1;
            mk.field_c[63] = -1;
            mk.field_c[59] = -2;
            mk.field_c[65] = 1;
            mk.field_c[75] = -1;
            mk.field_c[76] = 1;
            mk.field_c[69] = 1;
            ik.field_h = dj.field_T;
            uc.field_a = true;
            mg.field_Ob = fl.field_d;
            mk.field_c[61] = -2;
            mk.field_c[67] = -1;
            pa.field_U = new ck(640, 480);
            sg.field_b = new ck(640, 480);
            ak.field_d = 1;
            rb.field_e = 0;
            ca.field_kb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, byte param6) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        vj var8 = null;
        long var9 = 0L;
        Object var11 = null;
        ve var12 = null;
        int var13 = 0;
        int var14 = 0;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        int var18_int = 0;
        w var19 = null;
        w var20 = null;
        w var21 = null;
        int var22_int = 0;
        w var22 = null;
        w var23 = null;
        w var24 = null;
        w var25 = null;
        w var26 = null;
        w var27 = null;
        w var28 = null;
        w var29 = null;
        w var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
        int var34_int = 0;
        String var34 = null;
        ck var35 = null;
        String var35_ref = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        nm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        nm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        nm stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        ve stackIn_17_0 = null;
        w stackIn_17_1 = null;
        w stackIn_17_2 = null;
        long stackIn_17_3 = 0L;
        ve stackIn_18_0 = null;
        w stackIn_18_1 = null;
        w stackIn_18_2 = null;
        long stackIn_18_3 = 0L;
        ve stackIn_19_0 = null;
        w stackIn_19_1 = null;
        w stackIn_19_2 = null;
        long stackIn_19_3 = 0L;
        w stackIn_19_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        ve stackIn_41_0 = null;
        w stackIn_41_1 = null;
        w stackIn_41_2 = null;
        long stackIn_41_3 = 0L;
        ve stackIn_43_0 = null;
        w stackIn_43_1 = null;
        w stackIn_43_2 = null;
        long stackIn_43_3 = 0L;
        ve stackIn_44_0 = null;
        w stackIn_44_1 = null;
        w stackIn_44_2 = null;
        long stackIn_44_3 = 0L;
        w stackIn_44_4 = null;
        int stackIn_49_0 = 0;
        int stackIn_125_0 = 0;
        ck[] stackIn_129_0 = null;
        int stackIn_140_0 = 0;
        ck[] stackIn_141_0 = null;
        ck[] stackIn_143_0 = null;
        ck[] stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        ck[] stackIn_151_0 = null;
        ck[] stackIn_153_0 = null;
        ck[] stackIn_155_0 = null;
        ck[] stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        ck[] stackIn_163_0 = null;
        boolean stackIn_218_0 = false;
        String stackIn_230_0 = null;
        boolean stackIn_238_0 = false;
        String stackIn_251_0 = null;
        String stackIn_265_0 = null;
        String stackIn_273_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        nm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        nm stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        nm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        ve stackOut_16_0 = null;
        w stackOut_16_1 = null;
        w stackOut_16_2 = null;
        long stackOut_16_3 = 0L;
        ve stackOut_18_0 = null;
        w stackOut_18_1 = null;
        w stackOut_18_2 = null;
        long stackOut_18_3 = 0L;
        w stackOut_18_4 = null;
        ve stackOut_17_0 = null;
        w stackOut_17_1 = null;
        w stackOut_17_2 = null;
        long stackOut_17_3 = 0L;
        w stackOut_17_4 = null;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        ve stackOut_40_0 = null;
        w stackOut_40_1 = null;
        w stackOut_40_2 = null;
        long stackOut_40_3 = 0L;
        ve stackOut_43_0 = null;
        w stackOut_43_1 = null;
        w stackOut_43_2 = null;
        long stackOut_43_3 = 0L;
        w stackOut_43_4 = null;
        ve stackOut_41_0 = null;
        w stackOut_41_1 = null;
        w stackOut_41_2 = null;
        long stackOut_41_3 = 0L;
        w stackOut_41_4 = null;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        ck[] stackOut_128_0 = null;
        int stackOut_139_0 = 0;
        int stackOut_137_0 = 0;
        ck[] stackOut_140_0 = null;
        ck[] stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        ck[] stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        ck[] stackOut_150_0 = null;
        ck[] stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        ck[] stackOut_151_0 = null;
        ck[] stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        ck[] stackOut_162_0 = null;
        boolean stackOut_217_0 = false;
        Object stackOut_229_0 = null;
        String stackOut_227_0 = null;
        Object stackOut_224_0 = null;
        boolean stackOut_237_0 = false;
        String stackOut_250_0 = null;
        String stackOut_248_0 = null;
        String stackOut_264_0 = null;
        String stackOut_262_0 = null;
        String stackOut_259_0 = null;
        String stackOut_272_0 = null;
        String stackOut_270_0 = null;
        var41 = field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = gf.field_c;
              stackOut_1_1 = 2 * (kf.field_O - -2);
              stackOut_1_2 = (kf.field_O * 4 + 8) * param0;
              stackOut_1_3 = -15230;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (ki.field_w != gf.field_c) {
                stackOut_4_0 = (nm) ((Object) stackIn_4_0);
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                break L1;
              } else {
                stackOut_2_0 = (nm) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_5_4 = stackOut_2_4;
                break L1;
              }
            }
            L2: {
              var7_int = ((nm) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, 2, param2) ? 1 : 0;
              var8 = gf.field_c.field_Ob.field_M;
              if (param6 <= -48) {
                break L2;
              } else {
                client.j((byte) 82);
                break L2;
              }
            }
            var9 = ik.a(4);
            var11 = null;
            var12 = (ve) ((Object) var8.c((byte) -101));
            L3: while (true) {
              L4: {
                L5: {
                  if (null == var12) {
                    break L5;
                  } else {
                    var13 = 0;
                    if (var41 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (null != var12.field_M) {
                          break L6;
                        } else {
                          stackOut_14_0 = param3;
                          stackOut_14_1 = param1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          L7: while (true) {
                            L8: {
                              var14 = stackIn_16_0 | stackIn_16_1;
                              var12.field_Pb = new w(0L, fc.field_f);
                              var12.a(var12.field_Pb, -16834);
                              var12.field_Pb.field_X = 1;
                              var12.field_Bc = new w(0L, gg.field_G);
                              var12.a(var12.field_Bc, -16834);
                              var12.field_Dc = new w(0L, fc.field_f);
                              var12.a(var12.field_Dc, -16834);
                              var12.field_Dc.field_ub = 0;
                              var12.field_ec = new w(0L, fc.field_f);
                              var12.a(var12.field_ec, -16834);
                              var12.field_ec.field_ub = 0;
                              var12.field_jc = new w(0L, gg.field_G);
                              var12.a(var12.field_jc, -16834);
                              var12.field_jc.field_X = 2;
                              stackOut_16_0 = (ve) (var12);
                              stackOut_16_1 = null;
                              stackOut_16_2 = null;
                              stackOut_16_3 = 0L;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              stackIn_18_2 = stackOut_16_2;
                              stackIn_18_3 = stackOut_16_3;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              stackIn_17_2 = stackOut_16_2;
                              stackIn_17_3 = stackOut_16_3;
                              if (pd.field_a) {
                                stackOut_18_0 = (ve) ((Object) stackIn_18_0);
                                stackOut_18_1 = null;
                                stackOut_18_2 = null;
                                stackOut_18_3 = stackIn_18_3;
                                stackOut_18_4 = fc.field_f;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                stackIn_19_2 = stackOut_18_2;
                                stackIn_19_3 = stackOut_18_3;
                                stackIn_19_4 = stackOut_18_4;
                                break L8;
                              } else {
                                stackOut_17_0 = (ve) ((Object) stackIn_17_0);
                                stackOut_17_1 = null;
                                stackOut_17_2 = null;
                                stackOut_17_3 = stackIn_17_3;
                                stackOut_17_4 = gg.field_G;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                stackIn_19_2 = stackOut_17_2;
                                stackIn_19_3 = stackOut_17_3;
                                stackIn_19_4 = stackOut_17_4;
                                break L8;
                              }
                            }
                            L9: {
                              stackIn_19_0.field_zc = new w(stackIn_19_3, stackIn_19_4);
                              var12.a(var12.field_zc, -16834);
                              var12.field_fc = new w[j.field_b];
                              var12.field_pc = new w(0L, (w) null);
                              if ((var14 & 1 << u.field_f ^ -1) != -1) {
                                var12.field_zc.a(var12.field_pc, -16834);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              var12.field_Ac = new w(0L, (w) null);
                              if (-1 != (var14 & 1 << u.field_b ^ -1)) {
                                var12.field_zc.a(var12.field_Ac, -16834);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              var12.field_Tb = new w(0L, (w) null);
                              if ((1 << rf.field_a & var14 ^ -1) == -1) {
                                break L11;
                              } else {
                                var12.field_zc.a(var12.field_Tb, -16834);
                                break L11;
                              }
                            }
                            L12: {
                              var12.field_Fc = new w(0L, (w) null);
                              if ((1 << ul.field_f & var14 ^ -1) != -1) {
                                var12.field_zc.a(var12.field_Fc, -16834);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var15 = var12.field_pc;
                            var16 = var12.field_Fc;
                            var12.field_Tb.field_W = 1;
                            var17 = var12.field_Ac;
                            var17.field_W = 1;
                            var16.field_W = 1;
                            var15.field_W = 1;
                            var18_int = 0;
                            L13: while (true) {
                              L14: {
                                if ((j.field_b ^ -1) >= (var18_int ^ -1)) {
                                  break L14;
                                } else {
                                  var12.field_fc[var18_int] = new w(0L, (w) null);
                                  stackOut_35_0 = 1 << var18_int + um.field_a & var14 ^ -1;
                                  stackOut_35_1 = -1;
                                  stackIn_16_0 = stackOut_35_0;
                                  stackIn_16_1 = stackOut_35_1;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  if (var41 != 0) {
                                    continue L7;
                                  } else {
                                    L15: {
                                      if (stackIn_36_0 == stackIn_36_1) {
                                        break L15;
                                      } else {
                                        var12.field_zc.a(var12.field_fc[var18_int], -16834);
                                        break L15;
                                      }
                                    }
                                    var12.field_fc[var18_int].field_W = 1;
                                    var18_int++;
                                    if (var41 == 0) {
                                      continue L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              L16: {
                                stackOut_40_0 = (ve) (var12);
                                stackOut_40_1 = null;
                                stackOut_40_2 = null;
                                stackOut_40_3 = 0L;
                                stackIn_43_0 = stackOut_40_0;
                                stackIn_43_1 = stackOut_40_1;
                                stackIn_43_2 = stackOut_40_2;
                                stackIn_43_3 = stackOut_40_3;
                                stackIn_41_0 = stackOut_40_0;
                                stackIn_41_1 = stackOut_40_1;
                                stackIn_41_2 = stackOut_40_2;
                                stackIn_41_3 = stackOut_40_3;
                                if (!pd.field_a) {
                                  stackOut_43_0 = (ve) ((Object) stackIn_43_0);
                                  stackOut_43_1 = null;
                                  stackOut_43_2 = null;
                                  stackOut_43_3 = stackIn_43_3;
                                  stackOut_43_4 = fc.field_f;
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  stackIn_44_2 = stackOut_43_2;
                                  stackIn_44_3 = stackOut_43_3;
                                  stackIn_44_4 = stackOut_43_4;
                                  break L16;
                                } else {
                                  stackOut_41_0 = (ve) ((Object) stackIn_41_0);
                                  stackOut_41_1 = null;
                                  stackOut_41_2 = null;
                                  stackOut_41_3 = stackIn_41_3;
                                  stackOut_41_4 = gg.field_G;
                                  stackIn_44_0 = stackOut_41_0;
                                  stackIn_44_1 = stackOut_41_1;
                                  stackIn_44_2 = stackOut_41_2;
                                  stackIn_44_3 = stackOut_41_3;
                                  stackIn_44_4 = stackOut_41_4;
                                  break L16;
                                }
                              }
                              stackIn_44_0.field_yc = new w(stackIn_44_3, stackIn_44_4);
                              var12.a(var12.field_yc, -16834);
                              var12.field_yc.field_X = 2;
                              var12.field_Sb = new w(0L, gg.field_G);
                              var12.a(var12.field_Sb, -16834);
                              var12.field_Ec = new w(0L, df.field_ab);
                              var12.a(var12.field_Ec, -16834);
                              var12.field_bc = new w(0L, df.field_ab);
                              var12.a(var12.field_bc, -16834);
                              var12.field_sc = new w(0L, ua.field_H);
                              var12.a(var12.field_sc, -16834);
                              var12.d(-69);
                              var12.field_Yb = new w(0L, lj.field_c);
                              var13 = 1;
                              var12.a(var12.field_Yb, -16834);
                              break L6;
                            }
                          }
                        }
                      }
                      L17: {
                        if (var12.field_lc) {
                          stackOut_48_0 = param3;
                          stackIn_49_0 = stackOut_48_0;
                          break L17;
                        } else {
                          stackOut_46_0 = param1;
                          stackIn_49_0 = stackOut_46_0;
                          break L17;
                        }
                      }
                      var14 = stackIn_49_0;
                      var12.field_Pb.field_Y = null;
                      var12.field_Pb.field_N = 0;
                      var15 = var12.field_Pb;
                      var15.field_mb = 0;
                      var12.field_Yb.field_Y = null;
                      var12.field_Yb.field_N = 0;
                      var16 = var12.field_Yb;
                      var16.field_mb = 0;
                      var12.field_Bc.field_Y = null;
                      var12.field_Bc.field_N = 0;
                      var17 = var12.field_Bc;
                      var17.field_mb = 0;
                      var12.field_Dc.field_Y = null;
                      var18 = var12.field_Dc;
                      var12.field_Dc.field_N = 0;
                      var18.field_mb = 0;
                      var12.field_ec.field_Y = null;
                      var19 = var12.field_ec;
                      var12.field_ec.field_N = 0;
                      var19.field_mb = 0;
                      var12.field_jc.field_Y = null;
                      var20 = var12.field_jc;
                      var12.field_jc.field_N = 0;
                      var12.field_zc.field_Y = null;
                      var20.field_mb = 0;
                      var12.field_zc.field_N = 0;
                      var21 = var12.field_zc;
                      var21.field_mb = 0;
                      var22_int = 0;
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (j.field_b <= var22_int) {
                              break L20;
                            } else {
                              var12.field_fc[var22_int].field_I = null;
                              var23 = var12.field_fc[var22_int];
                              var12.field_fc[var22_int].field_N = 0;
                              var23.field_mb = 0;
                              var22_int++;
                              if (var41 != 0) {
                                break L19;
                              } else {
                                if (var41 == 0) {
                                  continue L18;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          var12.field_pc.field_I = null;
                          var12.field_pc.field_N = 0;
                          break L19;
                        }
                        L21: {
                          var22 = var12.field_pc;
                          var22.field_mb = 0;
                          var12.field_Fc.field_I = null;
                          var23 = var12.field_Fc;
                          var12.field_Fc.field_N = 0;
                          var12.field_Ac.field_I = null;
                          var23.field_mb = 0;
                          var24 = var12.field_Ac;
                          var12.field_Ac.field_N = 0;
                          var24.field_mb = 0;
                          var12.field_Tb.field_I = null;
                          var12.field_Tb.field_N = 0;
                          var25 = var12.field_Tb;
                          var25.field_mb = 0;
                          var12.field_yc.field_Y = null;
                          var12.field_yc.field_N = 0;
                          var26 = var12.field_yc;
                          var26.field_mb = 0;
                          var12.field_Sb.field_Y = null;
                          var12.field_Sb.field_N = 0;
                          var27 = var12.field_Sb;
                          var12.field_Ec.field_Y = null;
                          var27.field_mb = 0;
                          var12.field_Ec.field_N = 0;
                          var28 = var12.field_Ec;
                          var28.field_mb = 0;
                          var12.field_bc.field_Y = null;
                          var12.field_bc.field_N = 0;
                          var29 = var12.field_bc;
                          var12.field_sc.field_Y = null;
                          var29.field_mb = 0;
                          var12.field_sc.field_N = 0;
                          var30 = var12.field_sc;
                          var30.field_mb = 0;
                          var12.field_mb = gf.field_c.field_Ob.field_mb;
                          var31 = 0;
                          var32 = var12.field_Vb;
                          if (var12.i((byte) 126)) {
                            break L21;
                          } else {
                            L22: {
                              L23: {
                                if (!var12.field_lc) {
                                  break L23;
                                } else {
                                  L24: {
                                    if ((var12.field_Nb ^ -1) > -1) {
                                      break L24;
                                    } else {
                                      var12.field_Pb.field_Y = uf.field_t;
                                      if (var41 == 0) {
                                        break L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  L25: {
                                    L26: {
                                      if (!var12.field_wc) {
                                        break L26;
                                      } else {
                                        if (var12.field_gc) {
                                          break L25;
                                        } else {
                                          if (var12.field_Zb) {
                                            break L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                    }
                                    L27: {
                                      if (-3 != (var12.field_qc ^ -1)) {
                                        break L27;
                                      } else {
                                        var12.field_Yb.field_Y = gd.field_h;
                                        if (var41 == 0) {
                                          break L22;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12.field_Pb.field_Y = ak.field_i;
                                    if (var41 == 0) {
                                      break L22;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  var12.field_Yb.field_Y = gb.field_ac;
                                  if (var41 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              L28: {
                                L29: {
                                  if (var12.field_gc) {
                                    break L29;
                                  } else {
                                    if (!var12.field_Zb) {
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                                var12.field_Yb.field_Y = gb.field_ac;
                                if (var41 == 0) {
                                  break L22;
                                } else {
                                  break L28;
                                }
                              }
                              L30: {
                                if (!var12.field_Cc) {
                                  break L30;
                                } else {
                                  var12.field_Pb.field_Y = cd.field_l;
                                  if (var41 == 0) {
                                    break L22;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                              var12.field_Pb.field_Y = pc.field_d;
                              break L22;
                            }
                            L31: {
                              L32: {
                                if (null != var12.field_Yb.field_Y) {
                                  break L32;
                                } else {
                                  var12.field_Pb.a(68, 0, var31, kf.field_O, 0);
                                  if (var41 == 0) {
                                    break L31;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              var12.field_Yb.a(68, 0, var31, kf.field_O, 0);
                              break L31;
                            }
                            L33: {
                              var12.field_Bc.field_Y = mm.a(var12.field_Bc.field_J, var32, 78);
                              var12.field_Bc.a(78, 0, var31, kf.field_O, 70);
                              if (!var12.field_Bc.field_jb) {
                                break L33;
                              } else {
                                if (!var12.field_Bc.field_Y.equals(var32)) {
                                  sl.field_g = var32;
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              L35: {
                                var12.field_Dc.field_Y = Integer.toString(var12.field_rc);
                                if (!var12.field_wc) {
                                  break L35;
                                } else {
                                  var12.field_Dc.field_X = 2;
                                  var12.field_ec.field_Y = "/" + var12.field_mc;
                                  var33_int = (-var12.field_ec.field_J.a("/") + 348) / 2;
                                  var12.field_Dc.a(var33_int - 150, 0, var31, kf.field_O, 150);
                                  var12.field_ec.a(198 - var33_int, 0, var31, kf.field_O, var33_int);
                                  if (var41 == 0) {
                                    break L34;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                              var12.field_Dc.field_X = 1;
                              var12.field_Dc.a(48, 0, var31, kf.field_O, 150);
                              break L34;
                            }
                            L36: {
                              var12.field_jc.field_Y = Integer.toString(var12.field_Ub);
                              var12.field_jc.a(48, 0, var31, kf.field_O, 200);
                              if (!pd.field_a) {
                                stackOut_124_0 = 200;
                                stackIn_125_0 = stackOut_124_0;
                                break L36;
                              } else {
                                stackOut_122_0 = 250;
                                stackIn_125_0 = stackOut_122_0;
                                break L36;
                              }
                            }
                            L37: {
                              var33_int = stackIn_125_0;
                              var12.field_zc.a(-2 + (-var33_int + 365), 0, var31, kf.field_O, var33_int);
                              var34_int = j.field_c;
                              if (0 != (var14 & 1 << u.field_f)) {
                                stackOut_128_0 = fj.field_a;
                                stackIn_129_0 = stackOut_128_0;
                                var35 = stackIn_129_0[var12.field_Wb];
                                var12.field_pc.field_I = var35;
                                var12.field_pc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                var34_int = var34_int + (var35.field_K - -j.field_c);
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            L38: while (true) {
                              L39: {
                                if (0 != (var14 & 1 << u.field_b)) {
                                  L40: {
                                    L41: {
                                      if (var12.field_gc) {
                                        break L41;
                                      } else {
                                        if (!var12.field_Zb) {
                                          stackOut_139_0 = 0;
                                          stackIn_140_0 = stackOut_139_0;
                                          break L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                    stackOut_137_0 = 1;
                                    stackIn_140_0 = stackOut_137_0;
                                    break L40;
                                  }
                                  L42: {
                                    var36 = stackIn_140_0;
                                    stackOut_140_0 = (ck[]) (field_x);
                                    stackIn_143_0 = stackOut_140_0;
                                    stackIn_141_0 = stackOut_140_0;
                                    if (var36 == 0) {
                                      stackOut_143_0 = (ck[]) ((Object) stackIn_143_0);
                                      stackOut_143_1 = 0;
                                      stackIn_144_0 = stackOut_143_0;
                                      stackIn_144_1 = stackOut_143_1;
                                      break L42;
                                    } else {
                                      stackOut_141_0 = (ck[]) ((Object) stackIn_141_0);
                                      stackOut_141_1 = 1;
                                      stackIn_144_0 = stackOut_141_0;
                                      stackIn_144_1 = stackOut_141_1;
                                      break L42;
                                    }
                                  }
                                  var35 = stackIn_144_0[stackIn_144_1];
                                  var12.field_Ac.field_I = var35;
                                  var12.field_Ac.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                  var34_int = var34_int + (var35.field_K - -j.field_c);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              L43: {
                                if ((1 << rf.field_a & var14) != 0) {
                                  var35 = bb.field_b[-1 + var12.field_qc];
                                  var12.field_Tb.field_I = var35;
                                  var12.field_Tb.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                  var34_int = var34_int + (j.field_c + var35.field_K);
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                              L44: {
                                if ((1 << ul.field_f & var14 ^ -1) == -1) {
                                  break L44;
                                } else {
                                  L45: {
                                    stackOut_150_0 = si.field_d;
                                    stackIn_155_0 = stackOut_150_0;
                                    stackIn_151_0 = stackOut_150_0;
                                    if (!var12.field_Ic) {
                                      stackOut_155_0 = (ck[]) ((Object) stackIn_155_0);
                                      stackOut_155_1 = 0;
                                      stackIn_156_0 = stackOut_155_0;
                                      stackIn_156_1 = stackOut_155_1;
                                      break L45;
                                    } else {
                                      stackOut_151_0 = (ck[]) ((Object) stackIn_151_0);
                                      stackIn_153_0 = stackOut_151_0;
                                      stackOut_153_0 = (ck[]) ((Object) stackIn_153_0);
                                      stackOut_153_1 = 1;
                                      stackIn_156_0 = stackOut_153_0;
                                      stackIn_156_1 = stackOut_153_1;
                                      break L45;
                                    }
                                  }
                                  var35 = stackIn_156_0[stackIn_156_1];
                                  var12.field_Fc.field_I = var35;
                                  var12.field_Fc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                  var34_int = var34_int + (j.field_c + var35.field_K);
                                  break L44;
                                }
                              }
                              L46: {
                                if (null != be.field_u) {
                                  var36 = 0;
                                  L47: while (true) {
                                    if (j.field_b <= var36) {
                                      break L46;
                                    } else {
                                      stackOut_162_0 = be.field_u[var36];
                                      stackIn_129_0 = stackOut_162_0;
                                      stackIn_163_0 = stackOut_162_0;
                                      if (var41 != 0) {
                                        var35 = stackIn_129_0[var12.field_Wb];
                                        var12.field_pc.field_I = var35;
                                        var12.field_pc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                        var34_int = var34_int + (var35.field_K - -j.field_c);
                                        continue L38;
                                      } else {
                                        L48: {
                                          if (stackIn_163_0 == null) {
                                            break L48;
                                          } else {
                                            if ((var14 & 1 << um.field_a - -var36) == 0) {
                                              break L48;
                                            } else {
                                              var35 = be.field_u[var36][var12.field_kc[var36] & 255];
                                              var12.field_fc[var36].field_I = var35;
                                              var12.field_fc[var36].a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                                              var34_int = var34_int + (var35.field_K + j.field_c);
                                              break L48;
                                            }
                                          }
                                        }
                                        var36++;
                                        if (var41 == 0) {
                                          continue L47;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L46;
                                }
                              }
                              L49: {
                                L50: {
                                  var36 = (-var34_int + var12.field_zc.field_mb) / 2;
                                  if (var36 > 0) {
                                    var12.field_pc.field_vb = var12.field_pc.field_vb + var36;
                                    var12.field_Ac.field_vb = var12.field_Ac.field_vb + var36;
                                    var12.field_Tb.field_vb = var12.field_Tb.field_vb + var36;
                                    var12.field_Fc.field_vb = var12.field_Fc.field_vb + var36;
                                    var37_int = 0;
                                    L51: while (true) {
                                      if ((j.field_b ^ -1) >= (var37_int ^ -1)) {
                                        break L50;
                                      } else {
                                        var12.field_fc[var37_int].field_vb = var12.field_fc[var37_int].field_vb + var36;
                                        var37_int++;
                                        if (var41 != 0) {
                                          break L49;
                                        } else {
                                          if (var41 == 0) {
                                            continue L51;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L50;
                                  }
                                }
                                L52: {
                                  if (!var12.field_lc) {
                                    break L52;
                                  } else {
                                    L53: {
                                      var37_int = var12.field_Nb;
                                      if (-1 < (var37_int ^ -1)) {
                                        var37_int = (int)(var9 + -var12.field_tc);
                                        break L53;
                                      } else {
                                        break L53;
                                      }
                                    }
                                    L54: {
                                      var38_int = var37_int / 1000;
                                      var39 = var38_int / 60;
                                      var38_int = var38_int % 60;
                                      if ((var39 ^ -1) > -61) {
                                        break L54;
                                      } else {
                                        var40 = var39 / 60;
                                        var39 = var39 % 60;
                                        var12.field_yc.field_Y = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                                        if (var41 == 0) {
                                          break L52;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    var12.field_yc.field_Y = var39 + ":" + var38_int / 10 + var38_int % 10;
                                    break L52;
                                  }
                                }
                                var12.field_yc.a(var12.field_mb + -365, 0, var31, kf.field_O, 365);
                                var31 = var31 + kf.field_O;
                                break L49;
                              }
                              L55: {
                                if (null == var12.field_xc) {
                                  break L55;
                                } else {
                                  var31 += 2;
                                  var37 = new StringBuilder(64);
                                  discarded$4 = var37.append(jg.field_c);
                                  discarded$5 = var37.append(var12.field_xc[0]);
                                  var38_int = 1;
                                  L56: while (true) {
                                    L57: {
                                      if (var38_int >= var12.field_rc) {
                                        break L57;
                                      } else {
                                        discarded$6 = var37.append(", ");
                                        discarded$7 = var37.append(var12.field_xc[var38_int]);
                                        var38_int++;
                                        if (var41 != 0) {
                                          break L55;
                                        } else {
                                          if (var41 == 0) {
                                            continue L56;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                    }
                                    var38 = var37.toString();
                                    var12.field_Sb.field_Y = var38;
                                    var39 = var12.field_Sb.field_J.a(var38, var12.field_mb + -(2 * var12.field_Sb.field_ub));
                                    var12.field_Sb.a(var12.field_mb, 0, var31, var39 * kf.field_O, 0);
                                    var31 = var31 + kf.field_O * var39;
                                    break L55;
                                  }
                                }
                              }
                              L58: {
                                if (var12.field_Zb) {
                                  var12.field_Ec.field_Y = cm.a((byte) 121, li.field_g, new String[]{var32});
                                  var12.field_Ec.a(-(2 * nk.field_b) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                                  var31 = var31 + kf.field_O;
                                  break L58;
                                } else {
                                  break L58;
                                }
                              }
                              if (var12.field_Ob) {
                                var12.field_bc.field_Y = cm.a((byte) 106, qe.field_b, new String[]{var32});
                                var12.field_bc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                                var31 = var31 + kf.field_O;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        L59: {
                          var33 = vk.a(var32, var12.field_oc, true);
                          if (var33 != null) {
                            var34_int = var12.field_sc.field_J.a(var33, -nk.field_b + (var12.field_mb - nk.field_b));
                            var12.field_sc.field_wb = var12.field_Rb * 256 / oa.field_a;
                            var12.field_sc.field_Y = var33;
                            var12.field_sc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, var34_int * kf.field_O, nk.field_b);
                            var31 = var31 + kf.field_O * var34_int;
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        L60: {
                          if (var7_int != 0) {
                            break L60;
                          } else {
                            var12.field_F = var31 - var12.field_N;
                            break L60;
                          }
                        }
                        L61: {
                          if (var13 != 0) {
                            gf.field_c.field_Ob.a((w) (var11), var12, 2, 0);
                            break L61;
                          } else {
                            break L61;
                          }
                        }
                        var34_int = 0;
                        L62: while (true) {
                          L63: {
                            L64: {
                              if ((var34_int ^ -1) <= (j.field_b ^ -1)) {
                                break L64;
                              } else {
                                stackOut_217_0 = var12.field_fc[var34_int].field_jb;
                                stackIn_238_0 = stackOut_217_0;
                                stackIn_218_0 = stackOut_217_0;
                                if (var41 != 0) {
                                  break L63;
                                } else {
                                  L65: {
                                    if (!stackIn_218_0) {
                                      break L65;
                                    } else {
                                      L66: {
                                        if (hb.field_Qb != null) {
                                          if (null == hb.field_Qb[var34_int]) {
                                            stackOut_229_0 = null;
                                            stackIn_230_0 = (String) ((Object) stackOut_229_0);
                                            break L66;
                                          } else {
                                            stackOut_227_0 = hb.field_Qb[var34_int][var12.field_kc[var34_int] & 255];
                                            stackIn_230_0 = stackOut_227_0;
                                            break L66;
                                          }
                                        } else {
                                          stackOut_224_0 = null;
                                          stackIn_230_0 = (String) ((Object) stackOut_224_0);
                                          break L66;
                                        }
                                      }
                                      L67: {
                                        var35_ref = stackIn_230_0;
                                        if (var35_ref == null) {
                                          break L67;
                                        } else {
                                          sl.field_g = pa.field_db[var34_int] + " - " + var35_ref;
                                          if (var41 == 0) {
                                            break L65;
                                          } else {
                                            break L67;
                                          }
                                        }
                                      }
                                      sl.field_g = pa.field_db[var34_int];
                                      break L65;
                                    }
                                  }
                                  var34_int++;
                                  if (var41 == 0) {
                                    continue L62;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                            }
                            stackOut_237_0 = var12.field_pc.field_jb;
                            stackIn_238_0 = stackOut_237_0;
                            break L63;
                          }
                          L68: {
                            if (stackIn_238_0) {
                              L69: {
                                if ((var12.field_Wb ^ -1) != -2) {
                                  var34 = ed.field_b[var12.field_Wb];
                                  break L69;
                                } else {
                                  var34 = bh.field_j;
                                  break L69;
                                }
                              }
                              sl.field_g = hl.field_c + " - " + var34;
                              break L68;
                            } else {
                              break L68;
                            }
                          }
                          L70: {
                            if (!var12.field_Fc.field_jb) {
                              break L70;
                            } else {
                              L71: {
                                if (var12.field_Ic) {
                                  stackOut_250_0 = cl.field_s;
                                  stackIn_251_0 = stackOut_250_0;
                                  break L71;
                                } else {
                                  stackOut_248_0 = si.field_k;
                                  stackIn_251_0 = stackOut_248_0;
                                  break L71;
                                }
                              }
                              sl.field_g = stackIn_251_0;
                              break L70;
                            }
                          }
                          L72: {
                            if (!var12.field_Ac.field_jb) {
                              break L72;
                            } else {
                              L73: {
                                L74: {
                                  if (var12.field_gc) {
                                    break L74;
                                  } else {
                                    if (!var12.field_Zb) {
                                      if (!var12.field_wc) {
                                        stackOut_264_0 = ec.field_b;
                                        stackIn_265_0 = stackOut_264_0;
                                        break L73;
                                      } else {
                                        stackOut_262_0 = bh.field_c;
                                        stackIn_265_0 = stackOut_262_0;
                                        break L73;
                                      }
                                    } else {
                                      break L74;
                                    }
                                  }
                                }
                                stackOut_259_0 = wa.field_f;
                                stackIn_265_0 = stackOut_259_0;
                                break L73;
                              }
                              sl.field_g = stackIn_265_0;
                              break L72;
                            }
                          }
                          L75: {
                            if (var12.field_Tb.field_jb) {
                              L76: {
                                if (var12.field_qc != 2) {
                                  stackOut_272_0 = bc.field_F;
                                  stackIn_273_0 = stackOut_272_0;
                                  break L76;
                                } else {
                                  stackOut_270_0 = tl.field_r;
                                  stackIn_273_0 = stackOut_270_0;
                                  break L76;
                                }
                              }
                              sl.field_g = stackIn_273_0;
                              break L75;
                            } else {
                              break L75;
                            }
                          }
                          L77: {
                            if ((var12.field_ob ^ -1) == -1) {
                              break L77;
                            } else {
                              if (!var12.i((byte) 100)) {
                                L78: {
                                  if (-1 == (var12.field_Yb.field_ob ^ -1)) {
                                    break L78;
                                  } else {
                                    L79: {
                                      L80: {
                                        if (!var12.field_lc) {
                                          break L80;
                                        } else {
                                          if (!var12.field_wc) {
                                            break L79;
                                          } else {
                                            if (var12.field_gc) {
                                              break L80;
                                            } else {
                                              if (!var12.field_Zb) {
                                                break L79;
                                              } else {
                                                break L80;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      cg.a(var12.e(-36), (byte) -9, param5);
                                      if (var41 == 0) {
                                        break L77;
                                      } else {
                                        break L79;
                                      }
                                    }
                                    ga.a(false, var12.e(-87), param5);
                                    if (var41 == 0) {
                                      break L77;
                                    } else {
                                      break L78;
                                    }
                                  }
                                }
                                hd.a(0, param4, var12, var32);
                                break L77;
                              } else {
                                break L77;
                              }
                            }
                          }
                          var12 = (ve) ((Object) var8.d(true));
                          if (var41 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "client.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final boolean n(int param0) {
        ck[] dupTemp$8 = null;
        ck[] dupTemp$9 = null;
        ck[] dupTemp$10 = null;
        ck[] dupTemp$11 = null;
        ck[] dupTemp$12 = null;
        ck[] dupTemp$13 = null;
        ck[] dupTemp$14 = null;
        ck[] dupTemp$15 = null;
        RuntimeException var2 = null;
        je var2_ref = null;
        pi[] var2_array = null;
        byte[] var3 = null;
        pi[] var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        ck var6 = null;
        pi var7 = null;
        ck[] var7_array = null;
        byte[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        ck[] var10 = null;
        ck var10_ref = null;
        int var11_int = 0;
        ck[][] var11 = null;
        int var12_int = 0;
        ck var12 = null;
        ck[][] var12_array = null;
        pi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_108_0 = 0;
        byte[] stackIn_111_0 = null;
        byte[] stackIn_113_0 = null;
        int stackIn_126_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_143_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_107_0 = 0;
        byte[] stackOut_110_0 = null;
        byte[] stackOut_112_0 = null;
        int stackOut_125_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_142_0 = 0;
        var20 = field_A ? 1 : 0;
        try {
          L0: {
            if (null != jj.field_c) {
              fh.b((byte) -123);
              qi.a(65.0f, param0 + 98, rf.field_p);
              this.d(320);
              ka.field_N = new pl(jj.field_c, ah.field_d);
              pg.field_d = ka.field_N.a("", "fruit_step", param0 ^ 0);
              field_F = ka.field_N.a("", "cooked_fruit_step", 0);
              ib.field_ob = ka.field_N.a("", "db_loose_shape_rotate", 0);
              bj.field_e = ka.field_N.a("", "db_loose_shape_land_squish", 0);
              fh.field_c = ka.field_N.a("", "db_group_shape_land", 0);
              hm.field_d = ka.field_N.a("", "fruit_move", 0);
              wd.field_c = ka.field_N.a("", "db_loose_tiles_pop", 0);
              sa.field_w = ka.field_N.a("", "db_solid_tiles_pop2", 0);
              jm.field_v[0] = ka.field_N.a("", "db_combo_1", 0);
              jm.field_v[1] = ka.field_N.a("", "db_combo_2", param0 + 0);
              jm.field_v[2] = ka.field_N.a("", "db_combo_3", qm.b(param0, 0));
              jm.field_v[3] = ka.field_N.a("", "db_combo_4", qm.b(param0, 0));
              bf.field_w = ka.field_N.a("", "db_simultaneous_bonus2", 0);
              ob.field_n = ka.field_N.a((byte) 101, "", "db_loose_drill");
              fj.field_k = ka.field_N.a((byte) 101, "", "db_bucket_water_capsule2");
              pk.field_q = ka.field_N.a("", "db_quake", param0 ^ 0);
              ee.field_g = ka.field_N.a("", "db_special_item_explode", param0 ^ 0);
              var2_ref = new je(22050, 11025);
              pk.field_q = pk.field_q.a(var2_ref);
              ee.field_g = ee.field_g.a(var2_ref);
              w.field_Eb = ka.field_N.a("", "db_poison", param0 ^ 0);
              qa.field_s = ka.field_N.a("", "db_glass_lower", 0);
              ha.field_Pb[2] = ka.field_N.a("", "db_bucket_glass_crack2_2", param0 + 0);
              ha.field_Pb[1] = ka.field_N.a("", "db_bucket_glass_crack3", param0 + 0);
              ha.field_Pb[0] = ka.field_N.a((byte) 101, "", "db_bucket_glass_explode");
              ie.field_e = ka.field_N.a("", "db_bucket_explode", 0);
              jg.field_j = ka.field_N.a("", "db_bucket_debris", 0);
              bf.field_u = ka.field_N.a("", "db_loose_shape_fall_looped", 0);
              rc.field_i = ka.field_N.a("", "db_loose_shape_fall_quake_looped", 0);
              ak.field_b = ka.field_N.a("", "db_suck_into_machine", 0);
              kf.field_P = ka.field_N.a("", "microwave_motor_2", 0);
              ul.field_i = ka.field_N.a("", "db_shape_out_of_machine2", param0 ^ 0);
              ig.field_ac = ka.field_N.a("", "db_last_shape_out", 0);
              jj.field_c = null;
              ah.field_d = null;
              vj.a(true);
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (wg.field_h != null) {
                qi.a(75.0f, -96, v.field_b);
                this.d(320);
                jg.field_a = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Titlescreen");
                sb.field_u[0][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_NORMAL");
                sb.field_u[0][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_PANIC");
                sb.field_u[0][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_REALLY_PANIC");
                sb.field_u[0][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Ant_and_Deko_remix_FINISH_THEM");
                sb.field_u[1][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_NORMAL");
                sb.field_u[1][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_PANIC");
                sb.field_u[1][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_REALLY_PANIC");
                sb.field_u[1][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Art_Deko_remix_FINISH_THEM");
                sb.field_u[2][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_NORMAL");
                sb.field_u[2][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_PANIC");
                sb.field_u[2][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_REALLY_PANIC");
                sb.field_u[2][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Bokonosis!_remix_FINISH_THEM");
                sb.field_u[6][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_NORMAL");
                sb.field_u[6][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_PANIC");
                sb.field_u[6][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_REALLY_PANIC");
                sb.field_u[6][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko_Rating_remix_FINISH_THEM");
                sb.field_u[7][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_NORMAL");
                sb.field_u[7][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_PANIC");
                sb.field_u[7][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_REALLY_PANIC");
                sb.field_u[7][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/double_deko_FINISH_THEM");
                sb.field_u[4][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_NORMAL");
                sb.field_u[4][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_PANIC");
                sb.field_u[4][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_REALLY_PANIC");
                sb.field_u[4][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/making_connections_remix_FINISH_THEM");
                sb.field_u[3][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_NORMAL");
                sb.field_u[3][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_PANIC");
                sb.field_u[3][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_REALLY_PANIC");
                sb.field_u[3][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Oh No Boko!_remix_FINISH_THEM");
                sb.field_u[5][0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_NORMAL");
                sb.field_u[5][1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_PANIC");
                sb.field_u[5][2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_REALLY_PANIC");
                sb.field_u[5][3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/Swab the Deks!_remix_FINISH_THEM");
                ee.field_a[0] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_NORMAL");
                ee.field_a[1] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_PANIC");
                ee.field_a[2] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_REALLY_PANIC");
                ee.field_a[3] = oh.a(wg.field_h, 91, "", ka.field_N, "music/momentum_remix_FINISH_THEM");
                hb.field_Ub = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Win");
                rm.field_b = oh.a(wg.field_h, 91, "", ka.field_N, "music/Deko Bloko Game Lose");
                wg.field_h = null;
                vj.a(true);
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (null != ph.field_Db) {
                  qi.a(90.0f, 96, vd.field_o);
                  this.d(320);
                  se.field_S = cd.a("", qc.field_vb, ah.field_i, (byte) 108, "arial13");
                  var2_array = t.a("", ah.field_i, false, "arialbold14");
                  var3 = qc.field_vb.a(0, "", "arialbold14");
                  w.field_kb = gg.a(var2_array, 55, var3);
                  km.field_A = ge.a((byte) -49, 16777215, 1, var2_array, var3, 1);
                  var4 = t.a("tinybloko", ii.field_t, false, "");
                  var5 = ph.field_Db.a(param0 ^ 0, "tinybloko", "");
                  in.field_n = gg.a(var4, param0 ^ 111, var5);
                  var6_int = 0;
                  L1: while (true) {
                    stackOut_15_0 = var4.length ^ -1;
                    stackIn_16_0 = stackOut_15_0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (stackIn_16_0 >= (var6_int ^ -1)) {
                            break L4;
                          } else {
                            var7 = var4[var6_int];
                            var8 = new byte[4 * (var7.field_i * var7.field_b)];
                            stackOut_17_0 = 0;
                            stackIn_31_0 = stackOut_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var20 != 0) {
                              break L3;
                            } else {
                              var9_int = stackIn_18_0;
                              L5: while (true) {
                                L6: {
                                  if (var9_int >= var7.field_i) {
                                    break L6;
                                  } else {
                                    stackOut_20_0 = 0;
                                    stackIn_16_0 = stackOut_20_0;
                                    stackIn_21_0 = stackOut_20_0;
                                    if (var20 != 0) {
                                      continue L2;
                                    } else {
                                      var10_int = stackIn_21_0;
                                      L7: while (true) {
                                        L8: {
                                          L9: {
                                            if (var7.field_b <= var10_int) {
                                              break L9;
                                            } else {
                                              var11_int = var7.field_k[var7.field_b * var9_int + var10_int];
                                              var12_int = 2 * var10_int + 4 * var7.field_b * var9_int;
                                              var8[var12_int] = (byte) var11_int;
                                              var8[1 + var12_int] = (byte) var11_int;
                                              var8[var12_int + 2 * var7.field_b] = (byte) var11_int;
                                              var8[var7.field_b * 2 + var12_int - -1] = (byte) var11_int;
                                              var10_int++;
                                              if (var20 != 0) {
                                                break L8;
                                              } else {
                                                if (var20 == 0) {
                                                  continue L7;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                          }
                                          var9_int++;
                                          break L8;
                                        }
                                        if (var20 == 0) {
                                          continue L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7.field_d = var7.field_d * 2;
                                var7.field_g = var7.field_g * 2;
                                var7.field_a = var7.field_a * 2;
                                var7.field_b = var7.field_b * 2;
                                var7.field_i = var7.field_i * 2;
                                var7.field_k = var8;
                                var7.field_c = var7.field_c * 2;
                                var6_int++;
                                if (var20 == 0) {
                                  continue L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        break L3;
                      }
                      var6_int = stackIn_31_0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if ((var6_int ^ -1) <= (var5.length ^ -1)) {
                              break L12;
                            } else {
                              var5[var6_int] = (byte)(var5[var6_int] * 2);
                              var6_int++;
                              if (var20 != 0) {
                                break L11;
                              } else {
                                if (var20 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          a.field_t = gg.a(var4, param0 ^ 103, var5);
                          eh.field_j = ge.a((byte) 100, 16694016, 2, var4, var5, 1);
                          eh.field_j.field_X[1] = new int[]{0, 16777215, 1};
                          break L11;
                        }
                        var6_int = 0;
                        L13: while (true) {
                          stackOut_39_0 = var6_int ^ -1;
                          stackIn_40_0 = stackOut_39_0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (stackIn_40_0 <= (var4.length ^ -1)) {
                                  break L16;
                                } else {
                                  var7 = var4[var6_int];
                                  var8 = new byte[var7.field_b * var7.field_i * 9 / 4];
                                  stackOut_41_0 = 0;
                                  stackIn_55_0 = stackOut_41_0;
                                  stackIn_42_0 = stackOut_41_0;
                                  if (var20 != 0) {
                                    break L15;
                                  } else {
                                    var9_int = stackIn_42_0;
                                    L17: while (true) {
                                      L18: {
                                        if ((var7.field_i ^ -1) >= (var9_int ^ -1)) {
                                          break L18;
                                        } else {
                                          stackOut_44_0 = 0;
                                          stackIn_40_0 = stackOut_44_0;
                                          stackIn_45_0 = stackOut_44_0;
                                          if (var20 != 0) {
                                            continue L14;
                                          } else {
                                            var10_int = stackIn_45_0;
                                            L19: while (true) {
                                              L20: {
                                                L21: {
                                                  if (var10_int >= var7.field_b) {
                                                    break L21;
                                                  } else {
                                                    var11_int = var7.field_k[var10_int + var7.field_b * var9_int];
                                                    var12_int = var7.field_b * (var9_int * 9) / 4 + 3 * var10_int / 2;
                                                    var8[var12_int] = (byte) var11_int;
                                                    var8[1 + var12_int] = (byte) var11_int;
                                                    var8[2 + var12_int] = (byte) var11_int;
                                                    var8[var12_int - -(3 * var7.field_b / 2)] = (byte) var11_int;
                                                    var8[1 + var12_int + var7.field_b * 3 / 2] = (byte) var11_int;
                                                    var8[2 + (var12_int - -(3 * var7.field_b / 2))] = (byte) var11_int;
                                                    var8[var12_int + 3 * var7.field_b] = (byte) var11_int;
                                                    var8[var12_int - -(3 * var7.field_b) - -1] = (byte) var11_int;
                                                    var8[var12_int + (3 * var7.field_b + 2)] = (byte) var11_int;
                                                    var10_int += 2;
                                                    if (var20 != 0) {
                                                      break L20;
                                                    } else {
                                                      if (var20 == 0) {
                                                        continue L19;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                }
                                                var9_int += 2;
                                                break L20;
                                              }
                                              if (var20 == 0) {
                                                continue L17;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var7.field_d = 3 * var7.field_d / 2;
                                      var7.field_i = var7.field_i * 3 / 2;
                                      var7.field_k = var8;
                                      var7.field_c = var7.field_c * 3 / 2;
                                      var7.field_g = var7.field_g * 3 / 2;
                                      var7.field_b = var7.field_b * 3 / 2;
                                      var7.field_a = var7.field_a * 3 / 2;
                                      var6_int++;
                                      if (var20 == 0) {
                                        continue L13;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_54_0 = 0;
                              stackIn_55_0 = stackOut_54_0;
                              break L15;
                            }
                            var6_int = stackIn_55_0;
                            L22: while (true) {
                              L23: {
                                L24: {
                                  if ((var5.length ^ -1) >= (var6_int ^ -1)) {
                                    break L24;
                                  } else {
                                    var5[var6_int] = (byte)(var5[var6_int] * 3 / 2);
                                    var6_int++;
                                    if (var20 != 0) {
                                      break L23;
                                    } else {
                                      if (var20 == 0) {
                                        continue L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                hn.field_g = gg.a(var4, 121, var5);
                                a.field_n = db.a("ui_frame_vbrick", "ui_frame_hbrick", ii.field_t, true, "ui_frame_corner");
                                on.field_e = ek.a("ui_button_up", "", param0 ^ -95, ii.field_t);
                                im.field_i = ek.a("ui_button_highlight", "", -114, ii.field_t);
                                ce.field_s = bj.a(112, ii.field_t, "", "chat_toggle_button");
                                gd.field_g = bj.a(112, ii.field_t, "", "chat_toggle_button_highlight");
                                vg.field_h = id.a(ah.field_i, "unachieved", "basic", 8192);
                                wg.field_c = id.a(ah.field_i, "locked", "basic", param0 + 8192);
                                db.field_f = new ck(32, 32);
                                db.field_f.a();
                                vg.field_h.a(0, 0, 32, 32);
                                gf.field_a = new ck(32, 32);
                                gf.field_a.a();
                                wg.field_c.a(0, 0, 32, 32);
                                le.field_m.a((byte) -84);
                                break L23;
                              }
                              var6 = id.a(ah.field_i, "orbcoin", "basic", 8192);
                              rn.field_c = new ck(20, 20);
                              rn.field_c.a();
                              var6.a(0, 0, 20, 20);
                              le.field_m.a((byte) -106);
                              var6 = null;
                              gf.field_f = t.a("solid_mask", ii.field_t, false, "");
                              oa.field_b = bj.a(112, ii.field_t, "", "pop");
                              qf.field_h = si.a(param0 ^ 25972, false, bj.a(112, ii.field_t, "", "explode"), false);
                              qm.field_c = me.a(id.a(ii.field_t, "wildcard", "", 8192), false, (byte) -28, false);
                              kd.field_t = qm.field_c.c();
                              var7_array = bj.a(112, ii.field_t, "", "specialitems");
                              var8_int = 0;
                              L25: while (true) {
                                L26: {
                                  L27: {
                                    if (-7 >= (var8_int ^ -1)) {
                                      break L27;
                                    } else {
                                      stackOut_64_0 = 0;
                                      stackIn_74_0 = stackOut_64_0;
                                      stackIn_65_0 = stackOut_64_0;
                                      if (var20 != 0) {
                                        break L26;
                                      } else {
                                        var9_int = stackIn_65_0;
                                        L28: while (true) {
                                          L29: {
                                            L30: {
                                              if (4 <= var9_int) {
                                                break L30;
                                              } else {
                                                ik.field_b[var8_int][var9_int] = me.a(var7_array[var8_int * 4 - -var9_int], false, (byte) -55, false);
                                                var9_int++;
                                                if (var20 != 0) {
                                                  break L29;
                                                } else {
                                                  if (var20 == 0) {
                                                    continue L28;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                            }
                                            var8_int++;
                                            break L29;
                                          }
                                          if (var20 == 0) {
                                            continue L25;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_73_0 = 0;
                                  stackIn_74_0 = stackOut_73_0;
                                  break L26;
                                }
                                var8_int = stackIn_74_0;
                                L31: while (true) {
                                  stackOut_75_0 = var8_int ^ -1;
                                  stackIn_76_0 = stackOut_75_0;
                                  L32: while (true) {
                                    L33: {
                                      L34: {
                                        if (stackIn_76_0 <= -9) {
                                          break L34;
                                        } else {
                                          var7_array = bj.a(param0 + 112, ii.field_t, "", ri.field_f[var8_int] + "_tiles");
                                          stackOut_77_0 = 0;
                                          stackIn_108_0 = stackOut_77_0;
                                          stackIn_78_0 = stackOut_77_0;
                                          if (var20 != 0) {
                                            break L33;
                                          } else {
                                            var9_int = stackIn_78_0;
                                            L35: while (true) {
                                              L36: {
                                                L37: {
                                                  if (7 <= var9_int) {
                                                    break L37;
                                                  } else {
                                                    fb.field_c[var8_int][var9_int] = me.a(var7_array[var9_int], false, (byte) -63, false);
                                                    var9_int++;
                                                    if (var20 != 0) {
                                                      break L36;
                                                    } else {
                                                      if (var20 == 0) {
                                                        continue L35;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                                fb.field_c[var8_int][7] = kd.field_t;
                                                break L36;
                                              }
                                              var9_int = 0;
                                              L38: while (true) {
                                                stackOut_86_0 = -8;
                                                stackIn_87_0 = stackOut_86_0;
                                                L39: while (true) {
                                                  L40: {
                                                    if (stackIn_87_0 >= (var9_int ^ -1)) {
                                                      break L40;
                                                    } else {
                                                      var10_ref = me.a(var7_array[var9_int + 7], true, (byte) -124, true);
                                                      stackOut_88_0 = 0;
                                                      stackIn_76_0 = stackOut_88_0;
                                                      stackIn_89_0 = stackOut_88_0;
                                                      if (var20 != 0) {
                                                        continue L32;
                                                      } else {
                                                        var11_int = stackIn_89_0;
                                                        L41: while (true) {
                                                          stackOut_90_0 = -17;
                                                          stackOut_90_1 = var11_int ^ -1;
                                                          stackIn_91_0 = stackOut_90_0;
                                                          stackIn_91_1 = stackOut_90_1;
                                                          L42: while (true) {
                                                            L43: {
                                                              if (stackIn_91_0 >= stackIn_91_1) {
                                                                break L43;
                                                              } else {
                                                                var12 = var10_ref.c();
                                                                var12.a();
                                                                fb.field_c[var8_int][var9_int].b(6, 6, 24, 24);
                                                                var10_ref.c(0, 0, 128);
                                                                var13 = gf.field_f[var11_int];
                                                                stackOut_92_0 = 0;
                                                                stackIn_87_0 = stackOut_92_0;
                                                                stackIn_93_0 = stackOut_92_0;
                                                                if (var20 != 0) {
                                                                  continue L39;
                                                                } else {
                                                                  var14 = stackIn_93_0;
                                                                  L44: while (true) {
                                                                    L45: {
                                                                      if (1296 <= var14) {
                                                                        break L45;
                                                                      } else {
                                                                        var15 = var13.field_l[var13.field_k[var14] & 255] & 255;
                                                                        var16 = var12.field_D[var14];
                                                                        stackOut_95_0 = var15;
                                                                        stackOut_95_1 = 128;
                                                                        stackIn_91_0 = stackOut_95_0;
                                                                        stackIn_91_1 = stackOut_95_1;
                                                                        stackIn_96_0 = stackOut_95_0;
                                                                        stackIn_96_1 = stackOut_95_1;
                                                                        if (var20 != 0) {
                                                                          continue L42;
                                                                        } else {
                                                                          L46: {
                                                                            L47: {
                                                                              if (stackIn_96_0 <= stackIn_96_1) {
                                                                                break L47;
                                                                              } else {
                                                                                var17 = 131586 * (var15 - 128);
                                                                                var18 = var16;
                                                                                var19 = var18 + var17;
                                                                                var17 = (16711935 & var18) + (16711935 & var17);
                                                                                var18 = (-var17 + var19 & 65536) + (16777472 & var17);
                                                                                var16 = var19 - var18 | var18 + -(var18 >>> -74352984);
                                                                                if (var20 == 0) {
                                                                                  break L46;
                                                                                } else {
                                                                                  break L47;
                                                                                }
                                                                              }
                                                                            }
                                                                            var16 = ((var16 & 16711935) * var15 >> 1802741479 & 16711935) + (((65280 & var16) * var15 & 8355876) >> -816570233);
                                                                            break L46;
                                                                          }
                                                                          L48: {
                                                                            if (var16 == 0) {
                                                                              var16 = 1;
                                                                              break L48;
                                                                            } else {
                                                                              break L48;
                                                                            }
                                                                          }
                                                                          var12.field_D[var14] = var16;
                                                                          var14++;
                                                                          if (var20 == 0) {
                                                                            continue L44;
                                                                          } else {
                                                                            break L45;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    ob.field_j[var8_int][var9_int][var11_int] = var12;
                                                                    var11_int++;
                                                                    if (var20 == 0) {
                                                                      continue L41;
                                                                    } else {
                                                                      break L43;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var9_int++;
                                                            if (var20 == 0) {
                                                              continue L38;
                                                            } else {
                                                              break L40;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  s.field_Qb[var8_int] = id.a(ii.field_t, ri.field_f[var8_int] + "_bucketback", "", 8192);
                                                  s.field_Qb[var8_int].b();
                                                  var8_int++;
                                                  if (var20 == 0) {
                                                    continue L31;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      le.field_m.a((byte) -114);
                                      stackOut_107_0 = 0;
                                      stackIn_108_0 = stackOut_107_0;
                                      break L33;
                                    }
                                    var8_int = stackIn_108_0;
                                    L49: while (true) {
                                      L50: {
                                        L51: {
                                          if (8 <= var8_int) {
                                            break L51;
                                          } else {
                                            stackOut_110_0 = eg.field_e.a(param0 + 0, "", ri.field_f[var8_int] + ".jpg");
                                            stackIn_113_0 = stackOut_110_0;
                                            stackIn_111_0 = stackOut_110_0;
                                            if (var20 != 0) {
                                              break L50;
                                            } else {
                                              var9 = stackIn_111_0;
                                              dn.field_p[var8_int] = new ck(var9, (java.awt.Component) ((Object) jh.field_b));
                                              var8_int++;
                                              if (var20 == 0) {
                                                continue L49;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_112_0 = eg.field_e.a(param0 + 0, "", "menu2.jpg");
                                        stackIn_113_0 = stackOut_112_0;
                                        break L50;
                                      }
                                      var8 = stackIn_113_0;
                                      tc.field_Tb = new ck(var8, (java.awt.Component) ((Object) jh.field_b));
                                      var9 = eg.field_e.a(0, "", "achievements.jpg");
                                      uf.field_y = fc.a(31, new ck(var9, (java.awt.Component) ((Object) jh.field_b)), -10241);
                                      var10 = bj.a(112, ii.field_t, "", "achievements");
                                      var11_int = 0;
                                      L52: while (true) {
                                        L53: {
                                          if (-32 >= (var11_int ^ -1)) {
                                            break L53;
                                          } else {
                                            var10[var11_int].b();
                                            mg.a(0, var10[var11_int], uf.field_y[var11_int]);
                                            var10[var11_int] = null;
                                            var11_int++;
                                            if (var20 == 0) {
                                              continue L52;
                                            } else {
                                              break L53;
                                            }
                                          }
                                        }
                                        var10 = null;
                                        tl.field_w = new ck[31];
                                        var11_int = 0;
                                        L54: while (true) {
                                          L55: {
                                            L56: {
                                              if (-32 >= (var11_int ^ -1)) {
                                                break L56;
                                              } else {
                                                tl.field_w[var11_int] = new ck(32, 32);
                                                tl.field_w[var11_int].a();
                                                uf.field_y[var11_int].a(0, 0, 32, 32);
                                                var11_int++;
                                                if (var20 != 0) {
                                                  break L55;
                                                } else {
                                                  if (var20 == 0) {
                                                    continue L54;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                            }
                                            le.field_m.a((byte) -108);
                                            pg.field_e = id.a(ii.field_t, "ui_clouds", "", 8192);
                                            dk.field_h = id.a(ii.field_t, "ui_border_tl", "", 8192);
                                            jh.field_d = id.a(ii.field_t, "ui_border_t", "", 8192);
                                            sk.field_g = id.a(ii.field_t, "ui_border_tr", "", 8192);
                                            fl.field_f = id.a(ii.field_t, "ui_border_l", "", param0 ^ 8192);
                                            wm.field_n = id.a(ii.field_t, "ui_border_r", "", 8192);
                                            vg.field_x = id.a(ii.field_t, "ui_border_bl", "", 8192);
                                            pg.field_f = id.a(ii.field_t, "ui_border_b", "", 8192);
                                            wc.field_r = id.a(ii.field_t, "ui_border_br", "", param0 ^ 8192);
                                            wk.field_l = id.a(ii.field_t, "ui_menu_title", "", 8192);
                                            ve.field_dc = id.a(ii.field_t, "ui_lobby_logo", "", 8192);
                                            ij.field_d = mg.a(16776192, 16743168, ul.field_b, in.field_n, 6, 0, (byte) 107);
                                            wh.field_f = mg.a(16776192, 16743168, ak.field_e, in.field_n, 6, 0, (byte) 120);
                                            field_C[0] = mg.a(16776192, 16743168, mf.field_P, in.field_n, 6, 0, (byte) 120);
                                            field_C[1] = mg.a(16776192, 16743168, qf.field_k, in.field_n, 6, 0, (byte) 114);
                                            field_C[2] = mg.a(16776192, 16743168, ad.field_z, in.field_n, 6, 0, (byte) 104);
                                            ng.field_b = mg.a(16776192, 16743168, de.field_P, in.field_n, 6, 0, (byte) 102);
                                            l.field_j = mg.a(16776192, 16743168, im.field_g, in.field_n, 6, 0, (byte) 99);
                                            ad.field_g = mg.a(16776192, 16743168, u.field_g, in.field_n, 6, 0, (byte) 88);
                                            ve.field_uc[0] = bj.a(112, ii.field_t, "", "fruit_buckettop");
                                            uj.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_lefttex"), true);
                                            bb.field_a[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_leftsidetex"), true);
                                            cc.field_f[0] = t.a("fruit_leftmask", ii.field_t, false, "");
                                            rb.field_d[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_righttex"), true);
                                            dg.field_d[0] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "fruit_rightsidetex"), true);
                                            sc.field_j[0] = t.a("fruit_rightmask", ii.field_t, false, "");
                                            ad.field_j[0] = si.a(25972, true, bj.a(112, ii.field_t, "", "fruit_bottomtex"), true);
                                            fk.field_G[0] = t.a("fruit_bottommask", ii.field_t, false, "");
                                            ve.field_uc[1] = bj.a(112, ii.field_t, "", "animals_buckettop");
                                            dupTemp$8 = si.a(25972, false, bj.a(112, ii.field_t, "", "animals_sidespr"), true);
                                            rb.field_j[1] = dupTemp$8;
                                            hf.field_e[1] = dupTemp$8;
                                            bh.field_d[1] = si.a(25972, true, bj.a(param0 + 112, ii.field_t, "", "animals_bottomspecial"), false);
                                            fk.field_G[1] = t.a("animals_bottommask", ii.field_t, false, "");
                                            ve.field_uc[2] = bj.a(112, ii.field_t, "", "breakfast_buckettop");
                                            uj.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_lefttex"), true);
                                            bb.field_a[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_leftsidetex"), true);
                                            cc.field_f[2] = t.a("breakfast_leftmask", ii.field_t, false, "");
                                            rb.field_d[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_righttex"), true);
                                            dg.field_d[2] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "breakfast_rightsidetex"), true);
                                            sc.field_j[2] = t.a("breakfast_rightmask", ii.field_t, false, "");
                                            ad.field_j[2] = si.a(25972, true, bj.a(112, ii.field_t, "", "breakfast_bottomtex"), true);
                                            fk.field_G[2] = t.a("breakfast_bottommask", ii.field_t, false, "");
                                            ve.field_uc[3] = bj.a(112, ii.field_t, "", "bugs_buckettop");
                                            dupTemp$9 = si.a(25972, false, bj.a(112, ii.field_t, "", "bugs_sidespr"), true);
                                            rb.field_j[3] = dupTemp$9;
                                            hf.field_e[3] = dupTemp$9;
                                            bh.field_d[3] = si.a(qm.b(param0, 25972), true, bj.a(param0 + 112, ii.field_t, "", "bugs_bottomspecial"), false);
                                            fk.field_G[3] = t.a("bugs_bottommask", ii.field_t, false, "");
                                            ve.field_uc[4] = bj.a(qm.b(param0, 112), ii.field_t, "", "flowers_buckettop");
                                            uj.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_lefttex"), true);
                                            bb.field_a[4] = si.a(25972, true, bj.a(qm.b(param0, 112), ii.field_t, "", "flowers_leftsidetex"), true);
                                            cc.field_f[4] = t.a("flowers_leftmask", ii.field_t, false, "");
                                            rb.field_d[4] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "flowers_righttex"), true);
                                            dg.field_d[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_rightsidetex"), true);
                                            sc.field_j[4] = t.a("flowers_rightmask", ii.field_t, false, "");
                                            ad.field_j[4] = si.a(25972, true, bj.a(112, ii.field_t, "", "flowers_bottomtex"), true);
                                            fk.field_G[4] = t.a("flowers_bottommask", ii.field_t, false, "");
                                            ve.field_uc[5] = bj.a(112, ii.field_t, "", "undersea_buckettop");
                                            dupTemp$10 = si.a(25972, false, bj.a(112, ii.field_t, "", "undersea_sidespr"), true);
                                            rb.field_j[5] = dupTemp$10;
                                            hf.field_e[5] = dupTemp$10;
                                            bh.field_d[5] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "undersea_bottomspecial"), false);
                                            fk.field_G[5] = t.a("undersea_bottommask", ii.field_t, false, "");
                                            ve.field_uc[6] = bj.a(112, ii.field_t, "", "city_buckettop");
                                            uj.field_d[6] = si.a(param0 + 25972, true, bj.a(param0 + 112, ii.field_t, "", "city_lefttex"), true);
                                            bb.field_a[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_leftsidetex"), true);
                                            cc.field_f[6] = t.a("city_leftmask", ii.field_t, false, "");
                                            rb.field_d[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_righttex"), true);
                                            dg.field_d[6] = si.a(25972, true, bj.a(qm.b(param0, 112), ii.field_t, "", "city_rightsidetex"), true);
                                            sc.field_j[6] = t.a("city_rightmask", ii.field_t, false, "");
                                            ad.field_j[6] = si.a(25972, true, bj.a(112, ii.field_t, "", "city_bottomtex"), true);
                                            fk.field_G[6] = t.a("city_bottommask", ii.field_t, false, "");
                                            ve.field_uc[7] = bj.a(112, ii.field_t, "", "eightbit_buckettop");
                                            uj.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_lefttex"), true);
                                            bb.field_a[7] = si.a(25972, true, bj.a(param0 + 112, ii.field_t, "", "eightbit_leftsidetex"), true);
                                            cc.field_f[7] = t.a("eightbit_leftmask", ii.field_t, false, "");
                                            rb.field_d[7] = si.a(25972, true, bj.a(112, ii.field_t, "", "eightbit_righttex"), true);
                                            dg.field_d[7] = si.a(qm.b(param0, 25972), true, bj.a(qm.b(param0, 112), ii.field_t, "", "eightbit_rightsidetex"), true);
                                            sc.field_j[7] = t.a("eightbit_rightmask", ii.field_t, false, "");
                                            ad.field_j[7] = si.a(qm.b(param0, 25972), true, bj.a(112, ii.field_t, "", "eightbit_bottomtex"), true);
                                            fk.field_G[7] = t.a("eightbit_bottommask", ii.field_t, false, "");
                                            break L55;
                                          }
                                          var11_int = 0;
                                          L57: while (true) {
                                            L58: {
                                              L59: {
                                                if (-9 >= (var11_int ^ -1)) {
                                                  break L59;
                                                } else {
                                                  on.a(uj.field_d[var11_int], 19264);
                                                  on.a(rb.field_d[var11_int], param0 + 19264);
                                                  on.a(ad.field_j[var11_int], 19264);
                                                  uh.a(cc.field_f[var11_int], (byte) 115);
                                                  uh.a(sc.field_j[var11_int], (byte) -118);
                                                  uh.a(fk.field_G[var11_int], (byte) 114);
                                                  stackOut_125_0 = 0;
                                                  stackIn_135_0 = stackOut_125_0;
                                                  stackIn_126_0 = stackOut_125_0;
                                                  if (var20 != 0) {
                                                    break L58;
                                                  } else {
                                                    var12_int = stackIn_126_0;
                                                    L60: while (true) {
                                                      L61: {
                                                        L62: {
                                                          if ((var12_int ^ -1) <= (ve.field_uc[var11_int].length ^ -1)) {
                                                            break L62;
                                                          } else {
                                                            ve.field_uc[var11_int][var12_int].b();
                                                            var12_int++;
                                                            if (var20 != 0) {
                                                              break L61;
                                                            } else {
                                                              if (var20 == 0) {
                                                                continue L60;
                                                              } else {
                                                                break L62;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var11_int++;
                                                        break L61;
                                                      }
                                                      if (var20 == 0) {
                                                        continue L57;
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              uf.field_w = id.a(ii.field_t, "machine_buttons1", "", 8192);
                                              bn.field_e = id.a(ii.field_t, "machine_front", "", param0 ^ 8192);
                                              cd.field_k = id.a(ii.field_t, "machine_glass", "", 8192);
                                              e.field_b = id.a(ii.field_t, "machine_glasslit", "", param0 ^ 8192);
                                              ca.field_qb = id.a(ii.field_t, "machine_lights1", "", 8192);
                                              ln.field_c = id.a(ii.field_t, "machine_mouth", "", 8192);
                                              aa.field_e = id.a(ii.field_t, "machine_next", "", param0 + 8192);
                                              jc.field_f = id.a(ii.field_t, "machine_nextlit", "", 8192);
                                              bb.field_c = id.a(ii.field_t, "machine_pipe", "", 8192);
                                              u.field_h = id.a(ii.field_t, "machine_portal", "", param0 + 8192);
                                              bc.field_J = id.a(ii.field_t, "blobmatch_scorecols", "", 8192).field_D;
                                              a.field_u = id.a(ii.field_t, "eliminatetile_scorecols", "", param0 ^ 8192).field_D;
                                              jg.field_f = id.a(ii.field_t, "simultaneous_scorecols", "", 8192).field_D;
                                              nf.field_f = id.a(ii.field_t, "chain_scorecols", "", 8192).field_D;
                                              oh.field_c = id.a(ii.field_t, "bomb_scorecols", "", param0 ^ 8192).field_D;
                                              vl.field_G = id.a(ii.field_t, "bombardmessagecols", "", 8192).field_D;
                                              ph.field_yb = bj.a(112, ii.field_t, "", "instructions_keys");
                                              ma.field_K = id.a(ii.field_t, "instructions_arrow", "", 8192);
                                              aj.field_c = id.a(ii.field_t, "instructions_inmultiplayer", "", 8192);
                                              li.field_i = id.a(ii.field_t, "instructions_insingleplayer", "", param0 + 8192);
                                              stackOut_134_0 = 5;
                                              stackIn_135_0 = stackOut_134_0;
                                              break L58;
                                            }
                                            var11 = new ck[stackIn_135_0][];
                                            var12_array = new ck[5][];
                                            dupTemp$11 = bj.a(112, ii.field_t, "", "bucketsize_icons");
                                            var12_array[0] = dupTemp$11;
                                            var11[0] = dupTemp$11;
                                            dupTemp$12 = bj.a(112, ii.field_t, "", "speed_icons");
                                            var12_array[1] = dupTemp$12;
                                            var11[1] = dupTemp$12;
                                            dupTemp$13 = bj.a(param0 + 112, ii.field_t, "", "shapefeedback_icons");
                                            var12_array[4] = dupTemp$13;
                                            var11[4] = dupTemp$13;
                                            lf.field_h = dupTemp$13;
                                            dupTemp$14 = bj.a(112, ii.field_t, "", "colours_icons");
                                            var12_array[2] = dupTemp$14;
                                            var11[2] = dupTemp$14;
                                            dupTemp$15 = bj.a(112, ii.field_t, "", "specialitems_icons");
                                            var12_array[3] = dupTemp$15;
                                            var11[3] = dupTemp$15;
                                            bg.a(vl.field_A, nd.field_a, si.field_f, pf.field_d, 8, qd.field_Pb, ah.field_i, 5, 25150, qc.field_vb, var11, var12_array, true, vb.field_S, tg.field_d);
                                            gm.a(-3504, 200);
                                            qf.a(ah.field_i, qc.field_vb, -96);
                                            rf.a(ac.field_z, 0, 180, -94, 16694016, (java.applet.Applet) (this));
                                            qc.field_vb = null;
                                            ph.field_Db = null;
                                            vj.a(true);
                                            stackOut_135_0 = 0;
                                            stackIn_136_0 = stackOut_135_0;
                                            decompiledRegionSelector0 = 2;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (cl.field_y != null) {
                    ge.a((byte) -93, new jk(cl.field_y.a(0, "huffman", "")));
                    cl.field_y = null;
                    vj.a(true);
                    stackOut_140_0 = 0;
                    stackIn_141_0 = stackOut_140_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    bj.a(320, on.field_e, eh.field_j, true, km.field_A, 20, param0, 4, 1, 20, 20, 20, a.field_n, 14, 480, 240, im.field_i, 32, 16, 0, 5);
                    ie.a(on.field_e, km.field_A, a.field_n, 320, 20, 0, 32, 20, 240, 4, 5, 20, eh.field_j, im.field_i, 1, 14, 10406, 0, 16, 20);
                    kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                    bd.a(50, -27096);
                    le.a((byte) 86, 50);
                    af.a(param0 + 4, 50);
                    nn.a(256, jg.field_a, true);
                    vj.a(true);
                    stackOut_142_0 = 1;
                    stackIn_143_0 = stackOut_142_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "client.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_136_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_141_0 != 0;
              } else {
                return stackIn_143_0 != 0;
              }
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        jc discarded$2 = null;
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                discarded$2 = client.a((String) null, -100);
                break L1;
              }
            }
            L2: {
              if (null == param1) {
                break L2;
              } else {
                if (param1.length() < mc.field_f) {
                  break L2;
                } else {
                  if (param1.length() <= dn.field_r) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("client.P(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    public final void init() {
        try {
            this.a(-2990, 32, "dekobloko");
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "client.init()");
        }
    }

    static {
        field_D = new byte[65536];
        an.a(field_D, 0, 65536, (byte) -128);
        field_E = "Theme <%0> strategy";
        field_y = "Show all private chat";
        field_C = new ck[3];
        field_B = "Use this alternative as your account name";
    }
}
