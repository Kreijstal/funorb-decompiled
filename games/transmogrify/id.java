/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 11) {
          id.a(true, (byte) -35);
        }
    }

    final static sg a(boolean param0, byte param1) {
        boolean stackIn_3_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hj var8 = null;
        rk var9 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        var8 = nf.field_l;
        var3 = var8.d((byte) 95);
        kd.field_a = 127 & var3;
        stackIn_3_0 = ((128 & var3) != 0);
        a.field_bb = stackIn_3_0;
        sh.field_b = var8.d((byte) 106);
        sj.field_m = var8.e((byte) -51);
        if (kd.field_a != 2) {
          jd.field_b = 0;
          u.field_d = 0;
        } else {
          u.field_d = var8.a((byte) -108);
          jd.field_b = var8.g((byte) 124);
        }
        if (param1 != 9) {
          id.a(true, (byte) -86);
        }
        stackIn_11_0 = (var8.d((byte) 92) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        kb.field_o = var8.g(12248);
        if (var4 != 0) {
          fd.field_i = var8.g(param1 ^ 12241);
        } else {
          fd.field_i = kb.field_o;
        }
        if (kd.field_a == 1) {
          var8.a((byte) -90);
          var8.g(12248);
        } else {
          if (kd.field_a == 4) {
            var8.a((byte) -90);
            var8.g(12248);
          }
        }
        if (!param0) {
          l.field_c = u.a(false, 80, var8);
          a.field_T = null;
          return new sg(param0);
        }
        var5 = var8.a((byte) -110);
        try {
          var9 = vl.field_C.b(1, var5);
          l.field_c = var9.d((byte) -127);
          if (!fd.field_i.equals(w.field_a)) {
            stackIn_25_0 = var9.field_m;
          } else {
            stackIn_25_0 = null;
          }
          a.field_T = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          d.a((Throwable) ((Object) var6), -120, "CC1");
          a.field_T = null;
          l.field_c = null;
          return new sg(param0);
        }
        return new sg(param0);
    }

    static {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
