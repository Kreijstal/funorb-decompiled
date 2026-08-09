/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String[] field_e;
    static ji field_a;
    static int[] field_d;
    bh field_c;
    private bh field_b;

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -1) {
          L0: {
            field_d = (int[]) null;
            if (this.field_c.field_b != this.field_c) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_c.field_b != this.field_c) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void c(int param0) {
        int statePc = 0;
        int var3 = 0;
        bh var4 = null;
        bh var5 = null;
        bh var6 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    if (param0 >= 104) {
                        statePc = 10;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = (bh) null;
                    this.a((bh) null, 114);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = this.field_c.field_b;
                    if (this.field_c == var6) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6.b((byte) 120);
                    statePc = 8;
                    continue stateLoop;
                }
                case 4: {
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6.b((byte) 120);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_b = null;
                    return;
                }
                case 10: {
                    var5 = this.field_c.field_b;
                    if (this.field_c != var5) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var3 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5.b((byte) 120);
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    var5.b((byte) 120);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var3 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_b = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bh d(int param0) {
        bh var2;
        if (param0 < -23) {
          var2 = this.field_c.field_a;
          if (this.field_c == var2) {
            return null;
          } else {
            var2.b((byte) 115);
            return var2;
          }
        } else {
          return (bh) null;
        }
    }

    final void a(int param0, bh param1, vj param2) {
        bh var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = this.field_c.field_a;
              this.field_c.field_a = param1.field_a;
              param1.field_a.field_b = this.field_c;
              if (param0 <= -95) {
                break L1;
              } else {
                this.field_b = (bh) null;
                break L1;
              }
            }
            if (param1 == this.field_c) {
              break L0;
            } else {
              param1.field_a = param2.field_c.field_a;
              param1.field_a.field_b = param1;
              var4.field_b = param2.field_c;
              param2.field_c.field_a = var4;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("vj.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    final bh a(int param0, bh param1) {
        bh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        bh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 1) {
                break L1;
              } else {
                this.b(-55);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  break L3;
                } else {
                  var3 = this.field_c.field_b;
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = param1;
              break L2;
            }
            if (this.field_c != var3) {
              this.field_b = var3.field_b;
              stackIn_9_0 = (bh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_b = null;
              stackIn_7_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("vj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bh) ((Object) stackIn_7_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ck var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cm.field_f.b(-30693);
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var1_int >= 32) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        sf.field_y[var1_int] = 0L;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-33 >= (var1_int ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        jd.field_Ub[var1_int] = 0L;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var2 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        vm.field_r = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3 = (ck) null;
                        vj.a((ck) null, -91);
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1), "vj.H(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bh c(boolean param0) {
        bh var2 = null;
        if (!param0) {
            field_d = (int[]) null;
            var2 = this.field_b;
            if (!(var2 != this.field_c)) {
                this.field_b = null;
                return null;
            }
            this.field_b = var2.field_a;
            return var2;
        }
        var2 = this.field_b;
        if (!(var2 != this.field_c)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_a;
        return var2;
    }

    public static void b(byte param0) {
        if (param0 != 79) {
            return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static ck[] a(ck param0, int param1) {
        ck[] var2 = null;
        RuntimeException var2_ref = null;
        ck[] var3 = null;
        ck[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 32169) {
                break L1;
              } else {
                vj.e(-16);
                break L1;
              }
            }
            var3 = new ck[9];
            var2 = var3;
            var3[4] = param0;
            stackIn_3_0 = (ck[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("vj.A(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final bh c(byte param0) {
        int var2 = -55 / ((param0 - -17) / 35);
        bh var3 = this.field_c.field_b;
        if (!(var3 != this.field_c)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var3.field_b;
        return var3;
    }

    final void a(bh param0, int param1) {
        if (!(param0.field_a == null)) {
            param0.b((byte) 124);
        }
        param0.field_b = this.field_c;
        param0.field_a = this.field_c.field_a;
        if (param1 != 2777) {
            return;
        }
        try {
            param0.field_a.field_b = param0;
            param0.field_b.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bh d(boolean param0) {
        if (!param0) {
            return (bh) null;
        }
        bh var2 = this.field_b;
        if (!(var2 != this.field_c)) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final bh b(boolean param0) {
        bh var2;
        if (param0) {
          var2 = this.field_c.field_a;
          if (this.field_c == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_a;
            return var2;
          }
        } else {
          return (bh) null;
        }
    }

    final void b(bh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_a != null) {
                param0.b((byte) 115);
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_b = this.field_c.field_b;
            param0.field_a = this.field_c;
            param0.field_a.field_b = param0;
            param0.field_b.field_a = param0;
            if (param1 == 7143) {
              break L0;
            } else {
              this.d(false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vj.E(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final bh a(int param0) {
        bh var2;
        var2 = this.field_c.field_b;
        if (this.field_c != var2) {
          var2.b((byte) 108);
          if (param0 != 4) {
            return (bh) null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final int a(byte param0) {
        int var2;
        int var3;
        bh var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = 60 % ((param0 - 13) / 50);
        var4 = this.field_c.field_b;
        L0: while (true) {
          L1: {
            if (this.field_c == var4) {
              break L1;
            } else {
              var2++;
              var4 = var4.field_b;
              if (var5 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2;
        }
    }

    public vj() {
        this.field_c = new bh();
        this.field_c.field_a = this.field_c;
        this.field_c.field_b = this.field_c;
    }

    final static qm[] e(int param0) {
        if (param0 != -23521) {
          vj.a(false);
          return new qm[]{nh.field_i, ta.field_a, ie.field_d, gf.field_e, ul.field_e, oi.field_d, nk.field_f, vk.field_d, rg.field_g, wg.field_a, de.field_U, qm.field_g, rf.field_k, gh.field_c};
        } else {
          return new qm[]{nh.field_i, ta.field_a, ie.field_d, gf.field_e, ul.field_e, oi.field_d, nk.field_f, vk.field_d, rg.field_g, wg.field_a, de.field_U, qm.field_g, rf.field_k, gh.field_c};
        }
    }

    static {
        field_d = new int[8192];
    }
}
