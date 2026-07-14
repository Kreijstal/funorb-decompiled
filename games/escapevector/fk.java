/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static String field_c;
    static volatile int field_b;
    static ed[] field_f;
    int field_d;
    static String field_e;
    static mf field_a;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        int var1 = 22 % ((-65 - param0) / 36);
        field_f = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3_ref_byte__ = null;
        fh var4 = null;
        if (param0 == null) {
            return null;
        }
        if (param0 instanceof byte[]) {
            var3_ref_byte__ = (byte[]) param0;
            if (!param2) {
                return var3_ref_byte__;
            }
            return pn.a(0, var3_ref_byte__);
        }
        if (!(!(param0 instanceof fh))) {
            var4 = (fh) param0;
            return var4.a(4);
        }
        int var3 = -100 % ((-31 - param1) / 55);
        throw new IllegalArgumentException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        qi.a(param1, param0, param4, param3, param5, -90, param6, param8, param7);
        qi.a(param1, -3 + param0, param4, -1, 3 + param5, 67, param6 - -3, -3 + param8, param7);
        if (param2 <= 52) {
            Object var10 = null;
            tg discarded$0 = fk.a(104, (String) null);
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        if (param0) {
            field_a = null;
            return rl.a(10, (byte) 84, true, param1);
        }
        return rl.a(10, (byte) 84, true, param1);
    }

    final static tg a(int param0, String param1) {
        Object var3 = null;
        tg var3_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var3 = null;
        var5 = EscapeVector.field_A;
        if (null != bm.field_b) {
          if (param1 != null) {
            if (0 != param1.length()) {
              if (param0 == -1465) {
                var12 = (CharSequence) (Object) param1;
                var8 = sf.a(param0 ^ 1499, var12);
                if (var8 != null) {
                  var3_ref = (tg) (Object) bm.field_b.a(-76, (long)var8.hashCode());
                  L0: while (true) {
                    if (var3_ref != null) {
                      var13 = (CharSequence) (Object) var3_ref.field_ob;
                      var9 = sf.a(-79, var13);
                      if (var9.equals((Object) (Object) var8)) {
                        return var3_ref;
                      } else {
                        var3_ref = (tg) (Object) bm.field_b.a((byte) -36);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                field_c = null;
                var10 = (CharSequence) (Object) param1;
                var6 = sf.a(param0 ^ 1499, var10);
                if (var6 != null) {
                  var3_ref = (tg) (Object) bm.field_b.a(-76, (long)var6.hashCode());
                  L1: while (true) {
                    if (var3_ref != null) {
                      var11 = (CharSequence) (Object) var3_ref.field_ob;
                      var7 = sf.a(-79, var11);
                      if (var7.equals((Object) (Object) var6)) {
                        return var3_ref;
                      } else {
                        var3_ref = (tg) (Object) bm.field_b.a((byte) -36);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            fk.a(115);
            if (!(bk.field_r == null)) {
                bk.field_r.a((byte) -127);
            }
            return;
        }
        if (!(bk.field_r == null)) {
            bk.field_r.a((byte) -127);
        }
    }

    fk(int param0) {
        ((fk) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "If you have an account, log in to start at any level you've reached.";
        field_e = "If you are ever unsure what to do, press 'ESC' in-game<br>and select 'Instructions' to view your current objective.";
    }
}
