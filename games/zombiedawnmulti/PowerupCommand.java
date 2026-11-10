/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerupCommand extends IntrusiveNode {
    static int field_i;
    int targetOid;
    static int[] field_o;
    int powerupLevel;
    int executeTick;
    static IndexedSprite field_m;
    static String field_l;
    int extraArgument;
    static boolean field_p;
    int powerupType;
    static String field_j;
    int player;

    final static void openMessageDialog(String param0, boolean param1, int param2) {
        try {
          ClockAndScreenHelpers.field_h = param1;
          MusicPatchEnvelope.field_f = true;
          PortalView.field_L = new MessageDialog(DialogLayerHolder.field_a, LevelFileList.field_d, param0, IntrusiveDequeCursor.field_e, ClockAndScreenHelpers.field_h);
          DialogLayerHolder.field_a.showDialog(3016, PortalView.field_L);
          if (param2 <= 89) {
            field_j = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_j = null;
        if (!param0) {
          field_m = null;
          field_o = null;
          field_l = null;
          return;
        }
        String var2 = (String) null;
        PowerupCommand.openMessageDialog((String) null, false, 17);
        field_m = null;
        field_o = null;
        field_l = null;
    }

    PowerupCommand(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.extraArgument = param5;
        this.powerupLevel = param3;
        this.powerupType = param2;
        this.targetOid = param4;
        this.executeTick = param0;
        this.player = param1;
    }

    static {
        field_l = "This will help you organise your horde. Use CTRL + '1', '2' or '3' to set unit groups, then press '1', '2' or '3' to quickly select each group.";
        field_p = true;
        field_j = "Allow spectators?";
    }
}
