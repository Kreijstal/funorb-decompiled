/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends IntrusiveNode {
    int field_j;
    int field_k;
    int field_i;
    int field_h;
    int field_m;
    static IntrusiveDeque field_n;
    int field_g;
    static volatile boolean field_l;

    final static boolean a(int param0, int param1) {
        if (param1 >= -85) {
          field_n = (IntrusiveDeque) null;
          int var2 = dh.field_e.length;
          if (0 > param0) {
            return false;
          }
          if (var2 <= param0) {
            return false;
          }
          int var3 = dh.field_e[param0];
          if (var3 != 2) {
            return true;
          }
          if (bj.e((byte) -56)) {
            return true;
          }
          return false;
        }
        int var2Lifetime1 = dh.field_e.length;
        if (0 > param0) {
          return false;
        }
        if (var2Lifetime1 <= param0) {
          return false;
        }
        int var3Lifetime1 = dh.field_e[param0];
        if (var3Lifetime1 != 2) {
          return true;
        }
        if (!bj.e((byte) -56)) {
          return false;
        }
        return true;
    }

    final static void a(int param0, String param1) {
        try {
          ca.field_d = param1;
          lj.a(param0, 39);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_n = null;
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        if (param2 != -8) {
          field_l = false;
        }
        if (param0) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (!param1) {
          return fd.field_f[var4];
        }
        var4++;
        return fd.field_f[var4];
    }

    final static void a(boolean param0) {
        int var1;
        int var2 = EscapeVector.obfuscationControl;
        dj.field_b = null;
        if (param0) {
          ei.field_i = false;
          if (eb.field_H) {
            be.field_b.r(94);
            return;
          }
          var1 = am.field_g;
          if (var1 > 0) {
            if (var1 == 1) {
              dj.field_b = cf.field_a;
            } else {
              dj.field_b = r.a(mi.field_j, -63, new String[]{Integer.toString(var1)});
            }
            dj.field_b = s.a((byte) -31, new CharSequence[]{(CharSequence) ((Object) dj.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) qa.field_I)});
          }
          be.field_b.o(-18861);
          cg.d(32);
          return;
        }
        field_n = (IntrusiveDeque) null;
        ei.field_i = false;
        if (eb.field_H) {
          be.field_b.r(94);
        } else {
          var1 = am.field_g;
          if (var1 > 0) {
            if (var1 == 1) {
              dj.field_b = cf.field_a;
            } else {
              dj.field_b = r.a(mi.field_j, -63, new String[]{Integer.toString(var1)});
            }
            dj.field_b = s.a((byte) -31, new CharSequence[]{(CharSequence) ((Object) dj.field_b), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) qa.field_I)});
          }
          be.field_b.o(-18861);
          cg.d(32);
        }
    }

    qd(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_j = param4;
        this.field_i = param3;
        this.field_g = param5;
        this.field_k = param2;
        this.field_h = param1;
        this.field_m = param0;
    }

    static {
        field_n = new IntrusiveDeque();
        field_l = true;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$3214d41809e1(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 != -8) {
          field_l = false;
        }
        if (param0) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (!param1) {
          return fd.field_f[var4];
        }
        var4++;
        return fd.field_f[var4];
    }
}
