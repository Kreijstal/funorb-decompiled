/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetThrusterBindingBalanceThreshold extends ConsoleCommand {
    static String field_o;
    static llb field_p;

    final static String a(int param0) {
        String stackIn_56_0 = null;
        Object stackIn_94_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          if (param0 != -8037) {
            GetThrusterBindingBalanceThreshold.e((byte) -1);
          }
          var1 = null;
          var2 = null;
          if (ow.field_b == 0 &&
            null != SetThrusterParticleSpeedDownshift.field_o) {
            var2 = GetRepairModePower.field_p;
          }
          if (ow.field_b == 2 &&
            !SetAutozoomAmountMultiply.a(0)) {
            if (GetTorqueDownshift.a(GetDebrisThrowable.field_o, (byte) -47)) {
              var2 = SetReverbGain.a(BodyCondition.field_d, new String[]{waa.field_x}, 78);
              if (var10 != 0) {
                var2 = SetReverbGain.a(fab.field_b, new String[]{waa.field_x}, 114);
              }
            } else {
              var2 = SetReverbGain.a(fab.field_b, new String[]{waa.field_x}, 114);
            }
            if (uga.field_d) {
              lh.a((byte) -112, 0, (String) null, (String) null, (String) (var2), 2);
              fj.b(param0 ^ -22377);
            }
          }
          if (null == var2 &&
            !GetReverbDamp.field_o &&
            qw.field_l == null) {
            var2 = SetMomentOfInertiaPerpointCalcDownshift.field_o;
          }
          if (var2 != null) {
            SetSelfDestructTimer.a(19204, (String) (var2), 0, (String) null, kmb.field_a);
          } else {
            var3 = kca.field_a;
            var3 = gfb.a(1, var3);
            var4 = "";
            var5 = "|";
            var6 = ow.field_b;
            var7 = 0;
            if (var6 == 2) {
              var4 = SetReverbGain.a(tia.field_G, new String[]{waa.field_x}, 91);
              var8 = SetReverbGain.a(GetLaserAimspeed.field_o, new String[]{var3}, 79);
              var7 = fgb.field_l.field_hb + (bpa.field_c.field_hb - 485 + ej.field_c.b(var8)) - ej.field_c.b(var4);
              if (0 > var7) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (0 == var6) {
                if (null == SetSpinningBladeSpindamageMultiplier.field_o &&
                  VariableCondition.field_e) {
                  var4 = "[" + bib.field_e + "] ";
                }
                if (null != SetSpinningBladeSpindamageMultiplier.field_o) {
                  var6 = 1;
                  boolean decompiledSharedTail0 = (!(nv.field_n) ||
                    vla.field_E == null);
                  if (!decompiledSharedTail0) {
                    var4 = "[" + vla.field_E + "] ";
                    decompiledSharedTail0 = (var10 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var4 = "[" + SetReverbGain.a(wt.field_b, new String[]{SetSpinningBladeSpindamageMultiplier.field_o.field_Vb}, param0 + 8147) + "] ";
                  }
                }
              }
              if (tob.g(0)) {
                stackIn_56_0 = ": ";
              } else {
                stackIn_56_0 = "<img=3>: ";
              }
              var8Lifetime1 = stackIn_56_0;
              var4 = var4 + var3 + var8Lifetime1;
              if (!GetBloomThresholdPercentage.field_p) {
                if (hb.field_c) {
                  var5 = "";
                  var4 = "<col=999999>" + var4 + vq.field_y + "</col>";
                  if (var10 != 0) {
                    var4 = "<col=999999>" + var4 + ocb.field_g + "</col>";
                    var5 = "";
                  }
                }
              } else {
                var4 = "<col=999999>" + var4 + ocb.field_g + "</col>";
                var5 = "";
              }
              var9 = ej.field_c.b(var4);
              if (!tob.g(0)) {
                if (bpa.field_c.field_O &&
                  -bpa.field_c.field_M + kc.field_b < var9) {
                  if (!GetBloomThresholdPercentage.field_p) {
                    var1 = vq.field_y;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (bpa.field_c.field_o != 0 &&
                  var9 > bpa.field_c.field_r &&
                  !GetBloomThresholdPercentage.field_p) {
                  or.a(param0 + 8037);
                }
              }
            }
            SetSelfDestructTimer.a(19204, var4 + no.c(SetShipAimLines.field_p.toString()), var7, var5, ConsoleCommand.field_m[var6]);
            if (!SetFightersPerPlayerMaximum.field_p) {
              fgb.field_l.field_O = false;
            }
            if (fgb.field_l.field_O) {
              var1 = SetReverbGain.a(rc.field_a, new String[]{var3, waa.field_x}, 100);
            }
          }
          stackIn_94_0 = var1;
          return (String) (stackIn_94_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) (var1), "sdb.B(" + param0 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_o = (String) null;
          }
          stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(48, 117));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sdb.A(");
          if (arguments == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetThrusterBindingBalanceThreshold(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        try {
          field_o = null;
          field_p = null;
          int var1_int = -99 % ((-65 - param0) / 39);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sdb.C(" + param0 + ')');
        }
    }

    static {
        field_o = "Scale up map zone";
    }
}
