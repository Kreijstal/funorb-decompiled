/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class taa extends rqa {
    final static void e(byte param0) {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var1 = 3 / ((param0 - 64) / 44);
        if (null != qta.field_o) {
          if (null != jmb.field_q) {
            return;
          } else {
            jmb.field_q = new int[256];
            qta.field_o = new int[256];
            var2 = 0;
            L0: while (true) {
              if (256 <= var2) {
                return;
              } else {
                var3 = (double)var2 / 255.0 * 6.283185307179586;
                qta.field_o[var2] = (int)(4096.0 * Math.sin(var3));
                jmb.field_q[var2] = (int)(Math.cos(var3) * 4096.0);
                var2++;
                continue L0;
              }
            }
          }
        } else {
          jmb.field_q = new int[256];
          qta.field_o = new int[256];
          var2 = 0;
          L1: while (true) {
            if (256 <= var2) {
              return;
            } else {
              var3 = (double)var2 / 255.0 * 6.283185307179586;
              qta.field_o[var2] = (int)(4096.0 * Math.sin(var3));
              jmb.field_q[var2] = (int)(Math.cos(var3) * 4096.0);
              var2++;
              continue L1;
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            taa.e((byte) 116);
            return new nc(pcb.field_o);
        }
        return new nc(pcb.field_o);
    }

    taa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
