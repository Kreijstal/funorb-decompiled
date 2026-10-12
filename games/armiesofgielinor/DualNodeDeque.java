/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualNodeDeque {
    static int field_g;
    static String field_e;
    static String field_k;
    static int field_c;
    static char field_i;
    static String field_h;
    private DualLinkedNode sentinel;
    static int field_f;
    static boolean decodedChatSystemMessage;
    static String field_a;
    private DualLinkedNode traversalCursor;

    final DualLinkedNode next(int obfuscationGuard) {
        DualLinkedNode var2 = this.traversalCursor;
        if (var2 == this.sentinel) {
          this.traversalCursor = null;
          return null;
        }
        this.traversalCursor = var2.secondaryNext;
        if (obfuscationGuard == 24) {
          return var2;
        }
        return (DualLinkedNode) null;
    }

    final static TileMetadata readTaggedTileMetadata(CipherPacketBuffer packet, int recordBitLength, int obfuscationGuard) {
        TileMetadata var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_2_0 = null;
        TileMetadata stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 == recordBitLength) {
            stackIn_2_0 = null;
            return (TileMetadata) (stackIn_2_0);
          }
          var3 = new TileMetadata();
          no.readTaggedFields(packet, var3, recordBitLength, -24721);
          var4 = -10 % ((obfuscationGuard + 23) / 54);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ui.A(");
          if (packet == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(recordBitLength).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final DualLinkedNode popFirst(int obfuscationGuard) {
        DualLinkedNode var2 = this.sentinel.secondaryNext;
        if (obfuscationGuard != 11) {
          return (DualLinkedNode) null;
        }
        if (this.sentinel != var2) {
          var2.unlinkSecondary((byte) -76);
          return var2;
        }
        return null;
    }

    public static void d(int param0) {
        field_e = null;
        field_a = null;
        if (param0 <= 93) {
          return;
        }
        field_k = null;
        field_h = null;
    }

    final int size(int obfuscationGuard) {
        DualLinkedNode var3 = null;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = 0;
        DualLinkedNode var3Lifetime1;
        if (obfuscationGuard == 30578) {
          var3 = this.sentinel.secondaryNext;
          while (this.sentinel != var3) {
            var3 = var3.secondaryNext;
            var2++;
          }
          return var2;
        }
        field_k = (String) null;
        var3Lifetime1 = this.sentinel.secondaryNext;
        while (this.sentinel != var3Lifetime1) {
          var3Lifetime1 = var3Lifetime1.secondaryNext;
          var2++;
        }
        return var2;
    }

    final void addLast(DualLinkedNode node, boolean obfuscationGuard) {
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary((byte) -76);
          }
          node.secondaryNext = this.sentinel;
          if (obfuscationGuard) {
            field_i = '￠';
          }
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ui.I(" + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final DualLinkedNode first(byte obfuscationGuard) {
        DualLinkedNode var2 = this.sentinel.secondaryNext;
        int var3 = 125 / ((obfuscationGuard + 44) / 59);
        if (var2 != this.sentinel) {
          this.traversalCursor = var2.secondaryNext;
          return var2;
        }
        this.traversalCursor = null;
        return null;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_177_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime1Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        stackIn_3_0 = (11 != CombatViewTransition.a(param3, -1 + param0, 11, (byte) -122)) ? 0 : 1;
        var5 = stackIn_3_0;
        stackIn_6_0 = (11 != CombatViewTransition.a(param3, param0 + 1, 11, (byte) -115)) ? 0 : 1;
        var6 = stackIn_6_0;
        stackIn_9_0 = (11 != CombatViewTransition.a(param3 + 1, param0, 11, (byte) -104)) ? 0 : 1;
        var7 = stackIn_9_0;
        stackIn_12_0 = (CombatViewTransition.a(param3 - 1, param0, 11, (byte) -94) != 11) ? 0 : 1;
        var8 = stackIn_12_0;
        var10 = -98 % ((11 - param2) / 40);
        var9 = 0;
        if (var5 != 0) {
          var9++;
        }
        if (var6 != 0) {
          var9++;
        }
        if (var7 != 0) {
          var9++;
        }
        if (var8 != 0) {
          var9++;
        }
        param4 -= 44;
        if (1 >= var9) {
          var11 = 1;
          if (var11 != 0) {
            if (var7 != 0) {
              l.activeStructureSprites[30].draw(param1, param4);
            }
            if (var5 != 0) {
              l.activeStructureSprites[29].draw(param1, param4);
            }
            l.activeStructureSprites[24].draw(param1, param4);
            if (var6 != 0) {
              l.activeStructureSprites[27].draw(param1, param4);
            }
            if (var8 != 0) {
              l.activeStructureSprites[28].draw(param1, param4);
            }
          } else {
            if (var7 != 0 &&
              var8 != 0) {
              l.activeStructureSprites[26].draw(param1, param4);
              return;
            }
            if (var5 != 0 &&
              var6 != 0) {
              l.activeStructureSprites[25].draw(param1, param4);
            }
          }
          return;
        }
        if (var5 != 0) {
          if (var7 != 0) {
            var11Lifetime1 = 1;
            if (var11Lifetime1 == 0) {
              if (var8 != 0) {
                l.activeStructureSprites[26].draw(param1, param4);
                return;
              }
              if (var6 == 0) {
                return;
              }
              l.activeStructureSprites[25].draw(param1, param4);
              return;
            }
            l.activeStructureSprites[30].draw(param1, param4);
            l.activeStructureSprites[29].draw(param1, param4);
            l.activeStructureSprites[24].draw(param1, param4);
            if (var6 != 0) {
              l.activeStructureSprites[27].draw(param1, param4);
            }
            if (var8 != 0) {
              l.activeStructureSprites[28].draw(param1, param4);
            }
            return;
          }
          if (var8 == 0) {
            if (var6 != 0) {
              stackIn_57_0 = (var8 != 0) ? 1 : 0;
            } else {
              stackIn_57_0 = 0;
            }
          } else {
            stackIn_57_0 = 1;
          }
          var11Lifetime1Lifetime1 = stackIn_57_0;
          if (var11Lifetime1Lifetime1 != 0) {
            l.activeStructureSprites[29].draw(param1, param4);
            l.activeStructureSprites[24].draw(param1, param4);
            if (var6 != 0) {
              l.activeStructureSprites[27].draw(param1, param4);
            }
            if (var8 != 0) {
              l.activeStructureSprites[28].draw(param1, param4);
            }
          } else {
            if (var6 != 0) {
              l.activeStructureSprites[25].draw(param1, param4);
            }
          }
          return;
        }
        if (var6 == 0) {
          var11Lifetime2 = 0;
          if (var11Lifetime2 == 0) {
            if (var7 != 0 &&
              var8 != 0) {
              l.activeStructureSprites[26].draw(param1, param4);
              return;
            }
            return;
          }
          if (var7 != 0) {
            l.activeStructureSprites[30].draw(param1, param4);
          } else {
          }
          l.activeStructureSprites[24].draw(param1, param4);
          if (var8 == 0) {
            return;
          }
          l.activeStructureSprites[28].draw(param1, param4);
          return;
        }
        if (var7 == 0) {
          stackIn_177_0 = (var8 == 0) ? 0 : 1;
          var11Lifetime3 = stackIn_177_0;
          if (var11Lifetime3 != 0) {
            l.activeStructureSprites[24].draw(param1, param4);
            l.activeStructureSprites[27].draw(param1, param4);
            if (var8 != 0) {
              l.activeStructureSprites[28].draw(param1, param4);
            }
          } else {
          }
          return;
        }
        var11Lifetime4 = 1;
        if (var11Lifetime4 == 0) {
          if (var8 != 0) {
            l.activeStructureSprites[26].draw(param1, param4);
            return;
          }
          return;
        }
        l.activeStructureSprites[30].draw(param1, param4);
        l.activeStructureSprites[24].draw(param1, param4);
        l.activeStructureSprites[27].draw(param1, param4);
        if (var8 != 0) {
          l.activeStructureSprites[28].draw(param1, param4);
        }
    }

    final static void a(byte param0, ResourceArchive param1) {
        qs var2 = null;
        try {
          qs.a(param1.getFileByName("", 96, "headers.packvorbis"));
          var2 = qs.a(param1, "jagex logo2.packvorbis", "");
          if (param0 >= -102) {
            DualNodeDeque.a(-11, -82, (byte) 79, 117, -17);
          }
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ui.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public DualNodeDeque() {
        this.sentinel = new DualLinkedNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    static {
        field_e = "Accept";
        field_h = "Username: ";
        field_k = "This unit cannot move";
        field_a = "Out of range";
    }
}
