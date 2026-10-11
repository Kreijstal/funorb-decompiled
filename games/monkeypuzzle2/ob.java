/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fb {
    gk field_o;
    int field_p;
    static pj field_s;
    byte field_q;
    static int field_r;

    public static void f(int param0) {
        if (param0 != 8364) {
          field_s = (pj) null;
        }
        field_s = null;
    }

    final static void b(byte param0) {
        if (null == tj.field_d) {
          if (param0 != -19) {
            ob.f(119);
          }
          tj.field_d = li.a(ke.field_h[7], 100, 96);
          na.a((byte) 85, tj.field_d);
          return;
        }
        if (tj.field_d.h()) {
          if (param0 != -19) {
            ob.f(119);
          }
          tj.field_d = li.a(ke.field_h[7], 100, 96);
          na.a((byte) 85, tj.field_d);
          return;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          return -73;
        }
        if (null == this.field_o) {
          return 0;
        }
        return this.field_o.field_h * 100 / (-this.field_q + this.field_o.field_g.length);
    }

    ob() {
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
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
        byte[] var10 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var6_int = param5 - param3;
          if (param0 >= -71) {
            var10 = (byte[]) null;
            ob.a(-46, (CharSequence) null, (byte[]) null, 83, 110, -101);
          }
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param1.charAt(param3 + var7);
              if ((0 >= var8 ||
                128 <= var8) && (var8 < 160 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param2[param4 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param2[param4 + var7] = (byte)-126;
                    break;
                  case 402:
                    param2[param4 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param2[var7 + param4] = (byte)-124;
                    break;
                  case 8230:
                    param2[var7 + param4] = (byte)-123;
                    break;
                  case 8224:
                    param2[param4 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param2[param4 + var7] = (byte)-121;
                    break;
                  case 710:
                    param2[param4 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param2[param4 + var7] = (byte)-119;
                    break;
                  case 352:
                    param2[param4 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param2[param4 + var7] = (byte)-117;
                    break;
                  case 338:
                    param2[param4 + var7] = (byte)-116;
                    break;
                  case 381:
                    param2[var7 + param4] = (byte)-114;
                    break;
                  case 8216:
                    param2[param4 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param2[var7 + param4] = (byte)-110;
                    break;
                  case 8220:
                    param2[var7 + param4] = (byte)-109;
                    break;
                  case 8221:
                    param2[var7 + param4] = (byte)-108;
                    break;
                  case 8226:
                    param2[var7 + param4] = (byte)-107;
                    break;
                  case 8211:
                    param2[var7 + param4] = (byte)-106;
                    break;
                  case 8212:
                    param2[var7 + param4] = (byte)-105;
                    break;
                  case 732:
                    param2[param4 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param2[var7 + param4] = (byte)-103;
                    break;
                  case 353:
                    param2[param4 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param2[var7 + param4] = (byte)-101;
                    break;
                  case 339:
                    param2[param4 + var7] = (byte)-100;
                    break;
                  case 382:
                    param2[param4 + var7] = (byte)-98;
                    break;
                  case 376:
                    param2[var7 + param4] = (byte)-97;
                    break;
                  default:
                    param2[var7 + param4] = (byte)63;
                    break;
                }
              } else {
                param2[param4 + var7] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("ob.E(").append(param0).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final byte[] e(int param0) {
        if (this.field_j) {
          throw new RuntimeException();
        }
        if (this.field_o.field_h >= -this.field_q + this.field_o.field_g.length) {
          int var2 = 38 % ((25 - param0) / 41);
          return this.field_o.field_g;
        }
        throw new RuntimeException();
    }

    static {
        field_s = new pj();
        field_r = 0;
    }
}
