/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj implements el {
    private int field_b;
    private int field_e;
    private int field_n;
    private uc field_c;
    private int field_h;
    private int field_i;
    private int field_d;
    private int field_g;
    private int field_k;
    private int field_m;
    private int field_f;
    static bp field_l;
    private int field_j;
    static String field_a;

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ok var11 = null;
        gm stackIn_3_0 = null;
        gm stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof ok) {
            stackOut_2_0 = (gm) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (gm) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (ok) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param3 = param3 & var11.field_x;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          ph.d(param4.field_w + param2, param4.field_k + param1, param4.field_p, param4.field_o, ((oj) this).field_d);
          if (param3) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        var8 = param4.field_w + param2 - -((oj) this).field_k;
        var9 = ((oj) this).field_j + param4.field_k + param1;
        ph.e(var8, var9, ((oj) this).field_i, ((oj) this).field_e, 5592405);
        if (param0 <= 89) {
          return;
        } else {
          L3: {
            ph.d(var8, var9, ((oj) this).field_i, ((oj) this).field_e, var7);
            if (var11.field_A) {
              ph.a(var8, var9, var8 - -((oj) this).field_i, ((oj) this).field_e + var9, 1);
              ph.a(((oj) this).field_i + var8, var9, var8, ((oj) this).field_e + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == ((oj) this).field_c) {
              break L4;
            } else {
              var10 = ((oj) this).field_i - -((oj) this).field_k - -((oj) this).field_b;
              int discarded$1 = ((oj) this).field_c.a(param4.field_m, var10 + (param2 - -param4.field_w), param4.field_k + (param1 + ((oj) this).field_g), param4.field_p - var10 + -((oj) this).field_b, -(((oj) this).field_b << 72407521) + param4.field_o, ((oj) this).field_f, ((oj) this).field_n, ((oj) this).field_m, ((oj) this).field_h, 0);
              break L4;
            }
          }
          return;
        }
    }

    final static void a(int param0, short param1, int param2, boolean param3, boolean param4, int param5, int param6, short param7, int param8, kh param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26_int = 0;
        mp var26 = null;
        int var27 = 0;
        int var28 = 0;
        rm var29 = null;
        rm var30 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var28 = Torquing.field_u;
          var29 = param9.field_l;
          var30 = var29;
          var11 = var29.field_M[param5];
          if (param4) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        L1: {
          var12 = var29.field_M[param6];
          var13 = var29.field_M[param8];
          var14 = var29.field_B[param5];
          var15 = var29.field_B[param6];
          var16 = var29.field_B[param8];
          var17 = var29.field_E[param5];
          var18 = var29.field_E[param6];
          var19 = var29.field_E[param8];
          var20 = 40000;
          if (var20 >= (-var18 + var17) * (-var18 + var17) + ((var11 - var12) * (var11 - var12) + (var14 - var15) * (-var15 + var14))) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var21 = stackIn_5_0;
          if ((var15 - var16) * (-var16 + var15) + (-var13 + var12) * (-var13 + var12) + (-var19 + var18) * (-var19 + var18) <= var20) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var22 = stackIn_8_0;
          if ((var13 - var11) * (var13 - var11) - (-((var16 - var14) * (var16 - var14)) - (-var17 + var19) * (-var17 + var19)) <= var20) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var23 = stackIn_11_0;
          if (!param3) {
            var23 = 0;
            var22 = 0;
            var21 = 0;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (var21 == 0) {
            if (var22 == 0) {
              if (var23 != 0) {
                cd.a(var30, -19729, 1);
                var24 = var30.a((var13 + var11) / 2, (var16 + var14) / 2, (var17 + var19) / 2);
                oj.a(param0, param1, param2, param3, true, param6, var24, param7, param5, param9);
                oj.a(param0, param1, -param2 + 3, param3, true, param8, var24, param7, param6, param9);
                break L5;
              } else {
                L6: {
                  var24 = -1;
                  if ((2 & param0) != 0) {
                    sd.a(var30, 1, 0);
                    var25 = 415;
                    var26_int = 3680;
                    var27 = param2;
                    if (0 != var27) {
                      if (-2 != (var27 ^ -1)) {
                        if (2 != var27) {
                          if (var27 == 3) {
                            var24 = dj.a(param6, param8, var26_int, var30, var26_int, var25, var25, param5, var26_int, 1, var26_int);
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          var24 = dj.a(param6, param8, var25, var30, var26_int, var25, var26_int, param5, var26_int, 1, var25);
                          break L6;
                        }
                      } else {
                        var24 = dj.a(param6, param8, var26_int, var30, var25, var26_int, var25, param5, var25, 1, var26_int);
                        break L6;
                      }
                    } else {
                      var24 = dj.a(param6, param8, var25, var30, var25, var26_int, var26_int, param5, var25, 1, var25);
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                pm.a(param9, -27226, 1);
                var25 = var30.a(param5, param6, param8, (byte)(param0 & 1), (byte)(var24 >> -1143861352), param1, param7);
                var26 = param9.field_q;
                if (var26 != null) {
                  var26.field_q[var25] = (short)var24;
                  if (null != var26.field_u) {
                    var26.field_u[var25] = (byte)param2;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            } else {
              cd.a(var30, -19729, 1);
              var24 = var30.a((var12 - -var13) / 2, (var16 + var15) / 2, (var18 + var19) / 2);
              if (var23 != 0) {
                cd.a(var30, -19729, 1);
                var25 = var30.a((var13 - -var11) / 2, (var16 + var14) / 2, (var17 + var19) / 2);
                oj.a(param0, param1, param2, param3, true, var25, var24, param7, param8, param9);
                pc.a(param6, 5265, var24, var25, param5, param9, param7, param1, param0);
                break L5;
              } else {
                oj.a(param0, param1, param2, param3, true, param5, param6, param7, var24, param9);
                oj.a(param0, param1, -param2 + 3, param3, param4, param5, var24, param7, param8, param9);
                break L5;
              }
            }
          } else {
            cd.a(var30, -19729, 1);
            var24 = var30.a((var12 + var11) / 2, (var15 + var14) / 2, (var17 + var18) / 2);
            if (var22 == 0) {
              if (var23 == 0) {
                oj.a(param0, param1, param2, param3, true, param5, var24, param7, param8, param9);
                oj.a(param0, param1, -param2 + 3, param3, true, var24, param6, param7, param8, param9);
                break L5;
              } else {
                cd.a(var30, -19729, 1);
                var25 = var30.a((var11 + var13) / 2, (var14 + var16) / 2, (var17 + var19) / 2);
                oj.a(param0, param1, param2, param3, true, param5, var24, param7, var25, param9);
                pc.a(var25, 5265, var24, param6, param8, param9, param7, param1, param0);
                break L5;
              }
            } else {
              cd.a(var30, -19729, 1);
              var25 = var30.a((var13 + var12) / 2, (var15 - -var16) / 2, (var19 + var18) / 2);
              if (var23 == 0) {
                oj.a(param0, param1, param2, param3, true, var24, param6, param7, var25, param9);
                pc.a(var24, 5265, var25, param8, param5, param9, param7, param1, param0);
                break L5;
              } else {
                cd.a(var30, -19729, 1);
                var26_int = var30.a((var13 - -var11) / 2, (var16 - -var14) / 2, (var17 + var19) / 2);
                oj.a(param0, param1, param2, param3, param4, param5, var24, param7, var26_int, param9);
                oj.a(param0, param1, param2, param3, true, var24, param6, param7, var25, param9);
                oj.a(param0, param1, param2, param3, true, var25, param8, param7, var26_int, param9);
                oj.a(param0, param1, 3 + -param2, param3, param4, var25, var26_int, param7, var24, param9);
                break L5;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = null;
        }
        field_l = null;
    }

    oj(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((oj) this).field_m = 1;
        ((oj) this).field_h = 1;
        ((oj) this).field_n = param4;
        ((oj) this).field_f = param3;
        ((oj) this).field_e = param7;
        ((oj) this).field_j = param6;
        ((oj) this).field_d = param9;
        ((oj) this).field_i = param8;
        ((oj) this).field_g = param2;
        ((oj) this).field_k = param5;
        ((oj) this).field_c = param0;
        ((oj) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new bp();
        field_a = "Please enter your age in years";
    }
}
