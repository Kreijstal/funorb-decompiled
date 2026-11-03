/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static UiComponent field_b;
    static String[] field_c;
    static boolean field_e;
    static long field_d;
    static UiComponent field_a;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 125) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, byte[] param3, boolean param4, int param5) {
        CipherPacketBuffer var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = ma.field_a;
          var6.b((byte) -35, param5);
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.writeByte(-55, 4);
          var6.writeByte(123, param2);
          var8 = param1;
          if (param4) {
            var8 += 128;
          }
          var6.writeByte(109, var8);
          var6.writeBytes(param3, param3.length, 0, 115);
          var6.e(33, -var7 + var6.position);
          if (param0 > 28) {
            return;
          }
          cm.a((byte) 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("cm.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, UiComponent param2) {
        jb var13 = null;
        Sprite var14 = null;
        String var15 = null;
        jb var16 = null;
        Sprite var17 = null;
        String var18 = null;
        jb var19 = null;
        Sprite var20 = null;
        String var21 = null;
        jb var22 = null;
        Sprite var23 = null;
        String var24 = null;
        jb var25 = null;
        Sprite var26 = null;
        String var27 = null;
        jb var28 = null;
        Sprite var29 = null;
        String var30 = null;
        jb var31 = null;
        String var33 = null;
        jb var34 = null;
        Sprite var35 = null;
        String var36 = null;
        jb var37 = null;
        Sprite var38 = null;
        String var39 = null;
        jb var40 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Sprite var32 = null;
        Sprite var32Lifetime1;
        Sprite var32Lifetime2;
        Sprite var32Lifetime3;
        Sprite var32Lifetime4;
        Sprite var32Lifetime5;
        Sprite var32Lifetime6;
        try {
          ve.a(0L, 196, (String) null, (tq) null, (String) null, param2, param1, (int[]) null, -1);
          if (param1 == 0) {
            var13 = pk.field_b;
            var14 = wp.field_j[0];
            var32 = var14;
            var32Lifetime2 = var14;
            var15 = wj.field_k;
            var13.field_j.a(var14, 11, var15, true);
            var16 = pk.field_b;
            var17 = wp.field_j[1];
            var32Lifetime3 = var17;
            var32Lifetime4 = var17;
            var18 = LaboratoryScreen.field_o;
            var16.field_j.a(var17, 12, var18, true);
            var19 = pk.field_b;
            var20 = wp.field_j[2];
            var32Lifetime5 = var20;
            var32Lifetime6 = var20;
            var21 = rq.field_g;
            var19.field_j.a(var20, 13, var21, true);
          }
          if (param1 == 1) {
            var22 = pk.field_b;
            var23 = wp.field_j[0];
            var24 = io.field_h;
            var22.field_j.a(var23, 11, var24, true);
            var25 = pk.field_b;
            var26 = wp.field_j[1];
            var27 = rq.field_r;
            var25.field_j.a(var26, 12, var27, true);
            var28 = pk.field_b;
            var29 = wp.field_j[2];
            var30 = jk.field_c;
            var28.field_j.a(var29, 13, var30, true);
          }
          int var3_int = -34 % ((-60 - param0) / 40);
          if (2 == param1) {
            var31 = pk.field_b;
            var32Lifetime1 = wp.field_j[0];
            var33 = ao.field_a;
            var31.field_j.a(var32Lifetime1, 11, var33, true);
            var34 = pk.field_b;
            var35 = wp.field_j[1];
            var36 = ji.field_d;
            var34.field_j.a(var35, 12, var36, true);
            var37 = pk.field_b;
            var38 = wp.field_j[2];
            var39 = gg.field_n;
            var37.field_j.a(var38, 13, var39, true);
          }
          var40 = pk.field_b;
          var5 = param2.field_w;
          var6 = param2.field_qb;
          var7 = param2.field_zb;
          var8 = param2.field_z;
          var40.field_j.layoutAtAnchor(4542, var5, var8, var6, var7);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "cm.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        param0 = (param0 >>> 1 & 1431655765) + (1431655765 & param0);
        if (param1) {
          param0 = (param0 & 858993459) + (param0 >>> 2 & 858993459);
          param0 = (param0 >>> 4) + param0 & 252645135;
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return 255 & param0;
        }
        byte[] var3 = (byte[]) null;
        cm.a(103, 105, 35, (byte[]) null, true, -40);
        param0 = (param0 & 858993459) + (param0 >>> 2 & 858993459);
        param0 = (param0 >>> 4) + param0 & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    static {
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
