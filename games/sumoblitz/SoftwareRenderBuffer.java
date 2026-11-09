/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SoftwareRenderBuffer implements RenderBuffer {
    int width;
    int height;

    final static void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        int var2 = 0;
        int var3Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime8;
        int var2Lifetime9;
        int var2Lifetime10;
        int var2Lifetime11;
        int var2Lifetime12;
        int var2Lifetime13;
        if (param1 > 8) {
          var3 = param0;
          if (var3 == 1) {
            var2 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2]);
            return;
          }
          if (var3 == 2) {
            var2Lifetime8 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2Lifetime8]);
            return;
          }
          if (var3 == 3) {
            var2Lifetime9 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2Lifetime9]);
            return;
          }
          if (var3 == 0) {
            var2Lifetime10 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2Lifetime10]);
            return;
          }
          if (4 == var3) {
            var2Lifetime11 = ExpandingRingEffect.nextRandomInt(5, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(80, TimedSceneEffect.field_n[2][var2Lifetime11]);
            return;
          }
          if (var3 != 6) {
            if (var3 == 5) {
              var2Lifetime12 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
              PlayerDrone.playSample(78, TimedSceneEffect.field_n[0][var2Lifetime12]);
              return;
            }
            return;
          }
          var2Lifetime13 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(78, TimedSceneEffect.field_n[0][var2Lifetime13]);
          return;
        }
        SoftwareRenderBuffer.a(71);
        var3Lifetime1 = param0;
        if (var3Lifetime1 == 1) {
          var2Lifetime1 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2Lifetime1]);
          return;
        }
        if (var3Lifetime1 == 2) {
          var2Lifetime2 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2Lifetime2]);
          return;
        }
        if (var3Lifetime1 == 3) {
          var2Lifetime3 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2Lifetime3]);
          return;
        }
        if (var3Lifetime1 == 0) {
          var2Lifetime4 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(91, TimedSceneEffect.field_n[1][var2Lifetime4]);
          return;
        }
        if (4 == var3Lifetime1) {
          var2Lifetime5 = ExpandingRingEffect.nextRandomInt(5, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(80, TimedSceneEffect.field_n[2][var2Lifetime5]);
          return;
        }
        if (var3Lifetime1 != 6) {
          if (var3Lifetime1 == 5) {
            var2Lifetime6 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(78, TimedSceneEffect.field_n[0][var2Lifetime6]);
            return;
          }
          return;
        }
        var2Lifetime7 = ExpandingRingEffect.nextRandomInt(8, HardwareGraphicsHeap.field_o, (byte) -96);
        PlayerDrone.playSample(78, TimedSceneEffect.field_n[0][var2Lifetime7]);
    }

    final static void a(int param0) {
        RenderPresentationException.field_a.closeAllDialogs((byte) 117);
        if (param0 == 5178) {
          if (HardwareGraphicsHeap.field_n == null) {
            HardwareGraphicsHeap.field_n = new ProgressDialog(RenderPresentationException.field_a, SocketJs5Client.field_s);
          }
          RenderPresentationException.field_a.pushDialog((byte) 115, HardwareGraphicsHeap.field_n);
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 >= -50) {
          return;
        }
        try {
          if (11 == jv.field_a) {
            tu.a((byte) -126);
          }
          VertexStreamLayout.a(hn.field_k, ContentTransitionDialog.field_R, ch.field_h, 122);
          IterableNodeHashTable.a(0, 0, param1, (byte) 124);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "od.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    SoftwareRenderBuffer(int width, int height) {
        this.width = width;
        this.height = height;
    }

    static {
    }
}
