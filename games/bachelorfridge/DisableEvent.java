/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisableEvent extends SpecialEvent {
    static int field_s;
    static String field_r;
    private CreatureRef field_q;

    final static void a(int param0, int param1, byte param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = BachelorFridge.field_y;
        try {
          if (0 <= param0 &&
            param4 < TriangleRasterizer.field_n) {
            if (param1 < 0 &&
              param7 < 0 &&
              param8 < 0) {
              return;
            }
            if (param1 >= TriangleRasterizer.field_o &&
              TriangleRasterizer.field_o <= param7 &&
              TriangleRasterizer.field_o <= param8) {
              return;
            }
            if (param2 >= -72) {
              field_r = (String) null;
            }
            var14 = -param4 + param0;
            if (param4 == param5) {
              if (param4 == param0) {
                var11 = 0;
                var10 = param7 << 16;
                var9_int = param1 << 16;
                var12 = 0;
              } else {
                var15 = -param5 + param0;
                if (param1 < param7) {
                  var9_int = param1 << 16;
                  var10 = param7 << 16;
                  var11 = (param8 - param1 << 16) / var14;
                  var12 = (-param7 + param8 << 16) / var15;
                } else {
                  var12 = (-param1 + param8 << 16) / var14;
                  var11 = (-param7 + param8 << 16) / var15;
                  var9_int = param7 << 16;
                  var10 = param1 << 16;
                }
              }
              var13 = 0;
              if (param4 < 0) {
                param4 = Math.min(-param4, -param4 + param5);
                var9_int = var9_int + param4 * var11;
                var10 = var10 + param4 * var12;
                param4 = 0;
              }
            } else {
              var10 = param1 << 16;
              var9_int = param1 << 16;
              var15 = param5 - param4;
              var11 = (param7 - param1 << 16) / var15;
              var12 = (param8 - param1 << 16) / var14;
              if (var11 >= var12) {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param4 < 0) {
                if (0 > param5) {
                  param4 = param5 - param4;
                  var9_int = var9_int + param4 * var11;
                  var10 = var10 + var12 * param4;
                  param4 = param5;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param4 = -param4;
                  var9_int = var9_int + param4 * var11;
                  var10 = var10 + var12 * param4;
                  param4 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = TriangleRasterizer.field_a[param4];
                while (param5 > param4) {
                  var17 = var9_int >> 16;
                  if (TriangleRasterizer.field_o > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (0 != var18) {
                      if (var17 + var18 >= TriangleRasterizer.field_o) {
                        var18 = -var17 + (TriangleRasterizer.field_o - 1);
                      }
                      if (var17 >= 0) {
                        DamagePopupAnimation.a(var18, param3, param6, (byte) 109, var17 + var16Lifetime2);
                      } else {
                        DamagePopupAnimation.a(var17 + var18, param3, param6, (byte) 127, var16Lifetime2);
                      }
                    } else {
                      if (var17 >= 0 &&
                        TriangleRasterizer.field_o > var17) {
                        DamagePopupAnimation.a(var18, param3, param6, (byte) -127, var17 + var16Lifetime2);
                      }
                    }
                  }
                  param4++;
                  if (param4 >= TriangleRasterizer.field_n) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + SoftwareRasterizer.field_i;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param5 + param0;
              if (0 == var16Lifetime3) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 != 0) {
                  var10 = param7 << 16;
                } else {
                  var9_int = param7 << 16;
                }
                var17Lifetime2 = param8 << 16;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param4 < 0) {
              param4 = -param4;
              var10 = var10 + param4 * var12;
              var9_int = var9_int + param4 * var11;
              param4 = 0;
            }
            var15Lifetime1 = TriangleRasterizer.field_a[param4];
            while (param0 > param4) {
              var16Lifetime1 = var9_int >> 16;
              if (TriangleRasterizer.field_o > var16Lifetime1) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 != 0) {
                  if (TriangleRasterizer.field_o <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = -1 + (-var16Lifetime1 + TriangleRasterizer.field_o);
                  }
                  if (var16Lifetime1 < 0) {
                    DamagePopupAnimation.a(var16Lifetime1 + var17Lifetime1, param3, param6, (byte) -128, var15Lifetime1);
                  } else {
                    DamagePopupAnimation.a(var17Lifetime1, param3, param6, (byte) 10, var16Lifetime1 + var15Lifetime1);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    TriangleRasterizer.field_o > var16Lifetime1) {
                    DamagePopupAnimation.a(var17Lifetime1, param3, param6, (byte) -127, var15Lifetime1 + var16Lifetime1);
                  }
                }
              }
              param4++;
              if (param4 >= TriangleRasterizer.field_n) {
                return;
              }
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + SoftwareRasterizer.field_i;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_77_0 = var9;
          stackIn_77_1 = new StringBuilder().append("lca.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final AnimationNode createAnimation(int param0, BattleScreen param1) {
        RuntimeException var3 = null;
        BattleScreen var4 = null;
        DisableAnimation stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (BattleScreen) null;
            this.createAnimation(-68, (BattleScreen) null);
          }
          stackIn_3_0 = new DisableAnimation(param1, this);
          return (AnimationNode) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lca.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(BattleState param0, int param1) {
        try {
          this.a(param0, (byte) -2);
          int var3_int = 78 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lca.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        try {
          if (param0 >= -12) {
            PacketBuffer var4 = (PacketBuffer) null;
            this.a((byte) 127, (PacketBuffer) null);
          }
          super.a((byte) -16, param1);
          FlirtAnimation.a(this.field_q, 107, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lca.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    DisableEvent(int param0, CreatureRef param1, CreatureRef param2) {
        super(param0, param1);
        try {
          this.field_q = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 > -84) {
          field_s = 4;
        }
        field_r = null;
    }

    DisableEvent(PacketBuffer param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.moveId = param0.readUnsignedShort((byte) 111);
          this.effects = new IntrusiveDeque();
          var2_int = param0.readUnsignedByte(16711935);
          while (true) {
            var2_int--;
            if (0 > var2_int) {
              break;
            }
            this.effects.a(TBomberAnimation.a((byte) 102, param0), true);
          }
          this.field_q = qi.a(param0, (byte) 41);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lca.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean c(boolean param0) {
        kha var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          if (param0) {
            DisableEvent.d((byte) 75);
          }
          var1 = (kha) (iea.field_d.b((byte) 90));
          while (true) {
            if (var1 == null) {
              return true;
            }
            if (mg.field_m.field_f[var1.field_h] + var1.field_g <= 255) {
              var1 = (kha) (iea.field_d.c(0));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var1_ref), "lca.C(" + param0 + ')');
        }
    }

    static {
        field_s = 0;
        field_r = "<%0> has entered a game.";
    }
}
