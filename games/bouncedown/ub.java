/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static qc field_b;
    static String field_d;
    static ResourceArchive field_a;
    static String field_e;
    static String field_c;

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        if (param0 == -104) {
          field_c = null;
          field_d = null;
          field_e = null;
          field_b = null;
          return;
        }
        field_b = (qc) null;
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static void a(byte param0, ResourceArchive param1) {
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        if (param0 != -32) {
          return;
        }
        try {
          var2 = new RgbSprite(param1.getFileByName("final_frame.jpg", "", -90), (java.awt.Component) ((Object) MusicPatchEnvelope.field_h));
          var3 = var2.field_s;
          var4 = var2.field_q;
          wa.a(true);
          jl.field_c = new RgbSprite(var3, 3 * var4 / 4);
          jl.field_c.bindAsRenderTarget();
          var2.drawOpaque(0, 0);
          PasswordValidator.field_o = new RgbSprite(var3, var4 - jl.field_c.field_q);
          PasswordValidator.field_o.bindAsRenderTarget();
          var2.drawOpaque(0, -jl.field_c.field_q);
          PasswordValidator.field_o.field_p = jl.field_c.field_q;
          ve.a(param0 ^ 100);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "ub.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_e = "Names should contain a maximum of 12 characters";
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = new qc();
    }
}
