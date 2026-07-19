/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static eb field_b;
    static int[] field_e;
    static String field_d;
    static wm field_c;
    static int field_g;
    private int[] field_f;
    static int field_a;

    public static void a(int param0) {
        field_e = null;
        if (param0 > -92) {
            field_c = (wm) null;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        RuntimeException var3 = null;
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
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String stackIn_77_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        String stackIn_83_2 = null;
        int stackIn_92_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        String stackOut_82_2 = null;
        String[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        String stackOut_81_2 = null;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        String stackOut_76_2 = null;
        String[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        String stackOut_75_2 = null;
        int stackOut_111_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        var9 = Chess.field_G;
        try {
          L0: {
            L1: {
              kb.field_S = true;
              gm.field_f = param2;
              if (-1 != (gm.field_f ^ -1)) {
                if ((gm.field_f ^ -1) != -2) {
                  if (-3 == (gm.field_f ^ -1)) {
                    var3_int = vm.a(oc.a(i.field_a, new String[]{"<br><%0><br>"}, (byte) -110), -9224, vj.field_d, n.field_d, mk.field_a);
                    var4 = -1;
                    var5 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5 >= var3_int) {
                          break L3;
                        } else {
                          if (!"<%0>".equals(n.field_d[var5])) {
                            var5++;
                            continue L2;
                          } else {
                            var4 = var5;
                            break L3;
                          }
                        }
                      }
                      if (0 == (var4 ^ -1)) {
                        throw new IllegalStateException();
                      } else {
                        ik.field_a = new String[var4];
                        ne.a(n.field_d, 0, ik.field_a, 0, var4);
                        tj.field_p = new String[-var4 + (var3_int - 1)];
                        ne.a(n.field_d, 1 + var4, tj.field_p, 0, var3_int + -var4 + -1);
                        var4 = -1;
                        var3_int = vm.a(oc.a(tb.field_e, new String[]{"<br><%0><br>"}, (byte) -105), -9224, vj.field_d, n.field_d, mk.field_a);
                        var5 = 0;
                        L4: while (true) {
                          L5: {
                            if (var5 >= var3_int) {
                              break L5;
                            } else {
                              if ("<%0>".equals(n.field_d[var5])) {
                                var4 = var5;
                                break L5;
                              } else {
                                var5++;
                                continue L4;
                              }
                            }
                          }
                          if (0 == (var4 ^ -1)) {
                            throw new IllegalStateException();
                          } else {
                            L6: {
                              hj.field_l = new String[var4];
                              ne.a(n.field_d, 0, hj.field_l, 0, var4);
                              em.field_m = new String[-1 + -var4 + var3_int];
                              ne.a(n.field_d, 1 + var4, em.field_m, 0, -1 + (-var4 + var3_int));
                              if (hj.field_l.length > ik.field_a.length) {
                                stackOut_65_0 = hj.field_l.length;
                                stackIn_66_0 = stackOut_65_0;
                                break L6;
                              } else {
                                stackOut_64_0 = ik.field_a.length;
                                stackIn_66_0 = stackOut_64_0;
                                break L6;
                              }
                            }
                            L7: {
                              var5 = stackIn_66_0;
                              if (em.field_m.length > tj.field_p.length) {
                                stackOut_68_0 = em.field_m.length;
                                stackIn_69_0 = stackOut_68_0;
                                break L7;
                              } else {
                                stackOut_67_0 = tj.field_p.length;
                                stackIn_69_0 = stackOut_67_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_69_0;
                            var7 = var5 + 7 + var6;
                            ka.field_g = new String[var7];
                            cb.field_k = new int[var7];
                            var8 = 0;
                            L8: while (true) {
                              if (var7 <= var8) {
                                ka.field_g[1] = rf.field_a;
                                fi.field_c = new int[2];
                                ka.field_g[0] = sj.field_a;
                                cb.field_k[1] = 0;
                                cb.field_k[3] = 1;
                                ka.field_g[2] = rd.field_b;
                                ka.field_g[4] = bb.field_a;
                                fi.field_c[1] = 2;
                                ka.field_g[3] = ag.field_b;
                                fi.field_c[0] = 5;
                                ka.field_g[5] = "";
                                var8 = 0;
                                L9: while (true) {
                                  if (var5 <= var8) {
                                    ka.field_g[var5 + 6] = null;
                                    cb.field_k[6 + var5] = -2;
                                    var8 = 0;
                                    L10: while (true) {
                                      if (var8 >= var6) {
                                        jg.field_M = ud.a(2);
                                        break L1;
                                      } else {
                                        L11: {
                                          stackOut_80_0 = ka.field_g;
                                          stackOut_80_1 = var8 + 7 + var5;
                                          stackIn_82_0 = stackOut_80_0;
                                          stackIn_82_1 = stackOut_80_1;
                                          stackIn_81_0 = stackOut_80_0;
                                          stackIn_81_1 = stackOut_80_1;
                                          if (em.field_m.length <= var8) {
                                            stackOut_82_0 = (String[]) ((Object) stackIn_82_0);
                                            stackOut_82_1 = stackIn_82_1;
                                            stackOut_82_2 = "";
                                            stackIn_83_0 = stackOut_82_0;
                                            stackIn_83_1 = stackOut_82_1;
                                            stackIn_83_2 = stackOut_82_2;
                                            break L11;
                                          } else {
                                            stackOut_81_0 = (String[]) ((Object) stackIn_81_0);
                                            stackOut_81_1 = stackIn_81_1;
                                            stackOut_81_2 = em.field_m[var8];
                                            stackIn_83_0 = stackOut_81_0;
                                            stackIn_83_1 = stackOut_81_1;
                                            stackIn_83_2 = stackOut_81_2;
                                            break L11;
                                          }
                                        }
                                        stackIn_83_0[stackIn_83_1] = stackIn_83_2;
                                        var8++;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    L12: {
                                      stackOut_74_0 = ka.field_g;
                                      stackOut_74_1 = var8 + 6;
                                      stackIn_76_0 = stackOut_74_0;
                                      stackIn_76_1 = stackOut_74_1;
                                      stackIn_75_0 = stackOut_74_0;
                                      stackIn_75_1 = stackOut_74_1;
                                      if (0 > -var5 + hj.field_l.length + var8) {
                                        stackOut_76_0 = (String[]) ((Object) stackIn_76_0);
                                        stackOut_76_1 = stackIn_76_1;
                                        stackOut_76_2 = "";
                                        stackIn_77_0 = stackOut_76_0;
                                        stackIn_77_1 = stackOut_76_1;
                                        stackIn_77_2 = stackOut_76_2;
                                        break L12;
                                      } else {
                                        stackOut_75_0 = (String[]) ((Object) stackIn_75_0);
                                        stackOut_75_1 = stackIn_75_1;
                                        stackOut_75_2 = hj.field_l[-var5 + (hj.field_l.length + var8)];
                                        stackIn_77_0 = stackOut_75_0;
                                        stackIn_77_1 = stackOut_75_1;
                                        stackIn_77_2 = stackOut_75_2;
                                        break L12;
                                      }
                                    }
                                    stackIn_77_0[stackIn_77_1] = stackIn_77_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                cb.field_k[var8] = -1;
                                var8++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (3 != gm.field_f) {
                      if ((gm.field_f ^ -1) != -5) {
                        if ((gm.field_f ^ -1) != -6) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = vm.a(vd.field_Gb, -9224, vj.field_d, n.field_d, mk.field_a);
                          var4 = 3 + var3_int;
                          cb.field_k = new int[var4];
                          ka.field_g = new String[var4];
                          var5 = 0;
                          L13: while (true) {
                            if (var4 <= var5) {
                              fi.field_c = new int[2];
                              var5 = 0;
                              L14: while (true) {
                                if (var5 >= var3_int) {
                                  ka.field_g[var4 + -3] = "";
                                  ka.field_g[-2 + var4] = lk.field_d;
                                  cb.field_k[var4 + -2] = 0;
                                  fi.field_c[0] = 3;
                                  ka.field_g[-1 + var4] = sj.field_m;
                                  cb.field_k[var4 - 1] = 1;
                                  fi.field_c[1] = 5;
                                  break L1;
                                } else {
                                  ka.field_g[var5] = n.field_d[var5];
                                  var5++;
                                  continue L14;
                                }
                              }
                            } else {
                              cb.field_k[var5] = -1;
                              var5++;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        var3_int = vm.a(le.field_c, -9224, vj.field_d, n.field_d, mk.field_a);
                        var4 = var3_int + 2;
                        cb.field_k = new int[var4];
                        ka.field_g = new String[var4];
                        var5 = 0;
                        L15: while (true) {
                          if (var5 >= var4) {
                            fi.field_c = new int[1];
                            var5 = 0;
                            L16: while (true) {
                              if (var5 >= var3_int) {
                                ka.field_g[var4 + -2] = "";
                                ka.field_g[-1 + var4] = sj.field_m;
                                cb.field_k[var4 - 1] = 0;
                                fi.field_c[0] = 5;
                                break L1;
                              } else {
                                ka.field_g[var5] = n.field_d[var5];
                                var5++;
                                continue L16;
                              }
                            }
                          } else {
                            cb.field_k[var5] = -1;
                            var5++;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        if (oc.field_l.field_k) {
                          var3_int = vm.a(hl.field_a, -9224, vj.field_d, n.field_d, mk.field_a);
                          break L17;
                        } else {
                          var3_int = vm.a(Chess.field_D, -9224, vj.field_d, n.field_d, mk.field_a);
                          break L17;
                        }
                      }
                      var4 = 2 - -var3_int;
                      cb.field_k = new int[var4];
                      ka.field_g = new String[var4];
                      var5 = 0;
                      L18: while (true) {
                        if (var4 <= var5) {
                          fi.field_c = new int[1];
                          var5 = 0;
                          L19: while (true) {
                            if (var5 >= var3_int) {
                              ka.field_g[var4 + -2] = "";
                              ka.field_g[-1 + var4] = sj.field_m;
                              cb.field_k[-1 + var4] = 0;
                              fi.field_c[0] = 5;
                              break L1;
                            } else {
                              ka.field_g[var5] = n.field_d[var5];
                              var5++;
                              continue L19;
                            }
                          }
                        } else {
                          cb.field_k[var5] = -1;
                          var5++;
                          continue L18;
                        }
                      }
                    }
                  }
                } else {
                  var3_int = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
                  var4 = var3_int + 2;
                  cb.field_k = new int[var4];
                  ka.field_g = new String[var4];
                  var5 = 0;
                  L20: while (true) {
                    if (var4 <= var5) {
                      fi.field_c = new int[1];
                      var5 = 0;
                      L21: while (true) {
                        if (var5 >= var3_int) {
                          ka.field_g[-2 + var4] = "";
                          ka.field_g[var4 - 1] = sj.field_m;
                          cb.field_k[var4 - 1] = 0;
                          fi.field_c[0] = 5;
                          break L1;
                        } else {
                          ka.field_g[var5] = n.field_d[var5];
                          var5++;
                          continue L21;
                        }
                      }
                    } else {
                      cb.field_k[var5] = -1;
                      var5++;
                      continue L20;
                    }
                  }
                }
              } else {
                var3_int = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
                var4 = 3 - -var3_int;
                cb.field_k = new int[var4];
                ka.field_g = new String[var4];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var4) {
                    fi.field_c = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var3_int <= var5) {
                        ka.field_g[-3 + var4] = "";
                        ka.field_g[-2 + var4] = ph.field_m;
                        cb.field_k[var4 - 2] = 0;
                        fi.field_c[0] = 4;
                        ka.field_g[var4 - 1] = sj.field_m;
                        cb.field_k[var4 + -1] = 1;
                        fi.field_c[1] = 5;
                        break L1;
                      } else {
                        ka.field_g[var5] = n.field_d[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    cb.field_k[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            ol.field_R.field_f = fi.field_c.length;
            if (!param0) {
              var3_int = 0;
              var4 = 0;
              L24: while (true) {
                if (ka.field_g.length <= var4) {
                  L25: {
                    if (2 == gm.field_f) {
                      var10 = ik.field_a;
                      var5 = 0;
                      L26: while (true) {
                        if (var5 >= var10.length) {
                          var11 = tj.field_p;
                          var5 = 0;
                          L27: while (true) {
                            if (var5 >= var11.length) {
                              break L25;
                            } else {
                              L28: {
                                var13 = var11[var5];
                                var7 = kn.a(false, param0, var13);
                                if (var7 > var3_int) {
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
                            var12 = var10[var5];
                            var7 = kn.a(false, false, var12);
                            if (var3_int < var7) {
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
                    } else {
                      break L25;
                    }
                  }
                  ca.field_j = -(var3_int >> -59772959) + (var3_int + ob.field_C);
                  ai.field_j = ob.field_C + -(var3_int >> 1265168993);
                  in.field_i = (kl.field_i - -ek.field_b << 1832534305) * ol.field_R.field_f;
                  var4 = 0;
                  L30: while (true) {
                    if (ka.field_g.length <= var4) {
                      ak.field_j = kd.field_Hb + -(in.field_i >> 839518049);
                      cb.field_h = new int[ka.field_g.length][];
                      var4 = 0;
                      var5 = ak.field_j;
                      L31: while (true) {
                        if (var4 >= ka.field_g.length) {
                          L32: {
                            if (-3 == (gm.field_f ^ -1)) {
                              ol.field_R.a(-1, -1, param1, 0);
                              break L32;
                            } else {
                              ol.field_R.a(0, fe.a(hn.field_k, 1, rf.field_b), param1, 0);
                              break L32;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L33: {
                            var6 = cb.field_k[var4];
                            if (-1 >= (var6 ^ -1)) {
                              var7 = kn.a(true, param0, ka.field_g[var4]);
                              var5 = var5 + ek.field_b;
                              var8 = ob.field_C + -(var7 >> 789507585);
                              cb.field_h[var4] = new int[4];
                              cb.field_h[var4][0] = -m.field_d + var8;
                              cb.field_h[var4][1] = var5;
                              cb.field_h[var4][2] = (m.field_d << 1630349665) + var7;
                              var5 = var5 + ((kl.field_i << 1608816481) - (-ek.field_b + -vh.field_c));
                              cb.field_h[var4][3] = vh.field_c - -(kl.field_i << -1250452511);
                              break L33;
                            } else {
                              var5 = var5 + fd.field_n;
                              break L33;
                            }
                          }
                          var4++;
                          continue L31;
                        }
                      }
                    } else {
                      L34: {
                        stackOut_111_0 = in.field_i;
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_112_0 = stackOut_111_0;
                        if (-1 < (cb.field_k[var4] ^ -1)) {
                          stackOut_113_0 = stackIn_113_0;
                          stackOut_113_1 = fd.field_n;
                          stackIn_114_0 = stackOut_113_0;
                          stackIn_114_1 = stackOut_113_1;
                          break L34;
                        } else {
                          stackOut_112_0 = stackIn_112_0;
                          stackOut_112_1 = vh.field_c;
                          stackIn_114_0 = stackOut_112_0;
                          stackIn_114_1 = stackOut_112_1;
                          break L34;
                        }
                      }
                      in.field_i = stackIn_114_0 + stackIn_114_1;
                      var4++;
                      continue L30;
                    }
                  }
                } else {
                  L35: {
                    if (-1 < (cb.field_k[var4] ^ -1)) {
                      stackOut_91_0 = 0;
                      stackIn_92_0 = stackOut_91_0;
                      break L35;
                    } else {
                      stackOut_90_0 = 1;
                      stackIn_92_0 = stackOut_90_0;
                      break L35;
                    }
                  }
                  var5 = kn.a(stackIn_92_0 != 0, false, ka.field_g[var4]);
                  if (var5 > var3_int) {
                    var3_int = var5;
                    var4++;
                    continue L24;
                  } else {
                    var4++;
                    continue L24;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "qh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = (this.field_f.length >> 1772092705) + -1;
          if (param1 == 17) {
            break L0;
          } else {
            qh.a(true, false, 96);
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = this.field_f[var4 + (var4 - -1)];
          if ((var5 ^ -1) == 0) {
            return -1;
          } else {
            if (this.field_f[var4 - -var4] == param0) {
              return var5;
            } else {
              var4 = var3 & var4 + 1;
              continue L1;
            }
          }
        }
    }

    qh(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1003391457) + param0.length < var2_int) {
                this.field_f = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int - -var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = var2_int + -1 & param0[var3];
                        L4: while (true) {
                          if ((this.field_f[var4 + var4 + 1] ^ -1) == 0) {
                            this.field_f[var4 + var4] = param0[var3];
                            this.field_f[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_f[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("qh.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_d = "Security";
        field_e = new int[8192];
    }
}
