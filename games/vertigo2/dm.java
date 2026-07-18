/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends cr {
    cr field_Hb;
    static String field_Jb;
    static String field_Ib;
    cr field_Kb;
    cr field_Mb;
    od field_Lb;

    public static void l(int param0) {
        if (param0 != -1) {
            dm.a(-82, 7, -96, 101, -2, -78);
        }
        field_Jb = null;
        field_Ib = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((dm) this).field_wb = param5;
        ((dm) this).field_db = param0;
        ((dm) this).field_N = param7;
        if (param4 != 1) {
            field_Jb = null;
        }
        ((dm) this).field_Fb = param2;
        ((dm) this).a(param6, true, param3, param1);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = (param2 + ((dm) this).field_Fb) / 2;
        int var6 = ((dm) this).field_db + -param3;
        ((dm) this).field_Lb.a(0, param2, param0, var6 - param2, 0, ((dm) this).field_Fb, 3124);
        ((dm) this).field_Hb.field_wb = 0;
        ((dm) this).field_Hb.field_N = var6;
        ((dm) this).field_Hb.field_Fb = var5 - param2;
        if (!param1) {
            dm.l(-112);
        }
        ((dm) this).field_Hb.field_db = param3;
        ((dm) this).field_Kb.field_Fb = -var5 + ((dm) this).field_Fb;
        ((dm) this).field_Kb.field_N = var6;
        ((dm) this).field_Kb.field_db = param3;
        ((dm) this).field_Kb.field_wb = var5;
    }

    dm(long param0, dm param1, String param2, String param3) {
        this(param0, (cr) (Object) param1, param1.field_Lb.field_Lb, param1.field_Lb.field_Hb, param1.field_Hb, param2, param3);
    }

    final static void k(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        s var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        vi var6_ref_vi = null;
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
        mi var27 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = id.field_f;
              var2 = var27.h(-11);
              if (var2 == 0) {
                var3 = var27.a((byte) -11);
                var4 = (s) (Object) wg.field_i.a((byte) 100);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_p != var3) {
                        var4 = (s) (Object) wg.field_i.b(110);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 != null) {
                    L4: {
                      var5 = var27.h(-11);
                      if (var5 != 0) {
                        var6 = var4.field_q;
                        rk.field_w[0].field_m = false;
                        var7 = var4.field_o;
                        rk.field_w[0].field_i = null;
                        rk.field_w[0].field_l = qe.field_V;
                        var8_int = 1;
                        L5: while (true) {
                          if (var8_int >= var5) {
                            String[][] dupTemp$6 = new String[3][var6];
                            var4.field_x = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            long[][] dupTemp$7 = new long[3][var6];
                            var4.field_w = dupTemp$7;
                            var10 = dupTemp$7;
                            int[][] dupTemp$8 = new int[3][var6 * var7];
                            var4.field_n = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.h(-11);
                            if (var18 > 0) {
                              var19 = 0;
                              L6: while (true) {
                                if (var19 >= var18) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var27.h(-11);
                                    var21 = rk.field_w[var20].field_l;
                                    var22 = var27.i(-31016);
                                    var24 = var27.field_u;
                                    if (var6 <= var19) {
                                      break L7;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = rk.field_w[var20].field_i;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L7;
                                        } else {
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var27.b(true);
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
                                      if (wc.a(var21, true)) {
                                        var8[1][var13] = qe.field_V;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var27.field_u = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var7 <= var25) {
                                            break L9;
                                          } else {
                                            int incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var27.b(true);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var6 <= var14) {
                                      break L11;
                                    } else {
                                      if (!rk.field_w[var20].field_m) {
                                        rk.field_w[var20].field_m = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = rk.field_w[var20].field_i;
                                        var10[2][var14] = var22;
                                        var27.field_u = var24;
                                        var14++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            int incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var27.b(true);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
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
                              rk.field_w[var8_int].field_l = var27.f(128);
                              rk.field_w[var8_int].field_m = false;
                              if (var27.h(-11) != 1) {
                                rk.field_w[var8_int].field_i = null;
                                break L13;
                              } else {
                                rk.field_w[var8_int].field_i = var27.f(128);
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
                    var4.field_s = true;
                    var4.c(2);
                    break L1;
                  } else {
                    rm.b((byte) 122);
                    return;
                  }
                }
              } else {
                if (var2 != 1) {
                  ke.a((Throwable) null, "HS1: " + or.a(121), 0);
                  rm.b((byte) 5);
                  break L1;
                } else {
                  var3 = var27.a((byte) -11);
                  var4_long = var27.i(-31016);
                  var6_ref_vi = (vi) (Object) mc.field_i.a((byte) 100);
                  L14: while (true) {
                    L15: {
                      if (var6_ref_vi == null) {
                        break L15;
                      } else {
                        if (var3 == var6_ref_vi.field_u) {
                          break L15;
                        } else {
                          var6_ref_vi = (vi) (Object) mc.field_i.b(62);
                          continue L14;
                        }
                      }
                    }
                    if (var6_ref_vi == null) {
                      rm.b((byte) 107);
                      return;
                    } else {
                      var6_ref_vi.field_r = var4_long;
                      var6_ref_vi.c(2);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "dm.G(" + 0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > cj.field_D) {
                break L1;
              } else {
                if (param5 >= ua.field_e) {
                  L2: {
                    if (param1 < ap.field_e) {
                      var6_int = 0;
                      param1 = ap.field_e;
                      break L2;
                    } else {
                      if (ib.field_a >= param1) {
                        var6_int = 1;
                        break L2;
                      } else {
                        param1 = ib.field_a;
                        var6_int = 0;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (ap.field_e <= param3) {
                      if (param3 > ib.field_a) {
                        param3 = ib.field_a;
                        var7 = 0;
                        break L3;
                      } else {
                        var7 = 1;
                        break L3;
                      }
                    } else {
                      var7 = 0;
                      param3 = ap.field_e;
                      break L3;
                    }
                  }
                  L4: {
                    if (ua.field_e <= param2) {
                      int incrementValue$2 = param2;
                      param2++;
                      ki.a(-93, param1, vl.field_e[incrementValue$2], param3, param4);
                      break L4;
                    } else {
                      param2 = ua.field_e;
                      break L4;
                    }
                  }
                  L5: {
                    if (param5 <= cj.field_D) {
                      int incrementValue$3 = param5;
                      param5--;
                      ki.a(-116, param1, vl.field_e[incrementValue$3], param3, param4);
                      break L5;
                    } else {
                      param5 = cj.field_D;
                      break L5;
                    }
                  }
                  L6: {
                    if (var6_int == 0) {
                      break L6;
                    } else {
                      if (var7 == 0) {
                        break L6;
                      } else {
                        var8 = param2;
                        L7: while (true) {
                          if (var8 > param5) {
                            break L1;
                          } else {
                            var14 = vl.field_e[var8];
                            var13 = var14;
                            var12 = var13;
                            var11 = var12;
                            var9 = var11;
                            var14[param3] = param4;
                            var9[param1] = param4;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  if (var6_int != 0) {
                    var8 = param2;
                    L8: while (true) {
                      if (var8 > param5) {
                        break L1;
                      } else {
                        vl.field_e[var8][param1] = param4;
                        var8++;
                        continue L8;
                      }
                    }
                  } else {
                    if (var7 != 0) {
                      var8 = param2;
                      L9: while (true) {
                        if (var8 > param5) {
                          break L1;
                        } else {
                          vl.field_e[var8][param3] = param4;
                          var8++;
                          continue L9;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L10: {
              if (param0 == 0) {
                break L10;
              } else {
                dm.l(-21);
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var6, "dm.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(param2 + (param3 - -param0) > bi.field_j)) {
            return param0 + param3;
        }
        if (-param2 + param3 >= param1) {
            return param3 - param2;
        }
        return bi.field_j + -param2;
    }

    dm(long param0, cr param1, cr param2, ie param3, cr param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((dm) this).field_Mb = new cr(0L, (cr) null);
            ((dm) this).field_Lb = new od(0L, ((dm) this).field_Mb, param2, param3);
            ((dm) this).field_Hb = new cr(0L, param4);
            ((dm) this).field_Kb = new cr(0L, param4);
            ((dm) this).field_Hb.field_S = param5;
            ((dm) this).field_Kb.field_S = param6;
            ((dm) this).b((cr) (Object) ((dm) this).field_Lb, 121);
            ((dm) this).b(((dm) this).field_Hb, 118);
            ((dm) this).b(((dm) this).field_Kb, 126);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "dm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = "Ignore";
        field_Jb = "Offer draw";
    }
}
