/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends rqa {
    static String field_o;

    public static void e(byte param0) {
        if (param0 <= 58) {
            ju.e((byte) 89);
        }
        field_o = null;
    }

    ju(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = new nc(frb.a(187, 101));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ju.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(boolean param0, int param1, String param2, byte param3, boolean param4, String param5) {
        try {
            int discarded$6 = 0;
            int discarded$7 = 0;
            int discarded$8 = 0;
            Object discarded$9 = null;
            Object discarded$10 = null;
            int discarded$11 = 0;
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            String var12 = null;
            CharSequence var13 = null;
            int stackIn_4_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_87_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_102_0 = 0;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            String stackIn_106_2 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            String stackIn_109_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_86_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_101_0 = 0;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            String stackOut_105_2 = null;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            String stackOut_104_2 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            String stackOut_108_2 = null;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            String stackOut_107_2 = null;
            var9 = VoidHunters.field_G;
            try {
              L0: {
                L1: {
                  if (ov.field_o != null) {
                    break L1;
                  } else {
                    if (ne.a(param4, (byte) -11)) {
                      break L1;
                    } else {
                      stackOut_3_0 = -1;
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                L2: {
                  if (tc.field_c != wd.field_p) {
                    break L2;
                  } else {
                    L3: {
                      if (!param4) {
                        qva.field_j = fe.a(param2, param5, false, (byte) -70);
                        break L3;
                      } else {
                        var11 = (String) null;
                        qva.field_j = sia.a(96, sta.field_p, (String) null, false, param5);
                        break L3;
                      }
                    }
                    dpa.field_p.field_e = 0;
                    dpa.field_p.c(param3 ^ 13, 14);
                    dpa.field_p.c(0, qva.field_j.a((byte) 56).field_a);
                    lnb.b(-1, 117);
                    tc.field_c = kj.field_o;
                    break L2;
                  }
                }
                L4: {
                  if (kj.field_o == tc.field_c) {
                    if (!boa.a(1, 30000)) {
                      break L4;
                    } else {
                      L5: {
                        var6_int = qga.field_b.e((byte) -121);
                        if (var6_int != 0) {
                          vja.field_a = -1;
                          tc.field_c = kw.field_xb;
                          ow.field_a = var6_int;
                          break L5;
                        } else {
                          tc.field_c = ida.field_w;
                          break L5;
                        }
                      }
                      qga.field_b.field_e = 0;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (ida.field_w != tc.field_c) {
                    break L6;
                  } else {
                    if (!boa.a(8, param3 ^ 30013)) {
                      break L6;
                    } else {
                      iqb.field_p = qga.field_b.k(255);
                      qga.field_b.field_e = 0;
                      dqa.a(-87, param0, param4, qva.field_j, param1);
                      tc.field_c = of.field_a;
                      break L6;
                    }
                  }
                }
                L7: {
                  if (tc.field_c != of.field_a) {
                    break L7;
                  } else {
                    if (boa.a(1, 30000)) {
                      L8: {
                        var6_int = qga.field_b.e((byte) -110);
                        ow.field_a = var6_int;
                        qga.field_b.field_e = 0;
                        vda.field_o = null;
                        if (-1 == (var6_int ^ -1)) {
                          break L8;
                        } else {
                          if (var6_int == 1) {
                            break L8;
                          } else {
                            if ((var6_int ^ -1) == -9) {
                              ifb.l(-122);
                              hha.field_o = false;
                              stackOut_27_0 = var6_int;
                              stackIn_28_0 = stackOut_27_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              vja.field_a = -1;
                              tc.field_c = kw.field_xb;
                              break L7;
                            }
                          }
                        }
                      }
                      vja.field_a = -1;
                      tc.field_c = htb.field_A;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L9: {
                  if (tc.field_c != htb.field_A) {
                    break L9;
                  } else {
                    if (ci.b((byte) 113)) {
                      L10: {
                        sta.field_p = qga.field_b.k(255);
                        jd.field_p = param5;
                        go.field_p = qga.field_b.e((byte) -94);
                        nfa.field_d = qga.field_b.e((byte) -106);
                        hcb.field_o = qga.field_b.e(param3 + 1856);
                        var12 = qga.field_b.m(0);
                        var7 = qga.field_b.e((byte) -106);
                        if ((var7 & 1) == 0) {
                          break L10;
                        } else {
                          hq.d((byte) 111);
                          break L10;
                        }
                      }
                      L11: {
                        if (param4) {
                          break L11;
                        } else {
                          L12: {
                            if (-1 == (8 & var7 ^ -1)) {
                              stackOut_38_0 = 0;
                              stackIn_39_0 = stackOut_38_0;
                              break L12;
                            } else {
                              stackOut_37_0 = 1;
                              stackIn_39_0 = stackOut_37_0;
                              break L12;
                            }
                          }
                          L13: {
                            erb.field_p = stackIn_39_0 != 0;
                            if (-1 == (var7 & 2 ^ -1)) {
                              stackOut_41_0 = 0;
                              stackIn_42_0 = stackOut_41_0;
                              break L13;
                            } else {
                              stackOut_40_0 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              break L13;
                            }
                          }
                          L14: {
                            hb.field_c = stackIn_42_0 != 0;
                            if ((var7 & 4) == 0) {
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L14;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              break L14;
                            }
                          }
                          era.field_r = stackIn_45_0 != 0;
                          if (!erb.field_p) {
                            break L11;
                          } else {
                            hb.field_c = true;
                            break L11;
                          }
                        }
                      }
                      L15: {
                        if ((16 & var7) == 0) {
                          stackOut_49_0 = 0;
                          stackIn_50_0 = stackOut_49_0;
                          break L15;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L15;
                        }
                      }
                      L16: {
                        acb.field_p = stackIn_50_0 != 0;
                        if (!js.field_q) {
                          break L16;
                        } else {
                          discarded$6 = qga.field_b.e((byte) -117);
                          discarded$7 = qga.field_b.e((byte) -91);
                          discarded$8 = qga.field_b.h(86);
                          om.field_e = qga.field_b.e(1869);
                          ap.field_o = new byte[om.field_e];
                          var8 = 0;
                          L17: while (true) {
                            if (om.field_e <= var8) {
                              break L16;
                            } else {
                              ap.field_o[var8] = qga.field_b.d((byte) -114);
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      }
                      L18: {
                        kca.field_a = qga.field_b.a(param3 ^ -14);
                        var13 = (CharSequence) ((Object) kca.field_a);
                        ffb.field_e = jwa.a(false, var13);
                        jl.field_p = qga.field_b.e((byte) -94);
                        tc.field_c = sp.field_o;
                        if (qva.field_j.a((byte) 124) == bta.field_r) {
                          up.field_o.a(vpa.b((byte) -106), param3 ^ 13);
                          break L18;
                        } else {
                          if (qva.field_j.a((byte) 112) == noa.field_p) {
                            hha.field_p.a(vpa.b((byte) -103), 0);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L19: {
                        hha.field_o = false;
                        if (var12 == null) {
                          break L19;
                        } else {
                          pcb.a(vpa.b((byte) -94), var12, -1);
                          break L19;
                        }
                      }
                      L20: {
                        L21: {
                          if (-1 > (hcb.field_o ^ -1)) {
                            break L21;
                          } else {
                            if (era.field_r) {
                              break L21;
                            } else {
                              try {
                                L22: {
                                  discarded$9 = ia.a(vpa.b((byte) -87), "unzap", param3 ^ 12337);
                                  break L22;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L23: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L23;
                                }
                              }
                              break L20;
                            }
                          }
                        }
                        try {
                          L24: {
                            discarded$10 = ia.a(new Object[]{vga.a(sta.field_p, -127)}, vpa.b((byte) -92), "zap", (byte) 108);
                            break L24;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L25: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L25;
                          }
                        }
                        break L20;
                      }
                      L26: {
                        if (hcb.field_o > 0) {
                          bua.field_o = true;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      dpa.field_p.a(18794, nfa.field_e);
                      var8 = 0;
                      L27: while (true) {
                        if (4 <= var8) {
                          qga.field_b.a(18794, nfa.field_e);
                          stackOut_76_0 = ow.field_a;
                          stackIn_77_0 = stackOut_76_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          nfa.field_e[var8] = nfa.field_e[var8] + 50;
                          var8++;
                          continue L27;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                L28: {
                  if (tc.field_c == kw.field_xb) {
                    if (!ci.b((byte) 113)) {
                      break L28;
                    } else {
                      L29: {
                        ifb.l(-117);
                        if (-8 != (ow.field_a ^ -1)) {
                          break L29;
                        } else {
                          if (!hha.field_o) {
                            hha.field_o = true;
                            stackOut_88_0 = -1;
                            stackIn_89_0 = stackOut_88_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if (ow.field_a != 7) {
                          break L30;
                        } else {
                          ow.field_a = 3;
                          break L30;
                        }
                      }
                      dgb.field_b = qga.field_b.a(-1);
                      hha.field_o = false;
                      stackOut_86_0 = ow.field_a;
                      stackIn_87_0 = stackOut_86_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    break L28;
                  }
                }
                L31: {
                  if (param3 == 13) {
                    break L31;
                  } else {
                    var10 = (String) null;
                    discarded$11 = ju.a(true, 44, (String) null, (byte) 29, true, (String) null);
                    break L31;
                  }
                }
                L32: {
                  if (null == ov.field_o) {
                    if (hha.field_o) {
                      L33: {
                        if (mw.e(0) > 30000L) {
                          dgb.field_b = fd.field_o;
                          break L33;
                        } else {
                          dgb.field_b = uv.field_f;
                          break L33;
                        }
                      }
                      hha.field_o = false;
                      stackOut_99_0 = 3;
                      stackIn_100_0 = stackOut_99_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      var6_int = pcb.field_p;
                      pcb.field_p = bia.field_d;
                      bia.field_d = var6_int;
                      hha.field_o = true;
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                stackOut_101_0 = -1;
                stackIn_102_0 = stackOut_101_0;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L34: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_103_0 = (RuntimeException) (var6);
                stackOut_103_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');
                stackIn_105_0 = stackOut_103_0;
                stackIn_105_1 = stackOut_103_1;
                stackIn_104_0 = stackOut_103_0;
                stackIn_104_1 = stackOut_103_1;
                if (param2 == null) {
                  stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
                  stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
                  stackOut_105_2 = "null";
                  stackIn_106_0 = stackOut_105_0;
                  stackIn_106_1 = stackOut_105_1;
                  stackIn_106_2 = stackOut_105_2;
                  break L34;
                } else {
                  stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
                  stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
                  stackOut_104_2 = "{...}";
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_106_1 = stackOut_104_1;
                  stackIn_106_2 = stackOut_104_2;
                  break L34;
                }
              }
              L35: {
                stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
                stackOut_106_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_106_2).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_108_0 = stackOut_106_0;
                stackIn_108_1 = stackOut_106_1;
                stackIn_107_0 = stackOut_106_0;
                stackIn_107_1 = stackOut_106_1;
                if (param5 == null) {
                  stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
                  stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
                  stackOut_108_2 = "null";
                  stackIn_109_0 = stackOut_108_0;
                  stackIn_109_1 = stackOut_108_1;
                  stackIn_109_2 = stackOut_108_2;
                  break L35;
                } else {
                  stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
                  stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
                  stackOut_107_2 = "{...}";
                  stackIn_109_0 = stackOut_107_0;
                  stackIn_109_1 = stackOut_107_1;
                  stackIn_109_2 = stackOut_107_2;
                  break L35;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_109_0), stackIn_109_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_4_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_77_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_87_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_89_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_100_0;
                      } else {
                        return stackIn_102_0;
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

    static {
        field_o = "Press CTRL-R to reconnect";
    }
}
