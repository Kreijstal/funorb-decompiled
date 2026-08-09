/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qna {
    static jea field_b;
    static String field_a;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -2) {
            qna.a(-51);
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              qoa.field_a = true;
              mq.field_a = param2;
              if (-1 == (mq.field_a ^ -1)) {
                var3_int = ama.a(bfa.field_c, jba.field_l, rg.field_z, 1, lra.field_c);
                var4 = 3 + var3_int;
                bla.field_H = new int[var4];
                mba.field_g = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    hb.field_w = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        mba.field_g[-3 + var4] = "";
                        mba.field_g[-2 + var4] = ae.field_k;
                        bla.field_H[-2 + var4] = 0;
                        hb.field_w[0] = 4;
                        mba.field_g[var4 - 1] = kh.field_j;
                        bla.field_H[-1 + var4] = 1;
                        hb.field_w[1] = 5;
                        break L1;
                      } else {
                        mba.field_g[var5] = lra.field_c[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    bla.field_H[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-2 != (mq.field_a ^ -1)) {
                  if (-3 == (mq.field_a ^ -1)) {
                    var3_int = ama.a(bfa.field_c, gl.a((byte) 96, rr.field_G, new String[]{"<br><%0><br>"}), rg.field_z, 1, lra.field_c);
                    var4 = -1;
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if ("<%0>".equals(lra.field_c[var5])) {
                            var4 = var5;
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      if (var4 != -1) {
                        cia.field_a = new String[var4];
                        lua.a(lra.field_c, 0, cia.field_a, 0, var4);
                        wr.field_o = new String[-var4 + var3_int - 1];
                        lua.a(lra.field_c, var4 - -1, wr.field_o, 0, -1 + (-var4 + var3_int));
                        var4 = -1;
                        var3_int = ama.a(bfa.field_c, gl.a((byte) 89, lqa.field_g, new String[]{"<br><%0><br>"}), rg.field_z, 1, lra.field_c);
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (var5 >= var3_int) {
                              break L7;
                            } else {
                              if (!"<%0>".equals(lra.field_c[var5])) {
                                var5++;
                                continue L6;
                              } else {
                                var4 = var5;
                                break L7;
                              }
                            }
                          }
                          if ((var4 ^ -1) == 0) {
                            throw new IllegalStateException();
                          } else {
                            L8: {
                              pm.field_d = new String[var4];
                              lua.a(lra.field_c, 0, pm.field_d, 0, var4);
                              ea.field_k = new String[-1 + var3_int - var4];
                              lua.a(lra.field_c, 1 + var4, ea.field_k, 0, var3_int + -var4 + -1);
                              if (pm.field_d.length <= cia.field_a.length) {
                                stackIn_58_0 = cia.field_a.length;
                                break L8;
                              } else {
                                stackIn_58_0 = pm.field_d.length;
                                break L8;
                              }
                            }
                            L9: {
                              var5 = stackIn_58_0;
                              if (ea.field_k.length > wr.field_o.length) {
                                stackIn_61_0 = ea.field_k.length;
                                break L9;
                              } else {
                                stackIn_61_0 = wr.field_o.length;
                                break L9;
                              }
                            }
                            var6 = stackIn_61_0;
                            var7 = 7 - -var5 + var6;
                            bla.field_H = new int[var7];
                            mba.field_g = new String[var7];
                            var8 = 0;
                            L10: while (true) {
                              if (var7 <= var8) {
                                bla.field_H[1] = 0;
                                mba.field_g[1] = vc.field_s;
                                mba.field_g[0] = bha.field_B;
                                hb.field_w = new int[2];
                                mba.field_g[3] = mha.field_F;
                                mba.field_g[4] = kka.field_p;
                                bla.field_H[3] = 1;
                                hb.field_w[1] = 2;
                                mba.field_g[5] = "";
                                mba.field_g[2] = cq.field_c;
                                hb.field_w[0] = 5;
                                var8 = 0;
                                L11: while (true) {
                                  if (var8 >= var5) {
                                    mba.field_g[6 + var5] = null;
                                    bla.field_H[6 - -var5] = -2;
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var8 >= var6) {
                                        ln.field_H = bva.b((byte) -107);
                                        break L1;
                                      } else {
                                        L13: {
                                          stackIn_74_0 = mba.field_g;

                                          stackIn_74_1 = var8 + 7 + var5;

                                          if (ea.field_k.length <= var8) {
                                            stackIn_75_0 = (String[]) ((Object) stackIn_74_0);
                                            stackIn_75_1 = stackIn_74_1;
                                            stackIn_75_2 = "";
                                            break L13;
                                          } else {
                                            stackIn_75_0 = (String[]) ((Object) stackIn_74_0);
                                            stackIn_75_1 = stackIn_74_1;
                                            stackIn_75_2 = ea.field_k[var8];
                                            break L13;
                                          }
                                        }
                                        stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      stackIn_68_0 = mba.field_g;

                                      stackIn_68_1 = var8 + 6;

                                      if (-var5 + (var8 + pm.field_d.length) >= 0) {
                                        stackIn_69_0 = (String[]) ((Object) stackIn_68_0);
                                        stackIn_69_1 = stackIn_68_1;
                                        stackIn_69_2 = pm.field_d[pm.field_d.length + var8 - var5];
                                        break L14;
                                      } else {
                                        stackIn_69_0 = (String[]) ((Object) stackIn_68_0);
                                        stackIn_69_1 = stackIn_68_1;
                                        stackIn_69_2 = "";
                                        break L14;
                                      }
                                    }
                                    stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                bla.field_H[var8] = -1;
                                var8++;
                                continue L10;
                              }
                            }
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    if ((mq.field_a ^ -1) == -4) {
                      L15: {
                        if (dsa.field_c.field_c) {
                          var3_int = ama.a(bfa.field_c, gd.field_G, rg.field_z, 1, lra.field_c);
                          break L15;
                        } else {
                          var3_int = ama.a(bfa.field_c, jma.field_o, rg.field_z, 1, lra.field_c);
                          break L15;
                        }
                      }
                      var4 = 2 + var3_int;
                      bla.field_H = new int[var4];
                      mba.field_g = new String[var4];
                      var5 = 0;
                      L16: while (true) {
                        if (var4 <= var5) {
                          hb.field_w = new int[1];
                          var5 = 0;
                          L17: while (true) {
                            if (var5 >= var3_int) {
                              mba.field_g[var4 + -2] = "";
                              mba.field_g[var4 - 1] = kh.field_j;
                              bla.field_H[-1 + var4] = 0;
                              hb.field_w[0] = 5;
                              break L1;
                            } else {
                              mba.field_g[var5] = lra.field_c[var5];
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          bla.field_H[var5] = -1;
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      if (4 == mq.field_a) {
                        var3_int = ama.a(bfa.field_c, vca.field_b, rg.field_z, 1, lra.field_c);
                        var4 = var3_int + 2;
                        mba.field_g = new String[var4];
                        bla.field_H = new int[var4];
                        var5 = 0;
                        L18: while (true) {
                          if (var5 >= var4) {
                            hb.field_w = new int[1];
                            var5 = 0;
                            L19: while (true) {
                              if (var5 >= var3_int) {
                                mba.field_g[-2 + var4] = "";
                                mba.field_g[-1 + var4] = kh.field_j;
                                bla.field_H[-1 + var4] = 0;
                                hb.field_w[0] = 5;
                                break L1;
                              } else {
                                mba.field_g[var5] = lra.field_c[var5];
                                var5++;
                                continue L19;
                              }
                            }
                          } else {
                            bla.field_H[var5] = -1;
                            var5++;
                            continue L18;
                          }
                        }
                      } else {
                        if (mq.field_a != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = ama.a(bfa.field_c, th.field_s, rg.field_z, 1, lra.field_c);
                          var4 = var3_int + 3;
                          bla.field_H = new int[var4];
                          mba.field_g = new String[var4];
                          var5 = 0;
                          L20: while (true) {
                            if (var4 <= var5) {
                              hb.field_w = new int[2];
                              var5 = 0;
                              L21: while (true) {
                                if (var3_int <= var5) {
                                  mba.field_g[var4 + -3] = "";
                                  mba.field_g[-2 + var4] = sqa.field_a;
                                  bla.field_H[var4 + -2] = 0;
                                  hb.field_w[0] = 3;
                                  mba.field_g[var4 + -1] = kh.field_j;
                                  bla.field_H[var4 - 1] = 1;
                                  hb.field_w[1] = 5;
                                  break L1;
                                } else {
                                  mba.field_g[var5] = lra.field_c[var5];
                                  var5++;
                                  continue L21;
                                }
                              }
                            } else {
                              bla.field_H[var5] = -1;
                              var5++;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3_int = ama.a(bfa.field_c, jba.field_l, rg.field_z, 1, lra.field_c);
                  var4 = var3_int + 2;
                  bla.field_H = new int[var4];
                  mba.field_g = new String[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var4 <= var5) {
                      hb.field_w = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var3_int <= var5) {
                          mba.field_g[var4 - 2] = "";
                          mba.field_g[-1 + var4] = kh.field_j;
                          bla.field_H[-1 + var4] = 0;
                          hb.field_w[0] = 5;
                          break L1;
                        } else {
                          mba.field_g[var5] = lra.field_c[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      bla.field_H[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            sa.field_r.field_i = hb.field_w.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= mba.field_g.length) {
                L25: {
                  if (-3 != (mq.field_a ^ -1)) {
                    break L25;
                  } else {
                    var10 = cia.field_a;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = wr.field_o;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var4_ref_String__.length) {
                            break L25;
                          } else {
                            L28: {
                              var12 = var4_ref_String__[var5];
                              var7 = ro.a((byte) -116, var12, false);
                              if ((var7 ^ -1) < (var3_int ^ -1)) {
                                var3_int = var7;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            var5++;
                            continue L27;
                          }
                        }
                      } else {
                        L29: {
                          var11 = var10[var5];
                          var7 = ro.a((byte) -116, var11, false);
                          if ((var3_int ^ -1) > (var7 ^ -1)) {
                            var3_int = var7;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  }
                }
                hg.field_f = sa.field_r.field_i * (mha.field_C + pqa.field_p << -1633655871);
                am.field_o = ega.field_c - (var3_int >> -1808073951);
                tia.field_a = var3_int + (ega.field_c - (var3_int >> 1321257985));
                var4 = 0;
                L30: while (true) {
                  if (var4 >= mba.field_g.length) {
                    L31: {
                      jua.field_d = -(hg.field_f >> 2027180769) + gd.field_L;
                      er.field_K = new int[mba.field_g.length][];
                      var4 = 0;
                      if (param0 == 1) {
                        break L31;
                      } else {
                        qna.a(-17, true, 122);
                        break L31;
                      }
                    }
                    var5 = jua.field_d;
                    L32: while (true) {
                      if (var4 >= mba.field_g.length) {
                        L33: {
                          if (2 == mq.field_a) {
                            sa.field_r.a(param1, 29954, -1, -1);
                            break L33;
                          } else {
                            sa.field_r.a(param1, param0 + 29953, 0, wg.a(1541709953, jba.field_j, sta.field_B));
                            break L33;
                          }
                        }
                        break L0;
                      } else {
                        L34: {
                          var6 = bla.field_H[var4];
                          if (0 <= var6) {
                            var7 = ro.a((byte) -116, mba.field_g[var4], true);
                            var5 = var5 + mha.field_C;
                            var8 = ega.field_c - (var7 >> 208947841);
                            er.field_K[var4] = new int[4];
                            er.field_K[var4][0] = -nja.field_L + var8;
                            er.field_K[var4][1] = var5;
                            er.field_K[var4][2] = (nja.field_L << -1369116255) + var7;
                            var5 = var5 + (nt.field_d + ((pqa.field_p << -976943583) - -mha.field_C));
                            er.field_K[var4][3] = nt.field_d - -(pqa.field_p << -617067199);
                            break L34;
                          } else {
                            var5 = var5 + f.field_b;
                            break L34;
                          }
                        }
                        var4++;
                        continue L32;
                      }
                    }
                  } else {
                    L35: {
                      stackIn_110_0 = hg.field_f;

                      if (bla.field_H[var4] >= 0) {
                        stackIn_111_0 = stackIn_110_0;
                        stackIn_111_1 = nt.field_d;
                        break L35;
                      } else {
                        stackIn_111_0 = stackIn_110_0;
                        stackIn_111_1 = f.field_b;
                        break L35;
                      }
                    }
                    hg.field_f = stackIn_111_0 + stackIn_111_1;
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L36: {
                  stackIn_88_0 = -116;

                  stackIn_88_1 = mba.field_g[var4];

                  if ((bla.field_H[var4] ^ -1) > -1) {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = (String) ((Object) stackIn_88_1);
                    stackIn_89_2 = 0;
                    break L36;
                  } else {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = (String) ((Object) stackIn_88_1);
                    stackIn_89_2 = 1;
                    break L36;
                  }
                }
                L37: {
                  var5 = ro.a((byte) stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                var4++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "qna.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Aww! Don't you just want to cuddle them? NO. HEAVENS NO. Avoid skeletons like the plague, or they'll probably give it to you.";
        field_c = "Silver Medal Award";
    }
}
