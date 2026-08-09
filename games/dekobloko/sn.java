/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    private int field_i;
    private int field_f;
    private int field_d;
    private boolean field_h;
    ck[] field_a;
    static vj field_e;
    ck field_b;
    private int field_c;
    static boolean field_g;
    static cn field_k;
    private int field_j;

    final sn c(int param0, int param1) {
        if (param0 != -1) {
            this.field_c = 9;
        }
        this.field_i = param1;
        return (sn) (this);
    }

    final void a(sn param0, int param1) {
        try {
            param0.field_b = this.field_b;
            if (param1 != 1) {
                sn var4 = (sn) null;
                this.a((sn) null, -53);
            }
            param0.field_a = this.field_a;
            param0.field_i = this.field_i;
            param0.field_c = this.field_c;
            param0.field_f = this.field_f;
            param0.field_j = this.field_j;
            param0.field_d = this.field_d;
            param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "sn.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, ce param1, int param2, bc param3, int param4) {
        mm stackIn_18_0 = null;
        String stackIn_18_1 = null;
        mm stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        ck[] var8 = null;
        try {
          L0: {
            L1: {
              vk.a(param1.field_y, (byte) 50, this.field_a, param1.field_t, param4 + param1.field_D, param2 + param1.field_u);
              if (param0 == -2) {
                break L1;
              } else {
                var8 = (ck[]) null;
                this.a(-28, (ck[]) null);
                break L1;
              }
            }
            L2: {
              if (null == this.field_b) {
                break L2;
              } else {
                L3: {
                  var6_int = this.field_i + param1.field_u + param2;
                  var7 = param4 + (param1.field_D + this.field_j);
                  if (param3.field_f != 1) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-this.field_b.field_K + param1.field_t) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (1 != param3.field_o) {
                    break L4;
                  } else {
                    var7 = var7 + (-this.field_b.field_C + param1.field_y) / 2;
                    break L4;
                  }
                }
                L5: {
                  if ((param3.field_f ^ -1) != -3) {
                    break L5;
                  } else {
                    var6_int = var6_int + (param1.field_t + -this.field_b.field_K);
                    break L5;
                  }
                }
                L6: {
                  if (-3 == (param3.field_o ^ -1)) {
                    var7 = var7 + (-this.field_b.field_C + param1.field_y);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_b.c(var6_int, var7);
                break L2;
              }
            }
            L7: {
              var6 = param3.b(param1, (byte) -116);
              if (var6 == null) {
                break L7;
              } else {
                if (param3.field_z == null) {
                  break L7;
                } else {
                  if ((this.field_f ^ -1) > -1) {
                    break L7;
                  } else {
                    L8: {
                      stackIn_18_0 = param3.field_z;

                      stackIn_18_1 = (String) (var6);

                      if (2147483647 == (this.field_i ^ -1)) {
                        stackIn_19_0 = (mm) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = 0;
                        break L8;
                      } else {
                        stackIn_19_0 = (mm) ((Object) stackIn_18_0);
                        stackIn_19_1 = (String) ((Object) stackIn_18_1);
                        stackIn_19_2 = this.field_i;
                        break L8;
                      }
                    }
                    L9: {




                      stackIn_21_2 = stackIn_19_2 + (param1.field_u + param2) - -param3.field_s;

                      if (this.field_j == -2147483648) {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = 0;
                        break L9;
                      } else {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = this.field_j;
                        break L9;
                      }
                    }
                    L10: {






                      stackIn_24_3 = stackIn_22_3 + (param3.field_m + (param1.field_D + param4));

                      stackIn_24_4 = param1.field_t + -param3.field_s + -param3.field_i;

                      stackIn_24_5 = -param3.field_m + (param1.field_y + -param3.field_y);

                      stackIn_24_6 = this.field_f;

                      stackIn_24_7 = this.field_d;

                      if (this.field_c != -2147483648) {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = this.field_c;
                        break L10;
                      } else {
                        stackIn_19_0 = (mm) ((Object) stackIn_19_0);
                        stackIn_19_1 = (String) ((Object) stackIn_19_1);

                        stackIn_25_3 = stackIn_24_3;
                        stackIn_25_4 = stackIn_24_4;
                        stackIn_25_5 = stackIn_24_5;
                        stackIn_25_6 = stackIn_24_6;
                        stackIn_25_7 = stackIn_24_7;
                        stackIn_25_8 = 256;
                        break L10;
                      }
                    }
                    ((mm) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param3.field_f, param3.field_o, param3.field_b);
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var6_ref);

            stackIn_29_1 = new StringBuilder().append("sn.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param4 + ')');
        }
    }

    final sn a(int param0, int param1) {
        this.field_j = param0;
        if (param1 != -2147483648) {
            field_e = (vj) null;
        }
        return (sn) (this);
    }

    final static void a(long param0, int param1, String param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        try {
            we.field_b.f(param1, -4);
            we.field_b.field_n = we.field_b.field_n + 1;
            if (param3 <= 34) {
                field_e = (vj) null;
            }
            var7_int = we.field_b.field_n;
            we.field_b.a(param0, (byte) 0);
            we.field_b.a(0, param2);
            we.field_b.a(true, param5);
            we.field_b.a(true, param4 ? 1 : 0);
            we.field_b.b(-var7_int + we.field_b.field_n, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "sn.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void c(byte param0) {
        ta.field_k.field_j = 0;
        ta.field_k.field_o = 0;
        int var1 = -59 % ((-49 - param0) / 38);
    }

    final sn b(int param0, int param1) {
        this.field_d = param1;
        if (param0 >= -76) {
            return (sn) null;
        }
        return (sn) (this);
    }

    final void b(byte param0) {
        this.field_f = 0;
        this.field_c = 256;
        this.field_b = null;
        if (param0 <= 66) {
            return;
        }
        this.field_d = -1;
        this.field_i = 0;
        this.field_a = null;
        this.field_j = 0;
    }

    final static int a(String param0, boolean param1, String param2, byte param3, int param4, boolean param5) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_55_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_98_0 = 0;
            int stackIn_105_0 = 0;
            int stackIn_110_0 = 0;
            int stackIn_119_0 = 0;
            int stackIn_122_0 = 0;
            RuntimeException stackIn_124_0 = null;
            StringBuilder stackIn_124_1 = null;
            RuntimeException stackIn_125_0 = null;
            StringBuilder stackIn_125_1 = null;
            RuntimeException stackIn_126_0 = null;
            StringBuilder stackIn_126_1 = null;
            String stackIn_126_2 = null;
            RuntimeException stackIn_127_0 = null;
            StringBuilder stackIn_127_1 = null;
            RuntimeException stackIn_128_0 = null;
            StringBuilder stackIn_128_1 = null;
            RuntimeException stackIn_129_0 = null;
            StringBuilder stackIn_129_1 = null;
            String stackIn_129_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (qc.field_s == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (mb.a(param5, param3 + -129)) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackIn_5_0 = -1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0;
                    }
                    case 6: {
                        try {
                            if (ba.field_f != ph.field_xb) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (param5) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            wb.field_Nb = hm.a(false, param2, param0, 9507);
                            if (var9 == 0) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var10 = (String) null;
                            wb.field_Nb = sb.a(sh.field_f, param2, false, (String) null, 0);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            we.field_b.field_n = 0;
                            we.field_b.a(true, 14);
                            we.field_b.a(true, wb.field_Nb.a(param3 ^ 37).field_a);
                            wj.c(4792, -1);
                            ph.field_xb = wf.field_p;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (ph.field_xb == wf.field_p) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (pe.b(25973, 1)) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var6_int = de.field_V.d((byte) -85);
                            if (var6_int != 0) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ph.field_xb = kk.field_p;
                            if (var9 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            bh.field_k = var6_int;
                            ph.field_xb = bh.field_l;
                            sm.field_e = -1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            de.field_V.field_n = 0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (param3 == 55) {
                                statePc = 24;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackIn_23_0 = -94;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0;
                    }
                    case 24: {
                        try {
                            if (kk.field_p == ph.field_xb) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (pe.b(25973, 8)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            lc.field_j = de.field_V.f((byte) -108);
                            de.field_V.field_n = 0;
                            jm.a(param5, wb.field_Nb, param4, (byte) 127, param1);
                            ph.field_xb = nn.field_c;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (ph.field_xb == nn.field_c) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (pe.b(25973, 1)) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var6_int = de.field_V.d((byte) -46);
                            vh.field_f = null;
                            bh.field_k = var6_int;
                            de.field_V.field_n = 0;
                            if (var6_int == 0) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-2 != (var6_int ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            sm.field_e = -1;
                            ph.field_xb = of.field_a;
                            if (var9 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (8 == var6_int) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            sm.field_e = -1;
                            ph.field_xb = bh.field_l;
                            if (var9 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            si.a(param3 + 22);
                            jd.field_Qb = false;
                            stackIn_42_0 = var6_int;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        return stackIn_42_0;
                    }
                    case 43: {
                        try {
                            if (ph.field_xb != of.field_a) {
                                statePc = 99;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (!fh.a((byte) -62)) {
                                statePc = 99;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            sh.field_f = de.field_V.f((byte) -108);
                            jk.field_a = param2;
                            te.field_p = de.field_V.d((byte) -76);
                            d.field_b = de.field_V.d((byte) -113);
                            eh.field_a = de.field_V.e(3);
                            var6 = de.field_V.c(-16829);
                            var7 = de.field_V.d((byte) -93);
                            if (-1 != (var7 & 1 ^ -1)) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            qj.a((byte) 64);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (param5) {
                                statePc = 60;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (0 == (8 & var7)) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            stackIn_52_0 = 1;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackIn_52_0 = 0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            wc.field_n = stackIn_52_0 != 0;
                            if ((4 & var7) == 0) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            stackIn_55_0 = 1;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            stackIn_55_0 = 0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            on.field_d = stackIn_55_0 != 0;
                            if ((var7 & 2) == 0) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            stackIn_58_0 = 1;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackIn_58_0 = 0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            wl.field_p = stackIn_58_0 != 0;
                            if (!wc.field_n) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            wl.field_p = true;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (0 == (16 & var7)) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackIn_63_0 = 1;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackIn_63_0 = 0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            gf.field_i = stackIn_63_0 != 0;
                            if (ci.field_c) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            de.field_V.d((byte) -25);
                            de.field_V.d((byte) -71);
                            de.field_V.i(param3 ^ 7606);
                            uj.field_a = de.field_V.e(3);
                            ai.field_N = new byte[uj.field_a];
                            var8 = 0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var8 >= uj.field_a) {
                                statePc = 70;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            ai.field_N[var8] = de.field_V.g((byte) -99);
                            var8++;
                            if (var9 != 0) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var9 == 0) {
                                statePc = 66;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            oa.field_f = de.field_V.c((byte) -38);
                            var11 = (CharSequence) ((Object) oa.field_f);
                            h.field_c = kf.a(var11, (byte) 2);
                            bb.field_e = de.field_V.d((byte) -49);
                            ph.field_xb = wf.field_u;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (wb.field_Nb.a(18) != pb.field_i) {
                                statePc = 74;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            ah.field_f.a(-69, se.h(param3 ^ 25103));
                            if (var9 == 0) {
                                statePc = 77;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (wb.field_Nb.a(18) == ui.field_t) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            ge.field_g.a(-117, se.h(25144));
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            jd.field_Qb = false;
                            if (var6 != null) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            a.a(var6, false, se.h(25144));
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (eh.field_a > 0) {
                                statePc = 83;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (!on.field_d) {
                                statePc = 86;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            nc.a("zap", -14541, se.h(25144), new Object[]{cf.a(0, sh.field_f)});
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 85;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var8_ref_Throwable = caughtException;
                            if (var9 == 0) {
                                statePc = 89;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            nc.a(true, "unzap", se.h(25144));
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 88;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (-1 <= (eh.field_a ^ -1)) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            ce.field_w = true;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            we.field_b.a(pd.field_h, (byte) 63);
                            var8 = 0;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (-5 >= (var8 ^ -1)) {
                                statePc = 96;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            pd.field_h[var8] = pd.field_h[var8] + 50;
                            var8++;
                            if (var9 != 0) {
                                statePc = 97;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (var9 == 0) {
                                statePc = 92;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            de.field_V.a(pd.field_h, (byte) 123);
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            stackIn_98_0 = bh.field_k;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        return stackIn_98_0;
                    }
                    case 99: {
                        try {
                            if (ph.field_xb == bh.field_l) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (!fh.a((byte) 122)) {
                                statePc = 111;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            si.a(119);
                            if ((bh.field_k ^ -1) != -8) {
                                statePc = 106;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (jd.field_Qb) {
                                statePc = 106;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            jd.field_Qb = true;
                            stackIn_105_0 = -1;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        return stackIn_105_0;
                    }
                    case 106: {
                        try {
                            if ((bh.field_k ^ -1) == -8) {
                                statePc = 108;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            bh.field_k = 3;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            rk.field_Y = de.field_V.c((byte) -38);
                            jd.field_Qb = false;
                            stackIn_110_0 = bh.field_k;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        return stackIn_110_0;
                    }
                    case 111: {
                        try {
                            if (qc.field_s == null) {
                                statePc = 113;
                            } else {
                                statePc = 112;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            if (!jd.field_Qb) {
                                statePc = 120;
                            } else {
                                statePc = 114;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            if (sl.a(-1) <= 30000L) {
                                statePc = 117;
                            } else {
                                statePc = 115;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            rk.field_Y = kh.field_f;
                            if (var9 == 0) {
                                statePc = 118;
                            } else {
                                statePc = 116;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            rk.field_Y = re.field_u;
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            jd.field_Qb = false;
                            stackIn_119_0 = 3;
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        return stackIn_119_0;
                    }
                    case 120: {
                        try {
                            var6_int = hc.field_a;
                            hc.field_a = ef.field_P;
                            jd.field_Qb = true;
                            ef.field_P = var6_int;
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            stackIn_122_0 = -1;
                            statePc = 122;
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = 123;
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        return stackIn_122_0;
                    }
                    case 123: {
                        var6_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_125_0 = (RuntimeException) (var6_ref);
                        stackIn_124_0 = stackIn_125_0;
                        stackIn_125_1 = new StringBuilder().append("sn.G(");
                        stackIn_124_1 = stackIn_125_1;
                        if (param0 == null) {
                            statePc = 125;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    }
                    case 124: {
                        stackIn_126_0 = (RuntimeException) ((Object) stackIn_124_0);
                        stackIn_126_1 = (StringBuilder) ((Object) stackIn_124_1);
                        stackIn_126_2 = "{...}";
                        statePc = 126;
                        continue stateLoop;
                    }
                    case 125: {
                        stackIn_126_0 = (RuntimeException) ((Object) stackIn_125_0);
                        stackIn_126_1 = (StringBuilder) ((Object) stackIn_125_1);
                        stackIn_126_2 = "null";
                        statePc = 126;
                        continue stateLoop;
                    }
                    case 126: {
                        stackIn_128_0 = (RuntimeException) ((Object) stackIn_126_0);
                        stackIn_127_0 = stackIn_128_0;
                        stackIn_128_1 = ((StringBuilder) (Object) stackIn_126_1).append(stackIn_126_2).append(',').append(param1).append(',');
                        stackIn_127_1 = stackIn_128_1;
                        if (param2 == null) {
                            statePc = 128;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    }
                    case 127: {
                        stackIn_129_0 = (RuntimeException) ((Object) stackIn_127_0);
                        stackIn_129_1 = (StringBuilder) ((Object) stackIn_127_1);
                        stackIn_129_2 = "{...}";
                        statePc = 129;
                        continue stateLoop;
                    }
                    case 128: {
                        stackIn_129_0 = (RuntimeException) ((Object) stackIn_128_0);
                        stackIn_129_1 = (StringBuilder) ((Object) stackIn_128_1);
                        stackIn_129_2 = "null";
                        statePc = 129;
                        continue stateLoop;
                    }
                    case 129: {
                        throw dh.a((Throwable) ((Object) stackIn_129_0), stackIn_129_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final sn a(int param0, byte param1) {
        this.field_f = param0;
        if (param1 != 106) {
            return (sn) null;
        }
        return (sn) (this);
    }

    final void a(sn param0, bc param1, int param2, int param3, int param4, ce param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ce var8 = null;
        try {
          L0: {
            L1: {
              if (this.field_h) {
                param0.a(-2, param5, param4, param1, param3);
                param0.b((byte) 76);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2147483648 == this.field_j) {
                break L2;
              } else {
                param0.field_j = this.field_j;
                break L2;
              }
            }
            L3: {
              if (2147483647 == (this.field_i ^ -1)) {
                break L3;
              } else {
                param0.field_i = this.field_i;
                break L3;
              }
            }
            L4: {
              if (param2 > 121) {
                break L4;
              } else {
                var8 = (ce) null;
                this.a((sn) null, (bc) null, 121, -77, -29, (ce) null);
                break L4;
              }
            }
            L5: {
              if (this.field_c == -2147483648) {
                break L5;
              } else {
                param0.field_c = this.field_c;
                break L5;
              }
            }
            L6: {
              if (0 >= (this.field_f ^ -1)) {
                param0.field_f = this.field_f;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-1 > this.field_d) {
                break L7;
              } else {
                param0.field_d = this.field_d;
                break L7;
              }
            }
            L8: {
              if (this.field_b != null) {
                param0.field_b = this.field_b;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (null == this.field_a) {
                break L9;
              } else {
                param0.field_a = this.field_a;
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("sn.J(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
    }

    final sn a(int param0, ck[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a = param1;
            var3_int = -21 % ((45 - param0) / 52);
            stackIn_1_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("sn.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return (sn) (this);
    }

    final static void a(boolean param0) {
        if (!(cl.field_v != null)) {
            return;
        }
        tj.a(param0, cl.field_v);
        cl.field_v.a(lf.field_e, 115);
        cl.field_v = null;
        if (!(null == li.field_b)) {
            li.field_b.b((byte) -110);
        }
        jh.field_b.requestFocus();
    }

    sn() {
        this.field_i = -2147483648;
        this.field_d = -2;
        this.field_a = null;
        this.field_h = false;
        this.field_c = -2147483648;
        this.field_b = null;
        this.field_f = -2;
        this.field_j = -2147483648;
    }

    final sn a(int param0, boolean param1) {
        if (param0 != -16598) {
            this.field_h = true;
        }
        this.field_h = param1 ? true : false;
        return (sn) (this);
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = -72 % ((param0 - 30) / 37);
        field_e = null;
    }

    static {
        field_e = new vj();
    }
}
