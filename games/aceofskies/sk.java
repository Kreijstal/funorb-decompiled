/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sk {
    static String field_d;
    bf field_b;
    static Hashtable field_e;
    static boolean field_c;
    static int field_a;

    abstract void a(boolean param0);

    abstract void a(boolean param0, boolean param1);

    void d(int param0) {
        if (param0 != 18580) {
            ((sk) this).c(-55);
        }
    }

    void b(int param0) {
        if (param0 > -117) {
            field_e = null;
        }
    }

    abstract boolean e(int param0);

    abstract void a(int param0, int param1, jj param2);

    public static void a() {
        field_e = null;
        int var1 = 0;
        field_d = null;
    }

    void c(int param0) {
        if (param0 != 404277666) {
            field_e = null;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(boolean param0, byte param1);

    final static rm[] a(rk param0) {
        RuntimeException var2 = null;
        int[] var3 = null;
        rm[] var4 = null;
        int var5 = 0;
        rm var6 = null;
        int var7 = 0;
        en var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        rm[] stackIn_3_0 = null;
        rm[] stackIn_11_0 = null;
        rm[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        rm[] stackOut_10_0 = null;
        rm[] stackOut_15_0 = null;
        rm[] stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 84)) {
              var8 = param0.a(255);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (var8.field_a == 2) {
                    stackOut_10_0 = new rm[]{};
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    var12 = (int[]) var8.field_f;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new rm[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_15_0 = (rm[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new rm();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 2];
                        var6.field_b = var3[1 + (var5 << 2)];
                        var6.field_d = var3[(var5 << 2) - -2];
                        var6.field_a = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  int discarded$1 = 0;
                  wf.a(10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new rm[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("sk.M(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 1175069442 + 41);
        }
        return stackIn_16_0;
    }

    void a(int param0) {
        if (param0 != 10) {
            field_a = -26;
        }
    }

    void b(byte param0) {
        if (param0 != -25) {
            Object var3 = null;
            ((sk) this).a(98, 67, (jj) null);
        }
    }

    sk(bf param0) {
        try {
            ((sk) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "sk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Achieved";
        field_e = new Hashtable();
        field_c = false;
    }
}
