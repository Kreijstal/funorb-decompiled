/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_h;
    private int field_g;
    static String field_b;
    private boolean field_e;
    static co field_j;
    static km field_a;
    private int[] field_f;
    private int field_i;
    static long field_c;
    static mg field_d;

    final void b(int param0, int param1) {
        this.a(-113, param1, ((nd) this).field_i + 1);
        if (param0 != -1) {
            field_b = null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        if (((nd) this).field_i >= param2) {
          if (((nd) this).field_f.length <= param2) {
            this.b((byte) -50, param2);
            ((nd) this).field_f[param2] = param1;
            var4 = -90 / ((param0 - -39) / 56);
            return;
          } else {
            ((nd) this).field_f[param2] = param1;
            var4 = -90 / ((param0 - -39) / 56);
            return;
          }
        } else {
          ((nd) this).field_i = param2;
          if (((nd) this).field_f.length > param2) {
            ((nd) this).field_f[param2] = param1;
            var4 = -90 / ((param0 - -39) / 56);
            return;
          } else {
            this.b((byte) -50, param2);
            ((nd) this).field_f[param2] = param1;
            var4 = -90 / ((param0 - -39) / 56);
            return;
          }
        }
    }

    private final void b(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.a(0, param1)];
        var3 = var4;
        if (param0 != -50) {
          field_a = null;
          ek.a(((nd) this).field_f, 0, var4, 0, ((nd) this).field_f.length);
          ((nd) this).field_f = var4;
          return;
        } else {
          ek.a(((nd) this).field_f, 0, var4, 0, ((nd) this).field_f.length);
          ((nd) this).field_f = var4;
          return;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        if (!(null == hf.field_w)) {
            hf.field_w.h(true);
        }
        int var3 = 94 / ((param0 - -93) / 33);
        aa.field_a = new ca(param1, param2, false, true, true);
        fi.field_t.b((fi) (Object) aa.field_a, (byte) -53);
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        if (-1 >= (param1 ^ -1)) {
          if (param1 > ((nd) this).field_i) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            L0: {
              if (param1 != ((nd) this).field_i) {
                ek.a(((nd) this).field_f, 1 + param1, ((nd) this).field_f, param1, -param1 + ((nd) this).field_i);
                break L0;
              } else {
                break L0;
              }
            }
            ((nd) this).field_i = ((nd) this).field_i - 1;
            var3 = -30 / ((31 - param0) / 58);
            return;
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 68 % ((param1 - 41) / 39);
        if (!(param0 <= ((nd) this).field_i)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        return ((nd) this).field_f[param0];
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) w.field_L;
                    // monitorenter w.field_L
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ph.field_h != re.field_l) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        um.field_Gb = cj.field_o[ph.field_h];
                        nm.field_d = hg.field_q[ph.field_h];
                        ph.field_h = ph.field_h - -1 & 127;
                        if (param0 < -95) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        nd.a((byte) -122);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((nd) this).a(71, (byte) 14);
            return 1 + ((nd) this).field_i;
        }
        return 1 + ((nd) this).field_i;
    }

    public static void a(byte param0) {
        field_d = null;
        field_j = null;
        field_b = null;
        field_h = null;
        field_a = null;
        if (param0 < 108) {
            field_h = null;
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        var3 = ((nd) this).field_f.length;
        L0: while (true) {
          if (var3 > param1) {
            if (param0 != 0) {
              return 14;
            } else {
              return var3;
            }
          } else {
            if (!((nd) this).field_e) {
              var3 = var3 + ((nd) this).field_g;
              continue L0;
            } else {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((nd) this).field_g;
                continue L0;
              }
            }
          }
        }
    }

    private nd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have resigned and are offering a rematch.";
        field_h = "Connection restored.";
        field_j = new co("");
    }
}
