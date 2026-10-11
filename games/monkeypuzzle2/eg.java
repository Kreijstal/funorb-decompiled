/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static String field_f;
    int field_b;
    int field_g;
    int field_a;
    static te field_i;
    int field_e;
    static boolean field_j;
    static boolean[] field_k;
    static int field_c;
    static String field_h;
    static ai[] field_d;

    final static eg[] a(md param0, boolean param1) {
        eg[] stackIn_4_0 = null;
        eg[] stackIn_13_0 = null;
        eg[] stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        eg[] var4 = null;
        int var5 = 0;
        eg var6 = null;
        int var7 = 0;
        ic var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (!param0.a(2)) {
            stackIn_4_0 = new eg[]{};
            return stackIn_4_0;
          }
          var8 = param0.b((byte) -66);
          while (true) {
            if (var8.field_g == 0) {
              em.a(10L, false);
              if (var7 == 0) {
                continue;
              }
            } else {
              if (var8.field_g != 2) {
                var10 = (int[]) (var8.field_b);
                var9 = var10;
                var3 = var9;
                var4 = new eg[var10.length >> 2];
                if (!param1) {
                  field_j = false;
                }
                var5 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (var4.length <= var5))) {
                  var6 = new eg();
                  stackIn_22_0 = var4;
                  if (var7 == 0) {
                    stackIn_22_0[var5] = var6;
                    var6.field_a = var3[var5 << 2];
                    var6.field_b = var3[(var5 << 2) + 1];
                    var6.field_e = var3[(var5 << 2) + 2];
                    var6.field_g = var3[3 + (var5 << 2)];
                    var5++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  stackIn_22_0 = var4;
                }
                return stackIn_22_0;
              }
            }
            break;
          }
          stackIn_13_0 = new eg[]{};
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("eg.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 == -1937866142) {
          return;
        }
        field_d = (ai[]) null;
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = param3.indexOf(param2);
        if (param1 != 4) {
          eg.a(47, -126);
        }
        while (true) {
          if (var4 == -1) {
            return param3;
          }
          param3 = param3.substring(0, var4) + param0 + param3.substring(param2.length() + var4);
          stackIn_6_0 = (String) (param3);
          if (var5 != 0) {
            return stackIn_6_0;
          }
          var4 = ((String) (Object) stackIn_6_0).indexOf(param2, var4 + param0.length());
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_h = null;
        field_d = null;
        field_i = null;
        if (param0 == -108) {
          field_f = null;
          return;
        }
        field_f = (String) null;
        field_f = null;
    }

    static {
        field_f = "Connection lost - attempting to reconnect";
        field_i = new te(2, 4, 4, 0);
        field_h = "Please wait...";
        field_k = new boolean[64];
    }
}
