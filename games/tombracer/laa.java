/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class laa extends b implements tsa {
    private String[] field_A;
    static lqa field_x;
    private mia field_w;
    static java.awt.Font field_y;
    private rj[] field_z;

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kaa var4 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_u.d(param0 - 13589);
          if (param1 != null &&
            param1.length != 0) {
            if (param0 != 13597) {
              field_y = (java.awt.Font) null;
            }
            var3_int = param1.length;
            this.field_A = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_A[var4_int] = wt.a(kha.b(param0, 17404), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new kaa(mj.field_J, 0, 1);
            this.field_z = new rj[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_z[var5] = new rj(this.field_A[var5], (qc) (this));
              this.field_z[var5].field_r = (isa) ((Object) var4);
              this.field_z[var5].field_q = qla.field_i;
              this.field_z[var5].a((byte) -31, 80, 15, 0, 20 + 16 * var5);
              this.a(this.field_z[var5], param0 ^ -13598);
            }
            this.field_z[var3_int] = new rj(ll.field_h, (qc) (this));
            this.field_z[var3_int].field_r = (isa) ((Object) var4);
            this.field_z[var3_int].a((byte) -31, 100, 15, 0, 20 + var3_int * 16 + 16);
            this.a(this.field_z[var3_int], -1);
            return;
          }
          this.field_A = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("laa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param4 <= 44) {
            return;
          }
          for (var6_int = 0; var6_int < this.field_A.length; var6_int++) {
            if (this.field_z[var6_int] == param2) {
              this.field_w.a(this.field_A[var6_int], 38);
            }
          }
          if (param2 == this.field_z[this.field_A.length]) {
            this.field_w.a(10000536);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("laa.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        il var5 = mj.field_J;
        if (null != this.field_A) {
          var5.a(ch.field_e, param0 + this.field_i, param1 + this.field_n, this.field_m, 20, 16777215, -1, 0, 0, var5.field_k + var5.field_w);
        }
    }

    public static void a(int param0) {
        field_y = null;
        field_x = null;
        if (param0 != 16964) {
          laa.a(-107);
        }
    }

    final static int a(int param0, int param1, byte[] param2, int param3, CharSequence param4, byte param5) {
        int var7 = 0;
        int stackIn_3_0 = 0;
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
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = -param3 + param1;
          if (param5 != -4) {
            stackIn_3_0 = 49;
            return stackIn_3_0;
          }
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param4.charAt(param3 + var7);
              if ((var8 <= 0 ||
                var8 >= 128) && (var8 < 160 ||
                var8 > 255)) {
                switch (var8) {
                  case 8364:
                    param2[var7 + param0] = (byte)-128;
                    break;
                  case 8218:
                    param2[param0 + var7] = (byte)-126;
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
                    param2[param0 + var7] = (byte)-119;
                    break;
                  case 352:
                    param2[var7 + param0] = (byte)-118;
                    break;
                  case 8249:
                    param2[var7 + param0] = (byte)-117;
                    break;
                  case 338:
                    param2[var7 + param0] = (byte)-116;
                    break;
                  case 381:
                    param2[var7 + param0] = (byte)-114;
                    break;
                  case 8216:
                    param2[param0 + var7] = (byte)-111;
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
                    param2[var7 + param0] = (byte)-107;
                    break;
                  case 8211:
                    param2[param0 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param2[param0 + var7] = (byte)-105;
                    break;
                  case 732:
                    param2[param0 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param2[param0 + var7] = (byte)-103;
                    break;
                  case 353:
                    param2[param0 + var7] = (byte)-102;
                    break;
                  case 8250:
                    param2[param0 + var7] = (byte)-101;
                    break;
                  case 339:
                    param2[param0 + var7] = (byte)-100;
                    break;
                  case 382:
                    param2[param0 + var7] = (byte)-98;
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
          stackIn_70_0 = var6_int;
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("laa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(')').toString());
        }
    }

    laa(mia param0) {
        super(0, 0, 0, 0, (isa) null);
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "laa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.b(param1, (byte) -120);
            return stackIn_7_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param1, (byte) -9);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("laa.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
