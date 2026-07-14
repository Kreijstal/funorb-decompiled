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
        if (param0 < 61) {
            vk.a((char[][]) null, -45, (int[][]) null);
        }
    }

    final static void a(char[][] param0, int param1, int[][] param2) {
        int var6 = 0;
        ij var7 = null;
        ng var8 = null;
        mk var9 = null;
        int var10 = Lexicominos.field_L ? 1 : 0;
        ij var11 = new ij();
        ng var4 = of.a(param0, 0, var11);
        ij[] var5 = sa.a(param1, var4);
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
    }

    final static void b(int param0) {
        if (param0 != 0) {
            field_d = null;
        }
    }

    public final boolean hasNext() {
        int var2 = Lexicominos.field_L ? 1 : 0;
        if (!(((vk) this).field_c == ((vk) this).field_a.field_f[((vk) this).field_e - 1])) {
            return true;
        }
        while (((vk) this).field_e < ((vk) this).field_a.field_d) {
            ((vk) this).field_e = ((vk) this).field_e + 1;
            if (((vk) this).field_a.field_f[((vk) this).field_e].field_f != ((vk) this).field_a.field_f[-1 + ((vk) this).field_e]) {
                ((vk) this).field_c = ((vk) this).field_a.field_f[-1 + ((vk) this).field_e].field_f;
                return true;
            }
            ((vk) this).field_c = ((vk) this).field_a.field_f[((vk) this).field_e - 1];
        }
        return false;
    }

    final static void a(sh param0, int param1, hk param2, int param3) {
        tf.field_c = cl.p(-124) * param3 / 1000;
        ed.a(param1 ^ param1, param0);
        de.a(0, param0);
        vf.a(false, param0);
        cb.b(-110);
        dg.a(19681);
        mc.field_k = 0 + -tf.field_c;
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
              ((vk) this).field_e = ((vk) this).field_e + 1;
              var1 = ((vk) this).field_a.field_f[((vk) this).field_e].field_f;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        var4 = param1.g(param2, 26527);
        if (param0 != var4) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param3 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param1.g(3, 26527);
            var6 = (byte)param1.g(8, 26527);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param3[var7] = (byte)(param1.g(var5, dg.a(param0, 26527)) + var6);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param3[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
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
        ((vk) this).field_a = param0;
        this.b((byte) 108);
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
