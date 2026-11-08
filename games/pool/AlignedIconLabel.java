/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlignedIconLabel extends UiComponent {
    private UiComponent icon;
    static UiComponent field_Lb;
    UiComponent label;
    static int field_Qb;
    static String playerNameBallInHand;
    static UiComponent[] field_Mb;

    final int measureIconLabelWidth(int param0, int param1, int param2) {
        if (param0 != 0) {
          return -21;
        }
        int var4 = -param1;
        int var5 = -param1;
        if (null != this.icon) {
          var4 = this.icon.getContentWidth(true);
        }
        if (this.label != null) {
          var5 = this.label.getContentWidth(true);
        }
        return var5 + (param2 + var4) + param1 + param2;
    }

    AlignedIconLabel(long param0, UiComponent param1, UiComponent param2, UiComponent param3, Sprite param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.icon = new UiComponent(0L, param2);
            this.icon.sprite = param4;
            this.addChild(-99, this.icon);
          }
          if (param5 != null) {
            this.label = new UiComponent(0L, param3, param5);
            this.addChild(92, this.label);
            this.markDescendantsToInheritVisualState((byte) -125);
          } else {
            this.markDescendantsToInheritVisualState((byte) -125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("uo.<init>(").append(param0).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void f(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        tq var11 = null;
        i var12 = null;
        CipherPacketBuffer var13 = null;
        tq var14 = null;
        var8 = Pool.field_O;
        try {
          var13 = PlayerContextMenu.field_e;
          var2 = var13.readUnsignedByte(-94);
          if (param0 >= -102) {
            AlignedIconLabel.f(44);
          }
          if (0 == var2) {
            var10 = ek.a(121);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(-101);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt(true);
            }
            var11 = (tq) (NodeHashTableIterator.field_j.last((byte) 77));
            if (var11 == null) {
              ShotEvent.c(-107);
              return;
            }
            var11.field_l = var3;
            var11.field_s = true;
            var11.unlink((byte) -117);
            return;
          }
          if (var2 == 1) {
            var12 = (i) (ue.field_b.last((byte) -19));
            if (var12 == null) {
              ShotEvent.c(-69);
              return;
            }
            var12.unlink((byte) -117);
          } else {
            if (2 == var2) {
              var14 = (tq) (NodeHashTableIterator.field_j.last((byte) -112));
              if (var14 == null) {
                ShotEvent.c(-81);
                return;
              }
              var14.field_l = ek.a(117);
              var14.field_s = true;
              var14.unlink((byte) -117);
            } else {
              GrowableIntList.reportClientError((Throwable) null, "A1: " + t.formatPacketDump(99), -8555);
              ShotEvent.c(84);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "uo.F(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        playerNameBallInHand = null;
        if (param0 != -102) {
          AlignedIconLabel.c(true);
        }
        field_Mb = null;
        field_Lb = null;
    }

    final void setIconLabelBounds(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        this.setBounds(param6, 2147483647, param0, param5, param3);
        this.layoutIconLabel(param4, (byte) -97, param2);
        if (!param1) {
          this.layoutIconLabel(-47, (byte) 126, 26);
        }
    }

    private final void layoutIconLabel(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        var4 = -param0;
        if (this.icon != null) {
          var4 = this.icon.getContentWidth(true);
        }
        var5 = -param0;
        if (this.label != null) {
          var5 = this.label.measureContentWidth(-100, -param2 + (-param0 + this.width + (-param2 - var4)));
        }
        var6 = param2 + (param0 + var4 + (param2 + var5));
        if (var6 > this.width) {
          var5 = var5 + (this.width - var6);
          var6 = this.width;
        }
        if (this.horizontalAlignment == 1) {
          param2 = param2 + (-var6 + this.width) / 2;
        }
        if (2 == this.horizontalAlignment) {
          param2 = param2 + (-var6 + this.width);
        }
        if (this.icon != null) {
          this.icon.setBounds(0, 2147483647, param2, var4, this.height);
          this.icon.verticalAlignment = this.verticalAlignment;
        }
        if (this.label != null) {
          this.label.setBounds(0, 2147483647, param0 + param2 + var4, var5, this.height);
          if (this.icon != null) {
            this.label.horizontalAlignment = 0;
          } else {
            this.label.horizontalAlignment = this.horizontalAlignment;
          }
          this.label.verticalAlignment = this.verticalAlignment;
        }
        if (param1 > -78) {
          this.label = (UiComponent) null;
        }
    }

    final static void c(boolean param0) {
        IntrusiveDequeCursor var1 = null;
        ChatMessageLine var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          if (MatchingTextValidator.field_r.isEmpty(0)) {
            return;
          }
          var1 = new IntrusiveDequeCursor(MatchingTextValidator.field_r);
          var2 = (ChatMessageLine) (var1.last((byte) -92));
          if (var2.field_v) {
            var2.field_q = 16;
          }
          while (var2 != null) {
            if (var2.field_v &&
              var2.field_p >= 230) {
              var2.unlink((byte) -117);
            }
            var2 = (ChatMessageLine) (var1.previous(-117));
          }
          if (param0) {
            AlignedIconLabel.releaseStatics((byte) 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "uo.C(" + param0 + ')');
        }
    }

    static {
        playerNameBallInHand = "<%0>: Ball-in-hand!";
        field_Qb = -1;
    }
}
