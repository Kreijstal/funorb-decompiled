/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends lk {
    private ip[] field_w;
    static String field_u;
    static String field_x;
    private ip field_v;

    final static void finishTaggedPayload(int headerBitPosition, int obfuscationGuard, int headerBitLength, CipherPacketBuffer packet, int payloadBitLength) {
        try {
          int var5_int = 58 / ((obfuscationGuard + 86) / 38);
          if (headerBitLength < payloadBitLength) {
            packet.setWriteBitPosition(headerBitPosition, (byte) 0);
            AiInfluenceMap.writeTieredSignedInt(14, 20, payloadBitLength, 30, 1, 4, packet);
          }
          packet.setReadBitPosition((byte) -83, payloadBitLength + headerBitLength + headerBitPosition);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ao.B(" + headerBitPosition + ',' + obfuscationGuard + ',' + headerBitLength + ',' + (packet != null ? "{...}" : "null") + ',' + payloadBitLength + ')');
        }
    }

    final static String a(String param0, boolean param1, String param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.ensureIndex((byte) 82)) {
            stackIn_3_0 = (String) (param0);
            return stackIn_3_0;
          }
          if (param1) {
            stackIn_8_0 = param2 + " - " + param3.a(0) + "%";
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ao.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        kb stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        ip var7 = null;
        ip var9 = null;
        fw var10 = null;
        ip var11 = null;
        ip var12 = null;
        ip var13 = null;
        ip var14 = null;
        try {
          if (param0 instanceof fw) {
            stackIn_3_0 = (kb) (param0);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (fw) (stackIn_3_0);
          CampaignUnitOverride.a(param1 + param0.field_B, param0.field_l + (param0.field_B + param1), param0.field_p + (param4 + param0.field_w), param4 + param0.field_p, (byte) 72);
          if (param2 >= -79) {
            return;
          }
          if (var10 != null) {
            param3 = param3 & var10.field_I;
          }
          var7 = this.field_w[0];
          this.field_v.a(false);
          var7.a(-10265, this.field_v, param1, this, param4, param0);
          if (var10 != null) {
            if (var10.field_K) {
              var11 = this.field_w[1];
              if (var11 != null) {
                var11.a(-10265, this.field_v, param1, this, param4, param0);
              }
            }
            if (var10.field_t) {
              var12 = this.field_w[3];
              if (0 != var10.field_q &&
                var12 != null) {
                var12.a(-10265, this.field_v, param1, this, param4, param0);
              } else {
                var9 = this.field_w[2];
                if (var9 != null) {
                  var9.a(-10265, this.field_v, param1, this, param4, param0);
                }
              }
            }
          }
          if (param0.a(false)) {
            var13 = this.field_w[5];
            if (var13 != null) {
              var13.a(-10265, this.field_v, param1, this, param4, param0);
            }
          }
          if (!param3) {
            var14 = this.field_w[4];
            if (var14 != null) {
              var14.a(-10265, this.field_v, param1, this, param4, param0);
            }
          }
          this.field_v.a(param0, (byte) 113, param4, param1, this);
          rf.b(-18862);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("ao.C(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, RgbSprite param1) {
        int var4 = 0;
        ip[] var3 = null;
        ip var5 = null;
        int var6 = 0;
        ip[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7 = this.field_w;
          var3 = var7;
          for (var4 = param0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ao.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ao(ao param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, 6);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ao.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_x = null;
        field_u = null;
        int var1 = 101 / ((param0 + 45) / 33);
    }

    public ao() {
        this.field_w = new ip[6];
        this.field_v = new ip();
        ip dupTemp$0 = new ip();
        this.field_w[0] = dupTemp$0;
        ip var1 = dupTemp$0;
        var1.a(false);
    }

    final void a(int param0, RgbSprite[] param1) {
        ip[] var3 = null;
        int var4 = 0;
        ip var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = this.field_w;
          var4 = 0;
          if (param0 >= -123) {
            field_u = (String) null;
          }
          while (var4 < var3.length) {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_d = param1;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ao.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final ip a(int param0, byte param1) {
        if (param1 >= -69) {
          this.a(-22, (byte) -18);
        }
        ip dupTemp$0 = new ip();
        this.field_w[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(RgbSprite[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (null == this.field_w[var4_int]) {
            this.field_w[var4_int] = new ip();
          }
          if (param2 != -7) {
            RgbSprite[] var5 = (RgbSprite[]) null;
            this.a((RgbSprite[]) null, 15, 64);
          }
          this.field_w[param1].field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ao.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, ao param1, int param2) {
        int var4_int = 0;
        ip dupTemp$0 = null;
        ip stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        ip stackIn_12_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ip var5 = null;
        ip var6 = null;
        int var7 = 0;
        ao var8 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != 6) {
            var8 = (ao) null;
            this.a(false, (ao) null, 119);
          }
          super.a(param1, 24978);
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_w[var4_int];
              if (var5 != null) {
                var6 = param1.field_w[var4_int];
                stackIn_11_0 = var5;
                stackIn_11_1 = false;
                if (var6 == null) {
                  dupTemp$0 = new ip();
                  param1.field_w[var4_int] = dupTemp$0;
                  stackIn_12_2 = dupTemp$0;
                } else {
                  stackIn_12_2 = var6;
                }
                ((ip) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_12_2);
              } else {
                param1.field_w[var4_int] = null;
              }
            }
            return;
          }
          vm.a(this.field_w, 0, param1.field_w, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ao.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_u = "Tonics to strengthen your troops.";
        field_x = "Portals can only be made on open ground";
    }
}
