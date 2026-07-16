/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static ut field_a;
    static String field_c;
    static String field_b;

    final static ut a(byte param0, String param1, sj param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.b(param1, -1);
        var5 = param2.a((byte) -95, param3, var4);
        if (param0 <= 96) {
          field_b = null;
          return ju.a(var4, var5, param2, (byte) -9);
        } else {
          return ju.a(var4, var5, param2, (byte) -9);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = -128 / ((param0 - 30) / 42);
        field_b = null;
    }

    final static ot a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        ut var6 = null;
        ot var7 = null;
        ut var8 = null;
        ot var9 = null;
        var5 = Kickabout.field_G;
        if (param0 >= -89) {
          wa.b((byte) 1);
          var6 = new ut(108, 108);
          iw.a(-118, var6);
          on.d(54, 54, 51, 255);
          on.d(54, 54, 43, 0);
          ts.a(param1, 0, 124);
          ta.e(117);
          var7 = new ot(54, 54);
          iw.a(-92, (ut) (Object) var7);
          var6.f(0, 0);
          ta.e(119);
          var4 = 0;
          L0: while (true) {
            if (var7.field_y.length <= var4) {
              return var7;
            } else {
              var7.field_y[var4] = hf.a(var7.field_y[var4] << -639117096, 1118668);
              var4++;
              continue L0;
            }
          }
        } else {
          var8 = new ut(108, 108);
          iw.a(-118, var8);
          on.d(54, 54, 51, 255);
          on.d(54, 54, 43, 0);
          ts.a(param1, 0, 124);
          ta.e(117);
          var9 = new ot(54, 54);
          iw.a(-92, (ut) (Object) var9);
          var8.f(0, 0);
          ta.e(119);
          var4 = 0;
          L1: while (true) {
            if (var9.field_y.length <= var4) {
              return var9;
            } else {
              var9.field_y[var4] = hf.a(var9.field_y[var4] << -639117096, 1118668);
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void b(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = Kickabout.field_G;
        var7 = qe.field_b;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        var2 = 0;
        if (param0 > -84) {
          field_b = null;
          var3 = var7.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$32 = var2;
              var2++;
              var5[incrementValue$32] = 0;
              int incrementValue$33 = var2;
              var2++;
              var5[incrementValue$33] = 0;
              int incrementValue$34 = var2;
              var2++;
              var5[incrementValue$34] = 0;
              int incrementValue$35 = var2;
              var2++;
              var5[incrementValue$35] = 0;
              int incrementValue$36 = var2;
              var2++;
              var5[incrementValue$36] = 0;
              int incrementValue$37 = var2;
              var2++;
              var5[incrementValue$37] = 0;
              int incrementValue$38 = var2;
              var2++;
              var5[incrementValue$38] = 0;
              int incrementValue$39 = var2;
              var2++;
              var5[incrementValue$39] = 0;
              continue L0;
            }
          }
        } else {
          var3 = var7.length;
          L1: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              int incrementValue$40 = var2;
              var2++;
              var5[incrementValue$40] = 0;
              int incrementValue$41 = var2;
              var2++;
              var5[incrementValue$41] = 0;
              int incrementValue$42 = var2;
              var2++;
              var5[incrementValue$42] = 0;
              int incrementValue$43 = var2;
              var2++;
              var5[incrementValue$43] = 0;
              int incrementValue$44 = var2;
              var2++;
              var5[incrementValue$44] = 0;
              int incrementValue$45 = var2;
              var2++;
              var5[incrementValue$45] = 0;
              int incrementValue$46 = var2;
              var2++;
              var5[incrementValue$46] = 0;
              int incrementValue$47 = var2;
              var2++;
              var5[incrementValue$47] = 0;
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0, String param1) {
        wp.field_h = param1;
        fp.field_e = 1;
        if (param0 != 52) {
            ot discarded$0 = wa.a(34, 19);
            et.field_b = true;
            return;
        }
        et.field_b = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ut(96, 100);
        field_c = "Waiting for <%0> to start the game...";
        field_b = "The online auction system is a marketplace where your characters can be traded with other FunOrb players.<br><col=ffff00>Note: Auctions may not appear in the system for a few minutes after they are created.</col>";
    }
}
