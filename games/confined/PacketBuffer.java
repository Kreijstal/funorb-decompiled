/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    int position;
    byte[] payload;
    static em field_o;

    public static void clearBufferStatics(int param0) {
        if (param0 != -4) {
          return;
        }
        try {
          field_o = null;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.V(" + param0 + ')');
        }
    }

    final int readInt(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 31) {
            this.backpatchByteLength(-65, 97);
          }
          this.position = this.position + 4;
          stackIn_4_0 = (this.payload[this.position - 1] & 255) + (((this.payload[-4 + this.position] & 255) << 24) + (this.payload[this.position - 3] << 16 & 16711680)) + (this.payload[this.position - 2] << 8 & 65280);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.J(" + param0 + ')');
        }
    }

    final void readBytes(int param0, byte param1, int param2, byte[] param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          if (param1 <= 58) {
            this.writeLong40(0L, -124);
          }
          var5_int = param0;
          while (var5_int < param0 + param2) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int] = this.payload[fieldTemp$0];
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("kg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void i(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_11_0 = 0;
        fg stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        fg stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        fg var5_ref = null;
        fg var6 = null;
        String var6_ref = null;
        fg var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var1 = e.field_c;
          var2 = var1.readUnsignedByte(param0 + 84);
          if (0 == var2) {
            if (null == ij.field_t) {
              ij.field_t = new pb(128);
              Confined.field_E = 0;
            }
            stackIn_11_0 = (1 != var1.readUnsignedByte(32)) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.readString(true);
            if (var3_int != 0) {
              var1.readString(true);
            }
            var5_ref = nh.a(var4_ref_String, 0);
            var6_ref = var1.readString(true);
            var7_ref = hh.a(0, (CharSequence) ((Object) var4_ref_String));
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = nh.a(var6_ref, 0);
              if (null != var5_ref) {
                ij.field_t.a((long)var7_ref.hashCode(), var5_ref, 117);
              }
            }
            if (null == var5_ref) {
              var5_ref = new fg();
              ij.field_t.a((long)var7_ref.hashCode(), var5_ref, param0 ^ -71);
              fieldTemp$1 = Confined.field_E;
              Confined.field_E = Confined.field_E + 1;
              var5_ref.field_lb = fieldTemp$1;
              vg.field_J.a((IntrusiveNode) (var5_ref), (byte) -97);
            }
            var5_ref.field_ob = var4_ref_String;
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              if (1 == IntrusiveNode.field_d) {
                IntrusiveNode.field_d = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (IntrusiveNode.field_d == 2) {
                IntrusiveNode.field_d = 1;
              }
              return;
            }
            if (var2 == 4) {
              IntrusiveNode.field_d = 1;
              var3 = var1.readString(true);
              ql.field_t = ((String) (var3)).intern();
              var4 = var1.readUnsignedByte(param0 ^ -20);
              tm.a(-127, var4);
              return;
            }
            mb.a("F1: " + ui.a(10), true, (Throwable) null);
            if (param0 != -52) {
              return;
            }
            dc.d(111);
            return;
          }
          if (AccountCreationResultPanel.field_Db == null) {
            AccountCreationResultPanel.field_Db = new pb(128);
            c.field_k = 0;
          }
          var3Lifetime1 = var1.readString(true);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readString(true);
          var5 = var1.readString(true);
          var6 = pm.a(var4_ref_StringLifetime1, true);
          if (var6 == null) {
            var6 = pm.a(var5, true);
            if (var6 != null) {
              AccountCreationResultPanel.field_Db.a((long)hh.a(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6, 123);
            }
          }
          if (var6 == null) {
            var6 = new fg();
            AccountCreationResultPanel.field_Db.a((long)hh.a(0, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6, 117);
            fieldTemp$0 = c.field_k;
            c.field_k = c.field_k + 1;
            var6.field_lb = fieldTemp$0;
            il.field_fb.a((IntrusiveNode) (var6), (byte) -103);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_kb = (String) (var3Lifetime1);
          var6.field_ob = var4_ref_StringLifetime1;
          var6.unlink(true);
          var7 = (fg) (il.field_fb.a(56));
          scanLoop1: while (true) {
            if (var7 != null) {
              stackIn_57_0 = var6;
              stackIn_57_1 = 200;
              stackIn_57_2 = var7;
              if (var8 != 0) {
                break scanLoop1;
              }
              if (tb.a(stackIn_57_0, stackIn_57_1, stackIn_57_2)) {
                var7 = (fg) (il.field_fb.d(param0 ^ -2169));
                continue;
              }
            }
            if (var7 == null) {
              il.field_fb.a((IntrusiveNode) (var6), (byte) 89);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_57_0 = var7;
            stackIn_57_1 = param0 ^ -52;
            stackIn_57_2 = var6;
            break;
          }
          ri.a(stackIn_57_0, stackIn_57_1, stackIn_57_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "kg.L(" + param0 + ')');
        }
    }

    private final void writeLong56(long param0, int param1) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
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
        if (param1 != 17526) {
          return;
        }
        try {
          fieldTemp$5 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$5] = (byte)(int)(param0 >> 8);
          fieldTemp$6 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$6] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void writePrefixedString(String param0, byte param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 24) {
            return;
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$4 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$4] = (byte) 0;
          this.position = this.position + AccountRequestState.encodeCp1252Range(this.payload, (byte) -116, (CharSequence) ((Object) param0), 0, this.position, param0.length());
          fieldTemp$5 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$5] = (byte) 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("kg.HA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void applyRsa(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(0, (byte) 77, var4_int, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(var8.length, 8);
          this.writeBytes(var8.length, param1, var8, 115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kg.F(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void writeInt(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          fieldTemp$4 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$4] = (byte)(param1 >> 24);
          if (param0 >= -81) {
            this.position = -111;
          }
          fieldTemp$5 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$5] = (byte)(param1 >> 16);
          fieldTemp$6 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$6] = (byte)(param1 >> 8);
          fieldTemp$7 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$7] = (byte)param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.S(" + param0 + ',' + param1 + ')');
        }
    }

    final int readUnsignedSmart(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -11) {
            stackIn_2_0 = 6;
            return stackIn_2_0;
          }
          var2_int = 255 & this.payload[this.position];
          if (var2_int < 128) {
            stackIn_7_0 = this.readUnsignedByte(32);
            return stackIn_7_0;
          }
          stackIn_5_0 = this.readUnsignedShort((byte) 25) - 32768;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.CA(" + param0 + ')');
        }
    }

    final int readUnsignedMedium(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.position = this.position + 3;
          if (param0 >= -40) {
            this.payload = (byte[]) null;
          }
          stackIn_4_0 = (255 & this.payload[this.position - 1]) + (16711680 & this.payload[this.position - 3] << 16) + ((this.payload[-2 + this.position] & 255) << 8);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.IA(" + param0 + ')');
        }
    }

    final int readSignedSmart(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1647) {
            this.payload = (byte[]) null;
          }
          var2_int = this.payload[this.position] & 255;
          if (var2_int < 128) {
            stackIn_7_0 = -64 + this.readUnsignedByte(32);
            return stackIn_7_0;
          }
          stackIn_5_0 = this.readUnsignedShort((byte) 25) - 49152;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.DA(" + param0 + ')');
        }
    }

    final void writeString(String param0, int param1) {
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          this.position = this.position + AccountRequestState.encodeCp1252Range(this.payload, (byte) -116, (CharSequence) ((Object) param0), 0, this.position, param0.length());
          var4 = -86 % ((param1 - 58) / 63);
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte) 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("kg.JA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void writeShort(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 8) {
            this.readBytes(98, (byte) -62, -35, (byte[]) null);
          }
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte)(param0 >> 8);
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void writeMedium(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        try {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(param1 >> 16);
          int var3_int = 24 / ((71 - param0) / 48);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(param1 >> 8);
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte)param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void backpatchShortLength(int param0, int param1) {
        this.payload[-2 + (this.position - param0)] = (byte)(param0 >> 8);
        if (param1 >= -8) {
          return;
        }
        try {
          this.payload[-1 + (this.position - param0)] = (byte)param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.U(" + param0 + ',' + param1 + ')');
        }
    }

    final int readUnsignedShortOrInt(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -103 % ((param0 - 47) / 51);
          if (this.payload[this.position] >= 0) {
            stackIn_4_0 = this.readUnsignedShort((byte) 25);
            return stackIn_4_0;
          }
          stackIn_2_0 = this.readInt((byte) 37) & 2147483647;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.AA(" + param0 + ')');
        }
    }

    final void padZerosTo(int param0, byte param1) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (param1 <= 15) {
            this.payload = (byte[]) null;
          }
          while (param0 > this.position) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = (byte) 0;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final long readLong(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = 4294967295L & (long)this.readInt((byte) 79);
          var4 = 4294967295L & (long)this.readInt((byte) 124);
          if (param0 == -68) {
            stackIn_4_0 = var4 + (var2_long << 32);
            return stackIn_4_0;
          }
          stackIn_2_0 = 94L;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.BA(" + param0 + ')');
        }
    }

    final void writeLong(long param0, byte param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        try {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(int)(param0 >> 56);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(int)(param0 >> 48);
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte)(int)(param0 >> 40);
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)(int)(param0 >> 32);
          int var4_int = -85 / ((param1 - 40) / 62);
          fieldTemp$4 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$4] = (byte)(int)(param0 >> 24);
          fieldTemp$5 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$5] = (byte)(int)(param0 >> 16);
          fieldTemp$6 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$6] = (byte)(int)(param0 >> 8);
          fieldTemp$7 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$7] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void writeByte(int param0, int param1) {
        int fieldTemp$0 = 0;
        try {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)param1;
          if (param0 < 85) {
            field_o = (em) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final void encryptXtea(int param0, int[] param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
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
        var10 = Confined.field_J ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (param0 != 65280) {
            this.position = 94;
          }
          var4 = 0;
          while (var4 < var3_int) {
            var5 = this.readInt((byte) 47);
            var6 = this.readInt((byte) 56);
            var7 = 0;
            var8 = -1640531527;
            if (var10 != 0) {
              return;
            }
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + param1[var7 & 3] ^ var6 + (var6 << 4 ^ var6 >>> 5));
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ var7 + param1[var7 >>> 11 & 526385155]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(-127, var5);
            this.writeInt(-102, var6);
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("kg.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void writeSignedSmart(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 64 &&
            param1 >= -64) {
            this.writeByte(95, param1 + 64);
            return;
          }
          if (param0) {
            this.writeByte(-33, 34);
          }
          if (param1 < 16384 &&
            param1 >= -16384) {
            this.writeShort(param1 + 49152, 8);
            return;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.R(" + param0 + ',' + param1 + ')');
        }
    }

    final String readNullableString(byte param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 102) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (0 != this.payload[this.position]) {
            stackIn_7_0 = this.readString(true);
            return stackIn_7_0;
          }
          this.position = this.position + 1;
          stackIn_5_0 = null;
          return (String) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.I(" + param0 + ')');
        }
    }

    final void decryptXteaRange(int param0, int[] param1, int param2, byte param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
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
        var13 = Confined.field_J ? 1 : 0;
        try {
          var5_int = this.position;
          if (param3 != 72) {
            this.position = 49;
          }
          this.position = param0;
          var6 = (param2 - param0) / 8;
          var7 = 0;
          while (var6 > var7) {
            var8 = this.readInt((byte) 84);
            var9 = this.readInt((byte) 51);
            var10 = -957401312;
            var11 = -1640531527;
            if (var13 != 0) {
              return;
            }
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (0 < incrementValue$0) {
                var9 = var9 - (var10 + param1[(var10 & 7121) >>> 11] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (param1[var10 & 3] + var10 ^ var9 + (var9 << 4 ^ var9 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(-107, var8);
            this.writeInt(-115, var9);
            var7++;
          }
          this.position = var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("kg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeBase38String(int param0, String param1) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Confined.field_J ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          var8 = 19;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 < 0))) {
            var3_long = var3_long * 38L;
            stackIn_31_0 = ~var8;
            stackIn_31_1 = ~var7;
            if (var10 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_31_0 > stackIn_31_1) {
                var9 = param1.charAt(var8);
                if (var9 >= 65 &&
                  var9 <= 90) {
                  var3_long = var3_long + (long)(-65 + (var9 + 2));
                } else {
                  if (var9 < 97 ||
                    var9 > 122) {
                    if (var9 >= 48 &&
                      var9 <= 57) {
                      var3_long = var3_long + (long)(-20 + var9);
                    } else {
                      var3_long = var3_long + 1L;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var3_long = var3_long + (long)(-95 + var9);
                  }
                }
              }
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
              var8--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_31_0 = param0;
            stackIn_31_1 = 11404;
          }
          if (stackIn_31_0 != stackIn_31_1) {
            return;
          }
          this.writeLong56(var3_long, 17526);
          this.writeLong56(var5, param0 ^ 26874);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("kg.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final boolean verifyCrc32(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.position = this.position - param0;
          var2_int = ah.computeCrc32(this.payload, 0, this.position, (byte) 68);
          var3 = this.readInt((byte) 36);
          if (~var2_int != ~var3) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.K(" + param0 + ')');
        }
    }

    final String readString(boolean param0) {
        int fieldTemp$0 = 0;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          var2_int = this.position;
          do {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
          } while (this.payload[fieldTemp$0] != 0);
          var3 = -var2_int + (this.position - 1);
          if (!param0) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          if (0 != var3) {
            stackIn_11_0 = kh.a(this.payload, var3, 0, var2_int);
            return stackIn_11_0;
          }
          stackIn_9_0 = "";
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.GA(" + param0 + ')');
        }
    }

    final byte readByte(boolean param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        byte stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_o = (em) null;
          }
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          stackIn_4_0 = this.payload[fieldTemp$1];
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.D(" + param0 + ')');
        }
    }

    final void writeBytes(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        try {
          if (param3 <= 58) {
            this.padZerosTo(60, (byte) -116);
          }
          var5_int = param1;
          while (var5_int < (param0 + param1)) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param2[var5_int];
            var5_int++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("kg.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        try {
          ac.a(param0);
          vl.field_b = true;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.A(" + param0 + ')');
        }
    }

    PacketBuffer(int param0) {
        try {
          this.position = 0;
          this.payload = dl.a(param0, -101);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.<init>(" + param0 + ')');
        }
    }

    final int readUnsignedByte(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 32) {
            this.appendCrc32(84, -126);
          }
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          stackIn_4_0 = this.payload[fieldTemp$1] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.M(" + param0 + ')');
        }
    }

    final void writeLong40(long param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != 8850) {
          return;
        }
        try {
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte)(int)(param0 >> 16);
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)(int)(param0 >> 8);
          fieldTemp$4 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$4] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kg.B(" + param0 + ',' + param1 + ')');
        }
    }

    PacketBuffer(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.position = 0;
          this.payload = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("kg.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int readUnsignedShort(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.position = this.position + 2;
          if (param0 != 25) {
            this.payload = (byte[]) null;
          }
          stackIn_4_0 = (this.payload[this.position - 2] << 8 & 65280) + (this.payload[this.position - 1] & 255);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.O(" + param0 + ')');
        }
    }

    final int appendCrc32(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = ah.computeCrc32(this.payload, param1, this.position, (byte) 121);
          if (param0 != 26199) {
            stackIn_2_0 = -53;
            return stackIn_2_0;
          }
          this.writeInt(param0 ^ -26114, var3_int);
          stackIn_4_0 = var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.N(" + param0 + ',' + param1 + ')');
        }
    }

    final String readPrefixedString(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          var2_int = this.payload[fieldTemp$0];
          if (var2_int != 0) {
            throw new IllegalStateException("");
          }
          var3 = this.position;
          do {
            fieldTemp$1 = this.position;
            this.position = this.position + 1;
          } while (this.payload[fieldTemp$1] != 0);
          if (param0 != 31) {
            this.payload = (byte[]) null;
          }
          var4 = -1 + (this.position - var3);
          if (0 == var4) {
            stackIn_15_0 = "";
            return stackIn_15_0;
          }
          stackIn_17_0 = kh.a(this.payload, var4, 0, var3);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.P(" + param0 + ')');
        }
    }

    final void backpatchByteLength(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 25859) {
            PacketBuffer.c(false);
          }
          this.payload[this.position + (-param1 - 1)] = (byte)param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.MA(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_o = null;
    }
}
