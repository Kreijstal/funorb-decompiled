/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static int field_b;
    static bd[][] field_a;
    static String field_c;

    final static void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        en var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hm var12 = null;
        ri var13 = null;
        en var14 = null;
        ri var15 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = sc.field_g;
              if (param0 == -20785) {
                break L1;
              } else {
                lb.a(107);
                break L1;
              }
            }
            L2: {
              var2 = var14.l(32270);
              if (0 == var2) {
                var11 = nf.a(false);
                var3 = var11;
                var10 = var11;
                var4 = var10;
                var5 = var14;
                var6 = ((vi) ((Object) var5)).l(32270);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6) {
                    var13 = (ri) ((Object) ei.field_h.g(-63));
                    if (var13 != null) {
                      var13.field_j = var3;
                      var13.field_l = true;
                      var13.b(111);
                      break L2;
                    } else {
                      le.c((byte) 53);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    var10[var7] = ((vi) ((Object) var5)).d(8195);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                if (var2 != 1) {
                  if ((var2 ^ -1) == -3) {
                    var15 = (ri) ((Object) ei.field_h.g(param0 ^ 20755));
                    if (var15 != null) {
                      var15.field_j = nf.a(false);
                      var15.field_l = true;
                      var15.b(param0 ^ 20777);
                      break L2;
                    } else {
                      le.c((byte) 66);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    ic.a((byte) -118, "A1: " + gf.a((byte) -125), (Throwable) null);
                    le.c((byte) 78);
                    break L2;
                  }
                } else {
                  var12 = (hm) ((Object) ih.field_x.g(-117));
                  if (var12 == null) {
                    le.c((byte) 81);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var12.b(-76);
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "lb.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -16182) {
            return;
        }
        field_a = (bd[][]) null;
    }

    final static int a(int param0, byte param1, s param2, boolean param3, s param4, String param5, int param6) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        vi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        vi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        vi stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        vi stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_18_2 = null;
        int stackIn_36_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var14 = param2.a(16751324);
            var11_ref_String = var14;
            if (param1 > 123) {
              L1: {
                var8 = param4.a(16751324);
                var11_ref_String = var8;
                var11_ref_String = var8;
                if (null == ag.field_t) {
                  if (!me.a(false, 96)) {
                    stackIn_9_0 = -1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (sa.field_c != rc.field_a) {
                  break L2;
                } else {
                  L3: {
                    ii.field_h = null;
                    s.field_b.field_i = 0;
                    if (param5 != null) {
                      L4: {
                        var9 = 0;
                        ob.field_s.field_i = 0;
                        if (!param3) {
                          break L4;
                        } else {
                          var9 = var9 | 1;
                          break L4;
                        }
                      }
                      L5: {
                        ob.field_s.b(jk.field_b.nextInt(), 25251);
                        ob.field_s.b(jk.field_b.nextInt(), 25251);
                        ob.field_s.a(110, var14);
                        ob.field_s.a(110, var8);
                        var15 = (CharSequence) ((Object) param5);
                        ob.field_s.a(83, jk.a((byte) 104, var15));
                        ob.field_s.a((byte) -121, param0);
                        ob.field_s.d(81, param6);
                        ob.field_s.d(88, var9);
                        s.field_b.d(94, 18);
                        s.field_b.field_i = s.field_b.field_i + 2;
                        var10 = s.field_b.field_i;
                        var11_ref_String = de.a(-120, bn.c(-1));
                        if (var11_ref_String != null) {
                          break L5;
                        } else {
                          var11_ref_String = "";
                          break L5;
                        }
                      }
                      s.field_b.a(var11_ref_String, 0);
                      ml.a(s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
                      s.field_b.a(true, s.field_b.field_i + -var10);
                      break L3;
                    } else {
                      L6: {
                        ob.field_s.field_i = 0;
                        ob.field_s.b(jk.field_b.nextInt(), 25251);
                        ob.field_s.b(jk.field_b.nextInt(), 25251);
                        stackIn_14_0 = ob.field_s;

                        stackIn_14_1 = 124;

                        if (param2.a((byte) -80)) {
                          stackIn_15_0 = (vi) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = (String) (var14);
                          break L6;
                        } else {
                          stackIn_15_0 = (vi) ((Object) stackIn_14_0);
                          stackIn_15_1 = stackIn_14_1;
                          stackIn_15_2 = "";
                          break L6;
                        }
                      }
                      L7: {
                        ((vi) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                        stackIn_17_0 = ob.field_s;

                        stackIn_17_1 = 36;

                        if (param4.a((byte) -80)) {
                          stackIn_18_0 = (vi) ((Object) stackIn_17_0);
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = (String) (var8);
                          break L7;
                        } else {
                          stackIn_18_0 = (vi) ((Object) stackIn_17_0);
                          stackIn_18_1 = stackIn_17_1;
                          stackIn_18_2 = "";
                          break L7;
                        }
                      }
                      ((vi) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2);
                      s.field_b.d(86, 16);
                      s.field_b.field_i = s.field_b.field_i + 1;
                      var9 = s.field_b.field_i;
                      ml.a(s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
                      s.field_b.a(-var9 + s.field_b.field_i, -19720);
                      break L3;
                    }
                  }
                  mb.d(-1, -22370);
                  rc.field_a = re.field_r;
                  break L2;
                }
              }
              L8: {
                if (re.field_r == rc.field_a) {
                  if (!re.c((byte) 33, 1)) {
                    break L8;
                  } else {
                    L9: {
                      var9 = sc.field_g.l(32270);
                      sc.field_g.field_i = 0;
                      if ((var9 ^ -1) > -101) {
                        break L9;
                      } else {
                        if (105 >= var9) {
                          ea.field_a = new String[var9 + -100];
                          rc.field_a = gj.field_b;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((var9 ^ -1) == -249) {
                      cj.a(bn.c(-1), 0);
                      km.field_x = sg.field_g;
                      le.c((byte) 119);
                      jn.field_C = false;
                      stackIn_36_0 = var9;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (99 == var9) {
                        re.c((byte) 33, ob.c((byte) -79));
                        ii.field_h = new Boolean(gn.a(0, sc.field_g));
                        sc.field_g.field_i = 0;
                        break L8;
                      } else {
                        rc.field_a = sj.field_c;
                        wa.field_k = var9;
                        jd.field_q = -1;
                        break L8;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              L10: {
                if (rc.field_a == gj.field_b) {
                  var9 = 2;
                  if (!re.c((byte) 33, var9)) {
                    break L10;
                  } else {
                    var10 = sc.field_g.e(8);
                    sc.field_g.field_i = 0;
                    if (!re.c((byte) 33, var10)) {
                      break L10;
                    } else {
                      var11 = ea.field_a.length;
                      var12 = 0;
                      L11: while (true) {
                        if (var12 >= var11) {
                          le.c((byte) 98);
                          jn.field_C = false;
                          stackIn_46_0 = var11 + 100;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          ea.field_a[var12] = sc.field_g.n(-31298);
                          var12++;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
              L12: {
                if (rc.field_a == sj.field_c) {
                  if (eb.a(13372)) {
                    L13: {
                      if (255 == wa.field_k) {
                        var9_ref_String = sc.field_g.a((byte) 28);
                        if (var9_ref_String != null) {
                          gb.a((byte) 98, bn.c(-1), var9_ref_String);
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        km.field_x = sc.field_g.o(32);
                        break L13;
                      }
                    }
                    le.c((byte) 84);
                    jn.field_C = false;
                    stackIn_57_0 = wa.field_k;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L14: {
                if (null != ag.field_t) {
                  break L14;
                } else {
                  if (jn.field_C) {
                    L15: {
                      if (-30001L <= (m.a(true) ^ -1L)) {
                        km.field_x = fl.field_d;
                        break L15;
                      } else {
                        km.field_x = od.field_H;
                        break L15;
                      }
                    }
                    jn.field_C = false;
                    stackIn_65_0 = 249;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    var9 = cb.field_c;
                    cb.field_c = fh.field_b;
                    jn.field_C = true;
                    fh.field_b = var9;
                    break L14;
                  }
                }
              }
              stackIn_67_0 = -1;
              decompiledRegionSelector0 = 6;
              break L0;
            } else {
              stackIn_3_0 = 6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("lb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L16;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L17;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param5 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L18;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L18;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_71_0), stackIn_77_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_36_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_46_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_57_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_65_0;
                  } else {
                    return stackIn_67_0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_c = "CLICK TO BEGIN";
    }
}
