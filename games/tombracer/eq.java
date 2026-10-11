/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends nv {
    static ola field_n;
    static int field_r;
    private boolean field_u;
    static int[] field_p;
    private boolean field_t;
    private boolean field_q;
    private int field_s;
    private boolean field_o;

    final void a(int param0, boolean param1) {
        this.field_t = param1 ? true : false;
        if (param0 != -28592) {
          this.a(-6, 77);
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (fia.field_j.startsWith("win") &&
              qla.a(param2, -127)) {
              return;
            }
            try {
              if (param0 != 1) {
                field_n = (ola) null;
              }
              param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              ssa.a("MGR1: " + param2, (byte) 125, (Throwable) null);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("eq.V(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, int param1) {
        this.field_o = param0 ? true : false;
        if (param1 >= -23) {
          pc var4 = (pc) null;
          this.a(33, -58, (pc) null, 39);
        }
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1);
          if (4 <= this.b(param0).field_E) {
            return;
          }
          param1.h(3, 0);
          param1.a(3, (byte) -12, false);
          this.field_q = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eq.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void b(byte param0, boolean param1) {
        if (param0 > -53) {
          return;
        }
        this.field_q = param1 ? true : false;
    }

    eq(la param0, boolean param1) {
        super(param0, param1);
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
          field_p = (int[]) null;
          return param0;
        }
        return param0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 instanceof ep &&
            this.field_o) {
            return false;
          }
          if (param2 == 1) {
            return true;
          }
          this.a(true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("eq.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        if (vpa.a(79)) {
          return false;
        }
        if (param0 == 0) {
          return ld.field_e >= 2 ? true : false;
        }
        field_n = (ola) null;
        return ld.field_e >= 2 ? true : false;
    }

    eq(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          if (param0.field_E >= 4) {
            this.field_q = param1.b((byte) 44, 1) == 1 ? true : false;
          }
          if (param0.field_E >= 6) {
            this.field_u = 1 == param1.b((byte) 44, 1) ? true : false;
          }
          if (param0.field_E >= 11) {
            this.field_t = param1.b((byte) 44, 1) == 1 ? true : false;
          }
          if (param0.field_E >= 20) {
            this.field_o = param1.b((byte) 44, 1) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "eq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
          fsa var3 = (fsa) null;
          this.a(true, (fsa) null);
          return 12;
        }
        return 12;
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_t) {
            return false;
          }
          if (param1 != 1) {
            this.a(true, 49);
          }
          param2.a(param3, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("eq.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_p = null;
        field_n = null;
        if (param0 != 15602) {
          eq.b(22);
        }
    }

    final void k(int param0) {
        ffa var3 = null;
        ffa var3Lifetime1;
        ffa var3Lifetime2;
        ffa var3Lifetime3;
        ffa var3Lifetime4;
        if (!this.field_q) {
          if (!this.field_u) {
            if (param0 != 5418) {
              var3 = (ffa) null;
              this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
              return;
            }
            return;
          }
          if (!this.d(8031)) {
            if (param0 == 5418) {
              return;
            }
            var3Lifetime3 = (ffa) null;
            this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
            return;
          }
          this.b(true).r(-36);
          if (param0 == 5418) {
            return;
          }
          var3Lifetime4 = (ffa) null;
          this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
          return;
        }
        if (this.d(8031)) {
          this.m((byte) 19).a(2, (byte) -123, this.field_s);
          if (param0 == 5418) {
            return;
          }
          var3Lifetime1 = (ffa) null;
          this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
          return;
        }
        if (param0 == 5418) {
          return;
        }
        var3Lifetime2 = (ffa) null;
        this.a(-117, 44, 70, 106, 36, -110, (ffa) null);
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          param1.a((byte) 56, this.field_q ? 1 : 0, 1);
          param1.a((byte) -125, this.field_u ? 1 : 0, 1);
          param1.a((byte) 69, this.field_t ? 1 : 0, 1);
          param1.a((byte) -125, this.field_o ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "eq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        this.field_s = param0;
        if (param1 != -22) {
          ffa var4 = (ffa) null;
          this.a(-37, 114, -50, -103, 24, 15, (ffa) null);
        }
    }

    static {
        field_p = new int[8192];
        field_r = -1;
    }
}
