/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends RuntimeException {
    static jg[] field_g;
    Throwable field_f;
    String field_d;
    static jp field_b;
    static int field_e;
    static String field_c;
    static int[] field_a;

    final static int b(int param0) {
        if (param0 != 5395) {
          return -14;
        }
        return jj.field_c;
    }

    public static void a(boolean param0) {
        if (param0) {
          v.a(-93);
        }
        field_g = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    v(Throwable param0, String param1) {
        this.field_f = param0;
        this.field_d = param1;
    }

    final static void a(int param0, int param1, boolean param2, MultiplayerMatch param3, int param4, int param5) {
        int var6_int = 0;
        int stackIn_7_0;
        boolean stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        boolean stackIn_8_4;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        PlayerBoard var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          op.a(param0 + 6, t.field_d, 294, 6, param1, 64, 3 + param5);
          for (var6_int = 0; param3.playerCount > var6_int; var6_int++) {
            if (0 == (1 << var6_int & (param3.playerMaskTwo | param3.playerMaskOne | param3.playerMaskThree))) {
              var7 = param3.playerBoards[var6_int];
              var8 = 1414 * var7.field_G / (30 * param3.playerCount);
              var8 = var8 + (de.field_x + 294 << 7);
              var8 = var8 >> 8;
              stackIn_7_0 = var7.field_H;
              stackIn_7_1 = false;
              stackIn_7_2 = var7.field_M;
              stackIn_7_3 = var8;
              stackIn_8_4 = (var6_int == param4);
              ib.a(stackIn_7_0, stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, param5, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("v.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static jp[] a(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        jp[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = BrickABrac.field_J ? 1 : 0;
        var1 = new jp[nl.field_c];
        if (param0 != -835) {
          v.a(false);
        }
        for (var2 = 0; var2 < nl.field_c; var2++) {
          var3 = gg.field_t[var2] * jh.field_b[var2];
          var21 = cn.field_a[var2];
          if (!tm.field_b[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = qp.field_c[ik.a((int) var21[var6], 255)];
            }
            var1[var2] = new jp(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var22);
          } else {
            var15 = bj.field_S[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6_ref_int__[var7] = ud.d(ik.a(255, (int) var15[var7]) << 24, qp.field_c[ik.a(255, (int) var21[var7])]);
            }
            var1[var2] = (jp) ((Object) new fb(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var17));
          }
        }
        MotionWaypoint.d((byte) 96);
        return var1;
    }

    static {
        field_c = "Send private message to <%0>";
    }
}
