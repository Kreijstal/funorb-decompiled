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
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = Pool.field_O;
        wd.field_Lb = td.field_f;
        if (param3 == -16) {
          if (param1 != -256) {
            if (param1 >= 100) {
              if ((param1 ^ -1) < -106) {
                sf.field_B = gg.a(param1, true, param0);
                return;
              } else {
                sf.field_B = jo.a(param2, 57);
                return;
              }
            } else {
              sf.field_B = gg.a(param1, true, param0);
              return;
            }
          } else {
            L0: {
              if (-14 <= j.field_b) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            sf.field_B = ta.a(stackIn_16_0 != 0, param3 + -30898);
            return;
          }
        } else {
          ke.a(-100);
          if (param1 != -256) {
            if (param1 >= 100) {
              if ((param1 ^ -1) < -106) {
                sf.field_B = gg.a(param1, true, param0);
                return;
              } else {
                sf.field_B = jo.a(param2, 57);
                return;
              }
            } else {
              sf.field_B = gg.a(param1, true, param0);
              return;
            }
          } else {
            L1: {
              if (-14 <= j.field_b) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            sf.field_B = ta.a(stackIn_5_0 != 0, param3 + -30898);
            return;
          }
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (nl.field_c != null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        kn.field_e.field_v = kn.field_e.field_v + 24;
                        if (param0 == 100) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        field_f = null;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            nl.field_c.a(param0 ^ 100, 0L);
                            nl.field_c.a(24, kn.field_e.field_t, kn.field_e.field_v, -1);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        kn.field_e.field_v = kn.field_e.field_v + 24;
                        if (param0 == 100) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_f = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        var1 = (Exception) (Object) caughtException;
                        kn.field_e.field_v = kn.field_e.field_v + 24;
                        if (param0 != 100) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        field_f = null;
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

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return ((ke) this).field_d;
    }

    final String a(byte param0) {
        if (param0 != 104) {
            int discarded$0 = ke.a(true, 103);
            return ((ke) this).field_e;
        }
        return ((ke) this).field_e;
    }

    ke(String param0, boolean param1) {
        ((ke) this).field_e = param0;
        if (((ke) this).field_e == null) {
            ((ke) this).field_e = "";
        }
        ((ke) this).field_d = param1 ? true : false;
        if (((ke) this).field_e.length() == 0) {
            ((ke) this).field_d = false;
        }
    }

    ke(String param0) {
        this(param0, false);
    }

    final static int a(boolean param0, int param1) {
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
                int discarded$1 = ke.a(true, 12);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Press <img=3> for the options menu. Hover your mouse over <col=ccccff>blue text</col> for an explanation.";
        field_b = "<%0> might change the options - wait and see.";
        field_c = new String[]{"On", "Off"};
        field_f = new ko();
    }
}
