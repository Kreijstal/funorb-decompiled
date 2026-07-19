/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ZombieDawnMulti extends aq {
    static String field_M;
    static String[] field_K;
    private StringBuffer field_G;
    static ja[][] field_L;
    static int field_H;
    private StringBuffer field_J;
    static String field_F;
    static ja[] field_I;
    public static boolean field_E;

    final void g(int param0) {
        RuntimeException var2 = null;
        int var3_int = 0;
        int[][] var3 = null;
        Runtime var3_ref = null;
        int var4 = 0;
        nc var4_ref_nc = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_5_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas stackOut_4_0 = null;
        ll stackOut_2_0 = null;
        int stackOut_14_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        boolean stackOut_92_1 = false;
        Object var2_ref = null;
        var7 = field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == rn.field_f) {
                stackOut_4_0 = dk.field_Ib;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = rn.field_f;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2_ref = stackIn_5_0;
              if (he.field_a) {
                if (uk.field_O) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                if (!vk.l((byte) -127)) {
                  if (uk.field_O) {
                    if (null == ke.field_g) {
                      break L2;
                    } else {
                      qm.a(100.0f, param0 ^ -30089, pd.field_a);
                      ra.a((java.awt.Canvas) (var2_ref), -92);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    ra.a((java.awt.Canvas) (var2_ref), -93);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L3: {
                    if (null != rn.field_f) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      break L3;
                    } else {
                      stackOut_12_0 = ro.field_L;
                      stackIn_15_0 = stackOut_12_0 ? 1 : 0;
                      break L3;
                    }
                  }
                  tn.a(stackIn_15_0 != 0, param0 ^ -30144, (java.awt.Canvas) (var2_ref));
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L4: {
              L5: {
                if (pl.field_I == sp.field_g) {
                  break L5;
                } else {
                  L6: {
                    if (-1 >= (sp.field_g ^ -1)) {
                      stackOut_31_0 = sp.field_g;
                      stackIn_32_0 = stackOut_31_0;
                      break L6;
                    } else {
                      stackOut_29_0 = pl.field_I;
                      stackIn_32_0 = stackOut_29_0;
                      break L6;
                    }
                  }
                  L7: {
                    var3_int = stackIn_32_0;
                    if (var3_int >= 0) {
                      break L7;
                    } else {
                      var3_int = 11;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var4_ref_nc = gk.a(2, var3_int);
                      if (gk.field_b < 16) {
                        break L9;
                      } else {
                        tg.a((byte) -77, false, sp.field_g);
                        if (var4_ref_nc != null) {
                          var4_ref_nc.a(-128, 512 - (gk.field_b << -624132028), true);
                          if (var7 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    tg.a((byte) -11, false, pl.field_I);
                    if (null == var4_ref_nc) {
                      break L8;
                    } else {
                      var4_ref_nc.a(-109, gk.field_b << -1414828892, false);
                      break L8;
                    }
                  }
                  if (var7 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              tg.a((byte) -16, true, pl.field_I);
              break L4;
            }
            L10: {
              if (param0 == -30169) {
                break L10;
              } else {
                field_L = (ja[][]) null;
                break L10;
              }
            }
            L11: {
              if (!n.a((byte) -50)) {
                break L11;
              } else {
                oo.f(0, 0, oo.field_b, oo.field_l);
                sc.a(0);
                var3 = iq.a(45);
                var4 = 0;
                var5 = 0;
                L12: while (true) {
                  L13: {
                    L14: {
                      if ((var3.length ^ -1) >= (var5 ^ -1)) {
                        break L14;
                      } else {
                        if (var7 != 0) {
                          break L13;
                        } else {
                          L15: {
                            if (null == var3[var5]) {
                              break L15;
                            } else {
                              if ((bd.field_g ^ -1) > (var3[var5][0] ^ -1)) {
                                break L15;
                              } else {
                                if ((var3[var5][2] + var3[var5][0] ^ -1) > (bd.field_g ^ -1)) {
                                  break L15;
                                } else {
                                  if ((bo.field_d ^ -1) > (var3[var5][1] ^ -1)) {
                                    break L15;
                                  } else {
                                    if ((bo.field_d ^ -1) < (var3[var5][0] + var3[var5][3] ^ -1)) {
                                      break L15;
                                    } else {
                                      var4 = 1;
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var5++;
                          if (var7 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    if (var4 == 0) {
                      break L13;
                    } else {
                      en.a(-1, 1);
                      if (var7 == 0) {
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                  en.a(-1, 4);
                  break L11;
                }
              }
            }
            L16: {
              if (0 != er.field_i) {
                var3_int = gk.field_b * 256 / 32;
                if (0 < var3_int) {
                  oo.f(0, 0, oo.field_b, oo.field_l, 0, var3_int);
                  break L16;
                } else {
                  break L16;
                }
              } else {
                break L16;
              }
            }
            L17: {
              L18: {
                if (!cq.a(15000)) {
                  break L18;
                } else {
                  if (n.a((byte) -39)) {
                    break L18;
                  } else {
                    L19: {
                      stackOut_89_0 = 1;
                      stackIn_94_0 = stackOut_89_0;
                      stackIn_90_0 = stackOut_89_0;
                      if (rn.field_f != null) {
                        stackOut_94_0 = stackIn_94_0;
                        stackOut_94_1 = 1;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        break L19;
                      } else {
                        stackOut_90_0 = stackIn_90_0;
                        stackIn_92_0 = stackOut_90_0;
                        stackOut_92_0 = stackIn_92_0;
                        stackOut_92_1 = ro.field_L;
                        stackIn_95_0 = stackOut_92_0;
                        stackIn_95_1 = stackOut_92_1 ? 1 : 0;
                        break L19;
                      }
                    }
                    qp.a(stackIn_95_0 != 0, stackIn_95_1 != 0);
                    if (var7 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              if (!wb.k((byte) 113)) {
                break L17;
              } else {
                if (!n.a((byte) -39)) {
                  oo.f(0, 0, oo.field_b, oo.field_l);
                  oe.a(oi.field_h[0].field_x, oi.field_h[0].field_w, oi.field_h, (byte) -21);
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            L20: {
              if (-3 < (kj.field_q ^ -1)) {
                break L20;
              } else {
                if (bf.field_m) {
                  L21: {
                    if (this.field_J == null) {
                      this.field_J = new StringBuffer("Mem: 000000KiB");
                      this.field_G = new StringBuffer("FPS: 00");
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    L23: {
                      if (0 != wf.field_m % 50) {
                        break L23;
                      } else {
                        var3_ref = Runtime.getRuntime();
                        var4 = (int)(var3_ref.totalMemory() + -var3_ref.freeMemory()) >> 1371402858;
                        var5 = ji.field_b;
                        var6 = 10;
                        L24: while (true) {
                          L25: {
                            L26: {
                              if (4 >= var6) {
                                break L26;
                              } else {
                                this.field_J.setCharAt(var6, (char)(var4 % 10 + 48));
                                var4 = var4 / 10;
                                var6--;
                                if (var7 != 0) {
                                  break L25;
                                } else {
                                  if (var7 == 0) {
                                    continue L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            var6 = 6;
                            break L25;
                          }
                          L27: while (true) {
                            if (-5 <= (var6 ^ -1)) {
                              break L23;
                            } else {
                              this.field_G.setCharAt(var6, (char)(48 + var5 % 10));
                              var5 = var5 / 10;
                              var6--;
                              if (var7 != 0) {
                                break L22;
                              } else {
                                if (var7 == 0) {
                                  continue L27;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    qp.field_w.c(this.field_J.toString(), 5, 20, 16777215, 1);
                    break L22;
                  }
                  qp.field_w.c(this.field_G.toString(), 5, 35, 16777215, 1);
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            t.a(false, 0, (java.awt.Canvas) (var2_ref), 0);
            decompiledRegionSelector0 = 4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.IA(" + param0 + ')');
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
                return;
              }
            }
          }
        }
    }

    final void a(int param0) {
        gd var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(0, false, 9, 13, 1, 72, 10, (byte) -99);
            o.field_j = true;
            wf.field_m = 5000 * (int)Math.random();
            ll.field_k = new rp();
            df.field_H = true;
            var2 = new gd();
            var2.f(128, 15, 9);
            db.a(pl.field_J, 22050, (java.awt.Component) ((Object) dk.field_Ib), var2, 1024, true);
            this.a(true, (byte) -27, false, true, true, false, true);
            sq.field_U[64] = 1;
            sq.field_U[79] = 14;
            sq.field_U[10] = -1;
            sq.field_U[9] = -1;
            sq.field_U[76] = 5;
            sq.field_U[66] = 1;
            sq.field_U[61] = 25;
            sq.field_U[65] = 1;
            sq.field_U[62] = -1;
            sq.field_U[77] = -1;
            sq.field_U[57] = -2;
            sq.field_U[81] = 25;
            sq.field_U[70] = 2;
            sq.field_U[71] = -1;
            sq.field_U[74] = 10;
            sq.field_U[param0] = 17;
            sq.field_U[80] = 11;
            sq.field_U[82] = 4;
            sq.field_U[69] = -1;
            sq.field_U[58] = -2;
            sq.field_U[78] = 5;
            sq.field_U[72] = 6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "ZombieDawnMulti.JA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int fieldTemp$3 = 0;
        br discarded$4 = null;
        boolean discarded$5 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_90_0 = false;
        boolean stackIn_98_0 = false;
        boolean stackIn_107_0 = false;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        boolean stackIn_129_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_89_0 = false;
        boolean stackOut_97_0 = false;
        boolean stackOut_106_0 = false;
        int stackOut_116_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        boolean stackOut_128_0 = false;
        var8 = field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (er.field_h != er.field_i) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 0;
                    var4 = 0;
                    if (!param1) {
                      L4: {
                        if ((sp.field_g ^ -1) == (pl.field_I ^ -1)) {
                          break L4;
                        } else {
                          gk.field_b = gk.field_b + 1;
                          if ((gk.field_b ^ -1) == -33) {
                            bl.a(-9);
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if ((pl.field_I ^ -1) == 6) {
                          break L5;
                        } else {
                          L6: {
                            if ((pl.field_I ^ -1) == 1) {
                              break L6;
                            } else {
                              if (!lb.a((byte) 53, pl.field_I)) {
                                break L3;
                              } else {
                                gk.a(2, pl.field_I).a(0);
                                if (var8 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          iq.field_f = true;
                          var3_int = 1;
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L7: {
                        if (cf.field_s == null) {
                          break L7;
                        } else {
                          this.s(-50);
                          break L7;
                        }
                      }
                      L8: {
                        if (!ji.field_c) {
                          break L8;
                        } else {
                          var4 = 1;
                          var3_int = 1;
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      np.field_m.a((byte) 121, true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L9: {
                    if (bh.field_d.c(61) == null) {
                      break L9;
                    } else {
                      fieldTemp$3 = er.field_k + 1;
                      er.field_k = er.field_k + 1;
                      if ((fieldTemp$3 ^ -1) > -336) {
                        break L9;
                      } else {
                        er.field_k = 0;
                        discarded$4 = bh.field_d.g(49);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (!ji.field_c) {
                        break L11;
                      } else {
                        if (gh.field_g) {
                          break L11;
                        } else {
                          if (!vo.field_q) {
                            L12: {
                              if (!re.field_b) {
                                break L12;
                              } else {
                                if (!hh.field_b) {
                                  break L12;
                                } else {
                                  if (!sq.field_N) {
                                    break L12;
                                  } else {
                                    var3_int = 0;
                                    break L12;
                                  }
                                }
                              }
                            }
                            L13: {
                              if (!am.a(-116)) {
                                break L13;
                              } else {
                                var3_int = 1;
                                break L13;
                              }
                            }
                            L14: {
                              wc.a(15, var3_int != 0);
                              if (cp.field_K) {
                                af.field_e.a((byte) 125, var4 != 0);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L15: {
                              if (hh.field_b) {
                                L16: {
                                  if (re.field_b) {
                                    ia.a(320, 180, var4 != 0, 0);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                np.field_m.a((byte) 119, var4 != 0);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L17: while (true) {
                              if (!ba.c(-1)) {
                                break L11;
                              } else {
                                L18: {
                                  if (!iq.field_f) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (!re.field_b) {
                                        break L19;
                                      } else {
                                        if (!hh.field_b) {
                                          break L19;
                                        } else {
                                          if (jm.a(13, -23936, 15, 12)) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                    discarded$5 = w.a(13, 15, 12, 18663);
                                    break L18;
                                  }
                                }
                                L20: {
                                  if (cp.field_K) {
                                    af.field_e.a(-59, sj.field_p);
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                if (!hh.field_b) {
                                  continue L17;
                                } else {
                                  stackOut_89_0 = iq.field_f;
                                  stackIn_98_0 = stackOut_89_0;
                                  stackIn_90_0 = stackOut_89_0;
                                  if (var8 != 0) {
                                    break L10;
                                  } else {
                                    L21: {
                                      if (!stackIn_90_0) {
                                        break L21;
                                      } else {
                                        if (sq.field_N) {
                                          continue L17;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    np.field_m.a(-78, sj.field_p);
                                    if (var8 == 0) {
                                      continue L17;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_97_0 = ji.field_c;
                    stackIn_98_0 = stackOut_97_0;
                    break L10;
                  }
                  L22: {
                    L23: {
                      if (stackIn_98_0) {
                        break L23;
                      } else {
                        L24: {
                          if (am.a(-98)) {
                            break L24;
                          } else {
                            oa.a(0);
                            L25: while (true) {
                              if (!ba.c(-1)) {
                                break L23;
                              } else {
                                if (!hh.field_b) {
                                  continue L25;
                                } else {
                                  stackOut_106_0 = iq.field_f;
                                  stackIn_129_0 = stackOut_106_0;
                                  stackIn_107_0 = stackOut_106_0;
                                  if (var8 != 0) {
                                    break L22;
                                  } else {
                                    L26: {
                                      if (!stackIn_107_0) {
                                        break L26;
                                      } else {
                                        if (!sq.field_N) {
                                          break L26;
                                        } else {
                                          continue L25;
                                        }
                                      }
                                    }
                                    np.field_m.a(119, sj.field_p);
                                    if (var8 == 0) {
                                      continue L25;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L27: {
                          L28: {
                            stackOut_116_0 = 1;
                            stackIn_120_0 = stackOut_116_0;
                            stackIn_117_0 = stackOut_116_0;
                            if (hh.field_b) {
                              break L28;
                            } else {
                              stackOut_117_0 = stackIn_117_0;
                              stackIn_122_0 = stackOut_117_0;
                              stackIn_118_0 = stackOut_117_0;
                              if (!cp.field_K) {
                                stackOut_122_0 = stackIn_122_0;
                                stackOut_122_1 = 0;
                                stackIn_123_0 = stackOut_122_0;
                                stackIn_123_1 = stackOut_122_1;
                                break L27;
                              } else {
                                stackOut_118_0 = stackIn_118_0;
                                stackIn_120_0 = stackOut_118_0;
                                break L28;
                              }
                            }
                          }
                          stackOut_120_0 = stackIn_120_0;
                          stackOut_120_1 = 1;
                          stackIn_123_0 = stackOut_120_0;
                          stackIn_123_1 = stackOut_120_1;
                          break L27;
                        }
                        L29: {
                          stackOut_123_0 = stackIn_123_0;
                          stackOut_123_1 = stackIn_123_1;
                          stackIn_126_0 = stackOut_123_0;
                          stackIn_126_1 = stackOut_123_1;
                          stackIn_124_0 = stackOut_123_0;
                          stackIn_124_1 = stackOut_123_1;
                          if (ib.field_a <= 50) {
                            stackOut_126_0 = stackIn_126_0;
                            stackOut_126_1 = stackIn_126_1;
                            stackOut_126_2 = 0;
                            stackIn_127_0 = stackOut_126_0;
                            stackIn_127_1 = stackOut_126_1;
                            stackIn_127_2 = stackOut_126_2;
                            break L29;
                          } else {
                            stackOut_124_0 = stackIn_124_0;
                            stackOut_124_1 = stackIn_124_1;
                            stackOut_124_2 = 1;
                            stackIn_127_0 = stackOut_124_0;
                            stackIn_127_1 = stackOut_124_1;
                            stackIn_127_2 = stackOut_124_2;
                            break L29;
                          }
                        }
                        df.a(stackIn_127_0 != 0, stackIn_127_1 != 0, stackIn_127_2 != 0, -92, 15, 0, false, 11, 13, t.field_d, 14, true);
                        break L23;
                      }
                    }
                    stackOut_128_0 = iq.field_f;
                    stackIn_129_0 = stackOut_128_0;
                    break L22;
                  }
                  L30: {
                    L31: {
                      if (stackIn_129_0) {
                        break L31;
                      } else {
                        if ((dg.field_M ^ -1) >= -1) {
                          break L30;
                        } else {
                          dg.field_M = dg.field_M - 1;
                          if (var8 == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    if (b.field_d <= dg.field_M) {
                      break L30;
                    } else {
                      dg.field_M = dg.field_M + 1;
                      break L30;
                    }
                  }
                  var5 = b.field_d * b.field_d;
                  var6 = -(dg.field_M * dg.field_M) + var5;
                  var7 = var6 * 120 / var5 + kg.field_g;
                  sk.a(false, var7);
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L32: {
                if ((un.field_k ^ -1) == (er.field_i ^ -1)) {
                  break L32;
                } else {
                  L33: {
                    if (cq.field_f == er.field_i) {
                      break L33;
                    } else {
                      ub.field_yb = ub.field_yb - 1;
                      if (-1 == (ub.field_yb ^ -1)) {
                        er.field_i = er.field_h;
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L33;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  L34: {
                    if (!wc.j(124)) {
                      L35: {
                        mo.i(-109);
                        bm.a(true, 1, 127, 1);
                        if (!bd.field_f) {
                          break L35;
                        } else {
                          bd.field_f = false;
                          lp.a((byte) -59, false);
                          break L35;
                        }
                      }
                      if (lb.a((byte) 53, sp.field_g)) {
                        bl.a(-9);
                        break L34;
                      } else {
                        break L34;
                      }
                    } else {
                      break L34;
                    }
                  }
                  er.field_i = mn.field_m;
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L32;
                  }
                }
              }
              ub.field_yb = ub.field_yb + 1;
              if (16 != ub.field_yb) {
                break L1;
              } else {
                L36: {
                  L37: {
                    if (bd.field_f) {
                      break L37;
                    } else {
                      jg.a(0);
                      if (var8 == 0) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  km.h(0);
                  break L36;
                }
                er.field_i = cq.field_f;
                break L1;
              }
            }
            L38: {
              if (sp.field_g != -4) {
                break L38;
              } else {
                ma.field_a.b((byte) -35, 9);
                gh.field_g = true;
                sp.field_g = pl.field_I;
                dg.field_M = b.field_d;
                break L38;
              }
            }
            if (param0) {
              L39: {
                if (4 == (sp.field_g ^ -1)) {
                  L40: {
                    if (mh.field_c == null) {
                      break L40;
                    } else {
                      ml.a(mh.field_c.i(6), 11, -76);
                      vo.field_q = true;
                      sp.field_g = pl.field_I;
                      if (var8 == 0) {
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  var3_int = vd.field_d;
                  bm.a(false, var3_int, 127, sp.field_g);
                  break L39;
                } else {
                  break L39;
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
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ZombieDawnMulti.BA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        boolean discarded$7 = false;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int dupTemp$10 = 0;
        int dupTemp$11 = 0;
        int dupTemp$12 = 0;
        int discarded$13 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        String[] var2_array = null;
        int[] var2_array2 = null;
        so var2_ref = null;
        ae var2_ref2 = null;
        sj var2_ref3 = null;
        wf var2_ref4 = null;
        int var3 = 0;
        nc var3_ref_nc = null;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        ga var4_ref_ga = null;
        int[] var4_ref_int__ = null;
        int var5 = 0;
        fc var6 = null;
        kb var7 = null;
        hk var8 = null;
        qd var9 = null;
        int var9_int = 0;
        int var10 = 0;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        boolean stackIn_126_0 = false;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        boolean stackIn_247_0 = false;
        int stackIn_334_0 = 0;
        int stackIn_334_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        boolean stackOut_125_0 = false;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        boolean stackOut_246_0 = false;
        int stackOut_333_0 = 0;
        int stackOut_333_1 = 0;
        var10 = field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ib.field_a = b.a(true);
              if (!uk.field_O) {
                break L1;
              } else {
                L2: {
                  if (!vk.l((byte) -122)) {
                    break L2;
                  } else {
                    if (!o.field_i) {
                      o.field_i = true;
                      if (var10 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (tk.field_q != dk.field_Ib) {
                    break L3;
                  } else {
                    if (o.field_i) {
                      break L3;
                    } else {
                      break L1;
                    }
                  }
                }
                o.field_i = false;
                tk.field_q = dk.field_Ib;
                break L1;
              }
            }
            if (param0 < -3) {
              L4: {
                id.d((byte) 20);
                if (null == rn.field_f) {
                  break L4;
                } else {
                  if (!rn.field_f.field_e) {
                    break L4;
                  } else {
                    rn.a(-110);
                    vn.a(-29507);
                    break L4;
                  }
                }
              }
              L5: {
                stackOut_28_0 = this;
                stackOut_28_1 = 95;
                stackIn_31_0 = stackOut_28_0;
                stackIn_31_1 = stackOut_28_1;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                if (rn.field_f == null) {
                  stackOut_31_0 = this;
                  stackOut_31_1 = stackIn_31_1;
                  stackOut_31_2 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  break L5;
                } else {
                  stackOut_29_0 = this;
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = 1;
                  stackIn_32_0 = stackOut_29_0;
                  stackIn_32_1 = stackOut_29_1;
                  stackIn_32_2 = stackOut_29_2;
                  break L5;
                }
              }
              L6: {
                this.b((byte) stackIn_32_1, stackIn_32_2 != 0);
                if (kn.field_f) {
                  this.u(-126);
                  kn.field_f = false;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                wf.field_m = wf.field_m + 1;
                if (vk.l((byte) -123)) {
                  this.p(50);
                  if (!vk.l((byte) -126)) {
                    break L7;
                  } else {
                    L8: {
                      if (ge.p(-88)) {
                        discarded$7 = this.c(false, 123);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L7;
                }
              }
              L9: {
                L10: {
                  if (uk.field_O) {
                    break L10;
                  } else {
                    ud.a(t.field_d, 1000);
                    if (!this.c(true, 121)) {
                      break L9;
                    } else {
                      uk.field_O = true;
                      if (var10 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L11: {
                  if (n.c((byte) 107)) {
                    break L11;
                  } else {
                    this.r(-123);
                    if (var10 == 0) {
                      break L9;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (n.a((byte) -68)) {
                    break L12;
                  } else {
                    L13: {
                      if (!cq.a(15000)) {
                        break L13;
                      } else {
                        L14: {
                          stackOut_66_0 = this;
                          stackIn_71_0 = stackOut_66_0;
                          stackIn_67_0 = stackOut_66_0;
                          if (null == rn.field_f) {
                            stackOut_71_0 = this;
                            stackOut_71_1 = 0;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            break L14;
                          } else {
                            stackOut_67_0 = this;
                            stackIn_69_0 = stackOut_67_0;
                            stackOut_69_0 = this;
                            stackOut_69_1 = 1;
                            stackIn_72_0 = stackOut_69_0;
                            stackIn_72_1 = stackOut_69_1;
                            break L14;
                          }
                        }
                        L15: {
                          L16: {
                            var2_int = this.a(stackIn_72_1 != 0, -124);
                            if (var2_int == 1) {
                              break L16;
                            } else {
                              if (2 == var2_int) {
                                break L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L17: {
                            if (null == rn.field_f) {
                              break L17;
                            } else {
                              rn.a(-96);
                              break L17;
                            }
                          }
                          if (var2_int == 2) {
                            cq.a((java.applet.Applet) (this), false);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        this.a(true, true);
                        if (var10 == 0) {
                          break L9;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L18: {
                      if (!wb.k((byte) 115)) {
                        break L18;
                      } else {
                        L19: {
                          if ((er.field_i ^ -1) == (er.field_h ^ -1)) {
                            break L19;
                          } else {
                            this.a(true, false);
                            if (var10 == 0) {
                              break L9;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          var2_int = wg.c((byte) -85);
                          if (var2_int == 1) {
                            rj.a(b.field_b, (byte) -72, mb.field_g);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        this.a(true, true);
                        if (var10 == 0) {
                          break L9;
                        } else {
                          break L18;
                        }
                      }
                    }
                    this.a(true, false);
                    if (var10 == 0) {
                      break L9;
                    } else {
                      break L12;
                    }
                  }
                }
                L21: {
                  if (er.field_i != er.field_h) {
                    break L21;
                  } else {
                    L22: {
                      L23: {
                        var2_int = u.a((byte) -58);
                        if (2 != var2_int) {
                          break L23;
                        } else {
                          rn.a(-92);
                          if (var10 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (-4 != (var2_int ^ -1)) {
                          break L24;
                        } else {
                          bd.field_f = false;
                          lp.a((byte) -90, true);
                          if (var10 == 0) {
                            break L22;
                          } else {
                            break L24;
                          }
                        }
                      }
                      if (var2_int == 4) {
                        bd.field_f = true;
                        rj.a(1, (byte) 124, ej.field_o);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    this.a(true, true);
                    if (var10 == 0) {
                      break L9;
                    } else {
                      break L21;
                    }
                  }
                }
                this.a(true, false);
                break L9;
              }
              L25: while (true) {
                stackOut_125_0 = dd.a(sq.field_U, (byte) -126);
                stackIn_126_0 = stackOut_125_0;
                L26: while (true) {
                  L27: {
                    L28: {
                      if (!stackIn_126_0) {
                        break L28;
                      } else {
                        stackOut_127_0 = 9;
                        stackOut_127_1 = op.field_i;
                        stackIn_334_0 = stackOut_127_0;
                        stackIn_334_1 = stackOut_127_1;
                        stackIn_128_0 = stackOut_127_0;
                        stackIn_128_1 = stackOut_127_1;
                        if (var10 != 0) {
                          break L27;
                        } else {
                          L29: {
                            if (stackIn_128_0 == stackIn_128_1) {
                              bl.a(-9);
                              sp.field_g = 13;
                              gh.field_g = false;
                              vh.field_Fb = s.field_e.f((byte) -48);
                              if (var10 == 0) {
                                continue L25;
                              } else {
                                break L29;
                              }
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            if (-15 != (op.field_i ^ -1)) {
                              break L30;
                            } else {
                              bl.a(-9);
                              hl.a(eg.field_E, (byte) 75, k.f(23000), 150, pk.b(-11834), cb.field_j.length, cb.b(-122, 4), en.a((byte) -110), cb.b(-123, 500), 1024);
                              tg.field_a[0] = (byte) 16;
                              ma.a(aq.k(-55), rn.b(28579), true);
                              gh.field_g = false;
                              sp.field_g = -2;
                              ji.field_c = true;
                              if (var10 == 0) {
                                continue L25;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if ((op.field_i ^ -1) == -16) {
                              L32: {
                                if (!ji.field_c) {
                                  break L32;
                                } else {
                                  bl.a(-9);
                                  ld.j(1481707568);
                                  w.c(0);
                                  hh.field_b = false;
                                  ji.field_c = false;
                                  cp.field_K = false;
                                  bi.field_e = true;
                                  sp.field_g = 1;
                                  ch.field_k = true;
                                  if (!re.field_b) {
                                    break L32;
                                  } else {
                                    gk.a((byte) 16);
                                    break L32;
                                  }
                                }
                              }
                              vo.field_q = false;
                              gh.field_g = false;
                              if (var10 == 0) {
                                continue L25;
                              } else {
                                break L31;
                              }
                            } else {
                              break L31;
                            }
                          }
                          L33: {
                            if ((op.field_i ^ -1) != -11) {
                              break L33;
                            } else {
                              if (ji.field_c) {
                                ck.a(-2061);
                                if (var10 == 0) {
                                  continue L25;
                                } else {
                                  break L33;
                                }
                              } else {
                                break L33;
                              }
                            }
                          }
                          L34: {
                            L35: {
                              if (op.field_i == 57) {
                                break L35;
                              } else {
                                if (58 == op.field_i) {
                                  break L35;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            bl.a(-9);
                            discarded$8 = s.field_e.g(31365);
                            var2_array = new String[s.field_e.g(31365)];
                            var3 = -2;
                            var3 = s.field_e.g(31365);
                            var4 = 0;
                            L36: while (true) {
                              L37: {
                                L38: {
                                  if (var4 >= var2_array.length) {
                                    break L38;
                                  } else {
                                    var2_array[var4] = s.field_e.c(0);
                                    var4++;
                                    if (var10 != 0) {
                                      break L37;
                                    } else {
                                      if (var10 == 0) {
                                        continue L36;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                L39: {
                                  if ((var3 ^ -1) > -255) {
                                    break L39;
                                  } else {
                                    var3 = -2;
                                    break L39;
                                  }
                                }
                                var4 = s.field_e.g(31365);
                                break L37;
                              }
                              L40: {
                                L41: {
                                  var5 = 0;
                                  if ((var2_array.length ^ -1) < -3) {
                                    break L41;
                                  } else {
                                    if (var2_array.length <= 1) {
                                      break L40;
                                    } else {
                                      var5 = 1;
                                      if (var10 == 0) {
                                        break L40;
                                      } else {
                                        break L41;
                                      }
                                    }
                                  }
                                }
                                var5 = 2;
                                break L40;
                              }
                              L42: {
                                if ((var5 ^ -1) == -1) {
                                  var4 = 0;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              L43: {
                                var6 = wh.a(bn.field_d.a((byte) -85, var4), -86);
                                var7 = new kb(var2_array, var6);
                                var8 = new hk();
                                var7.a(2, s.field_e);
                                var7.field_r = var4;
                                discarded$9 = s.field_e.g(31365);
                                if (-58 != (op.field_i ^ -1)) {
                                  break L43;
                                } else {
                                  var9_int = 0;
                                  L44: while (true) {
                                    L45: {
                                      L46: {
                                        if (-6 >= (var9_int ^ -1)) {
                                          break L46;
                                        } else {
                                          dupTemp$10 = s.field_e.g(31365);
                                          ll.field_k.field_m[var9_int] = dupTemp$10;
                                          var8.field_d[var9_int] = dupTemp$10;
                                          var9_int++;
                                          if (var10 != 0) {
                                            break L45;
                                          } else {
                                            if (var10 == 0) {
                                              continue L44;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                      }
                                      var9_int = 0;
                                      break L45;
                                    }
                                    L47: while (true) {
                                      L48: {
                                        L49: {
                                          if (var9_int >= 5) {
                                            break L49;
                                          } else {
                                            dupTemp$11 = s.field_e.g(31365);
                                            ll.field_k.field_g[var9_int] = dupTemp$11;
                                            var8.field_f[var9_int] = dupTemp$11;
                                            var9_int++;
                                            if (var10 != 0) {
                                              break L48;
                                            } else {
                                              if (var10 == 0) {
                                                continue L47;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                        }
                                        var9_int = 0;
                                        break L48;
                                      }
                                      L50: while (true) {
                                        L51: {
                                          if (-4 >= (var9_int ^ -1)) {
                                            break L51;
                                          } else {
                                            dupTemp$12 = s.field_e.g(31365);
                                            ll.field_k.field_s[var9_int] = dupTemp$12;
                                            var8.field_c[var9_int] = dupTemp$12;
                                            var9_int++;
                                            if (var10 != 0) {
                                              break L43;
                                            } else {
                                              if (var10 == 0) {
                                                continue L50;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                        }
                                        var8.a(7054, s.field_e);
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                              L52: {
                                L53: {
                                  var9 = new qd(var7, var8, var3);
                                  if (57 == op.field_i) {
                                    break L53;
                                  } else {
                                    af.field_e = var9;
                                    cp.field_K = true;
                                    wp.field_h = var9;
                                    if (var10 == 0) {
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                hh.field_b = true;
                                wp.field_h = var9;
                                np.field_m = var9;
                                wg.b((byte) 68);
                                re.field_b = true;
                                break L52;
                              }
                              sp.field_g = -7;
                              vo.field_q = false;
                              if (var10 == 0) {
                                continue L25;
                              } else {
                                break L34;
                              }
                            }
                          }
                          L54: {
                            if ((op.field_i ^ -1) == -60) {
                              L55: {
                                L56: {
                                  if (hh.field_b) {
                                    break L56;
                                  } else {
                                    if (cp.field_K) {
                                      break L56;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                                L57: {
                                  if (-2 != (op.field_m.field_t ^ -1)) {
                                    break L57;
                                  } else {
                                    if (var10 == 0) {
                                      continue L25;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                                L58: {
                                  bl.a(-9);
                                  if (hh.field_b) {
                                    np.field_m.a(false, 24295, false);
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                }
                                L59: {
                                  id.field_D = 0;
                                  bi.field_e = true;
                                  hh.field_b = false;
                                  cp.field_K = false;
                                  sp.field_g = -2;
                                  if (!re.field_b) {
                                    break L59;
                                  } else {
                                    gk.a((byte) 16);
                                    break L59;
                                  }
                                }
                                qd.field_bb = false;
                                break L55;
                              }
                              vo.field_q = false;
                              if (var10 == 0) {
                                continue L25;
                              } else {
                                break L54;
                              }
                            } else {
                              break L54;
                            }
                          }
                          L60: {
                            if (71 != op.field_i) {
                              break L60;
                            } else {
                              var2_array2 = da.a(8);
                              var3_ref_int__ = var2_array2;
                              var4_ref_ga = s.field_e;
                              var5 = 0;
                              L61: while (true) {
                                L62: {
                                  L63: {
                                    if (var5 >= 8) {
                                      break L63;
                                    } else {
                                      var3_ref_int__[var5] = ((k) ((Object) var4_ref_ga)).i(-1478490344);
                                      var5++;
                                      if (var10 != 0) {
                                        break L62;
                                      } else {
                                        if (var10 == 0) {
                                          continue L61;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                  }
                                  var3_ref_int__ = var2_array2;
                                  break L62;
                                }
                                var4_ref_int__ = k.field_n;
                                var5 = 0;
                                L64: while (true) {
                                  L65: {
                                    if (var5 >= 8) {
                                      break L65;
                                    } else {
                                      var3_ref_int__[var5] = tq.b(var3_ref_int__[var5], var4_ref_int__[var5] ^ -1);
                                      var5++;
                                      if (var10 != 0) {
                                        continue L25;
                                      } else {
                                        if (var10 == 0) {
                                          continue L64;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                  }
                                  var3 = 0;
                                  L66: while (true) {
                                    L67: {
                                      if (256 <= var3) {
                                        break L67;
                                      } else {
                                        stackOut_246_0 = fq.a(var3, 127, var2_array2);
                                        stackIn_126_0 = stackOut_246_0;
                                        stackIn_247_0 = stackOut_246_0;
                                        if (var10 != 0) {
                                          continue L26;
                                        } else {
                                          L68: {
                                            if (stackIn_247_0) {
                                              bh.field_d.a(new er(var3), false);
                                              var4_ref_int__ = fc.field_m;
                                              var5 = var3;
                                              var4_ref_int__[var5 >> 2867749] = cr.b(var4_ref_int__[var5 >> 2867749], 1 << tq.b(31, var5));
                                              var4_ref_int__ = k.field_n;
                                              var5 = var3;
                                              var4_ref_int__[var5 >> -2092973051] = cr.b(var4_ref_int__[var5 >> -2092973051], 1 << tq.b(31, var5));
                                              break L68;
                                            } else {
                                              break L68;
                                            }
                                          }
                                          var3++;
                                          if (var10 == 0) {
                                            continue L66;
                                          } else {
                                            break L67;
                                          }
                                        }
                                      }
                                    }
                                    if (var10 == 0) {
                                      continue L25;
                                    } else {
                                      break L60;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L69: {
                            if (-62 != (op.field_i ^ -1)) {
                              break L69;
                            } else {
                              if (wp.field_h != null) {
                                break L69;
                              } else {
                                bd.a("got MOVE without a game", (Throwable) null, false);
                                if (var10 == 0) {
                                  continue L25;
                                } else {
                                  break L69;
                                }
                              }
                            }
                          }
                          L70: {
                            if (wp.field_h != null) {
                              L71: {
                                if (70 != op.field_i) {
                                  break L71;
                                } else {
                                  wp.field_h.field_W = s.field_e.c((byte) -18);
                                  wp.field_h.field_t = bl.a((byte) 107);
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                              L72: {
                                if (62 == op.field_i) {
                                  var2_int = s.field_e.g(31365);
                                  var3_ref_int__ = new int[op.field_m.field_t];
                                  var4 = 0;
                                  L73: while (true) {
                                    L74: {
                                      L75: {
                                        if (op.field_m.field_t <= var4) {
                                          break L75;
                                        } else {
                                          var3_ref_int__[var4] = s.field_e.d((byte) 69);
                                          op.field_m.field_v[var4] = s.field_e.d((byte) 69);
                                          op.field_m.field_o[var4] = s.field_e.d((byte) 69);
                                          var4++;
                                          if (var10 != 0) {
                                            break L74;
                                          } else {
                                            if (var10 == 0) {
                                              continue L73;
                                            } else {
                                              break L75;
                                            }
                                          }
                                        }
                                      }
                                      var4 = s.field_e.d((byte) 69);
                                      break L74;
                                    }
                                    L76: {
                                      if (!re.field_b) {
                                        break L76;
                                      } else {
                                        gk.a((byte) 16);
                                        re.field_b = false;
                                        break L76;
                                      }
                                    }
                                    wp.field_h.a(var2_int, var4, (byte) 121, var3_ref_int__);
                                    if (var10 == 0) {
                                      continue L25;
                                    } else {
                                      break L72;
                                    }
                                  }
                                } else {
                                  break L72;
                                }
                              }
                              L77: {
                                if (61 != op.field_i) {
                                  break L77;
                                } else {
                                  var2_ref = kn.a((byte) 127, s.field_e);
                                  wp.field_h.a(false, var2_ref);
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L77;
                                  }
                                }
                              }
                              L78: {
                                if (-73 != (op.field_i ^ -1)) {
                                  break L78;
                                } else {
                                  var2_ref2 = nq.a(22272, s.field_e);
                                  wp.field_h.a(false, var2_ref2);
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L78;
                                  }
                                }
                              }
                              L79: {
                                if (-74 == (op.field_i ^ -1)) {
                                  var2_ref3 = dm.a((byte) 74, s.field_e);
                                  wp.field_h.a(false, var2_ref3);
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L79;
                                  }
                                } else {
                                  break L79;
                                }
                              }
                              L80: {
                                if (op.field_i != 79) {
                                  break L80;
                                } else {
                                  wp.field_h.a(false, nk.a(20399, s.field_e));
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                              L81: {
                                if ((op.field_i ^ -1) == -82) {
                                  wp.field_h.a(false, li.a((byte) -119, s.field_e));
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L81;
                                  }
                                } else {
                                  break L81;
                                }
                              }
                              L82: {
                                if (op.field_i != 78) {
                                  break L82;
                                } else {
                                  wp.field_h.a(false, oa.a(s.field_e, 14));
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L82;
                                  }
                                }
                              }
                              L83: {
                                if ((op.field_i ^ -1) != -75) {
                                  break L83;
                                } else {
                                  wp.field_h.a(false, qm.a(s.field_e, true));
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L83;
                                  }
                                }
                              }
                              L84: {
                                if ((op.field_i ^ -1) != -78) {
                                  break L84;
                                } else {
                                  wp.field_h.a(false, qk.a(s.field_e, (byte) -114));
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L84;
                                  }
                                }
                              }
                              L85: {
                                if ((op.field_i ^ -1) != -77) {
                                  break L85;
                                } else {
                                  wp.field_h.a(false, gn.a(-1, s.field_e));
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L85;
                                  }
                                }
                              }
                              L86: {
                                if (op.field_i != 80) {
                                  break L86;
                                } else {
                                  var2_ref4 = wq.a(s.field_e, -128);
                                  if (var2_ref4.field_q == 255) {
                                    continue L25;
                                  } else {
                                    wp.field_h.a(false, var2_ref4);
                                    if (var10 == 0) {
                                      continue L25;
                                    } else {
                                      break L86;
                                    }
                                  }
                                }
                              }
                              L87: {
                                if (82 == op.field_i) {
                                  wp.field_h.a(false, hc.a(0, s.field_e));
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L87;
                                  }
                                } else {
                                  break L87;
                                }
                              }
                              L88: {
                                if (65 != op.field_i) {
                                  break L88;
                                } else {
                                  op.field_m.field_j = s.field_e.g(31365);
                                  if (null == np.field_m) {
                                    continue L25;
                                  } else {
                                    ab.field_h.f(125);
                                    if (var10 == 0) {
                                      continue L25;
                                    } else {
                                      break L88;
                                    }
                                  }
                                }
                              }
                              L89: {
                                if ((op.field_i ^ -1) == -65) {
                                  var2_int = s.field_e.g(31365);
                                  System.out.println(" players resigned: " + Integer.toBinaryString(var2_int));
                                  op.field_m.field_F = var2_int;
                                  if (var10 == 0) {
                                    continue L25;
                                  } else {
                                    break L89;
                                  }
                                } else {
                                  break L89;
                                }
                              }
                              if (-67 == (op.field_i ^ -1)) {
                                discarded$13 = s.field_e.g(31365);
                                if (var10 == 0) {
                                  continue L25;
                                } else {
                                  break L70;
                                }
                              } else {
                                break L70;
                              }
                            } else {
                              break L70;
                            }
                          }
                          this.j(-13);
                          if (var10 == 0) {
                            continue L25;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    stackOut_333_0 = 0;
                    stackOut_333_1 = 0;
                    stackIn_334_0 = stackOut_333_0;
                    stackIn_334_1 = stackOut_333_1;
                    break L27;
                  }
                  L90: {
                    cb.a(stackIn_334_0, stackIn_334_1 != 0);
                    if (iq.field_f) {
                      id.field_D = 0;
                      break L90;
                    } else {
                      break L90;
                    }
                  }
                  L91: {
                    if (!gh.a(80)) {
                      break L91;
                    } else {
                      L92: {
                        L93: {
                          var2_int = this.m(10);
                          if ((var2_int ^ -1) == -1) {
                            break L93;
                          } else {
                            if (var2_int != 1) {
                              break L92;
                            } else {
                              break L93;
                            }
                          }
                        }
                        L94: {
                          of.b((byte) 119);
                          if (var2_int != 1) {
                            break L94;
                          } else {
                            vo.field_q = true;
                            gh.field_g = true;
                            if (var10 == 0) {
                              break L92;
                            } else {
                              break L94;
                            }
                          }
                        }
                        L95: {
                          if (!ji.field_c) {
                            break L95;
                          } else {
                            L96: {
                              L97: {
                                ch.field_k = true;
                                bi.field_e = true;
                                if (!hh.field_b) {
                                  break L97;
                                } else {
                                  vh.field_Fb = qd.field_V;
                                  bm.a(false, 13, 127, 1);
                                  if (var10 == 0) {
                                    break L96;
                                  } else {
                                    break L97;
                                  }
                                }
                              }
                              bm.a(false, 1, 125, 1);
                              break L96;
                            }
                            L98: {
                              bl.a(-9);
                              var3_ref_nc = gk.a(2, pl.field_I);
                              if (var3_ref_nc != null) {
                                var3_ref_nc.a(0, false, 0);
                                break L98;
                              } else {
                                break L98;
                              }
                            }
                            cp.field_K = false;
                            hh.field_b = false;
                            ji.field_c = false;
                            if (!re.field_b) {
                              break L95;
                            } else {
                              gk.a((byte) 16);
                              re.field_b = false;
                              break L95;
                            }
                          }
                        }
                        gh.field_g = false;
                        vo.field_q = false;
                        break L92;
                      }
                      L99: {
                        var3 = 0;
                        if (-3 == (var2_int ^ -1)) {
                          var3 = 1;
                          break L99;
                        } else {
                          break L99;
                        }
                      }
                      L100: {
                        L101: {
                          if (ji.field_c) {
                            break L101;
                          } else {
                            if (gh.field_g) {
                              break L101;
                            } else {
                              if (!vo.field_q) {
                                break L100;
                              } else {
                                break L101;
                              }
                            }
                          }
                        }
                        var3 = 1;
                        break L100;
                      }
                      L102: {
                        if (gh.a(83)) {
                          break L102;
                        } else {
                          var3 = 0;
                          break L102;
                        }
                      }
                      if (var3 == 0) {
                        break L91;
                      } else {
                        ib.a(-101);
                        break L91;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
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
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.MA(" + param0 + ')');
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

    public static void t(int param0) {
        try {
            field_F = null;
            field_L = (ja[][]) null;
            int var1_int = 127 % ((param0 - -76) / 45);
            field_I = null;
            field_K = null;
            field_M = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ZombieDawnMulti.EA(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        ca discarded$2 = null;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (qc.field_s != null) {
                h.a(qc.field_s, -65);
                so.d(-6445);
                qc.field_s = null;
                o.d(26673);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ii.field_a = u.a(5, 2);
              if (param0 <= -117) {
                break L2;
              } else {
                discarded$2 = ZombieDawnMulti.a(-2, (byte) -9, (ul) null, (ul) null, -109);
                break L2;
              }
            }
            cg.field_n = u.a(5, 3);
            ki.field_m = u.a(5, 8);
            pf.field_b = u.a(5, 4);
            rn.field_e = u.a(5, 5);
            de.field_e = u.a(5, 6);
            df.field_M = u.a(5, 7);
            ha.field_g = u.a(5, 11);
            il.field_n = u.a(5, 12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.LA(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException runtimeException = null;
        ae var2 = null;
        ae var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_E ? 1 : 0;
        try {
          L0: {
            cf.field_s.b(-198);
            if (bi.field_e) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              op.field_m.field_H = param0 + cf.field_s.field_m.field_H;
              var2 = (ae) ((Object) cf.field_s.field_q.c(71));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 == null) {
                      break L3;
                    } else {
                      var3 = (ae) ((Object) cf.field_s.field_q.b(6));
                      var2.a((byte) -123);
                      var2.field_f = var2.field_f + 50;
                      wp.field_h.a(false, var2);
                      var2 = var3;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "ZombieDawnMulti.GA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ca a(int param0, byte param1, ul param2, ul param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ca stackIn_5_0 = null;
        ca stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ca stackOut_6_0 = null;
        ca stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (ud.a(param0, param3, param4, (byte) -42)) {
              if (param1 == -19) {
                stackOut_6_0 = hc.a(true, param2.a(param0, true, param4));
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (ca) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ZombieDawnMulti.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final boolean c(boolean param0, int param1) {
        ri[] discarded$15 = null;
        ri discarded$16 = null;
        ri discarded$17 = null;
        ri discarded$18 = null;
        ri discarded$19 = null;
        ri discarded$20 = null;
        ri discarded$21 = null;
        ri discarded$22 = null;
        ri discarded$23 = null;
        ri discarded$24 = null;
        ri discarded$25 = null;
        ri discarded$26 = null;
        ri discarded$27 = null;
        ja[] discarded$28 = null;
        di discarded$29 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        ja[][] var3_array = null;
        ri[] var3_array2 = null;
        ja[][] var4_ref_ja____ = null;
        int var4 = 0;
        String[][] var5 = null;
        ri var5_ref = null;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        ja[] stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        ja[] stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        int stackIn_158_2 = 0;
        ja[] stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        ja[] stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        double stackIn_161_3 = 0.0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_183_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        ja[] stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        int stackOut_155_2 = 0;
        ja[] stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int stackOut_160_2 = 0;
        double stackOut_160_3 = 0.0;
        ja[] stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        int stackOut_156_2 = 0;
        ja[] stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_158_2 = 0;
        double stackOut_158_3 = 0.0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_177_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_108_0 = 0;
        var6 = field_E ? 1 : 0;
        try {
          L0: {
            so.d(-6445);
            if (pf.field_b != null) {
              L1: {
                if (!al.field_eb.a((byte) -110)) {
                  break L1;
                } else {
                  if (al.field_eb.a(false, "basic")) {
                    L2: {
                      if (!al.field_eb.a((byte) -124)) {
                        break L2;
                      } else {
                        if (!al.field_eb.a(false, "lobby")) {
                          break L2;
                        } else {
                          L3: {
                            if (!he.field_f.a((byte) -108)) {
                              break L3;
                            } else {
                              if (he.field_f.a(false, "lobby")) {
                                L4: {
                                  if (!al.field_eb.a((byte) -120)) {
                                    break L4;
                                  } else {
                                    if (al.field_eb.a(false, "arialish12")) {
                                      L5: {
                                        if (!he.field_f.a((byte) -128)) {
                                          break L5;
                                        } else {
                                          if (he.field_f.a(false, "arialish12")) {
                                            L6: {
                                              if (!pf.field_b.a((byte) -116)) {
                                                break L6;
                                              } else {
                                                if (!pf.field_b.a(0)) {
                                                  break L6;
                                                } else {
                                                  L7: {
                                                    if (!ki.field_m.a((byte) -122)) {
                                                      break L7;
                                                    } else {
                                                      if (!ki.field_m.a(0)) {
                                                        break L7;
                                                      } else {
                                                        L8: {
                                                          if (!rn.field_e.a((byte) -114)) {
                                                            break L8;
                                                          } else {
                                                            if (!rn.field_e.a(0)) {
                                                              break L8;
                                                            } else {
                                                              L9: {
                                                                if (!de.field_e.a((byte) -118)) {
                                                                  break L9;
                                                                } else {
                                                                  if (de.field_e.a(0)) {
                                                                    L10: {
                                                                      if (!df.field_M.a((byte) -126)) {
                                                                        break L10;
                                                                      } else {
                                                                        if (df.field_M.a(0)) {
                                                                          L11: {
                                                                            if (!ii.field_a.a((byte) -115)) {
                                                                              break L11;
                                                                            } else {
                                                                              if (ii.field_a.a(0)) {
                                                                                L12: {
                                                                                  if (!cg.field_n.a((byte) -124)) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    if (!cg.field_n.a(0)) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      L13: {
                                                                                        if (!ha.field_g.a((byte) -111)) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          if (!ha.field_g.a(0)) {
                                                                                            break L13;
                                                                                          } else {
                                                                                            L14: {
                                                                                              if (!il.field_n.a((byte) -121)) {
                                                                                                break L14;
                                                                                              } else {
                                                                                                if (!il.field_n.a(0)) {
                                                                                                  break L14;
                                                                                                } else {
                                                                                                  qm.a(65.0f, 80, dn.field_b);
                                                                                                  if (param0) {
                                                                                                    ub.m(-121);
                                                                                                    this.g(-30169);
                                                                                                    gd.field_Q = new me(pf.field_b, rn.field_e);
                                                                                                    ei.field_a[68] = jc.a(pf.field_b, "", "zombie_dawn_menu_button").a();
                                                                                                    ei.field_a[69] = jc.a(pf.field_b, "", "zombie_dawn_menu_screen_mouseover").a();
                                                                                                    ei.field_a[0] = jc.a(pf.field_b, "", "zombie_detonate").a();
                                                                                                    ei.field_a[44] = jc.a(pf.field_b, "", "zombie_dawn_gunfire").a();
                                                                                                    ei.field_a[45] = jc.a(pf.field_b, "", "zombie_dawn_shotgun_fire").a();
                                                                                                    ei.field_a[8] = jc.a(pf.field_b, "", "zombie_dawn_machinegun_fire").a();
                                                                                                    ei.field_a[20] = jc.a(pf.field_b, "", "zombie_dawn_click_mouse").a();
                                                                                                    ei.field_a[30] = jc.a(pf.field_b, "", "zombie_dawn_thump_1").a();
                                                                                                    ei.field_a[31] = jc.a(pf.field_b, "", "zombie_dawn_thump_2").a();
                                                                                                    ei.field_a[32] = jc.a(pf.field_b, "", "zombie_dawn_swipe_1").a();
                                                                                                    ei.field_a[33] = jc.a(pf.field_b, "", "zombie_dawn_swipe_2").a();
                                                                                                    ei.field_a[34] = jc.a(pf.field_b, "", "zombie_dawn_slap_1").a();
                                                                                                    ei.field_a[47] = jc.a(pf.field_b, "", "zombie_dawn_second_tick").a();
                                                                                                    ei.field_a[53] = jc.a(pf.field_b, "", "zombie_dawn_reactor_ambience").a();
                                                                                                    ei.field_a[54] = jc.a(pf.field_b, "", "zombie_dawn_score_10").a();
                                                                                                    ei.field_a[55] = jc.a(pf.field_b, "", "zombie_dawn_score_20").a();
                                                                                                    ei.field_a[56] = jc.a(pf.field_b, "", "zombie_dawn_score_30").a();
                                                                                                    ei.field_a[57] = jc.a(pf.field_b, "", "zombie_dawn_countup_victims").a();
                                                                                                    ei.field_a[58] = jc.a(pf.field_b, "", "zombie_dawn_countup_score").a();
                                                                                                    ei.field_a[59] = jc.a(pf.field_b, "", "zombie_dawn_click_mouse_wrong").a();
                                                                                                    ei.field_a[63] = jc.a(pf.field_b, "", "zombie_dawn_gun_empty").a();
                                                                                                    ei.field_a[12] = jc.a(pf.field_b, "", "zombie_dawn_squelch_3").a();
                                                                                                    ei.field_a[66] = jc.a(pf.field_b, "", "zombie_dawn_squelch_2_AND_3").a();
                                                                                                    ei.field_a[64] = jc.a(pf.field_b, "", "zombie_dawn_smash_wood_and_glass_1").a();
                                                                                                    ei.field_a[65] = jc.a(pf.field_b, "", "zombie_dawn_smash_wood_and_glass_2").a();
                                                                                                    ei.field_a[67] = jc.a(pf.field_b, "", "zombie_dawn_use_powerup").a();
                                                                                                    ei.field_a[36] = jc.a(pf.field_b, "", "zombie_dawn_bounce").a();
                                                                                                    ei.field_a[35] = jc.a(pf.field_b, "", "zd_multi_hammer").a();
                                                                                                    ei.field_a[81] = jc.a(pf.field_b, "", "zd_multi_barrier").a();
                                                                                                    ei.field_a[82] = jc.a(pf.field_b, "", "zd_multi_bonefall").a();
                                                                                                    ei.field_a[83] = jc.a(pf.field_b, "", "zd_multi_breach").a();
                                                                                                    ei.field_a[84] = jc.a(pf.field_b, "", "zd_multi_charm").a();
                                                                                                    ei.field_a[85] = jc.a(pf.field_b, "", "zd_multi_fireball").a();
                                                                                                    ei.field_a[86] = jc.a(pf.field_b, "", "zd_multi_haze").a();
                                                                                                    ei.field_a[87] = jc.a(pf.field_b, "", "zd_multi_place_ability").a();
                                                                                                    ei.field_a[88] = jc.a(pf.field_b, "", "zd_multi_portal_ambience").a();
                                                                                                    ei.field_a[89] = jc.a(pf.field_b, "", "zd_multi_quake").a();
                                                                                                    ei.field_a[90] = jc.a(pf.field_b, "", "zd_multi_select_ability").a();
                                                                                                    ei.field_a[91] = jc.a(pf.field_b, "", "zd_multi_select_tree").a();
                                                                                                    pf.field_b = null;
                                                                                                    o.d(26673);
                                                                                                    stackOut_105_0 = 0;
                                                                                                    stackIn_106_0 = stackOut_105_0;
                                                                                                    decompiledRegionSelector0 = 15;
                                                                                                    break L0;
                                                                                                  } else {
                                                                                                    stackOut_103_0 = 0;
                                                                                                    stackIn_104_0 = stackOut_103_0;
                                                                                                    decompiledRegionSelector0 = 14;
                                                                                                    break L0;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            qm.a(80.0f, 80, jj.a(s.field_h, (byte) 113, il.field_n, pd.field_a));
                                                                                            stackOut_100_0 = 0;
                                                                                            stackIn_101_0 = stackOut_100_0;
                                                                                            decompiledRegionSelector0 = 13;
                                                                                            break L0;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      qm.a(75.0f, 80, ki.a(pd.field_a, "", ha.field_g, (byte) 76, s.field_h));
                                                                                      stackOut_92_0 = 0;
                                                                                      stackIn_93_0 = stackOut_92_0;
                                                                                      decompiledRegionSelector0 = 12;
                                                                                      break L0;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                qm.a(60.0f, 80, ki.a(sm.field_b, "", cg.field_n, (byte) 76, bc.field_b));
                                                                                stackOut_84_0 = 0;
                                                                                stackIn_85_0 = stackOut_84_0;
                                                                                decompiledRegionSelector0 = 11;
                                                                                break L0;
                                                                              } else {
                                                                                break L11;
                                                                              }
                                                                            }
                                                                          }
                                                                          qm.a(50.0f, 80, ki.a(bc.field_a, "", ii.field_a, (byte) 76, ei.field_e));
                                                                          stackOut_76_0 = 0;
                                                                          stackIn_77_0 = stackOut_76_0;
                                                                          decompiledRegionSelector0 = 10;
                                                                          break L0;
                                                                        } else {
                                                                          break L10;
                                                                        }
                                                                      }
                                                                    }
                                                                    qm.a(40.0f, 80, ki.a(m.field_A, "", df.field_M, (byte) 76, i.field_d));
                                                                    stackOut_70_0 = 0;
                                                                    stackIn_71_0 = stackOut_70_0;
                                                                    decompiledRegionSelector0 = 9;
                                                                    break L0;
                                                                  } else {
                                                                    break L9;
                                                                  }
                                                                }
                                                              }
                                                              qm.a(30.0f, 80, mo.a(bk.field_k, 0, -3, bb.field_o, de.field_e));
                                                              stackOut_64_0 = 0;
                                                              stackIn_65_0 = stackOut_64_0;
                                                              decompiledRegionSelector0 = 8;
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                        qm.a(20.0f, 80, ki.a(ko.field_i, "", rn.field_e, (byte) 76, hg.field_tb));
                                                        stackOut_58_0 = 0;
                                                        stackIn_59_0 = stackOut_58_0;
                                                        decompiledRegionSelector0 = 7;
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                  qm.a(15.0f, 80, ki.a(sf.field_f, "", ki.field_m, (byte) 76, vf.field_c));
                                                  stackOut_50_0 = 0;
                                                  stackIn_51_0 = stackOut_50_0;
                                                  decompiledRegionSelector0 = 6;
                                                  break L0;
                                                }
                                              }
                                            }
                                            qm.a(10.0f, 80, ki.a(ko.field_i, "", pf.field_b, (byte) 76, hg.field_tb));
                                            stackOut_42_0 = 0;
                                            stackIn_43_0 = stackOut_42_0;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      qm.a(5.0f, 80, ki.a(bc.field_a, "arialish12", he.field_f, (byte) 76, ei.field_e));
                                      stackOut_34_0 = 0;
                                      stackIn_35_0 = stackOut_34_0;
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                qm.a(4.0f, 80, ki.a(bc.field_a, "arialish12", al.field_eb, (byte) 76, ei.field_e));
                                stackOut_28_0 = 0;
                                stackIn_29_0 = stackOut_28_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          qm.a(17.0f, 80, ki.a(sm.field_b, "lobby", he.field_f, (byte) 76, bc.field_b));
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    qm.a(3.0f, 80, ki.a(bc.field_a, "basic", al.field_eb, (byte) 76, ei.field_e));
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              qm.a(3.0f, 80, ki.a(bc.field_a, "basic", al.field_eb, (byte) 76, ei.field_e));
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (rn.field_e == null) {
                if (null != df.field_M) {
                  qm.a(75.0f, 80, me.field_e);
                  this.g(-30169);
                  hl.field_d[0] = ug.a(df.field_M, "", "ZD_multi_TITLESCREEn");
                  hl.field_d[10] = ug.a(df.field_M, "", "ZD_multi_laboratory");
                  hl.field_d[12] = ug.a(df.field_M, "", "ZD_multi_PANIC_LOOP");
                  hl.field_d[11] = ug.a(df.field_M, "", "ZD_multi_GAME_FINISH");
                  hl.field_d[13] = ug.a(df.field_M, "", "ZD_multi_GAME_WIN");
                  hl.field_d[14] = ug.a(df.field_M, "", "ZD_multi_GAME_LOSE");
                  hl.field_d[1] = ug.a(df.field_M, "", "zombie dawn mall");
                  hl.field_d[2] = ug.a(df.field_M, "", "zombie dawn powerplant");
                  hl.field_d[3] = ug.a(df.field_M, "", "zombie dawn precinct");
                  hl.field_d[4] = ug.a(df.field_M, "", "zombie dawn white house");
                  hl.field_d[9] = ug.a(df.field_M, "", "zombie dawn instructions loop");
                  df.field_M = null;
                  o.d(26673);
                  stackOut_113_0 = 0;
                  stackIn_114_0 = stackOut_113_0;
                  decompiledRegionSelector0 = 17;
                  break L0;
                } else {
                  if (param1 > 75) {
                    if (null != de.field_e) {
                      qm.a(77.0f, 80, me.field_e);
                      this.g(-30169);
                      var3_int = 0;
                      L15: while (true) {
                        L16: {
                          L17: {
                            if (var3_int >= 15) {
                              break L17;
                            } else {
                              if (var6 != 0) {
                                break L16;
                              } else {
                                L18: {
                                  if (hl.field_d[var3_int] == null) {
                                    break L18;
                                  } else {
                                    if (wd.field_L.a(-10783, gd.field_Q, 176400, hl.field_d[var3_int], de.field_e)) {
                                      break L18;
                                    } else {
                                      o.d(26673);
                                      stackOut_130_0 = 0;
                                      stackIn_131_0 = stackOut_130_0;
                                      decompiledRegionSelector0 = 19;
                                      break L0;
                                    }
                                  }
                                }
                                var3_int++;
                                if (var6 == 0) {
                                  continue L15;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          wd.field_L.d(125);
                          de.field_e = null;
                          gd.field_Q = null;
                          o.d(26673);
                          break L16;
                        }
                        stackOut_134_0 = 0;
                        stackIn_135_0 = stackOut_134_0;
                        decompiledRegionSelector0 = 20;
                        break L0;
                      }
                    } else {
                      if (null == ki.field_m) {
                        L19: {
                          if (null == al.field_eb) {
                            break L19;
                          } else {
                            if (null == ii.field_a) {
                              break L19;
                            } else {
                              L20: {
                                qm.a(85.0f, 80, bn.field_c);
                                this.g(-30169);
                                qp.field_w = pj.a(al.field_eb, 4, he.field_f, "", "arialish12");
                                if (!he.field_a) {
                                  discarded$15 = da.a("locked", al.field_eb, (byte) 19, "basic");
                                  wl.field_l = da.a("unachieved", al.field_eb, (byte) 19, "basic")[0];
                                  of.field_k = fl.a("basic", "orbcoin", al.field_eb, 11091);
                                  fj.a(100, of.field_k);
                                  var3_array = new ja[2][];
                                  var3_array[0] = pb.a("", ii.field_a, -256, "levelstyle_iconssmall");
                                  var3_array[1] = null;
                                  var4_ref_ja____ = new ja[1][];
                                  var4_ref_ja____[0] = pb.a("", ii.field_a, -256, "levelstyle_iconslarge");
                                  var5 = tj.field_e;
                                  ub.a(var5, he.field_f, true, (String[][]) null, field_K, al.field_eb, 4, da.field_b, il.field_n, 1, cb.field_j, eg.field_E, true, var3_array, var4_ref_ja____);
                                  bo.field_e = true;
                                  lp.a(200, -82);
                                  ua.a(he.field_f, al.field_eb, (byte) 23);
                                  bo.a(16777215, 0, 0, uc.field_b, 0, (java.applet.Applet) (this));
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              he.field_f = null;
                              al.field_eb = null;
                              o.d(26673);
                              qm.a(90.0f, 80, bn.field_c);
                              this.g(-30169);
                              ah.field_e = ap.a(ii.field_a, cg.field_n, "", 4, "font");
                              ff.field_r = vo.a((byte) -46, "", "font_title", cg.field_n, ii.field_a);
                              pb.field_e = pj.a(ii.field_a, 4, cg.field_n, "font_medium", "");
                              lf.a(pb.field_e, 0);
                              vc.a(true);
                              a.field_a = new ri[7][];
                              a.field_a[0] = da.a("cursor_grab", ii.field_a, (byte) 19, "");
                              a.field_a[1] = da.a("cursor_point", ii.field_a, (byte) 19, "");
                              a.field_a[6] = da.a("cursor_point_forbidden", ii.field_a, (byte) 19, "");
                              a.field_a[2] = da.a("cursor_reticule", ii.field_a, (byte) 19, "");
                              a.field_a[3] = da.a("cursor_poweringup", ii.field_a, (byte) 19, "");
                              a.field_a[5] = da.a("cursor_targeting", ii.field_a, (byte) 19, "");
                              a.field_a[4] = da.a("cursor_idle", ii.field_a, (byte) 19, "");
                              wd.field_P = wq.a(-22, "", ii.field_a, "intro_1");
                              eq.field_c = wq.a(-127, "", ii.field_a, "intro_2");
                              bl.field_g = wq.a(88, "", ii.field_a, "intro_3");
                              vh.field_Lb = wq.a(47, "", ii.field_a, "menu_pipe1");
                              dm.field_Wb = wq.a(-122, "", ii.field_a, "menu_pipe2");
                              cc.field_c = wq.a(-126, "", ii.field_a, "menu_pipebox");
                              discarded$16 = wq.a(-121, "", ii.field_a, "menu_pipebox2");
                              no.field_Jb = wq.a(97, "", ii.field_a, "menu_title");
                              dd.field_g = wq.a(-118, "", ii.field_a, "menu_title_blank");
                              ao.field_b = new ja[sm.field_g.length];
                              var3_int = 0;
                              L21: while (true) {
                                L22: {
                                  L23: {
                                    if ((ao.field_b.length ^ -1) >= (var3_int ^ -1)) {
                                      break L23;
                                    } else {
                                      stackOut_151_0 = sm.field_g[var3_int].length() ^ -1;
                                      stackOut_151_1 = -1;
                                      stackIn_164_0 = stackOut_151_0;
                                      stackIn_164_1 = stackOut_151_1;
                                      stackIn_152_0 = stackOut_151_0;
                                      stackIn_152_1 = stackOut_151_1;
                                      if (var6 != 0) {
                                        break L22;
                                      } else {
                                        L24: {
                                          if (stackIn_152_0 >= stackIn_152_1) {
                                            break L24;
                                          } else {
                                            L25: {
                                              stackOut_155_0 = ao.field_b;
                                              stackOut_155_1 = var3_int;
                                              stackOut_155_2 = 113;
                                              stackIn_160_0 = stackOut_155_0;
                                              stackIn_160_1 = stackOut_155_1;
                                              stackIn_160_2 = stackOut_155_2;
                                              stackIn_156_0 = stackOut_155_0;
                                              stackIn_156_1 = stackOut_155_1;
                                              stackIn_156_2 = stackOut_155_2;
                                              if (-16 != (var3_int ^ -1)) {
                                                stackOut_160_0 = (ja[]) ((Object) stackIn_160_0);
                                                stackOut_160_1 = stackIn_160_1;
                                                stackOut_160_2 = stackIn_160_2;
                                                stackOut_160_3 = 1.0;
                                                stackIn_161_0 = stackOut_160_0;
                                                stackIn_161_1 = stackOut_160_1;
                                                stackIn_161_2 = stackOut_160_2;
                                                stackIn_161_3 = stackOut_160_3;
                                                break L25;
                                              } else {
                                                stackOut_156_0 = (ja[]) ((Object) stackIn_156_0);
                                                stackOut_156_1 = stackIn_156_1;
                                                stackOut_156_2 = stackIn_156_2;
                                                stackIn_158_0 = stackOut_156_0;
                                                stackIn_158_1 = stackOut_156_1;
                                                stackIn_158_2 = stackOut_156_2;
                                                stackOut_158_0 = (ja[]) ((Object) stackIn_158_0);
                                                stackOut_158_1 = stackIn_158_1;
                                                stackOut_158_2 = stackIn_158_2;
                                                stackOut_158_3 = 0.65;
                                                stackIn_161_0 = stackOut_158_0;
                                                stackIn_161_1 = stackOut_158_1;
                                                stackIn_161_2 = stackOut_158_2;
                                                stackIn_161_3 = stackOut_158_3;
                                                break L25;
                                              }
                                            }
                                            stackIn_161_0[stackIn_161_1] = wh.a(stackIn_161_2, stackIn_161_3, var3_int);
                                            break L24;
                                          }
                                        }
                                        var3_int++;
                                        if (var6 == 0) {
                                          continue L21;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                  }
                                  vm.field_lb = fl.a("", "lobby_game_logo", ii.field_a, 11091);
                                  ip.field_e = wq.a(-117, "", ii.field_a, "help_arrow");
                                  jl.field_u = wq.a(-119, "", ii.field_a, "info_help_button");
                                  oi.field_k = ip.field_e.d();
                                  oi.field_k.a();
                                  lh.field_m = ip.field_e.d();
                                  lh.field_m.c();
                                  uo.field_n = ip.field_e.d();
                                  uo.field_n.b();
                                  jq.field_c = wq.a(-116, "", ii.field_a, "battery_small_empty");
                                  dj.field_p = wq.a(-117, "", ii.field_a, "battery_big_empty");
                                  discarded$17 = wq.a(-121, "", ii.field_a, "battery_big_full");
                                  ol.field_n = fl.a("", "vat", ii.field_a, 11091);
                                  discarded$18 = wq.a(70, "", ii.field_a, "vat_outline");
                                  em.field_X = wq.a(47, "", ii.field_a, "lab_pipe");
                                  nm.field_w = fl.a("", "lab_box_1", ii.field_a, 11091);
                                  discarded$19 = wq.a(-122, "", ii.field_a, "lab_box_2");
                                  discarded$20 = wq.a(-125, "", ii.field_a, "lab_box_3");
                                  discarded$21 = wq.a(-123, "", ii.field_a, "lab_box_1_outline");
                                  discarded$22 = wq.a(15, "", ii.field_a, "lab_box_2_outline");
                                  discarded$23 = wq.a(-118, "", ii.field_a, "lab_box_3_outline");
                                  fg.field_m = fl.a("", "lab_tree_frame_bw", ii.field_a, 11091);
                                  v.field_e = wq.a(15, "", ii.field_a, "lab_menu_bg_center");
                                  pi.field_f = wq.a(95, "", ii.field_a, "lab_menu_bg_bottom");
                                  discarded$24 = wq.a(4, "", ii.field_a, "lab_tree_bg");
                                  lm.field_eb = fl.a("", "slider", ii.field_a, 11091);
                                  s.field_c = wq.a(14, "", ii.field_a, "research_trait_slot");
                                  pf.field_a = wq.a(-119, "", ii.field_a, "research_powerup_modifier_slot");
                                  el.field_E = wq.a(-120, "", ii.field_a, "forbidden_big");
                                  nj.field_d = wq.a(-124, "", ii.field_a, "scrollbar_arrow_over");
                                  fq.field_k = fl.a("", "scrollbar_arrow_off", ii.field_a, 11091);
                                  df.field_Q = pb.a("", ii.field_a, -256, "scrollbar_block");
                                  wc.field_M = pb.a("", ii.field_a, -256, "scrollbar_background");
                                  kj.field_m = wq.a(102, "", ii.field_a, "scrollbar_bg");
                                  discarded$25 = wq.a(-127, "", ii.field_a, "scrollbar_bar_h");
                                  discarded$26 = wq.a(79, "", ii.field_a, "scrollbar_bar_v");
                                  vl.field_f = nj.field_d.d();
                                  ek.field_J = fq.field_k.c();
                                  hp.field_t = kj.field_m.d();
                                  vl.field_f.b();
                                  ek.field_J.g();
                                  hp.field_t.b();
                                  qb.field_h = wq.a(-126, "", ii.field_a, "results_tube");
                                  na.field_I = wq.a(0, "", ii.field_a, "crate_box");
                                  qj.field_m = wq.a(-42, "", ii.field_a, "curve_tube");
                                  wk.field_J = wq.a(24, "", ii.field_a, "curve_tube_empty");
                                  hn.field_i = wq.a(93, "", ii.field_a, "empty_jar");
                                  rg.field_C = wq.a(-124, "", ii.field_a, "main_tube");
                                  ul.field_f = wq.a(-122, "", ii.field_a, "plug_01");
                                  rq.field_l = wq.a(35, "", ii.field_a, "plug_02");
                                  pq.field_o = wq.a(56, "", ii.field_a, "vert_tube");
                                  tm.field_f = wq.a(109, "", ii.field_a, "vert_tube_empty");
                                  pm.field_N = wq.a(31, "", ii.field_a, "curve_tube_mask");
                                  w.field_z = wq.a(116, "", ii.field_a, "vert_tube_mask");
                                  discarded$27 = wq.a(27, "", ii.field_a, "stars");
                                  pp.field_q = da.a("engine_icons", ii.field_a, (byte) 19, "");
                                  jq.field_e = wq.a(-126, "", ii.field_a, "pipe_frame");
                                  jq.field_e.e();
                                  bb.field_n = new ja(48, 48);
                                  na.field_H[0] = da.a("portal2", ii.field_a, (byte) 19, "");
                                  ud.field_Q = wq.a(-116, "", ii.field_a, "portal_foo_mask");
                                  cp.field_X = pb.a("", ii.field_a, -256, "blood");
                                  wa.field_b = pb.a("", ii.field_a, -256, "powerups");
                                  td.field_c = pb.a("", ii.field_a, -256, "explosion");
                                  od.field_Fb = pb.a("", ii.field_a, -256, "miasma");
                                  no.field_Hb[0] = pb.a("", ii.field_a, -256, "character_zombie0");
                                  no.field_Hb[1] = pb.a("", ii.field_a, -256, "character_zombie1");
                                  wq.field_c[0] = pb.a("", ii.field_a, -256, "character_human0");
                                  wq.field_c[1] = pb.a("", ii.field_a, -256, "character_human1");
                                  wq.field_c[2] = pb.a("", ii.field_a, -256, "character_human2");
                                  wq.field_c[3] = pb.a("", ii.field_a, -256, "character_human3");
                                  wq.field_c[4] = pb.a("", ii.field_a, -256, "character_human4");
                                  wq.field_c[5] = pb.a("", ii.field_a, -256, "character_human5");
                                  wq.field_c[6] = pb.a("", ii.field_a, -256, "character_human6");
                                  wq.field_c[7] = pb.a("", ii.field_a, -256, "character_human7");
                                  wq.field_c[8] = pb.a("", ii.field_a, -256, "character_human8");
                                  wq.field_c[9] = pb.a("", ii.field_a, -256, "character_human9");
                                  wq.field_c[10] = pb.a("", ii.field_a, -256, "character_human10");
                                  wq.field_c[11] = pb.a("", ii.field_a, -256, "character_human11");
                                  wq.field_c[12] = pb.a("", ii.field_a, -256, "character_human12");
                                  wq.field_c[13] = pb.a("", ii.field_a, -256, "character_human13");
                                  wq.field_c[14] = pb.a("", ii.field_a, -256, "character_human14");
                                  wq.field_c[15] = pb.a("", ii.field_a, -256, "character_human15");
                                  wq.field_c[16] = pb.a("", ii.field_a, -256, "character_human16");
                                  wq.field_c[17] = pb.a("", ii.field_a, -256, "character_human17");
                                  wq.field_c[18] = pb.a("", ii.field_a, -256, "character_human18");
                                  wq.field_c[19] = pb.a("", ii.field_a, -256, "character_human19");
                                  wq.field_c[20] = pb.a("", ii.field_a, -256, "character_human20");
                                  stackOut_163_0 = 0;
                                  stackOut_163_1 = -70;
                                  stackIn_164_0 = stackOut_163_0;
                                  stackIn_164_1 = stackOut_163_1;
                                  break L22;
                                }
                                L26: {
                                  if (le.b(stackIn_164_0, (byte) stackIn_164_1)) {
                                    wq.field_c[21] = pb.a("halloween", ii.field_a, -256, "halloween_human1");
                                    wq.field_c[22] = pb.a("halloween", ii.field_a, -256, "halloween_human2");
                                    break L26;
                                  } else {
                                    break L26;
                                  }
                                }
                                L27: {
                                  L28: {
                                    pn.field_c = da.a("character_charming", ii.field_a, (byte) 19, "");
                                    sh.field_N = da.a("character_charmed", ii.field_a, (byte) 19, "");
                                    aa.field_h = da.a("character_stunned", ii.field_a, (byte) 19, "");
                                    ig.field_d = pb.a("", ii.field_a, -256, "character_common");
                                    ej.a(fl.a("", "zombie_counter_instructions", ii.field_a, 11091), (byte) -100, fl.a("", "hud", ii.field_a, 11091));
                                    rq.a(pb.a("", ii.field_a, -256, "popup"), 16777215);
                                    sq.a(4, pb.a("", ii.field_a, -256, "carpark_floor"), false);
                                    gd.a(false, 4, pb.a("", ii.field_a, -256, "carpark_tiles"));
                                    sq.a(0, pb.a("", ii.field_a, -256, "mall_floor"), false);
                                    gd.a(false, 0, pb.a("", ii.field_a, -256, "mall_tiles"));
                                    sq.a(1, pb.a("", ii.field_a, -256, "powerplant_floor"), false);
                                    gd.a(false, 1, pb.a("", ii.field_a, -256, "powerplant_tiles"));
                                    sq.a(2, pb.a("", ii.field_a, -256, "precinct_floor"), false);
                                    gd.a(false, 2, pb.a("", ii.field_a, -256, "precinct_tiles"));
                                    sq.a(3, pb.a("", ii.field_a, -256, "whitehouse_floor"), false);
                                    gd.a(false, 3, pb.a("", ii.field_a, -256, "whitehouse_tiles"));
                                    pf.field_e[0] = pb.a("", ii.field_a, -256, "dimming0");
                                    pf.field_e[1] = pb.a("", ii.field_a, -256, "dimming1");
                                    pf.field_e[2] = pb.a("", ii.field_a, -256, "dimming2");
                                    pf.field_e[3] = pb.a("", ii.field_a, -256, "dimming3");
                                    pf.field_e[4] = pb.a("", ii.field_a, -256, "dimming4");
                                    ig.field_b = fl.a("", "tutorial_arrow", ii.field_a, 11091);
                                    o.field_h = fl.a("", "tutorial", ii.field_a, 11091);
                                    sj.field_j = fl.a("", "frameh", ii.field_a, 11091);
                                    lm.field_fb = fl.a("", "framev", ii.field_a, 11091);
                                    rp.field_r = pb.a("", ii.field_a, -256, "framecorners");
                                    tb.field_s = lm.field_fb.f();
                                    vo.field_p = sj.field_j.c();
                                    vo.field_p.i();
                                    md.field_N = pb.a("", ii.field_a, -256, "instructions_controls");
                                    ch.field_b = pb.a("", ii.field_a, -256, "instructions_survivors");
                                    tf.field_Hb = pb.a("", ii.field_a, -256, "instructions_zombies");
                                    cc.field_b = fj.a("frame", "", 3, ii.field_a);
                                    field_I = fj.a("button_frame", "", 3, ii.field_a);
                                    lf.field_c = fj.a("button_raised", "", 3, ii.field_a);
                                    discarded$28 = fj.a("button_depressed", "", 3, ii.field_a);
                                    oi.field_h = fj.a("frame_comp", "", 3, ii.field_a);
                                    rl.field_a = fj.a("frame_comp_filled", "", 3, ii.field_a);
                                    if (he.field_a) {
                                      break L28;
                                    } else {
                                      la.field_l = da.a("achievements_large", ii.field_a, (byte) 19, "");
                                      var3_array2 = la.field_l;
                                      var4 = 0;
                                      L29: while (true) {
                                        L30: {
                                          if ((var4 ^ -1) <= (var3_array2.length ^ -1)) {
                                            break L30;
                                          } else {
                                            var5_ref = var3_array2[var4];
                                            e.a((byte) 48, var5_ref);
                                            var4++;
                                            if (var6 != 0) {
                                              break L27;
                                            } else {
                                              if (var6 == 0) {
                                                continue L29;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                        }
                                        e.a((byte) 48, wl.field_l);
                                        break L28;
                                      }
                                    }
                                  }
                                  dl.field_h.b((byte) 104);
                                  ii.field_a = null;
                                  cg.field_n = null;
                                  o.d(26673);
                                  break L27;
                                }
                                stackOut_177_0 = 0;
                                stackIn_178_0 = stackOut_177_0;
                                decompiledRegionSelector0 = 22;
                                break L0;
                              }
                            }
                          }
                        }
                        if (ha.field_g == null) {
                          bc.a((byte) 76);
                          bc.a((byte) 15);
                          pl.field_I = 11;
                          sp.field_g = 12;
                          ip.a(-127, 50);
                          tj.a(3273, 224);
                          ff.a(200, 123);
                          cj.d(false, 0);
                          o.d(26673);
                          discarded$29 = pl.field_J.a(true, (java.awt.Component) ((Object) dk.field_Ib), -14697);
                          tk.field_q = dk.field_Ib;
                          kb.a(16777215, 5, field_I, 15, lf.field_c, pb.field_e, 65280, 240, 16711680, 320, oi.field_h, (byte) -128, 15, 20, 20);
                          kk.field_w = new h(10, 10, true);
                          e.field_e = new nm(100, 100);
                          stackOut_182_0 = 1;
                          stackIn_183_0 = stackOut_182_0;
                          decompiledRegionSelector0 = 24;
                          break L0;
                        } else {
                          dg.a(new eh(ha.field_g.a("", "huffman", false)), -40);
                          ha.field_g = null;
                          o.d(26673);
                          stackOut_180_0 = 0;
                          stackIn_181_0 = stackOut_180_0;
                          decompiledRegionSelector0 = 23;
                          break L0;
                        }
                      } else {
                        qm.a(80.0f, 80, bl.field_b);
                        this.g(-30169);
                        bn.field_d = ed.a(ki.field_m, -2852);
                        of.field_e[0] = new ja(ki.field_m.a("", "background1.jpg", false), (java.awt.Component) ((Object) dk.field_Ib));
                        jo.field_d = new ja(ki.field_m.a("", "panorama.jpg", false), (java.awt.Component) ((Object) dk.field_Ib));
                        ki.field_m = null;
                        o.d(26673);
                        stackOut_137_0 = 0;
                        stackIn_138_0 = stackOut_137_0;
                        decompiledRegionSelector0 = 21;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_116_0 = 1;
                    stackIn_117_0 = stackOut_116_0;
                    decompiledRegionSelector0 = 18;
                    break L0;
                  }
                }
              } else {
                qm.a(70.0f, 80, dn.field_b);
                this.g(-30169);
                ei.field_a[37] = ac.a(rn.field_e, "", "zombie_dawn_human_female_ow").c();
                ei.field_a[38] = ac.a(rn.field_e, "", "zombie_dawn_human_female_eek").c();
                ei.field_a[39] = ac.a(rn.field_e, "", "zombie_dawn_human_female_oof").c();
                ei.field_a[40] = ac.a(rn.field_e, "", "zombie_dawn_human_male_oof").c();
                ei.field_a[41] = ac.a(rn.field_e, "", "zombie_dawn_human_male_argh").c();
                ei.field_a[42] = ac.a(rn.field_e, "", "zombie_dawn_human_male_urgh").c();
                ei.field_a[43] = ac.a(rn.field_e, "", "zombie_dawn_human_male_uuh").c();
                ei.field_a[46] = ac.a(rn.field_e, "", "zombie_dawn_use_powerup").c();
                ei.field_a[48] = ac.a(rn.field_e, "", "zombie_dawn_cinema_ambience").c();
                ei.field_a[26] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_1").c();
                ei.field_a[27] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_2").c();
                ei.field_a[28] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_4").c();
                ei.field_a[29] = ei.field_a[28];
                ei.field_a[49] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_1").c();
                ei.field_a[50] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_2").c();
                ei.field_a[51] = ac.a(rn.field_e, "", "zombie_dawn_male_scream_3").c();
                ei.field_a[52] = ac.a(rn.field_e, "", "zombie_dawn_female_scream_3").c();
                ei.field_a[9] = ac.a(rn.field_e, "", "zombie_dawn_collect_powerup").c();
                ei.field_a[15] = ac.a(rn.field_e, "", "zombie_chase_human_male").c();
                ei.field_a[25] = ac.a(rn.field_e, "", "zombie_chase_human_female").c();
                ei.field_a[17] = ac.a(rn.field_e, "", "zombie_screech").c();
                ei.field_a[70] = ac.a(rn.field_e, "", "zombie_groan_short_1").c();
                ei.field_a[71] = ac.a(rn.field_e, "", "zombie_groan_short_2").c();
                ei.field_a[72] = ac.a(rn.field_e, "", "zombie_groan_female_3").c();
                ei.field_a[73] = ac.a(rn.field_e, "", "zombie_groan_female_4").c();
                ei.field_a[93] = ac.a(rn.field_e, "", "zd_multi_bird_twitter").c();
                ei.field_a[92] = ac.a(rn.field_e, "", "zd_multi_cloak_of_fear").c();
                ei.field_a[75] = ac.a(rn.field_e, "", "zd_multi_counter").c();
                ei.field_a[76] = ac.a(rn.field_e, "", "ZD_multi_human_into_portal_female").c();
                ei.field_a[77] = ac.a(rn.field_e, "", "ZD_multi_human_into_portal_male").c();
                ei.field_a[78] = ac.a(rn.field_e, "", "zd_multi_zombie_into_portal").c();
                ei.field_a[79] = ac.a(rn.field_e, "", "zd_multi_into_portal_opponent").c();
                ei.field_a[80] = ac.a(rn.field_e, "", "zd_multi_shackles").c();
                rn.field_e = null;
                o.d(26673);
                stackOut_108_0 = 0;
                stackIn_109_0 = stackOut_108_0;
                decompiledRegionSelector0 = 16;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "ZombieDawnMulti.DA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_35_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_43_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_51_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_59_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_65_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_71_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_77_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_85_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_93_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_101_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_104_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_106_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_109_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_114_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_117_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_131_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_135_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_138_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_178_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_181_0 != 0;
                                                      } else {
                                                        return stackIn_183_0 != 0;
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
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              dg.h(-95);
              if (null == rn.field_f) {
                break L1;
              } else {
                rn.a(-92);
                break L1;
              }
            }
            L2: {
              n.b(false);
              if (param0 == -18941) {
                break L2;
              } else {
                field_H = 24;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.HA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            this.a("zombiedawnmulti", 14, (byte) 82);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ZombieDawnMulti.init()");
        }
    }

    private final void r(int param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ia.field_r) {
                break L1;
              } else {
                L2: {
                  if (ke.field_g == null) {
                    ke.field_g = aa.b(-19300, 4);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (ke.field_g.field_k) {
                  var2_array = k.field_n;
                  var3 = ke.field_g.field_h;
                  var4 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (-9 >= (var4 ^ -1)) {
                          break L5;
                        } else {
                          var2_array[var4] = cr.b(var2_array[var4], var3[var4]);
                          var4++;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2_array = fc.field_m;
                      var3 = ke.field_g.field_h;
                      break L4;
                    }
                    var4 = 0;
                    L6: while (true) {
                      L7: {
                        L8: {
                          if (-9 >= (var4 ^ -1)) {
                            break L8;
                          } else {
                            var2_array[var4] = tq.b(var2_array[var4], var3[var4] ^ -1);
                            var4++;
                            if (var5 != 0) {
                              break L7;
                            } else {
                              if (var5 == 0) {
                                continue L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        ia.field_r = true;
                        break L7;
                      }
                      ke.field_g = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L9: {
              if (param0 <= -117) {
                break L9;
              } else {
                discarded$1 = this.c(true, 49);
                break L9;
              }
            }
            L10: {
              if (qd.field_bb) {
                break L10;
              } else {
                L11: {
                  if (null == ub.field_vb) {
                    ub.field_vb = ej.a((byte) -57, 6);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (ub.field_vb.field_h) {
                  L12: {
                    ll.field_k.a(0, ub.field_vb.field_f);
                    oq.c((byte) 120);
                    if ((ll.field_k.field_i & 2) != 0) {
                      break L12;
                    } else {
                      oq.c((byte) 119);
                      break L12;
                    }
                  }
                  L13: {
                    we.field_g[47] = vn.field_d[ll.field_k.b((byte) -1)];
                    if (fn.field_b) {
                      th.b((byte) -61);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  ub.field_vb = null;
                  qd.field_bb = true;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L14: {
              if (!ia.field_r) {
                break L14;
              } else {
                if (qd.field_bb) {
                  ub.m(116);
                  ii.a(103);
                  if (pl.field_I != 6) {
                    break L14;
                  } else {
                    if (!oa.a(-9, fc.field_m)) {
                      pl.field_I = 3;
                      bm.a(false, 3, 127, sp.field_g);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                } else {
                  break L14;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.FA(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ZombieDawnMulti.t(-121);
              gb.b(103);
              vc.b(10066329);
              oe.b(-9162);
              rb.a((byte) -116);
              er.c(4);
              th.d(92);
              ul.b((byte) -35);
              vd.a(1);
              pn.a(31);
              jq.a(8);
              p.a(5);
              cm.a((byte) 127);
              oa.b(3732);
              kn.a(false);
              cj.c(false);
              ti.g((byte) 119);
              pb.a((byte) -116);
              qb.c((byte) -7);
              ai.a(127);
              eq.a(0);
              of.a(-1);
              ej.b((byte) 16);
              ih.b(108);
              aq.o(10);
              fn.a(26677);
              ag.b(true);
              mh.a(17);
              bd.a(-1);
              mf.a(54);
              oo.a();
              k.b(false);
              bl.b(0);
              v.a(true);
              gj.a((byte) 91);
              va.a(127);
              lb.a((byte) 43);
              jf.a((byte) -98);
              ka.a((byte) 118);
              pf.b(6345);
              i.a(false);
              ii.c(-26028);
              l.a(64);
              lh.a((byte) -50);
              ll.a((byte) -46);
              ok.e(12);
              qd.h(256);
              nn.b(112);
              ci.b(1475);
              s.a(-96);
              h.b(false);
              nm.a(6);
              rp.a(5);
              rl.c(78);
              br.b((byte) 48);
              nq.e(-119);
              qa.a((byte) 43);
              ep.c();
              pk.a(619119521);
              qf.a(241);
              jk.a(2);
              ei.a(-5794);
              vn.b(96);
              qo.b(false);
              lj.a((byte) 55);
              gm.o(24461);
              cg.c((byte) -87);
              pq.a((byte) 44);
              lc.a((byte) 87);
              id.e((byte) 107);
              ce.a(24);
              wb.o((byte) -45);
              jj.i(1);
              ae.b(false);
              fq.c(true);
              nc.b(false);
              tk.c((byte) -88);
              si.d(true);
              hk.a((byte) 39);
              kb.b(-6);
              fh.a(true);
              qe.a((byte) 7);
              ko.d(-66);
              uf.b(16737894);
              lq.c(110);
              if (param0 < -43) {
                break L1;
              } else {
                field_H = -75;
                break L1;
              }
            }
            fc.b(-1);
            qk.b(false);
            qi.b((byte) -17);
            me.a((byte) 119);
            gd.e(0);
            f.a((byte) -44);
            mb.b(false);
            mm.d();
            ba.d(16652);
            gp.b();
            w.a((byte) -83);
            de.a(19091);
            jh.h(-36);
            sc.a(true);
            dm.h(0);
            so.a(-123);
            ga.j(-125);
            sj.c(true);
            fg.c(-125);
            uo.c((byte) 121);
            jm.c((byte) 59);
            op.c((byte) -9);
            wf.c(17);
            np.c(true);
            aj.a(-110);
            hb.a(false);
            be.a(0);
            da.a((byte) -95);
            ng.a(816);
            bc.c(22382);
            ql.a(4);
            vk.k((byte) 95);
            tf.o(101);
            ta.k((byte) -66);
            ub.o(61);
            ne.n(10);
            fe.c(false);
            dg.a((byte) 84);
            qm.a(64);
            cp.c(true);
            hf.b((byte) 45);
            sk.a(-1020346174);
            wp.a((byte) 26);
            rh.a();
            ac.a();
            kl.a();
            jp.b((byte) -80);
            hh.a(true);
            vo.f(-14680);
            ck.b(-120);
            mq.e(22324);
            ah.a((byte) -79);
            dn.a(16130);
            mi.d(false);
            hi.c((byte) -81);
            sn.c((byte) 117);
            cd.d(false);
            jb.a(-2);
            tq.h(0);
            fa.j(57);
            wq.b((byte) 121);
            lo.a(0);
            fm.a();
            uq.a(3);
            vi.a(119);
            cq.a((byte) -110);
            bn.a(23376);
            mo.h(2);
            qh.a(-22);
            sb.a(76);
            g.a();
            ff.e(-1130232991);
            rj.j(8784);
            lk.i(11041);
            ve.a((byte) 104);
            gk.a(125);
            ol.c((byte) -56);
            vf.a((byte) 9);
            eh.a((byte) 87);
            mc.a((byte) 124);
            wg.a((byte) -123);
            pd.a((byte) 91);
            vb.a(false);
            pg.b(true);
            hc.a(0);
            ed.a(12814);
            ke.a(false);
            jo.a(false);
            pi.a(-19162);
            ic.a(70);
            kp.e(-29690);
            o.b(-13532);
            ec.a((byte) -12);
            dc.c((byte) 82);
            dk.c((byte) 92);
            dp.a(0);
            no.h(15);
            oj.h(16777215);
            tm.a(-125);
            cb.a(0);
            jg.b(7);
            eo.a((byte) 125);
            lm.n(0);
            sh.b(true);
            ek.f((byte) -83);
            ge.r(-121);
            ro.b((byte) 71);
            pa.i((byte) -86);
            bf.d(29919);
            og.g((byte) -119);
            c.a(-6);
            ap.h(16682);
            tn.g(0);
            bq.a((byte) 77);
            li.g(66);
            cn.d(-124);
            hl.a(16777215);
            qc.c((byte) 109);
            qq.a((byte) 21);
            t.a((byte) 4);
            wo.a();
            eb.a(true);
            lp.a(-97);
            hj.a(27964);
            a.a(false);
            tg.a((byte) -72);
            dl.a((byte) -109);
            en.a(20964);
            wl.a(true);
            iq.a(true);
            dd.a(false);
            r.a(true);
            ld.h(-113);
            ig.a(false);
            ob.c((byte) -52);
            ik.b(49);
            vm.k((byte) -29);
            hq.a((byte) 82);
            af.a(-128);
            md.b((byte) 119);
            kc.a(-111);
            am.b(-7);
            rm.a(80);
            kd.a(2791);
            kq.a((byte) 60);
            sf.a(4);
            fl.a((byte) 109);
            ij.a(true);
            jl.a(false);
            bg.a((byte) -104);
            wa.a(2);
            mp.a(12);
            cf.e((byte) -90);
            gn.a(-118);
            rg.a((byte) -39);
            al.i((byte) -92);
            df.g((byte) 84);
            se.b(false);
            ch.d(-1);
            bh.a((byte) -8);
            ji.a(13377);
            tl.f(32768);
            io.a((byte) 8);
            aa.f(0);
            dq.b(-2);
            sm.a(-12970);
            fd.g((byte) 97);
            hn.a(0);
            cc.a((byte) -52);
            wc.g((byte) -66);
            mj.i(22767);
            tj.a(false);
            sa.a(-119);
            nk.a((byte) -26);
            dj.g(-3);
            em.k(4);
            pl.f(114);
            rn.a((byte) 88);
            hg.c(true);
            ho.e(30833);
            fk.e(225);
            vj.e(31592);
            vh.c((byte) -113);
            kg.a(360);
            po.f(-60);
            nj.a((byte) 78);
            el.h(3);
            on.l(29829);
            pm.d(false);
            ie.l(7181);
            le.a(0);
            gl.c(true);
            sq.f(2);
            uk.f(-1562977759);
            km.i(0);
            un.g(-1317848592);
            q.a((byte) -109);
            pj.c(true);
            ud.f(38);
            wm.h((byte) 107);
            uh.a();
            bi.a(4302);
            nb.a((byte) 119);
            wk.h(-127);
            od.o((byte) -50);
            bk.c(4912);
            kf.c(3);
            wh.a(false);
            e.a(118);
            kk.b(true);
            la.a(-113);
            ua.g((byte) -33);
            sd.g((byte) -81);
            ao.a(-23);
            eg.c((byte) 5);
            b.a(94);
            up.a((byte) -30);
            ln.a(18358);
            vl.a(0);
            vg.a(8220);
            we.a((byte) 103);
            oq.d((byte) -39);
            he.a((byte) -122);
            tb.c((byte) 109);
            m.a(false);
            na.g((byte) -108);
            nh.a((byte) 48);
            kj.a(-2);
            oi.b(5378);
            ml.c((byte) -102);
            gg.a((byte) -126);
            ra.b(true);
            ab.a(0);
            gi.a(-1569388056);
            cr.b(true);
            qj.b(false);
            uc.c(118);
            ip.c((byte) 124);
            bb.a(-18535);
            um.a(-98);
            rq.b(false);
            ki.b(-23636);
            fb.d(-90);
            wj.a(-6298);
            ak.a(-5937);
            gh.a((byte) 106);
            wd.a((byte) -84);
            il.a(27467);
            bo.a(6);
            pp.a(false);
            wn.b(true);
            mn.c(3);
            ui.a((byte) -48);
            db.a(26);
            u.a(-7406);
            hp.a(120);
            mk.a(53);
            td.a((byte) 94);
            ha.a(21342);
            re.a(89);
            gf.a(true);
            tp.h(66);
            ia.h(0);
            hm.b(false);
            hd.h(11702);
            bp.h(-3);
            qp.h(1);
            lf.a(0);
            wi.a(0);
            ma.a(64);
            this.field_v = null;
            this.field_J = null;
            this.field_G = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ZombieDawnMulti.KA(" + param0 + ')');
        }
    }

    public ZombieDawnMulti() {
    }

    static {
        field_M = "Annoying";
        field_K = new String[]{"Map type", "Map name"};
        field_F = "Test Chamber";
    }
}
