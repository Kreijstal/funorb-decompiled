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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
              L3: {
                if (param4 != this.field_F) {
                  break L3;
                } else {
                  na.a((byte) -81);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param4 == this.field_J) {
                  break L4;
                } else {
                  if (this.field_I != param4) {
                    break L2;
                  } else {
                    ak.a(65);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              oh.d(false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("rb.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static int a(boolean param0, String param1, boolean param2, String param3, int param4, int param5) {
        try {
            int discarded$6 = 0;
            int discarded$7 = 0;
            int discarded$8 = 0;
            int discarded$9 = 0;
            Object discarded$10 = null;
            Object discarded$11 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_4_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_109_0 = 0;
            int stackIn_111_0 = 0;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            String stackIn_115_2 = null;
            RuntimeException stackIn_116_0 = null;
            StringBuilder stackIn_116_1 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            String stackIn_118_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_108_0 = 0;
            int stackOut_110_0 = 0;
            int stackOut_87_0 = 0;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            String stackOut_114_2 = null;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            String stackOut_113_2 = null;
            RuntimeException stackOut_115_0 = null;
            StringBuilder stackOut_115_1 = null;
            RuntimeException stackOut_117_0 = null;
            StringBuilder stackOut_117_1 = null;
            String stackOut_117_2 = null;
            RuntimeException stackOut_116_0 = null;
            StringBuilder stackOut_116_1 = null;
            String stackOut_116_2 = null;
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
                      decompiledRegionSelector1 = 0;
                      break L0;
                    }
                  }
                }
                L2: {
                  if (rh.field_k == d.field_O) {
                    L3: {
                      L4: {
                        if (!param2) {
                          break L4;
                        } else {
                          var10 = (String) null;
                          cf.field_c = r.a(false, aj.field_w, (byte) 84, (String) null, param1);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      cf.field_c = lk.a(param1, false, (byte) -35, param3);
                      break L3;
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
                L5: {
                  if (rh.field_k != je.field_P) {
                    break L5;
                  } else {
                    if (gi.a(1, true)) {
                      L6: {
                        L7: {
                          var6_int = ae.field_a.e(false);
                          if (var6_int == 0) {
                            break L7;
                          } else {
                            rh.field_k = pi.field_g;
                            be.field_a = var6_int;
                            pd.field_l = -1;
                            if (var9 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        rh.field_k = ef.field_h;
                        break L6;
                      }
                      ae.field_a.field_i = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L8: {
                  if (ef.field_h != rh.field_k) {
                    break L8;
                  } else {
                    if (!gi.a(8, true)) {
                      break L8;
                    } else {
                      ug.field_a = ae.field_a.f(-71);
                      ae.field_a.field_i = 0;
                      wd.a(param2, -120, cf.field_c, param4, param0);
                      rh.field_k = dl.field_w;
                      break L8;
                    }
                  }
                }
                L9: {
                  if (dl.field_w == rh.field_k) {
                    if (gi.a(1, true)) {
                      L10: {
                        L11: {
                          var6_int = ae.field_a.e(false);
                          be.field_a = var6_int;
                          ae.field_a.field_i = 0;
                          wc.field_p = null;
                          if (-1 == (var6_int ^ -1)) {
                            break L11;
                          } else {
                            if (var6_int != 1) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        pd.field_l = -1;
                        rh.field_k = ll.field_r;
                        if (var9 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                      L12: {
                        if (var6_int == 8) {
                          break L12;
                        } else {
                          rh.field_k = pi.field_g;
                          pd.field_l = -1;
                          if (var9 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      k.c(-28354);
                      aa.field_q = false;
                      stackOut_35_0 = var6_int;
                      stackIn_36_0 = stackOut_35_0;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L13: {
                  if (ll.field_r == rh.field_k) {
                    if (!gf.b(-128)) {
                      break L13;
                    } else {
                      L14: {
                        aj.field_w = ae.field_a.f(-109);
                        qe.field_k = ae.field_a.e(false);
                        discarded$6 = ae.field_a.e(false);
                        wc.field_q = ae.field_a.d((byte) -116);
                        var11 = ae.field_a.a((byte) -115);
                        var7 = ae.field_a.e(false);
                        if ((var7 & 1) != 0) {
                          f.d((byte) -37);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (!param2) {
                          L16: {
                            if ((var7 & 4) == 0) {
                              stackOut_47_0 = 0;
                              stackIn_48_0 = stackOut_47_0;
                              break L16;
                            } else {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L16;
                            }
                          }
                          L17: {
                            ed.field_a = stackIn_48_0 != 0;
                            if (-1 == (var7 & 8 ^ -1)) {
                              stackOut_50_0 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              break L17;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L17;
                            }
                          }
                          ee.field_i = stackIn_51_0 != 0;
                          if (!ee.field_i) {
                            break L15;
                          } else {
                            break L15;
                          }
                        } else {
                          break L15;
                        }
                      }
                      L18: {
                        L19: {
                          if (!bk.field_e) {
                            break L19;
                          } else {
                            discarded$7 = ae.field_a.e(false);
                            discarded$8 = ae.field_a.e(false);
                            discarded$9 = ae.field_a.c((byte) 123);
                            ge.field_g = ae.field_a.d((byte) -117);
                            gi.field_c = new byte[ge.field_g];
                            var8 = 0;
                            L20: while (true) {
                              if (ge.field_g <= var8) {
                                break L19;
                              } else {
                                gi.field_c[var8] = ae.field_a.i(-127);
                                var8++;
                                if (var9 != 0) {
                                  break L18;
                                } else {
                                  if (var9 == 0) {
                                    continue L20;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                        }
                        b.field_e = ae.field_a.h(0);
                        var12 = (CharSequence) ((Object) b.field_e);
                        ma.field_a = uk.a(92, var12);
                        nb.field_h = ae.field_a.e(false);
                        rh.field_k = fh.field_b;
                        break L18;
                      }
                      L21: {
                        L22: {
                          if (cf.field_c.a(true) == wa.field_g) {
                            break L22;
                          } else {
                            if (cf.field_c.a(true) == mk.field_i) {
                              wd.field_b.a(true, rl.a((byte) -116));
                              if (var9 == 0) {
                                break L21;
                              } else {
                                break L22;
                              }
                            } else {
                              break L21;
                            }
                          }
                        }
                        ml.field_F.a(true, rl.a((byte) -111));
                        break L21;
                      }
                      L23: {
                        aa.field_q = false;
                        if (var11 != null) {
                          ea.a(376, rl.a((byte) -120), var11);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        L25: {
                          if (0 < wc.field_q) {
                            break L25;
                          } else {
                            if (ed.field_a) {
                              break L25;
                            } else {
                              try {
                                L26: {
                                  discarded$10 = eb.a("unzap", rl.a((byte) -65), -250);
                                  decompiledRegionSelector0 = 0;
                                  break L26;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L27: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  if (var9 == 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L27;
                                  } else {
                                    decompiledRegionSelector0 = 1;
                                    break L27;
                                  }
                                }
                              }
                              if (decompiledRegionSelector0 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        try {
                          L28: {
                            discarded$11 = eb.a("zap", new Object[]{rh.a((byte) -70, aj.field_w)}, -11745, rl.a((byte) -126));
                            break L28;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L29: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L29;
                          }
                        }
                        break L24;
                      }
                      L30: {
                        if (0 >= wc.field_q) {
                          break L30;
                        } else {
                          va.field_m = true;
                          break L30;
                        }
                      }
                      ud.field_b.a(ue.field_a, (byte) 12);
                      var8 = 0;
                      L31: while (true) {
                        L32: {
                          L33: {
                            if (4 <= var8) {
                              break L33;
                            } else {
                              ue.field_a[var8] = ue.field_a[var8] + 50;
                              var8++;
                              if (var9 != 0) {
                                break L32;
                              } else {
                                if (var9 == 0) {
                                  continue L31;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                          ae.field_a.a(ue.field_a, (byte) 12);
                          break L32;
                        }
                        stackOut_84_0 = be.field_a;
                        stackIn_85_0 = stackOut_84_0;
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
                if (param5 < -19) {
                  L34: {
                    if (pi.field_g == rh.field_k) {
                      if (!gf.b(115)) {
                        break L34;
                      } else {
                        L35: {
                          k.c(-28354);
                          if (7 != be.field_a) {
                            break L35;
                          } else {
                            if (aa.field_q) {
                              break L35;
                            } else {
                              aa.field_q = true;
                              stackOut_94_0 = -1;
                              stackIn_95_0 = stackOut_94_0;
                              decompiledRegionSelector1 = 4;
                              break L0;
                            }
                          }
                        }
                        L36: {
                          if (be.field_a == 7) {
                            be.field_a = 3;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        fh.field_a = ae.field_a.h(0);
                        aa.field_q = false;
                        stackOut_99_0 = be.field_a;
                        stackIn_100_0 = stackOut_99_0;
                        decompiledRegionSelector1 = 5;
                        break L0;
                      }
                    } else {
                      break L34;
                    }
                  }
                  L37: {
                    if (sg.field_h != null) {
                      break L37;
                    } else {
                      L38: {
                        if (aa.field_q) {
                          break L38;
                        } else {
                          var6_int = be.field_b;
                          be.field_b = ab.field_d;
                          ab.field_d = var6_int;
                          aa.field_q = true;
                          if (var9 == 0) {
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      L39: {
                        L40: {
                          if (-30001L <= (h.b(102) ^ -1L)) {
                            break L40;
                          } else {
                            fh.field_a = ok.field_B;
                            if (var9 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        fh.field_a = jc.field_d;
                        break L39;
                      }
                      aa.field_q = false;
                      stackOut_108_0 = 3;
                      stackIn_109_0 = stackOut_108_0;
                      decompiledRegionSelector1 = 6;
                      break L0;
                    }
                  }
                  stackOut_110_0 = -1;
                  stackIn_111_0 = stackOut_110_0;
                  decompiledRegionSelector1 = 7;
                  break L0;
                } else {
                  stackOut_87_0 = 13;
                  stackIn_88_0 = stackOut_87_0;
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L41: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_112_0 = (RuntimeException) (var6);
                stackOut_112_1 = new StringBuilder().append("rb.AA(").append(param0).append(',');
                stackIn_114_0 = stackOut_112_0;
                stackIn_114_1 = stackOut_112_1;
                stackIn_113_0 = stackOut_112_0;
                stackIn_113_1 = stackOut_112_1;
                if (param1 == null) {
                  stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
                  stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
                  stackOut_114_2 = "null";
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  break L41;
                } else {
                  stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
                  stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
                  stackOut_113_2 = "{...}";
                  stackIn_115_0 = stackOut_113_0;
                  stackIn_115_1 = stackOut_113_1;
                  stackIn_115_2 = stackOut_113_2;
                  break L41;
                }
              }
              L42: {
                stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
                stackOut_115_1 = ((StringBuilder) (Object) stackIn_115_1).append(stackIn_115_2).append(',').append(param2).append(',');
                stackIn_117_0 = stackOut_115_0;
                stackIn_117_1 = stackOut_115_1;
                stackIn_116_0 = stackOut_115_0;
                stackIn_116_1 = stackOut_115_1;
                if (param3 == null) {
                  stackOut_117_0 = (RuntimeException) ((Object) stackIn_117_0);
                  stackOut_117_1 = (StringBuilder) ((Object) stackIn_117_1);
                  stackOut_117_2 = "null";
                  stackIn_118_0 = stackOut_117_0;
                  stackIn_118_1 = stackOut_117_1;
                  stackIn_118_2 = stackOut_117_2;
                  break L42;
                } else {
                  stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
                  stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
                  stackOut_116_2 = "{...}";
                  stackIn_118_0 = stackOut_116_0;
                  stackIn_118_1 = stackOut_116_1;
                  stackIn_118_2 = stackOut_116_2;
                  break L42;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_118_0), stackIn_118_2 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_36_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_85_0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_88_0;
                  } else {
                    if (decompiledRegionSelector1 == 4) {
                      return stackIn_95_0;
                    } else {
                      if (decompiledRegionSelector1 == 5) {
                        return stackIn_100_0;
                      } else {
                        if (decompiledRegionSelector1 == 6) {
                          return stackIn_109_0;
                        } else {
                          return stackIn_111_0;
                        }
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

    public static void a(int param0) {
        field_G = null;
        if (param0 > -95) {
            dd var2 = (dd) null;
            rb.a(127, -14, 40, (dd) null, 38, 110, (byte) -127, -57, -56);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = this.field_y + param1;
        int var6 = this.field_z + param0;
        int discarded$0 = ug.field_e.a(rd.field_b, var5 + 20, var6 - -20, this.field_u - 40, this.field_j - 50, 16777215, -1, 1, 0, ug.field_e.field_H);
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) != -99) {
                if (param1 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = this.a(32, param2);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = this.b(param2, -28533);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("rb.N(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    public rb() {
        super(0, 0, 476, 225, (ch) null);
        this.field_J = new bb(qk.field_h, (kd) null);
        this.field_F = new bb(qj.field_J, (kd) null);
        this.field_I = new bb(tc.field_g, (kd) null);
        ri var1 = new ri();
        this.field_J.field_p = (ch) ((Object) var1);
        this.field_F.field_p = (ch) ((Object) var1);
        this.field_I.field_p = (ch) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1935077055;
        this.field_F.a(-var3 + this.field_u >> -2073875711, var4, -var2 + this.field_j + -48, 30, 80);
        this.field_I.a(var2 + (var4 + (-var3 + this.field_u >> -348715167)), var4, -var2 + (-48 + this.field_j), 30, 80);
        this.field_J.a(this.field_u - var3 >> -1481717663, var3, this.field_j - (78 + var2 * 2), 30, 80);
        this.field_F.field_s = (kd) (this);
        this.field_J.field_s = (kd) (this);
        this.field_J.field_m = se.field_f;
        this.field_I.field_s = (kd) (this);
        this.field_I.field_m = ga.field_n;
        this.a((qa) (this.field_F), (byte) -39);
        this.a((qa) (this.field_J), (byte) -59);
        this.a((qa) (this.field_I), (byte) -53);
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
            throw pf.a((Throwable) ((Object) runtimeException), "rb.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
