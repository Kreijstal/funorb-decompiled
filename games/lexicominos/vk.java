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
        this.field_b = null;
        this.field_e = 1;
        this.field_c = this.field_a.field_f[0].field_f;
        if (param0 < 61) {
            vk.a((char[][]) null, -45, (int[][]) null);
        }
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
                var9 = (mk) ((Object) var8.a(true));
                while (var9 != null) {
                    if (!(var9.field_k.field_q <= var7.field_q + var9.field_i)) {
                        var9.field_k.field_q = var9.field_i + var7.field_q;
                        var9.field_k.a(120, var5);
                    }
                    var9 = (mk) ((Object) var8.f(param1 + 2));
                }
            }
            fc.a(var4, param0, param2, 11882);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            field_d = (String) null;
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2 = Lexicominos.field_L ? 1 : 0;
        if (!(this.field_c == this.field_a.field_f[this.field_e - 1])) {
            return true;
        }
        while (this.field_e < this.field_a.field_d) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            if (this.field_a.field_f[fieldTemp$0].field_f != this.field_a.field_f[-1 + this.field_e]) {
                this.field_c = this.field_a.field_f[-1 + this.field_e].field_f;
                return true;
            }
            this.field_c = this.field_a.field_f[this.field_e - 1];
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
            mc.field_k = 0 + -tf.field_c;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        kd var1;
        int var2;
        var2 = Lexicominos.field_L ? 1 : 0;
        if (this.field_c != this.field_a.field_f[this.field_e + -1]) {
          var1 = this.field_c;
          this.field_c = var1.field_f;
          this.field_b = var1;
          return var1;
        } else {
          L0: while (true) {
            if (this.field_a.field_d > this.field_e) {
              fieldTemp$1 = this.field_e;
              this.field_e = this.field_e + 1;
              var1 = this.field_a.field_f[fieldTemp$1].field_f;
              if (this.field_a.field_f[this.field_e - 1] != var1) {
                this.field_b = var1;
                this.field_c = var1.field_f;
                return var1;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
                if ((var5 ^ -1) < -1) {
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
              stackIn_16_0 = (byte[]) (param3);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("vk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(byte param0) {
        ul.field_k = false;
        ig.field_a.d(true);
        int var1 = -124 % ((param0 - 77) / 38);
    }

    public final void remove() {
        if (!(this.field_b != null)) {
            throw new IllegalStateException();
        }
        this.field_b.b((byte) -126);
        this.field_b = null;
    }

    vk(ji param0) {
        this.field_b = null;
        try {
            this.field_a = param0;
            this.b((byte) 108);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != -30230) {
            vk.a((byte) -80);
        }
    }

    static {
        field_d = "Close";
    }
}
