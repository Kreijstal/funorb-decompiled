/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb {
    int field_e;
    String[] field_q;
    static ji field_k;
    int field_l;
    lk[] field_p;
    int field_o;
    int field_i;
    boolean field_j;
    static String field_n;
    int[] field_f;
    int field_a;
    int field_d;
    static String field_g;
    int field_h;
    static String field_r;
    int field_m;
    static String field_c;
    int field_b;

    final int d(int param0) {
        int var2 = 0;
        if (param0 != 6) {
          L0: {
            this.field_p = (lk[]) null;
            var2 = 2;
            if (3 <= this.field_m) {
              var2 = 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((this.field_m ^ -1) <= -5) {
              var2 = 6;
              break L1;
            } else {
              break L1;
            }
          }
          return ka.a((byte) 81, var2, tf.field_cb) + 24;
        } else {
          L2: {
            var2 = 2;
            if (3 <= this.field_m) {
              var2 = 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((this.field_m ^ -1) <= -5) {
              var2 = 6;
              break L3;
            } else {
              break L3;
            }
          }
          return ka.a((byte) 81, var2, tf.field_cb) + 24;
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_n = null;
        if (param0 != 92) {
          field_n = (String) null;
          field_r = null;
          field_c = null;
          field_k = null;
          return;
        } else {
          field_r = null;
          field_c = null;
          field_k = null;
          return;
        }
    }

    final static void c(int param0) {
        be.field_w[93] = 43;
        be.field_w[59] = 57;
        be.field_w[45] = 26;
        be.field_w[46] = 72;
        be.field_w[61] = 27;
        be.field_w[92] = 74;
        int var1 = 118 % ((param0 - 62) / 56);
        be.field_w[520] = 59;
        be.field_w[192] = 28;
        be.field_w[222] = 58;
        be.field_w[47] = 73;
        be.field_w[91] = 42;
        be.field_w[44] = 71;
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var5 = 0;
        lk var6 = null;
        lk var7 = null;
        lk var8 = null;
        var5 = client.field_A ? 1 : 0;
        if (param1 <= -49) {
          this.field_e = param0;
          this.field_j = true;
          var3 = 0;
          L0: while (true) {
            if (var3 < this.field_b) {
              var6 = this.field_p[var3];
              var7 = var6;
              var8 = var7;
              var7 = var6;
              if (var5 == 0) {
                L1: {
                  if (var6 == null) {
                    break L1;
                  } else {
                    var6.k(-9897);
                    break L1;
                  }
                }
                var3++;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_h = 43;
          this.field_e = param0;
          this.field_j = true;
          var3 = 0;
          L2: while (true) {
            if (var3 < this.field_b) {
              var7 = this.field_p[var3];
              var8 = var7;
              var8 = var7;
              if (var5 == 0) {
                L3: {
                  if (var7 == null) {
                    break L3;
                  } else {
                    var7.k(-9897);
                    break L3;
                  }
                }
                var3++;
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0) {
        j.a(8225);
        if (param0 != 58) {
            eb.b(-112);
        }
    }

    eb(int param0, boolean param1, int param2, int param3, int param4, int param5, String[] param6) {
        RuntimeException runtimeException = null;
        int var8_int = 0;
        int var9 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_l = param0;
              this.field_m = param5;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param6 == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = param6.length;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((eb) (this)).field_b = stackIn_4_1;
            this.field_f = new int[this.field_b];
            this.field_o = 0;
            this.field_q = param6;
            this.field_p = new lk[this.field_b];
            var8_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (this.field_b <= var8_int) {
                    break L4;
                  } else {
                    this.field_p[var8_int] = new lk(param1, param2, param3, param4, this.field_m);
                    this.field_p[var8_int].field_Q = var8_int;
                    this.field_f[var8_int] = -1;
                    var8_int++;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_i = this.field_b;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("eb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_g = "You need to play <%0> more rated games to unlock this option.";
        field_r = "Quick Chat game";
        field_c = "SPEED UP!";
    }
}
