/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tf {
    static String field_c;
    static oj field_a;
    static li field_b;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = ok.a((byte) 125);
        var2 = kb.b((byte) 98);
        if (param0 != 0) {
          tf.b(-92);
          eh.field_a.a(true, var1 - -(ka.field_q << 489811521), var2 + (sa.field_h << -2144618463), rg.field_F + -sa.field_h, -ka.field_q + od.field_r);
          kl.a(true);
          return;
        } else {
          eh.field_a.a(true, var1 - -(ka.field_q << 489811521), var2 + (sa.field_h << -2144618463), rg.field_F + -sa.field_h, -ka.field_q + od.field_r);
          kl.a(true);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        int var1 = -17 / ((param0 - -7) / 63);
    }

    final static byte[] a(int param0, boolean param1, Object param2) {
        byte[] var3 = null;
        i var4 = null;
        if (param2 != null) {
          if (param0 == 2) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param1) {
                return var3;
              } else {
                return cl.a(0, var3);
              }
            } else {
              if (param2 instanceof i) {
                var4 = (i) param2;
                return var4.a(-27);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            tf.b(-31);
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (!param1) {
                return var3;
              } else {
                return cl.a(0, var3);
              }
            } else {
              if (param2 instanceof i) {
                var4 = (i) param2;
                return var4.a(-27);
              } else {
                throw new IllegalArgumentException();
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, pb[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = stellarshard.field_B;
        if (param2 != null) {
          if (param0 <= 0) {
            return;
          } else {
            var5 = param2[0].field_w;
            var6 = param2[param1].field_w;
            var7 = param2[1].field_w;
            param2[0].e(param3, param4);
            param2[2].e(-var6 + param0 + param3, param4);
            ti.a(og.field_b);
            ti.a(var5 + param3, param4, -var6 + param3 - -param0, param2[1].field_x + param4);
            var8 = param3 + var5;
            var9 = -var6 + (param3 - -param0);
            param3 = var8;
            L0: while (true) {
              if (param3 >= var9) {
                ti.b(og.field_b);
                return;
              } else {
                param2[1].e(param3, param4);
                param3 = param3 + var7;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Not yet achieved";
        field_a = new oj();
        field_b = new li(15, 0, 1, 0);
    }
}
