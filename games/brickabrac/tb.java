/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends bj {
    private boolean field_hb;
    private String field_jb;
    static int pressX;
    private boolean field_gb;
    private cr field_bb;
    private String field_ib;
    static String field_eb;
    static String field_db;
    static String field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1 ^ 0, param2);
        wm.field_a.drawCentered(this.field_jb, param0 + (this.field_t >> 1), param2 + 103, 16777215, -1);
        if (param1 == 274) {
          if (this.field_ib != null) {
            Rasterizer2D.drawHorizontalLine(20 + param0, 120 + param2 - 7, 260, 8421504);
            wm.field_a.a(this.field_ib, param0 + 20, 8 + param2 + 120, 260, 100, 16777215, -1, 1, 0, wm.field_a.ascent);
          }
          return;
        }
        this.field_gb = false;
        if (this.field_ib != null) {
          Rasterizer2D.drawHorizontalLine(20 + param0, 120 + param2 - 7, 260, 8421504);
          wm.field_a.a(this.field_ib, param0 + 20, 8 + param2 + 120, 260, 100, 16777215, -1, 1, 0, wm.field_a.ascent);
        }
    }

    final static AlphaFont a(int param0, int param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        AlphaFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 111) {
            pressX = -88;
          }
          if (ln.decodeSpritesFromArchive(-104, param4, param2, param1)) {
            stackIn_6_0 = jm.a(param3.takeFile(param4, param1, 4), (byte) -14);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (AlphaFont) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("tb.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ResourceArchive var13 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = param1.length();
          var5 = param3.length();
          var6 = param0.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          if (!param2) {
            var13 = (ResourceArchive) null;
            tb.a(95, -81, (ResourceArchive) null, (ResourceArchive) null, -12);
          }
          var8 = var6 - var5;
          if (var8 != 0) {
            var9_int = 0;
            while (true) {
              var9_int = param1.indexOf(param3, var9_int);
              if (0 > var9_int) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param1.indexOf(param3, var10);
            if (var11 < 0) {
              discarded$0 = var9.append(param1.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$1 = var9.append(param1.substring(var10, var11));
            var10 = var11 + var5;
            discarded$2 = var9.append(param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("tb.S(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(float param0, String param1, boolean param2, byte param3) {
        RuntimeException runtimeException = null;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = this.field_hb;
          if (param2) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = 1;
          }
          if ((stackIn_2_0 ? 1 : 0) == stackIn_3_1) {
            stackIn_8_1 = (param2);
            this.field_hb = stackIn_8_1;
            if (this.field_hb) {
              this.field_bb.b(8405024, 4210752, 2);
              this.field_bb.field_J = true;
            } else {
              this.field_bb.b(2113632, 4210752, param3 - 84);
              if (this.field_gb) {
                this.field_bb.field_J = false;
              }
            }
          }
          this.field_bb.field_L = (int)(param0 / 100.0f * 65536.0f);
          if (param3 != 86) {
            return;
          }
          this.field_jb = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("tb.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void l(int param0) {
        if (param0 == 6457) {
          this.field_bb.field_J = false;
          this.field_gb = true;
          return;
        }
        this.l(88);
        this.field_bb.field_J = false;
        this.field_gb = true;
    }

    tb(cp param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_ib = param1;
          if (null != this.field_ib) {
            var3_int = wm.field_a.measureWrappedHeight(this.field_ib, 260, wm.field_a.ascent);
            this.a(true, 150 + var3_int, 300);
          }
          this.field_bb = new cr(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_hb = false;
          this.field_gb = false;
          this.field_bb.field_J = true;
          this.a(this.field_bb, true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_cb = null;
        field_db = null;
        if (param0 > -26) {
          field_db = (String) null;
          field_eb = null;
          return;
        }
        field_eb = null;
    }

    static {
        field_db = "Catch this with your paddle.<br><br>A positive power-up is worth 100 points and will help you. A negative one will hinder you, but is worth 500 points!";
        pressX = 0;
    }
}
