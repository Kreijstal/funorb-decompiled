/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends ih {
    static dh field_u;
    static String field_t;
    static jp[] field_s;
    private wh field_q;
    static String field_r;

    final static void a(int param0, ak param1, j param2) {
        int var3 = 0;
        jp var4 = null;
        jp var5 = null;
        int var6 = 0;
        jp[] var7 = null;
        jp var9 = null;
        jp var10 = null;
        if (oa.field_Sb == null) {
          return;
        } else {
          L0: {
            var3 = 256 * km.field_i / 32;
            var4 = oa.field_Sb.c((byte) -123);
            if (var4 == null) {
              break L0;
            } else {
              if (-1 == (km.field_i ^ -1)) {
                var4.c(-var4.field_x + 640, 470 - var4.field_z);
                break L0;
              } else {
                var4.b(-var4.field_x + 640, 470 - var4.field_z, 256 + -var3);
                break L0;
              }
            }
          }
          L1: {
            if (param0 == 640) {
              break L1;
            } else {
              field_r = null;
              break L1;
            }
          }
          L2: {
            if (-1 <= (km.field_i ^ -1)) {
              break L2;
            } else {
              if (ih.field_k != null) {
                ih.field_k.b(640 + -ih.field_k.field_x, 480 + -ih.field_k.field_z - 10, var3);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            var5 = nm.field_f[param2.field_y];
            if (var4 == null) {
              break L3;
            } else {
              var5.c(-3 + (640 + -((var4.field_x - -var5.field_x) / 2)), -var4.field_z + 480 + -10 + 45);
              break L3;
            }
          }
          L4: {
            var6 = kb.a(param1, 0, 100, param2);
            var7 = oa.field_Sb.b(param0 ^ -746);
            if (var7 != null) {
              var9 = var7[var6];
              var9.c(-20 + (-var9.field_x + 640), 520 - var9.field_z);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (km.field_i <= 0) {
              break L5;
            } else {
              if (null != fq.field_c) {
                var10 = fq.field_c[var6];
                var10.b(-var10.field_x + 620, 40 + (-var10.field_z + 480), var3);
                break L5;
              } else {
                break L5;
              }
            }
          }
          return;
        }
    }

    private final void g(byte param0) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Exception var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((a) this).field_q == null) {
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
                        var2 = 74 % ((param0 - 14) / 57);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            ((a) this).field_m.field_l = 0;
                            ((a) this).field_m.a(44, 6);
                            ((a) this).field_m.a((byte) 47, 3);
                            ((a) this).field_m.b((byte) 125, 0);
                            ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((a) this).field_q.a((byte) 112);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((a) this).field_f = -2;
                        ((a) this).field_q = null;
                        ((a) this).field_i = ((a) this).field_i + 1;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
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

    final boolean b(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            da var2_ref = null;
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
            da var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_90_0 = 0;
            int stackOut_48_0;
            int stackOut_49_0;
            int stackOut_64_0;
            int stackOut_65_0;
            int stackOut_89_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = BrickABrac.field_J ? 1 : 0;
                        if (((a) this).field_q != null) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ue.a(false);
                        var4 = (int)(var2_long - ((a) this).field_o);
                        if (var4 <= 200) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((a) this).field_o = var2_long;
                        ((a) this).field_b = ((a) this).field_b + var4;
                        if (((a) this).field_b > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((a) this).field_q.a((byte) 120);
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
                        ((a) this).field_q = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((a) this).field_q == null) {
                            statePc = 12;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 != ((a) this).e((byte) -67)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (((a) this).c((byte) -105) == 0) {
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
                            ((a) this).field_q.c(-1);
                            var2_ref = (da) (Object) ((a) this).field_g.a(true);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((a) this).field_m.field_l = 0;
                            ((a) this).field_m.a(-102, 1);
                            ((a) this).field_m.a(var2_ref.field_j, (byte) -32);
                            ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                            ((a) this).field_n.a((tk) (Object) var2_ref, false);
                            var2_ref = (da) (Object) ((a) this).field_g.e(-8394);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var2_ref = (da) (Object) ((a) this).field_a.a(true);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((a) this).field_m.field_l = 0;
                            ((a) this).field_m.a(-128, 0);
                            ((a) this).field_m.a(var2_ref.field_j, (byte) -32);
                            ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                            ((a) this).field_c.a((tk) (Object) var2_ref, false);
                            var2_ref = (da) (Object) ((a) this).field_a.e(-8394);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (param0 > 10) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            a.h((byte) -19);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var2_int = 0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (100 <= var2_int) {
                                statePc = 89;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var3_int = ((a) this).field_q.d(10434);
                            if (-1 >= (var3_int ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (0 == var3_int) {
                                statePc = 89;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((a) this).field_b = 0;
                            var4 = 0;
                            if (null == ((a) this).field_e) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (0 != ((a) this).field_e.field_K) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 91;
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
                            statePc = 91;
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
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var4 <= 0) {
                                statePc = 73;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5 = var4 + -((a) this).field_l.field_l;
                            if (var3_int < var5) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var5 = var3_int;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((a) this).field_q.a(25826, ((a) this).field_l.field_k, var5, ((a) this).field_l.field_l);
                            if (0 != ((a) this).field_h) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6 = 0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var6 >= var5) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((a) this).field_l.field_k[((a) this).field_l.field_l - -var6] = (byte)pn.a((int) ((a) this).field_l.field_k[((a) this).field_l.field_l + var6], (int) ((a) this).field_h);
                            var6++;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((a) this).field_l.field_l = ((a) this).field_l.field_l + var5;
                            if (((a) this).field_l.field_l >= var4) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (null == ((a) this).field_e) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((a) this).field_l.field_l = 0;
                            var6 = ((a) this).field_l.l(255);
                            var7 = ((a) this).field_l.e(255);
                            var8 = ((a) this).field_l.l(255);
                            var9 = ((a) this).field_l.e(255);
                            var10 = var8 & 127;
                            if (0 == (var8 & 128)) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackOut_49_0 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var11 = stackIn_50_0;
                            var12 = (long)var7 + ((long)var6 << 1273502368);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 56;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var14_ref = (da) (Object) ((a) this).field_c.a(true);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var14_ref == null) {
                                statePc = 61;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var12 != var14_ref.field_j) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var14_ref = (da) (Object) ((a) this).field_c.e(-8394);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var14_ref = (da) (Object) ((a) this).field_n.a(true);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var14_ref == null) {
                                statePc = 61;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (var14_ref.field_j != var12) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var14_ref = (da) (Object) ((a) this).field_n.e(-8394);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var14_ref != null) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (-1 != (var10 ^ -1)) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 5;
                            stackIn_66_0 = stackOut_64_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 9;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var15 = stackIn_66_0;
                            ((a) this).field_e = var14_ref;
                            ((a) this).field_e.field_D = new wq(var9 - -var15 - -((a) this).field_e.field_F);
                            ((a) this).field_e.field_D.a(-107, var10);
                            ((a) this).field_e.field_D.a(var9, (byte) -79);
                            ((a) this).field_e.field_K = 10;
                            ((a) this).field_l.field_l = 0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (0 == ((a) this).field_e.field_K) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if ((((a) this).field_l.field_k[0] ^ -1) == 0) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((a) this).field_e = null;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            ((a) this).field_l.field_l = 0;
                            ((a) this).field_e.field_K = 1;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var5 = -((a) this).field_e.field_F + ((a) this).field_e.field_D.field_k.length;
                            var6 = 512 - ((a) this).field_e.field_K;
                            if (var6 > var5 + -((a) this).field_e.field_D.field_l) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var6 = var5 - ((a) this).field_e.field_D.field_l;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var3_int < var6) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var6 = var3_int;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((a) this).field_q.a(25826, ((a) this).field_e.field_D.field_k, var6, ((a) this).field_e.field_D.field_l);
                            if (((a) this).field_h != 0) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var7 = 0;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (var7 >= var6) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((a) this).field_e.field_D.field_k[var7 + ((a) this).field_e.field_D.field_l] = (byte)pn.a((int) ((a) this).field_e.field_D.field_k[var7 + ((a) this).field_e.field_D.field_l], (int) ((a) this).field_h);
                            var7++;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((a) this).field_e.field_K = ((a) this).field_e.field_K + var6;
                            ((a) this).field_e.field_D.field_l = ((a) this).field_e.field_D.field_l + var6;
                            if (var5 != ((a) this).field_e.field_D.field_l) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            ((a) this).field_e.d(3);
                            ((a) this).field_e.field_u = false;
                            ((a) this).field_e = null;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (((a) this).field_e.field_K != 512) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            ((a) this).field_e.field_K = 0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var2_int++;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            stackOut_89_0 = 1;
                            stackIn_90_0 = stackOut_89_0;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        return stackIn_90_0 != 0;
                    }
                    case 91: {
                        var2 = (IOException) (Object) caughtException;
                        statePc = 92;
                        continue stateLoop;
                    }
                    case 92: {
                        try {
                            ((a) this).field_q.a((byte) 119);
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 95;
                        continue stateLoop;
                    }
                    case 95: {
                        ((a) this).field_f = -2;
                        ((a) this).field_q = null;
                        ((a) this).field_i = ((a) this).field_i + 1;
                        if (((a) this).e((byte) -41) != 0) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    }
                    case 96: {
                        if (0 != ((a) this).c((byte) 101)) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    }
                    case 97: {
                        return true;
                    }
                    case 98: {
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

    final static boolean a(int param0, mp param1, mp param2) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var3 = param2.field_Sb - param1.field_Sb;
        if (rk.field_Tb == param2.field_Ub) {
            // wide iinc 3 -200
        } else {
            if (!(null != param2.field_Ub)) {
                // wide iinc 3 200
            }
        }
        if (param0 != 200) {
            return false;
        }
        if (rk.field_Tb != param1.field_Ub) {
            // ifnonnull L113
            // wide iinc 3 -200
        } else {
            // wide iinc 3 200
        }
        return -1 > (var3 ^ -1) ? true : false;
    }

    final void a(byte param0) {
        try {
            ((a) this).field_q.a((byte) 113);
        } catch (Exception exception) {
        }
        ((a) this).field_i = ((a) this).field_i + 1;
        if (param0 != 8) {
            return;
        }
        ((a) this).field_f = -1;
        ((a) this).field_q = null;
        ((a) this).field_h = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void h(byte param0) {
        field_r = null;
        if (param0 > -92) {
            a.h((byte) 64);
        }
        field_u = null;
        field_s = null;
        field_t = null;
    }

    final static void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var1 = fi.field_w[0];
        if (param0 != 94) {
            a.f((byte) 52);
        }
        for (var2 = 1; fi.field_w.length > var2; var2++) {
            var3 = fi.field_w[var2];
            pm.a(ek.field_jb, var2 << 1493467876, ek.field_jb, var1, var3);
            var1 = var1 + var3;
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            da var4_ref2 = null;
            Exception var5 = null;
            int var6 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = BrickABrac.field_J ? 1 : 0;
                        if (((a) this).field_q != null) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            ((a) this).field_q.a((byte) 114);
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
                        ((a) this).field_q = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ((a) this).field_q = (wh) param0;
                        this.g((byte) 116);
                        this.a(param1, false);
                        if (param2 == 12) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ((a) this).a((byte) -71);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ((a) this).field_l.field_l = 0;
                        ((a) this).field_e = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var4_ref2 = (da) (Object) ((a) this).field_n.a(25609);
                        if (var4_ref2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((a) this).field_g.a((tk) (Object) var4_ref2, false);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 11: {
                        var4_ref2 = (da) (Object) ((a) this).field_c.a(param2 + 25597);
                        if (var4_ref2 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ((a) this).field_a.a((tk) (Object) var4_ref2, false);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        if (((a) this).field_h == 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((a) this).field_m.field_l = 0;
                            ((a) this).field_m.a(param2 + 50, 4);
                            ((a) this).field_m.a(40, (int) ((a) this).field_h);
                            ((a) this).field_m.a(0, (byte) -79);
                            ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var4_ref = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((a) this).field_q.a((byte) 116);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((a) this).field_i = ((a) this).field_i + 1;
                        ((a) this).field_q = null;
                        ((a) this).field_f = -2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((a) this).field_b = 0;
                        ((a) this).field_o = ue.a(false);
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
        if (!(((a) this).field_q == null)) {
            ((a) this).field_q.a((byte) 111);
        }
        if (param0 != 30) {
            this.g((byte) -72);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wq stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            wq stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            wq stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            wq stackOut_4_0;
            int stackOut_4_1;
            wq stackOut_5_0;
            int stackOut_5_1;
            int stackOut_5_2;
            wq stackOut_6_0;
            int stackOut_6_1;
            int stackOut_6_2;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (((a) this).field_q != null) {
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
                            ((a) this).field_m.field_l = 0;
                            if (!param1) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = ((a) this).field_m;
                            stackOut_4_1 = 37;
                            stackIn_6_0 = stackOut_4_0;
                            stackIn_6_1 = stackOut_4_1;
                            stackIn_5_0 = stackOut_4_0;
                            stackIn_5_1 = stackOut_4_1;
                            if (!param0) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (wq) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
                            stackIn_7_0 = stackOut_5_0;
                            stackIn_7_1 = stackOut_5_1;
                            stackIn_7_2 = stackOut_5_2;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = (wq) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = 3;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            stackIn_7_2 = stackOut_6_2;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((wq) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2);
                            ((a) this).field_m.a(0L, (byte) -32);
                            ((a) this).field_q.a(((a) this).field_m.field_k, true, ((a) this).field_m.field_k.length, 0);
                            statePc = 14;
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
                        try {
                            ((a) this).field_q.a((byte) 117);
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
                        ((a) this).field_f = -2;
                        ((a) this).field_i = ((a) this).field_i + 1;
                        ((a) this).field_q = null;
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

    public a() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Enter name of friend to add to list";
        field_r = "Music: ";
    }
}
