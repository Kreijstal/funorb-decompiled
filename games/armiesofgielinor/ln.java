/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static boolean field_e;
    int[] field_b;
    static byte[] field_d;
    static String field_c;
    int[] field_a;

    final int b(byte param0) {
        if (!((this.field_a[4] ^ -1) != 0)) {
            return -20;
        }
        int var2 = -4 % ((47 - param0) / 62);
        return 0;
    }

    final int a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.b((byte) 83);
                break L1;
              }
            }
            stackIn_3_0 = cc.a(param5, param3, this.field_a, param6, -1, true, param2, param4, this.field_b, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ln.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 21930) {
          this.a(42, -104, -118);
          return tt.a(param0 - param3, param4 + -param2, this.field_a, false);
        } else {
          return tt.a(param0 - param3, param4 + -param2, this.field_a, false);
        }
    }

    final String a(byte param0) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        String var2 = "coat=";
        int var3 = -16 % ((param0 - -23) / 40);
        for (var4 = 0; this.field_a.length > var4; var4++) {
            var2 = var2 + this.field_a[var4] + ":" + this.field_b[var4] + ":";
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_d = null;
    }

    final static void a(kl param0, kl param1, kl param2, int param3) {
        qb[] array$0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        String var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ck.field_e = new qb[or.field_f.length][];
            var4_int = param3;
            L1: while (true) {
              if (or.field_f.length <= var4_int) {
                L2: {
                  if (!ta.field_L) {
                    var12 = 0;
                    var4_int = var12;
                    L3: while (true) {
                      if (-7 >= (var12 ^ -1)) {
                        break L2;
                      } else {
                        L4: {
                          var11 = ArmiesOfGielinor.field_N[var12];
                          var5 = var11;
                          if (var5 == null) {
                            pv.field_a[var12] = new qb[]{};
                            break L4;
                          } else {
                            pv.field_a[var12] = new qb[1];
                            var6 = bv.field_u[var12];
                            pv.field_a[var12][0] = new qb(param0, var11, var6);
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                nl.a(param1, ck.field_e, param2, (byte) 126);
                nl.a(param1, pv.field_a, param2, (byte) 126);
                qv.c(param3 ^ -11757);
                break L0;
              } else {
                var10 = or.field_f[var4_int];
                var5 = var10;
                var6_int = jq.field_I[var4_int].length;
                array$0 = new qb[var6_int];
                ck.field_e[var4_int] = array$0;
                var7 = 0;
                L5: while (true) {
                  if (var6_int <= var7) {
                    var4_int++;
                    continue L1;
                  } else {
                    var8 = jq.field_I[var4_int][var7];
                    ck.field_e[var4_int][var7] = new qb(param0, var10, var8);
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ln.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 < 52) {
            return;
        }
        this.field_a[param2] = param1;
    }

    final wk a(String param0, byte param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        nj stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              if (param1 == -70) {
                break L1;
              } else {
                var5 = (String) null;
                this.a(false, true, (byte) -47, true, false, true, -69, (String) null, 102);
                break L1;
              }
            }
            L2: {
              no.field_P.field_B = qn.field_d;
              no.field_P.field_y = qn.field_l;
              ku.field_J.b();
              qn.b();
              if (param2) {
                break L2;
              } else {
                var4_int = this.field_a[3];
                this.field_a[3] = -1;
                cc.a(0, -1, this.field_a, -1, -1, false, -1, param0, this.field_b, 0);
                this.field_a[3] = var4_int;
                break L2;
              }
            }
            dm.a(-1, -1, this.field_a, -1, false, this.field_b, -1, false, 0, false, 0, param0);
            no.field_P.b();
            stackIn_5_0 = ew.a((byte) 107, ku.field_J);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ln.G(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (wk) ((Object) stackIn_5_0);
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, String param5, boolean param6, boolean param7, boolean param8, int param9) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var11 = null;
        int var11_int = 0;
        RuntimeException var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              no.field_P.field_B = qn.field_d;
              no.field_P.field_y = qn.field_l;
              if (param8) {
                L2: {
                  L3: {
                    if (null == dv.field_k) {
                      break L3;
                    } else {
                      if (param1 != t.field_f) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  dv.field_k = a.field_m[0].g();
                  var21 = dv.field_k.field_B;
                  var20 = var21;
                  var19 = var20;
                  var11 = var19;
                  var12 = 0;
                  L4: while (true) {
                    if (var21.length <= var12) {
                      break L2;
                    } else {
                      var13 = 255 & var21[var12];
                      var14 = (param1 >> -460363248 & 255) * var13 >> 117135016;
                      var15 = var13 * ((65280 & param1) >> -440616568) >> 581166312;
                      var16 = (255 & param1) * var13 >> 599129992;
                      var11[var12] = (var15 << -644131672) + ((var14 << 1530946064) + var16);
                      var12++;
                      continue L4;
                    }
                  }
                }
                dv.field_k.d(-20 + param4, param2 - 15, 92, 92, 256);
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              ku.field_J.b();
              qn.b();
              if (param6) {
                cc.a(0, -1, this.field_a, -1, -1, false, -1, param5, this.field_b, 0);
                break L5;
              } else {
                var11_int = this.field_a[3];
                this.field_a[3] = -1;
                cc.a(0, -1, this.field_a, -1, -1, false, -1, param5, this.field_b, 0);
                this.field_a[3] = var11_int;
                break L5;
              }
            }
            L6: {
              if (!param7) {
                if (!param0) {
                  if (param3) {
                    a.field_m[3].g(0, 0);
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  break L6;
                }
              } else {
                a.field_m[1].g(0, 0);
                break L6;
              }
            }
            no.field_P.b();
            ku.field_J.e(param4, param2);
            if (param9 == -19744) {
              break L0;
            } else {
              var18 = (String) null;
              this.a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var11_ref);

            stackIn_25_1 = new StringBuilder().append("ln.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4, boolean param5, int param6, String param7, int param8) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              no.field_P.field_B = qn.field_d;
              no.field_P.field_y = qn.field_l;
              ku.field_J.b();
              qn.b();
              if (!param3) {
                var10_int = this.field_a[3];
                this.field_a[3] = -1;
                cc.a(0, -1, this.field_a, -1, -1, false, -1, param7, this.field_b, 0);
                this.field_a[3] = var10_int;
                break L1;
              } else {
                cc.a(0, -1, this.field_a, -1, -1, false, -1, param7, this.field_b, 0);
                break L1;
              }
            }
            L2: {
              if (param0) {
                a.field_m[1].g(0, 0);
                break L2;
              } else {
                if (!param5) {
                  if (!param4) {
                    break L2;
                  } else {
                    a.field_m[3].g(0, 0);
                    break L2;
                  }
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  break L2;
                }
              }
            }
            L3: {
              if (param2 == 68) {
                break L3;
              } else {
                field_d = (byte[]) null;
                break L3;
              }
            }
            ko.field_g.b();
            qn.b();
            ku.field_J.e(0, 0);
            no.field_P.b();
            ko.field_g.h(param8, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var10);

            stackIn_16_1 = new StringBuilder().append("ln.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        this.field_b[param0] = param1;
        if (param2 > -93) {
            this.field_b = (int[]) null;
        }
    }

    final void a(int param0, String param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6, int param7) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 > 16) {
                break L1;
              } else {
                field_d = (byte[]) null;
                break L1;
              }
            }
            L2: {
              no.field_P.field_y = qn.field_l;
              no.field_P.field_B = qn.field_d;
              no.field_P.field_v = qn.field_g;
              if (param6) {
                a.field_m[0].d(-40 + param0, -30 + param4, 184, 184, 256);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ku.field_J.b();
              qn.b();
              cc.a(0, -1, this.field_a, -1, -1, false, -1, param1, this.field_b, 0);
              if (!param3) {
                if (!param2) {
                  if (!param5) {
                    break L3;
                  } else {
                    a.field_m[3].g(0, 0);
                    break L3;
                  }
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  break L3;
                }
              } else {
                a.field_m[1].g(0, 0);
                break L3;
              }
            }
            no.field_P.b();
            ku.field_J.h(param0, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var9);

            stackIn_16_1 = new StringBuilder().append("ln.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ln(int[] param0, int[] param1) {
        try {
            this.field_a = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ln() {
        this.field_a = new int[6];
        this.field_b = new int[6];
        this.field_a[0] = 0;
        this.field_a[3] = 0;
        this.field_a[2] = -1;
        this.field_a[4] = -1;
        this.field_a[1] = -1;
        this.field_a[5] = 0;
        this.field_b[3] = 0;
        this.field_b[5] = 0;
        this.field_b[2] = 0;
        this.field_b[1] = 0;
        this.field_b[4] = 0;
        this.field_b[0] = 0;
    }

    static {
        field_e = false;
        field_c = "<%0> of <%1> strength";
    }
}
