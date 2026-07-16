/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int[] field_d;
    static String field_b;
    static int field_a;
    static String field_c;
    static fh field_e;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        dd var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        var7 = Main.field_T;
        if (param0 <= 0) {
          var4 = param1;
          var5 = new dd();
          var5.a((byte) 98);
          var5.a((long)(8 * param2), (byte) 124, var4);
          var6 = new byte[64];
          var5.a(param3 ^ 5319, var6, param3);
          return var6;
        } else {
          var8 = new byte[param2];
          var4 = var8;
          var5_int = 0;
          L0: while (true) {
            if (param2 <= var5_int) {
              var5 = new dd();
              var5.a((byte) 98);
              var5.a((long)(8 * param2), (byte) 124, var4);
              var6 = new byte[64];
              var5.a(param3 ^ 5319, var6, param3);
              return var6;
            } else {
              var8[var5_int] = param1[param0 + var5_int];
              var5_int++;
              continue L0;
            }
          }
        }
    }

    final static int a(jk param0, jk param1, int param2) {
        Object var4 = null;
        if (param2 != 0) {
          var4 = null;
          byte[] discarded$2 = ti.a(-112, (byte[]) null, -39, 50);
          return pa.a((String) null, param0, param1, 0, 0, param2 + 18, false);
        } else {
          return pa.a((String) null, param0, param1, 0, 0, param2 + 18, false);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_d = null;
        field_e = null;
    }

    final static void a(float param0, byte param1, String param2, boolean param3) {
        if (null != ji.field_a) {
          ji.field_a.a(param2, param3, param0, (byte) -63);
          vj.d();
          ga.a(true, 40);
          if (param1 != 54) {
            field_d = null;
            return;
          } else {
            return;
          }
        } else {
          ji.field_a = new rk(sd.field_c, rk.field_ab);
          sd.field_c.b((lk) (Object) ji.field_a, (byte) 117);
          ji.field_a.a(param2, param3, param0, (byte) -63);
          vj.d();
          ga.a(true, 40);
          if (param1 == 54) {
            return;
          } else {
            field_d = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_b = "SCORE";
        field_a = -1;
    }
}
