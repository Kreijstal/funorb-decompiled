/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends java.awt.Canvas {
    static mk field_a;
    private java.awt.Component field_d;
    static String[] field_e;
    static String field_c;
    static String field_b;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 > -104) {
          db var2 = (db) null;
          pg.a((byte) 1, (db) null, false, (db) null, (db) null);
        }
        field_e = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (param2 != -2) {
            field_a = (mk) null;
          }
          var3_int = 1;
          while (param1 > 1) {
            if (0 != (1 & param1)) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
          }
          if (param1 == 1) {
            stackIn_13_0 = param0 * var3_int;
            return stackIn_13_0;
          }
          stackIn_15_0 = var3_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3), "pg.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, db param1, boolean param2, db param3, db param4) {
        try {
          if (param0 >= -96) {
            db var6 = (db) null;
            pg.a((byte) 43, (db) null, false, (db) null, (db) null);
          }
          gk.field_e = lc.a("", (byte) 51);
          gk.field_e.a(106, false);
          e.a(4, param1, param4, param3);
          hm.a(-3121);
          sg.field_b = tl.field_e;
          lc.field_c = tl.field_e;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pg.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, int param3, un param4, int param5) {
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        al[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        al[] var10 = null;
        gb var11 = null;
        int var8Lifetime1;
        var9 = CrazyCrystals.field_B;
        try {
          if (!param4.b(5)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param5 == 0) {
            var10 = ri.a(param4, (byte) 27);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (param2 == var10[var8].field_i &&
                param1 == var10[var8].field_g && ((0 == param3 ||
                var10[var8].field_e == param3) &&
                (var7_int == 0 ||
                !(param5 >= var10[var8].field_b)))) {
                param5 = var10[var8].field_b;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param4.a(param2, param1, param5, param3, (byte) 4);
          while (0 == var11.field_a) {
            fh.a(true, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_b);
          if (var7 == null) {
            stackIn_33_0 = null;
            return (java.awt.Frame) (stackIn_33_0);
          }
          var8Lifetime1 = 101 % ((param0 - 14) / 62);
          if (2 != var11.field_a) {
            stackIn_38_0 = var7;
            return stackIn_38_0;
          }
          bo.a(param4, var7, 1);
          stackIn_36_0 = null;
          return (java.awt.Frame) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_41_0 = var6_ref;
          stackIn_41_1 = new StringBuilder().append("pg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_d.update(param0);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pg.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    pg(java.awt.Component param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_d.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pg.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new String[]{"Teleroom", "Sacrifice", "Crystal Beyond", "Shufflesworth", "City", "Double Trouble", "Mining", "Bomb Tower", "The Pit", "Come Again Rock", "Which Way?", "Stop Pushing!"};
        field_c = "Create your own free Jagex account";
        field_b = "Play free version";
        field_a = new mk();
    }
}
