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
        rh.b(-14, 4);
        if (!param0) {
            CharSequence[] var2 = (CharSequence[]) null;
            oq.a((CharSequence[]) null, 95);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (ch) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("oq.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = lr.a(param0.length, 0, param0, 1039685793);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("oq.I(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        try {
            if (param0 != 102) {
                field_H = (String) null;
            }
            un.field_Ib = false;
            ed.field_t = false;
            if (null != df.field_l) {
                if (!df.field_l.field_I) {
                    return;
                }
                if ((param2 ^ -1) != -9) {
                } else {
                    param2 = 2;
                    if (!tk.field_e) {
                        param1 = rr.field_y;
                    } else {
                        param1 = lr.field_M;
                    }
                    eb.field_d.a((byte) -79, ff.field_u);
                }
                var3_int = 1;
                if ((param2 ^ -1) == -11) {
                    pc.a((byte) 83);
                    var3_int = 0;
                }
                if (!(var3_int == 0)) {
                    if (un.field_Ib) {
                        param1 = Vertigo2.a(new String[]{param1}, ri.field_o, -128);
                    }
                    if (bf.field_a) {
                        param1 = am.field_m;
                    }
                    df.field_l.a(param2, true, param1);
                }
                if (param2 != 256 && -11 != (param2 ^ -1) && !tk.field_e) {
                    eb.field_d.i(15);
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "oq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
