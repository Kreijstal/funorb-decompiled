/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gq extends uta {
    private ela[] field_v;
    static ica field_w;
    static dn field_u;

    final void e(int param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_36_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        mi[] var4 = null;
        int var5 = 0;
        String var6 = null;
        mi var7 = null;
        vj var7_ref = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ela var12_ref_ela = null;
        int var12 = 0;
        ela var13 = null;
        int var14 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = this.field_o.e((byte) -114);
              var3 = this.field_o.j(-1320);
              var4 = ih.a((byte) 126, var2);
              var5 = qa.a(true, var4, var3);
              var6 = "";
              if ((var5 ^ -1) > -1) {
                break L1;
              } else {
                var7 = var4[var5];
                var8_int = var3 - var7.field_h;
                if (tr.field_f != var7.field_p) {
                  break L1;
                } else {
                  if (0 >= var8_int) {
                    break L1;
                  } else {
                    if ((var7.field_m.length() ^ -1) <= (var8_int ^ -1)) {
                      var6 = var7.field_m.substring(0, var8_int);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var7_ref = this.b(false, var6);
            if ((var7_ref.a((byte) -48) ^ -1) != -1) {
              var8 = new StringBuilder();
              var9 = var6.length();
              var10 = 1;
              var11 = 2147483647;
              var12_ref_ela = (ela) ((Object) var7_ref.b((byte) 38));
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var12_ref_ela == null) {
                        break L5;
                      } else {
                        stackIn_43_0 = var11;

                        stackIn_43_1 = var12_ref_ela.field_l.length();

                        if (var14 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (stackIn_43_0 <= stackIn_43_1) {
                              break L6;
                            } else {
                              var11 = var12_ref_ela.field_l.length();
                              break L6;
                            }
                          }
                          var12_ref_ela = (ela) ((Object) var7_ref.c(param0 + -21275));
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
                          stackIn_43_0 = var9 ^ -1;

                          stackIn_43_1 = var11 ^ -1;

                          if (var14 != 0) {
                            break L4;
                          } else {
                            if (stackIn_43_0 <= stackIn_43_1) {
                              break L8;
                            } else {
                              var12 = ((ela) ((Object) var7_ref.b((byte) 38))).field_l.charAt(var9);
                              var13 = (ela) ((Object) var7_ref.c(param0 ^ 21291));
                              L9: while (true) {
                                L10: {
                                  if (var13 == null) {
                                    break L10;
                                  } else {
                                    stackIn_47_0 = var10;

                                    stackIn_47_1 = var12 ^ -1;

                                    stackIn_47_2 = var13.field_l.charAt(var9) ^ -1;

                                    if (var14 != 0) {
                                      break L3;
                                    } else {
                                      L11: {


                                        if (stackIn_47_1 != stackIn_47_2) {

                                          stackIn_36_1 = 0;
                                          break L11;
                                        } else {

                                          stackIn_36_1 = 1;
                                          break L11;
                                        }
                                      }
                                      var10 = stackIn_47_0 & stackIn_36_1;
                                      var13 = (ela) ((Object) var7_ref.c(28));
                                      if (var14 == 0) {
                                        continue L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                L12: {
                                  if (var10 != 0) {
                                    discarded$0 = var8.append((char) var12);
                                    break L12;
                                  } else {
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
                      stackIn_43_0 = param0;
                      stackIn_43_1 = 21303;
                      break L4;
                    }
                  }
                  L13: {
                    if (stackIn_43_0 == stackIn_43_1) {
                      break L13;
                    } else {
                      field_w = (ica) null;
                      break L13;
                    }
                  }
                  var12 = var3 - -var8.length();
                  stackIn_47_0 = var6.length() - -var8.length() ^ -1;
                  stackIn_47_1 = var11;
                  stackIn_47_2 = -1;
                  break L3;
                }
                L14: {
                  if (stackIn_47_0 != (stackIn_47_1 ^ stackIn_47_2)) {
                    break L14;
                  } else {
                    discarded$1 = var8.append("()");
                    var12++;
                    if (1 != var7_ref.a((byte) -34)) {
                      break L14;
                    } else {
                      if ((((ela) ((Object) var7_ref.b((byte) 38))).field_n.length ^ -1) == -1) {
                        var12++;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                this.field_o.a((byte) 96, var2.substring(0, var3) + var8.toString() + var2.substring(var3));
                this.field_o.c(var12, 1);
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
          throw tba.a((Throwable) ((Object) var2_ref), "gq.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final vj b(boolean param0, String param1) {
        vj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vj stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new vj();
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                field_u = (dn) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if ((var4 ^ -1) <= (this.field_v.length ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (!this.field_v[var4].field_l.startsWith(param1)) {
                      break L4;
                    } else {
                      this.field_v[var4].c(-7975);
                      var3.a(this.field_v[var4], (byte) -78);
                      break L4;
                    }
                  }
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_10_0 = (vj) (var3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("gq.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean a(String param0, byte param1) {
        try {
            vna var3 = null;
            jj var3_ref = null;
            RuntimeException var3_ref2 = null;
            cr var4 = null;
            jea var4_ref = null;
            int var5 = 0;
            mi var6 = null;
            int stackIn_4_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            rv var3_ref3 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = lp.a((byte) 48, param0);
                    var5 = 80 / ((-44 - param1) / 36);
                    var4 = new cr(var3);
                    var6 = ed.a(var4, -31733);
                    if (var4.a((byte) 85)) {
                      this.a((byte) -80, var6.a(-1, this.field_v));
                      stackIn_4_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      throw new jj(var4.c((byte) -127).field_h);
                    }
                  }
                } catch (jj decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref = (jj) (Object) decompiledCaughtException;
                    param0 = "<col=55ff55>" + param0.substring(0, var3_ref.field_a) + "</col>" + param0.substring(var3_ref.field_a);
                    var4_ref = (jea) ((Object) this.field_a.field_tb.field_J.b(3));
                    var4_ref.field_r = this.field_t + param0;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                } catch (rv decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L3: {
                    var3_ref3 = (rv) (Object) decompiledCaughtException;
                    this.a(123, var3_ref3.field_b);
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var3_ref2);

                stackIn_12_1 = new StringBuilder().append("gq.G(");

                if (param0 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L4;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_4_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_u = null;
              if (param0 == 39) {
                break L1;
              } else {
                gq.f(51);
                break L1;
              }
            }
            field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "gq.F(" + param0 + ')');
        }
    }

    gq(vna param0, il param1, fia param2) {
        super(param1, param2);
        int incrementValue$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        ela var5 = null;
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
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_v = new ela[param0.a((byte) -16)];
                        var4_int = 0;
                        var5 = (ela) ((Object) param0.f(-80));
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
                        if (var5 == null) {
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
                        this.field_v[incrementValue$1] = var5;
                        var5 = (ela) ((Object) param0.e(125));
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
                        this.a(-124, "# <col=ffaaff>FunOrbConsole (loaded " + this.field_v.length + " methods at " + new Date() + ")</col>");
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
                    stackIn_12_1 = new StringBuilder().append("gq.<init>(");
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
                    throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String[] a(boolean param0) {
        int incrementValue$0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        String[] stackIn_41_0 = null;
        String[] stackIn_43_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        mi[] var4 = null;
        int var5 = 0;
        String var6 = null;
        mi var7 = null;
        vj var7_ref = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ela var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = this.field_o.e((byte) -115);
                        var3 = this.field_o.j(-1320);
                        var4 = ih.a((byte) 126, var2);
                        var5 = qa.a(true, var4, var3);
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a((String) null, (byte) -83);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_p.field_qb = 0;
                        var6 = "";
                        if ((var5 ^ -1) <= -1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = var4[var5];
                        var8_int = -var7.field_h + var3;
                        if ((var7.field_p ^ -1) != (tr.field_f ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var8_int ^ -1) >= -1) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = var7.field_m.substring(0, Math.min(var7.field_m.length(), var8_int));
                        this.field_p.field_qb = this.field_m.b(var2.substring(0, var7.field_h));
                        if (var11 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = var5;
                        var10_int = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var9 < 0) {
                            statePc = 30;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_31_0 = var4[var9].field_p;
                        stackIn_15_0 = stackIn_31_0;
                        stackIn_31_1 = rs.field_a;
                        stackIn_15_1 = stackIn_31_1;
                        if (var11 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 != stackIn_15_1) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10_int++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var4[var9].field_p ^ -1) == (lna.field_a ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10_int--;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-1 >= (var10_int ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var11 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9--;
                        if (var11 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = 0;
                        stackIn_31_1 = var9;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 >= stackIn_31_1) {
                            statePc = 38;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((tr.field_f ^ -1) == (var4[var9 + -1].field_p ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var6 = var4[var9 - 1].field_m;
                        this.field_p.field_qb = this.field_m.b(var2.substring(0, var4[var9 + -1].field_h));
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7_ref = this.b(param0, var6);
                        var8 = new String[var7_ref.a((byte) -99)];
                        var9 = 0;
                        var10 = (ela) ((Object) var7_ref.b((byte) 38));
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == var10) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_43_0 = (String[]) (var8);
                        stackIn_41_0 = stackIn_43_0;
                        if (var11 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        incrementValue$0 = var9;
                        var9++;
                        stackIn_41_0[incrementValue$0] = var10.field_k;
                        var10 = (ela) ((Object) var7_ref.c(28));
                        if (var11 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = (String[]) (var8);
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
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var2_ref), "gq.E(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean a(byte param0, char param1, int param2) {
        boolean discarded$0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_147_0 = 0;
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
                    var11 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.a(-2)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = super.a((byte) -72, param1, param2);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        var4 = this.field_o.e((byte) -106);
                        var5 = this.field_o.j(-1320);
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        var9 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 <= var9) {
                            statePc = 39;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_40_0 = var8;
                        stackIn_9_0 = stackIn_40_0;
                        if (var11 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = 0;
                        if (var11 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var10 = var4.charAt(var9);
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var7 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var10 != 92) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_23_0 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = stackIn_23_0;
                        stackIn_29_0 = var6;
                        stackIn_24_0 = stackIn_29_0;
                        if (var7 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_29_0 = stackIn_24_0;
                        stackIn_25_0 = stackIn_29_0;
                        if (-35 != (var10 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = stackIn_25_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = stackIn_27_0;
                        stackIn_30_1 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = stackIn_29_0;
                        stackIn_30_1 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var6 = stackIn_30_0 ^ stackIn_30_1;
                        stackIn_36_0 = var7;
                        stackIn_31_0 = stackIn_36_0;
                        if (var6 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_36_0 = stackIn_31_0;
                        stackIn_32_0 = stackIn_36_0;
                        if (var10 != 39) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = stackIn_32_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_37_0 = stackIn_34_0;
                        stackIn_37_1 = 1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = stackIn_36_0;
                        stackIn_37_1 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var7 = stackIn_37_0 ^ stackIn_37_1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9++;
                        if (var11 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = -1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (stackIn_40_0 > (var5 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = 65535;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = var4.charAt(-1 + var5);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9 = stackIn_44_0;
                        if (var4.length() > var5) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_48_0 = 65535;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = var4.charAt(var5);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10 = stackIn_48_0;
                        if (var6 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var8 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (34 != param1) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var10 == 34) {
                            statePc = 82;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var7 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var8 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (39 != param1) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (-40 == (var10 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var6 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var7 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (param1 != 41) {
                            statePc = 85;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var10 != 41) {
                            statePc = 85;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        this.field_o.c(1 + var5, 1);
                        if (var11 == 0) {
                            statePc = 143;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (85 != param2) {
                            statePc = 115;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (40 != var9) {
                            statePc = 94;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var10 == 41) {
                            statePc = 114;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var6 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (34 != var9) {
                            statePc = 103;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (34 == var10) {
                            statePc = 114;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (var7 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var9 != 39) {
                            statePc = 115;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (39 == var10) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.field_o.a(101, -19696, '￿');
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        discarded$0 = super.a((byte) -72, param1, param2);
                        var4 = this.field_o.e((byte) -124);
                        var5 = this.field_o.j(-1320);
                        if (var6 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var7 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (-41 == (param1 ^ -1)) {
                            statePc = 124;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        this.field_o.a(-1, -19696, ')');
                        this.field_o.a(var5, (byte) 84, var5);
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 148;
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
                        statePc = 148;
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
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 148;
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
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        this.field_o.a(-1, -19696, '"');
                        this.field_o.a(var5, (byte) 95, var5);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 148;
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
                        statePc = 148;
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
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (param1 != 39) {
                            statePc = 143;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        this.field_o.a(-1, -19696, '\'');
                        this.field_o.a(var5, (byte) 72, var5);
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
                        if (param0 == -72) {
                            statePc = 146;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        this.field_v = (ela[]) null;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackIn_147_0 = 1;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 147: {
                    return stackIn_147_0 != 0;
                }
                case 148: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var4_ref), "gq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void b(int param0) {
        String var2 = null;
        try {
            var2 = this.field_o.field_Cb.field_r;
            this.field_o.field_Cb.field_r = gsa.field_w;
            super.b(param0);
            this.field_o.field_Cb.field_r = var2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gq.B(" + param0 + ')');
        }
    }

    static {
        field_w = new ica();
        field_u = new dn();
    }
}
