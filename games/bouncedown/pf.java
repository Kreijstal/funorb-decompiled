/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends ak {
    private bc field_E;
    static int[] field_A;
    static String[] field_D;
    static String field_B;

    final void d(byte param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(((pf) this).field_E);
        if (param0 <= 109) {
            field_A = null;
        }
        ri var3 = (ri) (Object) var2.a(22092);
        while (var3 != null) {
            if (!(!var3.e((byte) 21))) {
                var3.c(2);
            }
            var3 = (ri) (Object) var2.c(-124);
        }
        ((pf) this).field_x = (lk) (Object) ((pf) this).a(false);
    }

    public static void j(int param0) {
        field_B = null;
        if (param0 != -1) {
            field_A = null;
        }
        field_A = null;
        field_D = null;
    }

    final void l(int param0) {
        int var4 = Bounce.field_N;
        if (param0 != -26623) {
            return;
        }
        ea var2 = new ea(((pf) this).field_E);
        ri var3 = (ri) (Object) var2.a(22092);
        while (var3 != null) {
            if (var3.f((byte) -33)) {
                var3.c(param0 ^ -26621);
            }
            var3 = (ri) (Object) var2.c(-102);
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param0 == 128) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        var3 = bc.a(param2, -123);
        if (-1 != param1.indexOf(param2)) {
          return true;
        } else {
          if (-1 == param1.indexOf(var3)) {
            L1: {
              L2: {
                if (param1.startsWith(param2)) {
                  break L2;
                } else {
                  if (param1.startsWith(var3)) {
                    break L2;
                  } else {
                    if (param1.endsWith(param2)) {
                      break L2;
                    } else {
                      if (!param1.endsWith(var3)) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L1;
            }
            return stackIn_13_0 != 0;
          } else {
            return true;
          }
        }
    }

    final ri a(boolean param0) {
        ea var2 = null;
        ri var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var2 = new ea(((pf) this).field_E);
          var3 = (ri) (Object) var2.a(22092);
          if (!param0) {
            break L0;
          } else {
            ((pf) this).a(43, 120, -50, -123);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_D) {
              var3 = (ri) (Object) var2.c(-109);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void k(int param0) {
        int var4 = Bounce.field_N;
        ea var2 = new ea(((pf) this).field_E);
        ri var3 = (ri) (Object) var2.a(22092);
        while (var3 != null) {
            var3.field_D = false;
            var3 = (ri) (Object) var2.c(-85);
        }
        if (param0 != -20281) {
            field_D = null;
        }
        ((pf) this).field_x = null;
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        if (!(!param0.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (param0.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param1 != -1) {
            Object var3 = null;
            boolean discarded$0 = pf.a(-115, (String) null, (String) null);
        }
        if (!(!param0.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (param0.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = Bounce.field_N;
        if (!(null == ((pf) this).field_j)) {
            ((pf) this).field_j.a(param1, (lk) this, (byte) 3, true, param3);
        }
        if (param2 < 33) {
            field_B = null;
        }
        ea var5 = new ea(((pf) this).field_E);
        lk var6 = (lk) (Object) var5.e(50);
        while (var6 != null) {
            var6.a(param0, param1 - -((pf) this).field_i, 68, param3 - -((pf) this).field_r);
            var6 = (lk) (Object) var5.a((byte) 33);
        }
    }

    final void b(lk param0, boolean param1) {
        if (!(param0 instanceof ri)) {
            throw new IllegalArgumentException();
        }
        ri var3 = (ri) (Object) param0;
        ((pf) this).field_E.a((byte) 83, (ai) (Object) var3);
        var3.field_D = true;
        boolean discarded$0 = var3.a((lk) this, param1);
    }

    final lk a(int param0) {
        ea var2 = null;
        ri var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var2 = new ea(((pf) this).field_E);
          if (param0 == 0) {
            break L0;
          } else {
            ((pf) this).d((byte) -47);
            break L0;
          }
        }
        var3 = (ri) (Object) var2.a(22092);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_D) {
              var3 = (ri) (Object) var2.c(-119);
              continue L1;
            } else {
              return var3.d((byte) 99);
            }
          } else {
            return null;
          }
        }
    }

    public pf() {
        super(0, 0, ob.field_a, gi.field_e, (fc) null, (sk) null);
        ((pf) this).field_E = new bc();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[128];
        field_D = new String[]{"Showing by rating", "Showing by win percentage"};
        field_B = "Please try again in a few minutes.";
    }
}
