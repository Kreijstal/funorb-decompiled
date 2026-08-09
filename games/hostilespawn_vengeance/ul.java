/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ul extends vd {
    static int field_H;
    private int field_I;
    static bd field_G;
    static java.text.DecimalFormat field_E;
    private gg field_K;
    static String field_M;
    static int field_L;
    static bd[] field_J;
    static boolean field_O;
    static gb field_P;
    static boolean field_N;
    boolean field_F;

    ul(gg param0, int param1, int param2) {
        super(-param1 + mm.field_q >> 1577789121, fb.field_f - param2 >> -1873882175, param1, param2, (nn) null);
        try {
            this.field_K = param0;
            this.field_I = 0;
            this.field_F = false;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(int param0, int param1, int param2);

    private final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        if (!param0) {
          L0: {
            this.j(-123);
            if (this.field_F) {
              if (this == this.field_K.k(0)) {
                stackIn_12_0 = 256;
                break L0;
              } else {
                stackIn_12_0 = 0;
                break L0;
              }
            } else {
              stackIn_12_0 = 0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (this.field_F) {
              if (this == this.field_K.k(0)) {
                stackIn_6_0 = 256;
                break L1;
              } else {
                stackIn_6_0 = 0;
                break L1;
              }
            } else {
              stackIn_6_0 = 0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    boolean l(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int var2;
        int var3;
        if (param0 == 65393) {
          var2 = this.a(true);
          var3 = -this.field_I + var2;
          if (var3 > 0) {
            L0: {
              this.field_I = this.field_I + (-1 + var3 + 8) / 8;
              if (0 > var3) {
                this.field_I = this.field_I + (-16 + var3 - -1) / 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                if (-1 != (this.field_I ^ -1)) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (this.field_F) {
                      break L2;
                    } else {
                      stackIn_41_0 = 1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_41_0 = 0;
              break L1;
            }
            return stackIn_41_0 != 0;
          } else {
            L3: {
              if (0 > var3) {
                this.field_I = this.field_I + (-16 + var3 - -1) / 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (-1 != (this.field_I ^ -1)) {
                  break L5;
                } else {
                  if (var2 != 0) {
                    break L5;
                  } else {
                    if (this.field_F) {
                      break L5;
                    } else {
                      stackIn_32_0 = 1;
                      break L4;
                    }
                  }
                }
              }
              stackIn_32_0 = 0;
              break L4;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          field_O = false;
          var2 = this.a(true);
          var3 = -this.field_I + var2;
          if (var3 <= 0) {
            L6: {
              if (0 > var3) {
                this.field_I = this.field_I + (-16 + var3 - -1) / 16;
                break L6;
              } else {
                break L6;
              }
            }
            if (-1 == (this.field_I ^ -1)) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (this.field_F) {
                    stackIn_20_0 = 0;
                    break L7;
                  } else {
                    stackIn_20_0 = 1;
                    break L7;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            L8: {
              this.field_I = this.field_I + (-1 + var3 + 8) / 8;
              if (0 > var3) {
                this.field_I = this.field_I + (-16 + var3 - -1) / 16;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (-1 != (this.field_I ^ -1)) {
                  break L10;
                } else {
                  if (var2 != 0) {
                    break L10;
                  } else {
                    if (this.field_F) {
                      break L10;
                    } else {
                      stackIn_10_0 = 1;
                      break L9;
                    }
                  }
                }
              }
              stackIn_10_0 = 0;
              break L9;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    final ag i(int param0) {
        ag var2 = super.i(param0);
        if (var2 != null) {
            return var2;
        }
        return (ag) (this);
    }

    boolean j(int param0) {
        this.field_I = this.a(true);
        if (param0 == -15953) {
          if (this.field_I == 0) {
            if (this.field_F) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2) {
        this.a(param0, -param2 + fb.field_f >> -531077887, param1 + -15767, -param0 + mm.field_q >> -1847325791, param2);
        if (param1 != 15767) {
            field_G = (bd) null;
        }
    }

    final static ca a(boolean param0, String param1, long param2, String param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        vk stackIn_5_0 = null;
        la stackIn_7_0 = null;
        uh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = -6 / ((param4 - -59) / 39);
              if (param2 != 0L) {
                break L1;
              } else {
                if (param1 != null) {
                  stackIn_7_0 = new la(param1, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              stackIn_9_0 = new uh(param2, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_5_0 = new vk(param2, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("ul.PB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ca) ((Object) stackIn_7_0);
          } else {
            return (ca) ((Object) stackIn_9_0);
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var6;
        if (param2 >= 42) {
          if (0 != this.field_I) {
            if (this.field_I >= 256) {
              if (param3 != 0) {
                return;
              } else {
                this.b(this.field_m + param0, -238948511, this.field_v + param1);
                super.a(param0, param1, (byte) 49, param3);
                return;
              }
            } else {
              if (q.field_f != null) {
                if (this.field_s <= q.field_f.field_z) {
                  if (q.field_f.field_A >= this.field_x) {
                    sb.a(q.field_f, -119);
                    si.d();
                    this.b(0, -238948511, 0);
                    super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                    return;
                  } else {
                    q.field_f = new bd(this.field_s, this.field_x);
                    sb.a(q.field_f, -119);
                    si.d();
                    this.b(0, -238948511, 0);
                    super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                    return;
                  }
                } else {
                  q.field_f = new bd(this.field_s, this.field_x);
                  sb.a(q.field_f, -119);
                  si.d();
                  this.b(0, -238948511, 0);
                  super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                  eh.b(false);
                  q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                  return;
                }
              } else {
                q.field_f = new bd(this.field_s, this.field_x);
                sb.a(q.field_f, -119);
                si.d();
                this.b(0, -238948511, 0);
                super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                eh.b(false);
                q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var6 = (String) null;
          ul.a(true, (String) null, 48L, (String) null, -128);
          if (0 != this.field_I) {
            if (this.field_I >= 256) {
              if (param3 != 0) {
                return;
              } else {
                this.b(this.field_m + param0, -238948511, this.field_v + param1);
                super.a(param0, param1, (byte) 49, param3);
                return;
              }
            } else {
              if (q.field_f != null) {
                if (this.field_s <= q.field_f.field_z) {
                  if (q.field_f.field_A >= this.field_x) {
                    sb.a(q.field_f, -119);
                    si.d();
                    this.b(0, -238948511, 0);
                    super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                    return;
                  } else {
                    q.field_f = new bd(this.field_s, this.field_x);
                    sb.a(q.field_f, -119);
                    si.d();
                    this.b(0, -238948511, 0);
                    super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                    return;
                  }
                } else {
                  q.field_f = new bd(this.field_s, this.field_x);
                  sb.a(q.field_f, -119);
                  si.d();
                  this.b(0, -238948511, 0);
                  super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                  eh.b(false);
                  q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                  return;
                }
              } else {
                q.field_f = new bd(this.field_s, this.field_x);
                sb.a(q.field_f, -119);
                si.d();
                this.b(0, -238948511, 0);
                super.a(-this.field_m + -param0, -this.field_v + -param1, (byte) 47, param3);
                eh.b(false);
                q.field_f.b(param1 - -this.field_v, param0 - -this.field_m, this.field_I);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static void e(byte param0) {
        ri.a((byte) 126, true, qi.field_G, fj.field_Sb);
        md.field_i = true;
        if (param0 != -25) {
            field_M = (String) null;
        }
    }

    public static void k(int param0) {
        field_P = null;
        field_E = null;
        field_J = null;
        if (param0 != -1847325791) {
          field_G = (bd) null;
          field_G = null;
          field_M = null;
          return;
        } else {
          field_G = null;
          field_M = null;
          return;
        }
    }

    static {
        field_M = "Your email address is used to identify this account";
        field_O = false;
    }
}
