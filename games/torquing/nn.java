/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class nn {
    static MenuLayer[][] field_a;
    static int field_e;
    static byte field_b;
    static Js5Transport field_c;
    static java.util.zip.CRC32 field_d;

    final static void a(int param0) {
        if (null != NodeHashTableIterator.field_a) {
          return;
        }
        Js5Transport.field_n = new String[]{vk.field_x, to.field_r, mi.field_u, bq.field_b, w.field_gb, nc.field_b, un.field_f, bl.field_e};
        if (param0 < -21) {
          NodeHashTableIterator.field_a = new String[]{ld.field_b, hm.field_t, da.field_e, qj.field_a, qa.field_j};
          GrowableIntArray.field_d[2] = ai.field_m;
          GrowableIntArray.field_d[0] = ae.field_lb;
          GrowableIntArray.field_d[1] = qe.field_a;
          hb.field_u[0] = bm.field_l.toUpperCase();
          hb.field_u[4] = RichTextLayout.field_j.toUpperCase();
          hb.field_u[10] = l.field_a;
          hb.field_u[13] = am.field_o;
          hb.field_u[2] = vb.field_e;
          hb.field_u[6] = cd.field_b.toUpperCase();
          hb.field_u[3] = DelayedPcmStream.field_u.toUpperCase();
          hb.field_u[20] = ae.field_lb + " / " + qe.field_a + " / " + ai.field_m;
          hb.field_u[5] = mi.field_v.toUpperCase();
          hb.field_u[11] = tp.field_n.toUpperCase();
          hb.field_u[12] = RasterBuffer.field_b.toUpperCase();
          hb.field_u[1] = RasterBuffer.field_b.toUpperCase();
          hb.field_u[9] = null;
          hb.field_u[8] = null;
          hb.field_u[14] = r.field_a.toUpperCase();
          hb.field_u[15] = LoginPanel.field_M.toUpperCase();
          hb.field_u[16] = eg.field_y.toUpperCase();
          hb.field_u[17] = bm.field_l.toUpperCase();
          hb.field_u[21] = rk.field_e.toUpperCase();
          hb.field_u[22] = te.field_t.toUpperCase();
          hb.field_u[23] = ValidatedTextField.field_M.toUpperCase();
          po.field_t[2] = SpriteState.field_q;
          po.field_t[1] = FullscreenNoticeType.field_c;
          po.field_t[0] = ro.field_t;
          oh.field_a = oh.field_a.toUpperCase();
          ip.field_d = ip.field_d.toUpperCase();
          jn.field_b = jn.field_b.toUpperCase();
          ValidatedTextField.field_P = ValidatedTextField.field_P.toUpperCase();
          al.field_c = al.field_c.toUpperCase();
          kj.field_f = kj.field_f.toUpperCase();
          EmailFormatValidator.field_m = EmailFormatValidator.field_m.toUpperCase();
          DialogMessagePane.field_E = DialogMessagePane.field_E.toUpperCase();
          qd.field_i = qd.field_i.toUpperCase();
          ud.field_l = ud.field_l.toUpperCase();
          ol.field_b = ol.field_b.toUpperCase();
          return;
        }
        field_c = (Js5Transport) null;
        NodeHashTableIterator.field_a = new String[]{ld.field_b, hm.field_t, da.field_e, qj.field_a, qa.field_j};
        GrowableIntArray.field_d[2] = ai.field_m;
        GrowableIntArray.field_d[0] = ae.field_lb;
        GrowableIntArray.field_d[1] = qe.field_a;
        hb.field_u[0] = bm.field_l.toUpperCase();
        hb.field_u[4] = RichTextLayout.field_j.toUpperCase();
        hb.field_u[10] = l.field_a;
        hb.field_u[13] = am.field_o;
        hb.field_u[2] = vb.field_e;
        hb.field_u[6] = cd.field_b.toUpperCase();
        hb.field_u[3] = DelayedPcmStream.field_u.toUpperCase();
        hb.field_u[20] = ae.field_lb + " / " + qe.field_a + " / " + ai.field_m;
        hb.field_u[5] = mi.field_v.toUpperCase();
        hb.field_u[11] = tp.field_n.toUpperCase();
        hb.field_u[12] = RasterBuffer.field_b.toUpperCase();
        hb.field_u[1] = RasterBuffer.field_b.toUpperCase();
        hb.field_u[9] = null;
        hb.field_u[8] = null;
        hb.field_u[14] = r.field_a.toUpperCase();
        hb.field_u[15] = LoginPanel.field_M.toUpperCase();
        hb.field_u[16] = eg.field_y.toUpperCase();
        hb.field_u[17] = bm.field_l.toUpperCase();
        hb.field_u[21] = rk.field_e.toUpperCase();
        hb.field_u[22] = te.field_t.toUpperCase();
        hb.field_u[23] = ValidatedTextField.field_M.toUpperCase();
        po.field_t[2] = SpriteState.field_q;
        po.field_t[1] = FullscreenNoticeType.field_c;
        po.field_t[0] = ro.field_t;
        oh.field_a = oh.field_a.toUpperCase();
        ip.field_d = ip.field_d.toUpperCase();
        jn.field_b = jn.field_b.toUpperCase();
        ValidatedTextField.field_P = ValidatedTextField.field_P.toUpperCase();
        al.field_c = al.field_c.toUpperCase();
        kj.field_f = kj.field_f.toUpperCase();
        EmailFormatValidator.field_m = EmailFormatValidator.field_m.toUpperCase();
        DialogMessagePane.field_E = DialogMessagePane.field_E.toUpperCase();
        qd.field_i = qd.field_i.toUpperCase();
        ud.field_l = ud.field_l.toUpperCase();
        ol.field_b = ol.field_b.toUpperCase();
    }

    final static int computeCrc32(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          if (param0 != 7655) {
            nn.a((int[][]) null, (byte) 17);
          }
          var4_int = -1;
          for (var5 = param2; param3 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ ne.field_d[(var4_int ^ param1[var5]) & 255];
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("nn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          PlatformTaskDispatcher stackIn_13_0;
          int stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          java.net.URL stackIn_13_4;
          StringBuilder stackIn_13_5;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          String stackIn_14_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          var6 = Torquing.field_u;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = ii.a(param1, param2 ^ -9958);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            DirectByteStorage.a(3, var3);
            var3 = ProgressDialog.a(var3, ":", "%3a", (byte) -77);
            var3 = ProgressDialog.a(var3, "@", "%40", (byte) -71);
            var3 = ProgressDialog.a(var3, "&", "%26", (byte) -85);
            var7 = ProgressDialog.a(var3, "#", "%23", (byte) -92);
            if (null == InteractiveWidget.field_B) {
              return;
            }
            stackIn_13_0 = FullscreenFocusCanvas.field_f;
            stackIn_13_1 = 0;
            stackIn_13_2 = null;
            stackIn_13_3 = null;
            stackIn_13_4 = InteractiveWidget.field_B.getCodeBase();
            stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(dq.field_m).append("&u=");
            if (null == vd.field_b) {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = "" + TextFieldValidator.field_f;
            } else {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = vd.field_b;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_13_0).requestUrlStream(stackIn_13_1, new java.net.URL(stackIn_13_4, ((StringBuilder) (Object) stackIn_13_5).append(stackIn_14_6).append("&v1=").append(PlatformTaskDispatcher.field_u).append("&v2=").append(PlatformTaskDispatcher.field_v).append("&e=").append(var7).toString()));
            while (var4.status == 0) {
              ValidationStatusIcon.sleepMillis(1976, 1L);
            }
            if (param2 != -9958) {
              field_b = (byte) -127;
            }
            if (var4.status != 1) {
              return;
            }
            var5 = (DataInputStream) (var4.result);
            var5.read();
            var5.close();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int[][] param0, byte param1) {
        try {
          qd.field_a = param0;
          if (param1 >= -94) {
            byte[] var3 = (byte[]) null;
            nn.computeCrc32(-46, (byte[]) null, -63, -109);
          }
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "nn.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 < -88) {
          field_d = null;
          field_a = (MenuLayer[][]) null;
          return;
        }
        Throwable var2 = (Throwable) null;
        nn.a((String) null, (Throwable) null, 60);
        field_d = null;
        field_a = (MenuLayer[][]) null;
    }

    static {
        field_b = (byte) 0;
        field_d = new java.util.zip.CRC32();
    }
}
