/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    static String[] field_e;
    static qh field_f;
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
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        DualLinkDeque.a(param0, param1);
        nk.a((byte) -25, param0);
    }

    final static void a(eg param0, int param1, byte param2) {
        BitPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = k.outgoingPackets;
          var3.writeCipheredOpcode(-13413, param1);
          var3.writeByte(58, 5);
          var3.writeByte(param2 ^ -55, 0);
          var3.writeShort((byte) 120, param0.field_l);
          var3.writeByte(-116, param0.field_q);
          var3.writeByte(-99, param0.field_p);
          if (param2 == 68) {
            return;
          }
          field_d = (RgbSprite) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("uo.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        if (param0 >= 32) {
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        }
        uo.a((byte) 51);
        field_d = null;
        field_e = null;
        field_a = null;
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
          int var6 = 0;
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var8 = BrickABrac.field_J ? 1 : 0;
          try {
            if (ni.field_Sb) {
              return true;
            }
            try {
              var3 = 98 / ((89 - param1) / 35);
              var2 = "tuhstatbut";
              var4 = (String) (ne.a("getcookies", -126, param0));
              var5 = qb.a((byte) -103, var4, ';');
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("uo.D(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw qb.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_f = new qh();
        field_b = "Aftertouch: flight control.";
        field_a = "Loading levels";
    }
}
