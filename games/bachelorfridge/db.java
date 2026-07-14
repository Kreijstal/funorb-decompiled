/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static vr field_a;
    static String[] field_b;

    final static pp a(lu param0, int param1) {
        nq var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = qi.a(param0, (byte) 115);
        var3 = param0.b(true);
        var4 = param0.c((byte) -85);
        if (param1 != 95) {
          field_a = null;
          return (pp) (Object) new qq(var2, var3, var4);
        } else {
          return (pp) (Object) new qq(var2, var3, var4);
        }
    }

    final static void b(int param0) {
        fj var1 = null;
        var1 = (fj) (Object) kma.field_o.a((byte) -124);
        if (var1 != null) {
          dg.a(var1.field_o, var1.field_f, var1.field_n);
          dg.a(var1.field_l, var1.field_j, var1.field_k, var1.field_h);
          if (param0 <= 60) {
            db.b(-65);
            var1.field_o = null;
            ii.field_m.a((bw) (Object) var1, true);
            return;
          } else {
            var1.field_o = null;
            ii.field_m.a((bw) (Object) var1, true);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_b = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param0 = jm.a((byte) 75, param0, '_', "");
        var3 = vm.a(param0, (byte) 106);
        if (!param2) {
          if ((param1.indexOf(param0) ^ -1) == 0) {
            if ((param1.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var4 = null;
          boolean discarded$5 = db.a((String) null, (String) null, false);
          if ((param1.indexOf(param0) ^ -1) != 0) {
            return true;
          } else {
            L0: {
              if ((param1.indexOf(var3) ^ -1) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[16];
    }
}
