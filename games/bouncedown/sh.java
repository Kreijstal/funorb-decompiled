/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sh extends mh implements rc {
    private tj field_bb;
    static int[] field_gb;
    static int field_hb;
    private boolean field_eb;
    private boolean field_ib;
    static bl[] field_cb;
    private boolean field_P;
    static String field_jb;
    private boolean field_fb;
    private ll field_db;

    final void a(String param0, int param1, int param2) {
        wd discarded$2 = null;
        wd discarded$3 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        uc var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        uc stackIn_9_0 = null;
        uc stackIn_10_0 = null;
        uc stackIn_11_0 = null;
        String stackIn_11_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        uc stackOut_8_0 = null;
        uc stackOut_10_0 = null;
        String stackOut_10_1 = null;
        uc stackOut_9_0 = null;
        String stackOut_9_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            if (!this.field_ib) {
              L1: {
                this.field_ib = true;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param2 != 256) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((sh) (this)).field_fb = stackIn_6_1 != 0;
                this.field_db.a(param1, (byte) 127, 8405024);
                var6 = new uc((sh) (this), this.field_bb, param0);
                if (5 == param2) {
                  var6.a(ta.field_e, 11, (byte) 116);
                  var6.a(i.field_g, 17, (byte) 123);
                  break L2;
                } else {
                  if ((param2 ^ -1) == -257) {
                    discarded$2 = var6.a(mh.field_W, (sk) (this), -4);
                    break L2;
                  } else {
                    L3: {
                      stackOut_8_0 = (uc) (var6);
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (this.field_eb) {
                        stackOut_10_0 = (uc) ((Object) stackIn_10_0);
                        stackOut_10_1 = mh.field_W;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L3;
                      } else {
                        stackOut_9_0 = (uc) ((Object) stackIn_9_0);
                        stackOut_9_1 = pe.field_h;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L3;
                      }
                    }
                    ((uc) (Object) stackIn_11_0).a(stackIn_11_1, -1, (byte) 93);
                    break L2;
                  }
                }
              }
              L4: {
                L5: {
                  if (3 != param2) {
                    if ((param2 ^ -1) != -5) {
                      if (-7 == (param2 ^ -1)) {
                        var6.a(da.field_c, 9, (byte) 106);
                        break L5;
                      } else {
                        if (param2 == 9) {
                          discarded$3 = var6.a(fj.field_d, (sk) (this), -4);
                          break L5;
                        } else {
                          this.a(10768, var6);
                          break L4;
                        }
                      }
                    } else {
                      var6.a(ck.field_f, 8, (byte) 97);
                      break L5;
                    }
                  } else {
                    var6.a(oc.field_c, 7, (byte) 60);
                    break L5;
                  }
                }
                this.a(10768, var6);
                break L4;
              }
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
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("sh.W(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    sh(pf param0, tj param1, String param2, boolean param3, boolean param4) {
        super(param0, new uc((sh) null, param1, param2), 77, 10, 10);
        try {
            this.field_ib = false;
            this.field_P = param4 ? true : false;
            this.field_eb = param3 ? true : false;
            this.field_bb = param1;
            this.field_fb = false;
            this.field_db = new ll(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_db.field_C = true;
            this.b(this.field_db, true);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        if (!this.field_D) {
            return;
        }
        this.field_D = false;
        if (this.field_eb) {
            pd.a(11173);
        } else {
            if (this.field_P) {
                od.a((byte) 24);
            }
        }
        if (!param0) {
            this.n(-51);
        }
    }

    public void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 >= 6) {
              L1: {
                if (!this.field_fb) {
                  qc.a(vi.b(0), 24, "tochangedisplayname.ws");
                  break L1;
                } else {
                  oh.a(-52, 3);
                  this.a(true);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("sh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 == 13) {
              this.a(true);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 == -14565) {
                  break L1;
                } else {
                  var6 = (String) null;
                  this.a((String) null, -33, 29);
                  break L1;
                }
              }
              stackOut_6_0 = super.a(param0, param1, param2, -14565);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("sh.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0;
        }
    }

    final void n(int param0) {
        this.field_db.a(4210752, (byte) 127, 2121792);
        uc var2 = new uc((sh) (this), this.field_bb, dh.field_e);
        var2.a(l.field_f, 15, (byte) 120);
        if (param0 != 1) {
            return;
        }
        this.a(10768, var2);
    }

    public static void o(int param0) {
        field_jb = null;
        field_cb = null;
        field_gb = null;
        if (param0 != 5) {
            sh.o(88);
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_gb = new int[256];
            field_jb = "Logging in...";
            var1 = 0;
            L0: while (true) {
              if ((var1 ^ -1) <= -257) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if ((var2 ^ -1) <= -9) {
                    field_gb[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if ((var0 & 1 ^ -1) != -2) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> -601030239 ^ -306674912;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
