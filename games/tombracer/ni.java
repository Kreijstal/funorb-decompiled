/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ni {
    static boolean field_c;
    private qm field_a;
    private qm field_d;
    private eja field_b;

    final void a(byte param0) {
        ((ni) this).field_a.a(12574);
        if (param0 < 22) {
            ((ni) this).field_d = null;
        }
    }

    final static void a(uia param0, byte param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = TombRacer.field_G ? 1 : 0;
                        var6 = new byte[24];
                        var2 = var6;
                        if (null == fua.field_b) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            fua.field_b.a((byte) 2, 0L);
                            fua.field_b.a(var6, 0);
                            var3_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (24 <= var3_int) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var2[var3_int] == 0) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (-25 >= (var3_int ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if ((var4 ^ -1) <= -25) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        param0.a(0, var2, 24, 68);
                        if (param1 > 61) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        field_c = true;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ni(eo param0) {
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        L0: {
          mna discarded$4 = param0.a(new ne[2], 0);
          ((ni) this).field_a = param0.c(6, true);
          ((ni) this).field_d = param0.c(6, false);
          boolean discarded$5 = ((ni) this).field_d.a(393168, 12, true);
          ((ni) this).field_b = param0.a(26, false);
          ((ni) this).field_b.a(18, 49146);
          var7 = ((ni) this).field_b.a(true, (byte) -44);
          if (var7 == null) {
            break L0;
          } else {
            L1: {
              var8 = param0.a(var7, 125);
              if (jaclib.memory.Stream.b()) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 8191) {
                    break L1;
                  } else {
                    var5 = var4_int * 4;
                    var8.a(var5);
                    var8.a(1 + var5);
                    var8.a(2 + var5);
                    var8.a(var5 + 2);
                    var8.a(var5 - -3);
                    var8.a(var5);
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (-8192 >= (var4_int ^ -1)) {
                    break L1;
                  } else {
                    var5 = var4_int * 4;
                    var8.b(var5);
                    var8.b(var5 + 1);
                    var8.b(2 + var5);
                    var8.b(2 + var5);
                    var8.b(var5 + 3);
                    var8.b(var5);
                    var4_int++;
                    continue L3;
                  }
                }
              }
            }
            var8.a();
            boolean discarded$6 = ((ni) this).field_b.a((byte) -97);
            break L0;
          }
        }
        L4: {
          var9 = ((ni) this).field_d.a(-15730, true);
          if (var9 == null) {
            break L4;
          } else {
            L5: {
              var4 = param0.a(var9, 127);
              if (!jaclib.memory.Stream.b()) {
                var5 = 0;
                L6: while (true) {
                  if ((var5 ^ -1) <= -8192) {
                    break L5;
                  } else {
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var4.a(0.0f);
                    var4.a(-1.0f);
                    var4.a(0.0f);
                    var5++;
                    continue L6;
                  }
                }
              } else {
                var5 = 0;
                L7: while (true) {
                  if ((var5 ^ -1) <= -8192) {
                    break L5;
                  } else {
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var4.b(0.0f);
                    var4.b(-1.0f);
                    var4.b(0.0f);
                    var5++;
                    continue L7;
                  }
                }
              }
            }
            var4.a();
            boolean discarded$7 = ((ni) this).field_d.a(true);
            break L4;
          }
        }
    }

    final void a(int param0, eo param1) {
        boolean discarded$0 = ((ni) this).field_a.a(786336, 24, true);
        int var3 = -61 / ((param0 - -55) / 41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
    }
}
