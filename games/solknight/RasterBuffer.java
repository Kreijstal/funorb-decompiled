/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class RasterBuffer {
    java.awt.Image field_g;
    int field_a;
    static String field_b;
    static int[] field_e;
    int[] field_h;
    static Calendar field_f;
    static boolean field_c;
    int field_d;

    abstract void initialize(java.awt.Component param0, int param1, int param2, int param3);

    public static void clearStaticReferences(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
          field_e = (int[]) null;
        }
    }

    final void setAsRasterTarget(boolean param0) {
        if (!param0) {
          return;
        }
        SoftwareRasterizer.setRasterBuffer(this.field_h, this.field_a, this.field_d);
    }

    abstract void drawImage(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          if (ch.field_b == -1 &&
            ql.field_v == -1) {
            ql.field_v = BufferedSocket.field_m;
            ch.field_b = PacketBuffer.field_j;
          }
          boolean decompiledFrameRemainder0 = true;
          kk.field_d = kk.field_d + 1;
          if (param1 == null) {
            decompiledFrameRemainder0 = (StandardContentDialog.field_ib == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(StandardContentDialog.field_ib));
          }
          if (decompiledFrameRemainder0) {
            if (!ab.field_u) {
              if (GzipDecompressor.field_e <= kk.field_d) {
                stackIn_17_0 = (GzipDecompressor.field_e + wi.field_l > kk.field_d) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              kk.field_d = 0;
            } else {
              if (ab.field_u) {
                kk.field_d = GzipDecompressor.field_e;
              } else {
                if (var2_int == 0) {
                  kk.field_d = 0;
                } else {
                  kk.field_d = GzipDecompressor.field_e;
                }
              }
            }
            bf.field_a = ch.field_b;
            if (param1 == null) {
              if (var2_int != 0) {
                ab.field_u = true;
              }
            } else {
              ab.field_u = false;
            }
            kd.field_c = ql.field_v;
          }
          if (!ab.field_u &&
            GzipDecompressor.field_e > kk.field_d &&
            ne.field_d) {
            kd.field_c = ql.field_v;
            bf.field_a = ch.field_b;
            kk.field_d = 0;
          }
          if (param0 < 122) {
            var4 = (String) null;
            RasterBuffer.a(95, (String) null);
          }
          StandardContentDialog.field_ib = param1;
          if (ab.field_u &&
            kk.field_d == InteractiveWidget.field_A) {
            kk.field_d = 0;
            ab.field_u = false;
          }
          ch.field_b = -1;
          ql.field_v = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("pd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    static {
        field_b = "Visit the Account Management section on the main site to view.";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
