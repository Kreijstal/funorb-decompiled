/*
 * Decompiled by CFR-JS 0.4.0.
 */
class h implements ui, m {
    int field_c;
    int field_a;
    private int field_m;
    int field_g;
    kg field_i;
    int field_b;
    int field_e;
    int field_k;
    int field_n;
    static char[] field_l;
    private boolean field_j;
    int field_d;
    int field_f;
    int field_h;

    public final int a(int param0, qg param1) {
        if (param0 != -1) {
            ((h) this).field_i = null;
        }
        ue discarded$0 = ((h) this).a(param1, -2);
        return param1.field_i.b((byte) 113) - (-((h) this).field_h - ((h) this).field_k);
    }

    public void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        if (!(((h) this).field_i != null)) {
            return;
        }
        this.a(251, param0, param1, param4);
        int var6 = -127 % ((51 - param3) / 47);
    }

    h(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(int param0, byte param1, int param2, int param3, int param4, qg param5) {
        if (param1 != -50) {
            return 35;
        }
        ue discarded$0 = ((h) this).a(param5, -2);
        return param5.field_i.a(param4 - ((h) this).a(param1 + 9162, param5, param3), -1, -((h) this).a(param5, -113, param0) + param2);
    }

    public final int a(boolean param0) {
        if (!param0) {
            return -99;
        }
        return ((h) this).field_i.field_y + ((h) this).field_i.field_t;
    }

    public final void a(int param0, int param1, int param2, qg param3, boolean param4) {
        ue var13 = null;
        ue var14 = null;
        int var7 = 0;
        ol var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!param4) {
            return;
        }
        if (param3.b((byte) -110)) {
            var13 = ((h) this).a(param3, -2);
            var14 = var13;
            var7 = var14.b(-1, param1);
            var8 = var13.field_b[var7];
            var9 = var14.c(0, param1);
            var10 = this.a(239, param3, param0, var9);
            var11 = ((h) this).a(param3, -83, param2) + Math.max(0, var8.field_a);
            var12 = ((h) this).a(param3, -102, param2) + Math.min(this.d(param3, 15065), Math.min(var8.field_f, 1 + var7 < var14.field_b.length ? var13.field_b[1 + var7].field_a : var8.field_f));
            c.a(param0 - (-param3.field_p + -param3.field_l), param3.field_p + param0, (byte) -50, param3.field_h + param2 + param3.field_n, param2 + param3.field_n);
            vi.field_e.a(var10, ((h) this).field_n, var12, var11, var10, (byte) 119);
            fi.c(param4);
        }
    }

    public final void a(qg param0, int param1, int param2, int param3, byte param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ol var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ue var17 = null;
        ue var18 = null;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var16 = Transmogrify.field_A ? 1 : 0;
        if (param4 == -49) {
          if (param5 == param3) {
            return;
          } else {
            L0: {
              if (param0.b((byte) -104)) {
                L1: {
                  var17 = ((h) this).a(param0, -2);
                  var18 = var17;
                  if ((param5 ^ -1) < (param3 ^ -1)) {
                    var8 = param3;
                    var9 = param5;
                    break L1;
                  } else {
                    var9 = param3;
                    var8 = param5;
                    break L1;
                  }
                }
                var10 = var18.b(-1, var8);
                var11 = var18.b(-1, var9);
                c.a(param2 + (param0.field_p + param0.field_l), param0.field_p + param2, (byte) -50, param0.field_h + (param1 + param0.field_n), param1 - -param0.field_n);
                var12 = var10;
                L2: while (true) {
                  if (var12 > var11) {
                    fi.c(true);
                    break L0;
                  } else {
                    L3: {
                      var13 = var17.field_b[var12];
                      if ((var10 ^ -1) != (var12 ^ -1)) {
                        stackOut_14_0 = var13.field_g[0];
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_13_0 = var18.c(param4 + 49, var8);
                        stackIn_15_0 = stackOut_13_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_15_0;
                      if ((var11 ^ -1) == (var12 ^ -1)) {
                        stackOut_19_0 = var18.c(param4 + 49, var9);
                        stackIn_20_0 = stackOut_19_0;
                        break L4;
                      } else {
                        if (var13 != null) {
                          stackOut_18_0 = var13.field_g[-1 + var13.field_g.length];
                          stackIn_20_0 = stackOut_18_0;
                          break L4;
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_20_0 = stackOut_17_0;
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_20_0;
                    vi.field_e.a(((h) this).field_g >>> -837304328, ((h) this).field_c + (param1 + param0.field_n - (-param0.field_o - var13.field_a)), var15 + -var14, this.a(239, param0, param2, var14), ((h) this).field_g, var13.field_f, 4);
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

    private final void a(byte param0, qg param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Transmogrify.field_A ? 1 : 0;
          if (null != param1.field_i) {
            break L0;
          } else {
            param1.field_i = (ue) (Object) new jh();
            break L0;
          }
        }
        var3 = ((h) this).b(0, param1);
        var4 = this.d(param1, param0 + 14967);
        if (param0 == 98) {
          L1: {
            var6 = ((h) this).field_a;
            if ((var6 ^ -1) != -1) {
              if (-3 != (var6 ^ -1)) {
                L2: {
                  if (var6 != 3) {
                    if (var6 == 1) {
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5 = (-((h) this).field_i.field_t + -((h) this).field_i.field_y + var4 >> -187476863) + ((h) this).field_i.field_y;
                break L1;
              } else {
                var5 = var4 + -((h) this).field_i.field_t;
                break L1;
              }
            } else {
              var5 = ((h) this).field_i.field_y;
              break L1;
            }
          }
          L3: {
            L4: {
              var6 = ((h) this).field_b;
              if (var6 != 0) {
                if (-4 != (var6 ^ -1)) {
                  if (-2 == (var6 ^ -1)) {
                    if (!(param1.field_i instanceof jh)) {
                      break L3;
                    } else {
                      ((jh) (Object) param1.field_i).a(var3 >> 32871585, 7531, var5, ((h) this).field_i, ((h) this).c(param1, param0 + -10));
                      break L3;
                    }
                  } else {
                    if (2 != var6) {
                      break L3;
                    } else {
                      if (!(param1.field_i instanceof jh)) {
                        break L3;
                      } else {
                        ((jh) (Object) param1.field_i).a(((h) this).field_i, var3, (byte) -74, ((h) this).c(param1, 86), var5);
                        break L3;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (param1.field_i instanceof jh) {
              ((jh) (Object) param1.field_i).a(((h) this).c(param1, param0 + 7), (byte) 50, ((h) this).field_i, var5, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, h param1) {
        param1.field_e = ((h) this).field_e;
        param1.field_i = ((h) this).field_i;
        param1.field_d = ((h) this).field_d;
        param1.field_f = ((h) this).field_f;
        param1.field_a = ((h) this).field_a;
        param1.field_b = ((h) this).field_b;
        if (param0 != -106) {
            ((h) this).field_d = -44;
        }
        param1.field_c = ((h) this).field_c;
        param1.field_n = ((h) this).field_n;
        param1.field_g = ((h) this).field_g;
        param1.field_h = ((h) this).field_h;
        param1.field_j = ((h) this).field_j;
        param1.field_m = ((h) this).field_m;
        param1.field_k = ((h) this).field_k;
    }

    String c(qg param0, int param1) {
        if (param1 < 53) {
            return null;
        }
        return param0.field_k;
    }

    private final int d(qg param0, int param1) {
        if (param1 != 15065) {
            ((h) this).field_d = -59;
        }
        return -((h) this).field_d + (-((h) this).field_c + param0.field_h);
    }

    public final int a(qg param0, int param1, int param2) {
        int var4 = 95 / ((param1 - -4) / 47);
        return this.a(param0, (byte) 118, 0, param2);
    }

    public final int b(int param0, qg param1) {
        if (param0 != 0) {
            ((h) this).field_f = -105;
        }
        return -((h) this).field_k + -((h) this).field_h + param1.field_l;
    }

    public final ue a(qg param0, int param1) {
        if (param1 != -2) {
            Object var4 = null;
            int discarded$0 = ((h) this).a(-104, (qg) null);
        }
        if (!(null != param0.field_i)) {
            param0.field_i = (ue) (Object) new jh();
        }
        if (!((h) this).field_j) {
            this.a((byte) 98, param0);
        } else {
            ((jh) (Object) param0.field_i).a(45, ((h) this).field_b, ((h) this).field_e, ((h) this).b(0, param0), ((h) this).c(param0, 127), ((h) this).field_i, this.d(param0, 15065), ((h) this).field_a);
        }
        return param0.field_i;
    }

    public final int b(qg param0, int param1) {
        if (param1 != 228) {
            return -50;
        }
        ue discarded$0 = ((h) this).a(param0, -2);
        return param0.field_i.a(param1 ^ 153) - -((h) this).field_c - -((h) this).field_d;
    }

    private final int a(int param0, qg param1, int param2, int param3) {
        if (param0 != 239) {
            ((h) this).field_n = 69;
        }
        return param3 + (param1.field_r + param2 + param1.field_p) - -((h) this).field_h;
    }

    private final void a(int param0, int param1, int param2, qg param3) {
        this.a(param2, param1, param3, (byte) -49, ((h) this).field_f, 0, 0, ((h) this).field_m);
        if (param0 != 251) {
            ((h) this).field_k = -107;
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          if (param3) {
            if ((dk.field_k[param0] ^ -1) > (dk.field_k[param1] ^ -1)) {
              return true;
            } else {
              if (dk.field_k[param0] > dk.field_k[param1]) {
                return false;
              } else {
                if ((tb.field_d[param1] ^ -1) >= (tb.field_d[param0] ^ -1)) {
                  if (tb.field_d[param1] < tb.field_d[param0]) {
                    return false;
                  } else {
                    break L0;
                  }
                } else {
                  return true;
                }
              }
            }
          } else {
            if ((tb.field_d[param1] ^ -1) >= (tb.field_d[param0] ^ -1)) {
              if ((tb.field_d[param0] ^ -1) >= (tb.field_d[param1] ^ -1)) {
                if (dk.field_k[param0] >= dk.field_k[param1]) {
                  if ((dk.field_k[param1] ^ -1) <= (dk.field_k[param0] ^ -1)) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
        L1: {
          var4 = bg.field_j[param0] + bh.field_a[param0] - -pd.field_a[param0];
          var5 = bg.field_j[param1] + (pd.field_a[param1] + bh.field_a[param1]);
          if (param2 == -7079) {
            break L1;
          } else {
            field_l = null;
            break L1;
          }
        }
        if ((var5 ^ -1) >= (var4 ^ -1)) {
          if (var4 <= var5) {
            L2: {
              if (param1 <= param0) {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L2;
              } else {
                stackOut_27_0 = 1;
                stackIn_29_0 = stackOut_27_0;
                break L2;
              }
            }
            return stackIn_29_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private final void a(int param0, int param1, qg param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = Transmogrify.field_A ? 1 : 0;
          if (param3 == -49) {
            break L0;
          } else {
            var14 = null;
            int discarded$2 = ((h) this).a(-60, (byte) -69, -117, 8, -43, (qg) null);
            break L0;
          }
        }
        L1: {
          c.a(param2.field_l + param1 - -param2.field_p, param1 - -param2.field_p, (byte) -50, param2.field_h + param0 + param2.field_n, param0 - -param2.field_n);
          var9 = ((h) this).b(0, param2);
          var10 = this.d(param2, 15065);
          if (!((h) this).field_j) {
            L2: {
              var12 = ((h) this).field_a;
              if (0 != var12) {
                if (2 != var12) {
                  L3: {
                    if (-4 != (var12 ^ -1)) {
                      if (-2 != (var12 ^ -1)) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var11 = ((h) this).field_i.field_y - -(var10 + -((h) this).field_i.field_y + -((h) this).field_i.field_t >> -1774982111);
                  break L2;
                } else {
                  var11 = var10 + -((h) this).field_i.field_t;
                  break L2;
                }
              } else {
                var11 = ((h) this).field_i.field_y;
                break L2;
              }
            }
            L4: {
              var12 = ((h) this).field_b;
              if (var12 != 0) {
                if (var12 != 3) {
                  if ((var12 ^ -1) == -2) {
                    ((h) this).field_i.c(((h) this).c(param2, param3 ^ -108), this.a(239, param2, param1, param6) + (var9 >> -1329334463), var11 + this.a(param2, (byte) 123, param5, param0), param4, param7);
                    break L1;
                  } else {
                    if (2 == var12) {
                      ((h) this).field_i.a(((h) this).c(param2, 60), this.a(239, param2, param1, param6) + var9, var11 + this.a(param2, (byte) 122, param5, param0), param4, param7);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            ((h) this).field_i.b(((h) this).c(param2, 92), this.a(239, param2, param1, param6), var11 + this.a(param2, (byte) 121, param5, param0), param4, param7);
            break L1;
          } else {
            int discarded$3 = ((h) this).field_i.a(((h) this).c(param2, 108), this.a(239, param2, param1, param6), this.a(param2, (byte) 123, param5, param0), var9, var10, param4, param7, ((h) this).field_b, ((h) this).field_a, ((h) this).field_e);
            break L1;
          }
        }
        fi.c(true);
    }

    private final int a(qg param0, byte param1, int param2, int param3) {
        if (param1 < 117) {
            return 22;
        }
        return param0.field_n + (param3 + (((h) this).field_c + param0.field_o) + param2);
    }

    public static void a(int param0) {
        if (param0 != 95) {
            boolean discarded$0 = h.a(103, 33, -47, false);
        }
        field_l = null;
    }

    public final int a(int param0, qg param1, int param2) {
        if (param0 != 9112) {
            return -58;
        }
        return this.a(239, param1, param2, 0);
    }

    protected h() {
    }

    h(kg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((h) this).field_j = param12 ? true : false;
        ((h) this).field_i = param0;
        ((h) this).field_a = param8;
        ((h) this).field_e = param9;
        ((h) this).field_k = param2;
        ((h) this).field_c = param3;
        ((h) this).field_d = param4;
        ((h) this).field_h = param1;
        ((h) this).field_b = param7;
        ((h) this).field_m = param6;
        ((h) this).field_g = param11;
        ((h) this).field_f = param5;
        ((h) this).field_n = param10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
