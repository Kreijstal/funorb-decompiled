/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterator {
    static boolean field_j;
    static mh field_a;
    private ji field_e;
    private int field_d;
    static tq field_g;
    private nm field_h;
    private nm field_k;
    static mh[] field_i;
    static jp[] field_f;
    static String[] field_b;
    static jp field_c;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void b(int param0) {
        ((ik) this).field_d = 1;
        ((ik) this).field_h = ((ik) this).field_e.field_d[0].field_e;
        if (param0 > -71) {
            return;
        }
        ((ik) this).field_k = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (((ik) this).field_h == ((ik) this).field_e.field_d[((ik) this).field_d - 1]) {
          L0: while (true) {
            if (((ik) this).field_e.field_c <= ((ik) this).field_d) {
              return false;
            } else {
              ((ik) this).field_d = ((ik) this).field_d + 1;
              if (((ik) this).field_e.field_d[((ik) this).field_d].field_e != ((ik) this).field_e.field_d[((ik) this).field_d + -1]) {
                ((ik) this).field_h = ((ik) this).field_e.field_d[((ik) this).field_d + -1].field_e;
                return true;
              } else {
                ((ik) this).field_h = ((ik) this).field_e.field_d[((ik) this).field_d - 1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        nm var1 = null;
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (((ik) this).field_h != ((ik) this).field_e.field_d[-1 + ((ik) this).field_d]) {
            var1 = ((ik) this).field_h;
            ((ik) this).field_h = var1.field_e;
            ((ik) this).field_k = var1;
            return (Object) (Object) var1;
        }
        do {
            if (((ik) this).field_d >= ((ik) this).field_e.field_c) {
                return null;
            }
            ((ik) this).field_d = ((ik) this).field_d + 1;
            var1 = ((ik) this).field_e.field_d[((ik) this).field_d].field_e;
        } while (((ik) this).field_e.field_d[((ik) this).field_d + -1] == var1);
        ((ik) this).field_h = var1.field_e;
        ((ik) this).field_k = var1;
        return (Object) (Object) var1;
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0;
        int stackOut_5_0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == eq.field_g) {
              break L2;
            } else {
              if (q.field_i != rf.field_b) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(int param0, gb param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          var2 = cn.field_d;
          if (-3 != (param1.field_c ^ -1)) {
            if (-5 != (param1.field_c ^ -1)) {
              if ((param1.field_k ^ -1L) != (oc.field_p ^ -1L)) {
                var2 = r.field_C[param1.field_c];
                break L0;
              } else {
                var2 = ki.field_i[param1.field_c];
                break L0;
              }
            } else {
              var2 = r.field_C[param1.field_c];
              break L0;
            }
          } else {
            if (!param1.field_e) {
              L1: {
                if (param1.field_f != 0) {
                  break L1;
                } else {
                  if (param1.field_d == 0) {
                    var2 = ki.field_i[param1.field_c];
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = r.field_C[param1.field_c];
              break L0;
            } else {
              var2 = cn.field_d;
              break L0;
            }
          }
        }
        if (param0 == -31126) {
          return var2;
        } else {
          return -27;
        }
    }

    public final void remove() {
        if (((ik) this).field_k == null) {
            throw new IllegalStateException();
        }
        ((ik) this).field_k.b((byte) 111);
        ((ik) this).field_k = null;
    }

    final static boolean a(int param0) {
        bg var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bg var5 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        var5 = (bg) (Object) mf.field_i.d(-78);
        var1 = var5;
        if (var1 == null) {
          return false;
        } else {
          var2 = 0;
          var3 = -90 / ((param0 - -28) / 50);
          L0: while (true) {
            if (var2 >= var1.field_s) {
              return true;
            } else {
              L1: {
                if (var5.field_j[var2] == null) {
                  break L1;
                } else {
                  if (0 != var5.field_j[var2].field_f) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              if (var5.field_l[var2] != null) {
                if (var5.field_l[var2].field_f == 0) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 > -8) {
            return;
        }
        field_g = null;
        field_f = null;
        field_i = null;
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0;
        int stackOut_7_0;
        L0: {
          if (param0 == -9) {
            break L0;
          } else {
            boolean discarded$2 = ik.a((byte) -124, 'V');
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    ik(ji param0) {
        ((ik) this).field_k = null;
        ((ik) this).field_e = param0;
        this.b(-101);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
    }
}
