/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_74_2 = null;
        int stackIn_86_0 = 0;
        String stackIn_86_1 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        String[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String stackOut_72_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_85_0 = 0;
        String stackOut_85_1 = null;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          qoa.field_a = true;
          mq.field_a = param2;
          if (mq.field_a == 0) {
            var3_int = ama.a(bfa.field_c, jba.field_l, rg.field_z, 1, lra.field_c);
            var4 = 3 + var3_int;
            bla.field_H = new int[var4];
            mba.field_g = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (~var5 <= ~var4) {
                hb.field_w = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var3_int <= var5) {
                    mba.field_g[-3 + var4] = "";
                    mba.field_g[-2 + var4] = ae.field_k;
                    bla.field_H[-2 + var4] = 0;
                    hb.field_w[0] = 4;
                    mba.field_g[var4 - 1] = kh.field_j;
                    bla.field_H[-1 + var4] = 1;
                    hb.field_w[1] = 5;
                    break L0;
                  } else {
                    mba.field_g[var5] = lra.field_c[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                bla.field_H[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (mq.field_a != 1) {
              if (mq.field_a == 2) {
                var3_int = ama.a(bfa.field_c, gl.a((byte) 96, rr.field_G, new String[1]), rg.field_z, 1, lra.field_c);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (~var5 <= ~var3_int) {
                      break L4;
                    } else {
                      if ("<%0>".equals((Object) (Object) lra.field_c[var5])) {
                        var4 = var5;
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  if (var4 != -1) {
                    cia.field_a = new String[var4];
                    lua.a((Object[]) (Object) lra.field_c, 0, (Object[]) (Object) cia.field_a, 0, var4);
                    wr.field_o = new String[-var4 + var3_int - 1];
                    lua.a((Object[]) (Object) lra.field_c, var4 - -1, (Object[]) (Object) wr.field_o, 0, -1 + (-var4 + var3_int));
                    var4 = -1;
                    var3_int = ama.a(bfa.field_c, gl.a((byte) 89, lqa.field_g, new String[1]), rg.field_z, 1, lra.field_c);
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3_int) {
                          break L6;
                        } else {
                          if (!"<%0>".equals((Object) (Object) lra.field_c[var5])) {
                            var5++;
                            continue L5;
                          } else {
                            var4 = var5;
                            break L6;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L7: {
                          pm.field_d = new String[var4];
                          lua.a((Object[]) (Object) lra.field_c, 0, (Object[]) (Object) pm.field_d, 0, var4);
                          ea.field_k = new String[-1 + var3_int - var4];
                          lua.a((Object[]) (Object) lra.field_c, 1 + var4, (Object[]) (Object) ea.field_k, 0, var3_int + -var4 + -1);
                          if (~pm.field_d.length >= ~cia.field_a.length) {
                            stackOut_56_0 = cia.field_a.length;
                            stackIn_57_0 = stackOut_56_0;
                            break L7;
                          } else {
                            stackOut_55_0 = pm.field_d.length;
                            stackIn_57_0 = stackOut_55_0;
                            break L7;
                          }
                        }
                        L8: {
                          var5 = stackIn_57_0;
                          if (~ea.field_k.length < ~wr.field_o.length) {
                            stackOut_59_0 = ea.field_k.length;
                            stackIn_60_0 = stackOut_59_0;
                            break L8;
                          } else {
                            stackOut_58_0 = wr.field_o.length;
                            stackIn_60_0 = stackOut_58_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_60_0;
                        var7 = 7 - -var5 + var6;
                        bla.field_H = new int[var7];
                        mba.field_g = new String[var7];
                        var8 = 0;
                        L9: while (true) {
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
                            L10: while (true) {
                              if (~var8 <= ~var5) {
                                mba.field_g[6 + var5] = null;
                                bla.field_H[6 - -var5] = -2;
                                var8 = 0;
                                L11: while (true) {
                                  if (var8 >= var6) {
                                    ln.field_H = bva.b((byte) -107);
                                    break L0;
                                  } else {
                                    L12: {
                                      stackOut_71_0 = mba.field_g;
                                      stackOut_71_1 = var8 + 7 + var5;
                                      stackIn_73_0 = stackOut_71_0;
                                      stackIn_73_1 = stackOut_71_1;
                                      stackIn_72_0 = stackOut_71_0;
                                      stackIn_72_1 = stackOut_71_1;
                                      if (ea.field_k.length <= var8) {
                                        stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                        stackOut_73_1 = stackIn_73_1;
                                        stackOut_73_2 = "";
                                        stackIn_74_0 = stackOut_73_0;
                                        stackIn_74_1 = stackOut_73_1;
                                        stackIn_74_2 = stackOut_73_2;
                                        break L12;
                                      } else {
                                        stackOut_72_0 = (String[]) (Object) stackIn_72_0;
                                        stackOut_72_1 = stackIn_72_1;
                                        stackOut_72_2 = ea.field_k[var8];
                                        stackIn_74_0 = stackOut_72_0;
                                        stackIn_74_1 = stackOut_72_1;
                                        stackIn_74_2 = stackOut_72_2;
                                        break L12;
                                      }
                                    }
                                    stackIn_74_0[stackIn_74_1] = stackIn_74_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  stackOut_65_0 = mba.field_g;
                                  stackOut_65_1 = var8 + 6;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  if (-var5 + (var8 + pm.field_d.length) >= 0) {
                                    stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                    stackOut_67_1 = stackIn_67_1;
                                    stackOut_67_2 = pm.field_d[pm.field_d.length + var8 - var5];
                                    stackIn_68_0 = stackOut_67_0;
                                    stackIn_68_1 = stackOut_67_1;
                                    stackIn_68_2 = stackOut_67_2;
                                    break L13;
                                  } else {
                                    stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                    stackOut_66_1 = stackIn_66_1;
                                    stackOut_66_2 = "";
                                    stackIn_68_0 = stackOut_66_0;
                                    stackIn_68_1 = stackOut_66_1;
                                    stackIn_68_2 = stackOut_66_2;
                                    break L13;
                                  }
                                }
                                stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            bla.field_H[var8] = -1;
                            var8++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              } else {
                if (mq.field_a == 3) {
                  L14: {
                    if (dsa.field_c.field_c) {
                      var3_int = ama.a(bfa.field_c, gd.field_G, rg.field_z, 1, lra.field_c);
                      break L14;
                    } else {
                      var3_int = ama.a(bfa.field_c, jma.field_o, rg.field_z, 1, lra.field_c);
                      break L14;
                    }
                  }
                  var4 = 2 + var3_int;
                  bla.field_H = new int[var4];
                  mba.field_g = new String[var4];
                  var5 = 0;
                  L15: while (true) {
                    if (var4 <= var5) {
                      hb.field_w = new int[1];
                      var5 = 0;
                      L16: while (true) {
                        if (var5 >= var3_int) {
                          mba.field_g[var4 + -2] = "";
                          mba.field_g[var4 - 1] = kh.field_j;
                          bla.field_H[-1 + var4] = 0;
                          hb.field_w[0] = 5;
                          break L0;
                        } else {
                          mba.field_g[var5] = lra.field_c[var5];
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      bla.field_H[var5] = -1;
                      var5++;
                      continue L15;
                    }
                  }
                } else {
                  if (4 == mq.field_a) {
                    var3_int = ama.a(bfa.field_c, vca.field_b, rg.field_z, 1, lra.field_c);
                    var4 = var3_int + 2;
                    mba.field_g = new String[var4];
                    bla.field_H = new int[var4];
                    var5 = 0;
                    L17: while (true) {
                      if (~var5 <= ~var4) {
                        hb.field_w = new int[1];
                        var5 = 0;
                        L18: while (true) {
                          if (~var5 <= ~var3_int) {
                            mba.field_g[-2 + var4] = "";
                            mba.field_g[-1 + var4] = kh.field_j;
                            bla.field_H[-1 + var4] = 0;
                            hb.field_w[0] = 5;
                            break L0;
                          } else {
                            mba.field_g[var5] = lra.field_c[var5];
                            var5++;
                            continue L18;
                          }
                        }
                      } else {
                        bla.field_H[var5] = -1;
                        var5++;
                        continue L17;
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
                      L19: while (true) {
                        if (var4 <= var5) {
                          hb.field_w = new int[2];
                          var5 = 0;
                          L20: while (true) {
                            if (~var3_int >= ~var5) {
                              mba.field_g[var4 + -3] = "";
                              mba.field_g[-2 + var4] = sqa.field_a;
                              bla.field_H[var4 + -2] = 0;
                              hb.field_w[0] = 3;
                              mba.field_g[var4 + -1] = kh.field_j;
                              bla.field_H[var4 - 1] = 1;
                              hb.field_w[1] = 5;
                              break L0;
                            } else {
                              mba.field_g[var5] = lra.field_c[var5];
                              var5++;
                              continue L20;
                            }
                          }
                        } else {
                          bla.field_H[var5] = -1;
                          var5++;
                          continue L19;
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
              L21: while (true) {
                if (var4 <= var5) {
                  hb.field_w = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var3_int <= var5) {
                      mba.field_g[var4 - 2] = "";
                      mba.field_g[-1 + var4] = kh.field_j;
                      bla.field_H[-1 + var4] = 0;
                      hb.field_w[0] = 5;
                      break L0;
                    } else {
                      mba.field_g[var5] = lra.field_c[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  bla.field_H[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        sa.field_r.field_i = hb.field_w.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= mba.field_g.length) {
            L24: {
              if (mq.field_a != 2) {
                break L24;
              } else {
                var10 = cia.field_a;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = wr.field_o;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = ro.a((byte) -116, var13, false);
                          if (~var7 < ~var3_int) {
                            var3_int = var7;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var12 = var10[var5];
                      var7 = ro.a((byte) -116, var12, false);
                      if (~var3_int > ~var7) {
                        var3_int = var7;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              }
            }
            hg.field_f = sa.field_r.field_i * (mha.field_C + pqa.field_p << 1);
            am.field_o = ega.field_c - (var3_int >> 1);
            tia.field_a = var3_int + (ega.field_c - (var3_int >> 1));
            var4 = 0;
            L29: while (true) {
              if (~var4 <= ~mba.field_g.length) {
                L30: {
                  jua.field_d = -(hg.field_f >> 1) + gd.field_L;
                  er.field_K = new int[mba.field_g.length][];
                  var4 = 0;
                  if (param0 == 1) {
                    break L30;
                  } else {
                    qna.a(-17, true, 122);
                    break L30;
                  }
                }
                var5 = jua.field_d;
                L31: while (true) {
                  if (var4 >= mba.field_g.length) {
                    L32: {
                      if (2 == mq.field_a) {
                        sa.field_r.a(param1, 29954, -1, -1);
                        break L32;
                      } else {
                        sa.field_r.a(param1, param0 + 29953, 0, wg.a(1541709953, jba.field_j, sta.field_B));
                        break L32;
                      }
                    }
                    return;
                  } else {
                    L33: {
                      var6 = bla.field_H[var4];
                      if (0 <= var6) {
                        var7 = ro.a((byte) -116, mba.field_g[var4], true);
                        var5 = var5 + mha.field_C;
                        var8 = ega.field_c - (var7 >> 1);
                        er.field_K[var4] = new int[4];
                        er.field_K[var4][0] = -nja.field_L + var8;
                        er.field_K[var4][1] = var5;
                        er.field_K[var4][2] = (nja.field_L << 1) + var7;
                        var5 = var5 + (nt.field_d + ((pqa.field_p << 1) - -mha.field_C));
                        er.field_K[var4][3] = nt.field_d - -(pqa.field_p << 1);
                        break L33;
                      } else {
                        var5 = var5 + f.field_b;
                        break L33;
                      }
                    }
                    var4++;
                    continue L31;
                  }
                }
              } else {
                L34: {
                  stackOut_107_0 = hg.field_f;
                  stackIn_109_0 = stackOut_107_0;
                  stackIn_108_0 = stackOut_107_0;
                  if (bla.field_H[var4] >= 0) {
                    stackOut_109_0 = stackIn_109_0;
                    stackOut_109_1 = nt.field_d;
                    stackIn_110_0 = stackOut_109_0;
                    stackIn_110_1 = stackOut_109_1;
                    break L34;
                  } else {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = f.field_b;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_110_1 = stackOut_108_1;
                    break L34;
                  }
                }
                hg.field_f = stackIn_110_0 + stackIn_110_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L35: {
              stackOut_85_0 = -116;
              stackOut_85_1 = mba.field_g[var4];
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              if (bla.field_H[var4] < 0) {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = (String) (Object) stackIn_87_1;
                stackOut_87_2 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                stackIn_88_2 = stackOut_87_2;
                break L35;
              } else {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = (String) (Object) stackIn_86_1;
                stackOut_86_2 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                stackIn_88_2 = stackOut_86_2;
                break L35;
              }
            }
            L36: {
              var5 = ro.a((byte) stackIn_88_0, stackIn_88_1, stackIn_88_2 != 0);
              if (var3_int < var5) {
                var3_int = var5;
                break L36;
              } else {
                break L36;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Aww! Don't you just want to cuddle them? NO. HEAVENS NO. Avoid skeletons like the plague, or they'll probably give it to you.";
        field_c = "Silver Medal Award";
    }
}
