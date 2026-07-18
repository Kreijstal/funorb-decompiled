/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends d {
    private int field_P;
    private ia field_M;
    static String field_L;
    static int[] field_R;
    static boolean field_N;
    static String field_O;
    static mf field_K;
    static String field_Q;

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        qh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jp var12 = null;
        jp var13 = null;
        jp var14 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = param1 + (((wl) this).field_o - -(((wl) this).field_t >> 1));
              var6 = (((wl) this).field_s >> 1) + (((wl) this).field_w + param0);
              var8 = ((wl) this).field_M.b((byte) -31);
              if (var8 == m.field_c) {
                break L1;
              } else {
                if (hq.field_z != var8) {
                  if (lp.field_xb != var8) {
                    if (ae.field_c != var8) {
                      break L0;
                    } else {
                      var14 = df.field_a[1];
                      var14.f(var5 + -(var14.field_D >> 1), -(var14.field_C >> 1) + var6, 256);
                      break L0;
                    }
                  } else {
                    var13 = df.field_a[2];
                    var13.f(-(var13.field_D >> 1) + var5, -(var13.field_C >> 1) + var6, 256);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var12 = df.field_a[0];
                var9 = var12.field_x << 1;
                var10 = var12.field_z << 1;
                if (ik.field_c == null) {
                  break L3;
                } else {
                  if (ik.field_c.field_D < var9) {
                    break L3;
                  } else {
                    if (var10 > ik.field_c.field_C) {
                      break L3;
                    } else {
                      fc.a(-114, ik.field_c);
                      lb.d();
                      break L2;
                    }
                  }
                }
              }
              ik.field_c = new jp(var9, var10);
              fc.a(-87, ik.field_c);
              break L2;
            }
            var12.a(112, 144, var12.field_x << 4, var12.field_z << 4, -((wl) this).field_P << 10, 4096);
            sc.b(-104);
            ik.field_c.f(-var12.field_x + var5, -var12.field_z + var6, 256);
            break L0;
          }
          return;
        }
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
            ((wl) this).field_P = ((wl) this).field_P + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wl.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                int discarded$2 = 0;
                wl.c();
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wl.CA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        cq var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pi var15 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var15 = jl.field_e;
            var2 = var15.l(255);
            var3 = (cq) (Object) fk.field_f.d(-7);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_m != var2) {
                    var3 = (cq) (Object) fk.field_f.a((byte) 116);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var15.l(255);
                  if (var4 != 0) {
                    vq.field_B[0] = tb.field_cb;
                    var5 = var3.field_s;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        tk.a((byte) 75, var4, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            gr.a(12429, var5);
                            String[][] dupTemp$2 = new String[2][var5];
                            var3.field_r = dupTemp$2;
                            var6 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][4 * var5];
                            var3.field_u = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = wi.field_m;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var8 <= var13) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = fj.field_Pb[var13 + var5];
                                      var6[1][var14] = vq.field_B[var11];
                                      var7[1][var14 * 4] = ec.field_N[var11];
                                      var7[1][1 + var14 * 4] = lf.field_r[var11];
                                      var7[1][2 + 4 * var14] = ao.field_p[var11];
                                      var7[1][var14 * 4 - -3] = ib.field_D[var11];
                                      if (!ci.a(vq.field_B[var11], -31)) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var13++;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = fj.field_Pb[var9];
                                  var6[0][var10] = vq.field_B[var11];
                                  var7[0][4 * var10] = ec.field_N[var11];
                                  var7[0][var10 * 4 + 1] = lf.field_r[var11];
                                  var7[0][2 + var10 * 4] = ao.field_p[var11];
                                  var7[0][4 * var10 - -3] = ib.field_D[var11];
                                  if (ci.a(vq.field_B[var11], -40)) {
                                    if (0 == ao.field_p[var11] + lf.field_r[var11] + ib.field_D[var11]) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              un.a((byte) -122, (wq) (Object) var15);
                              if (var6_int == 0) {
                                var3.field_k = fh.field_c;
                                var3.field_n = vj.field_c;
                                var3.field_j = sf.field_Z;
                                var3.field_l = vh.field_U;
                                uk.a(vj.field_c, fh.field_c, var6_int, -19824, sf.field_Z, vh.field_U);
                                break L10;
                              } else {
                                uk.a(vj.field_c, fh.field_c, var6_int, -19824, sf.field_Z, vh.field_U);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        vq.field_B[var6_int] = var15.d(-1);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var3.field_v = true;
                var3.b((byte) 111);
                break L0;
              } else {
                hn.a((byte) 64);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "wl.C(" + false + ')');
        }
    }

    final static int a(String param0, boolean param1, int param2, m param3, int param4, m param5) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_6_0 = 0;
        wq stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wq stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wq stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        wq stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        wq stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        wq stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        wq stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        wq stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        wq stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        wq stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        wq stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        wq stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        int stackOut_32_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param3.b(2);
              var8 = param5.b(2);
              if (eq.field_g == null) {
                if (!ad.a(false, 10000)) {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (rf.field_b != pi.field_u) {
                break L2;
              } else {
                L3: {
                  k.field_h.field_l = 0;
                  af.field_r = null;
                  if (param0 != null) {
                    L4: {
                      var9 = 0;
                      if (!param1) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      tq.field_f.field_l = 0;
                      tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                      tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                      tq.field_f.a(0, var14);
                      tq.field_f.a(0, var8);
                      var15 = (CharSequence) (Object) param0;
                      int discarded$4 = -58;
                      tq.field_f.a(0, he.a(var15));
                      tq.field_f.b((byte) 113, param4);
                      tq.field_f.a(89, param2);
                      tq.field_f.a(127, var9);
                      k.field_h.a(53, 18);
                      k.field_h.field_l = k.field_h.field_l + 2;
                      var10 = k.field_h.field_l;
                      var11_ref_String = dj.a(true, uc.e((byte) -75));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    k.field_h.a(var11_ref_String, -1);
                    dq.a((wq) (Object) k.field_h, tq.field_f, vn.field_F, (byte) -72, to.field_g);
                    k.field_h.c(-var10 + k.field_h.field_l, 255);
                    break L3;
                  } else {
                    L6: {
                      tq.field_f.field_l = 0;
                      tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                      tq.field_f.a(ji.field_e.nextInt(), (byte) -79);
                      stackOut_9_0 = tq.field_f;
                      stackOut_9_1 = 0;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (!param3.a((byte) 116)) {
                        stackOut_11_0 = (wq) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = "";
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L6;
                      } else {
                        stackOut_10_0 = (wq) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = (String) var14;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        break L6;
                      }
                    }
                    L7: {
                      ((wq) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2);
                      stackOut_12_0 = tq.field_f;
                      stackOut_12_1 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (!param5.a((byte) 120)) {
                        stackOut_14_0 = (wq) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = "";
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        break L7;
                      } else {
                        stackOut_13_0 = (wq) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (String) var8;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        break L7;
                      }
                    }
                    ((wq) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                    k.field_h.a(-10, 16);
                    k.field_h.field_l = k.field_h.field_l + 1;
                    var9 = k.field_h.field_l;
                    dq.a((wq) (Object) k.field_h, tq.field_f, vn.field_F, (byte) -72, to.field_g);
                    k.field_h.d((byte) 119, k.field_h.field_l - var9);
                    break L3;
                  }
                }
                cr.a(-1, 10000);
                rf.field_b = ck.field_k;
                break L2;
              }
            }
            L8: {
              if (ck.field_k != rf.field_b) {
                break L8;
              } else {
                if (!vd.a(20, 1)) {
                  break L8;
                } else {
                  L9: {
                    var9 = jl.field_e.l(255);
                    jl.field_e.field_l = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        rf.field_b = o.field_g;
                        co.field_f = new String[-100 + var9];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    int discarded$5 = 9;
                    cb.a(uc.e((byte) -108));
                    eo.field_e = m.field_d;
                    hn.a((byte) 96);
                    pf.field_d = false;
                    stackOut_32_0 = var9;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  } else {
                    if (var9 == 99) {
                      boolean discarded$6 = vd.a(20, oc.d((byte) -59));
                      af.field_r = new Boolean(kd.a(-2, (wq) (Object) jl.field_e));
                      jl.field_e.field_l = 0;
                      break L8;
                    } else {
                      si.field_a = var9;
                      rf.field_b = vj.field_e;
                      ga.field_j = -1;
                      break L8;
                    }
                  }
                }
              }
            }
            L10: {
              if (rf.field_b != o.field_g) {
                break L10;
              } else {
                var9 = 2;
                if (vd.a(20, var9)) {
                  var10 = jl.field_e.i(65280);
                  jl.field_e.field_l = 0;
                  if (!vd.a(20, var10)) {
                    break L10;
                  } else {
                    var11 = co.field_f.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var11 <= var12) {
                        hn.a((byte) 79);
                        pf.field_d = false;
                        stackOut_42_0 = 100 + var11;
                        stackIn_43_0 = stackOut_42_0;
                        return stackIn_43_0;
                      } else {
                        co.field_f[var12] = jl.field_e.f(pn.a(4, 251));
                        var12++;
                        continue L11;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (vj.field_e != rf.field_b) {
                break L12;
              } else {
                if (!um.b((byte) -92)) {
                  break L12;
                } else {
                  L13: {
                    if (si.field_a == 255) {
                      var9_ref_String = jl.field_e.m(0);
                      if (var9_ref_String == null) {
                        break L13;
                      } else {
                        ui.a(-51, uc.e((byte) -120), var9_ref_String);
                        break L13;
                      }
                    } else {
                      eo.field_e = jl.field_e.d(-1);
                      break L13;
                    }
                  }
                  hn.a((byte) 106);
                  pf.field_d = false;
                  stackOut_50_0 = si.field_a;
                  stackIn_51_0 = stackOut_50_0;
                  return stackIn_51_0;
                }
              }
            }
            L14: {
              if (null == eq.field_g) {
                if (pf.field_d) {
                  L15: {
                    int discarded$7 = -6792;
                    if (de.f() > 30000L) {
                      eo.field_e = hg.field_b;
                      break L15;
                    } else {
                      eo.field_e = gd.field_e;
                      break L15;
                    }
                  }
                  pf.field_d = false;
                  stackOut_59_0 = 249;
                  stackIn_60_0 = stackOut_59_0;
                  return stackIn_60_0;
                } else {
                  var9 = dl.field_b;
                  dl.field_b = pj.field_a;
                  pj.field_a = var9;
                  pf.field_d = true;
                  break L14;
                }
              } else {
                break L14;
              }
            }
            stackOut_61_0 = -1;
            stackIn_62_0 = stackOut_61_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var7;
            stackOut_63_1 = new StringBuilder().append("wl.E(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L16;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L16;
            }
          }
          L17: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param3 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L17;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L17;
            }
          }
          L18: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',').append(param4).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param5 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L18;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L18;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + ',' + 4 + ')');
        }
        return stackIn_62_0;
    }

    public static void a() {
        field_K = null;
        field_L = null;
        field_R = null;
        field_Q = null;
        field_O = null;
    }

    final static void a(id param0, int param1) {
        id var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.b((byte) 111);
              if (param1 == 17574) {
                break L1;
              } else {
                var4 = null;
                wl.a((id) null, 48);
                break L1;
              }
            }
            var2 = (id) (Object) ua.field_c.d(-69);
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  if (!var2.a(param0, param1 ^ -18005)) {
                    break L3;
                  } else {
                    var2 = (id) (Object) ua.field_c.a((byte) 116);
                    continue L2;
                  }
                }
              }
              L4: {
                if (var2 == null) {
                  ua.field_c.a((nm) (Object) param0, (byte) 3);
                  break L4;
                } else {
                  il.a((nm) (Object) param0, 56, (nm) (Object) var2);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("wl.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    wl(ia param0) {
        try {
            ((wl) this).field_M = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (param0 <= 6) {
            field_K = null;
        }
        if (!(!((wl) this).field_q)) {
            return ((wl) this).field_M.a(-87);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[8192];
        field_L = "Cancel";
        field_O = "Please check if address is correct";
        field_Q = "Loading sound effects";
    }
}
