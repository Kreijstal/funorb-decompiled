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
        } else {
          this.field_z = false;
          if (!this.field_W) {
            if (this.field_U) {
              lja.e((byte) 90);
              if (param0 != -106) {
                this.field_V = true;
                return;
              } else {
                return;
              }
            } else {
              if (param0 == -106) {
                return;
              } else {
                this.field_V = true;
                return;
              }
            }
          } else {
            kia.a((byte) 63);
            if (param0 == -106) {
              return;
            } else {
              this.field_V = true;
              return;
            }
          }
        }
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
        nna var3 = new nna((os) (this), this.field_T, vaa.field_o);
        var3.a(-123, nna.field_D, 15);
        this.b(var3, -53);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param1 ^ -1) != -14) {
              if (param0 == -15834) {
                stackIn_7_0 = super.a(-15834, param1, param2, param3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.l((byte) -106);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("os.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public void a(int param0, int param1, int param2, htb param3, int param4) {
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_V) {
                cea.a(-123, 3);
                this.l((byte) -106);
                break L1;
              } else {
                lc.a((byte) 86, vpa.b((byte) -92), "tochangedisplayname.ws");
                break L1;
              }
            }
            if (param0 == 11) {
              break L0;
            } else {
              var7 = (String) null;
              this.a(false, (String) null, 35);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("os.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, String param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        nna stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        nna stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nna var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nna var6 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (this.field_S) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if (param2 != 256) {
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
                ((os) (this)).field_V = stackIn_7_1 != 0;
                stackIn_9_0 = this;

                if (!param0) {
                  stackIn_10_0 = this;
                  stackIn_10_1 = 0;
                  break L2;
                } else {
                  stackIn_10_0 = this;
                  stackIn_10_1 = 1;
                  break L2;
                }
              }
              L3: {
                ((os) (this)).field_S = stackIn_10_1 != 0;
                this.field_R.b(8405024, -21202, 4210752);
                var6 = new nna((os) (this), this.field_T, param1);
                var4 = var6;
                if (-6 == (param2 ^ -1)) {
                  var6.a(-123, fma.field_c, 11);
                  var6.a(-115, vda.field_q, 17);
                  break L3;
                } else {
                  if (param2 == 256) {
                    var6.a((byte) 127, kj.field_p, (sba) (this));
                    break L3;
                  } else {
                    L4: {
                      stackIn_14_0 = (nna) (var6);

                      stackIn_14_1 = -128;

                      if (this.field_W) {
                        stackIn_15_0 = (nna) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = kj.field_p;
                        break L4;
                      } else {
                        stackIn_15_0 = (nna) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = vab.field_a;
                        break L4;
                      }
                    }
                    ((nna) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, -1);
                    break L3;
                  }
                }
              }
              L5: {
                if ((param2 ^ -1) == -4) {
                  var6.a(-125, mab.field_h, 7);
                  break L5;
                } else {
                  if (-5 == (param2 ^ -1)) {
                    var6.a(-119, eia.field_p, 8);
                    break L5;
                  } else {
                    if (6 != param2) {
                      if ((param2 ^ -1) != -10) {
                        break L5;
                      } else {
                        var6.a((byte) 111, keb.field_o, (sba) (this));
                        break L5;
                      }
                    } else {
                      var6.a(-126, lia.field_c, 9);
                      break L5;
                    }
                  }
                }
              }
              this.b(var6, 94);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("os.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
