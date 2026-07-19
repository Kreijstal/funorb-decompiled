/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_a;
    static String field_g;
    static String[] field_c;
    static ko field_f;
    private String field_e;
    private boolean field_d;
    static String field_b;

    final static void a(String param0, int param1, String[] param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            wd.field_Lb = td.field_f;
            if (param3 == -16) {
              break L0;
            } else {
              ke.a(-100);
              break L0;
            }
          }
          if ((param1 ^ -1) != -256) {
            if (param1 < 100) {
              sf.field_B = gg.a(param1, true, param0);
              return;
            } else {
              if ((param1 ^ -1) >= -106) {
                sf.field_B = jo.a(param2, 57);
                return;
              } else {
                sf.field_B = gg.a(param1, true, param0);
                return;
              }
            }
          } else {
            L1: {
              if (-14 >= (j.field_b ^ -1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            sf.field_B = ta.a(stackIn_7_0 != 0, param3 + -30898);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("ke.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (nl.field_c != null) {
              try {
                L0: {
                  nl.field_c.a(param0 ^ 100, 0L);
                  nl.field_c.a(24, kn.field_e.field_t, kn.field_e.field_v, -1);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                kn.field_e.field_v = kn.field_e.field_v + 24;
                if (param0 != 100) {
                  field_f = (ko) null;
                  return;
                } else {
                  return;
                }
              }
              L1: {
                kn.field_e.field_v = kn.field_e.field_v + 24;
                if (param0 == 100) {
                  break L1;
                } else {
                  field_f = (ko) null;
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                kn.field_e.field_v = kn.field_e.field_v + 24;
                if (param0 == 100) {
                  break L2;
                } else {
                  field_f = (ko) null;
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

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.field_d;
    }

    final String a(byte param0) {
        int discarded$0 = 0;
        if (param0 != 104) {
            discarded$0 = ke.a(true, 103);
            return this.field_e;
        }
        return this.field_e;
    }

    ke(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              this.field_e = param0;
              if (this.field_e != null) {
                break L1;
              } else {
                this.field_e = "";
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((ke) (this)).field_d = stackIn_6_1 != 0;
            if (this.field_e.length() == 0) {
              this.field_d = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ke.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    ke(String param0) {
        this(param0, false);
    }

    final static int a(boolean param0, int param1) {
        int discarded$1 = 0;
        if (65536L > (long)param1) {
          if (-257L >= ((long)param1 ^ -1L)) {
            if (-4097L >= ((long)param1 ^ -1L)) {
              if (((long)param1 ^ -1L) <= -16385L) {
                return el.field_J[param1 >> -880947736] >> 1136966280;
              } else {
                return el.field_J[param1 >> -1726661722] >> 1488436489;
              }
            } else {
              if ((long)param1 < 1024L) {
                return el.field_J[param1 >> -232545694] >> 576855883;
              } else {
                return el.field_J[param1 >> -1256067548] >> -1680153622;
              }
            }
          } else {
            if (-1 < (param1 ^ -1)) {
              if (param0) {
                discarded$1 = ke.a(true, 12);
                return -1;
              } else {
                return -1;
              }
            } else {
              return el.field_J[param1] >> -1605320020;
            }
          }
        } else {
          if (((long)param1 ^ -1L) > -16777217L) {
            if (((long)param1 ^ -1L) > -1048577L) {
              if (262144L <= (long)param1) {
                return el.field_J[param1 >> -1932811508] >> 825272774;
              } else {
                return el.field_J[param1 >> 707016234] >> 626711047;
              }
            } else {
              if (((long)param1 ^ -1L) > -4194305L) {
                return el.field_J[param1 >> 1973752046] >> -1136525115;
              } else {
                return el.field_J[param1 >> -133237296] >> 1825670404;
              }
            }
          } else {
            if (-268435457L >= ((long)param1 ^ -1L)) {
              if (-1073741825L >= ((long)param1 ^ -1L)) {
                return el.field_J[param1 >> -13597672];
              } else {
                return el.field_J[param1 >> -2138656234] >> -1112828767;
              }
            } else {
              if (67108864L > (long)param1) {
                return el.field_J[param1 >> -1358160622] >> -1821847069;
              } else {
                return el.field_J[param1 >> 1431659476] >> -974398494;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        if (param0) {
            return;
        }
        field_a = null;
        field_c = null;
        field_g = null;
    }

    static {
        field_a = "Press <img=3> for the options menu. Hover your mouse over <col=ccccff>blue text</col> for an explanation.";
        field_b = "<%0> might change the options - wait and see.";
        field_c = new String[]{"On", "Off"};
        field_f = new ko();
    }
}
