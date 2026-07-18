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
        Object stackIn_2_0 = null;
        ut stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ut stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            iw.a(-94, param2);
            on.b();
            t.c();
            t.b(on.field_g >> 1, 202);
            param0.a(0, param1, 0, 0, 0, 0, 0, 700);
            if (param3 < -25) {
              ta.e(123);
              stackOut_3_0 = (ut) param2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ut) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("js.PA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
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
            nr.field_e = param4;
            nb.field_b = param7;
            gg.field_Db = param6;
            rc.field_f = param1;
            wo.field_k = param5;
            or.field_c = param3;
            gt.field_t = (bi) (Object) new tb();
            e.field_i = new eb(param2);
            al.field_Ab = new n(gt.field_t, e.field_i);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "js.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + false + ')');
        }
    }

    final static int a(int param0, String param1, boolean param2, boolean param3, String param4, int param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
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
            int stackIn_111_0 = 0;
            int stackIn_113_0 = 0;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            RuntimeException stackIn_116_0 = null;
            StringBuilder stackIn_116_1 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            String stackIn_117_2 = null;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            RuntimeException stackIn_119_0 = null;
            StringBuilder stackIn_119_1 = null;
            RuntimeException stackIn_120_0 = null;
            StringBuilder stackIn_120_1 = null;
            String stackIn_120_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_90_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_110_0 = 0;
            int stackOut_112_0 = 0;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            RuntimeException stackOut_116_0 = null;
            StringBuilder stackOut_116_1 = null;
            String stackOut_116_2 = null;
            RuntimeException stackOut_115_0 = null;
            StringBuilder stackOut_115_1 = null;
            String stackOut_115_2 = null;
            RuntimeException stackOut_117_0 = null;
            StringBuilder stackOut_117_1 = null;
            RuntimeException stackOut_119_0 = null;
            StringBuilder stackOut_119_1 = null;
            String stackOut_119_2 = null;
            RuntimeException stackOut_118_0 = null;
            StringBuilder stackOut_118_1 = null;
            String stackOut_118_2 = null;
            var9 = Kickabout.field_G;
            try {
              L0: {
                L1: {
                  if (op.field_y == null) {
                    if (!qo.a(param3, (byte) -7)) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
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
                        var10 = null;
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
                              stackOut_31_0 = var6_int;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
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
                              stackOut_50_0 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              break L12;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L12;
                            }
                          }
                          L13: {
                            kb.field_C = stackIn_51_0 != 0;
                            if (-1 == (4 & var7)) {
                              stackOut_53_0 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              break L13;
                            } else {
                              stackOut_52_0 = 1;
                              stackIn_54_0 = stackOut_52_0;
                              break L13;
                            }
                          }
                          L14: {
                            fc.field_f = stackIn_54_0 != 0;
                            if (-1 == (var7 & 8)) {
                              stackOut_56_0 = 0;
                              stackIn_57_0 = stackOut_56_0;
                              break L14;
                            } else {
                              stackOut_55_0 = 1;
                              stackIn_57_0 = stackOut_55_0;
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
                              stackOut_61_0 = 0;
                              stackIn_62_0 = stackOut_61_0;
                              break L16;
                            } else {
                              stackOut_60_0 = 1;
                              stackIn_62_0 = stackOut_60_0;
                              break L16;
                            }
                          }
                          ib.field_E = stackIn_62_0 != 0;
                          if (it.field_n) {
                            int discarded$6 = un.field_e.h((byte) -118);
                            vp.field_h = un.field_e.h((byte) -124);
                            int discarded$7 = un.field_e.k(4);
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
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L18;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L18;
                            }
                          }
                          ib.field_E = stackIn_43_0 != 0;
                          if (it.field_n) {
                            int discarded$8 = un.field_e.h((byte) -118);
                            vp.field_h = un.field_e.h((byte) -124);
                            int discarded$9 = un.field_e.k(4);
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
                        var12 = (CharSequence) (Object) ow.field_e;
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
                          if (eq.field_d > 0) {
                            break L23;
                          } else {
                            if (!fc.field_f) {
                              try {
                                L24: {
                                  Object discarded$10 = mm.a(30858, "unzap", so.a(-110));
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
                            Object discarded$11 = mm.a(new Object[1], so.a(-122), "zap", 25449);
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
                          stackOut_90_0 = so.field_b;
                          stackIn_91_0 = stackOut_90_0;
                          return stackIn_91_0;
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
                        if (so.field_b != 7) {
                          break L31;
                        } else {
                          if (vu.field_Db) {
                            break L31;
                          } else {
                            vu.field_Db = true;
                            stackOut_96_0 = -1;
                            stackIn_97_0 = stackOut_96_0;
                            return stackIn_97_0;
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
                      stackOut_101_0 = so.field_b;
                      stackIn_102_0 = stackOut_101_0;
                      return stackIn_102_0;
                    }
                  }
                }
                L33: {
                  field_d = null;
                  if (op.field_y == null) {
                    if (vu.field_Db) {
                      L34: {
                        if (30000L >= aa.c(29680)) {
                          gd.field_b = ic.field_e;
                          break L34;
                        } else {
                          gd.field_b = md.field_h;
                          break L34;
                        }
                      }
                      vu.field_Db = false;
                      stackOut_110_0 = 3;
                      stackIn_111_0 = stackOut_110_0;
                      return stackIn_111_0;
                    } else {
                      var6_int = rl.field_o;
                      rl.field_o = pn.field_y;
                      pn.field_y = var6_int;
                      vu.field_Db = true;
                      break L33;
                    }
                  } else {
                    break L33;
                  }
                }
                stackOut_112_0 = -1;
                stackIn_113_0 = stackOut_112_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L35: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_114_0 = (RuntimeException) var6;
                stackOut_114_1 = new StringBuilder().append("js.SA(").append(0).append(',');
                stackIn_116_0 = stackOut_114_0;
                stackIn_116_1 = stackOut_114_1;
                stackIn_115_0 = stackOut_114_0;
                stackIn_115_1 = stackOut_114_1;
                if (param1 == null) {
                  stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
                  stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
                  stackOut_116_2 = "null";
                  stackIn_117_0 = stackOut_116_0;
                  stackIn_117_1 = stackOut_116_1;
                  stackIn_117_2 = stackOut_116_2;
                  break L35;
                } else {
                  stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
                  stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                  stackOut_115_2 = "{...}";
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  stackIn_117_2 = stackOut_115_2;
                  break L35;
                }
              }
              L36: {
                stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
                stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_119_0 = stackOut_117_0;
                stackIn_119_1 = stackOut_117_1;
                stackIn_118_0 = stackOut_117_0;
                stackIn_118_1 = stackOut_117_1;
                if (param4 == null) {
                  stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
                  stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
                  stackOut_119_2 = "null";
                  stackIn_120_0 = stackOut_119_0;
                  stackIn_120_1 = stackOut_119_1;
                  stackIn_120_2 = stackOut_119_2;
                  break L36;
                } else {
                  stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
                  stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
                  stackOut_118_2 = "{...}";
                  stackIn_120_0 = stackOut_118_0;
                  stackIn_120_1 = stackOut_118_1;
                  stackIn_120_2 = stackOut_118_2;
                  break L36;
                }
              }
              throw nb.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + ',' + param5 + ')');
            }
            return stackIn_113_0;
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
        ((js) this).field_c = param0;
        ((js) this).field_b = ((js) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
