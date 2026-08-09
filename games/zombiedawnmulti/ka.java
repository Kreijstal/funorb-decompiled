/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    int field_o;
    int field_h;
    String field_n;
    String field_e;
    int field_i;
    int[] field_r;
    int field_l;
    String field_g;
    cj field_q;
    int field_j;
    long field_a;
    static ao field_b;
    static String field_c;
    static String field_p;
    boolean field_k;
    static String field_m;
    static int[] field_f;
    static String field_s;
    static int field_t;
    String field_d;

    final int a(boolean param0) {
        if (this.field_k) {
            return 2;
        }
        if (-3 == (this.field_l ^ -1)) {
            if (-1 > (this.field_h ^ -1)) {
                return 2;
            }
            if (!(this.field_a != ie.field_sb)) {
                return 1;
            }
            if (ge.field_zb != 2) {
                if (param0) {
                    return 0;
                }
                field_c = (String) null;
                return 0;
            }
            if (kj.a((byte) -94, this.field_e)) {
                return 1;
            }
            if (param0) {
                return 0;
            }
            field_c = (String) null;
            return 0;
        }
        if (!(this.field_a != ie.field_sb)) {
            return 1;
        }
        if (ge.field_zb == 2 && kj.a((byte) -94, this.field_e)) {
            return 1;
        }
        if (!param0) {
            field_c = (String) null;
            return 0;
        }
        return 0;
    }

    final static void a(int param0, byte param1) {
        int var2 = 83 % ((param1 - -31) / 51);
        nf.field_b = (param0 << -302954576) / 150;
        nf.field_c = param0 * 400 / 150;
        nf.field_a = param0 * 100 / 150;
    }

    public static void a(byte param0) {
        field_m = null;
        field_s = null;
        if (param0 <= 112) {
            return;
        }
        field_f = null;
        field_b = null;
        field_p = null;
        field_c = null;
    }

    final static ri a(int param0, int param1, int param2, ul param3) {
        RuntimeException var4 = null;
        ul var5 = null;
        ri stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ud.a(param2, param3, param1, (byte) -42)) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  var5 = (ul) null;
                  ka.a(-91, -49, -2, (ul) null);
                  break L1;
                }
              }
              stackIn_6_0 = lc.c((byte) 89);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ka.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    ka(boolean param0) {
        L0: {
          L1: {
            this.field_l = wc.field_N;
            this.field_h = of.field_g;
            this.field_g = sn.field_Ib;
            this.field_k = fe.field_R;
            this.field_a = ek.field_K;
            this.field_n = kk.field_s;
            this.field_o = ti.field_W;
            this.field_d = pg.field_b;
            this.field_i = tk.field_m;
            this.field_e = ch.field_h;
            this.field_j = ce.field_r;
            if (param0) {
              break L1;
            } else {
              this.field_r = null;
              if (!ZombieDawnMulti.field_E) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_r = af.field_g;
          break L0;
        }
    }

    ka(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_j = param2;
            this.field_n = param1;
            this.field_a = 0L;
            this.field_k = true;
            this.field_l = param0;
            this.field_r = null;
            this.field_h = 0;
            this.field_g = param3;
            this.field_d = param4;
            this.field_o = 0;
            this.field_e = param1;
            this.field_i = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ka.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new ao(9, 0, 4, 1);
        field_p = "Game full";
        field_c = "Make your creations sing, and the mortals will cower in fear...";
        field_m = "Clan";
        field_s = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_t = 0;
    }
}
