/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    final static od a(byte param0, hb param1) {
        RuntimeException var2 = null;
        hb var3 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 77) {
            var3 = (hb) null;
            vk.a((byte) -63, (hb) null);
          }
          stackIn_3_0 = ic.a(bb.a(param1, 100, 96), 4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3_ref_byte__;
        byte[] var4;
        byte[] var3_ref_byte__Lifetime1;
        if (param0 == 100 &&
          cc.field_a > 0) {
          fieldTemp$4 = pf.field_a;
          fieldTemp$5 = cc.field_a - 1;
          cc.field_a = cc.field_a - 1;
          var2_ref_byte__ = fieldTemp$4[fieldTemp$5];
          pf.field_a[cc.field_a] = null;
          return var2_ref_byte__;
        }
        var2 = 11 % ((param1 + 3) / 47);
        if (5000 == param0 &&
          th.field_a > 0) {
          fieldTemp$6 = th.field_a - 1;
          th.field_a = th.field_a - 1;
          var3_ref_byte__ = ai.field_e[fieldTemp$6];
          ai.field_e[th.field_a] = null;
          return var3_ref_byte__;
        }
        if (param0 == 30000 &&
          0 < fd.field_f) {
          fieldTemp$7 = fd.field_f - 1;
          fd.field_f = fd.field_f - 1;
          var3_ref_byte__Lifetime1 = dl.field_p[fieldTemp$7];
          dl.field_p[fd.field_f] = null;
          return var3_ref_byte__Lifetime1;
        }
        if (null != lb.field_c) {
          for (var3 = 0; var3 < de.field_b.length; var3++) {
            if (param0 == de.field_b[var3] &&
              pe.field_b[var3] > 0) {
              dupTemp$8 = pe.field_b[var3] - 1;
              arrayValue$9 = lb.field_c[var3];
              pe.field_b[var3] = dupTemp$8;
              var4 = arrayValue$9[dupTemp$8];
              lb.field_c[var3][pe.field_b[var3]] = null;
              return var4;
            }
          }
        }
        return new byte[param0];
    }

    static {
    }
}
