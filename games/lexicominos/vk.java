/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vk implements Iterator {
    private kd field_c;
    static String field_d;
    private ji field_a;
    private kd field_b;
    private int field_e;

    private final void b(byte param0) {
        ((vk) this).field_b = null;
        ((vk) this).field_e = 1;
        ((vk) this).field_c = ((vk) this).field_a.field_f[0].field_f;
    }

    final static void a(char[][] param0, int param1, int[][] param2) {
        ij var11 = null;
        ng var4 = null;
        ij[] var5 = null;
        int var6 = 0;
        ij var7 = null;
        ng var8 = null;
        mk var9 = null;
        int var10 = Lexicominos.field_L ? 1 : 0;
        try {
            var11 = new ij();
            var4 = of.a(param0, 0, var11);
            var5 = sa.a(param1, var4);
            var11.field_q = 0;
            for (var6 = var5.length; var6 > 0; var6--) {
                var7 = var5[0];
                var7.b(param1 ^ -3, var5);
                var8 = var7.field_k;
                var9 = (mk) (Object) var8.a(true);
                while (var9 != null) {
                    if (!(var9.field_k.field_q <= var7.field_q + var9.field_i)) {
                        var9.field_k.field_q = var9.field_i + var7.field_q;
                        var9.field_k.a(120, var5);
                    }
                    var9 = (mk) (Object) var8.f(param1 + 2);
                }
            }
            fc.a(var4, param0, param2, 11882);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "vk.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b(int param0) {
    }

    public final boolean hasNext() {
        int var2 = Lexicominos.field_L ? 1 : 0;
        if (!(((vk) this).field_c == ((vk) this).field_a.field_f[((vk) this).field_e - 1])) {
            return true;
        }
        while (((vk) this).field_e < ((vk) this).field_a.field_d) {
            int fieldTemp$0 = ((vk) this).field_e;
            ((vk) this).field_e = ((vk) this).field_e + 1;
            if (((vk) this).field_a.field_f[fieldTemp$0].field_f != ((vk) this).field_a.field_f[-1 + ((vk) this).field_e]) {
                ((vk) this).field_c = ((vk) this).field_a.field_f[-1 + ((vk) this).field_e].field_f;
                return true;
            }
            ((vk) this).field_c = ((vk) this).field_a.field_f[((vk) this).field_e - 1];
        }
        return false;
    }

    final static void a(sh param0, int param1, hk param2, int param3) {
        try {
            tf.field_c = cl.p(-124) * param3 / 1000;
            ed.a(param1 ^ param1, param0);
            de.a(0, param0);
            vf.a(false, param0);
            cb.b(-110);
            dg.a(19681);
            mc.field_k = -tf.field_c;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "vk.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public final Object next() {
        kd var1 = null;
        int var2 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        if (((vk) this).field_c != ((vk) this).field_a.field_f[((vk) this).field_e + -1]) {
          var1 = ((vk) this).field_c;
          ((vk) this).field_c = var1.field_f;
          ((vk) this).field_b = var1;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((vk) this).field_a.field_d > ((vk) this).field_e) {
              int fieldTemp$2 = ((vk) this).field_e;
              ((vk) this).field_e = ((vk) this).field_e + 1;
              var1 = ((vk) this).field_a.field_f[fieldTemp$2].field_f;
              if (((vk) this).field_a.field_f[((vk) this).field_e - 1] != var1) {
                ((vk) this).field_b = var1;
                ((vk) this).field_c = var1.field_f;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static byte[] a(int param0, th param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param1.g(param2, 26527);
            if (param0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param1.g(3, 26527);
                var6 = (byte)param1.g(8, 26527);
                if (var5 > 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param3[var7] = (byte)(param1.g(var5, dg.a(param0, 26527)) + var6);
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param3;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("vk.A(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(byte param0) {
        ul.field_k = false;
        int discarded$0 = ig.field_a.d(true);
        int var1 = -124 % ((param0 - 77) / 38);
    }

    public final void remove() {
        if (!(((vk) this).field_b != null)) {
            throw new IllegalStateException();
        }
        ((vk) this).field_b.b((byte) -126);
        ((vk) this).field_b = null;
    }

    vk(ji param0) {
        ((vk) this).field_b = null;
        try {
            ((vk) this).field_a = param0;
            this.b((byte) 108);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "vk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -30230) {
            vk.a((byte) -80);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Close";
    }
}
