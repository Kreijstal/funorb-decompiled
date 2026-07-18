/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
            if (param2) {
              break L0;
            } else {
              ma.n(30);
              break L0;
            }
          }
          if (!((ma) this).field_Bb) {
            ff.a(-27, "tochangedisplayname.ws", nb.a(71));
            return;
          } else {
            sf.a(3, 11649);
            ((ma) this).d(true);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ma.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
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
        Object var6 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != 13) {
              L1: {
                if (param3 >= 63) {
                  break L1;
                } else {
                  var6 = null;
                  ((ma) this).a(-120, (String) null, 15);
                  break L1;
                }
              }
              stackOut_5_0 = super.a(param0, param1, param2, 110);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              ((ma) this).d(true);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ma.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException var4 = null;
        dj var4_ref = null;
        int var5 = 0;
        dj var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        dj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        dj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        dj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        dj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        dj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        dj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (((ma) this).field_xb) {
              return;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0 != 256) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              L2: {
                ((ma) this).field_Bb = stackIn_7_1 != 0;
                ((ma) this).field_xb = true;
                ((ma) this).field_Ab.a(false, 8405024, 4210752);
                var6 = new dj((ma) this, ((ma) this).field_zb, param1);
                var4_ref = var6;
                if (param0 == 5) {
                  var6.a(false, jf.field_fb, 11);
                  var6.a(false, qk.field_d, 17);
                  break L2;
                } else {
                  if (256 != param0) {
                    L3: {
                      stackOut_10_0 = (dj) var6;
                      stackOut_10_1 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (!((ma) this).field_rb) {
                        stackOut_12_0 = (dj) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = f.field_m;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L3;
                      } else {
                        stackOut_11_0 = (dj) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = DrPhlogistonSavesTheEarth.field_E;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L3;
                      }
                    }
                    ((dj) (Object) stackIn_13_0).a(stackIn_13_1 != 0, stackIn_13_2, -1);
                    break L2;
                  } else {
                    hf discarded$2 = var6.a(DrPhlogistonSavesTheEarth.field_E, false, (fd) this);
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
                        hf discarded$3 = var6.a(eg.field_g, false, (fd) this);
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
              ((ma) this).a(33, (vg) (Object) var6);
              if (param2 == -5485) {
                break L0;
              } else {
                ((ma) this).d(true);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("ma.H(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
        }
    }

    final void c(boolean param0) {
        ((ma) this).field_Ab.a(false, 2121792, 4210752);
        dj var2 = new dj((ma) this, ((ma) this).field_zb, lk.field_n);
        var2.a(param0, fe.field_b, 15);
        ((ma) this).a(33, (vg) (Object) var2);
    }

    ma(k param0, rf param1, String param2, boolean param3, boolean param4) {
        super(param0, (vg) (Object) new dj((ma) null, param1, param2), 77, 10, 10);
        try {
            ((ma) this).field_ub = param4 ? true : false;
            ((ma) this).field_zb = param1;
            ((ma) this).field_Bb = false;
            ((ma) this).field_xb = false;
            ((ma) this).field_rb = param3 ? true : false;
            ((ma) this).field_Ab = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ma) this).field_Ab.field_E = true;
            ((ma) this).b((vg) (Object) ((ma) this).field_Ab, (byte) 58);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(boolean param0) {
        if (((ma) this).field_Q) {
          ((ma) this).field_Q = false;
          if (((ma) this).field_rb) {
            ck.d(121);
            if (param0) {
              return;
            } else {
              ((ma) this).field_rb = true;
              return;
            }
          } else {
            if (!((ma) this).field_ub) {
              if (!param0) {
                ((ma) this).field_rb = true;
                return;
              } else {
                return;
              }
            } else {
              hg.e((byte) 47);
              if (param0) {
                return;
              } else {
                ((ma) this).field_rb = true;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = new byte[520];
        field_tb = new ql(1);
        field_vb = 20000000L;
    }
}
