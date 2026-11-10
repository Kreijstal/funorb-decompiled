/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DetonationTarget extends IntrusiveNode {
    static RankingEntry[] field_j;
    static String field_h;
    int field_f;
    static ResourceArchive field_g;
    SimEntity field_m;
    static String field_n;
    static String field_k;
    static QuickChatCommandType field_i;
    static Sprite field_l;

    public static void releaseStatics(int param0) {
        field_l = null;
        field_g = null;
        field_i = null;
        field_n = null;
        field_h = null;
        field_k = null;
        field_j = null;
        if (param0 != 21342) {
          DetonationTarget.releaseStatics(-3);
        }
    }

    final static QuickChatCategoryDefinition findFirstActiveDefinition(boolean param0) {
        int var1_int = 0;
        QuickChatCategoryDefinition stackIn_2_0 = null;
        QuickChatCategoryRegistry stackIn_5_0 = null;
        QuickChatCategoryDefinition stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        QuickChatCategoryDefinition var2 = null;
        try {
          var1_int = 0;
          if (param0) {
            stackIn_2_0 = (QuickChatCategoryDefinition) null;
            return stackIn_2_0;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        stackIn_5_0 = ViewportController.field_p;
        try {
          while (true) {
            var2 = ((QuickChatCategoryRegistry) (Object) stackIn_5_0).getCategory(var1_int, 32767);
            if (var2.field_y) {
              stackIn_8_0 = var2;
              return stackIn_8_0;
            }
            var1_int++;
            stackIn_5_0 = ViewportController.field_p;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    DetonationTarget(SimEntity param0, int param1) {
        try {
          this.field_m = param0;
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        int var0 = 0;
        field_h = "Beguile them... The carrot may work better than the stick.";
        field_j = new RankingEntry[255];
        field_n = "Detonate a zombie to stun anything close to it.";
        field_k = "Only show lobby chat from my friends";
        for (var0 = 0; var0 < field_j.length; var0++) {
          field_j[var0] = new RankingEntry();
        }
        field_i = new QuickChatCommandType(11, 0, 1, 2);
        Random discarded$0 = new Random();
    }
}
