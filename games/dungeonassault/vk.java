/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_e;
    String[] field_c;
    int field_d;
    boolean field_a;
    String field_g;
    static String field_h;
    static String field_b;
    boolean field_f;

    final static b a(Throwable param0, String param1) {
        b var2 = null;
        if (!(param0 instanceof b)) {
            var2 = new b(param0, param1);
        } else {
            var2 = (b) ((Object) param0);
            var2.field_c = var2.field_c + ' ' + param1;
        }
        return var2;
    }

    final static boolean a(int param0) {
        if (param0 == 22084) {
          if (-11 >= (kh.field_n ^ -1)) {
            if (-14 < (dk.field_c ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = (String) null;
          if (-11 >= (kh.field_n ^ -1)) {
            if (-14 < (dk.field_c ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static vk a(byte param0, String param1) {
        RuntimeException var2 = null;
        vk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vk stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_4_0 = null;
        vk stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 == -126) {
              if (wd.field_d != ql.field_f) {
                L1: {
                  if (wd.field_d != dh.field_b) {
                    break L1;
                  } else {
                    if (!param1.equals(bf.field_o)) {
                      break L1;
                    } else {
                      wd.field_d = sp.field_e;
                      stackOut_8_0 = ll.field_p;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                wd.field_d = ql.field_f;
                bf.field_o = param1;
                ll.field_p = null;
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (vk) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("vk.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (vk) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return (vk) ((Object) stackIn_11_0);
            }
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != -31) {
            return;
        }
        d.field_f = false;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 75) {
            return;
        }
        field_h = null;
    }

    vk(boolean param0) {
        this.field_a = param0 ? true : false;
    }

    static {
        field_h = "Type your age in years";
        field_b = "This female demon sports a manic smile and a sadistic look in her wide, wild eyes. She uses her sharp claws to rend flesh and takes pleasure in death.";
    }
}
