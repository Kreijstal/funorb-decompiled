/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_b;
    static String field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(lg.field_d == null)) {
            var2 = param0.getKeyChar();
            if (0 != var2) {
                if (var2 != 65535) {
                    if (s.a((char) var2, 0)) {
                        var3 = 127 & ce.field_e - -1;
                        if (ph.field_h != var3) {
                            ag.field_a[ce.field_e] = -1;
                            hj.field_a[ce.field_e] = (char)var2;
                            ce.field_e = var3;
                        }
                    }
                }
            }
        }
        param0.consume();
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        if (null != lg.field_d) {
            si.field_o = 0;
            var2 = param0.getKeyCode();
            if (0 <= var2) {
                // if_icmple L42
                var2 = -129 & o.field_a[var2];
            } else {
                var2 = -1;
            }
            if (0 <= lk.field_e) {
                if (!(0 > var2)) {
                    kl.field_h[lk.field_e] = var2 ^ -1;
                    lk.field_e = 1 + lk.field_e & 127;
                    if (sc.field_i == lk.field_e) {
                        lk.field_e = -1;
                    }
                }
            }
        }
        param0.consume();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2 = 0;
        int var3 = 0;
        if (null == lg.field_d) {
        } else {
            si.field_o = 0;
            var2 = param0.getKeyCode();
            if (var2 >= 0) {
                // if_icmpge L50
                var2 = o.field_a[var2];
                // ifeq L52
                var2 = -1;
            } else {
                var2 = -1;
            }
            if (lk.field_e <= -1) {
                if (!(-1 > var2)) {
                    kl.field_h[lk.field_e] = var2;
                    lk.field_e = lk.field_e - -1 & 127;
                    if (sc.field_i == lk.field_e) {
                        lk.field_e = -1;
                    }
                }
            }
            if (!(var2 < 0)) {
                var3 = 127 & 1 + ce.field_e;
                if (!(var3 == ph.field_h)) {
                    ag.field_a[ce.field_e] = var2;
                    hj.field_a[ce.field_e] = (char)0;
                    ce.field_e = var3;
                }
            }
            var3 = param0.getModifiers();
            if ((10 & var3) == -1) {
                // if_icmpeq L179
                // if_icmpeq L179
            } else {
                param0.consume();
            }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != lg.field_d) {
            lk.field_e = -1;
        }
    }

    final static bk a(int param0, int param1) {
        int var2 = -56 % ((param0 - -30) / 39);
        bk var3 = new bk();
        bh.field_D.a((o) (Object) var3, (byte) 109);
        el.a(4, param1);
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            di discarded$0 = vc.a((byte) 113, (ci) null, (ci) null, (ci) null, (j) null);
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3 = 0;
        jc var4 = null;
        ve var5 = null;
        ve var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dh var16 = null;
        dh var17 = null;
        nb stackIn_3_0 = null;
        nb stackIn_4_0 = null;
        nb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        ci stackIn_20_0 = null;
        ci stackIn_21_0 = null;
        ci stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        nb stackOut_2_0 = null;
        nb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        nb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ci stackOut_19_0 = null;
        ci stackOut_21_0 = null;
        String stackOut_21_1 = null;
        ci stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var15 = Chess.field_G;
          if (param0 == 68) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = fg.field_d.field_Kb;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (fg.field_d.field_Kb != ud.field_d) {
            stackOut_4_0 = (nb) (Object) stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = (nb) (Object) stackIn_3_0;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = ((nb) (Object) stackIn_5_0).a(stackIn_5_1 != 0, param1, 2, param2 * (6 + 3 * fe.field_g), 2 + fe.field_g, param0 ^ 68) ? 1 : 0;
            var4 = fg.field_d.field_Fb.field_I;
            if (2 == ld.field_g) {
              break L3;
            } else {
              if (-2 == (ld.field_g ^ -1)) {
                break L3;
              } else {
                fg.field_d.field_Kb.field_Jb.field_db = ca.field_c;
                fg.field_d.field_tb = false;
                fm.a(fg.field_d.field_Fb, -120);
                break L2;
              }
            }
          }
          fg.field_d.field_Kb.field_Jb.field_db = null;
          fg.field_d.field_tb = true;
          var5 = null;
          var6 = (ve) (Object) var4.g(-18110);
          L4: while (true) {
            if (var6 == null) {
              L5: {
                if (fg.field_d.field_Hb.field_L != 0) {
                  me.field_a = new kd(fg.field_d.field_Hb.field_U, fg.field_d.field_Hb.field_wb, fg.field_d.field_Hb.field_M, fg.field_d.field_Hb.field_pb, ki.field_N, od.field_V, qn.field_P, qn.field_P);
                  pk.field_b = 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (-1 == (fg.field_d.field_Mb.field_L ^ -1)) {
                break L2;
              } else {
                me.field_a = new kd(fg.field_d.field_Mb.field_U, fg.field_d.field_Mb.field_wb, fg.field_d.field_Mb.field_M, fg.field_d.field_Mb.field_pb, sc.field_b, od.field_V, qn.field_P, qn.field_P);
                pk.field_b = 3;
                break L2;
              }
            } else {
              L6: {
                var7 = 0;
                if (var6.field_I == null) {
                  var6.field_Mb = new ci(0L, hg.field_f);
                  var6.a((byte) 127, var6.field_Mb);
                  var6.field_Eb = new ci(0L, hg.field_f);
                  var6.a((byte) 126, var6.field_Eb);
                  var7 = 1;
                  var6.h(0);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var6.field_M = fg.field_d.field_Fb.field_M;
                var6.field_Mb.a(0, var6.field_M, -2147483648, fe.field_g, 0);
                var8 = 0;
                if (null == var6.field_Ob) {
                  break L7;
                } else {
                  if (!var6.field_Ob.equals((Object) (Object) "")) {
                    var6.field_Eb.field_jb = wk.field_g;
                    var6.field_Eb.field_O = 16737894;
                    var8 = 1;
                    var6.field_Eb.a(0, 3 + wk.field_g.field_v, -2147483648, fe.field_g, 0);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                var9 = 0;
                var10 = var6.field_M;
                if (var8 == 0) {
                  break L8;
                } else {
                  var9 = 3 + wk.field_g.field_v;
                  var10 = var10 - var9;
                  break L8;
                }
              }
              L9: {
                stackOut_19_0 = var6.field_Mb;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if ((var10 ^ -1) >= -1) {
                  stackOut_21_0 = (ci) (Object) stackIn_21_0;
                  stackOut_21_1 = var6.field_Fb;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  break L9;
                } else {
                  stackOut_20_0 = (ci) (Object) stackIn_20_0;
                  stackOut_20_1 = lh.a(var6.field_Mb.field_xb, var6.field_Fb, var10);
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L9;
                }
              }
              L10: {
                ((ci) (Object) stackIn_22_0).field_db = (String) (Object) stackIn_22_1;
                if (var6.field_Mb.field_db.equals((Object) (Object) var6.field_Fb)) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L10;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L10;
                }
              }
              L11: {
                var11 = stackIn_25_0;
                var6.field_Mb.a(var9, var10, -2147483648, fe.field_g, 0);
                if (var3 != 0) {
                  break L11;
                } else {
                  var6.field_N = -var6.field_pb + fe.field_g;
                  break L11;
                }
              }
              L12: {
                if (var7 != 0) {
                  fg.field_d.field_Fb.a(true, (ci) (Object) var5, 2, (ci) (Object) var6);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                L14: {
                  if (null == var6.field_Eb) {
                    break L14;
                  } else {
                    if (!var6.field_Eb.field_F) {
                      break L14;
                    } else {
                      pc.field_Mb = var6.field_Ob;
                      break L13;
                    }
                  }
                }
                if (!var6.field_Mb.field_F) {
                  break L13;
                } else {
                  if (var11 != 0) {
                    pc.field_Mb = var6.field_Fb;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L15: {
                var5 = var6;
                if (-1 != (var6.field_L ^ -1)) {
                  ja.a(0L, var6.field_Fb, (byte) -97, fg.field_d.field_Kb, -1, (ci) (Object) var6, (int[]) null, -1, var6.field_Kb);
                  var16 = pi.field_d;
                  var13_ref = field_b;
                  var16.field_b.a((byte) -12, var13_ref, 7);
                  var17 = pi.field_d;
                  var13 = re.field_m;
                  var14 = ag.field_f;
                  var17.field_b.a(true, var13, 0, var14, 0);
                  break L15;
                } else {
                  break L15;
                }
              }
              var6 = (ve) (Object) var4.a((byte) -106);
              continue L4;
            }
          }
        }
    }

    final static di a(byte param0, ci param1, ci param2, ci param3, j param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        di[] var11 = null;
        int var12 = 0;
        j var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dj var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = Chess.field_G;
        if (param4 != null) {
          L0: {
            if (param4.field_q == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param4.field_q.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null != param4.field_t) {
              stackOut_7_0 = param4.field_t.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            var7 = var5 + var6;
            var8 = new String[var7];
            var25 = new char[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var9 = var19;
            var24 = new int[var7];
            var22 = var24;
            var20 = var22;
            var18 = var20;
            var10 = var18;
            var11 = new di[var7];
            if (null != param4.field_q) {
              var12 = 0;
              L3: while (true) {
                if (var12 >= param4.field_q.length) {
                  break L2;
                } else {
                  var13_ref = ak.field_u.a(param4.field_q[var12], 0);
                  var8[var12] = var13_ref.field_x;
                  var9[var12] = param4.field_r[var12];
                  var11[var12] = vc.a((byte) 88, param1, param2, param3, var13_ref);
                  var12++;
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (null == param4.field_t) {
              break L4;
            } else {
              var12 = var5;
              var13 = 49;
              var14 = 0;
              L5: while (true) {
                if (param4.field_t.length <= var14) {
                  break L4;
                } else {
                  var15 = param4.field_t[var14];
                  if (-1 != var15) {
                    L6: {
                      var16 = oa.field_b.a((byte) 79, var15);
                      var8[var12 - -var14] = var16.e((byte) -119);
                      var9[var12 + var14] = param4.field_s[var14];
                      if (var9[var12 + var14] > 0) {
                        break L6;
                      } else {
                        var13 = (char)(var13 + 1);
                        var9[var12 + var14] = (char)var13;
                        break L6;
                      }
                    }
                    var10[var12 - -var14] = param4.field_t[var14];
                    var14++;
                    continue L5;
                  } else {
                    var8[var14 + var12] = ob.field_y;
                    var9[var12 - -var14] = param4.field_s[var14];
                    var10[var12 - -var14] = param4.field_t[var14];
                    var14++;
                    continue L5;
                  }
                }
              }
            }
          }
          if (param0 == 88) {
            return new di(0L, param2, param1, param3, var11, var24, var8, var25);
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "Remove name";
        field_c = "Fullscreen";
    }
}
