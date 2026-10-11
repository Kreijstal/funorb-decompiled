/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends cn {
    static String field_p;
    static int field_x;
    private int field_A;
    static nk field_v;
    static long field_q;
    private int field_t;
    static int[] field_r;
    private wk[] field_y;
    private int field_o;
    static gh field_s;
    static String field_z;
    static ll field_w;
    static int[] field_u;

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param1.field_C) {
            stackIn_6_0 = (param1.d(param2 ^ -30)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof oa) {
            param3 = param3 & ((oa) (param1)).field_K;
          }
          if (param3) {
            if (var6_int != 0) {
              stackIn_13_0 = this.field_t;
            } else {
              stackIn_13_0 = this.field_A;
            }
          } else {
            stackIn_13_0 = this.field_o;
          }
          var7 = stackIn_13_0;
          stackIn_16_0 = (param3) ? 16777215 : 7105644;
          var8 = stackIn_16_0;
          if (param2 != -30) {
            this.field_t = -80;
          }
          sl.a(this.field_y, param1.field_x, (param1.field_E - this.field_y[0].field_B >> 1) + (param1.field_z + param4), param0 + param1.field_o, var7, (byte) -119);
          this.field_f.a(param1.field_y, param1.field_o + param0, -2 + param4 + param1.field_z, param1.field_x, param1.field_E, var8, -1, 1, 1, this.field_f.field_G);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(gh param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8) {
        int var11 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        gh var10 = null;
        int var12 = 0;
        gh var13 = null;
        var12 = SteelSentinels.field_G;
        try {
          var13 = new gh((long)param3, field_s, param1);
          if (!param8) {
            return;
          }
          var13.a(0, param4, 20, -7 + param7, 2 + param5 - param7);
          param0.a(var13, 122);
          var10 = new gh((long)param3, (gh) null);
          var10.a(0, 1, 12, 22, -20 + (param5 - param7));
          var10.field_Pb = new wk(var10.field_zb, var10.field_Lb);
          var10.field_Pb.d();
          pb.h(0, 0, var10.field_zb, var10.field_Lb, 1995681);
          if (param2 > 0) {
            if (param2 <= param6) {
              pb.a(2, 2, param2 * (-4 + var10.field_zb) / param6, -4 + var10.field_Lb, 1995681);
              if (param6 > 100 &&
                param6 < 2000) {
                for (var11 = 100; param6 > var11; var11 += 100) {
                  pb.f(var11 * (var10.field_zb - 4) / param6 + 2, 2, var10.field_Lb - 4, 4473924, 96);
                }
              }
            } else {
              pb.a(2, 2, -4 + var10.field_zb, var10.field_Lb - 4, 5157841);
            }
          } else {
            pb.h(0, 0, var10.field_zb, var10.field_Lb, 10367841);
          }
          var13.a(var10, 121);
          sb.field_bb.b((byte) 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_16_0 = var9;
          stackIn_16_1 = new StringBuilder().append("kh.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_u = null;
        field_z = null;
        field_w = null;
        field_p = null;
        field_v = null;
        field_s = null;
        if (param0 != 100) {
          String var2 = (String) null;
          kh.a((gh) null, (String) null, 70, 81, -71, -99, -90, -116, false);
        }
        field_r = null;
    }

    public kh() {
        this(2188450, 2591221, 9543);
    }

    final static cc a(boolean param0, long param1) {
        if (param0) {
          return (cc) null;
        }
        return (cc) (me.field_b.a(param1, (byte) -72));
    }

    private kh(int param0, int param1, int param2) {
        this.field_y = un.field_m;
        this.field_t = param1;
        this.field_A = param0;
        this.field_f = gf.field_d;
        this.field_o = param2;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_p = "Lobby";
        field_x = 100;
        field_r = new int[256];
        for (var1 = 0; 256 > var1; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -306674912;
            }
          }
          field_r[var1] = var0;
        }
        field_u = new int[8192];
    }
}
