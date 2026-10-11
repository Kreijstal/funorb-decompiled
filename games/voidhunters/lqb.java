/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lqb extends rqa {
    static int[][] field_o;

    final static String a(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int stackIn_4_0 = 0;
        String stackIn_7_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param1 != null) {
            stackIn_4_0 = param1.length();
          } else {
            stackIn_4_0 = 0;
          }
          var2_int = stackIn_4_0;
          if (var2_int == 0) {
            stackIn_7_0 = (String) (param1);
            return stackIn_7_0;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          for (var5 = 0; var2_int > var5; var5++) {
            var3[var5] = param1.charAt(var5);
            if (60 != var8[var5]) {
              if (62 == var8[var5] &&
                var4 > 0) {
                var4--;
              } else {
                if (var4 == 0) {
                  var3[var5] = Character.toUpperCase(var8[var5]);
                }
              }
            } else {
              var4++;
            }
          }
          if (param0 != -1) {
            field_o = (int[][]) null;
          }
          stackIn_24_0 = new String(var8);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("lqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    lqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = (int[][]) null;
        if (param0 < 101) {
          lqb.a(-22);
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
          si.a(47, 62, param0[0].a(109));
          if (param1 > -119) {
            lqb.a(115);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lqb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = new int[][]{new int[]{14, 24}, new int[]{25, 28}, new int[]{29, 34}, new int[]{35, 41}, new int[]{42, 48}, new int[]{49, 52}, new int[]{53, 58}, new int[]{72, 83}, new int[]{84, 85}, new int[]{86, 90}, new int[]{94, 99}, new int[]{91, 92}, new int[]{101, 113}, new int[]{114, 116}, new int[]{117, 119}};
    }
}
