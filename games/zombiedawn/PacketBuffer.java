/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static boolean field_i;
    static mf field_k;
    byte[] payload;
    int position;

    final void writeLengthPrefixByte(int param0, int param1) {
        int var3 = 120 % ((-2 - param0) / 42);
        this.payload[this.position + (-param1 - 1)] = (byte)param1;
    }

    final void writeLong40(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        if (param1 != 0) {
          field_i = false;
        }
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

    final String readString(int param0) {
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
        if (param0 != 19988) {
          this.position = -83;
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -var3 + (this.position - 1);
        if (var4 == 0) {
          return "";
        }
        return SpatialObject.a(this.payload, var4, var3, -113);
    }

    final void writeInt(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
        int var3 = 18 / ((param0 + 45) / 57);
    }

    final int writeCrc32(int param0, int param1) {
        int var3 = ij.a(this.position, this.payload, (byte) -87, param1);
        int var4 = -56 / ((param0 - 1) / 60);
        this.writeInt(-126, var3);
        return var3;
    }

    final void writeTerminatedStringWithHeader(byte param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0 != -88) {
            field_i = true;
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + nd.a(false, var4, this.payload, param1.length(), 0, this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "de.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void readBytes(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          for (var5_int = param1; var5_int < param1 + param0; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[var5_int] = this.payload[fieldTemp$0];
          }
          if (param3 != 11240) {
            this.position = -95;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("de.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeTerminatedString(int param0, String param1) {
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        int var3_int = param1.indexOf('\0');
        if (param0 != 128) {
          return;
        }
        try {
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + nd.a(false, var4, this.payload, param1.length(), 0, this.position);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "de.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean verifyCrc32(byte param0) {
        this.position = this.position - 4;
        int var2 = ij.a(this.position, this.payload, (byte) 119, 0);
        if (param0 >= -65) {
          PacketBuffer.releaseStatics(-85);
        }
        int var3 = this.readInt(-107);
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        if (param0 != 27291) {
          field_k = (mf) null;
        }
    }

    final void writeShort(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != 105) {
          return;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
    }

    final static String[] split(char param0, String param1, int param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawn.field_J;
        try {
          var11 = (CharSequence) ((Object) param1);
          var3_int = ae.a((byte) -49, param0, var11);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1.charAt(var8) != param0; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var6, var8);
            var6 = var8 + 1;
          }
          if (param2 >= -122) {
            var10 = (String) null;
            PacketBuffer.split(' ', (String) null, 37);
          }
          var4[var3_int] = param1.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("de.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final void writeByte(int param0, int param1) {
        int var3 = 91 / ((param1 + 33) / 45);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final int a(int param0) {
        if (param0 != -129) {
          this.position = -9;
        }
        if (this.payload[this.position] >= 0) {
          return this.f(2);
        }
        return 2147483647 & this.readInt(121);
    }

    final int f(byte param0) {
        int var2 = this.payload[this.position] & 255;
        int var3 = -67 % ((param0 - 44) / 50);
        if (var2 < 128) {
          return this.readUnsignedByte((byte) -115) - 64;
        }
        return this.f(2) - 49152;
    }

    final int f(int param0) {
        this.position = this.position + param0;
        return (255 & this.payload[-1 + this.position]) + (65280 & this.payload[-2 + this.position] << 8);
    }

    final byte readByte(byte param0) {
        if (param0 != 116) {
          return (byte) 122;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void encryptRsa(java.math.BigInteger param0, boolean param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          if (param1) {
            this.readUnsignedByte((byte) -112);
          }
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(var4_int, 0, var5, 11240);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(var8.length, (byte) 105);
          this.writeBytes(var8, var8.length, 0, -27843);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "de.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void padToPosition(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = ZombieDawn.field_J;
        while (this.position < param0) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param1 != 0) {
          this.position = 78;
        }
    }

    final static int a(boolean param0, String param1, String param2, int param3, boolean param4, boolean param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_47_0 = false;
          int stackIn_75_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_86_0 = 0;
          int stackIn_95_0 = 0;
          int stackIn_98_0 = 0;
          int stackIn_100_0 = 0;
          RuntimeException stackIn_103_0 = null;
          StringBuilder stackIn_103_1 = null;
          String stackIn_104_2 = null;
          StringBuilder stackIn_106_1 = null;
          String stackIn_107_2 = null;
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
          var9 = ZombieDawn.field_J;
          try {
            if (sn.field_c == null &&
              !i.a(param4, true)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (ic.field_T == ui.field_g) {
              if (param4) {
                var10 = (String) null;
                ac.field_q = sn.a((byte) -112, p.field_a, false, param2, (String) null);
              } else {
                ac.field_q = cj.a(false, (byte) 30, param1, param2);
              }
              dp.field_e.position = 0;
              dp.field_e.writeByte(14, -99);
              dp.field_e.writeByte(ac.field_q.a((byte) -102).field_b, -122);
              vl.a((byte) -46, -1);
              ic.field_T = fe.field_M;
            }
            if (ic.field_T == fe.field_M &&
              ck.a((byte) 81, 1)) {
              var6_int = fj.field_g.readUnsignedByte((byte) -120);
              fj.field_g.position = 0;
              if (var6_int == 0) {
                ic.field_T = b.field_n;
              } else {
                l.field_d = var6_int;
                ic.field_T = cj.field_g;
                jd.field_b = -1;
              }
            }
            if (ic.field_T == b.field_n &&
              ck.a((byte) -104, 8)) {
              dh.field_b = fj.field_g.readLong(true);
              fj.field_g.position = 0;
              rk.a(param5, ac.field_q, param4, -27886, param3);
              ic.field_T = hp.field_z;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ic.field_T == hp.field_z &&
              ck.a((byte) 4, 1)) {
              var6_intLifetime1 = fj.field_g.readUnsignedByte((byte) -123);
              ia.field_b = null;
              l.field_d = var6_intLifetime1;
              fj.field_g.position = 0;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  jd.field_b = -1;
                  ic.field_T = cj.field_g;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  p.a(1);
                  nm.field_d = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ic.field_T = td.field_b;
                jd.field_b = -1;
              }
            }
            if (td.field_b == ic.field_T &&
              nn.a(-2887)) {
              p.field_a = fj.field_g.readLong(param0);
              lo.field_j = fj.field_g.readUnsignedByte((byte) -115);
              fj.field_g.readUnsignedByte((byte) -119);
              be.field_j = fj.field_g.f(2);
              var11 = fj.field_g.h(-1);
              var7 = fj.field_g.readUnsignedByte((byte) -118);
              if ((1 & var7) != 0) {
                la.a((byte) 61);
              }
              if (!param4) {
                stackIn_44_0 = ((4 & var7) != 0);
                MouseInputHandler.field_c = stackIn_44_0;
                stackIn_47_0 = ((8 & var7) != 0);
                jh.field_i = stackIn_47_0;
                if (jh.field_i) {
                }
              }
              if (ni.field_a) {
                fj.field_g.readUnsignedByte((byte) -120);
                fj.field_g.readUnsignedByte((byte) -121);
                fj.field_g.readInt(-105);
                ExceptionWrapper.field_i = fj.field_g.f(2);
                o.field_l = new byte[ExceptionWrapper.field_i];
                for (var8 = 0; var8 < ExceptionWrapper.field_i; var8++) {
                  o.field_l[var8] = fj.field_g.readByte((byte) 116);
                }
              }
              ce.field_r = fj.field_g.a(true);
              var12 = (CharSequence) ((Object) ce.field_r);
              kf.field_T = fm.a(var12, -101);
              sd.field_b = fj.field_g.readUnsignedByte((byte) -120);
              ic.field_T = df.field_j;
              if (ac.field_q.a((byte) -102) == dp.field_a) {
                em.field_J.a(640, hc.a(0));
              } else {
                if (ac.field_q.a((byte) -102) == vh.field_d) {
                  wn.field_a.a(640, hc.a(0));
                }
              }
              nm.field_d = false;
              if (var11 != null) {
                qg.a(165, hc.a(0), var11);
              }
              if (be.field_j <= 0 &&
                !MouseInputHandler.field_c) {
                try {
                  qe.callWindowFunction(hc.a(0), "unzap", -108);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  qe.a(new Object[]{aa.a(p.field_a, -27513)}, "zap", 29674, hc.a(0));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (be.field_j > 0) {
                ih.field_S = true;
              }
              dp.field_e.a(110, vj.field_t);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                vj.field_t[var8Lifetime1] = vj.field_t[var8Lifetime1] + 50;
              }
              fj.field_g.a(-108, vj.field_t);
              stackIn_75_0 = l.field_d;
              return stackIn_75_0;
            }
            if (ic.field_T == cj.field_g &&
              nn.a(-2887)) {
              p.a(1);
              if (l.field_d == 7 &&
                !nm.field_d) {
                nm.field_d = true;
                stackIn_82_0 = -1;
                return stackIn_82_0;
              }
              if (l.field_d == 7) {
                l.field_d = 3;
              }
              sc.field_d = fj.field_g.a(true);
              nm.field_d = false;
              stackIn_86_0 = l.field_d;
              return stackIn_86_0;
            }
            if (null == sn.field_c) {
              if (nm.field_d) {
                if (gd.a(-125) <= 30000L) {
                  sc.field_d = rl.field_a;
                } else {
                  sc.field_d = dl.field_b;
                }
                nm.field_d = false;
                stackIn_95_0 = 3;
                return stackIn_95_0;
              }
              var6_intLifetime2 = ci.field_c;
              ci.field_c = cn.field_j;
              nm.field_d = true;
              cn.field_j = var6_intLifetime2;
            }
            if (param0) {
              stackIn_100_0 = -1;
              return stackIn_100_0;
            }
            stackIn_98_0 = -40;
            return stackIn_98_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_103_0 = var6;
            stackIn_103_1 = new StringBuilder().append("de.T(").append(param0).append(',');
            if (param1 == null) {
              stackIn_104_2 = "null";
            } else {
              stackIn_104_2 = "{...}";
            }
            stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
            if (param2 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int readUnsignedMedium(int param0) {
        this.position = this.position + 3;
        if (param0 != -1875) {
          this.position = 35;
        }
        return (this.payload[this.position - 1] & 255) + ((255 & this.payload[this.position - 3]) << 16) + ((255 & this.payload[-2 + this.position]) << 8);
    }

    private final void a(long param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 16);
        if (param1 != 83) {
          field_i = false;
        }
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param0;
    }

    final String h(int param0) {
        if (param0 == ~this.payload[this.position]) {
          this.position = this.position + 1;
          return null;
        }
        return this.a(true);
    }

    final int c(byte param0) {
        int var2 = this.payload[this.position] & 255;
        if (param0 != -107) {
          this.writeCrc32(-85, -107);
        }
        if (var2 < 128) {
          return this.readUnsignedByte((byte) -119);
        }
        return -32768 + this.f(param0 ^ -105);
    }

    final int readVarInt(boolean param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        String var5;
        var4 = ZombieDawn.field_J;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        if (!param0) {
          var5 = (String) null;
          PacketBuffer.a(false, (String) null, (String) null, 7, false, false);
        }
        return var2 | var3;
    }

    final String a(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = this.position - var2 - 1;
        if (0 == var3) {
          return "";
        }
        if (param0) {
          return SpatialObject.a(this.payload, var3, var2, -120);
        }
        return (String) null;
    }

    final void writeBytes(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          if (param3 != -27843) {
            this.position = 16;
          }
          for (var5_int = param2; param2 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("de.UA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int readUnsignedByte(byte param0) {
        if (param0 > -114) {
          this.position = 113;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int var4 = 76 % ((60 - param1) / 60);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param0;
    }

    final void a(int[] param0, int param1) {
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
        var10 = ZombieDawn.field_J;
        try {
          if (param1 != 30044) {
            return;
          }
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.readInt(-114);
            var6 = this.readInt(-112);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ var7 + param0[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + param0[var7 >>> 11 & 1524629507]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(param1 - 30148, var5);
            this.writeInt(82, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("de.AB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final long readLong(boolean param0) {
        long var2 = 4294967295L & (long)this.readInt(106);
        if (!param0) {
          field_i = true;
        }
        long var4 = (long)this.readInt(-117) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void writeLengthPrefixInt(int param0, int param1) {
        this.payload[-param0 + (this.position - 4)] = (byte)(param0 >> 24);
        this.payload[-param0 + this.position - 3] = (byte)(param0 >> 16);
        this.payload[-param0 + (this.position - 2)] = (byte)(param0 >> 8);
        if (param1 > -45) {
          return;
        }
        this.payload[-1 + (-param0 + this.position)] = (byte)param0;
    }

    final void writeMedium(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int var3 = -89 % ((-56 - param1) / 36);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    final void writeSignedSmart(int param0, int param1) {
        if (param1 < 64 &&
          -64 <= param1) {
          this.writeByte(64 + param1, 31);
          return;
        }
        if (param0 != 17087) {
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.writeShort(param1 + 49152, (byte) 105);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readInt(int param0) {
        int var2 = -54 % ((25 - param0) / 62);
        this.position = this.position + 4;
        return (this.payload[this.position - 4] << 24 & -16777216) + (16711680 & this.payload[-3 + this.position] << 16) + ((255 & this.payload[-2 + this.position]) << 8) + (255 & this.payload[-1 + this.position]);
    }

    final void a(String param0, byte param1) {
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
        var10 = ZombieDawn.field_J;
        try {
          var3_long = 0L;
          if (param1 <= 20) {
            this.payload = (byte[]) null;
          }
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(var9 - 63);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(2 - (-var9 + 97));
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-48 + (var9 + 28));
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
          this.a(var3_long, (byte) 83);
          this.a(var5, (byte) 83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("de.FA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final void writeLengthPrefixShort(int param0, int param1) {
        this.payload[-param1 + (this.position - 2)] = (byte)(param1 >> 8);
        if (param0 != 57) {
          this.readLong(true);
        }
        this.payload[this.position - param1 - 1] = (byte)param1;
    }

    final void writeVarInt(byte param0, int param1) {
        if ((-128 & param1) != 0) {
          if (0 != (param1 & -16384)) {
            if (0 != (param1 & -2097152)) {
              if (0 != (param1 & -268435456)) {
                this.writeByte(128 | param1 >>> 28, 73);
              }
              this.writeByte(param1 >>> 21 | 128, 64);
            }
            this.writeByte(param1 >>> 14 | 128, 33);
          }
          this.writeByte((16387 | param1) >>> 7, -118);
        }
        this.writeByte(127 & param1, -125);
        if (param0 <= 17) {
          field_k = (mf) null;
        }
    }

    final void a(int param0, int param1, int[] param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
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
        var13 = ZombieDawn.field_J;
        try {
          var5_int = this.position;
          this.position = param3;
          var6 = (param1 - param3) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              if (param0 != 153818020) {
                this.f((byte) -54);
              }
              return;
            }
            var8 = this.readInt(95);
            var9 = this.readInt(-103);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (0 < incrementValue$0) {
                var9 = var9 - (param2[var10 >>> 11 & -692060157] + var10 ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ param2[var10 & 3] + var10);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(param0 - 153818145, var8);
            this.writeInt(118, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("de.RA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = ch.a(-5827, param0);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "de.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
