/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends um {
    static long field_s;
    static String field_z;
    static int field_y;
    static int field_x;
    static boolean field_w;
    static String[] field_C;
    static boolean field_B;
    static String field_t;
    private di field_u;
    ta field_v;
    static String field_A;
    hg field_r;

    private final void a(int param0, int param1, int param2, cg param3, int[] param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        rc var11 = null;
        int var12 = 0;
        di stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        di stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        di stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        di stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        di stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        di stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        var12 = MinerDisturbance.field_ab;
        if (!param5) {
          L0: {
            if ((((gd) this).field_u.field_v[param3.field_n] & 4) == 0) {
              break L0;
            } else {
              if ((param3.field_G ^ -1) > -1) {
                var7 = ((gd) this).field_u.field_u[param3.field_n] / fj.field_r;
                L1: while (true) {
                  var8 = (-param3.field_B + (1048575 - -var7)) / var7;
                  if (param1 >= var8) {
                    L2: {
                      param3.field_w.a(param4, param0, var8);
                      param1 = param1 - var8;
                      param0 = param0 + var8;
                      param3.field_B = param3.field_B + (-1048576 + var7 * var8);
                      var9 = fj.field_r / 100;
                      var10 = 262144 / var7;
                      if (var10 >= var9) {
                        break L2;
                      } else {
                        var9 = var10;
                        break L2;
                      }
                    }
                    L3: {
                      var11 = param3.field_w;
                      if (((gd) this).field_u.field_Y[param3.field_n] == 0) {
                        param3.field_w = rc.a(param3.field_D, var11.h(), var11.i(), var11.e());
                        break L3;
                      } else {
                        L4: {
                          param3.field_w = rc.a(param3.field_D, var11.h(), 0, var11.e());
                          stackOut_11_0 = ((gd) this).field_u;
                          stackOut_11_1 = 255;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if (0 <= param3.field_I.field_t[param3.field_F]) {
                            stackOut_13_0 = (di) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            stackIn_14_2 = stackOut_13_2;
                            break L4;
                          } else {
                            stackOut_12_0 = (di) (Object) stackIn_12_0;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = 1;
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            break L4;
                          }
                        }
                        ((di) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2 != 0, param3);
                        param3.field_w.c(var9, var11.i());
                        break L3;
                      }
                    }
                    L5: {
                      if ((param3.field_I.field_t[param3.field_F] ^ -1) <= -1) {
                        break L5;
                      } else {
                        param3.field_w.i(-1);
                        break L5;
                      }
                    }
                    var11.g(var9);
                    var11.a(param4, param0, -param0 + param2);
                    if (var11.j()) {
                      ((gd) this).field_r.b((um) (Object) var11);
                      continue L1;
                    } else {
                      continue L1;
                    }
                  } else {
                    param3.field_B = param3.field_B + var7 * param1;
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          param3.field_w.a(param4, param0, param1);
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        cg var3 = null;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        ((gd) this).field_r.a(param0);
        var3 = (cg) (Object) ((gd) this).field_v.b(73);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (((gd) this).field_u.a(var3, -24)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_M >= var2) {
                    this.a((byte) 100, var2, var3);
                    var3.field_M = var3.field_M - var2;
                    break L1;
                  } else {
                    this.a((byte) 122, var3.field_M, var3);
                    var2 = var2 - var3.field_M;
                    if (!((gd) this).field_u.a(var2, var3, 1387831944, (int[]) null, 0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (cg) (Object) ((gd) this).field_v.b((byte) 56);
            continue L0;
          }
        }
    }

    final int d() {
        return 0;
    }

    private final void a(byte param0, int param1, cg param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        di stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        di stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        di stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        di stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        di stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        di stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          if ((4 & ((gd) this).field_u.field_v[param2.field_n]) == 0) {
            break L0;
          } else {
            if ((param2.field_G ^ -1) <= -1) {
              break L0;
            } else {
              var4 = ((gd) this).field_u.field_u[param2.field_n] / fj.field_r;
              var5 = (-param2.field_B + (var4 + 1048575)) / var4;
              param2.field_B = 1048575 & var4 * param1 + param2.field_B;
              if (param1 < var5) {
                break L0;
              } else {
                L1: {
                  if (-1 == (((gd) this).field_u.field_Y[param2.field_n] ^ -1)) {
                    param2.field_w = rc.a(param2.field_D, param2.field_w.h(), param2.field_w.i(), param2.field_w.e());
                    break L1;
                  } else {
                    L2: {
                      param2.field_w = rc.a(param2.field_D, param2.field_w.h(), 0, param2.field_w.e());
                      stackOut_4_0 = ((gd) this).field_u;
                      stackOut_4_1 = 255;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (param2.field_I.field_t[param2.field_F] >= 0) {
                        stackOut_6_0 = (di) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        break L2;
                      } else {
                        stackOut_5_0 = (di) (Object) stackIn_5_0;
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        break L2;
                      }
                    }
                    ((di) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2 != 0, param2);
                    break L1;
                  }
                }
                L3: {
                  if (param2.field_I.field_t[param2.field_F] < 0) {
                    param2.field_w.i(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param1 = param2.field_B / var4;
                break L0;
              }
            }
          }
        }
        L4: {
          param2.field_w.a(param1);
          if (param0 > 64) {
            break L4;
          } else {
            var6 = null;
            short[] discarded$1 = gd.a((ld) null, 110, -27, (short[]) null);
            break L4;
          }
        }
    }

    final um c() {
        cg var1_ref = null;
        do {
            var1_ref = (cg) (Object) ((gd) this).field_v.b((byte) 56);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_w == null);
        return (um) (Object) var1_ref.field_w;
    }

    final static boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -95) {
          L0: {
            L1: {
              if (ci.field_i == null) {
                break L1;
              } else {
                if (qd.field_Q != pb.field_c) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_z = null;
        field_A = null;
        field_t = null;
        if (param0 != -114) {
            return;
        }
        field_C = null;
    }

    final static short[] a(ld param0, int param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = MinerDisturbance.field_ab;
          if (param2 <= -54) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        var4 = param0.c((byte) -122, param1);
        if (-1 != (var4 ^ -1)) {
          L1: {
            L2: {
              if (param3 == null) {
                break L2;
              } else {
                if (var4 != param3.length) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param3 = new short[var4];
            break L1;
          }
          L3: {
            var5 = param0.c((byte) -82, 4);
            var6 = (short)param0.c((byte) -123, 16);
            if (0 < var5) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param3[var7] = (short)(param0.c((byte) -70, var5) + var6);
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param3[var7] = (short)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        cg var6 = null;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        ((gd) this).field_r.a(param0, param1, param2);
        var6 = (cg) (Object) ((gd) this).field_v.b(90);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (!((gd) this).field_u.a(var6, -75)) {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= var6.field_M) {
                    this.a(var4, var5, var4 - -var5, var6, param0, false);
                    var6.field_M = var6.field_M - var5;
                    break L1;
                  } else {
                    this.a(var4, var6.field_M, var4 - -var5, var6, param0, false);
                    var4 = var4 + var6.field_M;
                    var5 = var5 - var6.field_M;
                    if (!((gd) this).field_u.a(var5, var6, 1387831944, param0, var4)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var6 = (cg) (Object) ((gd) this).field_v.b((byte) 56);
            continue L0;
          }
        }
    }

    final static int a(boolean param0, int param1, ob param2) {
        int var3 = 104 % ((-3 - param1) / 48);
        return param2.c(param0, true);
    }

    final um b() {
        cg var1 = (cg) (Object) ((gd) this).field_v.b(97);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (um) (Object) var1.field_w;
        }
        return ((gd) this).c();
    }

    gd(di param0) {
        ((gd) this).field_v = new ta();
        ((gd) this).field_r = new hg();
        ((gd) this).field_u = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "3x multiplier: Triples all points. Combines with 2x muliplier to make a 6x multiplier!";
        field_A = "<%0> <times> 250 = <%1>";
        field_t = "Tips: ";
        field_C = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
