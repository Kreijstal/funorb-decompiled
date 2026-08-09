/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends sp {
    private sq field_cb;
    private int field_eb;
    private int field_Y;
    private wq field_bb;
    private iq field_Z;
    static int field_db;
    private int field_ab;
    private int field_W;
    private int field_X;

    final boolean a(int param0) {
        this.f((byte) -23);
        if (param0 != -1) {
            this.f((byte) -90);
            return super.a(-1);
        }
        return super.a(-1);
    }

    final void a(byte param0) {
        if (this.field_cb == nh.field_m) {
          return;
        } else {
          if (param0 >= -19) {
            this.field_W = 26;
            this.field_cb = id.field_g;
            this.field_eb = 0;
            this.b(13693, this.field_Z);
            this.field_Z = null;
            this.field_bb.field_J = 0;
            return;
          } else {
            this.field_cb = id.field_g;
            this.field_eb = 0;
            this.b(13693, this.field_Z);
            this.field_Z = null;
            this.field_bb.field_J = 0;
            return;
          }
        }
    }

    final static ge a(r param0, int param1, r param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ge stackIn_2_0 = null;
        ge stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0.a((byte) 120, param3);
            if (param1 == 12) {
              var6 = param0.a(var5_int, param4, 117);
              stackIn_4_0 = vg.a(var5_int, var6, param1 ^ -13, param0, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ge) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("rl.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_bb == null) {
                  break L1;
                } else {
                  L2: {
                    if ((param2 ^ -1) == -99) {
                      this.field_bb.a((byte) 116, param3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (99 != param2) {
                    break L1;
                  } else {
                    this.field_bb.a((byte) 116, param3);
                    return false;
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("rl.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    boolean j(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        iq var4;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (this.field_cb != null) {
          if (nh.field_m != this.field_cb) {
            if (this.field_cb == id.field_g) {
              fieldTemp$2 = this.field_eb + 1;
              this.field_eb = this.field_eb + 1;
              if (this.field_ab == fieldTemp$2) {
                this.field_cb = null;
                this.field_bb.field_J = 256;
                if (param0 != 17) {
                  var4 = (iq) null;
                  this.a(true, (iq) null);
                  return super.j(17);
                } else {
                  return super.j(17);
                }
              } else {
                this.field_bb.field_J = (this.field_eb << -1636877112) / this.field_ab;
                if (param0 != 17) {
                  var4 = (iq) null;
                  this.a(true, (iq) null);
                  return super.j(17);
                } else {
                  return super.j(17);
                }
              }
            } else {
              if (param0 != 17) {
                var4 = (iq) null;
                this.a(true, (iq) null);
                return super.j(17);
              } else {
                return super.j(17);
              }
            }
          } else {
            fieldTemp$3 = this.field_eb + 1;
            this.field_eb = this.field_eb + 1;
            if (fieldTemp$3 == this.field_Y) {
              this.field_cb = gf.field_f;
              this.a(this.field_X, 12 - -this.field_Z.field_n, this.field_W + 12 - -this.field_Z.field_s, (byte) 118);
              this.field_eb = 0;
              this.field_bb.field_J = 0;
              if (param0 == 17) {
                return super.j(17);
              } else {
                var4 = (iq) null;
                this.a(true, (iq) null);
                return super.j(17);
              }
            } else {
              this.field_bb.field_J = 256 + -((this.field_eb << 384528232) / this.field_Y);
              if (param0 == 17) {
                return super.j(17);
              } else {
                var4 = (iq) null;
                this.a(true, (iq) null);
                return super.j(17);
              }
            }
          }
        } else {
          if (param0 != 17) {
            var4 = (iq) null;
            this.a(true, (iq) null);
            return super.j(17);
          } else {
            return super.j(17);
          }
        }
    }

    rl(sd param0, iq param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_n, param1.field_s + (param2 + 12));
        try {
            this.field_X = param4;
            this.field_W = param2;
            this.field_ab = param3;
            this.field_Y = param3;
            this.b(13693, param1);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(int param0, iq param1) {
        if (this.field_bb != null) {
            this.field_bb.c(2);
        }
        if (param1 == null) {
            this.field_bb = new wq();
        } else {
            param1.a(false, 6, this.field_W + 6, param1.field_s, param1.field_n);
            this.field_bb = new wq(param1);
        }
        this.c((byte) -61, this.field_bb);
        if (param0 != 13693) {
            return;
        }
        try {
            this.field_Z = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rl.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(boolean param0, iq param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.f((byte) 75);
                break L1;
              }
            }
            this.field_Z = param1;
            if (gf.field_f == this.field_cb) {
              this.a(this.field_X, 12 + this.field_Z.field_n, this.field_W + 12 - -this.field_Z.field_s, (byte) 61);
              this.field_eb = 0;
              return;
            } else {
              if (nh.field_m == this.field_cb) {
                break L0;
              } else {
                this.field_eb = 0;
                this.field_cb = nh.field_m;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("rl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void f(byte param0) {
        if (null == this.field_cb) {
            super.f(param0);
            return;
        }
        if (id.field_g != this.field_cb) {
            this.b(-1535749535, this.field_Z.field_n + 12, 12 - -this.field_W + this.field_Z.field_s);
            this.b(param0 + 13716, this.field_Z);
        } else {
            this.field_bb.field_J = 256;
            this.field_cb = null;
            super.f(param0);
            return;
        }
        this.field_bb.field_J = 256;
        this.field_cb = null;
        super.f(param0);
    }

    static {
        field_db = -1;
    }
}
