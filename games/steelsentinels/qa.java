/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends fe {
    static SceneWidget field_L;
    static int field_O;
    int field_I;
    byte field_K;
    static int field_M;
    static long field_P;
    static int field_H;
    static RgbSprite[] field_J;
    static SceneWidget field_N;
    PacketBuffer field_G;

    final static void a(String param0, boolean param1, hk param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        dd var7 = null;
        String var8 = null;
        dd var9 = null;
        String var10 = null;
        dd var11 = null;
        String var12 = null;
        dd var13 = null;
        try {
          kk.a(param2, param2.j(-13), -1, (int[]) null, (String) null, (String) null, 1073741824, 0L, rn.field_y);
          if (param2.field_rc && (param2.field_sc == 2 ||
            !(NodeDeque.field_d < 2))) {
            var7 = an.field_i;
            var8 = db.a(sl.field_o, -71, new String[]{param0});
            var7.field_j.a(2, 10, var8);
          }
          an.field_i.a((byte) 64);
          if (param1) {
            if (bj.field_j != an.field_i.field_g) {
              var11 = an.field_i;
              var12 = db.a(ej.field_u, -39, new String[]{param0});
              var11.field_j.a(2, 15, var12);
            } else {
              var9 = an.field_i;
              var10 = db.a(ia.field_m, -88, new String[]{param0});
              var9.field_j.a(2, 16, var10);
            }
          }
          var13 = an.field_i;
          var5 = oa.field_S;
          if (param3 <= 78) {
            field_J = (RgbSprite[]) null;
          }
          var6 = rj.field_j;
          var13.field_j.a(0, 0, var6, (byte) -119, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("qa.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 == 10) {
          field_J = null;
          field_N = null;
          field_L = null;
          return;
        }
        field_H = -1;
        field_J = null;
        field_N = null;
        field_L = null;
    }

    final byte[] d(byte param0) {
        if (this.field_z) {
          throw new RuntimeException();
        }
        if (this.field_G.payload.length - this.field_K > this.field_G.position) {
          throw new RuntimeException();
        }
        if (param0 < -49) {
          return this.field_G.payload;
        }
        field_M = -48;
        return this.field_G.payload;
    }

    final static String a(int param0, int param1) {
        int var2 = 0;
        if (param0 == -1) {
          var2 = param1 / 60;
          param1 = param1 % 60;
          return db.a(ui.field_S, -36, new String[]{Integer.toString(var2), Integer.toString(param1 / 10), Integer.toString(param1 % 10)});
        }
        return (String) null;
    }

    qa() {
    }

    final int g(int param0) {
        if (param0 != 16) {
          hk var3 = (hk) null;
          qa.a((String) null, false, (hk) null, 114);
          if (this.field_G != null) {
            return this.field_G.position * 100 / (-this.field_K + this.field_G.payload.length);
          }
          return 0;
        }
        if (this.field_G != null) {
          return this.field_G.position * 100 / (-this.field_K + this.field_G.payload.length);
        }
        return 0;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 >= -54) {
          qa.$cfr$intArgs$a$7ffe4b125357(43, true);
          fa.a(true, (byte) 67, param1);
          return;
        }
        fa.a(true, (byte) 67, param1);
    }

    final static void a(RgbSprite param0, byte param1) {
        try {
          qi.field_i = param0;
          if (param1 != 69) {
            RgbSprite var3 = (RgbSprite) null;
            qa.a((RgbSprite) null, (byte) -94);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_P = 0L;
        field_M = 62;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        if (param0 >= -54) {
          qa.$cfr$intArgs$a$7ffe4b125357(43, true);
          fa.a(true, (byte) 67, param1);
          return;
        }
        fa.a(true, (byte) 67, param1);
    }
}
