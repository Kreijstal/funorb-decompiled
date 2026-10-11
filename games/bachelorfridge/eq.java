/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    static kv[] field_b;
    String[] field_a;
    String field_g;
    static String field_i;
    static String field_f;
    boolean field_h;
    int field_d;
    static int[] field_c;
    boolean field_e;

    public static void a(int param0) {
        field_f = null;
        if (param0 == 0) {
          field_c = null;
          field_b = null;
          field_i = null;
          return;
        }
        field_c = (int[]) null;
        field_c = null;
        field_b = null;
        field_i = null;
    }

    final static void a(kv param0, gj param1, byte param2) {
        int var5 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        String stackIn_9_0 = null;
        boolean stackIn_27_0 = false;
        int[] stackIn_28_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ad[] var4_ref_ad__ = null;
        ad var6 = null;
        int var7 = 0;
        gj var8 = null;
        var7 = BachelorFridge.field_y;
        try {
          pu.field_j = param1;
          rga.field_a = pu.field_j.field_G;
          if (param2 != -111) {
            var8 = (gj) null;
            eq.a((kv) null, (gj) null, (byte) 68);
          }
          var3_int = pu.field_j.field_h.field_b;
          stackIn_6_0 = (var3_int == pu.field_j.field_n);
          li.field_m = stackIn_6_0;
          if (var3_int < 0) {
            stackIn_9_0 = null;
          } else {
            stackIn_9_0 = pu.field_j.field_h.field_y[pu.field_j.field_h.field_b];
          }
          dd.field_G = stackIn_9_0;
          vj.field_m = param0;
          if (null != rga.field_a) {
            var4_ref_ad__ = rga.field_a;
            for (var5 = 0; var4_ref_ad__.length > var5; var5++) {
              var6 = var4_ref_ad__[var5];
              if (var6 != null) {
                var6.b(false);
              }
            }
            raa.field_F = 0;
            for (var4 = 0; rga.field_a.length > var4; var4++) {
              if (rga.field_a[var4] != null) {
                raa.field_F = raa.field_F + 1;
              }
            }
            hia.c((byte) -117);
          } else {
            raa.field_F = 0;
          }
          stackIn_27_0 = true;
          if (1 != pu.field_j.field_h.field_o) {
            stackIn_28_1 = ina.field_o;
          } else {
            stackIn_28_1 = wj.field_l;
          }
          hi.a(stackIn_27_0, stackIn_28_1);
          if (li.field_m) {
            pka.a(mu.field_d, false, (byte) 73);
          } else {
            pka.a(nu.field_h, false, (byte) 73);
          }
          wj.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("eq.A(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    eq(boolean param0) {
        this.field_e = param0 ? true : false;
    }

    static {
        field_i = "Change display name";
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_c = new int[]{75, 165, 244, 324, 403};
    }
}
