/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends hk {
    static hh contentFadeInPhase;
    static MusicScore field_M;
    static String js5IoErrorText;
    int field_E;
    int field_H;
    int field_O;
    static String fullscreenMembersButtonText;
    static int field_G;
    int field_J;
    int field_I;
    int field_K;

    final static mg b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = Geoblox.clientControlFlowFlag;
        mg var5 = (mg) ((Object) ResourceArchive.field_d.firstForIteration(param2 ^ param2));
        while (var5 != null) {
            if (~var5.field_i == ~param0) {
                return var5;
            }
            var5 = (mg) ((Object) ResourceArchive.field_d.nextForIteration(1));
        }
        var5 = new mg();
        var5.field_f = param3;
        var5.field_l = param1;
        var5.field_i = param0;
        ResourceArchive.field_d.addLast(-71, var5);
        ib.a(param4, param2 + 5, var5);
        return var5;
    }

    public static void f(int param0) {
        js5IoErrorText = null;
        field_M = null;
        if (param0 != 0) {
            field_M = (MusicScore) null;
        }
        contentFadeInPhase = null;
        fullscreenMembersButtonText = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Geoblox.clientControlFlowFlag;
        try {
          if (!super.a(param0, -52, param2, param3, param4, param5, param6)) {
            var8_int = 35 % ((-3 - param1) / 38);
            return false;
          }
          var8_int = -this.field_E - (this.widgetX + (param2 - param4));
          var9 = param5 - (this.widgetY + param0 + this.field_O);
          if (var8_int * var8_int + var9 * var9 < this.field_K * this.field_K) {
            var10 = Math.atan2((double)var9, (double)var8_int) - TextInputValidator.field_f;
            if (!(var10 < 0.0)) {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.field_H;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_H;
            }
            this.field_I = (int)(var10 * (double)this.field_H / 6.283185307179586);
            while (this.field_I >= this.field_H) {
              this.field_I = this.field_I - this.field_H;
            }
            while (this.field_I < 0) {
              this.field_I = this.field_I + this.field_H;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var8);
          stackIn_19_1 = new StringBuilder().append("qb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, lk param1, String param2, int param3, BitmapFont param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        BitmapFont var10 = null;
        var9 = Geoblox.clientControlFlowFlag;
        try {
          var5_int = 0;
          if (param3 != 60) {
            var10 = (BitmapFont) null;
            qb.a(-58, (lk) null, (String) null, -15, (BitmapFont) null);
          }
          var6 = -1;
          for (var7 = 1; var7 < param2.length(); var7++) {
            var8 = param2.charAt(var7);
            if (60 == var8) {
              var6 = param1.field_c[0] + (var5_int >> 8) + param4.measureTextWidth(param2.substring(0, var7));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param0;
              }
              param1.field_c[var7] = param1.field_c[0] + (var5_int >> 8) + param4.measureTextWidth(param2.substring(0, 1 + var7)) - param4.measureCharacterAdvance((char) var8);
            } else {
              param1.field_c[var7] = var6;
            }
            if (var8 != 62) {
              continue;
            }
            var6 = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var5);
          stackIn_19_1 = new StringBuilder().append("qb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private qb() throws Throwable {
        throw new Error();
    }

    static {
        contentFadeInPhase = new hh();
        js5IoErrorText = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        fullscreenMembersButtonText = "Members";
    }
}
