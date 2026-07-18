/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh implements Iterator {
    static String field_d;
    static String[] field_a;
    private int field_c;
    private q field_f;
    private vl field_e;
    private q field_b;

    public static void a(boolean param0) {
        field_a = null;
        field_d = null;
    }

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (nd.field_a != -1) {
                break L1;
              } else {
                if (ad.field_n != -1) {
                  break L1;
                } else {
                  ad.field_n = k.field_e;
                  nd.field_a = n.field_t;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                lp.field_b = lp.field_b + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) wb.field_t)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (wb.field_t != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!jd.field_E) {
                  if (lp.field_b >= um.field_l) {
                    if (lp.field_b < uf.field_g + um.field_l) {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_16_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_16_0 = stackOut_11_0;
                    break L4;
                  }
                } else {
                  stackOut_9_0 = 0;
                  stackIn_16_0 = stackOut_9_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param0 == null) {
                  lp.field_b = 0;
                  break L5;
                } else {
                  if (jd.field_E) {
                    lp.field_b = um.field_l;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      lp.field_b = um.field_l;
                      break L5;
                    } else {
                      lp.field_b = 0;
                      break L5;
                    }
                  }
                }
              }
              ha.field_a = nd.field_a;
              ll.field_i = ad.field_n;
              if (param0 == null) {
                if (var2_int == 0) {
                  break L2;
                } else {
                  jd.field_E = true;
                  break L2;
                }
              } else {
                jd.field_E = false;
                break L2;
              }
            }
            L6: {
              wb.field_t = param0;
              if (jd.field_E) {
                break L6;
              } else {
                if (um.field_l <= lp.field_b) {
                  break L6;
                } else {
                  if (he.field_a) {
                    ll.field_i = ad.field_n;
                    lp.field_b = 0;
                    ha.field_a = nd.field_a;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (!jd.field_E) {
                break L7;
              } else {
                if (fj.field_m != lp.field_b) {
                  break L7;
                } else {
                  jd.field_E = false;
                  lp.field_b = 0;
                  break L7;
                }
              }
            }
            nd.field_a = -1;
            ad.field_n = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("dh.C(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + -1 + ')');
        }
    }

    public final Object next() {
        q var1 = null;
        int var2 = 0;
        var2 = Torquing.field_u;
        if (((dh) this).field_b == ((dh) this).field_e.field_a[-1 + ((dh) this).field_c]) {
          L0: while (true) {
            if (((dh) this).field_c < ((dh) this).field_e.field_e) {
              int fieldTemp$2 = ((dh) this).field_c;
              ((dh) this).field_c = ((dh) this).field_c + 1;
              var1 = ((dh) this).field_e.field_a[fieldTemp$2].field_e;
              if (((dh) this).field_e.field_a[-1 + ((dh) this).field_c] != var1) {
                ((dh) this).field_b = var1.field_e;
                ((dh) this).field_f = var1;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((dh) this).field_b;
          ((dh) this).field_b = var1.field_e;
          ((dh) this).field_f = var1;
          return (Object) (Object) var1;
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Torquing.field_u;
        if (((dh) this).field_e.field_a[-1 + ((dh) this).field_c] == ((dh) this).field_b) {
          L0: while (true) {
            if (((dh) this).field_c < ((dh) this).field_e.field_e) {
              int fieldTemp$1 = ((dh) this).field_c;
              ((dh) this).field_c = ((dh) this).field_c + 1;
              if (((dh) this).field_e.field_a[fieldTemp$1].field_e == ((dh) this).field_e.field_a[((dh) this).field_c + -1]) {
                ((dh) this).field_b = ((dh) this).field_e.field_a[-1 + ((dh) this).field_c];
                continue L0;
              } else {
                ((dh) this).field_b = ((dh) this).field_e.field_a[((dh) this).field_c + -1].field_e;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void remove() {
        if (!(((dh) this).field_f != null)) {
            throw new IllegalStateException();
        }
        ((dh) this).field_f.f(0);
        ((dh) this).field_f = null;
    }

    private final void a() {
        ((dh) this).field_b = ((dh) this).field_e.field_a[0].field_e;
        ((dh) this).field_c = 1;
        ((dh) this).field_f = null;
    }

    dh(vl param0) {
        ((dh) this).field_f = null;
        try {
            ((dh) this).field_e = param0;
            int discarded$0 = 0;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "OK";
    }
}
