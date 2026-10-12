/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static ClientConnectionState field_b;
    static int[][][] instructionIllustrationArguments;

    final static void c(int param0) {
        DualLinkedNode var1 = null;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        DualLinkedNode var1Lifetime1;
        try {
          vl.field_p = null;
          dj.field_a = 0;
          vg.field_p = 0;
          wh.field_c.b(126);
          ot.field_E.b(81);
          var1 = DiskCacheRequest.field_K.a((byte) 66);
          while (var1 != null) {
            var1.unlinkSecondary((byte) -76);
            var1 = DiskCacheRequest.field_K.c(1);
          }
          if (param0 > -112) {
            da.a(89, true);
          }
          var1Lifetime1 = bk.field_a.a((byte) 66);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkSecondary((byte) -76);
            var1Lifetime1 = bk.field_a.c(1);
          }
          th.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "da.I(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        if (null == vi.field_a ||
          0 == vi.field_a.length) {
          return;
        }
        if (param1 < 0 ||
          param1 >= vi.field_a.length) {
          return;
        }
        RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(106, vi.field_a[param1]);
        if (param0 > -22) {
          da.b(0);
        }
    }

    final static void a(int param0) {
        mv.field_d = ByteStorage.incomingPacket.g(1);
        if (param0 <= 10) {
          String[] var2 = (String[]) null;
          da.a(70, 41, (String[][]) null, (String[]) null, 94);
        }
        CharSequence var3 = (CharSequence) ((Object) mv.field_d);
        IntPair.field_p = k.a(var3, false);
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_20_0 = false;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            if (NodeDeque.field_a) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (lj.a("getcookies", (byte) 81, param1));
              var4 = dj.a(29, ';', var3);
              if (param0 != 23660) {
                instructionIllustrationArguments = (int[][][]) null;
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_20_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_20_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var2_ref2;
            stackIn_23_1 = new StringBuilder().append("da.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          instructionIllustrationArguments = (int[][][]) null;
        }
        instructionIllustrationArguments = (int[][][]) null;
        field_b = null;
    }

    final static void a(int param0, int param1, String[][] param2, String[] param3, int param4) {
        int var6 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param0 = Battlefield.b(param0, param4, -4);
          var5_int = param2[param0].length;
          for (var6 = param1; var6 < var5_int; var6++) {
            var7 = var6;
            var8 = jj.a((byte) 103, var7, param2, param0);
            var9 = t.a(var8, param3, (byte) 118);
            BestScoreStrategy.unitAnimationVariants[param4][param0][var7] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("da.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -10820) {
          field_b = (ClientConnectionState) null;
        }
        if (jj.b((byte) -73)) {
          param1 = false;
        }
        TileMetadata.a(5295, param1);
        jg.a((byte) 102);
    }

    final static void b(int param0) {
        t.field_c = kv.k(5);
        KingBlackDragonEvent.field_C = new gk();
        if (param0 != -2) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          da.a(43, (java.applet.Applet) null);
        }
        td.a(true, true, param0 + 25);
    }

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        on var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rs var5_ref_rs = null;
        int[] var6 = null;
        int var8 = 0;
        CipherPacketBuffer var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9 = ByteStorage.incomingPacket;
          var2 = var9.readUnsignedByte(0);
          if (param0 >= -77) {
            return;
          }
          var3 = var9.readUnsignedByte(0);
          if (0 == var2) {
            var4 = (on) (StateChangeMarker.field_t.first((byte) 96));
            if (var4 == null) {
              dj.a((byte) -124);
              return;
            }
            var5 = fk.packetPayloadLength - var9.position;
            var11 = var4.field_m;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.readUnsignedByte(0) << rn.a(var7 << 8, 768));
            }
            var4.unlink(-116);
            return;
          }
          if (1 == var2) {
            var4_int = var9.readSignedSmart(100);
            var5_ref_rs = (rs) (gg.field_F.first((byte) 107));
            while (var5_ref_rs != null) {
              if (var5_ref_rs.field_r != var3 ||
                var4_int != var5_ref_rs.field_l) {
                var5_ref_rs = (rs) (gg.field_F.next((byte) 123));
                continue;
              }
              break;
            }
            if (var5_ref_rs != null) {
              var5_ref_rs.unlink(-105);
              return;
            }
            dj.a((byte) -125);
            return;
          }
          af.a((Throwable) null, 70, "LR1: " + CampaignProgress.b(false));
          dj.a((byte) -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "da.G(" + param0 + ')');
        }
    }

    static {
        field_b = new ClientConnectionState();
        instructionIllustrationArguments = new int[][][]{new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -1, 0, 3}}, new int[][]{new int[]{-2, -1, 0, 3, -2, -2}}, new int[][]{new int[]{-2, -1, 0, 3, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -1, 3, -1, 3}, new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -1, 0, 3, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}};
    }
}
