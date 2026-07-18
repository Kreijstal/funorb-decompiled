/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private cn field_l;
    private bl field_f;
    static String field_h;
    private int field_c;
    static String field_b;
    static gm field_e;
    static c field_k;
    static int field_m;
    static int field_d;
    private int field_g;
    static km field_i;
    static c field_j;
    static long field_a;

    private final void a(int param0, Object param1, int param2, long param3) {
        cm var6 = null;
        el var6_ref = null;
        int var7 = Chess.field_G;
        if (param0 > ((v) this).field_g) {
            throw new IllegalStateException();
        }
        this.a(param3, (byte) 91);
        ((v) this).field_c = ((v) this).field_c - param0;
        try {
            while (((v) this).field_c < 0) {
                var6 = (cm) (Object) ((v) this).field_l.c(-14336);
                this.a(1, var6);
            }
            var6_ref = new el(param1, param0);
            ((v) this).field_f.a((o) (Object) var6_ref, param3, 31313);
            ((v) this).field_l.a((l) (Object) var6_ref, false);
            ((cm) (Object) var6_ref).field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "v.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + -10043 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, cm param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                param1.c(-2193);
                param1.d(param0 + -2);
                ((v) this).field_c = ((v) this).field_c + param1.field_q;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 1) {
              break L0;
            } else {
              var4 = null;
              this.a(-33, (cm) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("v.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    v(int param0) {
        this(param0, param0);
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        el var6 = null;
        cm var7 = null;
        var7 = (cm) (Object) ((v) this).field_f.a(param1, (byte) -127);
        if (var7 != null) {
          var5 = var7.f(param0 + 67);
          if (var5 == null) {
            var7.c(param0 + -2116);
            var7.d(-1);
            ((v) this).field_c = ((v) this).field_c + var7.field_q;
            return null;
          } else {
            if (param0 != -77) {
              return null;
            } else {
              L0: {
                if (var7.g(-113)) {
                  var6 = new el(var5, var7.field_q);
                  ((v) this).field_f.a((o) (Object) var6, var7.field_e, 31313);
                  ((v) this).field_l.a((l) (Object) var6, false);
                  ((cm) (Object) var6).field_l = 0L;
                  var7.c(-2193);
                  var7.d(-1);
                  break L0;
                } else {
                  ((v) this).field_l.a((l) (Object) var7, false);
                  var7.field_l = 0L;
                  break L0;
                }
              }
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_i = null;
        field_e = null;
        field_h = null;
        field_j = null;
        field_k = null;
    }

    private v(int param0, int param1) {
        int var3 = 0;
        ((v) this).field_l = new cn();
        ((v) this).field_g = param0;
        ((v) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((v) this).field_f = new bl(var3);
              return;
            }
          } else {
            ((v) this).field_f = new bl(var3);
            return;
          }
        }
    }

    private final void a(long param0, byte param1) {
        cm var4 = (cm) (Object) ((v) this).field_f.a(param0, (byte) 112);
        this.a(1, var4);
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Chess.field_G;
        try {
          L0: {
            vl.field_A = kn.field_D;
            if (param1 == 255) {
              L1: {
                stackOut_7_0 = 18621;
                stackIn_9_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (cn.field_f >= 13) {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  break L1;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L1;
                }
              }
              kf.field_j = cf.b(stackIn_10_0, stackIn_10_1 != 0);
              var6 = null;
              jc.a((byte) 98, (String[]) null);
              break L0;
            } else {
              if (100 > param1) {
                kf.field_j = sc.a(param2, param1, (byte) 113);
                return;
              } else {
                if (param1 > 105) {
                  kf.field_j = sc.a(param2, param1, (byte) 113);
                  return;
                } else {
                  var4 = param3;
                  jc.a((byte) 111, var4);
                  kf.field_j = a.a(param3, -101);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("v.G(").append(31689).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final void a(long param0, int param1, Object param2) {
        try {
            this.a(param1, param2, -10043, param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "v.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_d = 2;
        field_h = "Email address is unavailable";
    }
}
