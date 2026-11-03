/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationIndicator extends FocusableWidget {
    private ValidationSource field_G;
    static String field_H;
    static nk[] field_E;
    private int field_F;
    static String field_J;
    static AnimatedPanel field_K;
    static String field_D;
    static AnimatedPanel field_I;

    final static int a(int param0, int param1) {
        if (param0 >= -21) {
          return 83;
        }
        return (param1 - 100) / 200;
    }

    final static void a(IntrusiveDeque param0, boolean param1) throws jn {
        RuntimeException runtimeException = null;
        CandidateLink var3 = null;
        CandidateLink var4 = null;
        CandidateLink var5 = null;
        int var6 = 0;
        IntrusiveDeque var7 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param1) {
            ValidationIndicator.clearStatics((byte) -92);
          }
          var7 = new IntrusiveDeque();
          var3 = (CandidateLink) (param0.pollFirst(72));
          var4 = var3;
          var7.addLast((byte) -113, var4);
          while (!param0.isEmpty(-87)) {
            boolean decompiledFrameRemainder0 = true;
            if (null == var4.field_k) {
              var5 = (CandidateLink) (param0.startForward(0));
              while (var5 != null) {
                if (var5.field_r != null) {
                  var5 = (CandidateLink) (param0.nextForward((byte) -71));
                  continue;
                }
                break;
              }
              if (var5 != null) {
                var4 = var5;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (null == var3.field_r) {
                  var4 = var3;
                  decompiledFrameRemainder0 = false;
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (var4.field_r != null))) {
                  throw new jn("Border linkage incorrect: Can't find an unclipped edge.");
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (var4.field_k.field_r != var4) {
                throw new jn("Border linkage incorrect: v2.v1 != v");
              }
              var4 = var4.field_k;
            }
            if (var3 != var4) {
              var7.addLast((byte) -113, var4);
              continue;
            }
            break;
          }
          param0.field_h = var7.field_h;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_27_0 = runtimeException;
          stackIn_27_1 = new StringBuilder().append("hl.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearStatics(byte param0) {
        field_I = null;
        field_D = null;
        field_E = null;
        field_K = null;
        if (param0 <= 17) {
          field_H = (String) null;
        }
        field_H = null;
        field_J = null;
    }

    final String getTooltip(boolean param0) {
        if (this.field_k) {
          return this.field_G.a((byte) -63);
        }
        if (param0) {
          return null;
        }
        return (String) null;
    }

    final boolean containsWidget(byte param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 86 % ((61 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("hl.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final void updateHover(int param0, int param1, UiWidget param2, byte param3) {
        try {
          this.field_F = this.field_F + 1;
          super.updateHover(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "hl.PA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static Sprite[] a(byte param0, int param1) {
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = ShatteredPlansClient.field_F ? 1 : 0;
        RandomAccessCacheFile.a(-107);
        Sprite[] var16 = new Sprite[param1];
        Sprite[] var2 = var16;
        Sprite var3 = new Sprite(240, 120);
        int var4 = 0;
        if (param0 != 111) {
          ValidationIndicator.clearStatics((byte) 53);
        }
        while (var4 < param1) {
          var3.bindAsRenderTarget();
          SoftwareRasterizer.clear();
          for (var5 = 0; var5 < 4; var5++) {
            var6 = (double)(param1 * (3 + var5) + var4) * 6.283185307179586;
            var8 = Math.sin(var6 / (double)(param1 * 4));
            var10 = Math.cos(var6 / (double)(param1 * 4));
            var12 = (int)(12288.0 / (var10 + 3.0));
            var13 = 1920 + (int)(var8 * 2400.0 / (3.0 + var10));
            var14 = (int)(1920.0 / (3.0 + var10));
            e.field_e.drawRotatedAbout(e.field_e.field_o << 3, e.field_e.field_p << 3, var13, var14, 0, var12);
          }
          var2[var4] = new Sprite(60, 30);
          var16[var4].bindAsRenderTarget();
          var3.drawQuarterSize(0, 0);
          var4++;
        }
        cg.i(0);
        return var2;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        ValidationState var8;
        int var9;
        int var10;
        int var11;
        Sprite var12;
        Sprite var13;
        Sprite var14;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        super.drawLayer(param0, param1 + 0, param2, param3);
        if (param0 != 0) {
          return;
        }
        var5 = (this.field_x >> 1) + (param3 + this.field_m);
        var6 = (this.field_n >> 1) + param2 + this.field_q;
        if (param1 != -11857) {
          return;
        }
        var8 = this.field_G.c(param1 + 11730);
        if (pd.field_h != var8 &&
          lm.field_d != var8) {
          if (ArchiveSourceManager.field_b == var8) {
            var13 = MenuList.field_w[2];
            var13.c(-(var13.field_z >> 1) + var5, var6 - (var13.field_w >> 1), 256);
            return;
          }
          if (CachedArchiveSource.field_g != var8) {
            return;
          }
          var12 = MenuList.field_w[1];
          var12.c(-(var12.field_z >> 1) + var5, -(var12.field_w >> 1) + var6, 256);
          return;
        }
        var14 = MenuList.field_w[0];
        var9 = var14.field_o << 1;
        var10 = var14.field_p << 1;
        if (null != gg.field_e &&
          var9 <= gg.field_e.field_z &&
          gg.field_e.field_w >= var10) {
          aq.a((byte) 90, gg.field_e);
          SoftwareRasterizer.clear();
        } else {
          gg.field_e = new Sprite(var9, var10);
          aq.a((byte) -107, gg.field_e);
        }
        var14.drawRotatedAbout(112, 144, var14.field_o << 4, var14.field_p << 4, -this.field_F << 10, 4096);
        Star.f((byte) -94);
        gg.field_e.c(var5 - var14.field_o, -var14.field_p + var6, 256);
        return;
    }

    ValidationIndicator(ValidationSource param0) {
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = "Players: ";
        field_J = "Reject";
        field_D = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
