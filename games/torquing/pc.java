/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pc implements el, fe {
    int field_e;
    uc field_m;
    int field_h;
    private boolean field_l;
    int field_g;
    private int field_c;
    int field_f;
    int field_j;
    static int[] field_d;
    int field_p;
    int field_b;
    int field_k;
    int field_a;
    static String field_n;
    static String field_i;
    int field_o;

    private final void a(gm param0, int param1, int param2, int param3) {
        this.a(-2, param0, param1, ((pc) this).field_h, 0, param2, 0, ((pc) this).field_c);
        if (param3 != -546) {
            ((pc) this).field_a = -66;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kh param5, short param6, short param7, int param8) {
        int var10 = 0;
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
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        rm var30 = null;
        rm var31 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var29 = Torquing.field_u;
        var30 = param5.field_l;
        var31 = var30;
        var10 = var30.field_M[param4];
        var11 = var30.field_M[param0];
        var12 = var30.field_M[param2];
        var13 = var30.field_M[param3];
        var14 = var30.field_B[param4];
        var15 = var30.field_B[param0];
        var16 = var30.field_B[param2];
        var17 = var30.field_B[param3];
        var18 = var30.field_E[param4];
        var19 = var30.field_E[param0];
        var20 = var30.field_E[param2];
        var21 = var30.field_E[param3];
        if (param1 == 5265) {
          L0: {
            var22 = 40000;
            if ((var22 ^ -1) <= ((var14 + -var15) * (-var15 + var14) + ((var10 - var11) * (var10 - var11) - -((-var19 + var18) * (var18 - var19))) ^ -1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var23 = stackIn_5_0;
            if ((-var20 + var19) * (var19 - var20) + ((var15 + -var16) * (var15 + -var16) + (-var12 + var11) * (var11 - var12)) <= var22) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var24 = stackIn_8_0;
            if ((-var21 + var20) * (-var21 + var20) + (var16 + -var17) * (-var17 + var16) + (var12 - var13) * (-var13 + var12) <= var22) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var25 = stackIn_11_0;
            if ((var22 ^ -1) <= ((-var18 + var21) * (-var18 + var21) + ((-var10 + var13) * (var13 - var10) - -((var17 + -var14) * (var17 + -var14))) ^ -1)) {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          var26 = stackIn_14_0;
          if (var23 != 0) {
            if (var24 == 0) {
              if (var25 == 0) {
                if (var23 == 0) {
                  if (var24 != 0) {
                    if (var25 != 0) {
                      oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                      oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                      return;
                    } else {
                      cd.a(var31, -19729, 2);
                      var27 = var31.a((var12 + var11) / 2, (var16 + var15) / 2, (var20 + var19) / 2);
                      var28 = var31.a((var13 - -var10) / 2, (var14 + var17) / 2, (var18 + var21) / 2);
                      pc.a(var27, 5265, var28, param4, param0, param5, param6, param7, param8);
                      pc.a(var28, 5265, var27, param2, param3, param5, param6, param7, param8);
                      return;
                    }
                  } else {
                    oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                    oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                    return;
                  }
                } else {
                  oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                  oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                  return;
                }
              } else {
                if (var26 != 0) {
                  if (var23 == 0) {
                    if (var24 != 0) {
                      if (var25 == 0) {
                        cd.a(var31, -19729, 2);
                        var27 = var31.a((var12 + var11) / 2, (var16 + var15) / 2, (var20 + var19) / 2);
                        var28 = var31.a((var13 - -var10) / 2, (var14 + var17) / 2, (var18 + var21) / 2);
                        pc.a(var27, 5265, var28, param4, param0, param5, param6, param7, param8);
                        pc.a(var28, 5265, var27, param2, param3, param5, param6, param7, param8);
                        return;
                      } else {
                        oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                        oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                        return;
                      }
                    } else {
                      oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                      oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                      return;
                    }
                  } else {
                    oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                    oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                    return;
                  }
                } else {
                  cd.a(var31, param1 ^ -22914, 2);
                  var27 = var31.a((var11 + var10) / 2, (var15 + var14) / 2, (var19 + var18) / 2);
                  var28 = var31.a((var12 + var13) / 2, (var17 + var16) / 2, (var21 + var20) / 2);
                  pc.a(var27, 5265, var28, param3, param4, param5, param6, param7, param8);
                  pc.a(var28, 5265, var27, param0, param2, param5, param6, param7, param8);
                  return;
                }
              }
            } else {
              if (var23 == 0) {
                if (var24 != 0) {
                  if (var25 == 0) {
                    if (var26 != 0) {
                      cd.a(var31, -19729, 2);
                      var27 = var31.a((var12 + var11) / 2, (var16 + var15) / 2, (var20 + var19) / 2);
                      var28 = var31.a((var13 - -var10) / 2, (var14 + var17) / 2, (var18 + var21) / 2);
                      pc.a(var27, 5265, var28, param4, param0, param5, param6, param7, param8);
                      pc.a(var28, 5265, var27, param2, param3, param5, param6, param7, param8);
                      return;
                    } else {
                      oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                      oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                      return;
                    }
                  } else {
                    oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                    oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                    return;
                  }
                } else {
                  oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                  oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                  return;
                }
              } else {
                oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                return;
              }
            }
          } else {
            if (var24 != 0) {
              if (var25 == 0) {
                if (var26 != 0) {
                  cd.a(var31, -19729, 2);
                  var27 = var31.a((var12 + var11) / 2, (var16 + var15) / 2, (var20 + var19) / 2);
                  var28 = var31.a((var13 - -var10) / 2, (var14 + var17) / 2, (var18 + var21) / 2);
                  pc.a(var27, 5265, var28, param4, param0, param5, param6, param7, param8);
                  pc.a(var28, 5265, var27, param2, param3, param5, param6, param7, param8);
                  return;
                } else {
                  oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                  oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                  return;
                }
              } else {
                oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
                oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
                return;
              }
            } else {
              oj.a(param8, param7, 2, true, true, param4, param0, param6, param2, param5);
              oj.a(param8, param7, 1, true, true, param2, param3, param6, param4, param5);
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int c(gm param0, int param1) {
        if (param1 != 8557) {
            return -106;
        }
        return -((pc) this).field_p + (param0.field_o + -((pc) this).field_o);
    }

    public final void a(int param0, gm param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        kp var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uj var13 = null;
        uj var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        L0: {
          if (param1.g(2)) {
            L1: {
              var13 = ((pc) this).b((byte) 121, param1);
              var14 = var13;
              var7 = var14.b(param2, (byte) 110);
              var8 = var13.field_c[var7];
              var9 = var14.a(param2, (byte) -125);
              var10 = this.a(var9, param0, 2, param1);
              var11 = ((pc) this).a(param1, param4, -72) + Math.max(0, var8.field_c);
              stackOut_2_0 = ((pc) this).a(param1, param4, -108);
              stackOut_2_1 = this.c(param1, 8557);
              stackOut_2_2 = var8.field_a;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              if (1 + var7 < var14.field_c.length) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = var13.field_c[var7 - -1].field_c;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = var8.field_a;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                break L1;
              }
            }
            var12 = stackIn_5_0 + Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
            ld.a(param1.field_p + (param0 - -param1.field_w), param0 + param1.field_w, param1.field_o + param4 - -param1.field_k, param1.field_k + param4, (byte) -116);
            ah.field_c.a(var11, var12, false, var10, ((pc) this).field_j, var10);
            r.a(126);
            break L0;
          } else {
            break L0;
          }
        }
        if (param3) {
          field_d = null;
          return;
        } else {
          return;
        }
    }

    public final int a(byte param0, gm param1) {
        uj discarded$0 = ((pc) this).b((byte) 112, param1);
        int var3 = 127 / ((18 - param0) / 53);
        return param1.field_u.a(true) - (-((pc) this).field_k + -((pc) this).field_e);
    }

    String c(byte param0, gm param1) {
        Object var4 = null;
        if (param0 != 65) {
          var4 = null;
          int discarded$2 = ((pc) this).a((byte) -109, (gm) null);
          return param1.field_m;
        } else {
          return param1.field_m;
        }
    }

    public final int a(gm param0, int param1, int param2) {
        int var4 = 88 % ((22 - param2) / 43);
        return this.a((byte) -123, param0, param1, 0);
    }

    public final uj b(byte param0, gm param1) {
        if (param0 > 96) {
          L0: {
            if (param1.field_u == null) {
              param1.field_u = (uj) (Object) new cm();
              break L0;
            } else {
              break L0;
            }
          }
          if (!((pc) this).field_l) {
            this.a(false, param1);
            return param1.field_u;
          } else {
            ((cm) (Object) param1.field_u).a(((pc) this).field_a, ((pc) this).field_m, (byte) 26, this.c(param1, 8557), ((pc) this).b(param1, -1), ((pc) this).c((byte) 65, param1), ((pc) this).field_f, ((pc) this).field_g);
            return param1.field_u;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, pc param1) {
        param1.field_f = ((pc) this).field_f;
        param1.field_c = ((pc) this).field_c;
        param1.field_b = ((pc) this).field_b;
        param1.field_e = ((pc) this).field_e;
        param1.field_h = ((pc) this).field_h;
        param1.field_j = ((pc) this).field_j;
        param1.field_l = ((pc) this).field_l;
        param1.field_m = ((pc) this).field_m;
        param1.field_g = ((pc) this).field_g;
        param1.field_k = ((pc) this).field_k;
        int var3 = 104 / ((-5 - param0) / 37);
        param1.field_a = ((pc) this).field_a;
        param1.field_o = ((pc) this).field_o;
        param1.field_p = ((pc) this).field_p;
    }

    public final int b(gm param0, int param1) {
        if (param1 != -1) {
            return -14;
        }
        return -((pc) this).field_e + (-((pc) this).field_k + param0.field_p);
    }

    private final void a(int param0, gm param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Torquing.field_u;
        ld.a(param1.field_p + (param1.field_w + param2), param2 - -param1.field_w, param5 - -param1.field_k - -param1.field_o, param1.field_k + param5, (byte) -105);
        if (param0 != -2) {
          field_d = null;
          var9 = ((pc) this).b(param1, -1);
          var10 = this.c(param1, 8557);
          if (!((pc) this).field_l) {
            var12 = ((pc) this).field_g;
            if (-1 != (var12 ^ -1)) {
              if (2 == var12) {
                var11 = -((pc) this).field_m.field_t + var10;
                var12 = ((pc) this).field_f;
                if (-1 == (var12 ^ -1)) {
                  ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                  r.a(127);
                  return;
                } else {
                  if (-4 != (var12 ^ -1)) {
                    if (var12 != 1) {
                      if (var12 != 2) {
                        r.a(127);
                        return;
                      } else {
                        ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                        r.a(127);
                        return;
                      }
                    } else {
                      ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                      r.a(127);
                      return;
                    }
                  } else {
                    ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                    r.a(127);
                    return;
                  }
                }
              } else {
                if (3 != var12) {
                  if (-2 != (var12 ^ -1)) {
                    var11 = ((pc) this).field_m.field_x + (-((pc) this).field_m.field_t + (var10 - ((pc) this).field_m.field_x) >> 854791457);
                    var12 = ((pc) this).field_f;
                    if (-1 == (var12 ^ -1)) {
                      ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                      r.a(127);
                      return;
                    } else {
                      if (-4 != (var12 ^ -1)) {
                        if (var12 != 1) {
                          if (var12 == 2) {
                            ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                            r.a(127);
                            return;
                          } else {
                            r.a(127);
                            return;
                          }
                        } else {
                          ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                          r.a(127);
                          return;
                        }
                      } else {
                        ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                        r.a(127);
                        return;
                      }
                    }
                  } else {
                    var11 = ((pc) this).field_m.field_x + (-((pc) this).field_m.field_t + (var10 - ((pc) this).field_m.field_x) >> 854791457);
                    var12 = ((pc) this).field_f;
                    if (-1 == (var12 ^ -1)) {
                      ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                      r.a(127);
                      return;
                    } else {
                      if (-4 != (var12 ^ -1)) {
                        if (var12 != 1) {
                          if (var12 != 2) {
                            r.a(127);
                            return;
                          } else {
                            ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                            r.a(127);
                            return;
                          }
                        } else {
                          ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                          r.a(127);
                          return;
                        }
                      } else {
                        ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                        r.a(127);
                        return;
                      }
                    }
                  }
                } else {
                  var11 = ((pc) this).field_m.field_x + (-((pc) this).field_m.field_t + (var10 - ((pc) this).field_m.field_x) >> 854791457);
                  var12 = ((pc) this).field_f;
                  if (-1 == (var12 ^ -1)) {
                    ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                    r.a(127);
                    return;
                  } else {
                    if (-4 != (var12 ^ -1)) {
                      if (var12 != 1) {
                        if (var12 != 2) {
                          r.a(127);
                          return;
                        } else {
                          ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                          r.a(127);
                          return;
                        }
                      } else {
                        ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                        r.a(127);
                        return;
                      }
                    } else {
                      ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                      r.a(127);
                      return;
                    }
                  }
                }
              }
            } else {
              L0: {
                L1: {
                  var11 = ((pc) this).field_m.field_x;
                  var12 = ((pc) this).field_f;
                  if (-1 == (var12 ^ -1)) {
                    break L1;
                  } else {
                    if (-4 != (var12 ^ -1)) {
                      if (var12 != 1) {
                        if (var12 != 2) {
                          break L0;
                        } else {
                          ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                          r.a(127);
                          return;
                        }
                      } else {
                        ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                        r.a(127);
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                break L0;
              }
              r.a(127);
              return;
            }
          } else {
            int discarded$2 = ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), this.a((byte) 78, param1, param5, param6), var9, var10, param3, param7, ((pc) this).field_f, ((pc) this).field_g, ((pc) this).field_a);
            r.a(127);
            return;
          }
        } else {
          L2: {
            var9 = ((pc) this).b(param1, -1);
            var10 = this.c(param1, 8557);
            if (!((pc) this).field_l) {
              var12 = ((pc) this).field_g;
              if (-1 != (var12 ^ -1)) {
                if (2 == var12) {
                  L3: {
                    L4: {
                      var11 = -((pc) this).field_m.field_t + var10;
                      var12 = ((pc) this).field_f;
                      if (-1 == (var12 ^ -1)) {
                        break L4;
                      } else {
                        if (-4 != (var12 ^ -1)) {
                          if (var12 != 1) {
                            if (var12 != 2) {
                              break L3;
                            } else {
                              ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                              break L3;
                            }
                          } else {
                            ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                            break L3;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                    break L3;
                  }
                  r.a(127);
                  return;
                } else {
                  L5: {
                    if (3 == var12) {
                      break L5;
                    } else {
                      if (-2 == (var12 ^ -1)) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = ((pc) this).field_m.field_x + (-((pc) this).field_m.field_t + (var10 - ((pc) this).field_m.field_x) >> 854791457);
                  var12 = ((pc) this).field_f;
                  if (-1 == (var12 ^ -1)) {
                    ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                    r.a(127);
                    return;
                  } else {
                    if (-4 != (var12 ^ -1)) {
                      if (var12 != 1) {
                        if (var12 != 2) {
                          break L2;
                        } else {
                          ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                          r.a(127);
                          return;
                        }
                      } else {
                        ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                        r.a(127);
                        return;
                      }
                    } else {
                      ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                      r.a(127);
                      return;
                    }
                  }
                }
              } else {
                L6: {
                  L7: {
                    var11 = ((pc) this).field_m.field_x;
                    var12 = ((pc) this).field_f;
                    if (-1 == (var12 ^ -1)) {
                      break L7;
                    } else {
                      if (-4 != (var12 ^ -1)) {
                        if (var12 != 1) {
                          if (var12 != 2) {
                            break L6;
                          } else {
                            ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1) - -var9, this.a((byte) 72, param1, param5, param6) + var11, param3, param7);
                            break L6;
                          }
                        } else {
                          ((pc) this).field_m.c(((pc) this).c((byte) 65, param1), (var9 >> 438785953) + this.a(param4, param2, 2, param1), this.a((byte) 113, param1, param5, param6) - -var11, param3, param7);
                          break L6;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  ((pc) this).field_m.b(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), var11 + this.a((byte) 88, param1, param5, param6), param3, param7);
                  break L6;
                }
                r.a(127);
                return;
              }
            } else {
              int discarded$3 = ((pc) this).field_m.a(((pc) this).c((byte) 65, param1), this.a(param4, param2, 2, param1), this.a((byte) 78, param1, param5, param6), var9, var10, param3, param7, ((pc) this).field_f, ((pc) this).field_g, ((pc) this).field_a);
              break L2;
            }
          }
          r.a(127);
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_n = null;
        if (param0 != 4252) {
            return;
        }
        field_d = null;
    }

    pc(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    final static void b(boolean param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (jl.field_W == null) {
                break L0;
              } else {
                try {
                  L1: {
                    jl.field_W.a(false, 0L);
                    jl.field_W.a(-1, 24, kj.field_d.field_n, kj.field_d.field_j);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  L3: {
                    kj.field_d.field_n = kj.field_d.field_n + 24;
                    if (!param0) {
                      break L3;
                    } else {
                      field_n = null;
                      break L3;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
            kj.field_d.field_n = kj.field_d.field_n + 24;
            if (param0) {
              field_n = null;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, int param1, int param2, gm param3) {
        if (param2 != 2) {
          return 11;
        } else {
          return param3.field_j + ((pc) this).field_k + (param3.field_w + (param1 - -param0));
        }
    }

    public final int a(boolean param0) {
        if (param0) {
          field_i = null;
          return ((pc) this).field_m.field_t + ((pc) this).field_m.field_x;
        } else {
          return ((pc) this).field_m.field_t + ((pc) this).field_m.field_x;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, gm param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        kp var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        uj var17 = null;
        uj var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = Torquing.field_u;
        if (param2 != param1) {
          if (param3 != -1419356520) {
            return;
          } else {
            L0: {
              if (param5.g(2)) {
                L1: {
                  var17 = ((pc) this).b((byte) 99, param5);
                  var18 = var17;
                  if (param1 <= param2) {
                    var8 = param1;
                    var9 = param2;
                    break L1;
                  } else {
                    var9 = param1;
                    var8 = param2;
                    break L1;
                  }
                }
                var10 = var18.b(var8, (byte) 110);
                var11 = var18.b(var9, (byte) 110);
                ld.a(param5.field_p + (param5.field_w + param0), param5.field_w + param0, param5.field_o + param5.field_k + param4, param4 - -param5.field_k, (byte) -97);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    r.a(127);
                    break L0;
                  } else {
                    L3: {
                      var13 = var17.field_c[var12];
                      if (var12 == var10) {
                        stackOut_12_0 = var18.a(var8, (byte) -120);
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = var13.field_b[0];
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_13_0;
                      if (var12 == var11) {
                        stackOut_17_0 = var18.a(var9, (byte) -114);
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        if (var13 != null) {
                          stackOut_16_0 = var13.field_b[-1 + var13.field_b.length];
                          stackIn_18_0 = stackOut_16_0;
                          break L4;
                        } else {
                          stackOut_15_0 = 0;
                          stackIn_18_0 = stackOut_15_0;
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_18_0;
                    ah.field_c.a(param3 + 1436133735, -var14 + var15, var13.field_a, this.a(var14, param0, param3 ^ -1419356518, param5), ((pc) this).field_b >>> -1419356520, var13.field_c + param5.field_v + (((pc) this).field_p + param5.field_k) + param4, ((pc) this).field_b);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public final int a(gm param0, int param1) {
        uj discarded$7 = ((pc) this).b((byte) 100, param0);
        if (param1 != 2) {
          ((pc) this).field_k = -37;
          return param0.field_u.b(false) + ((pc) this).field_p - -((pc) this).field_o;
        } else {
          return param0.field_u.b(false) + ((pc) this).field_p - -((pc) this).field_o;
        }
    }

    public void a(int param0, int param1, int param2, boolean param3, gm param4) {
        if (param0 < 89) {
            int discarded$8 = ((pc) this).a(false);
            if (!(((pc) this).field_m != null)) {
                return;
            }
            this.a(param4, param2, param1, -546);
            return;
        }
        if (!(((pc) this).field_m != null)) {
            return;
        }
        this.a(param4, param2, param1, -546);
    }

    private final int a(byte param0, gm param1, int param2, int param3) {
        int var5 = 58 % ((param0 - 36) / 35);
        return ((pc) this).field_p + (param2 - (-param1.field_k - (param1.field_v - -param3)));
    }

    public final int a(int param0, int param1, gm param2) {
        if (param0 != 2) {
          ((pc) this).field_k = -100;
          return this.a(0, param1, 2, param2);
        } else {
          return this.a(0, param1, 2, param2);
        }
    }

    public final int a(int param0, int param1, gm param2, int param3, int param4, int param5) {
        uj discarded$7 = ((pc) this).b((byte) 97, param2);
        if (param1 != -1) {
          ((pc) this).field_l = true;
          return param2.field_u.a(param0 + -((pc) this).a(param2, param4, 115), (byte) -83, param3 + -((pc) this).a(2, param5, param2));
        } else {
          return param2.field_u.a(param0 + -((pc) this).a(param2, param4, 115), (byte) -83, param3 + -((pc) this).a(2, param5, param2));
        }
    }

    protected pc() {
    }

    private final void a(boolean param0, gm param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        if (null == param1.field_u) {
          param1.field_u = (uj) (Object) new cm();
          var3 = ((pc) this).b(param1, -1);
          var4 = this.c(param1, 8557);
          var6 = ((pc) this).field_g;
          if (var6 == 0) {
            var5 = ((pc) this).field_m.field_x;
            if (!param0) {
              var6 = ((pc) this).field_f;
              if (-1 != (var6 ^ -1)) {
                if (-4 != (var6 ^ -1)) {
                  if (1 != var6) {
                    if (2 == var6) {
                      if (!(param1.field_u instanceof cm)) {
                        return;
                      } else {
                        ((cm) (Object) param1.field_u).a(var5, -22746, ((pc) this).field_m, ((pc) this).c((byte) 65, param1), var3);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param1.field_u instanceof cm) {
                      ((cm) (Object) param1.field_u).a(var3 >> -682572543, 0, ((pc) this).field_m, var5, ((pc) this).c((byte) 65, param1));
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param1.field_u instanceof cm) {
                    ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param1.field_u instanceof cm) {
                  ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                  return;
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            if ((var6 ^ -1) == -3) {
              var5 = -((pc) this).field_m.field_t + var4;
              if (!param0) {
                var6 = ((pc) this).field_f;
                if (-1 != (var6 ^ -1)) {
                  if (-4 != (var6 ^ -1)) {
                    if (1 != var6) {
                      if (2 == var6) {
                        if (!(param1.field_u instanceof cm)) {
                          return;
                        } else {
                          ((cm) (Object) param1.field_u).a(var5, -22746, ((pc) this).field_m, ((pc) this).c((byte) 65, param1), var3);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (param1.field_u instanceof cm) {
                        ((cm) (Object) param1.field_u).a(var3 >> -682572543, 0, ((pc) this).field_m, var5, ((pc) this).c((byte) 65, param1));
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1.field_u instanceof cm) {
                      ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param1.field_u instanceof cm) {
                    ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (-4 != (var6 ^ -1)) {
                if (var6 == 1) {
                  var5 = (-((pc) this).field_m.field_t + var4 - ((pc) this).field_m.field_x >> -426569503) + ((pc) this).field_m.field_x;
                  if (!param0) {
                    var6 = ((pc) this).field_f;
                    if (-1 != (var6 ^ -1)) {
                      if (-4 != (var6 ^ -1)) {
                        if (1 != var6) {
                          if (2 == var6) {
                            if (!(param1.field_u instanceof cm)) {
                              return;
                            } else {
                              ((cm) (Object) param1.field_u).a(var5, -22746, ((pc) this).field_m, ((pc) this).c((byte) 65, param1), var3);
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          if (param1.field_u instanceof cm) {
                            ((cm) (Object) param1.field_u).a(var3 >> -682572543, 0, ((pc) this).field_m, var5, ((pc) this).c((byte) 65, param1));
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (param1.field_u instanceof cm) {
                          ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1.field_u instanceof cm) {
                        ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  var5 = (-((pc) this).field_m.field_t + var4 - ((pc) this).field_m.field_x >> -426569503) + ((pc) this).field_m.field_x;
                  if (!param0) {
                    var6 = ((pc) this).field_f;
                    if (-1 != (var6 ^ -1)) {
                      if (-4 != (var6 ^ -1)) {
                        if (1 != var6) {
                          if (2 == var6) {
                            if (!(param1.field_u instanceof cm)) {
                              return;
                            } else {
                              ((cm) (Object) param1.field_u).a(var5, -22746, ((pc) this).field_m, ((pc) this).c((byte) 65, param1), var3);
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          if (param1.field_u instanceof cm) {
                            ((cm) (Object) param1.field_u).a(var3 >> -682572543, 0, ((pc) this).field_m, var5, ((pc) this).c((byte) 65, param1));
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (param1.field_u instanceof cm) {
                          ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1.field_u instanceof cm) {
                        ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var5 = (-((pc) this).field_m.field_t + var4 - ((pc) this).field_m.field_x >> -426569503) + ((pc) this).field_m.field_x;
                if (!param0) {
                  var6 = ((pc) this).field_f;
                  if (-1 != (var6 ^ -1)) {
                    if (-4 != (var6 ^ -1)) {
                      if (1 != var6) {
                        if (2 == var6) {
                          if (!(param1.field_u instanceof cm)) {
                            return;
                          } else {
                            ((cm) (Object) param1.field_u).a(var5, -22746, ((pc) this).field_m, ((pc) this).c((byte) 65, param1), var3);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (param1.field_u instanceof cm) {
                          ((cm) (Object) param1.field_u).a(var3 >> -682572543, 0, ((pc) this).field_m, var5, ((pc) this).c((byte) 65, param1));
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1.field_u instanceof cm) {
                        ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1.field_u instanceof cm) {
                      ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          L0: {
            var3 = ((pc) this).b(param1, -1);
            var4 = this.c(param1, 8557);
            var6 = ((pc) this).field_g;
            if (var6 == 0) {
              var5 = ((pc) this).field_m.field_x;
              break L0;
            } else {
              if ((var6 ^ -1) == -3) {
                var5 = -((pc) this).field_m.field_t + var4;
                break L0;
              } else {
                L1: {
                  if (-4 == (var6 ^ -1)) {
                    break L1;
                  } else {
                    if (var6 == 1) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                var5 = (-((pc) this).field_m.field_t + var4 - ((pc) this).field_m.field_x >> -426569503) + ((pc) this).field_m.field_x;
                break L0;
              }
            }
          }
          if (!param0) {
            L2: {
              var6 = ((pc) this).field_f;
              if (-1 != (var6 ^ -1)) {
                if (-4 != (var6 ^ -1)) {
                  if (1 != var6) {
                    if (2 == var6) {
                      if (!(param1.field_u instanceof cm)) {
                        return;
                      } else {
                        ((cm) (Object) param1.field_u).a(var5, -22746, ((pc) this).field_m, ((pc) this).c((byte) 65, param1), var3);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param1.field_u instanceof cm) {
                      ((cm) (Object) param1.field_u).a(var3 >> -682572543, 0, ((pc) this).field_m, var5, ((pc) this).c((byte) 65, param1));
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            if (param1.field_u instanceof cm) {
              ((cm) (Object) param1.field_u).a(((pc) this).c((byte) 65, param1), (byte) -123, ((pc) this).field_m, var5, 0);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    pc(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((pc) this).field_a = param9;
        ((pc) this).field_o = param4;
        ((pc) this).field_k = param1;
        ((pc) this).field_m = param0;
        ((pc) this).field_h = param5;
        ((pc) this).field_b = param11;
        ((pc) this).field_p = param3;
        ((pc) this).field_l = param12 ? true : false;
        ((pc) this).field_c = param6;
        ((pc) this).field_e = param2;
        ((pc) this).field_g = param8;
        ((pc) this).field_f = param7;
        ((pc) this).field_j = param10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "World <%0> complete!";
        field_d = new int[8192];
        field_i = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
