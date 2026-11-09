/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MenuLabel extends MenuComponent {
    static String field_z;
    static Sprite[] field_y;
    private int field_w;
    String field_u;
    static String field_v;
    static int field_x;

    final void setText(byte param0, String param1) {
        try {
          if (param0 >= -81) {
            this.field_w = 9;
          }
          this.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "qk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    MenuLabel(int param0, int param1, String param2) {
        this(param0, param1, rs.field_Cb.stringWidth(param2), rs.field_Cb.field_J, param2);
    }

    MenuLabel(int param0, int param1, int param2, int param3, String param4) {
        super(param0, param1, param2, param3);
        try {
          this.field_u = param4;
          this.field_w = 16777215;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "qk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static String[] a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tq var6 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != 13) {
            stackIn_3_0 = (String[]) null;
            return stackIn_3_0;
          }
          var6 = UiWidget.g(param1 + 105);
          var3 = 0;
          var4 = 0;
          while (true) {
            if (var4 >= param0.length) {
              stackIn_20_0 = var6.a(220);
              return stackIn_20_0;
            }
            while (var4 < param0.length) {
              if (param0[var4] != 13 &&
                param0[var4] != 10) {
                var4++;
                continue;
              }
              break;
            }
            var6.a(StellarBombEvent.a(param0, -var3 + var4, var3, -118), -126);
            while (param0.length > var4) {
              if (13 == param0[var4] ||
                param0[var4] == 10) {
                var4++;
                continue;
              }
              break;
            }
            var3 = var4;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("qk.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static SoundPlayback a(qf param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        SoundPlayback stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 44) {
            var3 = (String) null;
            MenuLabel.a((String) null, 122, (byte) 75);
          }
          stackIn_3_0 = AccountFieldValue.a(param0.field_a, -124, param0.field_f);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qk.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0) {
        if (!this.field_s) {
          return;
        }
        int var2 = -21 / ((67 - param0) / 47);
        if (null != this.field_u) {
          rs.field_Cb.drawCentred(this.field_u, this.field_m / 2 + this.field_k, 3 * rs.field_Cb.field_J / 4 + this.field_t, this.field_w, -1);
        }
    }

    final static void g(int param0) {
        MenuButton.f(-1);
        oe.field_f = true;
        TertiaryNodeList.field_b = true;
        ByteArrayStorage.field_e.deactivateAll(99);
        if (param0 > -12) {
          return;
        }
        ByteArrayNode.a(we.field_b, -78, false);
    }

    public static void clearStatics(int param0) {
        field_y = null;
        field_z = null;
        field_v = null;
        int var1 = -126 / ((param0 - 53) / 36);
    }

    MenuLabel(int param0, int param1, int param2, int param3, String param4, int param5) {
        super(param0, param1, param2, param3);
        try {
          this.field_u = param4;
          this.field_w = param5;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "qk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(String param0, int param1, byte param2) {
        try {
          if (param2 < 74) {
            qf var4 = (qf) null;
            MenuLabel.a((qf) null, 124);
          }
          jb.field_g = po.field_f;
          SolMapReader.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "qk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_z = "Message game";
        field_v = "Most fleets controlled at one time.";
    }
}
