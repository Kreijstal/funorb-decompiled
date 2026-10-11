/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static he[] field_d;
    static fi field_e;
    static nh field_b;
    static he field_c;
    static he[] field_a;
    static int[] field_g;
    static int field_f;

    final static vj a(int param0, int param1) {
        if (param0 != 3) {
          return (vj) null;
        }
        return na.a(true, param1, false, false, true, 1);
    }

    final static na a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          na var5 = null;
          fa var5_ref = null;
          int var6 = 0;
          na stackIn_1_0 = null;
          fa stackIn_3_0 = null;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var6 = -16 / ((param0 - 42) / 58);
              var4 = Class.forName("rj");
              var5 = (na) (var4.newInstance());
              var5.a(param1, param3, (byte) -49, param2);
              stackIn_1_0 = var5;
              return stackIn_1_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new fa();
              ((na) ((Object) var5_ref)).a(param1, param3, (byte) -35, param2);
              stackIn_3_0 = var5_ref;
              return (na) ((Object) stackIn_3_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var4_ref2;
            stackIn_6_1 = new StringBuilder().append("al.F(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          field_e = (fi) null;
        }
        field_a = null;
        field_g = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var1 = 2 != gf.field_b ? 24 : 23;
        ul.field_j[3] = new int[]{6, var1};
        int var2 = th.field_a[3].field_e.field_f;
        th.field_a[3] = new ld(3);
        if (param0 >= -24) {
          field_f = 16;
        }
        th.field_a[3].field_e.field_f = var2;
    }

    final static String a(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var6 = "(" + l.field_q + " " + gg.field_l + " " + ek.field_h + ") " + t.field_b;
        var1 = var6;
        if (param0 > -43) {
          field_d = (he[]) null;
        }
        if (gf.field_C > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < gf.field_C; var2++) {
            var7 = var1 + ' ';
            var3 = dh.field_N.field_h[var2] & 255;
            var4 = var3 >> 4;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var3 = var3 & 15;
            var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param1 < 56) {
              return;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(kk.a(var2, param0, 4767999), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("al.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new he[4];
        field_g = new int[20];
    }
}
