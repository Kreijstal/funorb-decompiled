/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mf extends uda implements lja {
    private boolean field_ib;
    private boolean field_gb;
    private boolean field_fb;
    private boolean field_jb;
    private de field_kb;
    private po field_hb;

    final void o(int param0) {
        hc var2;
        this.field_kb.c(1705304705, 2121792, 4210752);
        var2 = new hc((mf) (this), this.field_hb, fr.field_r);
        if (param0 != 2113632) {
          this.field_jb = true;
          var2.a(7, wk.field_i, 15);
          this.e(var2, 33);
          return;
        } else {
          var2.a(7, wk.field_i, 15);
          this.e(var2, 33);
          return;
        }
    }

    final boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (13 != param1) {
              L1: {
                if (param0 == 10) {
                  break L1;
                } else {
                  this.o(25);
                  break L1;
                }
              }
              stackIn_6_0 = super.a(10, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.p(-94);
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("mf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0, String param1, boolean param2) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        hc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        hc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hc var6 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            if (!this.field_gb) {
              L1: {
                stackIn_5_0 = this;

                if ((param0 ^ -1) != -257) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L1;
                }
              }
              L2: {
                ((mf) (this)).field_ib = stackIn_6_1 != 0;
                stackIn_8_0 = this;

                if (!param2) {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = this;
                  stackIn_9_1 = 1;
                  break L2;
                }
              }
              L3: {
                ((mf) (this)).field_gb = stackIn_9_1 != 0;
                this.field_kb.c(1705304705, 8405024, 4210752);
                var6 = new hc((mf) (this), this.field_hb, param1);
                var4 = var6;
                if (5 != param0) {
                  if (-257 == (param0 ^ -1)) {
                    var6.a((pl) (this), bga.field_k, 19528);
                    break L3;
                  } else {
                    L4: {
                      stackIn_14_0 = (hc) (var6);

                      stackIn_14_1 = 7;

                      if (!this.field_jb) {
                        stackIn_15_0 = (hc) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = ina.field_s;
                        break L4;
                      } else {
                        stackIn_15_0 = (hc) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = bga.field_k;
                        break L4;
                      }
                    }
                    ((hc) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, -1);
                    break L3;
                  }
                } else {
                  var6.a(7, tt.field_h, 11);
                  var6.a(7, uda.field_ab, 17);
                  break L3;
                }
              }
              L5: {
                if (param0 == 3) {
                  var6.a(7, pr.field_c, 7);
                  break L5;
                } else {
                  if ((param0 ^ -1) == -5) {
                    var6.a(7, hd.field_r, 8);
                    break L5;
                  } else {
                    if ((param0 ^ -1) != -7) {
                      if ((param0 ^ -1) == -10) {
                        var6.a((pl) (this), eq.field_i, 19528);
                        break L5;
                      } else {
                        this.e(var6, 33);
                        return;
                      }
                    } else {
                      var6.a(7, wha.field_b, 9);
                      break L5;
                    }
                  }
                }
              }
              this.e(var6, 33);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("mf.BA(").append(param0).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public void a(int param0, hf param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 >= 50) {
              break L0;
            } else {
              this.field_hb = (po) null;
              break L0;
            }
          }
          if (!this.field_ib) {
            eea.a((byte) 127, "tochangedisplayname.ws", nia.d(-31768));
            return;
          } else {
            ep.a(3, 8192);
            this.p(-106);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("mf.AA(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void p(int param0) {
        if (param0 < -71) {
          if (this.field_C) {
            this.field_C = false;
            if (!this.field_jb) {
              if (!this.field_fb) {
                return;
              } else {
                dla.b(0);
                return;
              }
            } else {
              sp.b(1);
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_fb = false;
          if (this.field_C) {
            this.field_C = false;
            if (!this.field_jb) {
              if (!this.field_fb) {
                return;
              } else {
                dla.b(0);
                return;
              }
            } else {
              sp.b(1);
              return;
            }
          } else {
            return;
          }
        }
    }

    mf(rp param0, po param1, String param2, boolean param3, boolean param4) {
        super(param0, new hc((mf) null, param1, param2), 77, 10, 10);
        try {
            this.field_jb = param3 ? true : false;
            this.field_fb = param4 ? true : false;
            this.field_ib = false;
            this.field_gb = false;
            this.field_hb = param1;
            this.field_kb = new de(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_kb.field_P = true;
            this.c(this.field_kb, -123);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
