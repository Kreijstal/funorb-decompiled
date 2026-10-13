/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fn extends fw {
    static int field_M;
    private int field_O;
    private int field_L;
    static int[] field_Q;
    private int field_V;
    private long field_T;
    private int field_R;
    private long field_U;
    private boolean field_P;
    static String field_S;
    private boolean field_N;

    private final String o(int param0) {
        if (param0 >= -58) {
          return (String) null;
        }
        int var2 = this.field_O > this.field_L ? this.field_L : this.field_O;
        int var3 = this.field_O > this.field_L ? this.field_O : this.field_L;
        return this.text.substring(var2, var3);
    }

    private final int e(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 == this.field_O) {
          return this.field_O;
        }
        var2 = -1 + this.field_O;
        var3 = -88 / ((param0 - 11) / 55);
        while (0 < var2) {
          if (this.text.charAt(var2 - 1) != 32) {
            var2--;
            continue;
          }
          break;
        }
        return var2;
    }

    private final void b(boolean param0) {
        this.a((byte) -53);
        if (!param0) {
          this.field_V = 32;
        }
        this.j(1000);
    }

    private final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 1000) {
          return;
        }
        if (this.field_L != this.field_O) {
          var2 = this.field_O > this.field_L ? this.field_L : this.field_O;
          var3 = this.field_O <= this.field_L ? this.field_L : this.field_O;
          this.field_L = var2;
          this.field_O = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.d((byte) -123);
        }
    }

    void a(int param0, int param1, int param2, Widget param3) {
        TextWidgetPainter var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.l(param0 - 32722);
          if (1 == this.field_q) {
            if (this.painter instanceof TextWidgetPainter) {
              var5 = (TextWidgetPainter) ((Object) this.painter);
              var6 = var5.hitTestCharacter((Widget) (this), AiPlanningStrategy.pointerX, 113, param2, ko.pointerY, param1);
              if (var6 != -1) {
                if (this.field_P &&
                  this.field_V > var6 &&
                  var6 > this.field_L) {
                  var6 = this.field_V;
                }
                this.field_O = var6;
              }
            }
            this.field_U = vi.monotonicMillis(98);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fn.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(int param0) {
        if (param0 >= -46) {
          return;
        }
        if (this.field_x instanceof fb) {
          ((fb) (this.field_x)).a(this, 80);
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != -27934) {
            field_M = -84;
          }
          if (param1 == null) {
            param1 = "";
          }
          this.text = param1;
          var4_int = param1.length();
          if (this.field_R != -1 &&
            var4_int > this.field_R) {
            this.text = this.text.substring(0, this.field_R);
          }
          dupTemp$1 = this.text.length();
          this.field_L = dupTemp$1;
          this.field_O = dupTemp$1;
          if (!param0) {
            this.d((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var5 = null;
        MeshData var6 = null;
        int var8 = 0;
        String var9 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var9 = "";
          if (43 == param1) {
            param1 = 77;
          }
          if (param2 != -32596) {
            return;
          }
          if (!param0) {
            if (param1 == 16) {
              param1 = 78;
            }
            if (param1 == 25) {
              param1 = 79;
            }
            if (param1 == 48) {
              param1 = 80;
            }
            if (param1 == 85) {
              param1 = 89;
            }
          }
          if (param1 == 76) {
            bn.field_a = new ModelMeshBase[ActionRequest.field_m[param1].length];
            bn.field_a[0] = ActionRequest.unitModels[param1][0];
          }
          for (var4 = 1; var4 < ActionRequest.field_m[param1].length; var4++) {
            if (null == ActionRequest.unitModels[param1][var4]) {
              var5 = ActionRequest.field_m[param1][var4];
              var6 = hs.a(var5, param2 ^ -32697, var9);
              if (var6 != null) {
                if (th.a(var6, -17900)) {
                  DiskCacheRequest.unitProjectionVariants[param1] = true;
                }
                if (null != var6.faceRenderTypes) {
                  for (var7 = 0; var7 < var6.faceCount; var7++) {
                    if (var6.faceRenderTypes[var7] == 2) {
                      var6.faceVertexA[var7] = 0;
                      var6.faceVertexB[var7] = 0;
                      var6.faceVertexC[var7] = 0;
                    }
                  }
                }
                ActionRequest.unitModels[param1][var4] = var6.createModel(SummonAction.field_x, fm.field_a, ol.field_A, BattleCharacter.field_t, MeshObject.field_a);
                if (param1 == 76) {
                  bn.field_a[var4] = ActionRequest.unitModels[param1][var4];
                }
                if (0 == ((ModelMesh) (ActionRequest.unitModels[param1][var4])).vertexCount) {
                  ActionRequest.unitModels[param1] = null;
                }
              }
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "fn.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(Widget param0, int param1, char param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_U = vi.monotonicMillis(-82);
          if (param3 != -12215) {
            return true;
          }
          if (param2 != 60 &&
            param2 != 62) {
            if (param2 >= 32 &&
              param2 <= 126) {
              if (this.field_O != this.field_L) {
                this.j(1000);
              }
              if (this.field_R == -1 ||
                !(this.text.length() >= this.field_R)) {
                if (this.field_O >= this.text.length()) {
                  this.text = this.text + param2;
                  dupTemp$0 = this.text.length();
                  this.field_O = dupTemp$0;
                  this.field_L = dupTemp$0;
                } else {
                  this.text = this.text.substring(0, this.field_O) + param2 + this.text.substring(this.field_O, this.text.length());
                  this.field_O = this.field_O + 1;
                  this.field_L = this.field_O;
                }
                this.d((byte) -123);
              }
              return true;
            }
            if (85 == param1) {
              if (this.field_L != this.field_O) {
                this.j(1000);
                return true;
              }
              if (0 >= this.field_O) {
                return false;
              }
              this.field_L = -1 + this.field_O;
              this.j(1000);
              return true;
            }
            if (param1 == 101) {
              if (this.field_L != this.field_O) {
                this.j(1000);
                return true;
              }
              if (this.field_O < this.text.length()) {
                this.field_L = 1 + this.field_O;
                this.j(1000);
                return true;
              }
            } else {
              if (param1 == 13) {
                this.k(98);
                return true;
              }
              if (param1 != 96) {
                if (param1 != 97) {
                  if (param1 == 102) {
                    this.a(0, (byte) -59);
                    return true;
                  }
                  if (103 == param1) {
                    this.a(this.text.length(), (byte) -59);
                    return true;
                  }
                  if (param1 == 84) {
                    this.n(-92);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    param1 == 65) {
                    this.b(true);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    param1 == 66) {
                    this.a((byte) -53);
                    return true;
                  }
                  if (br.heldKeys[82] &&
                    67 == param1) {
                    this.f((byte) -104);
                    return true;
                  }
                } else {
                  if (this.field_O < this.text.length()) {
                    if (!br.heldKeys[82]) {
                      stackIn_34_1 = this.field_O + 1;
                    } else {
                      stackIn_34_1 = this.p(-97);
                    }
                    this.a(stackIn_34_1, (byte) -59);
                    return true;
                  }
                }
              } else {
                if (this.field_O > 0) {
                  if (br.heldKeys[82]) {
                    stackIn_27_1 = this.e((byte) 81);
                  } else {
                    stackIn_27_1 = -1 + this.field_O;
                  }
                  this.a(stackIn_27_1, (byte) -59);
                  return true;
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_82_0 = var5;
          stackIn_82_1 = new StringBuilder().append("fn.F(");
          if (param0 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3) {
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RgbSprite var16 = null;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param3.normalizeCanvas();
          var4_int = 0;
          var5 = param3.pixelWidth / 2;
          if (param0 != 8678) {
            var16 = (RgbSprite) null;
            fn.a(-106, -71, -114, (RgbSprite) null);
          }
          var6 = param3.pixelHeight / 2;
          stackIn_6_0 = (var5 >= var6) ? var6 : var5;
          var7 = stackIn_6_0;
          for (var8 = 0; param3.pixelHeight > var8; var8++) {
            for (var9 = 0; param3.pixelWidth > var9; var9++) {
              var10 = (int)Math.sqrt((double)((var9 - var5) * (var9 - var5) + (var8 - var6) * (-var6 + var8)));
              if (param2 <= var10) {
                var10 = -(param1 * (-param2 + var10) / (-param2 + var7)) + param1;
              } else {
                var10 = param1;
              }
              if (0 < var10) {
                var11 = param3.pixels[var4_int];
                if (var11 == 1) {
                  var11 = 0;
                }
                var12 = (var11 & 16711680) + (var10 << 16);
                var13 = (var11 & 65280) + (var10 << 8);
                if (var12 > 16711680) {
                  var12 = 16711680;
                }
                var14 = (var11 & 255) + var10;
                if (var13 > 65280) {
                  var13 = 65280;
                }
                if (255 < var14) {
                  var14 = 255;
                }
                param3.pixels[var4_int] = oe.bitwiseOr(oe.bitwiseOr(var12, var13), var14);
              }
              var4_int++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("fn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    fn(String param0, qo param1, int param2) {
        super(param0, param1);
        this.field_T = 0L;
        this.field_P = false;
        this.field_V = -1;
        try {
          this.painter = t.field_c.field_w;
          this.field_R = param2;
          this.a(true, param0, -27934);
          this.field_N = true;
          this.field_U = vi.monotonicMillis(-83);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        this.field_O = 0;
        this.field_L = 0;
        this.text = "";
        int var2 = 26 % ((33 - param0) / 36);
        this.d((byte) -126);
    }

    private final void l(int param0) {
        int discarded$0 = 0;
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        TextWidgetPainter var9;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.field_N) {
          this.contentOffsetX = 0;
          this.contentOffsetY = 0;
          return;
        }
        if (!(this.painter instanceof TextWidgetPainter)) {
          return;
        }
        var9 = (TextWidgetPainter) ((Object) this.painter);
        var3 = var9.getTextLayout(-100, (Widget) (this));
        if (param0 != 0) {
          discarded$0 = this.e((byte) -33);
        }
        var4 = var3.getRightExtent(false);
        var5 = var9.getContentWidth(66, (Widget) (this));
        var6 = var9.getLineInkHeight(true) >> 1;
        if (-var6 + var5 > var4) {
          this.contentOffsetY = 0;
          this.contentOffsetX = 0;
          return;
        }
        var7 = this.contentOffsetX + var3.getCaretX((byte) -66, this.field_O);
        if (var5 - var6 < var7) {
          this.contentOffsetX = this.contentOffsetX - var7 - var6 + var5;
        } else {
          if (var7 < var6) {
            this.contentOffsetX = this.contentOffsetX + (-var7 + var6);
          }
        }
        if (this.contentOffsetX <= 0) {
          if (var6 - var5 > this.contentOffsetX) {
            this.contentOffsetX = var6 - var5;
          }
        } else {
          this.contentOffsetX = 0;
        }
        return;
    }

    void d(byte param0) {
        if (this.field_x instanceof fb) {
          ((fb) (this.field_x)).b(this, 111);
        }
        if (param0 >= -114) {
          this.field_R = -53;
        }
    }

    private final void a(byte param0) {
        String var2 = this.o(param0 ^ 108);
        if (param0 != -53) {
          return;
        }
        if (0 < var2.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.o(-74))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    private final void a(int param0, byte param1) {
        this.field_O = param0;
        if (!br.heldKeys[81]) {
          this.field_L = this.field_O;
        }
        if (param1 != -59) {
          this.n(-104);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, Widget param4, int param5, int param6) {
        int stackIn_9_1 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (param3 <= 103) {
            return false;
          }
          if (!super.a(param0, param1, param2, 119, param4, param5, param6)) {
            return false;
          }
          if (!(this.painter instanceof TextWidgetPainter)) {
            return false;
          }
          var8_int = ((TextWidgetPainter) ((Object) this.painter)).hitTestCharacter((Widget) (this), AiPlanningStrategy.pointerX, 87, param2, ko.pointerY, param1);
          if (var8_int != -1) {
            stackIn_9_1 = var8_int;
          } else {
            stackIn_9_1 = 0;
          }
          this.a(stackIn_9_1, (byte) -59);
          var8_long = vi.monotonicMillis(39);
          stackIn_12_1 = !(-this.field_T + var8_long >= 250L);
          this.field_P = stackIn_12_1;
          if (this.field_P) {
            this.field_L = this.e((byte) -85);
            this.field_O = this.p(-89);
            if (this.field_O > 0 &&
              this.text.charAt(this.field_O - 1) == 32) {
              this.field_O = this.field_O - 1;
            }
            this.field_V = this.field_O;
          }
          this.field_T = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_24_0 = var8;
          stackIn_24_1 = new StringBuilder().append("fn.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void m(int param0) {
        if (param0 != 32) {
          field_Q = (int[]) null;
        }
        field_S = null;
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        TextWidgetPainter var8 = null;
        long var6 = 0L;
        if (param2 > -82) {
          return;
        }
        if (this.painter != null &&
          param3 == 0) {
          this.painter.paintWidget((Widget) (this), param0, -128, this.field_I, param1);
          if (this.painter instanceof TextWidgetPainter) {
            var8 = (TextWidgetPainter) ((Object) this.painter);
            if (this.field_O != this.field_L) {
              var8.drawSelection(-21259, this.field_O, this.field_L, (Widget) (this), param1, param0);
            }
            var6 = vi.monotonicMillis(-126);
            if ((var6 - this.field_U) % 1000L < 500L) {
              var8.drawCaret(param1, 1024, param0, (Widget) (this), this.field_O);
            }
          }
        }
    }

    private final void f(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          Widget var3 = null;
          try {
            if (param0 != -104) {
              var3 = (Widget) null;
              this.a((Widget) null, -59, 'x', 71);
            }
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.j(param0 + 1104);
            this.a(var2, (byte) -114);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_R != -1) {
            var3_int = this.field_R - this.text.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_O != this.text.length()) {
            this.text = this.text.substring(0, this.field_O) + param0 + this.text.substring(this.field_O, this.text.length());
          } else {
            this.text = this.text + param0;
          }
          this.field_O = this.field_O + param0.length();
          this.field_L = this.field_O;
          if (param1 > -78) {
            this.field_L = 91;
            this.d((byte) -126);
          } else {
            this.d((byte) -126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("fn.BA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int p(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 > -10) {
          return -64;
        }
        var2 = this.text.length();
        if (this.field_O == var2) {
          return this.field_O;
        }
        for (var3 = this.field_O + 1; var3 < var2; var3++) {
          if (this.text.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    static {
        field_M = 9;
        field_Q = new int[]{-1, -1, 4, 5, -1, -1, -1, 2, 0, 1, -1, 3, 6, 6, 8, 9};
        field_S = "Sacrifice";
    }
}
