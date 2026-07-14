/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gf extends kj {
    static String field_h;
    private eaa field_j;
    static String field_i;
    static int field_l;
    private int field_f;
    private kv[][] field_g;
    static int field_k;

    gf(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ((gf) this).field_j = new eaa();
        ((gf) this).field_f = 300;
        int var4 = aw.field_v.length;
        ((gf) this).field_g = new kv[var4][];
        for (var5 = 0; var5 < var4; var5++) {
            var6 = aw.field_v[var5].length;
            ((gf) this).field_g[var5] = new kv[var6];
            for (var7 = 0; var6 > var7; var7++) {
                ((gf) this).field_g[var5][var7] = aw.field_v[var5][var7].a();
            }
        }
    }

    private final void c(byte param0) {
        int var2 = kla.a(1024, sma.field_I, -2147483648);
        int var3 = kla.a(1024, sma.field_I, -2147483648);
        if (param0 >= -97) {
            ((gf) this).a(114, true, -46);
        }
        int var4 = var3 + var2;
        int var5 = -var3 + var2 >> -434400095;
        int var6 = 200;
        mia var7 = new mia(var4, var6 << 578621636, var5, kla.a(aw.field_v.length, sma.field_I, -2147483648), kla.a(20, sma.field_I, -2147483648) + 5);
        ((gf) this).field_j.a((bw) (Object) var7, true);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((gf) this).a(4, true, -18);
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_i = null;
        if (param0) {
            field_h = null;
        }
    }

    final boolean b(int param0) {
        Object var2 = null;
        int var2_int = 0;
        mia var2_ref = null;
        int var3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var2 = null;
          var3 = BachelorFridge.field_y;
          ((gf) this).field_f = ((gf) this).field_f - 1;
          if (-271 == (((gf) this).field_f ^ -1)) {
            wf.a(14, (byte) 126);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > 21) {
          L1: {
            if (50 >= ((gf) this).field_f) {
              break L1;
            } else {
              if (((gf) this).field_f <= -271) {
                break L1;
              } else {
                L2: {
                  if (-1 != ((gf) this).field_f % 79) {
                    break L2;
                  } else {
                    wf.a(14, (byte) 127);
                    break L2;
                  }
                }
                L3: {
                  if (((gf) this).field_f % 31 != 0) {
                    break L3;
                  } else {
                    wf.a(15, (byte) 24);
                    break L3;
                  }
                }
                if (0 == ((gf) this).field_f % 109) {
                  wf.a(16, (byte) 127);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          L4: {
            if (50 <= ((gf) this).field_f) {
              L5: {
                if ((((gf) this).field_f ^ -1) <= -76) {
                  if (100 > ((gf) this).field_f) {
                    stackOut_22_0 = 15;
                    stackIn_23_0 = stackOut_22_0;
                    break L5;
                  } else {
                    if (((gf) this).field_f >= 150) {
                      stackOut_21_0 = 3;
                      stackIn_23_0 = stackOut_21_0;
                      break L5;
                    } else {
                      stackOut_20_0 = 7;
                      stackIn_23_0 = stackOut_20_0;
                      break L5;
                    }
                  }
                } else {
                  stackOut_17_0 = 31;
                  stackIn_23_0 = stackOut_17_0;
                  break L5;
                }
              }
              var2_int = stackIn_23_0;
              if (0 == (var2_int & ((gf) this).field_f)) {
                this.c((byte) -121);
                break L4;
              } else {
                break L4;
              }
            } else {
              break L4;
            }
          }
          L6: {
            if (-1 != (((gf) this).field_f ^ -1)) {
              break L6;
            } else {
              var2_ref = (mia) (Object) ((gf) this).field_j.b((byte) 90);
              L7: while (true) {
                if (var2_ref == null) {
                  break L6;
                } else {
                  var2_ref.field_m = -(4 + kla.a(8, m.field_a, -2147483648));
                  var2_ref = (mia) (Object) ((gf) this).field_j.c(0);
                  continue L7;
                }
              }
            }
          }
          var2_ref = (mia) (Object) ((gf) this).field_j.b((byte) 90);
          L8: while (true) {
            if (var2_ref == null) {
              L9: {
                L10: {
                  if (-1 >= (((gf) this).field_f ^ -1)) {
                    break L10;
                  } else {
                    if (!((gf) this).field_j.e(12917)) {
                      break L10;
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      break L9;
                    }
                  }
                }
                stackOut_38_0 = 0;
                stackIn_39_0 = stackOut_38_0;
                break L9;
              }
              return stackIn_39_0 != 0;
            } else {
              L11: {
                boolean discarded$1 = var2_ref.b(true);
                if (-1 >= (var2_ref.field_h ^ -1)) {
                  break L11;
                } else {
                  var2_ref.field_k = 0;
                  var2_ref.field_h = 0;
                  break L11;
                }
              }
              var2_ref = (mia) (Object) ((gf) this).field_j.c(0);
              continue L8;
            }
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kv var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = BachelorFridge.field_y;
        if (param1 != 0) {
            this.c((byte) 63);
        }
        mia var4 = (mia) (Object) ((gf) this).field_j.b((byte) 90);
        while (var4 != null) {
            var5 = param2 - -(var4.field_i >> -1724990108);
            var6 = (var4.field_q >> -1691169788) + (-(var4.field_h >> 1408549732) + param0);
            var7 = vr.field_b / var4.field_s % 3;
            var8 = ((gf) this).field_g[var4.field_r][var7];
            var9 = var8.field_n >> 1544719649;
            var10 = var8.field_o >> 737599681;
            var8.c(-(var9 >> 1622739585) + var5, -(var10 >> -144106399) + (var6 - -30), var9, var10, var4.field_o);
            var4 = (mia) (Object) ((gf) this).field_j.c(0);
        }
    }

    final static ema a(long param0, boolean param1) {
        if (param1) {
            field_k = 23;
        }
        return (ema) (Object) iga.field_c.a(param0, (byte) -87);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Playing";
        field_i = "This option cannot be combined with the current settings for:  ";
        field_l = 2;
    }
}
