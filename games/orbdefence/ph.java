/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ph extends tf {
    static int[] field_x;
    private boolean field_z;
    private int field_y;
    private int field_p;
    private int field_A;
    private static boolean field_v;
    private boolean field_r;
    static int field_u;
    private int field_o;
    String field_n;
    private int field_s;
    private int field_q;
    private long field_w;
    private boolean field_t;

    private final void c(int param0, boolean param1) {
        vk.field_w[16] = true;
        vk.field_w[7] = true;
        vk.field_w[3] = true;
        vk.field_w[18] = true;
        vk.field_w[8] = param1;
        vk.field_w[0] = true;
        vk.field_w[17] = true;
    }

    private final void i() {
        int discarded$0 = -128;
        String var2 = fb.c();
        int discarded$1 = 0;
        lh.a(uj.b((byte) -120), var2);
        int var3 = -120;
    }

    private final void k() {
        vk.field_w[2] = true;
    }

    final void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        ((ph) this).setBackground(java.awt.Color.black);
        if (param1 <= 41) {
            Object var10 = null;
            ((ph) this).a(114, (String) null, (byte) 126);
        }
        wj.field_m = ((ph) this).field_A;
        wg.a(wj.field_m, (byte) -108);
        int discarded$0 = 49;
        ec.a(((ph) this).field_n, 5000, ((ph) this).field_t, ((ph) this).field_s, param0, param7, ((ph) this).field_q, 5000, ((ph) this).field_p, ((ph) this).field_w, wj.field_m, wc.field_c, ((ph) this).field_y);
        nc.a(wj.field_m, ((ph) this).field_y, param7, ((ph) this).field_n, (byte) 93, ((ph) this).field_q, ((ph) this).field_s, wc.field_c, ((ph) this).field_p);
        int discarded$1 = 0;
        k.a();
        int discarded$2 = -112;
        mj.field_i = de.a();
        l.a(tf.field_f, 59);
        pj.field_p = param3;
        cb.field_e = param5;
        ve.field_Q = param6;
        oc.field_V = param4;
        nl.field_b = param2;
        int discarded$3 = 56;
        this.f();
        int discarded$4 = 103;
        tl.b();
    }

    private final void l() {
        int var2 = cd.field_t.b((byte) 90);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = tf.field_c + -1;
        byte[] var5 = new byte[var4];
        cd.field_t.a(-29, 0, var5, var4);
        ke.a(bk.a(var5, -12465), var3 != 0, (byte) -94, uj.b((byte) -120));
    }

    final void a(int param0, String param1, byte param2) {
        try {
            int var4_int = 68 % ((-44 - param2) / 62);
            this.a(480, 73, 640, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ph.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            mg var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = OrbDefence.field_D ? 1 : 0;
            int discarded$8 = -67;
            var4 = tl.a(of.field_K, wj.field_m, param2);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$9 = 32018;
                    int discarded$10 = -128;
                    var5_int = ik.a(lm.c(), fb.b(), ~param1);
                    if (var5_int == -1) {
                      break L1;
                    } else {
                      i.a(-35, kk.field_Y, vd.field_e, var5_int);
                      vd.field_e = null;
                      kk.field_Y = null;
                      break L1;
                    }
                  }
                  int discarded$11 = 126;
                  var11 = k.b();
                  if (var11 != null) {
                    int discarded$12 = 63;
                    sd.a(var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$13 = -105;
                  int discarded$14 = 989270945;
                  var5_int = kg.a(am.b(-28), uh.b(param1 ^ -5), ((ph) this).field_o, na.a(), qh.a(-42), 200, jf.j());
                  if (-1 == var5_int) {
                    break L2;
                  } else {
                    fa.a(-111, var5_int, vd.field_e, kk.field_Y);
                    kk.field_Y = null;
                    vd.field_e = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 == -1) {
                  break L3;
                } else {
                  ((ph) this).field_w = 13L;
                  break L3;
                }
              }
              L4: {
                if (var4 != 3) {
                  break L4;
                } else {
                  L5: {
                    if (o.field_j == -1) {
                      break L5;
                    } else {
                      if (o.field_j == 0) {
                        break L5;
                      } else {
                        o.field_j = -1;
                        hh.c(param1 ^ -24061);
                        break L5;
                      }
                    }
                  }
                  if (param0) {
                    fa.field_a = false;
                    break L4;
                  } else {
                    var5_int = vc.a(((ph) this).field_z, ((ph) this).field_o, param1 ^ 77, am.b(param1 ^ 60), false, uh.b(4));
                    if (var5_int != -1) {
                      if (var5_int != 0) {
                        se.a(kk.field_Y, (byte) -115, var5_int);
                        kk.field_Y = null;
                        break L4;
                      } else {
                        el.field_F = p.field_c;
                        id.a(false);
                        d.field_k = false;
                        hi.field_k = 10;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L6: {
                if (var4 == 4) {
                  if (jc.field_b) {
                    ad.a(0, uj.b((byte) -120));
                    break L6;
                  } else {
                    hi.field_k = 10;
                    d.field_k = true;
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 != 5) {
                  break L7;
                } else {
                  ja.a(param1 ^ 104, uj.b((byte) -120));
                  break L7;
                }
              }
              L8: {
                if (6 != var4) {
                  break L8;
                } else {
                  if (!pa.field_b) {
                    break L8;
                  } else {
                    hi.field_k = 10;
                    break L8;
                  }
                }
              }
              L9: {
                if (var4 != 7) {
                  break L9;
                } else {
                  tf.a(uj.b((byte) -120), -6407);
                  break L9;
                }
              }
              L10: {
                if (var4 != 8) {
                  break L10;
                } else {
                  ad.a(~param1, uj.b((byte) -120));
                  break L10;
                }
              }
              L11: {
                if (var4 != 9) {
                  break L11;
                } else {
                  int discarded$15 = 1;
                  ka.a(uj.b((byte) -120));
                  break L11;
                }
              }
              L12: {
                if (var4 == 10) {
                  uk.field_b.i(17, 89);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 != 11) {
                  break L13;
                } else {
                  bm.a(param1 + 12980, uj.b((byte) -120));
                  break L13;
                }
              }
              L14: {
                if (var4 != 12) {
                  break L14;
                } else {
                  jj.a(da.a(-103), (byte) 53, uj.b((byte) -120));
                  break L14;
                }
              }
              L15: {
                if (var4 == 13) {
                  try {
                    L16: {
                      L17: {
                        if (null == ml.field_e) {
                          ml.field_e = new uj(wc.field_c, new java.net.URL(((ph) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (!ml.field_e.b(param1 + -3)) {
                          break L18;
                        } else {
                          L19: {
                            var12 = ml.field_e.a(5);
                            if (var12 == null) {
                              var9 = null;
                              li.a(-1, (String) null);
                              break L19;
                            } else {
                              var7 = tj.a(var12.field_i, 0, 0, var12.field_j);
                              li.a(param1, var7);
                              break L19;
                            }
                          }
                          ml.field_e = null;
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      pe.a((byte) -13, (Throwable) (Object) var5, "S1");
                      var10 = null;
                      li.a(param1, (String) null);
                      ml.field_e = null;
                      break L20;
                    }
                  }
                  break L15;
                } else {
                  break L15;
                }
              }
              L21: {
                if (var4 != 15) {
                  break L21;
                } else {
                  hi.field_k = 10;
                  break L21;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (var4 != 17) {
                  return 0;
                } else {
                  return 2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void n() {
        vk.field_w[4] = true;
    }

    private final void m() {
        vk.field_w[1] = true;
    }

    final static void b(boolean param0) {
        int var1 = 0;
        if (ck.field_f >= 224) {
            ce.a(256, (byte) -118);
        } else {
            var1 = ck.field_f % 32;
            ce.a(-var1 + ck.field_f + 32, (byte) -127);
        }
        if (!param0) {
            field_x = null;
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        og var3 = null;
        int var4 = 0;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          var4 = OrbDefence.field_D ? 1 : 0;
          var2 = ab.field_l;
          if (var2 >= 64) {
            break L0;
          } else {
            if (vk.field_w[var2]) {
              L1: {
                if (param0 <= -108) {
                  break L1;
                } else {
                  int discarded$10 = this.a(false, 60, true);
                  break L1;
                }
              }
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if (1 != var2) {
                    if (2 == var2) {
                      int discarded$11 = 68;
                      uk.a();
                      break L2;
                    } else {
                      if (var2 == 3) {
                        int discarded$12 = 122;
                        lb.c();
                        break L2;
                      } else {
                        if (var2 != 4) {
                          if (var2 != 5) {
                            if (var2 == 6) {
                              ad.a(90);
                              break L2;
                            } else {
                              if (var2 != 7) {
                                if (var2 != 8) {
                                  if (16 != var2) {
                                    L3: {
                                      if (11 == var2) {
                                        break L3;
                                      } else {
                                        if (12 == var2) {
                                          break L3;
                                        } else {
                                          if (var2 == 13) {
                                            vc.b(-48);
                                            break L2;
                                          } else {
                                            if (var2 == 17) {
                                              int discarded$13 = -119;
                                              this.l();
                                              break L2;
                                            } else {
                                              if (var2 != 18) {
                                                pe.a((byte) -13, (Throwable) null, "MGS1: " + sj.b(true));
                                                th.a(104);
                                                break L2;
                                              } else {
                                                int discarded$14 = 117;
                                                ek.c();
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (var2 != 12) {
                                        stackOut_33_0 = 0;
                                        stackIn_34_0 = stackOut_33_0;
                                        break L4;
                                      } else {
                                        stackOut_32_0 = 1;
                                        stackIn_34_0 = stackOut_32_0;
                                        break L4;
                                      }
                                    }
                                    var3 = oe.a(stackIn_34_0 != 0, (byte) -53);
                                    int discarded$15 = 126;
                                    fm.a(var3);
                                    break L2;
                                  } else {
                                    gb.b(-122);
                                    break L2;
                                  }
                                } else {
                                  fb.a((mg) (Object) cd.field_t, tf.field_c, -31, wc.field_c);
                                  break L2;
                                }
                              } else {
                                int discarded$16 = -22;
                                this.i();
                                break L2;
                              }
                            }
                          } else {
                            int discarded$17 = 0;
                            pc.f();
                            break L2;
                          }
                        } else {
                          int discarded$18 = 554553416;
                          hb.b();
                          break L2;
                        }
                      }
                    }
                  } else {
                    int discarded$19 = -51;
                    tc.a();
                    break L2;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        pe.a((byte) -13, (Throwable) null, "MGS2: " + sj.b(true));
        th.a(102);
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        Object var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          try {
            L0: {
              if (!((ph) this).c(1)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((ph) this).field_n = ((ph) this).getCodeBase().getHost();
                    var6_ref2 = ((ph) this).field_n.toLowerCase();
                    stackOut_3_0 = this;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L1;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L1;
                }
                L3: {
                  ((ph) this).field_z = stackIn_8_1 != 0;
                  ((ph) this).field_q = Integer.parseInt(((ph) this).getParameter("gameport1"));
                  ((ph) this).field_p = Integer.parseInt(((ph) this).getParameter("gameport2"));
                  var7 = ((ph) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((ph) this).field_y = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((ph) this).field_s = Integer.parseInt(((ph) this).getParameter("gamecrc"));
                  ((ph) this).field_w = Long.parseLong(((ph) this).getParameter("instanceid"));
                  ((ph) this).field_t = ((ph) this).getParameter("member").equals((Object) (Object) "yes");
                  var9 = 0;
                  var8 = ((ph) this).getParameter("lang");
                  if (var8 != null) {
                    ((ph) this).field_A = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((ph) this).field_A < 5) {
                    break L5;
                  } else {
                    ((ph) this).field_A = 0;
                    break L5;
                  }
                }
                L6: {
                  var10 = ((ph) this).getParameter("affid");
                  if (var10 == null) {
                    break L6;
                  } else {
                    ((ph) this).field_o = Integer.parseInt(var10);
                    break L6;
                  }
                }
                field_v = Boolean.valueOf(((ph) this).getParameter("simplemode")).booleanValue();
                ((ph) this).a(-10291, ((ph) this).field_s, param4, 640, 480, param3, 32);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var11 = null;
              pe.a((byte) -13, (Throwable) (Object) var6, (String) null);
              ((ph) this).a(110, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6_ref;
            stackOut_21_1 = new StringBuilder().append("ph.GA(").append(480).append(',').append(73).append(',').append(640).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ')');
        }
    }

    final int j(int param0) {
        int var2 = 0;
        if (param0 == 7) {
          L0: {
            L1: {
              int discarded$6 = -10125;
              var2 = this.h();
              if (var2 == 0) {
                break L1;
              } else {
                if (var2 != 1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!vk.field_w[1]) {
                break L2;
              } else {
                ij.a((byte) -34, 2);
                break L2;
              }
            }
            L3: {
              if (!vk.field_w[2]) {
                break L3;
              } else {
                qj.a(3, 7287);
                break L3;
              }
            }
            L4: {
              if (vk.field_w[3]) {
                am.a(4, 113);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!vk.field_w[4]) {
                break L5;
              } else {
                ql.a(5, (byte) 21);
                break L5;
              }
            }
            L6: {
              if (!vk.field_w[5]) {
                break L6;
              } else {
                ik.a((byte) -74, 6);
                break L6;
              }
            }
            L7: {
              if (vk.field_w[6]) {
                int discarded$7 = 7;
                nh.a(param0 + 15961);
                break L7;
              } else {
                break L7;
              }
            }
            if (!vk.field_w[8]) {
              break L0;
            } else {
              int discarded$8 = 0;
              vk.a();
              break L0;
            }
          }
          return var2;
        } else {
          return -15;
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref_java_awt_Dimension = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        String stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        String stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        String stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        String stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        String stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        int stackIn_135_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        String stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        String stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        String stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        String stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        String stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (null != ne.field_b) {
            L1: {
              if (mg.field_k != null) {
                break L1;
              } else {
                int discarded$21 = 4;
                var6 = ob.l();
                var4_ref_java_awt_Dimension = var6.getSize();
                ne.field_b.a(14592, var4_ref_java_awt_Dimension.height, var4_ref_java_awt_Dimension.width);
                break L1;
              }
            }
            ne.field_b.d((byte) 112);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          int discarded$22 = -128;
          ab.a();
          int discarded$23 = -107;
          mg.d();
          int discarded$24 = -126;
          if (eg.c()) {
            break L2;
          } else {
            if (11 == hi.field_k) {
              break L2;
            } else {
              int discarded$25 = 109;
              cf.a();
              break L2;
            }
          }
        }
        L3: {
          if (null != mj.field_i) {
            of.field_K = mj.field_i.a(1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!p.a(23236)) {
            break L4;
          } else {
            L5: {
              int discarded$26 = 84;
              var3 = 1200 * ok.a();
              if (((ph) this).field_r) {
                break L5;
              } else {
                int discarded$27 = 8;
                if (~var3 <= ~f.c()) {
                  break L4;
                } else {
                  int discarded$28 = -16733;
                  if (var3 >= pb.a()) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ph) this).field_r = false;
            th.a(111);
            md.b((byte) 42);
            se.a(oe.field_m, (byte) -79, 2);
            ke.a(-92);
            fa.field_a = true;
            lm.field_c = 15000L + ji.b(-103);
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == o.field_j) {
              break L7;
            } else {
              if (o.field_j != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != o.field_j) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            int discarded$29 = 117;
            o.field_j = bh.a();
            if (var3 == 0) {
              break L9;
            } else {
              if (o.field_j != 0) {
                break L9;
              } else {
                if (hi.field_k != 11) {
                  break L9;
                } else {
                  int discarded$30 = 1;
                  if (!sg.c()) {
                    id.a(false);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == o.field_j) {
            break L6;
          } else {
            if (o.field_j != 0) {
              lm.field_c = ji.b(123) - -15000L;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (-1 == o.field_j) {
            break L10;
          } else {
            if (o.field_j != 0) {
              if (10 <= vh.field_n) {
                if (hi.field_k < 10) {
                  break L10;
                } else {
                  L11: {
                    md.b((byte) -86);
                    if (o.field_j != 3) {
                      if (o.field_j == 4) {
                        se.a(cg.field_h, (byte) 109, 256);
                        break L11;
                      } else {
                        if (o.field_j == 2) {
                          se.a(ql.field_a, (byte) -118, 256);
                          break L11;
                        } else {
                          if (o.field_j != 5) {
                            se.a(pl.field_h, (byte) 63, 256);
                            break L11;
                          } else {
                            se.a(nf.field_k, (byte) -82, 5);
                            break L11;
                          }
                        }
                      }
                    } else {
                      se.a(o.field_i, (byte) -127, 256);
                      break L11;
                    }
                  }
                  fa.field_a = true;
                  break L10;
                }
              } else {
                if (o.field_j != 3) {
                  if (o.field_j != 4) {
                    if (o.field_j != 2) {
                      if (5 != o.field_j) {
                        ((ph) this).a(119, "js5connect");
                        break L10;
                      } else {
                        ((ph) this).a(99, "outofdate");
                        break L10;
                      }
                    } else {
                      ((ph) this).a(124, "js5connect_full");
                      break L10;
                    }
                  } else {
                    ((ph) this).a(125, "js5io");
                    break L10;
                  }
                } else {
                  ((ph) this).a(101, "js5crc");
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (-1 == o.field_j) {
                break L14;
              } else {
                if (o.field_j != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            int discarded$31 = 1;
            if (sg.c()) {
              break L13;
            } else {
              break L12;
            }
          }
          if (ji.b(-125) >= lm.field_c) {
            fa.field_a = false;
            if (o.field_j == -1) {
              break L12;
            } else {
              if (0 == o.field_j) {
                break L12;
              } else {
                o.field_j = -1;
                hh.c(24060);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (0 != o.field_j) {
            break L15;
          } else {
            int discarded$32 = 1;
            if (!sg.c()) {
              mf.field_d = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (vh.field_n == 0) {
            int discarded$33 = -2;
            if (!lg.a()) {
              break L16;
            } else {
              vh.field_n = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (vh.field_n == 1) {
            L18: {
              if (wj.field_m != 0) {
                int discarded$34 = -32585;
                lf.field_a = qk.a(cb.field_e);
                break L18;
              } else {
                break L18;
              }
            }
            og.field_g = hm.a(48, true, false, oc.field_V, 1);
            am.field_b = hm.a(48, true, false, ve.field_Q, 1);
            wb.field_b = hm.a(48, true, false, nl.field_b, 1);
            j.field_b = og.field_g;
            vh.field_n = 2;
            tf.field_d = am.field_b;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (vh.field_n == 2) {
            L20: {
              if (null != lf.field_a) {
                if (!lf.field_a.b(-1)) {
                  break L20;
                } else {
                  if (!lf.field_a.c((byte) -84, "")) {
                    lf.field_a = null;
                    break L20;
                  } else {
                    if (lf.field_a.b((byte) -61, "")) {
                      lm.a((byte) 116, lf.field_a);
                      lf.field_a = null;
                      vd.a(42);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            if (null == lf.field_a) {
              vh.field_n = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (vh.field_n != 3) {
            break L21;
          } else {
            if (!dk.a(1, og.field_g, wb.field_b, am.field_b)) {
              break L21;
            } else {
              int discarded$35 = 26810;
              if (tk.a(wb.field_b)) {
                L22: {
                  L23: {
                    ak.b(22176);
                    int discarded$36 = -96;
                    ek.a();
                    tl.field_e = cj.field_c;
                    pa.field_b = false;
                    gj.a(am.field_b, (byte) 33, wb.field_b, jc.field_b, og.field_g);
                    if (gj.field_k) {
                      break L23;
                    } else {
                      if (null != lg.field_b) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    stackOut_101_0 = lg.field_b;
                    stackOut_101_1 = 33;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    if (gj.field_k) {
                      stackOut_103_0 = (String) (Object) stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      break L24;
                    } else {
                      stackOut_102_0 = (String) (Object) stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_104_0 = (String) (Object) stackIn_104_0;
                    stackOut_104_1 = stackIn_104_1;
                    stackOut_104_2 = stackIn_104_2;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    stackIn_106_2 = stackOut_104_2;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    stackIn_105_2 = stackOut_104_2;
                    if (gj.field_k) {
                      stackOut_106_0 = (String) (Object) stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = stackIn_106_2;
                      stackOut_106_3 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      stackIn_107_2 = stackOut_106_2;
                      stackIn_107_3 = stackOut_106_3;
                      break L25;
                    } else {
                      stackOut_105_0 = (String) (Object) stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = stackIn_105_2;
                      stackOut_105_3 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      stackIn_107_2 = stackOut_105_2;
                      stackIn_107_3 = stackOut_105_3;
                      break L25;
                    }
                  }
                  hm.a(stackIn_107_0, (byte) stackIn_107_1, stackIn_107_2 != 0, stackIn_107_3 != 0);
                  break L22;
                }
                L26: {
                  if (field_v) {
                    int discarded$37 = 4;
                    kj.j();
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null == de.field_a) {
                    de.field_a = fb.c(false);
                    int discarded$38 = 2;
                    cf.field_d = te.j();
                    break L27;
                  } else {
                    break L27;
                  }
                }
                int discarded$39 = 1000;
                hf.a(de.field_a, wb.field_b, cf.field_d);
                og.field_g = null;
                wb.field_b = null;
                am.field_b = null;
                pj.a(127, (java.applet.Applet) this);
                vd.a(99);
                vh.field_n = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (vh.field_n != 10) {
            break L28;
          } else {
            L29: {
              if (wj.field_m == 0) {
                break L29;
              } else {
                int discarded$40 = -32585;
                eg.field_x = qk.a(pj.field_p);
                break L29;
              }
            }
            vh.field_n = 11;
            break L28;
          }
        }
        L30: {
          if (vh.field_n != 11) {
            break L30;
          } else {
            L31: {
              if (null == eg.field_x) {
                break L31;
              } else {
                L32: {
                  if (!eg.field_x.b(-1)) {
                    break L32;
                  } else {
                    if (!eg.field_x.c(7715)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                int discarded$41 = 32;
                j.a(0.0f, ql.a(eg.field_x, mi.field_e, de.field_b), (byte) 105);
                break L30;
              }
            }
            gi.field_b = true;
            vh.field_n = 12;
            break L30;
          }
        }
        L33: {
          if (vh.field_n != 12) {
            break L33;
          } else {
            if (gi.field_b) {
              break L33;
            } else {
              vh.field_n = 13;
              break L33;
            }
          }
        }
        L34: {
          var3 = 81 % ((55 - param0) / 43);
          if (vh.field_n != 13) {
            break L34;
          } else {
            L35: {
              var4 = 1;
              if (sd.field_b != null) {
                L36: {
                  if (!sd.field_b.a(false)) {
                    stackOut_134_0 = 0;
                    stackIn_135_0 = stackOut_134_0;
                    break L36;
                  } else {
                    stackOut_133_0 = 1;
                    stackIn_135_0 = stackOut_133_0;
                    break L36;
                  }
                }
                var4 = stackIn_135_0;
                j.a(sd.field_b.field_h, sd.field_b.field_d, (byte) 106);
                break L35;
              } else {
                break L35;
              }
            }
            if (var4 == 0) {
              break L34;
            } else {
              vh.field_n = 20;
              break L34;
            }
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (!vc.field_a) {
              break L37;
            } else {
              hl.a(tf.field_f, 118);
              ((ph) this).e(99);
              l.a(tf.field_f, -123);
              break L37;
            }
          }
        }
        L38: {
          if (vk.field_w[8]) {
            od.a(192);
            break L38;
          } else {
            break L38;
          }
        }
    }

    private final void f(int param0) {
        vk.field_w[5] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(18, param3);
        if (param1) {
            int discarded$0 = -109;
            this.m();
        }
        if (param2) {
            int discarded$1 = 3;
            this.k();
        }
        if (!(!param4)) {
            int discarded$2 = 18495;
            this.n();
        }
        if (!(!param0)) {
            this.f(-2);
        }
    }

    private final void f() {
        tg.field_b[13] = -1;
        tg.field_b[10] = -1;
        tg.field_b[8] = -2;
        tg.field_b[6] = -2;
        tg.field_b[1] = 16;
        tg.field_b[7] = -1;
        tg.field_b[5] = -1;
        tg.field_b[11] = -1;
        tg.field_b[17] = -1;
        tg.field_b[2] = -2;
        tg.field_b[12] = -1;
        tg.field_b[3] = -1;
        tg.field_b[18] = 1;
        tg.field_b[9] = -1;
        tg.field_b[16] = -1;
        tg.field_b[4] = -1;
    }

    final int a(boolean param0, boolean param1) {
        if (param1) {
            return -18;
        }
        return this.a(true, -1, param0);
    }

    final void c(boolean param0) {
        int var3 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        L0: {
          var3 = OrbDefence.field_D ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((ph) this).field_y = 12;
            break L0;
          }
        }
        L1: {
          if (fe.c((byte) -123)) {
            L2: {
              stackOut_9_0 = this;
              stackOut_9_1 = 0;
              stackOut_9_2 = -1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              if (mg.field_k == null) {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L2;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                break L2;
              }
            }
            int discarded$103 = this.a(stackIn_12_1 != 0, stackIn_12_2, stackIn_12_3 != 0);
            break L1;
          } else {
            if (10 > vh.field_n) {
              break L1;
            } else {
              if (rf.l(-108)) {
                if (hi.field_k != 0) {
                  vi.a(false, of.field_K);
                  break L1;
                } else {
                  int discarded$104 = this.a(false, -1, false);
                  break L1;
                }
              } else {
                int discarded$105 = 0;
                id.b();
                break L1;
              }
            }
          }
        }
    }

    private final int h() {
        int var2 = 0;
        if (((ph) this).field_h) {
          return -1;
        } else {
          int discarded$4 = 1;
          if (sg.c()) {
            if (!fa.field_a) {
              var2 = vc.a(((ph) this).field_z, ((ph) this).field_o, -114, am.b(-70), true, uh.b(4));
              if (var2 != -1) {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (1 != var2) {
                      L1: {
                        if (!pc.field_Y) {
                          ((ph) this).a(111, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      md.b((byte) -111);
                      se.a(kk.field_Y, (byte) -81, var2);
                      fa.field_a = true;
                      lm.field_c = ji.b(-88) + 15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (hi.field_k != 11) {
                    break L2;
                  } else {
                    if (o.field_j == 0) {
                      id.a(false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    public static void g(int param0) {
        int var1 = 0;
        field_x = null;
    }

    protected ph() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[8192];
    }
}
