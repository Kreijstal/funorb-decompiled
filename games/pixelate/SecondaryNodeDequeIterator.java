/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    static String field_a;
    private DualLinkNode field_e;
    static int[] field_c;
    private SecondaryNodeDeque field_d;
    private DualLinkNode field_f;
    static String field_b;

    public final Object next() {
        Object var1 = this.field_f;
        if (var1 == this.field_d.field_a) {
          this.field_f = null;
          var1 = null;
        } else {
          this.field_f = ((DualLinkNode) (var1)).secondaryNext;
        }
        this.field_e = (DualLinkNode) (var1);
        return var1;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = 121 / ((-48 - param0) / 51);
    }

    final static void setLegacyMenuFrameAndPadding(int param0, int param1, int param2, NineSliceFrame param3) {
        try {
          MouseWheelHandler.field_d = param1;
          if (param2 != 7) {
            NineSliceFrame var5 = (NineSliceFrame) null;
            SecondaryNodeDequeIterator.setLegacyMenuFrameAndPadding(-44, 85, 83, (NineSliceFrame) null);
          }
          NodeHashTable.field_c = param3;
          AudioService.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "nb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        return this.field_d.field_a != this.field_f;
    }

    public final void remove() {
        if (this.field_e == null) {
          throw new IllegalStateException();
        }
        this.field_e.unlinkSecondary(17);
        this.field_e = null;
    }

    final static void buildSkinTileSprites(int param0, Sprite[] param1, byte param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        Sprite[] var6 = null;
        Sprite[] var7 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 != -53) {
            field_b = (String) null;
          }
          if (null == DateInputWidget.field_L) {
            DateInputWidget.field_L = PieceTiming.field_e;
          }
          var6 = new Sprite[]{param1[0], param1[1]};
          var7 = var6;
          var4 = BlastFromThePastBackground.field_m[param0];
          if (param0 == 0) {
            Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new GreenGrowTheRushesBackground(var4, var6));
            return;
          }
          if (1 == param0) {
            Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new TwistedLogicBackground(var4, var7));
            return;
          }
          if (param0 == 2) {
            Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new NightToRememberBackground(var4, var7));
            return;
          }
          if (param0 == 3) {
            Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new AcidSunsetBackground(var4, var7));
            return;
          }
          if (param0 == 4) {
            Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new KiteBackground(var4, var7));
            return;
          }
          if (param0 == 5) {
            Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new BouncedownBackground(var4, var7));
            return;
          }
          if (param0 == 6) {
            Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new EmergentBehaviourBackground(var4, var7));
            return;
          }
          if (param0 != 7) {
            return;
          }
          Js5NetworkRequest.field_C[param0] = (BackgroundScene) ((Object) new BlastFromThePastBackground(var4, var7));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("nb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.field_e = null;
        try {
          this.field_d = param0;
          this.field_f = this.field_d.field_a.secondaryNext;
          this.field_e = null;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
    }
}
