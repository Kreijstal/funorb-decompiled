/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    private boolean field_d;
    static ja field_e;
    static long field_f;
    private int[] field_g;
    private int field_a;
    static String field_c;
    static ea field_b;
    private int field_h;
    static boolean field_i;

    public static void a(int param0) {
        int var1 = 12 / ((param0 - 26) / 63);
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final void a(int param0, int param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (this.field_a < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (this.field_a != param0) {
          pd.a(this.field_g, 1 + param0, this.field_g, param0, -param0 + this.field_a);
          this.field_a = this.field_a - 1;
          if (param1 == -12759) {
            return;
          }
          this.a(-123, 110);
          return;
        }
        this.field_a = this.field_a - 1;
        if (param1 == -12759) {
          return;
        }
        this.a(-123, 110);
    }

    final static hg a(kk param0, int param1, kk param2, int param3, int param4) {
        RuntimeException var5 = null;
        kk var6 = null;
        Object stackIn_4_0 = null;
        hg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -11948) {
            var6 = (kk) null;
            qh.a((kk) null, -65, (kk) null, -113, 27);
          }
          if (sk.a(param3, param2, param4 + 11949, param1)) {
            stackIn_6_0 = ra.a(param4 + 11446, param0.a(param1, param3, (byte) -67));
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (hg) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("qh.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        this.a(this.field_a + 1, true, param1);
        int var3 = 39 / ((54 - param0) / 57);
    }

    final int c(byte param0, int param1) {
        if (this.field_a >= param1) {
          int var3 = -41 / ((param0 - 1) / 55);
          return this.field_g[param1];
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param0 > this.field_a) {
          this.field_a = param0;
          if (this.field_g.length > param0) {
            this.field_g[param0] = param2;
            if (param1) {
              return;
            }
            this.b(-86);
            return;
          }
          this.b((byte) 123, param0);
          this.field_g[param0] = param2;
          if (!param1) {
            this.b(-86);
            return;
          }
          return;
        }
        if (this.field_g.length <= param0) {
          this.b((byte) 123, param0);
          this.field_g[param0] = param2;
          if (param1) {
            return;
          }
          this.b(-86);
          return;
        }
        this.field_g[param0] = param2;
        if (param1) {
          return;
        }
        this.b(-86);
    }

    private final void b(byte param0, int param1) {
        int[] var5 = new int[this.b(param1, 20029)];
        int[] var3 = var5;
        pd.a(this.field_g, 0, var5, 0, this.field_g.length);
        int var4 = 87 / ((param0 - 58) / 62);
        this.field_g = var5;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 == 20029) {
          var3 = this.field_g.length;
          while (var3 <= param0) {
            if (!this.field_d) {
              var3 = var3 + this.field_h;
              continue;
            }
            if (var3 != 0) {
              var3 = var3 * this.field_h;
              continue;
            }
            var3 = 1;
          }
          return var3;
        }
        field_c = (String) null;
        var3Lifetime1 = this.field_g.length;
        while (var3Lifetime1 <= param0) {
          if (!this.field_d) {
            var3Lifetime1 = var3Lifetime1 + this.field_h;
            continue;
          }
          if (var3Lifetime1 != 0) {
            var3Lifetime1 = var3Lifetime1 * this.field_h;
            continue;
          }
          var3Lifetime1 = 1;
        }
        return var3Lifetime1;
    }

    final int b(int param0) {
        if (param0 != -1) {
          field_e = (ja) null;
          return this.field_a + 1;
        }
        return this.field_a + 1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              param1.getAppletContext().showDocument(of.a(param1, var2, param0), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("qh.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private qh() throws Throwable {
        throw new Error();
    }

    static {
        field_c = "Type your email address again to make sure it's correct";
        field_e = new ja();
    }
}
