/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static ci field_f;
    static wg field_b;
    static String field_a;
    static int[] field_d;
    int field_c;
    int field_e;

    final static int a(int param0, boolean param1, int param2) {
        if (!param1) {
          if ((param2 ^ -1) > -3) {
            if (5 <= param0) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          hg.a(-93, false, -114);
          if ((param2 ^ -1) > -3) {
            if (5 <= param0) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(int param0, int param1, ci param2, int param3, ci param4, int param5, boolean param6, int param7, ci param8, byte[] param9) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = Chess.field_G;
        try {
          L0: {
            qh.field_g = param0;
            wk.field_e = param9;
            gb.field_t = -1L;
            qa.field_e = param9.length;
            g.field_f = new byte[(qh.field_g + 7) / 8];
            ud.field_b = false;
            pd.field_Rb = null;
            ib.field_d = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (wk.field_e.length <= var11) {
                L2: {
                  var10_int = (var10_int + 7) / 8;
                  fe.field_d = new byte[var10_int];
                  if (null != param2.field_I) {
                    break L2;
                  } else {
                    param2.field_I = new jc();
                    break L2;
                  }
                }
                if (param6) {
                  L3: {
                    bb.field_d = param2.field_I;
                    bb.field_d.e(-31023);
                    d.field_Mb = new dk(param5);
                    fm.field_W = -1;
                    jf.field_b = -1;
                    cn.field_g = 0;
                    cb.field_f = 0;
                    if (param8.field_I == null) {
                      param8.field_I = new jc();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    nk.field_t = param8.field_I;
                    nk.field_t.e(-31023);
                    ae.field_f = new dk(param1);
                    if (param4.field_I != null) {
                      break L4;
                    } else {
                      param4.field_I = new jc();
                      break L4;
                    }
                  }
                  pd.field_Sb = param4.field_I;
                  pd.field_Sb.e(-31023);
                  cm.field_v = new dk(param3);
                  eg.field_e = 0L;
                  ig.field_g = param7;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var10_int = var10_int + (wk.field_e[var11] & 255);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var10);

            stackIn_17_1 = new StringBuilder().append("hg.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param9 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static double a(byte param0, double param1, double param2) {
        if (param0 != 26) {
          field_a = (String) null;
          return Math.sqrt(param1 * param1 + param2 * param2);
        } else {
          return Math.sqrt(param1 * param1 + param2 * param2);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 > -9) {
            field_a = (String) null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    hg(int param0, int param1, int param2, int param3) {
        this.field_e = param0;
        this.field_c = param3;
    }

    static {
        field_a = "OK";
    }
}
