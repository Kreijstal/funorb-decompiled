/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    private int field_c;
    private int[] field_j;
    qj field_f;
    private qj[] field_e;
    static byte[][] spriteIndices;
    int field_d;
    private int[] field_i;
    private int field_g;
    int field_h;
    private int field_b;

    private final void a(boolean param0, byte param1) {
        int var5 = 0;
        PcmSampleStream[] var8 = ValidatedTextWidget.field_K;
        PcmSampleStream[] var3 = var8;
        if (0 > this.field_d ||
          var8.length <= this.field_d) {
          return;
        }
        if (param1 >= -20) {
          return;
        }
        PcmSampleStream var4 = var8[this.field_d];
        if (var4 == null) {
          return;
        }
        if (param0) {
          var5 = 256;
          var4.fadeOut(var5);
          var8[this.field_d] = null;
        } else {
          var5 = 256;
          int var6 = IterableNodeHashTable.field_c * 6144 / 64;
          int var7 = 16384 * this.field_f.field_h / 640;
          var4.rampVolumeAndPanQ6(var5, var6, var7);
        }
    }

    private final int a(qj param0, qj param1, byte param2) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          double var4_double = this.a(84, param0, param1);
          int var6 = 99 % ((param2 + 53) / 62);
          int var7 = (int)(var4_double * 0.2 + 0.5);
          int stackIn_1_0 = var7;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var4;
          StringBuilder stackIn_4_1 = new StringBuilder().append("qe.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int[] param0, byte param1) {
        int var7 = EscapeVector.obfuscationControl;
        int var3_int = param0.length / 2;
        this.field_e = new qj[var3_int];
        for (int var4 = 0; var4 < var3_int; var4++) {
          int var5 = param0[var4 * 2];
          int var6 = param0[var4 * 2 + 1];
          this.field_e[var4] = new qj(var5, var6);
        }
        if (param1 <= 15) {
          return;
        }
        try {
          this.field_f = this.field_e[0];
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qe.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, Sprite[] param3, int param4, int param5) {
        int var12 = EscapeVector.obfuscationControl;
        if (param3 == null ||
          param2 <= 0) {
          return;
        }
        try {
          int var6_int = param3[0].fullWidth;
          int var7 = param3[2].fullWidth;
          int var8 = param3[1].fullWidth;
          param3[0].f(param5, param1, param4);
          param3[2].f(-var7 + (param2 + param5), param1, param4);
          SoftwareRasterizer.a(sf.field_m);
          SoftwareRasterizer.h(var6_int + param5, param1, -var7 + param2 + param5, param3[1].fullHeight + param1);
          int var9 = param5 + var6_int;
          int var10 = param5 + (param2 - var7);
          param5 = var9;
          int var11 = -59 / ((11 - param0) / 32);
          while (param5 < var10) {
            param3[1].f(param5, param1, param4);
            param5 = param5 + var8;
          }
          SoftwareRasterizer.b(sf.field_m);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qe.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = this.field_i[param0];
        SoftwareRasterizer.d(this.field_f.field_h, this.field_f.field_b, this.field_b, var3);
        var3 = this.field_j[param0];
        SoftwareRasterizer.a(this.field_f.field_h, this.field_f.field_b, this.field_b, var3);
        if (param1 != -92) {
          this.field_j = (int[]) null;
        }
        String var4 = Integer.toString(this.field_d + 1);
        fh.field_g.drawCentered(var4, 1 + (this.field_f.field_h - 1), -2 + this.field_f.field_b + this.field_b, this.field_g, -1);
        fh.field_g.drawCentered(var4, 1 + this.field_f.field_h + 1, -2 + (this.field_f.field_b + this.field_b), this.field_g, -1);
        fh.field_g.drawCentered(var4, this.field_f.field_h + 1, -1 + this.field_b + (this.field_f.field_b - 2), this.field_g, -1);
        fh.field_g.drawCentered(var4, 1 + this.field_f.field_h, -1 + (this.field_b + this.field_f.field_b), this.field_g, -1);
        fh.field_g.drawCentered(var4, 1 + this.field_f.field_h, -2 + (this.field_b + this.field_f.field_b), this.field_c, -1);
    }

    private final int a(boolean param0, int param1, int param2) {
        int var10 = EscapeVector.obfuscationControl;
        int var4 = this.field_e.length;
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        if (!param0) {
          this.field_b = 83;
        }
        int var8 = this.field_i[param1];
        while (0 < param2) {
          if (var4 > (1 + var5)) {
            qj var12 = this.field_e[var5 + 1];
            qj var11 = this.field_e[var5];
            int var9 = this.a(var11, var12, (byte) -128);
            qj var13 = this.a(var12, true, param2, var11, var9);
            param2 = param2 - var9;
            SoftwareRasterizer.d(var11.field_h, var11.field_b, var13.field_h, var13.field_b, var8);
            if (param2 > 0) {
              var5++;
              continue;
            }
          }
          break;
        }
        boolean stackIn_13_0 = (param2 > 0);
        boolean var9Lifetime1 = stackIn_13_0;
        if (var9Lifetime1) {
          qj var14 = this.field_e[var4 - 1];
          SoftwareRasterizer.a(-1 + var14.field_h, -1 + var14.field_b, 3, 3, var8);
        }
        this.a((var9Lifetime1), (byte) -66);
        return param2;
    }

    private final qj a(qj param0, boolean param1, int param2, qj param3, int param4) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param4 > param2) {
            bn.field_a.field_b = param2 * (-param3.field_b + param0.field_b) / param4 + param3.field_b;
            bn.field_a.field_h = param2 * (-param3.field_h + param0.field_h) / param4 + param3.field_h;
          } else {
            bn.field_a.field_h = param0.field_h;
            bn.field_a.field_b = param0.field_b;
          }
          if (!param1) {
            qj var7 = (qj) null;
          }
          qj stackIn_6_0 = bn.field_a;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6;
          StringBuilder stackIn_9_1 = new StringBuilder().append("qe.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          spriteIndices = (byte[][]) null;
        }
        spriteIndices = (byte[][]) null;
    }

    final static int a(int[] param0, int param1, boolean param2, int[] param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          if (!param2) {
            Sprite[] var5 = (Sprite[]) null;
            qe.a(107, 78, 55, (Sprite[]) null, 95, 113);
          }
          qg.a(param3, 0, param0, param1, param3.length);
          param1 = param1 + param3.length;
          int stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qe.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = !param0 ? kh.field_b : bo.field_E;
        int var4 = mj.field_d;
        if (this.field_h > var4) {
          return;
        }
        if (param1 != -1) {
          this.field_d = 26;
        }
        var4 = -this.field_h + var4;
        var4 = this.a(true, var3, var4);
        this.a(var3, (byte) -92);
    }

    final static int a(int param0) {
        if (fc.field_a < 2) {
          return 0;
        }
        if (ff.field_h != 0) {
          if (null != PasswordValidator.field_p) {
            if (!PasswordValidator.field_p.ensureIndex(0)) {
              return 14;
            }
            if (!PasswordValidator.field_p.hasGroupName("", (byte) -111)) {
              return 29;
            }
            if (!PasswordValidator.field_p.tryLoadNamedGroup(0, "")) {
              return 29;
            }
          }
          if (!ii.field_a.ensureIndex(0)) {
            return 43;
          }
          if (!ii.field_a.tryLoadNamedGroup(0, "commonui")) {
            return 57;
          }
          if (!w.field_ab.ensureIndex(0)) {
            return 71;
          }
          if (!w.field_ab.tryLoadNamedGroup(0, "commonui")) {
            return 80;
          }
          if (!pl.field_j.ensureIndex(0)) {
            return 82;
          }
          if (!pl.field_j.tryLoadAllGroups((byte) -119)) {
            return 86;
          }
        } else {
          if (!ii.field_a.ensureIndex(0)) {
            return 20;
          }
          if (!ii.field_a.tryLoadNamedGroup(0, "commonui")) {
            return 40;
          }
          if (!w.field_ab.ensureIndex(0)) {
            return 50;
          }
          if (!w.field_ab.tryLoadNamedGroup(0, "commonui")) {
            return 60;
          }
          if (!pl.field_j.ensureIndex(0)) {
            return 70;
          }
          if (!pl.field_j.tryLoadAllGroups((byte) -119)) {
            return 80;
          }
        }
        if (param0 < -8) {
          return 100;
        }
        return -98;
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = -this.field_f.field_h + param1;
        int var5 = -this.field_f.field_b + param0;
        int var6 = var4 * var4 + var5 * var5;
        int var7 = (param2 + this.field_b) * this.field_b;
        boolean var8 = (var6 <= var7);
        return (var8);
    }

    private final double a(int param0, qj param1, qj param2) {
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          if (param0 <= 75) {
            double stackIn_2_0 = 0.7839713364957465;
            return stackIn_2_0;
          }
          int var4_int = param2.field_h - param1.field_h;
          int var5 = -param1.field_b + param2.field_b;
          int var6 = var4_int * var4_int + var5 * var5;
          double stackIn_4_0 = Math.sqrt((double)var6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var4;
          StringBuilder stackIn_7_1 = new StringBuilder().append("qe.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          spriteIndices = (byte[][]) null;
        }
        rd.field_c.a(new l(), 30);
    }

    qe(int param0, int[] param1, int param2, int[] param3, int[] param4, int param5, int param6, BinaryBitmapFont param7) {
        try {
          this.field_d = param0;
          this.a(param1, (byte) 121);
          this.field_h = 5 * (this.field_d + 1);
          this.field_j = param4;
          this.field_b = param2;
          this.field_c = param5;
          this.field_g = param6;
          this.field_i = param3;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qe.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
