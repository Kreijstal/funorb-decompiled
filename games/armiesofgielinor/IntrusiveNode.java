/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static String field_g;
    IntrusiveNode next;
    static String field_c;
    static BitmapFont field_e;
    IntrusiveNode previous;
    static String field_a;
    static String field_d;
    static String[] field_f;
    static boolean field_h;
    long key;

    final static int a(int param0, int param1) {
        int var2 = -103 / ((27 - param0) / 46);
        return cd.campaigns[param1].missions.length;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_38_0 = 0;
        int var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int[] var13;
        int[] var14;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var6 = 50 + GameplayController.field_f;
        var14 = NetworkResourceRequest.field_C.movementPlanner.movementCosts;
        var13 = var14;
        var7 = var13;
        var8 = 43 % ((-48 - param0) / 51);
        if (NetworkResourceRequest.field_C.selectedUnit != null &&
          CipherPacketBuffer.currentBattlefield.currentPlayer == NetworkResourceRequest.field_C.controlledPlayerId &&
          !NetworkResourceRequest.field_C.selectedUnit.movementSpent && (NetworkResourceRequest.field_C.selectedUnit.ownerPlayer == NetworkResourceRequest.field_C.controlledPlayerId ||
          !NetworkResourceRequest.field_C.movementPlanner.field_w) && !NetworkResourceRequest.field_C.selectedUnit.h(-13494)) {
          var9 = NetworkResourceRequest.field_C.movementPlanner.getMovementBudget(27732);
          if (var9 < var14[param4]) {
            return;
          }
          if (param2 == 0 ||
            var7[-CipherPacketBuffer.currentBattlefield.mapWidth + param4] > var9) {
            SoftwareRaster.d(-40 + param5, param3, param5, param3 - 20, 65280, var6);
          }
          if (-1 + ef.field_c == param2 ||
            var7[param4 + ResourceRequest.field_y] > var9) {
            SoftwareRaster.d(40 + param5, param3, param5, param3 + 20, 65280, var6);
          }
          if (0 == param1 ||
            var7[param4 - 1] > var9) {
            SoftwareRaster.d(-40 + param5, param3, param5, param3 + 20, 65280, var6);
          }
          if (ResourceRequest.field_y - 1 == param1 ||
            var9 < var7[param4 + 1]) {
            SoftwareRaster.d(param5 + 40, param3, param5, -20 + param3, 65280, var6);
          }
        }
        if (NetworkResourceRequest.field_C.field_gc <= -1) {
          return;
        }
        regionExit1: {
          if (NetworkResourceRequest.field_C.controlledPlayerId == NetworkResourceRequest.field_C.battlefield.currentPlayer) {
            if (NetworkResourceRequest.field_C.field_gc == 44 &&
              NetworkResourceRequest.field_C.field_rb &&
              -1 < NetworkResourceRequest.field_C.field_Cb) {
              var9 = NetworkResourceRequest.field_C.field_Cb;
              switch (var9) {
                case 1:
                  if (NetworkResourceRequest.field_C.field_cc != param1) {
                    break regionExit1;
                  }
                  if (param2 > NetworkResourceRequest.field_C.field_eb) {
                    break regionExit1;
                  }
                  if (param2 < -NetworkResourceRequest.field_C.field_ic + NetworkResourceRequest.field_C.field_eb) {
                    break regionExit1;
                  }
                  if (param2 == NetworkResourceRequest.field_C.field_eb - NetworkResourceRequest.field_C.field_ic) {
                    SoftwareRaster.d(param5 - 40, param3, param5, param3 - 20, 65280, var6);
                  }
                  if (param2 == NetworkResourceRequest.field_C.field_eb) {
                    SoftwareRaster.d(40 + param5, param3, param5, param3 + 20, 65280, var6);
                  }
                  SoftwareRaster.d(param5 - 40, param3, param5, 20 + param3, 65280, var6);
                  SoftwareRaster.d(40 + param5, param3, param5, param3 - 20, 65280, var6);
                  break regionExit1;
                case 0:
                  if (param2 != NetworkResourceRequest.field_C.field_eb) {
                    break regionExit1;
                  }
                  if (param1 < NetworkResourceRequest.field_C.field_cc) {
                    break regionExit1;
                  }
                  if (NetworkResourceRequest.field_C.field_cc + NetworkResourceRequest.field_C.field_ic < param1) {
                    break regionExit1;
                  }
                  SoftwareRaster.d(param5 - 40, param3, param5, param3 - 20, 65280, var6);
                  SoftwareRaster.d(40 + param5, param3, param5, 20 + param3, 65280, var6);
                  if (NetworkResourceRequest.field_C.field_cc == param1) {
                    SoftwareRaster.d(-40 + param5, param3, param5, 20 + param3, 65280, var6);
                  }
                  if (NetworkResourceRequest.field_C.field_cc + NetworkResourceRequest.field_C.field_ic != param1) {
                    break regionExit1;
                  }
                  SoftwareRaster.d(param5 + 40, param3, param5, param3 - 20, 65280, var6);
                  break regionExit1;
                case 2:
                  if (NetworkResourceRequest.field_C.field_cc != param1) {
                    break regionExit1;
                  }
                  if (NetworkResourceRequest.field_C.field_eb > param2) {
                    break regionExit1;
                  }
                  if (param2 > NetworkResourceRequest.field_C.field_ic + NetworkResourceRequest.field_C.field_eb) {
                    break regionExit1;
                  }
                  if (param2 == NetworkResourceRequest.field_C.field_eb) {
                    SoftwareRaster.d(param5 - 40, param3, param5, param3 - 20, 65280, var6);
                  }
                  if (param2 == NetworkResourceRequest.field_C.field_ic + NetworkResourceRequest.field_C.field_eb) {
                    SoftwareRaster.d(param5 + 40, param3, param5, 20 + param3, 65280, var6);
                  }
                  SoftwareRaster.d(param5 - 40, param3, param5, param3 + 20, 65280, var6);
                  SoftwareRaster.d(40 + param5, param3, param5, -20 + param3, 65280, var6);
                  break regionExit1;
                default:
                  break regionExit1;
                case 3:
                  if (NetworkResourceRequest.field_C.field_eb != param2) {
                    break regionExit1;
                  }
                  if (NetworkResourceRequest.field_C.field_cc < param1) {
                    break regionExit1;
                  }
                  if (param1 < -NetworkResourceRequest.field_C.field_ic + NetworkResourceRequest.field_C.field_cc) {
                    break regionExit1;
                  }
                  SoftwareRaster.d(-40 + param5, param3, param5, param3 - 20, 65280, var6);
                  SoftwareRaster.d(40 + param5, param3, param5, param3 + 20, 65280, var6);
                  if (-NetworkResourceRequest.field_C.field_ic + NetworkResourceRequest.field_C.field_cc == param1) {
                    SoftwareRaster.d(-40 + param5, param3, param5, 20 + param3, 65280, var6);
                  }
                  if (param1 != NetworkResourceRequest.field_C.field_cc) {
                    break regionExit1;
                  }
                  SoftwareRaster.d(40 + param5, param3, param5, -20 + param3, 65280, var6);
                  break regionExit1;
              }
            }
            stackIn_38_0 = (!NetworkResourceRequest.field_C.field_rb) ? 16711680 : 65280;
            var9 = stackIn_38_0;
            var10 = NetworkResourceRequest.field_C.field_cc - param1;
            var11 = NetworkResourceRequest.field_C.field_eb - param2;
            if (Math.abs(var10) <= NetworkResourceRequest.field_C.field_ic &&
              Math.abs(var11) <= NetworkResourceRequest.field_C.field_ic) {
              if (param2 == 0 ||
                var11 == NetworkResourceRequest.field_C.field_ic) {
                SoftwareRaster.d(-40 + param5, param3, param5, param3 - 20, var9, var6);
              }
              if (param2 == -1 + ef.field_c ||
                -var11 == NetworkResourceRequest.field_C.field_ic) {
                SoftwareRaster.d(param5 + 40, param3, param5, param3 + 20, var9, var6);
              }
              if (param1 == 0 ||
                var10 == NetworkResourceRequest.field_C.field_ic) {
                SoftwareRaster.d(-40 + param5, param3, param5, 20 + param3, var9, var6);
              }
              if ((param1 == -1 + ResourceRequest.field_y ||
                -var10 == NetworkResourceRequest.field_C.field_ic)) {
                SoftwareRaster.d(40 + param5, param3, param5, -20 + param3, var9, var6);
              }
              break regionExit1;
            }
            return;
          }
        }
    }

    final boolean c(int param0) {
        if (this.previous == null) {
          return false;
        }
        if (param0 != 65280) {
          this.key = -90L;
          return true;
        }
        return true;
    }

    final static void a(int param0, rs param1, byte param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = vl.outgoingPacket;
          var5.writeCipheredOpcode(32161, param0);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, 1);
          var5.writeByte(1, param1.field_r);
          var5.c((byte) 60, param1.field_l);
          if (param2 != 105) {
            IntrusiveNode.a((java.applet.Applet) null, (String) null, (byte) 58, (String) null, -67L);
          }
          var5.writeInt((byte) -54, param1.field_w);
          var5.writeInt((byte) -53, param1.field_m);
          var5.writeInt((byte) -63, param1.field_s);
          var5.writeInt((byte) -109, param1.field_u);
          var5.b((byte) -39, var4);
          var5.writeByteLengthPrefix(-var4 + var5.position, param2 + 5825);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tc.OB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != 4) {
          field_c = (String) null;
        }
        field_a = null;
        field_d = null;
        field_c = null;
        field_f = null;
    }

    final void unlink(int obfuscationGuard) {
        if (null == this.previous) {
          return;
        }
        this.previous.next = this.next;
        this.next.previous = this.previous;
        int var2 = -91 % ((-37 - obfuscationGuard) / 63);
        this.previous = null;
        this.next = null;
    }

    final static void a(java.applet.Applet param0, String param1, byte param2, String param3, long param4) {
        try {
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param0.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param1 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param4 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + fq.a((byte) -82, vi.b(107) + 1000L * param4) + "; Max-Age=" + param4;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              lj.a((byte) -52, param0, "document.cookie=\"" + var7Lifetime4 + "\"");
              if (param2 <= 23) {
                field_e = (BitmapFont) null;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var6_ref;
            stackIn_10_1 = new StringBuilder().append("tc.SB(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
            if (param1 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, boolean param1, boolean param2, int param3) {
        if (!param2) {
          IntrusiveNode.a((java.applet.Applet) null, (String) null, (byte) 39, (String) null, -75L);
        }
        return et.a(-3);
    }

    final static int b(int param0) {
        oi.field_c.a(18199);
        if (!ai.field_T.poll(true)) {
          return ep.b((byte) -120);
        }
        if (param0 >= 68) {
          return 0;
        }
        field_d = (String) null;
        return 0;
    }

    static {
        field_c = "Exploiting a bug";
        field_a = "Status";
        field_g = "Go to Lobby";
        field_h = false;
        field_d = "Free";
    }
}
