/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends df implements bn, vb {
    static int field_Q;
    private boolean field_R;
    static String field_D;
    private ag field_L;
    private rn field_O;
    static ll[] field_M;
    private ag field_P;
    static ll[] field_I;
    private String field_E;
    static String field_C;
    private ag field_J;
    private boolean field_N;
    private rn field_G;
    private boolean field_F;

    public final void a(rn param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -20626) {
                break L1;
              } else {
                e.a(12);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("e.G(");

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void g(byte param0) {
        RuntimeException runtimeException = null;
        rb var1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -49) {
              L1: {
                var1 = (rb) ((Object) pb.field_m.b(12623));
                if (null != var1) {
                  var1.field_h = var1.field_h - 1;
                  if (var1.field_h >= 0) {
                    break L1;
                  } else {
                    var1.a(true);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
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
          throw aa.a((Throwable) ((Object) runtimeException), "e.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(rn param0, int param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_O != param0) {
                break L1;
              } else {
                this.field_G.a(0, (qm) (this));
                break L1;
              }
            }
            L2: {
              if (this.field_G == param0) {
                this.a((byte) -83);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 >= 73) {
                break L3;
              } else {
                this.a((rn) null, 105);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("e.H(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, (byte) -123, param2, param3)) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= -120) {
                  break L1;
                } else {
                  this.field_P = (ag) null;
                  break L1;
                }
              }
              if (-99 != (param3 ^ -1)) {
                if (-100 == (param3 ^ -1)) {
                  stackIn_15_0 = this.b(2, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_17_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_10_0 = this.a(param0, 9555);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("e.N(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        rn var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_O;
              var4 = param1;
              var3.a(false, var4, false);
              if (param0 == 26152) {
                break L1;
              } else {
                this.field_G = (rn) null;
                break L1;
              }
            }
            this.field_G.g(3545);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("e.J(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                e.g((byte) 123);
                break L1;
              }
            }
            qj.field_a = param4;
            mo.field_h = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "e.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_C = null;
        field_I = null;
        if (param0 != -1) {
            return;
        }
        try {
            field_M = null;
            field_D = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "e.I(" + param0 + ')');
        }
    }

    final static void a(byte[] param0, boolean param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        wk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new wk(param0);
                        var2.field_g = param0.length - 2;
                        h.field_J = var2.n(-98);
                        jg.field_p = new int[h.field_J];
                        vi.field_O = new byte[h.field_J][];
                        be.field_d = new int[h.field_J];
                        ho.field_i = new int[h.field_J];
                        ln.field_I = new byte[h.field_J][];
                        hl.field_l = new int[h.field_J];
                        dn.field_Ib = new boolean[h.field_J];
                        var2.field_g = param0.length - (7 - -(h.field_J * 8));
                        pb.field_g = var2.n(-98);
                        gn.field_a = var2.n(-98);
                        var3 = 1 + (var2.e((byte) -103) & 255);
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) <= (h.field_J ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        hl.field_l[var4] = var2.n(-98);
                        var4++;
                        if (var15 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 100;
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
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 >= h.field_J) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        be.field_d[var4] = var2.n(-98);
                        var4++;
                        if (var15 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var15 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (h.field_J <= var4) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        jg.field_p[var4] = var2.n(-98);
                        var4++;
                        if (var15 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((h.field_J ^ -1) >= (var4 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ho.field_i[var4] = var2.n(-98);
                        var4++;
                        if (var15 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var15 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2.field_g = -(3 * (-1 + var3)) + -(8 * h.field_J) + (-7 + param0.length);
                        ph.field_c = new int[var3];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4 >= var3) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ph.field_c[var4] = var2.h(11609);
                        stackIn_42_0 = -1;
                        stackIn_35_0 = stackIn_42_0;
                        stackIn_42_1 = ph.field_c[var4] ^ -1;
                        stackIn_35_1 = stackIn_42_1;
                        if (var15 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 != stackIn_35_1) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ph.field_c[var4] = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var2.field_g = 0;
                        stackIn_42_0 = param1 ? 1 : 0;
                        stackIn_42_1 = 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == stackIn_42_1) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        e.a((hc) null, -42, (hc) null);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = h.field_J ^ -1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = stackIn_47_0;
                        stackIn_48_1 = var4;
                        stackIn_48_2 = -1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (stackIn_48_0 >= (stackIn_48_1 ^ stackIn_48_2)) {
                            statePc = 105;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var5 = jg.field_p[var4];
                        var6 = ho.field_i[var4];
                        var7 = var5 * var6;
                        var8 = new byte[var7];
                        ln.field_I[var4] = var8;
                        var9 = new byte[var7];
                        vi.field_O[var4] = var9;
                        var10 = 0;
                        var11 = var2.e((byte) -117);
                        if (var15 != 0) {
                            statePc = 105;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var11 & 1 ^ -1) != -1) {
                            statePc = 69;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var12 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var12 >= var7) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var8[var12] = var2.o(6);
                        var12++;
                        if (var15 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var15 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (0 == (var11 & 2)) {
                            statePc = 97;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var12 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var12 ^ -1) <= (var7 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        dupTemp$0 = var2.o(6);
                        var9[var12] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_48_0 = var10;
                        stackIn_63_0 = stackIn_48_0;
                        stackIn_48_1 = 0;
                        stackIn_63_1 = stackIn_48_1;
                        stackIn_48_2 = var13 ^ -1;
                        stackIn_63_2 = stackIn_48_2;
                        if (var15 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_66_0 = stackIn_63_0;
                        stackIn_64_0 = stackIn_66_0;
                        if (stackIn_63_1 == stackIn_63_2) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_67_0 = stackIn_64_0;
                        stackIn_67_1 = 1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = stackIn_66_0;
                        stackIn_67_1 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var10 = stackIn_67_0 | stackIn_67_1;
                        var12++;
                        if (var15 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var15 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var12 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var5 <= var12) {
                            statePc = 80;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_81_0 = 0;
                        stackIn_72_0 = stackIn_81_0;
                        if (var15 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var13 = stackIn_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((var6 ^ -1) >= (var13 ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var8[var13 * var5 + var12] = var2.o(6);
                        var13++;
                        if (var15 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var15 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var12++;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var15 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = 0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (stackIn_81_0 != (var11 & 2)) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var12 = 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = var5;
                        stackIn_86_1 = var12;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 <= stackIn_86_1) {
                            statePc = 97;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackIn_47_0 = 0;
                        stackIn_88_0 = stackIn_47_0;
                        if (var15 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var13 = stackIn_88_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if ((var13 ^ -1) <= (var6 ^ -1)) {
                            statePc = 96;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        dupTemp$1 = var2.o(6);
                        var9[var5 * var13 + var12] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_86_0 = var10;
                        stackIn_91_0 = stackIn_86_0;
                        stackIn_86_1 = var14 ^ -1;
                        stackIn_91_1 = stackIn_86_1;
                        if (var15 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackIn_94_0 = stackIn_91_0;
                        stackIn_92_0 = stackIn_94_0;
                        if (stackIn_91_1 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackIn_95_0 = stackIn_92_0;
                        stackIn_95_1 = 1;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackIn_95_0 = stackIn_94_0;
                        stackIn_95_1 = 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var10 = stackIn_95_0 | stackIn_95_1;
                        var13++;
                        if (var15 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        dn.field_Ib[var4] = var10 != 0;
                        var4++;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var15 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 100: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_103_0 = (RuntimeException) (var2_ref);
                    stackIn_101_0 = stackIn_103_0;
                    stackIn_103_1 = new StringBuilder().append("e.Q(");
                    stackIn_101_1 = stackIn_103_1;
                    if (param0 == null) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_104_0 = (RuntimeException) ((Object) stackIn_101_0);
                    stackIn_104_1 = (StringBuilder) ((Object) stackIn_101_1);
                    stackIn_104_2 = "{...}";
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                    stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                    stackIn_104_2 = "null";
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    throw aa.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param1 + ')');
                }
                case 105: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(boolean param0) {
        try {
            this.field_O.g(3545);
            this.field_G.g(3545);
            if (!param0) {
                this.field_G = (rn) null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "e.M(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (null != this.field_E) {
                ia.field_c.a(this.field_E, 20 + this.field_n + param1, 15 + (this.field_j + param3), this.field_v + -40, this.field_k, 16777215, -1, 1, 0, ia.field_c.field_C);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_J == null) {
                break L2;
              } else {
                de.f(param1 + 10, param3 + 134, this.field_v - 20, 4210752);
                break L2;
              }
            }
            L3: {
              super.a((byte) -62, param1, param2, param3);
              if (param0 < -52) {
                break L3;
              } else {
                e.a(-70);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "e.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    e(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (pf) null);
        ke dupTemp$0 = null;
        ke dupTemp$1 = null;
        Object stackIn_15_0 = null;
        Object stackIn_17_0 = null;
        ag stackIn_17_1 = null;
        ag stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ag stackIn_18_1 = null;
        ag stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_95_1 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        mm var6 = null;
        RuntimeException var6_ref = null;
        dj var7 = null;
        String var8 = null;
        ql var9 = null;
        ke var10 = null;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_F = param2;
              this.field_N = param4;
              this.field_E = param1;
              this.field_R = param3;
              if (!this.field_F) {
                break L1;
              } else {
                L2: {
                  if (this.field_R) {
                    break L2;
                  } else {
                    if (!this.field_N) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L3: {
              L4: {
                this.field_O = (rn) ((Object) new bi(param0, (wc) (this), 100));
                this.field_G = (rn) ((Object) new bi("", (wc) (this), 20));
                if (!this.field_F) {
                  break L4;
                } else {
                  this.field_P = new ag(sk.field_b, (wc) null);
                  this.field_L = new ag(ki.field_u, (wc) null);
                  this.field_O.field_B = false;
                  if (var11 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                this.field_P = new ag(w.field_Qb, (wc) null);
                stackIn_17_0 = this;

                stackIn_17_1 = null;

                stackIn_17_2 = null;

                if (this.field_N) {
                  stackIn_18_0 = this;
                  stackIn_18_1 = null;
                  stackIn_18_2 = null;
                  stackIn_18_3 = rc.field_n;
                  break L5;
                } else {
                  stackIn_15_0 = this;


                  stackIn_18_0 = this;
                  stackIn_18_1 = null;
                  stackIn_18_2 = null;
                  stackIn_18_3 = ae.field_b;
                  break L5;
                }
              }
              ((e) (this)).field_L = new ag(stackIn_18_3, (wc) null);
              if (this.field_R) {
                this.field_J = new ag(ib.field_t, (wc) (this));
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              this.field_O.field_r = (pf) ((Object) new ib(10000536));
              this.field_G.field_r = (pf) ((Object) new tc(10000536));
              var6 = new mm();
              this.field_P.field_r = (pf) ((Object) var6);
              if (null == this.field_L) {
                break L6;
              } else {
                this.field_L.field_r = (pf) ((Object) var6);
                break L6;
              }
            }
            L7: {
              if (this.field_J != null) {
                this.field_J.field_r = (pf) ((Object) var6);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              this.field_O.field_q = ln.field_L;
              if (this.field_J == null) {
                break L8;
              } else {
                this.field_J.field_q = dh.field_Bb;
                break L8;
              }
            }
            L9: {
              L10: {
                if (!this.field_F) {
                  break L10;
                } else {
                  this.field_L.field_q = fo.field_e;
                  if (var11 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if (this.field_N) {
                  break L11;
                } else {
                  this.field_L.field_r = (pf) ((Object) new gm());
                  if (var11 == 0) {
                    break L9;
                  } else {
                    break L11;
                  }
                }
              }
              this.field_L.field_q = hj.field_c;
              this.field_L.field_r = (pf) ((Object) new gm());
              break L9;
            }
            L12: {
              this.field_j = 15;
              var7 = ia.field_c;
              if (this.field_E == null) {
                break L12;
              } else {
                this.field_j = this.field_j + (5 + var7.a(this.field_E, -40 + this.field_v, var7.field_C));
                break L12;
              }
            }
            L13: {
              L14: {
                var8 = jl.field_b;
                var9 = oj.a(122, cd.e(117));
                if (var9 != ea.field_y) {
                  break L14;
                } else {
                  var8 = cn.field_H;
                  if (var11 == 0) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              if (of.field_n == var9) {
                var8 = wh.field_b;
                break L13;
              } else {
                break L13;
              }
            }
            L15: {
              dupTemp$0 = new ke(10, this.field_j, this.field_v + -20, 25, this.field_O, false, 80, 3, var7, 16777215, var8);
              var10 = dupTemp$0;
              this.c(-108, dupTemp$0);
              this.field_j = this.field_j + (((qm) ((Object) var10)).field_k + 5);
              dupTemp$1 = new ke(10, this.field_j, this.field_v + -20, 25, this.field_G, false, 80, 3, var7, 16777215, eh.field_a);
              var10 = dupTemp$1;
              this.c(-108, dupTemp$1);
              this.field_P.field_o = (wc) (this);
              this.field_j = this.field_j + (((qm) ((Object) var10)).field_k - -5);
              if (this.field_J == null) {
                break L15;
              } else {
                this.field_J.field_o = (wc) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_L) {
                break L16;
              } else {
                this.field_L.field_o = (wc) (this);
                break L16;
              }
            }
            L17: {
              L18: {
                if (this.field_J != null) {
                  break L18;
                } else {
                  this.field_P.a(30, this.field_j, -10 + (this.field_v + -6), 8, -80);
                  this.field_j = this.field_j + 35;
                  if (var11 == 0) {
                    break L17;
                  } else {
                    break L18;
                  }
                }
              }
              this.field_P.a(30, this.field_j, -95 + this.field_v, 85, -126);
              this.field_j = this.field_j + 60;
              break L17;
            }
            L19: {
              if (null == this.field_J) {
                break L19;
              } else {
                this.field_J.a(30, this.field_j, -10 + (-6 + this.field_v), 8, -78);
                this.field_j = this.field_j + 35;
                break L19;
              }
            }
            L20: {
              if (this.field_L == null) {
                break L20;
              } else {
                L21: {
                  L22: {
                    if (this.field_F) {
                      break L22;
                    } else {
                      if (!this.field_N) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  this.field_L.a(30, this.field_j, this.field_v - 16, 8, -51);
                  this.field_j = this.field_j + 35;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
                this.field_L.a(20, this.field_j, 40, 8, -100);
                this.field_j = this.field_j + 25;
                break L20;
              }
            }
            L23: {
              this.a(3 + this.field_j, 0, this.field_v, 0, -111);
              this.c(-105, this.field_P);
              if (null == this.field_J) {
                break L23;
              } else {
                this.c(-93, this.field_J);
                break L23;
              }
            }
            L24: {
              if (null == this.field_L) {
                break L24;
              } else {
                this.c(-100, this.field_L);
                break L24;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var6_ref = decompiledCaughtException;
            stackIn_91_0 = (RuntimeException) (var6_ref);

            stackIn_91_1 = new StringBuilder().append("e.<init>(");

            if (param0 == null) {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "null";
              break L25;
            } else {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackIn_92_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackIn_92_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(',');

            if (param1 == null) {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L26;
            } else {
              stackIn_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L26;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_92_0), stackIn_96_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (lj.b(true)) {
                  break L2;
                } else {
                  if (this.field_O.field_g.length() <= 0) {
                    break L1;
                  } else {
                    if (-1 > (this.field_G.field_g.length() ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              im.a(this.field_O.field_g, 0, this.field_G.field_g);
              break L1;
            }
            var2_int = -118 % ((param0 - -17) / 46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "e.O(" + param0 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var7 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                e.b(-36, (String) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_P == param4) {
                  break L3;
                } else {
                  L4: {
                    if (param4 == this.field_J) {
                      break L4;
                    } else {
                      if (param4 != this.field_L) {
                        break L2;
                      } else {
                        L5: {
                          if (this.field_F) {
                            break L5;
                          } else {
                            L6: {
                              if (!this.field_N) {
                                break L6;
                              } else {
                                ba.a(123);
                                if (var7 == 0) {
                                  break L2;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            kj.a(21744);
                            if (var7 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          }
                        }
                        kb.b(28579);
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  wk.k(970210916);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.a((byte) -69);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var6);

            stackIn_35_1 = new StringBuilder().append("e.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 30) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param1 ^ -1) > -49) {
                  break L3;
                } else {
                  if (57 < param1) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "e.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final String e(boolean param0) {
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_G = (rn) null;
                break L1;
              }
            }
            if (this.field_O.field_g == null) {
              stackIn_7_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_9_0 = this.field_O.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "e.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static boolean b(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            if (param0 == -12055) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (param1.length() <= var3) {
                      break L3;
                    } else {
                      stackIn_15_0 = var2_int ^ -1;

                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (stackIn_15_0 != (param1.charAt(var3) ^ -1)) {
                          stackIn_12_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_15_0 = 1;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("e.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static int a(hc param0, int param1, hc param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 54 % ((param1 - 33) / 52);
            stackIn_1_0 = cj.a(false, (byte) -91, 0, param0, 0, param2, (String) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("e.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_C = "You are on <%0>";
        field_D = "The spell you have in this arena is Arcane Flash. This spell is for close range only and doesn't deal much damage. It will, however, throw anything it hits into the distance<br>(Hopefully into the water!)<br>Select Arcane Flash from your spellbook.";
    }
}
