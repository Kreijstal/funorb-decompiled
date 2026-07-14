/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf extends un {
    private vf field_s;
    static int field_r;

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            gk var5 = null;
            rb stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            rb stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            rb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            rb stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            rb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            rb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((hf) this).field_s != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            ((hf) this).field_l.field_g = 0;
                            stackOut_2_0 = ((hf) this).field_l;
                            stackOut_2_1 = -1336879960;
                            stackIn_4_0 = stackOut_2_0;
                            stackIn_4_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
                            if (param0) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (rb) (Object) stackIn_3_0;
                            stackOut_3_1 = stackIn_3_1;
                            stackOut_3_2 = 3;
                            stackIn_5_0 = stackOut_3_0;
                            stackIn_5_1 = stackOut_3_1;
                            stackIn_5_2 = stackOut_3_2;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = (rb) (Object) stackIn_4_0;
                            stackOut_4_1 = stackIn_4_1;
                            stackOut_4_2 = 2;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            stackIn_5_2 = stackOut_4_2;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((rb) (Object) stackIn_5_0).b(stackIn_5_1, stackIn_5_2);
                            ((hf) this).field_l.a((byte) -64, 0L);
                            ((hf) this).field_s.a(((hf) this).field_l.field_f.length, 0, -104, ((hf) this).field_l.field_f);
                            statePc = 12;
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
                        try {
                            ((hf) this).field_s.a(1);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        ((hf) this).field_e = -2;
                        ((hf) this).field_s = null;
                        ((hf) this).field_j = ((hf) this).field_j + 1;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var5 = (gk) null;
                        ll[] discarded$2 = hf.a(120, (gk) null, -58, -76);
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            gp var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = AceOfSkies.field_G ? 1 : 0;
                        if (null != ((hf) this).field_s) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((hf) this).field_s.a(1);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        ((hf) this).field_s = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((hf) this).field_s = (vf) param2;
                        this.d((byte) -116);
                        if (param0 == 3006) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        this.d((byte) 116);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        this.a(param1, true);
                        ((hf) this).field_a = null;
                        ((hf) this).field_h.field_g = 0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (gp) ((hf) this).field_g.b(param0 ^ -17386);
                        if (var4_ref2 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((hf) this).field_b.a(2, (wt) (Object) var4_ref2);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 12: {
                        var4_ref2 = (gp) ((hf) this).field_n.b(-18520);
                        if (var4_ref2 == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ((hf) this).field_d.a(2, (wt) (Object) var4_ref2);
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 14: {
                        if (((hf) this).field_k == 0) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((hf) this).field_l.field_g = 0;
                            ((hf) this).field_l.b(-1336879960, 4);
                            ((hf) this).field_l.b(param0 + -1336882966, (int) ((hf) this).field_k);
                            ((hf) this).field_l.a((byte) 87, 0);
                            ((hf) this).field_s.a(((hf) this).field_l.field_f.length, 0, 35, ((hf) this).field_l.field_f);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            ((hf) this).field_s.a(1);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((hf) this).field_j = ((hf) this).field_j + 1;
                        ((hf) this).field_e = -2;
                        ((hf) this).field_s = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        ((hf) this).field_p = 0;
                        ((hf) this).field_m = kh.a(-59);
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

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        var12 = new char[param1];
        var11 = var12;
        var4 = var11;
        var5 = 0;
        var6 = 0;
        var7 = -15 / ((-55 - param0) / 53);
        L0: while (true) {
          if (param1 <= var6) {
            return new String(var12, 0, var5);
          } else {
            var8 = 255 & param3[var6 + param2];
            if (-1 != (var8 ^ -1)) {
              L1: {
                if (var8 < 128) {
                  break L1;
                } else {
                  if (160 <= var8) {
                    break L1;
                  } else {
                    L2: {
                      var9 = te.field_e[-128 + var8];
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
              var5++;
              var4[var5] = (char)var8;
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void c(byte param0) {
        try {
            ((hf) this).field_s.a(1);
        } catch (Exception exception) {
        }
        ((hf) this).field_e = -1;
        int var2 = 25 % ((39 - param0) / 57);
        ((hf) this).field_j = ((hf) this).field_j + 1;
        ((hf) this).field_s = null;
        ((hf) this).field_k = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public hf() {
    }

    final boolean f(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            gp var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
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
            long var12 = 0L;
            Object var14 = null;
            gp var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            int stackIn_77_0 = 0;
            int stackIn_85_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_76_0 = 0;
            int stackOut_84_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = AceOfSkies.field_G ? 1 : 0;
                        if (((hf) this).field_s != null) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = kh.a(-97);
                        var4 = (int)(-((hf) this).field_m + var2_long);
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
                        ((hf) this).field_m = var2_long;
                        ((hf) this).field_p = ((hf) this).field_p + var4;
                        if (30000 < ((hf) this).field_p) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((hf) this).field_s.a(1);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var5_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((hf) this).field_s = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (((hf) this).field_s == null) {
                            statePc = 13;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (0 != ((hf) this).b(param0 + -1048142560)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (((hf) this).c(-77) != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return true;
                    }
                    case 16: {
                        return false;
                    }
                    case 17: {
                        try {
                            ((hf) this).field_s.b((byte) 107);
                            var2_ref = (gp) ((hf) this).field_b.b((byte) 123);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2_ref == null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((hf) this).field_l.field_g = 0;
                            ((hf) this).field_l.b(-1336879960, 1);
                            ((hf) this).field_l.a((byte) -106, ((gp) var2_ref).field_i);
                            ((hf) this).field_s.a(((hf) this).field_l.field_f.length, 0, -103, ((hf) this).field_l.field_f);
                            ((hf) this).field_g.a(param0 + 2, (wt) (Object) var2_ref);
                            var2_ref = (gp) ((hf) this).field_b.e(31542);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var2_ref = (gp) ((hf) this).field_d.b((byte) 69);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2_ref == null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((hf) this).field_l.field_g = 0;
                            ((hf) this).field_l.b(-1336879960, 0);
                            ((hf) this).field_l.a((byte) -59, ((gp) var2_ref).field_i);
                            ((hf) this).field_s.a(((hf) this).field_l.field_f.length, 0, 52, ((hf) this).field_l.field_f);
                            ((hf) this).field_n.a(param0 + 2, (wt) (Object) var2_ref);
                            var2_ref = (gp) ((hf) this).field_d.e(31542);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2_int = param0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 84;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_int = ((hf) this).field_s.b(-125);
                            if (0 > var3_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (0 == var3_int) {
                                statePc = 84;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((hf) this).field_p = 0;
                            var4 = 0;
                            if (((hf) this).field_a == null) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((hf) this).field_a.field_x == 0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var4 = 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var4 = 10;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if ((var4 ^ -1) < -1) {
                                statePc = 49;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = ((hf) this).field_a.field_u.field_f.length + -((hf) this).field_a.field_z;
                            var6 = 512 - ((hf) this).field_a.field_x;
                            if (var6 <= var5 + -((hf) this).field_a.field_u.field_g) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var6 = -((hf) this).field_a.field_u.field_g + var5;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = var3_int;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((hf) this).field_s.a(((hf) this).field_a.field_u.field_g, var6, ((hf) this).field_a.field_u.field_f, true);
                            if (-1 != (((hf) this).field_k ^ -1)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var7 = 0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var7 >= var6) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((hf) this).field_a.field_u.field_f[var7 + ((hf) this).field_a.field_u.field_g] = (byte)id.a((int) ((hf) this).field_a.field_u.field_f[var7 + ((hf) this).field_a.field_u.field_g], (int) ((hf) this).field_k);
                            var7++;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            ((hf) this).field_a.field_u.field_g = ((hf) this).field_a.field_u.field_g + var6;
                            ((hf) this).field_a.field_x = ((hf) this).field_a.field_x + var6;
                            if (var5 == ((hf) this).field_a.field_u.field_g) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if ((((hf) this).field_a.field_x ^ -1) == -513) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((hf) this).field_a.field_x = 0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ((hf) this).field_a.d(-125);
                            ((hf) this).field_a.field_p = false;
                            ((hf) this).field_a = null;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var5 = var4 - ((hf) this).field_h.field_g;
                            if (var3_int < var5) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = var3_int;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((hf) this).field_s.a(((hf) this).field_h.field_g, var5, ((hf) this).field_h.field_f, true);
                            if (0 != ((hf) this).field_k) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var6 = 0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (var6 >= var5) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((hf) this).field_h.field_f[var6 + ((hf) this).field_h.field_g] = (byte)id.a((int) ((hf) this).field_h.field_f[var6 + ((hf) this).field_h.field_g], (int) ((hf) this).field_k);
                            var6++;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((hf) this).field_h.field_g = ((hf) this).field_h.field_g + var5;
                            if (((hf) this).field_h.field_g < var4) {
                                statePc = 83;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((hf) this).field_a != null) {
                                statePc = 78;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((hf) this).field_h.field_g = 0;
                            var6 = ((hf) this).field_h.g(-72);
                            var7 = ((hf) this).field_h.a((byte) 125);
                            var8 = ((hf) this).field_h.g(-104);
                            var9 = ((hf) this).field_h.a((byte) 127);
                            var10 = var8 & 127;
                            if ((128 & var8) == 0) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 86;
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
                            statePc = 86;
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
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var11 = stackIn_62_0;
                            var12 = (long)var7 + ((long)var6 << -1100582816);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 67;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (gp) ((hf) this).field_g.b((byte) 81);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var12 == ((gp) var14_ref).field_i) {
                                statePc = 71;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var14_ref = (gp) ((hf) this).field_g.e(31542);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var14_ref = (gp) ((hf) this).field_n.b((byte) 86);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var12 == ((gp) var14_ref).field_i) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14_ref = (gp) ((hf) this).field_n.e(param0 ^ 31542);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var14_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((hf) this).field_a = var14_ref;
                            if (var10 == 0) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackOut_75_0 = 9;
                            stackIn_77_0 = stackOut_75_0;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackOut_76_0 = 5;
                            stackIn_77_0 = stackOut_76_0;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var15 = stackIn_77_0;
                            ((hf) this).field_a.field_u = new rb(((hf) this).field_a.field_z + var9 + var15);
                            ((hf) this).field_a.field_u.b(-1336879960, var10);
                            ((hf) this).field_a.field_u.a((byte) 79, var9);
                            ((hf) this).field_a.field_x = 10;
                            ((hf) this).field_h.field_g = 0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (((hf) this).field_a.field_x != 0) {
                                statePc = 82;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (0 == (((hf) this).field_h.field_f[0] ^ -1)) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((hf) this).field_a = null;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((hf) this).field_h.field_g = 0;
                            ((hf) this).field_a.field_x = 1;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var2_int++;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            stackOut_84_0 = 1;
                            stackIn_85_0 = stackOut_84_0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 86;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        return stackIn_85_0 != 0;
                    }
                    case 86: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 87;
                        continue stateLoop;
                    }
                    case 87: {
                        try {
                            ((hf) this).field_s.a(param0 + 1);
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 90;
                        continue stateLoop;
                    }
                    case 90: {
                        ((hf) this).field_e = -2;
                        ((hf) this).field_s = null;
                        ((hf) this).field_j = ((hf) this).field_j + 1;
                        if (-1 != (((hf) this).b(-1048142560) ^ -1)) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        if (((hf) this).c(-113) != 0) {
                            statePc = 93;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    }
                    case 92: {
                        return true;
                    }
                    case 93: {
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

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((hf) this).field_s == null) {
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
                            ((hf) this).field_l.field_g = 0;
                            if (param0 <= -19) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            field_r = -17;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((hf) this).field_l.b(-1336879960, 6);
                            ((hf) this).field_l.c(0, 3);
                            ((hf) this).field_l.a(0, 23385);
                            ((hf) this).field_s.a(((hf) this).field_l.field_f.length, 0, 60, ((hf) this).field_l.field_f);
                            statePc = 12;
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
                        try {
                            ((hf) this).field_s.a(1);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        ((hf) this).field_s = null;
                        ((hf) this).field_e = -2;
                        ((hf) this).field_j = ((hf) this).field_j + 1;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
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

    final void b(byte param0) {
        if (null != ((hf) this).field_s) {
            ((hf) this).field_s.a(1);
        }
        if (param0 > -101) {
            ((hf) this).field_s = (vf) null;
        }
    }

    final static ll[] a(int param0, gk param1, int param2, int param3) {
        if (param0 != 1) {
            field_r = 92;
        }
        if (!tn.a(param1, (byte) -127, param3, param2)) {
            return null;
        }
        return gl.a(param0 ^ 1);
    }

    static {
    }
}
