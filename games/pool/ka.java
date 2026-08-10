/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends ig {
    static int[] field_o;
    static int field_r;
    static String field_u;
    static String field_t;
    static byte[] field_s;
    static String field_n;
    static boolean field_p;
    static int field_q;
    static String field_m;

    final na a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        na stackIn_2_0 = null;
        na stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (ka.a(10, var4)) {
              L1: {
                var5 = (CharSequence) ((Object) param0);
                var3_int = kq.a((byte) 114, var5);
                if (param1) {
                  break L1;
                } else {
                  field_s = (byte[]) null;
                  break L1;
                }
              }
              L2: {
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -131) {
                    break L2;
                  } else {
                    return kr.field_e;
                  }
                }
              }
              stackIn_9_0 = gp.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = gp.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ka.K(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void b(boolean param0) {
        field_n = null;
        field_m = null;
        field_t = null;
        field_o = null;
        field_s = null;
        field_u = null;
        if (!param0) {
            field_m = (String) null;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                ka.a(false, 105);
                break L1;
              }
            }
            stackIn_3_0 = na.a(10, true, param1, 87);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ka.N(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1) {
        kf var2 = null;
        try {
            ec.field_b = param1;
            if (!param0) {
                field_q = -113;
            }
            var2 = (kf) ((Object) oj.field_o.c((byte) -36));
            while (var2 != null) {
                if (var2.field_m.b(-108)) {
                    var2.field_o.d(ec.field_b * var2.field_n + 128 >> 1000803112);
                } else {
                    var2.a((byte) -117);
                }
                var2 = (kf) ((Object) oj.field_o.f((byte) -5));
            }
            if (null != mp.field_R) {
                var2 = (kf) ((Object) mp.field_R.c((byte) 113));
                while (var2 != null) {
                    if (!var2.field_m.b(-113)) {
                        var2.a((byte) -117);
                    } else {
                        var2.field_o.d(128 + var2.field_n * ec.field_b >> -1219814008);
                    }
                    var2 = (kf) ((Object) mp.field_R.f((byte) -5));
                }
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ka.M(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        if (param0 <= -71) {
          if (fm.field_H) {
            qh.g(qh.field_b, qh.field_c, qh.field_j + -qh.field_b, qh.field_g + -qh.field_c);
            e.field_a.a((byte) -79, false);
            return;
          } else {
            return;
          }
        } else {
          field_r = 25;
          if (!fm.field_H) {
            return;
          } else {
            qh.g(qh.field_b, qh.field_c, qh.field_j + -qh.field_b, qh.field_g + -qh.field_c);
            e.field_a.a((byte) -79, false);
            return;
          }
        }
    }

    final static void h(int param0) {
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
        int[] var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          L0: {
            var4 = wa.field_ib;
            var1 = var4;
            var2 = param0;
            var3 = var4.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var4[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var4[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var4[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var4[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var4[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var4[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var4[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var4[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "ka.O(" + param0 + ')');
        }
    }

    ka(sl param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, -21);
                break L1;
              }
            }
            if (this.a(param0, true) == gp.field_d) {
              stackIn_5_0 = sg.field_L;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ka.L(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_o = new int[4];
        field_t = "This option cannot be combined with the current '<%0>' setting.";
        field_n = "Unable to add friend - system busy";
        field_u = "<%0>, which group do you want to play as?";
        field_m = "This password is part of your Player Name, and would be easy to guess";
        field_p = false;
    }
}
