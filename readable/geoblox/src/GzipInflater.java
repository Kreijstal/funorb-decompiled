/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipInflater {
    static int field_d;
    static ResourceArchive field_a;
    static int field_k;
    private static ck field_h;
    static MusicScore field_e;
    static IndexedSprite sunBackgroundSprite;
    static int field_f;
    private java.util.zip.Inflater inflater;
    static boolean field_b;
    static int field_g;
    static float avatarTintGreenDelta;

    public static void c(int param0) {
        field_h = null;
        int var1 = 122 % ((param0 + 22) / 63);
        sunBackgroundSprite = null;
        field_e = null;
        field_a = null;
    }

    final void inflateInto(int methodGuard, ByteArrayBuffer buffer, byte[] destination) {
        try {
            Exception inflateException = null;
            RuntimeException inflateFailureForContext = null;
            RuntimeException inflateFailureBeforeContext = null;
            StringBuilder inflateMessagePrefix = null;
            String bufferDescription = null;
            StringBuilder inflateMessageBeforeDestination = null;
            String destinationDescription = null;
            Throwable caughtInflateFailure = null;
            try {
              if ((buffer.bytes[buffer.position] == 31) &&
                  (-117 == buffer.bytes[1 + buffer.position])) {
                if (this.inflater == null) {
                  this.inflater = new java.util.zip.Inflater(true);
                }
                try {
                  this.inflater.setInput(buffer.bytes, buffer.position + 10, buffer.bytes.length - 8 - (buffer.position + 10));
                  if (methodGuard != -1) {
                    GzipInflater.a(76);
                  }
                  this.inflater.inflate(destination);
                } catch (java.lang.Exception inflateOperationException) {
                  caughtInflateFailure = inflateOperationException;
                  inflateException = (Exception) (Object) caughtInflateFailure;
                  this.inflater.reset();
                  throw new RuntimeException("");
                }
                this.inflater.reset();
                return;
              }
              throw new RuntimeException("");
            } catch (java.lang.RuntimeException inflateFailure) {
              caughtInflateFailure = inflateFailure;
              inflateFailureForContext = (RuntimeException) (Object) caughtInflateFailure;
              inflateFailureBeforeContext = inflateFailureForContext;
              inflateMessagePrefix = new StringBuilder().append("fe.D(").append(methodGuard).append(',');
              if (buffer == null) {
                bufferDescription = "null";
              } else {
                bufferDescription = "{...}";
              }
              inflateMessageBeforeDestination = ((StringBuilder) (Object) inflateMessagePrefix).append(bufferDescription).append(',');
              if (destination == null) {
                destinationDescription = "null";
              } else {
                destinationDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) inflateFailureBeforeContext), ((StringBuilder) (Object) inflateMessageBeforeDestination).append(destinationDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedInflateFailure) {
            throw uncheckedInflateFailure;
        } catch (Throwable checkedInflateFailure) {
            throw new RuntimeException(checkedInflateFailure);
        }
    }

    final static int b(int param0) {
        if (param0 <= 103) {
            return 4;
        }
        return qe.field_a;
    }

    final static ck[] a(int param0) {
        if (param0 == -1) {
            return new ck[]{InstrumentNoteMask.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, SpriteState.field_t, qj.field_a, DropTargetWidget.field_B, IntKeyLookup.field_d, bd.field_c, va.field_f, field_h};
        }
        avatarTintGreenDelta = -1.1302366256713867f;
        return new ck[]{InstrumentNoteMask.field_g, w.field_d, ab.field_c, wg.field_d, lj.field_e, s.field_E, cd.field_i, SpriteState.field_t, qj.field_a, DropTargetWidget.field_B, IntKeyLookup.field_d, bd.field_c, va.field_f, field_h};
    }

    public GzipInflater() {
        this(-1, 1000000, 1000000);
    }

    final static nd a(String param0, boolean param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        nd var7 = null;
        int var8 = 0;
        nd stackIn_3_0 = null;
        nd stackIn_6_0 = null;
        nd stackIn_10_0 = null;
        nd stackIn_13_0 = null;
        nd stackIn_19_0 = null;
        nd stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          if (param1) {
            stackIn_3_0 = (nd) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = InstrumentNoteMask.field_f;
            return stackIn_6_0;
          }
          if (255 < var2_int) {
            stackIn_10_0 = ButtonWidget.field_x;
            return stackIn_10_0;
          }
          var3 = uj.a('.', true, param0);
          if (var3.length < 2) {
            stackIn_13_0 = InstrumentNoteMask.field_f;
            return stackIn_13_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = jk.a(255, var6);
            if (var7 != null) {
              stackIn_19_0 = var7;
              return stackIn_19_0;
            }
          }
          stackIn_22_0 = mj.a(var3[-1 + var3.length], (byte) -97);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("fe.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private GzipInflater(int unusedFirstArgument, int unusedSecondArgument, int unusedThirdArgument) {
    }

    static {
        field_d = -1;
        field_f = 7;
        field_h = new ck(15, 0, 1, 0);
    }
}
