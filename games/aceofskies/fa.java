/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fa {
    static int field_a;
    static rb field_c;
    static eh field_b;

    final static bo a(ha param0, boolean param1) {
        mq var2 = null;
        bo var3 = null;
        bo stackIn_2_0 = null;
        bo stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (ns.field_a == param0) {
            stackIn_2_0 = un.field_f;
            return stackIn_2_0;
          }
          if (!param1) {
            fa.a(72);
          }
          var2 = (mq) (ca.field_i.a((byte) 106, (long)param0.field_c));
          if (var2 != null &&
            var2.field_f == param0) {
            var3 = var2.field_j;
          } else {
            if (var2 != null) {
              var2.c(-124);
            }
            var3 = new bo(param0);
            ca.field_i.a(123, (long)param0.field_c, new mq(param0, var3));
          }
          un.field_f = var3;
          ns.field_a = param0;
          stackIn_13_0 = var3;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("fa.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = (eh) null;
        }
        field_b = null;
        field_c = null;
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          var2_int = param0.length();
          if (param1 != 8482) {
            field_a = -8;
          }
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                128 <= var5) && (var5 < 160 ||
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
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("fa.C(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.awt.Canvas a(int param0) {
        if (param0 != -8213) {
          fa.a(false);
        }
        return jf.field_a == null ? ci.field_f : (java.awt.Canvas) ((Object) jf.field_a);
    }

    static {
        field_a = 0;
        field_c = new rb(256);
    }
}
