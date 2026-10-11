/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wm implements ntb {
    boolean field_a;
    static String field_b;

    public void a(faa param0, boolean param1) {
        try {
          this.field_a = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wm.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    int[] a(pe param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 16) {
            wm.a((byte) 30);
          }
          stackIn_3_0 = (int[]) (param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("wm.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static tpa a(String[] args, byte param1) {
        tpa var2 = null;
        RuntimeException var2_ref = null;
        tpa stackIn_2_0 = null;
        tpa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new tpa(false);
          if (param1 > -121) {
            stackIn_2_0 = (tpa) null;
            return stackIn_2_0;
          }
          var2.field_e = args;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("wm.Q(");
          if (args == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(tv param0, int param1) {
        wm var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (wm) (param0);
          if (param1 >= -19) {
            return;
          }
          var4 = 0;
          stackIn_5_0 = (var3.field_a) ? 0 : 1;
          if (this.field_a) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            var4 = 1;
            System.out.println("boolean not has changed. before=" + var3.field_a + ", now=" + this.field_a);
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionCondition has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wm.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        wm var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 115 % ((param0 - 22) / 59);
          var4 = (wm) (param1);
          stackIn_3_0 = (this.field_a) ? 0 : 1;
          if (var4.field_a) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          stackIn_9_0 = (stackIn_3_0 != stackIn_6_1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        mab.field_f = param3;
        if (param2 < 92) {
          field_b = (String) null;
        }
        tba.field_o = param1;
        kjb.field_p = param0;
        whb.field_a = param4;
    }

    public static void a(byte param0) {
        if (param0 > -45) {
          field_b = (String) null;
        }
        field_b = null;
    }

    void a(pe param0, int param1, int param2, int param3) {
        try {
          if (param1 != -2) {
            String[] var6 = (String[]) null;
            wm.a((String[]) null, (byte) -97);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    int a(byte param0, int param1) {
        if (param0 > -102) {
          return -122;
        }
        return 0;
    }

    public void b(faa param0, int param1) {
        try {
          if (param1 > -109) {
            pe var4 = (pe) null;
            this.a((pe) null, 68, -88, 56);
          }
          vq.a(param0, -119, this.field_a);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    String a(int param0) {
        if (param0 != -1) {
          tv var3 = (tv) null;
          this.b((byte) -4, (tv) null);
        }
        return this.toString();
    }

    ucb[] a(pe param0, int param1) {
        RuntimeException var3 = null;
        tv var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -20605) {
            return null;
          }
          var4 = (tv) null;
          this.a((tv) null, -22);
          stackIn_3_0 = null;
          return (ucb[]) (stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wm.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public void b(byte param0, tv param1) {
        wm var4 = (wm) (param1);
        wm var3 = var4;
        if (param0 <= 54) {
          return;
        }
        try {
          var4.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wm.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] a(int param0, byte param1, int[] param2) {
        int var4_int = 0;
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int[] stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        int[] stackIn_26_0 = null;
        int[] stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param1 <= 57) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          if (param2 == null) {
            return null;
          }
          if (param2.length == 0) {
            stackIn_8_0 = null;
            return (int[]) (stackIn_8_0);
          }
          var3_int = -1;
          for (var4_int = 0; var4_int < param2.length; var4_int++) {
            if (param2[var4_int] != param0) {
              continue;
            }
            var3_int = var4_int;
            break;
          }
          if (0 > var3_int) {
            stackIn_28_0 = (int[]) (param2);
            return stackIn_28_0;
          }
          if (param2.length == 1) {
            return null;
          }
          var4 = new int[-1 + param2.length];
          var5 = 0;
          for (var6 = 0; param2.length > var6; var6++) {
            if (var6 != var3_int) {
              var4[var5] = param2[var6];
              var5++;
            }
          }
          stackIn_26_0 = var4;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("wm.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    boolean a(int param0, lbb param1, pe param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return true;
          }
          this.field_a = false;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("wm.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_b = "Close";
    }
}
