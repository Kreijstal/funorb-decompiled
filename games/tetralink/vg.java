/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends hl {
    static String field_Pb;
    private hl field_Rb;
    private hl field_Sb;
    static int field_Lb;
    static tb field_Vb;
    static long[][] field_Ub;
    static long[] field_Ob;
    private StringBuilder field_Tb;
    static String field_Kb;
    private int field_Qb;
    static String field_Mb;
    static String field_Nb;

    final int a(boolean param0, byte param1) {
        int var4 = 0;
        L0: {
          var4 = TetraLink.field_J;
          ((vg) this).a(0, param0);
          if (!param0) {
            break L0;
          } else {
            L1: while (true) {
              if (!nj.b((byte) 28)) {
                break L0;
              } else {
                L2: {
                  if (dg.field_e != 85) {
                    break L2;
                  } else {
                    if ((((vg) this).field_Tb.length() ^ -1) < -1) {
                      StringBuilder discarded$26 = lo.a(-26750, ((vg) this).field_Tb, ((vg) this).field_Tb.length() - 1, ' ');
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    if (lk.a(tb.field_m, -1, (CharSequence) (Object) ((vg) this).field_Tb)) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 != (((vg) this).field_Tb.length() ^ -1)) {
                          break L5;
                        } else {
                          if (tb.field_m == 91) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((vg) this).field_Tb.length() != 1) {
                          break L6;
                        } else {
                          if (tb.field_m == 35) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (93 == tb.field_m) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  StringBuilder discarded$27 = ((vg) this).field_Tb.append(tb.field_m);
                  break L3;
                }
                if (dg.field_e != 84) {
                  if (13 == dg.field_e) {
                    return 1;
                  } else {
                    continue L1;
                  }
                } else {
                  if ((((vg) this).field_Tb.length() ^ -1) >= -1) {
                    return 1;
                  } else {
                    ((vg) this).field_jb = ((vg) this).field_Tb.toString();
                    return 2;
                  }
                }
              }
            }
          }
        }
        if (param1 == 58) {
          L7: {
            ((vg) this).field_Rb.field_jb = ((vg) this).field_Tb.toString();
            if (!param0) {
              break L7;
            } else {
              if (tm.field_t == 0) {
                break L7;
              } else {
                if (((vg) this).field_F != 0) {
                  break L7;
                } else {
                  ((vg) this).field_Qb = 1;
                  break L7;
                }
              }
            }
          }
          return ((vg) this).field_Qb;
        } else {
          return -78;
        }
    }

    final static void i(int param0) {
        of.b(true);
        t.a(4, 0);
        if (param0 != 5959) {
            Object var2 = null;
            vg.a((byte) 20, (ah) null);
        }
    }

    public static void e(byte param0) {
        field_Nb = null;
        field_Vb = null;
        if (param0 != 102) {
            field_Vb = null;
        }
        field_Kb = null;
        field_Ob = null;
        field_Ub = null;
        field_Pb = null;
        field_Mb = null;
    }

    final boolean h(int param0) {
        int var2 = 0;
        if (-1 != (((vg) this).field_Qb ^ -1)) {
          return false;
        } else {
          L0: {
            if (param0 == 0) {
              break L0;
            } else {
              field_Mb = null;
              break L0;
            }
          }
          L1: {
            if (dg.field_e != 85) {
              break L1;
            } else {
              if (0 < ((vg) this).field_Tb.length()) {
                StringBuilder discarded$6 = lo.a(-26750, ((vg) this).field_Tb, ((vg) this).field_Tb.length() + -1, ' ');
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (-13 >= (((vg) this).field_Tb.length() ^ -1)) {
              break L2;
            } else {
              L3: {
                var2 = Character.toLowerCase(tb.field_m);
                if (var2 != 32) {
                  break L3;
                } else {
                  var2 = 95;
                  break L3;
                }
              }
              L4: {
                if (95 != var2) {
                  break L4;
                } else {
                  if (((vg) this).field_Tb.length() > 0) {
                    StringBuilder discarded$7 = ((vg) this).field_Tb.append(var2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (ac.a((byte) -105, (char) var2)) {
                  break L5;
                } else {
                  if (!fd.a((char) var2, (byte) 88)) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              StringBuilder discarded$8 = ((vg) this).field_Tb.append(var2);
              break L2;
            }
          }
          L6: {
            if (-85 == (dg.field_e ^ -1)) {
              if (((vg) this).field_Tb.length() <= 0) {
                ((vg) this).field_Qb = 1;
                break L6;
              } else {
                ((vg) this).field_jb = ((vg) this).field_Tb.toString();
                ((vg) this).field_Qb = 2;
                break L6;
              }
            } else {
              break L6;
            }
          }
          if (dg.field_e == 13) {
            ((vg) this).field_Qb = 1;
            return true;
          } else {
            return true;
          }
        }
    }

    vg(int param0, int param1, int param2, int param3, String param4, hl param5, hl param6, hl param7) {
        super(0L, param5);
        ((vg) this).field_Qb = 0;
        ((vg) this).field_Sb = new hl(0L, param6, param4);
        ((vg) this).a((byte) -93, ((vg) this).field_Sb);
        ((vg) this).field_Rb = new hl(0L, param7);
        ((vg) this).field_Rb.field_N = 16764006;
        ((vg) this).a((byte) -92, ((vg) this).field_Rb);
        ((vg) this).field_Rb.field_O = "|";
        ((vg) this).field_Tb = new StringBuilder(12);
        int var9 = ((vg) this).field_Sb.f(-88);
        ((vg) this).field_Sb.a((byte) -119, var9, 3, qe.field_d, 5);
        ((vg) this).field_Rb.a((byte) -100, var9, qe.field_d + 3, qe.field_d, 5);
        int var10 = var9 + 10;
        int var11 = 3 + (qe.field_d * 2 + 3);
        int var12 = eo.a(var10, (byte) 124, param0, param2);
        int var13 = mh.a(param3, param1, var11, -8748);
        ((vg) this).a((byte) -115, var10, var13, var11, var12);
    }

    final static void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        vj var4 = null;
        int var4_int = 0;
        bm var5_ref_bm = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        bc var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = TetraLink.field_J;
        var9 = kb.field_q;
        var2 = var9.d((byte) -99);
        if (param0 >= 33) {
          L0: {
            var3 = var9.d((byte) -99);
            if (var2 == 0) {
              var4 = (vj) (Object) bd.field_c.c(false);
              if (var4 == null) {
                mk.a(false);
                return;
              } else {
                L1: {
                  var5 = rl.field_d + -var9.field_t;
                  var13 = var4.field_r;
                  var12 = var13;
                  var11 = var12;
                  var10 = var11;
                  var6 = var10;
                  if (var13.length << 274768130 >= var5) {
                    break L1;
                  } else {
                    var5 = var13.length << 1274891714;
                    break L1;
                  }
                }
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var5) {
                    var4.b(false);
                    break L0;
                  } else {
                    var6[var7 >> -1698095966] = var6[var7 >> -1698095966] + (var9.d((byte) -99) << (pl.a(var7, 3) << 744603240));
                    var7++;
                    continue L2;
                  }
                }
              }
            } else {
              if (var2 != 1) {
                fk.a(-105, (Throwable) null, "LR1: " + hc.a(false));
                mk.a(false);
                break L0;
              } else {
                var4_int = var9.e((byte) 82);
                var5_ref_bm = (bm) (Object) gm.field_a.c(false);
                L3: while (true) {
                  L4: {
                    if (var5_ref_bm == null) {
                      break L4;
                    } else {
                      L5: {
                        if (var3 != var5_ref_bm.field_t) {
                          break L5;
                        } else {
                          if (var5_ref_bm.field_r != var4_int) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5_ref_bm = (bm) (Object) gm.field_a.a((byte) -70);
                      continue L3;
                    }
                  }
                  if (var5_ref_bm != null) {
                    var5_ref_bm.b(false);
                    break L0;
                  } else {
                    mk.a(false);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, ah param1) {
        db.field_b = ug.a(param1, (byte) -45, "display_name_changed", "basic");
        pj.field_f = new ji(0L, nj.field_b, wd.field_d, re.field_S);
        fl.field_n = new ji(0L, nj.field_b, re.field_Q, kk.field_P);
        go.field_d = new hl(0L, (hl) null);
        mi.field_Kb = new hl(0L, bk.field_i);
        mi.field_Kb.field_xb = 1;
        th.field_i = new hl(0L, mb.field_x, bm.field_o);
        eo.field_b = new hl(0L, um.field_l, kl.field_g);
        kd.field_i = new hl(0L, ek.field_n);
        go.field_d.a((byte) -85, mi.field_Kb);
        go.field_d.a((byte) 59, th.field_i);
        go.field_d.a((byte) -107, eo.field_b);
        go.field_d.a((byte) -117, (hl) (Object) pj.field_f);
        go.field_d.a((byte) 64, kd.field_i);
        pj.field_f.field_Rb.field_Ob.a(bk.field_i, -2147483648);
        pj.field_f.field_Rb.field_Ob.field_J = 1;
        hl var5 = pj.field_f.field_Rb.field_Ob;
        hl var6 = var5;
        var6.field_xb = 1;
        fl.field_n.field_Rb.field_Ob.a(bk.field_i, -2147483648);
        hl var3 = fl.field_n.field_Rb.field_Ob;
        if (param0 <= 20) {
            return;
        }
        fl.field_n.field_Rb.field_Ob.field_J = 1;
        var3.field_xb = 1;
    }

    final static void j(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var5_ref = null;
        int var6 = 0;
        Object var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var9 = TetraLink.field_J;
          if (aa.field_bc == null) {
            if (null != ud.field_Qb) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = aa.field_bc.field_b;
            stackIn_5_0 = stackOut_1_0 ? 1 : 0;
            break L0;
          }
        }
        L1: {
          var1 = stackIn_5_0;
          if (var1 != 0) {
            stackOut_7_0 = oj.field_a.field_z;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          } else {
            stackOut_6_0 = 480;
            stackIn_8_0 = stackOut_6_0;
            break L1;
          }
        }
        var2 = stackIn_8_0;
        if (param0 >= 83) {
          L2: {
            L3: {
              if (0 != ml.field_ab) {
                break L3;
              } else {
                if (wk.field_u != 0) {
                  break L3;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              var3 = 128;
              var4 = 4210752;
              if (dd.field_a == 0) {
                var4 = 128;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != ml.field_ab) {
                break L5;
              } else {
                var3 = wd.field_i / 2;
                break L5;
              }
            }
            L6: {
              if (0 == wk.field_u) {
                var3 = (-wd.field_i + 256) / 2;
                break L6;
              } else {
                break L6;
              }
            }
            var5 = 0;
            L7: while (true) {
              if (var5 >= 18) {
                var5 = 18;
                L8: while (true) {
                  if (var5 >= 20) {
                    L9: {
                      var5_ref = null;
                      if (ml.field_ab == 1) {
                        var5_ref = (Object) (Object) qf.field_d;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (ml.field_ab == 2) {
                        var5_ref = (Object) (Object) ai.field_c;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (-1 == (wd.field_i ^ -1)) {
                      go.field_g.b((String) var5_ref, -(int)a.field_d + 652, var2 - 2, 16777215, -1);
                      break L2;
                    } else {
                      L11: {
                        var6_ref = null;
                        if (1 == wk.field_u) {
                          var6_ref = (Object) (Object) qf.field_d;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (wk.field_u == 2) {
                          var6_ref = (Object) (Object) ai.field_c;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      go.field_g.c((String) var5_ref, -(int)a.field_d + 652, -2 + var2, 16777215, -1, -wd.field_i + 256);
                      go.field_g.c((String) var6_ref, -(int)a.field_d + 652, var2 + -2, 16777215, -1, wd.field_i);
                      break L2;
                    }
                  } else {
                    ra.e(-(int)a.field_d + (638 + var5 / 2), -var5 + var2, 2 + ((int)a.field_d - var5 / 2), 16777215, var3);
                    var5++;
                    continue L8;
                  }
                }
              } else {
                ra.e(-(int)a.field_d + (640 - -(var5 / 2)), -var5 + var2, -(var5 / 2) + (int)a.field_d, var4, var3);
                ra.e(var5 / 2 + (638 - (int)a.field_d), var2 - var5, 2, 16777215, var3);
                var5++;
                continue L7;
              }
            }
          }
          L13: {
            L14: {
              if ((ml.field_ab ^ -1) == -3) {
                break L14;
              } else {
                if (-3 != (wk.field_u ^ -1)) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              var2 -= 20;
              var3 = 128;
              var4 = 256;
              if (-3 == (ml.field_ab ^ -1)) {
                break L15;
              } else {
                var3 = wd.field_i / 2;
                var4 = wd.field_i;
                break L15;
              }
            }
            L16: {
              if ((wk.field_u ^ -1) != -3) {
                var4 = 256 + -wd.field_i;
                var3 = (256 + -wd.field_i) / 2;
                break L16;
              } else {
                break L16;
              }
            }
            var5 = 0;
            L17: while (true) {
              if (var5 >= 4) {
                L18: {
                  var5 = 4210752;
                  if (dd.field_a != 5) {
                    break L18;
                  } else {
                    var5 = 128;
                    break L18;
                  }
                }
                var6 = 104 + (638 - ((int)a.field_d - 10));
                var7 = 0;
                L19: while (true) {
                  if (-19 >= (var7 ^ -1)) {
                    L20: {
                      if (256 == var4) {
                        l.field_c[4].c(10 + var6, -13 + var2);
                        break L20;
                      } else {
                        l.field_c[4].a(10 + var6, -13 + var2, var4);
                        break L20;
                      }
                    }
                    var7 = -2;
                    L21: while (true) {
                      if (-1 >= (var7 ^ -1)) {
                        break L13;
                      } else {
                        ra.e((-1 + var7) / 2 + (638 - (int)a.field_d + 20), var2 + -20 - var7, 130, 16777215, var3);
                        var7++;
                        continue L21;
                      }
                    }
                  } else {
                    ra.e(var6 + (2 - -(var7 / 2)), -var7 + var2, 30, var5, var3);
                    ra.e(var6 + var7 / 2, -var7 + var2, 2, 16777215, var3);
                    var7++;
                    continue L19;
                  }
                }
              } else {
                L22: {
                  var6 = 4210752;
                  if (dd.field_a == 1 + var5) {
                    var6 = 128;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                var7 = 638 + (-(int)a.field_d - (-(26 * var5) + -10));
                var8 = 0;
                L23: while (true) {
                  if (-19 >= (var8 ^ -1)) {
                    L24: {
                      if (-257 != (var4 ^ -1)) {
                        l.field_c[var5].a(12 + var7, -13 + var2, var4);
                        break L24;
                      } else {
                        l.field_c[var5].c(12 + var7, var2 - 13);
                        break L24;
                      }
                    }
                    var5++;
                    continue L17;
                  } else {
                    ra.e(var8 / 2 + (var7 + 2), var2 - var8, 24, var6, var3);
                    ra.e(var8 / 2 + var7, -var8 + var2, 2, 16777215, var3);
                    var8++;
                    continue L23;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_Ob = new long[11];
        field_Ub = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_Ob[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
                field_Mb = "Please log in to access this feature.";
                field_Nb = "There are no valid types of game that match your preferences.";
                return;
              } else {
                var1 = 8 * var0 - 8;
                field_Ob[var0] = mb.a(mb.a(pd.a(65280L, field_Ub[6][6 + var1]), mb.a(pd.a(16711680L, field_Ub[5][var1 - -5]), mb.a(mb.a(pd.a(field_Ub[3][3 + var1], 1095216660480L), mb.a(mb.a(pd.a(field_Ub[1][1 + var1], 71776119061217280L), pd.a(-72057594037927936L, field_Ub[0][var1])), pd.a(280375465082880L, field_Ub[2][2 + var1]))), pd.a(field_Ub[4][var1 - -4], 4278190080L)))), pd.a(field_Ub[7][var1 - -7], 255L));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (1 & var0)) {
                stackOut_4_0 = (long)(var1 >>> -1709309208);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1154191105;
              if (-257L >= (var4 ^ -1L)) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -178620799;
              if (-257L < (var6 ^ -1L)) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << -1059097151;
              if ((var10 ^ -1L) > -257L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_Ub[0][var0] = tm.a(tm.a(var4 << -292053560, tm.a(tm.a(var10 << -965607976, tm.a(var2 << -690831648, tm.a(var6 << 1670533544, tm.a(var2 << -1826408840, var2 << -905391824)))), var8 << -1176603952)), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_Ub[var14][var0] = tm.a(field_Ub[-1 + var14][var0] << -876618888, field_Ub[var14 + -1][var0] >>> -238669560);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
