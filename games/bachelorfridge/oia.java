/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oia extends kj {
    private int field_h;
    private eaa field_g;
    static long field_f;
    static String field_i;

    final boolean b(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        rea stackIn_14_0;
        rea stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        rea stackIn_15_0;
        rea stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        int stackIn_15_5;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rea var9;
        int var10;
        var10 = BachelorFridge.field_y;
        if (param0 > 21) {
          fieldTemp$0 = this.field_h - 2;
          this.field_h = this.field_h - 2;
          if (0 == fieldTemp$0) {
            return true;
          } else {
            L0: {
              if (-127 <= (this.field_h ^ -1)) {
                var2 = this.field_h;
                var2 += 16;
                var3 = 0;
                L1: while (true) {
                  if ((var3 ^ -1) <= -33) {
                    break L0;
                  } else {
                    L2: {
                      var4 = kla.a(this.field_h, this.field_e.field_h.field_w, -2147483648) - (this.field_h >> -794847263);
                      stackIn_11_0 = (this.field_h >> 1210346978) - Math.abs(var4) / 2;

                      if ((kla.a(2, this.field_e.field_h.field_w, -2147483648) ^ -1) >= -1) {
                        stackIn_12_0 = stackIn_11_0;
                        stackIn_12_1 = -1;
                        break L2;
                      } else {
                        stackIn_12_0 = stackIn_11_0;
                        stackIn_12_1 = 1;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = stackIn_12_0 * stackIn_12_1;
                      kla.a(50, this.field_e.field_h.field_w, -2147483648);
                      var6 = var4 - -64;
                      var7 = var5 + 32;
                      var8 = (int)(Math.sin(300.0 * (double)var2) * 100.0) * 0;
                      stackIn_14_0 = null;

                      stackIn_14_1 = null;

                      stackIn_14_2 = var6;

                      stackIn_14_3 = var8;

                      stackIn_14_4 = var7;

                      if (5 <= kla.a(20, this.field_e.field_h.field_w, -2147483648)) {
                        stackIn_15_0 = null;
                        stackIn_15_1 = null;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = stackIn_14_3;
                        stackIn_15_4 = stackIn_14_4;
                        stackIn_15_5 = 16711680;
                        break L3;
                      } else {
                        stackIn_15_0 = null;
                        stackIn_15_1 = null;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = stackIn_14_3;
                        stackIn_15_4 = stackIn_14_4;
                        stackIn_15_5 = 16631867;
                        break L3;
                      }
                    }
                    var9 = new rea(stackIn_15_2, stackIn_15_3, stackIn_15_4, stackIn_15_5);
                    kla.a(3, this.field_e.field_h.field_w, -2147483648);
                    kla.a(5000, this.field_e.field_h.field_w, -2147483648);
                    var9.field_o = (double)(-1 + -kla.a(2, this.field_e.field_h.field_w, -2147483648));
                    var9.field_n = 25 + -kla.a(10, this.field_e.field_h.field_w, -2147483648);
                    var9.field_h = -1;
                    this.field_g.a(var9, true);
                    var3++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
            aga.a(this.field_e.field_h.field_w, true, this.field_g, this.field_h);
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.field_g = (eaa) null;
        }
    }

    final void a(int param0, int param1, int param2) {
        baa.a(this.field_g, true, 65280, param2, param0, 10);
        if (param1 != 0) {
            oia.c(85);
        }
    }

    oia(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            this.field_h = 128;
            this.field_g = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "oia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        field_i = null;
        int var1 = 50 / ((param0 - 13) / 37);
    }

    static {
        field_i = "Game full";
    }
}
