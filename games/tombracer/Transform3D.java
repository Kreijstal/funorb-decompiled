/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Transform3D {
    static int field_b;
    static int field_a;
    static int field_c;
    static SpriteData[] field_d;

    abstract void rotateZ(int param0);

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 != 27316) {
          field_d = (SpriteData[]) null;
        }
    }

    abstract void setCamera(int param0, int param1, int param2, int param3, int param4, int param5);

    final static int getChatSetting(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
          var2 = k.field_A;
        }
        if (param1 != -20011) {
          Transform3D.getChatSetting(-61, -111);
        }
        if (param0 == 1) {
          var2 = nba.field_b;
        }
        if (param0 == 2) {
          var2 = UrlDownloadRequest.field_i;
        }
        return var2;
    }

    abstract void rotateY(int param0);

    abstract void translate(int param0, int param1, int param2);

    final static void loadRoomDefinitions(ResourceArchive param0, int param1) {
        CourseDefinition[] var10 = null;
        int var3 = 0;
        CourseDefinition var4 = null;
        RoomDefinition[] var5 = null;
        int var6 = 0;
        RoomDefinition var7 = null;
        byte[] var14 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        try {
          InputFieldPainter.parseRoomData(true, param0.getFileByName("", (byte) 124, "roomdata.csv"));
          var10 = cm.field_a;
          for (var3 = 0; var3 < var10.length; var3++) {
            var4 = var10[var3];
            var5 = var4.field_c;
            for (var6 = 0; var6 < var5.length; var6++) {
              var7 = var5[var6];
              PitSnakeModel.field_b = PitSnakeModel.field_b + 1;
              var14 = param0.getFileByName(var7.field_g, (byte) 127, var7.field_b);
              var7.field_c = new BitPacketBuffer(var14);
              var7.field_c.beginBitAccess((byte) -38);
              var7.field_e = PillarComponent.decodeRoomHeader(-1, var7.field_c);
              var7.field_c.endBitAccess((byte) 98);
            }
            PerlinNoise2D.sortRoomDefinitions(var4.field_c, 0, -1 + var4.field_c.length, -1);
          }
          if (param1 != 17572) {
            field_a = 31;
          }
          du.field_e = true;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "gda.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_1 = false;
        boolean stackIn_8_0 = false;
        var3 = -120 % ((param0 - 65) / 42);
        stackIn_2_0 = mpa.hasAnyMask1048832(false, param1, param2);
        stackIn_3_1 = ((param2 & 262144) == 0) ? false : true;
        stackIn_8_0 = !(stackIn_2_0 | !stackIn_3_1) || (vua.e(param2, param1, 13650));
        return stackIn_8_0;
    }

    abstract void setIdentity();

    abstract void rotateX(int param0);

    final static Weapon createDefaultWeapon(boolean param0) {
        Weapon var1 = new Weapon();
        var1.effect = new HazardEffect(0, 5);
        if (!param0) {
          return (Weapon) null;
        }
        var1.effect.setDeathMessageIndex(1, 9);
        var1.field_d = 0;
        var1.field_h = 25;
        var1.maxAmmo = -1;
        var1.field_k = 150;
        var1.field_o = 25;
        var1.field_n = 655360;
        var1.field_b = 1;
        return var1;
    }

    static {
    }
}
