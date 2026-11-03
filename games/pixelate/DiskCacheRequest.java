/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheRequest extends ArchiveRequest {
    static int field_F;
    SectorCacheStore field_G;
    int field_C;
    byte[] field_D;
    static boolean field_I;
    static PictureStrip field_H;

    final static String b(boolean param0) {
        if (param0) {
          field_F = -79;
          if (null == ModalStack.field_J) {
            return "";
          }
          return ModalStack.field_J;
        }
        if (null == ModalStack.field_J) {
          return "";
        }
        return ModalStack.field_J;
    }

    public static void i(int param0) {
        if (param0 != 100) {
          return;
        }
        field_H = null;
    }

    final int g(int param0) {
        if (this.field_v) {
          return 0;
        }
        if (param0 >= -92) {
          this.field_C = -114;
          return 100;
        }
        return 100;
    }

    final static void a(byte param0, SceneWidget param1, int param2) {
        ClientContextMenu var11 = null;
        Sprite var12 = null;
        String var13 = null;
        ClientContextMenu var14 = null;
        Sprite var15 = null;
        String var16 = null;
        ClientContextMenu var17 = null;
        Sprite var18 = null;
        String var19 = null;
        ClientContextMenu var20 = null;
        Sprite var21 = null;
        String var22 = null;
        ClientContextMenu var23 = null;
        Sprite var24 = null;
        String var25 = null;
        ClientContextMenu var26 = null;
        Sprite var27 = null;
        String var28 = null;
        ClientContextMenu var29 = null;
        String var31 = null;
        ClientContextMenu var32 = null;
        Sprite var33 = null;
        String var34 = null;
        ClientContextMenu var35 = null;
        Sprite var36 = null;
        String var37 = null;
        ClientContextMenu var38 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var30 = null;
        Sprite var30Lifetime1;
        Sprite var30Lifetime2;
        Sprite var30Lifetime3;
        Sprite var30Lifetime4;
        Sprite var30Lifetime5;
        Sprite var30Lifetime6;
        try {
          em.a((String) null, 0L, (String) null, -1, param1, -163, (ScrollContainer) null, (int[]) null, param2);
          if (0 == param2) {
            var11 = ProxySocketConnector.field_n;
            var12 = Checkbox.field_V[0];
            var30 = var12;
            var30Lifetime2 = var12;
            var13 = dg.field_e;
            var11.field_b.addIconAction(0, 11, var12, var13);
            var14 = ProxySocketConnector.field_n;
            var15 = Checkbox.field_V[1];
            var30Lifetime3 = var15;
            var30Lifetime4 = var15;
            var16 = IntKeyLookup.field_b;
            var14.field_b.addIconAction(param0 + 13, 12, var15, var16);
            var17 = ProxySocketConnector.field_n;
            var18 = Checkbox.field_V[2];
            var30Lifetime5 = var18;
            var30Lifetime6 = var18;
            var19 = BufferedRandomAccessFile.field_d;
            var17.field_b.addIconAction(0, 13, var18, var19);
          }
          if (1 == param2) {
            var20 = ProxySocketConnector.field_n;
            var21 = Checkbox.field_V[0];
            var22 = EmergentBehaviourBackground.field_m;
            var20.field_b.addIconAction(param0 + 13, 11, var21, var22);
            var23 = ProxySocketConnector.field_n;
            var24 = Checkbox.field_V[1];
            var25 = cl.field_i;
            var23.field_b.addIconAction(param0 ^ -13, 12, var24, var25);
            var26 = ProxySocketConnector.field_n;
            var27 = Checkbox.field_V[2];
            var28 = NameAvailabilityValidator.field_n;
            var26.field_b.addIconAction(0, 13, var27, var28);
          }
          if (param2 == 2) {
            var29 = ProxySocketConnector.field_n;
            var30Lifetime1 = Checkbox.field_V[0];
            var31 = vd.field_b;
            var29.field_b.addIconAction(0, 11, var30Lifetime1, var31);
            var32 = ProxySocketConnector.field_n;
            var33 = Checkbox.field_V[1];
            var34 = ge.field_e;
            var32.field_b.addIconAction(0, 12, var33, var34);
            var35 = ProxySocketConnector.field_n;
            var36 = Checkbox.field_V[2];
            var37 = sf.field_a;
            var35.field_b.addIconAction(0, 13, var36, var37);
          }
          var38 = ProxySocketConnector.field_n;
          var4 = param1.field_tb;
          var5 = param1.screenY;
          var6 = param1.field_K;
          var7 = param1.height;
          if (param0 != -13) {
            field_H = (PictureStrip) null;
          }
          var38.field_b.b(var7, var4, 91, var5, var6);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "cg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final byte[] h(int param0) {
        if (param0 != 0) {
          SceneWidget var3 = (SceneWidget) null;
          DiskCacheRequest.a((byte) 66, (SceneWidget) null, -96);
          if (!this.field_v) {
            return this.field_D;
          }
          throw new RuntimeException();
        }
        if (!this.field_v) {
          return this.field_D;
        }
        throw new RuntimeException();
    }

    DiskCacheRequest() {
    }

    static {
        field_F = 48;
    }
}
