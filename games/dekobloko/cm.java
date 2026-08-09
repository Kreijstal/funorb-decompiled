/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cm implements Iterator {
    private int field_e;
    private bh field_c;
    private bh field_j;
    private si field_k;
    static int[] field_a;
    static int[] field_h;
    static int[] field_g;
    static int[] field_b;
    static String field_i;
    static String field_d;
    static ie field_f;

    public final Object next() {
        int fieldTemp$0 = 0;
        bh var1 = null;
        int var2 = client.field_A ? 1 : 0;
        if (!(this.field_c == this.field_k.field_h[this.field_e + -1])) {
            var1 = this.field_c;
            this.field_c = var1.field_b;
            this.field_j = var1;
            return var1;
        }
        do {
            if (this.field_k.field_a <= this.field_e) {
                return null;
            }
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            var1 = this.field_k.field_h[fieldTemp$0].field_b;
            if (var1 != this.field_k.field_h[-1 + this.field_e]) {
                this.field_c = var1.field_b;
                this.field_j = var1;
                return var1;
            }
        } while (var2 == 0);
        return null;
    }

    final static void a(byte param0) {
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sb var4_ref_sb = null;
        int var4 = 0;
        int var5_int = 0;
        ff var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        uf var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = de.field_V;
                        if (param0 == 53) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        cm.a(20);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = var9.d((byte) -44);
                        var3 = var9.d((byte) -117);
                        if (var2 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4_ref_sb = (sb) ((Object) ef.field_S.c((byte) -68));
                        if (var4_ref_sb == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        si.a(78);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var5_int = sm.field_e - var9.field_n;
                        var11 = var4_ref_sb.field_q;
                        var10 = var11;
                        var6 = var10;
                        if (var11.length << 1327655874 < var5_int) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = var11.length << -816484830;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 >= var5_int) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6[var7 >> -1175205182] = var6[var7 >> -1175205182] + (var9.d((byte) -108) << (lb.a(3, var7) << 1714134600));
                        var7++;
                        if (var8 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_ref_sb.field_s = true;
                        var4_ref_sb.b((byte) 118);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var2 != 1) {
                            statePc = 33;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = var9.e((byte) -2);
                        var5 = (ff) ((Object) cd.field_c.c((byte) -124));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var5 == null) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_30_0 = var3;
                        stackIn_22_0 = stackIn_30_0;
                        if (var8 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != var5.field_q) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var4 != var5.field_r) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5 = (ff) ((Object) cd.field_c.d(true));
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var5 == null) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 71;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        si.a(stackIn_30_0);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        var5.b((byte) 124);
                        if (var8 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        qb.a((Throwable) null, 16408, "LR1: " + qk.d((byte) 74));
                        si.a(100);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1), "cm.A(" + param0 + ')');
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        int var2 = 4 / ((-61 - param0) / 36);
        this.field_e = 1;
        this.field_j = null;
        this.field_c = this.field_k.field_h[0].field_b;
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2;
        var2 = client.field_A ? 1 : 0;
        if (this.field_c != this.field_k.field_h[-1 + this.field_e]) {
          return true;
        } else {
          L0: while (true) {
            L1: {
              if (this.field_e >= this.field_k.field_a) {
                break L1;
              } else {
                fieldTemp$1 = this.field_e;
                this.field_e = this.field_e + 1;
                if (this.field_k.field_h[fieldTemp$1].field_b == this.field_k.field_h[this.field_e - 1]) {
                  this.field_c = this.field_k.field_h[this.field_e + -1];
                  if (var2 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_c = this.field_k.field_h[-1 + this.field_e].field_b;
                  return true;
                }
              }
            }
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
        field_d = null;
        if (param0 != 1714134600) {
            field_a = (int[]) null;
        }
    }

    public final void remove() {
        if (this.field_j == null) {
            throw new IllegalStateException();
        }
        this.field_j.b((byte) 112);
        this.field_j = null;
    }

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_24_0 = 0;
        boolean stackIn_31_0 = false;
        String stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        boolean stackOut_30_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              stackIn_3_0 = var6_int ^ -1;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (stackIn_3_0 <= -1) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var5 = 2 + var6_int;
                    break L4;
                  }
                  L6: while (true) {
                    L7: {
                      if (var5 >= var3_int) {
                        break L7;
                      } else {
                        stackOut_9_0 = fl.a(param1.charAt(var5), (byte) 23);
                        stackIn_3_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                          continue L2;
                        } else {
                          if (!stackIn_10_0) {
                            break L7;
                          } else {
                            var5++;
                            if (var11 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var7_ref_String = param1.substring(2 + var6_int, var5);
                      if (be.a((byte) 98, (CharSequence) ((Object) var7_ref_String))) {
                        break L8;
                      } else {
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var3_int <= var5) {
                        break L9;
                      } else {
                        if (param1.charAt(var5) != 62) {
                          break L9;
                        } else {
                          var5++;
                          var8 = cb.a((byte) -72, (CharSequence) ((Object) var7_ref_String));
                          var4 = var4 + (var6_int - (var5 - param2[var8].length()));
                          break L9;
                        }
                      }
                    }
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L10: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  if (param0 > 80) {
                    break L10;
                  } else {
                    cm.a((byte) -121);
                    break L10;
                  }
                }
                var7 = 0;
                L11: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  stackIn_24_0 = var8 ^ -1;
                  L12: while (true) {
                    L13: {
                      L14: {
                        L15: {
                          if (stackIn_24_0 <= -1) {
                            break L15;
                          } else {
                            if (var11 != 0) {
                              break L14;
                            } else {
                              if (var11 == 0) {
                                break L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        var5 = var8 - -2;
                        break L14;
                      }
                      L16: while (true) {
                        L17: {
                          if (var3_int <= var5) {
                            break L17;
                          } else {
                            stackOut_30_0 = fl.a(param1.charAt(var5), (byte) 23);
                            stackIn_24_0 = stackOut_30_0 ? 1 : 0;
                            stackIn_31_0 = stackOut_30_0;
                            if (var11 != 0) {
                              continue L12;
                            } else {
                              if (!stackIn_31_0) {
                                break L17;
                              } else {
                                var5++;
                                if (var11 == 0) {
                                  continue L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        L18: {
                          var9 = param1.substring(2 + var8, var5);
                          if (be.a((byte) 98, (CharSequence) ((Object) var9))) {
                            break L18;
                          } else {
                            if (var11 == 0) {
                              continue L11;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if (var5 >= var3_int) {
                            break L19;
                          } else {
                            if (param1.charAt(var5) != 62) {
                              break L19;
                            } else {
                              var5++;
                              var10 = cb.a((byte) 100, (CharSequence) ((Object) var9));
                              discarded$0 = var6.append(param1.substring(var7, var8));
                              var7 = var5;
                              discarded$1 = var6.append(param2[var10]);
                              break L19;
                            }
                          }
                        }
                        if (var11 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                    discarded$2 = var6.append(param1.substring(var7));
                    stackIn_42_0 = var6.toString();
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var3);

            stackIn_45_1 = new StringBuilder().append("cm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L20;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L21;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L21;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_46_0), stackIn_49_2 + ')');
        }
        return stackIn_42_0;
    }

    cm(si param0) {
        this.field_j = null;
        try {
            this.field_k = param0;
            this.b((byte) -117);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        field_a = b.h(-126);
        field_h = b.h(80);
        field_g = b.h(-125);
        field_b = b.h(86);
        for (var0 = 0; (var0 ^ -1) > -16; var0++) {
            var1 = field_a;
            var2 = var0;
            var1[var2 >> -1741755611] = de.b(var1[var2 >> -1741755611], 1 << lb.a(var2, 31));
        }
        for (var0 = 15; 31 > var0; var0++) {
            var1 = field_h;
            var2 = var0;
            var1[var2 >> 342484197] = de.b(var1[var2 >> 342484197], 1 << lb.a(31, var2));
        }
        int[] var3 = field_g;
        var3[0] = de.b(var3[0], 8);
        int[] var4 = field_g;
        var4[0] = de.b(var4[0], 128);
        int[] var5 = field_g;
        var5[0] = de.b(var5[0], 4194304);
        int[] var6 = field_b;
        var6[0] = de.b(var6[0], 1);
        int[] var7 = field_b;
        var7[0] = de.b(var7[0], 2048);
        field_i = "Creating your account";
        field_d = "Connection lost. <%0>";
    }
}
