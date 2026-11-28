/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ModalDialogHost extends SingleChildWidgetContainer {
    static int[] field_F;
    static RgbSprite field_G;
    static String field_H;
    private IntrusiveDeque field_I;

    final void showDialog(UiWidget param0, int param1) {
        ModalDialog var3 = null;
        if (!(param0 instanceof ModalDialog)) {
          throw new IllegalArgumentException();
        }
        if (param1 != -1) {
          return;
        }
        try {
          var3 = (ModalDialog) (param0);
          this.field_I.addLast(var3, false);
          var3.field_T = true;
          var3.takeFocus(34, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "ji.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = DungeonAssault.field_K;
        if (this.field_o != null) {
          this.field_o.paintWidget((byte) 34, (UiWidget) (this), param1, param3, true);
        }
        dj var5 = new dj(this.field_I);
        if (param2 != 0) {
          this.field_I = (IntrusiveDeque) null;
        }
        UiWidget var6 = (UiWidget) (var5.b(-1225818257));
        while (var6 != null) {
          var6.drawWidget(param0, param1 + this.field_q, 0, param3 + this.field_v);
          var6 = (UiWidget) (var5.d(1834857157));
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
          return 48;
        }
        return uj.a(ld.field_f, 37, 1 - param2 + param0) + param2;
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          if (param1 > -30) {
            field_G = (RgbSprite) null;
          }
          try {
            if (!PlatformTaskDispatcher.field_n.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param0.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2_ref2;
          stackIn_24_1 = new StringBuilder().append("ji.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final void advanceDialogs(boolean param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_I);
        if (!param0) {
          ModalDialogHost.a(-59, true, -77);
        }
        ModalDialog var3 = (ModalDialog) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) -90)) {
            var3.unlink(false);
          }
          var3 = (ModalDialog) (var2.c(17756));
        }
        this.field_D = (UiWidget) ((Object) this.getTopOpenDialog(32));
    }

    public ModalDialogHost() {
        super(0, 0, hn.field_t, ArchiveRequest.field_x, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_I = new IntrusiveDeque();
    }

    final void snapAndPruneDialogs(int param0) {
        int var4 = DungeonAssault.field_K;
        dj var2 = new dj(this.field_I);
        if (param0 != -33) {
          ModalDialogHost.a(-41, true, -105);
        }
        ModalDialog var3 = (ModalDialog) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.snapDialogAnimation(462)) {
            var3.unlink(false);
          }
          var3 = (ModalDialog) (var2.c(17756));
        }
    }

    final UiWidget getFocusedChild(int param0) {
        dj var2;
        ModalDialog var3;
        int var4;
        UiWidget var5;
        var4 = DungeonAssault.field_K;
        if (param0 != 1) {
          var5 = (UiWidget) null;
          this.showDialog((UiWidget) null, 10);
        }
        var2 = new dj(this.field_I);
        var3 = (ModalDialog) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.field_T) {
            return var3.getFocusedChild(param0 - 20312);
          }
          var3 = (ModalDialog) (var2.c(param0 + 17755));
        }
        return null;
    }

    final void closeAllDialogs(int param0) {
        int var4 = DungeonAssault.field_K;
        if (param0 != 1) {
          field_F = (int[]) null;
        }
        dj var2 = new dj(this.field_I);
        ModalDialog var3 = (ModalDialog) (var2.a(-479592473));
        while (var3 != null) {
          var3.field_T = false;
          var3 = (ModalDialog) (var2.c(param0 ^ 17757));
        }
        this.field_D = null;
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_H = null;
        field_G = null;
        if (param0 != -98) {
          ModalDialogHost.clearDeclaredStaticReferences((byte) -89);
        }
        field_F = null;
    }

    final ModalDialog getTopOpenDialog(int param0) {
        dj var2;
        ModalDialog var3;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param0 != 32) {
          return (ModalDialog) null;
        }
        var2 = new dj(this.field_I);
        var3 = (ModalDialog) (var2.a(-479592473));
        while (var3 != null) {
          if (var3.field_T) {
            return var3;
          }
          var3 = (ModalDialog) (var2.c(17756));
        }
        return null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_F = new int[32];
        for (var0 = 0; var0 < 32; var0++) {
          var1 = var0 * 1 + 32;
          field_F[var0] = 65793 * var1;
        }
        field_H = "You have collected <%0> consecutive bounties";
    }
}
