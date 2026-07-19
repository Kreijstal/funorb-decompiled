/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wj {
    ol field_d;
    static hj field_o;
    static String field_a;
    ol field_i;
    static gn field_n;
    ol field_g;
    ol field_e;
    th field_b;
    int field_h;
    long field_j;
    byte field_l;
    th field_k;
    volatile int field_c;
    volatile int field_f;
    cc field_m;

    final static void b(byte param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        long var5_long = 0L;
        int var6 = 0;
        fb var7_ref_fb = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String[][] var9 = null;
        String[][] var10 = null;
        long[][] var11 = null;
        int[][] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        da var28 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var27 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3 = -93 % ((param0 - 21) / 43);
              var28 = rd.field_e;
              var2 = var28.f((byte) -22);
              if (-1 == (var2 ^ -1)) {
                var4 = var28.k(106);
                var5 = (jg) ((Object) pc.field_e.b((byte) 115));
                L2: while (true) {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var5.field_i != var4) {
                        var5 = (jg) ((Object) pc.field_e.c((byte) -25));
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var5 != null) {
                    L4: {
                      var6 = var28.f((byte) -98);
                      if (0 != var6) {
                        var7 = var5.field_l;
                        gd.field_h[0].field_b = ng.field_e;
                        gd.field_h[0].field_g = null;
                        var8 = var5.field_n;
                        gd.field_h[0].field_e = false;
                        var9_int = 1;
                        L5: while (true) {
                          if (var6 <= var9_int) {
                            dupTemp$6 = new String[3][var7];
                            var5.field_m = dupTemp$6;
                            var9 = dupTemp$6;
                            var10 = new String[3][var7];
                            dupTemp$7 = new long[3][var7];
                            var5.field_k = dupTemp$7;
                            var11 = dupTemp$7;
                            dupTemp$8 = new int[3][var7 * var8];
                            var5.field_p = dupTemp$8;
                            var12 = dupTemp$8;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                            var19 = var28.f((byte) -59);
                            if ((var19 ^ -1) < -1) {
                              var20 = 0;
                              L6: while (true) {
                                if (var20 >= var19) {
                                  break L4;
                                } else {
                                  L7: {
                                    var21 = var28.f((byte) -22);
                                    var22 = gd.field_h[var21].field_b;
                                    var23 = var28.d(true);
                                    var25 = var28.field_l;
                                    if (var20 >= var7) {
                                      break L7;
                                    } else {
                                      var9[0][var13] = var22;
                                      var10[0][var13] = gd.field_h[var21].field_g;
                                      var11[0][var13] = var23;
                                      var26 = 0;
                                      L8: while (true) {
                                        if (var26 >= var8) {
                                          var13++;
                                          break L7;
                                        } else {
                                          incrementValue$9 = var16;
                                          var16++;
                                          var12[0][incrementValue$9] = var28.a(-107);
                                          var26++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    if (var22 == null) {
                                      break L9;
                                    } else {
                                      if (ra.a(var22, false)) {
                                        var9[1][var14] = ng.field_e;
                                        var10[1][var14] = null;
                                        var11[1][var14] = var23;
                                        var28.field_l = var25;
                                        var14++;
                                        var26 = 0;
                                        L10: while (true) {
                                          if (var8 <= var26) {
                                            break L9;
                                          } else {
                                            incrementValue$10 = var17;
                                            var17++;
                                            var12[1][incrementValue$10] = var28.a(98);
                                            var26++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var7 <= var15) {
                                      break L11;
                                    } else {
                                      if (!gd.field_h[var21].field_e) {
                                        gd.field_h[var21].field_e = true;
                                        var9[2][var15] = var22;
                                        var10[2][var15] = gd.field_h[var21].field_g;
                                        var11[2][var15] = var23;
                                        var28.field_l = var25;
                                        var15++;
                                        var26 = 0;
                                        L12: while (true) {
                                          if (var26 >= var8) {
                                            break L11;
                                          } else {
                                            incrementValue$11 = var18;
                                            var18++;
                                            var12[2][incrementValue$11] = var28.a(111);
                                            var26++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var20++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            L13: {
                              gd.field_h[var9_int].field_b = var28.j(-1231);
                              gd.field_h[var9_int].field_e = false;
                              if (-2 != (var28.f((byte) -41) ^ -1)) {
                                gd.field_h[var9_int].field_g = null;
                                break L13;
                              } else {
                                gd.field_h[var9_int].field_g = var28.j(-1231);
                                break L13;
                              }
                            }
                            var9_int++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var5.field_j = true;
                    var5.d(0);
                    break L1;
                  } else {
                    r.a(-28036);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  bl.a((Throwable) null, (byte) -120, "HS1: " + em.b(false));
                  r.a(-28036);
                  break L1;
                } else {
                  var4 = var28.k(78);
                  var5_long = var28.d(true);
                  var7_ref_fb = (fb) ((Object) bj.field_O.b((byte) 110));
                  L14: while (true) {
                    L15: {
                      if (var7_ref_fb == null) {
                        break L15;
                      } else {
                        if (var7_ref_fb.field_u == var4) {
                          break L15;
                        } else {
                          var7_ref_fb = (fb) ((Object) bj.field_O.c((byte) -64));
                          continue L14;
                        }
                      }
                    }
                    if (var7_ref_fb != null) {
                      var7_ref_fb.field_m = var5_long;
                      var7_ref_fb.d(0);
                      break L1;
                    } else {
                      r.a(-28036);
                      decompiledRegionSelector0 = 0;
                      break L0;
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
          throw kk.a((Throwable) ((Object) var1), "wj.N(" + param0 + ')');
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

    abstract void a(Object param0, boolean param1, int param2);

    final boolean c(int param0) {
        boolean discarded$0 = false;
        if (param0 < 73) {
            discarded$0 = this.c(3);
        }
        return (this.b(39) ^ -1) <= -21 ? true : false;
    }

    final int b(boolean param0) {
        if (param0) {
            this.field_h = 95;
        }
        return this.field_g.a(107) - -this.field_e.a(-6);
    }

    final int b(int param0) {
        if (param0 < 16) {
            field_n = (gn) null;
        }
        return this.field_d.a(64) - -this.field_i.a(29);
    }

    abstract void a(boolean param0);

    final cc a(int param0, boolean param1, byte param2, byte param3, int param4) {
        long var6 = ((long)param4 << 2134369312) - -(long)param0;
        cc var8 = new cc();
        var8.field_i = var6;
        var8.field_t = param1 ? true : false;
        var8.field_B = param2;
        if (param3 != -60) {
            return (cc) null;
        }
        if (param1) {
            if (!(this.b(78) < 20)) {
                throw new RuntimeException();
            }
            this.field_d.a(param3 ^ 83, var8);
        } else {
            if (this.b(false) >= 20) {
                throw new RuntimeException();
            }
            this.field_g.a(122, var8);
        }
        return var8;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, hj param7, int param8) {
        try {
            cd.field_b = param3;
            wn.field_a = param7;
            vb.field_d = param2;
            fh.field_e = param5;
            if (param1 != 19189) {
                wj.a(37);
            }
            bd.field_W = param6;
            mj.field_a = param8;
            bj.field_G = param0;
            ih.field_m = param4;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "wj.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    abstract void e(int param0);

    final boolean d(int param0) {
        if (param0 != 20) {
            return false;
        }
        return this.b(false) >= 20 ? true : false;
    }

    abstract boolean a(byte param0);

    public static void a(int param0) {
        field_o = null;
        field_n = null;
        if (param0 != 16831) {
            return;
        }
        field_a = null;
    }

    wj() {
        this.field_d = new ol();
        this.field_i = new ol();
        this.field_g = new ol();
        this.field_e = new ol();
        this.field_b = new th(6);
        this.field_l = (byte) 0;
        this.field_c = 0;
        this.field_f = 0;
        this.field_k = new th(10);
    }

    static {
        field_o = new hj(270, 70);
    }
}
