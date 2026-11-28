/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ProgressMessageDialog extends ContentTransitionDialog implements WidgetActivationListener {
    private boolean field_eb;
    private BitmapFont field_cb;
    private boolean field_Y;
    private boolean field_ab;
    static int[] field_Z;
    static int[] field_bb;
    private boolean field_fb;
    private StripedProgressWidget field_db;

    final static Sprite a(ResourceArchive param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupIdByName(-1, param1);
          if (param3 <= 81) {
            ProgressMessageDialog.clearStaticReferences((byte) 123);
          }
          var5 = param0.getFileIdByName(param2, -121, var4_int);
          stackIn_3_0 = wi.a(var5, (byte) -106, param0, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("mn.QA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var6 = 0;
        byte dupTemp$0 = 0;
        Object stackIn_13_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        var7 = Torquing.field_u;
        try {
          var9 = new byte[param3];
          var4 = var9;
          var5 = 0;
          for (var6 = 0; param3 > var6; var6++) {
            dupTemp$0 = param1[var6];
            var9[var6] = dupTemp$0;
            if (~dupTemp$0 != ~param2) {
              var5 = 1;
            }
          }
          if (param0 != -6058) {
            var8 = (byte[]) null;
            ProgressMessageDialog.a(-121, (byte[]) null, -61, -87);
          }
          if (var5 != 0) {
            stackIn_15_0 = var9;
            return stackIn_15_0;
          }
          stackIn_13_0 = null;
          return (byte[]) (stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("mn.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void showResult(int param0, String param1, int param2) {
        boolean stackIn_6_1 = false;
        DialogMessagePane stackIn_13_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        DialogMessagePane var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        DialogMessagePane var6 = null;
        var5 = Torquing.field_u;
        try {
          if (this.field_fb) {
            return;
          }
          stackIn_6_1 = (param0 == 256);
          this.field_Y = stackIn_6_1;
          this.field_fb = true;
          if (param2 != -257) {
            field_bb = (int[]) null;
          }
          this.field_db.setColours(4210752, 8405024, (byte) 125);
          var6 = new DialogMessagePane(this, this.field_cb, param1);
          var4 = var6;
          if (param0 != 5) {
            if (param0 == 256) {
              var6.addListenerButton(0, qm.field_b, (WidgetEventListener) (this));
            } else {
              stackIn_13_0 = var6;
              if (this.field_eb) {
                stackIn_14_1 = qm.field_b;
              } else {
                stackIn_14_1 = qh.field_a;
              }
              ((DialogMessagePane) (Object) stackIn_13_0).addActionButton(stackIn_14_1, param2 ^ -5434, -1);
            }
          } else {
            var6.addActionButton(DelayedPcmStream.field_n, 5177, 11);
            var6.addActionButton(pf.field_q, 5177, 17);
          }
          if (param0 == 3) {
            var6.addActionButton(dc.field_b, 5177, 7);
          } else {
            if (4 != param0) {
              if (param0 == 6) {
                var6.addActionButton(pf.field_u, param2 ^ -5434, 9);
              } else {
                if (param0 != 9) {
                  this.replaceContent(var6, 33);
                  return;
                }
                var6.addListenerButton(0, GameKeyHandler.field_c, (WidgetEventListener) (this));
              }
            } else {
              var6.addActionButton(cd.field_a, 5177, 8);
            }
          }
          this.replaceContent(var6, 33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("mn.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (param2 <= 12) {
            field_Z = (int[]) null;
          }
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = hf.a(param0, 114);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!ra.a(var4.charAt(0), 252) &&
              !ra.a(var4.charAt(var4.length() - 1), 252)) {
              var5 = 0;
              for (var6 = 0; param0.length() > var6; var6++) {
                var7 = param0.charAt(var6);
                if (!ra.a((char) var7, 252)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (0 >= var5) {
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
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("mn.TA(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void closeDialog(boolean param0) {
        if (!param0) {
          ProgressMessageDialog.clearStaticReferences((byte) 54);
          if (!this.field_D) {
            return;
          }
          this.field_D = false;
          if (this.field_eb) {
            SecondaryNodeDequeIterator.a(107);
            return;
          }
          if (this.field_ab) {
            StripedProgressWidget.a((byte) -100);
            return;
          }
          return;
        }
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (this.field_eb) {
          SecondaryNodeDequeIterator.a(107);
          return;
        }
        if (!this.field_ab) {
          return;
        }
        StripedProgressWidget.a((byte) -100);
    }

    final void showConnectionFailure(int param0) {
        DialogMessagePane var2 = null;
        this.field_db.setColours(4210752, 2121792, (byte) 125);
        if (param0 == -20041) {
          var2 = new DialogMessagePane(this, this.field_cb, Model.field_j);
          var2.addActionButton(pn.field_c, 5177, 15);
          this.replaceContent(var2, 33);
          return;
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_bb = null;
        if (param0 != 77) {
          field_bb = (int[]) null;
          field_Z = null;
          return;
        }
        field_Z = null;
    }

    ProgressMessageDialog(ModalDialogHost param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new DialogMessagePane((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_cb = param1;
          this.field_fb = false;
          this.field_eb = param3 ? true : false;
          this.field_Y = false;
          this.field_ab = param4 ? true : false;
          this.field_db = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_db.field_M = true;
          this.addChild(this.field_db, -6938);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "mn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void onWidgetActivated(byte param0, InteractiveWidget param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        UiWidget var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_Y) {
            MouseInputHandler.a(0, "tochangedisplayname.ws", ip.a(9));
          } else {
            od.b(128, 3);
            this.closeDialog(true);
          }
          if (param0 < -85) {
            return;
          }
          var7 = (UiWidget) null;
          this.handleKey(-44, (UiWidget) null, 'Z', 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("mn.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKey(int param0, UiWidget param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 13) {
            this.closeDialog(true);
            return true;
          }
          var5_int = -42 % ((param3 + 33) / 57);
          stackIn_5_0 = super.handleKey(param0, param1, param2, 55);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_bb = new int[16384];
    }
}
