/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends qc {
    static String field_H;
    static byte[] field_G;
    private Object field_J;
    static fp field_E;
    static int[] field_F;
    static String field_D;
    static int field_I;

    oq(Object param0, int param1) {
        super(param1);
        try {
            this.field_J = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "oq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        String discarded$0 = null;
        rh.b(-14, 4);
        if (!param0) {
            CharSequence[] var2 = (CharSequence[]) null;
            discarded$0 = oq.a((CharSequence[]) null, 95);
        }
    }

    final static void a(od param0, int param1, int param2, int param3, String param4, int[] param5, cr param6, long param7, String param8) {
        try {
            if (param2 != 4462) {
                oq.a(-92, 42, (byte) 11, 8, -120);
            }
            wq.field_M = param0;
            un.field_Lb = new b(param6, param7, param8, param4, param3, param1, param5);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "oq.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static ch a(int param0, String[] param1) {
        ch var2 = null;
        RuntimeException var2_ref = null;
        ch stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ch stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = new ch(false);
              if (param0 == -11) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            var2.field_b = param1;
            stackOut_2_0 = (ch) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("oq.L(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param0 < param1) {
          ki.a(-110, param0, vl.field_e[param3], param1, param4);
          if (param2 < -40) {
            return;
          } else {
            field_H = (String) null;
            return;
          }
        } else {
          ki.a(-82, param1, vl.field_e[param3], param0, param4);
          if (param2 < -40) {
            return;
          } else {
            field_H = (String) null;
            return;
          }
        }
    }

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 23) {
                break L1;
              } else {
                field_E = (fp) null;
                break L1;
              }
            }
            stackOut_2_0 = lr.a(param0.length, 0, param0, 1039685793);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("oq.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final Object a(byte param0) {
        if (param0 != 121) {
            field_D = (String) null;
            return this.field_J;
        }
        return this.field_J;
    }

    final static void a(byte param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 102) {
                break L1;
              } else {
                field_H = (String) null;
                break L1;
              }
            }
            L2: {
              un.field_Ib = false;
              ed.field_t = false;
              if (null == df.field_l) {
                break L2;
              } else {
                if (df.field_l.field_I) {
                  L3: {
                    if ((param2 ^ -1) == -9) {
                      L4: {
                        param2 = 2;
                        if (tk.field_e) {
                          param1 = lr.field_M;
                          break L4;
                        } else {
                          param1 = rr.field_y;
                          break L4;
                        }
                      }
                      eb.field_d.a((byte) -79, ff.field_u);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    var3_int = 1;
                    if ((param2 ^ -1) != -11) {
                      break L5;
                    } else {
                      pc.a((byte) 83);
                      var3_int = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (var3_int != 0) {
                      L7: {
                        if (!un.field_Ib) {
                          break L7;
                        } else {
                          param1 = Vertigo2.a(new String[]{param1}, ri.field_o, -128);
                          break L7;
                        }
                      }
                      L8: {
                        if (!bf.field_a) {
                          break L8;
                        } else {
                          param1 = am.field_m;
                          break L8;
                        }
                      }
                      df.field_l.a(param2, true, param1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (param2 == 256) {
                    break L2;
                  } else {
                    if (-11 == (param2 ^ -1)) {
                      break L2;
                    } else {
                      if (tk.field_e) {
                        break L2;
                      } else {
                        eb.field_d.i(15);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("oq.F(").append(param0).append(',');
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
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
        }
    }

    final boolean i(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public static void b(boolean param0) {
        field_H = null;
        field_G = null;
        field_D = null;
        field_F = null;
        field_E = null;
        if (param0) {
            field_I = 116;
        }
    }

    static {
        field_D = "Won";
        field_H = "Offer unrated rematch";
        field_F = new int[128];
    }
}
