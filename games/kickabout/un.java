/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static qt[] field_b;
    static r field_c;
    static cn field_d;
    static int[] field_a;
    static ml field_e;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 106) {
          field_a = (int[]) null;
        }
    }

    final static void a(nu param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          ae.field_G = param1;
          sh.field_a = param0;
          if (param2 <= 45) {
            return;
          }
          for (var3_int = 0; var3_int < 4; var3_int++) {
            mn.field_b[var3_int] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("un.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized static byte[] a(int param0, boolean param1) {
        byte[][] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        int fieldTemp$6 = 0;
        byte[][] fieldTemp$7 = null;
        int fieldTemp$8 = 0;
        int dupTemp$9 = 0;
        byte[][] arrayValue$10 = null;
        int fieldTemp$11 = 0;
        byte[][] fieldTemp$19 = null;
        int fieldTemp$20 = 0;
        int dupTemp$21 = 0;
        byte[][] arrayValue$22 = null;
        int fieldTemp$12 = 0;
        int dupTemp$17 = 0;
        byte[][] arrayValue$18 = null;
        byte[][] fieldTemp$15 = null;
        int fieldTemp$16 = 0;
        int dupTemp$13 = 0;
        byte[][] arrayValue$14 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var2_ref_byte__Lifetime6;
        byte[] var3Lifetime4;
        if (param1) {
          return (byte[]) null;
        }
        if (param0 != 100) {
          if (param0 != 5000) {
            if (30000 == param0 &&
              ep.field_d > 0) {
              fieldTemp$2 = vt.field_d;
              fieldTemp$3 = ep.field_d - 1;
              ep.field_d = ep.field_d - 1;
              var2_ref_byte__ = fieldTemp$2[fieldTemp$3];
              vt.field_d[ep.field_d] = null;
              return var2_ref_byte__;
            }
            if (null == le.field_e) {
              return new byte[param0];
            }
            for (var2 = 0; us.field_i.length > var2; var2++) {
              if (us.field_i[var2] == param0 &&
                uj.field_D[var2] > 0) {
                dupTemp$4 = uj.field_D[var2] - 1;
                arrayValue$5 = le.field_e[var2];
                uj.field_D[var2] = dupTemp$4;
                var3 = arrayValue$5[dupTemp$4];
                le.field_e[var2][uj.field_D[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (fu.field_h > 0) {
            fieldTemp$6 = fu.field_h - 1;
            fu.field_h = fu.field_h - 1;
            var2_ref_byte__Lifetime5 = sg.field_b[fieldTemp$6];
            sg.field_b[fu.field_h] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (30000 == param0 &&
            ep.field_d > 0) {
            fieldTemp$7 = vt.field_d;
            fieldTemp$8 = ep.field_d - 1;
            ep.field_d = ep.field_d - 1;
            var2_ref_byte__Lifetime6 = fieldTemp$7[fieldTemp$8];
            vt.field_d[ep.field_d] = null;
            return var2_ref_byte__Lifetime6;
          }
          if (null == le.field_e) {
            return new byte[param0];
          }
          for (var2Lifetime4 = 0; us.field_i.length > var2Lifetime4; var2Lifetime4++) {
            if (us.field_i[var2Lifetime4] == param0 &&
              uj.field_D[var2Lifetime4] > 0) {
              dupTemp$9 = uj.field_D[var2Lifetime4] - 1;
              arrayValue$10 = le.field_e[var2Lifetime4];
              uj.field_D[var2Lifetime4] = dupTemp$9;
              var3Lifetime4 = arrayValue$10[dupTemp$9];
              le.field_e[var2Lifetime4][uj.field_D[var2Lifetime4]] = null;
              return var3Lifetime4;
            }
          }
          return new byte[param0];
        }
        if (0 < li.field_h) {
          fieldTemp$11 = li.field_h - 1;
          li.field_h = li.field_h - 1;
          var2_ref_byte__Lifetime1 = vb.field_g[fieldTemp$11];
          vb.field_g[li.field_h] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param0 != 5000) {
          if (30000 == param0 &&
            ep.field_d > 0) {
            fieldTemp$19 = vt.field_d;
            fieldTemp$20 = ep.field_d - 1;
            ep.field_d = ep.field_d - 1;
            var2_ref_byte__Lifetime2 = fieldTemp$19[fieldTemp$20];
            vt.field_d[ep.field_d] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (null != le.field_e) {
            for (var2Lifetime1 = 0; us.field_i.length > var2Lifetime1; var2Lifetime1++) {
              if (us.field_i[var2Lifetime1] == param0 &&
                uj.field_D[var2Lifetime1] > 0) {
                dupTemp$21 = uj.field_D[var2Lifetime1] - 1;
                arrayValue$22 = le.field_e[var2Lifetime1];
                uj.field_D[var2Lifetime1] = dupTemp$21;
                var3Lifetime1 = arrayValue$22[dupTemp$21];
                le.field_e[var2Lifetime1][uj.field_D[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
          }
          return new byte[param0];
        }
        if (fu.field_h > 0) {
          fieldTemp$12 = fu.field_h - 1;
          fu.field_h = fu.field_h - 1;
          var2_ref_byte__Lifetime3 = sg.field_b[fieldTemp$12];
          sg.field_b[fu.field_h] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (30000 != param0) {
          if (null == le.field_e) {
            return new byte[param0];
          }
          for (var2Lifetime2 = 0; us.field_i.length > var2Lifetime2; var2Lifetime2++) {
            if (us.field_i[var2Lifetime2] == param0 &&
              uj.field_D[var2Lifetime2] > 0) {
              dupTemp$17 = uj.field_D[var2Lifetime2] - 1;
              arrayValue$18 = le.field_e[var2Lifetime2];
              uj.field_D[var2Lifetime2] = dupTemp$17;
              var3Lifetime2 = arrayValue$18[dupTemp$17];
              le.field_e[var2Lifetime2][uj.field_D[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (ep.field_d > 0) {
          fieldTemp$15 = vt.field_d;
          fieldTemp$16 = ep.field_d - 1;
          ep.field_d = ep.field_d - 1;
          var2_ref_byte__Lifetime4 = fieldTemp$15[fieldTemp$16];
          vt.field_d[ep.field_d] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (null == le.field_e) {
          return new byte[param0];
        }
        for (var2Lifetime3 = 0; us.field_i.length > var2Lifetime3; var2Lifetime3++) {
          if (us.field_i[var2Lifetime3] == param0 &&
            uj.field_D[var2Lifetime3] > 0) {
            dupTemp$13 = uj.field_D[var2Lifetime3] - 1;
            arrayValue$14 = le.field_e[var2Lifetime3];
            uj.field_D[var2Lifetime3] = dupTemp$13;
            var3Lifetime3 = arrayValue$14[dupTemp$13];
            le.field_e[var2Lifetime3][uj.field_D[var2Lifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param0];
    }

    static {
        field_a = new int[8192];
    }
}
