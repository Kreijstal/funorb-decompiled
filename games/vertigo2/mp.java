/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    private er[] field_e;
    static String field_c;
    static fe field_a;
    static cr field_g;
    static ch field_f;
    static int field_d;
    static int field_b;

    public static void a(int param0) {
        if (param0 >= -122) {
          return;
        }
        field_c = null;
        field_g = null;
        field_a = null;
        field_f = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        bc.a(param0, param2, (byte) 116, this.field_e, param3, param1);
        if (param4 > -55) {
          mp.a(-42, 20);
        }
    }

    mp(er[] param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        String var4 = null;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime1Lifetime1;
        if (param2 != 19297) {
          mp.a(-127, -8);
        }
        int var3 = null != sj.field_d ? 1 : 0;
        if (de.field_f == 9) {
          if (!lk.a(1, tg.field_a, uo.field_d, jo.field_b, fj.field_lb)) {
            if (de.field_f == 10) {
              if (var3 != 0) {
                return false;
              }
              g.a((byte) -10);
              return true;
            }
            if (de.field_f != 11) {
              return false;
            }
            if (!ff.field_m) {
              return false;
            }
            if (nm.field_E == 2 &&
              !rm.a((byte) -126, ba.field_a, qi.field_b)) {
              return false;
            }
            if (nm.field_E != 2) {
              if (var3 != 0) {
                return false;
              }
              if (mf.b(-6390)) {
                var4 = (String) null;
                tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
                return true;
              }
              return true;
            }
            if (!mf.b(-6390)) {
              return true;
            }
            var4Lifetime2 = (String) null;
            tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
            return true;
          }
          if (jo.field_b != 2) {
            if (var3 == 0) {
              return qm.a(fj.field_lb, uo.field_d, (byte) 83, jo.field_b, tg.field_a);
            }
            return false;
          }
          return qm.a(fj.field_lb, uo.field_d, (byte) 83, jo.field_b, tg.field_a);
        }
        if (de.field_f == 10) {
          if (var3 != 0) {
            return false;
          }
          g.a((byte) -10);
          return true;
        }
        if (de.field_f == 11 &&
          ff.field_m) {
          if (nm.field_E == 2 &&
            !rm.a((byte) -126, ba.field_a, qi.field_b)) {
            return false;
          }
          if (nm.field_E != 2) {
            if (var3 == 0) {
              if (mf.b(-6390)) {
                var4Lifetime1 = (String) null;
                tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
              }
              return true;
            }
            return false;
          }
          if (mf.b(-6390)) {
            var4Lifetime1Lifetime1 = (String) null;
            tf.a(nm.field_E, qi.field_b, -84, (String) null, param0, ap.field_c);
          }
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1) {
        mi var2 = null;
        mi var2Lifetime1;
        if (param1 > 17) {
          var2 = uh.field_Wb;
          var2.j(param0, 118);
          var2.f(1, 112);
          var2.f(0, 99);
          return;
        }
        mp.a(-79, -52);
        var2Lifetime1 = uh.field_Wb;
        var2Lifetime1.j(param0, 118);
        var2Lifetime1.f(1, 112);
        var2Lifetime1.f(0, 99);
    }

    static {
        field_c = "Cancel";
    }
}
