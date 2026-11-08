/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Cloud {
    double field_m;
    static int field_j;
    int field_n;
    double field_e;
    int field_a;
    static volatile int field_o;
    int field_c;
    static String field_k;
    static FloatingSquare[] field_d;
    int field_l;
    static ScrollContainer field_b;
    int field_f;
    static ConnectionState field_q;
    static Sprite[] field_i;
    static SceneWidget field_h;
    static int[] field_g;
    static String field_s;
    static String field_p;
    int field_t;
    static boolean[][] field_r;

    final void respawn(byte param0) {
        this.field_c = -60 + JavaRandomHelpers.randomBelow(CredentialKind.field_b, -126, 480);
        this.field_l = JavaRandomHelpers.randomBelow(CredentialKind.field_b, -126, 50);
        this.field_e = (double)this.field_l / 100.0 + 0.3;
        int var2 = -112 / ((-40 - param0) / 47);
        this.field_t = (int)(this.field_e * 256.0);
        this.field_a = (int)(200.0 * (0.2 + this.field_e));
        this.field_f = (int)((this.field_e + 0.2) * 120.0);
        this.field_n = JavaRandomHelpers.randomBelow(CredentialKind.field_b, -108, 2);
        if (JavaRandomHelpers.randomBelow(CredentialKind.field_b, -126, 2) != 1) {
          this.field_m = (double)(-this.field_a);
        } else {
          this.field_e = -this.field_e;
          this.field_m = 640.0;
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_i = null;
        field_k = null;
        field_s = null;
        field_h = null;
        if (param0 != -1345) {
          return;
        }
        field_d = null;
        field_r = (boolean[][]) null;
        field_g = null;
        field_q = null;
        field_p = null;
    }

    final static String describePacketHistory(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = Pixelate.field_H ? 1 : 0;
        var6 = "(" + BirthDateEntryPanel.field_G + " " + ReportAbuseHelpers.field_d + " " + MarkerSlider.field_U + ") " + TextLayoutLine.field_e;
        var1 = var6;
        if (0 < BackgroundScene.field_b) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < BackgroundScene.field_b; var2++) {
            var7 = var1 + ' ';
            var1 = var7;
            var3 = 255 & MusicCrossfadeStream.field_o.payload[var2];
            var4 = var3 >> 4;
            if (10 <= var4) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var3 = var3 & 15;
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        if (param0 >= -4) {
          Cloud.describePacketHistory(-28);
        }
        return var1;
    }

    Cloud() {
        this.respawn((byte) -107);
        this.field_m = (double)(JavaRandomHelpers.randomBelow(CredentialKind.field_b, -114, 640) - 100);
    }

    static {
        field_k = "<%0> must play 1 more rated game before playing with the current options.";
        field_d = new FloatingSquare[24];
        field_o = 0;
        field_q = new ConnectionState();
        field_p = "From only <%0>/month";
        field_s = "Challenge Mode";
    }
}
