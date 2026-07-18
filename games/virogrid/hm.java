/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hm {
    static int field_c;
    static String field_b;
    static String field_a;

    abstract long a(byte param0);

    final static r a() {
        return hd.field_g;
    }

    final static boolean a(String param0, long param1, int param2) {
        gh var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var4 = j.a(0, param0);
              if (param2 == -24236) {
                break L1;
              } else {
                hm.a(false, false);
                break L1;
              }
            }
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                if (null != var4.field_Pb) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (wl.field_d == null) {
                  break L4;
                } else {
                  if (null == ic.a(param1, (byte) -127)) {
                    break L4;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("hm.N(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void c() {
        Object var2 = null;
        nd.a((byte) 40, de.field_sb, (String) null);
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 0 / ((param0 - -49) / 54);
        field_b = null;
    }

    abstract void d(int param0);

    final static void a(boolean param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        km var7 = null;
        int var7_int = 0;
        int var8 = 0;
        km var8_ref_km = null;
        int var9 = 0;
        hk var9_ref_hk = null;
        int var10 = 0;
        hk var10_ref_hk = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        km stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        km stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        km stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        km stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        km stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        km stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              f.field_b = df.field_f;
              if (param1) {
                break L1;
              } else {
                boolean discarded$1 = hm.a((String) null, 18L, 31);
                break L1;
              }
            }
            L2: {
              eb.field_f = df.field_e;
              if (param0) {
                stackOut_5_0 = hn.field_h;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = th.field_z;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              rf.a(stackIn_6_0, -4);
              he.field_pc.a(36, 0, 0, -2 + ao.field_Eb.field_ub - 40, ao.field_Eb.field_K);
              qh.field_R.a(0, pg.field_e, ia.field_d.field_K, (byte) -52, 0);
              stackOut_6_0 = kh.field_g;
              stackOut_6_1 = 0;
              stackOut_6_2 = 18;
              stackOut_6_3 = ia.field_d.field_K;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              if (!ql.field_d) {
                stackOut_8_0 = (km) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                stackIn_9_4 = stackOut_8_4;
                break L3;
              } else {
                stackOut_7_0 = (km) (Object) stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = 4 + (oc.field_k + 40);
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                stackIn_9_3 = stackOut_7_3;
                stackIn_9_4 = stackOut_7_4;
                break L3;
              }
            }
            L4: {
              ((km) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3 + -stackIn_9_4, (byte) -105, 2 + pg.field_e);
              gn.field_F.a(-oc.field_k + (ia.field_d.field_K + -42), 18, 42 - -oc.field_k, (byte) -107, 2 + pg.field_e);
              wm.field_r.a(2 + pg.field_e - -20, -114, ia.field_d.field_K, 2, -pg.field_e + (ia.field_d.field_ub - 22), 0, oc.field_k);
              fb.field_o.a(0, 40, ao.field_Eb.field_K, (byte) -120, -40 + ao.field_Eb.field_ub);
              qi.field_e.a(0, 30, dm.field_r.field_K, (byte) -57, 0);
              nn.field_b.a(0, -30 + dm.field_r.field_ub - 42, dm.field_r.field_K, (byte) -118, 30);
              var2_int = vb.field_h + 3;
              if (vj.field_b.length < 2) {
                var2_int--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0) {
                var2_int--;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var3 = ((var2_int + 1) / 2 + (-13 + (nn.field_b.field_ub - 5))) / (1 + var2_int) - 2;
              if (var3 > 30) {
                var3 = 30;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var4 = -5 + (nn.field_b.field_ub + -5 + -(var2_int * (var3 + 2)));
              if (var4 > 40) {
                var4 = 40;
                break L7;
              } else {
                break L7;
              }
            }
            qa.field_c.a(5, var4, -5 + nn.field_b.field_K - 5, (byte) -92, 5);
            var5 = 2 + var4 + 5;
            var6 = 0;
            L8: while (true) {
              if (var6 >= vb.field_h + 4) {
                pm.field_n.a(df.field_e + -360 >> 1, -130 + (df.field_f + -14), 360, (byte) -97, 10);
                jj.field_m.a(0, 24, pm.field_n.field_K, (byte) -69, 0);
                jb.field_J.a(0, -24 + pm.field_n.field_ub, pm.field_n.field_K, (byte) -77, 24);
                jb.field_J.field_vb = ne.a(jb.field_J.field_ub, 3, 1, (byte) 106, 8421504, 11579568);
                ij.field_m.a(5, jb.field_J.field_ub - 36, -10 + jb.field_J.field_K, (byte) -120, 5);
                na.field_Ib.a((-80 + jb.field_J.field_K) / 2, 24, 80, (byte) -117, -24 + jb.field_J.field_ub - 5);
                rc.d(-20);
                break L0;
              } else {
                L9: {
                  L10: {
                    if (var6 != 1) {
                      break L10;
                    } else {
                      if (vj.field_b.length >= 2) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    if (var6 != 3) {
                      break L11;
                    } else {
                      if (qi.field_f > 1) {
                        break L11;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L12: {
                    if (param0) {
                      break L12;
                    } else {
                      if (3 == var6) {
                        var7 = f.field_f[var6];
                        f.field_f[var6].field_ub = 0;
                        var7.field_K = 0;
                        var8 = 0;
                        L13: while (true) {
                          if (var8 >= oe.field_b[var6].length) {
                            break L9;
                          } else {
                            L14: {
                              if (null == oe.field_b[var6][var8]) {
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            var8++;
                            continue L13;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  L15: {
                    if (!param0) {
                      break L15;
                    } else {
                      if (var6 != 0) {
                        break L15;
                      } else {
                        var7 = f.field_f[var6];
                        f.field_f[var6].field_ub = 0;
                        var7.field_K = 0;
                        var8 = 0;
                        L16: while (true) {
                          if (var8 >= oe.field_b[var6].length) {
                            break L9;
                          } else {
                            L17: {
                              if (oe.field_b[var6][var8] != null) {
                                var9_ref_hk = oe.field_b[var6][var8];
                                oe.field_b[var6][var8].field_ub = 0;
                                var9_ref_hk.field_K = 0;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            var8++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  L18: {
                    if (param0) {
                      if (var6 >= 4) {
                        if (null != je.field_J) {
                          if (je.field_J[var6 + -4]) {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            break L18;
                          } else {
                            stackOut_47_0 = 0;
                            stackIn_50_0 = stackOut_47_0;
                            break L18;
                          }
                        } else {
                          stackOut_45_0 = 0;
                          stackIn_50_0 = stackOut_45_0;
                          break L18;
                        }
                      } else {
                        stackOut_43_0 = 0;
                        stackIn_50_0 = stackOut_43_0;
                        break L18;
                      }
                    } else {
                      stackOut_41_0 = 0;
                      stackIn_50_0 = stackOut_41_0;
                      break L18;
                    }
                  }
                  var7_int = stackIn_50_0;
                  if (var7_int == 0) {
                    L19: {
                      f.field_f[var6].a(5, var3, 103, (byte) -58, var5);
                      var8 = 110;
                      if (!param0) {
                        if (oe.field_b[var6][0] == null) {
                          break L19;
                        } else {
                          var9_ref_hk = oe.field_b[var6][0];
                          oe.field_b[var6][0].field_ub = 0;
                          var9_ref_hk.field_K = 0;
                          break L19;
                        }
                      } else {
                        oe.field_b[var6][0].a(38, var8, 2, var5, dl.field_b, var3, 2);
                        var8 += 40;
                        break L19;
                      }
                    }
                    var9 = -5 + dm.field_r.field_K + (-var8 + 2);
                    var10 = oe.field_b[var6].length - 1;
                    var11 = 0;
                    L20: while (true) {
                      if (var10 <= var11) {
                        var5 = var5 + (var3 + 2);
                        break L9;
                      } else {
                        var12 = var11 * var9 / var10;
                        oe.field_b[var6][1 + var11].a(var9 * (var11 + 1) / var10 + (-2 + -var12), var8 - -var12, 2, var5, dl.field_b, var3, 2);
                        var11++;
                        continue L20;
                      }
                    }
                  } else {
                    var8_ref_km = f.field_f[var6];
                    f.field_f[var6].field_ub = 0;
                    var8_ref_km.field_K = 0;
                    var9 = 0;
                    L21: while (true) {
                      if (var9 >= oe.field_b[var6].length) {
                        break L9;
                      } else {
                        L22: {
                          if (null != oe.field_b[var6][var9]) {
                            var10_ref_hk = oe.field_b[var6][var9];
                            oe.field_b[var6][var9].field_ub = 0;
                            var10_ref_hk.field_K = 0;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        var9++;
                        continue L21;
                      }
                    }
                  }
                }
                var6++;
                continue L8;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "hm.L(" + param0 + ',' + param1 + ')');
        }
    }

    abstract int a(byte param0, long param1);

    final int a(int param0, long param1) {
        long var4 = ((hm) this).a((byte) -84);
        if (!(var4 <= 0L)) {
            mm.a(-17, var4);
        }
        if (param0 != 16680) {
            return 113;
        }
        return ((hm) this).a((byte) -103, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Password: ";
        field_a = "Remove friend";
    }
}
