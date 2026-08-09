/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static float field_a;
    int field_d;
    static String field_b;

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 64) {
                break L1;
              } else {
                pl.a(-48);
                break L1;
              }
            }
            if (cm.field_a == null) {
              stackIn_6_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var1_int = 0;
              L2: while (true) {
                if (cm.field_a.length <= var1_int) {
                  stackIn_14_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!cm.field_a[var1_int].a((byte) -47)) {
                    var1_int++;
                    continue L2;
                  } else {
                    stackIn_11_0 = var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "pl.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    pl(int param0) {
        this.field_d = param0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            field_a = 0.024353690445423126f;
        }
    }

    static {
        field_c = "Suggest muting this player";
        field_b = "Instructions";
    }
}
