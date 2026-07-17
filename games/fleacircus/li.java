/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li implements Iterable {
    static int field_i;
    static String field_e;
    static String field_d;
    lh[] field_f;
    private lh field_a;
    static String field_c;
    static String field_b;
    int field_g;
    static int field_j;
    static String field_h;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -62) {
            return;
        }
        field_d = null;
        field_h = null;
        field_c = null;
        field_b = null;
    }

    final void a(long param0, lh param1, byte param2) {
        lh var5 = null;
        try {
            if (param2 != 43) {
                li.a((byte) -31);
            }
            if (!(null == param1.field_a)) {
                param1.c(param2 ^ -44);
            }
            var5 = ((li) this).field_f[(int)((long)(((li) this).field_g - 1) & param0)];
            param1.field_a = var5.field_a;
            param1.field_h = var5;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
            param1.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "li.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        if (wc.field_q <= 0) {
          if (!qh.c((byte) 71)) {
            var2 = 1;
            if (null == aa.field_r) {
              if (!sc.field_a) {
                return;
              } else {
                pf.a(var2, 1, param0);
                return;
              }
            } else {
              return;
            }
          } else {
            var2 = 0;
            if (null == aa.field_r) {
              if (!sc.field_a) {
                return;
              } else {
                pf.a(var2, 1, param0);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (aa.field_r == null) {
            rh.field_p = wf.a(0, 640, 0, fg.field_q, 0, 480);
            if (rh.field_p == null) {
              var2 = 3;
              if (null != aa.field_r) {
                return;
              } else {
                L0: {
                  if (sc.field_a) {
                    pf.a(var2, 1, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              }
            } else {
              var2 = 2;
              aj.a(0, (java.awt.Canvas) (Object) rh.field_p);
              if (null != aa.field_r) {
                return;
              } else {
                L1: {
                  if (sc.field_a) {
                    pf.a(var2, 1, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            rh.field_p = aa.field_r.b(-7936);
            qa.a((byte) 116, 2);
            if (rh.field_p == null) {
              var2 = 3;
              if (null != aa.field_r) {
                return;
              } else {
                L2: {
                  if (sc.field_a) {
                    pf.a(var2, 1, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              var2 = 2;
              aj.a(0, (java.awt.Canvas) (Object) rh.field_p);
              if (null != aa.field_r) {
                return;
              } else {
                L3: {
                  if (sc.field_a) {
                    pf.a(var2, 1, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          }
        }
    }

    private li() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new na((li) this);
    }

    final lh a(boolean param0, long param1) {
        lh var4 = null;
        lh var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        if (param0) {
          var4 = ((li) this).field_f[(int)(param1 & (long)(((li) this).field_g + -1))];
          ((li) this).field_a = var4.field_h;
          L0: while (true) {
            if (var4 != ((li) this).field_a) {
              if (((li) this).field_a.field_c == param1) {
                var5 = ((li) this).field_a;
                ((li) this).field_a = ((li) this).field_a.field_h;
                return var5;
              } else {
                ((li) this).field_a = ((li) this).field_a.field_h;
                continue L0;
              }
            } else {
              ((li) this).field_a = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "FULL ACCESS";
        field_e = "Loading graphics";
        field_h = "Waiting for extra data";
        field_j = 2;
    }
}
