/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveProvider {
    static vd field_d;
    static SceneWidget field_f;
    static RgbSprite field_e;
    static int[] field_c;
    static RgbSprite field_b;
    static IndexedSprite[] field_a;

    abstract ArchiveIndex getIndex(byte obfuscationGuard);

    final static boolean a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          if (!SocketJs5Transport.a(param1, 4, param0)) {
            return false;
          }
          var2_int = 0;
          while (true) {
            if (param1.length() <= var2_int) {
              return true;
            }
            if (IconTextComponent.a((byte) -30, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("fa.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(char param0, int param1) {
        if (param1 != 29448) {
          CharSequence var3 = (CharSequence) null;
          ArchiveProvider.a(true, (CharSequence) null);
          return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    abstract int getGroupProgress(boolean obfuscationGuard, int groupId);

    final static boolean a(int param0) {
        if (param0 != 38) {
          field_b = (RgbSprite) null;
          return !uc.field_g ? true : false;
        }
        return !uc.field_g ? true : false;
    }

    final static void a(byte param0) {
        SentinelAnimationEditor.field_a[44] = 71;
        SentinelAnimationEditor.field_a[93] = 43;
        SentinelAnimationEditor.field_a[59] = 57;
        SentinelAnimationEditor.field_a[46] = 72;
        SentinelAnimationEditor.field_a[91] = 42;
        if (param0 >= 106) {
          SentinelAnimationEditor.field_a[222] = 58;
          SentinelAnimationEditor.field_a[192] = 28;
          SentinelAnimationEditor.field_a[520] = 59;
          SentinelAnimationEditor.field_a[47] = 73;
          SentinelAnimationEditor.field_a[45] = 26;
          SentinelAnimationEditor.field_a[92] = 74;
          SentinelAnimationEditor.field_a[61] = 27;
          return;
        }
        ArchiveProvider.a(-119);
        SentinelAnimationEditor.field_a[222] = 58;
        SentinelAnimationEditor.field_a[192] = 28;
        SentinelAnimationEditor.field_a[520] = 59;
        SentinelAnimationEditor.field_a[47] = 73;
        SentinelAnimationEditor.field_a[45] = 26;
        SentinelAnimationEditor.field_a[92] = 74;
        SentinelAnimationEditor.field_a[61] = 27;
    }

    abstract byte[] getEncodedGroup(int groupId, int obfuscationGuard);

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param0) {
          SoftwareRaster.c(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j, 0, 192);
          if (param1 <= 32) {
            field_d = (vd) null;
            wn.a(0, param0);
            return;
          }
          wn.a(0, param0);
          return;
        }
        SoftwareRaster.clear();
        if (param1 <= 32) {
          field_d = (vd) null;
          wn.a(0, param0);
          return;
        }
        wn.a(0, param0);
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (param0 != 38) {
          field_b = (RgbSprite) null;
        }
    }

    static {
        field_c = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_d = new vd();
    }
}
