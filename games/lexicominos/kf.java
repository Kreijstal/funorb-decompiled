/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends w {
    boolean field_D;
    private boolean field_B;
    static be field_y;
    static db[] field_A;
    private boolean field_x;
    boolean field_C;
    static dg field_z;

    boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_D) {
                break L1;
              } else {
                if (!this.field_x) {
                  break L1;
                } else {
                  L2: {
                    param1.c((byte) -122);
                    if (param0 == 44) {
                      break L2;
                    } else {
                      this.field_x = true;
                      break L2;
                    }
                  }
                  L3: {
                    this.field_B = true;
                    if (null == this.field_r) {
                      break L3;
                    } else {
                      if (!(this.field_r instanceof ml)) {
                        break L3;
                      } else {
                        ((ml) ((Object) this.field_r)).a(false, this.field_B, (w) (this));
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("kf.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    kf(String param0, vd param1) {
        this(param0, nb.field_z.field_f, param1);
    }

    boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -4808) {
                break L1;
              } else {
                this.field_B = false;
                break L1;
              }
            }
            if (!this.field_D) {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.a(param3, param6, param5, param4, (byte) -93)) {
                L2: {
                  this.a((byte) 44, param2);
                  this.field_h = param1;
                  if (this.field_r == null) {
                    break L2;
                  } else {
                    if (!(this.field_r instanceof j)) {
                      break L2;
                    } else {
                      ((j) ((Object) this.field_r)).a(param3, param1, param6, (byte) -14, param5, param4, (kf) (this));
                      break L2;
                    }
                  }
                }
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("kf.VA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (this.field_r == null) {
            break L0;
          } else {
            if (this.field_r instanceof jk) {
              ((jk) ((Object) this.field_r)).a(param2, param1, 215535458, param3, (kf) (this));
              break L0;
            } else {
              if (param0 == -23287) {
                return;
              } else {
                this.field_B = true;
                return;
              }
            }
          }
        }
        if (param0 != -23287) {
          this.field_B = true;
          return;
        } else {
          return;
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (this.field_h != 0 && this.field_h != ul.field_o) {
                if (this.a(sh.field_e, bk.field_b, param3, param2, (byte) -115)) {
                    if (!(-1 != (ul.field_o ^ -1))) {
                        this.a(-23287, -param2 + sh.field_e, this.field_h, bk.field_b + -param3);
                    }
                }
                this.a(param1, bk.field_b, param2, 0, param3, sh.field_e);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kf.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_A = null;
        field_y = null;
        if (param0 != -85) {
            field_y = (be) null;
        }
    }

    final static boolean d(boolean param0) {
        pd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        pd var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (pd) ((Object) al.field_C.a(param0));
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              L1: while (true) {
                if (var1.field_p <= var2) {
                  stackIn_18_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (var4.field_k[var2] != null) {
                      if (var4.field_k[var2].field_b != 0) {
                        break L2;
                      } else {
                        stackIn_10_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_i[var2] == null) {
                      break L3;
                    } else {
                      if (var4.field_i[var2].field_b == 0) {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "kf.HA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            if (this.field_r != null) {
                if (!(!(this.field_r instanceof j))) {
                    ((j) ((Object) this.field_r)).a(-121, param4, param5, param2, param1, (kf) (this));
                }
            }
            this.field_h = param3;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kf.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 18337) {
            return false;
        }
        return this.field_B;
    }

    final static void f(int param0) {
        nb.field_z = hh.a((byte) 115);
        ug.field_A = new eg();
        if (param0 != 1) {
          kf.h(-103);
          jd.a(true, true, 37);
          return;
        } else {
          jd.a(true, true, 37);
          return;
        }
    }

    final static int g(int param0) {
        if (param0 != 0) {
            kf.f(-4);
            return uk.field_V;
        }
        return uk.field_V;
    }

    final static void h(int param0) {
        if (param0 != -1) {
            return;
        }
        og.field_c = ig.field_a.c(false);
        CharSequence var2 = (CharSequence) ((Object) og.field_c);
        cb.field_t = ck.a(var2, (byte) -48);
    }

    kf(String param0, rd param1, vd param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_B = false;
        this.field_x = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        w var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -15992) {
                break L1;
              } else {
                var6 = (w) null;
                this.a((byte) 35, (w) null, 75, 35);
                break L1;
              }
            }
            L2: {
              if (this.a(7373, param2, param1, param0)) {
                L3: {
                  this.a(param2, 0, param0, param1);
                  if (!this.field_C) {
                    break L3;
                  } else {
                    discarded$2 = param2.append(" active");
                    break L3;
                  }
                }
                if (this.field_D) {
                  break L2;
                } else {
                  discarded$3 = param2.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackIn_9_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("kf.TA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static int a(byte param0, int param1) {
        int var2 = -35 / ((-87 - param0) / 36);
        int var3 = 0;
        if (-1 != (param1 & 7 ^ -1)) {
            var3 = -(7 & param1) + 8;
        }
        int var4 = param1 + var3;
        return var4;
    }

    protected kf() {
        this.field_D = true;
        this.field_B = false;
        this.field_x = true;
        this.field_i = nb.field_z.field_j;
    }

    final void c(byte param0) {
        w var3;
        if (this.field_B) {
          this.field_B = false;
          if (null != this.field_r) {
            if (!(this.field_r instanceof ml)) {
              if (param0 > -35) {
                var3 = (w) null;
                this.a(-41, -60, (w) null, 127, 58, -109, 47);
                return;
              } else {
                return;
              }
            } else {
              ((ml) ((Object) this.field_r)).a(false, this.field_B, (w) (this));
              if (param0 > -35) {
                var3 = (w) null;
                this.a(-41, -60, (w) null, 127, 58, -109, 47);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 > -35) {
              var3 = (w) null;
              this.a(-41, -60, (w) null, 127, 58, -109, 47);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 <= -35) {
            return;
          } else {
            var3 = (w) null;
            this.a(-41, -60, (w) null, 127, 58, -109, 47);
            return;
          }
        }
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = -98 / ((-13 - param3) / 55);
              if (!this.a(18337)) {
                break L1;
              } else {
                L2: {
                  if (-85 == (param1 ^ -1)) {
                    break L2;
                  } else {
                    if (param1 != 83) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(-23287, -1, 1, -1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("kf.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    static {
        field_z = new dg();
    }
}
