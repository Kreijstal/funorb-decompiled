/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static String field_p;
    static String field_j;
    static int[] field_r;
    int position;
    static Sprite[][][] field_o;
    byte[] payload;
    static boolean field_k;
    static int[] field_n;
    static java.awt.Image field_i;
    static String field_l;

    final static void c(int param0) {
        int var9 = 0;
        double var1_double = 0.0;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var7 = 1024.0;
          fj.field_m = new int[2048];
          if (param0 != -7668) {
            field_p = (String) null;
          }
          for (var9 = 0; 2048 > var9; var9++) {
            var3 = (double)(var9 + 0);
            var1_double = var3 / var7;
            var5 = Math.cos(3.141592653589793 * var1_double);
            if (var5 < 0.0) {
              var5 = -var5;
            }
            var5 = 65536.0 * var5;
            fj.field_m[var9] = (int)var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var1), "uf.CA(" + param0 + ')');
        }
    }

    final void a(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(48, var5, var4_int, 0);
          if (!param1) {
            field_p = (String) null;
          }
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(var8.length, (byte) 106);
          this.a(var8.length, 0, var8, -16384);
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "uf.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void writePrefixedString(byte param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        if (param0 <= 13) {
          return;
        }
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + wc.a((byte) -119, 0, var4, this.payload, param1.length(), this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "uf.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void patchByteLength(int param0, int param1) {
        this.payload[-param0 + this.position - 1] = (byte)param0;
        if (param1 >= -108) {
          this.readLong(89);
        }
    }

    public static void d(int param0) {
        field_o = (Sprite[][][]) null;
        field_p = null;
        if (param0 != 128) {
          return;
        }
        field_r = null;
        field_n = null;
        field_j = null;
        field_i = null;
        field_l = null;
    }

    final String readPrefixedString(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = 77 % ((param0 + 28) / 45);
        var4 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$1]);
        var5 = -1 + this.position - var4;
        if (var5 == 0) {
          return "";
        }
        return r.a(var5, var4, this.payload, (byte) 8);
    }

    final void writeByte(int param0, byte param1) {
        if (param1 != 122) {
          this.payload = (byte[]) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final void writeSignedSmart(byte param0, int param1) {
        if (param1 < 64 &&
          param1 >= -64) {
          this.writeByte(64 + param1, (byte) 122);
          return;
        }
        if (16384 > param1 &&
          param1 >= -16384) {
          this.writeShort(49152 + param1, (byte) 106);
          return;
        }
        if (param0 != -89) {
          this.a(74, 121L);
        }
        throw new IllegalArgumentException();
    }

    final static int a(boolean param0, boolean param1, int param2, String param3, String param4, boolean param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_20_0 = 0;
          int stackIn_34_0 = 0;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_90_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_101_0 = 0;
          int stackIn_103_0 = 0;
          RuntimeException stackIn_106_0 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
          StringBuilder stackIn_109_1 = null;
          String stackIn_110_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          CharSequence var12 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = TorChallenge.field_F ? 1 : 0;
          try {
            if (qf.field_a == null &&
              !s.a(param5, param1)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (ng.field_A == aj.field_c) {
              if (!param1) {
                qi.field_c = nj.a(param3, true, param4, false);
              } else {
                var10 = (String) null;
                qi.field_c = ac.a(ed.field_j, (String) null, 122, param3, false);
              }
              dk.field_s.position = 0;
              dk.field_s.writeByte(14, (byte) 122);
              dk.field_s.writeByte(qi.field_c.a(true).field_a, (byte) 122);
              nb.a(-1, -1);
              aj.field_c = qi.field_a;
            }
            if (qi.field_a == aj.field_c &&
              pe.a((byte) 124, 1)) {
              var6_int = id.field_b.readUnsignedByte(-115);
              if (var6_int != 0) {
                cb.field_g = var6_int;
                bb.field_i = -1;
                aj.field_c = qc.field_f;
              } else {
                aj.field_c = BufferedCacheFile.field_n;
              }
              id.field_b.position = 0;
            }
            if (param5) {
              stackIn_20_0 = -1;
              return stackIn_20_0;
            }
            if (aj.field_c == BufferedCacheFile.field_n &&
              pe.a((byte) 105, 8)) {
              lh.field_u = id.field_b.readLong(-125);
              id.field_b.position = 0;
              ib.a(param2, false, param1, qi.field_c, param0);
              aj.field_c = cd.field_s;
            }
            boolean decompiledFrameRemainder0 = true;
            if (cd.field_s == aj.field_c &&
              pe.a((byte) 80, 1)) {
              var6_intLifetime1 = id.field_b.readUnsignedByte(-97);
              le.field_c = null;
              cb.field_g = var6_intLifetime1;
              id.field_b.position = 0;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (8 != var6_intLifetime1) {
                  bb.field_i = -1;
                  aj.field_c = qc.field_f;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ob.b(-86);
                  ck.field_b = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                aj.field_c = le.field_a;
                bb.field_i = -1;
              }
            }
            if (le.field_a == aj.field_c &&
              NodeHashTableIterator.a((byte) 113)) {
              ed.field_j = id.field_b.readLong(-87);
              fa.field_g = id.field_b.readUnsignedByte(-108);
              id.field_b.readUnsignedByte(-109);
              UiComponent.field_o = id.field_b.readUnsignedShort(param5);
              var11 = id.field_b.readOptionalString(-29648475);
              var7 = id.field_b.readUnsignedByte(-107);
              if ((1 & var7) != 0) {
                me.a(!param5);
              }
              if (!param1) {
                stackIn_49_0 = ((var7 & 8) != 0);
                na.field_e = stackIn_49_0;
                stackIn_52_0 = ((4 & var7) != 0);
                me.field_b = stackIn_52_0;
                if (!na.field_e) {
                }
              }
              if (ed.field_e) {
                id.field_b.readUnsignedByte(-127);
                id.field_b.readUnsignedByte(-121);
                id.field_b.readInt(81);
                wk.field_G = id.field_b.readUnsignedShort(param5);
                te.field_d = new byte[wk.field_G];
                for (var8 = 0; wk.field_G > var8; var8++) {
                  te.field_d[var8] = id.field_b.readByte((byte) -22);
                }
              }
              LevelDecoder.field_a = id.field_b.readString(param5);
              var12 = (CharSequence) ((Object) LevelDecoder.field_a);
              td.field_i = il.a(var12, (byte) 21);
              uk.field_H = id.field_b.readUnsignedByte(-89);
              aj.field_c = qc.field_d;
              if (qi.field_c.a(true) == ta.field_Db) {
                sd.field_e.a(gi.b(12476), param5);
              } else {
                if (qi.field_c.a(true) == ja.field_g) {
                  UiComponent.field_x.a(gi.b(12476), false);
                }
              }
              ck.field_b = false;
              if (var11 != null) {
                hl.a(110, gi.b(12476), var11);
              }
              if (0 >= UiComponent.field_o &&
                !me.field_b) {
                try {
                  JavaScriptBridge.callWithoutArguments("unzap", gi.b(12476), 20511);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWithArguments("zap", new Object[]{MouseInputHandler.a(-113, ed.field_j)}, gi.b(12476), -29585);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (UiComponent.field_o > 0) {
                fg.field_S = true;
              }
              dk.field_s.a((byte) 61, wa.field_rb);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                wa.field_rb[var8Lifetime1] = wa.field_rb[var8Lifetime1] + 50;
              }
              id.field_b.a((byte) 61, wa.field_rb);
              stackIn_79_0 = cb.field_g;
              return stackIn_79_0;
            }
            if (aj.field_c == qc.field_f &&
              NodeHashTableIterator.a((byte) 90)) {
              ob.b(-92);
              if (7 == cb.field_g &&
                !ck.field_b) {
                ck.field_b = true;
                stackIn_92_0 = -1;
                return stackIn_92_0;
              }
              if (cb.field_g == 7) {
                cb.field_g = 3;
              }
              SecondaryNodeDequeIterator.field_c = id.field_b.readString(false);
              ck.field_b = false;
              stackIn_90_0 = cb.field_g;
              return stackIn_90_0;
            }
            if (qf.field_a == null) {
              if (ck.field_b) {
                if (ProxySocketConnector.e(92) > 30000L) {
                  SecondaryNodeDequeIterator.field_c = aj.field_d;
                } else {
                  SecondaryNodeDequeIterator.field_c = nh.field_ib;
                }
                ck.field_b = false;
                stackIn_101_0 = 3;
                return stackIn_101_0;
              }
              var6_intLifetime2 = ae.field_x;
              ae.field_x = sd.field_h;
              sd.field_h = var6_intLifetime2;
              ck.field_b = true;
            }
            stackIn_103_0 = -1;
            return stackIn_103_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_106_0 = var6;
            stackIn_106_1 = new StringBuilder().append("uf.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            stackIn_109_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',');
            if (param4 == null) {
              stackIn_110_2 = "null";
            } else {
              stackIn_110_2 = "{...}";
            }
            throw oj.wrapException((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int readInt(int param0) {
        if (param0 < 25) {
          String var3 = (String) null;
          PacketBuffer.a(true, true, 34, (String) null, (String) null, false);
        }
        this.position = this.position + 4;
        return (255 & this.payload[this.position - 1]) + ((-16777216 & this.payload[-4 + this.position] << 24) + ((255 & this.payload[-3 + this.position]) << 16) + ((255 & this.payload[-2 + this.position]) << 8));
    }

    final static ef d(boolean param0) {
        if (mg.field_c == gj.field_a) {
          throw new IllegalStateException();
        }
        if (param0) {
          field_j = (String) null;
        }
        if (hf.field_b == gj.field_a) {
          gj.field_a = mg.field_c;
          return GameScreen.field_h;
        }
        return null;
    }

    final void b(String param0, byte param1) {
        int var8 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_long = 0L;
          if (param1 > -48) {
            this.patchShortLength(114, (byte) -57);
          }
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + (2 + var9));
              } else if (var9 >= 97 &&
                122 >= var9) {
                var3_long = var3_long + (long)(-97 + var9 + 2);
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(28 + (var9 - 48));
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
          this.a(52, var3_long);
          this.a(-128, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("uf.EB(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean e(int param0) {
        this.position = this.position - 4;
        int var2 = ef.a(104, this.payload, param0, this.position);
        int var3 = this.readInt(86);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final byte readByte(byte param0) {
        int var2 = -6 / ((param0 - 39) / 43);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void writeLong(boolean param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 40);
        if (!param0) {
          String var5 = (String) null;
          this.b((String) null, (byte) -91);
        }
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
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              if (param1 >= -84) {
                this.readLong(64);
              }
              return;
            }
            var5 = this.readInt(48);
            var6 = this.readInt(41);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + param0[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ param0[(7059 & var7) >>> 11] + var7);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, false);
            this.writeInt(var6, false);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uf.SA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final int h(int param0) {
        int var2 = 45 / ((param0 + 3) / 59);
        if (0 <= this.payload[this.position]) {
          return this.readUnsignedShort(false);
        }
        return 2147483647 & this.readInt(54);
    }

    private final void a(int param0, long param1) {
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
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int var4 = 84 / ((-78 - param0) / 47);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param1;
    }

    final int readUnsignedByte(int param0) {
        if (param0 >= -83) {
          return 59;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void writeShort(int param0, byte param1) {
        if (param1 != 106) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
    }

    final int readUnsignedShort(boolean param0) {
        if (param0) {
          return -3;
        }
        this.position = this.position + 2;
        return (this.payload[this.position - 2] << 8 & 65280) + (255 & this.payload[this.position - 1]);
    }

    final void writeInt(int param0, boolean param1) {
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
        if (param1) {
          this.payload = (byte[]) null;
        }
    }

    final void writeMedium(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
        if (param0 != -124) {
          this.readOptionalString(114);
        }
    }

    final void readBytes(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          for (var5_int = param3; var5_int < param2 + param3; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[var5_int] = this.payload[fieldTemp$0];
          }
          if (param0 < 32) {
            this.writeByte(118, (byte) 86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("uf.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int readUnsignedMedium(int param0) {
        if (param0 != 0) {
          field_n = (int[]) null;
        }
        this.position = this.position + 3;
        return ((this.payload[-3 + this.position] & 255) << 16) - (-((this.payload[-2 + this.position] & 255) << 8) - (this.payload[this.position - 1] & 255));
    }

    final void writeString(String param0, byte param1) {
        int fieldTemp$1 = 0;
        int var3_int = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + wc.a((byte) -69, 0, var4, this.payload, param0.length(), this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
          if (param1 < 88) {
            this.readInt(16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("uf.T(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TorChallenge.field_F ? 1 : 0;
        var3 = 82 / ((62 - param0) / 62);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var4 = 0;
        while (var2 < 0) {
          var4 = (var2 & 127 | var4) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var4;
    }

    final void c(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 <= 0) {
          return;
        }
        while (this.position < param0) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final String readString(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        String var4;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        if (param0) {
          var4 = (String) null;
          this.writePrefixedString((byte) 42, (String) null);
        }
        var3 = -1 + this.position - var2;
        if (var3 != 0) {
          return r.a(var3, var2, this.payload, (byte) 8);
        }
        return "";
    }

    final void writeFiveByteValue(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 16);
        if (param1 != -1709073240) {
          return;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param0;
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
        String var7 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param3 != -16384) {
            var7 = (String) null;
            this.writePrefixedString((byte) -37, (String) null);
          }
          for (var5_int = param1; var5_int < param0 + param1; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param2[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("uf.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int[] param1, int param2, int param3) {
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
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          var5_int = this.position;
          this.position = param3;
          var6 = (-param3 + param2) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(105);
            var9 = this.readInt(85);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 >>> 5 ^ var8 << 4) + var8 ^ var10 + param1[(var10 & 7247) >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param1[var10 & 3]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, param0);
            this.writeInt(var9, false);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("uf.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = LevelDecoder.a(param0, -101);
    }

    final void patchShortLength(int param0, byte param1) {
        if (param1 != -40) {
          field_j = (String) null;
        }
        this.payload[-2 + this.position - param0] = (byte)(param0 >> 8);
        this.payload[this.position + (-param0 - 1)] = (byte)param0;
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, int param1) {
        if (param1 != 14430) {
          this.readInt(-60);
        }
        int var3 = ef.a(111, this.payload, param0, this.position);
        this.writeInt(var3, false);
        return var3;
    }

    final void patchIntLength(int param0, int param1) {
        this.payload[this.position - param0 - 4] = (byte)(param0 >> 24);
        this.payload[param1 + (this.position - param0)] = (byte)(param0 >> 16);
        this.payload[this.position - param0 - 2] = (byte)(param0 >> 8);
        this.payload[-1 + (this.position - param0)] = (byte)param0;
    }

    final String readOptionalString(int param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 != -29648475) {
          field_k = false;
        }
        return this.readString(false);
    }

    final int readSignedSmart(byte param0) {
        if (param0 >= -84) {
          return 117;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 < 128) {
          return this.readUnsignedByte(-124) - 64;
        }
        return this.readUnsignedShort(false) - 49152;
    }

    final long readLong(int param0) {
        if (param0 >= -39) {
          return -20L;
        }
        long var2 = 4294967295L & (long)this.readInt(29);
        long var4 = (long)this.readInt(126) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final int readUnsignedSmart(byte param0) {
        if (param0 != 24) {
          this.writeVarInt((byte) -16, -39);
        }
        int var2 = this.payload[this.position] & 255;
        if (128 <= var2) {
          return -32768 + this.readUnsignedShort(false);
        }
        return this.readUnsignedByte(-111);
    }

    final void writeVarInt(byte param0, int param1) {
        if (0 != (-128 & param1)) {
          if ((param1 & -16384) != 0) {
            if ((-2097152 & param1) != 0) {
              if ((-268435456 & param1) != 0) {
                this.writeByte(128 | param1 >>> 28, (byte) 122);
              }
              this.writeByte((param1 | 268528079) >>> 21, (byte) 122);
            }
            this.writeByte((2099619 | param1) >>> 14, (byte) 122);
          }
          this.writeByte(128 | param1 >>> 7, (byte) 122);
        }
        if (param0 < 8) {
          this.position = -120;
        }
        this.writeByte(127 & param1, (byte) 122);
    }

    static {
        field_p = "Collect 3 seals to open the exit.";
        field_r = new int[]{0, 0, 64, 64, 64, 64};
        field_o = new Sprite[20][3][];
        field_l = "Name is available";
    }
}
