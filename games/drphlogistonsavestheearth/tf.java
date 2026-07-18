/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends ca {
    private boolean field_hb;
    private String field_lb;
    static bb field_qb;
    static String[] field_nb;
    private hd field_fb;
    static String field_kb;
    private String field_ob;
    private boolean field_gb;
    static volatile int field_mb;
    static String field_pb;
    static int field_jb;
    static String field_ib;

    final static int a(CharSequence param0, char param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                stackOut_10_0 = var3_int;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  if (param1 != param0.charAt(var5)) {
                    var5++;
                    var5++;
                    break L2;
                  } else {
                    var3_int++;
                    var5++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("tf.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + 16752 + ')');
        }
        return stackIn_11_0;
    }

    final static void n() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gk var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        gk stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        String stackOut_37_0 = null;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        gk stackOut_44_0 = null;
        gk stackOut_43_0 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = jd.field_N;
              var2 = 0;
              if (re.field_g == 2) {
                var3_long = -aa.field_d + la.a(false);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~sg.field_f.length >= ~var3) {
                break L0;
              } else {
                L3: {
                  var4 = lg.field_a[var3];
                  if (0 > var4) {
                    var5 = b.field_h;
                    break L3;
                  } else {
                    if (wg.field_k.field_f == var4) {
                      var5 = a.field_i;
                      break L3;
                    } else {
                      var5 = pj.field_E;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = sg.field_f[var3];
                  if (re.field_g != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (~lk.field_i.length > ~ng.field_d.length) {
                          stackOut_17_0 = ng.field_d.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = lk.field_i.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_18_0;
                        if (var3 < 6) {
                          break L6;
                        } else {
                          if (~(6 - -var7) < ~var3) {
                            L7: {
                              if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                stackOut_23_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                stackIn_24_0 = stackOut_23_0;
                                break L7;
                              } else {
                                stackOut_22_0 = "";
                                stackIn_24_0 = stackOut_22_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (~ga.field_i.length >= ~wg.field_h.length) {
                          stackOut_27_0 = wg.field_h.length;
                          stackIn_28_0 = stackOut_27_0;
                          break L8;
                        } else {
                          stackOut_26_0 = ga.field_i.length;
                          stackIn_28_0 = stackOut_26_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (~(7 + var7) < ~var3) {
                        break L4;
                      } else {
                        if (~(var8 + 7 - -var7) >= ~var3) {
                          break L4;
                        } else {
                          L9: {
                            if (wg.field_h.length <= -7 + (var3 - var7)) {
                              stackOut_32_0 = "";
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = wg.field_h[-7 + var3 - var7];
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (-2 == var4) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  stackOut_37_0 = (String) var6;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_38_0 = stackOut_37_0;
                  if (var4 < 0) {
                    stackOut_39_0 = (String) (Object) stackIn_39_0;
                    stackOut_39_1 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    break L11;
                  } else {
                    stackOut_38_0 = (String) (Object) stackIn_38_0;
                    stackOut_38_1 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    break L11;
                  }
                }
                L12: {
                  int discarded$1 = 1;
                  var7 = u.a(stackIn_40_0, stackIn_40_1 != 0);
                  var8 = -(var7 >> 1) + ji.field_f;
                  if (var4 >= 0) {
                    L13: {
                      if (wg.field_k.field_f != var4) {
                        stackOut_44_0 = wd.field_c;
                        stackIn_45_0 = stackOut_44_0;
                        break L13;
                      } else {
                        stackOut_43_0 = ue.field_a;
                        stackIn_45_0 = stackOut_43_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + ig.field_h;
                      if (var9 == null) {
                        break L14;
                      } else {
                        var9.a(ni.field_p + (wa.field_N << 1), var8 - dg.field_d, var7 + (dg.field_d << 1), var1_int, 7453);
                        break L14;
                      }
                    }
                    var1_int = var1_int + wa.field_N;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (var4 >= 0) {
                  cj.field_a.c(var6, var8, var1_int + hi.field_g, var5, -1);
                  var1_int = var1_int + (wa.field_N + ig.field_h + ni.field_p);
                  var3++;
                  var3++;
                  continue L2;
                } else {
                  uj.field_i.c(var6, var8, ha.field_a + var1_int, var5, -1);
                  var1_int = var1_int + s.field_g;
                  var3++;
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "tf.C(" + 17077 + ')');
        }
    }

    tf(k param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((tf) this).field_ob = param1;
            if (null != ((tf) this).field_ob) {
                var3_int = wi.field_e.a(((tf) this).field_ob, 260, wi.field_e.field_x);
                ((tf) this).b(300, 1688990433, var3_int + 150);
            }
            ((tf) this).field_fb = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
            ((tf) this).field_gb = false;
            ((tf) this).field_hb = false;
            ((tf) this).field_fb.field_E = true;
            ((tf) this).b((vg) (Object) ((tf) this).field_fb, (byte) 61);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void h(byte param0) {
        ((tf) this).field_hb = true;
        if (param0 != 23) {
          field_nb = null;
          ((tf) this).field_fb.field_E = false;
          return;
        } else {
          ((tf) this).field_fb.field_E = false;
          return;
        }
    }

    final static void a(gi param0, int param1, gi param2) {
        try {
            if (null != param0.field_b) {
                param0.a(param1 ^ -32364);
            }
            if (param1 != 16709) {
                Object var4 = null;
                tf.a((gi) null, 103, (gi) null);
            }
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "tf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        L0: {
          super.c(param0, 59, param2);
          wi.field_e.b(((tf) this).field_lb, param2 - -(((tf) this).field_w >> 1), 103 + param0, 16777215, -1);
          if (((tf) this).field_ob != null) {
            wj.g(20 + param2, 120 + (param0 + -7), 260, 8421504);
            int discarded$2 = wi.field_e.a(((tf) this).field_ob, param2 + 20, 8 + (param0 - -120), 260, 100, 16777215, -1, 1, 0, wi.field_e.field_x);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 < 26) {
          field_nb = null;
          return;
        } else {
          return;
        }
    }

    final void a(String param0, boolean param1, int param2, float param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
              if (((tf) this).field_gb) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (param1 ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param1) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                ((tf) this).field_gb = stackIn_7_1 != 0;
                if (((tf) this).field_gb) {
                  ((tf) this).field_fb.a(false, 8405024, 4210752);
                  ((tf) this).field_fb.field_E = true;
                  break L2;
                } else {
                  ((tf) this).field_fb.a(false, 2113632, 4210752);
                  if (((tf) this).field_hb) {
                    ((tf) this).field_fb.field_E = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              if (param2 == 6) {
                break L4;
              } else {
                ((tf) this).a((String) null, false, 76, -0.6110716462135315f);
                break L4;
              }
            }
            ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
            ((tf) this).field_lb = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("tf.H(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c() {
        field_ib = null;
        field_pb = null;
        field_kb = null;
        field_nb = null;
        field_qb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_qb = new bb();
        field_mb = 0;
        field_ib = "Invalid password.";
    }
}
