/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji implements Iterable {
    private kd field_c;
    static int[] field_e;
    kd[] field_f;
    int field_d;
    static String field_b;
    static int[] field_a;

    public final Iterator iterator() {
        return (Iterator) ((Object) new vk((ji) (this)));
    }

    final void a(kd param0, int param1, long param2) {
        kd var5 = null;
        try {
            if (!(null == param0.field_c)) {
                param0.b((byte) -119);
            }
            var5 = this.field_f[(int)((long)(this.field_d - param1) & param2)];
            param0.field_f = var5;
            param0.field_c = var5.field_c;
            param0.field_c.field_f = param0;
            param0.field_d = param2;
            param0.field_f.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ji.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = -69 % ((4 - param0) / 55);
        field_b = null;
        field_e = null;
    }

    final static boolean a(byte param0) {
        boolean discarded$3 = false;
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = ol.field_l;
        synchronized (var1_ref) {
          L0: {
            if (tj.field_h != sh.field_f) {
              L1: {
                if (param0 == -72) {
                  break L1;
                } else {
                  discarded$3 = ji.a((byte) 25);
                  break L1;
                }
              }
              da.field_b = gj.field_x[tj.field_h];
              pe.field_b = ok.field_q[tj.field_h];
              tj.field_h = 127 & tj.field_h + 1;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final kd a(byte param0, long param1) {
        Iterator discarded$1 = null;
        kd var4 = null;
        kd var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 42) {
          var4 = this.field_f[(int)(param1 & (long)(-1 + this.field_d))];
          this.field_c = var4.field_f;
          L0: while (true) {
            if (var4 != this.field_c) {
              if (var6 == 0) {
                if ((param1 ^ -1L) != (this.field_c.field_d ^ -1L)) {
                  this.field_c = this.field_c.field_f;
                  continue L0;
                } else {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_f;
                  return var5;
                }
              } else {
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        } else {
          discarded$1 = this.iterator();
          var4 = this.field_f[(int)(param1 & (long)(-1 + this.field_d))];
          this.field_c = var4.field_f;
          L1: while (true) {
            if (var4 != this.field_c) {
              if (var6 == 0) {
                if ((param1 ^ -1L) != (this.field_c.field_d ^ -1L)) {
                  this.field_c = this.field_c.field_f;
                  continue L1;
                } else {
                  var5 = this.field_c;
                  this.field_c = this.field_c.field_f;
                  return var5;
                }
              } else {
                return null;
              }
            } else {
              this.field_c = null;
              return null;
            }
          }
        }
    }

    private ji() throws Throwable {
        throw new Error();
    }

    static {
        field_e = new int[128];
        field_a = new int[4];
    }
}
