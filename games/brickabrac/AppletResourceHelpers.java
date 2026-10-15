/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AppletResourceHelpers {
    static String[] field_e;
    static ValidationStatus validationEmpty;
    static String field_b;
    static RgbSprite field_d;
    static RgbSprite[] field_c;
    static String field_a;

    final static IndexedSprite loadIndexedSpriteByName(byte obfuscationGuard, ResourceArchive archive, String fileName, String groupName) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = archive.getGroupId(groupName, false);
          if (obfuscationGuard != 29) {
            field_a = (String) null;
          }
          var5 = archive.getFileId(var4_int, -86, fileName);
          stackIn_3_0 = SecondaryNodeQueue.loadIndexedSprite(0, var4_int, var5, archive);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uo.F(").append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (fileName == null) {
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        DualLinkDeque.a(param0, param1);
        AppletFlowHelpers.a((byte) -25, param0);
    }

    final static void sendTableRequest(TableDataRequest request, int opcode, byte obfuscationGuard) {
        BitPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = TextFieldValidator.outgoingPackets;
          var3.writeCipheredOpcode(-13413, opcode);
          var3.writeByte(58, 5);
          var3.writeByte(obfuscationGuard ^ -55, 0);
          var3.writeShort((byte) 120, request.tableId);
          var3.writeByte(-116, request.rowLimit);
          var3.writeByte(-99, request.columnCount);
          if (obfuscationGuard == 68) {
            return;
          }
          field_d = (RgbSprite) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("uo.B(");
          if (request == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(opcode).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        validationEmpty = null;
        field_b = null;
        if (param0 >= 32) {
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        }
        AppletResourceHelpers.a((byte) 51);
        field_d = null;
        field_e = null;
        field_a = null;
    }

    final static boolean hasTuhstatbutMarker(java.applet.Applet applet, byte obfuscationGuard) {
        try {
          int cookieIndex = 0;
          String markerName = null;
          int unusedGuardQuotient = 0;
          String cookieText = null;
          String[] cookieParts = null;
          int equalsIndex = 0;
          int unusedGameFlag = 0;
          boolean appletMarkerPresent = false;
          RuntimeException failureContext = null;
          StringBuilder contextBuilder = null;
          String appletSummary = null;
          Throwable caughtFailure = null;
          Throwable ignoredBrowserFailure = null;
          RuntimeException markerFailure = null;
          unusedGameFlag = BrickABrac.field_J ? 1 : 0;
          try {
            if (StateIconLabel.tuhstatbutMarkerSet) {
              return true;
            }
            try {
              unusedGuardQuotient = 98 / ((89 - obfuscationGuard) / 35);
              markerName = "tuhstatbut";
              cookieText = (String) (AppletJavaScriptBridge.callFunctionWithoutArguments("getcookies", -126, applet));
              cookieParts = FarmBackground.splitPreservingEmptyParts((byte) -103, cookieText, ';');
              for (cookieIndex = 0; cookieParts.length > cookieIndex; cookieIndex++) {
                equalsIndex = cookieParts[cookieIndex].indexOf('=');
                if (equalsIndex >= 0 &&
                  cookieParts[cookieIndex].substring(0, equalsIndex).trim().equals(markerName)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable caughtBrowserFailure) {
              caughtFailure = caughtBrowserFailure;
              ignoredBrowserFailure = caughtFailure;
            }
            appletMarkerPresent = (null != applet.getParameter("tuhstatbut"));
            return appletMarkerPresent;
          } catch (java.lang.RuntimeException caughtMarkerFailure) {
            caughtFailure = caughtMarkerFailure;
            markerFailure = (RuntimeException) (Object) caughtFailure;
            failureContext = markerFailure;
            contextBuilder = new StringBuilder().append("uo.D(");
            if (applet == null) {
              appletSummary = "null";
            } else {
              appletSummary = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(appletSummary).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    final static boolean isBitClear(int bitIndex, byte obfuscationGuard, int[] words) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 93 % ((obfuscationGuard + 19) / 40);
          stackIn_3_0 = (0 == (words[bitIndex >> 5] & 1 << (31 & bitIndex)));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uo.C(").append(bitIndex).append(',').append(obfuscationGuard).append(',');
          if (words == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        validationEmpty = new ValidationStatus();
        field_b = "Aftertouch: flight control.";
        field_a = "Loading levels";
    }
}
