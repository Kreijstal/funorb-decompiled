/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class w implements Iterator {
    private wf field_d;
    static int field_f;
    static String field_a;
    private wf field_e;
    private int field_c;
    private vi field_b;

    public final Object next() {
        wf var1 = null;
        int var2 = 0;
        var2 = Transmogrify.field_A ? 1 : 0;
        if (((w) this).field_b.field_d[((w) this).field_c + -1] != ((w) this).field_d) {
          var1 = ((w) this).field_d;
          ((w) this).field_e = var1;
          ((w) this).field_d = var1.field_b;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((w) this).field_b.field_c > ((w) this).field_c) {
              ((w) this).field_c = ((w) this).field_c + 1;
              var1 = ((w) this).field_b.field_d[((w) this).field_c].field_b;
              if (((w) this).field_b.field_d[-1 + ((w) this).field_c] != var1) {
                ((w) this).field_d = var1.field_b;
                ((w) this).field_e = var1;
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

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Transmogrify.field_A ? 1 : 0;
        if (((w) this).field_b.field_d[-1 + ((w) this).field_c] == ((w) this).field_d) {
          L0: while (true) {
            if (((w) this).field_b.field_c <= ((w) this).field_c) {
              return false;
            } else {
              ((w) this).field_c = ((w) this).field_c + 1;
              if (((w) this).field_b.field_d[((w) this).field_c].field_b != ((w) this).field_b.field_d[-1 + ((w) this).field_c]) {
                ((w) this).field_d = ((w) this).field_b.field_d[-1 + ((w) this).field_c].field_b;
                return true;
              } else {
                ((w) this).field_d = ((w) this).field_b.field_d[((w) this).field_c + -1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    private final void a(byte param0) {
        ((w) this).field_c = 1;
        if (param0 != -75) {
            return;
        }
        ((w) this).field_d = ((w) this).field_b.field_d[0].field_b;
        ((w) this).field_e = null;
    }

    final static sj a(j param0, int param1, nf param2, byte param3, char param4) {
        sj var5_ref = null;
        if (param3 <= 24) {
            Object var7 = null;
            sj discarded$0 = w.a((j) null, -111, (nf) null, (byte) -120, '￬');
        }
        sj var5 = (sj) (Object) ab.field_c.c(-126);
        if (!(var5 != null)) {
            var5_ref = new sj();
        }
        ch.field_e.a((wf) (Object) var5_ref, -112);
        var5_ref.field_i = param4;
        var5_ref.field_n = param2;
        var5_ref.field_v = param2.field_p[param4 & 255];
        sj var6 = var5_ref;
        var5_ref.field_l = 0;
        var5_ref.field_p = param0.field_c;
        var5_ref.field_g = param0.field_d + 32 * param1;
        var5_ref.field_q = param0.field_c;
        var6.field_h = 0;
        var5_ref.field_k = param0;
        var5_ref.field_o = param0;
        var5_ref.field_j = param1 * 32 + param0.field_d;
        var5_ref.field_s = param1;
        var5_ref.field_t = param1;
        return var5_ref;
    }

    public final void remove() {
        if (!(null != ((w) this).field_e)) {
            throw new IllegalStateException();
        }
        ((w) this).field_e.c(5);
        ((w) this).field_e = null;
    }

    final static sj a(byte param0, boolean param1) {
        j var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var6 = Transmogrify.field_A ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var2 = null;
        var3 = -1;
        var4 = -1;
        var5 = 0;
        L1: while (true) {
          if (12 <= var5) {
            var7 = 0;
            var5 = var7;
            L2: while (true) {
              if ((var7 ^ -1) <= -9) {
                if (var2 != null) {
                  return var2.field_e[var3];
                } else {
                  return null;
                }
              } else {
                if (si.field_i.field_e[var7] != null) {
                  if (param0 == si.field_i.field_e[var7].field_i) {
                    L3: {
                      if (si.field_i.field_e[var7].field_l > var4) {
                        var3 = var7;
                        var2 = si.field_i;
                        var4 = si.field_i.field_e[var7].field_l;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (si.field_i.field_e[var7].field_x) {
                      var3 = var7;
                      var4 = 2147483647;
                      var2 = si.field_i;
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  } else {
                    var7++;
                    continue L2;
                  }
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            if (null != wk.field_a.field_e[var5]) {
              if (wk.field_a.field_e[var5].field_i == param0) {
                L4: {
                  if (var4 < wk.field_a.field_e[var5].field_l) {
                    var3 = var5;
                    var2 = wk.field_a;
                    var4 = wk.field_a.field_e[var5].field_l;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (wk.field_a.field_e[var5].field_x) {
                  var3 = var5;
                  var4 = 2147483647;
                  var2 = wk.field_a;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    final static boolean a(int param0, hj param1) {
        if (param0 != -1) {
            field_f = -99;
        }
        return param1.k(1, 1522829539) == 1 ? true : false;
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -84) {
            field_a = null;
        }
    }

    w(vi param0) {
        ((w) this).field_e = null;
        ((w) this).field_b = param0;
        this.a((byte) -75);
    }

    static {
    }
}
