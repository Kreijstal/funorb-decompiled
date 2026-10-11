/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private int field_j;
    int field_l;
    private int[] field_k;
    static int[] field_h;
    int field_i;
    int field_q;
    private int[] field_e;
    private ih field_s;
    private int field_d;
    int field_f;
    private String field_o;
    private int[] field_m;
    private int field_b;
    int field_p;
    private int[] field_r;
    private int field_g;
    private int[] field_a;
    private ed field_n;
    int field_c;

    final void a(boolean param0, boolean param1, byte param2) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var9_int;
        int var10;
        int var11;
        int var12;
        int var8Lifetime1;
        var12 = EscapeVector.field_A;
        var4 = this.field_f + this.field_p;
        if (param2 <= 16) {
          return;
        }
        var5 = this.field_l + this.field_i;
        var6 = 0;
        if (param1) {
          var6 = 2;
        }
        if (param0) {
          var6 = 1;
        }
        var7 = this.b((byte) -102);
        if (this.field_d == 2) {
          if (!param0) {
            var8 = 1;
            em.a(1 + this.field_f, 1 + this.field_n.field_z + this.field_l, -2 + this.field_p, -2 + this.field_i - this.field_n.field_z, var8);
          } else {
            fc.a(var7, this.field_f - 2, var4 + 2, 2 + var5, true, 29788, false, this.field_e[1], this.field_m[1], this.field_g, -2 + this.field_l, false);
          }
          this.field_n.d(this.field_f, this.field_l);
        }
        if (this.field_d == 3) {
          fc.a(var7, this.field_f, var4, var5, true, 29788, false, this.field_e[var6], this.field_m[var6], this.field_g, this.field_l, false);
        }
        if (this.field_d != 0) {
          if (this.field_d != 1) {
            if (this.field_d == 4) {
              var8Lifetime1 = this.c(-18641);
              var9 = this.field_b + " - ";
              this.field_s.b(var9, this.field_f + this.field_j, var8Lifetime1, this.field_r[1], -1);
              this.field_s.a(this.field_o, this.field_f + this.field_j, var8Lifetime1, this.field_r[var6], -1);
              if (this.field_n != null) {
                this.field_n.e(var4 - this.field_n.field_A, this.field_l);
              }
            } else {
              var8Lifetime1 = this.c(-18641);
              var9_int = this.field_p / 2 + this.field_f;
              lb.a(var8Lifetime1, this.field_o, this.field_r[var6], -128, var9_int);
            }
          } else {
            if (param0) {
              stackIn_19_0 = this.field_k[1];
            } else {
              stackIn_19_0 = this.field_k[0];
            }
            var8Lifetime1 = stackIn_19_0;
            if (param0) {
              stackIn_22_0 = this.field_a[1];
            } else {
              stackIn_22_0 = this.field_a[0];
            }
            var9_int = stackIn_22_0;
            var10 = this.field_f + (this.field_p - var8Lifetime1) / 2;
            var11 = this.field_l + (-var9_int + this.field_i) / 2;
            this.field_n.a(var10, var11, var8Lifetime1, var9_int);
          }
        } else {
          var8Lifetime1 = 1;
          em.c(this.field_f, this.field_l, this.field_n.field_A, this.field_n.field_z, this.field_m[var6], var8Lifetime1);
          this.field_n.a(this.field_f, this.field_l, this.field_e[var6]);
        }
        return;
    }

    private final void h(int param0) {
        int var6_int = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        int var7;
        int var5Lifetime1;
        var7 = EscapeVector.field_A;
        if (this.field_d != 4) {
          return;
        }
        var2 = this.field_f + this.field_j;
        var3 = this.field_p + this.field_f;
        var4 = 1 + var3 - var2;
        var5 = this.field_s.b(this.field_o);
        if (var5 <= var4) {
          return;
        }
        for (var6_int = this.field_o.length(); var6_int >= 0; var6_int--) {
          this.field_o = this.field_o.substring(0, var6_int);
          var5Lifetime1 = this.field_s.b(this.field_o);
          if (var4 < var5Lifetime1) {
            continue;
          }
          break;
        }
        var6 = oe.field_cc;
        if (this.field_o.length() <= var6.length()) {
          return;
        }
        this.field_o = this.field_o.substring(0, this.field_o.length() - var6.length()) + var6;
        if (param0 != 160) {
          this.a(true, false, (byte) 77);
        }
    }

    dk(int param0, int param1, String param2, int param3, ed param4, int param5, ih param6) {
        this(param0, param1, param2, param3, param6);
        try {
          this.field_n = param4;
          this.field_g = param5;
          this.field_p = this.d(-1);
          this.field_i = this.a((byte) -16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(boolean param0) {
        if (param0) {
          return -31;
        }
        if (this.field_n == null) {
          return 0;
        }
        return this.field_n.field_A;
    }

    private final int d(int param0) {
        if (param0 != -1) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, (int[]) null, -13);
        }
        int var2 = this.b(0);
        int var3 = this.a(false);
        return var3 > var2 ? var3 : var2;
    }

    final void a(int[] param0, int[] param1, int param2) {
        try {
          if (param2 != -2) {
            this.field_d = -77;
          }
          this.field_m = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
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
        var6 = EscapeVector.field_A;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          if (param0 != -14) {
            field_h = (int[]) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param1.charAt(var4);
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
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("dk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final void a(int[] param0, int[] param1, byte param2, int[] param3) {
        this.a(param1, param0, -2);
        if (param2 > -120) {
          return;
        }
        try {
          this.field_r = param3;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(byte param0) {
        if (this.field_d == 1) {
          return 0;
        }
        int var2 = this.f(-95);
        if (param0 != -16) {
          this.field_q = 0;
        }
        int var3 = this.a(param0 + 16);
        return var3 + var2;
    }

    dk(int param0, int param1, String param2, int param3, int param4, ih param5) {
        this(param0, param1, param2, param3, param5);
        try {
          this.field_g = param4;
          this.field_p = this.d(-1);
          this.field_i = this.a((byte) -16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final int c(int param0) {
        int var2 = this.field_i + this.field_l;
        if (param0 != -18641) {
          this.field_e = (int[]) null;
        }
        int var3 = -3 + var2 - this.field_s.field_x;
        return var3;
    }

    final static void e(int param0) {
        int var7 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        dc var4 = null;
        int var4_int = 0;
        int var5 = 0;
        cc var5_ref_cc = null;
        int[] var6 = null;
        int var8 = 0;
        c var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = EscapeVector.field_A;
        try {
          var10 = om.field_g;
          var2 = var10.e(0);
          var3 = var10.e(0);
          if (param0 != 108457410) {
            return;
          }
          if (var2 == 0) {
            var4 = (dc) (en.field_i.a(false));
            if (var4 == null) {
              nm.a(16);
              return;
            }
            var5 = -var10.field_m + hi.field_r;
            var12 = var4.field_h;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.e(0) << (ae.a(3, var7) << 8));
            }
            var4.field_g = true;
            var4.c((byte) -105);
            return;
          }
          if (var2 == 1) {
            var4_int = var10.e((byte) 106);
            var5_ref_cc = (cc) (vn.field_e.a(false));
            while (var5_ref_cc != null) {
              if (var5_ref_cc.field_i != var3 ||
                var4_int != var5_ref_cc.field_m) {
                var5_ref_cc = (cc) (vn.field_e.b((byte) 70));
                continue;
              }
              break;
            }
            if (var5_ref_cc != null) {
              var5_ref_cc.c((byte) -62);
              return;
            }
            stackIn_13_0 = param0;
            stackIn_13_1 = 108457426;
            nm.a(stackIn_13_0 ^ stackIn_13_1);
            return;
          }
          pf.a(false, "LR1: " + hf.b((byte) 36), (Throwable) null);
          nm.a(16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "dk.H(" + param0 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        var4 = this.field_p + this.field_f;
        if (this.field_f <= param1 &&
          param1 < var4) {
          if (param0 != 65) {
            return true;
          }
          var5 = this.field_l + this.field_i;
          if (this.field_l <= param2 &&
            param2 < var5) {
            return true;
          }
          return false;
        }
        return false;
    }

    private final int f(int param0) {
        int var2 = this.field_s.field_r + this.field_s.field_x;
        int var3 = var2 + 3 + 3;
        int var4 = -101 / ((param0 - 47) / 63);
        return var3;
    }

    private final int b(int param0) {
        if (this.field_d == 1) {
          return 0;
        }
        String var2 = " ";
        if (param0 != 0) {
          this.h(-121);
        }
        int var3 = this.field_s.b(var2);
        int var4 = this.field_s.b(this.field_o);
        var4 = var4 + 4 * var3;
        return var4;
    }

    private final int a(int param0) {
        int discarded$0 = 0;
        if (null == this.field_n) {
          return 0;
        }
        if (param0 != 0) {
          discarded$0 = this.a(true);
        }
        return this.field_n.field_z;
    }

    final void b(byte param0, int param1, int param2) {
        int var4 = 126 / ((78 - param0) / 36);
        this.field_l = param2;
        this.field_f = param1;
    }

    private final int b(byte param0) {
        int var2 = 87 % ((-24 - param0) / 41);
        if (1 == this.field_d) {
          return 0;
        }
        return mj.field_d < this.field_q ? (this.field_q - mj.field_d) * 2 : 0;
    }

    public static void g(int param0) {
        if (param0 != 1) {
          return;
        }
        field_h = null;
    }

    final void a(int param0, boolean param1) {
        if (param0 != -16383) {
          this.field_s = (ih) null;
        }
        int var3 = 0;
        this.a(param1, var3 != 0, (byte) 27);
    }

    final void a(int param0, int param1, int param2) {
        this.field_i = param0;
        if (param1 != 0) {
          this.field_d = -53;
        }
        this.field_p = param2;
        this.h(160);
    }

    dk(int param0, int param1, int param2, String param3, int param4, ed param5, int param6, ih param7) {
        this(param0, param1, param3, param6, param7);
        try {
          this.field_n = param5;
          this.field_b = param2;
          this.field_j = param4;
          this.field_p = this.d(-1);
          this.field_i = this.a((byte) -16);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private dk(int param0, int param1, String param2, int param3, ih param4) {
        try {
          this.field_s = param4;
          this.field_d = param0;
          this.field_c = param1;
          this.field_q = param3;
          this.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    dk(int param0, int param1, ed param2, int[] param3, int[] param4) {
        try {
          this.field_d = param0;
          this.field_c = param1;
          this.field_a = param4;
          this.field_k = param3;
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    dk(int param0, int param1, ed param2) {
        try {
          this.field_d = param0;
          this.field_n = param2;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_h = new int[32768];
        for (var0 = 0; 32768 > var0; var0++) {
          field_h[var0] = (int)(16384.0 * Math.sin((double)var0 / 5215.1903));
        }
    }
}
