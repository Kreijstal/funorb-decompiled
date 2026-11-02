/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static bd field_k;
    static double field_h;
    int field_i;
    byte[] field_n;
    static oj[] field_p;
    static String field_o;
    static int[] field_m;
    static long field_l;
    static bd field_j;

    final long c(int param0) {
        long var2 = (long)this.d(param0 - 2623) & 4294967295L;
        if (param0 != 10818) {
          return 55L;
        }
        long var4 = 4294967295L & (long)this.d(8195);
        return (var2 << 32) + var4;
    }

    private final void c(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$2] = (byte)(int)(param1 >> 32);
        if (param0 >= -126) {
          int[] var5 = (int[]) null;
          this.a(125, (byte) -21, -127, (int[]) null);
        }
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$6] = (byte)(int)param1;
    }

    final int f(int param0) {
        int var2 = this.field_n[this.field_i] & param0;
        if (var2 < 128) {
          return this.l(param0 ^ 32497);
        }
        return -32768 + this.e(8);
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_i;
          this.field_i = 0;
          var5 = new byte[var4_int];
          this.a(var4_int, 0, var5, -18181);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param0);
          var8 = var7.toByteArray();
          this.field_i = param1;
          this.a((byte) -120, var8.length);
          this.a(var8.length, var8, true, 0);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vi.VA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 >= -108) {
          return;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$1] = (byte)param1;
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0 < 11) {
            field_k = (bd) null;
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_n[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_i = this.field_i + j.a(param1.length(), this.field_i, 0, (byte) -125, this.field_n, var4);
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_n[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vi.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 255) {
          PacketBuffer.k(-40);
        }
        field_j = null;
        field_k = null;
        field_m = null;
    }

    final void a(byte param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          var9 = 50 % ((param0 - 28) / 63);
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var10 = param1.charAt(var8);
              if (var10 >= 65 &&
                var10 <= 90) {
                var3_long = var3_long + (long)(2 + var10 - 65);
              } else if (var10 >= 97 &&
                var10 <= 122) {
                var3_long = var3_long + (long)(-97 + (2 + var10));
              } else if (48 <= var10 &&
                var10 <= 57) {
                var3_long = var3_long + (long)(28 + (var10 - 48));
              } else {
                var3_long = var3_long + 1L;
              }
              decompiledFrameRemainder0 = (var8 == 10);
            } else {
              decompiledFrameRemainder0 = (var8 == 10);
            }
            if (decompiledFrameRemainder0) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.c(-127, var3_long);
          this.c(-128, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("vi.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final int m(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_n[fieldTemp$0];
        if (param0 != 127) {
          this.a(-88, 55);
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          var2 = this.field_n[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void g(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var3 = -26 % ((-66 - param1) / 42);
        while (param0 > this.field_i) {
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_n[fieldTemp$0] = (byte) 0;
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 > -36) {
          field_h = 1.878340695975746;
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$2] = (byte)param0;
    }

    final boolean c(byte param0) {
        this.field_i = this.field_i - 4;
        int var2 = hb.a(0, -120, this.field_n, this.field_i);
        int var3 = this.d(8195);
        if (param0 != -4) {
          field_m = (int[]) null;
        }
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    final int b(boolean param0) {
        this.field_i = this.field_i + 2;
        if (!param0) {
          return 56;
        }
        int var2 = ((this.field_n[-2 + this.field_i] & 255) << 8) + (255 & this.field_n[this.field_i - 1]);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final void a(int param0, byte param1, int param2, int[] param3) {
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
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5_int = this.field_i;
          this.field_i = param2;
          var6 = (param0 - param2) / 8;
          if (param1 > -114) {
            return;
          }
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.field_i = var5_int;
              return;
            }
            var8 = this.d(8195);
            var9 = this.d(8195);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param3[(var10 & 7500) >>> 11] + var10 ^ var8 + (var8 >>> 5 ^ var8 << 4));
                var10 = var10 - var11;
                var8 = var8 - (var10 + param3[var10 & 3] ^ var9 + (var9 >>> 5 ^ var9 << 4));
                continue;
              }
              break;
            }
            this.field_i = this.field_i - 8;
            this.b(var8, 25251);
            this.b(var9, 25251);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("vi.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int i(int param0) {
        int var2 = 255 & this.field_n[this.field_i];
        if (param0 != 64) {
          return -99;
        }
        if (var2 < 128) {
          return this.l(32270) - 64;
        }
        return this.e(8) - 49152;
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$6] = (byte)(int)(param1 >> 8);
        if (param0 != 9201) {
          return;
        }
        int fieldTemp$7 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$7] = (byte)(int)param1;
    }

    final void b(boolean param0, int param1) {
        if (0 != (-128 & param1)) {
          if ((-16384 & param1) != 0) {
            if ((-2097152 & param1) != 0) {
              if (0 != (-268435456 & param1)) {
                this.d(117, 128 | param1 >>> 28);
              }
              this.d(122, param1 >>> 21 | 128);
            }
            this.d(89, 128 | param1 >>> 14);
          }
          this.d(98, 128 | param1 >>> 7);
        }
        this.d(84, param1 & 127);
        if (param0) {
          field_p = (oj[]) null;
        }
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_i = this.field_i + j.a(param0.length(), this.field_i, param1, (byte) -125, this.field_n, var4);
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_n[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vi.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(byte param0) {
        if (0 == this.field_n[this.field_i]) {
          this.field_i = this.field_i + 1;
          return null;
        }
        if (param0 != 28) {
          this.i(-74);
        }
        return this.o(32);
    }

    final int e(int param0) {
        if (param0 != 8) {
          field_h = 0.07409831679599663;
        }
        this.field_i = this.field_i + 2;
        return (65280 & this.field_n[this.field_i - 2] << 8) + (this.field_n[-1 + this.field_i] & 255);
    }

    final byte j(int param0) {
        if (param0 != 0) {
          return (byte) -41;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_n[fieldTemp$0];
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$1] = (byte)(param0 >> 16);
        if (param1 != 25251) {
          this.field_i = 111;
        }
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$3] = (byte)param0;
    }

    PacketBuffer(int param0) {
        this.field_i = 0;
        this.field_n = hf.a(true, param0);
    }

    final void c(int param0, int param1) {
        if (param1 < 64 &&
          -64 <= param1) {
          this.d(91, param1 + 64);
          return;
        }
        if (16384 > param1 &&
          -16384 <= param1) {
          this.a((byte) -122, 49152 + param1);
          return;
        }
        if (param0 > -39) {
          field_h = -0.0007489795144314985;
        }
        throw new IllegalArgumentException();
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
          this.a(true, -82);
        }
        this.field_n[-param1 + (this.field_i - 2)] = (byte)(param1 >> 8);
        this.field_n[-param1 + this.field_i - 1] = (byte)param1;
    }

    final static void k(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ic var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        jd var6_ref_jd = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        CipherPacketBuffer var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0 != 64) {
            field_l = -119L;
          }
          var28 = sc.field_g;
          var2 = var28.l(32270);
          if (var2 == 0) {
            var3 = var28.e(8);
            var4 = (ic) (ch.field_p.g(-102));
            while (var4 != null) {
              if (var3 != var4.field_j) {
                var4 = (ic) (ch.field_p.a(12684));
                continue;
              }
              break;
            }
            if (var4 == null) {
              le.c((byte) 83);
              return;
            }
            var5 = var28.l(32270);
            if (var5 != 0) {
              var6 = var4.field_q;
              i.field_h[0].field_f = null;
              i.field_h[0].field_b = false;
              i.field_h[0].field_d = qg.field_r;
              var7 = var4.field_h;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                i.field_h[var8_int].field_d = var28.o(param0 - 32);
                i.field_h[var8_int].field_b = false;
                if (var28.l(32270) == 1) {
                  i.field_h[var8_int].field_f = var28.o(param0 - 32);
                } else {
                  i.field_h[var8_int].field_f = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_p = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_i = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_l = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.l(32270);
              if (var18 > 0) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var28.l(32270);
                  var21 = i.field_h[var20].field_d;
                  var22 = var28.c(10818);
                  var24 = var28.field_i;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = i.field_h[var20].field_f;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.d(8195);
                    }
                  }
                  if (var21 != null &&
                    pc.a(14088, var21)) {
                    var8[1][var13] = qg.field_r;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var13++;
                    var28.field_i = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.d(8195);
                    }
                  }
                  if (var14 < var6 &&
                    !i.field_h[var20].field_b) {
                    i.field_h[var20].field_b = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = i.field_h[var20].field_f;
                    var10[2][var14] = var22;
                    var28.field_i = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.d(8195);
                    }
                  }
                }
              }
            }
            var4.field_m = true;
            var4.b(113);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.e(8);
            var4_long = var28.c(10818);
            var6_ref_jd = (jd) (ib.field_a.g(param0 ^ -67));
            while (var6_ref_jd != null) {
              if (var3Lifetime1 != var6_ref_jd.field_u) {
                var6_ref_jd = (jd) (ib.field_a.a(param0 ^ 12748));
                continue;
              }
              break;
            }
            if (var6_ref_jd == null) {
              le.c((byte) 127);
              return;
            }
            var6_ref_jd.field_k = var4_long;
            var6_ref_jd.b(-105);
            return;
          }
          ic.a((byte) -125, "HS1: " + gf.a((byte) -126), (Throwable) null);
          le.c((byte) 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "vi.W(" + param0 + ')');
        }
    }

    final int h(int param0) {
        this.field_i = this.field_i + 3;
        if (param0 <= 55) {
          return -92;
        }
        return (this.field_n[this.field_i - 2] << 8 & 65280) + (16711680 & this.field_n[this.field_i - 3] << 16) + (this.field_n[this.field_i - 1] & 255);
    }

    final void a(int param0, int param1) {
        if (param1 != -19720) {
          this.field_i = -28;
        }
        this.field_n[-1 - param0 + this.field_i] = (byte)param0;
    }

    final int a(boolean param0) {
        if (!param0) {
          this.e(73, 77);
        }
        if (this.field_n[this.field_i] >= 0) {
          return this.e(8);
        }
        return this.d(8195) & 2147483647;
    }

    final int d(int param0) {
        this.field_i = this.field_i + 4;
        if (param0 != 8195) {
          this.d(78, 54);
        }
        return ((this.field_n[-3 + this.field_i] & 255) << 16) + (-16777216 & this.field_n[this.field_i - 4] << 24) + ((this.field_n[-2 + this.field_i] << 8 & 65280) + (this.field_n[this.field_i - 1] & 255));
    }

    final String n(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_n[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.field_i;
        if (param0 != -31298) {
          field_m = (int[]) null;
        }
        do {
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
        } while (this.field_n[fieldTemp$1] != 0);
        var4 = this.field_i - var3 - 1;
        if (0 == var4) {
          return "";
        }
        return db.a(this.field_n, var3, (byte) -114, var4);
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$1] = (byte)(int)(param1 >> 24);
        if (param0 > -110) {
          return;
        }
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$4] = (byte)(int)param1;
    }

    final int l(int param0) {
        if (param0 != 32270) {
          this.a((byte) 73, -127);
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_n[fieldTemp$0] & 255;
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$0] = (byte)param1;
        if (param0 <= 79) {
          this.h(-8);
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!param2) {
            PacketBuffer.k(-128);
          }
          for (var5_int = param3; var5_int < param0 + param3; var5_int++) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_n[fieldTemp$0] = param1[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vi.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int[] param0, byte param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = this.field_i / 8;
          this.field_i = 0;
          if (param1 < 104) {
            field_p = (oj[]) null;
          }
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.d(8195);
            var6 = this.d(8195);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (param0[var7 & 3] + var7 ^ (var6 << 4 ^ var6 >>> 5) + var6);
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + param0[var7 >>> 11 & -1023410173]);
                continue;
              }
              break;
            }
            this.field_i = this.field_i - 8;
            this.b(var5, 25251);
            this.b(var6, 25251);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vi.V(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, CipherPacketBuffer param1) {
        RuntimeException var2 = null;
        CipherPacketBuffer var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 45) {
            var3 = (CipherPacketBuffer) null;
            PacketBuffer.a((byte) -23, (CipherPacketBuffer) null);
          }
          stackIn_5_0 = (param1.a(1, true) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("vi.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final String o(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_i;
        if (param0 != 32) {
          field_p = (oj[]) null;
        }
        do {
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
        } while (this.field_n[fieldTemp$0] != 0);
        var3 = this.field_i - var2 - 1;
        if (0 != var3) {
          return db.a(this.field_n, var2, (byte) -128, var3);
        }
        return "";
    }

    final void b(int param0, byte param1) {
        this.field_n[-4 + (-param0 + this.field_i)] = (byte)(param0 >> 24);
        if (param1 != -79) {
          field_j = (bd) null;
        }
        this.field_n[-param0 + (this.field_i - 3)] = (byte)(param0 >> 16);
        this.field_n[this.field_i - param0 - 2] = (byte)(param0 >> 8);
        this.field_n[this.field_i - param0 - 1] = (byte)param0;
    }

    PacketBuffer(byte[] param0) {
        try {
          this.field_i = 0;
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(int param0, int param1) {
        int var3 = hb.a(param0, -128, this.field_n, this.field_i);
        this.b(var3, 25251);
        int var4 = 67 % ((param1 - 43) / 63);
        return var3;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param3 != -18181) {
            return;
          }
          for (var5_int = param1; var5_int < param1 + param0; var5_int++) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            param2[var5_int] = this.field_n[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vi.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_m = new int[8192];
        field_o = "This turret is protected by an energy field.";
    }
}
