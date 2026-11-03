/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrinketPickerDialog extends MessageDialog {
    static String[] field_G;
    static Sprite field_J;
    static UiLayoutNode field_F;
    static String field_H;
    private UiLayoutNode field_K;
    private TrinketIcon[] field_I;

    public static void g(int param0) {
        field_J = null;
        if (param0 != 2) {
          field_H = (String) null;
        }
        field_F = null;
        field_G = null;
        field_H = null;
    }

    TrinketPickerDialog() {
        super(27);
        TrinketIcon var3 = null;
        int incrementValue$0 = 0;
        this.field_K = new UiLayoutNode();
        this.field_I = new TrinketIcon[ok.field_a.a(false)];
        int var1 = 0;
        oi var2 = (oi) (ok.field_a.g(24009));
        while (var2 != null) {
          var3 = new TrinketIcon(var2.field_j);
          var3.field_J = var3.field_mb * (var1 / 5);
          var3.field_s = var1 % 5 * var3.field_q;
          this.field_K.addChild((byte) -107, (UiLayoutNode) (var3));
          incrementValue$0 = var1;
          var1++;
          this.field_I[incrementValue$0] = var3;
          var2 = (oi) (ok.field_a.c(33));
        }
        this.field_K.a(true, 300, 100, 80, 200);
    }

    final int dialogHeight(byte param0) {
        if (param0 < 75) {
          return 97;
        }
        return 320;
    }

    final int dialogWidth(int param0) {
        if (param0 != -1379118556) {
          this.field_I = (TrinketIcon[]) null;
        }
        return 470;
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param1 <= 40) {
          TrinketPickerDialog.a(-66, -60, false, 126);
        }
        if (param3 == 0 ||
          param3 == 1 ||
          !param2) {
          if (0 == param0) {
            return 2;
          }
          if (param0 == 1) {
            return 1;
          }
          if (2 == param0) {
            return 3;
          }
        }
        if (param3 == 2) {
          return 4;
        }
        if (param3 != 3) {
          return 0;
        }
        return 6;
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var11 = 0;
        TrinketIcon var6;
        int var12;
        TrinketIcon[] var13;
        String[] var7;
        int var8;
        int var9;
        int var10;
        var12 = Kickabout.field_G;
        super.a((byte) -68, param1, param2);
        var13 = this.field_I;
        for (var5 = 0; var13.length > var5; var5++) {
          var6 = var13[var5];
          if (var6 != null &&
            var6.field_gb) {
            SoftwareRasterizer.a(var6.field_F, var6.field_T, var6.field_q, var6.field_mb, 8, 65793, 128);
            SoftwareRasterizer.f(var6.field_F, var6.field_T, var6.field_q, var6.field_mb, 8, 6710886);
            ArchivePreloader.field_i[PacketBuffer.field_e[var6.field_Bb]].c(64 + param1, param2 + 70);
            un.field_d.d(kw.field_c[var6.field_Bb].toLowerCase(), (ArchivePreloader.field_i[PacketBuffer.field_e[var6.field_Bb]].field_q >> 1) + (64 + param1), 205 + param2, 16777215, -1);
            var7 = new String[16];
            var8 = un.field_d.wrapText(ProxyAuthenticationRequiredException.field_a[var6.field_Bb], new int[]{240}, var7);
            var9 = 0;
            var10 = un.field_d.field_p + un.field_d.field_L;
            for (var11 = 0; var11 < var8; var11++) {
              un.field_d.a(var7[var11].toLowerCase(), -20 + param1, var9 + 162 + param2, 300, 100, 11184810, -1, 1, 1, 0);
              var9 = var9 + var10;
            }
          }
        }
        this.field_K.field_J = param2 + 70;
        this.field_K.field_s = 245 + param1;
        if (param0 >= -11) {
          field_H = (String) null;
        }
        this.field_K.a(79, false);
    }

    final void a(int param0, boolean param1) {
        if (param0 != 3) {
          field_H = (String) null;
        }
        this.field_K.b(0, param1);
    }

    final void handleResult(int param0, int param1) {
        super.handleResult(82, param1);
        if (param0 < 60) {
          this.handleResult(-61, -29);
        }
    }

    static {
        field_H = "select a <%0> auction";
    }
}
