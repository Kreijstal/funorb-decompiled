/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

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
                    boolean discarded$1 = var6.drawImage(pk.field_a, -152 + nk.field_x / 2, -18 + ml.field_a / 2, (java.awt.image.ImageObserver) null);
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
            stackOut_24_0 = (RuntimeException) var5_ref;
            stackOut_24_1 = new StringBuilder().append("MinerDisturbance.BB(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L11;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        try {
            ll.field_h = 38054639 ^ param0;
            if (param1 <= 114) {
                this.w(-76);
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "MinerDisturbance.RA(" + param0 + ',' + param1 + ')');
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
                ((MinerDisturbance) this).b(-82);
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
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.BA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void b(boolean param0) {
        Object var2_ref = null;
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
        var2_ref = null;
        var4 = field_ab;
        try {
          L0: {
            L1: {
              if (null == kf.field_d) {
                stackOut_4_0 = ef.field_c;
                stackIn_5_0 = (Object) (Object) stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = kf.field_d;
                stackIn_5_0 = (Object) (Object) stackOut_2_0;
                break L1;
              }
            }
            var2_ref = stackIn_5_0;
            if (!hl.b((byte) -125)) {
              if (!nn.field_n) {
                mf.a(-752960408, (java.awt.Canvas) var2_ref);
                return;
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
                              if (cm.field_o != 0) {
                                break L6;
                              } else {
                                if (qd.field_S) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if (cm.field_o != 1) {
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
                        if (((MinerDisturbance) this).field_Q != null) {
                          ((MinerDisturbance) this).field_Q.b(77);
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
                          eh.b(0, 0, 640, 480, 1, on.field_u << 1);
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
                        if (!((MinerDisturbance) this).field_V) {
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
                            if (me.field_h < 2000) {
                              stackOut_88_0 = (vm) (Object) stackIn_88_0;
                              stackOut_88_1 = (String) (Object) stackIn_88_1;
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
                              stackOut_86_0 = (vm) (Object) stackIn_86_0;
                              stackOut_86_1 = (String) (Object) stackIn_86_1;
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
                      cl.a((java.awt.Canvas) var2_ref, 0, 0, 310);
                      break L0;
                    }
                  }
                }
                pa.a(true, ec.field_f, 100.0f);
                mf.a(-752960408, (java.awt.Canvas) var2_ref);
                return;
              }
            } else {
              L19: {
                stackOut_6_0 = 240;
                stackOut_6_1 = var2_ref;
                stackIn_11_0 = stackOut_6_0;
                stackIn_11_1 = (RuntimeException) (Object) stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = (RuntimeException) (Object) stackOut_6_1;
                if (kf.field_d == null) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = (RuntimeException) (Object) stackIn_11_1;
                  stackOut_11_2 = rd.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2 ? 1 : 0;
                  break L19;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = (RuntimeException) (Object) stackIn_7_1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = (RuntimeException) (Object) stackIn_9_1;
                  stackOut_9_2 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_12_1 = stackOut_9_1;
                  stackIn_12_2 = stackOut_9_2;
                  break L19;
                }
              }
              wc.a(stackIn_12_0, (java.awt.Canvas) (Object) stackIn_12_1, stackIn_12_2 != 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.QA(" + param0 + ')');
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
                    return stackIn_13_0 != 0;
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
                        return stackIn_24_0 != 0;
                      } else {
                        if (null == je.field_z[0]) {
                          je.field_z[0] = md.a("snowleft", fl.field_f, 10, "supervolcano");
                          je.field_z[2] = md.a("snowright", fl.field_f, 10, "supervolcano");
                          je.field_z[1] = md.a("snowtop", fl.field_f, 10, "supervolcano");
                          je.field_z[3] = md.a("snowbottom", fl.field_f, 10, "supervolcano");
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0 != 0;
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
                                                    stackOut_51_0 = ~var3[var4];
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
                                      return stackIn_62_0 != 0;
                                    }
                                  }
                                } else {
                                  if (null != pf.field_a) {
                                    ci.field_b = true;
                                    stackOut_82_0 = 1;
                                    stackIn_83_0 = stackOut_82_0;
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
                                      stackOut_65_0 = ~var2_int;
                                      stackOut_65_1 = ~vc.field_o.length;
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
                                                    if (var4 < 0) {
                                                      break L15;
                                                    } else {
                                                      stackOut_70_0 = ~var3[var4];
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
                                        return stackIn_81_0 != 0;
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
                                return stackIn_41_0 != 0;
                              }
                            } else {
                              sa.field_t[1][0] = pb.a("supervolcano", fl.field_f, "rankings1", (byte) -77);
                              var2_array = tb.a("rankings2", "supervolcano", fl.field_f, 1);
                              ai.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) sa.field_t[1], 1, var2_array.length);
                              var2_array = tb.a("rankings3", "supervolcano", fl.field_f, 1);
                              ai.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) sa.field_t[1], 6, var2_array.length);
                              sa.field_t[1][8] = pb.a("supervolcano", fl.field_f, "rankings4", (byte) -77);
                              sa.field_t[1][9] = pb.a("supervolcano", fl.field_f, "rankings5", (byte) -77);
                              var3_int = 0;
                              L17: while (true) {
                                L18: {
                                  if (~var3_int <= ~sa.field_t[1].length) {
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
                                return stackIn_38_0 != 0;
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
                            return stackIn_32_0 != 0;
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
                      return stackIn_16_0 != 0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.KA(" + param0 + ')');
        }
        return stackIn_83_0 != 0;
    }

    private final void f(byte param0) {
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
                ((MinerDisturbance) this).field_O = false;
                break L1;
              }
            }
            L2: {
              pa.field_d = pa.field_d + 1;
              if (!ke.field_V) {
                break L2;
              } else {
                if (cm.field_o == 0) {
                  break L2;
                } else {
                  if (pj.field_a > 0) {
                    break L2;
                  } else {
                    cm.field_o = 0;
                    break L2;
                  }
                }
              }
            }
            L3: {
              int fieldTemp$2 = ((MinerDisturbance) this).field_P;
              ((MinerDisturbance) this).field_P = ((MinerDisturbance) this).field_P + 1;
              if (50 >= fieldTemp$2) {
                break L3;
              } else {
                ((MinerDisturbance) this).field_P = ((MinerDisturbance) this).field_P - 50;
                break L3;
              }
            }
            L4: {
              if (gi.field_c <= 0) {
                break L4;
              } else {
                gi.field_c = gi.field_c - 1;
                break L4;
              }
            }
            L5: {
              if (pa.field_d < 65536) {
                break L5;
              } else {
                pa.field_d = pa.field_d - 65536;
                break L5;
              }
            }
            L6: {
              if (null == ((MinerDisturbance) this).field_Q) {
                break L6;
              } else {
                if (fl.field_d) {
                  ((MinerDisturbance) this).field_Q.a(jk.field_ab, param0 + -12, gb.field_e, nk.field_w);
                  if (null == ((MinerDisturbance) this).field_Q) {
                    break L6;
                  } else {
                    if (((MinerDisturbance) this).field_Q.field_o) {
                      break L6;
                    } else {
                      return;
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
                if (on.field_u != 0) {
                  break L7;
                } else {
                  oc.f(-18627);
                  break L7;
                }
              }
            }
            L8: {
              L9: {
                if (((MinerDisturbance) this).field_K) {
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
                    ((MinerDisturbance) this).field_R = ((MinerDisturbance) this).field_R - 1;
                    this.u(-16506);
                    ((MinerDisturbance) this).field_cb = ((MinerDisturbance) this).field_cb + 1;
                    bf.field_d = bf.field_d + 1;
                    ((MinerDisturbance) this).field_I = ((MinerDisturbance) this).field_I + 1;
                    if (bf.field_d > 1000) {
                      pa.field_c = -1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    int fieldTemp$3 = ((MinerDisturbance) this).field_H;
                    ((MinerDisturbance) this).field_H = ((MinerDisturbance) this).field_H + 1;
                    if (fieldTemp$3 >= ma.field_O.field_A) {
                      ((MinerDisturbance) this).field_H = 0;
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
                    if (((MinerDisturbance) this).field_cb != 1) {
                      break L15;
                    } else {
                      ((MinerDisturbance) this).field_cb = 0;
                      break L15;
                    }
                  }
                  L16: {
                    if (79 <= ((MinerDisturbance) this).field_S) {
                      break L16;
                    } else {
                      ((MinerDisturbance) this).field_S = ((MinerDisturbance) this).field_S + 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (((MinerDisturbance) this).field_D.length != ((MinerDisturbance) this).field_I) {
                      break L17;
                    } else {
                      ((MinerDisturbance) this).field_I = 0;
                      break L17;
                    }
                  }
                  L18: {
                    var2_int = 6000 + -rg.field_sb;
                    if (var2_int <= 0) {
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
                    ((MinerDisturbance) this).field_D[((MinerDisturbance) this).field_I] = (24 * (ll.a((byte) -73, 1 + var4) * (ll.a((byte) -73, 3) + -1) + var4) / 100 + ll.a((byte) -73, 2)) * ((MinerDisturbance) this).field_M;
                    if (Math.abs(((MinerDisturbance) this).field_D[((MinerDisturbance) this).field_I]) > 25) {
                      ((MinerDisturbance) this).field_D[((MinerDisturbance) this).field_I] = 25 * ((MinerDisturbance) this).field_M;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    ((MinerDisturbance) this).field_M = ((MinerDisturbance) this).field_M * -1;
                    if (fl.field_d) {
                      pi.a(((MinerDisturbance) this).field_K, 2);
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
                          if (10 >= Math.abs(((MinerDisturbance) this).field_D[((MinerDisturbance) this).field_I])) {
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
                        ((MinerDisturbance) this).field_K = ak.a(40);
                        if (((MinerDisturbance) this).field_K) {
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
                        if (((MinerDisturbance) this).field_X) {
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
                            if (((MinerDisturbance) this).field_K) {
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
                      ((MinerDisturbance) this).field_X = ((MinerDisturbance) this).field_K;
                      break L22;
                    }
                  }
                  L29: {
                    ((MinerDisturbance) this).field_W = hf.field_t - 180;
                    ((MinerDisturbance) this).field_G = 180 + hf.field_t;
                    if (((MinerDisturbance) this).field_W < 0) {
                      ((MinerDisturbance) this).field_W = 0;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (((MinerDisturbance) this).field_Z >= ((MinerDisturbance) this).field_G) {
                      break L30;
                    } else {
                      ((MinerDisturbance) this).field_G = ((MinerDisturbance) this).field_Z;
                      break L30;
                    }
                  }
                  L31: {
                    L32: {
                      if (!((MinerDisturbance) this).field_eb) {
                        break L32;
                      } else {
                        if (((MinerDisturbance) this).field_G - ((MinerDisturbance) this).field_W > 0) {
                          ((MinerDisturbance) this).field_Z = ((MinerDisturbance) this).field_Z - 1;
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
                    if (((MinerDisturbance) this).field_Z < je.field_t) {
                      ((MinerDisturbance) this).field_Z = ((MinerDisturbance) this).field_Z + 1;
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
                  if (((MinerDisturbance) this).field_Y) {
                    break L33;
                  } else {
                    if (fl.field_d) {
                      pi.a(((MinerDisturbance) this).field_K, 2);
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
                if (pl.field_h != 15) {
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
                          if (var3 != 8) {
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
                          if (var3 != 9) {
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
                          if (var3 != 3) {
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
                            if (var3 != 6) {
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
                            if (var3 != 7) {
                              break L48;
                            } else {
                              if (var5 == 0) {
                                break L41;
                              } else {
                                break L48;
                              }
                            }
                          }
                          if (var3 == 10) {
                            break L41;
                          } else {
                            if (var3 == 1) {
                              break L41;
                            } else {
                              L49: {
                                if (var3 != 11) {
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
                if (di.field_Z == 20) {
                  L53: {
                    if (pl.field_h == 0) {
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
                    if (~var2_int > ~cm.field_r) {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.MA(" + param0 + ')');
        }
    }

    private final void t(int param0) {
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
                  if (var3 >= 640) {
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
                            if (var4 >= 480) {
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
                if (lj.field_r > 0) {
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
                if (var4 <= 4000) {
                  break L11;
                } else {
                  var4 = 4000;
                  break L11;
                }
              }
              L12: {
                if (var4 < 2000) {
                  var4 = 2000;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                var2_int = (int)(Math.sin((double)dl.field_c) * (double)var4) / 1000;
                var3 = (int)(Math.cos((double)(dl.field_c >> 1)) * (double)var4) / 1000;
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
              if (var3 >= -8) {
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
                              if (stackIn_47_0 == (Object) (Object) stackIn_47_1) {
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
                          if (var4 >= 1000) {
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
                                if (stackIn_59_0 != (Object) (Object) stackIn_59_1) {
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
                            if (var4 >= 1000) {
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
                                  if (stackIn_73_0 == (Object) (Object) stackIn_73_1) {
                                    break L27;
                                  } else {
                                    if (uf.field_p[var4].field_h < 12) {
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
                              if (var4 >= 1000) {
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
                                    if (stackIn_92_0 == (Object) (Object) stackIn_92_1) {
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
                        if (stackIn_92_0 == (Object) (Object) stackIn_92_1) {
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
                        if (var4 >= 1000) {
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
                      if (pl.field_h == 0) {
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
                      if (pl.field_h != 2) {
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
                      if (pl.field_h == 3) {
                        L44: {
                          rg.field_wb = rg.field_wb / 2;
                          bd.field_k = bd.field_k / 2;
                          if (je.e(ca.field_k, hf.field_t, 1, 1) < 5) {
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
                              if (cm.field_r <= 35) {
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
                          if (cm.field_r > 5) {
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
                          if (cm.field_r > 20) {
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
                      if (pl.field_h == 4) {
                        L55: {
                          if (cm.field_r < 50) {
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
                          if (pl.field_h == 13) {
                            break L57;
                          } else {
                            if (pl.field_h != 14) {
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
                        if (cm.field_r > 60) {
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
                      if (pl.field_h != 6) {
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
                              if (cm.field_r <= 55) {
                                break L62;
                              } else {
                                var6 = 54;
                                break L62;
                              }
                            }
                            if (cm.field_r > 60) {
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
                      int fieldTemp$1 = cm.field_r;
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
                      if (pl.field_h == 5) {
                        break L33;
                      } else {
                        if (pl.field_h == 0) {
                          break L33;
                        } else {
                          if (pl.field_h == 9) {
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
                                    if (pl.field_h != 2) {
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
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.EB(" + param0 + ')');
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
                  ((MinerDisturbance) this).field_O = false;
                  if (field_ab == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((MinerDisturbance) this).field_bb = gb.field_e;
              ((MinerDisturbance) this).field_C = nk.field_w;
              ((MinerDisturbance) this).field_O = true;
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
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.W(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException var2 = null;
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.OA(" + param0 + ')');
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
            ((MinerDisturbance) this).field_K = false;
            vk.field_a = cm.field_o;
            ((MinerDisturbance) this).a(3, a.field_c);
            ((MinerDisturbance) this).field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
            pl.field_h = 15;
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= 21) {
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
              ((MinerDisturbance) this).h((byte) 104);
              je.field_J = false;
              ke.field_V = false;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) (Object) runtimeException, "MinerDisturbance.VA(" + param0 + ')');
        }
    }

    private final void u(int param0) {
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
        int stackIn_201_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_233_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_239_1 = 0;
        int stackIn_276_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_286_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_316_0 = 0;
        boolean stackIn_354_0 = false;
        boolean stackIn_355_0 = false;
        boolean stackIn_356_0 = false;
        boolean stackIn_357_0 = false;
        int stackIn_357_1 = 0;
        int stackIn_502_0 = 0;
        int stackIn_556_0 = 0;
        int stackIn_558_0 = 0;
        int stackIn_626_0 = 0;
        int stackIn_1148_0 = 0;
        int stackIn_1446_0 = 0;
        je stackIn_1792_0 = null;
        je stackIn_1793_0 = null;
        je stackIn_1794_0 = null;
        int stackIn_1794_1 = 0;
        int stackIn_1805_0 = 0;
        int stackIn_1818_0 = 0;
        int stackIn_1829_0 = 0;
        int stackIn_1840_0 = 0;
        int stackIn_1853_0 = 0;
        int stackIn_1864_0 = 0;
        int stackIn_1877_0 = 0;
        int stackIn_1890_0 = 0;
        int stackIn_1910_0 = 0;
        int stackIn_2024_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_231_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_238_1 = 0;
        int stackOut_274_0 = 0;
        int stackOut_275_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_302_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_314_0 = 0;
        boolean stackOut_353_0 = false;
        boolean stackOut_356_0 = false;
        int stackOut_356_1 = 0;
        boolean stackOut_354_0 = false;
        boolean stackOut_355_0 = false;
        int stackOut_355_1 = 0;
        int stackOut_500_0 = 0;
        int stackOut_501_0 = 0;
        int stackOut_557_0 = 0;
        int stackOut_555_0 = 0;
        int stackOut_556_0 = 0;
        int stackOut_624_0 = 0;
        int stackOut_625_0 = 0;
        int stackOut_1147_0 = 0;
        int stackOut_1146_0 = 0;
        int stackOut_1444_0 = 0;
        int stackOut_1445_0 = 0;
        je stackOut_1791_0 = null;
        je stackOut_1793_0 = null;
        int stackOut_1793_1 = 0;
        je stackOut_1792_0 = null;
        int stackOut_1792_1 = 0;
        int stackOut_1803_0 = 0;
        int stackOut_1804_0 = 0;
        int stackOut_1816_0 = 0;
        int stackOut_1817_0 = 0;
        int stackOut_1827_0 = 0;
        int stackOut_1828_0 = 0;
        int stackOut_1838_0 = 0;
        int stackOut_1839_0 = 0;
        int stackOut_1851_0 = 0;
        int stackOut_1852_0 = 0;
        int stackOut_1862_0 = 0;
        int stackOut_1863_0 = 0;
        int stackOut_1875_0 = 0;
        int stackOut_1876_0 = 0;
        int stackOut_1888_0 = 0;
        int stackOut_1889_0 = 0;
        int stackOut_1909_0 = 0;
        int stackOut_1908_0 = 0;
        int stackOut_2023_0 = 0;
        int stackOut_2022_0 = 0;
        L0: {
          var21 = field_ab;
          ce.field_b = ce.field_b + 1;
          if (hf.field_t < 1) {
            hf.field_t = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (ce.field_b <= 2560) {
            break L1;
          } else {
            ce.field_b = ce.field_b - 2560;
            break L1;
          }
        }
        L2: {
          if (~je.field_N[cm.field_o] >= ~je.field_u) {
            break L2;
          } else {
            if (~hf.field_t >= ~(-24 + je.field_t)) {
              break L2;
            } else {
              je.k();
              ic.field_k = ic.field_k + 6000;
              if (ic.field_k <= 6000) {
                break L2;
              } else {
                ic.field_k = 6000;
                break L2;
              }
            }
          }
        }
        L3: {
          if (~je.field_N[cm.field_o] >= ~je.field_u) {
            break L3;
          } else {
            L4: {
              if (rg.field_sb <= 0) {
                break L4;
              } else {
                if (ic.field_k <= 0) {
                  break L3;
                } else {
                  ic.field_k = ic.field_k - 1;
                  if (var21 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
            }
            je.field_u = je.field_N[cm.field_o];
            je.k();
            if (me.field_h < 2000) {
              fn.a(31, 224, 3);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L5: {
          L6: {
            L7: {
              if (cn.field_C > -300) {
                break L7;
              } else {
                if (1 == cm.field_o) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            if (kn.field_E > 0) {
              break L5;
            } else {
              break L6;
            }
          }
          if (ke.field_V) {
            break L5;
          } else {
            if (pl.field_h != 15) {
              break L5;
            } else {
              ((MinerDisturbance) this).h((byte) 113);
              break L5;
            }
          }
        }
        L8: {
          L9: {
            L10: {
              var2_int = bl.g(param0 ^ param0) ? 1 : 0;
              if (!il.e(param0 ^ 15079)) {
                break L10;
              } else {
                if (ke.field_V) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
            if (sc.field_b) {
              L11: {
                if (!mh.field_e[ca.field_k][hf.field_t].field_a) {
                  break L11;
                } else {
                  if (mh.field_e[ca.field_k][hf.field_t].field_v) {
                    break L11;
                  } else {
                    ag.a(true, 15, 32 * hf.field_t, 32 * ca.field_k);
                    if (var21 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              if (!mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                break L8;
              } else {
                if (mh.field_e[ca.field_k][hf.field_t + -1].field_S) {
                  ag.a(true, 4, 32 * (-1 + hf.field_t), 32 * ca.field_k);
                  if (var21 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                } else {
                  break L8;
                }
              }
            } else {
              break L8;
            }
          }
          cm.field_r = cm.field_r + 1;
          if (cm.field_r <= 50) {
            break L8;
          } else {
            this.e((byte) -109);
            break L8;
          }
        }
        L12: {
          if (pl.field_h != 15) {
            break L12;
          } else {
            if (field_J < 0) {
              break L12;
            } else {
              field_J = field_J + 1;
              if (field_J > 100) {
                fn.a(29, 226, 3);
                break L12;
              } else {
                break L12;
              }
            }
          }
        }
        L13: {
          L14: {
            L15: {
              var3 = this.v(-1);
              if (oe.field_b) {
                break L15;
              } else {
                int fieldTemp$5 = jh.field_a;
                jh.field_a = jh.field_a + 1;
                if (7 < fieldTemp$5) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            L16: {
              if (!oe.field_b) {
                break L16;
              } else {
                jh.field_a = 0;
                break L16;
              }
            }
            var3++;
            if (var21 == 0) {
              break L13;
            } else {
              break L14;
            }
          }
          L17: {
            var4 = di.a(true);
            if (~var4 <= ~var3) {
              break L17;
            } else {
              this.a(var3, (byte) 122);
              break L17;
            }
          }
          var3 = 0;
          break L13;
        }
        this.a((byte) -123, var3);
        oe.field_b = false;
        var4 = 0;
        L18: while (true) {
          L19: {
            L20: {
              L21: {
                if (var4 >= 1000) {
                  break L21;
                } else {
                  if (var21 != 0) {
                    break L20;
                  } else {
                    L22: {
                      if (uf.field_p[var4] != null) {
                        uf.field_p[var4] = uf.field_p[var4].d(true);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    var4++;
                    if (var21 == 0) {
                      continue L18;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              L23: {
                if (gm.field_a) {
                  break L23;
                } else {
                  if (ke.field_V) {
                    break L19;
                  } else {
                    if (pl.field_h != 15) {
                      break L19;
                    } else {
                      int fieldTemp$6 = ca.field_g;
                      ca.field_g = ca.field_g + 1;
                      if (9000 < fieldTemp$6) {
                        gm.field_a = true;
                        if (var21 == 0) {
                          break L19;
                        } else {
                          break L23;
                        }
                      } else {
                        break L19;
                      }
                    }
                  }
                }
              }
              ((MinerDisturbance) this).h((byte) -128);
              ke.field_V = false;
              break L20;
            }
            gm.field_a = false;
            break L19;
          }
          L24: {
            L25: {
              if (ke.field_V) {
                break L25;
              } else {
                if (15 == pl.field_h) {
                  break L25;
                } else {
                  je.field_l = je.field_l + 0.1;
                  if (var21 == 0) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
            }
            L26: {
              if (lj.field_r > 0) {
                rg.field_sb = rg.field_sb - 1;
                lj.field_r = lj.field_r - (1 + lj.field_r / 10);
                break L26;
              } else {
                break L26;
              }
            }
            nd.field_d.a(param0 ^ 16444);
            je.d();
            break L24;
          }
          L27: {
            L28: {
              if (kd.field_i) {
                break L28;
              } else {
                db.field_d = 16 + hf.field_t * 32 + mf.field_i / 10 + -240;
                if (var21 == 0) {
                  break L27;
                } else {
                  break L28;
                }
              }
            }
            L29: {
              if (~(mf.field_i / 10 + (32 * hf.field_t - 224)) < ~db.field_d) {
                break L29;
              } else {
                kd.field_i = false;
                if (var21 == 0) {
                  break L27;
                } else {
                  break L29;
                }
              }
            }
            db.field_d = db.field_d + 1;
            break L27;
          }
          L30: {
            L31: {
              li.field_c = -304 + (sk.field_d / 10 + 32 * ca.field_k);
              if (a.field_c > 0) {
                break L31;
              } else {
                if (~je.field_u == ~je.field_N[cm.field_o]) {
                  break L31;
                } else {
                  if (hf.field_t >= 2) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
              }
            }
            if (ca.field_k != 16) {
              break L30;
            } else {
              if (hf.field_t > 3) {
                break L30;
              } else {
                if (15 != pl.field_h) {
                  break L30;
                } else {
                  if (ke.field_V) {
                    L32: {
                      L33: {
                        pl.field_h = 0;
                        var3 = this.v(-1);
                        var4 = di.a(true);
                        this.a(0, (byte) 123);
                        this.a((byte) -44, 0);
                        if (var3 > 500) {
                          break L33;
                        } else {
                          if (500 < var4) {
                            break L33;
                          } else {
                            break L32;
                          }
                        }
                      }
                      fn.a(33, 222, 3);
                      break L32;
                    }
                    L34: {
                      if (!je.field_J) {
                        break L34;
                      } else {
                        if (gj.a(18740, 0)) {
                          fn.a(32, 223, 3);
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                    }
                    L35: {
                      di.field_Z = 0;
                      if (10 > nm.field_g[4]) {
                        break L35;
                      } else {
                        if (ke.field_V) {
                          fn.a(13, 242, param0 + 16509);
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L36: {
                      if (25 > jc.field_H) {
                        break L36;
                      } else {
                        if (ke.field_V) {
                          fn.a(12, 243, param0 + 16509);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                    ke.field_V = false;
                    ((MinerDisturbance) this).field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
                    cm.field_r = 0;
                    if (wf.q(88)) {
                      L37: {
                        a.field_c = a.field_c * 2;
                        var5 = a.field_c / 2;
                        var6 = rg.field_sb % 3;
                        if (var6 == 0) {
                          break L37;
                        } else {
                          L38: {
                            if (var6 == 1) {
                              break L38;
                            } else {
                              var7 = var5 / 3;
                              di.field_X = di.field_X + var7;
                              vh.field_g = vh.field_g - (-var7 + var5);
                              if (var21 == 0) {
                                break L30;
                              } else {
                                break L38;
                              }
                            }
                          }
                          vh.field_g = vh.field_g - var5;
                          if (var21 == 0) {
                            break L30;
                          } else {
                            break L37;
                          }
                        }
                      }
                      di.field_X = di.field_X + var5;
                      break L30;
                    } else {
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
              }
            }
          }
          L39: {
            if (li.field_c < 16) {
              li.field_c = 16;
              break L39;
            } else {
              break L39;
            }
          }
          L40: {
            if (~(-544 + 32 * je.field_t) > ~db.field_d) {
              db.field_d = -64 + 32 * je.field_t - 480;
              break L40;
            } else {
              break L40;
            }
          }
          L41: {
            if (368 < li.field_c) {
              li.field_c = 368;
              break L41;
            } else {
              break L41;
            }
          }
          L42: {
            if (16 <= db.field_d) {
              break L42;
            } else {
              db.field_d = 16;
              break L42;
            }
          }
          L43: {
            if (ke.field_V) {
              break L43;
            } else {
              if (!il.e(-31391)) {
                break L43;
              } else {
                rg.field_wb = 0;
                bd.field_k = 0;
                break L43;
              }
            }
          }
          L44: {
            L45: {
              if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                break L45;
              } else {
                pc.field_k = 0;
                if (var21 == 0) {
                  break L44;
                } else {
                  break L45;
                }
              }
            }
            ul.field_b = 0;
            pc.field_k = pc.field_k + 1;
            break L44;
          }
          L46: {
            if (pc.field_k <= 5) {
              break L46;
            } else {
              L47: {
                if (tc.field_s > 0) {
                  tc.field_s = tc.field_s - 1;
                  je.field_O.a((ca.field_k << 2) - -1, 88, (hf.field_t << 2) - 1, true);
                  break L47;
                } else {
                  break L47;
                }
              }
              pc.field_k = 0;
              break L46;
            }
          }
          L48: {
            var4 = fn.a(true) ? 1 : 0;
            if (var4 == 0) {
              break L48;
            } else {
              if (tc.field_s >= 4) {
                break L48;
              } else {
                L49: {
                  if (qd.field_K >= 100) {
                    break L49;
                  } else {
                    qd.field_K = qd.field_K + 1;
                    break L49;
                  }
                }
                if (!qe.field_b[15]) {
                  tc.field_s = tc.field_s + 1;
                  je.field_O.e(hf.field_t, ca.field_k, (byte) 83);
                  break L48;
                } else {
                  break L48;
                }
              }
            }
          }
          L50: {
            if (tc.field_s <= 0) {
              break L50;
            } else {
              ag.a(true, 31, hf.field_t * 32, ca.field_k * 32);
              break L50;
            }
          }
          L51: {
            L52: {
              if (!qd.field_O[98]) {
                break L52;
              } else {
                if (qd.field_O[86]) {
                  break L51;
                } else {
                  break L52;
                }
              }
            }
            if (ca.c(-2302)) {
              break L51;
            } else {
              if ((dl.field_c & 7) != 0) {
                break L51;
              } else {
                if (100 > qd.field_K) {
                  qd.field_K = qd.field_K + 1;
                  break L51;
                } else {
                  break L51;
                }
              }
            }
          }
          L53: {
            L54: {
              if (!ke.field_V) {
                break L54;
              } else {
                if (pl.field_h != 15) {
                  break L54;
                } else {
                  stackOut_199_0 = 1;
                  stackIn_201_0 = stackOut_199_0;
                  break L53;
                }
              }
            }
            stackOut_200_0 = 0;
            stackIn_201_0 = stackOut_200_0;
            break L53;
          }
          L55: {
            d.field_b = stackIn_201_0 != 0;
            if (tc.field_t <= 0) {
              break L55;
            } else {
              tc.field_t = tc.field_t - 1;
              break L55;
            }
          }
          L56: {
            L57: {
              if (ke.field_V) {
                break L57;
              } else {
                if (pl.field_h != 15) {
                  break L57;
                } else {
                  stackOut_206_0 = 1;
                  stackIn_208_0 = stackOut_206_0;
                  break L56;
                }
              }
            }
            stackOut_207_0 = 0;
            stackIn_208_0 = stackOut_207_0;
            break L56;
          }
          L58: {
            var5 = stackIn_208_0;
            if (var5 == 0) {
              break L58;
            } else {
              hf.field_r = hf.field_r - 1;
              if (0 < hf.field_r) {
                break L58;
              } else {
                if (sk.field_d > 160) {
                  break L58;
                } else {
                  if (sk.field_d >= -160) {
                    hf.field_r = 50;
                    var6 = 0;
                    var7 = 1;
                    L59: while (true) {
                      L60: {
                        L61: {
                          if (var7 >= 5) {
                            break L61;
                          } else {
                            stackOut_218_0 = -1;
                            stackOut_218_1 = ~(-var7 + hf.field_t);
                            stackIn_239_0 = stackOut_218_0;
                            stackIn_239_1 = stackOut_218_1;
                            stackIn_219_0 = stackOut_218_0;
                            stackIn_219_1 = stackOut_218_1;
                            if (var21 != 0) {
                              break L60;
                            } else {
                              if (stackIn_219_0 < stackIn_219_1) {
                                break L61;
                              } else {
                                L62: {
                                  L63: {
                                    if (mh.field_e[ca.field_k][hf.field_t + -var7].field_a) {
                                      break L63;
                                    } else {
                                      if (mh.field_e[-1 + ca.field_k][hf.field_t - var7].field_a) {
                                        break L63;
                                      } else {
                                        if (mh.field_e[ca.field_k + 1][hf.field_t - var7].field_a) {
                                          break L63;
                                        } else {
                                          break L62;
                                        }
                                      }
                                    }
                                  }
                                  L64: {
                                    L65: {
                                      if (!mh.field_e[ca.field_k][-var7 + hf.field_t].field_S) {
                                        break L65;
                                      } else {
                                        if (!mh.field_e[ca.field_k][-var7 + hf.field_t].field_a) {
                                          break L65;
                                        } else {
                                          stackOut_231_0 = 1;
                                          stackIn_233_0 = stackOut_231_0;
                                          break L64;
                                        }
                                      }
                                    }
                                    stackOut_232_0 = 0;
                                    stackIn_233_0 = stackOut_232_0;
                                    break L64;
                                  }
                                  var6 = stackIn_233_0;
                                  if (!mh.field_e[ca.field_k][hf.field_t - var7].field_a) {
                                    break L62;
                                  } else {
                                    if (var21 == 0) {
                                      break L61;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                                var7++;
                                if (var21 == 0) {
                                  continue L59;
                                } else {
                                  break L61;
                                }
                              }
                            }
                          }
                        }
                        stackOut_238_0 = 12;
                        stackOut_238_1 = ca.field_k;
                        stackIn_239_0 = stackOut_238_0;
                        stackIn_239_1 = stackOut_238_1;
                        break L60;
                      }
                      L66: {
                        L67: {
                          if (stackIn_239_0 <= stackIn_239_1) {
                            break L67;
                          } else {
                            ((MinerDisturbance) this).field_E = 1;
                            if (var21 == 0) {
                              break L66;
                            } else {
                              break L67;
                            }
                          }
                        }
                        if (20 >= ca.field_k) {
                          break L66;
                        } else {
                          ((MinerDisturbance) this).field_E = 2;
                          break L66;
                        }
                      }
                      L68: {
                        L69: {
                          L70: {
                            if (((MinerDisturbance) this).field_E == 1) {
                              break L70;
                            } else {
                              L71: {
                                if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                                  break L71;
                                } else {
                                  if (sk.field_d <= -30) {
                                    break L70;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                              if (((MinerDisturbance) this).field_U != 1) {
                                break L69;
                              } else {
                                break L70;
                              }
                            }
                          }
                          L72: {
                            L73: {
                              L74: {
                                if (!mh.field_e[ca.field_k - -1][hf.field_t].field_a) {
                                  break L74;
                                } else {
                                  if (30 <= sk.field_d) {
                                    break L73;
                                  } else {
                                    break L74;
                                  }
                                }
                              }
                              if (((MinerDisturbance) this).field_U != 4) {
                                break L72;
                              } else {
                                break L73;
                              }
                            }
                            ((MinerDisturbance) this).field_E = 0;
                            if (var21 == 0) {
                              break L68;
                            } else {
                              break L72;
                            }
                          }
                          ((MinerDisturbance) this).field_E = 1;
                          if (var21 == 0) {
                            break L68;
                          } else {
                            break L69;
                          }
                        }
                        ((MinerDisturbance) this).field_E = 2;
                        break L68;
                      }
                      L75: {
                        L76: {
                          L77: {
                            if (var6 != 0) {
                              break L77;
                            } else {
                              if (var2_int == 0) {
                                break L77;
                              } else {
                                if (kn.field_E > 250) {
                                  break L76;
                                } else {
                                  break L77;
                                }
                              }
                            }
                          }
                          ((MinerDisturbance) this).field_U = 0;
                          if (var21 == 0) {
                            break L75;
                          } else {
                            break L76;
                          }
                        }
                        L78: {
                          L79: {
                            if (!mh.field_e[ca.field_k][1 + hf.field_t].field_a) {
                              break L79;
                            } else {
                              if (mh.field_e[ca.field_k][1 + hf.field_t].field_b) {
                                break L79;
                              } else {
                                stackOut_274_0 = 1;
                                stackIn_276_0 = stackOut_274_0;
                                break L78;
                              }
                            }
                          }
                          stackOut_275_0 = 0;
                          stackIn_276_0 = stackOut_275_0;
                          break L78;
                        }
                        L80: {
                          L81: {
                            var7 = stackIn_276_0;
                            if (!mh.field_e[ca.field_k - -1][hf.field_t].field_a) {
                              break L81;
                            } else {
                              if (mh.field_e[1 + ca.field_k][hf.field_t].field_b) {
                                break L81;
                              } else {
                                stackOut_279_0 = 1;
                                stackIn_281_0 = stackOut_279_0;
                                break L80;
                              }
                            }
                          }
                          stackOut_280_0 = 0;
                          stackIn_281_0 = stackOut_280_0;
                          break L80;
                        }
                        L82: {
                          L83: {
                            var8 = stackIn_281_0;
                            if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                              break L83;
                            } else {
                              if (mh.field_e[ca.field_k - 1][hf.field_t].field_b) {
                                break L83;
                              } else {
                                stackOut_284_0 = 1;
                                stackIn_286_0 = stackOut_284_0;
                                break L82;
                              }
                            }
                          }
                          stackOut_285_0 = 0;
                          stackIn_286_0 = stackOut_285_0;
                          break L82;
                        }
                        L84: {
                          L85: {
                            var9 = stackIn_286_0;
                            if (!mh.field_e[ca.field_k][hf.field_t - 1].field_a) {
                              break L85;
                            } else {
                              if (mh.field_e[ca.field_k][hf.field_t + -1].field_b) {
                                break L85;
                              } else {
                                L86: {
                                  L87: {
                                    if (di.field_K <= 0) {
                                      break L87;
                                    } else {
                                      if (mh.field_e[1 + ca.field_k][hf.field_t + -1].field_b) {
                                        break L87;
                                      } else {
                                        if (!mh.field_e[ca.field_k + 1][hf.field_t].field_b) {
                                          break L86;
                                        } else {
                                          break L87;
                                        }
                                      }
                                    }
                                  }
                                  if (0 <= di.field_K) {
                                    break L85;
                                  } else {
                                    if (mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_b) {
                                      break L85;
                                    } else {
                                      if (mh.field_e[ca.field_k + -1][hf.field_t].field_b) {
                                        break L85;
                                      } else {
                                        break L86;
                                      }
                                    }
                                  }
                                }
                                stackOut_301_0 = 1;
                                stackIn_303_0 = stackOut_301_0;
                                break L84;
                              }
                            }
                          }
                          stackOut_302_0 = 0;
                          stackIn_303_0 = stackOut_302_0;
                          break L84;
                        }
                        L88: {
                          L89: {
                            L90: {
                              L91: {
                                var10 = stackIn_303_0;
                                if (var8 == 0) {
                                  break L91;
                                } else {
                                  if (1 == ((MinerDisturbance) this).field_U) {
                                    break L90;
                                  } else {
                                    break L91;
                                  }
                                }
                              }
                              if (var9 == 0) {
                                break L89;
                              } else {
                                if (((MinerDisturbance) this).field_U != 4) {
                                  break L89;
                                } else {
                                  break L90;
                                }
                              }
                            }
                            if (((MinerDisturbance) this).field_U == 5) {
                              break L89;
                            } else {
                              if (2 != ((MinerDisturbance) this).field_U) {
                                stackOut_315_0 = 0;
                                stackIn_316_0 = stackOut_315_0;
                                break L88;
                              } else {
                                break L89;
                              }
                            }
                          }
                          stackOut_314_0 = 1;
                          stackIn_316_0 = stackOut_314_0;
                          break L88;
                        }
                        var11 = stackIn_316_0;
                        if (var11 != 0) {
                          L92: {
                            if (var7 == 0) {
                              break L92;
                            } else {
                              if (((MinerDisturbance) this).field_U == 2) {
                                break L92;
                              } else {
                                ((MinerDisturbance) this).field_U = 2;
                                if (var21 == 0) {
                                  break L75;
                                } else {
                                  break L92;
                                }
                              }
                            }
                          }
                          L93: {
                            L94: {
                              if (var8 == 0) {
                                break L94;
                              } else {
                                if (((MinerDisturbance) this).field_U != 4) {
                                  break L93;
                                } else {
                                  if (((MinerDisturbance) this).field_E == 1) {
                                    break L93;
                                  } else {
                                    break L94;
                                  }
                                }
                              }
                            }
                            L95: {
                              L96: {
                                if (var9 == 0) {
                                  break L96;
                                } else {
                                  if (((MinerDisturbance) this).field_U != 1) {
                                    break L95;
                                  } else {
                                    if (2 == ((MinerDisturbance) this).field_E) {
                                      break L95;
                                    } else {
                                      break L96;
                                    }
                                  }
                                }
                              }
                              L97: {
                                if (var10 == 0) {
                                  break L97;
                                } else {
                                  ((MinerDisturbance) this).field_U = 5;
                                  if (var21 == 0) {
                                    break L75;
                                  } else {
                                    break L97;
                                  }
                                }
                              }
                              ((MinerDisturbance) this).field_U = 0;
                              if (var21 == 0) {
                                break L75;
                              } else {
                                break L95;
                              }
                            }
                            ((MinerDisturbance) this).field_U = 4;
                            if (var21 == 0) {
                              break L75;
                            } else {
                              break L93;
                            }
                          }
                          ((MinerDisturbance) this).field_U = 1;
                          break L75;
                        } else {
                          break L75;
                        }
                      }
                      L98: {
                        L99: {
                          L100: {
                            if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_b) {
                              break L100;
                            } else {
                              if (!mh.field_e[1 + ca.field_k][hf.field_t].field_b) {
                                break L100;
                              } else {
                                if (mh.field_e[ca.field_k][1 + hf.field_t].field_b) {
                                  break L99;
                                } else {
                                  break L100;
                                }
                              }
                            }
                          }
                          if (je.c(ca.field_k, hf.field_t, 3, 3)) {
                            break L98;
                          } else {
                            if (!mh.field_e[ca.field_k + -1][hf.field_t].field_b) {
                              break L98;
                            } else {
                              L101: {
                                stackOut_353_0 = mh.field_e[1 + ca.field_k][hf.field_t].field_b;
                                stackIn_356_0 = stackOut_353_0;
                                stackIn_354_0 = stackOut_353_0;
                                if (mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                                  stackOut_356_0 = stackIn_356_0;
                                  stackOut_356_1 = 0;
                                  stackIn_357_0 = stackOut_356_0;
                                  stackIn_357_1 = stackOut_356_1;
                                  break L101;
                                } else {
                                  stackOut_354_0 = stackIn_354_0;
                                  stackIn_355_0 = stackOut_354_0;
                                  stackOut_355_0 = stackIn_355_0;
                                  stackOut_355_1 = 1;
                                  stackIn_357_0 = stackOut_355_0;
                                  stackIn_357_1 = stackOut_355_1;
                                  break L101;
                                }
                              }
                              if (stackIn_357_0 ^ stackIn_357_1 == 0) {
                                break L98;
                              } else {
                                if (mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                                  break L98;
                                } else {
                                  uf.field_p[jf.b((byte) 108)] = new gf(ca.field_k, hf.field_t, 6);
                                  if (var21 == 0) {
                                    break L98;
                                  } else {
                                    break L99;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L102: {
                          L103: {
                            L104: {
                              if (!mh.field_e[-1 + ca.field_k][-1 + hf.field_t].field_a) {
                                break L104;
                              } else {
                                if (!mh.field_e[-1 + ca.field_k][-1 + hf.field_t].field_b) {
                                  break L103;
                                } else {
                                  break L104;
                                }
                              }
                            }
                            if (!mh.field_e[ca.field_k + 1][hf.field_t + -1].field_a) {
                              break L102;
                            } else {
                              if (mh.field_e[ca.field_k - -1][hf.field_t + -1].field_b) {
                                break L102;
                              } else {
                                break L103;
                              }
                            }
                          }
                          ((MinerDisturbance) this).field_U = 5;
                          if (var21 == 0) {
                            break L98;
                          } else {
                            break L102;
                          }
                        }
                        L105: {
                          if (mh.field_e[ca.field_k - 1][-1 + hf.field_t].field_a) {
                            break L105;
                          } else {
                            L106: {
                              if (mh.field_e[ca.field_k + 1][-1 + hf.field_t].field_a) {
                                break L106;
                              } else {
                                ((MinerDisturbance) this).field_E = 5;
                                if (var21 == 0) {
                                  break L98;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            ((MinerDisturbance) this).field_E = 4;
                            if (var21 == 0) {
                              break L98;
                            } else {
                              break L105;
                            }
                          }
                        }
                        ((MinerDisturbance) this).field_E = 5;
                        break L98;
                      }
                      if (250 <= kn.field_E) {
                        break L58;
                      } else {
                        if (!je.c(ca.field_k, -1 + hf.field_t, 1, 1)) {
                          break L58;
                        } else {
                          if (mh.field_e[ca.field_k][hf.field_t + -1].field_a) {
                            break L58;
                          } else {
                            L107: {
                              L108: {
                                if (!mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_a) {
                                  break L108;
                                } else {
                                  if (!mh.field_e[ca.field_k - -1][-1 + hf.field_t].field_a) {
                                    ((MinerDisturbance) this).field_E = 4;
                                    if (var21 == 0) {
                                      break L107;
                                    } else {
                                      break L108;
                                    }
                                  } else {
                                    break L107;
                                  }
                                }
                              }
                              ((MinerDisturbance) this).field_E = 5;
                              break L107;
                            }
                            ((MinerDisturbance) this).field_U = 0;
                            break L58;
                          }
                        }
                      }
                    }
                  } else {
                    break L58;
                  }
                }
              }
            }
          }
          L109: {
            if (rj.field_f != 0) {
              ph.field_b = 0;
              break L109;
            } else {
              break L109;
            }
          }
          L110: {
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
                                var13 = rj.field_f;
                                if (var13 == 0) {
                                  break L120;
                                } else {
                                  L121: {
                                    if (var13 != 1) {
                                      break L121;
                                    } else {
                                      if (var21 == 0) {
                                        break L119;
                                      } else {
                                        break L121;
                                      }
                                    }
                                  }
                                  if (2 == var13) {
                                    break L118;
                                  } else {
                                    L122: {
                                      if (var13 != 3) {
                                        break L122;
                                      } else {
                                        if (var21 == 0) {
                                          break L117;
                                        } else {
                                          break L122;
                                        }
                                      }
                                    }
                                    L123: {
                                      if (4 != var13) {
                                        break L123;
                                      } else {
                                        if (var21 == 0) {
                                          break L117;
                                        } else {
                                          break L123;
                                        }
                                      }
                                    }
                                    if (var13 == 7) {
                                      break L116;
                                    } else {
                                      if (8 == var13) {
                                        break L115;
                                      } else {
                                        if (var13 == 9) {
                                          break L114;
                                        } else {
                                          if (10 == var13) {
                                            break L113;
                                          } else {
                                            if (11 == var13) {
                                              break L112;
                                            } else {
                                              L124: {
                                                if (var13 != 12) {
                                                  break L124;
                                                } else {
                                                  if (var21 == 0) {
                                                    break L111;
                                                  } else {
                                                    break L124;
                                                  }
                                                }
                                              }
                                              if (13 != var13) {
                                                break L110;
                                              } else {
                                                if (var21 == 0) {
                                                  L125: {
                                                    field_J = 0;
                                                    ne.a(36, 57);
                                                    kj.field_d = kj.field_d + 1;
                                                    if (kj.field_d > 5) {
                                                      tb.field_c = tb.field_c + 1;
                                                      kj.field_d = 0;
                                                      break L125;
                                                    } else {
                                                      break L125;
                                                    }
                                                  }
                                                  L126: {
                                                    if (tb.field_c >= pc.field_f.length) {
                                                      tb.field_c = 0;
                                                      break L126;
                                                    } else {
                                                      break L126;
                                                    }
                                                  }
                                                  L127: {
                                                    L128: {
                                                      if (nf.field_e > 0) {
                                                        break L128;
                                                      } else {
                                                        rj.field_f = 4;
                                                        tc.field_s = 0;
                                                        if (var21 == 0) {
                                                          break L127;
                                                        } else {
                                                          break L128;
                                                        }
                                                      }
                                                    }
                                                    nf.field_e = nf.field_e - 1;
                                                    break L127;
                                                  }
                                                  L129: {
                                                    if (qd.field_K > 0) {
                                                      qd.field_K = qd.field_K - 1;
                                                      break L129;
                                                    } else {
                                                      break L129;
                                                    }
                                                  }
                                                  L130: {
                                                    if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                                                      break L130;
                                                    } else {
                                                      je.field_O.a(ca.field_k, -4, hf.field_t);
                                                      uf.field_p[jf.b((byte) 108)] = new gf(ca.field_k, hf.field_t, 16);
                                                      break L130;
                                                    }
                                                  }
                                                  L131: {
                                                    if (!d.field_b) {
                                                      break L131;
                                                    } else {
                                                      if (!qd.field_O[96]) {
                                                        break L131;
                                                      } else {
                                                        di.field_K = -1;
                                                        rg.field_wb = -10;
                                                        break L131;
                                                      }
                                                    }
                                                  }
                                                  L132: {
                                                    if (bd.field_k <= -160) {
                                                      break L132;
                                                    } else {
                                                      bd.field_k = -160;
                                                      break L132;
                                                    }
                                                  }
                                                  L133: {
                                                    if (!d.field_b) {
                                                      break L133;
                                                    } else {
                                                      if (!qd.field_O[97]) {
                                                        break L133;
                                                      } else {
                                                        di.field_K = 1;
                                                        rg.field_wb = 10;
                                                        break L133;
                                                      }
                                                    }
                                                  }
                                                  L134: {
                                                    if ((nf.field_e & 3) != 0) {
                                                      break L134;
                                                    } else {
                                                      var13_ref_gf = new gf(ca.field_k, hf.field_t, 16);
                                                      var13_ref_gf.field_g = 0;
                                                      var13_ref_gf.field_b = 240;
                                                      uf.field_p[jf.b((byte) 61)] = var13_ref_gf;
                                                      bd.field_k = -160;
                                                      break L134;
                                                    }
                                                  }
                                                  L135: {
                                                    mf.field_i = mf.field_i + bd.field_k;
                                                    sk.field_d = sk.field_d + rg.field_wb;
                                                    if (mf.field_i <= 40) {
                                                      break L135;
                                                    } else {
                                                      if (!mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                                                        break L135;
                                                      } else {
                                                        mf.field_i = 40;
                                                        bd.field_k = 0;
                                                        break L135;
                                                      }
                                                    }
                                                  }
                                                  L136: {
                                                    if (mf.field_i >= -40) {
                                                      break L136;
                                                    } else {
                                                      if (!mh.field_e[ca.field_k][hf.field_t + -1].g()) {
                                                        break L136;
                                                      } else {
                                                        mf.field_i = -40;
                                                        bd.field_k = 0;
                                                        break L136;
                                                      }
                                                    }
                                                  }
                                                  L137: {
                                                    if (sk.field_d <= 80) {
                                                      break L137;
                                                    } else {
                                                      if (mf.field_i >= -40) {
                                                        break L137;
                                                      } else {
                                                        if (mh.field_e[ca.field_k + 1][hf.field_t - 1].g()) {
                                                          sk.field_d = 80;
                                                          break L137;
                                                        } else {
                                                          break L137;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L138: {
                                                    if (sk.field_d >= -80) {
                                                      break L138;
                                                    } else {
                                                      if (-40 <= mf.field_i) {
                                                        break L138;
                                                      } else {
                                                        if (mh.field_e[ca.field_k - 1][-1 + hf.field_t].g()) {
                                                          sk.field_d = -80;
                                                          break L138;
                                                        } else {
                                                          break L138;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L139: {
                                                    if (sk.field_d <= 80) {
                                                      break L139;
                                                    } else {
                                                      if (mf.field_i <= 40) {
                                                        break L139;
                                                      } else {
                                                        if (!mh.field_e[ca.field_k - -1][hf.field_t - -1].g()) {
                                                          break L139;
                                                        } else {
                                                          sk.field_d = 80;
                                                          break L139;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L140: {
                                                    if (sk.field_d >= -80) {
                                                      break L140;
                                                    } else {
                                                      if (40 >= mf.field_i) {
                                                        break L140;
                                                      } else {
                                                        if (!mh.field_e[ca.field_k + -1][hf.field_t - -1].g()) {
                                                          break L140;
                                                        } else {
                                                          sk.field_d = -80;
                                                          break L140;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L141: {
                                                    if (sk.field_d <= 80) {
                                                      break L141;
                                                    } else {
                                                      if (mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                                                        sk.field_d = 80;
                                                        break L141;
                                                      } else {
                                                        break L141;
                                                      }
                                                    }
                                                  }
                                                  L142: {
                                                    if (-80 <= sk.field_d) {
                                                      break L142;
                                                    } else {
                                                      if (!mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                                                        break L142;
                                                      } else {
                                                        sk.field_d = -80;
                                                        break L142;
                                                      }
                                                    }
                                                  }
                                                  L143: {
                                                    if (sk.field_d > 160) {
                                                      ca.field_k = ca.field_k + 1;
                                                      sk.field_d = sk.field_d - 320;
                                                      break L143;
                                                    } else {
                                                      break L143;
                                                    }
                                                  }
                                                  L144: {
                                                    if (sk.field_d < -160) {
                                                      ca.field_k = ca.field_k - 1;
                                                      sk.field_d = sk.field_d + 320;
                                                      break L144;
                                                    } else {
                                                      break L144;
                                                    }
                                                  }
                                                  L145: {
                                                    if (mf.field_i > 160) {
                                                      hf.field_t = hf.field_t + 1;
                                                      mf.field_i = mf.field_i - 320;
                                                      break L145;
                                                    } else {
                                                      break L145;
                                                    }
                                                  }
                                                  L146: {
                                                    if (-160 <= mf.field_i) {
                                                      break L146;
                                                    } else {
                                                      mf.field_i = mf.field_i + 320;
                                                      hf.field_t = hf.field_t - 1;
                                                      break L146;
                                                    }
                                                  }
                                                  if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                                                    rj.field_f = 2;
                                                    break L110;
                                                  } else {
                                                    break L110;
                                                  }
                                                } else {
                                                  break L120;
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
                              L147: {
                                L148: {
                                  L149: {
                                    if (!d.field_b) {
                                      break L149;
                                    } else {
                                      if (qd.field_O[96]) {
                                        break L148;
                                      } else {
                                        break L149;
                                      }
                                    }
                                  }
                                  if (2 == ((MinerDisturbance) this).field_E) {
                                    break L148;
                                  } else {
                                    if (((MinerDisturbance) this).field_E != 5) {
                                      break L147;
                                    } else {
                                      break L148;
                                    }
                                  }
                                }
                                rj.field_f = 1;
                                di.field_K = -1;
                                if (!d.field_b) {
                                  break L147;
                                } else {
                                  gl.a(7, 25);
                                  break L147;
                                }
                              }
                              L150: {
                                L151: {
                                  L152: {
                                    if (!d.field_b) {
                                      break L152;
                                    } else {
                                      if (qd.field_O[97]) {
                                        break L151;
                                      } else {
                                        break L152;
                                      }
                                    }
                                  }
                                  if (((MinerDisturbance) this).field_E == 1) {
                                    break L151;
                                  } else {
                                    if (((MinerDisturbance) this).field_E != 4) {
                                      break L150;
                                    } else {
                                      break L151;
                                    }
                                  }
                                }
                                di.field_K = 1;
                                rj.field_f = 1;
                                if (!d.field_b) {
                                  break L150;
                                } else {
                                  gl.a(7, 25);
                                  break L150;
                                }
                              }
                              L153: {
                                L154: {
                                  L155: {
                                    if (!d.field_b) {
                                      break L155;
                                    } else {
                                      if (!qd.field_O[98]) {
                                        break L155;
                                      } else {
                                        if (!ag.field_c) {
                                          break L154;
                                        } else {
                                          break L155;
                                        }
                                      }
                                    }
                                  }
                                  if (((MinerDisturbance) this).field_E == 3) {
                                    break L154;
                                  } else {
                                    if (((MinerDisturbance) this).field_E == 4) {
                                      break L154;
                                    } else {
                                      if (((MinerDisturbance) this).field_E == 5) {
                                        break L154;
                                      } else {
                                        break L153;
                                      }
                                    }
                                  }
                                }
                                L156: {
                                  var13 = 1;
                                  if (mh.field_e[ca.field_k][hf.field_t].field_a) {
                                    var13 = 0;
                                    break L156;
                                  } else {
                                    break L156;
                                  }
                                }
                                L157: {
                                  if (!mh.field_e[ca.field_k][hf.field_t + -1].g()) {
                                    break L157;
                                  } else {
                                    var13 = 0;
                                    break L157;
                                  }
                                }
                                L158: {
                                  if (sk.field_d + 10 * di.field_K <= 165) {
                                    break L158;
                                  } else {
                                    if (!mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                                      break L158;
                                    } else {
                                      var13 = 0;
                                      break L158;
                                    }
                                  }
                                }
                                L159: {
                                  if (10 * di.field_K + sk.field_d >= -165) {
                                    break L159;
                                  } else {
                                    if (mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                                      var13 = 0;
                                      break L159;
                                    } else {
                                      break L159;
                                    }
                                  }
                                }
                                if (var13 == 0) {
                                  break L153;
                                } else {
                                  L160: {
                                    if (!qe.field_b[20]) {
                                      break L160;
                                    } else {
                                      if (!qd.field_O[49]) {
                                        break L160;
                                      } else {
                                        if (qd.field_K <= 10) {
                                          break L160;
                                        } else {
                                          rj.field_f = 12;
                                          if (var21 == 0) {
                                            break L153;
                                          } else {
                                            break L160;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  bd.field_k = -40;
                                  rj.field_f = 3;
                                  rg.field_wb = 10 * di.field_K;
                                  ne.a(10, 79);
                                  break L153;
                                }
                              }
                              L161: {
                                L162: {
                                  if (qe.field_b[18]) {
                                    break L162;
                                  } else {
                                    L163: {
                                      if (tc.field_s > 0) {
                                        break L163;
                                      } else {
                                        if (mh.field_e[ca.field_k][1 + hf.field_t].field_E) {
                                          break L163;
                                        } else {
                                          L164: {
                                            if (sk.field_d >= 0) {
                                              break L164;
                                            } else {
                                              if (mh.field_e[ca.field_k + -1][hf.field_t + 1].field_E) {
                                                break L163;
                                              } else {
                                                break L164;
                                              }
                                            }
                                          }
                                          if (sk.field_d <= 0) {
                                            break L162;
                                          } else {
                                            if (!mh.field_e[1 + ca.field_k][hf.field_t - -1].field_E) {
                                              break L162;
                                            } else {
                                              break L163;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_500_0 = 1;
                                    stackIn_502_0 = stackOut_500_0;
                                    break L161;
                                  }
                                }
                                stackOut_501_0 = 0;
                                stackIn_502_0 = stackOut_501_0;
                                break L161;
                              }
                              L165: {
                                L166: {
                                  var13 = stackIn_502_0;
                                  if (var2_int == 0) {
                                    break L166;
                                  } else {
                                    if (var13 == 0) {
                                      break L165;
                                    } else {
                                      this.w(105);
                                      if (var21 == 0) {
                                        break L165;
                                      } else {
                                        break L166;
                                      }
                                    }
                                  }
                                }
                                rj.field_f = 4;
                                break L165;
                              }
                              L167: {
                                L168: {
                                  if (!qe.field_b[4]) {
                                    break L168;
                                  } else {
                                    if (var2_int != 0) {
                                      break L167;
                                    } else {
                                      break L168;
                                    }
                                  }
                                }
                                if (ph.field_b == 6) {
                                  ph.field_b = 0;
                                  break L167;
                                } else {
                                  break L167;
                                }
                              }
                              L169: {
                                tb.field_c = 0;
                                an.field_f = an.field_f - 1;
                                if (an.field_f > 0) {
                                  break L169;
                                } else {
                                  L170: {
                                    if (ph.field_b != 0) {
                                      break L170;
                                    } else {
                                      ph.field_b = (int)(3.0 * Math.random() + 1.0);
                                      an.field_f = 5;
                                      tf.field_b = 0;
                                      if (var21 == 0) {
                                        break L169;
                                      } else {
                                        break L170;
                                      }
                                    }
                                  }
                                  L171: {
                                    an.field_f = 5;
                                    tf.field_b = tf.field_b + 1;
                                    if (tf.field_b > 4) {
                                      break L171;
                                    } else {
                                      if (3 >= tf.field_b) {
                                        break L169;
                                      } else {
                                        if (ph.field_b == 1) {
                                          break L171;
                                        } else {
                                          break L169;
                                        }
                                      }
                                    }
                                  }
                                  ph.field_b = 0;
                                  an.field_f = 500;
                                  break L169;
                                }
                              }
                              L172: {
                                if (ph.field_b != 0) {
                                  break L172;
                                } else {
                                  if (an.field_f >= 400) {
                                    break L172;
                                  } else {
                                    if (mh.field_e[ca.field_k][hf.field_t - -1].field_q > 0) {
                                      tf.field_b = 0;
                                      ph.field_b = 4;
                                      an.field_f = 5;
                                      break L172;
                                    } else {
                                      break L172;
                                    }
                                  }
                                }
                              }
                              L173: {
                                if (mh.field_e[ca.field_k][hf.field_t + 1].field_q <= 150) {
                                  break L173;
                                } else {
                                  if (ph.field_b != 5) {
                                    tf.field_b = 0;
                                    an.field_f = 5;
                                    ph.field_b = 5;
                                    break L173;
                                  } else {
                                    break L173;
                                  }
                                }
                              }
                              L174: {
                                if (1 == ph.field_b) {
                                  tb.field_c = ph.field_b * 8 - -tf.field_b;
                                  break L174;
                                } else {
                                  break L174;
                                }
                              }
                              L175: {
                                if (ph.field_b != 2) {
                                  break L175;
                                } else {
                                  tb.field_c = ph.field_b * 8 - -tf.field_b;
                                  break L175;
                                }
                              }
                              L176: {
                                if (ph.field_b != 3) {
                                  break L176;
                                } else {
                                  tb.field_c = ph.field_b * 8 + tf.field_b;
                                  break L176;
                                }
                              }
                              L177: {
                                if (ph.field_b != 4) {
                                  break L177;
                                } else {
                                  tb.field_c = 21 - -(tf.field_b % 3);
                                  break L177;
                                }
                              }
                              L178: {
                                if (5 != ph.field_b) {
                                  break L178;
                                } else {
                                  tb.field_c = tf.field_b + 83;
                                  break L178;
                                }
                              }
                              L179: {
                                if (ph.field_b == 0) {
                                  var13 = 0;
                                  var14 = hf.field_t;
                                  L180: while (true) {
                                    L181: {
                                      if (var13 != 0) {
                                        stackOut_557_0 = 0;
                                        stackIn_558_0 = stackOut_557_0;
                                        break L181;
                                      } else {
                                        stackOut_555_0 = 1;
                                        stackIn_558_0 = stackOut_555_0;
                                        stackIn_556_0 = stackOut_555_0;
                                        if (var21 != 0) {
                                          break L181;
                                        } else {
                                          stackOut_556_0 = stackIn_556_0;
                                          stackIn_558_0 = stackOut_556_0;
                                          break L181;
                                        }
                                      }
                                    }
                                    if (stackIn_558_0 != 1) {
                                      break L179;
                                    } else {
                                      L182: {
                                        var14--;
                                        if (var14 < 1) {
                                          var13 = 1;
                                          break L182;
                                        } else {
                                          break L182;
                                        }
                                      }
                                      if (mh.field_e[ca.field_k][var14].field_a) {
                                        L183: {
                                          if (!mh.field_e[ca.field_k][var14].field_S) {
                                            break L183;
                                          } else {
                                            tb.field_c = 29;
                                            if (mh.field_e[ca.field_k][var14].field_r > 950) {
                                              tb.field_c = 30;
                                              break L183;
                                            } else {
                                              break L183;
                                            }
                                          }
                                        }
                                        var13 = 1;
                                        if (var21 == 0) {
                                          continue L180;
                                        } else {
                                          break L179;
                                        }
                                      } else {
                                        continue L180;
                                      }
                                    }
                                  }
                                } else {
                                  break L179;
                                }
                              }
                              if (!qe.field_b[4]) {
                                break L110;
                              } else {
                                if (var2_int != 0) {
                                  L184: {
                                    var2_int = 0;
                                    if (bd.field_k < 0) {
                                      break L184;
                                    } else {
                                      if (!qd.field_O[99]) {
                                        L185: {
                                          if (sk.field_d >= -30) {
                                            break L185;
                                          } else {
                                            if (mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                                              var2_int = 1;
                                              break L185;
                                            } else {
                                              break L185;
                                            }
                                          }
                                        }
                                        if (sk.field_d <= 30) {
                                          break L184;
                                        } else {
                                          if (!mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                                            break L184;
                                          } else {
                                            var2_int = 1;
                                            break L184;
                                          }
                                        }
                                      } else {
                                        break L184;
                                      }
                                    }
                                  }
                                  L186: {
                                    if (mf.field_i < 0) {
                                      break L186;
                                    } else {
                                      if (bd.field_k < 0) {
                                        break L186;
                                      } else {
                                        L187: {
                                          if (!mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                                            break L187;
                                          } else {
                                            var2_int = 0;
                                            break L187;
                                          }
                                        }
                                        L188: {
                                          if (sk.field_d >= -80) {
                                            break L188;
                                          } else {
                                            if (!mh.field_e[ca.field_k + -1][1 + hf.field_t].g()) {
                                              break L188;
                                            } else {
                                              var2_int = 0;
                                              break L188;
                                            }
                                          }
                                        }
                                        if (80 >= sk.field_d) {
                                          break L186;
                                        } else {
                                          if (mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                                            var2_int = 0;
                                            break L186;
                                          } else {
                                            break L186;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L189: {
                                    if (var2_int != 0) {
                                      L190: {
                                        tb.field_c = 104;
                                        mf.field_i = mf.field_i / 2;
                                        if (ph.field_b != 6) {
                                          an.field_f = 5;
                                          ph.field_b = 6;
                                          break L190;
                                        } else {
                                          break L190;
                                        }
                                      }
                                      if (an.field_f >= 2) {
                                        break L189;
                                      } else {
                                        an.field_f = 2;
                                        tb.field_c = tb.field_c + 1;
                                        break L189;
                                      }
                                    } else {
                                      break L189;
                                    }
                                  }
                                  var2_int = 1;
                                  if (var21 == 0) {
                                    break L110;
                                  } else {
                                    break L119;
                                  }
                                } else {
                                  break L110;
                                }
                              }
                            }
                            L191: {
                              L192: {
                                var7 = 1;
                                if (qe.field_b[18]) {
                                  break L192;
                                } else {
                                  L193: {
                                    if (tc.field_s > 0) {
                                      break L193;
                                    } else {
                                      if (mh.field_e[ca.field_k][1 + hf.field_t].field_E) {
                                        break L193;
                                      } else {
                                        L194: {
                                          if (sk.field_d >= 0) {
                                            break L194;
                                          } else {
                                            if (mh.field_e[ca.field_k + -1][hf.field_t - -1].field_E) {
                                              break L193;
                                            } else {
                                              break L194;
                                            }
                                          }
                                        }
                                        if (sk.field_d <= 0) {
                                          break L192;
                                        } else {
                                          if (!mh.field_e[ca.field_k - -1][1 + hf.field_t].field_E) {
                                            break L192;
                                          } else {
                                            break L193;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_624_0 = 1;
                                  stackIn_626_0 = stackOut_624_0;
                                  break L191;
                                }
                              }
                              stackOut_625_0 = 0;
                              stackIn_626_0 = stackOut_625_0;
                              break L191;
                            }
                            L195: {
                              L196: {
                                L197: {
                                  var6 = stackIn_626_0;
                                  if (!d.field_b) {
                                    break L197;
                                  } else {
                                    if (qd.field_O[96]) {
                                      break L196;
                                    } else {
                                      break L197;
                                    }
                                  }
                                }
                                if (((MinerDisturbance) this).field_E == 2) {
                                  break L196;
                                } else {
                                  if (var6 != 0) {
                                    break L195;
                                  } else {
                                    if (0 > rg.field_wb) {
                                      rg.field_wb = rg.field_wb + 1;
                                      if (var21 == 0) {
                                        break L195;
                                      } else {
                                        break L196;
                                      }
                                    } else {
                                      break L195;
                                    }
                                  }
                                }
                              }
                              L198: {
                                L199: {
                                  if (var6 != 0) {
                                    break L199;
                                  } else {
                                    rg.field_wb = -20;
                                    if (var21 == 0) {
                                      break L198;
                                    } else {
                                      break L199;
                                    }
                                  }
                                }
                                if (rg.field_wb <= -30) {
                                  break L198;
                                } else {
                                  rg.field_wb = rg.field_wb - 1;
                                  break L198;
                                }
                              }
                              di.field_K = -1;
                              var7 = 0;
                              if (!qe.field_b[11]) {
                                break L195;
                              } else {
                                if (sk.field_d >= 0) {
                                  break L195;
                                } else {
                                  if (mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                                    L200: {
                                      if (25 <= tc.field_t) {
                                        break L200;
                                      } else {
                                        tc.field_t = tc.field_t + 2;
                                        if (var21 == 0) {
                                          break L195;
                                        } else {
                                          break L200;
                                        }
                                      }
                                    }
                                    rj.field_f = 10;
                                    rg.field_wb = -50;
                                    kj.field_d = 0;
                                    bd.field_k = -10;
                                    tc.field_t = 0;
                                    break L195;
                                  } else {
                                    break L195;
                                  }
                                }
                              }
                            }
                            L201: {
                              L202: {
                                L203: {
                                  if (!d.field_b) {
                                    break L203;
                                  } else {
                                    if (qd.field_O[97]) {
                                      break L202;
                                    } else {
                                      break L203;
                                    }
                                  }
                                }
                                if (((MinerDisturbance) this).field_E == 1) {
                                  break L202;
                                } else {
                                  if (var6 != 0) {
                                    break L201;
                                  } else {
                                    if (rg.field_wb <= 0) {
                                      break L201;
                                    } else {
                                      rg.field_wb = rg.field_wb - 1;
                                      if (var21 == 0) {
                                        break L201;
                                      } else {
                                        break L202;
                                      }
                                    }
                                  }
                                }
                              }
                              L204: {
                                L205: {
                                  di.field_K = 1;
                                  var7 = 0;
                                  if (var6 != 0) {
                                    break L205;
                                  } else {
                                    rg.field_wb = 20;
                                    if (var21 == 0) {
                                      break L204;
                                    } else {
                                      break L205;
                                    }
                                  }
                                }
                                if (rg.field_wb >= 30) {
                                  break L204;
                                } else {
                                  rg.field_wb = rg.field_wb + 1;
                                  break L204;
                                }
                              }
                              if (!qe.field_b[11]) {
                                break L201;
                              } else {
                                if (sk.field_d <= 0) {
                                  break L201;
                                } else {
                                  if (mh.field_e[ca.field_k + 1][hf.field_t].field_a) {
                                    L206: {
                                      if (tc.field_t < 25) {
                                        break L206;
                                      } else {
                                        bd.field_k = -10;
                                        tc.field_t = 0;
                                        rj.field_f = 10;
                                        rg.field_wb = 50;
                                        kj.field_d = 0;
                                        if (var21 == 0) {
                                          break L201;
                                        } else {
                                          break L206;
                                        }
                                      }
                                    }
                                    tc.field_t = tc.field_t + 2;
                                    break L201;
                                  } else {
                                    break L201;
                                  }
                                }
                              }
                            }
                            L207: {
                              if (var6 != 0) {
                                break L207;
                              } else {
                                L208: {
                                  L209: {
                                    if (!d.field_b) {
                                      break L209;
                                    } else {
                                      if (!qd.field_O[96]) {
                                        break L209;
                                      } else {
                                        if (!qd.field_O[99]) {
                                          break L209;
                                        } else {
                                          di.field_K = -1;
                                          var7 = 0;
                                          rg.field_wb = -10;
                                          if (var21 == 0) {
                                            break L208;
                                          } else {
                                            break L209;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (0 > rg.field_wb) {
                                    rg.field_wb = rg.field_wb + 1;
                                    break L208;
                                  } else {
                                    break L208;
                                  }
                                }
                                L210: {
                                  L211: {
                                    if (!d.field_b) {
                                      break L211;
                                    } else {
                                      if (!qd.field_O[97]) {
                                        break L211;
                                      } else {
                                        if (qd.field_O[99]) {
                                          break L210;
                                        } else {
                                          break L211;
                                        }
                                      }
                                    }
                                  }
                                  if (0 >= rg.field_wb) {
                                    break L207;
                                  } else {
                                    rg.field_wb = rg.field_wb - 1;
                                    if (var21 == 0) {
                                      break L207;
                                    } else {
                                      break L210;
                                    }
                                  }
                                }
                                var7 = 0;
                                di.field_K = 1;
                                rg.field_wb = 10;
                                break L207;
                              }
                            }
                            L212: {
                              if (!d.field_b) {
                                break L212;
                              } else {
                                if (!qd.field_O[98]) {
                                  break L212;
                                } else {
                                  if (ag.field_c) {
                                    break L212;
                                  } else {
                                    L213: {
                                      var13 = 1;
                                      if (mh.field_e[ca.field_k][hf.field_t].field_a) {
                                        var13 = 0;
                                        break L213;
                                      } else {
                                        break L213;
                                      }
                                    }
                                    L214: {
                                      if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                                        var13 = 0;
                                        break L214;
                                      } else {
                                        break L214;
                                      }
                                    }
                                    L215: {
                                      if (10 * di.field_K + sk.field_d <= 165) {
                                        break L215;
                                      } else {
                                        if (mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                                          var13 = 0;
                                          break L215;
                                        } else {
                                          break L215;
                                        }
                                      }
                                    }
                                    L216: {
                                      if (sk.field_d + 10 * di.field_K >= -165) {
                                        break L216;
                                      } else {
                                        if (!mh.field_e[ca.field_k - 1][-1 + hf.field_t].g()) {
                                          break L216;
                                        } else {
                                          var13 = 0;
                                          break L216;
                                        }
                                      }
                                    }
                                    if (var13 == 0) {
                                      break L212;
                                    } else {
                                      rg.field_wb = di.field_K * 10;
                                      rj.field_f = 3;
                                      bd.field_k = -40;
                                      ne.a(10, -77);
                                      break L212;
                                    }
                                  }
                                }
                              }
                            }
                            L217: {
                              this.w(param0 + 16427);
                              if (var2_int == 0) {
                                rj.field_f = 4;
                                break L217;
                              } else {
                                break L217;
                              }
                            }
                            L218: {
                              L219: {
                                if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                                  break L219;
                                } else {
                                  if (!je.a(ca.field_k, hf.field_t, 1, 1)) {
                                    break L218;
                                  } else {
                                    break L219;
                                  }
                                }
                              }
                              if (var2_int != 0) {
                                break L218;
                              } else {
                                rj.field_f = 2;
                                ne.a(30, 59);
                                break L218;
                              }
                            }
                            L220: {
                              L221: {
                                an.field_f = an.field_f - 1;
                                if (rg.field_wb == 0) {
                                  break L221;
                                } else {
                                  if (var6 == 0) {
                                    break L220;
                                  } else {
                                    if (var7 == 0) {
                                      break L220;
                                    } else {
                                      break L221;
                                    }
                                  }
                                }
                              }
                              if (var2_int == 0) {
                                break L220;
                              } else {
                                rj.field_f = 0;
                                break L220;
                              }
                            }
                            L222: {
                              L223: {
                                if (an.field_f < 0) {
                                  break L223;
                                } else {
                                  if (an.field_f > 2) {
                                    break L223;
                                  } else {
                                    break L222;
                                  }
                                }
                              }
                              L224: {
                                an.field_f = 2;
                                tf.field_b = tf.field_b + 1;
                                if (tf.field_b == 1) {
                                  break L224;
                                } else {
                                  if (tf.field_b == 4) {
                                    break L224;
                                  } else {
                                    break L222;
                                  }
                                }
                              }
                              ne.a(31, -101);
                              break L222;
                            }
                            tf.field_b = tf.field_b % 7;
                            tb.field_c = tf.field_b + 112;
                            if (var21 == 0) {
                              break L110;
                            } else {
                              break L118;
                            }
                          }
                          L225: {
                            L226: {
                              L227: {
                                if (!d.field_b) {
                                  break L227;
                                } else {
                                  if (qd.field_O[96]) {
                                    break L226;
                                  } else {
                                    break L227;
                                  }
                                }
                              }
                              if (((MinerDisturbance) this).field_E == 2) {
                                break L226;
                              } else {
                                if (((MinerDisturbance) this).field_E == 5) {
                                  break L226;
                                } else {
                                  break L225;
                                }
                              }
                            }
                            if (!qe.field_b[11]) {
                              break L225;
                            } else {
                              if (0 <= sk.field_d) {
                                break L225;
                              } else {
                                if (!mh.field_e[ca.field_k - 1][hf.field_t].field_a) {
                                  break L225;
                                } else {
                                  if (mh.field_e[-1 + ca.field_k][hf.field_t].field_S) {
                                    L228: {
                                      if (tc.field_t < 25) {
                                        break L228;
                                      } else {
                                        rj.field_f = 10;
                                        rg.field_wb = 50;
                                        bd.field_k = -10;
                                        kj.field_d = 0;
                                        if (var21 == 0) {
                                          break L225;
                                        } else {
                                          break L228;
                                        }
                                      }
                                    }
                                    tc.field_t = tc.field_t + 2;
                                    break L225;
                                  } else {
                                    break L225;
                                  }
                                }
                              }
                            }
                          }
                          L229: {
                            L230: {
                              L231: {
                                if (!d.field_b) {
                                  break L231;
                                } else {
                                  if (qd.field_O[97]) {
                                    break L230;
                                  } else {
                                    break L231;
                                  }
                                }
                              }
                              if (((MinerDisturbance) this).field_E == 1) {
                                break L230;
                              } else {
                                if (((MinerDisturbance) this).field_E != 4) {
                                  break L229;
                                } else {
                                  break L230;
                                }
                              }
                            }
                            if (!qe.field_b[11]) {
                              break L229;
                            } else {
                              if (sk.field_d <= 0) {
                                break L229;
                              } else {
                                if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                                  break L229;
                                } else {
                                  if (mh.field_e[ca.field_k - -1][hf.field_t].field_S) {
                                    L232: {
                                      if (25 <= tc.field_t) {
                                        break L232;
                                      } else {
                                        tc.field_t = tc.field_t + 2;
                                        if (var21 == 0) {
                                          break L229;
                                        } else {
                                          break L232;
                                        }
                                      }
                                    }
                                    bd.field_k = -10;
                                    rg.field_wb = 50;
                                    kj.field_d = 0;
                                    rj.field_f = 10;
                                    break L229;
                                  } else {
                                    break L229;
                                  }
                                }
                              }
                            }
                          }
                          L233: {
                            L234: {
                              L235: {
                                if (!d.field_b) {
                                  break L235;
                                } else {
                                  if (qd.field_O[96]) {
                                    break L234;
                                  } else {
                                    break L235;
                                  }
                                }
                              }
                              if (0 <= rg.field_wb) {
                                break L233;
                              } else {
                                rg.field_wb = rg.field_wb + 1;
                                if (var21 == 0) {
                                  break L233;
                                } else {
                                  break L234;
                                }
                              }
                            }
                            rg.field_wb = -20;
                            di.field_K = -1;
                            break L233;
                          }
                          L236: {
                            L237: {
                              L238: {
                                L239: {
                                  if (!d.field_b) {
                                    break L239;
                                  } else {
                                    if (qd.field_O[98]) {
                                      break L238;
                                    } else {
                                      break L239;
                                    }
                                  }
                                }
                                if (((MinerDisturbance) this).field_E == 5) {
                                  break L238;
                                } else {
                                  if (((MinerDisturbance) this).field_E != 4) {
                                    break L237;
                                  } else {
                                    break L238;
                                  }
                                }
                              }
                              if (-40 >= bd.field_k) {
                                break L237;
                              } else {
                                bd.field_k = bd.field_k - 1;
                                if (var21 == 0) {
                                  break L236;
                                } else {
                                  break L237;
                                }
                              }
                            }
                            if (bd.field_k < 0) {
                              bd.field_k = bd.field_k + 1;
                              break L236;
                            } else {
                              break L236;
                            }
                          }
                          L240: {
                            L241: {
                              if (!d.field_b) {
                                break L241;
                              } else {
                                if (!qd.field_O[97]) {
                                  break L241;
                                } else {
                                  rg.field_wb = 20;
                                  di.field_K = 1;
                                  if (var21 == 0) {
                                    break L240;
                                  } else {
                                    break L241;
                                  }
                                }
                              }
                            }
                            if (rg.field_wb > 0) {
                              rg.field_wb = rg.field_wb - 1;
                              break L240;
                            } else {
                              break L240;
                            }
                          }
                          L242: {
                            L243: {
                              L244: {
                                L245: {
                                  if (!d.field_b) {
                                    break L245;
                                  } else {
                                    if (qd.field_O[99]) {
                                      break L244;
                                    } else {
                                      break L245;
                                    }
                                  }
                                }
                                if (var5 == 0) {
                                  break L243;
                                } else {
                                  break L244;
                                }
                              }
                              if (var2_int != 0) {
                                break L243;
                              } else {
                                if (bd.field_k >= 40) {
                                  break L243;
                                } else {
                                  bd.field_k = bd.field_k + 1;
                                  if (var21 == 0) {
                                    break L242;
                                  } else {
                                    break L243;
                                  }
                                }
                              }
                            }
                            if (bd.field_k > 0) {
                              bd.field_k = bd.field_k - 1;
                              break L242;
                            } else {
                              break L242;
                            }
                          }
                          L246: {
                            L247: {
                              L248: {
                                if (!d.field_b) {
                                  break L248;
                                } else {
                                  if (!qd.field_O[99]) {
                                    break L247;
                                  } else {
                                    break L248;
                                  }
                                }
                              }
                              if (var5 == 0) {
                                break L246;
                              } else {
                                break L247;
                              }
                            }
                            if (qd.field_O[98]) {
                              break L246;
                            } else {
                              if (!mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                                break L246;
                              } else {
                                if (var2_int != 0) {
                                  break L246;
                                } else {
                                  if (bd.field_k >= 40) {
                                    break L246;
                                  } else {
                                    bd.field_k = bd.field_k + 1;
                                    break L246;
                                  }
                                }
                              }
                            }
                          }
                          L249: {
                            L250: {
                              L251: {
                                if (!d.field_b) {
                                  break L251;
                                } else {
                                  if (qd.field_O[99]) {
                                    break L250;
                                  } else {
                                    break L251;
                                  }
                                }
                              }
                              if (var5 != 0) {
                                break L250;
                              } else {
                                if (qd.field_O[98]) {
                                  break L249;
                                } else {
                                  break L250;
                                }
                              }
                            }
                            if (var2_int != 0) {
                              rj.field_f = 1;
                              bd.field_k = 0;
                              mf.field_i = 0;
                              break L249;
                            } else {
                              break L249;
                            }
                          }
                          L252: {
                            if (var4 == 0) {
                              break L252;
                            } else {
                              if (qe.field_b[15]) {
                                break L252;
                              } else {
                                L253: {
                                  if (rg.field_wb * rg.field_wb > 400) {
                                    rg.field_wb = rg.field_wb / 2;
                                    break L253;
                                  } else {
                                    break L253;
                                  }
                                }
                                if (bd.field_k * bd.field_k > 400) {
                                  bd.field_k = bd.field_k / 2;
                                  break L252;
                                } else {
                                  break L252;
                                }
                              }
                            }
                          }
                          L254: {
                            L255: {
                              mf.field_i = mf.field_i + bd.field_k;
                              sk.field_d = sk.field_d + rg.field_wb;
                              if (qd.field_O[98]) {
                                break L255;
                              } else {
                                if (((MinerDisturbance) this).field_E == 5) {
                                  break L255;
                                } else {
                                  L256: {
                                    if (80 >= sk.field_d) {
                                      break L256;
                                    } else {
                                      if (!mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                                        break L256;
                                      } else {
                                        sk.field_d = 80;
                                        break L256;
                                      }
                                    }
                                  }
                                  if (sk.field_d >= -80) {
                                    break L254;
                                  } else {
                                    if (mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                                      sk.field_d = -80;
                                      if (var21 == 0) {
                                        break L254;
                                      } else {
                                        break L255;
                                      }
                                    } else {
                                      break L254;
                                    }
                                  }
                                }
                              }
                            }
                            L257: {
                              if (mf.field_i <= 40) {
                                break L257;
                              } else {
                                if (mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                                  mf.field_i = 40;
                                  bd.field_k = 0;
                                  break L257;
                                } else {
                                  break L257;
                                }
                              }
                            }
                            if (mf.field_i >= -40) {
                              break L254;
                            } else {
                              if (!mh.field_e[ca.field_k][hf.field_t + -1].g()) {
                                break L254;
                              } else {
                                mf.field_i = -40;
                                bd.field_k = 0;
                                break L254;
                              }
                            }
                          }
                          L258: {
                            if (sk.field_d <= 80) {
                              break L258;
                            } else {
                              if (mf.field_i >= -40) {
                                break L258;
                              } else {
                                if (!mh.field_e[1 + ca.field_k][hf.field_t + -1].g()) {
                                  break L258;
                                } else {
                                  sk.field_d = 80;
                                  break L258;
                                }
                              }
                            }
                          }
                          L259: {
                            if (-80 <= sk.field_d) {
                              break L259;
                            } else {
                              if (-40 <= mf.field_i) {
                                break L259;
                              } else {
                                if (mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                                  sk.field_d = -80;
                                  break L259;
                                } else {
                                  break L259;
                                }
                              }
                            }
                          }
                          L260: {
                            if (sk.field_d <= 80) {
                              break L260;
                            } else {
                              if (mf.field_i <= 40) {
                                break L260;
                              } else {
                                if (mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                                  sk.field_d = 80;
                                  break L260;
                                } else {
                                  break L260;
                                }
                              }
                            }
                          }
                          L261: {
                            if (sk.field_d >= -80) {
                              break L261;
                            } else {
                              if (40 >= mf.field_i) {
                                break L261;
                              } else {
                                if (mh.field_e[-1 + ca.field_k][hf.field_t - -1].g()) {
                                  sk.field_d = -80;
                                  break L261;
                                } else {
                                  break L261;
                                }
                              }
                            }
                          }
                          L262: {
                            L263: {
                              if (!qd.field_O[98]) {
                                break L263;
                              } else {
                                L264: {
                                  if (sk.field_d <= 80) {
                                    break L264;
                                  } else {
                                    if (mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                                      sk.field_d = 80;
                                      break L264;
                                    } else {
                                      break L264;
                                    }
                                  }
                                }
                                if (sk.field_d >= -80) {
                                  break L262;
                                } else {
                                  if (mh.field_e[ca.field_k + -1][hf.field_t].g()) {
                                    sk.field_d = -80;
                                    if (var21 == 0) {
                                      break L262;
                                    } else {
                                      break L263;
                                    }
                                  } else {
                                    break L262;
                                  }
                                }
                              }
                            }
                            L265: {
                              if (40 >= mf.field_i) {
                                break L265;
                              } else {
                                if (mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                                  bd.field_k = 0;
                                  mf.field_i = 40;
                                  break L265;
                                } else {
                                  break L265;
                                }
                              }
                            }
                            if (-40 <= mf.field_i) {
                              break L262;
                            } else {
                              if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                                mf.field_i = -40;
                                bd.field_k = 0;
                                break L262;
                              } else {
                                break L262;
                              }
                            }
                          }
                          L266: {
                            if (160 >= sk.field_d) {
                              break L266;
                            } else {
                              sk.field_d = sk.field_d - 320;
                              ca.field_k = ca.field_k + 1;
                              break L266;
                            }
                          }
                          L267: {
                            if (160 < mf.field_i) {
                              hf.field_t = hf.field_t + 1;
                              mf.field_i = mf.field_i - 320;
                              break L267;
                            } else {
                              break L267;
                            }
                          }
                          L268: {
                            if (-160 > sk.field_d) {
                              sk.field_d = sk.field_d + 320;
                              ca.field_k = ca.field_k - 1;
                              break L268;
                            } else {
                              break L268;
                            }
                          }
                          L269: {
                            if (mf.field_i < -160) {
                              hf.field_t = hf.field_t - 1;
                              mf.field_i = mf.field_i + 320;
                              break L269;
                            } else {
                              break L269;
                            }
                          }
                          L270: {
                            if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                              break L270;
                            } else {
                              if (je.c(ca.field_k, hf.field_t, 0, 1)) {
                                break L270;
                              } else {
                                if (je.c(ca.field_k, hf.field_t, 2, 1)) {
                                  break L270;
                                } else {
                                  if (je.c(ca.field_k, hf.field_t, 3, 1)) {
                                    break L270;
                                  } else {
                                    if (je.a(ca.field_k, hf.field_t, 0, 1)) {
                                      break L270;
                                    } else {
                                      if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                                        break L270;
                                      } else {
                                        if (je.a(ca.field_k, hf.field_t, 2, 1)) {
                                          break L270;
                                        } else {
                                          if (je.a(ca.field_k, hf.field_t, 3, 1)) {
                                            break L270;
                                          } else {
                                            rj.field_f = 3;
                                            break L270;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L271: {
                            L272: {
                              an.field_f = an.field_f - 1;
                              if (an.field_f < 0) {
                                break L272;
                              } else {
                                if (an.field_f > 8) {
                                  break L272;
                                } else {
                                  break L271;
                                }
                              }
                            }
                            tf.field_b = tf.field_b + 1;
                            an.field_f = 8;
                            if (Math.abs(rg.field_wb) > 5) {
                              an.field_f = an.field_f / 4;
                              break L271;
                            } else {
                              break L271;
                            }
                          }
                          tf.field_b = tf.field_b % 5;
                          tb.field_c = 32 + tf.field_b;
                          if (var21 == 0) {
                            break L110;
                          } else {
                            break L117;
                          }
                        }
                        L273: {
                          L274: {
                            L275: {
                              L276: {
                                if (!d.field_b) {
                                  break L276;
                                } else {
                                  if (qd.field_O[96]) {
                                    break L275;
                                  } else {
                                    break L276;
                                  }
                                }
                              }
                              if (5 != ((MinerDisturbance) this).field_E) {
                                break L274;
                              } else {
                                break L275;
                              }
                            }
                            L277: {
                              di.field_K = -1;
                              if (cm.field_o != 0) {
                                break L277;
                              } else {
                                rg.field_wb = -20;
                                if (var21 == 0) {
                                  break L273;
                                } else {
                                  break L277;
                                }
                              }
                            }
                            if (-20 >= rg.field_wb) {
                              break L273;
                            } else {
                              rg.field_wb = -20;
                              if (var21 == 0) {
                                break L273;
                              } else {
                                break L274;
                              }
                            }
                          }
                          if (rg.field_wb < 0) {
                            rg.field_wb = rg.field_wb + 1;
                            break L273;
                          } else {
                            break L273;
                          }
                        }
                        L278: {
                          if (bd.field_k >= 40) {
                            break L278;
                          } else {
                            L279: {
                              if (d.field_b) {
                                break L279;
                              } else {
                                if (var5 == 0) {
                                  break L278;
                                } else {
                                  break L279;
                                }
                              }
                            }
                            bd.field_k = bd.field_k + 1;
                            break L278;
                          }
                        }
                        L280: {
                          L281: {
                            L282: {
                              L283: {
                                if (!d.field_b) {
                                  break L283;
                                } else {
                                  if (qd.field_O[97]) {
                                    break L282;
                                  } else {
                                    break L283;
                                  }
                                }
                              }
                              if (((MinerDisturbance) this).field_E != 4) {
                                break L281;
                              } else {
                                break L282;
                              }
                            }
                            L284: {
                              L285: {
                                if (cm.field_o == 0) {
                                  break L285;
                                } else {
                                  if (rg.field_wb < 20) {
                                    rg.field_wb = 20;
                                    if (var21 == 0) {
                                      break L284;
                                    } else {
                                      break L285;
                                    }
                                  } else {
                                    break L284;
                                  }
                                }
                              }
                              rg.field_wb = 20;
                              break L284;
                            }
                            di.field_K = 1;
                            if (var21 == 0) {
                              break L280;
                            } else {
                              break L281;
                            }
                          }
                          if (rg.field_wb <= 0) {
                            break L280;
                          } else {
                            rg.field_wb = rg.field_wb - 1;
                            break L280;
                          }
                        }
                        L286: {
                          mf.field_i = mf.field_i + bd.field_k;
                          sk.field_d = sk.field_d + rg.field_wb;
                          if (mf.field_i <= 0) {
                            break L286;
                          } else {
                            if (mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                              L287: {
                                if (!je.c(ca.field_k, hf.field_t + 1, 1, 0)) {
                                  L288: {
                                    L289: {
                                      L290: {
                                        if (cm.field_o == 0) {
                                          break L290;
                                        } else {
                                          if (!mh.field_e[ca.field_k][hf.field_t + 1].field_E) {
                                            break L289;
                                          } else {
                                            break L290;
                                          }
                                        }
                                      }
                                      ne.a(32, 94);
                                      if (var21 == 0) {
                                        break L288;
                                      } else {
                                        break L289;
                                      }
                                    }
                                    if (cm.field_o == 1) {
                                      ne.a(41, 119);
                                      break L288;
                                    } else {
                                      break L288;
                                    }
                                  }
                                  if (!mh.field_e[ca.field_k][hf.field_t - -1].field_v) {
                                    break L287;
                                  } else {
                                    if (20 > bd.field_k) {
                                      break L287;
                                    } else {
                                      if (mh.field_e[ca.field_k][1 + hf.field_t].field_E) {
                                        break L287;
                                      } else {
                                        mh.field_e[ca.field_k][1 + hf.field_t].field_S = true;
                                        mh.field_e[ca.field_k][1 + hf.field_t].field_r = 975;
                                        if (sc.field_b) {
                                          ag.a(true, 28, hf.field_t + 1 << 5, ca.field_k << 5);
                                          break L287;
                                        } else {
                                          break L287;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L287;
                                }
                              }
                              mf.field_i = 0;
                              bd.field_k = 0;
                              break L286;
                            } else {
                              break L286;
                            }
                          }
                        }
                        L291: {
                          if (mf.field_i >= 0) {
                            break L291;
                          } else {
                            if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                              mf.field_i = 0;
                              bd.field_k = 0;
                              break L291;
                            } else {
                              break L291;
                            }
                          }
                        }
                        L292: {
                          L293: {
                            if (Math.abs(sk.field_d) < Math.abs(mf.field_i)) {
                              break L293;
                            } else {
                              L294: {
                                if (!d.field_b) {
                                  break L294;
                                } else {
                                  if (qd.field_O[99]) {
                                    break L293;
                                  } else {
                                    break L294;
                                  }
                                }
                              }
                              L295: {
                                if (80 >= sk.field_d) {
                                  break L295;
                                } else {
                                  if (mf.field_i >= 0) {
                                    break L295;
                                  } else {
                                    if (bd.field_k > 0) {
                                      break L295;
                                    } else {
                                      if (!mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                                        break L295;
                                      } else {
                                        bd.field_k = 0;
                                        mf.field_i = 0;
                                        break L295;
                                      }
                                    }
                                  }
                                }
                              }
                              L296: {
                                if (sk.field_d >= -80) {
                                  break L296;
                                } else {
                                  if (0 <= mf.field_i) {
                                    break L296;
                                  } else {
                                    if (bd.field_k > 0) {
                                      break L296;
                                    } else {
                                      if (mh.field_e[-1 + ca.field_k][hf.field_t - 1].g()) {
                                        mf.field_i = 0;
                                        bd.field_k = 0;
                                        break L296;
                                      } else {
                                        break L296;
                                      }
                                    }
                                  }
                                }
                              }
                              L297: {
                                if (80 >= sk.field_d) {
                                  break L297;
                                } else {
                                  if (mf.field_i <= 0) {
                                    break L297;
                                  } else {
                                    if (bd.field_k < 0) {
                                      break L297;
                                    } else {
                                      if (mh.field_e[ca.field_k - -1][1 + hf.field_t].g()) {
                                        L298: {
                                          if (!mh.field_e[ca.field_k + 1][hf.field_t - -1].field_v) {
                                            break L298;
                                          } else {
                                            if (bd.field_k < 20) {
                                              break L298;
                                            } else {
                                              if (!mh.field_e[ca.field_k + 1][1 + hf.field_t].field_E) {
                                                mh.field_e[ca.field_k - -1][1 + hf.field_t].field_S = true;
                                                mh.field_e[1 + ca.field_k][1 + hf.field_t].field_r = 975;
                                                if (!sc.field_b) {
                                                  break L298;
                                                } else {
                                                  ag.a(true, 28, 1 + hf.field_t << 5, 1 + ca.field_k << 5);
                                                  break L298;
                                                }
                                              } else {
                                                break L298;
                                              }
                                            }
                                          }
                                        }
                                        bd.field_k = 0;
                                        mf.field_i = 0;
                                        break L297;
                                      } else {
                                        break L297;
                                      }
                                    }
                                  }
                                }
                              }
                              if (sk.field_d >= -80) {
                                break L292;
                              } else {
                                if (mf.field_i <= 0) {
                                  break L292;
                                } else {
                                  if (bd.field_k < 0) {
                                    break L292;
                                  } else {
                                    if (mh.field_e[-1 + ca.field_k][hf.field_t + 1].g()) {
                                      L299: {
                                        if (!mh.field_e[ca.field_k + -1][hf.field_t - -1].field_v) {
                                          break L299;
                                        } else {
                                          if (bd.field_k < 20) {
                                            break L299;
                                          } else {
                                            if (!mh.field_e[ca.field_k - 1][1 + hf.field_t].field_E) {
                                              mh.field_e[-1 + ca.field_k][hf.field_t - -1].field_S = true;
                                              mh.field_e[-1 + ca.field_k][hf.field_t - -1].field_r = 975;
                                              if (sc.field_b) {
                                                ag.a(true, 28, 1 + hf.field_t << 5, -1 + ca.field_k << 5);
                                                break L299;
                                              } else {
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
                                      if (var21 == 0) {
                                        break L292;
                                      } else {
                                        break L293;
                                      }
                                    } else {
                                      break L292;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L300: {
                            if (sk.field_d <= 80) {
                              break L300;
                            } else {
                              if (mf.field_i >= 0) {
                                break L300;
                              } else {
                                if (rg.field_wb < 0) {
                                  break L300;
                                } else {
                                  if (!mh.field_e[ca.field_k - -1][-1 + hf.field_t].g()) {
                                    break L300;
                                  } else {
                                    sk.field_d = 80;
                                    break L300;
                                  }
                                }
                              }
                            }
                          }
                          L301: {
                            if (sk.field_d >= -80) {
                              break L301;
                            } else {
                              if (mf.field_i >= 0) {
                                break L301;
                              } else {
                                if (0 < rg.field_wb) {
                                  break L301;
                                } else {
                                  if (!mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                                    break L301;
                                  } else {
                                    sk.field_d = -80;
                                    break L301;
                                  }
                                }
                              }
                            }
                          }
                          L302: {
                            if (sk.field_d <= 80) {
                              break L302;
                            } else {
                              if (mf.field_i <= 0) {
                                break L302;
                              } else {
                                if (rg.field_wb < 0) {
                                  break L302;
                                } else {
                                  if (!mh.field_e[ca.field_k + 1][1 + hf.field_t].g()) {
                                    break L302;
                                  } else {
                                    sk.field_d = 80;
                                    break L302;
                                  }
                                }
                              }
                            }
                          }
                          if (sk.field_d >= -80) {
                            break L292;
                          } else {
                            if (mf.field_i <= 0) {
                              break L292;
                            } else {
                              if (rg.field_wb > 0) {
                                break L292;
                              } else {
                                if (mh.field_e[ca.field_k + -1][1 + hf.field_t].g()) {
                                  sk.field_d = -80;
                                  break L292;
                                } else {
                                  break L292;
                                }
                              }
                            }
                          }
                        }
                        L303: {
                          if (1 != cm.field_o) {
                            stackOut_1147_0 = 0;
                            stackIn_1148_0 = stackOut_1147_0;
                            break L303;
                          } else {
                            stackOut_1146_0 = 1;
                            stackIn_1148_0 = stackOut_1146_0;
                            break L303;
                          }
                        }
                        L304: {
                          var8 = stackIn_1148_0;
                          if (sk.field_d <= 40) {
                            break L304;
                          } else {
                            if (!mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                              break L304;
                            } else {
                              L305: {
                                sk.field_d = 40;
                                if (var8 == 0) {
                                  break L305;
                                } else {
                                  if (rg.field_wb <= 28) {
                                    break L305;
                                  } else {
                                    if (!mh.field_e[ca.field_k + 1][hf.field_t].field_v) {
                                      break L305;
                                    } else {
                                      mh.field_e[ca.field_k + 1][hf.field_t].field_S = true;
                                      mh.field_e[ca.field_k + 1][hf.field_t].field_r = 975;
                                      rg.field_wb = -10;
                                      bd.field_k = bd.field_k - 10;
                                      if (sc.field_b) {
                                        ag.a(true, 28, hf.field_t << 5, 1 + ca.field_k << 5);
                                        if (var21 == 0) {
                                          break L304;
                                        } else {
                                          break L305;
                                        }
                                      } else {
                                        break L304;
                                      }
                                    }
                                  }
                                }
                              }
                              rg.field_wb = 0;
                              break L304;
                            }
                          }
                        }
                        L306: {
                          var9 = 0;
                          if (sk.field_d >= -40) {
                            break L306;
                          } else {
                            if (mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                              L307: {
                                sk.field_d = -40;
                                if (var8 == 0) {
                                  break L307;
                                } else {
                                  if (rg.field_wb >= -28) {
                                    break L307;
                                  } else {
                                    if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_v) {
                                      break L307;
                                    } else {
                                      mh.field_e[-1 + ca.field_k][hf.field_t].field_S = true;
                                      mh.field_e[ca.field_k + -1][hf.field_t].field_r = 975;
                                      rg.field_wb = 10;
                                      bd.field_k = bd.field_k - 10;
                                      if (sc.field_b) {
                                        ag.a(true, 28, hf.field_t << 5, -1 + ca.field_k << 5);
                                        if (var21 == 0) {
                                          break L306;
                                        } else {
                                          break L307;
                                        }
                                      } else {
                                        break L306;
                                      }
                                    }
                                  }
                                }
                              }
                              rg.field_wb = 0;
                              break L306;
                            } else {
                              break L306;
                            }
                          }
                        }
                        L308: {
                          if (sk.field_d <= 160) {
                            break L308;
                          } else {
                            var9 = 1;
                            ca.field_k = ca.field_k + 1;
                            sk.field_d = sk.field_d - 320;
                            break L308;
                          }
                        }
                        L309: {
                          if (sk.field_d < -160) {
                            ca.field_k = ca.field_k - 1;
                            var9 = 1;
                            sk.field_d = sk.field_d + 320;
                            break L309;
                          } else {
                            break L309;
                          }
                        }
                        L310: {
                          if (mf.field_i > 160) {
                            mf.field_i = mf.field_i - 320;
                            var9 = 1;
                            hf.field_t = hf.field_t + 1;
                            break L310;
                          } else {
                            break L310;
                          }
                        }
                        L311: {
                          if (mf.field_i >= -160) {
                            break L311;
                          } else {
                            mf.field_i = mf.field_i + 320;
                            hf.field_t = hf.field_t - 1;
                            var9 = 1;
                            break L311;
                          }
                        }
                        L312: {
                          if (var9 != 0) {
                            if (var4 != 0) {
                              break L312;
                            } else {
                              if (je.field_O.f(hf.field_t, 2, ca.field_k)) {
                                ne.a(ll.a((byte) -73, 4) + 57, 85);
                                break L312;
                              } else {
                                break L312;
                              }
                            }
                          } else {
                            break L312;
                          }
                        }
                        L313: {
                          L314: {
                            if (0 >= bd.field_k) {
                              break L314;
                            } else {
                              rj.field_f = 4;
                              if (var21 == 0) {
                                break L313;
                              } else {
                                break L314;
                              }
                            }
                          }
                          if (bd.field_k != 0) {
                            break L313;
                          } else {
                            if (rg.field_wb * rg.field_wb <= 225) {
                              break L313;
                            } else {
                              L315: {
                                if (rg.field_wb >= 0) {
                                  break L315;
                                } else {
                                  rg.field_wb = -15;
                                  if (var21 == 0) {
                                    break L313;
                                  } else {
                                    break L315;
                                  }
                                }
                              }
                              rg.field_wb = 15;
                              break L313;
                            }
                          }
                        }
                        L316: {
                          if (var2_int != 0) {
                            break L316;
                          } else {
                            L317: {
                              if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                                break L317;
                              } else {
                                if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                                  break L317;
                                } else {
                                  break L316;
                                }
                              }
                            }
                            L318: {
                              if (!sc.field_b) {
                                break L318;
                              } else {
                                ag.a(true, 17, hf.field_t * 32, ca.field_k * 32);
                                break L318;
                              }
                            }
                            rj.field_f = 2;
                            break L316;
                          }
                        }
                        L319: {
                          if (var2_int == 0) {
                            break L319;
                          } else {
                            rj.field_f = 1;
                            break L319;
                          }
                        }
                        L320: {
                          L321: {
                            L322: {
                              if (!qd.field_O[98]) {
                                break L322;
                              } else {
                                if (!qd.field_O[49]) {
                                  break L322;
                                } else {
                                  if (!qe.field_b[20]) {
                                    break L322;
                                  } else {
                                    if (10 < qd.field_K) {
                                      break L321;
                                    } else {
                                      break L322;
                                    }
                                  }
                                }
                              }
                            }
                            if (je.c(ca.field_k, hf.field_t, 1, 3)) {
                              break L320;
                            } else {
                              if (pl.field_h == 15) {
                                L323: {
                                  var13 = (640 + mf.field_i * 4) / 320;
                                  if (var13 != 4) {
                                    break L323;
                                  } else {
                                    var13--;
                                    break L323;
                                  }
                                }
                                L324: {
                                  if (!je.c(ca.field_k, hf.field_t - -1, 1, var13)) {
                                    break L324;
                                  } else {
                                    gm.b(100);
                                    break L324;
                                  }
                                }
                                if (var21 == 0) {
                                  break L320;
                                } else {
                                  break L321;
                                }
                              } else {
                                break L320;
                              }
                            }
                          }
                          rj.field_f = 12;
                          break L320;
                        }
                        L325: {
                          if (rj.field_f == 3) {
                            tb.field_c = 7;
                            break L325;
                          } else {
                            break L325;
                          }
                        }
                        L326: {
                          if (rj.field_f != 4) {
                            break L326;
                          } else {
                            tb.field_c = 15;
                            break L326;
                          }
                        }
                        L327: {
                          tb.field_c = 41;
                          if (-10 < bd.field_k) {
                            tb.field_c = tb.field_c + 1;
                            break L327;
                          } else {
                            break L327;
                          }
                        }
                        L328: {
                          if (bd.field_k > -20) {
                            tb.field_c = tb.field_c + 1;
                            break L328;
                          } else {
                            break L328;
                          }
                        }
                        if (var2_int != 0) {
                          tb.field_c = 45;
                          if (var21 == 0) {
                            break L110;
                          } else {
                            break L116;
                          }
                        } else {
                          break L110;
                        }
                      }
                      L329: {
                        tb.field_c = 48;
                        if (kj.field_d <= 3) {
                          break L329;
                        } else {
                          tb.field_c = tb.field_c + 1;
                          break L329;
                        }
                      }
                      L330: {
                        if (7 >= kj.field_d) {
                          break L330;
                        } else {
                          tb.field_c = tb.field_c + 1;
                          break L330;
                        }
                      }
                      L331: {
                        kj.field_d = kj.field_d + 1;
                        if (kj.field_d == 4) {
                          L332: {
                            if (!mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_a) {
                              break L332;
                            } else {
                              if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_b) {
                                break L332;
                              } else {
                                L333: {
                                  L334: {
                                    if (cm.field_o != 1) {
                                      break L334;
                                    } else {
                                      L335: {
                                        if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_E) {
                                          break L335;
                                        } else {
                                          L336: {
                                            if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_v) {
                                              break L336;
                                            } else {
                                              ne.a(ll.a((byte) -73, 3) + 54, param0 + 16598);
                                              if (var21 == 0) {
                                                break L333;
                                              } else {
                                                break L336;
                                              }
                                            }
                                          }
                                          ne.a(51 - -ll.a((byte) -73, 3), -125);
                                          if (var21 == 0) {
                                            break L333;
                                          } else {
                                            break L335;
                                          }
                                        }
                                      }
                                      ne.a(ll.a((byte) -73, 3) + 48, 71);
                                      if (var21 == 0) {
                                        break L333;
                                      } else {
                                        break L334;
                                      }
                                    }
                                  }
                                  ne.a(24, -105);
                                  break L333;
                                }
                                if (!mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_S) {
                                  break L331;
                                } else {
                                  ne.a(21, 106);
                                  if (var21 == 0) {
                                    break L331;
                                  } else {
                                    break L332;
                                  }
                                }
                              }
                            }
                          }
                          if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_b) {
                            ne.a(23, -119);
                            if (!sc.field_b) {
                              break L331;
                            } else {
                              ag.a(true, 2, 32 * ((MinerDisturbance) this).field_N, 32 * ((MinerDisturbance) this).field_db);
                              break L331;
                            }
                          } else {
                            break L331;
                          }
                        } else {
                          break L331;
                        }
                      }
                      L337: {
                        if (7 == kj.field_d) {
                          if (!mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_a) {
                            break L337;
                          } else {
                            if (!mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_b) {
                              L338: {
                                if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_S) {
                                  break L338;
                                } else {
                                  if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_v) {
                                    break L338;
                                  } else {
                                    mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_S = true;
                                    mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_r = 975;
                                    rg.field_sb = rg.field_sb - 3;
                                    if (var21 == 0) {
                                      break L337;
                                    } else {
                                      break L338;
                                    }
                                  }
                                }
                              }
                              L339: {
                                if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_v) {
                                  lb.field_r = lb.field_r + 1;
                                  if (200 > lb.field_r) {
                                    break L339;
                                  } else {
                                    fn.a(24, 231, 3);
                                    break L339;
                                  }
                                } else {
                                  break L339;
                                }
                              }
                              mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_a = false;
                              rg.field_sb = rg.field_sb - 3;
                              break L337;
                            } else {
                              break L337;
                            }
                          }
                        } else {
                          break L337;
                        }
                      }
                      if (kj.field_d <= 10) {
                        break L110;
                      } else {
                        rj.field_f = 0;
                        if (var21 == 0) {
                          break L110;
                        } else {
                          break L115;
                        }
                      }
                    }
                    L340: {
                      tb.field_c = 56;
                      if (kj.field_d <= 3) {
                        break L340;
                      } else {
                        tb.field_c = tb.field_c + 1;
                        break L340;
                      }
                    }
                    L341: {
                      if (7 >= kj.field_d) {
                        break L341;
                      } else {
                        tb.field_c = tb.field_c + 1;
                        break L341;
                      }
                    }
                    L342: {
                      kj.field_d = kj.field_d + 1;
                      if (kj.field_d == 5) {
                        if (!mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_a) {
                          break L342;
                        } else {
                          if (!mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_b) {
                            L343: {
                              if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_S) {
                                break L343;
                              } else {
                                if (mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_v) {
                                  break L343;
                                } else {
                                  mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_S = true;
                                  mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_r = 975;
                                  rg.field_sb = rg.field_sb - 3;
                                  if (var21 == 0) {
                                    break L342;
                                  } else {
                                    break L343;
                                  }
                                }
                              }
                            }
                            L344: {
                              if (!sc.field_b) {
                                break L344;
                              } else {
                                if (!mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_b) {
                                  break L344;
                                } else {
                                  ag.a(true, 2, ((MinerDisturbance) this).field_N * 32, ((MinerDisturbance) this).field_db * 32);
                                  break L344;
                                }
                              }
                            }
                            ne.a(21, param0 ^ 16424);
                            mh.field_e[((MinerDisturbance) this).field_db][((MinerDisturbance) this).field_N].field_a = false;
                            rg.field_sb = rg.field_sb - 3;
                            break L342;
                          } else {
                            break L342;
                          }
                        }
                      } else {
                        break L342;
                      }
                    }
                    if (kj.field_d <= 10) {
                      break L110;
                    } else {
                      rj.field_f = 3;
                      if (var21 == 0) {
                        break L110;
                      } else {
                        break L114;
                      }
                    }
                  }
                  L345: {
                    tb.field_c = 96;
                    kj.field_d = kj.field_d + 1;
                    if (5 < kj.field_d) {
                      tb.field_c = tb.field_c + 1;
                      break L345;
                    } else {
                      break L345;
                    }
                  }
                  L346: {
                    if (kj.field_d > 10) {
                      tb.field_c = tb.field_c + 1;
                      break L346;
                    } else {
                      break L346;
                    }
                  }
                  L347: {
                    if (kj.field_d != 16) {
                      break L347;
                    } else {
                      L348: {
                        var13 = jf.b((byte) 52);
                        uf.field_p[var13] = new gf(ca.field_k, hf.field_t, 11);
                        uf.field_p[var13].field_i = di.field_K;
                        if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                          uf.field_p[var13].field_g = -1;
                          break L348;
                        } else {
                          break L348;
                        }
                      }
                      ne.a(0, param0 + 16391);
                      break L347;
                    }
                  }
                  L349: {
                    if (kj.field_d <= 15) {
                      break L349;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L349;
                    }
                  }
                  L350: {
                    if (kj.field_d <= 20) {
                      break L350;
                    } else {
                      tb.field_c = tb.field_c + 1;
                      break L350;
                    }
                  }
                  L351: {
                    if (kj.field_d <= 34) {
                      break L351;
                    } else {
                      L352: {
                        if (!qd.field_O[81]) {
                          break L352;
                        } else {
                          kj.field_d = 15;
                          tb.field_c = 98;
                          if (var21 == 0) {
                            break L351;
                          } else {
                            break L352;
                          }
                        }
                      }
                      tb.field_c = tb.field_c + 1;
                      break L351;
                    }
                  }
                  if (kj.field_d <= 40) {
                    break L110;
                  } else {
                    rj.field_f = 0;
                    if (var21 == 0) {
                      break L110;
                    } else {
                      break L113;
                    }
                  }
                }
                L353: {
                  var10 = di.field_K + ca.field_k;
                  var11 = -16 + var10;
                  if (var11 >= 0) {
                    break L353;
                  } else {
                    var11 = -var11;
                    break L353;
                  }
                }
                L354: {
                  L355: {
                    if (0 >= var10) {
                      break L355;
                    } else {
                      if (var10 >= 31) {
                        break L355;
                      } else {
                        if (0 >= hf.field_t) {
                          break L355;
                        } else {
                          if (var10 <= 0) {
                            break L355;
                          } else {
                            if (var10 >= 31) {
                              break L355;
                            } else {
                              if (~(-1 + je.field_t) >= ~hf.field_t) {
                                break L355;
                              } else {
                                if (hf.field_t > var11 / 2) {
                                  break L354;
                                } else {
                                  break L355;
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
                    break L110;
                  } else {
                    break L354;
                  }
                }
                L356: {
                  kj.field_d = kj.field_d + 1;
                  tb.field_c = 88;
                  if (kj.field_d > 5) {
                    tb.field_c = 89;
                    break L356;
                  } else {
                    break L356;
                  }
                }
                L357: {
                  if (15 < kj.field_d) {
                    tb.field_c = 90;
                    break L357;
                  } else {
                    break L357;
                  }
                }
                L358: {
                  if (18 == kj.field_d) {
                    L359: {
                      L360: {
                        if (!mh.field_e[ca.field_k - -di.field_K][hf.field_t].field_S) {
                          break L360;
                        } else {
                          L361: {
                            L362: {
                              if (mh.field_e[ca.field_k - -(2 * di.field_K)][hf.field_t].field_a) {
                                break L362;
                              } else {
                                mh.field_e[di.field_K * 2 + ca.field_k][hf.field_t].field_a = true;
                                mh.field_e[di.field_K + ca.field_k][hf.field_t].field_a = false;
                                mh.field_e[ca.field_k + di.field_K * 2][hf.field_t].field_U = mh.field_e[di.field_K + ca.field_k][hf.field_t].field_U;
                                mh.field_e[di.field_K + ca.field_k][hf.field_t].field_U = -1;
                                mh.field_e[di.field_K * 2 + ca.field_k][hf.field_t].field_S = mh.field_e[di.field_K + ca.field_k][hf.field_t].field_S;
                                mh.field_e[ca.field_k + di.field_K * 2][hf.field_t].field_r = 1000;
                                uf.field_p[jf.b((byte) 108)] = new gf(di.field_K + ca.field_k, hf.field_t, 8);
                                if (var21 == 0) {
                                  break L361;
                                } else {
                                  break L362;
                                }
                              }
                            }
                            mh.field_e[ca.field_k + di.field_K][hf.field_t].field_a = false;
                            break L361;
                          }
                          rg.field_wb = 50 * di.field_K;
                          rj.field_f = 3;
                          bd.field_k = -10;
                          if (var21 == 0) {
                            break L359;
                          } else {
                            break L360;
                          }
                        }
                      }
                      mh.field_e[ca.field_k - -di.field_K][hf.field_t].field_S = true;
                      mh.field_e[ca.field_k + di.field_K][hf.field_t].field_r = 1000;
                      break L359;
                    }
                    uf.field_p[jf.b((byte) 60)] = new gf(di.field_K + ca.field_k, hf.field_t, 8);
                    break L358;
                  } else {
                    break L358;
                  }
                }
                if (kj.field_d <= 20) {
                  break L110;
                } else {
                  rj.field_f = 0;
                  if (var21 == 0) {
                    break L110;
                  } else {
                    break L112;
                  }
                }
              }
              L363: {
                tb.field_c = 128;
                kj.field_d = kj.field_d + 1;
                if (kj.field_d <= 5) {
                  break L363;
                } else {
                  tb.field_c = tb.field_c + 1;
                  break L363;
                }
              }
              L364: {
                if (kj.field_d > 10) {
                  tb.field_c = tb.field_c + 1;
                  break L364;
                } else {
                  break L364;
                }
              }
              L365: {
                if (15 >= kj.field_d) {
                  break L365;
                } else {
                  tb.field_c = tb.field_c + 1;
                  break L365;
                }
              }
              L366: {
                if (kj.field_d > 20) {
                  tb.field_c = tb.field_c + 1;
                  break L366;
                } else {
                  break L366;
                }
              }
              L367: {
                if (30 >= kj.field_d) {
                  break L367;
                } else {
                  tb.field_c = tb.field_c + 1;
                  break L367;
                }
              }
              L368: {
                if (35 < kj.field_d) {
                  tb.field_c = tb.field_c + 1;
                  break L368;
                } else {
                  break L368;
                }
              }
              L369: {
                if (kj.field_d <= 40) {
                  break L369;
                } else {
                  tb.field_c = tb.field_c + 1;
                  break L369;
                }
              }
              L370: {
                if (kj.field_d > 45) {
                  tb.field_c = tb.field_c - 2;
                  break L370;
                } else {
                  break L370;
                }
              }
              L371: {
                if (kj.field_d <= 50) {
                  break L371;
                } else {
                  tb.field_c = tb.field_c + 1;
                  break L371;
                }
              }
              L372: {
                if (kj.field_d <= 55) {
                  break L372;
                } else {
                  tb.field_c = tb.field_c + 1;
                  break L372;
                }
              }
              if (kj.field_d > 60) {
                rj.field_f = 0;
                if (var21 == 0) {
                  break L110;
                } else {
                  break L111;
                }
              } else {
                break L110;
              }
            }
            L373: {
              ne.a(35, param0 + 16440);
              kj.field_d = kj.field_d + 1;
              if (kj.field_d <= 5) {
                break L373;
              } else {
                tb.field_c = tb.field_c + 1;
                kj.field_d = 0;
                break L373;
              }
            }
            L374: {
              L375: {
                if (tb.field_c < 0) {
                  break L375;
                } else {
                  if (~rg.field_tb.length >= ~tb.field_c) {
                    break L375;
                  } else {
                    break L374;
                  }
                }
              }
              tb.field_c = 0;
              break L374;
            }
            L376: {
              if (qd.field_K > 0) {
                qd.field_K = qd.field_K - 1;
                break L376;
              } else {
                break L376;
              }
            }
            L377: {
              if (!d.field_b) {
                break L377;
              } else {
                if (!qd.field_O[96]) {
                  break L377;
                } else {
                  di.field_K = -1;
                  rg.field_wb = -10;
                  break L377;
                }
              }
            }
            L378: {
              if (!d.field_b) {
                break L378;
              } else {
                if (qd.field_O[97]) {
                  rg.field_wb = 10;
                  di.field_K = 1;
                  break L378;
                } else {
                  break L378;
                }
              }
            }
            L379: {
              if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                break L379;
              } else {
                je.field_O.a(ca.field_k, param0 ^ 16506, hf.field_t);
                int dupTemp$7 = jf.b((byte) 73);
                gf dupTemp$8 = new gf(ca.field_k, hf.field_t, 16);
                uf.field_p[dupTemp$7] = dupTemp$8;
                var13_ref_gf = dupTemp$8;
                var13_ref_gf.field_b = 250;
                break L379;
              }
            }
            L380: {
              L381: {
                if (qd.field_K <= 0) {
                  break L381;
                } else {
                  if (!d.field_b) {
                    break L381;
                  } else {
                    if (!qd.field_O[98]) {
                      break L381;
                    } else {
                      if (!qd.field_O[49]) {
                        break L381;
                      } else {
                        stackOut_1444_0 = 1;
                        stackIn_1446_0 = stackOut_1444_0;
                        break L380;
                      }
                    }
                  }
                }
              }
              stackOut_1445_0 = 0;
              stackIn_1446_0 = stackOut_1445_0;
              break L380;
            }
            L382: {
              L383: {
                var12 = stackIn_1446_0;
                if (var12 == 0) {
                  break L383;
                } else {
                  if (bd.field_k <= -80) {
                    break L383;
                  } else {
                    bd.field_k = bd.field_k - 1;
                    if (var21 == 0) {
                      break L382;
                    } else {
                      break L383;
                    }
                  }
                }
              }
              if (40 > bd.field_k) {
                bd.field_k = bd.field_k + 1;
                break L382;
              } else {
                break L382;
              }
            }
            L384: {
              L385: {
                if (!qd.field_O[98]) {
                  break L385;
                } else {
                  if (qd.field_K != 0) {
                    break L384;
                  } else {
                    break L385;
                  }
                }
              }
              L386: {
                if (var2_int == 0) {
                  break L386;
                } else {
                  rj.field_f = 1;
                  bd.field_k = 0;
                  mf.field_i = 0;
                  if (var21 == 0) {
                    break L384;
                  } else {
                    break L386;
                  }
                }
              }
              rj.field_f = 4;
              break L384;
            }
            L387: {
              L388: {
                sk.field_d = sk.field_d + rg.field_wb;
                mf.field_i = mf.field_i + bd.field_k;
                if (var4 != 0) {
                  break L388;
                } else {
                  if (tc.field_s <= 0) {
                    break L387;
                  } else {
                    break L388;
                  }
                }
              }
              if (var12 == 0) {
                break L387;
              } else {
                if (qe.field_b[15]) {
                  break L387;
                } else {
                  nf.field_e = 40;
                  rj.field_f = 13;
                  break L387;
                }
              }
            }
            L389: {
              L390: {
                if (var12 == 0) {
                  break L390;
                } else {
                  L391: {
                    if (mf.field_i <= 40) {
                      break L391;
                    } else {
                      if (mh.field_e[ca.field_k][hf.field_t - -1].g()) {
                        mf.field_i = 40;
                        bd.field_k = 0;
                        break L391;
                      } else {
                        break L391;
                      }
                    }
                  }
                  if (mf.field_i >= -40) {
                    break L389;
                  } else {
                    if (mh.field_e[ca.field_k][hf.field_t - 1].g()) {
                      bd.field_k = 0;
                      mf.field_i = -40;
                      if (var21 == 0) {
                        break L389;
                      } else {
                        break L390;
                      }
                    } else {
                      break L389;
                    }
                  }
                }
              }
              L392: {
                if (sk.field_d <= 80) {
                  break L392;
                } else {
                  if (!mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                    break L392;
                  } else {
                    sk.field_d = 80;
                    break L392;
                  }
                }
              }
              if (sk.field_d >= -80) {
                break L389;
              } else {
                if (mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                  sk.field_d = -80;
                  break L389;
                } else {
                  break L389;
                }
              }
            }
            L393: {
              if (80 >= sk.field_d) {
                break L393;
              } else {
                if (-40 <= mf.field_i) {
                  break L393;
                } else {
                  if (!mh.field_e[ca.field_k + 1][-1 + hf.field_t].g()) {
                    break L393;
                  } else {
                    sk.field_d = 80;
                    break L393;
                  }
                }
              }
            }
            L394: {
              if (sk.field_d >= -80) {
                break L394;
              } else {
                if (-40 <= mf.field_i) {
                  break L394;
                } else {
                  if (mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                    sk.field_d = -80;
                    break L394;
                  } else {
                    break L394;
                  }
                }
              }
            }
            L395: {
              if (sk.field_d <= 80) {
                break L395;
              } else {
                if (mf.field_i <= 40) {
                  break L395;
                } else {
                  if (mh.field_e[ca.field_k + 1][hf.field_t - -1].g()) {
                    sk.field_d = 80;
                    break L395;
                  } else {
                    break L395;
                  }
                }
              }
            }
            L396: {
              if (sk.field_d >= -80) {
                break L396;
              } else {
                if (mf.field_i <= 40) {
                  break L396;
                } else {
                  if (mh.field_e[ca.field_k - 1][1 + hf.field_t].g()) {
                    sk.field_d = -80;
                    break L396;
                  } else {
                    break L396;
                  }
                }
              }
            }
            L397: {
              L398: {
                if (var12 != 0) {
                  break L398;
                } else {
                  L399: {
                    if (40 >= mf.field_i) {
                      break L399;
                    } else {
                      if (!mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                        break L399;
                      } else {
                        mf.field_i = 40;
                        bd.field_k = 0;
                        break L399;
                      }
                    }
                  }
                  if (-40 <= mf.field_i) {
                    break L397;
                  } else {
                    if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                      mf.field_i = -40;
                      bd.field_k = 0;
                      if (var21 == 0) {
                        break L397;
                      } else {
                        break L398;
                      }
                    } else {
                      break L397;
                    }
                  }
                }
              }
              L400: {
                if (sk.field_d <= 80) {
                  break L400;
                } else {
                  if (!mh.field_e[ca.field_k - -1][hf.field_t].g()) {
                    break L400;
                  } else {
                    sk.field_d = 80;
                    break L400;
                  }
                }
              }
              if (sk.field_d >= -80) {
                break L397;
              } else {
                if (!mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                  break L397;
                } else {
                  sk.field_d = -80;
                  break L397;
                }
              }
            }
            L401: {
              if (sk.field_d > 160) {
                ca.field_k = ca.field_k + 1;
                sk.field_d = sk.field_d - 320;
                break L401;
              } else {
                break L401;
              }
            }
            L402: {
              if (mf.field_i <= 160) {
                break L402;
              } else {
                mf.field_i = mf.field_i - 320;
                hf.field_t = hf.field_t + 1;
                break L402;
              }
            }
            L403: {
              if (sk.field_d < -160) {
                ca.field_k = ca.field_k - 1;
                sk.field_d = sk.field_d + 320;
                break L403;
              } else {
                break L403;
              }
            }
            L404: {
              if (mf.field_i >= -160) {
                break L404;
              } else {
                mf.field_i = mf.field_i + 320;
                hf.field_t = hf.field_t - 1;
                break L404;
              }
            }
            if (je.c(ca.field_k, hf.field_t, 1, 1)) {
              rj.field_f = 2;
              break L110;
            } else {
              break L110;
            }
          }
          L405: {
            L406: {
              L407: {
                if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                  break L407;
                } else {
                  if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                    break L407;
                  } else {
                    if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                      break L406;
                    } else {
                      if (qe.field_b[3]) {
                        break L406;
                      } else {
                        break L407;
                      }
                    }
                  }
                }
              }
              L408: {
                L409: {
                  if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                    break L409;
                  } else {
                    if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                      break L409;
                    } else {
                      if (kn.field_E <= 300) {
                        break L409;
                      } else {
                        if (qe.field_b[3]) {
                          break L409;
                        } else {
                          L410: {
                            if (!sc.field_b) {
                              break L410;
                            } else {
                              if (ni.a(16, 11764)) {
                                break L410;
                              } else {
                                var6 = 32 * ca.field_k - -(sk.field_d / 10);
                                var7 = mf.field_i / 10 + 32 * hf.field_t;
                                var8 = -pd.field_a.field_x + (var6 - 1);
                                var9 = -1 + var7;
                                ag.a(true, 16, -(ef.field_b[3].field_A >> 1) + (pd.field_a.field_A >> 1) + var9, -ef.field_b[3].field_y + var8);
                                break L410;
                              }
                            }
                          }
                          kn.field_E = 300;
                          if (var21 == 0) {
                            break L408;
                          } else {
                            break L409;
                          }
                        }
                      }
                    }
                  }
                }
                if (!sc.field_b) {
                  break L408;
                } else {
                  L411: {
                    L412: {
                      L413: {
                        if (qe.field_b[2]) {
                          break L413;
                        } else {
                          if (!qe.field_b[19]) {
                            break L412;
                          } else {
                            break L413;
                          }
                        }
                      }
                      if (kn.field_E < 950) {
                        break L411;
                      } else {
                        break L412;
                      }
                    }
                    if (qe.field_b[2]) {
                      break L408;
                    } else {
                      if (450 <= kn.field_E) {
                        break L408;
                      } else {
                        break L411;
                      }
                    }
                  }
                  if (ni.a(9, 11764)) {
                    break L408;
                  } else {
                    var6 = sk.field_d / 10 + ca.field_k * 32;
                    var7 = mf.field_i / 10 + 32 * hf.field_t;
                    var8 = -1 + -pd.field_a.field_x + var6;
                    var9 = -1 + var7;
                    ag.a(true, 9, -(ef.field_b[3].field_A >> 1) + (pd.field_a.field_A >> 1) + var9, var8 - ef.field_b[3].field_y);
                    break L408;
                  }
                }
              }
              L414: {
                kn.field_E = kn.field_E - 1;
                if (kn.field_E < 0) {
                  break L414;
                } else {
                  if (kn.field_E % 50 <= 5) {
                    break L405;
                  } else {
                    if (kn.field_E % 50 >= 30) {
                      break L405;
                    } else {
                      if (kn.field_E < 300) {
                        break L414;
                      } else {
                        break L405;
                      }
                    }
                  }
                }
              }
              L415: {
                tb.field_c = 55;
                if (!je.c(ca.field_k, hf.field_t, 1, 1)) {
                  break L415;
                } else {
                  tb.field_c = 63;
                  break L415;
                }
              }
              if (kn.field_E < 0) {
                L416: {
                  if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                    break L416;
                  } else {
                    L417: {
                      if (je.a(ca.field_k, hf.field_t, 1, 1)) {
                        break L417;
                      } else {
                        if (!je.d(ca.field_k, hf.field_t, 1, 1)) {
                          break L405;
                        } else {
                          rj.a((byte) -38, 2);
                          if (var21 == 0) {
                            break L405;
                          } else {
                            break L417;
                          }
                        }
                      }
                    }
                    rj.a((byte) -38, 11);
                    if (var21 == 0) {
                      break L405;
                    } else {
                      break L416;
                    }
                  }
                }
                rj.a((byte) -38, 1);
                if (var21 == 0) {
                  break L405;
                } else {
                  break L406;
                }
              } else {
                break L405;
              }
            }
            L418: {
              kn.field_E = 500;
              if (qe.field_b[2]) {
                kn.field_E = 1000;
                break L418;
              } else {
                break L418;
              }
            }
            if (qe.field_b[19]) {
              kn.field_E = 2000;
              break L405;
            } else {
              break L405;
            }
          }
          L419: {
            L420: {
              L421: {
                if (qe.field_b[16]) {
                  break L421;
                } else {
                  if (1 != cm.field_o) {
                    break L421;
                  } else {
                    if (mh.field_e[ca.field_k][hf.field_t].field_A) {
                      break L420;
                    } else {
                      break L421;
                    }
                  }
                }
              }
              if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                break L419;
              } else {
                if (!je.a(ca.field_k, hf.field_t, 1, 1)) {
                  cn.field_C = cn.field_C + 1;
                  if (cn.field_C > 0) {
                    cn.field_C = 0;
                    if (var21 == 0) {
                      break L419;
                    } else {
                      break L420;
                    }
                  } else {
                    break L419;
                  }
                } else {
                  break L419;
                }
              }
            }
            L422: {
              cn.field_C = cn.field_C - 1;
              if (!sc.field_b) {
                break L422;
              } else {
                if (!ni.a(29, 11764)) {
                  var6 = 32 * ca.field_k - -(sk.field_d / 10);
                  var7 = mf.field_i / 10 + 32 * hf.field_t;
                  var8 = 28 + var6;
                  var9 = -1 + var7;
                  ag.a(true, 29, var9 - -8 + -(ef.field_b[3].field_A >> 1), var8 - 2);
                  break L422;
                } else {
                  break L422;
                }
              }
            }
            if (-300 <= cn.field_C) {
              break L419;
            } else {
              if (15 != pl.field_h) {
                break L419;
              } else {
                L423: {
                  if (ke.field_V) {
                    cn.field_C = -300;
                    break L423;
                  } else {
                    break L423;
                  }
                }
                rj.a((byte) -38, 8);
                break L419;
              }
            }
          }
          L424: {
            L425: {
              if (je.e(ca.field_k, hf.field_t, 1, 1) > 0) {
                break L425;
              } else {
                if (je.e(ca.field_k, hf.field_t, 2, 2) <= 0) {
                  break L424;
                } else {
                  break L425;
                }
              }
            }
            rj.a((byte) -38, 3);
            break L424;
          }
          L426: {
            var6 = je.a() ? 1 : 0;
            if (pl.field_h != 15) {
              break L426;
            } else {
              if (ul.field_b != 0) {
                break L426;
              } else {
                if (var6 != 0) {
                  ul.field_b = 30;
                  break L426;
                } else {
                  break L426;
                }
              }
            }
          }
          L427: {
            var7 = je.field_O.f(hf.field_t, 2, ca.field_k) ? 1 : 0;
            if (ul.field_b <= 0) {
              break L427;
            } else {
              L428: {
                if (var2_int != 0) {
                  break L428;
                } else {
                  if (var6 != 0) {
                    break L428;
                  } else {
                    if (var7 != 0) {
                      break L428;
                    } else {
                      break L427;
                    }
                  }
                }
              }
              L429: {
                if (var6 != 0) {
                  break L429;
                } else {
                  if (var7 != 0) {
                    var8_ref_gf = new gf(ca.field_k, hf.field_t, 16);
                    var8_ref_gf.field_b = 250;
                    uf.field_p[jf.b((byte) 53)] = var8_ref_gf;
                    ul.field_b = 1;
                    break L429;
                  } else {
                    break L429;
                  }
                }
              }
              int fieldTemp$9 = ul.field_b - 1;
              ul.field_b = ul.field_b - 1;
              if (fieldTemp$9 != 0) {
                break L427;
              } else {
                rj.a((byte) -38, 12);
                break L427;
              }
            }
          }
          L430: {
            if (!mh.field_e[ca.field_k][hf.field_t].field_a) {
              break L430;
            } else {
              if (mh.field_e[ca.field_k][hf.field_t].field_v) {
                break L430;
              } else {
                if (qe.field_b[7]) {
                  break L430;
                } else {
                  rj.a((byte) -38, 4);
                  break L430;
                }
              }
            }
          }
          L431: {
            if (ch.field_h != -1) {
              L432: {
                tb.field_c = ch.field_h;
                cl.field_I = cl.field_I + 1;
                if (ch.field_h >= 5) {
                  break L432;
                } else {
                  if (ch.field_h < 0) {
                    break L432;
                  } else {
                    L433: {
                      tb.field_c = 4 * ch.field_h + 64;
                      if (cl.field_I <= 5) {
                        break L433;
                      } else {
                        tb.field_c = tb.field_c + 1;
                        break L433;
                      }
                    }
                    if (cl.field_I > 10) {
                      tb.field_c = tb.field_c + 1;
                      break L432;
                    } else {
                      break L432;
                    }
                  }
                }
              }
              L434: {
                if (ch.field_h == 5) {
                  L435: {
                    tb.field_c = 0;
                    if (5 < cl.field_I) {
                      tb.field_c = tb.field_c + 1;
                      break L435;
                    } else {
                      break L435;
                    }
                  }
                  if (10 >= cl.field_I) {
                    break L434;
                  } else {
                    tb.field_c = tb.field_c + 1;
                    break L434;
                  }
                } else {
                  break L434;
                }
              }
              L436: {
                if (-1 <= ch.field_h) {
                  break L436;
                } else {
                  L437: {
                    tb.field_c = 3 - -ch.field_h;
                    if (5 < cl.field_I) {
                      tb.field_c = tb.field_c - 1;
                      break L437;
                    } else {
                      break L437;
                    }
                  }
                  if (cl.field_I > 10) {
                    tb.field_c = tb.field_c - 1;
                    break L436;
                  } else {
                    break L436;
                  }
                }
              }
              if (50 < cl.field_I) {
                cl.field_I = 0;
                ch.field_h = -1;
                break L431;
              } else {
                break L431;
              }
            } else {
              break L431;
            }
          }
          L438: {
            stackOut_1791_0 = mh.field_e[ca.field_k][hf.field_t];
            stackIn_1793_0 = stackOut_1791_0;
            stackIn_1792_0 = stackOut_1791_0;
            if (!qe.field_b[6]) {
              stackOut_1793_0 = (je) (Object) stackIn_1793_0;
              stackOut_1793_1 = 180;
              stackIn_1794_0 = stackOut_1793_0;
              stackIn_1794_1 = stackOut_1793_1;
              break L438;
            } else {
              stackOut_1792_0 = (je) (Object) stackIn_1792_0;
              stackOut_1792_1 = 255;
              stackIn_1794_0 = stackOut_1792_0;
              stackIn_1794_1 = stackOut_1792_1;
              break L438;
            }
          }
          L439: {
            L440: {
              stackIn_1794_0.field_i = stackIn_1794_1;
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
                break L440;
              } else {
                L441: {
                  if (qd.field_O[d.field_e]) {
                    break L441;
                  } else {
                    if (var8 == 0) {
                      break L440;
                    } else {
                      if (!qd.field_O[96]) {
                        break L440;
                      } else {
                        if (!qd.field_O[98]) {
                          break L440;
                        } else {
                          break L441;
                        }
                      }
                    }
                  }
                }
                stackOut_1803_0 = 1;
                stackIn_1805_0 = stackOut_1803_0;
                break L439;
              }
            }
            stackOut_1804_0 = 0;
            stackIn_1805_0 = stackOut_1804_0;
            break L439;
          }
          L442: {
            L443: {
              var11 = stackIn_1805_0;
              if (!d.field_b) {
                break L443;
              } else {
                L444: {
                  if (qd.field_O[lb.field_w]) {
                    break L444;
                  } else {
                    if (var8 == 0) {
                      break L443;
                    } else {
                      if (!qd.field_O[98]) {
                        break L443;
                      } else {
                        if (qd.field_O[96]) {
                          break L443;
                        } else {
                          if (qd.field_O[97]) {
                            break L443;
                          } else {
                            break L444;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_1816_0 = 1;
                stackIn_1818_0 = stackOut_1816_0;
                break L442;
              }
            }
            stackOut_1817_0 = 0;
            stackIn_1818_0 = stackOut_1817_0;
            break L442;
          }
          L445: {
            L446: {
              var12 = stackIn_1818_0;
              if (!d.field_b) {
                break L446;
              } else {
                L447: {
                  if (qd.field_O[hd.field_l]) {
                    break L447;
                  } else {
                    if (var8 == 0) {
                      break L446;
                    } else {
                      if (!qd.field_O[97]) {
                        break L446;
                      } else {
                        if (!qd.field_O[98]) {
                          break L446;
                        } else {
                          break L447;
                        }
                      }
                    }
                  }
                }
                stackOut_1827_0 = 1;
                stackIn_1829_0 = stackOut_1827_0;
                break L445;
              }
            }
            stackOut_1828_0 = 0;
            stackIn_1829_0 = stackOut_1828_0;
            break L445;
          }
          L448: {
            L449: {
              var13 = stackIn_1829_0;
              if (!d.field_b) {
                break L449;
              } else {
                L450: {
                  if (qd.field_O[tk.field_g]) {
                    break L450;
                  } else {
                    if (var8 == 0) {
                      break L449;
                    } else {
                      if (!qd.field_O[96]) {
                        break L449;
                      } else {
                        if (!qd.field_O[99]) {
                          break L449;
                        } else {
                          break L450;
                        }
                      }
                    }
                  }
                }
                stackOut_1838_0 = 1;
                stackIn_1840_0 = stackOut_1838_0;
                break L448;
              }
            }
            stackOut_1839_0 = 0;
            stackIn_1840_0 = stackOut_1839_0;
            break L448;
          }
          L451: {
            L452: {
              var14 = stackIn_1840_0;
              if (!d.field_b) {
                break L452;
              } else {
                L453: {
                  if (qd.field_O[qc.field_c]) {
                    break L453;
                  } else {
                    if (var8 == 0) {
                      break L452;
                    } else {
                      if (!qd.field_O[99]) {
                        break L452;
                      } else {
                        if (qd.field_O[96]) {
                          break L452;
                        } else {
                          if (qd.field_O[97]) {
                            break L452;
                          } else {
                            break L453;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_1851_0 = 1;
                stackIn_1853_0 = stackOut_1851_0;
                break L451;
              }
            }
            stackOut_1852_0 = 0;
            stackIn_1853_0 = stackOut_1852_0;
            break L451;
          }
          L454: {
            L455: {
              var15 = stackIn_1853_0;
              if (!d.field_b) {
                break L455;
              } else {
                L456: {
                  if (qd.field_O[qm.field_a]) {
                    break L456;
                  } else {
                    if (var8 == 0) {
                      break L455;
                    } else {
                      if (!qd.field_O[97]) {
                        break L455;
                      } else {
                        if (!qd.field_O[99]) {
                          break L455;
                        } else {
                          break L456;
                        }
                      }
                    }
                  }
                }
                stackOut_1862_0 = 1;
                stackIn_1864_0 = stackOut_1862_0;
                break L454;
              }
            }
            stackOut_1863_0 = 0;
            stackIn_1864_0 = stackOut_1863_0;
            break L454;
          }
          L457: {
            L458: {
              var16 = stackIn_1864_0;
              if (!d.field_b) {
                break L458;
              } else {
                L459: {
                  if (qd.field_O[ge.field_f]) {
                    break L459;
                  } else {
                    if (var8 == 0) {
                      break L458;
                    } else {
                      if (!qd.field_O[96]) {
                        break L458;
                      } else {
                        if (qd.field_O[98]) {
                          break L458;
                        } else {
                          if (qd.field_O[99]) {
                            break L458;
                          } else {
                            break L459;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_1875_0 = 1;
                stackIn_1877_0 = stackOut_1875_0;
                break L457;
              }
            }
            stackOut_1876_0 = 0;
            stackIn_1877_0 = stackOut_1876_0;
            break L457;
          }
          L460: {
            L461: {
              var17 = stackIn_1877_0;
              if (!d.field_b) {
                break L461;
              } else {
                L462: {
                  if (qd.field_O[hi.field_v]) {
                    break L462;
                  } else {
                    if (var8 == 0) {
                      break L461;
                    } else {
                      if (!qd.field_O[97]) {
                        break L461;
                      } else {
                        if (qd.field_O[98]) {
                          break L461;
                        } else {
                          if (qd.field_O[99]) {
                            break L461;
                          } else {
                            break L462;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_1888_0 = 1;
                stackIn_1890_0 = stackOut_1888_0;
                break L460;
              }
            }
            stackOut_1889_0 = 0;
            stackIn_1890_0 = stackOut_1889_0;
            break L460;
          }
          L463: {
            L464: {
              var18 = stackIn_1890_0;
              if (var11 != 0) {
                break L464;
              } else {
                if (var12 != 0) {
                  break L464;
                } else {
                  if (var13 != 0) {
                    break L464;
                  } else {
                    if (var17 != 0) {
                      break L464;
                    } else {
                      if (var18 != 0) {
                        break L464;
                      } else {
                        if (var14 != 0) {
                          break L464;
                        } else {
                          if (var15 != 0) {
                            break L464;
                          } else {
                            if (var16 != 0) {
                              break L464;
                            } else {
                              break L463;
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
            break L463;
          }
          L465: {
            if (rj.field_f > 1) {
              stackOut_1909_0 = 0;
              stackIn_1910_0 = stackOut_1909_0;
              break L465;
            } else {
              stackOut_1908_0 = 1;
              stackIn_1910_0 = stackOut_1908_0;
              break L465;
            }
          }
          L466: {
            L467: {
              var19 = stackIn_1910_0;
              if (var11 != 0) {
                break L467;
              } else {
                if (((MinerDisturbance) this).field_U != 5) {
                  break L466;
                } else {
                  break L467;
                }
              }
            }
            if (var19 == 0) {
              break L466;
            } else {
              if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                break L466;
              } else {
                if (mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                  rj.field_f = 7;
                  kj.field_d = 0;
                  var19 = 0;
                  var9 = ca.field_k - 1;
                  var10 = hf.field_t;
                  di.field_K = -1;
                  break L466;
                } else {
                  break L466;
                }
              }
            }
          }
          L468: {
            L469: {
              if (var14 != 0) {
                break L469;
              } else {
                if (((MinerDisturbance) this).field_U != 3) {
                  break L468;
                } else {
                  break L469;
                }
              }
            }
            if (var19 == 0) {
              break L468;
            } else {
              if (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                break L468;
              } else {
                if (mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                  var10 = hf.field_t;
                  kj.field_d = 0;
                  di.field_K = -1;
                  var19 = 0;
                  var9 = ca.field_k + -1;
                  rj.field_f = 7;
                  break L468;
                } else {
                  break L468;
                }
              }
            }
          }
          L470: {
            L471: {
              if (var13 != 0) {
                break L471;
              } else {
                if (((MinerDisturbance) this).field_U != 5) {
                  break L470;
                } else {
                  break L471;
                }
              }
            }
            if (var19 == 0) {
              break L470;
            } else {
              if (!mh.field_e[ca.field_k - -1][hf.field_t].field_a) {
                break L470;
              } else {
                if (mh.field_e[ca.field_k][-1 + hf.field_t].field_a) {
                  rj.field_f = 7;
                  kj.field_d = 0;
                  di.field_K = 1;
                  var19 = 0;
                  var10 = hf.field_t;
                  var9 = ca.field_k + 1;
                  break L470;
                } else {
                  break L470;
                }
              }
            }
          }
          L472: {
            if (var16 == 0) {
              break L472;
            } else {
              if (var19 == 0) {
                break L472;
              } else {
                if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                  break L472;
                } else {
                  if (!mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                    break L472;
                  } else {
                    var19 = 0;
                    kj.field_d = 0;
                    di.field_K = 1;
                    var9 = ca.field_k - -1;
                    rj.field_f = 7;
                    var10 = hf.field_t;
                    break L472;
                  }
                }
              }
            }
          }
          L473: {
            L474: {
              if (var11 != 0) {
                break L474;
              } else {
                if (5 != ((MinerDisturbance) this).field_U) {
                  break L473;
                } else {
                  break L474;
                }
              }
            }
            if (var19 == 0) {
              break L473;
            } else {
              if (!mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_a) {
                break L473;
              } else {
                var9 = ca.field_k - 1;
                kj.field_d = 0;
                di.field_K = -1;
                var10 = -1 + hf.field_t;
                rj.field_f = 7;
                break L473;
              }
            }
          }
          L475: {
            L476: {
              if (var17 != 0) {
                break L476;
              } else {
                if (4 != ((MinerDisturbance) this).field_U) {
                  break L475;
                } else {
                  break L476;
                }
              }
            }
            if (var19 == 0) {
              break L475;
            } else {
              if (mh.field_e[ca.field_k - 1][hf.field_t].field_a) {
                di.field_K = -1;
                var9 = ca.field_k + -1;
                var10 = hf.field_t;
                rj.field_f = 7;
                kj.field_d = 0;
                break L475;
              } else {
                break L475;
              }
            }
          }
          L477: {
            L478: {
              if (var14 != 0) {
                break L478;
              } else {
                if (((MinerDisturbance) this).field_U != 3) {
                  break L477;
                } else {
                  break L478;
                }
              }
            }
            if (var19 == 0) {
              break L477;
            } else {
              if (!mh.field_e[ca.field_k + -1][hf.field_t - -1].field_a) {
                break L477;
              } else {
                var9 = ca.field_k + -1;
                kj.field_d = 0;
                rj.field_f = 7;
                di.field_K = -1;
                var10 = hf.field_t - -1;
                break L477;
              }
            }
          }
          L479: {
            L480: {
              if (var13 != 0) {
                break L480;
              } else {
                if (((MinerDisturbance) this).field_U != 5) {
                  break L479;
                } else {
                  break L480;
                }
              }
            }
            if (var19 == 0) {
              break L479;
            } else {
              if (mh.field_e[1 + ca.field_k][hf.field_t - 1].field_a) {
                rj.field_f = 7;
                di.field_K = 1;
                var10 = hf.field_t + -1;
                kj.field_d = 0;
                var9 = 1 + ca.field_k;
                break L479;
              } else {
                break L479;
              }
            }
          }
          L481: {
            L482: {
              if (var18 != 0) {
                break L482;
              } else {
                if (((MinerDisturbance) this).field_U != 1) {
                  break L481;
                } else {
                  break L482;
                }
              }
            }
            if (var19 == 0) {
              break L481;
            } else {
              if (mh.field_e[ca.field_k + 1][hf.field_t].field_a) {
                di.field_K = 1;
                kj.field_d = 0;
                var9 = 1 + ca.field_k;
                var10 = hf.field_t;
                rj.field_f = 7;
                break L481;
              } else {
                break L481;
              }
            }
          }
          L483: {
            if (var16 == 0) {
              break L483;
            } else {
              if (var19 == 0) {
                break L483;
              } else {
                if (mh.field_e[1 + ca.field_k][hf.field_t + 1].field_a) {
                  var9 = ca.field_k - -1;
                  var10 = hf.field_t - -1;
                  di.field_K = 1;
                  kj.field_d = 0;
                  rj.field_f = 7;
                  break L483;
                } else {
                  break L483;
                }
              }
            }
          }
          L484: {
            L485: {
              if (var12 != 0) {
                break L485;
              } else {
                if (5 != ((MinerDisturbance) this).field_U) {
                  break L484;
                } else {
                  break L485;
                }
              }
            }
            if (var19 == 0) {
              break L484;
            } else {
              if (mh.field_e[ca.field_k][hf.field_t + -1].field_a) {
                var10 = hf.field_t - 1;
                var9 = ca.field_k;
                di.field_K = 1;
                rj.field_f = 7;
                kj.field_d = 0;
                break L484;
              } else {
                break L484;
              }
            }
          }
          L486: {
            L487: {
              if (var15 != 0) {
                break L487;
              } else {
                if (((MinerDisturbance) this).field_U != 2) {
                  break L486;
                } else {
                  break L487;
                }
              }
            }
            if (var19 == 0) {
              break L486;
            } else {
              if (mh.field_e[ca.field_k][hf.field_t - -1].field_a) {
                var10 = 1 + hf.field_t;
                rj.field_f = 7;
                kj.field_d = 0;
                var9 = ca.field_k;
                break L486;
              } else {
                break L486;
              }
            }
          }
          L488: {
            if (qe.field_b[5]) {
              L489: {
                if (4 < rj.field_f) {
                  stackOut_2023_0 = 0;
                  stackIn_2024_0 = stackOut_2023_0;
                  break L489;
                } else {
                  stackOut_2022_0 = 1;
                  stackIn_2024_0 = stackOut_2022_0;
                  break L489;
                }
              }
              L490: {
                var20 = stackIn_2024_0;
                if (var17 == 0) {
                  break L490;
                } else {
                  if (var20 == 0) {
                    break L490;
                  } else {
                    if (mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                      ne.a(22, 30);
                      var9 = -1 + ca.field_k;
                      var10 = hf.field_t;
                      kj.field_d = 0;
                      rj.field_f = 8;
                      di.field_K = -1;
                      break L490;
                    } else {
                      break L490;
                    }
                  }
                }
              }
              if (var18 == 0) {
                break L488;
              } else {
                if (var20 == 0) {
                  break L488;
                } else {
                  if (!mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
                    break L488;
                  } else {
                    ne.a(22, 33);
                    kj.field_d = 0;
                    rj.field_f = 8;
                    var9 = 1 + ca.field_k;
                    var10 = hf.field_t;
                    di.field_K = 1;
                    break L488;
                  }
                }
              }
            } else {
              break L488;
            }
          }
          L491: {
            if (var9 < 1) {
              break L491;
            } else {
              if (var10 <= 1) {
                break L491;
              } else {
                if (var9 >= 31) {
                  break L491;
                } else {
                  if (je.field_t <= var10) {
                    break L491;
                  } else {
                    ((MinerDisturbance) this).field_db = var9;
                    ((MinerDisturbance) this).field_N = var10;
                    break L491;
                  }
                }
              }
            }
          }
          return;
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
                if (wj.field_j >= 2) {
                  lf.a(-673, (we) (Object) ce.field_d);
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
                ((MinerDisturbance) this).field_N = 54;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.LA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        try {
            ph.field_d = 38054639 ^ param1;
            if (param0 > -11) {
                ((MinerDisturbance) this).field_W = 127;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "MinerDisturbance.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void x(int param0) {
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
                ((MinerDisturbance) this).field_M = 19;
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
            ea discarded$3 = jn.a("locked_option", -29553, "", fl.field_f);
            ea discarded$4 = jn.a("locked_option_end", -29553, "", fl.field_f);
            pk.field_d = jn.a("gold", -29553, "shop", fl.field_f);
            gb.field_a = jn.a("sold", -29553, "shop", fl.field_f);
            kd.field_r = jn.a("green_frame", -29553, "shop", fl.field_f);
            ib.field_a = jn.a("controls", -29553, "", fl.field_f);
            vc.field_p = new ea[9];
            var2_int = 0;
            L3: while (true) {
              L4: {
                if (var2_int >= 9) {
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
                      if (var8_int >= 8) {
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
                                            if (var9[var10_int] != 16777215) {
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
                                    stackOut_20_0 = ~var8_int;
                                    stackOut_20_1 = ~pk.field_h.length;
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
                      stackOut_20_0 = ~var8_int;
                      stackOut_20_1 = ~pk.field_h.length;
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
                                        if (var9[var10_int] != 16777215) {
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
                      te.field_e[0] = new ea[wc.field_c[0].length];
                      stackOut_52_0 = 0;
                      stackIn_53_0 = stackOut_52_0;
                      break L22;
                    }
                    var8_int = stackIn_53_0;
                    L27: while (true) {
                      L28: {
                        L29: {
                          if (~var8_int <= ~te.field_e[0].length) {
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
                        te.field_e[1] = new ea[wc.field_c[1].length];
                        break L28;
                      }
                      var8_int = 0;
                      L30: while (true) {
                        L31: {
                          L32: {
                            if (~te.field_e[1].length >= ~var8_int) {
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
                          ea discarded$5 = jn.a("highscorearrow", -29553, "", fl.field_f);
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
                              if (~te.field_c.length >= ~var8_int) {
                                break L35;
                              } else {
                                nb.field_a[var8_int] = (ea) (Object) ((og) (Object) te.field_c[var8_int]).h();
                                ((og) (Object) nb.field_a[var8_int]).d(0, -40, -40, -40);
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
                                  stackOut_76_0 = (ln[]) var8;
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
                            ai.a((Object[]) (Object) fl.field_j, 0, (Object[]) (Object) var10, 0, fl.field_j.length);
                            ai.a((Object[]) (Object) var9_array, 0, (Object[]) (Object) var10, fl.field_j.length - var8.length, var9_array.length);
                            ai.a((Object[]) (Object) var8, 0, (Object[]) (Object) var10, -var8.length + fl.field_j.length - -var9_array.length, var8.length);
                            var11 = new int[var10.length];
                            var12 = fl.field_j.length - var8.length;
                            L39: while (true) {
                              L40: {
                                L41: {
                                  if (~var12 <= ~var10.length) {
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
                                ce.field_d.a((hd[]) (Object) var10, var11);
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
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.GA(" + param0 + ')');
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
                ((MinerDisturbance) this).a(-88);
                break L1;
              }
            }
            L2: {
              if (null != kf.field_d) {
                ci.a((java.awt.Canvas) (Object) kf.field_d, 0);
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
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.DA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        ln[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ea[] var9 = null;
        double var10_double = 0.0;
        int var10 = 0;
        int var12 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_174_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_153_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_159_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_162_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        var12 = field_ab;
        if (param1) {
          L0: {
            L1: {
              var5 = sa.field_t[cm.field_o];
              if (cm.field_o != 0) {
                break L1;
              } else {
                L2: {
                  var6 = param2 - -104;
                  if (0 != pl.field_h) {
                    var6 += 50;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (a.field_c == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (a.field_c >= 1000) {
                          break L5;
                        } else {
                          ce.field_d.b(v.field_a, param2, param3, param0, -1);
                          var5[1].b(var6, 0);
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (5000 <= a.field_c) {
                          break L6;
                        } else {
                          ce.field_d.b(se.field_J, param2, param3, param0, -1);
                          var5[2].b(var6, 0);
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (25000 <= a.field_c) {
                          break L7;
                        } else {
                          ce.field_d.b(wk.field_b, param2, param3, param0, -1);
                          var5[3].b(var6, 0);
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (a.field_c >= 50000) {
                          break L8;
                        } else {
                          ce.field_d.b(dl.field_b, param2, param3, param0, -1);
                          var5[4].b(var6, 0);
                          if (var12 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (a.field_c < 100000) {
                          break L9;
                        } else {
                          L10: {
                            if (a.field_c >= 200000) {
                              break L10;
                            } else {
                              L11: {
                                ce.field_d.b(bn.field_a, param2, param3, param0, -1);
                                var5[6].b(var6, 0);
                                if (ne.a(false) == 6) {
                                  break L11;
                                } else {
                                  if (3 == ne.a(false)) {
                                    break L11;
                                  } else {
                                    if (2 == ne.a(false)) {
                                      break L11;
                                    } else {
                                      L12: {
                                        stackOut_33_0 = -2;
                                        stackIn_36_0 = stackOut_33_0;
                                        stackIn_34_0 = stackOut_33_0;
                                        if (param1) {
                                          stackOut_36_0 = stackIn_36_0;
                                          stackOut_36_1 = 0;
                                          stackIn_37_0 = stackOut_36_0;
                                          stackIn_37_1 = stackOut_36_1;
                                          break L12;
                                        } else {
                                          stackOut_34_0 = stackIn_34_0;
                                          stackIn_35_0 = stackOut_34_0;
                                          stackOut_35_0 = stackIn_35_0;
                                          stackOut_35_1 = 1;
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_37_1 = stackOut_35_1;
                                          break L12;
                                        }
                                      }
                                      if (stackIn_37_0 != ~ne.a(stackIn_37_1 != 0)) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                              fn.a(0, 255, 3);
                              if (var12 == 0) {
                                break L3;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L13: {
                            if (a.field_c >= 500000) {
                              break L13;
                            } else {
                              L14: {
                                ce.field_d.b(qm.field_n, param2, param3, param0, -1);
                                var5[7].b(var6, 0);
                                if (ne.a(false) == 6) {
                                  break L14;
                                } else {
                                  if (ne.a(false) == 3) {
                                    break L14;
                                  } else {
                                    L15: {
                                      stackOut_46_0 = -3;
                                      stackIn_49_0 = stackOut_46_0;
                                      stackIn_47_0 = stackOut_46_0;
                                      if (param1) {
                                        stackOut_49_0 = stackIn_49_0;
                                        stackOut_49_1 = 0;
                                        stackIn_50_0 = stackOut_49_0;
                                        stackIn_50_1 = stackOut_49_1;
                                        break L15;
                                      } else {
                                        stackOut_47_0 = stackIn_47_0;
                                        stackIn_48_0 = stackOut_47_0;
                                        stackOut_48_0 = stackIn_48_0;
                                        stackOut_48_1 = 1;
                                        stackIn_50_0 = stackOut_48_0;
                                        stackIn_50_1 = stackOut_48_1;
                                        break L15;
                                      }
                                    }
                                    if (stackIn_50_0 == ~ne.a(stackIn_50_1 != 0)) {
                                      break L14;
                                    } else {
                                      L16: {
                                        if (param1) {
                                          stackOut_54_0 = 0;
                                          stackIn_55_0 = stackOut_54_0;
                                          break L16;
                                        } else {
                                          stackOut_53_0 = 1;
                                          stackIn_55_0 = stackOut_53_0;
                                          break L16;
                                        }
                                      }
                                      if (ne.a(stackIn_55_0 != 0) != 1) {
                                        break L3;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                              fn.a(0, 255, 3);
                              fn.a(1, 254, 3);
                              if (var12 == 0) {
                                break L3;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L17: {
                            if (a.field_c >= 1000000) {
                              break L17;
                            } else {
                              L18: {
                                ce.field_d.b(fn.field_r, param2, param3, param0, -1);
                                var5[8].b(var6, 0);
                                if (ne.a(false) == 6) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (param1) {
                                      stackOut_65_0 = 0;
                                      stackIn_66_0 = stackOut_65_0;
                                      break L19;
                                    } else {
                                      stackOut_64_0 = 1;
                                      stackIn_66_0 = stackOut_64_0;
                                      break L19;
                                    }
                                  }
                                  if (ne.a(stackIn_66_0 != 0) == 3) {
                                    break L18;
                                  } else {
                                    if (ne.a(false) == 2) {
                                      break L18;
                                    } else {
                                      L20: {
                                        if (param1) {
                                          stackOut_72_0 = 0;
                                          stackIn_73_0 = stackOut_72_0;
                                          break L20;
                                        } else {
                                          stackOut_71_0 = 1;
                                          stackIn_73_0 = stackOut_71_0;
                                          break L20;
                                        }
                                      }
                                      if (ne.a(stackIn_73_0 != 0) == 1) {
                                        break L18;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                              fn.a(0, 255, 3);
                              fn.a(1, 254, 3);
                              fn.a(2, 253, 3);
                              if (var12 == 0) {
                                break L3;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var5[9].b(var6, 0);
                          var9 = mb.field_d;
                          var10_double = 0.0;
                          L21: while (true) {
                            L22: {
                              L23: {
                                L24: {
                                  if (var10_double >= 6.28) {
                                    break L24;
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
                                      break L23;
                                    } else {
                                      if (var12 == 0) {
                                        continue L21;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                if (pl.field_h != 0) {
                                  param3 -= 27;
                                  break L23;
                                } else {
                                  var10 = 140;
                                  param3 -= 15;
                                  break L22;
                                }
                              }
                              var10 = 300;
                              break L22;
                            }
                            L25: {
                              int discarded$10 = ce.field_d.a(qh.field_b, -1 + -(var10 / 2) + param2, param3, var10, 35, 6776679, -1, 1, 0, 16);
                              int discarded$11 = ce.field_d.a(qh.field_b, 1 + -(var10 / 2) + param2, param3, var10, 35, 6776679, -1, 1, 0, 16);
                              int discarded$12 = ce.field_d.a(qh.field_b, param2 + -(var10 / 2), param3 - 1, var10, 35, 6776679, -1, 1, 0, 16);
                              int discarded$13 = ce.field_d.a(qh.field_b, param2 + -(var10 / 2), param3 - -1, var10, 35, 6776679, -1, 1, 0, 16);
                              int discarded$14 = ce.field_d.a(qh.field_b, -(var10 / 2) + param2, param3, var10, 35, 16159517, 1, 1, 0, 16);
                              stackOut_85_0 = -7;
                              stackIn_87_0 = stackOut_85_0;
                              stackIn_86_0 = stackOut_85_0;
                              if (param1) {
                                stackOut_87_0 = stackIn_87_0;
                                stackOut_87_1 = 0;
                                stackIn_88_0 = stackOut_87_0;
                                stackIn_88_1 = stackOut_87_1;
                                break L25;
                              } else {
                                stackOut_86_0 = stackIn_86_0;
                                stackOut_86_1 = 1;
                                stackIn_88_0 = stackOut_86_0;
                                stackIn_88_1 = stackOut_86_1;
                                break L25;
                              }
                            }
                            L26: {
                              L27: {
                                if (stackIn_88_0 == ~ne.a(stackIn_88_1 != 0)) {
                                  break L27;
                                } else {
                                  if (ne.a(false) == 3) {
                                    break L27;
                                  } else {
                                    if (ne.a(false) == 2) {
                                      break L27;
                                    } else {
                                      L28: {
                                        stackOut_93_0 = -2;
                                        stackIn_96_0 = stackOut_93_0;
                                        stackIn_94_0 = stackOut_93_0;
                                        if (param1) {
                                          stackOut_96_0 = stackIn_96_0;
                                          stackOut_96_1 = 0;
                                          stackIn_97_0 = stackOut_96_0;
                                          stackIn_97_1 = stackOut_96_1;
                                          break L28;
                                        } else {
                                          stackOut_94_0 = stackIn_94_0;
                                          stackIn_95_0 = stackOut_94_0;
                                          stackOut_95_0 = stackIn_95_0;
                                          stackOut_95_1 = 1;
                                          stackIn_97_0 = stackOut_95_0;
                                          stackIn_97_1 = stackOut_95_1;
                                          break L28;
                                        }
                                      }
                                      if (stackIn_97_0 != ~ne.a(stackIn_97_1 != 0)) {
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                              }
                              fn.a(0, 255, 3);
                              fn.a(1, 254, 3);
                              fn.a(2, 253, 3);
                              fn.a(3, 252, 3);
                              break L26;
                            }
                            if (var12 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      ce.field_d.b(ck.field_b, param2, param3, param0, -1);
                      var5[5].b(var6, 0);
                      if (var12 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ce.field_d.b(gn.field_b, param2, param3, param0, -1);
                  var5[0].b(var6, 0);
                  break L3;
                }
                if (var12 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (cm.field_o != 1) {
              break L0;
            } else {
              L29: {
                var6 = 104 + param2;
                if (0 == pl.field_h) {
                  break L29;
                } else {
                  var6 += 50;
                  break L29;
                }
              }
              L30: {
                if (a.field_c != 0) {
                  break L30;
                } else {
                  ce.field_d.b(wi.field_z, param2, param3, param0, -1);
                  var5[0].b(var6, 0);
                  if (var12 == 0) {
                    break L0;
                  } else {
                    break L30;
                  }
                }
              }
              L31: {
                if (a.field_c >= 5000) {
                  break L31;
                } else {
                  ce.field_d.b(fm.field_O, param2, param3, param0, -1);
                  var5[1].b(var6, 0);
                  if (var12 == 0) {
                    break L0;
                  } else {
                    break L31;
                  }
                }
              }
              L32: {
                if (a.field_c >= 25000) {
                  break L32;
                } else {
                  ce.field_d.b(te.field_b, param2, param3, param0, -1);
                  var5[2].b(var6, 0);
                  if (var12 == 0) {
                    break L0;
                  } else {
                    break L32;
                  }
                }
              }
              L33: {
                if (a.field_c < 50000) {
                  break L33;
                } else {
                  L34: {
                    if (100000 > a.field_c) {
                      break L34;
                    } else {
                      L35: {
                        if (a.field_c >= 200000) {
                          break L35;
                        } else {
                          ce.field_d.b(hm.field_N, param2, param3, param0, -1);
                          var5[5].b(var6, 0);
                          if (var12 == 0) {
                            break L0;
                          } else {
                            break L35;
                          }
                        }
                      }
                      L36: {
                        if (a.field_c < 500000) {
                          break L36;
                        } else {
                          L37: {
                            if (a.field_c >= 1000000) {
                              break L37;
                            } else {
                              L38: {
                                ce.field_d.b(le.field_c, param2, param3, param0, -1);
                                var5[7].b(var6, 0);
                                if (ne.a(false) == 6) {
                                  break L38;
                                } else {
                                  if (ne.a(false) == 3) {
                                    break L38;
                                  } else {
                                    if (ne.a(false) == 2) {
                                      break L38;
                                    } else {
                                      if (ne.a(false) == 1) {
                                        break L38;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                              fn.a(14, 241, 3);
                              fn.a(15, 240, 3);
                              if (var12 == 0) {
                                break L0;
                              } else {
                                break L37;
                              }
                            }
                          }
                          L39: {
                            if (a.field_c < 2000000) {
                              break L39;
                            } else {
                              var5[9].b(var6, 0);
                              var9 = mb.field_d;
                              var10_double = 0.0;
                              L40: while (true) {
                                L41: {
                                  L42: {
                                    L43: {
                                      if (6.28 <= var10_double) {
                                        break L43;
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
                                          break L42;
                                        } else {
                                          if (var12 == 0) {
                                            continue L40;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                    if (pl.field_h != 0) {
                                      break L42;
                                    } else {
                                      var10 = 140;
                                      param3 -= 15;
                                      break L41;
                                    }
                                  }
                                  var10 = 300;
                                  param3 -= 27;
                                  break L41;
                                }
                                L44: {
                                  int discarded$15 = ce.field_d.a(ug.field_b, param2 + (-(var10 / 2) + -1), param3, var10, 35, 6776679, -1, 1, 0, 16);
                                  int discarded$16 = ce.field_d.a(ug.field_b, param2 + (-(var10 / 2) - -1), param3, var10, 35, 6776679, -1, 1, 0, 16);
                                  int discarded$17 = ce.field_d.a(ug.field_b, -(var10 / 2) + param2, param3 - 1, var10, 35, 6776679, -1, 1, 0, 16);
                                  int discarded$18 = ce.field_d.a(ug.field_b, param2 + -(var10 / 2), 1 + param3, var10, 35, 6776679, -1, 1, 0, 16);
                                  int discarded$19 = ce.field_d.a(ug.field_b, param2 + -(var10 / 2), param3, var10, 35, 16159517, 1, 1, 0, 16);
                                  stackOut_151_0 = -7;
                                  stackIn_153_0 = stackOut_151_0;
                                  stackIn_152_0 = stackOut_151_0;
                                  if (param1) {
                                    stackOut_153_0 = stackIn_153_0;
                                    stackOut_153_1 = 0;
                                    stackIn_154_0 = stackOut_153_0;
                                    stackIn_154_1 = stackOut_153_1;
                                    break L44;
                                  } else {
                                    stackOut_152_0 = stackIn_152_0;
                                    stackOut_152_1 = 1;
                                    stackIn_154_0 = stackOut_152_0;
                                    stackIn_154_1 = stackOut_152_1;
                                    break L44;
                                  }
                                }
                                L45: {
                                  L46: {
                                    if (stackIn_154_0 == ~ne.a(stackIn_154_1 != 0)) {
                                      break L46;
                                    } else {
                                      if (3 == ne.a(false)) {
                                        break L46;
                                      } else {
                                        if (2 == ne.a(false)) {
                                          break L46;
                                        } else {
                                          L47: {
                                            stackOut_159_0 = -2;
                                            stackIn_162_0 = stackOut_159_0;
                                            stackIn_160_0 = stackOut_159_0;
                                            if (param1) {
                                              stackOut_162_0 = stackIn_162_0;
                                              stackOut_162_1 = 0;
                                              stackIn_163_0 = stackOut_162_0;
                                              stackIn_163_1 = stackOut_162_1;
                                              break L47;
                                            } else {
                                              stackOut_160_0 = stackIn_160_0;
                                              stackIn_161_0 = stackOut_160_0;
                                              stackOut_161_0 = stackIn_161_0;
                                              stackOut_161_1 = 1;
                                              stackIn_163_0 = stackOut_161_0;
                                              stackIn_163_1 = stackOut_161_1;
                                              break L47;
                                            }
                                          }
                                          if (stackIn_163_0 != ~ne.a(stackIn_163_1 != 0)) {
                                            break L45;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  fn.a(14, 241, 3);
                                  fn.a(15, 240, 3);
                                  fn.a(16, 239, 3);
                                  fn.a(17, 238, 3);
                                  if (a.field_c < 4000000) {
                                    break L45;
                                  } else {
                                    fn.a(25, 230, 3);
                                    break L45;
                                  }
                                }
                                if (var12 == 0) {
                                  break L0;
                                } else {
                                  break L39;
                                }
                              }
                            }
                          }
                          L48: {
                            ce.field_d.b(bd.field_a, param2, param3, param0, -1);
                            var5[8].b(var6, 0);
                            if (ne.a(false) == 6) {
                              break L48;
                            } else {
                              L49: {
                                if (param1) {
                                  stackOut_173_0 = 0;
                                  stackIn_174_0 = stackOut_173_0;
                                  break L49;
                                } else {
                                  stackOut_172_0 = 1;
                                  stackIn_174_0 = stackOut_172_0;
                                  break L49;
                                }
                              }
                              if (ne.a(stackIn_174_0 != 0) == 3) {
                                break L48;
                              } else {
                                if (ne.a(false) == 2) {
                                  break L48;
                                } else {
                                  if (ne.a(false) != 1) {
                                    break L0;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                          }
                          fn.a(14, 241, 3);
                          fn.a(15, 240, 3);
                          fn.a(16, 239, 3);
                          if (var12 == 0) {
                            break L0;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L50: {
                        ce.field_d.b(ti.field_L, param2, param3, param0, -1);
                        var5[6].b(var6, 0);
                        if (ne.a(false) == 6) {
                          break L50;
                        } else {
                          if (ne.a(false) == 3) {
                            break L50;
                          } else {
                            if (ne.a(false) == 2) {
                              break L50;
                            } else {
                              if (ne.a(false) == 1) {
                                break L50;
                              } else {
                                break L0;
                              }
                            }
                          }
                        }
                      }
                      fn.a(14, 241, 3);
                      if (var12 == 0) {
                        break L0;
                      } else {
                        break L34;
                      }
                    }
                  }
                  ce.field_d.b(bh.field_ab, param2, param3, param0, -1);
                  var5[4].b(var6, 0);
                  if (var12 == 0) {
                    break L0;
                  } else {
                    break L33;
                  }
                }
              }
              ce.field_d.b(ca.field_j, param2, param3, param0, -1);
              var5[3].b(var6, 0);
              break L0;
            }
          }
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
            mm.a(param0);
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
            ((MinerDisturbance) this).field_s = null;
            ((MinerDisturbance) this).field_L = null;
            ((MinerDisturbance) this).field_Q = null;
            ((MinerDisturbance) this).field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.EA(" + param0 + ')');
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
                  if (((MinerDisturbance) this).field_K) {
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
                          return;
                        }
                      }
                    }
                    L3: {
                      var5 = 0;
                      var6 = 0;
                      if (lj.field_r > 0) {
                        L4: {
                          var5 = (int)((Math.random() * (double)lj.field_r - (double)(lj.field_r / 2)) / 20.0);
                          if (var5 > 16) {
                            var5 = 16;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          var6 = (int)((Math.random() * (double)lj.field_r - (double)(lj.field_r / 2)) / 40.0);
                          if (var5 >= -16) {
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
                      var4 = -4 + var4 - -(var6 >> 1);
                      var3 = (var5 >> 1) + var3 + -4;
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
                          ef.field_b[3].f(var7 - -(ef.field_b[3].field_x >> 2), var8 - -(ef.field_b[3].field_A >> 2));
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
                    break L0;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.CB(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
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
        int stackIn_99_0 = 0;
        Object stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        Object stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        Object stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        Object stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        Object stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_145_2 = 0;
        Object stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        L0: {
          var15 = field_ab;
          if (128 > di.field_Z) {
            L1: {
              if (di.field_Z < 64) {
                var2_int = 255 + -(di.field_Z * 4);
                mc.field_u.f(0, 0, var2_int);
                fh.field_e.f(7, 0, var2_int);
                mh.field_d.f(628, 0, var2_int);
                ei.field_M.f(7, 472, var2_int);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 640 * di.field_Z / 64;
            eh.a(0, 0, var2_int, 480);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          L3: {
            var2_int = 73;
            var3 = 245;
            var4 = 70;
            var5 = ce.field_d.field_E + ce.field_d.field_I;
            if (0 == pl.field_h) {
              break L3;
            } else {
              L4: {
                L5: {
                  nn.field_h[cm.field_o].f(0, 0);
                  if (((MinerDisturbance) this).field_T < 0) {
                    break L5;
                  } else {
                    if (~((MinerDisturbance) this).field_T >= ~(-1 + sl.field_u[pl.field_h].length)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                ((MinerDisturbance) this).field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
                break L4;
              }
              L6: {
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
                                                var8_ref_String = sl.field_u[pl.field_h][((MinerDisturbance) this).field_T];
                                                sb.field_n.field_T[0][wd.field_e] = 4408131;
                                                sb.field_n.field_T[0][bi.field_p] = 0;
                                                sb.field_n.field_T[0][re.field_b] = 14540253;
                                                var10_int = pl.field_h;
                                                if (var10_int == 4) {
                                                  break L22;
                                                } else {
                                                  if (var10_int == 1) {
                                                    break L21;
                                                  } else {
                                                    L23: {
                                                      if (var10_int != 7) {
                                                        break L23;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L20;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (10 != var10_int) {
                                                        break L24;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L19;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (var10_int != 5) {
                                                        break L25;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L18;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    L26: {
                                                      if (var10_int != 13) {
                                                        break L26;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L17;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    L27: {
                                                      if (var10_int != 3) {
                                                        break L27;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L16;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    L28: {
                                                      if (var10_int != 2) {
                                                        break L28;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L15;
                                                        } else {
                                                          break L28;
                                                        }
                                                      }
                                                    }
                                                    L29: {
                                                      if (var10_int != 6) {
                                                        break L29;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L14;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                    if (0 == var10_int) {
                                                      break L13;
                                                    } else {
                                                      if (var10_int == 8) {
                                                        break L12;
                                                      } else {
                                                        L30: {
                                                          if (var10_int != 9) {
                                                            break L30;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L11;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        if (var10_int == 11) {
                                                          break L10;
                                                        } else {
                                                          if (var10_int == 12) {
                                                            break L9;
                                                          } else {
                                                            if (14 != var10_int) {
                                                              break L7;
                                                            } else {
                                                              if (var15 == 0) {
                                                                break L8;
                                                              } else {
                                                                break L22;
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
                                                break L6;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            var9_ref_String = jg.field_k;
                                            if (var15 == 0) {
                                              break L6;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          var9_ref_String = r.field_b;
                                          if (var15 == 0) {
                                            break L6;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        var9_ref_String = rd.field_d;
                                        if (var15 == 0) {
                                          break L6;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      var9_ref_String = hf.field_s;
                                      if (var15 == 0) {
                                        break L6;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    var9_ref_String = mg.field_c;
                                    if (var15 == 0) {
                                      break L6;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var9_ref_String = pb.field_z;
                                  if (var15 == 0) {
                                    break L6;
                                  } else {
                                    break L15;
                                  }
                                }
                                var9_ref_String = df.field_c;
                                if (var15 == 0) {
                                  break L6;
                                } else {
                                  break L14;
                                }
                              }
                              var9_ref_String = hh.field_d;
                              if (var15 == 0) {
                                break L6;
                              } else {
                                break L13;
                              }
                            }
                            var9_ref_String = ok.field_a;
                            if (var15 == 0) {
                              break L6;
                            } else {
                              break L12;
                            }
                          }
                          var9_ref_String = dh.field_a;
                          if (var15 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                        var9_ref_String = vk.field_d;
                        if (var15 == 0) {
                          break L6;
                        } else {
                          break L10;
                        }
                      }
                      var9_ref_String = jl.field_bb;
                      if (var15 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                    var9_ref_String = hl.field_c;
                    if (var15 == 0) {
                      break L6;
                    } else {
                      break L8;
                    }
                  }
                  var9_ref_String = nd.field_a;
                  if (var15 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
                var9_ref_String = mc.field_z;
                break L6;
              }
              L31: {
                var4 -= 10;
                var4 = var4 + ce.field_d.a(var9_ref_String, 100, var4, 130, 480, 16777215, 6710886, 1, 0, var5) * var5;
                var4 += 10;
                var10 = ti.field_J;
                if (var10 == null) {
                  var10 = lj.field_s;
                  break L31;
                } else {
                  break L31;
                }
              }
              L32: {
                L33: {
                  int discarded$4 = sb.field_n.a(we.a((we) (Object) sb.field_n, var10, 170), -80 + (nn.field_h[cm.field_o].field_x >> 1), var4, 160, sb.field_n.field_E + sb.field_n.field_I, 0, -1, 1, 0, 0);
                  var4 += 40;
                  var7 = 175;
                  int discarded$5 = ce.field_d.a(var8_ref_String, var2_int, var4, var3 - var2_int, var5 * 3, 16777215, 6710886, 1, 1, var5);
                  var6 = 70;
                  var11 = var6;
                  var12 = var7;
                  if (cm.field_o != 1) {
                    break L33;
                  } else {
                    var13 = 28;
                    var12 += 8;
                    var11 -= 6;
                    if (1 < ne.a(param0)) {
                      var13 = 26;
                      if (var15 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    } else {
                      break L32;
                    }
                  }
                }
                var13 = 32;
                break L32;
              }
              L34: {
                mb.field_d[0].f(var11, var12);
                var14 = 12566463;
                ce.field_d.a(oa.a((byte) -112, uh.field_c, new String[2]), 32 + var6, 30 + var7, var14, -1);
                var12 = var12 + var13;
                var7 = var7 + var13;
                var14 = 13619151;
                mb.field_d[1].f(var11, var12);
                ce.field_d.a(oa.a((byte) -93, gd.field_A, new String[2]), var6 - -32, var7 - -30, var14, -1);
                var7 = var7 + var13;
                var12 = var12 + var13;
                var14 = 14671839;
                mb.field_d[2].f(var11, var12);
                ce.field_d.a(oa.a((byte) -116, ge.field_h, new String[2]), var6 + 32, 30 + var7, var14, -1);
                var7 = var7 + var13;
                var12 = var12 + var13;
                var14 = 15724527;
                mb.field_d[3].f(var11, var12);
                ce.field_d.a(oa.a((byte) -120, fl.field_h, new String[2]), var6 - -32, var7 + 30, var14, -1);
                if (cm.field_o == 1) {
                  L35: {
                    var12 = var12 + var13;
                    var7 = var7 + var13;
                    var14 = 15724527;
                    mb.field_d[5].f(var11, var12);
                    if (pl.field_h != 0) {
                      break L35;
                    } else {
                      var14 = 3092271;
                      break L35;
                    }
                  }
                  ce.field_d.a(oa.a((byte) -118, nn.field_a, new String[2]), 32 + var6, var7 - -30, var14, -1);
                  break L34;
                } else {
                  break L34;
                }
              }
              var7 = var7 + var13;
              var12 = var12 + var13;
              mb.field_d[4].f(var11, var12);
              var14 = 16777215;
              ce.field_d.a(oa.a((byte) -91, bl.field_u, new String[2]), 32 + var6, var7 - -30, var14, -1);
              var7 += 32;
              var7 = 0;
              var6 = nn.field_h[cm.field_o].field_x >> 1;
              if (var15 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L36: {
            L37: {
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
              if (0 > ((MinerDisturbance) this).field_T) {
                break L37;
              } else {
                if (((MinerDisturbance) this).field_T > sl.field_u[pl.field_h].length - 1) {
                  break L37;
                } else {
                  break L36;
                }
              }
            }
            ((MinerDisturbance) this).field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
            break L36;
          }
          L38: {
            var9_ref_String = sl.field_u[pl.field_h][((MinerDisturbance) this).field_T];
            sb.field_n.field_T[0][wd.field_e] = 9737364;
            sb.field_n.field_T[0][bi.field_p] = 0;
            sb.field_n.field_T[0][re.field_b] = 12892208;
            var10 = ti.field_J;
            if (var10 != null) {
              break L38;
            } else {
              var10 = qf.field_q;
              break L38;
            }
          }
          L39: {
            if (a.field_c < 1000000) {
              stackOut_98_0 = 0;
              stackIn_99_0 = stackOut_98_0;
              break L39;
            } else {
              stackOut_97_0 = 30;
              stackIn_99_0 = stackOut_97_0;
              break L39;
            }
          }
          L40: {
            var11 = stackIn_99_0;
            sb.field_n.b(var10, 195, 112 - -var11, 0, -1);
            int discarded$6 = ce.field_d.a(var9_ref_String, var2_int, var11 + 137, -var2_int + var3, 50, 12584192, 6710886, 1, 1, var5);
            var12_ref_String = ok.field_a;
            var6 = 100;
            int discarded$7 = ce.field_d.a(var12_ref_String, 40, var11 + -ce.field_d.field_E + (var4 + -ce.field_d.field_I - -70), 310, 20, 0, 16777215, 1, 0, -1);
            var7 = var11 + 175;
            var13 = 32;
            if (1 != cm.field_o) {
              break L40;
            } else {
              var13 = 28;
              break L40;
            }
          }
          L41: {
            vl.field_E.f(var6, 15 + var7);
            var14 = 12566463;
            if (pl.field_h != 0) {
              break L41;
            } else {
              var14 = 10526880;
              break L41;
            }
          }
          L42: {
            ce.field_d.a(oa.a((byte) -78, uh.field_c, new String[2]), var6 - -32, 30 + var7, var14, -1);
            var7 = var7 + var13;
            var14 = 13619151;
            em.field_y.f(var6, 15 + var7);
            if (pl.field_h != 0) {
              break L42;
            } else {
              var14 = 9408399;
              break L42;
            }
          }
          L43: {
            ce.field_d.a(oa.a((byte) -109, gd.field_A, new String[2]), var6 + 32, 30 + var7, var14, -1);
            var7 = var7 + var13;
            sn.field_a.f(var6, 15 + var7);
            var14 = 14671839;
            if (0 != pl.field_h) {
              break L43;
            } else {
              var14 = 5197647;
              break L43;
            }
          }
          L44: {
            ce.field_d.a(oa.a((byte) -80, ge.field_h, new String[2]), var6 + 32, var7 + 30, var14, -1);
            var7 = var7 + var13;
            var14 = 15724527;
            di.field_ab.f(var6, 17 + var7);
            if (pl.field_h != 0) {
              break L44;
            } else {
              var14 = 3092271;
              break L44;
            }
          }
          L45: {
            ce.field_d.a(oa.a((byte) -115, fl.field_h, new String[2]), 32 + var6, 30 + var7, var14, -1);
            var7 = var7 + var13;
            if (1 != cm.field_o) {
              break L45;
            } else {
              L46: {
                var14 = 15724527;
                mb.field_d[5].f(-6 + var6, 6 + var7);
                if (pl.field_h != 0) {
                  break L46;
                } else {
                  var14 = 3092271;
                  break L46;
                }
              }
              ce.field_d.a(oa.a((byte) -80, nn.field_a, new String[2]), 32 + var6, var7 + 30, var14, -1);
              var7 = var7 + var13;
              break L45;
            }
          }
          L47: {
            vh.field_c.f(var6, var7 - -15);
            var14 = 16777215;
            if (pl.field_h != 0) {
              break L47;
            } else {
              var14 = 0;
              break L47;
            }
          }
          ce.field_d.a(oa.a((byte) -110, bl.field_u, new String[2]), var6 - -32, 30 + var7, var14, -1);
          var7 = 0;
          var6 = 195;
          break L2;
        }
        L48: {
          if (ne.a(param0) <= 1) {
            break L48;
          } else {
            L49: {
              if (pl.field_h != 0) {
                break L49;
              } else {
                L50: {
                  var8 = 360;
                  if (a.field_c >= 1000000) {
                    var8 = 380;
                    break L50;
                  } else {
                    break L50;
                  }
                }
                L51: {
                  if (cm.field_o != 1) {
                    break L51;
                  } else {
                    var8 += 5;
                    break L51;
                  }
                }
                ce.field_d.b(oa.a((byte) -94, uh.field_f, new String[1]), var6, var8, 0, -1);
                if (var15 == 0) {
                  break L48;
                } else {
                  break L49;
                }
              }
            }
            ce.field_d.b(oa.a((byte) -91, uh.field_f, new String[1]), var6, 360, 16776960, -1);
            break L48;
          }
        }
        L52: {
          if (0 != pl.field_h) {
            break L52;
          } else {
            L53: {
              var8 = 386;
              if (a.field_c < 1000000) {
                break L53;
              } else {
                var8 = 400;
                break L53;
              }
            }
            ce.field_d.b(an.field_g, var6, var8, 0, -1);
            break L52;
          }
        }
        L54: {
          var8 = 16776960;
          if (pl.field_h == 0) {
            var8 = 12584192;
            var7 = 80;
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var7 = 408;
          var9 = var7;
          if (1000000 <= a.field_c) {
            var9 += 10;
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          ce.field_d.b(oa.a((byte) -83, km.field_c, new String[1]), var6, var9, var8, -1);
          var7 += 32;
          var7 = 462;
          var6 = nn.field_h[cm.field_o].field_x >> 1;
          if (pl.field_h != 0) {
            break L56;
          } else {
            var7 = 80;
            var6 = 195;
            var10_array = new int[4];
            eh.b(var10_array);
            eh.f(40, 54, 350, 426);
            var11 = Math.abs(nk.field_w - 320) / 2;
            var12 = 0;
            L57: while (true) {
              L58: {
                if (307 <= var12) {
                  break L58;
                } else {
                  eh.g(var11 + 40 + var12, 450 - var12, 10, 16777215, 140);
                  eh.g(var11 + 60 + var12, 450 + -var12, 40, 16777215, 140);
                  eh.g(var11 + 107 - -var12, -var12 + 450, 30, 16777215, 140);
                  eh.g(var11 + var12 + 152, 450 + -var12, 6, 16777215, 140);
                  var12++;
                  if (var15 != 0) {
                    break L56;
                  } else {
                    if (var15 == 0) {
                      continue L57;
                    } else {
                      break L58;
                    }
                  }
                }
              }
              eh.a(var10_array);
              break L56;
            }
          }
        }
        L59: {
          stackOut_143_0 = this;
          stackOut_143_1 = var8;
          stackIn_145_0 = stackOut_143_0;
          stackIn_145_1 = stackOut_143_1;
          stackIn_144_0 = stackOut_143_0;
          stackIn_144_1 = stackOut_143_1;
          if (param0) {
            stackOut_145_0 = this;
            stackOut_145_1 = stackIn_145_1;
            stackOut_145_2 = 0;
            stackIn_146_0 = stackOut_145_0;
            stackIn_146_1 = stackOut_145_1;
            stackIn_146_2 = stackOut_145_2;
            break L59;
          } else {
            stackOut_144_0 = this;
            stackOut_144_1 = stackIn_144_1;
            stackOut_144_2 = 1;
            stackIn_146_0 = stackOut_144_0;
            stackIn_146_1 = stackOut_144_1;
            stackIn_146_2 = stackOut_144_2;
            break L59;
          }
        }
        L60: {
          this.a(stackIn_146_1, stackIn_146_2 != 0, var6, var7);
          if (64 < di.field_Z) {
            L61: {
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
                break L61;
              } else {
                mm.field_a.a(var10, var11, pk.field_b.field_I + var12, 15885602, -1);
                if (var15 == 0) {
                  break L60;
                } else {
                  break L61;
                }
              }
            }
            mm.field_a.a(var10, var11, pk.field_b.field_I + var12, 16502531, -1);
            break L60;
          } else {
            break L60;
          }
        }
        if (!param0) {
          ha.field_b = a.field_c;
          eh.a();
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
                      if (rg.field_wb <= 28) {
                        break L2;
                      } else {
                        mh.field_e[1 + ca.field_k][hf.field_t].field_S = true;
                        mh.field_e[ca.field_k - -1][hf.field_t].field_r = 975;
                        bd.field_k = bd.field_k - -10;
                        rg.field_wb = -10;
                        if (sc.field_b) {
                          ag.a(true, 28, hf.field_t << 5, ca.field_k - -1 << 5);
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
                  if (rg.field_wb <= 1) {
                    break L1;
                  } else {
                    rg.field_wb = rg.field_wb - 1;
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (sk.field_d >= -80) {
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
                      if (rg.field_wb >= -28) {
                        break L4;
                      } else {
                        mh.field_e[ca.field_k - 1][hf.field_t].field_S = true;
                        mh.field_e[-1 + ca.field_k][hf.field_t].field_r = 975;
                        rg.field_wb = 10;
                        bd.field_k = bd.field_k - -10;
                        if (!sc.field_b) {
                          break L3;
                        } else {
                          ag.a(true, 28, hf.field_t << 5, -1 + ca.field_k << 5);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (rg.field_wb < -1) {
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
                          if (sk.field_d <= 0) {
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
                if ((dl.field_c & 3) != 0) {
                  break L11;
                } else {
                  if (qd.field_O[96]) {
                    break L11;
                  } else {
                    if (!qd.field_O[97]) {
                      L12: {
                        if (rg.field_wb >= 0) {
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
                    if (rg.field_wb == 0) {
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
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.UA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            ((MinerDisturbance) this).a("minerdisturbance", 13, -6622);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "MinerDisturbance.init()");
        }
    }

    final void a(int param0) {
        di var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((MinerDisturbance) this).a(false, 5, (byte) -121, 9, 7, 8, 10, 12);
              pl.field_h = 15;
              cm.field_r = 0;
              if (param0 > 37) {
                break L1;
              } else {
                ((MinerDisturbance) this).a(-122, -50);
                break L1;
              }
            }
            hf.field_r = 50;
            ke.field_V = false;
            lj.field_r = 0;
            kj.a(1, -22156);
            var2 = new di();
            var2.a(128, -6242, 9);
            pe.a(qa.field_a, 22050, 512, (byte) -124, true, (java.awt.Component) (Object) ef.field_c, var2, 22050);
            ((MinerDisturbance) this).a(false, (byte) -61, true, true, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2_ref, "MinerDisturbance.NA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
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
                          wb discarded$2 = tj.a(ac.field_b, 65529, qd.field_M, (byte) -66, di.field_X, new int[1], 6, vh.field_g, 3);
                          if (field_ab == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (cm.field_o == 1) {
                        wb discarded$3 = tj.a(ac.field_b, 65528, qd.field_M, (byte) -66, di.field_X, new int[1], 7, vh.field_g, 3);
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
                ((MinerDisturbance) this).field_L = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "MinerDisturbance.AB(" + param0 + ',' + param1 + ')');
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
                      ai.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) sa.field_t[0], 1, var2_array.length);
                      var2_array = tb.a("rankings3", "volcano", fl.field_f, 1);
                      ai.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) sa.field_t[0], 6, var2_array.length);
                      sa.field_t[0][8] = pb.a("volcano", fl.field_f, "rankings4", (byte) -77);
                      sa.field_t[0][9] = pb.a("volcano", fl.field_f, "rankings5", (byte) -77);
                      var3 = 0;
                      L2: while (true) {
                        L3: {
                          if (~var3 <= ~sa.field_t[0].length) {
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
                        return stackIn_19_0 != 0;
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
                        return stackIn_24_0 != 0;
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
                    return stackIn_11_0 != 0;
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.SA(" + param0 + ')');
        }
        return stackIn_30_0 != 0;
    }

    private final void e(boolean param0) {
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
                var3 = 596 + -(s.field_L[1].field_x >> 1);
                s.field_L[0].f(var3, -s.field_L[0].field_A + 76);
                eh.a(var3, 76, s.field_L[1].field_x + 580, 76 - (-((MinerDisturbance) this).field_G + ((MinerDisturbance) this).field_W));
                var4 = 76 + ((MinerDisturbance) this).field_G;
                var5 = -li.field_c + (32 * ca.field_k - -(sk.field_d / 10));
                var6 = -db.field_d + (hf.field_t * 32 + mf.field_i / 10);
                if (~(var3 - 96) <= ~var5) {
                  break L2;
                } else {
                  if (var6 <= -20) {
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
                    var9 = a.field_a[0].field_x >> 1;
                    var10 = a.field_a[0].field_A >> 1;
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
                    if (~var12 >= ~var13) {
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
                              if (~var11 >= ~var17) {
                                break L12;
                              } else {
                                int incrementValue$2 = var8;
                                var8++;
                                ((MinerDisturbance) this).field_L[incrementValue$2] = eh.field_f[var13 * eh.field_g + var17];
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
              stackOut_36_0 = ((MinerDisturbance) this).field_W + 76;
              stackIn_37_0 = stackOut_36_0;
              break L3;
            }
            var8 = stackIn_37_0;
            L13: while (true) {
              L14: {
                L15: {
                  if (~var8 <= ~var4) {
                    break L15;
                  } else {
                    s.field_L[1].g(var3, -((MinerDisturbance) this).field_W + var8);
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
                var10 = ((MinerDisturbance) this).field_W;
                L16: while (true) {
                  stackOut_47_0 = ~((MinerDisturbance) this).field_G;
                  stackOut_47_1 = ~var10;
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
                                  stackOut_52_0 = ~var10;
                                  stackOut_52_1 = ~je.field_t;
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
                                            if (var14 > 0) {
                                              L26: {
                                                if (var14 == 1) {
                                                  var13 = 7748154;
                                                  break L26;
                                                } else {
                                                  break L26;
                                                }
                                              }
                                              L27: {
                                                if (var14 != 2) {
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
                                              if (var14 < 9) {
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
                                      if (var8 < 2) {
                                        break L34;
                                      } else {
                                        ((MinerDisturbance) this).field_Z = var10;
                                        ((MinerDisturbance) this).field_G = var10;
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
                      stackOut_98_0 = ((MinerDisturbance) this).field_W;
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
                                      stackOut_105_0 = Math.abs(-16 + var14) >> 1;
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
                          eh.c(580 + (ca.field_k + 2), -((MinerDisturbance) this).field_W + (hf.field_t + 76), 2, 16777215);
                          eh.d(ca.field_k + 582, 76 + -((MinerDisturbance) this).field_W + hf.field_t, 3, 0);
                          eh.a();
                          s.field_L[2].f(var3, Math.max(((MinerDisturbance) this).field_G - ((MinerDisturbance) this).field_W, 0) + 76);
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
                                var12 = a.field_a[0].field_x >> 1;
                                var13 = a.field_a[0].field_A >> 1;
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
                                if (var16 >= 0) {
                                  break L46;
                                } else {
                                  var16 = 0;
                                  break L46;
                                }
                              }
                              L47: {
                                if (~var14 >= ~(-1 + eh.field_g)) {
                                  break L47;
                                } else {
                                  var19 = var14 - -1 - eh.field_g;
                                  var14 = eh.field_g + -1;
                                  break L47;
                                }
                              }
                              L48: {
                                if (~var16 < ~(-1 + eh.field_c)) {
                                  var16 = -1 + eh.field_c;
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                              L49: while (true) {
                                if (~var16 <= ~var15) {
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
                                          if (~var20 <= ~var14) {
                                            break L52;
                                          } else {
                                            var21 = jl.field_gb[var11];
                                            var22 = -var21 + 256;
                                            var23 = eh.field_f[var20 + var16 * eh.field_g];
                                            int incrementValue$3 = var11;
                                            var11++;
                                            var24 = ((MinerDisturbance) this).field_L[incrementValue$3];
                                            eh.field_f[var16 * eh.field_g - -var20] = c.a(-16711936, var22 * c.a(var23, 16711935) + var21 * c.a(var24, 16711935)) + c.a(16711680, var22 * c.a(var23, 65280) + c.a(65280, var24) * var21) >> 8;
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
                        break L0;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.WA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        String var3_ref = null;
        sb var3_ref2 = null;
        sb var4 = null;
        int var5 = 0;
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
                                                    return;
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
                                                                      ((MinerDisturbance) this).b(false);
                                                                      am.a(ei.field_Q, 27);
                                                                      wf.p(4462);
                                                                      pa.a(true, ik.field_S, 60.0f);
                                                                      ((MinerDisturbance) this).b(false);
                                                                      ba.a(ei.field_Q, pk.field_g, ge.field_e, true, ig.field_c);
                                                                      ig.field_c = null;
                                                                      pk.field_g = null;
                                                                      ge.field_e = null;
                                                                      ei.field_Q = null;
                                                                      wf.p(4462);
                                                                      pa.a(true, qg.field_e, 75.0f);
                                                                      ((MinerDisturbance) this).b(false);
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
                                                                        ((MinerDisturbance) this).b(false);
                                                                        var3_ref2 = new sb(id.field_c.a("volcano.csv", 0, ""));
                                                                        var4 = new sb(id.field_c.a("supervolcano.csv", 0, ""));
                                                                        ml.a(var4, (byte) 0, var3_ref2);
                                                                        ((MinerDisturbance) this).h((byte) 65);
                                                                        an.a(-122, 50);
                                                                        ke.field_V = false;
                                                                        bj.a(-6358, ph.field_a);
                                                                        oi.a((we) (Object) mm.field_a, (we) (Object) ce.field_d, 97, 300);
                                                                        ud.a(new ac(hd.field_d), 30, 30, 88);
                                                                        ic.a(113, 4473924, 15885602, 16502531);
                                                                        aa.a(6, new ac(vc.field_p), -1, 6, new ac(vc.field_p), 6);
                                                                        bj.field_e.a((byte) -45);
                                                                        qd.n(21);
                                                                        nn.field_n = true;
                                                                        wf.p(4462);
                                                                        kf.a((MinerDisturbance) this, 45977);
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
                                                                    break L0;
                                                                  } else {
                                                                    return;
                                                                  }
                                                                } else {
                                                                  break L12;
                                                                }
                                                              }
                                                            }
                                                            pa.a(true, qn.a(ei.field_P, td.field_a, false, id.field_c), 40.0f);
                                                            return;
                                                          }
                                                        }
                                                      }
                                                      pa.a(true, u.a(ub.field_c, ob.field_q, ul.field_d, -7157, "basic"), 35.0f);
                                                      return;
                                                    }
                                                  }
                                                }
                                                pa.a(true, u.a(mb.field_a, ne.field_L, dc.field_a, -7157, ""), 30.0f);
                                                return;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, "shop"), 26.0f);
                                          return;
                                        }
                                      }
                                    }
                                    pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, ""), 20.0f);
                                    return;
                                  }
                                }
                              }
                              pa.a(true, u.a(gm.field_c, ig.field_c, w.field_X, -7157, ""), 16.0f);
                              return;
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
                        return;
                      } else {
                        break L3;
                      }
                    }
                  }
                  pa.a(true, u.a(gm.field_c, pk.field_g, w.field_X, -7157, ""), 4.0f);
                  return;
                } else {
                  break L2;
                }
              }
            }
            pa.a(true, u.a(ud.field_f, ei.field_Q, hm.field_M, -7157, ""), 0.0f);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "MinerDisturbance.TA(" + param0 + ',' + param1 + ')');
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
                        if (var2_int >= 21) {
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
              ((MinerDisturbance) this).field_R = 300;
              cm.field_o = ah.field_f;
              ((MinerDisturbance) this).field_S = 0;
              ((MinerDisturbance) this).field_U = 0;
              ((MinerDisturbance) this).field_E = 0;
              ((MinerDisturbance) this).field_I = 0;
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
                  if (var3 >= 1000) {
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
                ((MinerDisturbance) this).field_Y = false;
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
              ((MinerDisturbance) this).field_K = false;
              pc.field_k = 0;
              di.field_K = 1;
              pa.field_c = -1;
              q.field_b = mh.field_e;
              ((MinerDisturbance) this).field_eb = false;
              kn.field_E = 1000;
              pl.field_h = 15;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.JA(" + param0 + ')');
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
              ((MinerDisturbance) this).a(stackIn_5_1 != 0, 18808);
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
                                  if (on.field_u <= 50) {
                                    break L18;
                                  } else {
                                    on.field_u = 50;
                                    break L18;
                                  }
                                }
                                L19: {
                                  L20: {
                                    var3 = dl.b(-123);
                                    if (var3 == 2) {
                                      break L20;
                                    } else {
                                      L21: {
                                        if (var3 == 3) {
                                          break L21;
                                        } else {
                                          L22: {
                                            if (var3 != 4) {
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
                                  if (a.field_c <= 0) {
                                    break L31;
                                  } else {
                                    ((MinerDisturbance) this).a(3, a.field_c);
                                    break L31;
                                  }
                                }
                                L32: {
                                  if (pj.field_a <= 0) {
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
                          var3 = gd.a(stackIn_142_0 != 0, -61, (ob) this);
                          if (var3 != 2364824) {
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
                            if (var3 == 2) {
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
                          ((MinerDisturbance) this).n(22);
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
                        var3 = ((MinerDisturbance) this).c((byte) -119);
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
              ((MinerDisturbance) this).k(10);
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
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.HA(" + param0 + ')');
        }
    }

    private final void l(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_278_0 = 0;
        Object stackIn_334_0 = null;
        Object stackIn_335_0 = null;
        Object stackIn_336_0 = null;
        Object stackIn_337_0 = null;
        int stackIn_337_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_277_0 = 0;
        int stackOut_276_0 = 0;
        Object stackOut_333_0 = null;
        Object stackOut_336_0 = null;
        int stackOut_336_1 = 0;
        Object stackOut_334_0 = null;
        Object stackOut_335_0 = null;
        int stackOut_335_1 = 0;
        var10 = field_ab;
        var2_int = -1;
        if (param0 <= -106) {
          var3 = 4;
          var4 = 6;
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if (21 <= var6) {
                    break L3;
                  } else {
                    stackOut_4_0 = 0;
                    stackOut_4_1 = var6;
                    stackIn_38_0 = stackOut_4_0;
                    stackIn_38_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_5_0 != stackIn_5_1) {
                            break L5;
                          } else {
                            if (!qe.field_b[1]) {
                              break L5;
                            } else {
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        L6: {
                          if (2 != var6) {
                            break L6;
                          } else {
                            if (!qe.field_b[19]) {
                              break L6;
                            } else {
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        if (qe.field_b[var6]) {
                          L7: {
                            if (hc.a(110, var4, 34, var3, nk.field_w, 33, gb.field_e)) {
                              var2_int = var6;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            var5++;
                            if (var5 <= 8) {
                              break L8;
                            } else {
                              var3 = 4;
                              var5 = 0;
                              var4 += 33;
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 33;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var6++;
                      if (var10 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (qe.field_b[14]) {
                  L9: {
                    if (jk.field_ab != 0) {
                      break L9;
                    } else {
                      L10: {
                        if (!hc.a(19, 65, 10, 572, nk.field_w, 48, gb.field_e)) {
                          break L10;
                        } else {
                          var2_int = -2;
                          if (var10 == 0) {
                            break L1;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (hc.a(119, 75, ((MinerDisturbance) this).field_G - ((MinerDisturbance) this).field_W, 576, nk.field_w, 44, gb.field_e)) {
                        var2_int = -3;
                        if (var10 == 0) {
                          break L1;
                        } else {
                          break L9;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_37_0 = 119;
                  stackOut_37_1 = 65;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L2;
                } else {
                  break L1;
                }
              }
              if (hc.a(stackIn_38_0, stackIn_38_1, 10, 572, wi.field_w, 48, m.field_e)) {
                L11: {
                  stackOut_40_0 = this;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_41_0 = stackOut_40_0;
                  if (((MinerDisturbance) this).field_eb) {
                    stackOut_42_0 = this;
                    stackOut_42_1 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    break L11;
                  } else {
                    stackOut_41_0 = this;
                    stackOut_41_1 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    break L11;
                  }
                }
                ((MinerDisturbance) this).field_eb = stackIn_43_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L12: {
              lm.a(var2_int, 98);
              ag.field_c = qd.field_O[83];
              if (ke.field_V) {
                break L12;
              } else {
                if (!il.e(-31391)) {
                  break L12;
                } else {
                  L13: {
                    L14: {
                      if (((MinerDisturbance) this).field_C != nk.field_w) {
                        break L14;
                      } else {
                        if (~((MinerDisturbance) this).field_bb != ~gb.field_e) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    ((MinerDisturbance) this).field_O = false;
                    break L13;
                  }
                  L15: {
                    L16: {
                      L17: {
                        ((MinerDisturbance) this).field_C = nk.field_w;
                        ((MinerDisturbance) this).field_bb = gb.field_e;
                        if (((MinerDisturbance) this).field_O) {
                          break L17;
                        } else {
                          if (nk.field_w <= 398) {
                            break L17;
                          } else {
                            if (nk.field_w >= 623) {
                              break L17;
                            } else {
                              if (gb.field_e <= 429) {
                                break L17;
                              } else {
                                if (gb.field_e < 449) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (!((MinerDisturbance) this).field_O) {
                        stackOut_65_0 = 0;
                        stackIn_66_0 = stackOut_65_0;
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                    stackOut_64_0 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    break L15;
                  }
                  of.field_a = stackIn_66_0 != 0;
                  if (jk.field_ab != 0) {
                    L18: {
                      ((MinerDisturbance) this).field_O = false;
                      this.q(-46);
                      bj.a(-6358, ph.field_a);
                      fm.f((byte) 81);
                      if (kj.a(false)) {
                        break L18;
                      } else {
                        L19: {
                          if (!ig.a(-20144)) {
                            break L19;
                          } else {
                            jc.a(true, -126, 5);
                            if (var10 == 0) {
                              break L12;
                            } else {
                              break L19;
                            }
                          }
                        }
                        jc.a(true, -121, 2);
                        kd.a(cm.field_o, (byte) -104);
                        if (var10 == 0) {
                          break L12;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (ha.field_b > 0) {
                        break L20;
                      } else {
                        jc.a(true, -116, 4);
                        if (var10 == 0) {
                          break L12;
                        } else {
                          break L20;
                        }
                      }
                    }
                    jc.a(true, -105, 6);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
            }
            L21: while (true) {
              L22: {
                L23: {
                  if (!mm.b((byte) 84)) {
                    break L23;
                  } else {
                    var6 = (lj.field_t + (rg.field_sb + (m.field_e + nk.field_w))) % 8;
                    if (var10 != 0) {
                      break L22;
                    } else {
                      L24: {
                        L25: {
                          if (0 != var6) {
                            break L25;
                          } else {
                            ac.field_b = ac.field_b - 1;
                            di.field_X = di.field_X + qd.field_M;
                            if (var10 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (var6 == 1) {
                            break L26;
                          } else {
                            L27: {
                              if (var6 != 2) {
                                break L27;
                              } else {
                                di.field_X = di.field_X - qd.field_M;
                                ac.field_b = ac.field_b + 1;
                                if (var10 == 0) {
                                  break L24;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            L28: {
                              if (3 != var6) {
                                break L28;
                              } else {
                                qd.field_M = qd.field_M + 1;
                                di.field_X = di.field_X - ac.field_b;
                                if (var10 == 0) {
                                  break L24;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            L29: {
                              if (4 != var6) {
                                break L29;
                              } else {
                                ac.field_b = ac.field_b + 1;
                                vh.field_g = vh.field_g + qd.field_M;
                                if (var10 == 0) {
                                  break L24;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            L30: {
                              if (var6 != 5) {
                                break L30;
                              } else {
                                qd.field_M = qd.field_M + 1;
                                vh.field_g = vh.field_g + ac.field_b;
                                if (var10 == 0) {
                                  break L24;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            L31: {
                              if (var6 == 6) {
                                break L31;
                              } else {
                                if (var6 == 7) {
                                  vh.field_g = vh.field_g - ac.field_b;
                                  qd.field_M = qd.field_M - 1;
                                  if (var10 == 0) {
                                    break L24;
                                  } else {
                                    break L31;
                                  }
                                } else {
                                  break L24;
                                }
                              }
                            }
                            vh.field_g = vh.field_g - qd.field_M;
                            ac.field_b = ac.field_b - 1;
                            if (var10 == 0) {
                              break L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                        qd.field_M = qd.field_M - 1;
                        di.field_X = di.field_X + ac.field_b;
                        break L24;
                      }
                      L32: {
                        L33: {
                          var6 = (nk.field_w + m.field_e + (rg.field_sb - -lj.field_t)) % 4;
                          if (var6 != 0) {
                            break L33;
                          } else {
                            hl.field_b = hl.field_b + 1;
                            pn.field_b = pn.field_b + aa.field_b;
                            if (var10 == 0) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        L34: {
                          if (var6 != 1) {
                            break L34;
                          } else {
                            pn.field_b = pn.field_b - aa.field_b;
                            hl.field_b = hl.field_b - 1;
                            if (var10 == 0) {
                              break L32;
                            } else {
                              break L34;
                            }
                          }
                        }
                        L35: {
                          if (var6 == 2) {
                            break L35;
                          } else {
                            if (var6 == 3) {
                              aa.field_b = aa.field_b - 1;
                              pn.field_b = pn.field_b - hl.field_b;
                              if (var10 == 0) {
                                break L32;
                              } else {
                                break L35;
                              }
                            } else {
                              break L32;
                            }
                          }
                        }
                        aa.field_b = aa.field_b + 1;
                        pn.field_b = pn.field_b + hl.field_b;
                        break L32;
                      }
                      L36: {
                        if (wj.field_j < 2) {
                          break L36;
                        } else {
                          if (!ee.e((byte) 75)) {
                            break L36;
                          } else {
                            if (var10 == 0) {
                              continue L21;
                            } else {
                              break L36;
                            }
                          }
                        }
                      }
                      L37: {
                        if (wj.field_j >= 2) {
                          if (ud.field_c <= 0) {
                            break L37;
                          } else {
                            L38: {
                              od.field_i = od.field_i.substring(1) + ud.field_c;
                              if (od.field_i.equalsIgnoreCase("megaslg")) {
                                L39: {
                                  if (an.field_d) {
                                    stackOut_140_0 = 0;
                                    stackIn_141_0 = stackOut_140_0;
                                    break L39;
                                  } else {
                                    stackOut_139_0 = 1;
                                    stackIn_141_0 = stackOut_139_0;
                                    break L39;
                                  }
                                }
                                an.field_d = stackIn_141_0 != 0;
                                qm.field_f = true;
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                            L40: {
                              if (od.field_i.equalsIgnoreCase("watrbmb")) {
                                L41: {
                                  if (dg.field_b) {
                                    stackOut_146_0 = 0;
                                    stackIn_147_0 = stackOut_146_0;
                                    break L41;
                                  } else {
                                    stackOut_145_0 = 1;
                                    stackIn_147_0 = stackOut_145_0;
                                    break L41;
                                  }
                                }
                                dg.field_b = stackIn_147_0 != 0;
                                qm.field_f = true;
                                break L40;
                              } else {
                                break L40;
                              }
                            }
                            L42: {
                              if (!od.field_i.equalsIgnoreCase("fartbmb")) {
                                break L42;
                              } else {
                                L43: {
                                  if (rj.field_b) {
                                    stackOut_152_0 = 0;
                                    stackIn_153_0 = stackOut_152_0;
                                    break L43;
                                  } else {
                                    stackOut_151_0 = 1;
                                    stackIn_153_0 = stackOut_151_0;
                                    break L43;
                                  }
                                }
                                rj.field_b = stackIn_153_0 != 0;
                                qm.field_f = true;
                                break L42;
                              }
                            }
                            L44: {
                              if (!od.field_i.equalsIgnoreCase("oilybmb")) {
                                break L44;
                              } else {
                                L45: {
                                  if (nk.field_p) {
                                    stackOut_158_0 = 0;
                                    stackIn_159_0 = stackOut_158_0;
                                    break L45;
                                  } else {
                                    stackOut_157_0 = 1;
                                    stackIn_159_0 = stackOut_157_0;
                                    break L45;
                                  }
                                }
                                nk.field_p = stackIn_159_0 != 0;
                                qm.field_f = true;
                                break L44;
                              }
                            }
                            L46: {
                              if (!od.field_i.equalsIgnoreCase("lavafld")) {
                                break L46;
                              } else {
                                qm.field_f = true;
                                je.field_u = je.field_N[cm.field_o];
                                je.k();
                                break L46;
                              }
                            }
                            L47: {
                              if (od.field_i.equalsIgnoreCase("prtyhrd")) {
                                L48: {
                                  if (ba.field_M) {
                                    stackOut_166_0 = 0;
                                    stackIn_167_0 = stackOut_166_0;
                                    break L48;
                                  } else {
                                    stackOut_165_0 = 1;
                                    stackIn_167_0 = stackOut_165_0;
                                    break L48;
                                  }
                                }
                                ba.field_M = stackIn_167_0 != 0;
                                break L47;
                              } else {
                                break L47;
                              }
                            }
                            L49: {
                              if (!od.field_i.equalsIgnoreCase("hamyths")) {
                                break L49;
                              } else {
                                qm.field_f = true;
                                uf.field_p[jf.b((byte) 123)] = new gf(16, 4, 9);
                                break L49;
                              }
                            }
                            L50: {
                              if (!od.field_i.equalsIgnoreCase("owalrus")) {
                                break L50;
                              } else {
                                qm.field_f = true;
                                uf.field_p[jf.b((byte) 92)] = new gf(16, 4, 19);
                                break L50;
                              }
                            }
                            L51: {
                              if (od.field_i.equalsIgnoreCase("bigloot")) {
                                qm.field_f = true;
                                uf.field_p[jf.b((byte) 66)] = new gf(16, 4, 12);
                                break L51;
                              } else {
                                break L51;
                              }
                            }
                            if (od.field_i.equalsIgnoreCase("imgreat")) {
                              L52: {
                                L53: {
                                  qm.field_f = true;
                                  var6 = a.field_c;
                                  if (0 != a.field_c) {
                                    break L53;
                                  } else {
                                    a.field_c = a.field_c + 999;
                                    if (var10 == 0) {
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L54: {
                                  if (a.field_c >= 1000) {
                                    break L54;
                                  } else {
                                    a.field_c = 4999;
                                    if (var10 == 0) {
                                      break L52;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                                L55: {
                                  if (a.field_c < 5000) {
                                    break L55;
                                  } else {
                                    L56: {
                                      if (a.field_c < 25000) {
                                        break L56;
                                      } else {
                                        L57: {
                                          if (a.field_c >= 50000) {
                                            break L57;
                                          } else {
                                            a.field_c = 99999;
                                            if (var10 == 0) {
                                              break L52;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        L58: {
                                          if (a.field_c < 100000) {
                                            break L58;
                                          } else {
                                            L59: {
                                              if (a.field_c >= 200000) {
                                                break L59;
                                              } else {
                                                a.field_c = 499999;
                                                if (var10 == 0) {
                                                  break L52;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                            }
                                            L60: {
                                              if (a.field_c < 500000) {
                                                break L60;
                                              } else {
                                                if (a.field_c >= 1000000) {
                                                  break L52;
                                                } else {
                                                  a.field_c = 6000000;
                                                  if (var10 == 0) {
                                                    break L52;
                                                  } else {
                                                    break L60;
                                                  }
                                                }
                                              }
                                            }
                                            a.field_c = 999999;
                                            if (var10 == 0) {
                                              break L52;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                        a.field_c = 199999;
                                        if (var10 == 0) {
                                          break L52;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    a.field_c = 49999;
                                    if (var10 == 0) {
                                      break L52;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                                a.field_c = 24999;
                                break L52;
                              }
                              L61: {
                                var7 = -var6 + a.field_c;
                                var8 = rg.field_sb % 3;
                                if (var8 == 0) {
                                  break L61;
                                } else {
                                  L62: {
                                    if (var8 == 1) {
                                      break L62;
                                    } else {
                                      var9 = var7 / 3;
                                      vh.field_g = vh.field_g - (-var9 + var7);
                                      di.field_X = di.field_X + var9;
                                      if (var10 == 0) {
                                        break L37;
                                      } else {
                                        break L62;
                                      }
                                    }
                                  }
                                  vh.field_g = vh.field_g - var7;
                                  if (var10 == 0) {
                                    break L37;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              di.field_X = di.field_X + var7;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                        } else {
                          break L37;
                        }
                      }
                      L63: {
                        if (lj.field_t != 13) {
                          break L63;
                        } else {
                          if (!ke.field_V) {
                            break L63;
                          } else {
                            if (15 != pl.field_h) {
                              break L63;
                            } else {
                              L64: {
                                if (!((MinerDisturbance) this).field_K) {
                                  break L64;
                                } else {
                                  if (!ak.a(-120)) {
                                    break L63;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              fm.f((byte) 81);
                              df.a(0, 5494, -1);
                              ne.a(1, -90);
                              al.e(107);
                              ((MinerDisturbance) this).field_K = true;
                              break L63;
                            }
                          }
                        }
                      }
                      L65: {
                        if (ke.field_V) {
                          break L65;
                        } else {
                          if (!il.e(-31391)) {
                            break L65;
                          } else {
                            L66: {
                              L67: {
                                if (lj.field_t == 98) {
                                  break L67;
                                } else {
                                  if (99 != lj.field_t) {
                                    break L66;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                              ((MinerDisturbance) this).field_O = true;
                              of.field_a = true;
                              break L66;
                            }
                            if (lj.field_t == 84) {
                              L68: {
                                this.q(-46);
                                bj.a(-6358, ph.field_a);
                                fm.f((byte) 81);
                                if (kj.a(false)) {
                                  break L68;
                                } else {
                                  jc.a(false, -107, 2);
                                  kd.a(cm.field_o, (byte) -106);
                                  if (!ig.a(-20144)) {
                                    break L65;
                                  } else {
                                    jc.a(false, -114, 5);
                                    if (var10 == 0) {
                                      break L65;
                                    } else {
                                      break L68;
                                    }
                                  }
                                }
                              }
                              jc.a(false, -120, 6);
                              break L65;
                            } else {
                              break L65;
                            }
                          }
                        }
                      }
                      L69: {
                        if (!d.field_b) {
                          break L69;
                        } else {
                          if (lj.field_t != 82) {
                            break L69;
                          } else {
                            if (0 < gi.field_c) {
                              break L69;
                            } else {
                              L70: {
                                if (qe.field_b[1]) {
                                  break L70;
                                } else {
                                  if (!qe.field_b[0]) {
                                    break L69;
                                  } else {
                                    break L70;
                                  }
                                }
                              }
                              if (!ke.field_V) {
                                break L69;
                              } else {
                                L71: {
                                  gi.field_c = 25;
                                  if (sc.field_b) {
                                    ag.a(true, 10, 32 * hf.field_t, ca.field_k * 32);
                                    break L71;
                                  } else {
                                    break L71;
                                  }
                                }
                                L72: {
                                  if (!qe.field_b[1]) {
                                    break L72;
                                  } else {
                                    var6 = jf.b((byte) 110);
                                    uf.field_p[var6] = new gf(ca.field_k, hf.field_t, 7);
                                    cc.a(var6, 136989569);
                                    if (var10 == 0) {
                                      break L69;
                                    } else {
                                      break L72;
                                    }
                                  }
                                }
                                var6 = jf.b((byte) 101);
                                uf.field_p[var6] = new gf(ca.field_k, hf.field_t, 6);
                                fn.b(var6, 100);
                                break L69;
                              }
                            }
                          }
                        }
                      }
                      L73: {
                        if (!d.field_b) {
                          break L73;
                        } else {
                          if (lj.field_t != 86) {
                            break L73;
                          } else {
                            if (gi.field_c > 0) {
                              break L73;
                            } else {
                              if (!qe.field_b[17]) {
                                break L73;
                              } else {
                                if (!ke.field_V) {
                                  break L73;
                                } else {
                                  L74: {
                                    gi.field_c = 25;
                                    if (!sc.field_b) {
                                      break L74;
                                    } else {
                                      ag.a(true, 26, 32 * hf.field_t, ca.field_k * 32);
                                      break L74;
                                    }
                                  }
                                  var6 = jf.b((byte) 88);
                                  uf.field_p[var6] = new gf(ca.field_k, hf.field_t, 20);
                                  cc.a(var6, 136989569);
                                  break L73;
                                }
                              }
                            }
                          }
                        }
                      }
                      L75: {
                        if (rj.field_f > 1) {
                          stackOut_277_0 = 0;
                          stackIn_278_0 = stackOut_277_0;
                          break L75;
                        } else {
                          stackOut_276_0 = 1;
                          stackIn_278_0 = stackOut_276_0;
                          break L75;
                        }
                      }
                      L76: {
                        var6 = stackIn_278_0;
                        if (!d.field_b) {
                          break L76;
                        } else {
                          if (lj.field_t != 81) {
                            break L76;
                          } else {
                            if (var6 == 0) {
                              break L76;
                            } else {
                              if (!qe.field_b[8]) {
                                break L76;
                              } else {
                                if (!ke.field_V) {
                                  break L76;
                                } else {
                                  L77: {
                                    L78: {
                                      if (je.c(ca.field_k, hf.field_t, 3, 3)) {
                                        break L78;
                                      } else {
                                        rj.field_f = 9;
                                        if (var10 == 0) {
                                          break L77;
                                        } else {
                                          break L78;
                                        }
                                      }
                                    }
                                    rj.field_f = 11;
                                    break L77;
                                  }
                                  kj.field_d = 0;
                                  break L76;
                                }
                              }
                            }
                          }
                        }
                      }
                      L79: {
                        if (2 > wj.field_j) {
                          break L79;
                        } else {
                          L80: {
                            if (!d.field_b) {
                              break L80;
                            } else {
                              if (86 != lj.field_t) {
                                break L80;
                              } else {
                                if (gi.field_c > 0) {
                                  break L80;
                                } else {
                                  if (ke.field_V) {
                                    gi.field_c = 25;
                                    if (dg.field_b) {
                                      ne.a(17, -126);
                                      uf.field_p[jf.b((byte) 78)] = new gf(ca.field_k, hf.field_t, 15);
                                      break L80;
                                    } else {
                                      break L80;
                                    }
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                            }
                          }
                          L81: {
                            if (!d.field_b) {
                              break L81;
                            } else {
                              if (lj.field_t != 80) {
                                break L81;
                              } else {
                                if (gi.field_c > 0) {
                                  break L81;
                                } else {
                                  if (!ke.field_V) {
                                    break L81;
                                  } else {
                                    gi.field_c = 25;
                                    if (!rj.field_b) {
                                      break L81;
                                    } else {
                                      ne.a(17, 115);
                                      uf.field_p[jf.b((byte) 49)] = new gf(ca.field_k, hf.field_t, 18);
                                      break L81;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L82: {
                            if (!d.field_b) {
                              break L82;
                            } else {
                              if (1 != lj.field_t) {
                                break L82;
                              } else {
                                if (gi.field_c > 0) {
                                  break L82;
                                } else {
                                  if (!ke.field_V) {
                                    break L82;
                                  } else {
                                    gi.field_c = 25;
                                    if (!nk.field_p) {
                                      break L82;
                                    } else {
                                      ne.a(17, 93);
                                      uf.field_p[jf.b((byte) 52)] = new gf(ca.field_k, hf.field_t, 22);
                                      break L82;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L83: {
                            if (~ni.field_a == ~lj.field_t) {
                              qm.field_f = true;
                              hf.field_t = hf.field_t + 4;
                              mh.field_e[ca.field_k][hf.field_t].field_a = false;
                              break L83;
                            } else {
                              break L83;
                            }
                          }
                          L84: {
                            if (~lj.field_t == ~pm.field_a) {
                              qm.field_f = true;
                              hf.field_t = hf.field_t - 4;
                              mh.field_e[ca.field_k][hf.field_t].field_a = false;
                              break L84;
                            } else {
                              break L84;
                            }
                          }
                          L85: {
                            if (39 != lj.field_t) {
                              break L85;
                            } else {
                              L86: {
                                stackOut_333_0 = this;
                                stackIn_336_0 = stackOut_333_0;
                                stackIn_334_0 = stackOut_333_0;
                                if (((MinerDisturbance) this).field_V) {
                                  stackOut_336_0 = this;
                                  stackOut_336_1 = 0;
                                  stackIn_337_0 = stackOut_336_0;
                                  stackIn_337_1 = stackOut_336_1;
                                  break L86;
                                } else {
                                  stackOut_334_0 = this;
                                  stackIn_335_0 = stackOut_334_0;
                                  stackOut_335_0 = this;
                                  stackOut_335_1 = 1;
                                  stackIn_337_0 = stackOut_335_0;
                                  stackIn_337_1 = stackOut_335_1;
                                  break L86;
                                }
                              }
                              ((MinerDisturbance) this).field_V = stackIn_337_1 != 0;
                              break L85;
                            }
                          }
                          L87: {
                            if (lj.field_t != 71) {
                              break L87;
                            } else {
                              if (!il.e(-31391)) {
                                break L87;
                              } else {
                                ((MinerDisturbance) this).field_T = ((MinerDisturbance) this).field_T - 1;
                                if (0 > ((MinerDisturbance) this).field_T) {
                                  ((MinerDisturbance) this).field_T = sl.field_u[pl.field_h].length - 1;
                                  break L87;
                                } else {
                                  break L87;
                                }
                              }
                            }
                          }
                          if (lj.field_t != 72) {
                            break L79;
                          } else {
                            if (!il.e(-31391)) {
                              break L79;
                            } else {
                              ((MinerDisturbance) this).field_T = ((MinerDisturbance) this).field_T + 1;
                              if (~(sl.field_u[pl.field_h].length + -1) >= ~((MinerDisturbance) this).field_T) {
                                ((MinerDisturbance) this).field_T = 0;
                                break L79;
                              } else {
                                break L79;
                              }
                            }
                          }
                        }
                      }
                      L88: {
                        if (lj.field_t != 84) {
                          break L88;
                        } else {
                          ((MinerDisturbance) this).field_K = hk.a(27);
                          if (ke.field_V) {
                            break L88;
                          } else {
                            if (!fl.field_d) {
                              break L88;
                            } else {
                              if (il.e(-31391)) {
                                L89: {
                                  ((MinerDisturbance) this).field_O = false;
                                  this.q(-46);
                                  bj.a(-6358, ph.field_a);
                                  fm.f((byte) 81);
                                  if (!kj.a(false)) {
                                    break L89;
                                  } else {
                                    jc.a(false, -125, 6);
                                    if (var10 == 0) {
                                      break L88;
                                    } else {
                                      break L89;
                                    }
                                  }
                                }
                                jc.a(false, -107, 2);
                                kd.a(cm.field_o, (byte) -124);
                                if (ig.a(-20144)) {
                                  jc.a(false, -123, 5);
                                  break L88;
                                } else {
                                  break L88;
                                }
                              } else {
                                break L88;
                              }
                            }
                          }
                        }
                      }
                      if (var10 == 0) {
                        continue L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                break L22;
              }
              return;
            }
          }
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
                return;
              } else {
                L1: {
                  if (((MinerDisturbance) this).field_R > 0) {
                    L2: {
                      L3: {
                        if (((MinerDisturbance) this).field_R > 100) {
                          break L3;
                        } else {
                          var2_int = ((MinerDisturbance) this).field_R + -40;
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (((MinerDisturbance) this).field_R > 240) {
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
                      var2_int = -((MinerDisturbance) this).field_R + 300;
                      break L2;
                    }
                    L5: {
                      L6: {
                        var3_int = var2_int;
                        if (cm.field_o != 0) {
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
                var2_int = -((MinerDisturbance) this).field_H + (373 - (-90 + -ma.field_O.field_A));
                var3_int = -((MinerDisturbance) this).field_H + 373;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (~var2_int >= ~var3_int) {
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
                      if (((MinerDisturbance) this).field_S < 1) {
                        break L11;
                      } else {
                        L12: {
                          eh.d(((MinerDisturbance) this).field_F, 453, ((MinerDisturbance) this).field_D[((MinerDisturbance) this).field_I] + 44, 452 - ((MinerDisturbance) this).field_cb, 1);
                          var3_int = ((MinerDisturbance) this).field_I + -1;
                          if (var3_int < 0) {
                            var3_int = -1 + ((MinerDisturbance) this).field_D.length;
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
                                  if (~var4 <= ~((MinerDisturbance) this).field_S) {
                                    break L17;
                                  } else {
                                    var5 = 1 + var3_int;
                                    stackOut_34_0 = ~((MinerDisturbance) this).field_D.length;
                                    stackOut_34_1 = ~var5;
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
                                          eh.d(((MinerDisturbance) this).field_D[var5] + 44, 453 + (-var4 + -((MinerDisturbance) this).field_cb), ((MinerDisturbance) this).field_D[var3_int] + 44, -(1 + var4) - ((MinerDisturbance) this).field_cb + 453, 1);
                                          if (0 < var3_int) {
                                            break L21;
                                          } else {
                                            var3_int = ((MinerDisturbance) this).field_D.length - 1;
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
                              ol.field_a.f(((MinerDisturbance) this).field_D[((MinerDisturbance) this).field_I] + (-(ol.field_a.field_x >> 1) + 44), -(ol.field_a.field_A >> 1) + 453);
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
                          if (var4 >= 463) {
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
                        ol.field_a.f(44 - (ol.field_a.field_x >> 1), -(ol.field_a.field_A >> 1) + 453);
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
                        if (var8 >= 21) {
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
                                  if (var8 != 20) {
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
                                if (var6 > 8) {
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
                          bb.a(lb.field_t, 0, (we) (Object) ce.field_d, 16513123, -6);
                          if (var10 == 0) {
                            break L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                      L45: {
                        if (var8 != 0) {
                          break L45;
                        } else {
                          bb.a(lj.field_v, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                          bb.a(el.field_a, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                              bb.a(mg.field_b, 0, (we) (Object) ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L48;
                              }
                            }
                          }
                          L49: {
                            if (var8 != 7) {
                              break L49;
                            } else {
                              bb.a(bd.field_i, 0, (we) (Object) ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L49;
                              }
                            }
                          }
                          L50: {
                            if (var8 != 9) {
                              break L50;
                            } else {
                              bb.a(oc.field_h, 0, (we) (Object) ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L50;
                              }
                            }
                          }
                          L51: {
                            if (var8 != 11) {
                              break L51;
                            } else {
                              bb.a(fg.field_e, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                              bb.a(hn.field_a, 0, (we) (Object) ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L52;
                              }
                            }
                          }
                          L53: {
                            if (var8 != 4) {
                              break L53;
                            } else {
                              bb.a(ei.field_K, 0, (we) (Object) ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L53;
                              }
                            }
                          }
                          L54: {
                            if (var8 == 10) {
                              break L54;
                            } else {
                              L55: {
                                if (5 != var8) {
                                  break L55;
                                } else {
                                  bb.a(el.field_b, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                                  bb.a(j.field_e, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                                      bb.a(gd.field_z, 0, (we) (Object) ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  L59: {
                                    if (var8 != -2) {
                                      break L59;
                                    } else {
                                      bb.a(kb.field_d, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                                      bb.a(fd.field_W, 0, (we) (Object) ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L60;
                                      }
                                    }
                                  }
                                  L61: {
                                    if (var8 != 19) {
                                      break L61;
                                    } else {
                                      bb.a(tj.field_c, 0, (we) (Object) ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L61;
                                      }
                                    }
                                  }
                                  L62: {
                                    if (var8 == 15) {
                                      break L62;
                                    } else {
                                      L63: {
                                        if (17 == var8) {
                                          break L63;
                                        } else {
                                          L64: {
                                            if (var8 != 16) {
                                              break L64;
                                            } else {
                                              bb.a(g.field_e, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                                              bb.a(om.field_d, 0, (we) (Object) ce.field_d, 16513123, -6);
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
                                            bb.a(ti.field_P, 0, (we) (Object) ce.field_d, 16513123, -6);
                                            if (var10 == 0) {
                                              break L43;
                                            } else {
                                              break L63;
                                            }
                                          }
                                        }
                                      }
                                      bb.a(tj.field_a, 0, (we) (Object) ce.field_d, 16513123, -6);
                                      if (var10 == 0) {
                                        break L43;
                                      } else {
                                        break L62;
                                      }
                                    }
                                  }
                                  bb.a(th.field_a, 0, (we) (Object) ce.field_d, 16513123, -6);
                                  if (var10 == 0) {
                                    break L43;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                              bb.a(gi.field_b, 0, (we) (Object) ce.field_d, 16513123, -6);
                              if (var10 == 0) {
                                break L43;
                              } else {
                                break L54;
                              }
                            }
                          }
                          bb.a(tb.field_g, 0, (we) (Object) ce.field_d, 16513123, -6);
                          if (var10 == 0) {
                            break L43;
                          } else {
                            break L47;
                          }
                        }
                      }
                      bb.a(hf.field_p, 0, (we) (Object) ce.field_d, 16513123, -6);
                      break L43;
                    }
                    break L0;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "MinerDisturbance.DB(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        if (param0 > -104) {
            return;
        }
        try {
            ke.field_V = false;
            mg.a((byte) -113);
            ((MinerDisturbance) this).field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "MinerDisturbance.CA(" + param0 + ')');
        }
    }

    public MinerDisturbance() {
        ((MinerDisturbance) this).field_U = 0;
        ((MinerDisturbance) this).field_Y = false;
        ((MinerDisturbance) this).field_I = 0;
        ((MinerDisturbance) this).field_E = 0;
        ((MinerDisturbance) this).field_X = ((MinerDisturbance) this).field_K;
        ((MinerDisturbance) this).field_H = 0;
        ((MinerDisturbance) this).field_M = 1;
        ((MinerDisturbance) this).field_D = new int[80];
        ((MinerDisturbance) this).field_O = false;
        ((MinerDisturbance) this).field_F = 44;
        ((MinerDisturbance) this).field_L = new int[9216];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = 0;
    }
}
