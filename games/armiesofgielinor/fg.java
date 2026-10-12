/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fg extends IntrusiveNode {
    static String field_l;
    int field_q;
    static String field_k;
    int[] field_t;
    static String field_m;
    int field_o;
    int field_r;
    int field_p;
    int field_s;
    int field_u;
    static String field_n;

    public static void a(int param0) {
        field_l = null;
        field_k = null;
        field_n = null;
        field_m = null;
        if (param0 != -22856) {
          field_m = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var7;
        int var8;
        int var9;
        TileMetadata var10;
        int var11;
        int var12;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var7 = param1 + ResourceRequest.field_y * param0;
        if (param1 >= 0 &&
          param0 >= 0 &&
          param1 < ResourceRequest.field_y &&
          ef.field_c > param0) {
          if (param4 <= 64) {
            field_l = (String) null;
          }
          var8 = RegionAnchor.a(16711680, param0, var7, param1);
          var9 = -((var8 & -14033988) >>> 24) + 255;
          var8 = var8 & 16777215;
          if (!param6) {
            if (param2 != 0) {
              if (param2 != 1) {
                if (param2 != 2) {
                  rv.a(false, param3, param5, var7);
                } else {
                  po.a((byte) -7, param0, param3, param5, var9, var8, var7, param1);
                  sf.b(param0, param1, 0, param5, var7, param3);
                  IntrusiveNode.a(62, param1, param0, 19 + param3, var7, 39 + param5);
                  cw.a(var7, 19 + param3, param5 + 39, -118, param1, param0);
                  TickCounter.a(var9, false, param0, param3, var7, 0, param1, param5, var8);
                  var10 = vs.field_e[var7].metadata;
                  if (var10 != null &&
                    (var10.modifierFlags & 1) != 0 &&
                    -1 < vs.field_e[var7].ownerPlayer) {
                    var11 = vs.field_e[var7].ownerPlayer;
                    if (null != CipherPacketBuffer.currentBattlefield) {
                      var11 = CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var11, -1);
                    }
                    UnitCycler.a(22 + param5, var11, var7 + ug.field_b, 119, param3 + 20);
                  }
                  fs.a(param3, false, false, var9, param5, var7, param1, var8, param0);
                  if (vs.field_e[var7].hasModifierFlag4((byte) -115)) {
                    GameEvent.a(param3 + 20, true, ug.field_b + var7, vs.field_e[var7].ownerPlayer, 22 + param5);
                  }
                }
              } else {
                if (!cu.field_a) {
                  QuickChatMenu.a(param5, var8, var7, param1, param3, var9, 54, param0);
                }
                pk.a(param3, param0, param1, var7, var8, -29403, var9, param5);
                if (Unit.field_L) {
                  oh.field_I.g(param5, param3);
                }
              }
            } else {
              QuickChatMenu.a(param5, var8, var7, param1, param3, var9, 101, param0);
            }
          } else {
            if (param2 == 2) {
              TickCounter.a(var9, true, param0, param3, var7, 0, param1, param5, var8);
              fs.a(param3, false, true, var9, param5, var7, param1, var8, param0);
            }
          }
          return;
        }
        if (param2 == 2) {
          EquipmentBattleTutorial.a(param0, param1, param5, param3, (byte) 49);
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var1_intLifetime1;
        try {
          if (ck.field_c != null) {
            for (var1_int = 0; var1_int < 16; var1_int++) {
              ck.field_c[var1_int] = null;
            }
          }
          var1_intLifetime1 = -93 / ((28 - param0) / 54);
          PopupPresentation.field_j = null;
          System.gc();
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fg.C(" + param0 + ')');
        }
    }

    final static QuickChatMenu buildQuickChatResponseMenu(int obfuscationGuard, ClientUiComponent style, int[] responsePhraseIds, ClientUiComponent textStyle, ClientUiComponent itemStyle) {
        int var10_int = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        QuickChatMenu[] var8 = null;
        int var9 = 0;
        QuickChatPhrase var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_9_0 = null;
        QuickChatMenu stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var10 = null;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = responsePhraseIds.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new QuickChatMenu[var5_int];
          var9 = 49;
          try {
            for (var10_int = 0; var5_int > var10_int; var10_int++) {
              var11 = ce.quickChatPhrases.getPhrase(responsePhraseIds[var10_int], 81);
              var6[var10_int] = var11.getPreviewText((byte) 97);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
            if (obfuscationGuard >= -7) {
              fg.a(-20);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = null;
            return (QuickChatMenu) (stackIn_9_0);
          }
          stackIn_11_0 = new QuickChatMenu(0L, style, itemStyle, textStyle, var8, responsePhraseIds, var6, var14);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fg.A(").append(obfuscationGuard).append(',');
          if (style == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (responsePhraseIds == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (textStyle == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (itemStyle == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_o = param0;
          this.field_u = param6;
          this.field_p = param1;
          this.field_t = param3;
          if (param7 > -55) {
            ClientUiComponent var10 = (ClientUiComponent) null;
            fg.buildQuickChatResponseMenu(-76, (ClientUiComponent) null, (int[]) null, (ClientUiComponent) null, (ClientUiComponent) null);
          }
          this.field_r = param4;
          this.field_s = param2;
          this.field_q = param5;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fg.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, CipherPacketBuffer param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          dc var13 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          dc var17 = null;
          Object var18 = null;
          Object var19 = null;
          java.lang.reflect.Field var20 = null;
          Object var22 = null;
          Object var23 = null;
          byte[][] var26 = null;
          java.lang.reflect.Field var27 = null;
          java.lang.reflect.Field var28 = null;
          java.lang.reflect.Method var29 = null;
          java.lang.reflect.Method var30 = null;
          int var8Lifetime1;
          var18 = null;
          var19 = null;
          var16 = null;
          var22 = null;
          var23 = null;
          var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            var13 = (dc) (DualNodeHashTable.field_e.first((byte) 125));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_p; var4++) {
              if (null != var13.field_k[var4]) {
                if (var13.field_k[var4].status == 2) {
                  var13.field_m[var4] = -5;
                }
                if (var13.field_k[var4].status == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_r[var4]) {
                if (var13.field_r[var4].status == 2) {
                  var13.field_m[var4] = -6;
                }
                if (0 == var13.field_r[var4].status) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.position;
            param1.writeInt((byte) -66, var17.field_q);
            for (var5 = param0; var17.field_p > var5; var5++) {
              if (var17.field_m[var5] != 0) {
                param1.writeByte(1, var17.field_m[var5]);
              } else {
                try {
                  var6_int = var17.field_t[var5];
                  if (var6_int != 0) {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_k[var5].result);
                      var20 = var16_ref;
                      var20.setInt((Object) null, var17.field_v[var5]);
                      param1.writeByte(1, 0);
                    } else {
                      if (var6_int == 2) {
                        var28 = (java.lang.reflect.Field) (var17.field_k[var5].result);
                        var8 = var28.getModifiers();
                        param1.writeByte(param0 + 1, 0);
                        param1.writeInt((byte) -79, var8);
                      }
                    }
                  } else {
                    var27 = (java.lang.reflect.Field) (var17.field_k[var5].result);
                    var8 = var27.getInt((Object) null);
                    param1.writeByte(param0 ^ 1, 0);
                    param1.writeInt((byte) -75, var8);
                  }
                  if (var6_int == 3) {
                    var29 = (java.lang.reflect.Method) (var17.field_r[var5].result);
                    var26 = var17.field_u[var5];
                    var9 = new Object[var26.length];
                    for (var10_int = 0; var26.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var26[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var29.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.writeByte(param0 ^ 1, 0);
                    } else if (var10 instanceof Number) {
                      param1.writeByte(1, 1);
                      param1.writeLong(((Number) (var10)).longValue(), param0 + 38359632);
                    } else if (!(var10 instanceof String)) {
                      param1.writeByte(1, 4);
                    } else {
                      param1.writeByte(1, 2);
                      param1.b((String) (var10), param0 + 13851);
                    }
                  } else {
                    if (4 == var6_int) {
                      var30 = (java.lang.reflect.Method) (var17.field_r[var5].result);
                      var8Lifetime1 = var30.getModifiers();
                      param1.writeByte(param0 ^ 1, 0);
                      param1.writeInt((byte) -115, var8Lifetime1);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.writeByte(1, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.writeByte(1, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.writeByte(1, -21);
                }
              }
            }
            param1.b((byte) -39, var4);
            var17.unlink(-115);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_69_0 = var2;
            stackIn_69_1 = new StringBuilder().append("fg.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    fg() {
    }

    static {
        field_l = "Most health recovered";
        field_m = "Turns used";
        field_k = "End turn";
        field_n = "This item can only be used on an elf songstress.";
    }
}
