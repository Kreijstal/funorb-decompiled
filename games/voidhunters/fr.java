/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fr implements dja {
    final static void a(lta param0, wfb param1, boolean param2) {
        int stackIn_18_0 = 0;
        lta stackIn_18_1 = null;
        boolean stackIn_19_2 = false;
        lta stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        lta stackIn_40_0 = null;
        boolean stackIn_41_1 = false;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        Throwable decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        Exception var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        lsb[] var5_ref_lsb__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        ml var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        var13 = VoidHunters.field_G;
        try {
          var3 = "Normal mode";
          if (au.field_c == 1) {
            var3 = "Convex polygons mode";
          } else {
            if (au.field_c == 2) {
              var3 = "Detail lines mode";
            }
          }
          cka.a(-1, var3, 16777215, 40, ip.field_p.width / 2 - (kga.a(123, var3) >> 1), 4266);
          if (param2) {
            return;
          }
          if (param1.field_v == null) {
            return;
          }
          if (0 <= fe.field_p &&
            au.field_c == 2) {
            try {
              var15 = new ml(fe.field_p);
              var15.a((pe) null, (byte) 84, 16777215, param0, false);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (Exception) (Object) decompiledCaughtException;
              var4.printStackTrace();
            }
          }
          var18 = param1.field_v;
          var16 = var18;
          var14 = var16;
          var19 = var14;
          var17 = var19;
          var4_array = var17;
          stackIn_18_0 = 16711935;
          stackIn_18_1 = (lta) (param0);
          stackIn_19_2 = !(param2);
          fg.a(stackIn_18_0, ((lta) (Object) stackIn_18_1).b(stackIn_19_2, 0), param0.a(0, (byte) 122), 80);
          for (var5 = 0; var5 < var18.length; var5 += 2) {
            var6 = var18[var5];
            var7 = var14[var5 + 1];
            var8 = var14[(2 + var5) % var18.length];
            var9 = var14[(3 + var5) % var18.length];
            c.a(param0.b(true, var9), param0.a(var8, (byte) 121), param0.a(var6, (byte) 114), param0.b(true, var7), -16777216, 16711680);
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < var19.length; var5Lifetime1 += 2) {
            var6Lifetime1 = var19[var5Lifetime1];
            var7Lifetime1 = var4_array[var5Lifetime1 + 1];
            var8Lifetime1 = param0.a(var6Lifetime1, (byte) 120);
            var9Lifetime1 = param0.b(true, var7Lifetime1);
            fg.a(16777215, var9Lifetime1, var8Lifetime1, 63);
            if (au.field_c != 2) {
              cka.a(1, "" + (var5Lifetime1 >> 1), 16777215, var9Lifetime1, var8Lifetime1, 4266);
            }
          }
          if (au.field_c == 0) {
            var5_ref_lsb__ = param1.field_o;
            if (var5_ref_lsb__ != null) {
              for (var6Lifetime2 = 0; var5_ref_lsb__.length > var6Lifetime2; var6Lifetime2++) {
                var7Lifetime2 = var5_ref_lsb__[var6Lifetime2].field_b;
                var8Lifetime2 = var5_ref_lsb__[var6Lifetime2].field_c;
                var9Lifetime2 = param0.a(var7Lifetime2, (byte) 120);
                stackIn_36_0 = (lta) (param0);
                stackIn_37_1 = !(param2);
                var10 = ((lta) (Object) stackIn_36_0).b(stackIn_37_1, var8Lifetime2);
                ena.a(var10, (float)(int)(param0.field_a * 256.0f), -104, var9Lifetime2, 65280);
                var11 = 8 * fc.a(var5_ref_lsb__[var6Lifetime2].field_a, (byte) 61) >> 8;
                var12 = eu.a(var5_ref_lsb__[var6Lifetime2].field_a, 109) * 8 >> 8;
                c.a(param0.b(true, var12 + var8Lifetime2), param0.a(var11 + var7Lifetime2, (byte) 127), var9Lifetime2, var10, -16777216, 16711680);
                cka.a(-1, Integer.toString(var6Lifetime2), 16711935, var10, var9Lifetime2, 4266);
              }
            }
          }
          var5Lifetime2 = param0.a(param1.field_b, (byte) 125);
          stackIn_40_0 = (lta) (param0);
          stackIn_41_1 = !(param2);
          var6Lifetime3 = ((lta) (Object) stackIn_40_0).b(stackIn_41_1, param1.field_i);
          kq.a(2.0f, (byte) 115, var6Lifetime3, 255, var5Lifetime2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_45_0 = var3_ref;
          stackIn_45_1 = new StringBuilder().append("fr.D(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
          return;
        }
        lga.a(param0, -24055);
        sj.a(param0, (byte) -93);
    }

    public final tv a(byte param0) {
        int var2 = 46 / ((param0 + 64) / 50);
        return (tv) ((Object) new rdb());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new rdb[param1]);
    }

    static {
    }
}
