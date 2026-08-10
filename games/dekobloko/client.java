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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                client.a((String) null, -14);
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length()) {
                  var2_int = param0.indexOf('@');
                  if (-1 == var2_int) {
                    stackIn_10_0 = hm.field_a;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    if (param1 == -12828) {
                      var5 = ng.a(param1 + 12827, var3);
                      if (null != var5) {
                        stackIn_18_0 = (jc) (var5);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackIn_20_0 = da.a(var4, -2734);
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      stackIn_13_0 = (jc) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_5_0 = eh.field_b;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("client.R(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
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
        lb dupTemp$0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_106_0 = null;
        Object stackIn_108_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        boolean stackIn_164_0 = false;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        boolean stackIn_219_0 = false;
        int stackIn_240_0 = 0;
        int stackIn_244_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_252_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_273_1 = 0;
        int stackIn_280_0 = 0;
        int stackIn_280_1 = 0;
        lk stackIn_328_0 = null;
        lk stackIn_330_0 = null;
        lk stackIn_331_0 = null;
        int stackIn_331_1 = 0;
        int stackIn_348_0 = 0;
        int stackIn_355_0 = 0;
        int stackIn_375_0 = 0;
        int stackIn_375_1 = 0;
        int stackIn_382_0 = 0;
        int stackIn_382_1 = 0;
        int stackIn_384_0 = 0;
        int stackIn_393_0 = 0;
        int stackIn_488_0 = 0;
        int stackIn_488_1 = 0;
        int stackIn_498_0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var3_ref = null;
        int var4 = 0;
        int[] var4_ref = null;
        int[] var4_ref_int__ = null;
        uf var5_ref_uf = null;
        int[] var5_ref_int__ = null;
        int[] var5_ref = null;
        int var5 = 0;
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
                    statePc = 46;
                    continue stateLoop;
                }
                case 44: {
                    ak.field_d = 1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    fl.a((byte) -108);
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
                    stackIn_62_0 = this;
                    stackIn_60_0 = stackIn_62_0;
                    if (null == cl.field_v) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_63_0 = this;
                    stackIn_63_1 = 1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = this;
                    stackIn_63_1 = 0;
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
                    statePc = 149;
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
                    statePc = 149;
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
                    statePc = 149;
                    continue stateLoop;
                }
                case 102: {
                    this.b(30661, false);
                    statePc = 149;
                    continue stateLoop;
                }
                case 105: {
                    stackIn_110_0 = this;
                    stackIn_106_0 = stackIn_110_0;
                    if (null == cl.field_v) {
                        statePc = 110;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_108_0 = this;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    stackIn_111_0 = this;
                    stackIn_111_1 = 1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 110: {
                    stackIn_111_0 = this;
                    stackIn_111_1 = 0;
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
                    statePc = 149;
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
                    statePc = 149;
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
                    statePc = 146;
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
                    statePc = 146;
                    continue stateLoop;
                }
                case 144: {
                    jk.a(2, true);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    this.b(30661, true);
                    statePc = 149;
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
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var3_ref = (ki) ((Object) si.field_e.a(4));
                    if (var3_ref == null) {
                        statePc = 156;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    ce.a(4, (ki) (var3_ref), -697);
                    statePc = 152;
                    continue stateLoop;
                }
                case 156: {
                    var3_ref = (ff) ((Object) jm.field_r.a(4));
                    if (var3_ref != null) {
                        statePc = 160;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 160: {
                    wk.a(3, 5, (ff) (var3_ref));
                    statePc = 156;
                    continue stateLoop;
                }
                case 163: {
                    stackIn_164_0 = vi.a(mk.field_c, 0);
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (!stackIn_164_0) {
                        statePc = 487;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    stackIn_488_0 = bh.field_k ^ -1;
                    stackIn_166_0 = stackIn_488_0;
                    stackIn_488_1 = -10;
                    stackIn_166_1 = stackIn_488_1;
                    if (false) {
                        statePc = 488;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (stackIn_166_0 != stackIn_166_1) {
                        statePc = 170;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    mn.field_c = false;
                    var3_ref = de.field_V.c((byte) -38);
                    wj.a(1, -86, false, 0, true, (String) (var3_ref));
                    statePc = 163;
                    continue stateLoop;
                }
                case 170: {
                    if (77 != bh.field_k) {
                        statePc = 174;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    mn.field_c = false;
                    pn.a(true, false, true);
                    statePc = 163;
                    continue stateLoop;
                }
                case 174: {
                    if (-15 == (bh.field_k ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 177: {
                    we.a((byte) 66);
                    cd.a(true);
                    nk.a(id.g(8192), rd.b(-95), 0, 5, oe.b(-10498, 2000), qi.e((byte) 117), vl.field_A, 150, oe.b(-10498, 8), 1024);
                    dg.a(21014, tc.g((byte) 98), l.a(-126));
                    gk.field_Ib = true;
                    uh.field_b = true;
                    mn.field_c = false;
                    var3_ref = j.field_d;
                    var4 = 0;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 163;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    ((int[]) (var3_ref))[var4] = 0;
                    var4++;
                    statePc = 178;
                    continue stateLoop;
                }
                case 181: {
                    if ((bh.field_k ^ -1) != -16) {
                        statePc = 189;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (uh.field_b) {
                        statePc = 187;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 187: {
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
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    mn.field_c = false;
                    wk.field_i = false;
                    statePc = 163;
                    continue stateLoop;
                }
                case 189: {
                    if ((bh.field_k ^ -1) != -11) {
                        statePc = 196;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (uh.field_b) {
                        statePc = 195;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 195: {
                    ke.a((byte) 113);
                    statePc = 163;
                    continue stateLoop;
                }
                case 196: {
                    if (-76 == (bh.field_k ^ -1)) {
                        statePc = 199;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var3_ref = b.h(-123);
                    var4_ref = (int[]) (Object) (var3_ref);
                    var5_ref_uf = de.field_V;
                    var6_int = ((wl) ((Object) var5_ref_uf)).d((byte) -45);
                    var7 = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if ((var7 ^ -1) <= (var6_int ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var4_ref[var7] = ((wl) ((Object) var5_ref_uf)).i(7553);
                    var7++;
                    statePc = 200;
                    continue stateLoop;
                }
                case 204: {
                    if (nm.field_Qb) {
                        statePc = 207;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var4_ref = (int[]) (var3_ref);
                    var5_ref_int__ = o.field_g;
                    var6_int = 0;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (-9 >= (var6_int ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var4_ref[var6_int] = lb.a(var4_ref[var6_int], var5_ref_int__[var6_int] ^ -1);
                    var6_int++;
                    statePc = 208;
                    continue stateLoop;
                }
                case 212: {
                    if (null == kf.field_I) {
                        statePc = 223;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (kf.field_I.field_g.field_p[kf.field_I.field_P] == null) {
                        statePc = 223;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var4 = 0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if ((var4 ^ -1) <= -32) {
                        statePc = 223;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    stackIn_164_0 = rb.a(-18, var4, (int[]) (var3_ref));
                    stackIn_219_0 = stackIn_164_0;
                    if (false) {
                        statePc = 164;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (!stackIn_219_0) {
                        statePc = 222;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    kf.field_I.field_g.field_p[kf.field_I.field_P].field_cb.a(new vd(var4), 2777);
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    var4++;
                    statePc = 217;
                    continue stateLoop;
                }
                case 223: {
                    var4_ref_int__ = j.field_d;
                    var5_ref = (int[]) (Object) (var3_ref);
                    var6_int = 0;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if ((var6_int ^ -1) <= -9) {
                        statePc = 228;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var4_ref_int__[var6_int] = de.b(var4_ref_int__[var6_int], var5_ref[var6_int]);
                    var6_int++;
                    statePc = 224;
                    continue stateLoop;
                }
                case 228: {
                    var4_ref_int__ = o.field_g;
                    var5_ref = (int[]) (var3_ref);
                    var6_int = 0;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (-9 >= (var6_int ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var4_ref_int__[var6_int] = de.b(var4_ref_int__[var6_int], var5_ref[var6_int]);
                    var6_int++;
                    statePc = 229;
                    continue stateLoop;
                }
                case 232: {
                    if (58 == bh.field_k) {
                        statePc = 236;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (bh.field_k != 59) {
                        statePc = 307;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var3 = de.field_V.e(3);
                    var4 = var3 & 15;
                    var5 = 3 & var3 >> 1315490500;
                    var6_int = var3 >> -1189014074 & 7;
                    var7 = (var3 & 3812) >> -1446042807;
                    if ((var3 & 4096 ^ -1) == -1) {
                        statePc = 239;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    stackIn_240_0 = 1;
                    statePc = 240;
                    continue stateLoop;
                }
                case 239: {
                    stackIn_240_0 = 0;
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    var8 = stackIn_240_0;
                    if ((8192 & var3) == 0) {
                        statePc = 243;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    stackIn_244_0 = 1;
                    statePc = 244;
                    continue stateLoop;
                }
                case 243: {
                    stackIn_244_0 = 0;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    var9 = stackIn_244_0;
                    if ((var3 & 16384) == 0) {
                        statePc = 247;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    stackIn_248_0 = 1;
                    statePc = 248;
                    continue stateLoop;
                }
                case 247: {
                    stackIn_248_0 = 0;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    var10_int = stackIn_248_0;
                    if (-1 == (var3 & 32768 ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    stackIn_252_0 = 1;
                    statePc = 252;
                    continue stateLoop;
                }
                case 251: {
                    stackIn_252_0 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    var11 = stackIn_252_0;
                    var12 = de.field_V.e(3);
                    var13 = de.field_V.d((byte) -92);
                    var14 = de.field_V.d((byte) -116);
                    var15 = de.field_V.g((byte) -100);
                    if ((var15 ^ -1) > -1) {
                        statePc = 255;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var15 = -2;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    var16 = new String[var14];
                    var17 = 0;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (var17 >= var14) {
                        statePc = 261;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var16[var17] = de.field_V.b(true);
                    var17++;
                    statePc = 257;
                    continue stateLoop;
                }
                case 261: {
                    var17 = de.field_V.d((byte) -27);
                    gh.field_e = null;
                    var18 = new qc(true, var13, var8 != 0, var4, var5, var6_int, var7, var16, var15, var9 != 0, false, false);
                    var18.field_R = var12;
                    var18.field_r = var10_int != 0;
                    if (var10_int != 0) {
                        statePc = 268;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (var11 != 0) {
                        statePc = 267;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var18.field_p.a(new in(cf.field_e, 10, true), 2777);
                    statePc = 270;
                    continue stateLoop;
                }
                case 268: {
                    var18.field_p.a(new in(bn.field_c, 8, true), 2777);
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    var19 = 0;
                    var20 = 0;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    if (var20 >= var18.field_g.field_b) {
                        statePc = 279;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    stackIn_280_0 = -1;
                    stackIn_273_0 = stackIn_280_0;
                    stackIn_280_1 = var17 & 1 << var20 ^ -1;
                    stackIn_273_1 = stackIn_280_1;
                    if (false) {
                        statePc = 280;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (stackIn_273_0 == stackIn_273_1) {
                        statePc = 278;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var18.field_V[var20] = 200;
                    var19++;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    var20++;
                    statePc = 271;
                    continue stateLoop;
                }
                case 279: {
                    stackIn_280_0 = -3;
                    stackIn_280_1 = var19 ^ -1;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    if (stackIn_280_0 > stackIn_280_1) {
                        statePc = 282;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var18.field_Ab = 100;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    var20 = var18.field_P;
                    if (-1 < (var20 ^ -1)) {
                        statePc = 286;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var20 = 0;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if (200 == var18.field_V[var20]) {
                        statePc = 291;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var20++;
                    statePc = 287;
                    continue stateLoop;
                }
                case 291: {
                    if (2 != var19) {
                        statePc = 297;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var20 = (var20 + 1) % var18.field_g.field_b;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (var18.field_V[var20] == 200) {
                        statePc = 297;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var20 = (var20 - -1) % var18.field_g.field_b;
                    statePc = 293;
                    continue stateLoop;
                }
                case 297: {
                    var18.field_i = var20;
                    var18.field_D = var20;
                    var18.field_lb = var20;
                    if (-59 == (bh.field_k ^ -1)) {
                        statePc = 301;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    ce.field_C = var18;
                    fa.field_n = true;
                    statePc = 303;
                    continue stateLoop;
                }
                case 301: {
                    kf.field_I = var18;
                    fm.field_b = true;
                    eb.a(58);
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    wk.field_i = false;
                    am.field_c = true;
                    if (var4 == 10) {
                        statePc = 305;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var21 = sb.field_u[var13];
                    statePc = 306;
                    continue stateLoop;
                }
                case 305: {
                    var21 = ee.field_a;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    nn.a(var18.b(true), var21[0], true);
                    statePc = 163;
                    continue stateLoop;
                }
                case 307: {
                    if (bh.field_k == 60) {
                        statePc = 310;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (fm.field_b) {
                        statePc = 316;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (fa.field_n) {
                        statePc = 316;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 316: {
                    fm.field_b = false;
                    am.field_c = false;
                    fa.field_n = false;
                    cd.a(true);
                    un.a((byte) -125);
                    jg.a(-111);
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    wk.field_i = false;
                    statePc = 163;
                    continue stateLoop;
                }
                case 318: {
                    var3_ref = null;
                    if (!fm.field_b) {
                        statePc = 320;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var3_ref = kf.field_I;
                    statePc = 322;
                    continue stateLoop;
                }
                case 320: {
                    if (!fa.field_n) {
                        statePc = 322;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    var3_ref = ce.field_C;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (null != var3_ref) {
                        statePc = 324;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 324: {
                    if (61 == bh.field_k) {
                        statePc = 327;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 327: {
                    var4 = de.field_V.d((byte) -92);
                    var5_ref_lk = ((qc) (var3_ref)).field_g.field_p[var4];
                    stackIn_330_0 = (lk) (var5_ref_lk);
                    stackIn_328_0 = stackIn_330_0;
                    if ((var4 ^ -1) != (((qc) (var3_ref)).field_P ^ -1)) {
                        statePc = 330;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    stackIn_331_0 = (lk) ((Object) stackIn_328_0);
                    stackIn_331_1 = 1;
                    statePc = 331;
                    continue stateLoop;
                }
                case 330: {
                    stackIn_331_0 = (lk) ((Object) stackIn_330_0);
                    stackIn_331_1 = 0;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    ((lk) (Object) stackIn_331_0).a(stackIn_331_1 != 0, de.field_V, (byte) 118);
                    ((qc) (var3_ref)).a(true, var5_ref_lk, 600, 200, var5_ref_lk.field_jb, var4, false);
                    if (((qc) (var3_ref)).field_P == var4) {
                        statePc = 334;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 334: {
                    we.field_b.f(59, -4);
                    we.field_b.a(true, var5_ref_lk.field_U);
                    ((qc) (var3_ref)).field_E = 7 * var5_ref_lk.field_yb - 4;
                    statePc = 163;
                    continue stateLoop;
                }
                case 335: {
                    if (bh.field_k == 62) {
                        statePc = 338;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var4 = de.field_V.d((byte) -124);
                    var5 = de.field_V.d((byte) -116);
                    if ((((qc) (var3_ref)).field_g.field_b ^ -1) >= (var4 ^ -1)) {
                        statePc = 344;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (((qc) (var3_ref)).field_g.field_p[var4] == null) {
                        statePc = 344;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 344: {
                    qb.a((Throwable) null, 16408, "T4: " + var4);
                    si.a(85);
                    statePc = 163;
                    continue stateLoop;
                }
                case 345: {
                    var6 = ((qc) (var3_ref)).field_g.field_p[var4];
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    if ((var6.field_fb ^ -1) <= (var6.field_gb ^ -1)) {
                        statePc = 354;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    var7 = ((qc) (var3_ref)).b(-117, var4) ? 1 : 0;
                    stackIn_355_0 = var7;
                    stackIn_348_0 = stackIn_355_0;
                    if (false) {
                        statePc = 355;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (stackIn_348_0 == 0) {
                        statePc = 352;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 352: {
                    qb.a((Throwable) null, 16408, "T6");
                    si.a(79);
                    statePc = 163;
                    continue stateLoop;
                }
                case 354: {
                    ((qc) (var3_ref)).a(18, var6, var4);
                    ((qc) (var3_ref)).field_g.field_p[var4] = null;
                    ((qc) (var3_ref)).field_g.field_d = ((qc) (var3_ref)).field_g.field_d & (1 << var4 ^ -1);
                    ((qc) (var3_ref)).field_g.field_i = ((qc) (var3_ref)).field_g.field_i - 1;
                    stackIn_355_0 = ((qc) (var3_ref)).field_P;
                    statePc = 355;
                    continue stateLoop;
                }
                case 355: {
                    if (stackIn_355_0 == var4) {
                        statePc = 358;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 358: {
                    cd.a(true);
                    ob.field_k = true;
                    ((qc) (var3_ref)).a(rm.field_b, 0);
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    ((qc) (var3_ref)).field_r = false;
                    ca.field_kb = 1;
                    jb.field_a = false;
                    rb.field_e = 0;
                    ak.field_d = 1;
                    ((qc) (var3_ref)).field_T = var5;
                    statePc = 163;
                    continue stateLoop;
                }
                case 360: {
                    if (-64 == (bh.field_k ^ -1)) {
                        statePc = 363;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var4 = de.field_V.d((byte) -53);
                    var5 = de.field_V.d((byte) -118);
                    var6_int = sm.field_e + -de.field_V.field_n;
                    if (0 <= var6_int) {
                        statePc = 367;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    qb.a((Throwable) null, 16408, "T8: " + var4 + " " + var5 + " " + var6_int);
                    si.a(65);
                    statePc = 163;
                    continue stateLoop;
                }
                case 367: {
                    var7_ref_uf = new uf(var6_int + 1);
                    var7_ref_uf.a(true, var5);
                    var7_ref_uf.a(false, var6_int, de.field_V.field_r, de.field_V.field_n);
                    var7_ref_uf.field_n = 0;
                    ((qc) (var3_ref)).field_v[var4].field_g.a(var7_ref_uf, 2777);
                    dupTemp$0 = ((qc) (var3_ref)).field_v[var4];
                    dupTemp$0.field_e = dupTemp$0.field_e + var5;
                    statePc = 163;
                    continue stateLoop;
                }
                case 368: {
                    if (-65 != (bh.field_k ^ -1)) {
                        statePc = 401;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
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
                        statePc = 372;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 372: {
                    var9 = var7;
                    statePc = 373;
                    continue stateLoop;
                }
                case 373: {
                    if (var8 <= var9) {
                        statePc = 381;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    var10 = new rf(var9);
                    stackIn_382_0 = var4 ^ -1;
                    stackIn_375_0 = stackIn_382_0;
                    stackIn_382_1 = ((qc) (var3_ref)).field_P ^ -1;
                    stackIn_375_1 = stackIn_382_1;
                    if (false) {
                        statePc = 382;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if (stackIn_375_0 == stackIn_375_1) {
                        statePc = 379;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var10.field_m = -var7 + var9;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    ((qc) (var3_ref)).field_db.a(var10, 0);
                    var9++;
                    statePc = 373;
                    continue stateLoop;
                }
                case 381: {
                    stackIn_382_0 = var5_ref_lk.field_fb ^ -1;
                    stackIn_382_1 = var5_ref_lk.field_gb ^ -1;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if (stackIn_382_0 <= stackIn_382_1) {
                        statePc = 391;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    var9 = ((qc) (var3_ref)).b(-126, var4) ? 1 : 0;
                    stackIn_393_0 = var9;
                    stackIn_384_0 = stackIn_393_0;
                    if (false) {
                        statePc = 393;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (stackIn_384_0 != 0) {
                        statePc = 381;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    qb.a((Throwable) null, 16408, "T7");
                    si.a(97);
                    statePc = 381;
                    continue stateLoop;
                }
                case 391: {
                    var5_ref_lk.field_gb = var8;
                    var5_ref_lk.field_fb = var7;
                    statePc = 392;
                    continue stateLoop;
                }
                case 392: {
                    stackIn_393_0 = ((qc) (var3_ref)).field_P;
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    if (stackIn_393_0 == var4) {
                        statePc = 396;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (!var6_ref.a((byte) 58)) {
                        statePc = 400;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    ((qc) (var3_ref)).b(-118, var4);
                    statePc = 396;
                    continue stateLoop;
                }
                case 400: {
                    we.field_b.f(59, -4);
                    we.field_b.a(true, ((qc) (var3_ref)).field_g.field_p[var4].field_U);
                    ((qc) (var3_ref)).field_w = 0;
                    statePc = 163;
                    continue stateLoop;
                }
                case 401: {
                    if (-66 == (bh.field_k ^ -1)) {
                        statePc = 404;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 404: {
                    var4 = de.field_V.d((byte) -60);
                    var5_ref_lk = ((qc) (var3_ref)).field_g.field_p[var4];
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    var6_int = ((qc) (var3_ref)).b(-116, var4) ? 1 : 0;
                    if (var6_int != 0) {
                        statePc = 405;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    if ((((qc) (var3_ref)).field_P ^ -1) == (var4 ^ -1)) {
                        statePc = 413;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 413: {
                    var6_int = 0;
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    if ((var5_ref_lk.field_jb ^ -1) >= (var6_int ^ -1)) {
                        statePc = 418;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    fh.field_h = fh.field_h + 30000;
                    rk.field_cb = rk.field_cb + 30000;
                    var6_int++;
                    statePc = 414;
                    continue stateLoop;
                }
                case 418: {
                    var5_ref_lk.field_jb = 0;
                    var5_ref_lk.k(-9897);
                    ((qc) (var3_ref)).field_w = 0;
                    if ((var4 ^ -1) == (((qc) (var3_ref)).field_P ^ -1)) {
                        statePc = 421;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 421: {
                    ((qc) (var3_ref)).field_p.a(new in(cb.field_i, 13, true), 2777);
                    ((qc) (var3_ref)).field_ob = true;
                    statePc = 163;
                    continue stateLoop;
                }
                case 422: {
                    if ((bh.field_k ^ -1) == -67) {
                        statePc = 425;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 425: {
                    var4 = de.field_V.d((byte) -22);
                    var5 = de.field_V.d((byte) -76);
                    var6 = ((qc) (var3_ref)).field_g.field_p[var4];
                    var7 = 0;
                    statePc = 426;
                    continue stateLoop;
                }
                case 426: {
                    if (var7 >= var5) {
                        statePc = 163;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    var6.b(-19939);
                    var7++;
                    statePc = 426;
                    continue stateLoop;
                }
                case 429: {
                    if (67 == bh.field_k) {
                        statePc = 432;
                    } else {
                        statePc = 433;
                    }
                    continue stateLoop;
                }
                case 432: {
                    var4 = de.field_V.d((byte) -50);
                    var5_ref_rf = ((qc) (var3_ref)).field_db.a(true, true, de.field_V);
                    ((qc) (var3_ref)).field_g.field_p[var4].a(var5_ref_rf, (byte) -121);
                    statePc = 163;
                    continue stateLoop;
                }
                case 433: {
                    if ((bh.field_k ^ -1) != -69) {
                        statePc = 437;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    ((qc) (var3_ref)).field_T = de.field_V.d((byte) -35);
                    ((qc) (var3_ref)).field_p.a(new in(eb.field_c, 12, false), 2777);
                    statePc = 163;
                    continue stateLoop;
                }
                case 437: {
                    if (bh.field_k == 69) {
                        statePc = 440;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 440: {
                    ((qc) (var3_ref)).field_T = de.field_V.d((byte) -78);
                    ((qc) (var3_ref)).field_r = true;
                    ((qc) (var3_ref)).field_p.a(new in(bn.field_c, 8, false), 2777);
                    statePc = 163;
                    continue stateLoop;
                }
                case 441: {
                    if ((bh.field_k ^ -1) == -77) {
                        statePc = 444;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 444: {
                    ((qc) (var3_ref)).field_g.field_f[((qc) (var3_ref)).field_g.field_o] = de.field_V.g((byte) -89);
                    ((qc) (var3_ref)).field_g.field_o = ((qc) (var3_ref)).field_g.field_o + 1;
                    statePc = 163;
                    continue stateLoop;
                }
                case 445: {
                    if (70 != bh.field_k) {
                        statePc = 470;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    var4 = de.field_V.g((byte) -104);
                    var5 = 0;
                    statePc = 447;
                    continue stateLoop;
                }
                case 447: {
                    if ((var5 ^ -1) <= (((qc) (var3_ref)).field_g.field_b ^ -1)) {
                        statePc = 456;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (null == ((qc) (var3_ref)).field_g.field_p[var5]) {
                        statePc = 455;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 449: {
                    if (((qc) (var3_ref)).field_v[var5].field_g.b(-24)) {
                        statePc = 455;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    ((qc) (var3_ref)).b(39, var5);
                    statePc = 449;
                    continue stateLoop;
                }
                case 455: {
                    var5++;
                    statePc = 447;
                    continue stateLoop;
                }
                case 456: {
                    ((qc) (var3_ref)).field_g.a(var4, (byte) -70);
                    ((qc) (var3_ref)).a(100);
                    if (((qc) (var3_ref)).field_P >= 0) {
                        statePc = 459;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 459: {
                    cd.a(true);
                    statePc = 460;
                    continue stateLoop;
                }
                case 460: {
                    if (-1 < (var4 ^ -1)) {
                        statePc = 464;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    if (!((qc) (var3_ref)).field_ob) {
                        statePc = 467;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    ((qc) (var3_ref)).a(rm.field_b, 0);
                    statePc = 469;
                    continue stateLoop;
                }
                case 467: {
                    ((qc) (var3_ref)).a(hb.field_Ub, 0);
                    statePc = 469;
                    continue stateLoop;
                }
                case 469: {
                    ob.field_k = true;
                    statePc = 163;
                    continue stateLoop;
                }
                case 470: {
                    if (71 == bh.field_k) {
                        statePc = 473;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 473: {
                    ((qc) (var3_ref)).field_g.field_d = de.field_V.d((byte) -45);
                    statePc = 163;
                    continue stateLoop;
                }
                case 474: {
                    if (bh.field_k != 72) {
                        statePc = 478;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    ((qc) (var3_ref)).field_g.field_h = de.field_V.d((byte) -19);
                    statePc = 163;
                    continue stateLoop;
                }
                case 478: {
                    if (bh.field_k == 73) {
                        statePc = 481;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 481: {
                    ((qc) (var3_ref)).field_g.field_a = de.field_V.d((byte) -77);
                    statePc = 163;
                    continue stateLoop;
                }
                case 482: {
                    if ((bh.field_k ^ -1) != -75) {
                        statePc = 486;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    ((qc) (var3_ref)).field_yb = de.field_V.d((byte) -31);
                    ((qc) (var3_ref)).field_g.field_d = ((qc) (var3_ref)).field_g.field_d & (((qc) (var3_ref)).field_yb ^ -1);
                    ((qc) (var3_ref)).field_g.field_a = ((qc) (var3_ref)).field_g.field_a & (((qc) (var3_ref)).field_yb ^ -1);
                    statePc = 163;
                    continue stateLoop;
                }
                case 486: {
                    this.f((byte) 126);
                    statePc = 163;
                    continue stateLoop;
                }
                case 487: {
                    wj.c(4792, 0);
                    stackIn_488_0 = param0;
                    stackIn_488_1 = 49;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    if (stackIn_488_0 >= stackIn_488_1) {
                        statePc = 491;
                    } else {
                        statePc = 489;
                    }
                    continue stateLoop;
                }
                case 489: {
                    client.a((String) null, 33);
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if (null == hh.field_a) {
                        statePc = 495;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if ((ef.field_N ^ -1) >= -1) {
                        statePc = 497;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    stackIn_498_0 = 1;
                    statePc = 498;
                    continue stateLoop;
                }
                case 497: {
                    stackIn_498_0 = 0;
                    statePc = 498;
                    continue stateLoop;
                }
                case 498: {
                    var3 = stackIn_498_0;
                    if (fm.field_b) {
                        statePc = 501;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 501: {
                    var3 = nk.field_i ? 1 : 0;
                    statePc = 502;
                    continue stateLoop;
                }
                case 502: {
                    if (fa.field_n) {
                        statePc = 505;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 505: {
                    var3 = og.field_ib ? 1 : 0;
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    if (var3 == 0) {
                        statePc = 509;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    bg.field_b = 0;
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    if (!ea.c((byte) -60)) {
                        statePc = 547;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    var4 = this.g((byte) 125);
                    if ((var4 ^ -1) == -1) {
                        statePc = 516;
                    } else {
                        statePc = 511;
                    }
                    continue stateLoop;
                }
                case 511: {
                    if (var4 == 1) {
                        statePc = 516;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 516: {
                    if (1 == var4) {
                        statePc = 528;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 517: {
                    if (!uh.field_b) {
                        statePc = 527;
                    } else {
                        statePc = 520;
                    }
                    continue stateLoop;
                }
                case 520: {
                    un.a((byte) -123);
                    gd.field_f = true;
                    if (fm.field_b) {
                        statePc = 525;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 525: {
                    wj.a(1, -99, false, 0, true, af.field_a);
                    statePc = 526;
                    continue stateLoop;
                }
                case 526: {
                    kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                    dc.a(false, 96);
                    uh.field_b = false;
                    fm.field_b = false;
                    fa.field_n = false;
                    jg.a(-100);
                    am.field_c = false;
                    statePc = 527;
                    continue stateLoop;
                }
                case 527: {
                    wk.field_i = false;
                    mn.field_c = false;
                    statePc = 530;
                    continue stateLoop;
                }
                case 528: {
                    wk.field_i = true;
                    mn.field_c = true;
                    statePc = 530;
                    continue stateLoop;
                }
                case 530: {
                    var5 = 0;
                    if ((var4 ^ -1) != -3) {
                        statePc = 532;
                    } else {
                        statePc = 531;
                    }
                    continue stateLoop;
                }
                case 531: {
                    var5 = 1;
                    statePc = 532;
                    continue stateLoop;
                }
                case 532: {
                    if (uh.field_b) {
                        statePc = 541;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    if (mn.field_c) {
                        statePc = 541;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 536: {
                    if (wk.field_i) {
                        statePc = 541;
                    } else {
                        statePc = 542;
                    }
                    continue stateLoop;
                }
                case 541: {
                    var5 = 1;
                    statePc = 542;
                    continue stateLoop;
                }
                case 542: {
                    if (ea.c((byte) -88)) {
                        statePc = 544;
                    } else {
                        statePc = 543;
                    }
                    continue stateLoop;
                }
                case 543: {
                    var5 = 0;
                    statePc = 544;
                    continue stateLoop;
                }
                case 544: {
                    if (var5 == 0) {
                        statePc = 547;
                    } else {
                        statePc = 545;
                    }
                    continue stateLoop;
                }
                case 545: {
                    gh.a(false);
                    statePc = 547;
                    continue stateLoop;
                }
                case 547: {
                    of.a(0);
                    if (!sh.field_j) {
                        statePc = 559;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 548: {
                    if (am.field_c) {
                        statePc = 559;
                    } else {
                        statePc = 551;
                    }
                    continue stateLoop;
                }
                case 551: {
                    if (jg.field_a != rc.field_d) {
                        statePc = 556;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 556: {
                    nn.a(256, jg.field_a, true);
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        ke stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        ke stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_157_0 = 0;
        boolean stackIn_171_0 = false;
        int stackIn_207_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_296_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 30661) {
              L1: {
                if (gb.field_Vb == gb.field_Ob) {
                  L2: {
                    L3: {
                      var3_int = 0;
                      var4 = 0;
                      if (!param1) {
                        if (null == kf.field_G) {
                          if (!am.field_c) {
                            if (!uh.field_b) {
                              break L3;
                            } else {
                              var3_int = 1;
                              break L3;
                            }
                          } else {
                            if (!uh.field_b) {
                              var5 = kf.field_I.b(2, true) ? 1 : 0;
                              L4: while (true) {
                                L5: {
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    stackIn_171_0 = ab.c((byte) 50);

                                    if (!stackIn_171_0) {
                                      break L5;
                                    } else {
                                      var5 = kf.field_I.e(false) ? 1 : 0;
                                      continue L4;
                                    }
                                  }
                                }
                                break L3;
                              }
                            } else {
                              L6: {
                                L7: {
                                  var3_int = 1;
                                  if (kf.field_G != null) {
                                    break L7;
                                  } else {
                                    if (ea.d((byte) 92)) {
                                      break L7;
                                    } else {
                                      stackIn_157_0 = 1;
                                      break L6;
                                    }
                                  }
                                }
                                stackIn_157_0 = 0;
                                break L6;
                              }
                              var4 = stackIn_157_0;
                              break L3;
                            }
                          }
                        } else {
                          if (!ba.field_c) {
                            if (lk.field_F) {
                              h.field_d.j(-114);
                              break L3;
                            } else {
                              if (mg.field_Zb) {
                                cl.field_B.f((byte) -63);
                                break L3;
                              } else {
                                if (fm.field_e) {
                                  am.field_a.l((byte) 101);
                                  break L3;
                                } else {
                                  if (ve.field_Hc) {
                                    ca.field_wb.d(-8622);
                                    break L3;
                                  } else {
                                    if (!nk.field_k) {
                                      if (gi.field_b) {
                                        L8: {
                                          L9: {
                                            h.a((ke) null, (byte) 95);
                                            wf.a(false);
                                            var5 = lg.a(0, true);
                                            if (1 == var5) {
                                              break L9;
                                            } else {
                                              if ((var5 ^ -1) != -3) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          L10: {
                                            gi.field_b = false;
                                            stackIn_126_0 = kf.field_G;

                                            stackIn_126_1 = param0 ^ -30662;

                                            if (var5 != 2) {
                                              stackIn_127_0 = (ke) ((Object) stackIn_126_0);
                                              stackIn_127_1 = stackIn_126_1;
                                              stackIn_127_2 = 0;
                                              break L10;
                                            } else {


                                              stackIn_127_0 = (ke) ((Object) stackIn_126_0);
                                              stackIn_127_1 = stackIn_126_1;
                                              stackIn_127_2 = 1;
                                              break L10;
                                            }
                                          }
                                          ((ke) (Object) stackIn_127_0).c(stackIn_127_1, stackIn_127_2 != 0);
                                          break L8;
                                        }
                                        L11: {
                                          if (3 != var5) {
                                            break L11;
                                          } else {
                                            sm.a((byte) -65, se.h(25144));
                                            break L11;
                                          }
                                        }
                                        break L3;
                                      } else {
                                        kf.field_G.k(128);
                                        break L3;
                                      }
                                    } else {
                                      f.field_s.g(2824);
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            pd.field_d.g((byte) -96);
                            break L3;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackIn_171_0 = uh.field_b;
                    break L2;
                  }
                  L12: {
                    if (!stackIn_171_0) {
                      break L12;
                    } else {
                      if (mn.field_c) {
                        break L12;
                      } else {
                        if (!wk.field_i) {
                          L13: {
                            if (!fm.field_b) {
                              break L13;
                            } else {
                              if (!jg.field_i) {
                                break L13;
                              } else {
                                var3_int = 0;
                                break L13;
                              }
                            }
                          }
                          L14: {
                            ka.a(var3_int != 0, -3051);
                            if (fa.field_n) {
                              ce.field_C.b(2, var4 != 0);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (fm.field_b) {
                              L16: {
                                ph.a(180, 320, false, var4 != 0);
                                if (jg.field_i) {
                                  var4 = 0;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              kf.field_I.b(2, var4 != 0);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: while (true) {
                            if (!ab.c((byte) -123)) {
                              break L12;
                            } else {
                              L18: {
                                L19: {
                                  if (null == hh.field_a) {
                                    break L19;
                                  } else {
                                    if (-1 <= (ef.field_N ^ -1)) {
                                      stackIn_207_0 = 0;
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                stackIn_207_0 = 1;
                                break L18;
                              }
                              L20: {
                                var5 = stackIn_207_0;
                                if (fm.field_b) {
                                  var5 = nk.field_i ? 1 : 0;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              L21: {
                                if (!fa.field_n) {
                                  break L21;
                                } else {
                                  var5 = og.field_ib ? 1 : 0;
                                  break L21;
                                }
                              }
                              L22: {
                                if (param1) {
                                  break L22;
                                } else {
                                  if (!fm.field_b) {
                                    if (var5 == 0) {
                                      break L22;
                                    } else {
                                      ig.a(12, 15, 13, (byte) 69);
                                      break L22;
                                    }
                                  } else {
                                    if (!gd.a(13, 12, 15, (byte) -83)) {
                                      break L22;
                                    } else {
                                      continue L17;
                                    }
                                  }
                                }
                              }
                              L23: {
                                if (!fa.field_n) {
                                  break L23;
                                } else {
                                  if (var4 == 0) {
                                    break L23;
                                  } else {
                                    ce.field_C.e(false);
                                    break L23;
                                  }
                                }
                              }
                              L24: {
                                if (!fm.field_b) {
                                  break L24;
                                } else {
                                  if (var4 == 0) {
                                    break L24;
                                  } else {
                                    kf.field_I.e(false);
                                    break L24;
                                  }
                                }
                              }
                              continue L17;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  L25: {
                    if (!uh.field_b) {
                      gn.b(-29550);
                      if (ab.e(param0 + -58860) == 0) {
                        we.a((byte) 68);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    L27: {
                      if (hh.field_a == null) {
                        break L27;
                      } else {
                        if (-1 <= (ef.field_N ^ -1)) {
                          stackIn_253_0 = 0;
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    stackIn_253_0 = 1;
                    break L26;
                  }
                  L28: {
                    var5 = stackIn_253_0;
                    if (!fm.field_b) {
                      break L28;
                    } else {
                      var5 = nk.field_i ? 1 : 0;
                      break L28;
                    }
                  }
                  L29: {
                    if (fa.field_n) {
                      var5 = og.field_ib ? 1 : 0;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (var5 != 0) {
                      if ((ef.field_N ^ -1) > (dl.field_M ^ -1)) {
                        ef.field_N = ef.field_N + 1;
                        break L30;
                      } else {
                        break L30;
                      }
                    } else {
                      if (-1 > (ef.field_N ^ -1)) {
                        ef.field_N = ef.field_N - 1;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L31: {
                    var6 = dl.field_M * dl.field_M;
                    var7 = -(ef.field_N * ef.field_N) + var6;
                    var8 = ea.field_p + 120 * var7 / var6;
                    ij.a(var8, -32);
                    if (ue.field_b != hh.field_a) {
                      break L31;
                    } else {
                      if (ab.e(param0 + -58860) != 0) {
                        break L31;
                      } else {
                        if (!am.field_c) {
                          if (!uh.field_b) {
                            db.field_d = true;
                            ue.field_b = tc.field_Tb;
                            wg.field_f = true;
                            break L31;
                          } else {
                            db.field_d = false;
                            wg.field_f = false;
                            ue.field_b = null;
                            break L31;
                          }
                        } else {
                          L32: {
                            db.field_d = false;
                            if (kf.field_I == null) {
                              break L32;
                            } else {
                              if (-39 < (kf.field_I.field_hb ^ -1)) {
                                ue.field_b = dn.field_p[kf.field_I.field_g.field_l];
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                          }
                          L33: {
                            if (fa.field_n) {
                              ue.field_b = dn.field_p[ce.field_C.field_g.field_l];
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            if (uh.field_b) {
                              stackIn_296_0 = 0;
                              break L34;
                            } else {
                              stackIn_296_0 = 1;
                              break L34;
                            }
                          }
                          wg.field_f = stackIn_296_0 != 0;
                          break L31;
                        }
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
                } else {
                  if (ve.field_nc != gb.field_Ob) {
                    if ((gb.field_Ob ^ -1) == (g.field_L ^ -1)) {
                      L35: {
                        if (!ph.n(-30146)) {
                          L36: {
                            if (null != gh.field_e) {
                              qb.a(3, (byte) 85, gh.field_e);
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          ek.g(param0 + -31870);
                          if (1 == fe.field_b) {
                            vk.a(true, (byte) -53);
                            break L35;
                          } else {
                            if (2 == fe.field_b) {
                              jm.a(0, true);
                              break L35;
                            } else {
                              if (fe.field_b == 3) {
                                jk.a(2, true);
                                break L35;
                              } else {
                                if (fe.field_b != 4) {
                                  if (-6 == (fe.field_b ^ -1)) {
                                    h.field_d = uh.a(o.field_g, false, 0, -111);
                                    break L35;
                                  } else {
                                    if (-7 != (fe.field_b ^ -1)) {
                                      if (fe.field_b == 8) {
                                        am.field_a = ib.a((byte) 82, false);
                                        break L35;
                                      } else {
                                        if (7 == fe.field_b) {
                                          ca.field_wb = oj.a(false, 415);
                                          break L35;
                                        } else {
                                          throw new IllegalStateException(Integer.toString(fe.field_b));
                                        }
                                      }
                                    } else {
                                      cl.field_B = qj.a(-44, false);
                                      break L35;
                                    }
                                  }
                                } else {
                                  dc.a(false, param0 + -30547);
                                  break L35;
                                }
                              }
                            }
                          }
                        } else {
                          break L35;
                        }
                      }
                      gb.field_Ob = lk.field_I;
                      break L1;
                    } else {
                      rf.field_f = rf.field_f - 1;
                      if (-1 != (rf.field_f ^ -1)) {
                        break L1;
                      } else {
                        gb.field_Ob = gb.field_Vb;
                        break L1;
                      }
                    }
                  } else {
                    rf.field_f = rf.field_f + 1;
                    if (rf.field_f == 16) {
                      L37: {
                        if (im.field_f) {
                          gf.a((byte) -126);
                          break L37;
                        } else {
                          ed.a(param0 + -30553);
                          break L37;
                        }
                      }
                      gb.field_Ob = g.field_L;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
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
        if (param0 < 75) {
            return;
        }
        try {
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
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "client.J(" + param0 + ')');
        }
    }

    final void d(int param0) {
        int stackIn_27_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ck var4_ref_ck = null;
        int var4 = 0;
        int var5_int = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        var9 = field_A ? 1 : 0;
        try {
          L0: {
            var2 = ne.d(-86);
            if (!ta.a((byte) -56)) {
              if (!sh.field_j) {
                cn.a(true, var2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!se.i(-1)) {
                  qi.a(100.0f, -81, bg.field_c);
                  cn.a(true, var2);
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
                          stackIn_27_0 = 1;
                          break L1;
                        }
                      }
                    }
                    stackIn_27_0 = 0;
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
                    if (-2 > (ca.field_kb ^ -1)) {
                      sg.field_b.a();
                      break L5;
                    } else {
                      jb.field_a = false;
                      break L5;
                    }
                  }
                  L6: while (true) {
                    L7: {
                      if ((rb.field_e ^ -1) == -1) {
                        ai.e((byte) 84);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (kf.field_I == null) {
                        break L8;
                      } else {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        break L8;
                      }
                    }
                    L9: {
                      if (null != ce.field_C) {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, true, false);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (1 < ca.field_kb) {
                        rb.field_e = rb.field_e + 1;
                        if (jb.field_a) {
                          break L10;
                        } else {
                          if ((ca.field_kb ^ -1) < (rb.field_e ^ -1)) {
                            continue L6;
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (1 >= ca.field_kb) {
                        break L11;
                      } else {
                        L12: {
                          if (rb.field_e < ca.field_kb) {
                            break L12;
                          } else {
                            var4_ref_ck = pa.field_U;
                            pa.field_U = sg.field_b;
                            jb.field_a = true;
                            rb.field_e = 0;
                            sg.field_b = var4_ref_ck;
                            break L12;
                          }
                        }
                        le.field_m.a((byte) -113);
                        pa.field_U.e(0, 0);
                        break L11;
                      }
                    }
                    L13: {
                      if (null != kf.field_I) {
                        kf.field_I.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (ce.field_C != null) {
                        ce.field_C.a(var3 != 0, rb.field_e, ca.field_kb, false, false);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (am.field_c) {
                        break L15;
                      } else {
                        if (!uh.field_b) {
                          L16: {
                            kf.field_G.a(false);
                            var4 = 0;
                            if (null != pd.field_d) {
                              var4 = 1;
                              pd.field_d.c((byte) -75);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          L17: {
                            if (h.field_d == null) {
                              break L17;
                            } else {
                              var4 = 1;
                              h.field_d.h((byte) 99);
                              break L17;
                            }
                          }
                          L18: {
                            if (null == cl.field_B) {
                              break L18;
                            } else {
                              cl.field_B.b((byte) -48);
                              var4 = 1;
                              break L18;
                            }
                          }
                          L19: {
                            if (null == am.field_a) {
                              break L19;
                            } else {
                              am.field_a.i(123);
                              var4 = 1;
                              break L19;
                            }
                          }
                          L20: {
                            if (null == ca.field_wb) {
                              break L20;
                            } else {
                              ca.field_wb.d((byte) 45);
                              var4 = 1;
                              break L20;
                            }
                          }
                          L21: {
                            if (f.field_s != null) {
                              f.field_s.c(2);
                              var4 = 1;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (!gi.field_b) {
                            break L15;
                          } else {
                            if (hh.field_a != ue.field_b) {
                              break L15;
                            } else {
                              if (var4 != 0) {
                                break L15;
                              } else {
                                pb.a(390);
                                break L15;
                              }
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        if (!fm.field_b) {
                          break L23;
                        } else {
                          if (!jg.field_i) {
                            break L23;
                          } else {
                            stackIn_107_0 = 1;
                            break L22;
                          }
                        }
                      }
                      stackIn_107_0 = 0;
                      break L22;
                    }
                    L24: {
                      L25: {
                        var4 = stackIn_107_0;
                        stackIn_116_0 = 88;

                        if (var4 != 0) {
                          break L25;
                        } else {

                          if (kf.field_G != null) {
                            break L25;
                          } else {

                            if (!cb.a((byte) -128)) {
                              break L25;
                            } else {

                              stackIn_117_0 = stackIn_116_0;
                              stackIn_117_1 = 1;
                              break L24;
                            }
                          }
                        }
                      }
                      stackIn_117_0 = stackIn_116_0;
                      stackIn_117_1 = 0;
                      break L24;
                    }
                    L26: {
                      tf.a((byte) stackIn_117_0, stackIn_117_1 != 0);
                      if (var4 != 0) {
                        da.a(false, cb.a((byte) -128));
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (param0 == 320) {
                        break L27;
                      } else {
                        field_B = (String) null;
                        break L27;
                      }
                    }
                    L28: {
                      L29: {
                        if (am.field_c) {
                          break L29;
                        } else {
                          if (!uh.field_b) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      if (kf.field_G != null) {
                        hk.d(0, 0, 640, 480);
                        kf.field_G.f(-26325);
                        if (f.field_s == null) {
                          break L28;
                        } else {
                          f.field_s.c(2);
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L30: {
                      if (cn.f((byte) 99)) {
                        hk.a(320 + -(wk.b(3) / 2) - 34, -(pj.d(20) / 2) + 240 - 24, wk.b(3) + 68, pj.d(126) - -48, 0, 200);
                        vk.a(pj.d(param0 + -356) - -60, (byte) 50, a.field_n, wk.b(3) + 80, 240 - pj.d(-5) / 2 + -30, 320 - wk.b(3) / 2 - 40);
                        uh.b(32659);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (ai.f((byte) 94)) {
                        hk.a(-34 + -(vd.a(480) / 2) + 320, -24 + (-(dj.a(110) / 2) + 240), 68 + vd.a(480), 48 + dj.a(110), 0, 200);
                        vk.a(dj.a(113) - -60, (byte) 50, a.field_n, 80 + vd.a(480), 210 + -(dj.a(108) / 2), 320 - (vd.a(param0 ^ 160) / 2 - -40));
                        cl.a(true);
                        break L31;
                      } else {
                        if (!pk.d(67)) {
                          break L31;
                        } else {
                          L32: {
                            stackIn_149_0 = 112;

                            if (cl.field_v != null) {
                              stackIn_150_0 = stackIn_149_0;
                              stackIn_150_1 = 1;
                              break L32;
                            } else {

                              stackIn_150_0 = stackIn_149_0;
                              stackIn_150_1 = qc.field_N ? 1 : 0;
                              break L32;
                            }
                          }
                          t.a(stackIn_150_0, stackIn_150_1 != 0);
                          break L31;
                        }
                      }
                    }
                    L33: {
                      if (gb.field_Ob != gb.field_Vb) {
                        var5_int = 256 * rf.field_f / 16;
                        if (-1 > (var5_int ^ -1)) {
                          hk.a(0, 0, hk.field_j, hk.field_i, 0, var5_int);
                          break L33;
                        } else {
                          break L33;
                        }
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (2 <= te.field_p) {
                        var5 = Runtime.getRuntime().totalMemory() / 1024L;
                        var7 = -(Runtime.getRuntime().freeMemory() / 1024L) + var5;
                        se.field_S.a("FPS: " + jf.field_c, 12, 38, 16777215, 1);
                        se.field_S.a(var7 + "/" + var5 + " kB", 12, 52, 16777215, 1);
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    mf.a(1, 0, 0, var2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              jf.a(var2, cd.a(param0 ^ 8512), -6351);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "client.F(" + param0 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (8 <= var2_int) {
                this.i((byte) 51);
                var2_int = 0;
                if (param0 == 11978) {
                  L2: while (true) {
                    if (8 <= var2_int) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (pg.field_a[var2_int]) {
                          break L3;
                        } else {
                          if (wf.field_l[var2_int] != null) {
                            wf.field_l[var2_int].f(0);
                            if (wf.field_l[var2_int].a((byte) 78)) {
                              break L3;
                            } else {
                              wf.field_l[var2_int] = null;
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (ah.field_b[var2_int]) {
                          break L4;
                        } else {
                          if (null == ik.field_c[var2_int]) {
                            break L4;
                          } else {
                            ik.field_c[var2_int].g(en.field_o / 50);
                            ik.field_c[var2_int] = null;
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (sk.field_a[0][var2_int] == null) {
                          break L5;
                        } else {
                          var3 = kd.field_s[0][var2_int];
                          if (0 != var3) {
                            sk.field_a[0][var2_int].e(en.field_o / 50, pb.field_d * var3);
                            break L5;
                          } else {
                            sk.field_a[0][var2_int].g(en.field_o / 50);
                            sk.field_a[0][var2_int] = null;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (null != sk.field_a[1][var2_int]) {
                          var3 = kd.field_s[1][var2_int];
                          if (0 != var3) {
                            sk.field_a[1][var2_int].e(en.field_o / 50, var3 * pb.field_d);
                            break L6;
                          } else {
                            sk.field_a[1][var2_int].g(en.field_o / 50);
                            sk.field_a[1][var2_int] = null;
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      var2_int++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                pg.field_a[var2_int] = false;
                ah.field_b[var2_int] = false;
                kd.field_s[0][var2_int] = 9 * kd.field_s[0][var2_int] / 10;
                kd.field_s[1][var2_int] = 9 * kd.field_s[1][var2_int] / 10;
                var2_int++;
                continue L1;
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
        try {
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
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "client.G(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, byte param6) {
        w dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
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
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        ve stackIn_16_0 = null;
        w stackIn_16_1 = null;
        w stackIn_16_2 = null;
        long stackIn_16_3 = 0L;
        ve stackIn_17_0 = null;
        w stackIn_17_1 = null;
        w stackIn_17_2 = null;
        long stackIn_17_3 = 0L;
        ve stackIn_18_0 = null;
        w stackIn_18_1 = null;
        w stackIn_18_2 = null;
        long stackIn_18_3 = 0L;
        w stackIn_18_4 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        ve stackIn_40_0 = null;
        w stackIn_40_1 = null;
        w stackIn_40_2 = null;
        long stackIn_40_3 = 0L;
        ve stackIn_42_0 = null;
        w stackIn_42_1 = null;
        w stackIn_42_2 = null;
        long stackIn_42_3 = 0L;
        ve stackIn_43_0 = null;
        w stackIn_43_1 = null;
        w stackIn_43_2 = null;
        long stackIn_43_3 = 0L;
        w stackIn_43_4 = null;
        int stackIn_48_0 = 0;
        int stackIn_122_0 = 0;
        ck[] stackIn_126_0 = null;
        int stackIn_137_0 = 0;
        ck[] stackIn_138_0 = null;
        ck[] stackIn_140_0 = null;
        ck[] stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        ck[] stackIn_148_0 = null;
        ck[] stackIn_150_0 = null;
        ck[] stackIn_152_0 = null;
        ck[] stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        ck[] stackIn_160_0 = null;
        boolean stackIn_212_0 = false;
        String stackIn_224_0 = null;
        boolean stackIn_232_0 = false;
        String stackIn_245_0 = null;
        String stackIn_259_0 = null;
        String stackIn_267_0 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        vj var8 = null;
        long var9 = 0L;
        Object var11 = null;
        ve var12 = null;
        int var13 = 0;
        int var14 = 0;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        int var18_int = 0;
        w var18 = null;
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
        int var33_int = 0;
        String var33 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var41 = field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_4_0 = gf.field_c;
                    stackIn_2_0 = stackIn_4_0;
                    stackIn_4_1 = 2 * (kf.field_O - -2);
                    stackIn_2_1 = stackIn_4_1;
                    stackIn_4_2 = (kf.field_O * 4 + 8) * param0;
                    stackIn_2_2 = stackIn_4_2;
                    stackIn_4_3 = -15230;
                    stackIn_2_3 = stackIn_4_3;
                    if (ki.field_w != gf.field_c) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_5_0 = (nm) ((Object) stackIn_2_0);
                    stackIn_5_1 = stackIn_2_1;
                    stackIn_5_2 = stackIn_2_2;
                    stackIn_5_3 = stackIn_2_3;
                    stackIn_5_4 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = (nm) ((Object) stackIn_4_0);
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = stackIn_4_3;
                    stackIn_5_4 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var7_int = ((nm) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, 2, param2) ? 1 : 0;
                    var8 = gf.field_c.field_Ob.field_M;
                    if (param6 <= -48) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    client.j((byte) 82);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var9 = ik.a(4);
                    var11 = null;
                    var12 = (ve) ((Object) var8.c((byte) -101));
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (null == var12) {
                        statePc = 298;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var13 = 0;
                    if (null != var12.field_M) {
                        statePc = 44;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = param3;
                    stackIn_15_1 = param1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var14 = stackIn_15_0 | stackIn_15_1;
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
                    stackIn_17_0 = (ve) (var12);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = null;
                    stackIn_16_1 = stackIn_17_1;
                    stackIn_17_2 = null;
                    stackIn_16_2 = stackIn_17_2;
                    stackIn_17_3 = 0L;
                    stackIn_16_3 = stackIn_17_3;
                    if (pd.field_a) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (ve) ((Object) stackIn_16_0);
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = stackIn_16_3;
                    stackIn_18_4 = gg.field_G;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (ve) ((Object) stackIn_17_0);
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = stackIn_17_3;
                    stackIn_18_4 = fc.field_f;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_18_0.field_zc = new w(stackIn_18_3, stackIn_18_4);
                    var12.a(var12.field_zc, -16834);
                    var12.field_fc = new w[j.field_b];
                    var12.field_pc = new w(0L, (w) null);
                    if ((var14 & 1 << u.field_f ^ -1) != -1) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var12.field_zc.a(var12.field_pc, -16834);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var12.field_Ac = new w(0L, (w) null);
                    if (-1 != (var14 & 1 << u.field_b ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var12.field_zc.a(var12.field_Ac, -16834);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var12.field_Tb = new w(0L, (w) null);
                    if ((1 << rf.field_a & var14 ^ -1) == -1) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12.field_zc.a(var12.field_Tb, -16834);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var12.field_Fc = new w(0L, (w) null);
                    if ((1 << ul.field_f & var14 ^ -1) != -1) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var12.field_zc.a(var12.field_Fc, -16834);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var15 = var12.field_pc;
                    var16 = var12.field_Fc;
                    var12.field_Tb.field_W = 1;
                    var17 = var12.field_Ac;
                    var17.field_W = 1;
                    var16.field_W = 1;
                    var15.field_W = 1;
                    var18_int = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if ((j.field_b ^ -1) >= (var18_int ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var12.field_fc[var18_int] = new w(0L, (w) null);
                    stackIn_15_0 = 1 << var18_int + um.field_a & var14 ^ -1;
                    stackIn_35_0 = stackIn_15_0;
                    stackIn_15_1 = -1;
                    stackIn_35_1 = stackIn_15_1;
                    if (false) {
                        statePc = 15;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 == stackIn_35_1) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var12.field_zc.a(var12.field_fc[var18_int], -16834);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var12.field_fc[var18_int].field_W = 1;
                    var18_int++;
                    statePc = 33;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_42_0 = (ve) (var12);
                    stackIn_40_0 = stackIn_42_0;
                    stackIn_42_1 = null;
                    stackIn_40_1 = stackIn_42_1;
                    stackIn_42_2 = null;
                    stackIn_40_2 = stackIn_42_2;
                    stackIn_42_3 = 0L;
                    stackIn_40_3 = stackIn_42_3;
                    if (!pd.field_a) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_43_0 = (ve) ((Object) stackIn_40_0);
                    stackIn_43_1 = null;
                    stackIn_43_2 = null;
                    stackIn_43_3 = stackIn_40_3;
                    stackIn_43_4 = gg.field_G;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = (ve) ((Object) stackIn_42_0);
                    stackIn_43_1 = null;
                    stackIn_43_2 = null;
                    stackIn_43_3 = stackIn_42_3;
                    stackIn_43_4 = fc.field_f;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_43_0.field_yc = new w(stackIn_43_3, stackIn_43_4);
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
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var12.field_lc) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_48_0 = param1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = param3;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var14 = stackIn_48_0;
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
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (j.field_b <= var22_int) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12.field_fc[var22_int].field_I = null;
                    var23 = var12.field_fc[var22_int];
                    var12.field_fc[var22_int].field_N = 0;
                    var23.field_mb = 0;
                    var22_int++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 53: {
                    var12.field_pc.field_I = null;
                    var12.field_pc.field_N = 0;
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
                        statePc = 198;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (!var12.field_lc) {
                        statePc = 84;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if ((var12.field_Nb ^ -1) > -1) {
                        statePc = 63;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var12.field_Pb.field_Y = uf.field_t;
                    statePc = 101;
                    continue stateLoop;
                }
                case 63: {
                    if (!var12.field_wc) {
                        statePc = 72;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var12.field_gc) {
                        statePc = 81;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var12.field_Zb) {
                        statePc = 81;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (-3 != (var12.field_qc ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var12.field_Yb.field_Y = gd.field_h;
                    statePc = 101;
                    continue stateLoop;
                }
                case 78: {
                    var12.field_Pb.field_Y = ak.field_i;
                    statePc = 101;
                    continue stateLoop;
                }
                case 81: {
                    var12.field_Yb.field_Y = gb.field_ac;
                    statePc = 101;
                    continue stateLoop;
                }
                case 84: {
                    if (var12.field_gc) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (!var12.field_Zb) {
                        statePc = 93;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var12.field_Yb.field_Y = gb.field_ac;
                    statePc = 101;
                    continue stateLoop;
                }
                case 93: {
                    if (!var12.field_Cc) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var12.field_Pb.field_Y = cd.field_l;
                    statePc = 101;
                    continue stateLoop;
                }
                case 99: {
                    var12.field_Pb.field_Y = pc.field_d;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (null != var12.field_Yb.field_Y) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var12.field_Pb.a(68, 0, var31, kf.field_O, 0);
                    statePc = 107;
                    continue stateLoop;
                }
                case 105: {
                    var12.field_Yb.a(68, 0, var31, kf.field_O, 0);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    var12.field_Bc.field_Y = mm.a(var12.field_Bc.field_J, var32, 78);
                    var12.field_Bc.a(78, 0, var31, kf.field_O, 70);
                    if (!var12.field_Bc.field_jb) {
                        statePc = 114;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (!var12.field_Bc.field_Y.equals(var32)) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    sl.field_g = var32;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var12.field_Dc.field_Y = Integer.toString(var12.field_rc);
                    if (!var12.field_wc) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var12.field_Dc.field_X = 2;
                    var12.field_ec.field_Y = "/" + var12.field_mc;
                    var33_int = (-var12.field_ec.field_J.a("/") + 348) / 2;
                    var12.field_Dc.a(var33_int - 150, 0, var31, kf.field_O, 150);
                    var12.field_ec.a(198 - var33_int, 0, var31, kf.field_O, var33_int);
                    statePc = 118;
                    continue stateLoop;
                }
                case 116: {
                    var12.field_Dc.field_X = 1;
                    var12.field_Dc.a(48, 0, var31, kf.field_O, 150);
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var12.field_jc.field_Y = Integer.toString(var12.field_Ub);
                    var12.field_jc.a(48, 0, var31, kf.field_O, 200);
                    if (!pd.field_a) {
                        statePc = 121;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_122_0 = 250;
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_122_0 = 200;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    var33_int = stackIn_122_0;
                    var12.field_zc.a(-2 + (-var33_int + 365), 0, var31, kf.field_O, var33_int);
                    var34_int = j.field_c;
                    if (0 != (var14 & 1 << u.field_f)) {
                        statePc = 125;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = fj.field_a;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var35 = stackIn_126_0[var12.field_Wb];
                    var12.field_pc.field_I = var35;
                    var12.field_pc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                    var34_int = var34_int + (var35.field_K - -j.field_c);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (0 != (var14 & 1 << u.field_b)) {
                        statePc = 130;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (var12.field_gc) {
                        statePc = 134;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (!var12.field_Zb) {
                        statePc = 136;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_137_0 = 1;
                    statePc = 137;
                    continue stateLoop;
                }
                case 136: {
                    stackIn_137_0 = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    var36 = stackIn_137_0;
                    stackIn_140_0 = (ck[]) (field_x);
                    stackIn_138_0 = stackIn_140_0;
                    if (var36 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackIn_141_0 = (ck[]) ((Object) stackIn_138_0);
                    stackIn_141_1 = 1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 140: {
                    stackIn_141_0 = (ck[]) ((Object) stackIn_140_0);
                    stackIn_141_1 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var35 = stackIn_141_0[stackIn_141_1];
                    var12.field_Ac.field_I = var35;
                    var12.field_Ac.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                    var34_int = var34_int + (var35.field_K - -j.field_c);
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if ((1 << rf.field_a & var14) != 0) {
                        statePc = 145;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var35 = bb.field_b[-1 + var12.field_qc];
                    var12.field_Tb.field_I = var35;
                    var12.field_Tb.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                    var34_int = var34_int + (j.field_c + var35.field_K);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if ((1 << ul.field_f & var14 ^ -1) == -1) {
                        statePc = 154;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackIn_152_0 = si.field_d;
                    stackIn_148_0 = stackIn_152_0;
                    if (!var12.field_Ic) {
                        statePc = 152;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    stackIn_150_0 = (ck[]) ((Object) stackIn_148_0);
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    stackIn_153_0 = (ck[]) ((Object) stackIn_150_0);
                    stackIn_153_1 = 1;
                    statePc = 153;
                    continue stateLoop;
                }
                case 152: {
                    stackIn_153_0 = (ck[]) ((Object) stackIn_152_0);
                    stackIn_153_1 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    var35 = stackIn_153_0[stackIn_153_1];
                    var12.field_Fc.field_I = var35;
                    var12.field_Fc.a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                    var34_int = var34_int + (j.field_c + var35.field_K);
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (null != be.field_u) {
                        statePc = 157;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var36 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (j.field_b <= var36) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackIn_126_0 = be.field_u[var36];
                    stackIn_160_0 = stackIn_126_0;
                    if (false) {
                        statePc = 126;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (stackIn_160_0 == null) {
                        statePc = 165;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if ((var14 & 1 << um.field_a - -var36) == 0) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var35 = be.field_u[var36][var12.field_kc[var36] & 255];
                    var12.field_fc[var36].field_I = var35;
                    var12.field_fc[var36].a(var35.field_K, 0, 0, var12.field_zc.field_N, var34_int);
                    var34_int = var34_int + (var35.field_K + j.field_c);
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var36++;
                    statePc = 158;
                    continue stateLoop;
                }
                case 166: {
                    var36 = (-var34_int + var12.field_zc.field_mb) / 2;
                    if (var36 > 0) {
                        statePc = 169;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var12.field_pc.field_vb = var12.field_pc.field_vb + var36;
                    var12.field_Ac.field_vb = var12.field_Ac.field_vb + var36;
                    var12.field_Tb.field_vb = var12.field_Tb.field_vb + var36;
                    var12.field_Fc.field_vb = var12.field_Fc.field_vb + var36;
                    var37_int = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if ((j.field_b ^ -1) >= (var37_int ^ -1)) {
                        statePc = 174;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    dupTemp$0 = var12.field_fc[var37_int];
                    dupTemp$0.field_vb = dupTemp$0.field_vb + var36;
                    var37_int++;
                    statePc = 170;
                    continue stateLoop;
                }
                case 174: {
                    if (!var12.field_lc) {
                        statePc = 183;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var37_int = var12.field_Nb;
                    if (-1 < (var37_int ^ -1)) {
                        statePc = 178;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var37_int = (int)(var9 + -var12.field_tc);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var38_int = var37_int / 1000;
                    var39 = var38_int / 60;
                    var38_int = var38_int % 60;
                    if ((var39 ^ -1) > -61) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var40 = var39 / 60;
                    var39 = var39 % 60;
                    var12.field_yc.field_Y = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                    statePc = 183;
                    continue stateLoop;
                }
                case 181: {
                    var12.field_yc.field_Y = var39 + ":" + var38_int / 10 + var38_int % 10;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    var12.field_yc.a(var12.field_mb + -365, 0, var31, kf.field_O, 365);
                    var31 = var31 + kf.field_O;
                    if (null == var12.field_xc) {
                        statePc = 190;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var31 += 2;
                    var37 = new StringBuilder(64);
                    discarded$1 = var37.append(jg.field_c);
                    discarded$2 = var37.append(var12.field_xc[0]);
                    var38_int = 1;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (var38_int >= var12.field_rc) {
                        statePc = 189;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    discarded$3 = var37.append(", ");
                    discarded$4 = var37.append(var12.field_xc[var38_int]);
                    var38_int++;
                    statePc = 185;
                    continue stateLoop;
                }
                case 189: {
                    var38 = var37.toString();
                    var12.field_Sb.field_Y = var38;
                    var39 = var12.field_Sb.field_J.a(var38, var12.field_mb + -(2 * var12.field_Sb.field_ub));
                    var12.field_Sb.a(var12.field_mb, 0, var31, var39 * kf.field_O, 0);
                    var31 = var31 + kf.field_O * var39;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    if (var12.field_Zb) {
                        statePc = 193;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var12.field_Ec.field_Y = cm.a((byte) 121, li.field_g, new String[]{var32});
                    var12.field_Ec.a(-(2 * nk.field_b) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                    var31 = var31 + kf.field_O;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (var12.field_Ob) {
                        statePc = 197;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var12.field_bc.field_Y = cm.a((byte) 106, qe.field_b, new String[]{var32});
                    var12.field_bc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, kf.field_O, nk.field_b);
                    var31 = var31 + kf.field_O;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    var33 = vk.a(var32, var12.field_oc, true);
                    if (var33 != null) {
                        statePc = 201;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var34_int = var12.field_sc.field_J.a(var33, -nk.field_b + (var12.field_mb - nk.field_b));
                    var12.field_sc.field_wb = var12.field_Rb * 256 / oa.field_a;
                    var12.field_sc.field_Y = var33;
                    var12.field_sc.a(-(nk.field_b * 2) + var12.field_mb, 0, var31, var34_int * kf.field_O, nk.field_b);
                    var31 = var31 + kf.field_O * var34_int;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (var7_int != 0) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var12.field_F = var31 - var12.field_N;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (var13 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 208: {
                    gf.field_c.field_Ob.a((w) (var11), var12, 2, 0);
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    var34_int = 0;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    if ((var34_int ^ -1) <= (j.field_b ^ -1)) {
                        statePc = 231;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackIn_232_0 = var12.field_fc[var34_int].field_jb;
                    stackIn_212_0 = stackIn_232_0;
                    if (false) {
                        statePc = 232;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (!stackIn_212_0) {
                        statePc = 230;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (hb.field_Qb != null) {
                        statePc = 220;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    stackIn_224_0 = null;
                    statePc = 224;
                    continue stateLoop;
                }
                case 220: {
                    if (null == hb.field_Qb[var34_int]) {
                        statePc = 223;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    stackIn_224_0 = hb.field_Qb[var34_int][var12.field_kc[var34_int] & 255];
                    statePc = 224;
                    continue stateLoop;
                }
                case 223: {
                    stackIn_224_0 = null;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    var35_ref = stackIn_224_0;
                    if (var35_ref == null) {
                        statePc = 228;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    sl.field_g = pa.field_db[var34_int] + " - " + var35_ref;
                    statePc = 230;
                    continue stateLoop;
                }
                case 228: {
                    sl.field_g = pa.field_db[var34_int];
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    var34_int++;
                    statePc = 210;
                    continue stateLoop;
                }
                case 231: {
                    stackIn_232_0 = var12.field_pc.field_jb;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (stackIn_232_0) {
                        statePc = 234;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if ((var12.field_Wb ^ -1) != -2) {
                        statePc = 236;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var34 = bh.field_j;
                    statePc = 237;
                    continue stateLoop;
                }
                case 236: {
                    var34 = ed.field_b[var12.field_Wb];
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    sl.field_g = hl.field_c + " - " + var34;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (!var12.field_Fc.field_jb) {
                        statePc = 246;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var12.field_Ic) {
                        statePc = 244;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    stackIn_245_0 = si.field_k;
                    statePc = 245;
                    continue stateLoop;
                }
                case 244: {
                    stackIn_245_0 = cl.field_s;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    sl.field_g = stackIn_245_0;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (!var12.field_Ac.field_jb) {
                        statePc = 260;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (var12.field_gc) {
                        statePc = 253;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (!var12.field_Zb) {
                        statePc = 255;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    stackIn_259_0 = wa.field_f;
                    statePc = 259;
                    continue stateLoop;
                }
                case 255: {
                    if (!var12.field_wc) {
                        statePc = 258;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    stackIn_259_0 = bh.field_c;
                    statePc = 259;
                    continue stateLoop;
                }
                case 258: {
                    stackIn_259_0 = ec.field_b;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    sl.field_g = stackIn_259_0;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if (var12.field_Tb.field_jb) {
                        statePc = 263;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (var12.field_qc != 2) {
                        statePc = 266;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    stackIn_267_0 = tl.field_r;
                    statePc = 267;
                    continue stateLoop;
                }
                case 266: {
                    stackIn_267_0 = bc.field_F;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    sl.field_g = stackIn_267_0;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if ((var12.field_ob ^ -1) == -1) {
                        statePc = 295;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (!var12.i((byte) 100)) {
                        statePc = 274;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 274: {
                    if (-1 == (var12.field_Yb.field_ob ^ -1)) {
                        statePc = 293;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (!var12.field_lc) {
                        statePc = 287;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (!var12.field_wc) {
                        statePc = 290;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (var12.field_gc) {
                        statePc = 287;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (!var12.field_Zb) {
                        statePc = 290;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    cg.a(var12.e(-36), (byte) -9, param5);
                    statePc = 295;
                    continue stateLoop;
                }
                case 290: {
                    ga.a(false, var12.e(-87), param5);
                    statePc = 295;
                    continue stateLoop;
                }
                case 293: {
                    hd.a(0, param4, var12, var32);
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    var12 = (ve) ((Object) var8.d(true));
                    statePc = 9;
                    continue stateLoop;
                }
                case 298: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean n(int param0) {
        ck[] dupTemp$0 = null;
        ck[] dupTemp$1 = null;
        ck[] dupTemp$2 = null;
        ck[] dupTemp$3 = null;
        ck[] dupTemp$4 = null;
        ck[] dupTemp$5 = null;
        ck[] dupTemp$6 = null;
        ck[] dupTemp$7 = null;
        RuntimeException var2 = null;
        int var20 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_107_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        je var2_ref = null;
        pi[] var2_array = null;
        byte[] var3 = null;
        pi[] var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        ck var6 = null;
        Object var6_ref = null;
        pi var7 = null;
        ck[] var7_array = null;
        byte[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        ck var10 = null;
        ck[] var10_array = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (null != jj.field_c) {
                        statePc = 4;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 4: {
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
                    stackIn_5_0 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    if (wg.field_h != null) {
                        statePc = 9;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 9: {
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
                    stackIn_10_0 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    if (null != ph.field_Db) {
                        statePc = 14;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 14: {
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
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var4.length ^ -1) >= (var6_int ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7 = var4[var6_int];
                    var8 = new byte[4 * (var7.field_i * var7.field_b)];
                    var9_int = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var9_int >= var7.field_i) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10_int = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var7.field_b <= var10_int) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var11_int = var7.field_k[var7.field_b * var9_int + var10_int];
                    var12_int = 2 * var10_int + 4 * var7.field_b * var9_int;
                    var8[var12_int] = (byte) var11_int;
                    var8[1 + var12_int] = (byte) var11_int;
                    var8[var12_int + 2 * var7.field_b] = (byte) var11_int;
                    var8[var7.field_b * 2 + var12_int - -1] = (byte) var11_int;
                    var10_int++;
                    statePc = 19;
                    continue stateLoop;
                }
                case 23: {
                    var9_int++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 24: {
                    var7.field_d = var7.field_d * 2;
                    var7.field_g = var7.field_g * 2;
                    var7.field_a = var7.field_a * 2;
                    var7.field_b = var7.field_b * 2;
                    var7.field_i = var7.field_i * 2;
                    var7.field_k = var8;
                    var7.field_c = var7.field_c * 2;
                    var6_int++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 25: {
                    var6_int = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((var6_int ^ -1) <= (var5.length ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var5[var6_int] = (byte)(var5[var6_int] * 2);
                    var6_int++;
                    statePc = 26;
                    continue stateLoop;
                }
                case 30: {
                    a.field_t = gg.a(var4, param0 ^ 103, var5);
                    eh.field_j = ge.a((byte) 100, 16694016, 2, var4, var5, 1);
                    eh.field_j.field_X[1] = new int[]{0, 16777215, 1};
                    var6_int = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var6_int ^ -1) <= (var4.length ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var7 = var4[var6_int];
                    var8 = new byte[var7.field_b * var7.field_i * 9 / 4];
                    var9_int = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if ((var7.field_i ^ -1) >= (var9_int ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var10_int = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var10_int >= var7.field_b) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
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
                    statePc = 35;
                    continue stateLoop;
                }
                case 39: {
                    var9_int += 2;
                    statePc = 33;
                    continue stateLoop;
                }
                case 40: {
                    var7.field_d = 3 * var7.field_d / 2;
                    var7.field_i = var7.field_i * 3 / 2;
                    var7.field_k = var8;
                    var7.field_c = var7.field_c * 3 / 2;
                    var7.field_g = var7.field_g * 3 / 2;
                    var7.field_b = var7.field_b * 3 / 2;
                    var7.field_a = var7.field_a * 3 / 2;
                    var6_int++;
                    statePc = 31;
                    continue stateLoop;
                }
                case 41: {
                    var6_int = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if ((var5.length ^ -1) >= (var6_int ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var5[var6_int] = (byte)(var5[var6_int] * 3 / 2);
                    var6_int++;
                    statePc = 42;
                    continue stateLoop;
                }
                case 46: {
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
                    var6 = id.a(ah.field_i, "orbcoin", "basic", 8192);
                    rn.field_c = new ck(20, 20);
                    rn.field_c.a();
                    var6.a(0, 0, 20, 20);
                    le.field_m.a((byte) -106);
                    var6_ref = null;
                    gf.field_f = t.a("solid_mask", ii.field_t, false, "");
                    oa.field_b = bj.a(112, ii.field_t, "", "pop");
                    qf.field_h = si.a(param0 ^ 25972, false, bj.a(112, ii.field_t, "", "explode"), false);
                    qm.field_c = me.a(id.a(ii.field_t, "wildcard", "", 8192), false, (byte) -28, false);
                    kd.field_t = qm.field_c.c();
                    var7_array = bj.a(112, ii.field_t, "", "specialitems");
                    var8_int = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (-7 >= (var8_int ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var9_int = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (4 <= var9_int) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ik.field_b[var8_int][var9_int] = me.a(var7_array[var8_int * 4 - -var9_int], false, (byte) -55, false);
                    var9_int++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 53: {
                    var8_int++;
                    statePc = 47;
                    continue stateLoop;
                }
                case 54: {
                    var8_int = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if ((var8_int ^ -1) <= -9) {
                        statePc = 80;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var7_array = bj.a(param0 + 112, ii.field_t, "", ri.field_f[var8_int] + "_tiles");
                    var9_int = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (7 <= var9_int) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    fb.field_c[var8_int][var9_int] = me.a(var7_array[var9_int], false, (byte) -63, false);
                    var9_int++;
                    statePc = 57;
                    continue stateLoop;
                }
                case 61: {
                    fb.field_c[var8_int][7] = kd.field_t;
                    var9_int = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (-8 >= (var9_int ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var10 = me.a(var7_array[var9_int + 7], true, (byte) -124, true);
                    var11_int = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = -17;
                    stackIn_65_1 = var11_int ^ -1;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 >= stackIn_65_1) {
                        statePc = 78;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var12 = var10.c();
                    var12.a();
                    fb.field_c[var8_int][var9_int].b(6, 6, 24, 24);
                    var10.c(0, 0, 128);
                    var13 = gf.field_f[var11_int];
                    var14 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (1296 <= var14) {
                        statePc = 77;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var15 = var13.field_l[var13.field_k[var14] & 255] & 255;
                    var16 = var12.field_D[var14];
                    stackIn_65_0 = var15;
                    stackIn_69_0 = stackIn_65_0;
                    stackIn_65_1 = 128;
                    stackIn_69_1 = stackIn_65_1;
                    if (false) {
                        statePc = 65;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 <= stackIn_69_1) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var17 = 131586 * (var15 - 128);
                    var18 = var16;
                    var19 = var18 + var17;
                    var17 = (16711935 & var18) + (16711935 & var17);
                    var18 = (-var17 + var19 & 65536) + (16777472 & var17);
                    var16 = var19 - var18 | var18 + -(var18 >>> -74352984);
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    var16 = ((var16 & 16711935) * var15 >> 1802741479 & 16711935) + (((65280 & var16) * var15 & 8355876) >> -816570233);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (var16 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var16 = 1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var12.field_D[var14] = var16;
                    var14++;
                    statePc = 67;
                    continue stateLoop;
                }
                case 77: {
                    ob.field_j[var8_int][var9_int][var11_int] = var12;
                    var11_int++;
                    statePc = 64;
                    continue stateLoop;
                }
                case 78: {
                    var9_int++;
                    statePc = 62;
                    continue stateLoop;
                }
                case 79: {
                    s.field_Qb[var8_int] = id.a(ii.field_t, ri.field_f[var8_int] + "_bucketback", "", 8192);
                    s.field_Qb[var8_int].b();
                    var8_int++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 80: {
                    le.field_m.a((byte) -114);
                    var8_int = 0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (8 <= var8_int) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var9 = eg.field_e.a(param0 + 0, "", ri.field_f[var8_int] + ".jpg");
                    dn.field_p[var8_int] = new ck(var9, (java.awt.Component) ((Object) jh.field_b));
                    var8_int++;
                    statePc = 81;
                    continue stateLoop;
                }
                case 83: {
                    var8 = eg.field_e.a(param0 + 0, "", "menu2.jpg");
                    tc.field_Tb = new ck(var8, (java.awt.Component) ((Object) jh.field_b));
                    var9 = eg.field_e.a(0, "", "achievements.jpg");
                    uf.field_y = fc.a(31, new ck(var9, (java.awt.Component) ((Object) jh.field_b)), -10241);
                    var10_array = bj.a(112, ii.field_t, "", "achievements");
                    var11_int = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (-32 >= (var11_int ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var10_array[var11_int].b();
                    mg.a(0, var10_array[var11_int], uf.field_y[var11_int]);
                    var10_array[var11_int] = null;
                    var11_int++;
                    statePc = 84;
                    continue stateLoop;
                }
                case 86: {
                    var10_array = null;
                    tl.field_w = new ck[31];
                    var11_int = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (-32 >= (var11_int ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    tl.field_w[var11_int] = new ck(32, 32);
                    tl.field_w[var11_int].a();
                    uf.field_y[var11_int].a(0, 0, 32, 32);
                    var11_int++;
                    statePc = 87;
                    continue stateLoop;
                }
                case 91: {
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
                    dupTemp$0 = si.a(25972, false, bj.a(112, ii.field_t, "", "animals_sidespr"), true);
                    rb.field_j[1] = dupTemp$0;
                    hf.field_e[1] = dupTemp$0;
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
                    dupTemp$1 = si.a(25972, false, bj.a(112, ii.field_t, "", "bugs_sidespr"), true);
                    rb.field_j[3] = dupTemp$1;
                    hf.field_e[3] = dupTemp$1;
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
                    dupTemp$2 = si.a(25972, false, bj.a(112, ii.field_t, "", "undersea_sidespr"), true);
                    rb.field_j[5] = dupTemp$2;
                    hf.field_e[5] = dupTemp$2;
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
                    var11_int = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (-9 >= (var11_int ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    on.a(uj.field_d[var11_int], 19264);
                    on.a(rb.field_d[var11_int], param0 + 19264);
                    on.a(ad.field_j[var11_int], 19264);
                    uh.a(cc.field_f[var11_int], (byte) 115);
                    uh.a(sc.field_j[var11_int], (byte) -118);
                    uh.a(fk.field_G[var11_int], (byte) 114);
                    var12_int = 0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if ((var12_int ^ -1) <= (ve.field_uc[var11_int].length ^ -1)) {
                        statePc = 98;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    ve.field_uc[var11_int][var12_int].b();
                    var12_int++;
                    statePc = 94;
                    continue stateLoop;
                }
                case 98: {
                    var11_int++;
                    statePc = 92;
                    continue stateLoop;
                }
                case 99: {
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
                    var11 = new ck[5][];
                    var12_array = new ck[5][];
                    dupTemp$3 = bj.a(112, ii.field_t, "", "bucketsize_icons");
                    var12_array[0] = dupTemp$3;
                    var11[0] = dupTemp$3;
                    dupTemp$4 = bj.a(112, ii.field_t, "", "speed_icons");
                    var12_array[1] = dupTemp$4;
                    var11[1] = dupTemp$4;
                    dupTemp$5 = bj.a(param0 + 112, ii.field_t, "", "shapefeedback_icons");
                    var12_array[4] = dupTemp$5;
                    var11[4] = dupTemp$5;
                    lf.field_h = dupTemp$5;
                    dupTemp$6 = bj.a(112, ii.field_t, "", "colours_icons");
                    var12_array[2] = dupTemp$6;
                    var11[2] = dupTemp$6;
                    dupTemp$7 = bj.a(112, ii.field_t, "", "specialitems_icons");
                    var12_array[3] = dupTemp$7;
                    var11[3] = dupTemp$7;
                    bg.a(vl.field_A, nd.field_a, si.field_f, pf.field_d, 8, qd.field_Pb, ah.field_i, 5, 25150, qc.field_vb, var11, var12_array, true, vb.field_S, tg.field_d);
                    gm.a(-3504, 200);
                    qf.a(ah.field_i, qc.field_vb, -96);
                    rf.a(ac.field_z, 0, 180, -94, 16694016, (java.applet.Applet) (this));
                    qc.field_vb = null;
                    ph.field_Db = null;
                    vj.a(true);
                    stackIn_100_0 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    return stackIn_100_0 != 0;
                }
                case 101: {
                    if (cl.field_y != null) {
                        statePc = 104;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 104: {
                    ge.a((byte) -93, new jk(cl.field_y.a(0, "huffman", "")));
                    cl.field_y = null;
                    vj.a(true);
                    stackIn_105_0 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    return stackIn_105_0 != 0;
                }
                case 106: {
                    bj.a(320, on.field_e, eh.field_j, true, km.field_A, 20, param0, 4, 1, 20, 20, 20, a.field_n, 14, 480, 240, im.field_i, 32, 16, 0, 5);
                    ie.a(on.field_e, km.field_A, a.field_n, 320, 20, 0, 32, 20, 240, 4, 5, 20, eh.field_j, im.field_i, 1, 14, 10406, 0, 16, 20);
                    kf.field_G = f.a(false, false, 0, false, false, 32357, false, false);
                    bd.a(50, -27096);
                    le.a((byte) 86, 50);
                    af.a(param0 + 4, 50);
                    nn.a(256, jg.field_a, true);
                    vj.a(true);
                    stackIn_107_0 = 1;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    return stackIn_107_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                client.a((String) null, -100);
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
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_11_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("client.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
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
