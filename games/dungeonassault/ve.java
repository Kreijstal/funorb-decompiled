/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    int field_b;
    static ad field_e;
    int field_f;
    static volatile boolean field_a;
    int field_d;
    static String field_c;

    final static boolean a(boolean param0) {
        if (param0) {
          ve.a(false);
          if (!ed.c(true)) {
            return pb.field_G <= 0 ? true : false;
          }
          return true;
        }
        if (ed.c(true)) {
          return true;
        }
        if (pb.field_G > 0) {
          return false;
        }
        return true;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        this.field_d = param1;
        this.field_f = param3;
        this.field_b = param0;
        if (param2 >= 72) {
          return;
        }
        field_e = (ad) null;
    }

    final void b(boolean param0) {
        int var5 = DungeonAssault.field_K;
        if (!param0) {
          return;
        }
        while (((Math.abs(this.field_d) | Math.abs(this.field_f) | Math.abs(this.field_b)) & -65536) != 0) {
          this.field_f = this.field_f >> 1;
          this.field_d = this.field_d >> 1;
          this.field_b = this.field_b >> 1;
        }
        int var2 = this.c(false) >> 1;
        int var3 = 15;
        while (65536 <= var2) {
          var3--;
          var2 = var2 >> 1;
        }
        this.field_d = (this.field_d << var3) / var2;
        this.field_f = (this.field_f << var3) / var2;
        this.field_b = (this.field_b << var3) / var2;
        int var4 = this.c(false);
        if (var4 < 64512) {
          throw new RuntimeException();
        }
        if (66560 >= var4) {
          return;
        }
        throw new RuntimeException();
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 >= -92) {
          ve.a(42);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static String a(int param0, long param1, int param2, int param3, boolean param4) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var6;
        int var7;
        int var8;
        StringBuilder var9;
        int var10;
        int var11;
        int var12;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = DungeonAssault.field_K;
        var6 = 44;
        var7 = 46;
        if (param3 == 0) {
          var7 = 44;
          var6 = 46;
        }
        if (param3 == 2) {
          var7 = 160;
        }
        var8 = 0;
        if (param1 < 0L) {
          param1 = -param1;
          var8 = 1;
        }
        var9 = new StringBuilder(26);
        if (param0 > 0) {
          for (var10 = 0; param0 > var10; var10++) {
            var11 = (int)param1;
            param1 = param1 / 10L;
            discarded$1 = var9.append((char)(-(10 * (int)param1) + (var11 + 48)));
          }
          discarded$0 = var9.append((char) var6);
        }
        var10Lifetime1 = 0;
        while (true) {
          var11Lifetime1 = (int)param1;
          param1 = param1 / 10L;
          discarded$2 = var9.append((char)(48 - (-var11Lifetime1 + 10 * (int)param1)));
          if (param1 != 0L) {
            if (!param4) {
              continue;
            }
            var10Lifetime1++;
            if (0 != var10Lifetime1 % 3) {
              continue;
            }
            discarded$3 = var9.append((char) var7);
            continue;
          }
          break;
        }
        if (param2 == -17311) {
          if (var8 != 0) {
            discarded$5 = var9.append('-');
          }
          return var9.reverse().toString();
        }
        field_a = true;
        if (var8 != 0) {
          discarded$4 = var9.append('-');
        }
        return var9.reverse().toString();
    }

    private final int c(boolean param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0) {
          this.a(56, -92, 125, -12);
          var2 = (this.field_b >> 2) * (this.field_b >> 2) + (this.field_f >> 2) * (this.field_f >> 2) + (this.field_d >> 2) * (this.field_d >> 2);
          if (var2 >= 0) {
            return ug.a(!param0 ? true : false, var2) << 2;
          }
          throw new RuntimeException();
        }
        var2Lifetime1 = (this.field_b >> 2) * (this.field_b >> 2) + (this.field_f >> 2) * (this.field_f >> 2) + (this.field_d >> 2) * (this.field_d >> 2);
        if (var2Lifetime1 >= 0) {
          return ug.a(!param0 ? true : false, var2Lifetime1) << 2;
        }
        throw new RuntimeException();
    }

    ve(int param0, int param1, int param2) {
        this.a(param2, param0, 124, param1);
    }

    static {
        field_e = new ad(11, 0, 1, 2);
        field_a = false;
        field_c = "Please log in as a subscribing member to access this feature.";
    }
}
