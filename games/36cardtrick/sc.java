/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class sc {
    static gj field_b;
    static byte field_a;
    static String field_c;

    final static void a(int param0, byte param1, boolean param2) {
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
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_41_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_47_2 = null;
        int stackIn_87_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        L0: {
          var10 = Main.field_T;
          gh.field_g = true;
          v.field_R = param0;
          if (v.field_R == 0) {
            var3_int = mh.a(false, rc.field_o, mb.field_a, tk.field_l, ij.field_a);
            var4 = 3 + var3_int;
            me.field_a = new String[var4];
            wd.field_d = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                dd.field_j = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var3_int <= var5) {
                    me.field_a[-3 + var4] = "";
                    me.field_a[-2 + var4] = ck.field_I;
                    wd.field_d[var4 + -2] = 0;
                    dd.field_j[0] = 4;
                    me.field_a[-1 + var4] = gh.field_i;
                    wd.field_d[var4 - 1] = 1;
                    dd.field_j[1] = 5;
                    break L0;
                  } else {
                    me.field_a[var5] = ij.field_a[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                wd.field_d[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (1 != v.field_R) {
              if (2 != v.field_R) {
                if (v.field_R == 3) {
                  L3: {
                    if (jk.field_a.field_b) {
                      var3_int = mh.a(false, rc.field_o, mb.field_a, oj.field_b, ij.field_a);
                      break L3;
                    } else {
                      var3_int = mh.a(false, rc.field_o, mb.field_a, ll.field_a, ij.field_a);
                      break L3;
                    }
                  }
                  var4 = var3_int + 2;
                  me.field_a = new String[var4];
                  wd.field_d = new int[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var4 <= var5) {
                      dd.field_j = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var3_int) {
                          me.field_a[var4 + -2] = "";
                          me.field_a[var4 + -1] = gh.field_i;
                          wd.field_d[var4 - 1] = 0;
                          dd.field_j[0] = 5;
                          break L0;
                        } else {
                          me.field_a[var5] = ij.field_a[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      wd.field_d[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (v.field_R != 4) {
                    if (v.field_R != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = mh.a(false, rc.field_o, mb.field_a, ij.field_b, ij.field_a);
                      var4 = var3_int + 3;
                      wd.field_d = new int[var4];
                      me.field_a = new String[var4];
                      var5 = 0;
                      L6: while (true) {
                        if (var4 <= var5) {
                          dd.field_j = new int[2];
                          var5 = 0;
                          L7: while (true) {
                            if (var3_int <= var5) {
                              me.field_a[-3 + var4] = "";
                              me.field_a[var4 + -2] = fh.field_D;
                              wd.field_d[-2 + var4] = 0;
                              dd.field_j[0] = 3;
                              me.field_a[var4 - 1] = gh.field_i;
                              wd.field_d[var4 + -1] = 1;
                              dd.field_j[1] = 5;
                              break L0;
                            } else {
                              me.field_a[var5] = ij.field_a[var5];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          wd.field_d[var5] = -1;
                          var5++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var3_int = mh.a(false, rc.field_o, mb.field_a, fe.field_d, ij.field_a);
                    var4 = var3_int + 2;
                    me.field_a = new String[var4];
                    wd.field_d = new int[var4];
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= var4) {
                        dd.field_j = new int[1];
                        var5 = 0;
                        L9: while (true) {
                          if (var3_int <= var5) {
                            me.field_a[-2 + var4] = "";
                            me.field_a[-1 + var4] = gh.field_i;
                            wd.field_d[var4 + -1] = 0;
                            dd.field_j[0] = 5;
                            break L0;
                          } else {
                            me.field_a[var5] = ij.field_a[var5];
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        wd.field_d[var5] = -1;
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                int discarded$2 = -50;
                var3_int = mh.a(false, rc.field_o, mb.field_a, re.a(rf.field_g, new String[1]), ij.field_a);
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var5 >= var3_int) {
                      break L11;
                    } else {
                      if ("<%0>".equals((Object) (Object) ij.field_a[var5])) {
                        var4 = var5;
                        break L11;
                      } else {
                        var5++;
                        continue L10;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    ia.field_d = new String[var4];
                    og.a((Object[]) (Object) ij.field_a, 0, (Object[]) (Object) ia.field_d, 0, var4);
                    da.field_c = new String[-1 + (var3_int - var4)];
                    og.a((Object[]) (Object) ij.field_a, 1 + var4, (Object[]) (Object) da.field_c, 0, -1 + (var3_int - var4));
                    int discarded$3 = -50;
                    var3_int = mh.a(false, rc.field_o, mb.field_a, re.a(bf.field_b, new String[1]), ij.field_a);
                    var4 = -1;
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var5 >= var3_int) {
                          break L13;
                        } else {
                          if (!"<%0>".equals((Object) (Object) ij.field_a[var5])) {
                            var5++;
                            continue L12;
                          } else {
                            var4 = var5;
                            break L13;
                          }
                        }
                      }
                      if (-1 == var4) {
                        throw new IllegalStateException();
                      } else {
                        L14: {
                          tf.field_p = new String[var4];
                          og.a((Object[]) (Object) ij.field_a, 0, (Object[]) (Object) tf.field_p, 0, var4);
                          gl.field_G = new String[var3_int + (-var4 - 1)];
                          og.a((Object[]) (Object) ij.field_a, var4 - -1, (Object[]) (Object) gl.field_G, 0, -var4 + (var3_int - 1));
                          if (ia.field_d.length >= tf.field_p.length) {
                            stackOut_29_0 = ia.field_d.length;
                            stackIn_30_0 = stackOut_29_0;
                            break L14;
                          } else {
                            stackOut_28_0 = tf.field_p.length;
                            stackIn_30_0 = stackOut_28_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_30_0;
                          if (da.field_c.length < gl.field_G.length) {
                            stackOut_32_0 = gl.field_G.length;
                            stackIn_33_0 = stackOut_32_0;
                            break L15;
                          } else {
                            stackOut_31_0 = da.field_c.length;
                            stackIn_33_0 = stackOut_31_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_33_0;
                        var7 = var6 + var5 + 7;
                        wd.field_d = new int[var7];
                        me.field_a = new String[var7];
                        var8 = 0;
                        L16: while (true) {
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
                            L17: while (true) {
                              if (var5 <= var8) {
                                me.field_a[6 + var5] = null;
                                wd.field_d[var5 + 6] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var6 <= var8) {
                                    jl.field_c = id.a(79);
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_44_0 = me.field_a;
                                      stackOut_44_1 = var8 + 7 + var5;
                                      stackIn_46_0 = stackOut_44_0;
                                      stackIn_46_1 = stackOut_44_1;
                                      stackIn_45_0 = stackOut_44_0;
                                      stackIn_45_1 = stackOut_44_1;
                                      if (gl.field_G.length <= var8) {
                                        stackOut_46_0 = (String[]) (Object) stackIn_46_0;
                                        stackOut_46_1 = stackIn_46_1;
                                        stackOut_46_2 = "";
                                        stackIn_47_0 = stackOut_46_0;
                                        stackIn_47_1 = stackOut_46_1;
                                        stackIn_47_2 = stackOut_46_2;
                                        break L19;
                                      } else {
                                        stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                        stackOut_45_1 = stackIn_45_1;
                                        stackOut_45_2 = gl.field_G[var8];
                                        stackIn_47_0 = stackOut_45_0;
                                        stackIn_47_1 = stackOut_45_1;
                                        stackIn_47_2 = stackOut_45_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_38_0 = me.field_a;
                                  stackOut_38_1 = 6 - -var8;
                                  stackIn_40_0 = stackOut_38_0;
                                  stackIn_40_1 = stackOut_38_1;
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  if (-var5 + var8 - -tf.field_p.length < 0) {
                                    stackOut_40_0 = (String[]) (Object) stackIn_40_0;
                                    stackOut_40_1 = stackIn_40_1;
                                    stackOut_40_2 = "";
                                    stackIn_41_0 = stackOut_40_0;
                                    stackIn_41_1 = stackOut_40_1;
                                    stackIn_41_2 = stackOut_40_2;
                                    break L20;
                                  } else {
                                    stackOut_39_0 = (String[]) (Object) stackIn_39_0;
                                    stackOut_39_1 = stackIn_39_1;
                                    stackOut_39_2 = tf.field_p[tf.field_p.length + var8 + -var5];
                                    stackIn_41_0 = stackOut_39_0;
                                    stackIn_41_1 = stackOut_39_1;
                                    stackIn_41_2 = stackOut_39_2;
                                    break L20;
                                  }
                                }
                                stackIn_41_0[stackIn_41_1] = stackIn_41_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            wd.field_d[var8] = -1;
                            var8++;
                            continue L16;
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
              L21: while (true) {
                if (var5 >= var4) {
                  dd.field_j = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var3_int <= var5) {
                      me.field_a[var4 - 2] = "";
                      me.field_a[var4 + -1] = gh.field_i;
                      wd.field_d[-1 + var4] = 0;
                      dd.field_j[0] = 5;
                      break L0;
                    } else {
                      me.field_a[var5] = ij.field_a[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  wd.field_d[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        cg.field_e.field_i = dd.field_j.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (me.field_a.length <= var4) {
            L24: {
              if (v.field_R == 2) {
                var11 = ia.field_d;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var11.length) {
                    var12 = da.field_c;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var12.length) {
                        break L24;
                      } else {
                        L27: {
                          var14 = var12[var5];
                          var7 = hj.a(false, false, var14);
                          if (var7 <= var3_int) {
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
                      var13 = var11[var5];
                      var7 = hj.a(false, false, var13);
                      if (var7 <= var3_int) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              } else {
                break L24;
              }
            }
            cc.field_d = dl.field_g + var3_int - (var3_int >> 1);
            cc.field_e = cg.field_e.field_i * (e.field_i + a.field_o << 1);
            cb.field_i = dl.field_g - (var3_int >> 1);
            var4 = 0;
            L29: while (true) {
              if (me.field_a.length <= var4) {
                qe.field_E = s.field_c + -(cc.field_e >> 1);
                ud.field_a = new int[me.field_a.length][];
                var4 = 0;
                var6 = 90 / ((61 - param1) / 54);
                var5 = qe.field_E;
                L30: while (true) {
                  if (var4 >= me.field_a.length) {
                    L31: {
                      if (2 != v.field_R) {
                        cg.field_e.a(-91, af.a(ij.field_e, true, eg.field_b), 0, param2);
                        break L31;
                      } else {
                        cg.field_e.a(-88, -1, -1, param2);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var7 = wd.field_d[var4];
                      if (var7 >= 0) {
                        var8 = hj.a(false, true, me.field_a[var4]);
                        var5 = var5 + e.field_i;
                        var9 = dl.field_g - (var8 >> 1);
                        ud.field_a[var4] = new int[4];
                        ud.field_a[var4][0] = var9 + -tc.field_b;
                        ud.field_a[var4][1] = var5;
                        ud.field_a[var4][2] = var8 - -(tc.field_b << 1);
                        var5 = var5 + ((a.field_o << 1) - -e.field_i + tl.field_b);
                        ud.field_a[var4][3] = (a.field_o << 1) + tl.field_b;
                        break L32;
                      } else {
                        var5 = var5 + sa.field_d;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_105_0 = cc.field_e;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if (0 > wd.field_d[var4]) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = sa.field_d;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L33;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = tl.field_b;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L33;
                  }
                }
                cc.field_e = stackIn_108_0 + stackIn_108_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_86_0 = 0;
              stackIn_88_0 = stackOut_86_0;
              stackIn_87_0 = stackOut_86_0;
              if (wd.field_d[var4] < 0) {
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
              var5 = hj.a(stackIn_89_0 != 0, stackIn_89_1 != 0, me.field_a[var4]);
              if (var3_int < var5) {
                var3_int = var5;
                break L35;
              } else {
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0, uf param1) {
        try {
            int discarded$0 = 0;
            rk.a(true, param1);
            int var2_int = 57 % ((param0 - -15) / 39);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "sc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a() {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unpacking sound effects";
    }
}
