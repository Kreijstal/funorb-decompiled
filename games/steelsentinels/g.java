/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static cm field_i;
    private int field_f;
    private boolean field_e;
    private int[] field_k;
    static String field_a;
    static int field_h;
    static wk field_d;
    static em field_c;
    static String field_g;
    static String field_l;
    private int field_j;
    static String field_b;
    static String field_m;

    private final void a(int param0, boolean param1, int param2) {
        if (param2 > ((g) this).field_j) {
            ((g) this).field_j = param2;
        }
        if (((g) this).field_k.length <= param2) {
            this.a(2, param2);
        }
        ((g) this).field_k[param2] = param0;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var3 = ((g) this).field_k.length;
        var4 = -18;
        L0: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (((g) this).field_e) {
              if (0 == var3) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((g) this).field_f;
                continue L0;
              }
            } else {
              var3 = var3 + ((g) this).field_f;
              continue L0;
            }
          }
        }
    }

    final void d(int param0, int param1) {
        if (param0 < -97) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (((g) this).field_j >= param1) {
                L1: {
                  if (((g) this).field_j != param1) {
                    ii.a(((g) this).field_k, 1 + param1, ((g) this).field_k, param1, -param1 + ((g) this).field_j);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((g) this).field_j = ((g) this).field_j - 1;
                return;
              } else {
                break L0;
              }
            }
          }
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -128;
        }
        return ((g) this).field_j - -1;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        kf var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        tc var6_ref_tc = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        kj var28 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var28 = rf.field_d;
              var2 = var28.f((byte) -61);
              if (var2 == 0) {
                var3 = var28.c((byte) -60);
                var4 = (kf) (Object) je.field_w.e(13058);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var3 == var4.field_C) {
                        break L3;
                      } else {
                        var4 = (kf) (Object) je.field_w.a((byte) -88);
                        continue L2;
                      }
                    }
                  }
                  if (var4 != null) {
                    L4: {
                      var5 = var28.f((byte) -68);
                      if (var5 != 0) {
                        var6 = var4.field_u;
                        var7 = var4.field_w;
                        sa.field_f[0].field_d = false;
                        sa.field_f[0].field_b = null;
                        sa.field_f[0].field_g = field_l;
                        var8_int = 1;
                        L5: while (true) {
                          if (var8_int >= var5) {
                            String[][] dupTemp$6 = new String[3][var6];
                            var4.field_x = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            long[][] dupTemp$7 = new long[3][var6];
                            var4.field_D = dupTemp$7;
                            var10 = dupTemp$7;
                            int[][] dupTemp$8 = new int[3][var7 * var6];
                            var4.field_z = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.f((byte) -90);
                            if (var18 > 0) {
                              var19 = 0;
                              L6: while (true) {
                                if (var18 <= var19) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.f((byte) -58);
                                    var21 = sa.field_f[var20].field_g;
                                    var22 = var28.g((byte) -97);
                                    var24 = var28.field_p;
                                    if (var19 >= var6) {
                                      break L7;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = sa.field_f[var20].field_b;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L7;
                                        } else {
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.i(0);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (!wl.a(67, var21)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = field_l;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_p = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            int incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var28.i(0);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 >= var6) {
                                      break L11;
                                    } else {
                                      if (sa.field_f[var20].field_d) {
                                        break L11;
                                      } else {
                                        sa.field_f[var20].field_d = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = sa.field_f[var20].field_b;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_p = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            int incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var28.i(0);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            L13: {
                              sa.field_f[var8_int].field_g = var28.h(1);
                              sa.field_f[var8_int].field_d = false;
                              if (var28.f((byte) -99) != 1) {
                                sa.field_f[var8_int].field_b = null;
                                break L13;
                              } else {
                                sa.field_f[var8_int].field_b = var28.h(1);
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var4.field_q = true;
                    var4.b(4);
                    break L1;
                  } else {
                    pm.m(98);
                    return;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var28.c((byte) -60);
                  var4_long = var28.g((byte) -122);
                  var6_ref_tc = (tc) (Object) ic.field_B.e(13058);
                  L14: while (true) {
                    L15: {
                      if (var6_ref_tc == null) {
                        break L15;
                      } else {
                        if (var6_ref_tc.field_p == var3) {
                          break L15;
                        } else {
                          var6_ref_tc = (tc) (Object) ic.field_B.a((byte) -20);
                          continue L14;
                        }
                      }
                    }
                    if (var6_ref_tc != null) {
                      var6_ref_tc.field_D = var4_long;
                      var6_ref_tc.b(4);
                      break L1;
                    } else {
                      pm.m(122);
                      return;
                    }
                  }
                } else {
                  sj.a("HS1: " + ci.a((byte) 94), -37, (Throwable) null);
                  pm.m(86);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "g.A(" + -116 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_m = null;
        field_l = null;
        field_c = null;
        field_i = null;
        field_g = null;
    }

    final static void a(int param0, int param1, int param2, int param3, pn param4, byte param5, int param6, int param7, String param8) {
        try {
            rl.field_f = param8;
            rb.field_f = param2;
            lh.field_B = param3;
            wn.field_g = param0;
            km.field_k = param4;
            int var9_int = 48;
            ih.field_n = param1;
            sh.field_a = param6;
            jf.field_ib = param7;
            ne.field_N = (vk) (Object) new f();
            hk.field_oc = new cb(param4);
            gb.field_c = new ta(ne.field_N, hk.field_oc);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "g.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + -95 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0, int param1) {
        if (param0 < 7) {
            return 2;
        }
        if (param1 > ((g) this).field_j) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((g) this).field_k[param1];
    }

    private g() throws Throwable {
        throw new Error();
    }

    final void a(int param0, byte param1) {
        if (param1 != 22) {
            field_d = null;
        }
        this.a(param0, true, 1 + ((g) this).field_j);
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.b(param1, 73)];
        int[] var3 = var4;
        ii.a(((g) this).field_k, 0, var4, 0, ((g) this).field_k.length);
        ((g) this).field_k = var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
        field_a = "Similar rating";
        field_b = "Passwords must be between 5 and 20 letters and numbers";
        field_g = "Add <%0> to ignore list";
        field_m = "Confirm Email:";
    }
}
