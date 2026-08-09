/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pt extends sf {
    private int field_Z;
    static String[] field_W;
    static je field_X;
    private int field_ib;
    private int field_hb;
    private bh field_cb;
    private tv field_bb;
    static h field_db;
    private int field_ab;
    private kb field_jb;
    private int field_fb;
    static uv field_eb;
    static String field_Y;
    static String field_gb;

    final static void c(int param0, int param1, int param2) {
        if (param2 < 1) {
            field_db = (h) null;
            rk.field_B = param0;
            ar.field_C = param1;
            return;
        }
        rk.field_B = param0;
        ar.field_C = param1;
    }

    final void m(int param0) {
        if (!(this.field_bb != ur.field_v)) {
            return;
        }
        this.field_bb = ki.field_e;
        int var2 = 113 % ((param0 - 69) / 50);
        this.field_hb = 0;
        this.b(72, this.field_jb);
        this.field_jb = null;
        this.field_cb.field_K = 0;
    }

    boolean a(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_bb) {
          if (ur.field_v == this.field_bb) {
            fieldTemp$2 = this.field_hb + 1;
            this.field_hb = this.field_hb + 1;
            if (this.field_ib == fieldTemp$2) {
              this.field_bb = g.field_c;
              this.a(this.field_Z, false, this.field_jb.field_w + 12 + this.field_ab, this.field_jb.field_l + 12);
              this.field_hb = 0;
              this.field_cb.field_K = 0;
              if (param0 != -1) {
                this.k(117);
                return super.a((byte) -1);
              } else {
                return super.a((byte) -1);
              }
            } else {
              this.field_cb.field_K = 256 + -((this.field_hb << -1638888056) / this.field_ib);
              if (param0 != -1) {
                this.k(117);
                return super.a((byte) -1);
              } else {
                return super.a((byte) -1);
              }
            }
          } else {
            if (ki.field_e != this.field_bb) {
              if (param0 != -1) {
                this.k(117);
                return super.a((byte) -1);
              } else {
                return super.a((byte) -1);
              }
            } else {
              fieldTemp$3 = this.field_hb + 1;
              this.field_hb = this.field_hb + 1;
              if (this.field_fb == fieldTemp$3) {
                this.field_bb = null;
                this.field_cb.field_K = 256;
                if (param0 != -1) {
                  this.k(117);
                  return super.a((byte) -1);
                } else {
                  return super.a((byte) -1);
                }
              } else {
                this.field_cb.field_K = (this.field_hb << 134380648) / this.field_fb;
                if (param0 == -1) {
                  return super.a((byte) -1);
                } else {
                  this.k(117);
                  return super.a((byte) -1);
                }
              }
            }
          }
        } else {
          if (param0 == -1) {
            return super.a((byte) -1);
          } else {
            this.k(117);
            return super.a((byte) -1);
          }
        }
    }

    public static void i(byte param0) {
        field_db = null;
        field_gb = null;
        field_eb = null;
        field_W = null;
        field_Y = null;
        if (param0 != -72) {
            return;
        }
        field_X = null;
    }

    final void l(int param0) {
        int var2;
        if (this.field_bb != null) {
          if (ki.field_e == this.field_bb) {
            this.field_bb = null;
            this.field_cb.field_K = 256;
            super.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          } else {
            this.a(this.field_jb.field_l + 12, (byte) 98, 12 + (this.field_ab - -this.field_jb.field_w));
            this.b(107, this.field_jb);
            this.field_bb = null;
            this.field_cb.field_K = 256;
            super.l(81);
            var2 = 71 % ((param0 - -25) / 57);
            return;
          }
        } else {
          super.l(81);
          var2 = 71 % ((param0 - -25) / 57);
          return;
        }
    }

    void a(kb param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 116 % ((-27 - param1) / 44);
            this.field_jb = param0;
            if (this.field_bb != g.field_c) {
              if (this.field_bb == ur.field_v) {
                break L0;
              } else {
                this.field_bb = ur.field_v;
                this.field_hb = 0;
                return;
              }
            } else {
              this.a(this.field_Z, false, this.field_jb.field_w + (12 + this.field_ab), 12 - -this.field_jb.field_l);
              this.field_hb = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pt.A(");

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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (null != this.field_cb) {
                L1: {
                  if (98 != param1) {
                    break L1;
                  } else {
                    this.field_cb.a(param3 ^ -12222, param0);
                    break L1;
                  }
                }
                L2: {
                  if ((param1 ^ -1) == -100) {
                    this.field_cb.a(11, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("pt.F(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final boolean k(int param0) {
        int var2 = 115 / ((param0 - -1) / 44);
        this.l(121);
        return super.k(92);
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            L0: {
              L1: {
                var4 = param2.getGraphics();
                if (param1 == 12) {
                  break L1;
                } else {
                  field_Y = (String) null;
                  break L1;
                }
              }
              so.field_b.a(255, var4, param0, param3);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref2);

            stackIn_8_1 = new StringBuilder().append("pt.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0, kb param1) {
        try {
            if (this.field_cb != null) {
                this.field_cb.d(92);
            }
            if (param1 != null) {
                param1.a(6, param1.field_l, 6 - -this.field_ab, 8192, param1.field_w);
                this.field_cb = new bh(param1);
            } else {
                this.field_cb = new bh();
            }
            int var3_int = 29 % ((param0 - 24) / 42);
            this.a((byte) 10, (kb) (this.field_cb));
            this.field_jb = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pt.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pt(gk param0, kb param1, int param2, int param3, int param4) {
        super(param0, param1.field_l + 12, 12 + param2 - -param1.field_w);
        try {
            this.field_Z = param4;
            this.field_ab = param2;
            this.field_fb = param3;
            this.field_ib = param3;
            this.b(-36, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_W = new String[]{"ready", "walk", "run", "attack", "ranged", "jeer", "defend", "death"};
        field_db = new h(3);
        field_Y = "Go Back";
        field_gb = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
