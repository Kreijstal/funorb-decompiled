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
        if (param0 > this.field_g) {
            throw new IllegalStateException();
        }
        this.a(param3, (byte) 91);
        this.field_c = this.field_c - param0;
        if (param2 != -10043) {
            return;
        }
        try {
            while (this.field_c < 0) {
                var6 = (cm) ((Object) this.field_l.c(-14336));
                this.a(1, var6);
            }
            var6_ref = new el(param1, param0);
            this.field_f.a(var6_ref, param3, 31313);
            this.field_l.a(var6_ref, false);
            ((cm) ((Object) var6_ref)).field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "v.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, cm param1) {
        RuntimeException var3 = null;
        cm var4 = null;
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
                this.field_c = this.field_c + param1.field_q;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 1) {
              break L0;
            } else {
              var4 = (cm) null;
              this.a(-33, (cm) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("v.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    v(int param0) {
        this(param0, param0);
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        el var6 = null;
        cm var7 = null;
        var7 = (cm) ((Object) this.field_f.a(param1, (byte) -127));
        if (var7 != null) {
          var5 = var7.f(param0 + 67);
          if (var5 == null) {
            var7.c(param0 + -2116);
            var7.d(-1);
            this.field_c = this.field_c + var7.field_q;
            return null;
          } else {
            if (param0 != -77) {
              return (Object) null;
            } else {
              L0: {
                if (var7.g(-113)) {
                  var6 = new el(var5, var7.field_q);
                  this.field_f.a(var6, var7.field_e, 31313);
                  this.field_l.a(var6, false);
                  ((cm) ((Object) var6)).field_l = 0L;
                  var7.c(-2193);
                  var7.d(-1);
                  break L0;
                } else {
                  this.field_l.a(var7, false);
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
        if (param0 >= -87) {
            return;
        }
        field_k = null;
    }

    private v(int param0, int param1) {
        int var3 = 0;
        this.field_l = new cn();
        this.field_g = param0;
        this.field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              this.field_f = new bl(var3);
              return;
            }
          } else {
            this.field_f = new bl(var3);
            return;
          }
        }
    }

    private final void a(long param0, byte param1) {
        Object var4 = null;
        cm var5 = null;
        cm var6 = null;
        var4 = null;
        if (param1 <= 55) {
          var5 = (cm) null;
          this.a(-68, (cm) null);
          var6 = (cm) ((Object) this.field_f.a(param0, (byte) 112));
          this.a(1, var6);
          return;
        } else {
          var6 = (cm) ((Object) this.field_f.a(param0, (byte) 112));
          this.a(1, var6);
          return;
        }
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Chess.field_G;
        try {
          L0: {
            L1: {
              vl.field_A = kn.field_D;
              if (param0 == 31689) {
                break L1;
              } else {
                field_e = (gm) null;
                break L1;
              }
            }
            if (-256 == (param1 ^ -1)) {
              L2: {
                stackOut_9_0 = param0 ^ 13172;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (-14 >= (cn.field_f ^ -1)) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L2;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L2;
                }
              }
              kf.field_j = cf.b(stackIn_12_0, stackIn_12_1 != 0);
              var6 = (String[]) null;
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
                  var7 = param3;
                  jc.a((byte) 111, var7);
                  kf.field_j = a.a(param3, -101);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("v.G(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final void a(long param0, int param1, Object param2) {
        try {
            this.a(param1, param2, -10043, param0);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "v.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 0;
        field_d = 2;
        field_h = "Email address is unavailable";
    }
}
