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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new nc(frb.a(187, 101));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ju.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(boolean param0, int param1, String param2, byte param3, boolean param4, String param5) {
        try {
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
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            String stackIn_106_2 = null;
            StringBuilder stackIn_108_1 = null;
            StringBuilder stackIn_109_1 = null;
            String stackIn_109_2 = null;
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
            String var12 = null;
            CharSequence var13 = null;
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
                      stackIn_4_0 = -1;
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
                              stackIn_28_0 = var6_int;
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
                              stackIn_39_0 = 0;
                              break L12;
                            } else {
                              stackIn_39_0 = 1;
                              break L12;
                            }
                          }
                          L13: {
                            erb.field_p = stackIn_39_0 != 0;
                            if (-1 == (var7 & 2 ^ -1)) {
                              stackIn_42_0 = 0;
                              break L13;
                            } else {
                              stackIn_42_0 = 1;
                              break L13;
                            }
                          }
                          L14: {
                            hb.field_c = stackIn_42_0 != 0;
                            if ((var7 & 4) == 0) {
                              stackIn_45_0 = 0;
                              break L14;
                            } else {
                              stackIn_45_0 = 1;
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
                          stackIn_50_0 = 0;
                          break L15;
                        } else {
                          stackIn_50_0 = 1;
                          break L15;
                        }
                      }
                      L16: {
                        acb.field_p = stackIn_50_0 != 0;
                        if (!js.field_q) {
                          break L16;
                        } else {
                          qga.field_b.e((byte) -117);
                          qga.field_b.e((byte) -91);
                          qga.field_b.h(86);
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
                                  ia.a(vpa.b((byte) -87), "unzap", param3 ^ 12337);
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
                            ia.a(new Object[]{vga.a(sta.field_p, -127)}, vpa.b((byte) -92), "zap", (byte) 108);
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
                          stackIn_77_0 = ow.field_a;
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
                            stackIn_89_0 = -1;
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
                      stackIn_87_0 = ow.field_a;
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
                    ju.a(true, 44, (String) null, (byte) 29, true, (String) null);
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
                      stackIn_100_0 = 3;
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
                stackIn_102_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L34: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_105_0 = (RuntimeException) (var6);

                stackIn_105_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
                  stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                  stackIn_106_2 = "null";
                  break L34;
                } else {
                  stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
                  stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
                  stackIn_106_2 = "{...}";
                  break L34;
                }
              }
              L35: {


                stackIn_108_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_106_2).append(',').append(param3).append(',').append(param4).append(',');

                if (param5 == null) {
                  stackIn_106_0 = (RuntimeException) ((Object) stackIn_106_0);
                  stackIn_109_1 = (StringBuilder) ((Object) stackIn_108_1);
                  stackIn_109_2 = "null";
                  break L35;
                } else {
                  stackIn_106_0 = (RuntimeException) ((Object) stackIn_106_0);
                  stackIn_109_1 = (StringBuilder) ((Object) stackIn_108_1);
                  stackIn_109_2 = "{...}";
                  break L35;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_106_0), stackIn_109_2 + ')');
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
