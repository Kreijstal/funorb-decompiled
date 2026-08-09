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
        this.a(true, param2, param4, param3, param6);
        this.a(param0, -90, param1);
        if (param5 != 15114) {
            field_Hb = -18;
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (vb.field_j <= var1_int) {
                L2: {
                  vb.field_j = 0;
                  if (param0 >= 84) {
                    break L2;
                  } else {
                    vu.a(12);
                    break L2;
                  }
                }
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
          throw nb.a((Throwable) ((Object) var1), "vu.D(" + param0 + ')');
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Bb = new hd(0L, param2);
                this.field_Bb.field_N = param4;
                this.a((byte) -112, this.field_Bb);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_yb = new hd(0L, param3, param5);
                this.a((byte) -104, this.field_yb);
                this.b(false);
                break L2;
              } else {
                this.b(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("vu.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        L0: {
          var4 = -param0;
          if (this.field_Bb == null) {
            break L0;
          } else {
            var4 = this.field_Bb.g((byte) -74);
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
          if (null != this.field_yb) {
            var5 = this.field_yb.a(this.field_q - param2 + -var4 - (param0 + param2), 0);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var6 = param2 + (var4 - (-param0 + -var5)) + param2;
          if (var6 <= this.field_q) {
            break L3;
          } else {
            var5 = var5 + (-var6 + this.field_q);
            var6 = this.field_q;
            break L3;
          }
        }
        L4: {
          if (-2 == (this.field_A ^ -1)) {
            param2 = param2 + (-var6 + this.field_q) / 2;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (2 == this.field_A) {
            param2 = param2 + (this.field_q + -var6);
            break L5;
          } else {
            break L5;
          }
        }
        if (this.field_Bb != null) {
          this.field_Bb.a(true, var4, param2, 0, this.field_mb);
          this.field_Bb.field_p = this.field_p;
          if (null != this.field_yb) {
            this.field_yb.a(true, var5, param0 + var4 + param2, 0, this.field_mb);
            this.field_yb.field_p = this.field_p;
            if (this.field_Bb == null) {
              this.field_yb.field_A = this.field_A;
              return;
            } else {
              this.field_yb.field_A = 0;
              return;
            }
          } else {
            return;
          }
        } else {
          L6: {
            if (null != this.field_yb) {
              this.field_yb.a(true, var5, param0 + var4 + param2, 0, this.field_mb);
              this.field_yb.field_p = this.field_p;
              if (this.field_Bb != null) {
                this.field_yb.field_A = 0;
                break L6;
              } else {
                this.field_yb.field_A = this.field_A;
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
        int var4;
        int var5;
        if (param1 != 0) {
          L0: {
            this.a(-30, -44, -56, 15, -21, -62, 40);
            var4 = -param0;
            if (null != this.field_Bb) {
              var4 = this.field_Bb.g((byte) -92);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = -param0;
            if (this.field_yb != null) {
              var5 = this.field_yb.g((byte) -23);
              break L1;
            } else {
              break L1;
            }
          }
          return param2 + param0 + (param2 - -var4 + var5);
        } else {
          L2: {
            var4 = -param0;
            if (null != this.field_Bb) {
              var4 = this.field_Bb.g((byte) -92);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var5 = -param0;
            if (this.field_yb != null) {
              var5 = this.field_yb.g((byte) -23);
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
        field_zb = new int[128];
        field_Ab = 3;
        field_Fb = 0;
        field_Gb = "This kit is unlocked by a <col=ffff55>Hidden Achievement</col>.<br>";
        field_Hb = 2;
    }
}
