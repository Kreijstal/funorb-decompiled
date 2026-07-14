/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb extends pn implements Cloneable {
    static ko field_p;
    int field_v;
    int field_u;
    static int field_w;
    transient boolean field_t;
    static String field_r;
    static am field_n;
    private transient int field_s;
    static String field_q;
    static int field_m;
    int field_o;

    final f a(int param0, f[][] param1, boolean param2, int param3) {
        ((cb) this).field_t = param2 ? true : false;
        return (f) this;
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        Object var6 = null;
        if (param1 != 0) {
          var6 = null;
          boolean discarded$2 = ((cb) this).a((byte) 80, (f[][]) null, -107, 58, -4, (fq) null, -78);
          ((cb) this).field_s = (((cb) this).field_s + 1) % 48;
          return;
        } else {
          ((cb) this).field_s = (((cb) this).field_s + 1) % 48;
          return;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -53;
        }
        return ((cb) this).field_l.a(true, param1);
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        wg.field_P = true;
        var2 = "tuhstatbut";
        if (param0 != 1148) {
          cb.e((byte) -125);
          var3 = "rvnadlm";
          var4 = -1L;
          ab.a(param1, var4, var2, param0 + -1026, var3);
          return;
        } else {
          var3 = "rvnadlm";
          var4 = -1L;
          ab.a(param1, var4, var2, param0 + -1026, var3);
          return;
        }
    }

    final void a(int param0, int param1) {
        ((cb) this).field_o = param0;
        if (param1 <= 61) {
            ((cb) this).field_o = 46;
        }
    }

    final nj a(int param0, nj param1) {
        Object var4 = null;
        if (param0 != 23525) {
          var4 = null;
          boolean discarded$2 = ((cb) this).a(true, (f[][]) null, (mj) null);
          return ng.a(f.field_f, param1, (f) (Object) new cb((f) (Object) new kp(-1), 0, 0), (byte) -83, jh.field_d);
        } else {
          return ng.a(f.field_f, param1, (f) (Object) new cb((f) (Object) new kp(-1), 0, 0), (byte) -83, jh.field_d);
        }
    }

    final static void e(byte param0) {
        rc.a(-25537, 17);
        if (param0 != 125) {
            field_r = null;
        }
    }

    final boolean b(byte param0) {
        if (param0 <= 43) {
            field_r = null;
            return ((cb) this).field_l.b((byte) 126);
        }
        return ((cb) this).field_l.b((byte) 126);
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            return true;
        }
        return !((cb) this).field_t ? ((cb) this).field_l.e(-4128) : false;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        dl[] stackIn_2_0 = null;
        dl[] stackIn_3_0 = null;
        dl[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ef stackIn_9_0 = null;
        ef stackIn_10_0 = null;
        ef stackIn_11_0 = null;
        String stackIn_11_1 = null;
        dl[] stackIn_15_0 = null;
        dl[] stackIn_16_0 = null;
        dl[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ef stackIn_20_0 = null;
        ef stackIn_21_0 = null;
        ef stackIn_22_0 = null;
        String stackIn_22_1 = null;
        dl[] stackIn_25_0 = null;
        dl[] stackIn_26_0 = null;
        dl[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ef stackIn_30_0 = null;
        ef stackIn_31_0 = null;
        ef stackIn_32_0 = null;
        String stackIn_32_1 = null;
        dl[] stackOut_24_0 = null;
        dl[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        dl[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        ef stackOut_29_0 = null;
        ef stackOut_31_0 = null;
        String stackOut_31_1 = null;
        ef stackOut_30_0 = null;
        String stackOut_30_1 = null;
        dl[] stackOut_14_0 = null;
        dl[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        dl[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ef stackOut_19_0 = null;
        ef stackOut_21_0 = null;
        String stackOut_21_1 = null;
        ef stackOut_20_0 = null;
        String stackOut_20_1 = null;
        dl[] stackOut_1_0 = null;
        dl[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        dl[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ef stackOut_8_0 = null;
        ef stackOut_10_0 = null;
        String stackOut_10_1 = null;
        ef stackOut_9_0 = null;
        String stackOut_9_1 = null;
        if (param1 == 24) {
          if ((param2 ^ -1) != -25) {
            L0: {
              stackOut_24_0 = ec.field_j;
              stackIn_26_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (param3) {
                stackOut_26_0 = (dl[]) (Object) stackIn_26_0;
                stackOut_26_1 = 0;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                break L0;
              } else {
                stackOut_25_0 = (dl[]) (Object) stackIn_25_0;
                stackOut_25_1 = ((cb) this).field_s >> -2025530142;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                break L0;
              }
            }
            L1: {
              ((dl) (Object) stackIn_27_0[stackIn_27_1]).a(param4, param5, 2 * param1, 2 * param2, 128);
              var7 = -115 % ((param0 - 74) / 41);
              if (param3) {
                L2: {
                  stackOut_29_0 = an.field_q;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (((cb) this).field_o != 0) {
                    stackOut_31_0 = (ef) (Object) stackIn_31_0;
                    stackOut_31_1 = Integer.toString(((cb) this).field_o);
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    break L2;
                  } else {
                    stackOut_30_0 = (ef) (Object) stackIn_30_0;
                    stackOut_30_1 = "U";
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    break L2;
                  }
                }
                ((ef) (Object) stackIn_32_0).c(stackIn_32_1, param1 + param4, 6 + (param5 - -(param2 / 2)), 16760896, -1);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L3: {
              stackOut_14_0 = ec.field_j;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param3) {
                stackOut_16_0 = (dl[]) (Object) stackIn_16_0;
                stackOut_16_1 = ((cb) this).field_s >> 996201186;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L3;
              } else {
                stackOut_15_0 = (dl[]) (Object) stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L3;
              }
            }
            L4: {
              ((dl) (Object) stackIn_17_0[stackIn_17_1]).d(param4, param5, 128);
              var7 = -115 % ((param0 - 74) / 41);
              if (param3) {
                L5: {
                  stackOut_19_0 = an.field_q;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (((cb) this).field_o != 0) {
                    stackOut_21_0 = (ef) (Object) stackIn_21_0;
                    stackOut_21_1 = Integer.toString(((cb) this).field_o);
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L5;
                  } else {
                    stackOut_20_0 = (ef) (Object) stackIn_20_0;
                    stackOut_20_1 = "U";
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L5;
                  }
                }
                ((ef) (Object) stackIn_22_0).c(stackIn_22_1, param1 + param4, 6 + (param5 - -(param2 / 2)), 16760896, -1);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          L6: {
            stackOut_1_0 = ec.field_j;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (param3) {
              stackOut_3_0 = (dl[]) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L6;
            } else {
              stackOut_2_0 = (dl[]) (Object) stackIn_2_0;
              stackOut_2_1 = ((cb) this).field_s >> -2025530142;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L6;
            }
          }
          ((dl) (Object) stackIn_4_0[stackIn_4_1]).a(param4, param5, 2 * param1, 2 * param2, 128);
          L7: {
            var7 = -115 % ((param0 - 74) / 41);
            if (param3) {
              L8: {
                stackOut_8_0 = an.field_q;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (((cb) this).field_o != 0) {
                  stackOut_10_0 = (ef) (Object) stackIn_10_0;
                  stackOut_10_1 = Integer.toString(((cb) this).field_o);
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L8;
                } else {
                  stackOut_9_0 = (ef) (Object) stackIn_9_0;
                  stackOut_9_1 = "U";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L8;
                }
              }
              ((ef) (Object) stackIn_11_0).c(stackIn_11_1, param1 + param4, 6 + (param5 - -(param2 / 2)), 16760896, -1);
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
          field_q = null;
          return ((cb) this).field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
        } else {
          return ((cb) this).field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
        }
    }

    cb(f param0, int param1, int param2) {
        super(param0);
        ((cb) this).field_v = 0;
        ((cb) this).field_u = 0;
        ((cb) this).field_t = false;
        ((cb) this).field_o = 0;
        ((cb) this).field_s = ue.a(48, -(param2 * param2) + param1 * param1, 126);
    }

    public static void f(int param0) {
        field_p = null;
        field_r = null;
        field_n = null;
        if (param0 != 996201186) {
            return;
        }
        field_q = null;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
          ((cb) this).c(16, -22, (f[][]) null, 4);
          return ((cb) this).field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
        } else {
          return ((cb) this).field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        Object var5 = null;
        if (param0) {
          var5 = null;
          boolean discarded$2 = ((cb) this).a((byte) -102, (f[][]) null, -49, 42, 122, (fq) null, 48);
          return ((cb) this).field_l.a(false, param1, param2);
        } else {
          return ((cb) this).field_l.a(false, param1, param2);
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        ((cb) this).field_s = ue.a(48, -(param3 * param3) + param2 * param2, 119);
        if (param0 != -35) {
            ((cb) this).field_u = 24;
        }
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        ((cb) this).field_v = param1.readInt();
        ((cb) this).field_u = param1.readInt();
        if (param3 > -69) {
            field_m = 86;
            return;
        }
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        if (param4 == null) {
          return (f) this;
        } else {
          if (param5 != -87) {
            return null;
          } else {
            dd.field_c.a(32, param2 * 12, 12 * param1, 0, (byte) -111);
            return (f) (Object) new ig(param0, param4, (f) this, false);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Can you combine that trick with the trick at the start to break the logs? Think it through first!";
        field_r = "Invalid password.";
    }
}
