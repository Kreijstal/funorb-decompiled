/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jk extends wf {
    private fe field_hb;
    static int[] field_ib;
    private int field_kb;
    static boolean[] field_gb;
    private gh field_cb;
    private int field_eb;
    static int[] field_db;
    private int field_fb;
    static bg field_jb;
    static String field_lb;
    private int field_mb;
    private int field_Z;
    static int field_ab;
    private oj field_bb;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 <= 47) {
                return;
              }
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = nn.a(105, param0, var3);
              cn.a(param0, var3.toString(), 11050, true);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("jk.I(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(byte param0, fe param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_hb = param1;
          if (param0 > -30) {
            return;
          }
          if (o.field_a == this.field_cb) {
            this.a(this.field_mb, true, this.field_hb.field_v + 12, this.field_hb.field_q + this.field_fb + 12);
            this.field_kb = 0;
            return;
          }
          if (ah.field_a == this.field_cb) {
            return;
          }
          this.field_kb = 0;
          this.field_cb = ah.field_a;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void o(int param0) {
        if (null == this.field_cb) {
          super.o(param0);
          return;
        }
        if (lm.field_O != this.field_cb) {
          this.a(this.field_hb.field_q + 12 + this.field_fb, this.field_hb.field_v + 12, (byte) 55);
          this.b(28199, this.field_hb);
        } else {
          this.field_bb.field_L = 256;
          this.field_cb = null;
          super.o(param0);
          return;
        }
        this.field_bb.field_L = 256;
        this.field_cb = null;
        super.o(param0);
    }

    private final void b(int param0, fe param1) {
        try {
          if (null != this.field_bb) {
            this.field_bb.b(34);
          }
          if (param1 != null) {
            param1.a(param1.field_q, param0 ^ -28163, 6, param1.field_v, this.field_fb + 6);
            this.field_bb = new oj(param1);
          } else {
            this.field_bb = new oj();
          }
          this.a(-1, this.field_bb);
          if (param0 != 28199) {
            this.field_mb = -79;
          }
          this.field_hb = null;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "jk.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(byte param0) {
        field_jb = null;
        field_ib = null;
        field_gb = null;
        field_db = null;
        field_lb = null;
        int var1 = -24 / ((10 - param0) / 39);
    }

    final static void a(int param0, vf param1, Object param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          if (null == param1.field_p) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param1.field_p.peekEvent()) {
              gf.a(1L, -10309);
              continue;
            }
            break;
          }
          try {
            if (param0 != -23765) {
              return;
            }
            if (param2 == null) {
              return;
            }
            param1.field_p.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("jk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        if (this.field_cb == ah.field_a) {
          return;
        }
        this.field_kb = 0;
        this.field_cb = lm.field_O;
        this.b(28199, this.field_hb);
        this.field_bb.field_L = 0;
        if (param0) {
          this.field_hb = null;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        this.o(24619);
        return super.a(param0);
    }

    boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_bb == null) {
            return false;
          }
          if (98 == param3) {
            this.field_bb.a(param1, param2 + 199);
          }
          if (99 == param3) {
            this.field_bb.a(param1, param2 + 199);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("jk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean n(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = MinerDisturbance.field_ab;
        if (param0 != -4) {
          this.field_Z = -38;
          if (null == this.field_cb) {
            return super.n(param0 + 0);
          }
          if (ah.field_a != this.field_cb) {
            if (this.field_cb != lm.field_O) {
              return super.n(param0 + 0);
            }
            fieldTemp$0 = this.field_kb + 1;
            this.field_kb = this.field_kb + 1;
            if (fieldTemp$0 != this.field_Z) {
              this.field_bb.field_L = (this.field_kb << 8) / this.field_Z;
              return super.n(param0 + 0);
            }
            this.field_bb.field_L = 256;
            this.field_cb = null;
            return super.n(param0 + 0);
          }
          fieldTemp$1 = this.field_kb + 1;
          this.field_kb = this.field_kb + 1;
          if (fieldTemp$1 == this.field_eb) {
            this.field_cb = o.field_a;
            this.a(this.field_mb, true, 12 + this.field_hb.field_v, 12 - (-this.field_fb - this.field_hb.field_q));
            this.field_bb.field_L = 0;
            this.field_kb = 0;
            return super.n(param0 + 0);
          }
          this.field_bb.field_L = -((this.field_kb << 8) / this.field_eb) + 256;
          return super.n(param0 + 0);
        }
        if (null == this.field_cb) {
          return super.n(param0 + 0);
        }
        if (ah.field_a != this.field_cb) {
          if (this.field_cb != lm.field_O) {
            return super.n(param0 + 0);
          }
          fieldTemp$2 = this.field_kb + 1;
          this.field_kb = this.field_kb + 1;
          if (fieldTemp$2 != this.field_Z) {
            this.field_bb.field_L = (this.field_kb << 8) / this.field_Z;
            return super.n(param0 + 0);
          }
          this.field_bb.field_L = 256;
          this.field_cb = null;
          return super.n(param0 + 0);
        }
        int fieldTemp$3 = this.field_kb + 1;
        this.field_kb = this.field_kb + 1;
        if (fieldTemp$3 == this.field_eb) {
          this.field_cb = o.field_a;
          this.a(this.field_mb, true, 12 + this.field_hb.field_v, 12 - (-this.field_fb - this.field_hb.field_q));
          this.field_bb.field_L = 0;
          this.field_kb = 0;
          return super.n(param0 + 0);
        }
        this.field_bb.field_L = -((this.field_kb << 8) / this.field_eb) + 256;
        return super.n(param0 + 0);
    }

    jk(hm param0, fe param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_v, param1.field_q + param2 + 12);
        try {
          this.field_fb = param2;
          this.field_mb = param4;
          this.field_Z = param3;
          this.field_eb = param3;
          this.b(28199, param1);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_lb = "Loading Super Volcano...";
        field_ib = new int[128];
        field_ab = 0;
        field_jb = new bg(7, 0, 1, 1);
    }
}
