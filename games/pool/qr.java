/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr {
    static int field_d;
    static int field_g;
    static int field_b;
    static ko field_a;
    private boolean field_e;
    private String field_c;
    private boolean field_f;

    public static void a() {
        field_a = null;
    }

    final boolean b(byte param0) {
        int var2 = 105 / (param0 / 60);
        return ((qr) this).field_e;
    }

    final boolean a(int param0) {
        if (param0 <= 74) {
            boolean discarded$0 = ((qr) this).b((byte) 103);
            return ((qr) this).field_f;
        }
        return ((qr) this).field_f;
    }

    final String b(int param0) {
        if (param0 != 2) {
            return null;
        }
        return ((qr) this).field_c;
    }

    final static void c() {
    }

    final void a(boolean param0, byte param1) {
        if (param1 <= 108) {
            return;
        }
        ((qr) this).field_e = param0 ? true : false;
        ((qr) this).field_f = true;
    }

    qr(String param0) {
        ((qr) this).field_e = false;
        ((qr) this).field_f = false;
        try {
            ((qr) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        if (mp.field_V > 0) {
          if (fk.field_gb == null) {
            L0: {
              int discarded$4 = 0;
              int discarded$5 = 0;
              ne.field_u = wp.a(640, lg.field_s, (byte) 0, 480);
              if (null != ne.field_u) {
                var2 = 2;
                kc.a((java.awt.Canvas) (Object) ne.field_u, 2);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            L1: {
              if (fk.field_gb != null) {
                break L1;
              } else {
                if (!fe.field_J) {
                  break L1;
                } else {
                  kk.a(param1, 4, var2);
                  return;
                }
              }
            }
            return;
          } else {
            L2: {
              ne.field_u = fk.field_gb.b(-71);
              int discarded$6 = 2;
              int discarded$7 = 25692;
              ab.a();
              if (null != ne.field_u) {
                var2 = 2;
                kc.a((java.awt.Canvas) (Object) ne.field_u, 2);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            L3: {
              if (fk.field_gb != null) {
                break L3;
              } else {
                if (!fe.field_J) {
                  break L3;
                } else {
                  kk.a(param1, 4, var2);
                  return;
                }
              }
            }
            return;
          }
        } else {
          if (hk.b(-120)) {
            L4: {
              var2 = 0;
              if (fk.field_gb != null) {
                break L4;
              } else {
                if (!fe.field_J) {
                  break L4;
                } else {
                  kk.a(param1, 4, var2);
                  return;
                }
              }
            }
            return;
          } else {
            var2 = 1;
            if (fk.field_gb == null) {
              if (fe.field_J) {
                kk.a(param1, 4, var2);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ko();
    }
}
