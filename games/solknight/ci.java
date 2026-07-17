/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ci extends gf implements ka {
    static String[] field_mb;
    static int field_jb;
    static int field_sb;
    static String[] field_gb;
    private boolean field_lb;
    static int field_ib;
    private mg field_nb;
    private boolean field_rb;
    static int[] field_pb;
    private c field_kb;
    private boolean field_ob;
    static int[] field_qb;
    private boolean field_hb;

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param4 > 121) {
              L1: {
                var5_int = param3 + param0;
                var6 = param1 + param2;
                if (mi.field_b < param3) {
                  stackOut_5_0 = param3;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = mi.field_b;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (param1 <= mi.field_l) {
                  stackOut_8_0 = mi.field_l;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = param1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (var5_int >= mi.field_k) {
                  stackOut_11_0 = mi.field_k;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = var5_int;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (var6 < mi.field_e) {
                  stackOut_14_0 = var6;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = mi.field_e;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_15_0;
                if (param3 < mi.field_b) {
                  break L5;
                } else {
                  if (mi.field_k > param3) {
                    var11 = param3 + mi.field_a * var8;
                    var12 = -var8 + var10 + 1 >> 1;
                    L6: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L5;
                      } else {
                        mi.field_f[var11] = 16777215;
                        var11 = var11 + mi.field_a * 2;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (mi.field_l > param1) {
                  break L7;
                } else {
                  if (var6 < mi.field_e) {
                    var11 = var7 + mi.field_a * param1;
                    var12 = 1 - -var9 - var7 >> 1;
                    L8: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L7;
                      } else {
                        mi.field_f[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (var5_int < mi.field_b) {
                  break L9;
                } else {
                  if (var5_int < mi.field_k) {
                    var11 = var5_int + mi.field_a * (var8 - -(1 & -param3 + var5_int));
                    var12 = 1 - (-var10 - -var8) >> 1;
                    L10: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L9;
                      } else {
                        mi.field_f[var11] = 16777215;
                        var11 = var11 + 2 * mi.field_a;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                if (mi.field_l > param1) {
                  break L11;
                } else {
                  if (mi.field_e > var6) {
                    var11 = (1 & var6 + -param1) + (var7 + var6 * mi.field_a);
                    var12 = var9 + (1 - var7) >> 1;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        mi.field_f[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var5, "ci.MB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void m(int param0) {
        ((ci) this).field_kb.a((byte) -128, 4210752, 2121792);
        lj var2 = new lj((ci) this, ((ci) this).field_nb, pc.field_a);
        if (param0 <= 118) {
            ((ci) this).field_nb = null;
        }
        var2.a(15, kf.field_F, 1);
        ((ci) this).c(-3399, (rc) (Object) var2);
    }

    public static void g() {
        field_qb = null;
        field_pb = null;
        field_gb = null;
        int var1 = -19;
        field_mb = null;
    }

    final void f(boolean param0) {
        Object var3 = null;
        if (((ci) this).field_J) {
          L0: {
            ((ci) this).field_J = false;
            if (((ci) this).field_ob) {
              int discarded$2 = 85;
              fj.a();
              break L0;
            } else {
              if (!((ci) this).field_rb) {
                break L0;
              } else {
                ie.b(-102);
                break L0;
              }
            }
          }
          L1: {
            if (param0) {
              break L1;
            } else {
              var3 = null;
              ci.a(47, true, 62, (aa) null, true);
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    ci(i param0, mg param1, String param2, boolean param3, boolean param4) {
        super(param0, (rc) (Object) new lj((ci) null, param1, param2), 77, 10, 10);
        try {
            ((ci) this).field_lb = false;
            ((ci) this).field_ob = param3 ? true : false;
            ((ci) this).field_hb = false;
            ((ci) this).field_nb = param1;
            ((ci) this).field_rb = param4 ? true : false;
            ((ci) this).field_kb = new c(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ci) this).field_kb.field_B = true;
            ((ci) this).a((rc) (Object) ((ci) this).field_kb, 5411);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ci.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public void a(int param0, int param1, int param2, pj param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((ci) this).field_lb) {
                kj.a(ia.g(97), 108, "tochangedisplayname.ws");
                break L1;
              } else {
                h.a(3, true);
                ((ci) this).f(true);
                break L1;
              }
            }
            L2: {
              if (param4) {
                break L2;
              } else {
                field_gb = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ci.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 41);
        }
    }

    final static void a(byte[] param0, int param1, int param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, gb param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = ah.a(param1, (byte) -122);
              if (null != f.field_e) {
                break L1;
              } else {
                f.field_e = new java.security.SecureRandom();
                break L1;
              }
            }
            var15 = new int[4];
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (lc.field_k == null) {
                      break L4;
                    } else {
                      if (var7_int <= lc.field_k.field_l.length) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  lc.field_k = new gb(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    lc.field_k.field_m = 0;
                    lc.field_k.a(8, param1, param0, 0);
                    lc.field_k.b((byte) -65, var7_int);
                    lc.field_k.a((byte) 97, var15);
                    if (null == ee.field_h) {
                      break L6;
                    } else {
                      if (ee.field_h.field_l.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ee.field_h = new gb(100);
                  break L5;
                }
                ee.field_h.field_m = 0;
                ee.field_h.c(19, 10);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (var11 >= 4) {
                    ee.field_h.a(true, param1);
                    ee.field_h.a(param5, 59769888, param3);
                    param6.a(8, ee.field_h.field_m, ee.field_h.field_l, 0);
                    param6.a(8, lc.field_k.field_m, lc.field_k.field_l, 0);
                    break L0;
                  } else {
                    ee.field_h.b(var15[var11], false);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = f.field_e.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var7;
            stackOut_19_1 = new StringBuilder().append("ci.KB(");
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
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44).append(8).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    final static void a(da param0, boolean param1, da param2, da param3) {
        RuntimeException var4 = null;
        od[] var5 = null;
        od[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        od[] var10 = null;
        int var11_int = 0;
        o var11 = null;
        o var12 = null;
        int var13 = 0;
        od[] var15 = null;
        o var16 = null;
        int[][] var17 = null;
        o var18 = null;
        o var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            fi.field_a = ik.a(param3, -18362, "frame_top", "commonui");
            qk.field_l = ik.a(param3, -18362, "frame_bottom", "commonui");
            fa.field_b = rb.a("jagex_logo_grey", "commonui", param3, (byte) -125);
            vk.field_i = ik.a(param3, -18362, "button", "commonui");
            gb.field_k = nh.a(param3, "validation", 0, "commonui");
            jh.field_g = (mg) (Object) si.a(param0, "commonui", true, "arezzo12", param3);
            ua.field_G = (mg) (Object) si.a(param0, "commonui", true, "arezzo14", param3);
            uc.field_g = (mg) (Object) si.a(param0, "commonui", true, "arezzo14bold", param3);
            var18 = new o(param2.a(4, "button.gif", ""), (java.awt.Component) (Object) dc.field_q);
            od discarded$2 = ve.a(param3, -97, "dropdown", "commonui");
            var5 = dj.a(8108, "screen_options", param3, "commonui");
            md.field_s = new od[4];
            r.field_i = new od[4];
            jl.field_g = new od[4];
            var6 = new od[][]{md.field_s, r.field_i, jl.field_g};
            var22 = new int[4][];
            var21 = var22;
            var20 = var21;
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_m;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var22.length) {
                var8 = var5[0].field_n[0];
                var22[2][var8] = 16777215;
                var22[1][var8] = 2394342;
                var22[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (3 <= var9) {
                    var9 = var18.field_t;
                    int discarded$3 = 91;
                    fl.b();
                    var18.a();
                    mi.c(0, 0, mi.field_a, mi.field_d);
                    var16 = new o(var9, var9);
                    var19 = var16;
                    var19.a();
                    var18.c(0, 0);
                    var11 = new o(var9, var9);
                    var11.a();
                    var18.c(var9 + -var18.field_p, 0);
                    var12 = new o(-(var9 * 2) + var18.field_p, var9);
                    var12.a();
                    var18.c(-var9, 0);
                    mf.e(4096);
                    vk.field_i = new o[]{var16, var12, var11};
                    break L0;
                  } else {
                    var15 = var6[var9];
                    var10 = var15;
                    var11_int = 0;
                    L3: while (true) {
                      if (var15.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var15[var11_int] = bl.a(var5[var9], var22[var11_int], (byte) 100);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var22[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ci.TB(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5_int = 60 % ((31 - param1) / 56);
            if (param2 != 13) {
              stackOut_3_0 = super.a(param0, (byte) 90, param2, param3);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              ((ci) this).f(true);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ci.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a() {
        gg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ob var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (ob) (Object) he.field_d.a((byte) 51);
            L1: while (true) {
              if (var4 == null) {
                var2 = bc.field_J.a((byte) 51);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$10 = 6;
                    int discarded$11 = 1;
                    wi.c();
                    var2 = bc.field_J.b(-104);
                    continue L2;
                  }
                }
              } else {
                int discarded$12 = 118;
                vg.a(6, var4);
                var4 = (ob) (Object) he.field_d.b(-84);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var2_ref, "ci.GB(" + -77 + 44 + 6 + 41);
        }
    }

    final static String a(CharSequence[] param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            stackOut_2_0 = la.a(125, 0, param0.length, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ci.JB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -93 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1, int param2, aa param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              ed.field_a[0] = ib.field_i.nextInt();
              ed.field_a[1] = ib.field_i.nextInt();
              ed.field_a[2] = (int)(i.field_H >> 32);
              ic.field_z.field_m = 0;
              ed.field_a[3] = (int)i.field_H;
              ic.field_z.b(ed.field_a[0], false);
              ic.field_z.b(ed.field_a[1], false);
              ic.field_z.b(ed.field_a[2], false);
              ic.field_z.b(ed.field_a[3], false);
              int discarded$1 = 107;
              vh.a(ic.field_z);
              ic.field_z.a(true, param2);
              param3.a(-12518, ic.field_z);
              id.field_c.field_m = 0;
              if (param1) {
                id.field_c.c(param0 ^ -25840, 18);
                break L1;
              } else {
                id.field_c.c(param0 ^ 25812, 16);
                break L1;
              }
            }
            L2: {
              id.field_c.field_m = id.field_c.field_m + 2;
              var5_int = id.field_c.field_m;
              id.field_c.b(al.field_n, false);
              id.field_c.a(wk.field_b, (byte) 63);
              var6 = 0;
              if (!cl.field_m) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (!b.field_b) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (!param4) {
                break L4;
              } else {
                var6 = var6 | 8;
                break L4;
              }
            }
            L5: {
              if (null == ri.field_a) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              if (param0 == -25776) {
                break L6;
              } else {
                field_sb = 30;
                break L6;
              }
            }
            L7: {
              id.field_c.c(-110, var6);
              var7 = hh.a(false, ia.g(param0 ^ 25799));
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              id.field_c.a(var7, 0);
              if (null == ri.field_a) {
                break L8;
              } else {
                id.field_c.b(param0 ^ 1955918408, ri.field_a);
                break L8;
              }
            }
            al.a(ic.field_z, (gb) (Object) id.field_c, (byte) 110, nc.field_d, qa.field_p);
            id.field_c.a(id.field_c.field_m + -var5_int, true);
            qf.a(0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("ci.NB(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
    }

    final void a(String param0, int param1, byte param2) {
        RuntimeException var4 = null;
        lj var4_ref = null;
        int var5 = 0;
        lj var6 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        lj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        lj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        lj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_14_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        lj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        lj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        lj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (((ci) this).field_hb) {
              return;
            } else {
              L1: {
                if (param2 <= -40) {
                  break L1;
                } else {
                  ((ci) this).m(13);
                  break L1;
                }
              }
              L2: {
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (param1 != 256) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                ((ci) this).field_lb = stackIn_9_1 != 0;
                ((ci) this).field_hb = true;
                ((ci) this).field_kb.a((byte) -118, 4210752, 8405024);
                var6 = new lj((ci) this, ((ci) this).field_nb, param0);
                var4_ref = var6;
                if (param1 == 5) {
                  var6.a(11, cl.field_k, 1);
                  var6.a(17, ph.field_e, 1);
                  break L3;
                } else {
                  if (param1 == 256) {
                    pj discarded$2 = var6.a(0, gg.field_c, (dg) this);
                    break L3;
                  } else {
                    L4: {
                      stackOut_11_0 = (lj) var6;
                      stackOut_11_1 = -1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (!((ci) this).field_ob) {
                        stackOut_13_0 = (lj) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = u.field_e;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        break L4;
                      } else {
                        stackOut_12_0 = (lj) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = gg.field_c;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        break L4;
                      }
                    }
                    ((lj) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, 1);
                    break L3;
                  }
                }
              }
              L5: {
                if (param1 != 3) {
                  if (param1 == 4) {
                    var6.a(8, mf.field_l, 1);
                    break L5;
                  } else {
                    if (param1 != 6) {
                      if (param1 != 9) {
                        break L5;
                      } else {
                        pj discarded$3 = var6.a(0, gh.field_r, (dg) this);
                        break L5;
                      }
                    } else {
                      var6.a(9, ik.field_d, 1);
                      break L5;
                    }
                  }
                } else {
                  var6.a(7, qd.field_a, 1);
                  break L5;
                }
              }
              ((ci) this).c(-3399, (rc) (Object) var6);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("ci.HB(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_gb = new String[]{"Pluto", "Neptune", "Uranus", "Saturn", "Jupiter", "Asteroid Defence Grid", "Mars", "Earth"};
        field_pb = new int[8192];
        field_qb = new int[128];
    }
}
