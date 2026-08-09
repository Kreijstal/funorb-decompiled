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
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 >= 63) {
              if (super.a(param0, param1, param2, 113)) {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.field_gb != null) {
                  L1: {
                    if (98 == param0) {
                      this.field_gb.a(false, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (param0 == 99) {
                      this.field_gb.a(false, param2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("jf.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
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
        int var3;
        vg var4;
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
        if (oe.field_c == this.field_ob) {
          return;
        } else {
          this.field_pb = 0;
          this.field_ob = kh.field_h;
          this.a((byte) -52, this.field_hb);
          if (param0 != -24626) {
            this.k(-41);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jf.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 7552) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                jf.a((CharSequence) null, 52);
                break L1;
              }
            }
            stackIn_3_0 = fc.a(true, -44, param0, 10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jf.AA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
