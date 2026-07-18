/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cu extends ana {
    static String field_y;
    private ku field_x;
    private int field_A;
    private int field_w;
    private aj[] field_v;
    static String field_z;

    final boolean c(byte param0) {
        pi var3 = null;
        int var4 = 0;
        aj var5 = null;
        aj var6 = null;
        int fieldTemp$3 = ((cu) this).field_l - 1;
        ((cu) this).field_l = ((cu) this).field_l - 1;
        if (0 > fieldTemp$3) {
          if (~((cu) this).field_w < ~((cu) this).field_A) {
            L0: {
              int fieldTemp$4 = ((cu) this).field_A;
              ((cu) this).field_A = ((cu) this).field_A + 1;
              var5 = ((cu) this).field_v[fieldTemp$4];
              var6 = var5;
              var3 = new pi(((cu) this).field_q, var6.field_c, var6.field_a);
              ((kj) (Object) var3).a(0);
              ((cu) this).field_q.field_h.field_a[var5.field_c][var5.field_a].field_i = false;
              var4 = 75 % ((71 - param0) / 47);
              ((cu) this).field_q.field_s.d(82);
              ((cu) this).field_l = 200 / (((cu) this).field_q.field_h.field_z + ((cu) this).field_q.field_h.field_B);
              if (((cu) this).field_l >= 1) {
                break L0;
              } else {
                ((cu) this).field_l = 1;
                break L0;
              }
            }
            L1: {
              if (((cu) this).field_A == 1) {
                break L1;
              } else {
                if (((cu) this).field_A % (60 / ((cu) this).field_l) == 0) {
                  break L1;
                } else {
                  return false;
                }
              }
            }
            wf.a(19, (byte) -77);
            return false;
          } else {
            int discarded$5 = 19;
            this.e();
            return true;
          }
        } else {
          return false;
        }
    }

    public static void d(int param0) {
        field_y = null;
        field_z = null;
        int var1 = -32;
    }

    private final void e() {
        ((cu) this).field_x.a(((cu) this).field_q.field_h, (byte) -2);
    }

    cu(gj param0, ku param1) {
        super(param0, (bca) (Object) param1);
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        op var8 = null;
        op var9 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            ((cu) this).field_x = param1;
            ((cu) this).field_w = 0;
            var8 = ((cu) this).field_q.field_h;
            var9 = var8;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var9.field_z) {
                ((cu) this).field_A = 0;
                ((cu) this).field_v = new aj[((cu) this).field_w];
                var4 = 0;
                L2: while (true) {
                  if (var4 >= var9.field_z) {
                    var4 = 0;
                    L3: while (true) {
                      if (((cu) this).field_w <= var4) {
                        ((cu) this).field_A = 0;
                        break L0;
                      } else {
                        L4: {
                          var5 = kla.a(((cu) this).field_w, m.field_a, -2147483648);
                          if (var4 == var5) {
                            break L4;
                          } else {
                            var6 = ((cu) this).field_v[var4];
                            ((cu) this).field_v[var4] = ((cu) this).field_v[var5];
                            ((cu) this).field_v[var5] = var6;
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
                          if (!var8.field_a[var4][var5].field_i) {
                            break L6;
                          } else {
                            int fieldTemp$1 = ((cu) this).field_A;
                            ((cu) this).field_A = ((cu) this).field_A + 1;
                            ((cu) this).field_v[fieldTemp$1] = new aj(var4, var5);
                            break L6;
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
                      if (!var8.field_a[var4][var5].field_i) {
                        break L8;
                      } else {
                        ((cu) this).field_w = ((cu) this).field_w + 1;
                        break L8;
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
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("cu.<init>(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_y = "Asking for or providing contact information";
    }
}
