/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qj extends kc {
    private ie field_Y;
    static gj field_eb;
    private int field_ab;
    private int field_W;
    private int field_db;
    private og field_Z;
    private uj field_X;
    private int field_bb;
    static String field_V;
    private int field_cb;

    void c(int param0, uj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_X = param1;
            if (param0 == 20317) {
              if (this.field_Z == sk.field_c) {
                this.b(12 - -this.field_X.field_i, this.field_db + 12 - -this.field_X.field_f, (byte) 120, this.field_cb);
                this.field_ab = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.field_Z != na.field_e) {
                  this.field_ab = 0;
                  this.field_Z = na.field_e;
                  return;
                } else {
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("qj.GA(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean i(int param0) {
        if (param0 >= -121) {
          this.i(-95);
          this.j(-128);
          return super.i(-125);
        } else {
          this.j(-128);
          return super.i(-125);
        }
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (null != this.field_Y) {
                L1: {
                  if (-99 != (param3 ^ -1)) {
                    break L1;
                  } else {
                    this.field_Y.a(0, param0);
                    break L1;
                  }
                }
                L2: {
                  if ((param3 ^ -1) == -100) {
                    this.field_Y.a(0, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("qj.EA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    qj(tc param0, uj param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_i, param2 + (12 + param1.field_f));
        try {
            this.field_db = param2;
            this.field_bb = param3;
            this.field_W = param3;
            this.field_cb = param4;
            this.d(6, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "qj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void k(int param0) {
        if (na.field_e == this.field_Z) {
          return;
        } else {
          this.field_ab = 0;
          this.field_Z = w.field_w;
          if (param0 > -74) {
            this.field_X = (uj) null;
            this.d(6, this.field_X);
            this.field_X = null;
            this.field_Y.field_w = 0;
            return;
          } else {
            this.d(6, this.field_X);
            this.field_X = null;
            this.field_Y.field_w = 0;
            return;
          }
        }
    }

    private final void d(int param0, uj param1) {
        try {
            if (!(this.field_Y == null)) {
                this.field_Y.b(4);
            }
            if (param1 == null) {
                this.field_Y = new ie();
            } else {
                param1.a(6, param1.field_i, (byte) 125, param1.field_f, this.field_db + 6);
                this.field_Y = new ie(param1);
            }
            if (param0 != 6) {
                this.j(-25);
            }
            this.a(true, this.field_Y);
            this.field_X = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "qj.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    boolean g(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = StarCannon.field_A;
        if (null != this.field_Z) {
          if (na.field_e != this.field_Z) {
            if (this.field_Z != w.field_w) {
              if (param0 != -124) {
                qj.l(-17);
                return super.g((byte) -124);
              } else {
                return super.g((byte) -124);
              }
            } else {
              fieldTemp$2 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (fieldTemp$2 == this.field_bb) {
                this.field_Z = null;
                this.field_Y.field_w = 256;
                if (param0 != -124) {
                  qj.l(-17);
                  return super.g((byte) -124);
                } else {
                  return super.g((byte) -124);
                }
              } else {
                this.field_Y.field_w = (this.field_ab << -2068842904) / this.field_bb;
                if (param0 != -124) {
                  qj.l(-17);
                  return super.g((byte) -124);
                } else {
                  return super.g((byte) -124);
                }
              }
            }
          } else {
            fieldTemp$3 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$3 == this.field_W) {
              this.field_Z = sk.field_c;
              this.b(this.field_X.field_i + 12, this.field_X.field_f + this.field_db + 12, (byte) 120, this.field_cb);
              this.field_Y.field_w = 0;
              this.field_ab = 0;
              if (param0 != -124) {
                qj.l(-17);
                return super.g((byte) -124);
              } else {
                return super.g((byte) -124);
              }
            } else {
              this.field_Y.field_w = -((this.field_ab << -1700360088) / this.field_W) + 256;
              if (param0 == -124) {
                return super.g((byte) -124);
              } else {
                qj.l(-17);
                return super.g((byte) -124);
              }
            }
          }
        } else {
          if (param0 != -124) {
            qj.l(-17);
            return super.g((byte) -124);
          } else {
            return super.g((byte) -124);
          }
        }
    }

    final void j(int param0) {
        if (null != this.field_Z) {
          if (w.field_w == this.field_Z) {
            this.field_Y.field_w = 256;
            this.field_Z = null;
            super.j(-119);
            if (param0 <= -104) {
              return;
            } else {
              this.i(123);
              return;
            }
          } else {
            this.b(12 + this.field_X.field_i, (byte) 57, this.field_X.field_f + (this.field_db + 12));
            this.d(6, this.field_X);
            this.field_Y.field_w = 256;
            this.field_Z = null;
            super.j(-119);
            if (param0 > -104) {
              this.i(123);
              return;
            } else {
              return;
            }
          }
        } else {
          super.j(-119);
          if (param0 <= -104) {
            return;
          } else {
            this.i(123);
            return;
          }
        }
    }

    public static void l(int param0) {
        field_V = null;
        if (param0 > -77) {
            field_V = (String) null;
            field_eb = null;
            return;
        }
        field_eb = null;
    }

    static {
        field_V = "Create a free Account";
    }
}
