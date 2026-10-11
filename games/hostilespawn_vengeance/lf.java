/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lf {
    int field_a;
    private b field_e;
    int field_d;
    int field_c;
    int field_b;

    final static void a(byte param0) {
        int var5 = 0;
        int var7 = 0;
        bd stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        bd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var6 = null;
        int var8 = 0;
        bd var9 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = -61 / ((-66 - param0) / 51);
          for (var5 = 0; var5 < el.field_j; var5++) {
            var6 = mm.field_m[var5];
            if (!var6.field_b) {
              stackIn_6_0 = null;
            } else {
              stackIn_6_0 = var6.g(-28);
            }
            var9 = stackIn_6_0;
            var1 = var9;
            if (var1 != null) {
              var2 = var6.f((byte) 120);
              var3 = var6.f(121);
              if (var2 >= -96 &&
                var3 >= -96 &&
                var2 <= 736 &&
                576 >= var3) {
                kf.a(eh.field_a.field_D, 0, eh.field_a.field_D.length);
                eh.field_a.a();
                var9.a(true, 128, (int)var6.field_c, 48, 48);
                for (var7 = 0; eh.field_a.field_D.length > var7; var7++) {
                  if (eh.field_a.field_D[var7] != 0) {
                    eh.field_a.field_D[var7] = 1;
                  }
                }
                eh.field_a.e(1);
                si.d(32, 32, 0, 0, eh.field_a.field_u, eh.field_a.field_r);
                o.field_n.b((byte) -98);
                eh.field_a.b(var2 - 12 - 48, -48 + (-12 + var3), 92);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "lf.C(" + param0 + ')');
        }
    }

    void a(int param0, int param1, oj param2) {
        oj var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != 576) {
            var5 = (oj) null;
            this.a(49, 28, (oj) null);
          }
          if (this.field_c != param0) {
            if (this.field_d <= this.field_b) {
              return;
            }
            this.field_d = this.field_d - 1;
          } else {
            if (this.field_a > this.field_d) {
              this.field_d = this.field_d + 1;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("lf.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (null != this.field_e) {
          eh.field_c.a(this.field_e);
          this.field_e = null;
        }
        if (param0 != 18421) {
          this.field_e = (b) null;
        }
    }

    lf(int param0, int param1, int param2) {
        this.field_a = param2;
        this.field_c = param0;
        this.field_b = param1;
        this.field_d = this.field_b;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = 80 % ((param0 - 32) / 39);
        im.field_e.a(0, 0, (byte) 126);
    }

    lf() {
    }

    final void b(int param0) {
        if (this.field_d > 0) {
          if (null == this.field_e &&
            null != ua.field_c &&
            -1 + ua.field_c.length > this.field_c &&
            null != ua.field_c[-1 + this.field_c]) {
            this.field_e = b.a(ua.field_c[-1 + this.field_c], 100, this.field_d);
            this.field_e.d(-1);
            eh.field_c.b(this.field_e);
          }
        } else {
          if (this.field_e != null) {
            eh.field_c.a(this.field_e);
            this.field_e = null;
          }
        }
        if (param0 <= 25) {
          lf.a((byte) -50);
        }
        if (this.field_e != null) {
          this.field_e.f(this.field_d * uh.field_i / 64);
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_68_0 = null;
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
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
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
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          if (param0 == 113) {
            stackIn_70_0 = var3;
            return stackIn_70_0;
          }
          stackIn_68_0 = (byte[]) null;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_73_0 = var2;
          stackIn_73_1 = new StringBuilder().append("lf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    static {
    }
}
