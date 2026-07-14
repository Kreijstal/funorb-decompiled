/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    private int field_f;
    private int field_a;
    static int[] field_c;
    static int field_d;
    private wg field_e;
    private m field_g;
    static ll field_b;

    final Object a(long param0, byte param1) {
        Object var5 = null;
        f var6 = null;
        uq var7 = null;
        var7 = (uq) (Object) ((ri) this).field_g.a(13497, param0);
        if (var7 != null) {
          var5 = var7.b(false);
          if (var5 != null) {
            if (param1 <= 121) {
              L0: {
                this.a(-102L, 20);
                if (var7.a(true)) {
                  var6 = new f(var5, var7.field_z);
                  ((ri) this).field_g.a((tc) (Object) var6, false, var7.field_i);
                  ((ri) this).field_e.a(-96, (ms) (Object) var6);
                  ((uq) (Object) var6).field_q = 0L;
                  var7.d(97);
                  var7.c((byte) -76);
                  break L0;
                } else {
                  ((ri) this).field_e.a(-96, (ms) (Object) var7);
                  var7.field_q = 0L;
                  break L0;
                }
              }
              return var5;
            } else {
              L1: {
                if (var7.a(true)) {
                  var6 = new f(var5, var7.field_z);
                  ((ri) this).field_g.a((tc) (Object) var6, false, var7.field_i);
                  ((ri) this).field_e.a(-96, (ms) (Object) var6);
                  ((uq) (Object) var6).field_q = 0L;
                  var7.d(97);
                  var7.c((byte) -76);
                  break L1;
                } else {
                  ((ri) this).field_e.a(-96, (ms) (Object) var7);
                  var7.field_q = 0L;
                  break L1;
                }
              }
              return var5;
            }
          } else {
            var7.d(123);
            var7.c((byte) -76);
            ((ri) this).field_a = ((ri) this).field_a + var7.field_z;
            return null;
          }
        } else {
          return null;
        }
    }

    private final void a(uq param0, int param1) {
        if (param0 == null) {
          if (param1 != 0) {
            ((ri) this).field_g = null;
            return;
          } else {
            return;
          }
        } else {
          param0.d(param1 ^ -115);
          param0.c((byte) -76);
          ((ri) this).field_a = ((ri) this).field_a + param0.field_z;
          if (param1 == 0) {
            return;
          } else {
            ((ri) this).field_g = null;
            return;
          }
        }
    }

    private final void a(Object param0, byte param1, int param2, long param3) {
        uq var9 = null;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(((ri) this).field_f >= param2)) {
            throw new IllegalStateException();
        }
        this.a(param3, -75);
        ((ri) this).field_a = ((ri) this).field_a - param2;
        while (0 > ((ri) this).field_a) {
            var9 = (uq) (Object) ((ri) this).field_e.a(false);
            this.a(var9, 0);
        }
        int var6 = 105 % ((4 - param1) / 34);
        f var7 = new f(param0, param2);
        ((ri) this).field_g.a((tc) (Object) var7, false, param3);
        ((ri) this).field_e.a(-96, (ms) (Object) var7);
        ((uq) (Object) var7).field_q = 0L;
    }

    private final void a(long param0, int param1) {
        if (param1 > -64) {
            return;
        }
        uq var4 = (uq) (Object) ((ri) this).field_g.a(13497, param0);
        this.a(var4, 0);
    }

    final void a(Object param0, int param1, long param2) {
        this.a(param0, (byte) -46, 1, param2);
        if (param1 != 100) {
            Object discarded$0 = ((ri) this).a(64L, (byte) 125);
        }
    }

    public static void a(byte param0) {
        int var1 = -24 % ((14 - param0) / 59);
        field_b = null;
        field_c = null;
    }

    ri(int param0) {
        this(param0, param0);
    }

    private ri(int param0, int param1) {
        int var3 = 0;
        ((ri) this).field_e = new wg();
        ((ri) this).field_a = param0;
        ((ri) this).field_f = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((ri) this).field_g = new m(var3);
            }
          } else {
            ((ri) this).field_g = new m(var3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{100, 100, 60, 80, 90, 90, 100, 100, 80, 70, 100, 100, 90, 100, 70, 90};
        field_d = 0;
    }
}
