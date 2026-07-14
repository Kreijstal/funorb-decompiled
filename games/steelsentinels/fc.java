/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class fc {
    static int field_d;
    static boolean[] field_e;
    static String field_f;
    static tb field_a;
    static String field_c;
    static int[][] field_b;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(cm param0, int param1) {
        if (param1 >= -48) {
            field_c = null;
            return param0.a(25);
        }
        return param0.a(25);
    }

    final static void a(mn param0, int param1) {
        param0.field_F = new char[]{(char)63};
        param0.field_A = new int[]{-1};
        int var2 = -47 / ((param1 - 27) / 61);
    }

    final static pc a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (qj.field_q != null) {
          if (qj.field_q[param1] != null) {
            if (param2 != -1) {
              var3 = 0;
              if (fk.field_i == null) {
                if (null == si.field_A) {
                  var4 = Math.max(64, -(192 * Math.abs(var3) / 1280) + 256);
                  var4 = cm.field_e[param1] * var4 / 256;
                  var5 = Math.max(0, Math.min(256, var3 / 10 + 128));
                  return fg.a(var4, var5, 248, qj.field_q[param1]);
                } else {
                  var3 = -320 + si.field_A.d(true, param2);
                  var4 = Math.max(64, -(192 * Math.abs(var3) / 1280) + 256);
                  var4 = cm.field_e[param1] * var4 / 256;
                  var5 = Math.max(0, Math.min(256, var3 / 10 + 128));
                  return fg.a(var4, var5, 248, qj.field_q[param1]);
                }
              } else {
                var3 = fk.field_i.d(true, param2) + -320;
                var4 = Math.max(64, -(192 * Math.abs(var3) / 1280) + 256);
                var4 = cm.field_e[param1] * var4 / 256;
                var5 = Math.max(0, Math.min(256, var3 / 10 + 128));
                return fg.a(var4, var5, 248, qj.field_q[param1]);
              }
            } else {
              return fl.a((byte) 41, qj.field_q[param1], cm.field_e[param1]);
            }
          } else {
            var3 = -3 % ((param0 - -20) / 47);
            return null;
          }
        } else {
          var3 = -3 % ((param0 - -20) / 47);
          return null;
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, String param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_43_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_42_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = SteelSentinels.field_G;
                        var5 = param1.getFile();
                        var6 = 0;
                        if (param0 == -19571) {
                            statePc = 78;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        fc.a(false);
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 28: {
                        var7 = new StringBuilder(var6);
                        StringBuilder discarded$18 = var7.append(var5.substring(0, var6));
                        if (param4 > 0) {
                            statePc = 30;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        StringBuilder discarded$19 = var7.append("/l=");
                        StringBuilder discarded$20 = var7.append(Integer.toString(param4));
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (param2 == null) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (-1 > (param2.length() ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        StringBuilder discarded$21 = var7.append("/p=");
                        StringBuilder discarded$22 = var7.append(param2);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (param3 == null) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (param3.length() > 0) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        StringBuilder discarded$23 = var7.append("/s=");
                        StringBuilder discarded$24 = var7.append(param3);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (var6 < var5.length()) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        StringBuilder discarded$25 = var7.append(47);
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 41: {
                        StringBuilder discarded$26 = var7.append(var5.substring(var6, var5.length()));
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = new java.net.URL(param1, var7.toString());
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return stackIn_43_0;
                    }
                    case 44: {
                        var8 = (Exception) (Object) caughtException;
                        var8.printStackTrace();
                        return param1;
                    }
                    case 46: {
                        var6 = var7_int;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 47: {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (var7_int < 0) {
                            statePc = 67;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            statePc = 56;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        var6 = var7_int;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 53: {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 54: {
                        if (param3 != null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (var7_int >= 0) {
                            statePc = 54;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        var6 = var7_int;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 62: {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 63: {
                        if (param2 != null) {
                            statePc = 62;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if ((var7_int ^ -1) <= -1) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        if (var5.regionMatches(var6, "/p=", 0, 3)) {
                            statePc = 65;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                            statePc = 67;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 73: {
                        var6 = var7_int;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 74: {
                        if (-1 < (param4 ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 76: {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (var7_int >= 0) {
                            statePc = 74;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        if (var5.regionMatches(var6, "/l=", 0, 3)) {
                            statePc = 76;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
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

    final static e a(byte param0, String[] param1) {
        e var2 = null;
        Object var3 = null;
        if (param0 != -76) {
          var3 = null;
          fc.a((mn) null, 110);
          var2 = new e(false);
          var2.field_c = param1;
          return var2;
        } else {
          var2 = new e(false);
          var2.field_c = param1;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new boolean[112];
        field_f = "Play rated game";
        field_d = 22;
        field_c = "SPACE";
    }
}
