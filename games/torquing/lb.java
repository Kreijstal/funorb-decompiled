/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends nk {
    pb field_x;
    int field_B;
    byte[] field_A;
    static k field_z;
    static int field_y;

    public static void c(int param0) {
        field_z = null;
        if (param0 != 0) {
          lb.c(-97);
        }
    }

    final byte[] c(byte param0) {
        if (this.field_r) {
          throw new RuntimeException();
        }
        if (param0 >= 102) {
          return this.field_A;
        }
        this.field_x = (pb) null;
        return this.field_A;
    }

    final static void a(int param0, Sprite[] param1, Sprite[] param2, int param3) {
        Sprite[] var5 = null;
        try {
          wp.field_v = param2;
          SocketConnector.field_a = param1;
          wp.field_v[4] = null;
          var5 = SocketConnector.field_a;
          Sprite[] var4 = var5;
          var5[param3] = null;
          bo.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.wrapThrowable((Throwable) ((Object) runtimeException), "lb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int b(int param0) {
        if (param0 <= 91) {
          Sprite[] var3 = (Sprite[]) null;
          lb.a(100, (Sprite[]) null, (Sprite[]) null, -50);
          if (this.field_r) {
            return 0;
          }
          return 100;
        }
        if (this.field_r) {
          return 0;
        }
        return 100;
    }

    lb() {
    }

    static {
        field_z = new k(9, 0, 4, 1);
    }
}
