/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oj extends tc {
    static int field_k;
    static String field_p;
    static String field_u;
    static at field_r;
    static int[] field_n;
    boolean field_o;
    static int field_v;
    jd field_w;
    static String field_x;
    static int[] field_t;
    int field_m;
    static int[] field_q;
    int field_s;
    static String field_l;

    abstract void a(ha param0, int param1);

    final void a(int param0) {
        ((oj) this).field_o = false;
        if (param0 >= -30) {
            return;
        }
    }

    private final boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 1023) {
            break L0;
          } else {
            var4 = null;
            pu discarded$1 = oj.a(-38, (bv) null);
            break L0;
          }
        }
        var2 = ((oj) this).field_m;
        if (0 != var2) {
          L1: {
            L2: {
              if (-2 != (var2 ^ -1)) {
                if (var2 == -3) {
                  break L2;
                } else {
                  if (-24 != var2) {
                    L3: {
                      if (var2 == 3) {
                        break L3;
                      } else {
                        if (4 != var2) {
                          if (5 == var2) {
                            break L3;
                          } else {
                            if (6 == var2) {
                              return true;
                            } else {
                              if (var2 == 21) {
                                return true;
                              } else {
                                if (var2 == 7) {
                                  return true;
                                } else {
                                  if (var2 == 8) {
                                    return true;
                                  } else {
                                    if (9 != var2) {
                                      if (10 != var2) {
                                        L4: {
                                          if (-12 != var2) {
                                            if (var2 == 12) {
                                              break L4;
                                            } else {
                                              if (13 == var2) {
                                                break L4;
                                              } else {
                                                if (-15 == var2) {
                                                  return true;
                                                } else {
                                                  if (var2 == 15) {
                                                    return true;
                                                  } else {
                                                    if (var2 != 16) {
                                                      if (-18 != (var2 ^ -1)) {
                                                        if (var2 != -19) {
                                                          L5: {
                                                            if (var2 == 19) {
                                                              break L5;
                                                            } else {
                                                              if (-21 == var2) {
                                                                break L5;
                                                              } else {
                                                                if (22 == var2) {
                                                                  return true;
                                                                } else {
                                                                  if ((var2 ^ -1) != 0) {
                                                                    L6: {
                                                                      if (25 == var2) {
                                                                        break L6;
                                                                      } else {
                                                                        if (var2 == 24) {
                                                                          break L6;
                                                                        } else {
                                                                          if (27 == var2) {
                                                                            break L6;
                                                                          } else {
                                                                            stackOut_41_0 = 0;
                                                                            stackIn_43_0 = stackOut_41_0;
                                                                            break L1;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return true;
                                                                  } else {
                                                                    return false;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          return false;
                                                        } else {
                                                          return true;
                                                        }
                                                      } else {
                                                        return true;
                                                      }
                                                    } else {
                                                      return true;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L4;
                                          }
                                        }
                                        return true;
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_42_0 = 1;
            stackIn_43_0 = stackOut_42_0;
            break L1;
          }
          return stackIn_43_0 != 0;
        } else {
          return true;
        }
    }

    abstract String a(byte param0, boolean param1);

    final boolean a(byte param0, ic param1, at param2, boolean param3) {
        if (param0 != -39) {
            return false;
        }
        vb var5 = cp.a(param1, 10120, param1.field_xb, this.e(1023) & param3, (oj) this, param1.field_gb);
        if (!(var5 == null)) {
            param2.a((byte) -119, (tc) (Object) var5);
        }
        if (var5 == null) {
            return false;
        }
        return var5.field_w;
    }

    final void c(byte param0) {
        ((oj) this).field_s = ((oj) this).field_s - 1;
        if (!(((oj) this).field_s <= 0)) {
            return;
        }
        ((oj) this).field_o = true;
        if (!(null == ((oj) this).field_w)) {
            if (((oj) this).field_m != 19) {
                ((oj) this).field_w.field_u = false;
                ((oj) this).field_w.field_z = 0;
            }
        }
        if (param0 > -46) {
            ((oj) this).c((byte) -28);
        }
    }

    final void a(jd param0, int param1) {
        if (param1 != 12) {
            Object var4 = null;
            ((oj) this).a((jd) null, -102);
        }
        param0.field_u = true;
    }

    public static void a(byte param0) {
        field_r = null;
        field_t = null;
        field_u = null;
        field_q = null;
        field_x = null;
        if (param0 != -103) {
            return;
        }
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final boolean a(int param0, int param1, ic param2, at param3, int param4) {
        vb var6 = ub.a((oj) this, param2.field_xb, this.e(param1 + 1008), param0, param2, 17, param4, param2.field_gb);
        if (var6 != null) {
            param3.a((byte) -119, (tc) (Object) var6);
        }
        if (param1 != 15) {
            return true;
        }
        if (var6 == null) {
            return false;
        }
        return var6.field_w;
    }

    abstract boolean a(at param0, byte param1, ic param2);

    final static pu a(int param0, bv param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pu var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param1.g(-113, 8);
        if (var2 <= 0) {
          L0: {
            var3 = vq.a(param1, -2) ? 1 : 0;
            var5 = 1 / ((param0 - 61) / 50);
            var4 = vq.a(param1, -2) ? 1 : 0;
            var6 = new pu();
            var6.field_O = (short)param1.g(61, 16);
            var6.field_z = to.a(var6.field_z, 16, param1, 10064);
            var6.field_y = to.a(var6.field_y, 16, param1, 10064);
            var6.field_o = to.a(var6.field_o, 16, param1, 10064);
            var6.field_q = (short)param1.g(107, 16);
            var6.field_c = to.a(var6.field_c, 16, param1, 10064);
            var6.field_j = to.a(var6.field_j, 16, param1, 10064);
            var6.field_e = to.a(var6.field_e, 16, param1, 10064);
            if (var3 != 0) {
              var6.field_t = (short)param1.g(-100, 16);
              var6.field_l = to.a(var6.field_l, 16, param1, 10064);
              var6.field_f = to.a(var6.field_f, 16, param1, 10064);
              var6.field_x = to.a(var6.field_x, 16, param1, 10064);
              var6.field_w = to.a(var6.field_w, 16, param1, 10064);
              var6.field_Q = to.a(var6.field_Q, 16, param1, 10064);
              var6.field_d = to.a(var6.field_d, 16, param1, 10064);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              int discarded$1 = param1.g(-102, 16);
              var6.field_r = to.a(var6.field_r, 16, param1, 10064);
              var6.field_s = to.a(var6.field_s, 16, param1, 10064);
              var6.field_A = to.a(var6.field_A, 16, param1, 10064);
              var6.field_i = to.a(var6.field_i, 16, param1, 10064);
              var6.field_b = to.a(var6.field_b, 16, param1, 10064);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (vq.a(param1, -2)) {
              var6.field_u = to.a(var6.field_u, 16, param1, 10064);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (vq.a(param1, -2)) {
              var6.field_K = kd.a(16, param1, var6.field_K, (byte) -122);
              var7 = 0;
              var8 = 0;
              L4: while (true) {
                if (var8 >= var6.field_K.length) {
                  if (-1 == (var7 ^ -1)) {
                    var6.field_K = null;
                    break L3;
                  } else {
                    var6.field_E = (byte)(1 + var7);
                    break L3;
                  }
                } else {
                  if ((var6.field_K[var8] & 255) > var7) {
                    var7 = var6.field_K[var8] & 255;
                    var8++;
                    continue L4;
                  } else {
                    var8++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return var6;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final void f(int param0) {
        if (!(((oj) this).field_w == null)) {
            ((oj) this).field_w.field_u = false;
            ((oj) this).field_w.field_z = 0;
        }
        if (param0 != 6) {
            oj.a((byte) 88);
        }
        ((oj) this).field_s = 0;
        ((oj) this).field_o = true;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var15 = null;
        int[] var14 = null;
        int[] var13 = null;
        int[] var12 = null;
        int var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((param3 ^ -1) <= -1)) {
            return;
        }
        if (!param1) {
            field_r = null;
        }
        param4 += 23;
        for (var5 = -72; (var5 ^ -1) > -1; var5++) {
            var6 = var5;
            var7 = var5;
            if ((var6 ^ -1) <= -1) {
                var6 = -(var6 << 721571140) + 256;
            } else {
                var6 = (var6 << -1908004511) + 256;
            }
            var7 = var7 >> 5;
            var8 = (122 ^ var6) >> -1611392925;
            var9 = 15 & var6 >> -1098159452;
            var15 = 0 != (param3 ^ -1) ? dr.field_v[param3] : dr.field_z;
            var14 = var15;
            var13 = var14;
            var12 = var13;
            int[] var10 = var12;
            qn.a((-6 + param4 << 1623397028) - -(var7 * ae.b(param2 + var5 << 505417124, 100) >> -976080308), -4 + (param0 + var5) << -1079564700, var8 << -290760700, var9, var15);
        }
    }

    protected oj() {
        ((oj) this).field_s = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Restart Level";
        field_p = "Allow spectators?";
        field_v = 0;
        field_t = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 50, 9};
        field_x = "Quick Chat Help";
        field_k = 4;
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_q = new int[56];
        field_r = new at();
        field_l = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
