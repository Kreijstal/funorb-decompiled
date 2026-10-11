/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static th field_a;
    private io field_c;
    private ul field_h;
    private ul field_f;
    static ja field_b;
    static ja[] field_d;
    static String field_g;
    static ja field_e;

    final ob a(int param0, int param1) {
        byte[] var4 = null;
        ob var3 = (ob) (this.field_c.a((byte) 127, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (32768 <= param0) {
          var4 = this.field_h.a(0, true, 32767 & param0);
        } else {
          var4 = this.field_f.a(0, true, param0);
        }
        var3 = new ob();
        if (var4 != null) {
          var3.a(64, new k(var4));
        }
        if (param0 >= 32768) {
          var3.e((byte) -72);
        }
        this.field_c.a(var3, (long)param0, 1);
        if (param1 != 32767) {
          this.field_c = (io) null;
        }
        return var3;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
          ig.a((byte) -89, 58, false, -109);
        }
        field_b = null;
        field_g = null;
    }

    ig(int param0, ul param1, ul param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new io(64);
        try {
          this.field_f = param1;
          this.field_h = param2;
          if (this.field_f != null) {
            this.field_f.d(0, -2);
          }
          if (this.field_h != null) {
            this.field_h.d(0, -2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("ig.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        cj var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ka var9 = null;
        int var6Lifetime1;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (t.field_e < b.field_d) {
            t.field_e = t.field_e + 1;
          }
          if (km.field_cb != dl.field_h.field_f) {
            vj.field_t = vj.field_t + (dl.field_h.field_f - km.field_cb);
            km.field_cb = dl.field_h.field_f;
          }
          if (0 >= t.field_e) {
            return;
          }
          lk.g((byte) 93);
          dq.field_k.a(-11838, param2);
          if (ra.field_f != null) {
            if (nh.field_m) {
              ra.field_f.a(dq.field_k.field_w, (byte) -27, dq.field_k.field_qb, param2);
            } else {
              ra.field_f = null;
            }
          }
          for (var4_int = 0; var4_int < 5; var4_int++) {
            var5 = la.field_h[var4_int];
            if (var5 != null) {
              if (var5.field_T != 0) {
                cm.a(-105, var4_int, var5);
              }
              var6 = ga.a(var4_int, true);
              pf.field_d[var4_int].field_rb = wp.field_j[var6];
              hh.field_l[var4_int].field_wb = vg.field_h[var6];
            }
          }
          if (nn.field_b.field_T != 0) {
            bk.field_i = new fa(nn.field_b.field_w, nn.field_b.field_qb, nn.field_b.field_zb, nn.field_b.field_z, param3, wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b, (String) null, 0L);
          }
          var9 = km.b(-7, param1, jk.field_f, nj.field_h);
          if (var9 != null) {
            kj.a(-31806, var9);
          }
          var8 = jp.a((byte) -104);
          if (var8 != null) {
            ui.field_j = var8;
          }
          var6Lifetime1 = -44 % ((-68 - param0) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ig.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = new th();
        field_g = "Research Points: <%0>";
    }
}
