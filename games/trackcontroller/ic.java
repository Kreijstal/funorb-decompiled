/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ic implements t, dl {
    int field_d;
    private boolean field_a;
    int field_f;
    static String field_g;
    int field_j;
    oh field_k;
    int field_e;
    int field_l;
    private int field_m;
    int field_c;
    int field_b;
    int field_n;
    int field_h;
    int field_i;

    public static void b(byte param0) {
        if (param0 >= -29) {
            field_g = null;
        }
        field_g = null;
    }

    public final int a(int param0, al param1, int param2) {
        if (param2 != 0) {
            ((ic) this).field_c = -91;
        }
        return this.a(0, param0, param1, (byte) -128);
    }

    ic(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final rb a(byte param0, al param1) {
        int var3 = -22 / ((param0 - 11) / 50);
        if (!(param1.field_k != null)) {
            param1.field_k = (rb) (Object) new cj();
        }
        if (((ic) this).field_a) {
            ((cj) (Object) param1.field_k).a(((ic) this).field_k, 64, ((ic) this).field_f, this.b(17910, param1), ((ic) this).field_n, ((ic) this).a(param1, 112), ((ic) this).c((byte) 106, param1), ((ic) this).field_l);
        } else {
            this.b((byte) 116, param1);
        }
        return param1.field_k;
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (-11 < (rl.field_N ^ -1)) {
                break L1;
              } else {
                if (13 > gl.field_I) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0, ic param1) {
        if (param0 != -19397) {
            Object var4 = null;
            int discarded$0 = ((ic) this).a(true, (al) null);
        }
        param1.field_i = ((ic) this).field_i;
        param1.field_a = ((ic) this).field_a;
        param1.field_n = ((ic) this).field_n;
        param1.field_d = ((ic) this).field_d;
        param1.field_m = ((ic) this).field_m;
        param1.field_k = ((ic) this).field_k;
        param1.field_h = ((ic) this).field_h;
        param1.field_l = ((ic) this).field_l;
        param1.field_b = ((ic) this).field_b;
        param1.field_c = ((ic) this).field_c;
        param1.field_e = ((ic) this).field_e;
        param1.field_j = ((ic) this).field_j;
        param1.field_f = ((ic) this).field_f;
    }

    public final int a(al param0, int param1, int param2) {
        int var4 = -32 % ((50 - param1) / 39);
        return this.a(param2, 0, param0, -110);
    }

    public final int a(int param0, int param1, int param2, int param3, int param4, al param5) {
        int var7 = -126 / ((18 - param2) / 61);
        rb discarded$0 = ((ic) this).a((byte) -116, param5);
        return param5.field_k.a(param1 - ((ic) this).a(param4, param5, 0), false, param3 - ((ic) this).a(param5, 122, param0));
    }

    public final int a(int param0, al param1) {
        rb discarded$5 = ((ic) this).a((byte) 72, param1);
        if (param0 < 82) {
            return 94;
        }
        return param1.field_k.a(12323) - -((ic) this).field_h + ((ic) this).field_d;
    }

    public final int a(byte param0) {
        if (param0 != 46) {
            return -9;
        }
        return ((ic) this).field_k.field_u + ((ic) this).field_k.field_G;
    }

    private final void b(byte param0, al param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          if (null == param1.field_k) {
            param1.field_k = (rb) (Object) new cj();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((ic) this).a(param1, 107);
          var4 = this.b(17910, param1);
          if (param0 >= 112) {
            break L1;
          } else {
            ((ic) this).field_d = -71;
            break L1;
          }
        }
        L2: {
          var6 = ((ic) this).field_l;
          if (var6 != 0) {
            if (var6 != 2) {
              L3: {
                if (var6 != 3) {
                  if (1 != var6) {
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var5 = ((ic) this).field_k.field_G + (-((ic) this).field_k.field_G + var4 - ((ic) this).field_k.field_u >> 1305595681);
              break L2;
            } else {
              var5 = var4 - ((ic) this).field_k.field_u;
              break L2;
            }
          } else {
            var5 = ((ic) this).field_k.field_G;
            break L2;
          }
        }
        L4: {
          L5: {
            var6 = ((ic) this).field_f;
            if (0 == var6) {
              break L5;
            } else {
              if (3 != var6) {
                if (-2 != (var6 ^ -1)) {
                  if ((var6 ^ -1) != -3) {
                    break L4;
                  } else {
                    if (!(param1.field_k instanceof cj)) {
                      break L4;
                    } else {
                      ((cj) (Object) param1.field_k).a(-19121, ((ic) this).c((byte) 78, param1), var5, ((ic) this).field_k, var3);
                      break L4;
                    }
                  }
                } else {
                  if (param1.field_k instanceof cj) {
                    ((cj) (Object) param1.field_k).a(113, ((ic) this).field_k, ((ic) this).c((byte) 78, param1), var5, var3 >> -1508892255);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L5;
              }
            }
          }
          if (!(param1.field_k instanceof cj)) {
            break L4;
          } else {
            ((cj) (Object) param1.field_k).a(1888, var5, ((ic) this).field_k, 0, ((ic) this).c((byte) 67, param1));
            break L4;
          }
        }
    }

    String c(byte param0, al param1) {
        if (param0 < 49) {
            return null;
        }
        return param1.field_s;
    }

    private final void a(byte param0, int param1, al param2, int param3) {
        this.a(param2, ((ic) this).field_m, 0, 0, param3, param1, (byte) -114, ((ic) this).field_i);
        if (param0 >= -37) {
            Object var6 = null;
            int discarded$0 = ((ic) this).a((al) null, 74);
        }
    }

    private final int a(int param0, int param1, al param2, int param3) {
        int var5 = -125 % ((param3 - -22) / 57);
        return ((ic) this).field_h + (param0 - -param2.field_m) + (param2.field_A + param1);
    }

    public void a(int param0, al param1, int param2, boolean param3, int param4) {
        if (param0 != -24969) {
            ((ic) this).field_e = 120;
        }
        if (((ic) this).field_k == null) {
            return;
        }
        this.a((byte) -110, param2, param1, param4);
    }

    public final int a(boolean param0, al param1) {
        if (param0) {
            ((ic) this).field_l = 99;
        }
        rb discarded$0 = ((ic) this).a((byte) -51, param1);
        return param1.field_k.c(-1) + ((ic) this).field_e + ((ic) this).field_b;
    }

    public final void b(int param0, int param1, int param2, int param3, int param4, al param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        va var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        rb var17 = null;
        rb var18 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var16 = TrackController.field_F ? 1 : 0;
          if (param3 <= -36) {
            break L0;
          } else {
            ((ic) this).field_l = -49;
            break L0;
          }
        }
        if (param2 == param4) {
          return;
        } else {
          L1: {
            if (!param5.h(-123)) {
              break L1;
            } else {
              L2: {
                var17 = ((ic) this).a((byte) -106, param5);
                var18 = var17;
                if (param2 <= param4) {
                  var8 = param2;
                  var9 = param4;
                  break L2;
                } else {
                  var9 = param2;
                  var8 = param4;
                  break L2;
                }
              }
              var10 = var18.a(var8, (byte) -36);
              var11 = var18.a(var9, (byte) -36);
              mb.a(param0 + param5.field_p, param5.field_m + param1, param5.field_u + (param5.field_m + param1), (byte) -84, param0 - -param5.field_p + param5.field_x);
              var12 = var10;
              L3: while (true) {
                if (var12 > var11) {
                  ch.m(-85);
                  break L1;
                } else {
                  L4: {
                    var13 = var17.field_b[var12];
                    if (var10 != var12) {
                      stackOut_13_0 = var13.field_b[0];
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = var18.a((byte) 111, var8);
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = stackIn_14_0;
                    if (var11 != var12) {
                      if (var13 != null) {
                        stackOut_18_0 = var13.field_b[-1 + var13.field_b.length];
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = 0;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    } else {
                      stackOut_15_0 = var18.a((byte) 111, var9);
                      stackIn_19_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  var15 = stackIn_19_0;
                  lb.field_O.a(var13.field_c + ((ic) this).field_h + param1 - (-param5.field_m - param5.field_A), 10066329, -var14 + var15, ((ic) this).field_j >>> -1559197992, ((ic) this).field_j, var13.field_f, this.a(var14, param0, param5, (byte) -33));
                  var12++;
                  continue L3;
                }
              }
            }
          }
          return;
        }
    }

    private final int a(int param0, int param1, al param2, byte param3) {
        if (param3 > -24) {
            ((ic) this).field_h = 5;
        }
        return ((ic) this).field_e + param2.field_p + (param1 - -param2.field_o - -param0);
    }

    private final void a(al param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TrackController.field_F ? 1 : 0;
          mb.a(param0.field_p + param4, param0.field_m + param5, param0.field_u + param0.field_m + param5, (byte) -64, param4 - -param0.field_p - -param0.field_x);
          var9 = ((ic) this).a(param0, 103);
          var10 = this.b(17910, param0);
          if (!((ic) this).field_a) {
            L1: {
              var12 = ((ic) this).field_l;
              if ((var12 ^ -1) != -1) {
                if (-3 != (var12 ^ -1)) {
                  L2: {
                    if (var12 == 3) {
                      break L2;
                    } else {
                      if ((var12 ^ -1) == -2) {
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var11 = ((ic) this).field_k.field_G - -(-((ic) this).field_k.field_G + var10 - ((ic) this).field_k.field_u >> 345172545);
                  break L1;
                } else {
                  var11 = var10 + -((ic) this).field_k.field_u;
                  break L1;
                }
              } else {
                var11 = ((ic) this).field_k.field_G;
                break L1;
              }
            }
            L3: {
              var12 = ((ic) this).field_f;
              if (var12 != 0) {
                if (3 == var12) {
                  break L3;
                } else {
                  if (var12 != 1) {
                    if (-3 == (var12 ^ -1)) {
                      ((ic) this).field_k.a(((ic) this).c((byte) 118, param0), var9 + this.a(param3, param4, param0, (byte) -125), this.a(param5, param2, param0, 124) + var11, param7, param1);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((ic) this).field_k.b(((ic) this).c((byte) 100, param0), this.a(param3, param4, param0, (byte) -66) - -(var9 >> 101138849), this.a(param5, param2, param0, 78) + var11, param7, param1);
                    break L0;
                  }
                }
              } else {
                break L3;
              }
            }
            ((ic) this).field_k.c(((ic) this).c((byte) 95, param0), this.a(param3, param4, param0, (byte) -112), var11 + this.a(param5, param2, param0, 123), param7, param1);
            break L0;
          } else {
            int discarded$1 = ((ic) this).field_k.a(((ic) this).c((byte) 86, param0), this.a(param3, param4, param0, (byte) -45), this.a(param5, param2, param0, 37), var9, var10, param7, param1, ((ic) this).field_f, ((ic) this).field_l, ((ic) this).field_n);
            break L0;
          }
        }
        if (param6 == -114) {
          ch.m(67);
          return;
        } else {
          return;
        }
    }

    private final int b(int param0, al param1) {
        if (param0 != 17910) {
            ((ic) this).field_e = -68;
        }
        return -((ic) this).field_d + (param1.field_u - ((ic) this).field_h);
    }

    protected ic() {
    }

    public final void a(int param0, al param1, int param2, int param3, int param4) {
        rb var14 = null;
        rb var15 = null;
        int var7 = 0;
        va var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param1.h(-125)) {
            var14 = ((ic) this).a((byte) 82, param1);
            var15 = var14;
            var7 = var15.a(param0, (byte) -36);
            var8 = var14.field_b[var7];
            var9 = var15.a((byte) 111, param0);
            var10 = this.a(var9, param4, param1, (byte) -108);
            var11 = ((ic) this).a(param1, -119, param3) - -Math.max(0, var8.field_c);
            var12 = ((ic) this).a(param1, 98, param3) + Math.min(this.b(17910, param1), Math.min(var8.field_f, var15.field_b.length > 1 + var7 ? var14.field_b[1 + var7].field_c : var8.field_f));
            mb.a(param1.field_p + param4, param3 - -param1.field_m, param3 + (param1.field_m - -param1.field_u), (byte) -69, param4 - -param1.field_p - -param1.field_x);
            lb.field_O.a(94, var10, var12, ((ic) this).field_c, var11, var10);
            ch.m(88);
        }
        if (param2 >= -73) {
            Object var13 = null;
            int discarded$0 = this.a(122, 27, (al) null, (byte) -18);
        }
    }

    public final int a(al param0, int param1) {
        if (param1 < 78) {
            return 116;
        }
        return -((ic) this).field_b + (-((ic) this).field_e + param0.field_x);
    }

    ic(oh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((ic) this).field_f = param7;
        ((ic) this).field_e = param1;
        ((ic) this).field_m = param6;
        ((ic) this).field_n = param9;
        ((ic) this).field_d = param4;
        ((ic) this).field_j = param11;
        ((ic) this).field_a = param12 ? true : false;
        ((ic) this).field_i = param5;
        ((ic) this).field_h = param3;
        ((ic) this).field_b = param2;
        ((ic) this).field_k = param0;
        ((ic) this).field_l = param8;
        ((ic) this).field_c = param10;
    }

    final static boolean a(boolean param0) {
        if (param0) {
            field_g = null;
        }
        return fb.field_a > 250 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Create your own free Jagex account";
    }
}
