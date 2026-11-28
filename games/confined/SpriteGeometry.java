/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteGeometry extends DualLinkNode {
    int field_t;
    int field_x;
    int field_w;
    int field_u;
    int field_v;
    int field_s;
    static PcmSample field_y;

    final static void a(ResourceArchive param0, boolean param1) {
        VorbisSample var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          VorbisSample.decodeSetup(param0.getFileByName(112, "headers.packvorbis", ""));
          var2 = VorbisSample.loadByName(param0, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
          if (param1) {
            return;
          }
          field_y = (PcmSample) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_5_0 = var2_ref;
          stackIn_5_1 = new StringBuilder().append("pl.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_y = null;
        if (param0 != -1444) {
          SpriteGeometry.clearStaticReferences(-21);
        }
    }

    SpriteGeometry() {
    }

    static {
    }
}
