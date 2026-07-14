/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    static int field_g;
    static wk field_c;
    static int field_e;
    static String field_b;
    static int field_a;
    static int field_f;
    static boolean field_h;
    static int field_d;

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        var4 = param3.length();
        var5 = param0.length();
        var6 = param2.length();
        if (-1 != (var5 ^ -1)) {
          L0: {
            var7 = var4;
            if (param1 == 11) {
              break L0;
            } else {
              field_a = 34;
              break L0;
            }
          }
          L1: {
            var8 = var6 - var5;
            if (0 != var8) {
              var9_int = 0;
              L2: while (true) {
                var9_int = param3.indexOf(param0, var9_int);
                if ((var9_int ^ -1) <= -1) {
                  var9_int = var9_int + var5;
                  var7 = var7 + var8;
                  continue L2;
                } else {
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L3: while (true) {
            var11 = param3.indexOf(param0, var10);
            if (var11 >= 0) {
              StringBuilder discarded$3 = var9.append(param3.substring(var10, var11));
              var10 = var11 - -var5;
              StringBuilder discarded$4 = var9.append(param2);
              continue L3;
            } else {
              StringBuilder discarded$5 = var9.append(param3.substring(var10));
              return var9.toString();
            }
          }
        } else {
          throw new IllegalArgumentException("Key cannot have zero length");
        }
    }

    final static ik a(byte param0) {
        if (param0 > -53) {
            field_a = 61;
        }
        return new ik(hl.d(87), jk.c((byte) 105));
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        gi var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new gi(param0);
                    if (param1 >= 126) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_e = 55;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = var9.f((byte) -72);
                    var4 = var9.i(0);
                    if ((var4 ^ -1) > -1) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (uf.field_c == 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 <= uf.field_c) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (0 != var3) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(0, var16, 28, var4);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var9.i(0);
                    if (var5 < 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-1 == (uf.field_c ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 > uf.field_c) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (1 != var3) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = oi.a(var17, var5, param0, var4, 9);
                    statePc = 21;
                    continue stateLoop;
                }
                case 16: {
                    var7 = (Object) (Object) wc.field_e;
                    // monitorenter wc.field_e
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        wc.field_e.a(var9, var17, true);
                        // monitorexit var7
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) var8;
                }
                case 21: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (param2 == -16121) {
          var3 = jd.a(param0, param1, 88);
          if (var3 == null) {
            var4 = 0;
            L0: while (true) {
              if (param0.length() > var4) {
                if (im.a(param0.charAt(var4), false)) {
                  var4++;
                  continue L0;
                } else {
                  return lg.field_f;
                }
              } else {
                return null;
              }
            }
          } else {
            return var3;
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_g = 53;
        }
        field_c = null;
    }

    final static void a(int param0) {
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
                        var3 = SteelSentinels.field_G;
                        if (ne.field_N == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ne.field_N.b(111);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (param0 == -8601) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        field_b = null;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null != hk.field_oc) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        hk.field_oc.a(0);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (null == si.field_o) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            si.field_o.c(param0 ^ 8679);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (rh.field_o != null) {
                            statePc = 13;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var1 >= rh.field_o.length) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (rh.field_o[var1] != null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            rh.field_o[var1].c(-127);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 21: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email: ";
        field_c = null;
        field_a = 0;
        field_f = 0;
        field_d = 32;
    }
}
