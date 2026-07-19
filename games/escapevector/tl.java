/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends wg {
    static int field_l;
    hl field_k;
    volatile int field_r;
    volatile int field_s;
    private int field_m;
    volatile int field_n;
    private boolean field_o;
    hl field_q;
    volatile int field_p;
    static String[] field_t;

    final int a() {
        return 0;
    }

    final wg c() {
        this.field_o = true;
        return (wg) ((Object) this.field_k);
    }

    final wg b() {
        if (!(!this.field_o)) {
            this.field_o = false;
            return (wg) ((Object) this.field_q);
        }
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int var5 = EscapeVector.field_A;
        try {
            while (param2 > this.field_m) {
                this.field_k.a(param0, param1, this.field_m);
                this.field_q.a(param0, param1, this.field_m);
                param1 = param1 + this.field_m;
                param2 = param2 - this.field_m;
                this.e(117);
            }
            this.field_k.a(param0, param1, param2);
            this.field_q.a(param0, param1, param2);
            this.field_m = this.field_m - param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "tl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = this.field_p;
        if (0 == var2) {
          L0: {
            this.field_r = 0;
            if ((this.field_r & 65536) == 0) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = this.field_s;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          var3 = stackIn_11_0;
          var4 = this.field_n;
          this.field_k.a(ie.field_q / 200, var3, var4);
          this.field_q.a(ie.field_q / 200, var3 >> -1534028894, var4);
          if (param0 < 96) {
            return;
          } else {
            this.field_m = ie.field_q / 100;
            return;
          }
        } else {
          L1: {
            this.field_r = this.field_r - var2;
            if ((this.field_r & 65536) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = this.field_s;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          var4 = this.field_n;
          this.field_k.a(ie.field_q / 200, var3, var4);
          this.field_q.a(ie.field_q / 200, var3 >> -1534028894, var4);
          if (param0 < 96) {
            return;
          } else {
            this.field_m = ie.field_q / 100;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_t = null;
        if (param0 != -43) {
            tl.a((byte) -61);
        }
    }

    final void d(int param0) {
        int var3 = EscapeVector.field_A;
        while (param0 > this.field_m) {
            this.field_k.d(this.field_m);
            this.field_q.d(this.field_m);
            param0 = param0 - this.field_m;
            this.e(122);
        }
        this.field_k.d(param0);
        this.field_q.d(param0);
        this.field_m = this.field_m - param0;
    }

    tl() {
    }

    static {
        field_t = new String[]{"Outstanding work, commander. You have proved yourself marvellously skilled, able to infiltrate the most heavily guarded caves, quick-thinking in moments of peril... Truly admirable.", "Now it is time to visit the aliens' home world. This is a planet, so gravity will be higher. We have no idea what to expect, but stay alert."};
    }
}
