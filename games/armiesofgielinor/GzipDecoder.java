/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecoder {
    private java.util.zip.Inflater inflater;
    static int[][] field_b;
    static QuickChatCommandDefinition field_e;
    static String field_c;
    static int decodedSpriteCanvasWidth;

    final static void a(int param0, ResourceArchive param1) {
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (param0 != 32381) {
            String var5 = (String) null;
            GzipDecoder.findFriend((String) null, (byte) 32);
          }
          var2 = new RgbSprite(param1.getFileByName("", 49, "final_frame.jpg"), (java.awt.Component) ((Object) IndexedSpriteBase.field_b));
          var3 = var2.pixelWidth;
          var4 = var2.pixelHeight;
          ConsoleTextNode.pushRasterState((byte) -56);
          AccountRequestResult.field_k = new RgbSprite(var3, 3 * var4 / 4);
          AccountRequestResult.field_k.bindAsRasterTarget();
          var2.drawPixels(0, 0);
          SpriteControlNode.field_k = new RgbSprite(var3, var4 - AccountRequestResult.field_k.pixelHeight);
          SpriteControlNode.field_k.bindAsRasterTarget();
          var2.drawPixels(0, -AccountRequestResult.field_k.pixelHeight);
          SpriteControlNode.field_k.offsetY = AccountRequestResult.field_k.pixelHeight;
          QuickChatPhraseRepository.popRasterState(-18862);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public GzipDecoder() {
        this(-1, 1000000, 1000000);
    }

    final static SocialListEntry findFriend(String name, byte obfuscationGuard) {
        String nameKey = null;
        SocialListEntry friend = null;
        String candidateNameKey = null;
        int obfuscationControl = 0;
        CharSequence nameCharacters = null;
        CharSequence candidateCharacters = null;
        Object stackIn_7_0 = null;
        SocialListEntry stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (DiskCacheRequest.friendsByName == null) {
            return null;
          }
          if (name == null) {
            return null;
          }
          if (0 == name.length()) {
            stackIn_7_0 = null;
            return (SocialListEntry) (stackIn_7_0);
          }
          nameCharacters = (CharSequence) ((Object) name);
          nameKey = AccountNameNormalizer.normalize(nameCharacters, false);
          if (obfuscationGuard != -34) {
            GzipDecoder.a((byte) 5);
          }
          if (nameKey == null) {
            return null;
          }
          friend = (SocialListEntry) (DiskCacheRequest.friendsByName.get((byte) -27, (long)nameKey.hashCode()));
          while (friend != null) {
            candidateCharacters = (CharSequence) ((Object) friend.displayName);
            candidateNameKey = AccountNameNormalizer.normalize(candidateCharacters, false);
            if (candidateNameKey.equals(nameKey)) {
              stackIn_19_0 = friend;
              return stackIn_19_0;
            }
            friend = (SocialListEntry) (DiskCacheRequest.friendsByName.getNextMatch(-348));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("lg.D(");
          if (name == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private GzipDecoder(int param0, int param1, int param2) {
    }

    final void decompress(byte obfuscationGuard, PacketBuffer source, byte[] output) {
        try {
          Exception exception = null;
          RuntimeException var4 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (source.payload[source.position] == 31 &&
              -117 == source.payload[source.position + 1]) {
              if (null == this.inflater) {
                this.inflater = new java.util.zip.Inflater(true);
              }
              try {
                this.inflater.setInput(source.payload, source.position + 10, source.payload.length + (-10 - source.position - 8));
                this.inflater.inflate(output);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.inflater.reset();
                throw new RuntimeException("");
              }
              this.inflater.reset();
              if (obfuscationGuard == -71) {
                return;
              }
              this.inflater = (java.util.zip.Inflater) null;
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var4;
            stackIn_14_1 = new StringBuilder().append("lg.C(").append(obfuscationGuard).append(',');
            if (source == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (output == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -40) {
            stackIn_2_0 = -71;
            return stackIn_2_0;
          }
          if (param1) {
            stackIn_7_0 = AiInfluenceMap.field_h.textWidth(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = TaggedMapData.field_b.textWidth(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lg.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = (int[][]) null;
        if (param0 >= 78) {
          field_c = null;
          return;
        }
        String var2 = (String) null;
        GzipDecoder.findFriend((String) null, (byte) 37);
        field_c = null;
    }

    static {
        field_e = new QuickChatCommandDefinition(9, 0, 4, 1);
        field_c = "Skip battles: ";
    }
}
