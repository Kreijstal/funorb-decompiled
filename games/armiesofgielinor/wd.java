/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int field_d;
    static RgbSprite field_k;
    boolean field_a;
    String[] field_c;
    static String field_l;
    static String field_j;
    static int field_b;
    String field_i;
    boolean field_h;
    static String field_g;
    static String field_e;
    static String field_f;

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 200) {
          return;
        }
        try {
          field_e = null;
          field_l = null;
          field_k = null;
          field_j = null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wd.C(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, byte param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        MapTile var7 = null;
        int var8 = 0;
        int var9 = 0;
        TileMetadata var10 = null;
        int var11 = 0;
        try {
          if (param5 >= 0 &&
            param3 >= 0 &&
            param5 < ResourceRequest.field_y &&
            param3 < ef.field_c) {
            var6_int = ResourceRequest.field_y * param3 + param5;
            var7 = vs.field_e[var6_int];
            var8 = RegionAnchor.a(16711680, param3, var6_int, param5);
            if (param2 != -128) {
              return;
            }
            var9 = -(var8 >>> 24 & 2102808831) + 255;
            var8 = var8 & 16777215;
            if (!param0) {
              po.a((byte) 91, param3, param4, param1, var9, var8, var6_int, param5);
              sf.b(param3, param5, param2 + 128, param1, var6_int, param4);
            }
            IntrusiveNode.a(78, param5, param3, param4 + 19, var6_int, param1 + 39);
            cw.a(var6_int, param4 + 19, 39 + param1, -125, param5, param3);
            TickCounter.a(var9, param0, param3, param4, var6_int, param2 ^ -128, param5, param1, var8);
            var10 = var7.metadata;
            if (null != var10 &&
              (var10.modifierFlags & 1) != 0 &&
              -1 < vs.field_e[var6_int].ownerPlayer) {
              var11 = var7.ownerPlayer;
              if (null != CipherPacketBuffer.currentBattlefield) {
                var11 = CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var11, -1);
              }
              UnitCycler.a(param1 + 22, var11, ug.field_b + var6_int, 92, 20 + param4);
            }
            if (var7.hasModifierFlag4((byte) -125)) {
              GameEvent.a(20 + param4, true, var6_int + ug.field_b, var7.ownerPlayer, param1 + 22);
            }
            fs.a(param4, false, param0, var9, param1, var6_int, param5, var8, param3);
            return;
          }
          EquipmentBattleTutorial.a(param3, param5, param1, param4, (byte) -82);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6), "wd.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean isFriendOrderedAfter(boolean obfuscationGuard, SocialListEntry entry, SocialListEntry other) {
        int orderDifference = 0;
        RuntimeException var3 = null;
        int obfuscationControl = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          orderDifference = entry.orderIndex - other.orderIndex;
          if (vl.currentLocationLabel != entry.locationLabel) {
            if (entry.locationLabel == null) {
              orderDifference += 200;
              if (obfuscationControl != 0) {
                orderDifference -= 200;
              }
            }
          } else {
            orderDifference -= 200;
          }
          if (vl.currentLocationLabel != other.locationLabel) {
            if (null == other.locationLabel) {
              orderDifference -= 200;
              if (obfuscationControl != 0) {
                orderDifference += 200;
              }
            }
          } else {
            orderDifference += 200;
          }
          if (!obfuscationGuard) {
            return !(0 >= orderDifference);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("wd.B(").append(obfuscationGuard).append(',');
          if (entry == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (other == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static String a(boolean param0) {
        String stackIn_56_0 = null;
        Object stackIn_96_0 = null;
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
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            wd.a((byte) -13);
          }
          var1 = null;
          var2 = null;
          if (rs.outgoingChatChannel == 0 &&
            no.roomSetup != null) {
            var2 = wc.field_K;
          }
          if (rs.outgoingChatChannel == 2 &&
            !vu.isChatRecipientAvailable(6)) {
            if (!jj.isFriend(62, wm.chatRecipientNameKey)) {
              var2 = fo.a(4800, DiskCacheWorker.field_h, new String[]{qd.chatRecipientName});
              if (var10 != 0) {
                var2 = fo.a(4800, pt.field_gb, new String[]{qd.chatRecipientName});
              }
            } else {
              var2 = fo.a(4800, pt.field_gb, new String[]{qd.chatRecipientName});
            }
            if (BattleTutorial.quickChatMenuVisible) {
              ta.appendSystemChatMessage((String) null, 2, -18119, (String) null, (String) (var2), 0);
              DelayedPacket.e(-3);
            }
          }
          if (null == var2 &&
            !cu.field_c &&
            null == UnitCycler.field_g) {
            var2 = CacheEntry.field_w;
          }
          if (var2 != null) {
            fs.a(MeshObject.field_d, (String) null, (String) (var2), -122, 0);
          } else {
            var3 = mv.localAccountName;
            var3 = nt.a(-121, var3);
            var4 = "";
            var5 = "|";
            var6 = rs.outgoingChatChannel;
            var7 = 0;
            if (var6 == 2) {
              var4 = fo.a(4800, ta.field_Q, new String[]{qd.chatRecipientName});
              var8 = fo.a(4800, ov.field_l, new String[]{var3});
              var7 = rb.field_b.width + UpkeepEvent.field_z.width - 485 - (-IntrusiveNode.field_e.a(var8) + IntrusiveNode.field_e.a(var4));
              if (var7 < 0) {
                var7 = 0;
              }
            } else {
              if (0 == var6) {
                if (null == vu.currentRoom &&
                  bq.field_c) {
                  var4 = "[" + ClientConnectionState.field_c + "] ";
                }
                if (null != vu.currentRoom) {
                  var6 = 1;
                  if (!TextCursor.field_f ||
                    TeleportAction.field_C == null) {
                    var4 = "[" + fo.a(4800, CampaignMenu.field_m, new String[]{vu.currentRoom.ownerName}) + "] ";
                    if (var10 != 0) {
                      var4 = "[" + TeleportAction.field_C + "] ";
                    }
                  } else {
                    var4 = "[" + TeleportAction.field_C + "] ";
                  }
                }
              }
              if (!us.a(true)) {
                stackIn_56_0 = "<img=3>: ";
              } else {
                stackIn_56_0 = ": ";
              }
              var8 = stackIn_56_0;
              var4 = var4 + var3 + var8;
              boolean decompiledSharedTail0 = !(NodeIterator.field_a);
              if (!decompiledSharedTail0) {
                var4 = "<col=999999>" + var4 + dc.field_l + "</col>";
                var5 = "";
                decompiledSharedTail0 = (var10 != 0);
              }
              if ((decompiledSharedTail0) &&
                (vi.field_d)) {
                var5 = "";
                var4 = "<col=999999>" + var4 + ps.field_z + "</col>";
              }
              var9 = IntrusiveNode.field_e.a(var4);
              if (!us.a(true)) {
                if (UpkeepEvent.field_z.heldButtonMatches &&
                  var9 > (-UpkeepEvent.field_z.screenX + AiPlanningStrategy.pointerX)) {
                  if (!NodeIterator.field_a) {
                    var1 = ps.field_z;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (UpkeepEvent.field_z.pressedButton != 0 &&
                  UpkeepEvent.field_z.dragGrabX < var9 &&
                  !NodeIterator.field_a) {
                  ContextActionMenu.openPublicQuickChat(92);
                }
              }
            }
            fs.a(CombatEvent.field_A[var6], var5, var4 + BitmapFont.c(UpkeepEvent.chatTextBuffer.toString()), 33, var7);
            if (!hf.textChatActive) {
              rb.field_b.heldButtonMatches = false;
            }
            if (rb.field_b.heldButtonMatches) {
              var1 = fo.a(4800, MusicPatchPcmStream.field_q, new String[]{var3, qd.chatRecipientName});
            }
          }
          stackIn_96_0 = var1;
          return (String) (stackIn_96_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) (var1), "wd.A(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 19) {
            return false;
          }
          stackIn_10_0 = (10 <= SoundCache.field_b) && (13 <= StrongCacheEntry.field_E);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "wd.D(" + param0 + ')');
        }
    }

    wd(boolean param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wd.<init>(" + param0 + ')');
        }
    }

    static {
        field_j = "Options";
        field_l = "No players";
        field_g = "<%0> has resigned";
        field_f = "Achieved";
        field_e = "<%0>, turn <%1>";
    }
}
