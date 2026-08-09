/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qf extends wb {
    static String field_s;
    private ge field_r;
    static int[] field_q;

    final void b(int param0) {
        if (!(null == this.field_r)) {
            this.field_r.b(param0 ^ 80);
        }
        if (param0 != 0) {
            this.a((byte) 59);
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.equals("B")) {
              if (!param1.equals("I")) {
                L1: {
                  if (param0 == -4174) {
                    break L1;
                  } else {
                    field_q = (int[]) null;
                    break L1;
                  }
                }
                if (!param1.equals("S")) {
                  if (param1.equals("J")) {
                    stackIn_14_0 = Long.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param1.equals("Z")) {
                      if (param1.equals("F")) {
                        stackIn_21_0 = Float.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (!param1.equals("D")) {
                          if (param1.equals("C")) {
                            stackIn_28_0 = Character.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackIn_24_0 = Double.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_17_0 = Boolean.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = Short.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = Integer.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = Byte.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("qf.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void f(int param0) {
        if (!(ug.field_A == null)) {
            ug.field_A.g(false);
        }
        if (param0 != -28390) {
            qf.g(-118);
        }
        if (qj.field_fb != null) {
            qj.field_fb.h(param0 + 4239142);
        }
        cb.a((byte) -52);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            wf stackIn_5_0 = null;
            wf stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null == this.field_r) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_h = 0;
                    stackIn_5_0 = this.field_b;

                    if (param1) {
                      stackIn_6_0 = (wf) ((Object) stackIn_5_0);
                      stackIn_6_1 = 2;
                      break L1;
                    } else {
                      stackIn_6_0 = (wf) ((Object) stackIn_5_0);
                      stackIn_6_1 = 3;
                      break L1;
                    }
                  }
                  ((wf) (Object) stackIn_6_0).c(stackIn_6_1, -1);
                  if (param0 < -53) {
                    this.field_b.a(0L, 687419600);
                    this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 54, 0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_r.b(33);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  this.field_r = null;
                  this.field_j = -2;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        try {
            int stackIn_29_0 = 0;
            int stackIn_72_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_103_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            dc var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
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
            dc var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Lexicominos.field_L ? 1 : 0;
                        if (this.field_r == null) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = rf.c(0);
                        var4 = (int)(-this.field_n + var2_long);
                        this.field_n = var2_long;
                        if ((var4 ^ -1) >= -201) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var4 = 200;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        this.field_e = this.field_e + var4;
                        if ((this.field_e ^ -1) < -30001) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            this.field_r.b(75);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var5_ref_Exception = (Exception) ((Object) caughtException);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        this.field_r = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null == this.field_r) {
                            statePc = 11;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (-1 == (this.c((byte) 67) ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return false;
                    }
                    case 13: {
                        if (this.a(true) == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        return false;
                    }
                    case 15: {
                        return true;
                    }
                    case 17: {
                        try {
                            this.field_r.a(0);
                            var2 = (dc) ((Object) this.field_l.a(true));
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2 == null) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            this.field_b.field_h = 0;
                            this.field_b.c(1, -1);
                            this.field_b.a(var2.field_j, 687419600);
                            this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 58, 0);
                            this.field_k.a(85, var2);
                            var2 = (dc) ((Object) this.field_l.a(-256));
                            if (var16 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var16 == 0) {
                                statePc = 18;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2 = (dc) ((Object) this.field_d.a(true));
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var3_int = 98 % ((-74 - param0) / 48);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2 == null) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            this.field_b.field_h = 0;
                            this.field_b.c(0, -1);
                            this.field_b.a(var2.field_j, 687419600);
                            this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, -124, 0);
                            this.field_f.a(82, var2);
                            var2 = (dc) ((Object) this.field_d.a(-256));
                            if (var16 == 0) {
                                statePc = 24;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var2_int = 0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 102;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var3_int = this.field_r.d(-6448);
                            stackIn_103_0 = -1;
                            stackIn_29_0 = stackIn_103_0;
                            if (var16 != 0) {
                                statePc = 103;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (stackIn_29_0 < (var3_int ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var3_int == 0) {
                                statePc = 102;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            this.field_e = 0;
                            var4 = 0;
                            if (null == this.field_o) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (this.field_o.field_w == 0) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var4 = 10;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (0 < var4) {
                                statePc = 57;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var5 = -this.field_o.field_A + this.field_o.field_x.field_j.length;
                            var6 = -this.field_o.field_w + 512;
                            if (var6 > -this.field_o.field_x.field_h + var5) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6 = var5 + -this.field_o.field_x.field_h;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var6 = var3_int;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            this.field_r.a(this.field_o.field_x.field_j, (byte) -109, var6, this.field_o.field_x.field_h);
                            if (0 == this.field_a) {
                                statePc = 50;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var7 = 0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var6 <= var7) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            this.field_o.field_x.field_j[this.field_o.field_x.field_h - -var7] = (byte)dg.a((int) this.field_o.field_x.field_j[this.field_o.field_x.field_h + var7], (int) this.field_a);
                            var7++;
                            if (var16 != 0) {
                                statePc = 51;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var16 == 0) {
                                statePc = 46;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            this.field_o.field_w = this.field_o.field_w + var6;
                            this.field_o.field_x.field_h = this.field_o.field_x.field_h + var6;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (this.field_o.field_x.field_h == var5) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (-513 != (this.field_o.field_w ^ -1)) {
                                statePc = 101;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            this.field_o.field_w = 0;
                            if (var16 == 0) {
                                statePc = 101;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            this.field_o.b(12);
                            this.field_o.field_v = false;
                            this.field_o = null;
                            if (var16 == 0) {
                                statePc = 101;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var5 = var4 - this.field_h.field_h;
                            if (var5 <= var3_int) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var5 = var3_int;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            this.field_r.a(this.field_h.field_j, (byte) -109, var5, this.field_h.field_h);
                            if (this.field_a != 0) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var6 = 0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (var5 <= var6) {
                                statePc = 66;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            this.field_h.field_j[var6 + this.field_h.field_h] = (byte)dg.a((int) this.field_h.field_j[var6 + this.field_h.field_h], (int) this.field_a);
                            var6++;
                            if (var16 != 0) {
                                statePc = 67;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var16 == 0) {
                                statePc = 62;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            this.field_h.field_h = this.field_h.field_h + var5;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (this.field_h.field_h < var4) {
                                statePc = 101;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (null != this.field_o) {
                                statePc = 93;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            this.field_h.field_h = 0;
                            var6 = this.field_h.d(true);
                            var7 = this.field_h.d((byte) 19);
                            var8 = this.field_h.d(true);
                            var9 = this.field_h.d((byte) 19);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            stackIn_72_0 = 1;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            stackIn_72_0 = 0;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var11 = stackIn_72_0;
                            var12 = ((long)var6 << 323021600) + (long)var7;
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 78;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var14_ref = (dc) ((Object) this.field_f.a(true));
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var14_ref == null) {
                                statePc = 85;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackIn_89_0 = (var14_ref.field_j < var12 ? -1 : (var14_ref.field_j == var12 ? 0 : 1));
                            stackIn_76_0 = stackIn_89_0;
                            if (var16 != 0) {
                                statePc = 89;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (stackIn_76_0 == 0) {
                                statePc = 85;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var14_ref = (dc) ((Object) this.field_f.a(-256));
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var14_ref = (dc) ((Object) this.field_k.a(true));
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var14_ref == null) {
                                statePc = 85;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackIn_89_0 = ((var12 ^ -1L) < (var14_ref.field_j ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_j ^ -1L) ? 0 : 1));
                            stackIn_81_0 = stackIn_89_0;
                            if (var16 != 0) {
                                statePc = 89;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (stackIn_81_0 != 0) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (var16 == 0) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var14_ref = (dc) ((Object) this.field_k.a(-256));
                            if (var16 == 0) {
                                statePc = 79;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var14_ref == null) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            this.field_o = var14_ref;
                            stackIn_89_0 = 0;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (stackIn_89_0 != var10) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            stackIn_92_0 = 5;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            stackIn_92_0 = 9;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var15 = stackIn_92_0;
                            this.field_o.field_x = new wf(this.field_o.field_A + var15 + var9);
                            this.field_o.field_x.c(var10, -1);
                            this.field_o.field_x.f(var9, -32287);
                            this.field_o.field_w = 10;
                            this.field_h.field_h = 0;
                            if (var16 == 0) {
                                statePc = 101;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (this.field_o.field_w == 0) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (0 == (this.field_h.field_j[0] ^ -1)) {
                                statePc = 98;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            this.field_o = null;
                            if (var16 == 0) {
                                statePc = 101;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            this.field_o.field_w = 1;
                            this.field_h.field_h = 0;
                            if (var16 == 0) {
                                statePc = 101;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 27;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            stackIn_103_0 = 1;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 104;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        return stackIn_103_0 != 0;
                    }
                    case 104: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 105;
                        continue stateLoop;
                    }
                    case 105: {
                        try {
                            this.field_r.b(41);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 108;
                        continue stateLoop;
                    }
                    case 108: {
                        this.field_j = -2;
                        this.field_p = this.field_p + 1;
                        this.field_r = null;
                        if (this.c((byte) 67) == 0) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    }
                    case 109: {
                        return false;
                    }
                    case 110: {
                        if (-1 != (this.a(true) ^ -1)) {
                            statePc = 112;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    }
                    case 111: {
                        return true;
                    }
                    case 112: {
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

    public static void e(byte param0) {
        if (param0 != -15) {
            qf.g(49);
        }
        field_q = null;
        field_s = null;
    }

    private final void d(byte param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (null == this.field_r) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_h = 0;
                    if (param0 == -108) {
                      break L1;
                    } else {
                      field_s = (String) null;
                      break L1;
                    }
                  }
                  this.field_b.c(6, -1);
                  this.field_b.d(3, 48);
                  this.field_b.e(97, 0);
                  this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, param0 ^ -124, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_r.b(param0 + 235);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_p = this.field_p + 1;
                  this.field_r = null;
                  this.field_j = -2;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void g(int param0) {
        if (null != jj.field_a) {
            jj.field_a.g(true);
        }
        hd.field_a = new r();
        di.field_x.b(122, hd.field_a);
        if (param0 >= -15) {
            field_q = (int[]) null;
        }
    }

    final static void a(Lexicominos param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              qc.field_c[5] = qc.field_c[5] + 43;
              qc.field_a[5] = new int[]{2};
              vg.field_d[5] = new sg(param0, 5);
              qc.field_a[1] = new int[]{21, 2};
              vg.field_d[1] = new sg(param0, 1);
              if (param1 >= 108) {
                break L1;
              } else {
                qf.e((byte) 68);
                break L1;
              }
            }
            L2: {
              if (0 >= jd.field_c) {
                break L2;
              } else {
                if (!pk.a(jh.field_a, -104)) {
                  break L2;
                } else {
                  qc.field_a[2] = new int[]{6, 4, 7, 10, 8, 11};
                  qc.field_c[2] = -(43 * qc.field_a[2].length / 2) + 225;
                  vg.field_d[2] = new sg(param0, 2);
                  qc.field_a[14] = new int[]{19, 4, 7, 10, 8, 20};
                  qc.field_c[14] = -(qc.field_a[14].length * 43 / 2) + 225;
                  vg.field_d[14] = new sg(param0, 14);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("qf.N(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, Object param2) {
        try {
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            dc var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != this.field_r) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.field_r.b(17);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 5 : 30);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = (Exception) ((Object) caughtException);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_r = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_r = (ge) (param2);
                            this.d((byte) -108);
                            this.a(-82, param0);
                            this.field_o = null;
                            this.field_h.field_h = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var4_ref = (dc) ((Object) this.field_k.a((byte) 100));
                            if (var4_ref == null) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.field_l.a(-72, var4_ref);
                            if (var6 != 0) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var6 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4_ref = (dc) ((Object) this.field_f.a((byte) 100));
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var4_ref != null) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var6 != 0) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            this.field_d.a(-74, var4_ref);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var6 == 0) {
                                statePc = 12;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-1 == (this.field_a ^ -1)) {
                                statePc = 27;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            this.field_b.field_h = 0;
                            this.field_b.c(4, -1);
                            this.field_b.c((int) this.field_a, -1);
                            this.field_b.f(0, -32287);
                            this.field_r.a(this.field_b.field_j, this.field_b.field_j.length, 67, 0);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof IOException ? 22 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            this.field_r.b(84);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof Exception ? 25 : 30);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            this.field_r = null;
                            this.field_j = -2;
                            this.field_p = this.field_p + 1;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            this.field_e = 0;
                            this.field_n = rf.c(0);
                            if (param1 <= -87) {
                                statePc = 34;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            this.a(1, false);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_32_0 = (RuntimeException) (var4_ref3);
                        stackIn_31_0 = stackIn_32_0;
                        stackIn_32_1 = new StringBuilder().append("qf.D(").append(param0).append(',').append(param1).append(',');
                        stackIn_31_1 = stackIn_32_1;
                        if (param2 == null) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                        stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                        stackIn_33_2 = "{...}";
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 32: {
                        stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                        stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                        stackIn_33_2 = "null";
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                    }
                    case 34: {
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

    final void c(int param0) {
        try {
            this.field_r.b(16);
        } catch (Exception exception) {
        }
        if (param0 != -28488) {
            this.a((byte) 46);
        }
        this.field_j = -1;
        this.field_r = null;
        this.field_p = this.field_p + 1;
        this.field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    public qf() {
    }

    static {
        field_s = "Waiting for graphics";
        field_q = new int[8192];
    }
}
