/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static a[] field_g;
    static tg field_j;
    int field_h;
    byte[] field_i;

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 != 490724880) {
          this.e(-100, -16);
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$2] = (byte)param0;
    }

    final int d(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        CharSequence var5;
        var4 = Bounce.field_N;
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_i[fieldTemp$0];
        var3 = 0;
        while (0 > var2) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          var2 = this.field_i[fieldTemp$1];
        }
        if (param0 != -10937) {
          var5 = (CharSequence) null;
          PacketBuffer.a((CharSequence) null, false);
        }
        return var3 | var2;
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          if (param0 != -256) {
            String var4 = (String) null;
            this.b((String) null, (byte) 7);
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param1);
          this.field_h = this.field_h + v.a(this.field_i, var5, param1.length(), 0, (byte) -110, this.field_h);
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "wi.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        this.field_h = this.field_h + 2;
        if (param0 != -1640531527) {
          return 71;
        }
        return (this.field_i[-1 + this.field_h] & 255) + ((255 & this.field_i[-2 + this.field_h]) << 8);
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param1 >> 56);
        if (param0 != 252186072) {
          this.a((byte) -78, 113);
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$7] = (byte)(int)param1;
    }

    final long f(byte param0) {
        if (param0 != -121) {
          this.a(105, (byte) 93);
        }
        long var2 = (long)this.j(-3) & 4294967295L;
        long var4 = (long)this.j(param0 + 118) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final int i(int param0) {
        int var2 = 255 & this.field_i[this.field_h];
        if (var2 >= param0) {
          return -49152 + this.a(-1640531527);
        }
        return this.d((byte) -68) - 64;
    }

    final void d(int param0, int param1) {
        if ((-128 & param0) != 0) {
          if ((param0 & -16384) != 0) {
            if ((param0 & -2097152) != 0) {
              if ((-268435456 & param0) != 0) {
                this.a(128 | param0 >>> 28, (byte) 97);
              }
              this.a(param0 >>> 21 | 128, (byte) 91);
            }
            this.a((2108379 | param0) >>> 14, (byte) 118);
          }
          this.a(param0 >>> 7 | 128, (byte) 69);
        }
        if (param1 != -13440) {
          this.b(-64, (byte) 89);
        }
        this.a(param0 & 127, (byte) 85);
    }

    final void b(String param0, byte param1) {
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        tg[] var11 = null;
        var10 = Bounce.field_N;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param0.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + (var9 - 65));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(2 + var9 - 97);
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-48 + var9 + 28);
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var8 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          if (param1 >= -52) {
            var11 = (tg[]) null;
            PacketBuffer.a((tg[]) null, 99, -16, (byte) -80);
          }
          this.b(494545288, var3_long);
          this.b(494545288, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("wi.VA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param0 >> 16);
        if (param1 != -29) {
          return;
        }
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$4] = (byte)(int)param0;
    }

    final static byte[] a(CharSequence param0, boolean param1) {
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
        var6 = Bounce.field_N;
        try {
          var2_int = param0.length();
          if (!param1) {
            PacketBuffer.c((byte) -22);
          }
          var3 = new byte[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (var5 < 160 ||
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
          stackIn_72_1 = new StringBuilder().append("wi.SA(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(tg[] param0, int param1, int param2, byte param3) {
        try {
          cf.field_g = new oh(param0);
          td.field_a = param1;
          if (param3 != -126) {
            field_j = (tg) null;
          }
          gh.field_H = param2;
          pg.a(param3 + 126);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "wi.PA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        var13 = Bounce.field_N;
        try {
          var5_int = this.field_h;
          this.field_h = param2;
          if (param0 <= 4) {
            var14 = (int[]) null;
            this.a((int[]) null, -54);
          }
          var6 = (param3 - param2) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.field_h = var5_int;
              return;
            }
            var8 = this.j(-3);
            var9 = this.j(-3);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var8 + (var8 >>> 5 ^ var8 << 4) ^ param1[var10 >>> 11 & -1533018109] + var10);
                var10 = var10 - var11;
                var8 = var8 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ param1[var10 & 3] + var10);
                continue;
              }
              break;
            }
            this.field_h = this.field_h - 8;
            this.b(var8, (byte) 47);
            this.b(var9, (byte) -59);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("wi.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        try {
          if (param0 < 121) {
            this.b(99, (byte) 102);
          }
          for (var5_int = param3; param1 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            param2[var5_int] = this.field_i[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wi.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void g(int param0) {
        mb.field_o[61] = 27;
        mb.field_o[59] = 57;
        mb.field_o[91] = 42;
        mb.field_o[45] = 26;
        mb.field_o[44] = 71;
        mb.field_o[192] = 28;
        mb.field_o[520] = 59;
        mb.field_o[222] = 58;
        mb.field_o[92] = 74;
        mb.field_o[46] = 72;
        mb.field_o[93] = 43;
        mb.field_o[param0] = 73;
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)param0;
        if (param1 <= 47) {
          this.field_i = (byte[]) null;
        }
    }

    final void c(int param0, int param1) {
        if (param0 > -97) {
          return;
        }
        this.field_i[-2 + (this.field_h - param1)] = (byte)(param1 >> 8);
        this.field_i[-1 + (-param1 + this.field_h)] = (byte)param1;
    }

    final int f(int param0) {
        if (param0 <= 93) {
          this.i(-27);
        }
        int var2 = 255 & this.field_i[this.field_h];
        if (var2 < 128) {
          return this.d((byte) -107);
        }
        return -32768 + this.a(-1640531527);
    }

    final static void a(tj param0, String param1, int param2, boolean param3, bh param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Bounce.field_N;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = 1;
          if (param3) {
            PacketBuffer.e((byte) 50);
          }
          while (param1.length() > var7) {
            var8 = param1.charAt(var7);
            if (var8 == 60) {
              var6 = param4.field_a[0] + (var5_int >> 8) + param0.b(param1.substring(0, var7));
            }
            if (var6 != -1) {
              param4.field_a[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param2;
              }
              param4.field_a[var7] = param4.field_a[0] + (var5_int >> 8) - (-param0.b(param1.substring(0, 1 + var7)) + param0.a((char) var8));
            }
            if (62 == var8) {
              var6 = -1;
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("wi.TA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        this.field_h = this.field_h - 4;
        int var2 = ib.a(this.field_h, this.field_i, 0, (byte) -33);
        if (param0 >= -9) {
          CharSequence var4 = (CharSequence) null;
          PacketBuffer.a((CharSequence) null, false);
        }
        int var3 = this.j(-3);
        if (var3 != var2) {
          return false;
        }
        return true;
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Bounce.field_N;
        if (param1) {
          return;
        }
        while (param0 > this.field_h) {
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
        }
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 != -127) {
          return;
        }
        field_j = null;
    }

    final void a(int param0, boolean param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        var6 = Bounce.field_N;
        try {
          if (!param1) {
            var7 = (int[]) null;
            this.a((int[]) null, -101);
          }
          for (var5_int = param0; param0 + param2 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_i[fieldTemp$0] = param3[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wi.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String b(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_h;
        if (!param0) {
          field_g = (a[]) null;
        }
        do {
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
        } while (0 != this.field_i[fieldTemp$0]);
        var3 = -1 + (this.field_h - var2);
        if (var3 == 0) {
          return "";
        }
        return lh.a(var2, -3789, var3, this.field_i);
    }

    final void a(int[] param0, int param1) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var11 = Bounce.field_N;
        try {
          var3_int = this.field_h / 8;
          this.field_h = 0;
          var5 = -98 % ((54 - param1) / 49);
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var6 = this.j(-3);
            var7 = this.j(-3);
            var8 = 0;
            var9 = -1640531527;
            var10 = 32;
            while (true) {
              incrementValue$2 = var10;
              var10--;
              if (0 < incrementValue$2) {
                var6 = var6 + (var8 + param0[var8 & 3] ^ (var7 >>> 5 ^ var7 << 4) + var7);
                var8 = var8 + var9;
                var7 = var7 + (var8 + param0[(var8 & 6638) >>> 11] ^ var6 + (var6 >>> 5 ^ var6 << 4));
                continue;
              }
              break;
            }
            this.field_h = this.field_h - 8;
            this.b(var6, (byte) -101);
            this.b(var7, (byte) -93);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wi.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CipherPacketBuffer.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        this.field_i[-param1 + this.field_h - 4] = (byte)(param1 >> 24);
        this.field_i[-3 + (-param1 + this.field_h)] = (byte)(param1 >> 16);
        this.field_i[-param1 + this.field_h - 2] = (byte)(param1 >> 8);
        this.field_i[this.field_h + (-param1 - 1)] = (byte)param1;
        if (param0 >= -6) {
          CharSequence var4 = (CharSequence) null;
          PacketBuffer.a((CharSequence) null, true);
        }
    }

    final void a(byte param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_h;
          this.field_h = 0;
          var5 = new byte[var4_int];
          this.a((byte) 127, var4_int, var5, 0);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param2);
          var8 = var7.toByteArray();
          if (param0 != 50) {
            this.e(-77, 83);
          }
          this.field_h = 0;
          this.e(-750655096, var8.length);
          this.a(0, true, var8.length, var8);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "wi.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(byte param0) {
        if (param0 != -83) {
          this.e(7);
        }
        this.field_h = this.field_h + 3;
        return ((255 & this.field_i[this.field_h - 3]) << 16) + (65280 & this.field_i[-2 + this.field_h] << 8) + (255 & this.field_i[this.field_h - 1]);
    }

    final void b(int param0, boolean param1) {
        if (!param1) {
          this.field_h = -47;
        }
        this.field_i[-1 + (-param0 + this.field_h)] = (byte)param0;
    }

    final String g(byte param0) {
        if (this.field_i[this.field_h] == 0) {
          this.field_h = this.field_h + 1;
          return null;
        }
        int var2 = 66 % ((-31 - param0) / 32);
        return this.b(true);
    }

    final void e(int param0, int param1) {
        if (param0 != -750655096) {
          this.c(-109, 118);
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$1] = (byte)param1;
    }

    final static boolean e(byte param0) {
        if (param0 <= 32) {
          return true;
        }
        return nd.a(false, vi.b(0));
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param1 != -67) {
            field_g = (a[]) null;
          }
          var3_int = param0.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.field_h = this.field_h + v.a(this.field_i, var4, param0.length(), 0, (byte) -110, this.field_h);
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_i[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "wi.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte k(int param0) {
        int var2 = 55 / ((2 - param0) / 40);
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_i[fieldTemp$0];
    }

    final int j(int param0) {
        this.field_h = this.field_h + 4;
        if (param0 != -3) {
          return 76;
        }
        return (255 & this.field_i[-1 + this.field_h]) + ((16711680 & this.field_i[-3 + this.field_h] << 16) + ((this.field_i[this.field_h - 4] << 24 & -16777216) + ((255 & this.field_i[this.field_h - 2]) << 8)));
    }

    final int e(int param0) {
        if (param0 < 43) {
          return -82;
        }
        if (this.field_i[this.field_h] < 0) {
          return this.j(-3) & 2147483647;
        }
        return this.a(-1640531527);
    }

    private final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param1 >> 48);
        if (param0 != 494545288) {
          return;
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$6] = (byte)(int)param1;
    }

    PacketBuffer(int param0) {
        this.field_h = 0;
        this.field_i = jj.a(10000, param0);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.field_h = 0;
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "wi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$1] = (byte)(param0 >> 16);
        int var3 = -78 % ((param1 - 1) / 39);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_i[fieldTemp$3] = (byte)param0;
    }

    final int b(int param0, int param1) {
        if (param1 != -1) {
          this.field_h = 26;
        }
        int var3 = ib.a(this.field_h, this.field_i, param0, (byte) -33);
        this.b(var3, (byte) -87);
        return var3;
    }

    final int d(byte param0) {
        if (param0 >= -63) {
          field_g = (a[]) null;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return 255 & this.field_i[fieldTemp$0];
    }

    final String a(boolean param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_i[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.field_h;
        do {
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
        } while (0 != this.field_i[fieldTemp$1]);
        if (!param0) {
          field_g = (a[]) null;
        }
        var4 = -var3 + (this.field_h - 1);
        if (var4 == 0) {
          return "";
        }
        return lh.a(var3, -3789, var4, this.field_i);
    }

    static {
    }
}
