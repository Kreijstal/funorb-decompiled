/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class n {
    static boolean field_e;
    static jp field_c;
    static boolean field_d;
    static String field_b;
    static String field_a;

    final static void a(int param0, gb param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (mm.field_Sb <= var2_int) {
                    int dupTemp$4 = param1.a(true);
                    il.field_B[dupTemp$4] = il.field_B[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (mm.field_Sb <= var3) {
                        mm.field_Sb = var2_int;
                        int fieldTemp$5 = mm.field_Sb;
                        mm.field_Sb = mm.field_Sb + 1;
                        jk.field_s[fieldTemp$5] = param1;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param1.field_c == jk.field_s[var3].field_c) {
                              var4 = jk.field_s[var3].a(true);
                              if (eh.field_k >= il.field_B[var4]) {
                                break L5;
                              } else {
                                il.field_B[var4] = il.field_B[var4] - 1;
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          jk.field_s[incrementValue$6] = jk.field_s[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param1.field_c != jk.field_s[var2_int].field_c) {
                        break L6;
                      } else {
                        int dupTemp$7 = jk.field_s[var2_int].a(true);
                        il.field_B[dupTemp$7] = il.field_B[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                il.field_B[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("n.C(").append(0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final static void a(int param0) {
        try {
            if (go.field_a != null) {
                try {
                    go.field_a.a(0, 0L);
                    go.field_a.a(jl.field_e.field_k, jl.field_e.field_l, 24, -1);
                } catch (Exception exception) {
                }
            }
            jl.field_e.field_l = jl.field_e.field_l + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static jp a() {
        int var4_int = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var1 = jh.field_b[0] * gg.field_t[0];
        byte[] var2 = cn.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = qp.field_c[ik.a(255, (int) var2[var4_int])];
        }
        jp var4 = new jp(cf.field_d, ek.field_db, ag.field_K[0], dl.field_d[0], jh.field_b[0], gg.field_t[0], var3);
        int discarded$0 = 96;
        ee.d();
        return var4;
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -26774) {
          L0: {
            L1: {
              if (this == (Object) (Object) rq.field_c) {
                break L1;
              } else {
                if (this == (Object) (Object) fo.field_g) {
                  break L1;
                } else {
                  if (this != (Object) (Object) q.field_i) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    public static void b() {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        mh var5 = null;
        mh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        mh var15 = null;
        String var16 = null;
        mh var17 = null;
        int stackIn_13_0 = 0;
        mh stackIn_27_0 = null;
        mh stackIn_28_0 = null;
        mh stackIn_29_0 = null;
        String stackIn_29_1 = null;
        mh stackIn_30_0 = null;
        mh stackIn_31_0 = null;
        mh stackIn_32_0 = null;
        String stackIn_32_1 = null;
        String stackIn_57_0 = null;
        mh stackIn_66_0 = null;
        mh stackIn_67_0 = null;
        mh stackIn_68_0 = null;
        mh stackIn_69_0 = null;
        mh stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        mh stackIn_71_0 = null;
        mh stackIn_72_0 = null;
        mh stackIn_73_0 = null;
        mh stackIn_74_0 = null;
        mh stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        mh stackIn_76_0 = null;
        mh stackIn_77_0 = null;
        mh stackIn_78_0 = null;
        mh stackIn_79_0 = null;
        mh stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        String stackOut_56_0 = null;
        String stackOut_55_0 = null;
        mh stackOut_26_0 = null;
        mh stackOut_28_0 = null;
        String stackOut_28_1 = null;
        mh stackOut_27_0 = null;
        String stackOut_27_1 = null;
        mh stackOut_29_0 = null;
        mh stackOut_31_0 = null;
        String stackOut_31_1 = null;
        mh stackOut_30_0 = null;
        String stackOut_30_1 = null;
        mh stackOut_65_0 = null;
        mh stackOut_66_0 = null;
        mh stackOut_67_0 = null;
        mh stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        mh stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        mh stackOut_70_0 = null;
        mh stackOut_71_0 = null;
        mh stackOut_72_0 = null;
        mh stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        mh stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        mh stackOut_75_0 = null;
        mh stackOut_76_0 = null;
        mh stackOut_77_0 = null;
        mh stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        mh stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              co.a(pe.field_j, false);
              if (nl.field_f != null) {
                L2: {
                  L3: {
                    var15 = pf.field_h;
                    var17 = var15;
                    pf.field_h.field_cb = 0;
                    var17.field_Ib = 0;
                    var5 = dn.field_K;
                    dn.field_K.field_cb = 0;
                    var5.field_Ib = 0;
                    var6 = ke.field_e;
                    ke.field_e.field_cb = 0;
                    var6.field_Ib = 0;
                    ba.field_v.field_Mb = pg.field_n.toUpperCase();
                    var7 = (ak.field_d.field_Ib + 2) / 2;
                    ke.field_e.a(40, -40 + ak.field_d.field_cb, 0, var7 + -2, (byte) 64);
                    dn.field_K.a(40, ak.field_d.field_cb - 40, var7, ak.field_d.field_Ib - var7, (byte) 64);
                    if (1 != w.field_n.length) {
                      break L3;
                    } else {
                      if (w.field_n[0] == 2) {
                        var8 = 0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var10 >= w.field_n.length) {
                        break L5;
                      } else {
                        L6: {
                          if ((rh.field_d[var10 / 8] & 1 << (7 & var10)) == 0) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L6;
                          } else {
                            stackOut_11_0 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_13_0;
                          if (var11_int != 0) {
                            var9_int++;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (w.field_n[var10] != 2) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (var9_int == 0) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                dn.field_K.field_eb = true;
                if (fh.field_d) {
                  L9: {
                    ij.field_e.field_eb = false;
                    t.field_f.field_Mb = gh.field_a;
                    if (var8 != 0) {
                      stackOut_56_0 = nj.field_F;
                      stackIn_57_0 = stackOut_56_0;
                      break L9;
                    } else {
                      stackOut_55_0 = cb.field_l;
                      stackIn_57_0 = stackOut_55_0;
                      break L9;
                    }
                  }
                  L10: {
                    var16 = stackIn_57_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = ke.field_e.field_O.c(var16) + ke.field_e.field_O.a('.') * 3;
                    ke.field_e.field_S = 0;
                    if (16 != (an.field_h & 48)) {
                      break L10;
                    } else {
                      var9 = var16 + ".";
                      break L10;
                    }
                  }
                  L11: {
                    ke.field_e.field_V = (-var10 + ke.field_e.field_Ib) / 2;
                    if ((48 & an.field_h) == 32) {
                      var9 = var9 + "..";
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if ((an.field_h & 48) != 48) {
                      break L12;
                    } else {
                      var9 = var9 + "...";
                      break L12;
                    }
                  }
                  ke.field_e.field_Mb = var9;
                  dn.field_K.field_Mb = wl.field_L.toUpperCase();
                  break L1;
                } else {
                  L13: {
                    stackOut_26_0 = dn.field_K;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (var8 == 0) {
                      stackOut_28_0 = (mh) (Object) stackIn_28_0;
                      stackOut_28_1 = cc.field_F;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L13;
                    } else {
                      stackOut_27_0 = (mh) (Object) stackIn_27_0;
                      stackOut_27_1 = ag.field_J;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L13;
                    }
                  }
                  L14: {
                    stackIn_29_0.field_Mb = ((String) (Object) stackIn_29_1).toUpperCase();
                    stackOut_29_0 = t.field_f;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (var8 == 0) {
                      stackOut_31_0 = (mh) (Object) stackIn_31_0;
                      stackOut_31_1 = go.field_f;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L14;
                    } else {
                      stackOut_30_0 = (mh) (Object) stackIn_30_0;
                      stackOut_30_1 = ma.field_G;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_32_0.field_Mb = rd.a(stackIn_32_1, new String[1], (byte) 103);
                    dc.field_g = true;
                    ke.field_e.field_Mb = mp.field_Pb;
                    ij.field_e.field_eb = true;
                    if (br.field_bc == null) {
                      break L15;
                    } else {
                      L16: {
                        if (null == qo.field_J) {
                          qo.field_J = new byte[cq.field_p];
                          h.field_D = new boolean[cq.field_p];
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      lk.field_s = false;
                      dc.field_g = false;
                      var13 = 0;
                      var9_int = var13;
                      L17: while (true) {
                        if (cq.field_p <= var13) {
                          ar.a(true, nl.field_f, -1, -1, -1, 0, cq.field_p, 0);
                          if (kb.field_Yb < 2) {
                            break L15;
                          } else {
                            if (!pe.field_l[12]) {
                              break L15;
                            } else {
                              dc.field_g = true;
                              break L15;
                            }
                          }
                        } else {
                          h.field_D[var13] = false;
                          var13++;
                          continue L17;
                        }
                      }
                    }
                  }
                  if (!dc.field_g) {
                    dn.field_K.field_eb = false;
                    if (!dn.field_K.field_G) {
                      break L1;
                    } else {
                      L18: {
                        var9 = null;
                        if (lk.field_s) {
                          var9 = "<col=A00000>" + og.field_ac + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (var10 >= cq.field_p) {
                          ep.field_e = "<col=A00000>" + pf.field_a + "<br>" + bl.field_G + var9;
                          break L1;
                        } else {
                          L20: {
                            if (!h.field_D[var10]) {
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          var10++;
                          continue L19;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackOut_65_0 = qa.field_w;
                stackIn_69_0 = stackOut_65_0;
                stackIn_66_0 = stackOut_65_0;
                if (!param1) {
                  break L22;
                } else {
                  stackOut_66_0 = (mh) (Object) stackIn_66_0;
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_67_0 = stackOut_66_0;
                  if (param2) {
                    break L22;
                  } else {
                    stackOut_67_0 = (mh) (Object) stackIn_67_0;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_68_0 = stackOut_67_0;
                    if (hc.field_c) {
                      break L22;
                    } else {
                      stackOut_68_0 = (mh) (Object) stackIn_68_0;
                      stackOut_68_1 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      break L21;
                    }
                  }
                }
              }
              stackOut_69_0 = (mh) (Object) stackIn_69_0;
              stackOut_69_1 = 0;
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              break L21;
            }
            L23: {
              L24: {
                ((mh) (Object) stackIn_70_0).a(stackIn_70_1 != 0, -15211);
                stackOut_70_0 = ak.field_d;
                stackIn_74_0 = stackOut_70_0;
                stackIn_71_0 = stackOut_70_0;
                if (!param1) {
                  break L24;
                } else {
                  stackOut_71_0 = (mh) (Object) stackIn_71_0;
                  stackIn_74_0 = stackOut_71_0;
                  stackIn_72_0 = stackOut_71_0;
                  if (param2) {
                    break L24;
                  } else {
                    stackOut_72_0 = (mh) (Object) stackIn_72_0;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_73_0 = stackOut_72_0;
                    if (hc.field_c) {
                      break L24;
                    } else {
                      stackOut_73_0 = (mh) (Object) stackIn_73_0;
                      stackOut_73_1 = 1;
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      break L23;
                    }
                  }
                }
              }
              stackOut_74_0 = (mh) (Object) stackIn_74_0;
              stackOut_74_1 = 0;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              break L23;
            }
            L25: {
              L26: {
                ((mh) (Object) stackIn_75_0).a(stackIn_75_1 != 0, -15211);
                stackOut_75_0 = wi.field_j;
                stackIn_79_0 = stackOut_75_0;
                stackIn_76_0 = stackOut_75_0;
                if (!param1) {
                  break L26;
                } else {
                  stackOut_76_0 = (mh) (Object) stackIn_76_0;
                  stackIn_79_0 = stackOut_76_0;
                  stackIn_77_0 = stackOut_76_0;
                  if (param2) {
                    break L26;
                  } else {
                    stackOut_77_0 = (mh) (Object) stackIn_77_0;
                    stackIn_79_0 = stackOut_77_0;
                    stackIn_78_0 = stackOut_77_0;
                    if (!hc.field_c) {
                      break L26;
                    } else {
                      stackOut_78_0 = (mh) (Object) stackIn_78_0;
                      stackOut_78_1 = 1;
                      stackIn_80_0 = stackOut_78_0;
                      stackIn_80_1 = stackOut_78_1;
                      break L25;
                    }
                  }
                }
              }
              stackOut_79_0 = (mh) (Object) stackIn_79_0;
              stackOut_79_1 = 0;
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              break L25;
            }
            L27: {
              ((mh) (Object) stackIn_80_0).a(stackIn_80_1 != 0, -15211);
              sb.field_c.field_d.i(0);
              if (nl.field_f != null) {
                L28: {
                  if (ij.field_e.field_L != 0) {
                    ef.a(-22809, param0);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (dn.field_K.field_L != 0) {
                    if (!fh.field_d) {
                      jk.a(param0, (byte) 98);
                      break L29;
                    } else {
                      um.a(200, param0);
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
                ip.a(param0, nl.field_f, true, false);
                break L27;
              } else {
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "n.D(" + param0 + ',' + param1 + ',' + param2 + ',' + -76 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have entered another game.";
        field_a = "Name";
    }
}
