/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends oj {
    static String field_A;
    private boolean field_C;
    ik field_B;
    private int field_z;
    static je field_D;
    int field_y;
    static ea field_E;

    final String a(byte param0, boolean param1) {
        int var3 = 3 % ((53 - param0) / 51);
        String var4 = "Trinketused! " + ((pj) this).field_B.field_c;
        if (param1) {
            System.out.println(var4);
        }
        return var4;
    }

    final void a(ha param0, int param1) {
        if (param1 != -26661) {
            field_A = null;
        }
        if (!(!((pj) this).field_C)) {
            return;
        }
        ((pj) this).field_C = true;
        ((pj) this).field_B.a(((pj) this).field_z, param0, 26123);
        param0.a((byte) -49, ((pj) this).field_B, ((pj) this).field_y, ((pj) this).field_z);
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        nr var9 = null;
        int var10 = 0;
        String stackIn_10_0 = null;
        String stackIn_11_0 = null;
        String stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        nr stackIn_16_0 = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        nr stackOut_15_0 = null;
        nr stackOut_14_0 = null;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          var1 = bm.field_h - co.field_f;
          co.field_f = bt.field_g + -(var1 >> -1548457439);
          bm.field_h = var1 + co.field_f;
          if (param0 == 15) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        rk.field_r = -(ms.field_r >> 593277313) + lm.field_g;
        var2 = rk.field_r;
        var3 = 0;
        L1: while (true) {
          if (nb.field_h.length <= var3) {
            return;
          } else {
            L2: {
              var4 = cj.field_k[var3];
              if ((var4 ^ -1) <= -1) {
                if (var4 == nn.field_z.field_h) {
                  var5 = jv.field_c;
                  break L2;
                } else {
                  var5 = ui.field_g;
                  break L2;
                }
              } else {
                var5 = mn.field_n;
                break L2;
              }
            }
            L3: {
              var6 = nb.field_h[var3];
              stackOut_9_0 = (String) var6;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (0 > var4) {
                stackOut_11_0 = (String) (Object) stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L3;
              } else {
                stackOut_10_0 = (String) (Object) stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L3;
              }
            }
            L4: {
              var7 = lp.a((String) (Object) stackIn_12_0, stackIn_12_1 != 0, false);
              var8 = bt.field_g - (var7 >> 1537923681);
              if (0 > var4) {
                break L4;
              } else {
                L5: {
                  var2 = var2 + ar.field_w;
                  if (nn.field_z.field_h != var4) {
                    stackOut_15_0 = ov.field_m;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  } else {
                    stackOut_14_0 = ed.field_d;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = (nr) (Object) stackIn_16_0;
                  if (var9 != null) {
                    var9.a((byte) -111, (rd.field_b << 264941409) + jg.field_k, var8 + -df.field_E, (df.field_E << -901947103) + var7, var2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var2 = var2 + rd.field_b;
                break L4;
              }
            }
            if (0 <= var4) {
              uk.field_s.b(var6, var8, ia.field_g + var2, var5, -1);
              var2 = var2 + (jg.field_k + ar.field_w + rd.field_b);
              var3++;
              continue L1;
            } else {
              ej.field_G.b(var6, var8, var2 - -lw.field_mb, var5, -1);
              var2 = var2 + cn.field_o;
              var3++;
              continue L1;
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        li var4 = (li) (Object) s.field_e.e((byte) 108);
        while (var4 != null) {
            hp.a(var4, param0, 25522);
            var4 = (li) (Object) s.field_e.a((byte) 123);
        }
        if (param1 != -32666) {
            field_D = null;
        }
        tc var2 = oe.field_Bb.e((byte) 105);
        while (var2 != null) {
            tq.a(param0, 0);
            var2 = oe.field_Bb.a((byte) 123);
        }
    }

    final static String g(int param0) {
        if (!((f.field_E ^ -1) <= -3)) {
            return eo.field_c;
        }
        if (!(null == nf.field_Nb)) {
            if (!(nf.field_Nb.a((byte) 82))) {
                return db.field_b;
            }
            return of.field_Jb;
        }
        if (!(ps.field_u.a((byte) 82))) {
            return ca.field_i;
        }
        if (param0 != -15862) {
            return null;
        }
        if (!ps.field_u.a(28979, "commonui")) {
            return ha.field_nb + " - " + ps.field_u.a("commonui", (byte) -34) + "%";
        }
        if (!sk.field_M.a((byte) 82)) {
            return is.field_f;
        }
        if (!(sk.field_M.a(28979, "commonui"))) {
            return rf.field_a + " - " + sk.field_M.a("commonui", (byte) 122) + "%";
        }
        if (!h.field_g.a((byte) 82)) {
            return cr.field_eb;
        }
        if (!(h.field_g.d(param0 ^ 20707))) {
            return en.field_G + " - " + h.field_g.a(0) + "%";
        }
        return fm.field_c;
    }

    public static void a(boolean param0) {
        field_E = null;
        field_A = null;
        if (!param0) {
            pj.b(-127, -31);
        }
        field_D = null;
    }

    final static int a(int param0, ne[] param1, boolean param2, int param3, int param4, int param5, int param6, jd param7, int param8, boolean param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        jd var23 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var22 = ArmiesOfGielinor.field_M ? 1 : 0;
          var23 = param1[param3].field_c;
          if (!param2) {
            break L0;
          } else {
            if (var23 == null) {
              break L0;
            } else {
              L1: {
                if (!param9) {
                  break L1;
                } else {
                  if (var23.field_s) {
                    break L1;
                  } else {
                    if (param4 != var23.field_O) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              return 1000000;
            }
          }
        }
        L2: {
          var12 = param7.g(0);
          var13 = param1[param8].field_h;
          var14 = param1[param3].field_h;
          var15 = 0;
          var16 = 0;
          if (bw.field_m[param7.field_N][1] != 2) {
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L2;
          } else {
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L2;
          }
        }
        L3: {
          var17 = stackIn_10_0;
          var18 = param7.r((byte) 55) ? 1 : 0;
          var19 = param7.o((byte) 98) ? 1 : 0;
          if (-5 != (var12 ^ -1)) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        var20 = stackIn_13_0;
        var15 = gm.field_h[var12][var13];
        if (param10) {
          L4: {
            L5: {
              if (var17 == 0) {
                break L5;
              } else {
                if (var13 != 3) {
                  break L5;
                } else {
                  var15 = 3;
                  break L4;
                }
              }
            }
            L6: {
              if ((var13 ^ -1) == -5) {
                break L6;
              } else {
                if ((var13 ^ -1) != -7) {
                  if (var13 != -6) {
                    break L4;
                  } else {
                    L7: {
                      if (var18 != 0) {
                        break L7;
                      } else {
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var15 = 3;
                    break L4;
                  }
                } else {
                  break L6;
                }
              }
            }
            if (var19 != 0) {
              var15 = 1;
              break L4;
            } else {
              if (var18 == 0) {
                break L4;
              } else {
                var15 = 3;
                break L4;
              }
            }
          }
          L8: {
            if (-1 <= var15) {
              break L8;
            } else {
              var15 = 6;
              break L8;
            }
          }
          L9: {
            L10: {
              var16 = gm.field_h[var12][var14];
              if (var17 == 0) {
                break L10;
              } else {
                if (-4 != var14) {
                  break L10;
                } else {
                  var16 = 3;
                  break L9;
                }
              }
            }
            L11: {
              if (-5 == var14) {
                break L11;
              } else {
                if (6 != var14) {
                  if (-6 == (var14 ^ -1)) {
                    L12: {
                      if (var18 != 0) {
                        break L12;
                      } else {
                        if (var19 == 0) {
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var16 = 3;
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  break L11;
                }
              }
            }
            if (var19 != 0) {
              var16 = 1;
              break L9;
            } else {
              if (var18 == 0) {
                break L9;
              } else {
                var16 = 3;
                break L9;
              }
            }
          }
          L13: {
            if (var16 >= 0) {
              break L13;
            } else {
              var16 = 1000000;
              break L13;
            }
          }
          L14: {
            var21 = param1[param8 % param0 - -(param8 / param5 * param0)].a((byte) 97, param4, param6);
            if (var20 != 0) {
              break L14;
            } else {
              if (-1 == (1 & var21)) {
                break L14;
              } else {
                if (-5 == var13) {
                  break L14;
                } else {
                  if (6 == var13) {
                    break L14;
                  } else {
                    if ((var13 ^ -1) == -3) {
                      break L14;
                    } else {
                      if (12 == var13) {
                        break L14;
                      } else {
                        if (15 != var13) {
                          var15 = 9;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L15: {
            var21 = param1[param3 % param0 + param0 * (param3 / param5)].a((byte) 97, param4, param6);
            if (var20 != 0) {
              break L15;
            } else {
              if ((1 & var21) == 0) {
                break L15;
              } else {
                if ((var14 ^ -1) == -5) {
                  break L15;
                } else {
                  if ((var14 ^ -1) == -7) {
                    break L15;
                  } else {
                    if ((var14 ^ -1) == -3) {
                      break L15;
                    } else {
                      if ((var14 ^ -1) == -13) {
                        break L15;
                      } else {
                        if (var14 != -16) {
                          var16 = 9;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L16: {
            if (2 != var14) {
              break L16;
            } else {
              if (-63 != param7.field_N) {
                break L16;
              } else {
                var16 = 3 * bw.field_m[62][3];
                break L16;
              }
            }
          }
          if (var16 >= var15) {
            return var16;
          } else {
            return var15;
          }
        } else {
          return 20;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          hs.b(-103, ((pj) this).field_B.field_c);
          to.a(3, (byte) -121, 38);
          param2.g(27, ((pj) this).field_B.field_c, -91);
          var4 = 0;
          if (param1 < -84) {
            break L0;
          } else {
            pj.b(30, -93);
            break L0;
          }
        }
        L1: {
          var4 = var4 != 0 | ((pj) this).a((byte) -39, param2, param0, false) ? 1 : 0;
          if (uc.field_d[((pj) this).field_B.field_c][3] == 4) {
            break L1;
          } else {
            if ((uc.field_d[((pj) this).field_B.field_c][4] ^ -1) == -6) {
              break L1;
            } else {
              var5 = ((wa) (Object) ((pj) this).field_B).field_g;
              var6 = ((wa) (Object) ((pj) this).field_B).field_f;
              if (6 != uc.field_d[((pj) this).field_B.field_c][3]) {
                var7 = uc.field_d[((pj) this).field_B.field_c][7];
                var8 = -var7 + var5;
                L2: while (true) {
                  if (var8 > var7 + var5) {
                    break L1;
                  } else {
                    if ((var8 ^ -1) <= -1) {
                      if (var8 < param2.field_xb.field_v) {
                        var9 = -var7 + var6;
                        L3: while (true) {
                          if (var9 <= var7 + var6) {
                            if (0 <= var9) {
                              if (param2.field_xb.field_v > var9) {
                                var4 = var4 != 0 | ((pj) this).a(var9, 15, param2, param0, var8) ? 1 : 0;
                                var9++;
                                continue L3;
                              } else {
                                var9++;
                                continue L3;
                              }
                            } else {
                              var9++;
                              continue L3;
                            }
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              } else {
                L4: {
                  var7 = param2.field_xb.a(var6, 2056, var5);
                  var8 = param2.field_xb.g(var6, -90, var5);
                  var9 = var5;
                  var10 = var6;
                  var11 = 0;
                  var12 = 0;
                  var13 = var7;
                  if (var13 != -2) {
                    if (var13 != 2) {
                      if (var13 == 3) {
                        var11 = -1;
                        var12 = 0;
                        break L4;
                      } else {
                        if (-1 != var13) {
                          return false;
                        } else {
                          var12 = 0;
                          var11 = 1;
                          break L4;
                        }
                      }
                    } else {
                      var12 = 1;
                      var11 = 0;
                      break L4;
                    }
                  } else {
                    var11 = 0;
                    var12 = -1;
                    break L4;
                  }
                }
                L5: while (true) {
                  if (var8 != param2.field_xb.g(var10, -94, var9)) {
                    var4 = var4 != 0 | ((pj) this).a(var6 + -var12, 15, param2, param0, -var11 + var5) ? 1 : 0;
                    var4 = var4 != 0 | ((pj) this).a(var10, 15, param2, param0, var9) ? 1 : 0;
                    break L1;
                  } else {
                    var4 = var4 != 0 | ((pj) this).a(var10, 15, param2, param0, var9) ? 1 : 0;
                    var9 = var9 + var11;
                    var10 = var10 + var12;
                    continue L5;
                  }
                }
              }
            }
          }
        }
        ul.a((byte) -80, fo.a(4800, jr.field_e, new String[2]), param2.field_Nb);
        return var4 != 0;
    }

    pj(ik param0, int param1, int param2) {
        ((pj) this).field_z = param2;
        ((pj) this).field_y = param1;
        ((pj) this).field_B = param0;
        ((pj) this).field_m = 24;
    }

    final static String a(int param0, CharSequence[] param1) {
        if (param0 != 593277313) {
            Object var3 = null;
            int discarded$0 = pj.a(73, (ne[]) null, true, -35, 53, 62, 17, (jd) null, 87, false, false);
        }
        return hh.a(param1, 0, param1.length, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "This item can only be used on a cyclops.";
    }
}
