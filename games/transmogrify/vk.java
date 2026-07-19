/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    final static od a(byte param0, hb param1) {
        od discarded$2 = null;
        RuntimeException var2 = null;
        hb var3 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_2_0 = null;
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
              if (param0 > 77) {
                break L1;
              } else {
                var3 = (hb) null;
                discarded$2 = vk.a((byte) -63, (hb) null);
                break L1;
              }
            }
            stackOut_2_0 = ic.a(bb.a(param1, 100, 96), 4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("vk.A(").append(param0).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[][] fieldTemp$8 = null;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        byte[] var4 = null;
        L0: {
          if (param0 != 100) {
            break L0;
          } else {
            if (-1 <= (cc.field_a ^ -1)) {
              break L0;
            } else {
              fieldTemp$8 = pf.field_a;
              fieldTemp$9 = cc.field_a - 1;
              cc.field_a = cc.field_a - 1;
              var2_ref_byte__ = fieldTemp$8[fieldTemp$9];
              pf.field_a[cc.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        L1: {
          var2 = 11 % ((param1 - -3) / 47);
          if (5000 != param0) {
            break L1;
          } else {
            if (th.field_a <= 0) {
              break L1;
            } else {
              fieldTemp$10 = th.field_a - 1;
              th.field_a = th.field_a - 1;
              var3_ref_byte__ = ai.field_e[fieldTemp$10];
              ai.field_e[th.field_a] = null;
              return var3_ref_byte__;
            }
          }
        }
        L2: {
          if (param0 != 30000) {
            break L2;
          } else {
            if (0 >= fd.field_f) {
              break L2;
            } else {
              fieldTemp$11 = fd.field_f - 1;
              fd.field_f = fd.field_f - 1;
              var3_ref_byte__ = dl.field_p[fieldTemp$11];
              dl.field_p[fd.field_f] = null;
              return var3_ref_byte__;
            }
          }
        }
        L3: {
          if (null != lb.field_c) {
            var3 = 0;
            L4: while (true) {
              if (var3 >= de.field_b.length) {
                break L3;
              } else {
                if (param0 == de.field_b[var3]) {
                  if (pe.field_b[var3] > 0) {
                    pe.field_b[var3] = pe.field_b[var3] - 1;
                    var4 = lb.field_c[var3][pe.field_b[var3] - 1];
                    lb.field_c[var3][pe.field_b[var3]] = null;
                    return var4;
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        return new byte[param0];
    }

    static {
    }
}
