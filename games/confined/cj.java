/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements fe {
    static int[] field_b;
    static String field_c;
    static boolean field_d;
    static nf[] field_a;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 > -80) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, vc param3, int param4) {
        Object var5 = null;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) param3;
                    // monitorenter param3
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param3.b(eg.field_i * param0 * fa.field_S >> -196386869, param4);
                        param3.a(param2 * dk.field_k / param1, 0, 128);
                        // monitorexit var5
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = caughtException;
                        // monitorexit var5
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var6;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static ce a(int param0, int param1, mi param2, int param3, mi param4) {
        Object var6 = null;
        if (param3 == 20748) {
          if (!mc.a(param0, param1, param4, (byte) 119)) {
            return null;
          } else {
            return jg.a(2563, param2.a((byte) -2, param1, param0));
          }
        } else {
          var6 = null;
          ce discarded$4 = cj.a(-84, -90, (mi) null, -34, (mi) null);
          if (!mc.a(param0, param1, param4, (byte) 119)) {
            return null;
          } else {
            return jg.a(2563, param2.a((byte) -2, param1, param0));
          }
        }
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        nf var9 = null;
        nf var10 = null;
        if (param0 < -97) {
          var6 = param3.field_q + param1;
          var7 = param4 - -param3.field_m;
          ea.a(true, var7, var6, param3.field_z, param3.field_F);
          var10 = gg.field_q[1];
          if (param3 instanceof rg) {
            if (!((rg) (Object) param3).field_O) {
              L0: {
                if (param3.e((byte) -1)) {
                  tj.a(-4 + param3.field_z, 1, var6 - -2, var7 - -2, param3.field_F + -4);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.c((-var10.field_t + param3.field_F >> 976711969) + (1 + var6), (param3.field_z + -var10.field_x >> -1811449247) + 1 + var7, 256);
                if (param3.e((byte) -1)) {
                  tj.a(-4 + param3.field_z, 1, var6 - -2, var7 - -2, param3.field_F + -4);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param3.e((byte) -1)) {
                tj.a(-4 + param3.field_z, 1, var6 - -2, var7 - -2, param3.field_F + -4);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          cj.a((byte) -62);
          var6 = param3.field_q + param1;
          var7 = param4 - -param3.field_m;
          ea.a(true, var7, var6, param3.field_z, param3.field_F);
          var9 = gg.field_q[1];
          if (!(param3 instanceof rg)) {
            L3: {
              if (param3.e((byte) -1)) {
                tj.a(-4 + param3.field_z, 1, var6 - -2, var7 - -2, param3.field_F + -4);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (((rg) (Object) param3).field_O) {
                var9.c((-var9.field_t + param3.field_F >> 976711969) + (1 + var6), (param3.field_z + -var9.field_x >> -1811449247) + 1 + var7, 256);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param3.e((byte) -1)) {
                tj.a(-4 + param3.field_z, 1, var6 - -2, var7 - -2, param3.field_F + -4);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        mn discarded$0 = new mn();
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
