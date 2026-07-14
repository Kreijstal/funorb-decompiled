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
        ((im) this).field_g.a();
    }

    final static byte[] a(int param0, String param1) {
        if (param0 < 33) {
            field_e = false;
            return q.field_q.a("", (byte) -71, param1);
        }
        return q.field_q.a("", (byte) -71, param1);
    }

    im(int param0) {
        ((im) this).field_g = new jaclib.memory.heap.NativeHeap(param0);
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
          boolean discarded$5 = im.a(false);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 9;
    }
}
