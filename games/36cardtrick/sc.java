/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static gj field_b;
    static byte field_a;
    static String field_c;

    final static void a(int param0, byte param1, boolean param2) {
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
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String stackIn_48_2 = null;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String stackOut_47_2 = null;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String stackOut_41_2 = null;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              gh.field_g = true;
              v.field_R = param0;
              if (-1 == (v.field_R ^ -1)) {
                var3_int = mh.a(false, rc.field_o, mb.field_a, tk.field_l, ij.field_a);
                var4 = 3 + var3_int;
                me.field_a = new String[var4];
                wd.field_d = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    dd.field_j = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        me.field_a[-3 + var4] = "";
                        me.field_a[-2 + var4] = ck.field_I;
                        wd.field_d[var4 + -2] = 0;
                        dd.field_j[0] = 4;
                        me.field_a[-1 + var4] = gh.field_i;
                        wd.field_d[var4 - 1] = 1;
                        dd.field_j[1] = 5;
                        break L1;
                      } else {
                        me.field_a[var5] = ij.field_a[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    wd.field_d[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (1 != v.field_R) {
                  if (2 != v.field_R) {
                    if (-4 == (v.field_R ^ -1)) {
                      L4: {
                        if (jk.field_a.field_b) {
                          var3_int = mh.a(false, rc.field_o, mb.field_a, oj.field_b, ij.field_a);
                          break L4;
                        } else {
                          var3_int = mh.a(false, rc.field_o, mb.field_a, ll.field_a, ij.field_a);
                          break L4;
                        }
                      }
                      var4 = var3_int + 2;
                      me.field_a = new String[var4];
                      wd.field_d = new int[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var4 <= var5) {
                          dd.field_j = new int[1];
                          var5 = 0;
                          L6: while (true) {
                            if (var5 >= var3_int) {
                              me.field_a[var4 + -2] = "";
                              me.field_a[var4 + -1] = gh.field_i;
                              wd.field_d[var4 - 1] = 0;
                              dd.field_j[0] = 5;
                              break L1;
                            } else {
                              me.field_a[var5] = ij.field_a[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          wd.field_d[var5] = -1;
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if ((v.field_R ^ -1) != -5) {
                        if (v.field_R != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = mh.a(false, rc.field_o, mb.field_a, ij.field_b, ij.field_a);
                          var4 = var3_int + 3;
                          wd.field_d = new int[var4];
                          me.field_a = new String[var4];
                          var5 = 0;
                          L7: while (true) {
                            if (var4 <= var5) {
                              dd.field_j = new int[2];
                              var5 = 0;
                              L8: while (true) {
                                if (var3_int <= var5) {
                                  me.field_a[-3 + var4] = "";
                                  me.field_a[var4 + -2] = fh.field_D;
                                  wd.field_d[-2 + var4] = 0;
                                  dd.field_j[0] = 3;
                                  me.field_a[var4 - 1] = gh.field_i;
                                  wd.field_d[var4 + -1] = 1;
                                  dd.field_j[1] = 5;
                                  break L1;
                                } else {
                                  me.field_a[var5] = ij.field_a[var5];
                                  var5++;
                                  continue L8;
                                }
                              }
                            } else {
                              wd.field_d[var5] = -1;
                              var5++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        var3_int = mh.a(false, rc.field_o, mb.field_a, fe.field_d, ij.field_a);
                        var4 = var3_int + 2;
                        me.field_a = new String[var4];
                        wd.field_d = new int[var4];
                        var5 = 0;
                        L9: while (true) {
                          if (var5 >= var4) {
                            dd.field_j = new int[1];
                            var5 = 0;
                            L10: while (true) {
                              if (var3_int <= var5) {
                                me.field_a[-2 + var4] = "";
                                me.field_a[-1 + var4] = gh.field_i;
                                wd.field_d[var4 + -1] = 0;
                                dd.field_j[0] = 5;
                                break L1;
                              } else {
                                me.field_a[var5] = ij.field_a[var5];
                                var5++;
                                continue L10;
                              }
                            }
                          } else {
                            wd.field_d[var5] = -1;
                            var5++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = mh.a(false, rc.field_o, mb.field_a, re.a(rf.field_g, new String[]{"<br><%0><br>"}, (byte) -50), ij.field_a);
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var5 >= var3_int) {
                          break L12;
                        } else {
                          if ("<%0>".equals(ij.field_a[var5])) {
                            var4 = var5;
                            break L12;
                          } else {
                            var5++;
                            continue L11;
                          }
                        }
                      }
                      if (0 == (var4 ^ -1)) {
                        throw new IllegalStateException();
                      } else {
                        ia.field_d = new String[var4];
                        og.a(ij.field_a, 0, ia.field_d, 0, var4);
                        da.field_c = new String[-1 + (var3_int - var4)];
                        og.a(ij.field_a, 1 + var4, da.field_c, 0, -1 + (var3_int - var4));
                        var3_int = mh.a(false, rc.field_o, mb.field_a, re.a(bf.field_b, new String[]{"<br><%0><br>"}, (byte) -50), ij.field_a);
                        var4 = -1;
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var5 >= var3_int) {
                              break L14;
                            } else {
                              if (!"<%0>".equals(ij.field_a[var5])) {
                                var5++;
                                continue L13;
                              } else {
                                var4 = var5;
                                break L14;
                              }
                            }
                          }
                          if (-1 == var4) {
                            throw new IllegalStateException();
                          } else {
                            L15: {
                              tf.field_p = new String[var4];
                              og.a(ij.field_a, 0, tf.field_p, 0, var4);
                              gl.field_G = new String[var3_int + (-var4 - 1)];
                              og.a(ij.field_a, var4 - -1, gl.field_G, 0, -var4 + (var3_int - 1));
                              if (ia.field_d.length >= tf.field_p.length) {
                                stackOut_30_0 = ia.field_d.length;
                                stackIn_31_0 = stackOut_30_0;
                                break L15;
                              } else {
                                stackOut_29_0 = tf.field_p.length;
                                stackIn_31_0 = stackOut_29_0;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_31_0;
                              if (da.field_c.length < gl.field_G.length) {
                                stackOut_33_0 = gl.field_G.length;
                                stackIn_34_0 = stackOut_33_0;
                                break L16;
                              } else {
                                stackOut_32_0 = da.field_c.length;
                                stackIn_34_0 = stackOut_32_0;
                                break L16;
                              }
                            }
                            var6 = stackIn_34_0;
                            var7 = var6 + var5 + 7;
                            wd.field_d = new int[var7];
                            me.field_a = new String[var7];
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= var7) {
                                wd.field_d[1] = 0;
                                me.field_a[1] = qd.field_b;
                                dd.field_j = new int[2];
                                me.field_a[0] = oa.field_c;
                                me.field_a[3] = gf.field_a;
                                wd.field_d[3] = 1;
                                dd.field_j[1] = 2;
                                me.field_a[4] = ll.field_b;
                                dd.field_j[0] = 5;
                                me.field_a[2] = ai.field_l;
                                me.field_a[5] = "";
                                var8 = 0;
                                L18: while (true) {
                                  if (var5 <= var8) {
                                    me.field_a[6 + var5] = null;
                                    wd.field_d[var5 + 6] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var6 <= var8) {
                                        jl.field_c = id.a(79);
                                        break L1;
                                      } else {
                                        L20: {
                                          stackOut_45_0 = me.field_a;
                                          stackOut_45_1 = var8 + 7 + var5;
                                          stackIn_47_0 = stackOut_45_0;
                                          stackIn_47_1 = stackOut_45_1;
                                          stackIn_46_0 = stackOut_45_0;
                                          stackIn_46_1 = stackOut_45_1;
                                          if (gl.field_G.length <= var8) {
                                            stackOut_47_0 = (String[]) ((Object) stackIn_47_0);
                                            stackOut_47_1 = stackIn_47_1;
                                            stackOut_47_2 = "";
                                            stackIn_48_0 = stackOut_47_0;
                                            stackIn_48_1 = stackOut_47_1;
                                            stackIn_48_2 = stackOut_47_2;
                                            break L20;
                                          } else {
                                            stackOut_46_0 = (String[]) ((Object) stackIn_46_0);
                                            stackOut_46_1 = stackIn_46_1;
                                            stackOut_46_2 = gl.field_G[var8];
                                            stackIn_48_0 = stackOut_46_0;
                                            stackIn_48_1 = stackOut_46_1;
                                            stackIn_48_2 = stackOut_46_2;
                                            break L20;
                                          }
                                        }
                                        stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackOut_39_0 = me.field_a;
                                      stackOut_39_1 = 6 - -var8;
                                      stackIn_41_0 = stackOut_39_0;
                                      stackIn_41_1 = stackOut_39_1;
                                      stackIn_40_0 = stackOut_39_0;
                                      stackIn_40_1 = stackOut_39_1;
                                      if ((-var5 + var8 - -tf.field_p.length ^ -1) > -1) {
                                        stackOut_41_0 = (String[]) ((Object) stackIn_41_0);
                                        stackOut_41_1 = stackIn_41_1;
                                        stackOut_41_2 = "";
                                        stackIn_42_0 = stackOut_41_0;
                                        stackIn_42_1 = stackOut_41_1;
                                        stackIn_42_2 = stackOut_41_2;
                                        break L21;
                                      } else {
                                        stackOut_40_0 = (String[]) ((Object) stackIn_40_0);
                                        stackOut_40_1 = stackIn_40_1;
                                        stackOut_40_2 = tf.field_p[tf.field_p.length + var8 + -var5];
                                        stackIn_42_0 = stackOut_40_0;
                                        stackIn_42_1 = stackOut_40_1;
                                        stackIn_42_2 = stackOut_40_2;
                                        break L21;
                                      }
                                    }
                                    stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                wd.field_d[var8] = -1;
                                var8++;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3_int = mh.a(false, rc.field_o, mb.field_a, tk.field_l, ij.field_a);
                  var4 = var3_int + 2;
                  me.field_a = new String[var4];
                  wd.field_d = new int[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var4) {
                      dd.field_j = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var3_int <= var5) {
                          me.field_a[var4 - 2] = "";
                          me.field_a[var4 + -1] = gh.field_i;
                          wd.field_d[-1 + var4] = 0;
                          dd.field_j[0] = 5;
                          break L1;
                        } else {
                          me.field_a[var5] = ij.field_a[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      wd.field_d[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            cg.field_e.field_i = dd.field_j.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (me.field_a.length <= var4) {
                L25: {
                  if (-3 == (v.field_R ^ -1)) {
                    var11 = ia.field_d;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        var12 = da.field_c;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var12.length) {
                            break L25;
                          } else {
                            var14 = var12[var5];
                            var7 = hj.a(false, false, var14);
                            if (var7 > var3_int) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var13 = var11[var5];
                        var7 = hj.a(false, false, var13);
                        if (var7 > var3_int) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                cc.field_d = dl.field_g + var3_int - (var3_int >> 1603363809);
                cc.field_e = cg.field_e.field_i * (e.field_i + a.field_o << 647774849);
                cb.field_i = dl.field_g - (var3_int >> 590049825);
                var4 = 0;
                L28: while (true) {
                  if (me.field_a.length <= var4) {
                    qe.field_E = s.field_c + -(cc.field_e >> -1091882783);
                    ud.field_a = new int[me.field_a.length][];
                    var4 = 0;
                    var6 = 90 / ((61 - param1) / 54);
                    var5 = qe.field_E;
                    L29: while (true) {
                      if (var4 >= me.field_a.length) {
                        L30: {
                          if (2 != v.field_R) {
                            cg.field_e.a(-91, af.a(ij.field_e, true, eg.field_b), 0, param2);
                            break L30;
                          } else {
                            cg.field_e.a(-88, -1, -1, param2);
                            break L30;
                          }
                        }
                        break L0;
                      } else {
                        L31: {
                          var7 = wd.field_d[var4];
                          if ((var7 ^ -1) <= -1) {
                            var8 = hj.a(false, true, me.field_a[var4]);
                            var5 = var5 + e.field_i;
                            var9 = dl.field_g - (var8 >> -357212927);
                            ud.field_a[var4] = new int[4];
                            ud.field_a[var4][0] = var9 + -tc.field_b;
                            ud.field_a[var4][1] = var5;
                            ud.field_a[var4][2] = var8 - -(tc.field_b << -1945746271);
                            var5 = var5 + ((a.field_o << -338552447) - -e.field_i + tl.field_b);
                            ud.field_a[var4][3] = (a.field_o << 178313985) + tl.field_b;
                            break L31;
                          } else {
                            var5 = var5 + sa.field_d;
                            break L31;
                          }
                        }
                        var4++;
                        continue L29;
                      }
                    }
                  } else {
                    L32: {
                      stackOut_108_0 = cc.field_e;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_109_0 = stackOut_108_0;
                      if (0 > wd.field_d[var4]) {
                        stackOut_110_0 = stackIn_110_0;
                        stackOut_110_1 = sa.field_d;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        break L32;
                      } else {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = tl.field_b;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_111_1 = stackOut_109_1;
                        break L32;
                      }
                    }
                    cc.field_e = stackIn_111_0 + stackIn_111_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackOut_87_0 = 0;
                  stackIn_89_0 = stackOut_87_0;
                  stackIn_88_0 = stackOut_87_0;
                  if (wd.field_d[var4] < 0) {
                    stackOut_89_0 = stackIn_89_0;
                    stackOut_89_1 = 0;
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    break L33;
                  } else {
                    stackOut_88_0 = stackIn_88_0;
                    stackOut_88_1 = 1;
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_90_1 = stackOut_88_1;
                    break L33;
                  }
                }
                L34: {
                  var5 = hj.a(stackIn_90_0 != 0, stackIn_90_1 != 0, me.field_a[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L34;
                  } else {
                    break L34;
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
          throw ma.a((Throwable) ((Object) var3), "sc.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 178313985) {
            field_c = (String) null;
        }
        field_b = null;
    }

    final static void a(byte param0, uf param1) {
        try {
            rk.a(true, param1, false);
            int var2_int = 57 % ((param0 - -15) / 39);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "sc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != 20) {
            field_c = (String) null;
        }
        if (h.field_F != 0 - vb.field_b) {
            if (h.field_F != -vb.field_b + 250) {
            }
        }
        h.field_F = h.field_F + 1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = "Unpacking sound effects";
    }
}
