/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ria extends gca {
    private eaa field_j;
    private kv field_l;
    static vr field_i;
    static sna field_k;

    final boolean a(boolean param0, boolean param1) {
        cia var3 = null;
        int var4 = 0;
        int var5 = 0;
        cia stackIn_4_0 = null;
        cia stackIn_5_0 = null;
        cia stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        cia stackIn_26_0 = null;
        cia stackIn_27_0 = null;
        cia stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        cia stackOut_25_0 = null;
        cia stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        cia stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        cia stackOut_3_0 = null;
        cia stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cia stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var5 = BachelorFridge.field_y;
        if (!param0) {
          var3 = (cia) (Object) ((ria) this).field_j.b((byte) 90);
          L0: while (true) {
            if (var3 == null) {
              L1: {
                var4 = vr.field_b & 127;
                if (var4 > 32) {
                  break L1;
                } else {
                  if (0 != (var4 & 15)) {
                    break L1;
                  } else {
                    L2: {
                      this.e((byte) -104);
                      if (((ria) this).field_j.e(12917)) {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        break L2;
                      } else {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        break L2;
                      }
                    }
                    return stackIn_34_0 != 0;
                  }
                }
              }
              L3: {
                if (((ria) this).field_j.e(12917)) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L3;
                } else {
                  stackOut_36_0 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  break L3;
                }
              }
              return stackIn_38_0 != 0;
            } else {
              L4: {
                stackOut_25_0 = (cia) var3;
                stackIn_27_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (param0) {
                  stackOut_27_0 = (cia) (Object) stackIn_27_0;
                  stackOut_27_1 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L4;
                } else {
                  stackOut_26_0 = (cia) (Object) stackIn_26_0;
                  stackOut_26_1 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  break L4;
                }
              }
              boolean discarded$3 = ((cia) (Object) stackIn_28_0).b(stackIn_28_1 != 0);
              var3 = (cia) (Object) ((ria) this).field_j.c(0);
              continue L0;
            }
          }
        } else {
          boolean discarded$4 = ((ria) this).a(true, false);
          var3 = (cia) (Object) ((ria) this).field_j.b((byte) 90);
          L5: while (true) {
            if (var3 == null) {
              var4 = vr.field_b & 127;
              if (var4 <= 32) {
                if (0 == (var4 & 15)) {
                  L6: {
                    this.e((byte) -104);
                    if (((ria) this).field_j.e(12917)) {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      break L6;
                    } else {
                      stackOut_20_0 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      break L6;
                    }
                  }
                  return stackIn_22_0 != 0;
                } else {
                  L7: {
                    if (((ria) this).field_j.e(12917)) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L7;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L7;
                    }
                  }
                  return stackIn_17_0 != 0;
                }
              } else {
                L8: {
                  if (((ria) this).field_j.e(12917)) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L8;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L8;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              L9: {
                stackOut_3_0 = (cia) var3;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param0) {
                  stackOut_5_0 = (cia) (Object) stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L9;
                } else {
                  stackOut_4_0 = (cia) (Object) stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L9;
                }
              }
              boolean discarded$5 = ((cia) (Object) stackIn_6_0).b(stackIn_6_1 != 0);
              var3 = (cia) (Object) ((ria) this).field_j.c(0);
              continue L5;
            }
          }
        }
    }

    public ria() {
        super(29);
        ((ria) this).field_j = new eaa();
        ((ria) this).field_l = ff.field_u.a();
    }

    public static void a() {
        field_i = null;
        field_k = null;
    }

    private final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        cia var4 = null;
        var2 = kla.a(256, vd.field_z, -2147483648);
        if (param0 >= -80) {
          return;
        } else {
          var3 = kla.a(1024, vd.field_z, -2147483648);
          var4 = new cia(var2, 0, var3);
          var4.a(119, 128, -2);
          var4.a(0, -15, 0, 0);
          var4.a(-120, 0);
          ((ria) this).field_j.a((bw) (Object) var4, true);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        cia var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        param0 -= 80;
        param2 += 12;
        var4 = (cia) (Object) ((ria) this).field_j.b((byte) 90);
        L0: while (true) {
          if (var4 == null) {
            if (param1 <= 7) {
              this.e((byte) -11);
              return;
            } else {
              return;
            }
          } else {
            var5 = 256 - (var4.field_o << 1);
            var6 = ((ria) this).field_l.field_n * var5 >> 8;
            var7 = var5 * ((ria) this).field_l.field_o >> 8;
            ((ria) this).field_l.c((var4.field_i >> 4) + param2 + -(var6 >> 1), (var4.field_h >> 9) + param0 - (-(var4.field_q >> 5) - -(var7 >> 1)), var6, var7, var4.field_o);
            var4 = (cia) (Object) ((ria) this).field_j.c(0);
            continue L0;
          }
        }
    }

    static {
    }
}
