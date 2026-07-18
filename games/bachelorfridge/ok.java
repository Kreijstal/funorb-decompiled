/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends sna {
    sna field_wb;
    static String field_Cb;
    static int field_vb;
    static byte[][] field_zb;
    sna field_yb;
    static int field_Bb;
    sga field_xb;
    sna field_Ab;

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (io.a(true, param1)) {
              if (param0 == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                var3_int = param0.length();
                if (12 > var3_int) {
                  if (mp.a(true, param1)) {
                    if (var3_int != 0) {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("ok.DA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + -19 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final static sna f(byte param0) {
        return p.field_n.field_vb;
    }

    ok(long param0, ok param1, String param2, String param3) {
        this(param0, (sna) (Object) param1, param1.field_xb.field_wb, param1.field_xb.field_xb, param1.field_Ab, param2, param3);
    }

    ok(long param0, sna param1, sna param2, cw param3, sna param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((ok) this).field_wb = new sna(0L, (sna) null);
            ((ok) this).field_xb = new sga(0L, ((ok) this).field_wb, param2, param3);
            ((ok) this).field_Ab = new sna(0L, param4);
            ((ok) this).field_yb = new sna(0L, param4);
            ((ok) this).field_Ab.field_Z = param5;
            ((ok) this).field_yb.field_Z = param6;
            ((ok) this).a(-1, (sna) (Object) ((ok) this).field_xb);
            ((ok) this).a(-1, ((ok) this).field_Ab);
            ((ok) this).a(-1, ((ok) this).field_yb);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ok.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int c(int param0, int param1) {
        be var2 = mg.a((byte) -126, param0);
        if (!(var2 != null)) {
            return 0;
        }
        return vla.a(-64, var2);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = (param3 + ((ok) this).field_sb) / 2;
        var6 = ((ok) this).field_p + -param2;
        ((ok) this).field_xb.a((byte) -58, -param3 + var6, 0, 0, ((ok) this).field_sb, param1, param3);
        ((ok) this).field_Ab.field_p = param2;
        ((ok) this).field_Ab.field_sb = var5 + -param3;
        ((ok) this).field_Ab.field_rb = var6;
        ((ok) this).field_Ab.field_kb = 0;
        ((ok) this).field_yb.field_kb = var5;
        ((ok) this).field_yb.field_p = param2;
        ((ok) this).field_yb.field_rb = var6;
        if (param0 >= -111) {
          ok.a(-29, false, 23, -1, 94, -81, 85, -77, -85, -41);
          ((ok) this).field_yb.field_sb = -var5 + ((ok) this).field_sb;
          return;
        } else {
          ((ok) this).field_yb.field_sb = -var5 + ((ok) this).field_sb;
          return;
        }
    }

    public static void f(int param0) {
        field_Cb = null;
        field_zb = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (eo.field_l <= param4) {
          if (pw.field_x >= param4) {
            if (param5 >= eo.field_l) {
              if (param5 <= pw.field_x) {
                if (param6 >= eo.field_l) {
                  if (pw.field_x >= param6) {
                    if (param8 >= eo.field_l) {
                      if (pw.field_x >= param8) {
                        if (an.field_q <= param0) {
                          if (param0 <= ha.field_n) {
                            if (an.field_q <= param3) {
                              if (ha.field_n >= param3) {
                                if (param7 >= an.field_q) {
                                  if (param7 <= ha.field_n) {
                                    if (an.field_q <= param2) {
                                      if (ha.field_n >= param2) {
                                        oda.a(param2, param5, param7, param0, 123, param4, param6, param3, param9, param8);
                                        return;
                                      } else {
                                        vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                                        return;
                                      }
                                    } else {
                                      vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                                      return;
                                    }
                                  } else {
                                    vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                                    return;
                                  }
                                } else {
                                  vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                                  return;
                                }
                              } else {
                                vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                                return;
                              }
                            } else {
                              vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                              return;
                            }
                          } else {
                            vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                            return;
                          }
                        } else {
                          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                          return;
                        }
                      } else {
                        vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                        return;
                      }
                    } else {
                      vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                      return;
                    }
                  } else {
                    vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                    return;
                  }
                } else {
                  vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                  return;
                }
              } else {
                vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
                return;
              }
            } else {
              vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
              return;
            }
          } else {
            vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
            return;
          }
        } else {
          vba.a(param4, param5, param6, param0, param9, param7, param8, -128, param2, param3);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ok) this).field_rb = param1;
        ((ok) this).field_sb = param0;
        ((ok) this).field_kb = param4;
        ((ok) this).field_p = param5;
        ((ok) this).a((byte) -126, param7, param6, param3);
        if (param2 <= 78) {
            field_Bb = 33;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = new byte[50][];
        field_Cb = "Connection lost. <%0>";
    }
}
