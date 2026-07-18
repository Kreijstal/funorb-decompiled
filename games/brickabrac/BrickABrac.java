/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class BrickABrac extends sa {
    static mf field_I;
    static String field_G;
    static mk field_F;
    static int[] field_K;
    static String field_H;
    public static boolean field_J;

    public final void a(int param0) {
        int var2 = 0;
        kq var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = field_J ? 1 : 0;
          if (null != hd.field_d) {
            if (lp.field_rb.a((byte) -51)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          if (var2 != 0) {
            if (16 > kh.field_a) {
              lp.field_rb.b((byte) -75);
              jn.a(kh.field_a - -1, 256, 16769381, false, false);
              break L1;
            } else {
              hd.field_d.b((byte) -85);
              jn.a(32 - (kh.field_a + -1), 256, 16769381, false, false);
              break L1;
            }
          } else {
            lp.field_rb.b((byte) -63);
            break L1;
          }
        }
        L2: {
          var3 = (kq) (Object) kp.field_c.d(-123);
          if (param0 == 16769381) {
            break L2;
          } else {
            field_I = null;
            break L2;
          }
        }
        L3: {
          if (var3 != null) {
            L4: {
              var5 = ok.field_c;
              if (var5 < 80) {
                var4 = -32 + var5 / 2;
                break L4;
              } else {
                if (230 > var5) {
                  var4 = 8;
                  break L4;
                } else {
                  var4 = 123 - var5 / 2;
                  break L4;
                }
              }
            }
            si.field_c[var3.field_p].c(8, var4);
            nn.field_g.c(af.field_s[var3.field_p], 48, var4 - -nn.field_g.field_F, 0, -1);
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          if (!cf.a((byte) 62)) {
            break L5;
          } else {
            rd.b(-79);
            break L5;
          }
        }
    }

    public final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pn var6 = null;
        int stackIn_8_0 = 0;
        gf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        gf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        gf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        gf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        gf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        gf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        gf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        gf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          var5 = field_J ? 1 : 0;
          vd.a(-127);
          de.field_x = de.field_x + 1;
          if (!og.h(-26090)) {
            L1: while (true) {
              var6 = (pn) (Object) kq.field_j.c(3);
              if (var6 == null) {
                break L0;
              } else {
                g.a(var6, 5, (byte) -116);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          L3: {
            if (hd.field_d == null) {
              break L3;
            } else {
              if (!lp.field_rb.a((byte) -51)) {
                break L3;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L2;
        }
        L4: {
          L5: {
            var3 = stackIn_8_0;
            if ((Object) (Object) pe.field_o != (Object) (Object) lp.field_rb) {
              break L5;
            } else {
              if (pe.field_o.field_p) {
                break L5;
              } else {
                if (var3 == 0) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
          }
          L6: {
            L7: {
              stackOut_12_0 = lp.field_rb;
              stackOut_12_1 = 1;
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              if (!param0) {
                break L7;
              } else {
                stackOut_13_0 = (gf) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (var3 != 0) {
                  break L7;
                } else {
                  stackOut_14_0 = (gf) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
            }
            stackOut_15_0 = (gf) (Object) stackIn_15_0;
            stackOut_15_1 = stackIn_15_1;
            stackOut_15_2 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            break L6;
          }
          ((gf) (Object) stackIn_16_0).a(stackIn_16_1 != 0, stackIn_16_2 != 0, -104);
          break L4;
        }
        L8: {
          if (var3 != 0) {
            L9: {
              L10: {
                if ((Object) (Object) pe.field_o != (Object) (Object) hd.field_d) {
                  break L10;
                } else {
                  if (!pe.field_o.field_p) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              if (hd.field_d != null) {
                hd.field_d.a(false, false, -82);
                break L9;
              } else {
                break L9;
              }
            }
            kh.field_a = kh.field_a + 1;
            if (32 != kh.field_a) {
              break L8;
            } else {
              sk.i((byte) -126);
              break L8;
            }
          } else {
            if (pe.field_o == null) {
              break L8;
            } else {
              if ((Object) (Object) lp.field_rb == (Object) (Object) pe.field_o) {
                break L8;
              } else {
                if (pe.field_o.field_p) {
                  pe.field_o.a(false, false, -81);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
        }
        L11: {
          if (null == kp.field_c.d(-8)) {
            break L11;
          } else {
            int fieldTemp$2 = ok.field_c + 1;
            ok.field_c = ok.field_c + 1;
            if (fieldTemp$2 == 335) {
              ok.field_c = 0;
              nm discarded$3 = kp.field_c.c(3);
              break L11;
            } else {
              break L11;
            }
          }
        }
        L12: {
          if (ok.field_c == 50) {
            wp.a(8, ta.field_e[9]);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (cf.a((byte) 62)) {
            sq.a(false);
            break L13;
          } else {
            break L13;
          }
        }
        var4 = 46 / ((-61 - param1) / 47);
    }

    final void b(boolean param0) {
        ((BrickABrac) this).a((byte) 39, 0, 2, param0, 1, 4, 14, 65);
        hi.field_w = new fo(new int[1]);
        nk.field_c = new jp(640, 480);
        oc.a(lp.field_ub, (byte) 60, kj.field_D);
        ((BrickABrac) this).a(3160, (wb) (Object) new ij());
        am.a(ch.field_g, 1);
    }

    final boolean q(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 73) {
          L0: {
            L1: {
              if (ue.field_c) {
                break L1;
              } else {
                if (vh.field_L) {
                  break L1;
                } else {
                  if (!ed.field_d) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final boolean a(pi param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var4_int = 0;
        int[] var5 = null;
        String[] var5_array = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        fo var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        oi var12 = null;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var21 = null;
        int[] var23 = null;
        pi var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        String[] var30 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var39 = null;
        int[] var41 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var46 = null;
        int[] var49 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        qj stackIn_57_0 = null;
        qj stackIn_58_0 = null;
        qj stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_70_0 = 0;
        qj stackIn_73_0 = null;
        qj stackIn_74_0 = null;
        qj stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_93_0 = 0;
        qj stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        pi stackIn_98_2 = null;
        qj stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        pi stackIn_99_2 = null;
        qj stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        pi stackIn_100_2 = null;
        int stackIn_100_3 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_134_0 = 0;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        String stackIn_138_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        qj stackOut_72_0 = null;
        qj stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        qj stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_103_0 = 0;
        qj stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        pi stackOut_97_2 = null;
        qj stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        pi stackOut_99_2 = null;
        int stackOut_99_3 = 0;
        qj stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        pi stackOut_98_2 = null;
        int stackOut_98_3 = 0;
        int stackOut_100_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        qj stackOut_56_0 = null;
        qj stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        qj stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        var16 = field_J ? 1 : 0;
        try {
          L0: {
            if (9 != param2) {
              if (14 != param2) {
                if (param2 != 15) {
                  L1: {
                    if (param2 != 10) {
                      break L1;
                    } else {
                      if (ue.field_c) {
                        sj.a((byte) 33);
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (param2 != 72) {
                    L2: {
                      if (si.field_a == 64) {
                        break L2;
                      } else {
                        if (65 != si.field_a) {
                          if (79 == si.field_a) {
                            if (pe.field_o != null) {
                              L3: {
                                if (pe.field_o.field_q) {
                                  rk.a("T3", (Throwable) null, 44);
                                  break L3;
                                } else {
                                  L4: {
                                    int fieldTemp$1 = pe.field_o.field_x;
                                    pe.field_o.field_x = pe.field_o.field_x + 1;
                                    pe.field_o.field_w.field_l[fieldTemp$1].a(false, (wq) (Object) param0, pe.field_o.field_w.field_k);
                                    stackOut_72_0 = pe.field_o;
                                    stackIn_74_0 = stackOut_72_0;
                                    stackIn_73_0 = stackOut_72_0;
                                    if (~pe.field_o.field_x != ~pe.field_o.field_w.field_k) {
                                      stackOut_74_0 = (qj) (Object) stackIn_74_0;
                                      stackOut_74_1 = 0;
                                      stackIn_75_0 = stackOut_74_0;
                                      stackIn_75_1 = stackOut_74_1;
                                      break L4;
                                    } else {
                                      stackOut_73_0 = (qj) (Object) stackIn_73_0;
                                      stackOut_73_1 = 1;
                                      stackIn_75_0 = stackOut_73_0;
                                      stackIn_75_1 = stackOut_73_1;
                                      break L4;
                                    }
                                  }
                                  stackIn_75_0.field_q = stackIn_75_1 != 0;
                                  if (!pe.field_o.field_q) {
                                    break L3;
                                  } else {
                                    if (!pe.field_o.c(103)) {
                                      pe.field_o.field_w.field_l[pe.field_o.field_k].field_E = pe.field_o.field_w.field_l[pe.field_o.field_k].field_F - 50;
                                      break L3;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                              }
                              stackOut_80_0 = 1;
                              stackIn_81_0 = stackOut_80_0;
                              return stackIn_81_0 != 0;
                            } else {
                              stackOut_69_0 = 1;
                              stackIn_70_0 = stackOut_69_0;
                              return stackIn_70_0 != 0;
                            }
                          } else {
                            if (66 != si.field_a) {
                              L5: {
                                if (null == pe.field_o) {
                                  break L5;
                                } else {
                                  if (76 != si.field_a) {
                                    L6: {
                                      if (73 == si.field_a) {
                                        break L6;
                                      } else {
                                        if (si.field_a == 74) {
                                          break L6;
                                        } else {
                                          if (si.field_a != 75) {
                                            if (77 != si.field_a) {
                                              if (si.field_a == 78) {
                                                pe.field_o.a(param0, true, 118);
                                                stackOut_110_0 = 1;
                                                stackIn_111_0 = stackOut_110_0;
                                                return stackIn_111_0 != 0;
                                              } else {
                                                if (si.field_a != 67) {
                                                  if (si.field_a != 69) {
                                                    if (si.field_a != 70) {
                                                      if (si.field_a == 71) {
                                                        L7: {
                                                          pe.field_o.field_v = param0.l(255);
                                                          if (pe.field_o != null) {
                                                            fr.a(1);
                                                            break L7;
                                                          } else {
                                                            break L7;
                                                          }
                                                        }
                                                        stackOut_128_0 = 1;
                                                        stackIn_129_0 = stackOut_128_0;
                                                        return stackIn_129_0 != 0;
                                                      } else {
                                                        break L5;
                                                      }
                                                    } else {
                                                      L8: {
                                                        pe.field_o.field_w.field_j = param0.l(255);
                                                        if (pe.field_o == null) {
                                                          break L8;
                                                        } else {
                                                          fr.a(1);
                                                          break L8;
                                                        }
                                                      }
                                                      stackOut_121_0 = 1;
                                                      stackIn_122_0 = stackOut_121_0;
                                                      return stackIn_122_0 != 0;
                                                    }
                                                  } else {
                                                    pe.field_o.a(18504, param0);
                                                    stackOut_116_0 = 1;
                                                    stackIn_117_0 = stackOut_116_0;
                                                    return stackIn_117_0 != 0;
                                                  }
                                                } else {
                                                  pe.field_o.a(param0, param1 + -47);
                                                  stackOut_113_0 = 1;
                                                  stackIn_114_0 = stackOut_113_0;
                                                  return stackIn_114_0 != 0;
                                                }
                                              }
                                            } else {
                                              pe.field_o.a(param0, false, 87);
                                              stackOut_106_0 = 1;
                                              stackIn_107_0 = stackOut_106_0;
                                              return stackIn_107_0 != 0;
                                            }
                                          } else {
                                            pe.field_o.a((byte) 33, param0);
                                            stackOut_103_0 = 1;
                                            stackIn_104_0 = stackOut_103_0;
                                            return stackIn_104_0 != 0;
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      stackOut_97_0 = pe.field_o;
                                      stackOut_97_1 = -15;
                                      stackOut_97_2 = (pi) param0;
                                      stackIn_99_0 = stackOut_97_0;
                                      stackIn_99_1 = stackOut_97_1;
                                      stackIn_99_2 = stackOut_97_2;
                                      stackIn_98_0 = stackOut_97_0;
                                      stackIn_98_1 = stackOut_97_1;
                                      stackIn_98_2 = stackOut_97_2;
                                      if (si.field_a != 74) {
                                        stackOut_99_0 = (qj) (Object) stackIn_99_0;
                                        stackOut_99_1 = stackIn_99_1;
                                        stackOut_99_2 = (pi) (Object) stackIn_99_2;
                                        stackOut_99_3 = 0;
                                        stackIn_100_0 = stackOut_99_0;
                                        stackIn_100_1 = stackOut_99_1;
                                        stackIn_100_2 = stackOut_99_2;
                                        stackIn_100_3 = stackOut_99_3;
                                        break L9;
                                      } else {
                                        stackOut_98_0 = (qj) (Object) stackIn_98_0;
                                        stackOut_98_1 = stackIn_98_1;
                                        stackOut_98_2 = (pi) (Object) stackIn_98_2;
                                        stackOut_98_3 = 1;
                                        stackIn_100_0 = stackOut_98_0;
                                        stackIn_100_1 = stackOut_98_1;
                                        stackIn_100_2 = stackOut_98_2;
                                        stackIn_100_3 = stackOut_98_3;
                                        break L9;
                                      }
                                    }
                                    ((qj) (Object) stackIn_100_0).a((byte) stackIn_100_1, stackIn_100_2, stackIn_100_3 != 0);
                                    stackOut_100_0 = 1;
                                    stackIn_101_0 = stackOut_100_0;
                                    return stackIn_101_0 != 0;
                                  } else {
                                    pe.field_o.a(param0, (byte) 74);
                                    stackOut_92_0 = 1;
                                    stackIn_93_0 = stackOut_92_0;
                                    return stackIn_93_0 != 0;
                                  }
                                }
                              }
                              if (param1 == 47) {
                                stackOut_133_0 = 0;
                                stackIn_134_0 = stackOut_133_0;
                                break L0;
                              } else {
                                stackOut_131_0 = 1;
                                stackIn_132_0 = stackOut_131_0;
                                return stackIn_132_0 != 0;
                              }
                            } else {
                              L10: {
                                if (pe.field_o != null) {
                                  L11: {
                                    sk.i((byte) -123);
                                    if (pe.field_o.c(123)) {
                                      break L11;
                                    } else {
                                      pe.field_o.a((byte) 40, false);
                                      break L11;
                                    }
                                  }
                                  pe.field_o.a(false, (byte) 69);
                                  cc.field_G = true;
                                  pf.field_p = true;
                                  on.field_E = 0;
                                  ng.a(false, 125, -2);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              ed.field_d = false;
                              stackOut_88_0 = 1;
                              stackIn_89_0 = stackOut_88_0;
                              return stackIn_89_0 != 0;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L12: {
                      sk.i((byte) -125);
                      if (param0.l(255) == 0) {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        break L12;
                      } else {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        break L12;
                      }
                    }
                    var4_int = stackIn_44_0;
                    var30 = new String[param0.l(255)];
                    var5_array = var30;
                    var6 = param0.b(true);
                    var7 = 0;
                    L13: while (true) {
                      if (~var30.length >= ~var7) {
                        L14: {
                          if (var6 < 0) {
                            var6 = -2;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        var7 = param0.e(param1 ^ 208);
                        var8 = new fo(new int[1]);
                        var59 = new int[var30.length];
                        var49 = var59;
                        var39 = var49;
                        var32 = var39;
                        var9 = var32;
                        var10 = 0;
                        L15: while (true) {
                          if (var10 >= var30.length) {
                            L16: {
                              var58 = kk.a(false, tq.field_d.field_i, var8);
                              var11 = param0.b(true);
                              var12 = new oi(tq.field_d, var58, var11);
                              var13 = var8.a(-37880252, 11);
                              oa.field_Sb = rd.a(var13, (byte) 19);
                              var60 = id.a(var8, false);
                              fj.field_Ub = null;
                              if (0 <= var6) {
                                stackOut_55_0 = 1 << var6;
                                stackIn_56_0 = stackOut_55_0;
                                break L16;
                              } else {
                                stackOut_54_0 = 0;
                                stackIn_56_0 = stackOut_54_0;
                                break L16;
                              }
                            }
                            L17: {
                              var15 = stackIn_56_0;
                              pe.field_o = new qj(true, var4_int != 0, var30, var6, var15, var12, var59, var60);
                              stackOut_56_0 = pe.field_o;
                              stackIn_58_0 = stackOut_56_0;
                              stackIn_57_0 = stackOut_56_0;
                              if (param0.l(255) != 0) {
                                stackOut_58_0 = (qj) (Object) stackIn_58_0;
                                stackOut_58_1 = 0;
                                stackIn_59_0 = stackOut_58_0;
                                stackIn_59_1 = stackOut_58_1;
                                break L17;
                              } else {
                                stackOut_57_0 = (qj) (Object) stackIn_57_0;
                                stackOut_57_1 = 1;
                                stackIn_59_0 = stackOut_57_0;
                                stackIn_59_1 = stackOut_57_1;
                                break L17;
                              }
                            }
                            L18: {
                              stackIn_59_0.field_q = stackIn_59_1 != 0;
                              if (pe.field_o.field_q) {
                                break L18;
                              } else {
                                pe.field_o.field_x = 0;
                                break L18;
                              }
                            }
                            L19: {
                              if (si.field_a == 64) {
                                i.c((byte) 32);
                                fr.a(param1 ^ 46);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            ed.field_d = false;
                            r.field_A = false;
                            pf.field_p = false;
                            ng.a(false, param1 ^ 105, -1);
                            stackOut_64_0 = 1;
                            stackIn_65_0 = stackOut_64_0;
                            return stackIn_65_0 != 0;
                          } else {
                            var9[var10] = var8.b(105);
                            var10++;
                            continue L15;
                          }
                        }
                      } else {
                        var5_array[var7] = param0.f(255);
                        var7++;
                        continue L13;
                      }
                    }
                  } else {
                    var53 = vn.d(8);
                    var43 = var53;
                    var35 = var43;
                    var27 = var35;
                    var4_array = var27;
                    var18 = var4_array;
                    var5 = var18;
                    var25 = param0;
                    var7 = ((wq) (Object) var25).l(255);
                    var8_int = 0;
                    L20: while (true) {
                      if (~var7 >= ~var8_int) {
                        var51 = var4_array;
                        var41 = var51;
                        var34 = var41;
                        var26 = var34;
                        var19 = var26;
                        var5 = var19;
                        var52 = mk.field_b;
                        var7 = 0;
                        L21: while (true) {
                          if (var7 >= 8) {
                            L22: {
                              if (!hb.field_y) {
                                break L22;
                              } else {
                                var5_int = ea.a(true, var53);
                                var6 = 0;
                                L23: while (true) {
                                  if (~var6 < ~var5_int) {
                                    break L22;
                                  } else {
                                    L24: {
                                      if (!eo.a(var53, var6, (byte) -75)) {
                                        break L24;
                                      } else {
                                        kp.field_c.a((nm) (Object) new kq(var6), (byte) 3);
                                        break L24;
                                      }
                                    }
                                    var6++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                            var54 = mk.field_b;
                            var44 = var54;
                            var36 = var44;
                            var28 = var36;
                            var21 = var28;
                            var5 = var21;
                            var55 = var4_array;
                            var7 = 0;
                            L25: while (true) {
                              if (var7 >= 8) {
                                var56 = pl.field_b;
                                var46 = var56;
                                var37 = var46;
                                var29 = var37;
                                var23 = var29;
                                var5 = var23;
                                var57 = var4_array;
                                var7 = 0;
                                L26: while (true) {
                                  if (var7 >= 8) {
                                    stackOut_36_0 = 1;
                                    stackIn_37_0 = stackOut_36_0;
                                    return stackIn_37_0 != 0;
                                  } else {
                                    var23[var7] = ud.d(var56[var7], var57[var7]);
                                    var7++;
                                    continue L26;
                                  }
                                }
                              } else {
                                var21[var7] = ud.d(var54[var7], var55[var7]);
                                var7++;
                                continue L25;
                              }
                            }
                          } else {
                            var19[var7] = ik.a(var51[var7], ~var52[var7]);
                            var7++;
                            continue L21;
                          }
                        }
                      } else {
                        var18[var8_int] = ((wq) (Object) var25).e(255);
                        var8_int++;
                        continue L20;
                      }
                    }
                  }
                } else {
                  L27: {
                    if (!ue.field_c) {
                      break L27;
                    } else {
                      eq.a(7);
                      an.d((byte) -56);
                      ng.a(false, param1 + 43, 0);
                      ue.field_c = false;
                      cc.field_G = true;
                      dp.field_y = true;
                      break L27;
                    }
                  }
                  ed.field_d = false;
                  pf.field_p = false;
                  vh.field_L = false;
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                sk.i((byte) -116);
                hm.a(nc.c(param1 ^ -71), (byte) 86, qh.field_h, mq.c(0), 150, fj.a(2000, (byte) -54), aj.a(1345), fj.a(8, (byte) -53), 1024, jb.field_I.length);
                hn.a(lh.f(115), kb.h(param1 + -45), param1 ^ 12);
                vh.field_L = false;
                ue.field_c = true;
                ng.a(false, 113, -2);
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              sk.i((byte) -113);
              vh.field_L = false;
              ng.a(false, param1 + 66, 11);
              kk.a(true, param0.d(-1));
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var4 = decompiledCaughtException;
            stackOut_135_0 = (RuntimeException) var4;
            stackOut_135_1 = new StringBuilder().append("BrickABrac.K(");
            stackIn_137_0 = stackOut_135_0;
            stackIn_137_1 = stackOut_135_1;
            stackIn_136_0 = stackOut_135_0;
            stackIn_136_1 = stackOut_135_1;
            if (param0 == null) {
              stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
              stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
              stackOut_137_2 = "null";
              stackIn_138_0 = stackOut_137_0;
              stackIn_138_1 = stackOut_137_1;
              stackIn_138_2 = stackOut_137_2;
              break L28;
            } else {
              stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
              stackOut_136_1 = (StringBuilder) (Object) stackIn_136_1;
              stackOut_136_2 = "{...}";
              stackIn_138_0 = stackOut_136_0;
              stackIn_138_1 = stackOut_136_1;
              stackIn_138_2 = stackOut_136_2;
              break L28;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_138_0, stackIn_138_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_134_0 != 0;
    }

    public static void s(int param0) {
        field_G = null;
        field_H = null;
        if (param0 != -65) {
            BrickABrac.s(10);
        }
        field_K = null;
        field_I = null;
        field_F = null;
    }

    final void p(int param0) {
        int var3 = 0;
        var3 = field_J ? 1 : 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (lp.field_rb.field_a != 9) {
                break L1;
              } else {
                if (!ib.a(pl.field_b, -1)) {
                  ng.a(false, 69, 5);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (sl.field_z == 2147483647) {
              break L0;
            } else {
              if (sl.field_z != -2) {
                ng.a(false, param0 + 55, sl.field_z);
                break L0;
              } else {
                cb.b(true);
                break L0;
              }
            }
          }
          dk.h((byte) -64);
          return;
        } else {
          return;
        }
    }

    public BrickABrac() {
        sl.field_C = (BrickABrac) this;
    }

    final void b(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = field_J ? 1 : 0;
          if (param1 != param0) {
            L1: {
              if (ue.field_c) {
                L2: {
                  L3: {
                    dp.field_y = true;
                    cc.field_G = true;
                    if (pe.field_o == null) {
                      break L3;
                    } else {
                      if (pe.field_o.c(param1 + 94)) {
                        break L3;
                      } else {
                        kk.a(true, sg.field_k);
                        ng.a(false, param1 ^ 118, 11);
                        break L2;
                      }
                    }
                  }
                  ng.a(false, 120, 0);
                  break L2;
                }
                L4: {
                  if (lp.field_rb instanceof km) {
                    ((km) (Object) lp.field_rb).a(false, 0, param1 + 116);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ue.field_c = false;
                break L1;
              } else {
                break L1;
              }
            }
            vh.field_L = false;
            ed.field_d = false;
            break L0;
          } else {
            ed.field_d = true;
            vh.field_L = true;
            break L0;
          }
        }
    }

    public final void init() {
        ((BrickABrac) this).a("brickabrac", 15, 1686);
    }

    final void a(boolean param0) {
        rl.b(18);
        if (param0) {
            field_G = null;
        }
        og.d((byte) 107);
    }

    public final boolean a(int param0, char param1, int param2) {
        if (cf.a((byte) 62)) {
            if (!(param0 != 5)) {
                im.field_g = !im.field_g ? true : false;
                return true;
            }
            if (!(6 != param0)) {
                pf.field_f = !pf.field_f ? true : false;
                return true;
            }
            if (!(param0 != 7)) {
                return true;
            }
        }
        if (param2 > -58) {
            ((BrickABrac) this).b(78, 8);
        }
        if (!(null == hd.field_d)) {
            return false;
        }
        return null != lp.field_rb ? lp.field_rb.a(param1, 106, param0) : false;
    }

    final static int c(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != 2048) {
            BrickABrac.s(116);
        }
        if (param1 >= 4096) {
            return param1 < 6144 ? -um.field_j[6144 - param1] : um.field_j[param1 + -6144];
        }
        return 2048 > param1 ? um.field_j[-param1 + 2048] : -um.field_j[-2048 + param1];
    }

    final void d(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          BrickABrac.s(-65);
          ea.a((byte) -42);
          b.a(true);
          fd.a(0);
          oi.a((byte) 70);
          km.b(-107);
          uk.f((byte) 88);
          ud.f((byte) -115);
          ld.g(-25617);
          la.a((byte) -75);
          v.a(false);
          op.a((byte) -42);
          kq.a((byte) -115);
          vl.b((byte) 100);
          fo.a(2);
          sc.a(81);
          ue.a((byte) -114);
          pi.o(60);
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ap.a(stackIn_3_0 != 0);
          nh.b(120);
          qg.k(-113);
          nk.a((byte) 121);
          aj.b(-789103103);
          sj.a(11);
          pp.a(0);
          jd.a(0);
          wc.a(100);
          ch.a(20623);
          df.a((byte) 108);
          gh.a(-21727);
          vj.a(true);
          hm.a(8);
          lb.c();
          mc.a(-128);
          tm.a(param0);
          wo.b(78);
          ke.d(19254);
          ad.b(-16637);
          dm.a((byte) 24);
          gk.a(102);
          mf.a(false);
          t.a(-11470);
          wm.a(108);
          wq.h(0);
          wn.c((byte) -41);
          vg.b(13);
          rd.a((byte) 46);
          cn.a(117);
          gb.a(0);
          kd.a(param0);
          fq.a((byte) 15);
          dj.a((byte) 66);
          nb.a(-125);
          s.c(4862);
          wg.a(0);
          qn.b(0);
          ng.a((byte) -49);
          gf.c((byte) -91);
          of.a(-2);
          qj.d(81);
          on.d(4641);
          nm.a(true);
          mn.f(2);
          tk.a(-2);
          if (param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          un.a(stackIn_6_0 != 0);
          ie.c(-1);
          wp.a((byte) -117);
          bn.d((byte) -106);
          vi.a(34);
          no.d((byte) 97);
          j.d(-2947);
          ee.e(-116);
          cl.b(true);
          ij.c(false);
          cf.a(-12251);
          q.a((byte) -32);
          hh.a(true);
          kk.a(0);
          w.d((byte) 102);
          rj.a(24311);
          bq.a(true);
          fk.a((byte) -94);
          jj.a(true);
          sq.a((byte) -11);
          nl.a(-106);
          re.b((byte) -60);
          ed.a(-104);
          ki.a((byte) 7);
          rb.a((byte) -116);
          jg.a(-54);
          hc.a(-61);
          m.c(2);
          f.a(1);
          hd.a(12);
          cd.a((byte) 65);
          ff.a((byte) 114);
          wh.b(119);
          we.a(-8495);
          sm.a(30000);
          fh.a(-29988);
          ni.d(true);
          fj.e((byte) 33);
          ba.a((byte) -115);
          mh.c((byte) 88);
          br.h(21);
          hj.h(-48);
          nn.a(0);
          am.k(8421504);
          id.h(-56);
          om.d((byte) -32);
          mk.c((byte) 85);
          ce.b(46);
          hn.a(122);
          qc.d(0);
          vn.c(122);
          il.c(124);
          kc.a(95);
          vo.e(-77);
          ge.c(6);
          lj.b(false);
          ul.a((byte) -73);
          ak.d(-19537);
          p.b(false);
          vd.a(true);
          dh.a();
          rf.a((byte) 98);
          ao.a(81);
          aa.b(118);
          ic.a(false);
          ga.a(0);
          rk.d((byte) 21);
          u.a(2);
          oa.h(47);
          gq.d(false);
          sb.a((byte) -102);
          qp.a(false);
          o.b(31583);
          ok.b(-116);
          mo.d(false);
          rh.a(121);
          fc.b(31797);
          fi.d((byte) -31);
          oo.d((byte) -61);
          sn.f(94);
          er.a((byte) -121);
          gi.f(-417029247);
          ip.b(false);
          ai.f(0);
          ci.d((byte) 21);
          td.f(0);
          jk.d((byte) -46);
          dp.f(1);
          qb.f(0);
          qa.d((byte) -119);
          tj.g();
          tn.c(-52);
          ko.a((byte) 117);
          im.a(-32);
          bc.a((byte) -59);
          if (param0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          rp.c(stackIn_9_0 != 0);
          lh.f((byte) -101);
          ah.f(-5);
          lf.g(-118);
          md.g((byte) 121);
          af.f((byte) -106);
          di.a(8070);
          hq.f(550);
          de.g(2);
          ol.f(14529);
          vp.f(0);
          ta.a(0);
          np.a(true);
          rn.b(57);
          mj.b((byte) 124);
          cp.j((byte) -113);
          tb.m(-48);
          bh.n(28);
          lp.o(50);
          dk.a(-11310);
          he.a((byte) 36);
          hk.i((byte) 88);
          qo.h(-106);
          eh.a(-31063);
          ua.a(2);
          if (param0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          ll.a(stackIn_12_0 != 0);
          ek.c(param0);
          kp.a(-68);
          ih.c(-12200);
          kg.b(26679);
          co.b(-70);
          um.a(31292);
          mg.b();
          bk.a();
          dc.a(-9669);
          fr.b((byte) -52);
          sh.a(125);
          fm.a((byte) 68);
          gj.a(-27956);
          mq.b(-30593);
          rm.a(-41);
          uo.a((byte) 66);
          og.d(true);
          so.b((byte) -19);
          rg.a(64);
          kn.a((byte) 90);
          an.c((byte) -93);
          na.k((byte) 84);
          ag.c(false);
          d.g(-66);
          oc.c(-14711);
          ep.a(param0);
          kb.d((byte) 98);
          jl.a(31186);
          bj.i(111);
          jc.a((byte) -17);
          ib.f((byte) -67);
          kh.c(117);
          h.f((byte) -102);
          qm.a((byte) -120);
          pl.a(0);
          if (param0) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          od.a(stackIn_15_0 != 0);
          nd.a((byte) 121);
          lm.a(true);
          tl.a(10);
          tc.a();
          ro.a((byte) -102);
          bg.a(6);
          if (param0) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L5;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L5;
          }
        }
        gd.a(stackIn_18_0 != 0);
        rl.a(-18657);
        ei.a(1);
        up.b(3);
        pf.a(0);
        dg.a(-51);
        gr.a((byte) 118);
        fg.a();
        ui.b(1516);
        wd.f(32463);
        to.a(-125);
        si.a(120);
        ka.c((byte) 67);
        hr.g();
        lk.c(2143);
        dl.b(-9125);
        ef.b(10);
        cg.f((byte) -124);
        jo.b(11);
        rq.a((byte) -118);
        hg.a((byte) 19);
        hp.a(67108864);
        va.a(-15504);
        jh.a((byte) -123);
        se.a(84);
        pq.a((byte) 118);
        jm.b((byte) 31);
        qq.a();
        bm.a((byte) -116);
        ar.a(-1);
        ma.c(false);
        sf.o(-16124);
        vb.i(80);
        fe.l(98);
        cr.a((byte) 123);
        ri.a((byte) -83);
        lg.j(-2);
        wl.a(2);
        nf.f((byte) -42);
        bf.a(8192);
        k.c((byte) -109);
        go.a(-7393);
        ig.a(12127);
        uf.a((byte) 85);
        dq.a((byte) 89);
        a.h((byte) -128);
        lq.b(true);
        da.e((byte) 102);
        ve.a((byte) 47);
        kj.h(-122);
        jq.c((byte) 56);
        hb.a((byte) 78);
        ug.h(0);
        eq.b(-1);
        vh.a(110);
        qi.j(18724);
        oj.a((byte) -51);
        ji.a(24968);
        gp.b(2);
        sl.f(31434);
        dn.a(1);
        jb.i((byte) -116);
        eo.c(7301);
        c.a(true);
        th.a(125);
        ej.h(928072);
        wi.b((byte) -54);
        ho.a();
        ja.a(2);
        ik.c(-93);
        ae.a((byte) 84);
        wk.a((byte) 127);
        nc.a(0);
        uj.a(true);
        ab.f((byte) -112);
        gn.i(61);
        ac.c(0);
        n.b(-2);
        pg.a(-128);
        pe.a(112);
        pn.a(-17432);
        mp.h(-115);
        eg.a(136);
        sp.a(-241);
        pk.a((byte) -105);
        cq.a((byte) -105);
        hi.c((byte) -93);
        bb.a(false);
        r.d((byte) 91);
        ob.b(-95);
        bd.a(true);
        sk.a(51550);
        l.a((byte) 49);
        po.b(-81);
        al.a(28391);
        e.a(105);
        pa.c(5);
        tq.a(1024);
        oh.a((byte) 83);
        fa.a((byte) -102);
        nj.a(0);
        pb.a((byte) 121);
        me.a(100);
        cm.b((byte) -121);
        eb.a(false);
        ii.a(20888);
        ck.a(30850);
        nq.a((byte) -77);
        fp.c(false);
        vq.h(-257);
        oq.h((byte) -34);
        jf.a(false);
        i.d(0);
        cc.g(6);
        bl.h((byte) -124);
        lc.a(32156);
        ec.a(0);
        tf.a(6);
        ln.a((byte) -46);
        qh.a(109);
        pj.d(31366);
        ml.a((byte) 111);
        be.b(2);
        fl.f(-90);
        g.b(true);
        sg.e((byte) 124);
        uc.g(0);
        cb.f(-71);
        mi.a(-81);
        gg.a((byte) -25);
        lo.a((byte) 38);
        ((BrickABrac) this).field_x = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Change display name";
        field_H = "<%0>: <%1>";
    }
}
