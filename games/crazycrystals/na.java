/*
 * Decompiled by CFR-JS 0.4.0.
 */
class na extends ud implements vd {
    private boolean field_gb;
    static dl field_eb;
    private boolean field_db;
    private boolean field_ib;
    static int field_kb;
    static String field_fb;
    private vc field_jb;
    private boolean field_hb;
    private co field_cb;

    final static int a(eb param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 10) {
            field_fb = (String) null;
          }
          stackIn_3_0 = param0.a(36, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("na.GA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        boolean stackIn_6_1 = false;
        jd stackIn_12_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        jd var6 = null;
        var5 = CrazyCrystals.field_B;
        try {
          if (this.field_hb) {
            return;
          }
          this.field_hb = true;
          stackIn_6_1 = (param0 == 256);
          this.field_gb = stackIn_6_1;
          this.field_cb.b((byte) -116, 4210752, 8405024);
          if (param1 != 1833) {
            na.m(-107);
          }
          var6 = new jd(this, this.field_jb, param2);
          var4 = var6;
          if (param0 == 5) {
            var6.a(ng.field_i, (byte) -124, 11);
            var6.a(dn.field_c, (byte) -124, 17);
          } else {
            if (param0 == 256) {
              var6.a(ba.field_l, (bi) (this), 98);
            } else {
              stackIn_12_0 = var6;
              if (!this.field_ib) {
                stackIn_13_1 = cf.field_h;
              } else {
                stackIn_13_1 = ba.field_l;
              }
              ((jd) (Object) stackIn_12_0).a(stackIn_13_1, (byte) -124, -1);
            }
          }
          if (param0 != 3) {
            if (4 == param0) {
              var6.a(pg.field_b, (byte) -124, 8);
            } else {
              if (6 != param0) {
                if (param0 == 9) {
                  var6.a(nk.field_k, (bi) (this), 52);
                }
              } else {
                var6.a(sb.field_C, (byte) -124, 9);
              }
            }
          } else {
            var6.a(ik.field_f, (byte) -124, 7);
          }
          this.a((qm) (var6), (byte) -50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("na.IA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void l(int param0) {
        jd var2 = null;
        jd var2Lifetime1;
        if (param0 >= 117) {
          this.field_cb.b((byte) 0, 4210752, 2121792);
          var2 = new jd(this, this.field_jb, kj.field_c);
          var2.a(vm.field_e, (byte) -124, 15);
          this.a((qm) (var2), (byte) -50);
          return;
        }
        pc var3 = (pc) null;
        this.a((byte) -113, -16, -83, 107, (pc) null);
        this.field_cb.b((byte) 0, 4210752, 2121792);
        var2Lifetime1 = new jd(this, this.field_jb, kj.field_c);
        var2Lifetime1.a(vm.field_e, (byte) -124, 15);
        this.a((qm) (var2Lifetime1), (byte) -50);
    }

    final static void a(int param0, boolean param1, f[][] param2, int param3, int param4) {
        try {
          ul.a(new mj(param0, param3, -1, 0), param1, param2, (byte) 102);
          ul.a(new mj(param0, param3, 1, 0), param1, param2, (byte) 48);
          ul.a(new mj(param0, param3, 0, -1), param1, param2, (byte) 92);
          if (param4 != 77) {
            na.a(-116, false, (f[][]) null, -41, 3);
          }
          ul.a(new mj(param0, param3, 0, 1), param1, param2, (byte) 113);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "na.JA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -78 / ((param0 - 83) / 36);
          if (!this.field_gb) {
            vo.a(31251, "tochangedisplayname.ws", le.b((byte) -20));
            return;
          }
          rc.a(-25537, 3);
          this.i((byte) -65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("na.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    na(ol param0, vc param1, String param2, boolean param3, boolean param4) {
        super(param0, new jd((na) null, param1, param2), 77, 10, 10);
        try {
          this.field_gb = false;
          this.field_hb = false;
          this.field_jb = param1;
          this.field_db = param4 ? true : false;
          this.field_ib = param3 ? true : false;
          this.field_cb = new co(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_cb.field_H = true;
          this.b(this.field_cb, -117);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == param0) {
            this.i((byte) -52);
            return true;
          }
          if (param1 == 19279) {
            stackIn_8_0 = super.a(param0, 19279, param2, param3);
            return stackIn_8_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("na.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void m(int param0) {
        if (param0 != -18883) {
          return;
        }
        field_eb = null;
        field_fb = null;
    }

    final void i(byte param0) {
        eb var3;
        if (!this.field_C) {
          return;
        }
        this.field_C = false;
        if (this.field_ib) {
          wm.b((byte) -12);
        } else {
          if (this.field_db) {
            mo.a((byte) -103);
          }
        }
        if (param0 <= -9) {
          return;
        }
        var3 = (eb) null;
        na.a((eb) null, false, 44);
    }

    static {
        field_fb = "Updates will sent to the email address you've given";
    }
}
