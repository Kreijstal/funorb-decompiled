/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bullet extends IntrusiveNode {
    static int collisionLaserCount;
    int xQ16;
    int velocityXQ16;
    int remainingTicks;
    boolean inactive;
    int kind;
    int velocityYQ16;
    int yQ16;

    final static QuickChatDynamicCommand[] quickChatDynamicCommands(int guard) {
        try {
          if (guard > -90) {
            collisionLaserCount = -121;
          }
          QuickChatDynamicCommand[] stackIn_4_0 = new QuickChatDynamicCommand[]{co.field_b, AccountMessagePanel.field_P, DialWidget.quickChatCommand, AlternateUsernameCredentials.field_m, ci.field_d, BufferedSocket.field_k, sj.field_l, ea.field_g, LabeledField.field_H, AccountRegistrationPanel.field_L, le.field_a, BrowserSessionMarkerState.field_c, mg.field_g, TrackerGainSupport.field_d};
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vh.A(" + guard + ')');
        }
    }

    final static String formatArchiveProgress(String fallback, ResourceArchive archive, String label, int guard) {
        String stackIn_12_2 = null;
        String stackIn_16_2 = null;
        String stackIn_20_2 = null;
        try {
          if (!archive.ensureIndex(0)) {
            String stackIn_2_0 = (String) (fallback);
            return stackIn_2_0;
          }
          if (guard == -12920) {
            String stackIn_7_0 = label + " - " + archive.overallProgress(-125) + "%";
            return stackIn_7_0;
          }
          String stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var4;
          StringBuilder stackIn_11_1 = new StringBuilder().append("vh.G(");
          if (fallback == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (archive == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (label == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(')').toString());
        }
    }

    final void draw(int cameraX, boolean guard, int cameraY) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (guard) {
            return;
          }
          int var4_int = BoundedRandomAccessFile.activeSession.worldWidth;
          int var5 = (this.yQ16 >> 16) - cameraY;
          if (var5 >= -1 &&
            481 > var5) {
            int var6 = -cameraX + (this.xQ16 >> 16);
            do {
              if (var6 < -1) {
                var6 = var6 + var4_int;
                break;
              }
              var6 = var6 - var4_int;
            } while (var11 == 0);
            while (true) {
              if (var6 >= 641) {
                return;
              }
              if (var11 != 0) {
                return;
              }
              if (this.kind == 1) {
                var9 = 4198404;
                var8 = 8413216;
                var7 = 16769152;
              } else {
                var7 = 8446207;
                var9 = 266304;
                var8 = 2121856;
              }
              int var10 = this.remainingTicks << 2;
              if (var10 < 256) {
                var8 = (-16711936 & (var8 & 16711935) * var10 | (var8 & 65280) * var10 & 16711680) >>> 8;
                var7 = (-16711936 & var10 * (16711935 & var7) | 16711680 & (65280 & var7) * var10) >>> 8;
                var9 = (-16711936 & var10 * (var9 & 16711935) | 16711680 & var10 * (65280 & var9)) >>> 8;
              }
              SoftwareRasterizer.addPixel(var6, var5, var7);
              SoftwareRasterizer.addPixel(-1 + var6, var5, var8);
              SoftwareRasterizer.addPixel(var6 + 1, var5, var8);
              SoftwareRasterizer.addPixel(var6, -1 + var5, var8);
              SoftwareRasterizer.addPixel(var6, var5 + 1, var8);
              SoftwareRasterizer.addPixel(-1 + var6, -1 + var5, var9);
              SoftwareRasterizer.addPixel(var6 + 1, -1 + var5, var9);
              SoftwareRasterizer.addPixel(var6 - 1, 1 + var5, var9);
              SoftwareRasterizer.addPixel(1 + var6, 1 + var5, var9);
              var6 = var6 + var4_int;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var4), "vh.F(" + cameraX + ',' + guard + ',' + cameraY + ')');
        }
    }

    final static int accountStateIndex(int guard) {
        try {
          if (guard <= 87) {
            Bullet.removeFirstDialogue((byte) 46);
          }
          if (aj.b(-90)) {
            int stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          if (!UiContainer.e((byte) 104)) {
            int stackIn_12_0 = 1;
            return stackIn_12_0;
          }
          int stackIn_10_0 = 2;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vh.E(" + guard + ')');
        }
    }

    final static void bucketMeshFacesByDepth(TriangleMesh mesh, int nearDepth, int farDepth, boolean cullBackfaces, int guard) {
        int stackIn_32_0 = 0;
        int stackIn_52_0 = 0;
        String stackIn_69_2 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = EscapeVector.obfuscationControl;
        try {
          int var5_int = nm.a(3 * (-nearDepth + farDepth), (byte) 78);
          if (guard != 4198) {
            collisionLaserCount = 9;
          }
          int var6 = 3 * nearDepth;
          int var7 = -10 + var5_int;
          NetworkGameClient.h(-115);
          if (mesh.field_I > 0 &&
            null != mesh.field_n) {
            cj.a((byte) -99);
          }
          aj.field_d = 0;
          int var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < mesh.faceCount)))) {
            int var9 = mesh.faceVertexA[var8];
            int var10 = mesh.faceVertexB[var8];
            int var11 = mesh.faceVertexC[var8];
            boolean stackOut_13_0 = cullBackfaces;
            stackIn_52_0 = stackOut_13_0 ? 1 : 0;
            boolean stackIn_14_0 = stackOut_13_0;
            if (var19 == 0) {
              if (stackIn_14_0) {
                int var12 = on.field_g[var9];
                int var13 = DraggableWidget.field_D[var9];
                var14 = on.field_g[var10] - var12;
                var15 = on.field_g[var11] - var12;
                var16 = -var13 + DraggableWidget.field_D[var10];
                var17 = DraggableWidget.field_D[var11] - var13;
              }
              if (!stackIn_14_0 ||
                !(0 <= var14 * var17 - var16 * var15)) {
                int var12Lifetime1 = DirectByteStorage.field_j[var9];
                if (var12Lifetime1 != -2147483648) {
                  int var13Lifetime1 = DirectByteStorage.field_j[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = DirectByteStorage.field_j[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + var14 + (var12Lifetime1 + var13Lifetime1);
                      stackIn_32_0 = (var7 >= 0) ? (var15 >> var7) : (var15 << -var7);
                      var16 = -stackIn_32_0 + (al.field_f.length - 1);
                      var17 = al.field_f[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          int stackIn_43_0 = var16;
                          if (stackIn_43_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = al.field_f[var16];
                          continue;
                        }
                        int stackIn_43_0Lifetime1 = var17 + (var16 << 4);
                        int var18 = stackIn_43_0Lifetime1;
                        SavedDataQuerySupport.field_f[var18] = var8;
                        al.field_f[var16] = 1 + var17;
                        if (mesh.field_I > 0 &&
                          mesh.field_n != null) {
                          byte dupTemp$0 = mesh.field_n[var8];
                          EditableTextWidget.field_I[dupTemp$0] = EditableTextWidget.field_I[dupTemp$0] + 1;
                        }
                        aj.field_d = aj.field_d + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_52_0 = ~mesh.field_I;
          }
          if (stackIn_52_0 < -1 &&
            null != mesh.field_n) {
            int var8Lifetime1 = 0;
            int var9Lifetime1 = 0;
            while (!(EditableTextWidget.field_I.length <= var9Lifetime1)) {
              int var10Lifetime1 = EditableTextWidget.field_I[var9Lifetime1];
              EditableTextWidget.field_I[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_68_0 = var5;
          StringBuilder stackIn_68_1 = new StringBuilder().append("vh.D(");
          if (mesh == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(nearDepth).append(',').append(farDepth).append(',').append(cullBackfaces).append(',').append(guard).append(')').toString());
        }
    }

    final static void removeFirstDialogue(byte guard) {
        try {
          if (guard != -22) {
            Bullet.formatArchiveProgress((String) null, (ResourceArchive) null, (String) null, -6);
          }
          if (mg.field_e.isEmpty(-107)) {
            return;
          }
          mg.field_e.removeFirst(guard - 20223);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "vh.C(" + guard + ')');
        }
    }

    final void reset(int xQ16, boolean inactive, int velocityXQ16, int velocityYQ16, byte guard, int kind, int yQ16, int remainingTicks) {
        try {
          this.kind = kind;
          this.velocityYQ16 = velocityYQ16;
          this.yQ16 = yQ16;
          this.xQ16 = xQ16;
          this.remainingTicks = remainingTicks;
          this.inactive = inactive;
          this.velocityXQ16 = velocityXQ16;
          if (guard >= -118) {
            Bullet.accountStateIndex(-128);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vh.B(" + xQ16 + ',' + inactive + ',' + velocityXQ16 + ',' + velocityYQ16 + ',' + guard + ',' + kind + ',' + yQ16 + ',' + remainingTicks + ')');
        }
    }

    final void deactivate(int guard) {
        try {
          int var2_int = 54 / ((guard - 40) / 51);
          this.reset(0, true, 0, 0, (byte) -125, 0, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vh.H(" + guard + ')');
        }
    }

    Bullet(int xQ16, int yQ16, int velocityXQ16, int velocityYQ16, int kind, int remainingTicks) {
        try {
          this.reset(xQ16, false, velocityXQ16, velocityYQ16, (byte) -122, kind, yQ16, remainingTicks);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vh.<init>(" + xQ16 + ',' + yQ16 + ',' + velocityXQ16 + ',' + velocityYQ16 + ',' + kind + ',' + remainingTicks + ')');
        }
    }

    static {
    }
}
