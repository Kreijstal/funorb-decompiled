/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fba {
    static float field_a;

    final static int[] a(int param0, float param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        int[] var10 = new int[param6];
        int[] var8 = var10;
        lva var9 = new lva();
        var9.field_z = param7;
        var9.field_u = param2;
        var9.field_n = param4;
        var9.field_w = param0;
        var9.field_s = param3 ? true : false;
        var9.field_x = (int)(4096.0f * param1);
        var9.b((byte) 116);
        uta.a(0, param5, param6);
        var9.a(var10, -1, 0);
        return var10;
    }

    final static float[] a(int param0, float[] param1, int param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] var5 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            var4 = (float[]) null;
            fba.a(60, (float[]) null, -59);
          }
          var5 = new float[param2];
          var3 = var5;
          lua.a(param1, 0, var5, 0, param2);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("fba.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        byte[][] arrayValue$5 = null;
        byte[][] fieldTemp$6 = null;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$21 = 0;
        byte[][] fieldTemp$17 = null;
        int fieldTemp$18 = 0;
        int dupTemp$19 = 0;
        byte[][] arrayValue$20 = null;
        int fieldTemp$16 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        byte[][] fieldTemp$14 = null;
        int fieldTemp$15 = 0;
        int dupTemp$12 = 0;
        byte[][] arrayValue$13 = null;
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
        byte[] var3Lifetime4;
        if (param0 != 100) {
          if (param1 != 0) {
            return (byte[]) null;
          }
          if (5000 == param0 &&
            rg.field_B > 0) {
            fieldTemp$3 = rg.field_B - 1;
            rg.field_B = rg.field_B - 1;
            var2_ref_byte__ = tw.field_f[fieldTemp$3];
            tw.field_f[rg.field_B] = null;
            return var2_ref_byte__;
          }
          if (param0 != 30000) {
            if (null != osa.field_r) {
              for (var2 = 0; cka.field_Mc.length > var2; var2++) {
                if (param0 == cka.field_Mc[var2] &&
                  qea.field_b[var2] > 0) {
                  dupTemp$4 = qea.field_b[var2] - 1;
                  arrayValue$5 = osa.field_r[var2];
                  qea.field_b[var2] = dupTemp$4;
                  var3 = arrayValue$5[dupTemp$4];
                  osa.field_r[var2][qea.field_b[var2]] = null;
                  return var3;
                }
              }
            }
            return new byte[param0];
          }
          if (ia.field_a > 0) {
            fieldTemp$6 = fb.field_a;
            fieldTemp$7 = ia.field_a - 1;
            ia.field_a = ia.field_a - 1;
            var2_ref_byte__Lifetime5 = fieldTemp$6[fieldTemp$7];
            fb.field_a[ia.field_a] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (null != osa.field_r) {
            for (var2Lifetime4 = 0; cka.field_Mc.length > var2Lifetime4; var2Lifetime4++) {
              if (param0 == cka.field_Mc[var2Lifetime4] &&
                qea.field_b[var2Lifetime4] > 0) {
                dupTemp$8 = qea.field_b[var2Lifetime4] - 1;
                arrayValue$9 = osa.field_r[var2Lifetime4];
                qea.field_b[var2Lifetime4] = dupTemp$8;
                var3Lifetime4 = arrayValue$9[dupTemp$8];
                osa.field_r[var2Lifetime4][qea.field_b[var2Lifetime4]] = null;
                return var3Lifetime4;
              }
            }
          }
          return new byte[param0];
        }
        if (ika.field_b > 0) {
          fieldTemp$21 = ika.field_b - 1;
          ika.field_b = ika.field_b - 1;
          var2_ref_byte__Lifetime1 = eh.field_i[fieldTemp$21];
          eh.field_i[ika.field_b] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (param1 != 0) {
          return (byte[]) null;
        }
        if (5000 != param0) {
          if (param0 == 30000 &&
            ia.field_a > 0) {
            fieldTemp$17 = fb.field_a;
            fieldTemp$18 = ia.field_a - 1;
            ia.field_a = ia.field_a - 1;
            var2_ref_byte__Lifetime2 = fieldTemp$17[fieldTemp$18];
            fb.field_a[ia.field_a] = null;
            return var2_ref_byte__Lifetime2;
          }
          if (null == osa.field_r) {
            return new byte[param0];
          }
          for (var2Lifetime1 = 0; cka.field_Mc.length > var2Lifetime1; var2Lifetime1++) {
            if (param0 == cka.field_Mc[var2Lifetime1] &&
              qea.field_b[var2Lifetime1] > 0) {
              dupTemp$19 = qea.field_b[var2Lifetime1] - 1;
              arrayValue$20 = osa.field_r[var2Lifetime1];
              qea.field_b[var2Lifetime1] = dupTemp$19;
              var3Lifetime1 = arrayValue$20[dupTemp$19];
              osa.field_r[var2Lifetime1][qea.field_b[var2Lifetime1]] = null;
              return var3Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (rg.field_B > 0) {
          fieldTemp$16 = rg.field_B - 1;
          rg.field_B = rg.field_B - 1;
          var2_ref_byte__Lifetime3 = tw.field_f[fieldTemp$16];
          tw.field_f[rg.field_B] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (param0 != 30000) {
          if (null == osa.field_r) {
            return new byte[param0];
          }
          for (var2Lifetime2 = 0; cka.field_Mc.length > var2Lifetime2; var2Lifetime2++) {
            if (param0 == cka.field_Mc[var2Lifetime2] &&
              qea.field_b[var2Lifetime2] > 0) {
              dupTemp$10 = qea.field_b[var2Lifetime2] - 1;
              arrayValue$11 = osa.field_r[var2Lifetime2];
              qea.field_b[var2Lifetime2] = dupTemp$10;
              var3Lifetime2 = arrayValue$11[dupTemp$10];
              osa.field_r[var2Lifetime2][qea.field_b[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (ia.field_a > 0) {
          fieldTemp$14 = fb.field_a;
          fieldTemp$15 = ia.field_a - 1;
          ia.field_a = ia.field_a - 1;
          var2_ref_byte__Lifetime4 = fieldTemp$14[fieldTemp$15];
          fb.field_a[ia.field_a] = null;
          return var2_ref_byte__Lifetime4;
        }
        if (null == osa.field_r) {
          return new byte[param0];
        }
        for (var2Lifetime3 = 0; cka.field_Mc.length > var2Lifetime3; var2Lifetime3++) {
          if (param0 == cka.field_Mc[var2Lifetime3] &&
            qea.field_b[var2Lifetime3] > 0) {
            dupTemp$12 = qea.field_b[var2Lifetime3] - 1;
            arrayValue$13 = osa.field_r[var2Lifetime3];
            qea.field_b[var2Lifetime3] = dupTemp$12;
            var3Lifetime3 = arrayValue$13[dupTemp$12];
            osa.field_r[var2Lifetime3][qea.field_b[var2Lifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param0];
    }

    static {
    }
}
