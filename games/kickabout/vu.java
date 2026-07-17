/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu extends hd {
    private hd field_Bb;
    static sj field_Eb;
    static int[] field_zb;
    static int field_Ab;
    static volatile int field_Fb;
    static int field_Cb;
    static boolean field_Db;
    static tk field_Ib;
    hd field_yb;
    static String field_Gb;
    static int field_Hb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((vu) this).a(true, param2, param4, param3, param6);
        this.a(param0, -90, param1);
        if (param5 != 15114) {
            field_Hb = -18;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (vb.field_j <= var1_int) {
                vb.field_j = 0;
                break L0;
              } else {
                fu.field_b[var1_int] = null;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "vu.D(" + 122 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != -15410) {
          vu.a(-117);
          field_Eb = null;
          field_zb = null;
          field_Gb = null;
          field_Ib = null;
          return;
        } else {
          field_Eb = null;
          field_zb = null;
          field_Gb = null;
          field_Ib = null;
          return;
        }
    }

    vu(long param0, hd param1, hd param2, hd param3, ut param4, String param5) {
        super(param0, param1);
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                ((vu) this).field_Bb = new hd(0L, param2);
                ((vu) this).field_Bb.field_N = param4;
                ((vu) this).a((byte) -112, ((vu) this).field_Bb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                ((vu) this).field_yb = new hd(0L, param3, param5);
                ((vu) this).a((byte) -104, ((vu) this).field_yb);
                ((vu) this).b(false);
                break L2;
              } else {
                ((vu) this).b(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var8;
            stackOut_7_1 = new StringBuilder().append("vu.<init>(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param0;
          if (((vu) this).field_Bb == null) {
            break L0;
          } else {
            var4 = ((vu) this).field_Bb.g((byte) -74);
            break L0;
          }
        }
        L1: {
          if (param1 <= -61) {
            break L1;
          } else {
            vu.a(-96);
            break L1;
          }
        }
        L2: {
          var5 = -param0;
          if (null != ((vu) this).field_yb) {
            var5 = ((vu) this).field_yb.a(((vu) this).field_q - param2 + -var4 - (param0 + param2), 0);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var6 = param2 + (var4 - (-param0 + -var5)) + param2;
          if (var6 <= ((vu) this).field_q) {
            break L3;
          } else {
            var5 = var5 + (-var6 + ((vu) this).field_q);
            var6 = ((vu) this).field_q;
            break L3;
          }
        }
        L4: {
          if (((vu) this).field_A == 1) {
            param2 = param2 + (-var6 + ((vu) this).field_q) / 2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (2 == ((vu) this).field_A) {
            param2 = param2 + (((vu) this).field_q + -var6);
            break L5;
          } else {
            break L5;
          }
        }
        if (((vu) this).field_Bb != null) {
          ((vu) this).field_Bb.a(true, var4, param2, 0, ((vu) this).field_mb);
          ((vu) this).field_Bb.field_p = ((vu) this).field_p;
          if (null != ((vu) this).field_yb) {
            ((vu) this).field_yb.a(true, var5, param0 + var4 + param2, 0, ((vu) this).field_mb);
            ((vu) this).field_yb.field_p = ((vu) this).field_p;
            if (((vu) this).field_Bb == null) {
              ((vu) this).field_yb.field_A = ((vu) this).field_A;
              return;
            } else {
              ((vu) this).field_yb.field_A = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          L6: {
            if (null != ((vu) this).field_yb) {
              ((vu) this).field_yb.a(true, var5, param0 + var4 + param2, 0, ((vu) this).field_mb);
              ((vu) this).field_yb.field_p = ((vu) this).field_p;
              if (((vu) this).field_Bb != null) {
                ((vu) this).field_yb.field_A = 0;
                break L6;
              } else {
                ((vu) this).field_yb.field_A = ((vu) this).field_A;
                break L6;
              }
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param1 != 0) {
          L0: {
            ((vu) this).a(-30, -44, -56, 15, -21, -62, 40);
            var4 = -param0;
            if (null != ((vu) this).field_Bb) {
              var4 = ((vu) this).field_Bb.g((byte) -92);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = -param0;
            if (((vu) this).field_yb != null) {
              var5 = ((vu) this).field_yb.g((byte) -23);
              break L1;
            } else {
              break L1;
            }
          }
          return param2 + param0 + (param2 - -var4 + var5);
        } else {
          L2: {
            var4 = -param0;
            if (null != ((vu) this).field_Bb) {
              var4 = ((vu) this).field_Bb.g((byte) -92);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var5 = -param0;
            if (((vu) this).field_yb != null) {
              var5 = ((vu) this).field_yb.g((byte) -23);
              break L3;
            } else {
              break L3;
            }
          }
          return param2 + param0 + (param2 - -var4 + var5);
        }
    }

    final static void a(boolean param0, boolean param1) {
        L0: {
          if (null != sn.field_e) {
            ar.a(15707, sn.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          L1: {
            field_Db = true;
            if (wi.field_v != null) {
              wi.field_v.a(param1, false);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            nj.a(param1, -128);
            if (null != ck.field_b) {
              ck.field_b.a(104, param1);
              break L2;
            } else {
              break L2;
            }
          }
          fb.a(30521, param1);
          return;
        } else {
          L3: {
            if (wi.field_v != null) {
              wi.field_v.a(param1, false);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            nj.a(param1, -128);
            if (null != ck.field_b) {
              ck.field_b.a(104, param1);
              break L4;
            } else {
              break L4;
            }
          }
          fb.a(30521, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = new int[128];
        field_Ab = 3;
        field_Fb = 0;
        field_Gb = "This kit is unlocked by a <col=ffff55>Hidden Achievement</col>.<br>";
        field_Hb = 2;
    }
}
