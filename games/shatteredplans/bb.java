/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String field_d;
    static int field_c;
    static String field_a;
    static int field_b;

    final static as a(int param0, mg param1) {
        as var2 = null;
        RuntimeException var2_ref = null;
        as stackIn_2_0 = null;
        as stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        as stackOut_3_0 = null;
        as stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -2) {
              var2 = new as(param1);
              var2.field_v = -var2.field_v;
              stackOut_3_0 = (as) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (as) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("bb.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static qr a(byte param0) {
        if (param0 != 100) {
            bb.a(false, false, (byte) 25, -35);
        }
        return ls.field_a.field_xb;
    }

    final static void a(int param0, long param1, int param2, boolean param3, String param4, int param5) {
        int var7_int = 0;
        try {
            js.field_f.h(param2, 255);
            js.field_f.field_j = js.field_f.field_j + 1;
            var7_int = js.field_f.field_j;
            if (param0 < 18) {
                bb.a(false, true, (byte) -52, -121);
            }
            js.field_f.b(-16426, param1);
            js.field_f.a(param4, (byte) 0);
            js.field_f.c(param5, (byte) -127);
            js.field_f.c(param3 ? 1 : 0, (byte) -96);
            js.field_f.b(js.field_f.field_j - var7_int, (byte) 118);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "bb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 != 26) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, boolean param1, byte param2, int param3) {
        RuntimeException var4 = null;
        qr var5 = null;
        qr var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        qr var15 = null;
        String var16 = null;
        qr var17 = null;
        int stackIn_13_0 = 0;
        qr stackIn_24_0 = null;
        qr stackIn_25_0 = null;
        qr stackIn_26_0 = null;
        String stackIn_26_1 = null;
        qr stackIn_27_0 = null;
        qr stackIn_28_0 = null;
        qr stackIn_29_0 = null;
        String stackIn_29_1 = null;
        String stackIn_57_0 = null;
        qr stackIn_67_0 = null;
        qr stackIn_68_0 = null;
        qr stackIn_69_0 = null;
        qr stackIn_70_0 = null;
        qr stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        qr stackIn_72_0 = null;
        qr stackIn_73_0 = null;
        qr stackIn_74_0 = null;
        qr stackIn_75_0 = null;
        qr stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        qr stackIn_77_0 = null;
        qr stackIn_78_0 = null;
        qr stackIn_79_0 = null;
        qr stackIn_80_0 = null;
        qr stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        String stackOut_56_0 = null;
        String stackOut_55_0 = null;
        qr stackOut_23_0 = null;
        qr stackOut_25_0 = null;
        String stackOut_25_1 = null;
        qr stackOut_24_0 = null;
        String stackOut_24_1 = null;
        qr stackOut_26_0 = null;
        qr stackOut_28_0 = null;
        String stackOut_28_1 = null;
        qr stackOut_27_0 = null;
        String stackOut_27_1 = null;
        qr stackOut_66_0 = null;
        qr stackOut_67_0 = null;
        qr stackOut_68_0 = null;
        qr stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        qr stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        qr stackOut_71_0 = null;
        qr stackOut_72_0 = null;
        qr stackOut_73_0 = null;
        qr stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        qr stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        qr stackOut_76_0 = null;
        qr stackOut_77_0 = null;
        qr stackOut_78_0 = null;
        qr stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        qr stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              qo.a(22353, bc.field_b);
              if (param2 == -2) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              if (he.field_p != null) {
                L3: {
                  L4: {
                    var15 = go.field_I;
                    var17 = var15;
                    go.field_I.field_mb = 0;
                    var17.field_K = 0;
                    var5 = aq.field_j;
                    aq.field_j.field_mb = 0;
                    var5.field_K = 0;
                    var6 = dn.field_f;
                    dn.field_f.field_mb = 0;
                    var6.field_K = 0;
                    tj.field_f.field_z = le.field_c.toUpperCase();
                    var7 = (2 + pf.field_g.field_K) / 2;
                    dn.field_f.a(-2 + var7, 40, (byte) 108, pf.field_g.field_mb + -40, 0);
                    aq.field_j.a(-var7 + pf.field_g.field_K, 40, (byte) 73, pf.field_g.field_mb - 40, var7);
                    if (-2 != (nl.field_a.length ^ -1)) {
                      break L4;
                    } else {
                      if (2 != nl.field_a[0]) {
                        break L4;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L5: while (true) {
                    L6: {
                      if (var10 >= nl.field_a.length) {
                        break L6;
                      } else {
                        L7: {
                          if ((id.field_c[var10 / 8] & 1 << (var10 & 7)) == 0) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L7;
                          } else {
                            stackOut_11_0 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            break L7;
                          }
                        }
                        L8: {
                          var11_int = stackIn_13_0;
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            var9_int++;
                            break L8;
                          }
                        }
                        L9: {
                          if (var11_int == 0) {
                            break L9;
                          } else {
                            if (nl.field_a[var10] != 2) {
                              var8 = 1;
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var10++;
                        continue L5;
                      }
                    }
                    if (var9_int != 0) {
                      break L3;
                    } else {
                      var8 = 1;
                      break L3;
                    }
                  }
                }
                aq.field_j.field_s = true;
                if (k.field_i) {
                  L10: {
                    i.field_g.field_s = false;
                    oh.field_c.field_z = nb.field_c;
                    if (var8 == 0) {
                      stackOut_56_0 = cm.field_c;
                      stackIn_57_0 = stackOut_56_0;
                      break L10;
                    } else {
                      stackOut_55_0 = mp.field_f;
                      stackIn_57_0 = stackOut_55_0;
                      break L10;
                    }
                  }
                  L11: {
                    var16 = stackIn_57_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = dn.field_f.field_nb.c(var16) - -(3 * dn.field_f.field_nb.a('.'));
                    dn.field_f.field_kb = (-var10 + dn.field_f.field_K) / 2;
                    if (16 == (ln.field_w & 48)) {
                      var9 = var16 + ".";
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    dn.field_f.field_y = 0;
                    if ((48 & ln.field_w) != 32) {
                      break L12;
                    } else {
                      var9 = var9 + "..";
                      break L12;
                    }
                  }
                  L13: {
                    if ((48 & ln.field_w) == 48) {
                      var9 = var9 + "...";
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  dn.field_f.field_z = var9;
                  aq.field_j.field_z = fb.field_bc.toUpperCase();
                  break L2;
                } else {
                  L14: {
                    stackOut_23_0 = aq.field_j;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_24_0 = stackOut_23_0;
                    if (var8 != 0) {
                      stackOut_25_0 = (qr) ((Object) stackIn_25_0);
                      stackOut_25_1 = lo.field_A;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L14;
                    } else {
                      stackOut_24_0 = (qr) ((Object) stackIn_24_0);
                      stackOut_24_1 = dk.field_a;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      break L14;
                    }
                  }
                  L15: {
                    stackIn_26_0.field_z = ((String) (Object) stackIn_26_1).toUpperCase();
                    stackOut_26_0 = oh.field_c;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (var8 != 0) {
                      stackOut_28_0 = (qr) ((Object) stackIn_28_0);
                      stackOut_28_1 = df.field_i;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L15;
                    } else {
                      stackOut_27_0 = (qr) ((Object) stackIn_27_0);
                      stackOut_27_1 = qp.field_v;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L15;
                    }
                  }
                  L16: {
                    stackIn_29_0.field_z = re.a(stackIn_29_1, 4371, new String[]{aq.field_j.field_z});
                    dn.field_f.field_z = wg.field_b;
                    i.field_g.field_s = true;
                    wg.field_d = true;
                    if (null != pe.field_D) {
                      L17: {
                        wg.field_d = false;
                        qd.field_h = false;
                        if (lr.field_c != null) {
                          break L17;
                        } else {
                          lr.field_c = new byte[em.field_k];
                          ek.field_F = new boolean[em.field_k];
                          break L17;
                        }
                      }
                      var13 = 0;
                      var9_int = var13;
                      L18: while (true) {
                        if (var13 >= em.field_k) {
                          js.a(-1, param2 + 3, he.field_p, em.field_k, 0, true, -1, -1);
                          if (-3 < (bs.field_b ^ -1)) {
                            break L16;
                          } else {
                            if (!di.field_p[12]) {
                              break L16;
                            } else {
                              wg.field_d = true;
                              break L16;
                            }
                          }
                        } else {
                          ek.field_F[var13] = false;
                          var13++;
                          continue L18;
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                  if (!wg.field_d) {
                    aq.field_j.field_s = false;
                    if (aq.field_j.field_v) {
                      L19: {
                        var9 = null;
                        if (!qd.field_h) {
                          break L19;
                        } else {
                          var9 = "<col=A00000>" + wl.field_b + "</col>";
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L19;
                        }
                      }
                      var10 = 0;
                      L20: while (true) {
                        if (em.field_k <= var10) {
                          dn.field_k = "<col=A00000>" + gg.field_c + "<br>" + ji.field_F + var9;
                          break L2;
                        } else {
                          L21: {
                            if (ek.field_F[var10]) {
                              var11 = "<col=A00000>" + gm.field_l[var10] + "</col>";
                              var9 = var11;
                              var9 = var11;
                              if (var9 == null) {
                                var9 = var11;
                                break L21;
                              } else {
                                var9 = var9 + ", " + var11;
                                break L21;
                              }
                            } else {
                              break L21;
                            }
                          }
                          var10++;
                          continue L20;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L22: {
              L23: {
                stackOut_66_0 = am.field_xb;
                stackIn_70_0 = stackOut_66_0;
                stackIn_67_0 = stackOut_66_0;
                if (!param1) {
                  break L23;
                } else {
                  stackOut_67_0 = (qr) ((Object) stackIn_67_0);
                  stackIn_70_0 = stackOut_67_0;
                  stackIn_68_0 = stackOut_67_0;
                  if (param0) {
                    break L23;
                  } else {
                    stackOut_68_0 = (qr) ((Object) stackIn_68_0);
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (ti.field_e) {
                      break L23;
                    } else {
                      stackOut_69_0 = (qr) ((Object) stackIn_69_0);
                      stackOut_69_1 = 1;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      break L22;
                    }
                  }
                }
              }
              stackOut_70_0 = (qr) ((Object) stackIn_70_0);
              stackOut_70_1 = 0;
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              break L22;
            }
            L24: {
              L25: {
                ((qr) (Object) stackIn_71_0).a(stackIn_71_1 != 0, -20429);
                stackOut_71_0 = pf.field_g;
                stackIn_75_0 = stackOut_71_0;
                stackIn_72_0 = stackOut_71_0;
                if (!param1) {
                  break L25;
                } else {
                  stackOut_72_0 = (qr) ((Object) stackIn_72_0);
                  stackIn_75_0 = stackOut_72_0;
                  stackIn_73_0 = stackOut_72_0;
                  if (param0) {
                    break L25;
                  } else {
                    stackOut_73_0 = (qr) ((Object) stackIn_73_0);
                    stackIn_75_0 = stackOut_73_0;
                    stackIn_74_0 = stackOut_73_0;
                    if (ti.field_e) {
                      break L25;
                    } else {
                      stackOut_74_0 = (qr) ((Object) stackIn_74_0);
                      stackOut_74_1 = 1;
                      stackIn_76_0 = stackOut_74_0;
                      stackIn_76_1 = stackOut_74_1;
                      break L24;
                    }
                  }
                }
              }
              stackOut_75_0 = (qr) ((Object) stackIn_75_0);
              stackOut_75_1 = 0;
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              break L24;
            }
            L26: {
              L27: {
                ((qr) (Object) stackIn_76_0).a(stackIn_76_1 != 0, -20429);
                stackOut_76_0 = ed.field_d;
                stackIn_80_0 = stackOut_76_0;
                stackIn_77_0 = stackOut_76_0;
                if (!param1) {
                  break L27;
                } else {
                  stackOut_77_0 = (qr) ((Object) stackIn_77_0);
                  stackIn_80_0 = stackOut_77_0;
                  stackIn_78_0 = stackOut_77_0;
                  if (param0) {
                    break L27;
                  } else {
                    stackOut_78_0 = (qr) ((Object) stackIn_78_0);
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_79_0 = stackOut_78_0;
                    if (!ti.field_e) {
                      break L27;
                    } else {
                      stackOut_79_0 = (qr) ((Object) stackIn_79_0);
                      stackOut_79_1 = 1;
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_81_1 = stackOut_79_1;
                      break L26;
                    }
                  }
                }
              }
              stackOut_80_0 = (qr) ((Object) stackIn_80_0);
              stackOut_80_1 = 0;
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              break L26;
            }
            L28: {
              ((qr) (Object) stackIn_81_0).a(stackIn_81_1 != 0, -20429);
              n.field_h.field_d.f(false);
              if (he.field_p == null) {
                break L28;
              } else {
                L29: {
                  if (i.field_g.field_rb == 0) {
                    break L29;
                  } else {
                    je.a((byte) 62, param3);
                    break L29;
                  }
                }
                L30: {
                  if (0 == aq.field_j.field_rb) {
                    break L30;
                  } else {
                    if (!k.field_i) {
                      rf.a(param3, 104);
                      break L30;
                    } else {
                      oq.a(param3, false);
                      break L30;
                    }
                  }
                }
                sc.a(-109, true, he.field_p, param3);
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "bb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_d = "<%0> is offering a rematch.";
        field_a = "Accept draw";
        field_b = 0;
    }
}
