/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bo extends hc {
    static tb field_F;
    static int field_E;
    static String field_D;
    static int[] field_H;
    static byte[] field_G;

    final void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((bo) this).field_z) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((bo) this).field_z = stackIn_3_1 != 0;
        if (param0 != -19646) {
          var6 = null;
          bo.a((java.awt.Canvas) null, (byte) 126);
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        } else {
          super.a(param0 ^ 0, param1, param2, param3);
          return;
        }
    }

    private bo(String param0, db param1, wn param2) {
        super(param0, param1, param2);
        ((bo) this).field_s = mb.field_g.field_k;
    }

    public static void a(byte param0) {
        field_H = null;
        field_F = null;
        field_D = null;
        if (param0 <= 17) {
            return;
        }
        field_G = null;
    }

    private bo(String param0, wn param1) {
        this(param0, mb.field_g.field_o, param1);
        ((bo) this).field_s = mb.field_g.field_k;
    }

    final static vj a(String param0, boolean param1, int param2, String param3) {
        long var4 = 0L;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var4 = 0L;
        if (param2 != 24564) {
          L0: {
            field_F = null;
            var6 = null;
            if (param0.indexOf('@') == -1) {
              var7 = (CharSequence) (Object) param0;
              var4 = vn.a((byte) 88, var7);
              break L0;
            } else {
              var6 = param0;
              break L0;
            }
          }
          return ei.a(0, param1, var4, var6, param3);
        } else {
          L1: {
            var6 = null;
            if (param0.indexOf('@') == -1) {
              var8 = (CharSequence) (Object) param0;
              var4 = vn.a((byte) 88, var8);
              break L1;
            } else {
              var6 = param0;
              break L1;
            }
          }
          return ei.a(0, param1, var4, var6, param3);
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        int var2 = 0;
        sc.a((byte) -58, (java.awt.Component) (Object) param0);
        var2 = 120 / ((param1 - 54) / 57);
        od.a((java.awt.Component) (Object) param0, (byte) 9);
        if (null != ji.field_b) {
          ji.field_b.a(-5070, (java.awt.Component) (Object) param0);
          return;
        } else {
          return;
        }
    }

    bo(String param0, wn param1, boolean param2) {
        this(param0, param1);
        ((bo) this).field_z = param2 ? true : false;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_11_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == 30000) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return false;
                    }
                    case 2: {
                        if (param1 > om.field_g.field_m) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return true;
                    }
                    case 4: {
                        if (null != pg.field_c) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        try {
                            var2_int = pg.field_c.b(-124);
                            if (-1 <= (var2_int ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var2_int > param1 + -om.field_g.field_m) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2_int = param1 - om.field_g.field_m;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            pg.field_c.a(om.field_g.field_m, var2_int, om.field_g.field_g, (byte) -49);
                            sl.field_a = td.b(128);
                            om.field_g.field_m = om.field_g.field_m + var2_int;
                            if (param1 <= om.field_g.field_m) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            om.field_g.field_m = 0;
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            if (0 > var2_int) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-30001L <= (un.e(param0 + 34655) ^ -1L)) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            nm.a(16);
                            return false;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            nm.a(16);
                            return false;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return false;
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        nm.a(16);
                        return false;
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
        field_E = 1;
        field_D = "From Level";
        field_G = new byte[520];
    }
}
