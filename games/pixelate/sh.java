/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sh implements Iterator {
    private fa field_a;
    static String field_c;
    private kl field_g;
    private int field_b;
    private fa field_d;
    static mo field_e;
    static int field_f;

    public final Object next() {
        fa var1 = null;
        int var2 = 0;
        var2 = Pixelate.field_H ? 1 : 0;
        if (((sh) this).field_g.field_e[-1 + ((sh) this).field_b] == ((sh) this).field_a) {
          L0: while (true) {
            if (((sh) this).field_b < ((sh) this).field_g.field_a) {
              int fieldTemp$2 = ((sh) this).field_b;
              ((sh) this).field_b = ((sh) this).field_b + 1;
              var1 = ((sh) this).field_g.field_e[fieldTemp$2].field_a;
              if (((sh) this).field_g.field_e[((sh) this).field_b - 1] == var1) {
                continue L0;
              } else {
                ((sh) this).field_a = var1.field_a;
                ((sh) this).field_d = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((sh) this).field_a;
          ((sh) this).field_a = var1.field_a;
          ((sh) this).field_d = var1;
          return (Object) (Object) var1;
        }
    }

    public final void remove() {
        if (((sh) this).field_d == null) {
            throw new IllegalStateException();
        }
        ((sh) this).field_d.c(2779);
        ((sh) this).field_d = null;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_c = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Pixelate.field_H ? 1 : 0;
        if (((sh) this).field_a == ((sh) this).field_g.field_e[((sh) this).field_b + -1]) {
          L0: while (true) {
            if (((sh) this).field_b < ((sh) this).field_g.field_a) {
              int fieldTemp$1 = ((sh) this).field_b;
              ((sh) this).field_b = ((sh) this).field_b + 1;
              if (((sh) this).field_g.field_e[fieldTemp$1].field_a != ((sh) this).field_g.field_e[((sh) this).field_b - 1]) {
                ((sh) this).field_a = ((sh) this).field_g.field_e[-1 + ((sh) this).field_b].field_a;
                return true;
              } else {
                ((sh) this).field_a = ((sh) this).field_g.field_e[((sh) this).field_b + -1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static boolean a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 < 0) {
          L0: {
            if (0 != (1 + param1) % 4) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          if (!param0) {
            if (param1 < 1582) {
              L1: {
                if (0 != param1 % 4) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              return stackIn_13_0 != 0;
            } else {
              if (param1 % 4 == 0) {
                if (param1 % 100 != 0) {
                  return true;
                } else {
                  if (0 == param1 % 400) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    private final void a(byte param0) {
        ((sh) this).field_b = 1;
        ((sh) this).field_d = null;
        ((sh) this).field_a = ((sh) this).field_g.field_e[0].field_a;
    }

    sh(kl param0) {
        ((sh) this).field_d = null;
        try {
            ((sh) this).field_g = param0;
            this.a((byte) -39);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Real-life threats";
        field_f = 1000;
    }
}
