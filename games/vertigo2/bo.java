/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends li {
    boolean field_n;
    private int field_r;
    int field_q;
    int[] field_o;
    static String field_p;
    int field_s;

    private final int a(byte param0, int param1) {
        if (param0 != 117) {
          this.a((byte) -58);
        }
        return param1;
    }

    private final void e(int param0) {
        this.field_r = 0;
        if (param0 > -67) {
          mi var3 = (mi) null;
          this.a(13, (mi) null);
        }
    }

    final boolean a(byte param0) {
        int discarded$1 = 0;
        boolean stackIn_7_0 = false;
        if (param0 != 76) {
          discarded$1 = this.a((byte) -101, 83);
        }
        stackIn_7_0 = (this.field_r == 10) || (this.field_n);
        return stackIn_7_0;
    }

    final boolean b(int param0, int param1) {
        int fieldTemp$0 = this.field_r;
        this.field_r = this.field_r + 1;
        this.field_o[fieldTemp$0] = param0;
        if (param1 != -11) {
          this.field_n = false;
        }
        return this.field_r == 10 ? true : false;
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 <= 65) {
          CharSequence var2 = (CharSequence) null;
          bo.a((CharSequence) null, 23);
        }
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var4 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new byte[var2_int];
          if (param1 != -711) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (var5 < 160 ||
                255 < var5)) {
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
          stackIn_70_0 = var3;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_73_0 = var2;
          stackIn_73_1 = new StringBuilder().append("bo.C(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void f(int param0) {
        this.field_o = new int[10];
        if (param0 != -7307) {
          this.field_n = false;
        }
    }

    final void a(int param0, mi param1) {
        int var3_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        try {
          param1.j(63, param0 + 124);
          param1.d(false);
          param1.a((byte) 114, 8, this.field_q);
          for (var3_int = param0; var3_int < 10; var3_int++) {
            param1.a((byte) 118, 6, this.a((byte) 117, this.field_o[var3_int]));
          }
          param1.q(param0 - 9);
          this.e(-85);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bo(int param0, int param1) {
        this.field_s = param1;
        short fieldTemp$0 = sk.field_a;
        sk.field_a = (short)(sk.field_a + 1);
        this.field_q = fieldTemp$0 % 255;
        this.f(-7307);
    }

    static {
        field_p = "Disruptive behaviour";
    }
}
