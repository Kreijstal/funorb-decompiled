/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpecialOrderSubmessage implements DiffableState {
    ShipBlueprint blueprint;
    SettingsChange settingsChange;
    SpawnChoice spawnchoice;
    static caa[] field_f;
    int ordertype;
    PlayerVote vote;

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        SpecialOrderSubmessage var5 = null;
        try {
          var5 = (SpecialOrderSubmessage) (other);
          if (this.settingsChange != null &&
            var5.settingsChange != null) {
            this.settingsChange.reportDifferences(var5.settingsChange, -52);
          }
          if (this.spawnchoice != null &&
            var5.spawnchoice != null) {
            this.spawnchoice.reportDifferences(var5.spawnchoice, -93);
          }
          if (null != this.vote &&
            null != var5.vote) {
            this.vote.reportDifferences(var5.vote, -60);
          }
          if (this.blueprint != null &&
            null != var5.blueprint) {
            this.blueprint.reportDifferences(var5.blueprint, -68);
          }
          var4 = 0;
          if (this.ordertype != var5.ordertype) {
            System.out.println("int ordertype has changed. before=" + var5.ordertype + ", now=" + this.ordertype);
            var4 = 1;
          }
          stackIn_19_0 = (null != var5.settingsChange) ? 0 : 1;
          if (null != this.settingsChange) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = 1;
          }
          if ((stackIn_19_0 ^ stackIn_22_1) != 0 ||
            this.settingsChange != null &&
            this.settingsChange.a((byte) -80, var5.settingsChange)) {
            var4 = 1;
            System.out.println("SettingsChange settings_change has changed. before=" + var5.settingsChange + ", now=" + this.settingsChange);
          }
          if (obfuscationGuard >= -19) {
            this.ordertype = 9;
          }
          stackIn_32_0 = (null != this.spawnchoice) ? 0 : 1;
          if (var5.spawnchoice != null) {
            stackIn_35_1 = 0;
          } else {
            stackIn_35_1 = 1;
          }
          if ((stackIn_32_0 ^ stackIn_35_1) != 0 ||
            this.spawnchoice != null &&
            this.spawnchoice.a((byte) -64, var5.spawnchoice)) {
            var4 = 1;
            System.out.println("SpawnChoice spawnchoice has changed. before=" + var5.spawnchoice + ", now=" + this.spawnchoice);
          }
          stackIn_43_0 = (var5.vote != null) ? 0 : 1;
          if (null != this.vote) {
            stackIn_46_1 = 0;
          } else {
            stackIn_46_1 = 1;
          }
          if ((stackIn_43_0 ^ stackIn_46_1) != 0 ||
            this.vote != null &&
            this.vote.a((byte) -42, var5.vote)) {
            var4 = 1;
            System.out.println("PlayerVote vote has changed. before=" + var5.vote + ", now=" + this.vote);
          }
          stackIn_54_0 = (var5.blueprint != null) ? 0 : 1;
          if (this.blueprint != null) {
            stackIn_57_1 = 0;
          } else {
            stackIn_57_1 = 1;
          }
          if ((stackIn_54_0 ^ stackIn_57_1) != 0 ||
            null != this.blueprint &&
            this.blueprint.a((byte) -40, var5.blueprint)) {
            System.out.println("ShipBlueprint blueprint has changed. before=" + var5.blueprint + ", now=" + this.blueprint);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SpecialOrderSubmessage has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_67_0 = var3;
          stackIn_67_1 = new StringBuilder().append("tw.F(");
          if (other == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(fm[] param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        fm var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          var2_int = param0.length;
          if (param1 != 62) {
            SpecialOrderSubmessage.a(-111);
          }
          for (var3 = 1; var2_int > var3; var3++) {
            var4 = param0[var3];
            for (var5 = var3 - 1; var5 >= 0; var5--) {
              if (uk.a(param1 ^ -27562, param0[var5], var4)) {
                param0[1 + var5] = param0[var5];
                continue;
              }
              break;
            }
            param0[var5 + 1] = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("tw.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        fm[] var5 = null;
        SpecialOrderSubmessage var6 = null;
        var4 = VoidHunters.field_G;
        try {
          var6 = (SpecialOrderSubmessage) (param1);
          var6.ordertype = this.ordertype;
          if (null == this.settingsChange) {
            var6.settingsChange = null;
          } else {
            if (null == var6.settingsChange) {
              var6.settingsChange = new SettingsChange();
            }
            this.settingsChange.b((byte) 64, var6.settingsChange);
          }
          if (null != this.spawnchoice) {
            if (null == var6.spawnchoice) {
              var6.spawnchoice = new SpawnChoice();
            }
            this.spawnchoice.b((byte) 111, var6.spawnchoice);
          } else {
            var6.spawnchoice = null;
          }
          if (param0 <= 54) {
            var5 = (fm[]) null;
            SpecialOrderSubmessage.a((fm[]) null, (byte) -120);
          }
          if (this.vote != null) {
            if (null == var6.vote) {
              var6.vote = new PlayerVote();
            }
            this.vote.b((byte) 88, var6.vote);
          } else {
            var6.vote = null;
          }
          if (this.blueprint == null) {
            var6.blueprint = null;
            return;
          }
          if (var6.blueprint == null) {
            var6.blueprint = new ShipBlueprint();
          }
          this.blueprint.b((byte) 86, var6.blueprint);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("tw.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public SpecialOrderSubmessage() {
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = -65 % ((-23 - param0) / 51);
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        boolean stackIn_43_0 = false;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        SpecialOrderSubmessage var4 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = 114 / ((22 - param0) / 59);
          var4 = (SpecialOrderSubmessage) (param1);
          if (this.ordertype == var4.ordertype) {
            stackIn_4_0 = (null != var4.settingsChange) ? 0 : 1;
            if (null != this.settingsChange) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (this.settingsChange == null ||
              !this.settingsChange.a((byte) 123, var4.settingsChange))) {
              stackIn_14_0 = (this.spawnchoice != null) ? 0 : 1;
              if (null != var4.spawnchoice) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = 1;
              }
              if ((stackIn_14_0 ^ stackIn_17_1) == 0 && (this.spawnchoice == null ||
                !this.spawnchoice.a((byte) -38, var4.spawnchoice))) {
                stackIn_24_0 = (var4.vote != null) ? 0 : 1;
                if (this.vote != null) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                if ((stackIn_24_0 ^ stackIn_27_1) == 0 && (this.vote == null ||
                  !this.vote.a((byte) 110, var4.vote))) {
                  stackIn_34_0 = (this.blueprint != null) ? 0 : 1;
                  if (null != var4.blueprint) {
                    stackIn_37_1 = 0;
                  } else {
                    stackIn_37_1 = 1;
                  }
                  if ((stackIn_34_0 ^ stackIn_37_1) == 0 && (this.blueprint == null ||
                    !this.blueprint.a((byte) -118, var4.blueprint))) {
                    stackIn_43_0 = false;
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_43_0 = true;
          }
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_46_0 = var3;
          stackIn_46_1 = new StringBuilder().append("tw.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.a(-632, this.ordertype, 32);
          if (param1 >= -109) {
            return;
          }
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = 66;
          stackIn_5_2 = (null != this.settingsChange);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.settingsChange.b(param0, -110);
          }
          stackIn_10_0 = (faa) (param0);
          stackIn_10_1 = 80;
          stackIn_11_2 = (this.spawnchoice != null);
          if (vq.a(stackIn_10_0, stackIn_10_1, stackIn_11_2)) {
            this.spawnchoice.b(param0, -125);
          }
          stackIn_15_0 = (faa) (param0);
          stackIn_15_1 = 117;
          stackIn_16_2 = (this.vote != null);
          if (vq.a(stackIn_15_0, stackIn_15_1, stackIn_16_2)) {
            this.vote.b(param0, -126);
          }
          stackIn_20_0 = (faa) (param0);
          stackIn_20_1 = 122;
          stackIn_21_2 = (null != this.blueprint);
          if (!vq.a(stackIn_20_0, stackIn_20_1, stackIn_21_2)) {
            return;
          }
          this.blueprint.b(param0, -113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("tw.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    SpecialOrderSubmessage(int param0) {
        this.ordertype = param0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          this.ordertype = param0.i(0, 32);
          if (kv.a(param1, param0)) {
            if (null == this.settingsChange) {
              this.settingsChange = new SettingsChange();
            }
            this.settingsChange.a(param0, false);
          } else {
            this.settingsChange = null;
          }
          if (!kv.a(false, param0)) {
            this.spawnchoice = null;
          } else {
            if (null == this.spawnchoice) {
              this.spawnchoice = new SpawnChoice();
            }
            this.spawnchoice.a(param0, false);
          }
          if (!kv.a(false, param0)) {
            this.vote = null;
          } else {
            if (this.vote != null) {
              this.vote.a(param0, false);
            } else {
              this.vote = new PlayerVote();
              this.vote.a(param0, false);
            }
          }
          if (!kv.a(param1, param0)) {
            this.blueprint = null;
            return;
          }
          if (null == this.blueprint) {
            this.blueprint = new ShipBlueprint();
          }
          this.blueprint.a(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("tw.H(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
