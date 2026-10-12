/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OwnerChangeEvent extends GameEvent {
    private int newOwnerPlayer;
    static je field_E;
    private boolean field_z;
    private boolean applied;
    static boolean field_B;
    static String field_y;

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        GameplayController var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -84) {
            var5 = (GameplayController) null;
            this.a((NodeDeque) null, (byte) -44, (GameplayController) null);
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("as.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        ta.field_N = 0;
        kd.field_R = null;
        jj.field_g = null;
        int var2 = LeaderEscortCondition.field_i;
        LeaderEscortCondition.field_i = er.field_a;
        ai.field_T.errorCount = ai.field_T.errorCount + 1;
        if (param1 != 101) {
          OwnerChangeEvent.a(-88, (byte) -45);
          if (param0 == 51) {
            ai.field_T.errorCode = 2;
            er.field_a = var2;
            if (2 > ai.field_T.errorCount) {
              if (2 <= ai.field_T.errorCount &&
                param0 == 50) {
                return 5;
              }
              if (ai.field_T.errorCount < 4) {
                return -1;
              }
              return 1;
            }
            if (51 == param0) {
              return 2;
            }
            if (2 > ai.field_T.errorCount) {
              if (ai.field_T.errorCount < 4) {
                return -1;
              }
              return 1;
            }
            if (param0 == 50) {
              return 5;
            }
            if (ai.field_T.errorCount < 4) {
              return -1;
            }
            return 1;
          }
          if (param0 != 50) {
            ai.field_T.errorCode = 1;
            er.field_a = var2;
            if (2 > ai.field_T.errorCount) {
              if (2 <= ai.field_T.errorCount &&
                param0 == 50) {
                return 5;
              }
              if (ai.field_T.errorCount < 4) {
                return -1;
              }
              return 1;
            }
            if (51 == param0) {
              return 2;
            }
            if (2 > ai.field_T.errorCount) {
              if (ai.field_T.errorCount < 4) {
                return -1;
              }
              return 1;
            }
            if (param0 == 50) {
              return 5;
            }
            if (ai.field_T.errorCount < 4) {
              return -1;
            }
            return 1;
          }
          ai.field_T.errorCode = 5;
          er.field_a = var2;
          if (2 > ai.field_T.errorCount) {
            if (2 <= ai.field_T.errorCount &&
              param0 == 50) {
              return 5;
            }
            if (ai.field_T.errorCount >= 4) {
              return 1;
            }
            return -1;
          }
          if (51 == param0) {
            return 2;
          }
          if (2 > ai.field_T.errorCount) {
            if (ai.field_T.errorCount >= 4) {
              return 1;
            }
            return -1;
          }
          if (param0 == 50) {
            return 5;
          }
          if (ai.field_T.errorCount >= 4) {
            return 1;
          }
          return -1;
        }
        if (param0 == 51) {
          ai.field_T.errorCode = 2;
          er.field_a = var2;
          if (2 <= ai.field_T.errorCount) {
            if (51 != param0) {
              if (2 > ai.field_T.errorCount) {
                if (ai.field_T.errorCount >= 4) {
                  return 1;
                }
                return -1;
              }
              if (param0 != 50) {
                if (ai.field_T.errorCount >= 4) {
                  return 1;
                }
                return -1;
              }
              return 5;
            }
            return 2;
          }
          if (2 <= ai.field_T.errorCount &&
            param0 == 50) {
            return 5;
          }
          if (ai.field_T.errorCount >= 4) {
            return 1;
          }
          return -1;
        }
        if (param0 != 50) {
          ai.field_T.errorCode = 1;
          er.field_a = var2;
          if (2 <= ai.field_T.errorCount) {
            if (51 != param0) {
              if (2 <= ai.field_T.errorCount &&
                param0 == 50) {
                return 5;
              }
              if (ai.field_T.errorCount >= 4) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          if (2 <= ai.field_T.errorCount &&
            param0 == 50) {
            return 5;
          }
          if (ai.field_T.errorCount >= 4) {
            return 1;
          }
          return -1;
        }
        ai.field_T.errorCode = 5;
        er.field_a = var2;
        if (2 <= ai.field_T.errorCount) {
          if (51 != param0) {
            if (2 <= ai.field_T.errorCount &&
              param0 == 50) {
              return 5;
            }
            if (ai.field_T.errorCount >= 4) {
              return 1;
            }
            return -1;
          }
          return 2;
        }
        if (2 <= ai.field_T.errorCount &&
          param0 == 50) {
          return 5;
        }
        if (ai.field_T.errorCount >= 4) {
          return 1;
        }
        return -1;
    }

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ev.field_a = ev.field_a + 1;
          if (me.field_e == -1 &&
            of.field_Ib == -1) {
            of.field_Ib = ko.field_b;
            me.field_e = AiPlanningStrategy.field_d;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (ts.field_a == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(ts.field_a));
          }
          if (decompiledFrameRemainder0) {
            if (!BoundedFile.field_b) {
              if (NodeIterator.field_c <= ev.field_a) {
                stackIn_17_0 = (NodeIterator.field_c + ps.field_E > ev.field_a) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              ev.field_a = 0;
            } else {
              if (BoundedFile.field_b) {
                ev.field_a = NodeIterator.field_c;
              } else {
                if (var2_int != 0) {
                  ev.field_a = NodeIterator.field_c;
                } else {
                  ev.field_a = 0;
                }
              }
            }
            cc.field_b = of.field_Ib;
            if (param1 != null) {
              BoundedFile.field_b = false;
            } else {
              if (var2_int != 0) {
                BoundedFile.field_b = true;
              }
            }
            lq.field_e = me.field_e;
          }
          if (!BoundedFile.field_b &&
            ev.field_a < NodeIterator.field_c &&
            lk.field_f) {
            cc.field_b = of.field_Ib;
            lq.field_e = me.field_e;
            ev.field_a = 0;
          }
          ts.field_a = param1;
          me.field_e = param0;
          of.field_Ib = -1;
          if (BoundedFile.field_b &&
            ce.field_J == ev.field_a) {
            BoundedFile.field_b = false;
            ev.field_a = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("as.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    OwnerChangeEvent(Unit param0, int param1, boolean param2) {
        try {
          this.field_z = param2 ? true : false;
          this.applied = false;
          this.newOwnerPlayer = param1;
          this.eventKind = 23;
          this.unit = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "as.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        String var3 = null;
        int var4 = 0;
        String var3Lifetime1;
        int var4Lifetime1;
        if (!verbose) {
          var3 = "EventSwitch: pos: (" + this.unit.tileX + "," + this.unit.tileY + ")";
          var4 = 1 / ((53 - obfuscationGuard) / 51);
          return var3;
        }
        System.out.println("Death event debug");
        System.out.println("Unit at " + this.unit.tileX + "," + this.unit.tileY);
        var3Lifetime1 = "EventSwitch: pos: (" + this.unit.tileX + "," + this.unit.tileY + ")";
        var4Lifetime1 = 1 / ((53 - obfuscationGuard) / 51);
        return var3Lifetime1;
    }

    public static void g(int param0) {
        field_E = null;
        if (param0 != -19269) {
          return;
        }
        field_y = null;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        RuntimeException var3 = null;
        Battlefield var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.applied) {
            return;
          }
          this.applied = true;
          this.unit = this.unit.replaceWithOwner(this.newOwnerPlayer, -1);
          if (null != this.unit &&
            this.unit.isJadeVine((byte) 123)) {
            stackIn_7_0 = (battlefield.localPlayer == this.unit.ownerPlayer);
            if (stackIn_7_0 & this.field_z) {
              battlefield.pendingEvents.addFirst(obfuscationGuard + 27411, new UpkeepEvent(this.unit.tileX, this.unit.tileY));
            }
          }
          if (obfuscationGuard == -26661) {
            return;
          }
          var4 = (Battlefield) null;
          this.applyToBattlefield((Battlefield) null, 25);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("as.G(");
          if (battlefield == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_y = "Damage taken";
    }
}
