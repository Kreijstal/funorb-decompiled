/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jf extends ca {
    private vg field_hb;
    private int field_lb;
    static String field_fb;
    private int field_jb;
    private int field_mb;
    private cd field_ob;
    private dl field_gb;
    static Random field_nb;
    private int field_pb;
    private int field_qb;
    static int[] field_ib;
    static String field_kb;

    boolean a(int param0, char param1, vg param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param3 >= 63) {
              if (super.a(param0, param1, param2, 113)) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.field_gb != null) {
                  L1: {
                    if (98 == param0) {
                      discarded$4 = this.field_gb.a(false, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (param0 == 99) {
                      discarded$5 = this.field_gb.a(false, param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("jf.BA(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    private final void a(byte param0, vg param1) {
        try {
            if (this.field_gb != null) {
                this.field_gb.a(param0 ^ 16157);
            }
            if (param0 != -52) {
                field_nb = (Random) null;
            }
            if (param1 != null) {
                param1.a(6 - -this.field_jb, param1.field_k, 6, 16535, param1.field_w);
                this.field_gb = new dl(param1);
            } else {
                this.field_gb = new dl();
            }
            this.b(this.field_gb, (byte) 104);
            this.field_hb = null;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "jf.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jf(k param0, vg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_w, param1.field_k + param2 + 12);
        try {
            this.field_mb = param4;
            this.field_jb = param2;
            this.field_qb = param3;
            this.field_lb = param3;
            this.a((byte) -52, param1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void h(byte param0) {
        field_kb = null;
        if (param0 < 90) {
            return;
        }
        field_nb = null;
        field_fb = null;
        field_ib = null;
    }

    boolean k(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        vg var4 = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (null == this.field_ob) {
          if (param0 != 2968) {
            var4 = (vg) null;
            this.a((byte) -80, (vg) null);
            return super.k(2968);
          } else {
            return super.k(2968);
          }
        } else {
          if (this.field_ob == oe.field_c) {
            fieldTemp$2 = this.field_pb + 1;
            this.field_pb = this.field_pb + 1;
            if (this.field_lb != fieldTemp$2) {
              this.field_gb.field_K = 256 - (this.field_pb << 2026743272) / this.field_lb;
              if (param0 != 2968) {
                var4 = (vg) null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              } else {
                return super.k(2968);
              }
            } else {
              this.field_ob = ni.field_s;
              this.a(this.field_mb, this.field_hb.field_k + (12 + this.field_jb), this.field_hb.field_w + 12, (byte) 104);
              this.field_pb = 0;
              this.field_gb.field_K = 0;
              if (param0 != 2968) {
                var4 = (vg) null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              } else {
                return super.k(2968);
              }
            }
          } else {
            if (this.field_ob == kh.field_h) {
              fieldTemp$3 = this.field_pb + 1;
              this.field_pb = this.field_pb + 1;
              if (fieldTemp$3 == this.field_qb) {
                this.field_ob = null;
                this.field_gb.field_K = 256;
                if (param0 != 2968) {
                  var4 = (vg) null;
                  this.a((byte) -80, (vg) null);
                  return super.k(2968);
                } else {
                  return super.k(2968);
                }
              } else {
                this.field_gb.field_K = (this.field_pb << 459970472) / this.field_qb;
                if (param0 == 2968) {
                  return super.k(2968);
                } else {
                  var4 = (vg) null;
                  this.a((byte) -80, (vg) null);
                  return super.k(2968);
                }
              }
            } else {
              if (param0 == 2968) {
                return super.k(2968);
              } else {
                var4 = (vg) null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              }
            }
          }
        }
    }

    final void g(byte param0) {
        if (param0 >= -111) {
          return;
        } else {
          L0: {
            if (this.field_ob == null) {
              break L0;
            } else {
              L1: {
                if (this.field_ob != kh.field_h) {
                  this.b(this.field_hb.field_w + 12, 1688990433, this.field_hb.field_k + (12 + this.field_jb));
                  this.a((byte) -52, this.field_hb);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_gb.field_K = 256;
              this.field_ob = null;
              break L0;
            }
          }
          super.g((byte) -118);
          return;
        }
    }

    final void l(int param0) {
        boolean discarded$2 = false;
        if (oe.field_c == this.field_ob) {
          return;
        } else {
          this.field_pb = 0;
          this.field_ob = kh.field_h;
          this.a((byte) -52, this.field_hb);
          if (param0 != -24626) {
            discarded$2 = this.k(-41);
            this.field_gb.field_K = 0;
            this.field_hb = null;
            return;
          } else {
            this.field_gb.field_K = 0;
            this.field_hb = null;
            return;
          }
        }
    }

    final boolean j(int param0) {
        this.g((byte) -120);
        if (param0 != 0) {
            return true;
        }
        return super.j(0);
    }

    void a(int param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              this.field_hb = param1;
              if (this.field_ob == ni.field_s) {
                this.a(this.field_mb, 12 + this.field_jb + this.field_hb.field_k, 12 + this.field_hb.field_w, (byte) 66);
                this.field_pb = 0;
                break L1;
              } else {
                if (oe.field_c != this.field_ob) {
                  this.field_ob = oe.field_c;
                  this.field_pb = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == 33) {
              break L0;
            } else {
              this.field_jb = -14;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("jf.Q(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 7552) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                discarded$2 = jf.a((CharSequence) null, 52);
                break L1;
              }
            }
            stackOut_2_0 = fc.a(true, -44, param0, 10);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("jf.AA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_fb = "Reload game";
        field_nb = new Random();
        field_kb = "Please enter your age in years";
        field_ib = new int[75];
    }
}
