/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class js {
    static int field_e;
    int field_c;
    static String field_f;
    int field_b;
    static tf field_d;
    static ut field_a;

    final static ut a(eg param0, int param1, ut param2, int param3) {
        RuntimeException var4 = null;
        ut stackIn_2_0 = null;
        ut stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            iw.a(-94, param2);
            on.b();
            t.c();
            t.b(on.field_g >> 581852129, 202);
            param0.a(0, param1, 0, 0, 0, 0, 0, 700);
            if (param3 < -25) {
              ta.e(123);
              stackIn_4_0 = (ut) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ut) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("js.PA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void a(int param0, boolean param1);

    abstract boolean a(int param0, int param1, char param2);

    abstract void a(byte param0, boolean param1);

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 125) {
            return;
        }
        field_d = null;
        field_f = null;
    }

    final static void a(String param0, int param1, bu param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        try {
            hf.field_e = param2;
            tk.field_yb = param0;
            if (param8) {
                js.a((byte) 44);
            }
            nr.field_e = param4;
            nb.field_b = param7;
            gg.field_Db = param6;
            rc.field_f = param1;
            wo.field_k = param5;
            or.field_c = param3;
            gt.field_t = (bi) ((Object) new tb());
            e.field_i = new eb(param2);
            al.field_Ab = new n(gt.field_t, e.field_i);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "js.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static int a(int param0, String param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            int stackIn_6_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_57_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_113_0 = 0;
            int stackIn_115_0 = 0;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            RuntimeException stackIn_119_0 = null;
            StringBuilder stackIn_119_1 = null;
            String stackIn_119_2 = null;
            StringBuilder stackIn_121_1 = null;
            StringBuilder stackIn_122_1 = null;
            String stackIn_122_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            RuntimeException var6 = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            var9 = Kickabout.field_G;
            try {
              L0: {
                L1: {
                  if (op.field_y == null) {
                    if (!qo.a(param3, (byte) -7)) {
                      stackIn_6_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (sd.field_d == un.field_c) {
                    L3: {
                      if (param3) {
                        var10 = (String) null;
                        vq.field_h = ti.a(param4, wq.field_d, (byte) 30, false, (String) null);
                        break L3;
                      } else {
                        vq.field_h = wp.a(-111, param4, false, param1);
                        break L3;
                      }
                    }
                    or.field_d.field_n = 0;
                    or.field_d.a(108, 14);
                    or.field_d.a(124, vq.field_h.a((byte) -104).field_a);
                    c.a(-1, false);
                    un.field_c = uk.field_c;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (un.field_c == uk.field_c) {
                    if (!uj.a((byte) -98, 1)) {
                      break L4;
                    } else {
                      L5: {
                        var6_int = un.field_e.h((byte) -123);
                        if (var6_int == 0) {
                          un.field_c = tl.field_c;
                          break L5;
                        } else {
                          ms.field_b = -1;
                          so.field_b = var6_int;
                          un.field_c = wv.field_fb;
                          break L5;
                        }
                      }
                      un.field_e.field_n = 0;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (un.field_c != tl.field_c) {
                    break L6;
                  } else {
                    if (!uj.a((byte) 115, 8)) {
                      break L6;
                    } else {
                      ld.field_c = un.field_e.i((byte) -124);
                      un.field_e.field_n = 0;
                      nc.a(param2, param3, vq.field_h, -16161, param5);
                      un.field_c = gr.field_c;
                      break L6;
                    }
                  }
                }
                L7: {
                  if (un.field_c == gr.field_c) {
                    if (uj.a((byte) -127, 1)) {
                      L8: {
                        var6_int = un.field_e.h((byte) -105);
                        so.field_b = var6_int;
                        lh.field_A = null;
                        un.field_e.field_n = 0;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (1 == var6_int) {
                            break L8;
                          } else {
                            if (8 == var6_int) {
                              lr.b((byte) -116);
                              vu.field_Db = false;
                              stackIn_32_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              ms.field_b = -1;
                              un.field_c = wv.field_fb;
                              break L7;
                            }
                          }
                        }
                      }
                      un.field_c = bm.field_H;
                      ms.field_b = -1;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (bm.field_H != un.field_c) {
                    break L9;
                  } else {
                    if (!ps.a(180)) {
                      break L9;
                    } else {
                      L10: {
                        wq.field_d = un.field_e.i((byte) -124);
                        vl.field_e = param4;
                        tk.field_Ib = un.field_e.h((byte) -118);
                        bl.field_c = un.field_e.h((byte) -112);
                        eq.field_d = un.field_e.a((byte) 81);
                        var11 = un.field_e.a(true);
                        var7 = un.field_e.h((byte) -106);
                        if ((1 & var7) != 0) {
                          um.a((byte) 114);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (!param3) {
                          L12: {
                            if (0 == (2 & var7)) {
                              stackIn_51_0 = 0;
                              break L12;
                            } else {
                              stackIn_51_0 = 1;
                              break L12;
                            }
                          }
                          L13: {
                            kb.field_C = stackIn_51_0 != 0;
                            if (-1 == (4 & var7 ^ -1)) {
                              stackIn_54_0 = 0;
                              break L13;
                            } else {
                              stackIn_54_0 = 1;
                              break L13;
                            }
                          }
                          L14: {
                            fc.field_f = stackIn_54_0 != 0;
                            if (-1 == (var7 & 8 ^ -1)) {
                              stackIn_57_0 = 0;
                              break L14;
                            } else {
                              stackIn_57_0 = 1;
                              break L14;
                            }
                          }
                          L15: {
                            iw.field_l = stackIn_57_0 != 0;
                            if (!iw.field_l) {
                              break L15;
                            } else {
                              kb.field_C = true;
                              break L15;
                            }
                          }
                          L16: {
                            if ((16 & var7) == 0) {
                              stackIn_62_0 = 0;
                              break L16;
                            } else {
                              stackIn_62_0 = 1;
                              break L16;
                            }
                          }
                          ib.field_E = stackIn_62_0 != 0;
                          if (it.field_n) {
                            un.field_e.h((byte) -118);
                            vp.field_h = un.field_e.h((byte) -124);
                            un.field_e.k(4);
                            field_e = un.field_e.a((byte) 81);
                            nt.field_yb = new byte[field_e];
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= field_e) {
                                break L11;
                              } else {
                                nt.field_yb[var8] = un.field_e.j((byte) -114);
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            break L11;
                          }
                        } else {
                          L18: {
                            if ((16 & var7) == 0) {
                              stackIn_43_0 = 0;
                              break L18;
                            } else {
                              stackIn_43_0 = 1;
                              break L18;
                            }
                          }
                          ib.field_E = stackIn_43_0 != 0;
                          if (it.field_n) {
                            un.field_e.h((byte) -118);
                            vp.field_h = un.field_e.h((byte) -124);
                            un.field_e.k(4);
                            field_e = un.field_e.a((byte) 81);
                            nt.field_yb = new byte[field_e];
                            var8 = 0;
                            L19: while (true) {
                              if (var8 >= field_e) {
                                break L11;
                              } else {
                                nt.field_yb[var8] = un.field_e.j((byte) -114);
                                var8++;
                                continue L19;
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                      L20: {
                        ow.field_e = un.field_e.a(8);
                        var12 = (CharSequence) ((Object) ow.field_e);
                        kd.field_w = mo.a(0, var12);
                        rl.field_n = un.field_e.h((byte) -128);
                        un.field_c = jn.field_rb;
                        if (vq.field_h.a((byte) -109) != qq.field_K) {
                          if (vq.field_h.a((byte) -115) == ap.field_w) {
                            ae.field_I.a(-122, so.a(-115));
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          pb.field_F.a(-123, so.a(36));
                          break L20;
                        }
                      }
                      L21: {
                        vu.field_Db = false;
                        if (var11 != null) {
                          mp.a(so.a(47), true, var11);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        L23: {
                          if ((eq.field_d ^ -1) < -1) {
                            break L23;
                          } else {
                            if (!fc.field_f) {
                              try {
                                L24: {
                                  mm.a(30858, "unzap", so.a(-110));
                                  break L24;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L25: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L25;
                                }
                              }
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        try {
                          L26: {
                            mm.a(new Object[]{bg.a((byte) 112, wq.field_d)}, so.a(param0 + -122), "zap", param0 + 25449);
                            break L26;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L27: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L27;
                          }
                        }
                        break L22;
                      }
                      L28: {
                        if (eq.field_d > 0) {
                          fu.field_c = true;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      or.field_d.a((byte) 117, sn.field_f);
                      var8 = 0;
                      L29: while (true) {
                        if (var8 >= 4) {
                          un.field_e.a((byte) 125, sn.field_f);
                          stackIn_91_0 = so.field_b;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          sn.field_f[var8] = sn.field_f[var8] + 50;
                          var8++;
                          continue L29;
                        }
                      }
                    }
                  }
                }
                L30: {
                  if (wv.field_fb != un.field_c) {
                    break L30;
                  } else {
                    if (!ps.a(180)) {
                      break L30;
                    } else {
                      L31: {
                        lr.b((byte) -116);
                        if (-8 != (so.field_b ^ -1)) {
                          break L31;
                        } else {
                          if (vu.field_Db) {
                            break L31;
                          } else {
                            vu.field_Db = true;
                            stackIn_97_0 = -1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      L32: {
                        if (7 == so.field_b) {
                          so.field_b = 3;
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      gd.field_b = un.field_e.a(4);
                      vu.field_Db = false;
                      stackIn_102_0 = so.field_b;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
                L33: {
                  if (param0 == 0) {
                    break L33;
                  } else {
                    field_d = (tf) null;
                    break L33;
                  }
                }
                L34: {
                  if (op.field_y == null) {
                    if (vu.field_Db) {
                      L35: {
                        if (30000L >= aa.c(29680)) {
                          gd.field_b = ic.field_e;
                          break L35;
                        } else {
                          gd.field_b = md.field_h;
                          break L35;
                        }
                      }
                      vu.field_Db = false;
                      stackIn_113_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      var6_int = rl.field_o;
                      rl.field_o = pn.field_y;
                      pn.field_y = var6_int;
                      vu.field_Db = true;
                      break L34;
                    }
                  } else {
                    break L34;
                  }
                }
                stackIn_115_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L36: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_118_0 = (RuntimeException) (var6);

                stackIn_118_1 = new StringBuilder().append("js.SA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_118_0);
                  stackIn_119_1 = (StringBuilder) ((Object) stackIn_118_1);
                  stackIn_119_2 = "null";
                  break L36;
                } else {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_118_0);
                  stackIn_119_1 = (StringBuilder) ((Object) stackIn_118_1);
                  stackIn_119_2 = "{...}";
                  break L36;
                }
              }
              L37: {


                stackIn_121_1 = ((StringBuilder) (Object) stackIn_119_1).append(stackIn_119_2).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_119_0);
                  stackIn_122_1 = (StringBuilder) ((Object) stackIn_121_1);
                  stackIn_122_2 = "null";
                  break L37;
                } else {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_119_0);
                  stackIn_122_1 = (StringBuilder) ((Object) stackIn_121_1);
                  stackIn_122_2 = "{...}";
                  break L37;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_119_0), stackIn_122_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_6_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_32_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_91_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_97_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_102_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_113_0;
                      } else {
                        return stackIn_115_0;
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, boolean param1, int param2, js param3);

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 20338) {
                js.a((byte) 126);
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(qr.a(param1, var2, 3), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    js(int param0) {
        this.field_c = param0;
        this.field_b = this.field_c;
    }

    static {
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
