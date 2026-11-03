/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private String field_c;
    static int field_f;
    static Sprite field_e;
    static int field_d;
    private boolean field_a;
    static int field_b;

    final static MenuList a(int param0, byte param1, int param2, ProjectsContent param3) {
        String dupTemp$1 = null;
        RuntimeException var4 = null;
        MenuLabel var5 = null;
        b var6 = null;
        SpriteButton var7 = null;
        SpriteButton var8 = null;
        MenuLabel var9 = null;
        PcmSample var10 = null;
        MenuList var11 = null;
        MenuList var12 = null;
        MenuList stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new MenuList(0, 0, 132, 40);
          var12 = var11;
          if (param1 > -22) {
            var10 = (PcmSample) null;
            e.a(-126, -120, (PcmSample) null);
          }
          param3.field_c[param2] = var11;
          var5 = new MenuLabel(132 - rs.field_Cb.stringWidth(or.field_d[param2]), 0, or.field_d[param2]);
          var12.addChild(var5, 8);
          var6 = new b(d.field_b[param2].field_z / 2, rs.field_Cb.field_J + 2, 132 - d.field_b[param2].field_z / 2, d.field_b[param2].field_w, 2, 2105376);
          var12.addChild(var6, 8);
          var7 = new SpriteButton(3 * d.field_b[param2].field_z / 4, rs.field_Cb.field_J + 5, UsernameAvailabilityValidator.a(param2, param0, true));
          var12.addChild(var7, 8);
          var8 = new SpriteButton(0, 2 + rs.field_Cb.field_J, d.field_b[param2]);
          var12.addChild(var8, 8);
          if (param0 != 5) {
            dupTemp$1 = QuickChatCategoryRegistry.a(ur.field_yb, 4371, new String[]{Integer.toString(param0)});
            var8.field_o = dupTemp$1;
            var7.field_o = dupTemp$1;
            var6.field_o = dupTemp$1;
            var5.field_o = dupTemp$1;
            var12.field_o = dupTemp$1;
          } else {
            var9 = new MenuLabel(d.field_b[param2].field_z, 1 + (rs.field_Cb.field_J + 2 + d.field_b[param2].field_w / 8), 130 - d.field_b[param2].field_z, d.field_b[param2].field_w, EmailValidator.field_v);
            var12.addChild(var9, 8);
            param3.field_b[param2] = var9;
            var9.field_o = mm.field_q;
            var8.field_o = mm.field_q;
            var7.field_o = mm.field_q;
            var6.field_o = mm.field_q;
            var5.field_o = mm.field_q;
            var12.field_o = mm.field_q;
          }
          stackIn_6_0 = var12;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("e.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String a(byte param0) {
        int var2 = 96 / ((param0 + 10) / 51);
        return this.field_c;
    }

    final boolean a(int param0) {
        if (param0 != 2) {
          e.b(20);
          return this.field_a;
        }
        return this.field_a;
    }

    final static SoundPlayback a(int param0, int param1, PcmSample param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        SoundPlayback stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 13 / ((-40 - param1) / 39);
          stackIn_1_0 = DebouncedValidator.a(-128, PcmSampleStream.createScaled(param2, 100, param0));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("e.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 2105376) {
          field_d = -47;
          field_e = null;
          return;
        }
        field_e = null;
    }

    e(String param0) {
        this(param0, false);
    }

    e(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = param0;
          stackIn_4_1 = (param1);
          this.field_a = stackIn_4_1;
          if (this.field_c == null) {
            this.field_c = "";
          }
          if (0 != this.field_c.length()) {
            return;
          }
          this.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("e.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
