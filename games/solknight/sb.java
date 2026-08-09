/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static nc field_c;
    dl field_b;
    volatile gj[] field_a;
    volatile boolean field_e;
    volatile boolean field_f;
    static int field_d;

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        gj var2 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Throwable var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    this.field_f = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_e) {
                            statePc = 11;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (2 <= var1_int) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_a[var1_int];
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.b();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        i.a((byte) 18, 10L);
                        var5 = (Object) null;
                        pb.a(this.field_b, (Object) null, (byte) 106);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 12 : 14);
                        continue stateLoop;
                    }
                }
                case 11: {
                    this.field_f = false;
                    statePc = 16;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        exception = (Exception) ((Object) caughtException);
                        var6 = (String) null;
                        hi.a((Throwable) ((Object) exception), (String) null, 1);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    this.field_f = false;
                    return;
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    this.field_f = false;
                    throw sb.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        if (param2 != 1513551664) {
          return -96;
        } else {
          var3 = param0 >> 1218313584;
          var4 = 65535 & param0;
          var5 = param1 >> 134446224;
          var6 = 65535 & param1;
          return (var4 * var6 >> 1513551664) + (param1 * var3 - -(var4 * var5));
        }
    }

    final static hd a(byte[] param0, int param1) {
        hd var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (param1 == 32223) {
                  break L1;
                } else {
                  field_d = 21;
                  break L1;
                }
              }
              var2 = new hd(param0, ph.field_h, qf.field_d, sa.field_l, uj.field_b, jc.field_c);
              og.a((byte) -97);
              stackIn_6_0 = (hd) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("sb.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hd) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -90) {
            sb.a((byte) -7);
        }
    }

    sb() {
        this.field_a = new gj[2];
        this.field_e = false;
        this.field_f = false;
    }

    static {
        field_c = new nc();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
