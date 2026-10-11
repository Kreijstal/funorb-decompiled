/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends rk {
    static char[] field_q;
    int field_p;
    int field_r;
    static double field_o;
    int field_m;
    int field_n;
    int[] field_s;
    int field_u;
    int field_t;

    public static void b(int param0) {
        field_q = null;
        if (param0 != 98) {
          ud.b(-36);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        om var4 = null;
        ca var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          var4 = (om) (jd.field_f.a(88));
          while (var4 != null) {
            vg.a(7932, param0, var4);
            var4 = (om) (jd.field_f.d(param1 + 2005));
          }
          var5 = (ca) (dl.field_b.a(param1 ^ 96));
          while (var5 != null) {
            kd.a((byte) -115, param0, var5);
            var5 = (ca) (dl.field_b.d(2123));
          }
          if (param1 == 118) {
            return;
          }
          field_o = 0.6728990735793879;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "ud.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          oe.field_Q = b.field_a;
          if (param0) {
            return;
          }
          if (param1 != 255) {
            if (param1 < 100) {
              ji.field_d = gd.a(4, param2, param1);
              return;
            }
            if (param1 > 105) {
              ji.field_d = gd.a(4, param2, param1);
              return;
            }
            ji.field_d = p.a(26663, param3);
            return;
          }
          stackIn_6_0 = 125;
          stackIn_7_1 = !(13 <= wc.field_Ob);
          ji.field_d = jj.$cfr$intArgs$a$81305413f30a(stackIn_6_0, stackIn_7_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ud.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        pe.field_q = param2;
        ef.field_vb = param0;
        if (param1 != -12) {
          String[] var4 = (String[]) null;
          ud.a(false, -13, (String) null, (String[]) null);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
          int var9_int = 115 / ((29 - param2) / 45);
          this.field_r = param5;
          this.field_m = param1;
          this.field_s = param7;
          this.field_p = param6;
          this.field_n = param3;
          this.field_t = param0;
          this.field_u = param4;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ud.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    ud() {
    }

    static {
        field_q = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
