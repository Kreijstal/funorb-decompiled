/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk implements WidgetPainter {
    static String field_a;
    static String field_g;
    static String field_f;
    private DropdownSelector field_c;
    static int packetPayloadLength;
    static int[][] matchupDamagePercent;
    static String field_e;

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        field_a = null;
        matchupDamagePercent = (int[][]) null;
        if (!param0) {
          field_f = (String) null;
        }
        field_f = null;
    }

    final static RgbSprite[] loadRgbSpritesByName(String fileName, byte obfuscationGuard, ResourceArchive archive, String groupName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        RgbSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -123) {
            var6 = (String) null;
            fk.a(false, (String) null);
          }
          var4_int = archive.getGroupId(groupName, 110);
          var5 = archive.getFileId((byte) -72, var4_int, fileName);
          stackIn_3_0 = ConsoleEvaluationException.a(false, archive, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("fk.E(");
          if (fileName == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static ConsoleExpression parseConsoleExpression(ConsoleTokenCursor cursor, int obfuscationGuard) throws ConsoleParseException {
        ConsoleExpression guardResult = null;
        ConsoleExpression literalResult = null;
        ConsoleExpression emptyCallResult = null;
        ConsoleExpression callResult = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String cursorDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        ConsoleExpression expression = null;
        ConsoleExpression openingToken = null;
        ConsoleExpression separatorToken = null;
        try {
          if (obfuscationGuard >= -7) {
            guardResult = (ConsoleExpression) null;
            return guardResult;
          }
          expression = cursor.readToken((byte) 13);
          if (BattleTutorial.consoleStringKind != expression.kind &&
            hf.consoleCharacterKind != expression.kind &&
            expression.kind != gg.consoleNumberKind &&
            expression.kind != EquipmentBattleTutorial.consoleBooleanKind) {
            if (rn.consoleCallKind != expression.kind) {
              throw new ConsoleParseException(expression.sourceOffset);
            }
            if (cursor.isAtEnd(126)) {
              throw new ConsoleParseException(expression.sourceOffset);
            }
            openingToken = cursor.readToken((byte) 13);
            if (ChatMessage.consoleArgumentStartKind != openingToken.kind) {
              throw new ConsoleParseException(openingToken.sourceOffset);
            }
            expression.arguments = new NodeDeque();
            while (true) {
              if (cursor.isAtEnd(127)) {
                throw new ConsoleParseException(expression.sourceOffset);
              }
              if (cursor.readToken((byte) 13).kind == LeaderEscortCondition.consoleArgumentEndKind) {
                emptyCallResult = expression;
                return emptyCallResult;
              }
              cursor.position = cursor.position - 1;
              expression.arguments.addLast((byte) -119, (IntrusiveNode) (fk.parseConsoleExpression(cursor, -32)));
              if (cursor.isAtEnd(127)) {
                throw new ConsoleParseException(expression.sourceOffset);
              }
              separatorToken = cursor.readToken((byte) 13);
              if (LeaderEscortCondition.consoleArgumentEndKind == separatorToken.kind) {
                callResult = expression;
                return callResult;
              }
              if (separatorToken.kind != sb.consoleArgumentCommaKind) {
                throw new ConsoleParseException(separatorToken.sourceOffset);
              }
            }
          }
          literalResult = expression;
          return literalResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fk.F(");
          if (cursor == null) {
            cursorDescription = "null";
          } else {
            cursorDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(cursorDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    fk(DropdownSelector param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        try {
          if (obfuscationGuard > -79) {
            var11 = (String) null;
            fk.a((byte) -28, (java.applet.Applet) null, (String) null);
          }
          var6_int = originX + widget.x;
          var7 = originY + widget.y;
          StateChangeEvent.a(widget.width, var6_int, widget.height, -127, var7);
          if (widget.a(false)) {
            na.c(-4 + widget.width, 2 + var6_int, -67, widget.height - 4, 2 + var7);
          }
          SoftwareRaster.setClip(var6_int, var7, var6_int + widget.width - 2, widget.height + var7);
          var8 = this.field_c.optionList.getSelectedOption(-6508);
          if (var8 != null) {
            var9 = var8.toString();
            this.field_c.font.b(var9, 2 + var6_int, -1 + var7 + (widget.height + this.field_c.font.field_H >> 1), 10000536, -1);
            if (this.field_c.a(false) &&
              var9.startsWith(this.field_c.typedPrefix)) {
              var10 = this.field_c.font.a(this.field_c.typedPrefix);
              SoftwareRaster.b(var6_int + 2, 2 + var7, var10, -4 + widget.height, 2188450, 100);
            }
          }
          SoftwareRaster.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("fk.C(");
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    final static byte[] a(boolean param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = sb.field_e.getFileByName(param1, 74, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static bq[] a(int param0, CipherPacketBuffer param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        bq[] var4 = null;
        int var6_int = 0;
        bq var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        bq[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.readBits(114, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (bq[]) (stackIn_3_0);
          }
          var3 = param1.readBits(55, param0);
          var4 = new bq[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (vq.a(param1, -2)) {
              var6 = new bq();
              param1.readBits(60, 24);
              param1.readBits(-107, 24);
              var6.field_e = param1.readBits(-115, 24);
              param1.readBits(param0 - 127, 9);
              param1.readBits(-105, 12);
              param1.readBits(44, 12);
              param1.readBits(125, 12);
              var4[var5] = var6;
            } else {
              var6_int = param1.readBits(82, cu.a(3, var5 - 1));
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("fk.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(byte param0, java.applet.Applet param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            try {
              var3 = (String) (lj.a("getcookies", (byte) -105, param1));
              if (param0 < 76) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var4 = dj.a(97, ';', var3);
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("fk.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "This game has been updated! Please reload this page.";
        field_g = "Players";
        field_a = "No";
        matchupDamagePercent = new int[][]{new int[]{50, 25, 50, 50, 25, 50, 90, 50}, new int[]{90, 50, 90, 50, 25, 50, 90, 50}, new int[]{50, 25, 50, 90, 90, 50, 90, 50}, new int[]{90, 90, 25, 25, 90, 50, 90, 50}, new int[]{90, 90, 50, 90, 50, 50, 90, 50}, new int[]{50, 50, 50, 50, 50, 50, 50, 50}, new int[]{50, 50, 50, 50, 50, 50, 90, 50}, new int[]{90, 90, 90, 90, 90, 90, 90, 90}};
        field_e = "Find opponent";
    }
}
