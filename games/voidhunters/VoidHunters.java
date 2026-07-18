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

    private final static void m() {
        vj.e(-1);
        int discarded$0 = -1;
        oc.a();
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
                    int discarded$5 = 0;
                    or.a();
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
                    int discarded$6 = 26718;
                    dr.a();
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
                    int discarded$11 = -15400;
                    tr.a();
                    enb.field_b = true;
                    idb.field_o = false;
                    bg.field_o = false;
                    nhb.field_p = false;
                    wgb.field_f = 0;
                    aeb.field_a = true;
                    jkb.field_a = false;
                    int discarded$12 = 1;
                    lsb.a();
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
                      int discarded$13 = 13;
                      ie.a();
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
                          int discarded$14 = 1;
                          lsb.a();
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
                                              ana discarded$15 = lha.a(-118, fa.field_d[5]);
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
                  int discarded$16 = 120;
                  var8 = nia.a(param0, di.field_l, qga.field_b);
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
                  int discarded$17 = 0;
                  am.a(shb.field_o, jrb.a(0), hj.a(8, (byte) -99), hj.a(2000, (byte) -116), jrb.b(), true, ms.field_A.length, 150, 1024, sua.a(207));
                  int discarded$18 = 0;
                  int discarded$19 = -90;
                  int discarded$20 = 1;
                  plb.a(hia.a(), dm.i());
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
                  int discarded$21 = 1;
                  lsb.a();
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
          int discarded$18 = -2;
          lgb.field_o = gia.d();
          int discarded$19 = 200;
          ji.e();
          if (psb.field_b == null) {
            break L0;
          } else {
            if (psb.field_b.field_a) {
              cqb.b((byte) 116);
              int discarded$20 = -115;
              gva.a();
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
            int discarded$21 = 125;
            if (!this.h()) {
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
                int discarded$22 = 0;
                if (!this.l()) {
                  break L4;
                } else {
                  int discarded$23 = -116;
                  if (uc.b()) {
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
                int discarded$24 = 0;
                if (!ffa.a()) {
                  int discarded$25 = 0;
                  if (ck.b()) {
                    this.d(true, -126);
                    break L4;
                  } else {
                    this.d(false, -124);
                    break L4;
                  }
                } else {
                  if (wp.field_b == wp.field_a) {
                    L9: {
                      int discarded$26 = -31515;
                      var3 = vdb.d();
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
                int discarded$27 = 0;
                dba.a(4, var7);
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
              int discarded$28 = 1;
              if (!nb.b()) {
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
                  int discarded$29 = 4;
                  int discarded$30 = 50;
                  bta.a();
                  qf.a(6, (byte) -52);
                  int discarded$31 = 0;
                  int discarded$32 = 5;
                  md.b();
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
                        int discarded$33 = 1;
                        lsb.a();
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
                  int discarded$34 = 1;
                  if (nb.b()) {
                    break L39;
                  } else {
                    var5 = 0;
                    break L39;
                  }
                }
                if (var5 != 0) {
                  int discarded$35 = -119;
                  km.f();
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

    private final boolean l() {
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
        int discarded$0 = 22050;
        kr.a((byte) -32, true, bm.field_o, (java.awt.Component) (Object) igb.field_a, var4);
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
        int discarded$1 = -89;
        hjb.field_o = rrb.b();
        qcb.field_o = tc.field_b;
        ncb.field_a = sbb.field_o;
        if (!(!ef.field_E)) {
            int discarded$2 = -120;
            ll.e();
            jha.field_p = mva.a(jha.field_p, 68, (Object) (Object) "graphics_quality");
            int discarded$3 = 0;
            aw.a();
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

    private final void g() {
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
          int discarded$583 = 4;
          abb.a();
          no.a();
          int discarded$584 = 89;
          kla.a();
          int discarded$585 = 9502;
          bw.a();
          int discarded$586 = 15873;
          hb.a();
          veb.a(1);
          oua.a(true);
          kda.b(66);
          fab.a(10970);
          pa.a(2);
          fdb.g(0);
          dra.c(98);
          int discarded$587 = 94;
          btb.a();
          int discarded$588 = -12407;
          bda.a();
          sh.a((byte) 89);
          ot.a(param0);
          int discarded$589 = 26986;
          gob.a();
          int discarded$590 = 114;
          tua.a();
          coa.a(true);
          int discarded$591 = 0;
          boa.a();
          rrb.a(-106);
          ms.d(false);
          int discarded$592 = 127;
          hva.a();
          int discarded$593 = -19766;
          bi.b();
          fg.a(-25692);
          dma.b();
          int discarded$594 = 112;
          asb.a();
          int discarded$595 = -38;
          ds.j();
          wt.a(-101);
          int discarded$596 = 40;
          tc.a();
          kia.a(3553);
          int discarded$597 = 32768;
          kmb.a();
          int discarded$598 = 0;
          wja.a();
          bsb.a(23870);
          int discarded$599 = 8;
          dp.a();
          int discarded$600 = -53;
          lmb.a();
          int discarded$601 = 75;
          pgb.a();
          int discarded$602 = -30;
          nqa.a();
          mab.a(-23483);
          int discarded$603 = -108;
          wsb.b();
          int discarded$604 = 0;
          ufb.a();
          int discarded$605 = 120;
          vfa.c();
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
          int discarded$606 = 111;
          fcb.a();
          int discarded$607 = 101;
          dla.a();
          int discarded$608 = -49;
          mn.a();
          int discarded$609 = 24388;
          ml.e();
          int discarded$610 = -116;
          iwa.a();
          int discarded$611 = 0;
          igb.a();
          int discarded$612 = -47;
          ro.a();
          kma.c(-58);
          int discarded$613 = 114;
          lja.c();
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
          int discarded$614 = 12472;
          jb.a();
          uj.a((byte) -95);
          int discarded$615 = 65;
          eqb.a();
          es.a(param0);
          int discarded$616 = 26;
          pd.c();
          oma.a(28801);
          int discarded$617 = 1;
          bea.a();
          wm.a((byte) -110);
          una.a((byte) -98);
          int discarded$618 = -76;
          bba.b();
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
          int discarded$619 = 30089;
          qsa.a();
          crb.l(3);
          nbb.j((byte) -127);
          int discarded$620 = 3;
          it.c();
          int discarded$621 = 1;
          jo.a();
          fba.b(117);
          int discarded$622 = -124;
          tj.g();
          int discarded$623 = 0;
          rba.a();
          int discarded$624 = 0;
          aoa.a();
          int discarded$625 = 3;
          pe.h();
          int discarded$626 = 61;
          so.a();
          twa.a(32);
          tw.a(-120);
          rj.a();
          ncb.a(500);
          cib.a(-18013);
          llb.f(-2147483648);
          bv.a(39);
          int discarded$627 = -1;
          hw.a();
          bfb.b();
          int discarded$628 = 35;
          aaa.a();
          int discarded$629 = 17674;
          tr.b();
          vpa.a(param0);
          int discarded$630 = 114;
          qga.a();
          int discarded$631 = 1;
          qs.a();
          int discarded$632 = 26936;
          joa.a();
          int discarded$633 = 16606;
          qua.a();
          int discarded$634 = 0;
          sfa.a();
          ara.a(true);
          cf.c(112);
          int discarded$635 = -44;
          dab.b();
          int discarded$636 = 0;
          tja.a();
          nwa.a(1);
          int discarded$637 = 1;
          rgb.a();
          int discarded$638 = 127;
          ptb.b();
          int discarded$639 = 94;
          tt.a();
          int discarded$640 = 1;
          jpa.a();
          int discarded$641 = 1;
          ika.b();
          pob.a((byte) 24);
          lrb.a((byte) 118);
          int discarded$642 = 6970;
          cc.c();
          int discarded$643 = -15818;
          iia.b();
          int discarded$644 = -2684;
          om.b();
          jsb.b((byte) 11);
          int discarded$645 = -10570;
          ih.b();
          cqb.c(-120);
          int discarded$646 = 18;
          gda.c();
          lu.a((byte) 87);
          vra.a((byte) -66);
          int discarded$647 = -127;
          kl.b();
          aib.a((byte) 48);
          int discarded$648 = -116;
          mqb.j();
          int discarded$649 = 51200;
          rdb.c();
          int discarded$650 = 12035;
          rca.a();
          int discarded$651 = 64;
          imb.a();
          int discarded$652 = 70;
          kra.a();
          int discarded$653 = 1;
          pea.a();
          int discarded$654 = 96;
          sra.a();
          ii.b(25498);
          int discarded$655 = -120;
          bmb.a();
          int discarded$656 = 15060;
          dqb.a();
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
          int discarded$657 = 19;
          gnb.b();
          fkb.d(-25815);
          q.b();
          ht.a(false);
          vka.d();
          int discarded$658 = 2;
          iab.a();
          int discarded$659 = 100;
          um.a();
          int discarded$660 = 95;
          lc.a();
          int discarded$661 = 2;
          ssa.a();
          int discarded$662 = 1;
          pr.b();
          int discarded$663 = 0;
          spb.b();
          int discarded$664 = 38;
          enb.a();
          ae.e(-1);
          nl.a(2128263208);
          int discarded$665 = 26;
          mba.a();
          fgb.a(8);
          int discarded$666 = 74;
          cwa.a();
          int discarded$667 = 9911;
          wia.a();
          int discarded$668 = -96;
          ida.h();
          int discarded$669 = 0;
          ud.e();
          int discarded$670 = 112;
          rq.f();
          int discarded$671 = 61;
          rla.i();
          vla.e(3);
          int discarded$672 = 115;
          waa.i();
          int discarded$673 = -114;
          dj.a();
          rbb.b((byte) -29);
          int discarded$674 = -127;
          kr.a();
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
          int discarded$675 = -73;
          gdb.a();
          int discarded$676 = 1;
          lo.a();
          int discarded$677 = 0;
          psb.a();
          int discarded$678 = 124;
          oib.a();
          int discarded$679 = 55;
          vw.a();
          wc.b(-20221);
          ona.c(125);
          pfa.b(63);
          int discarded$680 = 5;
          fwa.b();
          int discarded$681 = 37;
          ppb.a();
          int discarded$682 = 22;
          pjb.e();
          int discarded$683 = 0;
          aw.h();
          int discarded$684 = 127;
          wdb.e();
          int discarded$685 = -106;
          hqb.a();
          int discarded$686 = 0;
          lwa.h();
          int discarded$687 = 1;
          cna.h();
          bs.a((byte) 42);
          int discarded$688 = 126;
          ooa.h();
          fh.d(-31049);
          int discarded$689 = 78;
          qc.a();
          int discarded$690 = -106;
          ffb.a();
          kw.g((byte) 124);
          int discarded$691 = -89;
          pia.e();
          int discarded$692 = 1;
          bra.a();
          int discarded$693 = 5;
          cd.a();
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
          int discarded$694 = -16;
          mr.l();
          int discarded$695 = 1;
          ija.a();
          int discarded$696 = 0;
          uc.a();
          int discarded$697 = 127;
          lm.a();
          int discarded$698 = 80;
          wk.a();
          int discarded$699 = 85;
          tjb.i();
          int discarded$700 = -33;
          jv.a();
          tgb.b((byte) -58);
          int discarded$701 = -128;
          eua.a();
          int discarded$702 = 122;
          feb.a();
          int discarded$703 = 6947;
          alb.a();
          int discarded$704 = 22089;
          uv.a();
          uea.a((byte) -18);
          int discarded$705 = 0;
          ei.a();
          int discarded$706 = 1;
          jba.a();
          bob.b(22540);
          shb.c((byte) 71);
          bl.i((byte) -17);
          int discarded$707 = 54;
          ar.b();
          int discarded$708 = 1;
          hnb.i();
          fm.a((byte) -114);
          iw.f(-27545);
          int discarded$709 = -104;
          nva.f();
          int discarded$710 = 124;
          htb.d();
          dqa.b(param0);
          oda.a(0);
          int discarded$711 = -126;
          pwa.a();
          whb.a(-113);
          int discarded$712 = 104;
          ub.c();
          int discarded$713 = 46;
          mo.d();
          int discarded$714 = 32;
          bhb.a();
          umb.a(16214);
          pca.d(9);
          int discarded$715 = 0;
          hg.a();
          int discarded$716 = -88;
          gtb.a();
          hp.a(false);
          int discarded$717 = -19;
          fnb.a();
          int discarded$718 = -11954;
          mia.a();
          int discarded$719 = -98;
          dv.a();
          sa.b();
          eka.b(0);
          gqb.a(126);
          uab.a(0);
          fca.a();
          int discarded$720 = 118;
          wma.b();
          int discarded$721 = 124;
          csa.a();
          cjb.a(0);
          int discarded$722 = -103;
          bd.a();
          int discarded$723 = 115;
          kea.a();
          int discarded$724 = 127;
          kca.a();
          int discarded$725 = 1;
          ps.a();
          cv.a();
          int discarded$726 = 53;
          dha.a();
          int discarded$727 = -28;
          fia.a();
          ota.a();
          int discarded$728 = 66;
          qd.a();
          pfb.a(118);
          int discarded$729 = 0;
          bbb.a();
          int discarded$730 = 0;
          jw.a();
          int discarded$731 = -109;
          rb.a();
          int discarded$732 = 91;
          ndb.a();
          int discarded$733 = -125;
          qdb.a();
          int discarded$734 = 1;
          odb.a();
          dmb.a((byte) -128);
          wna.a((byte) -128);
          int discarded$735 = 15261;
          lh.a();
          vp.b(-2404);
          int discarded$736 = 0;
          ehb.a();
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
          int discarded$737 = -122;
          qeb.a();
          int discarded$738 = 110;
          tn.a();
          int discarded$739 = 124;
          bqa.a();
          int discarded$740 = 0;
          via.b();
          int discarded$741 = 1;
          qw.a();
          wh.h(0);
          km.g((byte) 114);
          jma.e(100);
          ga.c((byte) -110);
          qda.a();
          tga.j(88);
          int discarded$742 = -128;
          uf.h();
          ttb.d(16711935);
          int discarded$743 = -30;
          kja.a();
          int discarded$744 = -2459;
          gm.e();
          int discarded$745 = -125;
          jla.a();
          int discarded$746 = -27183;
          eca.e();
          int discarded$747 = 0;
          reb.a();
          int discarded$748 = 77;
          w.i();
          ut.a(-72);
          int discarded$749 = -17719;
          cja.a();
          int discarded$750 = 6344;
          ata.a();
          fj.a(0);
          int discarded$751 = 106;
          ita.j();
          int discarded$752 = -81;
          vq.i();
          int discarded$753 = 1;
          sha.f();
          int discarded$754 = -126;
          nga.b();
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
          int discarded$755 = -120;
          rlb.a();
          fbb.a(param0);
          kha.b(1);
          int discarded$756 = 0;
          mpb.g();
          vf.a((byte) -26);
          tla.b(1);
          int discarded$757 = 1;
          rpa.f();
          epb.c(13);
          int discarded$758 = 81;
          rtb.c();
          pf.d((byte) -101);
          int discarded$759 = -84;
          pb.a();
          mj.a(17);
          int discarded$760 = 108;
          rga.a();
          oj.b(108);
          int discarded$761 = 17121;
          kba.a();
          int discarded$762 = -3696;
          aba.a();
          atb.a(true);
          uda.b((byte) -96);
          int discarded$763 = 0;
          as.c();
          je.b((byte) 117);
          int discarded$764 = 8192;
          vmb.a();
          int discarded$765 = 13;
          slb.a();
          uja.a((byte) -123);
          int discarded$766 = -125;
          jra.a();
          int discarded$767 = 771;
          jp.K();
          int discarded$768 = -118;
          esb.e();
          int discarded$769 = -1;
          hma.a();
          re.d(-2705);
          int discarded$770 = -100;
          ef.e();
          int discarded$771 = 29914;
          tda.g();
          qh.l((byte) -123);
          bk.e(80);
          vcb.j((byte) -7);
          int discarded$772 = -109;
          ta.a();
          int discarded$773 = -27982;
          se.c();
          int discarded$774 = 41;
          ri.a();
          int discarded$775 = 5697;
          ska.e();
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
          int discarded$776 = 1;
          aqb.b();
          int discarded$777 = 15325;
          gab.a();
          int discarded$778 = -1;
          pja.d();
          wv.d(65280);
          int discarded$779 = -23460;
          ul.a();
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
          int discarded$780 = -117;
          kbb.e();
          int discarded$781 = 1;
          me.a();
          int discarded$782 = 1;
          lnb.e();
          int discarded$783 = -6200;
          hpb.d();
          qqa.e((byte) -104);
          int discarded$784 = -120;
          moa.d();
          int discarded$785 = -118;
          cm.e();
          md.a(false);
          koa.d(19);
          gia.a(false);
          int discarded$786 = 86;
          rw.e();
          elb.c((byte) 78);
          int discarded$787 = -1210841460;
          hk.d();
          int discarded$788 = -123;
          oqb.e();
          hc.a();
          int discarded$789 = -101;
          jn.a();
          lia.a(97);
          uva.a();
          int discarded$790 = -16777216;
          woa.a();
          int discarded$791 = 111;
          cs.a();
          int discarded$792 = -128;
          hq.c();
          r.e((byte) -123);
          int discarded$793 = -96;
          ct.a();
          int discarded$794 = -122;
          mb.f();
          int discarded$795 = 8345;
          of.a();
          ob.c((byte) 42);
          nv.e(33);
          int discarded$796 = -95;
          mea.c();
          int discarded$797 = -15081;
          qg.c();
          int discarded$798 = 0;
          jjb.a();
          ne.a(-2);
          int discarded$799 = -4353;
          uia.a();
          int discarded$800 = -92;
          gpa.a();
          int discarded$801 = 105;
          im.c();
          int discarded$802 = 91;
          tob.a();
          int discarded$803 = -4509;
          bt.a();
          int discarded$804 = 0;
          vab.a();
          int discarded$805 = 26;
          bkb.b();
          int discarded$806 = 124;
          oaa.c();
          int discarded$807 = 117;
          mnb.b();
          int discarded$808 = 0;
          dda.a();
          int discarded$809 = -9;
          uga.a();
          iib.d(1);
          ku.a((byte) 108);
          uob.d(3168);
          int discarded$810 = 1;
          ti.a();
          int discarded$811 = 13776;
          mw.d();
          int discarded$812 = 90;
          ts.a();
          int discarded$813 = 88;
          tu.a();
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
          int discarded$814 = 15;
          gib.a();
          ko.a(-35);
          mjb.a(-81);
          sv.e(0);
          int discarded$815 = 46;
          wu.d();
          int discarded$816 = -18951;
          hab.e();
          bib.c(param0);
          int discarded$817 = -19;
          kt.d();
          gna.b(false);
          vjb.b((byte) 53);
          ho.a(13032);
          ubb.f((byte) 42);
          int discarded$818 = 106;
          gn.e();
          qva.a(6);
          rab.a(148);
          gla.a(-5709);
          int discarded$819 = -113;
          fib.e();
          int discarded$820 = 23008;
          bva.b();
          tb.a(-75);
          int discarded$821 = -109;
          pl.b();
          int discarded$822 = 80;
          fk.a();
          int discarded$823 = -5509;
          iob.c();
          vhb.b(21053);
          int discarded$824 = 39;
          hla.a();
          int discarded$825 = 20000000;
          asa.a();
          int discarded$826 = 124;
          ue.a();
          sja.a((byte) 120);
          qb.a(111);
          int discarded$827 = -99;
          cl.a();
          int discarded$828 = 126;
          ccb.b();
          int discarded$829 = -46;
          amb.a();
          int discarded$830 = 0;
          gl.a();
          int discarded$831 = 121;
          vva.a();
          int discarded$832 = -52;
          meb.a();
          kpb.c(17433);
          int discarded$833 = 118;
          dw.a();
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
          int discarded$834 = 777;
          kab.c();
          int discarded$835 = 1;
          qn.a();
          int discarded$836 = 95;
          ifa.a();
          int discarded$837 = 113;
          vu.e();
          int discarded$838 = 119;
          fa.c();
          ujb.a((byte) -111);
          int discarded$839 = 0;
          lw.a();
          int discarded$840 = 127;
          kob.a();
          rqa.a(true);
          gva.a(true);
          int discarded$841 = 0;
          qab.b();
          kua.a(181765988);
          int discarded$842 = 120;
          nfb.b();
          int discarded$843 = 43;
          etb.b();
          int discarded$844 = -30938;
          pn.a();
          nfa.d(-3408);
          rea.d(102);
          qsb.d(104);
          uw.d(34037);
          int discarded$845 = 108;
          lg.d();
          nnb.b(false);
          int discarded$846 = 109;
          pva.d();
          fpa.d(110);
          int discarded$847 = 0;
          hka.d();
          int discarded$848 = 105;
          fjb.a();
          ecb.a(95);
          int discarded$849 = -13;
          wva.a();
          int discarded$850 = 0;
          av.a();
          int discarded$851 = 124;
          dtb.b();
          int discarded$852 = -80;
          efb.b();
          akb.b((byte) 21);
          int discarded$853 = 62;
          fpb.l();
          deb.i((byte) -125);
          int discarded$854 = 75;
          wqb.i();
          mna.i((byte) 9);
          int discarded$855 = 8192;
          teb.l();
          int discarded$856 = -22;
          fma.i();
          int discarded$857 = 3;
          rma.l();
          wca.l(-36);
          int discarded$858 = 17036;
          ira.l();
          int discarded$859 = -81;
          jeb.i();
          int discarded$860 = -103;
          ok.b();
          ej.b((byte) 124);
          int discarded$861 = 80;
          gfb.b();
          int discarded$862 = -120;
          dkb.b();
          int discarded$863 = -121;
          jga.a();
          gs.b((byte) 120);
          gmb.a(-109);
          ng.a(false);
          ajb.c((byte) 44);
          int discarded$864 = 102;
          ns.a();
          ge.a((byte) 122);
          int discarded$865 = 126;
          eta.a();
          int discarded$866 = 0;
          mta.a();
          jdb.a(param0);
          cn.a(false);
          int discarded$867 = 92;
          vfb.a();
          hsb.b((byte) 27);
          int discarded$868 = 27;
          bf.b();
          int discarded$869 = 2;
          nra.a();
          int discarded$870 = -1;
          wkb.a();
          mbb.a(50);
          int discarded$871 = 1;
          osb.a();
          int discarded$872 = -18593;
          eoa.a();
          upb.b(50);
          int discarded$873 = 124;
          pu.a();
          int discarded$874 = -123;
          sl.a();
          int discarded$875 = -116;
          lhb.b();
          int discarded$876 = 102;
          lob.b();
          lka.a(8192);
          lsa.c((byte) -92);
          dfa.a((byte) 112);
          tpa.a(2);
          lp.b((byte) 43);
          int discarded$877 = 1;
          nna.c();
          int discarded$878 = -117;
          rg.a();
          int discarded$879 = 32;
          us.b();
          un.a(false);
          int discarded$880 = 83;
          cfa.c();
          ea.a(10);
          int discarded$881 = 0;
          nj.a();
          int discarded$882 = 1;
          br.a();
          t.a(1);
          vv.b(24358);
          int discarded$883 = -652030847;
          pbb.a();
          nrb.a(11227);
          bpa.a((byte) 68);
          int discarded$884 = -102;
          tia.a();
          int discarded$885 = -110;
          jja.b();
          int discarded$886 = -19;
          uu.a();
          int discarded$887 = 1;
          npa.a();
          int discarded$888 = 27167;
          nf.a();
          int discarded$889 = -5254;
          ci.a();
          kgb.a(0);
          int discarded$890 = -4;
          nma.b();
          int discarded$891 = 301;
          skb.a();
          jd.a(125);
          int discarded$892 = 1;
          klb.b();
          int discarded$893 = -2;
          cka.a();
          int discarded$894 = -100;
          wda.e();
          int discarded$895 = 0;
          wnb.e();
          int discarded$896 = 0;
          dpa.b();
          eq.e((byte) -105);
          uqa.a(1);
          gq.b(false);
          tca.a(-9028);
          int discarded$897 = 0;
          wg.b();
          int discarded$898 = 0;
          cg.b();
          int discarded$899 = 124;
          hca.e();
          og.a(23969);
          int discarded$900 = 7311;
          ck.a();
          int discarded$901 = 0;
          ema.a();
          int discarded$902 = -1;
          awa.a();
          int discarded$903 = 105;
          dfb.e();
          int discarded$904 = -2326;
          jrb.e();
          eja.a(2);
          int discarded$905 = 0;
          jfb.a();
          int discarded$906 = -47;
          baa.e();
          nha.e((byte) 74);
          int discarded$907 = 0;
          vea.a();
          ltb.a(10);
          int discarded$908 = 25837;
          apa.a();
          int discarded$909 = -5;
          vha.e();
          fu.e((byte) -125);
          int discarded$910 = 100;
          hjb.a();
          int discarded$911 = 9141;
          oja.a();
          int discarded$912 = 0;
          hha.a();
          int discarded$913 = 30465;
          scb.a();
          nob.a(0);
          nw.e((byte) -93);
          ddb.e((byte) 89);
          ppa.b(param0);
          na.a(27358);
          int discarded$914 = 0;
          uka.a();
          fq.a(1);
          int discarded$915 = -31;
          vba.e();
          int discarded$916 = 123;
          qwa.a();
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
          int discarded$917 = 4;
          jqa.e();
          ewa.b(false);
          int discarded$918 = 0;
          kj.a();
          s.a(18841);
          int discarded$919 = 2;
          hpa.a();
          int discarded$920 = 16224;
          fv.a();
          int discarded$921 = 98;
          sla.e();
          tsb.b(param0);
          int discarded$922 = 34;
          qf.a();
          int discarded$923 = 200;
          ji.a();
          lf.e((byte) 121);
          bsa.e((byte) -7);
          oha.a(-23714);
          nh.e((byte) 124);
          int discarded$924 = 9839;
          hra.a();
          kaa.a(-21447);
          int discarded$925 = 0;
          wpb.a();
          int discarded$926 = -71;
          k.e();
          aj.e((byte) 32);
          int discarded$927 = -122;
          edb.a();
          ueb.a(0);
          int discarded$928 = 30388;
          sp.a();
          vbb.a(2051507073);
          int discarded$929 = -92;
          ufa.a();
          int discarded$930 = -1;
          rsa.a();
          int discarded$931 = -118;
          gjb.a();
          int discarded$932 = -23822;
          gp.a();
          int discarded$933 = 0;
          urb.a();
          cga.e((byte) -31);
          int discarded$934 = -32514;
          tg.a();
          mla.a(0);
          int discarded$935 = 53562;
          eo.e();
          int discarded$936 = 95;
          fc.a();
          int discarded$937 = 84;
          kq.e();
          int discarded$938 = -91;
          ki.a();
          cw.a(118);
          int discarded$939 = -29;
          leb.e();
          jda.a(0);
          gcb.a(0);
          int discarded$940 = 106;
          cab.a();
          int discarded$941 = 25553;
          fha.a();
          int discarded$942 = 116;
          ca.e();
          int discarded$943 = 49;
          lba.e();
          int discarded$944 = 0;
          icb.a();
          erb.a(96);
          int discarded$945 = 0;
          uib.b();
          pp.a(256);
          int discarded$946 = 107;
          kk.e();
          jqb.e((byte) -15);
          int discarded$947 = 101;
          qi.a();
          int discarded$948 = -105;
          ff.a();
          int discarded$949 = -122;
          ws.e();
          te.b(param0);
          int discarded$950 = 63;
          ql.e();
          int discarded$951 = 103;
          mja.e();
          int discarded$952 = 2;
          nt.a();
          loa.a(-128);
          int discarded$953 = 3575;
          ie.e();
          dob.e((byte) -66);
          kkb.e((byte) 40);
          int discarded$954 = -20;
          ica.e();
          int discarded$955 = 22829;
          pha.a();
          int discarded$956 = 0;
          bjb.b();
          int discarded$957 = -128;
          rib.e();
          qta.b(false);
          int discarded$958 = -91;
          fla.e();
          nkb.e((byte) -115);
          int discarded$959 = 123;
          opb.e();
          int discarded$960 = 0;
          acb.b();
          int discarded$961 = 111;
          hsa.a();
          int discarded$962 = 0;
          lib.a();
          ll.e(1);
          int discarded$963 = -96;
          df.f();
          int discarded$964 = 2;
          jab.a();
          wj.e((byte) -114);
          uhb.e((byte) 32);
          int discarded$965 = -104;
          ug.f();
          neb.e((byte) -57);
          int discarded$966 = 0;
          bka.a();
          hja.a(21);
          gba.a(-21968);
          int discarded$967 = 1;
          otb.b();
          ic.a(124);
          int discarded$968 = -115;
          nsa.e();
          int discarded$969 = 87;
          hj.a();
          int discarded$970 = 0;
          nd.b();
          int discarded$971 = -70;
          wlb.e();
          int discarded$972 = -49;
          mgb.e();
          int discarded$973 = 44;
          dt.e();
          int discarded$974 = 0;
          sj.a();
          ina.a(-1721);
          mhb.e((byte) -127);
          omb.e((byte) -50);
          int discarded$975 = 53;
          oqa.e();
          int discarded$976 = 33;
          lea.a();
          int discarded$977 = -125;
          mqa.a();
          int discarded$978 = 68;
          hcb.a();
          int discarded$979 = 0;
          psa.a();
          int discarded$980 = -51;
          rh.a();
          int discarded$981 = -119;
          iua.e();
          int discarded$982 = 0;
          jgb.e();
          int discarded$983 = 37;
          jl.a();
          int discarded$984 = -119;
          bta.e();
          jnb.a(-126);
          int discarded$985 = -1;
          fd.e();
          int discarded$986 = 32;
          ir.e();
          dsb.a(-23436);
          int discarded$987 = -100;
          ljb.a();
          int discarded$988 = 42;
          era.a();
          ew.b(param0);
          int discarded$989 = 7;
          mk.e();
          ov.a(46);
          vg.e((byte) -114);
          lqb.a(122);
          int discarded$990 = 87;
          sdb.e();
          int discarded$991 = 76;
          cha.e();
          int discarded$992 = 3;
          stb.a();
          int discarded$993 = 124;
          qt.a();
          gt.e((byte) 123);
          int discarded$994 = 51;
          vgb.a();
          int discarded$995 = 124;
          qja.a();
          int discarded$996 = 1;
          jna.b();
          vnb.a(54);
          fsa.e((byte) 56);
          int discarded$997 = 55;
          epa.a();
          int discarded$998 = 112;
          tfb.e();
          int discarded$999 = -61;
          msa.e();
          int discarded$1000 = -127;
          nr.e();
          int discarded$1001 = -78;
          oba.a();
          hlb.e((byte) 95);
          int discarded$1002 = 122;
          ieb.a();
          int discarded$1003 = -75;
          pra.a();
          qla.e((byte) 126);
          seb.b(true);
          int discarded$1004 = 66;
          tma.f();
          cca.e((byte) -41);
          int discarded$1005 = -117;
          mtb.e();
          int discarded$1006 = 1;
          gwa.b();
          int discarded$1007 = 12124934;
          nhb.a();
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
          int discarded$1008 = 1;
          afa.b();
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
          int discarded$1009 = 112;
          uta.e();
          int discarded$1010 = 70;
          bfa.a();
          int discarded$1011 = -124;
          eg.a();
          int discarded$1012 = 1;
          aab.b();
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
          int discarded$1013 = -15435;
          ee.e();
          int discarded$1014 = -612363640;
          lb.a();
          int discarded$1015 = 76;
          tab.a();
          emb.a(23518);
          int discarded$1016 = -27645;
          mpa.a();
          fb.e((byte) 42);
          rta.a(32);
          int discarded$1017 = 122;
          iqb.a();
          int discarded$1018 = 1;
          wpa.b();
          int discarded$1019 = 6;
          dhb.a();
          int discarded$1020 = 80;
          pua.a();
          aha.a(1511754497);
          int discarded$1021 = -110;
          eaa.a();
          int discarded$1022 = 32;
          vwa.a();
          bqb.e((byte) -96);
          int discarded$1023 = 1;
          jmb.b();
          int discarded$1024 = -27;
          ad.e();
          hr.a(-60);
          dd.a(85);
          int discarded$1025 = -28228;
          bm.a();
          int discarded$1026 = -119;
          aka.e();
          int discarded$1027 = -8;
          gra.e();
          int discarded$1028 = 27154;
          fqb.a();
          int discarded$1029 = 0;
          pqa.a();
          int discarded$1030 = 88;
          gkb.a();
          int discarded$1031 = 89;
          jh.a();
          int discarded$1032 = 21584;
          hmb.a();
          rnb.e((byte) 127);
          web.e((byte) 102);
          eia.a(92);
          lna.e((byte) -115);
          u.a(4);
          int discarded$1033 = -87;
          qia.e();
          int discarded$1034 = 127;
          jha.e();
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
          int discarded$1035 = -97;
          sga.e();
          vl.a(127);
          int discarded$1036 = 106;
          dua.f();
          mp.b(false);
          rja.e((byte) -91);
          lva.a(617169759);
          int discarded$1037 = 0;
          raa.a();
          gka.a(-114);
          int discarded$1038 = -17297;
          eha.a();
          int discarded$1039 = 1600;
          vpb.a();
          int discarded$1040 = 107;
          ra.a();
          int discarded$1041 = 1;
          kwa.b();
          int discarded$1042 = -20005;
          jea.e();
          int discarded$1043 = 194;
          noa.a();
          gsa.a(109);
          int discarded$1044 = 119;
          ks.e();
          js.a(-20626);
          int discarded$1045 = 0;
          wd.a();
          int discarded$1046 = -100;
          ena.a();
          int discarded$1047 = 101;
          tk.e();
          int discarded$1048 = -16;
          job.e();
          int discarded$1049 = -1;
          rd.a();
          kn.a(16086);
          gk.a(116);
          int discarded$1050 = 117;
          iv.a();
          hgb.e((byte) 57);
          ejb.e(117);
          int discarded$1051 = 99;
          vda.e();
          int discarded$1052 = 65;
          up.e();
          int discarded$1053 = -125;
          qmb.e();
          wrb.a(100);
          int discarded$1054 = 71;
          jm.e();
          int discarded$1055 = 15110;
          rf.a();
          int discarded$1056 = -29417;
          pga.a();
          nda.a(0);
          int discarded$1057 = 125;
          lr.a();
          qv.e((byte) -78);
          int discarded$1058 = -1;
          pmb.a();
          eob.a(127);
          jhb.e((byte) 53);
          sbb.a(-120);
          int discarded$1059 = -52;
          dn.a();
          int discarded$1060 = -25;
          tnb.e();
          int discarded$1061 = 108;
          usa.e();
          sta.a(63);
          int discarded$1062 = -116;
          ceb.e();
          int discarded$1063 = -80;
          qra.e();
          po.a(69);
          mlb.e((byte) 92);
          int discarded$1064 = -99;
          dh.e();
          am.e(-1);
          int discarded$1065 = -80;
          nlb.e();
          int discarded$1066 = 16;
          plb.a();
          fhb.a(-116);
          int discarded$1067 = 14675;
          cta.a();
          int discarded$1068 = 0;
          ahb.a();
          int discarded$1069 = 21;
          vaa.e();
          int discarded$1070 = 107;
          hwa.e();
          int discarded$1071 = -92;
          vsa.a();
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
          int discarded$1072 = -124;
          wo.a();
          bpb.a(0);
          int discarded$1073 = 7848;
          kg.a();
          eva.a(0);
          kpa.a(146);
          int discarded$1074 = 97;
          we.e();
          ioa.e((byte) -102);
          int discarded$1075 = -102;
          pma.e();
          hoa.a(-123);
          int discarded$1076 = -127;
          vqb.e();
          lcb.a(0);
          orb.a(-982);
          int discarded$1077 = -59;
          ijb.a();
          int discarded$1078 = 153;
          wea.a();
          lda.a(-2573);
          hv.e((byte) 15);
          ma.a(-17548);
          int discarded$1079 = 76;
          tqa.a();
          int discarded$1080 = 0;
          st.a();
          int discarded$1081 = 118;
          qe.e();
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
          int discarded$1082 = 0;
          fmb.a();
          int discarded$1083 = 92;
          bja.f();
          int discarded$1084 = 62;
          ip.e();
          int discarded$1085 = 163;
          cu.a();
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
        int discarded$1086 = -113;
        oea.e();
        int discarded$1087 = -10515;
        nu.a();
        int discarded$1088 = -17;
        jj.a();
        int discarded$1089 = 0;
        lgb.b();
        ega.e((byte) 28);
        int discarded$1090 = 12992;
        gr.a();
        int discarded$1091 = -99;
        uua.e();
        wra.a(0);
        ss.a(169);
        int discarded$1092 = -107;
        qna.a();
        rua.e((byte) 83);
        go.a(-25544);
        int discarded$1093 = 176;
        ipa.a();
        ohb.e((byte) 84);
        int discarded$1094 = 177;
        fi.a();
        int discarded$1095 = 127;
        mwa.a();
        int discarded$1096 = 64;
        uh.a();
        knb.e((byte) -118);
        qnb.a(0);
        int discarded$1097 = 2;
        uaa.a();
        int discarded$1098 = 126;
        ktb.e();
        int discarded$1099 = 69;
        vk.e();
        gha.a(0);
        int discarded$1100 = 113;
        tta.a();
        tdb.a(-120);
        int discarded$1101 = -19013;
        ula.a();
        int discarded$1102 = 21942;
        obb.a();
        int discarded$1103 = 0;
        jc.b();
        lqa.e((byte) -122);
        int discarded$1104 = 51;
        fda.f();
        ukb.e((byte) -71);
        ju.e((byte) 65);
        int discarded$1105 = -28;
        paa.e();
        iha.a(-105);
        wba.a(-122);
        hia.e(0);
        int discarded$1106 = 80;
        vtb.a();
        tba.e((byte) -89);
        int discarded$1107 = -118;
        qhb.e();
        int discarded$1108 = 26468;
        jt.a();
        int discarded$1109 = 193;
        db.e();
        int discarded$1110 = -33;
        rob.a();
        int discarded$1111 = 7069;
        vs.a();
        mi.f((byte) -125);
        int discarded$1112 = 0;
        nb.a();
        int discarded$1113 = 67;
        hga.a();
        cqa.e((byte) -52);
        int discarded$1114 = 0;
        tra.a();
        int discarded$1115 = 57;
        ep.e();
        tq.b(true);
        int discarded$1116 = 200;
        thb.a();
        int discarded$1117 = 17231;
        qcb.a();
        int discarded$1118 = -120;
        gca.a();
        int discarded$1119 = -63;
        qa.e();
        saa.a(-14010);
        int discarded$1120 = 204;
        to.a();
        wjb.a(235);
        int discarded$1121 = 124;
        jca.a();
        int discarded$1122 = 3;
        tkb.a();
        int discarded$1123 = 0;
        eh.a();
        int discarded$1124 = 207;
        bga.a();
        int discarded$1125 = -90;
        bnb.e();
        bb.e((byte) 123);
        int discarded$1126 = 0;
        oh.e();
        jta.a(-29044);
        int discarded$1127 = 121;
        geb.e();
        int discarded$1128 = -101;
        tha.e();
        int discarded$1129 = -126;
        lv.a();
        int discarded$1130 = 91;
        haa.e();
        int discarded$1131 = 215;
        ap.a();
        int discarded$1132 = -99;
        ib.a();
        int discarded$1133 = -105;
        mg.e();
        int discarded$1134 = 0;
        ldb.b();
        int discarded$1135 = -33;
        ou.e();
        int discarded$1136 = -121;
        vob.e();
        int discarded$1137 = 84;
        cnb.e();
        hm.a(-123);
        int discarded$1138 = 221;
        ikb.a();
        dia.a(0);
        qtb.a(16407);
        int discarded$1139 = -27266;
        wl.a();
        int discarded$1140 = 225;
        rhb.a();
        flb.a(-26016);
        int discarded$1141 = 8;
        ce.a();
        int discarded$1142 = 14055;
        gh.a();
        dca.a(103);
        int discarded$1143 = -128;
        vj.a();
        kp.a(46);
        int discarded$1144 = 0;
        dsa.a();
        int discarded$1145 = -106;
        fja.e();
        int discarded$1146 = -15;
        tl.e();
        gu.a(232);
        rfa.e((byte) 49);
        int discarded$1147 = 233;
        ah.a();
        int discarded$1148 = 91;
        iqa.e();
        bab.a(true);
        fob.a(75);
        int discarded$1149 = 540800;
        rc.a();
        int discarded$1150 = -104;
        vlb.a();
        int discarded$1151 = -1;
        ada.a();
        int discarded$1152 = -1;
        wga.a();
        uk.c((byte) 67);
        int discarded$1153 = 6312;
        tib.f();
        int discarded$1154 = 126;
        ocb.d();
        int discarded$1155 = 2;
        rm.f();
        wgb.f(68);
        vqa.f(1);
        int discarded$1156 = 94;
        oe.a();
        int discarded$1157 = -63;
        hob.c();
        sc.c(123);
        ola.b(2);
        int discarded$1158 = -17471;
        glb.b();
        int discarded$1159 = -1;
        rv.a();
        int discarded$1160 = 84;
        vib.a();
        int discarded$1161 = -115;
        bca.a();
        int discarded$1162 = 0;
        pab.a();
        ev.a(28378);
        int discarded$1163 = 30826;
        eu.b();
        int discarded$1164 = -127;
        cp.a();
        dib.a((byte) 89);
        lkb.a(199);
        mmb.a(2);
        int discarded$1165 = 0;
        dgb.a();
        ((VoidHunters) this).field_F = null;
        ((VoidHunters) this).field_u = null;
    }

    private final boolean h() {
        int var2 = 0;
        int var3 = field_G;
        mab.field_a = (VoidHunters) this;
        if (!(eu.field_i.a((byte) 68))) {
            return false;
        }
        fka.a("Initing menus", (byte) -62);
        int discarded$0 = -111;
        csa.b();
        for (var2 = 0; var2 < 10; var2++) {
            lo.field_a[var2] = new wf(var2);
        }
        wgb.field_f = 0;
        oab.field_o = 0;
        gib.a(-106, 50);
        fka.a("Playing music", (byte) -101);
        int discarded$1 = -114;
        hb.a(pab.field_k[0]);
        for (var2 = 0; var2 < 16; var2++) {
            fi.field_o.b(0, (byte) 18, var2);
        }
        wgb.a(jj.field_p, ama.field_o, qaa.field_a, -131, qua.field_b, nl.field_n, oma.field_i);
        fka.a("Initing audiohandler", (byte) -64);
        int discarded$2 = 89;
        qn.c();
        fkb.a(2096);
        fka.a("Finished loadloop", (byte) -128);
        int discarded$3 = 0;
        if (this.l()) {
            if (fda.e((byte) 116)) {
                wu.a(true, false);
            }
        }
        return true;
    }

    final void b(int param0) {
        int discarded$4 = 0;
        prb.b();
        if (!(null == psb.field_b)) {
            cqb.b((byte) 86);
        }
        jn.a(1);
        if (param0 >= -102) {
            String discarded$5 = VoidHunters.b(63, 91);
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
          int discarded$17 = 61848;
          if (!eo.a()) {
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
                int discarded$18 = 0;
                gnb.a();
                wp.field_a = tjb.field_wb;
                break L3;
              } else {
                break L3;
              }
            } else {
              if (tjb.field_wb == wp.field_a) {
                if (!fda.e((byte) 102)) {
                  L4: {
                    int discarded$19 = 0;
                    ek.b();
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
                        int discarded$20 = 127;
                        if (!ata.e()) {
                          break L10;
                        } else {
                          int discarded$21 = -22029;
                          if (!qmb.a()) {
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
              int discarded$22 = 17043;
              glb.c();
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
                          int discarded$23 = 123;
                          hlb.a(tqa.e((byte) 93), var4 != 0, sea.a(-99));
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
                      int discarded$24 = 127;
                      if (!ata.e()) {
                        break L19;
                      } else {
                        int discarded$25 = -22029;
                        if (qmb.a()) {
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
                                          int discarded$26 = 23;
                                          int discarded$27 = 12;
                                          int discarded$28 = 15;
                                          int discarded$29 = 13;
                                          if (gbb.a()) {
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
                int discarded$30 = -29130;
                VoidHunters.m();
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
              int fieldTemp$31 = wva.field_b + 1;
              wva.field_b = wva.field_b + 1;
              if (fieldTemp$31 != 335) {
                break L3;
              } else {
                wva.field_b = 0;
                ksa discarded$32 = dv.field_c.a(true);
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
            int discarded$33 = -127;
            this.g();
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
                int discarded$20 = -9934;
                jc.a();
                break L0;
              } else {
                break L0;
              }
            }
            if (fu.a(77)) {
              int discarded$21 = 0;
              hka.a(111, var10, rnb.a());
              return;
            } else {
              if (uob.field_e) {
                if (!hkb.b(-1)) {
                  uoa.a(lwa.field_vb, -1, 100.0f);
                  int discarded$22 = 1;
                  pga.a(var10);
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
                              boolean discarded$23 = og.field_r.b();
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
                    int discarded$24 = 1;
                    fr.a(jnb.e(83));
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
                            int discarded$25 = -119;
                            this.a(2, 20 + cd.a(true), fk.b());
                            break L15;
                          }
                        }
                        int discarded$26 = 71;
                        int discarded$27 = 0;
                        rw.a();
                        wna.field_e = true;
                        break L14;
                      } else {
                        int discarded$28 = 0;
                        if (ffa.a()) {
                          L16: {
                            ksa.a((phb[]) null, 8, 0, (phb[]) null, (phb[]) null, 8555923, 0, 15658751, 15658751, (no) (Object) dsb.field_p, dma.field_j / 2, 0, 0, -14109, dma.field_g / 2);
                            var4_int = 16;
                            var5_int = var4_int + eba.a(0);
                            int discarded$29 = -22954;
                            var6 = var4_int + geb.a();
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
                          int discarded$30 = -1321004447;
                          ieb.f();
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
                                int discarded$31 = -24;
                                var6 = gua.e();
                                int discarded$32 = 102;
                                var7 = rg.b();
                                break L21;
                              }
                            }
                          }
                          int discarded$33 = 1;
                          var8_ref_kla = feb.a(og.field_r);
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
                        int discarded$34 = 13879;
                        var7 = (ip.field_p.width >> 1) - (tea.a(var6, var5) >> 1);
                        var8 = (ip.field_p.height >> 1) - (pqa.a(false, var6) >> 1);
                        int discarded$35 = 13879;
                        af.a((byte) -115, 200, fkb.a(var6, (byte) -121) * 8, var7 - 16, var8 + -(5 * fkb.a(var6, (byte) -121)), 32 + tea.a(var6, var5));
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
                        int discarded$36 = 0;
                        int discarded$37 = 0;
                        int discarded$38 = 0;
                        dh.a(var10);
                        break L26;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                int discarded$39 = 1;
                pga.a(var10);
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
