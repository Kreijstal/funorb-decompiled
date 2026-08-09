/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements ol {
    static float field_r;
    private e field_p;
    static byte[][] field_j;
    private int field_l;
    private int field_n;
    static byte[] field_d;
    static int field_g;
    private int field_f;
    private int field_b;
    private int field_a;
    static String field_k;
    private int field_q;
    private int field_h;
    private int field_o;
    static String field_i;
    private int field_c;
    private int field_e;
    private int field_m;

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 > 57) {
                break L1;
              } else {
                lj.b(114);
                break L1;
              }
            }
            field_i = null;
            field_j = (byte[][]) null;
            field_d = null;
            field_k = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "lj.C(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        double stackIn_7_0 = 0.0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (null == vg.field_I) {
                  break L2;
                } else {
                  L3: {
                    mn.a(false);
                    fe.g(1);
                    if (vg.field_I.field_e == 1) {
                      stackIn_7_0 = 0.0;
                      break L3;
                    } else {
                      stackIn_7_0 = 3.141592653589793;
                      break L3;
                    }
                  }
                  sj.field_o = (float)stackIn_7_0;
                  if (!Virogrid.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              sj.field_o = 3.1415927410125732f;
              break L1;
            }
            if (param0 >= 96) {
              L4: {
                el.a(true, (byte) -106);
                vm.field_d[0] = (double)field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)field_r * Math.cos((double)cf.field_c);
                gb.c((byte) -44);
                ka.a(false, (byte) 87);
                vm.a((byte) 30, u.field_t);
                var1_int = sh.a(4712, 3);
                if (kn.field_B == var1_int) {
                  var1_int = (1 + kn.field_B) % 3;
                  break L4;
                } else {
                  break L4;
                }
              }
              kn.field_B = var1_int;
              ei.a(0, oi.field_c[var1_int + 1]);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) runtimeException), "lj.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        fi stackIn_4_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        gn var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
          L0: {
            L1: {
              if (param1 instanceof gn) {
                stackIn_4_0 = (fi) (param1);
                break L1;
              } else {
                stackIn_4_0 = null;
                break L1;
              }
            }
            L2: {
              var6 = (gn) ((Object) stackIn_4_0);
              if (var6 != null) {
                param2 = param2 & var6.field_C;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param4 == -23294) {
                break L3;
              } else {
                this.a(107, (fi) null, true, -95, -123);
                break L3;
              }
            }
            L4: {
              var7 = 5592405;
              df.b(param0 - -param1.field_l, param1.field_u + param3, param1.field_g, param1.field_m, this.field_l);
              if (param2) {
                var7 = 16777215;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = param0 - (-param1.field_l - this.field_f);
              var9 = this.field_a + (param3 - -param1.field_u);
              df.f(var8, var9, this.field_n, this.field_o, 5592405);
              df.b(var8, var9, this.field_n, this.field_o, var7);
              if (!var6.field_z) {
                break L5;
              } else {
                df.a(var8, var9, this.field_n + var8, this.field_o + var9, 1);
                df.a(var8 - -this.field_n, var9, var8, this.field_o + var9, 1);
                break L5;
              }
            }
            L6: {
              if (null == this.field_p) {
                break L6;
              } else {
                var10 = this.field_n + (this.field_f + this.field_e);
                this.field_p.a(param1.field_n, var10 + (param1.field_l + param0), param1.field_u + param3 - -this.field_q, param1.field_g - var10 + -this.field_e, -(this.field_e << -1482831743) + param1.field_m, this.field_c, this.field_b, this.field_h, this.field_m, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var6_ref);

            stackIn_24_1 = new StringBuilder().append("lj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, wm param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
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
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = pn.a(3 * (param0 - param3), (byte) -75);
                        var6 = param3 * 3;
                        a.b(12);
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var7 = -10 + var5_int;
                        if ((param4.field_a ^ -1) >= -1) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == param4.field_z) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        em.b(0);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ck.field_f = 0;
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param4.field_k <= var8) {
                            statePc = 45;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = param4.field_J[var8];
                        var10 = param4.field_e[var8];
                        var11 = param4.field_j[var8];
                        stackOut_11_0 = param2;
                        stackIn_46_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!stackIn_12_0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = en.field_Hb[var9];
                        var13 = ld.field_h[var9];
                        var14 = en.field_Hb[var10] + -var12;
                        var15 = en.field_Hb[var11] + -var12;
                        var16 = ld.field_h[var10] - var13;
                        var17 = -var13 + ld.field_h[var11];
                        if (-1 >= (var14 * var17 - var15 * var16 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = dn.field_a[var9];
                        if (-2147483648 == var12) {
                            statePc = 44;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var13 = dn.field_a[var10];
                        if (var13 != -2147483648) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var14 = dn.field_a[var11];
                        if (-2147483648 == var14) {
                            statePc = 44;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var15 = -var6 + var12 + var13 - -var14;
                        stackIn_25_0 = da.field_g.length;
                        stackIn_23_0 = stackIn_25_0;
                        stackIn_25_1 = -1;
                        stackIn_23_1 = stackIn_25_1;
                        if (0 <= var7) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = stackIn_23_0;
                        stackIn_26_1 = stackIn_23_1;
                        stackIn_26_2 = var15 << -var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = stackIn_25_0;
                        stackIn_26_1 = stackIn_25_1;
                        stackIn_26_2 = var15 >> var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16 = stackIn_26_0 + (stackIn_26_1 + -stackIn_26_2);
                        var17 = da.field_g[var16];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var17 >> 1231154692 ^ -1) == -1) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16--;
                        stackIn_36_0 = var16 ^ -1;
                        stackIn_29_0 = stackIn_36_0;
                        stackIn_36_1 = -1;
                        stackIn_29_1 = stackIn_36_1;
                        if (var19 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 > stackIn_29_1) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var17 = da.field_g[var16];
                        if (var19 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var16 << -307386940;
                        stackIn_36_1 = var17;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var18 = stackIn_36_0 + stackIn_36_1;
                        bf.field_m[var18] = var8;
                        da.field_g[var16] = 1 + var17;
                        if ((param4.field_a ^ -1) >= -1) {
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (param4.field_z != null) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        dupTemp$0 = param4.field_z[var8];
                        ph.field_o[dupTemp$0] = ph.field_o[dupTemp$0] + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ck.field_f = ck.field_f + 1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = param4.field_a ^ -1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 >= -1) {
                            statePc = 64;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (param4.field_z != null) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var9 >= ph.field_o.length) {
                            statePc = 64;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var10 = ph.field_o[var9];
                        ph.field_o[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var19 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_62_0 = (RuntimeException) (var5);
                    stackIn_60_0 = stackIn_62_0;
                    stackIn_62_1 = new StringBuilder().append("lj.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_60_1 = stackIn_62_1;
                    if (param4 == null) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_63_2 = "{...}";
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_63_2 = "null";
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    throw kg.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ')');
                }
                case 64: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, jc param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ve.field_s = param1.c((byte) 83) << 1973319621;
              var2_int = param1.g(11132);
              ve.field_s = ve.field_s + (var2_int >> -1224722717);
              ng.field_X = (var2_int & 7) << 714934034;
              ng.field_X = ng.field_X + (param1.c((byte) -43) << -207788830);
              var2_int = param1.g(11132);
              if (param0) {
                break L1;
              } else {
                field_r = 0.6400812864303589f;
                break L1;
              }
            }
            ng.field_X = ng.field_X + (var2_int >> -1073484602);
            ug.field_b = (63 & var2_int) << -112872785;
            ug.field_b = ug.field_b + (param1.g(11132) << -1838234041);
            var2_int = param1.g(11132);
            lm.field_j = (var2_int & 1) << -448396304;
            ug.field_b = ug.field_b + (var2_int >> -28791807);
            lm.field_j = lm.field_j + param1.c((byte) 70);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("lj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    lj(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 1;
        this.field_m = 1;
        try {
          L0: {
            this.field_l = param9;
            this.field_e = param1;
            this.field_p = param0;
            this.field_a = param6;
            this.field_n = param8;
            this.field_q = param2;
            this.field_f = param5;
            this.field_c = param3;
            this.field_o = param7;
            this.field_b = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("lj.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -28791807) {
                break L1;
              } else {
                lj.b(43);
                break L1;
              }
            }
            stackIn_4_0 = um.field_Fb;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "lj.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_k = "The game options are not all set.";
        field_i = "<%0> has dropped out.";
    }
}
