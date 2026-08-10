/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pj extends ca {
    int field_v;
    String field_i;
    ag field_h;
    int field_s;
    static String[] field_o;
    boolean field_t;
    static String field_w;
    int field_m;
    int field_q;
    int field_f;
    String field_l;
    int field_r;
    static hj[] field_u;
    static int field_p;
    static String field_k;
    dm field_g;
    td field_j;
    int field_n;

    public static void e(int param0) {
        field_u = null;
        if (param0 >= -66) {
          field_k = (String) null;
          field_w = null;
          field_k = null;
          field_o = null;
          return;
        } else {
          field_w = null;
          field_k = null;
          field_o = null;
          return;
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param0 == -77) {
              L1: {
                var5_int = this.a((byte) 3, ua.field_a, vl.field_d, param3, param2) ? 1 : 0;
                if (var5_int != 0) {
                  stackIn_5_0 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (stackIn_5_0 != (this.field_t ? 1 : 0)) {
                    break L3;
                  } else {
                    L4: {
                      stackIn_8_0 = this;

                      if (var5_int == 0) {
                        stackIn_9_0 = this;
                        stackIn_9_1 = 0;
                        break L4;
                      } else {
                        stackIn_9_0 = this;
                        stackIn_9_1 = 1;
                        break L4;
                      }
                    }
                    ((pj) (this)).field_t = stackIn_9_1 != 0;
                    if (null == this.field_h) {
                      break L3;
                    } else {
                      if (!(this.field_h instanceof cl)) {
                        break L3;
                      } else {
                        ((cl) ((Object) this.field_h)).a((byte) 43, var5_int != 0, (pj) (this));
                        break L2;
                      }
                    }
                  }
                }
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("pj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = OrbDefence.field_D ? 1 : 0;
        var4 = this.f(param0 + -20680);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              this.a(param1, var5_int, param0 + 1048493, param2);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = wj.g(param0 ^ -16392);
            if (var5 != null) {
              mb.field_a.a(sl.field_ab, uk.field_c, 0, var5);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 != 82) {
            field_o = (String[]) null;
            return;
          } else {
            return;
          }
        }
    }

    String g(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        if (param0 != -8235) {
          L0: {
            this.field_s = -7;
            if (this.field_t) {
              stackIn_8_0 = this.field_i;
              break L0;
            } else {
              stackIn_8_0 = null;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (this.field_t) {
              stackIn_4_0 = this.field_i;
              break L1;
            } else {
              stackIn_4_0 = null;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void c(int param0) {
        this.a(this.field_s, this.field_n, this.field_r, (byte) -90, this.field_m);
        if (param0 != -26385) {
            this.field_m = -40;
        }
    }

    public final String toString() {
        return this.a((byte) -46, new Hashtable(), 0, new StringBuilder()).toString();
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, pj param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("pj.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    void h(int param0) {
        if (param0 != 0) {
            this.field_n = -29;
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("pj.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -115) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            if (this.a((byte) 3, param5, param4, param6, param3)) {
              this.field_v = param2;
              stackIn_5_0 = 0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("pj.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_5_0 != 0;
    }

    void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        try {
            this.field_v = 0;
            if (param2 >= -91) {
                this.h(-66);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pj.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    pj(String param0, ag param1) {
        this(param0, mb.field_a.field_f, param1);
    }

    boolean d(int param0) {
        if (param0 != -81) {
            this.field_f = 35;
            return false;
        }
        return false;
    }

    final boolean a(char param0, boolean param1, int param2) {
        int var4;
        if (!this.d(-81)) {
          var4 = param2;
          if ((var4 ^ -1) != -81) {
            if (!param1) {
              this.field_s = 4;
              return false;
            } else {
              return false;
            }
          } else {
            return this.a(-81, (pj) (this));
          }
        } else {
          if (!this.a(param0, param2, (pj) (this), 0)) {
            var4 = param2;
            if ((var4 ^ -1) != -81) {
              if (param1) {
                return false;
              } else {
                this.field_s = 4;
                return false;
              }
            } else {
              return this.a(-81, (pj) (this));
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_s).append(",").append(this.field_n).append(" ").append(this.field_m).append("x").append(this.field_r);
              if (this.field_l != null) {
                discarded$1 = param3.append(" text=\"").append(this.field_l).append('"');
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_t) {
                discarded$2 = param3.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.d(-81)) {
                break L3;
              } else {
                discarded$3 = param3.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != this.field_j) {
                L5: {
                  discarded$4 = param3.append(" renderer=");
                  if (!(this.field_j instanceof pj)) {
                    break L5;
                  } else {
                    param3 = this.a((byte) -85, param2, 1 + param0, param3);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                discarded$5 = param3.append(this.field_j);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (param1 <= -88) {
                break L6;
              } else {
                pj.a(-49, (hj) null);
                break L6;
              }
            }
            L7: {
              if (this.field_h != null) {
                L8: {
                  discarded$6 = param3.append(" listener=");
                  if (!(this.field_h instanceof pj)) {
                    break L8;
                  } else {
                    param3 = this.a((byte) -32, param2, param0 - -1, param3);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                discarded$7 = param3.append(this.field_h);
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
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("pj.HB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == 1048575) {
          if (param1 == 0) {
            if (this.field_j == null) {
              return;
            } else {
              this.field_j.a(param0, param3, (pj) (this), -4394, true);
              return;
            }
          } else {
            return;
          }
        } else {
          this.a(86, false, true, -95);
          if (param1 == 0) {
            if (this.field_j == null) {
              return;
            } else {
              this.field_j.a(param0, param3, (pj) (this), -4394, true);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, hj param1) {
        try {
            if (param0 != 0) {
                field_o = (String[]) null;
            }
            lc.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pj.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    int f(int param0) {
        if (param0 != -20598) {
            this.field_h = (ag) null;
            return 0;
        }
        return 0;
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        if (param0 == 3) {
          if (param1 >= param4 + this.field_s) {
            if (param2 < param3 - -this.field_n) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param1 >= this.field_m + (this.field_s + param4)) {
                    break L1;
                  } else {
                    if (param2 >= this.field_r + (param3 - -this.field_n)) {
                      break L1;
                    } else {
                      stackIn_18_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          this.field_v = 72;
          if (param1 >= param4 + this.field_s) {
            if (param2 >= param3 - -this.field_n) {
              if (param1 < this.field_m + (this.field_s + param4)) {
                if (param2 >= this.field_r + (param3 - -this.field_n)) {
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
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -108 / ((43 - param0) / 51);
              var3 = param1.getParameter("username");
              if (var3 == null) {
                break L1;
              } else {
                var4 = (CharSequence) ((Object) var3);
                if (-1L != (bk.a(127, var4) ^ -1L)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pj.AB(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, byte param3, int param4) {
        this.field_r = param2;
        this.field_m = param4;
        this.field_n = param1;
        if (param3 != -90) {
            return;
        }
        this.field_s = param0;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        dd var6;
        int var7;
        dd var8;
        dd var9;
        dd var10;
        dd var11;
        dd var12;
        dd var14;
        dd var15;
        dd var16;
        dd var17;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (!param1) {
          this.a((byte) -77, (pj) (this), param3, param0);
          var5 = this.d(-81) ? 1 : 0;
          if (!param2) {
            L0: {
              if (var5 == 0) {
                break L0;
              } else {
                if (-1 != (gi.field_e ^ -1)) {
                  this.h(0);
                  break L0;
                } else {
                  ud.field_j = of.field_G;
                  fg.a(101, this.g(-8235));
                  return param2;
                }
              }
            }
            ud.field_j = of.field_G;
            fg.a(101, this.g(-8235));
            return param2;
          } else {
            if (of.field_K != 0) {
              if (var5 != 0) {
                this.a(param1, param3, param0, of.field_K, ua.field_a, vl.field_d, (pj) (this));
                if (-1 != (gi.field_e ^ -1)) {
                  L1: {
                    if (this.a((byte) -120, (pj) (this), gi.field_e, param3, bg.field_c, ig.field_fb, param0)) {
                      param2 = false;
                      break L1;
                    } else {
                      if (var5 == 0) {
                        break L1;
                      } else {
                        this.h(0);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          L2: {
                            param2 = false;
                            if (of.field_G != 0) {
                              break L2;
                            } else {
                              if (ud.field_j != 0) {
                                L3: {
                                  this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                                  var16 = al.field_c;
                                  var6 = var16;
                                  if (var16 == null) {
                                    break L3;
                                  } else {
                                    L4: {
                                      if (var16.field_h instanceof wk) {
                                        ((wk) ((Object) var16.field_h)).a(-114, var16, (mm) null);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    al.field_c = null;
                                    break L3;
                                  }
                                }
                                if (var7 == 0) {
                                  break L2;
                                } else {
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    if (-1 != (gi.field_e ^ -1)) {
                                      this.h(0);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                ud.field_j = of.field_G;
                                fg.a(101, this.g(-8235));
                                return param2;
                              }
                            }
                          }
                          ud.field_j = of.field_G;
                          fg.a(101, this.g(-8235));
                          return param2;
                        }
                      }
                    }
                  }
                  if (of.field_G == 0) {
                    if (ud.field_j != 0) {
                      L5: {
                        this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                        var17 = al.field_c;
                        var6 = var17;
                        if (var17 == null) {
                          break L5;
                        } else {
                          L6: {
                            if (var17.field_h instanceof wk) {
                              ((wk) ((Object) var17.field_h)).a(-114, var17, (mm) null);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          al.field_c = null;
                          break L5;
                        }
                      }
                      if (var7 != 0) {
                        L7: {
                          if (var5 == 0) {
                            break L7;
                          } else {
                            if (-1 != (gi.field_e ^ -1)) {
                              this.h(0);
                              break L7;
                            } else {
                              ud.field_j = of.field_G;
                              fg.a(101, this.g(-8235));
                              return param2;
                            }
                          }
                        }
                        ud.field_j = of.field_G;
                        fg.a(101, this.g(-8235));
                        return param2;
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, this.g(-8235));
                        return param2;
                      }
                    } else {
                      ud.field_j = of.field_G;
                      fg.a(101, this.g(-8235));
                      return param2;
                    }
                  } else {
                    ud.field_j = of.field_G;
                    fg.a(101, this.g(-8235));
                    return param2;
                  }
                } else {
                  L8: {
                    if (of.field_G != 0) {
                      break L8;
                    } else {
                      if (ud.field_j != 0) {
                        L9: {
                          this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                          var15 = al.field_c;
                          var6 = var15;
                          if (var15 == null) {
                            break L9;
                          } else {
                            L10: {
                              if (var15.field_h instanceof wk) {
                                ((wk) ((Object) var15.field_h)).a(-114, var15, (mm) null);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            al.field_c = null;
                            break L9;
                          }
                        }
                        if (var7 == 0) {
                          break L8;
                        } else {
                          if (var5 == 0) {
                            break L8;
                          } else {
                            if (-1 != (gi.field_e ^ -1)) {
                              this.h(0);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, this.g(-8235));
                        return param2;
                      }
                    }
                  }
                  ud.field_j = of.field_G;
                  fg.a(101, this.g(-8235));
                  return param2;
                }
              } else {
                if (-1 != (gi.field_e ^ -1)) {
                  L11: {
                    if (this.a((byte) -120, (pj) (this), gi.field_e, param3, bg.field_c, ig.field_fb, param0)) {
                      param2 = false;
                      break L11;
                    } else {
                      if (var5 == 0) {
                        break L11;
                      } else {
                        this.h(0);
                        if (var7 == 0) {
                          break L11;
                        } else {
                          param2 = false;
                          if (of.field_G == 0) {
                            if (ud.field_j != 0) {
                              L12: {
                                this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                                var12 = al.field_c;
                                if (var12 == null) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (var12.field_h instanceof wk) {
                                      ((wk) ((Object) var12.field_h)).a(-114, var12, (mm) null);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  al.field_c = null;
                                  break L12;
                                }
                              }
                              if (var7 != 0) {
                                if (var5 != 0) {
                                  if (-1 == (gi.field_e ^ -1)) {
                                    ud.field_j = of.field_G;
                                    fg.a(101, this.g(-8235));
                                    return param2;
                                  } else {
                                    this.h(0);
                                    ud.field_j = of.field_G;
                                    fg.a(101, this.g(-8235));
                                    return param2;
                                  }
                                } else {
                                  ud.field_j = of.field_G;
                                  fg.a(101, this.g(-8235));
                                  return param2;
                                }
                              } else {
                                ud.field_j = of.field_G;
                                fg.a(101, this.g(-8235));
                                return param2;
                              }
                            } else {
                              ud.field_j = of.field_G;
                              fg.a(101, this.g(-8235));
                              return param2;
                            }
                          } else {
                            ud.field_j = of.field_G;
                            fg.a(101, this.g(-8235));
                            return param2;
                          }
                        }
                      }
                    }
                  }
                  if (of.field_G == 0) {
                    if (ud.field_j != 0) {
                      L14: {
                        this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                        var14 = al.field_c;
                        if (var14 == null) {
                          break L14;
                        } else {
                          L15: {
                            if (var14.field_h instanceof wk) {
                              ((wk) ((Object) var14.field_h)).a(-114, var14, (mm) null);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          al.field_c = null;
                          break L14;
                        }
                      }
                      if (var7 != 0) {
                        if (var5 != 0) {
                          if (-1 != (gi.field_e ^ -1)) {
                            this.h(0);
                            ud.field_j = of.field_G;
                            fg.a(101, this.g(-8235));
                            return param2;
                          } else {
                            ud.field_j = of.field_G;
                            fg.a(101, this.g(-8235));
                            return param2;
                          }
                        } else {
                          ud.field_j = of.field_G;
                          fg.a(101, this.g(-8235));
                          return param2;
                        }
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, this.g(-8235));
                        return param2;
                      }
                    } else {
                      ud.field_j = of.field_G;
                      fg.a(101, this.g(-8235));
                      return param2;
                    }
                  } else {
                    ud.field_j = of.field_G;
                    fg.a(101, this.g(-8235));
                    return param2;
                  }
                } else {
                  if (of.field_G == 0) {
                    if (ud.field_j != 0) {
                      L16: {
                        this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                        var11 = al.field_c;
                        if (var11 == null) {
                          break L16;
                        } else {
                          L17: {
                            if (var11.field_h instanceof wk) {
                              ((wk) ((Object) var11.field_h)).a(-114, var11, (mm) null);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          al.field_c = null;
                          break L16;
                        }
                      }
                      L18: {
                        if (var7 == 0) {
                          break L18;
                        } else {
                          if (var5 == 0) {
                            break L18;
                          } else {
                            if (-1 != (gi.field_e ^ -1)) {
                              this.h(0);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      ud.field_j = of.field_G;
                      fg.a(101, this.g(-8235));
                      return param2;
                    } else {
                      ud.field_j = of.field_G;
                      fg.a(101, this.g(-8235));
                      return param2;
                    }
                  } else {
                    ud.field_j = of.field_G;
                    fg.a(101, this.g(-8235));
                    return param2;
                  }
                }
              }
            } else {
              if (-1 != (gi.field_e ^ -1)) {
                L19: {
                  if (this.a((byte) -120, (pj) (this), gi.field_e, param3, bg.field_c, ig.field_fb, param0)) {
                    param2 = false;
                    break L19;
                  } else {
                    if (var5 == 0) {
                      break L19;
                    } else {
                      this.h(0);
                      if (var7 == 0) {
                        break L19;
                      } else {
                        param2 = false;
                        if (of.field_G == 0) {
                          if (ud.field_j == 0) {
                            ud.field_j = of.field_G;
                            fg.a(101, this.g(-8235));
                            return param2;
                          } else {
                            L20: {
                              this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                              var9 = al.field_c;
                              if (var9 == null) {
                                break L20;
                              } else {
                                L21: {
                                  if (var9.field_h instanceof wk) {
                                    ((wk) ((Object) var9.field_h)).a(-114, var9, (mm) null);
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                al.field_c = null;
                                break L20;
                              }
                            }
                            L22: {
                              if (var7 == 0) {
                                break L22;
                              } else {
                                if (var5 == 0) {
                                  break L22;
                                } else {
                                  if (-1 != (gi.field_e ^ -1)) {
                                    this.h(0);
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            ud.field_j = of.field_G;
                            fg.a(101, this.g(-8235));
                            return param2;
                          }
                        } else {
                          ud.field_j = of.field_G;
                          fg.a(101, this.g(-8235));
                          return param2;
                        }
                      }
                    }
                  }
                }
                if (of.field_G == 0) {
                  if (ud.field_j != 0) {
                    L23: {
                      this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                      var10 = al.field_c;
                      if (var10 == null) {
                        break L23;
                      } else {
                        L24: {
                          if (var10.field_h instanceof wk) {
                            ((wk) ((Object) var10.field_h)).a(-114, var10, (mm) null);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        al.field_c = null;
                        break L23;
                      }
                    }
                    if (var7 != 0) {
                      if (var5 != 0) {
                        if (-1 == (gi.field_e ^ -1)) {
                          ud.field_j = of.field_G;
                          fg.a(101, this.g(-8235));
                          return param2;
                        } else {
                          this.h(0);
                          ud.field_j = of.field_G;
                          fg.a(101, this.g(-8235));
                          return param2;
                        }
                      } else {
                        ud.field_j = of.field_G;
                        fg.a(101, this.g(-8235));
                        return param2;
                      }
                    } else {
                      ud.field_j = of.field_G;
                      fg.a(101, this.g(-8235));
                      return param2;
                    }
                  } else {
                    ud.field_j = of.field_G;
                    fg.a(101, this.g(-8235));
                    return param2;
                  }
                } else {
                  ud.field_j = of.field_G;
                  fg.a(101, this.g(-8235));
                  return param2;
                }
              } else {
                if (of.field_G == 0) {
                  if (ud.field_j == 0) {
                    ud.field_j = of.field_G;
                    fg.a(101, this.g(-8235));
                    return param2;
                  } else {
                    L25: {
                      this.a(param0, ua.field_a, (byte) -98, (pj) (this), param3, vl.field_d);
                      var8 = al.field_c;
                      if (var8 == null) {
                        break L25;
                      } else {
                        L26: {
                          if (var8.field_h instanceof wk) {
                            ((wk) ((Object) var8.field_h)).a(-114, var8, (mm) null);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        al.field_c = null;
                        break L25;
                      }
                    }
                    L27: {
                      if (var7 == 0) {
                        break L27;
                      } else {
                        if (var5 == 0) {
                          break L27;
                        } else {
                          if (-1 != (gi.field_e ^ -1)) {
                            this.h(0);
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    ud.field_j = of.field_G;
                    fg.a(101, this.g(-8235));
                    return param2;
                  }
                } else {
                  ud.field_j = of.field_G;
                  fg.a(101, this.g(-8235));
                  return param2;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -81) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.a(-59, (pj) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("pj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -23) {
                break L1;
              } else {
                field_p = 37;
                break L1;
              }
            }
            L2: {
              if (!this.a(9882, param3, param2, param1)) {
                break L2;
              } else {
                this.a(param2, (byte) -116, param1, param3);
                break L2;
              }
            }
            stackIn_5_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("pj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 9882) {
              if (!param3.containsKey(this)) {
                param3.put(this, this);
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("pj.EB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    protected pj() {
        this.field_f = 0;
        this.field_q = 0;
    }

    pj(String param0, td param1, ag param2) {
        rj var4 = null;
        this.field_f = 0;
        this.field_q = 0;
        try {
            this.field_h = param2;
            this.field_l = param0;
            this.field_j = param1;
            if (this.field_j instanceof rj) {
                var4 = (rj) ((Object) this.field_j);
                this.field_m = var4.c((pj) (this), true);
                this.field_r = var4.b((pj) (this), true);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    pj(int param0, int param1, int param2, int param3, td param4, ag param5) {
        this.field_f = 0;
        this.field_q = 0;
        try {
            this.field_r = param3;
            this.field_j = param4;
            this.field_h = param5;
            this.field_n = param1;
            this.field_s = param0;
            this.field_m = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
