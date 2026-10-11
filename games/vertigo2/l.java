/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    boolean field_e;
    int field_g;
    int field_f;
    int field_c;
    static ee field_a;
    boolean field_i;
    boolean field_d;
    int field_j;
    static int[] field_h;
    static long[] field_b;

    final static int a(int param0, byte[] param1, CharSequence param2, int param3, int param4, int param5) {
        int var7 = 0;
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
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = -param4 + param3;
          if (param0 <= 80) {
            field_b = (long[]) null;
          }
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param2.charAt(param4 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param1[var7 + param5] = (byte)-128;
                    break;
                  case 8218:
                    param1[var7 + param5] = (byte)-126;
                    break;
                  case 402:
                    param1[param5 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param1[var7 + param5] = (byte)-124;
                    break;
                  case 8230:
                    param1[param5 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param5] = (byte)-122;
                    break;
                  case 8225:
                    param1[param5 + var7] = (byte)-121;
                    break;
                  case 710:
                    param1[param5 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param1[var7 + param5] = (byte)-119;
                    break;
                  case 352:
                    param1[param5 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param1[param5 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[param5 + var7] = (byte)-116;
                    break;
                  case 381:
                    param1[var7 + param5] = (byte)-114;
                    break;
                  case 8216:
                    param1[param5 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param1[param5 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param1[var7 + param5] = (byte)-109;
                    break;
                  case 8221:
                    param1[var7 + param5] = (byte)-108;
                    break;
                  case 8226:
                    param1[param5 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param1[var7 + param5] = (byte)-106;
                    break;
                  case 8212:
                    param1[var7 + param5] = (byte)-105;
                    break;
                  case 732:
                    param1[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param1[var7 + param5] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param5] = (byte)-102;
                    break;
                  case 8250:
                    param1[param5 + var7] = (byte)-101;
                    break;
                  case 339:
                    param1[var7 + param5] = (byte)-100;
                    break;
                  case 382:
                    param1[var7 + param5] = (byte)-98;
                    break;
                  case 376:
                    param1[param5 + var7] = (byte)-97;
                    break;
                  default:
                    param1[param5 + var7] = (byte)63;
                    break;
                }
              } else {
                param1[var7 + param5] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("l.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_a = (ee) null;
        }
        field_a = null;
        field_b = null;
        field_h = null;
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        mi var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 < 109) {
            return;
          }
          var1 = uh.field_Wb;
          while (kd.l(7)) {
            var1.j(8, 118);
            fieldTemp$0 = var1.field_u + 1;
            var1.field_u = var1.field_u + 1;
            var2 = fieldTemp$0;
            ml.a(var1, (byte) -25);
            uh.field_Wb.b((byte) 15, var1.field_u - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1_ref), "l.C(" + param0 + ')');
        }
    }

    l() {
        this.field_e = false;
        this.field_d = true;
        this.field_i = false;
    }

    static {
        field_a = new ee();
        field_h = new int[4];
        field_b = new long[32];
    }
}
