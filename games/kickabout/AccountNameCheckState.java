/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AccountNameCheckState {
    static IntrusiveDeque field_a;
    static String field_b;
    static int field_c;

    final static void advanceLoadingStep(int param0, int param1) {
        if (param1 > PlayerArchetypeSortCriterion.field_r) {
          PlayerArchetypeSortCriterion.field_r = param1;
          NineSlicePanelPainter.field_c = MarkerSliderWidget.field_I[ProxySocketConnector.nextBoundedInt(115, MarkerSliderWidget.field_I.length, MidiPcmStream.field_l)];
          DelayedServerPacket.a(1, param0 + 9863, param0);
          return;
        }
    }

    final static int firstQuadrantAngle(int param0, int param1, int param2) {
        if (param1 != 11277) {
          return -52;
        }
        if (param2 < param0) {
          return 2048 - LeagueWinnerDialog.atanFixedPoint((param2 << 16) / param0, 15832);
        }
        return LeagueWinnerDialog.atanFixedPoint((param0 << 16) / param2, param1 ^ 4565);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -5) {
          field_c = -62;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean canShowQueuedDialog(byte param0) {
        int var1;
        int var1Lifetime1;
        if (param0 == 82) {
          if (null != MachineTokenStorageSupport.field_e &&
            5 == MachineTokenStorageSupport.field_e.matchState.phase) {
            return true;
          }
          if (MachineTokenStorageSupport.field_e == null &&
            null == GameModesHelpScreen.field_G) {
            var1 = AuctionLogEntry.field_h.screenId;
            if (-5 == var1) {
              return false;
            }
            return true;
          }
          return false;
        }
        field_b = (String) null;
        if (null != MachineTokenStorageSupport.field_e &&
          5 == MachineTokenStorageSupport.field_e.matchState.phase) {
          return true;
        }
        if (MachineTokenStorageSupport.field_e != null) {
          return false;
        }
        if (null != GameModesHelpScreen.field_G) {
          return false;
        }
        var1Lifetime1 = AuctionLogEntry.field_h.screenId;
        if (-5 == var1Lifetime1) {
          return false;
        }
        return true;
    }

    static {
        field_b = "Refresh Auctions";
        field_a = new IntrusiveDeque();
    }
}
