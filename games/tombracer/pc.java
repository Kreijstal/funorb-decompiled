/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int field_c;
    int field_d;
    pc field_h;
    boolean field_l;
    int field_e;
    int field_i;
    int field_b;
    static String field_g;
    int field_a;
    int field_j;
    int field_k;
    int field_f;

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 5) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    pc.a(-47);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (wna.field_n == null) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) wna.field_n;
                    // monitorenter wna.field_n
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        wna.field_n = null;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((pc) this).field_k = param2;
        ((pc) this).field_c = param1;
        ((pc) this).field_e = param1;
        ((pc) this).field_a = param3;
        if (param4 != 44) {
            return;
        }
        ((pc) this).field_f = param3;
        ((pc) this).field_d = param0;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_g = null;
    }

    final void a(int param0, byte param1) {
        int var3 = ((pc) this).field_e + -((pc) this).field_d;
        int var4 = ((pc) this).field_a + -((pc) this).field_k;
        ((pc) this).field_e = ((pc) this).field_d - -gqa.a(param0, (byte) 24, var3);
        if (param1 != 47) {
            Object var5 = null;
            pc.a(false, -126, (bb) null);
        }
        ((pc) this).field_a = ((pc) this).field_k + gqa.a(param0, (byte) 24, var4);
    }

    final static void a(boolean param0, int param1, bb param2) {
        kh var3 = ql.field_k;
        if (param0) {
            field_g = null;
        }
        var3.k(param1, -2988);
        var3.i(5, 0);
        var3.i(0, 0);
        var3.f(-1477662136, param2.field_n);
        var3.i(param2.field_j, 0);
        var3.i(param2.field_i, 0);
    }

    final static bfa a(ela[] param0, int param1, String param2, bfa[] param3) throws rv {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= param0.length) {
            var8 = new StringBuilder("The method " + param2 + "(");
            var5 = 33 % ((param1 - -53) / 54);
            var6 = 0;
            L1: while (true) {
              if (var6 >= param3.length) {
                StringBuilder discarded$19 = var8.append(") is undefined.");
                throw new rv(var8.toString());
              } else {
                L2: {
                  if (param3[var6].field_a) {
                    StringBuilder discarded$20 = var8.append(jd.a(param3[var6].field_d, 0).toString());
                    break L2;
                  } else {
                    StringBuilder discarded$21 = var8.append(rva.a(param3[var6].field_d.getClass(), (byte) -88));
                    break L2;
                  }
                }
                if (-1 + param3.length > var6) {
                  StringBuilder discarded$22 = var8.append(44);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            if (!param0[var4].a(-120, param2, param3)) {
              var4++;
              continue L0;
            } else {
              return param0[var4].a(param3, 0);
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Cancel draw";
    }
}
