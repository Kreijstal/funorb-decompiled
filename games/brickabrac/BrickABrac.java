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
        int stackOut_4_0;
        int stackOut_3_0;
        int stackOut_1_0;
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
              if (-81 < (var5 ^ -1)) {
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
        int stackIn_10_0 = 0;
        gf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        gf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        gf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        gf stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackOut_8_0;
        int stackOut_7_0;
        int stackOut_5_0;
        gf stackOut_14_0;
        int stackOut_14_1;
        gf stackOut_15_0;
        int stackOut_15_1;
        gf stackOut_16_0;
        int stackOut_16_1;
        int stackOut_16_2;
        gf stackOut_17_0;
        int stackOut_17_1;
        int stackOut_17_2;
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
          if (hd.field_d != null) {
            if (lp.field_rb.a((byte) -51)) {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L2;
            } else {
              stackOut_7_0 = 0;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
          } else {
            stackOut_5_0 = 0;
            stackIn_10_0 = stackOut_5_0;
            break L2;
          }
        }
        L3: {
          L4: {
            var3 = stackIn_10_0;
            if ((Object) (Object) pe.field_o != (Object) (Object) lp.field_rb) {
              break L4;
            } else {
              if (pe.field_o.field_p) {
                break L4;
              } else {
                if (var3 == 0) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
          }
          L5: {
            L6: {
              stackOut_14_0 = lp.field_rb;
              stackOut_14_1 = 1;
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (!param0) {
                break L6;
              } else {
                stackOut_15_0 = (gf) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (var3 != 0) {
                  break L6;
                } else {
                  stackOut_16_0 = (gf) (Object) stackIn_16_0;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
            }
            stackOut_17_0 = (gf) (Object) stackIn_17_0;
            stackOut_17_1 = stackIn_17_1;
            stackOut_17_2 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            break L5;
          }
          ((gf) (Object) stackIn_18_0).a(stackIn_18_1 != 0, stackIn_18_2 != 0, -104);
          break L3;
        }
        L7: {
          if (var3 != 0) {
            L8: {
              L9: {
                if ((Object) (Object) pe.field_o != (Object) (Object) hd.field_d) {
                  break L9;
                } else {
                  if (!pe.field_o.field_p) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (hd.field_d != null) {
                hd.field_d.a(false, false, -82);
                break L8;
              } else {
                break L8;
              }
            }
            kh.field_a = kh.field_a + 1;
            if (32 != kh.field_a) {
              break L7;
            } else {
              sk.i((byte) -126);
              break L7;
            }
          } else {
            if (pe.field_o == null) {
              break L7;
            } else {
              if ((Object) (Object) lp.field_rb == (Object) (Object) pe.field_o) {
                break L7;
              } else {
                if (pe.field_o.field_p) {
                  pe.field_o.a(false, false, -81);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
          }
        }
        L10: {
          if (null == kp.field_c.d(-8)) {
            break L10;
          } else {
            ok.field_c = ok.field_c + 1;
            if (-336 == ok.field_c + 1) {
              ok.field_c = 0;
              nm discarded$1 = kp.field_c.c(3);
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (-51 == ok.field_c) {
            wp.a(8, ta.field_e[9]);
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (cf.a((byte) 62)) {
            sq.a(false);
            break L12;
          } else {
            break L12;
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
        int stackOut_7_0;
        int stackOut_6_0;
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
        int[] var4_ref_int__ = null;
        int var4 = 0;
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
        int stackIn_39_0 = 0;
        int stackIn_51_0 = 0;
        qj stackIn_52_0 = null;
        qj stackIn_53_0 = null;
        qj stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        qj stackIn_66_0 = null;
        qj stackIn_67_0 = null;
        qj stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        qj stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        pi stackIn_88_2 = null;
        qj stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        pi stackIn_89_2 = null;
        qj stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        pi stackIn_90_2 = null;
        int stackIn_90_3 = 0;
        qj stackOut_65_0;
        qj stackOut_67_0;
        int stackOut_67_1;
        qj stackOut_66_0;
        int stackOut_66_1;
        qj stackOut_87_0;
        int stackOut_87_1;
        pi stackOut_87_2;
        qj stackOut_89_0;
        int stackOut_89_1;
        pi stackOut_89_2;
        int stackOut_89_3;
        qj stackOut_88_0;
        int stackOut_88_1;
        pi stackOut_88_2;
        int stackOut_88_3;
        int stackOut_38_0;
        int stackOut_37_0;
        int stackOut_50_0;
        int stackOut_49_0;
        qj stackOut_51_0;
        qj stackOut_53_0;
        int stackOut_53_1;
        qj stackOut_52_0;
        int stackOut_52_1;
        var16 = field_J ? 1 : 0;
        if (9 != param2) {
          if (14 != param2) {
            if (param2 != 15) {
              L0: {
                if (param2 != -11) {
                  break L0;
                } else {
                  if (ue.field_c) {
                    sj.a((byte) 33);
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
              if (-73 != param2) {
                L1: {
                  if (-65 == (si.field_a ^ -1)) {
                    break L1;
                  } else {
                    if (65 != si.field_a) {
                      if (79 == si.field_a) {
                        if (pe.field_o != null) {
                          L2: {
                            if (pe.field_o.field_q) {
                              rk.a("T3", (Throwable) null, 44);
                              break L2;
                            } else {
                              L3: {
                                pe.field_o.field_x = pe.field_o.field_x + 1;
                                pe.field_o.field_w.field_l[pe.field_o.field_x].a(false, (wq) (Object) param0, pe.field_o.field_w.field_k);
                                stackOut_65_0 = pe.field_o;
                                stackIn_67_0 = stackOut_65_0;
                                stackIn_66_0 = stackOut_65_0;
                                if (pe.field_o.field_x != pe.field_o.field_w.field_k) {
                                  stackOut_67_0 = (qj) (Object) stackIn_67_0;
                                  stackOut_67_1 = 0;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  break L3;
                                } else {
                                  stackOut_66_0 = (qj) (Object) stackIn_66_0;
                                  stackOut_66_1 = 1;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  break L3;
                                }
                              }
                              ((qj) (Object) stackIn_68_0).field_q = stackIn_68_1 != 0;
                              if (!pe.field_o.field_q) {
                                break L2;
                              } else {
                                if (!pe.field_o.c(103)) {
                                  pe.field_o.field_w.field_l[pe.field_o.field_k].field_E = pe.field_o.field_w.field_l[pe.field_o.field_k].field_F - 50;
                                  break L2;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        if (66 != si.field_a) {
                          L4: {
                            if (null == pe.field_o) {
                              break L4;
                            } else {
                              if (76 != si.field_a) {
                                L5: {
                                  if (73 == si.field_a) {
                                    break L5;
                                  } else {
                                    if (si.field_a == 74) {
                                      break L5;
                                    } else {
                                      if (si.field_a != 75) {
                                        if (77 != si.field_a) {
                                          if ((si.field_a ^ -1) == -79) {
                                            pe.field_o.a(param0, true, 118);
                                            return true;
                                          } else {
                                            if (si.field_a != 67) {
                                              if (si.field_a != 69) {
                                                if (si.field_a != 70) {
                                                  if ((si.field_a ^ -1) == -72) {
                                                    L6: {
                                                      pe.field_o.field_v = param0.l(255);
                                                      if (pe.field_o != null) {
                                                        fr.a(1);
                                                        break L6;
                                                      } else {
                                                        break L6;
                                                      }
                                                    }
                                                    return true;
                                                  } else {
                                                    break L4;
                                                  }
                                                } else {
                                                  L7: {
                                                    pe.field_o.field_w.field_j = param0.l(255);
                                                    if (pe.field_o == null) {
                                                      break L7;
                                                    } else {
                                                      fr.a(1);
                                                      break L7;
                                                    }
                                                  }
                                                  return true;
                                                }
                                              } else {
                                                pe.field_o.a(18504, param0);
                                                return true;
                                              }
                                            } else {
                                              pe.field_o.a(param0, param1 + -47);
                                              return true;
                                            }
                                          }
                                        } else {
                                          pe.field_o.a(param0, false, 87);
                                          return true;
                                        }
                                      } else {
                                        pe.field_o.a((byte) 33, param0);
                                        return true;
                                      }
                                    }
                                  }
                                }
                                L8: {
                                  stackOut_87_0 = pe.field_o;
                                  stackOut_87_1 = -15;
                                  stackOut_87_2 = (pi) param0;
                                  stackIn_89_0 = stackOut_87_0;
                                  stackIn_89_1 = stackOut_87_1;
                                  stackIn_89_2 = stackOut_87_2;
                                  stackIn_88_0 = stackOut_87_0;
                                  stackIn_88_1 = stackOut_87_1;
                                  stackIn_88_2 = stackOut_87_2;
                                  if (si.field_a != 74) {
                                    stackOut_89_0 = (qj) (Object) stackIn_89_0;
                                    stackOut_89_1 = stackIn_89_1;
                                    stackOut_89_2 = (pi) (Object) stackIn_89_2;
                                    stackOut_89_3 = 0;
                                    stackIn_90_0 = stackOut_89_0;
                                    stackIn_90_1 = stackOut_89_1;
                                    stackIn_90_2 = stackOut_89_2;
                                    stackIn_90_3 = stackOut_89_3;
                                    break L8;
                                  } else {
                                    stackOut_88_0 = (qj) (Object) stackIn_88_0;
                                    stackOut_88_1 = stackIn_88_1;
                                    stackOut_88_2 = (pi) (Object) stackIn_88_2;
                                    stackOut_88_3 = 1;
                                    stackIn_90_0 = stackOut_88_0;
                                    stackIn_90_1 = stackOut_88_1;
                                    stackIn_90_2 = stackOut_88_2;
                                    stackIn_90_3 = stackOut_88_3;
                                    break L8;
                                  }
                                }
                                ((qj) (Object) stackIn_90_0).a((byte) stackIn_90_1, (pi) (Object) stackIn_90_2, stackIn_90_3 != 0);
                                return true;
                              } else {
                                pe.field_o.a(param0, (byte) 74);
                                return true;
                              }
                            }
                          }
                          if (param1 == 47) {
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          L9: {
                            if (pe.field_o != null) {
                              L10: {
                                sk.i((byte) -123);
                                if (pe.field_o.c(123)) {
                                  break L10;
                                } else {
                                  pe.field_o.a((byte) 40, false);
                                  break L10;
                                }
                              }
                              pe.field_o.a(false, (byte) 69);
                              cc.field_G = true;
                              pf.field_p = true;
                              on.field_E = 0;
                              ng.a(false, 125, -2);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          ed.field_d = false;
                          return true;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L11: {
                  sk.i((byte) -125);
                  if (param0.l(255) == 0) {
                    stackOut_38_0 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    break L11;
                  } else {
                    stackOut_37_0 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    break L11;
                  }
                }
                var4 = stackIn_39_0;
                var30 = new String[param0.l(255)];
                var5_array = var30;
                var6 = param0.b(true);
                var7 = 0;
                L12: while (true) {
                  if (var30.length <= var7) {
                    L13: {
                      if (-1 < (var6 ^ -1)) {
                        var6 = -2;
                        break L13;
                      } else {
                        break L13;
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
                    L14: while (true) {
                      if (var10 >= var30.length) {
                        L15: {
                          var58 = kk.a(false, tq.field_d.field_i, var8);
                          var11 = param0.b(true);
                          var12 = new oi(tq.field_d, var58, var11);
                          var13 = var8.a(-37880252, 11);
                          oa.field_Sb = rd.a(var13, (byte) 19);
                          var60 = id.a(var8, false);
                          fj.field_Ub = null;
                          if (0 <= var6) {
                            stackOut_50_0 = 1 << var6;
                            stackIn_51_0 = stackOut_50_0;
                            break L15;
                          } else {
                            stackOut_49_0 = 0;
                            stackIn_51_0 = stackOut_49_0;
                            break L15;
                          }
                        }
                        L16: {
                          var15 = stackIn_51_0;
                          pe.field_o = new qj(true, var4 != 0, var30, var6, var15, var12, var59, var60);
                          stackOut_51_0 = pe.field_o;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_52_0 = stackOut_51_0;
                          if (param0.l(255) != 0) {
                            stackOut_53_0 = (qj) (Object) stackIn_53_0;
                            stackOut_53_1 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            break L16;
                          } else {
                            stackOut_52_0 = (qj) (Object) stackIn_52_0;
                            stackOut_52_1 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            stackIn_54_1 = stackOut_52_1;
                            break L16;
                          }
                        }
                        L17: {
                          ((qj) (Object) stackIn_54_0).field_q = stackIn_54_1 != 0;
                          if (pe.field_o.field_q) {
                            break L17;
                          } else {
                            pe.field_o.field_x = 0;
                            break L17;
                          }
                        }
                        L18: {
                          if ((si.field_a ^ -1) == -65) {
                            i.c((byte) 32);
                            fr.a(param1 ^ 46);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        ed.field_d = false;
                        r.field_A = false;
                        pf.field_p = false;
                        ng.a(false, param1 ^ 105, -1);
                        return true;
                      } else {
                        var9[var10] = var8.b(105);
                        var10++;
                        continue L14;
                      }
                    }
                  } else {
                    var5_array[var7] = param0.f(255);
                    var7++;
                    continue L12;
                  }
                }
              } else {
                var53 = vn.d(8);
                var43 = var53;
                var35 = var43;
                var27 = var35;
                var4_ref_int__ = var27;
                var18 = var4_ref_int__;
                var5 = var18;
                var25 = param0;
                var7 = ((wq) (Object) var25).l(255);
                var8_int = 0;
                L19: while (true) {
                  if (var7 <= var8_int) {
                    var51 = var4_ref_int__;
                    var41 = var51;
                    var34 = var41;
                    var26 = var34;
                    var19 = var26;
                    var5 = var19;
                    var52 = mk.field_b;
                    var7 = 0;
                    L20: while (true) {
                      if ((var7 ^ -1) <= -9) {
                        L21: {
                          if (!hb.field_y) {
                            break L21;
                          } else {
                            var5_int = ea.a(true, var53);
                            var6 = 0;
                            L22: while (true) {
                              if (var6 > var5_int) {
                                break L21;
                              } else {
                                if (eo.a(var53, var6, (byte) -75)) {
                                  kp.field_c.a((nm) (Object) new kq(var6), (byte) 3);
                                  var6++;
                                  continue L22;
                                } else {
                                  var6++;
                                  continue L22;
                                }
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
                        var55 = var4_ref_int__;
                        var7 = 0;
                        L23: while (true) {
                          if ((var7 ^ -1) <= -9) {
                            var56 = pl.field_b;
                            var46 = var56;
                            var37 = var46;
                            var29 = var37;
                            var23 = var29;
                            var5 = var23;
                            var57 = var4_ref_int__;
                            var7 = 0;
                            L24: while (true) {
                              if ((var7 ^ -1) <= -9) {
                                return true;
                              } else {
                                var23[var7] = ud.d(var56[var7], var57[var7]);
                                var7++;
                                continue L24;
                              }
                            }
                          } else {
                            var21[var7] = ud.d(var54[var7], var55[var7]);
                            var7++;
                            continue L23;
                          }
                        }
                      } else {
                        var19[var7] = ik.a(var51[var7], var52[var7] ^ -1);
                        var7++;
                        continue L20;
                      }
                    }
                  } else {
                    var18[var8_int] = ((wq) (Object) var25).e(255);
                    var8_int++;
                    continue L19;
                  }
                }
              }
            } else {
              L25: {
                if (!ue.field_c) {
                  break L25;
                } else {
                  eq.a(7);
                  an.d((byte) -56);
                  ng.a(false, param1 + 43, 0);
                  ue.field_c = false;
                  cc.field_G = true;
                  dp.field_y = true;
                  break L25;
                }
              }
              ed.field_d = false;
              pf.field_p = false;
              vh.field_L = false;
              return true;
            }
          } else {
            sk.i((byte) -116);
            hm.a(nc.c(param1 ^ -71), (byte) 86, qh.field_h, mq.c(0), 150, fj.a(2000, (byte) -54), aj.a(1345), fj.a(8, (byte) -53), 1024, jb.field_I.length);
            hn.a(lh.f(115), kb.h(param1 + -45), param1 ^ 12);
            vh.field_L = false;
            ue.field_c = true;
            ng.a(false, 113, -2);
            return true;
          }
        } else {
          sk.i((byte) -113);
          vh.field_L = false;
          ng.a(false, param1 + 66, 11);
          kk.a(true, param0.d(-1));
          return true;
        }
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
              if (-10 != (lp.field_rb.field_a ^ -1)) {
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
              if ((sl.field_z ^ -1) != 1) {
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
        int var4 = field_J ? 1 : 0;
        if (param1 == param0) {
            ed.field_d = true;
            vh.field_L = true;
        } else {
            if (!ue.field_c) {
            } else {
                dp.field_y = true;
                cc.field_G = true;
                if (pe.field_o != null) {
                    // ifne L77
                    kk.a(true, sg.field_k);
                    ng.a(false, param1 ^ 118, 11);
                } else {
                    ng.a(false, 120, 0);
                }
                if (!(!(lp.field_rb instanceof km))) {
                    ((km) (Object) lp.field_rb).a(false, 0, param1 + 116);
                }
                ue.field_c = false;
            }
            vh.field_L = false;
            ed.field_d = false;
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
            if (!(-6 != (param0 ^ -1))) {
                im.field_g = !im.field_g ? true : false;
                return true;
            }
            if (!(6 != param0)) {
                pf.field_f = !pf.field_f ? true : false;
                return true;
            }
            if (!(-8 != (param0 ^ -1))) {
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
        if (-4097 >= param1) {
            return -6145 > param1 ? -um.field_j[6144 - param1] : um.field_j[param1 + -6144];
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
        int stackOut_2_0;
        int stackOut_1_0;
        int stackOut_5_0;
        int stackOut_4_0;
        int stackOut_8_0;
        int stackOut_7_0;
        int stackOut_11_0;
        int stackOut_10_0;
        int stackOut_14_0;
        int stackOut_13_0;
        int stackOut_17_0;
        int stackOut_16_0;
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
