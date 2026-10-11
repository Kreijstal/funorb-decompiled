/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class v {
    static w[] field_f;
    ml field_i;
    ml field_e;
    ml field_h;
    ml field_m;
    int field_g;
    long field_k;
    wi field_a;
    wi field_c;
    byte field_j;
    volatile int field_d;
    volatile int field_l;
    lf field_b;

    final int c(int param0) {
        if (param0 != -8217) {
          this.a(true);
        }
        return this.field_i.a((byte) 12) + this.field_e.a((byte) 12);
    }

    abstract boolean a(byte param0);

    final boolean b(boolean param0) {
        if (param0) {
          this.field_c = (wi) null;
        }
        return this.c(-8217) >= 20 ? true : false;
    }

    final static void d(byte param0) {
        if (param0 <= 37) {
          v.b(-27);
        }
        if (!vc.d((byte) -96)) {
          return;
        }
        nj.a(false, -25698, 4);
    }

    public static void b(int param0) {
        if (param0 != -8217) {
          return;
        }
        field_f = null;
    }

    abstract void a(byte param0, Object param1, boolean param2);

    final static int a(byte[] param0, CharSequence param1, int param2, int param3, byte param4, int param5) {
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
        var9 = Bounce.field_N;
        try {
          if (param4 != -110) {
            v.b(76);
          }
          var6_int = param2 - param3;
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param1.charAt(var7 + param3);
              if ((0 >= var8 ||
                128 <= var8) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param0[var7 + param5] = (byte)-128;
                    break;
                  case 8218:
                    param0[param5 + var7] = (byte)-126;
                    break;
                  case 402:
                    param0[param5 + var7] = (byte)-125;
                    break;
                  case 8222:
                    param0[param5 + var7] = (byte)-124;
                    break;
                  case 8230:
                    param0[param5 + var7] = (byte)-123;
                    break;
                  case 8224:
                    param0[var7 + param5] = (byte)-122;
                    break;
                  case 8225:
                    param0[var7 + param5] = (byte)-121;
                    break;
                  case 710:
                    param0[param5 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param0[var7 + param5] = (byte)-119;
                    break;
                  case 352:
                    param0[param5 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param0[var7 + param5] = (byte)-117;
                    break;
                  case 338:
                    param0[var7 + param5] = (byte)-116;
                    break;
                  case 381:
                    param0[param5 + var7] = (byte)-114;
                    break;
                  case 8216:
                    param0[var7 + param5] = (byte)-111;
                    break;
                  case 8217:
                    param0[var7 + param5] = (byte)-110;
                    break;
                  case 8220:
                    param0[param5 + var7] = (byte)-109;
                    break;
                  case 8221:
                    param0[param5 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param0[var7 + param5] = (byte)-107;
                    break;
                  case 8211:
                    param0[var7 + param5] = (byte)-106;
                    break;
                  case 8212:
                    param0[param5 + var7] = (byte)-105;
                    break;
                  case 732:
                    param0[param5 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param0[var7 + param5] = (byte)-103;
                    break;
                  case 353:
                    param0[var7 + param5] = (byte)-102;
                    break;
                  case 8250:
                    param0[var7 + param5] = (byte)-101;
                    break;
                  case 339:
                    param0[param5 + var7] = (byte)-100;
                    break;
                  case 382:
                    param0[var7 + param5] = (byte)-98;
                    break;
                  default:
                    param0[var7 + param5] = (byte)63;
                    break;
                  case 376:
                    param0[var7 + param5] = (byte)-97;
                    break;
                }
              } else {
                param0[param5 + var7] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("v.L(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        if (param0 < 32) {
          this.a(false);
        }
        return 20 <= this.a(true) ? true : false;
    }

    final lf a(int param0, byte param1, int param2, boolean param3, int param4) {
        long var6 = (long)param0 + ((long)param4 << 32);
        lf var8 = new lf();
        var8.field_s = param1;
        var8.field_j = var6;
        int var9 = 25 % ((param2 + 13) / 49);
        var8.field_m = param3 ? true : false;
        if (!param3) {
          if (!(this.a(true) < 20)) {
            throw new RuntimeException();
          }
          this.field_h.a((byte) -78, var8);
        } else {
          if (this.c(-8217) >= 20) {
            throw new RuntimeException();
          }
          this.field_i.a((byte) -78, var8);
        }
        return var8;
    }

    final int a(boolean param0) {
        if (!param0) {
          CharSequence var3 = (CharSequence) null;
          v.a((byte[]) null, (CharSequence) null, 42, 22, (byte) -44, -125);
        }
        return this.field_h.a((byte) 12) + this.field_m.a((byte) 12);
    }

    abstract void a(int param0);

    abstract void c(byte param0);

    v() {
        this.field_i = new ml();
        this.field_e = new ml();
        this.field_h = new ml();
        this.field_m = new ml();
        this.field_a = new wi(6);
        this.field_j = (byte) 0;
        this.field_l = 0;
        this.field_d = 0;
        this.field_c = new wi(10);
    }

    static {
        int var0 = 0;
        field_f = new w[255];
        for (var0 = 0; var0 < field_f.length; var0++) {
          field_f[var0] = new w();
        }
    }
}
