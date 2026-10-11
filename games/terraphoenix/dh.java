/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dh extends uf {
    static int field_h;
    byte[] field_i;
    static int field_l;
    static boolean field_j;
    int field_k;

    final void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var8 = null;
        byte[] var9 = null;
        try {
          var4_int = this.field_k;
          this.field_k = 0;
          var5 = new byte[var4_int];
          int var7 = 14 / ((64 - param1) / 40);
          this.a(var4_int, 0, 91, var5);
          var6 = new java.math.BigInteger(var5);
          var8 = var6.modPow(param0, param2);
          var9 = var8.toByteArray();
          this.field_k = 0;
          this.h(-1564407352, var9.length);
          this.a(-222449912, var9, var9.length, 0);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int i(int param0) {
        this.field_k = this.field_k + 2;
        if (param0 != -25578) {
          return 62;
        }
        return (255 & this.field_i[-1 + this.field_k]) + ((this.field_i[-2 + this.field_k] & 255) << 8);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param0.getCodeBase();
              var3 = bb.a((byte) 122, var4, param0).getFile();
              cd.a(param0, "updatelinks", new Object[]{"home", var3 + "home.ws"}, 10056);
              cd.a(param0, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 10056);
              cd.a(param0, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 10056);
              cd.a(param0, "updatelinks", new Object[]{"options", var3 + "options.ws"}, 10056);
              cd.a(param0, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, 10056);
              cd.a(param0, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, 10056);
              if (!param1) {
                field_l = -99;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref;
            stackIn_7_1 = new StringBuilder().append("dh.L(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String e(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_k;
        do {
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
        } while (this.field_i[fieldTemp$0] != 0);
        var3 = -var2 + this.field_k + param0;
        if (var3 == 0) {
          return "";
        }
        return tc.a((byte) -114, this.field_i, var3, var2);
    }

    final void a(int param0, int[] param1) {
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
        var10 = Terraphoenix.field_V;
        try {
          var3_int = this.field_k / 8;
          this.field_k = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              if (param0 != -6716) {
                this.c(0);
              }
              return;
            }
            var5 = this.f((byte) -107);
            var6 = this.f((byte) -107);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (0 < incrementValue$0) {
                var5 = var5 + (var7 + param1[var7 & 3] ^ var6 + (var6 >>> 5 ^ var6 << 4));
                var7 = var7 + var8;
                var6 = var6 + (param1[293601283 & var7 >>> 11] + var7 ^ var5 + (var5 << 4 ^ var5 >>> 5));
                continue;
              }
              break;
            }
            this.field_k = this.field_k - 8;
            this.e(var5, 8959);
            this.e(var6, 8959);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("dh.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        this.field_i[this.field_k - param1 - 4] = (byte)(param1 >> 24);
        this.field_i[-3 + (this.field_k - param1)] = (byte)(param1 >> 16);
        this.field_i[-2 + this.field_k - param1] = (byte)(param1 >> 8);
        this.field_i[param0 - param1 + this.field_k] = (byte)param1;
    }

    final boolean c(int param0) {
        this.field_k = this.field_k - 4;
        int var2 = gj.a(this.field_k, param0, 255, this.field_i);
        int var3 = this.f((byte) -107);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final void j(int param0, int param1) {
        if (param1 != -119) {
          this.a(79);
        }
        this.field_i[this.field_k - param0 - 1] = (byte)param0;
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)param0;
        int var3 = -106 % ((param1 + 56) / 34);
    }

    final void a(byte param0, int param1) {
        if (param0 != -107) {
          this.field_i = (byte[]) null;
        }
        if (64 > param1 &&
          param1 >= -64) {
          this.i(param1 + 64, 125);
          return;
        }
        if (param1 < 16384 &&
          -16384 <= param1) {
          this.h(-1564407352, param1 + 49152);
          return;
        }
        throw new IllegalArgumentException();
    }

    final String j(int param0) {
        if (0 == this.field_i[this.field_k]) {
          this.field_k = this.field_k + 1;
          return null;
        }
        if (param0 != -1915115064) {
          String var3 = (String) null;
          this.a((String) null, 123);
        }
        return this.e(-1);
    }

    final int e(byte param0) {
        int var2 = this.field_i[this.field_k] & 255;
        if (param0 < 91) {
          this.a(-53);
        }
        if (var2 >= 128) {
          return -49152 + this.i(-25578);
        }
        return this.a(-16384) - 64;
    }

    final int h(int param0) {
        int var2 = 255 & this.field_i[this.field_k];
        int var3 = 109 / ((param0 - 21) / 63);
        if (128 > var2) {
          return this.a(-16384);
        }
        return this.i(-25578) - 32768;
    }

    final static void g(byte param0) {
        qi.field_b = false;
        fd.field_k = false;
        bm.a(-1, (byte) 1);
        if (param0 != -124) {
          return;
        }
        pe.field_a = og.field_a;
        qe.field_f = og.field_a;
    }

    final int i(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Terraphoenix.field_V;
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        var2 = this.field_i[fieldTemp$0];
        if (param0 != 13) {
          return -108;
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.field_k;
          this.field_k = this.field_k + 1;
          var2 = this.field_i[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(String param0, int param1) {
        int fieldTemp$0 = 0;
        int var3_int = param0.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) ((Object) param0);
        this.field_k = this.field_k + ed.a(0, (byte) -97, var4, this.field_i, this.field_k, param0.length());
        if (param1 != 2295) {
          return;
        }
        try {
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dh.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 >= -74) {
          return;
        }
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)param0;
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(param1 >> 8);
        if (param0 != -1564407352) {
          this.field_i = (byte[]) null;
        }
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)param1;
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
        var13 = Terraphoenix.field_V;
        try {
          var5_int = this.field_k;
          this.field_k = param2;
          var6 = (-param2 + param3) / 8;
          if (param0 != -14328) {
            this.c((byte) 63);
          }
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.field_k = var5_int;
              return;
            }
            var8 = this.f((byte) -107);
            var9 = this.f((byte) -107);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var8 + (var8 >>> 5 ^ var8 << 4) ^ var10 + param1[(var10 & 7501) >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - (param1[3 & var10] + var10 ^ var9 + (var9 << 4 ^ var9 >>> 5));
                continue;
              }
              break;
            }
            this.field_k = this.field_k - 8;
            this.e(var8, param0 ^ -5385);
            this.e(var9, param0 ^ -5385);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dh.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          var8 = 19;
          if (param0 != -97) {
            this.c((byte) 109);
          }
          while (var8 >= 0) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + (2 + var9));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(var9 + 2 - 97);
                } else {
                  if (var9 >= 48 &&
                    57 >= var9) {
                    var3_long = var3_long + (long)(var9 + 28 - 48);
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (10 == var8) {
              var5 = var3_long;
              var3_long = 0L;
            }
            var8--;
          }
          this.a(var3_long, (byte) 99);
          this.a(var5, (byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("dh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != 8959) {
          return;
        }
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)param0;
    }

    final int f(byte param0) {
        if (param0 != -107) {
          this.a(58L, 30);
        }
        this.field_k = this.field_k + 4;
        return (this.field_i[this.field_k - 2] << 8 & 65280) + (((this.field_i[this.field_k - 3] & 255) << 16) + ((255 & this.field_i[-4 + this.field_k]) << 24)) + (255 & this.field_i[-1 + this.field_k]);
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Terraphoenix.field_V;
        while (param0 > this.field_k) {
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
        }
        if (param1 != -2108648176) {
          this.field_k = 38;
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param0 >> 24);
        if (param1 <= 18) {
          this.field_i = (byte[]) null;
        }
        int fieldTemp$5 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$7] = (byte)(int)param0;
    }

    final int a(int param0) {
        if (param0 != -16384) {
          return -93;
        }
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        return 255 & this.field_i[fieldTemp$0];
    }

    final void b(long param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param0 >> 32);
        if (param1 != -2108648176) {
          return;
        }
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$4] = (byte)(int)param0;
    }

    final int d(int param0, int param1) {
        int var3 = gj.a(this.field_k, param0, param1 ^ 8551, this.field_i);
        this.e(var3, 8959);
        if (param1 != 8600) {
          this.field_k = 47;
        }
        return var3;
    }

    final byte f(int param0) {
        if (param0 != 2) {
          field_h = 75;
        }
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        return this.field_i[fieldTemp$0];
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          for (var5_int = param3; param2 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_i[fieldTemp$0] = param1[var5_int];
          }
          if (param0 != -222449912) {
            field_h = 53;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dh.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String c(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        var2 = this.field_i[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.field_k;
        do {
          fieldTemp$1 = this.field_k;
          this.field_k = this.field_k + 1;
        } while (this.field_i[fieldTemp$1] != 0);
        var4 = -var3 + (this.field_k - 1);
        var5 = -27 % ((-56 - param0) / 60);
        if (0 != var4) {
          return tc.a((byte) -114, this.field_i, var4, var3);
        }
        return "";
    }

    private final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$4] = (byte)(int)(param0 >> 16);
        if (param1 < 90) {
          field_j = false;
        }
        int fieldTemp$5 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_i[fieldTemp$6] = (byte)(int)param0;
    }

    final static void g(int param0) {
        if (-uf.field_e + 0 != kf.field_f &&
          -uf.field_e + 250 == kf.field_f) {
        }
        kf.field_f = kf.field_f + 1;
        if (param0 <= 67) {
          field_j = true;
        }
    }

    final void c(int param0, int param1) {
        if (0 != (-128 & param1)) {
          if ((param1 & -16384) != 0) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) != 0) {
                this.i(param1 >>> 28 | 128, -14);
              }
              this.i((268611395 | param1) >>> 21, param0 + 37);
            }
            this.i((param1 | 2111024) >>> 14, -99);
          }
          this.i(param1 >>> 7 | 128, param0 - 5);
        }
        if (param0 != 0) {
          this.i((byte) -56);
        }
        this.i(127 & param1, 15);
    }

    final void g(int param0, int param1) {
        this.field_i[this.field_k + (-param0 - 2)] = (byte)(param0 >> 8);
        this.field_i[this.field_k - (param0 + 1)] = (byte)param0;
        if (param1 != -20125) {
          this.field_i = (byte[]) null;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        try {
          var5_int = 52 / ((30 - param2) / 56);
          for (var6 = param1; param1 + param0 > var6; var6++) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            param3[var6] = this.field_i[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("dh.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int d(byte param0) {
        this.field_k = this.field_k + 3;
        if (param0 > -112) {
          this.field_k = -17;
        }
        return (this.field_i[-1 + this.field_k] & 255) + ((this.field_i[this.field_k - 2] << 8 & 65280) + ((255 & this.field_i[-3 + this.field_k]) << 16));
    }

    final int d(int param0) {
        if (param0 != -10355) {
          return -125;
        }
        if (0 <= this.field_i[this.field_k]) {
          return this.i(param0 ^ 19355);
        }
        return this.f((byte) -107) & 2147483647;
    }

    dh(int param0) {
        this.field_k = 0;
        this.field_i = qg.a(90, param0);
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param1 > -19) {
            this.field_k = 65;
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_i[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.field_k = this.field_k + ed.a(0, (byte) 115, var4, this.field_i, this.field_k, param0.length());
          fieldTemp$1 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_i[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dh.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long h(byte param0) {
        long var2 = 4294967295L & (long)this.f((byte) -107);
        long var4 = (long)this.f((byte) -107) & 4294967295L;
        if (param0 != 78) {
          return -96L;
        }
        return (var2 << 32) + var4;
    }

    dh(byte[] param0) {
        try {
          this.field_i = param0;
          this.field_k = 0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 10;
        field_j = true;
    }
}
