/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class MinerDisturbance extends ob {
    private int[] field_L;
    private boolean field_eb;
    private int field_R;
    private int field_M;
    private boolean field_Y;
    private int[] field_D;
    private int field_bb;
    private int field_T;
    private int field_cb;
    private int field_N;
    private boolean field_X;
    private int field_P;
    private int field_C;
    private int field_U;
    mc field_Q;
    boolean field_K;
    private int field_Z;
    private int field_E;
    private int field_db;
    private boolean field_O;
    private int field_G;
    private int field_I;
    private int field_W;
    private int field_F;
    private int field_H;
    private int field_S;
    private static int field_J;
    private boolean field_V;
    public static int field_ab;

    final static void a(java.awt.Color param0, byte param1, String param2, boolean param3, int param4) {
        boolean discarded$1 = false;
        int var5_int = 0;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        java.awt.Graphics var6 = null;
        Exception var7 = null;
        java.awt.Graphics var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var5_int = -3 % ((-40 - param1) / 54);
                  var6 = ef.field_c.getGraphics();
                  if (null != kh.field_a) {
                    break L2;
                  } else {
                    kh.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param3) {
                    var6.setColor(java.awt.Color.black);
                    var6.fillRect(0, 0, nk.field_x, ml.field_a);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 == null) {
                    param0 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == pk.field_a) {
                        pk.field_a = ef.field_c.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var7_ref = pk.field_a.getGraphics();
                    var7_ref.setColor(param0);
                    var7_ref.drawRect(0, 0, 303, 33);
                    var7_ref.fillRect(2, 2, param4 * 3, 30);
                    var7_ref.setColor(java.awt.Color.black);
                    var7_ref.drawRect(1, 1, 301, 31);
                    var7_ref.fillRect(3 * param4 + 2, 2, -(3 * param4) + 300, 30);
                    var7_ref.setFont(kh.field_a);
                    var7_ref.setColor(java.awt.Color.white);
                    var7_ref.drawString(param2, (-(6 * param2.length()) + 304) / 2, 22);
                    discarded$1 = var6.drawImage(pk.field_a, -152 + nk.field_x / 2, -18 + ml.field_a / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var7 = (Exception) (Object) decompiledCaughtException;
                    var8 = -152 + nk.field_x / 2;
                    var9 = -18 + ml.field_a / 2;
                    var6.setColor(param0);
                    var6.drawRect(var8, var9, 303, 33);
                    var6.fillRect(2 + var8, 2 + var9, param4 * 3, 30);
                    var6.setColor(java.awt.Color.black);
                    var6.drawRect(var8 - -1, var9 - -1, 301, 31);
                    var6.fillRect(var8 + (2 - -(3 * param4)), var9 + 2, 300 - 3 * param4, 30);
                    var6.setFont(kh.field_a);
                    var6.setColor(java.awt.Color.white);
                    var6.drawString(param2, var8 - -((304 - 6 * param2.length()) / 2), 22 + var9);
                    break L7;
                  }
                }
                L8: {
                  if (null == ab.field_c) {
                    break L8;
                  } else {
                    var6.setFont(kh.field_a);
                    var6.setColor(java.awt.Color.white);
                    var6.drawString(ab.field_c, nk.field_x / 2 - ab.field_c.length() * 6 / 2, ml.field_a / 2 + -26);
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                ef.field_c.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5_ref);
            stackOut_24_1 = new StringBuilder().append("MinerDisturbance.BB(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L11;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        try {
            ll.field_h = 38054639 ^ param0;
            if (param1 <= 114) {
                this.w(-76);
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int v(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.b(-82);
                break L1;
              }
            }
            stackOut_3_0 = 38054639 ^ ph.field_d;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.BA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_5_0 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_7_1 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_9_1 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_46_0 = 0;
        int stackIn_83_0 = 0;
        vm stackIn_86_0 = null;
        String stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        vm stackIn_88_0 = null;
        String stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        vm stackIn_89_0 = null;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_89_4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas stackOut_4_0 = null;
        l stackOut_2_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_82_0 = 0;
        boolean stackOut_80_0 = false;
        vm stackOut_85_0 = null;
        String stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        vm stackOut_88_0 = null;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        vm stackOut_86_0 = null;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_86_4 = 0;
        int stackOut_6_0 = 0;
        Object stackOut_6_1 = null;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_11_1 = null;
        boolean stackOut_11_2 = false;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_7_1 = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        Object var2_ref = null;
        var4 = field_ab;
        try {
          L0: {
            L1: {
              if (null == kf.field_d) {
                stackOut_4_0 = ef.field_c;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = kf.field_d;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            if (!hl.b((byte) -125)) {
              if (!nn.field_n) {
                mf.a(-752960408, (java.awt.Canvas) (var2_ref));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (od.e(param0)) {
                    break L2;
                  } else {
                    if (qi.f(-9202)) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            L6: {
                              if ((cm.field_o ^ -1) != -1) {
                                break L6;
                              } else {
                                if (qd.field_S) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if ((cm.field_o ^ -1) != -2) {
                              break L4;
                            } else {
                              if (!ci.field_b) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          this.t(48);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        eh.d();
                        break L3;
                      }
                      L7: {
                        if (ke.field_V) {
                          stackOut_45_0 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          break L7;
                        } else {
                          stackOut_43_0 = 1;
                          stackIn_46_0 = stackOut_43_0;
                          break L7;
                        }
                      }
                      L8: {
                        ij.field_p = stackIn_46_0 != 0;
                        if (ke.field_V) {
                          break L8;
                        } else {
                          if (!il.e(-31391)) {
                            break L8;
                          } else {
                            if (!uh.field_e) {
                              break L8;
                            } else {
                              this.d(false);
                              break L8;
                            }
                          }
                        }
                      }
                      L9: {
                        if (!ke.field_V) {
                          break L9;
                        } else {
                          this.g((byte) -110);
                          break L9;
                        }
                      }
                      L10: {
                        if (this.field_Q != null) {
                          this.field_Q.b(77);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        cc.a((byte) -125);
                        if (!gd.field_w) {
                          ff.a(false);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (0 != on.field_u) {
                          eh.b(0, 0, 640, 480, 1, on.field_u << -1054823135);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        L14: {
                          if (!oc.d(108)) {
                            break L14;
                          } else {
                            ee.i(14955);
                            if (var4 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        if (g.a((byte) -126)) {
                          L15: {
                            if (kf.field_d != null) {
                              stackOut_82_0 = 1;
                              stackIn_83_0 = stackOut_82_0;
                              break L15;
                            } else {
                              stackOut_80_0 = rd.field_f;
                              stackIn_83_0 = stackOut_80_0 ? 1 : 0;
                              break L15;
                            }
                          }
                          pc.b(stackIn_83_0 != 0, (byte) 120);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L16: {
                        if (!this.field_V) {
                          break L16;
                        } else {
                          L17: {
                            var3 = 60;
                            ce.field_d.c("FPS: " + nd.field_b, 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("LPS: " + fd.field_F, 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("WALRUS KILLED: " + hn.field_c, 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("POINTS WITHOUT KILLING PINNIPED: " + eb.field_e, 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("POINTS EARNED COVERED IN OIL: " + eb.field_b, 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("SNOWTILES MINED: " + lb.field_r, 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("ICE BLOCKS CREATED: " + re.field_d, 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("PERCENT OIL FOR ACHIEVEMENT: " + 100 * pi.field_a / 2800 + "%", 630, var3, 65535, -1);
                            var3 += 30;
                            ce.field_d.c("CURRENTLEVEL: " + je.field_u, 630, var3, 65535, -1);
                            var3 += 30;
                            stackOut_85_0 = ce.field_d;
                            stackOut_85_1 = "SECONDS FOR ERRUPTION: " + me.field_h / 50;
                            stackOut_85_2 = 630;
                            stackOut_85_3 = var3;
                            stackIn_88_0 = stackOut_85_0;
                            stackIn_88_1 = stackOut_85_1;
                            stackIn_88_2 = stackOut_85_2;
                            stackIn_88_3 = stackOut_85_3;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            stackIn_86_2 = stackOut_85_2;
                            stackIn_86_3 = stackOut_85_3;
                            if (-2001 < (me.field_h ^ -1)) {
                              stackOut_88_0 = (vm) ((Object) stackIn_88_0);
                              stackOut_88_1 = (String) ((Object) stackIn_88_1);
                              stackOut_88_2 = stackIn_88_2;
                              stackOut_88_3 = stackIn_88_3;
                              stackOut_88_4 = 65280;
                              stackIn_89_0 = stackOut_88_0;
                              stackIn_89_1 = stackOut_88_1;
                              stackIn_89_2 = stackOut_88_2;
                              stackIn_89_3 = stackOut_88_3;
                              stackIn_89_4 = stackOut_88_4;
                              break L17;
                            } else {
                              stackOut_86_0 = (vm) ((Object) stackIn_86_0);
                              stackOut_86_1 = (String) ((Object) stackIn_86_1);
                              stackOut_86_2 = stackIn_86_2;
                              stackOut_86_3 = stackIn_86_3;
                              stackOut_86_4 = 16711680;
                              stackIn_89_0 = stackOut_86_0;
                              stackIn_89_1 = stackOut_86_1;
                              stackIn_89_2 = stackOut_86_2;
                              stackIn_89_3 = stackOut_86_3;
                              stackIn_89_4 = stackOut_86_4;
                              break L17;
                            }
                          }
                          ((vm) (Object) stackIn_89_0).c(stackIn_89_1, stackIn_89_2, stackIn_89_3, stackIn_89_4, -1);
                          var3 += 30;
                          ce.field_d.c("ACHIVEMENT BITS: " + dl.b((byte) -27), 630, var3, 65535, -1);
                          var3 += 30;
                          ce.field_d.c("GAMEMULTI: " + ne.a(false), 630, var3, 65535, -1);
                          break L16;
                        }
                      }
                      L18: {
                        if (wj.field_j >= 2) {
                          ug.field_a.b(-91);
                          pn.b((byte) -17);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      cl.a((java.awt.Canvas) (var2_ref), 0, 0, 310);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                pa.a(true, ec.field_f, 100.0f);
                mf.a(-752960408, (java.awt.Canvas) (var2_ref));
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              L19: {
                stackOut_6_0 = 240;
                stackOut_6_1 = var2_ref;
                stackIn_11_0 = stackOut_6_0;
                stackIn_11_1 = (RuntimeException) ((Object) stackOut_6_1);
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = (RuntimeException) ((Object) stackOut_6_1);
                if (kf.field_d == null) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = (RuntimeException) ((Object) stackIn_11_1);
                  stackOut_11_2 = rd.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2 ? 1 : 0;
                  break L19;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = (RuntimeException) ((Object) stackIn_7_1);
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = (RuntimeException) ((Object) stackIn_9_1);
                  stackOut_9_2 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2;
                  break L19;
                }
              }
              wc.a(stackIn_12_0, (java.awt.Canvas) ((Object) stackIn_12_1), stackIn_12_2 != 0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.QA(" + param0 + ')');
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

    private final boolean i(byte param0) {
        RuntimeException var2 = null;
        ln[] var2_array = null;
        int var2_int = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        var5 = field_ab;
        try {
          L0: {
            L1: {
              if (null == fl.field_f) {
                break L1;
              } else {
                if (!fl.field_f.a(false, "supervolcano")) {
                  break L1;
                } else {
                  if (null == je.field_k) {
                    je.field_k = td.a("permaice", fl.field_f, "supervolcano", (byte) 122);
                    je.field_y = td.a("damagedpermaice", fl.field_f, "supervolcano", (byte) 123);
                    je.field_n = td.a("damagedpermaice2", fl.field_f, "supervolcano", (byte) 120);
                    je.field_G = td.a("damagedpermaice3", fl.field_f, "supervolcano", (byte) 116);
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (null != je.field_L) {
                      L2: {
                        if (param0 > 0) {
                          break L2;
                        } else {
                          this.x(58);
                          break L2;
                        }
                      }
                      if (null == je.field_d[1]) {
                        je.field_d[1] = td.a("rock", fl.field_f, "supervolcano", (byte) 113);
                        je.field_P[1] = td.a("damagedrock", fl.field_f, "supervolcano", (byte) 118);
                        je.field_R[1] = td.a("damagedrock2", fl.field_f, "supervolcano", (byte) 115);
                        je.field_p[1] = td.a("damagedrock3", fl.field_f, "supervolcano", (byte) 123);
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (null == je.field_z[0]) {
                          je.field_z[0] = md.a("snowleft", fl.field_f, 10, "supervolcano");
                          je.field_z[2] = md.a("snowright", fl.field_f, 10, "supervolcano");
                          je.field_z[1] = md.a("snowtop", fl.field_f, 10, "supervolcano");
                          je.field_z[3] = md.a("snowbottom", fl.field_f, 10, "supervolcano");
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (null != hk.field_a) {
                            if (sa.field_t[1][0] != null) {
                              if (null != qf.field_o[1][8]) {
                                if (pl.field_k == null) {
                                  pl.field_k = jn.a("sub", -29553, "supervolcano", fl.field_f);
                                  il.field_s = jn.a("theking", -29553, "supervolcano", fl.field_f);
                                  bc.field_b = jn.a("obylisk", -29553, "supervolcano", fl.field_f);
                                  aa.field_i = jn.a("mammoth", -29553, "supervolcano", fl.field_f);
                                  gh.field_a = jn.a("skeleton", -29553, "supervolcano", fl.field_f);
                                  rd.field_b = td.a("miner2oily", fl.field_f, "supervolcano", (byte) 109);
                                  fg.field_c = td.a("miner_stash_oily", fl.field_f, "supervolcano", (byte) 122);
                                  rg.field_tb = td.a("jetpack", fl.field_f, "supervolcano", (byte) 112);
                                  pc.field_f = td.a("jetpack_onfire", fl.field_f, "supervolcano", (byte) 110);
                                  ob.field_w = td.a("miner_pickup_freezium", fl.field_f, "supervolcano", (byte) 117);
                                  tf.field_c = td.a("miner_pickup_freezium_oily", fl.field_f, "supervolcano", (byte) 122);
                                  lb.field_x = new ea[ob.field_w.length];
                                  var2_int = 0;
                                  L3: while (true) {
                                    stackOut_46_0 = var2_int;
                                    stackOut_46_1 = lb.field_x.length;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    L4: while (true) {
                                      L5: {
                                        L6: {
                                          if (stackIn_47_0 >= stackIn_47_1) {
                                            break L6;
                                          } else {
                                            lb.field_x[var2_int] = ob.field_w[var2_int].c();
                                            ml.a((byte) 93, 16777215, lb.field_x[var2_int], ob.field_w[var2_int]);
                                            var3 = lb.field_x[var2_int].field_D;
                                            stackOut_48_0 = -1 + var3.length;
                                            stackIn_62_0 = stackOut_48_0;
                                            stackIn_49_0 = stackOut_48_0;
                                            if (var5 != 0) {
                                              break L5;
                                            } else {
                                              var4 = stackIn_49_0;
                                              L7: while (true) {
                                                L8: {
                                                  if (0 > var4) {
                                                    break L8;
                                                  } else {
                                                    stackOut_51_0 = var3[var4] ^ -1;
                                                    stackOut_51_1 = -1;
                                                    stackIn_47_0 = stackOut_51_0;
                                                    stackIn_47_1 = stackOut_51_1;
                                                    stackIn_52_0 = stackOut_51_0;
                                                    stackIn_52_1 = stackOut_51_1;
                                                    if (var5 != 0) {
                                                      continue L4;
                                                    } else {
                                                      L9: {
                                                        if (stackIn_52_0 >= stackIn_52_1) {
                                                          break L9;
                                                        } else {
                                                          if (var3[var4] != 16777215) {
                                                            var3[var4] = 0;
                                                            break L9;
                                                          } else {
                                                            break L9;
                                                          }
                                                        }
                                                      }
                                                      var4--;
                                                      if (var5 == 0) {
                                                        continue L7;
                                                      } else {
                                                        break L8;
                                                      }
                                                    }
                                                  }
                                                }
                                                var2_int++;
                                                if (var5 == 0) {
                                                  continue L3;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_61_0 = 0;
                                        stackIn_62_0 = stackOut_61_0;
                                        break L5;
                                      }
                                      decompiledRegionSelector0 = 8;
                                      break L0;
                                    }
                                  }
                                } else {
                                  if (null != pf.field_a) {
                                    ci.field_b = true;
                                    stackOut_82_0 = 1;
                                    stackIn_83_0 = stackOut_82_0;
                                    decompiledRegionSelector0 = 10;
                                    break L0;
                                  } else {
                                    rf.field_d = jn.a("thermometer", -29553, "supervolcano", fl.field_f);
                                    rf.field_d.f();
                                    pn.field_c = pb.a("supervolcano", fl.field_f, "thermometer_mask", (byte) -77);
                                    kc.field_a = rf.field_d.c();
                                    pf.field_a = td.a("oildrips", fl.field_f, "supervolcano", (byte) 123);
                                    vc.field_o = new ea[ph.field_e.length];
                                    var2_int = 0;
                                    L10: while (true) {
                                      stackOut_65_0 = var2_int ^ -1;
                                      stackOut_65_1 = vc.field_o.length ^ -1;
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      L11: while (true) {
                                        L12: {
                                          L13: {
                                            if (stackIn_66_0 <= stackIn_66_1) {
                                              break L13;
                                            } else {
                                              vc.field_o[var2_int] = ph.field_e[var2_int].c();
                                              ml.a((byte) 93, 16777215, vc.field_o[var2_int], ph.field_e[var2_int]);
                                              var3 = vc.field_o[var2_int].field_D;
                                              stackOut_67_0 = var3.length - 1;
                                              stackIn_81_0 = stackOut_67_0;
                                              stackIn_68_0 = stackOut_67_0;
                                              if (var5 != 0) {
                                                break L12;
                                              } else {
                                                var4 = stackIn_68_0;
                                                L14: while (true) {
                                                  L15: {
                                                    if (-1 < (var4 ^ -1)) {
                                                      break L15;
                                                    } else {
                                                      stackOut_70_0 = var3[var4] ^ -1;
                                                      stackOut_70_1 = -1;
                                                      stackIn_66_0 = stackOut_70_0;
                                                      stackIn_66_1 = stackOut_70_1;
                                                      stackIn_71_0 = stackOut_70_0;
                                                      stackIn_71_1 = stackOut_70_1;
                                                      if (var5 != 0) {
                                                        continue L11;
                                                      } else {
                                                        L16: {
                                                          if (stackIn_71_0 >= stackIn_71_1) {
                                                            break L16;
                                                          } else {
                                                            if (16777215 != var3[var4]) {
                                                              var3[var4] = 0;
                                                              break L16;
                                                            } else {
                                                              break L16;
                                                            }
                                                          }
                                                        }
                                                        var4--;
                                                        if (var5 == 0) {
                                                          continue L14;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var2_int++;
                                                  if (var5 == 0) {
                                                    continue L10;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          stackOut_80_0 = 0;
                                          stackIn_81_0 = stackOut_80_0;
                                          break L12;
                                        }
                                        decompiledRegionSelector0 = 9;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              } else {
                                nn.field_h[1] = jn.a("gravestone", -29553, "supervolcano", fl.field_f);
                                dl.field_d[1] = jn.a("certificate_pattern", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][0] = jn.a("certificate_topleft", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][1] = jn.a("certificate_top", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][2] = jn.a("certificate_topright", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][3] = jn.a("certificate_left", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][4] = jn.a("certificate_centre", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][5] = jn.a("certificate_right", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][6] = jn.a("certificate_bottomleft", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][7] = jn.a("certificate_bottom", -29553, "supervolcano", fl.field_f);
                                qf.field_o[1][8] = jn.a("certificate_bottomright", -29553, "supervolcano", fl.field_f);
                                stackOut_40_0 = 0;
                                stackIn_41_0 = stackOut_40_0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              }
                            } else {
                              sa.field_t[1][0] = pb.a("supervolcano", fl.field_f, "rankings1", (byte) -77);
                              var2_array = tb.a("rankings2", "supervolcano", fl.field_f, 1);
                              ai.a(var2_array, 0, sa.field_t[1], 1, var2_array.length);
                              var2_array = tb.a("rankings3", "supervolcano", fl.field_f, 1);
                              ai.a(var2_array, 0, sa.field_t[1], 6, var2_array.length);
                              sa.field_t[1][8] = pb.a("supervolcano", fl.field_f, "rankings4", (byte) -77);
                              sa.field_t[1][9] = pb.a("supervolcano", fl.field_f, "rankings5", (byte) -77);
                              var3_int = 0;
                              L17: while (true) {
                                L18: {
                                  if ((var3_int ^ -1) <= (sa.field_t[1].length ^ -1)) {
                                    break L18;
                                  } else {
                                    sa.field_t[1][var3_int].a();
                                    var3_int++;
                                    if (var5 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                stackOut_37_0 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                decompiledRegionSelector0 = 6;
                                break L0;
                              }
                            }
                          } else {
                            je.field_x[1] = td.a("slopes", fl.field_f, "supervolcano", (byte) 115);
                            je.field_j[1] = td.a("sky", fl.field_f, "supervolcano", (byte) 120);
                            ph.field_e = td.a("walrus", fl.field_f, "supervolcano", (byte) 122);
                            fi.field_b = td.a("penguin", fl.field_f, "supervolcano", (byte) 124);
                            g.field_j = td.a("icebomb", fl.field_f, "supervolcano", (byte) 118);
                            hk.field_a = td.a("freezeexplosion", fl.field_f, "supervolcano", (byte) 113);
                            me.field_k[1] = jn.a("levelbackground", -29553, "supervolcano", fl.field_f);
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    } else {
                      je.field_L = td.a("snow", fl.field_f, "supervolcano", (byte) 119);
                      je.field_c = td.a("damagedsnow", fl.field_f, "supervolcano", (byte) 119);
                      je.field_C = td.a("damagedsnow2", fl.field_f, "supervolcano", (byte) 123);
                      je.field_g = td.a("damagedsnow3", fl.field_f, "supervolcano", (byte) 120);
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.KA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_38_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_41_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_62_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_81_0 != 0;
                          } else {
                            return stackIn_83_0 != 0;
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

    private final void f(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_98_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        var5 = field_ab;
        try {
          L0: {
            L1: {
              dl.field_c = dl.field_c + 1;
              if (param0 == 7) {
                break L1;
              } else {
                this.field_O = false;
                break L1;
              }
            }
            L2: {
              pa.field_d = pa.field_d + 1;
              if (!ke.field_V) {
                break L2;
              } else {
                if (-1 == (cm.field_o ^ -1)) {
                  break L2;
                } else {
                  if ((pj.field_a ^ -1) < -1) {
                    break L2;
                  } else {
                    cm.field_o = 0;
                    break L2;
                  }
                }
              }
            }
            L3: {
              fieldTemp$2 = this.field_P;
              this.field_P = this.field_P + 1;
              if (50 >= fieldTemp$2) {
                break L3;
              } else {
                this.field_P = this.field_P - 50;
                break L3;
              }
            }
            L4: {
              if ((gi.field_c ^ -1) >= -1) {
                break L4;
              } else {
                gi.field_c = gi.field_c - 1;
                break L4;
              }
            }
            L5: {
              if (-65537 < (pa.field_d ^ -1)) {
                break L5;
              } else {
                pa.field_d = pa.field_d - 65536;
                break L5;
              }
            }
            L6: {
              if (null == this.field_Q) {
                break L6;
              } else {
                if (fl.field_d) {
                  this.field_Q.a(jk.field_ab, param0 + -12, gb.field_e, nk.field_w);
                  if (null == this.field_Q) {
                    break L6;
                  } else {
                    if (this.field_Q.field_o) {
                      break L6;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (oc.d(71)) {
                break L7;
              } else {
                if (-1 != (on.field_u ^ -1)) {
                  break L7;
                } else {
                  oc.f(-18627);
                  break L7;
                }
              }
            }
            L8: {
              L9: {
                if (this.field_K) {
                  break L9;
                } else {
                  L10: {
                    if (je.field_N[cm.field_o] == je.field_u) {
                      break L10;
                    } else {
                      me.field_h = me.field_h + 1;
                      break L10;
                    }
                  }
                  L11: {
                    this.field_R = this.field_R - 1;
                    this.u(-16506);
                    this.field_cb = this.field_cb + 1;
                    bf.field_d = bf.field_d + 1;
                    this.field_I = this.field_I + 1;
                    if (-1001 > (bf.field_d ^ -1)) {
                      pa.field_c = -1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    fieldTemp$3 = this.field_H;
                    this.field_H = this.field_H + 1;
                    if (fieldTemp$3 >= ma.field_O.field_A) {
                      this.field_H = 0;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (ag.field_c) {
                        break L14;
                      } else {
                        fb.field_f = 0;
                        if (var5 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    fb.field_f = fb.field_f + 1;
                    break L13;
                  }
                  L15: {
                    if ((this.field_cb ^ -1) != -2) {
                      break L15;
                    } else {
                      this.field_cb = 0;
                      break L15;
                    }
                  }
                  L16: {
                    if (79 <= this.field_S) {
                      break L16;
                    } else {
                      this.field_S = this.field_S + 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (this.field_D.length != this.field_I) {
                      break L17;
                    } else {
                      this.field_I = 0;
                      break L17;
                    }
                  }
                  L18: {
                    var2_int = 6000 + -rg.field_sb;
                    if (-1 <= (var2_int ^ -1)) {
                      var2_int = 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    var3 = 25 * var2_int / 4000;
                    var4 = var3 + lj.field_r;
                    if (var4 <= 50) {
                      break L19;
                    } else {
                      var4 = 50;
                      break L19;
                    }
                  }
                  L20: {
                    this.field_D[this.field_I] = (24 * (ll.a((byte) -73, 1 + var4) * (ll.a((byte) -73, 3) + -1) + var4) / 100 + ll.a((byte) -73, 2)) * this.field_M;
                    if (-26 > (Math.abs(this.field_D[this.field_I]) ^ -1)) {
                      this.field_D[this.field_I] = 25 * this.field_M;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    this.field_M = this.field_M * -1;
                    if (fl.field_d) {
                      pi.a(this.field_K, 2);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (!sc.field_b) {
                      break L22;
                    } else {
                      L23: {
                        if (ni.a(14, 11764)) {
                          break L23;
                        } else {
                          if (10 >= Math.abs(this.field_D[this.field_I])) {
                            break L23;
                          } else {
                            ag.a(true, 14, -1, -1);
                            break L23;
                          }
                        }
                      }
                      L24: {
                        ag.a(true, 7, -1, -1);
                        ag.a(true, 8, -1, -1);
                        if (a.field_c > 3000) {
                          ag.a(true, 12, -1, -1);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      L25: {
                        this.field_K = ak.a(40);
                        if (this.field_K) {
                          stackOut_98_0 = 0;
                          stackIn_99_0 = stackOut_98_0;
                          break L25;
                        } else {
                          stackOut_96_0 = 1;
                          stackIn_99_0 = stackOut_96_0;
                          break L25;
                        }
                      }
                      L26: {
                        stackOut_99_0 = stackIn_99_0;
                        stackIn_102_0 = stackOut_99_0;
                        stackIn_100_0 = stackOut_99_0;
                        if (this.field_X) {
                          stackOut_102_0 = stackIn_102_0;
                          stackOut_102_1 = 0;
                          stackIn_103_0 = stackOut_102_0;
                          stackIn_103_1 = stackOut_102_1;
                          break L26;
                        } else {
                          stackOut_100_0 = stackIn_100_0;
                          stackOut_100_1 = 1;
                          stackIn_103_0 = stackOut_100_0;
                          stackIn_103_1 = stackOut_100_1;
                          break L26;
                        }
                      }
                      L27: {
                        if (stackIn_103_0 == stackIn_103_1) {
                          break L27;
                        } else {
                          L28: {
                            if (this.field_K) {
                              break L28;
                            } else {
                              kh.a((byte) 92);
                              if (var5 == 0) {
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                          al.e(param0 + 82);
                          break L27;
                        }
                      }
                      this.field_X = this.field_K;
                      break L22;
                    }
                  }
                  L29: {
                    this.field_W = hf.field_t - 180;
                    this.field_G = 180 + hf.field_t;
                    if (this.field_W < 0) {
                      this.field_W = 0;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (this.field_Z >= this.field_G) {
                      break L30;
                    } else {
                      this.field_G = this.field_Z;
                      break L30;
                    }
                  }
                  L31: {
                    L32: {
                      if (!this.field_eb) {
                        break L32;
                      } else {
                        if ((this.field_G - this.field_W ^ -1) < -1) {
                          this.field_Z = this.field_Z - 1;
                          if (var5 == 0) {
                            break L31;
                          } else {
                            break L32;
                          }
                        } else {
                          break L31;
                        }
                      }
                    }
                    if (this.field_Z < je.field_t) {
                      this.field_Z = this.field_Z + 1;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  if (var5 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (!sc.field_b) {
                break L8;
              } else {
                L33: {
                  if (this.field_Y) {
                    break L33;
                  } else {
                    if (fl.field_d) {
                      pi.a(this.field_K, 2);
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                }
                je.j();
                break L8;
              }
            }
            L34: {
              if (ug.field_a == null) {
                break L34;
              } else {
                ug.field_a.d(32);
                break L34;
              }
            }
            L35: {
              if (fl.field_d) {
                this.l((byte) -116);
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              L37: {
                if ((pl.field_h ^ -1) != -16) {
                  break L37;
                } else {
                  di.field_Z = 0;
                  pk.field_i = 15;
                  ij.field_p = false;
                  if (var5 == 0) {
                    break L36;
                  } else {
                    break L37;
                  }
                }
              }
              L38: {
                L39: {
                  L40: {
                    L41: {
                      L42: {
                        L43: {
                          var2_int = 0;
                          var3 = pl.field_h;
                          if ((var3 ^ -1) != -9) {
                            break L43;
                          } else {
                            if (var5 == 0) {
                              break L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                        L44: {
                          if (-10 != (var3 ^ -1)) {
                            break L44;
                          } else {
                            if (var5 == 0) {
                              break L42;
                            } else {
                              break L44;
                            }
                          }
                        }
                        L45: {
                          if (var3 != 2) {
                            break L45;
                          } else {
                            if (var5 == 0) {
                              break L42;
                            } else {
                              break L45;
                            }
                          }
                        }
                        L46: {
                          if (-4 != (var3 ^ -1)) {
                            break L46;
                          } else {
                            if (var5 == 0) {
                              break L42;
                            } else {
                              break L46;
                            }
                          }
                        }
                        if (var3 == 4) {
                          break L42;
                        } else {
                          L47: {
                            if (-7 != (var3 ^ -1)) {
                              break L47;
                            } else {
                              if (var5 == 0) {
                                break L41;
                              } else {
                                break L47;
                              }
                            }
                          }
                          L48: {
                            if ((var3 ^ -1) != -8) {
                              break L48;
                            } else {
                              if (var5 == 0) {
                                break L41;
                              } else {
                                break L48;
                              }
                            }
                          }
                          if (-11 == (var3 ^ -1)) {
                            break L41;
                          } else {
                            if ((var3 ^ -1) == -2) {
                              break L41;
                            } else {
                              L49: {
                                if (-12 != (var3 ^ -1)) {
                                  break L49;
                                } else {
                                  if (var5 == 0) {
                                    break L41;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                              L50: {
                                if (var3 != 0) {
                                  break L50;
                                } else {
                                  if (var5 == 0) {
                                    break L40;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              L51: {
                                if (var3 != 14) {
                                  break L51;
                                } else {
                                  if (var5 == 0) {
                                    break L39;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              if (5 != var3) {
                                break L38;
                              } else {
                                if (var5 == 0) {
                                  break L39;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2_int = 45;
                      if (var5 == 0) {
                        break L38;
                      } else {
                        break L41;
                      }
                    }
                    var2_int = 49;
                    if (var5 == 0) {
                      break L38;
                    } else {
                      break L40;
                    }
                  }
                  var2_int = 65;
                  if (var5 == 0) {
                    break L38;
                  } else {
                    break L39;
                  }
                }
                var2_int = 1;
                break L38;
              }
              L52: {
                if (-21 == (di.field_Z ^ -1)) {
                  L53: {
                    if ((pl.field_h ^ -1) == -1) {
                      break L53;
                    } else {
                      kj.a((byte) -123);
                      if (var5 == 0) {
                        break L52;
                      } else {
                        break L53;
                      }
                    }
                  }
                  ac.a((byte) -116);
                  break L52;
                } else {
                  break L52;
                }
              }
              L54: {
                L55: {
                  if (var2_int < cm.field_r) {
                    break L55;
                  } else {
                    di.field_Z = 0;
                    if (var5 == 0) {
                      break L54;
                    } else {
                      break L55;
                    }
                  }
                }
                L56: {
                  if (15 == pl.field_h) {
                    break L56;
                  } else {
                    if ((var2_int ^ -1) > (cm.field_r ^ -1)) {
                      di.field_Z = di.field_Z + 1;
                      break L56;
                    } else {
                      break L56;
                    }
                  }
                }
                if (ke.field_V) {
                  break L54;
                } else {
                  if (pk.field_i == pl.field_h) {
                    break L54;
                  } else {
                    if (!ij.field_p) {
                      break L54;
                    } else {
                      if (di.field_Z <= 512) {
                        break L54;
                      } else {
                        pk.field_i = pl.field_h;
                        break L54;
                      }
                    }
                  }
                }
              }
              if (null == de.field_b) {
                mm.a(false, ph.field_a, 2, 1, true, 2);
                break L36;
              } else {
                break L36;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.MA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void t(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        ea var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_47_0 = null;
        gf stackIn_47_1 = null;
        Object stackIn_59_0 = null;
        gf stackIn_59_1 = null;
        Object stackIn_73_0 = null;
        gf stackIn_73_1 = null;
        Object stackIn_92_0 = null;
        gf stackIn_92_1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        Object stackOut_46_0 = null;
        gf stackOut_46_1 = null;
        Object stackOut_58_0 = null;
        gf stackOut_58_1 = null;
        Object stackOut_72_0 = null;
        gf stackOut_72_1 = null;
        Object stackOut_90_0 = null;
        gf stackOut_90_1 = null;
        var8 = field_ab;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (vi.field_h) {
                      break L4;
                    } else {
                      if (!wm.field_e) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  eh.d();
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var2_ref = me.field_k[cm.field_o];
                var3 = -(li.field_c % var2_ref.field_x);
                L5: while (true) {
                  if ((var3 ^ -1) <= -641) {
                    break L2;
                  } else {
                    stackOut_10_0 = -(db.field_d % var2_ref.field_A);
                    stackIn_20_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var8 != 0) {
                      break L1;
                    } else {
                      var4 = stackIn_11_0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            if ((var4 ^ -1) <= -481) {
                              break L8;
                            } else {
                              var2_ref.g(var3, var4);
                              var4 = var4 + var2_ref.field_A;
                              if (var8 != 0) {
                                break L7;
                              } else {
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var3 = var3 + var2_ref.field_x;
                          break L7;
                        }
                        if (var8 == 0) {
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L1;
            }
            L9: {
              L10: {
                var2_int = stackIn_20_0;
                var3 = 0;
                if ((lj.field_r ^ -1) < -1) {
                  break L10;
                } else {
                  if (je.field_u != je.field_N[cm.field_o]) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                var4 = lj.field_r;
                if ((var4 ^ -1) >= -4001) {
                  break L11;
                } else {
                  var4 = 4000;
                  break L11;
                }
              }
              L12: {
                if ((var4 ^ -1) > -2001) {
                  var4 = 2000;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                var2_int = (int)(Math.sin((double)dl.field_c) * (double)var4) / 1000;
                var3 = (int)(Math.cos((double)(dl.field_c >> 1842227073)) * (double)var4) / 1000;
                if (12 >= var2_int) {
                  break L13;
                } else {
                  var2_int = 12;
                  break L13;
                }
              }
              L14: {
                if (var3 > 8) {
                  var3 = 8;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var2_int < -12) {
                  var2_int = -12;
                  break L15;
                } else {
                  break L15;
                }
              }
              if (7 >= (var3 ^ -1)) {
                break L9;
              } else {
                var3 = -8;
                break L9;
              }
            }
            je.g(var2_int, var3);
            if (param0 > 13) {
              var4 = 0;
              L16: while (true) {
                L17: {
                  L18: {
                    L19: {
                      L20: {
                        if (1000 <= var4) {
                          break L20;
                        } else {
                          stackOut_46_0 = null;
                          stackOut_46_1 = uf.field_p[var4];
                          stackIn_92_0 = stackOut_46_0;
                          stackIn_92_1 = stackOut_46_1;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          if (var8 != 0) {
                            break L19;
                          } else {
                            L21: {
                              if (stackIn_47_0 == stackIn_47_1) {
                                break L21;
                              } else {
                                if (!uf.field_p[var4].a(false)) {
                                  break L21;
                                } else {
                                  uf.field_p[var4].b(-12);
                                  break L21;
                                }
                              }
                            }
                            var4++;
                            if (var8 == 0) {
                              continue L16;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      je.b(var2_int, var3);
                      this.y(1);
                      var4 = 0;
                      L22: while (true) {
                        L23: {
                          if ((var4 ^ -1) <= -1001) {
                            break L23;
                          } else {
                            stackOut_58_0 = null;
                            stackOut_58_1 = uf.field_p[var4];
                            stackIn_92_0 = stackOut_58_0;
                            stackIn_92_1 = stackOut_58_1;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            if (var8 != 0) {
                              break L19;
                            } else {
                              L24: {
                                if (stackIn_59_0 != stackIn_59_1) {
                                  if (uf.field_p[var4].a(false)) {
                                    break L24;
                                  } else {
                                    if (uf.field_p[var4].field_h >= 12) {
                                      break L24;
                                    } else {
                                      uf.field_p[var4].b(-12);
                                      break L24;
                                    }
                                  }
                                } else {
                                  break L24;
                                }
                              }
                              var4++;
                              if (var8 == 0) {
                                continue L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        var4 = 0;
                        L25: while (true) {
                          L26: {
                            if ((var4 ^ -1) <= -1001) {
                              break L26;
                            } else {
                              stackOut_72_0 = null;
                              stackOut_72_1 = uf.field_p[var4];
                              stackIn_92_0 = stackOut_72_0;
                              stackIn_92_1 = stackOut_72_1;
                              stackIn_73_0 = stackOut_72_0;
                              stackIn_73_1 = stackOut_72_1;
                              if (var8 != 0) {
                                break L19;
                              } else {
                                L27: {
                                  if (stackIn_73_0 == stackIn_73_1) {
                                    break L27;
                                  } else {
                                    if (-13 < (uf.field_p[var4].field_h ^ -1)) {
                                      break L27;
                                    } else {
                                      if (!uf.field_p[var4].a(false)) {
                                        uf.field_p[var4].b(-12);
                                        break L27;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                                var4++;
                                if (var8 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          if (!qe.field_b[9]) {
                            break L18;
                          } else {
                            var4 = 0;
                            L28: while (true) {
                              if ((var4 ^ -1) <= -1001) {
                                break L18;
                              } else {
                                if (var8 != 0) {
                                  break L17;
                                } else {
                                  stackOut_90_0 = null;
                                  stackOut_90_1 = uf.field_p[var4];
                                  stackIn_92_0 = stackOut_90_0;
                                  stackIn_92_1 = stackOut_90_1;
                                  L29: {
                                    if (stackIn_92_0 == stackIn_92_1) {
                                      break L29;
                                    } else {
                                      if (uf.field_p[var4].a(false)) {
                                        uf.field_p[var4].b(false);
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                  var4++;
                                  if (var8 == 0) {
                                    continue L28;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L30: while (true) {
                      L31: {
                        if (stackIn_92_0 == stackIn_92_1) {
                          break L31;
                        } else {
                          if (uf.field_p[var4].a(false)) {
                            uf.field_p[var4].b(false);
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                      }
                      var4++;
                      if (var8 == 0) {
                        if ((var4 ^ -1) <= -1001) {
                          break L18;
                        } else {
                          if (var8 != 0) {
                            break L17;
                          } else {
                            stackOut_90_0 = null;
                            stackOut_90_1 = uf.field_p[var4];
                            stackIn_92_0 = stackOut_90_0;
                            stackIn_92_1 = stackOut_90_1;
                            continue L30;
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                  }
                  var4 = 0;
                  break L17;
                }
                L32: while (true) {
                  L33: {
                    L34: {
                      L35: {
                        if (var4 >= 1000) {
                          break L35;
                        } else {
                          if (var8 != 0) {
                            break L34;
                          } else {
                            L36: {
                              if (uf.field_p[var4] == null) {
                                break L36;
                              } else {
                                if (uf.field_p[var4].a(false)) {
                                  uf.field_p[var4].c(-86);
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                            }
                            var4++;
                            if (var8 == 0) {
                              continue L32;
                            } else {
                              break L35;
                            }
                          }
                        }
                      }
                      if (il.e(-31391)) {
                        lj.field_r = (int)((double)lj.field_r * 0.9);
                        var4 = sk.field_d / 10 + (-li.field_c + ca.field_k * 32);
                        break L34;
                      } else {
                        break L33;
                      }
                    }
                    L37: {
                      var5 = mf.field_i / 10 + hf.field_t * 32 + -db.field_d;
                      var6 = 0;
                      if ((pl.field_h ^ -1) == -1) {
                        L38: {
                          if (500 > cm.field_r) {
                            cm.field_r = cm.field_r + 1;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        var6 = 7;
                        a.field_a[var6].f(-4 + var4, var5 + -4 + -cm.field_r);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    L39: {
                      L40: {
                        if (pl.field_h == 1) {
                          break L40;
                        } else {
                          if (pl.field_h == 11) {
                            break L40;
                          } else {
                            break L39;
                          }
                        }
                      }
                      var6 = 120 + 7 * cm.field_r / 50;
                      break L39;
                    }
                    L41: {
                      if (-3 != (pl.field_h ^ -1)) {
                        break L41;
                      } else {
                        var6 = cm.field_r * 4 / 50 + 1;
                        break L41;
                      }
                    }
                    L42: {
                      if (pl.field_h != 8) {
                        break L42;
                      } else {
                        var6 = 4 * cm.field_r / 50 + 136;
                        break L42;
                      }
                    }
                    L43: {
                      if (-4 == (pl.field_h ^ -1)) {
                        L44: {
                          rg.field_wb = rg.field_wb / 2;
                          bd.field_k = bd.field_k / 2;
                          if ((je.e(ca.field_k, hf.field_t, 1, 1) ^ -1) > -6) {
                            break L44;
                          } else {
                            L45: {
                              var6 = 12;
                              if (cm.field_r > 12) {
                                var6++;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                            L46: {
                              if (25 >= cm.field_r) {
                                break L46;
                              } else {
                                var6++;
                                break L46;
                              }
                            }
                            L47: {
                              if ((cm.field_r ^ -1) >= -36) {
                                break L47;
                              } else {
                                var6++;
                                break L47;
                              }
                            }
                            if (cm.field_r < 50) {
                              break L43;
                            } else {
                              var6 = 6;
                              if (var8 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                        L48: {
                          if (0 < je.e(ca.field_k, hf.field_t, 1, 1)) {
                            break L48;
                          } else {
                            pl.field_h = 15;
                            cm.field_r = 0;
                            if (var8 == 0) {
                              break L43;
                            } else {
                              break L48;
                            }
                          }
                        }
                        var6 = cm.field_r % 5 + 83;
                        if (5 < cm.field_r) {
                          cm.field_r = 0;
                          break L43;
                        } else {
                          break L43;
                        }
                      } else {
                        break L43;
                      }
                    }
                    L49: {
                      if (pl.field_h != 12) {
                        break L49;
                      } else {
                        L50: {
                          cm.field_r = cm.field_r + 1;
                          bd.field_k = bd.field_k / 2;
                          rg.field_wb = rg.field_wb / 2;
                          if ((cm.field_r ^ -1) < -6) {
                            var6 = 12;
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        L51: {
                          if (cm.field_r > 10) {
                            var6++;
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                        L52: {
                          if (15 >= cm.field_r) {
                            break L52;
                          } else {
                            var6++;
                            break L52;
                          }
                        }
                        L53: {
                          if ((cm.field_r ^ -1) < -21) {
                            var6++;
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        if (25 <= cm.field_r) {
                          var6 = 6;
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                    }
                    L54: {
                      if (-5 == (pl.field_h ^ -1)) {
                        L55: {
                          if ((cm.field_r ^ -1) > -51) {
                            sk.field_d = sk.field_d + (int)(30.0 * Math.random()) * di.field_K;
                            if (100.0 * Math.random() >= 20.0) {
                              break L55;
                            } else {
                              di.field_K = -di.field_K;
                              break L55;
                            }
                          } else {
                            break L55;
                          }
                        }
                        var6 = 31;
                        break L54;
                      } else {
                        break L54;
                      }
                    }
                    L56: {
                      L57: {
                        if (pl.field_h == 5) {
                          break L57;
                        } else {
                          if ((pl.field_h ^ -1) == -14) {
                            break L57;
                          } else {
                            if ((pl.field_h ^ -1) != -15) {
                              break L56;
                            } else {
                              break L57;
                            }
                          }
                        }
                      }
                      L58: {
                        if (cm.field_r >= 50) {
                          break L58;
                        } else {
                          var6 = 102;
                          a.field_a[var6].a(128 + cm.field_r * 8, 0, -(cm.field_r * 4) + 16 + var5, var4 - -16, -1271909436);
                          if (var8 == 0) {
                            break L56;
                          } else {
                            break L58;
                          }
                        }
                      }
                      L59: {
                        cm.field_r = cm.field_r + 1;
                        if (-61 > (cm.field_r ^ -1)) {
                          break L59;
                        } else {
                          wj.field_l.a(260, 0, 16 + (var5 + -196), 16 + var4, -1271909436);
                          if (var8 == 0) {
                            break L56;
                          } else {
                            break L59;
                          }
                        }
                      }
                      wj.field_l.a(264, 0, var5 + -180 + cm.field_r + -60, var4 - -16, -1271909436);
                      break L56;
                    }
                    L60: {
                      if (-7 != (pl.field_h ^ -1)) {
                        break L60;
                      } else {
                        L61: {
                          var6 = 3 + (2 * cm.field_r / 50 + 48);
                          if (cm.field_r < 50) {
                            break L61;
                          } else {
                            L62: {
                              var6 = 53;
                              cm.field_r = cm.field_r + 1;
                              if ((cm.field_r ^ -1) >= -56) {
                                break L62;
                              } else {
                                var6 = 54;
                                break L62;
                              }
                            }
                            if (-61 > (cm.field_r ^ -1)) {
                              cm.field_r = 50;
                              ke.field_V = false;
                              if (var8 == 0) {
                                break L60;
                              } else {
                                break L61;
                              }
                            } else {
                              break L60;
                            }
                          }
                        }
                        cm.field_r = cm.field_r + 1;
                        break L60;
                      }
                    }
                    L63: {
                      L64: {
                        if (7 == pl.field_h) {
                          break L64;
                        } else {
                          if (10 == pl.field_h) {
                            break L64;
                          } else {
                            break L63;
                          }
                        }
                      }
                      var6 = 30;
                      fieldTemp$1 = cm.field_r;
                      cm.field_r = cm.field_r + 1;
                      var7 = 25 * fieldTemp$1;
                      eh.e(var4 - 1250, 0, var7, 480, 0);
                      eh.e(-var7 + (var4 + 1282), 0, var7, 480, 0);
                      eh.e(0, var5 + -1250, 640, var7, 0);
                      eh.e(0, 32 + var5 + (1250 + -var7), 640, var7, 0);
                      break L63;
                    }
                    if (13 == pl.field_h) {
                      break L33;
                    } else {
                      if (-6 == (pl.field_h ^ -1)) {
                        break L33;
                      } else {
                        if ((pl.field_h ^ -1) == -1) {
                          break L33;
                        } else {
                          if ((pl.field_h ^ -1) == -10) {
                            break L33;
                          } else {
                            if (14 == pl.field_h) {
                              break L33;
                            } else {
                              L65: {
                                L66: {
                                  if (1 == di.field_K) {
                                    break L66;
                                  } else {
                                    if ((pl.field_h ^ -1) != -3) {
                                      break L65;
                                    } else {
                                      if (var6 <= 1) {
                                        break L65;
                                      } else {
                                        break L66;
                                      }
                                    }
                                  }
                                }
                                a.field_a[var6].f(-4 + var4, var5 - 4);
                                if (var8 == 0) {
                                  break L33;
                                } else {
                                  break L65;
                                }
                              }
                              a.field_a[var6].h(var4 - 4, var5 + -4);
                              break L33;
                            }
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.EB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void s(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (u.b(-4440) >= mk.b(99)) {
                  break L2;
                } else {
                  this.field_O = false;
                  if (field_ab == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_bb = gb.field_e;
              this.field_C = nk.field_w;
              this.field_O = true;
              break L1;
            }
            L3: {
              if (param0 >= 82) {
                break L3;
              } else {
                this.k((byte) 40);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.W(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 22) {
              L1: {
                if (fh.field_c != null) {
                  lg.a(fh.field_c, -36);
                  fh.field_c = null;
                  wf.p(param0 + 4440);
                  break L1;
                } else {
                  break L1;
                }
              }
              fl.field_f = lb.a(param0 + -21, 1);
              ei.field_Q = lb.a(1, 2);
              pk.field_g = lb.a(1, 3);
              ig.field_c = lb.a(1, 4);
              ge.field_e = lb.a(1, 5);
              ne.field_L = lb.a(param0 ^ 23, 6);
              id.field_c = lb.a(param0 + -21, 11);
              im.a(ob.field_q, (byte) 82, s.field_P);
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
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.OA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void q(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_ab;
        try {
          L0: {
            this.field_K = false;
            vk.field_a = cm.field_o;
            this.a(3, a.field_c);
            this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
            pl.field_h = 15;
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-22 >= (var2_int ^ -1)) {
                    break L3;
                  } else {
                    qe.field_b[var2_int] = false;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                rj.field_b = false;
                qe.field_b[0] = true;
                qe.field_b[5] = true;
                dg.field_b = false;
                an.field_d = false;
                nk.field_p = false;
                break L2;
              }
              L4: {
                if (param0 == -46) {
                  break L4;
                } else {
                  this.e(true);
                  break L4;
                }
              }
              qe.field_b[6] = true;
              qe.field_b[2] = true;
              this.h((byte) 104);
              je.field_J = false;
              ke.field_V = false;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.VA(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        gf dupTemp$8 = null;
        int fieldTemp$9 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gf var8_ref_gf = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        gf var13_ref_gf = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_290_0 = 0;
        int stackIn_300_0 = 0;
        int stackIn_315_0 = 0;
        int stackIn_315_1 = 0;
        int stackIn_336_0 = 0;
        int stackIn_344_0 = 0;
        int stackIn_344_1 = 0;
        int stackIn_399_0 = 0;
        int stackIn_406_0 = 0;
        int stackIn_413_0 = 0;
        int stackIn_438_0 = 0;
        int stackIn_457_0 = 0;
        boolean stackIn_513_0 = false;
        boolean stackIn_515_0 = false;
        boolean stackIn_517_0 = false;
        boolean stackIn_518_0 = false;
        int stackIn_518_1 = 0;
        int stackIn_731_0 = 0;
        int stackIn_808_0 = 0;
        int stackIn_811_0 = 0;
        int stackIn_906_0 = 0;
        int stackIn_1669_0 = 0;
        int stackIn_2099_0 = 0;
        je stackIn_2599_0 = null;
        je stackIn_2601_0 = null;
        je stackIn_2602_0 = null;
        int stackIn_2602_1 = 0;
        int stackIn_2618_0 = 0;
        int stackIn_2637_0 = 0;
        int stackIn_2653_0 = 0;
        int stackIn_2669_0 = 0;
        int stackIn_2688_0 = 0;
        int stackIn_2704_0 = 0;
        int stackIn_2723_0 = 0;
        int stackIn_2742_0 = 0;
        int stackIn_2771_0 = 0;
        int stackIn_2934_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_287_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_297_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_314_1 = 0;
        int stackOut_333_0 = 0;
        int stackOut_335_0 = 0;
        int stackOut_343_0 = 0;
        int stackOut_343_1 = 0;
        int stackOut_396_0 = 0;
        int stackOut_398_0 = 0;
        int stackOut_403_0 = 0;
        int stackOut_405_0 = 0;
        int stackOut_410_0 = 0;
        int stackOut_412_0 = 0;
        int stackOut_435_0 = 0;
        int stackOut_437_0 = 0;
        int stackOut_456_0 = 0;
        int stackOut_454_0 = 0;
        boolean stackOut_512_0 = false;
        boolean stackOut_517_0 = false;
        int stackOut_517_1 = 0;
        boolean stackOut_513_0 = false;
        boolean stackOut_515_0 = false;
        int stackOut_515_1 = 0;
        int stackOut_728_0 = 0;
        int stackOut_730_0 = 0;
        int stackOut_810_0 = 0;
        int stackOut_807_0 = 0;
        int stackOut_808_0 = 0;
        int stackOut_903_0 = 0;
        int stackOut_905_0 = 0;
        int stackOut_1668_0 = 0;
        int stackOut_1666_0 = 0;
        int stackOut_2096_0 = 0;
        int stackOut_2098_0 = 0;
        je stackOut_2598_0 = null;
        je stackOut_2601_0 = null;
        int stackOut_2601_1 = 0;
        je stackOut_2599_0 = null;
        int stackOut_2599_1 = 0;
        int stackOut_2615_0 = 0;
        int stackOut_2617_0 = 0;
        int stackOut_2634_0 = 0;
        int stackOut_2636_0 = 0;
        int stackOut_2650_0 = 0;
        int stackOut_2652_0 = 0;
        int stackOut_2666_0 = 0;
        int stackOut_2668_0 = 0;
        int stackOut_2685_0 = 0;
        int stackOut_2687_0 = 0;
        int stackOut_2701_0 = 0;
        int stackOut_2703_0 = 0;
        int stackOut_2720_0 = 0;
        int stackOut_2722_0 = 0;
        int stackOut_2739_0 = 0;
        int stackOut_2741_0 = 0;
        int stackOut_2770_0 = 0;
        int stackOut_2768_0 = 0;
        int stackOut_2933_0 = 0;
        int stackOut_2931_0 = 0;
        var21 = field_ab;
        try {
          L0: {
            L1: {
              ce.field_b = ce.field_b + 1;
              if (hf.field_t < 1) {
                hf.field_t = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2561 <= (ce.field_b ^ -1)) {
                break L2;
              } else {
                ce.field_b = ce.field_b - 2560;
                break L2;
              }
            }
            L3: {
              if ((je.field_N[cm.field_o] ^ -1) >= (je.field_u ^ -1)) {
                break L3;
              } else {
                if ((hf.field_t ^ -1) >= (-24 + je.field_t ^ -1)) {
                  break L3;
                } else {
                  je.k();
                  ic.field_k = ic.field_k + 6000;
                  if ((ic.field_k ^ -1) >= -6001) {
                    break L3;
                  } else {
                    ic.field_k = 6000;
                    break L3;
                  }
                }
              }
            }
            L4: {
              if ((je.field_N[cm.field_o] ^ -1) >= (je.field_u ^ -1)) {
                break L4;
              } else {
                L5: {
                  if (rg.field_sb <= 0) {
                    break L5;
                  } else {
                    if (-1 <= (ic.field_k ^ -1)) {
                      break L4;
                    } else {
                      ic.field_k = ic.field_k - 1;
                      if (var21 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                je.field_u = je.field_N[cm.field_o];
                je.k();
                if (me.field_h < 2000) {
                  fn.a(31, 224, 3);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                L8: {
                  if (cn.field_C > -300) {
                    break L8;
                  } else {
                    if (1 == cm.field_o) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if ((kn.field_E ^ -1) < -1) {
                  break L6;
                } else {
                  break L7;
                }
              }
              if (ke.field_V) {
                break L6;
              } else {
                if ((pl.field_h ^ -1) != -16) {
                  break L6;
                } else {
                  this.h((byte) 113);
                  break L6;
                }
              }
            }
            L9: {
              L10: {
                L11: {
                  var2_int = bl.g(param0 ^ param0) ? 1 : 0;
                  if (!il.e(param0 ^ 15079)) {
                    break L11;
                  } else {
                    if (ke.field_V) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                if (sc.field_b) {
                  L12: {
                    if (!mh.field_e[ca.field_k][hf.field_t].field_a) {
                      break L12;
                    } else {
                      if (mh.field_e[ca.field_k][hf.field_t].field_v) {
                        break L12;
                      } else {
                        ag.a(true, 15, 32 * hf.field_t, 32 * ca.field_k);
                        if (var21 == 0) {
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  if (!mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                    break L9;
                  } else {
                    if (mh.field_e[ca.field_k][hf.field_t + -1].field_S) {
                      ag.a(true, 4, 32 * (-1 + hf.field_t), 32 * ca.field_k);
                      if (var21 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    } else {
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              }
              cm.field_r = cm.field_r + 1;
              if (cm.field_r <= 50) {
                break L9;
              } else {
                this.e((byte) -109);
                break L9;
              }
            }
            L13: {
              if (-16 != (pl.field_h ^ -1)) {
                break L13;
              } else {
                if (field_J < 0) {
                  break L13;
                } else {
                  field_J = field_J + 1;
                  if (field_J > 100) {
                    fn.a(29, 226, 3);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
            }
            L14: {
              L15: {
                L16: {
                  var3 = this.v(-1);
                  if (oe.field_b) {
                    break L16;
                  } else {
                    fieldTemp$5 = jh.field_a;
                    jh.field_a = jh.field_a + 1;
                    if (7 < fieldTemp$5) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                L17: {
                  if (!oe.field_b) {
                    break L17;
                  } else {
                    jh.field_a = 0;
                    break L17;
                  }
                }
                var3++;
                if (var21 == 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
              L18: {
                var4 = di.a(true);
                if ((var4 ^ -1) <= (var3 ^ -1)) {
                  break L18;
                } else {
                  this.a(var3, (byte) 122);
                  break L18;
                }
              }
              var3 = 0;
              break L14;
            }
            this.a((byte) -123, var3);
            oe.field_b = false;
            var4 = 0;
            L19: while (true) {
              L20: {
                L21: {
                  L22: {
                    if ((var4 ^ -1) <= -1001) {
                      break L22;
                    } else {
                      if (var21 != 0) {
                        break L21;
                      } else {
                        L23: {
                          if (uf.field_p[var4] != null) {
                            uf.field_p[var4] = uf.field_p[var4].d(true);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        var4++;
                        if (var21 == 0) {
                          continue L19;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  L24: {
                    if (gm.field_a) {
                      break L24;
                    } else {
                      if (ke.field_V) {
                        break L20;
                      } else {
                        if (-16 != (pl.field_h ^ -1)) {
                          break L20;
                        } else {
                          fieldTemp$6 = ca.field_g;
                          ca.field_g = ca.field_g + 1;
                          if (9000 < fieldTemp$6) {
                            gm.field_a = true;
                            if (var21 == 0) {
                              break L20;
                            } else {
                              break L24;
                            }
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                  }
                  this.h((byte) -128);
                  ke.field_V = false;
                  break L21;
                }
                gm.field_a = false;
                break L20;
              }
              L25: {
                L26: {
                  if (ke.field_V) {
                    break L26;
                  } else {
                    if (15 == pl.field_h) {
                      break L26;
                    } else {
                      je.field_l = je.field_l + 0.1;
                      if (var21 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                L27: {
                  if ((lj.field_r ^ -1) < -1) {
                    rg.field_sb = rg.field_sb - 1;
                    lj.field_r = lj.field_r - (1 + lj.field_r / 10);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                nd.field_d.a(param0 ^ 16444);
                je.d();
                break L25;
              }
              L28: {
                L29: {
                  if (kd.field_i) {
                    break L29;
                  } else {
                    db.field_d = 16 + hf.field_t * 32 + mf.field_i / 10 + -240;
                    if (var21 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                L30: {
                  if ((mf.field_i / 10 + (32 * hf.field_t - 240 + 16) ^ -1) < (db.field_d ^ -1)) {
                    break L30;
                  } else {
                    kd.field_i = false;
                    if (var21 == 0) {
                      break L28;
                    } else {
                      break L30;
                    }
                  }
                }
                db.field_d = db.field_d + 1;
                break L28;
              }
              L31: {
                L32: {
                  li.field_c = -304 + (sk.field_d / 10 + 32 * ca.field_k);
                  if ((a.field_c ^ -1) < -1) {
                    break L32;
                  } else {
                    if ((je.field_u ^ -1) == (je.field_N[cm.field_o] ^ -1)) {
                      break L32;
                    } else {
                      if (-3 >= (hf.field_t ^ -1)) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                }
                if (ca.field_k != 16) {
                  break L31;
                } else {
                  if (hf.field_t > 3) {
                    break L31;
                  } else {
                    if (15 != pl.field_h) {
                      break L31;
                    } else {
                      if (ke.field_V) {
                        L33: {
                          L34: {
                            pl.field_h = 0;
                            var3 = this.v(-1);
                            var4 = di.a(true);
                            this.a(0, (byte) 123);
                            this.a((byte) -44, 0);
                            if (var3 > 500) {
                              break L34;
                            } else {
                              if (500 < var4) {
                                break L34;
                              } else {
                                break L33;
                              }
                            }
                          }
                          fn.a(33, 222, 3);
                          break L33;
                        }
                        L35: {
                          if (!je.field_J) {
                            break L35;
                          } else {
                            if (gj.a(18740, 0)) {
                              fn.a(32, 223, 3);
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                        }
                        L36: {
                          di.field_Z = 0;
                          if (10 > nm.field_g[4]) {
                            break L36;
                          } else {
                            if (ke.field_V) {
                              fn.a(13, 242, param0 + 16509);
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                        }
                        L37: {
                          if (25 > jc.field_H) {
                            break L37;
                          } else {
                            if (ke.field_V) {
                              fn.a(12, 243, param0 + 16509);
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                        }
                        ke.field_V = false;
                        this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
                        cm.field_r = 0;
                        if (wf.q(88)) {
                          L38: {
                            a.field_c = a.field_c * 2;
                            var5 = a.field_c / 2;
                            var6 = rg.field_sb % 3;
                            if (var6 == 0) {
                              break L38;
                            } else {
                              L39: {
                                if (var6 == 1) {
                                  break L39;
                                } else {
                                  var7 = var5 / 3;
                                  di.field_X = di.field_X + var7;
                                  vh.field_g = vh.field_g - (-var7 + var5);
                                  if (var21 == 0) {
                                    break L31;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              vh.field_g = vh.field_g - var5;
                              if (var21 == 0) {
                                break L31;
                              } else {
                                break L38;
                              }
                            }
                          }
                          di.field_X = di.field_X + var5;
                          break L31;
                        } else {
                          break L31;
                        }
                      } else {
                        break L31;
                      }
                    }
                  }
                }
              }
              L40: {
                if (-17 < (li.field_c ^ -1)) {
                  li.field_c = 16;
                  break L40;
                } else {
                  break L40;
                }
              }
              L41: {
                if ((-544 + 32 * je.field_t ^ -1) > (db.field_d ^ -1)) {
                  db.field_d = -64 + 32 * je.field_t - 480;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (368 < li.field_c) {
                  li.field_c = 368;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (16 <= db.field_d) {
                  break L43;
                } else {
                  db.field_d = 16;
                  break L43;
                }
              }
              L44: {
                if (ke.field_V) {
                  break L44;
                } else {
                  if (!il.e(-31391)) {
                    break L44;
                  } else {
                    rg.field_wb = 0;
                    bd.field_k = 0;
                    break L44;
                  }
                }
              }
              L45: {
                L46: {
                  if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                    break L46;
                  } else {
                    pc.field_k = 0;
                    if (var21 == 0) {
                      break L45;
                    } else {
                      break L46;
                    }
                  }
                }
                ul.field_b = 0;
                pc.field_k = pc.field_k + 1;
                break L45;
              }
              L47: {
                if (-6 <= (pc.field_k ^ -1)) {
                  break L47;
                } else {
                  L48: {
                    if (-1 > (tc.field_s ^ -1)) {
                      tc.field_s = tc.field_s - 1;
                      je.field_O.a((ca.field_k << -547251998) - -1, 88, (hf.field_t << 671276642) - 1, true);
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  pc.field_k = 0;
                  break L47;
                }
              }
              L49: {
                var4 = fn.a(true) ? 1 : 0;
                if (var4 == 0) {
                  break L49;
                } else {
                  if (tc.field_s >= 4) {
                    break L49;
                  } else {
                    L50: {
                      if ((qd.field_K ^ -1) <= -101) {
                        break L50;
                      } else {
                        qd.field_K = qd.field_K + 1;
                        break L50;
                      }
                    }
                    if (!qe.field_b[15]) {
                      tc.field_s = tc.field_s + 1;
                      je.field_O.e(hf.field_t, ca.field_k, (byte) 83);
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                }
              }
              L51: {
                if (-1 <= (tc.field_s ^ -1)) {
                  break L51;
                } else {
                  ag.a(true, 31, hf.field_t * 32, ca.field_k * 32);
                  break L51;
                }
              }
              L52: {
                L53: {
                  if (!qd.field_O[98]) {
                    break L53;
                  } else {
                    if (qd.field_O[86]) {
                      break L52;
                    } else {
                      break L53;
                    }
                  }
                }
                if (ca.c(-2302)) {
                  break L52;
                } else {
                  if ((dl.field_c & 7 ^ -1) != -1) {
                    break L52;
                  } else {
                    if (100 > qd.field_K) {
                      qd.field_K = qd.field_K + 1;
                      break L52;
                    } else {
                      break L52;
                    }
                  }
                }
              }
              L54: {
                L55: {
                  if (!ke.field_V) {
                    break L55;
                  } else {
                    if (pl.field_h != 15) {
                      break L55;
                    } else {
                      stackOut_287_0 = 1;
                      stackIn_290_0 = stackOut_287_0;
                      break L54;
                    }
                  }
                }
                stackOut_289_0 = 0;
                stackIn_290_0 = stackOut_289_0;
                break L54;
              }
              L56: {
                d.field_b = stackIn_290_0 != 0;
                if ((tc.field_t ^ -1) >= -1) {
                  break L56;
                } else {
                  tc.field_t = tc.field_t - 1;
                  break L56;
                }
              }
              L57: {
                L58: {
                  if (ke.field_V) {
                    break L58;
                  } else {
                    if (pl.field_h != 15) {
                      break L58;
                    } else {
                      stackOut_297_0 = 1;
                      stackIn_300_0 = stackOut_297_0;
                      break L57;
                    }
                  }
                }
                stackOut_299_0 = 0;
                stackIn_300_0 = stackOut_299_0;
                break L57;
              }
              L59: {
                var5 = stackIn_300_0;
                if (var5 == 0) {
                  break L59;
                } else {
                  hf.field_r = hf.field_r - 1;
                  if (0 < hf.field_r) {
                    break L59;
                  } else {
                    if (-161 > (sk.field_d ^ -1)) {
                      break L59;
                    } else {
                      if ((sk.field_d ^ -1) <= 159) {
                        hf.field_r = 50;
                        var6 = 0;
                        var7 = 1;
                        L60: while (true) {
                          L61: {
                            L62: {
                              if ((var7 ^ -1) <= -6) {
                                break L62;
                              } else {
                                stackOut_314_0 = -1;
                                stackOut_314_1 = -var7 + hf.field_t ^ -1;
                                stackIn_344_0 = stackOut_314_0;
                                stackIn_344_1 = stackOut_314_1;
                                stackIn_315_0 = stackOut_314_0;
                                stackIn_315_1 = stackOut_314_1;
                                if (var21 != 0) {
                                  break L61;
                                } else {
                                  if (stackIn_315_0 < stackIn_315_1) {
                                    break L62;
                                  } else {
                                    L63: {
                                      L64: {
                                        if (mh.field_e[ca.field_k][hf.field_t + -var7].field_a) {
                                          break L64;
                                        } else {
                                          if (mh.field_e[-1 + ca.field_k][hf.field_t - var7].field_a) {
                                            break L64;
                                          } else {
                                            if (mh.field_e[ca.field_k + 1][hf.field_t - var7].field_a) {
                                              break L64;
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                      }
                                      L65: {
                                        L66: {
                                          if (!mh.field_e[ca.field_k][-var7 + hf.field_t].field_S) {
                                            break L66;
                                          } else {
                                            if (!mh.field_e[ca.field_k][-var7 + hf.field_t].field_a) {
                                              break L66;
                                            } else {
                                              stackOut_333_0 = 1;
                                              stackIn_336_0 = stackOut_333_0;
                                              break L65;
                                            }
                                          }
                                        }
                                        stackOut_335_0 = 0;
                                        stackIn_336_0 = stackOut_335_0;
                                        break L65;
                                      }
                                      var6 = stackIn_336_0;
                                      if (!mh.field_e[ca.field_k][hf.field_t - var7].field_a) {
                                        break L63;
                                      } else {
                                        if (var21 == 0) {
                                          break L62;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                    var7++;
                                    if (var21 == 0) {
                                      continue L60;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_343_0 = 12;
                            stackOut_343_1 = ca.field_k;
                            stackIn_344_0 = stackOut_343_0;
                            stackIn_344_1 = stackOut_343_1;
                            break L61;
                          }
                          L67: {
                            L68: {
                              if (stackIn_344_0 <= stackIn_344_1) {
                                break L68;
                              } else {
                                this.field_E = 1;
                                if (var21 == 0) {
                                  break L67;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            if (20 >= ca.field_k) {
                              break L67;
                            } else {
                              this.field_E = 2;
                              break L67;
                            }
                          }
                          L69: {
                            L70: {
                              L71: {
                                if (-2 == (this.field_E ^ -1)) {
                                  break L71;
                                } else {
                                  L72: {
                                    if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                                      break L72;
                                    } else {
                                      if (29 <= (sk.field_d ^ -1)) {
                                        break L71;
                                      } else {
                                        break L72;
                                      }
                                    }
                                  }
                                  if (-2 != (this.field_U ^ -1)) {
                                    break L70;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                              L73: {
                                L74: {
                                  L75: {
                                    if (!mh.field_e[ca.field_k - -1][hf.field_t].field_a) {
                                      break L75;
                                    } else {
                                      if (30 <= sk.field_d) {
                                        break L74;
                                      } else {
                                        break L75;
                                      }
                                    }
                                  }
                                  if (this.field_U != 4) {
                                    break L73;
                                  } else {
                                    break L74;
                                  }
                                }
                                this.field_E = 0;
                                if (var21 == 0) {
                                  break L69;
                                } else {
                                  break L73;
                                }
                              }
                              this.field_E = 1;
                              if (var21 == 0) {
                                break L69;
                              } else {
                                break L70;
                              }
                            }
                            this.field_E = 2;
                            break L69;
                          }
                          L76: {
                            L77: {
                              L78: {
                                if (var6 != 0) {
                                  break L78;
                                } else {
                                  if (var2_int == 0) {
                                    break L78;
                                  } else {
                                    if (-251 > (kn.field_E ^ -1)) {
                                      break L77;
                                    } else {
                                      break L78;
                                    }
                                  }
                                }
                              }
                              this.field_U = 0;
                              if (var21 == 0) {
                                break L76;
                              } else {
                                break L77;
                              }
                            }
                            L79: {
                              L80: {
                                if (!mh.field_e[ca.field_k][1 + hf.field_t].field_a) {
                                  break L80;
                                } else {
                                  if (mh.field_e[ca.field_k][1 + hf.field_t].field_b) {
                                    break L80;
                                  } else {
                                    stackOut_396_0 = 1;
                                    stackIn_399_0 = stackOut_396_0;
                                    break L79;
                                  }
                                }
                              }
                              stackOut_398_0 = 0;
                              stackIn_399_0 = stackOut_398_0;
                              break L79;
                            }
                            L81: {
                              L82: {
                                var7 = stackIn_399_0;
                                if (!mh.field_e[ca.field_k - -1][hf.field_t].field_a) {
                                  break L82;
                                } else {
                                  if (mh.field_e[1 + ca.field_k][hf.field_t].field_b) {
                                    break L82;
                                  } else {
                                    stackOut_403_0 = 1;
                                    stackIn_406_0 = stackOut_403_0;
                                    break L81;
                                  }
                                }
                              }
                              stackOut_405_0 = 0;
                              stackIn_406_0 = stackOut_405_0;
                              break L81;
                            }
                            L83: {
                              L84: {
                                var8 = stackIn_406_0;
                                if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                                  break L84;
                                } else {
                                  if (mh.field_e[ca.field_k - 1][hf.field_t].field_b) {
                                    break L84;
                                  } else {
                                    stackOut_410_0 = 1;
                                    stackIn_413_0 = stackOut_410_0;
                                    break L83;
                                  }
                                }
                              }
                              stackOut_412_0 = 0;
                              stackIn_413_0 = stackOut_412_0;
                              break L83;
                            }
                            L85: {
                              L86: {
                                var9 = stackIn_413_0;
                                if (!mh.field_e[ca.field_k][hf.field_t - 1].field_a) {
                                  break L86;
                                } else {
                                  if (mh.field_e[ca.field_k][hf.field_t + -1].field_b) {
                                    break L86;
                                  } else {
                                    L87: {
                                      L88: {
                                        if (-1 <= (di.field_K ^ -1)) {
                                          break L88;
                                        } else {
                                          if (mh.field_e[1 + ca.field_k][hf.field_t + -1].field_b) {
                                            break L88;
                                          } else {
                                            if (!mh.field_e[ca.field_k + 1][hf.field_t].field_b) {
                                              break L87;
                                            } else {
                                              break L88;
                                            }
                                          }
                                        }
                                      }
                                      if (0 <= di.field_K) {
                                        break L86;
                                      } else {
                                        if (mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_b) {
                                          break L86;
                                        } else {
                                          if (mh.field_e[ca.field_k + -1][hf.field_t].field_b) {
                                            break L86;
                                          } else {
                                            break L87;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_435_0 = 1;
                                    stackIn_438_0 = stackOut_435_0;
                                    break L85;
                                  }
                                }
                              }
                              stackOut_437_0 = 0;
                              stackIn_438_0 = stackOut_437_0;
                              break L85;
                            }
                            L89: {
                              L90: {
                                L91: {
                                  L92: {
                                    var10 = stackIn_438_0;
                                    if (var8 == 0) {
                                      break L92;
                                    } else {
                                      if (1 == this.field_U) {
                                        break L91;
                                      } else {
                                        break L92;
                                      }
                                    }
                                  }
                                  if (var9 == 0) {
                                    break L90;
                                  } else {
                                    if (this.field_U != 4) {
                                      break L90;
                                    } else {
                                      break L91;
                                    }
                                  }
                                }
                                if (this.field_U == 5) {
                                  break L90;
                                } else {
                                  if (2 != this.field_U) {
                                    stackOut_456_0 = 0;
                                    stackIn_457_0 = stackOut_456_0;
                                    break L89;
                                  } else {
                                    break L90;
                                  }
                                }
                              }
                              stackOut_454_0 = 1;
                              stackIn_457_0 = stackOut_454_0;
                              break L89;
                            }
                            var11 = stackIn_457_0;
                            if (var11 != 0) {
                              L93: {
                                if (var7 == 0) {
                                  break L93;
                                } else {
                                  if (this.field_U == 2) {
                                    break L93;
                                  } else {
                                    this.field_U = 2;
                                    if (var21 == 0) {
                                      break L76;
                                    } else {
                                      break L93;
                                    }
                                  }
                                }
                              }
                              L94: {
                                L95: {
                                  if (var8 == 0) {
                                    break L95;
                                  } else {
                                    if (-5 != (this.field_U ^ -1)) {
                                      break L94;
                                    } else {
                                      if (this.field_E == 1) {
                                        break L94;
                                      } else {
                                        break L95;
                                      }
                                    }
                                  }
                                }
                                L96: {
                                  L97: {
                                    if (var9 == 0) {
                                      break L97;
                                    } else {
                                      if (-2 != (this.field_U ^ -1)) {
                                        break L96;
                                      } else {
                                        if (2 == this.field_E) {
                                          break L96;
                                        } else {
                                          break L97;
                                        }
                                      }
                                    }
                                  }
                                  L98: {
                                    if (var10 == 0) {
                                      break L98;
                                    } else {
                                      this.field_U = 5;
                                      if (var21 == 0) {
                                        break L76;
                                      } else {
                                        break L98;
                                      }
                                    }
                                  }
                                  this.field_U = 0;
                                  if (var21 == 0) {
                                    break L76;
                                  } else {
                                    break L96;
                                  }
                                }
                                this.field_U = 4;
                                if (var21 == 0) {
                                  break L76;
                                } else {
                                  break L94;
                                }
                              }
                              this.field_U = 1;
                              break L76;
                            } else {
                              break L76;
                            }
                          }
                          L99: {
                            L100: {
                              L101: {
                                if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_b) {
                                  break L101;
                                } else {
                                  if (!mh.field_e[1 + ca.field_k][hf.field_t].field_b) {
                                    break L101;
                                  } else {
                                    if (mh.field_e[ca.field_k][1 + hf.field_t].field_b) {
                                      break L100;
                                    } else {
                                      break L101;
                                    }
                                  }
                                }
                              }
                              if (je.c(ca.field_k, hf.field_t, 3, 3)) {
                                break L99;
                              } else {
                                if (!mh.field_e[ca.field_k + -1][hf.field_t].field_b) {
                                  break L99;
                                } else {
                                  L102: {
                                    stackOut_512_0 = mh.field_e[1 + ca.field_k][hf.field_t].field_b;
                                    stackIn_517_0 = stackOut_512_0;
                                    stackIn_513_0 = stackOut_512_0;
                                    if (mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                                      stackOut_517_0 = stackIn_517_0;
                                      stackOut_517_1 = 0;
                                      stackIn_518_0 = stackOut_517_0;
                                      stackIn_518_1 = stackOut_517_1;
                                      break L102;
                                    } else {
                                      stackOut_513_0 = stackIn_513_0;
                                      stackIn_515_0 = stackOut_513_0;
                                      stackOut_515_0 = stackIn_515_0;
                                      stackOut_515_1 = 1;
                                      stackIn_518_0 = stackOut_515_0;
                                      stackIn_518_1 = stackOut_515_1;
                                      break L102;
                                    }
                                  }
                                  if (stackIn_518_0 ^ stackIn_518_1 == 0) {
                                    break L99;
                                  } else {
                                    if (mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                                      break L99;
                                    } else {
                                      uf.field_p[jf.b((byte) 108)] = new gf(ca.field_k, hf.field_t, 6);
                                      if (var21 == 0) {
                                        break L99;
                                      } else {
                                        break L100;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L103: {
                              L104: {
                                L105: {
                                  if (!mh.field_e[-1 + ca.field_k][-1 + hf.field_t].field_a) {
                                    break L105;
                                  } else {
                                    if (!mh.field_e[-1 + ca.field_k][-1 + hf.field_t].field_b) {
                                      break L104;
                                    } else {
                                      break L105;
                                    }
                                  }
                                }
                                if (!mh.field_e[ca.field_k + 1][hf.field_t + -1].field_a) {
                                  break L103;
                                } else {
                                  if (mh.field_e[ca.field_k - -1][hf.field_t + -1].field_b) {
                                    break L103;
                                  } else {
                                    break L104;
                                  }
                                }
                              }
                              this.field_U = 5;
                              if (var21 == 0) {
                                break L99;
                              } else {
                                break L103;
                              }
                            }
                            L106: {
                              if (mh.field_e[ca.field_k - 1][-1 + hf.field_t].field_a) {
                                break L106;
                              } else {
                                L107: {
                                  if (mh.field_e[ca.field_k + 1][-1 + hf.field_t].field_a) {
                                    break L107;
                                  } else {
                                    this.field_E = 5;
                                    if (var21 == 0) {
                                      break L99;
                                    } else {
                                      break L107;
                                    }
                                  }
                                }
                                this.field_E = 4;
                                if (var21 == 0) {
                                  break L99;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            this.field_E = 5;
                            break L99;
                          }
                          if (250 <= kn.field_E) {
                            break L59;
                          } else {
                            if (!je.c(ca.field_k, -1 + hf.field_t, 1, 1)) {
                              break L59;
                            } else {
                              if (mh.field_e[ca.field_k][hf.field_t + -1].field_a) {
                                break L59;
                              } else {
                                L108: {
                                  L109: {
                                    if (!mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_a) {
                                      break L109;
                                    } else {
                                      if (!mh.field_e[ca.field_k - -1][-1 + hf.field_t].field_a) {
                                        this.field_E = 4;
                                        if (var21 == 0) {
                                          break L108;
                                        } else {
                                          break L109;
                                        }
                                      } else {
                                        break L108;
                                      }
                                    }
                                  }
                                  this.field_E = 5;
                                  break L108;
                                }
                                this.field_U = 0;
                                break L59;
                              }
                            }
                          }
                        }
                      } else {
                        break L59;
                      }
                    }
                  }
                }
              }
              L110: {
                if (-1 != (rj.field_f ^ -1)) {
                  ph.field_b = 0;
                  break L110;
                } else {
                  break L110;
                }
              }
              L111: {
                L112: {
                  L113: {
                    L114: {
                      L115: {
                        L116: {
                          L117: {
                            L118: {
                              L119: {
                                L120: {
                                  L121: {
                                    var13 = rj.field_f;
                                    if (var13 == 0) {
                                      break L121;
                                    } else {
                                      L122: {
                                        if (var13 != 1) {
                                          break L122;
                                        } else {
                                          if (var21 == 0) {
                                            break L120;
                                          } else {
                                            break L122;
                                          }
                                        }
                                      }
                                      if (2 == var13) {
                                        break L119;
                                      } else {
                                        L123: {
                                          if (-4 != (var13 ^ -1)) {
                                            break L123;
                                          } else {
                                            if (var21 == 0) {
                                              break L118;
                                            } else {
                                              break L123;
                                            }
                                          }
                                        }
                                        L124: {
                                          if (4 != var13) {
                                            break L124;
                                          } else {
                                            if (var21 == 0) {
                                              break L118;
                                            } else {
                                              break L124;
                                            }
                                          }
                                        }
                                        if (var13 == 7) {
                                          break L117;
                                        } else {
                                          if (8 == var13) {
                                            break L116;
                                          } else {
                                            if ((var13 ^ -1) == -10) {
                                              break L115;
                                            } else {
                                              if (10 == var13) {
                                                break L114;
                                              } else {
                                                if (11 == var13) {
                                                  break L113;
                                                } else {
                                                  L125: {
                                                    if ((var13 ^ -1) != -13) {
                                                      break L125;
                                                    } else {
                                                      if (var21 == 0) {
                                                        break L112;
                                                      } else {
                                                        break L125;
                                                      }
                                                    }
                                                  }
                                                  if (13 != var13) {
                                                    break L111;
                                                  } else {
                                                    if (var21 == 0) {
                                                      L126: {
                                                        field_J = 0;
                                                        ne.a(36, 57);
                                                        kj.field_d = kj.field_d + 1;
                                                        if (-6 > (kj.field_d ^ -1)) {
                                                          tb.field_c = tb.field_c + 1;
                                                          kj.field_d = 0;
                                                          break L126;
                                                        } else {
                                                          break L126;
                                                        }
                                                      }
                                                      L127: {
                                                        if (tb.field_c >= pc.field_f.length) {
                                                          tb.field_c = 0;
                                                          break L127;
                                                        } else {
                                                          break L127;
                                                        }
                                                      }
                                                      L128: {
                                                        L129: {
                                                          if ((nf.field_e ^ -1) < -1) {
                                                            break L129;
                                                          } else {
                                                            rj.field_f = 4;
                                                            tc.field_s = 0;
                                                            if (var21 == 0) {
                                                              break L128;
                                                            } else {
                                                              break L129;
                                                            }
                                                          }
                                                        }
                                                        nf.field_e = nf.field_e - 1;
                                                        break L128;
                                                      }
                                                      L130: {
                                                        if ((qd.field_K ^ -1) < -1) {
                                                          qd.field_K = qd.field_K - 1;
                                                          break L130;
                                                        } else {
                                                          break L130;
                                                        }
                                                      }
                                                      L131: {
                                                        if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                                                          break L131;
                                                        } else {
                                                          je.field_O.a(ca.field_k, -4, hf.field_t);
                                                          uf.field_p[jf.b((byte) 108)] = new gf(ca.field_k, hf.field_t, 16);
                                                          break L131;
                                                        }
                                                      }
                                                      L132: {
                                                        if (!d.field_b) {
                                                          break L132;
                                                        } else {
                                                          if (!qd.field_O[96]) {
                                                            break L132;
                                                          } else {
                                                            di.field_K = -1;
                                                            rg.field_wb = -10;
                                                            break L132;
                                                          }
                                                        }
                                                      }
                                                      L133: {
                                                        if (159 <= (bd.field_k ^ -1)) {
                                                          break L133;
                                                        } else {
                                                          bd.field_k = -160;
                                                          break L133;
                                                        }
                                                      }
                                                      L134: {
                                                        if (!d.field_b) {
                                                          break L134;
                                                        } else {
                                                          if (!qd.field_O[97]) {
                                                            break L134;
                                                          } else {
                                                            di.field_K = 1;
                                                            rg.field_wb = 10;
                                                            break L134;
                                                          }
                                                        }
                                                      }
                                                      L135: {
                                                        if ((nf.field_e & 3) != 0) {
                                                          break L135;
                                                        } else {
                                                          var13_ref_gf = new gf(ca.field_k, hf.field_t, 16);
                                                          var13_ref_gf.field_g = 0;
                                                          var13_ref_gf.field_b = 240;
                                                          uf.field_p[jf.b((byte) 61)] = var13_ref_gf;
                                                          bd.field_k = -160;
                                                          break L135;
                                                        }
                                                      }
                                                      L136: {
                                                        mf.field_i = mf.field_i + bd.field_k;
                                                        sk.field_d = sk.field_d + rg.field_wb;
                                                        if ((mf.field_i ^ -1) >= -41) {
                                                          break L136;
                                                        } else {
                                                          if (!mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                                                            break L136;
                                                          } else {
                                                            mf.field_i = 40;
                                                            bd.field_k = 0;
                                                            break L136;
                                                          }
                                                        }
                                                      }
                                                      L137: {
                                                        if (mf.field_i >= -40) {
                                                          break L137;
                                                        } else {
                                                          if (!mh.field_e[ca.field_k][hf.field_t + -1].g()) {
                                                            break L137;
                                                          } else {
                                                            mf.field_i = -40;
                                                            bd.field_k = 0;
                                                            break L137;
                                                          }
                                                        }
                                                      }
                                                      L138: {
                                                        if (-81 <= (sk.field_d ^ -1)) {
                                                          break L138;
                                                        } else {
                                                          if ((mf.field_i ^ -1) <= 39) {
                                                            break L138;
                                                          } else {
                                                            if (mh.field_e[ca.field_k + 1][hf.field_t - 1].g()) {
                                                              sk.field_d = 80;
                                                              break L138;
                                                            } else {
                                                              break L138;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L139: {
                                                        if (sk.field_d >= -80) {
                                                          break L139;
                                                        } else {
                                                          if (-40 <= mf.field_i) {
                                                            break L139;
                                                          } else {
                                                            if (mh.field_e[ca.field_k - 1][-1 + hf.field_t].g()) {
                                                              sk.field_d = -80;
                                                              break L139;
                                                            } else {
                                                              break L139;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L140: {
                                                        if (sk.field_d <= 80) {
                                                          break L140;
                                                        } else {
                                                          if (mf.field_i <= 40) {
                                                            break L140;
                                                          } else {
                                                            if (!mh.field_e[ca.field_k - -1][hf.field_t - -1].g()) {
                                                              break L140;
                                                            } else {
                                                              sk.field_d = 80;
                                                              break L140;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L141: {
                                                        if (sk.field_d >= -80) {
                                                          break L141;
                                                        } else {
                                                          if (40 >= mf.field_i) {
                                                            break L141;
                                                          } else {
                                                            if (!mh.field_e[ca.field_k + -1][hf.field_t - -1].g()) {
                                                              break L141;
                                                            } else {
                                                              sk.field_d = -80;
                                                              break L141;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L142: {
                                                        if (sk.field_d <= 80) {
                                                          break L142;
                                                        } else {
                                                          if (mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                                                            sk.field_d = 80;
                                                            break L142;
                                                          } else {
                                                            break L142;
                                                          }
                                                        }
                                                      }
                                                      L143: {
                                                        if (-80 <= sk.field_d) {
                                                          break L143;
                                                        } else {
                                                          if (!mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                                                            break L143;
                                                          } else {
                                                            sk.field_d = -80;
                                                            break L143;
                                                          }
                                                        }
                                                      }
                                                      L144: {
                                                        if (-161 > (sk.field_d ^ -1)) {
                                                          ca.field_k = ca.field_k + 1;
                                                          sk.field_d = sk.field_d - 320;
                                                          break L144;
                                                        } else {
                                                          break L144;
                                                        }
                                                      }
                                                      L145: {
                                                        if (sk.field_d < -160) {
                                                          ca.field_k = ca.field_k - 1;
                                                          sk.field_d = sk.field_d + 320;
                                                          break L145;
                                                        } else {
                                                          break L145;
                                                        }
                                                      }
                                                      L146: {
                                                        if ((mf.field_i ^ -1) < -161) {
                                                          hf.field_t = hf.field_t + 1;
                                                          mf.field_i = mf.field_i - 320;
                                                          break L146;
                                                        } else {
                                                          break L146;
                                                        }
                                                      }
                                                      L147: {
                                                        if (-160 <= mf.field_i) {
                                                          break L147;
                                                        } else {
                                                          mf.field_i = mf.field_i + 320;
                                                          hf.field_t = hf.field_t - 1;
                                                          break L147;
                                                        }
                                                      }
                                                      if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                                                        rj.field_f = 2;
                                                        break L111;
                                                      } else {
                                                        break L111;
                                                      }
                                                    } else {
                                                      break L121;
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
                                  L148: {
                                    L149: {
                                      L150: {
                                        if (!d.field_b) {
                                          break L150;
                                        } else {
                                          if (qd.field_O[96]) {
                                            break L149;
                                          } else {
                                            break L150;
                                          }
                                        }
                                      }
                                      if (2 == this.field_E) {
                                        break L149;
                                      } else {
                                        if (this.field_E != 5) {
                                          break L148;
                                        } else {
                                          break L149;
                                        }
                                      }
                                    }
                                    rj.field_f = 1;
                                    di.field_K = -1;
                                    if (!d.field_b) {
                                      break L148;
                                    } else {
                                      gl.a(7, 25);
                                      break L148;
                                    }
                                  }
                                  L151: {
                                    L152: {
                                      L153: {
                                        if (!d.field_b) {
                                          break L153;
                                        } else {
                                          if (qd.field_O[97]) {
                                            break L152;
                                          } else {
                                            break L153;
                                          }
                                        }
                                      }
                                      if (-2 == (this.field_E ^ -1)) {
                                        break L152;
                                      } else {
                                        if (-5 != (this.field_E ^ -1)) {
                                          break L151;
                                        } else {
                                          break L152;
                                        }
                                      }
                                    }
                                    di.field_K = 1;
                                    rj.field_f = 1;
                                    if (!d.field_b) {
                                      break L151;
                                    } else {
                                      gl.a(7, 25);
                                      break L151;
                                    }
                                  }
                                  L154: {
                                    L155: {
                                      L156: {
                                        if (!d.field_b) {
                                          break L156;
                                        } else {
                                          if (!qd.field_O[98]) {
                                            break L156;
                                          } else {
                                            if (!ag.field_c) {
                                              break L155;
                                            } else {
                                              break L156;
                                            }
                                          }
                                        }
                                      }
                                      if (this.field_E == 3) {
                                        break L155;
                                      } else {
                                        if (-5 == (this.field_E ^ -1)) {
                                          break L155;
                                        } else {
                                          if (this.field_E == 5) {
                                            break L155;
                                          } else {
                                            break L154;
                                          }
                                        }
                                      }
                                    }
                                    L157: {
                                      var13 = 1;
                                      if (mh.field_e[ca.field_k][hf.field_t].field_a) {
                                        var13 = 0;
                                        break L157;
                                      } else {
                                        break L157;
                                      }
                                    }
                                    L158: {
                                      if (!mh.field_e[ca.field_k][hf.field_t + -1].g()) {
                                        break L158;
                                      } else {
                                        var13 = 0;
                                        break L158;
                                      }
                                    }
                                    L159: {
                                      if (sk.field_d + 10 * di.field_K <= 165) {
                                        break L159;
                                      } else {
                                        if (!mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                                          break L159;
                                        } else {
                                          var13 = 0;
                                          break L159;
                                        }
                                      }
                                    }
                                    L160: {
                                      if ((10 * di.field_K + sk.field_d ^ -1) <= 164) {
                                        break L160;
                                      } else {
                                        if (mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                                          var13 = 0;
                                          break L160;
                                        } else {
                                          break L160;
                                        }
                                      }
                                    }
                                    if (var13 == 0) {
                                      break L154;
                                    } else {
                                      L161: {
                                        if (!qe.field_b[20]) {
                                          break L161;
                                        } else {
                                          if (!qd.field_O[49]) {
                                            break L161;
                                          } else {
                                            if (qd.field_K <= 10) {
                                              break L161;
                                            } else {
                                              rj.field_f = 12;
                                              if (var21 == 0) {
                                                break L154;
                                              } else {
                                                break L161;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      bd.field_k = -40;
                                      rj.field_f = 3;
                                      rg.field_wb = 10 * di.field_K;
                                      ne.a(10, 79);
                                      break L154;
                                    }
                                  }
                                  L162: {
                                    L163: {
                                      if (qe.field_b[18]) {
                                        break L163;
                                      } else {
                                        L164: {
                                          if ((tc.field_s ^ -1) < -1) {
                                            break L164;
                                          } else {
                                            if (mh.field_e[ca.field_k][1 + hf.field_t].field_E) {
                                              break L164;
                                            } else {
                                              L165: {
                                                if (-1 >= (sk.field_d ^ -1)) {
                                                  break L165;
                                                } else {
                                                  if (mh.field_e[ca.field_k + -1][hf.field_t + 1].field_E) {
                                                    break L164;
                                                  } else {
                                                    break L165;
                                                  }
                                                }
                                              }
                                              if ((sk.field_d ^ -1) >= -1) {
                                                break L163;
                                              } else {
                                                if (!mh.field_e[1 + ca.field_k][hf.field_t - -1].field_E) {
                                                  break L163;
                                                } else {
                                                  break L164;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_728_0 = 1;
                                        stackIn_731_0 = stackOut_728_0;
                                        break L162;
                                      }
                                    }
                                    stackOut_730_0 = 0;
                                    stackIn_731_0 = stackOut_730_0;
                                    break L162;
                                  }
                                  L166: {
                                    L167: {
                                      var13 = stackIn_731_0;
                                      if (var2_int == 0) {
                                        break L167;
                                      } else {
                                        if (var13 == 0) {
                                          break L166;
                                        } else {
                                          this.w(105);
                                          if (var21 == 0) {
                                            break L166;
                                          } else {
                                            break L167;
                                          }
                                        }
                                      }
                                    }
                                    rj.field_f = 4;
                                    break L166;
                                  }
                                  L168: {
                                    L169: {
                                      if (!qe.field_b[4]) {
                                        break L169;
                                      } else {
                                        if (var2_int != 0) {
                                          break L168;
                                        } else {
                                          break L169;
                                        }
                                      }
                                    }
                                    if (ph.field_b == 6) {
                                      ph.field_b = 0;
                                      break L168;
                                    } else {
                                      break L168;
                                    }
                                  }
                                  L170: {
                                    tb.field_c = 0;
                                    an.field_f = an.field_f - 1;
                                    if (-1 > (an.field_f ^ -1)) {
                                      break L170;
                                    } else {
                                      L171: {
                                        if ((ph.field_b ^ -1) != -1) {
                                          break L171;
                                        } else {
                                          ph.field_b = (int)(3.0 * Math.random() + 1.0);
                                          an.field_f = 5;
                                          tf.field_b = 0;
                                          if (var21 == 0) {
                                            break L170;
                                          } else {
                                            break L171;
                                          }
                                        }
                                      }
                                      L172: {
                                        an.field_f = 5;
                                        tf.field_b = tf.field_b + 1;
                                        if ((tf.field_b ^ -1) < -5) {
                                          break L172;
                                        } else {
                                          if (3 >= tf.field_b) {
                                            break L170;
                                          } else {
                                            if (ph.field_b == 1) {
                                              break L172;
                                            } else {
                                              break L170;
                                            }
                                          }
                                        }
                                      }
                                      ph.field_b = 0;
                                      an.field_f = 500;
                                      break L170;
                                    }
                                  }
                                  L173: {
                                    if (ph.field_b != 0) {
                                      break L173;
                                    } else {
                                      if (an.field_f >= 400) {
                                        break L173;
                                      } else {
                                        if ((mh.field_e[ca.field_k][hf.field_t - -1].field_q ^ -1) < -1) {
                                          tf.field_b = 0;
                                          ph.field_b = 4;
                                          an.field_f = 5;
                                          break L173;
                                        } else {
                                          break L173;
                                        }
                                      }
                                    }
                                  }
                                  L174: {
                                    if (mh.field_e[ca.field_k][hf.field_t + 1].field_q <= 150) {
                                      break L174;
                                    } else {
                                      if (-6 != (ph.field_b ^ -1)) {
                                        tf.field_b = 0;
                                        an.field_f = 5;
                                        ph.field_b = 5;
                                        break L174;
                                      } else {
                                        break L174;
                                      }
                                    }
                                  }
                                  L175: {
                                    if (1 == ph.field_b) {
                                      tb.field_c = ph.field_b * 8 - -tf.field_b;
                                      break L175;
                                    } else {
                                      break L175;
                                    }
                                  }
                                  L176: {
                                    if ((ph.field_b ^ -1) != -3) {
                                      break L176;
                                    } else {
                                      tb.field_c = ph.field_b * 8 - -tf.field_b;
                                      break L176;
                                    }
                                  }
                                  L177: {
                                    if ((ph.field_b ^ -1) != -4) {
                                      break L177;
                                    } else {
                                      tb.field_c = ph.field_b * 8 + tf.field_b;
                                      break L177;
                                    }
                                  }
                                  L178: {
                                    if (ph.field_b != 4) {
                                      break L178;
                                    } else {
                                      tb.field_c = 21 - -(tf.field_b % 3);
                                      break L178;
                                    }
                                  }
                                  L179: {
                                    if (5 != ph.field_b) {
                                      break L179;
                                    } else {
                                      tb.field_c = tf.field_b + 83;
                                      break L179;
                                    }
                                  }
                                  L180: {
                                    if (ph.field_b == 0) {
                                      var13 = 0;
                                      var14 = hf.field_t;
                                      L181: while (true) {
                                        L182: {
                                          if (var13 != 0) {
                                            stackOut_810_0 = 0;
                                            stackIn_811_0 = stackOut_810_0;
                                            break L182;
                                          } else {
                                            stackOut_807_0 = 1;
                                            stackIn_811_0 = stackOut_807_0;
                                            stackIn_808_0 = stackOut_807_0;
                                            if (var21 != 0) {
                                              break L182;
                                            } else {
                                              stackOut_808_0 = stackIn_808_0;
                                              stackIn_811_0 = stackOut_808_0;
                                              break L182;
                                            }
                                          }
                                        }
                                        if (stackIn_811_0 != 1) {
                                          break L180;
                                        } else {
                                          L183: {
                                            var14--;
                                            if (var14 < 1) {
                                              var13 = 1;
                                              break L183;
                                            } else {
                                              break L183;
                                            }
                                          }
                                          if (mh.field_e[ca.field_k][var14].field_a) {
                                            L184: {
                                              if (!mh.field_e[ca.field_k][var14].field_S) {
                                                break L184;
                                              } else {
                                                tb.field_c = 29;
                                                if (-951 > (mh.field_e[ca.field_k][var14].field_r ^ -1)) {
                                                  tb.field_c = 30;
                                                  break L184;
                                                } else {
                                                  break L184;
                                                }
                                              }
                                            }
                                            var13 = 1;
                                            if (var21 == 0) {
                                              continue L181;
                                            } else {
                                              break L180;
                                            }
                                          } else {
                                            continue L181;
                                          }
                                        }
                                      }
                                    } else {
                                      break L180;
                                    }
                                  }
                                  if (!qe.field_b[4]) {
                                    break L111;
                                  } else {
                                    if (var2_int != 0) {
                                      L185: {
                                        var2_int = 0;
                                        if (bd.field_k < 0) {
                                          break L185;
                                        } else {
                                          if (!qd.field_O[99]) {
                                            L186: {
                                              if ((sk.field_d ^ -1) <= 29) {
                                                break L186;
                                              } else {
                                                if (mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                                                  var2_int = 1;
                                                  break L186;
                                                } else {
                                                  break L186;
                                                }
                                              }
                                            }
                                            if ((sk.field_d ^ -1) >= -31) {
                                              break L185;
                                            } else {
                                              if (!mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                                                break L185;
                                              } else {
                                                var2_int = 1;
                                                break L185;
                                              }
                                            }
                                          } else {
                                            break L185;
                                          }
                                        }
                                      }
                                      L187: {
                                        if (mf.field_i < 0) {
                                          break L187;
                                        } else {
                                          if (bd.field_k < 0) {
                                            break L187;
                                          } else {
                                            L188: {
                                              if (!mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                                                break L188;
                                              } else {
                                                var2_int = 0;
                                                break L188;
                                              }
                                            }
                                            L189: {
                                              if (79 >= (sk.field_d ^ -1)) {
                                                break L189;
                                              } else {
                                                if (!mh.field_e[ca.field_k + -1][1 + hf.field_t].g()) {
                                                  break L189;
                                                } else {
                                                  var2_int = 0;
                                                  break L189;
                                                }
                                              }
                                            }
                                            if (80 >= sk.field_d) {
                                              break L187;
                                            } else {
                                              if (mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                                                var2_int = 0;
                                                break L187;
                                              } else {
                                                break L187;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L190: {
                                        if (var2_int != 0) {
                                          L191: {
                                            tb.field_c = 104;
                                            mf.field_i = mf.field_i / 2;
                                            if (ph.field_b != 6) {
                                              an.field_f = 5;
                                              ph.field_b = 6;
                                              break L191;
                                            } else {
                                              break L191;
                                            }
                                          }
                                          if ((an.field_f ^ -1) <= -3) {
                                            break L190;
                                          } else {
                                            an.field_f = 2;
                                            tb.field_c = tb.field_c + 1;
                                            break L190;
                                          }
                                        } else {
                                          break L190;
                                        }
                                      }
                                      var2_int = 1;
                                      if (var21 == 0) {
                                        break L111;
                                      } else {
                                        break L120;
                                      }
                                    } else {
                                      break L111;
                                    }
                                  }
                                }
                                L192: {
                                  L193: {
                                    var7 = 1;
                                    if (qe.field_b[18]) {
                                      break L193;
                                    } else {
                                      L194: {
                                        if (tc.field_s > 0) {
                                          break L194;
                                        } else {
                                          if (mh.field_e[ca.field_k][1 + hf.field_t].field_E) {
                                            break L194;
                                          } else {
                                            L195: {
                                              if (-1 >= (sk.field_d ^ -1)) {
                                                break L195;
                                              } else {
                                                if (mh.field_e[ca.field_k + -1][hf.field_t - -1].field_E) {
                                                  break L194;
                                                } else {
                                                  break L195;
                                                }
                                              }
                                            }
                                            if ((sk.field_d ^ -1) >= -1) {
                                              break L193;
                                            } else {
                                              if (!mh.field_e[ca.field_k - -1][1 + hf.field_t].field_E) {
                                                break L193;
                                              } else {
                                                break L194;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_903_0 = 1;
                                      stackIn_906_0 = stackOut_903_0;
                                      break L192;
                                    }
                                  }
                                  stackOut_905_0 = 0;
                                  stackIn_906_0 = stackOut_905_0;
                                  break L192;
                                }
                                L196: {
                                  L197: {
                                    L198: {
                                      var6 = stackIn_906_0;
                                      if (!d.field_b) {
                                        break L198;
                                      } else {
                                        if (qd.field_O[96]) {
                                          break L197;
                                        } else {
                                          break L198;
                                        }
                                      }
                                    }
                                    if (this.field_E == 2) {
                                      break L197;
                                    } else {
                                      if (var6 != 0) {
                                        break L196;
                                      } else {
                                        if (0 > rg.field_wb) {
                                          rg.field_wb = rg.field_wb + 1;
                                          if (var21 == 0) {
                                            break L196;
                                          } else {
                                            break L197;
                                          }
                                        } else {
                                          break L196;
                                        }
                                      }
                                    }
                                  }
                                  L199: {
                                    L200: {
                                      if (var6 != 0) {
                                        break L200;
                                      } else {
                                        rg.field_wb = -20;
                                        if (var21 == 0) {
                                          break L199;
                                        } else {
                                          break L200;
                                        }
                                      }
                                    }
                                    if ((rg.field_wb ^ -1) >= 29) {
                                      break L199;
                                    } else {
                                      rg.field_wb = rg.field_wb - 1;
                                      break L199;
                                    }
                                  }
                                  di.field_K = -1;
                                  var7 = 0;
                                  if (!qe.field_b[11]) {
                                    break L196;
                                  } else {
                                    if (-1 >= (sk.field_d ^ -1)) {
                                      break L196;
                                    } else {
                                      if (mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                                        L201: {
                                          if (25 <= tc.field_t) {
                                            break L201;
                                          } else {
                                            tc.field_t = tc.field_t + 2;
                                            if (var21 == 0) {
                                              break L196;
                                            } else {
                                              break L201;
                                            }
                                          }
                                        }
                                        rj.field_f = 10;
                                        rg.field_wb = -50;
                                        kj.field_d = 0;
                                        bd.field_k = -10;
                                        tc.field_t = 0;
                                        break L196;
                                      } else {
                                        break L196;
                                      }
                                    }
                                  }
                                }
                                L202: {
                                  L203: {
                                    L204: {
                                      if (!d.field_b) {
                                        break L204;
                                      } else {
                                        if (qd.field_O[97]) {
                                          break L203;
                                        } else {
                                          break L204;
                                        }
                                      }
                                    }
                                    if (-2 == (this.field_E ^ -1)) {
                                      break L203;
                                    } else {
                                      if (var6 != 0) {
                                        break L202;
                                      } else {
                                        if (-1 <= (rg.field_wb ^ -1)) {
                                          break L202;
                                        } else {
                                          rg.field_wb = rg.field_wb - 1;
                                          if (var21 == 0) {
                                            break L202;
                                          } else {
                                            break L203;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L205: {
                                    L206: {
                                      di.field_K = 1;
                                      var7 = 0;
                                      if (var6 != 0) {
                                        break L206;
                                      } else {
                                        rg.field_wb = 20;
                                        if (var21 == 0) {
                                          break L205;
                                        } else {
                                          break L206;
                                        }
                                      }
                                    }
                                    if (-31 >= (rg.field_wb ^ -1)) {
                                      break L205;
                                    } else {
                                      rg.field_wb = rg.field_wb + 1;
                                      break L205;
                                    }
                                  }
                                  if (!qe.field_b[11]) {
                                    break L202;
                                  } else {
                                    if (sk.field_d <= 0) {
                                      break L202;
                                    } else {
                                      if (mh.field_e[ca.field_k + 1][hf.field_t].field_a) {
                                        L207: {
                                          if (tc.field_t < 25) {
                                            break L207;
                                          } else {
                                            bd.field_k = -10;
                                            tc.field_t = 0;
                                            rj.field_f = 10;
                                            rg.field_wb = 50;
                                            kj.field_d = 0;
                                            if (var21 == 0) {
                                              break L202;
                                            } else {
                                              break L207;
                                            }
                                          }
                                        }
                                        tc.field_t = tc.field_t + 2;
                                        break L202;
                                      } else {
                                        break L202;
                                      }
                                    }
                                  }
                                }
                                L208: {
                                  if (var6 != 0) {
                                    break L208;
                                  } else {
                                    L209: {
                                      L210: {
                                        if (!d.field_b) {
                                          break L210;
                                        } else {
                                          if (!qd.field_O[96]) {
                                            break L210;
                                          } else {
                                            if (!qd.field_O[99]) {
                                              break L210;
                                            } else {
                                              di.field_K = -1;
                                              var7 = 0;
                                              rg.field_wb = -10;
                                              if (var21 == 0) {
                                                break L209;
                                              } else {
                                                break L210;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (0 > rg.field_wb) {
                                        rg.field_wb = rg.field_wb + 1;
                                        break L209;
                                      } else {
                                        break L209;
                                      }
                                    }
                                    L211: {
                                      L212: {
                                        if (!d.field_b) {
                                          break L212;
                                        } else {
                                          if (!qd.field_O[97]) {
                                            break L212;
                                          } else {
                                            if (qd.field_O[99]) {
                                              break L211;
                                            } else {
                                              break L212;
                                            }
                                          }
                                        }
                                      }
                                      if (0 >= rg.field_wb) {
                                        break L208;
                                      } else {
                                        rg.field_wb = rg.field_wb - 1;
                                        if (var21 == 0) {
                                          break L208;
                                        } else {
                                          break L211;
                                        }
                                      }
                                    }
                                    var7 = 0;
                                    di.field_K = 1;
                                    rg.field_wb = 10;
                                    break L208;
                                  }
                                }
                                L213: {
                                  if (!d.field_b) {
                                    break L213;
                                  } else {
                                    if (!qd.field_O[98]) {
                                      break L213;
                                    } else {
                                      if (ag.field_c) {
                                        break L213;
                                      } else {
                                        L214: {
                                          var13 = 1;
                                          if (mh.field_e[ca.field_k][hf.field_t].field_a) {
                                            var13 = 0;
                                            break L214;
                                          } else {
                                            break L214;
                                          }
                                        }
                                        L215: {
                                          if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                                            var13 = 0;
                                            break L215;
                                          } else {
                                            break L215;
                                          }
                                        }
                                        L216: {
                                          if (10 * di.field_K + sk.field_d <= 165) {
                                            break L216;
                                          } else {
                                            if (mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                                              var13 = 0;
                                              break L216;
                                            } else {
                                              break L216;
                                            }
                                          }
                                        }
                                        L217: {
                                          if ((sk.field_d + 10 * di.field_K ^ -1) <= 164) {
                                            break L217;
                                          } else {
                                            if (!mh.field_e[ca.field_k - 1][-1 + hf.field_t].g()) {
                                              break L217;
                                            } else {
                                              var13 = 0;
                                              break L217;
                                            }
                                          }
                                        }
                                        if (var13 == 0) {
                                          break L213;
                                        } else {
                                          rg.field_wb = di.field_K * 10;
                                          rj.field_f = 3;
                                          bd.field_k = -40;
                                          ne.a(10, -77);
                                          break L213;
                                        }
                                      }
                                    }
                                  }
                                }
                                L218: {
                                  this.w(param0 + 16427);
                                  if (var2_int == 0) {
                                    rj.field_f = 4;
                                    break L218;
                                  } else {
                                    break L218;
                                  }
                                }
                                L219: {
                                  L220: {
                                    if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                                      break L220;
                                    } else {
                                      if (!je.a(ca.field_k, hf.field_t, 1, 1)) {
                                        break L219;
                                      } else {
                                        break L220;
                                      }
                                    }
                                  }
                                  if (var2_int != 0) {
                                    break L219;
                                  } else {
                                    rj.field_f = 2;
                                    ne.a(30, 59);
                                    break L219;
                                  }
                                }
                                L221: {
                                  L222: {
                                    an.field_f = an.field_f - 1;
                                    if ((rg.field_wb ^ -1) == -1) {
                                      break L222;
                                    } else {
                                      if (var6 == 0) {
                                        break L221;
                                      } else {
                                        if (var7 == 0) {
                                          break L221;
                                        } else {
                                          break L222;
                                        }
                                      }
                                    }
                                  }
                                  if (var2_int == 0) {
                                    break L221;
                                  } else {
                                    rj.field_f = 0;
                                    break L221;
                                  }
                                }
                                L223: {
                                  L224: {
                                    if (-1 < (an.field_f ^ -1)) {
                                      break L224;
                                    } else {
                                      if (-3 > (an.field_f ^ -1)) {
                                        break L224;
                                      } else {
                                        break L223;
                                      }
                                    }
                                  }
                                  L225: {
                                    an.field_f = 2;
                                    tf.field_b = tf.field_b + 1;
                                    if (tf.field_b == 1) {
                                      break L225;
                                    } else {
                                      if ((tf.field_b ^ -1) == -5) {
                                        break L225;
                                      } else {
                                        break L223;
                                      }
                                    }
                                  }
                                  ne.a(31, -101);
                                  break L223;
                                }
                                tf.field_b = tf.field_b % 7;
                                tb.field_c = tf.field_b + 112;
                                if (var21 == 0) {
                                  break L111;
                                } else {
                                  break L119;
                                }
                              }
                              L226: {
                                L227: {
                                  L228: {
                                    if (!d.field_b) {
                                      break L228;
                                    } else {
                                      if (qd.field_O[96]) {
                                        break L227;
                                      } else {
                                        break L228;
                                      }
                                    }
                                  }
                                  if (-3 == (this.field_E ^ -1)) {
                                    break L227;
                                  } else {
                                    if (-6 == (this.field_E ^ -1)) {
                                      break L227;
                                    } else {
                                      break L226;
                                    }
                                  }
                                }
                                if (!qe.field_b[11]) {
                                  break L226;
                                } else {
                                  if (0 <= sk.field_d) {
                                    break L226;
                                  } else {
                                    if (!mh.field_e[ca.field_k - 1][hf.field_t].field_a) {
                                      break L226;
                                    } else {
                                      if (mh.field_e[-1 + ca.field_k][hf.field_t].field_S) {
                                        L229: {
                                          if ((tc.field_t ^ -1) > -26) {
                                            break L229;
                                          } else {
                                            rj.field_f = 10;
                                            rg.field_wb = 50;
                                            bd.field_k = -10;
                                            kj.field_d = 0;
                                            if (var21 == 0) {
                                              break L226;
                                            } else {
                                              break L229;
                                            }
                                          }
                                        }
                                        tc.field_t = tc.field_t + 2;
                                        break L226;
                                      } else {
                                        break L226;
                                      }
                                    }
                                  }
                                }
                              }
                              L230: {
                                L231: {
                                  L232: {
                                    if (!d.field_b) {
                                      break L232;
                                    } else {
                                      if (qd.field_O[97]) {
                                        break L231;
                                      } else {
                                        break L232;
                                      }
                                    }
                                  }
                                  if (-2 == (this.field_E ^ -1)) {
                                    break L231;
                                  } else {
                                    if (-5 != (this.field_E ^ -1)) {
                                      break L230;
                                    } else {
                                      break L231;
                                    }
                                  }
                                }
                                if (!qe.field_b[11]) {
                                  break L230;
                                } else {
                                  if (sk.field_d <= 0) {
                                    break L230;
                                  } else {
                                    if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                                      break L230;
                                    } else {
                                      if (mh.field_e[ca.field_k - -1][hf.field_t].field_S) {
                                        L233: {
                                          if (25 <= tc.field_t) {
                                            break L233;
                                          } else {
                                            tc.field_t = tc.field_t + 2;
                                            if (var21 == 0) {
                                              break L230;
                                            } else {
                                              break L233;
                                            }
                                          }
                                        }
                                        bd.field_k = -10;
                                        rg.field_wb = 50;
                                        kj.field_d = 0;
                                        rj.field_f = 10;
                                        break L230;
                                      } else {
                                        break L230;
                                      }
                                    }
                                  }
                                }
                              }
                              L234: {
                                L235: {
                                  L236: {
                                    if (!d.field_b) {
                                      break L236;
                                    } else {
                                      if (qd.field_O[96]) {
                                        break L235;
                                      } else {
                                        break L236;
                                      }
                                    }
                                  }
                                  if (0 <= rg.field_wb) {
                                    break L234;
                                  } else {
                                    rg.field_wb = rg.field_wb + 1;
                                    if (var21 == 0) {
                                      break L234;
                                    } else {
                                      break L235;
                                    }
                                  }
                                }
                                rg.field_wb = -20;
                                di.field_K = -1;
                                break L234;
                              }
                              L237: {
                                L238: {
                                  L239: {
                                    L240: {
                                      if (!d.field_b) {
                                        break L240;
                                      } else {
                                        if (qd.field_O[98]) {
                                          break L239;
                                        } else {
                                          break L240;
                                        }
                                      }
                                    }
                                    if ((this.field_E ^ -1) == -6) {
                                      break L239;
                                    } else {
                                      if (this.field_E != 4) {
                                        break L238;
                                      } else {
                                        break L239;
                                      }
                                    }
                                  }
                                  if (-40 >= bd.field_k) {
                                    break L238;
                                  } else {
                                    bd.field_k = bd.field_k - 1;
                                    if (var21 == 0) {
                                      break L237;
                                    } else {
                                      break L238;
                                    }
                                  }
                                }
                                if (bd.field_k < 0) {
                                  bd.field_k = bd.field_k + 1;
                                  break L237;
                                } else {
                                  break L237;
                                }
                              }
                              L241: {
                                L242: {
                                  if (!d.field_b) {
                                    break L242;
                                  } else {
                                    if (!qd.field_O[97]) {
                                      break L242;
                                    } else {
                                      rg.field_wb = 20;
                                      di.field_K = 1;
                                      if (var21 == 0) {
                                        break L241;
                                      } else {
                                        break L242;
                                      }
                                    }
                                  }
                                }
                                if ((rg.field_wb ^ -1) < -1) {
                                  rg.field_wb = rg.field_wb - 1;
                                  break L241;
                                } else {
                                  break L241;
                                }
                              }
                              L243: {
                                L244: {
                                  L245: {
                                    L246: {
                                      if (!d.field_b) {
                                        break L246;
                                      } else {
                                        if (qd.field_O[99]) {
                                          break L245;
                                        } else {
                                          break L246;
                                        }
                                      }
                                    }
                                    if (var5 == 0) {
                                      break L244;
                                    } else {
                                      break L245;
                                    }
                                  }
                                  if (var2_int != 0) {
                                    break L244;
                                  } else {
                                    if (bd.field_k >= 40) {
                                      break L244;
                                    } else {
                                      bd.field_k = bd.field_k + 1;
                                      if (var21 == 0) {
                                        break L243;
                                      } else {
                                        break L244;
                                      }
                                    }
                                  }
                                }
                                if ((bd.field_k ^ -1) < -1) {
                                  bd.field_k = bd.field_k - 1;
                                  break L243;
                                } else {
                                  break L243;
                                }
                              }
                              L247: {
                                L248: {
                                  L249: {
                                    if (!d.field_b) {
                                      break L249;
                                    } else {
                                      if (!qd.field_O[99]) {
                                        break L248;
                                      } else {
                                        break L249;
                                      }
                                    }
                                  }
                                  if (var5 == 0) {
                                    break L247;
                                  } else {
                                    break L248;
                                  }
                                }
                                if (qd.field_O[98]) {
                                  break L247;
                                } else {
                                  if (!mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                                    break L247;
                                  } else {
                                    if (var2_int != 0) {
                                      break L247;
                                    } else {
                                      if ((bd.field_k ^ -1) <= -41) {
                                        break L247;
                                      } else {
                                        bd.field_k = bd.field_k + 1;
                                        break L247;
                                      }
                                    }
                                  }
                                }
                              }
                              L250: {
                                L251: {
                                  L252: {
                                    if (!d.field_b) {
                                      break L252;
                                    } else {
                                      if (qd.field_O[99]) {
                                        break L251;
                                      } else {
                                        break L252;
                                      }
                                    }
                                  }
                                  if (var5 != 0) {
                                    break L251;
                                  } else {
                                    if (qd.field_O[98]) {
                                      break L250;
                                    } else {
                                      break L251;
                                    }
                                  }
                                }
                                if (var2_int != 0) {
                                  rj.field_f = 1;
                                  bd.field_k = 0;
                                  mf.field_i = 0;
                                  break L250;
                                } else {
                                  break L250;
                                }
                              }
                              L253: {
                                if (var4 == 0) {
                                  break L253;
                                } else {
                                  if (qe.field_b[15]) {
                                    break L253;
                                  } else {
                                    L254: {
                                      if (rg.field_wb * rg.field_wb > 400) {
                                        rg.field_wb = rg.field_wb / 2;
                                        break L254;
                                      } else {
                                        break L254;
                                      }
                                    }
                                    if ((bd.field_k * bd.field_k ^ -1) < -401) {
                                      bd.field_k = bd.field_k / 2;
                                      break L253;
                                    } else {
                                      break L253;
                                    }
                                  }
                                }
                              }
                              L255: {
                                L256: {
                                  mf.field_i = mf.field_i + bd.field_k;
                                  sk.field_d = sk.field_d + rg.field_wb;
                                  if (qd.field_O[98]) {
                                    break L256;
                                  } else {
                                    if (this.field_E == 5) {
                                      break L256;
                                    } else {
                                      L257: {
                                        if (80 >= sk.field_d) {
                                          break L257;
                                        } else {
                                          if (!mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                                            break L257;
                                          } else {
                                            sk.field_d = 80;
                                            break L257;
                                          }
                                        }
                                      }
                                      if (79 >= (sk.field_d ^ -1)) {
                                        break L255;
                                      } else {
                                        if (mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                          sk.field_d = -80;
                                          if (var21 == 0) {
                                            break L255;
                                          } else {
                                            break L256;
                                          }
                                        } else {
                                          break L255;
                                        }
                                      }
                                    }
                                  }
                                }
                                L258: {
                                  if (mf.field_i <= 40) {
                                    break L258;
                                  } else {
                                    if (mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                                      mf.field_i = 40;
                                      bd.field_k = 0;
                                      break L258;
                                    } else {
                                      break L258;
                                    }
                                  }
                                }
                                if (39 >= (mf.field_i ^ -1)) {
                                  break L255;
                                } else {
                                  if (!mh.field_e[ca.field_k][hf.field_t + -1].g()) {
                                    break L255;
                                  } else {
                                    mf.field_i = -40;
                                    bd.field_k = 0;
                                    break L255;
                                  }
                                }
                              }
                              L259: {
                                if ((sk.field_d ^ -1) >= -81) {
                                  break L259;
                                } else {
                                  if ((mf.field_i ^ -1) <= 39) {
                                    break L259;
                                  } else {
                                    if (!mh.field_e[1 + ca.field_k][hf.field_t + -1].g()) {
                                      break L259;
                                    } else {
                                      sk.field_d = 80;
                                      break L259;
                                    }
                                  }
                                }
                              }
                              L260: {
                                if (-80 <= sk.field_d) {
                                  break L260;
                                } else {
                                  if (-40 <= mf.field_i) {
                                    break L260;
                                  } else {
                                    if (mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                                      sk.field_d = -80;
                                      break L260;
                                    } else {
                                      break L260;
                                    }
                                  }
                                }
                              }
                              L261: {
                                if (sk.field_d <= 80) {
                                  break L261;
                                } else {
                                  if ((mf.field_i ^ -1) >= -41) {
                                    break L261;
                                  } else {
                                    if (mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                                      sk.field_d = 80;
                                      break L261;
                                    } else {
                                      break L261;
                                    }
                                  }
                                }
                              }
                              L262: {
                                if (sk.field_d >= -80) {
                                  break L262;
                                } else {
                                  if (40 >= mf.field_i) {
                                    break L262;
                                  } else {
                                    if (mh.field_e[-1 + ca.field_k][hf.field_t - -1].g()) {
                                      sk.field_d = -80;
                                      break L262;
                                    } else {
                                      break L262;
                                    }
                                  }
                                }
                              }
                              L263: {
                                L264: {
                                  if (!qd.field_O[98]) {
                                    break L264;
                                  } else {
                                    L265: {
                                      if (-81 <= (sk.field_d ^ -1)) {
                                        break L265;
                                      } else {
                                        if (mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                                          sk.field_d = 80;
                                          break L265;
                                        } else {
                                          break L265;
                                        }
                                      }
                                    }
                                    if (79 >= (sk.field_d ^ -1)) {
                                      break L263;
                                    } else {
                                      if (mh.field_e[ca.field_k + -1][hf.field_t].g()) {
                                        sk.field_d = -80;
                                        if (var21 == 0) {
                                          break L263;
                                        } else {
                                          break L264;
                                        }
                                      } else {
                                        break L263;
                                      }
                                    }
                                  }
                                }
                                L266: {
                                  if (40 >= mf.field_i) {
                                    break L266;
                                  } else {
                                    if (mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                                      bd.field_k = 0;
                                      mf.field_i = 40;
                                      break L266;
                                    } else {
                                      break L266;
                                    }
                                  }
                                }
                                if (-40 <= mf.field_i) {
                                  break L263;
                                } else {
                                  if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                                    mf.field_i = -40;
                                    bd.field_k = 0;
                                    break L263;
                                  } else {
                                    break L263;
                                  }
                                }
                              }
                              L267: {
                                if (160 >= sk.field_d) {
                                  break L267;
                                } else {
                                  sk.field_d = sk.field_d - 320;
                                  ca.field_k = ca.field_k + 1;
                                  break L267;
                                }
                              }
                              L268: {
                                if (160 < mf.field_i) {
                                  hf.field_t = hf.field_t + 1;
                                  mf.field_i = mf.field_i - 320;
                                  break L268;
                                } else {
                                  break L268;
                                }
                              }
                              L269: {
                                if (-160 > sk.field_d) {
                                  sk.field_d = sk.field_d + 320;
                                  ca.field_k = ca.field_k - 1;
                                  break L269;
                                } else {
                                  break L269;
                                }
                              }
                              L270: {
                                if (mf.field_i < -160) {
                                  hf.field_t = hf.field_t - 1;
                                  mf.field_i = mf.field_i + 320;
                                  break L270;
                                } else {
                                  break L270;
                                }
                              }
                              L271: {
                                if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                                  break L271;
                                } else {
                                  if (je.c(ca.field_k, hf.field_t, 0, 1)) {
                                    break L271;
                                  } else {
                                    if (je.c(ca.field_k, hf.field_t, 2, 1)) {
                                      break L271;
                                    } else {
                                      if (je.c(ca.field_k, hf.field_t, 3, 1)) {
                                        break L271;
                                      } else {
                                        if (je.a(ca.field_k, hf.field_t, 0, 1)) {
                                          break L271;
                                        } else {
                                          if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                                            break L271;
                                          } else {
                                            if (je.a(ca.field_k, hf.field_t, 2, 1)) {
                                              break L271;
                                            } else {
                                              if (je.a(ca.field_k, hf.field_t, 3, 1)) {
                                                break L271;
                                              } else {
                                                rj.field_f = 3;
                                                break L271;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L272: {
                                L273: {
                                  an.field_f = an.field_f - 1;
                                  if (an.field_f < 0) {
                                    break L273;
                                  } else {
                                    if ((an.field_f ^ -1) < -9) {
                                      break L273;
                                    } else {
                                      break L272;
                                    }
                                  }
                                }
                                tf.field_b = tf.field_b + 1;
                                an.field_f = 8;
                                if (-6 > (Math.abs(rg.field_wb) ^ -1)) {
                                  an.field_f = an.field_f / 4;
                                  break L272;
                                } else {
                                  break L272;
                                }
                              }
                              tf.field_b = tf.field_b % 5;
                              tb.field_c = 32 + tf.field_b;
                              if (var21 == 0) {
                                break L111;
                              } else {
                                break L118;
                              }
                            }
                            L274: {
                              L275: {
                                L276: {
                                  L277: {
                                    if (!d.field_b) {
                                      break L277;
                                    } else {
                                      if (qd.field_O[96]) {
                                        break L276;
                                      } else {
                                        break L277;
                                      }
                                    }
                                  }
                                  if (5 != this.field_E) {
                                    break L275;
                                  } else {
                                    break L276;
                                  }
                                }
                                L278: {
                                  di.field_K = -1;
                                  if ((cm.field_o ^ -1) != -1) {
                                    break L278;
                                  } else {
                                    rg.field_wb = -20;
                                    if (var21 == 0) {
                                      break L274;
                                    } else {
                                      break L278;
                                    }
                                  }
                                }
                                if (-20 >= rg.field_wb) {
                                  break L274;
                                } else {
                                  rg.field_wb = -20;
                                  if (var21 == 0) {
                                    break L274;
                                  } else {
                                    break L275;
                                  }
                                }
                              }
                              if (rg.field_wb < 0) {
                                rg.field_wb = rg.field_wb + 1;
                                break L274;
                              } else {
                                break L274;
                              }
                            }
                            L279: {
                              if (-41 >= (bd.field_k ^ -1)) {
                                break L279;
                              } else {
                                L280: {
                                  if (d.field_b) {
                                    break L280;
                                  } else {
                                    if (var5 == 0) {
                                      break L279;
                                    } else {
                                      break L280;
                                    }
                                  }
                                }
                                bd.field_k = bd.field_k + 1;
                                break L279;
                              }
                            }
                            L281: {
                              L282: {
                                L283: {
                                  L284: {
                                    if (!d.field_b) {
                                      break L284;
                                    } else {
                                      if (qd.field_O[97]) {
                                        break L283;
                                      } else {
                                        break L284;
                                      }
                                    }
                                  }
                                  if (-5 != (this.field_E ^ -1)) {
                                    break L282;
                                  } else {
                                    break L283;
                                  }
                                }
                                L285: {
                                  L286: {
                                    if ((cm.field_o ^ -1) == -1) {
                                      break L286;
                                    } else {
                                      if ((rg.field_wb ^ -1) > -21) {
                                        rg.field_wb = 20;
                                        if (var21 == 0) {
                                          break L285;
                                        } else {
                                          break L286;
                                        }
                                      } else {
                                        break L285;
                                      }
                                    }
                                  }
                                  rg.field_wb = 20;
                                  break L285;
                                }
                                di.field_K = 1;
                                if (var21 == 0) {
                                  break L281;
                                } else {
                                  break L282;
                                }
                              }
                              if (rg.field_wb <= 0) {
                                break L281;
                              } else {
                                rg.field_wb = rg.field_wb - 1;
                                break L281;
                              }
                            }
                            L287: {
                              mf.field_i = mf.field_i + bd.field_k;
                              sk.field_d = sk.field_d + rg.field_wb;
                              if (mf.field_i <= 0) {
                                break L287;
                              } else {
                                if (mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                                  L288: {
                                    if (!je.c(ca.field_k, hf.field_t + 1, 1, 0)) {
                                      L289: {
                                        L290: {
                                          L291: {
                                            if ((cm.field_o ^ -1) == -1) {
                                              break L291;
                                            } else {
                                              if (!mh.field_e[ca.field_k][hf.field_t + 1].field_E) {
                                                break L290;
                                              } else {
                                                break L291;
                                              }
                                            }
                                          }
                                          ne.a(32, 94);
                                          if (var21 == 0) {
                                            break L289;
                                          } else {
                                            break L290;
                                          }
                                        }
                                        if (-2 == (cm.field_o ^ -1)) {
                                          ne.a(41, 119);
                                          break L289;
                                        } else {
                                          break L289;
                                        }
                                      }
                                      if (!mh.field_e[ca.field_k][hf.field_t - -1].field_v) {
                                        break L288;
                                      } else {
                                        if (20 > bd.field_k) {
                                          break L288;
                                        } else {
                                          if (mh.field_e[ca.field_k][1 + hf.field_t].field_E) {
                                            break L288;
                                          } else {
                                            mh.field_e[ca.field_k][1 + hf.field_t].field_S = true;
                                            mh.field_e[ca.field_k][1 + hf.field_t].field_r = 975;
                                            if (sc.field_b) {
                                              ag.a(true, 28, hf.field_t + 1 << -1197093787, ca.field_k << 84400069);
                                              break L288;
                                            } else {
                                              break L288;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L288;
                                    }
                                  }
                                  mf.field_i = 0;
                                  bd.field_k = 0;
                                  break L287;
                                } else {
                                  break L287;
                                }
                              }
                            }
                            L292: {
                              if (mf.field_i >= 0) {
                                break L292;
                              } else {
                                if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                                  mf.field_i = 0;
                                  bd.field_k = 0;
                                  break L292;
                                } else {
                                  break L292;
                                }
                              }
                            }
                            L293: {
                              L294: {
                                if (Math.abs(sk.field_d) < Math.abs(mf.field_i)) {
                                  break L294;
                                } else {
                                  L295: {
                                    if (!d.field_b) {
                                      break L295;
                                    } else {
                                      if (qd.field_O[99]) {
                                        break L294;
                                      } else {
                                        break L295;
                                      }
                                    }
                                  }
                                  L296: {
                                    if (80 >= sk.field_d) {
                                      break L296;
                                    } else {
                                      if (-1 >= (mf.field_i ^ -1)) {
                                        break L296;
                                      } else {
                                        if (bd.field_k > 0) {
                                          break L296;
                                        } else {
                                          if (!mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                                            break L296;
                                          } else {
                                            bd.field_k = 0;
                                            mf.field_i = 0;
                                            break L296;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L297: {
                                    if (79 >= (sk.field_d ^ -1)) {
                                      break L297;
                                    } else {
                                      if (0 <= mf.field_i) {
                                        break L297;
                                      } else {
                                        if ((bd.field_k ^ -1) < -1) {
                                          break L297;
                                        } else {
                                          if (mh.field_e[-1 + ca.field_k][hf.field_t - 1].g()) {
                                            mf.field_i = 0;
                                            bd.field_k = 0;
                                            break L297;
                                          } else {
                                            break L297;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L298: {
                                    if (80 >= sk.field_d) {
                                      break L298;
                                    } else {
                                      if (-1 <= (mf.field_i ^ -1)) {
                                        break L298;
                                      } else {
                                        if ((bd.field_k ^ -1) > -1) {
                                          break L298;
                                        } else {
                                          if (mh.field_e[ca.field_k - -1][1 + hf.field_t].g()) {
                                            L299: {
                                              if (!mh.field_e[ca.field_k + 1][hf.field_t - -1].field_v) {
                                                break L299;
                                              } else {
                                                if ((bd.field_k ^ -1) > -21) {
                                                  break L299;
                                                } else {
                                                  if (!mh.field_e[ca.field_k + 1][1 + hf.field_t].field_E) {
                                                    mh.field_e[ca.field_k - -1][1 + hf.field_t].field_S = true;
                                                    mh.field_e[1 + ca.field_k][1 + hf.field_t].field_r = 975;
                                                    if (!sc.field_b) {
                                                      break L299;
                                                    } else {
                                                      ag.a(true, 28, 1 + hf.field_t << -368087163, 1 + ca.field_k << 964096229);
                                                      break L299;
                                                    }
                                                  } else {
                                                    break L299;
                                                  }
                                                }
                                              }
                                            }
                                            bd.field_k = 0;
                                            mf.field_i = 0;
                                            break L298;
                                          } else {
                                            break L298;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (79 >= (sk.field_d ^ -1)) {
                                    break L293;
                                  } else {
                                    if (mf.field_i <= 0) {
                                      break L293;
                                    } else {
                                      if (bd.field_k < 0) {
                                        break L293;
                                      } else {
                                        if (mh.field_e[-1 + ca.field_k][hf.field_t + 1].g()) {
                                          L300: {
                                            if (!mh.field_e[ca.field_k + -1][hf.field_t - -1].field_v) {
                                              break L300;
                                            } else {
                                              if (bd.field_k < 20) {
                                                break L300;
                                              } else {
                                                if (!mh.field_e[ca.field_k - 1][1 + hf.field_t].field_E) {
                                                  mh.field_e[-1 + ca.field_k][hf.field_t - -1].field_S = true;
                                                  mh.field_e[-1 + ca.field_k][hf.field_t - -1].field_r = 975;
                                                  if (sc.field_b) {
                                                    ag.a(true, 28, 1 + hf.field_t << -154968475, -1 + ca.field_k << -2017906843);
                                                    break L300;
                                                  } else {
                                                    break L300;
                                                  }
                                                } else {
                                                  break L300;
                                                }
                                              }
                                            }
                                          }
                                          bd.field_k = 0;
                                          mf.field_i = 0;
                                          if (var21 == 0) {
                                            break L293;
                                          } else {
                                            break L294;
                                          }
                                        } else {
                                          break L293;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L301: {
                                if (sk.field_d <= 80) {
                                  break L301;
                                } else {
                                  if (-1 >= (mf.field_i ^ -1)) {
                                    break L301;
                                  } else {
                                    if (rg.field_wb < 0) {
                                      break L301;
                                    } else {
                                      if (!mh.field_e[ca.field_k - -1][-1 + hf.field_t].g()) {
                                        break L301;
                                      } else {
                                        sk.field_d = 80;
                                        break L301;
                                      }
                                    }
                                  }
                                }
                              }
                              L302: {
                                if ((sk.field_d ^ -1) <= 79) {
                                  break L302;
                                } else {
                                  if (-1 >= (mf.field_i ^ -1)) {
                                    break L302;
                                  } else {
                                    if (0 < rg.field_wb) {
                                      break L302;
                                    } else {
                                      if (!mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                                        break L302;
                                      } else {
                                        sk.field_d = -80;
                                        break L302;
                                      }
                                    }
                                  }
                                }
                              }
                              L303: {
                                if ((sk.field_d ^ -1) >= -81) {
                                  break L303;
                                } else {
                                  if (mf.field_i <= 0) {
                                    break L303;
                                  } else {
                                    if (rg.field_wb < 0) {
                                      break L303;
                                    } else {
                                      if (!mh.field_e[ca.field_k + 1][1 + hf.field_t].g()) {
                                        break L303;
                                      } else {
                                        sk.field_d = 80;
                                        break L303;
                                      }
                                    }
                                  }
                                }
                              }
                              if (sk.field_d >= -80) {
                                break L293;
                              } else {
                                if ((mf.field_i ^ -1) >= -1) {
                                  break L293;
                                } else {
                                  if (rg.field_wb > 0) {
                                    break L293;
                                  } else {
                                    if (mh.field_e[ca.field_k + -1][1 + hf.field_t].g()) {
                                      sk.field_d = -80;
                                      break L293;
                                    } else {
                                      break L293;
                                    }
                                  }
                                }
                              }
                            }
                            L304: {
                              if (1 != cm.field_o) {
                                stackOut_1668_0 = 0;
                                stackIn_1669_0 = stackOut_1668_0;
                                break L304;
                              } else {
                                stackOut_1666_0 = 1;
                                stackIn_1669_0 = stackOut_1666_0;
                                break L304;
                              }
                            }
                            L305: {
                              var8 = stackIn_1669_0;
                              if (-41 <= (sk.field_d ^ -1)) {
                                break L305;
                              } else {
                                if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                                  break L305;
                                } else {
                                  L306: {
                                    sk.field_d = 40;
                                    if (var8 == 0) {
                                      break L306;
                                    } else {
                                      if (-29 <= (rg.field_wb ^ -1)) {
                                        break L306;
                                      } else {
                                        if (!mh.field_e[ca.field_k + 1][hf.field_t].field_v) {
                                          break L306;
                                        } else {
                                          mh.field_e[ca.field_k + 1][hf.field_t].field_S = true;
                                          mh.field_e[ca.field_k + 1][hf.field_t].field_r = 975;
                                          rg.field_wb = -10;
                                          bd.field_k = bd.field_k - 10;
                                          if (sc.field_b) {
                                            ag.a(true, 28, hf.field_t << -1608160411, 1 + ca.field_k << 695093061);
                                            if (var21 == 0) {
                                              break L305;
                                            } else {
                                              break L306;
                                            }
                                          } else {
                                            break L305;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  rg.field_wb = 0;
                                  break L305;
                                }
                              }
                            }
                            L307: {
                              var9 = 0;
                              if ((sk.field_d ^ -1) <= 39) {
                                break L307;
                              } else {
                                if (mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                                  L308: {
                                    sk.field_d = -40;
                                    if (var8 == 0) {
                                      break L308;
                                    } else {
                                      if (27 >= (rg.field_wb ^ -1)) {
                                        break L308;
                                      } else {
                                        if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_v) {
                                          break L308;
                                        } else {
                                          mh.field_e[-1 + ca.field_k][hf.field_t].field_S = true;
                                          mh.field_e[ca.field_k + -1][hf.field_t].field_r = 975;
                                          rg.field_wb = 10;
                                          bd.field_k = bd.field_k - 10;
                                          if (sc.field_b) {
                                            ag.a(true, 28, hf.field_t << 1507023429, -1 + ca.field_k << 1325147653);
                                            if (var21 == 0) {
                                              break L307;
                                            } else {
                                              break L308;
                                            }
                                          } else {
                                            break L307;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  rg.field_wb = 0;
                                  break L307;
                                } else {
                                  break L307;
                                }
                              }
                            }
                            L309: {
                              if ((sk.field_d ^ -1) >= -161) {
                                break L309;
                              } else {
                                var9 = 1;
                                ca.field_k = ca.field_k + 1;
                                sk.field_d = sk.field_d - 320;
                                break L309;
                              }
                            }
                            L310: {
                              if ((sk.field_d ^ -1) > 159) {
                                ca.field_k = ca.field_k - 1;
                                var9 = 1;
                                sk.field_d = sk.field_d + 320;
                                break L310;
                              } else {
                                break L310;
                              }
                            }
                            L311: {
                              if ((mf.field_i ^ -1) < -161) {
                                mf.field_i = mf.field_i - 320;
                                var9 = 1;
                                hf.field_t = hf.field_t + 1;
                                break L311;
                              } else {
                                break L311;
                              }
                            }
                            L312: {
                              if (159 >= (mf.field_i ^ -1)) {
                                break L312;
                              } else {
                                mf.field_i = mf.field_i + 320;
                                hf.field_t = hf.field_t - 1;
                                var9 = 1;
                                break L312;
                              }
                            }
                            L313: {
                              if (var9 != 0) {
                                if (var4 != 0) {
                                  break L313;
                                } else {
                                  if (je.field_O.f(hf.field_t, 2, ca.field_k)) {
                                    ne.a(ll.a((byte) -73, 4) + 57, 85);
                                    break L313;
                                  } else {
                                    break L313;
                                  }
                                }
                              } else {
                                break L313;
                              }
                            }
                            L314: {
                              L315: {
                                if (0 >= bd.field_k) {
                                  break L315;
                                } else {
                                  rj.field_f = 4;
                                  if (var21 == 0) {
                                    break L314;
                                  } else {
                                    break L315;
                                  }
                                }
                              }
                              if ((bd.field_k ^ -1) != -1) {
                                break L314;
                              } else {
                                if ((rg.field_wb * rg.field_wb ^ -1) >= -226) {
                                  break L314;
                                } else {
                                  L316: {
                                    if ((rg.field_wb ^ -1) <= -1) {
                                      break L316;
                                    } else {
                                      rg.field_wb = -15;
                                      if (var21 == 0) {
                                        break L314;
                                      } else {
                                        break L316;
                                      }
                                    }
                                  }
                                  rg.field_wb = 15;
                                  break L314;
                                }
                              }
                            }
                            L317: {
                              if (var2_int != 0) {
                                break L317;
                              } else {
                                L318: {
                                  if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                                    break L318;
                                  } else {
                                    if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                                      break L318;
                                    } else {
                                      break L317;
                                    }
                                  }
                                }
                                L319: {
                                  if (!sc.field_b) {
                                    break L319;
                                  } else {
                                    ag.a(true, 17, hf.field_t * 32, ca.field_k * 32);
                                    break L319;
                                  }
                                }
                                rj.field_f = 2;
                                break L317;
                              }
                            }
                            L320: {
                              if (var2_int == 0) {
                                break L320;
                              } else {
                                rj.field_f = 1;
                                break L320;
                              }
                            }
                            L321: {
                              L322: {
                                L323: {
                                  if (!qd.field_O[98]) {
                                    break L323;
                                  } else {
                                    if (!qd.field_O[49]) {
                                      break L323;
                                    } else {
                                      if (!qe.field_b[20]) {
                                        break L323;
                                      } else {
                                        if (10 < qd.field_K) {
                                          break L322;
                                        } else {
                                          break L323;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (je.c(ca.field_k, hf.field_t, 1, 3)) {
                                  break L321;
                                } else {
                                  if (pl.field_h == 15) {
                                    L324: {
                                      var13 = (640 + mf.field_i * 4) / 320;
                                      if (var13 != 4) {
                                        break L324;
                                      } else {
                                        var13--;
                                        break L324;
                                      }
                                    }
                                    L325: {
                                      if (!je.c(ca.field_k, hf.field_t - -1, 1, var13)) {
                                        break L325;
                                      } else {
                                        gm.b(100);
                                        break L325;
                                      }
                                    }
                                    if (var21 == 0) {
                                      break L321;
                                    } else {
                                      break L322;
                                    }
                                  } else {
                                    break L321;
                                  }
                                }
                              }
                              rj.field_f = 12;
                              break L321;
                            }
                            L326: {
                              if (rj.field_f == 3) {
                                tb.field_c = 7;
                                break L326;
                              } else {
                                break L326;
                              }
                            }
                            L327: {
                              if (-5 != (rj.field_f ^ -1)) {
                                break L327;
                              } else {
                                tb.field_c = 15;
                                break L327;
                              }
                            }
                            L328: {
                              tb.field_c = 41;
                              if (-10 < bd.field_k) {
                                tb.field_c = tb.field_c + 1;
                                break L328;
                              } else {
                                break L328;
                              }
                            }
                            L329: {
                              if ((bd.field_k ^ -1) < 19) {
                                tb.field_c = tb.field_c + 1;
                                break L329;
                              } else {
                                break L329;
                              }
                            }
                            if (var2_int != 0) {
                              tb.field_c = 45;
                              if (var21 == 0) {
                                break L111;
                              } else {
                                break L117;
                              }
                            } else {
                              break L111;
                            }
                          }
                          L330: {
                            tb.field_c = 48;
                            if (-4 <= (kj.field_d ^ -1)) {
                              break L330;
                            } else {
                              tb.field_c = tb.field_c + 1;
                              break L330;
                            }
                          }
                          L331: {
                            if (7 >= kj.field_d) {
                              break L331;
                            } else {
                              tb.field_c = tb.field_c + 1;
                              break L331;
                            }
                          }
                          L332: {
                            kj.field_d = kj.field_d + 1;
                            if ((kj.field_d ^ -1) == -5) {
                              L333: {
                                if (!mh.field_e[this.field_db][this.field_N].field_a) {
                                  break L333;
                                } else {
                                  if (mh.field_e[this.field_db][this.field_N].field_b) {
                                    break L333;
                                  } else {
                                    L334: {
                                      L335: {
                                        if (-2 != (cm.field_o ^ -1)) {
                                          break L335;
                                        } else {
                                          L336: {
                                            if (mh.field_e[this.field_db][this.field_N].field_E) {
                                              break L336;
                                            } else {
                                              L337: {
                                                if (mh.field_e[this.field_db][this.field_N].field_v) {
                                                  break L337;
                                                } else {
                                                  ne.a(ll.a((byte) -73, 3) + 54, param0 + 16598);
                                                  if (var21 == 0) {
                                                    break L334;
                                                  } else {
                                                    break L337;
                                                  }
                                                }
                                              }
                                              ne.a(51 - -ll.a((byte) -73, 3), -125);
                                              if (var21 == 0) {
                                                break L334;
                                              } else {
                                                break L336;
                                              }
                                            }
                                          }
                                          ne.a(ll.a((byte) -73, 3) + 48, 71);
                                          if (var21 == 0) {
                                            break L334;
                                          } else {
                                            break L335;
                                          }
                                        }
                                      }
                                      ne.a(24, -105);
                                      break L334;
                                    }
                                    if (!mh.field_e[this.field_db][this.field_N].field_S) {
                                      break L332;
                                    } else {
                                      ne.a(21, 106);
                                      if (var21 == 0) {
                                        break L332;
                                      } else {
                                        break L333;
                                      }
                                    }
                                  }
                                }
                              }
                              if (mh.field_e[this.field_db][this.field_N].field_b) {
                                ne.a(23, -119);
                                if (!sc.field_b) {
                                  break L332;
                                } else {
                                  ag.a(true, 2, 32 * this.field_N, 32 * this.field_db);
                                  break L332;
                                }
                              } else {
                                break L332;
                              }
                            } else {
                              break L332;
                            }
                          }
                          L338: {
                            if (7 == kj.field_d) {
                              if (!mh.field_e[this.field_db][this.field_N].field_a) {
                                break L338;
                              } else {
                                if (!mh.field_e[this.field_db][this.field_N].field_b) {
                                  L339: {
                                    if (mh.field_e[this.field_db][this.field_N].field_S) {
                                      break L339;
                                    } else {
                                      if (mh.field_e[this.field_db][this.field_N].field_v) {
                                        break L339;
                                      } else {
                                        mh.field_e[this.field_db][this.field_N].field_S = true;
                                        mh.field_e[this.field_db][this.field_N].field_r = 975;
                                        rg.field_sb = rg.field_sb - 3;
                                        if (var21 == 0) {
                                          break L338;
                                        } else {
                                          break L339;
                                        }
                                      }
                                    }
                                  }
                                  L340: {
                                    if (mh.field_e[this.field_db][this.field_N].field_v) {
                                      lb.field_r = lb.field_r + 1;
                                      if (200 > lb.field_r) {
                                        break L340;
                                      } else {
                                        fn.a(24, 231, 3);
                                        break L340;
                                      }
                                    } else {
                                      break L340;
                                    }
                                  }
                                  mh.field_e[this.field_db][this.field_N].field_a = false;
                                  rg.field_sb = rg.field_sb - 3;
                                  break L338;
                                } else {
                                  break L338;
                                }
                              }
                            } else {
                              break L338;
                            }
                          }
                          if ((kj.field_d ^ -1) >= -11) {
                            break L111;
                          } else {
                            rj.field_f = 0;
                            if (var21 == 0) {
                              break L111;
                            } else {
                              break L116;
                            }
                          }
                        }
                        L341: {
                          tb.field_c = 56;
                          if ((kj.field_d ^ -1) >= -4) {
                            break L341;
                          } else {
                            tb.field_c = tb.field_c + 1;
                            break L341;
                          }
                        }
                        L342: {
                          if (7 >= kj.field_d) {
                            break L342;
                          } else {
                            tb.field_c = tb.field_c + 1;
                            break L342;
                          }
                        }
                        L343: {
                          kj.field_d = kj.field_d + 1;
                          if (-6 == (kj.field_d ^ -1)) {
                            if (!mh.field_e[this.field_db][this.field_N].field_a) {
                              break L343;
                            } else {
                              if (!mh.field_e[this.field_db][this.field_N].field_b) {
                                L344: {
                                  if (mh.field_e[this.field_db][this.field_N].field_S) {
                                    break L344;
                                  } else {
                                    if (mh.field_e[this.field_db][this.field_N].field_v) {
                                      break L344;
                                    } else {
                                      mh.field_e[this.field_db][this.field_N].field_S = true;
                                      mh.field_e[this.field_db][this.field_N].field_r = 975;
                                      rg.field_sb = rg.field_sb - 3;
                                      if (var21 == 0) {
                                        break L343;
                                      } else {
                                        break L344;
                                      }
                                    }
                                  }
                                }
                                L345: {
                                  if (!sc.field_b) {
                                    break L345;
                                  } else {
                                    if (!mh.field_e[this.field_db][this.field_N].field_b) {
                                      break L345;
                                    } else {
                                      ag.a(true, 2, this.field_N * 32, this.field_db * 32);
                                      break L345;
                                    }
                                  }
                                }
                                ne.a(21, param0 ^ 16424);
                                mh.field_e[this.field_db][this.field_N].field_a = false;
                                rg.field_sb = rg.field_sb - 3;
                                break L343;
                              } else {
                                break L343;
                              }
                            }
                          } else {
                            break L343;
                          }
                        }
                        if (-11 <= (kj.field_d ^ -1)) {
                          break L111;
                        } else {
                          rj.field_f = 3;
                          if (var21 == 0) {
                            break L111;
                          } else {
                            break L115;
                          }
                        }
                      }
                      L346: {
                        tb.field_c = 96;
                        kj.field_d = kj.field_d + 1;
                        if (5 < kj.field_d) {
                          tb.field_c = tb.field_c + 1;
                          break L346;
                        } else {
                          break L346;
                        }
                      }
                      L347: {
                        if (-11 > (kj.field_d ^ -1)) {
                          tb.field_c = tb.field_c + 1;
                          break L347;
                        } else {
                          break L347;
                        }
                      }
                      L348: {
                        if ((kj.field_d ^ -1) != -17) {
                          break L348;
                        } else {
                          L349: {
                            var13 = jf.b((byte) 52);
                            uf.field_p[var13] = new gf(ca.field_k, hf.field_t, 11);
                            uf.field_p[var13].field_i = di.field_K;
                            if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                              uf.field_p[var13].field_g = -1;
                              break L349;
                            } else {
                              break L349;
                            }
                          }
                          ne.a(0, param0 + 16391);
                          break L348;
                        }
                      }
                      L350: {
                        if (-16 <= (kj.field_d ^ -1)) {
                          break L350;
                        } else {
                          tb.field_c = tb.field_c + 1;
                          break L350;
                        }
                      }
                      L351: {
                        if ((kj.field_d ^ -1) >= -21) {
                          break L351;
                        } else {
                          tb.field_c = tb.field_c + 1;
                          break L351;
                        }
                      }
                      L352: {
                        if (kj.field_d <= 34) {
                          break L352;
                        } else {
                          L353: {
                            if (!qd.field_O[81]) {
                              break L353;
                            } else {
                              kj.field_d = 15;
                              tb.field_c = 98;
                              if (var21 == 0) {
                                break L352;
                              } else {
                                break L353;
                              }
                            }
                          }
                          tb.field_c = tb.field_c + 1;
                          break L352;
                        }
                      }
                      if (kj.field_d <= 40) {
                        break L111;
                      } else {
                        rj.field_f = 0;
                        if (var21 == 0) {
                          break L111;
                        } else {
                          break L114;
                        }
                      }
                    }
                    L354: {
                      var10 = di.field_K + ca.field_k;
                      var11 = -16 + var10;
                      if (-1 >= (var11 ^ -1)) {
                        break L354;
                      } else {
                        var11 = -var11;
                        break L354;
                      }
                    }
                    L355: {
                      L356: {
                        if (0 >= var10) {
                          break L356;
                        } else {
                          if (-32 >= (var10 ^ -1)) {
                            break L356;
                          } else {
                            if (0 >= hf.field_t) {
                              break L356;
                            } else {
                              if (var10 <= 0) {
                                break L356;
                              } else {
                                if ((var10 ^ -1) <= -32) {
                                  break L356;
                                } else {
                                  if ((-1 + je.field_t ^ -1) >= (hf.field_t ^ -1)) {
                                    break L356;
                                  } else {
                                    if (hf.field_t > var11 / 2) {
                                      break L355;
                                    } else {
                                      break L356;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      rj.field_f = 0;
                      kj.field_d = 0;
                      if (var21 == 0) {
                        break L111;
                      } else {
                        break L355;
                      }
                    }
                    L357: {
                      kj.field_d = kj.field_d + 1;
                      tb.field_c = 88;
                      if ((kj.field_d ^ -1) < -6) {
                        tb.field_c = 89;
                        break L357;
                      } else {
                        break L357;
                      }
                    }
                    L358: {
                      if (15 < kj.field_d) {
                        tb.field_c = 90;
                        break L358;
                      } else {
                        break L358;
                      }
                    }
                    L359: {
                      if (18 == kj.field_d) {
                        L360: {
                          L361: {
                            if (!mh.field_e[ca.field_k - -di.field_K][hf.field_t].field_S) {
                              break L361;
                            } else {
                              L362: {
                                L363: {
                                  if (mh.field_e[ca.field_k - -(2 * di.field_K)][hf.field_t].field_a) {
                                    break L363;
                                  } else {
                                    mh.field_e[di.field_K * 2 + ca.field_k][hf.field_t].field_a = true;
                                    mh.field_e[di.field_K * 1 + ca.field_k][hf.field_t].field_a = false;
                                    mh.field_e[ca.field_k + di.field_K * 2][hf.field_t].field_U = mh.field_e[di.field_K * 1 + ca.field_k][hf.field_t].field_U;
                                    mh.field_e[di.field_K * 1 + ca.field_k][hf.field_t].field_U = -1;
                                    mh.field_e[di.field_K * 2 + ca.field_k][hf.field_t].field_S = mh.field_e[1 * di.field_K + ca.field_k][hf.field_t].field_S;
                                    mh.field_e[ca.field_k + di.field_K * 2][hf.field_t].field_r = 1000;
                                    uf.field_p[jf.b((byte) 108)] = new gf(di.field_K * 1 + ca.field_k, hf.field_t, 8);
                                    if (var21 == 0) {
                                      break L362;
                                    } else {
                                      break L363;
                                    }
                                  }
                                }
                                mh.field_e[ca.field_k + 1 * di.field_K][hf.field_t].field_a = false;
                                break L362;
                              }
                              rg.field_wb = 50 * di.field_K;
                              rj.field_f = 3;
                              bd.field_k = -10;
                              if (var21 == 0) {
                                break L360;
                              } else {
                                break L361;
                              }
                            }
                          }
                          mh.field_e[ca.field_k - -di.field_K][hf.field_t].field_S = true;
                          mh.field_e[ca.field_k + di.field_K][hf.field_t].field_r = 1000;
                          break L360;
                        }
                        uf.field_p[jf.b((byte) 60)] = new gf(di.field_K * 1 + ca.field_k, hf.field_t, 8);
                        break L359;
                      } else {
                        break L359;
                      }
                    }
                    if ((kj.field_d ^ -1) >= -21) {
                      break L111;
                    } else {
                      rj.field_f = 0;
                      if (var21 == 0) {
                        break L111;
                      } else {
                        break L113;
                      }
                    }
                  }
                  L364: {
                    tb.field_c = 128;
                    kj.field_d = kj.field_d + 1;
                    if ((kj.field_d ^ -1) >= -6) {
                      break L364;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L364;
                    }
                  }
                  L365: {
                    if (-11 > (kj.field_d ^ -1)) {
                      tb.field_c = tb.field_c + 1;
                      break L365;
                    } else {
                      break L365;
                    }
                  }
                  L366: {
                    if (15 >= kj.field_d) {
                      break L366;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L366;
                    }
                  }
                  L367: {
                    if (kj.field_d > 20) {
                      tb.field_c = tb.field_c + 1;
                      break L367;
                    } else {
                      break L367;
                    }
                  }
                  L368: {
                    if (30 >= kj.field_d) {
                      break L368;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L368;
                    }
                  }
                  L369: {
                    if (35 < kj.field_d) {
                      tb.field_c = tb.field_c + 1;
                      break L369;
                    } else {
                      break L369;
                    }
                  }
                  L370: {
                    if (kj.field_d <= 40) {
                      break L370;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L370;
                    }
                  }
                  L371: {
                    if (-46 > (kj.field_d ^ -1)) {
                      tb.field_c = tb.field_c - 2;
                      break L371;
                    } else {
                      break L371;
                    }
                  }
                  L372: {
                    if ((kj.field_d ^ -1) >= -51) {
                      break L372;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L372;
                    }
                  }
                  L373: {
                    if ((kj.field_d ^ -1) >= -56) {
                      break L373;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L373;
                    }
                  }
                  if ((kj.field_d ^ -1) < -61) {
                    rj.field_f = 0;
                    if (var21 == 0) {
                      break L111;
                    } else {
                      break L112;
                    }
                  } else {
                    break L111;
                  }
                }
                L374: {
                  ne.a(35, param0 + 16440);
                  kj.field_d = kj.field_d + 1;
                  if ((kj.field_d ^ -1) >= -6) {
                    break L374;
                  } else {
                    tb.field_c = tb.field_c + 1;
                    kj.field_d = 0;
                    break L374;
                  }
                }
                L375: {
                  L376: {
                    if ((tb.field_c ^ -1) > -1) {
                      break L376;
                    } else {
                      if ((rg.field_tb.length ^ -1) >= (tb.field_c ^ -1)) {
                        break L376;
                      } else {
                        break L375;
                      }
                    }
                  }
                  tb.field_c = 0;
                  break L375;
                }
                L377: {
                  if (qd.field_K > 0) {
                    qd.field_K = qd.field_K - 1;
                    break L377;
                  } else {
                    break L377;
                  }
                }
                L378: {
                  if (!d.field_b) {
                    break L378;
                  } else {
                    if (!qd.field_O[96]) {
                      break L378;
                    } else {
                      di.field_K = -1;
                      rg.field_wb = -10;
                      break L378;
                    }
                  }
                }
                L379: {
                  if (!d.field_b) {
                    break L379;
                  } else {
                    if (qd.field_O[97]) {
                      rg.field_wb = 10;
                      di.field_K = 1;
                      break L379;
                    } else {
                      break L379;
                    }
                  }
                }
                L380: {
                  if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                    break L380;
                  } else {
                    je.field_O.a(ca.field_k, param0 ^ 16506, hf.field_t);
                    dupTemp$7 = jf.b((byte) 73);
                    dupTemp$8 = new gf(ca.field_k, hf.field_t, 16);
                    uf.field_p[dupTemp$7] = dupTemp$8;
                    var13_ref_gf = dupTemp$8;
                    var13_ref_gf.field_b = 250;
                    break L380;
                  }
                }
                L381: {
                  L382: {
                    if ((qd.field_K ^ -1) >= -1) {
                      break L382;
                    } else {
                      if (!d.field_b) {
                        break L382;
                      } else {
                        if (!qd.field_O[98]) {
                          break L382;
                        } else {
                          if (!qd.field_O[49]) {
                            break L382;
                          } else {
                            stackOut_2096_0 = 1;
                            stackIn_2099_0 = stackOut_2096_0;
                            break L381;
                          }
                        }
                      }
                    }
                  }
                  stackOut_2098_0 = 0;
                  stackIn_2099_0 = stackOut_2098_0;
                  break L381;
                }
                L383: {
                  L384: {
                    var12 = stackIn_2099_0;
                    if (var12 == 0) {
                      break L384;
                    } else {
                      if (bd.field_k <= -80) {
                        break L384;
                      } else {
                        bd.field_k = bd.field_k - 1;
                        if (var21 == 0) {
                          break L383;
                        } else {
                          break L384;
                        }
                      }
                    }
                  }
                  if (40 > bd.field_k) {
                    bd.field_k = bd.field_k + 1;
                    break L383;
                  } else {
                    break L383;
                  }
                }
                L385: {
                  L386: {
                    if (!qd.field_O[98]) {
                      break L386;
                    } else {
                      if (-1 != (qd.field_K ^ -1)) {
                        break L385;
                      } else {
                        break L386;
                      }
                    }
                  }
                  L387: {
                    if (var2_int == 0) {
                      break L387;
                    } else {
                      rj.field_f = 1;
                      bd.field_k = 0;
                      mf.field_i = 0;
                      if (var21 == 0) {
                        break L385;
                      } else {
                        break L387;
                      }
                    }
                  }
                  rj.field_f = 4;
                  break L385;
                }
                L388: {
                  L389: {
                    sk.field_d = sk.field_d + rg.field_wb;
                    mf.field_i = mf.field_i + bd.field_k;
                    if (var4 != 0) {
                      break L389;
                    } else {
                      if (tc.field_s <= 0) {
                        break L388;
                      } else {
                        break L389;
                      }
                    }
                  }
                  if (var12 == 0) {
                    break L388;
                  } else {
                    if (qe.field_b[15]) {
                      break L388;
                    } else {
                      nf.field_e = 40;
                      rj.field_f = 13;
                      break L388;
                    }
                  }
                }
                L390: {
                  L391: {
                    if (var12 == 0) {
                      break L391;
                    } else {
                      L392: {
                        if (mf.field_i <= 40) {
                          break L392;
                        } else {
                          if (mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                            mf.field_i = 40;
                            bd.field_k = 0;
                            break L392;
                          } else {
                            break L392;
                          }
                        }
                      }
                      if (mf.field_i >= -40) {
                        break L390;
                      } else {
                        if (mh.field_e[ca.field_k][hf.field_t - 1].g()) {
                          bd.field_k = 0;
                          mf.field_i = -40;
                          if (var21 == 0) {
                            break L390;
                          } else {
                            break L391;
                          }
                        } else {
                          break L390;
                        }
                      }
                    }
                  }
                  L393: {
                    if (sk.field_d <= 80) {
                      break L393;
                    } else {
                      if (!mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                        break L393;
                      } else {
                        sk.field_d = 80;
                        break L393;
                      }
                    }
                  }
                  if ((sk.field_d ^ -1) <= 79) {
                    break L390;
                  } else {
                    if (mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                      sk.field_d = -80;
                      break L390;
                    } else {
                      break L390;
                    }
                  }
                }
                L394: {
                  if (80 >= sk.field_d) {
                    break L394;
                  } else {
                    if (-40 <= mf.field_i) {
                      break L394;
                    } else {
                      if (!mh.field_e[ca.field_k + 1][-1 + hf.field_t].g()) {
                        break L394;
                      } else {
                        sk.field_d = 80;
                        break L394;
                      }
                    }
                  }
                }
                L395: {
                  if (79 >= (sk.field_d ^ -1)) {
                    break L395;
                  } else {
                    if (-40 <= mf.field_i) {
                      break L395;
                    } else {
                      if (mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                        sk.field_d = -80;
                        break L395;
                      } else {
                        break L395;
                      }
                    }
                  }
                }
                L396: {
                  if (sk.field_d <= 80) {
                    break L396;
                  } else {
                    if (-41 <= (mf.field_i ^ -1)) {
                      break L396;
                    } else {
                      if (mh.field_e[ca.field_k + 1][hf.field_t - -1].g()) {
                        sk.field_d = 80;
                        break L396;
                      } else {
                        break L396;
                      }
                    }
                  }
                }
                L397: {
                  if (79 >= (sk.field_d ^ -1)) {
                    break L397;
                  } else {
                    if (mf.field_i <= 40) {
                      break L397;
                    } else {
                      if (mh.field_e[ca.field_k - 1][1 + hf.field_t].g()) {
                        sk.field_d = -80;
                        break L397;
                      } else {
                        break L397;
                      }
                    }
                  }
                }
                L398: {
                  L399: {
                    if (var12 != 0) {
                      break L399;
                    } else {
                      L400: {
                        if (40 >= mf.field_i) {
                          break L400;
                        } else {
                          if (!mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                            break L400;
                          } else {
                            mf.field_i = 40;
                            bd.field_k = 0;
                            break L400;
                          }
                        }
                      }
                      if (-40 <= mf.field_i) {
                        break L398;
                      } else {
                        if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                          mf.field_i = -40;
                          bd.field_k = 0;
                          if (var21 == 0) {
                            break L398;
                          } else {
                            break L399;
                          }
                        } else {
                          break L398;
                        }
                      }
                    }
                  }
                  L401: {
                    if (sk.field_d <= 80) {
                      break L401;
                    } else {
                      if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                        break L401;
                      } else {
                        sk.field_d = 80;
                        break L401;
                      }
                    }
                  }
                  if (79 >= (sk.field_d ^ -1)) {
                    break L398;
                  } else {
                    if (!mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                      break L398;
                    } else {
                      sk.field_d = -80;
                      break L398;
                    }
                  }
                }
                L402: {
                  if ((sk.field_d ^ -1) < -161) {
                    ca.field_k = ca.field_k + 1;
                    sk.field_d = sk.field_d - 320;
                    break L402;
                  } else {
                    break L402;
                  }
                }
                L403: {
                  if (mf.field_i <= 160) {
                    break L403;
                  } else {
                    mf.field_i = mf.field_i - 320;
                    hf.field_t = hf.field_t + 1;
                    break L403;
                  }
                }
                L404: {
                  if ((sk.field_d ^ -1) > 159) {
                    ca.field_k = ca.field_k - 1;
                    sk.field_d = sk.field_d + 320;
                    break L404;
                  } else {
                    break L404;
                  }
                }
                L405: {
                  if (mf.field_i >= -160) {
                    break L405;
                  } else {
                    mf.field_i = mf.field_i + 320;
                    hf.field_t = hf.field_t - 1;
                    break L405;
                  }
                }
                if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                  rj.field_f = 2;
                  break L111;
                } else {
                  break L111;
                }
              }
              L406: {
                L407: {
                  L408: {
                    if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                      break L408;
                    } else {
                      if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                        break L408;
                      } else {
                        if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                          break L407;
                        } else {
                          if (qe.field_b[3]) {
                            break L407;
                          } else {
                            break L408;
                          }
                        }
                      }
                    }
                  }
                  L409: {
                    L410: {
                      if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                        break L410;
                      } else {
                        if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                          break L410;
                        } else {
                          if ((kn.field_E ^ -1) >= -301) {
                            break L410;
                          } else {
                            if (qe.field_b[3]) {
                              break L410;
                            } else {
                              L411: {
                                if (!sc.field_b) {
                                  break L411;
                                } else {
                                  if (ni.a(16, 11764)) {
                                    break L411;
                                  } else {
                                    var6 = 32 * ca.field_k - -(sk.field_d / 10);
                                    var7 = mf.field_i / 10 + 32 * hf.field_t;
                                    var8 = -pd.field_a.field_x + (var6 - 1);
                                    var9 = -1 + var7;
                                    ag.a(true, 16, -(ef.field_b[3].field_A >> 624899873) + (pd.field_a.field_A >> 1867508257) + var9, -ef.field_b[3].field_y + var8);
                                    break L411;
                                  }
                                }
                              }
                              kn.field_E = 300;
                              if (var21 == 0) {
                                break L409;
                              } else {
                                break L410;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (!sc.field_b) {
                      break L409;
                    } else {
                      L412: {
                        L413: {
                          L414: {
                            if (qe.field_b[2]) {
                              break L414;
                            } else {
                              if (!qe.field_b[19]) {
                                break L413;
                              } else {
                                break L414;
                              }
                            }
                          }
                          if (-951 < (kn.field_E ^ -1)) {
                            break L412;
                          } else {
                            break L413;
                          }
                        }
                        if (qe.field_b[2]) {
                          break L409;
                        } else {
                          if (450 <= kn.field_E) {
                            break L409;
                          } else {
                            break L412;
                          }
                        }
                      }
                      if (ni.a(9, 11764)) {
                        break L409;
                      } else {
                        var6 = sk.field_d / 10 + ca.field_k * 32;
                        var7 = mf.field_i / 10 + 32 * hf.field_t;
                        var8 = -1 + -pd.field_a.field_x + var6;
                        var9 = -1 + var7;
                        ag.a(true, 9, -(ef.field_b[3].field_A >> 749221633) + (pd.field_a.field_A >> 1538719777) + var9, var8 - ef.field_b[3].field_y);
                        break L409;
                      }
                    }
                  }
                  L415: {
                    kn.field_E = kn.field_E - 1;
                    if (kn.field_E < 0) {
                      break L415;
                    } else {
                      if (kn.field_E % 50 <= 5) {
                        break L406;
                      } else {
                        if ((kn.field_E % 50 ^ -1) <= -31) {
                          break L406;
                        } else {
                          if (kn.field_E < 300) {
                            break L415;
                          } else {
                            break L406;
                          }
                        }
                      }
                    }
                  }
                  L416: {
                    tb.field_c = 55;
                    if (!je.c(ca.field_k, hf.field_t, 1, 1)) {
                      break L416;
                    } else {
                      tb.field_c = 63;
                      break L416;
                    }
                  }
                  if (-1 < (kn.field_E ^ -1)) {
                    L417: {
                      if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                        break L417;
                      } else {
                        L418: {
                          if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                            break L418;
                          } else {
                            if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                              break L406;
                            } else {
                              rj.a((byte) -38, 2);
                              if (var21 == 0) {
                                break L406;
                              } else {
                                break L418;
                              }
                            }
                          }
                        }
                        rj.a((byte) -38, 11);
                        if (var21 == 0) {
                          break L406;
                        } else {
                          break L417;
                        }
                      }
                    }
                    rj.a((byte) -38, 1);
                    if (var21 == 0) {
                      break L406;
                    } else {
                      break L407;
                    }
                  } else {
                    break L406;
                  }
                }
                L419: {
                  kn.field_E = 500;
                  if (qe.field_b[2]) {
                    kn.field_E = 1000;
                    break L419;
                  } else {
                    break L419;
                  }
                }
                if (qe.field_b[19]) {
                  kn.field_E = 2000;
                  break L406;
                } else {
                  break L406;
                }
              }
              L420: {
                L421: {
                  L422: {
                    if (qe.field_b[16]) {
                      break L422;
                    } else {
                      if (1 != cm.field_o) {
                        break L422;
                      } else {
                        if (mh.field_e[ca.field_k][hf.field_t].field_A) {
                          break L421;
                        } else {
                          break L422;
                        }
                      }
                    }
                  }
                  if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                    break L420;
                  } else {
                    if (!je.a(ca.field_k, hf.field_t, 1, 1)) {
                      cn.field_C = cn.field_C + 1;
                      if (-1 > (cn.field_C ^ -1)) {
                        cn.field_C = 0;
                        if (var21 == 0) {
                          break L420;
                        } else {
                          break L421;
                        }
                      } else {
                        break L420;
                      }
                    } else {
                      break L420;
                    }
                  }
                }
                L423: {
                  cn.field_C = cn.field_C - 1;
                  if (!sc.field_b) {
                    break L423;
                  } else {
                    if (!ni.a(29, 11764)) {
                      var6 = 32 * ca.field_k - -(sk.field_d / 10);
                      var7 = mf.field_i / 10 + 32 * hf.field_t;
                      var8 = 28 + var6;
                      var9 = -1 + var7;
                      ag.a(true, 29, var9 - -8 + -(ef.field_b[3].field_A >> 646762177), var8 - 2);
                      break L423;
                    } else {
                      break L423;
                    }
                  }
                }
                if (-300 <= cn.field_C) {
                  break L420;
                } else {
                  if (15 != pl.field_h) {
                    break L420;
                  } else {
                    L424: {
                      if (ke.field_V) {
                        cn.field_C = -300;
                        break L424;
                      } else {
                        break L424;
                      }
                    }
                    rj.a((byte) -38, 8);
                    break L420;
                  }
                }
              }
              L425: {
                L426: {
                  if (je.e(ca.field_k, hf.field_t, 1, 1) > 0) {
                    break L426;
                  } else {
                    if ((je.e(ca.field_k, hf.field_t, 2, 2) ^ -1) >= -1) {
                      break L425;
                    } else {
                      break L426;
                    }
                  }
                }
                rj.a((byte) -38, 3);
                break L425;
              }
              L427: {
                var6 = je.a() ? 1 : 0;
                if (pl.field_h != 15) {
                  break L427;
                } else {
                  if (-1 != (ul.field_b ^ -1)) {
                    break L427;
                  } else {
                    if (var6 != 0) {
                      ul.field_b = 30;
                      break L427;
                    } else {
                      break L427;
                    }
                  }
                }
              }
              L428: {
                var7 = je.field_O.f(hf.field_t, 2, ca.field_k) ? 1 : 0;
                if (ul.field_b <= 0) {
                  break L428;
                } else {
                  L429: {
                    if (var2_int != 0) {
                      break L429;
                    } else {
                      if (var6 != 0) {
                        break L429;
                      } else {
                        if (var7 != 0) {
                          break L429;
                        } else {
                          break L428;
                        }
                      }
                    }
                  }
                  L430: {
                    if (var6 != 0) {
                      break L430;
                    } else {
                      if (var7 != 0) {
                        var8_ref_gf = new gf(ca.field_k, hf.field_t, 16);
                        var8_ref_gf.field_b = 250;
                        uf.field_p[jf.b((byte) 53)] = var8_ref_gf;
                        ul.field_b = 1;
                        break L430;
                      } else {
                        break L430;
                      }
                    }
                  }
                  fieldTemp$9 = ul.field_b - 1;
                  ul.field_b = ul.field_b - 1;
                  if (-1 != (fieldTemp$9 ^ -1)) {
                    break L428;
                  } else {
                    rj.a((byte) -38, 12);
                    break L428;
                  }
                }
              }
              L431: {
                if (!mh.field_e[ca.field_k][hf.field_t].field_a) {
                  break L431;
                } else {
                  if (mh.field_e[ca.field_k][hf.field_t].field_v) {
                    break L431;
                  } else {
                    if (qe.field_b[7]) {
                      break L431;
                    } else {
                      rj.a((byte) -38, 4);
                      break L431;
                    }
                  }
                }
              }
              L432: {
                if ((ch.field_h ^ -1) != 0) {
                  L433: {
                    tb.field_c = ch.field_h;
                    cl.field_I = cl.field_I + 1;
                    if (-6 >= (ch.field_h ^ -1)) {
                      break L433;
                    } else {
                      if (ch.field_h < 0) {
                        break L433;
                      } else {
                        L434: {
                          tb.field_c = 4 * ch.field_h + 64;
                          if (-6 <= (cl.field_I ^ -1)) {
                            break L434;
                          } else {
                            tb.field_c = tb.field_c + 1;
                            break L434;
                          }
                        }
                        if (-11 > (cl.field_I ^ -1)) {
                          tb.field_c = tb.field_c + 1;
                          break L433;
                        } else {
                          break L433;
                        }
                      }
                    }
                  }
                  L435: {
                    if ((ch.field_h ^ -1) == -6) {
                      L436: {
                        tb.field_c = 0;
                        if (5 < cl.field_I) {
                          tb.field_c = tb.field_c + 1;
                          break L436;
                        } else {
                          break L436;
                        }
                      }
                      if (10 >= cl.field_I) {
                        break L435;
                      } else {
                        tb.field_c = tb.field_c + 1;
                        break L435;
                      }
                    } else {
                      break L435;
                    }
                  }
                  L437: {
                    if (-1 <= ch.field_h) {
                      break L437;
                    } else {
                      L438: {
                        tb.field_c = 3 - -ch.field_h;
                        if (5 < cl.field_I) {
                          tb.field_c = tb.field_c - 1;
                          break L438;
                        } else {
                          break L438;
                        }
                      }
                      if (-11 > (cl.field_I ^ -1)) {
                        tb.field_c = tb.field_c - 1;
                        break L437;
                      } else {
                        break L437;
                      }
                    }
                  }
                  if (50 < cl.field_I) {
                    cl.field_I = 0;
                    ch.field_h = -1;
                    break L432;
                  } else {
                    break L432;
                  }
                } else {
                  break L432;
                }
              }
              L439: {
                stackOut_2598_0 = mh.field_e[ca.field_k][hf.field_t];
                stackIn_2601_0 = stackOut_2598_0;
                stackIn_2599_0 = stackOut_2598_0;
                if (!qe.field_b[6]) {
                  stackOut_2601_0 = (je) ((Object) stackIn_2601_0);
                  stackOut_2601_1 = 180;
                  stackIn_2602_0 = stackOut_2601_0;
                  stackIn_2602_1 = stackOut_2601_1;
                  break L439;
                } else {
                  stackOut_2599_0 = (je) ((Object) stackIn_2599_0);
                  stackOut_2599_1 = 255;
                  stackIn_2602_0 = stackOut_2599_0;
                  stackIn_2602_1 = stackOut_2599_1;
                  break L439;
                }
              }
              L440: {
                L441: {
                  stackIn_2602_0.field_i = stackIn_2602_1;
                  mh.field_e[16][0].field_i = 255;
                  mh.field_e[16][1].field_i = 255;
                  mh.field_e[16][2].field_i = 255;
                  mh.field_e[16][3].field_i = 255;
                  mh.field_e[ca.field_k][hf.field_t].field_V = true;
                  mh.field_e[ca.field_k][hf.field_t].field_e = true;
                  var8 = qd.field_O[83] ? 1 : 0;
                  var9 = -1;
                  var10 = -1;
                  if (!d.field_b) {
                    break L441;
                  } else {
                    L442: {
                      if (qd.field_O[d.field_e]) {
                        break L442;
                      } else {
                        if (var8 == 0) {
                          break L441;
                        } else {
                          if (!qd.field_O[96]) {
                            break L441;
                          } else {
                            if (!qd.field_O[98]) {
                              break L441;
                            } else {
                              break L442;
                            }
                          }
                        }
                      }
                    }
                    stackOut_2615_0 = 1;
                    stackIn_2618_0 = stackOut_2615_0;
                    break L440;
                  }
                }
                stackOut_2617_0 = 0;
                stackIn_2618_0 = stackOut_2617_0;
                break L440;
              }
              L443: {
                L444: {
                  var11 = stackIn_2618_0;
                  if (!d.field_b) {
                    break L444;
                  } else {
                    L445: {
                      if (qd.field_O[lb.field_w]) {
                        break L445;
                      } else {
                        if (var8 == 0) {
                          break L444;
                        } else {
                          if (!qd.field_O[98]) {
                            break L444;
                          } else {
                            if (qd.field_O[96]) {
                              break L444;
                            } else {
                              if (qd.field_O[97]) {
                                break L444;
                              } else {
                                break L445;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_2634_0 = 1;
                    stackIn_2637_0 = stackOut_2634_0;
                    break L443;
                  }
                }
                stackOut_2636_0 = 0;
                stackIn_2637_0 = stackOut_2636_0;
                break L443;
              }
              L446: {
                L447: {
                  var12 = stackIn_2637_0;
                  if (!d.field_b) {
                    break L447;
                  } else {
                    L448: {
                      if (qd.field_O[hd.field_l]) {
                        break L448;
                      } else {
                        if (var8 == 0) {
                          break L447;
                        } else {
                          if (!qd.field_O[97]) {
                            break L447;
                          } else {
                            if (!qd.field_O[98]) {
                              break L447;
                            } else {
                              break L448;
                            }
                          }
                        }
                      }
                    }
                    stackOut_2650_0 = 1;
                    stackIn_2653_0 = stackOut_2650_0;
                    break L446;
                  }
                }
                stackOut_2652_0 = 0;
                stackIn_2653_0 = stackOut_2652_0;
                break L446;
              }
              L449: {
                L450: {
                  var13 = stackIn_2653_0;
                  if (!d.field_b) {
                    break L450;
                  } else {
                    L451: {
                      if (qd.field_O[tk.field_g]) {
                        break L451;
                      } else {
                        if (var8 == 0) {
                          break L450;
                        } else {
                          if (!qd.field_O[96]) {
                            break L450;
                          } else {
                            if (!qd.field_O[99]) {
                              break L450;
                            } else {
                              break L451;
                            }
                          }
                        }
                      }
                    }
                    stackOut_2666_0 = 1;
                    stackIn_2669_0 = stackOut_2666_0;
                    break L449;
                  }
                }
                stackOut_2668_0 = 0;
                stackIn_2669_0 = stackOut_2668_0;
                break L449;
              }
              L452: {
                L453: {
                  var14 = stackIn_2669_0;
                  if (!d.field_b) {
                    break L453;
                  } else {
                    L454: {
                      if (qd.field_O[qc.field_c]) {
                        break L454;
                      } else {
                        if (var8 == 0) {
                          break L453;
                        } else {
                          if (!qd.field_O[99]) {
                            break L453;
                          } else {
                            if (qd.field_O[96]) {
                              break L453;
                            } else {
                              if (qd.field_O[97]) {
                                break L453;
                              } else {
                                break L454;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_2685_0 = 1;
                    stackIn_2688_0 = stackOut_2685_0;
                    break L452;
                  }
                }
                stackOut_2687_0 = 0;
                stackIn_2688_0 = stackOut_2687_0;
                break L452;
              }
              L455: {
                L456: {
                  var15 = stackIn_2688_0;
                  if (!d.field_b) {
                    break L456;
                  } else {
                    L457: {
                      if (qd.field_O[qm.field_a]) {
                        break L457;
                      } else {
                        if (var8 == 0) {
                          break L456;
                        } else {
                          if (!qd.field_O[97]) {
                            break L456;
                          } else {
                            if (!qd.field_O[99]) {
                              break L456;
                            } else {
                              break L457;
                            }
                          }
                        }
                      }
                    }
                    stackOut_2701_0 = 1;
                    stackIn_2704_0 = stackOut_2701_0;
                    break L455;
                  }
                }
                stackOut_2703_0 = 0;
                stackIn_2704_0 = stackOut_2703_0;
                break L455;
              }
              L458: {
                L459: {
                  var16 = stackIn_2704_0;
                  if (!d.field_b) {
                    break L459;
                  } else {
                    L460: {
                      if (qd.field_O[ge.field_f]) {
                        break L460;
                      } else {
                        if (var8 == 0) {
                          break L459;
                        } else {
                          if (!qd.field_O[96]) {
                            break L459;
                          } else {
                            if (qd.field_O[98]) {
                              break L459;
                            } else {
                              if (qd.field_O[99]) {
                                break L459;
                              } else {
                                break L460;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_2720_0 = 1;
                    stackIn_2723_0 = stackOut_2720_0;
                    break L458;
                  }
                }
                stackOut_2722_0 = 0;
                stackIn_2723_0 = stackOut_2722_0;
                break L458;
              }
              L461: {
                L462: {
                  var17 = stackIn_2723_0;
                  if (!d.field_b) {
                    break L462;
                  } else {
                    L463: {
                      if (qd.field_O[hi.field_v]) {
                        break L463;
                      } else {
                        if (var8 == 0) {
                          break L462;
                        } else {
                          if (!qd.field_O[97]) {
                            break L462;
                          } else {
                            if (qd.field_O[98]) {
                              break L462;
                            } else {
                              if (qd.field_O[99]) {
                                break L462;
                              } else {
                                break L463;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_2739_0 = 1;
                    stackIn_2742_0 = stackOut_2739_0;
                    break L461;
                  }
                }
                stackOut_2741_0 = 0;
                stackIn_2742_0 = stackOut_2741_0;
                break L461;
              }
              L464: {
                L465: {
                  var18 = stackIn_2742_0;
                  if (var11 != 0) {
                    break L465;
                  } else {
                    if (var12 != 0) {
                      break L465;
                    } else {
                      if (var13 != 0) {
                        break L465;
                      } else {
                        if (var17 != 0) {
                          break L465;
                        } else {
                          if (var18 != 0) {
                            break L465;
                          } else {
                            if (var14 != 0) {
                              break L465;
                            } else {
                              if (var15 != 0) {
                                break L465;
                              } else {
                                if (var16 != 0) {
                                  break L465;
                                } else {
                                  break L464;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                gl.a(8, param0 ^ -16481);
                break L464;
              }
              L466: {
                if (-2 > (rj.field_f ^ -1)) {
                  stackOut_2770_0 = 0;
                  stackIn_2771_0 = stackOut_2770_0;
                  break L466;
                } else {
                  stackOut_2768_0 = 1;
                  stackIn_2771_0 = stackOut_2768_0;
                  break L466;
                }
              }
              L467: {
                L468: {
                  var19 = stackIn_2771_0;
                  if (var11 != 0) {
                    break L468;
                  } else {
                    if (this.field_U != 5) {
                      break L467;
                    } else {
                      break L468;
                    }
                  }
                }
                if (var19 == 0) {
                  break L467;
                } else {
                  if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                    break L467;
                  } else {
                    if (mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                      rj.field_f = 7;
                      kj.field_d = 0;
                      var19 = 0;
                      var9 = ca.field_k - 1;
                      var10 = hf.field_t;
                      di.field_K = -1;
                      break L467;
                    } else {
                      break L467;
                    }
                  }
                }
              }
              L469: {
                L470: {
                  if (var14 != 0) {
                    break L470;
                  } else {
                    if ((this.field_U ^ -1) != -4) {
                      break L469;
                    } else {
                      break L470;
                    }
                  }
                }
                if (var19 == 0) {
                  break L469;
                } else {
                  if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                    break L469;
                  } else {
                    if (mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                      var10 = hf.field_t;
                      kj.field_d = 0;
                      di.field_K = -1;
                      var19 = 0;
                      var9 = ca.field_k + -1;
                      rj.field_f = 7;
                      break L469;
                    } else {
                      break L469;
                    }
                  }
                }
              }
              L471: {
                L472: {
                  if (var13 != 0) {
                    break L472;
                  } else {
                    if ((this.field_U ^ -1) != -6) {
                      break L471;
                    } else {
                      break L472;
                    }
                  }
                }
                if (var19 == 0) {
                  break L471;
                } else {
                  if (!mh.field_e[ca.field_k - -1][hf.field_t].field_a) {
                    break L471;
                  } else {
                    if (mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                      rj.field_f = 7;
                      kj.field_d = 0;
                      di.field_K = 1;
                      var19 = 0;
                      var10 = hf.field_t;
                      var9 = ca.field_k + 1;
                      break L471;
                    } else {
                      break L471;
                    }
                  }
                }
              }
              L473: {
                if (var16 == 0) {
                  break L473;
                } else {
                  if (var19 == 0) {
                    break L473;
                  } else {
                    if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                      break L473;
                    } else {
                      if (!mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                        break L473;
                      } else {
                        var19 = 0;
                        kj.field_d = 0;
                        di.field_K = 1;
                        var9 = ca.field_k - -1;
                        rj.field_f = 7;
                        var10 = hf.field_t;
                        break L473;
                      }
                    }
                  }
                }
              }
              L474: {
                L475: {
                  if (var11 != 0) {
                    break L475;
                  } else {
                    if (5 != this.field_U) {
                      break L474;
                    } else {
                      break L475;
                    }
                  }
                }
                if (var19 == 0) {
                  break L474;
                } else {
                  if (!mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_a) {
                    break L474;
                  } else {
                    var9 = ca.field_k - 1;
                    kj.field_d = 0;
                    di.field_K = -1;
                    var10 = -1 + hf.field_t;
                    rj.field_f = 7;
                    break L474;
                  }
                }
              }
              L476: {
                L477: {
                  if (var17 != 0) {
                    break L477;
                  } else {
                    if (4 != this.field_U) {
                      break L476;
                    } else {
                      break L477;
                    }
                  }
                }
                if (var19 == 0) {
                  break L476;
                } else {
                  if (mh.field_e[ca.field_k - 1][hf.field_t].field_a) {
                    di.field_K = -1;
                    var9 = ca.field_k + -1;
                    var10 = hf.field_t;
                    rj.field_f = 7;
                    kj.field_d = 0;
                    break L476;
                  } else {
                    break L476;
                  }
                }
              }
              L478: {
                L479: {
                  if (var14 != 0) {
                    break L479;
                  } else {
                    if ((this.field_U ^ -1) != -4) {
                      break L478;
                    } else {
                      break L479;
                    }
                  }
                }
                if (var19 == 0) {
                  break L478;
                } else {
                  if (!mh.field_e[ca.field_k + -1][hf.field_t - -1].field_a) {
                    break L478;
                  } else {
                    var9 = ca.field_k + -1;
                    kj.field_d = 0;
                    rj.field_f = 7;
                    di.field_K = -1;
                    var10 = hf.field_t - -1;
                    break L478;
                  }
                }
              }
              L480: {
                L481: {
                  if (var13 != 0) {
                    break L481;
                  } else {
                    if (this.field_U != 5) {
                      break L480;
                    } else {
                      break L481;
                    }
                  }
                }
                if (var19 == 0) {
                  break L480;
                } else {
                  if (mh.field_e[1 + ca.field_k][hf.field_t - 1].field_a) {
                    rj.field_f = 7;
                    di.field_K = 1;
                    var10 = hf.field_t + -1;
                    kj.field_d = 0;
                    var9 = 1 + ca.field_k;
                    break L480;
                  } else {
                    break L480;
                  }
                }
              }
              L482: {
                L483: {
                  if (var18 != 0) {
                    break L483;
                  } else {
                    if (-2 != (this.field_U ^ -1)) {
                      break L482;
                    } else {
                      break L483;
                    }
                  }
                }
                if (var19 == 0) {
                  break L482;
                } else {
                  if (mh.field_e[ca.field_k + 1][hf.field_t].field_a) {
                    di.field_K = 1;
                    kj.field_d = 0;
                    var9 = 1 + ca.field_k;
                    var10 = hf.field_t;
                    rj.field_f = 7;
                    break L482;
                  } else {
                    break L482;
                  }
                }
              }
              L484: {
                if (var16 == 0) {
                  break L484;
                } else {
                  if (var19 == 0) {
                    break L484;
                  } else {
                    if (mh.field_e[1 + ca.field_k][hf.field_t + 1].field_a) {
                      var9 = ca.field_k - -1;
                      var10 = hf.field_t - -1;
                      di.field_K = 1;
                      kj.field_d = 0;
                      rj.field_f = 7;
                      break L484;
                    } else {
                      break L484;
                    }
                  }
                }
              }
              L485: {
                L486: {
                  if (var12 != 0) {
                    break L486;
                  } else {
                    if (5 != this.field_U) {
                      break L485;
                    } else {
                      break L486;
                    }
                  }
                }
                if (var19 == 0) {
                  break L485;
                } else {
                  if (mh.field_e[ca.field_k][hf.field_t + -1].field_a) {
                    var10 = hf.field_t - 1;
                    var9 = ca.field_k;
                    di.field_K = 1;
                    rj.field_f = 7;
                    kj.field_d = 0;
                    break L485;
                  } else {
                    break L485;
                  }
                }
              }
              L487: {
                L488: {
                  if (var15 != 0) {
                    break L488;
                  } else {
                    if (this.field_U != 2) {
                      break L487;
                    } else {
                      break L488;
                    }
                  }
                }
                if (var19 == 0) {
                  break L487;
                } else {
                  if (mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                    var10 = 1 + hf.field_t;
                    rj.field_f = 7;
                    kj.field_d = 0;
                    var9 = ca.field_k;
                    break L487;
                  } else {
                    break L487;
                  }
                }
              }
              L489: {
                if (qe.field_b[5]) {
                  L490: {
                    if (4 < rj.field_f) {
                      stackOut_2933_0 = 0;
                      stackIn_2934_0 = stackOut_2933_0;
                      break L490;
                    } else {
                      stackOut_2931_0 = 1;
                      stackIn_2934_0 = stackOut_2931_0;
                      break L490;
                    }
                  }
                  L491: {
                    var20 = stackIn_2934_0;
                    if (var17 == 0) {
                      break L491;
                    } else {
                      if (var20 == 0) {
                        break L491;
                      } else {
                        if (mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                          ne.a(22, 30);
                          var9 = -1 + ca.field_k;
                          var10 = hf.field_t;
                          kj.field_d = 0;
                          rj.field_f = 8;
                          di.field_K = -1;
                          break L491;
                        } else {
                          break L491;
                        }
                      }
                    }
                  }
                  if (var18 == 0) {
                    break L489;
                  } else {
                    if (var20 == 0) {
                      break L489;
                    } else {
                      if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                        break L489;
                      } else {
                        ne.a(22, 33);
                        kj.field_d = 0;
                        rj.field_f = 8;
                        var9 = 1 + ca.field_k;
                        var10 = hf.field_t;
                        di.field_K = 1;
                        break L489;
                      }
                    }
                  }
                } else {
                  break L489;
                }
              }
              L492: {
                if (var9 < 1) {
                  break L492;
                } else {
                  if (-2 <= (var10 ^ -1)) {
                    break L492;
                  } else {
                    if (-32 >= (var9 ^ -1)) {
                      break L492;
                    } else {
                      if (je.field_t <= var10) {
                        break L492;
                      } else {
                        this.field_db = var9;
                        this.field_N = var10;
                        break L492;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.PA(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        uj[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_ab;
        try {
          L0: {
            L1: {
              L2: {
                if ((wj.field_j ^ -1) <= -3) {
                  lf.a(-673, ce.field_d);
                  ug.field_a = new bf();
                  var2_array = ug.field_a.e(-27555);
                  var3 = 0;
                  L3: while (true) {
                    if (var2_array.length <= var3) {
                      break L2;
                    } else {
                      bh.a(var2_array[var3], (byte) -115);
                      var3++;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param0 >= 64) {
                break L1;
              } else {
                this.field_N = 54;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.LA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        try {
            ph.field_d = 38054639 ^ param1;
            if (param0 > -11) {
                this.field_W = 127;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void x(int param0) {
        ea discarded$5 = null;
        ea discarded$6 = null;
        ea[] array$7 = null;
        ea[] array$8 = null;
        ea discarded$9 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        double var2_double = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        int var8_int = 0;
        ln[] var8 = null;
        int[] var9 = null;
        int var9_int = 0;
        ln[] var9_array = null;
        int var10_int = 0;
        ln[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_53_0 = 0;
        ln[] stackIn_77_0 = null;
        ln[] stackIn_81_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_52_0 = 0;
        ln[] stackOut_76_0 = null;
        ln[] stackOut_80_0 = null;
        var13 = field_ab;
        try {
          L0: {
            L1: {
              if (pj.field_a > 0) {
                break L1;
              } else {
                ib.field_c = tb.a("screenshots", "membersexpansion", fl.field_f, 1);
                break L1;
              }
            }
            L2: {
              ce.field_d = rd.a("", -90, ne.field_L, fl.field_f, "b12");
              pk.field_b = rd.a("", -116, ne.field_L, fl.field_f, "big_font");
              mm.field_a = rd.a("", -79, ne.field_L, fl.field_f, "small_font");
              sb.field_n = tl.a("grave_font", fl.field_f, 2, "", ne.field_L);
              wd.field_e = sb.field_n.f(16777215);
              if (param0 <= -29) {
                break L2;
              } else {
                this.field_M = 19;
                break L2;
              }
            }
            bi.field_p = sb.field_n.f(65280);
            re.field_b = sb.field_n.f(16711680);
            nj.field_c = td.a("achievements", fl.field_f, "", (byte) 110);
            te.field_d = td.a("dinamite", fl.field_f, "", (byte) 127);
            wj.field_k = td.a("smoke", fl.field_f, "", (byte) 126);
            ne.field_O = td.a("charge", fl.field_f, "", (byte) 111);
            wj.field_l = jn.a("minersplat", -29553, "", fl.field_f);
            hj.field_h = jn.a("rope", -29553, "", fl.field_f);
            m.field_m = jn.a("title1", -29553, "", fl.field_f);
            l.field_c = jn.a("title_dwarf", -29553, "", fl.field_f);
            ak.field_c = bb.a("iphone_ad", fl.field_f, -127, "");
            gi.field_a = bb.a("iphone_ad_mouseover", fl.field_f, -120, "");
            discarded$5 = jn.a("locked_option", -29553, "", fl.field_f);
            discarded$6 = jn.a("locked_option_end", -29553, "", fl.field_f);
            pk.field_d = jn.a("gold", -29553, "shop", fl.field_f);
            gb.field_a = jn.a("sold", -29553, "shop", fl.field_f);
            kd.field_r = jn.a("green_frame", -29553, "shop", fl.field_f);
            ib.field_a = jn.a("controls", -29553, "", fl.field_f);
            vc.field_p = new ea[9];
            var2_int = 0;
            L3: while (true) {
              L4: {
                if (-10 >= (var2_int ^ -1)) {
                  break L4;
                } else {
                  vc.field_p[var2_int] = jn.a("fs_button" + var2_int, -29553, "", fl.field_f);
                  var2_int++;
                  if (var13 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              var2_double = 6.283185307179586;
              var4 = 2.356194490192345;
              var6 = 0.7853981633974483;
              ef.field_b = new ea[8];
              ef.field_b[3] = jn.a("arrow", -29553, "", fl.field_f);
              var8_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    L8: {
                      if ((var8_int ^ -1) <= -9) {
                        break L8;
                      } else {
                        stackOut_12_0 = var8_int;
                        stackOut_12_1 = 3;
                        stackIn_21_0 = stackOut_12_0;
                        stackIn_21_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (var13 != 0) {
                          L9: while (true) {
                            if (stackIn_21_0 <= stackIn_21_1) {
                              break L7;
                            } else {
                              pk.field_h[var8_int] = a.field_a[var8_int].c();
                              ml.a((byte) 93, 16777215, pk.field_h[var8_int], a.field_a[var8_int]);
                              var9 = pk.field_h[var8_int].field_D;
                              stackOut_22_0 = -1 + var9.length;
                              stackIn_36_0 = stackOut_22_0;
                              stackIn_23_0 = stackOut_22_0;
                              if (var13 != 0) {
                                break L6;
                              } else {
                                var10_int = stackIn_23_0;
                                L10: while (true) {
                                  L11: {
                                    if (0 > var10_int) {
                                      break L11;
                                    } else {
                                      stackOut_25_0 = 0;
                                      stackOut_25_1 = var9[var10_int];
                                      stackIn_21_0 = stackOut_25_0;
                                      stackIn_21_1 = stackOut_25_1;
                                      stackIn_26_0 = stackOut_25_0;
                                      stackIn_26_1 = stackOut_25_1;
                                      if (var13 != 0) {
                                        continue L9;
                                      } else {
                                        L12: {
                                          if (stackIn_26_0 >= stackIn_26_1) {
                                            break L12;
                                          } else {
                                            if (-16777216 != (var9[var10_int] ^ -1)) {
                                              var9[var10_int] = 0;
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        var10_int--;
                                        if (var13 == 0) {
                                          continue L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  var8_int++;
                                  if (var13 == 0) {
                                    stackOut_20_0 = var8_int ^ -1;
                                    stackOut_20_1 = pk.field_h.length ^ -1;
                                    stackIn_21_0 = stackOut_20_0;
                                    stackIn_21_1 = stackOut_20_1;
                                    continue L9;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L13: {
                            L14: {
                              if (stackIn_13_0 != stackIn_13_1) {
                                break L14;
                              } else {
                                var4 = var4 - var6;
                                if (var13 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            ef.field_b[var8_int] = new ea(32, 32);
                            ef.field_b[var8_int].g();
                            ef.field_b[3].b(-106, 16, 4096, (int)(0.5 + 65535.0 * var4 / var2_double), 16);
                            ef.field_b[var8_int].f(1);
                            var4 = var4 - var6;
                            break L13;
                          }
                          var8_int++;
                          if (var13 == 0) {
                            continue L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    ef.field_b[3].f(1);
                    bj.field_e.a((byte) -45);
                    ha.field_c = jn.a("unachieved", -29553, "basic", ob.field_q);
                    cb.field_e = jn.a("orbcoin", -29553, "basic", ob.field_q);
                    a.field_a = td.a("miner2", fl.field_f, "", (byte) 118);
                    ag.field_a = td.a("miner_stash", fl.field_f, "", (byte) 121);
                    pk.field_h = new ea[a.field_a.length];
                    var8_int = 0;
                    L15: while (true) {
                      stackOut_20_0 = var8_int ^ -1;
                      stackOut_20_1 = pk.field_h.length ^ -1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      L16: while (true) {
                        if (stackIn_21_0 <= stackIn_21_1) {
                          break L7;
                        } else {
                          pk.field_h[var8_int] = a.field_a[var8_int].c();
                          ml.a((byte) 93, 16777215, pk.field_h[var8_int], a.field_a[var8_int]);
                          var9 = pk.field_h[var8_int].field_D;
                          stackOut_22_0 = -1 + var9.length;
                          stackIn_36_0 = stackOut_22_0;
                          stackIn_23_0 = stackOut_22_0;
                          if (var13 != 0) {
                            break L6;
                          } else {
                            var10_int = stackIn_23_0;
                            L17: while (true) {
                              L18: {
                                if (0 > var10_int) {
                                  break L18;
                                } else {
                                  stackOut_25_0 = 0;
                                  stackOut_25_1 = var9[var10_int];
                                  stackIn_21_0 = stackOut_25_0;
                                  stackIn_21_1 = stackOut_25_1;
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  if (var13 != 0) {
                                    continue L16;
                                  } else {
                                    L19: {
                                      if (stackIn_26_0 >= stackIn_26_1) {
                                        break L19;
                                      } else {
                                        if (-16777216 != (var9[var10_int] ^ -1)) {
                                          var9[var10_int] = 0;
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    var10_int--;
                                    if (var13 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              var8_int++;
                              if (var13 == 0) {
                                continue L15;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  eg.field_m = new ea[ag.field_a.length];
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  break L6;
                }
                var8_int = stackIn_36_0;
                L20: while (true) {
                  stackOut_37_0 = var8_int;
                  stackOut_37_1 = eg.field_m.length;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  L21: while (true) {
                    L22: {
                      L23: {
                        if (stackIn_38_0 >= stackIn_38_1) {
                          break L23;
                        } else {
                          eg.field_m[var8_int] = ag.field_a[var8_int].c();
                          ml.a((byte) 93, 16777215, eg.field_m[var8_int], ag.field_a[var8_int]);
                          var9 = eg.field_m[var8_int].field_D;
                          stackOut_39_0 = var9.length - 1;
                          stackIn_53_0 = stackOut_39_0;
                          stackIn_40_0 = stackOut_39_0;
                          if (var13 != 0) {
                            break L22;
                          } else {
                            var10_int = stackIn_40_0;
                            L24: while (true) {
                              L25: {
                                if (var10_int < 0) {
                                  break L25;
                                } else {
                                  stackOut_42_0 = 0;
                                  stackOut_42_1 = var9[var10_int];
                                  stackIn_38_0 = stackOut_42_0;
                                  stackIn_38_1 = stackOut_42_1;
                                  stackIn_43_0 = stackOut_42_0;
                                  stackIn_43_1 = stackOut_42_1;
                                  if (var13 != 0) {
                                    continue L21;
                                  } else {
                                    L26: {
                                      if (stackIn_43_0 >= stackIn_43_1) {
                                        break L26;
                                      } else {
                                        if (16777215 != var9[var10_int]) {
                                          var9[var10_int] = 0;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var10_int--;
                                    if (var13 == 0) {
                                      continue L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              var8_int++;
                              if (var13 == 0) {
                                continue L20;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                      pj.field_e = md.a("shadow", fl.field_f, 10, "");
                      tn.field_K = td.a("shop_illustrations", fl.field_f, "shop", (byte) 118);
                      wc.field_c[0] = td.a("powerups_volc", fl.field_f, "shop", (byte) 109);
                      array$7 = new ea[wc.field_c[0].length];
                      te.field_e[0] = array$7;
                      stackOut_52_0 = 0;
                      stackIn_53_0 = stackOut_52_0;
                      break L22;
                    }
                    var8_int = stackIn_53_0;
                    L27: while (true) {
                      L28: {
                        L29: {
                          if ((var8_int ^ -1) <= (te.field_e[0].length ^ -1)) {
                            break L29;
                          } else {
                            te.field_e[0][var8_int] = new ea(wc.field_c[0][var8_int].field_x, wc.field_c[0][var8_int].field_A);
                            te.field_e[0][var8_int].g();
                            wc.field_c[0][var8_int].h(0, 0);
                            var8_int++;
                            if (var13 != 0) {
                              break L28;
                            } else {
                              if (var13 == 0) {
                                continue L27;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                        wc.field_c[1] = td.a("powerups_super", fl.field_f, "shop", (byte) 127);
                        array$8 = new ea[wc.field_c[1].length];
                        te.field_e[1] = array$8;
                        break L28;
                      }
                      var8_int = 0;
                      L30: while (true) {
                        L31: {
                          L32: {
                            if ((te.field_e[1].length ^ -1) >= (var8_int ^ -1)) {
                              break L32;
                            } else {
                              te.field_e[1][var8_int] = new ea(wc.field_c[1][var8_int].field_x, wc.field_c[1][var8_int].field_A);
                              te.field_e[1][var8_int].g();
                              wc.field_c[1][var8_int].h(0, 0);
                              var8_int++;
                              if (var13 != 0) {
                                break L31;
                              } else {
                                if (var13 == 0) {
                                  continue L30;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          bj.field_e.a((byte) -45);
                          he.field_b = td.a("shopframe", fl.field_f, "shop", (byte) 125);
                          vh.field_a = new ea[2];
                          vh.field_a[0] = jn.a("shop_background", -29553, "shop", fl.field_f);
                          vh.field_a[1] = jn.a("shop_background_ice", -29553, "shop", fl.field_f);
                          qc.field_d = jn.a("shop_sign", -29553, "shop", fl.field_f);
                          hd.field_d = new ea[9];
                          hd.field_d[0] = jn.a("frame_topleft", -29553, "", fl.field_f);
                          hd.field_d[1] = jn.a("frame_top", -29553, "", fl.field_f);
                          hd.field_d[2] = jn.a("frame_topright", -29553, "", fl.field_f);
                          hd.field_d[3] = jn.a("frame_left", -29553, "", fl.field_f);
                          hd.field_d[4] = jn.a("frame_centre", -29553, "", fl.field_f);
                          hd.field_d[5] = jn.a("frame_right", -29553, "", fl.field_f);
                          hd.field_d[6] = jn.a("frame_bottomleft", -29553, "", fl.field_f);
                          hd.field_d[7] = jn.a("frame_bottom", -29553, "", fl.field_f);
                          hd.field_d[8] = jn.a("frame_bottomright", -29553, "", fl.field_f);
                          ak.field_a = new ea[9];
                          ak.field_a[0] = jn.a("bigframe_topleft", -29553, "", fl.field_f);
                          ak.field_a[1] = jn.a("bigframe_top", -29553, "", fl.field_f);
                          ak.field_a[2] = jn.a("bigframe_topright", -29553, "", fl.field_f);
                          ak.field_a[3] = jn.a("bigframe_left", -29553, "", fl.field_f);
                          ak.field_a[4] = jn.a("bigframe_centre", -29553, "", fl.field_f);
                          ak.field_a[5] = jn.a("bigframe_right", -29553, "", fl.field_f);
                          ak.field_a[6] = jn.a("bigframe_bottomleft", -29553, "", fl.field_f);
                          ak.field_a[7] = jn.a("bigframe_bottom", -29553, "", fl.field_f);
                          ak.field_a[8] = jn.a("bigframe_bottomright", -29553, "", fl.field_f);
                          ah.field_c = new ea[9];
                          ah.field_c[0] = jn.a("danger_topleft", -29553, "", fl.field_f);
                          ah.field_c[1] = jn.a("danger_top", -29553, "", fl.field_f);
                          ah.field_c[2] = jn.a("danger_topright", -29553, "", fl.field_f);
                          ah.field_c[3] = jn.a("danger_left", -29553, "", fl.field_f);
                          ah.field_c[4] = jn.a("danger_centre", -29553, "", fl.field_f);
                          ah.field_c[5] = jn.a("danger_right", -29553, "", fl.field_f);
                          ah.field_c[6] = jn.a("danger_bottomleft", -29553, "", fl.field_f);
                          ah.field_c[7] = jn.a("danger_bottom", -29553, "", fl.field_f);
                          ah.field_c[8] = jn.a("danger_bottomright", -29553, "", fl.field_f);
                          bl.field_w = jn.a("highscore_arrow", -29553, "", fl.field_f);
                          h.field_c = jn.a("highscore_arrow_highlight", -29553, "", fl.field_f);
                          ff.field_f = jn.a("highscore_plaque", -29553, "", fl.field_f);
                          s.field_L = new ea[3];
                          s.field_L[0] = jn.a("scroll_top", -29553, "", fl.field_f);
                          s.field_L[1] = jn.a("scroll_middle", -29553, "", fl.field_f);
                          s.field_L[2] = jn.a("scroll_bottom", -29553, "", fl.field_f);
                          ck.field_a = jn.a("seismograph_base", -29553, "", fl.field_f);
                          ma.field_O = jn.a("seismograph_grid", -29553, "", fl.field_f);
                          bj.field_e.a((byte) -45);
                          ol.field_a = jn.a("seismograph_needle", -29553, "", fl.field_f);
                          ol.field_c = jn.a("title_achievements", -29553, "", fl.field_f);
                          on.field_x = jn.a("title_allscores", -29553, "", fl.field_f);
                          sk.field_e = jn.a("title_bestscores", -29553, "", fl.field_f);
                          ld.field_x = jn.a("title_myscores", -29553, "", fl.field_f);
                          ha.field_a = jn.a("title_instructions", -29553, "", fl.field_f);
                          jc.field_G = jn.a("title_choose", -29553, "", fl.field_f);
                          pd.field_a = jn.a("bubble", -29553, "", fl.field_f);
                          discarded$9 = jn.a("highscorearrow", -29553, "", fl.field_f);
                          qn.field_J = bb.a("worm_gums", fl.field_f, -123, "");
                          ij.field_t = bb.a("worm_skin", fl.field_f, -102, "");
                          te.field_c = md.a("worm_teeth", fl.field_f, 10, "");
                          nb.field_a = new ea[te.field_c.length];
                          break L31;
                        }
                        var8_int = 0;
                        L33: while (true) {
                          L34: {
                            L35: {
                              if ((te.field_c.length ^ -1) >= (var8_int ^ -1)) {
                                break L35;
                              } else {
                                nb.field_a[var8_int] = (ea) ((Object) ((og) ((Object) te.field_c[var8_int])).h());
                                ((og) ((Object) nb.field_a[var8_int])).d(0, -40, -40, -40);
                                var8_int++;
                                if (var13 != 0) {
                                  break L34;
                                } else {
                                  if (var13 == 0) {
                                    continue L33;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                            fl.field_j = tb.a("instruction_pics", "", fl.field_f, 1);
                            break L34;
                          }
                          var8 = new ln[3];
                          var9_int = 0;
                          L36: while (true) {
                            L37: {
                              L38: {
                                if (var9_int >= var8.length) {
                                  break L38;
                                } else {
                                  stackOut_76_0 = (ln[]) (var8);
                                  stackIn_81_0 = stackOut_76_0;
                                  stackIn_77_0 = stackOut_76_0;
                                  if (var13 != 0) {
                                    break L37;
                                  } else {
                                    stackIn_77_0[var9_int] = fl.field_j[-var8.length + fl.field_j.length - -var9_int];
                                    var9_int++;
                                    if (var13 == 0) {
                                      continue L36;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              stackOut_80_0 = new ln[14];
                              stackIn_81_0 = stackOut_80_0;
                              break L37;
                            }
                            var9_array = stackIn_81_0;
                            var9_array[0] = pb.a("", fl.field_f, "keys_esc", (byte) -77);
                            var9_array[1] = pb.a("", fl.field_f, "keys_right", (byte) -77);
                            var9_array[2] = pb.a("", fl.field_f, "keys_left", (byte) -77);
                            var9_array[3] = pb.a("", fl.field_f, "keys_down", (byte) -77);
                            var9_array[4] = pb.a("", fl.field_f, "keys_up", (byte) -77);
                            var9_array[5] = pb.a("", fl.field_f, "keys_space", (byte) -77);
                            var9_array[6] = pb.a("", fl.field_f, "keys_ctrl", (byte) -77);
                            var9_array[7] = pb.a("", fl.field_f, "keys_enter", (byte) -77);
                            var9_array[8] = pb.a("", fl.field_f, "keys_shift", (byte) -77);
                            var9_array[9] = pb.a("", fl.field_f, "keys_w", (byte) -77);
                            var9_array[10] = pb.a("", fl.field_f, "keys_d", (byte) -77);
                            var9_array[11] = pb.a("", fl.field_f, "keys_c", (byte) -77);
                            var9_array[12] = pb.a("", fl.field_f, "keys_s", (byte) -77);
                            var9_array[13] = pb.a("", fl.field_f, "keys_alt", (byte) -77);
                            var10 = new ln[var8.length + fl.field_j.length + var9_array.length];
                            ai.a(fl.field_j, 0, var10, 0, fl.field_j.length);
                            ai.a(var9_array, 0, var10, fl.field_j.length - var8.length, var9_array.length);
                            ai.a(var8, 0, var10, -var8.length + fl.field_j.length - -var9_array.length, var8.length);
                            var11 = new int[var10.length];
                            var12 = fl.field_j.length - var8.length;
                            L39: while (true) {
                              L40: {
                                L41: {
                                  if ((var12 ^ -1) <= (var10.length ^ -1)) {
                                    break L41;
                                  } else {
                                    var11[var12] = 12;
                                    var12++;
                                    if (var13 != 0) {
                                      break L40;
                                    } else {
                                      if (var13 == 0) {
                                        continue L39;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                ce.field_d.a(var10, var11);
                                wd.field_f = true;
                                break L40;
                              }
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.a(-88);
                break L1;
              }
            }
            L2: {
              if (null != kf.field_d) {
                ci.a(kf.field_d, 0);
                kf.field_d.a(param0, qa.field_a);
                kf.field_d = null;
                break L2;
              } else {
                break L2;
              }
            }
            tl.b((byte) 101);
            tn.c((byte) -44);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.DA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int discarded$18 = 0;
        int discarded$19 = 0;
        RuntimeException var5 = null;
        ln[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ea[] var9 = null;
        double var10_double = 0.0;
        int var10 = 0;
        int var12 = 0;
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_226_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_231_1 = 0;
        int stackIn_247_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_214_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_217_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_215_1 = 0;
        int stackOut_225_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_230_1 = 0;
        int stackOut_226_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_228_1 = 0;
        int stackOut_246_0 = 0;
        int stackOut_244_0 = 0;
        var12 = field_ab;
        try {
          L0: {
            if (param1) {
              L1: {
                L2: {
                  var5_array = sa.field_t[cm.field_o];
                  if (cm.field_o != 0) {
                    break L2;
                  } else {
                    L3: {
                      var6 = param2 - -104;
                      if (0 != pl.field_h) {
                        var6 += 50;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        if (-1 == (a.field_c ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            if (a.field_c >= 1000) {
                              break L6;
                            } else {
                              ce.field_d.b(v.field_a, param2, param3, param0, -1);
                              var5_array[1].b(var6, 0);
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (5000 <= a.field_c) {
                              break L7;
                            } else {
                              ce.field_d.b(se.field_J, param2, param3, param0, -1);
                              var5_array[2].b(var6, 0);
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (25000 <= a.field_c) {
                              break L8;
                            } else {
                              ce.field_d.b(wk.field_b, param2, param3, param0, -1);
                              var5_array[3].b(var6, 0);
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if ((a.field_c ^ -1) <= -50001) {
                              break L9;
                            } else {
                              ce.field_d.b(dl.field_b, param2, param3, param0, -1);
                              var5_array[4].b(var6, 0);
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (-100001 < (a.field_c ^ -1)) {
                              break L10;
                            } else {
                              L11: {
                                if (-200001 >= (a.field_c ^ -1)) {
                                  break L11;
                                } else {
                                  L12: {
                                    ce.field_d.b(bn.field_a, param2, param3, param0, -1);
                                    var5_array[6].b(var6, 0);
                                    if ((ne.a(false) ^ -1) == -7) {
                                      break L12;
                                    } else {
                                      if (3 == ne.a(false)) {
                                        break L12;
                                      } else {
                                        if (2 == ne.a(false)) {
                                          break L12;
                                        } else {
                                          L13: {
                                            stackOut_48_0 = -2;
                                            stackIn_53_0 = stackOut_48_0;
                                            stackIn_49_0 = stackOut_48_0;
                                            if (param1) {
                                              stackOut_53_0 = stackIn_53_0;
                                              stackOut_53_1 = 0;
                                              stackIn_54_0 = stackOut_53_0;
                                              stackIn_54_1 = stackOut_53_1;
                                              break L13;
                                            } else {
                                              stackOut_49_0 = stackIn_49_0;
                                              stackIn_51_0 = stackOut_49_0;
                                              stackOut_51_0 = stackIn_51_0;
                                              stackOut_51_1 = 1;
                                              stackIn_54_0 = stackOut_51_0;
                                              stackIn_54_1 = stackOut_51_1;
                                              break L13;
                                            }
                                          }
                                          if (stackIn_54_0 != (ne.a(stackIn_54_1 != 0) ^ -1)) {
                                            break L4;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  fn.a(0, 255, 3);
                                  if (var12 == 0) {
                                    break L4;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L14: {
                                if ((a.field_c ^ -1) <= -500001) {
                                  break L14;
                                } else {
                                  L15: {
                                    ce.field_d.b(qm.field_n, param2, param3, param0, -1);
                                    var5_array[7].b(var6, 0);
                                    if ((ne.a(false) ^ -1) == -7) {
                                      break L15;
                                    } else {
                                      if (ne.a(false) == 3) {
                                        break L15;
                                      } else {
                                        L16: {
                                          stackOut_67_0 = -3;
                                          stackIn_72_0 = stackOut_67_0;
                                          stackIn_68_0 = stackOut_67_0;
                                          if (param1) {
                                            stackOut_72_0 = stackIn_72_0;
                                            stackOut_72_1 = 0;
                                            stackIn_73_0 = stackOut_72_0;
                                            stackIn_73_1 = stackOut_72_1;
                                            break L16;
                                          } else {
                                            stackOut_68_0 = stackIn_68_0;
                                            stackIn_70_0 = stackOut_68_0;
                                            stackOut_70_0 = stackIn_70_0;
                                            stackOut_70_1 = 1;
                                            stackIn_73_0 = stackOut_70_0;
                                            stackIn_73_1 = stackOut_70_1;
                                            break L16;
                                          }
                                        }
                                        if (stackIn_73_0 == (ne.a(stackIn_73_1 != 0) ^ -1)) {
                                          break L15;
                                        } else {
                                          L17: {
                                            if (param1) {
                                              stackOut_79_0 = 0;
                                              stackIn_80_0 = stackOut_79_0;
                                              break L17;
                                            } else {
                                              stackOut_77_0 = 1;
                                              stackIn_80_0 = stackOut_77_0;
                                              break L17;
                                            }
                                          }
                                          if ((ne.a(stackIn_80_0 != 0) ^ -1) != -2) {
                                            break L4;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  fn.a(0, 255, 3);
                                  fn.a(1, 254, 3);
                                  if (var12 == 0) {
                                    break L4;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L18: {
                                if (-1000001 >= (a.field_c ^ -1)) {
                                  break L18;
                                } else {
                                  L19: {
                                    ce.field_d.b(fn.field_r, param2, param3, param0, -1);
                                    var5_array[8].b(var6, 0);
                                    if (ne.a(false) == 6) {
                                      break L19;
                                    } else {
                                      L20: {
                                        if (param1) {
                                          stackOut_95_0 = 0;
                                          stackIn_96_0 = stackOut_95_0;
                                          break L20;
                                        } else {
                                          stackOut_93_0 = 1;
                                          stackIn_96_0 = stackOut_93_0;
                                          break L20;
                                        }
                                      }
                                      if (ne.a(stackIn_96_0 != 0) == 3) {
                                        break L19;
                                      } else {
                                        if (-3 == (ne.a(false) ^ -1)) {
                                          break L19;
                                        } else {
                                          L21: {
                                            if (param1) {
                                              stackOut_105_0 = 0;
                                              stackIn_106_0 = stackOut_105_0;
                                              break L21;
                                            } else {
                                              stackOut_103_0 = 1;
                                              stackIn_106_0 = stackOut_103_0;
                                              break L21;
                                            }
                                          }
                                          if (ne.a(stackIn_106_0 != 0) == 1) {
                                            break L19;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  fn.a(0, 255, 3);
                                  fn.a(1, 254, 3);
                                  fn.a(2, 253, 3);
                                  if (var12 == 0) {
                                    break L4;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              var5_array[9].b(var6, 0);
                              var9 = mb.field_d;
                              var10_double = 0.0;
                              L22: while (true) {
                                L23: {
                                  L24: {
                                    L25: {
                                      if (var10_double >= 6.28) {
                                        break L25;
                                      } else {
                                        var7 = (int)((double)(160 + var6) + 128.0 * Math.sin((double)pa.field_d * 0.05 + var10_double));
                                        var8 = (int)(240.0 + 128.0 * Math.cos(var10_double + (double)pa.field_d * 0.05));
                                        var9[4].a(128, 0, var8, var7, -1271909436);
                                        var7 = (int)((double)(var6 + 160) + 144.0 * Math.sin(var10_double - (double)pa.field_d * 0.04));
                                        var8 = (int)(144.0 * Math.cos(-((double)pa.field_d * 0.04) + var10_double) + 240.0);
                                        var9[3].a(128, 0, var8, var7, -1271909436);
                                        var7 = (int)((double)(160 + var6) + 160.0 * Math.sin((double)pa.field_d * 0.03 + var10_double));
                                        var8 = (int)(Math.cos(var10_double + 0.03 * (double)pa.field_d) * 160.0 + 240.0);
                                        var9[2].a(128, 0, var8, var7, -1271909436);
                                        var7 = (int)(Math.sin(-(0.02 * (double)pa.field_d) + var10_double) * 176.0 + (double)(160 + var6));
                                        var8 = (int)(240.0 + 176.0 * Math.cos(var10_double - 0.02 * (double)pa.field_d));
                                        var9[1].a(128, 0, var8, var7, -1271909436);
                                        var7 = (int)((double)(160 + var6) + 192.0 * Math.sin(0.01 * (double)pa.field_d + var10_double));
                                        var8 = (int)(192.0 * Math.cos(0.01 * (double)pa.field_d + var10_double) + 240.0);
                                        var9[0].a(128, 0, var8, var7, -1271909436);
                                        var10_double = var10_double + 0.314;
                                        if (var12 != 0) {
                                          break L24;
                                        } else {
                                          if (var12 == 0) {
                                            continue L22;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                    }
                                    if (-1 != (pl.field_h ^ -1)) {
                                      param3 -= 27;
                                      break L24;
                                    } else {
                                      var10 = 140;
                                      param3 -= 15;
                                      break L23;
                                    }
                                  }
                                  var10 = 300;
                                  break L23;
                                }
                                L26: {
                                  discarded$10 = ce.field_d.a(qh.field_b, -1 + -(var10 / 2) + param2, param3, var10, 35, 6776679, -1, 1, 0, 16);
                                  discarded$11 = ce.field_d.a(qh.field_b, 1 + -(var10 / 2) + param2, param3, var10, 35, 6776679, -1, 1, 0, 16);
                                  discarded$12 = ce.field_d.a(qh.field_b, param2 + -(var10 / 2), param3 - 1, var10, 35, 6776679, -1, 1, 0, 16);
                                  discarded$13 = ce.field_d.a(qh.field_b, param2 + -(var10 / 2), param3 - -1, var10, 35, 6776679, -1, 1, 0, 16);
                                  discarded$14 = ce.field_d.a(qh.field_b, -(var10 / 2) + param2, param3, var10, 35, 16159517, 1, 1, 0, 16);
                                  stackOut_120_0 = -7;
                                  stackIn_123_0 = stackOut_120_0;
                                  stackIn_121_0 = stackOut_120_0;
                                  if (param1) {
                                    stackOut_123_0 = stackIn_123_0;
                                    stackOut_123_1 = 0;
                                    stackIn_124_0 = stackOut_123_0;
                                    stackIn_124_1 = stackOut_123_1;
                                    break L26;
                                  } else {
                                    stackOut_121_0 = stackIn_121_0;
                                    stackOut_121_1 = 1;
                                    stackIn_124_0 = stackOut_121_0;
                                    stackIn_124_1 = stackOut_121_1;
                                    break L26;
                                  }
                                }
                                L27: {
                                  L28: {
                                    if (stackIn_124_0 == (ne.a(stackIn_124_1 != 0) ^ -1)) {
                                      break L28;
                                    } else {
                                      if (-4 == (ne.a(false) ^ -1)) {
                                        break L28;
                                      } else {
                                        if (-3 == (ne.a(false) ^ -1)) {
                                          break L28;
                                        } else {
                                          L29: {
                                            stackOut_131_0 = -2;
                                            stackIn_136_0 = stackOut_131_0;
                                            stackIn_132_0 = stackOut_131_0;
                                            if (param1) {
                                              stackOut_136_0 = stackIn_136_0;
                                              stackOut_136_1 = 0;
                                              stackIn_137_0 = stackOut_136_0;
                                              stackIn_137_1 = stackOut_136_1;
                                              break L29;
                                            } else {
                                              stackOut_132_0 = stackIn_132_0;
                                              stackIn_134_0 = stackOut_132_0;
                                              stackOut_134_0 = stackIn_134_0;
                                              stackOut_134_1 = 1;
                                              stackIn_137_0 = stackOut_134_0;
                                              stackIn_137_1 = stackOut_134_1;
                                              break L29;
                                            }
                                          }
                                          if (stackIn_137_0 != (ne.a(stackIn_137_1 != 0) ^ -1)) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  fn.a(0, 255, 3);
                                  fn.a(1, 254, 3);
                                  fn.a(2, 253, 3);
                                  fn.a(3, 252, 3);
                                  break L27;
                                }
                                if (var12 == 0) {
                                  break L4;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          ce.field_d.b(ck.field_b, param2, param3, param0, -1);
                          var5_array[5].b(var6, 0);
                          if (var12 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ce.field_d.b(gn.field_b, param2, param3, param0, -1);
                      var5_array[0].b(var6, 0);
                      break L4;
                    }
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (-2 != (cm.field_o ^ -1)) {
                  break L1;
                } else {
                  L30: {
                    var6 = 104 + param2;
                    if (0 == pl.field_h) {
                      break L30;
                    } else {
                      var6 += 50;
                      break L30;
                    }
                  }
                  L31: {
                    if ((a.field_c ^ -1) != -1) {
                      break L31;
                    } else {
                      ce.field_d.b(wi.field_z, param2, param3, param0, -1);
                      var5_array[0].b(var6, 0);
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L31;
                      }
                    }
                  }
                  L32: {
                    if ((a.field_c ^ -1) <= -5001) {
                      break L32;
                    } else {
                      ce.field_d.b(fm.field_O, param2, param3, param0, -1);
                      var5_array[1].b(var6, 0);
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L33: {
                    if (-25001 >= (a.field_c ^ -1)) {
                      break L33;
                    } else {
                      ce.field_d.b(te.field_b, param2, param3, param0, -1);
                      var5_array[2].b(var6, 0);
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L33;
                      }
                    }
                  }
                  L34: {
                    if (-50001 < (a.field_c ^ -1)) {
                      break L34;
                    } else {
                      L35: {
                        if (100000 > a.field_c) {
                          break L35;
                        } else {
                          L36: {
                            if (-200001 >= (a.field_c ^ -1)) {
                              break L36;
                            } else {
                              ce.field_d.b(hm.field_N, param2, param3, param0, -1);
                              var5_array[5].b(var6, 0);
                              if (var12 == 0) {
                                break L1;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (-500001 < (a.field_c ^ -1)) {
                              break L37;
                            } else {
                              L38: {
                                if (a.field_c >= 1000000) {
                                  break L38;
                                } else {
                                  L39: {
                                    ce.field_d.b(le.field_c, param2, param3, param0, -1);
                                    var5_array[7].b(var6, 0);
                                    if (ne.a(false) == 6) {
                                      break L39;
                                    } else {
                                      if ((ne.a(false) ^ -1) == -4) {
                                        break L39;
                                      } else {
                                        if (ne.a(false) == 2) {
                                          break L39;
                                        } else {
                                          if (-2 == (ne.a(false) ^ -1)) {
                                            break L39;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  fn.a(14, 241, 3);
                                  fn.a(15, 240, 3);
                                  if (var12 == 0) {
                                    break L1;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L40: {
                                if (-2000001 < (a.field_c ^ -1)) {
                                  break L40;
                                } else {
                                  var5_array[9].b(var6, 0);
                                  var9 = mb.field_d;
                                  var10_double = 0.0;
                                  L41: while (true) {
                                    L42: {
                                      L43: {
                                        L44: {
                                          if (6.28 <= var10_double) {
                                            break L44;
                                          } else {
                                            var7 = (int)((double)(160 + var6) + Math.sin(var10_double + 0.05 * (double)pa.field_d) * 128.0);
                                            var8 = (int)(240.0 + Math.cos(var10_double + 0.05 * (double)pa.field_d) * 128.0);
                                            var9[4].a(128, 0, var8, var7, -1271909436);
                                            var7 = (int)(Math.sin(-((double)pa.field_d * 0.04) + var10_double) * 144.0 + (double)(160 + var6));
                                            var8 = (int)(240.0 + Math.cos(var10_double - 0.04 * (double)pa.field_d) * 144.0);
                                            var9[3].a(128, 0, var8, var7, -1271909436);
                                            var7 = (int)((double)(var6 + 160) + 160.0 * Math.sin(var10_double + (double)pa.field_d * 0.03));
                                            var8 = (int)(160.0 * Math.cos(0.03 * (double)pa.field_d + var10_double) + 240.0);
                                            var9[2].a(128, 0, var8, var7, -1271909436);
                                            var7 = (int)(176.0 * Math.sin(-((double)pa.field_d * 0.02) + var10_double) + (double)(var6 - -160));
                                            var8 = (int)(Math.cos(var10_double - (double)pa.field_d * 0.02) * 176.0 + 240.0);
                                            var9[1].a(128, 0, var8, var7, -1271909436);
                                            var7 = (int)(Math.sin(var10_double + (double)pa.field_d * 0.01) * 192.0 + (double)(var6 - -160));
                                            var8 = (int)(192.0 * Math.cos(var10_double + (double)pa.field_d * 0.01) + 240.0);
                                            var9[0].a(128, 0, var8, var7, -1271909436);
                                            var10_double = var10_double + 0.314;
                                            if (var12 != 0) {
                                              break L43;
                                            } else {
                                              if (var12 == 0) {
                                                continue L41;
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                        }
                                        if ((pl.field_h ^ -1) != -1) {
                                          break L43;
                                        } else {
                                          var10 = 140;
                                          param3 -= 15;
                                          break L42;
                                        }
                                      }
                                      var10 = 300;
                                      param3 -= 27;
                                      break L42;
                                    }
                                    L45: {
                                      discarded$15 = ce.field_d.a(ug.field_b, param2 + (-(var10 / 2) + -1), param3, var10, 35, 6776679, -1, 1, 0, 16);
                                      discarded$16 = ce.field_d.a(ug.field_b, param2 + (-(var10 / 2) - -1), param3, var10, 35, 6776679, -1, 1, 0, 16);
                                      discarded$17 = ce.field_d.a(ug.field_b, -(var10 / 2) + param2, param3 - 1, var10, 35, 6776679, -1, 1, 0, 16);
                                      discarded$18 = ce.field_d.a(ug.field_b, param2 + -(var10 / 2), 1 + param3, var10, 35, 6776679, -1, 1, 0, 16);
                                      discarded$19 = ce.field_d.a(ug.field_b, param2 + -(var10 / 2), param3, var10, 35, 16159517, 1, 1, 0, 16);
                                      stackOut_214_0 = -7;
                                      stackIn_217_0 = stackOut_214_0;
                                      stackIn_215_0 = stackOut_214_0;
                                      if (param1) {
                                        stackOut_217_0 = stackIn_217_0;
                                        stackOut_217_1 = 0;
                                        stackIn_218_0 = stackOut_217_0;
                                        stackIn_218_1 = stackOut_217_1;
                                        break L45;
                                      } else {
                                        stackOut_215_0 = stackIn_215_0;
                                        stackOut_215_1 = 1;
                                        stackIn_218_0 = stackOut_215_0;
                                        stackIn_218_1 = stackOut_215_1;
                                        break L45;
                                      }
                                    }
                                    L46: {
                                      L47: {
                                        if (stackIn_218_0 == (ne.a(stackIn_218_1 != 0) ^ -1)) {
                                          break L47;
                                        } else {
                                          if (3 == ne.a(false)) {
                                            break L47;
                                          } else {
                                            if (2 == ne.a(false)) {
                                              break L47;
                                            } else {
                                              L48: {
                                                stackOut_225_0 = -2;
                                                stackIn_230_0 = stackOut_225_0;
                                                stackIn_226_0 = stackOut_225_0;
                                                if (param1) {
                                                  stackOut_230_0 = stackIn_230_0;
                                                  stackOut_230_1 = 0;
                                                  stackIn_231_0 = stackOut_230_0;
                                                  stackIn_231_1 = stackOut_230_1;
                                                  break L48;
                                                } else {
                                                  stackOut_226_0 = stackIn_226_0;
                                                  stackIn_228_0 = stackOut_226_0;
                                                  stackOut_228_0 = stackIn_228_0;
                                                  stackOut_228_1 = 1;
                                                  stackIn_231_0 = stackOut_228_0;
                                                  stackIn_231_1 = stackOut_228_1;
                                                  break L48;
                                                }
                                              }
                                              if (stackIn_231_0 != (ne.a(stackIn_231_1 != 0) ^ -1)) {
                                                break L46;
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      fn.a(14, 241, 3);
                                      fn.a(15, 240, 3);
                                      fn.a(16, 239, 3);
                                      fn.a(17, 238, 3);
                                      if (-4000001 < (a.field_c ^ -1)) {
                                        break L46;
                                      } else {
                                        fn.a(25, 230, 3);
                                        break L46;
                                      }
                                    }
                                    if (var12 == 0) {
                                      break L1;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                              }
                              L49: {
                                ce.field_d.b(bd.field_a, param2, param3, param0, -1);
                                var5_array[8].b(var6, 0);
                                if (ne.a(false) == 6) {
                                  break L49;
                                } else {
                                  L50: {
                                    if (param1) {
                                      stackOut_246_0 = 0;
                                      stackIn_247_0 = stackOut_246_0;
                                      break L50;
                                    } else {
                                      stackOut_244_0 = 1;
                                      stackIn_247_0 = stackOut_244_0;
                                      break L50;
                                    }
                                  }
                                  if ((ne.a(stackIn_247_0 != 0) ^ -1) == -4) {
                                    break L49;
                                  } else {
                                    if ((ne.a(false) ^ -1) == -3) {
                                      break L49;
                                    } else {
                                      if (ne.a(false) != 1) {
                                        break L1;
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                }
                              }
                              fn.a(14, 241, 3);
                              fn.a(15, 240, 3);
                              fn.a(16, 239, 3);
                              if (var12 == 0) {
                                break L1;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L51: {
                            ce.field_d.b(ti.field_L, param2, param3, param0, -1);
                            var5_array[6].b(var6, 0);
                            if (-7 == (ne.a(false) ^ -1)) {
                              break L51;
                            } else {
                              if (ne.a(false) == 3) {
                                break L51;
                              } else {
                                if (ne.a(false) == 2) {
                                  break L51;
                                } else {
                                  if (ne.a(false) == 1) {
                                    break L51;
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                          fn.a(14, 241, 3);
                          if (var12 == 0) {
                            break L1;
                          } else {
                            break L35;
                          }
                        }
                      }
                      ce.field_d.b(bh.field_ab, param2, param3, param0, -1);
                      var5_array[4].b(var6, 0);
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L34;
                      }
                    }
                  }
                  ce.field_d.b(ca.field_j, param2, param3, param0, -1);
                  var5_array[3].b(var6, 0);
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
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5), "MinerDisturbance.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            gi.a(0);
            df.a((byte) 125);
            im.a(param0 ^ 6777);
            m.f(-1);
            kh.a(true);
            eh.c();
            kk.a((byte) 75);
            bj.c((byte) -125);
            we.a();
            di.a((byte) 98);
            eb.b((byte) 127);
            ab.b(-14839);
            ii.a((byte) 105);
            qa.a((byte) -61);
            nd.a(111);
            kd.c(94);
            en.a(10);
            ob.o(124);
            tj.a(false);
            ge.a(111);
            el.a(2);
            gn.a(param0 + 28807);
            of.a(-60);
            lg.a((byte) 76);
            ja.f(param0 ^ 151);
            bf.a(param0 ^ 49);
            wd.a(param0 + -98);
            sb.l(109);
            db.a((byte) 84);
            lf.a(false);
            oe.b((byte) 124);
            de.a((byte) 34);
            fi.a((byte) 125);
            sf.a(param0 + 8191);
            rd.a((byte) 69);
            fa.a(26686);
            dg.b((byte) 83);
            kf.a(42959);
            md.a(98);
            id.b(8192);
            pa.a(param0 ^ 2);
            fb.a(true);
            ek.a((byte) 19);
            ci.b(0);
            dm.a(20583);
            l.a((byte) 79);
            pl.e(-26537);
            mc.a((byte) -43);
            gf.a(param0 ^ -114);
            je.c();
            ie.b(5);
            pi.d(2);
            ta.d((byte) -113);
            dh.a(-123);
            in.a(param0 ^ 14913);
            kb.a((byte) 60);
            rb.a(-2004317953);
            ak.a(false);
            q.a(20);
            cg.a(param0 ^ 1);
            nl.b();
            gd.a((byte) -114);
            ri.b((byte) -25);
            fj.d();
            vd.e(98);
            qk.a(-1003);
            ch.c(-104);
            nm.a(false);
            bk.b((byte) -113);
            me.b((byte) -83);
            ll.b((byte) -121);
            ha.a((byte) 28);
            d.a((byte) 109);
            h.b(true);
            nn.a(true);
            ig.b(119);
            hm.c((byte) 112);
            uk.j((byte) -42);
            jl.h((byte) 126);
            rg.r(param0 ^ 28777);
            ik.p(120);
            qd.a(true);
            cl.o(20);
            lm.f((byte) -106);
            pf.a(-1);
            vi.a(-1);
            dl.a((byte) -118);
            g.b(16704);
            pd.a((byte) 117);
            vb.a(-7672);
            kl.a(true);
            dk.b(param0 + 96);
            sc.a(5565);
            ec.a(-65);
            hn.a(param0 + -1);
            ld.d(false);
            c.b((byte) -73);
            wm.a(param0 + -8);
            ql.b(0);
            pk.a(-94);
            al.a(-483);
            hd.a((byte) 123);
            u.c(33);
            ml.a((byte) 119);
            kj.b(false);
            he.a((byte) -124);
            cm.a(param0 + 17);
            fh.a(param0 ^ -12662);
            ff.a(-12);
            tf.a(24044);
            hi.a(true);
            uf.f(param0 ^ 201);
            wa.e(112);
            ee.h(256);
            uh.a((byte) -116);
            vl.i(param0 + 125);
            ij.a(true);
            an.a(param0);
            si.b((byte) -128);
            kc.a(param0 ^ 16575);
            em.b((byte) -86);
            mf.c((byte) 81);
            dc.a((byte) -22);
            nj.a(-109);
            ni.a((byte) -112);
            va.a();
            cn.a(param0 + -129);
            qf.a(param0 + -28582);
            vc.e(param0 + 105);
            ng.a(-1);
            j.a(90);
            rf.a((byte) -56);
            eg.c(-7709);
            ck.a((byte) -100);
            mk.a((byte) -91);
            on.d(-112);
            qg.a(0);
            fl.a(-1);
            hh.b(-125);
            fe.l(-95);
            jc.a(0);
            cc.e((byte) 15);
            nf.a(false);
            am.n(43);
            ke.s(-125);
            ui.q(param0 ^ -2);
            kn.d((byte) -15);
            jk.h((byte) -36);
            wf.g((byte) 87);
            oi.a((byte) 91);
            ei.o(-2638);
            tn.a(param0 + -3);
            qn.a((byte) 84);
            w.m(256);
            ti.c((byte) -53);
            cb.d(false);
            ol.a(1);
            ba.a((byte) 54);
            gm.a(-20);
            dj.c();
            td.a(false);
            bh.i((byte) 102);
            b.b();
            ud.a(-105);
            pb.c(-98);
            ef.a((byte) 102);
            ce.b(14480);
            mb.a(30520);
            ah.a(true);
            qe.a((byte) 104);
            fd.g(param0 + -258);
            om.b(param0 + -1);
            gl.a(-2869);
            km.a(true);
            pg.a();
            wk.a(true);
            ra.a(-124);
            hb.a(-105);
            hk.d(127);
            bb.a(-4);
            ul.a((byte) 14);
            sn.b((byte) -18);
            a.a(0);
            jh.a((byte) 39);
            pm.a(92);
            ca.b(param0 ^ 11);
            vj.d(16711680);
            o.a(param0 + -23642);
            vk.a(119);
            tm.a((byte) -107);
            ve.a();
            qm.b(-31434);
            s.m(param0 + -117);
            ne.a(2);
            nh.a((byte) -76);
            la.a();
            lj.a((byte) -69);
            t.b(param0 + -1);
            bm.d(0);
            aa.a((byte) -123);
            ma.n(27934);
            se.n(-13673);
            ph.a(0);
            bg.a(15917);
            sd.a(-1);
            qc.b(2207);
            bl.b((byte) 79);
            oh.i(-116);
            ic.b(29);
            gb.a(-102);
            bc.a(35);
            sl.a(param0 ^ -3036);
            jf.a((byte) -63);
            ae.a((byte) -67);
            jn.e(111);
            af.a(param0 + -12708);
            hf.a(-16935);
            bd.a((byte) 126);
            ed.c(-20613);
            lc.a(param0 + -52);
            wb.a(param0 ^ 1);
            fg.a(-114);
            sa.a(42);
            re.a(-10887);
            mh.a(-115);
            tb.a(127);
            tk.a(8225);
            ug.b((byte) 45);
            i.b((byte) -57);
            le.a(-9392);
            rj.a(3);
            pn.a(param0 ^ 16777214);
            sk.b(true);
            hl.b(false);
            wc.b(0);
            ka.a(param0 + 2);
            ib.a(1);
            vh.b(3);
            pj.a(param0 ^ 3);
            te.b(31960);
            v.b((byte) -44);
            bn.a(160);
            mm.a(param0 ^ 0);
            aj.b(param0 + 113);
            ub.b(76);
            li.b((byte) -90);
            wi.a((byte) -9);
            nc.a(param0 + -117);
            gk.a((byte) -61);
            mn.d(42);
            qh.a((byte) 110);
            oj.n(65536);
            pe.b((byte) -30);
            mj.a((byte) -118);
            hj.a(false);
            dn.b((byte) -100);
            nk.a(0);
            fm.e((byte) -123);
            sj.a((byte) 22);
            pc.d(12);
            tl.c((byte) -121);
            oc.e(-640);
            fn.a((byte) -96);
            th.a(-15649);
            tc.a((byte) -91);
            nb.a(19);
            mg.a(125);
            e.f(param0 + -2);
            od.f(4);
            wj.f(-27836);
            jg.b((byte) 23);
            gh.a(68);
            lb.a(param0 ^ 1);
            ag.a(false);
            ok.d(param0 + 1626);
            r.b((byte) 125);
            jb.a(110);
            il.a(-128);
            gj.a(param0 ^ 29749);
            this.field_s = null;
            this.field_L = null;
            this.field_Q = null;
            this.field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.EA(" + param0 + ')');
        }
    }

    private final void y(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!ag.field_c) {
                break L1;
              } else {
                if (!d.field_b) {
                  break L1;
                } else {
                  if (this.field_K) {
                    break L1;
                  } else {
                    L2: {
                      var2_int = bl.g(param0 ^ 1) ? 1 : 0;
                      if (var2_int != 0) {
                        break L2;
                      } else {
                        if (qe.field_b[5]) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                    L3: {
                      var5 = 0;
                      var6 = 0;
                      if ((lj.field_r ^ -1) < -1) {
                        L4: {
                          var5 = (int)((Math.random() * (double)lj.field_r - (double)(lj.field_r / 2)) / 20.0);
                          if (-17 > (var5 ^ -1)) {
                            var5 = 16;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          var6 = (int)((Math.random() * (double)lj.field_r - (double)(lj.field_r / 2)) / 40.0);
                          if (15 >= (var5 ^ -1)) {
                            break L5;
                          } else {
                            var5 = -16;
                            break L5;
                          }
                        }
                        L6: {
                          if (16 < var6) {
                            var6 = 16;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (var6 < -16) {
                          var6 = -16;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L7: {
                      var4 = -db.field_d + hf.field_t * 32;
                      var3 = -li.field_c + ca.field_k * 32;
                      var4 = -4 + var4 - -(var6 >> 1684186721);
                      var3 = (var5 >> -489140127) + var3 + -4;
                      var9 = (int)(80.0 * Math.sin(0.1 * (double)fb.field_f) + 100.0);
                      var10 = 4281405;
                      if (var2_int == 0) {
                        break L7;
                      } else {
                        if (mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_b) {
                          break L7;
                        } else {
                          if (!mh.field_e[-1 + ca.field_k][hf.field_t + -1].field_a) {
                            break L7;
                          } else {
                            L8: {
                              if (!mh.field_e[ca.field_k + -1][hf.field_t].field_a) {
                                break L8;
                              } else {
                                if (mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var8 = var4 - 32;
                            var7 = var3 + -32;
                            eh.b(var7, var8, 32, 32, var10, var9);
                            eh.a(var7, var8, 32, 32, var10);
                            ef.field_b[0].f(var7, var8);
                            break L7;
                          }
                        }
                      }
                    }
                    L9: {
                      if (var2_int == 0) {
                        break L9;
                      } else {
                        if (mh.field_e[ca.field_k][hf.field_t - 1].field_b) {
                          break L9;
                        } else {
                          if (!mh.field_e[ca.field_k][hf.field_t + -1].field_a) {
                            break L9;
                          } else {
                            var7 = var3;
                            var8 = var4 + -32;
                            eh.b(var7, var8, 32, 32, var10, var9);
                            eh.a(var7, var8, 32, 32, var10);
                            ef.field_b[1].f(var7, var8);
                            break L9;
                          }
                        }
                      }
                    }
                    L10: {
                      if (var2_int == 0) {
                        break L10;
                      } else {
                        if (mh.field_e[ca.field_k + 1][hf.field_t + -1].field_b) {
                          break L10;
                        } else {
                          if (!mh.field_e[1 + ca.field_k][-1 + hf.field_t].field_a) {
                            break L10;
                          } else {
                            L11: {
                              if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                                break L11;
                              } else {
                                if (mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var8 = -32 + var4;
                            var7 = 32 + var3;
                            eh.b(var7, var8, 32, 32, var10, var9);
                            eh.a(var7, var8, 32, 32, var10);
                            ef.field_b[2].f(var7, var8);
                            break L10;
                          }
                        }
                      }
                    }
                    L12: {
                      if (mh.field_e[param0 + ca.field_k][hf.field_t].field_b) {
                        break L12;
                      } else {
                        if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                          break L12;
                        } else {
                          var8 = var4;
                          var7 = var3 - -32;
                          eh.b(var7, var8, 32, 32, var10, var9);
                          eh.a(var7, var8, 32, 32, var10);
                          ef.field_b[3].f(var7 - -(ef.field_b[3].field_x >> 349451426), var8 - -(ef.field_b[3].field_A >> -417957118));
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (var2_int == 0) {
                        break L13;
                      } else {
                        if (mh.field_e[1 + ca.field_k][1 + hf.field_t].field_b) {
                          break L13;
                        } else {
                          if (!mh.field_e[ca.field_k - -1][hf.field_t - -1].field_a) {
                            break L13;
                          } else {
                            L14: {
                              if (!mh.field_e[ca.field_k - -1][hf.field_t].field_a) {
                                break L14;
                              } else {
                                if (!mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                                  break L14;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var8 = 32 + var4;
                            var7 = 32 + var3;
                            eh.b(var7, var8, 32, 32, var10, var9);
                            eh.a(var7, var8, 32, 32, var10);
                            ef.field_b[4].f(var7, var8);
                            break L13;
                          }
                        }
                      }
                    }
                    L15: {
                      if (var2_int == 0) {
                        break L15;
                      } else {
                        if (mh.field_e[ca.field_k][1 + hf.field_t].field_b) {
                          break L15;
                        } else {
                          if (mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                            var8 = 32 + var4;
                            var7 = var3;
                            eh.b(var7, var8, 32, 32, var10, var9);
                            eh.a(var7, var8, 32, 32, var10);
                            ef.field_b[5].f(var7, var8);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    L16: {
                      if (var2_int == 0) {
                        break L16;
                      } else {
                        if (mh.field_e[ca.field_k - 1][hf.field_t + 1].field_b) {
                          break L16;
                        } else {
                          if (!mh.field_e[ca.field_k + -1][1 + hf.field_t].field_a) {
                            break L16;
                          } else {
                            L17: {
                              if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                                break L17;
                              } else {
                                if (mh.field_e[ca.field_k][1 + hf.field_t].field_a) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            var7 = var3 - 32;
                            var8 = var4 - -32;
                            eh.b(var7, var8, 32, 32, var10, var9);
                            eh.a(var7, var8, 32, 32, var10);
                            ef.field_b[6].f(var7, var8);
                            break L16;
                          }
                        }
                      }
                    }
                    L18: {
                      if (mh.field_e[ca.field_k - 1][hf.field_t].field_b) {
                        break L18;
                      } else {
                        if (!mh.field_e[ca.field_k + -1][hf.field_t].field_a) {
                          break L18;
                        } else {
                          var8 = var4;
                          var7 = var3 - 32;
                          eh.b(var7, var8, 32, 32, var10, var9);
                          eh.a(var7, var8, 32, 32, var10);
                          ef.field_b[7].f(var7, var8);
                          break L18;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.CB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void d(boolean param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var8_ref_String = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10 = null;
        int var10_int = 0;
        int[] var10_array = null;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_134_0 = 0;
        Object stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        Object stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        Object stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        int stackIn_189_2 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        Object stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        Object stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        int stackOut_188_2 = 0;
        Object stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        var15 = field_ab;
        try {
          L0: {
            L1: {
              if (128 > di.field_Z) {
                L2: {
                  if (di.field_Z < 64) {
                    var2_int = 255 + -(di.field_Z * 4);
                    mc.field_u.f(0, 0, var2_int);
                    fh.field_e.f(7, 0, var2_int);
                    mh.field_d.f(628, 0, var2_int);
                    ei.field_M.f(7, 472, var2_int);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var2_int = 640 * di.field_Z / 64;
                eh.a(0, 0, var2_int, 480);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              L4: {
                var2_int = 73;
                var3 = 245;
                var4 = 70;
                var5 = ce.field_d.field_E + ce.field_d.field_I;
                if (0 == pl.field_h) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      nn.field_h[cm.field_o].f(0, 0);
                      if (-1 < (this.field_T ^ -1)) {
                        break L6;
                      } else {
                        if ((this.field_T ^ -1) >= (-1 + sl.field_u[pl.field_h].length ^ -1)) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
                    break L5;
                  }
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        L18: {
                                          L19: {
                                            L20: {
                                              L21: {
                                                L22: {
                                                  L23: {
                                                    var8_ref_String = sl.field_u[pl.field_h][this.field_T];
                                                    sb.field_n.field_T[0][wd.field_e] = 4408131;
                                                    sb.field_n.field_T[0][bi.field_p] = 0;
                                                    sb.field_n.field_T[0][re.field_b] = 14540253;
                                                    var10_int = pl.field_h;
                                                    if (-5 == (var10_int ^ -1)) {
                                                      break L23;
                                                    } else {
                                                      if (-2 == (var10_int ^ -1)) {
                                                        break L22;
                                                      } else {
                                                        L24: {
                                                          if ((var10_int ^ -1) != -8) {
                                                            break L24;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        L25: {
                                                          if (10 != var10_int) {
                                                            break L25;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L20;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        L26: {
                                                          if (var10_int != 5) {
                                                            break L26;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L19;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                        }
                                                        L27: {
                                                          if ((var10_int ^ -1) != -14) {
                                                            break L27;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L18;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        L28: {
                                                          if (var10_int != 3) {
                                                            break L28;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L17;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        L29: {
                                                          if (var10_int != 2) {
                                                            break L29;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L16;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                        L30: {
                                                          if (var10_int != 6) {
                                                            break L30;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L15;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        if (0 == var10_int) {
                                                          break L14;
                                                        } else {
                                                          if (var10_int == 8) {
                                                            break L13;
                                                          } else {
                                                            L31: {
                                                              if (-10 != (var10_int ^ -1)) {
                                                                break L31;
                                                              } else {
                                                                if (var15 == 0) {
                                                                  break L12;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                            if (-12 == (var10_int ^ -1)) {
                                                              break L11;
                                                            } else {
                                                              if (var10_int == 12) {
                                                                break L10;
                                                              } else {
                                                                if (14 != var10_int) {
                                                                  break L8;
                                                                } else {
                                                                  if (var15 == 0) {
                                                                    break L9;
                                                                  } else {
                                                                    break L23;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var9_ref_String = nc.field_b;
                                                  if (var15 == 0) {
                                                    break L7;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                                var9_ref_String = jg.field_k;
                                                if (var15 == 0) {
                                                  break L7;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              var9_ref_String = r.field_b;
                                              if (var15 == 0) {
                                                break L7;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            var9_ref_String = rd.field_d;
                                            if (var15 == 0) {
                                              break L7;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          var9_ref_String = hf.field_s;
                                          if (var15 == 0) {
                                            break L7;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var9_ref_String = mg.field_c;
                                        if (var15 == 0) {
                                          break L7;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      var9_ref_String = pb.field_z;
                                      if (var15 == 0) {
                                        break L7;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var9_ref_String = df.field_c;
                                    if (var15 == 0) {
                                      break L7;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  var9_ref_String = hh.field_d;
                                  if (var15 == 0) {
                                    break L7;
                                  } else {
                                    break L14;
                                  }
                                }
                                var9_ref_String = ok.field_a;
                                if (var15 == 0) {
                                  break L7;
                                } else {
                                  break L13;
                                }
                              }
                              var9_ref_String = dh.field_a;
                              if (var15 == 0) {
                                break L7;
                              } else {
                                break L12;
                              }
                            }
                            var9_ref_String = vk.field_d;
                            if (var15 == 0) {
                              break L7;
                            } else {
                              break L11;
                            }
                          }
                          var9_ref_String = jl.field_bb;
                          if (var15 == 0) {
                            break L7;
                          } else {
                            break L10;
                          }
                        }
                        var9_ref_String = hl.field_c;
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                      var9_ref_String = nd.field_a;
                      if (var15 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                    var9_ref_String = mc.field_z;
                    break L7;
                  }
                  L32: {
                    var4 -= 10;
                    var4 = var4 + ce.field_d.a(var9_ref_String, 100, var4, 130, 480, 16777215, 6710886, 1, 0, var5) * var5;
                    var4 += 10;
                    var10 = ti.field_J;
                    if (var10 == null) {
                      var10 = lj.field_s;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  L33: {
                    L34: {
                      discarded$4 = sb.field_n.a(we.a(sb.field_n, var10, 170), -80 + (nn.field_h[cm.field_o].field_x >> 1017202177), var4, 160, sb.field_n.field_E + sb.field_n.field_I, 0, -1, 1, 0, 0);
                      var4 += 40;
                      var7 = 175;
                      discarded$5 = ce.field_d.a(var8_ref_String, var2_int, var4, var3 - var2_int, var5 * 3, 16777215, 6710886, 1, 1, var5);
                      var6 = 70;
                      var11 = var6;
                      var12 = var7;
                      if (-2 != (cm.field_o ^ -1)) {
                        break L34;
                      } else {
                        var13 = 28;
                        var12 += 8;
                        var11 -= 6;
                        if (1 < ne.a(param0)) {
                          var13 = 26;
                          if (var15 == 0) {
                            break L33;
                          } else {
                            break L34;
                          }
                        } else {
                          break L33;
                        }
                      }
                    }
                    var13 = 32;
                    break L33;
                  }
                  L35: {
                    mb.field_d[0].f(var11, var12);
                    var14 = 12566463;
                    ce.field_d.a(oa.a((byte) -112, uh.field_c, new String[]{Integer.toString(nm.field_g[0]), Integer.toString(nm.field_g[0] * 100)}), 32 + var6, 30 + var7, var14, -1);
                    var12 = var12 + var13;
                    var7 = var7 + var13;
                    var14 = 13619151;
                    mb.field_d[1].f(var11, var12);
                    ce.field_d.a(oa.a((byte) -93, gd.field_A, new String[]{Integer.toString(nm.field_g[1]), Integer.toString(nm.field_g[1] * 250)}), var6 - -32, var7 - -30, var14, -1);
                    var7 = var7 + var13;
                    var12 = var12 + var13;
                    var14 = 14671839;
                    mb.field_d[2].f(var11, var12);
                    ce.field_d.a(oa.a((byte) -116, ge.field_h, new String[]{Integer.toString(nm.field_g[2]), Integer.toString(nm.field_g[2] * 500)}), var6 + 32, 30 + var7, var14, -1);
                    var7 = var7 + var13;
                    var12 = var12 + var13;
                    var14 = 15724527;
                    mb.field_d[3].f(var11, var12);
                    ce.field_d.a(oa.a((byte) -120, fl.field_h, new String[]{Integer.toString(nm.field_g[3]), Integer.toString(nm.field_g[3] * 750)}), var6 - -32, var7 + 30, var14, -1);
                    if (-2 == (cm.field_o ^ -1)) {
                      L36: {
                        var12 = var12 + var13;
                        var7 = var7 + var13;
                        var14 = 15724527;
                        mb.field_d[5].f(var11, var12);
                        if (-1 != (pl.field_h ^ -1)) {
                          break L36;
                        } else {
                          var14 = 3092271;
                          break L36;
                        }
                      }
                      ce.field_d.a(oa.a((byte) -118, nn.field_a, new String[]{Integer.toString(nm.field_g[5]), Integer.toString(1000 * nm.field_g[5])}), 32 + var6, var7 - -30, var14, -1);
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  var7 = var7 + var13;
                  var12 = var12 + var13;
                  mb.field_d[4].f(var11, var12);
                  var14 = 16777215;
                  ce.field_d.a(oa.a((byte) -91, bl.field_u, new String[]{Integer.toString(nm.field_g[4]), Integer.toString(2500 * nm.field_g[4])}), 32 + var6, var7 - -30, var14, -1);
                  var7 += 32;
                  var7 = 0;
                  var6 = nn.field_h[cm.field_o].field_x >> -1056146303;
                  if (var15 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L37: {
                L38: {
                  g.a(30, 420, 15, 360, (byte) 113, qf.field_o[cm.field_o]);
                  var8 = 75;
                  dl.field_d[cm.field_o].f(60, var8);
                  dl.field_d[cm.field_o].b(60, 285);
                  dl.field_d[cm.field_o].h(270, var8);
                  dl.field_d[cm.field_o].d();
                  dl.field_d[cm.field_o].h(270, 285);
                  var2_int = 100;
                  var3 = 295;
                  dl.field_d[cm.field_o].d();
                  if (0 > this.field_T) {
                    break L38;
                  } else {
                    if (this.field_T > sl.field_u[pl.field_h].length - 1) {
                      break L38;
                    } else {
                      break L37;
                    }
                  }
                }
                this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
                break L37;
              }
              L39: {
                var9_ref_String = sl.field_u[pl.field_h][this.field_T];
                sb.field_n.field_T[0][wd.field_e] = 9737364;
                sb.field_n.field_T[0][bi.field_p] = 0;
                sb.field_n.field_T[0][re.field_b] = 12892208;
                var10 = ti.field_J;
                if (var10 != null) {
                  break L39;
                } else {
                  var10 = qf.field_q;
                  break L39;
                }
              }
              L40: {
                if (-1000001 < (a.field_c ^ -1)) {
                  stackOut_133_0 = 0;
                  stackIn_134_0 = stackOut_133_0;
                  break L40;
                } else {
                  stackOut_131_0 = 30;
                  stackIn_134_0 = stackOut_131_0;
                  break L40;
                }
              }
              L41: {
                var11 = stackIn_134_0;
                sb.field_n.b(var10, 195, 112 - -var11, 0, -1);
                discarded$6 = ce.field_d.a(var9_ref_String, var2_int, var11 + 137, -var2_int + var3, 50, 12584192, 6710886, 1, 1, var5);
                var12_ref_String = ok.field_a;
                var6 = 100;
                discarded$7 = ce.field_d.a(var12_ref_String, 40, var11 + -ce.field_d.field_E + (var4 + -ce.field_d.field_I - -70), 310, 20, 0, 16777215, 1, 0, -1);
                var7 = var11 + 175;
                var13 = 32;
                if (1 != cm.field_o) {
                  break L41;
                } else {
                  var13 = 28;
                  break L41;
                }
              }
              L42: {
                vl.field_E.f(var6, 15 + var7);
                var14 = 12566463;
                if (pl.field_h != 0) {
                  break L42;
                } else {
                  var14 = 10526880;
                  break L42;
                }
              }
              L43: {
                ce.field_d.a(oa.a((byte) -78, uh.field_c, new String[]{Integer.toString(nm.field_g[0]), Integer.toString(100 * nm.field_g[0])}), var6 - -32, 30 + var7, var14, -1);
                var7 = var7 + var13;
                var14 = 13619151;
                em.field_y.f(var6, 15 + var7);
                if (pl.field_h != 0) {
                  break L43;
                } else {
                  var14 = 9408399;
                  break L43;
                }
              }
              L44: {
                ce.field_d.a(oa.a((byte) -109, gd.field_A, new String[]{Integer.toString(nm.field_g[1]), Integer.toString(nm.field_g[1] * 250)}), var6 + 32, 30 + var7, var14, -1);
                var7 = var7 + var13;
                sn.field_a.f(var6, 15 + var7);
                var14 = 14671839;
                if (0 != pl.field_h) {
                  break L44;
                } else {
                  var14 = 5197647;
                  break L44;
                }
              }
              L45: {
                ce.field_d.a(oa.a((byte) -80, ge.field_h, new String[]{Integer.toString(nm.field_g[2]), Integer.toString(500 * nm.field_g[2])}), var6 + 32, var7 + 30, var14, -1);
                var7 = var7 + var13;
                var14 = 15724527;
                di.field_ab.f(var6, 17 + var7);
                if (pl.field_h != 0) {
                  break L45;
                } else {
                  var14 = 3092271;
                  break L45;
                }
              }
              L46: {
                ce.field_d.a(oa.a((byte) -115, fl.field_h, new String[]{Integer.toString(nm.field_g[3]), Integer.toString(750 * nm.field_g[3])}), 32 + var6, 30 + var7, var14, -1);
                var7 = var7 + var13;
                if (1 != cm.field_o) {
                  break L46;
                } else {
                  L47: {
                    var14 = 15724527;
                    mb.field_d[5].f(-6 + var6, 6 + var7);
                    if (-1 != (pl.field_h ^ -1)) {
                      break L47;
                    } else {
                      var14 = 3092271;
                      break L47;
                    }
                  }
                  ce.field_d.a(oa.a((byte) -80, nn.field_a, new String[]{Integer.toString(nm.field_g[5]), Integer.toString(1000 * nm.field_g[5])}), 32 + var6, var7 + 30, var14, -1);
                  var7 = var7 + var13;
                  break L46;
                }
              }
              L48: {
                vh.field_c.f(var6, var7 - -15);
                var14 = 16777215;
                if (-1 != (pl.field_h ^ -1)) {
                  break L48;
                } else {
                  var14 = 0;
                  break L48;
                }
              }
              ce.field_d.a(oa.a((byte) -110, bl.field_u, new String[]{Integer.toString(nm.field_g[4]), Integer.toString(2500 * nm.field_g[4])}), var6 - -32, 30 + var7, var14, -1);
              var7 = 0;
              var6 = 195;
              break L3;
            }
            L49: {
              if (-2 <= (ne.a(param0) ^ -1)) {
                break L49;
              } else {
                L50: {
                  if (-1 != (pl.field_h ^ -1)) {
                    break L50;
                  } else {
                    L51: {
                      var8 = 360;
                      if (a.field_c >= 1000000) {
                        var8 = 380;
                        break L51;
                      } else {
                        break L51;
                      }
                    }
                    L52: {
                      if (-2 != (cm.field_o ^ -1)) {
                        break L52;
                      } else {
                        var8 += 5;
                        break L52;
                      }
                    }
                    ce.field_d.b(oa.a((byte) -94, uh.field_f, new String[]{Integer.toString(ne.a(false))}), var6, var8, 0, -1);
                    if (var15 == 0) {
                      break L49;
                    } else {
                      break L50;
                    }
                  }
                }
                ce.field_d.b(oa.a((byte) -91, uh.field_f, new String[]{Integer.toString(ne.a(param0))}), var6, 360, 16776960, -1);
                break L49;
              }
            }
            L53: {
              if (0 != pl.field_h) {
                break L53;
              } else {
                L54: {
                  var8 = 386;
                  if ((a.field_c ^ -1) > -1000001) {
                    break L54;
                  } else {
                    var8 = 400;
                    break L54;
                  }
                }
                ce.field_d.b(an.field_g, var6, var8, 0, -1);
                break L53;
              }
            }
            L55: {
              var8 = 16776960;
              if (-1 == (pl.field_h ^ -1)) {
                var8 = 12584192;
                var7 = 80;
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var7 = 408;
              var9 = var7;
              if (1000000 <= a.field_c) {
                var9 += 10;
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              ce.field_d.b(oa.a((byte) -83, km.field_c, new String[]{Integer.toString(a.field_c)}), var6, var9, var8, -1);
              var7 += 32;
              var7 = 462;
              var6 = nn.field_h[cm.field_o].field_x >> 786266273;
              if (-1 != (pl.field_h ^ -1)) {
                break L57;
              } else {
                var7 = 80;
                var6 = 195;
                var10_array = new int[4];
                eh.b(var10_array);
                eh.f(40, 54, 350, 426);
                var11 = Math.abs(nk.field_w - 320) / 2;
                var12 = 0;
                L58: while (true) {
                  L59: {
                    if (307 <= var12) {
                      break L59;
                    } else {
                      eh.g(var11 + 40 + var12, 450 - var12, 10, 16777215, 140);
                      eh.g(var11 + 60 + var12, 450 + -var12, 40, 16777215, 140);
                      eh.g(var11 + 107 - -var12, -var12 + 450, 30, 16777215, 140);
                      eh.g(var11 + var12 + 152, 450 + -var12, 6, 16777215, 140);
                      var12++;
                      if (var15 != 0) {
                        break L57;
                      } else {
                        if (var15 == 0) {
                          continue L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                  }
                  eh.a(var10_array);
                  break L57;
                }
              }
            }
            L60: {
              stackOut_185_0 = this;
              stackOut_185_1 = var8;
              stackIn_188_0 = stackOut_185_0;
              stackIn_188_1 = stackOut_185_1;
              stackIn_186_0 = stackOut_185_0;
              stackIn_186_1 = stackOut_185_1;
              if (param0) {
                stackOut_188_0 = this;
                stackOut_188_1 = stackIn_188_1;
                stackOut_188_2 = 0;
                stackIn_189_0 = stackOut_188_0;
                stackIn_189_1 = stackOut_188_1;
                stackIn_189_2 = stackOut_188_2;
                break L60;
              } else {
                stackOut_186_0 = this;
                stackOut_186_1 = stackIn_186_1;
                stackOut_186_2 = 1;
                stackIn_189_0 = stackOut_186_0;
                stackIn_189_1 = stackOut_186_1;
                stackIn_189_2 = stackOut_186_2;
                break L60;
              }
            }
            L61: {
              this.a(stackIn_189_1, stackIn_189_2 != 0, var6, var7);
              if (64 < di.field_Z) {
                L62: {
                  var10 = mg.field_g;
                  var11 = 400;
                  var12 = 408;
                  mm.field_a.a(var10, -2 + var11, var12 + pk.field_b.field_I, 4, 8218369);
                  mm.field_a.a(var10, var11 - -2, pk.field_b.field_I + var12, 4, 8218369);
                  mm.field_a.a(var10, var11, pk.field_b.field_I + var12 + -2, 4, 8218369);
                  mm.field_a.a(var10, var11, 2 + pk.field_b.field_I + var12, 4, 8218369);
                  mm.field_a.a(var10, -1 + var11, -1 + var12 + pk.field_b.field_I, 4, 8218369);
                  mm.field_a.a(var10, var11 - -1, var12 - (-pk.field_b.field_I - -1), 4, 8218369);
                  mm.field_a.a(var10, -1 + var11, 1 + (pk.field_b.field_I + var12), 4, 8218369);
                  mm.field_a.a(var10, var11 - -1, var12 - (-pk.field_b.field_I - 1), 4, 8218369);
                  if (!of.field_a) {
                    break L62;
                  } else {
                    mm.field_a.a(var10, var11, pk.field_b.field_I + var12, 15885602, -1);
                    if (var15 == 0) {
                      break L61;
                    } else {
                      break L62;
                    }
                  }
                }
                mm.field_a.a(var10, var11, pk.field_b.field_I + var12, 16502531, -1);
                break L61;
              } else {
                break L61;
              }
            }
            if (!param0) {
              ha.field_b = a.field_c;
              eh.a();
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
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.FB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void w(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_74_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        var4 = field_ab;
        try {
          L0: {
            L1: {
              sk.field_d = sk.field_d + rg.field_wb;
              if (80 >= sk.field_d) {
                break L1;
              } else {
                if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                  break L1;
                } else {
                  L2: {
                    sk.field_d = 80;
                    if (!mh.field_e[ca.field_k - -1][hf.field_t].field_v) {
                      break L2;
                    } else {
                      if ((rg.field_wb ^ -1) >= -29) {
                        break L2;
                      } else {
                        mh.field_e[1 + ca.field_k][hf.field_t].field_S = true;
                        mh.field_e[ca.field_k - -1][hf.field_t].field_r = 975;
                        bd.field_k = bd.field_k - -10;
                        rg.field_wb = -10;
                        if (sc.field_b) {
                          ag.a(true, 28, hf.field_t << 896110533, ca.field_k - -1 << 1645079717);
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  if (-2 <= (rg.field_wb ^ -1)) {
                    break L1;
                  } else {
                    rg.field_wb = rg.field_wb - 1;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (79 >= (sk.field_d ^ -1)) {
                break L3;
              } else {
                if (!mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                  break L3;
                } else {
                  L4: {
                    sk.field_d = -80;
                    if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_v) {
                      break L4;
                    } else {
                      if (27 >= (rg.field_wb ^ -1)) {
                        break L4;
                      } else {
                        mh.field_e[ca.field_k - 1][hf.field_t].field_S = true;
                        mh.field_e[-1 + ca.field_k][hf.field_t].field_r = 975;
                        rg.field_wb = 10;
                        bd.field_k = bd.field_k - -10;
                        if (!sc.field_b) {
                          break L3;
                        } else {
                          ag.a(true, 28, hf.field_t << 56289029, -1 + ca.field_k << 156552709);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if ((rg.field_wb ^ -1) > 0) {
                    rg.field_wb = rg.field_wb + 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L5: {
              if (sk.field_d > 160) {
                sk.field_d = sk.field_d - 320;
                ca.field_k = ca.field_k + 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var2_int = -94 % ((2 - param0) / 61);
              if (-160 > sk.field_d) {
                ca.field_k = ca.field_k - 1;
                sk.field_d = sk.field_d + 320;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              L8: {
                if (qe.field_b[18]) {
                  break L8;
                } else {
                  L9: {
                    if (tc.field_s > 0) {
                      break L9;
                    } else {
                      if (mh.field_e[ca.field_k][hf.field_t + 1].field_E) {
                        break L9;
                      } else {
                        L10: {
                          if (-1 <= (sk.field_d ^ -1)) {
                            break L10;
                          } else {
                            if (mh.field_e[ca.field_k - -1][1 + hf.field_t].field_E) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (sk.field_d >= 0) {
                          break L8;
                        } else {
                          if (!mh.field_e[-1 + ca.field_k][1 + hf.field_t].field_E) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  stackOut_71_0 = 1;
                  stackIn_74_0 = stackOut_71_0;
                  break L7;
                }
              }
              stackOut_73_0 = 0;
              stackIn_74_0 = stackOut_73_0;
              break L7;
            }
            L11: {
              var3 = stackIn_74_0;
              if (var3 == 0) {
                break L11;
              } else {
                if (-1 != (dl.field_c & 3 ^ -1)) {
                  break L11;
                } else {
                  if (qd.field_O[96]) {
                    break L11;
                  } else {
                    if (!qd.field_O[97]) {
                      L12: {
                        if ((rg.field_wb ^ -1) <= -1) {
                          break L12;
                        } else {
                          rg.field_wb = rg.field_wb + 1;
                          if (var4 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (rg.field_wb > 0) {
                        rg.field_wb = rg.field_wb - 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
              }
            }
            L13: {
              if (var3 == 0) {
                break L13;
              } else {
                L14: {
                  L15: {
                    if ((rg.field_wb ^ -1) == -1) {
                      break L15;
                    } else {
                      if (qd.field_O[96]) {
                        break L15;
                      } else {
                        if (!qd.field_O[97]) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  L16: {
                    if (0 <= rg.field_wb) {
                      break L16;
                    } else {
                      if (qd.field_O[97]) {
                        break L14;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (0 >= rg.field_wb) {
                    break L13;
                  } else {
                    if (qd.field_O[96]) {
                      break L14;
                    } else {
                      break L13;
                    }
                  }
                }
                ne.a(42, -79);
                break L13;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.UA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            this.a("minerdisturbance", 13, -6622);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.init()");
        }
    }

    final void a(int param0) {
        di var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(false, 5, (byte) -121, 9, 7, 8, 10, 12);
              pl.field_h = 15;
              cm.field_r = 0;
              if (param0 > 37) {
                break L1;
              } else {
                this.a(-122, -50);
                break L1;
              }
            }
            hf.field_r = 50;
            ke.field_V = false;
            lj.field_r = 0;
            kj.a(1, -22156);
            var2 = new di();
            var2.a(128, -6242, 9);
            pe.a(qa.field_a, 22050, 512, (byte) -124, true, (java.awt.Component) ((Object) ef.field_c), var2, 22050);
            this.a(false, (byte) -61, true, true, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "MinerDisturbance.NA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        wb discarded$2 = null;
        wb discarded$3 = null;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-1 <= (param1 ^ -1)) {
                break L1;
              } else {
                if (kj.a(false)) {
                  break L1;
                } else {
                  if (!qm.field_f) {
                    L2: {
                      L3: {
                        if (0 != cm.field_o) {
                          break L3;
                        } else {
                          discarded$2 = tj.a(ac.field_b, 65529, qd.field_M, (byte) -66, di.field_X, new int[]{param1}, 6, vh.field_g, 3);
                          if (field_ab == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if ((cm.field_o ^ -1) == -2) {
                        discarded$3 = tj.a(ac.field_b, 65528, qd.field_M, (byte) -66, di.field_X, new int[]{param1}, 7, vh.field_g, 3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    sn.field_b[cm.field_o] = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L4: {
              if (param0 == 3) {
                break L4;
              } else {
                this.field_L = (int[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "MinerDisturbance.AB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean r(int param0) {
        RuntimeException var2 = null;
        ln[] var2_array = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var4 = field_ab;
        try {
          L0: {
            L1: {
              if (fl.field_f == null) {
                break L1;
              } else {
                if (!fl.field_f.a(false, "volcano")) {
                  break L1;
                } else {
                  if (je.field_j[0] != null) {
                    if (null == sa.field_t[0][0]) {
                      ff.field_c = td.a("interface_items", fl.field_f, "volcano", (byte) 119);
                      sa.field_t[0][0] = pb.a("volcano", fl.field_f, "rankings1", (byte) -77);
                      var2_array = tb.a("rankings2", "volcano", fl.field_f, 1);
                      ai.a(var2_array, 0, sa.field_t[0], 1, var2_array.length);
                      var2_array = tb.a("rankings3", "volcano", fl.field_f, 1);
                      ai.a(var2_array, 0, sa.field_t[0], 6, var2_array.length);
                      sa.field_t[0][8] = pb.a("volcano", fl.field_f, "rankings4", (byte) -77);
                      sa.field_t[0][9] = pb.a("volcano", fl.field_f, "rankings5", (byte) -77);
                      var3 = 0;
                      L2: while (true) {
                        L3: {
                          if ((var3 ^ -1) <= (sa.field_t[0].length ^ -1)) {
                            break L3;
                          } else {
                            sa.field_t[0][var3].a();
                            var3++;
                            if (var4 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      var2_int = 13 % ((param0 - -15) / 50);
                      if (null == qf.field_o[0][8]) {
                        nn.field_h[0] = jn.a("gravestone", -29553, "volcano", fl.field_f);
                        dl.field_d[0] = jn.a("certificate_pattern", -29553, "volcano", fl.field_f);
                        vl.field_E = jn.a("certificate_iron", -29553, "volcano", fl.field_f);
                        em.field_y = jn.a("certificate_silver", -29553, "volcano", fl.field_f);
                        sn.field_a = jn.a("certificate_gold", -29553, "volcano", fl.field_f);
                        di.field_ab = jn.a("certificate_efluvium", -29553, "volcano", fl.field_f);
                        vh.field_c = jn.a("certificate_diamond", -29553, "volcano", fl.field_f);
                        qf.field_o[0][0] = jn.a("certificate_topleft", -29553, "volcano", fl.field_f);
                        qf.field_o[0][1] = jn.a("certificate_top", -29553, "volcano", fl.field_f);
                        qf.field_o[0][2] = jn.a("certificate_topright", -29553, "volcano", fl.field_f);
                        qf.field_o[0][3] = jn.a("certificate_left", -29553, "volcano", fl.field_f);
                        qf.field_o[0][4] = jn.a("certificate_centre", -29553, "volcano", fl.field_f);
                        qf.field_o[0][5] = jn.a("certificate_right", -29553, "volcano", fl.field_f);
                        qf.field_o[0][6] = jn.a("certificate_bottomleft", -29553, "volcano", fl.field_f);
                        qf.field_o[0][7] = jn.a("certificate_bottom", -29553, "volcano", fl.field_f);
                        qf.field_o[0][8] = jn.a("certificate_bottomright", -29553, "volcano", fl.field_f);
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          if (null == mc.field_u) {
                            mc.field_u = jn.a("screen_box_left", -29553, "volcano", fl.field_f);
                            mh.field_d = jn.a("screen_box_right", -29553, "volcano", fl.field_f);
                            fh.field_e = jn.a("screen_box_top", -29553, "volcano", fl.field_f);
                            ei.field_M = jn.a("screen_box_bottom", -29553, "volcano", fl.field_f);
                            pi.field_b = jn.a("score_box", -29553, "volcano", fl.field_f);
                            me.field_k[0] = jn.a("levelbackground", -29553, "volcano", fl.field_f);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        qd.field_S = true;
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  } else {
                    je.field_w = td.a("ores", fl.field_f, "volcano", (byte) 127);
                    je.field_d[0] = td.a("rocks", fl.field_f, "volcano", (byte) 125);
                    je.field_P[0] = td.a("damagedrocks", fl.field_f, "volcano", (byte) 122);
                    je.field_R[0] = td.a("damagedrocks2", fl.field_f, "volcano", (byte) 109);
                    je.field_p[0] = td.a("damagedrocks3", fl.field_f, "volcano", (byte) 125);
                    mb.field_d = td.a("gemstones", fl.field_f, "volcano", (byte) 113);
                    je.field_B = td.a("boulders", fl.field_f, "volcano", (byte) 117);
                    je.field_x[0] = td.a("slopes", fl.field_f, "volcano", (byte) 121);
                    je.field_j[0] = td.a("sky", fl.field_f, "volcano", (byte) 119);
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.SA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                return stackIn_30_0 != 0;
              }
            }
          }
        }
    }

    private final void e(boolean param0) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var2 = null;
        je var2_ref = null;
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
        int var25 = 0;
        int stackIn_11_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_112_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_111_0 = 0;
        var25 = field_ab;
        try {
          L0: {
            L1: {
              L2: {
                var3 = 596 + -(s.field_L[1].field_x >> -1381636447);
                s.field_L[0].f(var3, -s.field_L[0].field_A + 76);
                eh.a(var3, 76, s.field_L[1].field_x + 580, 76 - (-this.field_G + this.field_W));
                var4 = 76 + this.field_G;
                var5 = -li.field_c + (32 * ca.field_k - -(sk.field_d / 10));
                var6 = -db.field_d + (hf.field_t * 32 + mf.field_i / 10);
                if ((var3 - 96 ^ -1) <= (var5 ^ -1)) {
                  break L2;
                } else {
                  if (19 <= (var6 ^ -1)) {
                    break L2;
                  } else {
                    if (96 + (76 + var4) <= var6) {
                      break L2;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            L3: {
              L4: {
                var7 = stackIn_11_0;
                if (var7 != 0) {
                  L5: {
                    var8 = 0;
                    var9 = a.field_a[0].field_x >> -505562111;
                    var10 = a.field_a[0].field_A >> -95012639;
                    var11 = var9 + 48 + var5;
                    var12 = var10 + var6 + 48;
                    var13 = var10 + (var6 - 48);
                    var14 = var9 + (var5 + -48);
                    var15 = 0;
                    var16 = 0;
                    if (var14 >= 0) {
                      break L5;
                    } else {
                      var15 = var14 * -1;
                      var14 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (-1 + eh.field_g >= var11) {
                      break L6;
                    } else {
                      var16 = 1 - eh.field_g + var11;
                      var11 = -1 + eh.field_g;
                      break L6;
                    }
                  }
                  L7: {
                    if (0 > var13) {
                      var13 = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var13 > -1 + eh.field_c) {
                      var13 = -1 + eh.field_c;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: while (true) {
                    if ((var12 ^ -1) >= (var13 ^ -1)) {
                      break L4;
                    } else {
                      var8 = var8 + var15;
                      stackOut_27_0 = var14;
                      stackIn_37_0 = stackOut_27_0;
                      stackIn_28_0 = stackOut_27_0;
                      if (var25 != 0) {
                        break L3;
                      } else {
                        var17 = stackIn_28_0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if ((var11 ^ -1) >= (var17 ^ -1)) {
                                break L12;
                              } else {
                                incrementValue$2 = var8;
                                var8++;
                                this.field_L[incrementValue$2] = eh.field_f[var13 * eh.field_g + var17];
                                var17++;
                                if (var25 != 0) {
                                  break L11;
                                } else {
                                  if (var25 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var8 = var8 + var16;
                            var13++;
                            break L11;
                          }
                          if (var25 == 0) {
                            continue L9;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_36_0 = this.field_W + 76;
              stackIn_37_0 = stackOut_36_0;
              break L3;
            }
            var8 = stackIn_37_0;
            L13: while (true) {
              L14: {
                L15: {
                  if ((var8 ^ -1) <= (var4 ^ -1)) {
                    break L15;
                  } else {
                    s.field_L[1].g(var3, -this.field_W + var8);
                    var8 = var8 + s.field_L[1].field_A;
                    if (var25 != 0) {
                      break L14;
                    } else {
                      if (var25 == 0) {
                        continue L13;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
                var8 = 0;
                break L14;
              }
              var9 = 0;
              if (param0) {
                var10 = this.field_W;
                L16: while (true) {
                  stackOut_47_0 = this.field_G ^ -1;
                  stackOut_47_1 = var10 ^ -1;
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  L17: while (true) {
                    L18: {
                      L19: {
                        if (stackIn_48_0 >= stackIn_48_1) {
                          break L19;
                        } else {
                          var11 = 1;
                          stackOut_49_0 = 0;
                          stackIn_99_0 = stackOut_49_0;
                          stackIn_50_0 = stackOut_49_0;
                          if (var25 != 0) {
                            break L18;
                          } else {
                            var12 = stackIn_50_0;
                            L20: while (true) {
                              L21: {
                                if (32 <= var12) {
                                  break L21;
                                } else {
                                  stackOut_52_0 = var10 ^ -1;
                                  stackOut_52_1 = je.field_t ^ -1;
                                  stackIn_48_0 = stackOut_52_0;
                                  stackIn_48_1 = stackOut_52_1;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackIn_53_1 = stackOut_52_1;
                                  if (var25 != 0) {
                                    continue L17;
                                  } else {
                                    L22: {
                                      if (stackIn_53_0 > stackIn_53_1) {
                                        var2_ref = mh.field_e[var12][var10];
                                        if (!var2_ref.field_V) {
                                          break L22;
                                        } else {
                                          L23: {
                                            L24: {
                                              var13 = 8014124;
                                              if (var2_ref.field_a) {
                                                break L24;
                                              } else {
                                                var11 = 0;
                                                if (var25 == 0) {
                                                  break L23;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                            var13 = 13016173;
                                            break L23;
                                          }
                                          L25: {
                                            var14 = je.e(var12, var10, 1, 1);
                                            if ((var14 ^ -1) < -1) {
                                              L26: {
                                                if ((var14 ^ -1) == -2) {
                                                  var13 = 7748154;
                                                  break L26;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                              L27: {
                                                if (-3 != (var14 ^ -1)) {
                                                  break L27;
                                                } else {
                                                  var13 = 9779770;
                                                  break L27;
                                                }
                                              }
                                              L28: {
                                                if (var14 != 3) {
                                                  break L28;
                                                } else {
                                                  var13 = 12399154;
                                                  break L28;
                                                }
                                              }
                                              L29: {
                                                if (2 != var14) {
                                                  break L29;
                                                } else {
                                                  var13 = 15553598;
                                                  break L29;
                                                }
                                              }
                                              L30: {
                                                if (var14 != 5) {
                                                  break L30;
                                                } else {
                                                  var13 = 16733246;
                                                  break L30;
                                                }
                                              }
                                              L31: {
                                                if (6 != var14) {
                                                  break L31;
                                                } else {
                                                  var13 = 16728867;
                                                  break L31;
                                                }
                                              }
                                              L32: {
                                                if (var14 != 7) {
                                                  break L32;
                                                } else {
                                                  var13 = 16720401;
                                                  break L32;
                                                }
                                              }
                                              L33: {
                                                if (8 == var14) {
                                                  var13 = 16718350;
                                                  break L33;
                                                } else {
                                                  break L33;
                                                }
                                              }
                                              if (-10 < (var14 ^ -1)) {
                                                break L25;
                                              } else {
                                                var13 = 16714252;
                                                break L25;
                                              }
                                            } else {
                                              break L25;
                                            }
                                          }
                                          eh.b(2 + (var12 - -580), 76 + var9, var13);
                                          break L22;
                                        }
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var12++;
                                    if (var25 == 0) {
                                      continue L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              L34: {
                                L35: {
                                  if (var11 == 0) {
                                    break L35;
                                  } else {
                                    if (var9 <= hf.field_t) {
                                      break L35;
                                    } else {
                                      var8++;
                                      if ((var8 ^ -1) > -3) {
                                        break L34;
                                      } else {
                                        this.field_Z = var10;
                                        this.field_G = var10;
                                        if (var25 == 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                  }
                                }
                                var8 = 0;
                                break L34;
                              }
                              var9++;
                              var10++;
                              if (var25 == 0) {
                                continue L16;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      var9 = 743564;
                      var10 = 6373481;
                      var11 = 0;
                      stackOut_98_0 = this.field_W;
                      stackIn_99_0 = stackOut_98_0;
                      break L18;
                    }
                    var12 = stackIn_99_0;
                    L36: while (true) {
                      stackOut_100_0 = var12;
                      stackOut_100_1 = 24;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      L37: while (true) {
                        L38: {
                          L39: {
                            if (stackIn_101_0 >= stackIn_101_1) {
                              break L39;
                            } else {
                              var13 = var9 - -(var12 * var10 / 16);
                              stackOut_102_0 = 0;
                              stackIn_112_0 = stackOut_102_0;
                              stackIn_103_0 = stackOut_102_0;
                              if (var25 != 0) {
                                break L38;
                              } else {
                                var14 = stackIn_103_0;
                                L40: while (true) {
                                  L41: {
                                    if (32 <= var14) {
                                      break L41;
                                    } else {
                                      stackOut_105_0 = Math.abs(-16 + var14) >> 972776513;
                                      stackOut_105_1 = var12;
                                      stackIn_101_0 = stackOut_105_0;
                                      stackIn_101_1 = stackOut_105_1;
                                      stackIn_106_0 = stackOut_105_0;
                                      stackIn_106_1 = stackOut_105_1;
                                      if (var25 != 0) {
                                        continue L37;
                                      } else {
                                        L42: {
                                          if (stackIn_106_0 >= stackIn_106_1) {
                                            eh.b(580 + (var14 - -2), 76 + var11, var13);
                                            break L42;
                                          } else {
                                            break L42;
                                          }
                                        }
                                        var14++;
                                        if (var25 == 0) {
                                          continue L40;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                  var12++;
                                  var11++;
                                  if (var25 == 0) {
                                    continue L36;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                          }
                          eh.c(580 + (ca.field_k + 2), -this.field_W + (hf.field_t + 76), 2, 16777215);
                          eh.d(ca.field_k + 580 + 2, 76 + -this.field_W + hf.field_t, 3, 0);
                          eh.a();
                          s.field_L[2].f(var3, Math.max(this.field_G - this.field_W, 0) + 76);
                          stackOut_111_0 = var7;
                          stackIn_112_0 = stackOut_111_0;
                          break L38;
                        }
                        L43: {
                          L44: {
                            if (stackIn_112_0 == 0) {
                              break L44;
                            } else {
                              L45: {
                                var11 = 0;
                                var12 = a.field_a[0].field_x >> 182537025;
                                var13 = a.field_a[0].field_A >> 1174602497;
                                var14 = 48 + var5 - -var12;
                                var15 = 48 + var6 + var13;
                                var16 = var13 + var6 - 48;
                                var17 = var12 + -48 + var5;
                                var18 = 0;
                                var19 = 0;
                                if (var17 < 0) {
                                  var18 = var17 * -1;
                                  var17 = 0;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              L46: {
                                if (-1 >= (var16 ^ -1)) {
                                  break L46;
                                } else {
                                  var16 = 0;
                                  break L46;
                                }
                              }
                              L47: {
                                if ((var14 ^ -1) >= (-1 + eh.field_g ^ -1)) {
                                  break L47;
                                } else {
                                  var19 = var14 - -1 - eh.field_g;
                                  var14 = eh.field_g + -1;
                                  break L47;
                                }
                              }
                              L48: {
                                if ((var16 ^ -1) < (-1 + eh.field_c ^ -1)) {
                                  var16 = -1 + eh.field_c;
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                              L49: while (true) {
                                if ((var16 ^ -1) <= (var15 ^ -1)) {
                                  break L44;
                                } else {
                                  var11 = var11 + var18;
                                  if (var25 != 0) {
                                    break L43;
                                  } else {
                                    var20 = var17;
                                    L50: while (true) {
                                      L51: {
                                        L52: {
                                          if ((var20 ^ -1) <= (var14 ^ -1)) {
                                            break L52;
                                          } else {
                                            var21 = jl.field_gb[var11];
                                            var22 = -var21 + 256;
                                            var23 = eh.field_f[var20 + var16 * eh.field_g];
                                            incrementValue$3 = var11;
                                            var11++;
                                            var24 = this.field_L[incrementValue$3];
                                            eh.field_f[var16 * eh.field_g - -var20] = c.a(-16711936, var22 * c.a(var23, 16711935) + var21 * c.a(var24, 16711935)) + c.a(16711680, var22 * c.a(var23, 65280) + c.a(65280, var24) * var21) >> 1187434568;
                                            var20++;
                                            if (var25 != 0) {
                                              break L51;
                                            } else {
                                              if (var25 == 0) {
                                                continue L50;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                        }
                                        var11 = var11 + var19;
                                        var16++;
                                        break L51;
                                      }
                                      if (var25 == 0) {
                                        continue L49;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L43;
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
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
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.WA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        String var3_ref = null;
        sb var3_ref2 = null;
        sb var4 = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_ab;
        try {
          L0: {
            L1: {
              if (param0) {
                il.a(ki.field_n, (byte) -109);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!ei.field_Q.a((byte) 127)) {
                break L2;
              } else {
                if (ei.field_Q.b(-1)) {
                  L3: {
                    if (!pk.field_g.a((byte) 104)) {
                      break L3;
                    } else {
                      if (pk.field_g.b(-1)) {
                        L4: {
                          if (!ge.field_e.a((byte) 88)) {
                            break L4;
                          } else {
                            if (ge.field_e.b(-1)) {
                              L5: {
                                if (!ig.field_c.a((byte) 108)) {
                                  break L5;
                                } else {
                                  if (!ig.field_c.b(-1)) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (!fl.field_f.a((byte) 84)) {
                                        break L6;
                                      } else {
                                        if (!fl.field_f.a(false, "")) {
                                          break L6;
                                        } else {
                                          L7: {
                                            if (!fl.field_f.a((byte) 96)) {
                                              break L7;
                                            } else {
                                              if (fl.field_f.a(false, "shop")) {
                                                L8: {
                                                  if (0 < pj.field_a) {
                                                    break L8;
                                                  } else {
                                                    L9: {
                                                      if (!fl.field_f.a((byte) 86)) {
                                                        break L9;
                                                      } else {
                                                        if (!fl.field_f.a(false, "membersexpansion")) {
                                                          break L9;
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, "membersexpansion"), 29.0f);
                                                    decompiledRegionSelector0 = 6;
                                                    break L0;
                                                  }
                                                }
                                                L10: {
                                                  if (!ne.field_L.a((byte) 108)) {
                                                    break L10;
                                                  } else {
                                                    if (!ne.field_L.b(-1)) {
                                                      break L10;
                                                    } else {
                                                      L11: {
                                                        if (!ob.field_q.a((byte) 86)) {
                                                          break L11;
                                                        } else {
                                                          if (!ob.field_q.a(false, "basic")) {
                                                            break L11;
                                                          } else {
                                                            L12: {
                                                              if (!id.field_c.a((byte) 107)) {
                                                                break L12;
                                                              } else {
                                                                if (id.field_c.b(-1)) {
                                                                  pa.a(true, le.field_b, 50.0f);
                                                                  if (param0) {
                                                                    L13: {
                                                                      vh.a(-128);
                                                                      this.b(false);
                                                                      am.a(ei.field_Q, 27);
                                                                      wf.p(4462);
                                                                      pa.a(true, ik.field_S, 60.0f);
                                                                      this.b(false);
                                                                      ba.a(ei.field_Q, pk.field_g, ge.field_e, true, ig.field_c);
                                                                      ig.field_c = null;
                                                                      pk.field_g = null;
                                                                      ge.field_e = null;
                                                                      ei.field_Q = null;
                                                                      wf.p(4462);
                                                                      pa.a(true, qg.field_e, 75.0f);
                                                                      this.b(false);
                                                                      this.x(-33);
                                                                      ob.field_q = null;
                                                                      ne.field_L = null;
                                                                      if (param1 <= -77) {
                                                                        break L13;
                                                                      } else {
                                                                        this.g((byte) -103);
                                                                        break L13;
                                                                      }
                                                                    }
                                                                    L14: {
                                                                      L15: {
                                                                        pa.a(true, s.field_T, 95.0f);
                                                                        this.b(false);
                                                                        var3_ref2 = new sb(id.field_c.a("volcano.csv", 0, ""));
                                                                        var4 = new sb(id.field_c.a("supervolcano.csv", 0, ""));
                                                                        ml.a(var4, (byte) 0, var3_ref2);
                                                                        this.h((byte) 65);
                                                                        an.a(-122, 50);
                                                                        ke.field_V = false;
                                                                        bj.a(-6358, ph.field_a);
                                                                        oi.a(mm.field_a, ce.field_d, 97, 300);
                                                                        ud.a(new ac(hd.field_d), 30, 30, 88);
                                                                        ic.a(113, 4473924, 15885602, 16502531);
                                                                        aa.a(6, new ac(vc.field_p), -1, 6, new ac(vc.field_p), 6);
                                                                        bj.field_e.a((byte) -45);
                                                                        qd.n(21);
                                                                        nn.field_n = true;
                                                                        wf.p(4462);
                                                                        kf.a((MinerDisturbance) (this), 45977);
                                                                        if (pj.field_a > 0) {
                                                                          break L15;
                                                                        } else {
                                                                          vh.a(3, ib.field_c);
                                                                          if (var5 == 0) {
                                                                            break L14;
                                                                          } else {
                                                                            break L15;
                                                                          }
                                                                        }
                                                                      }
                                                                      ce.a(320);
                                                                      break L14;
                                                                    }
                                                                    L16: {
                                                                      this.k((byte) 101);
                                                                      kd.a((byte) 48);
                                                                      if (kj.a(false)) {
                                                                        break L16;
                                                                      } else {
                                                                        sn.field_b[1] = gk.a(3, 1, 7, -65, 10);
                                                                        sn.field_b[0] = gk.a(3, 1, 6, -12, 10);
                                                                        dm.field_f = fn.a(0, 6);
                                                                        r.field_d = gk.b(4, 1);
                                                                        break L16;
                                                                      }
                                                                    }
                                                                    decompiledRegionSelector0 = 11;
                                                                    break L0;
                                                                  } else {
                                                                    decompiledRegionSelector0 = 10;
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  break L12;
                                                                }
                                                              }
                                                            }
                                                            pa.a(true, qn.a(ei.field_P, td.field_a, false, id.field_c), 40.0f);
                                                            decompiledRegionSelector0 = 9;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                      pa.a(true, u.a(ub.field_c, ob.field_q, ul.field_d, -7157, "basic"), 35.0f);
                                                      decompiledRegionSelector0 = 8;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                                pa.a(true, u.a(mb.field_a, ne.field_L, dc.field_a, -7157, ""), 30.0f);
                                                decompiledRegionSelector0 = 7;
                                                break L0;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, "shop"), 26.0f);
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        }
                                      }
                                    }
                                    pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, ""), 20.0f);
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  }
                                }
                              }
                              pa.a(true, u.a(gm.field_c, ig.field_c, w.field_X, -7157, ""), 16.0f);
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L17: {
                          L18: {
                            if (!ge.field_e.a((byte) 112)) {
                              break L18;
                            } else {
                              var3_ref = gm.field_c;
                              if (var5 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var3_ref = w.field_X;
                          break L17;
                        }
                        pa.a(true, var3_ref, 8.0f);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  pa.a(true, u.a(gm.field_c, pk.field_g, w.field_X, -7157, ""), 4.0f);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            pa.a(true, u.a(ud.field_f, ei.field_Q, hm.field_M, -7157, ""), 0.0f);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "MinerDisturbance.TA(" + param0 + ',' + param1 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return;
                            } else {
                              return;
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

    final void h(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_ab;
        try {
          L0: {
            L1: {
              L2: {
                this.a(0, (byte) 116);
                this.a((byte) -70, 0);
                nd.field_d.c(-29727);
                if (ke.field_V) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (-22 >= (var2_int ^ -1)) {
                          break L5;
                        } else {
                          qe.field_b[var2_int] = false;
                          var2_int++;
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (var4 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      qe.field_b[7] = true;
                      qe.field_b[0] = true;
                      qe.field_b[6] = true;
                      break L4;
                    }
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              cm.field_n = cm.field_n + 1;
              a.field_c = 0;
              hl.field_b = 2985;
              di.field_X = 312;
              pn.field_b = 3213;
              ac.field_b = 2439;
              qd.field_M = 4533;
              pe.field_sb = 1633100126;
              aa.field_b = 32424;
              vh.field_g = 1235;
              break L1;
            }
            L6: {
              ic.field_k = 1500;
              var2_int = -102 / ((param0 - -1) / 60);
              rg.field_sb = 6000;
              this.field_R = 300;
              cm.field_o = ah.field_f;
              this.field_S = 0;
              this.field_U = 0;
              this.field_E = 0;
              this.field_I = 0;
              qm.field_f = false;
              if (cm.field_o == 1) {
                rg.field_sb = rg.field_sb + rg.field_sb / 2;
                break L6;
              } else {
                break L6;
              }
            }
            jc.field_H = 0;
            ch.field_h = -1;
            cl.field_I = 0;
            pi.field_a = 0;
            eb.field_e = 0;
            me.field_h = 0;
            hn.field_c = false;
            field_J = -1;
            nm.field_g[2] = 0;
            qf.field_p = 0;
            vi.field_q = 0;
            re.field_d = 0;
            nm.field_g[5] = 0;
            eb.field_b = 0;
            nm.field_g[3] = 0;
            nm.field_g[1] = 0;
            nm.field_g[4] = 0;
            lb.field_r = 0;
            nm.field_g[0] = 0;
            var3 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if ((var3 ^ -1) <= -1001) {
                    break L9;
                  } else {
                    uf.field_p[var3] = null;
                    var3++;
                    if (var4 != 0) {
                      break L8;
                    } else {
                      if (var4 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                d.field_b = true;
                mh.field_e = je.i();
                je.d();
                je.d();
                je.d();
                je.d();
                je.d();
                je.d();
                je.d();
                je.d();
                je.d();
                je.d();
                qd.field_K = 100;
                tc.field_s = 0;
                hf.field_t = 4;
                ca.field_g = 0;
                ca.field_k = 16;
                kj.field_d = 0;
                this.field_Y = false;
                mf.field_i = 0;
                sk.field_d = 0;
                tb.field_c = 0;
                cn.field_C = 0;
                rj.field_f = 0;
                break L8;
              }
              L10: {
                if (!sc.field_b) {
                  break L10;
                } else {
                  li.field_c = 0;
                  db.field_d = 0;
                  break L10;
                }
              }
              bd.field_k = -1;
              rg.field_wb = 0;
              this.field_K = false;
              pc.field_k = 0;
              di.field_K = 1;
              pa.field_c = -1;
              q.field_b = mh.field_e;
              this.field_eb = false;
              kn.field_E = 1000;
              pl.field_h = 15;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.JA(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_142_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        var4 = field_ab;
        try {
          L0: {
            L1: {
              gb.b(-6129);
              var2_int = 111 % ((param0 - 7) / 42);
              stackOut_1_0 = this;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (kf.field_d != null) {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              this.a(stackIn_5_1 != 0, 18808);
              if (!oe.field_a) {
                break L2;
              } else {
                this.j((byte) 22);
                oe.field_a = false;
                break L2;
              }
            }
            L3: {
              if (kf.field_d == null) {
                break L3;
              } else {
                if (kf.field_d.field_b) {
                  ng.a((byte) -122);
                  h.a(4);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (hl.b((byte) -61)) {
                  break L5;
                } else {
                  L6: {
                    L7: {
                      if (nn.field_n) {
                        break L7;
                      } else {
                        this.a(true, (byte) -120);
                        if (var4 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (ah.field_i) {
                        break L8;
                      } else {
                        if (!this.r(127)) {
                          break L8;
                        } else {
                          if (!this.i((byte) 80)) {
                            break L8;
                          } else {
                            if (!wd.field_f) {
                              break L8;
                            } else {
                              fl.field_f = null;
                              ah.field_i = true;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    c.a((byte) -98);
                    sb.a(6);
                    if (od.e(false)) {
                      break L6;
                    } else {
                      if (!qi.f(-9202)) {
                        L9: {
                          L10: {
                            if (!u.a(27443)) {
                              break L10;
                            } else {
                              if (!oc.d(75)) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            L12: {
                              if (!ge.field_c) {
                                break L12;
                              } else {
                                if (!vc.a(true)) {
                                  break L12;
                                } else {
                                  L13: {
                                    L14: {
                                      L15: {
                                        if (tm.field_v != 4) {
                                          break L15;
                                        } else {
                                          if (oc.d(63)) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      ed.a(true);
                                      if (var4 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    r.a(-14475);
                                    break L13;
                                  }
                                  mh.field_f = true;
                                  ge.field_c = false;
                                  if (var4 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            L16: {
                              if (mh.field_f) {
                                break L16;
                              } else {
                                L17: {
                                  if (oc.d(96)) {
                                    break L17;
                                  } else {
                                    on.field_u = on.field_u - 1;
                                    if (0 <= on.field_u) {
                                      break L11;
                                    } else {
                                      on.field_u = 0;
                                      if (var4 == 0) {
                                        break L11;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                L18: {
                                  on.field_u = on.field_u + 1;
                                  if ((on.field_u ^ -1) >= -51) {
                                    break L18;
                                  } else {
                                    on.field_u = 50;
                                    break L18;
                                  }
                                }
                                L19: {
                                  L20: {
                                    var3 = dl.b(-123);
                                    if ((var3 ^ -1) == -3) {
                                      break L20;
                                    } else {
                                      L21: {
                                        if (-4 == (var3 ^ -1)) {
                                          break L21;
                                        } else {
                                          L22: {
                                            if ((var3 ^ -1) != -5) {
                                              break L22;
                                            } else {
                                              tm.field_v = 4;
                                              jf.field_b = 4;
                                              ge.field_c = true;
                                              if (var4 == 0) {
                                                break L19;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          this.f((byte) 7);
                                          if (var4 == 0) {
                                            break L19;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      cl.q(-94);
                                      if (var4 == 0) {
                                        break L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  ng.a((byte) -128);
                                  break L19;
                                }
                                L23: {
                                  if (!oc.d(83)) {
                                    hk.a((byte) -124);
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                if (var4 == 0) {
                                  break L11;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var3 = 0;
                            L24: while (true) {
                              L25: {
                                L26: {
                                  L27: {
                                    if (var3 >= 2) {
                                      break L27;
                                    } else {
                                      sn.field_b[var3] = null;
                                      var3++;
                                      if (var4 != 0) {
                                        break L26;
                                      } else {
                                        if (var4 == 0) {
                                          continue L24;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                  if (!kj.a(false)) {
                                    break L26;
                                  } else {
                                    jc.a(false, -105, jf.field_b);
                                    if (var4 == 0) {
                                      break L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                L28: {
                                  if (oc.d(119)) {
                                    cl.q(-85);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                L29: {
                                  L30: {
                                    if (tm.field_v != 5) {
                                      break L30;
                                    } else {
                                      if (!ig.a(-20144)) {
                                        break L30;
                                      } else {
                                        jc.a(false, -121, 2);
                                        kd.a(cm.field_o, (byte) -111);
                                        if (var4 == 0) {
                                          break L29;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                  }
                                  jc.a(false, -116, tm.field_v);
                                  break L29;
                                }
                                L31: {
                                  if ((a.field_c ^ -1) >= -1) {
                                    break L31;
                                  } else {
                                    this.a(3, a.field_c);
                                    break L31;
                                  }
                                }
                                L32: {
                                  if ((pj.field_a ^ -1) >= -1) {
                                    break L32;
                                  } else {
                                    ce.a(320);
                                    break L32;
                                  }
                                }
                                this.k((byte) 121);
                                break L25;
                              }
                              mh.field_f = false;
                              break L11;
                            }
                          }
                          this.f((byte) 7);
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                        L33: {
                          if (kf.field_d == null) {
                            stackOut_141_0 = 0;
                            stackIn_142_0 = stackOut_141_0;
                            break L33;
                          } else {
                            stackOut_139_0 = 1;
                            stackIn_142_0 = stackOut_139_0;
                            break L33;
                          }
                        }
                        L34: {
                          var3 = gd.a(stackIn_142_0 != 0, -61, (ob) (this));
                          if ((var3 ^ -1) != -2364825) {
                            break L34;
                          } else {
                            le.b(8952);
                            if (var4 == 0) {
                              break L6;
                            } else {
                              break L34;
                            }
                          }
                        }
                        L35: {
                          if (1 == var3) {
                            break L35;
                          } else {
                            if (-3 == (var3 ^ -1)) {
                              break L35;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L36: {
                          if (kf.field_d != null) {
                            kf.field_d.a(false, qa.field_a);
                            kf.field_d = null;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        if (2 != var3) {
                          break L6;
                        } else {
                          uf.a(13, bm.c(-101));
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  L37: while (true) {
                    L38: {
                      L39: {
                        if (!im.a(ge.field_g, 0)) {
                          break L39;
                        } else {
                          this.n(22);
                          if (var4 != 0) {
                            break L38;
                          } else {
                            if (var4 == 0) {
                              continue L37;
                            } else {
                              break L39;
                            }
                          }
                        }
                      }
                      bk.a((byte) -69, 0);
                      break L38;
                    }
                    if (ci.a(105)) {
                      L40: {
                        var3 = this.c((byte) -119);
                        if (var3 != 2) {
                          break L40;
                        } else {
                          eb.a((byte) -106);
                          break L40;
                        }
                      }
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              this.k(10);
              if (!bi.a(-11)) {
                break L4;
              } else {
                if (!nn.field_n) {
                  this.a(false, (byte) -101);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.HA(" + param0 + ')');
        }
    }

    private final void l(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        Object stackIn_58_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_402_0 = 0;
        Object stackIn_483_0 = null;
        Object stackIn_485_0 = null;
        Object stackIn_487_0 = null;
        Object stackIn_488_0 = null;
        int stackIn_488_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_237_0 = 0;
        int stackOut_401_0 = 0;
        int stackOut_399_0 = 0;
        Object stackOut_482_0 = null;
        Object stackOut_487_0 = null;
        int stackOut_487_1 = 0;
        Object stackOut_483_0 = null;
        Object stackOut_485_0 = null;
        int stackOut_485_1 = 0;
        var10 = field_ab;
        try {
          L0: {
            var2_int = -1;
            if (param0 <= -106) {
              var3 = 4;
              var4 = 6;
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (21 <= var6) {
                        break L4;
                      } else {
                        stackOut_5_0 = 0;
                        stackOut_5_1 = var6;
                        stackIn_54_0 = stackOut_5_0;
                        stackIn_54_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (var10 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_6_0 != stackIn_6_1) {
                                break L6;
                              } else {
                                if (!qe.field_b[1]) {
                                  break L6;
                                } else {
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L7: {
                              if (2 != var6) {
                                break L7;
                              } else {
                                if (!qe.field_b[19]) {
                                  break L7;
                                } else {
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            if (qe.field_b[var6]) {
                              L8: {
                                if (hc.a(110, var4, 34, var3, nk.field_w, 33, gb.field_e)) {
                                  var2_int = var6;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                var5++;
                                if (var5 <= 8) {
                                  break L9;
                                } else {
                                  var3 = 4;
                                  var5 = 0;
                                  var4 += 33;
                                  if (var10 == 0) {
                                    break L5;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var3 += 33;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var6++;
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (qe.field_b[14]) {
                      L10: {
                        if (jk.field_ab != 0) {
                          break L10;
                        } else {
                          L11: {
                            if (!hc.a(19, 65, 10, 572, nk.field_w, 48, gb.field_e)) {
                              break L11;
                            } else {
                              var2_int = -2;
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (hc.a(119, 75, this.field_G - this.field_W, 576, nk.field_w, 44, gb.field_e)) {
                            var2_int = -3;
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_52_0 = 119;
                      stackOut_52_1 = 65;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_54_1 = stackOut_52_1;
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  if (hc.a(stackIn_54_0, stackIn_54_1, 10, 572, wi.field_w, 48, m.field_e)) {
                    L12: {
                      stackOut_57_0 = this;
                      stackIn_60_0 = stackOut_57_0;
                      stackIn_58_0 = stackOut_57_0;
                      if (this.field_eb) {
                        stackOut_60_0 = this;
                        stackOut_60_1 = 0;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        break L12;
                      } else {
                        stackOut_58_0 = this;
                        stackOut_58_1 = 1;
                        stackIn_61_0 = stackOut_58_0;
                        stackIn_61_1 = stackOut_58_1;
                        break L12;
                      }
                    }
                    ((MinerDisturbance) (this)).field_eb = stackIn_61_1 != 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L13: {
                  lm.a(var2_int, 98);
                  ag.field_c = qd.field_O[83];
                  if (ke.field_V) {
                    break L13;
                  } else {
                    if (!il.e(-31391)) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          if (this.field_C != nk.field_w) {
                            break L15;
                          } else {
                            if ((this.field_bb ^ -1) != (gb.field_e ^ -1)) {
                              break L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                        this.field_O = false;
                        break L14;
                      }
                      L16: {
                        L17: {
                          L18: {
                            this.field_C = nk.field_w;
                            this.field_bb = gb.field_e;
                            if (this.field_O) {
                              break L18;
                            } else {
                              if (nk.field_w <= 398) {
                                break L18;
                              } else {
                                if ((nk.field_w ^ -1) <= -624) {
                                  break L18;
                                } else {
                                  if (-430 <= (gb.field_e ^ -1)) {
                                    break L18;
                                  } else {
                                    if (gb.field_e < 449) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (!this.field_O) {
                            stackOut_93_0 = 0;
                            stackIn_94_0 = stackOut_93_0;
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                        stackOut_91_0 = 1;
                        stackIn_94_0 = stackOut_91_0;
                        break L16;
                      }
                      of.field_a = stackIn_94_0 != 0;
                      if (-1 != (jk.field_ab ^ -1)) {
                        L19: {
                          this.field_O = false;
                          this.q(-46);
                          bj.a(-6358, ph.field_a);
                          fm.f((byte) 81);
                          if (kj.a(false)) {
                            break L19;
                          } else {
                            L20: {
                              if (!ig.a(-20144)) {
                                break L20;
                              } else {
                                jc.a(true, -126, 5);
                                if (var10 == 0) {
                                  break L13;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            jc.a(true, -121, 2);
                            kd.a(cm.field_o, (byte) -104);
                            if (var10 == 0) {
                              break L13;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L21: {
                          if (-1 > (ha.field_b ^ -1)) {
                            break L21;
                          } else {
                            jc.a(true, -116, 4);
                            if (var10 == 0) {
                              break L13;
                            } else {
                              break L21;
                            }
                          }
                        }
                        jc.a(true, -105, 6);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                L22: while (true) {
                  L23: {
                    L24: {
                      if (!mm.b((byte) 84)) {
                        break L24;
                      } else {
                        var6 = (lj.field_t + (rg.field_sb + (m.field_e + nk.field_w))) % 8;
                        if (var10 != 0) {
                          break L23;
                        } else {
                          L25: {
                            L26: {
                              if (0 != var6) {
                                break L26;
                              } else {
                                ac.field_b = ac.field_b - 1;
                                di.field_X = di.field_X + qd.field_M;
                                if (var10 == 0) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            L27: {
                              if (-2 == (var6 ^ -1)) {
                                break L27;
                              } else {
                                L28: {
                                  if (-3 != (var6 ^ -1)) {
                                    break L28;
                                  } else {
                                    di.field_X = di.field_X - qd.field_M;
                                    ac.field_b = ac.field_b + 1;
                                    if (var10 == 0) {
                                      break L25;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                L29: {
                                  if (3 != var6) {
                                    break L29;
                                  } else {
                                    qd.field_M = qd.field_M + 1;
                                    di.field_X = di.field_X - ac.field_b;
                                    if (var10 == 0) {
                                      break L25;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                                L30: {
                                  if (4 != var6) {
                                    break L30;
                                  } else {
                                    ac.field_b = ac.field_b + 1;
                                    vh.field_g = vh.field_g + qd.field_M;
                                    if (var10 == 0) {
                                      break L25;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                L31: {
                                  if (-6 != (var6 ^ -1)) {
                                    break L31;
                                  } else {
                                    qd.field_M = qd.field_M + 1;
                                    vh.field_g = vh.field_g + ac.field_b;
                                    if (var10 == 0) {
                                      break L25;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                L32: {
                                  if (-7 == (var6 ^ -1)) {
                                    break L32;
                                  } else {
                                    if ((var6 ^ -1) == -8) {
                                      vh.field_g = vh.field_g - ac.field_b;
                                      qd.field_M = qd.field_M - 1;
                                      if (var10 == 0) {
                                        break L25;
                                      } else {
                                        break L32;
                                      }
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                vh.field_g = vh.field_g - qd.field_M;
                                ac.field_b = ac.field_b - 1;
                                if (var10 == 0) {
                                  break L25;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            qd.field_M = qd.field_M - 1;
                            di.field_X = di.field_X + ac.field_b;
                            break L25;
                          }
                          L33: {
                            L34: {
                              var6 = (nk.field_w + m.field_e + (rg.field_sb - -lj.field_t)) % 4;
                              if (var6 != 0) {
                                break L34;
                              } else {
                                hl.field_b = hl.field_b + 1;
                                pn.field_b = pn.field_b + aa.field_b;
                                if (var10 == 0) {
                                  break L33;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L35: {
                              if ((var6 ^ -1) != -2) {
                                break L35;
                              } else {
                                pn.field_b = pn.field_b - aa.field_b;
                                hl.field_b = hl.field_b - 1;
                                if (var10 == 0) {
                                  break L33;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              if (var6 == 2) {
                                break L36;
                              } else {
                                if ((var6 ^ -1) == -4) {
                                  aa.field_b = aa.field_b - 1;
                                  pn.field_b = pn.field_b - hl.field_b;
                                  if (var10 == 0) {
                                    break L33;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  break L33;
                                }
                              }
                            }
                            aa.field_b = aa.field_b + 1;
                            pn.field_b = pn.field_b + hl.field_b;
                            break L33;
                          }
                          L37: {
                            if ((wj.field_j ^ -1) > -3) {
                              break L37;
                            } else {
                              if (!ee.e((byte) 75)) {
                                break L37;
                              } else {
                                if (var10 == 0) {
                                  continue L22;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                          L38: {
                            if (-3 >= (wj.field_j ^ -1)) {
                              if (-1 <= (ud.field_c ^ -1)) {
                                break L38;
                              } else {
                                L39: {
                                  od.field_i = od.field_i.substring(1) + ud.field_c;
                                  if (od.field_i.equalsIgnoreCase("megaslg")) {
                                    L40: {
                                      if (an.field_d) {
                                        stackOut_204_0 = 0;
                                        stackIn_205_0 = stackOut_204_0;
                                        break L40;
                                      } else {
                                        stackOut_202_0 = 1;
                                        stackIn_205_0 = stackOut_202_0;
                                        break L40;
                                      }
                                    }
                                    an.field_d = stackIn_205_0 != 0;
                                    qm.field_f = true;
                                    break L39;
                                  } else {
                                    break L39;
                                  }
                                }
                                L41: {
                                  if (od.field_i.equalsIgnoreCase("watrbmb")) {
                                    L42: {
                                      if (dg.field_b) {
                                        stackOut_212_0 = 0;
                                        stackIn_213_0 = stackOut_212_0;
                                        break L42;
                                      } else {
                                        stackOut_210_0 = 1;
                                        stackIn_213_0 = stackOut_210_0;
                                        break L42;
                                      }
                                    }
                                    dg.field_b = stackIn_213_0 != 0;
                                    qm.field_f = true;
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                                L43: {
                                  if (!od.field_i.equalsIgnoreCase("fartbmb")) {
                                    break L43;
                                  } else {
                                    L44: {
                                      if (rj.field_b) {
                                        stackOut_220_0 = 0;
                                        stackIn_221_0 = stackOut_220_0;
                                        break L44;
                                      } else {
                                        stackOut_218_0 = 1;
                                        stackIn_221_0 = stackOut_218_0;
                                        break L44;
                                      }
                                    }
                                    rj.field_b = stackIn_221_0 != 0;
                                    qm.field_f = true;
                                    break L43;
                                  }
                                }
                                L45: {
                                  if (!od.field_i.equalsIgnoreCase("oilybmb")) {
                                    break L45;
                                  } else {
                                    L46: {
                                      if (nk.field_p) {
                                        stackOut_228_0 = 0;
                                        stackIn_229_0 = stackOut_228_0;
                                        break L46;
                                      } else {
                                        stackOut_226_0 = 1;
                                        stackIn_229_0 = stackOut_226_0;
                                        break L46;
                                      }
                                    }
                                    nk.field_p = stackIn_229_0 != 0;
                                    qm.field_f = true;
                                    break L45;
                                  }
                                }
                                L47: {
                                  if (!od.field_i.equalsIgnoreCase("lavafld")) {
                                    break L47;
                                  } else {
                                    qm.field_f = true;
                                    je.field_u = je.field_N[cm.field_o];
                                    je.k();
                                    break L47;
                                  }
                                }
                                L48: {
                                  if (od.field_i.equalsIgnoreCase("prtyhrd")) {
                                    L49: {
                                      if (ba.field_M) {
                                        stackOut_239_0 = 0;
                                        stackIn_240_0 = stackOut_239_0;
                                        break L49;
                                      } else {
                                        stackOut_237_0 = 1;
                                        stackIn_240_0 = stackOut_237_0;
                                        break L49;
                                      }
                                    }
                                    ba.field_M = stackIn_240_0 != 0;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                }
                                L50: {
                                  if (!od.field_i.equalsIgnoreCase("hamyths")) {
                                    break L50;
                                  } else {
                                    qm.field_f = true;
                                    uf.field_p[jf.b((byte) 123)] = new gf(16, 4, 9);
                                    break L50;
                                  }
                                }
                                L51: {
                                  if (!od.field_i.equalsIgnoreCase("owalrus")) {
                                    break L51;
                                  } else {
                                    qm.field_f = true;
                                    uf.field_p[jf.b((byte) 92)] = new gf(16, 4, 19);
                                    break L51;
                                  }
                                }
                                L52: {
                                  if (od.field_i.equalsIgnoreCase("bigloot")) {
                                    qm.field_f = true;
                                    uf.field_p[jf.b((byte) 66)] = new gf(16, 4, 12);
                                    break L52;
                                  } else {
                                    break L52;
                                  }
                                }
                                if (od.field_i.equalsIgnoreCase("imgreat")) {
                                  L53: {
                                    L54: {
                                      qm.field_f = true;
                                      var6 = a.field_c;
                                      if (0 != a.field_c) {
                                        break L54;
                                      } else {
                                        a.field_c = a.field_c + 999;
                                        if (var10 == 0) {
                                          break L53;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                    L55: {
                                      if ((a.field_c ^ -1) <= -1001) {
                                        break L55;
                                      } else {
                                        a.field_c = 4999;
                                        if (var10 == 0) {
                                          break L53;
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                    L56: {
                                      if (a.field_c < 5000) {
                                        break L56;
                                      } else {
                                        L57: {
                                          if (a.field_c < 25000) {
                                            break L57;
                                          } else {
                                            L58: {
                                              if (-50001 >= (a.field_c ^ -1)) {
                                                break L58;
                                              } else {
                                                a.field_c = 99999;
                                                if (var10 == 0) {
                                                  break L53;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            }
                                            L59: {
                                              if ((a.field_c ^ -1) > -100001) {
                                                break L59;
                                              } else {
                                                L60: {
                                                  if (-200001 >= (a.field_c ^ -1)) {
                                                    break L60;
                                                  } else {
                                                    a.field_c = 499999;
                                                    if (var10 == 0) {
                                                      break L53;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                }
                                                L61: {
                                                  if (-500001 < (a.field_c ^ -1)) {
                                                    break L61;
                                                  } else {
                                                    if ((a.field_c ^ -1) <= -1000001) {
                                                      break L53;
                                                    } else {
                                                      a.field_c = 6000000;
                                                      if (var10 == 0) {
                                                        break L53;
                                                      } else {
                                                        break L61;
                                                      }
                                                    }
                                                  }
                                                }
                                                a.field_c = 999999;
                                                if (var10 == 0) {
                                                  break L53;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                            a.field_c = 199999;
                                            if (var10 == 0) {
                                              break L53;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        a.field_c = 49999;
                                        if (var10 == 0) {
                                          break L53;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    a.field_c = 24999;
                                    break L53;
                                  }
                                  L62: {
                                    var7 = -var6 + a.field_c;
                                    var8 = rg.field_sb % 3;
                                    if (var8 == 0) {
                                      break L62;
                                    } else {
                                      L63: {
                                        if (var8 == 1) {
                                          break L63;
                                        } else {
                                          var9 = var7 / 3;
                                          vh.field_g = vh.field_g - (-var9 + var7);
                                          di.field_X = di.field_X + var9;
                                          if (var10 == 0) {
                                            break L38;
                                          } else {
                                            break L63;
                                          }
                                        }
                                      }
                                      vh.field_g = vh.field_g - var7;
                                      if (var10 == 0) {
                                        break L38;
                                      } else {
                                        break L62;
                                      }
                                    }
                                  }
                                  di.field_X = di.field_X + var7;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                            } else {
                              break L38;
                            }
                          }
                          L64: {
                            if (-14 != (lj.field_t ^ -1)) {
                              break L64;
                            } else {
                              if (!ke.field_V) {
                                break L64;
                              } else {
                                if (15 != pl.field_h) {
                                  break L64;
                                } else {
                                  L65: {
                                    if (!this.field_K) {
                                      break L65;
                                    } else {
                                      if (!ak.a(-120)) {
                                        break L64;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                  fm.f((byte) 81);
                                  df.a(0, 5494, -1);
                                  ne.a(1, -90);
                                  al.e(107);
                                  this.field_K = true;
                                  break L64;
                                }
                              }
                            }
                          }
                          L66: {
                            if (ke.field_V) {
                              break L66;
                            } else {
                              if (!il.e(-31391)) {
                                break L66;
                              } else {
                                L67: {
                                  L68: {
                                    if (lj.field_t == 98) {
                                      break L68;
                                    } else {
                                      if (99 != lj.field_t) {
                                        break L67;
                                      } else {
                                        break L68;
                                      }
                                    }
                                  }
                                  this.field_O = true;
                                  of.field_a = true;
                                  break L67;
                                }
                                if (lj.field_t == 84) {
                                  L69: {
                                    this.q(-46);
                                    bj.a(-6358, ph.field_a);
                                    fm.f((byte) 81);
                                    if (kj.a(false)) {
                                      break L69;
                                    } else {
                                      jc.a(false, -107, 2);
                                      kd.a(cm.field_o, (byte) -106);
                                      if (!ig.a(-20144)) {
                                        break L66;
                                      } else {
                                        jc.a(false, -114, 5);
                                        if (var10 == 0) {
                                          break L66;
                                        } else {
                                          break L69;
                                        }
                                      }
                                    }
                                  }
                                  jc.a(false, -120, 6);
                                  break L66;
                                } else {
                                  break L66;
                                }
                              }
                            }
                          }
                          L70: {
                            if (!d.field_b) {
                              break L70;
                            } else {
                              if (lj.field_t != 82) {
                                break L70;
                              } else {
                                if (0 < gi.field_c) {
                                  break L70;
                                } else {
                                  L71: {
                                    if (qe.field_b[1]) {
                                      break L71;
                                    } else {
                                      if (!qe.field_b[0]) {
                                        break L70;
                                      } else {
                                        break L71;
                                      }
                                    }
                                  }
                                  if (!ke.field_V) {
                                    break L70;
                                  } else {
                                    L72: {
                                      gi.field_c = 25;
                                      if (sc.field_b) {
                                        ag.a(true, 10, 32 * hf.field_t, ca.field_k * 32);
                                        break L72;
                                      } else {
                                        break L72;
                                      }
                                    }
                                    L73: {
                                      if (!qe.field_b[1]) {
                                        break L73;
                                      } else {
                                        var6 = jf.b((byte) 110);
                                        uf.field_p[var6] = new gf(ca.field_k, hf.field_t, 7);
                                        cc.a(var6, 136989569);
                                        if (var10 == 0) {
                                          break L70;
                                        } else {
                                          break L73;
                                        }
                                      }
                                    }
                                    var6 = jf.b((byte) 101);
                                    uf.field_p[var6] = new gf(ca.field_k, hf.field_t, 6);
                                    fn.b(var6, 100);
                                    break L70;
                                  }
                                }
                              }
                            }
                          }
                          L74: {
                            if (!d.field_b) {
                              break L74;
                            } else {
                              if (-87 != (lj.field_t ^ -1)) {
                                break L74;
                              } else {
                                if ((gi.field_c ^ -1) < -1) {
                                  break L74;
                                } else {
                                  if (!qe.field_b[17]) {
                                    break L74;
                                  } else {
                                    if (!ke.field_V) {
                                      break L74;
                                    } else {
                                      L75: {
                                        gi.field_c = 25;
                                        if (!sc.field_b) {
                                          break L75;
                                        } else {
                                          ag.a(true, 26, 32 * hf.field_t, ca.field_k * 32);
                                          break L75;
                                        }
                                      }
                                      var6 = jf.b((byte) 88);
                                      uf.field_p[var6] = new gf(ca.field_k, hf.field_t, 20);
                                      cc.a(var6, 136989569);
                                      break L74;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L76: {
                            if (rj.field_f > 1) {
                              stackOut_401_0 = 0;
                              stackIn_402_0 = stackOut_401_0;
                              break L76;
                            } else {
                              stackOut_399_0 = 1;
                              stackIn_402_0 = stackOut_399_0;
                              break L76;
                            }
                          }
                          L77: {
                            var6 = stackIn_402_0;
                            if (!d.field_b) {
                              break L77;
                            } else {
                              if (-82 != (lj.field_t ^ -1)) {
                                break L77;
                              } else {
                                if (var6 == 0) {
                                  break L77;
                                } else {
                                  if (!qe.field_b[8]) {
                                    break L77;
                                  } else {
                                    if (!ke.field_V) {
                                      break L77;
                                    } else {
                                      L78: {
                                        L79: {
                                          if (je.c(ca.field_k, hf.field_t, 3, 3)) {
                                            break L79;
                                          } else {
                                            rj.field_f = 9;
                                            if (var10 == 0) {
                                              break L78;
                                            } else {
                                              break L79;
                                            }
                                          }
                                        }
                                        rj.field_f = 11;
                                        break L78;
                                      }
                                      kj.field_d = 0;
                                      break L77;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L80: {
                            if (2 > wj.field_j) {
                              break L80;
                            } else {
                              L81: {
                                if (!d.field_b) {
                                  break L81;
                                } else {
                                  if (86 != lj.field_t) {
                                    break L81;
                                  } else {
                                    if (-1 > (gi.field_c ^ -1)) {
                                      break L81;
                                    } else {
                                      if (ke.field_V) {
                                        gi.field_c = 25;
                                        if (dg.field_b) {
                                          ne.a(17, -126);
                                          uf.field_p[jf.b((byte) 78)] = new gf(ca.field_k, hf.field_t, 15);
                                          break L81;
                                        } else {
                                          break L81;
                                        }
                                      } else {
                                        break L81;
                                      }
                                    }
                                  }
                                }
                              }
                              L82: {
                                if (!d.field_b) {
                                  break L82;
                                } else {
                                  if (-81 != (lj.field_t ^ -1)) {
                                    break L82;
                                  } else {
                                    if (-1 > (gi.field_c ^ -1)) {
                                      break L82;
                                    } else {
                                      if (!ke.field_V) {
                                        break L82;
                                      } else {
                                        gi.field_c = 25;
                                        if (!rj.field_b) {
                                          break L82;
                                        } else {
                                          ne.a(17, 115);
                                          uf.field_p[jf.b((byte) 49)] = new gf(ca.field_k, hf.field_t, 18);
                                          break L82;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L83: {
                                if (!d.field_b) {
                                  break L83;
                                } else {
                                  if (1 != lj.field_t) {
                                    break L83;
                                  } else {
                                    if (gi.field_c > 0) {
                                      break L83;
                                    } else {
                                      if (!ke.field_V) {
                                        break L83;
                                      } else {
                                        gi.field_c = 25;
                                        if (!nk.field_p) {
                                          break L83;
                                        } else {
                                          ne.a(17, 93);
                                          uf.field_p[jf.b((byte) 52)] = new gf(ca.field_k, hf.field_t, 22);
                                          break L83;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L84: {
                                if ((ni.field_a ^ -1) == (lj.field_t ^ -1)) {
                                  qm.field_f = true;
                                  hf.field_t = hf.field_t + 4;
                                  mh.field_e[ca.field_k][hf.field_t].field_a = false;
                                  break L84;
                                } else {
                                  break L84;
                                }
                              }
                              L85: {
                                if ((lj.field_t ^ -1) == (pm.field_a ^ -1)) {
                                  qm.field_f = true;
                                  hf.field_t = hf.field_t - 4;
                                  mh.field_e[ca.field_k][hf.field_t].field_a = false;
                                  break L85;
                                } else {
                                  break L85;
                                }
                              }
                              L86: {
                                if (39 != lj.field_t) {
                                  break L86;
                                } else {
                                  L87: {
                                    stackOut_482_0 = this;
                                    stackIn_487_0 = stackOut_482_0;
                                    stackIn_483_0 = stackOut_482_0;
                                    if (this.field_V) {
                                      stackOut_487_0 = this;
                                      stackOut_487_1 = 0;
                                      stackIn_488_0 = stackOut_487_0;
                                      stackIn_488_1 = stackOut_487_1;
                                      break L87;
                                    } else {
                                      stackOut_483_0 = this;
                                      stackIn_485_0 = stackOut_483_0;
                                      stackOut_485_0 = this;
                                      stackOut_485_1 = 1;
                                      stackIn_488_0 = stackOut_485_0;
                                      stackIn_488_1 = stackOut_485_1;
                                      break L87;
                                    }
                                  }
                                  ((MinerDisturbance) (this)).field_V = stackIn_488_1 != 0;
                                  break L86;
                                }
                              }
                              L88: {
                                if (lj.field_t != 71) {
                                  break L88;
                                } else {
                                  if (!il.e(-31391)) {
                                    break L88;
                                  } else {
                                    this.field_T = this.field_T - 1;
                                    if (0 > this.field_T) {
                                      this.field_T = sl.field_u[pl.field_h].length - 1;
                                      break L88;
                                    } else {
                                      break L88;
                                    }
                                  }
                                }
                              }
                              if ((lj.field_t ^ -1) != -73) {
                                break L80;
                              } else {
                                if (!il.e(-31391)) {
                                  break L80;
                                } else {
                                  this.field_T = this.field_T + 1;
                                  if ((sl.field_u[pl.field_h].length + -1 ^ -1) >= (this.field_T ^ -1)) {
                                    this.field_T = 0;
                                    break L80;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                            }
                          }
                          L89: {
                            if (lj.field_t != 84) {
                              break L89;
                            } else {
                              this.field_K = hk.a(27);
                              if (ke.field_V) {
                                break L89;
                              } else {
                                if (!fl.field_d) {
                                  break L89;
                                } else {
                                  if (il.e(-31391)) {
                                    L90: {
                                      this.field_O = false;
                                      this.q(-46);
                                      bj.a(-6358, ph.field_a);
                                      fm.f((byte) 81);
                                      if (!kj.a(false)) {
                                        break L90;
                                      } else {
                                        jc.a(false, -125, 6);
                                        if (var10 == 0) {
                                          break L89;
                                        } else {
                                          break L90;
                                        }
                                      }
                                    }
                                    jc.a(false, -107, 2);
                                    kd.a(cm.field_o, (byte) -124);
                                    if (ig.a(-20144)) {
                                      jc.a(false, -123, 5);
                                      break L89;
                                    } else {
                                      break L89;
                                    }
                                  } else {
                                    break L89;
                                  }
                                }
                              }
                            }
                          }
                          if (var10 == 0) {
                            continue L22;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    break L23;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        ea var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_128_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_127_0 = 0;
        var10 = field_ab;
        try {
          L0: {
            if (param0 < -55) {
              if (kd.field_i) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (this.field_R > 0) {
                    L2: {
                      L3: {
                        if (-101 > (this.field_R ^ -1)) {
                          break L3;
                        } else {
                          var2_int = this.field_R + -40;
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (-241 > (this.field_R ^ -1)) {
                          break L4;
                        } else {
                          var2_int = 60;
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int = -this.field_R + 300;
                      break L2;
                    }
                    L5: {
                      L6: {
                        var3_int = var2_int;
                        if (-1 != (cm.field_o ^ -1)) {
                          break L6;
                        } else {
                          var4_ref_String = nm.field_c;
                          if (var10 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4_ref_String = wf.field_V;
                      break L5;
                    }
                    var5 = 320;
                    var6 = 1;
                    mm.field_a.b(var4_ref_String, var5 - 2, var3_int + pk.field_b.field_I, var6, -1);
                    var7_int = 16502531;
                    mm.field_a.b(var4_ref_String, 2 + var5, var3_int + pk.field_b.field_I, var6, -1);
                    mm.field_a.b(var4_ref_String, var5, -2 + (pk.field_b.field_I + var3_int), var6, -1);
                    mm.field_a.b(var4_ref_String, var5, 2 + (var3_int + pk.field_b.field_I), var6, -1);
                    mm.field_a.b(var4_ref_String, -1 + var5, var3_int + (pk.field_b.field_I + -1), var6, -1);
                    mm.field_a.b(var4_ref_String, var5 + 1, pk.field_b.field_I + var3_int + -1, var6, -1);
                    mm.field_a.b(var4_ref_String, var5 + -1, 1 + var3_int + pk.field_b.field_I, var6, -1);
                    mm.field_a.b(var4_ref_String, var5 + 1, 1 + (pk.field_b.field_I + var3_int), var6, -1);
                    mm.field_a.b(var4_ref_String, var5, pk.field_b.field_I + var3_int, var7_int, -1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ck.field_a.g(15, 369);
                eh.a(19, 373, 69, 463);
                var2_int = -this.field_H + (373 - (-90 + -ma.field_O.field_A));
                var3_int = -this.field_H + 373;
                L7: while (true) {
                  L8: {
                    L9: {
                      if ((var2_int ^ -1) >= (var3_int ^ -1)) {
                        break L9;
                      } else {
                        ma.field_O.g(19, var3_int);
                        var3_int = var3_int + ma.field_O.field_A;
                        if (var10 != 0) {
                          break L8;
                        } else {
                          if (var10 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    eh.a();
                    break L8;
                  }
                  L10: {
                    L11: {
                      if (-2 < (this.field_S ^ -1)) {
                        break L11;
                      } else {
                        L12: {
                          eh.d(this.field_F, 453, this.field_D[this.field_I] + 44, 452 - this.field_cb, 1);
                          var3_int = this.field_I + -1;
                          if ((var3_int ^ -1) > -1) {
                            var3_int = -1 + this.field_D.length;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var4 = 1;
                        L13: while (true) {
                          L14: {
                            L15: {
                              L16: {
                                L17: {
                                  if ((var4 ^ -1) <= (this.field_S ^ -1)) {
                                    break L17;
                                  } else {
                                    var5 = 1 + var3_int;
                                    stackOut_34_0 = this.field_D.length ^ -1;
                                    stackOut_34_1 = var5 ^ -1;
                                    stackIn_47_0 = stackOut_34_0;
                                    stackIn_47_1 = stackOut_34_1;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    if (var10 != 0) {
                                      L18: while (true) {
                                        if (stackIn_47_0 >= stackIn_47_1) {
                                          break L15;
                                        } else {
                                          eh.g(19, var5, 50, 1, var4);
                                          var4 -= 20;
                                          var5++;
                                          if (var10 != 0) {
                                            break L14;
                                          } else {
                                            if (var10 == 0) {
                                              stackOut_46_0 = var5;
                                              stackOut_46_1 = 382;
                                              stackIn_47_0 = stackOut_46_0;
                                              stackIn_47_1 = stackOut_46_1;
                                              continue L18;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L19: {
                                        if (stackIn_35_0 == stackIn_35_1) {
                                          var5 = 0;
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        L21: {
                                          eh.d(this.field_D[var5] + 44, 453 + (-(1 * var4) + -this.field_cb), this.field_D[var3_int] + 44, -(1 * (1 + var4)) - this.field_cb + 453, 1);
                                          if (0 < var3_int) {
                                            break L21;
                                          } else {
                                            var3_int = this.field_D.length - 1;
                                            if (var10 == 0) {
                                              break L20;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        var3_int--;
                                        break L20;
                                      }
                                      var4++;
                                      if (var10 == 0) {
                                        continue L13;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                var4 = 180;
                                var5 = 373;
                                L22: while (true) {
                                  stackOut_46_0 = var5;
                                  stackOut_46_1 = 382;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  if (stackIn_47_0 >= stackIn_47_1) {
                                    break L15;
                                  } else {
                                    eh.g(19, var5, 50, 1, var4);
                                    var4 -= 20;
                                    var5++;
                                    if (var10 != 0) {
                                      break L14;
                                    } else {
                                      if (var10 == 0) {
                                        continue L22;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              break L15;
                            }
                            var4 = 0;
                            break L14;
                          }
                          var5 = 454;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if (var5 >= 463) {
                                  break L25;
                                } else {
                                  eh.g(19, var5, 50, 1, var4);
                                  var4 += 20;
                                  var5++;
                                  if (var10 != 0) {
                                    break L24;
                                  } else {
                                    if (var10 == 0) {
                                      continue L23;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              ol.field_a.f(this.field_D[this.field_I] + (-(ol.field_a.field_x >> -540316255) + 44), -(ol.field_a.field_A >> 1387640641) + 453);
                              break L24;
                            }
                            if (var10 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    var3_int = 180;
                    var4 = 373;
                    L26: while (true) {
                      L27: {
                        L28: {
                          if (382 <= var4) {
                            break L28;
                          } else {
                            eh.g(19, var4, 50, 1, var3_int);
                            var3_int -= 20;
                            var4++;
                            if (var10 != 0) {
                              break L27;
                            } else {
                              if (var10 == 0) {
                                continue L26;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        var3_int = 0;
                        break L27;
                      }
                      var4 = 454;
                      L29: while (true) {
                        L30: {
                          if ((var4 ^ -1) <= -464) {
                            break L30;
                          } else {
                            eh.g(19, var4, 50, 1, var3_int);
                            var3_int += 20;
                            var4++;
                            if (var10 != 0) {
                              break L10;
                            } else {
                              if (var10 == 0) {
                                continue L29;
                              } else {
                                break L30;
                              }
                            }
                          }
                        }
                        ol.field_a.f(44 - (ol.field_a.field_x >> -1283850495), -(ol.field_a.field_A >> -25021343) + 453);
                        break L10;
                      }
                    }
                  }
                  L31: {
                    if (!qe.field_b[14]) {
                      break L31;
                    } else {
                      if (d.field_b) {
                        this.e(true);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                  }
                  om.a((byte) -112);
                  mc.field_u.f(0, 0);
                  fh.field_e.f(7, 0);
                  mh.field_d.f(628, 0);
                  ei.field_M.f(7, 472);
                  var3 = pi.field_b;
                  var3.f(-var3.field_x + 640, 0);
                  mm.field_a.c(Integer.toString(a.field_c), 627, 32, 16777215, -1);
                  var4 = 2;
                  var5 = 0;
                  var6 = 0;
                  var7 = new int[4];
                  var8 = 0;
                  L32: while (true) {
                    L33: {
                      L34: {
                        if (-22 >= (var8 ^ -1)) {
                          break L34;
                        } else {
                          stackOut_86_0 = var8;
                          stackIn_128_0 = stackOut_86_0;
                          stackIn_87_0 = stackOut_86_0;
                          if (var10 != 0) {
                            break L33;
                          } else {
                            L35: {
                              L36: {
                                if (stackIn_87_0 != 0) {
                                  break L36;
                                } else {
                                  if (!qe.field_b[1]) {
                                    break L36;
                                  } else {
                                    if (var10 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                              }
                              L37: {
                                if (2 != var8) {
                                  break L37;
                                } else {
                                  if (!qe.field_b[19]) {
                                    break L37;
                                  } else {
                                    if (var10 == 0) {
                                      break L35;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                              if (!qe.field_b[var8]) {
                                break L35;
                              } else {
                                L38: {
                                  ff.field_c[var8].f(var4, var5);
                                  if (var8 == pa.field_c) {
                                    L39: {
                                      L40: {
                                        eh.b(var7);
                                        eh.f(var4, var5 - -6, 33 + var4, var5 - -32);
                                        var9 = 65 + (int)(Math.sin(0.03 * (double)bf.field_d) * 130.0 + 0.5);
                                        if (var9 <= 0) {
                                          break L40;
                                        } else {
                                          ff.field_c[var8].g(var4, var5, var9);
                                          if (var10 == 0) {
                                            break L39;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                      ff.field_c[var8].c(var4, var5, var9 + 256);
                                      break L39;
                                    }
                                    eh.a(var7);
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                                L41: {
                                  if ((var8 ^ -1) != -21) {
                                    break L41;
                                  } else {
                                    eh.b(var7);
                                    var9 = 32 + -(qd.field_K * 32 / 100);
                                    eh.f(var4, var5 + 6, 33 + var4, var9 + (var5 + 6));
                                    ff.field_c[var8].c(var4, var5, 64);
                                    eh.a(var7);
                                    break L41;
                                  }
                                }
                                var6++;
                                var4 += 33;
                                if ((var6 ^ -1) < -9) {
                                  ff.field_c[21].f(var4, var5);
                                  var5 += 33;
                                  var4 = 4;
                                  var6 = 0;
                                  eh.a(0, 39, 640, 480);
                                  eh.b(var7);
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var8++;
                            if (var10 == 0) {
                              continue L32;
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                      stackOut_127_0 = 0;
                      stackIn_128_0 = stackOut_127_0;
                      break L33;
                    }
                    L42: {
                      if (stackIn_128_0 == var5) {
                        break L42;
                      } else {
                        eh.a(0, 45, 640, 480);
                        break L42;
                      }
                    }
                    L43: {
                      L44: {
                        ff.field_c[21].f(var4, var5);
                        eh.a();
                        var8 = pb.b(false);
                        if (var8 != 6) {
                          break L44;
                        } else {
                          bb.a(lb.field_t, 0, ce.field_d, 16513123, -6);
                          if (var10 == 0) {
                            break L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                      L45: {
                        if ((var8 ^ -1) != -1) {
                          break L45;
                        } else {
                          bb.a(lj.field_v, 0, ce.field_d, 16513123, -6);
                          if (var10 == 0) {
                            break L43;
                          } else {
                            break L45;
                          }
                        }
                      }
                      L46: {
                        if (var8 != 1) {
                          break L46;
                        } else {
                          bb.a(el.field_a, 0, ce.field_d, 16513123, -6);
                          if (var10 == 0) {
                            break L43;
                          } else {
                            break L46;
                          }
                        }
                      }
                      L47: {
                        if (var8 == 2) {
                          break L47;
                        } else {
                          L48: {
                            if (3 != var8) {
                              break L48;
                            } else {
                              bb.a(mg.field_b, 0, ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L48;
                              }
                            }
                          }
                          L49: {
                            if ((var8 ^ -1) != -8) {
                              break L49;
                            } else {
                              bb.a(bd.field_i, 0, ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L49;
                              }
                            }
                          }
                          L50: {
                            if (-10 != (var8 ^ -1)) {
                              break L50;
                            } else {
                              bb.a(oc.field_h, 0, ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L50;
                              }
                            }
                          }
                          L51: {
                            if ((var8 ^ -1) != -12) {
                              break L51;
                            } else {
                              bb.a(fg.field_e, 0, ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L51;
                              }
                            }
                          }
                          L52: {
                            if (8 != var8) {
                              break L52;
                            } else {
                              bb.a(hn.field_a, 0, ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L52;
                              }
                            }
                          }
                          L53: {
                            if ((var8 ^ -1) != -5) {
                              break L53;
                            } else {
                              bb.a(ei.field_K, 0, ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L53;
                              }
                            }
                          }
                          L54: {
                            if (-11 == (var8 ^ -1)) {
                              break L54;
                            } else {
                              L55: {
                                if (5 != var8) {
                                  break L55;
                                } else {
                                  bb.a(el.field_b, 0, ce.field_d, 16513123, -6);
                                  if (var10 == 0) {
                                    break L43;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                              L56: {
                                if (14 != var8) {
                                  break L56;
                                } else {
                                  bb.a(j.field_e, 0, ce.field_d, 16513123, -6);
                                  if (var10 == 0) {
                                    break L43;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                              L57: {
                                if (12 == var8) {
                                  break L57;
                                } else {
                                  L58: {
                                    if (13 != var8) {
                                      break L58;
                                    } else {
                                      bb.a(gd.field_z, 0, ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  L59: {
                                    if (1 != (var8 ^ -1)) {
                                      break L59;
                                    } else {
                                      bb.a(kb.field_d, 0, ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L59;
                                      }
                                    }
                                  }
                                  L60: {
                                    if (var8 != -3) {
                                      break L60;
                                    } else {
                                      bb.a(fd.field_W, 0, ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L60;
                                      }
                                    }
                                  }
                                  L61: {
                                    if (-20 != (var8 ^ -1)) {
                                      break L61;
                                    } else {
                                      bb.a(tj.field_c, 0, ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                  L62: {
                                    if ((var8 ^ -1) == -16) {
                                      break L62;
                                    } else {
                                      L63: {
                                        if (17 == var8) {
                                          break L63;
                                        } else {
                                          L64: {
                                            if ((var8 ^ -1) != -17) {
                                              break L64;
                                            } else {
                                              bb.a(g.field_e, 0, ce.field_d, 16513123, -6);
                                              if (var10 == 0) {
                                                break L43;
                                              } else {
                                                break L64;
                                              }
                                            }
                                          }
                                          L65: {
                                            if (18 != var8) {
                                              break L65;
                                            } else {
                                              bb.a(om.field_d, 0, ce.field_d, 16513123, -6);
                                              if (var10 == 0) {
                                                break L43;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                          if (20 != var8) {
                                            break L43;
                                          } else {
                                            bb.a(ti.field_P, 0, ce.field_d, 16513123, -6);
                                            if (var10 == 0) {
                                              break L43;
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                      }
                                      bb.a(tj.field_a, 0, ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L62;
                                      }
                                    }
                                  }
                                  bb.a(th.field_a, 0, ce.field_d, 16513123, -6);
                                  if (var10 == 0) {
                                    break L43;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                              bb.a(gi.field_b, 0, ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L54;
                              }
                            }
                          }
                          bb.a(tb.field_g, 0, ce.field_d, 16513123, -6);
                          if (var10 == 0) {
                            break L43;
                          } else {
                            break L47;
                          }
                        }
                      }
                      bb.a(hf.field_p, 0, ce.field_d, 16513123, -6);
                      break L43;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.DB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void e(byte param0) {
        if (param0 > -104) {
            return;
        }
        try {
            ke.field_V = false;
            mg.a((byte) -113);
            this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.CA(" + param0 + ')');
        }
    }

    public MinerDisturbance() {
        this.field_U = 0;
        this.field_Y = false;
        this.field_I = 0;
        this.field_E = 0;
        this.field_X = this.field_K;
        this.field_H = 0;
        this.field_M = 1;
        this.field_D = new int[80];
        this.field_O = false;
        this.field_F = 44;
        this.field_L = new int[9216];
    }

    static {
        field_J = 0;
    }
}
