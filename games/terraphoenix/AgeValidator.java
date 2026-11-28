/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AgeValidator extends TextFieldValidator {
    static TutorialController field_q;
    static rh field_n;
    static String field_m;
    static java.applet.Applet field_r;
    static String[] field_o;
    static int[] field_s;
    static IndexedSprite field_p;

    final static String a(boolean param0) {
        if (IsaacCipher.field_f == SectorCacheStore.field_d) {
          return GuestPlayConfirmationForm.field_H;
        }
        if (param0) {
          field_m = (String) null;
          return NetworkArchiveRequest.field_D;
        }
        return NetworkArchiveRequest.field_D;
    }

    final im getValidationStatus(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        im stackIn_3_0 = null;
        im stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!RasterBuffer.a(var4, true)) {
            stackIn_3_0 = FullscreenNoticeType.field_d;
            return stackIn_3_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = ta.a(var5, 121);
          if (var3_int > param1 &&
            var3_int <= 130) {
            return dg.field_c;
          }
          stackIn_8_0 = FullscreenNoticeType.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("le.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        if (param2) {
          AgeValidator.a(false, (byte) -3);
        }
        if (lk.field_a == null ||
          !(param0 <= lk.field_a.length)) {
          lk.field_a = new int[2 * param0];
        }
        if (null != a.field_c &&
          param0 <= a.field_c.length) {
          if (null == oa.field_a ||
            !(oa.field_a.length >= param0)) {
            oa.field_a = new int[2 * param0];
          }
          if (null == oa.field_c) {
            oa.field_c = new int[2 * param0];
            if (null == ValidationStatusIcon.field_L ||
              !(param0 <= ValidationStatusIcon.field_L.length)) {
              ValidationStatusIcon.field_L = new int[2 * param0];
            }
            if (ContentTransitionDialog.field_bb == null) {
              ContentTransitionDialog.field_bb = new int[param0 * 2];
              if (null == pf.field_b ||
                !(param1 + param0 <= pf.field_b.length)) {
                pf.field_b = new int[2 * (param1 + param0)];
              }
              if (MapTile.field_y == null ||
                !(MapTile.field_y.length >= param0)) {
                MapTile.field_y = new boolean[param0 * 2];
              }
            } else {
              if (ContentTransitionDialog.field_bb.length < param0) {
                ContentTransitionDialog.field_bb = new int[param0 * 2];
                if (null == pf.field_b ||
                  !(param1 + param0 <= pf.field_b.length)) {
                  pf.field_b = new int[2 * (param1 + param0)];
                }
                if (MapTile.field_y == null ||
                  !(MapTile.field_y.length >= param0)) {
                  MapTile.field_y = new boolean[param0 * 2];
                }
              } else {
                if (null == pf.field_b ||
                  !(param1 + param0 <= pf.field_b.length)) {
                  pf.field_b = new int[2 * (param1 + param0)];
                }
                if (MapTile.field_y == null) {
                  MapTile.field_y = new boolean[param0 * 2];
                } else {
                  if (MapTile.field_y.length < param0) {
                    MapTile.field_y = new boolean[param0 * 2];
                  }
                }
              }
            }
          } else {
            if (oa.field_c.length < param0) {
              oa.field_c = new int[2 * param0];
              if (null == ValidationStatusIcon.field_L ||
                !(param0 <= ValidationStatusIcon.field_L.length)) {
                ValidationStatusIcon.field_L = new int[2 * param0];
              }
              if (ContentTransitionDialog.field_bb == null ||
                !(ContentTransitionDialog.field_bb.length >= param0)) {
                ContentTransitionDialog.field_bb = new int[param0 * 2];
              }
              if (null == pf.field_b ||
                !(param1 + param0 <= pf.field_b.length)) {
                pf.field_b = new int[2 * (param1 + param0)];
              }
            } else {
              if (null == ValidationStatusIcon.field_L ||
                !(param0 <= ValidationStatusIcon.field_L.length)) {
                ValidationStatusIcon.field_L = new int[2 * param0];
              }
              if (ContentTransitionDialog.field_bb == null) {
                ContentTransitionDialog.field_bb = new int[param0 * 2];
                if (null == pf.field_b ||
                  !(param1 + param0 <= pf.field_b.length)) {
                  pf.field_b = new int[2 * (param1 + param0)];
                }
              } else {
                if (ContentTransitionDialog.field_bb.length >= param0) {
                  if (null == pf.field_b ||
                    !(param1 + param0 <= pf.field_b.length)) {
                    pf.field_b = new int[2 * (param1 + param0)];
                  }
                } else {
                  ContentTransitionDialog.field_bb = new int[param0 * 2];
                  if (null == pf.field_b ||
                    !(param1 + param0 <= pf.field_b.length)) {
                    pf.field_b = new int[2 * (param1 + param0)];
                  }
                }
              }
            }
            if (MapTile.field_y == null) {
              MapTile.field_y = new boolean[param0 * 2];
            } else {
              if (MapTile.field_y.length < param0) {
                MapTile.field_y = new boolean[param0 * 2];
              }
            }
          }
          bd.field_a = 2147483647;
          StripedProgressWidget.field_L = 2147483647;
          ClientException.field_d = -2147483648;
          pb.field_b = 0;
          ok.field_j = -2147483648;
          return;
        }
        a.field_c = new int[2 * param0];
        if (null == oa.field_a ||
          !(oa.field_a.length >= param0)) {
          oa.field_a = new int[2 * param0];
        }
        if (null != oa.field_c &&
          oa.field_c.length >= param0) {
          if (null == ValidationStatusIcon.field_L ||
            !(param0 <= ValidationStatusIcon.field_L.length)) {
            ValidationStatusIcon.field_L = new int[2 * param0];
          }
          if (ContentTransitionDialog.field_bb == null ||
            !(ContentTransitionDialog.field_bb.length >= param0)) {
            ContentTransitionDialog.field_bb = new int[param0 * 2];
          }
          if (null == pf.field_b ||
            !(param1 + param0 <= pf.field_b.length)) {
            pf.field_b = new int[2 * (param1 + param0)];
          }
          if (MapTile.field_y == null ||
            !(MapTile.field_y.length >= param0)) {
            MapTile.field_y = new boolean[param0 * 2];
          }
          bd.field_a = 2147483647;
          StripedProgressWidget.field_L = 2147483647;
          ClientException.field_d = -2147483648;
          pb.field_b = 0;
          ok.field_j = -2147483648;
          return;
        }
        oa.field_c = new int[2 * param0];
        if (null == ValidationStatusIcon.field_L) {
          ValidationStatusIcon.field_L = new int[2 * param0];
          if (ContentTransitionDialog.field_bb == null ||
            !(ContentTransitionDialog.field_bb.length >= param0)) {
            ContentTransitionDialog.field_bb = new int[param0 * 2];
          }
          if (null == pf.field_b ||
            !(param1 + param0 <= pf.field_b.length)) {
            pf.field_b = new int[2 * (param1 + param0)];
          }
          if (MapTile.field_y == null ||
            !(MapTile.field_y.length >= param0)) {
            MapTile.field_y = new boolean[param0 * 2];
          }
        } else {
          if (param0 > ValidationStatusIcon.field_L.length) {
            ValidationStatusIcon.field_L = new int[2 * param0];
          }
          if (ContentTransitionDialog.field_bb == null ||
            !(ContentTransitionDialog.field_bb.length >= param0)) {
            ContentTransitionDialog.field_bb = new int[param0 * 2];
          }
          if (null == pf.field_b ||
            !(param1 + param0 <= pf.field_b.length)) {
            pf.field_b = new int[2 * (param1 + param0)];
          }
          if (MapTile.field_y == null ||
            !(MapTile.field_y.length >= param0)) {
            MapTile.field_y = new boolean[param0 * 2];
          }
        }
        bd.field_a = 2147483647;
        StripedProgressWidget.field_L = 2147483647;
        ClientException.field_d = -2147483648;
        pb.field_b = 0;
        ok.field_j = -2147483648;
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_m = null;
        field_r = null;
        field_q = null;
        field_n = null;
        field_p = null;
        field_o = null;
        field_s = null;
        if (param0 != -76) {
          AgeValidator.clearDeclaredStaticReferences((byte) -47);
        }
    }

    AgeValidator(EditableTextField param0) {
        super(param0);
    }

    final String getValidationMessage(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.getValidationStatus(param0, 0) == FullscreenNoticeType.field_d) {
            stackIn_2_0 = (String) (field_m);
            return stackIn_2_0;
          }
          var3_int = -102 % ((26 - param1) / 56);
          stackIn_4_0 = null;
          return (String) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("le.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          AgeValidator.a(-62, 72, true);
          ga.b((byte) 111);
          if (null != DisplayNameSelectionPanel.field_G) {
            hk.a(DisplayNameSelectionPanel.field_G, (byte) 6);
          }
          ab.a((byte) -128);
          ArchiveRequest.d((byte) 93);
          lf.a(param0);
          if (od.b(255)) {
            TextFieldValidator.field_l.writeCipheredByte(-17410, 1);
            bc.a(0, 0);
            WidgetContainer.g(-17464);
            return;
          }
          WidgetContainer.g(-17464);
          return;
        }
        ga.b((byte) 111);
        if (null != DisplayNameSelectionPanel.field_G) {
          hk.a(DisplayNameSelectionPanel.field_G, (byte) 6);
        }
        ab.a((byte) -128);
        ArchiveRequest.d((byte) 93);
        lf.a(param0);
        if (!od.b(255)) {
          WidgetContainer.g(-17464);
          return;
        }
        TextFieldValidator.field_l.writeCipheredByte(-17410, 1);
        bc.a(0, 0);
        WidgetContainer.g(-17464);
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          BitPacketBuffer var4 = null;
          BitPacketBuffer var5 = null;
          int stackIn_12_0 = 0;
          Throwable decompiledCaughtException = null;
          if (null == bd.field_k) {
            bd.field_k = SoundCache.field_g.requestDirectSocket(MidiNoteMask.field_i, wa.field_t, (byte) 60);
          }
          if (param1 <= 82) {
            AgeValidator.a(false);
          }
          if (bd.field_k.status == 0) {
            return false;
          }
          dupTemp$1 = ll.correctedCurrentTimeMillis(1000);
          bl.field_h = dupTemp$1;
          dm.field_c = dupTemp$1;
          if (1 != bd.field_k.status) {
            mh.field_a = ba.field_b;
          } else {
            try {
              ig.field_e = new BufferedSocket((java.net.Socket) (bd.field_k.result), SoundCache.field_g);
              TextFieldValidator.field_l.position = 0;
              var4 = LevelEditor.field_j;
              var5 = var4;
              mh.field_a = va.field_e;
              stackIn_12_0 = (!param0) ? -1 : -2;
              wc.field_r = stackIn_12_0;
              wf.field_n = stackIn_12_0;
              BitPacketBuffer.field_r = stackIn_12_0;
              var5.position = 0;
              EditableTextField.a(gi.field_v, -25563, TextFieldValidator.field_l, MessageKeys.field_d, hb.field_i);
              bc.a(-1, 0);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              mh.field_a = ba.field_b;
              bd.field_k = null;
              return true;
            }
          }
          bd.field_k = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = "Please enter your age in years";
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
        field_n = new rh(14, 0, 4, 1);
        field_s = new int[]{3, 3, 3, 55, 7, 7, 7, -1, 8, 9, 10, 11, -1, -1, -1, -1, -1, -1, -1, -1, 23, 23, 23, 55, 27, 27, 27, -1, 31, 31, 31, 68, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 47, 47, -1, 51, 51, 51, -1, 55, 55, 55, -1, 59, 59, 59, -1, 63, 63, 63, -1, 67, 67, 67, -1, 71, 71, 71, -1, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
