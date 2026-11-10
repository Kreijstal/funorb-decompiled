/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sg extends ki implements hh {
    static boolean field_ib;
    static int[] field_kb;
    private boolean field_hb;
    private Font field_nb;
    private boolean field_gb;
    private boolean field_lb;
    static al field_eb;
    private boolean field_mb;
    private hb field_ob;
    static tj field_jb;
    static int field_pb;
    static int[] field_fb;

    public void onButtonActivated(int param0, int param1, an param2, int param3, int param4) {
        RuntimeException var6 = null;
        UiWidget var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_mb) {
            og.b(-118, 3);
            this.closeDialog((byte) 52);
          } else {
            qi.a("tochangedisplayname.ws", hc.a(0), param1 ^ 80);
          }
          if (param1 == -6) {
            return;
          }
          var7 = (UiWidget) null;
          this.requestKeyboardFocus(105, -54, (UiWidget) null, 'ﾵ');
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("sg.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void showConnectionRestored(int param0) {
        e var2 = null;
        e var2Lifetime1;
        if (param0 > 88) {
          this.field_ob.setColors(-102, 4210752, 2121792);
          var2 = new e(this, this.field_nb, kj.field_a);
          var2.addActionButton((byte) 95, fe.field_F, 15);
          this.transitionToContent(20, var2);
          return;
        }
        field_jb = (tj) null;
        this.field_ob.setColors(-102, 4210752, 2121792);
        var2Lifetime1 = new e(this, this.field_nb, kj.field_a);
        var2Lifetime1.addActionButton((byte) 95, fe.field_F, 15);
        this.transitionToContent(20, var2Lifetime1);
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 != param1) {
            var5_int = 11 / ((param0 + 83) / 32);
            stackIn_4_0 = super.requestKeyboardFocus(-115, param1, param2, param3);
            return stackIn_4_0;
          }
          this.closeDialog((byte) -8);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("sg.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final void showResultMessage(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        e stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_13_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        e var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        e var6 = null;
        var5 = ZombieDawn.field_J;
        try {
          if (this.field_gb) {
            return;
          }
          stackIn_6_1 = (param1 == 256);
          this.field_mb = stackIn_6_1;
          this.field_gb = true;
          this.field_ob.setColors(param2 - 115, 4210752, 8405024);
          var6 = new e(this, this.field_nb, param0);
          var4 = var6;
          if (param1 != 5) {
            if (param1 != 256) {
              stackIn_12_0 = var6;
              stackIn_12_1 = 89;
              if (!this.field_lb) {
                stackIn_13_2 = jk.field_g;
              } else {
                stackIn_13_2 = el.field_i;
              }
              ((e) (Object) stackIn_12_0).addActionButton((byte) stackIn_12_1, stackIn_13_2, -1);
            } else {
              var6.addButton(el.field_i, 115, (sk) (this));
            }
          } else {
            var6.addActionButton((byte) 119, te.field_R, 11);
            var6.addActionButton((byte) 104, qd.field_d, 17);
          }
          if (param1 == 3) {
            var6.addActionButton((byte) 92, rf.field_b, 7);
          } else {
            if (param1 == 4) {
              var6.addActionButton((byte) 99, ti.field_f, 8);
            } else {
              if (6 == param1) {
                var6.addActionButton((byte) 116, di.field_I, 9);
              } else {
                if (9 == param1) {
                  var6.addButton(r.field_J, 113, (sk) (this));
                }
              }
            }
          }
          this.transitionToContent(param2 + 3, var6);
          if (param2 == 17) {
            return;
          }
          field_jb = (tj) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("sg.G(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    sg(dn param0, Font param1, String param2, boolean param3, boolean param4) {
        super(param0, new e((sg) null, param1, param2), 77, 10, 10);
        try {
          this.field_nb = param1;
          this.field_mb = false;
          this.field_hb = param4 ? true : false;
          this.field_gb = false;
          this.field_lb = param3 ? true : false;
          this.field_ob = new hb(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ob.field_F = true;
          this.addChild(this.field_ob, 10);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_kb = null;
        field_jb = null;
        field_eb = null;
        if (param0) {
          sg.releaseStatics(true);
          field_fb = null;
          return;
        }
        field_fb = null;
    }

    final void closeDialog(byte param0) {
        int var2 = -89 / ((param0 + 92) / 34);
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (this.field_lb) {
          c.a(65);
          return;
        }
        if (this.field_hb) {
          ub.showLoginDialog((byte) 50);
          return;
        }
    }

    static {
        field_ib = false;
        field_fb = new int[]{12263987, 11184691, 4491485};
    }
}
