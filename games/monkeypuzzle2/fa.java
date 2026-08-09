/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa extends wl {
    static int field_r;
    static int field_p;
    private id field_o;
    static int field_q;

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Object var5 = null;
            gk stackIn_5_0 = null;
            gk stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null == this.field_o) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_l.field_h = 0;
                    stackIn_5_0 = this.field_l;

                    if (!param0) {
                      stackIn_6_0 = (gk) ((Object) stackIn_5_0);
                      stackIn_6_1 = 3;
                      break L1;
                    } else {
                      stackIn_6_0 = (gk) ((Object) stackIn_5_0);
                      stackIn_6_1 = 2;
                      break L1;
                    }
                  }
                  ((gk) (Object) stackIn_6_0).b(stackIn_6_1, -49152);
                  this.field_l.a(0L, -1268490168);
                  this.field_o.a(this.field_l.field_g, 0, (byte) 46, this.field_l.field_g.length);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_o.a((byte) 73);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_b = this.field_b + 1;
                  this.field_a = -2;
                  this.field_o = null;
                  break L2;
                }
              }
              L5: {
                if (param1 == 109) {
                  break L5;
                } else {
                  var5 = (Object) null;
                  this.a(-90, false, (Object) null);
                  break L5;
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

    final void b(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_o.a((byte) 73);
              if (param0 == 20) {
                break L1;
              } else {
                this.field_o = (id) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        this.field_b = this.field_b + 1;
        this.field_o = null;
        this.field_a = -1;
        this.field_m = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean a(byte param0) {
        try {
            int stackIn_32_0 = 0;
            int stackIn_79_0 = 0;
            int stackIn_83_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_110_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            ob var2 = null;
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
            ob var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                        if (this.field_o == null) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = pf.a(0);
                        var4 = (int)(-this.field_e + var2_long);
                        if (-201 > (var4 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        this.field_e = var2_long;
                        this.field_h = this.field_h + var4;
                        if ((this.field_h ^ -1) < -30001) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            this.field_o.a((byte) 73);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) ((Object) caughtException);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        this.field_o = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (this.field_o != null) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        if (this.c(24547) == 0) {
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
                        if (this.d((byte) -25) == 0) {
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
                            this.field_o.b((byte) 86);
                            var2 = (ob) ((Object) this.field_n.a(true));
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            this.field_l.field_h = 0;
                            this.field_l.b(1, -49152);
                            this.field_l.a(var2.field_f, -1268490168);
                            this.field_o.a(this.field_l.field_g, 0, (byte) 80, this.field_l.field_g.length);
                            this.field_j.a(var2, (byte) 95);
                            var2 = (ob) ((Object) this.field_n.c((byte) -75));
                            if (var16 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var2 = (ob) ((Object) this.field_i.a(true));
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2 == null) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            this.field_l.field_h = 0;
                            this.field_l.b(0, -49152);
                            this.field_l.a(var2.field_f, -1268490168);
                            this.field_o.a(this.field_l.field_g, 0, (byte) 83, this.field_l.field_g.length);
                            this.field_c.a(var2, (byte) 127);
                            var2 = (ob) ((Object) this.field_i.c((byte) -75));
                            if (var16 != 0) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var16 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (param0 < -33) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            this.b((byte) -60);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var2_int = 0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 109;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var3_int = this.field_o.c(126);
                            stackIn_110_0 = var3_int;
                            stackIn_32_0 = stackIn_110_0;
                            if (var16 != 0) {
                                statePc = 110;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (stackIn_32_0 < 0) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (-1 != (var3_int ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var16 == 0) {
                                statePc = 109;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            this.field_h = 0;
                            var4 = 0;
                            if (null != this.field_k) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var4 = 10;
                            if (var16 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-1 == (this.field_k.field_p ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var4 = 1;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var4 > 0) {
                                statePc = 62;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var5 = this.field_k.field_o.field_g.length + -this.field_k.field_q;
                            var6 = 512 + -this.field_k.field_p;
                            if (-this.field_k.field_o.field_h + var5 >= var6) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var6 = -this.field_k.field_o.field_h + var5;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var6 = var3_int;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            this.field_o.a(var6, true, this.field_k.field_o.field_g, this.field_k.field_o.field_h);
                            if (this.field_m == 0) {
                                statePc = 55;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var7 = 0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var7 >= var6) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7] = (byte)gi.a((int) this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7], (int) this.field_m);
                            var7++;
                            if (var16 != 0) {
                                statePc = 56;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var16 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            this.field_k.field_p = this.field_k.field_p + var6;
                            this.field_k.field_o.field_h = this.field_k.field_o.field_h + var6;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (this.field_k.field_o.field_h == var5) {
                                statePc = 60;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if ((this.field_k.field_p ^ -1) != -513) {
                                statePc = 108;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.field_k.field_p = 0;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            this.field_k.a(7847);
                            this.field_k.field_j = false;
                            this.field_k = null;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var5 = -this.field_g.field_h + var4;
                            if (var3_int < var5) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var5 = var3_int;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            this.field_o.a(var5, true, this.field_g.field_g, this.field_g.field_h);
                            if (this.field_m != 0) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var6 = 0;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var5 <= var6) {
                                statePc = 72;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            this.field_g.field_g[this.field_g.field_h + var6] = (byte)gi.a((int) this.field_g.field_g[this.field_g.field_h + var6], (int) this.field_m);
                            var6++;
                            if (var16 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var16 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            this.field_g.field_h = this.field_g.field_h + var5;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var4 > this.field_g.field_h) {
                                statePc = 108;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (this.field_k == null) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            this.field_g.field_h = 0;
                            var6 = this.field_g.a((byte) 114);
                            var7 = this.field_g.e(14);
                            var8 = this.field_g.a((byte) 114);
                            var9 = this.field_g.e(-107);
                            var10 = 127 & var8;
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_79_0 = 1;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackIn_79_0 = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var11 = stackIn_79_0;
                            var12 = ((long)var6 << 320106656) - -(long)var7;
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 87;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var14_ref = (ob) ((Object) this.field_j.a(true));
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var14_ref == null) {
                                statePc = 94;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackIn_97_0 = ((var12 ^ -1L) < (var14_ref.field_f ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_f ^ -1L) ? 0 : 1));
                            stackIn_83_0 = stackIn_97_0;
                            if (var16 != 0) {
                                statePc = 97;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (stackIn_83_0 != 0) {
                                statePc = 86;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (var16 == 0) {
                                statePc = 94;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var14_ref = (ob) ((Object) this.field_j.c((byte) -75));
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var14_ref = (ob) ((Object) this.field_c.a(true));
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (var14_ref == null) {
                                statePc = 94;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            stackIn_97_0 = (var12 < var14_ref.field_f ? -1 : (var12 == var14_ref.field_f ? 0 : 1));
                            stackIn_90_0 = stackIn_97_0;
                            if (var16 != 0) {
                                statePc = 97;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (stackIn_90_0 != 0) {
                                statePc = 93;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (var16 == 0) {
                                statePc = 94;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var14_ref = (ob) ((Object) this.field_c.c((byte) -75));
                            if (var16 == 0) {
                                statePc = 88;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (var14_ref != null) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            this.field_k = var14_ref;
                            stackIn_97_0 = var10 ^ -1;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (stackIn_97_0 != -1) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            stackIn_100_0 = 5;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            stackIn_100_0 = 9;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var15 = stackIn_100_0;
                            this.field_k.field_o = new gk(this.field_k.field_q + var9 + var15);
                            this.field_k.field_o.b(var10, -49152);
                            this.field_k.field_o.a(-803539344, var9);
                            this.field_g.field_h = 0;
                            this.field_k.field_p = 10;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (0 != this.field_k.field_p) {
                                statePc = 107;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (-1 != this.field_g.field_g[0]) {
                                statePc = 105;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            this.field_g.field_h = 0;
                            this.field_k.field_p = 1;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.field_k = null;
                            if (var16 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 30;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            stackIn_110_0 = 1;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        return stackIn_110_0 != 0;
                    }
                    case 111: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        try {
                            this.field_o.a((byte) 73);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        this.field_b = this.field_b + 1;
                        this.field_o = null;
                        this.field_a = -2;
                        if (-1 == (this.c(24547) ^ -1)) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    }
                    case 116: {
                        return false;
                    }
                    case 117: {
                        if (this.d((byte) -25) != 0) {
                            statePc = 119;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    }
                    case 118: {
                        return true;
                    }
                    case 119: {
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            String stackIn_32_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            ob var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (this.field_o == null) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            this.field_o.a((byte) 73);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = ((Object) stateCaught_2 instanceof Exception ? 4 : 29);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var4 = (Exception) ((Object) caughtException);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.field_o = null;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_o = (id) (param2);
                            this.e(-1);
                            this.a(param1, (byte) 109);
                            this.field_k = null;
                            this.field_g.field_h = 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_ref = (ob) ((Object) this.field_j.a((byte) -120));
                            if (var4_ref == null) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.field_n.a(var4_ref, (byte) -108);
                            if (var6 != 0) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var6 == 0) {
                                statePc = 7;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var4_ref = (ob) ((Object) this.field_c.a((byte) -120));
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var4_ref == null) {
                                statePc = 16;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            this.field_i.a(var4_ref, (byte) -9);
                            if (var6 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var6 == 0) {
                                statePc = 11;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (this.field_m != 0) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            this.field_l.field_h = 0;
                            this.field_l.b(4, -49152);
                            this.field_l.b((int) this.field_m, -49152);
                            this.field_l.a(-803539344, 0);
                            this.field_o.a(this.field_l.field_g, 0, (byte) 57, this.field_l.field_g.length);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof IOException ? 20 : 29);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            this.field_o.a((byte) 73);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof Exception ? 23 : 29);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            this.field_o = null;
                            this.field_a = -2;
                            this.field_b = this.field_b + 1;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (param0 < -84) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            field_r = 64;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            this.field_h = 0;
                            this.field_e = pf.a(0);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_31_0 = (RuntimeException) (var4_ref3);
                        stackIn_30_0 = stackIn_31_0;
                        stackIn_31_1 = new StringBuilder().append("fa.E(").append(param0).append(',').append(param1).append(',');
                        stackIn_30_1 = stackIn_31_1;
                        if (param2 == null) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                        stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                        stackIn_32_2 = "{...}";
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 31: {
                        stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                        stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                        stackIn_32_2 = "null";
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        throw la.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
                    }
                    case 33: {
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
        if (this.field_o != null) {
            this.field_o.a((byte) 73);
        }
        if (param0 != 7) {
            this.a(false, (byte) -93);
        }
    }

    public fa() {
    }

    private final void e(int param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (param0 == -1) {
              if (this.field_o != null) {
                try {
                  L0: {
                    this.field_l.field_h = 0;
                    this.field_l.b(6, -49152);
                    this.field_l.e(param0 + 122, 3);
                    this.field_l.c(0, 113);
                    this.field_o.a(this.field_l.field_g, 0, (byte) 23, this.field_l.field_g.length);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L1: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L2: {
                        this.field_o.a((byte) 73);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L3: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_b = this.field_b + 1;
                    this.field_a = -2;
                    this.field_o = null;
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        int var2 = 0;
        he var3 = (he) ((Object) mb.field_e.a((byte) -117));
        he var1 = var3;
        if (!(var1 == null)) {
            var2 = em.field_B;
            lb.a(10, pl.field_j, (byte) -128, wc.field_e, var2, ii.field_B);
            ie.field_b[var3.field_h].b(25, var2 + 15);
            pl.field_e.a(rb.field_hb[var3.field_h], 67, var2 - -15, pl.field_j + -72, ii.field_B + -30, 1, -1, 1, 1, pl.field_e.field_C - -pl.field_e.field_D);
        }
        if (param0 != 1) {
            fa.f(47);
        }
    }

    static {
        field_r = 0;
    }
}
