/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends TextWidgetRenderer {
    private int field_n;
    private int field_s;
    private int field_q;
    static SpriteData field_p;
    static volatile boolean field_o;
    private Sprite[] field_r;

    public ue() {
        this(2188450, 2591221, 9543);
    }

    public static void releaseStatics(int param0) {
        if (param0 < 100) {
          field_o = true;
        }
        field_p = null;
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!widget.hovered) {
            stackIn_6_0 = (widget.hasFocus(-1)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (guard != 5592405) {
            this.field_s = 88;
          }
          if (widget instanceof InteractiveWidget) {
            isEnabled = isEnabled & ((InteractiveWidget) (widget)).enabled;
          }
          if (!isEnabled) {
            stackIn_16_0 = this.field_q;
          } else {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_s;
            } else {
              stackIn_16_0 = this.field_n;
            }
          }
          var7 = stackIn_16_0;
          stackIn_19_0 = (!isEnabled) ? 7105644 : 16777215;
          var8 = stackIn_19_0;
          ByteArrayStorage.drawHorizontalSpriteStrip(var7, widget.width, widget.y + (parentY + (-this.field_r[0].field_w + widget.height >> 1)), 67, this.field_r, widget.x + parentX);
          this.font.a(widget.text, parentX + widget.x, widget.y + (parentY - 2), widget.width, widget.height, var8, -1, 1, 1, this.font.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ue.A(");
          if (widget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        of var4_ref_of = null;
        int var5 = 0;
        id var6 = null;
        int var6_int = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pl var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param0 != -70) {
            ue.releaseStatics(-111);
          }
          var28 = ig.field_a;
          var2 = var28.e(-31302);
          if (0 == var2) {
            var3 = var28.a(255);
            var4_ref_of = (of) (oi.field_b.first(74));
            while (var4_ref_of != null) {
              if (var3 != var4_ref_of.field_p) {
                var4_ref_of = (of) (oi.field_b.next((byte) 18));
                continue;
              }
              break;
            }
            if (var4_ref_of == null) {
              kk.a((byte) -124);
              return;
            }
            var5 = var28.e(-31302);
            if (0 != var5) {
              var6_int = var4_ref_of.field_l;
              var7 = var4_ref_of.field_s;
              DraggableWidget.field_B[0].field_a = null;
              DraggableWidget.field_B[0].field_c = qv.field_o;
              DraggableWidget.field_B[0].field_b = false;
              for (var8_int = 1; var8_int < var5; var8_int++) {
                DraggableWidget.field_B[var8_int].field_c = var28.d(-1);
                DraggableWidget.field_B[var8_int].field_b = false;
                if (var28.e(-31302) == 1) {
                  DraggableWidget.field_B[var8_int].field_a = var28.d(param0 + 69);
                } else {
                  DraggableWidget.field_B[var8_int].field_a = null;
                }
              }
              dupTemp$0 = new String[3][var6_int];
              var4_ref_of.field_o = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6_int];
              dupTemp$1 = new long[3][var6_int];
              var4_ref_of.field_r = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6_int * var7];
              var4_ref_of.field_m = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var28.e(-31302);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var28.e(-31302);
                  var21 = DraggableWidget.field_B[var20].field_c;
                  var22 = var28.a((byte) 113);
                  var24 = var28.position;
                  if (var6_int > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = DraggableWidget.field_B[var20].field_a;
                    var10[0][var12] = var22;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var28.c(true);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    ea.a(var21, (byte) -25)) {
                    var8[1][var13] = qv.field_o;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var28.position = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var28.c(true);
                    }
                  }
                  if (var6_int > var14 &&
                    !DraggableWidget.field_B[var20].field_b) {
                    DraggableWidget.field_B[var20].field_b = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = DraggableWidget.field_B[var20].field_a;
                    var10[2][var14] = var22;
                    var28.position = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var28.c(true);
                    }
                  }
                }
              }
            }
            var4_ref_of.field_q = true;
            var4_ref_of.unlink(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var28.a(255);
            var4 = var28.a((byte) 111);
            var6 = (id) (ow.field_f.first(127));
            while (var6 != null) {
              if (var6.field_r != var3Lifetime1) {
                var6 = (id) (ow.field_f.next((byte) 18));
                continue;
              }
              break;
            }
            if (var6 == null) {
              kk.a((byte) -121);
              return;
            }
            var6.field_s = var4;
            var6.unlink(false);
            return;
          }
          IntrusiveNode.reportClientError("HS1: " + VictoryScreen.b((byte) -124), (Throwable) null, 0);
          kk.a((byte) -121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "ue.C(" + param0 + ')');
        }
    }

    private ue(int param0, int param1, int param2) {
        this.field_q = param2;
        this.field_r = LevelCompleteUpgradeScreen.field_j;
        this.font = tq.field_a;
        this.field_s = param1;
        this.field_n = param0;
    }

    static {
        field_o = true;
    }
}
