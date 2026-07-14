/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class f extends vk {
    static String field_x;
    static int[] field_w;
    static gh field_y;
    private sg field_F;
    static String field_u;
    static int[] field_B;
    static rf field_D;
    static String field_E;
    static java.util.zip.CRC32 field_G;
    static nk field_A;
    static int field_v;
    static String field_z;

    final void b(int param0) {
        if (param0 < 61) {
            Object var3 = null;
            ((f) this).a((Object) null, true, 56);
        }
        if (!(((f) this).field_F == null)) {
            ((f) this).field_F.b(12110);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            Exception var4 = null;
            gi stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            gi stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            gi stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            gi stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            gi stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            gi stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((f) this).field_F == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            ((f) this).field_o.field_p = 0;
                            stackOut_3_0 = ((f) this).field_o;
                            stackOut_3_1 = 111;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_4_0 = stackOut_3_0;
                            stackIn_4_1 = stackOut_3_1;
                            if (param1) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (gi) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 3;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_6_2 = stackOut_4_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (gi) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            stackIn_6_2 = stackOut_5_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((gi) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2);
                            ((f) this).field_o.a(0L, (byte) 120);
                            ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                            if (param0) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((f) this).b(3);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var3 = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((f) this).field_F.b(12110);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        ((f) this).field_t = -2;
                        ((f) this).field_f = ((f) this).field_f + 1;
                        ((f) this).field_F = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
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

    public static void e(int param0) {
        field_B = null;
        field_y = null;
        field_x = null;
        field_w = null;
        field_E = null;
        field_u = null;
        field_G = null;
        field_D = null;
        field_A = null;
        field_z = null;
        if (param0 != -2) {
            field_z = null;
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4_ref_Exception = null;
            int var4 = 0;
            IOException var5 = null;
            qa var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = SteelSentinels.field_G;
                        if (null != ((f) this).field_F) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((f) this).field_F.b(12110);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((f) this).field_F = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((f) this).field_F = (sg) param0;
                        var4 = 98 % ((param2 - -72) / 32);
                        this.f(123);
                        this.a(true, param1);
                        ((f) this).field_c.field_p = 0;
                        ((f) this).field_d = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var5_ref = (qa) (Object) ((f) this).field_a.c(25);
                        if (var5_ref == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((f) this).field_m.a((byte) 58, (kd) (Object) var5_ref);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 9: {
                        var5_ref = (qa) (Object) ((f) this).field_p.c(54);
                        if (var5_ref != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((f) this).field_j.a((byte) 45, (kd) (Object) var5_ref);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-1 != (((f) this).field_n ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((f) this).field_o.field_p = 0;
                            ((f) this).field_o.a((byte) 116, 4);
                            ((f) this).field_o.a((byte) 114, (int) ((f) this).field_n);
                            ((f) this).field_o.b(true, 0);
                            ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var5 = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((f) this).field_F.b(12110);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var6 = (Exception) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((f) this).field_F = null;
                        ((f) this).field_f = ((f) this).field_f + 1;
                        ((f) this).field_t = -2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((f) this).field_i = 0;
                        ((f) this).field_e = mm.a(-108);
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

    final static int a(boolean param0, int param1, CharSequence param2) {
        if (!param0) {
            field_E = null;
        }
        return bg.a((byte) 80, true, param1, param2);
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        if (param0 != null) {
          var3 = param0.length();
          if (1 > var3) {
            return false;
          } else {
            if (-13 <= var3) {
              L0: {
                var4 = ui.a(1, param0);
                if (var4 == null) {
                  break L0;
                } else {
                  if (-2 > var4.length()) {
                    break L0;
                  } else {
                    L1: {
                      if (jd.a(var4.charAt(0), -33)) {
                        break L1;
                      } else {
                        if (jd.a(var4.charAt(-1 + var4.length()), -33)) {
                          break L1;
                        } else {
                          L2: {
                            if (param1 == 4) {
                              break L2;
                            } else {
                              f.e(1);
                              break L2;
                            }
                          }
                          var5 = 0;
                          var6 = 0;
                          L3: while (true) {
                            if (var6 >= param0.length()) {
                              if (0 >= var5) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L4: {
                                var7 = param0.charAt(var6);
                                if (!jd.a((char) var7, param1 + -37)) {
                                  var5 = 0;
                                  break L4;
                                } else {
                                  var5++;
                                  break L4;
                                }
                              }
                              if (2 <= var5) {
                                if (!param2) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private final void f(int param0) {
        try {
            IOException iOException = null;
            int var2_int = 0;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((f) this).field_F == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            ((f) this).field_o.field_p = 0;
                            ((f) this).field_o.a((byte) 111, 6);
                            ((f) this).field_o.e(31, 3);
                            ((f) this).field_o.d(0, 90);
                            var2_int = -85 / ((-22 - param0) / 42);
                            ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((f) this).field_F.b(12110);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((f) this).field_f = ((f) this).field_f + 1;
                        ((f) this).field_F = null;
                        ((f) this).field_t = -2;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
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

    final void a(int param0) {
        try {
            ((f) this).field_F.b(12110);
            // if_icmpeq L34
            Object var3 = null;
            ((f) this).a((Object) null, true, 90);
        } catch (Exception exception) {
        }
        ((f) this).field_t = -1;
        ((f) this).field_f = ((f) this).field_f + 1;
        ((f) this).field_F = null;
        ((f) this).field_n = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean d(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            int var2_int = 0;
            Exception var3 = null;
            qa var3_ref = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            long var13 = 0L;
            Object var15 = null;
            qa var15_ref = null;
            int var16 = 0;
            int var17 = 0;
            int stackIn_62_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_87_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_77_0 = 0;
            int stackOut_86_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var17 = SteelSentinels.field_G;
                        if (null != ((f) this).field_F) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = mm.a(52);
                        var4 = (int)(-((f) this).field_e + var2_long);
                        ((f) this).field_e = var2_long;
                        if ((var4 ^ -1) < -201) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var4 = 200;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((f) this).field_i = ((f) this).field_i + var4;
                        if ((((f) this).field_i ^ -1) >= -30001) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((f) this).field_F.b(12110);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        ((f) this).field_F = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((f) this).field_F == null) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (((f) this).a((byte) 16) != -1) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (-1 == ((f) this).d(-21033)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    case 17: {
                        try {
                            var2_int = -82 % ((78 - param0) / 33);
                            ((f) this).field_F.a(true);
                            var3_ref = (qa) (Object) ((f) this).field_m.b(22);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var3_ref == null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((f) this).field_o.field_p = 0;
                            ((f) this).field_o.a((byte) 111, 1);
                            ((f) this).field_o.a(var3_ref.field_w, (byte) 120);
                            ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                            ((f) this).field_a.a((byte) 121, (kd) (Object) var3_ref);
                            var3_ref = (qa) (Object) ((f) this).field_m.a(false);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var3_ref = (qa) (Object) ((f) this).field_j.b(22);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var3_ref == null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((f) this).field_o.field_p = 0;
                            ((f) this).field_o.a((byte) 110, 0);
                            ((f) this).field_o.a(var3_ref.field_w, (byte) 120);
                            ((f) this).field_F.a(((f) this).field_o.field_t.length, ((f) this).field_o.field_t, -100, 0);
                            ((f) this).field_p.a((byte) 106, (kd) (Object) var3_ref);
                            var3_ref = (qa) (Object) ((f) this).field_j.a(false);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var3_int = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((var3_int ^ -1) <= -101) {
                                statePc = 86;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var4 = ((f) this).field_F.a(-114);
                            if (0 > var4) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var4 != 0) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((f) this).field_i = 0;
                            var5 = 0;
                            if (((f) this).field_d == null) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((f) this).field_d.field_I != 0) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var5 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var5 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (0 < var5) {
                                statePc = 50;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var6 = -((f) this).field_d.field_K + ((f) this).field_d.field_G.field_t.length;
                            var7 = 512 - ((f) this).field_d.field_I;
                            if (var7 > var6 + -((f) this).field_d.field_G.field_p) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var7 = -((f) this).field_d.field_G.field_p + var6;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var7 <= var4) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var7 = var4;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((f) this).field_F.a(((f) this).field_d.field_G.field_p, var7, ((f) this).field_d.field_G.field_t, -256);
                            if (((f) this).field_n != 0) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var8 = 0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var7 <= var8) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((f) this).field_d.field_G.field_t[((f) this).field_d.field_G.field_p + var8] = (byte)bi.a((int) ((f) this).field_d.field_G.field_t[((f) this).field_d.field_G.field_p + var8], (int) ((f) this).field_n);
                            var8++;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            ((f) this).field_d.field_G.field_p = ((f) this).field_d.field_G.field_p + var7;
                            ((f) this).field_d.field_I = ((f) this).field_d.field_I + var7;
                            if (var6 != ((f) this).field_d.field_G.field_p) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((f) this).field_d.e(480);
                            ((f) this).field_d.field_z = false;
                            ((f) this).field_d = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (((f) this).field_d.field_I == 512) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            ((f) this).field_d.field_I = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var6 = var5 + -((f) this).field_c.field_p;
                            if (var6 > var4) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var6 = var4;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((f) this).field_F.a(((f) this).field_c.field_p, var6, ((f) this).field_c.field_t, -256);
                            if (0 == ((f) this).field_n) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var7 = 0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var7 >= var6) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((f) this).field_c.field_t[((f) this).field_c.field_p - -var7] = (byte)bi.a((int) ((f) this).field_c.field_t[((f) this).field_c.field_p + var7], (int) ((f) this).field_n);
                            var7++;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((f) this).field_c.field_p = ((f) this).field_c.field_p + var6;
                            if (((f) this).field_c.field_p < var5) {
                                statePc = 85;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((f) this).field_d != null) {
                                statePc = 79;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((f) this).field_c.field_p = 0;
                            var7 = ((f) this).field_c.f((byte) -86);
                            var8 = ((f) this).field_c.i(0);
                            var9 = ((f) this).field_c.f((byte) -113);
                            var10 = ((f) this).field_c.i(0);
                            var11 = var9 & 127;
                            if (0 == (var9 & 128)) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_62_0 = stackOut_60_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var12 = stackIn_62_0;
                            var13 = ((long)var7 << 442290464) - -(long)var8;
                            var15 = null;
                            if (var12 != 0) {
                                statePc = 68;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var15_ref = (qa) (Object) ((f) this).field_a.b(22);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var15_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var15_ref.field_w != var13) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var15_ref = (qa) (Object) ((f) this).field_a.a(false);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var15_ref = (qa) (Object) ((f) this).field_p.b(22);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var15_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((var15_ref.field_w ^ -1L) != (var13 ^ -1L)) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var15_ref = (qa) (Object) ((f) this).field_p.a(false);
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var15_ref != null) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (var11 != 0) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackOut_76_0 = 5;
                            stackIn_78_0 = stackOut_76_0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackOut_77_0 = 9;
                            stackIn_78_0 = stackOut_77_0;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var16 = stackIn_78_0;
                            ((f) this).field_d = var15_ref;
                            ((f) this).field_d.field_G = new gi(var16 + (var10 + ((f) this).field_d.field_K));
                            ((f) this).field_d.field_G.a((byte) 125, var11);
                            ((f) this).field_d.field_G.b(true, var10);
                            ((f) this).field_c.field_p = 0;
                            ((f) this).field_d.field_I = 10;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (((f) this).field_d.field_I == 0) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (((f) this).field_c.field_t[0] != -1) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((f) this).field_d.field_I = 1;
                            ((f) this).field_c.field_p = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((f) this).field_d = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var3_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            stackOut_86_0 = 1;
                            stackIn_87_0 = stackOut_86_0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        return stackIn_87_0 != 0;
                    }
                    case 88: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 89;
                        continue stateLoop;
                    }
                    case 89: {
                        try {
                            ((f) this).field_F.b(12110);
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        ((f) this).field_f = ((f) this).field_f + 1;
                        ((f) this).field_F = null;
                        ((f) this).field_t = -2;
                        if (((f) this).a((byte) 16) != 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    }
                    case 93: {
                        if (0 != ((f) this).d(-21033)) {
                            statePc = 95;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    }
                    case 94: {
                        return true;
                    }
                    case 95: {
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

    public f() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[256];
        field_u = "<%0> is already on your friend list.";
        field_D = new rf();
        field_E = "<%0> sec";
        field_G = new java.util.zip.CRC32();
        field_v = 0;
        field_z = "Skip mission";
    }
}
