/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc {
    static char[] field_a;
    static int field_e;
    static String field_d;
    static int[] field_h;
    static String field_b;
    static int field_c;
    static int field_g;
    static eb field_f;

    final static void b(int param0) {
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
                        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                        if (lg.field_n == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        lg.field_n.b((byte) 7);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == jc.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        jc.field_c.a(true);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null == ah.field_f) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ah.field_f.a(true);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (param0 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        sc.a(40);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == bl.field_o) {
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
                        if (bl.field_o.length <= var1) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (bl.field_o[var1] != null) {
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
                            bl.field_o[var1].a(true);
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

    final static void a(boolean param0) {
        int var4_int = 0;
        byte[] var13 = null;
        mk var4 = null;
        uh var3_ref_uh = null;
        Object var5 = null;
        int var3 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0) {
            field_b = null;
        }
        hb var9 = MonkeyPuzzle2.field_D;
        int var2 = var9.a((byte) 114);
        if (var2 == 0) {
            var3_ref_uh = (uh) (Object) t.field_v.a((byte) -117);
            if (var3_ref_uh == null) {
                gk.a(-1);
                return;
            }
            var4_int = var9.a((byte) 114);
            if (var4_int == 0) {
                var5 = null;
            } else {
                var13 = new byte[var4_int];
                var9.a(var13, var4_int, -122, 0);
            }
            var9.field_h = var9.field_h + 4;
            if (!(var9.l(-24685))) {
                gk.a(-1);
                return;
            }
            var3_ref_uh.c(-19822);
        } else {
            if (1 == var2) {
                var3 = var9.e(126);
                var4 = (mk) (Object) eb.field_C.a((byte) -117);
                while (var4 != null) {
                    // if_icmpeq L197
                    var4 = (mk) (Object) eb.field_C.d((byte) 63);
                }
                if (var4 == null) {
                    gk.a(-1);
                    return;
                }
                var4.c(-19822);
            } else {
                kk.a("A1: " + bh.a((byte) -21), (byte) 126, (Throwable) null);
                gk.a(-1);
            }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = sb.a((byte) 79, param2);
        int var5 = 37 % ((-85 - param0) / 36);
        int var4 = r.a((byte) 71, param2);
        int var6 = sb.a((byte) 79, param1);
        int var7 = r.a((byte) 71, param1);
        int var8 = (int)((long)var3 * (long)var6 >> -237110320);
        int var9 = (int)((long)var7 * (long)var3 >> -1575055664);
        int var10 = (int)((long)var6 * (long)var4 >> -768349552);
        int var11 = (int)((long)var7 * (long)var4 >> -1192020016);
        return new int[]{0, 0, 0, var7, 0, var6, var8, var4, -var9, -var10, var3, var11};
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 != -21718) {
            Object var2 = null;
            String discarded$0 = sc.a((byte[]) null, -77, 2, 45);
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        var5 = -95 % ((param2 - 0) / 52);
        var12 = new char[param1];
        var11 = var12;
        var4 = var11;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1) {
            return new String(var12, 0, var6);
          } else {
            var8 = param0[param3 - -var7] & 255;
            if (-1 != (var8 ^ -1)) {
              L1: {
                if ((var8 ^ -1) > -129) {
                  break L1;
                } else {
                  if (var8 >= 160) {
                    break L1;
                  } else {
                    L2: {
                      var9 = sb.field_n[-128 + var8];
                      if (var9 == 0) {
                        var9 = 63;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var8 = var9;
                    break L1;
                  }
                }
              }
              var6++;
              var4[var6] = (char)var8;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Level Complete: <%0> pts";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "This game has been updated! Please reload this page.";
        field_e = 0;
        field_h = new int[300];
        field_c = 0;
    }
}
