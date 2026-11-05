/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends jb {
    int field_f;
    int field_l;
    static dl[] field_g;
    int field_h;
    int field_n;
    int field_j;
    static int[] field_m;
    static ko[] field_i;
    fo field_k;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        hp var4 = null;
        ak var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          var4 = (hp) (cf.field_c.g(32073));
          while (var4 != null) {
            tb.a(param0, var4, (byte) -125);
            var4 = (hp) (cf.field_c.a(false));
          }
          var5 = (ak) (hd.field_d.g(32073));
          if (param1 != -98) {
            field_m = (int[]) null;
          }
          while (var5 != null) {
            j.a(var5, param0, false);
            var5 = (ak) (hd.field_d.a(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "fo.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        if (param0 != -56) {
          fo.a(-54, (byte) 61);
        }
        field_m = null;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, byte param4, int param5) {
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
        CharSequence var10 = null;
        var9 = CrazyCrystals.field_B;
        try {
          if (param4 < 112) {
            var10 = (CharSequence) null;
            fo.a(-11, (byte[]) null, 31, (CharSequence) null, (byte) -124, 11);
          }
          var6_int = -param5 + param2;
          for (var7 = 0; var6_int > var7; var7++) {
            {
              var8 = param3.charAt(param5 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param1[param0 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param1[param0 + var7] = (byte)-126;
                    break;
                  case 402:
                    param1[param0 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param1[var7 + param0] = (byte)-124;
                    break;
                  case 8230:
                    param1[var7 + param0] = (byte)-123;
                    break;
                  case 8224:
                    param1[var7 + param0] = (byte)-122;
                    break;
                  case 8225:
                    param1[param0 + var7] = (byte)-121;
                    break;
                  case 710:
                    param1[var7 + param0] = (byte)-120;
                    break;
                  case 8240:
                    param1[param0 + var7] = (byte)-119;
                    break;
                  case 352:
                    param1[var7 + param0] = (byte)-118;
                    break;
                  case 8249:
                    param1[param0 + var7] = (byte)-117;
                    break;
                  case 338:
                    param1[var7 + param0] = (byte)-116;
                    break;
                  case 381:
                    param1[var7 + param0] = (byte)-114;
                    break;
                  case 8216:
                    param1[var7 + param0] = (byte)-111;
                    break;
                  case 8217:
                    param1[var7 + param0] = (byte)-110;
                    break;
                  case 8220:
                    param1[param0 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param1[param0 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param1[param0 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param1[var7 + param0] = (byte)-106;
                    break;
                  case 8212:
                    param1[param0 + var7] = (byte)-105;
                    break;
                  case 732:
                    param1[var7 + param0] = (byte)-104;
                    break;
                  case 8482:
                    param1[var7 + param0] = (byte)-103;
                    break;
                  case 353:
                    param1[var7 + param0] = (byte)-102;
                    break;
                  case 8250:
                    param1[param0 + var7] = (byte)-101;
                    break;
                  case 339:
                    param1[var7 + param0] = (byte)-100;
                    break;
                  case 382:
                    param1[param0 + var7] = (byte)-98;
                    break;
                  case 376:
                    param1[var7 + param0] = (byte)-97;
                    break;
                  default:
                    param1[var7 + param0] = (byte)63;
                    break;
                }
              } else {
                param1[param0 + var7] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("fo.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, dl param1) {
        try {
          mb.field_b = param1;
          int var2_int = 84 / ((-64 - param0) / 41);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "fo.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        rm var1 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        Object var2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (null != om.field_x) {
            var1 = dc.a(true, om.field_x, (byte) 51);
            if (var1 != null) {
              var2 = gf.field_c;
              synchronized (var2) {
                gf.field_c.a();
                fq.field_x.a(88, var1, true);
              }
              om.field_x = null;
            }
          }
          if (null == dc.a(false, "menu", (byte) 19)) {
            return;
          }
          for (var1_int = param0; hf.field_b.length > var1_int; var1_int++) {
            if (dc.a(false, hf.field_b[var1_int], (byte) -110) == null) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "fo.C(" + param0 + ')');
        }
    }

    fo(int param0, int param1, int param2, int param3, int param4) {
        this.field_h = param2;
        this.field_n = param0;
        this.field_j = param3;
        this.field_l = param4;
        this.field_f = param1;
    }

    static {
    }
}
