/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    private vb field_d;
    private int field_g;
    private int field_a;
    static boolean[] field_c;
    private qm field_b;
    static String field_f;
    static String field_e;

    private final void a(long param0, int param1) {
        sh var4 = null;
        if (param1 != 0) {
          this.a(52L, 125);
          var4 = (sh) (Object) ((fa) this).field_b.a(-2678, param0);
          this.a(var4, (byte) 20);
          return;
        } else {
          var4 = (sh) (Object) ((fa) this).field_b.a(-2678, param0);
          this.a(var4, (byte) 20);
          return;
        }
    }

    private final void a(long param0, Object param1, int param2, int param3) {
        sh var6 = null;
        vk var6_ref = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (param2 > ((fa) this).field_a) {
          throw new IllegalStateException();
        } else {
          this.a(param0, 0);
          ((fa) this).field_g = ((fa) this).field_g - param2;
          L0: while (true) {
            if (-1 >= (((fa) this).field_g ^ -1)) {
              if (param3 != 11261) {
                return;
              } else {
                var6_ref = new vk(param1, param2);
                ((fa) this).field_b.a(param0, (byte) -106, (hg) (Object) var6_ref);
                ((fa) this).field_d.a(false, (fl) (Object) var6_ref);
                ((sh) (Object) var6_ref).field_p = 0L;
                return;
              }
            } else {
              var6 = (sh) (Object) ((fa) this).field_d.a((byte) 102);
              this.a(var6, (byte) -113);
              continue L0;
            }
          }
        }
    }

    final void a(Object param0, long param1, byte param2) {
        if (param2 <= 53) {
            return;
        }
        this.a(param1, param0, 1, 11261);
    }

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        if (!param0) {
            field_e = null;
        }
    }

    private final void a(sh param0, byte param1) {
        int var3 = 38 / ((param1 - -70) / 38);
        if (!(param0 == null)) {
            param0.c((byte) -94);
            param0.d(117);
            ((fa) this).field_g = ((fa) this).field_g + param0.field_q;
        }
    }

    final Object a(long param0, byte param1) {
        Object var5 = null;
        vk var6 = null;
        sh var7 = null;
        var7 = (sh) (Object) ((fa) this).field_b.a(-2678, param0);
        if (var7 != null) {
          if (param1 == -54) {
            var5 = var7.e((byte) 97);
            if (var5 == null) {
              var7.c((byte) -85);
              var7.d(-58);
              ((fa) this).field_g = ((fa) this).field_g + var7.field_q;
              return null;
            } else {
              if (var7.d((byte) 120)) {
                var6 = new vk(var5, var7.field_q);
                ((fa) this).field_b.a(var7.field_e, (byte) -106, (hg) (Object) var6);
                ((fa) this).field_d.a(false, (fl) (Object) var6);
                ((sh) (Object) var6).field_p = 0L;
                var7.c((byte) -123);
                var7.d(param1 ^ 25);
                return var5;
              } else {
                ((fa) this).field_d.a(false, (fl) (Object) var7);
                var7.field_p = 0L;
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

    final static ih a(int param0, mf param1, int param2, mf param3, int param4) {
        if (param0 == 1) {
          if (!uc.a(param3, 121, param2, param4)) {
            return null;
          } else {
            return qa.a(16826, param1.a(param2, (byte) -97, param4));
          }
        } else {
          fa.a(true);
          if (!uc.a(param3, 121, param2, param4)) {
            return null;
          } else {
            return qa.a(16826, param1.a(param2, (byte) -97, param4));
          }
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new boolean[7];
        field_f = "Return to Pause Menu";
        field_e = "WARNING: HIGH GRAVITY";
    }
}
