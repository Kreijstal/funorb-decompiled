/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends rqa {
    static volatile int field_q;
    static String field_o;
    static String field_p;

    final static void a(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        llb var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -19689) {
                break L1;
              } else {
                var5 = (llb) null;
                am.a((byte[]) null, (llb) null, -17, -59, (llb) null, false, 76, 14, -115, (llb) null);
                break L1;
              }
            }
            var6 = bs.field_b;
            var1 = var6;
            var2 = 0;
            var3 = var6.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var6[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "am.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -107) {
                break L1;
              } else {
                field_q = -69;
                break L1;
              }
            }
            L2: {
              if (!li.field_i) {
                sa.a(param4, param1, param2, param3 & 16777215, param3 >>> 1259093784);
                break L2;
              } else {
                if (!ne.field_v) {
                  break L2;
                } else {
                  rj.a(og.field_r, param4, param1, param2, param3);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("am.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(byte[] param0, llb param1, int param2, int param3, llb param4, boolean param5, int param6, int param7, int param8, llb param9) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          L0: {
            wqa.field_a = -1L;
            vu.field_zb = param0;
            sea.field_o = param6;
            ocb.field_l = param0.length;
            lqa.field_o = null;
            ii.field_h = false;
            ohb.field_o = null;
            ce.field_o = new byte[(7 + sea.field_o) / 8];
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (var11 >= vu.field_zb.length) {
                L2: {
                  var10_int = (var10_int + 7) / 8;
                  nkb.field_p = new byte[var10_int];
                  if (param9.field_lb == null) {
                    param9.field_lb = new ij();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  cta.field_q = param9.field_lb;
                  cta.field_q.e(109);
                  oha.field_o = new pr(param3);
                  cla.field_b = -1;
                  qea.field_p = 0;
                  paa.field_q = 0;
                  tg.field_q = -1;
                  if (null == param4.field_lb) {
                    param4.field_lb = new ij();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  kja.field_E = param4.field_lb;
                  kja.field_E.e(118);
                  ks.field_r = new pr(param8);
                  if (null == param1.field_lb) {
                    param1.field_lb = new ij();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  mea.field_e = param1.field_lb;
                  mea.field_e.e(93);
                  icb.field_p = new pr(param2);
                  ktb.field_p = param7;
                  if (param5) {
                    break L5;
                  } else {
                    field_p = (String) null;
                    break L5;
                  }
                }
                qga.field_a = 0L;
                break L0;
              } else {
                var10_int = var10_int + (vu.field_zb[var11] & 255);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var10);

            stackIn_19_1 = new StringBuilder().append("am.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_29_2 + ')');
        }
    }

    am(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -1) {
            field_p = (String) null;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                am.e(28);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(136, 77));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("am.A(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_o = "Your ignore list is full. Max of 100 hit.";
        field_p = "Loading fonts";
        field_q = 0;
    }
}
