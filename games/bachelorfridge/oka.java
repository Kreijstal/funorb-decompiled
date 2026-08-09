/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oka extends gha {
    static String field_t;

    public static void b(byte param0) {
        field_t = null;
        if (param0 < 105) {
            field_t = (String) null;
        }
    }

    oka(po param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_u, -1, 2147483647, false);
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        wj var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4) {
                oka.a(param1.field_s + param0, param1.field_p, param1.field_v + param3, false, param1.field_q);
                break L1;
              } else {
                break L1;
              }
            }
            super.a(param0, param1, param2 + 0, param3, param4);
            if (param2 == 32679) {
              break L0;
            } else {
              var7 = (wj) null;
              this.a(-73, (wj) null, 81, 95, false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("oka.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              dg.e(param0, param2, param1 - -1, 10000536);
              dg.e(param0, param2 - -param4, param1 - -1, 12105912);
              var5_int = 1;
              var6 = param4;
              if (dg.field_j <= param2 - -var5_int) {
                break L1;
              } else {
                var5_int = dg.field_j - param2;
                break L1;
              }
            }
            if (!param3) {
              L2: {
                if (var6 + param2 <= dg.field_k) {
                  break L2;
                } else {
                  var6 = -param2 + dg.field_k;
                  break L2;
                }
              }
              var7 = var5_int;
              L3: while (true) {
                if (var6 <= var7) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 48 * var7 / param4 + 152;
                  var9 = var8 | (var8 << 1736065960 | var8 << -1227475056);
                  dg.field_e[(var7 + param2) * dg.field_i + param0] = var9;
                  dg.field_e[param1 + ((var7 + param2) * dg.field_i + param0)] = var9;
                  var7++;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var5), "oka.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    oka(int param0) {
        this(jca.field_a, param0);
    }

    final static String a(lu param0, int param1, byte param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        lu var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -65) {
                break L1;
              } else {
                var6 = (lu) null;
                oka.a((lu) null, -126, (byte) 4);
                break L1;
              }
            }
            try {
              L2: {
                L3: {
                  var3_int = param0.h(16711935);
                  if (var3_int <= param1) {
                    break L3;
                  } else {
                    var3_int = param1;
                    break L3;
                  }
                }
                var4 = new byte[var3_int];
                param0.field_g = param0.field_g + jka.field_l.a(var3_int, param0.field_h, 0, var4, (byte) -69, param0.field_g);
                var5 = gt.a(0, var4, (byte) 104, var3_int);
                stackIn_5_0 = (String) (var5);
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_7_0 = "Cabbage";
              return stackIn_7_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("oka.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    static {
        field_t = "Send private message";
    }
}
