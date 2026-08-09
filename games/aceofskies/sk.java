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
            this.c(-55);
        }
    }

    void b(int param0) {
        if (param0 > -117) {
            field_e = (Hashtable) null;
        }
    }

    abstract boolean e(int param0);

    abstract void a(int param0, int param1, jj param2);

    public static void a(byte param0) {
        field_e = null;
        int var1 = -89 % ((0 - param0) / 52);
        field_d = null;
    }

    void c(int param0) {
        if (param0 != 404277666) {
            field_e = (Hashtable) null;
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(boolean param0, byte param1);

    final static rm[] a(rk param0, int param1) {
        rm[] stackIn_3_0 = null;
        rm[] stackIn_9_0 = null;
        rm[] stackIn_13_0 = null;
        rm[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        rm[] var4 = null;
        int var5 = 0;
        rm var6 = null;
        int var7 = 0;
        en var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 84)) {
              var8 = param0.a(param1 ^ 1175069693);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (param1 == 1175069442) {
                    if ((var8.field_a ^ -1) == -3) {
                      stackIn_13_0 = new rm[]{};
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var10 = (int[]) (var8.field_f);
                      var9 = var10;
                      var3 = var9;
                      var4 = new rm[var10.length >> 1175069442];
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          stackIn_18_0 = (rm[]) (var4);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new rm();
                          var4[var5] = var6;
                          var6.field_f = var3[var5 << 1786747298];
                          var6.field_b = var3[1 + (var5 << 404277666)];
                          var6.field_d = var3[(var5 << 376585666) - -2];
                          var6.field_a = var3[3 + (var5 << 99721154)];
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackIn_9_0 = (rm[]) null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  wf.a(10L, false);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = new rm[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("sk.M(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    void a(int param0) {
        if (param0 != 10) {
            field_a = -26;
        }
    }

    void b(byte param0) {
        if (param0 != -25) {
            jj var3 = (jj) null;
            this.a(98, 67, (jj) null);
        }
    }

    sk(bf param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Achieved";
        field_e = new Hashtable();
        field_c = false;
    }
}
