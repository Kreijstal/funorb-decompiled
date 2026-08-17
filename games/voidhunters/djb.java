/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class djb extends qc {
    private rqa[] field_t;
    static boolean field_r;
    static ima[][] field_s;

    final void a(int param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        char stackIn_32_1 = 0;
        int stackIn_38_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_31_1;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        tsa[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tsa var7 = null;
        vga var7_ref = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        rqa var12_ref_rqa = null;
        int var12 = 0;
        rqa var13 = null;
        int var14 = 0;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2 = this.field_p.l(-14453);
              var3 = this.field_p.j(param0 ^ param0);
              var4 = dib.a(var2, 90);
              var5 = aab.a(var4, -25223, var3);
              var6 = "";
              if (0 <= var5) {
                var7 = var4[var5];
                var8_int = var3 + -var7.field_g;
                if (var7.field_e != hpa.field_p) {
                  break L1;
                } else {
                  if (-1 <= (var8_int ^ -1)) {
                    break L1;
                  } else {
                    if ((var8_int ^ -1) >= (var7.field_d.length() ^ -1)) {
                      var6 = var7.field_d.substring(0, var8_int);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var7_ref = this.a(var6, (byte) 28);
            if (-1 != (var7_ref.c(param0 + 35) ^ -1)) {
              var8 = new StringBuilder();
              var9 = var6.length();
              var10 = 1;
              var11 = 2147483647;
              var12_ref_rqa = (rqa) ((Object) var7_ref.a((byte) -54));
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var12_ref_rqa == null) {
                        break L5;
                      } else {
                        stackIn_44_0 = var12_ref_rqa.field_k.length();

                        stackIn_44_1 = var11;

                        if (var14 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (stackIn_44_0 >= stackIn_44_1) {
                              break L6;
                            } else {
                              var11 = var12_ref_rqa.field_k.length();
                              break L6;
                            }
                          }
                          var12_ref_rqa = (rqa) ((Object) var7_ref.a(1900));
                          if (var14 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L7: while (true) {
                      L8: {
                        if (var10 == 0) {
                          break L8;
                        } else {
                          stackIn_44_0 = var9 ^ -1;

                          stackIn_44_1 = var11 ^ -1;

                          if (var14 != 0) {
                            break L4;
                          } else {
                            if (stackIn_44_0 <= stackIn_44_1) {
                              break L8;
                            } else {
                              var12 = ((rqa) ((Object) var7_ref.a((byte) -54))).field_k.charAt(var9);
                              var13 = (rqa) ((Object) var7_ref.a(1900));
                              L9: while (true) {
                                L10: {
                                  if (null == var13) {
                                    break L10;
                                  } else {
                                    stackIn_45_0 = var10;

                                    stackOut_31_1 = var13.field_k.charAt(var9);
                                    stackIn_45_1 = stackOut_31_1;
                                    stackIn_32_1 = stackOut_31_1;
                                    stackIn_45_2 = var12;

                                    if (var14 != 0) {
                                      break L3;
                                    } else {
                                      L11: {


                                        if (stackIn_32_1 != stackIn_45_2) {

                                          stackIn_38_1 = 0;
                                          break L11;
                                        } else {

                                          stackIn_38_1 = 1;
                                          break L11;
                                        }
                                      }
                                      var10 = stackIn_45_0 & stackIn_38_1;
                                      var13 = (rqa) ((Object) var7_ref.a(1900));
                                      if (var14 == 0) {
                                        continue L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                L12: {
                                  if (var10 == 0) {
                                    break L12;
                                  } else {
                                    discarded$0 = var8.append((char) var12);
                                    break L12;
                                  }
                                }
                                var9++;
                                if (var14 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_44_0 = var3;
                      stackIn_44_1 = var8.length();
                      break L4;
                    }
                  }
                  var12 = stackIn_44_0 + stackIn_44_1;
                  stackIn_45_0 = var6.length() - -var8.length() ^ -1;
                  stackIn_45_1 = var11;
                  stackIn_45_2 = -1;
                  break L3;
                }
                L13: {
                  if (stackIn_45_0 != (stackIn_45_1 ^ stackIn_45_2)) {
                    break L13;
                  } else {
                    var12++;
                    discarded$1 = var8.append("()");
                    if ((var7_ref.c(0) ^ -1) != -2) {
                      break L13;
                    } else {
                      if ((((rqa) ((Object) var7_ref.a((byte) -54))).field_n.length ^ -1) == -1) {
                        var12++;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                this.field_p.a(var2.substring(0, var3) + var8.toString() + var2.substring(var3), -110);
                this.field_p.a((byte) -48, var12);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "djb.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        String var3 = null;
        try {
            int var2_int = -15 / ((param0 - 44) / 43);
            var3 = this.field_p.field_Fb.field_R;
            this.field_p.field_Fb.field_R = nv.field_r;
            super.b((byte) -74);
            this.field_p.field_Fb.field_R = var3;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "djb.A(" + param0 + ')');
        }
    }

    final String[] d(int param0) {
        int incrementValue$0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        String[] stackIn_37_0 = null;
        String[] stackIn_39_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        tsa[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tsa var7 = null;
        vga var7_ref = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        rqa var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < -4) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        djb.c((byte) 38);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = this.field_p.l(-14453);
                        var3 = this.field_p.j(0);
                        var4 = dib.a(var2, 83);
                        var5 = aab.a(var4, -25223, var3);
                        this.field_o.field_L = 0;
                        var6 = "";
                        if (var5 < 0) {
                            statePc = 34;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = var4[var5];
                        var8_int = -var7.field_g + var3;
                        if ((hpa.field_p ^ -1) != (var7.field_e ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var8_int ^ -1) < -1) {
                            statePc = 33;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = var5;
                        var10_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (0 > var9) {
                            statePc = 24;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_25_0 = ua.field_o;
                        stackIn_12_0 = stackIn_25_0;
                        stackIn_25_1 = var4[var9].field_e;
                        stackIn_12_1 = stackIn_25_1;
                        if (var11 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 != stackIn_12_1) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10_int++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (wdb.field_vb == var4[var9].field_e) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var10_int--;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var10_int ^ -1) > -1) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9--;
                        if (var11 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = var9 ^ -1;
                        stackIn_25_1 = -1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 >= stackIn_25_1) {
                            statePc = 32;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (hpa.field_p == var4[var9 - 1].field_e) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6 = var4[var9 + -1].field_d;
                        this.field_o.field_L = this.field_n.b(var2.substring(0, var4[-1 + var9].field_g));
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var11 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = var7.field_d.substring(0, Math.min(var7.field_d.length(), var8_int));
                        this.field_o.field_L = this.field_n.b(var2.substring(0, var7.field_g));
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7_ref = this.a(var6, (byte) 28);
                        var8 = new String[var7_ref.c(0)];
                        var9 = 0;
                        var10 = (rqa) ((Object) var7_ref.a((byte) -54));
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var10 == null) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_39_0 = (String[]) (var8);
                        stackIn_37_0 = stackIn_39_0;
                        if (var11 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        incrementValue$0 = var9;
                        var9++;
                        stackIn_37_0[incrementValue$0] = var10.field_l;
                        var10 = (rqa) ((Object) var7_ref.a(1900));
                        if (var11 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = (String[]) (var8);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw rta.a((Throwable) ((Object) var2_ref), "djb.E(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    djb(ij param0, no param1, eab param2) {
        super(param1, param2);
        int incrementValue$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        rqa var5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_t = new rqa[param0.c(3)];
                        var4_int = 0;
                        var5 = (rqa) ((Object) param0.d(0));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var5) {
                            statePc = 7;
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
                    try {
                        incrementValue$1 = var4_int;
                        var4_int++;
                        this.field_t[incrementValue$1] = var5;
                        var5 = (rqa) ((Object) param0.a((byte) 92));
                        if (var6 != 0) {
                            statePc = 22;
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
                        if (var6 == 0) {
                            statePc = 2;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a((byte) 93, "# <col=ffaaff>FunOrbConsole (loaded " + this.field_t.length + " methods at " + new Date() + ")</col>");
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("djb.<init>(");
                    stackIn_10_1 = stackIn_12_1;
                    if (param0 == null) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_0 = stackIn_16_0;
                    stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
                    stackIn_14_1 = stackIn_16_1;
                    if (param1 == null) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                    stackIn_18_1 = stackIn_20_1;
                    if (param2 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, String param1) {
        try {
            ij var3 = null;
            ojb var3_ref = null;
            RuntimeException var3_ref2 = null;
            ipb var4 = null;
            llb var4_ref = null;
            tsa var5 = null;
            int stackIn_8_0 = 0;
            int stackIn_12_0 = 0;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            gva var3_ref3 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var3 = ck.a(-1, param1);
                      if (param0 == -10278) {
                        break L2;
                      } else {
                        djb.c((byte) 96);
                        break L2;
                      }
                    }
                    var4 = new ipb(var3);
                    var5 = lhb.a((byte) 105, var4);
                    if (!var4.a(100)) {
                      throw new ojb(var4.a((byte) -69).field_g);
                    } else {
                      this.a(var5.a((byte) 114, this.field_t), -110);
                      stackIn_8_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (ojb decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = (ojb) (Object) decompiledCaughtException;
                    param1 = "<col=55ff55>" + param1.substring(0, var3_ref.field_a) + "</col>" + param1.substring(var3_ref.field_a);
                    var4_ref = (llb) ((Object) this.field_h.field_wb.field_lb.b((byte) 122));
                    var4_ref.field_R = this.field_c + param1;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                } catch (gva decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L4: {
                    var3_ref3 = (gva) (Object) decompiledCaughtException;
                    this.a((byte) 89, var3_ref3.field_b);
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("djb.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_8_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(byte param0) {
        try {
            field_s = (ima[][]) null;
            int var1_int = -118 % ((83 - param0) / 35);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "djb.B(" + param0 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2) {
        boolean discarded$0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_144_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.c(13462)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = super.a(param0, param1, param2 + 0);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4 = this.field_p.l(-14453);
                        var5 = this.field_p.j(0);
                        if (param2 == -40) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a(87);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        var9 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var9 ^ -1) <= (var5 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_42_0 = var8;
                        stackIn_10_0 = stackIn_42_0;
                        if (var11 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8 = 0;
                        if (var11 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var10 = var4.charAt(var9);
                        if (var6 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (92 != var10) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_25_0 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var8 = stackIn_25_0;
                        stackIn_31_0 = var6;
                        stackIn_26_0 = stackIn_31_0;
                        if (var7 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_31_0 = stackIn_26_0;
                        stackIn_27_0 = stackIn_31_0;
                        if (var10 != 34) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_29_0 = stackIn_27_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_32_0 = stackIn_29_0;
                        stackIn_32_1 = 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = stackIn_31_0;
                        stackIn_32_1 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = stackIn_32_0 ^ stackIn_32_1;
                        stackIn_38_0 = var7;
                        stackIn_33_0 = stackIn_38_0;
                        if (var6 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_38_0 = stackIn_33_0;
                        stackIn_34_0 = stackIn_38_0;
                        if (var10 != 39) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_36_0 = stackIn_34_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_39_0 = stackIn_36_0;
                        stackIn_39_1 = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = stackIn_38_0;
                        stackIn_39_1 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var7 = stackIn_39_0 ^ stackIn_39_1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = -1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 <= (var5 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = var4.charAt(var5 + -1);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 65535;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = stackIn_46_0;
                        if ((var4.length() ^ -1) < (var5 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_50_0 = 65535;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = var4.charAt(var5);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var10 = stackIn_50_0;
                        if (var6 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var8 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((param1 ^ -1) != -35) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var10 == 34) {
                            statePc = 84;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var7 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var8 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (-40 != (param1 ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if ((var10 ^ -1) == -40) {
                            statePc = 84;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var6 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var7 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (param1 != 41) {
                            statePc = 87;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var10 != 41) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        this.field_p.a((byte) -73, 1 + var5);
                        if (var11 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (param0 != 85) {
                            statePc = 116;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (40 != var9) {
                            statePc = 96;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (41 == var10) {
                            statePc = 114;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var6 == 0) {
                            statePc = 105;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (-35 != (var9 ^ -1)) {
                            statePc = 105;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (34 == var10) {
                            statePc = 114;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (var7 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if ((var9 ^ -1) != -40) {
                            statePc = 116;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var10 != 39) {
                            statePc = 116;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.field_p.a(101, -1, '￿');
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        discarded$0 = super.a(param0, param1, -40);
                        var4 = this.field_p.l(-14453);
                        var5 = this.field_p.j(0);
                        if (var6 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var7 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (-41 != (param1 ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        this.field_p.a(-1, param2 ^ 39, ')');
                        this.field_p.a(var5, 31401, var5);
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var6 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var7 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        if ((param1 ^ -1) != -35) {
                            statePc = 134;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        this.field_p.a(-1, param2 + 39, '"');
                        this.field_p.a(var5, 31401, var5);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var6 != 0) {
                            statePc = 143;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (var7 != 0) {
                            statePc = 143;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if ((param1 ^ -1) != -40) {
                            statePc = 143;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        this.field_p.a(-1, -1, '\'');
                        this.field_p.a(var5, 31401, var5);
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        nv.field_r = bab.a(this.field_p.l(param2 + -14413), 107);
                        stackIn_144_0 = 1;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 144: {
                    return stackIn_144_0 != 0;
                }
                case 145: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    throw rta.a((Throwable) ((Object) var4_ref), "djb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final vga a(String param0, byte param1) {
        vga var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        vga stackIn_13_0 = null;
        vga stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        RuntimeException var3_ref = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var3 = new vga();
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var4 ^ -1) <= (this.field_t.length ^ -1)) {
                    break L3;
                  } else {
                    stackOut_3_0 = this.field_t[var4].field_k.startsWith(param0);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          this.field_t[var4].d((byte) -35);
                          var3.a(this.field_t[var4], param1 + -93);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_11_0 = param1;
                break L2;
              }
              if (stackIn_11_0 == 28) {
                stackIn_15_0 = (vga) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_13_0 = (vga) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("djb.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_15_0;
        }
    }

    static {
    }
}
