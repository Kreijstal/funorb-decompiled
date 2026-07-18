/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends at {
    private gj field_j;
    static String field_n;
    private int field_o;
    private int field_q;
    static int field_k;
    private aj[] field_m;
    static gu[] field_l;
    private int field_p;

    public static void d(byte param0) {
        field_n = null;
        field_l = null;
        int var1 = 17;
    }

    private final void b(boolean param0) {
    }

    final boolean c(byte param0) {
        uea var3 = null;
        int var4 = 0;
        aj var5 = null;
        aj var6 = null;
        int fieldTemp$4 = ((mi) this).field_q - 1;
        ((mi) this).field_q = ((mi) this).field_q - 1;
        if (0 <= fieldTemp$4) {
          return false;
        } else {
          if (((mi) this).field_p <= ((mi) this).field_o) {
            this.b(false);
            return true;
          } else {
            L0: {
              int fieldTemp$5 = ((mi) this).field_o;
              ((mi) this).field_o = ((mi) this).field_o + 1;
              var5 = ((mi) this).field_m[fieldTemp$5];
              var6 = var5;
              var3 = new uea(((mi) this).field_j, var6.field_c, var6.field_a, 16777215);
              ((kj) (Object) var3).a(0);
              ((mi) this).field_j.field_h.field_a[var5.field_c][var5.field_a].field_i = true;
              ((mi) this).field_j.field_s.d(74);
              var4 = -120 / ((71 - param0) / 47);
              ((mi) this).field_q = 200 / (((mi) this).field_j.field_h.field_B + ((mi) this).field_j.field_h.field_z);
              if (1 > ((mi) this).field_q) {
                ((mi) this).field_q = 1;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (((mi) this).field_o == 1) {
                wf.a(19, (byte) 126);
                break L1;
              } else {
                if (0 != ((mi) this).field_o % (100 / ((mi) this).field_q)) {
                  break L1;
                } else {
                  wf.a(19, (byte) 126);
                  break L1;
                }
              }
            }
            return false;
          }
        }
    }

    mi(gj param0, bja param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        op var8 = null;
        op var9 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            ((mi) this).field_j = param0;
            var8 = ((mi) this).field_j.field_h;
            var9 = var8;
            ((mi) this).field_p = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var9.field_z) {
                ((mi) this).field_m = new aj[((mi) this).field_p];
                ((mi) this).field_o = 0;
                var4 = 0;
                L2: while (true) {
                  if (var9.field_z <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ((mi) this).field_p) {
                        ((mi) this).field_o = 0;
                        break L0;
                      } else {
                        L4: {
                          var5 = kla.a(((mi) this).field_p, m.field_a, -2147483648);
                          if (var5 == var4) {
                            break L4;
                          } else {
                            var6 = ((mi) this).field_m[var4];
                            ((mi) this).field_m[var4] = ((mi) this).field_m[var5];
                            ((mi) this).field_m[var5] = var6;
                            break L4;
                          }
                        }
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var9.field_B) {
                        var4++;
                        continue L2;
                      } else {
                        L6: {
                          if (var8.field_a[var4][var5].field_i) {
                            break L6;
                          } else {
                            if (1 != var8.field_L.field_o[var4][var5].field_n) {
                              break L6;
                            } else {
                              int fieldTemp$1 = ((mi) this).field_o;
                              ((mi) this).field_o = ((mi) this).field_o + 1;
                              ((mi) this).field_m[fieldTemp$1] = new aj(var4, var5);
                              break L6;
                            }
                          }
                        }
                        var5++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L7: while (true) {
                  if (var5 >= var9.field_B) {
                    var4++;
                    continue L1;
                  } else {
                    L8: {
                      if (var8.field_a[var4][var5].field_i) {
                        break L8;
                      } else {
                        if (var8.field_L.field_o[var4][var5].field_n != 1) {
                          break L8;
                        } else {
                          ((mi) this).field_p = ((mi) this).field_p + 1;
                          break L8;
                        }
                      }
                    }
                    var5++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("mi.<init>(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_k = 480;
        field_n = "If you are not, please change your password to something more obscure!";
        field_l = new gu[255];
        for (var0 = 0; field_l.length > var0; var0++) {
            field_l[var0] = new gu();
        }
    }
}
