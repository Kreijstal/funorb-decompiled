/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fe extends pi {
    static me field_z;
    static String field_C;
    rm field_y;
    nf field_B;
    int field_o;
    int field_w;
    int field_p;
    static String field_r;
    int field_u;
    String field_s;
    String field_n;
    boolean field_x;
    int field_v;
    int field_t;
    int field_q;
    ad field_A;

    int b(byte param0) {
        if (param0 > -88) {
            return 118;
        }
        return 0;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (-1 == (param3 ^ -1)) {
          if (null != this.field_A) {
            this.field_A.a(12088, param1, (fe) (this), param2, true);
            if (param0 != 4) {
              this.a((byte) -96, -77, 94, -43);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 4) {
              this.a((byte) -96, -77, 94, -43);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 4) {
            this.a((byte) -96, -77, 94, -43);
            return;
          } else {
            return;
          }
        }
    }

    boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 == -79) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("fe.K(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void i(int param0) {
        if (param0 != -5257) {
          this.field_t = 71;
          this.a(this.field_q, -74, this.field_u, this.field_v, this.field_t);
          return;
        } else {
          this.a(this.field_q, -74, this.field_u, this.field_v, this.field_t);
          return;
        }
    }

    fe(String param0, rm param1) {
        this(param0, bd.field_c.field_b, param1);
    }

    public final String toString() {
        return this.a((byte) -70, new Hashtable(), 0, new StringBuilder()).toString();
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, fe param5, int param6) {
        int discarded$2 = 0;
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param4 <= -53) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              discarded$2 = this.b((byte) -86);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("fe.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, byte param2, fe param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var5_int = this.b(gb.field_e, param1, param0, nk.field_w, -102) ? 1 : 0;
              if (param2 >= 49) {
                break L1;
              } else {
                this.field_A = (ad) null;
                break L1;
              }
            }
            L2: {
              stackOut_2_0 = this.field_x;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (var5_int != 0) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            L3: {
              if ((stackIn_5_0 ? 1 : 0) != stackIn_5_1) {
                break L3;
              } else {
                L4: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var5_int == 0) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L4;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L4;
                  }
                }
                ((fe) (this)).field_x = stackIn_9_1 != 0;
                if (this.field_y == null) {
                  break L3;
                } else {
                  if (!(this.field_y instanceof qb)) {
                    break L3;
                  } else {
                    ((qb) ((Object) this.field_y)).a(-14656, (fe) (this), var5_int != 0);
                    break L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("fe.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static pf f(int param0) {
        String var1 = null;
        if (param0 != 0) {
          return (pf) null;
        } else {
          L0: {
            var1 = fc.b((byte) 121);
            if (var1 == null) {
              break L0;
            } else {
              if (var1.indexOf('@') < 0) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new pf(fc.b((byte) 126), j.a((byte) -110));
        }
    }

    final static void e(int param0) {
        int discarded$2 = 0;
        if (param0 != 26313) {
          discarded$2 = fe.a((byte) 55, 'ﾗ', (CharSequence) null);
          kb.field_b = new ik();
          de.field_a.a((byte) -65, (fe) (kb.field_b));
          return;
        } else {
          kb.field_b = new ik();
          de.field_a.a((byte) -65, (fe) (kb.field_b));
          return;
        }
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4 = 0;
        if (!this.k(-91)) {
          if (param0 == -65) {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a((fe) (this), 125);
            } else {
              return false;
            }
          } else {
            fe.l(-56);
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return this.a((fe) (this), 125);
            } else {
              return false;
            }
          }
        } else {
          if (!this.a(param2, (fe) (this), (byte) -79, param1)) {
            if (param0 != -65) {
              fe.l(-56);
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return this.a((fe) (this), 125);
              } else {
                return false;
              }
            } else {
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return this.a((fe) (this), 125);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
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
        try {
          L0: {
            L1: {
              if (this.a(param3, true, param2, param1)) {
                this.a(param1, param3, 34, param2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -70) {
                break L2;
              } else {
                this.field_B = (nf) null;
                break L2;
              }
            }
            stackOut_5_0 = (StringBuilder) (param3);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("fe.SA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param4 < -73) {
          if (param3 >= param1 + this.field_u) {
            if (param2 - -this.field_t <= param0) {
              if (param1 + (this.field_u + this.field_v) > param3) {
                if (this.field_q + (param2 + this.field_t) <= param0) {
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
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void l(int param0) {
        int discarded$0 = 0;
        field_C = null;
        field_z = null;
        field_r = null;
        if (param0 > -48) {
            discarded$0 = fe.a((byte) -5, '', (CharSequence) null);
        }
    }

    void a(int param0, int param1, int param2, int param3, fe param4, int param5) {
        try {
            this.field_w = param5;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "fe.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var5 = 0;
        int var7 = 0;
        ma var8 = null;
        ma var9 = null;
        ma var10 = null;
        ma var11 = null;
        var7 = MinerDisturbance.field_ab;
        this.a(param1, param2, (byte) 53, (fe) (this));
        var5 = this.k(param3 ^ 91) ? 1 : 0;
        if (param0) {
          L0: {
            if (0 == ki.field_n) {
              break L0;
            } else {
              if (var5 != 0) {
                discarded$2 = this.a(param1, ki.field_n, gb.field_e, nk.field_w, (byte) -123, (fe) (this), param2);
                break L0;
              } else {
                L1: {
                  if (-1 == (jk.field_ab ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      if (!this.a(wi.field_w, param1, param3 + 0, m.field_e, jk.field_ab, (fe) (this), param2)) {
                        break L2;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      this.g(4966);
                      break L1;
                    }
                  }
                }
                if (-1 == (ld.field_B ^ -1)) {
                  if (-1 == (nb.field_f ^ -1)) {
                    nb.field_f = ld.field_B;
                    if (param3 == 0) {
                      tg.a(-95, this.h(-27867));
                      return param0;
                    } else {
                      return true;
                    }
                  } else {
                    this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                    var9 = j.field_d;
                    if (var9 != null) {
                      if (!(var9.field_y instanceof cd)) {
                        j.field_d = null;
                        nb.field_f = ld.field_B;
                        if (param3 != 0) {
                          return true;
                        } else {
                          tg.a(-95, this.h(-27867));
                          return param0;
                        }
                      } else {
                        ((cd) ((Object) var9.field_y)).a(27055, (se) null, var9);
                        j.field_d = null;
                        nb.field_f = ld.field_B;
                        if (param3 != 0) {
                          return true;
                        } else {
                          tg.a(-95, this.h(-27867));
                          return param0;
                        }
                      }
                    } else {
                      nb.field_f = ld.field_B;
                      if (param3 != 0) {
                        return true;
                      } else {
                        tg.a(-95, this.h(-27867));
                        return param0;
                      }
                    }
                  }
                } else {
                  nb.field_f = ld.field_B;
                  if (param3 != 0) {
                    return true;
                  } else {
                    tg.a(-95, this.h(-27867));
                    return param0;
                  }
                }
              }
            }
          }
          L3: {
            if (-1 == (jk.field_ab ^ -1)) {
              break L3;
            } else {
              L4: {
                if (!this.a(wi.field_w, param1, param3 + 0, m.field_e, jk.field_ab, (fe) (this), param2)) {
                  break L4;
                } else {
                  param0 = false;
                  if (var7 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (var5 == 0) {
                break L3;
              } else {
                L5: {
                  this.g(4966);
                  if (-1 != (ld.field_B ^ -1)) {
                    break L5;
                  } else {
                    if (-1 == (nb.field_f ^ -1)) {
                      break L5;
                    } else {
                      this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                      var10 = j.field_d;
                      if (var10 != null) {
                        if (!(var10.field_y instanceof cd)) {
                          j.field_d = null;
                          nb.field_f = ld.field_B;
                          if (param3 == 0) {
                            tg.a(-95, this.h(-27867));
                            return param0;
                          } else {
                            return true;
                          }
                        } else {
                          ((cd) ((Object) var10.field_y)).a(27055, (se) null, var10);
                          j.field_d = null;
                          nb.field_f = ld.field_B;
                          if (param3 == 0) {
                            tg.a(-95, this.h(-27867));
                            return param0;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        nb.field_f = ld.field_B;
                        if (param3 == 0) {
                          tg.a(-95, this.h(-27867));
                          return param0;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
                nb.field_f = ld.field_B;
                if (param3 == 0) {
                  tg.a(-95, this.h(-27867));
                  return param0;
                } else {
                  return true;
                }
              }
            }
          }
          L6: {
            if (-1 != (ld.field_B ^ -1)) {
              break L6;
            } else {
              if (-1 == (nb.field_f ^ -1)) {
                break L6;
              } else {
                this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                var11 = j.field_d;
                if (var11 != null) {
                  if (!(var11.field_y instanceof cd)) {
                    j.field_d = null;
                    nb.field_f = ld.field_B;
                    if (param3 == 0) {
                      tg.a(-95, this.h(-27867));
                      return param0;
                    } else {
                      return true;
                    }
                  } else {
                    ((cd) ((Object) var11.field_y)).a(27055, (se) null, var11);
                    j.field_d = null;
                    nb.field_f = ld.field_B;
                    if (param3 == 0) {
                      tg.a(-95, this.h(-27867));
                      return param0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  nb.field_f = ld.field_B;
                  if (param3 == 0) {
                    tg.a(-95, this.h(-27867));
                    return param0;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          nb.field_f = ld.field_B;
          if (param3 == 0) {
            tg.a(-95, this.h(-27867));
            return param0;
          } else {
            return true;
          }
        } else {
          if (var5 != 0) {
            if (0 != jk.field_ab) {
              this.g(4966);
              if (var7 != 0) {
                L7: {
                  if (0 == ki.field_n) {
                    break L7;
                  } else {
                    if (var5 != 0) {
                      discarded$3 = this.a(param1, ki.field_n, gb.field_e, nk.field_w, (byte) -123, (fe) (this), param2);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-1 == (jk.field_ab ^ -1)) {
                    break L8;
                  } else {
                    L9: {
                      if (!this.a(wi.field_w, param1, param3 + 0, m.field_e, jk.field_ab, (fe) (this), param2)) {
                        break L9;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L8;
                    } else {
                      this.g(4966);
                      break L8;
                    }
                  }
                }
                L10: {
                  if (-1 != (ld.field_B ^ -1)) {
                    break L10;
                  } else {
                    if (-1 == (nb.field_f ^ -1)) {
                      break L10;
                    } else {
                      this.a(param2, gb.field_e, nk.field_w, param1, (fe) (this), 0);
                      var8 = j.field_d;
                      if (var8 != null) {
                        if (!(var8.field_y instanceof cd)) {
                          j.field_d = null;
                          break L10;
                        } else {
                          ((cd) ((Object) var8.field_y)).a(27055, (se) null, var8);
                          j.field_d = null;
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                nb.field_f = ld.field_B;
                if (param3 != 0) {
                  return true;
                } else {
                  tg.a(-95, this.h(-27867));
                  return param0;
                }
              } else {
                nb.field_f = ld.field_B;
                if (param3 != 0) {
                  return true;
                } else {
                  tg.a(-95, this.h(-27867));
                  return param0;
                }
              }
            } else {
              nb.field_f = ld.field_B;
              if (param3 != 0) {
                return true;
              } else {
                tg.a(-95, this.h(-27867));
                return param0;
              }
            }
          } else {
            nb.field_f = ld.field_B;
            if (param3 != 0) {
              return true;
            } else {
              tg.a(-95, this.h(-27867));
              return param0;
            }
          }
        }
    }

    boolean a(fe param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param1 > 119) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_C = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("fe.UA(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        var4 = this.b((byte) -92);
        var5 = -64 % ((-61 - param2) / 51);
        var6_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var6_int) {
              break L1;
            } else {
              this.a((byte) 4, param0, param1, var6_int);
              var6_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var6 = a.a(true);
            if (var6 != null) {
              bd.field_c.a(ng.field_l, lj.field_q, var6, (byte) 49);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final boolean a(StringBuilder param0, boolean param1, int param2, Hashtable param3) {
        pf discarded$6 = null;
        StringBuilder discarded$7 = null;
        Object discarded$8 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                discarded$6 = fe.f(63);
                break L1;
              }
            }
            if (param3.containsKey(this)) {
              discarded$7 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$8 = param3.put(this, this);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("fe.KA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        boolean discarded$2 = false;
        if (param1 >= -33) {
          discarded$2 = this.a(99, -116, 119, 127, (byte) -73, (fe) null, 7);
          this.field_v = param3;
          this.field_q = param0;
          this.field_u = param2;
          this.field_t = param4;
          return;
        } else {
          this.field_v = param3;
          this.field_q = param0;
          this.field_u = param2;
          this.field_t = param4;
          return;
        }
    }

    boolean k(int param0) {
        int var2 = -93 / ((-33 - param0) / 45);
        return false;
    }

    final static boolean j(int param0) {
        int var1 = 95 % ((param0 - 10) / 57);
        return 250 < mn.field_x ? true : false;
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        char stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param0 > 26) {
                break L1;
              } else {
                field_r = (String) null;
                break L1;
              }
            }
            var4 = param2.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var4 <= var5) {
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L3;
                } else {
                  stackOut_5_0 = param1;
                  stackIn_10_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var6 != 0) {
                    break L3;
                  } else {
                    L4: {
                      if (stackIn_6_0 != param2.charAt(var5)) {
                        break L4;
                      } else {
                        var3_int++;
                        break L4;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("fe.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    String h(int param0) {
        if (param0 != -27867) {
            return (String) null;
        }
        if (!this.field_x) {
            return null;
        }
        return this.field_n;
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        boolean discarded$12 = false;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              discarded$9 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_u).append(",").append(this.field_t).append(" ").append(this.field_v).append("x").append(this.field_q);
              if (null != this.field_s) {
                discarded$10 = param1.append(" text=\"").append(this.field_s).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_x) {
                discarded$11 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 == 34) {
                break L3;
              } else {
                discarded$12 = fe.j(27);
                break L3;
              }
            }
            L4: {
              if (this.k(48)) {
                discarded$13 = param1.append(" focused");
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (null != this.field_A) {
                L6: {
                  discarded$14 = param1.append(" renderer=");
                  if (!(this.field_A instanceof fe)) {
                    break L6;
                  } else {
                    param1 = this.a((byte) -70, param0, 1 + param3, param1);
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                discarded$15 = param1.append(this.field_A);
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (null != this.field_y) {
                L8: {
                  discarded$16 = param1.append(" listener=");
                  if (!(this.field_y instanceof fe)) {
                    break L8;
                  } else {
                    param1 = this.a((byte) -70, param0, param3 + 1, param1);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                discarded$17 = param1.append(this.field_y);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("fe.MA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void g(int param0) {
        if (param0 != 4966) {
            this.field_s = (String) null;
        }
    }

    protected fe() {
        this.field_p = 0;
        this.field_o = 0;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
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
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.a((Hashtable) null, (StringBuilder) null, 107, -94);
                break L1;
              }
            }
            if (this.b(param3, param6, param1, param0, -120)) {
              this.field_w = param4;
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("fe.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    fe(String param0, ad param1, rm param2) {
        RuntimeException runtimeException = null;
        cf var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
        this.field_p = 0;
        this.field_o = 0;
        try {
          L0: {
            L1: {
              this.field_A = param1;
              this.field_y = param2;
              this.field_s = param0;
              if (!(this.field_A instanceof cf)) {
                break L1;
              } else {
                var4 = (cf) ((Object) this.field_A);
                this.field_v = var4.a(14463, (fe) (this));
                this.field_q = var4.b(30, (fe) (this));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("fe.<init>(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    fe(int param0, int param1, int param2, int param3, ad param4, rm param5) {
        this.field_p = 0;
        this.field_o = 0;
        try {
            this.field_u = param0;
            this.field_v = param2;
            this.field_y = param5;
            this.field_t = param1;
            this.field_q = param3;
            this.field_A = param4;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "fe.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Connection lost. <%0>";
        field_C = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
