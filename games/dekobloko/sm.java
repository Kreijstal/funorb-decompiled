/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    static int field_d;
    private ji field_f;
    private la field_a;
    private ji field_b;
    static a field_c;
    static int field_e;

    final static int a(jg param0, jg param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -118 / ((-48 - param2) / 32);
          var4 = (String) null;
          stackIn_1_0 = qb.a(false, 0, param0, 100, 0, param1, (String) null);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("sm.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ck a(byte param0, int param1, int param2) {
        int var5 = client.field_A ? 1 : 0;
        ck var3 = new ck(param1, param1);
        int var4 = 0;
        if (param0 >= -96) {
          field_e = 97;
          while (var3.field_D.length > var4) {
            var3.field_D[var4] = param2;
            var4++;
          }
          return var3;
        }
        while (var3.field_D.length > var4) {
          var3.field_D[var4] = param2;
          var4++;
        }
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 30553) {
          field_e = 92;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != -65) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
              param1.getAppletContext().showDocument(gn.a(var2, -1, param1), "_top");
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
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("sm.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte param0) {
        if (param0 > -63) {
          field_e = 90;
          return jk.field_e;
        }
        return jk.field_e;
    }

    final static boolean b(int param0) {
        if (param0 != 1) {
          return false;
        }
        return cf.field_i;
    }

    sm(int param0, ji param1, ji param2, lh param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = new la(64);
        try {
          this.field_f = param1;
          this.field_b = param2;
          if (null != this.field_f) {
            this.field_f.b(-5228, 1);
          }
          if (null == this.field_b) {
            return;
          }
          this.field_b.b(-5228, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("sm.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final me a(int param0, int param1) {
        byte[] var4 = null;
        me var3 = (me) (this.field_a.a((long)param1, (byte) -63));
        if (var3 != null) {
          return var3;
        }
        if (param1 < 32768) {
          var4 = this.field_f.a(param1, 88, 1);
        } else {
          var4 = this.field_b.a(32767 & param1, -112, 1);
        }
        var3 = new me();
        if (var4 != null) {
          var3.a((byte) 80, new wl(var4));
        }
        if (32768 <= param1) {
          var3.d(19423);
          this.field_a.a(var3, (long)param1, 125);
          if (param0 < 123) {
            sm.a((byte) 69);
            return var3;
          }
          return var3;
        }
        this.field_a.a(var3, (long)param1, 125);
        if (param0 >= 123) {
          return var3;
        }
        sm.a((byte) 69);
        return var3;
    }

    static {
    }
}
