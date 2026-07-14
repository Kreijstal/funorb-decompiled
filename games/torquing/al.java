/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int[] field_d;
    static String field_f;
    static int[] field_e;
    private lj field_h;
    static String field_c;
    private vl field_a;
    private int field_b;
    private int field_g;

    final static int a(double param0, byte param1) {
        int var3 = 109 % ((-50 - param1) / 50);
        return (int)(0.5 + param0);
    }

    private final void a(d param0, int param1) {
        L0: {
          if (param0 != null) {
            param0.f(0);
            param0.h(0);
            ((al) this).field_g = ((al) this).field_g + param0.field_t;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 <= 51) {
          ((al) this).field_h = null;
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0 != 20) {
            al.a((byte) -68);
        }
    }

    final void a(long param0, Object param1, byte param2) {
        if (param2 != 116) {
          int discarded$2 = al.a(0.6495872916691957, (byte) 34);
          this.a(1, param0, param1, true);
          return;
        } else {
          this.a(1, param0, param1, true);
          return;
        }
    }

    private final void a(int param0, long param1, Object param2, boolean param3) {
        en var6 = null;
        int var7 = 0;
        d var8 = null;
        d var10 = null;
        var7 = Torquing.field_u;
        if (((al) this).field_b >= param0) {
          this.a(param1, 18998);
          if (param3) {
            ((al) this).field_g = ((al) this).field_g - param0;
            L0: while (true) {
              if (0 <= ((al) this).field_g) {
                var6 = new en(param2, param0);
                ((al) this).field_a.a(param1, (byte) 92, (q) (Object) var6);
                ((al) this).field_h.a((ta) (Object) var6, (byte) -60);
                ((d) (Object) var6).field_l = 0L;
                return;
              } else {
                var10 = (d) (Object) ((al) this).field_h.a(4);
                this.a(var10, 111);
                continue L0;
              }
            }
          } else {
            al.a((byte) 76);
            ((al) this).field_g = ((al) this).field_g - param0;
            L1: while (true) {
              if (0 <= ((al) this).field_g) {
                var6 = new en(param2, param0);
                ((al) this).field_a.a(param1, (byte) 92, (q) (Object) var6);
                ((al) this).field_h.a((ta) (Object) var6, (byte) -60);
                ((d) (Object) var6).field_l = 0L;
                return;
              } else {
                var8 = (d) (Object) ((al) this).field_h.a(4);
                this.a(var8, 111);
                continue L1;
              }
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final void a(long param0, int param1) {
        d var4 = null;
        var4 = (d) (Object) ((al) this).field_a.a(param0, param1 + -19110);
        this.a(var4, 111);
        if (param1 != 18998) {
          Object discarded$2 = ((al) this).a(30, 43L);
          return;
        } else {
          return;
        }
    }

    final Object a(int param0, long param1) {
        Object var5 = null;
        en var6 = null;
        d var7 = null;
        var7 = (d) (Object) ((al) this).field_a.a(param1, 115);
        if (param0 <= -122) {
          if (var7 != null) {
            var5 = var7.b(12);
            if (var5 == null) {
              var7.f(0);
              var7.h(0);
              ((al) this).field_g = ((al) this).field_g + var7.field_t;
              return null;
            } else {
              if (var7.c((byte) 37)) {
                var6 = new en(var5, var7.field_t);
                ((al) this).field_a.a(var7.field_f, (byte) 75, (q) (Object) var6);
                ((al) this).field_h.a((ta) (Object) var6, (byte) -66);
                ((d) (Object) var6).field_l = 0L;
                var7.f(0);
                var7.h(0);
                return var5;
              } else {
                ((al) this).field_h.a((ta) (Object) var7, (byte) -48);
                var7.field_l = 0L;
                return var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private al() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Secret achievement";
        field_d = new int[4];
        field_e = new int[32];
        int[] var0 = field_e;
        field_e[7] = 31;
        var0[0] = 31;
        field_c = "Exit fullscreen mode and quit";
    }
}
