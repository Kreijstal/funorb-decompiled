/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends hg {
    boolean field_h;
    ed field_i;
    static String field_q;
    int field_l;
    int field_k;
    int field_j;
    private int field_s;
    private int field_m;
    boolean field_p;
    boolean field_r;
    int field_g;
    private ed field_t;
    int field_o;
    int field_n;

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var4 = 100;
        var5 = ma.field_a.field_cb % var4;
        if (null == ((sa) this).field_i) {
          return;
        } else {
          L0: {
            var6 = ((sa) this).field_i.field_A;
            var7 = ((sa) this).field_i.field_z;
            var8 = var6 - -((var4 - var5) * 2 * var6 / var4);
            var9 = (-var5 + var4) * var7 * 2 / var4 + var7;
            if (!param0) {
              break L0;
            } else {
              this.a(false, -79, -121);
              break L0;
            }
          }
          L1: {
            var10 = var5 * 128 / var4;
            var11 = 16711680;
            var12 = ((sa) this).field_g + (-param2 - (var9 - var7) / 2);
            var13 = var9 + var12;
            var14 = 480;
            if (-1 < (var13 ^ -1)) {
              break L1;
            } else {
              if (var12 < var14) {
                L2: {
                  L3: {
                    var15 = -param1 + ((sa) this).field_k - (var8 - var6) / 2;
                    var16 = var8 + var15;
                    var17 = ma.field_a.field_n;
                    em.b(var15, var12, var8, var9, var11, var10);
                    if (-1 <= (var15 ^ -1)) {
                      break L3;
                    } else {
                      if (var17 > var16) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (0 >= var15) {
                      var15 = var15 + var17;
                      break L4;
                    } else {
                      var15 = var15 - var17;
                      break L4;
                    }
                  }
                  em.b(var15, var12, var8, var9, var11, var10);
                  break L2;
                }
                return;
              } else {
                break L1;
              }
            }
          }
          return;
        }
    }

    final static void d(byte param0) {
        if (param0 != 27) {
            sa.d((byte) -32);
        }
        je.field_a = new cn();
    }

    private final fn b(boolean param0) {
        rk[] var4 = w.c(false);
        var4 = var4;
        if (!param0) {
            return null;
        }
        if (var4 == null) {
            return null;
        }
        return var4[((sa) this).field_n].a((byte) 120, ((sa) this).field_l);
    }

    final static void a(int param0, int param1, boolean param2, ed[] param3, int param4, int param5, ed[] param6, int param7, int param8, wl param9, int param10, boolean param11) {
        di.a(param3, param8, param5, param10, param0, param5, param9, param1, param6, param11, param8, param4, param9, (byte) -41, param7);
        if (param2) {
            field_q = null;
        }
    }

    private final ed d(int param0) {
        if (param0 != 0) {
            sa.a(22, (byte) 101);
        }
        rk[] var4 = w.c(false);
        var4 = var4;
        if (var4 == null) {
            return null;
        }
        return var4[((sa) this).field_n].a(-125, ((sa) this).field_l);
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        this(param0, param1, param2, param3);
        ((sa) this).field_p = param5 ? true : false;
        ((sa) this).field_l = param6;
        ((sa) this).field_r = param4 ? true : false;
        this.e(-7012);
    }

    final void a(boolean param0, oe param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        if (((sa) this).field_i != null) {
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((sa) this).field_i.field_x <= var4) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((sa) this).field_j = -96;
                  break L1;
                }
              }
              return;
            } else {
              var5 = var4 + (((sa) this).field_g + ((sa) this).field_i.field_v);
              var6 = var5 >> -2029909435;
              var5 = var5 & 31;
              var7 = 0;
              L2: while (true) {
                if (var7 >= ((sa) this).field_i.field_s) {
                  var4++;
                  continue L0;
                } else {
                  var8 = var7 + (((sa) this).field_i.field_q + ((sa) this).field_k);
                  var9 = var8 >> 1052355877;
                  var8 = var8 & 31;
                  L3: while (true) {
                    if (-1 >= (var9 ^ -1)) {
                      var9 = var9 % param1.field_Mb;
                      if (((sa) this).field_i.field_B[var3] != 0) {
                        var10 = param1.field_V[var9 + param1.field_Mb * var6];
                        if (si.field_v != var10) {
                          L4: {
                            if (var10 == null) {
                              var10 = new int[32];
                              param1.field_V[var9 + var6 * param1.field_Mb] = new int[32];
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var10[var5] = lb.a(var10[var5], 1 << var8);
                          var3++;
                          var7++;
                          continue L2;
                        } else {
                          var3++;
                          var7++;
                          continue L2;
                        }
                      } else {
                        var3++;
                        var7++;
                        continue L2;
                      }
                    } else {
                      var9 = var9 + param1.field_Mb;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        ed var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = EscapeVector.field_A;
        if (((sa) this).field_i == null) {
          return;
        } else {
          L0: {
            var4 = null;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            if (!((sa) this).field_h) {
              break L0;
            } else {
              var9 = this.a((byte) 54);
              if (var9 <= 0) {
                break L0;
              } else {
                L1: {
                  var5 = ((sa) this).field_s;
                  var4 = ((sa) this).field_t;
                  var6 = ((sa) this).field_m;
                  if ((var5 ^ -1) <= -1) {
                    break L1;
                  } else {
                    var7 = -var5;
                    break L1;
                  }
                }
                if ((var6 ^ -1) > -1) {
                  var8 = -var6;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var10 = ((sa) this).field_g + -param0;
            if (var10 >= 480 + var8) {
              break L2;
            } else {
              if (var10 <= -((sa) this).field_i.field_z) {
                break L2;
              } else {
                var11 = -param2 + (((sa) this).field_k + ma.field_a.field_n + ma.field_a.field_n) - var7;
                var12 = ((sa) this).field_i.field_A + var7 - -var7;
                var11 = var11 + var12;
                var11 = var11 % ma.field_a.field_n;
                var11 = var11 - var12;
                L3: while (true) {
                  if (var11 >= 640) {
                    L4: {
                      if (param1 > 106) {
                        break L4;
                      } else {
                        this.a(false, -48, -24);
                        break L4;
                      }
                    }
                    L5: {
                      if (!((sa) this).field_r) {
                        break L5;
                      } else {
                        this.a(false, param2, param0);
                        break L5;
                      }
                    }
                    return;
                  } else {
                    L6: {
                      if (var4 == null) {
                        ((sa) this).field_i.e(var11, var10);
                        break L6;
                      } else {
                        ((sa) this).field_i.e(var11 + var7, var10);
                        var4.c(var5 + var11 - -var7, var10 - -var6, this.a((byte) 122));
                        break L6;
                      }
                    }
                    var11 = var11 + ma.field_a.field_n;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final int a(byte param0) {
        double var2_double = 0.0;
        double var4 = 0.0;
        if (param0 < 36) {
            field_q = null;
        }
        if ((((sa) this).field_n ^ -1) != -3) {
            var2_double = (double)(ma.field_a.field_Zb / 8);
            if (!(!kg.a((byte) -98, ((sa) this).field_n))) {
                var2_double = (double)(ma.field_a.field_cb % 100) / 100.0;
            }
            var4 = Math.cos(3.141592653589793 * var2_double) + 2.0;
            return (int)(var4 * var4 * 28.0);
        }
        int var2 = -42 + ((sa) this).field_o;
        if (!(var2 > 0)) {
            return 0;
        }
        return 16 * var2;
    }

    private final void e(int param0) {
        ((sa) this).field_i = k.a(((sa) this).field_l, (byte) -39, ((sa) this).field_n);
        ((sa) this).field_t = this.d(0);
        fn var2 = this.b(true);
        if (param0 != -7012) {
            return;
        }
        if (var2 == null) {
            return;
        }
        ((sa) this).field_s = var2.field_c;
        ((sa) this).field_m = var2.field_b;
    }

    sa(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        this(param0, param1, param2, param3);
        ((sa) this).field_r = param4 ? true : false;
        ((sa) this).field_p = param5 ? true : false;
    }

    final static void a(int param0, byte param1) {
        tj var2 = null;
        String var3 = null;
        ed[] var4 = null;
        String[] var5 = null;
        tj var6 = null;
        if (!(!hi.a(param0, -2))) {
            var2 = new tj(ic.field_n, ae.field_c, qh.field_j, true);
            re.a(1820, var2);
        }
        if (param1 >= -69) {
            return;
        }
        if (!(-3 != (param0 ^ -1))) {
            var2 = (tj) (Object) "vengeance_intro";
            var3 = "scene";
            var4 = tm.field_cb;
            var5 = me.field_o;
            var6 = new tj((String) (Object) var2, var3, var4, var5, true);
            re.a(1820, var6);
        }
    }

    final boolean e(byte param0) {
        if (mf.a(((sa) this).field_n, -64)) {
            return false;
        }
        if (1 == ((sa) this).field_n) {
            return false;
        }
        if (!(5 != ((sa) this).field_n)) {
            return false;
        }
        if (!(((sa) this).field_n != 6)) {
            return false;
        }
        if (param0 != -5) {
            return false;
        }
        if (-8 != (((sa) this).field_n ^ -1)) {
            return true;
        }
        return false;
    }

    final void a(oe param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var12 = EscapeVector.field_A;
        if (((sa) this).field_i == null) {
          return;
        } else {
          L0: {
            var3 = 0;
            if (param1 >= 58) {
              break L0;
            } else {
              this.e(-105);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (((sa) this).field_i.field_x <= var4) {
              return;
            } else {
              var5 = var4 + ((sa) this).field_i.field_v + ((sa) this).field_g;
              var6 = var5 >> -80604379;
              var5 = var5 & 31;
              var7 = 0;
              L2: while (true) {
                if (var7 >= ((sa) this).field_i.field_s) {
                  var4++;
                  continue L1;
                } else {
                  var8 = var7 + (((sa) this).field_k - -((sa) this).field_i.field_q);
                  var9 = var8 >> -1524317179;
                  var8 = var8 & 31;
                  L3: while (true) {
                    if (0 <= var9) {
                      L4: {
                        var9 = var9 % param0.field_Mb;
                        if (null != ma.field_a.field_eb) {
                          ma.field_a.field_eb.a(var9, var6, true);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (0 != ((sa) this).field_i.field_B[var3]) {
                        var14 = param0.field_V[param0.field_Mb * var6 + var9];
                        var10 = var14;
                        if (var10 != null) {
                          if (si.field_v == var10) {
                            var13 = new int[32];
                            var15 = var13;
                            var10 = var15;
                            param0.field_V[param0.field_Mb * var6 - -var9] = new int[32];
                            var11 = 0;
                            L5: while (true) {
                              if (-33 >= (var11 ^ -1)) {
                                var10[var5] = ae.a(var15[var5], 1 << var8 ^ -1);
                                var3++;
                                var7++;
                                continue L2;
                              } else {
                                var13[var11] = -1;
                                var11++;
                                continue L5;
                              }
                            }
                          } else {
                            var10[var5] = ae.a(var14[var5], 1 << var8 ^ -1);
                            var3++;
                            var7++;
                            continue L2;
                          }
                        } else {
                          var3++;
                          var7++;
                          continue L2;
                        }
                      } else {
                        var3++;
                        var7++;
                        continue L2;
                      }
                    } else {
                      var9 = var9 + param0.field_Mb;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            sa.a(77, 13, true, (ed[]) null, -108, -59, (ed[]) null, -14, -30, (wl) null, -40, true);
        }
        field_q = null;
    }

    sa(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        L0: {
          L1: {
            ((sa) this).field_o = 0;
            ((sa) this).field_g = param3;
            ((sa) this).field_k = param2;
            ((sa) this).field_j = param0;
            ((sa) this).field_n = param1;
            stackOut_0_0 = this;
            stackIn_2_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if ((param1 ^ -1) == -3) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!kg.a((byte) -125, ((sa) this).field_n)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_2_0 = this;
          stackOut_2_1 = 1;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          break L0;
        }
        ((sa) this).field_h = stackIn_4_1 != 0;
        ((sa) this).field_p = false;
        ((sa) this).field_r = false;
        ((sa) this).field_l = 0;
        this.e(-7012);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Enter the cave, find the container,<br>and land next to it to attach your tether.";
    }
}
