/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bg implements Iterable {
    static ng field_c;
    static pj field_b;
    static int[][] field_f;
    static fh field_d;
    static tb field_a;
    ca field_e;

    final static void a(boolean param0) {
        field_b = new pj();
        if (param0) {
          field_a = null;
          di.field_x.b(117, (w) (Object) field_b);
          return;
        } else {
          di.field_x.b(117, (w) (Object) field_b);
          return;
        }
    }

    final static void a(int param0) {
        if (param0 == 482) {
            return;
        }
        field_a = null;
    }

    final void a(ca param0, byte param1) {
        L0: {
          if (null != param0.field_m) {
            param0.b(12);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_l = ((bg) this).field_e;
        param0.field_m = ((bg) this).field_e.field_m;
        param0.field_m.field_l = param0;
        param0.field_l.field_m = param0;
        if (param1 == 25) {
          return;
        } else {
          field_d = null;
          return;
        }
    }

    final static tf a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var2 = param0.length();
        var3 = 0;
        if (param1 != -21637) {
          bg.a((byte) -109);
          L0: while (true) {
            if (var2 > var3) {
              var4 = param0.charAt(var3);
              if (var4 >= 48) {
                if (var4 <= 57) {
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return ll.field_a;
            }
          }
        } else {
          L1: while (true) {
            if (var2 > var3) {
              var4 = param0.charAt(var3);
              if (var4 >= 48) {
                if (var4 <= 57) {
                  var3++;
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return ll.field_a;
            }
          }
        }
    }

    private bg() throws Throwable {
        throw new Error();
    }

    final ca b(byte param0) {
        int var2 = 0;
        ca var3 = null;
        var2 = 10 % ((42 - param0) / 37);
        var3 = ((bg) this).field_e.field_l;
        if (((bg) this).field_e == var3) {
          return null;
        } else {
          var3.b(12);
          return var3;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ec((bg) this);
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 != 70) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ng();
        field_f = new int[][]{new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10]};
    }
}
