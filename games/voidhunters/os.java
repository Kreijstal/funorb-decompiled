/*
 * Decompiled by CFR-JS 0.4.0.
 */
class os extends gea implements oo {
    private boolean field_V;
    private ttb field_R;
    private no field_T;
    private boolean field_S;
    private boolean field_W;
    private boolean field_U;

    final void l(byte param0) {
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (this.field_W) {
          kia.a((byte) 63);
          if (param0 != -106) {
            this.field_V = true;
            return;
          }
          return;
        }
        if (!this.field_U) {
          if (param0 != -106) {
            this.field_V = true;
            return;
          }
          return;
        }
        lja.e((byte) 90);
        if (param0 == -106) {
          return;
        }
        this.field_V = true;
    }

    os(ida param0, no param1, String param2, boolean param3, boolean param4) {
        super(param0, new nna((os) null, param1, param2), 77, 10, 10);
        try {
          this.field_W = param3 ? true : false;
          this.field_S = false;
          this.field_U = param4 ? true : false;
          this.field_T = param1;
          this.field_V = false;
          this.field_R = new ttb(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_R.field_x = true;
          this.b(-18756, this.field_R);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "os.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void g(int param0) {
        int var2 = 102 % ((param0 - 24) / 59);
        this.field_R.b(2121792, -21202, 4210752);
        nna var3 = new nna(this, this.field_T, vaa.field_o);
        var3.a(-123, nna.field_D, 15);
        this.b(var3, -53);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13) {
            this.l((byte) -106);
            return true;
          }
          if (param0 == -15834) {
            stackIn_7_0 = super.a(-15834, param1, param2, param3);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("os.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_V) {
            cea.a(-123, 3);
            this.l((byte) -106);
          } else {
            lc.a((byte) 86, vpa.b((byte) -92), "tochangedisplayname.ws");
          }
          if (param0 == 11) {
            return;
          }
          var7 = (String) null;
          this.a(false, (String) null, 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("os.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(boolean param0, String param1, int param2) {
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        nna stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        nna var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nna var6 = null;
        var5 = VoidHunters.field_G;
        try {
          if (this.field_S) {
            return;
          }
          stackIn_7_1 = (param2 == 256);
          this.field_V = stackIn_7_1;
          stackIn_10_1 = (param0);
          this.field_S = stackIn_10_1;
          this.field_R.b(8405024, -21202, 4210752);
          var6 = new nna(this, this.field_T, param1);
          var4 = var6;
          if (param2 == 5) {
            var6.a(-123, fma.field_c, 11);
            var6.a(-115, vda.field_q, 17);
          } else {
            if (param2 == 256) {
              var6.a((byte) 127, kj.field_p, (sba) (this));
            } else {
              stackIn_14_0 = var6;
              stackIn_14_1 = -128;
              if (this.field_W) {
                stackIn_15_2 = kj.field_p;
              } else {
                stackIn_15_2 = vab.field_a;
              }
              ((nna) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, -1);
            }
          }
          if (param2 == 3) {
            var6.a(-125, mab.field_h, 7);
          } else {
            if (param2 == 4) {
              var6.a(-119, eia.field_p, 8);
            } else {
              if (6 != param2) {
                if (param2 == 9) {
                  var6.a((byte) 111, keb.field_o, (sba) (this));
                }
              } else {
                var6.a(-126, lia.field_c, 9);
              }
            }
          }
          this.b(var6, 94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("os.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
