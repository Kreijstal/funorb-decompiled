/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vg {
    static int field_a;
    static int field_f;
    static String field_b;
    private String field_d;
    static p field_c;
    private boolean field_e;

    final boolean a(int param0) {
        if (param0 != -10585) {
            String discarded$0 = ((vg) this).a((byte) -67);
        }
        return ((vg) this).field_e;
    }

    vg(String param0) {
        this(param0, false);
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3) {
        RuntimeException var4 = null;
        ci var5 = null;
        ci var6 = null;
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
        ci var15 = null;
        String var16 = null;
        ci var17 = null;
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        ci stackIn_35_0 = null;
        ci stackIn_36_0 = null;
        ci stackIn_37_0 = null;
        String stackIn_37_1 = null;
        ci stackIn_38_0 = null;
        ci stackIn_39_0 = null;
        ci stackIn_40_0 = null;
        String stackIn_40_1 = null;
        ci stackIn_65_0 = null;
        ci stackIn_66_0 = null;
        ci stackIn_67_0 = null;
        ci stackIn_68_0 = null;
        ci stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ci stackIn_70_0 = null;
        ci stackIn_71_0 = null;
        ci stackIn_72_0 = null;
        ci stackIn_73_0 = null;
        ci stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        ci stackIn_77_0 = null;
        ci stackIn_78_0 = null;
        ci stackIn_79_0 = null;
        ci stackIn_80_0 = null;
        ci stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        ci stackOut_34_0 = null;
        ci stackOut_36_0 = null;
        String stackOut_36_1 = null;
        ci stackOut_35_0 = null;
        String stackOut_35_1 = null;
        ci stackOut_37_0 = null;
        ci stackOut_39_0 = null;
        String stackOut_39_1 = null;
        ci stackOut_38_0 = null;
        String stackOut_38_1 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        ci stackOut_64_0 = null;
        ci stackOut_65_0 = null;
        ci stackOut_66_0 = null;
        ci stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        ci stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        ci stackOut_69_0 = null;
        ci stackOut_70_0 = null;
        ci stackOut_71_0 = null;
        ci stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        ci stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        ci stackOut_76_0 = null;
        ci stackOut_77_0 = null;
        ci stackOut_78_0 = null;
        ci stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        ci stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        var12 = Chess.field_G;
        try {
          L0: {
            L1: {
              f.a(aj.field_c, true);
              if (ib.field_d != null) {
                L2: {
                  L3: {
                    var15 = uj.field_j;
                    var17 = var15;
                    uj.field_j.field_pb = 0;
                    var17.field_M = 0;
                    var5 = aa.field_g;
                    aa.field_g.field_pb = 0;
                    var5.field_M = 0;
                    var6 = tn.field_j;
                    tn.field_j.field_pb = 0;
                    var6.field_M = 0;
                    sc.field_f.field_db = n.field_h.toUpperCase();
                    var7 = (2 + ri.field_k.field_M) / 2;
                    tn.field_j.a(0, -2 + var7, -2147483648, 40, ri.field_k.field_pb + -40);
                    aa.field_g.a(var7, ri.field_k.field_M + -var7, -2147483648, 40, -40 + ri.field_k.field_pb);
                    if (wn.field_d.length != 1) {
                      break L3;
                    } else {
                      if (2 == wn.field_d[0]) {
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
                      if (var10 >= wn.field_d.length) {
                        break L5;
                      } else {
                        L6: {
                          if ((g.field_f[var10 / 8] & 1 << (var10 & 7)) == 0) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L6;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
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
                            if (wn.field_d[var10] == 2) {
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
                    if (var9_int == 0) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                aa.field_g.field_tb = true;
                if (!ud.field_b) {
                  L9: {
                    stackOut_34_0 = aa.field_g;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (var8 == 0) {
                      stackOut_36_0 = (ci) (Object) stackIn_36_0;
                      stackOut_36_1 = kf.field_m;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L9;
                    } else {
                      stackOut_35_0 = (ci) (Object) stackIn_35_0;
                      stackOut_35_1 = k.field_ab;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_37_0.field_db = ((String) (Object) stackIn_37_1).toUpperCase();
                    stackOut_37_0 = ao.field_b;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var8 != 0) {
                      stackOut_39_0 = (ci) (Object) stackIn_39_0;
                      stackOut_39_1 = nk.field_u;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L10;
                    } else {
                      stackOut_38_0 = (ci) (Object) stackIn_38_0;
                      stackOut_38_1 = he.field_Jb;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_40_0.field_db = oc.a(stackIn_40_1, new String[1], (byte) -77);
                    sc.field_d.field_tb = true;
                    tn.field_j.field_db = jl.field_b;
                    pk.field_g = true;
                    if (hd.field_n == null) {
                      break L11;
                    } else {
                      L12: {
                        d.field_Gb = false;
                        pk.field_g = false;
                        if (d.field_Jb != null) {
                          break L12;
                        } else {
                          bi.field_d = new boolean[qa.field_e];
                          d.field_Jb = new byte[qa.field_e];
                          break L12;
                        }
                      }
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (qa.field_e <= var13) {
                          b.a(-1, -43, 0, -1, qa.field_e, -1, ib.field_d, true);
                          if (2 > sk.field_t) {
                            break L11;
                          } else {
                            if (!ok.field_Jb[12]) {
                              break L11;
                            } else {
                              pk.field_g = true;
                              break L11;
                            }
                          }
                        } else {
                          bi.field_d[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    }
                  }
                  if (!pk.field_g) {
                    aa.field_g.field_tb = false;
                    if (!aa.field_g.field_Db) {
                      break L1;
                    } else {
                      L14: {
                        var9 = null;
                        if (d.field_Gb) {
                          var9 = (Object) (Object) ("<col=A00000>" + tm.field_h + "</col>");
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
                        if (var10 >= qa.field_e) {
                          pc.field_Mb = "<col=A00000>" + sk.field_q + "<br>" + mm.field_b + (String) var9;
                          break L1;
                        } else {
                          L16: {
                            if (bi.field_d[var10]) {
                              var11_ref = "<col=A00000>" + td.field_n[var10] + "</col>";
                              var9 = (Object) (Object) var11_ref;
                              var9 = (Object) (Object) var11_ref;
                              if (var9 == null) {
                                var9 = (Object) (Object) var11_ref;
                                break L16;
                              } else {
                                var9 = (Object) (Object) ((String) var9 + ", " + var11_ref);
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
                    }
                  } else {
                    break L1;
                  }
                } else {
                  L17: {
                    ao.field_b.field_db = qd.field_G;
                    sc.field_d.field_tb = false;
                    if (var8 == 0) {
                      stackOut_24_0 = eb.field_t;
                      stackIn_25_0 = stackOut_24_0;
                      break L17;
                    } else {
                      stackOut_23_0 = b.field_g;
                      stackIn_25_0 = stackOut_23_0;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_25_0;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var10 = tn.field_j.field_xb.b(var16) + 3 * tn.field_j.field_xb.a('.');
                    if (16 == (g.field_c & 48)) {
                      var9 = (Object) (Object) (var16 + ".");
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    tn.field_j.field_fb = 0;
                    tn.field_j.field_z = (-var10 + tn.field_j.field_M) / 2;
                    if (32 != (48 & g.field_c)) {
                      break L19;
                    } else {
                      var9 = (Object) (Object) ((String) var9 + "..");
                      break L19;
                    }
                  }
                  L20: {
                    if ((g.field_c & 48) == 48) {
                      var9 = (Object) (Object) ((String) var9 + "...");
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  tn.field_j.field_db = (String) var9;
                  aa.field_g.field_db = ue.field_b.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackOut_64_0 = fm.field_T;
                stackIn_68_0 = stackOut_64_0;
                stackIn_65_0 = stackOut_64_0;
                if (!param3) {
                  break L22;
                } else {
                  stackOut_65_0 = (ci) (Object) stackIn_65_0;
                  stackIn_68_0 = stackOut_65_0;
                  stackIn_66_0 = stackOut_65_0;
                  if (param0) {
                    break L22;
                  } else {
                    stackOut_66_0 = (ci) (Object) stackIn_66_0;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_67_0 = stackOut_66_0;
                    if (jh.field_a) {
                      break L22;
                    } else {
                      stackOut_67_0 = (ci) (Object) stackIn_67_0;
                      stackOut_67_1 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      break L21;
                    }
                  }
                }
              }
              stackOut_68_0 = (ci) (Object) stackIn_68_0;
              stackOut_68_1 = 0;
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              break L21;
            }
            L23: {
              L24: {
                ((ci) (Object) stackIn_69_0).a(stackIn_69_1 != 0, (byte) 88);
                stackOut_69_0 = ri.field_k;
                stackIn_73_0 = stackOut_69_0;
                stackIn_70_0 = stackOut_69_0;
                if (!param3) {
                  break L24;
                } else {
                  stackOut_70_0 = (ci) (Object) stackIn_70_0;
                  stackIn_73_0 = stackOut_70_0;
                  stackIn_71_0 = stackOut_70_0;
                  if (param0) {
                    break L24;
                  } else {
                    stackOut_71_0 = (ci) (Object) stackIn_71_0;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_72_0 = stackOut_71_0;
                    if (jh.field_a) {
                      break L24;
                    } else {
                      stackOut_72_0 = (ci) (Object) stackIn_72_0;
                      stackOut_72_1 = 1;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      break L23;
                    }
                  }
                }
              }
              stackOut_73_0 = (ci) (Object) stackIn_73_0;
              stackOut_73_1 = 0;
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              break L23;
            }
            L25: {
              ((ci) (Object) stackIn_74_0).a(stackIn_74_1 != 0, (byte) 88);
              if (param2 < -28) {
                break L25;
              } else {
                field_a = -76;
                break L25;
              }
            }
            L26: {
              L27: {
                stackOut_76_0 = ah.field_i;
                stackIn_80_0 = stackOut_76_0;
                stackIn_77_0 = stackOut_76_0;
                if (!param3) {
                  break L27;
                } else {
                  stackOut_77_0 = (ci) (Object) stackIn_77_0;
                  stackIn_80_0 = stackOut_77_0;
                  stackIn_78_0 = stackOut_77_0;
                  if (param0) {
                    break L27;
                  } else {
                    stackOut_78_0 = (ci) (Object) stackIn_78_0;
                    stackIn_80_0 = stackOut_78_0;
                    stackIn_79_0 = stackOut_78_0;
                    if (!jh.field_a) {
                      break L27;
                    } else {
                      stackOut_79_0 = (ci) (Object) stackIn_79_0;
                      stackOut_79_1 = 1;
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_81_1 = stackOut_79_1;
                      break L26;
                    }
                  }
                }
              }
              stackOut_80_0 = (ci) (Object) stackIn_80_0;
              stackOut_80_1 = 0;
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              break L26;
            }
            L28: {
              ((ci) (Object) stackIn_81_0).a(stackIn_81_1 != 0, (byte) 88);
              qa.field_f.field_a.f((byte) 109);
              if (null == ib.field_d) {
                break L28;
              } else {
                L29: {
                  if (sc.field_d.field_L == 0) {
                    break L29;
                  } else {
                    hc.a(param1, (byte) -128);
                    break L29;
                  }
                }
                L30: {
                  if (aa.field_g.field_L == 0) {
                    break L30;
                  } else {
                    if (!ud.field_b) {
                      cc.a((byte) 81, param1);
                      break L30;
                    } else {
                      dn.a((byte) 72, param1);
                      break L30;
                    }
                  }
                }
                t.a(ib.field_d, true, param1, true);
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var4, "vg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String a(byte param0) {
        if (param0 != -64) {
            vg.a(false, -87, (byte) 27, false);
        }
        return ((vg) this).field_d;
    }

    vg(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              ((vg) this).field_d = param0;
              if (null != ((vg) this).field_d) {
                break L1;
              } else {
                ((vg) this).field_d = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              ((vg) this).field_e = stackIn_6_1 != 0;
              if (((vg) this).field_d.length() != 0) {
                break L3;
              } else {
                ((vg) this).field_e = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("vg.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "you";
    }
}
