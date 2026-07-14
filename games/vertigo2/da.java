/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da extends de implements ih {
    static int[] field_k;
    private kp field_h;
    static int field_j;
    static int field_i;

    public final boolean c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -12211) {
          if (((da) this).field_h.field_w != null) {
            if (((da) this).field_h.field_w.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_j = -18;
          if (((da) this).field_h.field_w == null) {
            return true;
          } else {
            L0: {
              if (((da) this).field_h.field_w.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 >= -97) {
            da.b((byte) -31);
            field_k = null;
            return;
        }
        field_k = null;
    }

    abstract String b(int param0, String param1);

    final ba a(byte param0) {
        if (param0 <= 24) {
          field_i = 123;
          return ((da) this).a(-1, ((da) this).field_h.field_w);
        } else {
          return ((da) this).a(-1, ((da) this).field_h.field_w);
        }
    }

    da(kp param0) {
        ((da) this).field_h = param0;
    }

    public final void a(byte param0, kp param1) {
        if (param0 < 16) {
            Object var4 = null;
            String discarded$0 = ((da) this).b(-114, (String) null);
        }
    }

    final String f(int param0) {
        if (param0 >= -68) {
          String discarded$2 = ((da) this).f(-53);
          return ((da) this).b(3614, ((da) this).field_h.field_w);
        } else {
          return ((da) this).b(3614, ((da) this).field_h.field_w);
        }
    }

    public final void a(int param0, kp param1) {
        if (param0 >= -10) {
            Object var4 = null;
            ((da) this).a((byte) -106, (kp) null);
            ((da) this).b(18340);
            return;
        }
        ((da) this).b(18340);
    }

    abstract ba a(int param0, String param1);

    static {
    }
}
