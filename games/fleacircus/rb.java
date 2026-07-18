/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends gj implements da {
    private bb field_I;
    private bb field_J;
    static int field_H;
    static dd field_G;
    private bb field_F;

    final static void a(int param0, int param1, byte param2) {
        af.field_b = param0;
        vc.field_f = param1;
        if (param2 < 61) {
            rb.a(-16, 15, (byte) 71);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 248) {
                break L1;
              } else {
                rb.a(-65, -100, (byte) -84);
                break L1;
              }
            }
            L2: {
              if (param4 != ((rb) this).field_F) {
                if (param4 == ((rb) this).field_J) {
                  oh.d(false);
                  break L2;
                } else {
                  if (((rb) this).field_I != param4) {
                    break L2;
                  } else {
                    ak.a(65);
                    break L2;
                  }
                }
              } else {
                na.a((byte) -81);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("rb.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static int a(boolean param0, String param1, boolean param2, String param3, int param4, int param5) {
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
            int stackIn_4_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_98_0 = 0;
            int stackIn_100_0 = 0;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            String stackIn_104_2 = null;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            String stackIn_107_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_89_0 = 0;
            int stackOut_97_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_77_0 = 0;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            String stackOut_103_2 = null;
            RuntimeException stackOut_102_0 = null;
            StringBuilder stackOut_102_1 = null;
            String stackOut_102_2 = null;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            String stackOut_105_2 = null;
            var9 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != sg.field_h) {
                    break L1;
                  } else {
                    if (id.a(false, param2)) {
                      break L1;
                    } else {
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
                      return stackIn_4_0;
                    }
                  }
                }
                L2: {
                  if (rh.field_k == d.field_O) {
                    L3: {
                      if (!param2) {
                        cf.field_c = lk.a(param1, false, (byte) -35, param3);
                        break L3;
                      } else {
                        var10 = null;
                        cf.field_c = r.a(false, aj.field_w, (byte) 84, (String) null, param1);
                        break L3;
                      }
                    }
                    ud.field_b.field_i = 0;
                    ud.field_b.a(-11, 14);
                    ud.field_b.a(-11, cf.field_c.a(true).field_c);
                    dk.b((byte) 41, -1);
                    rh.field_k = je.field_P;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (rh.field_k != je.field_P) {
                    break L4;
                  } else {
                    if (gi.a(1, true)) {
                      L5: {
                        var6_int = ae.field_a.e(false);
                        if (var6_int == 0) {
                          rh.field_k = ef.field_h;
                          break L5;
                        } else {
                          rh.field_k = pi.field_g;
                          be.field_a = var6_int;
                          pd.field_l = -1;
                          break L5;
                        }
                      }
                      ae.field_a.field_i = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (ef.field_h != rh.field_k) {
                    break L6;
                  } else {
                    if (!gi.a(8, true)) {
                      break L6;
                    } else {
                      ug.field_a = ae.field_a.f(-71);
                      ae.field_a.field_i = 0;
                      wd.a(param2, -120, cf.field_c, param4, param0);
                      rh.field_k = dl.field_w;
                      break L6;
                    }
                  }
                }
                L7: {
                  if (dl.field_w == rh.field_k) {
                    if (gi.a(1, true)) {
                      L8: {
                        var6_int = ae.field_a.e(false);
                        be.field_a = var6_int;
                        ae.field_a.field_i = 0;
                        wc.field_p = null;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (var6_int != 1) {
                            if (var6_int == 8) {
                              k.c(-28354);
                              aa.field_q = false;
                              stackOut_31_0 = var6_int;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            } else {
                              rh.field_k = pi.field_g;
                              pd.field_l = -1;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      pd.field_l = -1;
                      rh.field_k = ll.field_r;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (ll.field_r == rh.field_k) {
                    if (!gf.b(-128)) {
                      break L9;
                    } else {
                      L10: {
                        aj.field_w = ae.field_a.f(-109);
                        qe.field_k = ae.field_a.e(false);
                        int discarded$6 = ae.field_a.e(false);
                        wc.field_q = ae.field_a.d((byte) -116);
                        var11 = ae.field_a.a((byte) -115);
                        var7 = ae.field_a.e(false);
                        if ((var7 & 1) != 0) {
                          f.d((byte) -37);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (!param2) {
                          L12: {
                            if ((var7 & 4) == -1) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L12;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L12;
                            }
                          }
                          L13: {
                            ed.field_a = stackIn_44_0 != 0;
                            if (-1 == (var7 & 8)) {
                              stackOut_46_0 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              break L13;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              break L13;
                            }
                          }
                          ee.field_i = stackIn_47_0 != 0;
                          if (!ee.field_i) {
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      L14: {
                        if (!bk.field_e) {
                          break L14;
                        } else {
                          int discarded$7 = ae.field_a.e(false);
                          int discarded$8 = ae.field_a.e(false);
                          int discarded$9 = ae.field_a.c((byte) 123);
                          ge.field_g = ae.field_a.d((byte) -117);
                          gi.field_c = new byte[ge.field_g];
                          var8 = 0;
                          L15: while (true) {
                            if (ge.field_g <= var8) {
                              break L14;
                            } else {
                              gi.field_c[var8] = ae.field_a.i(-127);
                              var8++;
                              continue L15;
                            }
                          }
                        }
                      }
                      L16: {
                        b.field_e = ae.field_a.h(0);
                        var12 = (CharSequence) (Object) b.field_e;
                        ma.field_a = uk.a(92, var12);
                        nb.field_h = ae.field_a.e(false);
                        rh.field_k = fh.field_b;
                        if (cf.field_c.a(true) == wa.field_g) {
                          ml.field_F.a(true, rl.a((byte) -111));
                          break L16;
                        } else {
                          if (cf.field_c.a(true) == mk.field_i) {
                            wd.field_b.a(true, rl.a((byte) -116));
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        aa.field_q = false;
                        if (var11 != null) {
                          ea.a(376, rl.a((byte) -120), var11);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        L19: {
                          if (0 < wc.field_q) {
                            break L19;
                          } else {
                            if (ed.field_a) {
                              break L19;
                            } else {
                              try {
                                L20: {
                                  Object discarded$10 = eb.a("unzap", rl.a((byte) -65), -250);
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
                            Object discarded$11 = eb.a("zap", new Object[1], -11745, rl.a((byte) -126));
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
                        if (0 >= wc.field_q) {
                          break L24;
                        } else {
                          va.field_m = true;
                          break L24;
                        }
                      }
                      ud.field_b.a(ue.field_a, (byte) 12);
                      var8 = 0;
                      L25: while (true) {
                        if (4 <= var8) {
                          ae.field_a.a(ue.field_a, (byte) 12);
                          stackOut_74_0 = be.field_a;
                          stackIn_75_0 = stackOut_74_0;
                          return stackIn_75_0;
                        } else {
                          ue.field_a[var8] = ue.field_a[var8] + 50;
                          var8++;
                          continue L25;
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                if (param5 < -19) {
                  L26: {
                    if (pi.field_g == rh.field_k) {
                      if (!gf.b(115)) {
                        break L26;
                      } else {
                        L27: {
                          k.c(-28354);
                          if (7 != be.field_a) {
                            break L27;
                          } else {
                            if (aa.field_q) {
                              break L27;
                            } else {
                              aa.field_q = true;
                              stackOut_84_0 = -1;
                              stackIn_85_0 = stackOut_84_0;
                              return stackIn_85_0;
                            }
                          }
                        }
                        L28: {
                          if (be.field_a == 7) {
                            be.field_a = 3;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        fh.field_a = ae.field_a.h(0);
                        aa.field_q = false;
                        stackOut_89_0 = be.field_a;
                        stackIn_90_0 = stackOut_89_0;
                        return stackIn_90_0;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L29: {
                    if (sg.field_h != null) {
                      break L29;
                    } else {
                      if (aa.field_q) {
                        L30: {
                          if (h.b(102) <= 30000L) {
                            fh.field_a = jc.field_d;
                            break L30;
                          } else {
                            fh.field_a = ok.field_B;
                            break L30;
                          }
                        }
                        aa.field_q = false;
                        stackOut_97_0 = 3;
                        stackIn_98_0 = stackOut_97_0;
                        return stackIn_98_0;
                      } else {
                        var6_int = be.field_b;
                        be.field_b = ab.field_d;
                        ab.field_d = var6_int;
                        aa.field_q = true;
                        break L29;
                      }
                    }
                  }
                  stackOut_99_0 = -1;
                  stackIn_100_0 = stackOut_99_0;
                  break L0;
                } else {
                  stackOut_77_0 = 13;
                  stackIn_78_0 = stackOut_77_0;
                  return stackIn_78_0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L31: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_101_0 = (RuntimeException) var6;
                stackOut_101_1 = new StringBuilder().append("rb.AA(").append(param0).append(',');
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                stackIn_102_0 = stackOut_101_0;
                stackIn_102_1 = stackOut_101_1;
                if (param1 == null) {
                  stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
                  stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                  stackOut_103_2 = "null";
                  stackIn_104_0 = stackOut_103_0;
                  stackIn_104_1 = stackOut_103_1;
                  stackIn_104_2 = stackOut_103_2;
                  break L31;
                } else {
                  stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
                  stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
                  stackOut_102_2 = "{...}";
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_104_1 = stackOut_102_1;
                  stackIn_104_2 = stackOut_102_2;
                  break L31;
                }
              }
              L32: {
                stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
                stackOut_104_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_104_2).append(',').append(param2).append(',');
                stackIn_106_0 = stackOut_104_0;
                stackIn_106_1 = stackOut_104_1;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                if (param3 == null) {
                  stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
                  stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
                  stackOut_106_2 = "null";
                  stackIn_107_0 = stackOut_106_0;
                  stackIn_107_1 = stackOut_106_1;
                  stackIn_107_2 = stackOut_106_2;
                  break L32;
                } else {
                  stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
                  stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
                  stackOut_105_2 = "{...}";
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_107_1 = stackOut_105_1;
                  stackIn_107_2 = stackOut_105_2;
                  break L32;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_107_0, stackIn_107_2 + ',' + param4 + ',' + param5 + ')');
            }
            return stackIn_100_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 > -95) {
            Object var2 = null;
            rb.a(127, -14, 40, (dd) null, 38, 110, (byte) -127, -57, -56);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = ((rb) this).field_y + param1;
        int var6 = ((rb) this).field_z + param0;
        int discarded$0 = ug.field_e.a(rd.field_b, var5 + 20, var6 - -20, ((rb) this).field_u - 40, ((rb) this).field_j - 50, 16777215, -1, 1, 0, ug.field_e.field_H);
        super.b(param0, param1, param2, param3);
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((rb) this).a(32, param2);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((rb) this).b(param2, -28533);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("rb.N(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public rb() {
        super(0, 0, 476, 225, (ch) null);
        ((rb) this).field_J = new bb(qk.field_h, (kd) null);
        ((rb) this).field_F = new bb(qj.field_J, (kd) null);
        ((rb) this).field_I = new bb(tc.field_g, (kd) null);
        ri var1 = new ri();
        ((rb) this).field_J.field_p = (ch) (Object) var1;
        ((rb) this).field_F.field_p = (ch) (Object) var1;
        ((rb) this).field_I.field_p = (ch) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((rb) this).field_F.a(-var3 + ((rb) this).field_u >> 1, var4, -var2 + ((rb) this).field_j + -48, 30, 80);
        ((rb) this).field_I.a(var2 + (var4 + (-var3 + ((rb) this).field_u >> 1)), var4, -var2 + (-48 + ((rb) this).field_j), 30, 80);
        ((rb) this).field_J.a(((rb) this).field_u - var3 >> 1, var3, ((rb) this).field_j - (78 + var2 * 2), 30, 80);
        ((rb) this).field_F.field_s = (kd) this;
        ((rb) this).field_J.field_s = (kd) this;
        ((rb) this).field_J.field_m = se.field_f;
        ((rb) this).field_I.field_s = (kd) this;
        ((rb) this).field_I.field_m = ga.field_n;
        ((rb) this).a((qa) (Object) ((rb) this).field_F, (byte) -39);
        ((rb) this).a((qa) (Object) ((rb) this).field_J, (byte) -59);
        ((rb) this).a((qa) (Object) ((rb) this).field_I, (byte) -53);
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, byte param6, int param7, int param8) {
        bh.field_l = param2;
        li.field_i = param8;
        ei.field_V = param1;
        if (param6 <= 119) {
            return;
        }
        try {
            aj.field_q = param7;
            t.field_d = param0;
            kh.field_d = param5;
            wa.field_m = param4;
            pb.field_g = param3;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rb.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
