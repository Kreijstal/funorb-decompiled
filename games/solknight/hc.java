/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class hc {
    static int field_b;
    static nc field_a;
    static byte[][] field_e;
    static String field_f;
    static int field_d;
    static hb field_c;

    final static void a(String param0, boolean param1, String param2, boolean param3) {
        try {
            me.field_h = param2;
            ec.field_j = param0;
            nf.a(param3, ab.field_p, -119);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "hc.C(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_c = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_74_2 = null;
        String[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        String[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String stackIn_80_2 = null;
        String stackIn_85_0 = null;
        String stackIn_86_0 = null;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        String[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        String[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        String stackOut_79_2 = null;
        String[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        String stackOut_78_2 = null;
        String[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String stackOut_72_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        String stackOut_84_0 = null;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        L0: {
          var9 = SolKnight.field_L ? 1 : 0;
          te.field_M = param2;
          jg.field_d = true;
          if (te.field_M != 0) {
            if (te.field_M != 1) {
              if (te.field_M == 2) {
                int discarded$6 = -63;
                var3_int = bk.a((byte) 3, bb.a(ef.field_f, new String[1]), ke.field_H, si.field_A, w.field_c);
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var3_int <= var5) {
                      break L2;
                    } else {
                      if ("<%0>".equals((Object) (Object) w.field_c[var5])) {
                        var4 = var5;
                        break L2;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                  if (var4 != -1) {
                    ak.field_b = new String[var4];
                    fk.a((Object[]) (Object) w.field_c, 0, (Object[]) (Object) ak.field_b, 0, var4);
                    qc.field_h = new String[-1 + (var3_int - var4)];
                    fk.a((Object[]) (Object) w.field_c, var4 - -1, (Object[]) (Object) qc.field_h, 0, -var4 + (var3_int + -1));
                    int discarded$7 = -63;
                    var3_int = bk.a((byte) 3, bb.a(ff.field_f, new String[1]), ke.field_H, si.field_A, w.field_c);
                    var4 = -1;
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var3_int) {
                          break L4;
                        } else {
                          if (!"<%0>".equals((Object) (Object) w.field_c[var5])) {
                            var5++;
                            continue L3;
                          } else {
                            var4 = var5;
                            break L4;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L5: {
                          i.field_I = new String[var4];
                          fk.a((Object[]) (Object) w.field_c, 0, (Object[]) (Object) i.field_I, 0, var4);
                          qa.field_o = new String[-1 + -var4 + var3_int];
                          fk.a((Object[]) (Object) w.field_c, var4 - -1, (Object[]) (Object) qa.field_o, 0, var3_int + -var4 - 1);
                          if (i.field_I.length <= ak.field_b.length) {
                            stackOut_62_0 = ak.field_b.length;
                            stackIn_63_0 = stackOut_62_0;
                            break L5;
                          } else {
                            stackOut_61_0 = i.field_I.length;
                            stackIn_63_0 = stackOut_61_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_63_0;
                          if (qa.field_o.length > qc.field_h.length) {
                            stackOut_65_0 = qa.field_o.length;
                            stackIn_66_0 = stackOut_65_0;
                            break L6;
                          } else {
                            stackOut_64_0 = qc.field_h.length;
                            stackIn_66_0 = stackOut_64_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_66_0;
                        var7 = 7 + (var5 - -var6);
                        oa.field_l = new int[var7];
                        vc.field_d = new String[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (var8 >= var7) {
                            oa.field_l[1] = 0;
                            vc.field_d[0] = si.field_D;
                            fl.field_b = new int[2];
                            vc.field_d[1] = cj.field_b;
                            fl.field_b[0] = 5;
                            fl.field_b[1] = 2;
                            vc.field_d[4] = lg.field_r;
                            vc.field_d[2] = ha.field_n;
                            oa.field_l[3] = 1;
                            vc.field_d[5] = "";
                            vc.field_d[3] = qk.field_j;
                            var8 = 0;
                            L8: while (true) {
                              if (var5 <= var8) {
                                vc.field_d[6 - -var5] = null;
                                oa.field_l[6 - -var5] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (var8 >= var6) {
                                    fg.field_f = je.a(1);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_77_0 = vc.field_d;
                                      stackOut_77_1 = 7 - (-var5 + -var8);
                                      stackIn_79_0 = stackOut_77_0;
                                      stackIn_79_1 = stackOut_77_1;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      if (qa.field_o.length > var8) {
                                        stackOut_79_0 = (String[]) (Object) stackIn_79_0;
                                        stackOut_79_1 = stackIn_79_1;
                                        stackOut_79_2 = qa.field_o[var8];
                                        stackIn_80_0 = stackOut_79_0;
                                        stackIn_80_1 = stackOut_79_1;
                                        stackIn_80_2 = stackOut_79_2;
                                        break L10;
                                      } else {
                                        stackOut_78_0 = (String[]) (Object) stackIn_78_0;
                                        stackOut_78_1 = stackIn_78_1;
                                        stackOut_78_2 = "";
                                        stackIn_80_0 = stackOut_78_0;
                                        stackIn_80_1 = stackOut_78_1;
                                        stackIn_80_2 = stackOut_78_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_80_0[stackIn_80_1] = stackIn_80_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_71_0 = vc.field_d;
                                  stackOut_71_1 = 6 + var8;
                                  stackIn_73_0 = stackOut_71_0;
                                  stackIn_73_1 = stackOut_71_1;
                                  stackIn_72_0 = stackOut_71_0;
                                  stackIn_72_1 = stackOut_71_1;
                                  if (i.field_I.length + var8 + -var5 >= 0) {
                                    stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                    stackOut_73_1 = stackIn_73_1;
                                    stackOut_73_2 = i.field_I[var8 - -i.field_I.length - var5];
                                    stackIn_74_0 = stackOut_73_0;
                                    stackIn_74_1 = stackOut_73_1;
                                    stackIn_74_2 = stackOut_73_2;
                                    break L11;
                                  } else {
                                    stackOut_72_0 = (String[]) (Object) stackIn_72_0;
                                    stackOut_72_1 = stackIn_72_1;
                                    stackOut_72_2 = "";
                                    stackIn_74_0 = stackOut_72_0;
                                    stackIn_74_1 = stackOut_72_1;
                                    stackIn_74_2 = stackOut_72_2;
                                    break L11;
                                  }
                                }
                                stackIn_74_0[stackIn_74_1] = stackIn_74_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            oa.field_l[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              } else {
                if (3 == te.field_M) {
                  L12: {
                    if (!wh.field_c.field_h) {
                      var3_int = bk.a((byte) 3, ic.field_x, ke.field_H, si.field_A, w.field_c);
                      break L12;
                    } else {
                      var3_int = bk.a((byte) 3, tg.field_K, ke.field_H, si.field_A, w.field_c);
                      break L12;
                    }
                  }
                  var4 = 2 + var3_int;
                  vc.field_d = new String[var4];
                  oa.field_l = new int[var4];
                  var5 = 0;
                  L13: while (true) {
                    if (var5 >= var4) {
                      fl.field_b = new int[1];
                      var5 = 0;
                      L14: while (true) {
                        if (var3_int <= var5) {
                          vc.field_d[var4 - 2] = "";
                          vc.field_d[var4 + -1] = le.field_a;
                          oa.field_l[-1 + var4] = 0;
                          fl.field_b[0] = 5;
                          break L0;
                        } else {
                          vc.field_d[var5] = w.field_c[var5];
                          var5++;
                          continue L14;
                        }
                      }
                    } else {
                      oa.field_l[var5] = -1;
                      var5++;
                      continue L13;
                    }
                  }
                } else {
                  if (4 == te.field_M) {
                    var3_int = bk.a((byte) 3, ak.field_c, ke.field_H, si.field_A, w.field_c);
                    var4 = 2 + var3_int;
                    oa.field_l = new int[var4];
                    vc.field_d = new String[var4];
                    var5 = 0;
                    L15: while (true) {
                      if (var4 <= var5) {
                        fl.field_b = new int[1];
                        var5 = 0;
                        L16: while (true) {
                          if (var3_int <= var5) {
                            vc.field_d[var4 + -2] = "";
                            vc.field_d[-1 + var4] = le.field_a;
                            oa.field_l[var4 + -1] = 0;
                            fl.field_b[0] = 5;
                            break L0;
                          } else {
                            vc.field_d[var5] = w.field_c[var5];
                            var5++;
                            continue L16;
                          }
                        }
                      } else {
                        oa.field_l[var5] = -1;
                        var5++;
                        continue L15;
                      }
                    }
                  } else {
                    if (5 != te.field_M) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = bk.a((byte) 3, vh.field_b, ke.field_H, si.field_A, w.field_c);
                      var4 = 3 - -var3_int;
                      oa.field_l = new int[var4];
                      vc.field_d = new String[var4];
                      var5 = 0;
                      L17: while (true) {
                        if (var4 <= var5) {
                          fl.field_b = new int[2];
                          var5 = 0;
                          L18: while (true) {
                            if (var5 >= var3_int) {
                              vc.field_d[var4 + -3] = "";
                              vc.field_d[var4 - 2] = fg.field_c;
                              oa.field_l[var4 - 2] = 0;
                              fl.field_b[0] = 3;
                              vc.field_d[-1 + var4] = le.field_a;
                              oa.field_l[var4 + -1] = 1;
                              fl.field_b[1] = 5;
                              break L0;
                            } else {
                              vc.field_d[var5] = w.field_c[var5];
                              var5++;
                              continue L18;
                            }
                          }
                        } else {
                          oa.field_l[var5] = -1;
                          var5++;
                          continue L17;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var3_int = bk.a((byte) 3, ff.field_e, ke.field_H, si.field_A, w.field_c);
              var4 = 2 + var3_int;
              oa.field_l = new int[var4];
              vc.field_d = new String[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  fl.field_b = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3_int) {
                      vc.field_d[-2 + var4] = "";
                      vc.field_d[var4 + -1] = le.field_a;
                      oa.field_l[-1 + var4] = 0;
                      fl.field_b[0] = 5;
                      break L0;
                    } else {
                      vc.field_d[var5] = w.field_c[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  oa.field_l[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3_int = bk.a((byte) 3, ff.field_e, ke.field_H, si.field_A, w.field_c);
            var4 = var3_int + 3;
            oa.field_l = new int[var4];
            vc.field_d = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var4 <= var5) {
                fl.field_b = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var3_int) {
                    vc.field_d[-3 + var4] = "";
                    vc.field_d[-2 + var4] = be.field_J;
                    oa.field_l[-2 + var4] = 0;
                    fl.field_b[0] = 4;
                    vc.field_d[var4 - 1] = le.field_a;
                    oa.field_l[-1 + var4] = 1;
                    fl.field_b[1] = 5;
                    break L0;
                  } else {
                    vc.field_d[var5] = w.field_c[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                oa.field_l[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        bc.field_K.field_g = fl.field_b.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= vc.field_d.length) {
            L24: {
              if (te.field_M == 2) {
                var10 = ak.field_b;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = qc.field_h;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        break L24;
                      } else {
                        L27: {
                          var6_ref_String = var11[var5];
                          int discarded$8 = 99;
                          var7 = fa.a(var6_ref_String, false);
                          if (var7 > var3_int) {
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
                      var6_ref_String = var10[var5];
                      int discarded$9 = 99;
                      var7 = fa.a(var6_ref_String, false);
                      if (var3_int < var7) {
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
              } else {
                break L24;
              }
            }
            pk.field_ab = sb.field_d - (var3_int >> 1);
            dh.field_h = sb.field_d - -var3_int + -(var3_int >> 1);
            v.field_d = (g.field_l - -vg.field_N << 1) * bc.field_K.field_g;
            var4 = 0;
            L29: while (true) {
              if (vc.field_d.length <= var4) {
                th.field_J = -(v.field_d >> 1) + vk.field_m;
                og.field_j = new int[vc.field_d.length][];
                var4 = 0;
                var5 = th.field_J;
                L30: while (true) {
                  if (var4 >= vc.field_d.length) {
                    L31: {
                      if (te.field_M == 2) {
                        bc.field_K.a(param0, -1, -1, 125);
                        break L31;
                      } else {
                        bc.field_K.a(param0, 0, uc.a(gb.field_j, 1691746689, ad.field_m), 122);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = oa.field_l[var4];
                      if (var6 < 0) {
                        var5 = var5 + uc.field_i;
                        break L32;
                      } else {
                        int discarded$10 = 99;
                        var7 = fa.a(vc.field_d[var4], true);
                        var5 = var5 + vg.field_N;
                        var8 = -(var7 >> 1) + sb.field_d;
                        og.field_j[var4] = new int[4];
                        og.field_j[var4][0] = var8 - bl.field_i;
                        og.field_j[var4][1] = var5;
                        og.field_j[var4][2] = (bl.field_i << 1) + var7;
                        og.field_j[var4][3] = (g.field_l << 1) + we.field_c;
                        var5 = var5 + (we.field_c + vg.field_N + (g.field_l << 1));
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_107_0 = v.field_d;
                  stackIn_109_0 = stackOut_107_0;
                  stackIn_108_0 = stackOut_107_0;
                  if (oa.field_l[var4] < 0) {
                    stackOut_109_0 = stackIn_109_0;
                    stackOut_109_1 = uc.field_i;
                    stackIn_110_0 = stackOut_109_0;
                    stackIn_110_1 = stackOut_109_1;
                    break L33;
                  } else {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = we.field_c;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_110_1 = stackOut_108_1;
                    break L33;
                  }
                }
                v.field_d = stackIn_110_0 + stackIn_110_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_84_0 = vc.field_d[var4];
              stackIn_86_0 = stackOut_84_0;
              stackIn_85_0 = stackOut_84_0;
              if (oa.field_l[var4] < 0) {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                break L34;
              } else {
                stackOut_85_0 = (String) (Object) stackIn_85_0;
                stackOut_85_1 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                break L34;
              }
            }
            L35: {
              int discarded$11 = 99;
              var5 = fa.a(stackIn_87_0, stackIn_87_1 != 0);
              if (var5 > var3_int) {
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

    final static String a(long param0, int param1) {
        pd.field_f.setTime(new Date(param0));
        int var3 = pd.field_f.get(7);
        int var4 = pd.field_f.get(5);
        if (param1 != -31289) {
            String discarded$0 = hc.a(85L, -27);
        }
        int var5 = pd.field_f.get(2);
        int var6 = pd.field_f.get(1);
        int var7 = pd.field_f.get(11);
        int var8 = pd.field_f.get(12);
        int var9 = pd.field_f.get(13);
        return na.field_j[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + li.field_h[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new nc();
        field_e = new byte[250][];
        field_f = "Achieved";
    }
}
