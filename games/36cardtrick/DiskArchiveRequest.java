/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskArchiveRequest extends ArchiveRequest {
    int field_s;
    byte[] field_r;
    SectorCacheStore field_v;
    static cc field_w;
    static String field_q;
    static int field_t;
    static int[] field_u;
    static cf field_p;

    final byte[] getData(boolean param0) {
        if (this.field_n) {
          throw new RuntimeException();
        }
        if (param0) {
          return this.field_r;
        }
        this.field_r = (byte[]) null;
        return this.field_r;
    }

    final static void a(ResourceArchive param0, int param1) {
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new RgbSprite(param0.getFileByName((byte) 7, "", "final_frame.jpg"), (java.awt.Component) ((Object) tb.field_c));
          var3 = var2.field_p;
          var4 = var2.field_o;
          ji.a(true);
          sg.field_d = new RgbSprite(var3, 3 * var4 / 4);
          sg.field_d.bindAsRenderTarget();
          var2.drawOpaque(param1, 0);
          qg.field_z = new RgbSprite(var3, var4 - sg.field_d.field_o);
          qg.field_z.bindAsRenderTarget();
          var2.drawOpaque(0, -sg.field_d.field_o);
          qg.field_z.field_n = sg.field_d.field_o;
          gg.a(14756);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ab.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getProgressPercent(boolean param0) {
        if (param0) {
          return 42;
        }
        if (this.field_n) {
          return 0;
        }
        return 100;
    }

    public static void clearStaticReferences(int param0) {
        field_p = null;
        if (param0 >= -67) {
          return;
        }
        field_w = null;
        field_u = null;
        field_q = null;
    }

    final static String a(PacketBuffer param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.readUnsignedSmart(0);
            if (var3_int > param2) {
              var3_int = param2;
            }
            var4 = new byte[var3_int];
            var5 = 54 % ((6 - param1) / 55);
            param0.position = param0.position + qf.field_J.a(var3_int, var4, param0.payload, 0, 109, param0.position);
            var6 = NameSuggestionsPanel.decodeCp1252String(255, 0, var4, var3_int);
            stackIn_4_0 = var6;
            return stackIn_4_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_6_0 = "Cabbage";
            return stackIn_6_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ab.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    DiskArchiveRequest() {
    }

    static {
        field_w = new cc();
        field_q = "Username: ";
        field_t = 0;
    }
}
