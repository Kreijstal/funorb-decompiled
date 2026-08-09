/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ma extends jf implements ke {
    static ql field_tb;
    private boolean field_xb;
    private rf field_zb;
    static byte[] field_yb;
    private boolean field_rb;
    private boolean field_ub;
    private hd field_Ab;
    static int field_wb;
    private boolean field_Bb;
    static int field_sb;
    static long field_vb;

    public void a(int param0, int param1, boolean param2, hf param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2) {
              break L0;
            } else {
              ma.n(30);
              break L0;
            }
          }
          if (!this.field_Bb) {
            ff.a(-27, "tochangedisplayname.ws", nb.a(71));
            return;
          } else {
            sf.a(3, 11649);
            this.d(true);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ma.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    public static void n(int param0) {
        field_tb = null;
        if (param0 != 19678) {
            field_vb = -97L;
            field_yb = null;
            return;
        }
        field_yb = null;
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
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
            if (-14 != (param0 ^ -1)) {
              L1: {
                if (param3 >= 63) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.a(-120, (String) null, 15);
                  break L1;
                }
              }
              stackIn_6_0 = super.a(param0, param1, param2, 110);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.d(true);
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

            stackIn_9_1 = new StringBuilder().append("ma.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0, String param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        dj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        dj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        dj var6 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (this.field_xb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if ((param0 ^ -1) != -257) {
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
                ((ma) (this)).field_Bb = stackIn_7_1 != 0;
                this.field_xb = true;
                this.field_Ab.a(false, 8405024, 4210752);
                var6 = new dj((ma) (this), this.field_zb, param1);
                var4 = var6;
                if (param0 == 5) {
                  var6.a(false, jf.field_fb, 11);
                  var6.a(false, qk.field_d, 17);
                  break L2;
                } else {
                  if (256 != param0) {
                    L3: {
                      stackIn_12_0 = (dj) (var6);

                      stackIn_12_1 = 0;

                      if (!this.field_rb) {
                        stackIn_13_0 = (dj) ((Object) stackIn_12_0);
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = f.field_m;
                        break L3;
                      } else {
                        stackIn_13_0 = (dj) ((Object) stackIn_12_0);
                        stackIn_13_1 = stackIn_12_1;
                        stackIn_13_2 = DrPhlogistonSavesTheEarth.field_E;
                        break L3;
                      }
                    }
                    ((dj) (Object) stackIn_13_0).a(stackIn_13_1 != 0, stackIn_13_2, -1);
                    break L2;
                  } else {
                    var6.a(DrPhlogistonSavesTheEarth.field_E, false, (fd) (this));
                    break L2;
                  }
                }
              }
              L4: {
                if (3 == param0) {
                  var6.a(false, nl.field_o, 7);
                  break L4;
                } else {
                  if (param0 != 4) {
                    if (param0 == 6) {
                      var6.a(false, bb.field_d, 9);
                      break L4;
                    } else {
                      if (9 == param0) {
                        var6.a(eg.field_g, false, (fd) (this));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    var6.a(false, ge.field_g, 8);
                    break L4;
                  }
                }
              }
              this.a(33, var6);
              if (param2 == -5485) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.d(true);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("ma.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(boolean param0) {
        this.field_Ab.a(false, 2121792, 4210752);
        dj var2 = new dj((ma) (this), this.field_zb, lk.field_n);
        var2.a(param0, fe.field_b, 15);
        this.a(33, var2);
    }

    ma(k param0, rf param1, String param2, boolean param3, boolean param4) {
        super(param0, new dj((ma) null, param1, param2), 77, 10, 10);
        try {
            this.field_ub = param4 ? true : false;
            this.field_zb = param1;
            this.field_Bb = false;
            this.field_xb = false;
            this.field_rb = param3 ? true : false;
            this.field_Ab = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Ab.field_E = true;
            this.b(this.field_Ab, (byte) 58);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(boolean param0) {
        if (this.field_Q) {
          this.field_Q = false;
          if (this.field_rb) {
            ck.d(121);
            if (param0) {
              return;
            } else {
              this.field_rb = true;
              return;
            }
          } else {
            if (!this.field_ub) {
              if (!param0) {
                this.field_rb = true;
                return;
              } else {
                return;
              }
            } else {
              hg.e((byte) 47);
              if (param0) {
                return;
              } else {
                this.field_rb = true;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        field_yb = new byte[520];
        field_tb = new ql(1);
        field_vb = 20000000L;
    }
}
