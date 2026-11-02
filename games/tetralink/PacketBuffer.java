/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static String field_o;
    static SoundEffectLibrary field_q;
    int position;
    static boolean field_r;
    static String field_n;
    static String field_s;
    static boolean field_p;
    byte[] payload;

    final String readString(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = this.position + (-var2 - 1);
        if (param0 != 81) {
          return (String) null;
        }
        if (var3 != 0) {
          return cl.a(-1095, var3, this.payload, var2);
        }
        return "";
    }

    final byte readSignedByte(int param0) {
        if (param0 != -1772093437) {
          this.position = 119;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final boolean h(int param0) {
        this.position = this.position - param0;
        int var2 = q.a(this.payload, 2, this.position, 0);
        int var3 = this.f(24);
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    final void c(int param0, byte param1) {
        this.payload[-4 + (this.position - param0)] = (byte)(param0 >> 24);
        int var3 = 49 / ((param1 + 67) / 45);
        this.payload[this.position + (-param0 - 3)] = (byte)(param0 >> 16);
        this.payload[-2 + (this.position - param0)] = (byte)(param0 >> 8);
        this.payload[-1 - param0 + this.position] = (byte)param0;
    }

    final void writeSmart(int param0, byte param1) {
        if (param0 >= 0 &&
          param0 < 128) {
          this.a(param0, false);
          return;
        }
        if (param1 >= -79) {
          this.position = -106;
        }
        if (0 <= param0 &&
          param0 < 32768) {
          this.b(32768 + param0, false);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readUnsignedShort(int param0) {
        if (param0 < 126) {
          this.b(-74, -51L);
        }
        this.position = this.position + 2;
        return ((255 & this.payload[this.position - 2]) << 8) + (255 & this.payload[this.position - 1]);
    }

    final void b(int param0, int param1) {
        this.payload[-1 - param0 + this.position] = (byte)param0;
        if (param1 != -2) {
          this.i(13);
        }
    }

    final static void a(int param0, String param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = TetraLink.field_J;
        try {
          ec.field_i = ec.field_i + 1;
          if (-1 == sj.field_e &&
            hl.field_cb == -1) {
            hl.field_cb = a.field_a;
            sj.field_e = aa.field_Nb;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(sc.field_c));
          } else {
            decompiledFrameRemainder0 = (null == sc.field_c);
          }
          if (decompiledFrameRemainder0) {
            if (!BufferedSocket.field_s) {
              if (ec.field_i >= gd.field_Mb) {
                stackIn_16_0 = (ej.field_z + gd.field_Mb > ec.field_i) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param1 == null) {
              ec.field_i = 0;
            } else {
              if (!BufferedSocket.field_s &&
                var2_int == 0) {
                ec.field_i = 0;
              } else {
                ec.field_i = gd.field_Mb;
              }
            }
            ph.field_z = hl.field_cb;
            if (param1 == null) {
              if (var2_int != 0) {
                BufferedSocket.field_s = true;
              }
            } else {
              BufferedSocket.field_s = false;
            }
            fi.field_Db = sj.field_e;
          }
          if (param0 > -54) {
            field_o = (String) null;
          }
          sc.field_c = param1;
          if (!BufferedSocket.field_s &&
            gd.field_Mb > ec.field_i &&
            qd.field_T) {
            fi.field_Db = sj.field_e;
            ec.field_i = 0;
            ph.field_z = hl.field_cb;
          }
          if (BufferedSocket.field_s &&
            co.field_n == ec.field_i) {
            ec.field_i = 0;
            BufferedSocket.field_s = false;
          }
          sj.field_e = -1;
          hl.field_cb = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("bh.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (DelegatingCanvas.field_c >= 224) {
          qn.a(256, param0 ^ 384);
        } else {
          var1 = DelegatingCanvas.field_c % 32;
          qn.a(DelegatingCanvas.field_c - (-32 + var1), 128);
        }
        if (param0 != 256) {
          field_p = false;
        }
    }

    final long readLong(int param0) {
        long var2 = (long)this.f(param0 - 212) & 4294967295L;
        if (param0 != 255) {
          field_n = (String) null;
        }
        long var4 = (long)this.f(53) & 4294967295L;
        return (var2 << 32) + var4;
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
        var13 = TetraLink.field_J;
        try {
          var5_int = this.position;
          if (param0 != -25351) {
            return;
          }
          this.position = param3;
          var6 = (param2 - param3) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.position = var5_int;
              return;
            }
            var8 = this.f(param0 + 25442);
            var9 = this.f(-115);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var8 + (var8 << 4 ^ var8 >>> 5) ^ param1[-1772093437 & var10 >>> 11] + var10);
                var10 = var10 - var11;
                var8 = var8 - (var10 + param1[3 & var10] ^ var9 + (var9 << 4 ^ var9 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.d(var8, (byte) -124);
            this.d(var9, (byte) -124);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bh.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param0;
        if (param1 != -124) {
          java.math.BigInteger var4 = (java.math.BigInteger) null;
          this.a((java.math.BigInteger) null, (java.math.BigInteger) null, -19);
        }
    }

    final void b(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          var5_int = param1;
          var6 = 47 / ((param3 - 66) / 60);
          while (var5_int < param1 + param0) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[var5_int] = this.payload[fieldTemp$0];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("bh.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0, int param1) {
        if ((param1 & -128) != 0) {
          if ((-16384 & param1) != 0) {
            if ((-2097152 & param1) != 0) {
              if ((-268435456 & param1) != 0) {
                this.a(128 | param1 >>> 28, false);
              }
              this.a(param1 >>> 21 | 128, false);
            }
            this.a(128 | param1 >>> 14, false);
          }
          this.a(param1 >>> 7 | 128, false);
        }
        if (param0 >= -98) {
          this.readLong(76);
        }
        this.a(param1 & 127, false);
    }

    final int readUnsignedByte(byte param0) {
        if (param0 != -99) {
          return 117;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    private final void b(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 24);
        if (param0 != -1427754144) {
          this.readSignedByte(-73);
        }
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param1;
    }

    final int e(byte param0) {
        int var2 = this.payload[this.position] & 255;
        if (param0 != 82) {
          this.payload = (byte[]) null;
        }
        if (var2 >= 128) {
          return this.readUnsignedShort(param0 ^ 45) - 49152;
        }
        return -64 + this.readUnsignedByte((byte) -99);
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 > -63) {
          field_p = false;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = this.position;
        this.position = 0;
        byte[] var5 = new byte[var4_int];
        this.b(var4_int, 0, var5, -111);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        byte[] var8 = var7.toByteArray();
        this.position = 0;
        if (param2 != -25035) {
          return;
        }
        try {
          this.b(var8.length, false);
          this.a(0, 128, var8, var8.length);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bh.AB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          PacketBuffer.a(37, (String) null);
        }
        field_o = null;
        field_n = null;
        field_s = null;
        field_q = null;
    }

    final int readVarInt(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (param0 != 120) {
          return 14;
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | 127 & var2) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        while (param1 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        var3 = -121 / ((param0 + 7) / 36);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf((int) (char)param1);
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + RasterBuffer.a(var4, param0.length(), 0, this.payload, this.position, (byte) -82);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bh.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int c(int param0, int param1) {
        int var3 = q.a(this.payload, 2, this.position, param0);
        if (param1 >= -49) {
          field_q = (SoundEffectLibrary) null;
        }
        this.d(var3, (byte) -124);
        return var3;
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param1 != 103) {
            this.b(-9, false);
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + RasterBuffer.a(var4, param0.length(), 0, this.payload, this.position, (byte) 125);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bh.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 48);
        if (param0 != -1) {
          return;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param1;
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
        var10 = TetraLink.field_J;
        try {
          if (param0 != 10830) {
            field_o = (String) null;
          }
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.f(param0 - 10946);
            var6 = this.f(param0 - 10945);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + param1[3 & var7] ^ (var6 << 4 ^ var6 >>> 5) + var6);
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + param1[1656750083 & var7 >>> 11]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.d(var5, (byte) -124);
            this.d(var6, (byte) -124);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bh.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1) {
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        try {
          var5 = 80 % ((52 - param0) / 51);
          var3_long = 0L;
          var6 = 0L;
          var8 = param1.length();
          for (var9 = 19; 0 <= var9; var9--) {
            var3_long = var3_long * 38L;
            if (var8 > var9) {
              var10 = param1.charAt(var9);
              if (var10 >= 65 &&
                var10 <= 90) {
                var3_long = var3_long + (long)(-65 + (var10 + 2));
              } else {
                if (var10 >= 97 &&
                  var10 <= 122) {
                  var3_long = var3_long + (long)(-95 + var10);
                } else {
                  if (var10 >= 48 &&
                    var10 <= 57) {
                    var3_long = var3_long + (long)(-20 + var10);
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var9 == 10) {
              var6 = var3_long;
              var3_long = 0L;
            }
          }
          this.b(-1427754144, var3_long);
          this.b(-1427754144, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("bh.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int readMedium(int param0) {
        this.position = this.position + 3;
        if (param0 != -1) {
          field_s = (String) null;
        }
        return (255 & this.payload[-1 + this.position]) + (((255 & this.payload[-2 + this.position]) << 8) + ((255 & this.payload[this.position - 3]) << 16));
    }

    final int readLargeSmart(byte param0) {
        if (param0 != -40) {
          return -99;
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort(param0 ^ -89);
        }
        return this.f(88) & 2147483647;
    }

    final int readSmart(byte param0) {
        if (param0 < 6) {
          this.e((byte) 89);
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 < 128) {
          return this.readUnsignedByte((byte) -99);
        }
        return this.readUnsignedShort(127) - 32768;
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
        var6 = TetraLink.field_J;
        try {
          for (var5_int = param0; param3 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param2[var5_int];
          }
          if (param1 != 128) {
            field_q = (SoundEffectLibrary) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bh.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1) {
          return;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
    }

    final static int h(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        String var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TetraLink.field_J;
        try {
          mf.field_s.a(TetraLink.field_I, true, mn.field_a, false);
          if (param0 != -47) {
            var3 = (String) null;
            PacketBuffer.a(21, (String) null);
          }
          mf.field_s.j(param0 + 47);
          while (nj.b((byte) 28)) {
            mf.field_s.a(dg.field_e, tb.field_m, -81);
          }
          if (fk.field_W != -1) {
            var1_int = fk.field_W;
            t.a(-1, 0);
            stackIn_8_0 = var1_int;
            return stackIn_8_0;
          }
          if (s.field_f) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (ll.field_C == pi.field_a) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!oa.field_y.c(false)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (ll.field_C != ma.field_d) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bh.JA(" + param0 + ')');
        }
    }

    PacketBuffer(int param0) {
        this.payload = pe.a(param0, (byte) -2);
        this.position = 0;
    }

    final String a(boolean param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        if (!param0) {
          field_n = (String) null;
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = this.position - var3 - 1;
        if (var4 != 0) {
          return cl.a(-1095, var4, this.payload, var3);
        }
        return "";
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          field_r = false;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final void a(long param0, boolean param1) {
        if (!param1) {
          field_o = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param0;
    }

    final String i(int param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        int var2 = 0 / ((67 - param0) / 42);
        return this.readString((byte) 81);
    }

    final void a(byte param0, int param1) {
        this.payload[-param1 + (this.position - 2)] = (byte)(param1 >> 8);
        this.payload[-1 + (-param1 + this.position)] = (byte)param1;
        int var3 = 17 / ((param0 + 37) / 49);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(int param0) {
        this.position = this.position + 4;
        int var2 = 48 % ((-55 - param0) / 52);
        return (this.payload[this.position - 1] & 255) + ((-16777216 & this.payload[-4 + this.position] << 24) - (-((this.payload[-3 + this.position] & 255) << 16) - ((this.payload[this.position - 2] & 255) << 8)));
    }

    static {
        field_o = "Pause Menu";
        field_r = true;
        field_s = "red";
        field_n = "Click or press F10 to open Quick Chat";
    }
}
