/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    private fl[] field_f;
    static ed[] field_a;
    private int field_d;
    private fl field_b;
    static String[] field_i;
    static String field_e;
    static String field_c;
    private long field_h;
    static hh field_g;

    final void a(long param0, fl param1, int param2) {
        fl var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param1.field_i) {
            param1.d(-39);
          }
          var5 = this.field_f[(int)(param0 & (long)(this.field_d - 1))];
          param1.field_j = var5;
          param1.field_i = var5.field_i;
          param1.field_i.field_j = param1;
          param1.field_j.field_i = param1;
          param1.field_p = param0;
          if (param2 <= 24) {
            nn.b((byte) -113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("nn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 <= 48) {
          field_g = (hh) null;
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

    final fl a(int param0, long param1) {
        fl var4;
        fl var5;
        int var6;
        fl var4Lifetime1;
        fl var5Lifetime1;
        var6 = EscapeVector.field_A;
        if (param0 <= -4) {
          this.field_h = param1;
          var4 = this.field_f[(int)(param1 & (long)(this.field_d - 1))];
          this.field_b = var4.field_j;
          while (true) {
            if (var4 == this.field_b) {
              this.field_b = null;
              return null;
            }
            if (~this.field_b.field_p != ~param1) {
              this.field_b = this.field_b.field_j;
              continue;
            }
            break;
          }
          var5 = this.field_b;
          this.field_b = this.field_b.field_j;
          return var5;
        }
        this.field_h = 26L;
        this.field_h = param1;
        var4Lifetime1 = this.field_f[(int)(param1 & (long)(this.field_d - 1))];
        this.field_b = var4Lifetime1.field_j;
        while (true) {
          if (var4Lifetime1 == this.field_b) {
            this.field_b = null;
            return null;
          }
          if (~this.field_b.field_p != ~param1) {
            this.field_b = this.field_b.field_j;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_b;
        this.field_b = this.field_b.field_j;
        return var5Lifetime1;
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param0.getGraphics();
            md.field_D.a(param1, param2 ^ param2, param3, var4);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_6_0 = var4_ref2;
          stackIn_6_1 = new StringBuilder().append("nn.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final fl a(byte param0) {
        fl var3 = null;
        int var4 = EscapeVector.field_A;
        if (null == this.field_b) {
          return null;
        }
        fl var2 = this.field_f[(int)((long)(this.field_d - 1) & this.field_h)];
        while (this.field_b != var2) {
          if (this.field_h == this.field_b.field_p) {
            var3 = this.field_b;
            this.field_b = this.field_b.field_j;
            return var3;
          }
          this.field_b = this.field_b.field_j;
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
        int var2 = 0;
        fl dupTemp$0 = null;
        fl var3 = null;
        this.field_f = new fl[param0];
        this.field_d = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new fl();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.field_j = var3;
          var3.field_i = var3;
        }
    }

    static {
        field_c = "Power-up is on hill - please land closer";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
