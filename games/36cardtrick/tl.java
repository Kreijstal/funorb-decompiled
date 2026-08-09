/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class tl {
    static bk field_a;
    int field_d;
    String field_c;
    static int field_b;

    public static void b(int param0) {
        if (param0 != 80) {
            return;
        }
        field_a = null;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(String param0, String param1, int param2) {
        if (param2 <= 102) {
            return;
        }
        try {
            ej.a((byte) -121, param0, param1, false);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "tl.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static vk a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        w var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        w var8 = null;
        vd var9 = null;
        var7 = Main.field_T;
        if (param0 == 24881) {
          L0: {
            var8 = rd.field_j;
            var2 = var8;
            var3 = var8.f(-112);
            if (0 == (var3 & 128)) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          L1: {
            gg.field_a = stackIn_5_0 != 0;
            hg.field_b = 127 & var3;
            be.field_a = var8.f(102);
            ff.field_a = var8.d(true);
            if (hg.field_b == 2) {
              fg.field_l = var8.d((byte) 72);
              bi.field_a = var8.e(true);
              break L1;
            } else {
              bi.field_a = 0;
              fg.field_l = 0;
              break L1;
            }
          }
          L2: {
            if (var8.f(76) != 1) {
              stackIn_11_0 = 0;
              break L2;
            } else {
              stackIn_11_0 = 1;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_11_0;
            cd.field_g = var8.c(false);
            if (var4 != 0) {
              fj.field_c = var8.c(false);
              break L3;
            } else {
              fj.field_c = cd.field_g;
              break L3;
            }
          }
          L4: {
            if ((hg.field_b ^ -1) == -2) {
              var8.d((byte) 72);
              var8.c(false);
              break L4;
            } else {
              if ((hg.field_b ^ -1) == -5) {
                var8.d((byte) 72);
                var8.c(false);
                break L4;
              } else {
                break L4;
              }
            }
          }
          if (!param1) {
            hi.field_b = ab.a(var8, param0 ^ 24921, 80);
            bl.field_c = null;
            return new vk(param1);
          } else {
            var5 = var8.d((byte) 72);
            try {
              L5: {
                L6: {
                  var9 = mh.field_d.a(var5, -32769);
                  hi.field_b = var9.b((byte) 28);
                  if (!fj.field_c.equals(ri.field_c)) {
                    stackIn_24_0 = var9.field_m;
                    break L6;
                  } else {
                    stackIn_24_0 = null;
                    break L6;
                  }
                }
                bl.field_c = stackIn_24_0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              k.a((Throwable) ((Object) var6), (byte) 111, "CC1");
              bl.field_c = null;
              hi.field_b = null;
              return new vk(param1);
            }
            return new vk(param1);
          }
        } else {
          return (vk) null;
        }
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          this.field_d = 5;
          return new java.net.Socket(this.field_c, this.field_d);
        } else {
          return new java.net.Socket(this.field_c, this.field_d);
        }
    }

    static {
        field_a = new bk();
    }
}
