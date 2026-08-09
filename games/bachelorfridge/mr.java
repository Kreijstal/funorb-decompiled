/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr extends kj {
    static kv field_f;
    private ns field_i;
    static String field_h;
    private int field_g;

    mr(gj param0, ns param1, int param2, int param3) {
        super(param0, param2, param3);
        try {
            this.field_i = param1;
            this.field_g = -25;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_h = null;
    }

    final void a(int param0, boolean param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int var4;
        int var5;
        ee var6;
        int var7;
        int var8;
        L0: {
          var8 = BachelorFridge.field_y;
          if ((this.field_g ^ -1) > -1) {
            stackIn_5_0 = this.field_g * -20;
            break L0;
          } else {
            if (this.field_g <= 30) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 16 * this.field_g + -480;
              break L0;
            }
          }
        }
        L1: {
          var4 = stackIn_5_0;
          if (-1 < (this.field_g ^ -1)) {
            stackIn_10_0 = 0;
            break L1;
          } else {
            if ((this.field_g ^ -1) <= -16) {
              stackIn_10_0 = 2;
              break L1;
            } else {
              stackIn_10_0 = 1;
              break L1;
            }
          }
        }
        var5 = stackIn_10_0;
        var6 = ou.field_d[var5];
        var7 = 64 + (param0 - var4) + -var6.field_b;
        var6.a(param2, var7);
        if (!param1) {
          field_f = (kv) null;
          L2: while (true) {
            if ((var7 ^ -1) < -1) {
              var7 -= 64;
              vi.field_f.a(param2, var7);
              continue L2;
            } else {
              return;
            }
          }
        } else {
          L3: while (true) {
            if ((var7 ^ -1) < -1) {
              var7 -= 64;
              vi.field_f.a(param2, var7);
              continue L3;
            } else {
              return;
            }
          }
        }
    }

    final boolean b(int param0) {
        int fieldTemp$1 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$1 < 65) {
          L0: {
            if (-36 == (this.field_g ^ -1)) {
              wf.a(44, (byte) 20);
              this.field_e.a(this.field_c, false, this.field_d).field_j = 0;
              this.field_i.a(false, this.field_e.field_h);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 < 21) {
            return false;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
        field_h = "Checking";
    }
}
