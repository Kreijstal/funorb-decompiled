/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends sh {
    vc field_n;
    private ei field_p;
    static bi field_m;
    ke field_o;

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        tk var6 = null;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        ((gl) this).field_o.b(param0, param1, param2);
        var6 = (tk) (Object) ((gl) this).field_n.c((byte) 47);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (!((gl) this).field_p.a(var6, -1)) {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var6.field_u >= var5) {
                    this.a(var6, var5, param0, -21345, var4, var4 - -var5);
                    var6.field_u = var6.field_u - var5;
                    break L1;
                  } else {
                    this.a(var6, var6.field_u, param0, -21345, var4, var4 - -var5);
                    var4 = var4 + var6.field_u;
                    var5 = var5 - var6.field_u;
                    if (!((gl) this).field_p.a(var5, var4, -30686, var6, param0)) {
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
            var6 = (tk) (Object) ((gl) this).field_n.b((byte) -105);
            continue L0;
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 112) {
            Object var2 = null;
            boolean discarded$0 = gl.a((String) null, -95, (String) null);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final void a(int param0) {
        int var2 = 0;
        tk var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        ((gl) this).field_o.a(param0);
        var3 = (tk) (Object) ((gl) this).field_n.c((byte) 47);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((gl) this).field_p.a(var3, -1)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_u >= var2) {
                    this.a(var2, var3, 126);
                    var3.field_u = var3.field_u - var2;
                    break L1;
                  } else {
                    this.a(var3.field_u, var3, 126);
                    var2 = var2 - var3.field_u;
                    if (((gl) this).field_p.a(var2, 0, -30686, var3, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (tk) (Object) ((gl) this).field_n.b((byte) -105);
            continue L0;
          } else {
            return;
          }
        }
    }

    final sh c() {
        tk var1_ref = null;
        do {
            var1_ref = (tk) (Object) ((gl) this).field_n.b((byte) -105);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_k);
        return (sh) (Object) var1_ref.field_k;
    }

    private final void a(int param0, tk param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ei stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        tk stackIn_13_2 = null;
        ei stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        tk stackIn_14_2 = null;
        ei stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        tk stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        ei stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        tk stackOut_12_2 = null;
        ei stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        tk stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        ei stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        tk stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        if ((((gl) this).field_p.field_q[param1.field_o] & 4) == 0) {
          param1.field_k.a(param0);
          if (param2 >= 124) {
            return;
          } else {
            sh discarded$5 = ((gl) this).c();
            return;
          }
        } else {
          if (0 > param1.field_q) {
            var4 = ((gl) this).field_p.field_p[param1.field_o] / la.field_a;
            var5 = (1048575 - -var4 + -param1.field_x) / var4;
            param1.field_x = param1.field_x - -(param0 * var4) & 1048575;
            if (var5 <= param0) {
              if (((gl) this).field_p.field_n[param1.field_o] == 0) {
                L0: {
                  param1.field_k = ie.a(param1.field_z, param1.field_k.f(), param1.field_k.g(), param1.field_k.k());
                  if (0 > param1.field_D.field_l[param1.field_F]) {
                    param1.field_k.g(-1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                param0 = param1.field_x / var4;
                param1.field_k.a(param0);
                if (param2 >= 124) {
                  return;
                } else {
                  sh discarded$6 = ((gl) this).c();
                  return;
                }
              } else {
                L1: {
                  param1.field_k = ie.a(param1.field_z, param1.field_k.f(), 0, param1.field_k.k());
                  stackOut_12_0 = ((gl) this).field_p;
                  stackOut_12_1 = -32730;
                  stackOut_12_2 = (tk) param1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  if (0 <= param1.field_D.field_l[param1.field_F]) {
                    stackOut_14_0 = (ei) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = (tk) (Object) stackIn_14_2;
                    stackOut_14_3 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    break L1;
                  } else {
                    stackOut_13_0 = (ei) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (tk) (Object) stackIn_13_2;
                    stackOut_13_3 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    break L1;
                  }
                }
                L2: {
                  ((ei) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                  if (0 > param1.field_D.field_l[param1.field_F]) {
                    param1.field_k.g(-1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param0 = param1.field_x / var4;
                param1.field_k.a(param0);
                if (param2 >= 124) {
                  return;
                } else {
                  sh discarded$7 = ((gl) this).c();
                  return;
                }
              }
            } else {
              param1.field_k.a(param0);
              if (param2 >= 124) {
                return;
              } else {
                sh discarded$8 = ((gl) this).c();
                return;
              }
            }
          } else {
            param1.field_k.a(param0);
            if (param2 >= 124) {
              return;
            } else {
              sh discarded$9 = ((gl) this).c();
              return;
            }
          }
        }
    }

    private final void a(tk param0, int param1, int[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        ie var13 = null;
        ei stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        tk stackIn_14_2 = null;
        ei stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        tk stackIn_15_2 = null;
        ei stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        tk stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        ei stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        tk stackOut_13_2 = null;
        ei stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        tk stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        ei stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        tk stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        L0: {
          var12 = fleas.field_A ? 1 : 0;
          if (param3 == -21345) {
            break L0;
          } else {
            sh discarded$1 = ((gl) this).d();
            break L0;
          }
        }
        if ((((gl) this).field_p.field_q[param0.field_o] & 4) != 0) {
          if ((param0.field_q ^ -1) > -1) {
            var7 = ((gl) this).field_p.field_p[param0.field_o] / la.field_a;
            L1: while (true) {
              var8 = (-param0.field_x + 1048575 + var7) / var7;
              if (var8 > param1) {
                param0.field_x = param0.field_x + var7 * param1;
                param0.field_k.b(param2, param4, param1);
                return;
              } else {
                L2: {
                  param0.field_k.b(param2, param4, var8);
                  param4 = param4 + var8;
                  param1 = param1 - var8;
                  param0.field_x = param0.field_x + (-1048576 + var8 * var7);
                  var9 = la.field_a / 100;
                  var10 = 262144 / var7;
                  if (var9 > var10) {
                    var9 = var10;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var13 = param0.field_k;
                  if (-1 != (((gl) this).field_p.field_n[param0.field_o] ^ -1)) {
                    L4: {
                      param0.field_k = ie.a(param0.field_z, var13.f(), 0, var13.k());
                      stackOut_13_0 = ((gl) this).field_p;
                      stackOut_13_1 = -32730;
                      stackOut_13_2 = (tk) param0;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      stackIn_14_2 = stackOut_13_2;
                      if ((param0.field_D.field_l[param0.field_F] ^ -1) <= -1) {
                        stackOut_15_0 = (ei) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = (tk) (Object) stackIn_15_2;
                        stackOut_15_3 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        stackIn_16_3 = stackOut_15_3;
                        break L4;
                      } else {
                        stackOut_14_0 = (ei) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = (tk) (Object) stackIn_14_2;
                        stackOut_14_3 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        break L4;
                      }
                    }
                    ((ei) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0);
                    param0.field_k.d(var9, var13.g());
                    break L3;
                  } else {
                    param0.field_k = ie.a(param0.field_z, var13.f(), var13.g(), var13.k());
                    break L3;
                  }
                }
                L5: {
                  if ((param0.field_D.field_l[param0.field_F] ^ -1) <= -1) {
                    break L5;
                  } else {
                    param0.field_k.g(-1);
                    break L5;
                  }
                }
                var13.f(var9);
                var13.b(param2, param4, -param4 + param5);
                if (var13.i()) {
                  ((gl) this).field_o.a((sh) (Object) var13);
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          } else {
            param0.field_k.b(param2, param4, param1);
            return;
          }
        } else {
          param0.field_k.b(param2, param4, param1);
          return;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param0 = uj.a('_', param0, param1 + 2, "");
        if (param1 == -1) {
          var3 = rk.a(param0, 5);
          if (param2.indexOf(param0) == -1) {
            if (0 != (param2.indexOf(var3) ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          gl.a((byte) -13);
          var3 = rk.a(param0, 5);
          if (param2.indexOf(param0) != -1) {
            return true;
          } else {
            L0: {
              if (0 == param2.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    gl(ei param0) {
        ((gl) this).field_n = new vc();
        ((gl) this).field_o = new ke();
        ((gl) this).field_p = param0;
    }

    final int a() {
        return 0;
    }

    final sh d() {
        tk var1 = (tk) (Object) ((gl) this).field_n.c((byte) 47);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_k)) {
            return (sh) (Object) var1.field_k;
        }
        return ((gl) this).c();
    }

    static {
    }
}
