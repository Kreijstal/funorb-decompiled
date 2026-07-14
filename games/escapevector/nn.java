/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    private fl[] field_f;
    static ed[] field_a;
    private int field_d;
    private fl field_b;
    static String[] field_i;
    static String field_e;
    static String field_c;
    private long field_h;
    static hh field_g;

    final void a(long param0, fl param1, int param2) {
        fl var5 = null;
        if (null != param1.field_i) {
            param1.d(-39);
            var5 = ((nn) this).field_f[(int)(param0 & (long)(((nn) this).field_d + -1))];
            param1.field_j = var5;
            param1.field_i = var5.field_i;
            param1.field_i.field_j = param1;
            param1.field_j.field_i = param1;
            param1.field_p = param0;
            if (param2 > 24) {
                return;
            }
            nn.b((byte) -113);
            return;
        }
        var5 = ((nn) this).field_f[(int)(param0 & (long)(((nn) this).field_d + -1))];
        param1.field_j = var5;
        param1.field_i = var5.field_i;
        param1.field_i.field_j = param1;
        param1.field_j.field_i = param1;
        param1.field_p = param0;
        if (param2 <= 24) {
            nn.b((byte) -113);
            return;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 <= 48) {
            field_g = null;
            field_g = null;
            field_a = null;
            field_i = null;
            field_e = null;
            return;
        }
        field_g = null;
        field_a = null;
        field_i = null;
        field_e = null;
    }

    final fl a(int param0, long param1) {
        fl var4 = null;
        fl var5 = null;
        int var6 = 0;
        fl var7 = null;
        fl var8 = null;
        var6 = EscapeVector.field_A;
        if (param0 <= -4) {
          ((nn) this).field_h = param1;
          var7 = ((nn) this).field_f[(int)(param1 & (long)(((nn) this).field_d - 1))];
          var4 = var7;
          ((nn) this).field_b = var7.field_j;
          L0: while (true) {
            if (var4 == ((nn) this).field_b) {
              ((nn) this).field_b = null;
              return null;
            } else {
              if ((((nn) this).field_b.field_p ^ -1L) == (param1 ^ -1L)) {
                var5 = ((nn) this).field_b;
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                return var5;
              } else {
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                continue L0;
              }
            }
          }
        } else {
          ((nn) this).field_h = 26L;
          ((nn) this).field_h = param1;
          var8 = ((nn) this).field_f[(int)(param1 & (long)(((nn) this).field_d - 1))];
          var4 = var8;
          ((nn) this).field_b = var8.field_j;
          L1: while (true) {
            if (var4 == ((nn) this).field_b) {
              ((nn) this).field_b = null;
              return null;
            } else {
              if ((((nn) this).field_b.field_p ^ -1L) == (param1 ^ -1L)) {
                var5 = ((nn) this).field_b;
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                return var5;
              } else {
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param0.getGraphics();
            md.field_D.a(param1, param2 ^ param2, param3, var4);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final fl a(byte param0) {
        fl var3 = null;
        int var4 = EscapeVector.field_A;
        if (null == ((nn) this).field_b) {
            return null;
        }
        fl var2 = ((nn) this).field_f[(int)((long)(((nn) this).field_d + -1) & ((nn) this).field_h)];
        while (((nn) this).field_b != var2) {
            if (!(((nn) this).field_h != ((nn) this).field_b.field_p)) {
                var3 = ((nn) this).field_b;
                ((nn) this).field_b = ((nn) this).field_b.field_j;
                return var3;
            }
            ((nn) this).field_b = ((nn) this).field_b.field_j;
        }
        if (param0 != -36) {
            fl discarded$0 = ((nn) this).a((byte) 87);
            ((nn) this).field_b = null;
            return null;
        }
        ((nn) this).field_b = null;
        return null;
    }

    nn(int param0) {
        int var2 = 0;
        fl var3 = null;
        ((nn) this).field_f = new fl[param0];
        ((nn) this).field_d = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new fl();
            ((nn) this).field_f[var2] = new fl();
            var3.field_j = var3;
            var3.field_i = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Power-up is on hill - please land closer";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
