/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class VoidHunters extends ms {
    private int field_B;
    private int field_D;
    private phb field_F;
    static int[] field_E;
    private int field_C;
    public static int field_G;

    private final void a(int param0, cl param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = field_G;
        try {
          L0: {
            L1: {
              if (((VoidHunters) this).field_D == -1) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= param1.field_a.length) {
                    break L1;
                  } else {
                    fi.field_o.b(param1.field_a[var4_int], (byte) 18, var4_int);
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                fi.field_o.a((byte) 125, 4000, param1);
                break L1;
              }
            }
            ((VoidHunters) this).field_D = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("VoidHunters.O(").append(-23134).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(boolean param0, Object param1) {
        int var2_int = 0;
        Object[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = field_G;
        try {
          L0: {
            L1: {
              if (!ls.field_q) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  var2_int = 0;
                  L2: while (true) {
                    if (var2_int >= hh.field_o) {
                      L3: {
                        if (param0) {
                          break L3;
                        } else {
                          field_E = null;
                          break L3;
                        }
                      }
                      L4: {
                        if (hh.field_o == ug.field_o.length) {
                          var5 = new Object[ug.field_o.length + 1];
                          var2 = var5;
                          var3 = 0;
                          L5: while (true) {
                            if (var3 >= ug.field_o.length) {
                              ug.field_o = var2;
                              break L4;
                            } else {
                              var5[var3] = ug.field_o[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      Object[] fieldTemp$4 = ug.field_o;
                      int fieldTemp$5 = hh.field_o;
                      hh.field_o = hh.field_o + 1;
                      fieldTemp$4[fieldTemp$5] = param1;
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      if (ug.field_o[var2_int] != param1) {
                        var2_int++;
                        continue L2;
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("VoidHunters.B(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    private final static void m(int param0) {
        vj.e(-1);
        oc.a(-1);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, boolean param6, boolean param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (0 == jba.field_b.field_o) {
                break L1;
              } else {
                if (erb.field_p) {
                  break L1;
                } else {
                  if (hb.field_c) {
                    or.a(0);
                    break L1;
                  } else {
                    fva.field_p = true;
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param6) {
                break L2;
              } else {
                field_E = null;
                break L2;
              }
            }
            L3: {
              if (!fva.field_p) {
                break L3;
              } else {
                mrb.a(param0, param1, 20, param5, false, param3, param3, param4, param2);
                qw.field_l.a(param7, 1332);
                if (param7) {
                  L4: {
                    if (fhb.field_q.field_o == 0) {
                      break L4;
                    } else {
                      fva.field_p = false;
                      break L4;
                    }
                  }
                  if (dp.field_a.field_o != 0) {
                    dr.a(26718);
                    fva.field_p = false;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var8;
            stackOut_16_1 = new StringBuilder().append("VoidHunters.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void f(boolean param0) {
        if (null != wba.field_o) {
            return;
        }
        String var2 = ro.a("fog_voidhunters_ship", 74, vpa.b((byte) -125));
        nkb.a(false, "Ship cookie=" + var2);
        if (!(var2 == null)) {
            hja.a(0, hta.a(var2, true, true));
        }
    }

    public final void init() {
        ((VoidHunters) this).a("voidhunters", -74, 27);
    }

    private final void a(int param0, int param1) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        int var7 = 0;
        uca var8 = null;
        int stackIn_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        var7 = field_G;
        if (param0 != 9) {
          L0: {
            if (param0 != 14) {
              if (param0 == 15) {
                L1: {
                  nkb.a(false, "Leaving lobby");
                  if (jkb.field_a) {
                    olb.d(991426348);
                    vjb.a((byte) 110);
                    tr.a(-15400);
                    enb.field_b = true;
                    idb.field_o = false;
                    bg.field_o = false;
                    nhb.field_p = false;
                    wgb.field_f = 0;
                    aeb.field_a = true;
                    jkb.field_a = false;
                    lsb.a(true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                lu.field_d = false;
                dua.field_o = false;
                return;
              } else {
                L2: {
                  if (param0 != 10) {
                    break L2;
                  } else {
                    if (jkb.field_a) {
                      ie.a(13);
                      nkb.a(false, "Lobby packet");
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 == 57) {
                    break L3;
                  } else {
                    if (param0 == 58) {
                      break L3;
                    } else {
                      if (59 == param0) {
                        L4: {
                          nkb.a(false, "Stop game packet");
                          if (null == vqa.field_g) {
                            break L4;
                          } else {
                            if (vqa.field_g.field_N) {
                              break L4;
                            } else {
                              return;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            nkb.a(false, "Stop game! playing=" + idb.field_o + ", spectating=" + nhb.field_p);
                            if (idb.field_o) {
                              break L6;
                            } else {
                              if (nhb.field_p) {
                                break L6;
                              } else {
                                if (!di.field_l.a(-28208)) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            olb.d(991426348);
                            if (null != vqa.field_g) {
                              break L7;
                            } else {
                              idb.field_o = false;
                              break L7;
                            }
                          }
                          L8: {
                            if (!idb.field_o) {
                              break L8;
                            } else {
                              vqa.field_g.a(false, -10510);
                              break L8;
                            }
                          }
                          bg.field_o = false;
                          idb.field_o = false;
                          wgb.field_f = -2;
                          nhb.field_p = false;
                          aeb.field_a = true;
                          aka.field_p = true;
                          lsb.a(true);
                          break L5;
                        }
                        di.field_l.a(true);
                        dua.field_o = false;
                        return;
                      } else {
                        L9: {
                          var3 = null;
                          if (!idb.field_o) {
                            if (!nhb.field_p) {
                              break L9;
                            } else {
                              var3 = (Object) (Object) ndb.field_a;
                              break L9;
                            }
                          } else {
                            var3 = (Object) (Object) vqa.field_g;
                            break L9;
                          }
                        }
                        if (param0 == 62) {
                          L10: {
                            nkb.a(false, "Game finished packet");
                            if (var3 != null) {
                              L11: {
                                if (bqa.a(false)) {
                                  stackOut_56_0 = 7;
                                  stackIn_57_0 = stackOut_56_0;
                                  break L11;
                                } else {
                                  stackOut_55_0 = 0;
                                  stackIn_57_0 = stackOut_55_0;
                                  break L11;
                                }
                              }
                              lha.a(stackIn_57_0, false, (byte) -85, -1);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          return;
                        } else {
                          if (param0 != 63) {
                            L12: {
                              if (param0 == 64) {
                                L13: {
                                  var4 = qga.field_b.e((byte) -90);
                                  if (var3 == null) {
                                    break L13;
                                  } else {
                                    if (!di.field_l.a(-28208)) {
                                      ((uca) var3).field_m.field_j = var4;
                                      return;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                di.field_l.a(-29804, var4);
                                break L12;
                              } else {
                                if (param0 != 65) {
                                  if (param0 == 66) {
                                    L14: {
                                      var4 = qga.field_b.e((byte) -128);
                                      if (var3 != null) {
                                        ((uca) var3).field_B = var4;
                                        if (null == vqa.field_g) {
                                          return;
                                        } else {
                                          cqb.b(-106);
                                          break L14;
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                    return;
                                  } else {
                                    if (ir.a(-53, param0)) {
                                      return;
                                    } else {
                                      L15: {
                                        L16: {
                                          if (param0 == 11) {
                                            break L16;
                                          } else {
                                            if (12 != param0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        if (vqa.field_g == null) {
                                          break L15;
                                        } else {
                                          if (!vqa.field_g.field_N) {
                                            break L15;
                                          } else {
                                            if (idb.field_o) {
                                              ana discarded$1 = lha.a(-118, fa.field_d[5]);
                                              break L15;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      L17: {
                                        var5 = null;
                                        if (var3 == null) {
                                          break L17;
                                        } else {
                                          var5 = (Object) (Object) ((uca) var3).field_m.field_l;
                                          break L17;
                                        }
                                      }
                                      if (di.field_l.a(dpa.field_p, qga.field_b, idb.field_o, (byte) 7, param0, (mib) var5)) {
                                        return;
                                      } else {
                                        ((VoidHunters) this).e(97);
                                        return;
                                      }
                                    }
                                  }
                                } else {
                                  L18: {
                                    var4 = qga.field_b.e((byte) -110);
                                    if (var3 != null) {
                                      ((uca) var3).field_m.field_k = var4;
                                      if (null == vqa.field_g) {
                                        break L12;
                                      } else {
                                        cqb.b(-90);
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            return;
                          } else {
                            L19: {
                              var4 = qga.field_b.e((byte) -107);
                              if (var3 != null) {
                                ((uca) var3).field_m.field_f = var4;
                                if (null == vqa.field_g) {
                                  break L0;
                                } else {
                                  sna.d(-19057);
                                  break L19;
                                }
                              } else {
                                break L19;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                L20: {
                  nkb.a(false, "Start game packet");
                  olb.d(991426348);
                  vqa.field_g = null;
                  ndb.field_a = null;
                  var8 = nia.a(param0, di.field_l, qga.field_b, (byte) 120);
                  var3 = (Object) (Object) var8;
                  if (var8 != null) {
                    L21: {
                      mjb.field_e = false;
                      aka.field_p = false;
                      if (param0 == 57) {
                        vqa.field_g = (uca) var3;
                        idb.field_o = true;
                        sna.d(-19057);
                        cqb.b(-126);
                        jgb.e((byte) -76);
                        break L21;
                      } else {
                        nhb.field_p = true;
                        ndb.field_a = var8;
                        break L21;
                      }
                    }
                    dua.field_o = false;
                    wgb.field_f = -1;
                    bg.field_o = true;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                return;
              }
            } else {
              L22: {
                L23: {
                  nkb.a(false, "Entering lobby");
                  am.a(shb.field_o, jrb.a(0), hj.a(8, (byte) -99), hj.a(2000, (byte) -116), jrb.b(false), true, ms.field_A.length, 150, 1024, sua.a(207));
                  plb.a(hia.a(0), dm.i((byte) -90), true);
                  jkb.field_a = true;
                  lu.field_d = false;
                  if (vqa.field_g == null) {
                    break L23;
                  } else {
                    if (!vqa.field_g.field_N) {
                      vga.field_b = 0;
                      aka.field_p = false;
                      jgb.e((byte) -86);
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                if (vqa.field_g == null) {
                  olb.d(991426348);
                  wgb.field_f = -2;
                  aka.field_p = true;
                  lsb.a(true);
                  break L0;
                } else {
                  break L22;
                }
              }
              return;
            }
          }
          return;
        } else {
          olb.d(991426348);
          lu.field_d = false;
          wgb.field_f = 6;
          iia.field_c = qga.field_b.a(-1);
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ea var7 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_141_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        L0: {
          var6 = field_G;
          aqb.field_f = ria.a(32);
          lgb.field_o = gia.d(-2);
          ji.e(200);
          if (psb.field_b == null) {
            break L0;
          } else {
            if (psb.field_b.field_a) {
              cqb.b((byte) 116);
              gva.a((byte) -115);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          stackOut_4_0 = this;
          stackIn_6_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (psb.field_b == null) {
            stackOut_6_0 = this;
            stackOut_6_1 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          } else {
            stackOut_5_0 = this;
            stackOut_5_1 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            break L1;
          }
        }
        L2: {
          ((VoidHunters) this).b(stackIn_7_1 != 0, 9);
          if (!gwa.field_o) {
            break L2;
          } else {
            eu.field_i.b((byte) 1);
            gwa.field_o = false;
            break L2;
          }
        }
        L3: {
          var2 = -40 % ((23 - param0) / 61);
          kdb.field_o = kdb.field_o + 1;
          if (!fu.a(51)) {
            break L3;
          } else {
            fka.a("Servicing login...", (byte) -86);
            ((VoidHunters) this).h(0);
            if (!fu.a(119)) {
              break L3;
            } else {
              return;
            }
          }
        }
        L4: {
          if (!uob.field_e) {
            fka.a("Servicing login_create_ui...", (byte) -85);
            ala.a(tcb.field_o, 15877);
            fka.a("Finished servicing login_create_ui...", (byte) -72);
            if (!this.h((byte) 125)) {
              break L4;
            } else {
              uob.field_e = true;
              break L4;
            }
          } else {
            if (!hkb.b(-1)) {
              rl.b(false);
              if (!ar.field_d) {
                break L4;
              } else {
                if (!this.l(0)) {
                  break L4;
                } else {
                  if (uc.b(-116)) {
                    break L4;
                  } else {
                    wu.a(true, false);
                    break L4;
                  }
                }
              }
            } else {
              if (tjb.l(0)) {
                L5: {
                  stackOut_24_0 = this;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (psb.field_b == null) {
                    stackOut_26_0 = this;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L5;
                  } else {
                    stackOut_25_0 = this;
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var3 = ((VoidHunters) this).c(stackIn_27_1 != 0, -9288);
                    if (1 == var3) {
                      break L7;
                    } else {
                      if (var3 != 2) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (psb.field_b != null) {
                      cqb.b((byte) -56);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (2 != var3) {
                    break L6;
                  } else {
                    VoidHunters.a(vpa.b((byte) -118), 4);
                    break L6;
                  }
                }
                this.d(true, -121);
                break L4;
              } else {
                if (!ffa.a(false)) {
                  if (ck.b(false)) {
                    this.d(true, -126);
                    break L4;
                  } else {
                    this.d(false, -124);
                    break L4;
                  }
                } else {
                  if (wp.field_b == wp.field_a) {
                    L9: {
                      var3 = vdb.d(-31515);
                      if (var3 != 1) {
                        break L9;
                      } else {
                        kua.field_e = true;
                        ta.a((byte) -121, 0);
                        break L9;
                      }
                    }
                    this.d(true, -127);
                    break L4;
                  } else {
                    this.d(false, -122);
                    break L4;
                  }
                }
              }
            }
          }
        }
        L10: {
          di.field_l.a(dpa.field_p, -114);
          if (fda.e((byte) 111)) {
            break L10;
          } else {
            L11: while (true) {
              var7 = (ea) (Object) qa.field_o.a(true);
              if (var7 == null) {
                break L10;
              } else {
                dba.a(4, var7, 0);
                continue L11;
              }
            }
          }
        }
        L12: while (true) {
          if (!rhb.a(0, ta.field_b)) {
            L13: {
              ui.a(0, -29008);
              if (aka.field_p) {
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (null == di.field_l) {
                break L14;
              } else {
                if (idb.field_o) {
                  break L14;
                } else {
                  if (nhb.field_p) {
                    break L14;
                  } else {
                    if (di.field_l.field_m.c(0) > 0) {
                      break L14;
                    } else {
                      di.field_l.a((byte) -110);
                      break L14;
                    }
                  }
                }
              }
            }
            L15: {
              if (!ssa.b(2)) {
                if (vqa.field_g != null) {
                  if (vqa.field_g.field_m.field_l.field_k) {
                    L16: {
                      if (null != di.field_l) {
                        if (null != di.field_l.field_j) {
                          stackOut_121_0 = 0;
                          stackIn_123_0 = stackOut_121_0;
                          break L16;
                        } else {
                          L17: {
                            if (wh.g(-114)) {
                              if (si.field_o[82]) {
                                if (si.field_o[35]) {
                                  stackOut_118_0 = 1;
                                  stackIn_120_0 = stackOut_118_0;
                                  break L17;
                                } else {
                                  stackOut_117_0 = 0;
                                  stackIn_120_0 = stackOut_117_0;
                                  break L17;
                                }
                              } else {
                                stackOut_115_0 = 0;
                                stackIn_120_0 = stackOut_115_0;
                                break L17;
                              }
                            } else {
                              stackOut_113_0 = 0;
                              stackIn_120_0 = stackOut_113_0;
                              break L17;
                            }
                          }
                          var3 = stackIn_120_0;
                          break L15;
                        }
                      } else {
                        stackOut_110_0 = 0;
                        stackIn_123_0 = stackOut_110_0;
                        break L16;
                      }
                    }
                    var3 = stackIn_123_0;
                    break L15;
                  } else {
                    L18: {
                      L19: {
                        if (ndb.field_a != null) {
                          if (!ndb.field_a.field_m.field_l.field_k) {
                            stackOut_105_0 = 0;
                            stackIn_107_0 = stackOut_105_0;
                            break L19;
                          } else {
                            L20: {
                              if (null != di.field_l) {
                                if (null == di.field_l.field_j) {
                                  if (wh.g(-114)) {
                                    if (si.field_o[82]) {
                                      if (si.field_o[35]) {
                                        stackOut_102_0 = 1;
                                        stackIn_104_0 = stackOut_102_0;
                                        break L20;
                                      } else {
                                        stackOut_101_0 = 0;
                                        stackIn_104_0 = stackOut_101_0;
                                        break L20;
                                      }
                                    } else {
                                      stackOut_99_0 = 0;
                                      stackIn_104_0 = stackOut_99_0;
                                      break L20;
                                    }
                                  } else {
                                    stackOut_97_0 = 0;
                                    stackIn_104_0 = stackOut_97_0;
                                    break L20;
                                  }
                                } else {
                                  stackOut_94_0 = 0;
                                  stackIn_104_0 = stackOut_94_0;
                                  break L20;
                                }
                              } else {
                                stackOut_92_0 = 0;
                                stackIn_104_0 = stackOut_92_0;
                                break L20;
                              }
                            }
                            var3 = stackIn_104_0;
                            break L18;
                          }
                        } else {
                          stackOut_89_0 = 0;
                          stackIn_107_0 = stackOut_89_0;
                          break L19;
                        }
                      }
                      var3 = stackIn_107_0;
                      break L18;
                    }
                    break L15;
                  }
                } else {
                  L21: {
                    if (ndb.field_a != null) {
                      if (!ndb.field_a.field_m.field_l.field_k) {
                        stackOut_84_0 = 0;
                        stackIn_86_0 = stackOut_84_0;
                        break L21;
                      } else {
                        L22: {
                          L23: {
                            if (null != di.field_l) {
                              if (null != di.field_l.field_j) {
                                stackOut_80_0 = 0;
                                stackIn_82_0 = stackOut_80_0;
                                break L23;
                              } else {
                                L24: {
                                  if (wh.g(-114)) {
                                    if (si.field_o[82]) {
                                      if (si.field_o[35]) {
                                        stackOut_77_0 = 1;
                                        stackIn_79_0 = stackOut_77_0;
                                        break L24;
                                      } else {
                                        stackOut_76_0 = 0;
                                        stackIn_79_0 = stackOut_76_0;
                                        break L24;
                                      }
                                    } else {
                                      stackOut_74_0 = 0;
                                      stackIn_79_0 = stackOut_74_0;
                                      break L24;
                                    }
                                  } else {
                                    stackOut_72_0 = 0;
                                    stackIn_79_0 = stackOut_72_0;
                                    break L24;
                                  }
                                }
                                var3 = stackIn_79_0;
                                break L22;
                              }
                            } else {
                              stackOut_69_0 = 0;
                              stackIn_82_0 = stackOut_69_0;
                              break L23;
                            }
                          }
                          var3 = stackIn_82_0;
                          break L22;
                        }
                        break L15;
                      }
                    } else {
                      stackOut_66_0 = 0;
                      stackIn_86_0 = stackOut_66_0;
                      break L21;
                    }
                  }
                  var3 = stackIn_86_0;
                  break L15;
                }
              } else {
                L25: {
                  if (wh.g(-114)) {
                    if (si.field_o[82]) {
                      if (si.field_o[35]) {
                        stackOut_61_0 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        break L25;
                      } else {
                        stackOut_60_0 = 0;
                        stackIn_63_0 = stackOut_60_0;
                        break L25;
                      }
                    } else {
                      stackOut_58_0 = 0;
                      stackIn_63_0 = stackOut_58_0;
                      break L25;
                    }
                  } else {
                    stackOut_56_0 = 0;
                    stackIn_63_0 = stackOut_56_0;
                    break L25;
                  }
                }
                var3 = stackIn_63_0;
                break L15;
              }
            }
            L26: {
              if (var3 == 0) {
                break L26;
              } else {
                ifb.l(-118);
                break L26;
              }
            }
            L27: {
              if (!nb.b(true)) {
                break L27;
              } else {
                L28: {
                  L29: {
                    di.field_l.c((byte) -94);
                    var4 = ((VoidHunters) this).f(109);
                    if (var4 == 0) {
                      break L29;
                    } else {
                      if (var4 == 1) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  iwa.a((byte) -30, 2);
                  bta.a(50, 4);
                  qf.a(6, (byte) -52);
                  md.b(5, 0);
                  wq.a(-115);
                  if (1 == var4) {
                    L30: {
                      if (vqa.field_g == null) {
                        break L30;
                      } else {
                        if (!vqa.field_g.field_N) {
                          break L28;
                        } else {
                          break L30;
                        }
                      }
                    }
                    dua.field_o = true;
                    lu.field_d = true;
                    break L28;
                  } else {
                    L31: {
                      if (!jkb.field_a) {
                        break L31;
                      } else {
                        L32: {
                          aeb.field_a = true;
                          enb.field_b = true;
                          bg.field_o = false;
                          if (!idb.field_o) {
                            L33: {
                              if (!bqa.a(false)) {
                                stackOut_140_0 = 0;
                                stackIn_141_0 = stackOut_140_0;
                                break L33;
                              } else {
                                stackOut_139_0 = 7;
                                stackIn_141_0 = stackOut_139_0;
                                break L33;
                              }
                            }
                            lha.a(stackIn_141_0, false, (byte) -85, 0);
                            break L32;
                          } else {
                            L34: {
                              iia.field_c = hsa.field_o;
                              if (bqa.a(false)) {
                                stackOut_136_0 = 7;
                                stackIn_137_0 = stackOut_136_0;
                                break L34;
                              } else {
                                stackOut_135_0 = 0;
                                stackIn_137_0 = stackOut_135_0;
                                break L34;
                              }
                            }
                            lha.a(stackIn_137_0, false, (byte) -85, 6);
                            break L32;
                          }
                        }
                        olb.d(991426348);
                        lo.field_a[oab.field_o].a(false, 320, 0);
                        jkb.field_a = false;
                        idb.field_o = false;
                        nhb.field_p = false;
                        lsb.a(true);
                        break L31;
                      }
                    }
                    lu.field_d = false;
                    dua.field_o = false;
                    break L28;
                  }
                }
                L35: {
                  var5 = 0;
                  if (2 != var4) {
                    break L35;
                  } else {
                    var5 = 1;
                    break L35;
                  }
                }
                L36: {
                  if (var3 == 0) {
                    break L36;
                  } else {
                    var5 = 1;
                    break L36;
                  }
                }
                L37: {
                  L38: {
                    if (jkb.field_a) {
                      break L38;
                    } else {
                      if (lu.field_d) {
                        break L38;
                      } else {
                        if (!dua.field_o) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                  }
                  var5 = 1;
                  break L37;
                }
                L39: {
                  if (nb.b(true)) {
                    break L39;
                  } else {
                    var5 = 0;
                    break L39;
                  }
                }
                if (var5 != 0) {
                  km.f((byte) -119);
                  break L27;
                } else {
                  break L27;
                }
              }
            }
            return;
          } else {
            var3 = ow.field_a;
            this.a(var3, 12);
            continue L12;
          }
        }
    }

    private final boolean l(int param0) {
        return gcb.field_p;
    }

    private final void a(cl param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = field_G;
        try {
          L0: {
            L1: {
              if (((VoidHunters) this).field_C != -1) {
                uga.field_g.a((byte) -115, 4000, param0);
                break L1;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (param0.field_a.length <= var4_int) {
                    break L1;
                  } else {
                    uga.field_g.b(param0.field_a[var4_int], (byte) 18, var4_int);
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            ((VoidHunters) this).field_C = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("VoidHunters.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -19653 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        ((VoidHunters) this).a(false, 110, 92);
        eu.field_i = new fcb();
        hbb var6 = new hbb();
        var6.a(128, (byte) 96, 9);
        fi.field_o = new fdb();
        uga.field_g = new fdb((hbb) (Object) fi.field_o);
        hbb var3 = new hbb();
        dra var4 = new dra((hbb) (Object) fi.field_o, (hbb) (Object) uga.field_g, var3);
        kr.a((byte) -32, true, bm.field_o, (java.awt.Component) (Object) igb.field_a, var4, 22050);
        vfa var5 = new vfa((nka) (Object) new iab());
        var5.field_i = 0;
        var5.field_b = false;
        gv.a(var5, 20);
        uu.a((byte) 90, ta.field_b, (ms) this);
        pcb.a(114, param0, false);
        di.field_l = new kda();
        dva.e((byte) 117);
        this.f(false);
        fwa.field_g = new coa();
        fwa.field_g.a((byte) -65);
        hjb.field_o = rrb.b(-89);
        qcb.field_o = tc.field_b;
        ncb.field_a = sbb.field_o;
        if (!(!ef.field_E)) {
            ll.e((byte) -120);
            jha.field_p = mva.a(jha.field_p, 68, (Object) (Object) "graphics_quality");
            aw.a(false);
            nl.a(mva.a(kt.field_l, 93, (Object) (Object) "fx_volume"), -13205);
            re.a(mva.a(hlb.field_p, 21, (Object) (Object) "music_volume"), (byte) -99);
            eaa.field_q = mva.a(eaa.field_q, 36, (Object) (Object) "graphics_mode");
        }
    }

    public static void n(int param0) {
        field_E = null;
        if (param0 != 0) {
            Object var2 = null;
            VoidHunters.a(-6, -55, -125, 73, (String) null, -128, true, true);
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        uca var4 = null;
        int var5 = 0;
        int var6_int = 0;
        cl var6 = null;
        int var7 = 0;
        int var8 = 0;
        cl var9 = null;
        cl var10 = null;
        cl var11 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var7 = field_G;
            if (vqa.field_g != null) {
              break L1;
            } else {
              if (null == ndb.field_a) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          var2 = stackIn_5_0;
          var3 = 28;
          if (var2 != 0) {
            L3: {
              if ((Object) (Object) ew.field_p.field_n == (Object) (Object) uga.field_g) {
                break L3;
              } else {
                if (((VoidHunters) this).field_B <= 0) {
                  ew.field_p.a(-126, pab.field_k[1], 100, 1000000);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            ((VoidHunters) this).field_D = -1;
            break L2;
          } else {
            L4: {
              if ((Object) (Object) ew.field_p.field_n != (Object) (Object) fi.field_o) {
                ew.field_p.a(-127, pab.field_k[0], 100, 1000000);
                break L4;
              } else {
                break L4;
              }
            }
            ((VoidHunters) this).field_C = -1;
            break L2;
          }
        }
        L5: {
          if (((VoidHunters) this).field_B > 0) {
            ((VoidHunters) this).field_B = ((VoidHunters) this).field_B - 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var2 == 0) {
            break L6;
          } else {
            if (wqa.a(false, oab.field_o)) {
              if (4 == ((VoidHunters) this).field_C) {
                break L6;
              } else {
                var9 = new cl();
                var9.field_a[0] = 255;
                this.a(var9, -19653, 4);
                break L6;
              }
            } else {
              L7: {
                var4 = vqa.field_g;
                if (var4 == null) {
                  var4 = ndb.field_a;
                  break L7;
                } else {
                  break L7;
                }
              }
              if (var4 != null) {
                L8: {
                  var5 = var4.k(-18620);
                  if (var5 == 5) {
                    if (((VoidHunters) this).field_B <= 0) {
                      var6_int = 0;
                      L9: while (true) {
                        if (var6_int >= 16) {
                          be.a(32, false, pab.field_k[2]);
                          ((VoidHunters) this).field_B = 500;
                          break L8;
                        } else {
                          uga.field_g.b(0, (byte) 18, var6_int);
                          var6_int++;
                          continue L9;
                        }
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    if (6 == var5) {
                      if (((VoidHunters) this).field_B > 0) {
                        break L8;
                      } else {
                        var6_int = 0;
                        L10: while (true) {
                          if (var6_int >= 16) {
                            be.a(32, false, pab.field_k[3]);
                            ((VoidHunters) this).field_B = 500;
                            break L8;
                          } else {
                            uga.field_g.b(0, (byte) 18, var6_int);
                            var6_int++;
                            continue L10;
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                if (~var5 != ~((VoidHunters) this).field_C) {
                  L11: {
                    var6 = new cl();
                    if (0 == var5) {
                      var6.field_a[0] = 255;
                      var6.field_a[5] = 255;
                      var6.field_a[8] = 255;
                      var6.field_a[7] = 255;
                      break L11;
                    } else {
                      if (var5 == 1) {
                        var6.field_a[6] = 255;
                        var6.field_a[7] = 255;
                        var6.field_a[9] = 255;
                        var6.field_a[10] = 255;
                        var6.field_a[3] = 255;
                        var6.field_a[0] = 255;
                        var6.field_a[15] = 255;
                        var6.field_a[8] = 255;
                        var6.field_a[5] = 255;
                        break L11;
                      } else {
                        if (var5 == 2) {
                          var6.field_a[14] = 255;
                          var6.field_a[13] = 255;
                          var6.field_a[15] = 255;
                          var6.field_a[8] = 255;
                          var6.field_a[11] = 255;
                          var6.field_a[2] = 255;
                          var6.field_a[12] = 255;
                          var6.field_a[1] = 255;
                          break L11;
                        } else {
                          if (var5 == 3) {
                            var6.field_a[4] = 255;
                            break L11;
                          } else {
                            this.a(var6, -19653, var5);
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  this.a(var6, -19653, var5);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
          }
        }
        L12: {
          if (!wqa.a(false, oab.field_o)) {
            L13: {
              if (oab.field_o != -2) {
                break L13;
              } else {
                if (((VoidHunters) this).field_D == 1) {
                  break L13;
                } else {
                  var11 = new cl();
                  var11.field_a[14] = 255;
                  this.a(-23134, var11, 1);
                  break L13;
                }
              }
            }
            break L12;
          } else {
            if (var2 != 0) {
              break L12;
            } else {
              if (((VoidHunters) this).field_D != 0) {
                var10 = new cl();
                var8 = 0;
                var5 = var8;
                L14: while (true) {
                  if (var8 >= var10.field_a.length) {
                    var10.field_a[14] = 0;
                    this.a(-23134, var10, 0);
                    break L12;
                  } else {
                    var10.field_a[var8] = 255;
                    var8++;
                    continue L14;
                  }
                }
              } else {
                break L12;
              }
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                  if (param1 == 4) {
                    param0.getAppletContext().showDocument(ne.a(var2, (byte) -89, param0), "_top");
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  break L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("VoidHunters.T(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        L0: {
          VoidHunters.n(0);
          abb.a(4);
          no.a();
          kla.a(89);
          bw.a(9502);
          hb.a(15873);
          veb.a(1);
          oua.a(true);
          kda.b(66);
          fab.a(10970);
          pa.a(2);
          fdb.g(0);
          dra.c(98);
          btb.a((byte) 94);
          bda.a(-12407);
          sh.a((byte) 89);
          ot.a(param0);
          gob.a(26986);
          tua.a(114);
          coa.a(true);
          boa.a(0);
          rrb.a(-106);
          ms.d(false);
          hva.a(127);
          bi.b(-19766);
          fg.a(-25692);
          dma.b();
          asb.a((byte) 112);
          ds.j(-38);
          wt.a(-101);
          tc.a((byte) 40);
          kia.a(3553);
          kmb.a(32768);
          wja.a(false);
          bsb.a(23870);
          dp.a(8);
          lmb.a((byte) -53);
          pgb.a((byte) 75);
          nqa.a((byte) -30);
          mab.a(-23483);
          wsb.b((byte) -108);
          ufb.a(false);
          vfa.c((byte) 120);
          wf.a(3);
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          uca.f(stackIn_3_0 != 0);
          kc.a(-106);
          djb.c((byte) -107);
          fcb.a(111);
          dla.a((byte) 101);
          mn.a(-49);
          ml.e(24388);
          iwa.a((byte) -116);
          igb.a(0);
          ro.a(-47);
          kma.c(-58);
          lja.c((byte) 114);
          aqa.b(-69);
          if (param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          qjb.c(stackIn_6_0 != 0);
          fra.a(2147483647);
          jb.a(12472);
          uj.a((byte) -95);
          eqb.a(65);
          es.a(param0);
          pd.c((byte) 26);
          oma.a(28801);
          bea.a(1);
          wm.a((byte) -110);
          una.a((byte) -98);
          bba.b((byte) -76);
          if (param0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          lbb.a(stackIn_9_0 != 0);
          et.a((byte) -102);
          qsa.a(30089);
          crb.l(3);
          nbb.j((byte) -127);
          it.c(3);
          jo.a(true);
          fba.b(117);
          tj.g(-124);
          rba.a(false);
          aoa.a(false);
          pe.h(3);
          so.a((byte) 61);
          twa.a(32);
          tw.a(-120);
          rj.a();
          ncb.a(500);
          cib.a(-18013);
          llb.f(-2147483648);
          bv.a(39);
          hw.a(-1);
          bfb.b();
          aaa.a((byte) 35);
          tr.b(17674);
          vpa.a(param0);
          qga.a(114);
          qs.a(true);
          joa.a(26936);
          qua.a(16606);
          sfa.a(false);
          ara.a(true);
          cf.c(112);
          dab.b((byte) -44);
          tja.a(false);
          nwa.a(1);
          rgb.a(true);
          ptb.b((byte) 127);
          tt.a((byte) 94);
          jpa.a(true);
          ika.b(1);
          pob.a((byte) 24);
          lrb.a((byte) 118);
          cc.c(6970);
          iia.b(-15818);
          om.b(-2684);
          jsb.b((byte) 11);
          ih.b(-10570);
          cqb.c(-120);
          gda.c((byte) 18);
          lu.a((byte) 87);
          vra.a((byte) -66);
          kl.b(-127);
          aib.a((byte) 48);
          mqb.j((byte) -116);
          rdb.c(51200);
          rca.a(12035);
          imb.a(64);
          kra.a((byte) 70);
          pea.a(true);
          sra.a(96);
          ii.b(25498);
          bmb.a((byte) -120);
          dqb.a(15060);
          if (param0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          tea.a(stackIn_12_0 != 0);
          if (param0) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          hbb.c(stackIn_15_0 != 0);
          gnb.b((byte) 19);
          fkb.d(-25815);
          q.b();
          ht.a(false);
          vka.d();
          iab.a(2);
          um.a(100);
          lc.a(95);
          ssa.a(2);
          pr.b(1);
          spb.b(0);
          enb.a((byte) 38);
          ae.e(-1);
          nl.a(2128263208);
          mba.a((byte) 26);
          fgb.a(8);
          cwa.a((byte) 74);
          wia.a(9911);
          ida.h((byte) -96);
          ud.e(false);
          rq.f(112);
          rla.i((byte) 61);
          vla.e(3);
          waa.i((byte) 115);
          dj.a((byte) -114);
          rbb.b((byte) -29);
          kr.a(-127);
          oca.b(-125);
          if (param0) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L5;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L5;
          }
        }
        L6: {
          qpa.a(stackIn_18_0 != 0);
          bc.a(-22113);
          gdb.a(-73);
          lo.a(true);
          psb.a(false);
          oib.a(124);
          vw.a((byte) 55);
          wc.b(-20221);
          ona.c(125);
          pfa.b(63);
          fwa.b(5);
          ppb.a(37);
          pjb.e((byte) 22);
          aw.h(0);
          wdb.e((byte) 127);
          hqb.a((byte) -106);
          lwa.h(0);
          cna.h(1);
          bs.a((byte) 42);
          ooa.h(126);
          fh.d(-31049);
          qc.a((byte) 78);
          ffb.a(-106);
          kw.g((byte) 124);
          pia.e(-89);
          bra.a(true);
          cd.a(5);
          ebb.a(23357);
          if (param0) {
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L6;
          } else {
            stackOut_19_0 = 1;
            stackIn_21_0 = stackOut_19_0;
            break L6;
          }
        }
        L7: {
          sqb.a(stackIn_21_0 != 0);
          mr.l((byte) -16);
          ija.a(true);
          uc.a(0);
          lm.a(127);
          wk.a((byte) 80);
          tjb.i(85);
          jv.a((byte) -33);
          tgb.b((byte) -58);
          eua.a(-128);
          feb.a((byte) 122);
          alb.a(6947);
          uv.a(22089);
          uea.a((byte) -18);
          ei.a(false);
          jba.a(true);
          bob.b(22540);
          shb.c((byte) 71);
          bl.i((byte) -17);
          ar.b(54);
          hnb.i(1);
          fm.a((byte) -114);
          iw.f(-27545);
          nva.f(-104);
          htb.d(124);
          dqa.b(param0);
          oda.a(0);
          pwa.a(-126);
          whb.a(-113);
          ub.c((byte) 104);
          mo.d((byte) 46);
          bhb.a(32);
          umb.a(16214);
          pca.d(9);
          hg.a(false);
          gtb.a((byte) -88);
          hp.a(false);
          fnb.a(-19);
          mia.a(-11954);
          dv.a((byte) -98);
          sa.b();
          eka.b(0);
          gqb.a(126);
          uab.a(0);
          fca.a();
          wma.b(118);
          csa.a((byte) 124);
          cjb.a(0);
          bd.a((byte) -103);
          kea.a(115);
          kca.a((byte) 127);
          ps.a(1);
          cv.a();
          dha.a(53);
          fia.a((byte) -28);
          ota.a();
          qd.a((byte) 66);
          pfb.a(118);
          bbb.a(0);
          jw.a(false);
          rb.a((byte) -109);
          ndb.a(91);
          qdb.a((byte) -125);
          odb.a(true);
          dmb.a((byte) -128);
          wna.a((byte) -128);
          lh.a(15261);
          vp.b(-2404);
          ehb.a(false);
          if (param0) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L7;
          } else {
            stackOut_22_0 = 1;
            stackIn_24_0 = stackOut_22_0;
            break L7;
          }
        }
        L8: {
          lra.a(stackIn_24_0 != 0);
          qeb.a((byte) -122);
          tn.a((byte) 110);
          bqa.a((byte) 124);
          via.b(0);
          qw.a(true);
          wh.h(0);
          km.g((byte) 114);
          jma.e(100);
          ga.c((byte) -110);
          qda.a();
          tga.j(88);
          uf.h((byte) -128);
          ttb.d(16711935);
          kja.a(-30);
          gm.e(-2459);
          jla.a(-125);
          eca.e(-27183);
          reb.a(false);
          w.i((byte) 77);
          ut.a(-72);
          cja.a(-17719);
          ata.a(6344);
          fj.a(0);
          ita.j((byte) 106);
          vq.i((byte) -81);
          sha.f(1);
          nga.b((byte) -126);
          if (param0) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L8;
          } else {
            stackOut_25_0 = 1;
            stackIn_27_0 = stackOut_25_0;
            break L8;
          }
        }
        L9: {
          vh.b(stackIn_27_0 != 0);
          al.a(true);
          rlb.a(-120);
          fbb.a(param0);
          kha.b(1);
          mpb.g(0);
          vf.a((byte) -26);
          tla.b(1);
          rpa.f(1);
          epb.c(13);
          rtb.c((byte) 81);
          pf.d((byte) -101);
          pb.a((byte) -84);
          mj.a(17);
          rga.a((byte) 108);
          oj.b(108);
          kba.a(17121);
          aba.a(-3696);
          atb.a(true);
          uda.b((byte) -96);
          as.c(0);
          je.b((byte) 117);
          vmb.a(8192);
          slb.a((byte) 13);
          uja.a((byte) -123);
          jra.a((byte) -125);
          jp.K(771);
          esb.e(-118);
          hma.a(-1);
          re.d(-2705);
          ef.e(-100);
          tda.g(29914);
          qh.l((byte) -123);
          bk.e(80);
          vcb.j((byte) -7);
          ta.a((byte) -109);
          se.c(-27982);
          ri.a(41);
          ska.e(5697);
          if (param0) {
            stackOut_29_0 = 0;
            stackIn_30_0 = stackOut_29_0;
            break L9;
          } else {
            stackOut_28_0 = 1;
            stackIn_30_0 = stackOut_28_0;
            break L9;
          }
        }
        L10: {
          bna.a(stackIn_30_0 != 0);
          aqb.b(true);
          gab.a(15325);
          pja.d(-1);
          wv.d(65280);
          ul.a(-23460);
          drb.e((byte) -85);
          jwa.d(-122);
          jlb.a(true);
          grb.e((byte) -72);
          owa.e((byte) 110);
          di.e((byte) 113);
          lq.d(262144);
          gw.a(param0);
          vm.e((byte) 110);
          if (param0) {
            stackOut_32_0 = 0;
            stackIn_33_0 = stackOut_32_0;
            break L10;
          } else {
            stackOut_31_0 = 1;
            stackIn_33_0 = stackOut_31_0;
            break L10;
          }
        }
        L11: {
          vn.a(stackIn_33_0 != 0);
          kbb.e((byte) -117);
          me.a(true);
          lnb.e(1);
          hpb.d(-6200);
          qqa.e((byte) -104);
          moa.d(-120);
          cm.e((byte) -118);
          md.a(false);
          koa.d(19);
          gia.a(false);
          rw.e((byte) 86);
          elb.c((byte) 78);
          hk.d(-1210841460);
          oqb.e((byte) -123);
          hc.a();
          jn.a((byte) -101);
          lia.a(97);
          uva.a();
          woa.a(-16777216);
          cs.a((byte) 111);
          hq.c((byte) -128);
          r.e((byte) -123);
          ct.a((byte) -96);
          mb.f((byte) -122);
          of.a(8345);
          ob.c((byte) 42);
          nv.e(33);
          mea.c(-95);
          qg.c(-15081);
          jjb.a(false);
          ne.a(-2);
          uia.a(-4353);
          gpa.a(-92);
          im.c((byte) 105);
          tob.a(91);
          bt.a(-4509);
          vab.a(false);
          bkb.b(26);
          oaa.c(124);
          mnb.b(117);
          dda.a(0);
          uga.a((byte) -9);
          iib.d(1);
          ku.a((byte) 108);
          uob.d(3168);
          ti.a(true);
          mw.d(13776);
          ts.a((byte) 90);
          tu.a((byte) 88);
          if (param0) {
            stackOut_35_0 = 0;
            stackIn_36_0 = stackOut_35_0;
            break L11;
          } else {
            stackOut_34_0 = 1;
            stackIn_36_0 = stackOut_34_0;
            break L11;
          }
        }
        L12: {
          cba.b(stackIn_36_0 != 0);
          gib.a(15);
          ko.a(-35);
          mjb.a(-81);
          sv.e(0);
          wu.d((byte) 46);
          hab.e(-18951);
          bib.c(param0);
          kt.d((byte) -19);
          gna.b(false);
          vjb.b((byte) 53);
          ho.a(13032);
          ubb.f((byte) 42);
          gn.e(106);
          qva.a(6);
          rab.a(148);
          gla.a(-5709);
          fib.e(-113);
          bva.b(23008);
          tb.a(-75);
          pl.b((byte) -109);
          fk.a((byte) 80);
          iob.c(-5509);
          vhb.b(21053);
          hla.a((byte) 39);
          asa.a(20000000);
          ue.a((byte) 124);
          sja.a((byte) 120);
          qb.a(111);
          cl.a((byte) -99);
          ccb.b((byte) 126);
          amb.a(-46);
          gl.a(0);
          vva.a((byte) 121);
          meb.a((byte) -52);
          kpb.c(17433);
          dw.a(118);
          if (param0) {
            stackOut_38_0 = 0;
            stackIn_39_0 = stackOut_38_0;
            break L12;
          } else {
            stackOut_37_0 = 1;
            stackIn_39_0 = stackOut_37_0;
            break L12;
          }
        }
        L13: {
          qpb.b(stackIn_39_0 != 0);
          kab.c(777);
          qn.a(true);
          ifa.a(95);
          vu.e((byte) 113);
          fa.c((byte) 119);
          ujb.a((byte) -111);
          lw.a(false);
          kob.a(127);
          rqa.a(true);
          gva.a(true);
          qab.b(0);
          kua.a(181765988);
          nfb.b((byte) 120);
          etb.b((byte) 43);
          pn.a(-30938);
          nfa.d(-3408);
          rea.d(102);
          qsb.d(104);
          uw.d(34037);
          lg.d(108);
          nnb.b(false);
          pva.d(109);
          fpa.d(110);
          hka.d(0);
          fjb.a(105);
          ecb.a(95);
          wva.a(-13);
          av.a(false);
          dtb.b((byte) 124);
          efb.b((byte) -80);
          akb.b((byte) 21);
          fpb.l(62);
          deb.i((byte) -125);
          wqb.i((byte) 75);
          mna.i((byte) 9);
          teb.l(8192);
          fma.i((byte) -22);
          rma.l(3);
          wca.l(-36);
          ira.l(17036);
          jeb.i((byte) -81);
          ok.b((byte) -103);
          ej.b((byte) 124);
          gfb.b((byte) 80);
          dkb.b((byte) -120);
          jga.a(-121);
          gs.b((byte) 120);
          gmb.a(-109);
          ng.a(false);
          ajb.c((byte) 44);
          ns.a(102);
          ge.a((byte) 122);
          eta.a(126);
          mta.a(false);
          jdb.a(param0);
          cn.a(false);
          vfb.a(92);
          hsb.b((byte) 27);
          bf.b((byte) 27);
          nra.a(2);
          wkb.a(-1);
          mbb.a(50);
          osb.a(1);
          eoa.a(-18593);
          upb.b(50);
          pu.a(124);
          sl.a(-123);
          lhb.b((byte) -116);
          lob.b((byte) 102);
          lka.a(8192);
          lsa.c((byte) -92);
          dfa.a((byte) 112);
          tpa.a(2);
          lp.b((byte) 43);
          nna.c(true);
          rg.a(-117);
          us.b((byte) 32);
          un.a(false);
          cfa.c((byte) 83);
          ea.a(10);
          nj.a(false);
          br.a(true);
          t.a(1);
          vv.b(24358);
          pbb.a(-652030847);
          nrb.a(11227);
          bpa.a((byte) 68);
          tia.a(-102);
          jja.b((byte) -110);
          uu.a(-19);
          npa.a(true);
          nf.a(27167);
          ci.a(-5254);
          kgb.a(0);
          nma.b((byte) -4);
          skb.a(301);
          jd.a(125);
          klb.b(true);
          cka.a(-2);
          wda.e((byte) -100);
          wnb.e(0);
          dpa.b(false);
          eq.e((byte) -105);
          uqa.a(1);
          gq.b(false);
          tca.a(-9028);
          wg.b(false);
          cg.b(false);
          hca.e((byte) 124);
          og.a(23969);
          ck.a(7311);
          ema.a(0);
          awa.a(-1);
          dfb.e(105);
          jrb.e(-2326);
          eja.a(2);
          jfb.a(0);
          baa.e((byte) -47);
          nha.e((byte) 74);
          vea.a(0);
          ltb.a(10);
          apa.a(25837);
          vha.e((byte) -5);
          fu.e((byte) -125);
          hjb.a(100);
          oja.a(9141);
          hha.a(0);
          scb.a(30465);
          nob.a(0);
          nw.e((byte) -93);
          ddb.e((byte) 89);
          ppa.b(param0);
          na.a(27358);
          uka.a(0);
          fq.a(1);
          vba.e((byte) -31);
          qwa.a(123);
          if (param0) {
            stackOut_41_0 = 0;
            stackIn_42_0 = stackOut_41_0;
            break L13;
          } else {
            stackOut_40_0 = 1;
            stackIn_42_0 = stackOut_40_0;
            break L13;
          }
        }
        L14: {
          inb.b(stackIn_42_0 != 0);
          hqa.e((byte) -115);
          jqa.e((byte) 4);
          ewa.b(false);
          kj.a(0);
          s.a(18841);
          hpa.a(2);
          fv.a(16224);
          sla.e((byte) 98);
          tsb.b(param0);
          qf.a(34);
          ji.a(200);
          lf.e((byte) 121);
          bsa.e((byte) -7);
          oha.a(-23714);
          nh.e((byte) 124);
          hra.a(9839);
          kaa.a(-21447);
          wpb.a(0);
          k.e((byte) -71);
          aj.e((byte) 32);
          edb.a(-122);
          ueb.a(0);
          sp.a(30388);
          vbb.a(2051507073);
          ufa.a(-92);
          rsa.a(-1);
          gjb.a(-118);
          gp.a(-23822);
          urb.a(0);
          cga.e((byte) -31);
          tg.a(-32514);
          mla.a(0);
          eo.e(53562);
          fc.a(95);
          kq.e((byte) 84);
          ki.a(-91);
          cw.a(118);
          leb.e((byte) -29);
          jda.a(0);
          gcb.a(0);
          cab.a(106);
          fha.a(25553);
          ca.e((byte) 116);
          lba.e((byte) 49);
          icb.a(0);
          erb.a(96);
          uib.b(false);
          pp.a(256);
          kk.e((byte) 107);
          jqb.e((byte) -15);
          qi.a(101);
          ff.a(-105);
          ws.e(-122);
          te.b(param0);
          ql.e((byte) 63);
          mja.e((byte) 103);
          nt.a(2);
          loa.a(-128);
          ie.e(3575);
          dob.e((byte) -66);
          kkb.e((byte) 40);
          ica.e((byte) -20);
          pha.a(22829);
          bjb.b(false);
          rib.e((byte) -128);
          qta.b(false);
          fla.e((byte) -91);
          nkb.e((byte) -115);
          opb.e((byte) 123);
          acb.b(false);
          hsa.a(111);
          lib.a(0);
          ll.e(1);
          df.f((byte) -96);
          jab.a(2);
          wj.e((byte) -114);
          uhb.e((byte) 32);
          ug.f((byte) -104);
          neb.e((byte) -57);
          bka.a(0);
          hja.a(21);
          gba.a(-21968);
          otb.b(true);
          ic.a(124);
          nsa.e((byte) -115);
          hj.a(87);
          nd.b(false);
          wlb.e((byte) -70);
          mgb.e((byte) -49);
          dt.e(44);
          sj.a(0);
          ina.a(-1721);
          mhb.e((byte) -127);
          omb.e((byte) -50);
          oqa.e((byte) 53);
          lea.a(33);
          mqa.a(-125);
          hcb.a(68);
          psa.a(0);
          rh.a(-51);
          iua.e((byte) -119);
          jgb.e(0);
          jl.a(37);
          bta.e((byte) -119);
          jnb.a(-126);
          fd.e(-1);
          ir.e((byte) 32);
          dsb.a(-23436);
          ljb.a(-100);
          era.a(42);
          ew.b(param0);
          mk.e((byte) 7);
          ov.a(46);
          vg.e((byte) -114);
          lqb.a(122);
          sdb.e((byte) 87);
          cha.e((byte) 76);
          stb.a(3);
          qt.a(124);
          gt.e((byte) 123);
          vgb.a(51);
          qja.a(124);
          jna.b(true);
          vnb.a(54);
          fsa.e((byte) 56);
          epa.a(55);
          tfb.e((byte) 112);
          msa.e((byte) -61);
          nr.e((byte) -127);
          oba.a(-78);
          hlb.e((byte) 95);
          ieb.a(122);
          pra.a(-75);
          qla.e((byte) 126);
          seb.b(true);
          tma.f((byte) 66);
          cca.e((byte) -41);
          mtb.e((byte) -117);
          gwa.b(true);
          nhb.a(12124934);
          if (param0) {
            stackOut_44_0 = 0;
            stackIn_45_0 = stackOut_44_0;
            break L14;
          } else {
            stackOut_43_0 = 1;
            stackIn_45_0 = stackOut_43_0;
            break L14;
          }
        }
        L15: {
          tm.b(stackIn_45_0 != 0);
          afa.b(true);
          if (param0) {
            stackOut_47_0 = 0;
            stackIn_48_0 = stackOut_47_0;
            break L15;
          } else {
            stackOut_46_0 = 1;
            stackIn_48_0 = stackOut_46_0;
            break L15;
          }
        }
        L16: {
          iga.b(stackIn_48_0 != 0);
          aq.a(-10441);
          dwa.a(69);
          uta.e((byte) 112);
          bfa.a(70);
          eg.a(-124);
          aab.b(true);
          bo.a(-26081);
          if (param0) {
            stackOut_50_0 = 0;
            stackIn_51_0 = stackOut_50_0;
            break L16;
          } else {
            stackOut_49_0 = 1;
            stackIn_51_0 = stackOut_49_0;
            break L16;
          }
        }
        L17: {
          qea.b(stackIn_51_0 != 0);
          ee.e(-15435);
          lb.a(-612363640);
          tab.a(76);
          emb.a(23518);
          mpa.a(-27645);
          fb.e((byte) 42);
          rta.a(32);
          iqb.a(122);
          wpa.b(true);
          dhb.a(6);
          pua.a(80);
          aha.a(1511754497);
          eaa.a(-110);
          vwa.a(32);
          bqb.e((byte) -96);
          jmb.b(true);
          ad.e((byte) -27);
          hr.a(-60);
          dd.a(85);
          bm.a(-28228);
          aka.e((byte) -119);
          gra.e((byte) -8);
          fqb.a(27154);
          pqa.a(0);
          gkb.a(88);
          jh.a(89);
          hmb.a(21584);
          rnb.e((byte) 127);
          web.e((byte) 102);
          eia.a(92);
          lna.e((byte) -115);
          u.a(4);
          qia.e((byte) -87);
          jha.e((byte) 127);
          fe.a(6425);
          keb.a(-87);
          if (param0) {
            stackOut_53_0 = 0;
            stackIn_54_0 = stackOut_53_0;
            break L17;
          } else {
            stackOut_52_0 = 1;
            stackIn_54_0 = stackOut_52_0;
            break L17;
          }
        }
        L18: {
          esa.b(stackIn_54_0 != 0);
          sga.e((byte) -97);
          vl.a(127);
          dua.f((byte) 106);
          mp.b(false);
          rja.e((byte) -91);
          lva.a(617169759);
          raa.a(0);
          gka.a(-114);
          eha.a(-17297);
          vpb.a(1600);
          ra.a(107);
          kwa.b(true);
          jea.e(-20005);
          noa.a(194);
          gsa.a(109);
          ks.e((byte) 119);
          js.a(-20626);
          wd.a(0);
          ena.a(-100);
          tk.e((byte) 101);
          job.e((byte) -16);
          rd.a(-1);
          kn.a(16086);
          gk.a(116);
          iv.a(117);
          hgb.e((byte) 57);
          ejb.e(117);
          vda.e((byte) 99);
          up.e((byte) 65);
          qmb.e((byte) -125);
          wrb.a(100);
          jm.e((byte) 71);
          rf.a(15110);
          pga.a(-29417);
          nda.a(0);
          lr.a(125);
          qv.e((byte) -78);
          pmb.a(-1);
          eob.a(127);
          jhb.e((byte) 53);
          sbb.a(-120);
          dn.a(-52);
          tnb.e((byte) -25);
          usa.e((byte) 108);
          sta.a(63);
          ceb.e((byte) -116);
          qra.e((byte) -80);
          po.a(69);
          mlb.e((byte) 92);
          dh.e((byte) -99);
          am.e(-1);
          nlb.e((byte) -80);
          plb.a(16);
          fhb.a(-116);
          cta.a(14675);
          ahb.a(0);
          vaa.e((byte) 21);
          hwa.e((byte) 107);
          vsa.a(-92);
          if (param0) {
            stackOut_56_0 = 0;
            stackIn_57_0 = stackOut_56_0;
            break L18;
          } else {
            stackOut_55_0 = 1;
            stackIn_57_0 = stackOut_55_0;
            break L18;
          }
        }
        L19: {
          vo.b(stackIn_57_0 != 0);
          qoa.a(9099);
          wo.a(-124);
          bpb.a(0);
          kg.a(7848);
          eva.a(0);
          kpa.a(146);
          we.e((byte) 97);
          ioa.e((byte) -102);
          pma.e((byte) -102);
          hoa.a(-123);
          vqb.e((byte) -127);
          lcb.a(0);
          orb.a(-982);
          ijb.a(-59);
          wea.a(153);
          lda.a(-2573);
          hv.e((byte) 15);
          ma.a(-17548);
          tqa.a(76);
          st.a(0);
          qe.e((byte) 118);
          if (param0) {
            stackOut_59_0 = 0;
            stackIn_60_0 = stackOut_59_0;
            break L19;
          } else {
            stackOut_58_0 = 1;
            stackIn_60_0 = stackOut_58_0;
            break L19;
          }
        }
        L20: {
          gbb.b(stackIn_60_0 != 0);
          fmb.a(0);
          bja.f((byte) 92);
          ip.e((byte) 62);
          cu.a(163);
          ag.b(false);
          if (param0) {
            stackOut_62_0 = 0;
            stackIn_63_0 = stackOut_62_0;
            break L20;
          } else {
            stackOut_61_0 = 1;
            stackIn_63_0 = stackOut_61_0;
            break L20;
          }
        }
        si.b(stackIn_63_0 != 0);
        egb.a(118);
        oea.e((byte) -113);
        nu.a(-10515);
        jj.a(-17);
        lgb.b(false);
        ega.e((byte) 28);
        gr.a(12992);
        uua.e((byte) -99);
        wra.a(0);
        ss.a(169);
        qna.a(-107);
        rua.e((byte) 83);
        go.a(-25544);
        ipa.a(176);
        ohb.e((byte) 84);
        fi.a(177);
        mwa.a(127);
        uh.a(64);
        knb.e((byte) -118);
        qnb.a(0);
        uaa.a(2);
        ktb.e((byte) 126);
        vk.e((byte) 69);
        gha.a(0);
        tta.a(113);
        tdb.a(-120);
        ula.a(-19013);
        obb.a(21942);
        jc.b(false);
        lqa.e((byte) -122);
        fda.f((byte) 51);
        ukb.e((byte) -71);
        ju.e((byte) 65);
        paa.e((byte) -28);
        iha.a(-105);
        wba.a(-122);
        hia.e(0);
        vtb.a(80);
        tba.e((byte) -89);
        qhb.e((byte) -118);
        jt.a(26468);
        db.e(193);
        rob.a(-33);
        vs.a(7069);
        mi.f((byte) -125);
        nb.a(0);
        hga.a(67);
        cqa.e((byte) -52);
        tra.a(0);
        ep.e((byte) 57);
        tq.b(true);
        thb.a(200);
        qcb.a(17231);
        gca.a(-120);
        qa.e((byte) -63);
        saa.a(-14010);
        to.a(204);
        wjb.a(235);
        jca.a(124);
        tkb.a(3);
        eh.a(0);
        bga.a(207);
        bnb.e((byte) -90);
        bb.e((byte) 123);
        oh.e((byte) 0);
        jta.a(-29044);
        geb.e((byte) 121);
        tha.e((byte) -101);
        lv.a(-126);
        haa.e((byte) 91);
        ap.a(215);
        ib.a(-99);
        mg.e(-105);
        ldb.b(false);
        ou.e((byte) -33);
        vob.e((byte) -121);
        cnb.e((byte) 84);
        hm.a(-123);
        ikb.a(221);
        dia.a(0);
        qtb.a(16407);
        wl.a(-27266);
        rhb.a(225);
        flb.a(-26016);
        ce.a(8);
        gh.a(14055);
        dca.a(103);
        vj.a(-128);
        kp.a(46);
        dsa.a(0);
        fja.e((byte) -106);
        tl.e((byte) -15);
        gu.a(232);
        rfa.e((byte) 49);
        ah.a(233);
        iqa.e((byte) 91);
        bab.a(true);
        fob.a(75);
        rc.a(540800);
        vlb.a(-104);
        ada.a(-1);
        wga.a(-1);
        uk.c((byte) 67);
        tib.f(6312);
        ocb.d((byte) 126);
        rm.f(2);
        wgb.f(68);
        vqa.f(1);
        oe.a((byte) 94);
        hob.c((byte) -63);
        sc.c(123);
        ola.b(2);
        glb.b(-17471);
        rv.a(-1);
        vib.a(84);
        bca.a(-115);
        pab.a(false);
        ev.a(28378);
        eu.b(30826);
        cp.a((byte) -127);
        dib.a((byte) 89);
        lkb.a(199);
        mmb.a(2);
        dgb.a(false);
        ((VoidHunters) this).field_F = null;
        ((VoidHunters) this).field_u = null;
    }

    private final boolean h(byte param0) {
        int var2 = 0;
        int var3 = field_G;
        mab.field_a = (VoidHunters) this;
        if (!(eu.field_i.a((byte) 68))) {
            return false;
        }
        fka.a("Initing menus", (byte) -62);
        csa.b((byte) -111);
        for (var2 = 0; var2 < 10; var2++) {
            lo.field_a[var2] = new wf(var2);
        }
        wgb.field_f = 0;
        oab.field_o = 0;
        gib.a(-106, 50);
        fka.a("Playing music", (byte) -101);
        hb.a(pab.field_k[0], (byte) -114);
        for (var2 = 0; var2 < 16; var2++) {
            fi.field_o.b(0, (byte) 18, var2);
        }
        wgb.a(jj.field_p, ama.field_o, qaa.field_a, -131, qua.field_b, nl.field_n, oma.field_i);
        fka.a("Initing audiohandler", (byte) -64);
        qn.c((byte) 89);
        fkb.a(2096);
        fka.a("Finished loadloop", (byte) -128);
        if (this.l(0)) {
            if (fda.e((byte) 116)) {
                wu.a(true, false);
            }
        }
        return true;
    }

    final void b(int param0) {
        prb.b(false);
        if (!(null == psb.field_b)) {
            cqb.b((byte) 86);
        }
        jn.a(1);
        if (param0 >= -102) {
            String discarded$0 = VoidHunters.b(63, 91);
        }
    }

    private final void d(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_42_0 = 0;
        uca stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        uca stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        uca stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        faa stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        faa stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        faa stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackIn_202_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        uca stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        uca stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        uca stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        faa stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        faa stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        int stackOut_127_2 = 0;
        faa stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        L0: {
          var10 = field_G;
          if (!ssa.b(2)) {
            break L0;
          } else {
            wgb.a(jj.field_p, ama.field_o, qaa.field_a, -131, qua.field_b, nl.field_n, oma.field_i);
            if (!si.field_o[81]) {
              break L0;
            } else {
              if (!si.field_o[102]) {
                break L0;
              } else {
                hja.a(0, new int[1]);
                break L0;
              }
            }
          }
        }
        L1: {
          if (!eo.a(61848)) {
            break L1;
          } else {
            if (oab.field_o != 0) {
              break L1;
            } else {
              if (0 != wgb.field_f) {
                break L1;
              } else {
                L2: {
                  nkb.a(false, "Cookie ship found, so starting game");
                  if (bqa.a(false)) {
                    stackOut_9_0 = 7;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    break L2;
                  }
                }
                lha.a(stackIn_10_0, false, (byte) -85, -3);
                break L1;
              }
            }
          }
        }
        L3: {
          if (wp.field_b != wp.field_a) {
            if (wp.field_a == maa.field_o) {
              hn.field_a = hn.field_a + 1;
              if (16 == hn.field_a) {
                gnb.a(0);
                wp.field_a = tjb.field_wb;
                break L3;
              } else {
                break L3;
              }
            } else {
              if (tjb.field_wb == wp.field_a) {
                if (!fda.e((byte) 102)) {
                  L4: {
                    ek.b(false);
                    wgb.field_f = pw.field_a;
                    if (!kua.field_e) {
                      break L4;
                    } else {
                      lha.a(wgb.field_f, false, (byte) -85, -4);
                      break L4;
                    }
                  }
                  L5: {
                    if (wqa.a(false, wgb.field_f)) {
                      olb.d(991426348);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  wp.field_a = oh.field_p;
                  break L3;
                } else {
                  wp.field_a = oh.field_p;
                  break L3;
                }
              } else {
                hn.field_a = hn.field_a - 1;
                if (hn.field_a == 0) {
                  wp.field_a = wp.field_b;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          } else {
            L6: {
              var3 = 0;
              var4 = 0;
              if (nna.field_C == null) {
                break L6;
              } else {
                nna.field_C.a(true, (byte) 77);
                break L6;
              }
            }
            L7: {
              if (null != nna.field_C) {
                if (nna.field_C.c(13462)) {
                  stackOut_18_0 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  break L7;
                } else {
                  stackOut_17_0 = 0;
                  stackIn_20_0 = stackOut_17_0;
                  break L7;
                }
              } else {
                stackOut_15_0 = 0;
                stackIn_20_0 = stackOut_15_0;
                break L7;
              }
            }
            L8: {
              var5 = stackIn_20_0;
              if (pcb.field_o) {
                if (null != vqa.field_g) {
                  if (oab.field_o == -1) {
                    if (wgb.field_f == oab.field_o) {
                      if (var5 == 0) {
                        L9: {
                          if (psb.field_b != null) {
                            break L9;
                          } else {
                            if (bsa.field_o) {
                              break L9;
                            } else {
                              stackOut_32_0 = 0;
                              stackIn_42_0 = stackOut_32_0;
                              break L8;
                            }
                          }
                        }
                        if (vqa.field_g.field_N) {
                          if (!aka.field_p) {
                            if (!fva.field_p) {
                              stackOut_40_0 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              break L8;
                            } else {
                              stackOut_39_0 = 0;
                              stackIn_42_0 = stackOut_39_0;
                              break L8;
                            }
                          } else {
                            stackOut_37_0 = 0;
                            stackIn_42_0 = stackOut_37_0;
                            break L8;
                          }
                        } else {
                          stackOut_35_0 = 1;
                          stackIn_42_0 = stackOut_35_0;
                          break L8;
                        }
                      } else {
                        stackOut_29_0 = 0;
                        stackIn_42_0 = stackOut_29_0;
                        break L8;
                      }
                    } else {
                      stackOut_27_0 = 0;
                      stackIn_42_0 = stackOut_27_0;
                      break L8;
                    }
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_42_0 = stackOut_25_0;
                    break L8;
                  }
                } else {
                  stackOut_23_0 = 0;
                  stackIn_42_0 = stackOut_23_0;
                  break L8;
                }
              } else {
                stackOut_21_0 = 0;
                stackIn_42_0 = stackOut_21_0;
                break L8;
              }
            }
            L10: {
              var6 = stackIn_42_0;
              bq.a(true, var6 != 0, ip.field_p.width, ip.field_p.height);
              if (param0) {
                break L10;
              } else {
                if (wgb.field_f != oab.field_o) {
                  pob.field_b = pob.field_b + 1;
                  if (32 != pob.field_b) {
                    break L10;
                  } else {
                    olb.d(991426348);
                    break L10;
                  }
                } else {
                  if (oab.field_o != -1) {
                    if (oab.field_o == -2) {
                      var3 = 1;
                      break L10;
                    } else {
                      if (wqa.a(false, oab.field_o)) {
                        lo.field_a[oab.field_o].b(0);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  } else {
                    L11: {
                      if (!jkb.field_a) {
                        break L11;
                      } else {
                        var3 = 1;
                        var4 = 1;
                        break L11;
                      }
                    }
                    L12: {
                      if (!jkb.field_a) {
                        break L12;
                      } else {
                        if (null == vqa.field_g) {
                          break L10;
                        } else {
                          if (vqa.field_g.field_N) {
                            break L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      stackOut_51_0 = vqa.field_g;
                      stackOut_51_1 = 81;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_53_1 = stackOut_51_1;
                      stackIn_52_0 = stackOut_51_0;
                      stackIn_52_1 = stackOut_51_1;
                      if (var5 != 0) {
                        stackOut_53_0 = (uca) (Object) stackIn_53_0;
                        stackOut_53_1 = stackIn_53_1;
                        stackOut_53_2 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        stackIn_54_2 = stackOut_53_2;
                        break L13;
                      } else {
                        stackOut_52_0 = (uca) (Object) stackIn_52_0;
                        stackOut_52_1 = stackIn_52_1;
                        stackOut_52_2 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        stackIn_54_2 = stackOut_52_2;
                        break L13;
                      }
                    }
                    ((uca) (Object) stackIn_54_0).a((byte) stackIn_54_1, stackIn_54_2 != 0);
                    if (!jkb.field_a) {
                      L14: while (true) {
                        if (!ata.e(127)) {
                          break L10;
                        } else {
                          if (!qmb.a(-22029)) {
                            vqa.field_g.d((byte) 121);
                            continue L14;
                          } else {
                            continue L14;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
              }
            }
            L15: {
              glb.c(17043);
              if (null == wca.field_b) {
                break L15;
              } else {
                wca.field_b.b(0);
                break L15;
              }
            }
            L16: {
              if (null == nna.field_C) {
                break L16;
              } else {
                if (!nna.field_C.c(13462)) {
                  break L16;
                } else {
                  var3 = 0;
                  var4 = 0;
                  break L16;
                }
              }
            }
            L17: {
              L18: {
                if (di.field_l.a(-28208)) {
                  break L18;
                } else {
                  if (idb.field_o) {
                    break L17;
                  } else {
                    if (nhb.field_p) {
                      break L17;
                    } else {
                      if (lqa.field_o == null) {
                        break L17;
                      } else {
                        if (lqa.field_o.field_fc) {
                          break L18;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                }
              }
              var3 = 0;
              var4 = 0;
              break L17;
            }
            L19: {
              if (!jkb.field_a) {
                break L19;
              } else {
                if (lu.field_d) {
                  break L19;
                } else {
                  if (dua.field_o) {
                    break L19;
                  } else {
                    L20: {
                      if (!idb.field_o) {
                        break L20;
                      } else {
                        if (!fva.field_p) {
                          break L20;
                        } else {
                          var3 = 0;
                          break L20;
                        }
                      }
                    }
                    L21: {
                      m.a((byte) 21, var3 != 0);
                      if (nhb.field_p) {
                        ndb.field_a.a((byte) 98, var4 != 0);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (idb.field_o) {
                        if (vqa.field_g == null) {
                          idb.field_o = false;
                          break L22;
                        } else {
                          var7 = (-dma.field_g + ip.field_p.width) / 2;
                          var8 = (-dma.field_j + ip.field_p.height) / 2;
                          js.a(-119, var8, var7);
                          hlb.a(tqa.e((byte) 93), var4 != 0, sea.a(-99), 123);
                          cc.b(-1);
                          if (vqa.field_g.field_N) {
                            vqa.field_g.a((byte) 89, var4 != 0);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      } else {
                        break L22;
                      }
                    }
                    var7 = 0;
                    L23: while (true) {
                      if (!ata.e(127)) {
                        break L19;
                      } else {
                        if (qmb.a(-22029)) {
                          continue L23;
                        } else {
                          L24: {
                            L25: {
                              if (!idb.field_o) {
                                break L25;
                              } else {
                                if (hb.field_c) {
                                  break L25;
                                } else {
                                  if (pma.field_o == 9) {
                                    break L25;
                                  } else {
                                    if (pma.field_o == 10) {
                                      break L25;
                                    } else {
                                      if (pma.field_o != 11) {
                                        L26: {
                                          if (!fva.field_p) {
                                            mjb.field_e = false;
                                            break L26;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        L27: {
                                          if (hb.field_c) {
                                            break L27;
                                          } else {
                                            if (fva.field_p) {
                                              break L27;
                                            } else {
                                              if (!me.field_r) {
                                                if (na.field_q != pma.field_o) {
                                                  if (vnb.field_p == pma.field_o) {
                                                    fva.field_p = true;
                                                    mjb.field_e = true;
                                                    var7 = 1;
                                                    continue L23;
                                                  } else {
                                                    break L27;
                                                  }
                                                } else {
                                                  var7 = 1;
                                                  mjb.field_e = false;
                                                  fva.field_p = true;
                                                  continue L23;
                                                }
                                              } else {
                                                if (pma.field_o == vu.field_Db) {
                                                  mjb.field_e = false;
                                                  fva.field_p = true;
                                                  var7 = 1;
                                                  continue L23;
                                                } else {
                                                  if (jmb.field_p == pma.field_o) {
                                                    var7 = 1;
                                                    mjb.field_e = true;
                                                    fva.field_p = true;
                                                    continue L23;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L28: {
                                          if (var7 != 0) {
                                            L29: {
                                              dpa.field_p.h(24335, 69);
                                              stackOut_125_0 = dpa.field_p;
                                              stackOut_125_1 = 0;
                                              stackIn_127_0 = stackOut_125_0;
                                              stackIn_127_1 = stackOut_125_1;
                                              stackIn_126_0 = stackOut_125_0;
                                              stackIn_126_1 = stackOut_125_1;
                                              if (mjb.field_e) {
                                                stackOut_127_0 = (faa) (Object) stackIn_127_0;
                                                stackOut_127_1 = stackIn_127_1;
                                                stackOut_127_2 = 1;
                                                stackIn_128_0 = stackOut_127_0;
                                                stackIn_128_1 = stackOut_127_1;
                                                stackIn_128_2 = stackOut_127_2;
                                                break L29;
                                              } else {
                                                stackOut_126_0 = (faa) (Object) stackIn_126_0;
                                                stackOut_126_1 = stackIn_126_1;
                                                stackOut_126_2 = 0;
                                                stackIn_128_0 = stackOut_126_0;
                                                stackIn_128_1 = stackOut_126_1;
                                                stackIn_128_2 = stackOut_126_2;
                                                break L29;
                                              }
                                            }
                                            ((faa) (Object) stackIn_128_0).c(stackIn_128_1, stackIn_128_2);
                                            break L28;
                                          } else {
                                            break L28;
                                          }
                                        }
                                        if (var7 != 0) {
                                          break L24;
                                        } else {
                                          L30: {
                                            if (pma.field_o != 80) {
                                              break L30;
                                            } else {
                                              if (!fva.field_p) {
                                                break L24;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          if (gbb.a(13, 15, 12, (byte) 23)) {
                                            continue L23;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (!aka.field_p) {
                              break L24;
                            } else {
                              if (jlb.b(12, -2048, 13, 15)) {
                                continue L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          L31: {
                            if (nhb.field_p) {
                              ndb.field_a.d((byte) -111);
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          if (idb.field_o) {
                            vqa.field_g.d((byte) -16);
                            continue L23;
                          } else {
                            continue L23;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L32: {
              if (jkb.field_a) {
                break L32;
              } else {
                VoidHunters.m(-29130);
                break L32;
              }
            }
            L33: {
              if (aka.field_p) {
                if (ldb.field_o <= vga.field_b) {
                  break L33;
                } else {
                  vga.field_b = vga.field_b + 1;
                  break L33;
                }
              } else {
                if (0 < vga.field_b) {
                  vga.field_b = vga.field_b - 1;
                  break L33;
                } else {
                  break L33;
                }
              }
            }
            var7 = ldb.field_o * ldb.field_o;
            var8 = -(vga.field_b * vga.field_b) + var7;
            var9 = 120 * var8 / var7 + nv.field_v;
            ig.a(0, var9);
            if (dv.field_c.d(0) == null) {
              break L3;
            } else {
              int fieldTemp$2 = wva.field_b + 1;
              wva.field_b = wva.field_b + 1;
              if (fieldTemp$2 != 335) {
                break L3;
              } else {
                wva.field_b = 0;
                ksa discarded$3 = dv.field_c.a(true);
                break L3;
              }
            }
          }
        }
        L34: {
          if (wgb.field_f != -3) {
            break L34;
          } else {
            wu.a(false, false);
            break L34;
          }
        }
        L35: {
          if (-4 == wgb.field_f) {
            dpa.field_p.h(24335, 9);
            wgb.field_f = oab.field_o;
            lu.field_d = true;
            vga.field_b = ldb.field_o;
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          if (-5 != wgb.field_f) {
            break L36;
          } else {
            sh.a(lqa.field_o.f((byte) -13), -1, 11);
            dua.field_o = true;
            wgb.field_f = oab.field_o;
            break L36;
          }
        }
        L37: {
          if (param1 < -117) {
            break L37;
          } else {
            ((VoidHunters) this).field_B = -120;
            break L37;
          }
        }
        L38: {
          if (wh.field_n > 0) {
            wh.field_n = wh.field_n - 1;
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          L40: {
            this.g((byte) -127);
            if (!ssa.b(2)) {
              break L40;
            } else {
              if (si.field_o[1]) {
                li.field_i = true;
                break L39;
              } else {
                break L40;
              }
            }
          }
          if (!ssa.b(2)) {
            break L39;
          } else {
            if (si.field_o[2]) {
              li.field_i = false;
              break L39;
            } else {
              break L39;
            }
          }
        }
        L41: {
          if (!ssa.b(2)) {
            break L41;
          } else {
            if (!si.field_o[3]) {
              break L41;
            } else {
              nkb.a(false, "Selecting opengl toolkit...");
              var11 = new int[]{1};
              vq.field_x.a(false, fja.a(var11, 2));
              nkb.a(false, "Done");
              break L41;
            }
          }
        }
        L42: {
          if (!ssa.b(2)) {
            break L42;
          } else {
            if (si.field_o[4]) {
              nkb.a(false, "Selecting java toolkit...");
              var12 = new int[]{0};
              vq.field_x.a(false, fja.a(var12, 2));
              nkb.a(false, "Done");
              break L42;
            } else {
              break L42;
            }
          }
        }
        L43: {
          if (!ssa.b(2)) {
            break L43;
          } else {
            if (!si.field_o[55]) {
              break L43;
            } else {
              if (!si.field_o[82]) {
                break L43;
              } else {
                L44: {
                  iia.field_c = "This is a forced error, you pressed some crazy button combo";
                  if (!bqa.a(false)) {
                    stackOut_201_0 = 0;
                    stackIn_202_0 = stackOut_201_0;
                    break L44;
                  } else {
                    stackOut_200_0 = 7;
                    stackIn_202_0 = stackOut_200_0;
                    break L44;
                  }
                }
                lha.a(stackIn_202_0, false, (byte) -85, 6);
                break L43;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (0 >= param2) {
          return;
        } else {
          L0: {
            if (param1 <= 0) {
              break L0;
            } else {
              if (og.field_r == null) {
                break L0;
              } else {
                L1: {
                  L2: {
                    var4 = (ip.field_p.width - param2) / 2;
                    var5 = (ip.field_p.height - param1) / 2;
                    if (null == ((VoidHunters) this).field_F) {
                      break L2;
                    } else {
                      if (param2 != ((VoidHunters) this).field_F.field_q) {
                        break L2;
                      } else {
                        if (((VoidHunters) this).field_F.field_p == param1) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ((VoidHunters) this).field_F = new phb(0, 0);
                  ((VoidHunters) this).field_F.field_q = param2;
                  ((VoidHunters) this).field_F.field_m = param2;
                  ((VoidHunters) this).field_F.field_p = param1;
                  ((VoidHunters) this).field_F.field_n = param1;
                  ((VoidHunters) this).field_F.field_r = og.field_r.na(var4, var5, ((VoidHunters) this).field_F.field_q, ((VoidHunters) this).field_F.field_p);
                  break L1;
                }
                ((VoidHunters) this).field_F.c(dma.field_g / 2 + -(param2 / 2), dma.field_j / 2 - param1 / 2 - 1);
                return;
              }
            }
          }
          return;
        }
    }

    final static String b(int param0, int param1) {
        if (param0 >= 0) {
            if (!(glb.field_c.length <= param0)) {
                return glb.field_c[param0];
            }
        }
        if (param1 != -1) {
            return null;
        }
        return glb.field_c[glb.field_c.length + -1];
    }

    final void d(int param0) {
        try {
            int var3_int = 0;
            hua var3 = null;
            jkb var4 = null;
            int var4_int = 0;
            int var5_int = 0;
            String var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            kla var8_ref_kla = null;
            int var9 = 0;
            java.awt.Canvas var10 = null;
            int stackIn_79_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_82_1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_78_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_80_1 = 0;
            int stackOut_81_0 = 0;
            int stackOut_81_1 = 0;
            L0: {
              var9 = field_G;
              ip.field_p = df.e((byte) 102).getSize();
              wna.field_e = false;
              var10 = df.e((byte) 101);
              if (null != vq.field_x) {
                L1: {
                  if (uu.field_b == var10) {
                    break L1;
                  } else {
                    nkb.a(false, "Canvas=" + (Object) (Object) var10 + " hashcode=" + ((Object) (Object) var10).hashCode());
                    uu.field_b = var10;
                    break L1;
                  }
                }
                L2: {
                  if (vq.field_x.a((byte) -128, var10)) {
                    break L2;
                  } else {
                    if (null == vq.field_x.field_e) {
                      break L0;
                    } else {
                      if (vq.field_x.field_e.field_g == og.field_r) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                jc.a(-9934);
                break L0;
              } else {
                break L0;
              }
            }
            if (fu.a(77)) {
              hka.a(111, var10, rnb.a(0));
              return;
            } else {
              if (uob.field_e) {
                if (!hkb.b(-1)) {
                  uoa.a(lwa.field_vb, -1, 100.0f);
                  pga.a(var10, true);
                  return;
                } else {
                  L3: {
                    if (!li.field_i) {
                      dma.a();
                      break L3;
                    } else {
                      L4: {
                        og.field_r.c((int)(-hj.field_q + wt.a(false)));
                        if (ul.field_a == 1) {
                          L5: {
                            if (og.field_r.s()) {
                              break L5;
                            } else {
                              boolean discarded$1 = og.field_r.b();
                              break L5;
                            }
                          }
                          og.field_r.a((float)pab.field_m / 100.0f, 1.0f, (float)oaa.field_i / 100.0f);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      og.field_r.GA(0);
                      og.field_r.ya();
                      dma.a();
                      break L3;
                    }
                  }
                  L6: {
                    if (wgb.field_f != oab.field_o) {
                      if (pob.field_b < 16) {
                        uea.a((byte) 88, lrb.field_f, false, oab.field_o);
                        break L6;
                      } else {
                        uea.a((byte) 88, bg.field_o, false, wgb.field_f);
                        break L6;
                      }
                    } else {
                      uea.a((byte) 88, lrb.field_f, true, oab.field_o);
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (!lrb.field_f) {
                        break L8;
                      } else {
                        if (bg.field_o) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3_int = (-dma.field_g + ip.field_p.width) / 2;
                    var4_int = (-dma.field_j + ip.field_p.height) / 2;
                    js.a(-89, var4_int, var3_int);
                    fr.a(jnb.e(83), true);
                    cc.b(-1);
                    break L7;
                  }
                  L9: {
                    var3 = (hua) (Object) dv.field_c.d(0);
                    if (var3 != null) {
                      L10: {
                        var5_int = wva.field_b;
                        if (var5_int < 80) {
                          var4_int = -32 + var5_int / 2;
                          break L10;
                        } else {
                          if (var5_int < 230) {
                            var4_int = 8;
                            break L10;
                          } else {
                            var4_int = -(var5_int / 2) + 123;
                            break L10;
                          }
                        }
                      }
                      lo.field_c[var3.field_d].b(8, var4_int, 32, 32);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (param0 < -79) {
                    L11: {
                      if (nna.field_C == null) {
                        break L11;
                      } else {
                        nna.field_C.b((byte) 95);
                        if (!nna.field_C.c(13462)) {
                          break L11;
                        } else {
                          wna.field_e = true;
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (!vba.f((byte) -113)) {
                        break L12;
                      } else {
                        L13: {
                          var4_int = (-dma.field_g + ip.field_p.width) / 2;
                          var5_int = (ip.field_p.height + -dma.field_j) / 2;
                          if (!li.field_i) {
                            break L13;
                          } else {
                            og.field_r.GA(-16777216);
                            break L13;
                          }
                        }
                        qoa.a(var4_int, var5_int, 143);
                        vfa.a(false, 20637);
                        wna.field_e = true;
                        break L12;
                      }
                    }
                    L14: {
                      if (tjb.l(0)) {
                        L15: {
                          var4_int = (-dma.field_g + ip.field_p.width) / 2;
                          var5_int = (-dma.field_j + ip.field_p.height) / 2;
                          lva.a(var4_int, 32, var5_int);
                          if (wna.field_e) {
                            break L15;
                          } else {
                            this.a(2, 20 + cd.a(true), fk.b(-119));
                            break L15;
                          }
                        }
                        rw.a(false, (byte) 71);
                        wna.field_e = true;
                        break L14;
                      } else {
                        if (ffa.a(false)) {
                          L16: {
                            ksa.a((phb[]) null, 8, 0, (phb[]) null, (phb[]) null, 8555923, 0, 15658751, 15658751, (no) (Object) dsb.field_p, dma.field_j / 2, 0, 0, -14109, dma.field_g / 2);
                            var4_int = 16;
                            var5_int = var4_int + eba.a(0);
                            var6 = var4_int + geb.a(-22954);
                            var7 = ip.field_p.width / 2 - var5_int / 2;
                            var8 = -(var6 / 2) + ip.field_p.height / 2;
                            af.a((byte) -115, 255, var6, var7, var8 + -1, var5_int);
                            if (((VoidHunters) this).field_F == null) {
                              ((VoidHunters) this).field_F = new phb(0, 0);
                              ((VoidHunters) this).field_F.field_q = var5_int;
                              ((VoidHunters) this).field_F.field_m = var5_int;
                              ((VoidHunters) this).field_F.field_p = var6;
                              ((VoidHunters) this).field_F.field_n = var6;
                              ((VoidHunters) this).field_F.field_r = og.field_r.na(var7, var8, ((VoidHunters) this).field_F.field_q, ((VoidHunters) this).field_F.field_p);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          ((VoidHunters) this).field_F.c(dma.field_g / 2 - var5_int / 2, dma.field_j / 2 - var6 / 2 + -1);
                          ieb.f(-1321004447);
                          wna.field_e = true;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L17: {
                      if (wp.field_a != wp.field_b) {
                        var4_int = 256 * hn.field_a / 16;
                        if (0 >= var4_int) {
                          break L17;
                        } else {
                          dma.e(0, 0, dma.field_g, dma.field_j, 0, var4_int);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (wna.field_e) {
                        break L18;
                      } else {
                        ((VoidHunters) this).field_F = null;
                        break L18;
                      }
                    }
                    L19: {
                      if (!wna.field_e) {
                        break L19;
                      } else {
                        if (!li.field_i) {
                          break L19;
                        } else {
                          L20: {
                            var4_int = dma.field_g;
                            var5_int = dma.field_j;
                            if (((VoidHunters) this).field_F != null) {
                              var5_int = ((VoidHunters) this).field_F.field_p;
                              var4_int = ((VoidHunters) this).field_F.field_q;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            var6 = (-var4_int + ip.field_p.width) / 2;
                            var7 = (-var5_int + ip.field_p.height) / 2;
                            if (!vba.f((byte) -116)) {
                              break L21;
                            } else {
                              if (((VoidHunters) this).field_F == null) {
                                break L21;
                              } else {
                                var6 = gua.e((byte) -24);
                                var7 = rg.b((byte) 102);
                                break L21;
                              }
                            }
                          }
                          var8_ref_kla = feb.a(og.field_r, true);
                          var8_ref_kla.a(var6, var6 - -var4_int, var7, var7 + var5_int, (byte) -76);
                          var7 = (-dma.field_j + ip.field_p.height) / 2;
                          var6 = (ip.field_p.width + -dma.field_g) / 2;
                          og.field_r.SA(var6, var7, dma.field_g, dma.field_j, dma.field_i, 0, dma.field_g);
                          var8_ref_kla.a(true);
                          break L19;
                        }
                      }
                    }
                    L22: {
                      if (!di.field_l.a(-28208)) {
                        break L22;
                      } else {
                        var4_int = di.field_l.field_m.c(0);
                        var5 = isa.a(to.field_q, new String[1], 106);
                        var6 = 1;
                        var7 = (ip.field_p.width >> 1) - (tea.a(var6, var5, 13879) >> 1);
                        var8 = (ip.field_p.height >> 1) - (pqa.a(false, var6) >> 1);
                        af.a((byte) -115, 200, fkb.a(var6, (byte) -121) * 8, var7 - 16, var8 + -(5 * fkb.a(var6, (byte) -121)), 32 + tea.a(var6, var5, 13879));
                        pm.a(var7, 1, var8, var5, var6, 16777215, (byte) -101);
                        break L22;
                      }
                    }
                    L23: {
                      L24: {
                        stackOut_78_0 = 0;
                        stackIn_81_0 = stackOut_78_0;
                        stackIn_79_0 = stackOut_78_0;
                        if (pk.field_o == -1) {
                          break L24;
                        } else {
                          stackOut_79_0 = stackIn_79_0;
                          stackIn_81_0 = stackOut_79_0;
                          stackIn_80_0 = stackOut_79_0;
                          if (noa.field_q == -1) {
                            break L24;
                          } else {
                            stackOut_80_0 = stackIn_80_0;
                            stackOut_80_1 = 1;
                            stackIn_82_0 = stackOut_80_0;
                            stackIn_82_1 = stackOut_80_1;
                            break L23;
                          }
                        }
                      }
                      stackOut_81_0 = stackIn_81_0;
                      stackOut_81_1 = 0;
                      stackIn_82_0 = stackOut_81_0;
                      stackIn_82_1 = stackOut_81_1;
                      break L23;
                    }
                    L25: {
                      spa.a(stackIn_82_0, stackIn_82_1 != 0);
                      if (!pqa.a(1024, 11284)) {
                        break L25;
                      } else {
                        cka.a(1, "FPS: " + Integer.toString(ffa.field_a), 16777215, 20, 160, 4266);
                        break L25;
                      }
                    }
                    L26: {
                      if (li.field_i) {
                        {
                          L27: {
                            og.field_r.b(-122);
                            break L27;
                          }
                        }
                        break L26;
                      } else {
                        dh.a(var10, 0, 0, 0);
                        break L26;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                pga.a(var10, true);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public VoidHunters() {
        ((VoidHunters) this).field_B = 0;
        ((VoidHunters) this).field_F = null;
        ((VoidHunters) this).field_D = -1;
        ((VoidHunters) this).field_C = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[1];
    }
}
