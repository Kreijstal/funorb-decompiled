/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends lk {
    private ea field_m;
    private String field_l;
    static li field_n;
    static String field_o;
    private boolean field_k;

    final static void a(int param0, long param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 11) {
              break L0;
            } else {
              ef.a(true);
              break L0;
            }
          }
          Thread.sleep(param1);
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (InterruptedException) (Object) decompiledCaughtException;
    }

    final cg a(byte param0, String param1) {
        bk var3 = null;
        cg stackIn_11_0 = null;
        cg stackIn_15_0 = null;
        cg stackOut_14_0 = null;
        cg stackOut_13_0 = null;
        cg stackOut_10_0 = null;
        cg stackOut_9_0 = null;
        if (((ef) this).field_m.a((byte) 86, param1) != qj.field_c) {
          L0: {
            if (!param1.equals((Object) (Object) ((ef) this).field_l)) {
              var3 = hi.a(param1, true);
              if (var3.a(true)) {
                ((ef) this).field_l = param1;
                ((ef) this).field_k = var3.b(17);
                break L0;
              } else {
                return vk.field_d;
              }
            } else {
              break L0;
            }
          }
          if (param0 < 10) {
            L1: {
              ((ef) this).field_m = null;
              if (((ef) this).field_k) {
                stackOut_14_0 = lg.field_c;
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = qj.field_c;
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          } else {
            L2: {
              if (((ef) this).field_k) {
                stackOut_10_0 = lg.field_c;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                stackOut_9_0 = qj.field_c;
                stackIn_11_0 = stackOut_9_0;
                break L2;
              }
            }
            return stackIn_11_0;
          }
        } else {
          return qj.field_c;
        }
    }

    final static void a(int param0, byte param1) {
        cj.field_a = 400 * param0 / 150;
        cj.field_c = 100 * param0 / 150;
        cj.field_d = (param0 << -1026238896) / 150;
        if (param1 != 63) {
            field_n = null;
        }
    }

    ef(ae param0, ae param1) {
        super(param0);
        ((ef) this).field_l = "";
        ((ef) this).field_k = false;
        ((ef) this).field_m = new ea(param0, param1);
    }

    final String b(byte param0, String param1) {
        if (!(((ef) this).field_m.a((byte) 22, param1) != qj.field_c)) {
            return ((ef) this).field_m.b((byte) -58, param1);
        }
        int var3 = -107 % ((20 - param0) / 40);
        if (!(((ef) this).a((byte) 99, param1) != qj.field_c)) {
            return wa.field_b;
        }
        return oe.field_b;
    }

    public static void a(boolean param0) {
        field_n = null;
        if (param0) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = " seconds";
        field_n = new li(11, 0, 1, 2);
    }
}
