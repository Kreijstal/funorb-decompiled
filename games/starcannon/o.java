/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    int field_a;
    int field_d;
    static String field_b;
    static String field_c;

    final static id a(ue param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        id stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param1, param3);
          var5 = param0.a(param2, true, var4_int);
          stackIn_1_0 = jl.a(var4_int, param0, (byte) 64, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("o.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, rb param1) {
        ta.field_e = param1.i(-1174051992) << 5;
        int var2_int = param1.j(7909);
        mc.field_f = (var2_int & 7) << 18;
        if (param0 != -20954) {
          return;
        }
        try {
          ta.field_e = ta.field_e + (var2_int >> 3);
          mc.field_f = mc.field_f + (param1.i(param0 ^ 1174064462) << 2);
          var2_int = param1.j(param0 + 28863);
          rb.field_i = var2_int << 15 & 2064384;
          mc.field_f = mc.field_f + (var2_int >> 6);
          rb.field_i = rb.field_i + (param1.j(7909) << 7);
          var2_int = param1.j(7909);
          og.field_f = (var2_int & 1) << 16;
          rb.field_i = rb.field_i + (var2_int >> 1);
          og.field_f = og.field_f + param1.i(param0 - 1174031038);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "o.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    o(int param0, int param1, int param2, int param3) {
        this.field_d = param0;
        this.field_a = param3;
    }

    final static void a(boolean param0) {
        mj.field_c = new String[22];
        mj.field_c[12] = vc.field_f;
        mj.field_c[6] = StarCannon.field_C;
        mj.field_c[2] = gi.field_c;
        mj.field_c[14] = pe.field_b;
        mj.field_c[5] = StarCannon.field_C;
        mj.field_c[1] = rd.field_n;
        mj.field_c[4] = nc.field_e;
        mj.field_c[15] = oi.field_n;
        mj.field_c[11] = cf.field_j;
        mj.field_c[13] = ta.field_g;
        mj.field_c[7] = mf.field_b;
        mj.field_c[0] = fl.field_i;
        mj.field_c[3] = vg.field_c;
        if (!param0) {
          mj.field_c[16] = qb.field_l;
          mj.field_c[17] = vb.field_j;
          mj.field_c[8] = hj.field_b[0];
          mj.field_c[10] = hj.field_b[2];
          mj.field_c[18] = ck.field_b;
          mj.field_c[9] = hj.field_b[1];
          return;
        }
        field_b = (String) null;
        mj.field_c[16] = qb.field_l;
        mj.field_c[17] = vb.field_j;
        mj.field_c[8] = hj.field_b[0];
        mj.field_c[10] = hj.field_b[2];
        mj.field_c[18] = ck.field_b;
        mj.field_c[9] = hj.field_b[1];
    }

    public static void a(int param0) {
        if (param0 != 4432) {
          field_c = (String) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, CharSequence param2, int param3, byte param4, byte[] param5) {
        int var7 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        try {
          var6_int = param1 - param3;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param2.charAt(var7 + param3);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param5[var7 + param0] = (byte)-128;
                    break;
                  case 8218:
                    param5[var7 + param0] = (byte)-126;
                    break;
                  case 402:
                    param5[var7 + param0] = (byte)-125;
                    break;
                  case 8222:
                    param5[var7 + param0] = (byte)-124;
                    break;
                  case 8230:
                    param5[param0 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param5[var7 + param0] = (byte)-122;
                    break;
                  case 8225:
                    param5[param0 + var7] = (byte)-121;
                    break;
                  case 710:
                    param5[var7 + param0] = (byte)-120;
                    break;
                  case 8240:
                    param5[var7 + param0] = (byte)-119;
                    break;
                  case 352:
                    param5[var7 + param0] = (byte)-118;
                    break;
                  case 8249:
                    param5[var7 + param0] = (byte)-117;
                    break;
                  case 338:
                    param5[var7 + param0] = (byte)-116;
                    break;
                  case 381:
                    param5[var7 + param0] = (byte)-114;
                    break;
                  case 8216:
                    param5[param0 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param5[param0 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param5[var7 + param0] = (byte)-109;
                    break;
                  case 8221:
                    param5[param0 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param5[var7 + param0] = (byte)-107;
                    break;
                  case 8211:
                    param5[param0 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param5[param0 + var7] = (byte)-105;
                    break;
                  case 732:
                    param5[param0 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param5[param0 + var7] = (byte)-103;
                    break;
                  case 353:
                    param5[var7 + param0] = (byte)-102;
                    break;
                  case 8250:
                    param5[var7 + param0] = (byte)-101;
                    break;
                  case 339:
                    param5[var7 + param0] = (byte)-100;
                    break;
                  case 382:
                    param5[var7 + param0] = (byte)-98;
                    break;
                  default:
                    param5[var7 + param0] = (byte)63;
                    break;
                  case 376:
                    param5[var7 + param0] = (byte)-97;
                    break;
                }
              } else {
                param5[var7 + param0] = (byte)var8;
              }
            }
          }
          if (param4 < -26) {
            stackIn_69_0 = var6_int;
            return stackIn_69_0;
          }
          stackIn_67_0 = -122;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("o.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    static {
        field_c = "Try again";
    }
}
