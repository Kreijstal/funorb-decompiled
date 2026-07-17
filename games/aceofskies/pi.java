/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends mi {
    static qr field_x;
    private sp field_w;
    private int field_y;

    final boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == -42) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              String discarded$2 = ((pi) this).c((byte) 100);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pi.U(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    public static void a(int param0) {
        if (param0 != 4096) {
            field_x = null;
        }
        field_x = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        pt var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        ll var13 = null;
        ll var14 = null;
        ll var15 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        super.a((byte) 125, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            var5 = (((pi) this).field_q >> 1) + (param3 - -((pi) this).field_p);
            var6 = (((pi) this).field_n >> 1) + param2 - -((pi) this).field_h;
            var8 = ((pi) this).field_w.b(true);
            if (param0 >= 64) {
              break L0;
            } else {
              var12 = null;
              boolean discarded$1 = ((pi) this).a((ea) null, (byte) -125);
              break L0;
            }
          }
          L1: {
            L2: {
              if (jc.field_Pc == var8) {
                break L2;
              } else {
                if (ce.field_t == var8) {
                  break L2;
                } else {
                  if (var8 != bt.field_a) {
                    if (fd.field_a != var8) {
                      break L1;
                    } else {
                      var14 = gu.field_c[1];
                      var14.d(-(var14.field_r >> 1) + var5, var6 - (var14.field_n >> 1), 256);
                      break L1;
                    }
                  } else {
                    var13 = gu.field_c[2];
                    var13.d(var5 - (var13.field_r >> 1), -(var13.field_n >> 1) + var6, 256);
                    break L1;
                  }
                }
              }
            }
            L3: {
              L4: {
                var15 = gu.field_c[0];
                var9 = var15.field_v << 1;
                var10 = var15.field_q << 1;
                if (ms.field_c == null) {
                  break L4;
                } else {
                  if (ms.field_c.field_r < var9) {
                    break L4;
                  } else {
                    if (var10 > ms.field_c.field_n) {
                      break L4;
                    } else {
                      cm.a(ms.field_c, -14492);
                      vp.a();
                      break L3;
                    }
                  }
                }
              }
              ms.field_c = new ll(var9, var10);
              cm.a(ms.field_c, -14492);
              break L3;
            }
            var15.a(112, 144, var15.field_v << 4, var15.field_q << 4, -((pi) this).field_y << 10, 4096);
            sl.c(2765);
            ms.field_c.d(var5 + -var15.field_v, -var15.field_q + var6, 256);
            break L1;
          }
          return;
        }
    }

    final void a(byte param0, ea param1, int param2, int param3) {
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
              ((pi) this).field_y = ((pi) this).field_y + 1;
              super.a((byte) 67, param1, param2, param3);
              if (param0 > 13) {
                break L1;
              } else {
                pi.a(-28);
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
            stackOut_3_1 = new StringBuilder().append("pi.S(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final String c(byte param0) {
        if (((pi) this).field_g) {
            return ((pi) this).field_w.a(true);
        }
        if (param0 <= -41) {
            return null;
        }
        ((pi) this).field_y = 87;
        return null;
    }

    final static int a(int param0, String param1, int param2, boolean param3, String param4, boolean param5) {
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
            int stackIn_5_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_70_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_95_0 = 0;
            RuntimeException stackIn_97_0 = null;
            StringBuilder stackIn_97_1 = null;
            RuntimeException stackIn_98_0 = null;
            StringBuilder stackIn_98_1 = null;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            String stackIn_99_2 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            String stackIn_102_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_69_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_94_0 = 0;
            RuntimeException stackOut_96_0 = null;
            StringBuilder stackOut_96_1 = null;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            String stackOut_98_2 = null;
            RuntimeException stackOut_97_0 = null;
            StringBuilder stackOut_97_1 = null;
            String stackOut_97_2 = null;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            String stackOut_101_2 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
            var9 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ft.field_l != null) {
                    break L1;
                  } else {
                    if (!fp.a((byte) 82, param5)) {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (qa.field_b != ca.field_f) {
                    break L2;
                  } else {
                    L3: {
                      if (!param5) {
                        dq.field_a = op.a(param4, false, param1, false);
                        break L3;
                      } else {
                        var10 = null;
                        dq.field_a = wb.a(false, (String) null, param4, as.field_b, true);
                        break L3;
                      }
                    }
                    q.field_p.field_g = 0;
                    q.field_p.b(param2 + -1336879960, 14);
                    q.field_p.b(-1336879960, dq.field_a.a(param2 ^ -69).field_c);
                    fr.a(param2 + -21, -1);
                    ca.field_f = pg.field_a;
                    break L2;
                  }
                }
                L4: {
                  if (ca.field_f != pg.field_a) {
                    break L4;
                  } else {
                    if (wo.a(1, true)) {
                      L5: {
                        var6_int = nm.field_c.g(117);
                        if (0 == var6_int) {
                          ca.field_f = qo.field_a;
                          break L5;
                        } else {
                          ca.field_f = aj.field_u;
                          qs.field_b = var6_int;
                          ag.field_s = -1;
                          break L5;
                        }
                      }
                      nm.field_c.field_g = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (qo.field_a == ca.field_f) {
                    if (!wo.a(8, true)) {
                      break L6;
                    } else {
                      of.field_a = nm.field_c.h((byte) 90);
                      nm.field_c.field_g = 0;
                      AceOfSkies.a(param0, param5, dq.field_a, param3, -12209);
                      ca.field_f = he.field_o;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (ca.field_f == he.field_o) {
                    if (!wo.a(1, true)) {
                      break L7;
                    } else {
                      L8: {
                        var6_int = nm.field_c.g(param2 ^ 63);
                        fb.field_b = null;
                        qs.field_b = var6_int;
                        nm.field_c.field_g = 0;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (var6_int == 1) {
                            break L8;
                          } else {
                            if (8 != var6_int) {
                              ca.field_f = aj.field_u;
                              ag.field_s = -1;
                              break L7;
                            } else {
                              te.b(true);
                              ld.field_d = false;
                              stackOut_28_0 = var6_int;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            }
                          }
                        }
                      }
                      ca.field_f = vc.field_a;
                      ag.field_s = -1;
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (vc.field_a != ca.field_f) {
                    break L9;
                  } else {
                    if (!rm.a(0)) {
                      break L9;
                    } else {
                      L10: {
                        as.field_b = nm.field_c.h((byte) -87);
                        ln.field_d = nm.field_c.g(37);
                        int discarded$6 = nm.field_c.g(param2 ^ 103);
                        qr.field_a = nm.field_c.i((byte) 0);
                        var11 = nm.field_c.e((byte) -122);
                        var7 = nm.field_c.g(118);
                        if (0 != (1 & var7)) {
                          eu.b(param2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (param5) {
                          break L11;
                        } else {
                          L12: {
                            if ((var7 & 8) == 0) {
                              stackOut_40_0 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              break L12;
                            } else {
                              stackOut_39_0 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              break L12;
                            }
                          }
                          L13: {
                            um.field_j = stackIn_41_0 != 0;
                            if ((var7 & 4) == 0) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L13;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L13;
                            }
                          }
                          g.field_k = stackIn_44_0 != 0;
                          if (!um.field_j) {
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L14: {
                        if (!gl.field_a) {
                          break L14;
                        } else {
                          int discarded$7 = nm.field_c.g(-83);
                          int discarded$8 = nm.field_c.g(105);
                          int discarded$9 = nm.field_c.a((byte) 123);
                          ag.field_r = nm.field_c.i((byte) 0);
                          nc.field_c = new byte[ag.field_r];
                          var8 = 0;
                          L15: while (true) {
                            if (ag.field_r <= var8) {
                              break L14;
                            } else {
                              nc.field_c[var8] = nm.field_c.d(0);
                              var8++;
                              continue L15;
                            }
                          }
                        }
                      }
                      L16: {
                        fj.field_a = nm.field_c.h(-17883);
                        var12 = (CharSequence) (Object) fj.field_a;
                        cf.field_h = vu.a(param2 ^ 127, var12);
                        un.field_c = nm.field_c.g(param2 ^ -95);
                        ca.field_f = wq.field_e;
                        if (dq.field_a.a(-78) == jd.field_a) {
                          ef.field_k.a(bm.m(param2 + 113), (byte) 125);
                          break L16;
                        } else {
                          if (dq.field_a.a(-87) != ds.field_e) {
                            break L16;
                          } else {
                            lp.field_f.a(bm.m(111), (byte) 8);
                            break L16;
                          }
                        }
                      }
                      L17: {
                        ld.field_d = false;
                        if (var11 == null) {
                          break L17;
                        } else {
                          sf.a((byte) -122, bm.m(123), var11);
                          break L17;
                        }
                      }
                      L18: {
                        L19: {
                          if (qr.field_a > 0) {
                            break L19;
                          } else {
                            if (g.field_k) {
                              break L19;
                            } else {
                              try {
                                L20: {
                                  Object discarded$10 = fe.a("unzap", (byte) -108, bm.m(115));
                                  break L20;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L21: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L21;
                                }
                              }
                              break L18;
                            }
                          }
                        }
                        try {
                          L22: {
                            Object discarded$11 = fe.a("zap", -15201, new Object[1], bm.m(119));
                            break L22;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L23: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L23;
                          }
                        }
                        break L18;
                      }
                      L24: {
                        if (qr.field_a <= 0) {
                          break L24;
                        } else {
                          te.field_h = true;
                          break L24;
                        }
                      }
                      q.field_p.a(true, bm.field_w);
                      var8 = 0;
                      L25: while (true) {
                        if (var8 >= 4) {
                          nm.field_c.a(true, bm.field_w);
                          stackOut_69_0 = qs.field_b;
                          stackIn_70_0 = stackOut_69_0;
                          return stackIn_70_0;
                        } else {
                          bm.field_w[var8] = bm.field_w[var8] + 50;
                          var8++;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                L26: {
                  if (param2 == 0) {
                    break L26;
                  } else {
                    field_x = null;
                    break L26;
                  }
                }
                L27: {
                  if (ca.field_f != aj.field_u) {
                    break L27;
                  } else {
                    if (!rm.a(0)) {
                      break L27;
                    } else {
                      L28: {
                        te.b(true);
                        if (qs.field_b != 7) {
                          break L28;
                        } else {
                          if (!ld.field_d) {
                            ld.field_d = true;
                            stackOut_83_0 = -1;
                            stackIn_84_0 = stackOut_83_0;
                            return stackIn_84_0;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if (7 == qs.field_b) {
                          qs.field_b = 3;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      rp.field_m = nm.field_c.h(-17883);
                      ld.field_d = false;
                      stackOut_81_0 = qs.field_b;
                      stackIn_82_0 = stackOut_81_0;
                      return stackIn_82_0;
                    }
                  }
                }
                L30: {
                  if (null == ft.field_l) {
                    if (ld.field_d) {
                      L31: {
                        if (30000L < gm.g(-1)) {
                          rp.field_m = rm.field_c;
                          break L31;
                        } else {
                          rp.field_m = jf.field_b;
                          break L31;
                        }
                      }
                      ld.field_d = false;
                      stackOut_92_0 = 3;
                      stackIn_93_0 = stackOut_92_0;
                      return stackIn_93_0;
                    } else {
                      var6_int = sg.field_b;
                      sg.field_b = ca.field_h;
                      ca.field_h = var6_int;
                      ld.field_d = true;
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                stackOut_94_0 = -1;
                stackIn_95_0 = stackOut_94_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_96_0 = (RuntimeException) var6;
                stackOut_96_1 = new StringBuilder().append("pi.V(").append(param0).append(44);
                stackIn_98_0 = stackOut_96_0;
                stackIn_98_1 = stackOut_96_1;
                stackIn_97_0 = stackOut_96_0;
                stackIn_97_1 = stackOut_96_1;
                if (param1 == null) {
                  stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
                  stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
                  stackOut_98_2 = "null";
                  stackIn_99_0 = stackOut_98_0;
                  stackIn_99_1 = stackOut_98_1;
                  stackIn_99_2 = stackOut_98_2;
                  break L32;
                } else {
                  stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                  stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                  stackOut_97_2 = "{...}";
                  stackIn_99_0 = stackOut_97_0;
                  stackIn_99_1 = stackOut_97_1;
                  stackIn_99_2 = stackOut_97_2;
                  break L32;
                }
              }
              L33: {
                stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                stackOut_99_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_101_0 = stackOut_99_0;
                stackIn_101_1 = stackOut_99_1;
                stackIn_100_0 = stackOut_99_0;
                stackIn_100_1 = stackOut_99_1;
                if (param4 == null) {
                  stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
                  stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
                  stackOut_101_2 = "null";
                  stackIn_102_0 = stackOut_101_0;
                  stackIn_102_1 = stackOut_101_1;
                  stackIn_102_2 = stackOut_101_2;
                  break L33;
                } else {
                  stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                  stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
                  stackOut_100_2 = "{...}";
                  stackIn_102_0 = stackOut_100_0;
                  stackIn_102_1 = stackOut_100_1;
                  stackIn_102_2 = stackOut_100_2;
                  break L33;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + 44 + param5 + 41);
            }
            return stackIn_95_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    pi(sp param0) {
        try {
            ((pi) this).field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new qr();
    }
}
