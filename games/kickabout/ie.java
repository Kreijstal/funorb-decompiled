/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends i {
    static String field_H;
    private int field_I;
    static int field_F;
    static int field_G;

    final static void g() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        nl var4_ref_nl = null;
        int var5_int = 0;
        boolean[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        boolean[] var10 = null;
        boolean[] var11 = null;
        boolean[] var12 = null;
        int stackIn_25_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (null == et.field_d) {
                break L1;
              } else {
                if (et.field_d.field_u != 4) {
                  break L1;
                } else {
                  if (ks.field_e != 14) {
                    break L1;
                  } else {
                    if (0 < je.field_m) {
                      int fieldTemp$12 = je.field_m - 1;
                      je.field_m = je.field_m - 1;
                      if (fieldTemp$12 != 0) {
                        break L1;
                      } else {
                        gv discarded$13 = gm.a(de.field_a, true, (byte) -118);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (null != et.field_d) {
              L2: {
                if (sl.field_Eb) {
                  int discarded$14 = 105;
                  if (bt.b()) {
                    sl.field_Eb = false;
                    et.field_d.field_R[0].field_g = vb.field_d;
                    p.a(false);
                    int discarded$15 = -1622;
                    mk.b();
                    int discarded$16 = 99;
                    no.g();
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  if (qt.d(-8)) {
                    jw.c(ks.field_e + 1, false);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                int discarded$17 = 0;
                var1_int = je.a();
                var2 = ob.a(var1_int, -128);
                if (~mc.field_a != ~var2) {
                  L4: {
                    dd.field_f = 60;
                    var3 = -mc.field_a + (mc.field_a + var2 >> 1);
                    if (0 == var3) {
                      L5: {
                        if (~mc.field_a > ~var2) {
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          break L5;
                        } else {
                          stackOut_23_0 = -1;
                          stackIn_25_0 = stackOut_23_0;
                          break L5;
                        }
                      }
                      var3 = stackIn_25_0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    L7: {
                      var3 = Math.min(Math.max(-30, var3), 30);
                      mc.field_a = mc.field_a + var3;
                      if (var3 <= 0) {
                        break L7;
                      } else {
                        if (~mc.field_a < ~var2) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var3 >= 0) {
                      break L3;
                    } else {
                      if (var2 <= mc.field_a) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  mc.field_a = var2;
                  break L3;
                } else {
                  if (dd.field_f <= 0) {
                    break L3;
                  } else {
                    dd.field_f = dd.field_f - 1;
                    break L3;
                  }
                }
              }
              L8: {
                L9: {
                  L10: {
                    var3 = 640;
                    if (ks.field_e != 1) {
                      break L10;
                    } else {
                      if (sl.field_Eb) {
                        break L10;
                      } else {
                        if (1050 > mh.field_k.a(true)) {
                          break L9;
                        } else {
                          if (640 != cq.field_g) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  if (2 == ks.field_e) {
                    break L9;
                  } else {
                    if (ks.field_e == 3) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                var3 = 470;
                break L8;
              }
              L11: {
                if (~var3 == ~cq.field_g) {
                  break L11;
                } else {
                  L12: {
                    var4 = var3 + -cq.field_g >> 2;
                    if (var4 != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (cq.field_g >= var3) {
                          stackOut_46_0 = -1;
                          stackIn_47_0 = stackOut_46_0;
                          break L13;
                        } else {
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L13;
                        }
                      }
                      var4 = stackIn_47_0;
                      break L12;
                    }
                  }
                  cq.field_g = cq.field_g + var4;
                  break L11;
                }
              }
              L14: {
                int discarded$18 = 11;
                ul.b();
                int discarded$19 = 125;
                vc.h();
                if (ks.field_e != 6) {
                  break L14;
                } else {
                  int discarded$20 = -127;
                  o.a();
                  break L14;
                }
              }
              L15: {
                if (ks.field_e != 7) {
                  break L15;
                } else {
                  var4 = 1;
                  L16: while (true) {
                    if (var4 >= 4) {
                      L17: {
                        ig.a(false, (byte) 23, 1, 0);
                        var4_ref_nl = et.field_d.field_P[1][4];
                        if (0 != et.field_d.field_V.field_m) {
                          break L17;
                        } else {
                          if (var4_ref_nl.field_u != 0) {
                            break L17;
                          } else {
                            var5_int = var4_ref_nl.f(-111) + -ld.field_f.f(-124);
                            var6 = var4_ref_nl.a(true) + -ld.field_f.a(true);
                            if (var5_int * var5_int + var6 * var6 >= 3600) {
                              break L15;
                            } else {
                              var4_ref_nl.b(0, -1);
                              var4_ref_nl.field_G = 0;
                              break L15;
                            }
                          }
                        }
                      }
                      if (1 != et.field_d.field_V.field_m) {
                        break L15;
                      } else {
                        if (var4_ref_nl.field_u == 0) {
                          boolean discarded$21 = tc.a(12, (byte) 109, 11796480, var4_ref_nl, 36044800);
                          if (!sl.field_Eb) {
                            break L15;
                          } else {
                            if (ld.field_f.field_u != 0) {
                              break L15;
                            } else {
                              ld.field_f.field_G = 0;
                              ld.field_f.a(1, 26214);
                              break L15;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                    } else {
                      ig.a(true, (byte) 85, var4, 1);
                      var4++;
                      continue L16;
                    }
                  }
                }
              }
              L18: {
                if (ks.field_e != 8) {
                  break L18;
                } else {
                  if (!sl.field_Eb) {
                    et.field_d.field_R[1].field_g = 0;
                    var4 = et.field_d.field_V.a(true);
                    var5_int = et.field_d.field_V.c(879306160);
                    ik.a((byte) -109, var4, 400, var5_int, 100, 348, 0, 648);
                    ik.a((byte) -107, var4, 810, var5_int, 510, 258, 1, 558);
                    ik.a((byte) -118, var4, 1200, var5_int, 900, 298, 2, 748);
                    ik.a((byte) 45, var4, 1200, var5_int, 900, 298, 3, 748);
                    break L18;
                  } else {
                    ig.a(false, (byte) 109, 4, 1);
                    break L18;
                  }
                }
              }
              L19: {
                if (ks.field_e != 9) {
                  break L19;
                } else {
                  var4 = 1;
                  L20: while (true) {
                    if (var4 >= 3) {
                      var4 = 3;
                      L21: while (true) {
                        if (var4 >= 5) {
                          int discarded$22 = 1;
                          df.d();
                          break L19;
                        } else {
                          L22: {
                            if (sl.field_Eb) {
                              break L22;
                            } else {
                              if (et.field_d.field_P[1][var4].field_u == 0) {
                                et.field_d.field_P[1][var4].a(1, 26214);
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                          }
                          var4++;
                          continue L21;
                        }
                      }
                    } else {
                      ig.a(true, (byte) 83, var4, 1);
                      var4++;
                      continue L20;
                    }
                  }
                }
              }
              L23: {
                var4 = 16;
                if (ks.field_e == 10) {
                  ig.a(false, (byte) 124, 3, 1);
                  ig.a(false, (byte) 90, 4, 1);
                  ig.a(false, (byte) 52, 3, 0);
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                if (ks.field_e != 11) {
                  break L24;
                } else {
                  ig.a(false, (byte) 85, 1, 0);
                  break L24;
                }
              }
              L25: {
                if (ks.field_e != 12) {
                  break L25;
                } else {
                  if (et.field_d.field_X.field_m <= 25) {
                    break L25;
                  } else {
                    et.field_d.field_X.field_m = 0;
                    if (et.field_d.field_V.e(-1) == 0) {
                      jw.c(13, false);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              L26: {
                if (ks.field_e == 13) {
                  if (!sl.field_Eb) {
                    if (et.field_d.field_X.field_m > 25) {
                      et.field_d.field_X.field_m = 0;
                      if (et.field_d.field_V.e(44) == 0) {
                        jw.c(14, false);
                        break L26;
                      } else {
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  } else {
                    L27: {
                      et.field_d.field_X.field_m = 0;
                      if (et.field_d.field_P[1][0].field_w < 0) {
                        boolean discarded$23 = qg.a(2235, 2949120, 4, 29360128);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (et.field_d.field_V.field_m != 0) {
                        break L28;
                      } else {
                        et.field_d.field_V.field_m = -1;
                        break L28;
                      }
                    }
                    et.field_d.field_R[0].field_g = 0;
                    break L26;
                  }
                } else {
                  break L26;
                }
              }
              L29: {
                L30: {
                  if (ks.field_e != 14) {
                    break L30;
                  } else {
                    if (!ja.field_O) {
                      break L30;
                    } else {
                      if (et.field_d.field_u != 4) {
                        break L30;
                      } else {
                        ja.field_O = false;
                        var12 = tu.field_E.field_J;
                        var11 = var12;
                        var10 = var11;
                        var9 = var10;
                        var5 = var9;
                        if (var5[0]) {
                          break L30;
                        } else {
                          var5[0] = true;
                          if (!la.a(100)) {
                            var6 = 0;
                            var7 = 0;
                            L31: while (true) {
                              if (var7 >= var12.length) {
                                or.field_d.b(69, (byte) 78);
                                or.field_d.b(-78, var6);
                                break L30;
                              } else {
                                L32: {
                                  if (!var5[var7]) {
                                    break L32;
                                  } else {
                                    var6 = var6 | 1 << var7;
                                    break L32;
                                  }
                                }
                                var7++;
                                continue L31;
                              }
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                  }
                }
                break L29;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ie.C(" + -128 + ')');
        }
    }

    final void a(int param0, int param1) {
        super.a(97, param1);
        if (!(param1 != 0)) {
            rp.a(65536, ((ie) this).field_I);
        }
        if (param0 < 60) {
            field_G = 77;
        }
    }

    final static ld a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ld var7 = null;
        int var8 = 0;
        ld stackIn_3_0 = null;
        ld stackIn_7_0 = null;
        ld stackIn_10_0 = null;
        ld stackIn_15_0 = null;
        ld stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_6_0 = null;
        ld stackOut_17_0 = null;
        ld stackOut_14_0 = null;
        ld stackOut_9_0 = null;
        ld stackOut_2_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (var2_int > 255) {
                stackOut_6_0 = st.field_j;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3 = wr.a(param0, 2, '.');
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      stackOut_17_0 = mr.a(6, var3[var3.length - 1]);
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      int discarded$2 = 134217728;
                      var7 = no.a(var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackOut_14_0 = (ld) var7;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = ld.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_2_0 = ld.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("ie.A(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 0 + ')');
        }
        return stackIn_18_0;
    }

    public static void h(int param0) {
        if (param0 != 24342) {
            ie.h(-101);
        }
        field_H = null;
    }

    ie(int param0, up param1) {
        super(34, (lv) (Object) param1);
        String var6 = null;
        String var5 = null;
        try {
            ((ie) this).field_I = param0;
            var6 = param1.d(100);
            String var3 = var6;
            int discarded$0 = 1;
            String var4 = ad.a(dh.a(param1), 26300);
            var5 = vo.a((byte) -18, gd.field_e[34], new String[2]);
            ((ie) this).a(var5, ((ie) this).field_t, ((ie) this).field_D, -71, ((ie) this).field_u);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ie.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Chat is currently disabled.";
    }
}
