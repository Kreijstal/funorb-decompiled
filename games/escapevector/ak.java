/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    private dk[] field_k;
    private int[] field_a;
    static hf field_d;
    private int[][] field_b;
    private dk[] field_i;
    private dk[] field_j;
    private gj field_g;
    boolean field_h;
    int field_f;
    private int field_e;
    private int field_c;

    private final int[] a(int param0, int param1, int param2) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = new int[param0];
        int[] var4 = var7;
        for (int var5 = param2; param0 > var5; var5++) {
          var7[var5] = param1 + var5;
        }
        return var4;
    }

    private final void l(int param0) {
        if (param0 != -1) {
          this.b(true);
        }
        String var2 = this.j(0);
        this.field_g = this.a((byte) -103, var2);
        if (null != this.field_g) {
          this.e((byte) -96);
          this.field_g.c(2);
        }
        if (var2 != null) {
          int var3 = 320;
          int var4 = 240;
          int var5 = 6340704;
          fh.field_g.c(var2, var3, var4, var5, -1);
        }
    }

    private final void a(boolean param0, byte param1) {
        ol.field_N = null;
        CheckboxPainter.field_n = false;
        pl.field_q.b(param1 - 26357, param0);
        di.field_d = null;
        mj.field_d = 0;
        if (param1 != -123) {
          return;
        }
        gi.a((byte) -71);
    }

    private final int[] a(int[] param0, int param1, int[] param2, int[] param3) {
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param1 != 10) {
            this.e((byte) 114);
          }
          int[] var11 = new int[10];
          int[] var10 = var11;
          int[] var5 = var10;
          for (int var6 = 0; var6 < 10; var6++) {
            int var7 = param2[var6];
            if (var7 >= 0) {
              int var8 = 0;
              if (0 == var7 / 10) {
                var7 = var7 % 10;
                var8 = param3[var7];
              }
              if (var7 / 10 == 1) {
                var7 = var7 % 10;
                var8 = param0[var7];
              }
              var11[var6] = var8;
            }
          }
          int[] stackIn_16_0 = var5;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var5_ref;
          StringBuilder stackIn_19_1 = new StringBuilder().append("ak.T(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final boolean f(byte param0) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = this.k(-115);
        if (0 > var2) {
          return false;
        }
        if (param0 > -103) {
          this.h((byte) -110);
        }
        for (int var3 = 0; var3 < fh.field_d.length; var3++) {
          int var4 = fh.field_d[var3];
          if (var4 == var2) {
            if (var3 >= ti.field_a.length) {
              return false;
            }
            int var5 = ti.field_a[var3];
            this.field_c = var5;
            return true;
          }
        }
        return false;
    }

    final int h(int param0) {
        if (this.field_a == null) {
          return 0;
        }
        if (param0 < 29) {
          this.field_h = false;
        }
        return this.field_a.length;
    }

    private final boolean c(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = this.k(param0 ^ -17654);
        if (param0 != 17592) {
          this.field_k = (dk[]) null;
        }
        if (var2 < 0) {
          return false;
        }
        for (int var3 = 0; v.field_b.length > var3; var3++) {
          int var4 = v.field_b[var3];
          if (var4 == var2) {
            if (var4 == this.field_e) {
              return false;
            }
            ol.field_N = null;
            this.field_e = var4;
            this.h((byte) -122);
            return true;
          }
        }
        return false;
    }

    private final int b(byte param0) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = 0;
        if (param0 > -60) {
          this.field_j = (dk[]) null;
        }
        while (var2 < v.field_b.length) {
          int var3 = v.field_b[var2];
          if (this.field_e == var3) {
            return var2;
          }
          var2++;
        }
        return -1;
    }

    public static void c(byte param0) {
        field_d = null;
        if (param0 != 77) {
          field_d = (hf) null;
        }
    }

    private final void a(int param0, ij param1, ij param2, int param3, int param4) {
        if (param3 != 6144) {
          return;
        }
        try {
          int var6_int = jb.a(102, param4);
          int var7 = jb.a(param3 - 6045, param0);
          int[] var21 = this.a(var7, param2, param1, this.field_c, -17, this.field_c, var6_int);
          int[] var22 = this.a(param2.field_o[this.field_c], 10, var21, param1.field_o[this.field_c]);
          param1.field_o[this.field_c] = var22;
          String[] var10 = this.a((byte) 56, param2.field_m[this.field_c], var21, param1.field_m[this.field_c]);
          param1.field_m[this.field_c] = var10;
          long[] var23 = this.a(param2.field_k[this.field_c], param1.field_k[this.field_c], var21, true);
          param1.field_k[this.field_c] = var23;
          this.a((byte) 69, param4, var21, param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ak.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void m(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        if (this.field_b == null) {
          return;
        }
        for (int var2 = param0; this.field_b.length > var2; var2++) {
          this.field_b[var2] = null;
        }
    }

    private final int[] d(int param0, int param1, int param2) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = new int[param0];
        int[] var4 = var7;
        for (int var5 = param2; var5 < var7.length; var5++) {
          var7[var5] = param1;
        }
        return var4;
    }

    private final int d(int param0) {
        int var2 = 115;
        if (null == this.field_k ||
          this.field_k.length == 0) {
          return var2;
        }
        dk var3 = this.field_k[0];
        if (var3 == null) {
          return var2;
        }
        int var2Lifetime1 = 3 + var3.field_l + var3.field_i;
        if (param0 <= 29) {
          String[] var4 = (String[]) null;
          String[] discarded$0 = this.a((byte) -18, (String[]) null, (int[]) null, (String[]) null);
        }
        return var2Lifetime1;
    }

    private final int i(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (0 <= this.field_c &&
          ti.field_a.length > this.field_c) {
          int var3 = -38 / ((29 - param0) / 43);
          for (int var2 = 0; var2 < ti.field_a.length; var2++) {
            if (this.field_c == ti.field_a[var2] &&
              fh.field_d.length >= var2) {
              int var4 = fh.field_d[var2];
              return var4;
            }
          }
          return -1;
        }
        return -1;
    }

    final void a(boolean param0) {
        SoftwareRasterizer.clearFramebuffer();
        SelfDestructEffects.b(2);
        this.l(-1);
        pb.a(4);
        if (param0) {
          return;
        }
        this.b(true);
    }

    private final void i(byte param0) {
        if (param0 >= -52) {
          return;
        }
        ij[] var5 = ol.field_N;
        ij[] var2 = var5;
        if (var2 != null) {
          if (var5.length == 0) {
            return;
          }
          int var3 = this.b((byte) -92);
          int[] var4 = RasterBuffer.field_a[var3];
          if (1 == var5.length) {
            this.field_b[this.field_c] = this.d(10, var4[0], 0);
            return;
          }
          this.a(var4[1], var5[0], var5[1], 6144, var4[0]);
          return;
        }
    }

    private final int k(int param0) {
        int var2 = di.field_d.field_h;
        if (var2 >= 0 &&
          var2 < this.field_a.length) {
          if (param0 > -77) {
            return 85;
          }
          int var3 = this.field_a[var2];
          return var3;
        }
        return -1;
    }

    private final boolean e(int param0) {
        int var6 = EscapeVector.obfuscationControl;
        ij[] var7 = ol.field_N;
        ij[] var2 = var7;
        if (var2 != null &&
          var7.length != 0) {
          ij[] var3 = var7;
          for (int var4 = param0; var4 < var3.length; var4++) {
            ij var5 = var3[var4];
            if (var5 == null) {
              return false;
            }
            if (!var5.field_l) {
              return false;
            }
          }
          return true;
        }
        return false;
    }

    private final long[] a(long[] param0, long[] param1, int[] param2, boolean param3) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          long[] var12 = new long[10];
          long[] var11 = var12;
          long[] var5 = var11;
          for (int var6 = 0; var6 < 10; var6++) {
            int var7 = param2[var6];
            if (var7 >= 0) {
              long var8 = 0L;
              if (var7 / 10 == 0) {
                var7 = var7 % 10;
                var8 = param1[var7];
              }
              if (var7 / 10 == 1) {
                var7 = var7 % 10;
                var8 = param0[var7];
              }
              var12[var6] = var8;
            }
          }
          if (!param3) {
            this.field_f = -56;
          }
          long[] stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("ak.FA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    private final gj a(byte param0, String param1) {
        String stackIn_3_0 = null;
        String stackIn_35_2 = null;
        try {
          int var3_int = this.d(77);
          if (aj.b(-123)) {
            stackIn_3_0 = IntrusiveNode.field_a;
          } else {
            stackIn_3_0 = DialogueScreen.field_G;
          }
          String var4 = stackIn_3_0;
          int stackIn_6_0 = (aj.b(-104)) ? 10551200 : 6340704;
          int var5 = stackIn_6_0;
          if (param1 == wk.field_f && (this.field_g == null ||
            this.field_g.field_o != 0)) {
            this.field_g = new gj(this.field_e, var3_int, this.field_h);
            this.field_g.a(3, var4, var5);
          }
          if (param1 == le.field_b && (null == this.field_g ||
            this.field_g.field_o != 0)) {
            this.field_g = new gj(this.field_e, var3_int, this.field_h);
            this.field_g.a(3, var4, var5);
          }
          if (param0 > -66) {
            this.field_b = (int[][]) null;
          }
          if (bd.field_m == param1 && (this.field_g == null ||
            0 != this.field_g.field_o)) {
            this.field_g = new gj(this.field_e, var3_int, this.field_h);
            this.field_g.a(3, var4, var5);
          }
          if (param1 == null && (this.field_g == null ||
            this.field_g.field_o != 1 ||
            this.field_c != this.field_g.field_p)) {
            this.a(var5, var3_int, var4, (byte) -10);
          }
          gj stackIn_31_0 = this.field_g;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_34_0 = var3;
          StringBuilder stackIn_34_1 = new StringBuilder().append("ak.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final void c(boolean param0) {
        if (di.field_d.field_e) {
          dk var2 = this.j((byte) 82);
          int var3 = nk.a(-122, var2);
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * qm.field_c / 64, var3);
        }
        if (param0) {
          String discarded$0 = this.g((byte) 4);
        }
    }

    private final String a(int param0) {
        int var13 = EscapeVector.obfuscationControl;
        Object var2 = wk.field_f;
        String var3 = bd.field_m;
        ij[] var4 = ol.field_N;
        if (var4 != null &&
          var4.length != 0) {
          ij[] var5 = var4;
          int var6 = 0;
          int var7 = 80 / ((param0 + 34) / 35);
          while (true) {
            if (var6 >= var5.length) {
              return (String) (var2);
            }
            ij var8 = var5[var6];
            if (var8 == null) {
              return var3;
            }
            String[][] var9 = var8.field_m;
            if (var9 == null) {
              return var3;
            }
            if (this.field_c >= 0 &&
              this.field_c < var9.length) {
              if (var9[this.field_c] == null) {
                return var3;
              }
              String[] var10 = var9[this.field_c];
              for (int var11 = 0; var11 < var10.length; var11++) {
                String var12 = var10[var11];
                if (var12 != null) {
                  var2 = null;
                }
              }
              var6++;
              continue;
            }
            break;
          }
          return var3;
        }
        return var3;
    }

    private final dk j(byte param0) {
        int var2 = di.field_d.field_h;
        dk var3 = TetherHumStream.a(this.field_k, var2, 0);
        if (var3 != null) {
          return var3;
        }
        if (param0 <= 65) {
          boolean discarded$0 = this.c(-122);
        }
        var3 = TetherHumStream.a(this.field_i, var2, 0);
        if (var3 != null) {
          return var3;
        }
        var3 = TetherHumStream.a(this.field_j, var2, 0);
        if (var3 == null) {
          return null;
        }
        return var3;
    }

    private final int[] a(int param0, ij param1, ij param2, int param3, int param4, int param5, int param6) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        int var15 = EscapeVector.obfuscationControl;
        try {
          int var10 = -77 / ((param4 - 78) / 43);
          int[] var21 = ua.a(param6, true, param5, param2);
          int[] var17 = var21;
          int[] var8 = var17;
          int[] var22 = ua.a(param0, true, param3, param1);
          int[] var18 = var22;
          int[] var9 = var18;
          int var11 = var21.length + var22.length;
          int[] var24 = new int[var11];
          int[] var20 = var24;
          int[] var12 = var20;
          qg.a(var8, 0, var12, 0, var21.length);
          qg.a(var9, 0, var12, var21.length, var22.length);
          int[] var26 = new int[var11];
          for (int var14 = 0; var14 < var26.length; var14++) {
            var26[var14] = var14;
          }
          uk.a(-1, var24, var26);
          int[] var16 = this.a(var26, 12);
          int[] stackIn_5_0 = var16;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var8_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ak.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final int[] a(int param0, int param1, int param2, int param3) {
        int var8 = EscapeVector.obfuscationControl;
        int[] var9 = new int[param2];
        int[] var5 = var9;
        int var6 = 40 % ((11 - param1) / 39);
        for (int var7 = 0; var7 < param2; var7++) {
          var9[var7] = param3 + var7 * param0;
        }
        return var5;
    }

    private final void b(int param0) {
        if (mj.field_d == 0) {
          sj.a(8192, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (param0 != 100) {
          this.field_j = (dk[]) null;
        }
        if (!aj.b(-122)) {
          if (mj.field_d == 0) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, qm.field_c * 6144 / 64, 5120);
          }
          if (10 == mj.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
          }
          if (mj.field_d == 20) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, 6144 * qm.field_c / 64, 11264);
          }
          if (30 == mj.field_d) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, qm.field_c * 6144 / 64, 8192);
          }
        } else {
          if (mj.field_d == 0) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
          }
          if (mj.field_d == 10) {
            ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, 6144 * qm.field_c / 64, 8192);
          }
        }
        if (mj.field_d < 1000) {
          mj.field_d = mj.field_d + 1;
        }
    }

    final int c(int param0, int param1, int param2) {
        int var4 = DebouncedValidator.a(param2, -121, this.field_k, param0);
        if (0 <= var4) {
          return var4;
        }
        var4 = DebouncedValidator.a(param2, -94, this.field_i, param0);
        if (0 <= var4) {
          return var4;
        }
        var4 = DebouncedValidator.a(param2, param1 ^ 108, this.field_j, param0);
        if (param1 >= ~var4) {
          return var4;
        }
        return -1;
    }

    final boolean f(int param0) {
        int var2 = -60 / ((param0 + 22) / 35);
        this.b(100);
        boolean var3 = (this.a((byte) 3));
        if (var3) {
          return (var3);
        }
        di.field_d.a(this.c(sf.field_c, -1, ng.field_ob), (byte) 120, this.c(dh.field_d, -1, UiContainer.field_y));
        this.c(false);
        boolean var3Lifetime1 = (this.a(true, Js5NetworkRequest.a((byte) 15, -1), (byte) 79));
        return (var3Lifetime1);
    }

    private final int[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ih param7, int param8) {
        String stackIn_7_2 = null;
        try {
          if (param5 >= -27) {
            String discarded$1 = this.g((byte) 98);
          }
          int[] var16 = new int[]{0};
          int[] var10 = var16;
          String[] var11 = new String[]{GameKeyHandler.field_a};
          int var12 = var16.length;
          int[] var26 = this.b(var12, param3, 10);
          int[] var28 = this.a(param0, -47, var12, param4);
          int[] var27 = this.a(var12, param1, 0);
          this.field_j = DynamicTerrainRenderer.a(param2 + (-param8 + 1), var26, param6, param8, param7, var11, var27, false, var28);
          int[] stackIn_3_0 = var10;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var10_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("ak.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param8).append(')').toString());
        }
    }

    private final void g(int param0) {
        if (param0 != -1) {
          return;
        }
        if (!aj.b(-119)) {
          return;
        }
        pa.a(true);
        mj.field_d = 0;
        gi.a((byte) -94);
    }

    private final void h(byte param0) {
        ih var18 = fh.field_g;
        int var3 = 640;
        int var4 = 0;
        int var5 = 10;
        int var6 = 10;
        int var7 = 1;
        int var8 = 78;
        int var9 = var8;
        int[] var10 = this.a(var7, 0, var9, 0, var5, var6, var18, var3 - 1, var4);
        dk var19 = this.field_k[0];
        var9 = var9 + (var19.field_i + 3);
        this.field_g = new gj(this.field_e, var9, this.field_h);
        int var12 = (var3 - this.field_g.field_m) / 2;
        var9 = var9 + (3 + this.field_g.field_c);
        int var13 = var12 + this.field_g.field_m;
        int[] var28 = this.a(var7, var12, var8, 0, var5, var6, var18, var13, var4);
        var5 = var5 + var28.length;
        var4 = var4 + var28.length;
        int[] var29 = this.a(var18, var6, var5, var13, var12, 98, var4, var7, var9);
        var5 = var5 + var29.length;
        var4 = var4 + var29.length;
        dk var21 = this.field_i[0];
        var9 = var9 + (var21.field_i + 20);
        int[] var30 = this.a(var6, var7, var3 - 1, var4, var5, -28, var9, var18, 0);
        int var16 = var28.length - (-var29.length - var30.length);
        int var4Lifetime1 = 0;
        this.field_a = new int[var16];
        var4Lifetime1 = qe.a(this.field_a, var4Lifetime1, true, var28);
        var4Lifetime1 = qe.a(this.field_a, var4Lifetime1, true, var29);
        qe.a(this.field_a, var4Lifetime1, true, var30);
        gn.a(this.field_k, true, (byte) 41);
        if (param0 > -120) {
          this.field_a = (int[]) null;
        }
        gn.a(this.field_i, !aj.b(-102) ? true : false, (byte) 41);
        gn.a(this.field_j, false, (byte) 41);
        this.field_g = null;
    }

    private final int[] a(int[] param0, int param1) {
        String stackIn_11_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int[] var7 = new int[param0.length];
          int[] var3 = var7;
          int var4 = -1 + param0.length;
          int var5 = 0;
          while (var4 >= 0) {
            int incrementValue$1 = var5;
            var5++;
            var7[incrementValue$1] = param0[var4];
            var4--;
          }
          if (param1 != 12) {
            this.b(-32);
          }
          int[] stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ak.UA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int[] param2, int param3) {
        String stackIn_17_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          this.field_b[this.field_c] = new int[10];
          for (int var5_int = 0; var5_int < 10; var5_int++) {
            int var6 = param2[var5_int];
            if (var6 >= 0) {
              int var7 = 0;
              if (var6 / 10 == 0) {
                var7 = param1;
              }
              if (1 == var6 / 10) {
                var7 = param3;
              }
              this.field_b[this.field_c][var5_int] = var7;
            }
          }
          int var5_intLifetime1 = -68 % ((-21 - param0) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ak.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte param0) {
        int var4 = EscapeVector.obfuscationControl;
        if (param0 != 3) {
          String var5 = (String) null;
          this.a(-127, 66, (String) null, (byte) -74);
        }
        boolean var2 = false;
        while (pn.p(-110)) {
          di.field_d.a(127);
          qk.a(this.field_a, param0 ^ 3);
          if (nk.field_n == 13) {
            int var3 = this.a(1, 0);
            di.field_d.a(false, var3);
          }
          boolean stackIn_10_0 = !(!this.a(false, Js5NetworkRequest.a((byte) 15, nk.field_n), (byte) 96));
          var2 = stackIn_10_0;
          if (var2) {
            return (var2);
          }
        }
        return (var2);
    }

    private final int[] a(int param0, int param1, int param2, int param3, int param4, int param5, ih param6, int param7, int param8) {
        int[] var10 = null;
        String[] var11 = null;
        String stackIn_8_2 = null;
        try {
          String[] var12 = mg.field_h;
          if (!UiContainer.e((byte) 103)) {
            var10 = new int[]{5};
            var11 = new String[]{var12[0]};
          } else {
            var10 = v.field_b;
            var11 = var12;
          }
          int var13 = var10.length;
          int[] var26 = this.b(var13, param8, 10);
          int[] var28 = this.a(param5, param3 ^ 115, var13, param4);
          int[] var27 = this.a(var13, param0, param3 ^ param3);
          this.field_k = DynamicTerrainRenderer.a(param7 + (-param1 + 1), var26, param2, param1, param6, var11, var27, false, var28);
          int[] stackIn_4_0 = var10;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var10_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ak.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var4 = EscapeVector.obfuscationControl;
        if (param0 != 1) {
          int[] var5 = (int[]) null;
          int[] discarded$0 = this.a((int[]) null, -63, (int[]) null, (int[]) null);
        }
        for (int var3 = 0; this.field_a.length > var3; var3++) {
          if (this.field_a[var3] == param1) {
            return var3;
          }
        }
        return -1;
    }

    private final String g(byte param0) {
        int var9 = EscapeVector.obfuscationControl;
        String var2 = bd.field_m;
        ij[] var3 = ol.field_N;
        if (var3 != null &&
          var3.length != 0) {
          ij[] var4 = var3;
          int var5 = 73 / ((-1 - param0) / 44);
          int var6 = 0;
          while (true) {
            if (var4.length <= var6) {
              return null;
            }
            ij var7 = var4[var6];
            if (var7 == null) {
              return var2;
            }
            int[][] var11 = var7.field_o;
            int[][] var10 = var11;
            int[][] var8 = var10;
            if (var8 == null) {
              return var2;
            }
            if (this.field_c >= 0 &&
              this.field_c < var11.length) {
              if (null == var8[this.field_c]) {
                return var2;
              }
              var6++;
              continue;
            }
            break;
          }
          return var2;
        }
        return var2;
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        String stackIn_17_2 = null;
        try {
          if (null == this.field_b[this.field_c]) {
            this.i((byte) -107);
          }
          ij[] var8 = ol.field_N;
          ij[] var5 = var8;
          if (var5 != null &&
            var8.length != 0) {
            ij var6 = var8[0];
            if (var6 == null) {
              return;
            }
            ik var7 = IntValueNode.field_i;
            if (param3 != -10) {
              return;
            }
            this.field_g = new gj(var6, this.field_b[this.field_c], var7, this.field_c, this.field_e, param1, this.field_h);
            this.field_g.a(3, param2, param0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_16_0 = runtimeException;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ak.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    private final String[] a(byte param0, String[] param1, int[] param2, String[] param3) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          String[] var10 = new String[10];
          String[] var5 = var10;
          for (int var6 = 0; var6 < 10; var6++) {
            int var7 = param2[var6];
            String var8 = "";
            if (var7 / 10 == 0) {
              var7 = var7 % 10;
              var8 = param3[var7];
            }
            if (1 == var7 / 10) {
              var7 = var7 % 10;
              var8 = param1[var7];
            }
            var10[var6] = var8;
          }
          if (param0 != 56) {
            this.field_b = (int[][]) null;
          }
          String[] stackIn_14_0 = var5;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("ak.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final int[] a(ih param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int[] var10 = null;
        String[] var11 = null;
        String stackIn_8_2 = null;
        try {
          if (!aj.b(-99)) {
            var10 = new int[]{2, 3, 4};
            var11 = AudioService.field_d;
          } else {
            var11 = new String[]{IntrusiveDeque.field_e};
            var10 = new int[]{1};
          }
          int var12 = var10.length;
          int var13 = -114 / ((-5 - param5) / 34);
          int[] var26 = this.b(var12, param6, 10);
          int[] var28 = this.a(param1, -47, var12, param2);
          int[] var27 = this.a(var12, param7, 0);
          this.field_i = DynamicTerrainRenderer.a(1 + (-param4 + param3), var26, param8, param4, param0, var11, var27, false, var28);
          int[] stackIn_4_0 = var10;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var10_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ak.SA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void e(byte param0) {
        int stackIn_15_0 = 0;
        boolean decompiledFrameRemainder0 = true;
        int var2 = 20;
        int var3 = 12;
        int var4 = 12;
        int var5 = this.field_g.field_t - var2;
        int var6 = this.field_g.field_m + var5 + 2 * var2;
        Object var7 = null;
        if (this.field_k != null) {
          if (this.field_k.length >= 1 &&
            null != this.field_k[0]) {
            dk var15 = this.field_k[0];
            if (param0 >= -81) {
              this.field_c = -52;
            }
            int var8 = -var3 + var15.field_l;
            decompiledFrameRemainder0 = (this.field_i != null);
            if (decompiledFrameRemainder0) {
              if (this.field_i.length >= 1 &&
                this.field_i[0] != null) {
                dk var16 = this.field_i[0];
                int var9 = var16.field_l + var16.field_i + var4;
                int var10 = mj.field_d;
                stackIn_15_0 = (var10 < 40) ? (40 - var10) : (0);
                int var11 = stackIn_15_0;
                int var12 = 0;
                int var13 = 3162160;
                int var14 = 6324320;
                fc.a(var11, var5, var6, var9, true, 29788, false, var14, var13, var12, var8, true);
                return;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            return;
          }
        }

    }

    private final void a(boolean param0, int param1) {
        this.field_e = 5;
        if (hi.a(param1, -2)) {
          this.field_e = 5;
        }
        if (!UiContainer.e((byte) 98)) {
          return;
        }
        if (param1 == 2) {
          this.field_e = 6;
        }
        if (!param0) {
          this.field_i = (dk[]) null;
        }
        if (3 == param1) {
          this.field_e = 7;
        }
    }

    private final int[] b(int param0, int param1, int param2) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var8 = new int[param0];
        int[] var4 = var8;
        for (int var5 = 0; var5 < param0; var5++) {
          var8[var5] = var5 + param1;
        }
        if (param2 != 10) {
          ih var7 = (ih) null;
          int[] discarded$0 = this.a(-63, -54, -8, -112, -7, -16, (ih) null, -12, -123);
        }
        return var4;
    }

    private final boolean a(boolean param0, boolean param1, byte param2) {
        boolean var4 = false;
        if (param1) {
          if (this.f((byte) -123)) {
            return (var4);
          }
          if (this.c(17592)) {
            return (var4);
          }
          int var6 = this.k(-124);
          if (var6 == 0) {
            var4 = true;
            this.a(param0, (byte) -123);
            return (var4);
          }
          if (var6 == 1) {
            this.g(-1);
            var4 = true;
            return (var4);
          }
        }
        if (param2 < 77) {
          this.a(true, 117);
        }
        return (var4);
    }

    private final void d(byte param0) {
        int var6 = EscapeVector.obfuscationControl;
        int var2 = this.b((byte) -89);
        if (var2 < 0) {
          return;
        }
        if (!(var2 < RasterBuffer.field_a.length)) {
          return;
        }
        int[] var3 = RasterBuffer.field_a[var2];
        ij[] var4 = new ij[var3.length];
        for (int var5 = 0; var5 < var4.length; var5++) {
          var4[var5] = bk.a(var3[var5], true, 10, 3, 1);
          this.m(0);
        }
        ol.field_N = var4;
        if (param0 >= -74) {
          this.field_i = (dk[]) null;
        }
    }

    private final void b(boolean param0) {
        int var2 = this.a(1, this.field_e);
        if (!param0) {
          this.field_b = (int[][]) null;
        }
        int var3 = this.i(-74);
        int var4 = this.a(1, var3);
        int var5 = di.field_d.field_h;
        HudMessage.a(this.field_k, var2, var5, (byte) -55);
        HudMessage.a(this.field_i, var4, var5, (byte) -114);
        HudMessage.a(this.field_j, -1, var5, (byte) -97);
    }

    private final String j(int param0) {
        String var2 = wk.field_f;
        ij[] var3 = ol.field_N;
        if (aj.b(-123)) {
          return var2;
        }
        if (var3 == null) {
          this.d((byte) -83);
          this.field_g = null;
          return var2;
        }
        if (!this.e(param0)) {
          var2 = le.field_b;
          return var2;
        }
        var2 = this.a(48);
        if (var2 != null) {
          return var2;
        }
        var2 = this.g((byte) 86);
        return var2;
    }

    ak(boolean param0, int param1) {
        this.field_b = new int[ti.field_a.length][];
        this.field_h = param0 ? true : false;
        this.field_c = 0;
        this.a(true, param1);
        this.field_f = vh.f(121);
        this.h((byte) -126);
    }

    static {
        field_d = new hf();
    }
}
