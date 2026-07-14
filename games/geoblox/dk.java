/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dk {
    static int field_b;
    static int field_c;
    lk[] field_a;

    final int a(int param0, int param1) {
        int var4 = 0;
        lk var5 = null;
        int var6 = Geoblox.field_C;
        lk[] var7 = ((dk) this).field_a;
        lk[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_c.length > param0) {
                return var5.field_c[param0];
            }
            param0 = param0 - (var5.field_c.length - 1);
        }
        if (param1 <= 109) {
            return 67;
        }
        return 0;
    }

    final int a(int param0) {
        int var2 = 0;
        lk[] var3 = null;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Geoblox.field_C;
        var2 = -1;
        if (param0 >= 60) {
          L0: {
            if (null != ((dk) this).field_a) {
              var3 = ((dk) this).field_a;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a(0);
                    if (var6 > var2) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 19;
        }
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Geoblox.field_C;
        var5 = 0;
        var6 = 0;
        var7 = param3.length();
        var8 = 20 / ((-30 - param0) / 56);
        var9 = 0;
        L0: while (true) {
          if (var9 >= var7) {
            if (var5 <= 0) {
              return 0;
            } else {
              return (param2 - param1 << -125164472) / var5;
            }
          } else {
            var10 = param3.charAt(var9);
            if (var10 != 60) {
              if (var10 != 62) {
                if (var6 == 0) {
                  if (32 == var10) {
                    var5++;
                    var9++;
                    continue L0;
                  } else {
                    var9++;
                    continue L0;
                  }
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var6 = 0;
                var9++;
                continue L0;
              }
            } else {
              var6 = 1;
              var9++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Geoblox.field_C;
                        if (null == wg.field_i) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        wg.field_i.h(-70);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (param0 < -65) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        field_b = 18;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (cl.field_c == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        cl.field_c.a((byte) 51);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null == af.field_d) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            af.field_d.b(27034);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == je.field_h) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var1 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (je.field_h.length <= var1) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (null != je.field_h[var1]) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            je.field_h[var1].b(27034);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 18: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 19: {
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

    final int b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -3111) {
            break L0;
          } else {
            field_b = 49;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((dk) this).field_a) {
              break L2;
            } else {
              if (-1 > (((dk) this).field_a.length ^ -1)) {
                stackOut_6_0 = ((dk) this).field_a[((dk) this).field_a.length - 1].field_a + -((dk) this).field_a[0].field_d;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        lk var4 = null;
        int var5 = Geoblox.field_C;
        if (param0 != 24) {
            return -10;
        }
        for (var3 = 0; ((dk) this).field_a.length > var3; var3++) {
            var4 = ((dk) this).field_a[var3];
            if (!(var4.field_c.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_c.length - 1);
        }
        return ((dk) this).field_a.length;
    }

    final int a(int param0, int param1, int param2) {
        int var6 = 0;
        lk var7 = null;
        int var8 = 0;
        int var9 = Geoblox.field_C;
        if (null != ((dk) this).field_a) {
            // ifeq L37
            // if_icmpgt L37
        } else {
            return -1;
        }
        if (!(((dk) this).field_a[-1 + ((dk) this).field_a.length].field_a >= param2)) {
            return -1;
        }
        if (-2 == (((dk) this).field_a.length ^ -1)) {
            return ((dk) this).field_a[0].a(71, param0);
        }
        int var4 = 0;
        int var5 = -2 % ((15 - param1) / 32);
        for (var6 = 0; var6 < ((dk) this).field_a.length; var6++) {
            var7 = ((dk) this).field_a[var6];
            if (param2 >= var7.field_d) {
                if (var7.field_a >= param2) {
                    var8 = var7.a(-79, param0);
                    if (-1 == var8) {
                        return -1;
                    }
                    return var4 + var8;
                }
            }
            var4 = var4 + (var7.field_c.length - 1);
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
