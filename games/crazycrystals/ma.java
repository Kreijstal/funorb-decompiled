/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends pn {
    static db field_p;
    static String field_o;
    static int[] field_n;
    static jp field_m;
    private dl field_q;

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        ((ma) this).field_l = ((ma) this).field_l.a(param0, param1, param2, param3, param4, param5);
        return (f) this;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        L0: {
          L1: {
            if (param1 != 24) {
              break L1;
            } else {
              if (24 == param2) {
                ((ma) this).field_q.d(param4, param5 - param2, 256);
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((ma) this).field_q.a(param4, param5 + -param2, param1 * 2, 3 * param2, 256);
          break L0;
        }
        var7 = 85 % ((param0 - 74) / 41);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            field_n = null;
        }
        return ((ma) this).field_l.a(param0, param1);
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        ((ma) this).field_l = ((ma) this).field_l.a(param0, param1, param2, param3, (byte) -126, param5, param6);
        if (param4 >= -87) {
            field_n = null;
        }
        return (f) this;
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6 = 9 / ((73 - param4) / 42);
        return ((ma) this).field_l.a(param0, param1, param2, param3, (byte) 123);
    }

    private ma(dl param0, f param1, ma param2) {
        super(param1);
        ((ma) this).field_q = param0;
        if (param2 != null) {
            ((ma) this).a((byte) 57, (f) (Object) param2);
        }
        ((ma) this).a((byte) 92, param1);
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            field_p = null;
        }
        return ((ma) this).field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ak var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        hp var6_ref_hp = null;
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
        md var27 = null;
        L0: {
          var26 = CrazyCrystals.field_B;
          var27 = kd.field_n;
          var2 = var27.h(255);
          if (param0 > 56) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        L1: {
          if (var2 == 0) {
            var3 = var27.c((byte) -7);
            var4 = (ak) (Object) hd.field_d.g(32073);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var3 == var4.field_g) {
                    break L3;
                  } else {
                    var4 = (ak) (Object) hd.field_d.a(false);
                    continue L2;
                  }
                }
              }
              if (var4 == null) {
                jj.a(4);
                return;
              } else {
                L4: {
                  var5 = var27.h(255);
                  if (var5 != 0) {
                    var6 = var4.field_h;
                    var7 = var4.field_j;
                    ub.field_d[0].field_j = false;
                    ub.field_d[0].field_g = je.field_g;
                    ub.field_d[0].field_a = null;
                    var8_int = 1;
                    L5: while (true) {
                      if (var5 <= var8_int) {
                        String[][] dupTemp$6 = new String[3][var6];
                        var4.field_i = dupTemp$6;
                        var8 = dupTemp$6;
                        var9 = new String[3][var6];
                        long[][] dupTemp$7 = new long[3][var6];
                        var4.field_k = dupTemp$7;
                        var10 = dupTemp$7;
                        int[][] dupTemp$8 = new int[3][var6 * var7];
                        var4.field_l = dupTemp$8;
                        var11 = dupTemp$8;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var27.h(255);
                        if (-1 <= (var18 ^ -1)) {
                          break L4;
                        } else {
                          var19 = 0;
                          L6: while (true) {
                            if (var19 >= var18) {
                              break L4;
                            } else {
                              L7: {
                                var20 = var27.h(255);
                                var21 = ub.field_d[var20].field_g;
                                var22 = var27.d(true);
                                var24 = var27.field_f;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = ub.field_d[var20].field_a;
                                  var10[0][var12] = var22;
                                  var12++;
                                  var25 = 0;
                                  L8: while (true) {
                                    if (var7 <= var25) {
                                      break L7;
                                    } else {
                                      int incrementValue$9 = var15;
                                      var15++;
                                      var11[0][incrementValue$9] = var27.b((byte) -104);
                                      var25++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              L9: {
                                if (var21 == null) {
                                  break L9;
                                } else {
                                  if (!ai.a((byte) 82, var21)) {
                                    break L9;
                                  } else {
                                    var8[1][var13] = je.field_g;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var27.field_f = var24;
                                    var13++;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var7 <= var25) {
                                        break L9;
                                      } else {
                                        int incrementValue$10 = var16;
                                        var16++;
                                        var11[1][incrementValue$10] = var27.b((byte) -125);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var6 > var14) {
                                if (!ub.field_d[var20].field_j) {
                                  ub.field_d[var20].field_j = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = ub.field_d[var20].field_a;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var27.field_f = var24;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var7 > var25) {
                                      int incrementValue$11 = var17;
                                      var17++;
                                      var11[2][incrementValue$11] = var27.b((byte) -120);
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        ub.field_d[var8_int].field_g = var27.i(123);
                        ub.field_d[var8_int].field_j = false;
                        if (-2 == (var27.h(255) ^ -1)) {
                          ub.field_d[var8_int].field_a = var27.i(109);
                          var8_int++;
                          continue L5;
                        } else {
                          ub.field_d[var8_int].field_a = null;
                          var8_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var4.field_n = true;
                var4.a(false);
                break L1;
              }
            }
          } else {
            if ((var2 ^ -1) != -2) {
              wp.a((Throwable) null, "HS1: " + ug.a(-1815), 21862);
              jj.a(4);
              break L1;
            } else {
              var3 = var27.c((byte) -7);
              var4_long = var27.d(true);
              var6_ref_hp = (hp) (Object) cf.field_c.g(32073);
              L12: while (true) {
                L13: {
                  if (var6_ref_hp == null) {
                    break L13;
                  } else {
                    if (var6_ref_hp.field_n != var3) {
                      var6_ref_hp = (hp) (Object) cf.field_c.a(false);
                      continue L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var6_ref_hp != null) {
                  var6_ref_hp.field_i = var4_long;
                  var6_ref_hp.a(false);
                  break L1;
                } else {
                  jj.a(4);
                  return;
                }
              }
            }
          }
        }
    }

    final nj a(int param0, nj param1) {
        nj var3 = ((ma) this).field_l.a(param0, param1);
        if (var3 != null) {
            if (!(var3.field_a instanceof pf)) {
                return var3;
            }
        }
        Object var4 = null;
        return ng.a(ah.field_f, param1, (f) (Object) new ma(ac.field_j, (f) (Object) new kp(-1), (ma) null), (byte) -83, gg.field_e);
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            return true;
        }
        return ((ma) this).field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
            return false;
        }
        return ((ma) this).field_l.b((byte) 82);
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            return true;
        }
        return ((ma) this).field_l.a(false, param1, param2);
    }

    ma(dl param0, f param1, mj param2) {
        this(param0, param1, param2.field_a);
        param2.field_a = (ma) this;
    }

    final f c(int param0) {
        f discarded$0 = super.c(param0);
        return ((ma) this).field_l;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        ((ma) this).field_l = ((ma) this).field_l.a(param0, (byte) -94, param2, param3);
        if (param1 > -74) {
            field_n = null;
        }
        return (f) this;
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            field_n = null;
        }
        return ((ma) this).field_l.e(-4128);
    }

    public static void f(int param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 < 39) {
            ma.f(-74);
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        vk.field_N.a(16, param3 * 12, 12 * param0, 60, (byte) -111);
        if (param1 != 0) {
            Object var6 = null;
            f discarded$0 = ((ma) this).a((f) null, 106, -41, (f[][]) null, (dl[]) null, (byte) -23);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "What else do you think rocks roll off?";
        field_m = new jp();
    }
}
