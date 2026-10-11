/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    final synchronized static byte[] a(byte param0, int param1) {
        byte[][] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        int fieldTemp$8 = 0;
        byte[][] fieldTemp$9 = null;
        int fieldTemp$10 = 0;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        byte[][] fieldTemp$24 = null;
        int fieldTemp$25 = 0;
        byte[][] fieldTemp$20 = null;
        int fieldTemp$21 = 0;
        int dupTemp$22 = 0;
        byte[][] arrayValue$23 = null;
        int fieldTemp$13 = 0;
        int dupTemp$18 = 0;
        byte[][] arrayValue$19 = null;
        byte[][] fieldTemp$16 = null;
        int fieldTemp$17 = 0;
        int dupTemp$14 = 0;
        byte[][] arrayValue$15 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3_ref_byte__;
        int var3;
        byte[] var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var2Lifetime3;
        int var3Lifetime4;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var3_ref_byte__Lifetime1;
        byte[] var3_ref_byte__Lifetime2;
        byte[] var4Lifetime1;
        byte[] var4Lifetime2;
        byte[] var4Lifetime3;
        byte[] var3_ref_byte__Lifetime3;
        byte[] var4Lifetime4;
        if (param1 != 100) {
          if (param1 != 5000) {
            var2 = -83 % ((-16 - param0) / 34);
            if (param1 == 30000 &&
              ff.field_b > 0) {
              fieldTemp$4 = qa.field_b;
              fieldTemp$5 = ff.field_b - 1;
              ff.field_b = ff.field_b - 1;
              var3_ref_byte__ = fieldTemp$4[fieldTemp$5];
              qa.field_b[ff.field_b] = null;
              return var3_ref_byte__;
            }
            if (dk.field_d == null) {
              return new byte[param1];
            }
            for (var3 = 0; qe.field_a.length > var3; var3++) {
              if (param1 == qe.field_a[var3] &&
                qk.field_a[var3] > 0) {
                dupTemp$6 = qk.field_a[var3] - 1;
                arrayValue$7 = dk.field_d[var3];
                qk.field_a[var3] = dupTemp$6;
                var4 = arrayValue$7[dupTemp$6];
                dk.field_d[var3][qk.field_a[var3]] = null;
                return var4;
              }
            }
            return new byte[param1];
          }
          if (qg.field_f > 0) {
            fieldTemp$8 = qg.field_f - 1;
            qg.field_f = qg.field_f - 1;
            var2_ref_byte__ = tm.field_u[fieldTemp$8];
            tm.field_u[qg.field_f] = null;
            return var2_ref_byte__;
          }
          var2Lifetime3 = -83 % ((-16 - param0) / 34);
          if (param1 == 30000 &&
            ff.field_b > 0) {
            fieldTemp$9 = qa.field_b;
            fieldTemp$10 = ff.field_b - 1;
            ff.field_b = ff.field_b - 1;
            var3_ref_byte__Lifetime3 = fieldTemp$9[fieldTemp$10];
            qa.field_b[ff.field_b] = null;
            return var3_ref_byte__Lifetime3;
          }
          if (dk.field_d == null) {
            return new byte[param1];
          }
          for (var3Lifetime4 = 0; qe.field_a.length > var3Lifetime4; var3Lifetime4++) {
            if (param1 == qe.field_a[var3Lifetime4] &&
              qk.field_a[var3Lifetime4] > 0) {
              dupTemp$11 = qk.field_a[var3Lifetime4] - 1;
              arrayValue$12 = dk.field_d[var3Lifetime4];
              qk.field_a[var3Lifetime4] = dupTemp$11;
              var4Lifetime4 = arrayValue$12[dupTemp$11];
              dk.field_d[var3Lifetime4][qk.field_a[var3Lifetime4]] = null;
              return var4Lifetime4;
            }
          }
          return new byte[param1];
        }
        if (qh.field_e > 0) {
          fieldTemp$24 = oe.field_e;
          fieldTemp$25 = qh.field_e - 1;
          qh.field_e = qh.field_e - 1;
          var2_ref_byte__Lifetime1 = fieldTemp$24[fieldTemp$25];
          oe.field_e[qh.field_e] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 != 5000) {
          var2Lifetime1 = -83 % ((-16 - param0) / 34);
          if (param1 == 30000 &&
            ff.field_b > 0) {
            fieldTemp$20 = qa.field_b;
            fieldTemp$21 = ff.field_b - 1;
            ff.field_b = ff.field_b - 1;
            var3_ref_byte__Lifetime1 = fieldTemp$20[fieldTemp$21];
            qa.field_b[ff.field_b] = null;
            return var3_ref_byte__Lifetime1;
          }
          if (dk.field_d == null) {
            return new byte[param1];
          }
          for (var3Lifetime1 = 0; qe.field_a.length > var3Lifetime1; var3Lifetime1++) {
            if (param1 == qe.field_a[var3Lifetime1] &&
              qk.field_a[var3Lifetime1] > 0) {
              dupTemp$22 = qk.field_a[var3Lifetime1] - 1;
              arrayValue$23 = dk.field_d[var3Lifetime1];
              qk.field_a[var3Lifetime1] = dupTemp$22;
              var4Lifetime1 = arrayValue$23[dupTemp$22];
              dk.field_d[var3Lifetime1][qk.field_a[var3Lifetime1]] = null;
              return var4Lifetime1;
            }
          }
          return new byte[param1];
        }
        if (qg.field_f > 0) {
          fieldTemp$13 = qg.field_f - 1;
          qg.field_f = qg.field_f - 1;
          var2_ref_byte__Lifetime2 = tm.field_u[fieldTemp$13];
          tm.field_u[qg.field_f] = null;
          return var2_ref_byte__Lifetime2;
        }
        var2Lifetime2 = -83 % ((-16 - param0) / 34);
        if (param1 != 30000) {
          if (dk.field_d == null) {
            return new byte[param1];
          }
          for (var3Lifetime2 = 0; qe.field_a.length > var3Lifetime2; var3Lifetime2++) {
            if (param1 == qe.field_a[var3Lifetime2] &&
              qk.field_a[var3Lifetime2] > 0) {
              dupTemp$18 = qk.field_a[var3Lifetime2] - 1;
              arrayValue$19 = dk.field_d[var3Lifetime2];
              qk.field_a[var3Lifetime2] = dupTemp$18;
              var4Lifetime2 = arrayValue$19[dupTemp$18];
              dk.field_d[var3Lifetime2][qk.field_a[var3Lifetime2]] = null;
              return var4Lifetime2;
            }
          }
          return new byte[param1];
        }
        if (ff.field_b > 0) {
          fieldTemp$16 = qa.field_b;
          fieldTemp$17 = ff.field_b - 1;
          ff.field_b = ff.field_b - 1;
          var3_ref_byte__Lifetime2 = fieldTemp$16[fieldTemp$17];
          qa.field_b[ff.field_b] = null;
          return var3_ref_byte__Lifetime2;
        }
        if (dk.field_d == null) {
          return new byte[param1];
        }
        for (var3Lifetime3 = 0; qe.field_a.length > var3Lifetime3; var3Lifetime3++) {
          if (param1 == qe.field_a[var3Lifetime3] &&
            qk.field_a[var3Lifetime3] > 0) {
            dupTemp$14 = qk.field_a[var3Lifetime3] - 1;
            arrayValue$15 = dk.field_d[var3Lifetime3];
            qk.field_a[var3Lifetime3] = dupTemp$14;
            var4Lifetime3 = arrayValue$15[dupTemp$14];
            dk.field_d[var3Lifetime3][qk.field_a[var3Lifetime3]] = null;
            return var4Lifetime3;
          }
        }
        return new byte[param1];
    }

    final static byte[] b(int param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            var3 = (String) null;
            lh.a(94, (String) null);
          }
          stackIn_3_0 = fa.field_d.a(param1, ~param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("lh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ag.field_d = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("lh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    static {
    }
}
