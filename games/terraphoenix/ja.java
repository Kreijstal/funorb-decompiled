/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends uf {
    int field_o;
    static String field_h;
    static int field_j;
    static int field_n;
    int field_k;
    static boolean field_l;
    static int field_i;
    static pk field_m;

    final static boolean a(boolean param0) {
        boolean discarded$0 = false;
        if (!param0) {
            discarded$0 = ja.a('ﾠ', (byte) 38);
        }
        return qi.field_b;
    }

    final static boolean a(char param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!pd.a(72, param0)) {
                var2_int = -42 % ((param1 - 27) / 40);
                var7 = c.field_a;
                var4 = 0;
                L1: while (true) {
                  if (var7.length <= var4) {
                    var8 = hk.field_a;
                    var9 = 0;
                    var4 = var9;
                    L2: while (true) {
                      if (var8.length <= var9) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var5 = var8[var9];
                        if (param0 == var5) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var9++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var5 = var7[var4];
                    if (var5 == param0) {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ja.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        aa var1 = (aa) ((Object) pb.field_a.b((byte) 105));
        int var2 = 53 % ((5 - param0) / 43);
        if (!(var1 != null)) {
            var1 = new aa();
        }
        var1.a(l.field_b, l.field_i, l.field_f, l.field_k, l.field_d, l.field_c, 83, l.field_j);
        vl.field_i.a(var1, -16611);
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        String stackOut_68_2 = null;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              dg.field_d = true;
              var3_int = -105 % ((72 - param0) / 48);
              pe.field_e = param2;
              if (0 == pe.field_e) {
                var4 = af.a(jm.field_d, da.field_h, -3, kh.field_F, ch.field_c);
                var5 = var4 + 3;
                rb.field_d = new String[var5];
                f.field_a = new int[var5];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= var5) {
                    pj.field_l = new int[2];
                    var6 = 0;
                    L3: while (true) {
                      if (var4 <= var6) {
                        rb.field_d[var5 - 3] = "";
                        rb.field_d[var5 + -2] = ak.field_g;
                        f.field_a[-2 + var5] = 0;
                        pj.field_l[0] = 4;
                        rb.field_d[var5 - 1] = te.field_e;
                        f.field_a[var5 - 1] = 1;
                        pj.field_l[1] = 5;
                        break L1;
                      } else {
                        rb.field_d[var6] = kh.field_F[var6];
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    f.field_a[var6] = -1;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                if (-2 != (pe.field_e ^ -1)) {
                  if (2 == pe.field_e) {
                    var4 = af.a(ij.a(new String[]{"<br><%0><br>"}, -1, hj.field_H), da.field_h, -3, kh.field_F, ch.field_c);
                    var5 = -1;
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        if (var4 <= var6) {
                          break L5;
                        } else {
                          if (!"<%0>".equals(kh.field_F[var6])) {
                            var6++;
                            continue L4;
                          } else {
                            var5 = var6;
                            break L5;
                          }
                        }
                      }
                      if ((var5 ^ -1) != 0) {
                        ia.field_r = new String[var5];
                        ka.a(kh.field_F, 0, ia.field_r, 0, var5);
                        kj.field_c = new String[-1 + (var4 - var5)];
                        ka.a(kh.field_F, 1 + var5, kj.field_c, 0, -1 + var4 - var5);
                        var4 = af.a(ij.a(new String[]{"<br><%0><br>"}, -1, wj.field_b), da.field_h, -3, kh.field_F, ch.field_c);
                        var5 = -1;
                        var6 = 0;
                        L6: while (true) {
                          L7: {
                            if (var4 <= var6) {
                              break L7;
                            } else {
                              if ("<%0>".equals(kh.field_F[var6])) {
                                var5 = var6;
                                break L7;
                              } else {
                                var6++;
                                continue L6;
                              }
                            }
                          }
                          if (var5 == -1) {
                            throw new IllegalStateException();
                          } else {
                            L8: {
                              km.field_c = new String[var5];
                              ka.a(kh.field_F, 0, km.field_c, 0, var5);
                              ec.field_d = new String[-1 + var4 + -var5];
                              ka.a(kh.field_F, var5 + 1, ec.field_d, 0, -var5 + (var4 + -1));
                              if (ia.field_r.length >= km.field_c.length) {
                                stackOut_57_0 = ia.field_r.length;
                                stackIn_58_0 = stackOut_57_0;
                                break L8;
                              } else {
                                stackOut_56_0 = km.field_c.length;
                                stackIn_58_0 = stackOut_56_0;
                                break L8;
                              }
                            }
                            L9: {
                              var6 = stackIn_58_0;
                              if (ec.field_d.length > kj.field_c.length) {
                                stackOut_60_0 = ec.field_d.length;
                                stackIn_61_0 = stackOut_60_0;
                                break L9;
                              } else {
                                stackOut_59_0 = kj.field_c.length;
                                stackIn_61_0 = stackOut_59_0;
                                break L9;
                              }
                            }
                            var7 = stackIn_61_0;
                            var8 = 7 - -var6 - -var7;
                            rb.field_d = new String[var8];
                            f.field_a = new int[var8];
                            var9 = 0;
                            L10: while (true) {
                              if (var8 <= var9) {
                                rb.field_d[0] = p.field_c;
                                pj.field_l = new int[2];
                                rb.field_d[1] = r.field_o;
                                f.field_a[1] = 0;
                                f.field_a[3] = 1;
                                rb.field_d[5] = "";
                                pj.field_l[1] = 2;
                                rb.field_d[4] = ql.field_h;
                                rb.field_d[3] = q.field_Ob;
                                rb.field_d[2] = ga.field_l;
                                pj.field_l[0] = 5;
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= var6) {
                                    rb.field_d[6 + var6] = null;
                                    f.field_a[var6 + 6] = -2;
                                    var9 = 0;
                                    L12: while (true) {
                                      if (var7 <= var9) {
                                        hj.field_I = ll.a(1000);
                                        break L1;
                                      } else {
                                        L13: {
                                          stackOut_72_0 = rb.field_d;
                                          stackOut_72_1 = var6 + 7 + var9;
                                          stackIn_74_0 = stackOut_72_0;
                                          stackIn_74_1 = stackOut_72_1;
                                          stackIn_73_0 = stackOut_72_0;
                                          stackIn_73_1 = stackOut_72_1;
                                          if (var9 >= ec.field_d.length) {
                                            stackOut_74_0 = (String[]) ((Object) stackIn_74_0);
                                            stackOut_74_1 = stackIn_74_1;
                                            stackOut_74_2 = "";
                                            stackIn_75_0 = stackOut_74_0;
                                            stackIn_75_1 = stackOut_74_1;
                                            stackIn_75_2 = stackOut_74_2;
                                            break L13;
                                          } else {
                                            stackOut_73_0 = (String[]) ((Object) stackIn_73_0);
                                            stackOut_73_1 = stackIn_73_1;
                                            stackOut_73_2 = ec.field_d[var9];
                                            stackIn_75_0 = stackOut_73_0;
                                            stackIn_75_1 = stackOut_73_1;
                                            stackIn_75_2 = stackOut_73_2;
                                            break L13;
                                          }
                                        }
                                        stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                        var9++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      stackOut_66_0 = rb.field_d;
                                      stackOut_66_1 = 6 - -var9;
                                      stackIn_68_0 = stackOut_66_0;
                                      stackIn_68_1 = stackOut_66_1;
                                      stackIn_67_0 = stackOut_66_0;
                                      stackIn_67_1 = stackOut_66_1;
                                      if (0 <= km.field_c.length + var9 - var6) {
                                        stackOut_68_0 = (String[]) ((Object) stackIn_68_0);
                                        stackOut_68_1 = stackIn_68_1;
                                        stackOut_68_2 = km.field_c[km.field_c.length + var9 - var6];
                                        stackIn_69_0 = stackOut_68_0;
                                        stackIn_69_1 = stackOut_68_1;
                                        stackIn_69_2 = stackOut_68_2;
                                        break L14;
                                      } else {
                                        stackOut_67_0 = (String[]) ((Object) stackIn_67_0);
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = "";
                                        stackIn_69_0 = stackOut_67_0;
                                        stackIn_69_1 = stackOut_67_1;
                                        stackIn_69_2 = stackOut_67_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                                    var9++;
                                    continue L11;
                                  }
                                }
                              } else {
                                f.field_a[var9] = -1;
                                var9++;
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
                    if (3 == pe.field_e) {
                      L15: {
                        if (nj.field_l.field_v) {
                          var4 = af.a(tc.field_d, da.field_h, -3, kh.field_F, ch.field_c);
                          break L15;
                        } else {
                          var4 = af.a(ra.field_h, da.field_h, -3, kh.field_F, ch.field_c);
                          break L15;
                        }
                      }
                      var5 = 2 + var4;
                      rb.field_d = new String[var5];
                      f.field_a = new int[var5];
                      var6 = 0;
                      L16: while (true) {
                        if (var6 >= var5) {
                          pj.field_l = new int[1];
                          var6 = 0;
                          L17: while (true) {
                            if (var6 >= var4) {
                              rb.field_d[var5 + -2] = "";
                              rb.field_d[-1 + var5] = te.field_e;
                              f.field_a[var5 + -1] = 0;
                              pj.field_l[0] = 5;
                              break L1;
                            } else {
                              rb.field_d[var6] = kh.field_F[var6];
                              var6++;
                              continue L17;
                            }
                          }
                        } else {
                          f.field_a[var6] = -1;
                          var6++;
                          continue L16;
                        }
                      }
                    } else {
                      if (pe.field_e == 4) {
                        var4 = af.a(tb.field_i, da.field_h, -3, kh.field_F, ch.field_c);
                        var5 = var4 + 2;
                        f.field_a = new int[var5];
                        rb.field_d = new String[var5];
                        var6 = 0;
                        L18: while (true) {
                          if (var5 <= var6) {
                            pj.field_l = new int[1];
                            var6 = 0;
                            L19: while (true) {
                              if (var6 >= var4) {
                                rb.field_d[var5 - 2] = "";
                                rb.field_d[-1 + var5] = te.field_e;
                                f.field_a[-1 + var5] = 0;
                                pj.field_l[0] = 5;
                                break L1;
                              } else {
                                rb.field_d[var6] = kh.field_F[var6];
                                var6++;
                                continue L19;
                              }
                            }
                          } else {
                            f.field_a[var6] = -1;
                            var6++;
                            continue L18;
                          }
                        }
                      } else {
                        if (5 != pe.field_e) {
                          throw new IllegalArgumentException();
                        } else {
                          var4 = af.a(va.field_a, da.field_h, -3, kh.field_F, ch.field_c);
                          var5 = 3 + var4;
                          rb.field_d = new String[var5];
                          f.field_a = new int[var5];
                          var6 = 0;
                          L20: while (true) {
                            if (var6 >= var5) {
                              pj.field_l = new int[2];
                              var6 = 0;
                              L21: while (true) {
                                if (var6 >= var4) {
                                  rb.field_d[var5 - 3] = "";
                                  rb.field_d[-2 + var5] = mk.field_h;
                                  f.field_a[var5 - 2] = 0;
                                  pj.field_l[0] = 3;
                                  rb.field_d[-1 + var5] = te.field_e;
                                  f.field_a[var5 + -1] = 1;
                                  pj.field_l[1] = 5;
                                  break L1;
                                } else {
                                  rb.field_d[var6] = kh.field_F[var6];
                                  var6++;
                                  continue L21;
                                }
                              }
                            } else {
                              f.field_a[var6] = -1;
                              var6++;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var4 = af.a(jm.field_d, da.field_h, -3, kh.field_F, ch.field_c);
                  var5 = 2 - -var4;
                  f.field_a = new int[var5];
                  rb.field_d = new String[var5];
                  var6 = 0;
                  L22: while (true) {
                    if (var5 <= var6) {
                      pj.field_l = new int[1];
                      var6 = 0;
                      L23: while (true) {
                        if (var4 <= var6) {
                          rb.field_d[-2 + var5] = "";
                          rb.field_d[var5 + -1] = te.field_e;
                          f.field_a[-1 + var5] = 0;
                          pj.field_l[0] = 5;
                          break L1;
                        } else {
                          rb.field_d[var6] = kh.field_F[var6];
                          var6++;
                          continue L23;
                        }
                      }
                    } else {
                      f.field_a[var6] = -1;
                      var6++;
                      continue L22;
                    }
                  }
                }
              }
            }
            ai.field_i.field_g = pj.field_l.length;
            var4 = 0;
            var5 = 0;
            L24: while (true) {
              if (rb.field_d.length <= var5) {
                L25: {
                  if (2 != pe.field_e) {
                    break L25;
                  } else {
                    var11 = ia.field_r;
                    var6 = 0;
                    L26: while (true) {
                      if (var11.length <= var6) {
                        var12 = kj.field_c;
                        var6 = 0;
                        L27: while (true) {
                          if (var6 >= var12.length) {
                            break L25;
                          } else {
                            L28: {
                              var14 = var12[var6];
                              var8 = bb.a((byte) 87, false, var14);
                              if (var4 < var8) {
                                var4 = var8;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            var6++;
                            continue L27;
                          }
                        }
                      } else {
                        var13 = var11[var6];
                        var8 = bb.a((byte) 87, false, var13);
                        if (var8 > var4) {
                          var4 = var8;
                          var6++;
                          continue L26;
                        } else {
                          var6++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                vi.field_o = nd.field_r - (var4 >> -542895807);
                ql.field_g = -(var4 >> -1598342175) + (var4 + nd.field_r);
                ak.field_e = (dc.field_b - -hi.field_ab << 2062151137) * ai.field_i.field_g;
                var5 = 0;
                L29: while (true) {
                  if (var5 >= rb.field_d.length) {
                    jh.field_m = -(ak.field_e >> 1136169185) + ma.field_E;
                    ll.field_d = new int[rb.field_d.length][];
                    var5 = 0;
                    var6 = jh.field_m;
                    L30: while (true) {
                      if (rb.field_d.length <= var5) {
                        L31: {
                          if (-3 == (pe.field_e ^ -1)) {
                            ai.field_i.a(-1, param1, -1, -85);
                            break L31;
                          } else {
                            ai.field_i.a(0, param1, bb.a(-93, jb.field_b, ef.field_j), -85);
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        L32: {
                          var7 = f.field_a[var5];
                          if (-1 >= (var7 ^ -1)) {
                            var8 = bb.a((byte) 87, true, rb.field_d[var5]);
                            var9 = -(var8 >> -826287263) + nd.field_r;
                            var6 = var6 + hi.field_ab;
                            ll.field_d[var5] = new int[4];
                            ll.field_d[var5][0] = -se.field_j + var9;
                            ll.field_d[var5][1] = var6;
                            ll.field_d[var5][2] = var8 - -(se.field_j << -605279775);
                            var6 = var6 + (lm.field_d + ((dc.field_b << -200239167) - -hi.field_ab));
                            ll.field_d[var5][3] = (dc.field_b << -1289094623) + lm.field_d;
                            break L32;
                          } else {
                            var6 = var6 + jm.field_b;
                            break L32;
                          }
                        }
                        var5++;
                        continue L30;
                      }
                    }
                  } else {
                    L33: {
                      stackOut_107_0 = ak.field_e;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_108_0 = stackOut_107_0;
                      if (0 > f.field_a[var5]) {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = jm.field_b;
                        stackIn_110_0 = stackOut_109_0;
                        stackIn_110_1 = stackOut_109_1;
                        break L33;
                      } else {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = lm.field_d;
                        stackIn_110_0 = stackOut_108_0;
                        stackIn_110_1 = stackOut_108_1;
                        break L33;
                      }
                    }
                    ak.field_e = stackIn_110_0 + stackIn_110_1;
                    var5++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  stackOut_86_0 = 87;
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_87_0 = stackOut_86_0;
                  if (0 > f.field_a[var5]) {
                    stackOut_88_0 = stackIn_88_0;
                    stackOut_88_1 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    break L34;
                  } else {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    break L34;
                  }
                }
                L35: {
                  var6 = bb.a((byte) stackIn_89_0, stackIn_89_1 != 0, rb.field_d[var5]);
                  if (var4 < var6) {
                    var4 = var6;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                var5++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var3), "ja.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private ja() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        if (param0 != 3) {
            return;
        }
        field_m = null;
        field_h = null;
    }

    static {
        field_h = "Open options screen";
        field_l = false;
        field_i = 8;
    }
}
