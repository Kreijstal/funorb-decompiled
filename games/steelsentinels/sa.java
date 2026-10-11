/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_a;
    static hg[] field_f;
    static String field_d;
    static RgbSprite[] field_e;
    static int field_c;
    static String field_b;

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_a = null;
        if (!param0) {
          return;
        }
        sa.a(false);
    }

    final static String b(byte param0) {
        if (nj.field_Q < 2) {
          return ud.field_w;
        }
        if (null != ok.field_f) {
          if (ok.field_f.a(true)) {
            return nm.field_t;
          }
          return jk.field_g;
        }
        int var1 = -86 / ((69 - param0) / 47);
        if (!ke.field_k.a(true)) {
          return ai.field_t;
        }
        if (!ke.field_k.a("commonui", (byte) 90)) {
          return en.field_f + " - " + ke.field_k.a((byte) 78, "commonui") + "%";
        }
        if (!oe.field_d.a(true)) {
          return og.field_c;
        }
        if (!oe.field_d.a("commonui", (byte) 90)) {
          return kb.field_c + " - " + oe.field_d.a((byte) 103, "commonui") + "%";
        }
        if (!id.field_bc.a(true)) {
          return sl.field_l;
        }
        if (!id.field_bc.a(25)) {
          return qj.field_i + " - " + id.field_bc.a((byte) -33) + "%";
        }
        return GameApplet.field_a;
    }

    final static String a(int param0, String param1, byte param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_33_0 = null;
        Object stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == 1) {
            stackIn_2_0 = db.a(ai.field_w, -73, new String[]{param1});
            return stackIn_2_0;
          }
          if (2 == param0) {
            stackIn_5_0 = db.a(kb.field_d, -43, new String[]{param1});
            return stackIn_5_0;
          }
          if (param0 == 3) {
            stackIn_8_0 = db.a(jj.field_j, -75, new String[]{param1});
            return stackIn_8_0;
          }
          if (param0 == 4) {
            stackIn_11_0 = db.a(fk.field_p, -93, new String[]{param1});
            return stackIn_11_0;
          }
          if (5 == param0) {
            stackIn_14_0 = db.a(s.field_b, -67, new String[]{param1});
            return stackIn_14_0;
          }
          if (param0 == 6) {
            stackIn_17_0 = db.a(qf.field_i, -65, new String[]{param1});
            return stackIn_17_0;
          }
          if (7 == param0) {
            stackIn_20_0 = db.a(um.field_db, -32, new String[]{param1});
            return stackIn_20_0;
          }
          if (8 == param0) {
            stackIn_23_0 = db.a(lb.field_Ub, -63, new String[]{param1});
            return stackIn_23_0;
          }
          if (11 == param0) {
            stackIn_26_0 = db.a(FunOrbClient.field_y, -107, new String[]{param1});
            return stackIn_26_0;
          }
          if (param0 == 12) {
            stackIn_29_0 = db.a(uf.field_e, -117, new String[]{param1});
            return stackIn_29_0;
          }
          if (13 == param0) {
            stackIn_33_0 = db.a(vi.field_ab, -17, new String[]{param1});
            return stackIn_33_0;
          }
          if (param2 < -103) {
            return null;
          }
          sa.b((byte) 118);
          stackIn_37_0 = null;
          return (String) (stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("sa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var1 = mm.field_g;
          if (param0 != -110) {
            return;
          }
          while (PartInstruction.a(true)) {
            var1.a(8, (byte) -117);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            uj.a(true, var1);
            mm.field_g.b((byte) -93, -var2 + var1.position);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "sa.A(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_f = new hg[255];
        field_a = "Remove name";
        for (var0 = 0; field_f.length > var0; var0++) {
          field_f[var0] = new hg();
        }
        field_d = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = "Camera up/down: Normal";
        field_c = 48;
    }
}
