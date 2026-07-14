/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static String field_h;
    private im field_d;
    static byte[] field_b;
    private lk field_a;
    private int field_c;
    private int field_f;
    static int field_g;
    static int field_e;

    private final void a(byte param0, int param1, Object param2, long param3) {
        cf var6 = null;
        int var7 = 0;
        jj var8 = null;
        var7 = HoldTheLine.field_D;
        if (((bi) this).field_c < param1) {
          throw new IllegalStateException();
        } else {
          this.a(true, param3);
          ((bi) this).field_f = ((bi) this).field_f - param1;
          L0: while (true) {
            if (-1 >= (((bi) this).field_f ^ -1)) {
              if (param0 != -7) {
                return;
              } else {
                var6 = new cf(param2, param1);
                ((bi) this).field_d.a((byte) 27, (hl) (Object) var6, param3);
                ((bi) this).field_a.a((ln) (Object) var6, -29460);
                ((jj) (Object) var6).field_i = 0L;
                return;
              }
            } else {
              var8 = (jj) (Object) ((bi) this).field_a.b((byte) 121);
              this.a(-3393, var8);
              continue L0;
            }
          }
        }
    }

    private final void a(boolean param0, long param1) {
        jj var4 = null;
        var4 = (jj) (Object) ((bi) this).field_d.a(param1, -88);
        this.a(-3393, var4);
        if (!param0) {
          ((bi) this).field_c = 79;
          return;
        } else {
          return;
        }
    }

    final static go a(boolean param0, String param1, boolean param2, boolean param3, int param4) {
        if (!param2) {
            return null;
        }
        return new go(param1, param4, param3, param0);
    }

    private final void a(int param0, jj param1) {
        L0: {
          if (param1 != null) {
            param1.d(0);
            param1.a((byte) -42);
            ((bi) this).field_f = ((bi) this).field_f + param1.field_o;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -3393) {
          ((bi) this).field_c = -45;
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_h = null;
        if (param0) {
            Object var2 = null;
            go discarded$0 = bi.a(false, (String) null, false, false, -5);
        }
    }

    final static gn a(int param0, int param1) {
        int var2 = 36 / ((56 - param0) / 61);
        return kh.a(param1, false, true, false, 10600, 1);
    }

    final Object a(long param0, int param1) {
        int var5 = 0;
        Object var6 = null;
        cf var7 = null;
        jj var8 = null;
        var8 = (jj) (Object) ((bi) this).field_d.a(param0, -78);
        if (var8 != null) {
          var5 = -29 / ((-57 - param1) / 46);
          var6 = var8.b((byte) 66);
          if (var6 == null) {
            var8.d(0);
            var8.a((byte) -42);
            ((bi) this).field_f = ((bi) this).field_f + var8.field_o;
            return null;
          } else {
            L0: {
              if (var8.g(-101)) {
                var7 = new cf(var6, var8.field_o);
                ((bi) this).field_d.a((byte) 27, (hl) (Object) var7, var8.field_f);
                ((bi) this).field_a.a((ln) (Object) var7, -29460);
                ((jj) (Object) var7).field_i = 0L;
                var8.d(0);
                var8.a((byte) -42);
                break L0;
              } else {
                ((bi) this).field_a.a((ln) (Object) var8, -29460);
                var8.field_i = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    final void a(long param0, Object param1, boolean param2) {
        if (param2) {
          ((bi) this).field_a = null;
          this.a((byte) -7, 1, param1, param0);
          return;
        } else {
          this.a((byte) -7, 1, param1, param0);
          return;
        }
    }

    private bi() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Achievements This Game";
        field_b = new byte[]{(byte)49, (byte)105};
    }
}
