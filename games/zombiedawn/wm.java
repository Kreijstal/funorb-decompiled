/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wm implements Iterable {
    le[] field_c;
    private le field_a;
    static int field_e;
    static int field_d;
    int field_f;
    static int field_b;

    final le a(boolean param0, long param1) {
        int discarded$2 = 0;
        le var4 = null;
        le var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var4 = this.field_c[(int)((long)(-1 + this.field_f) & param1)];
        this.field_a = var4.field_b;
        L0: while (true) {
          if (var4 == this.field_a) {
            if (param0) {
              discarded$2 = wm.a(17, (byte) 50);
              this.field_a = null;
              return null;
            } else {
              this.field_a = null;
              return null;
            }
          } else {
            if (this.field_a.field_f != param1) {
              this.field_a = this.field_a.field_b;
              continue L0;
            } else {
              var5 = this.field_a;
              this.field_a = this.field_a.field_b;
              return var5;
            }
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 41 / ((-39 - param1) / 56);
        var3 = 0;
        if (-1 >= (param0 ^ -1)) {
          if ((param0 ^ -1) <= -65537) {
            L0: {
              param0 = param0 >>> 16;
              var3 += 16;
              if (-257 < (param0 ^ -1)) {
                break L0;
              } else {
                param0 = param0 >>> 8;
                var3 += 8;
                break L0;
              }
            }
            L1: {
              if ((param0 ^ -1) <= -17) {
                param0 = param0 >>> 4;
                var3 += 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (4 <= param0) {
                param0 = param0 >>> 2;
                var3 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param0 ^ -1) <= -2) {
                var3++;
                param0 = param0 >>> 1;
                break L3;
              } else {
                break L3;
              }
            }
            return var3 - -param0;
          } else {
            L4: {
              if (-257 < (param0 ^ -1)) {
                break L4;
              } else {
                param0 = param0 >>> 8;
                var3 += 8;
                break L4;
              }
            }
            L5: {
              if ((param0 ^ -1) <= -17) {
                param0 = param0 >>> 4;
                var3 += 4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (4 <= param0) {
                param0 = param0 >>> 2;
                var3 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param0 ^ -1) <= -2) {
                var3++;
                param0 = param0 >>> 1;
                break L7;
              } else {
                break L7;
              }
            }
            return var3 - -param0;
          }
        } else {
          L8: {
            param0 = param0 >>> 16;
            var3 += 16;
            if (-257 < (param0 ^ -1)) {
              break L8;
            } else {
              param0 = param0 >>> 8;
              var3 += 8;
              break L8;
            }
          }
          L9: {
            if ((param0 ^ -1) <= -17) {
              param0 = param0 >>> 4;
              var3 += 4;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (4 <= param0) {
              param0 = param0 >>> 2;
              var3 += 2;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if ((param0 ^ -1) <= -2) {
              var3++;
              param0 = param0 >>> 1;
              break L11;
            } else {
              break L11;
            }
          }
          return var3 - -param0;
        }
    }

    final static hn a(int param0, gi param1) {
        RuntimeException var2 = null;
        hn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        hn stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 96) {
                break L1;
              } else {
                field_b = 21;
                break L1;
              }
            }
            stackOut_2_0 = aa.a(106, fn.a(param1, 100, 96));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("wm.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new hl((wm) (this)));
    }

    final void a(long param0, boolean param1, le param2) {
        le var5 = null;
        Iterator discarded$0 = null;
        try {
            if (null != param2.field_d) {
                param2.b(-27598);
            }
            var5 = this.field_c[(int)((long)(this.field_f - 1) & param0)];
            param2.field_b = var5;
            if (!param1) {
                discarded$0 = this.iterator();
            }
            param2.field_d = var5.field_d;
            param2.field_d.field_b = param2;
            param2.field_f = param0;
            param2.field_b.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "wm.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        field_e = 0;
        field_b = -1;
    }
}
