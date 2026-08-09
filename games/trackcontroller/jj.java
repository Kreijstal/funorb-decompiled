/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj extends db implements m {
    private dg field_eb;
    private oh field_gb;
    private boolean field_jb;
    private boolean field_kb;
    static int[] field_fb;
    private boolean field_ib;
    private boolean field_hb;

    final void a(int param0, String param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        lc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        lc stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        lc var6 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_ib) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if (param0 != 256) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              ((jj) (this)).field_jb = stackIn_7_1 != 0;
              this.field_ib = true;
              if (param2 == -10) {
                L2: {
                  this.field_eb.a(4210752, 8405024, (byte) -33);
                  var6 = new lc((jj) (this), this.field_gb, param1);
                  if (-6 != (param0 ^ -1)) {
                    if ((param0 ^ -1) != -257) {
                      L3: {
                        stackIn_15_0 = (lc) (var6);

                        stackIn_15_1 = param2 + -17030;

                        if (!this.field_hb) {
                          stackIn_16_0 = (lc) ((Object) stackIn_15_0);
                          stackIn_16_1 = stackIn_15_1;
                          stackIn_16_2 = ea.field_p;
                          break L3;
                        } else {
                          stackIn_16_0 = (lc) ((Object) stackIn_15_0);
                          stackIn_16_1 = stackIn_15_1;
                          stackIn_16_2 = ib.field_c;
                          break L3;
                        }
                      }
                      ((lc) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, -1);
                      break L2;
                    } else {
                      var6.a(param2 ^ 4, (tg) (this), ib.field_c);
                      break L2;
                    }
                  } else {
                    var6.a(param2 + -17030, dh.field_r, 11);
                    var6.a(-17040, cg.field_b, 17);
                    break L2;
                  }
                }
                L4: {
                  if (3 != param0) {
                    if (-5 != (param0 ^ -1)) {
                      if ((param0 ^ -1) == -7) {
                        var6.a(-17040, md.field_c, 9);
                        break L4;
                      } else {
                        if ((param0 ^ -1) == -10) {
                          var6.a(param2 + -4, (tg) (this), fh.field_d);
                          break L4;
                        } else {
                          this.b(var6, -101);
                          return;
                        }
                      }
                    } else {
                      var6.a(-17040, wg.field_h, 8);
                      break L4;
                    }
                  } else {
                    var6.a(-17040, ea.field_y, 7);
                    break L4;
                  }
                }
                this.b(var6, -101);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("jj.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public void a(rh param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_jb) {
                gk.a("tochangedisplayname.ws", gd.b((byte) 77), -110);
                break L1;
              } else {
                qc.b(3, (byte) -42);
                this.t(20252);
                break L1;
              }
            }
            if (param4 == -27322) {
              break L0;
            } else {
              this.field_hb = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("jj.A(");

            if (param0 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    jj(vl param0, oh param1, String param2, boolean param3, boolean param4) {
        super(param0, new lc((jj) null, param1, param2), 77, 10, 10);
        try {
            this.field_jb = false;
            this.field_ib = false;
            this.field_kb = param4 ? true : false;
            this.field_gb = param1;
            this.field_hb = param3 ? true : false;
            this.field_eb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_eb.field_C = true;
            this.a(false, this.field_eb);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void t(int param0) {
        if (this.field_E) {
          if (param0 == 20252) {
            this.field_E = false;
            if (!this.field_hb) {
              if (!this.field_kb) {
                return;
              } else {
                ja.c(1);
                return;
              }
            } else {
              hh.a((byte) 111);
              return;
            }
          } else {
            this.field_eb = (dg) null;
            this.field_E = false;
            if (!this.field_hb) {
              if (!this.field_kb) {
                return;
              } else {
                ja.c(1);
                return;
              }
            } else {
              hh.a((byte) 111);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean s(int param0) {
        if (param0 <= 22) {
            field_fb = (int[]) null;
            return ge.field_D;
        }
        return ge.field_D;
    }

    final void r(int param0) {
        this.field_eb.a(4210752, 2121792, (byte) -33);
        int var3 = -36 % ((-22 - param0) / 60);
        lc var2 = new lc((jj) (this), this.field_gb, gf.field_a);
        var2.a(-17040, sg.field_e, 15);
        this.b(var2, -78);
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
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
            if (-14 == (param3 ^ -1)) {
              this.t(20252);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = -113 / ((param0 - 17) / 51);
              stackIn_5_0 = super.a((byte) -104, param1, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jj.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    public static void e(byte param0) {
        field_fb = null;
        if (param0 < 98) {
            jj.e((byte) 9);
        }
    }

    static {
        field_fb = null;
    }
}
