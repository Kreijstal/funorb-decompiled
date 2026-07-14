/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pha {
    private int field_e;
    static int field_g;
    static boolean field_a;
    private ou field_b;
    static kv[] field_f;
    private wha field_d;
    static int[][] field_h;
    private int field_c;

    pha(int param0) {
        this(param0, param0);
    }

    private final void a(int param0, ul param1) {
        if (param1 == null) {
          if (param0 != -29063) {
            field_h = null;
            return;
          } else {
            return;
          }
        } else {
          param1.a(false);
          param1.b(param0 + 29063);
          ((pha) this).field_e = ((pha) this).field_e + param1.field_n;
          if (param0 == -29063) {
            return;
          } else {
            field_h = null;
            return;
          }
        }
    }

    final static java.awt.Canvas a(int param0) {
        int var1 = -20 % ((56 - param0) / 46);
        return (java.awt.Canvas) (kga.field_c != null ? kga.field_c : dca.field_y);
    }

    private final void a(byte param0, long param1) {
        if (param0 != -76) {
            return;
        }
        ul var4 = (ul) (Object) ((pha) this).field_d.a(param1, (byte) -122);
        this.a(-29063, var4);
    }

    final void a(long param0, int param1, Object param2) {
        this.a(126, param1, param0, param2);
    }

    final Object a(int param0, long param1) {
        int var4 = 0;
        ul var5 = null;
        Object var6 = null;
        oea var7 = null;
        var4 = 78 % ((30 - param0) / 60);
        var5 = (ul) (Object) ((pha) this).field_d.a(param1, (byte) -119);
        if (var5 != null) {
          var6 = var5.e(-19795);
          if (var6 == null) {
            var5.a(false);
            var5.b(0);
            ((pha) this).field_e = ((pha) this).field_e + var5.field_n;
            return null;
          } else {
            L0: {
              if (var5.f(125)) {
                var7 = new oea(var6, var5.field_n);
                ((pha) this).field_d.a(0, var5.field_c, (bw) (Object) var7);
                ((pha) this).field_b.a((eo) (Object) var7, (byte) -118);
                ((ul) (Object) var7).field_h = 0L;
                var5.a(false);
                var5.b(0);
                break L0;
              } else {
                ((pha) this).field_b.a((eo) (Object) var5, (byte) -118);
                var5.field_h = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        ul var7 = null;
        int var8 = BachelorFridge.field_y;
        if (!(((pha) this).field_c >= param1)) {
            throw new IllegalStateException();
        }
        this.a((byte) -76, param2);
        ((pha) this).field_e = ((pha) this).field_e - param1;
        int var6 = 10 / ((-23 - param0) / 35);
        while (0 > ((pha) this).field_e) {
            var7 = (ul) (Object) ((pha) this).field_b.a(24383);
            this.a(-29063, var7);
        }
        oea var7_ref = new oea(param3, param1);
        ((pha) this).field_d.a(0, param2, (bw) (Object) var7_ref);
        ((pha) this).field_b.a((eo) (Object) var7_ref, (byte) -118);
        ((ul) (Object) var7_ref).field_h = 0L;
    }

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
        if (!param0) {
            java.awt.Canvas discarded$0 = pha.a(-21);
        }
    }

    private pha(int param0, int param1) {
        int var3 = 0;
        ((pha) this).field_b = new ou();
        ((pha) this).field_c = param0;
        ((pha) this).field_e = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((pha) this).field_d = new wha(var3);
            }
          } else {
            ((pha) this).field_d = new wha(var3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
