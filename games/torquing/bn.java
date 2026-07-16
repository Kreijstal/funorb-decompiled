/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bn {
    int field_e;
    static int field_h;
    static volatile boolean field_b;
    int field_c;
    int field_j;
    int field_g;
    static boolean field_i;
    int field_a;
    int field_d;
    static double[][] field_f;

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static bm a(int param0, int param1, int param2, byte param3, int param4) {
        bm var5 = null;
        int var6 = 0;
        Object var7 = null;
        bm var8 = null;
        var6 = Torquing.field_u;
        var5 = (bm) (Object) gl.field_d.b(0);
        L0: while (true) {
          if (var5 == null) {
            var8 = new bm();
            var5 = var8;
            var8.field_q = param4;
            if (param3 != 44) {
              var7 = null;
              boolean discarded$1 = bn.a((String) null, 73);
              var5.field_o = param2;
              var5.field_s = param0;
              gl.field_d.a((byte) 54, (q) (Object) var5);
              mc.a((byte) 85, param1, var5);
              return var5;
            } else {
              var5.field_o = param2;
              var5.field_s = param0;
              gl.field_d.a((byte) 54, (q) (Object) var5);
              mc.a((byte) 85, param1, var5);
              return var5;
            }
          } else {
            if (param0 != var5.field_s) {
              var5 = (bm) (Object) gl.field_d.f(-24059);
              continue L0;
            } else {
              return var5;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 >= -54) {
            field_b = false;
        }
    }

    final static boolean a(String param0, int param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param1 != -17310) {
          field_h = -119;
          var3 = (CharSequence) (Object) param0;
          return tj.field_j.equals((Object) (Object) hf.a(var3, 116));
        } else {
          var4 = (CharSequence) (Object) param0;
          return tj.field_j.equals((Object) (Object) hf.a(var4, 116));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_f = new double[8][];
    }
}
