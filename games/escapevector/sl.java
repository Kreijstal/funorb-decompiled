/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl {
    static String[] field_c;
    static UiTheme field_d;
    static long field_a;
    static Sprite[][] field_b;

    public static void releaseStatics(int guard) {
        field_c = null;
        if (guard == 127) {
          field_b = (Sprite[][]) null;
          field_d = null;
          return;
        }
        sl.a((ResourceArchive) null, (ResourceArchive) null, (int[]) null, (byte[][][]) null, -11, 8);
        field_b = (Sprite[][]) null;
        field_d = null;
    }

    final static byte[][][] a(ResourceArchive param0, ResourceArchive param1, int[] param2, byte[][][] param3, int param4, int param5) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var6_int = dh.field_e.length;
          if (param3 == null) {
            param3 = new byte[var6_int][][];
          }
          int var7 = param5;
          while (var7 < var6_int) {
            int var8 = dh.field_e[var7];
            if ((param4 == var8 ||
              var10 != 0) && (param3[var7] == null ||
              var10 != 0)) {
              byte[][] var12 = ol.a(-51, param1, param2, var7, param0);
              param3[var7] = var12;
            }
            var7++;
            if (var10 == 0) {
              continue;
            }
            break;
          }
          byte[][][] stackIn_14_0 = (byte[][][]) (param3);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var6;
          StringBuilder stackIn_17_1 = new StringBuilder().append("sl.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static gi a(boolean param0, int param1) {
        int[] stackIn_26_0 = null;
        int var7 = EscapeVector.obfuscationControl;
        CipherPacketBuffer var2 = QuickChatDynamicCommand.incomingPackets;
        int var3 = var2.readUnsignedByte(0);
        DualLinkNode.field_o = var3 & 127;
        boolean stackIn_3_0 = (0 != (128 & var3));
        DualLinkDequeIterator.field_c = stackIn_3_0;
        MarkerSliderPainter.field_g = var2.readUnsignedByte(0);
        TextFieldValidator.field_e = var2.readLong(-800509813);
        if (DualLinkNode.field_o != 2) {
          ProxyAuthenticationException.field_a = 0;
          IntKeyLookup.field_d = 0;
        } else {
          IntKeyLookup.field_d = var2.readUnsignedShort(1952);
          ProxyAuthenticationException.field_a = var2.readUnsignedMedium((byte) -119);
          if (var7 != 0) {
            ProxyAuthenticationException.field_a = 0;
            IntKeyLookup.field_d = 0;
          }
        }
        boolean stackIn_11_0 = !(var2.readUnsignedByte(param1 ^ param1) != 1);
        boolean var4 = stackIn_11_0;
        gm.field_e = var2.readString(false);
        if (var4) {
          DualLinkDequeIterator.field_g = var2.readString(false);
        } else {
          DualLinkDequeIterator.field_g = gm.field_e;
          if (var7 != 0) {
            DualLinkDequeIterator.field_g = var2.readString(false);
          }
        }
        if (1 == DualLinkNode.field_o) {
          var2.readUnsignedShort(1952);
          var2.readString(false);
        } else if (DualLinkNode.field_o == 4) {
          var2.readUnsignedShort(1952);
          var2.readString(false);
        }
        if (!param0) {
          SelfDestructEffects.field_d = SpriteOffset.a(var2, 10241, 80);
          bo.field_H = null;
          return new gi(param0);
        }
        int var5 = var2.readUnsignedShort(1952);
        try {
          QuickChatPhraseDefinition var8 = EmailSyntaxValidator.field_s.a(var5, (byte) -126);
          SelfDestructEffects.field_d = var8.previewText(-4);
          if (DualLinkDequeIterator.field_g.equals(ThreeSliceButtonPainter.field_r)) {
            stackIn_26_0 = null;
          } else {
            stackIn_26_0 = var8.responseIds;
          }
          bo.field_H = stackIn_26_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var6 = (Exception) (Object) decompiledCaughtException;
          pf.a(false, "CC1", (Throwable) ((Object) var6));
          bo.field_H = null;
          SelfDestructEffects.field_d = null;
        }
        if (var7 == 0) {
          return new gi(param0);
        }
        SelfDestructEffects.field_d = SpriteOffset.a(var2, 10241, 80);
        bo.field_H = null;
        return new gi(param0);
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          if (sk.field_d == null) {
            sk.field_d = MouseWheelInput.field_c.a(ej.field_b, 4, IntrusiveDeque.field_h);
          }
          if (param1 != 0) {
            field_b = (Sprite[][]) null;
          }
          if (sk.field_d.field_f == 0) {
            return false;
          }
          long dupTemp$1 = td.b(128);
          le.field_c = dupTemp$1;
          field_a = dupTemp$1;
          if (sk.field_d.field_f != 1) {
            al.field_d = ak.field_d;
          } else {
            try {
              TextLayout.field_c = new pj((java.net.Socket) (sk.field_d.field_b), MouseWheelInput.field_c);
              QuickChatDynamicCommand.outgoingPackets.position = 0;
              CipherPacketBuffer var4 = QuickChatDynamicCommand.incomingPackets;
              CipherPacketBuffer var5 = var4;
              al.field_d = sf.field_d;
              var5.position = 0;
              int stackIn_11_0 = (!param0) ? -1 : -2;
              NetworkGameClient.field_q = stackIn_11_0;
              ArchiveIndex.field_t = stackIn_11_0;
              jj.field_b = stackIn_11_0;
              wc.a(rd.field_a, ac.field_b, true, DropTargetWidget.field_D, QuickChatDynamicCommand.outgoingPackets);
              ClientException.a(-1, 30785);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              IOException var2 = (IOException) (Object) decompiledCaughtException;
              al.field_d = ak.field_d;
              if (EscapeVector.obfuscationControl == 0) {
                sk.field_d = null;
                return true;
              }
              al.field_d = ak.field_d;
              sk.field_d = null;
              return true;
            }
          }
          sk.field_d = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = new Sprite[7][4];
    }
}
