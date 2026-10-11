/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_e;
    static nd field_b;
    static boolean field_d;
    static int field_c;
    static int field_a;

    public static void a(int param0) {
        field_e = null;
        if (param0 != 16976) {
          field_b = (nd) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static pf a(int param0, en param1) {
        int var7 = 0;
        pf stackIn_5_0 = null;
        pf stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param1.a(8, true);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = vi.a((byte) 122, param1) ? 1 : 0;
          var4 = vi.a((byte) 126, param1) ? 1 : 0;
          var5 = new pf();
          var5.field_c = (short)param1.a(16, true);
          var5.field_n = pa.a((byte) 87, var5.field_n, 16, param1);
          var5.field_E = pa.a((byte) 87, var5.field_E, 16, param1);
          if (param0 != 4) {
            stackIn_5_0 = (pf) null;
            return stackIn_5_0;
          }
          var5.field_H = pa.a((byte) 87, var5.field_H, 16, param1);
          var5.field_k = (short)param1.a(16, true);
          var5.field_i = pa.a((byte) 87, var5.field_i, 16, param1);
          var5.field_P = pa.a((byte) 87, var5.field_P, 16, param1);
          var5.field_z = pa.a((byte) 87, var5.field_z, 16, param1);
          if (var3 != 0) {
            var5.field_L = (short)param1.a(16, true);
            var5.field_u = pa.a((byte) 87, var5.field_u, 16, param1);
            var5.field_w = pa.a((byte) 87, var5.field_w, 16, param1);
            var5.field_r = pa.a((byte) 87, var5.field_r, 16, param1);
            var5.field_m = pa.a((byte) 87, var5.field_m, 16, param1);
            var5.field_y = pa.a((byte) 87, var5.field_y, 16, param1);
            var5.field_q = pa.a((byte) 87, var5.field_q, 16, param1);
          }
          if (var4 != 0) {
            param1.a(16, true);
            var5.field_b = pa.a((byte) 87, var5.field_b, 16, param1);
            var5.field_K = pa.a((byte) 87, var5.field_K, 16, param1);
            var5.field_O = pa.a((byte) 87, var5.field_O, 16, param1);
            var5.field_s = pa.a((byte) 87, var5.field_s, 16, param1);
            var5.field_G = pa.a((byte) 87, var5.field_G, 16, param1);
          }
          if (vi.a((byte) 105, param1)) {
            var5.field_g = pa.a((byte) 87, var5.field_g, 16, param1);
          }
          if (vi.a((byte) 104, param1)) {
            var5.field_x = ga.a(104, param1, var5.field_x, 16);
            var6 = 0;
            for (var7 = 0; var5.field_x.length > var7; var7++) {
              if ((255 & var5.field_x[var7]) > var6) {
                var6 = var5.field_x[var7] & 255;
              }
            }
            if (var6 == 0) {
              var5.field_x = null;
            } else {
              var5.field_f = (byte)(1 + var6);
            }
          }
          stackIn_28_0 = var5;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("tf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_e = "<col=ffff00>Date - uncertain</col><br><col=ffff00>Position - planet designated Kerrus</col><br><br>I was sent to investigate the loss of contact with the UFE Starship Hammerhead. I found out it had been taken over by hostile non-terrestrials. None of the crew survived.<br><br>I blew it up and escaped, but my shuttle crashed on the planet Kerrus.<br><br>Kerrus was infested by the creatures. I found the centre of their hive and destroyed the queen, but I barely got off the planet alive.<br><br>The nearest human colony is too far away to reach, but there's supposed to be a space station nearby. I don't know where it is, but maybe if I go into hypersleep the oxygen will last long enough to get there.<br><br>If not, whoever gets this message, please notify the UFE urgently that Kerrus is unsafe and must not be approached.";
        field_b = new nd(2, 4, 4, 0);
    }
}
