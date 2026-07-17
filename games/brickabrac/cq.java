/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cq extends nm {
    String[][] field_r;
    int field_s;
    static String field_i;
    int field_n;
    static String field_q;
    int field_l;
    boolean field_v;
    static int field_t;
    int field_j;
    int[][] field_u;
    static jp field_o;
    static int field_p;
    int field_m;
    int field_k;

    public static void a() {
        field_q = null;
        field_o = null;
        field_i = null;
    }

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (param0 < 0) {
          if (0 != var2) {
            if (var2 >= 128) {
              if (var2 >= 160) {
                return (char)var2;
              } else {
                L0: {
                  var3 = ai.field_r[-128 + var2];
                  if (var3 != 0) {
                    break L0;
                  } else {
                    var3 = 63;
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          return '￪';
        }
    }

    final static void a(boolean param0, byte param1) {
        if (!(null == ep.field_e)) {
            pg.a(false, ep.field_e);
        }
        if (!(bm.field_d == null)) {
            bm.field_d.a((byte) -126, param0);
        }
        de.a(param0, false);
        if (!(null == no.field_p)) {
            no.field_p.a(true, param0);
        }
        int discarded$0 = 1;
        eh.a(param0);
    }

    final static void a(int param0, boolean param1, int param2, oi param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        String[] stackIn_1_0 = null;
        String[] stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        String[] stackIn_2_0 = null;
        String[] stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        String[] stackIn_3_0 = null;
        String[] stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        String stackIn_3_3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_0_0 = null;
        String[] stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        String[] stackOut_2_0 = null;
        String[] stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        String stackOut_2_3 = null;
        String[] stackOut_1_0 = null;
        String[] stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        String stackOut_1_3 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = new String[1];
              stackOut_0_1 = new String[1];
              stackOut_0_2 = 0;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (tb.field_cb == null) {
                stackOut_2_0 = (String[]) (Object) stackIn_2_0;
                stackOut_2_1 = (String[]) (Object) stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = we.field_c;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                break L1;
              } else {
                stackOut_1_0 = (String[]) (Object) stackIn_1_0;
                stackOut_1_1 = (String[]) (Object) stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = tb.field_cb;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                break L1;
              }
            }
            L2: {
              stackIn_3_1[stackIn_3_2] = stackIn_3_3;
              var4 = stackIn_3_0;
              od.field_c = 13;
              fp.field_z = 57;
              og.field_Wb = 3;
              ep.field_i = 23;
              hg.field_e = 51550 + (hi.field_w.b(92) << 16);
              tm.field_g = 11;
              qm.field_a = 40;
              ek.field_kb = 72;
              int discarded$4 = 66;
              ck.a();
              r.field_A = be.field_a;
              if (!r.field_A) {
                hd.a(true);
                pi.field_q = jj.field_d;
                break L2;
              } else {
                if (param3.field_b.field_h != 0) {
                  hd.a(true);
                  pi.field_q = jj.field_d;
                  break L2;
                } else {
                  if (param2 <= 0) {
                    break L2;
                  } else {
                    hd.a(true);
                    pi.field_q = jj.field_d;
                    break L2;
                  }
                }
              }
            }
            oa.field_Sb = rd.a(param3.field_b.field_c[param2].field_l, (byte) 19);
            int discarded$5 = -12665;
            sk.a(var4, param2, param3, 1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("cq.C(").append(16727).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    cq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Kick <%0> from this game";
        field_i = "Names can only contain letters, numbers, spaces and underscores";
    }
}
