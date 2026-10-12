/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends IntrusiveNode {
    static rf field_v;
    static String field_s;
    static String field_t;
    static int field_u;
    static int[] field_D;
    static String field_B;
    static String[] field_r;
    int field_p;
    static int field_q;
    static String field_A;
    int field_x;
    static int[] field_w;
    static SceneWidget field_C;
    static kg field_y;
    static int[] field_o;
    static String field_z;

    final static String a(String param0, int param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        ah var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param2);
          if (!ArchiveProvider.a(param3, var8)) {
            stackIn_3_0 = en.field_a;
            return stackIn_3_0;
          }
          if (2 != qc.field_P) {
            stackIn_6_0 = ql.field_Zb;
            return stackIn_6_0;
          }
          var7 = da.a(param0, (byte) -41);
          if (var7 == null) {
            stackIn_10_0 = db.a(ui.field_W, -42, new String[]{param0});
            return stackIn_10_0;
          }
          var7.unlink(4);
          var7.unlinkDual(480);
          cc.field_gc = cc.field_gc - 1;
          var5 = mm.field_g;
          var5.writeCipheredOpcode(param1, (byte) -117);
          var5.position = var5.position + 1;
          var6 = var5.position;
          var5.writeByte((byte) 124, 3);
          var5.a(param2, -121);
          var5.b((byte) 116, var5.position - var6);
          stackIn_12_0 = null;
          return (String) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rn.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_D = null;
        field_t = null;
        field_w = null;
        field_o = null;
        field_A = null;
        field_C = null;
        field_r = null;
        field_s = null;
        field_y = null;
        field_v = null;
        field_B = null;
        if (param0 == 3) {
          field_z = null;
          return;
        }
        rn.d(-70);
        field_z = null;
    }

    final static boolean a(byte param0) {
        if (param0 != -14) {
          field_r = (String[]) null;
          if (rb.field_h == null) {
            return false;
          }
          if (field_v.b(122)) {
            return true;
          }
          return false;
        }
        if (rb.field_h == null) {
          return false;
        }
        if (field_v.b(122)) {
          return true;
        }
        return false;
    }

    final static int c(byte param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var1_int = 0;
          while (dl.f(22759)) {
            se.field_c.a(true);
            if (!se.field_c.c(0)) {
              continue;
            }
            var1_int = 1;
          }
          se.field_c.a(127, se.a((byte) 32, oh.field_f, pi.field_c), se.a((byte) 32, oa.field_S, rj.field_j));
          if (param0 != 90) {
            stackIn_8_0 = -55;
            return stackIn_8_0;
          }
          if (se.field_c.c(0)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            se.field_c.field_e >= 0) {
            var2 = cb.field_c[se.field_c.field_e];
            if (2 == var2) {
              gf.c(-95);
            }
          }
          stackIn_17_0 = var2;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "rn.B(" + param0 + ')');
        }
    }

    private rn() throws Throwable {
        throw new Error();
    }

    static {
        field_r = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to SteelSentinelsText.text_benefits."};
        field_B = "Discard Progress";
        field_A = "Join";
        field_D = new int[4];
        field_w = new int[8192];
        field_t = "Loading sound effects";
        field_o = new int[]{108, -1, 34, 4, 14, 9, 16, -1, -1, -1, -1};
        field_z = "OVER <%0>";
        field_s = "To Customer Support";
    }
}
