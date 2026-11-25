/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProjectsWindowSupport {
    static AccountRequestResult field_a;

    final static void cacheClientSeedBytes(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (null != vc.field_a) {
            try {
              vc.field_a.seek((byte) -26, 0L);
              vc.field_a.write(param0 + 84, 24, SpriteWipeSupport.field_a.position, SpriteWipeSupport.field_a.payload);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              SpriteWipeSupport.field_a.position = SpriteWipeSupport.field_a.position + param0;
              return;
            }
          }
          SpriteWipeSupport.field_a.position = SpriteWipeSupport.field_a.position + param0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void drawPlainHexagonPanel(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        LobbyUiSupport.drawHexagonPanel(false, param4, param1, -12394, param5, param3, param0);
        if (!param2) {
          field_a = (AccountRequestResult) null;
        }
    }

    final static FrameTimer createFrameTimer(int param0) {
        int var1 = 55 / ((param0 - 37) / 59);
        return (FrameTimer) ((Object) new NanoFrameTimer());
    }

    final static MenuWindow createProjectsWindow(byte param0) {
        NotificationEntry.field_k = new MenuWindow(250, 60, 150, 186, MouseWheelInput.field_c.toUpperCase());
        MenuButton var1 = new MenuButton(-16 + (NotificationEntry.field_k.field_k + NotificationEntry.field_k.field_m), NotificationEntry.field_k.field_t + 2, 11, 11, -1, (Sprite) null, "X", 16711680);
        var1.field_h = NotificationEntry.field_k;
        NotificationEntry.field_k.addChild(var1, 8);
        MenuList var2 = new MenuList(9 + NotificationEntry.field_k.field_k, 20 + NotificationEntry.field_k.field_t, 132, 158);
        NotificationEntry.field_k.addChild(var2, 8);
        NotificationEntry.field_k.field_z = var2;
        ProjectsContent var3 = new ProjectsContent();
        int var4 = -110 % ((param0 + 14) / 61);
        NotificationEntry.field_k.field_x = (MenuContent) ((Object) var3);
        return NotificationEntry.field_k;
    }

    public static void clearStatics(byte param0) {
        if (param0 != -29) {
          field_a = (AccountRequestResult) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
