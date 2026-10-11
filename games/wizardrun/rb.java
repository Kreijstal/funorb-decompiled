/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    int field_g;
    static int field_e;
    static long field_d;
    int field_h;
    int field_f;
    static String field_b;
    int field_c;
    static boolean field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        String[] stackIn_6_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        var4 = pf.field_f;
                        if (param0 == -578629823) {
                            statePc = 4;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 2. */
                            {
                                stackIn_3_0 = -85;
                                statePc = 3;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    stackIn_6_0 = a.field_b;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackIn_6_0 = a.field_b;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        statePc = ((Object) stateCaught_5 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_5);
                        }
                        caughtException = stateCaught_5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0.length <= var3_int) {
                            /* Inlined CFG state: 16. */
                            {
                                stackIn_17_0 = -1;
                                statePc = 17;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 7. */
                            {
                                var5 = ec.field_g[var3_int];
                                if (0 > var5) {
                                    statePc = 13;
                                } else {
                                    statePc = 8;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_6) {
                        statePc = ((Object) stateCaught_6 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_6);
                        }
                        caughtException = stateCaught_6;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = sf.a(true, 110, a.field_b[var3_int]);
                        var7 = -(var6 >> 1) + id.field_c;
                        var4 = var4 + na.field_e;
                        if (ih.a(-vl.field_h + var7, (vl.field_h << 1) + var6, ec.field_c + (e.field_d << 1), var4, true, param1, param2)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        statePc = ((Object) stateCaught_8 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_8);
                        }
                        caughtException = stateCaught_8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        /* Sequential CFG blocks: 9, 12. */
                        {
                        }
                        {
                            var4 = var4 + (ec.field_c + (na.field_e + (e.field_d << 1)));
                            statePc = 14;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_9) {
                        statePc = ((Object) stateCaught_9 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_9);
                        }
                        caughtException = stateCaught_9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var5;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 13: {
                    try {
                        var4 = var4 + si.field_f;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        statePc = ((Object) stateCaught_13 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_13);
                        }
                        caughtException = stateCaught_13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        statePc = ((Object) stateCaught_14 instanceof RuntimeException ? 18 : -1);
                        if (statePc == -1) {
                            throw rb.<RuntimeException>$cfr$sneakyThrow(stateCaught_14);
                        }
                        caughtException = stateCaught_14;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw bd.a((Throwable) ((Object) var3), "rb.D(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        vf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = wizardrun.field_H;
        try {
          var4 = (vf) (r.field_d.b((byte) 50));
          if (param1 >= -72) {
            rb.a(57, (byte) -120);
          }
          while (var4 != null) {
            oj.a(param0, var4, -22);
            var4 = (vf) (r.field_d.d(8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "rb.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == -1926289535) {
          return;
        }
        rb.a(-27, (byte) -34);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != -1926289535) {
              return;
            }
            try {
              var3 = new java.net.URL(param2.getCodeBase(), param0);
              var3 = jl.a(-91, var3, param2);
              sh.a(true, 127, var3.toString(), param2);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("rb.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Achievements This Game";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
