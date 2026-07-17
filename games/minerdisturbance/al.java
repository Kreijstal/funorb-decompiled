/*
 * Decompiled by CFR-JS 0.4.0.
 */
class al extends pi {
    static ih field_r;
    al field_q;
    long field_p;
    static String field_o;
    static volatile int field_n;
    al field_t;
    static wh field_s;

    final void a(byte param0) {
        if (param0 <= -90) {
          if (null == ((al) this).field_q) {
            return;
          } else {
            ((al) this).field_q.field_t = ((al) this).field_t;
            ((al) this).field_t.field_q = ((al) this).field_q;
            ((al) this).field_q = null;
            ((al) this).field_t = null;
            return;
          }
        } else {
          field_s = null;
          if (null == ((al) this).field_q) {
            return;
          } else {
            ((al) this).field_q.field_t = ((al) this).field_t;
            ((al) this).field_t.field_q = ((al) this).field_q;
            ((al) this).field_q = null;
            ((al) this).field_t = null;
            return;
          }
        }
    }

    final static jf a(int param0, String param1) {
        RuntimeException var2 = null;
        jf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jf stackOut_2_0 = null;
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
              if (param0 == -10218) {
                break L1;
              } else {
                al.e(-101);
                break L1;
              }
            }
            stackOut_2_0 = new jf(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("al.HA(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_o = null;
    }

    final static void e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param0 > 72) {
                break L1;
              } else {
                var3 = null;
                jf discarded$2 = al.a(-123, (String) null);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 25) {
                break L0;
              } else {
                L3: {
                  if (dn.field_t[var1_int] != null) {
                    if (dn.field_t[var1_int].k()) {
                      dn.field_t[var1_int] = null;
                      break L3;
                    } else {
                      kf.a(dn.field_t[var1_int], (byte) -113);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (gl.field_u[var1_int] != null) {
                    if (gl.field_u[var1_int].k()) {
                      gl.field_u[var1_int] = null;
                      var1_int++;
                      break L4;
                    } else {
                      kf.a(gl.field_u[var1_int], (byte) -54);
                      var1_int++;
                      break L4;
                    }
                  } else {
                    var1_int++;
                    break L4;
                  }
                }
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "al.GA(" + param0 + 41);
        }
    }

    protected al() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
