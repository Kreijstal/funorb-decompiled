/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lg extends gm {
    static java.applet.Applet field_B;
    private boolean field_y;
    boolean field_x;
    boolean field_A;
    private boolean field_z;

    boolean a(int param0, gm param1, char param2, int param3) {
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
              if (!this.g(2)) {
                break L1;
              } else {
                L2: {
                  if ((param0 ^ -1) == -85) {
                    break L2;
                  } else {
                    if (-84 == (param0 ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.a(1, -1, -1, -1);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            var5_int = 124 / ((-33 - param3) / 57);
            stackIn_7_0 = 0;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("lg.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
            this.g(63);
            return this.field_z;
        }
        return this.field_z;
    }

    final void c(byte param0) {
        if (this.field_z) {
          this.field_z = false;
          if (null != this.field_t) {
            if (!(this.field_t instanceof ek)) {
              if (param0 < 89) {
                this.c((byte) 22);
                return;
              } else {
                return;
              }
            } else {
              ((ek) ((Object) this.field_t)).a(14381, this.field_z, (gm) (this));
              if (param0 < 89) {
                this.c((byte) 22);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 < 89) {
              this.c((byte) 22);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 < 89) {
            this.c((byte) 22);
            return;
          } else {
            return;
          }
        }
    }

    lg(String param0, ca param1) {
        this(param0, ah.field_c.field_k, param1);
    }

    lg(String param0, el param1, ca param2) {
        super(param0, param1, param2);
        this.field_y = true;
        this.field_z = false;
        this.field_x = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        Hashtable var6;
        if (param2 == -1) {
          if (null != this.field_t) {
            if (!(this.field_t instanceof ng)) {
              return;
            } else {
              ((ng) ((Object) this.field_t)).a((byte) -116, (lg) (this), param0, param1, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = (Hashtable) null;
          this.a((StringBuilder) null, (byte) -119, (Hashtable) null, -87);
          if (null == this.field_t) {
            return;
          } else {
            L0: {
              if (this.field_t instanceof ng) {
                ((ng) ((Object) this.field_t)).a((byte) -116, (lg) (this), param0, param1, param3);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        gm var4 = null;
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
              if (!this.field_x) {
                break L1;
              } else {
                if (!this.field_y) {
                  break L1;
                } else {
                  L2: {
                    param0.c((byte) 91);
                    this.field_z = true;
                    if (null == this.field_t) {
                      break L2;
                    } else {
                      if (!(this.field_t instanceof ek)) {
                        break L2;
                      } else {
                        ((ek) ((Object) this.field_t)).a(14381, this.field_z, (gm) (this));
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!param1) {
                      break L3;
                    } else {
                      var4 = (gm) null;
                      this.a(93, 79, 114, (byte) -114, (gm) null, -45);
                      break L3;
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

            stackIn_14_1 = new StringBuilder().append("lg.JA(");

            if (param0 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        try {
            if (this.field_t != null && this.field_t instanceof ck) {
                ((ck) ((Object) this.field_t)).a(param1, (lg) (this), param2, param5, param0, -710);
            }
            if (param3 < 109) {
                gm var8 = (gm) null;
                this.a((gm) null, true);
            }
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "lg.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void h(int param0) {
        if (op.field_i == 10) {
          gq.a(114);
          op.field_i = 11;
          mh.field_g = true;
          if (param0 < -98) {
            return;
          } else {
            field_B = (java.applet.Applet) null;
            return;
          }
        } else {
          if (s.h((byte) 124)) {
            mh.field_g = true;
            if (param0 >= -98) {
              field_B = (java.applet.Applet) null;
              return;
            } else {
              return;
            }
          } else {
            gq.a(114);
            op.field_i = 11;
            mh.field_g = true;
            if (param0 < -98) {
              return;
            } else {
              field_B = (java.applet.Applet) null;
              return;
            }
          }
        }
    }

    void a(int param0, gm param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(120, param1, param2, param3);
              var5_int = 5 % ((param0 - -28) / 43);
              if (this.field_l == 0) {
                break L1;
              } else {
                if (this.field_l == ul.field_d) {
                  break L1;
                } else {
                  L2: {
                    if (!this.a(k.field_e, n.field_t, param3, param2, 119)) {
                      break L2;
                    } else {
                      if (-1 != (ul.field_d ^ -1)) {
                        break L2;
                      } else {
                        this.a(this.field_l, -param2 + k.field_e, -1, n.field_t - param3);
                        break L2;
                      }
                    }
                  }
                  this.a(param2, param3, n.field_t, (byte) 120, param1, k.field_e);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("lg.P(").append(param0).append(',');

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
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void i(int param0) {
        field_B = null;
        if (param0 < 2) {
            field_B = (java.applet.Applet) null;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        RuntimeException var8 = null;
        int stackIn_7_0 = 0;
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
              if (!this.field_x) {
                break L1;
              } else {
                if (this.a(param3, param4, param1, param2, 81)) {
                  L2: {
                    this.a(param5, false);
                    this.field_l = param0;
                    if (null == this.field_t) {
                      break L2;
                    } else {
                      if (!(this.field_t instanceof ck)) {
                        break L2;
                      } else {
                        ((ck) ((Object) this.field_t)).a(param0, param4, param3, param2, (lg) (this), -78, param1);
                        break L2;
                      }
                    }
                  }
                  stackIn_7_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param6 > 5) {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_A = false;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("lg.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static bp a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        bp var6 = null;
        bp stackIn_4_0 = null;
        bp stackIn_7_0 = null;
        bp stackIn_11_0 = null;
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
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if (-1 != var2_int) {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(1 + var2_int);
                    var5 = 15 / ((param1 - 64) / 33);
                    var6 = ka.a(var3, (byte) -10);
                    if (var6 != null) {
                      stackIn_11_0 = (bp) (var6);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return fi.a((byte) -97, var4);
                    }
                  } else {
                    stackIn_7_0 = oj.field_l;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = rh.field_c;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("lg.J(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 117) {
                break L1;
              } else {
                this.field_y = false;
                break L1;
              }
            }
            L2: {
              if (this.a(-31866, param0, param2, param3)) {
                L3: {
                  this.a(param0, param3, true, param2);
                  if (this.field_A) {
                    discarded$2 = param0.append(" active");
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (this.field_x) {
                  break L2;
                } else {
                  discarded$3 = param0.append(" disabled");
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackIn_10_0 = (StringBuilder) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("lg.O(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    protected lg() {
        this.field_y = true;
        this.field_z = false;
        this.field_x = true;
        this.field_q = ah.field_c.field_a;
    }

    static {
    }
}
