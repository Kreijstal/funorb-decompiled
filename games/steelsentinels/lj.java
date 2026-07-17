/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lj {
    static String field_c;
    static rf field_d;
    static wk[] field_b;
    static String field_i;
    static String[] field_g;
    static String[] field_a;
    static String field_f;
    static qd field_h;
    static wk[] field_e;

    final static String a(String param0, byte param1, int param2) {
        RuntimeException var3 = null;
        kj var3_ref = null;
        int var4 = 0;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_23_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_16_0 = null;
        String stackOut_22_0 = null;
        String stackOut_27_0 = null;
        Object stackOut_35_0 = null;
        String stackOut_30_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            if (!fa.a(true, (CharSequence) (Object) param0)) {
              stackOut_3_0 = en.field_a;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (2 == qc.field_P) {
                if (wl.a(79, param0)) {
                  stackOut_11_0 = o.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  if (pf.a(param0, -53)) {
                    stackOut_16_0 = db.a(f.field_u, -107, new String[1]);
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  } else {
                    L1: {
                      if (vd.field_h < 100) {
                        break L1;
                      } else {
                        if (rd.field_b > 0) {
                          break L1;
                        } else {
                          stackOut_22_0 = pf.field_m;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      }
                    }
                    if (vd.field_h >= 200) {
                      stackOut_27_0 = pf.field_m;
                      stackIn_28_0 = stackOut_27_0;
                      return stackIn_28_0;
                    } else {
                      if (!o.a(-32, param0)) {
                        var3_ref = mm.field_g;
                        var3_ref.a(param2, (byte) -117);
                        var3_ref.field_p = var3_ref.field_p + 1;
                        var4 = var3_ref.field_p;
                        var3_ref.a((byte) 114, 0);
                        var3_ref.a(param0, -102);
                        var3_ref.b((byte) -46, -var4 + var3_ref.field_p);
                        stackOut_35_0 = null;
                        stackIn_36_0 = stackOut_35_0;
                        break L0;
                      } else {
                        stackOut_30_0 = db.a(qj.field_m, -68, new String[1]);
                        stackIn_31_0 = stackOut_30_0;
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = ed.field_d;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("lj.E(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L2;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + -79 + 44 + param2 + 41);
        }
        return (String) (Object) stackIn_36_0;
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
            field_e = null;
            field_i = null;
            field_f = null;
            field_c = null;
            field_h = null;
            field_d = null;
            field_a = null;
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "lj.B(" + 109 + 41);
        }
    }

    final static String a(int param0) {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_67_0 = null;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_66_0 = null;
        String stackOut_64_0 = null;
        Object stackOut_101_0 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (ib.field_b != 0) {
                break L1;
              } else {
                if (ni.field_a != null) {
                  var2 = (Object) (Object) ki.field_ob;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (2 != ib.field_b) {
                break L2;
              } else {
                if (wa.b((byte) -76)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (!pf.a(bk.field_U, -59)) {
                        break L4;
                      } else {
                        var2 = (Object) (Object) db.a(wh.field_a, -110, new String[1]);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = (Object) (Object) db.a(oh.field_b, -12, new String[1]);
                    break L3;
                  }
                  if (!vb.field_e) {
                    break L2;
                  } else {
                    sj.a((String) null, (String) var2, 0, (byte) 21, (String) null, 2);
                    pm.a((byte) -110);
                    break L2;
                  }
                }
              }
            }
            L5: {
              if (var2 != null) {
                break L5;
              } else {
                if (rg.field_f) {
                  break L5;
                } else {
                  if (null != hh.field_a) {
                    break L5;
                  } else {
                    var2 = (Object) (Object) t.field_g;
                    break L5;
                  }
                }
              }
            }
            L6: {
              L7: {
                if (null == var2) {
                  break L7;
                } else {
                  qb.a(56, v.field_e, (String) var2, 0, (String) null);
                  if (var10 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                L9: {
                  var3 = g.field_l;
                  var3 = dh.a(-27905, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = ib.field_b;
                  var7 = 0;
                  if (var6 != 2) {
                    break L9;
                  } else {
                    L10: {
                      var4 = db.a(hh.field_d, -43, new String[1]);
                      var8 = db.a(ak.field_e, -67, new String[1]);
                      var7 = -485 + (vd.field_d.field_zb + (wh.field_e.field_zb + pl.field_X.c(var8) - pl.field_X.c(var4)));
                      if (var7 < 0) {
                        var7 = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (var10 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                L11: {
                  if (var6 != 0) {
                    break L11;
                  } else {
                    L12: {
                      if (null != nf.field_b) {
                        break L12;
                      } else {
                        if (cd.field_g) {
                          var4 = "[" + kh.field_p + "] ";
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (null == nf.field_b) {
                      break L11;
                    } else {
                      L13: {
                        L14: {
                          if (!cc.field_lc) {
                            break L14;
                          } else {
                            if (qd.field_a == null) {
                              break L14;
                            } else {
                              var4 = "[" + qd.field_a + "] ";
                              if (var10 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        var4 = "[" + db.a(pd.field_ab, -93, new String[1]) + "] ";
                        break L13;
                      }
                      var6 = 1;
                      break L11;
                    }
                  }
                }
                L15: {
                  if (fg.p((byte) 84)) {
                    stackOut_66_0 = ": ";
                    stackIn_67_0 = stackOut_66_0;
                    break L15;
                  } else {
                    stackOut_64_0 = "<img=3>: ";
                    stackIn_67_0 = stackOut_64_0;
                    break L15;
                  }
                }
                L16: {
                  L17: {
                    var8 = stackIn_67_0;
                    var4 = var4 + var3 + var8;
                    if (!fj.field_e) {
                      break L17;
                    } else {
                      var4 = "<col=999999>" + var4 + hk.field_Kc + "</col>";
                      var5 = "";
                      if (var10 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (!uc.field_g) {
                    break L16;
                  } else {
                    var4 = "<col=999999>" + var4 + jl.field_f + "</col>";
                    var5 = "";
                    break L16;
                  }
                }
                var9 = pl.field_X.c(var4);
                if (!fg.p((byte) -102)) {
                  L18: {
                    if (!vd.field_d.field_kb) {
                      break L18;
                    } else {
                      if (var9 > -vd.field_d.field_Rb + oh.field_f) {
                        if (fj.field_e) {
                          var1 = (Object) (Object) "Broken!";
                          break L18;
                        } else {
                          var1 = (Object) (Object) jl.field_f;
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (vd.field_d.field_Eb == 0) {
                    break L8;
                  } else {
                    if (~vd.field_d.field_Cb > ~var9) {
                      if (fj.field_e) {
                        break L8;
                      } else {
                        pd.j(13171);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                } else {
                  break L8;
                }
              }
              L19: {
                qb.a(71, ag.field_r[var6], var4 + mi.a(tf.field_g.toString()), var7, var5);
                if (jn.field_g) {
                  break L19;
                } else {
                  wh.field_e.field_kb = false;
                  break L19;
                }
              }
              if (wh.field_e.field_kb) {
                var1 = (Object) (Object) db.a(wl.field_Y, -120, new String[2]);
                break L6;
              } else {
                break L6;
              }
            }
            stackOut_101_0 = var1;
            stackIn_102_0 = stackOut_101_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw ci.a((Throwable) var1, "lj.D(" + 1 + 41);
        }
        return (String) (Object) stackIn_102_0;
    }

    final static u a(cm param0, int param1, int param2, cm param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_7_0 = null;
        u stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        u stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!wa.a((byte) 30, param1, param4, param3)) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (u) (Object) stackIn_7_0;
            } else {
              stackOut_8_0 = je.a(96, param0.a(param4, (byte) 75, param1));
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("lj.C(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44).append(-56).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
        }
        return stackIn_9_0;
    }

    final static gh a(int param0, int param1, boolean param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        gh var8_ref = null;
        Object var9 = null;
        String var9_ref = null;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        gh var15 = null;
        int var16 = 0;
        gh var17 = null;
        gk var18 = null;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        gh var21 = null;
        gh var22 = null;
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_103_0 = 0;
        gh stackIn_104_0 = null;
        gh stackIn_106_0 = null;
        gh stackIn_107_0 = null;
        wk[] stackIn_107_1 = null;
        gh stackIn_108_0 = null;
        gh stackIn_110_0 = null;
        gh stackIn_111_0 = null;
        wk[] stackIn_111_1 = null;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        gh stackIn_139_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_100_0 = 0;
        gh stackOut_103_0 = null;
        gh stackOut_106_0 = null;
        wk[] stackOut_106_1 = null;
        gh stackOut_104_0 = null;
        wk[] stackOut_104_1 = null;
        gh stackOut_107_0 = null;
        gh stackOut_110_0 = null;
        wk[] stackOut_110_1 = null;
        gh stackOut_108_0 = null;
        wk[] stackOut_108_1 = null;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        gh stackOut_138_0 = null;
        var23 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var6_int = qa.field_O;
                  if (ni.b(103)) {
                    break L3;
                  } else {
                    if (rd.field_b > 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!oc.a(param1, -87, true)) {
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L1;
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            L4: {
              var7 = stackIn_11_0;
              var8 = null;
              var9 = null;
              if (param1 != 34) {
                var9_ref = rj.field_m[param1];
                break L4;
              } else {
                var9_ref = "GODULE";
                break L4;
              }
            }
            L5: {
              var10 = null;
              var11 = 0;
              var12 = 5;
              var13 = param1;
              if (var13 == 0) {
                var11 = 1;
                var10 = (Object) (Object) "<img=7>";
                break L5;
              } else {
                L6: {
                  if (var13 != 1) {
                    break L6;
                  } else {
                    if (var23 == 0) {
                      var10 = (Object) (Object) "<img=7>";
                      var11 = 2;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var13 == 2) {
                  var11 = 3;
                  var10 = (Object) (Object) "<img=7>";
                  break L5;
                } else {
                  L7: {
                    if (var13 != 3) {
                      break L7;
                    } else {
                      if (var23 == 0) {
                        var11 = 4;
                        var10 = (Object) (Object) "<img=7>";
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var13 == 4) {
                    var10 = (Object) (Object) "<img=7>";
                    var11 = 5;
                    break L5;
                  } else {
                    if (var13 == 20) {
                      var11 = 10;
                      var10 = (Object) (Object) "<img=7>";
                      break L5;
                    } else {
                      if (var13 == 5) {
                        var10 = (Object) (Object) "<img=4>";
                        var11 = 1;
                        break L5;
                      } else {
                        L8: {
                          if (var13 != 6) {
                            break L8;
                          } else {
                            if (var23 == 0) {
                              var11 = 2;
                              var10 = (Object) (Object) "<img=4>";
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (7 != var13) {
                            break L9;
                          } else {
                            if (var23 == 0) {
                              var10 = (Object) (Object) "<img=4>";
                              var11 = 3;
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (var13 != 8) {
                            break L10;
                          } else {
                            if (var23 == 0) {
                              var10 = (Object) (Object) "<img=4>";
                              var11 = 4;
                              break L5;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var13 != 9) {
                            break L11;
                          } else {
                            if (var23 == 0) {
                              var11 = 5;
                              var10 = (Object) (Object) "<img=4>";
                              break L5;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (var13 == 10) {
                          var11 = 1;
                          var10 = (Object) (Object) "<img=5>";
                          var12 = 10;
                          break L5;
                        } else {
                          if (var13 == 11) {
                            var12 = 10;
                            var11 = 2;
                            var10 = (Object) (Object) "<img=5>";
                            break L5;
                          } else {
                            if (var13 == 12) {
                              var10 = (Object) (Object) "<img=5>";
                              var11 = 5;
                              var12 = 10;
                              break L5;
                            } else {
                              L12: {
                                if (var13 != 13) {
                                  break L12;
                                } else {
                                  if (var23 == 0) {
                                    var12 = 10;
                                    var11 = 10;
                                    var10 = (Object) (Object) "<img=5>";
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (var13 == 14) {
                                var10 = (Object) (Object) "<img=5>";
                                var11 = 20;
                                var12 = 10;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L13: {
              if (null != var10) {
                stackOut_102_0 = 1;
                stackIn_103_0 = stackOut_102_0;
                break L13;
              } else {
                stackOut_100_0 = 2;
                stackIn_103_0 = stackOut_100_0;
                break L13;
              }
            }
            L14: {
              var13 = stackIn_103_0;
              var8_ref = new gh((long)param1, sb.field_Y);
              cj.field_a[param1] = var8_ref;
              stackOut_103_0 = (gh) var8_ref;
              stackIn_106_0 = stackOut_103_0;
              stackIn_104_0 = stackOut_103_0;
              if (0 != param4) {
                stackOut_106_0 = (gh) (Object) stackIn_106_0;
                stackOut_106_1 = co.field_d;
                stackIn_107_0 = stackOut_106_0;
                stackIn_107_1 = stackOut_106_1;
                break L14;
              } else {
                stackOut_104_0 = (gh) (Object) stackIn_104_0;
                stackOut_104_1 = tk.field_t;
                stackIn_107_0 = stackOut_104_0;
                stackIn_107_1 = stackOut_104_1;
                break L14;
              }
            }
            L15: {
              stackIn_107_0.field_I = stackIn_107_1;
              stackOut_107_0 = (gh) var8_ref;
              stackIn_110_0 = stackOut_107_0;
              stackIn_108_0 = stackOut_107_0;
              if (param4 == 0) {
                stackOut_110_0 = (gh) (Object) stackIn_110_0;
                stackOut_110_1 = be.field_f;
                stackIn_111_0 = stackOut_110_0;
                stackIn_111_1 = stackOut_110_1;
                break L15;
              } else {
                stackOut_108_0 = (gh) (Object) stackIn_108_0;
                stackOut_108_1 = tk.field_t;
                stackIn_111_0 = stackOut_108_0;
                stackIn_111_1 = stackOut_108_1;
                break L15;
              }
            }
            L16: {
              stackIn_111_0.field_Ab = stackIn_111_1;
              var14 = 46;
              var15 = new gh(-1L, kh.field_s, var9_ref);
              var15.field_Ib = 10;
              var15.a(0, 2, 30, var14, param0 - (var14 - -10));
              if (1 != var13) {
                break L16;
              } else {
                var9_ref = bg.a(var9_ref, -(var15.field_ub * 2) + var15.field_zb, (byte) -45, var15.field_L);
                break L16;
              }
            }
            L17: {
              var9_ref = db.a("<col=1e73a1><%0></col>", -21, new String[1]);
              var15.field_S = var9_ref;
              var8_ref.a(var15, 125);
              var16 = var15.field_L.a(var15.field_S, var15.field_zb - var15.field_ub * 2, var15.field_Ib) + 6;
              int discarded$2 = 1;
              kh.a(var8_ref, "<img=1>", dn.field_Sb[param1], param1, var16, var6_int, 1000, var14);
              var16 += 14;
              if (var10 != null) {
                int discarded$3 = 1;
                kh.a(var8_ref, (String) var10, var11, param1, var16, var6_int, var12, var14);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              L19: {
                L20: {
                  var17 = new gh((long)param1, (gh) null);
                  var17.a(0, 2, 45, 2, -4 + var14);
                  var17.field_I = co.field_d;
                  var18 = ie.field_d[param1];
                  var17.field_Pb = var18.a();
                  if (!param3) {
                    break L20;
                  } else {
                    if (var7 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var19_ref_int__ = var17.field_Pb.field_E;
                var20 = 0;
                L21: while (true) {
                  if (var20 >= var19_ref_int__.length) {
                    break L19;
                  } else {
                    stackOut_123_0 = ~var19_ref_int__[var20];
                    stackOut_123_1 = -1;
                    stackIn_131_0 = stackOut_123_0;
                    stackIn_131_1 = stackOut_123_1;
                    stackIn_124_0 = stackOut_123_0;
                    stackIn_124_1 = stackOut_123_1;
                    if (var23 != 0) {
                      break L18;
                    } else {
                      L22: {
                        if (stackIn_124_0 != stackIn_124_1) {
                          var19_ref_int__[var20] = 4210752;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      var20++;
                      if (var23 == 0) {
                        continue L21;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
              }
              var8_ref.a(var17, 127);
              stackOut_130_0 = param1;
              stackOut_130_1 = 10;
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              break L18;
            }
            L23: {
              if (stackIn_131_0 == stackIn_131_1) {
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              L25: {
                if (var7 == 0) {
                  break L25;
                } else {
                  var19 = sj.field_F.field_A;
                  var20 = sj.field_F.field_F;
                  var21 = new gh(-1L, (gh) null);
                  var21.a(0, var17.field_eb - -((-var19 + var17.field_Lb) / 2), var20, var17.field_Y + (var17.field_zb - var19) / 2, var19);
                  var21.field_Pb = sj.field_F;
                  var8_ref.a(var21, 124);
                  if (var23 == 0) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              if (param4 == 0) {
                break L24;
              } else {
                var19 = 28;
                var20 = var19;
                var21 = new gh("engineer", (gh) null);
                var21.a(0, var17.field_eb - -((var17.field_Lb + -var20) / 2), var20, var17.field_Y + (-var19 + var17.field_zb) / 2, var19);
                var21.field_qb = 2;
                var21.field_I = field_b;
                var21.field_Ab = cm.field_b;
                var21.field_sb = 2;
                var21.field_Pb = aj.field_r[param4];
                var22 = new gh(-1L, (gh) null);
                var22.a(0, 0, 28, 0, 28);
                var22.field_Pb = b.field_q[param4];
                var22.field_sb = 2;
                var22.field_qb = 2;
                var21.a(var22, 119);
                var8_ref.a(var21, 127);
                break L24;
              }
            }
            stackOut_138_0 = (gh) var8_ref;
            stackIn_139_0 = stackOut_138_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var6, "lj.A(" + param0 + 44 + param1 + 44 + 1 + 44 + param3 + 44 + param4 + 44 + 49 + 41);
        }
        return stackIn_139_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Just play";
        field_i = "Find opponent";
        field_g = new String[]{"Default shoulder for the ", "<shy>, ", "<shy> and ", "-class sentinel.", "-class sentinels."};
        field_d = new rf();
        field_a = new String[16];
        field_f = "Auto-respond to <%0>";
    }
}
