/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    private DualLinkNode[] field_f;
    static Sprite[] field_a;
    private int field_d;
    private DualLinkNode field_b;
    static String[] field_i;
    static String field_e;
    static String field_c;
    private long field_h;
    static PcmSample field_g;

    final void a(long param0, DualLinkNode param1, int param2) {
        String stackIn_8_2 = null;
        try {
          if (null != param1.secondaryPrevious) {
            param1.unlinkSecondary(-39);
          }
          DualLinkNode var5 = this.field_f[(int)(param0 & (long)(this.field_d - 1))];
          param1.secondaryNext = var5;
          param1.secondaryPrevious = var5.secondaryPrevious;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryNext.secondaryPrevious = param1;
          param1.secondaryKey = param0;
          if (param2 <= 24) {
            nn.releaseStatics((byte) -113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("nn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_c = null;
        if (guard <= 48) {
          field_g = (PcmSample) null;
          field_g = null;
          field_a = null;
          field_i = null;
          field_e = null;
          return;
        }
        field_g = null;
        field_a = null;
        field_i = null;
        field_e = null;
    }

    final DualLinkNode a(int param0, long param1) {
        int var6 = EscapeVector.obfuscationControl;
        if (param0 <= -4) {
          this.field_h = param1;
          DualLinkNode var4 = this.field_f[(int)(param1 & (long)(this.field_d - 1))];
          this.field_b = var4.secondaryNext;
          while (true) {
            if (var4 == this.field_b) {
              this.field_b = null;
              return null;
            }
            if (~this.field_b.secondaryKey != ~param1) {
              this.field_b = this.field_b.secondaryNext;
              continue;
            }
            break;
          }
          DualLinkNode var5 = this.field_b;
          this.field_b = this.field_b.secondaryNext;
          return var5;
        }
        this.field_h = 26L;
        this.field_h = param1;
        DualLinkNode var4Lifetime1 = this.field_f[(int)(param1 & (long)(this.field_d - 1))];
        this.field_b = var4Lifetime1.secondaryNext;
        while (true) {
          if (var4Lifetime1 == this.field_b) {
            this.field_b = null;
            return null;
          }
          if (~this.field_b.secondaryKey != ~param1) {
            this.field_b = this.field_b.secondaryNext;
            continue;
          }
          break;
        }
        DualLinkNode var5Lifetime1 = this.field_b;
        this.field_b = this.field_b.secondaryNext;
        return var5Lifetime1;
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            java.awt.Graphics var4 = param0.getGraphics();
            AlphaContainer.field_D.a(param1, param2 ^ param2, param3, var4);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4_ref2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("nn.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final DualLinkNode a(byte param0) {
        int var4 = EscapeVector.obfuscationControl;
        if (null == this.field_b) {
          return null;
        }
        DualLinkNode var2 = this.field_f[(int)((long)(this.field_d - 1) & this.field_h)];
        while (this.field_b != var2) {
          if (this.field_h == this.field_b.secondaryKey) {
            DualLinkNode var3 = this.field_b;
            this.field_b = this.field_b.secondaryNext;
            return var3;
          }
          this.field_b = this.field_b.secondaryNext;
        }
        if (param0 != -36) {
          this.a((byte) 87);
          this.field_b = null;
          return null;
        }
        this.field_b = null;
        return null;
    }

    nn(int param0) {
        this.field_f = new DualLinkNode[param0];
        this.field_d = param0;
        for (int var2 = 0; var2 < param0; var2++) {
          DualLinkNode dupTemp$0 = new DualLinkNode();
          DualLinkNode var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.secondaryNext = var3;
          var3.secondaryPrevious = var3;
        }
    }

    static {
        field_c = "Power-up is on hill - please land closer";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
