/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_g;
    static boolean field_c;
    static pf field_a;
    private pf field_d;
    static vl[] field_b;
    private pf field_f;
    private wa field_e;

    final static boolean a(int param0) {
        if (param0 < 74) {
          field_a = (pf) null;
        }
        return id.b(-4);
    }

    public static void a(byte param0) {
        if (param0 != 31) {
          return;
        }
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        int var2 = 0;
        lb var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        lb var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = stellarshard.field_B;
        try {
          var4 = (lb) (oc.field_c.b(-124));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != 1816) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_s; var2++) {
            if (null != var4.field_r[var2] &&
              0 == var4.field_r[var2].field_f) {
              return false;
            }
            if (null != var4.field_q[var2] &&
              var4.field_q[var2].field_f == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "wk.D(" + param0 + ')');
        }
    }

    final od a(int param0, int param1) {
        byte[] var4 = null;
        od var3 = (od) (this.field_e.b((long)param1, (byte) 58));
        if (var3 != null) {
          return var3;
        }
        if (param1 < 32768) {
          var4 = this.field_f.a(param1, 16, 1);
        } else {
          var4 = this.field_d.a(32767 & param1, 16, 1);
        }
        var3 = new od();
        if (var4 != null) {
          var3.a(new ka(var4), 745);
        }
        if (param1 >= 32768) {
          var3.f(20865);
        }
        this.field_e.a(var3, (long)param1, -22424);
        if (param0 != 32767) {
          field_a = (pf) null;
        }
        return var3;
    }

    private wk() throws Throwable {
        throw new Error();
    }

    static {
        field_c = false;
        field_b = new vl[3000];
        field_g = "Please wait for high scores";
    }
}
