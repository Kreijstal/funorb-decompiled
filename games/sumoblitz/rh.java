/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends hj {
    static int field_p;
    static ri[] field_q;
    jn field_t;
    static int[] field_s;
    static boolean[] field_r;
    private bs field_u;
    al field_o;

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        uu var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        ((rh) this).field_o.b(param0, param1, param2);
        var6 = (uu) (Object) ((rh) this).field_t.b(-108);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((rh) this).field_u.b(73, var6)) {
                break L1;
              } else {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= var6.field_u) {
                    this.a(var6, param0, var4 - -var5, 119, var4, var5);
                    var6.field_u = var6.field_u - var5;
                    break L1;
                  } else {
                    this.a(var6, param0, var5 + var4, 78, var4, var6.field_u);
                    var5 = var5 - var6.field_u;
                    var4 = var4 + var6.field_u;
                    if (((rh) this).field_u.a(param0, var4, var5, var6, 0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (uu) (Object) ((rh) this).field_t.d((byte) 18);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(uu param0, int[] param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        Object var13 = null;
        mf var14 = null;
        mf var18 = null;
        bs stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        uu stackIn_13_2 = null;
        bs stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        uu stackIn_14_2 = null;
        bs stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uu stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        bs stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        uu stackIn_38_2 = null;
        bs stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        uu stackIn_39_2 = null;
        bs stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        uu stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        bs stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        uu stackOut_37_2 = null;
        bs stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        uu stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        bs stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        uu stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        bs stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        uu stackOut_12_2 = null;
        bs stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uu stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        bs stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        uu stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (param3 >= 54) {
          if ((4 & ((rh) this).field_u.field_J[param0.field_y]) != -1) {
            if (-1 > param0.field_x) {
              var7 = ((rh) this).field_u.field_x[param0.field_y] / du.field_k;
              L0: while (true) {
                var8 = (var7 + (1048575 - param0.field_t)) / var7;
                if (var8 <= param5) {
                  L1: {
                    param0.field_z.b(param1, param4, var8);
                    param4 = param4 + var8;
                    param0.field_t = param0.field_t + (-1048576 + var8 * var7);
                    param5 = param5 - var8;
                    var9 = du.field_k / 100;
                    var10 = 262144 / var7;
                    if (var10 >= var9) {
                      break L1;
                    } else {
                      var9 = var10;
                      break L1;
                    }
                  }
                  L2: {
                    var18 = param0.field_z;
                    if (-1 != (((rh) this).field_u.field_R[param0.field_y] ^ -1)) {
                      L3: {
                        param0.field_z = mf.a(param0.field_B, var18.e(), 0, var18.i());
                        stackOut_37_0 = ((rh) this).field_u;
                        stackOut_37_1 = 114;
                        stackOut_37_2 = (uu) param0;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        if (param0.field_A.field_k[param0.field_E] >= 0) {
                          stackOut_39_0 = (bs) (Object) stackIn_39_0;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = (uu) (Object) stackIn_39_2;
                          stackOut_39_3 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          break L3;
                        } else {
                          stackOut_38_0 = (bs) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = (uu) (Object) stackIn_38_2;
                          stackOut_38_3 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          break L3;
                        }
                      }
                      ((bs) (Object) stackIn_40_0).a((byte) stackIn_40_1, stackIn_40_2, stackIn_40_3 != 0);
                      param0.field_z.b(var9, var18.g());
                      break L2;
                    } else {
                      param0.field_z = mf.a(param0.field_B, var18.e(), var18.g(), var18.i());
                      break L2;
                    }
                  }
                  L4: {
                    if (-1 < (param0.field_A.field_k[param0.field_E] ^ -1)) {
                      param0.field_z.c(-1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var18.d(var9);
                  var18.b(param1, param4, -param4 + param2);
                  if (var18.k()) {
                    ((rh) this).field_o.b((hj) (Object) var18);
                    continue L0;
                  } else {
                    continue L0;
                  }
                } else {
                  param0.field_t = param0.field_t + var7 * param5;
                  param0.field_z.b(param1, param4, param5);
                  return;
                }
              }
            } else {
              param0.field_z.b(param1, param4, param5);
              return;
            }
          } else {
            param0.field_z.b(param1, param4, param5);
            return;
          }
        } else {
          var13 = null;
          this.a((uu) null, -15, 29);
          if ((4 & ((rh) this).field_u.field_J[param0.field_y]) != -1) {
            if (-1 > param0.field_x) {
              var7 = ((rh) this).field_u.field_x[param0.field_y] / du.field_k;
              L5: while (true) {
                var8 = (var7 + (1048575 - param0.field_t)) / var7;
                if (var8 <= param5) {
                  L6: {
                    param0.field_z.b(param1, param4, var8);
                    param4 = param4 + var8;
                    param0.field_t = param0.field_t + (-1048576 + var8 * var7);
                    param5 = param5 - var8;
                    var9 = du.field_k / 100;
                    var10 = 262144 / var7;
                    if (var10 >= var9) {
                      break L6;
                    } else {
                      var9 = var10;
                      break L6;
                    }
                  }
                  L7: {
                    var14 = param0.field_z;
                    if (-1 != (((rh) this).field_u.field_R[param0.field_y] ^ -1)) {
                      L8: {
                        param0.field_z = mf.a(param0.field_B, var14.e(), 0, var14.i());
                        stackOut_12_0 = ((rh) this).field_u;
                        stackOut_12_1 = 114;
                        stackOut_12_2 = (uu) param0;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        if (param0.field_A.field_k[param0.field_E] >= 0) {
                          stackOut_14_0 = (bs) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = (uu) (Object) stackIn_14_2;
                          stackOut_14_3 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          stackIn_15_3 = stackOut_14_3;
                          break L8;
                        } else {
                          stackOut_13_0 = (bs) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = (uu) (Object) stackIn_13_2;
                          stackOut_13_3 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          stackIn_15_3 = stackOut_13_3;
                          break L8;
                        }
                      }
                      ((bs) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                      param0.field_z.b(var9, var14.g());
                      break L7;
                    } else {
                      param0.field_z = mf.a(param0.field_B, var14.e(), var14.g(), var14.i());
                      break L7;
                    }
                  }
                  L9: {
                    if (-1 < (param0.field_A.field_k[param0.field_E] ^ -1)) {
                      param0.field_z.c(-1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var14.d(var9);
                  var14.b(param1, param4, -param4 + param2);
                  if (var14.k()) {
                    ((rh) this).field_o.b((hj) (Object) var14);
                    continue L5;
                  } else {
                    continue L5;
                  }
                } else {
                  param0.field_t = param0.field_t + var7 * param5;
                  param0.field_z.b(param1, param4, param5);
                  return;
                }
              }
            } else {
              param0.field_z.b(param1, param4, param5);
              return;
            }
          } else {
            param0.field_z.b(param1, param4, param5);
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        uu var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        ((rh) this).field_o.a(param0);
        var3 = (uu) (Object) ((rh) this).field_t.b(-103);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((rh) this).field_u.b(94, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_u) {
                    this.a(var3, var2, -23408);
                    var3.field_u = var3.field_u - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_u, -23408);
                    var2 = var2 - var3.field_u;
                    if (((rh) this).field_u.a((int[]) null, 0, var2, var3, 0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (uu) (Object) ((rh) this).field_t.d((byte) 18);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    final hj a() {
        uu var1 = null;
        var1 = (uu) (Object) ((rh) this).field_t.b(-127);
        if (var1 != null) {
          if (null != var1.field_z) {
            return (hj) (Object) var1.field_z;
          } else {
            return ((rh) this).c();
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 47) {
          rh.a((byte) 45);
          field_s = null;
          field_q = null;
          field_r = null;
          return;
        } else {
          field_s = null;
          field_q = null;
          field_r = null;
          return;
        }
    }

    private final void a(uu param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        bs stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        uu stackIn_13_2 = null;
        bs stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        uu stackIn_14_2 = null;
        bs stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uu stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        bs stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        uu stackOut_12_2 = null;
        bs stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uu stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        bs stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        uu stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        if ((4 & ((rh) this).field_u.field_J[param0.field_y]) == 0) {
          param0.field_z.a(param1);
          if (param2 == -23408) {
            return;
          } else {
            var6 = null;
            this.a((uu) null, (int[]) null, 36, -113, -84, 67);
            return;
          }
        } else {
          if ((param0.field_x ^ -1) > -1) {
            var4 = ((rh) this).field_u.field_x[param0.field_y] / du.field_k;
            var5 = (var4 + 1048575 + -param0.field_t) / var4;
            param0.field_t = param1 * var4 + param0.field_t & 1048575;
            if (param1 >= var5) {
              if (-1 == (((rh) this).field_u.field_R[param0.field_y] ^ -1)) {
                L0: {
                  param0.field_z = mf.a(param0.field_B, param0.field_z.e(), param0.field_z.g(), param0.field_z.i());
                  if ((param0.field_A.field_k[param0.field_E] ^ -1) > -1) {
                    param0.field_z.c(-1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                param1 = param0.field_t / var4;
                param0.field_z.a(param1);
                if (param2 == -23408) {
                  return;
                } else {
                  var6 = null;
                  this.a((uu) null, (int[]) null, 36, -113, -84, 67);
                  return;
                }
              } else {
                L1: {
                  param0.field_z = mf.a(param0.field_B, param0.field_z.e(), 0, param0.field_z.i());
                  stackOut_12_0 = ((rh) this).field_u;
                  stackOut_12_1 = -56;
                  stackOut_12_2 = (uu) param0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  if ((param0.field_A.field_k[param0.field_E] ^ -1) <= -1) {
                    stackOut_14_0 = (bs) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = (uu) (Object) stackIn_14_2;
                    stackOut_14_3 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    break L1;
                  } else {
                    stackOut_13_0 = (bs) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (uu) (Object) stackIn_13_2;
                    stackOut_13_3 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    break L1;
                  }
                }
                L2: {
                  ((bs) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                  if ((param0.field_A.field_k[param0.field_E] ^ -1) > -1) {
                    param0.field_z.c(-1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param0.field_t / var4;
                param0.field_z.a(param1);
                if (param2 == -23408) {
                  return;
                } else {
                  var6 = null;
                  this.a((uu) null, (int[]) null, 36, -113, -84, 67);
                  return;
                }
              }
            } else {
              param0.field_z.a(param1);
              if (param2 == -23408) {
                return;
              } else {
                var6 = null;
                this.a((uu) null, (int[]) null, 36, -113, -84, 67);
                return;
              }
            }
          } else {
            param0.field_z.a(param1);
            if (param2 == -23408) {
              return;
            } else {
              var6 = null;
              this.a((uu) null, (int[]) null, 36, -113, -84, 67);
              return;
            }
          }
        }
    }

    final hj c() {
        uu var1 = null;
        int var2 = 0;
        var2 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          var1 = (uu) (Object) ((rh) this).field_t.d((byte) 18);
          if (var1 != null) {
            if (var1.field_z != null) {
              return (hj) (Object) var1.field_z;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    rh(bs param0) {
        ((rh) this).field_t = new jn();
        ((rh) this).field_o = new al();
        ((rh) this).field_u = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new boolean[]{true, false, false, false, true, false, true, false, true, false, false, false, true, false, false, false, true, false, true, false, true, false, false, false, true};
        field_s = new int[13];
    }
}
