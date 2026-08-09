/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class si extends ca {
    boolean field_p;
    static jb[] field_u;
    static int field_s;
    static String field_q;
    static hh field_t;
    volatile boolean field_v;
    boolean field_r;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        kc var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 < param0) {
                  break L2;
                } else {
                  var4 = param1;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var8 = new byte[param3];
              var4 = var8;
              var5_int = 0;
              L3: while (true) {
                if (var5_int >= param3) {
                  break L1;
                } else {
                  var8[var5_int] = param1[var5_int + param0];
                  var5_int++;
                  if (var7 == 0) {
                    continue L3;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L4: {
              var5 = new kc();
              var5.a((byte) 119);
              if (param2 <= -42) {
                break L4;
              } else {
                si.e((byte) -111);
                break L4;
              }
            }
            var5.a((long)(param3 * 8), var4, -24893);
            var6 = new byte[64];
            var5.a(0, false, var6);
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("si.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static void e(byte param0) {
        if (param0 < 5) {
          field_t = (hh) null;
          kb.field_b.field_p = 0;
          kb.field_b.field_j = 0;
          return;
        } else {
          kb.field_b.field_p = 0;
          kb.field_b.field_j = 0;
          return;
        }
    }

    abstract int c(byte param0);

    abstract byte[] d(byte param0);

    final static int a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 111) {
                break L1;
              } else {
                field_t = (hh) null;
                break L1;
              }
            }
            stackIn_3_0 = ti.a(10, param1, 113, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("si.S(").append(param0).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(boolean param0) {
        if (param0) {
          field_q = (String) null;
          field_q = null;
          field_t = null;
          field_u = null;
          return;
        } else {
          field_q = null;
          field_t = null;
          field_u = null;
          return;
        }
    }

    si() {
        this.field_v = true;
    }

    static {
        field_q = null;
    }
}
