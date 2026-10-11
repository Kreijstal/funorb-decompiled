/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ag {
    private pd field_T;
    static String field_M;
    static String field_I;
    private int field_H;
    static oc field_J;
    static String field_K;
    static gk field_O;
    static String field_R;
    static String field_N;
    static String[] field_P;
    static int field_S;
    static int field_Q;
    static String field_L;

    public static void g(byte param0) {
        field_K = null;
        field_O = null;
        field_N = null;
        if (param0 < -89) {
          field_L = null;
          field_R = null;
          field_J = null;
          field_M = null;
          field_I = null;
          field_P = null;
          return;
        }
        field_O = (gk) null;
        field_L = null;
        field_R = null;
        field_J = null;
        field_M = null;
        field_I = null;
        field_P = null;
    }

    final String b(boolean param0) {
        if (this.field_w) {
          return this.field_T.c(26146);
        }
        if (!param0) {
          return null;
        }
        field_N = (String) null;
        return null;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          this.field_H = this.field_H + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "mk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        eh var8;
        int var9;
        int var10;
        int var11;
        qb var13;
        qb var14;
        qb var15;
        qb var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        super.a((byte) -58, param1, param2, param3);
        if (param0 >= -52) {
          return;
        }
        if (param2 != 0) {
          return;
        }
        var5 = param1 + (this.field_n + (this.field_v >> 1));
        var6 = this.field_j + param3 + (this.field_k >> 1);
        var8 = this.field_T.a(-116);
        if (da.field_f == var8) {
          var16 = qk.field_lb[0];
          var9 = var16.field_n << 1;
          var10 = var16.field_w << 1;
          if (jk.field_o == null) {
            jk.field_o = new qb(var9, var10);
            fk.a(jk.field_o, -23095);
          } else {
            if (jk.field_o.field_q < var9) {
              jk.field_o = new qb(var9, var10);
              fk.a(jk.field_o, -23095);
            } else {
              if (var10 <= jk.field_o.field_y) {
                fk.a(jk.field_o, -23095);
                de.b();
              } else {
                jk.field_o = new qb(var9, var10);
                fk.a(jk.field_o, -23095);
              }
            }
          }
          var16.b(112, 144, var16.field_n << 4, var16.field_w << 4, -this.field_H << 10, 4096);
          oo.c(-15405);
          jk.field_o.b(var5 - var16.field_n, var6 - var16.field_w, 256);
          return;
        }
        if (var8 != ug.field_c) {
          if (ra.field_k == var8) {
            var14 = qk.field_lb[2];
            var14.b(-(var14.field_q >> 1) + var5, -(var14.field_y >> 1) + var6, 256);
            return;
          }
          if (nn.field_s != var8) {
            return;
          }
          var13 = qk.field_lb[1];
          var13.b(-(var13.field_q >> 1) + var5, -(var13.field_y >> 1) + var6, 256);
          return;
        }
        var15 = qk.field_lb[0];
        var9Lifetime1 = var15.field_n << 1;
        var10Lifetime1 = var15.field_w << 1;
        if (jk.field_o == null) {
          jk.field_o = new qb(var9Lifetime1, var10Lifetime1);
          fk.a(jk.field_o, -23095);
        } else {
          if (jk.field_o.field_q < var9Lifetime1) {
            jk.field_o = new qb(var9Lifetime1, var10Lifetime1);
            fk.a(jk.field_o, -23095);
          } else {
            if (var10Lifetime1 <= jk.field_o.field_y) {
              fk.a(jk.field_o, -23095);
              de.b();
            } else {
              jk.field_o = new qb(var9Lifetime1, var10Lifetime1);
              fk.a(jk.field_o, -23095);
            }
          }
        }
        var15.b(112, 144, var15.field_n << 4, var15.field_w << 4, -this.field_H << 10, 4096);
        oo.c(-15405);
        jk.field_o.b(var5 - var15.field_n, var6 - var15.field_w, 256);
    }

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    mk(pd param0) {
        try {
          this.field_T = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = "Decline invitation to <%0>'s game";
        field_K = "You are offering an unrated rematch.";
        field_M = "Minions can only be summoned when the summoning circle is green; you cannot summon over terrain or too far away from yourself.<br>Click to summon your Imps!";
        field_J = new oc();
        field_R = "This spell explodes five seconds after being cast, allowing you to bounce it off the terrain to hit those hard to reach targets. Try destroying one of the three targets in the arena.";
        field_N = "Select the Arcane Arrow spell below.";
        field_P = new String[]{"By rating", "By win percentage"};
        field_Q = 10;
        field_L = "Toggle mouseover help";
    }
}
