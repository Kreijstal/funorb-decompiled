/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vu extends vw {
    static String field_e;
    static int field_f;
    static String field_d;

    vu(eo param0) {
        super(param0);
    }

    final void a(int param0, iva param1, int param2) {
        try {
            ((vu) this).field_c.a(true, param1);
            if (param2 != 24595) {
                field_e = null;
            }
            ((vu) this).field_c.a((byte) -108, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vu.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            ((vu) this).a((byte) 31, 78, -5);
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            field_d = null;
            return false;
        }
        return false;
    }

    public static void d(int param0) {
        int var1 = 0;
        field_d = null;
        field_e = null;
    }

    final static void a(byte param0, boolean param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        jea var5 = null;
        jea var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        jea var15 = null;
        String var16 = null;
        jea var17 = null;
        int stackIn_10_0 = 0;
        String stackIn_23_0 = null;
        jea stackIn_33_0 = null;
        jea stackIn_34_0 = null;
        jea stackIn_35_0 = null;
        String stackIn_35_1 = null;
        jea stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        jea stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        jea stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_38_2 = null;
        jea stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        jea stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        jea stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        jea stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        jea stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        jea stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        jea stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        jea stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        jea stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        jea stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        jea stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        jea stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        jea stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        jea stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        jea stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        jea stackOut_32_0 = null;
        jea stackOut_34_0 = null;
        String stackOut_34_1 = null;
        jea stackOut_33_0 = null;
        String stackOut_33_1 = null;
        jea stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        jea stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        jea stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_36_2 = null;
        String stackOut_22_0 = null;
        String stackOut_21_0 = null;
        jea stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        jea stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        jea stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        jea stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        jea stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        jea stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        jea stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        jea stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        jea stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        jea stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        jea stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        jea stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        jea stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        jea stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        jea stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              dga.a(gt.field_a, 199);
              if (null == ifa.field_n) {
                break L1;
              } else {
                L2: {
                  L3: {
                    pk.field_z.field_t = 0;
                    var15 = pk.field_z;
                    var17 = var15;
                    var17.field_G = 0;
                    hw.field_a.field_t = 0;
                    var5 = hw.field_a;
                    var5.field_G = 0;
                    var6 = dl.field_t;
                    dl.field_t.field_t = 0;
                    var6.field_G = 0;
                    wf.field_g.field_r = dka.field_a.toUpperCase();
                    var7 = (dka.field_b.field_G + 2) / 2;
                    dl.field_t.a(-2 + var7, 40, -23776, -40 + dka.field_b.field_t, 0);
                    hw.field_a.a(dka.field_b.field_G + -var7, 40, -23776, -40 + dka.field_b.field_t, var7);
                    if (sg.field_u.length != 1) {
                      break L3;
                    } else {
                      if (sg.field_u[0] == 2) {
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
                      if (var10 >= sg.field_u.length) {
                        break L5;
                      } else {
                        L6: {
                          if ((vk.field_b[var10 / 8] & 1 << (7 & var10)) == 0) {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            break L6;
                          } else {
                            stackOut_8_0 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_10_0;
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            var9_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (sg.field_u[var10] == 2) {
                              break L8;
                            } else {
                              var8 = 1;
                              break L5;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (var9_int != 0) {
                      break L2;
                    } else {
                      var8 = 1;
                      break L2;
                    }
                  }
                }
                hw.field_a.field_X = true;
                if (!qa.field_o) {
                  L9: {
                    stackOut_32_0 = hw.field_a;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var8 != 0) {
                      stackOut_34_0 = (jea) (Object) stackIn_34_0;
                      stackOut_34_1 = kk.field_a;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      break L9;
                    } else {
                      stackOut_33_0 = (jea) (Object) stackIn_33_0;
                      stackOut_33_1 = rf.field_b;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_35_0.field_r = ((String) (Object) stackIn_35_1).toUpperCase();
                    stackOut_35_0 = fu.field_t;
                    stackOut_35_1 = 114;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    if (var8 != 0) {
                      stackOut_37_0 = (jea) (Object) stackIn_37_0;
                      stackOut_37_1 = stackIn_37_1;
                      stackOut_37_2 = cn.field_c;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      break L10;
                    } else {
                      stackOut_36_0 = (jea) (Object) stackIn_36_0;
                      stackOut_36_1 = stackIn_36_1;
                      stackOut_36_2 = TombRacer.field_F;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_38_0.field_r = gl.a((byte) stackIn_38_1, stackIn_38_2, new String[1]);
                    dl.field_t.field_r = vf.field_h;
                    bc.field_b.field_X = true;
                    rh.field_s = true;
                    if (null != ce.field_A) {
                      L12: {
                        rh.field_s = false;
                        if (null != tba.field_m) {
                          break L12;
                        } else {
                          tba.field_m = new byte[fk.field_b];
                          sda.field_f = new boolean[fk.field_b];
                          break L12;
                        }
                      }
                      mm.field_g = false;
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (fk.field_b <= var13) {
                          cja.a(109, fk.field_b, ifa.field_n, 0, -1, -1, -1, true);
                          if (ld.field_e < 2) {
                            break L11;
                          } else {
                            if (!oj.field_tb[12]) {
                              break L11;
                            } else {
                              rh.field_s = true;
                              break L11;
                            }
                          }
                        } else {
                          sda.field_f[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (rh.field_s) {
                    break L1;
                  } else {
                    hw.field_a.field_X = false;
                    if (hw.field_a.field_pb) {
                      L14: {
                        var9 = null;
                        if (mm.field_g) {
                          var9 = (Object) (Object) ("<col=A00000>" + mi.field_j + "</col>");
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= fk.field_b) {
                          qda.field_b = "<col=A00000>" + cra.field_a + "<br>" + jb.field_J + (String) var9;
                          break L1;
                        } else {
                          L16: {
                            if (sda.field_f[var10]) {
                              var11_ref = "<col=A00000>" + kma.field_e[var10] + "</col>";
                              var9 = (Object) (Object) var11_ref;
                              var9 = (Object) (Object) var11_ref;
                              if (var9 != null) {
                                var9 = (Object) (Object) ((String) var9 + ", " + var11_ref);
                                break L16;
                              } else {
                                var9 = (Object) (Object) var11_ref;
                                break L16;
                              }
                            } else {
                              break L16;
                            }
                          }
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  L17: {
                    bc.field_b.field_X = false;
                    fu.field_t.field_r = hv.field_n;
                    if (var8 != 0) {
                      stackOut_22_0 = to.field_l;
                      stackIn_23_0 = stackOut_22_0;
                      break L17;
                    } else {
                      stackOut_21_0 = gqa.field_k;
                      stackIn_23_0 = stackOut_21_0;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_23_0;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var10 = dl.field_t.field_H.b(var16) + 3 * dl.field_t.field_H.a('.');
                    if ((lh.field_a & 48) == 16) {
                      var9 = (Object) (Object) (var16 + ".");
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    dl.field_t.field_x = (dl.field_t.field_G - var10) / 2;
                    dl.field_t.field_z = 0;
                    if ((lh.field_a & 48) != 32) {
                      break L19;
                    } else {
                      var9 = (Object) (Object) ((String) var9 + "..");
                      break L19;
                    }
                  }
                  L20: {
                    if (48 == (lh.field_a & 48)) {
                      var9 = (Object) (Object) ((String) var9 + "...");
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  dl.field_t.field_r = (String) var9;
                  hw.field_a.field_r = mq.field_d.toUpperCase();
                  break L1;
                }
              }
            }
            L21: {
              L22: {
                stackOut_63_0 = nra.field_c;
                stackOut_63_1 = -101;
                stackIn_67_0 = stackOut_63_0;
                stackIn_67_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (!param1) {
                  break L22;
                } else {
                  stackOut_64_0 = (jea) (Object) stackIn_64_0;
                  stackOut_64_1 = stackIn_64_1;
                  stackIn_67_0 = stackOut_64_0;
                  stackIn_67_1 = stackOut_64_1;
                  stackIn_65_0 = stackOut_64_0;
                  stackIn_65_1 = stackOut_64_1;
                  if (param2) {
                    break L22;
                  } else {
                    stackOut_65_0 = (jea) (Object) stackIn_65_0;
                    stackOut_65_1 = stackIn_65_1;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (tla.field_e) {
                      break L22;
                    } else {
                      stackOut_66_0 = (jea) (Object) stackIn_66_0;
                      stackOut_66_1 = stackIn_66_1;
                      stackOut_66_2 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      stackIn_68_1 = stackOut_66_1;
                      stackIn_68_2 = stackOut_66_2;
                      break L21;
                    }
                  }
                }
              }
              stackOut_67_0 = (jea) (Object) stackIn_67_0;
              stackOut_67_1 = stackIn_67_1;
              stackOut_67_2 = 0;
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L21;
            }
            L23: {
              L24: {
                ((jea) (Object) stackIn_68_0).c(stackIn_68_1, stackIn_68_2 != 0);
                stackOut_68_0 = dka.field_b;
                stackOut_68_1 = -111;
                stackIn_72_0 = stackOut_68_0;
                stackIn_72_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (!param1) {
                  break L24;
                } else {
                  stackOut_69_0 = (jea) (Object) stackIn_69_0;
                  stackOut_69_1 = stackIn_69_1;
                  stackIn_72_0 = stackOut_69_0;
                  stackIn_72_1 = stackOut_69_1;
                  stackIn_70_0 = stackOut_69_0;
                  stackIn_70_1 = stackOut_69_1;
                  if (param2) {
                    break L24;
                  } else {
                    stackOut_70_0 = (jea) (Object) stackIn_70_0;
                    stackOut_70_1 = stackIn_70_1;
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    if (tla.field_e) {
                      break L24;
                    } else {
                      stackOut_71_0 = (jea) (Object) stackIn_71_0;
                      stackOut_71_1 = stackIn_71_1;
                      stackOut_71_2 = 1;
                      stackIn_73_0 = stackOut_71_0;
                      stackIn_73_1 = stackOut_71_1;
                      stackIn_73_2 = stackOut_71_2;
                      break L23;
                    }
                  }
                }
              }
              stackOut_72_0 = (jea) (Object) stackIn_72_0;
              stackOut_72_1 = stackIn_72_1;
              stackOut_72_2 = 0;
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L23;
            }
            L25: {
              L26: {
                ((jea) (Object) stackIn_73_0).c(stackIn_73_1, stackIn_73_2 != 0);
                stackOut_73_0 = hf.field_a;
                stackOut_73_1 = -113;
                stackIn_77_0 = stackOut_73_0;
                stackIn_77_1 = stackOut_73_1;
                stackIn_74_0 = stackOut_73_0;
                stackIn_74_1 = stackOut_73_1;
                if (!param1) {
                  break L26;
                } else {
                  stackOut_74_0 = (jea) (Object) stackIn_74_0;
                  stackOut_74_1 = stackIn_74_1;
                  stackIn_77_0 = stackOut_74_0;
                  stackIn_77_1 = stackOut_74_1;
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  if (param2) {
                    break L26;
                  } else {
                    stackOut_75_0 = (jea) (Object) stackIn_75_0;
                    stackOut_75_1 = stackIn_75_1;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_77_1 = stackOut_75_1;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    if (!tla.field_e) {
                      break L26;
                    } else {
                      stackOut_76_0 = (jea) (Object) stackIn_76_0;
                      stackOut_76_1 = stackIn_76_1;
                      stackOut_76_2 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_78_1 = stackOut_76_1;
                      stackIn_78_2 = stackOut_76_2;
                      break L25;
                    }
                  }
                }
              }
              stackOut_77_0 = (jea) (Object) stackIn_77_0;
              stackOut_77_1 = stackIn_77_1;
              stackOut_77_2 = 0;
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L25;
            }
            ((jea) (Object) stackIn_78_0).c(stackIn_78_1, stackIn_78_2 != 0);
            rm.field_e.field_a.e((byte) -99);
            L27: {
              if (null == ifa.field_n) {
                break L27;
              } else {
                L28: {
                  if (bc.field_b.field_y == 0) {
                    break L28;
                  } else {
                    gk.a(param3, (byte) 28);
                    break L28;
                  }
                }
                L29: {
                  if (hw.field_a.field_y == 0) {
                    break L29;
                  } else {
                    if (qa.field_o) {
                      pd.a((byte) 34, param3);
                      break L29;
                    } else {
                      jq.a(param3, (byte) -128);
                      break L29;
                    }
                  }
                }
                cm.a(param3, ifa.field_n, -21290, true);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "vu.F(" + 1 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
            field_e = null;
        }
    }

    final void a(int param0) {
        if (param0 > -4) {
            field_f = 59;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = -103 % ((param0 - 41) / 62);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_d = "Race Winner";
        field_e = "Invite";
    }
}
