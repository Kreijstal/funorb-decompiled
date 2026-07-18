/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tl extends wm {
    private boolean field_p;
    static ck[] field_u;
    static String field_x;
    static String field_s;
    static ck[] field_w;
    static int[] field_q;
    static String field_r;
    private String field_t;
    private re field_v;

    final static boolean b(int param0, int param1, int param2) {
        if (13 != wh.field_c) {
          if (wh.field_c != 102) {
            if (null != mg.field_bc) {
              if (!mg.field_bc.b(13, 15028, 15)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            mg.field_bc.e(0);
            return true;
          }
        } else {
          qn.l(13);
          return true;
        }
    }

    final tb b(String param0, byte param1) {
        ta var3 = null;
        RuntimeException var3_ref = null;
        tb stackIn_2_0 = null;
        tb stackIn_7_0 = null;
        tb stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        tb stackOut_6_0 = null;
        tb stackOut_11_0 = null;
        tb stackOut_10_0 = null;
        tb stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((tl) this).field_v.b(param0, param1) != vm.field_u) {
              L1: {
                if (param0.equals((Object) (Object) ((tl) this).field_t)) {
                  break L1;
                } else {
                  var3 = ik.a(103, param0);
                  if (!var3.a(103)) {
                    stackOut_6_0 = jb.field_j;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    ((tl) this).field_t = param0;
                    ((tl) this).field_p = var3.b(-3348);
                    break L1;
                  }
                }
              }
              L2: {
                if (((tl) this).field_p) {
                  stackOut_11_0 = dc.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = vm.field_u;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = vm.field_u;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("tl.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    public static void g(byte param0) {
        field_w = null;
        field_r = null;
        field_s = null;
        field_x = null;
        field_q = null;
        field_u = null;
    }

    tl(rk param0, rk param1) {
        super(param0);
        ((tl) this).field_t = "";
        ((tl) this).field_p = false;
        try {
            ((tl) this).field_v = new re(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -11) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            if (((tl) this).field_v.b(param0, (byte) -40) == vm.field_u) {
              stackOut_4_0 = ((tl) this).field_v.a(param0, (byte) -11);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (((tl) this).b(param0, (byte) -40) == vm.field_u) {
                stackOut_8_0 = dd.field_m;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return li.field_a;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("tl.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "This option cannot be combined with the current settings for:  ";
        field_q = new int[5];
        field_s = "Ignore";
        field_r = "You can spectate this game";
    }
}
