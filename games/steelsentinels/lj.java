/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        String stackIn_34_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_16_0 = null;
        String stackOut_22_0 = null;
        String stackOut_27_0 = null;
        Object stackOut_35_0 = null;
        String stackOut_33_0 = null;
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
            if (!fa.a(true, (CharSequence) ((Object) param0))) {
              stackOut_3_0 = en.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (2 == qc.field_P) {
                if (wl.a(param1 ^ -2, param0)) {
                  stackOut_11_0 = o.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (pf.a(param0, -53)) {
                    stackOut_16_0 = db.a(f.field_u, -107, new String[]{param0});
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (-101 < (vd.field_h ^ -1)) {
                        break L1;
                      } else {
                        if ((rd.field_b ^ -1) < -1) {
                          break L1;
                        } else {
                          stackOut_22_0 = pf.field_m;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (-201 >= (vd.field_h ^ -1)) {
                      stackOut_27_0 = pf.field_m;
                      stackIn_28_0 = stackOut_27_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (!o.a(-32, param0)) {
                        if (param1 == -79) {
                          var3_ref = mm.field_g;
                          var3_ref.a(param2, (byte) -117);
                          var3_ref.field_p = var3_ref.field_p + 1;
                          var4 = var3_ref.field_p;
                          var3_ref.a((byte) 114, 0);
                          var3_ref.a(param0, param1 ^ 43);
                          var3_ref.b((byte) -46, -var4 + var3_ref.field_p);
                          stackOut_35_0 = null;
                          stackIn_36_0 = stackOut_35_0;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        } else {
                          stackOut_33_0 = (String) null;
                          stackIn_34_0 = stackOut_33_0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        stackOut_30_0 = db.a(qj.field_m, -68, new String[]{param0});
                        stackIn_31_0 = stackOut_30_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = ed.field_d;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("lj.E(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L2;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_31_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_34_0;
                      } else {
                        return (String) ((Object) stackIn_36_0);
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_b = null;
              field_e = null;
              field_i = null;
              field_f = null;
              field_c = null;
              if (param0 == 109) {
                break L1;
              } else {
                field_g = (String[]) null;
                break L1;
              }
            }
            field_h = null;
            field_d = null;
            field_a = null;
            field_g = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lj.B(" + param0 + ')');
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
              if (param0 == 1) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            L2: {
              var1 = null;
              var2 = null;
              if (ib.field_b != 0) {
                break L2;
              } else {
                if (ni.field_a != null) {
                  var2 = ki.field_ob;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (2 != ib.field_b) {
                break L3;
              } else {
                if (wa.b((byte) -76)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (!pf.a(bk.field_U, -59)) {
                        break L5;
                      } else {
                        var2 = db.a(wh.field_a, -110, new String[]{en.field_e});
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2 = db.a(oh.field_b, param0 ^ -11, new String[]{en.field_e});
                    break L4;
                  }
                  if (!vb.field_e) {
                    break L3;
                  } else {
                    sj.a((String) null, (String) (var2), 0, (byte) 21, (String) null, 2);
                    pm.a((byte) -110);
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (var2 != null) {
                break L6;
              } else {
                if (rg.field_f) {
                  break L6;
                } else {
                  if (null != hh.field_a) {
                    break L6;
                  } else {
                    var2 = t.field_g;
                    break L6;
                  }
                }
              }
            }
            L7: {
              L8: {
                if (null == var2) {
                  break L8;
                } else {
                  qb.a(56, v.field_e, (String) (var2), 0, (String) null);
                  if (var10 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                L10: {
                  var3 = g.field_l;
                  var3 = dh.a(-27905, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = ib.field_b;
                  var7 = 0;
                  if ((var6 ^ -1) != -3) {
                    break L10;
                  } else {
                    L11: {
                      var4 = db.a(hh.field_d, param0 + -44, new String[]{en.field_e});
                      var8 = db.a(ak.field_e, -67, new String[]{var3});
                      var7 = -485 + (vd.field_d.field_zb + (wh.field_e.field_zb + pl.field_X.c(var8) - pl.field_X.c(var4)));
                      if (-1 < (var7 ^ -1)) {
                        var7 = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (var10 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  if (-1 != (var6 ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      if (null != nf.field_b) {
                        break L13;
                      } else {
                        if (cd.field_g) {
                          var4 = "[" + kh.field_p + "] ";
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    if (null == nf.field_b) {
                      break L12;
                    } else {
                      L14: {
                        L15: {
                          if (!cc.field_lc) {
                            break L15;
                          } else {
                            if (qd.field_a == null) {
                              break L15;
                            } else {
                              var4 = "[" + qd.field_a + "] ";
                              if (var10 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        var4 = "[" + db.a(pd.field_ab, -93, new String[]{nf.field_b.field_Xb}) + "] ";
                        break L14;
                      }
                      var6 = 1;
                      break L12;
                    }
                  }
                }
                L16: {
                  if (fg.p((byte) 84)) {
                    stackOut_66_0 = ": ";
                    stackIn_67_0 = stackOut_66_0;
                    break L16;
                  } else {
                    stackOut_64_0 = "<img=3>: ";
                    stackIn_67_0 = stackOut_64_0;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    var8 = stackIn_67_0;
                    var4 = var4 + var3 + var8;
                    if (!fj.field_e) {
                      break L18;
                    } else {
                      var4 = "<col=999999>" + var4 + hk.field_Kc + "</col>";
                      var5 = "";
                      if (var10 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (!uc.field_g) {
                    break L17;
                  } else {
                    var4 = "<col=999999>" + var4 + jl.field_f + "</col>";
                    var5 = "";
                    break L17;
                  }
                }
                var9 = pl.field_X.c(var4);
                if (!fg.p((byte) -102)) {
                  L19: {
                    if (!vd.field_d.field_kb) {
                      break L19;
                    } else {
                      if (var9 > -vd.field_d.field_Rb + oh.field_f) {
                        if (fj.field_e) {
                          var1 = "Broken!";
                          break L19;
                        } else {
                          var1 = jl.field_f;
                          break L19;
                        }
                      } else {
                        break L19;
                      }
                    }
                  }
                  if ((vd.field_d.field_Eb ^ -1) == -1) {
                    break L9;
                  } else {
                    if ((vd.field_d.field_Cb ^ -1) > (var9 ^ -1)) {
                      if (fj.field_e) {
                        break L9;
                      } else {
                        pd.j(param0 + 13170);
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              }
              L20: {
                qb.a(71, ag.field_r[var6], var4 + mi.a(tf.field_g.toString()), var7, var5);
                if (jn.field_g) {
                  break L20;
                } else {
                  wh.field_e.field_kb = false;
                  break L20;
                }
              }
              if (wh.field_e.field_kb) {
                var1 = db.a(wl.field_Y, -120, new String[]{var3, en.field_e});
                break L7;
              } else {
                break L7;
              }
            }
            stackOut_101_0 = var1;
            stackIn_102_0 = stackOut_101_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (var1), "lj.D(" + param0 + ')');
        }
        return (String) ((Object) stackIn_102_0);
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
        int decompiledRegionSelector0 = 0;
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
            L1: {
              if (param2 < -20) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            if (!wa.a((byte) 30, param1, param4, param3)) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_8_0 = je.a(96, param0.a(param4, (byte) 75, param1));
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("lj.C(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (u) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static gh a(int param0, int param1, boolean param2, boolean param3, int param4, int param5) {
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
              if ((param1 ^ -1) != -35) {
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
              if (-1 == (var13 ^ -1)) {
                var11 = 1;
                var10 = "<img=7>";
                break L5;
              } else {
                L6: {
                  if (var13 != 1) {
                    break L6;
                  } else {
                    if (var23 == 0) {
                      var10 = "<img=7>";
                      var11 = 2;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var13 == 2) {
                  var11 = 3;
                  var10 = "<img=7>";
                  break L5;
                } else {
                  L7: {
                    if (var13 != 3) {
                      break L7;
                    } else {
                      if (var23 == 0) {
                        var11 = 4;
                        var10 = "<img=7>";
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var13 == 4) {
                    var10 = "<img=7>";
                    var11 = 5;
                    break L5;
                  } else {
                    if (var13 == 20) {
                      var11 = 10;
                      var10 = "<img=7>";
                      break L5;
                    } else {
                      if (var13 == 5) {
                        var10 = "<img=4>";
                        var11 = 1;
                        break L5;
                      } else {
                        L8: {
                          if ((var13 ^ -1) != -7) {
                            break L8;
                          } else {
                            if (var23 == 0) {
                              var11 = 2;
                              var10 = "<img=4>";
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
                              var10 = "<img=4>";
                              var11 = 3;
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (-9 != (var13 ^ -1)) {
                            break L10;
                          } else {
                            if (var23 == 0) {
                              var10 = "<img=4>";
                              var11 = 4;
                              break L5;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (-10 != (var13 ^ -1)) {
                            break L11;
                          } else {
                            if (var23 == 0) {
                              var11 = 5;
                              var10 = "<img=4>";
                              break L5;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if ((var13 ^ -1) == -11) {
                          var11 = 1;
                          var10 = "<img=5>";
                          var12 = 10;
                          break L5;
                        } else {
                          if (-12 == (var13 ^ -1)) {
                            var12 = 10;
                            var11 = 2;
                            var10 = "<img=5>";
                            break L5;
                          } else {
                            if (var13 == 12) {
                              var10 = "<img=5>";
                              var11 = 5;
                              var12 = 10;
                              break L5;
                            } else {
                              L12: {
                                if (-14 != (var13 ^ -1)) {
                                  break L12;
                                } else {
                                  if (var23 == 0) {
                                    var12 = 10;
                                    var11 = 10;
                                    var10 = "<img=5>";
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (-15 == (var13 ^ -1)) {
                                var10 = "<img=5>";
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
              stackOut_103_0 = (gh) (var8_ref);
              stackIn_106_0 = stackOut_103_0;
              stackIn_104_0 = stackOut_103_0;
              if (0 != param4) {
                stackOut_106_0 = (gh) ((Object) stackIn_106_0);
                stackOut_106_1 = co.field_d;
                stackIn_107_0 = stackOut_106_0;
                stackIn_107_1 = stackOut_106_1;
                break L14;
              } else {
                stackOut_104_0 = (gh) ((Object) stackIn_104_0);
                stackOut_104_1 = tk.field_t;
                stackIn_107_0 = stackOut_104_0;
                stackIn_107_1 = stackOut_104_1;
                break L14;
              }
            }
            L15: {
              stackIn_107_0.field_I = stackIn_107_1;
              stackOut_107_0 = (gh) (var8_ref);
              stackIn_110_0 = stackOut_107_0;
              stackIn_108_0 = stackOut_107_0;
              if (-1 == (param4 ^ -1)) {
                stackOut_110_0 = (gh) ((Object) stackIn_110_0);
                stackOut_110_1 = be.field_f;
                stackIn_111_0 = stackOut_110_0;
                stackIn_111_1 = stackOut_110_1;
                break L15;
              } else {
                stackOut_108_0 = (gh) ((Object) stackIn_108_0);
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
              var15.a(0, 2, -4 + (-15 + param5), var14, param0 - (var14 - -10));
              if (1 != var13) {
                break L16;
              } else {
                var9_ref = bg.a(var9_ref, -(var15.field_ub * 2) + var15.field_zb, (byte) -45, var15.field_L);
                break L16;
              }
            }
            L17: {
              var9_ref = db.a("<col=1e73a1><%0></col>", -21, new String[]{var9_ref});
              var15.field_S = var9_ref;
              var8_ref.a(var15, 125);
              var16 = var15.field_L.a(var15.field_S, var15.field_zb - var15.field_ub * 2, var15.field_Ib) + 6;
              kh.a(var8_ref, "<img=1>", dn.field_Sb[param1], param1, var16, var6_int, 1000, var14, param2);
              var16 += 14;
              if (var10 != null) {
                kh.a(var8_ref, (String) (var10), var11, param1, var16, var6_int, var12, var14, true);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              L19: {
                L20: {
                  var17 = new gh((long)param1, (gh) null);
                  var17.a(0, 2, param5 + -4, 2, -4 + var14);
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
                    stackOut_123_0 = var19_ref_int__[var20] ^ -1;
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
              if (-1 == (param4 ^ -1)) {
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
            stackOut_138_0 = (gh) (var8_ref);
            stackIn_139_0 = stackOut_138_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "lj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_139_0;
    }

    static {
        field_c = "Just play";
        field_i = "Find opponent";
        field_g = new String[]{"Default shoulder for the ", "<shy>, ", "<shy> and ", "-class sentinel.", "-class sentinels."};
        field_d = new rf();
        field_a = new String[16];
        field_f = "Auto-respond to <%0>";
    }
}
