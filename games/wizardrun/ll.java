/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ll implements bf, qe {
    static String field_g;
    int field_d;
    private int field_m;
    int field_j;
    int field_h;
    private boolean field_c;
    vd field_k;
    static int field_o;
    int field_e;
    int field_a;
    int field_i;
    int field_l;
    int field_n;
    int field_b;
    int field_f;

    public static void a(int param0) {
        if (param0 != 4014) {
            return;
        }
        field_g = null;
    }

    public final int a(ub param0, int param1, int param2) {
        if (param1 != 0) {
            field_g = null;
        }
        return this.a(param0, param2, 0, 31456);
    }

    final void a(ll param0, int param1) {
        if (param1 != 0) {
            return;
        }
        param0.field_n = ((ll) this).field_n;
        param0.field_b = ((ll) this).field_b;
        param0.field_m = ((ll) this).field_m;
        param0.field_a = ((ll) this).field_a;
        param0.field_d = ((ll) this).field_d;
        param0.field_k = ((ll) this).field_k;
        param0.field_l = ((ll) this).field_l;
        param0.field_h = ((ll) this).field_h;
        param0.field_j = ((ll) this).field_j;
        param0.field_c = ((ll) this).field_c;
        param0.field_e = ((ll) this).field_e;
        param0.field_i = ((ll) this).field_i;
        param0.field_f = ((ll) this).field_f;
    }

    public final int a(int param0, int param1, int param2, ub param3, int param4, int param5) {
        if (param0 != 9397) {
            Object var8 = null;
            String discarded$0 = ((ll) this).b((ub) null, (byte) 71);
        }
        af discarded$1 = ((ll) this).a(param3, (byte) 98);
        return param3.field_u.a(param1 - ((ll) this).a(param3, 0, param2), 110, -((ll) this).a(true, param4, param3) + param5);
    }

    public final int a(ub param0, int param1) {
        if (param1 > -42) {
            Object var4 = null;
            ((ll) this).a(91, true, -109, 33, 74, (ub) null);
        }
        return -((ll) this).field_h + (param0.field_r + -((ll) this).field_n);
    }

    ll(vd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(ub param0, int param1, int param2, int param3) {
        if (param3 != 31456) {
            Object var6 = null;
            ((ll) this).a(11, -78, (ub) null, 82, -109);
        }
        return param2 + param0.field_i + (((ll) this).field_n + param0.field_o + param1);
    }

    private final void c(byte param0, ub param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = wizardrun.field_H;
          if (null != param1.field_u) {
            break L0;
          } else {
            param1.field_u = (af) (Object) new cf();
            break L0;
          }
        }
        L1: {
          var3 = ((ll) this).a(param1, -65);
          var4 = this.a(-110, param1);
          var6 = ((ll) this).field_a;
          if ((var6 ^ -1) == -1) {
            var5 = ((ll) this).field_k.field_M;
            break L1;
          } else {
            if (-3 == (var6 ^ -1)) {
              var5 = -((ll) this).field_k.field_B + var4;
              break L1;
            } else {
              L2: {
                if (3 == var6) {
                  break L2;
                } else {
                  if (var6 != 1) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (-((ll) this).field_k.field_M + var4 + -((ll) this).field_k.field_B >> -28235359) + ((ll) this).field_k.field_M;
              break L1;
            }
          }
        }
        L3: {
          L4: {
            var6 = -77 % ((param0 - 45) / 49);
            var7 = ((ll) this).field_l;
            if (0 == var7) {
              break L4;
            } else {
              if (-4 != (var7 ^ -1)) {
                if (1 != var7) {
                  if (2 != var7) {
                    break L3;
                  } else {
                    if (!(param1.field_u instanceof cf)) {
                      break L3;
                    } else {
                      ((cf) (Object) param1.field_u).a(var3, (byte) -65, ((ll) this).field_k, var5, ((ll) this).b(param1, (byte) -57));
                      break L3;
                    }
                  }
                } else {
                  if (!(param1.field_u instanceof cf)) {
                    break L3;
                  } else {
                    ((cf) (Object) param1.field_u).a(((ll) this).field_k, ((ll) this).b(param1, (byte) -57), var3 >> -332488607, true, var5);
                    break L3;
                  }
                }
              } else {
                break L4;
              }
            }
          }
          if (param1.field_u instanceof cf) {
            ((cf) (Object) param1.field_u).a(var5, (byte) -117, 0, ((ll) this).b(param1, (byte) -57), ((ll) this).field_k);
            break L3;
          } else {
            break L3;
          }
        }
    }

    private final void a(int param0, int param1, int param2, ub param3, int param4, int param5, byte param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = wizardrun.field_H;
          eb.a(0, param2 - -param3.field_l + param3.field_n, param5 - -param3.field_o, param3.field_l + param2, param3.field_r + param5 - -param3.field_o);
          var9 = ((ll) this).a(param3, -57);
          var10 = this.a(-119, param3);
          if (((ll) this).field_c) {
            int discarded$1 = ((ll) this).field_k.a(((ll) this).b(param3, (byte) -57), this.a(param3, param5, param1, 31456), this.a(-28235359, param2, param3, param7), var9, var10, param4, param0, ((ll) this).field_l, ((ll) this).field_a, ((ll) this).field_d);
            break L0;
          } else {
            L1: {
              var12 = ((ll) this).field_a;
              if (0 != var12) {
                if (2 == var12) {
                  var11 = -((ll) this).field_k.field_B + var10;
                  break L1;
                } else {
                  L2: {
                    if ((var12 ^ -1) == -4) {
                      break L2;
                    } else {
                      if (1 == var12) {
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var11 = (-((ll) this).field_k.field_B + (var10 - ((ll) this).field_k.field_M) >> -1822673695) + ((ll) this).field_k.field_M;
                  break L1;
                }
              } else {
                var11 = ((ll) this).field_k.field_M;
                break L1;
              }
            }
            L3: {
              var12 = ((ll) this).field_l;
              if (-1 != (var12 ^ -1)) {
                if (-4 != (var12 ^ -1)) {
                  if (var12 != 1) {
                    if (var12 == 2) {
                      ((ll) this).field_k.a(((ll) this).b(param3, (byte) -57), var9 + this.a(param3, param5, param1, 31456), var11 + this.a(-28235359, param2, param3, param7), param4, param0);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((ll) this).field_k.b(((ll) this).b(param3, (byte) -57), this.a(param3, param5, param1, 31456) - -(var9 >> -823166975), this.a(-28235359, param2, param3, param7) + var11, param4, param0);
                    break L0;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            ((ll) this).field_k.c(((ll) this).b(param3, (byte) -57), this.a(param3, param5, param1, 31456), var11 + this.a(-28235359, param2, param3, param7), param4, param0);
            break L0;
          }
        }
        L4: {
          bb.b(4);
          if (param6 >= 85) {
            break L4;
          } else {
            var14 = null;
            this.a(108, (ub) null, -48, -5);
            break L4;
          }
        }
    }

    public final void a(int param0, int param1, ub param2, int param3, int param4) {
        af var14 = null;
        af var15 = null;
        int var7 = 0;
        fg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param3 != 0) {
            Object var13 = null;
            int discarded$0 = ((ll) this).a((byte) -88, (ub) null);
        }
        if (param2.d((byte) 53)) {
            var14 = ((ll) this).a(param2, (byte) 103);
            var15 = var14;
            var7 = var15.a((byte) 89, param4);
            var8 = var14.field_d[var7];
            var9 = var15.a(62, param4);
            var10 = this.a(param2, param1, var9, 31456);
            var11 = ((ll) this).a(true, param0, param2) + Math.max(0, var8.field_a);
            var12 = ((ll) this).a(true, param0, param2) - -Math.min(this.a(-127, param2), Math.min(var8.field_b, var15.field_d.length > 1 + var7 ? var14.field_d[var7 + 1].field_a : var8.field_b));
            eb.a(0, param2.field_n + (param0 - -param2.field_l), param1 + param2.field_o, param2.field_l + param0, param2.field_r + param2.field_o + param1);
            kc.field_H.a(var11, var12, var10, param3 + 0, ((ll) this).field_e, var10);
            bb.b(4);
        }
    }

    public void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        if (!(((ll) this).field_k != null)) {
            return;
        }
        if (!param3) {
            return;
        }
        this.a(param0, param2, param1, 0);
    }

    String b(ub param0, byte param1) {
        if (param1 != -57) {
            ((ll) this).field_l = -93;
        }
        return param0.field_k;
    }

    private final int a(int param0, int param1, ub param2, int param3) {
        if (param0 != -28235359) {
            Object var6 = null;
            int discarded$0 = this.a(85, (ub) null);
        }
        return param2.field_j + param2.field_l + (param1 + (((ll) this).field_b + param3));
    }

    public final af a(ub param0, byte param1) {
        if (!(null != param0.field_u)) {
            param0.field_u = (af) (Object) new cf();
        }
        if (param1 <= 77) {
            ((ll) this).field_e = -118;
        }
        if (((ll) this).field_c) {
            ((cf) (Object) param0.field_u).a(((ll) this).b(param0, (byte) -57), ((ll) this).field_d, ((ll) this).field_l, ((ll) this).a(param0, -118), (byte) -122, ((ll) this).field_k, ((ll) this).field_a, this.a(-120, param0));
        } else {
            this.c((byte) -80, param0);
        }
        return param0.field_u;
    }

    public final void a(int param0, boolean param1, int param2, int param3, int param4, ub param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fg var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        af var17 = null;
        af var18 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        var16 = wizardrun.field_H;
        if (param1) {
          if (param2 == param0) {
            return;
          } else {
            L0: {
              if (!param5.d((byte) 53)) {
                break L0;
              } else {
                L1: {
                  var17 = ((ll) this).a(param5, (byte) 109);
                  var18 = var17;
                  if (param2 >= param0) {
                    var9 = param2;
                    var8 = param0;
                    break L1;
                  } else {
                    var8 = param2;
                    var9 = param0;
                    break L1;
                  }
                }
                var10 = var18.a((byte) 87, var8);
                var11 = var18.a((byte) 113, var9);
                eb.a(0, param3 + param5.field_l - -param5.field_n, param4 + param5.field_o, param5.field_l + param3, param5.field_r + param5.field_o + param4);
                var12 = var10;
                L2: while (true) {
                  if (var12 > var11) {
                    bb.b(4);
                    break L0;
                  } else {
                    L3: {
                      var13 = var17.field_d[var12];
                      if (var12 != var10) {
                        stackOut_13_0 = var13.field_e[0];
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = var18.a(62, var8);
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_14_0;
                      if ((var11 ^ -1) != (var12 ^ -1)) {
                        if (var13 == null) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L4;
                        } else {
                          stackOut_17_0 = var13.field_e[var13.field_e.length - 1];
                          stackIn_19_0 = stackOut_17_0;
                          break L4;
                        }
                      } else {
                        stackOut_15_0 = var18.a(62, var9);
                        stackIn_19_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    var15 = stackIn_19_0;
                    kc.field_H.a(this.a(param5, param4, var14, 31456), var15 - var14, ((ll) this).field_f >>> -69079624, var13.field_b, ((ll) this).field_f, ((ll) this).field_b + (param3 - -param5.field_l + param5.field_j - -var13.field_a), (byte) 81);
                    var12++;
                    continue L2;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, ub param1, int param2, int param3) {
        this.a(((ll) this).field_m, 0, param2, param1, ((ll) this).field_i, param0, (byte) 114, param3);
    }

    public final int a(byte param0, ub param1) {
        af discarded$0 = ((ll) this).a(param1, (byte) 92);
        int var3 = 123 % ((param0 - 14) / 54);
        return param1.field_u.b(115) + ((ll) this).field_b + ((ll) this).field_j;
    }

    private final int a(int param0, ub param1) {
        if (param0 >= -109) {
            ((ll) this).field_b = -114;
        }
        return -((ll) this).field_b + (param1.field_n + -((ll) this).field_j);
    }

    public final int a(boolean param0, int param1, ub param2) {
        if (!param0) {
            Object var5 = null;
            int discarded$0 = ((ll) this).a(false, 13, (ub) null);
        }
        return this.a(-28235359, param1, param2, 0);
    }

    public final int b(byte param0, ub param1) {
        if (param0 <= 79) {
            return -102;
        }
        af discarded$0 = ((ll) this).a(param1, (byte) 123);
        return param1.field_u.a(-111) + (((ll) this).field_n + ((ll) this).field_h);
    }

    protected ll() {
    }

    public final int a(byte param0) {
        int var2 = 103 % ((-18 - param0) / 43);
        return ((ll) this).field_k.field_B + ((ll) this).field_k.field_M;
    }

    ll(vd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((ll) this).field_c = param12 ? true : false;
        ((ll) this).field_a = param8;
        ((ll) this).field_b = param3;
        ((ll) this).field_n = param1;
        ((ll) this).field_m = param6;
        ((ll) this).field_e = param10;
        ((ll) this).field_j = param4;
        ((ll) this).field_f = param11;
        ((ll) this).field_l = param7;
        ((ll) this).field_h = param2;
        ((ll) this).field_k = param0;
        ((ll) this).field_d = param9;
        ((ll) this).field_i = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 250;
        field_g = "Names cannot contain consecutive spaces";
    }
}
