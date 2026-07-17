/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class te {
    static int field_b;
    static String field_d;
    static String[][] field_c;
    static gh field_f;
    static int[][] field_a;
    static String field_e;

    final static int a(gh param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nk var12 = null;
        gh var13 = null;
        String var13_ref = null;
        gh var14 = null;
        String var14_ref = null;
        gh var15 = null;
        int var16 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        String stackIn_71_0 = null;
        boolean stackIn_75_0 = false;
        boolean stackIn_77_0 = false;
        boolean stackIn_78_0 = false;
        int stackIn_78_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_83_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        String stackOut_70_0 = null;
        String stackOut_68_0 = null;
        boolean stackOut_74_0 = false;
        boolean stackOut_77_0 = false;
        int stackOut_77_1 = 0;
        boolean stackOut_75_0 = false;
        int stackOut_75_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_82_0 = 0;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (fg.field_Ob != 1) {
                if (he.a((byte) 124)) {
                  break L1;
                } else {
                  stackOut_5_0 = param1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (fg.field_Ob == 1) {
                stackOut_10_0 = 78;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                stackOut_8_0 = 64;
                stackIn_11_0 = stackOut_8_0;
                break L2;
              }
            }
            L3: {
              var4_int = stackIn_11_0;
              if ((1008 & fg.field_Ob) == 0) {
                break L3;
              } else {
                var4_int = 36;
                break L3;
              }
            }
            var5 = qa.field_O;
            var7 = 1;
            var8 = 1;
            var9 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (fg.field_Ob < var8) {
                    break L6;
                  } else {
                    stackOut_15_0 = -1;
                    stackIn_83_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (var16 != 0) {
                      break L5;
                    } else {
                      L7: {
                        L8: {
                          L9: {
                            if (stackIn_16_0 != ~(fg.field_Ob & var8)) {
                              break L9;
                            } else {
                              if (var16 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            var10 = 1;
                            if (var8 == 1) {
                              break L10;
                            } else {
                              var10 = hl.field_v.f(var8, -1) ? 1 : 0;
                              break L10;
                            }
                          }
                          L11: {
                            var11 = 0;
                            if (var8 != 1) {
                              break L11;
                            } else {
                              var11 = 1;
                              break L11;
                            }
                          }
                          var12 = (nk) (Object) ao.field_H.e(13058);
                          L12: while (true) {
                            if (var12 == null) {
                              break L8;
                            } else {
                              stackOut_28_0 = ~(var8 & var12.field_Q);
                              stackOut_28_1 = -1;
                              stackIn_81_0 = stackOut_28_0;
                              stackIn_81_1 = stackOut_28_1;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              if (var16 != 0) {
                                break L7;
                              } else {
                                L13: {
                                  if (stackIn_29_0 == stackIn_29_1) {
                                    break L13;
                                  } else {
                                    L14: {
                                      var6 = 2;
                                      if (!t.a(rn.field_D, var12.field_N, -20370)) {
                                        break L14;
                                      } else {
                                        var6 = 0;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (param2) {
                                        if (var6 == 0) {
                                          break L15;
                                        } else {
                                          if (var16 == 0) {
                                            break L13;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      } else {
                                        L16: {
                                          if (var6 != 0) {
                                            break L16;
                                          } else {
                                            if (var16 == 0) {
                                              break L13;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        L17: {
                                          if (var12.field_Q != 1) {
                                            break L17;
                                          } else {
                                            if (bj.a(rn.field_D, var12.field_N, nk.f((byte) -50), (byte) 86)) {
                                              break L15;
                                            } else {
                                              if (var16 == 0) {
                                                break L13;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                        }
                                        if (!aj.a(ge.field_m, (byte) -120, rn.field_D, var12.field_N, nk.f((byte) -92))) {
                                          break L13;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    L18: {
                                      if (var6 != 2) {
                                        break L18;
                                      } else {
                                        if (~sj.field_v[var12.field_N] < ~li.field_v) {
                                          break L18;
                                        } else {
                                          var6 = 1;
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      if (var7 == 0) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var7 = 0;
                                          var13 = new gh(-1L, (gh) null);
                                          var13.field_Kb = 2;
                                          var13.field_Pb = gj.field_a;
                                          var13.a(0, param1, 18, 0, var5);
                                          param0.a(var13, 125);
                                          if (param2) {
                                            stackOut_70_0 = qj.field_c;
                                            stackIn_71_0 = stackOut_70_0;
                                            break L20;
                                          } else {
                                            stackOut_68_0 = he.field_h;
                                            stackIn_71_0 = stackOut_68_0;
                                            break L20;
                                          }
                                        }
                                        var14_ref = stackIn_71_0;
                                        var15 = new gh(-1L, kh.field_s, var14_ref);
                                        var15.field_nb = 0;
                                        var15.field_L = (mi) (Object) pl.field_U;
                                        var15.a(0, param1, 18, 0, var5);
                                        var15.field_Fb = 1;
                                        var15.field_sb = 1;
                                        var15.field_Kb = 1;
                                        var15.field_I = null;
                                        param0.a(var15, 121);
                                        param1 = param1 + var15.field_Lb;
                                        break L19;
                                      }
                                    }
                                    L21: {
                                      if (var11 != 0) {
                                        break L21;
                                      } else {
                                        var11 = 1;
                                        var13_ref = sn.field_i[var9];
                                        var14 = new gh(-1L, kh.field_s, var13_ref);
                                        var14.field_Kb = 1;
                                        var14.field_nb = 11119017;
                                        param1 += 2;
                                        var14.field_I = lj.field_b;
                                        var14.a(0, param1, 15, 0, var5);
                                        param1 += 15;
                                        param0.a(var14, 118);
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      stackOut_74_0 = param2;
                                      stackIn_77_0 = stackOut_74_0;
                                      stackIn_75_0 = stackOut_74_0;
                                      if (var10 != 0) {
                                        stackOut_77_0 = stackIn_77_0;
                                        stackOut_77_1 = 0;
                                        stackIn_78_0 = stackOut_77_0;
                                        stackIn_78_1 = stackOut_77_1;
                                        break L22;
                                      } else {
                                        stackOut_75_0 = stackIn_75_0;
                                        stackOut_75_1 = 1;
                                        stackIn_78_0 = stackOut_75_0;
                                        stackIn_78_1 = stackOut_75_1;
                                        break L22;
                                      }
                                    }
                                    int discarded$1 = 14;
                                    var13 = se.a(stackIn_78_0, stackIn_78_1 != 0, var6, var12);
                                    param1 += 2;
                                    var13.a(0, param1, var4_int, 0, var5);
                                    param0.a(var13, 127);
                                    param1 = param1 + var4_int;
                                    break L13;
                                  }
                                }
                                var12 = (nk) (Object) ao.field_H.a((byte) -48);
                                if (var16 == 0) {
                                  continue L12;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        stackOut_80_0 = var8;
                        stackOut_80_1 = 1;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1;
                        break L7;
                      }
                      var8 = stackIn_81_0 << stackIn_81_1;
                      var9++;
                      if (var16 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                stackOut_82_0 = param1;
                stackIn_83_0 = stackOut_82_0;
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var4 = decompiledCaughtException;
            stackOut_84_0 = (RuntimeException) var4;
            stackOut_84_1 = new StringBuilder().append("te.C(");
            stackIn_87_0 = stackOut_84_0;
            stackIn_87_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param0 == null) {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L23;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_88_0 = stackOut_85_0;
              stackIn_88_1 = stackOut_85_1;
              stackIn_88_2 = stackOut_85_2;
              break L23;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_88_0, stackIn_88_2 + 44 + param1 + 44 + param2 + 44 + -1 + 41);
        }
        return stackIn_83_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        kj var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ah var6 = null;
        String var7 = null;
        ah var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_14_0 = 0;
        ah stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        ah stackIn_55_2 = null;
        ah stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        ah stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        ah stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        ah stackOut_54_2 = null;
        ah stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        ah stackOut_63_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            var1_ref = rf.field_d;
            var2 = var1_ref.f((byte) -109);
            if (var2 == 0) {
              L1: {
                if (db.field_h != null) {
                  break L1;
                } else {
                  db.field_h = new dk(128);
                  cc.field_gc = 0;
                  break L1;
                }
              }
              L2: {
                if (1 != var1_ref.f((byte) -111)) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_14_0;
                  var4_ref_String = var1_ref.h(1);
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    var5 = var1_ref.h(1);
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L3;
              }
              L5: {
                int discarded$5 = -41;
                var6 = da.a(var4_ref_String);
                var7 = var1_ref.h(1);
                var8 = ui.a(1, (CharSequence) (Object) var4_ref_String);
                if (var8 == null) {
                  var8 = var4_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (null != var6) {
                  break L6;
                } else {
                  int discarded$6 = -41;
                  var6 = da.a(var7);
                  if (null == var6) {
                    break L6;
                  } else {
                    db.field_h.a((kd) (Object) var6, 1, (long)var8.hashCode());
                    break L6;
                  }
                }
              }
              L7: {
                if (null == var6) {
                  var6 = new ah();
                  db.field_h.a((kd) (Object) var6, 1, (long)var8.hashCode());
                  int fieldTemp$7 = cc.field_gc;
                  cc.field_gc = cc.field_gc + 1;
                  var6.field_bc = fieldTemp$7;
                  am.field_c.a(3, (ck) (Object) var6);
                  break L7;
                } else {
                  break L7;
                }
              }
              var6.field_Tb = var5;
              var6.field_dc = var4_ref_String;
              var6.field_Vb = var7;
              return;
            } else {
              if (1 == var2) {
                L8: {
                  if (pi.field_a != null) {
                    break L8;
                  } else {
                    pi.field_a = new dk(128);
                    vd.field_h = 0;
                    break L8;
                  }
                }
                L9: {
                  var3 = var1_ref.h(1);
                  if (!var3.equals((Object) (Object) "")) {
                    break L9;
                  } else {
                    var3 = null;
                    break L9;
                  }
                }
                L10: {
                  var4_ref_String = var1_ref.h(1);
                  var5 = var1_ref.h(1);
                  var6 = wi.a(var4_ref_String, (byte) 122);
                  if (var6 == null) {
                    var6 = wi.a(var5, (byte) 114);
                    if (null != var6) {
                      pi.field_a.a((kd) (Object) var6, 1, (long)ui.a(1, (CharSequence) (Object) var4_ref_String).hashCode());
                      break L10;
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (null != var6) {
                    break L11;
                  } else {
                    var6 = new ah();
                    pi.field_a.a((kd) (Object) var6, 1, (long)ui.a(1, (CharSequence) (Object) var4_ref_String).hashCode());
                    int fieldTemp$8 = vd.field_h;
                    vd.field_h = vd.field_h + 1;
                    var6.field_bc = fieldTemp$8;
                    ea.field_c.a(3, (ck) (Object) var6);
                    break L11;
                  }
                }
                L12: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var6.field_dc = var4_ref_String;
                var6.field_ac = var3;
                var6.field_Vb = var5;
                var6.b(4);
                var7_ref = (ah) (Object) ea.field_c.e(13058);
                L13: while (true) {
                  L14: {
                    L15: {
                      L16: {
                        if (null == var7_ref) {
                          break L16;
                        } else {
                          stackOut_54_0 = (ah) var7_ref;
                          stackOut_54_1 = 22635;
                          stackOut_54_2 = (ah) var6;
                          stackIn_65_0 = stackOut_54_0;
                          stackIn_65_1 = stackOut_54_1;
                          stackIn_65_2 = stackOut_54_2;
                          stackIn_55_0 = stackOut_54_0;
                          stackIn_55_1 = stackOut_54_1;
                          stackIn_55_2 = stackOut_54_2;
                          if (var9 != 0) {
                            break L15;
                          } else {
                            if (!dm.a(stackIn_55_0, stackIn_55_1, stackIn_55_2)) {
                              break L16;
                            } else {
                              var7_ref = (ah) (Object) ea.field_c.a((byte) -17);
                              if (var9 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      L17: {
                        if (null != var7_ref) {
                          break L17;
                        } else {
                          ea.field_c.a(3, (ck) (Object) var6);
                          if (var9 == 0) {
                            break L14;
                          } else {
                            break L17;
                          }
                        }
                      }
                      stackOut_63_0 = (ah) var7_ref;
                      stackOut_63_1 = 30;
                      stackOut_63_2 = (ah) var6;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      stackIn_65_2 = stackOut_63_2;
                      break L15;
                    }
                    ie.a((ck) (Object) stackIn_65_0, stackIn_65_1, (ck) (Object) stackIn_65_2);
                    break L14;
                  }
                  return;
                }
              } else {
                if (var2 == 2) {
                  L18: {
                    if (qc.field_P != 1) {
                      break L18;
                    } else {
                      qc.field_P = 2;
                      break L18;
                    }
                  }
                  return;
                } else {
                  if (3 == var2) {
                    L19: {
                      if (qc.field_P == 2) {
                        qc.field_P = 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    return;
                  } else {
                    if (4 == var2) {
                      qc.field_P = 1;
                      var3 = var1_ref.h(1);
                      nn.field_f = var3.intern();
                      var4 = var1_ref.f((byte) -90);
                      in.a((byte) 46, var4);
                      return;
                    } else {
                      int discarded$9 = 94;
                      sj.a("F1: " + ci.a(), -95, (Throwable) null);
                      pm.m(75);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "te.B(" + 2 + 41);
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_f = null;
            field_d = null;
            field_e = null;
            field_c = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "te.A(" + -83 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your request to join has been declined.";
        field_c = new String[][]{new String[2], new String[5], new String[6]};
        field_a = new int[][]{null, null, new int[6]};
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
