/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends k {
    private fl field_t;
    static java.awt.Frame field_u;
    oi field_p;
    static int field_q;
    static int[] field_n;
    static int[] field_m;
    static String field_r;
    vi field_o;
    static int[] field_s;

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        vk var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        ((he) this).field_o.a(param0, param1, param2);
        var6 = (vk) (Object) ((he) this).field_p.b((byte) 86);
        L0: while (true) {
          if (var6 != null) {
            if (var7 == 0) {
              L1: {
                L2: {
                  if (!((he) this).field_t.b(-1, var6)) {
                    break L2;
                  } else {
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = param1;
                var5 = param2;
                L3: while (true) {
                  L4: {
                    if (var5 <= var6.field_E) {
                      break L4;
                    } else {
                      this.a(var4, var6.field_E, param0, var6, var5 + var4, 124);
                      var5 = var5 - var6.field_E;
                      var4 = var4 + var6.field_E;
                      if (!((he) this).field_t.a(0, param0, var6, var5, var4)) {
                        continue L3;
                      } else {
                        if (var7 != 0) {
                          var6.field_E = var6.field_E - var5;
                          break L1;
                        } else {
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.a(var4, var5, param0, var6, var5 + var4, 66);
                  var6.field_E = var6.field_E - var5;
                  break L1;
                }
              }
              var6 = (vk) (Object) ((he) this).field_p.d(8192);
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(int param0, vk param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        fl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        fl stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        fl stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        fl stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        fl stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        fl stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        if (param2 != (((he) this).field_t.field_y[param1.field_F] & 4 ^ -1)) {
          if (0 > param1.field_j) {
            var4 = ((he) this).field_t.field_Q[param1.field_F] / c.field_l;
            var5 = (-param1.field_H + var4 + 1048575) / var4;
            param1.field_H = var4 * param0 + param1.field_H & 1048575;
            if (param0 >= var5) {
              L0: {
                if (-1 == (((he) this).field_t.field_o[param1.field_F] ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    param1.field_w = uj.a(param1.field_v, param1.field_w.h(), 0, param1.field_w.j());
                    stackOut_7_0 = ((he) this).field_t;
                    stackOut_7_1 = 15;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (-1 >= (param1.field_C.field_r[param1.field_k] ^ -1)) {
                      stackOut_9_0 = (fl) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L1;
                    } else {
                      stackOut_8_0 = (fl) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L1;
                    }
                  }
                  ((fl) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2 != 0, param1);
                  if (wizardrun.field_H == 0) {
                    L2: {
                      if (-1 < (param1.field_C.field_r[param1.field_k] ^ -1)) {
                        param1.field_w.e(-1);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    param0 = param1.field_H / var4;
                    param1.field_w.a(param0);
                    return;
                  } else {
                    break L0;
                  }
                }
              }
              L3: {
                param1.field_w = uj.a(param1.field_v, param1.field_w.h(), param1.field_w.f(), param1.field_w.j());
                if (-1 < (param1.field_C.field_r[param1.field_k] ^ -1)) {
                  param1.field_w.e(-1);
                  break L3;
                } else {
                  break L3;
                }
              }
              param0 = param1.field_H / var4;
              param1.field_w.a(param0);
              return;
            } else {
              param1.field_w.a(param0);
              return;
            }
          } else {
            param1.field_w.a(param0);
            return;
          }
        } else {
          param1.field_w.a(param0);
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != -28471) {
            return;
        }
        field_n = null;
        field_u = null;
        field_r = null;
        field_m = null;
        field_s = null;
    }

    private final void a(int param0, int param1, int[] param2, vk param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uj var11 = null;
        int var12 = 0;
        fl stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        fl stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        fl stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        fl stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        fl stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        fl stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        var12 = wizardrun.field_H;
        if ((4 & ((he) this).field_t.field_y[param3.field_F]) != 0) {
          if (-1 < (param3.field_j ^ -1)) {
            var7 = ((he) this).field_t.field_Q[param3.field_F] / c.field_l;
            L0: while (true) {
              L1: {
                L2: {
                  var8 = (1048575 - (-var7 + param3.field_H)) / var7;
                  if (param1 >= var8) {
                    param3.field_w.a(param2, param0, var8);
                    param0 = param0 + var8;
                    param1 = param1 - var8;
                    param3.field_H = param3.field_H + (var8 * var7 + -1048576);
                    break L2;
                  } else {
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        break L1;
                      } else {
                        param3.field_w.a(param2, param0, var8);
                        param0 = param0 + var8;
                        param1 = param1 - var8;
                        param3.field_H = param3.field_H + (var8 * var7 + -1048576);
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  var9 = c.field_l / 100;
                  var10 = 262144 / var7;
                  if (var10 < var9) {
                    var9 = var10;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var11 = param3.field_w;
                  if (((he) this).field_t.field_o[param3.field_F] == 0) {
                    break L4;
                  } else {
                    L5: {
                      param3.field_w = uj.a(param3.field_v, var11.h(), 0, var11.j());
                      stackOut_21_0 = ((he) this).field_t;
                      stackOut_21_1 = 15;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      if (-1 >= (param3.field_C.field_r[param3.field_k] ^ -1)) {
                        stackOut_23_0 = (fl) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        break L5;
                      } else {
                        stackOut_22_0 = (fl) (Object) stackIn_22_0;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        stackIn_24_2 = stackOut_22_2;
                        break L5;
                      }
                    }
                    ((fl) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2 != 0, param3);
                    param3.field_w.c(var9, var11.f());
                    break L4;
                  }
                }
                param3.field_w = uj.a(param3.field_v, var11.h(), var11.f(), var11.j());
                L6: {
                  if ((param3.field_C.field_r[param3.field_k] ^ -1) <= -1) {
                    break L6;
                  } else {
                    param3.field_w.e(-1);
                    break L6;
                  }
                }
                L7: {
                  var11.f(var9);
                  var11.a(param2, param0, -param0 + param4);
                  if (!var11.i()) {
                    break L7;
                  } else {
                    ((he) this).field_o.a((k) (Object) var11);
                    break L7;
                  }
                }
                if (var12 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
              param3.field_H = param3.field_H + var7 * param1;
              if (param5 > 55) {
                param3.field_w.a(param2, param0, param1);
                return;
              } else {
                k discarded$3 = ((he) this).a();
                param3.field_w.a(param2, param0, param1);
                return;
              }
            }
          } else {
            if (param5 > 55) {
              param3.field_w.a(param2, param0, param1);
              return;
            } else {
              k discarded$4 = ((he) this).a();
              param3.field_w.a(param2, param0, param1);
              return;
            }
          }
        } else {
          if (param5 > 55) {
            param3.field_w.a(param2, param0, param1);
            return;
          } else {
            k discarded$5 = ((he) this).a();
            param3.field_w.a(param2, param0, param1);
            return;
          }
        }
    }

    final k c() {
        vk var1_ref = null;
        do {
            var1_ref = (vk) (Object) ((he) this).field_p.d(8192);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_w);
        return (k) (Object) var1_ref.field_w;
    }

    final static ae a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        var2 = param1.length();
        if (param0 >= 63) {
          if (0 == var2) {
            return ok.field_f;
          } else {
            if ((var2 ^ -1) < -64) {
              return kj.field_c;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var2 > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (45 == var4) {
                      L2: {
                        if (-1 == (var3 ^ -1)) {
                          break L2;
                        } else {
                          if (-1 + var2 != var3) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      return tl.field_d;
                    } else {
                      if (-1 == jg.field_r.indexOf(var4)) {
                        return tl.field_d;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          he.c(8);
          if (0 == var2) {
            return ok.field_f;
          } else {
            if ((var2 ^ -1) < -64) {
              return kj.field_c;
            } else {
              var3 = 0;
              L3: while (true) {
                if (var2 > var3) {
                  L4: {
                    var4 = param1.charAt(var3);
                    if (45 == var4) {
                      L5: {
                        if (-1 == (var3 ^ -1)) {
                          break L5;
                        } else {
                          if (-1 + var2 != var3) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      return tl.field_d;
                    } else {
                      if (-1 == jg.field_r.indexOf(var4)) {
                        return tl.field_d;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L3;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
    }

    final k a() {
        vk var1 = (vk) (Object) ((he) this).field_p.b((byte) 124);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_w)) {
            return (k) (Object) var1.field_w;
        }
        return ((he) this).c();
    }

    final int d() {
        return 0;
    }

    he(fl param0) {
        ((he) this).field_p = new oi();
        ((he) this).field_o = new vi();
        ((he) this).field_t = param0;
    }

    final void a(int param0) {
        int var2 = 0;
        vk var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_10_0 = false;
        var4 = wizardrun.field_H;
        ((he) this).field_o.a(param0);
        var3 = (vk) (Object) ((he) this).field_p.b((byte) 122);
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              stackOut_5_0 = ((he) this).field_t.b(-1, var3);
              stackIn_6_0 = stackOut_5_0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (!stackIn_6_0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = param0;
                  L4: while (true) {
                    if (var3.field_E >= var2) {
                      this.a(var2, var3, -1);
                      var3.field_E = var3.field_E - var2;
                      break L2;
                    } else {
                      this.a(var3.field_E, var3, -1);
                      var2 = var2 - var3.field_E;
                      stackOut_10_0 = ((he) this).field_t.a(0, (int[]) null, var3, var2, 0);
                      stackIn_6_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var4 != 0) {
                        continue L1;
                      } else {
                        if (stackIn_11_0) {
                          break L2;
                        } else {
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var3 = (vk) (Object) ((he) this).field_p.d(8192);
                continue L0;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_r = "Be careful of the three different creatures.";
        field_s = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
