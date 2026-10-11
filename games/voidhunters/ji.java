/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends rqa {
    static qkb field_p;
    static int[] field_o;

    ji(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean b(boolean param0) {
        boolean[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = qd.field_a;
          var1 = var5;
          var2 = 0;
          while (true) {
            if (var5.length <= var2) {
              if (param0) {
                return true;
              }
              ji.b(false);
              return true;
            }
            var3 = var5[var2] ? 1 : 0;
            if (var3 != 0) {
              var2++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "ji.D(" + param0 + ')');
        }
    }

    final static void e(int param0) {
        ana var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        ana var1Lifetime1;
        var2 = VoidHunters.field_G;
        try {
          if (param0 != 200) {
            return;
          }
          flb.field_o.h();
          aaa.field_b.h();
          m.field_o = m.field_o - 1;
          if (m.field_o == 0) {
            m.field_o = 200;
            var1 = (ana) (cg.field_p.d(0));
            while (var1 != null) {
              if (!var1.field_g.b((byte) -63)) {
                var1.b(-3846);
              }
              var1 = (ana) (cg.field_p.a((byte) 96));
            }
            if (rd.field_o != null) {
              var1Lifetime1 = (ana) (rd.field_o.d(0));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_g.b((byte) -63)) {
                  var1Lifetime1.b(-3846);
                }
                var1Lifetime1 = (ana) (rd.field_o.a((byte) 47));
              }
            }
          }
          if (aab.field_o != null) {
            stackIn_20_0 = aab.field_o.c(-100);
            if (!stackIn_20_0) {
              dha.field_u = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "ji.B(" + param0 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            ji.b(true);
          }
          qua.field_b = param0[0].d(0);
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ji.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 200) {
          return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        field_o = new int[8192];
    }
}
