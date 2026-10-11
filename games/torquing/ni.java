/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends q {
    int field_k;
    static sm[] field_l;
    byte[] field_j;

    final static void a(nj param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        try {
          var2 = Torquing.field_v;
          synchronized (var2) {
            Torquing.field_v.field_r.b(param0);
            if (!param1) {
              field_l = (sm[]) null;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("ni.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
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
        var9 = Torquing.field_u;
        try {
          var6_int = -param2 + param5;
          if (param3 != -12421) {
            field_l = (sm[]) null;
          }
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param1.charAt(var7 + param2);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param4[param0 + var7] = (byte)-128;
                    break;
                  case 8218:
                    param4[var7 + param0] = (byte)-126;
                    break;
                  case 402:
                    param4[param0 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param4[param0 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param4[param0 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param4[param0 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param4[param0 + var7] = (byte)-121;
                    break;
                  case 710:
                    param4[param0 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param4[var7 + param0] = (byte)-119;
                    break;
                  case 352:
                    param4[var7 + param0] = (byte)-118;
                    break;
                  case 8249:
                    param4[param0 + var7] = (byte)-117;
                    break;
                  case 338:
                    param4[param0 + var7] = (byte)-116;
                    break;
                  case 381:
                    param4[var7 + param0] = (byte)-114;
                    break;
                  case 8216:
                    param4[param0 + var7] = (byte)-111;
                    break;
                  case 8217:
                    param4[param0 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param4[param0 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param4[var7 + param0] = (byte)-108;
                    break;
                  case 8226:
                    param4[var7 + param0] = (byte)-107;
                    break;
                  case 8211:
                    param4[param0 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param4[var7 + param0] = (byte)-105;
                    break;
                  case 732:
                    param4[var7 + param0] = (byte)-104;
                    break;
                  case 8482:
                    param4[param0 + var7] = (byte)-103;
                    break;
                  case 353:
                    param4[var7 + param0] = (byte)-102;
                    break;
                  case 8250:
                    param4[var7 + param0] = (byte)-101;
                    break;
                  case 339:
                    param4[param0 + var7] = (byte)-100;
                    break;
                  case 382:
                    param4[var7 + param0] = (byte)-98;
                    break;
                  case 376:
                    param4[param0 + var7] = (byte)-97;
                    break;
                  default:
                    param4[var7 + param0] = (byte)63;
                    break;
                }
              } else {
                param4[var7 + param0] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("ni.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, long param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          nj var8 = null;
          String var9 = null;
          String var10 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var9 = param1.getParameter("cookiehost");
              var7 = var9;
              var7Lifetime1 = var9;
              var10 = param4 + "=" + param2 + "; version=1; path=/; domain=" + var9;
              var7Lifetime2 = var10;
              var7Lifetime3 = var10;
              if (param0 < 69) {
                var8 = (nj) null;
                ni.a((nj) null, false);
              }
              if (param3 >= 0L) {
                var7Lifetime4 = var10 + "; Expires=" + ka.a(param3 * 1000L + km.b(-1), -2) + "; Max-Age=" + param3;
              } else {
                var7Lifetime4 = var10 + "; Discard;";
              }
              hp.a("document.cookie=\"" + var7Lifetime4 + "\"", 27476, param1);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("ni.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static k a(int param0, int param1) {
        int var3 = 0;
        int var4 = Torquing.field_u;
        k[] var5 = vc.c(0);
        k[] var2 = var5;
        for (var3 = 0; var5.length > var3; var3++) {
          if (~var5[var3].field_g == ~param1) {
            return var5[var3];
          }
        }
        if (param0 >= 74) {
          return null;
        }
        field_l = (sm[]) null;
        return null;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 >= -25) {
          field_l = (sm[]) null;
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param0.getGraphics();
            mk.field_b.a(86, param2, param1, var4);
            var4.dispose();
            var5 = -27 / ((69 - param3) / 50);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_6_0 = var4_ref2;
          stackIn_6_1 = new StringBuilder().append("ni.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
    }
}
