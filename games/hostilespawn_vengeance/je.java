/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_b;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        fd var2;
        if (param0 <= 12) {
          var2 = (fd) null;
          je.a((fd) null, 44);
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static ak[] a(fd param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        ak[] var4 = null;
        int var5 = 0;
        ak var6 = null;
        int var7 = 0;
        kk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        ak[] stackIn_4_0 = null;
        ak[] stackIn_11_0 = null;
        ak[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (!param0.a(true)) {
              stackIn_4_0 = new ak[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param0.a(param1 ^ -83);
              L1: while (true) {
                if (var8.field_f != 0) {
                  if (param1 == var8.field_f) {
                    stackIn_11_0 = new ak[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var10 = (int[]) (var8.field_c);
                    var9 = var10;
                    var3 = var9;
                    var4 = new ak[var10.length >> -2072120126];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackIn_16_0 = (ak[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new ak();
                        var4[var5] = var6;
                        var6.field_d = var3[var5 << -390634590];
                        var6.field_k = var3[1 + (var5 << -2033296062)];
                        var6.field_e = var3[(var5 << -2043817374) + 2];
                        var6.field_j = var3[3 + (var5 << -1303884702)];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  vj.a(10L, (byte) -49);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("je.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    static {
        field_b = "There's got to be a way out of here somehow!";
        field_a = new int[]{0, 6, 4, 4, 4};
    }
}
