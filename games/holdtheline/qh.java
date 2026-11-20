/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String[] field_b;
    static String field_a;
    static String field_d;
    static String field_e;
    static String field_c;

    final static void a(int param0, int param1) {
        if (ValidationHelpWidget.field_Q != null &&
          null != i.field_k[param1]) {
          EmailValidationResult.field_d = i.field_k[param1];
          ResourceArchive.playMusicTrack(false, i.field_k[param1], (byte) 69, 30);
        } else {
          if (AccountProgressDialog.field_jb == -1) {
            WeightedLruCache.field_e = 2;
            AccountProgressDialog.field_jb = param1;
          }
        }
        if (param0 != 0) {
          field_a = (String) null;
        }
    }

    final static boolean a(byte param0, GrowableObjectList param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        GrowableObjectList var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          if (param0 != -63) {
            var4 = (GrowableObjectList) null;
            qh.a((byte) -114, (GrowableObjectList) null);
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= param1.size) {
              return false;
            }
            if (((BoundaryCurve) (param1.elements[var2_int])).field_q) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("qh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 30) {
          return;
        }
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static PcmStreamMixer a(int param0) {
        if (param0 < 80) {
          qh.a(67);
        }
        return LoginChoicePanel.field_H;
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = MusicCrossfadeStream.field_n;
        synchronized (var1_ref) {
          if (qd.field_i == BoundaryCurve.field_l) {
            return false;
          }
          DelayedServerPacket.field_n = IndexedSpriteState.field_a[BoundaryCurve.field_l];
          LoginChoicePanel.field_M = d.field_b[BoundaryCurve.field_l];
          if (param0 >= -23) {
            return false;
          }
          BoundaryCurve.field_l = 127 & 1 + BoundaryCurve.field_l;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    static {
        field_a = "Touring Car";
        field_d = null;
        field_e = "Leaderboard";
        field_c = "Log in";
    }
}
