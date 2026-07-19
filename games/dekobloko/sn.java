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
        sn discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var6 = null;
        String var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        ck[] var8 = null;
        mm stackIn_17_0 = null;
        String stackIn_17_1 = null;
        mm stackIn_18_0 = null;
        String stackIn_18_1 = null;
        mm stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        mm stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        mm stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        mm stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        mm stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        int stackIn_23_7 = 0;
        mm stackIn_24_0 = null;
        String stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        int stackIn_24_7 = 0;
        mm stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        int stackIn_25_8 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        mm stackOut_16_0 = null;
        String stackOut_16_1 = null;
        mm stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        mm stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        mm stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        mm stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        mm stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        mm stackOut_22_0 = null;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        mm stackOut_24_0 = null;
        String stackOut_24_1 = null;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        int stackOut_24_8 = 0;
        mm stackOut_23_0 = null;
        String stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        int stackOut_23_7 = 0;
        int stackOut_23_8 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              vk.a(param1.field_y, (byte) 50, this.field_a, param1.field_t, param4 + param1.field_D, param2 + param1.field_u);
              if (param0 == -2) {
                break L1;
              } else {
                var8 = (ck[]) null;
                discarded$2 = this.a(-28, (ck[]) null);
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
                  if (param3.field_f != 2) {
                    break L5;
                  } else {
                    var6_int = var6_int + (param1.field_t + -this.field_b.field_K);
                    break L5;
                  }
                }
                L6: {
                  if (param3.field_o == 2) {
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
              var6_ref = param3.b(param1, (byte) -116);
              if (var6_ref == null) {
                break L7;
              } else {
                if (param3.field_z == null) {
                  break L7;
                } else {
                  if (this.field_f < 0) {
                    break L7;
                  } else {
                    L8: {
                      stackOut_16_0 = param3.field_z;
                      stackOut_16_1 = (String) (var6_ref);
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (this.field_i == -2147483648) {
                        stackOut_18_0 = (mm) ((Object) stackIn_18_0);
                        stackOut_18_1 = (String) ((Object) stackIn_18_1);
                        stackOut_18_2 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L8;
                      } else {
                        stackOut_17_0 = (mm) ((Object) stackIn_17_0);
                        stackOut_17_1 = (String) ((Object) stackIn_17_1);
                        stackOut_17_2 = this.field_i;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L8;
                      }
                    }
                    L9: {
                      stackOut_19_0 = (mm) ((Object) stackIn_19_0);
                      stackOut_19_1 = (String) ((Object) stackIn_19_1);
                      stackOut_19_2 = stackIn_19_2 + (param1.field_u + param2) - -param3.field_s;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      if (this.field_j == -2147483648) {
                        stackOut_21_0 = (mm) ((Object) stackIn_21_0);
                        stackOut_21_1 = (String) ((Object) stackIn_21_1);
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        stackIn_22_3 = stackOut_21_3;
                        break L9;
                      } else {
                        stackOut_20_0 = (mm) ((Object) stackIn_20_0);
                        stackOut_20_1 = (String) ((Object) stackIn_20_1);
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = this.field_j;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        stackIn_22_3 = stackOut_20_3;
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_22_0 = (mm) ((Object) stackIn_22_0);
                      stackOut_22_1 = (String) ((Object) stackIn_22_1);
                      stackOut_22_2 = stackIn_22_2;
                      stackOut_22_3 = stackIn_22_3 + (param3.field_m + (param1.field_D + param4));
                      stackOut_22_4 = param1.field_t + -param3.field_s + -param3.field_i;
                      stackOut_22_5 = -param3.field_m + (param1.field_y + -param3.field_y);
                      stackOut_22_6 = this.field_f;
                      stackOut_22_7 = this.field_d;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackIn_24_3 = stackOut_22_3;
                      stackIn_24_4 = stackOut_22_4;
                      stackIn_24_5 = stackOut_22_5;
                      stackIn_24_6 = stackOut_22_6;
                      stackIn_24_7 = stackOut_22_7;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      stackIn_23_4 = stackOut_22_4;
                      stackIn_23_5 = stackOut_22_5;
                      stackIn_23_6 = stackOut_22_6;
                      stackIn_23_7 = stackOut_22_7;
                      if (this.field_c != -2147483648) {
                        stackOut_24_0 = (mm) ((Object) stackIn_24_0);
                        stackOut_24_1 = (String) ((Object) stackIn_24_1);
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = stackIn_24_3;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = stackIn_24_5;
                        stackOut_24_6 = stackIn_24_6;
                        stackOut_24_7 = stackIn_24_7;
                        stackOut_24_8 = this.field_c;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        stackIn_25_4 = stackOut_24_4;
                        stackIn_25_5 = stackOut_24_5;
                        stackIn_25_6 = stackOut_24_6;
                        stackIn_25_7 = stackOut_24_7;
                        stackIn_25_8 = stackOut_24_8;
                        break L10;
                      } else {
                        stackOut_23_0 = (mm) ((Object) stackIn_23_0);
                        stackOut_23_1 = (String) ((Object) stackIn_23_1);
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = 256;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        stackIn_25_4 = stackOut_23_4;
                        stackIn_25_5 = stackOut_23_5;
                        stackIn_25_6 = stackOut_23_6;
                        stackIn_25_7 = stackOut_23_7;
                        stackIn_25_8 = stackOut_23_8;
                        break L10;
                      }
                    }
                    discarded$3 = ((mm) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_25_8, param3.field_f, param3.field_o, param3.field_b);
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
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var6);
            stackOut_27_1 = new StringBuilder().append("sn.L(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ')');
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
            var7_int = we.field_b.field_n;
            we.field_b.a(param0, (byte) 0);
            we.field_b.a(0, param2);
            we.field_b.a(true, param5);
            we.field_b.a(true, param4 ? 1 : 0);
            we.field_b.b(-var7_int + we.field_b.field_n, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "sn.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + 97 + ',' + param4 + ',' + param5 + ')');
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
            int discarded$5 = 0;
            int discarded$6 = 0;
            int discarded$7 = 0;
            Object discarded$8 = null;
            Object discarded$9 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            int stackIn_5_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_57_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_92_0 = 0;
            int stackIn_97_0 = 0;
            int stackIn_105_0 = 0;
            int stackIn_108_0 = 0;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            String stackIn_112_2 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            String stackIn_115_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_84_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_104_0 = 0;
            int stackOut_107_0 = 0;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            String stackOut_111_2 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            String stackOut_114_2 = null;
            RuntimeException stackOut_113_0 = null;
            StringBuilder stackOut_113_1 = null;
            String stackOut_113_2 = null;
            var9 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (qc.field_s == null) {
                    if (mb.a(param5, -74)) {
                      break L1;
                    } else {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ba.field_f != ph.field_xb) {
                    break L2;
                  } else {
                    L3: {
                      if (param5) {
                        var10 = (String) null;
                        wb.field_Nb = sb.a(sh.field_f, param2, false, (String) null, 0);
                        break L3;
                      } else {
                        wb.field_Nb = hm.a(false, param2, param0, 9507);
                        break L3;
                      }
                    }
                    we.field_b.field_n = 0;
                    we.field_b.a(true, 14);
                    we.field_b.a(true, wb.field_Nb.a(18).field_a);
                    wj.c(4792, -1);
                    ph.field_xb = wf.field_p;
                    break L2;
                  }
                }
                L4: {
                  if (ph.field_xb == wf.field_p) {
                    if (pe.b(25973, 1)) {
                      L5: {
                        var6_int = de.field_V.d((byte) -85);
                        if (var6_int != 0) {
                          bh.field_k = var6_int;
                          ph.field_xb = bh.field_l;
                          sm.field_e = -1;
                          break L5;
                        } else {
                          ph.field_xb = kk.field_p;
                          break L5;
                        }
                      }
                      de.field_V.field_n = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (kk.field_p == ph.field_xb) {
                    if (pe.b(25973, 8)) {
                      lc.field_j = de.field_V.f((byte) -108);
                      de.field_V.field_n = 0;
                      jm.a(param5, wb.field_Nb, param4, (byte) 127, param1);
                      ph.field_xb = nn.field_c;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (ph.field_xb == nn.field_c) {
                    if (pe.b(25973, 1)) {
                      L8: {
                        var6_int = de.field_V.d((byte) -46);
                        vh.field_f = null;
                        bh.field_k = var6_int;
                        de.field_V.field_n = 0;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (var6_int != 1) {
                            if (8 == var6_int) {
                              si.a(77);
                              jd.field_Qb = false;
                              stackOut_35_0 = var6_int;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0;
                            } else {
                              sm.field_e = -1;
                              ph.field_xb = bh.field_l;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      sm.field_e = -1;
                      ph.field_xb = of.field_a;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (ph.field_xb != of.field_a) {
                    break L9;
                  } else {
                    if (!fh.a((byte) -62)) {
                      break L9;
                    } else {
                      L10: {
                        sh.field_f = de.field_V.f((byte) -108);
                        jk.field_a = param2;
                        te.field_p = de.field_V.d((byte) -76);
                        d.field_b = de.field_V.d((byte) -113);
                        eh.field_a = de.field_V.e(3);
                        var6_ref = de.field_V.c(-16829);
                        var7 = de.field_V.d((byte) -93);
                        if ((var7 & 1) != 0) {
                          qj.a((byte) 64);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (param5) {
                          break L11;
                        } else {
                          L12: {
                            if (0 == (8 & var7)) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L12;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              break L12;
                            }
                          }
                          L13: {
                            wc.field_n = stackIn_46_0 != 0;
                            if ((4 & var7) == 0) {
                              stackOut_48_0 = 0;
                              stackIn_49_0 = stackOut_48_0;
                              break L13;
                            } else {
                              stackOut_47_0 = 1;
                              stackIn_49_0 = stackOut_47_0;
                              break L13;
                            }
                          }
                          L14: {
                            on.field_d = stackIn_49_0 != 0;
                            if ((var7 & 2) == 0) {
                              stackOut_51_0 = 0;
                              stackIn_52_0 = stackOut_51_0;
                              break L14;
                            } else {
                              stackOut_50_0 = 1;
                              stackIn_52_0 = stackOut_50_0;
                              break L14;
                            }
                          }
                          wl.field_p = stackIn_52_0 != 0;
                          if (!wc.field_n) {
                            break L11;
                          } else {
                            wl.field_p = true;
                            break L11;
                          }
                        }
                      }
                      L15: {
                        if (0 == (16 & var7)) {
                          stackOut_56_0 = 0;
                          stackIn_57_0 = stackOut_56_0;
                          break L15;
                        } else {
                          stackOut_55_0 = 1;
                          stackIn_57_0 = stackOut_55_0;
                          break L15;
                        }
                      }
                      L16: {
                        gf.field_i = stackIn_57_0 != 0;
                        if (ci.field_c) {
                          discarded$5 = de.field_V.d((byte) -25);
                          discarded$6 = de.field_V.d((byte) -71);
                          discarded$7 = de.field_V.i(7553);
                          uj.field_a = de.field_V.e(3);
                          ai.field_N = new byte[uj.field_a];
                          var8 = 0;
                          L17: while (true) {
                            if (~var8 <= ~uj.field_a) {
                              break L16;
                            } else {
                              ai.field_N[var8] = de.field_V.g((byte) -99);
                              var8++;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                      L18: {
                        oa.field_f = de.field_V.c((byte) -38);
                        var11 = (CharSequence) ((Object) oa.field_f);
                        h.field_c = kf.a(var11, (byte) 2);
                        bb.field_e = de.field_V.d((byte) -49);
                        ph.field_xb = wf.field_u;
                        if (wb.field_Nb.a(18) != pb.field_i) {
                          if (wb.field_Nb.a(18) == ui.field_t) {
                            ge.field_g.a(-117, se.h(25144));
                            break L18;
                          } else {
                            break L18;
                          }
                        } else {
                          ah.field_f.a(-69, se.h(25144));
                          break L18;
                        }
                      }
                      L19: {
                        jd.field_Qb = false;
                        if (var6_ref != null) {
                          a.a(var6_ref, false, se.h(25144));
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        L21: {
                          if (eh.field_a > 0) {
                            break L21;
                          } else {
                            if (!on.field_d) {
                              try {
                                L22: {
                                  discarded$8 = nc.a(true, "unzap", se.h(25144));
                                  break L22;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L23: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L23;
                                }
                              }
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        try {
                          L24: {
                            discarded$9 = nc.a("zap", -14541, se.h(25144), new Object[]{cf.a(0, sh.field_f)});
                            break L24;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L25: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L25;
                          }
                        }
                        break L20;
                      }
                      L26: {
                        if (eh.field_a <= 0) {
                          break L26;
                        } else {
                          ce.field_w = true;
                          break L26;
                        }
                      }
                      we.field_b.a(pd.field_h, (byte) 63);
                      var8 = 0;
                      L27: while (true) {
                        if (var8 >= 4) {
                          de.field_V.a(pd.field_h, (byte) 123);
                          stackOut_84_0 = bh.field_k;
                          stackIn_85_0 = stackOut_84_0;
                          return stackIn_85_0;
                        } else {
                          pd.field_h[var8] = pd.field_h[var8] + 50;
                          var8++;
                          continue L27;
                        }
                      }
                    }
                  }
                }
                L28: {
                  if (ph.field_xb == bh.field_l) {
                    if (!fh.a((byte) 122)) {
                      break L28;
                    } else {
                      L29: {
                        si.a(119);
                        if (bh.field_k != 7) {
                          break L29;
                        } else {
                          if (jd.field_Qb) {
                            break L29;
                          } else {
                            jd.field_Qb = true;
                            stackOut_91_0 = -1;
                            stackIn_92_0 = stackOut_91_0;
                            return stackIn_92_0;
                          }
                        }
                      }
                      L30: {
                        if (bh.field_k == 7) {
                          bh.field_k = 3;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      rk.field_Y = de.field_V.c((byte) -38);
                      jd.field_Qb = false;
                      stackOut_96_0 = bh.field_k;
                      stackIn_97_0 = stackOut_96_0;
                      return stackIn_97_0;
                    }
                  } else {
                    break L28;
                  }
                }
                L31: {
                  if (qc.field_s == null) {
                    if (!jd.field_Qb) {
                      var6_int = hc.field_a;
                      hc.field_a = ef.field_P;
                      jd.field_Qb = true;
                      ef.field_P = var6_int;
                      break L31;
                    } else {
                      L32: {
                        if (sl.a(-1) <= 30000L) {
                          rk.field_Y = re.field_u;
                          break L32;
                        } else {
                          rk.field_Y = kh.field_f;
                          break L32;
                        }
                      }
                      jd.field_Qb = false;
                      stackOut_104_0 = 3;
                      stackIn_105_0 = stackOut_104_0;
                      return stackIn_105_0;
                    }
                  } else {
                    break L31;
                  }
                }
                stackOut_107_0 = -1;
                stackIn_108_0 = stackOut_107_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_109_0 = (RuntimeException) (var6);
                stackOut_109_1 = new StringBuilder().append("sn.G(");
                stackIn_111_0 = stackOut_109_0;
                stackIn_111_1 = stackOut_109_1;
                stackIn_110_0 = stackOut_109_0;
                stackIn_110_1 = stackOut_109_1;
                if (param0 == null) {
                  stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
                  stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
                  stackOut_111_2 = "null";
                  stackIn_112_0 = stackOut_111_0;
                  stackIn_112_1 = stackOut_111_1;
                  stackIn_112_2 = stackOut_111_2;
                  break L33;
                } else {
                  stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
                  stackOut_110_2 = "{...}";
                  stackIn_112_0 = stackOut_110_0;
                  stackIn_112_1 = stackOut_110_1;
                  stackIn_112_2 = stackOut_110_2;
                  break L33;
                }
              }
              L34: {
                stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
                stackOut_112_1 = ((StringBuilder) (Object) stackIn_112_1).append(stackIn_112_2).append(',').append(param1).append(',');
                stackIn_114_0 = stackOut_112_0;
                stackIn_114_1 = stackOut_112_1;
                stackIn_113_0 = stackOut_112_0;
                stackIn_113_1 = stackOut_112_1;
                if (param2 == null) {
                  stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
                  stackOut_114_1 = (StringBuilder) ((Object) stackIn_114_1);
                  stackOut_114_2 = "null";
                  stackIn_115_0 = stackOut_114_0;
                  stackIn_115_1 = stackOut_114_1;
                  stackIn_115_2 = stackOut_114_2;
                  break L34;
                } else {
                  stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
                  stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
                  stackOut_113_2 = "{...}";
                  stackIn_115_0 = stackOut_113_0;
                  stackIn_115_1 = stackOut_113_1;
                  stackIn_115_2 = stackOut_113_2;
                  break L34;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_115_0), stackIn_115_2 + ',' + 55 + ',' + param4 + ',' + param5 + ')');
            }
            return stackIn_108_0;
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
        RuntimeException var7 = null;
        ce var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
              if (this.field_i == -2147483648) {
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
              if (this.field_f >= -1) {
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
            stackOut_22_0 = (RuntimeException) (var7);
            stackOut_22_1 = new StringBuilder().append("sn.J(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    final sn a(int param0, ck[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.field_a = param1;
            var3_int = -21 % ((45 - param0) / 52);
            stackOut_0_0 = this;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("sn.B(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
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
        tj.a(false, cl.field_v);
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
        int var1 = 0;
        field_e = null;
    }

    static {
        field_e = new vj();
    }
}
