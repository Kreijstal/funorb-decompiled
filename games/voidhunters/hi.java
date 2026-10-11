/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi implements dja {
    static int field_a;
    static int field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          CharSequence var4 = (CharSequence) null;
          hi.a((CharSequence) null, 67);
        }
        return (tv[]) ((Object) new vpa[param1]);
    }

    final static byte[] a(CharSequence param0, int param1) {
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          var2_int = param0.length();
          var3 = new byte[var2_int];
          var4 = 0;
          if (param1 < 66) {
            field_b = -83;
          }
          while (var2_int > var4) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (160 > var5 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
            var4++;
          }
          stackIn_68_0 = var3;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_71_0 = var2;
          stackIn_71_1 = new StringBuilder().append("hi.D(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(')').toString());
        }
    }

    public final tv a(byte param0) {
        int var2 = 118 % ((param0 + 64) / 50);
        return (tv) ((Object) new vpa());
    }

    final static phb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        phb[] var10;
        phb[] var11_ref_phb__;
        int var11;
        int var12;
        phb var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = VoidHunters.field_G;
        var9 = param1 - (-param5 - param6);
        var10 = new phb[]{new phb(var9, var9), new phb(param3, var9), new phb(var9, var9), new phb(var9, param3), new phb(64, 64), new phb(var9, param3), new phb(var9, var9), new phb(param3, var9), new phb(var9, var9)};
        var11_ref_phb__ = var10;
        for (var12 = 0; var11_ref_phb__.length > var12; var12++) {
          var13 = var11_ref_phb__[var12];
          for (var14 = 0; var14 < var13.field_r.length; var14++) {
            var13.field_r[var14] = param2;
          }
        }
        if (param0 != -972) {
          field_a = -15;
        }
        for (var11 = 0; param1 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_r[var12Lifetime1 + (-var11 + (var9 - 1)) * var9] = param8;
            var10[8].field_r[(var9 + (-var11 - 1)) * var9 + var12Lifetime1] = param8;
            var10[2].field_r[var9 * var12Lifetime1 - var11 - 1 + var9] = param8;
            var10[8].field_r[var9 - (1 + var11 - var9 * var12Lifetime1)] = param8;
          }
        }
        for (var11Lifetime1 = 0; param1 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_r[var12Lifetime2 + var11Lifetime1 * var9] = param7;
            var10[0].field_r[var12Lifetime2 * var9 + var11Lifetime1] = param7;
            if (var12Lifetime2 < (-var11Lifetime1 + var9)) {
              var10[2].field_r[var12Lifetime2 + var9 * var11Lifetime1] = param7;
              var10[6].field_r[var11Lifetime1 + var9 * var12Lifetime2] = param7;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param3; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param1; var12Lifetime3++) {
            var10[7].field_r[var11Lifetime2 + (-1 + (var9 - var12Lifetime3)) * param3] = param8;
            var10[5].field_r[-1 + var9 + (-var12Lifetime3 + var9 * var11Lifetime2)] = param8;
            var10[1].field_r[param3 * var12Lifetime3 + var11Lifetime2] = param7;
            var10[3].field_r[var12Lifetime3 + var9 * var11Lifetime2] = param7;
          }
        }
        for (var11Lifetime3 = 0; var11Lifetime3 < param3 >> 1; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param6; var12Lifetime4++) {
            var10[1].field_r[var11Lifetime3 + param3 * (-1 + var9 - var12Lifetime4)] = param4;
            var10[3].field_r[var11Lifetime3 * var9 + (-var12Lifetime4 - 1 + var9)] = param4;
            var10[7].field_r[var11Lifetime3 + param3 * var12Lifetime4] = param4;
            var10[5].field_r[var11Lifetime3 * var9 + var12Lifetime4] = param4;
          }
        }
        return var10;
    }

    static {
    }
}
