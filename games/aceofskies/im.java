/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends za {
    static int field_f;
    jaclib.memory.heap.NativeHeap field_g;
    static boolean field_e;

    final void a(int param0) {
        if (param0 >= -116) {
            return;
        }
        this.field_g.a();
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 33) {
                break L1;
              } else {
                field_e = false;
                break L1;
              }
            }
            stackIn_3_0 = q.field_q.a("", (byte) -71, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("im.D(").append(param0).append(',');

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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    im(int param0) {
        this.field_g = new jaclib.memory.heap.NativeHeap(param0);
    }

    final static boolean a(boolean param0) {
        if (param0) {
          if (bl.field_c >= 20) {
            if (jr.a((byte) 32)) {
              if (-1 > (un.field_c ^ -1)) {
                if (ur.b(-111)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          im.a(false);
          if (bl.field_c >= 20) {
            if (jr.a((byte) 32)) {
              if (-1 > (un.field_c ^ -1)) {
                if (ur.b(-111)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        field_f = 9;
    }
}
