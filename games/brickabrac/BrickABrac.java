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
              int discarded$5 = 0;
              int discarded$6 = 0;
              jn.a(kh.field_a - -1, 256, 16769381);
              break L1;
            } else {
              hd.field_d.b((byte) -85);
              int discarded$7 = 0;
              int discarded$8 = 0;
              jn.a(32 - (kh.field_a + -1), 256, 16769381);
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
            int discarded$9 = -79;
            rd.b();
            break L5;
          }
        }
    }

    public final void a(boolean param0, byte param1) {
        pn var3_ref_pn = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
          int discarded$5 = -127;
          vd.a();
          de.field_x = de.field_x + 1;
          if (!og.h(-26090)) {
            L1: while (true) {
              var3_ref_pn = (pn) (Object) kq.field_j.c(3);
              if (var3_ref_pn == null) {
                break L0;
              } else {
                int discarded$6 = -116;
                int discarded$7 = 5;
                g.a(var3_ref_pn);
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
            int fieldTemp$8 = ok.field_c + 1;
            ok.field_c = ok.field_c + 1;
            if (fieldTemp$8 == 335) {
              ok.field_c = 0;
              nm discarded$9 = kp.field_c.c(3);
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
        int discarded$0 = 1;
        am.a(ch.field_g);
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
                        int discarded$9 = 33;
                        sj.a();
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
                                    int fieldTemp$10 = pe.field_o.field_x;
                                    pe.field_o.field_x = pe.field_o.field_x + 1;
                                    pe.field_o.field_w.field_l[fieldTemp$10].a(false, (wq) (Object) param0, pe.field_o.field_w.field_k);
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
                              int discarded$11 = 0;
                              var60 = id.a(var8);
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
                                int discarded$12 = 32;
                                i.c();
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
                                      int discarded$13 = -75;
                                      if (!eo.a(var4_array, var6)) {
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
                      int discarded$14 = 7;
                      eq.a();
                      int discarded$15 = -56;
                      an.d();
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
                int discarded$16 = 0;
                int discarded$17 = 1345;
                hm.a(nc.c(param1 ^ -71), (byte) 86, qh.field_h, mq.c(), 150, fj.a(2000, (byte) -54), aj.a(), fj.a(8, (byte) -53), 1024, jb.field_I.length);
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
                int discarded$49 = -1;
                if (!ib.a(pl.field_b)) {
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
                int discarded$50 = 1;
                cb.b();
                break L0;
              }
            }
          }
          int discarded$51 = -64;
          dk.h();
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
        int discarded$0 = 107;
        og.d();
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
          int discarded$233 = -42;
          ea.a();
          int discarded$234 = 1;
          b.a();
          int discarded$235 = 0;
          fd.a();
          int discarded$236 = 70;
          oi.a();
          int discarded$237 = -107;
          km.b();
          uk.f((byte) 88);
          int discarded$238 = -115;
          ud.f();
          ld.g(-25617);
          int discarded$239 = -75;
          la.a();
          v.a(false);
          int discarded$240 = -42;
          op.a();
          int discarded$241 = -115;
          kq.a();
          int discarded$242 = 100;
          vl.b();
          int discarded$243 = 2;
          fo.a();
          int discarded$244 = 81;
          sc.a();
          int discarded$245 = -114;
          ue.a();
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
          int discarded$246 = 120;
          nh.b();
          int discarded$247 = -113;
          qg.k();
          int discarded$248 = 121;
          nk.a();
          int discarded$249 = -789103103;
          aj.b();
          sj.a(11);
          int discarded$250 = 0;
          pp.a();
          int discarded$251 = 0;
          jd.a();
          int discarded$252 = 100;
          wc.a();
          int discarded$253 = 20623;
          ch.a();
          int discarded$254 = 108;
          df.a();
          gh.a(-21727);
          int discarded$255 = 1;
          vj.a();
          int discarded$256 = 8;
          hm.a();
          lb.c();
          int discarded$257 = -128;
          mc.a();
          tm.a(param0);
          int discarded$258 = 78;
          wo.b();
          ke.d(19254);
          ad.b(-16637);
          int discarded$259 = 24;
          dm.a();
          int discarded$260 = 102;
          gk.a();
          int discarded$261 = 0;
          mf.a();
          int discarded$262 = -11470;
          t.a();
          int discarded$263 = 108;
          wm.a();
          int discarded$264 = 0;
          wq.h();
          int discarded$265 = -41;
          wn.c();
          int discarded$266 = 13;
          vg.b();
          int discarded$267 = 46;
          rd.a();
          int discarded$268 = 117;
          cn.a();
          gb.a(0);
          kd.a(param0);
          fq.a((byte) 15);
          int discarded$269 = 66;
          dj.a();
          int discarded$270 = -125;
          nb.a();
          s.c(4862);
          int discarded$271 = 0;
          wg.a();
          qn.b(0);
          ng.a((byte) -49);
          gf.c((byte) -91);
          of.a(-2);
          int discarded$272 = 81;
          qj.d();
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
          int discarded$273 = -117;
          wp.a();
          int discarded$274 = -106;
          bn.d();
          int discarded$275 = 34;
          vi.a();
          int discarded$276 = 97;
          no.d();
          int discarded$277 = -2947;
          j.d();
          int discarded$278 = -116;
          ee.e();
          int discarded$279 = 1;
          cl.b();
          ij.c(false);
          int discarded$280 = -12251;
          cf.a();
          q.a((byte) -32);
          int discarded$281 = 1;
          hh.a();
          kk.a(0);
          int discarded$282 = 102;
          w.d();
          int discarded$283 = 24311;
          rj.a();
          int discarded$284 = 1;
          bq.a();
          fk.a((byte) -94);
          jj.a(true);
          int discarded$285 = -11;
          sq.a();
          int discarded$286 = -106;
          nl.a();
          re.b((byte) -60);
          int discarded$287 = -104;
          ed.a();
          ki.a((byte) 7);
          int discarded$288 = -116;
          rb.a();
          int discarded$289 = -54;
          jg.a();
          int discarded$290 = -61;
          hc.a();
          m.c(2);
          f.a(1);
          int discarded$291 = 12;
          hd.a();
          int discarded$292 = 65;
          cd.a();
          ff.a((byte) 114);
          int discarded$293 = 119;
          wh.b();
          we.a(-8495);
          sm.a(30000);
          int discarded$294 = -29988;
          fh.a();
          ni.d(true);
          fj.e((byte) 33);
          int discarded$295 = -115;
          ba.a();
          mh.c((byte) 88);
          int discarded$296 = 21;
          br.h();
          int discarded$297 = -48;
          hj.h();
          int discarded$298 = 0;
          nn.a();
          am.k(8421504);
          int discarded$299 = -56;
          id.h();
          int discarded$300 = -32;
          om.d();
          int discarded$301 = 85;
          mk.c();
          int discarded$302 = 46;
          ce.b();
          int discarded$303 = 122;
          hn.a();
          int discarded$304 = 0;
          qc.d();
          int discarded$305 = 122;
          vn.c();
          int discarded$306 = 124;
          il.c();
          kc.a(95);
          int discarded$307 = -77;
          vo.e();
          ge.c(6);
          int discarded$308 = 0;
          lj.b();
          int discarded$309 = -73;
          ul.a();
          int discarded$310 = -19537;
          ak.d();
          p.b(false);
          vd.a(true);
          dh.a();
          int discarded$311 = 98;
          rf.a();
          int discarded$312 = 81;
          ao.a();
          int discarded$313 = 118;
          aa.b();
          ic.a(false);
          ga.a(0);
          rk.d((byte) 21);
          int discarded$314 = 2;
          u.a();
          int discarded$315 = 47;
          oa.h();
          gq.d(false);
          int discarded$316 = -102;
          sb.a();
          int discarded$317 = 0;
          qp.a();
          int discarded$318 = 31583;
          o.b();
          int discarded$319 = -116;
          ok.b();
          mo.d(false);
          rh.a(121);
          int discarded$320 = 31797;
          fc.b();
          int discarded$321 = -31;
          fi.d();
          int discarded$322 = -61;
          oo.d();
          int discarded$323 = 94;
          sn.f();
          int discarded$324 = -121;
          er.a();
          int discarded$325 = -417029247;
          gi.f();
          int discarded$326 = 0;
          ip.b();
          int discarded$327 = 0;
          ai.f();
          ci.d((byte) 21);
          int discarded$328 = 0;
          td.f();
          int discarded$329 = -46;
          jk.d();
          int discarded$330 = 1;
          dp.f();
          qb.f(0);
          int discarded$331 = -119;
          qa.d();
          tj.g();
          tn.c(-52);
          int discarded$332 = 117;
          ko.a();
          im.a(-32);
          int discarded$333 = -59;
          bc.a();
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
          int discarded$334 = -101;
          lh.f();
          ah.f(-5);
          int discarded$335 = -118;
          lf.g();
          md.g((byte) 121);
          int discarded$336 = -106;
          af.f();
          di.a(8070);
          int discarded$337 = 550;
          hq.f();
          de.g(2);
          int discarded$338 = 14529;
          ol.f();
          int discarded$339 = 0;
          vp.f();
          ta.a(0);
          np.a(true);
          int discarded$340 = 57;
          rn.b();
          int discarded$341 = 124;
          mj.b();
          cp.j((byte) -113);
          int discarded$342 = -48;
          tb.m();
          int discarded$343 = 28;
          bh.n();
          lp.o(50);
          int discarded$344 = -11310;
          dk.a();
          int discarded$345 = 36;
          he.a();
          int discarded$346 = 88;
          hk.i();
          qo.h(-106);
          int discarded$347 = -31063;
          eh.a();
          int discarded$348 = 2;
          ua.a();
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
          int discarded$349 = -68;
          kp.a();
          int discarded$350 = -12200;
          ih.c();
          int discarded$351 = 26679;
          kg.b();
          int discarded$352 = -70;
          co.b();
          int discarded$353 = 31292;
          um.a();
          mg.b();
          bk.a();
          int discarded$354 = -9669;
          dc.a();
          int discarded$355 = -52;
          fr.b();
          sh.a(125);
          fm.a((byte) 68);
          int discarded$356 = -27956;
          gj.a();
          int discarded$357 = -30593;
          mq.b();
          int discarded$358 = -41;
          rm.a();
          uo.a((byte) 66);
          og.d(true);
          int discarded$359 = -19;
          so.b();
          rg.a(64);
          kn.a((byte) 90);
          an.c((byte) -93);
          int discarded$360 = 84;
          na.k();
          ag.c(false);
          int discarded$361 = -66;
          d.g();
          oc.c(-14711);
          ep.a(param0);
          int discarded$362 = 98;
          kb.d();
          jl.a(31186);
          int discarded$363 = 111;
          bj.i();
          jc.a((byte) -17);
          ib.f((byte) -67);
          int discarded$364 = 117;
          kh.c();
          int discarded$365 = -102;
          h.f();
          int discarded$366 = -120;
          qm.a();
          int discarded$367 = 0;
          pl.a();
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
          int discarded$368 = 121;
          nd.a();
          int discarded$369 = 1;
          lm.a();
          int discarded$370 = 10;
          tl.a();
          tc.a();
          int discarded$371 = -102;
          ro.a();
          int discarded$372 = 6;
          bg.a();
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
        int discarded$373 = 1;
        ei.a();
        up.b(3);
        int discarded$374 = 0;
        pf.a();
        dg.a(-51);
        int discarded$375 = 118;
        gr.a();
        fg.a();
        int discarded$376 = 1516;
        ui.b();
        wd.f(32463);
        int discarded$377 = -125;
        to.a();
        int discarded$378 = 120;
        si.a();
        int discarded$379 = 67;
        ka.c();
        hr.g();
        lk.c(2143);
        dl.b(-9125);
        int discarded$380 = 10;
        ef.b();
        int discarded$381 = -124;
        cg.f();
        int discarded$382 = 11;
        jo.b();
        int discarded$383 = -118;
        rq.a();
        int discarded$384 = 19;
        hg.a();
        int discarded$385 = 67108864;
        hp.a();
        int discarded$386 = -15504;
        va.a();
        int discarded$387 = -123;
        jh.a();
        int discarded$388 = 84;
        se.a();
        pq.a((byte) 118);
        int discarded$389 = 31;
        jm.b();
        qq.a();
        int discarded$390 = -116;
        bm.a();
        ar.a(-1);
        int discarded$391 = 0;
        ma.c();
        sf.o(-16124);
        vb.i(80);
        int discarded$392 = 98;
        fe.l();
        int discarded$393 = 123;
        cr.a();
        int discarded$394 = -83;
        ri.a();
        int discarded$395 = -2;
        lg.j();
        int discarded$396 = 2;
        wl.a();
        int discarded$397 = -42;
        nf.f();
        bf.a(8192);
        int discarded$398 = -109;
        k.c();
        go.a(-7393);
        ig.a(12127);
        int discarded$399 = 85;
        uf.a();
        int discarded$400 = 89;
        dq.a();
        a.h((byte) -128);
        lq.b(true);
        int discarded$401 = 102;
        da.e();
        int discarded$402 = 47;
        ve.a();
        int discarded$403 = -122;
        kj.h();
        int discarded$404 = 56;
        jq.c();
        hb.a((byte) 78);
        int discarded$405 = 0;
        ug.h();
        int discarded$406 = -1;
        eq.b();
        int discarded$407 = 110;
        vh.a();
        int discarded$408 = 18724;
        qi.j();
        int discarded$409 = -51;
        oj.a();
        int discarded$410 = 24968;
        ji.a();
        int discarded$411 = 2;
        gp.b();
        int discarded$412 = 31434;
        sl.f();
        int discarded$413 = 1;
        dn.a();
        int discarded$414 = -116;
        jb.i();
        int discarded$415 = 7301;
        eo.c();
        int discarded$416 = 1;
        c.a();
        th.a(125);
        int discarded$417 = 928072;
        ej.h();
        int discarded$418 = -54;
        wi.b();
        ho.a();
        ja.a(2);
        int discarded$419 = -93;
        ik.c();
        ae.a((byte) 84);
        wk.a((byte) 127);
        int discarded$420 = 0;
        nc.a();
        uj.a(true);
        ab.f((byte) -112);
        gn.i(61);
        int discarded$421 = 0;
        ac.c();
        int discarded$422 = -2;
        n.b();
        int discarded$423 = -128;
        pg.a();
        pe.a(112);
        pn.a(-17432);
        int discarded$424 = -115;
        mp.h();
        int discarded$425 = 136;
        eg.a();
        int discarded$426 = -241;
        sp.a();
        int discarded$427 = -105;
        pk.a();
        int discarded$428 = -105;
        cq.a();
        int discarded$429 = -93;
        hi.c();
        int discarded$430 = 0;
        bb.a();
        int discarded$431 = 91;
        r.d();
        int discarded$432 = -95;
        ob.b();
        bd.a(true);
        int discarded$433 = 51550;
        sk.a();
        int discarded$434 = 49;
        l.a();
        int discarded$435 = -81;
        po.b();
        int discarded$436 = 28391;
        al.a();
        int discarded$437 = 105;
        e.a();
        int discarded$438 = 5;
        pa.c();
        int discarded$439 = 1024;
        tq.a();
        oh.a((byte) 83);
        int discarded$440 = -102;
        fa.a();
        nj.a(0);
        int discarded$441 = 121;
        pb.a();
        int discarded$442 = 100;
        me.a();
        int discarded$443 = -121;
        cm.b();
        int discarded$444 = 0;
        eb.a();
        int discarded$445 = 20888;
        ii.a();
        ck.a(30850);
        int discarded$446 = -77;
        nq.a();
        int discarded$447 = 0;
        fp.c();
        vq.h(-257);
        int discarded$448 = -34;
        oq.h();
        int discarded$449 = 0;
        jf.a();
        int discarded$450 = 0;
        i.d();
        cc.g(6);
        int discarded$451 = -124;
        bl.h();
        lc.a(32156);
        int discarded$452 = 0;
        ec.a();
        int discarded$453 = 6;
        tf.a();
        int discarded$454 = -46;
        ln.a();
        int discarded$455 = 109;
        qh.a();
        pj.d(31366);
        int discarded$456 = 111;
        ml.a();
        int discarded$457 = 2;
        be.b();
        int discarded$458 = -90;
        fl.f();
        int discarded$459 = 1;
        g.b();
        int discarded$460 = 124;
        sg.e();
        int discarded$461 = 0;
        uc.g();
        int discarded$462 = -71;
        cb.f();
        int discarded$463 = -81;
        mi.a();
        int discarded$464 = -25;
        gg.a();
        int discarded$465 = 38;
        lo.a();
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
