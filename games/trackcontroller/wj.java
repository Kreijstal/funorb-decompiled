/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wj {
    static sk field_b;
    static qj[] field_a;

    abstract void b(int param0);

    abstract int a(int param0, long param1);

    final static void a(int param0, uf param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        try {
            kb.field_d = param1;
            gi.field_r = param3;
            fj.field_T = param8;
            sa.field_T = param6;
            kf.field_a = param5;
            int var9_int = 1;
            fc.field_g = param4;
            vk.field_j = param2;
            ga.field_e = param0;
            rj.field_d = (ae) (Object) new da();
            rb.field_a = new sd(param1);
            ij.field_d = new wg(rj.field_d, rb.field_a);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "wj.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + 101 + 44 + param8 + 41);
        }
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        if (param0 < 105) {
          L0: {
            field_a = null;
            var4 = ((wj) this).a(-27042);
            if (var4 > 0L) {
              int discarded$4 = 0;
              wl.a(var4);
              break L0;
            } else {
              break L0;
            }
          }
          return ((wj) this).a(119, param1);
        } else {
          L1: {
            var4 = ((wj) this).a(-27042);
            if (var4 > 0L) {
              int discarded$5 = 0;
              wl.a(var4);
              break L1;
            } else {
              break L1;
            }
          }
          return ((wj) this).a(119, param1);
        }
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = 64;
        if (0 < hk.field_d) {
          if (null == tk.field_u) {
            L0: {
              og.field_rb = dj.a(0, 480, 640, (byte) 96, rg.field_c, 0);
              if (og.field_rb == null) {
                var3 = 3;
                break L0;
              } else {
                te.a(true, (java.awt.Canvas) (Object) og.field_rb);
                var3 = 2;
                break L0;
              }
            }
            if (null == tk.field_u) {
              if (!ag.field_b) {
                return;
              } else {
                ij.a((byte) 111, var3, param1);
                return;
              }
            } else {
              return;
            }
          } else {
            L1: {
              og.field_rb = tk.field_u.c(0);
              int discarded$2 = 2;
              int discarded$3 = -127;
              ni.a();
              if (og.field_rb == null) {
                var3 = 3;
                break L1;
              } else {
                te.a(true, (java.awt.Canvas) (Object) og.field_rb);
                var3 = 2;
                break L1;
              }
            }
            if (null == tk.field_u) {
              if (!ag.field_b) {
                return;
              } else {
                ij.a((byte) 111, var3, param1);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (jj.s(109)) {
            var3 = 0;
            if (null != tk.field_u) {
              return;
            } else {
              L2: {
                if (ag.field_b) {
                  ij.a((byte) 111, var3, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            var3 = 1;
            if (null != tk.field_u) {
              return;
            } else {
              L3: {
                if (ag.field_b) {
                  ij.a((byte) 111, var3, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        }
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != -6424) {
            return;
        }
        field_a = null;
    }

    abstract long a(int param0);

    static {
    }
}
