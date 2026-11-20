/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListProtocol {
    static String field_b;
    static String field_a;
    static RasterBuffer field_c;
    static ResourceArchive field_d;
    static String field_e;

    final static void drawAnimatedButtonFrame(int param0, int param1, int param2, boolean param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          NodeHashTableIterator.field_h.draw(param1, param2);
          if (param3) {
            var4_int = AccountFormText.field_b % NodeHashTableIterator.field_h.width * 2;
            if (NodeHashTableIterator.field_h.width <= var4_int) {
              var4_int = NodeHashTableIterator.field_h.width + (-var4_int + NodeHashTableIterator.field_h.width);
            }
            boolean decompiledSharedTail0 = !(var4_int < 10);
            if (!decompiledSharedTail0) {
              var4_int = 10;
              decompiledSharedTail0 = (HoldTheLine.field_D != 0);
            }
            if ((decompiledSharedTail0) &&
              (var4_int > NodeHashTableIterator.field_h.width - 40)) {
              var4_int = NodeHashTableIterator.field_h.width - 40;
            }
            EmailDomainValidator.drawSpriteHighlight(NodeHashTableIterator.field_h, (byte) 121, var4_int, param2, 30, 0, 80, 0, param1);
          }
          if (param0 != 80) {
            SocialListProtocol.containsPointInBoundaryLoops(true, 89, -61, (GrowableObjectList) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var4), "b.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        try {
          field_c = null;
          field_b = null;
          field_e = null;
          field_a = null;
          int var1_int = -2 / ((param0 + 18) / 57);
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "b.C(" + param0 + ')');
        }
    }

    final static void readSocialListPacket(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_14_0 = 0;
        SocialListEntry stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        SocialListEntry stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        IsaacPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        SocialListEntry var5_ref = null;
        SocialListEntry var6 = null;
        String var6_ref = null;
        SocialListEntry var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 != 10) {
            return;
          }
          var1 = RoadStripRenderer.field_e;
          var2 = var1.readUnsignedByte((byte) -103);
          if (var2 == 0) {
            if (IntrusiveDeque.field_a == null) {
              IntrusiveDeque.field_a = new DualNodeHashTable(128);
              IntWriteRequest.field_l = 0;
            }
            stackIn_14_0 = (1 != var1.readUnsignedByte((byte) -18)) ? 0 : 1;
            var3_int = stackIn_14_0;
            var4_ref_String = var1.readCp1252String(-1231);
            if (var3_int != 0) {
              var1.readCp1252String(-1231);
            }
            var5_ref = TrackCurve.findFriend(param0 - 10, var4_ref_String);
            var6_ref = var1.readCp1252String(param0 - 1241);
            var7_ref = MidiPcmStream.normalizeAccountName((CharSequence) ((Object) var4_ref_String), (byte) 94);
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (null == var5_ref) {
              var5_ref = TrackCurve.findFriend(0, var6_ref);
              if (null != var5_ref) {
                IntrusiveDeque.field_a.put((long)var7_ref.hashCode(), (byte) -75, var5_ref);
              }
            }
            if (var5_ref == null) {
              var5_ref = new SocialListEntry();
              IntrusiveDeque.field_a.put((long)var7_ref.hashCode(), (byte) -75, var5_ref);
              fieldTemp$1 = IntWriteRequest.field_l;
              IntWriteRequest.field_l = IntWriteRequest.field_l + 1;
              var5_ref.insertionOrder = fieldTemp$1;
              CheckboxWidget.field_H.addLast((byte) -128, var5_ref);
            }
            var5_ref.displayName = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (ClientBackgroundRenderer.field_b == 1) {
                ClientBackgroundRenderer.field_b = 2;
              }
              return;
            }
            if (3 == var2) {
              if (ClientBackgroundRenderer.field_b == 2) {
                ClientBackgroundRenderer.field_b = 1;
              }
              return;
            }
            if (var2 != 4) {
              MusicPatchPcmStream.reportClientError((Throwable) null, (byte) 55, "F1: " + AgeValidator.describeServerPacket(false));
              ServerConnectionState.closeServerConnection(-28036);
              return;
            }
            ClientBackgroundRenderer.field_b = 1;
            var3 = var1.readCp1252String(-1231);
            SecondaryNodeDequeIterator.field_g = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte((byte) -70);
            PackedClientOptions.decodePackedOptions(var4, (byte) 61);
            return;
          }
          if (IgnoreListIndex.entries == null) {
            IgnoreListIndex.entries = new DualNodeHashTable(128);
            ReflectionCheckQueue.field_a = 0;
          }
          var3Lifetime1 = var1.readCp1252String(-1231);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readCp1252String(-1231);
          var5 = var1.readCp1252String(-1231);
          var6 = LoadProgressDialog.findIgnoredPlayer(var4_ref_StringLifetime1, param0 ^ 85);
          if (null == var6) {
            var6 = LoadProgressDialog.findIgnoredPlayer(var5, param0 ^ 101);
            if (var6 != null) {
              IgnoreListIndex.entries.put((long)MidiPcmStream.normalizeAccountName((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 111).hashCode(), (byte) -75, var6);
            }
          }
          if (null == var6) {
            var6 = new SocialListEntry();
            IgnoreListIndex.entries.put((long)MidiPcmStream.normalizeAccountName((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 111).hashCode(), (byte) -75, var6);
            fieldTemp$0 = ReflectionCheckQueue.field_a;
            ReflectionCheckQueue.field_a = ReflectionCheckQueue.field_a + 1;
            var6.insertionOrder = fieldTemp$0;
            MidiKeyUsage.field_j.addLast((byte) -105, var6);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.displayName = var4_ref_StringLifetime1;
          var6.worldName = (String) (var3Lifetime1);
          var6.unlink(param0 ^ 10);
          var7 = (SocialListEntry) (MidiKeyUsage.field_j.first((byte) 96));
          scanLoop1: while (true) {
            if (var7 != null) {
              stackIn_63_0 = var6;
              stackIn_63_1 = 200;
              stackIn_63_2 = var7;
              if (var8 != 0) {
                break scanLoop1;
              }
              if (NameSuggestionsPanel.isLaterFriend(stackIn_63_0, stackIn_63_1, stackIn_63_2)) {
                var7 = (SocialListEntry) (MidiKeyUsage.field_j.next((byte) -33));
                continue;
              }
            }
            if (null == var7) {
              MidiKeyUsage.field_j.addLast((byte) -125, var6);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_63_0 = var7;
            stackIn_63_1 = 0;
            stackIn_63_2 = var6;
            break;
          }
          IntrusiveDeque.insertBefore(stackIn_63_0, stackIn_63_1, stackIn_63_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "b.E(" + param0 + ')');
        }
    }

    final static void insertSortedPrefix(SortableValue[] param0, byte param1, int param2) {
        SortableValue var3 = null;
        int var4 = 0;
        int var5 = 0;
        SortableValue[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          if (param1 <= 63) {
            SocialListProtocol.containsPointInBoundaryLoops(true, 65, 85, (GrowableObjectList) null);
          }
          var3 = param0[param2];
          var4 = -1 + param2;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (0 > var4))) {
            stackIn_14_0 = (SortableValue[]) (param0);
            stackIn_14_1 = var4;
            if (var5 == 0) {
              if (((SortableValue) (Object) stackIn_14_0[stackIn_14_1]).compareTo((byte) -101, var3) < 0) {
                param0[var4 + 1] = var3;
                return;
              }
              param0[1 + var4] = param0[var4];
              var4--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = (SortableValue[]) (param0);
            stackIn_14_1 = 0;
          }
          stackIn_14_0[stackIn_14_1] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("b.F(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean containsPointInBoundaryLoops(boolean param0, int param1, int param2, GrowableObjectList param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        GrowableObjectList var6 = null;
        int var7 = 0;
        BoundaryCurve var8 = null;
        int var9 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          if (param0) {
            field_a = (String) null;
          }
          var4_int = 0;
          var5 = 0;
          scanLoop1: while (true) {
            if (param3.size > var5) {
              var6 = (GrowableObjectList) (param3.elements[var5]);
              stackIn_16_0 = 0;
              if (var9 != 0) {
                break scanLoop1;
              }
              var7 = stackIn_16_0;
              while (var6.size > var7) {
                var8 = (BoundaryCurve) (var6.elements[var7]);
                var4_int = var4_int + IntrusiveDeque.lineRayCrossing(var8, (byte) 78, param2, param1);
                var7++;
              }
              var5++;
              continue scanLoop1;
            }
            stackIn_16_0 = 1;
            break;
          }
          stackIn_20_0 = (stackIn_16_0 == var4_int % 2);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("b.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void resendAchievementRequests(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        AchievementUnlockRequest var2 = null;
        IntrusiveNode var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          var2 = (AchievementUnlockRequest) (AccountFormText.field_c.first((byte) 121));
          do {
            if (null == var2) {
              if (!param0) {
                return;
              }
              break;
            }
            NanoTickClock.sendAchievementUnlock(1, param1, var2);
            var2 = (AchievementUnlockRequest) (AccountFormText.field_c.next((byte) -108));
          } while (var3 == 0);
          var2_ref = RaceWorld.field_v.first((byte) 127);
          while (var2_ref != null) {
            HoverTargetState.sendAchievementStatusRequest(param1, (byte) -23);
            var2_ref = RaceWorld.field_v.next((byte) -78);
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "b.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = "Accelerate";
        field_e = "Mine";
    }
}
