/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lg {
    private java.util.zip.Inflater field_a;
    static int[][] field_b;
    static QuickChatCommandDefinition field_e;
    static String field_c;
    static int field_d;

    final static void a(int param0, ResourceArchive param1) {
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (param0 != 32381) {
            String var5 = (String) null;
            lg.a((String) null, (byte) 32);
          }
          var2 = new RgbSprite(param1.getFileByName("", 49, "final_frame.jpg"), (java.awt.Component) ((Object) IndexedSpriteBase.field_b));
          var3 = var2.pixelWidth;
          var4 = var2.pixelHeight;
          rq.a((byte) -56);
          wd.field_k = new RgbSprite(var3, 3 * var4 / 4);
          wd.field_k.b();
          var2.f(0, 0);
          vt.field_k = new RgbSprite(var3, var4 - wd.field_k.pixelHeight);
          vt.field_k.b();
          var2.f(0, -wd.field_k.pixelHeight);
          vt.field_k.offsetY = wd.field_k.pixelHeight;
          QuickChatPhraseRepository.b(-18862);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public lg() {
        this(-1, 1000000, 1000000);
    }

    final static hl a(String param0, byte param1) {
        String var2 = null;
        hl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        hl stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (DiskCacheRequest.field_K == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (0 == param0.length()) {
            stackIn_7_0 = null;
            return (hl) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = k.a(var6, false);
          if (param1 != -34) {
            lg.a((byte) 5);
          }
          if (var2 == null) {
            return null;
          }
          var3 = (hl) (DiskCacheRequest.field_K.a((byte) -27, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Mb);
            var4 = k.a(var7, false);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (hl) (DiskCacheRequest.field_K.d(-348));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("lg.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private lg(int param0, int param1, int param2) {
    }

    final void a(byte param0, PacketBuffer param1, byte[] param2) {
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
            if (param1.payload[param1.position] == 31 &&
              -117 == param1.payload[param1.position + 1]) {
              if (null == this.field_a) {
                this.field_a = new java.util.zip.Inflater(true);
              }
              try {
                this.field_a.setInput(param1.payload, param1.position + 10, param1.payload.length + (-10 - param1.position - 8));
                this.field_a.inflate(param2);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_a.reset();
                throw new RuntimeException("");
              }
              this.field_a.reset();
              if (param0 == -71) {
                return;
              }
              this.field_a = (java.util.zip.Inflater) null;
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var4;
            stackIn_14_1 = new StringBuilder().append("lg.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param2 == null) {
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
            stackIn_7_0 = AiInfluenceMap.field_h.a(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = TaggedMapData.field_b.a(param0);
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
        lg.a((String) null, (byte) 37);
        field_c = null;
    }

    static {
        field_e = new QuickChatCommandDefinition(9, 0, 4, 1);
        field_c = "Skip battles: ";
    }
}
