/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class UiContainer extends UiComponent implements UiContainerMarker {
    IntrusiveDeque children;
    static String field_u;

    boolean hasFocus(byte param0) {
        if (param0 != -120) {
          UiComponent var3 = (UiComponent) null;
          this.focusPreviousChild((UiComponent) null, -32);
        }
        return null != this.getFocusedChild((byte) -123) ? true : false;
    }

    final boolean focusNextChild(boolean param0, UiComponent param1) {
        IntrusiveDequeIterator var3 = null;
        RuntimeException var3_ref = null;
        UiComponent var4 = null;
        IntrusiveDequeIterator var5 = null;
        UiComponent var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (!param0) {
            UiContainer.clearSharedReferences(false);
          }
          if (this.children.isEmpty(115)) {
            return false;
          }
          var3 = new IntrusiveDequeIterator(this.children);
          var4 = (UiComponent) (var3.first(570));
          while (var4 != null) {
            if (var4.hasFocus((byte) -120)) {
              var5 = new IntrusiveDequeIterator(this.children);
              var5.startForward(var4, -28791);
              var6 = (UiComponent) (var5.next(19072));
              while (var6 != null) {
                if (var6.requestFocus(0, param1)) {
                  return true;
                }
                var6 = (UiComponent) (var5.next(19072));
              }
            }
            var4 = (UiComponent) (var3.next(19072));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("dqa.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = VoidHunters.field_G;
        if (param1 == 0 &&
          null != this.renderer) {
          this.renderer.drawComponent(13, (UiComponent) (this), param0, param3, true);
        }
        IntrusiveDequeIterator var5 = new IntrusiveDequeIterator(this.children);
        if (param2 < 47) {
          return;
        }
        UiComponent var6 = (UiComponent) (var5.last((byte) 105));
        while (var6 != null) {
          var6.drawLayer(param0 + this.x, param1, 112, param3 + this.y);
          var6 = (UiComponent) (var5.previous((byte) 108));
        }
    }

    final void handleMouseRelease(byte param0, int param1, int param2, int param3, UiComponent param4, int param5) {
        RuntimeException runtimeException = null;
        IntrusiveDequeIterator var7 = null;
        int var8 = 0;
        UiComponent var9 = null;
        int var10 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          var8 = -69 % ((param0 - 52) / 52);
          var7 = new IntrusiveDequeIterator(this.children);
          var9 = (UiComponent) (var7.first(570));
          while (var9 != null) {
            if (var9.isLinked((byte) -63)) {
              var9.handleMouseRelease((byte) -109, param1 + this.x, param2, this.y + param3, param4, param5);
              var9 = (UiComponent) (var7.next(19072));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("dqa.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(')').toString());
        }
    }

    void clearFocus(byte param0) {
        int var4 = VoidHunters.field_G;
        IntrusiveDequeIterator var2 = new IntrusiveDequeIterator(this.children);
        UiComponent var3 = (UiComponent) (var2.first(570));
        while (var3 != null) {
          var3.clearFocus((byte) -34);
          var3 = (UiComponent) (var2.next(param0 ^ -19106));
        }
        if (param0 != -34) {
          field_u = (String) null;
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_u = null;
        if (param0) {
          field_u = (String) null;
        }
    }

    boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException var8 = null;
        UiComponent var9 = null;
        int var10 = 0;
        IntrusiveDequeIterator var11 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          var11 = new IntrusiveDequeIterator(this.children);
          var9 = (UiComponent) (var11.first(570));
          while (var9 != null) {
            if (var9.isLinked((byte) -63)) {
              if (var9.handleMousePress(param0, param1 + this.x, param2, param3, param4, param5 + this.y, (byte) -61)) {
                return true;
              }
              var9 = (UiComponent) (var11.next(19072));
              continue;
            }
            break;
          }
          if (param6 <= -17) {
            return false;
          }
          this.getTooltip((byte) -101);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("dqa.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int getMaxDrawLayer(int param0) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = param0;
        IntrusiveDequeIterator var3 = new IntrusiveDequeIterator(this.children);
        UiComponent var4 = (UiComponent) (var3.first(570));
        while (var4 != null) {
          var5 = var4.getMaxDrawLayer(param0 ^ 0);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (UiComponent) (var3.next(19072));
        }
        return var2;
    }

    UiContainer(int param0, int param1, int param2, int param3, UiRenderer param4) {
        super(param0, param1, param2, param3, param4, (UiListener) null);
        this.children = new IntrusiveDeque();
    }

    void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.refreshChildLayouts((byte) 13);
    }

    String getTooltip(byte param0) {
        String var4 = null;
        int var5 = VoidHunters.field_G;
        IntrusiveDequeIterator var2 = new IntrusiveDequeIterator(this.children);
        UiComponent var3 = (UiComponent) (var2.first(570));
        while (var3 != null) {
          var4 = var3.getTooltip((byte) 125);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiComponent) (var2.next(19072));
        }
        if (param0 == 125) {
          return null;
        }
        this.children = (IntrusiveDeque) null;
        return null;
    }

    final static void a(int param0, boolean param1, boolean param2, oib param3, int param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          nfa.field_e[0] = jeb.field_b.nextInt();
          nfa.field_e[1] = jeb.field_b.nextInt();
          nfa.field_e[2] = (int)(SetMissileLauncherRandomness.field_p >> 32);
          SetTorpedoAcceleration.field_p.position = 0;
          nfa.field_e[3] = (int)SetMissileLauncherRandomness.field_p;
          SetTorpedoAcceleration.field_p.writeInt(nfa.field_e[0], 332614536);
          SetTorpedoAcceleration.field_p.writeInt(nfa.field_e[1], 332614536);
          SetTorpedoAcceleration.field_p.writeInt(nfa.field_e[2], 332614536);
          SetTorpedoAcceleration.field_p.writeInt(nfa.field_e[3], 332614536);
          GetMissilesTopSpeed.a((byte) -91, SetTorpedoAcceleration.field_p);
          SetTorpedoAcceleration.field_p.writeShort(param4, true);
          param3.a(SetTorpedoAcceleration.field_p, -26216);
          RequestNewestBlackboxRecording.field_p.position = 0;
          if (!param2) {
            RequestNewestBlackboxRecording.field_p.writeByte(0, 16);
          } else {
            RequestNewestBlackboxRecording.field_p.writeByte(0, 18);
          }
          RequestNewestBlackboxRecording.field_p.position = RequestNewestBlackboxRecording.field_p.position + 2;
          var5_int = RequestNewestBlackboxRecording.field_p.position;
          RequestNewestBlackboxRecording.field_p.writeInt(fk.field_c, 332614536);
          RequestNewestBlackboxRecording.field_p.writeLong(GetDebrisSurvives.field_o, 90);
          var6 = 0;
          if (GetRespawnTime.field_o) {
            var6 = var6 | 1;
          }
          if (GetBombletSprayReload.field_q) {
            var6 = var6 | 4;
          }
          if (param1) {
            var6 = var6 | 8;
          }
          if (GetFighterBayAimspeed.field_o != null) {
            var6 = var6 | 16;
          }
          RequestNewestBlackboxRecording.field_p.writeByte(0, var6);
          var7 = GetMassDriverRandomness.a(-6465, MissionList.b((byte) -121));
          if (var7 == null) {
            var7 = "";
          }
          if (param0 >= -64) {
            field_u = (String) null;
          }
          RequestNewestBlackboxRecording.field_p.writeString(true, var7);
          if (GetFighterBayAimspeed.field_o != null) {
            RequestNewestBlackboxRecording.field_p.writeCircumfixedString((byte) 0, GetFighterBayAimspeed.field_o);
          }
          GetOndamageParticleLife.a(RequestNewestBlackboxRecording.field_p, (byte) -126, SetSalvoDamageMultiplier.field_p, UnsupportedGpuMaterialEffect.field_g, SetTorpedoAcceleration.field_p);
          RequestNewestBlackboxRecording.field_p.writeLengthShort(RequestNewestBlackboxRecording.field_p.position - var5_int, -125);
          lnb.b(-1, 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("dqa.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(')').toString());
        }
    }

    final void addChild(int param0, UiComponent param1) {
        try {
          this.children.addLast(-10258, param1);
          if (param0 != -18756) {
            this.children = (IntrusiveDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dqa.PA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void appendChildDebugTrees(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        IntrusiveDequeIterator var5 = null;
        UiComponent var6 = null;
        int var8 = 0;
        UiComponent var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = VoidHunters.field_G;
        try {
          var5 = new IntrusiveDequeIterator(this.children);
          var6 = (UiComponent) (var5.first(570));
          while (var6 != null) {
            discarded$2 = param2.append('\n');
            for (var7 = 0; param3 >= var7; var7++) {
              discarded$3 = param2.append(' ');
            }
            var6.appendDebugTree(false, param0, 1 + param3, param2);
            var6 = (UiComponent) (var5.next(19072));
          }
          if (param1 >= -8) {
            var9 = (UiComponent) null;
            this.focusNextChild(false, (UiComponent) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("dqa.SA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean requestFocus(int param0, UiComponent param1) {
        IntrusiveDequeIterator var3 = null;
        RuntimeException var3_ref = null;
        UiComponent var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (param0 != 0) {
            return true;
          }
          var3 = new IntrusiveDequeIterator(this.children);
          var4 = (UiComponent) (var3.first(570));
          while (var4 != null) {
            if (var4.requestFocus(param0 ^ 0, param1)) {
              return true;
            }
            var4 = (UiComponent) (var3.next(param0 + 19072));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("dqa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        UiComponent var6_ref_shb = null;
        int var6 = 0;
        int var7 = 0;
        IntrusiveDequeIterator var8 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          var8 = new IntrusiveDequeIterator(this.children);
          var6_ref_shb = (UiComponent) (var8.first(570));
          while (var6_ref_shb != null) {
            if (var6_ref_shb.isLinked((byte) -63)) {
              if (var6_ref_shb.hasFocus((byte) -120) &&
                var6_ref_shb.handleKey(param0 ^ 0, param1, param2, param3)) {
                return true;
              }
              var6_ref_shb = (UiComponent) (var8.next(param0 + 34906));
              continue;
            }
            break;
          }
          if (param0 != -15834) {
            this.children = (IntrusiveDeque) null;
          }
          var6 = param1;
          if (var6 != 80) {
            return false;
          }
          if (!SetMachineGunEnergyUsed.field_o[81]) {
            stackIn_17_0 = this.focusNextChild(true, param2);
          } else {
            stackIn_17_0 = this.focusPreviousChild(param2, 0);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("dqa.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void refreshChildLayouts(byte param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != 13) {
          return;
        }
        IntrusiveDequeIterator var2 = new IntrusiveDequeIterator(this.children);
        UiComponent var3 = (UiComponent) (var2.first(570));
        while (var3 != null) {
          var3.refreshLayout(false);
          var3 = (UiComponent) (var2.next(param0 + 19059));
        }
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        UiComponent var6 = null;
        int var7 = 0;
        UiComponent var8 = null;
        IntrusiveDequeIterator var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = VoidHunters.field_G;
        try {
          super.updatePointer(param0, param1, param2 + 0, param3);
          var9 = new IntrusiveDequeIterator(this.children);
          var6 = (UiComponent) (var9.first(param2 + 1551));
          while (var6 != null) {
            if (var6.isLinked((byte) -63)) {
              var6.updatePointer(this.y + param0, param1 + this.x, -981, param3);
              var6 = (UiComponent) (var9.next(19072));
              continue;
            }
            break;
          }
          if (param2 != -981) {
            var8 = (UiComponent) null;
            this.handleMouseWheel(-120, 53, 71, (UiComponent) null, 57, 10, 54);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("dqa.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final StringBuilder appendDebugTree(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugVisit(param1, param2, (byte) 123, param3)) {
            this.appendDebugProperties(90, param2, param1, param3);
            this.appendChildDebugTrees(param1, (byte) -89, param3, param2);
          }
          if (param0) {
            this.hasFocus((byte) -25);
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("dqa.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean handleMouseWheel(int param0, int param1, int param2, UiComponent param3, int param4, int param5, int param6) {
        IntrusiveDequeIterator var8 = null;
        RuntimeException var8_ref = null;
        UiComponent var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          if (param1 != -6006) {
            return true;
          }
          var8 = new IntrusiveDequeIterator(this.children);
          var9 = (UiComponent) (var8.first(570));
          while (var9 != null) {
            if (var9.isLinked((byte) -63)) {
              if (var9.hasFocus((byte) -120) &&
                var9.handleMouseWheel(param0, -6006, param2, param3, param4, param5, param6)) {
                return true;
              }
              var9 = (UiComponent) (var8.next(19072));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("dqa.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    UiComponent getFocusedChild(byte param0) {
        IntrusiveDequeIterator var2;
        UiComponent var3;
        int var4;
        UiComponent var5;
        var4 = VoidHunters.field_G;
        if (param0 > -3) {
          var5 = (UiComponent) null;
          this.handleMousePress(5, -105, 25, 32, (UiComponent) null, 72, (byte) 42);
        }
        var2 = new IntrusiveDequeIterator(this.children);
        var3 = (UiComponent) (var2.first(570));
        while (var3 != null) {
          if (var3.hasFocus((byte) -120)) {
            return var3;
          }
          var3 = (UiComponent) (var2.next(19072));
        }
        return null;
    }

    final boolean focusPreviousChild(UiComponent param0, int param1) {
        IntrusiveDequeIterator var3 = null;
        RuntimeException var3_ref = null;
        UiComponent var4 = null;
        IntrusiveDequeIterator var5 = null;
        UiComponent var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 != 0) {
            return false;
          }
          if (this.children.isEmpty(param1 ^ 113)) {
            return false;
          }
          var3 = new IntrusiveDequeIterator(this.children);
          var4 = (UiComponent) (var3.last((byte) 70));
          while (var4 != null) {
            if (var4.hasFocus((byte) -120)) {
              var5 = new IntrusiveDequeIterator(this.children);
              var5.startBackward((byte) 88, var4);
              var6 = (UiComponent) (var5.previous((byte) 108));
              while (var6 != null) {
                if (!var6.requestFocus(0, param0)) {
                  var6 = (UiComponent) (var5.previous((byte) 108));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiComponent) (var3.previous((byte) 108));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("dqa.OA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_u = "Play the game without logging in just yet";
    }
}
