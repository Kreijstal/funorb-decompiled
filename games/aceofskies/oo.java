/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oo extends dg implements dn {
    static ll field_W;
    private ss field_bb;
    private boolean field_cb;
    private hc field_U;
    private boolean field_V;
    static int[] field_Y;
    private boolean field_X;
    static kp field_T;
    static vd[] field_ab;
    private boolean field_Z;

    final void l(int param0) {
        jn var2;
        if (param0 < 82) {
          this.field_bb = (ss) null;
          this.field_bb.a(4210752, 2121792, (byte) 61);
          var2 = new jn((oo) (this), this.field_U, ek.field_x);
          var2.a(15, (byte) -57, ag.field_o);
          this.d(var2, -30244);
          return;
        } else {
          this.field_bb.a(4210752, 2121792, (byte) 61);
          var2 = new jn((oo) (this), this.field_U, ek.field_x);
          var2.a(15, (byte) -57, ag.field_o);
          this.d(var2, -30244);
          return;
        }
    }

    public void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 80 % ((param4 - -27) / 61);
          if (!this.field_X) {
            vi.a((byte) 103, "tochangedisplayname.ws", bm.m(125));
            return;
          } else {
            oi.a(3, 20665);
            this.h((byte) -64);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("oo.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(byte param0) {
        int var2;
        var2 = -58 % ((72 - param0) / 35);
        if (this.field_z) {
          this.field_z = false;
          if (!this.field_cb) {
            if (this.field_V) {
              aa.b(87);
              return;
            } else {
              return;
            }
          } else {
            un.a(-21);
            return;
          }
        } else {
          return;
        }
    }

    public static void g(byte param0) {
        if (param0 != 105) {
            return;
        }
        field_Y = null;
        field_T = null;
        field_W = null;
        field_ab = null;
    }

    oo(lt param0, hc param1, String param2, boolean param3, boolean param4) {
        super(param0, new jn((oo) null, param1, param2), 77, 10, 10);
        try {
            this.field_U = param1;
            this.field_V = param4 ? true : false;
            this.field_Z = false;
            this.field_X = false;
            this.field_cb = param3 ? true : false;
            this.field_bb = new ss(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_bb.field_u = true;
            this.a(this.field_bb, 1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "oo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (13 == param1) {
              this.h((byte) 125);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = 48 % ((param0 - -53) / 33);
              stackIn_5_0 = super.a(23, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("oo.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    final void a(byte param0, int param1, String param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jn stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        jn stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        String stackIn_14_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jn var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        jn var7 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_Z) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if (256 != param1) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((oo) (this)).field_X = stackIn_7_1 != 0;
                this.field_Z = true;
                this.field_bb.a(4210752, 8405024, (byte) -81);
                var5 = 85 / ((1 - param0) / 52);
                var7 = new jn((oo) (this), this.field_U, param2);
                var4 = var7;
                if (param1 != 5) {
                  if ((param1 ^ -1) != -257) {
                    L3: {
                      stackIn_13_0 = (jn) (var7);

                      stackIn_13_1 = -1;

                      stackIn_13_2 = 124;

                      if (this.field_cb) {
                        stackIn_14_0 = (jn) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = stackIn_13_2;
                        stackIn_14_3 = hg.field_z;
                        break L3;
                      } else {
                        stackIn_14_0 = (jn) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = stackIn_13_2;
                        stackIn_14_3 = eu.field_j;
                        break L3;
                      }
                    }
                    ((jn) (Object) stackIn_14_0).a(stackIn_14_1, (byte) stackIn_14_2, stackIn_14_3);
                    break L2;
                  } else {
                    var7.a((no) (this), 17547, hg.field_z);
                    break L2;
                  }
                } else {
                  var7.a(11, (byte) 113, ln.field_a);
                  var7.a(17, (byte) -120, mb.field_s);
                  break L2;
                }
              }
              L4: {
                if ((param1 ^ -1) == -4) {
                  var7.a(7, (byte) 75, lu.field_a);
                  break L4;
                } else {
                  if (-5 == (param1 ^ -1)) {
                    var7.a(8, (byte) 101, mh.field_n);
                    break L4;
                  } else {
                    if (-7 == (param1 ^ -1)) {
                      var7.a(9, (byte) -124, ao.field_d);
                      break L4;
                    } else {
                      if (param1 != 9) {
                        break L4;
                      } else {
                        var7.a((no) (this), 17547, vn.field_g);
                        break L4;
                      }
                    }
                  }
                }
              }
              this.d(var7, -30244);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4_ref);

            stackIn_27_1 = new StringBuilder().append("oo.W(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_W = new ll(270, 70);
        field_Y = new int[8];
    }
}
