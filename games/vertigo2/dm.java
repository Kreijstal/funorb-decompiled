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
        this.field_wb = param5;
        this.field_db = param0;
        this.field_N = param7;
        if (param4 != 1) {
            field_Jb = (String) null;
        }
        this.field_Fb = param2;
        this.a(param6, true, param3, param1);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = (param2 + this.field_Fb) / 2;
        int var6 = this.field_db + -param3;
        this.field_Lb.a(0, param2, param0, var6 - param2, 0, this.field_Fb, 3124);
        this.field_Hb.field_wb = 0;
        this.field_Hb.field_N = var6;
        this.field_Hb.field_Fb = var5 - param2;
        if (!param1) {
            dm.l(-112);
        }
        this.field_Hb.field_db = param3;
        this.field_Kb.field_Fb = -var5 + this.field_Fb;
        this.field_Kb.field_N = var6;
        this.field_Kb.field_db = param3;
        this.field_Kb.field_wb = var5;
    }

    dm(long param0, dm param1, String param2, String param3) {
        this(param0, param1, param1.field_Lb.field_Lb, param1.field_Lb.field_Hb, param1.field_Hb, param2, param3);
    }

    final static void k(int param0) {
        int discarded$7 = 0;
        String[][] dupTemp$8 = null;
        long[][] dupTemp$9 = null;
        int[][] dupTemp$10 = null;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                discarded$7 = dm.a(-79, 39, -11, -30);
                break L1;
              }
            }
            L2: {
              var27 = id.field_f;
              var2 = var27.h(-11);
              if (-1 == (var2 ^ -1)) {
                var3 = var27.a((byte) -11);
                var4 = (s) ((Object) wg.field_i.a((byte) 100));
                L3: while (true) {
                  L4: {
                    if (var4 == null) {
                      break L4;
                    } else {
                      if (var4.field_p != var3) {
                        var4 = (s) ((Object) wg.field_i.b(param0 + 110));
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var4 != null) {
                    L5: {
                      var5 = var27.h(-11);
                      if (var5 != 0) {
                        var6 = var4.field_q;
                        rk.field_w[0].field_m = false;
                        var7 = var4.field_o;
                        rk.field_w[0].field_i = null;
                        rk.field_w[0].field_l = qe.field_V;
                        var8_int = 1;
                        L6: while (true) {
                          if (var8_int >= var5) {
                            dupTemp$8 = new String[3][var6];
                            var4.field_x = dupTemp$8;
                            var8 = dupTemp$8;
                            var9 = new String[3][var6];
                            dupTemp$9 = new long[3][var6];
                            var4.field_w = dupTemp$9;
                            var10 = dupTemp$9;
                            dupTemp$10 = new int[3][var6 * var7];
                            var4.field_n = dupTemp$10;
                            var11 = dupTemp$10;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.h(-11);
                            if (-1 > (var18 ^ -1)) {
                              var19 = 0;
                              L7: while (true) {
                                if (var19 >= var18) {
                                  break L5;
                                } else {
                                  L8: {
                                    var20 = var27.h(-11);
                                    var21 = rk.field_w[var20].field_l;
                                    var22 = var27.i(param0 ^ -31016);
                                    var24 = var27.field_u;
                                    if (var6 <= var19) {
                                      break L8;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = rk.field_w[var20].field_i;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L9: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L8;
                                        } else {
                                          incrementValue$11 = var15;
                                          var15++;
                                          var11[0][incrementValue$11] = var27.b(true);
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                  L10: {
                                    if (var21 == null) {
                                      break L10;
                                    } else {
                                      if (wc.a(var21, true)) {
                                        var8[1][var13] = qe.field_V;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var27.field_u = var24;
                                        var25 = 0;
                                        L11: while (true) {
                                          if (var7 <= var25) {
                                            break L10;
                                          } else {
                                            incrementValue$12 = var16;
                                            var16++;
                                            var11[1][incrementValue$12] = var27.b(true);
                                            var25++;
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var6 <= var14) {
                                      break L12;
                                    } else {
                                      if (!rk.field_w[var20].field_m) {
                                        rk.field_w[var20].field_m = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = rk.field_w[var20].field_i;
                                        var10[2][var14] = var22;
                                        var27.field_u = var24;
                                        var14++;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var25 >= var7) {
                                            break L12;
                                          } else {
                                            incrementValue$13 = var17;
                                            var17++;
                                            var11[2][incrementValue$13] = var27.b(true);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L5;
                            }
                          } else {
                            L14: {
                              rk.field_w[var8_int].field_l = var27.f(param0 + 128);
                              rk.field_w[var8_int].field_m = false;
                              if (-2 != (var27.h(-11) ^ -1)) {
                                rk.field_w[var8_int].field_i = null;
                                break L14;
                              } else {
                                rk.field_w[var8_int].field_i = var27.f(128);
                                break L14;
                              }
                            }
                            var8_int++;
                            continue L6;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var4.field_s = true;
                    var4.c(param0 ^ 2);
                    break L2;
                  } else {
                    rm.b((byte) 122);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  ke.a((Throwable) null, "HS1: " + or.a(param0 + 121), 0);
                  rm.b((byte) 5);
                  break L2;
                } else {
                  var3 = var27.a((byte) -11);
                  var4_long = var27.i(-31016);
                  var6_ref_vi = (vi) ((Object) mc.field_i.a((byte) 100));
                  L15: while (true) {
                    L16: {
                      if (var6_ref_vi == null) {
                        break L16;
                      } else {
                        if (var3 == var6_ref_vi.field_u) {
                          break L16;
                        } else {
                          var6_ref_vi = (vi) ((Object) mc.field_i.b(param0 + 62));
                          continue L15;
                        }
                      }
                    }
                    if (var6_ref_vi == null) {
                      rm.b((byte) 107);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var6_ref_vi.field_r = var4_long;
                      var6_ref_vi.c(param0 ^ 2);
                      break L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "dm.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
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
                      incrementValue$2 = param2;
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
                      incrementValue$3 = param5;
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
                            var12 = vl.field_e[var8];
                            var11 = var12;
                            var9 = var11;
                            var12[param3] = param4;
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
          throw wn.a((Throwable) ((Object) var6), "dm.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
            this.field_Mb = new cr(0L, (cr) null);
            this.field_Lb = new od(0L, this.field_Mb, param2, param3);
            this.field_Hb = new cr(0L, param4);
            this.field_Kb = new cr(0L, param4);
            this.field_Hb.field_S = param5;
            this.field_Kb.field_S = param6;
            this.b(this.field_Lb, 121);
            this.b(this.field_Hb, 118);
            this.b(this.field_Kb, 126);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "dm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Ib = "Ignore";
        field_Jb = "Offer draw";
    }
}
