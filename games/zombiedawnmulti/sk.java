/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static boolean field_j;
    int field_p;
    nl field_o;
    int field_e;
    int field_c;
    nl field_k;
    static String field_r;
    int field_m;
    static String field_q;
    nl field_a;
    int field_b;
    int field_d;
    nl field_s;
    fm field_h;
    nl field_n;
    static cj field_i;
    private int field_f;
    int field_l;
    private boolean field_g;

    final static int a(byte param0) {
        int var1 = -15 % ((-16 - param0) / 38);
        return qk.field_j;
    }

    public static void a(int param0) {
        field_i = null;
        field_q = null;
        if (param0 != -1020346174) {
            field_i = (cj) null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    private final void a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = this.field_h.a(param1);
            var6 = this.field_h.field_J - -this.field_h.field_r;
            var7 = param2;
            if (var7 + var5_int - -6 > oo.field_b) {
                var7 = -var5_int + (oo.field_b - 6);
            }
            var8 = 32 + (-this.field_h.field_J + param3);
            if (!(var6 + var8 + param0 <= oo.field_l)) {
                var8 = -var6 + oo.field_l - 6;
            }
            oo.a(var7, var8, 6 + var5_int, 6 + var6, this.field_f);
            oo.e(1 + var7, 1 + var8, 4 + var5_int, var6 - -4, this.field_d);
            this.field_h.c(param1, 3 + var7, this.field_h.field_J + (3 + var8), this.field_f, -1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = -11 % ((param3 - -28) / 57);
        oo.f(param0, param6, param2, param1, param4, param5);
    }

    final void a(int param0, fm param1) {
        bg discarded$3 = null;
        wa discarded$4 = null;
        ja dupTemp$5 = null;
        RuntimeException runtimeException = null;
        jl var4 = null;
        ja[] var5 = null;
        jl var6 = null;
        int var7_int = 0;
        jl var7 = null;
        jl var8 = null;
        ja[] var9 = null;
        ja[] var10 = null;
        jl var11 = null;
        jl var12 = null;
        ja var13 = null;
        jl var14 = null;
        int var15 = 0;
        String var16 = null;
        rf var17 = null;
        hq var18 = null;
        rf var19 = null;
        jl var20 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var18 = new hq(param1, 2, 2, 2236962, 1, 1, 1, param1.field_r + (param1.field_C + 2));
                        this.field_s = (nl) ((Object) var18);
                        var18.field_q = 16777215;
                        var4 = new jl();
                        var18.a(param0 + -125269882, var4);
                        this.field_d = 5592405;
                        this.field_h = param1;
                        var4.field_i = 11711154;
                        this.field_p = -1;
                        this.field_b = 15658734;
                        this.field_l = 3;
                        this.field_f = 15658734;
                        var4.field_h = 15658734;
                        this.field_m = 3;
                        this.field_c = 3;
                        this.field_e = 3;
                        var4.a(0, (byte) -36).b(15658734, 0).a(vn.a(43, 7829367, 10066329, 8947848), 2147483647);
                        var4.a(1, (byte) -36).a(vn.a(62, 13421772, 10066329, 11184810), 2147483647);
                        var4.a(3, (byte) -36).a(vn.a(67, 10066329, 7829367, 8947848), 2147483647).a(1, 2147483647).a(1, (byte) 47);
                        var5 = new ja[9];
                        var17 = new rf(32, 32);
                        var19 = var17;
                        var7_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var19.field_B.length <= var7_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var17.field_B[var7_int] = 1077952576;
                        var7_int++;
                        if (var15 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5[4] = (ja) ((Object) var17);
                        var4.a(4, (byte) -36).a(true, 2521).a(var5, 2147483647);
                        var4.a(5, (byte) -36).a(u.a(21242, 0, 65793, 0, 0), 2147483647).a(true, 2521).b(-1, 0);
                        this.field_n = (nl) ((Object) var4);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = new jl(var4, true);
                        var6.field_d = 0;
                        var7 = new jl(var4, true);
                        var7.field_d = 0;
                        var7.a(nk.a(8947848, (byte) -98), false);
                        var7.a(1, (byte) -36).a(nk.a(11184810, (byte) 108), 2147483647).b(2236962, 0);
                        this.field_k = (nl) ((Object) new ij(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
                        discarded$3 = new bg(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                        discarded$4 = new wa(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                        var8 = new jl();
                        var18.a(-3, var8);
                        var8.a(0, (byte) -36).a(vn.a(120, 10066329, 7829367, 15658734), 2147483647).b(1118481, 0).a((byte) 44, -1);
                        var8.a(4, (byte) -36).a(true, 2521).a(var5, 2147483647);
                        this.field_o = (nl) ((Object) var8);
                        var9 = new ja[9];
                        var10 = new ja[9];
                        var9[4] = new ja(2, 1);
                        var10[4] = new ja(1, 2);
                        dupTemp$5 = var9[4];
                        dupTemp$5.field_B = new int[]{6710886, 7829367};
                        var10[4].field_B = new int[]{6710886, 7829367};
                        var11 = new jl();
                        var12 = new jl();
                        var11.a(var9, 0, false);
                        if (param0 == 125269879) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var16 = (String) null;
                        this.a(21, (String) null, -114, (byte) -66);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12.a(var10, 0, false);
                        var13 = new ja(7, 4);
                        var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                        var14 = new jl(var4, true);
                        var14.a(var13.c(), (byte) -102);
                        var13.b();
                        var14 = new jl(var4, true);
                        var14.a(var13.c(), (byte) 79);
                        var13.b();
                        var14 = new jl(var4, true);
                        var14.a(var13.c(), (byte) -53);
                        var13.b();
                        var20 = new jl(var4, true);
                        var20.a(var13, (byte) -107);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (runtimeException);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("sk.E(").append(param0).append(',');
                    stackIn_12_1 = stackIn_13_1;
                    if (param1 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        L0: {
          vj.field_t = param1;
          if (b.field_d != t.field_e) {
            var2 = b.field_d * b.field_d;
            var3 = -(t.field_e * t.field_e) + var2;
            param1 = param1 + var3 * (-param1 + km.field_cb) / var2;
            break L0;
          } else {
            break L0;
          }
        }
        dq.field_k.a(120, param1, 640, ck.field_a, -3344);
        eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
        if (param0) {
          sk.a((byte) -33);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, String param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 95) {
                break L1;
              } else {
                this.field_h = (fm) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_g) {
                break L2;
              } else {
                this.a(param2, 2, param1, param0);
                if (!ZombieDawnMulti.field_E) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            this.a(6, param1, param0, param2);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("sk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 != 100) {
          this.field_c = 52;
          oo.g(param1, param2, param5, param0, param3);
          return;
        } else {
          oo.g(param1, param2, param5, param0, param3);
          return;
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_l - -this.field_c;
              var6 = this.field_m + this.field_e;
              var7 = this.field_p;
              if (-1 == var7) {
                var7 = this.field_h.field_C + this.field_h.field_r;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == 2) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var8 = oo.field_b >> -1020346174;
                      var9 = this.field_h.a(param2);
                      var10 = this.field_h.field_r + this.field_h.field_C;
                      var11 = 1;
                      if (var9 > var8) {
                        break L5;
                      } else {
                        if (-1 == param2.indexOf("<br>")) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (vm.field_gb == null) {
                        vm.field_gb = new String[16];
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        if (var9 <= var8) {
                          break L8;
                        } else {
                          var13 = var9 / var8;
                          var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
                          if (var15 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var12 = var8;
                      break L7;
                    }
                    var11 = this.field_h.a(param2, new int[]{var12}, vm.field_gb);
                    var9 = 0;
                    var10 = var10 + var7 * (-1 + var11);
                    var13 = 0;
                    L9: while (true) {
                      if (var11 <= var13) {
                        break L4;
                      } else {
                        var14 = this.field_h.a(vm.field_gb[var13]);
                        var17 = var14 ^ -1;
                        var16 = var9 ^ -1;
                        if (var15 != 0) {
                          if (var16 < var17) {
                            break L3;
                          } else {
                            break L2;
                          }
                        } else {
                          L10: {
                            if (var16 > var17) {
                              var9 = var14;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var13++;
                          if (var15 == 0) {
                            continue L9;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var12 = param3;
                  if (var9 + var12 - -var5_int > oo.field_b) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                var12 = oo.field_b - (var9 - -var5_int);
                break L2;
              }
              L11: {
                var13 = -this.field_h.field_J + (param0 - -32);
                if (var13 - (-var10 + -var6) <= oo.field_l) {
                  break L11;
                } else {
                  var13 = -var10 + param0 - var6;
                  break L11;
                }
              }
              oo.a(var12, var13, var9 + var5_int, var6 + var10, this.field_b);
              oo.e(1 + var12, var13 - -1, -2 + (var5_int + var9), var6 + var10 + -2, this.field_d);
              this.field_h.a(param2, var12 + this.field_l, var13 - -this.field_e, var9, var10, this.field_f, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("sk.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public sk() {
        this.field_g = true;
    }

    static {
        field_r = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Powerups with this modifier will fool even enemy overlords.";
    }
}
