/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadProgressDialog extends ResizableDialog {
    static ArchiveCatalog field_Z;
    static String field_fb;
    static int[] field_cb;
    private String field_gb;
    private boolean field_db;
    private String field_eb;
    static Sprite[] field_X;
    private boolean field_Y;
    static long field_bb;
    private StripedProgressBar field_jb;
    static int field_ab;
    static String field_ib;
    static Sprite field_hb;

    final void stopProgressAnimation(byte param0) {
        this.field_jb.animating = false;
        this.field_db = true;
        int var2 = -107 % ((param0 + 20) / 43);
    }

    final static void updateCurrentRace(int param0) {
        if (MusicPatchPcmStream.field_r != null) {
          MusicPatchPcmStream.field_r.update(-38);
          if (param0 < 95) {
            field_cb = (int[]) null;
            return;
          }
          return;
        }
        if (param0 >= 95) {
          return;
        }
        field_cb = (int[]) null;
    }

    final static boolean isNormalizedNameValid(CharSequence param0, boolean param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = MidiPcmStream.normalizeAccountName(param0, (byte) 122);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!SocketJs5Transport.isNameSeparator(-2821, var4.charAt(0)) &&
              !SocketJs5Transport.isNameSeparator(-2821, var4.charAt(var4.length() - 1))) {
              if (param1) {
                var9 = (String) null;
                LoadProgressDialog.isLocalPlayerName((String) null, false);
              }
              var5 = 0;
              for (var6 = 0; param0.length() > var6; var6++) {
                var7 = param0.charAt(var6);
                if (SocketJs5Transport.isNameSeparator(-2821, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("ra.W(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_ib = null;
        if (param0 <= -104) {
          field_fb = null;
          field_Z = null;
          field_cb = null;
          field_hb = null;
          field_X = null;
          return;
        }
        field_fb = (String) null;
        field_fb = null;
        field_Z = null;
        field_cb = null;
        field_hb = null;
        field_X = null;
    }

    final void drawFrame(int param0, int param1, byte param2) {
        super.drawFrame(param0, param1, param2);
        DisplayNameForm.field_I.drawCentered(this.field_eb, (this.width >> 1) + param0, param1 + 103, 16777215, -1);
        if (null != this.field_gb) {
          SoftwareRasterizer.drawHorizontalLine(20 + param0, -7 + (param1 + 120), 260, 8421504);
          DisplayNameForm.field_I.drawParagraph(this.field_gb, 20 + param0, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, DisplayNameForm.field_I.ascent);
        }
    }

    final void setProgress(float param0, int param1, boolean param2, String param3) {
        RuntimeException runtimeException = null;
        String var6 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_Y != param2) {
            stackIn_5_1 = (param2);
            this.field_Y = stackIn_5_1;
            if (this.field_Y) {
              this.field_jb.setColors(8405024, 4210752, false);
              this.field_jb.animating = true;
            } else {
              this.field_jb.setColors(2113632, 4210752, false);
              if (this.field_db) {
                this.field_jb.animating = false;
              }
            }
          }
          if (param1 >= -43) {
            var6 = (String) null;
            LoadProgressDialog.findIgnoredPlayer((String) null, 66);
          }
          this.field_jb.progress = (int)(param0 / 100.0f * 65536.0f);
          this.field_eb = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ra.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    LoadProgressDialog(DialogLayer param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_gb = param1;
          if (null != this.field_gb) {
            var3_int = DisplayNameForm.field_I.getParagraphHeight(this.field_gb, 260, DisplayNameForm.field_I.ascent);
            this.setCenteredSize(537342017, 300, var3_int + 150);
          }
          this.field_jb = new StripedProgressBar(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_jb.animating = true;
          this.field_Y = false;
          this.field_db = false;
          this.addChild(true, this.field_jb);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isLocalPlayerName(String param0, boolean param1) {
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var3 = (String) null;
            LoadProgressDialog.findIgnoredPlayer((String) null, -94);
          }
          var4 = (CharSequence) ((Object) param0);
          stackIn_3_0 = ClientLifecycleUtilities.field_e.equals(MidiPcmStream.normalizeAccountName(var4, (byte) -102));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ra.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static SocialListEntry findIgnoredPlayer(String param0, int param1) {
        String var2 = null;
        SocialListEntry var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        SocialListEntry stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = HoldTheLine.field_D;
        try {
          if (IgnoreListIndex.entries == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            stackIn_7_0 = null;
            return (SocialListEntry) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var2 = MidiPcmStream.normalizeAccountName(var7, (byte) 99);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (SocialListEntry) (stackIn_10_0);
          }
          var4 = 70 % ((param1 - 9) / 33);
          var3 = (SocialListEntry) (IgnoreListIndex.entries.get(-25839, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var8 = (CharSequence) ((Object) var3.displayName);
            var5 = MidiPcmStream.normalizeAccountName(var8, (byte) 123);
            if (!var5.equals(var2)) {
              var3 = (SocialListEntry) (IgnoreListIndex.entries.getNextWithSameKey(20240));
              continue;
            }
            break;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ra.CA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_fb = "<img=4>";
        field_cb = new int[]{3, 3, 4};
        field_ab = -1;
        field_ib = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
