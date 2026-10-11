/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ae {
    private int field_W;
    static oh field_R;
    private vm field_S;
    static jb field_V;
    static int field_Q;
    static String field_P;
    static String field_U;
    static int field_T;

    final String e(int param0) {
        if (param0 != 0) {
          this.field_W = 121;
          if (this.field_r) {
            return this.field_S.a((byte) -73);
          }
          return null;
        }
        if (this.field_r) {
          return this.field_S.a((byte) -73);
        }
        return null;
    }

    final boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        na var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -384169950) {
            return false;
          }
          var4 = (na) null;
          this.a((na) null, 31);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ab.EB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_T = -32;
          }
          stackIn_3_0 = qb.a(true, param2, (byte) -87, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ab.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        jk var8;
        int var9;
        int var10;
        int var11;
        oh var13;
        oh var14;
        oh var15;
        oh var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = TetraLink.field_J;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        var5 = param1 + (this.field_t + (this.field_F >> 1));
        var6 = (this.field_u >> 1) + (this.field_w + param2);
        var8 = this.field_S.c(param0 - 96);
        if (pm.field_b == var8) {
          var16 = fj.field_q[0];
          var9 = var16.field_t << 1;
          var10 = var16.field_F << 1;
          if (bb.field_c == null) {
            bb.field_c = new oh(var9, var10);
            sk.a((byte) 112, bb.field_c);
          } else {
            if (bb.field_c.field_u < var9) {
              bb.field_c = new oh(var9, var10);
              sk.a((byte) 112, bb.field_c);
            } else {
              if (bb.field_c.field_E < var10) {
                bb.field_c = new oh(var9, var10);
                sk.a((byte) 112, bb.field_c);
              } else {
                sk.a((byte) 120, bb.field_c);
                ra.a();
              }
            }
          }
          var16.a(112, 144, var16.field_t << 4, var16.field_F << 4, -this.field_W << 10, 4096);
          dh.a(-581);
          bb.field_c.b(-var16.field_t + var5, var6 - var16.field_F, 256);
          return;
        }
        if (ug.field_cb != var8) {
          if (var8 == db.field_h) {
            var14 = fj.field_q[2];
            var14.b(var5 - (var14.field_u >> 1), var6 - (var14.field_E >> 1), 256);
            return;
          }
          if (var8 != pf.field_a) {
            return;
          }
          var13 = fj.field_q[1];
          var13.b(var5 - (var13.field_u >> 1), -(var13.field_E >> 1) + var6, 256);
          return;
        }
        var15 = fj.field_q[0];
        var9Lifetime1 = var15.field_t << 1;
        var10Lifetime1 = var15.field_F << 1;
        if (bb.field_c == null) {
          bb.field_c = new oh(var9Lifetime1, var10Lifetime1);
          sk.a((byte) 112, bb.field_c);
        } else {
          if (bb.field_c.field_u < var9Lifetime1) {
            bb.field_c = new oh(var9Lifetime1, var10Lifetime1);
            sk.a((byte) 112, bb.field_c);
          } else {
            if (bb.field_c.field_E < var10Lifetime1) {
              bb.field_c = new oh(var9Lifetime1, var10Lifetime1);
              sk.a((byte) 112, bb.field_c);
            } else {
              sk.a((byte) 120, bb.field_c);
              ra.a();
            }
          }
        }
        var15.a(112, 144, var15.field_t << 4, var15.field_F << 4, -this.field_W << 10, 4096);
        dh.a(-581);
        bb.field_c.b(-var15.field_t + var5, var6 - var15.field_F, 256);
    }

    ab(vm param0) {
        try {
          this.field_S = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_R = null;
        if (param0 <= 11) {
          return;
        }
        field_U = null;
        field_V = null;
        field_P = null;
    }

    final void a(na param0, int param1, int param2, boolean param3) {
        try {
          this.field_W = this.field_W + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ab.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_T = -1;
        field_P = "Withdraw invitation to <%0> to join this game";
    }
}
