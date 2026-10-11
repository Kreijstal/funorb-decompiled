/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wh {
    static rm[] field_b;
    static km field_d;
    static km field_a;
    static int[] field_c;

    abstract void a(byte[] param0, byte param1);

    final static int a(byte param0) {
        if (param0 != 5) {
          wh.a(109);
        }
        return (int)(1000000000L / hd.field_f);
    }

    final static int a(int param0, boolean param1, int param2, boolean param3, String param4, uh param5, uh param6) {
        int var12 = 0;
        int stackIn_6_0 = 0;
        jc stackIn_11_0 = null;
        String stackIn_12_1 = null;
        jc stackIn_14_0 = null;
        String stackIn_15_1 = null;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          var14 = param5.b(-127);
          var8 = param6.b(-127);
          if (oj.field_Ub == null &&
            !ce.a(-111, false)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (ul.field_c == ug.field_a) {
            ia.field_b = null;
            gk.field_g.field_l = 0;
            if (param4 != null) {
              var9 = 0;
              gg.field_D.field_l = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
              gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
              gg.field_D.b(var14, (byte) -87);
              gg.field_D.b(var8, (byte) -125);
              var15 = (CharSequence) ((Object) param4);
              gg.field_D.b(na.a((byte) 51, var15), (byte) 118);
              gg.field_D.a((byte) -88, param0);
              gg.field_D.a(param2, -69);
              gg.field_D.a(var9, -66);
              gk.field_g.a(18, 105);
              gk.field_g.field_l = gk.field_g.field_l + 2;
              var10 = gk.field_g.field_l;
              var11_ref_String = sh.b(-25, mb.g((byte) 41));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              gk.field_g.a(var11_ref_String, (byte) -75);
              nl.a(on.field_a, gg.field_D, gk.field_g, ch.field_i, 0);
              gk.field_g.c(-var10 + gk.field_g.field_l, -3991);
            } else {
              gg.field_D.field_l = 0;
              gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
              gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
              stackIn_11_0 = gg.field_D;
              if (param5.a(0)) {
                stackIn_12_1 = var14;
              } else {
                stackIn_12_1 = "";
              }
              ((jc) (Object) stackIn_11_0).b(stackIn_12_1, (byte) 109);
              stackIn_14_0 = gg.field_D;
              if (!param6.a(0)) {
                stackIn_15_1 = "";
              } else {
                stackIn_15_1 = var8;
              }
              ((jc) (Object) stackIn_14_0).b(stackIn_15_1, (byte) -32);
              gk.field_g.a(16, -90);
              gk.field_g.field_l = gk.field_g.field_l + 1;
              var9 = gk.field_g.field_l;
              nl.a(on.field_a, gg.field_D, gk.field_g, ch.field_i, 0);
              gk.field_g.b(gk.field_g.field_l - var9, -1);
            }
            al.b(-1, -1);
            ug.field_a = me.field_e;
          }
          if (me.field_e == ug.field_a &&
            wg.a(1, 0)) {
            var9Lifetime1 = sh.field_qb.g(11132);
            sh.field_qb.field_l = 0;
            if (100 <= var9Lifetime1 &&
              105 >= var9Lifetime1) {
              jf.field_b = new String[-100 + var9Lifetime1];
              ug.field_a = kk.field_n;
            } else {
              if (var9Lifetime1 == 248) {
                sj.a(mb.g((byte) -112), 20298);
                ld.field_g = wf.field_a;
                tn.a(false);
                fh.field_e = false;
                stackIn_32_0 = var9Lifetime1;
                return stackIn_32_0;
              }
              if (99 == var9Lifetime1) {
                wg.a(bl.f(0), 0);
                ia.field_b = new Boolean(mk.a(sh.field_qb, -87));
                sh.field_qb.field_l = 0;
              } else {
                ci.field_q = var9Lifetime1;
                ba.field_a = -1;
                ug.field_a = k.field_a;
              }
            }
          }
          if (kk.field_n == ug.field_a) {
            var9Lifetime2 = 2;
            if (wg.a(var9Lifetime2, 0)) {
              var10Lifetime1 = sh.field_qb.c((byte) -45);
              sh.field_qb.field_l = 0;
              if (wg.a(var10Lifetime1, 0)) {
                var11 = jf.field_b.length;
                for (var12 = 0; var12 < var11; var12++) {
                  jf.field_b[var12] = sh.field_qb.i(15070);
                }
                tn.a(false);
                fh.field_e = false;
                stackIn_43_0 = 100 + var11;
                return stackIn_43_0;
              }
            }
          }
          if (!param3) {
            field_c = (int[]) null;
          }
          if (k.field_a == ug.field_a &&
            ic.c((byte) 48)) {
            if (255 != ci.field_q) {
              ld.field_g = sh.field_qb.h(-118);
            } else {
              var9_ref_String = sh.field_qb.f(123);
              if (var9_ref_String != null) {
                jd.a(-51, var9_ref_String, mb.g((byte) 37));
              }
            }
            tn.a(false);
            fh.field_e = false;
            stackIn_54_0 = ci.field_q;
            return stackIn_54_0;
          }
          if (oj.field_Ub == null) {
            if (fh.field_e) {
              if (30000L >= af.b(-126)) {
                ld.field_g = ll.field_a;
              } else {
                ld.field_g = wa.field_L;
              }
              fh.field_e = false;
              stackIn_62_0 = 249;
              return stackIn_62_0;
            }
            var9Lifetime3 = uh.field_b;
            uh.field_b = tn.field_i;
            tn.field_i = var9Lifetime3;
            fh.field_e = true;
          }
          stackIn_65_0 = -1;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("wh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param5 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -23862) {
          field_b = (rm[]) null;
        }
    }

    abstract byte[] b(int param0);

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_120_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = param2;
        if (0 != var3) {
          if (var3 == 24) {
            var3 = param1 ? 1 : 0;
            gb.a(-2, 0, var3 != 0, -3);
            ka.a(false, (byte) 87);
          } else {
            if (var3 != 1) {
              if (2 == var3) {
                vm.$cfr$intArgs$a$45c25716b3df(30, af.field_k);
                ec.field_z = ai.field_c;
                em.field_c = kg.field_a;
                jk.field_c = 2;
                ka.a(false, (byte) 87);
                var3 = param1 ? 1 : 0;
                gb.a(-2, 0, var3 != 0, -1);
              } else {
                if (var3 == 7) {
                  vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
                  var3 = param1 ? 1 : 0;
                  var4 = bd.field_e;
                  if (0 == hm.field_c ||
                    i.field_y == 2 ||
                    3 == i.field_y ||
                    hm.field_c == 4 ||
                    hm.field_c == 5) {
                    var4 = hm.field_c;
                  }
                  gb.a(-2, var4, var3 != 0, 0);
                } else {
                  if (var3 != 3) {
                    if (var3 != 5) {
                      if (var3 == 8) {
                        if (i.field_y != 10) {
                          vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
                          var3 = bd.field_e;
                          var4 = param1 ? 1 : 0;
                          var5 = bd.field_e;
                          if (0 == hm.field_c ||
                            2 == i.field_y ||
                            i.field_y == 3 ||
                            hm.field_c == 4 ||
                            hm.field_c == 5) {
                            var5 = hm.field_c;
                          }
                          gb.a(-2, var5, var4 != 0, var3);
                        } else {
                          el.a(12229, param1);
                        }
                      } else {
                        if (var3 != 4) {
                          if (var3 != 14 &&
                            var3 != 15 &&
                            16 != var3 &&
                            var3 != 17 &&
                            var3 != 28 &&
                            var3 != 25 &&
                            var3 != 26 &&
                            var3 != 27) {
                            if (6 != var3) {
                              if (9 == var3) {
                                ka.a(true, (byte) 87);
                                vm.field_e = false;
                                th.field_q = true;
                                vg.field_I.a((byte) -70, param1);
                              } else {
                                if (10 != var3) {
                                  if (var3 == 11) {
                                    vg.field_I.b((byte) -45);
                                    var3 = param1 ? 1 : 0;
                                    gb.a(-2, 0, var3 != 0, -1);
                                  } else {
                                    if (var3 == 18) {
                                      vg.field_I.a((byte) 70);
                                      var3 = param1 ? 1 : 0;
                                      gb.a(-2, 0, var3 != 0, -1);
                                    } else {
                                      if (var3 != 19) {
                                        if (var3 == 12) {
                                          ka.a(true, (byte) 87);
                                          if (dd.field_a) {
                                            var3 = param1 ? 1 : 0;
                                            var4 = bd.field_e;
                                            if (hm.field_c == 0 ||
                                              2 == i.field_y ||
                                              i.field_y == 3 ||
                                              hm.field_c == 4 ||
                                              hm.field_c == 5) {
                                              var4 = hm.field_c;
                                            }
                                            gb.a(-2, var4, var3 != 0, -5);
                                          }
                                          if (on.field_d) {
                                            sb.a(0, 11, param0 + 12440);
                                          }
                                        } else {
                                          if (20 == var3) {
                                            uk.field_c = 0;
                                          } else {
                                            if (21 != var3) {
                                              if (var3 != 22) {
                                                if (var3 != 13) {
                                                  if (var3 == 23) {
                                                    vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
                                                    var3 = param1 ? 1 : 0;
                                                    var4 = bd.field_e;
                                                    if (hm.field_c == 0 ||
                                                      i.field_y == 2 ||
                                                      i.field_y == 3 ||
                                                      4 == hm.field_c ||
                                                      hm.field_c == 5) {
                                                      var4 = hm.field_c;
                                                    }
                                                    gb.a(-2, var4, var3 != 0, 1);
                                                  }
                                                } else {
                                                  ha.a((byte) 39, mb.g((byte) -125));
                                                }
                                              } else {
                                                a.field_D = false;
                                                if (i.field_y == 8 ||
                                                  i.field_y == 6) {
                                                  gn.a((byte) 86, qe.field_l, i.field_y);
                                                }
                                              }
                                            } else {
                                              uk.field_c = 1;
                                            }
                                          }
                                        }
                                      } else {
                                        vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
                                        stackIn_120_0 = (nf.field_g == 0) ? 1 : 0;
                                        pg.field_g = stackIn_120_0;
                                      }
                                    }
                                  }
                                } else {
                                  vg.field_I.c(param0 - 2035);
                                  var3 = param1 ? 1 : 0;
                                  gb.a(-2, 0, var3 != 0, -1);
                                }
                              }
                            } else {
                              if (null != ih.field_b) {
                                am.a((byte) -16);
                              } else {
                                var3 = param1 ? 1 : 0;
                                a.field_D = false;
                                ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_A + hd.field_b.field_G, 8, -16824, var3 != 0, 240);
                              }
                            }
                          }
                        } else {
                          vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
                          var3 = param1 ? 1 : 0;
                          var4 = bd.field_e;
                          if (0 == hm.field_c ||
                            i.field_y == 2 ||
                            3 == i.field_y ||
                            4 == hm.field_c ||
                            5 == hm.field_c) {
                            var4 = hm.field_c;
                          }
                          gb.a(-2, var4, var3 != 0, 6);
                        }
                      }
                    } else {
                      vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
                      pg.field_g = 0;
                      var3 = param1 ? 1 : 0;
                      var4 = bd.field_e;
                      if (hm.field_c == 0 ||
                        i.field_y == 2 ||
                        3 == i.field_y ||
                        hm.field_c == 4 ||
                        hm.field_c == 5) {
                        var4 = hm.field_c;
                      }
                      gb.a(param0 ^ -2096, var4, var3 != 0, 7);
                    }
                  } else {
                    vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
                    var3 = param1 ? 1 : 0;
                    var4 = bd.field_e;
                    if (hm.field_c == 0 ||
                      i.field_y == 2 ||
                      i.field_y == 3 ||
                      hm.field_c == 4 ||
                      5 == hm.field_c) {
                      var4 = hm.field_c;
                    }
                    gb.a(param0 ^ -2096, var4, var3 != 0, 8);
                  }
                }
              }
            } else {
              vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
              if (!qm.i(20)) {
                var3 = param1 ? 1 : 0;
                var4 = bd.field_e;
                if (hm.field_c == 0 ||
                  2 == i.field_y ||
                  i.field_y == 3 ||
                  4 == hm.field_c ||
                  5 == hm.field_c) {
                  var4 = hm.field_c;
                }
                gb.a(-2, var4, var3 != 0, -4);
              } else {
                a.field_D = false;
                stackIn_58_0 = (!qm.i(20)) ? 1 : 0;
                var3 = stackIn_58_0;
                hk.a(8, 2, var3, 320, 8, hd.field_b.field_A, true, 240, ib.field_b, (byte) 118, ib.field_b, param1, hd.field_b.field_A + hd.field_b.field_G, he.field_cc, mc.field_b);
              }
            }
          }
        } else {
          vm.$cfr$intArgs$a$45c25716b3df(30, ih.field_d);
          var3 = param1 ? 1 : 0;
          var4 = bd.field_e;
          if (hm.field_c == 0 ||
            i.field_y == 2 ||
            3 == i.field_y ||
            hm.field_c == 4 ||
            5 == hm.field_c) {
            var4 = hm.field_c;
          }
          gb.a(-2, var4, var3 != 0, 11);
        }
        if (param0 != 2094) {
          field_c = (int[]) null;
        }
    }

    static {
    }
}
