/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static String field_e;
    static String field_d;
    static String field_f;
    static String field_i;
    static mh field_a;
    static jp field_h;
    static String field_b;
    static mh field_g;
    static jp field_c;

    final static void a(int param0) {
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (oh.field_b == sm.field_b) {
          int fieldTemp$2 = jq.field_p;
          jq.field_p = jq.field_p + 1;
          if (fieldTemp$2 < 16) {
            if (param0 >= 20) {
              return;
            } else {
              field_c = null;
              return;
            }
          } else {
            if (ln.field_k) {
              vb.k(0);
              sm.field_b = ii.field_q;
              if (param0 >= 20) {
                return;
              } else {
                field_c = null;
                return;
              }
            } else {
              ok.a(0);
              sm.field_b = ii.field_q;
              if (param0 >= 20) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          }
        } else {
          if (sm.field_b == ii.field_q) {
            if (og.h(-26090)) {
              sm.field_b = vl.field_d;
              if (param0 < 20) {
                field_c = null;
                return;
              } else {
                return;
              }
            } else {
              if (fj.field_Ub == null) {
                ae.b((byte) 117);
                if (wi.field_g) {
                  wi.field_g = false;
                  cp.a(false, 21543);
                  sm.field_b = vl.field_d;
                  if (param0 < 20) {
                    field_c = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  sm.field_b = vl.field_d;
                  if (param0 < 20) {
                    field_c = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                bd.a(3, (byte) 25, fj.field_Ub);
                ae.b((byte) 117);
                if (wi.field_g) {
                  wi.field_g = false;
                  cp.a(false, 21543);
                  sm.field_b = vl.field_d;
                  if (param0 < 20) {
                    field_c = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  sm.field_b = vl.field_d;
                  if (param0 >= 20) {
                    return;
                  } else {
                    field_c = null;
                    return;
                  }
                }
              }
            }
          } else {
            if (vl.field_d == sm.field_b) {
              int fieldTemp$3 = jq.field_p;
              jq.field_p = jq.field_p - 1;
              if (fieldTemp$3 <= 0) {
                sm.field_b = sm.field_a;
                if (param0 < 20) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 < 20) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 < 20) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param0 < 0) {
          if (param0 < -65536) {
            return -2048 + si.field_d[134217728 / -param0];
          } else {
            return -si.field_d[-param0 >> 5];
          }
        } else {
          if (param0 <= 65536) {
            return si.field_d[param0 >> 5];
          } else {
            return -si.field_d[134217728 / param0] + 2048;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (gp.a(-4858)) {
            param1 = false;
        }
        ga.a(param1, -124);
        wh.a(21862);
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_b = null;
        field_i = null;
        field_d = null;
    }

    final static boolean a(char param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!m.a(true, param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != null) {
                var3_int = param1.length();
                if (12 > var3_int) {
                  field_e = null;
                  if (ik.a((byte) -9, param0)) {
                    if (0 != var3_int) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("nk.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L1;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + false + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                  param1.getAppletContext().showDocument(hg.a(param1, var2, -1), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("nk.D(").append(2048).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
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
            var2_int = -66 / ((-63 - param1) / 43);
            stackOut_0_0 = jf.field_c.a(124, "", param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("nk.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Suggest muting this player";
        field_f = "Sweet!";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "Status";
        field_i = "Macroing or use of bots";
    }
}
