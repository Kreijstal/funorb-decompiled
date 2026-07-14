/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static boolean field_e;
    static jp field_c;
    static boolean field_d;
    static String field_b;
    static String field_a;

    final static void a(int param0, gb param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (mm.field_Sb <= var2) {
                il.field_B[param1.a(true)] = il.field_B[param1.a(true)] + 1;
                var2 = param0;
                var3 = 0;
                L2: while (true) {
                  if (mm.field_Sb <= var3) {
                    mm.field_Sb = var2;
                    mm.field_Sb = mm.field_Sb + 1;
                    jk.field_s[mm.field_Sb] = param1;
                    return;
                  } else {
                    L3: {
                      if (param1.field_c == jk.field_s[var3].field_c) {
                        var4 = jk.field_s[var3].a(true);
                        if (eh.field_k >= il.field_B[var4]) {
                          break L3;
                        } else {
                          il.field_B[var4] = il.field_B[var4] - 1;
                          var3++;
                          continue L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    jk.field_s[var2] = jk.field_s[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param1.field_c == jk.field_s[var2].field_c) {
                  il.field_B[jk.field_s[var2].a(true)] = il.field_B[jk.field_s[var2].a(true)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            il.field_B[var2] = 0;
            var2++;
            continue L0;
          }
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
            if (param0 != -1) {
                field_a = null;
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

    final static jp a(byte param0) {
        int var4_int = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var1 = jh.field_b[0] * gg.field_t[0];
        if (param0 != 21) {
            n.b(-24);
        }
        byte[] var2 = cn.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = qp.field_c[ik.a(255, (int) var2[var4_int])];
        }
        jp var4 = new jp(cf.field_d, ek.field_db, ag.field_K[0], dl.field_d[0], jh.field_b[0], gg.field_t[0], var3);
        ee.d((byte) 96);
        return var4;
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0;
        int stackOut_6_0;
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

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -2) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, boolean param1, boolean param2, byte param3) {
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
        int stackIn_12_0 = 0;
        mh stackIn_27_0 = null;
        mh stackIn_28_0 = null;
        mh stackIn_29_0 = null;
        String stackIn_29_1 = null;
        mh stackIn_30_0 = null;
        mh stackIn_31_0 = null;
        mh stackIn_32_0 = null;
        String stackIn_32_1 = null;
        String stackIn_59_0 = null;
        mh stackIn_68_0 = null;
        mh stackIn_69_0 = null;
        mh stackIn_70_0 = null;
        mh stackIn_71_0 = null;
        mh stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        mh stackIn_73_0 = null;
        mh stackIn_74_0 = null;
        mh stackIn_75_0 = null;
        mh stackIn_76_0 = null;
        mh stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        mh stackIn_78_0 = null;
        mh stackIn_79_0 = null;
        mh stackIn_80_0 = null;
        mh stackIn_81_0 = null;
        mh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackOut_11_0;
        int stackOut_10_0;
        String stackOut_58_0;
        String stackOut_57_0;
        mh stackOut_26_0;
        mh stackOut_28_0;
        String stackOut_28_1;
        mh stackOut_27_0;
        String stackOut_27_1;
        mh stackOut_29_0;
        mh stackOut_31_0;
        String stackOut_31_1;
        mh stackOut_30_0;
        String stackOut_30_1;
        mh stackOut_67_0;
        mh stackOut_68_0;
        mh stackOut_69_0;
        mh stackOut_70_0;
        int stackOut_70_1;
        mh stackOut_71_0;
        int stackOut_71_1;
        mh stackOut_72_0;
        mh stackOut_73_0;
        mh stackOut_74_0;
        mh stackOut_75_0;
        int stackOut_75_1;
        mh stackOut_76_0;
        int stackOut_76_1;
        mh stackOut_77_0;
        mh stackOut_78_0;
        mh stackOut_79_0;
        mh stackOut_80_0;
        int stackOut_80_1;
        mh stackOut_81_0;
        int stackOut_81_1;
        var12 = BrickABrac.field_J ? 1 : 0;
        if (param3 == -76) {
          L0: {
            co.a(pe.field_j, false);
            if (nl.field_f != null) {
              L1: {
                L2: {
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
                    break L2;
                  } else {
                    if (-3 == (w.field_n[0] ^ -1)) {
                      var8 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var8 = 0;
                var9_int = 0;
                var10 = 0;
                L3: while (true) {
                  L4: {
                    if (var10 >= w.field_n.length) {
                      break L4;
                    } else {
                      L5: {
                        if ((rh.field_d[var10 / 8] & 1 << (7 & var10)) == 0) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L5;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L5;
                        }
                      }
                      L6: {
                        var11_int = stackIn_12_0;
                        if (var11_int != 0) {
                          var9_int++;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (var11_int != 0) {
                        if (w.field_n[var10] != 2) {
                          var8 = 1;
                          break L4;
                        } else {
                          var10++;
                          continue L3;
                        }
                      } else {
                        var10++;
                        continue L3;
                      }
                    }
                  }
                  if (var9_int == 0) {
                    var8 = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              dn.field_K.field_eb = true;
              if (fh.field_d) {
                L7: {
                  ij.field_e.field_eb = false;
                  t.field_f.field_Mb = gh.field_a;
                  if (var8 != 0) {
                    stackOut_58_0 = nj.field_F;
                    stackIn_59_0 = stackOut_58_0;
                    break L7;
                  } else {
                    stackOut_57_0 = cb.field_l;
                    stackIn_59_0 = stackOut_57_0;
                    break L7;
                  }
                }
                L8: {
                  var16 = (String) (Object) stackIn_59_0;
                  var9 = var16;
                  var9 = var16;
                  var9 = var16;
                  var10 = ke.field_e.field_O.c(var16) + ke.field_e.field_O.a('.') * 3;
                  ke.field_e.field_S = 0;
                  if (16 != (an.field_h & 48)) {
                    break L8;
                  } else {
                    var9 = var16 + ".";
                    break L8;
                  }
                }
                L9: {
                  ke.field_e.field_V = (-var10 + ke.field_e.field_Ib) / 2;
                  if ((48 & an.field_h ^ -1) == -33) {
                    var9 = var9 + "..";
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if ((an.field_h & 48) != 48) {
                    break L10;
                  } else {
                    var9 = var9 + "...";
                    break L10;
                  }
                }
                ke.field_e.field_Mb = var9;
                dn.field_K.field_Mb = wl.field_L.toUpperCase();
                break L0;
              } else {
                L11: {
                  stackOut_26_0 = dn.field_K;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (var8 == 0) {
                    stackOut_28_0 = (mh) (Object) stackIn_28_0;
                    stackOut_28_1 = cc.field_F;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L11;
                  } else {
                    stackOut_27_0 = (mh) (Object) stackIn_27_0;
                    stackOut_27_1 = ag.field_J;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    break L11;
                  }
                }
                L12: {
                  ((mh) (Object) stackIn_29_0).field_Mb = ((String) (Object) stackIn_29_1).toUpperCase();
                  stackOut_29_0 = t.field_f;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (var8 == 0) {
                    stackOut_31_0 = (mh) (Object) stackIn_31_0;
                    stackOut_31_1 = go.field_f;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    break L12;
                  } else {
                    stackOut_30_0 = (mh) (Object) stackIn_30_0;
                    stackOut_30_1 = ma.field_G;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    break L12;
                  }
                }
                L13: {
                  ((mh) (Object) stackIn_32_0).field_Mb = rd.a((String) (Object) stackIn_32_1, new String[1], (byte) 103);
                  dc.field_g = true;
                  ke.field_e.field_Mb = mp.field_Pb;
                  ij.field_e.field_eb = true;
                  if (br.field_bc == null) {
                    break L13;
                  } else {
                    L14: {
                      if (null == qo.field_J) {
                        qo.field_J = new byte[cq.field_p];
                        h.field_D = new boolean[cq.field_p];
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    lk.field_s = false;
                    dc.field_g = false;
                    var13 = 0;
                    var9_int = var13;
                    L15: while (true) {
                      if (cq.field_p <= var13) {
                        ar.a(true, nl.field_f, -1, -1, -1, 0, cq.field_p, 0);
                        if (-3 < (kb.field_Yb ^ -1)) {
                          break L13;
                        } else {
                          if (!pe.field_l[12]) {
                            break L13;
                          } else {
                            dc.field_g = true;
                            break L13;
                          }
                        }
                      } else {
                        h.field_D[var13] = false;
                        var13++;
                        continue L15;
                      }
                    }
                  }
                }
                if (!dc.field_g) {
                  dn.field_K.field_eb = false;
                  if (!dn.field_K.field_G) {
                    break L0;
                  } else {
                    L16: {
                      var9 = null;
                      if (lk.field_s) {
                        var9 = "<col=A00000>" + og.field_ac + "</col>";
                        var11 = var9;
                        var9 = var11;
                        var11 = var9;
                        var9 = var11;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= cq.field_p) {
                        ep.field_e = "<col=A00000>" + pf.field_a + "<br>" + bl.field_G + var9;
                        break L0;
                      } else {
                        if (h.field_D[var10]) {
                          var11 = "<col=A00000>" + rg.field_b[var10] + "</col>";
                          var9 = var11;
                          var9 = var11;
                          if (var9 == null) {
                            var9 = var11;
                            var10++;
                            continue L17;
                          } else {
                            var9 = var9 + ", " + var11;
                            var10++;
                            continue L17;
                          }
                        } else {
                          var10++;
                          continue L17;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L18: {
            L19: {
              stackOut_67_0 = qa.field_w;
              stackIn_71_0 = stackOut_67_0;
              stackIn_68_0 = stackOut_67_0;
              if (!param1) {
                break L19;
              } else {
                stackOut_68_0 = (mh) (Object) stackIn_68_0;
                stackIn_71_0 = stackOut_68_0;
                stackIn_69_0 = stackOut_68_0;
                if (param2) {
                  break L19;
                } else {
                  stackOut_69_0 = (mh) (Object) stackIn_69_0;
                  stackIn_71_0 = stackOut_69_0;
                  stackIn_70_0 = stackOut_69_0;
                  if (hc.field_c) {
                    break L19;
                  } else {
                    stackOut_70_0 = (mh) (Object) stackIn_70_0;
                    stackOut_70_1 = 1;
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    break L18;
                  }
                }
              }
            }
            stackOut_71_0 = (mh) (Object) stackIn_71_0;
            stackOut_71_1 = 0;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            break L18;
          }
          L20: {
            L21: {
              ((mh) (Object) stackIn_72_0).a(stackIn_72_1 != 0, -15211);
              stackOut_72_0 = ak.field_d;
              stackIn_76_0 = stackOut_72_0;
              stackIn_73_0 = stackOut_72_0;
              if (!param1) {
                break L21;
              } else {
                stackOut_73_0 = (mh) (Object) stackIn_73_0;
                stackIn_76_0 = stackOut_73_0;
                stackIn_74_0 = stackOut_73_0;
                if (param2) {
                  break L21;
                } else {
                  stackOut_74_0 = (mh) (Object) stackIn_74_0;
                  stackIn_76_0 = stackOut_74_0;
                  stackIn_75_0 = stackOut_74_0;
                  if (hc.field_c) {
                    break L21;
                  } else {
                    stackOut_75_0 = (mh) (Object) stackIn_75_0;
                    stackOut_75_1 = 1;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_77_1 = stackOut_75_1;
                    break L20;
                  }
                }
              }
            }
            stackOut_76_0 = (mh) (Object) stackIn_76_0;
            stackOut_76_1 = 0;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            break L20;
          }
          L22: {
            L23: {
              ((mh) (Object) stackIn_77_0).a(stackIn_77_1 != 0, -15211);
              stackOut_77_0 = wi.field_j;
              stackIn_81_0 = stackOut_77_0;
              stackIn_78_0 = stackOut_77_0;
              if (!param1) {
                break L23;
              } else {
                stackOut_78_0 = (mh) (Object) stackIn_78_0;
                stackIn_81_0 = stackOut_78_0;
                stackIn_79_0 = stackOut_78_0;
                if (param2) {
                  break L23;
                } else {
                  stackOut_79_0 = (mh) (Object) stackIn_79_0;
                  stackIn_81_0 = stackOut_79_0;
                  stackIn_80_0 = stackOut_79_0;
                  if (!hc.field_c) {
                    break L23;
                  } else {
                    stackOut_80_0 = (mh) (Object) stackIn_80_0;
                    stackOut_80_1 = 1;
                    stackIn_82_0 = stackOut_80_0;
                    stackIn_82_1 = stackOut_80_1;
                    break L22;
                  }
                }
              }
            }
            stackOut_81_0 = (mh) (Object) stackIn_81_0;
            stackOut_81_1 = 0;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            break L22;
          }
          L24: {
            ((mh) (Object) stackIn_82_0).a(stackIn_82_1 != 0, -15211);
            sb.field_c.field_d.i(0);
            if (nl.field_f != null) {
              L25: {
                if (-1 != (ij.field_e.field_L ^ -1)) {
                  ef.a(-22809, param0);
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (dn.field_K.field_L != 0) {
                  if (!fh.field_d) {
                    jk.a(param0, (byte) 98);
                    break L26;
                  } else {
                    um.a(param3 + 276, param0);
                    break L26;
                  }
                } else {
                  break L26;
                }
              }
              ip.a(param0, nl.field_f, true, false);
              break L24;
            } else {
              break L24;
            }
          }
          return;
        } else {
          return;
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
