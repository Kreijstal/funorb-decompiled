/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rb {
    static int field_a;
    static wb field_b;

    final static void a(byte param0) {
        try {
          if (param0 != -114) {
            field_a = 53;
          }
          if (ah.field_b != null) {
            try {
              ah.field_b.a(0L, (byte) -127);
              ah.field_b.a(nf.field_l.field_g, 24, (byte) 118, nf.field_l.field_h);
            } catch (Exception exception) {
            }
          }
          nf.field_l.field_h = nf.field_l.field_h + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        ng var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          var4 = (ng) (kf.field_o.a((byte) -95));
          while (var4 != null) {
            th.a(65536, param0, var4);
            var4 = (ng) (kf.field_o.a(true));
          }
          if (param1 >= -77) {
            rb.a(-91, -27);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "rb.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          var6_int = param3 - param5;
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param1.charAt(var7 + param5);
              if ((var8 <= 0 ||
                128 <= var8) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param2[var7 + param0] = (byte)-128;
                    break;
                  case 8218:
                    param2[var7 + param0] = (byte)-126;
                    break;
                  case 402:
                    param2[param0 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param2[var7 + param0] = (byte)-124;
                    break;
                  case 8230:
                    param2[var7 + param0] = (byte)-123;
                    break;
                  case 8224:
                    param2[param0 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param2[var7 + param0] = (byte)-121;
                    break;
                  case 710:
                    param2[var7 + param0] = (byte)-120;
                    break;
                  case 8240:
                    param2[var7 + param0] = (byte)-119;
                    break;
                  case 352:
                    param2[param0 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param2[var7 + param0] = (byte)-117;
                    break;
                  case 338:
                    param2[var7 + param0] = (byte)-116;
                    break;
                  case 381:
                    param2[param0 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param2[var7 + param0] = (byte)-111;
                    break;
                  case 8217:
                    param2[var7 + param0] = (byte)-110;
                    break;
                  case 8220:
                    param2[var7 + param0] = (byte)-109;
                    break;
                  case 8221:
                    param2[var7 + param0] = (byte)-108;
                    break;
                  case 8226:
                    param2[param0 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param2[var7 + param0] = (byte)-106;
                    break;
                  case 8212:
                    param2[param0 + var7] = (byte)-105;
                    break;
                  case 732:
                    param2[param0 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param2[var7 + param0] = (byte)-103;
                    break;
                  case 353:
                    param2[var7 + param0] = (byte)-102;
                    break;
                  case 8250:
                    param2[param0 + var7] = (byte)-101;
                    break;
                  case 339:
                    param2[param0 + var7] = (byte)-100;
                    break;
                  case 382:
                    param2[var7 + param0] = (byte)-98;
                    break;
                  case 376:
                    param2[param0 + var7] = (byte)-97;
                    break;
                  default:
                    param2[var7 + param0] = (byte)63;
                    break;
                }
              } else {
                param2[param0 + var7] = (byte)var8;
              }
            }
          }
          if (param4 == -116) {
            stackIn_70_0 = var6_int;
            return stackIn_70_0;
          }
          stackIn_68_0 = 29;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("rb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (nk.field_b != null) {
            if (param0 >= 0) {
              decompiledFrameRemainder0 = (ll.field_Q == lj.field_z);
              if ((decompiledFrameRemainder0) && (ff.field_D.field_h == 0 &&
                (10000L + td.field_b) < lk.a(0))) {
                ff.field_D.a(false, param0);
              }
            } else {
              if (ff.field_D.field_h == 0 &&
                (10000L + td.field_b) < lk.a(0)) {
                ff.field_D.a(false, param0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param1 != -377) {
                rb.a(81, (byte) 3);
              }
              if (ff.field_D.field_h > 0) {
                try {
                  nk.field_b.a((byte) 9, ff.field_D.field_g, ff.field_D.field_h, 0);
                  td.field_b = lk.a(0);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  pc.a(1);
                }
                ff.field_D.field_h = 0;
              }
              return;
            }
          }
          ff.field_D.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = se.field_o;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (param0 >= -63) {
            rb.a(-55);
          }
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = hj.a((byte) -125, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!uf.a(var4.charAt(0), (byte) -96) &&
                !uf.a(var4.charAt(-1 + var4.length()), (byte) -128)) {
                var5 = 0;
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (uf.a((char) var7, (byte) -98)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param2) {
                    stackIn_30_0 = ng.field_g;
                    return stackIn_30_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = kd.field_d;
                return stackIn_35_0;
              }
              stackIn_20_0 = kd.field_d;
              return stackIn_20_0;
            }
            stackIn_15_0 = se.field_o;
            return stackIn_15_0;
          }
          stackIn_10_0 = se.field_o;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("rb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -23) {
          field_b = (wb) null;
        }
        field_b = null;
    }

    static {
    }
}
