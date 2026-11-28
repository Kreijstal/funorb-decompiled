/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rl extends oh {
    static String field_f;
    static ResourceArchive field_i;
    static String field_g;
    static int field_h;

    rl() {
    }

    final static void d(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        try {
          var1 = tp.field_f;
          while (cn.b(114)) {
            var1.d(param0 ^ 8, 8);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            FrameTimer.a(var1, -9129);
            tp.field_f.backpatchByteLength((byte) 47, var1.position - var2);
          }
          if (param0 == 0) {
            return;
          }
          field_g = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.wrapClientException((Throwable) ((Object) var1_ref), "rl.K(" + param0 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        if (param0 < -53) {
          return param1 ? 16 : 4;
        }
        this.a((byte) 90, false);
        return param1 ? 16 : 4;
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        int var1 = -1 % ((57 - param0) / 63);
    }

    final static nd c(int param0) {
        if (null == PauseMenu.field_i) {
          PauseMenu.field_i = new nd();
          PauseMenu.field_i.a(ai.field_h, false);
          PauseMenu.field_i.field_l = 6;
          PauseMenu.field_i.field_g = 5;
          PauseMenu.field_i.field_c = 7697781;
          PauseMenu.field_i.field_j = 4;
          PauseMenu.field_i.field_f = 14;
          PauseMenu.field_i.field_d = 0;
          PauseMenu.field_i.field_h = 2763306;
          PauseMenu.field_i.field_m = ba.field_i;
          if (param0 == -9918) {
            return PauseMenu.field_i;
          }
          return (nd) null;
        }
        if (param0 == -9918) {
          return PauseMenu.field_i;
        }
        return (nd) null;
    }

    final static int c(byte param0) {
        if (param0 < 58) {
          rl.releaseDeclaredStaticReferences(-15);
          return gp.field_a;
        }
        return gp.field_a;
    }

    final int a(int param0, int param1) {
        if (param0 == 1843275042) {
          return q.field_a[ma.field_n[param1]].field_e[0];
        }
        rl.b(117, (byte) -122);
        return q.field_a[ma.field_n[param1]].field_e[0];
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        InteractiveWidget.field_y = 0;
        lo.field_b = null;
        rc.field_a = ModalDialogHost.field_z[param1];
        CrystalTile.field_o = param1;
        if (param1 == 0) {
          vh.field_a = true;
        }
        uo.field_o = param2;
        dk.field_h = param2;
        mb.field_g = 25;
        ob.field_l = 10;
        wd.field_j = 60;
        fn.field_j = 8;
        if (param0 == 26) {
          je.field_j = DisplayNameSelectionPanel.field_F;
          LevelProgressUpdate.field_h = sm.field_f;
          b.field_a = MusicPatchPcmStream.field_n;
          fp.field_a = LabeledWidgetContainer.field_F;
          var3 = param2;
          mb.field_g = mb.field_g + var3;
          AccountCreationResultPanel.n(-26);
          MouseInputHandler.field_b = null;
          Bzip2State.field_n = 0;
          gh.field_C = 0;
          return;
        }
    }

    final static int b(int param0, byte param1) {
        param0 = param0 & 8191;
        if (param1 != -23) {
          return 95;
        }
        if (param0 >= 4096) {
          return param0 >= 6144 ? -fe.field_h[-param0 + 8192] : -fe.field_h[param0 - 4096];
        }
        return param0 >= 2048 ? fe.field_h[-param0 + 4096] : fe.field_h[param0];
    }

    static {
        field_f = "Email is valid";
        field_g = "This is a rock.<br><br>You can push rocks.<br><br>Rocks fall if they are<br>unsupported. They also<br>roll off curved edges<br>and round objects.<br><br>Occasionally, you may need to push a rock while it is falling. Move out of the way to let it fall, and then push it. You must be quick!";
    }
}
