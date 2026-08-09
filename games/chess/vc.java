/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_b;
    static String field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(lg.field_d == null)) {
                var2_int = param0.getKeyChar();
                if (0 != var2_int && var2_int != 65535 && s.a((char) var2_int, 0)) {
                    var3 = 127 & ce.field_e - -1;
                    if (ph.field_h != var3) {
                        ag.field_a[ce.field_e] = -1;
                        hj.field_a[ce.field_e] = (char)var2_int;
                        ce.field_e = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "vc.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == lg.field_d) {
                break L1;
              } else {
                L2: {
                  L3: {
                    si.field_o = 0;
                    var2_int = param0.getKeyCode();
                    if (0 > var2_int) {
                      break L3;
                    } else {
                      if (o.field_a.length <= var2_int) {
                        break L3;
                      } else {
                        var2_int = -129 & o.field_a[var2_int];
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (0 > lk.field_e) {
                  break L1;
                } else {
                  if (0 <= var2_int) {
                    kl.field_h[lk.field_e] = var2_int ^ -1;
                    lk.field_e = 1 + lk.field_e & 127;
                    if (sc.field_i != lk.field_e) {
                      break L1;
                    } else {
                      lk.field_e = -1;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("vc.keyReleased(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null != lg.field_d) {
                L2: {
                  L3: {
                    si.field_o = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (var2_int >= o.field_a.length) {
                        break L3;
                      } else {
                        var2_int = o.field_a[var2_int];
                        if ((var2_int & 128) == 0) {
                          break L2;
                        } else {
                          var2_int = -1;
                          break L2;
                        }
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if ((lk.field_e ^ -1) > -1) {
                    break L4;
                  } else {
                    if (-1 >= (var2_int ^ -1)) {
                      kl.field_h[lk.field_e] = var2_int;
                      lk.field_e = lk.field_e - -1 & 127;
                      if (sc.field_i != lk.field_e) {
                        break L4;
                      } else {
                        lk.field_e = -1;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var2_int >= 0) {
                    var3 = 127 & 1 + ce.field_e;
                    if (var3 != ph.field_h) {
                      ag.field_a[ce.field_e] = var2_int;
                      hj.field_a[ce.field_e] = (char)0;
                      ce.field_e = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    break L6;
                  } else {
                    if (-86 == (var2_int ^ -1)) {
                      break L6;
                    } else {
                      if (-11 == (var2_int ^ -1)) {
                        break L6;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                param0.consume();
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("vc.keyPressed(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == lg.field_d) {
                break L1;
              } else {
                lk.field_e = -1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("vc.focusLost(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static bk a(int param0, int param1) {
        int var2 = -56 % ((param0 - -30) / 39);
        bk var3 = new bk();
        bh.field_D.a((o) (var3), (byte) 109);
        el.a(4, param1);
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            j var2 = (j) null;
            vc.a((byte) 113, (ci) null, (ci) null, (ci) null, (j) null);
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1, int param2) {
        nb stackIn_5_0 = null;
        nb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ci stackIn_22_0 = null;
        ci stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jc var4 = null;
        Object var5 = null;
        ve var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dh var16 = null;
        dh var17 = null;
        var15 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 68) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = fg.field_d.field_Kb;

              if (fg.field_d.field_Kb != ud.field_d) {
                stackIn_6_0 = (nb) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = (nb) ((Object) stackIn_5_0);
                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                var3_int = ((nb) (Object) stackIn_6_0).a(stackIn_6_1 != 0, param1, 2, param2 * (6 + 3 * fe.field_g), 2 + fe.field_g, param0 ^ 68) ? 1 : 0;
                var4 = fg.field_d.field_Fb.field_I;
                if (2 == ld.field_g) {
                  break L4;
                } else {
                  if (-2 == (ld.field_g ^ -1)) {
                    break L4;
                  } else {
                    fg.field_d.field_Kb.field_Jb.field_db = ca.field_c;
                    fg.field_d.field_tb = false;
                    fm.a(fg.field_d.field_Fb, -120);
                    break L3;
                  }
                }
              }
              fg.field_d.field_Kb.field_Jb.field_db = null;
              fg.field_d.field_tb = true;
              var5 = null;
              var6 = (ve) ((Object) var4.g(-18110));
              L5: while (true) {
                if (var6 == null) {
                  L6: {
                    if (fg.field_d.field_Hb.field_L != 0) {
                      me.field_a = new kd(fg.field_d.field_Hb.field_U, fg.field_d.field_Hb.field_wb, fg.field_d.field_Hb.field_M, fg.field_d.field_Hb.field_pb, ki.field_N, od.field_V, qn.field_P, qn.field_P);
                      pk.field_b = 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (-1 == (fg.field_d.field_Mb.field_L ^ -1)) {
                    break L3;
                  } else {
                    me.field_a = new kd(fg.field_d.field_Mb.field_U, fg.field_d.field_Mb.field_wb, fg.field_d.field_Mb.field_M, fg.field_d.field_Mb.field_pb, sc.field_b, od.field_V, qn.field_P, qn.field_P);
                    pk.field_b = 3;
                    break L3;
                  }
                } else {
                  L7: {
                    var7 = 0;
                    if (var6.field_I == null) {
                      var6.field_Mb = new ci(0L, hg.field_f);
                      var6.a((byte) 127, var6.field_Mb);
                      var6.field_Eb = new ci(0L, hg.field_f);
                      var6.a((byte) 126, var6.field_Eb);
                      var7 = 1;
                      var6.h(0);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var6.field_M = fg.field_d.field_Fb.field_M;
                    var6.field_Mb.a(0, var6.field_M, -2147483648, fe.field_g, 0);
                    var8 = 0;
                    if (null == var6.field_Ob) {
                      break L8;
                    } else {
                      if (!var6.field_Ob.equals("")) {
                        var6.field_Eb.field_jb = wk.field_g;
                        var6.field_Eb.field_O = 16737894;
                        var8 = 1;
                        var6.field_Eb.a(0, 3 + wk.field_g.field_v, -2147483648, fe.field_g, 0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    var9 = 0;
                    var10 = var6.field_M;
                    if (var8 == 0) {
                      break L9;
                    } else {
                      var9 = 3 + wk.field_g.field_v;
                      var10 = var10 - var9;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_22_0 = var6.field_Mb;

                    if ((var10 ^ -1) >= -1) {
                      stackIn_23_0 = (ci) ((Object) stackIn_22_0);
                      stackIn_23_1 = var6.field_Fb;
                      break L10;
                    } else {
                      stackIn_23_0 = (ci) ((Object) stackIn_22_0);
                      stackIn_23_1 = lh.a(var6.field_Mb.field_xb, var6.field_Fb, var10);
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_23_0.field_db = stackIn_23_1;
                    if (var6.field_Mb.field_db.equals(var6.field_Fb)) {
                      stackIn_26_0 = 0;
                      break L11;
                    } else {
                      stackIn_26_0 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var11 = stackIn_26_0;
                    var6.field_Mb.a(var9, var10, -2147483648, fe.field_g, 0);
                    if (var3_int != 0) {
                      break L12;
                    } else {
                      var6.field_N = -var6.field_pb + fe.field_g;
                      break L12;
                    }
                  }
                  L13: {
                    if (var7 != 0) {
                      fg.field_d.field_Fb.a(true, (ci) (var5), 2, var6);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      if (null == var6.field_Eb) {
                        break L15;
                      } else {
                        if (!var6.field_Eb.field_F) {
                          break L15;
                        } else {
                          pc.field_Mb = var6.field_Ob;
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Mb.field_F) {
                      break L14;
                    } else {
                      if (var11 != 0) {
                        pc.field_Mb = var6.field_Fb;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L16: {
                    var5 = var6;
                    if (-1 != (var6.field_L ^ -1)) {
                      ja.a(0L, var6.field_Fb, (byte) -97, fg.field_d.field_Kb, -1, var6, (int[]) null, -1, var6.field_Kb);
                      var16 = pi.field_d;
                      var13_ref_String = field_b;
                      var16.field_b.a((byte) -12, var13_ref_String, 7);
                      var17 = pi.field_d;
                      var13 = re.field_m;
                      var14 = ag.field_f;
                      var17.field_b.a(true, var13, 0, var14, 0);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var6 = (ve) ((Object) var4.a((byte) -106));
                  continue L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "vc.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static di a(byte param0, ci param1, ci param2, ci param3, j param4) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        di stackIn_26_0 = null;
        di stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        di[] var11 = null;
        int var12 = 0;
        j var13_ref_j = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dj var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = Chess.field_G;
        try {
          L0: {
            if (param4 != null) {
              L1: {
                if (param4.field_q == null) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = param4.field_q.length;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param4.field_t) {
                  stackIn_10_0 = param4.field_t.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = var5_int + var6;
                var8 = new String[var7];
                var21 = new char[var7];
                var19 = var21;
                var9 = var19;
                var20 = new int[var7];
                var18 = var20;
                var10 = var18;
                var11 = new di[var7];
                if (null != param4.field_q) {
                  var12 = 0;
                  L4: while (true) {
                    if (var12 >= param4.field_q.length) {
                      break L3;
                    } else {
                      var13_ref_j = ak.field_u.a(param4.field_q[var12], 0);
                      var8[var12] = var13_ref_j.field_x;
                      var9[var12] = param4.field_r[var12];
                      var11[var12] = vc.a((byte) 88, param1, param2, param3, var13_ref_j);
                      var12++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (null == param4.field_t) {
                  break L5;
                } else {
                  var12 = var5_int;
                  var13 = 49;
                  var14 = 0;
                  L6: while (true) {
                    if (param4.field_t.length <= var14) {
                      break L5;
                    } else {
                      L7: {
                        var15 = param4.field_t[var14];
                        if (-1 != var15) {
                          L8: {
                            var16 = oa.field_b.a((byte) 79, var15);
                            var8[var12 - -var14] = var16.e((byte) -119);
                            var9[var12 + var14] = param4.field_s[var14];
                            if (var9[var12 + var14] > 0) {
                              break L8;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var12 + var14] = (char)var13;
                              break L8;
                            }
                          }
                          var10[var12 - -var14] = param4.field_t[var14];
                          break L7;
                        } else {
                          var8[var14 + var12] = ob.field_y;
                          var9[var12 - -var14] = param4.field_s[var14];
                          var10[var12 - -var14] = param4.field_t[var14];
                          break L7;
                        }
                      }
                      var14++;
                      continue L6;
                    }
                  }
                }
              }
              if (param0 == 88) {
                stackIn_28_0 = new di(0L, param2, param1, param3, var11, var20, var8, var21);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_26_0 = (di) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("vc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L12;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_32_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0;
        } else {
          return stackIn_28_0;
        }
    }

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "Remove name";
        field_c = "Fullscreen";
    }
}
