/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ej {
    static boolean field_l;
    static int field_p;
    private mf field_n;
    static int field_q;
    nc field_m;
    static da field_o;
    e field_r;
    static int field_s;

    final ej a() {
        hg var1 = (hg) (Object) ((lh) this).field_m.a((byte) 51);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (ej) (Object) var1.field_w;
        }
        return ((lh) this).b();
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = 42 % ((param1 - 47) / 54);
        var3 = param0.charAt(0);
        var4 = 1;
        L0: while (true) {
          if (param0.length() > var4) {
            if (var3 == param0.charAt(var4)) {
              var4++;
              continue L0;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        hg var6 = null;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        ((lh) this).field_r.a(param0, param1, param2);
        var6 = (hg) (Object) ((lh) this).field_m.a((byte) 51);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (!((lh) this).field_n.b(var6, -1642423728)) {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= var6.field_t) {
                    this.a(param0, var5 + var4, var6, var4, var5, (byte) -117);
                    var6.field_t = var6.field_t - var5;
                    break L1;
                  } else {
                    this.a(param0, var5 + var4, var6, var4, var6.field_t, (byte) -117);
                    var5 = var5 - var6.field_t;
                    var4 = var4 + var6.field_t;
                    if (!((lh) this).field_n.a(var4, param0, var5, 100, var6)) {
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
            var6 = (hg) (Object) ((lh) this).field_m.b(-51);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    public static void d(int param0) {
        if (param0 > -67) {
            return;
        }
        field_o = null;
    }

    private final void a(byte param0, hg param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        mf stackIn_13_0 = null;
        hg stackIn_13_1 = null;
        mf stackIn_14_0 = null;
        hg stackIn_14_1 = null;
        mf stackIn_15_0 = null;
        hg stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        mf stackOut_12_0 = null;
        hg stackOut_12_1 = null;
        mf stackOut_14_0 = null;
        hg stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        mf stackOut_13_0 = null;
        hg stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        if (0 == (((lh) this).field_n.field_U[param1.field_z] & 4)) {
          param1.field_w.a(param2);
          if (param0 < -43) {
            return;
          } else {
            field_q = 96;
            return;
          }
        } else {
          if (param1.field_k < 0) {
            var4 = ((lh) this).field_n.field_J[param1.field_z] / gj.field_s;
            var5 = (-param1.field_C + var4 + 1048575) / var4;
            param1.field_C = var4 * param2 + param1.field_C & 1048575;
            if (param2 >= var5) {
              if (((lh) this).field_n.field_z[param1.field_z] == 0) {
                param1.field_w = qi.a(param1.field_u, param1.field_w.j(), param1.field_w.e(), param1.field_w.f());
                if ((param1.field_p.field_s[param1.field_o] ^ -1) > -1) {
                  param1.field_w.d(-1);
                  param2 = param1.field_C / var4;
                  param1.field_w.a(param2);
                  if (param0 < -43) {
                    return;
                  } else {
                    field_q = 96;
                    return;
                  }
                } else {
                  param2 = param1.field_C / var4;
                  param1.field_w.a(param2);
                  if (param0 < -43) {
                    return;
                  } else {
                    field_q = 96;
                    return;
                  }
                }
              } else {
                L0: {
                  param1.field_w = qi.a(param1.field_u, param1.field_w.j(), 0, param1.field_w.f());
                  stackOut_12_0 = ((lh) this).field_n;
                  stackOut_12_1 = (hg) param1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if ((param1.field_p.field_s[param1.field_o] ^ -1) <= -1) {
                    stackOut_14_0 = (mf) (Object) stackIn_14_0;
                    stackOut_14_1 = (hg) (Object) stackIn_14_1;
                    stackOut_14_2 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L0;
                  } else {
                    stackOut_13_0 = (mf) (Object) stackIn_13_0;
                    stackOut_13_1 = (hg) (Object) stackIn_13_1;
                    stackOut_13_2 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L0;
                  }
                }
                ((mf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0, false);
                if ((param1.field_p.field_s[param1.field_o] ^ -1) > -1) {
                  param1.field_w.d(-1);
                  param2 = param1.field_C / var4;
                  param1.field_w.a(param2);
                  if (param0 < -43) {
                    return;
                  } else {
                    field_q = 96;
                    return;
                  }
                } else {
                  param2 = param1.field_C / var4;
                  param1.field_w.a(param2);
                  if (param0 < -43) {
                    return;
                  } else {
                    field_q = 96;
                    return;
                  }
                }
              }
            } else {
              param1.field_w.a(param2);
              if (param0 < -43) {
                return;
              } else {
                field_q = 96;
                return;
              }
            }
          } else {
            param1.field_w.a(param2);
            if (param0 < -43) {
              return;
            } else {
              field_q = 96;
              return;
            }
          }
        }
    }

    private final void a(int[] param0, int param1, hg param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        qi var11 = null;
        int var12 = 0;
        mf stackIn_18_0 = null;
        hg stackIn_18_1 = null;
        mf stackIn_19_0 = null;
        hg stackIn_19_1 = null;
        mf stackIn_20_0 = null;
        hg stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        mf stackOut_17_0 = null;
        hg stackOut_17_1 = null;
        mf stackOut_19_0 = null;
        hg stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        mf stackOut_18_0 = null;
        hg stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        var12 = SolKnight.field_L ? 1 : 0;
        if ((4 & ((lh) this).field_n.field_U[param2.field_z]) != 0) {
          if (0 > param2.field_k) {
            var7 = ((lh) this).field_n.field_J[param2.field_z] / gj.field_s;
            L0: while (true) {
              var8 = (1048575 + (var7 + -param2.field_C)) / var7;
              if (param4 >= var8) {
                L1: {
                  param2.field_w.a(param0, param3, var8);
                  param3 = param3 + var8;
                  param4 = param4 - var8;
                  param2.field_C = param2.field_C + (var8 * var7 + -1048576);
                  var9 = gj.field_s / 100;
                  var10 = 262144 / var7;
                  if (var10 >= var9) {
                    break L1;
                  } else {
                    var9 = var10;
                    break L1;
                  }
                }
                L2: {
                  var11 = param2.field_w;
                  if (0 != ((lh) this).field_n.field_z[param2.field_z]) {
                    L3: {
                      param2.field_w = qi.a(param2.field_u, var11.j(), 0, var11.f());
                      stackOut_17_0 = ((lh) this).field_n;
                      stackOut_17_1 = (hg) param2;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if ((param2.field_p.field_s[param2.field_o] ^ -1) <= -1) {
                        stackOut_19_0 = (mf) (Object) stackIn_19_0;
                        stackOut_19_1 = (hg) (Object) stackIn_19_1;
                        stackOut_19_2 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L3;
                      } else {
                        stackOut_18_0 = (mf) (Object) stackIn_18_0;
                        stackOut_18_1 = (hg) (Object) stackIn_18_1;
                        stackOut_18_2 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L3;
                      }
                    }
                    ((mf) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2 != 0, false);
                    param2.field_w.e(var9, var11.e());
                    break L2;
                  } else {
                    param2.field_w = qi.a(param2.field_u, var11.j(), var11.e(), var11.f());
                    break L2;
                  }
                }
                L4: {
                  if (-1 >= (param2.field_p.field_s[param2.field_o] ^ -1)) {
                    break L4;
                  } else {
                    param2.field_w.d(-1);
                    break L4;
                  }
                }
                var11.e(var9);
                var11.a(param0, param3, -param3 + param1);
                if (!var11.h()) {
                  continue L0;
                } else {
                  ((lh) this).field_r.a((ej) (Object) var11);
                  continue L0;
                }
              } else {
                param2.field_C = param2.field_C + var7 * param4;
                param2.field_w.a(param0, param3, param4);
                if (param5 == -117) {
                  return;
                } else {
                  ((lh) this).field_m = null;
                  return;
                }
              }
            }
          } else {
            param2.field_w.a(param0, param3, param4);
            if (param5 == -117) {
              return;
            } else {
              ((lh) this).field_m = null;
              return;
            }
          }
        } else {
          param2.field_w.a(param0, param3, param4);
          if (param5 == -117) {
            return;
          } else {
            ((lh) this).field_m = null;
            return;
          }
        }
    }

    final ej b() {
        hg var1 = null;
        int var2 = 0;
        var2 = SolKnight.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (hg) (Object) ((lh) this).field_m.b(-60);
          if (var1 != null) {
            if (var1.field_w != null) {
              return (ej) (Object) var1.field_w;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        hg var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        ((lh) this).field_r.a(param0);
        var3 = (hg) (Object) ((lh) this).field_m.a((byte) 51);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((lh) this).field_n.b(var3, -1642423728)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_t) {
                    this.a((byte) -107, var3, var2);
                    var3.field_t = var3.field_t - var2;
                    break L1;
                  } else {
                    this.a((byte) -126, var3, var3.field_t);
                    var2 = var2 - var3.field_t;
                    if (((lh) this).field_n.a(0, (int[]) null, var2, 100, var3)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (hg) (Object) ((lh) this).field_m.b(-126);
            continue L0;
          } else {
            return;
          }
        }
    }

    lh(mf param0) {
        ((lh) this).field_m = new nc();
        ((lh) this).field_r = new e();
        ((lh) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
    }
}
