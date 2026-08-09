/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends ht {
    static String field_l;
    private int field_m;
    static ri[] field_n;
    private int field_k;
    static int[] field_o;

    public static void d(int param0) {
        field_o = null;
        field_n = null;
        if (param0 != 1) {
            return;
        }
        field_l = null;
    }

    public final void a(int param0) {
        int var2 = 26 / ((param0 - 44) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_k, this.field_m, 3553, 0, 0);
        this.field_k = -1;
        this.field_m = -1;
    }

    hp(fr param0, int param1, int param2, boolean param3, byte[][] param4, int param5) {
        super(param0, 34067, param1, param2 * param2 * 6, param3);
        int var7_int = 0;
        this.field_k = -1;
        this.field_m = -1;
        try {
            this.field_d.a(112, (ht) (this));
            for (var7_int = 0; 6 > var7_int; var7_int++) {
                jaggl.OpenGL.glTexImage2Dub(34069 - -var7_int, 0, this.field_a, param2, param2, 0, param5, 5121, param4[var7_int], 0);
            }
            this.a(true, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.charAt(0);
              var3 = 1;
              if (param1) {
                break L1;
              } else {
                field_o = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (param0.length() <= var3) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(var3) == var2_int) {
                  var3++;
                  continue L2;
                } else {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("hp.A(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    static {
        field_l = null;
        field_o = new int[8192];
    }
}
